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

@OriginalClass("client!tp")
public class class189 extends class97 implements ImageProducer {

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public static int field2559 = 0;

    @OriginalMember(owner = "client!tp", name = "E", descriptor = "[I")
    public static int[] field2577 = new int[50];

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!tp", name = "y", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!tp", name = "A", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!tp", name = "B", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!tp", name = "D", descriptor = "Lqj;")
    public static class238 field2576;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2568;

    @OriginalMember(owner = "client!tp", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field2575;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2562;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2566;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1174(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2558;
        if (this.field2566 != null) {
            if (arg1 == 5417) {
                this.field2566.setPixels(arg2, arg0, arg4, arg3, this.field2562, super.field1321, super.field1327 * arg0 - -arg2, super.field1327);
                this.field2566.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
    public final void method636(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5) {
        this.method1174(arg5, 5417, arg4, arg0, arg1);
        ++field2567;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg4, arg5, arg1, arg0);
        arg3.drawImage(this.field2575, 0, 0, this.field2568);
        arg3.setClip(var7);
        if (arg2 != -100) {
            field2559 = -104;
        }
    }

    @OriginalMember(owner = "client!tp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2560;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!tp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2566 = arg0;
        ++field2564;
        arg0.setDimensions(super.field1327, super.field1325);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2562);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!tp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2574;
        return this.field2566 == arg0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    private final synchronized void method1175(int arg0) {
        ++field2571;
        if (this.field2566 != null) {
            this.field2566.setPixels(0, 0, super.field1327, super.field1325, this.field2562, super.field1321, 0, super.field1327);
            this.field2566.imageComplete(2);
            if (arg0 != -24341) {
                field2559 = 38;
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2570;
        if (this.field2566 == arg0) {
            this.field2566 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V")
    public static void method1176(byte arg0) {
        field2576 = null;
        if (arg0 > -64) {
            field2576 = null;
        }
        field2577 = null;
    }

    @OriginalMember(owner = "client!tp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2565;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method634(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field2563;
        if (arg2 != 32) {
            field2576 = null;
        }
        this.method1175(-24341);
        arg3.drawImage(this.field2575, arg0, arg1, this.field2568);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIZI)I")
    public static final int method1177(int arg0, int arg1, boolean arg2, int arg3) {
        ++field2572;
        if (!arg2) {
            return 79;
        } else {
            int var4 = arg0 & 3;
            if (var4 == 0) {
                return arg3;
            } else if (~var4 == -2) {
                return arg1;
            } else {
                return var4 == 2 ? -arg3 + 7 : -arg1 + 7;
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method637(Canvas arg0, int arg1) {
        this.field2568 = arg0;
        ++field2561;
        super.field1327 = this.field2568.getSize().width;
        super.field1325 = this.field2568.getSize().height;
        int var3 = -74 / ((arg1 - 26) / 48);
        super.field1321 = new int[super.field1327 * super.field1325];
        this.field2562 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2575 = this.field2568.createImage(this);
        this.method1175(-24341);
        this.field2568.prepareImage(this.field2575, this.field2568);
        this.method1175(-24341);
        this.field2568.prepareImage(this.field2575, this.field2568);
        this.method1175(-24341);
        this.field2568.prepareImage(this.field2575, this.field2568);
    }
}
