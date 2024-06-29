import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class8 {

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[I")
    public static int[] field103 = new int[32];

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lde;")
    public static class170 field100 = new class170();

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field105 = -1;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "J")
    public static long field106 = 0L;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Loh;")
    public static class258 field107 = class153.method1046(" )2> <col=00ffff>", 87);

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field108 = 0;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[I")
    public static int[] field109 = new int[4096];

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[[[B")
    public static byte[][][] field101;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZIIIIIIIZI)Z", line = 65)
    public static final boolean method42(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class29.field347[var12][var13] = 0;
                class105.field1885[var12][var13] = 99999999;
            }
        }
        int var14 = arg7;
        class29.field347[arg7][arg6] = 99;
        field102++;
        class105.field1885[arg7][arg6] = 0;
        byte var15 = 0;
        int var16 = 0;
        int var17 = arg6;
        boolean var18 = arg2;
        field109[var15] = arg7;
        int var32 = var15 + 1;
        class185.field3296[var15] = arg6;
        int[][] var19 = class243.field4216[class272.field4704].field4255;
        while (var32 != var16) {
            var14 = field109[var16];
            var17 = class185.field3296[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg1 == var14 && arg8 == var17) {
                var18 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class243.field4216[class272.field4704].method1663(arg1, var14, arg8, arg3, 1, arg5 - 1, 1, var17)) {
                    var18 = true;
                    break;
                }
                if (arg5 < 10 && class243.field4216[class272.field4704].method1666(0, arg1, 1, arg8, var14, arg5 - 1, var17, arg3)) {
                    var18 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg11 != 0 && class243.field4216[class272.field4704].method1679(arg1, arg9, var14, arg11, arg4, arg8, var17, 1, 8)) {
                var18 = true;
                break;
            }
            int var20 = class105.field1885[var14][var17] + 1;
            if (var14 > 0 && class29.field347[var14 - 1][var17] == 0 && (var19[var14 - 1][var17] & 0x12C0108) == 0) {
                field109[var32] = var14 - 1;
                class185.field3296[var32] = var17;
                class29.field347[var14 - 1][var17] = 2;
                class105.field1885[var14 - 1][var17] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && class29.field347[var14 + 1][var17] == 0 && (var19[var14 + 1][var17] & 0x12C0180) == 0) {
                field109[var32] = var14 + 1;
                class185.field3296[var32] = var17;
                class29.field347[var14 + 1][var17] = 8;
                class105.field1885[var14 + 1][var17] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var17 > 0 && class29.field347[var14][var17 - 1] == 0 && (var19[var14][var17 - 1] & 0x12C0102) == 0) {
                field109[var32] = var14;
                class185.field3296[var32] = var17 - 1;
                var32 = var32 + 1 & 0xFFF;
                class29.field347[var14][var17 - 1] = 1;
                class105.field1885[var14][var17 - 1] = var20;
            }
            if (var17 < 103 && class29.field347[var14][var17 + 1] == 0 && (var19[var14][var17 + 1] & 0x12C0120) == 0) {
                field109[var32] = var14;
                class185.field3296[var32] = var17 + 1;
                class29.field347[var14][var17 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class105.field1885[var14][var17 + 1] = var20;
            }
            if (var14 > 0 && var17 > 0 && class29.field347[var14 - 1][var17 - 1] == 0 && (var19[var14 - 1][var17 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var17] & 0x12C0108) == 0 && (var19[var14][var17 - 1] & 0x12C0102) == 0) {
                field109[var32] = var14 - 1;
                class185.field3296[var32] = var17 - 1;
                var32 = var32 + 1 & 0xFFF;
                class29.field347[var14 - 1][var17 - 1] = 3;
                class105.field1885[var14 - 1][var17 - 1] = var20;
            }
            if (var14 < 103 && var17 > 0 && class29.field347[var14 + 1][var17 - 1] == 0 && (var19[var14 + 1][var17 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var17] & 0x12C0180) == 0 && (var19[var14][var17 - 1] & 0x12C0102) == 0) {
                field109[var32] = var14 + 1;
                class185.field3296[var32] = var17 - 1;
                var32 = var32 + 1 & 0xFFF;
                class29.field347[var14 + 1][var17 - 1] = 9;
                class105.field1885[var14 + 1][var17 - 1] = var20;
            }
            if (var14 > 0 && var17 < 103 && class29.field347[var14 - 1][var17 + 1] == 0 && (var19[var14 - 1][var17 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var17] & 0x12C0108) == 0 && (var19[var14][var17 + 1] & 0x12C0120) == 0) {
                field109[var32] = var14 - 1;
                class185.field3296[var32] = var17 + 1;
                var32 = var32 + 1 & 0xFFF;
                class29.field347[var14 - 1][var17 + 1] = 6;
                class105.field1885[var14 - 1][var17 + 1] = var20;
            }
            if (var14 < 103 && var17 < 103 && class29.field347[var14 + 1][var17 + 1] == 0 && (var19[var14 + 1][var17 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var17] & 0x12C0180) == 0 && (var19[var14][var17 + 1] & 0x12C0120) == 0) {
                field109[var32] = var14 + 1;
                class185.field3296[var32] = var17 + 1;
                class29.field347[var14 + 1][var17 + 1] = 12;
                class105.field1885[var14 + 1][var17 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class301.field5156 = 0;
        if (!var18) {
            if (!arg10) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg1 - var23; var24 <= (arg1 + var23); var24++) {
                for (int var25 = arg8 - var23; var25 <= (arg8 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class105.field1885[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg1 > var24) {
                            var26 = arg1 - var24;
                        } else if ((arg1 + arg9 - 1) < var24) {
                            var26 = var24 - (arg1 + arg9 - 1);
                        }
                        int var27 = 0;
                        if (arg8 > var25) {
                            var27 = arg8 - var25;
                        } else if (var25 > arg8 + arg11 - 1) {
                            var27 = var25 + 1 - arg11 - arg8;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class105.field1885[var24][var25]) {
                            var17 = var25;
                            var22 = class105.field1885[var24][var25];
                            var21 = var28;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg7 == var14 && arg6 == var17) {
                return false;
            }
            class301.field5156 = 1;
        }
        byte var29 = 0;
        field109[var29] = var14;
        int var33 = var29 + 1;
        class185.field3296[var29] = var17;
        int var30;
        int var31 = var30 = class29.field347[var14][var17];
        while (arg7 != var14 || arg6 != var17) {
            if (var30 != var31) {
                field109[var33] = var14;
                var30 = var31;
                class185.field3296[var33++] = var17;
            }
            if ((var31 & 0x1) != 0) {
                var17++;
            } else if ((var31 & 0x4) != 0) {
                var17--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class29.field347[var14][var17];
        }
        if (var33 > 0) {
            class64.method496(arg0, var33, (byte) 67);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 458)
    public static final void method43(int arg0) {
        field104++;
        if (class76.field1322 != null) {
            class76.field1322.method999((byte) -97);
        }
        if (class152.field2602 != null) {
            class152.field2602.method999((byte) 103);
        }
        class238.method1636(2, class197.field3463, 22050, arg0 - 89);
        class76.field1322 = class124.method908(class297.field5086, 79, 0, 22050, class5.field67);
        class76.field1322.method1006(4, class229.field3959);
        class152.field2602 = class124.method908(class297.field5086, arg0 ^ 0x79, arg0, 2048, class5.field67);
        class152.field2602.method1006(4, class184.field3279);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 503)
    public static void method44(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field109 = null;
        field101 = (byte[][][]) null;
        field107 = null;
        field100 = null;
        field103 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZII)Loh;", line = 596)
    public static final class258 method45(boolean arg0, int arg1, int arg2) {
        field99++;
        if (arg1 != 10) {
            method44(-71);
        }
        return class30.method221(-15449, 10, arg2, arg0);
    }
}
