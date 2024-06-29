import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class359 extends class238 {

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public int field5160;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public int field5171;

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public static int field5161 = -1;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "[I")
    public static int[] field5163 = new int[2048];

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "[I")
    public static int[] field5167 = new int[100];

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public static int field5169 = 1337;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "[Z")
    public static boolean[] field5166 = new boolean[100];

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field5170 = -1;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "Lef;")
    public static class311 field5168 = new class311(1, 7);

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "Lwf;")
    public static class79 field5172 = new class79(36, 8);

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "Lwf;")
    public static class79 field5173 = new class79(73, 8);

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    public static int field5174 = 0;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "Lb;")
    public static class201 field5162;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lvr;IZLnp;Lqo;I)Z")
    public static final boolean method2227(class80 arg0, int arg1, boolean arg2, class313 arg3, class19 arg4, int arg5) {
        field5164++;
        int var6 = Integer.MAX_VALUE;
        if (!arg2) {
            field5168 = null;
        }
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field235 != null) {
            var8 = class395.field5627 - ((arg0.field978 + arg4.field241 - class395.field5629) * (class395.field5627 - class395.field5639) / (class395.field5624 - class395.field5629));
            var6 = (arg0.field977 + arg4.field242 - class395.field5636) * (class395.field5626 - class395.field5622) / (class395.field5619 - class395.field5636) + class395.field5622;
            var9 = class395.field5627 - ((arg4.field263 + arg0.field978 - class395.field5629) * (class395.field5627 - class395.field5639) / (class395.field5624 - class395.field5629));
            var7 = (class395.field5626 - class395.field5622) * (arg0.field977 + arg4.field264 - class395.field5636) / (class395.field5619 - class395.field5636) + class395.field5622;
        }
        class176 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg4.field227 != -1) {
            if (arg0.field982 && arg4.field270 != -1) {
                var10 = arg4.method132(1, true, arg3);
            } else {
                var10 = arg4.method132(1, false, arg3);
            }
            if (var10 != null) {
                var11 = arg0.field981 - (var10.method516() + 1 >> 1);
                var12 = arg0.field981 + (var10.method516() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var13 = arg0.field975 - (var10.method524() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var14 = arg0.field975 + (var10.method524() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class358 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg4.field236 != null) {
            var15 = class382.method2302(0, arg4.field250);
            if (var15 != null) {
                var16 = class293.field4252.method859((byte) 93, (int[]) null, class107.field1342, arg4.field236, (class176[]) null);
                int var23 = arg0.field975;
                if (var10 == null) {
                    var17 = var23 - var15.method2225() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method524() >> 1) + (var15.method2223() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class107.field1342[var24];
                    if (var16 - 1 > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2224(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg0.field981 + arg1 - (var18 / 2);
                if (var6 > var19) {
                    var6 = var19;
                }
                var20 = var18 / 2 + (arg0.field981 + arg1);
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = var17 + arg5;
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = var17 + var15.method2223() * var16 + arg5;
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class395.field5622 > var7 || class395.field5626 < var6 || var9 < class395.field5639 || class395.field5627 < var8) {
            return true;
        }
        if (arg4.field235 != null) {
            int[] var27 = new int[arg4.field235.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg4.field235[var28 * 2] + arg0.field977;
                int var31 = arg4.field235[var28 * 2 + 1] + arg0.field978;
                var27[var28 * 2] = (var30 - class395.field5636) * (class395.field5626 - class395.field5622) / (class395.field5619 - class395.field5636) + class395.field5622;
                var27[var28 * 2 + 1] = class395.field5627 - ((var31 - class395.field5629) * (class395.field5627 - class395.field5639) / (class395.field5624 - class395.field5629));
            }
            class316.method2020(arg3, var27, arg4.field231);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg3.method1938(var27[(var29 + 1) * 2 + 1], var27[var29 * 2 + 2], var27[var29 * 2 + 1], arg4.field258, (byte) 108, var27[var29 * 2]);
            }
            arg3.method1938(var27[1], var27[0], var27[var27.length - 1], arg4.field258, (byte) 108, var27[var27.length - 2]);
        }
        if (var10 != null) {
            if (class303.field4313 > 0 && (class269.field3930 != -1 && class269.field3930 == arg0.field980 || class479.field6719 != -1 && class479.field6719 == arg4.field238)) {
                int var32;
                if (class393.field5582 <= 50) {
                    var32 = class393.field5582 * 2;
                } else {
                    var32 = (100 - class393.field5582) * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg3.method1940(arg0.field975, arg0.field981, var33, var10.method518() / 2 + 7, (byte) -111);
                arg3.method1940(arg0.field975, arg0.field981, var33, var10.method518() / 2 + 5, (byte) -111);
                arg3.method1940(arg0.field975, arg0.field981, var33, var10.method518() / 2 + 3, (byte) -111);
                arg3.method1940(arg0.field975, arg0.field981, var33, var10.method518() / 2 + 1, (byte) -111);
                arg3.method1940(arg0.field975, arg0.field981, var33, var10.method518() / 2, (byte) -111);
            }
            var10.method1079(arg0.field981 - (var10.method516() >> 1), arg0.field975 + -(var10.method524() >> 1));
        }
        if (arg4.field236 != null && var15 != null) {
            class460.method2693(arg0, (byte) 54, var18, var16, arg3, arg4, var17, var15);
        }
        if (arg4.field227 != -1 || arg4.field236 != null) {
            class38 var34 = new class38(arg0);
            var34.field494 = var12;
            var34.field498 = var11;
            var34.field500 = var21;
            var34.field501 = var22;
            var34.field499 = var14;
            var34.field505 = var13;
            var34.field507 = var19;
            var34.field497 = var20;
            class65.field839.method2845(var34, (byte) 37);
        }
        return false;
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)V")
    public static void method2228(byte arg0) {
        int var1 = -43 % ((-arg0 - 58) / 58);
        field5166 = null;
        field5167 = null;
        field5163 = null;
        field5168 = null;
        field5162 = null;
        field5172 = null;
        field5173 = null;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(II)V")
    public class359(int arg0, int arg1) {
        this.field5160 = arg0;
        this.field5171 = arg1;
    }
}
