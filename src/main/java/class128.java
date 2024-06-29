import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class128 extends class321 {

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Lce;")
    public static class126 field2203 = class206.method1445(-7923, " )2>");

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lce;")
    private static class126 field2202 = class206.method1445(-7923, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Lce;")
    public static class126 field2207 = field2202;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "[[B")
    public static byte[][] field2200;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([BIZIB[Lsh;II)V", line = 19)
    public static final void method887(byte[] arg0, int arg1, boolean arg2, int arg3, byte arg4, class32[] arg5, int arg6, int arg7) {
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        field2206++;
        if (!arg2) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg1 + var10 > 0 && arg1 + var10 < 103 && arg7 + var11 > 0 && (arg7 + var11) < 103) {
                            arg5[var9].field460[arg1 + var10][arg7 + var11] = class47.method289(arg5[var9].field460[arg1 + var10][arg7 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class134 var12 = new class134(arg0);
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class228.method1553(arg3, arg2, arg6, var13, var15 + arg7, arg1 + var14, -124, 0, var12);
                }
            }
        }
        if (arg4 <= 84) {
            field2207 = (class126) null;
        }
        boolean var16 = false;
        while (var12.field2282.length > var12.field2299) {
            int var17 = var12.method948(-123);
            if (var17 != 129) {
                var12.field2299--;
                break;
            }
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var12.method977(19773);
                if (var19 == 0) {
                    int var20 = arg1;
                    int var21 = arg7;
                    if (arg1 < 0) {
                        var20 = 0;
                    } else if (arg1 >= 104) {
                        var20 = 104;
                    }
                    int var22 = arg1 + 64;
                    if (arg7 < 0) {
                        var21 = 0;
                    } else if (arg7 >= 104) {
                        var21 = 104;
                    }
                    int var23 = arg7 + 64;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 >= 104) {
                        var23 = 104;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    } else if (var22 >= 104) {
                        var22 = 104;
                    }
                    while (var20 < var22) {
                        while (var21 < var23) {
                            class85.field1353[var18][var20][var21] = 0;
                            var21++;
                        }
                        var20++;
                    }
                } else if (var19 == 1) {
                    for (int var28 = 0; var28 < 64; var28 += 4) {
                        for (int var29 = 0; var29 < 64; var29 += 4) {
                            byte var30 = var12.method977(19773);
                            for (int var31 = arg1 + var28; var31 < arg1 + var28 + 4; var31++) {
                                for (int var32 = arg7 + var29; var32 < (var29 + arg7 + 4); var32++) {
                                    if (var31 >= 0 && var31 < 104 && var32 >= 0 && var32 < 104) {
                                        class85.field1353[var18][var31][var32] = var30;
                                    }
                                }
                            }
                        }
                    }
                } else if (var19 == 2 && var18 > 0) {
                    int var24 = arg1;
                    int var25 = arg1 + 64;
                    if (arg1 < 0) {
                        var24 = 0;
                    } else if (arg1 >= 104) {
                        var24 = 104;
                    }
                    int var26 = arg7;
                    if (arg7 < 0) {
                        var26 = 0;
                    } else if (arg7 >= 104) {
                        var26 = 104;
                    }
                    int var27 = arg7 + 64;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 >= 104) {
                        var25 = 104;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    } else if (var27 >= 104) {
                        var27 = 104;
                    }
                    while (var24 < var25) {
                        while (var26 < var27) {
                            class85.field1353[var18][var24][var26] = class85.field1353[var18 - 1][var24][var26];
                            var26++;
                        }
                        var24++;
                    }
                }
            }
            var16 = true;
        }
        if (class56.field846 && !arg2) {
            class98 var33 = null;
            while (true) {
                while (var12.field2299 < var12.field2282.length) {
                    int var34 = var12.method948(-128);
                    if (var34 == 0) {
                        var33 = new class98(var12);
                    } else if (var34 == 1) {
                        int var35 = var12.method948(-125);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class209 var37 = new class209(var12);
                                var37.field3577 += arg1 << 7;
                                var37.field3570 += arg7 << 7;
                                int var38 = var37.field3577 >> 7;
                                int var39 = var37.field3570 >> 7;
                                if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                                    var37.field3565 = (class301.field4992[1][var38][var39] & 0x2) != 0;
                                    var37.field3567 = class264.field4396[var37.field3590][var38][var39] - var37.field3567;
                                    class256.method1740(var37);
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var33 == null) {
                    var33 = new class98();
                }
                for (int var40 = 0; var40 < 8; var40++) {
                    for (int var41 = 0; var41 < 8; var41++) {
                        int var42 = (arg7 >> 3) + var41;
                        int var43 = (arg1 >> 3) + var40;
                        if (var43 >= 0 && var43 < 13 && var42 >= 0 && var42 < 13) {
                            class243.field4121[var43][var42] = var33;
                        }
                    }
                }
                break;
            }
        }
        if (var16) {
            return;
        }
        for (int var44 = 0; var44 < 4; var44++) {
            for (int var45 = 0; var45 < 16; var45++) {
                for (int var46 = 0; var46 < 16; var46++) {
                    int var47 = (arg1 >> 2) + var45;
                    int var48 = (arg7 >> 2) + var46;
                    if (var47 >= 0 && var47 < 26 && var48 >= 0 && var48 < 26) {
                        class85.field1353[var44][var47][var48] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lcc;Z)V", line = 403)
    public static final void method888(class313 arg0, boolean arg1) {
        class160.field2901 = arg0;
        if (arg1) {
            method890(23, 112, -76, -22, -42, -52, -107);
        }
        field2201++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 415)
    public static void method889(boolean arg0) {
        field2202 = null;
        if (arg0) {
            field2199 = -73;
        }
        field2203 = null;
        field2200 = (byte[][]) null;
        field2207 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIII)V", line = 431)
    public static final void method890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class76 var7 = new class76();
        var7.field1246 = arg1 / 128;
        var7.field1226 = arg2 / 128;
        var7.field1239 = arg3 / 128;
        var7.field1234 = arg4 / 128;
        var7.field1242 = arg0;
        var7.field1244 = arg1;
        var7.field1229 = arg2;
        var7.field1233 = arg3;
        var7.field1231 = arg4;
        var7.field1235 = arg5;
        var7.field1232 = arg6;
        class39.field623[class50.field764++] = var7;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lcc;I)V", line = 449)
    public static final void method891(class313 arg0, int arg1) {
        class224.field3769 = arg0;
        field2205++;
        if (arg1 >= -118) {
            field2199 = -102;
        }
    }
}
