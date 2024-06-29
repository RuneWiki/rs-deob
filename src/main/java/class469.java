import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class469 extends class254 {

    @OriginalMember(owner = "client!vaa", name = "N", descriptor = "I")
    public int field6580 = 99;

    @OriginalMember(owner = "client!vaa", name = "K", descriptor = "Lec;")
    public static class236 field6577 = new class236();

    @OriginalMember(owner = "client!vaa", name = "E", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!vaa", name = "F", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!vaa", name = "G", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!vaa", name = "H", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!vaa", name = "I", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!vaa", name = "J", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!vaa", name = "L", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!vaa", name = "M", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!vaa", name = "O", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!vaa", name = "P", descriptor = "I")
    public static int field6582;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vaa", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field6583;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIILha;IIIIIILfe;)V")
    public final void method2757(int arg0, int arg1, int arg2, class59 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class570 arg10) {
        ++field6579;
        if (class693.field9368.field4458.method3022(arg5 ^ -32368) != 0 || class273.method1804(arg7, false, arg0, class534.field7352, arg4)) {
            if (~arg1 > ~this.field6580) {
                this.field6580 = arg1;
            }
            class99 var12 = class76.field1366.method1680(0, arg2);
            if (~class693.field9368.field4432.method887(arg5 + -32400) != -1 || !var12.field1766) {
                int var13;
                int var14;
                if (arg9 != 1 && ~arg9 != -4) {
                    var13 = var12.field1761;
                    var14 = var12.field1796;
                } else {
                    var13 = var12.field1796;
                    var14 = var12.field1761;
                }
                if (arg5 != 50) {
                    this.method2763((byte[]) null, (class570[]) null, -32, (class59) null, -51, 80);
                }
                int var15;
                int var16;
                if (~super.field3679 <= ~(arg0 - -var14)) {
                    var15 = (var14 >> 1) + arg0;
                    var16 = (var14 + 1 >> 1) + arg0;
                } else {
                    var15 = arg0;
                    var16 = arg0 + 1;
                }
                int var17;
                int var18;
                if (super.field3676 < arg7 + var13) {
                    var17 = arg7 + 1;
                    var18 = arg7;
                } else {
                    var17 = (var13 + 1 >> 1) + arg7;
                    var18 = (var13 >> 1) + arg7;
                }
                class281 var19 = class683.field9250[arg4];
                int var20 = var19.method1851((byte) -86, var18, var15) + var19.method1851((byte) -86, var18, var16) - (-var19.method1851((byte) -86, var17, var15) - var19.method1851((byte) -86, var17, var16)) >> 2;
                int var21 = (arg0 << 9) - -(var14 << 8);
                int var22 = (arg7 << 9) + (var13 << 8);
                boolean var23 = class587.field8002 && !super.field3671 && var12.field1741;
                if (var12.method919((byte) 82)) {
                    class426.method2607(979190089, (class9) null, arg1, arg7, arg0, (class598) null, var12, arg9);
                }
                boolean var24 = ~arg8 == 0 && var12.field1703 == -1 && var12.field1778 == null && var12.field1780 == null && !var12.field1764;
                if (!class647.field8907 || (!class205.method1425((byte) -85, arg6) || var12.field1790 == 1) && (!class623.method3544(arg6, arg5 ^ 14616) || var12.field1790 != 0)) {
                    if (~arg6 == -23) {
                        if (class693.field9368.field4417.method966(-32350) != 0 || ~var12.field1709 != -1 || ~var12.field1755 == -2 || var12.field1782) {
                            class177 var25;
                            if (!var24) {
                                var25 = new class328(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg9, arg8);
                            } else {
                                class576 var26 = new class576(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg9, var23);
                                var25 = var26;
                                if (var26.method584(-18443)) {
                                    var26.method583(836, arg3);
                                }
                            }
                            class165.method1247(arg1, arg0, arg7, var25);
                            if (~var12.field1755 == -2 && arg10 != null) {
                                arg10.method3294(arg7, arg0, 1);
                            }
                        }
                    } else if (~arg6 != -11 && arg6 != 11) {
                        if ((arg6 < 12 || arg6 > 17) && (~arg6 > -19 || arg6 > 21)) {
                            if (~arg6 == -1) {
                                int var29 = var12.field1790;
                                if (class593.field8119 && ~var12.field1790 == 0) {
                                    var29 = 1;
                                }
                                class100 var30;
                                if (!var24) {
                                    var30 = new class127(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg6, arg9, arg8);
                                } else {
                                    class708 var31 = new class708(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg6, arg9, var23);
                                    if (var31.method584(-18443)) {
                                        var31.method583(836, arg3);
                                    }
                                    var30 = var31;
                                }
                                class187.method1359(arg1, arg0, arg7, var30, (class100) null);
                                if (~arg9 == -1) {
                                    if (class587.field8002 && var12.field1753) {
                                        var19.method1155(arg0, arg7, 50);
                                        var19.method1155(arg0, arg7 - -1, 50);
                                    }
                                    if (var29 == 1 && !super.field3671) {
                                        class339.method2140(arg0, var12.field1788, var12.field1744, arg7, arg5 + -51, arg1, 1);
                                    }
                                } else if (arg9 == 1) {
                                    if (class587.field8002 && var12.field1753) {
                                        var19.method1155(arg0, arg7 + 1, 50);
                                        var19.method1155(arg0 + 1, arg7 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field3671) {
                                        class339.method2140(arg0, -var12.field1788, var12.field1744, arg7 + 1, -1, arg1, 2);
                                    }
                                } else if (arg9 != 2) {
                                    if (arg9 == 3) {
                                        if (class587.field8002 && var12.field1753) {
                                            var19.method1155(arg0, arg7, 50);
                                            var19.method1155(arg0 + 1, arg7, 50);
                                        }
                                        if (var29 == 1 && !super.field3671) {
                                            class339.method2140(arg0, var12.field1788, var12.field1744, arg7, -1, arg1, 2);
                                        }
                                    }
                                } else {
                                    if (class587.field8002 && var12.field1753) {
                                        var19.method1155(arg0 - -1, arg7, 50);
                                        var19.method1155(arg0 + 1, arg7 + 1, 50);
                                    }
                                    if (var29 == 1 && !super.field3671) {
                                        class339.method2140(arg0 + 1, -var12.field1788, var12.field1744, arg7, arg5 + -51, arg1, 1);
                                    }
                                }
                                if (var12.field1755 != 0 && arg10 != null) {
                                    arg10.method3308(arg7, arg0, arg5 ^ -28, arg6, arg9, !var12.field1711, var12.field1731);
                                }
                                if (~var12.field1718 != -65) {
                                    class214.method1471(arg1, arg0, arg7, var12.field1718);
                                }
                            } else if (arg6 == 1) {
                                class100 var32;
                                if (!var24) {
                                    var32 = new class127(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg6, arg9, arg8);
                                } else {
                                    class708 var33 = new class708(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg6, arg9, var23);
                                    if (var33.method584(-18443)) {
                                        var33.method583(836, arg3);
                                    }
                                    var32 = var33;
                                }
                                class187.method1359(arg1, arg0, arg7, var32, (class100) null);
                                if (var12.field1753 && class587.field8002) {
                                    if (arg9 == 0) {
                                        var19.method1155(arg0, arg7 + 1, 50);
                                    } else if (arg9 != 1) {
                                        if (~arg9 != -3) {
                                            if (arg9 == 3) {
                                                var19.method1155(arg0, arg7, 50);
                                            }
                                        } else {
                                            var19.method1155(arg0 + 1, arg7, 50);
                                        }
                                    } else {
                                        var19.method1155(arg0 + 1, arg7 + 1, 50);
                                    }
                                }
                                if (~var12.field1755 != -1 && arg10 != null) {
                                    arg10.method3308(arg7, arg0, -63, arg6, arg9, !var12.field1711, var12.field1731);
                                }
                            } else if (~arg6 == -3) {
                                int var34 = arg9 - -1 & 3;
                                class100 var37;
                                class100 var38;
                                if (var24) {
                                    class708 var35 = new class708(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg6, arg9 + 4, var23);
                                    class708 var36 = new class708(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg6, var34, var23);
                                    if (var35.method584(-18443)) {
                                        var35.method583(836, arg3);
                                    }
                                    var37 = var36;
                                    var38 = var35;
                                    if (var36.method584(arg5 ^ -18489)) {
                                        var36.method583(836, arg3);
                                    }
                                } else {
                                    var38 = new class127(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg6, arg9 + 4, arg8);
                                    var37 = new class127(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg6, var34, arg8);
                                }
                                class187.method1359(arg1, arg0, arg7, var38, var37);
                                if ((~var12.field1790 == -2 || class593.field8119 && var12.field1790 == -1) && !super.field3671) {
                                    if (~arg9 != -1) {
                                        if (arg9 != 1) {
                                            if (~arg9 != -3) {
                                                if (~arg9 == -4) {
                                                    class339.method2140(arg0, var12.field1788, var12.field1744, arg7, -1, arg1, 1);
                                                    class339.method2140(arg0, var12.field1788, var12.field1744, arg7, -1, arg1, 2);
                                                }
                                            } else {
                                                class339.method2140(arg0 + 1, var12.field1788, var12.field1744, arg7, -1, arg1, 1);
                                                class339.method2140(arg0, var12.field1788, var12.field1744, arg7, -1, arg1, 2);
                                            }
                                        } else {
                                            class339.method2140(arg0 + 1, var12.field1788, var12.field1744, arg7, -1, arg1, 1);
                                            class339.method2140(arg0, var12.field1788, var12.field1744, arg7 + 1, -1, arg1, 2);
                                        }
                                    } else {
                                        class339.method2140(arg0, var12.field1788, var12.field1744, arg7, -1, arg1, 1);
                                        class339.method2140(arg0, var12.field1788, var12.field1744, arg7 + 1, -1, arg1, 2);
                                    }
                                }
                                if (~var12.field1755 != -1 && arg10 != null) {
                                    arg10.method3308(arg7, arg0, -102, arg6, arg9, !var12.field1711, var12.field1731);
                                }
                                if (var12.field1718 != 64) {
                                    class214.method1471(arg1, arg0, arg7, var12.field1718);
                                }
                            } else if (~arg6 == -4) {
                                class100 var40;
                                if (var24) {
                                    class708 var39 = new class708(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg6, arg9, var23);
                                    if (var39.method584(arg5 + -18493)) {
                                        var39.method583(836, arg3);
                                    }
                                    var40 = var39;
                                } else {
                                    var40 = new class127(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg6, arg9, arg8);
                                }
                                class187.method1359(arg1, arg0, arg7, var40, (class100) null);
                                if (var12.field1753 && class587.field8002) {
                                    if (arg9 == 0) {
                                        var19.method1155(arg0, arg7 + 1, 50);
                                    } else if (~arg9 == -2) {
                                        var19.method1155(arg0 + 1, arg7 + 1, 50);
                                    } else if (~arg9 != -3) {
                                        if (arg9 == 3) {
                                            var19.method1155(arg0, arg7, 50);
                                        }
                                    } else {
                                        var19.method1155(arg0 + 1, arg7, 50);
                                    }
                                }
                                if (~var12.field1755 != -1 && arg10 != null) {
                                    arg10.method3308(arg7, arg0, arg5 ^ -71, arg6, arg9, !var12.field1711, var12.field1731);
                                }
                            } else if (arg6 == 9) {
                                class494 var42;
                                if (var24) {
                                    class51 var41 = new class51(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg0, arg0, arg7, arg7, arg6, arg9, var23);
                                    if (var41.method584(arg5 + -18493)) {
                                        var41.method583(836, arg3);
                                    }
                                    var42 = var41;
                                } else {
                                    var42 = new class143(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg0, arg0 + -1 + var14, arg7, var13 - 1 + arg7, arg6, arg9, arg8);
                                }
                                class625.method3565(var42, false);
                                if (~var12.field1790 == -2 && !super.field3671) {
                                    byte var43;
                                    if ((arg9 & 1) == 0) {
                                        var43 = 8;
                                    } else {
                                        var43 = 16;
                                    }
                                    class339.method2140(arg0, 0, var12.field1744, arg7, -1, arg1, var43);
                                }
                                if (var12.field1755 != 0 && arg10 != null) {
                                    arg10.method3303(!var12.field1711, var14, arg7, true, arg0, var12.field1731, var13);
                                }
                                if (var12.field1718 != 64) {
                                    class214.method1471(arg1, arg0, arg7, var12.field1718);
                                }
                            } else if (~arg6 == -5) {
                                class424 var44;
                                if (!var24) {
                                    var44 = new class705(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, 0, 0, arg6, arg9, arg8);
                                } else {
                                    class121 var45 = new class121(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, 0, 0, arg6, arg9);
                                    if (var45.method584(-18443)) {
                                        var45.method583(arg5 + 786, arg3);
                                    }
                                    var44 = var45;
                                }
                                class211.method1452(arg1, arg0, arg7, var44, (class424) null);
                            } else if (~arg6 == -6) {
                                int var46 = 65;
                                class258 var47 = (class258) class28.method398(arg1, arg0, arg7);
                                if (var47 != null) {
                                    var46 = 1 + class76.field1366.method1680(0, var47.method589(-93)).field1718;
                                }
                                class424 var49;
                                if (var24) {
                                    class121 var48 = new class121(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, class474.field6622[arg9] * var46, class630.field8675[arg9] * var46, arg6, arg9);
                                    if (var48.method584(-18443)) {
                                        var48.method583(836, arg3);
                                    }
                                    var49 = var48;
                                } else {
                                    var49 = new class705(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, class474.field6622[arg9] * var46, class630.field8675[arg9] * var46, arg6, arg9, arg8);
                                }
                                class211.method1452(arg1, arg0, arg7, var49, (class424) null);
                            } else if (arg6 == 6) {
                                int var50 = 33;
                                class258 var51 = (class258) class28.method398(arg1, arg0, arg7);
                                if (var51 != null) {
                                    var50 = 1 + class76.field1366.method1680(0, var51.method589(-117)).field1718 / 2;
                                }
                                class424 var53;
                                if (var24) {
                                    class121 var52 = new class121(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, class474.field6622[arg9] * var50, class630.field8675[arg9] * var50, arg6, arg9 + 4);
                                    if (var52.method584(-18443)) {
                                        var52.method583(836, arg3);
                                    }
                                    var53 = var52;
                                } else {
                                    var53 = new class705(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, class349.field4878[arg9] * var50, class418.field6051[arg9] * var50, arg6, arg9 + 4, arg8);
                                }
                                class211.method1452(arg1, arg0, arg7, var53, (class424) null);
                            } else if (~arg6 == -8) {
                                int var54 = 3 & arg9 + 2;
                                class424 var55;
                                if (!var24) {
                                    var55 = new class705(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, 0, 0, arg6, var54 + 4, arg8);
                                } else {
                                    class121 var56 = new class121(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, 0, 0, arg6, var54 + 4);
                                    if (var56.method584(arg5 ^ -18489)) {
                                        var56.method583(836, arg3);
                                    }
                                    var55 = var56;
                                }
                                class211.method1452(arg1, arg0, arg7, var55, (class424) null);
                            } else if (arg6 == 8) {
                                int var57 = arg9 + 2 & 3;
                                int var58 = 33;
                                class258 var59 = (class258) class28.method398(arg1, arg0, arg7);
                                if (var59 != null) {
                                    var58 = class76.field1366.method1680(arg5 + -50, var59.method589(-122)).field1718 / 2 + 1;
                                }
                                class424 var62;
                                class424 var63;
                                if (!var24) {
                                    class705 var60 = new class705(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, class349.field4878[arg9] * var58, class418.field6051[arg9] * var58, arg6, arg9 - -4, arg8);
                                    class705 var61 = new class705(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, 0, 0, arg6, var57 + 4, arg8);
                                    var62 = var60;
                                    var63 = var61;
                                } else {
                                    class121 var64 = new class121(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, class349.field4878[arg9] * var58, class418.field6051[arg9] * var58, arg6, arg9 + 4);
                                    class121 var65 = new class121(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, 0, 0, arg6, var57 + 4);
                                    if (var64.method584(-18443)) {
                                        var64.method583(836, arg3);
                                    }
                                    if (var65.method584(arg5 ^ -18489)) {
                                        var65.method583(836, arg3);
                                    }
                                    var63 = var65;
                                    var62 = var64;
                                }
                                class211.method1452(arg1, arg0, arg7, var62, var63);
                            }
                        } else {
                            class494 var27;
                            if (!var24) {
                                var27 = new class143(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg0, var14 - 1 + arg0, arg7, arg7 - (-var13 - -1), arg6, arg9, arg8);
                            } else {
                                class51 var28 = new class51(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg0, arg0 + var14 + -1, arg7, arg7 + -1 + var13, arg6, arg9, var23);
                                var27 = var28;
                                if (var28.method584(-18443)) {
                                    var28.method583(arg5 + 786, arg3);
                                }
                            }
                            class625.method3565(var27, false);
                            if (class587.field8002 && !super.field3671 && ~arg6 <= -13 && ~arg6 >= -18 && arg6 != 13 && arg1 > 0 && ~var12.field1790 != -1) {
                                super.field3670[arg1][arg0][arg7] = (byte) class418.method2577(super.field3670[arg1][arg0][arg7], 4);
                            }
                            if (~var12.field1755 != -1 && arg10 != null) {
                                arg10.method3303(!var12.field1711, var14, arg7, true, arg0, var12.field1731, var13);
                            }
                        }
                    } else {
                        class51 var66 = null;
                        int var67;
                        class494 var68;
                        if (!var24) {
                            var67 = 15;
                            var68 = new class143(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg0, arg0 + -1 + var14, arg7, arg7 + var13 + -1, arg6, arg9, arg8);
                        } else {
                            class51 var69 = new class51(arg3, var12, arg1, arg4, var21, var20, var22, super.field3671, arg0, arg0 + -1 + var14, arg7, arg7 + var13 + -1, arg6, arg9, var23);
                            var68 = var69;
                            var66 = var69;
                            var67 = var69.method587(15);
                        }
                        if (class625.method3565(var68, false)) {
                            if (var66 != null && var66.method584(-18443)) {
                                var66.method583(836, arg3);
                            }
                            if (var12.field1753 && class587.field8002) {
                                if (~var67 < -31) {
                                    var67 = 30;
                                }
                                for (int var70 = 0; ~var14 <= ~var70; ++var70) {
                                    for (int var71 = 0; var13 >= var71; ++var71) {
                                        var19.method1155(arg0 + var70, arg7 + var71, var67);
                                    }
                                }
                            }
                        }
                        if (~var12.field1755 != -1 && arg10 != null) {
                            arg10.method3303(!var12.field1711, var14, arg7, true, arg0, var12.field1731, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(IIIII)Lse;")
    private final class258 method2758(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6578;
        class258 var6 = null;
        if (~arg0 == -1) {
            var6 = (class258) class28.method398(arg3, arg2, arg1);
        }
        if (arg0 == 1) {
            var6 = (class258) class466.method2743(arg3, arg2, arg1);
        }
        if (arg0 == 2) {
            var6 = (class258) class562.method3228(arg3, arg2, arg1, field6583 != null ? field6583 : (field6583 = method2767("se")));
        }
        if (arg4 != 30987) {
            method2766(-120);
        }
        if (~arg0 == -4) {
            var6 = (class258) class12.method112(arg3, arg2, arg1);
        }
        return var6;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILha;Lcea;[IIB)V")
    public final void method2759(int arg0, class59 arg1, class215 arg2, int[] arg3, int arg4, byte arg5) {
        ++field6574;
        if (!super.field3671) {
            boolean var7 = false;
            class387 var8 = null;
            int var9 = -112 / ((-71 - arg5) / 38);
            if (arg3 != null) {
                arg3[0] = -1;
            }
            while (true) {
                while (~arg2.field3066.length < ~arg2.field3109) {
                    int var19 = arg2.method1535(255);
                    if (~var19 == -1) {
                        var8 = new class387(arg2);
                    } else if (~var19 == -2) {
                        int var35 = arg2.method1535(255);
                        if (~var35 < -1) {
                            for (int var36 = 0; var35 > var36; ++var36) {
                                class2 var37 = new class2(arg1, arg2, 2);
                                if (var37.field7 == 31) {
                                    class74 var38 = class669.field9130.method3818((byte) -1, arg2.method1478(842397944));
                                    var37.method3(var38.field1342, (byte) 115, var38.field1340, var38.field1336, var38.field1335);
                                }
                                if (arg1.method318() > 0) {
                                    class669 var39 = var37.field18;
                                    int var40 = (arg4 << 9) + var39.method3759(-1);
                                    int var41 = var39.method3752((byte) 93) + (arg0 << 9);
                                    int var42 = var40 >> 9;
                                    int var43 = var41 >> 9;
                                    if (~var42 <= -1 && ~var43 <= -1 && super.field3679 > var42 && super.field3676 > var43) {
                                        var39.method1432(var40, (byte) 70, var41, super.field3684[var37.field4][var42][var43] + -var39.method3757(120));
                                        class634.method3615(var37);
                                    }
                                }
                            }
                        }
                    } else if (~var19 == -3) {
                        if (var8 == null) {
                            var8 = new class387();
                        }
                        var8.method2440(8, arg2);
                    } else if (var19 == 128) {
                        if (arg3 != null) {
                            arg3[0] = arg2.method1478(842397944);
                            arg3[1] = arg2.method1520(13638);
                            arg3[2] = arg2.method1520(13638);
                            arg3[3] = arg2.method1520(13638);
                            arg3[4] = arg2.method1478(842397944);
                        } else {
                            arg2.field3109 += 10;
                        }
                    } else {
                        if (~var19 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field3666 == null) {
                            super.field3666 = new byte[4][][];
                        }
                        for (int var20 = 0; ~var20 > -5; ++var20) {
                            byte var21 = arg2.method1536(-102);
                            if (var21 == 0 && super.field3666[var20] != null) {
                                int var22 = arg4;
                                int var23 = arg4 - -64;
                                int var24 = arg0;
                                if (~arg0 > -1) {
                                    var24 = 0;
                                } else if (~arg0 <= ~super.field3676) {
                                    var24 = super.field3676;
                                }
                                if (arg4 >= 0) {
                                    if (~arg4 <= ~super.field3679) {
                                        var22 = super.field3679;
                                    }
                                } else {
                                    var22 = 0;
                                }
                                int var25 = arg0 - -64;
                                if (var23 < 0) {
                                    var23 = 0;
                                } else if (var23 >= super.field3679) {
                                    var23 = super.field3679;
                                }
                                if (~var25 > -1) {
                                    var25 = 0;
                                } else if (~var25 <= ~super.field3676) {
                                    var25 = super.field3676;
                                }
                                while (var22 < var23) {
                                    while (var25 > var24) {
                                        super.field3666[var20][var22][var24] = 0;
                                        ++var24;
                                    }
                                    ++var22;
                                }
                            } else if (~var21 != -2) {
                                if (var21 == 2) {
                                    if (super.field3666[var20] == null) {
                                        super.field3666[var20] = new byte[super.field3679 - -1][super.field3676 + 1];
                                    }
                                    if (~var20 < -1) {
                                        int var26 = arg4;
                                        int var27 = arg4 + 64;
                                        int var28 = arg0;
                                        if (~var27 <= -1) {
                                            if (super.field3679 <= var27) {
                                                var27 = super.field3679;
                                            }
                                        } else {
                                            var27 = 0;
                                        }
                                        if (arg0 < 0) {
                                            var28 = 0;
                                        } else if (super.field3676 <= arg0) {
                                            var28 = super.field3676;
                                        }
                                        int var29 = arg0 + 64;
                                        if (arg4 >= 0) {
                                            if (~arg4 <= ~super.field3679) {
                                                var26 = super.field3679;
                                            }
                                        } else {
                                            var26 = 0;
                                        }
                                        if (var29 >= 0) {
                                            if (var29 >= super.field3676) {
                                                var29 = super.field3676;
                                            }
                                        } else {
                                            var29 = 0;
                                        }
                                        while (~var26 > ~var27) {
                                            while (~var28 > ~var29) {
                                                super.field3666[var20][var26][var28] = super.field3666[var20 + -1][var26][var28];
                                                ++var28;
                                            }
                                            ++var26;
                                        }
                                    }
                                }
                            } else {
                                if (super.field3666[var20] == null) {
                                    super.field3666[var20] = new byte[super.field3679 + 1][super.field3676 + 1];
                                }
                                for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                    for (int var31 = 0; ~var31 > -65; var31 += 4) {
                                        byte var32 = arg2.method1536(-103);
                                        for (int var33 = arg4 + var30; ~(var30 + 4 + arg4) < ~var33; ++var33) {
                                            for (int var34 = arg0 + var31; ~var34 > ~(arg0 + 4 + var31); ++var34) {
                                                if (var33 >= 0 && ~var33 > ~super.field3679 && var34 >= 0 && var34 < super.field3676) {
                                                    super.field3666[var20][var33][var34] = var32;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var7 = true;
                    }
                }
                if (var8 != null) {
                    for (int var10 = 0; var10 < 8; ++var10) {
                        for (int var11 = 0; var11 < 8; ++var11) {
                            int var12 = (arg4 >> 3) + var10;
                            int var13 = (arg0 >> 3) - -var11;
                            if (var12 >= 0 && ~var12 > ~(super.field3679 >> 3) && var13 >= 0 && ~(super.field3676 >> 3) < ~var13) {
                                class608.method3453(var8, 10000, var12, var13);
                            }
                        }
                    }
                }
                if (!var7 && super.field3666 != null) {
                    for (int var14 = 0; var14 < 4; ++var14) {
                        if (super.field3666[var14] != null) {
                            for (int var15 = 0; ~var15 > -17; ++var15) {
                                for (int var16 = 0; ~var16 > -17; ++var16) {
                                    int var17 = (arg4 >> 2) + var15;
                                    int var18 = (arg0 >> 2) + var16;
                                    if (var17 >= 0 && ~var17 > -27 && var18 >= 0 && ~var18 > -27) {
                                        super.field3666[var14][var17][var18] = 0;
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

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II[BIILha;III[Lfe;I)V")
    public final void method2760(int arg0, int arg1, byte[] arg2, int arg3, int arg4, class59 arg5, int arg6, int arg7, int arg8, class570[] arg9, int arg10) {
        ++field6582;
        if (arg8 != 7) {
            method2761((char) 65464, -54);
        }
        class215 var12 = new class215(arg2);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1482(-85);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1530(-117);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method1535(255);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (arg3 == var19 && ~var18 <= ~arg0 && arg0 - -8 > var18 && ~var17 <= ~arg4 && ~var17 > ~(arg4 - -8)) {
                    class99 var23 = class76.field1366.method1680(0, var13);
                    int var24 = class198.method1407(7 & var17, var18 & 7, arg1, true, var23.field1761, var23.field1796, var22) + arg7;
                    int var25 = arg6 + class398.method2491(7 & var18, var23.field1761, var22, var23.field1796, var17 & 7, arg1, (byte) 16);
                    if (var24 > 0 && var25 > 0 && var24 < super.field3679 + -1 && super.field3676 + -1 > var25) {
                        class570 var26 = null;
                        if (!super.field3671) {
                            int var27 = arg10;
                            if ((2 & class607.field8331[1][var24][var25]) == 2) {
                                var27 = arg10 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg9[var27];
                            }
                        }
                        this.method2757(var24, arg10, var13, arg5, arg10, 50, var21, var25, -1, var22 - -arg1 & 3, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(CI)Z")
    public static final boolean method2761(char arg0, int arg1) {
        ++field6571;
        if (arg1 > -100) {
            method2761((char) 65443, 97);
        }
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= 160 && ~arg0 >= -256) {
            return true;
        } else {
            return arg0 == 8364 || ~arg0 == -339 || ~arg0 == -8213 || arg0 == 339 || ~arg0 == -377;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lfe;IILha;IIB)V")
    public final void method2762(class570 arg0, int arg1, int arg2, class59 arg3, int arg4, int arg5, byte arg6) {
        ++field6573;
        class258 var8 = this.method2758(arg1, arg5, arg4, arg2, 30987);
        if (arg6 <= 66) {
            field6575 = -107;
        }
        if (var8 != null) {
            class99 var9 = class76.field1366.method1680(0, var8.method589(-89));
            int var10 = var8.method594(-128);
            int var11 = var8.method588(-32228);
            if (var9.method919((byte) -50)) {
                class451.method2687(var9, arg4, arg5, arg2, -128);
            }
            if (var8.method584(-18443)) {
                var8.method591(arg3, -14218);
            }
            if (arg1 == 0) {
                class528.method3055(arg2, arg4, arg5);
                if (~var9.field1755 != -1) {
                    arg0.method3304(var9.field1731, var11, arg4, var10, arg5, !var9.field1711, 29216);
                }
                if (~var9.field1790 == -2) {
                    if (var11 != 0) {
                        if (~var11 != -2) {
                            if (var11 != 2) {
                                if (var11 == 3) {
                                    class535.method3084(arg2, 2, arg5, -3951, arg4);
                                    return;
                                }
                            } else {
                                class535.method3084(arg2, 1, arg5, -3951, arg4 + 1);
                            }
                            return;
                        }
                        class535.method3084(arg2, 2, arg5 + 1, -3951, arg4);
                        return;
                    }
                    class535.method3084(arg2, 1, arg5, -3951, arg4);
                    return;
                }
            } else if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        class12.method113(arg2, arg4, arg5);
                        if (var9.field1755 == 1) {
                            arg0.method3297((byte) -52, arg4, arg5);
                            return;
                        }
                    }
                    return;
                }
                class187.method1358(arg2, arg4, arg5, field6583 != null ? field6583 : (field6583 = method2767("se")));
                if (~var9.field1755 != -1 && var9.field1796 + arg4 < super.field3679 && arg5 - -var9.field1796 < super.field3676 && var9.field1761 + arg4 < super.field3679 && super.field3676 > var9.field1761 + arg5) {
                    arg0.method3307(var11, !var9.field1711, var9.field1731, arg4, arg5, var9.field1761, 84, var9.field1796);
                }
                if (var10 == 9) {
                    if ((1 & var11) != 0) {
                        class535.method3084(arg2, 16, arg5, -3951, arg4);
                        return;
                    }
                    class535.method3084(arg2, 8, arg5, -3951, arg4);
                    return;
                }
            } else {
                class87.method828(arg2, arg4, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "([B[Lfe;ILha;II)V")
    public final void method2763(byte[] arg0, class570[] arg1, int arg2, class59 arg3, int arg4, int arg5) {
        ++field6576;
        if (arg5 == 1359) {
            class215 var7 = new class215(arg0);
            int var8 = -1;
            while (true) {
                int var9 = var7.method1482(-57);
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method1530(-122);
                    if (~var11 == -1) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = 63 & var10;
                    int var13 = var10 >> 6 & 63;
                    int var14 = var10 >> 12;
                    int var15 = var7.method1535(255);
                    int var16 = var15 >> 2;
                    int var17 = 3 & var15;
                    int var18 = arg4 + var13;
                    int var19 = arg2 + var12;
                    if (var18 > 0 && ~var19 < -1 && ~(super.field3679 - 1) < ~var18 && var19 < super.field3676 - 1) {
                        class570 var20 = null;
                        if (!super.field3671) {
                            int var21 = var14;
                            if ((2 & class607.field8331[1][var18][var19]) == 2) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg1[var21];
                            }
                        }
                        this.method2757(var18, var14, var8, arg3, var14, arg5 ^ 1405, var16, var19, -1, var17, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(IIIZ)V")
    public class469(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class732.field9888, class130.field2186);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lcea;ZIIIIIILha;[II)V")
    public final void method2764(class215 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class59 arg8, int[] arg9, int arg10) {
        ++field6581;
        if (!super.field3671) {
            class387 var13 = null;
            if (arg9 != null) {
                arg9[0] = -1;
            }
            int var14 = (7 & arg3) * 8;
            int var15 = (arg2 & 7) * 8;
            while (true) {
                int var21;
                label237: do {
                    while (true) {
                        while (arg0.field3066.length > arg0.field3109) {
                            int var20 = arg0.method1535(255);
                            if (~var20 != -1) {
                                if (var20 == 1) {
                                    var21 = arg0.method1535(255);
                                    continue label237;
                                }
                                if (~var20 == -3) {
                                    if (var13 == null) {
                                        var13 = new class387();
                                    }
                                    var13.method2440(8, arg0);
                                } else if (var20 == 128) {
                                    if (arg9 != null) {
                                        arg9[0] = arg0.method1478(842397944);
                                        arg9[1] = arg0.method1520(13638);
                                        arg9[2] = arg0.method1520(13638);
                                        arg9[3] = arg0.method1520(13638);
                                        arg9[4] = arg0.method1478(842397944);
                                    } else {
                                        arg0.field3109 += 10;
                                    }
                                } else {
                                    if (var20 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field3666 == null) {
                                        super.field3666 = new byte[4][][];
                                    }
                                    for (int var32 = 0; var32 < 4; ++var32) {
                                        byte var33 = arg0.method1536(-112);
                                        if (~var33 == -1 && super.field3666[arg5] != null) {
                                            if (arg10 >= var32) {
                                                int var34 = arg4;
                                                int var35 = arg4 - -7;
                                                int var36 = arg7;
                                                if (~var35 <= -1) {
                                                    if (super.field3679 <= var35) {
                                                        var35 = super.field3679;
                                                    }
                                                } else {
                                                    var35 = 0;
                                                }
                                                if (arg4 < 0) {
                                                    var34 = 0;
                                                } else if (~super.field3679 >= ~arg4) {
                                                    var34 = super.field3679;
                                                }
                                                int var37 = arg7 - -7;
                                                if (~arg7 > -1) {
                                                    var36 = 0;
                                                } else if (~arg7 <= ~super.field3676) {
                                                    var36 = super.field3676;
                                                }
                                                if (~var37 <= -1) {
                                                    if (var37 >= super.field3676) {
                                                        var37 = super.field3676;
                                                    }
                                                } else {
                                                    var37 = 0;
                                                }
                                                while (~var35 < ~var34) {
                                                    while (var36 < var37) {
                                                        super.field3666[arg5][var34][var36] = 0;
                                                        ++var36;
                                                    }
                                                    ++var34;
                                                }
                                            }
                                        } else if (~var33 == -2) {
                                            if (super.field3666[arg5] == null) {
                                                super.field3666[arg5] = new byte[super.field3679 + 1][super.field3676 + 1];
                                            }
                                            for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                                for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                                    byte var40 = arg0.method1536(-113);
                                                    if (var32 <= arg10) {
                                                        for (int var41 = var38; ~(var38 - -4) < ~var41; ++var41) {
                                                            for (int var42 = var39; ~(var39 - -4) < ~var42; ++var42) {
                                                                if (~var14 >= ~var41 && var41 < var14 + 8 && var15 <= var42 && ~var15 > ~(var15 + 8)) {
                                                                    int var43 = arg4 - -class67.method672(7 & var42, arg6, var41 & 7, (byte) 71);
                                                                    int var44 = arg7 + class116.method1023(var41 & 7, true, 7 & var42, arg6);
                                                                    if (var43 >= 0 && ~var43 > ~super.field3679 && ~var44 <= -1 && super.field3676 > var44) {
                                                                        super.field3666[arg5][var43][var44] = var40;
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
                                var13 = new class387(arg0);
                            }
                        }
                        if (var13 != null) {
                            class608.method3453(var13, 10000, arg4 >> 3, arg7 >> 3);
                        }
                        if (!arg1 && super.field3666 != null && super.field3666[arg5] != null) {
                            int var16 = arg4 + 7;
                            int var17 = arg7 + 7;
                            for (int var18 = arg4; ~var18 > ~var16; ++var18) {
                                for (int var19 = arg7; var19 < var17; ++var19) {
                                    super.field3666[arg5][var18][var19] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (var21 <= 0);
                for (int var22 = 0; ~var22 > ~var21; ++var22) {
                    class2 var23 = new class2(arg8, arg0, 2);
                    if (var23.field7 == 31) {
                        class74 var24 = class669.field9130.method3818((byte) 111, arg0.method1478(842397944));
                        var23.method3(var24.field1342, (byte) 124, var24.field1340, var24.field1336, var24.field1335);
                    }
                    if (~arg8.method318() < -1) {
                        class669 var25 = var23.field18;
                        int var26 = var25.method3759(-1) >> 9;
                        int var27 = var25.method3752((byte) 79) >> 9;
                        if (~var23.field4 == ~arg10 && ~var26 <= ~var14 && ~var26 > ~(var14 + 8) && var15 <= var27 && ~var27 > ~(var15 - -8)) {
                            int var28 = (arg4 << 9) + class406.method2530(4095 & var25.method3752((byte) 95), 4095 & var25.method3759(-1), -2, arg6);
                            int var29 = (arg7 << 9) + class35.method446(4095, arg6, 4095 & var25.method3752((byte) 119), 4095 & var25.method3759(-1));
                            int var30 = var28 >> 9;
                            int var31 = var29 >> 9;
                            if (var30 >= 0 && ~var31 <= -1 && var30 < super.field3679 && ~var31 > ~super.field3676) {
                                var25.method1432(var28, (byte) 70, var29, super.field3684[arg10][var30][var31] - var25.method3757(124));
                                class634.method3615(var23);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZLha;I)V")
    public final void method2765(boolean arg0, class59 arg1, int arg2) {
        class755.method4216();
        ++field6572;
        if (!arg0) {
            if (~super.field3692 < -2) {
                for (int var4 = 0; super.field3679 > var4; ++var4) {
                    for (int var5 = 0; super.field3676 > var5; ++var5) {
                        if ((2 & class607.field8331[1][var4][var5]) == 2) {
                            class313.method2033(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; ~var6 > ~super.field3692; ++var6) {
                for (int var7 = 0; super.field3676 >= var7; ++var7) {
                    for (int var8 = 0; ~var8 >= ~super.field3679; ++var8) {
                        if (~(4 & super.field3670[var6][var8][var7]) != -1) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (var11 > 0 && ~(super.field3670[var6][var8][var11 + -1] & 4) != -1 && var12 - var11 < 10) {
                                --var11;
                            }
                            while (super.field3676 > var12 && (4 & super.field3670[var6][var8][var12 + 1]) != 0 && ~(-var11 + var12) > -11) {
                                ++var12;
                            }
                            label118: while (~var9 < -1 && -var9 + var10 < 10) {
                                for (int var13 = var11; ~var12 <= ~var13; ++var13) {
                                    if (~(super.field3670[var6][var9 + -1][var13] & 4) == -1) {
                                        break label118;
                                    }
                                }
                                --var9;
                            }
                            label105: while (var10 < super.field3679 && -var9 + var10 < 10) {
                                for (int var14 = var11; ~var14 >= ~var12; ++var14) {
                                    if ((super.field3670[var6][var10 + 1][var14] & 4) == 0) {
                                        break label105;
                                    }
                                }
                                ++var10;
                            }
                            if ((-var9 + 1 + var10) * (-var11 + var12 + 1) >= 4) {
                                int var15 = super.field3684[var6][var9][var11];
                                class533.method3068((var10 << 9) + 512, var15, var11 << 9, var15, (byte) 0, 4, (var12 << 9) + 512, var6, var9 << 9);
                                for (int var16 = var9; ~var10 <= ~var16; ++var16) {
                                    for (int var17 = var11; ~var17 >= ~var12; ++var17) {
                                        super.field3670[var6][var16][var17] = (byte) class263.method1762(super.field3670[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class720.method4003(12);
        }
        if (arg2 < -6) {
            super.field3670 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V")
    public static void method2766(int arg0) {
        field6577 = null;
        if (arg0 != 1) {
            method2766(-10);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2767(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
