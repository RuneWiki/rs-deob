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

@OriginalClass("client!be")
public class class29 extends class283 implements ImageProducer {

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public static int field484 = 0;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "Ls;")
    public static class186 field479 = new class186(59, 12);

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field474;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field470;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field481;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field472;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field473;
        if (this.field472 != null) {
            this.field472.setPixels(arg1, arg4, arg3, arg0, this.field481, super.field4265, super.field4260 * arg4 + arg1, super.field4260);
            this.field472.imageComplete(arg2);
        }
    }

    @OriginalMember(owner = "client!be", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field486;
        if (this.field472 == arg0) {
            this.field472 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V")
    public static void method205(boolean arg0) {
        if (arg0) {
            method205(true);
        }
        field479 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method206(Canvas arg0, int arg1) {
        ++field480;
        this.field474 = arg0;
        super.field4260 = this.field474.getSize().width;
        super.field4258 = this.field474.getSize().height;
        super.field4265 = new int[super.field4260 * super.field4258];
        this.field481 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field470 = this.field474.createImage(this);
        this.method207(-106);
        this.field474.prepareImage(this.field470, this.field474);
        this.method207(-79);
        this.field474.prepareImage(this.field470, this.field474);
        this.method207(-51);
        this.field474.prepareImage(this.field470, this.field474);
        if (arg1 != 7) {
            field484 = -75;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    private final synchronized void method207(int arg0) {
        ++field483;
        if (this.field472 != null) {
            this.field472.setPixels(0, 0, super.field4260, super.field4258, this.field481, super.field4265, 0, super.field4260);
            this.field472.imageComplete(2);
            if (arg0 > -31) {
                this.field474 = null;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V")
    public static final void method208(int arg0, int arg1) {
        ++field471;
        class18 var2 = class140.method1047(arg0, arg1, false);
        var2.method123(20983);
    }

    @OriginalMember(owner = "client!be", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field482;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!be", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field485;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method209(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field478;
        this.method207(arg2 + -14155);
        if (arg2 == 14117) {
            arg3.drawImage(this.field470, arg1, arg0, this.field474);
        }
    }

    @OriginalMember(owner = "client!be", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field477;
        return this.field472 == arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method210(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field476;
        this.method204(arg3, arg4, 2, arg2, arg5);
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg4, arg5, arg2, arg3);
        arg1.drawImage(this.field470, 0, 0, this.field474);
        arg1.setClip(var7);
        if (arg0 != 64) {
            this.method204(-108, -51, 40, 95, -89);
        }
    }

    @OriginalMember(owner = "client!be", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field475;
        this.field472 = arg0;
        arg0.setDimensions(super.field4260, super.field4258);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field481);
        arg0.setHints(14);
    }
}
