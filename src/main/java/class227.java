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

@OriginalClass("client!in")
public class class227 extends class239 implements ImageProducer {

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    public static int field2811 = 0;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "F")
    public static float field2815;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2824;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field2820;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2810;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2823;

    @OriginalMember(owner = "client!in", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2822;
        return this.field2823 == arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1365(int arg0, byte arg1, int arg2) {
        ++field2818;
        if (arg1 > -108) {
            return true;
        } else {
            return (arg2 & 33) != 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public final void method1366(int arg0, Graphics arg1, int arg2, boolean arg3) {
        this.method1367((byte) 103);
        ++field2821;
        if (arg3) {
            arg1.drawImage(this.field2820, arg2, arg0, this.field2824);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    private final synchronized void method1367(byte arg0) {
        ++field2814;
        if (this.field2823 != null) {
            int var2 = -51 % ((arg0 - 48) / 33);
            this.field2823.setPixels(0, 0, super.field2966, super.field2964, this.field2810, super.field2968, 0, super.field2966);
            this.field2823.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!in", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2812;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public final void method1368(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        this.method1370(arg5, arg0, 2, arg3, arg1);
        ++field2809;
        int var7 = 65 / ((arg4 - -25) / 44);
        Shape var8 = arg2.getClip();
        arg2.clipRect(arg1, arg0, arg5, arg3);
        arg2.drawImage(this.field2820, 0, 0, this.field2824);
        arg2.setClip(var8);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method1369(Canvas arg0, byte arg1) {
        ++field2816;
        this.field2824 = arg0;
        super.field2966 = this.field2824.getSize().width;
        super.field2964 = this.field2824.getSize().height;
        super.field2968 = new int[super.field2966 * super.field2964];
        this.field2810 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2820 = this.field2824.createImage(this);
        this.method1367((byte) -45);
        this.field2824.prepareImage(this.field2820, this.field2824);
        this.method1367((byte) -62);
        this.field2824.prepareImage(this.field2820, this.field2824);
        this.method1367((byte) -82);
        int var3 = -84 % ((arg1 - 57) / 51);
        this.field2824.prepareImage(this.field2820, this.field2824);
    }

    @OriginalMember(owner = "client!in", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2808;
        this.field2823 = arg0;
        arg0.setDimensions(super.field2966, super.field2964);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2810);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2807;
        if (this.field2823 != null) {
            this.field2823.setPixels(arg4, arg1, arg0, arg3, this.field2810, super.field2968, super.field2966 * arg1 - -arg4, super.field2966);
            this.field2823.imageComplete(arg2);
        }
    }

    @OriginalMember(owner = "client!in", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2819;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!in", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2823 == arg0) {
            this.field2823 = null;
        }
        ++field2817;
    }
}
