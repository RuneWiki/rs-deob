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

@OriginalClass("client!hn")
public class class281 extends class213 implements ImageProducer {

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "Lpg;")
    public static class492 field3867 = new class492(102, 6);

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3862;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field3870;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3873;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3863;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 3)
    public static final void method1761(int arg0) {
        if (class144.field2077 != 10 && ~class144.field2077 != -29) {
            int var1 = class339.field5365.field5339[0] >> 3;
            int var2 = class339.field5365.field5344[0] >> 3;
            if (var1 >= 0 && class96.field1403 >> 3 > var1 && ~var2 <= -1 && var2 < class485.field7122 >> 3) {
                class262.method1692(20, 5000, var1, var2);
            } else {
                class262.method1692(arg0 + 1, 0, class96.field1403 >> 4, class485.field7122 >> 4);
            }
        } else {
            class262.method1692(-126, 5000, class34.field539 >> 10, class301.field4447 >> 10);
        }
        ++field3868;
        class98.method671((byte) 73);
        class421.method2534(arg0 ^ 27699);
        if (arg0 != 0) {
            field3867 = null;
        }
        class246.method1630(1711);
        class272.method1739(false);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BILjava/awt/Graphics;I)V", line = 34)
    public final void method77(byte arg0, int arg1, Graphics arg2, int arg3) {
        ++field3872;
        this.method1764((byte) 118);
        if (arg0 >= -76) {
            this.isConsumer((ImageConsumer) null);
        }
        arg2.drawImage(this.field3870, arg3, arg1, this.field3862);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZI)Z", line = 49)
    public static final boolean method1762(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return false;
        } else {
            ++field3869;
            return class57.method389((byte) -55, arg2, arg0) & class290.method1874(-18, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 62)
    public static void method1763(int arg0) {
        field3867 = null;
        if (arg0 != -23375) {
            method1761(-65);
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)V", line = 72)
    private final synchronized void method1764(byte arg0) {
        ++field3878;
        if (this.field3863 != null) {
            if (arg0 != 118) {
                method1762(84, false, -30);
            }
            this.field3863.setPixels(0, 0, super.field2978, super.field2977, this.field3873, super.field2982, 0, super.field2978);
            this.field3863.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!hn", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 88)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field3876;
        if (this.field3863 == arg0) {
            this.field3863 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 98)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3863 = arg0;
        ++field3864;
        arg0.setDimensions(super.field2978, super.field2977);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3873);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V", line = 110)
    private final synchronized void method1765(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3866;
        if (arg3 != 10) {
            this.field3870 = null;
        }
        if (this.field3863 != null) {
            this.field3863.setPixels(arg0, arg4, arg1, arg2, this.field3873, super.field2982, super.field2978 * arg4 + arg0, super.field2978);
            this.field3863.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V", line = 137)
    public final void method78(Graphics arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field3865;
        this.method1765(arg3, arg4, arg2, 10, arg1);
        Shape var7 = arg0.getClip();
        if (arg5 != -92) {
            method1761(126);
        }
        arg0.clipRect(arg3, arg1, arg4, arg2);
        arg0.drawImage(this.field3870, 0, 0, this.field3862);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!hn", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 153)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3875;
    }

    @OriginalMember(owner = "client!hn", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 163)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3871;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLjava/awt/Canvas;)V", line = 172)
    public final void method79(boolean arg0, Canvas arg1) {
        this.field3862 = arg1;
        ++field3874;
        super.field2978 = this.field3862.getSize().width;
        super.field2977 = this.field3862.getSize().height;
        super.field2982 = new int[super.field2978 * super.field2977];
        this.field3873 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3870 = this.field3862.createImage(this);
        this.method1764((byte) 118);
        this.field3862.prepareImage(this.field3870, this.field3862);
        this.method1764((byte) 118);
        this.field3862.prepareImage(this.field3870, this.field3862);
        this.method1764((byte) 118);
        if (!arg0) {
            this.method78((Graphics) null, -43, -65, -102, 65, (byte) -59);
        }
        this.field3862.prepareImage(this.field3870, this.field3862);
    }

    @OriginalMember(owner = "client!hn", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 194)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3861;
        return this.field3863 == arg0;
    }
}
