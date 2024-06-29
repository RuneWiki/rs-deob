import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class234 {

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Z")
    public boolean field3879 = false;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[I")
    private int[] field3882 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public int field3884 = -1;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "Lpd;")
    public static class253 field3888 = new class253(5000);

    @OriginalMember(owner = "client!va", name = "s", descriptor = "Ltl;")
    public static class59 field3891 = class85.method639(" <col=ffffff>", 9588);

    @OriginalMember(owner = "client!va", name = "v", descriptor = "[S")
    public static short[] field3894 = new short[] { 18, 9, 14, 31, 24, 17, 57, 28 };

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Ltl;")
    public static class59 field3895 = class85.method639("rect_debug=", 9588);

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Lj;")
    public static class138 field3890 = new class138(128);

    @OriginalMember(owner = "client!va", name = "x", descriptor = "[S")
    public static short[] field3896 = new short[256];

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "Lme;")
    public static class295 field3897;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Ljava/lang/Thread;")
    public static Thread field3892;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
    private int[] field3877;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[S")
    private short[] field3873;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "[S")
    private short[] field3878;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[S")
    private short[] field3881;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "[S")
    private short[] field3886;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Lhe;", line = 15)
    public final class242 method1640(int arg0) {
        field3887++;
        if (this.field3877 == null) {
            return null;
        }
        class242[] var2 = new class242[this.field3877.length];
        if (arg0 >= -103) {
            this.method1640(-14);
        }
        for (int var3 = 0; var3 < this.field3877.length; var3++) {
            var2[var3] = class242.method1716(class264.field4554, this.field3877[var3], 0);
        }
        class242 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class242(var2, var2.length);
        }
        if (this.field3881 != null) {
            for (int var5 = 0; var5 < this.field3881.length; var5++) {
                var4.method1725(this.field3881[var5], this.field3873[var5]);
            }
        }
        if (this.field3886 != null) {
            for (int var6 = 0; var6 < this.field3886.length; var6++) {
                var4.method1711(this.field3886[var6], this.field3878[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)Z", line = 72)
    public final boolean method1641(boolean arg0) {
        field3876++;
        if (this.field3877 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field3877.length; var3++) {
            if (!class264.field4554.method2035(this.field3877[var3], 0, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 109)
    public static void method1642(int arg0) {
        field3896 = null;
        if (arg0 != 4801) {
            return;
        }
        field3891 = null;
        field3892 = null;
        field3897 = null;
        field3895 = null;
        field3888 = null;
        field3890 = null;
        field3894 = null;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)Z", line = 127)
    public final boolean method1643(int arg0) {
        boolean var2 = true;
        if (arg0 != -5308) {
            this.field3879 = true;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3882[var3] != -1 && !class264.field4554.method2035(this.field3882[var3], 0, 0)) {
                var2 = false;
            }
        }
        field3885++;
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIIIII)V", line = 151)
    public static final void method1644(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 > -15) {
            return;
        }
        if (arg2 == arg3 && arg5 == arg6 && arg4 == arg8 && arg1 == arg9) {
            class248.method1742(-1, arg6, arg0, arg3, arg1, arg4);
        } else {
            int var10 = arg3;
            int var11 = arg6;
            int var12 = arg3 * 3;
            int var13 = arg6 * 3;
            int var14 = arg2 * 3;
            int var15 = arg8 * 3;
            int var16 = arg5 * 3;
            int var17 = arg4 + var14 - var15 - arg3;
            int var18 = arg9 * 3;
            int var19 = var15 + var12 - var14 - var14;
            int var20 = var16 - var13;
            int var21 = arg1 + var16 - var18 - arg6;
            int var22 = var14 - var12;
            int var23 = var13 + var18 - var16 - var16;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var21 * var26;
                int var28 = var19 * var25;
                int var29 = var23 * var25;
                int var30 = var20 * var24;
                int var31 = var17 * var26;
                int var32 = var22 * var24;
                int var33 = (var27 + var29 + var30 >> 12) + arg6;
                int var34 = (var31 + var32 + var28 >> 12) + arg3;
                class248.method1742(-1, var11, arg0, var10, var33, var34);
                var10 = var34;
                var11 = var33;
            }
        }
        field3883++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[J[III)V", line = 227)
    public static final void method1645(int arg0, long[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 < 11) {
            return;
        }
        field3880++;
        if (arg0 <= arg4) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg4;
        long var7 = arg1[var5];
        arg1[var5] = arg1[arg0];
        arg1[arg0] = var7;
        int var9 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var9;
        for (int var10 = arg4; var10 < arg0; var10++) {
            if ((long) (var10 & 0x1) + var7 > arg1[var10]) {
                long var11 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6] = var11;
                int var13 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6++] = var13;
            }
        }
        arg1[arg0] = arg1[var6];
        arg1[var6] = var7;
        arg2[arg0] = arg2[var6];
        arg2[var6] = var9;
        method1645(var6 - 1, arg1, arg2, 92, arg4);
        method1645(arg0, arg1, arg2, 30, var6 + 1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILs;I)V", line = 286)
    private final void method1646(int arg0, class170 arg1, int arg2) {
        if (arg2 != -6) {
            field3888 = (class253) null;
        }
        if (arg0 == 1) {
            this.field3884 = arg1.method1221(80);
        } else if (arg0 == 2) {
            int var4 = arg1.method1221(arg2 ^ 0xFFFFFFA2);
            this.field3877 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3877[var5] = arg1.method1214(-18254);
            }
        } else if (arg0 == 3) {
            this.field3879 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1221(80);
            this.field3881 = new short[var6];
            this.field3873 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3881[var7] = (short) arg1.method1214(-18254);
                this.field3873[var7] = (short) arg1.method1214(-18254);
            }
        } else if (arg0 == 41) {
            int var8 = arg1.method1221(74);
            this.field3878 = new short[var8];
            this.field3886 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3886[var9] = (short) arg1.method1214(class310.method2143(arg2, 18248));
                this.field3878[var9] = (short) arg1.method1214(-18254);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field3882[arg0 - 60] = arg1.method1214(-18254);
        }
        field3875++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V", line = 364)
    public static final void method1647(int arg0, int arg1) {
        field3889++;
        class186 var2 = class67.method561(32, arg1, arg0);
        var2.method1381(true);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ls;I)V", line = 374)
    public final void method1648(class170 arg0, int arg1) {
        if (arg1 != 5000) {
            this.method1641(false);
        }
        field3874++;
        while (true) {
            int var3 = arg0.method1221(110);
            if (var3 == 0) {
                return;
            }
            this.method1646(var3, arg0, -6);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)Lhe;", line = 420)
    public final class242 method1649(byte arg0) {
        field3893++;
        if (arg0 > -60) {
            this.method1640(-27);
        }
        int var2 = 0;
        class242[] var3 = new class242[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3882[var4] != -1) {
                var3[var2++] = class242.method1716(class264.field4554, this.field3882[var4], 0);
            }
        }
        class242 var5 = new class242(var3, var2);
        if (this.field3881 != null) {
            for (int var6 = 0; var6 < this.field3881.length; var6++) {
                var5.method1725(this.field3881[var6], this.field3873[var6]);
            }
        }
        if (this.field3886 != null) {
            for (int var7 = 0; var7 < this.field3886.length; var7++) {
                var5.method1711(this.field3886[var7], this.field3878[var7]);
            }
        }
        return var5;
    }
}
