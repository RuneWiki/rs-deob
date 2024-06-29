import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class161 extends class288 {

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    private int field2524;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    private int field2520;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    private int field2511;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    private int field2523;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    private int field2506;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    private int field2513;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    private int field2521;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    private int field2515;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field2510 = 0;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Loh;")
    public static class281 field2504 = new class281(50);

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "[I")
    public static int[] field2527 = new int[14];

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field2526 = 0;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "[I")
    public static int[] field2525 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "[Lfb;")
    public static class30[] field2529 = new class30[14];

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "[[S")
    public static short[][] field2532 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "[I")
    public static int[] field2531 = new int[2];

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "Lhc;")
    public static class235 field2530;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "[I")
    public static int[] field2528;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public static final void method1091(int arg0) {
        class141.field2155 = 0;
        ++field2516;
        class82.field1392 = 0;
        class99.method723(21379);
        class218.method1464(49);
        class45.method324(-128);
        for (int var1 = 0; ~var1 > ~class82.field1392; ++var1) {
            int var4 = class100.field1689[var1];
            if (class192.field2978 != class255.field4082[var4].field2279) {
                if (class255.field4082[var4].field645.method458(-128)) {
                    method1098(12537, class255.field4082[var4]);
                }
                class255.field4082[var4].method327(-81, (class60) null);
                class255.field4082[var4] = null;
            }
        }
        int var2 = 29 / ((-63 - arg0) / 58);
        if (class53.field804 != class236.field3814.field1535) {
            throw new RuntimeException("gnp1 pos:" + class236.field3814.field1535 + " psize:" + class53.field804);
        } else {
            for (int var3 = 0; class70.field1119 > var3; ++var3) {
                if (class255.field4082[class284.field4506[var3]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class70.field1119);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)V")
    public final void method105(int arg0, int arg1, int arg2) {
        if (arg2 > -11) {
            method1093(false, (byte) -5);
        }
        ++field2509;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static final void method1092(byte arg0) {
        if (arg0 == 125) {
            ++field2514;
            class244.field3966.method1898((byte) 33);
            class235.field3773.method1898((byte) 8);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZB)V")
    public static final void method1093(boolean arg0, byte arg1) {
        ++field2522;
        class138.field2114 = new int[104];
        class176.field2759 = new int[104];
        class264.field4193 = new int[5];
        class244.field3973 = new int[104];
        class100.field1675 = new int[104];
        class101.field1695 = new int[104];
        class259.field4137 = 99;
        byte var2;
        if (!arg0) {
            var2 = 4;
        } else {
            var2 = 1;
        }
        if (arg1 > -45) {
            method1094(-84, (byte[]) null);
        }
        class50.field737 = new byte[var2][104][104];
        class86.field1435 = new byte[var2][105][105];
        class240.field3891 = new int[var2][105][105];
        class268.field4272 = new byte[var2][104][104];
        class113.field1852 = new byte[var2][104][104];
        class180.field2818 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1094(int arg0, byte[] arg1) {
        ++field2507;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class175.method1187(arg1, 0, var3, arg0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lji;III)V")
    public static final void method1095(class43 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class142.field2166) {
            class6 var4 = class269.field4298[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field144 != null && var4.field144.field2137.method315()) {
                arg0.method319(var4.field144.field2137, 128, 0, 0, true);
            }
        }
        if (arg3 < class142.field2166) {
            class6 var5 = class269.field4298[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field144 != null && var5.field144.field2137.method315()) {
                arg0.method319(var5.field144.field2137, 0, 0, 128, true);
            }
        }
        if (arg2 < class142.field2166 && arg3 < class280.field4424) {
            class6 var6 = class269.field4298[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field144 != null && var6.field144.field2137.method315()) {
                arg0.method319(var6.field144.field2137, 128, 0, 128, true);
            }
        }
        if (arg2 < class142.field2166 && arg3 > 0) {
            class6 var7 = class269.field4298[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field144 != null && var7.field144.field2137.method315()) {
                arg0.method319(var7.field144.field2137, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[I[III)V")
    public static final void method1096(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        ++field2508;
        if (arg4 != 1) {
            method1100(-127, 18, 102);
        }
        if (~arg0 > ~arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            for (int var9 = arg0; arg3 > var9; ++var9) {
                if (arg1[var9] > var7 - -(var9 & 1)) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method1096(arg0, arg1, arg2, var6 - 1, 1);
            method1096(var6 + 1, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([Ljava/lang/Object;[IIII)V")
    public static final void method1097(Object[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        ++field2503;
        if (arg4 > arg3) {
            int var5 = arg3;
            int var6 = (arg3 - -arg4) / 2;
            int var7 = arg1[var6];
            arg1[var6] = arg1[arg4];
            arg1[arg4] = var7;
            Object var8 = arg0[var6];
            arg0[var6] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; ++var9) {
                if (~((var9 & 1) + var7) < ~arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5] = var10;
                    Object var11 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5++] = var11;
                }
            }
            arg1[arg4] = arg1[var5];
            arg1[var5] = var7;
            arg0[arg4] = arg0[var5];
            arg0[var5] = var8;
            method1097(arg0, arg1, 77, arg3, var5 - 1);
            method1097(arg0, arg1, 55, var5 + 1, arg4);
        }
        if (arg2 < 46) {
            method1097((Object[]) null, (int[]) null, -56, 16, 93);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILsd;)V")
    public static final void method1098(int arg0, class45 arg1) {
        ++field2517;
        if (arg0 != 12537) {
            method1094(-2, (byte[]) null);
        }
        for (class11 var2 = (class11) class102.field1699.method1221(arg0 + -12422); var2 != null; var2 = (class11) class102.field1699.method1227(-10626)) {
            if (var2.field201 == arg1) {
                if (var2.field206 != null) {
                    class257.field4118.method1205(var2.field206);
                    var2.field206 = null;
                }
                var2.method1123(0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public static void method1099(int arg0) {
        field2525 = null;
        field2532 = null;
        if (arg0 != -30533) {
            field2529 = null;
        }
        field2527 = null;
        field2504 = null;
        field2528 = null;
        field2530 = null;
        field2529 = null;
        field2531 = null;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(III)I")
    public static final int method1100(int arg0, int arg1, int arg2) {
        int var3 = -28 / ((arg0 - -5) / 58);
        ++field2512;
        class53 var4 = (class53) class291.field4590.method285((long) arg1, 13821);
        if (var4 == null) {
            return 0;
        } else {
            return ~arg2 <= -1 && ~var4.field813.length < ~arg2 ? var4.field813[arg2] : 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V")
    public final void method104(int arg0, int arg1, int arg2) {
        ++field2519;
        if (arg0 > -31) {
            field2530 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
    public final void method106(int arg0, int arg1, int arg2) {
        ++field2505;
        int var4 = this.field2513 * arg1 >> 12;
        int var5 = this.field2506 * arg1 >> 12;
        int var6 = this.field2521 * arg2 >> 12;
        int var7 = this.field2515 * arg2 >> 12;
        int var8 = this.field2511 * arg2 >> 12;
        if (arg0 != 1429) {
            field2527 = null;
        }
        int var9 = this.field2524 * arg2 >> 12;
        int var10 = this.field2523 * arg1 >> 12;
        int var11 = this.field2520 * arg1 >> 12;
        class232.method1555(var10, super.field4567, var4, var8, var11, var7, var9, var6, var5, (byte) -120);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2524 = arg7;
        this.field2520 = arg6;
        this.field2511 = arg5;
        this.field2523 = arg4;
        this.field2506 = arg0;
        this.field2513 = arg2;
        this.field2521 = arg1;
        this.field2515 = arg3;
    }
}
