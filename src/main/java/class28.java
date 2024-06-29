import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class28 extends class138 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field516 = 0;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field518 = 0;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "Lrf;")
    private static class163 field525 = class53.method392(-53, "Service unavailable)3");

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "Lrf;")
    public static class163 field529 = class53.method392(-56, "(Z");

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "Lrf;")
    public static class163 field530 = field525;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field531;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field514;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public static void method164(int arg0) {
        if (arg0 != 12849) {
            field522 = -35;
        }
        field530 = null;
        field525 = null;
        field529 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method165(Graphics arg0, int arg1, int arg2, int arg3) {
        ++field528;
        this.method168(-101);
        arg0.drawImage(super.field2843, arg1, arg3, this);
        if (arg2 != 8) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method166(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field519;
        if (this.field514 != null) {
            this.field514.setPixels(arg4, arg2, arg1, arg3, this.field531, super.field2848, super.field2844 * arg2 + arg4, super.field2844);
            this.field514.imageComplete(2);
            if (arg0 != 0) {
                field522 = -24;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field526;
    }

    @OriginalMember(owner = "client!cg", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field514 == arg0) {
            this.field514 = null;
        }
        ++field513;
    }

    @OriginalMember(owner = "client!cg", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field532;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lu;Lu;I)V")
    public static final void method167(class184 arg0, class184 arg1, int arg2) {
        class90.field1953 = arg0;
        class77.field1584 = arg1;
        ++field524;
        int var3 = 22 % ((arg2 - 4) / 36);
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
    private final synchronized void method168(int arg0) {
        ++field517;
        if (arg0 > -87) {
            field518 = -98;
        }
        if (this.field514 != null) {
            this.field514.setPixels(0, 0, super.field2844, super.field2837, this.field531, super.field2848, 0, super.field2844);
            this.field514.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!cg", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field523;
        return this.field514 == arg0;
    }

    @OriginalMember(owner = "client!cg", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field515;
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field514 = arg0;
        ++field533;
        arg0.setDimensions(super.field2844, super.field2837);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field531);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Graphics;IIIBI)V")
    public final void method169(Graphics arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.method166(0, arg2, arg3, arg1, arg5);
        Shape var7 = arg0.getClip();
        if (arg4 > -40) {
            field525 = null;
        }
        arg0.clipRect(arg5, arg3, arg2, arg1);
        ++field527;
        arg0.drawImage(super.field2843, 0, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method170(Component arg0, int arg1, int arg2, int arg3) {
        super.field2844 = arg1;
        ++field521;
        super.field2848 = new int[arg1 * arg2 + 1];
        if (arg3 != 4) {
            this.method168(-125);
        }
        super.field2837 = arg2;
        this.field531 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2843 = arg0.createImage(this);
        this.method168(-119);
        arg0.prepareImage(super.field2843, this);
        this.method168(-112);
        arg0.prepareImage(super.field2843, this);
        this.method168(-100);
        arg0.prepareImage(super.field2843, this);
        this.method905(arg3 + -3);
    }
}
