import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class134 {

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Ljd;")
    public static class85 field2333 = class221.method1499("Lade)3)3)3", (byte) 122);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Ljd;")
    public static class85 field2332 = class221.method1499("<col=ffb000>", (byte) -110);

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field2338 = -1;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Lge;")
    public static class68 field2337;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "[Lee;")
    public static class266[] field2342;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "[[[B")
    public static byte[][][] field2341;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method891(int arg0) {
        field2332 = null;
        field2341 = null;
        field2337 = null;
        if (arg0 != -1963279359) {
            field2334 = -51;
        }
        field2333 = null;
        field2342 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)V")
    public static final void method892(int arg0, boolean arg1) {
        byte[][] var2 = class194.field3314;
        byte var3 = 4;
        field2339++;
        if (arg0 != 1) {
            field2343 = 13;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class21.method145(30868);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class74.field1386[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = (var7 & 0x3B2A963) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var7 & 0x6) >> 1;
                            int var11 = (var7 & 0xFFE23F) >> 14;
                            int var12 = (var7 & 0x3FFF) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class94.field1719.length; var14++) {
                                if (class94.field1719[var14] == var13 && var2[var14] != null) {
                                    class213.method1460(class34.field529, var5 * 8, (var11 & 0x7) * 8, var9, var2[var14], var4, arg1, arg0 ^ 0x1F, var6 * 8, (var12 & 0x7) * 8, var10);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class49.method333(var5 * 8, 126, 8, var4, 8, var6 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIBIIIIZIIII)Z")
    public static final boolean method893(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        field2340++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class256.field4561[var13][var40] = 0;
                class214.field3771[var13][var40] = 99999999;
            }
        }
        int var14 = arg0;
        int var15 = arg12;
        class256.field4561[arg0][arg12] = 99;
        class214.field3771[arg0][arg12] = 0;
        int var16 = 0;
        byte var17 = 0;
        class24.field349[var17] = arg0;
        boolean var18 = false;
        if (arg3 < 68) {
            method893(32, 18, -74, (byte) -65, -58, -79, -57, -4, false, -41, -95, -91, -8);
        }
        int var41 = var17 + 1;
        class34.field512[var17] = arg12;
        int[][] var19 = class34.field529[class116.field2066].field4719;
        label372: while (var16 != var41) {
            var14 = class24.field349[var16];
            var15 = class34.field512[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg11 == var14 && arg6 == var15) {
                var18 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class34.field529[class116.field2066].method1823(var15, arg7, arg1 - 1, 11662, arg6, arg2, var14, arg11)) {
                    var18 = true;
                    break;
                }
                if (arg1 < 10 && class34.field529[class116.field2066].method1815(arg1 - 1, arg11, arg2, var14, arg7, arg6, (byte) 6, var15)) {
                    var18 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg10 != 0 && class34.field529[class116.field2066].method1812(arg5, arg11, arg6, 8, arg4, arg2, var15, arg10, var14)) {
                var18 = true;
                break;
            }
            int var31 = class214.field3771[var14][var15] + 1;
            if (var14 > 0 && class256.field4561[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][arg2 + var15 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (arg2 - 1 <= var32) {
                        class24.field349[var41] = var14 - 1;
                        class34.field512[var41] = var15;
                        class256.field4561[var14 - 1][var15] = 2;
                        var41 = var41 + 1 & 0xFFF;
                        class214.field3771[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class256.field4561[var14 + 1][var15] == 0 && (var19[arg2 + var14][var15] & 0x12C0183) == 0 && (var19[arg2 + var14][var15 - (1 - arg2)] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (arg2 - 1 <= var33) {
                        class24.field349[var41] = var14 + 1;
                        class34.field512[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class256.field4561[var14 + 1][var15] = 8;
                        class214.field3771[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[arg2 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class256.field4561[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg2 - 1 <= var34) {
                        class24.field349[var41] = var14;
                        class34.field512[var41] = var15 - 1;
                        class256.field4561[var14][var15 - 1] = 1;
                        class214.field3771[var14][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class256.field4561[var14][var15 + 1] == 0 && (var19[var14][arg2 + var15] & 0x12C0138) == 0 && (var19[var14 + arg2 - 1][arg2 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= arg2 - 1) {
                        class24.field349[var41] = var14;
                        class34.field512[var41] = var15 + 1;
                        class256.field4561[var14][var15 + 1] = 4;
                        var41 = var41 + 1 & 0xFFF;
                        class214.field3771[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg2 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class256.field4561[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg2 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= (arg2 - 1)) {
                        class24.field349[var41] = var14 - 1;
                        class34.field512[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class256.field4561[var14 - 1][var15 - 1] = 3;
                        class214.field3771[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var36 - 1] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class256.field4561[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg2 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + arg2][arg2 + var15 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (var37 >= arg2 - 1) {
                        class24.field349[var41] = var14 + 1;
                        class34.field512[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class256.field4561[var14 + 1][var15 - 1] = 9;
                        class214.field3771[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[arg2 + var14][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class256.field4561[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg2 + var15] & 0x12C0138) == 0 && (var19[var14][arg2 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg2 - 1) {
                        class24.field349[var41] = var14 - 1;
                        class34.field512[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class256.field4561[var14 - 1][var15 + 1] = 6;
                        class214.field3771[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 - (-var38 - 1)] & 0x12C013E) != 0 || (var19[var14 + var38 - 1][var15 + arg2] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class256.field4561[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + arg2] & 0x12C0138) == 0 && (var19[arg2 + var14][arg2 + var15] & 0x12C01E0) == 0 && (var19[arg2 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg2 - 1; var39++) {
                    if ((var19[var14 + var39 + 1][arg2 + var15] & 0x12C01F8) != 0 || (var19[arg2 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class24.field349[var41] = var14 + 1;
                class34.field512[var41] = var15 + 1;
                class256.field4561[var14 + 1][var15 + 1] = 12;
                class214.field3771[var14 + 1][var15 + 1] = var31;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class193.field3307 = 0;
        if (!var18) {
            if (!arg8) {
                return false;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg11 - var22; var23 <= (arg11 + var22); var23++) {
                for (int var24 = arg6 - var22; var24 <= arg6 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class214.field3771[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg11) {
                            var25 = arg11 - var23;
                        } else if ((arg11 + arg4 - 1) < var23) {
                            var25 = var23 + 1 - arg11 - arg4;
                        }
                        int var26 = 0;
                        if (var24 < arg6) {
                            var26 = arg6 - var24;
                        } else if (var24 > arg10 + arg6 - 1) {
                            var26 = var24 - arg6 - (arg10 - 1);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var21 > var27 || var21 == var27 && class214.field3771[var23][var24] < var20) {
                            var21 = var27;
                            var15 = var24;
                            var14 = var23;
                            var20 = class214.field3771[var23][var24];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg0 == var14 && arg12 == var15) {
                return false;
            }
            class193.field3307 = 1;
        }
        byte var28 = 0;
        class24.field349[var28] = var14;
        int var42 = var28 + 1;
        class34.field512[var28] = var15;
        int var29;
        int var30 = var29 = class256.field4561[var14][var15];
        while (arg0 != var14 || arg12 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class24.field349[var42] = var14;
                class34.field512[var42++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class256.field4561[var14][var15];
        }
        if (var42 > 0) {
            class127.method858(114, var42, arg9);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)I")
    public static final int method894(int arg0, int arg1, int arg2) {
        int var3 = 55 % ((arg2 + 27) / 50);
        int var4 = class208.method1425((byte) -114, arg1 + 45365, 4, arg0 + 91923) + (class208.method1425((byte) -128, arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (class208.method1425((byte) -9, arg1, 1, arg0) - 128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        field2336++;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Ljd;")
    public static final class85 method895(int arg0, int arg1) {
        class85 var2 = class68.method451(arg1, -12572);
        for (int var3 = var2.method586(true) - 3; var3 > 0; var3 -= 3) {
            var2 = class172.method1150(new class85[] { var2.method636(var3, 0, true), class5.field49, var2.method611((byte) -97, var3) }, 0);
        }
        field2335++;
        if (var2.method586(true) > 9) {
            return class172.method1150(new class85[] { class190.field3261, var2.method636(var2.method586(true) - 8, 0, true), class187.field3213, class220.field3867, var2, class169.field2913 }, arg0 + 18225);
        } else if (var2.method586(true) > 6) {
            return class172.method1150(new class85[] { class271.field4802, var2.method636(var2.method586(true) - 4, 0, true), class105.field1841, class220.field3867, var2, class169.field2913 }, arg0 ^ 0xFFFFB8CF);
        } else {
            if (arg0 != -18225) {
                method891(-118);
            }
            return class172.method1150(new class85[] { class169.field2907, var2, class239.field4129 }, arg0 ^ 0xFFFFB8CF);
        }
    }
}
