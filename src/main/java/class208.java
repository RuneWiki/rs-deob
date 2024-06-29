import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class208 extends class272 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!si", name = "A", descriptor = "[[B")
    public static byte[][] field3222 = new byte[50][];

    @OriginalMember(owner = "client!si", name = "u", descriptor = "[S")
    public static short[] field3216 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3209;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3224;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    private final synchronized void method1451(int arg0) {
        ++field3214;
        if (this.field3224 != null) {
            this.field3224.setPixels(0, 0, super.field4349, super.field4348, this.field3209, super.field4350, 0, super.field4349);
            if (arg0 == -21568) {
                this.field3224.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILcc;II)V")
    public static final void method1452(int arg0, class222 arg1, int arg2, int arg3) {
        ++field3226;
        if (class113.field1747 == null && !class207.field3185) {
            if (arg1 != null && class244.method1659(arg1, 78) != null) {
                class113.field1747 = arg1;
                class244.field3894 = class244.method1659(arg1, 47);
                class237.field3748 = arg3;
                class168.field2530 = false;
                class173.field2674 = arg0;
                class171.field2586 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILkc;)V")
    public static final void method1453(int arg0, int arg1, class296 arg2) {
        ++field3217;
        if (class41.field686 < arg2.field4714) {
            class53.method452(arg2, arg0 ^ 31469);
        } else if (arg2.field4661 >= class41.field686) {
            class23.method205(false, arg2);
        } else {
            class206.method1446(arg2, (byte) 27);
        }
        if (~arg2.field4725 > -129 || arg2.field4709 < 128 || arg2.field4725 >= 13184 || ~arg2.field4709 <= -13185) {
            arg2.field4714 = 0;
            arg2.field4727 = -1;
            arg2.field4661 = 0;
            arg2.field4732 = -1;
            arg2.field4725 = arg2.field4749[0] * 128 + 64 * arg2.method1013(0);
            arg2.field4709 = arg2.field4673[0] * 128 - -(64 * arg2.method1013(arg0 ^ 18964));
            arg2.method1987((byte) 85);
        }
        if (class263.field4168 == arg2 && (~arg2.field4725 > -1537 || arg2.field4709 < 1536 || ~arg2.field4725 <= -11777 || arg2.field4709 >= 11776)) {
            arg2.field4727 = -1;
            arg2.field4732 = -1;
            arg2.field4661 = 0;
            arg2.field4714 = 0;
            arg2.field4725 = arg2.field4749[0] * 128 + 64 * arg2.method1013(0);
            arg2.field4709 = arg2.field4673[0] * 128 + arg2.method1013(0) * 64;
            arg2.method1987((byte) 91);
        }
        class156.method1128(arg2, -119);
        class172.method1234(arg2, (byte) -121);
        if (arg0 != 18964) {
            field3216 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3223;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)Lsj;")
    public static final class50 method1454(byte arg0, int arg1) {
        ++field3210;
        class50 var2 = (class50) class126.field1897.method1173((long) arg1, true);
        if (var2 != null) {
            return var2;
        } else {
            class50 var3 = class163.method1179(class115.field1764, false, arg1, class198.field3087, -122);
            if (var3 != null) {
                class126.field1897.method1167((byte) -31, var3, (long) arg1);
            }
            int var4 = 95 % ((arg0 - -47) / 58);
            return var3;
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
    public static void method1455(byte arg0) {
        field3216 = null;
        field3222 = null;
        if (arg0 <= 0) {
            field3216 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3215;
        return this.field3224 == arg0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method1456(int arg0, int arg1, Component arg2, int arg3) {
        super.field4350 = new int[arg1 * arg3 - -1];
        super.field4348 = arg3;
        ++field3227;
        super.field4349 = arg1;
        this.field3209 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field4342 = arg2.createImage(this);
        this.method1451(-21568);
        arg2.prepareImage(super.field4342, this);
        this.method1451(-21568);
        arg2.prepareImage(super.field4342, this);
        this.method1451(-21568);
        arg2.prepareImage(super.field4342, this);
        this.method1862(false);
        if (arg0 < 45) {
            this.method1457(-7, (Graphics) null, (byte) 114, 77);
        }
    }

    @OriginalMember(owner = "client!si", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3218;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public final void method1457(int arg0, Graphics arg1, byte arg2, int arg3) {
        ++field3220;
        this.method1451(-21568);
        if (arg2 < 84) {
            field3222 = null;
        }
        arg1.drawImage(super.field4342, arg3, arg0, this);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIBI)V")
    private final synchronized void method1458(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 >= -23) {
            method1455((byte) 86);
        }
        ++field3219;
        if (this.field3224 != null) {
            this.field3224.setPixels(arg0, arg2, arg1, arg4, this.field3209, super.field4350, super.field4349 * arg2 - -arg0, super.field4349);
            this.field3224.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!si", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3213;
        this.field3224 = arg0;
        arg0.setDimensions(super.field4349, super.field4348);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3209);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(B)V")
    public static final void method1459(byte arg0) {
        ++field3212;
        class35.field606.method1169(true);
        class155.field2316.method1169(true);
        if (arg0 >= 2) {
            class108.field1681.method1169(true);
        }
    }

    @OriginalMember(owner = "client!si", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3211;
        return true;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method1460(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        if (arg1 == -326) {
            ++field3225;
            this.method1458(arg5, arg3, arg0, (byte) -62, arg2);
            Shape var7 = arg4.getClip();
            arg4.clipRect(arg5, arg0, arg3, arg2);
            arg4.drawImage(super.field4342, 0, 0, this);
            arg4.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!si", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field3221;
        if (this.field3224 == arg0) {
            this.field3224 = null;
        }
    }
}
