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

@OriginalClass("client!kc")
public class class135 extends class498 implements ImageProducer {

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "[I")
    public static int[] field2260 = new int[1];

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2264;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field2266;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2269;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2274;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "[[[Les;")
    public static class384[][][] field2273;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1103(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2259;
        if (this.field2274 != null) {
            this.field2274.setPixels(arg2, arg3, arg4, arg0, this.field2269, super.field6959, super.field6960 * arg3 + arg2, super.field6960);
            this.field2274.imageComplete(2);
            if (arg1 != 25786) {
                field2260 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static void method1104(int arg0) {
        if (arg0 != 65280) {
            method1104(-19);
        }
        field2260 = null;
        field2273 = null;
    }

    @OriginalMember(owner = "client!kc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2274 == arg0) {
            this.field2274 = null;
        }
        ++field2272;
    }

    @OriginalMember(owner = "client!kc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2267;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    private final synchronized void method1105(byte arg0) {
        ++field2262;
        int var2 = -25 % ((arg0 - -41) / 55);
        if (this.field2274 != null) {
            this.field2274.setPixels(0, 0, super.field6960, super.field6963, this.field2269, super.field6959, 0, super.field6960);
            this.field2274.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2263;
        this.field2274 = arg0;
        arg0.setDimensions(super.field6960, super.field6963);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2269);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!kc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2271;
        return this.field2274 == arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V")
    public final void method1106(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -1) {
            this.method1106(-26, 63, -8, (Graphics) null, 101, 114, -111, 37);
        }
        ++field2265;
        this.method1103(arg2, 25786, arg1, arg7, arg6);
        Shape var9 = arg3.getClip();
        arg3.clipRect(arg5, arg0, arg6, arg2);
        arg3.drawImage(this.field2266, arg5 - arg1, -arg7 + arg0, this.field2264);
        arg3.setClip(var9);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
    public final void method1107(Canvas arg0, int arg1, int arg2, int arg3) {
        super.field6963 = arg3;
        ++field2270;
        super.field6960 = arg1;
        this.field2264 = arg0;
        super.field6959 = new int[super.field6963 * super.field6960];
        this.field2269 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg2 <= -42) {
            this.field2266 = this.field2264.createImage(this);
            this.method1105((byte) -117);
            this.field2264.prepareImage(this.field2266, this.field2264);
            this.method1105((byte) 86);
            this.field2264.prepareImage(this.field2266, this.field2264);
            this.method1105((byte) 51);
            this.field2264.prepareImage(this.field2266, this.field2264);
        }
    }

    @OriginalMember(owner = "client!kc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2261;
    }
}
