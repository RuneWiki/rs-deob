import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class126 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lrh;")
    public static class87 field1936 = new class87();

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field1942 = 1;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[Lck;")
    public static class119[] field1941 = new class119[200];

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Lck;")
    private static class119 field1943 = class298.method1987((byte) 27, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lck;")
    public static class119 field1944 = field1943;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lvk;")
    public static class67 field1940 = new class67(50);

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lck;")
    private static class119 field1945 = class298.method1987((byte) 117, " is already on your friend list)3");

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Lck;")
    public static class119 field1946 = field1945;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field1947 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V", line = 12)
    public static final void method845(int arg0, int arg1) {
        field1935++;
        class117.field1763.method491(arg0 ^ 0xFFFFFF89, arg1);
        if (arg0 != -2) {
            field1938 = 48;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIZIIIIIII)Z", line = 25)
    public static final boolean method846(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field1939++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class93.field1437[var13][var14] = 0;
                class111.field1695[var13][var14] = 99999999;
            }
        }
        class93.field1437[arg8][arg11] = 99;
        int var15 = arg11;
        byte var16 = 0;
        int var17 = arg8;
        int var18 = 0;
        boolean var19 = false;
        class111.field1695[arg8][arg11] = 0;
        class59.field965[var16] = arg8;
        int var42 = var16 + 1;
        class296.field4931[var16] = arg11;
        int[][] var20 = class217.field3510[class10.field189].field4356;
        int var21 = 42 / ((arg0 + 1) / 39);
        label388: while (var42 != var18) {
            var15 = class296.field4931[var18];
            var17 = class59.field965[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg7 == var17 && arg6 == var15) {
                var19 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class217.field3510[class10.field189].method1744(true, arg2, arg10 - 1, var15, var17, arg6, arg12, arg7)) {
                    var19 = true;
                    break;
                }
                if (arg10 < 10 && class217.field3510[class10.field189].method1751(var15, var17, arg10 - 1, arg6, arg7, arg12, true, arg2)) {
                    var19 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg1 != 0 && class217.field3510[class10.field189].method1749(arg7, arg4, arg6, (byte) -128, arg12, var17, arg3, arg1, var15)) {
                var19 = true;
                break;
            }
            int var22 = class111.field1695[var17][var15] + 1;
            if (var17 > 0 && class93.field1437[var17 - 1][var15] == 0 && (var20[var17 - 1][var15] & 0x12C010E) == 0 && (var20[var17 - 1][arg12 + var15 - 1] & 0x12C0138) == 0) {
                int var23 = 1;
                while (true) {
                    if (arg12 - 1 <= var23) {
                        class59.field965[var42] = var17 - 1;
                        class296.field4931[var42] = var15;
                        class93.field1437[var17 - 1][var15] = 2;
                        var42 = var42 + 1 & 0xFFF;
                        class111.field1695[var17 - 1][var15] = var22;
                        break;
                    }
                    if ((var20[var17 - 1][var15 + var23] & 0x12C013E) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var17 < 102 && class93.field1437[var17 + 1][var15] == 0 && (var20[arg12 + var17][var15] & 0x12C0183) == 0 && (var20[var17 + arg12][var15 + arg12 - 1] & 0x12C01E0) == 0) {
                int var24 = 1;
                while (true) {
                    if (arg12 - 1 <= var24) {
                        class59.field965[var42] = var17 + 1;
                        class296.field4931[var42] = var15;
                        var42 = var42 + 1 & 0xFFF;
                        class93.field1437[var17 + 1][var15] = 8;
                        class111.field1695[var17 + 1][var15] = var22;
                        break;
                    }
                    if ((var20[arg12 + var17][var15 + var24] & 0x12C01E3) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var15 > 0 && class93.field1437[var17][var15 - 1] == 0 && (var20[var17][var15 - 1] & 0x12C010E) == 0 && (var20[arg12 + var17 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= arg12 - 1) {
                        class59.field965[var42] = var17;
                        class296.field4931[var42] = var15 - 1;
                        class93.field1437[var17][var15 - 1] = 1;
                        class111.field1695[var17][var15 - 1] = var22;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var17 + var25][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 < 102 && class93.field1437[var17][var15 + 1] == 0 && (var20[var17][var15 + arg12] & 0x12C0138) == 0 && (var20[arg12 + var17 - 1][arg12 + var15] & 0x12C01E0) == 0) {
                int var26 = 1;
                while (true) {
                    if (var26 >= arg12 - 1) {
                        class59.field965[var42] = var17;
                        class296.field4931[var42] = var15 + 1;
                        var42 = var42 + 1 & 0xFFF;
                        class93.field1437[var17][var15 + 1] = 4;
                        class111.field1695[var17][var15 + 1] = var22;
                        break;
                    }
                    if ((var20[var17 + var26][arg12 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var17 > 0 && var15 > 0 && class93.field1437[var17 - 1][var15 - 1] == 0 && (var20[var17 - 1][arg12 + var15 - 1 - 1] & 0x12C0138) == 0 && (var20[var17 - 1][var15 - 1] & 0x12C010E) == 0 && (var20[arg12 + var17 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var27 = 1;
                while (true) {
                    if (arg12 - 1 <= var27) {
                        class59.field965[var42] = var17 - 1;
                        class296.field4931[var42] = var15 - 1;
                        class93.field1437[var17 - 1][var15 - 1] = 3;
                        var42 = var42 + 1 & 0xFFF;
                        class111.field1695[var17 - 1][var15 - 1] = var22;
                        break;
                    }
                    if ((var20[var17 - 1][var15 + var27 - 1] & 0x12C013E) != 0 || (var20[var17 + var27 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var17 < 102 && var15 > 0 && class93.field1437[var17 + 1][var15 - 1] == 0 && (var20[var17 + 1][var15 - 1] & 0x12C010E) == 0 && (var20[arg12 + var17][var15 - 1] & 0x12C0183) == 0 && (var20[arg12 + var17][var15 + arg12 - 1 - 1] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (var28 >= (arg12 - 1)) {
                        class59.field965[var42] = var17 + 1;
                        class296.field4931[var42] = var15 - 1;
                        class93.field1437[var17 + 1][var15 - 1] = 9;
                        class111.field1695[var17 + 1][var15 - 1] = var22;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[arg12 + var17][var15 + var28 - 1] & 0x12C01E3) != 0 || (var20[var28 + var17 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var17 > 0 && var15 < 102 && class93.field1437[var17 - 1][var15 + 1] == 0 && (var20[var17 - 1][var15 + 1] & 0x12C010E) == 0 && (var20[var17 - 1][arg12 + var15] & 0x12C0138) == 0 && (var20[var17][arg12 + var15] & 0x12C01E0) == 0) {
                int var29 = 1;
                while (true) {
                    if (var29 >= (arg12 - 1)) {
                        class59.field965[var42] = var17 - 1;
                        class296.field4931[var42] = var15 + 1;
                        class93.field1437[var17 - 1][var15 + 1] = 6;
                        class111.field1695[var17 - 1][var15 + 1] = var22;
                        var42 = var42 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var17 - 1][var15 + var29 + 1] & 0x12C013E) != 0 || (var20[var17 + var29 - 1][arg12 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var29++;
                }
            }
            if (var17 < 102 && var15 < 102 && class93.field1437[var17 + 1][var15 + 1] == 0 && (var20[var17 + 1][arg12 + var15] & 0x12C0138) == 0 && (var20[arg12 + var17][arg12 + var15] & 0x12C01E0) == 0 && (var20[var17 + arg12][var15 + 1] & 0x12C0183) == 0) {
                for (int var30 = 1; var30 < arg12 - 1; var30++) {
                    if ((var20[var17 + var30 + 1][arg12 + var15] & 0x12C01F8) != 0 || (var20[arg12 + var17][var15 + var30 + 1] & 0x12C01E3) != 0) {
                        continue label388;
                    }
                }
                class59.field965[var42] = var17 + 1;
                class296.field4931[var42] = var15 + 1;
                class93.field1437[var17 + 1][var15 + 1] = 12;
                var42 = var42 + 1 & 0xFFF;
                class111.field1695[var17 + 1][var15 + 1] = var22;
            }
        }
        class82.field1252 = 0;
        if (!var19) {
            if (!arg5) {
                return false;
            }
            int var31 = 1000;
            byte var32 = 10;
            int var33 = 100;
            for (int var34 = arg7 - var32; var34 <= (arg7 + var32); var34++) {
                for (int var35 = arg6 - var32; var35 <= (arg6 + var32); var35++) {
                    if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && class111.field1695[var34][var35] < 100) {
                        int var36 = 0;
                        int var37 = 0;
                        if (arg7 > var34) {
                            var36 = arg7 - var34;
                        } else if ((arg7 + arg3 - 1) < var34) {
                            var36 = var34 - arg3 - (arg7 + -1);
                        }
                        if (var35 < arg6) {
                            var37 = arg6 - var35;
                        } else if ((arg1 + arg6 - 1) < var35) {
                            var37 = var35 + 1 - (arg6 - -arg1);
                        }
                        int var38 = var36 * var36 + var37 * var37;
                        if (var31 > var38 || var31 == var38 && var33 > class111.field1695[var34][var35]) {
                            var33 = class111.field1695[var34][var35];
                            var15 = var35;
                            var17 = var34;
                            var31 = var38;
                        }
                    }
                }
            }
            if (var31 == 1000) {
                return false;
            }
            if (arg8 == var17 && arg11 == var15) {
                return false;
            }
            class82.field1252 = 1;
        }
        byte var39 = 0;
        class59.field965[var39] = var17;
        int var43 = var39 + 1;
        class296.field4931[var39] = var15;
        int var40;
        int var41 = var40 = class93.field1437[var17][var15];
        while (arg8 != var17 || arg11 != var15) {
            if (var40 != var41) {
                var40 = var41;
                class59.field965[var43] = var17;
                class296.field4931[var43++] = var15;
            }
            if ((var41 & 0x1) != 0) {
                var15++;
            } else if ((var41 & 0x4) != 0) {
                var15--;
            }
            if ((var41 & 0x2) != 0) {
                var17++;
            } else if ((var41 & 0x8) != 0) {
                var17--;
            }
            var41 = class93.field1437[var17][var15];
        }
        if (var43 > 0) {
            class6.method84((byte) -115, var43, arg9);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 541)
    public static final void method847(int arg0) {
        while (true) {
            if (class22.field333.method957(8, class4.field123) >= 27) {
                int var1 = class22.field333.method961(arg0 - 20030, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class70.field1103[var1] == null) {
                        var2 = true;
                        class70.field1103[var1] = new class163();
                    }
                    class163 var3 = class70.field1103[var1];
                    class23.field348[class157.field2499++] = var1;
                    var3.field4984 = class1.field15;
                    int var4 = class22.field333.method961(-121, 1);
                    if (var4 == 1) {
                        class113.field1723[class81.field1238++] = var1;
                    }
                    var3.field2575 = class134.method896(arg0 ^ 0xFFFFB19E, class22.field333.method961(49, 14));
                    int var5 = class207.field3294[class22.field333.method961(37, 3)];
                    if (var2) {
                        var3.field4946 = var3.field5007 = var5;
                    }
                    int var6 = class22.field333.method961(42, 1);
                    int var7 = class22.field333.method961(arg0 - 20044, 5);
                    int var8 = class22.field333.method961(28, 5);
                    var3.field4976 = var3.field2575.field785;
                    var3.field4979 = var3.field2575.field820;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field4953 = var3.field2575.field829;
                    var3.field4999 = var3.field2575.field789;
                    var3.field4956 = var3.field2575.field796;
                    var3.field4945 = var3.field2575.field778;
                    var3.field4964 = var3.field2575.field794;
                    var3.field4943 = var3.field2575.field804;
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    if (var3.field4979 == 0) {
                        var3.field5007 = 0;
                    }
                    var3.field4982 = var3.field2575.field836;
                    var3.method1982(class124.field1917.field4973[0] + var8, 7, class124.field1917.field4963[0] + var7, var6 == 1);
                    if (var3.field2575.method385((byte) -45)) {
                        class279.method1853(var3.field4963[0], (byte) -126, 0, class10.field189, var3.field4973[0], (class292) null, var3, (class291) null);
                    }
                    continue;
                }
            }
            if (arg0 != 20065) {
                return;
            }
            class22.field333.method959(-112);
            field1937++;
            return;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 619)
    public static void method848(int arg0) {
        field1941 = null;
        field1940 = null;
        field1945 = null;
        field1943 = null;
        field1936 = null;
        field1944 = null;
        field1946 = null;
        int var1 = 49 % ((arg0 + 22) / 53);
    }
}
