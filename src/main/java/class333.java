import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class333 extends class270 {

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    private int field4772 = 1;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    private int field4771 = 1;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field4779 = new String[100];

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4778 = "flash2:";

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static volatile int field4777 = 0;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Lbn;")
    public static class153 field4770 = new class153();

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
    public static int field4785 = -1;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field4775;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "[Lof;")
    public static class421[] field4784;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)V", line = 3)
    public static final void method2177(byte arg0) {
        ++field4781;
        class211.field3137.method1228(-30653);
        class242.field3523.method1228(-30653);
        int var1 = -11 / ((-31 - arg0) / 50);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(JZBII)Ljava/lang/String;", line = 17)
    public static final String method2178(long arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        ++field4780;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg3 == 2) {
            var7 = 160;
        }
        boolean var8 = false;
        if (arg2 != 21) {
            method2177((byte) -16);
        }
        if (arg0 < 0L) {
            arg0 = -arg0;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (~arg4 < -1) {
            for (int var10 = 0; var10 < arg4; ++var10) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (48 - (int) arg0 * 10 + var11));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (48 - -var13 - (int) arg0 * 10));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                ++var12;
                if (~(var12 % 3) == -1) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIBI)V", line = 95)
    public static final void method2179(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field4774;
        int var6 = class102.method843(arg3, class383.field5497, class308.field4507, 0);
        int var7 = class102.method843(arg2, class383.field5497, class308.field4507, 0);
        if (arg4 < 6) {
            method2179(112, -52, 97, -115, (byte) -64, 120);
        }
        int var8 = class102.method843(arg5, class278.field4184, class185.field2727, 0);
        int var9 = class102.method843(arg0, class278.field4184, class185.field2727, 0);
        for (int var10 = var6; var10 <= var7; ++var10) {
            class47.method379(var9, (byte) 91, arg1, class286.field4283[var10], var8);
        }
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(B)Liq;", line = 123)
    public static final class221 method2180(byte arg0) {
        ++field4783;
        if (arg0 != -28) {
            method2181(55);
        }
        class221 var1 = (class221) class292.field4339.method1565(arg0 ^ -27);
        if (var1 != null) {
            var1.method251(111);
            var1.method1398(110);
            return var1;
        } else {
            class221 var2;
            do {
                var2 = (class221) class41.field633.method1565(1);
                if (var2 == null) {
                    return null;
                }
                if (~var2.method1688(-32174) < ~class10.method63(-21149)) {
                    return null;
                }
                var2.method251(56);
                var2.method1398(110);
            } while ((var2.field2671 & Long.MIN_VALUE) == 0L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)[I", line = 165)
    public final int[] method81(byte arg0, int arg1) {
        if (arg0 <= 26) {
            this.method123(false, -120);
        }
        ++field4776;
        int[] var3 = super.field4053.method396(arg1, 77);
        if (super.field4053.field815) {
            int var4 = this.field4771 + this.field4771 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4772 + this.field4772 - -1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field4771; var9 <= arg1 - -this.field4771; ++var9) {
                int[] var13 = this.method1927(0, 0, var9 & class30.field442);
                int[] var14 = new int[class161.field2445];
                int var15 = 0;
                for (int var16 = -this.field4772; this.field4772 >= var16; ++var16) {
                    var15 += var13[class267.field3997 & var16];
                }
                int var17 = 0;
                while (class161.field2445 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field4772 + var17 & class267.field3997];
                    ++var17;
                    var15 = var13[class267.field3997 & this.field4772 + var17] + var18;
                }
                var8[-arg1 + var9 + this.field4771] = var14;
            }
            for (int var10 = 0; ~class161.field2445 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)[[I", line = 256)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field4782;
        if (!arg0) {
            method2178(-12L, true, (byte) -43, 21, -27);
        }
        int[][] var3 = super.field4046.method244(arg1, 123);
        if (super.field4046.field488) {
            int var4 = this.field4771 + this.field4771 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4772 + 1 + this.field4772;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field4771 + arg1; var9 <= this.field4771 + arg1; ++var9) {
                int[][] var19 = this.method1930(class30.field442 & var9, 0, (byte) -75);
                int[][] var20 = new int[3][class161.field2445];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field4772; ~this.field4772 <= ~var27; ++var27) {
                    int var37 = class267.field3997 & var27;
                    var21 += var24[var37];
                    var22 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class161.field2445 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field4772 + var31 & class267.field3997;
                    int var33 = var21 - var24[var32];
                    int var34 = var23 - var26[var32];
                    ++var31;
                    int var35 = var22 - var25[var32];
                    int var36 = class267.field3997 & this.field4772 + var31;
                    var22 = var25[var36] + var35;
                    var21 = var24[var36] + var33;
                    var23 = var26[var36] + var34;
                }
                var8[var9 - -this.field4771 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class161.field2445; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLec;I)V", line = 394)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 108) {
            this.method81((byte) -37, 54);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field4055 = ~arg1.method271((byte) 109) == -2;
                }
            } else {
                this.field4771 = arg1.method271((byte) 103);
            }
        } else {
            this.field4772 = arg1.method271((byte) 103);
        }
        ++field4773;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 436)
    public class333() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V", line = 458)
    public static void method2181(int arg0) {
        field4779 = null;
        field4778 = null;
        if (arg0 <= 28) {
            method2181(72);
        }
        field4784 = null;
        field4775 = null;
        field4770 = null;
    }
}
