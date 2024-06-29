import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class277 {

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public int field4750 = 128;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    private int field4751 = 0;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Z")
    public boolean field4757 = true;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public int field4754 = -1;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Z")
    public static boolean field4749 = false;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Lve;")
    public static class255 field4748 = class87.method607(24, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "Z")
    public static boolean field4760 = false;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Lve;")
    public static class255 field4767 = class87.method607(33, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field4764 = 0;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field4768 = 0;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "[[[I")
    public static int[][][] field4763 = new int[2][][];

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public int field4747;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public int field4759;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public int field4762;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "Lfj;")
    public static class228 field4766;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Lph;")
    public static class71 field4761;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "[[[S")
    public static short[][][] field4753;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLpb;)Ljg;", line = 4)
    public static final class288 method1935(byte arg0, class70 arg1) {
        field4758++;
        class288 var2 = new class288();
        if (arg0 > -53) {
            method1940((byte) -109);
        }
        var2.field4959 = arg1.method423(255);
        var2.field4952 = class38.method225(1, var2.field4959);
        return var2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBILpb;)V", line = 19)
    private final void method1936(int arg0, byte arg1, int arg2, class70 arg3) {
        if (arg2 == 1) {
            this.field4751 = arg3.method465(true);
            this.method1938(this.field4751, (byte) 119);
        } else if (arg2 == 2) {
            this.field4754 = arg3.method423(255);
            if (this.field4754 == 65535) {
                this.field4754 = -1;
            }
        } else if (arg2 == 3) {
            this.field4750 = arg3.method423(255);
        } else if (arg2 == 4) {
            this.field4757 = false;
        }
        if (arg1 < -7) {
            field4756++;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)I", line = 76)
    public static final int method1937(int arg0, int arg1, int arg2) {
        field4765++;
        if (arg2 != 0) {
            return -124;
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)V", line = 102)
    private final void method1938(int arg0, byte arg1) {
        field4752++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = 0.0D;
        double var11 = var3;
        if (var3 < var7) {
            var11 = var7;
        }
        double var13 = var3;
        if (var3 > var7) {
            var13 = var7;
        }
        if (arg1 != 119) {
            return;
        }
        if (var5 < var13) {
            var13 = var5;
        }
        double var15 = 0.0D;
        if (var5 > var11) {
            var11 = var5;
        }
        double var17 = (var11 + var13) / 2.0D;
        this.field4762 = (int) (var17 * 256.0D);
        if (this.field4762 < 0) {
            this.field4762 = 0;
        } else if (this.field4762 > 255) {
            this.field4762 = 255;
        }
        if (var11 != var13) {
            if (var3 == var11) {
                var9 = (var7 - var5) / (var11 - var13);
            } else if (var7 == var11) {
                var9 = (var5 - var3) / (var11 - var13) + 2.0D;
            } else if (var5 == var11) {
                var9 = (var3 - var7) / (var11 - var13) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var13) / (var11 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var13) / (2.0D - var11 - var13);
            }
        }
        if ((var17 > 0.5D)) {
            this.field4747 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4747 = (int) (var15 * var17 * 512.0D);
        }
        double var19 = var9 / 6.0D;
        if (this.field4747 < 1) {
            this.field4747 = 1;
        }
        this.field4759 = (int) (var15 * 256.0D);
        if (this.field4759 < 0) {
            this.field4759 = 0;
        } else if (this.field4759 > 255) {
            this.field4759 = 255;
        }
        this.field4755 = (int) ((double) this.field4747 * var19);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILpb;Z)V", line = 224)
    public final void method1939(int arg0, class70 arg1, boolean arg2) {
        field4746++;
        if (!arg2) {
            return;
        }
        while (true) {
            int var4 = arg1.method481(0);
            if (var4 == 0) {
                return;
            }
            this.method1936(arg0, (byte) -114, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 254)
    public static void method1940(byte arg0) {
        field4753 = (short[][][]) null;
        field4766 = null;
        field4763 = (int[][][]) null;
        field4761 = null;
        field4748 = null;
        field4767 = null;
        if (arg0 >= -102) {
            method1935((byte) -100, (class70) null);
        }
    }
}
