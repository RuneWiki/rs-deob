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

@OriginalClass("client!pb")
public class class658 extends class255 implements ImageProducer {

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "[Lraa;")
    public static class609[] field9213 = new class609[8];

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "Lmia;")
    public static class63 field9218 = new class63(69, -1);

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "Lqe;")
    public static class469 field9222 = new class469(0, 6);

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field9206;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9215;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "Ljava/awt/Image;")
    private Image field9214;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field9216;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field9212;

    @OriginalMember(owner = "client!pb", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 4)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field9221;
    }

    @OriginalMember(owner = "client!pb", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 14)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field9207;
        return this.field9212 == arg0;
    }

    @OriginalMember(owner = "client!pb", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 22)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field9220;
        if (this.field9212 == arg0) {
            this.field9212 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)Lfl;", line = 33)
    public static final class741 method3799(int arg0, boolean arg1) {
        ++field9211;
        class741 var2 = (class741) class395.field5937.method803(107, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class228.field3345.method211(arg1, 1, arg0);
            class741 var4 = new class741();
            var4.field10397 = arg0;
            if (!arg1) {
                field9213 = null;
            }
            if (var3 != null) {
                var4.method4148(!arg1, new class645(var3));
            }
            var4.method4150((byte) -50);
            if (var4.field10389 == 2 && class237.field3436.method2287((long) arg0, (byte) -117) == null) {
                class237.field3436.method2278((byte) -114, (long) arg0, new class317(class554.field7903));
                class467.field6836[class554.field7903++] = var4;
            }
            class395.field5937.method801(1, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 77)
    private final synchronized void method3800(int arg0) {
        ++field9208;
        if (this.field9212 != null) {
            this.field9212.setPixels(0, 0, super.field3658, super.field3660, this.field9216, super.field3661, arg0, super.field3658);
            this.field9212.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIZI)V", line = 93)
    private final synchronized void method3801(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field9217;
        if (this.field9212 != null) {
            this.field9212.setPixels(arg4, arg2, arg0, arg1, this.field9216, super.field3661, super.field3658 * arg2 + arg4, super.field3658);
            if (!arg3) {
                this.field9212.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 109)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field9212 = arg0;
        ++field9219;
        arg0.setDimensions(super.field3658, super.field3660);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field9216);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!pb", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 130)
    public final void startProduction(ImageConsumer arg0) {
        ++field9206;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V", line = 138)
    public final void method1019(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7) {
        if (arg7 >= 104) {
            this.method3801(arg0, arg1, arg3, false, arg6);
            ++field9210;
            Shape var9 = arg4.getClip();
            arg4.clipRect(arg5, arg2, arg0, arg1);
            arg4.drawImage(this.field9214, -arg6 + arg5, -arg3 + arg2, this.field9215);
            arg4.setClip(var9);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V", line = 157)
    public static void method3802(int arg0) {
        if (arg0 == 2) {
            field9222 = null;
            field9213 = null;
            field9218 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILjava/awt/Canvas;I)V", line = 169)
    public final void method1018(int arg0, int arg1, Canvas arg2, int arg3) {
        ++field9209;
        this.field9215 = arg2;
        super.field3658 = arg1;
        super.field3660 = arg0;
        super.field3661 = new int[super.field3660 * super.field3658];
        this.field9216 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field9214 = this.field9215.createImage(this);
        this.method3800(0);
        this.field9215.prepareImage(this.field9214, this.field9215);
        this.method3800(0);
        if (arg3 == 2) {
            this.field9215.prepareImage(this.field9214, this.field9215);
            this.method3800(0);
            this.field9215.prepareImage(this.field9214, this.field9215);
        }
    }
}
