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

@OriginalClass("client!ub")
public class class87 extends class254 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field1734 = 2301979;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "Loh;")
    public static class263 field1752 = class253.method1681(-117, "leuchten1:");

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "[I")
    public static int[] field1755 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1745;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1737;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I")
    public static final int method606(int arg0) {
        if (arg0 != 6) {
            return 18;
        } else {
            ++field1756;
            return 6;
        }
    }

    @OriginalMember(owner = "client!ub", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1736;
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method607(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        ++field1735;
        this.method609(arg5, arg4, (byte) 105, arg2, arg1);
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg1, arg4, arg5, arg2);
        arg3.drawImage(super.field4414, 0, 0, this);
        arg3.setClip(var7);
        if (arg0 > -51) {
            this.method616(97);
        }
    }

    @OriginalMember(owner = "client!ub", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1737 = arg0;
        arg0.setDimensions(super.field4416, super.field4419);
        ++field1741;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1745);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
    public final void method608(Component arg0, int arg1, boolean arg2, int arg3) {
        super.field4416 = arg1;
        super.field4423 = new int[arg1 * arg3 + 1];
        super.field4419 = arg3;
        this.field1745 = new DirectColorModel(32, 16711680, 65280, 255);
        ++field1747;
        super.field4414 = arg0.createImage(this);
        this.method616(128);
        arg0.prepareImage(super.field4414, this);
        this.method616(128);
        arg0.prepareImage(super.field4414, this);
        this.method616(128);
        arg0.prepareImage(super.field4414, this);
        this.method1690(-121);
        if (!arg2) {
            field1750 = 69;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIBII)V")
    private final synchronized void method609(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field1740;
        if (this.field1737 != null) {
            this.field1737.setPixels(arg4, arg1, arg0, arg3, this.field1745, super.field4423, super.field4416 * arg1 + arg4, super.field4416);
            this.field1737.imageComplete(2);
            if (arg2 < 83) {
                method610(19, 75, -119);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Laa;")
    public static final class165 method610(int arg0, int arg1, int arg2) {
        class2 var3 = class18.field417[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class165 var4 = var3.field52;
            var3.field52 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ub", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1749;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method611(int arg0, byte arg1, Graphics arg2, int arg3) {
        this.method616(128);
        int var5 = -21 % ((63 - arg1) / 33);
        ++field1743;
        arg2.drawImage(super.field4414, arg0, arg3, this);
    }

    @OriginalMember(owner = "client!ub", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1751;
    }

    @OriginalMember(owner = "client!ub", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1739;
        if (this.field1737 == arg0) {
            this.field1737 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLue;Lue;)V")
    public static final void method612(byte arg0, class86 arg1, class86 arg2) {
        class11.field243 = class71.method456(arg2, arg1, 0, 0, class130.field2385);
        class150.field2707 = (class192) class11.field243;
        if (arg0 < 57) {
            field1755 = null;
        }
        class151.field2733 = class71.method456(arg2, arg1, 0, 0, class36.field844);
        class107.field2026 = class71.method456(arg2, arg1, 0, 0, class220.field3899);
        ++field1746;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lue;ILue;)V")
    public static final void method613(class86 arg0, int arg1, class86 arg2) {
        if (arg1 != 128) {
            field1752 = null;
        }
        class257.field4470 = arg0;
        class269.field4739 = arg2;
        ++field1753;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static void method614(byte arg0) {
        if (arg0 == -82) {
            field1755 = null;
            field1752 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lah;I)V")
    public static final void method615(class267 arg0, int arg1) {
        ++field1738;
        if (~class228.field4012 == ~arg0.field4659 || ~arg0.field4694 == 0 || arg0.field4662 != 0 || ~(arg0.field4717 + 1) < ~class186.method1226(12828, arg0.field4694).field4219[arg0.field4718]) {
            int var2 = -arg0.field4663 + arg0.field4659;
            int var3 = -arg0.field4663 + class228.field4012;
            int var4 = arg0.field4648 * 128 - -(64 * arg0.method898(85));
            int var5 = arg0.field4695 * 128 + 64 * arg0.method898(96);
            int var6 = arg0.field4673 * 128 - -(64 * arg0.method898(120));
            int var7 = arg0.field4656 * 128 + 64 * arg0.method898(52);
            arg0.field4705 = ((-var3 + var2) * var5 + var3 * var7) / var2;
            arg0.field4688 = ((-var3 + var2) * var4 + var3 * var6) / var2;
        }
        if (arg1 != 16040) {
            field1750 = 84;
        }
        if (arg0.field4712 == 0) {
            arg0.field4674 = 1024;
        }
        arg0.field4704 = 0;
        if (arg0.field4712 == 1) {
            arg0.field4674 = 1536;
        }
        if (arg0.field4712 == 2) {
            arg0.field4674 = 0;
        }
        if (~arg0.field4712 == -4) {
            arg0.field4674 = 512;
        }
        arg0.field4700 = arg0.field4674;
    }

    @OriginalMember(owner = "client!ub", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1733;
        return this.field1737 == arg0;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    private final synchronized void method616(int arg0) {
        if (arg0 == 128) {
            ++field1744;
            if (this.field1737 != null) {
                this.field1737.setPixels(0, 0, super.field4416, super.field4419, this.field1745, super.field4423, 0, super.field4416);
                this.field1737.imageComplete(2);
            }
        }
    }
}
