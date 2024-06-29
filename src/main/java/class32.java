import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class32 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public int field378 = -1;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "Loh;")
    public static class258 field387 = class153.method1046("0", 90);

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Loh;")
    public static class258 field381 = class153.method1046("weiss:", 111);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Lmc;")
    public class148 field388;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "[I")
    public int[] field382;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "[I")
    public static int[] field383;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "[Lvi;")
    public static class129[] field385;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "[Loh;")
    public class258[] field379;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 18)
    public static void method231(int arg0) {
        field385 = null;
        field387 = null;
        field381 = null;
        if (arg0 != -9650) {
            method232(-22, 72, -28, -117, 120, -17, true, -44, -58, -27, 20, 35, -91);
        }
        field383 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIZIIIIII)Z", line = 36)
    public static final boolean method232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = arg5; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class29.field347[var13][var14] = 0;
                class105.field1885[var13][var14] = 99999999;
            }
        }
        field386++;
        int var15 = arg10;
        class29.field347[arg7][arg10] = 99;
        int var16 = arg7;
        class105.field1885[arg7][arg10] = 0;
        byte var17 = 0;
        class8.field109[var17] = arg7;
        int var41 = var17 + 1;
        class185.field3296[var17] = arg10;
        boolean var18 = false;
        int var19 = 0;
        int[][] var20 = class243.field4216[class272.field4704].field4255;
        label386: while (var41 != var19) {
            var15 = class185.field3296[var19];
            var16 = class8.field109[var19];
            var19 = var19 + 1 & 0xFFF;
            if (arg1 == var16 && arg9 == var15) {
                var18 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class243.field4216[class272.field4704].method1663(arg1, var16, arg9, arg11, arg5 ^ 0x1, arg3 - 1, arg4, var15)) {
                    var18 = true;
                    break;
                }
                if (arg3 < 10 && class243.field4216[class272.field4704].method1666(arg5 ^ 0x0, arg1, arg4, arg9, var16, arg3 - 1, var15, arg11)) {
                    var18 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg8 != 0 && class243.field4216[class272.field4704].method1679(arg1, arg0, var16, arg8, arg2, arg9, var15, arg4, 8)) {
                var18 = true;
                break;
            }
            int var21 = class105.field1885[var16][var15] + 1;
            if (var16 > 0 && class29.field347[var16 - 1][var15] == 0 && (var20[var16 - 1][var15] & 0x12C010E) == 0 && (var20[var16 - 1][arg4 + var15 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if ((arg4 - 1) <= var22) {
                        class8.field109[var41] = var16 - 1;
                        class185.field3296[var41] = var15;
                        class29.field347[var16 - 1][var15] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class105.field1885[var16 - 1][var15] = var21;
                        break;
                    }
                    if ((var20[var16 - 1][var15 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var16 < 102 && class29.field347[var16 + 1][var15] == 0 && (var20[arg4 + var16][var15] & 0x12C0183) == 0 && (var20[arg4 + var16][var15 + arg4 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= (arg4 - 1)) {
                        class8.field109[var41] = var16 + 1;
                        class185.field3296[var41] = var15;
                        class29.field347[var16 + 1][var15] = 8;
                        var41 = var41 + 1 & 0xFFF;
                        class105.field1885[var16 + 1][var15] = var21;
                        break;
                    }
                    if ((var20[arg4 + var16][var15 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var15 > 0 && class29.field347[var16][var15 - 1] == 0 && (var20[var16][var15 - 1] & 0x12C010E) == 0 && (var20[arg4 + var16 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (arg4 - 1 <= var24) {
                        class8.field109[var41] = var16;
                        class185.field3296[var41] = var15 - 1;
                        class29.field347[var16][var15 - 1] = 1;
                        class105.field1885[var16][var15 - 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var16 + var24][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var15 < 102 && class29.field347[var16][var15 + 1] == 0 && (var20[var16][arg4 + var15] & 0x12C0138) == 0 && (var20[arg4 + var16 - 1][arg4 + var15] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= (arg4 - 1)) {
                        class8.field109[var41] = var16;
                        class185.field3296[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class29.field347[var16][var15 + 1] = 4;
                        class105.field1885[var16][var15 + 1] = var21;
                        break;
                    }
                    if ((var20[var16 + var25][arg4 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var16 > 0 && var15 > 0 && class29.field347[var16 - 1][var15 - 1] == 0 && (var20[var16 - 1][var15 - (-arg4 - -1) - 1] & 0x12C0138) == 0 && (var20[var16 - 1][var15 - 1] & 0x12C010E) == 0 && (var20[var16 + arg4 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if ((arg4 - 1) <= var26) {
                        class8.field109[var41] = var16 - 1;
                        class185.field3296[var41] = var15 - 1;
                        class29.field347[var16 - 1][var15 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class105.field1885[var16 - 1][var15 - 1] = var21;
                        break;
                    }
                    if ((var20[var16 - 1][var15 + var26 - 1] & 0x12C013E) != 0 || (var20[var16 + var26 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var16 < 102 && var15 > 0 && class29.field347[var16 + 1][var15 - 1] == 0 && (var20[var16 + 1][var15 - 1] & 0x12C010E) == 0 && (var20[arg4 + var16][var15 - 1] & 0x12C0183) == 0 && (var20[arg4 + var16][var15 + arg4 - 2] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (arg4 - 1 <= var27) {
                        class8.field109[var41] = var16 + 1;
                        class185.field3296[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class29.field347[var16 + 1][var15 - 1] = 9;
                        class105.field1885[var16 + 1][var15 - 1] = var21;
                        break;
                    }
                    if ((var20[arg4 + var16][var15 + var27 - 1] & 0x12C01E3) != 0 || (var20[var16 + var27 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var16 > 0 && var15 < 102 && class29.field347[var16 - 1][var15 + 1] == 0 && (var20[var16 - 1][var15 + 1] & 0x12C010E) == 0 && (var20[var16 - 1][arg4 + var15] & 0x12C0138) == 0 && (var20[var16][arg4 + var15] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (arg4 - 1 <= var28) {
                        class8.field109[var41] = var16 - 1;
                        class185.field3296[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class29.field347[var16 - 1][var15 + 1] = 6;
                        class105.field1885[var16 - 1][var15 + 1] = var21;
                        break;
                    }
                    if ((var20[var16 - 1][var28 + var15 + 1] & 0x12C013E) != 0 || (var20[var16 + var28 - 1][arg4 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var16 < 102 && var15 < 102 && class29.field347[var16 + 1][var15 + 1] == 0 && (var20[var16 + 1][arg4 + var15] & 0x12C0138) == 0 && (var20[arg4 + var16][arg4 + var15] & 0x12C01E0) == 0 && (var20[arg4 + var16][var15 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < arg4 - 1; var29++) {
                    if ((var20[var16 + var29 + 1][var15 + arg4] & 0x12C01F8) != 0 || (var20[arg4 + var16][var15 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label386;
                    }
                }
                class8.field109[var41] = var16 + 1;
                class185.field3296[var41] = var15 + 1;
                var41 = var41 + 1 & 0xFFF;
                class29.field347[var16 + 1][var15 + 1] = 12;
                class105.field1885[var16 + 1][var15 + 1] = var21;
            }
        }
        class301.field5156 = 0;
        if (!var18) {
            if (!arg6) {
                return false;
            }
            int var30 = 100;
            int var31 = 1000;
            byte var32 = 10;
            for (int var33 = arg1 - var32; var33 <= arg1 + var32; var33++) {
                for (int var34 = arg9 - var32; var34 <= arg9 + var32; var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class105.field1885[var33][var34] < 100) {
                        int var35 = 0;
                        int var36 = 0;
                        if (var33 < arg1) {
                            var35 = arg1 - var33;
                        } else if (var33 > (arg0 + arg1 - 1)) {
                            var35 = var33 + 1 - arg0 - arg1;
                        }
                        if (arg9 > var34) {
                            var36 = arg9 - var34;
                        } else if (var34 > (arg8 + arg9 - 1)) {
                            var36 = var34 + 1 - arg8 - arg9;
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var37 < var31 || var31 == var37 && class105.field1885[var33][var34] < var30) {
                            var31 = var37;
                            var16 = var33;
                            var15 = var34;
                            var30 = class105.field1885[var33][var34];
                        }
                    }
                }
            }
            if (var31 == 1000) {
                return false;
            }
            if (arg7 == var16 && arg10 == var15) {
                return false;
            }
            class301.field5156 = 1;
        }
        byte var38 = 0;
        class8.field109[var38] = var16;
        int var42 = var38 + 1;
        class185.field3296[var38] = var15;
        int var39;
        int var40 = var39 = class29.field347[var16][var15];
        while (arg7 != var16 || arg10 != var15) {
            if (var39 != var40) {
                class8.field109[var42] = var16;
                var39 = var40;
                class185.field3296[var42++] = var15;
            }
            if ((var40 & 0x2) != 0) {
                var16++;
            } else if ((var40 & 0x8) != 0) {
                var16--;
            }
            if ((var40 & 0x1) != 0) {
                var15++;
            } else if ((var40 & 0x4) != 0) {
                var15--;
            }
            var40 = class29.field347[var16][var15];
        }
        if (var42 > 0) {
            class64.method496(arg12, var42, (byte) -110);
            return true;
        } else if (arg12 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V", line = 545)
    public static final void method233(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 108) {
            field387 = (class258) null;
        }
        if (arg2 >= arg4) {
            for (int var5 = arg4; var5 < arg2; var5++) {
                class154.field2638[var5][arg3] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg4; var6++) {
                class154.field2638[var6][arg3] = arg1;
            }
        }
        field384++;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V", line = 585)
    public static final void method234(int arg0) {
        class153.field2627.method1157(4);
        field380++;
        class233.field4038.method1157(4);
        if (arg0 >= -97) {
            field387 = (class258) null;
        }
        class286.field4934.method1157(4);
        class245.field4257.method1157(4);
    }
}
