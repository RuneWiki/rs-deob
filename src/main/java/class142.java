import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class142 extends class71 {

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "Z")
    public static boolean field2018 = false;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    public int field2025;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "Luv;")
    public class755 field2017;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "Luv;")
    public class755 field2020;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "Ljava/lang/String;")
    public String field2016;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "Z")
    public boolean field2026;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field2024;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "[[[J")
    public static long[][][] field2015;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 4)
    public static void method934(int arg0) {
        if (arg0 != 1) {
            method935(null, 124, null, 81, null, 100, -7, 5, -111);
        }
        field2015 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Luv;ILaa;ILha;IIII)V", line = 21)
    public static final void method935(class755 arg0, int arg1, class573 arg2, int arg3, class548 arg4, int arg5, int arg6, int arg7, int arg8) {
        field2021++;
        if (arg3 != 2) {
            method934(16);
        }
        class21 var9 = class700.field9771.method11(arg3 + 114, arg8);
        if (var9 == null || !var9.field228 || !var9.method109(false, class124.field1712)) {
            return;
        }
        if (var9.field222 != null) {
            int[] var10 = new int[var9.field222.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var28;
                if (class720.field10023 == 4) {
                    var28 = (int) class596.field8093 & 0x3FFF;
                } else {
                    var28 = (int) class596.field8093 + class439.field6126 & 0x3FFF;
                }
                int var29 = class24.field312[var28];
                int var30 = class24.field308[var28];
                if (class720.field10023 != 4) {
                    var30 = var30 * 256 / (class31.field372 + 256);
                    var29 = var29 * 256 / (class31.field372 + 256);
                }
                var10[var11 * 2] = ((var9.field222[var11 * 2] * 4 + arg1) * var30 + (var9.field222[var11 * 2 + 1] * 4 + arg6) * var29 >> 14) + arg0.field10393 / 2 + arg7;
                var10[var11 * 2 + 1] = arg5 + (arg0.field10501 / 2) - ((var9.field222[var11 * 2 + 1] * 4 + arg6) * var30 + -((var9.field222[var11 * 2] * 4 + arg1) * var29) >> 14);
            }
            class403.method2525(arg4, var10, var9.field203, arg0.field10464, arg0.field10461);
            if (var9.field232 > 0) {
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    int var20 = var10[var12 * 2];
                    int var21 = var10[var12 * 2 + 1];
                    int var22 = var10[var12 * 2 + 2];
                    int var23 = var10[(var12 + 1) * 2 + 1];
                    if (var22 < var20) {
                        int var25 = var20;
                        var20 = var22;
                        int var26 = var21;
                        var22 = var25;
                        var21 = var23;
                        var23 = var26;
                    } else if (var20 == var22 && var23 < var21) {
                        int var24 = var21;
                        var21 = var23;
                        var23 = var24;
                    }
                    arg4.method1522(var20, var21, var22, var23, var9.field242[var9.field240[var12] & 0xFF], 1, arg2, arg7, arg5, var9.field232, var9.field237, var9.field207);
                }
                int var13 = var10[var10.length - 2];
                int var14 = var10[var10.length - 1];
                int var15 = var10[0];
                int var16 = var10[1];
                if (var13 > var15) {
                    int var17 = var13;
                    var13 = var15;
                    int var18 = var14;
                    var15 = var17;
                    var14 = var16;
                    var16 = var18;
                } else if (var13 == var15 && var16 < var14) {
                    int var19 = var14;
                    var14 = var16;
                    var16 = var19;
                }
                arg4.method1522(var13, var14, var15, var16, var9.field242[var9.field240[var9.field240.length - 1] & 0xFF], 1, arg2, arg7, arg5, var9.field232, var9.field237, var9.field207);
            } else {
                for (int var27 = 0; var27 < (var10.length / 2 - 1); var27++) {
                    arg4.method1470(var10[var27 * 2], var10[var27 * 2 + 1], var10[(var27 + 1) * 2], var10[var27 * 2 + 2 + 1], var9.field242[var9.field240[var27] & 0xFF], 1, arg2, arg7, arg5);
                }
                arg4.method1470(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field242[var9.field240[var9.field240.length - 1] & 0xFF], 1, arg2, arg7, arg5);
            }
        }
        class298 var31 = null;
        if (var9.field244 != -1) {
            var31 = var9.method110(arg3 - 109, arg4, false);
            if (var31 != null) {
                class381.method2388(arg0, arg7, arg2, arg6, arg1, (byte) 91, arg5, var31);
            }
        }
        if (var9.field210 == null) {
            return;
        }
        int var32 = 0;
        if (var31 != null) {
            var32 = var31.method1952();
        }
        class402 var33 = class1.field14;
        class179 var34 = class488.field6818;
        if (var9.field233 == 1) {
            var34 = class524.field7280;
            var33 = class272.field3950;
        }
        if (var9.field233 == 2) {
            var33 = class758.field10575;
            var34 = class535.field7417;
        }
        class387.method2431(var9.field236, arg6, arg0, var32, (byte) -74, var34, arg2, arg1, var9.field210, var33, arg7, arg5);
        return;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(CB)Z", line = 201)
    public static final boolean method936(char arg0, byte arg1) {
        field2014++;
        int var2 = 50 % ((arg1 + 80) / 36);
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }
}
