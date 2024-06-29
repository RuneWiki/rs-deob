import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class104 {

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Led;")
    private static class43 field1972 = class191.method1219("May", false);

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Led;")
    private static class43 field1976 = class191.method1219("Jan", false);

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Led;")
    private static class43 field1982 = class191.method1219("Jun", false);

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Led;")
    private static class43 field1980 = class191.method1219("Feb", false);

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Led;")
    private static class43 field1975 = class191.method1219("Dec", false);

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Led;")
    private static class43 field1993 = class191.method1219("Oct", false);

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Led;")
    private static class43 field1992 = class191.method1219("Jul", false);

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Led;")
    private static class43 field1986 = class191.method1219("Apr", false);

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field1994 = 0;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Led;")
    private static class43 field1977 = class191.method1219("button near the top of that page)3", false);

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Led;")
    private static class43 field1988 = class191.method1219("Aug", false);

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Led;")
    public static class43 field1981 = field1977;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Led;")
    private static class43 field1995 = class191.method1219("Mar", false);

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Led;")
    private static class43 field1991 = class191.method1219("Ok", false);

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Led;")
    private static class43 field1974 = class191.method1219("Nov", false);

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Led;")
    public static class43 field1989 = field1991;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "Led;")
    private static class43 field1996 = class191.method1219("Sep", false);

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "[Led;")
    public static class43[] field1990 = new class43[] { field1976, field1980, field1995, field1986, field1972, field1982, field1992, field1988, field1996, field1993, field1974, field1975 };

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Ljg;")
    public static class89 field1979;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        if (arg1 != -101) {
            field1988 = null;
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class84.field1652[var12][var36] = 0;
                class145.field2978[var12][var36] = 99999999;
            }
        }
        int var13 = arg6;
        class84.field1652[arg6][arg2] = 99;
        class145.field2978[arg6][arg2] = 0;
        field1978++;
        int var14 = arg2;
        byte var15 = 0;
        int var16 = 0;
        class18.field303[var15] = arg6;
        boolean var17 = false;
        int var37 = var15 + 1;
        class147.field3012[var15] = arg2;
        int var18 = class18.field303.length;
        int[][] var19 = class147.field3011[class93.field1839].field3094;
        while (var37 != var16) {
            var14 = class147.field3012[var16];
            var13 = class18.field303[var16];
            var16 = (var16 + 1) % var18;
            if (arg4 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class147.field3011[class93.field1839].method964(arg7, arg10 - 1, arg3, arg4, var13, var14, (byte) -110)) {
                    var17 = true;
                    break;
                }
                if (arg10 < 10 && class147.field3011[class93.field1839].method968(arg7, var14, arg3, arg4, arg10 - 1, var13, 3)) {
                    var17 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg0 != 0 && class147.field3011[class93.field1839].method965(arg3, arg5, 128, var13, var14, arg11, arg0, arg4)) {
                var17 = true;
                break;
            }
            int var35 = class145.field2978[var13][var14] + 1;
            if (var13 > 0 && class84.field1652[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class18.field303[var37] = var13 - 1;
                class147.field3012[var37] = var14;
                class84.field1652[var13 - 1][var14] = 2;
                class145.field2978[var13 - 1][var14] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && class84.field1652[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class18.field303[var37] = var13 + 1;
                class147.field3012[var37] = var14;
                class84.field1652[var13 + 1][var14] = 8;
                class145.field2978[var13 + 1][var14] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 > 0 && class84.field1652[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class18.field303[var37] = var13;
                class147.field3012[var37] = var14 - 1;
                class84.field1652[var13][var14 - 1] = 1;
                class145.field2978[var13][var14 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var14 < 103 && class84.field1652[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class18.field303[var37] = var13;
                class147.field3012[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class84.field1652[var13][var14 + 1] = 4;
                class145.field2978[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class84.field1652[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class18.field303[var37] = var13 - 1;
                class147.field3012[var37] = var14 - 1;
                class84.field1652[var13 - 1][var14 - 1] = 3;
                class145.field2978[var13 - 1][var14 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && var14 > 0 && class84.field1652[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class18.field303[var37] = var13 + 1;
                class147.field3012[var37] = var14 - 1;
                class84.field1652[var13 + 1][var14 - 1] = 9;
                class145.field2978[var13 + 1][var14 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && var14 < 103 && class84.field1652[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class18.field303[var37] = var13 - 1;
                class147.field3012[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class84.field1652[var13 - 1][var14 + 1] = 6;
                class145.field2978[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class84.field1652[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class18.field303[var37] = var13 + 1;
                class147.field3012[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class84.field1652[var13 + 1][var14 + 1] = 12;
                class145.field2978[var13 + 1][var14 + 1] = var35;
            }
        }
        class21.field353 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg4 - var22; var23 <= arg4 + var22; var23++) {
                for (int var24 = arg3 - var22; var24 <= arg3 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class145.field2978[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg4 > var23) {
                            var25 = arg4 - var23;
                        } else if (arg4 + arg11 - 1 < var23) {
                            var25 = var23 + 1 - arg4 - arg11;
                        }
                        int var26 = 0;
                        if (var24 < arg3) {
                            var26 = arg3 - var24;
                        } else if (var24 > arg0 + arg3 - 1) {
                            var26 = var24 + 1 - arg0 - arg3;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && var21 > class145.field2978[var23][var24]) {
                            var20 = var27;
                            var21 = class145.field2978[var23][var24];
                            var13 = var23;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg6 == var13 && arg2 == var14) {
                return false;
            }
            class21.field353 = 1;
        }
        byte var28 = 0;
        class18.field303[var28] = var13;
        int var38 = var28 + 1;
        class147.field3012[var28] = var14;
        int var29;
        int var30 = var29 = class84.field1652[var13][var14];
        while (arg6 != var13 || arg2 != var14) {
            if (var29 != var30) {
                var29 = var30;
                class18.field303[var38] = var13;
                class147.field3012[var38++] = var14;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class84.field1652[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class18.field303[var38];
            int var33 = class147.field3012[var38];
            if (arg9 == 0) {
                class67.field1339++;
                class29.field522.method338(253, 223);
                class29.field522.method539(var31 + var31 + 3, 27678);
            }
            if (arg9 == 1) {
                class127.field2524++;
                class29.field522.method338(253, 198);
                class29.field522.method539(var31 + var31 + 3 + 14, 27678);
            }
            if (arg9 == 2) {
                class29.field522.method338(253, 150);
                class201.field3950++;
                class29.field522.method539(var31 + var31 + 3, 27678);
            }
            class29.field522.method539(class101.field1935[82] ? 1 : 0, 27678);
            class29.field522.method556(arg1 + 206, class170.field3393 + var32);
            class124.field2457 = class18.field303[0];
            class35.field631 = class147.field3012[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class29.field522.method576(class18.field303[var38] - var32, 128);
                class29.field522.method576(class147.field3012[var38] - var33, 128);
            }
            class29.field522.method572((byte) 67, class83.field1641 + var33);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method643(int arg0) {
        field1984++;
        class194.field3788.method1108((byte) -90);
        int var1 = 51 / (-arg0 / 56);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Led;BI)V")
    public static final void method644(class43 arg0, byte arg1, int arg2) {
        if (arg1 != 31) {
            return;
        }
        field1970++;
        class43 var3 = arg0.method236(10).method273(-46);
        boolean var4 = false;
        for (int var5 = 0; var5 < class170.field3399; var5++) {
            class1 var6 = class12.field183[class125.field2472[var5]];
            if (var6 != null && var6.field23 != null && var6.field23.method250(arg1 ^ 0x20, var3)) {
                method642(1, arg1 ^ 0xFFFFFF84, class67.field1348.field2335[0], var6.field2335[0], var6.field2357[0], 0, class67.field1348.field2357[0], 0, false, 2, 0, 1);
                if (arg2 == 1) {
                    class29.field522.method338(253, 153);
                    class29.field522.method556(124, class125.field2472[var5]);
                    class98.field1895++;
                } else if (arg2 == 4) {
                    class29.field522.method338(253, 247);
                    class167.field3299++;
                    class29.field522.method572((byte) 90, class125.field2472[var5]);
                } else if (arg2 == 6) {
                    class164.field3277++;
                    class29.field522.method338(253, 132);
                    class29.field522.method537(class125.field2472[var5], (byte) 49);
                } else if (arg2 == 7) {
                    class29.field522.method338(arg1 + 222, 80);
                    class29.field522.method556(101, class125.field2472[var5]);
                    class20.field348++;
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class81.method504(class167.method1036(new class43[] { class119.field2385, var3 }, true), class110.field2127, 0, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method645(int arg0) {
        field1981 = null;
        field1993 = null;
        field1992 = null;
        field1989 = null;
        field1996 = null;
        field1974 = null;
        field1995 = null;
        field1977 = null;
        field1991 = null;
        if (arg0 != 0) {
            return;
        }
        field1986 = null;
        field1990 = null;
        field1976 = null;
        field1975 = null;
        field1979 = null;
        field1980 = null;
        field1988 = null;
        field1982 = null;
        field1972 = null;
    }
}
