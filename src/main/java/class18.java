import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class18 extends class68 {

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Z")
    public static boolean field197 = false;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Z")
    public boolean field190;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "[Lfc;")
    public static class169[] field194;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 4)
    public static final void method115(int arg0) {
        field196++;
        if (class508.field7410 != null) {
            return;
        }
        class508.field7410 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 0;
        if (arg0 != -65537) {
            field195 = -53;
        }
        while (var3 < 65536) {
            double var4 = (double) ((var3 & 0xFCE4) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class508.field7410[var3] = var35;
            var3++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Z", line = 118)
    public static final boolean method116(int arg0, int arg1) {
        if (arg1 == 18289) {
            field198++;
            return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V", line = 129)
    public final void method13(byte arg0) {
        if (arg0 != -89) {
            field195 = -39;
        }
        field200++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIILer;Lqa;IB)V", line = 141)
    public final void method19(boolean arg0, int arg1, int arg2, class68 arg3, class162 arg4, int arg5, byte arg6) {
        field192++;
        if (arg6 > -105) {
            this.method18(81);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)Z", line = 153)
    public final boolean method18(int arg0) {
        if (arg0 < 72) {
            this.field199 = 94;
        }
        field191++;
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 170)
    public static void method117(int arg0) {
        field194 = null;
        int var1 = 103 % ((26 - arg0) / 35);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)Lcv;", line = 181)
    public static final class398 method118(int arg0, boolean arg1) {
        field188++;
        if (!arg1) {
            field197 = true;
        }
        class398[] var2 = class400.method2411(0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class398 var4 = var2[var3];
            if (var4.field5969 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)I", line = 207)
    public static int method119(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
