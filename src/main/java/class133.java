import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class133 {

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "J")
    private long field1648 = -1L;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "J")
    private long field1653 = -1L;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    private int field1657 = 0;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lrv;")
    private class72 field1639;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "J")
    private long field1640;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "J")
    private long field1642;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "[B")
    private byte[] field1652;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "[B")
    private byte[] field1646;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "J")
    private long field1649;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1658 = new String[] { method1168(method1167("-T\u0014,>")), method1168(method1167("$EV\f")), method1168(method1167("1\u001e\u0014Nk")), method1168(method1167("-T\u0014(>")), method1168(method1167("-T\u0014$>")), method1168(method1167("-T\u0014'>")), method1168(method1167("-T\u0014#>")), method1168(method1167("-T\u0014&>")), method1168(method1167("-T\u0014\\\u007f$YN^>")), method1168(method1167("-T\u0014)>")), method1168(method1167("jYT@p#\\_@")), method1168(method1167("\u0003^L\u0001z#T\u001a\u0013s/[\u001a\u0014yj")), method1168(method1167("-T\u0014!>")), method1168(method1167("-T\u0014*>")), method1168(method1167("-T\u0014+>")), method1168(method1167("\"YT\u0014I'QJ\u0005r-U")), method1168(method1167("'QJ\u0006z+W")), method1168(method1167("\"YT\u0014I\"U[\u0004\u007f)_T\u0013")), method1168(method1167(")_W\u0010w9C")), method1168(method1167("\"YN\rw8[I")), method1168(method1167(",\\U\u000fd9X[\u0004y=C")), method1168(method1167(">YW\u0005d(QH?r/V[\u0015z>")), method1168(method1167("9SH\u000fz&R[\u0012")), method1168(method1167("%DR\u0005d&UL\u0005z")), method1168(method1167("$QW\u0005I#SU\u000ee")), method1168(method1167(")BU\u0013e")), method1168(method1167("\"YT\u0014I'QJ\rw8[_\u0012e")), method1168(method1167("-T\u0014\">")), method1168(method1167("'QJ\u0004y>C")), method1168(method1167("\"YN\u0002w8o^\u0005p+EV\u0014")), method1168(method1167("\"U[\u0004\u007f)_T\u0013I:[")), method1168(method1167("\"U[\u0004\u007f)_T\u0013I:B[\u0019s8")), method1168(method1167("\u001aQH\u0014\u007f)\\_\u0013,j")), method1168(method1167("\u0006_X\u0002op\u0010s\u000e,")), method1168(method1167("j`VZ6")), method1168(method1167("\f@IZ")), method1168(method1167("\u001a_V\u0019ep\u0010")), method1168(method1167("\rQW\u0005,jyTZ")), method1168(method1167("vSU\f+,V\u0003P\"z\u000e")), method1168(method1167("\u001dqh._\u0004w\u0000@[/]U\u0012ojEI\u0001q/\u0010U\u0016s8\u0010\fT[\b\u0011\u001a0z/QI\u00056#^\\\u000fd'\u0010M\by/F_\u00126#C\u001a\u0012s9@U\u000ee#RV\u00056,_H@b\"U\u001a\u0003y$D_\u000ebeQH\u0005wjIU\u00156+B_@c9YT\u00079#^\u0014")), method1168(method1167("o\u0019")), method1168(method1167("\u0007UWZ")), method1168(method1167("-T\u0014%>")), method1168(method1167("v\u001fY\u000fzt\u0010B")), method1168(method1167("j~j#,j")), method1168(method1167("o\u0010\u0012")), method1168(method1167("j\u001f\u001a")), method1168(method1167("\u0006C\u0000@")), method1168(method1167("j}U\u0004s&C\u0000@")), method1168(method1167("j|[Z6")), method1168(method1167("\b\u001fI")), method1168(method1167("\u0005V\\\bs+@\u0000")), method1168(method1167("\tQY\bsp")), method1168(method1167("\b\u001fI@Y?D\u0000")) };

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field1651 = 0;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "J")
    private long field1655;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIBIIIZII[Lvo;)V", line = 3)
    public static final void method1155(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, class782[] arg10) {
        try {
            class236.field3418.method208(arg2, arg8, arg4, arg5);
            field1643++;
            for (int var11 = 0; var11 < arg10.length; var11++) {
                class782 var12 = arg10[var11];
                if (var12 != null && (var12.field11136 == arg1 || arg1 == -1412584499 && class543.field7943 == var12)) {
                    int var13 = var12.field11288 + arg9;
                    int var14 = var12.field11218 + arg0;
                    int var15 = var12.field11295 + var13 + 1;
                    int var16 = var14 + var12.field11244 + 1;
                    int var17;
                    if (arg6 == -1) {
                        class353.field5107[class153.field1962].setBounds(var12.field11288 + arg9, var12.field11218 + arg0, var12.field11295, var12.field11244);
                        var17 = class153.field1962++;
                    } else {
                        var17 = arg6;
                    }
                    var12.field11170 = class694.field9700;
                    var12.field11130 = var17;
                    if (!client.method4977(var12)) {
                        if (var12.field11219 != 0) {
                            class250.method2035(var12, false);
                        }
                        int var18 = var12.field11288 + arg9;
                        int var19 = var12.field11218 + arg0;
                        int var20 = 0;
                        int var21 = 0;
                        if (class212.field3119) {
                            var20 = class784.method5647((byte) 105);
                            var21 = class30.method328(-17233);
                        }
                        int var22 = var12.field11135;
                        if (class556.field8095 && (client.method4957(var12).field1739 != 0 || var12.field11291 == 0) && var22 > 127) {
                            var22 = 127;
                        }
                        if (class543.field7943 == var12) {
                            if (arg1 != -1412584499 && (class784.field11318 == var12.field11194 || class635.field9008 == var12.field11194)) {
                                class51.field727 = arg9;
                                class693.field9686 = arg0;
                                class430.field6243 = arg10;
                                continue;
                            }
                            if (class674.field9466 && class618.field8817) {
                                int var23 = var20 + class604.field8668.method2881((byte) 121);
                                int var24 = class604.field8668.method2879(-237) + var21;
                                int var25 = var23 - class527.field7667;
                                int var26 = var24 - class738.field10511;
                                if (var25 < class565.field8250) {
                                    var25 = class565.field8250;
                                }
                                if (class741.field10535 > var26) {
                                    var26 = class741.field10535;
                                }
                                if (class565.field8250 + class198.field2936.field11295 < var12.field11295 + var25) {
                                    var25 = class565.field8250 + class198.field2936.field11295 - var12.field11295;
                                }
                                if (class741.field10535 + class198.field2936.field11244 < var12.field11244 + var26) {
                                    var26 = class741.field10535 + class198.field2936.field11244 - var12.field11244;
                                }
                                var18 = var25;
                                var19 = var26;
                            }
                            if (class635.field9008 == var12.field11194) {
                                var22 = 128;
                            }
                        }
                        int var29;
                        int var30;
                        int var31;
                        int var32;
                        if (var12.field11291 == 2) {
                            var30 = arg8;
                            var31 = arg5;
                            var32 = arg4;
                            var29 = arg2;
                        } else {
                            int var27 = var18 + var12.field11295;
                            int var28 = var12.field11244 + var19;
                            var29 = arg2 < var18 ? var18 : arg2;
                            var30 = arg8 >= var19 ? arg8 : var19;
                            if (var12.field11291 == 9) {
                                var27++;
                                var28++;
                            }
                            var31 = var28 < arg5 ? var28 : arg5;
                            var32 = arg4 > var27 ? var27 : arg4;
                        }
                        if (var32 > var29 && var31 > var30) {
                            if (var12.field11219 != 0) {
                                if (class189.field2510 == var12.field11219 || class219.field3193 == var12.field11219) {
                                    class298.method2391(var12, var18, (byte) -86, var19);
                                    if (!class212.field3119) {
                                        class283.method2298(var19, var12.field11295, class219.field3193 == var12.field11219, var18, -17832, var12.field11244);
                                        class236.field3418.method208(arg2, arg8, arg4, arg5);
                                    }
                                    class752.field10742[var17] = true;
                                    continue;
                                }
                                if (class750.field10676 == var12.field11219) {
                                    if (var12.method5630((byte) -33, class236.field3418) != null) {
                                        class635.method4633(121);
                                        class505.method3863(class236.field3418, var19, var12, var18, true);
                                        class7.field92[var17] = true;
                                        class236.field3418.method208(arg2, arg8, arg4, arg5);
                                        if (class212.field3119) {
                                            if (arg7) {
                                                class232.method1925(var14, var13, var16, var15, (byte) 93);
                                            } else {
                                                class739.method5360(var14, var16, var15, var13, -1);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (class374.field5461 == var12.field11219) {
                                    class742.method5377(var18, var19, var12, (byte) -119, class236.field3418);
                                    continue;
                                }
                                if (class104.field1373 == var12.field11219) {
                                    class281.method2285(var12.field11192 % 64, class236.field3418, var19, 8, var18, var12);
                                    continue;
                                }
                                if (class468.field6825 == var12.field11219) {
                                    if (var12.method5630((byte) -33, class236.field3418) != null) {
                                        class761.method5516(var19, var12, var18, -56);
                                        class7.field92[var17] = true;
                                        class236.field3418.method208(arg2, arg8, arg4, arg5);
                                        if (class212.field3119) {
                                            if (arg7) {
                                                class232.method1925(var14, var13, var16, var15, (byte) -24);
                                            } else {
                                                class739.method5360(var14, var16, var15, var13, -1);
                                            }
                                        }
                                    }
                                    continue;
                                }
                                if (class557.field8116 == var12.field11219) {
                                    class232.method1924(var19, class608.field8716, var12.field11295, class236.field3418, 60, var18, var12.field11244);
                                    class752.field10742[var17] = true;
                                    class236.field3418.method208(arg2, arg8, arg4, arg5);
                                    continue;
                                }
                                if (class500.field7306 == var12.field11219) {
                                    class231.method1917(var12.field11295, var19, var12.field11244, class236.field3418, 1, var18);
                                    class752.field10742[var17] = true;
                                    class236.field3418.method208(arg2, arg8, arg4, arg5);
                                    continue;
                                }
                                if (class256.field3669 == var12.field11219) {
                                    if (!class453.field6626 && !class2.field25) {
                                        continue;
                                    }
                                    int var33 = var18 + var12.field11295;
                                    if (class212.field3119) {
                                        if (arg7) {
                                            class232.method1925(var14, var13, var16, var15, (byte) -102);
                                        } else {
                                            class739.method5360(var14, var16, var15, var13, -1);
                                        }
                                    }
                                    int var34 = var19 + 15;
                                    if (class453.field6626) {
                                        int var35 = -256;
                                        if (class736.field10492 < 20) {
                                            var35 = -65536;
                                        }
                                        class23.field279.method1819(-95, field1658[35] + class736.field10492, var33, var35, var34, -1);
                                        var34 += 15;
                                        Runtime var36 = Runtime.getRuntime();
                                        int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                        int var38 = -256;
                                        if (var37 > 98304) {
                                            if (class4.field59) {
                                                class452.method3502((byte) 124);
                                                for (int var39 = 0; var39 < 10; var39++) {
                                                    System.gc();
                                                }
                                                var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                                if (var37 > 65536) {
                                                    class756.method5485(4, (byte) 8, field1658[39]);
                                                }
                                            }
                                            var38 = -65536;
                                        }
                                        class23.field279.method1819(95, field1658[41] + var37 + "k", var33, var38, var34, -1);
                                        var34 += 15;
                                        class23.field279.method1819(96, field1658[37] + class60.field916.field11104 + field1658[53] + class60.field916.field11108 + field1658[50], var33, -256, var34, -1);
                                        var34 += 15;
                                        class23.field279.method1819(-99, field1658[33] + class60.field911.field11104 + field1658[53] + class60.field911.field11108 + field1658[50], var33, -256, var34, -1);
                                        var34 += 15;
                                        int var40 = class236.field3418.method122() / 1024;
                                        class23.field279.method1819(113, field1658[51] + var40 + "k", var33, var40 <= 65536 ? -256 : -65536, var34, -1);
                                        var34 += 15;
                                        int var41 = 0;
                                        int var42 = 0;
                                        int var43 = 0;
                                        for (int var44 = 0; var44 < 37; var44++) {
                                            if (class301.field4192[var44] != null) {
                                                var41 += class301.field4192[var44].method3803(81);
                                                var42 += class301.field4192[var44].method3789(false);
                                                var43 += class301.field4192[var44].method3802((byte) 58);
                                            }
                                        }
                                        int var45 = var43 * 100 / var41;
                                        int var46 = var42 * 10000 / var41;
                                        String var47 = field1658[52] + class649.method4729(true, (long) var46, (byte) 67, 0, 2) + field1658[45] + var45 + field1658[40];
                                        class626.field8945.method1819(56, var47, var33, -256, var34, -1);
                                        var34 += 12;
                                    }
                                    if (class623.field8909 > 0) {
                                        class626.field8945.method1819(5, field1658[32] + class720.field10256 + field1658[46] + class623.field8909, var33, -256, var34, -1);
                                    }
                                    var34 += 12;
                                    if (class2.field25) {
                                        class626.field8945.method1819(0, field1658[36] + class236.field3418.method139() + field1658[48] + class236.field3418.method184(), var33, -256, var34, -1);
                                        var34 += 12;
                                        class626.field8945.method1819(-106, field1658[47] + class650.field9233 + field1658[49] + class140.field1819 + field1658[44] + class369.field5339 + field1658[34] + class524.field7641, var33, -256, var34, -1);
                                        class80.method797((byte) -75);
                                        var34 += 12;
                                    }
                                    class752.field10742[var17] = true;
                                    continue;
                                }
                            }
                            if (var12.field11291 == 0) {
                                if (class690.field9655 == var12.field11219 && class236.field3418.method217()) {
                                    class236.field3418.method151(var18, var19, var12.field11295, var12.field11244);
                                }
                                method1155(var19 - var12.field11262, var12.field11158, var29, (byte) 85, var32, var31, var17, arg7, var30, var18 - var12.field11252, arg10);
                                if (var12.field11290 != null) {
                                    method1155(var19 - var12.field11262, var12.field11158, var29, (byte) 91, var32, var31, var17, arg7, var30, var18 - var12.field11252, var12.field11290);
                                }
                                class509 var48 = (class509) class104.field1375.method3693(false, (long) var12.field11158);
                                if (var48 != null) {
                                    class6.method42(var31, var19, var30, true, var17, var18, var32, var29, var48.field7472);
                                }
                                if (class690.field9655 == var12.field11219 && class236.field3418.method217()) {
                                    class236.field3418.method135();
                                }
                                class236.field3418.method208(arg2, arg8, arg4, arg5);
                            }
                            if (class106.field1387[var17] || class209.field3041 > 1) {
                                if (var12.field11291 == 3) {
                                    if (var22 == 0) {
                                        if (var12.field11127) {
                                            class236.field3418.method237(var18, var19, var12.field11295, var12.field11244, var12.field11192, 0);
                                        } else {
                                            class236.field3418.method212(var18, var19, var12.field11295, var12.field11244, var12.field11192, 0);
                                        }
                                    } else if (var12.field11127) {
                                        class236.field3418.method237(var18, var19, var12.field11295, var12.field11244, var12.field11192 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                    } else {
                                        class236.field3418.method212(var18, var19, var12.field11295, var12.field11244, 255 - (var22 & 0xFF) << 24 | var12.field11192 & 0xFFFFFF, 1);
                                    }
                                    if (class212.field3119) {
                                        if (arg7) {
                                            class232.method1925(var14, var13, var16, var15, (byte) -71);
                                        } else {
                                            class739.method5360(var14, var16, var15, var13, -1);
                                        }
                                    }
                                } else if (var12.field11291 == 4) {
                                    class216 var49 = var12.method5626(class236.field3418, 0);
                                    if (var49 != null) {
                                        int var50 = var12.field11192;
                                        String var51 = var12.field11222;
                                        if (var12.field11276 != -1) {
                                            class371 var52 = class153.field1955.method3237(var12.field11276, 0);
                                            var51 = var52.field5421;
                                            if (var51 == null) {
                                                var51 = field1658[1];
                                            }
                                            if ((var52.field5366 == 1 || var12.field11297 != 1) && var12.field11297 != -1) {
                                                var51 = field1658[38] + var51 + field1658[43] + class555.method4156((byte) 95, var12.field11297);
                                            }
                                        }
                                        if (var12.field11229 != -1) {
                                            var51 = class715.method5185(false, var12.field11229);
                                            if (var51 == null) {
                                                var51 = "";
                                            }
                                        }
                                        if (class500.field7302 == var12) {
                                            var51 = class537.field7861.method4068((byte) -94, class405.field5883);
                                            var50 = var12.field11192;
                                        }
                                        if (class269.field3818) {
                                            class236.field3418.method230(var18, var19, var12.field11295 + var18, var12.field11244 + var19);
                                        }
                                        var49.method1827(var12.field11244, null, var12.field11295, var51, var12.field11169 ? 255 - (var22 & 0xFF) << 24 : -1, 0, 0, class147.field1892, 255 - (var22 & 0xFF) << 24 | var50, var12.field11134, null, var18, var19, var12.field11128, var12.field11146, (byte) -29, var12.field11141);
                                        if (class269.field3818) {
                                            class236.field3418.method208(arg2, arg8, arg4, arg5);
                                        }
                                        if (var51.trim().length() > 0) {
                                            if (!class269.field3818) {
                                                class161 var53 = class768.method5545((byte) -126, class236.field3418, var12.field11139);
                                                int var54 = var53.method1358(var12.field11295, 123, var51, class147.field1892);
                                                int var55 = var53.method1359(class147.field1892, var12.field11295, (byte) 116, var51, var12.field11134);
                                                if (class212.field3119) {
                                                    if (arg7) {
                                                        class232.method1925(var19, var18, var19 + var55, var18 + var54, (byte) 119);
                                                    } else {
                                                        class739.method5360(var19, var19 + var55, var18 + var54, var18, -1);
                                                    }
                                                }
                                            } else if (class212.field3119) {
                                                if (arg7) {
                                                    class232.method1925(var14, var13, var16, var15, (byte) -84);
                                                } else {
                                                    class739.method5360(var14, var16, var15, var13, -1);
                                                }
                                            }
                                        }
                                    } else if (class722.field10283) {
                                        class97.method959(var12, -1);
                                    }
                                } else if (var12.field11291 == 5) {
                                    if (var12.field11272 >= 0) {
                                        var12.method5627(-409731664, class463.field6758, class671.field9451).method5570(class236.field3418, var19, var12.field11244, 0, 0, false, var12.field11120 << 3, 0, var18, var12.field11281 << 3, var12.field11295);
                                    } else {
                                        class392 var56;
                                        if (var12.field11276 != -1) {
                                            class471 var57 = var12.field11201 ? class203.field2988.field4901 : null;
                                            var56 = class153.field1955.method3238(var12.field11276, var12.field11297, var12.field11163 | 0xFF000000, 119, var12.field11143, var57, var12.field11261, class236.field3418);
                                        } else if (var12.field11229 == -1) {
                                            var56 = var12.method5629(-93, class236.field3418);
                                        } else {
                                            var56 = class727.method5293(-120, class236.field3418, var12.field11229);
                                        }
                                        if (var56 != null) {
                                            int var58 = var56.method1378();
                                            int var59 = var56.method1380();
                                            int var60 = (var12.field11192 == 0 ? 16777215 : var12.field11192 & 0xFFFFFF) | 255 - (var22 & 0xFF) << 24;
                                            if (var12.field11129) {
                                                class236.field3418.method230(var18, var19, var12.field11295 + var18, var12.field11244 + var19);
                                                if (var12.field11280 != 0) {
                                                    int var61 = (var58 + var12.field11295 - 1) / var58;
                                                    int var62 = (-(-var59 - var12.field11244) - 1) / var59;
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        for (int var64 = 0; var64 < var62; var64++) {
                                                            if (var12.field11192 == 0) {
                                                                var56.method3076((float) var58 / 2.0F + (float) (var18 + (var58 * var63)), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field11280);
                                                            } else {
                                                                var56.method3072((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field11280, 0, var60, 1);
                                                            }
                                                        }
                                                    }
                                                } else if (var12.field11192 == 0 && var22 == 0) {
                                                    var56.method3075(var18, var19, var12.field11295, var12.field11244);
                                                } else {
                                                    var56.method1382(var18, var19, var12.field11295, var12.field11244, 0, var60, 1);
                                                }
                                                class236.field3418.method208(arg2, arg8, arg4, arg5);
                                            } else if (var12.field11192 == 0 && var22 == 0) {
                                                if (var12.field11280 != 0) {
                                                    var56.method3076((float) var12.field11295 / 2.0F + (float) var18, (float) var12.field11244 / 2.0F + (float) var19, var12.field11295 * 4096 / var58, var12.field11280);
                                                } else if (var12.field11295 == var58 && var12.field11244 == var59) {
                                                    var56.method3074(var18, var19);
                                                } else {
                                                    var56.method3069(var18, var19, var12.field11295, var12.field11244);
                                                }
                                            } else if (var12.field11280 != 0) {
                                                var56.method3072((float) var12.field11295 / 2.0F + (float) var18, (float) var12.field11244 / 2.0F + (float) var19, var12.field11295 * 4096 / var58, var12.field11280, 0, var60, 1);
                                            } else if (var12.field11295 == var58 && var12.field11244 == var59) {
                                                var56.method874(var18, var19, 0, var60, 1);
                                            } else {
                                                var56.method3073(var18, var19, var12.field11295, var12.field11244, 0, var60, 1);
                                            }
                                        } else if (class722.field10283) {
                                            class97.method959(var12, -1);
                                        }
                                    }
                                    if (class212.field3119) {
                                        if (arg7) {
                                            class232.method1925(var14, var13, var16, var15, (byte) 99);
                                        } else {
                                            class739.method5360(var14, var16, var15, var13, -1);
                                        }
                                    }
                                } else if (var12.field11291 == 6) {
                                    class274.method2244(0);
                                    Object var65 = null;
                                    class761 var66 = null;
                                    int var67 = 0;
                                    if (var12.field11276 != -1) {
                                        class371 var71 = class153.field1955.method3237(var12.field11276, 0);
                                        if (var71 != null) {
                                            class371 var72 = var71.method2945(36, var12.field11297);
                                            var66 = var72.method2944(2048, 1, -26629, var12.field11201 ? class203.field2988.field4901 : null, class236.field3418, var12.field11183);
                                            if (var66 == null) {
                                                class97.method959(var12, -1);
                                            } else {
                                                var67 = -var66.method432() >> 1;
                                            }
                                        }
                                    } else if (var12.field11147 == 5) {
                                        int var68 = var12.field11213;
                                        if (var68 >= 0 && var68 < 2048) {
                                            class339 var69 = class748.field10666[var68];
                                            if (var69 != null && (class241.field3470 == var68 || class6.method39(var69.field4905, true) == var12.field11124)) {
                                                var66 = var69.field4901.method3626(class732.field10450, true, class189.field2507, null, class772.field10996, (byte) 125, 0, var12.field11183, class734.field10459, class321.field4379, class153.field1955, class10.field132, null, class236.field3418, 2048, null);
                                            }
                                        }
                                    } else if (var12.field11147 == 8 || var12.field11147 == 9) {
                                        class375 var70 = class279.method2276(false, 0, var12.field11213);
                                        if (var70 != null) {
                                            var66 = var70.method2970(var12.field11201 ? class203.field2988.field4901 : null, var12.field11124, var12.field11183, (byte) -80, 2048, var12.field11147 == 9, class236.field3418);
                                        }
                                    } else if (var12.field11183 != null && var12.field11183.method835(false)) {
                                        var66 = var12.method5639(2, class153.field1955, (class434) var65, class321.field4379, class732.field10450, var12.field11183, class203.field2988.field4901, class734.field10459, 2048, class772.field10996, class10.field132, class236.field3418);
                                        if (var66 == null && class722.field10283) {
                                            class97.method959(var12, -1);
                                        }
                                    } else {
                                        var66 = var12.method5639(2, class153.field1955, (class434) var65, class321.field4379, class732.field10450, null, class203.field2988.field4901, class734.field10459, 2048, class772.field10996, class10.field132, class236.field3418);
                                        if (var66 == null && class722.field10283) {
                                            class97.method959(var12, -1);
                                        }
                                    }
                                    if (var66 != null) {
                                        int var73;
                                        if (var12.field11165 <= 0) {
                                            var73 = 512;
                                        } else {
                                            var73 = (var12.field11295 << 9) / var12.field11165;
                                        }
                                        int var74;
                                        if (var12.field11257 <= 0) {
                                            var74 = 512;
                                        } else {
                                            var74 = (var12.field11244 << 9) / var12.field11257;
                                        }
                                        int var75 = var12.field11295 / 2 + var18;
                                        int var76 = var12.field11244 / 2 + var19;
                                        if (!var12.field11184) {
                                            var76 += var12.field11245 * var74 >> 9;
                                            var75 += var12.field11234 * var73 >> 9;
                                        }
                                        class151.field1925.method735();
                                        class236.field3418.method204(class151.field1925);
                                        class236.field3418.method233(var75, var76, var73, var74);
                                        class236.field3418.method225();
                                        if (var12.field11202) {
                                            class236.field3418.method119(false);
                                        }
                                        if (var12.field11184) {
                                            class572.field8293.method742(var12.field11181);
                                            class572.field8293.method736(var12.field11266);
                                            class572.field8293.method724(var12.field11239);
                                            class572.field8293.method721(var12.field11234, var12.field11245, var12.field11267);
                                        } else {
                                            int var77 = (var12.field11203 << 2) * class487.field7151[var12.field11181 << 3] >> 14;
                                            int var78 = (var12.field11203 << 2) * class487.field7150[var12.field11181 << 3] >> 14;
                                            class572.field8293.method729(-var12.field11239 << 3);
                                            class572.field8293.method736(var12.field11266 << 3);
                                            class572.field8293.method721(var12.field11236 << 2, var77 - (-(var12.field11199 << 2) - var67), (var12.field11199 << 2) + var78);
                                            class572.field8293.method741(var12.field11181 << 3);
                                        }
                                        var12.method5631(2, class236.field3418, class572.field8293, class694.field9700, var66);
                                        if (class269.field3818) {
                                            class236.field3418.method230(var18, var19, var18 + var12.field11295, var12.field11244 + var19);
                                        }
                                        if (var12.field11184) {
                                            if (var12.field11265) {
                                                var66.method427(class572.field8293, null, var12.field11203, 1);
                                            } else {
                                                var66.method415(class572.field8293, null, 1);
                                                if (var12.field11204 != null) {
                                                    class236.field3418.method126(var12.field11204.method3577());
                                                }
                                            }
                                        } else if (var12.field11265) {
                                            var66.method427(class572.field8293, null, var12.field11203 << 2, 1);
                                        } else {
                                            var66.method415(class572.field8293, null, 1);
                                            if (var12.field11204 != null) {
                                                class236.field3418.method126(var12.field11204.method3577());
                                            }
                                        }
                                        if (class269.field3818) {
                                            class236.field3418.method208(arg2, arg8, arg4, arg5);
                                        }
                                        if (var12.field11202) {
                                            class236.field3418.method119(true);
                                        }
                                    }
                                    if (class212.field3119) {
                                        if (arg7) {
                                            class232.method1925(var14, var13, var16, var15, (byte) 80);
                                        } else {
                                            class739.method5360(var14, var16, var15, var13, -1);
                                        }
                                    }
                                } else if (var12.field11291 == 9) {
                                    int var79;
                                    int var80;
                                    int var81;
                                    int var82;
                                    if (var12.field11241) {
                                        var79 = var18;
                                        var80 = var12.field11295 + var18;
                                        var81 = var19;
                                        var82 = var19 + var12.field11244;
                                    } else {
                                        var82 = var19;
                                        var81 = var19 + var12.field11244;
                                        var80 = var12.field11295 + var18;
                                        var79 = var18;
                                    }
                                    if (var12.field11277 == 1) {
                                        class236.field3418.method219(var79, var82, var80, var81, var12.field11192, 0);
                                    } else {
                                        class236.field3418.method178(var79, var82, var80, var81, var12.field11192, var12.field11277, 0);
                                    }
                                    if (class212.field3119) {
                                        if (arg7) {
                                            class232.method1925(var14, var13, var16, var15, (byte) 94);
                                        } else {
                                            class739.method5360(var14, var16, var15, var13, -1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (arg3 <= 22) {
                method1155(-39, -14, -119, (byte) 113, 123, 121, 40, true, 6, -9, null);
            }
        } catch (RuntimeException var84) {
            throw class665.method4799(var84, field1658[42] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field1658[1] : field1658[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLlga;)V", line = 874)
    public static final void method1156(byte arg0, class47 arg1) {
        try {
            class398.field5791 = arg1.method502(field1658[19], (byte) -126);
            field1645++;
            class425.field6134 = arg1.method502(field1658[29], (byte) -116);
            class742.field10550 = arg1.method502(field1658[21], (byte) -125);
            class153.field1964 = arg1.method502(field1658[30], (byte) -115);
            class126.field1579 = arg1.method502(field1658[31], (byte) -119);
            if (arg0 < -109) {
                class538.field7901 = arg1.method502(field1658[17], (byte) -103);
                class239.field3456 = arg1.method502(field1658[26], (byte) -125);
                class47.field699 = arg1.method502(field1658[16], (byte) -100);
                class322.field4388 = arg1.method502(field1658[25], (byte) -118);
                class725.field10310 = arg1.method502(field1658[28], (byte) -91);
                class396.field5747 = arg1.method502(field1658[22], (byte) -105);
                class533.field7712 = arg1.method502(field1658[24], (byte) -113);
                class429.field6219 = arg1.method502(field1658[20], (byte) -104);
                class202.field2979 = arg1.method502(field1658[18], (byte) -108);
                class354.field5133 = arg1.method502(field1658[23], (byte) -96);
                class635.field9009 = arg1.method502(field1658[15], (byte) -119);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1658[27] + arg0 + ',' + (arg1 == null ? field1658[1] : field1658[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIII)V", line = 911)
    public final void method1157(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        try {
            field1641++;
            try {
                if (((long) arg3 + this.field1649) > this.field1642) {
                    this.field1642 = (long) arg3 + this.field1649;
                }
                if ((long) arg1 != this.field1653 && (this.field1649 < this.field1653 || this.field1649 > (this.field1653 + ((long) this.field1657)))) {
                    this.method1160((byte) 73);
                }
                if (this.field1653 != -1L && (long) arg3 + this.field1649 > (long) this.field1646.length + this.field1653) {
                    int var5 = (int) (this.field1653 + (long) this.field1646.length - this.field1649);
                    class569.method4247(arg0, arg2, this.field1646, (int) (this.field1649 - this.field1653), var5);
                    arg3 -= var5;
                    arg2 += var5;
                    this.field1649 += var5;
                    this.field1657 = this.field1646.length;
                    this.method1160((byte) 110);
                }
                if (arg3 > this.field1646.length) {
                    if (this.field1655 != this.field1649) {
                        this.field1639.method751((byte) -120, this.field1649);
                        this.field1655 = this.field1649;
                    }
                    this.field1639.method752(arg3, arg0, arg2, 0);
                    this.field1655 += arg3;
                    if (this.field1655 > this.field1640) {
                        this.field1640 = this.field1655;
                    }
                    long var6 = -1L;
                    long var8 = -1L;
                    if (this.field1649 >= this.field1648 && this.field1649 < (long) this.field1647 + this.field1648) {
                        var6 = this.field1649;
                    } else if (this.field1649 <= this.field1648 && this.field1648 < ((long) arg3 + this.field1649)) {
                        var6 = this.field1648;
                    }
                    if (this.field1648 < (this.field1649 + ((long) arg3)) && (long) this.field1647 + this.field1648 >= this.field1649 - -((long) arg3)) {
                        var8 = (long) arg3 + this.field1649;
                    } else if (this.field1649 < (this.field1648 + ((long) this.field1647)) && (long) this.field1647 + this.field1648 <= (long) arg3 + this.field1649) {
                        var8 = (long) this.field1647 + this.field1648;
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class569.method4247(arg0, (int) ((long) arg2 + var6 - this.field1649), this.field1652, (int) (var6 - this.field1648), var10);
                    }
                    this.field1649 += arg3;
                } else if (arg3 > 0) {
                    if (this.field1653 == -1L) {
                        this.field1653 = this.field1649;
                    }
                    class569.method4247(arg0, arg2, this.field1646, (int) (this.field1649 - this.field1653), arg3);
                    this.field1649 += arg3;
                    if ((this.field1649 - this.field1653) > ((long) this.field1657)) {
                        this.field1657 = (int) (this.field1649 - this.field1653);
                    }
                }
            } catch (IOException var13) {
                this.field1655 = -1L;
                throw var13;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field1658[0] + (arg0 == null ? field1658[1] : field1658[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BB)V", line = 1032)
    public final void method1158(byte[] arg0, byte arg1) throws IOException {
        try {
            this.method1162(12858, arg0.length, arg0, 0);
            field1637++;
            if (arg1 > -95) {
                this.field1640 = 84L;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1658[5] + (arg0 == null ? field1658[1] : field1658[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 1044)
    public final void method1159(int arg0) throws IOException {
        try {
            this.method1160((byte) 104);
            field1634++;
            this.field1639.method757(arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1658[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 1053)
    private final void method1160(byte arg0) throws IOException {
        try {
            if (this.field1653 != -1L) {
                if (this.field1655 != this.field1653) {
                    this.field1639.method751((byte) -109, this.field1653);
                    this.field1655 = this.field1653;
                }
                this.field1639.method752(this.field1657, this.field1646, 0, 0);
                this.field1655 += this.field1657;
                if (this.field1655 > this.field1640) {
                    this.field1640 = this.field1655;
                }
                long var2 = -1L;
                if (this.field1648 <= this.field1653 && (long) this.field1647 + this.field1648 > this.field1653) {
                    var2 = this.field1653;
                } else if (this.field1653 <= this.field1648 && (long) this.field1657 + this.field1653 > this.field1648) {
                    var2 = this.field1648;
                }
                long var4 = -1L;
                if (this.field1648 < ((long) this.field1657 + this.field1653) && (long) this.field1657 + this.field1653 <= (long) this.field1647 + this.field1648) {
                    var4 = this.field1653 + ((long) this.field1657);
                } else if ((long) this.field1647 + this.field1648 > this.field1653 && (long) this.field1657 + this.field1653 >= (long) this.field1647 + this.field1648) {
                    var4 = this.field1648 + ((long) this.field1647);
                }
                if (var2 > -1L && var2 < var4) {
                    int var6 = (int) (var4 - var2);
                    class569.method4247(this.field1646, (int) (var2 - this.field1653), this.field1652, (int) (var2 - this.field1648), var6);
                }
                this.field1653 = -1L;
                this.field1657 = 0;
            }
            field1650++;
            if (arg0 < 50) {
                this.field1657 = 68;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field1658[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)Ljava/io/File;", line = 1132)
    private final File method1161(int arg0) {
        try {
            field1638++;
            if (arg0 != -1) {
                this.field1649 = 57L;
            }
            return this.field1639.method755((byte) -103);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1658[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[BI)V", line = 1145)
    public final void method1162(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        try {
            field1635++;
            try {
                if (arg1 + arg3 > arg2.length) {
                    throw new ArrayIndexOutOfBoundsException(arg3 + arg1 - arg2.length);
                }
                if (arg0 != 12858) {
                    this.method1161(47);
                }
                if (this.field1653 != -1L && this.field1653 <= this.field1649 && (this.field1653 + ((long) this.field1657)) >= ((long) arg1 + this.field1649)) {
                    class569.method4247(this.field1646, (int) (this.field1649 - this.field1653), arg2, arg3, arg1);
                    this.field1649 += arg1;
                    return;
                }
                long var5 = this.field1649;
                int var7 = arg3;
                int var8 = arg1;
                if (this.field1648 <= this.field1649 && this.field1649 < (this.field1648 + ((long) this.field1647))) {
                    int var9 = (int) ((long) this.field1647 - (this.field1649 - this.field1648));
                    if (var9 > arg1) {
                        var9 = arg1;
                    }
                    class569.method4247(this.field1652, (int) (this.field1649 - this.field1648), arg2, arg3, var9);
                    arg3 += var9;
                    this.field1649 += var9;
                    arg1 -= var9;
                }
                if (this.field1652.length < arg1) {
                    this.field1639.method751((byte) -66, this.field1649);
                    this.field1655 = this.field1649;
                    while (arg1 > 0) {
                        int var11 = this.field1639.method759(arg1, arg2, arg3, (byte) 118);
                        if (var11 == -1) {
                            break;
                        }
                        this.field1649 += var11;
                        arg1 -= var11;
                        arg3 += var11;
                        this.field1655 += var11;
                    }
                } else if (arg1 > 0) {
                    this.method1163(arg0 - 12857);
                    int var10 = arg1;
                    if (this.field1647 < arg1) {
                        var10 = this.field1647;
                    }
                    class569.method4247(this.field1652, 0, arg2, arg3, var10);
                    arg1 -= var10;
                    this.field1649 += var10;
                    arg3 += var10;
                }
                if (this.field1653 != -1L) {
                    if (this.field1653 > this.field1649 && arg1 > 0) {
                        int var12 = (int) (this.field1653 - this.field1649) + arg3;
                        if (var12 > (arg1 + arg3)) {
                            var12 = arg1 + arg3;
                        }
                        while (var12 > arg3) {
                            arg1--;
                            arg2[arg3++] = 0;
                            this.field1649++;
                        }
                    }
                    long var13 = -1L;
                    long var15 = -1L;
                    if (var5 <= this.field1653 && (long) var8 + var5 > this.field1653) {
                        var13 = this.field1653;
                    } else if (this.field1653 <= var5 && var5 < (long) this.field1657 + this.field1653) {
                        var13 = var5;
                    }
                    if (var5 < ((long) this.field1657 + this.field1653) && (long) this.field1657 + this.field1653 <= (long) var8 + var5) {
                        var15 = (long) this.field1657 + this.field1653;
                    } else if (this.field1653 < ((long) var8 + var5) && (var5 + ((long) var8)) <= ((long) this.field1657 + this.field1653)) {
                        var15 = (long) var8 + var5;
                    }
                    if (var13 > -1L && var13 < var15) {
                        int var17 = (int) (var15 - var13);
                        class569.method4247(this.field1646, (int) (var13 - this.field1653), arg2, (int) (var13 - var5) + var7, var17);
                        if (this.field1649 < var15) {
                            arg1 = (int) ((long) arg1 - (var15 - this.field1649));
                            this.field1649 = var15;
                        }
                    }
                }
            } catch (IOException var20) {
                this.field1655 = -1L;
                throw var20;
            }
            if (arg1 > 0) {
                throw new EOFException();
            }
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field1658[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1658[1] : field1658[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 1326)
    private final void method1163(int arg0) throws IOException {
        try {
            if (arg0 != 1) {
                method1155(76, -57, 109, (byte) -34, -12, -29, -113, true, 67, -63, null);
            }
            field1644++;
            this.field1647 = 0;
            if (this.field1655 != this.field1649) {
                this.field1639.method751((byte) -78, this.field1649);
                this.field1655 = this.field1649;
            }
            this.field1648 = this.field1649;
            while (this.field1652.length > this.field1647) {
                int var2 = this.field1652.length - this.field1647;
                if (var2 > 200000000) {
                    var2 = 200000000;
                }
                int var3 = this.field1639.method759(var2, this.field1652, this.field1647, (byte) 120);
                if (var3 == -1) {
                    break;
                }
                this.field1647 += var3;
                this.field1655 += var3;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1658[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lrv;II)V", line = 1427)
    public class133(class72 arg0, int arg1, int arg2) throws IOException {
        try {
            this.field1639 = arg0;
            this.field1642 = this.field1640 = arg0.method750(0);
            this.field1652 = new byte[arg1];
            this.field1646 = new byte[arg2];
            this.field1649 = 0L;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1658[8] + (arg0 == null ? field1658[1] : field1658[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)J", line = 1374)
    public final long method1164(int arg0) {
        try {
            if (arg0 != 12191) {
                this.field1655 = 32L;
            }
            field1656++;
            return this.field1642;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1658[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(CI)Z", line = 1390)
    public static final boolean method1165(char arg0, int arg1) {
        try {
            if (arg1 != 2) {
                method1165((char) 65511, -6);
            }
            field1654++;
            return arg0 >= '0' && arg0 <= '9';
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1658[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(JI)V", line = 1407)
    public final void method1166(long arg0, int arg1) throws IOException {
        try {
            field1636++;
            if ((long) arg1 > arg0) {
                throw new IOException(field1658[11] + arg0 + field1658[10] + this.method1161(~arg1));
            }
            this.field1649 = arg0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1658[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1167(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1168(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
