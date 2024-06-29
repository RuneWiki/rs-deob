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

@OriginalClass("client!ji")
public class class611 extends class717 implements ImageProducer {

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field8466 = 0;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "Lkr;")
    public static class748 field8463;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8457;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field8456;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field8461;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field8462;

    @OriginalMember(owner = "client!ji", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field8467;
        return this.field8462 == arg0;
    }

    @OriginalMember(owner = "client!ji", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field8462 = arg0;
        ++field8465;
        arg0.setDimensions(super.field9980, super.field9975);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field8461);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIILjava/awt/Canvas;)V")
    public final void method3426(int arg0, int arg1, int arg2, Canvas arg3) {
        ++field8469;
        if (arg1 != -17303) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        super.field9980 = arg0;
        super.field9975 = arg2;
        this.field8457 = arg3;
        super.field9976 = new int[super.field9980 * super.field9975];
        this.field8461 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field8456 = this.field8457.createImage(this);
        this.method3431(true);
        this.field8457.prepareImage(this.field8456, this.field8457);
        this.method3431(true);
        this.field8457.prepareImage(this.field8456, this.field8457);
        this.method3431(true);
        this.field8457.prepareImage(this.field8456, this.field8457);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public static void method3427(int arg0) {
        field8463 = null;
        if (arg0 != 0) {
            field8466 = 114;
        }
    }

    @OriginalMember(owner = "client!ji", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field8462 == arg0) {
            this.field8462 = null;
        }
        ++field8468;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIB)V")
    private final synchronized void method3428(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field8470;
        if (this.field8462 != null) {
            this.field8462.setPixels(arg0, arg1, arg2, arg3, this.field8461, super.field9976, super.field9980 * arg1 - -arg0, super.field9980);
            if (arg4 != -44) {
                this.method3426(111, 17, -12, (Canvas) null);
            }
            this.field8462.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ji", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field8458;
    }

    @OriginalMember(owner = "client!ji", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field8464;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIILjava/awt/Graphics;I)V")
    public final void method3429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Graphics arg6, int arg7) {
        this.method3428(arg5, arg1, arg7, arg2, (byte) -44);
        ++field8459;
        if (arg3 >= -46) {
            this.method3428(-102, -16, -12, 76, (byte) -17);
        }
        Shape var9 = arg6.getClip();
        arg6.clipRect(arg0, arg4, arg7, arg2);
        arg6.drawImage(this.field8456, -arg5 + arg0, -arg1 + arg4, this.field8457);
        arg6.setClip(var9);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BII)V")
    public static final void method3430(byte arg0, int arg1, int arg2) {
        ++field8460;
        if (~class29.field523 != ~arg2) {
            class634.field8751 = new int[arg2];
            for (int var3 = 0; arg2 > var3; ++var3) {
                class634.field8751[var3] = (var3 << 12) / arg2;
            }
            class113.field1629 = arg2 * 32;
            class346.field4366 = arg2 - 1;
            class29.field523 = arg2;
        }
        if (~class549.field7672 != ~arg1) {
            if (~class29.field523 == ~arg1) {
                class287.field3604 = class634.field8751;
            } else {
                class287.field3604 = new int[arg1];
                for (int var4 = 0; ~var4 > ~arg1; ++var4) {
                    class287.field3604[var4] = (var4 << 12) / arg1;
                }
            }
            class683.field9515 = arg1 + -1;
            class549.field7672 = arg1;
        }
        int var5 = -119 / ((18 - arg0) / 52);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    private final synchronized void method3431(boolean arg0) {
        ++field8471;
        if (this.field8462 != null) {
            this.field8462.setPixels(0, 0, super.field9980, super.field9975, this.field8461, super.field9976, 0, super.field9980);
            if (!arg0) {
                this.method3428(-21, -48, 9, 103, (byte) 40);
            }
            this.field8462.imageComplete(2);
        }
    }
}
