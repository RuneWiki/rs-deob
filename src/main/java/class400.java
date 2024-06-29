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

@OriginalClass("client!uba")
public class class400 extends class137 implements ImageProducer {

    @OriginalMember(owner = "client!uba", name = "x", descriptor = "I")
    public static int field5307 = -2;

    @OriginalMember(owner = "client!uba", name = "v", descriptor = "Z")
    public static boolean field5305 = false;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "Z")
    public static boolean field5302 = false;

    @OriginalMember(owner = "client!uba", name = "C", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field5311 = new Hashtable();

    @OriginalMember(owner = "client!uba", name = "G", descriptor = "Lcu;")
    public static class206 field5315 = new class206(41, -1);

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!uba", name = "w", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!uba", name = "y", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!uba", name = "z", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!uba", name = "D", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!uba", name = "E", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!uba", name = "F", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!uba", name = "H", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!uba", name = "I", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!uba", name = "J", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!uba", name = "A", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5310;

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field5300;

    @OriginalMember(owner = "client!uba", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5304;

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5303;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method1015(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method2291((byte) -73);
        ++field5316;
        if (arg3 != 27644) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        arg2.drawImage(this.field5300, arg0, arg1, this.field5310);
    }

    @OriginalMember(owner = "client!uba", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field5313;
        if (this.field5303 == arg0) {
            this.field5303 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method2290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5312;
        if (this.field5303 != null) {
            this.field5303.setPixels(arg2, arg1, arg3, arg0, this.field5304, super.field2221, super.field2223 * arg1 - -arg2, super.field2223);
            this.field5303.imageComplete(arg4);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
    private final synchronized void method2291(byte arg0) {
        ++field5318;
        if (this.field5303 != null) {
            this.field5303.setPixels(0, 0, super.field2223, super.field2220, this.field5304, super.field2221, 0, super.field2223);
            this.field5303.imageComplete(2);
            if (arg0 > -43) {
                this.requestTopDownLeftRightResend((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "client!uba", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field5314;
    }

    @OriginalMember(owner = "client!uba", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field5317;
        return this.field5303 == arg0;
    }

    @OriginalMember(owner = "client!uba", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field5301;
    }

    @OriginalMember(owner = "client!uba", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field5309;
        this.field5303 = arg0;
        arg0.setDimensions(super.field2223, super.field2220);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5304);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)V")
    public static void method2292(byte arg0) {
        field5315 = null;
        field5311 = null;
        int var1 = -76 / ((-41 - arg0) / 58);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method1014(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method2290(arg0, arg1, arg3, arg2, 2);
        if (arg4 != 11) {
            this.removeConsumer((ImageConsumer) null);
        }
        ++field5306;
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg3, arg1, arg2, arg0);
        arg5.drawImage(this.field5300, 0, 0, this.field5310);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method1016(int arg0, Canvas arg1) {
        this.field5310 = arg1;
        ++field5308;
        super.field2223 = this.field5310.getSize().width;
        super.field2220 = this.field5310.getSize().height;
        super.field2221 = new int[super.field2223 * super.field2220];
        this.field5304 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5300 = this.field5310.createImage(this);
        this.method2291((byte) -91);
        if (arg0 == 1) {
            this.field5310.prepareImage(this.field5300, this.field5310);
            this.method2291((byte) -114);
            this.field5310.prepareImage(this.field5300, this.field5310);
            this.method2291((byte) -128);
            this.field5310.prepareImage(this.field5300, this.field5310);
        }
    }
}
