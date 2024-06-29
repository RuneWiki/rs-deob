import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class385 extends class438 {

    @OriginalMember(owner = "client!aha", name = "O", descriptor = "I")
    public int field5388 = 99;

    @OriginalMember(owner = "client!aha", name = "N", descriptor = "[F")
    public static float[] field5387 = new float[4];

    @OriginalMember(owner = "client!aha", name = "A", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!aha", name = "G", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!aha", name = "H", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!aha", name = "I", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!aha", name = "J", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!aha", name = "K", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!aha", name = "L", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!aha", name = "M", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!aha", name = "P", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!aha", name = "Q", descriptor = "I")
    public static int field5390;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aha", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field5391;

    // $FF: synthetic method
    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2288(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(ZBLha;)V", line = 5)
    public final void method2277(boolean arg0, byte arg1, class59 arg2) {
        class58.method387();
        ++field5389;
        if (arg1 == 75) {
            if (!arg0) {
                if (~super.field6057 < -2) {
                    for (int var4 = 0; ~var4 > ~super.field6046; ++var4) {
                        for (int var5 = 0; ~var5 > ~super.field6029; ++var5) {
                            if ((class184.field2782[1][var4][var5] & 2) == 2) {
                                class653.method3557(var4, var5);
                            }
                        }
                    }
                }
                for (int var6 = 0; ~var6 > ~super.field6057; ++var6) {
                    for (int var7 = 0; ~super.field6029 <= ~var7; ++var7) {
                        for (int var8 = 0; ~super.field6046 <= ~var8; ++var8) {
                            if (~(4 & super.field6031[var6][var8][var7]) != -1) {
                                int var9 = var8;
                                int var10 = var8;
                                int var11 = var7;
                                int var12 = var7;
                                while (~var11 < -1 && ~(4 & super.field6031[var6][var8][var11 - 1]) != -1 && -var11 + var12 < 10) {
                                    --var11;
                                }
                                while (~var12 > ~super.field6029 && ~(4 & super.field6031[var6][var8][var12 - -1]) != -1 && ~(-var11 + var12) > -11) {
                                    ++var12;
                                }
                                label117: while (var9 > 0 && var10 - var9 < 10) {
                                    for (int var13 = var11; ~var12 <= ~var13; ++var13) {
                                        if ((super.field6031[var6][var9 - 1][var13] & 4) == 0) {
                                            break label117;
                                        }
                                    }
                                    --var9;
                                }
                                label104: while (super.field6046 > var10 && -var9 + var10 < 10) {
                                    for (int var14 = var11; ~var14 >= ~var12; ++var14) {
                                        if (~(super.field6031[var6][var10 + 1][var14] & 4) == -1) {
                                            break label104;
                                        }
                                    }
                                    ++var10;
                                }
                                if (~((var10 - (var9 + -1)) * (-var11 - -1 + var12)) <= -5) {
                                    int var15 = super.field6041[var6][var9][var11];
                                    class553.method3082(var6, (byte) -121, 4, (var10 << 9) + 512, var9 << 9, var11 << 9, var15, (var12 << 9) - -512, var15);
                                    for (int var16 = var9; ~var10 <= ~var16; ++var16) {
                                        for (int var17 = var11; var17 <= var12; ++var17) {
                                            super.field6031[var6][var16][var17] = (byte) class48.method346(super.field6031[var6][var16][var17], -5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class341.method2048(-11017);
            }
            super.field6031 = null;
        }
    }

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "(I)V", line = 142)
    public static void method2278(int arg0) {
        field5387 = null;
        if (arg0 > -8) {
            method2278(-40);
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIBIILha;Lkb;)V", line = 153)
    public final void method2279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, class59 arg9, class691 arg10) {
        ++field5385;
        if (class411.field5711.field3890.method984(true) != 0 || class753.method4218(arg5, class489.field6638, arg3, 2, arg2)) {
            if (~arg0 > ~this.field5388) {
                this.field5388 = arg0;
            }
            class100 var12 = class462.field6333.method2008((byte) -128, arg1);
            if (~class411.field5711.field3868.method1851(true) != -1 || !var12.field1334) {
                int var13;
                int var14;
                if (arg7 != 1 && ~arg7 != -4) {
                    var13 = var12.field1323;
                    var14 = var12.field1355;
                } else {
                    var13 = var12.field1355;
                    var14 = var12.field1323;
                }
                int var15;
                int var16;
                if (~(arg5 + var14) >= ~super.field6046) {
                    var15 = (var14 + 1 >> 1) + arg5;
                    var16 = arg5 - -(var14 >> 1);
                } else {
                    var16 = arg5;
                    var15 = arg5 + 1;
                }
                int var17;
                int var18;
                if (super.field6029 >= arg3 + var13) {
                    var17 = (var13 + 1 >> 1) + arg3;
                    var18 = (var13 >> 1) + arg3;
                } else {
                    var18 = arg3;
                    var17 = arg3 + 1;
                }
                class282 var19 = class507.field6771[arg2];
                if (arg6 == -15) {
                    int var20 = var19.method1742(var16, 98, var18) - -var19.method1742(var15, arg6 + 123, var18) - (-var19.method1742(var16, 103, var17) + -var19.method1742(var15, arg6 + 110, var17)) >> 2;
                    int var21 = (arg5 << 9) - -(var14 << 8);
                    int var22 = (arg3 << 9) + (var13 << 8);
                    boolean var23 = class339.field4795 && !super.field6053 && var12.field1364;
                    if (var12.method743(arg6 ^ 14)) {
                        class153.method1120((class556) null, arg7, arg5, var12, arg0, arg3, -652104791, (class383) null);
                    }
                    boolean var24 = ~arg4 == 0 && ~var12.field1281 == 0 && var12.field1354 == null && var12.field1307 == null && !var12.field1284 && !var12.field1346;
                    if (!class55.field663 || (!class27.method250((byte) 63, arg8) || var12.field1326 == 1) && (!class735.method4108(false, arg8) || ~var12.field1326 != -1)) {
                        if (~arg8 == -23) {
                            if (class411.field5711.field3904.method1631(true) != 0 || var12.field1363 != 0 || var12.field1351 == 1 || var12.field1349) {
                                class552 var26;
                                if (var24) {
                                    class595 var25 = new class595(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg7, var23);
                                    var26 = var25;
                                    if (var25.method1761(-28823)) {
                                        var25.method1756(true, arg9);
                                    }
                                } else {
                                    var26 = new class462(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg7, arg4);
                                }
                                class103.method768(arg0, arg5, arg3, var26);
                                if (var12.field1351 == 1 && arg10 != null) {
                                    arg10.method3895(true, arg5, arg3);
                                }
                            }
                        } else if (~arg8 != -11 && arg8 != 11) {
                            if ((arg8 < 12 || arg8 > 17) && (arg8 < 18 || ~arg8 < -22)) {
                                if (~arg8 == -1) {
                                    int var29 = var12.field1326;
                                    if (class2.field33 && ~var12.field1326 == 0) {
                                        var29 = 1;
                                    }
                                    class649 var30;
                                    if (!var24) {
                                        var30 = new class435(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg8, arg7, arg4);
                                    } else {
                                        class761 var31 = new class761(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg8, arg7, var23);
                                        if (var31.method1761(-28823)) {
                                            var31.method1756(true, arg9);
                                        }
                                        var30 = var31;
                                    }
                                    class205.method1371(arg0, arg5, arg3, var30, (class649) null);
                                    if (arg7 != 0) {
                                        if (~arg7 == -2) {
                                            if (class339.field4795 && var12.field1320) {
                                                var19.method1744(arg5, arg3 + 1, 50);
                                                var19.method1744(arg5 + 1, arg3 + 1, 50);
                                            }
                                            if (var29 == 1 && !super.field6053) {
                                                class239.method1502(-var12.field1338, 2, arg5, arg3 + 1, var12.field1309, arg0, true);
                                            }
                                        } else if (arg7 == 2) {
                                            if (class339.field4795 && var12.field1320) {
                                                var19.method1744(arg5 + 1, arg3, 50);
                                                var19.method1744(arg5 + 1, arg3 + 1, 50);
                                            }
                                            if (var29 == 1 && !super.field6053) {
                                                class239.method1502(-var12.field1338, 1, arg5 + 1, arg3, var12.field1309, arg0, true);
                                            }
                                        } else if (~arg7 == -4) {
                                            if (class339.field4795 && var12.field1320) {
                                                var19.method1744(arg5, arg3, 50);
                                                var19.method1744(arg5 + 1, arg3, 50);
                                            }
                                            if (var29 == 1 && !super.field6053) {
                                                class239.method1502(var12.field1338, 2, arg5, arg3, var12.field1309, arg0, true);
                                            }
                                        }
                                    } else {
                                        if (class339.field4795 && var12.field1320) {
                                            var19.method1744(arg5, arg3, 50);
                                            var19.method1744(arg5, arg3 + 1, 50);
                                        }
                                        if (~var29 == -2 && !super.field6053) {
                                            class239.method1502(var12.field1338, 1, arg5, arg3, var12.field1309, arg0, true);
                                        }
                                    }
                                    if (var12.field1351 != 0 && arg10 != null) {
                                        arg10.method3897(!var12.field1340, arg8, arg3, var12.field1369, arg6 + 659471, arg7, arg5);
                                    }
                                    if (var12.field1300 != 64) {
                                        class140.method1069(arg0, arg5, arg3, var12.field1300);
                                    }
                                } else if (~arg8 == -2) {
                                    class649 var33;
                                    if (var24) {
                                        class761 var32 = new class761(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg8, arg7, var23);
                                        if (var32.method1761(arg6 ^ 28824)) {
                                            var32.method1756(true, arg9);
                                        }
                                        var33 = var32;
                                    } else {
                                        var33 = new class435(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg8, arg7, arg4);
                                    }
                                    class205.method1371(arg0, arg5, arg3, var33, (class649) null);
                                    if (var12.field1320 && class339.field4795) {
                                        if (~arg7 == -1) {
                                            var19.method1744(arg5, arg3 - -1, 50);
                                        } else if (~arg7 == -2) {
                                            var19.method1744(arg5 - -1, arg3 + 1, 50);
                                        } else if (~arg7 == -3) {
                                            var19.method1744(arg5 - -1, arg3, 50);
                                        } else if (~arg7 == -4) {
                                            var19.method1744(arg5, arg3, 50);
                                        }
                                    }
                                    if (var12.field1351 != 0 && arg10 != null) {
                                        arg10.method3897(!var12.field1340, arg8, arg3, var12.field1369, 659456, arg7, arg5);
                                    }
                                } else if (arg8 == 2) {
                                    int var34 = arg7 + 1 & 3;
                                    class649 var35;
                                    class649 var36;
                                    if (!var24) {
                                        var35 = new class435(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg8, arg7 - -4, arg4);
                                        var36 = new class435(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg8, var34, arg4);
                                    } else {
                                        class761 var37 = new class761(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg8, arg7 + 4, var23);
                                        class761 var38 = new class761(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg8, var34, var23);
                                        if (var37.method1761(-28823)) {
                                            var37.method1756(true, arg9);
                                        }
                                        var36 = var38;
                                        var35 = var37;
                                        if (var38.method1761(-28823)) {
                                            var38.method1756(true, arg9);
                                        }
                                    }
                                    class205.method1371(arg0, arg5, arg3, var35, var36);
                                    if ((~var12.field1326 == -2 || class2.field33 && var12.field1326 == -1) && !super.field6053) {
                                        if (~arg7 != -1) {
                                            if (~arg7 != -2) {
                                                if (~arg7 != -3) {
                                                    if (arg7 == 3) {
                                                        class239.method1502(var12.field1338, 1, arg5, arg3, var12.field1309, arg0, true);
                                                        class239.method1502(var12.field1338, 2, arg5, arg3, var12.field1309, arg0, true);
                                                    }
                                                } else {
                                                    class239.method1502(var12.field1338, 1, arg5 + 1, arg3, var12.field1309, arg0, true);
                                                    class239.method1502(var12.field1338, 2, arg5, arg3, var12.field1309, arg0, true);
                                                }
                                            } else {
                                                class239.method1502(var12.field1338, 1, arg5 + 1, arg3, var12.field1309, arg0, true);
                                                class239.method1502(var12.field1338, 2, arg5, arg3 - -1, var12.field1309, arg0, true);
                                            }
                                        } else {
                                            class239.method1502(var12.field1338, 1, arg5, arg3, var12.field1309, arg0, true);
                                            class239.method1502(var12.field1338, 2, arg5, arg3 + 1, var12.field1309, arg0, true);
                                        }
                                    }
                                    if (~var12.field1351 != -1 && arg10 != null) {
                                        arg10.method3897(!var12.field1340, arg8, arg3, var12.field1369, 659456, arg7, arg5);
                                    }
                                    if (~var12.field1300 != -65) {
                                        class140.method1069(arg0, arg5, arg3, var12.field1300);
                                    }
                                } else if (~arg8 == -4) {
                                    class649 var40;
                                    if (var24) {
                                        class761 var39 = new class761(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg8, arg7, var23);
                                        if (var39.method1761(-28823)) {
                                            var39.method1756(true, arg9);
                                        }
                                        var40 = var39;
                                    } else {
                                        var40 = new class435(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg8, arg7, arg4);
                                    }
                                    class205.method1371(arg0, arg5, arg3, var40, (class649) null);
                                    if (var12.field1320 && class339.field4795) {
                                        if (~arg7 == -1) {
                                            var19.method1744(arg5, arg3 - -1, 50);
                                        } else if (arg7 != 1) {
                                            if (arg7 == 2) {
                                                var19.method1744(arg5 + 1, arg3, 50);
                                            } else if (arg7 == 3) {
                                                var19.method1744(arg5, arg3, 50);
                                            }
                                        } else {
                                            var19.method1744(arg5 + 1, arg3 + 1, 50);
                                        }
                                    }
                                    if (var12.field1351 != 0 && arg10 != null) {
                                        arg10.method3897(!var12.field1340, arg8, arg3, var12.field1369, 659456, arg7, arg5);
                                    }
                                } else if (~arg8 == -10) {
                                    class675 var41;
                                    if (!var24) {
                                        var41 = new class284(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg5, arg5 + var14 + -1, arg3, arg3 - 1 + var13, arg8, arg7, arg4);
                                    } else {
                                        class389 var42 = new class389(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg5, arg5, arg3, arg3, arg8, arg7, var23);
                                        if (var42.method1761(arg6 + -28808)) {
                                            var42.method1756(true, arg9);
                                        }
                                        var41 = var42;
                                    }
                                    class294.method1821(var41, false);
                                    if (~var12.field1326 == -2 && !super.field6053) {
                                        byte var43;
                                        if ((arg7 & 1) == 0) {
                                            var43 = 8;
                                        } else {
                                            var43 = 16;
                                        }
                                        class239.method1502(0, var43, arg5, arg3, var12.field1309, arg0, true);
                                    }
                                    if (~var12.field1351 != -1 && arg10 != null) {
                                        arg10.method3886(var12.field1369, var14, !var12.field1340, arg3, var13, arg5, -92);
                                    }
                                    if (var12.field1300 != 64) {
                                        class140.method1069(arg0, arg5, arg3, var12.field1300);
                                    }
                                } else if (arg8 == 4) {
                                    class694 var44;
                                    if (!var24) {
                                        var44 = new class353(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, 0, 0, arg8, arg7, arg4);
                                    } else {
                                        class464 var45 = new class464(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, 0, 0, arg8, arg7);
                                        var44 = var45;
                                        if (var45.method1761(arg6 + -28808)) {
                                            var45.method1756(true, arg9);
                                        }
                                    }
                                    class159.method1145(arg0, arg5, arg3, var44, (class694) null);
                                } else if (arg8 == 5) {
                                    int var46 = 65;
                                    class624 var47 = (class624) class672.method3710(arg0, arg5, arg3);
                                    if (var47 != null) {
                                        var46 = class462.field6333.method2008((byte) -120, var47.method1759((byte) 95)).field1300 + 1;
                                    }
                                    class694 var49;
                                    if (var24) {
                                        class464 var48 = new class464(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, class63.field775[arg7] * var46, class208.field3083[arg7] * var46, arg8, arg7);
                                        var49 = var48;
                                        if (var48.method1761(-28823)) {
                                            var48.method1756(true, arg9);
                                        }
                                    } else {
                                        var49 = new class353(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, class63.field775[arg7] * var46, class208.field3083[arg7] * var46, arg8, arg7, arg4);
                                    }
                                    class159.method1145(arg0, arg5, arg3, var49, (class694) null);
                                } else if (~arg8 == -7) {
                                    int var50 = 33;
                                    class624 var51 = (class624) class672.method3710(arg0, arg5, arg3);
                                    if (var51 != null) {
                                        var50 = class462.field6333.method2008((byte) -12, var51.method1759((byte) 80)).field1300 / 2 - -1;
                                    }
                                    class694 var52;
                                    if (!var24) {
                                        var52 = new class353(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, class341.field4812[arg7] * var50, class620.field8266[arg7] * var50, arg8, arg7 - -4, arg4);
                                    } else {
                                        class464 var53 = new class464(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, class63.field775[arg7] * var50, class208.field3083[arg7] * var50, arg8, arg7 - -4);
                                        var52 = var53;
                                        if (var53.method1761(-28823)) {
                                            var53.method1756(true, arg9);
                                        }
                                    }
                                    class159.method1145(arg0, arg5, arg3, var52, (class694) null);
                                } else if (arg8 == 7) {
                                    int var54 = 3 & arg7 + 2;
                                    class694 var56;
                                    if (var24) {
                                        class464 var55 = new class464(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, 0, 0, arg8, var54 - -4);
                                        var56 = var55;
                                        if (var55.method1761(-28823)) {
                                            var55.method1756(true, arg9);
                                        }
                                    } else {
                                        var56 = new class353(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, 0, 0, arg8, var54 + 4, arg4);
                                    }
                                    class159.method1145(arg0, arg5, arg3, var56, (class694) null);
                                } else if (arg8 == 8) {
                                    int var57 = arg7 + 2 & 3;
                                    int var58 = 33;
                                    class624 var59 = (class624) class672.method3710(arg0, arg5, arg3);
                                    if (var59 != null) {
                                        var58 = 1 + class462.field6333.method2008((byte) -23, var59.method1759((byte) 95)).field1300 / 2;
                                    }
                                    class694 var62;
                                    class694 var63;
                                    if (var24) {
                                        class464 var60 = new class464(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, class341.field4812[arg7] * var58, class620.field8266[arg7] * var58, arg8, arg7 + 4);
                                        class464 var61 = new class464(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, 0, 0, arg8, var57 + 4);
                                        if (var60.method1761(-28823)) {
                                            var60.method1756(true, arg9);
                                        }
                                        if (var61.method1761(arg6 + -28808)) {
                                            var61.method1756(true, arg9);
                                        }
                                        var62 = var60;
                                        var63 = var61;
                                    } else {
                                        class353 var64 = new class353(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, class341.field4812[arg7] * var58, class620.field8266[arg7] * var58, arg8, arg7 + 4, arg4);
                                        var62 = var64;
                                        class353 var65 = new class353(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, 0, 0, arg8, var57 + 4, arg4);
                                        var63 = var65;
                                    }
                                    class159.method1145(arg0, arg5, arg3, var62, var63);
                                }
                            } else {
                                class675 var27;
                                if (!var24) {
                                    var27 = new class284(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg5, arg5 + var14 + -1, arg3, arg3 + -1 + var13, arg8, arg7, arg4);
                                } else {
                                    class389 var28 = new class389(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg5, var14 - 1 + arg5, arg3, arg3 + var13 + -1, arg8, arg7, var23);
                                    var27 = var28;
                                    if (var28.method1761(-28823)) {
                                        var28.method1756(true, arg9);
                                    }
                                }
                                class294.method1821(var27, false);
                                if (class339.field4795 && !super.field6053 && ~arg8 <= -13 && arg8 <= 17 && arg8 != 13 && arg0 > 0 && var12.field1326 != 0) {
                                    super.field6031[arg0][arg5][arg3] = (byte) class446.method2556(super.field6031[arg0][arg5][arg3], 4);
                                }
                                if (~var12.field1351 != -1 && arg10 != null) {
                                    arg10.method3886(var12.field1369, var14, !var12.field1340, arg3, var13, arg5, -115);
                                }
                            }
                        } else {
                            class389 var66 = null;
                            int var67;
                            class675 var68;
                            if (!var24) {
                                var67 = 15;
                                var68 = new class284(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg5, arg5 + var14 - 1, arg3, arg3 - 1 + var13, arg8, arg7, arg4);
                            } else {
                                class389 var69 = new class389(arg9, var12, arg0, arg2, var21, var20, var22, super.field6053, arg5, arg5 + -1 + var14, arg3, arg3 + var13 + -1, arg8, arg7, var23);
                                var68 = var69;
                                var66 = var69;
                                var67 = var69.method2305(-13876);
                            }
                            if (class294.method1821(var68, false)) {
                                if (var66 != null && var66.method1761(-28823)) {
                                    var66.method1756(true, arg9);
                                }
                                if (var12.field1320 && class339.field4795) {
                                    if (~var67 < -31) {
                                        var67 = 30;
                                    }
                                    for (int var70 = 0; var70 <= var14; ++var70) {
                                        for (int var71 = 0; var71 <= var13; ++var71) {
                                            var19.method1744(arg5 + var70, arg3 + var71, var67);
                                        }
                                    }
                                }
                            }
                            if (~var12.field1351 != -1 && arg10 != null) {
                                arg10.method3886(var12.field1369, var14, !var12.field1340, arg3, var13, arg5, -120);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IILee;[IBLha;)V", line = 788)
    public final void method2280(int arg0, int arg1, class677 arg2, int[] arg3, byte arg4, class59 arg5) {
        ++field5383;
        if (!super.field6053) {
            if (arg4 != -95) {
                field5387 = null;
            }
            boolean var7 = false;
            class224 var8 = null;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            while (true) {
                while (~arg2.field9419 > ~arg2.field9399.length) {
                    int var18 = arg2.method3821((byte) -115);
                    if (~var18 == -1) {
                        var8 = new class224(arg2);
                    } else if (~var18 == -2) {
                        int var19 = arg2.method3821((byte) 121);
                        if (~var19 < -1) {
                            for (int var20 = 0; ~var19 < ~var20; ++var20) {
                                class690 var21 = new class690(arg5, arg2, 2);
                                if (~var21.field9601 == -32) {
                                    class323 var22 = class538.field7087.method962(109, arg2.method3807(arg4 ^ 94));
                                    var21.method3881(var22.field4597, (byte) -127, var22.field4590, var22.field4596, var22.field4592);
                                }
                                if (arg5.method466() > 0) {
                                    class87 var23 = var21.field9602;
                                    int var24 = var23.method665(113) - -(arg0 << 9);
                                    int var25 = var23.method670((byte) -88) + (arg1 << 9);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (var26 >= 0 && var27 >= 0 && var26 < super.field6046 && ~var27 > ~super.field6029) {
                                        var23.method667(super.field6041[var21.field9613][var26][var27] + -var23.method669(-22096), var25, var24, -13470);
                                        class252.method1539(var21);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class224();
                        }
                        var8.method1433(arg2, (byte) -94);
                    } else if (var18 == 128) {
                        if (arg3 != null) {
                            arg3[0] = arg2.method3807(-1);
                            arg3[1] = arg2.method3771((byte) -10);
                            arg3[2] = arg2.method3771((byte) -10);
                            arg3[3] = arg2.method3771((byte) -10);
                            arg3[4] = arg2.method3807(-1);
                        } else {
                            arg2.field9419 += 10;
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field6039 == null) {
                            super.field6039 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var28 = 0; var28 < 4; ++var28) {
                            byte var29 = arg2.method3811(111);
                            if (var29 == 0 && super.field6039[var28] != null) {
                                int var30 = arg0;
                                int var31 = arg0 - -64;
                                int var32 = arg1;
                                if (~arg1 > -1) {
                                    var32 = 0;
                                } else if (~arg1 <= ~super.field6029) {
                                    var32 = super.field6029;
                                }
                                int var33 = arg1 + 64;
                                if (~var31 > -1) {
                                    var31 = 0;
                                } else if (~var31 <= ~super.field6046) {
                                    var31 = super.field6046;
                                }
                                if (~arg0 <= -1) {
                                    if (~super.field6046 >= ~arg0) {
                                        var30 = super.field6046;
                                    }
                                } else {
                                    var30 = 0;
                                }
                                if (var33 >= 0) {
                                    if (super.field6029 <= var33) {
                                        var33 = super.field6029;
                                    }
                                } else {
                                    var33 = 0;
                                }
                                while (~var30 > ~var31) {
                                    while (~var32 > ~var33) {
                                        super.field6039[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (~var29 != -2) {
                                if (~var29 == -3) {
                                    if (super.field6039[var28] == null) {
                                        super.field6039[var28] = new byte[super.field6046 + 1][super.field6029 - -1];
                                    }
                                    if (~var28 < -1) {
                                        int var34 = arg0;
                                        int var35 = arg0 + 64;
                                        int var36 = arg1;
                                        if (arg1 < 0) {
                                            var36 = 0;
                                        } else if (super.field6029 <= arg1) {
                                            var36 = super.field6029;
                                        }
                                        int var37 = arg1 + 64;
                                        if (var35 >= 0) {
                                            if (super.field6046 <= var35) {
                                                var35 = super.field6046;
                                            }
                                        } else {
                                            var35 = 0;
                                        }
                                        if (arg0 < 0) {
                                            var34 = 0;
                                        } else if (~super.field6046 >= ~arg0) {
                                            var34 = super.field6046;
                                        }
                                        if (var37 >= 0) {
                                            if (~super.field6029 >= ~var37) {
                                                var37 = super.field6029;
                                            }
                                        } else {
                                            var37 = 0;
                                        }
                                        while (~var35 < ~var34) {
                                            while (~var36 > ~var37) {
                                                super.field6039[var28][var34][var36] = super.field6039[var28 + -1][var34][var36];
                                                ++var36;
                                            }
                                            ++var34;
                                        }
                                    }
                                }
                            } else {
                                if (super.field6039[var28] == null) {
                                    super.field6039[var28] = new byte[super.field6046 - -1][super.field6029 + 1];
                                }
                                for (int var38 = 0; var38 < 64; var38 += 4) {
                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                        byte var40 = arg2.method3811(104);
                                        for (int var41 = var38 - -arg0; ~var41 > ~(arg0 + 4 + var38); ++var41) {
                                            for (int var42 = arg1 + var39; var42 < var39 - -4 + arg1; ++var42) {
                                                if (var41 >= 0 && super.field6046 > var41 && ~var42 <= -1 && ~var42 > ~super.field6029) {
                                                    super.field6039[var28][var41][var42] = var40;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; var9 < 8; ++var9) {
                        for (int var10 = 0; ~var10 > -9; ++var10) {
                            int var11 = (arg0 >> 3) + var9;
                            int var12 = (arg1 >> 3) - -var10;
                            if (var11 >= 0 && super.field6046 >> 3 > var11 && var12 >= 0 && ~var12 > ~(super.field6029 >> 3)) {
                                class497.method2804(var11, var8, 4, var12);
                            }
                        }
                    }
                }
                if (!var7 && super.field6039 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field6039[var13] != null) {
                            for (int var14 = 0; ~var14 > -17; ++var14) {
                                for (int var15 = 0; var15 < 16; ++var15) {
                                    int var16 = (arg0 >> 2) + var14;
                                    int var17 = (arg1 >> 2) + var15;
                                    if (var16 >= 0 && var16 < 26 && var17 >= 0 && ~var17 > -27) {
                                        super.field6039[var13][var16][var17] = 0;
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIILkb;ILha;)V", line = 1154)
    public final void method2281(int arg0, int arg1, int arg2, int arg3, class691 arg4, int arg5, class59 arg6) {
        if (arg1 <= -15) {
            ++field5380;
            class624 var8 = this.method2284(false, arg3, arg5, arg0, arg2);
            if (var8 != null) {
                class100 var9 = class462.field6333.method2008((byte) -45, var8.method1759((byte) 75));
                int var10 = var8.method1757((byte) -117);
                int var11 = var8.method1752((byte) -111);
                if (var9.method743(-1)) {
                    class43.method313(var9, arg2, arg5, arg3, 24);
                }
                if (var8.method1761(-28823)) {
                    var8.method1758(6120, arg6);
                }
                if (~arg0 != -1) {
                    if (arg0 == 1) {
                        class273.method1640(arg2, arg3, arg5);
                        return;
                    }
                    if (arg0 != 2) {
                        if (~arg0 == -4) {
                            class506.method2845(arg2, arg3, arg5);
                            if (~var9.field1351 == -2) {
                                arg4.method3896(-110, arg3, arg5);
                                return;
                            }
                        }
                    } else {
                        class24.method235(arg2, arg3, arg5, field5391 != null ? field5391 : (field5391 = method2288("paa")));
                        if (var9.field1351 != 0 && ~(var9.field1355 + arg3) > ~super.field6046 && ~(arg5 - -var9.field1355) > ~super.field6029 && ~super.field6046 < ~(var9.field1323 + arg3) && ~(var9.field1323 + arg5) > ~super.field6029) {
                            arg4.method3898(var9.field1323, arg5, var11, var9.field1369, arg3, !var9.field1340, var9.field1355, -127);
                        }
                        if (var10 != 9) {
                            return;
                        }
                        if ((var11 & 1) == 0) {
                            class193.method1323(arg2, arg5, (byte) 124, arg3, 8);
                            return;
                        }
                        class193.method1323(arg2, arg5, (byte) 58, arg3, 16);
                    }
                    return;
                }
                class550.method3073(arg2, arg3, arg5);
                if (~var9.field1351 != -1) {
                    arg4.method3889(var11, arg5, (byte) -117, var10, !var9.field1340, arg3, var9.field1369);
                }
                if (var9.field1326 == 1) {
                    if (~var11 == -1) {
                        class193.method1323(arg2, arg5, (byte) 97, arg3, 1);
                        return;
                    }
                    if (var11 == 1) {
                        class193.method1323(arg2, arg5 - -1, (byte) 100, arg3, 2);
                        return;
                    }
                    if (~var11 == -3) {
                        class193.method1323(arg2, arg5, (byte) 55, arg3 + 1, 1);
                        return;
                    }
                    if (~var11 == -4) {
                        class193.method1323(arg2, arg5, (byte) 121, arg3, 2);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIIIII)V", line = 1249)
    public static final void method2282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5379;
        if (class435.method2502(arg1, (byte) -22)) {
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            if (arg3 != 50) {
                method2278(58);
            }
            int var13 = 0;
            int var14 = 0;
            if (class24.field412) {
                var11 = class421.field5800;
                var12 = class564.field7404;
                var14 = class224.field3180;
                var10 = class567.field7458;
                var13 = class128.field2109;
                class224.field3180 = 1;
            }
            if (class580.field7607[arg1] == null) {
                class476.method2684(arg8, arg0, arg2, arg4, arg7 < 0, class747.field10393[arg1], 126, -1, arg6, arg7, arg5);
            } else {
                class476.method2684(arg8, arg0, arg2, arg4, ~arg7 > -1, class580.field7607[arg1], 126, -1, arg6, arg7, arg5);
            }
            if (class24.field412) {
                if (arg7 >= 0 && class224.field3180 == 2) {
                    class62.method539(class564.field7404, class567.field7458, (byte) -100, class128.field2109, class421.field5800);
                }
                class421.field5800 = var11;
                class128.field2109 = var13;
                class567.field7458 = var10;
                class224.field3180 = var14;
                class564.field7404 = var12;
            }
        } else if (~arg7 != 0) {
            class12.field192[arg7] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class12.field192[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(IIIZ)V", line = 1317)
    public class385(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class69.field845, class708.field9822);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(BIIIIILee;ILha;[II)V", line = 1320)
    public final void method2283(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class677 arg6, int arg7, class59 arg8, int[] arg9, int arg10) {
        ++field5381;
        if (!super.field6053) {
            if (arg0 > -84) {
                field5387 = null;
            }
            boolean var12 = false;
            class224 var13 = null;
            if (arg9 != null) {
                arg9[0] = -1;
            }
            int var14 = (arg2 & 7) * 8;
            int var15 = (arg1 & 7) * 8;
            while (true) {
                int var21;
                label241: do {
                    while (true) {
                        while (arg6.field9419 < arg6.field9399.length) {
                            int var20 = arg6.method3821((byte) -96);
                            if (var20 != 0) {
                                if (~var20 == -2) {
                                    var21 = arg6.method3821((byte) -26);
                                    continue label241;
                                }
                                if (~var20 == -3) {
                                    if (var13 == null) {
                                        var13 = new class224();
                                    }
                                    var13.method1433(arg6, (byte) -56);
                                } else if (var20 == 128) {
                                    if (arg9 == null) {
                                        arg6.field9419 += 10;
                                    } else {
                                        arg9[0] = arg6.method3807(-1);
                                        arg9[1] = arg6.method3771((byte) -10);
                                        arg9[2] = arg6.method3771((byte) -10);
                                        arg9[3] = arg6.method3771((byte) -10);
                                        arg9[4] = arg6.method3807(-1);
                                    }
                                } else {
                                    if (~var20 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field6039 == null) {
                                        super.field6039 = new byte[4][][];
                                    }
                                    for (int var32 = 0; var32 < 4; ++var32) {
                                        byte var33 = arg6.method3811(104);
                                        if (~var33 == -1 && super.field6039[arg10] != null) {
                                            if (arg3 >= var32) {
                                                int var34 = arg5;
                                                int var35 = arg5 + 7;
                                                int var36 = arg4;
                                                int var37 = arg4 + 7;
                                                if (arg4 >= 0) {
                                                    if (~arg4 <= ~super.field6029) {
                                                        var36 = super.field6029;
                                                    }
                                                } else {
                                                    var36 = 0;
                                                }
                                                if (~arg5 > -1) {
                                                    var34 = 0;
                                                } else if (~super.field6046 >= ~arg5) {
                                                    var34 = super.field6046;
                                                }
                                                if (var35 >= 0) {
                                                    if (super.field6046 <= var35) {
                                                        var35 = super.field6046;
                                                    }
                                                } else {
                                                    var35 = 0;
                                                }
                                                if (var37 < 0) {
                                                    var37 = 0;
                                                } else if (~var37 <= ~super.field6029) {
                                                    var37 = super.field6029;
                                                }
                                                while (~var35 < ~var34) {
                                                    while (~var36 > ~var37) {
                                                        super.field6039[arg10][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (var33 == 1) {
                                            if (super.field6039[arg10] == null) {
                                                super.field6039[arg10] = new byte[super.field6046 + 1][super.field6029 + 1];
                                            }
                                            for (int var38 = 0; var38 < 64; var38 += 4) {
                                                for (int var39 = 0; var39 < 64; var39 += 4) {
                                                    byte var40 = arg6.method3811(78);
                                                    if (var32 <= arg3) {
                                                        for (int var41 = var38; ~(var38 - -4) < ~var41; ++var41) {
                                                            for (int var42 = var39; ~(var39 + 4) < ~var42; ++var42) {
                                                                if (var41 >= var14 && ~(var14 + 8) < ~var41 && var42 >= var15 && var15 < var15 + 8) {
                                                                    int var43 = arg5 - -class51.method358(arg7, 7 & var42, 7 & var41, 30141);
                                                                    int var44 = arg4 - -class553.method3081(7 & var42, arg7, var41 & 7, true);
                                                                    if (var43 >= 0 && var43 < super.field6046 && var44 >= 0 && super.field6029 > var44) {
                                                                        super.field6039[arg10][var43][var44] = var40;
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
                            } else {
                                var13 = new class224(arg6);
                            }
                        }
                        if (var13 != null) {
                            class497.method2804(arg5 >> 3, var13, 4, arg4 >> 3);
                        }
                        if (!var12 && super.field6039 != null && super.field6039[arg10] != null) {
                            int var16 = arg5 - -7;
                            int var17 = arg4 + 7;
                            for (int var18 = arg5; ~var18 > ~var16; ++var18) {
                                for (int var19 = arg4; var17 > var19; ++var19) {
                                    super.field6039[arg10][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (~var21 >= -1);
                for (int var22 = 0; var22 < var21; ++var22) {
                    class690 var23 = new class690(arg8, arg6, 2);
                    if (~var23.field9601 == -32) {
                        class323 var24 = class538.field7087.method962(88, arg6.method3807(-1));
                        var23.method3881(var24.field4597, (byte) -127, var24.field4590, var24.field4596, var24.field4592);
                    }
                    if (arg8.method466() > 0) {
                        class87 var25 = var23.field9602;
                        int var26 = var25.method665(116) >> 9;
                        int var27 = var25.method670((byte) -79) >> 9;
                        if (~var23.field9613 == ~arg3 && ~var26 <= ~var14 && ~(var14 + 8) < ~var26 && var15 <= var27 && var15 - -8 > var27) {
                            int var28 = (arg5 << 9) + class447.method2559(var25.method670((byte) -70) & 4095, var25.method665(104) & 4095, arg7, (byte) 123);
                            int var29 = var28 >> 9;
                            int var30 = (arg4 << 9) - -class573.method3151(4095 & var25.method670((byte) -72), arg7, 4095, var25.method665(122) & 4095);
                            int var31 = var30 >> 9;
                            if (~var29 <= -1 && ~var31 <= -1 && super.field6046 > var29 && var31 < super.field6029) {
                                var25.method667(super.field6041[arg3][var29][var31] + -var25.method669(-22096), var30, var28, -13470);
                                class252.method1539(var23);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(ZIIII)Lpaa;", line = 1617)
    public final class624 method2284(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5390;
        class624 var6 = null;
        if (~arg3 == -1) {
            var6 = (class624) class672.method3710(arg4, arg1, arg2);
        }
        if (~arg3 == -2) {
            var6 = (class624) class88.method674(arg4, arg1, arg2);
        }
        if (arg0) {
            field5387 = null;
        }
        if (~arg3 == -3) {
            var6 = (class624) class490.method2780(arg4, arg1, arg2, field5391 != null ? field5391 : (field5391 = method2288("paa")));
        }
        if (arg3 == 3) {
            var6 = (class624) class694.method3906(arg4, arg1, arg2);
        }
        return var6;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lha;II[BI[Lkb;IIBII)V", line = 1649)
    public final void method2285(class59 arg0, int arg1, int arg2, byte[] arg3, int arg4, class691[] arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        ++field5382;
        class677 var12 = new class677(arg3);
        if (arg8 > -104) {
            this.method2287((class691[]) null, (class59) null, -65, (byte[]) null, -38, -24);
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method3803(-121);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method3790((byte) 22);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (var15 & 4083) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method3821((byte) -53);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg1 == ~var19 && var18 >= arg7 && var18 < arg7 + 8 && var17 >= arg2 && ~var17 > ~(arg2 + 8)) {
                    class100 var23 = class462.field6333.method2008((byte) -16, var13);
                    int var24 = class463.method2626(var17 & 7, var23.field1323, (byte) 54, var18 & 7, arg9, var22, var23.field1355) + arg4;
                    int var25 = class330.method1996(var23.field1355, arg9, var22, 7 & var17, var23.field1323, -2, 7 & var18) + arg6;
                    if (~var24 < -1 && var25 > 0 && ~var24 > ~(super.field6046 - 1) && var25 < super.field6029 + -1) {
                        class691 var26 = null;
                        if (!super.field6053) {
                            int var27 = arg10;
                            if ((class184.field2782[1][var24][var25] & 2) == 2) {
                                var27 = arg10 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg5[var27];
                            }
                        }
                        this.method2279(arg10, var13, arg10, var25, -1, var24, (byte) -15, var22 - -arg9 & 3, var21, arg0, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 1729)
    public static final boolean method2286(String arg0, int arg1) {
        ++field5384;
        if (arg0 == null) {
            return false;
        } else {
            if (arg1 < 113) {
                method2278(-91);
            }
            for (int var2 = 0; var2 < client.field4355; ++var2) {
                if (arg0.equalsIgnoreCase(class549.field7252[var2])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(class472.field6475.field5334);
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "([Lkb;Lha;I[BII)V", line = 1760)
    public final void method2287(class691[] arg0, class59 arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        ++field5386;
        if (arg2 > 36) {
            class677 var7 = new class677(arg3);
            int var8 = -1;
            while (true) {
                int var9 = var7.method3803(12);
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method3790((byte) 22);
                    if (var11 == 0) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = 63 & var10;
                    int var13 = (var10 & 4041) >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method3821((byte) 83);
                    int var16 = var15 >> 2;
                    int var17 = var15 & 3;
                    int var18 = arg5 + var13;
                    int var19 = arg4 + var12;
                    if (var18 > 0 && ~var19 < -1 && super.field6046 - 1 > var18 && ~(super.field6029 + -1) < ~var19) {
                        class691 var20 = null;
                        if (!super.field6053) {
                            int var21 = var14;
                            if ((2 & class184.field2782[1][var18][var19]) == 2) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg0[var21];
                            }
                        }
                        this.method2279(var14, var8, var14, var19, -1, var18, (byte) -15, var17, var16, arg1, var20);
                    }
                }
            }
        }
    }
}
