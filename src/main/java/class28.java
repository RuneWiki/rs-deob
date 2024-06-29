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

@OriginalClass("mapview!na")
public class class28 extends class9 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!na", name = "q", descriptor = "Lh;")
    public static class15 field355 = class18.method153("Loading ", 1);

    @OriginalMember(owner = "mapview!na", name = "t", descriptor = "Lh;")
    public static class15 field358 = class18.method153("Food Shop", 1);

    @OriginalMember(owner = "mapview!na", name = "r", descriptor = "Lh;")
    public static class15 field356 = class18.method153("null", 1);

    @OriginalMember(owner = "mapview!na", name = "w", descriptor = "Lh;")
    public static class15 field361 = class18.method153("details)3dat", 1);

    @OriginalMember(owner = "mapview!na", name = "x", descriptor = "Lh;")
    public static class15 field362 = class18.method153("Please wait)3)3)3 Rendering Map", 1);

    @OriginalMember(owner = "mapview!na", name = "u", descriptor = "Lh;")
    public static class15 field359 = class18.method153("map", 1);

    @OriginalMember(owner = "mapview!na", name = "s", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "mapview!na", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field360;

    @OriginalMember(owner = "mapview!na", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field363;

    @OriginalMember(owner = "mapview!na", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 8)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(B)[Li;", line = 23)
    public static final class17[] method192(byte arg0) {
        if (arg0 != 59) {
            method194((byte) -61);
        }
        class17[] var1 = new class17[mapview.field15];
        for (int var2 = 0; ~mapview.field15 < ~var2; ++var2) {
            class17 var3 = var1[var2] = new class17();
            var3.field248 = class14.field208[var2];
            var3.field246 = class14.field215[var2];
            var3.field249 = class9.field118[var2];
            var3.field245 = class10.field136[var2];
            byte[] var4 = class13.field192[var2];
            int var5 = var3.field249 * var3.field245;
            var3.field247 = new int[var5];
            for (int var6 = 0; var6 < var5; ++var6) {
                var3.field247[var6] = class21.field294[mapview.method14(255, var4[var6])];
            }
        }
        class12.method96(-94);
        return var1;
    }

    @OriginalMember(owner = "mapview!na", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 74)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field363 = arg0;
        arg0.setDimensions(super.field122, super.field124);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field360);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!na", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 85)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field363 == arg0) {
            this.field363 = null;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 98)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field363 == arg0;
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(B)V", line = 106)
    private final synchronized void method193(byte arg0) {
        if (this.field363 != null) {
            this.field363.setPixels(0, 0, super.field122, super.field124, this.field360, super.field121, 0, super.field122);
            int var2 = -128 / ((-14 - arg0) / 42);
            this.field363.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "(B)V", line = 124)
    public static void method194(byte arg0) {
        field358 = null;
        if (arg0 == -92) {
            field356 = null;
            field359 = null;
            field355 = null;
            field362 = null;
            field361 = null;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(Ljava/awt/Component;ZII)V", line = 144)
    public final void method78(Component arg0, boolean arg1, int arg2, int arg3) {
        super.field122 = arg3;
        super.field124 = arg2;
        super.field121 = new int[arg2 * arg3 + 1];
        this.field360 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field130 = arg0.createImage(this);
        this.method193((byte) 45);
        arg0.prepareImage(super.field130, this);
        this.method193((byte) -87);
        arg0.prepareImage(super.field130, this);
        this.method193((byte) 123);
        arg0.prepareImage(super.field130, this);
        this.method82(arg1);
    }

    @OriginalMember(owner = "mapview!na", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 162)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!na", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 180)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V", line = 184)
    public final void method79(int arg0, byte arg1, Graphics arg2, int arg3) {
        int var5 = -83 % ((-66 - arg1) / 33);
        this.method193((byte) -128);
        arg2.drawImage(super.field130, arg3, arg0, this);
    }
}
