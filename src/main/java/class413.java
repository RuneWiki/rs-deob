import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class413 extends class437 implements ImageProducer {

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "[Z")
    public static boolean[] field6268 = new boolean[8];

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "[I")
    public static int[] field6272 = new int[14];

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "F")
    public static float field6261;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!eu", name = "K", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "Loa;")
    public static class605 field6264;

    @OriginalMember(owner = "client!eu", name = "L", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6278;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "Ljava/awt/Image;")
    private Image field6276;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field6274;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field6260;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 9)
    public static void method2606(int arg0) {
        field6264 = null;
        field6268 = null;
        field6272 = null;
        if (arg0 >= -35) {
            method2609(-64);
        }
    }

    @OriginalMember(owner = "client!eu", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 22)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field6275;
    }

    @OriginalMember(owner = "client!eu", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 29)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field6263;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(III)B", line = 41)
    public static final byte method2607(int arg0, int arg1, int arg2) {
        ++field6267;
        if (arg1 != 9) {
            return 0;
        } else {
            return (byte) (~(arg2 & arg0) != -1 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V", line = 57)
    public final void method823(int arg0, int arg1, Graphics arg2, boolean arg3) {
        ++field6259;
        if (!arg3) {
            field6264 = null;
        }
        this.method2610(32402);
        arg2.drawImage(this.field6276, arg1, arg0, this.field6278);
    }

    @OriginalMember(owner = "client!eu", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 69)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field6260 == arg0) {
            this.field6260 = null;
        }
        ++field6270;
    }

    @OriginalMember(owner = "client!eu", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 83)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field6273;
        this.field6260 = arg0;
        arg0.setDimensions(super.field6506, super.field6501);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field6274);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIB)V", line = 95)
    private final synchronized void method2608(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field6277;
        if (this.field6260 != null) {
            this.field6260.setPixels(arg3, arg1, arg0, arg2, this.field6274, super.field6504, super.field6506 * arg1 + arg3, super.field6506);
            int var6 = 50 % ((arg4 - -75) / 45);
            this.field6260.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "(I)V", line = 113)
    public static final void method2609(int arg0) {
        ++field6262;
        class30.field344.method1810(false);
        if (arg0 != -8379) {
            method2609(-20);
        }
    }

    @OriginalMember(owner = "client!eu", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 128)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field6269;
        return this.field6260 == arg0;
    }

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "(I)V", line = 139)
    private final synchronized void method2610(int arg0) {
        ++field6271;
        if (this.field6260 != null) {
            this.field6260.setPixels(0, 0, super.field6506, super.field6501, this.field6274, super.field6504, 0, super.field6506);
            this.field6260.imageComplete(2);
            if (arg0 != 32402) {
                field6268 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 155)
    public final void method822(int arg0, Canvas arg1) {
        this.field6278 = arg1;
        ++field6265;
        super.field6506 = this.field6278.getSize().width;
        super.field6501 = this.field6278.getSize().height;
        super.field6504 = new int[super.field6506 * super.field6501];
        this.field6274 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field6276 = this.field6278.createImage(this);
        this.method2610(32402);
        this.field6278.prepareImage(this.field6276, this.field6278);
        this.method2610(32402);
        if (arg0 >= -18) {
            field6264 = null;
        }
        this.field6278.prepareImage(this.field6276, this.field6278);
        this.method2610(32402);
        this.field6278.prepareImage(this.field6276, this.field6278);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZIIIILjava/awt/Graphics;)V", line = 182)
    public final void method821(boolean arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method2608(arg2, arg4, arg1, arg3, (byte) -128);
        ++field6266;
        if (!arg0) {
            this.field6278 = null;
        }
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg3, arg4, arg2, arg1);
        arg5.drawImage(this.field6276, 0, 0, this.field6278);
        arg5.setClip(var7);
    }
}
