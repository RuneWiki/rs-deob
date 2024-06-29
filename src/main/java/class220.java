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

@OriginalClass("client!lj")
public class class220 extends class86 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Lbd;")
    public static class162 field3662 = class17.method142(0, ")4a=");

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "Lbd;")
    public static class162 field3680 = class17.method142(0, ")3)3)3");

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field3674 = 0;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Lli;")
    public static class18 field3670 = new class18();

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field3682 = 10;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "Lbd;")
    public static class162 field3683 = class17.method142(0, " loggt sich ein)3");

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3664;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3669;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "[Laf;")
    public static class223[] field3661;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 4)
    public static void method1586(int arg0) {
        field3661 = null;
        field3683 = null;
        if (arg0 >= -34) {
            method1586(-49);
        }
        field3680 = null;
        field3662 = null;
        field3670 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V", line = 22)
    public static final void method1587(int arg0, int arg1) {
        if (arg0 != 50) {
            method1590(13);
        }
        field3668++;
        if (arg1 == 37) {
            class267.field4447 = 3.0F;
        } else if (arg1 == 50) {
            class267.field4447 = 4.0F;
        } else if (arg1 == 75) {
            class267.field4447 = 6.0F;
        } else {
            class267.field4447 = 8.0F;
        }
        class59.field922 = -1;
        class59.field922 = -1;
    }

    @OriginalMember(owner = "client!lj", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 47)
    public final void startProduction(ImageConsumer arg0) {
        field3671++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V", line = 67)
    private final synchronized void method1588(byte arg0) {
        if (arg0 > -86) {
            method1589(-21, (class162) null, -27, (class162) null);
        }
        field3663++;
        if (this.field3669 != null) {
            this.field3669.setPixels(0, 0, this.field1529, this.field1532, this.field3664, this.field1526, 0, this.field1529);
            this.field3669.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!lj", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 84)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3676++;
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 95)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field3678++;
        return this.field3669 == arg0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILbd;ILbd;)V", line = 104)
    public static final void method1589(int arg0, class162 arg1, int arg2, class162 arg3) {
        class244.field4057 = arg3;
        class244.field4046 = arg1;
        field3679++;
        class94.field1726 = arg2;
        if (class244.field4057.method1248(class244.field4053, (byte) -81) || class244.field4046.method1248(class244.field4053, (byte) -45)) {
            class217.field3620 = 3;
        } else if (class212.field3566 == -1) {
            class213.field3569 = 0;
            class201.field3415 = 1;
            class217.field3620 = -3;
            class94 var4 = new class94(128);
            var4.method753(10, true);
            var4.method751((int) (Math.random() * 99999.0D), -1044017976);
            var4.method751(517, -1044017976);
            var4.method745(class244.field4057.method1256(0), (byte) -124);
            var4.method730(false, (int) (Math.random() * 9.9999999E7D));
            if (arg0 <= -119) {
                var4.method727(class244.field4046, -253);
                var4.method730(false, (int) (Math.random() * 9.9999999E7D));
                var4.method708(4096, class250.field4170, class274.field4556);
                class187.field3229.field1653 = 0;
                class187.field3229.method753(0, true);
                class187.field3229.method753(var4.field1653, true);
                class187.field3229.method720(var4.field1653, var4.field1681, 0, -84);
            }
        } else {
            class270.method1847((byte) -16);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLjava/awt/Graphics;II)V", line = 147)
    public final void method10(byte arg0, Graphics arg1, int arg2, int arg3) {
        this.method1588((byte) -126);
        arg1.drawImage(this.field1531, arg3, arg2, this);
        if (arg0 <= 76) {
            field3674 = -68;
        }
        field3677++;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V", line = 160)
    public static final void method1590(int arg0) {
        class260.field4332.method839(-11677);
        for (int var1 = 0; var1 < 32; var1++) {
            class105.field1912[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class268.field4491[var2] = 0L;
        }
        field3667++;
        class206.field3477 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 192)
    public final void method11(int arg0, int arg1, int arg2, Component arg3) {
        this.field1532 = arg2;
        if (arg1 != -9750) {
            return;
        }
        this.field1529 = arg0;
        this.field1526 = new int[arg0 * arg2 + 1];
        field3665++;
        this.field3664 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1531 = arg3.createImage(this);
        this.method1588((byte) -98);
        arg3.prepareImage(this.field1531, this);
        this.method1588((byte) -100);
        arg3.prepareImage(this.field1531, this);
        this.method1588((byte) -125);
        arg3.prepareImage(this.field1531, this);
        this.method654(false);
    }

    @OriginalMember(owner = "client!lj", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 221)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field3666++;
        this.field3669 = arg0;
        arg0.setDimensions(this.field1529, this.field1532);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3664);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V", line = 240)
    public final void method12(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3672++;
        this.method1591(-33, arg0, arg3, arg2, arg5);
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg0, arg5, arg3, arg2);
        arg1.drawImage(this.field1531, 0, 0, this);
        arg1.setClip(var7);
        int var8 = 111 % ((arg4 - 24) / 39);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIII)V", line = 257)
    private final synchronized void method1591(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3675++;
        if (this.field3669 == null) {
            return;
        }
        this.field3669.setPixels(arg1, arg4, arg2, arg3, this.field3664, this.field1526, this.field1529 * arg4 + arg1, this.field1529);
        this.field3669.imageComplete(2);
        if (arg0 != -33) {
            field3670 = (class18) null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 273)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3669 == arg0) {
            this.field3669 = null;
        }
        field3673++;
    }

    @OriginalMember(owner = "client!lj", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 283)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field3660++;
    }
}
