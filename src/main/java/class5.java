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

@OriginalClass("mapview!c")
public class class5 extends class27 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!c", name = "q", descriptor = "La;")
    public static class1 field50 = class3.method36("Loading )3)3)3", -118);

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "I")
    public static volatile int field49 = 0;

    @OriginalMember(owner = "mapview!c", name = "t", descriptor = "La;")
    public static class1 field53 = class3.method36("Quest Start", -127);

    @OriginalMember(owner = "mapview!c", name = "w", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "mapview!c", name = "s", descriptor = "La;")
    public static class1 field52 = class3.method36("Achievement Start", -108);

    @OriginalMember(owner = "mapview!c", name = "x", descriptor = "La;")
    public static class1 field57 = class3.method36("Legende", -126);

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "mapview!c", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field51;

    @OriginalMember(owner = "mapview!c", name = "u", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field54;

    @OriginalMember(owner = "mapview!c", name = "v", descriptor = "[Ls;")
    public static class34[] field55;

    @OriginalMember(owner = "mapview!c", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 4)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field54 == arg0;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Z)V", line = 11)
    private final synchronized void method43(boolean arg0) {
        if (this.field54 != null) {
            this.field54.setPixels(0, 0, super.field374, super.field383, this.field51, super.field385, 0, super.field374);
            this.field54.imageComplete(2);
            if (arg0) {
                this.requestTopDownLeftRightResend((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "mapview!c", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 26)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!c", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 35)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field54 = arg0;
        arg0.setDimensions(super.field374, super.field383);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field51);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 66)
    public final void method44(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method43(false);
        if (arg1 == -1) {
            arg3.drawImage(super.field376, arg2, arg0, this);
        }
    }

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "(I)V", line = 77)
    public static void method45(int arg0) {
        field57 = null;
        field55 = null;
        field50 = null;
        field52 = null;
        field53 = null;
        if (arg0 != 0) {
            field49 = -19;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 98)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!c", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 110)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 117)
    public final void method46(int arg0, Component arg1, int arg2, int arg3) {
        super.field374 = arg2;
        super.field383 = arg3;
        if (arg0 != -257) {
            method45(33);
        }
        super.field385 = new int[arg2 * arg3 + 1];
        this.field51 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field376 = arg1.createImage(this);
        this.method43(false);
        arg1.prepareImage(super.field376, this);
        this.method43(false);
        arg1.prepareImage(super.field376, this);
        this.method43(false);
        arg1.prepareImage(super.field376, this);
        this.method176((byte) 126);
    }

    @OriginalMember(owner = "mapview!c", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 154)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field54 == arg0) {
            this.field54 = null;
        }
    }
}
