import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class148 extends class615 {

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    private int field2358 = 4;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    private int field2360 = 4;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public static int field2357 = 50;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "[I")
    public static int[] field2359 = new int[field2357];

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "[I")
    public static int[] field2367 = new int[field2357];

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "[I")
    public static int[] field2363 = new int[field2357];

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "[I")
    public static int[] field2372 = new int[field2357];

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field2369 = new String[field2357];

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "[I")
    public static int[] field2361 = new int[field2357];

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "[I")
    public static int[] field2374 = new int[field2357];

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2364;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)V")
    public static void method1061(byte arg0) {
        field2372 = null;
        field2361 = null;
        field2364 = null;
        field2363 = null;
        field2367 = null;
        field2374 = null;
        if (arg0 == 1) {
            field2359 = null;
            field2369 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)V")
    public static final void method1062(byte arg0) {
        int var1 = 28 / ((arg0 - -16) / 47);
        class292.field4127.method3739(0);
        ++field2365;
        class239.field3366.method3739(0);
        class466.field6276.method3739(0);
        class520.field6953.method3739(0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        ++field2373;
        int[] var3 = super.field8125.method298(arg0, -126);
        if (arg1 != -18) {
            this.method223(98, -64);
        }
        if (super.field8125.field579) {
            int var4 = class505.field6740 / this.field2358;
            int var5 = class471.field6301 / this.field2360;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method3366(0, 997, class471.field6301 * var6 / var5);
            } else {
                var7 = this.method3366(0, arg1 ^ -1013, 0);
            }
            for (int var8 = 0; class505.field6740 > var8; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class505.field6740 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB[Lgba;IZI)V")
    public static final void method1063(int arg0, byte arg1, class625[] arg2, int arg3, boolean arg4, int arg5) {
        ++field2368;
        int var6 = 0;
        int var7 = 16 / ((arg1 - -84) / 37);
        while (~arg2.length < ~var6) {
            class625 var8 = arg2[var6];
            if (var8 != null && var8.field8288 == arg5) {
                class529.method2955(arg4, (byte) -108, var8, arg3, arg0);
                class504.method2796(arg3, var8, (byte) -32, arg0);
                if (~var8.field8365 < ~(-var8.field8350 + var8.field8325)) {
                    var8.field8365 = -var8.field8350 + var8.field8325;
                }
                if (-var8.field8361 + var8.field8364 < var8.field8441) {
                    var8.field8441 = -var8.field8361 + var8.field8364;
                }
                if (var8.field8365 < 0) {
                    var8.field8365 = 0;
                }
                if (~var8.field8441 > -1) {
                    var8.field8441 = 0;
                }
                if (~var8.field8421 == -1) {
                    class209.method1340(var8, arg4, -1);
                }
            }
            ++var6;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class148() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZIIII[B)V")
    public static final void method1064(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        ++field2366;
        if (~arg4 < ~arg1) {
            if (arg0) {
                int var6 = -arg1 + arg4 >> 2;
                int var7 = arg1 + arg2;
                while (true) {
                    --var6;
                    if (var6 < 0) {
                        int var8 = 3 & -arg1 + arg4;
                        while (true) {
                            --var8;
                            if (~var8 > -1) {
                                return;
                            }
                            arg5[var7++] = 1;
                        }
                    }
                    arg5[var7++] = 1;
                    arg5[var7++] = 1;
                    arg5[var7++] = 1;
                    arg5[var7++] = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V")
    public static final void method1065(int arg0, boolean arg1) {
        ++field2362;
        if (arg1 && class567.field7494 != null) {
            class655.field8871 = class567.field7494.field466;
        } else {
            class655.field8871 = -1;
        }
        class567.field7494 = null;
        class699.field9827 = 0;
        class187.field2784 = null;
        class155.field2439 = null;
        class567.method3119();
        class567.field7508.method3255((byte) -88);
        class218.field3095 = null;
        class237.field3348 = null;
        class697.field9786 = null;
        class352.field4811 = null;
        class225.field3188 = null;
        class683.field9616 = -1;
        class154.field2437 = null;
        class398.field5294 = null;
        class615.field8140 = -1;
        class516.field6894 = null;
        class436.field5964 = null;
        class567.field7500 = null;
        if (class567.field7498 != null) {
            class567.field7498.method1486(64);
            class567.field7498.method1491(64, arg0 + -60, 128);
        }
        if (class567.field7493 != null) {
            class567.field7493.method1595(64, 64, -3932);
        }
        if (class567.field7499 != null) {
            class567.field7499.method1259((byte) -82, 64);
        }
        class392.field5167.method610(arg0, arg0 + -24);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ldw;III)V")
    public static final void method1066(class673 arg0, int arg1, int arg2, int arg3) {
        long var4 = class510.field6812[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field9523 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field9524[arg0.field9523++] = class350.field4791[var8 - 1].field3173;
            var6 += 16L;
        }
        for (int var9 = arg0.field9523; var9 < 4; ++var9) {
            arg0.field9524[var9] = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[[I")
    public final int[][] method223(int arg0, int arg1) {
        if (arg0 != 2) {
            return null;
        } else {
            ++field2371;
            int[][] var3 = super.field8129.method2654(false, arg1);
            if (super.field8129.field6315) {
                int var4 = class505.field6740 / this.field2358;
                int var5 = class471.field6301 / this.field2360;
                int[][] var7;
                if (var5 > 0) {
                    int var6 = arg1 % var5;
                    var7 = this.method3368(true, 0, class471.field6301 * var6 / var5);
                } else {
                    var7 = this.method3368(true, 0, 0);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~var14 > ~class505.field6740; ++var14) {
                    int var15;
                    if (~var4 >= -1) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var4;
                        var15 = class505.field6740 * var16 / var4;
                    }
                    var11[var14] = var8[var15];
                    var12[var14] = var9[var15];
                    var13[var14] = var10[var15];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field2360 = arg2.method2034(255);
            }
        } else {
            this.field2358 = arg2.method2034(255);
        }
        if (arg0 <= 44) {
            method1062((byte) -45);
        }
        ++field2370;
    }
}
