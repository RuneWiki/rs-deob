import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.math.BigInteger;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class541 extends class223 implements ImageProducer {

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7176 = new BigInteger("85b99b9961461c31e448da113d63c964118d217139c602e1f59172935b96885ec454c3916e3d23a7b92fe44b14ab9b7e9c1c92dac03e029e93325c561985f403", 16);

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7164;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Ljava/awt/Image;")
    private Image field7174;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field7171;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field7161;

    @OriginalMember(owner = "client!ac", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field7169;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILha;IIII)V")
    public static final void method3016(int arg0, int arg1, int arg2, class59 arg3, int arg4, int arg5, int arg6, int arg7) {
        class45.field585 = arg3;
        ++field7163;
        class194.field2930 = class45.field585.method421();
        class681.field9513 = class45.field585.method421();
        class156.field2382 = class45.field585.method421();
        class410.field5681 = 1;
        class252.field3472 = 0;
        class300.field4261 = arg1;
        class296.field4227 = arg7;
        class640.field8503 = arg5;
        class446.field6124 = 0;
        class526.field6973 = null;
        class262.field3654 = arg0;
        if (arg2 > 101) {
            class640.method3501(27424, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field7166;
        return this.field7161 == arg0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
    public final void method245(Canvas arg0, int arg1, int arg2, int arg3) {
        this.field7164 = arg0;
        super.field3166 = arg1;
        ++field7162;
        super.field3163 = arg2;
        super.field3165 = new int[super.field3166 * super.field3163];
        this.field7171 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field7174 = this.field7164.createImage(this);
        this.method3018((byte) 126);
        this.field7164.prepareImage(this.field7174, this.field7164);
        this.method3018((byte) 110);
        this.field7164.prepareImage(this.field7174, this.field7164);
        this.method3018((byte) 115);
        this.field7164.prepareImage(this.field7174, this.field7164);
        if (arg3 != 2) {
            method3016(98, -93, -20, (class59) null, -47, -1, 70, -74);
        }
    }

    @OriginalMember(owner = "client!ac", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field7167;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method3017(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7173;
        if (this.field7161 != null) {
            this.field7161.setPixels(arg1, arg3, arg2, arg0, this.field7171, super.field3165, super.field3163 * arg3 - -arg1, super.field3163);
            this.field7161.imageComplete(2);
            if (arg4 < 29) {
                this.field7174 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZIIIIILjava/awt/Graphics;)V")
    public final void method244(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Graphics arg7) {
        ++field7175;
        this.method3017(arg0, arg2, arg5, arg6, 91);
        if (arg1) {
            this.method3017(107, -94, 53, -89, 19);
        }
        Shape var9 = arg7.getClip();
        arg7.clipRect(arg4, arg3, arg5, arg0);
        arg7.drawImage(this.field7174, arg4 - arg2, arg3 - arg6, this.field7164);
        arg7.setClip(var9);
    }

    @OriginalMember(owner = "client!ac", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field7161 = arg0;
        ++field7165;
        arg0.setDimensions(super.field3163, super.field3166);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field7171);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ac", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field7172;
        if (this.field7161 == arg0) {
            this.field7161 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    private final synchronized void method3018(byte arg0) {
        ++field7168;
        if (this.field7161 != null) {
            if (arg0 <= 107) {
                this.method244(-72, true, 84, -87, 9, 34, 118, (Graphics) null);
            }
            this.field7161.setPixels(0, 0, super.field3163, super.field3166, this.field7171, super.field3165, 0, super.field3163);
            this.field7161.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method3019(int arg0) {
        field7176 = null;
        if (arg0 != -31835) {
            method3016(34, 84, -23, (class59) null, 34, -1, 53, 122);
        }
    }
}
