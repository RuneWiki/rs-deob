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

@OriginalClass("mapview!ga")
public class class13 extends class24 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!ga", name = "r", descriptor = "I")
    public static volatile int field102 = 0;

    @OriginalMember(owner = "mapview!ga", name = "o", descriptor = "I")
    public static volatile int field99 = -1;

    @OriginalMember(owner = "mapview!ga", name = "q", descriptor = "Lt;")
    public static class31 field101 = class14.method84(121, "world");

    @OriginalMember(owner = "mapview!ga", name = "n", descriptor = "Li;")
    public static class16 field98;

    @OriginalMember(owner = "mapview!ga", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field100;

    @OriginalMember(owner = "mapview!ga", name = "m", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field97;

    @OriginalMember(owner = "mapview!ga", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 8)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!ga", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 11)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field97 = arg0;
        arg0.setDimensions(super.field212, super.field209);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field100);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(ZIILjava/awt/Component;)Lma;", line = 33)
    public static final class24 method75(boolean arg0, int arg1, int arg2, Component arg3) {
        try {
            Class var4 = Class.forName("k");
            class24 var5 = (class24) var4.newInstance();
            if (!arg0) {
                field99 = 40;
            }
            var5.method76(arg1, -3336, arg3, arg2);
            return var5;
        } catch (Throwable var8) {
            class13 var7 = new class13();
            var7.method76(arg1, -3336, arg3, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(IILjava/awt/Component;I)V", line = 54)
    public final void method76(int arg0, int arg1, Component arg2, int arg3) {
        super.field212 = arg3;
        super.field210 = new int[arg0 * arg3 + 1];
        super.field209 = arg0;
        this.field100 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 == -3336) {
            super.field207 = arg2.createImage(this);
            this.method79(-10306);
            arg2.prepareImage(super.field207, this);
            this.method79(-10306);
            arg2.prepareImage(super.field207, this);
            this.method79(-10306);
            arg2.prepareImage(super.field207, this);
            this.method136(arg1 + 8990);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 81)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!ga", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 92)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field97 == arg0) {
            this.field97 = null;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(B)V", line = 103)
    public static void method77(byte arg0) {
        field101 = null;
        field98 = null;
        int var1 = 65 % ((arg0 - -11) / 47);
    }

    @OriginalMember(owner = "mapview!ga", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 117)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field97 == arg0;
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 124)
    public final void method78(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method79(-10306);
        arg1.drawImage(super.field207, arg3, arg0, this);
        int var5 = 106 % ((arg2 - -3) / 43);
    }

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "(I)V", line = 141)
    private final synchronized void method79(int arg0) {
        if (this.field97 != null) {
            this.field97.setPixels(0, 0, super.field212, super.field209, this.field100, super.field210, 0, super.field212);
            this.field97.imageComplete(2);
            if (arg0 != -10306) {
                field99 = 36;
            }
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 156)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
