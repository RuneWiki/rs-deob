import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class28 extends class40 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!p", name = "q", descriptor = "Lt;")
    public static class36 field414 = class3.method8(13631, "Fishing Spot");

    @OriginalMember(owner = "mapview!p", name = "p", descriptor = "Z")
    public static boolean field413 = false;

    @OriginalMember(owner = "mapview!p", name = "r", descriptor = "Lt;")
    public static class36 field415 = class3.method8(13631, "Cooking Range");

    @OriginalMember(owner = "mapview!p", name = "v", descriptor = "Lt;")
    public static class36 field419 = class3.method8(13631, "Amulet Shop");

    @OriginalMember(owner = "mapview!p", name = "u", descriptor = "J")
    public static long field418;

    @OriginalMember(owner = "mapview!p", name = "o", descriptor = "Lfa;")
    public static class11 field412;

    @OriginalMember(owner = "mapview!p", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field417;

    @OriginalMember(owner = "mapview!p", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field416;

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "(I)[Lqa;", line = 5)
    public static final class31[] method164(int arg0) {
        class31[] var1 = new class31[class32.field451];
        for (int var2 = arg0; ~class32.field451 < ~var2; ++var2) {
            class31 var3 = new class31();
            var3.field441 = class9.field91[var2];
            var3.field444 = class35.field485[var2];
            var3.field443 = class17.field211[var2];
            var3.field440 = class35.field480[var2];
            int var4 = var3.field443 * var3.field440;
            byte[] var5 = class6.field61[var2];
            var3.field442 = new int[var4];
            for (int var6 = 0; ~var6 > ~var4; ++var6) {
                var3.field442[var6] = class20.field257[class19.method97(var5[var6], 255)];
            }
            var1[var2] = var3;
        }
        class17.method90(-2);
        return var1;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)V", line = 49)
    public static void method165(byte arg0) {
        field419 = null;
        field415 = null;
        field412 = null;
        field414 = null;
        if (arg0 >= -72) {
            field419 = (class36) null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 71)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field416 == arg0) {
            this.field416 = null;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 84)
    public final void method166(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method168(0);
        int var5 = 107 / ((20 - arg3) / 49);
        arg0.drawImage(super.field532, arg1, arg2, this);
    }

    @OriginalMember(owner = "mapview!p", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 103)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field416 = arg0;
        arg0.setDimensions(super.field526, super.field523);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field417);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!p", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 114)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field416 == arg0;
    }

    @OriginalMember(owner = "mapview!p", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 129)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 133)
    public final void method167(int arg0, int arg1, int arg2, Component arg3) {
        super.field523 = arg0;
        super.field522 = new int[arg0 * arg1 - -1];
        super.field526 = arg1;
        this.field417 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field532 = arg3.createImage(this);
        this.method168(0);
        arg3.prepareImage(super.field532, this);
        this.method168(arg2);
        arg3.prepareImage(super.field532, this);
        this.method168(0);
        arg3.prepareImage(super.field532, this);
        this.method261(0);
    }

    @OriginalMember(owner = "mapview!p", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 164)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!p", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 171)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "(I)V", line = 178)
    private final synchronized void method168(int arg0) {
        if (this.field416 != null) {
            this.field416.setPixels(0, 0, super.field526, super.field523, this.field417, super.field522, arg0, super.field526);
            this.field416.imageComplete(2);
        }
    }
}
