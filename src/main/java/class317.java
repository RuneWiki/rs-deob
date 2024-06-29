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

@OriginalClass("client!w")
public class class317 extends class584 implements ImageProducer {

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field3903 = 0;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "F")
    public static float field3906;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3892;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field3895;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3896;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3898;

    @OriginalMember(owner = "client!w", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 3)
    public final void startProduction(ImageConsumer arg0) {
        ++field3902;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!w", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 20)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3893;
    }

    @OriginalMember(owner = "client!w", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 27)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3901;
        return this.field3898 == arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIBLjava/awt/Graphics;III)V", line = 35)
    public final void method1867(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5, int arg6, int arg7) {
        if (arg3 == 19) {
            ++field3891;
            this.method1870(arg1, arg2, arg6, arg0, 86);
            Shape var9 = arg4.getClip();
            arg4.clipRect(arg5, arg7, arg1, arg2);
            arg4.drawImage(this.field3895, -arg0 + arg5, -arg6 + arg7, this.field3892);
            arg4.setClip(var9);
        }
    }

    @OriginalMember(owner = "client!w", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 54)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3898 = arg0;
        ++field3897;
        arg0.setDimensions(super.field7972, super.field7974);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3896);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!w", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 68)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field3899;
        if (this.field3898 == arg0) {
            this.field3898 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 82)
    private final synchronized void method1868(byte arg0) {
        ++field3904;
        if (this.field3898 != null) {
            int var2 = -32 / ((45 - arg0) / 51);
            this.field3898.setPixels(0, 0, super.field7972, super.field7974, this.field3896, super.field7973, 0, super.field7972);
            this.field3898.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Canvas;BII)V", line = 98)
    public final void method1869(Canvas arg0, byte arg1, int arg2, int arg3) {
        ++field3905;
        super.field7972 = arg2;
        super.field7974 = arg3;
        this.field3892 = arg0;
        super.field7973 = new int[super.field7974 * super.field7972];
        this.field3896 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3895 = this.field3892.createImage(this);
        this.method1868((byte) -85);
        this.field3892.prepareImage(this.field3895, this.field3892);
        this.method1868((byte) 121);
        this.field3892.prepareImage(this.field3895, this.field3892);
        this.method1868((byte) 110);
        this.field3892.prepareImage(this.field3895, this.field3892);
        if (arg1 < 92) {
            method1871(-77);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V", line = 121)
    private final synchronized void method1870(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3900;
        if (arg4 > 74) {
            if (this.field3898 != null) {
                this.field3898.setPixels(arg3, arg2, arg0, arg1, this.field3896, super.field7973, super.field7972 * arg2 + arg3, super.field7972);
                this.field3898.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 139)
    public static final void method1871(int arg0) {
        ++field3894;
        class713.method4037((byte) -108);
        class357.method2091(2, 22050, class118.field1503.field10633.method3227(0) == 1, -2425);
        class388.field4979 = class621.method3538(class109.field1370, 1, class521.field7389, 0, 22050);
        class455.method2752(true, class82.method774((class502) null, 118), (byte) -74);
        class95.field1247 = class621.method3538(class109.field1370, 1, class521.field7389, 1, 2048);
        class95.field1247.method1554(false, class783.field10811);
        if (arg0 < 58) {
            field3903 = -27;
        }
    }
}
