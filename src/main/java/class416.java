import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class416 extends class110 {

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "Ljava/lang/Object;")
    private Object field5984;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "[Llj;")
    public static class41[] field5982 = new class41[8];

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Z", line = 5)
    public final boolean method569(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field5988++;
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIBIIIILvm;[Lqs;[BI)[I", line = 16)
    public static final int[] method2581(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, class322 arg8, class438[] arg9, byte[] arg10, int arg11) {
        field5990++;
        int var12 = (arg0 & 0x7) * 8;
        int var13 = (arg2 & 0x7) * 8;
        byte var14;
        if (arg1) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        if (!arg1) {
            class438 var15 = arg9[arg11];
            for (int var16 = 0; var16 < 8; var16++) {
                for (int var17 = 0; var17 < 8; var17++) {
                    int var18 = class270.method1499(arg7, var16 & 0x7, var17 & 0x7, (byte) 97) + arg5;
                    int var19 = class7.method33(var16 & 0x7, arg7, 7, var17 & 0x7) + arg4;
                    if (var18 > 0 && var18 < (class315.field4214 - 1) && var19 > 0 && class340.field4549 - 1 > var19) {
                        var15.method2714(var18, var19, -10297);
                    }
                }
            }
        }
        class250 var20 = new class250(arg10);
        int var21 = arg0 & 0x1FFFFFF8 << 3;
        int var22 = arg2 & 0x1FFFFFF8 << 3;
        if (arg3 != -113) {
            field5989 = 6;
        }
        byte var23 = 0;
        byte var24 = 0;
        if (arg7 == 1) {
            var24 = 1;
        } else if (arg7 == 2) {
            var23 = 1;
            var24 = 1;
        } else if (arg7 == 3) {
            var23 = 1;
        }
        for (int var25 = 0; var25 < var14; var25++) {
            for (int var58 = 0; var58 < 64; var58++) {
                for (int var59 = 0; var59 < 64; var59++) {
                    if (arg6 != var25 || var58 < var12 || var58 > var12 + 8 || var13 > var59 || var59 > var13 + 8) {
                        class166.method885(0, var20, 0, arg1, 0, 0, -1, true, 0, 0, false, -1);
                    } else if (var12 + 8 == var58 || var13 + 8 == var59) {
                        int var66;
                        int var67;
                        if (arg7 == 0) {
                            var67 = arg4 - (var13 - var59);
                            var66 = var58 + arg5 - var12;
                        } else if (arg7 == 1) {
                            var67 = arg4 + (var12 - var58) + 8;
                            var66 = arg5 + var59 - var13;
                        } else if (arg7 == 2) {
                            var67 = arg4 + var13 + 8 - var59;
                            var66 = var12 - (var58 - arg5 - 8);
                        } else {
                            var66 = arg5 + var13 + 8 - var59;
                            var67 = var58 + arg4 - var12;
                        }
                        class166.method885(0, var20, 0, arg1, 0, var21 + var58, var66, true, arg11, var22 + var59, true, var67);
                    } else {
                        int var60 = class270.method1499(arg7, var58 & 0x7, var59 & 0x7, (byte) 123) + arg5;
                        int var61 = arg4 + class7.method33(var58 & 0x7, arg7, 7, var59 & 0x7);
                        class166.method885(var24, var20, arg7, arg1, var23, var21 + var58, var60, true, arg11, var22 + var59, false, var61);
                        if (var58 == 63 || var59 == 63) {
                            int var62 = var58 == 63 ? 64 : var58;
                            int var63 = var59 == 63 ? 64 : var59;
                            int var64;
                            int var65;
                            if (arg7 == 0) {
                                var64 = var63 + arg4 - var13;
                                var65 = arg5 + var62 - var12;
                            } else if (arg7 == 1) {
                                var64 = arg4 + var12 + 8 - var62;
                                var65 = var63 + arg5 - var13;
                            } else if (arg7 == 2) {
                                var64 = -var63 - (-var13 - arg4 - 8);
                                var65 = arg5 + var12 + 8 - var62;
                            } else {
                                var65 = arg5 - (var63 - var13 - 8);
                                var64 = var62 + arg4 - var12;
                            }
                            if (var65 >= 0 && class315.field4214 > var65 && var64 >= 0 && class340.field4549 > var64) {
                                class432.field6340[arg11][var65][var64] = class432.field6340[arg11][var23 + var60][var24 + var61];
                            }
                        }
                    }
                }
            }
        }
        boolean var26 = false;
        boolean var27 = false;
        while (var20.field3389 < var20.field3406.length) {
            int var28 = var20.method1350(31351);
            if (var28 == 128) {
                class284.field3879[0] = var20.method1374(-2);
                class284.field3879[1] = var20.method1366((byte) -114);
                class284.field3879[2] = var20.method1366((byte) -89);
                class284.field3879[3] = var20.method1366((byte) -91);
                class284.field3879[4] = var20.method1374(arg3 + 111);
                var26 = true;
            } else {
                if (var28 != 129) {
                    var20.field3389--;
                    break;
                }
                if (class271.field3670 == null) {
                    class271.field3670 = new byte[4][][];
                }
                for (int var45 = 0; var45 < 4; var45++) {
                    byte var46 = var20.method1363((byte) -121);
                    if (var46 == 0 && class271.field3670[arg11] != null) {
                        if (var45 <= arg6) {
                            int var47 = arg5;
                            int var48 = arg5 + 7;
                            int var49 = arg4;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (class315.field4214 <= var48) {
                                var48 = class315.field4214;
                            }
                            if (arg4 < 0) {
                                var49 = 0;
                            } else if (class340.field4549 <= arg4) {
                                var49 = class340.field4549;
                            }
                            int var50 = arg4 + 7;
                            if (arg5 < 0) {
                                var47 = 0;
                            } else if (class315.field4214 <= arg5) {
                                var47 = class315.field4214;
                            }
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (class340.field4549 <= var50) {
                                var50 = class340.field4549;
                            }
                            while (var47 < var48) {
                                while (var50 > var49) {
                                    class271.field3670[arg11][var47][var49] = 0;
                                    var49++;
                                }
                                var47++;
                            }
                        }
                    } else if (var46 == 1) {
                        if (class271.field3670[arg11] == null) {
                            class271.field3670[arg11] = new byte[class315.field4214 + 1][class340.field4549 + 1];
                        }
                        for (int var51 = 0; var51 < 64; var51 += 4) {
                            for (int var52 = 0; var52 < 64; var52 += 4) {
                                byte var53 = var20.method1363((byte) 111);
                                if (var45 <= arg6) {
                                    for (int var54 = var51; var54 < (var51 + 4); var54++) {
                                        for (int var55 = var52; var55 < (var52 + 4); var55++) {
                                            if (var54 >= var12 && var12 + 8 > var54 && var55 >= var13 && (var13 + 8) > var13) {
                                                int var56 = class270.method1499(arg7, var54 & 0x7, var55 & 0x7, (byte) -116) + arg5;
                                                int var57 = arg4 + class7.method33(var54 & 0x7, arg7, 7, var55 & 0x7);
                                                if (var56 >= 0 && var56 < class315.field4214 && var57 >= 0 && var57 < class340.field4549) {
                                                    class271.field3670[arg11][var56][var57] = var53;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            class89 var29 = null;
            while (true) {
                while (var20.field3406.length > var20.field3389) {
                    int var30 = var20.method1350(arg3 ^ 0xFFFF85F8);
                    if (var30 == 0) {
                        var29 = new class89(var20);
                    } else if (var30 == 1) {
                        int var31 = var20.method1350(31351);
                        if (var31 > 0) {
                            for (int var32 = 0; var32 < var31; var32++) {
                                class106 var33 = new class106(var20);
                                if (var33.field1301 == 31) {
                                    class112 var34 = class305.method1796((byte) -58, var20.method1374(-2));
                                    var33.method564(var34.field1393, var34.field1399, arg3 ^ 0xFFFFFFC6, var34.field1396, var34.field1404);
                                }
                                int var35 = var33.field4853 >> 7;
                                int var36 = var33.field4851 >> 7;
                                if (var33.field1309 == arg6 && var35 >= var12 && var12 + 8 > var35 && var36 >= var13 && var36 < var13 + 8) {
                                    int var37 = (arg5 << 7) + class114.method604(var33.field4851 & 0x3FF, var33.field4853 & 0x3FF, arg7, true);
                                    int var38 = class149.method796(var33.field4853 & 0x3FF, arg7, 8919, var33.field4851 & 0x3FF) + (arg4 << 7);
                                    var33.field4851 = var38;
                                    var33.field4853 = var37;
                                    int var39 = var33.field4851 >> 7;
                                    int var40 = var33.field4853 >> 7;
                                    if (var40 >= 0 && var39 >= 0 && class315.field4214 > var40 && var39 < class340.field4549) {
                                        var33.field4849 = class432.field6340[arg6][var40][var39] - var33.field4849;
                                        if (arg8.method1590() > 0) {
                                            class376.method2256(var33);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var30 == 2) {
                        if (var29 == null) {
                            var29 = new class89();
                        }
                        var29.method491(var20, 56);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var29 != null) {
                    class63.method343(arg5 >> 3, arg4 >> 3, var29, true);
                }
                break;
            }
        }
        if (!var27 && class271.field3670 != null && class271.field3670[arg11] != null) {
            int var41 = arg5 + 7;
            int var42 = arg4 + 7;
            for (int var43 = arg5; var43 < var41; var43++) {
                for (int var44 = arg4; var44 < var42; var44++) {
                    class271.field3670[arg11][var43][var44] = 0;
                }
            }
        }
        if (var26) {
            return class284.field3879;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V", line = 488)
    public static final void method2582(byte arg0, Object[] arg1, int[] arg2) {
        field5986++;
        class291.method1719(arg2, -10382, 0, arg2.length - 1, arg1);
        int var3 = 105 / ((50 - arg0) / 49);
    }

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "(I)V", line = 498)
    public static void method2583(int arg0) {
        field5982 = null;
        if (arg0 != -17657) {
            field5989 = -33;
        }
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)Ljava/lang/Object;", line = 508)
    public final Object method568(int arg0) {
        field5985++;
        return arg0 == 0 ? this.field5984 : null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 520)
    public class416(Object arg0) {
        this.field5984 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILam;I)Lin;", line = 531)
    public static final class180 method2584(int arg0, int arg1, class286 arg2, int arg3) {
        field5983++;
        class250 var4 = new class250(arg2.method1687(arg1, arg0, 255));
        if (arg3 != 31968) {
            method2581(-112, false, -126, (byte) 98, 86, 31, 62, 69, (class322) null, (class438[]) null, (byte[]) null, -89);
        }
        class180 var5 = new class180(arg1, var4.method1349(-1754884856), var4.method1349(-1754884856), var4.method1359(255), var4.method1359(arg3 - 31713), var4.method1350(31351) == 1, var4.method1350(31351));
        int var6 = var4.method1350(31351);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field2259.method825(arg3 - 31873, new class179(var4.method1350(31351), var4.method1374(-2), var4.method1374(-2), var4.method1374(arg3 ^ 0xFFFF831E), var4.method1374(-2), var4.method1374(-2), var4.method1374(-2), var4.method1374(-2), var4.method1374(-2)));
        }
        var5.method949((byte) -52);
        return var5;
    }
}
