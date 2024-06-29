import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class345 extends class39 {

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Lwu;")
    public static class543 field4639 = new class543();

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Z")
    public static boolean field4646 = false;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)I")
    public static final int method2057(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field4642++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            int var5 = 47 / ((-arg3 - 71) / 51);
            return 4095 - arg1;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public static final void method2058(byte arg0) {
        field4644++;
        class260.field3265 = 0;
        int var1 = (class362.field4859.field5179 >> 9) + class26.field245;
        int var2 = (class362.field4859.field5176 >> 9) + class231.field2860;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class260.field3265 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class260.field3265 = 1;
        }
        if (class260.field3265 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class260.field3265 = 0;
        }
        if (arg0 != 75) {
            field4646 = false;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Lib;")
    public final class14 method203(byte arg0) {
        field4641++;
        if (arg0 != -92) {
            method2061(true, (byte) -82);
        }
        return class373.field5080;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[B)Lf;")
    public static final class534 method2059(int arg0, byte[] arg1) {
        if (arg0 != 3136) {
            field4639 = null;
        }
        field4643++;
        if (arg1 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                MediaTracker var3 = new MediaTracker(class338.field4252);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class338.field4252);
                int var5 = var2.getHeight(class338.field4252);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class701.field9813.method1017(var6, 0, var4, var4, var5);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    public static void method2060(int arg0) {
        if (arg0 < 76) {
            field4646 = true;
        }
        field4639 = null;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILdba;Lpa;III)V")
    public class345(int arg0, class240 arg1, class648 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4640 = arg5;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZB)V")
    public static final void method2061(boolean arg0, byte arg1) {
        int var2 = -4 / ((arg1 - 19) / 46);
        if (class203.field2404 == null) {
            class133.method750((byte) -125);
        }
        field4645++;
        if (arg0) {
            class203.field2404.method3088((byte) -55);
        }
    }
}
