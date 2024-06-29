import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class5 extends class282 {

    @OriginalMember(owner = "client!gn", name = "T", descriptor = "I")
    public int field52 = 0;

    @OriginalMember(owner = "client!gn", name = "U", descriptor = "Ljf;")
    private static class229 field53 = class212.method1457((byte) 106, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!gn", name = "N", descriptor = "Ljf;")
    public static class229 field46 = field53;

    @OriginalMember(owner = "client!gn", name = "O", descriptor = "I")
    public static int field47 = 0;

    @OriginalMember(owner = "client!gn", name = "W", descriptor = "F")
    public static float field55;

    @OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!gn", name = "Q", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!gn", name = "R", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!gn", name = "V", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!gn", name = "X", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!gn", name = "Y", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!gn", name = "S", descriptor = "[Lsm;")
    public static class159[] field51;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)I", line = 6)
    public static final int method28(int arg0, int arg1) {
        if (arg0 > -82) {
            field51 = (class159[]) null;
        }
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        field56++;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILkh;)V", line = 28)
    private final void method29(int arg0, int arg1, class14 arg2) {
        if (arg1 == 2) {
            this.field52 = arg2.method116(-1);
        }
        field54++;
        if (arg0 != 0) {
            method28(-69, -42);
        }
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(B)V", line = 58)
    public static void method30(byte arg0) {
        field46 = null;
        field53 = null;
        field51 = null;
        if (arg0 != 106) {
            field49 = -51;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILkh;)V", line = 78)
    public final void method31(int arg0, class14 arg1) {
        if (arg0 != -1) {
            field53 = (class229) null;
        }
        field48++;
        while (true) {
            int var3 = arg1.method93(false);
            if (var3 == 0) {
                return;
            }
            this.method29(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIZI)V", line = 105)
    public static final void method32(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field57++;
        class34.method306(arg2 - arg4, class173.field3021[arg1], (byte) 112, arg2 + arg4, arg0);
        int var5 = arg4;
        if (!arg3) {
            return;
        }
        int var6 = -arg4;
        int var7 = 0;
        int var8 = -1;
        while (var7 < var5) {
            var8 += 2;
            var6 += var8;
            var7++;
            if (var6 >= 0) {
                var5--;
                var6 -= var5 << 1;
                int[] var9 = class173.field3021[arg1 + var5];
                int[] var10 = class173.field3021[arg1 - var5];
                int var11 = arg2 + var7;
                int var12 = arg2 - var7;
                class34.method306(var12, var9, (byte) 118, var11, arg0);
                class34.method306(var12, var10, (byte) 115, var11, arg0);
            }
            int var13 = arg2 + var5;
            int[] var14 = class173.field3021[arg1 - var7];
            int var15 = arg2 - var5;
            int[] var16 = class173.field3021[arg1 + var7];
            class34.method306(var15, var16, (byte) 121, var13, arg0);
            class34.method306(var15, var14, (byte) 122, var13, arg0);
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)Lll;", line = 164)
    public static final class158 method33(int arg0, int arg1) {
        class158 var2 = (class158) class235.field4056.method229((long) arg0, -14);
        int var3 = -57 / ((arg1 + 52) / 57);
        field45++;
        if (var2 != null) {
            return var2;
        }
        class158 var4 = class48.method410(false, class64.field1113, class56.field1002, (byte) -47, arg0);
        if (var4 != null) {
            class235.field4056.method227(-25077, var4, (long) arg0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([Lqg;II[BIIZI)V", line = 196)
    public static final void method34(class244[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field50++;
        byte var8;
        if (arg6) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg6) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg1 + var10) > 0 && (arg1 + var10) < 103 && (arg7 + var11) > 0 && (arg7 + var11) < 103) {
                            arg0[var9].field4331[arg1 + var10][arg7 + var11] = class305.method2086(arg0[var9].field4331[arg1 + var10][arg7 + var11], -16777217);
                        }
                    }
                }
            }
        }
        if (arg4 <= 123) {
            method32(3, 14, -85, true, 25);
        }
        class14 var12 = new class14(arg3);
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class294.method2039(arg5, 0, -105, var12, arg7 + var15, var13, arg1 + var14, arg2, arg6);
                }
            }
        }
        boolean var16 = false;
        while (var12.field174.length > var12.field195) {
            int var17 = var12.method93(false);
            if (var17 != 129) {
                var12.field195--;
                break;
            }
            var16 = true;
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var12.method98(true);
                if (var19 == 0) {
                    int var20 = arg1;
                    if (arg1 < 0) {
                        var20 = 0;
                    } else if (arg1 >= 104) {
                        var20 = 104;
                    }
                    int var21 = arg1 + 64;
                    if (var21 < 0) {
                        var21 = 0;
                    } else if (var21 >= 104) {
                        var21 = 104;
                    }
                    int var22 = arg7;
                    int var23 = arg7 + 64;
                    if (arg7 < 0) {
                        var22 = 0;
                    } else if (arg7 >= 104) {
                        var22 = 104;
                    }
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 >= 104) {
                        var23 = 104;
                    }
                    while (var21 > var20) {
                        while (var22 < var23) {
                            class179.field3110[var18][var20][var22] = 0;
                            var22++;
                        }
                        var20++;
                    }
                } else if (var19 == 1) {
                    for (int var24 = 0; var24 < 64; var24 += 4) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            byte var26 = var12.method98(true);
                            for (int var27 = var24 + arg1; var27 < (arg1 + var24 + 4); var27++) {
                                for (int var28 = arg7 + var25; var28 < (arg7 + var25 + 4); var28++) {
                                    if (var27 >= 0 && var27 < 104 && var28 >= 0 && var28 < 104) {
                                        class179.field3110[var18][var27][var28] = var26;
                                    }
                                }
                            }
                        }
                    }
                } else if (var19 == 2 && var18 > 0) {
                    int var29 = arg1;
                    int var30 = arg1 + 64;
                    int var31 = arg7;
                    if (arg7 < 0) {
                        var31 = 0;
                    } else if (arg7 >= 104) {
                        var31 = 104;
                    }
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    if (arg1 < 0) {
                        var29 = 0;
                    } else if (arg1 >= 104) {
                        var29 = 104;
                    }
                    int var32 = arg7 + 64;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= 104) {
                        var32 = 104;
                    }
                    while (var30 > var29) {
                        while (var31 < var32) {
                            class179.field3110[var18][var29][var31] = class179.field3110[var18 - 1][var29][var31];
                            var31++;
                        }
                        var29++;
                    }
                }
            }
        }
        if (class108.field1900 && !arg6) {
            class96 var33 = null;
            while (true) {
                while (var12.field174.length > var12.field195) {
                    int var34 = var12.method93(false);
                    if (var34 == 0) {
                        var33 = new class96(var12);
                    } else if (var34 == 1) {
                        int var35 = var12.method93(false);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class186 var37 = new class186(var12);
                                var37.field3266 += arg1 << 7;
                                var37.field3253 += arg7 << 7;
                                int var38 = var37.field3266 >> 7;
                                int var39 = var37.field3253 >> 7;
                                if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                                    var37.field3254 = class132.field2328[var37.field3264][var38][var39] - var37.field3254;
                                    class216.method1492(var37);
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var33 == null) {
                    var33 = new class96();
                }
                for (int var40 = 0; var40 < 8; var40++) {
                    for (int var41 = 0; var41 < 8; var41++) {
                        int var42 = (arg1 >> 3) + var40;
                        int var43 = (arg7 >> 3) + var41;
                        if (var42 >= 0 && var42 < 13 && var43 >= 0 && var43 < 13) {
                            class149.field2576[var42][var43] = var33;
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
                        class179.field3110[var44][var47][var48] = 0;
                    }
                }
            }
        }
    }
}
