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

@OriginalClass("client!fu")
public class class393 extends class753 implements ImageProducer {

    @OriginalMember(owner = "client!fu", name = "w", descriptor = "Lea;")
    public static class547 field5561 = new class547(3, 5);

    @OriginalMember(owner = "client!fu", name = "G", descriptor = "Llga;")
    public static class712 field5571 = new class712(84, 4);

    @OriginalMember(owner = "client!fu", name = "D", descriptor = "F")
    public static float field5568;

    @OriginalMember(owner = "client!fu", name = "x", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!fu", name = "A", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!fu", name = "B", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!fu", name = "C", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!fu", name = "y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5563;

    @OriginalMember(owner = "client!fu", name = "M", descriptor = "Ljava/awt/Image;")
    private Image field5577;

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5574;

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5564;

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "[Lkia;")
    public static class620[] field5575;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2290(boolean arg0) {
        if (!arg0) {
            method2290(true);
        }
        field5561 = null;
        field5575 = null;
        field5571 = null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V", line = 17)
    private final synchronized void method2291(byte arg0) {
        ++field5565;
        if (arg0 != 115) {
            field5561 = null;
        }
        if (this.field5564 != null) {
            this.field5564.setPixels(0, 0, super.field10433, super.field10443, this.field5574, super.field10438, 0, super.field10433);
            this.field5564.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Ljava/awt/Graphics;IBIIIII)V", line = 36)
    public final void method1773(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2292((byte) -75, arg5, arg4, arg3, arg6);
        if (arg2 != -125) {
            this.method2291((byte) 87);
        }
        ++field5570;
        Shape var9 = arg0.getClip();
        arg0.clipRect(arg1, arg7, arg4, arg6);
        arg0.drawImage(this.field5577, arg1 - arg3, -arg5 + arg7, this.field5563);
        arg0.setClip(var9);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIILjava/awt/Canvas;)V", line = 56)
    public final void method1772(int arg0, int arg1, int arg2, Canvas arg3) {
        super.field10433 = arg1;
        super.field10443 = arg0;
        this.field5563 = arg3;
        ++field5567;
        super.field10438 = new int[super.field10443 * super.field10433];
        this.field5574 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5577 = this.field5563.createImage(this);
        this.method2291((byte) 115);
        if (arg2 != 4095) {
            this.method2291((byte) 120);
        }
        this.field5563.prepareImage(this.field5577, this.field5563);
        this.method2291((byte) 115);
        this.field5563.prepareImage(this.field5577, this.field5563);
        this.method2291((byte) 115);
        this.field5563.prepareImage(this.field5577, this.field5563);
    }

    @OriginalMember(owner = "client!fu", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 79)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field5562;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(BIIII)V", line = 87)
    private final synchronized void method2292(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5572;
        if (arg0 != -75) {
            this.addConsumer((ImageConsumer) null);
        }
        if (this.field5564 != null) {
            this.field5564.setPixels(arg3, arg1, arg2, arg4, this.field5574, super.field10438, super.field10433 * arg1 - -arg3, super.field10433);
            this.field5564.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!fu", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 104)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field5569;
        this.field5564 = arg0;
        arg0.setDimensions(super.field10433, super.field10443);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5574);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!fu", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 120)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field5566;
        return this.field5564 == arg0;
    }

    @OriginalMember(owner = "client!fu", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 135)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field5564 == arg0) {
            this.field5564 = null;
        }
        ++field5573;
    }

    @OriginalMember(owner = "client!fu", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 146)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field5576;
    }
}
