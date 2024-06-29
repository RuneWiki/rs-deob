import java.awt.Component;
import java.awt.Font;
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

@OriginalClass("mapview!sa")
public class class37 extends class30 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!sa", name = "q", descriptor = "Lf;")
    public static class10 field510 = class23.method139("Next page", (byte) -89);

    @OriginalMember(owner = "mapview!sa", name = "u", descriptor = "Lf;")
    public static class10 field514 = class23.method139("Skirt Shop", (byte) -72);

    @OriginalMember(owner = "mapview!sa", name = "r", descriptor = "[I")
    public static int[] field511 = new int[128];

    @OriginalMember(owner = "mapview!sa", name = "v", descriptor = "Z")
    public static boolean field515 = false;

    @OriginalMember(owner = "mapview!sa", name = "x", descriptor = "Lf;")
    public static class10 field517 = class23.method139("map", (byte) -95);

    @OriginalMember(owner = "mapview!sa", name = "s", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "mapview!sa", name = "t", descriptor = "Ljava/awt/Font;")
    public static Font field513;

    @OriginalMember(owner = "mapview!sa", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field518;

    @OriginalMember(owner = "mapview!sa", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field519;

    @OriginalMember(owner = "mapview!sa", name = "w", descriptor = "[B")
    public static byte[] field516;

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "(I)V", line = 5)
    public static void method239(int arg0) {
        if (arg0 == 0) {
            field517 = null;
            field514 = null;
            field511 = null;
            field516 = null;
            field510 = null;
            field513 = null;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 27)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!sa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 36)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field519 == arg0) {
            this.field519 = null;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(IIILc;)Z", line = 47)
    public static final boolean method240(int arg0, int arg1, int arg2, class5 arg3) {
        byte[] var4 = arg3.method29(-1, arg0, arg1);
        if (var4 == null) {
            return false;
        } else {
            class25.method147(var4, (byte) -85);
            return arg2 >= -104 ? true : true;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "d", descriptor = "(I)[Lf;", line = 62)
    public static final class10[] method241(int arg0) {
        return arg0 != 0 ? (class10[]) null : new class10[] { class24.field260, class10.field111, class25.field274, class1.field2, class35.field489, class6.field64, class6.field55, class10.field110, class18.field164, class20.field191, class4.field29, class4.field27, class25.field275, class8.field78 };
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 72)
    public final void method195(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 11) {
            this.method191((Component) null, 117, 64, -5);
        }
        this.method243((byte) 41);
        arg0.drawImage(super.field419, arg3, arg2, this);
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Lc;Lf;Lf;B)[Lu;", line = 85)
    public static final class39[] method242(class5 arg0, class10 arg1, class10 arg2, byte arg3) {
        if (arg3 != 15) {
            method242((class5) null, (class10) null, (class10) null, (byte) -63);
        }
        int var4 = arg0.method31(arg2, -116);
        int var5 = arg0.method28(-116, arg1, var4);
        return class41.method256(arg0, var4, (byte) 56, var5);
    }

    @OriginalMember(owner = "mapview!sa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 111)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(B)V", line = 118)
    private final synchronized void method243(byte arg0) {
        if (arg0 < 1) {
            field514 = (class10) null;
        }
        if (this.field519 != null) {
            this.field519.setPixels(0, 0, super.field409, super.field417, this.field518, super.field412, 0, super.field409);
            this.field519.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 133)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field519 = arg0;
        arg0.setDimensions(super.field409, super.field417);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field518);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!sa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 145)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field519 == arg0;
    }

    @OriginalMember(owner = "mapview!sa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 182)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 201)
    public final void method191(Component arg0, int arg1, int arg2, int arg3) {
        super.field412 = new int[arg1 * arg2 - -1];
        super.field409 = arg2;
        super.field417 = arg1;
        if (arg3 != 5706) {
            field510 = (class10) null;
        }
        this.field518 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field419 = arg0.createImage(this);
        this.method243((byte) 62);
        arg0.prepareImage(super.field419, this);
        this.method243((byte) 10);
        arg0.prepareImage(super.field419, this);
        this.method243((byte) 124);
        arg0.prepareImage(super.field419, this);
        this.method192(0);
    }
}
