import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class224 extends class115 {

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    private int field3056 = 4096;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    private int field3062 = 0;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3060 = "Allocated memory";

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "Lep;")
    public static class241 field3057;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "[[Ljf;")
    public static class119[][] field3054;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)I", line = 4)
    public static final int method1451(int arg0) {
        ++field3061;
        if (arg0 != 14551) {
            method1453((byte) 52);
        }
        if (!class81.field903 && class433.field6324 > 0) {
            return class406.field5900 && class256.field3447[81] && ~class433.field6324 < -3 ? ((class159) class32.field301.field2358.field5247.field5247).field2256 : ((class159) class32.field301.field2358.field5247).field2256;
        } else {
            int var1 = class57.field654;
            int var2 = class48.field562;
            int var3 = class162.field2286;
            int var4 = class428.field6219;
            int var5 = class119.field1595;
            if (~var1 < ~var3 && ~(var3 - -var5) < ~var1) {
                int var6 = -1;
                for (int var7 = 0; class433.field6324 > var7; ++var7) {
                    if (!class94.field1041) {
                        int var11 = (-var7 + -1 + class433.field6324) * 16 + 31 + var4;
                        if (~var2 < ~(var11 + -13) && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class433.field6324 - var7 + -1) * 16 + var4 + 33;
                        if (~var2 < ~(var12 - 13) && ~(var12 + 3) <= ~var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class108 var9 = new class108(class32.field301);
                    for (class159 var10 = (class159) var9.method602((byte) 113); var10 != null; var10 = (class159) var9.method599(-40)) {
                        if (~var6 == ~(var8++)) {
                            return var10.field2256;
                        }
                    }
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLbk;I)V", line = 91)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field3056 = arg1.method1355(32136);
            }
        } else {
            this.field3062 = arg1.method1355(32136);
        }
        if (arg0 < 83) {
            this.field3056 = -48;
        }
        ++field3058;
    }

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)Z", line = 128)
    public static final boolean method1452(int arg0) throws IOException {
        ++field3063;
        if (class330.field4719 == null) {
            return false;
        } else {
            int var1 = class330.field4719.method1508((byte) 62);
            if (~var1 == -1) {
                return false;
            } else {
                if (class367.field5358 == -1) {
                    class330.field4719.method1502(class249.field3379.field2867, -1, 1, 0);
                    class249.field3379.field2888 = 0;
                    class367.field5358 = class249.field3379.method816(-67);
                    --var1;
                    class290.field4131 = class231.field3129[class367.field5358];
                }
                if (class290.field4131 == -1) {
                    if (~var1 >= -1) {
                        return false;
                    }
                    class330.field4719.method1502(class249.field3379.field2867, arg0 + -8250, 1, 0);
                    --var1;
                    class290.field4131 = 255 & class249.field3379.field2867[0];
                }
                if (class290.field4131 == -2) {
                    if (~var1 >= -2) {
                        return false;
                    }
                    class330.field4719.method1502(class249.field3379.field2867, -1, 2, 0);
                    class249.field3379.field2888 = 0;
                    var1 -= 2;
                    class290.field4131 = class249.field3379.method1355(arg0 ^ 23985);
                }
                if (~class290.field4131 < ~var1) {
                    return false;
                } else {
                    class249.field3379.field2888 = 0;
                    class330.field4719.method1502(class249.field3379.field2867, -1, class290.field4131, 0);
                    class334.field4915 = class148.field2070;
                    class158.field2236 = 0;
                    class148.field2070 = class169.field2357;
                    class169.field2357 = class367.field5358;
                    if (~class367.field5358 == -68) {
                        int var2 = class249.field3379.method1377(29247);
                        int var3 = class249.field3379.method1385(-117);
                        int var4 = class249.field3379.method1342((byte) -128);
                        if (class376.method2367(-82, var3)) {
                            if (~var4 == -3) {
                                class307.method1923(-101);
                            }
                            class424.field6086 = var2;
                            class2.method17((byte) -10, var2);
                            class151.method902(true, false);
                            class387.method2472(class424.field6086);
                            for (int var5 = 0; ~var5 > -101; ++var5) {
                                class266.field3723[var5] = true;
                            }
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (class367.field5358 == 104) {
                        int var6 = class249.field3379.method1338(-29060);
                        int var7 = class249.field3379.method1355(32136);
                        int var8 = class249.field3379.method1385(arg0 + -8374);
                        int var9 = class249.field3379.method1349(124);
                        if (class376.method2367(-81, var9)) {
                            class430.method2676((var8 << 16) + var7, (byte) 20, var6);
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (~class367.field5358 == -59) {
                        int var10 = class249.field3379.method1349(arg0 + -8146);
                        if (var10 == 65535) {
                            var10 = -1;
                        }
                        int var11 = class249.field3379.method1356((byte) -104);
                        class159.method1043(-1, var10, var11);
                        class367.field5358 = -1;
                        return true;
                    } else if (class367.field5358 == 192) {
                        int var12 = class249.field3379.method1377(arg0 + 20998);
                        if (~var12 == -65536) {
                            var12 = -1;
                        }
                        int var13 = class249.field3379.method1353(85);
                        int var14 = class249.field3379.method1395(113);
                        class2.method12(var12, -20298, var13, var14);
                        class367.field5358 = -1;
                        return true;
                    } else if (~class367.field5358 == -92) {
                        class6.method60((byte) -122);
                        class367.field5358 = -1;
                        return false;
                    } else if (~class367.field5358 == -227) {
                        class396.method2521(-1);
                        class367.field5358 = -1;
                        return true;
                    } else if (class367.field5358 == 92) {
                        int var15 = class249.field3379.method1356((byte) -45);
                        int var16 = class249.field3379.method1382(-28295);
                        int var17 = class249.field3379.method1395(-84);
                        class410.field5931 = var16 >> 1;
                        class390.field5715.method794((byte) -11, var15, (1 & var16) == 1, var17, class410.field5931);
                        class367.field5358 = -1;
                        return true;
                    } else if (~class367.field5358 == -246) {
                        int var18 = class249.field3379.method1336((byte) -100);
                        int var19 = class249.field3379.method1355(arg0 ^ 23985);
                        if (~var18 > 69999) {
                            var19 += 32768;
                        }
                        class119 var20;
                        if (~var18 <= -1) {
                            var20 = class179.method1170(var18, arg0 ^ 818049481);
                        } else {
                            var20 = null;
                        }
                        while (class290.field4131 > class249.field3379.field2888) {
                            int var21 = class249.field3379.method1376(128);
                            int var22 = class249.field3379.method1355(32136);
                            int var23 = 0;
                            if (var22 != 0) {
                                var23 = class249.field3379.method1342((byte) -128);
                                if (~var23 == -256) {
                                    var23 = class249.field3379.method1336((byte) -35);
                                }
                            }
                            if (var20 != null && var21 >= 0 && ~var21 > ~var20.field1580.length) {
                                var20.field1580[var21] = var22;
                                var20.field1592[var21] = var23;
                            }
                            class111.method615(var22 + -1, var23, var21, (byte) 3, var19);
                        }
                        if (var20 != null) {
                            class101.method543((byte) -90, var20);
                        }
                        class238.method1521((byte) -106);
                        class281.field3954[class40.method253(class123.field1642++, 31)] = class40.method253(var19, 32767);
                        class367.field5358 = -1;
                        return true;
                    } else if (~class367.field5358 == -36) {
                        class59.field709 = class418.field6013;
                        if (~class290.field4131 == -1) {
                            class54.field607 = 0;
                            class354.field5164 = null;
                            class402.field5871 = null;
                            class367.field5358 = -1;
                            class166.field2323 = null;
                            return true;
                        } else {
                            class402.field5871 = class249.field3379.method1350(94);
                            boolean var24 = class249.field3379.method1342((byte) -126) == 1;
                            if (var24) {
                                class249.field3379.method1350(64);
                            }
                            long var25 = class249.field3379.method1394(true);
                            class354.field5164 = class335.method2160(var25, arg0 + -8151);
                            class407.field5906 = class249.field3379.method1373((byte) 30);
                            int var27 = class249.field3379.method1342((byte) -126);
                            if (var27 == 255) {
                                class367.field5358 = -1;
                                return true;
                            } else {
                                class54.field607 = var27;
                                class344[] var28 = new class344[100];
                                for (int var29 = 0; ~class54.field607 < ~var29; ++var29) {
                                    var28[var29] = new class344();
                                    var28[var29].field5055 = class249.field3379.method1350(84);
                                    boolean var35 = class249.field3379.method1342((byte) -126) == 1;
                                    if (var35) {
                                        var28[var29].field5054 = class249.field3379.method1350(arg0 + -8153);
                                    } else {
                                        var28[var29].field5054 = var28[var29].field5055;
                                    }
                                    var28[var29].field5059 = class249.field3379.method1355(arg0 ^ 23985);
                                    var28[var29].field5056 = class249.field3379.method1373((byte) 30);
                                    var28[var29].field5058 = class249.field3379.method1350(85);
                                    if (var28[var29].field5054.equals(class390.field5715.field1847)) {
                                        class341.field5023 = var28[var29].field5056;
                                    }
                                }
                                boolean var30 = false;
                                int var31 = class54.field607;
                                while (~var31 < -1) {
                                    boolean var32 = true;
                                    --var31;
                                    for (int var33 = 0; ~var31 < ~var33; ++var33) {
                                        if (var28[var33].field5055.compareTo(var28[var33 + 1].field5055) > 0) {
                                            class344 var34 = var28[var33];
                                            var28[var33] = var28[var33 + 1];
                                            var28[var33 + 1] = var34;
                                            var32 = false;
                                        }
                                    }
                                    if (var32) {
                                        break;
                                    }
                                }
                                class367.field5358 = -1;
                                class166.field2323 = var28;
                                return true;
                            }
                        }
                    } else if (~class367.field5358 == -161) {
                        int var36 = class249.field3379.method1377(29247);
                        if (var36 == 65535) {
                            var36 = -1;
                        }
                        int var37 = class249.field3379.method1342((byte) -126);
                        int var38 = class249.field3379.method1382(-28295);
                        String var39 = class249.field3379.method1350(arg0 ^ 8201);
                        if (var38 >= 1 && var38 <= 8) {
                            if (var39.equalsIgnoreCase("null")) {
                                var39 = null;
                            }
                            class189.field2574[var38 + -1] = var39;
                            class97.field1091[var38 + -1] = var36;
                            class213.field2918[var38 + -1] = var37 == 0;
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (~class367.field5358 == -88) {
                        boolean var40 = class249.field3379.method1342((byte) -126) == 1;
                        String var41 = class249.field3379.method1350(63);
                        String var42 = class249.field3379.method1350(108);
                        int var43 = class249.field3379.method1355(32136);
                        int var44 = class249.field3379.method1342((byte) -126);
                        String var45 = "";
                        boolean var46 = false;
                        if (var43 > 0) {
                            var45 = class249.field3379.method1350(58);
                            var46 = class249.field3379.method1342((byte) -127) == 1;
                        }
                        for (int var47 = 0; ~var47 > ~class100.field1124; ++var47) {
                            if (!var40) {
                                if (var41.equals(class302.field4300[var47])) {
                                    if (~class315.field4490[var47] != ~var43) {
                                        class315.field4490[var47] = var43;
                                        if (~var43 < -1) {
                                            class386.method2466(0, -1, "", 5, var41 + class8.field103, "");
                                        }
                                        if (~var43 == -1) {
                                            class386.method2466(0, -1, "", 5, var41 + class418.field6014, "");
                                        }
                                    }
                                    class96.field1076[var47] = var42;
                                    class111.field1283[var47] = var45;
                                    class3.field42[var47] = var44;
                                    var41 = null;
                                    class434.field6367[var47] = var46;
                                    break;
                                }
                            } else if (var42.equals(class302.field4300[var47])) {
                                class302.field4300[var47] = var41;
                                class96.field1076[var47] = var42;
                                var41 = null;
                                break;
                            }
                        }
                        if (var41 != null && class100.field1124 < 200) {
                            class302.field4300[class100.field1124] = var41;
                            class96.field1076[class100.field1124] = var42;
                            class315.field4490[class100.field1124] = var43;
                            class111.field1283[class100.field1124] = var45;
                            class3.field42[class100.field1124] = var44;
                            class434.field6367[class100.field1124] = var46;
                            ++class100.field1124;
                        }
                        class367.field5362 = class418.field6013;
                        boolean var48 = false;
                        int var49 = class100.field1124;
                        while (~var49 < -1) {
                            boolean var50 = true;
                            --var49;
                            for (int var51 = 0; ~var51 > ~var49; ++var51) {
                                if (class315.field4490[var51] != class23.field229 && class315.field4490[var51 - -1] == class23.field229 || ~class315.field4490[var51] == -1 && class315.field4490[var51 + 1] != 0) {
                                    int var52 = class315.field4490[var51];
                                    class315.field4490[var51] = class315.field4490[var51 + 1];
                                    class315.field4490[var51 + 1] = var52;
                                    String var53 = class111.field1283[var51];
                                    class111.field1283[var51] = class111.field1283[var51 - -1];
                                    class111.field1283[var51 - -1] = var53;
                                    String var54 = class302.field4300[var51];
                                    class302.field4300[var51] = class302.field4300[var51 + 1];
                                    class302.field4300[var51 + 1] = var54;
                                    String var55 = class96.field1076[var51];
                                    class96.field1076[var51] = class96.field1076[var51 + 1];
                                    class96.field1076[var51 + 1] = var55;
                                    int var56 = class3.field42[var51];
                                    class3.field42[var51] = class3.field42[var51 - -1];
                                    class3.field42[var51 + 1] = var56;
                                    boolean var57 = class434.field6367[var51];
                                    class434.field6367[var51] = class434.field6367[var51 - -1];
                                    class434.field6367[var51 + 1] = var57;
                                    var50 = false;
                                }
                            }
                            if (var50) {
                                break;
                            }
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (~class367.field5358 == -149) {
                        boolean var58 = ~class249.field3379.method1342((byte) -126) == -2;
                        String var59 = class249.field3379.method1350(105);
                        String var60 = var59;
                        if (var58) {
                            var60 = class249.field3379.method1350(78);
                        }
                        long var61 = class249.field3379.method1394(true);
                        long var63 = (long) class249.field3379.method1355(32136);
                        long var65 = (long) class249.field3379.method1353(75);
                        int var67 = class249.field3379.method1342((byte) -126);
                        int var68 = class249.field3379.method1355(32136);
                        long var69 = (var63 << 32) + var65;
                        boolean var71 = false;
                        int var72 = 0;
                        while (true) {
                            if (~var72 <= -101) {
                                if (~var67 >= -2 && class117.method656(var60, false)) {
                                    var71 = true;
                                }
                                break;
                            }
                            if (~class39.field415[var72] == ~var69) {
                                var71 = true;
                                break;
                            }
                            ++var72;
                        }
                        if (!var71 && class307.field4396 == 0) {
                            class39.field415[class118.field1404] = var69;
                            class118.field1404 = (class118.field1404 + 1) % 100;
                            String var73 = class419.method2603(var68, true).method1821((byte) -51, class249.field3379);
                            if (var67 == 2) {
                                class348.method2213("<img=1>" + var60, var73, "<img=1>" + var59, var68, class362.method2305(arg0 ^ 8249, var61), 123, 20, 0);
                            } else if (var67 == 1) {
                                class348.method2213("<img=0>" + var60, var73, "<img=0>" + var59, var68, class362.method2305(0, var61), arg0 + -8123, 20, 0);
                            } else {
                                class348.method2213(var60, var73, var59, var68, class362.method2305(arg0 + -8249, var61), 123, 20, 0);
                            }
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (class367.field5358 == 36) {
                        String var74 = class249.field3379.method1350(arg0 ^ 8199);
                        int var75 = class249.field3379.method1385(-98);
                        int var76 = class249.field3379.method1338(-29060);
                        if (class376.method2367(arg0 + -8172, var75)) {
                            class173.method1145(var76, var74, arg0 + 18392);
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (~class367.field5358 == -31) {
                        int var77 = class249.field3379.method1393(-1);
                        int var78 = class249.field3379.method1377(arg0 ^ 20998);
                        if (~var78 == -65536) {
                            var78 = -1;
                        }
                        int var79 = class249.field3379.method1385(arg0 ^ -8261);
                        if (class376.method2367(arg0 ^ -8315, var79)) {
                            class221.method1442(17133, var78, -1, var77, 1);
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (class367.field5358 == 101) {
                        int var80 = class249.field3379.method1355(32136);
                        if (class376.method2367(-67, var80)) {
                            class448.method2783(true);
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (~class367.field5358 == -67) {
                        int var81 = class249.field3379.method1385(-110);
                        int var82 = class249.field3379.method1355(32136);
                        int var83 = class249.field3379.method1363(arg0 + -8135);
                        if (class376.method2367(arg0 + -8321, var82)) {
                            class272.method1726(1664, var81, var83);
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (class367.field5358 == 71) {
                        int var84 = class249.field3379.method1355(arg0 ^ 23985);
                        int var85 = class249.field3379.method1342((byte) -127);
                        int var86 = class249.field3379.method1342((byte) -127);
                        int var87 = class249.field3379.method1342((byte) -127);
                        int var88 = class249.field3379.method1342((byte) -128);
                        int var89 = class249.field3379.method1355(arg0 ^ 23985);
                        if (class376.method2367(-59, var84)) {
                            class8.field105[var85] = true;
                            class288.field4077[var85] = var86;
                            class174.field2421[var85] = var87;
                            class206.field2811[var85] = var88;
                            class435.field6377[var85] = var89;
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (~class367.field5358 == -228) {
                        int var90 = class249.field3379.method1338(-29060);
                        int var91 = class249.field3379.method1349(arg0 + -8128);
                        class252.method1577(var91, var90, 118);
                        class367.field5358 = -1;
                        return true;
                    } else if (class367.field5358 == 254) {
                        int var92 = class249.field3379.method1385(-115);
                        if (~var92 == -65536) {
                            var92 = -1;
                        }
                        int var93 = class249.field3379.method1355(32136);
                        int var94 = class249.field3379.method1355(32136);
                        if (var94 == 65535) {
                            var94 = -1;
                        }
                        int var95 = class249.field3379.method1338(-29060);
                        int var96 = class249.field3379.method1355(32136);
                        if (class376.method2367(47, var96)) {
                            for (int var97 = var92; var97 <= var94; ++var97) {
                                long var98 = ((long) var95 << 32) - -((long) var97);
                                class3 var100 = (class3) class302.field4309.method1204((byte) -125, var98);
                                class3 var101;
                                if (var100 != null) {
                                    var101 = new class3(var100.field39, var93);
                                    var100.method2290((byte) 98);
                                } else if (~var97 == 0) {
                                    var101 = new class3(class179.method1170(var95, arg0 + 818033079).field1443.field39, var93);
                                } else {
                                    var101 = new class3(0, var93);
                                }
                                class302.field4309.method1202(-1, var98, var101);
                            }
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (class367.field5358 == 96) {
                        int var102 = class249.field3379.method1338(-29060);
                        int var103 = class249.field3379.method1349(-104);
                        int var104 = class249.field3379.method1338(-29060);
                        if (class376.method2367(113, var103)) {
                            class201 var105 = (class201) class396.field5783.method1204((byte) -68, (long) var104);
                            class201 var106 = (class201) class396.field5783.method1204((byte) -107, (long) var102);
                            if (var106 != null) {
                                class164.method1057(var105 == null || var105.field2776 != var106.field2776, var106, arg0 ^ 8249, false);
                            }
                            if (var105 != null) {
                                var105.method2290((byte) 98);
                                class396.field5783.method1202(-1, (long) var102, var105);
                            }
                            class119 var107 = class179.method1170(var104, arg0 ^ 818049481);
                            if (var107 != null) {
                                class101.method543((byte) -102, var107);
                            }
                            class119 var108 = class179.method1170(var102, 818041328);
                            if (var108 != null) {
                                class101.method543((byte) -69, var108);
                                class433.method2686(true, var108, arg0 + -8249);
                            }
                            if (~class424.field6086 != 0) {
                                class237.method1513(1, class424.field6086, 65079);
                            }
                        }
                        class367.field5358 = -1;
                        return true;
                    } else if (class367.field5358 != 99 && ~class367.field5358 != -117 && class367.field5358 != 78 && ~class367.field5358 != -245 && class367.field5358 != 133 && class367.field5358 != 44 && class367.field5358 != 232 && ~class367.field5358 != -25 && ~class367.field5358 != -184 && ~class367.field5358 != -196 && class367.field5358 != 13 && ~class367.field5358 != -205 && ~class367.field5358 != -142 && ~class367.field5358 != -150 && class367.field5358 != 42) {
                        if (arg0 != 8249) {
                            field3057 = null;
                        }
                        if (class367.field5358 == 145) {
                            int var109 = class249.field3379.method1338(arg0 + -37309);
                            int var110 = class249.field3379.method1349(102);
                            class337.method2173(var110, var109, (byte) 2);
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -135) {
                            int var111 = class249.field3379.method1342((byte) -127);
                            if (class249.field3379.method1342((byte) -126) != 0) {
                                --class249.field3379.field2888;
                                class207.field2816[var111] = new class343(class249.field3379);
                            } else {
                                class207.field2816[var111] = new class343();
                            }
                            class367.field5358 = -1;
                            class418.field6011 = class418.field6013;
                            return true;
                        } else if (~class367.field5358 == -57) {
                            int var112 = class249.field3379.method1349(arg0 ^ 8265);
                            int var113 = class249.field3379.method1363(111);
                            int var114 = class249.field3379.method1385(-106);
                            if (class376.method2367(arg0 ^ 8266, var112)) {
                                class142.method843(arg0 ^ 8273, var113, var114);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 11) {
                            class350.method2231((byte) -25);
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 238) {
                            int var115 = class249.field3379.method1342((byte) -128);
                            int var116 = class249.field3379.method1342((byte) -127);
                            if (var115 == 255) {
                                var115 = -1;
                                var116 = -1;
                            }
                            class170.method1129(var115, var116, (byte) 99);
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -65) {
                            int var117 = class249.field3379.method1355(arg0 ^ 23985);
                            if (class376.method2367(111, var117)) {
                                class113.method623(false);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -112) {
                            int var118 = class249.field3379.method1363(110);
                            class119 var119 = class179.method1170(var118, 818041328);
                            for (int var120 = 0; ~var120 > ~var119.field1580.length; ++var120) {
                                var119.field1580[var120] = -1;
                                var119.field1580[var120] = 0;
                            }
                            class101.method543((byte) -104, var119);
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -199) {
                            String var121 = class249.field3379.method1350(arg0 ^ 8291);
                            String var122 = class268.method1704(false, class20.method139((byte) -41, class297.method1880(class249.field3379, -102)));
                            class386.method2466(0, -1, var121, 6, var122, var121);
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -206) {
                            int var123 = class249.field3379.method1355(32136);
                            int var124 = class249.field3379.method1342((byte) -127);
                            int var125 = class249.field3379.method1342((byte) -127);
                            int var126 = class249.field3379.method1355(32136);
                            int var127 = class249.field3379.method1342((byte) -128);
                            int var128 = class249.field3379.method1342((byte) -126);
                            if (class376.method2367(68, var123)) {
                                class400.method2536(var127, var124, var126, var128, var125, 64);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -114) {
                            int var129 = class249.field3379.method1338(-29060);
                            int var130 = class249.field3379.method1393(-1);
                            int var131 = class249.field3379.method1355(32136);
                            int var132 = class249.field3379.method1355(32136);
                            if (~var132 == -65536) {
                                var132 = -1;
                            }
                            if (class376.method2367(-116, var131)) {
                                class119 var133 = class179.method1170(var129, 818041328);
                                if (var133.field1475) {
                                    class422.method2619(var132, var129, (byte) -111, var130);
                                    class260 var134 = class392.method2498(var132, arg0 + -8360);
                                    class198.method1269(var134.field3577, var129, var134.field3563, 8, var134.field3586);
                                    class276.method1743(var134.field3574, (byte) 77, var134.field3572, var129, var134.field3571);
                                } else {
                                    if (~var132 == 0) {
                                        var133.field1571 = 0;
                                        class367.field5358 = -1;
                                        return true;
                                    }
                                    class260 var135 = class392.method2498(var132, -110);
                                    var133.field1571 = 4;
                                    var133.field1439 = var135.field3586;
                                    var133.field1510 = var135.field3577 * 100 / var130;
                                    var133.field1522 = var135.field3563;
                                    var133.field1520 = var132;
                                    class101.method543((byte) -74, var133);
                                }
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -85) {
                            boolean var136 = ~class249.field3379.method1342((byte) -127) == -2;
                            String var137 = class249.field3379.method1350(83);
                            String var138 = var137;
                            if (var136) {
                                var138 = class249.field3379.method1350(87);
                            }
                            long var139 = (long) class249.field3379.method1355(32136);
                            long var141 = (long) class249.field3379.method1353(arg0 ^ 8288);
                            int var143 = class249.field3379.method1342((byte) -127);
                            int var144 = class249.field3379.method1355(32136);
                            long var145 = (var139 << 32) + var141;
                            boolean var147 = false;
                            int var148 = 0;
                            while (true) {
                                if (var148 >= 100) {
                                    if (~var143 >= -2 && class117.method656(var138, false)) {
                                        var147 = true;
                                    }
                                    break;
                                }
                                if (class39.field415[var148] == var145) {
                                    var147 = true;
                                    break;
                                }
                                ++var148;
                            }
                            if (!var147 && ~class307.field4396 == -1) {
                                class39.field415[class118.field1404] = var145;
                                class118.field1404 = (class118.field1404 + 1) % 100;
                                String var149 = class419.method2603(var144, true).method1821((byte) -51, class249.field3379);
                                if (~var143 != -3) {
                                    if (~var143 != -2) {
                                        class348.method2213(var138, var149, var137, var144, (String) null, 124, 18, 0);
                                    } else {
                                        class348.method2213("<img=0>" + var138, var149, "<img=0>" + var137, var144, (String) null, 125, 18, 0);
                                    }
                                } else {
                                    class348.method2213("<img=1>" + var138, var149, "<img=1>" + var137, var144, (String) null, 127, 18, 0);
                                }
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -13) {
                            int var150 = class249.field3379.method1355(32136);
                            int var151 = class249.field3379.method1377(29247);
                            int var152 = class249.field3379.method1356((byte) 79);
                            class358 var153 = class81.field917[var151];
                            if (var153 != null) {
                                class422.method2618((byte) 86, var150, var153, var152);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -47) {
                            int var154 = class249.field3379.method1393(-1);
                            int var155 = class249.field3379.method1377(29247);
                            int var156 = class249.field3379.method1382(-28295);
                            int var157 = class249.field3379.method1355(32136);
                            if (class376.method2367(103, var157)) {
                                class201 var158 = (class201) class396.field5783.method1204((byte) -101, (long) var154);
                                if (var158 != null) {
                                    class164.method1057(var158.field2776 != var155, var158, arg0 ^ 8249, false);
                                }
                                class150.method896(false, (byte) -116, var156, var154, var155);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 26) {
                            int var159 = class249.field3379.method1336((byte) -71);
                            int var160 = class249.field3379.method1385(-127);
                            int var161 = class249.field3379.method1377(arg0 ^ 20998);
                            if (class376.method2367(arg0 ^ -8262, var160)) {
                                class443.method2744(-118, var161, var159);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -220) {
                            int var162 = class249.field3379.method1349(arg0 ^ -8305);
                            class144.method848(0, var162);
                            class281.field3954[class40.method253(class123.field1642++, 31)] = class40.method253(32767, var162);
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 86) {
                            int var163 = class249.field3379.method1363(85);
                            int var164 = var163 >> 28 & 3;
                            int var165 = (var163 & 268423637) >> 14;
                            int var166 = var163 & 16383;
                            int var167 = class249.field3379.method1395(arg0 ^ -8288);
                            int var168 = var167 >> 2;
                            int var169 = var167 & 3;
                            int var170 = class98.field1108[var168];
                            int var171 = class249.field3379.method1349(96);
                            int var172 = var165 - class40.field427;
                            if (var171 == 65535) {
                                var171 = -1;
                            }
                            int var173 = var166 - class217.field2975;
                            class83.method454((byte) 60, var173, var169, var170, var172, var168, var164, var171);
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -10) {
                            class114.field1318 = class249.field3379.method1342((byte) -126);
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 168) {
                            class166.field2326 = class249.field3379.method1342((byte) -128);
                            for (int var174 = 0; ~class166.field2326 < ~var174; ++var174) {
                                class100.field1129[var174] = class249.field3379.method1350(45);
                                class19.field199[var174] = class249.field3379.method1350(79);
                                if (class19.field199[var174].equals("")) {
                                    class19.field199[var174] = class100.field1129[var174];
                                }
                                class301.field4298[var174] = class249.field3379.method1350(arg0 + -8159);
                                class176.field2445[var174] = class249.field3379.method1350(arg0 + -8199);
                                if (class176.field2445[var174].equals("")) {
                                    class176.field2445[var174] = class301.field4298[var174];
                                }
                                class2.field21[var174] = false;
                            }
                            class367.field5362 = class418.field6013;
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 50) {
                            int var175 = class249.field3379.method1355(32136);
                            if (var175 == 65535) {
                                var175 = -1;
                            }
                            int var176 = class249.field3379.method1342((byte) -128);
                            int var177 = class249.field3379.method1355(arg0 + 23887);
                            int var178 = class249.field3379.method1342((byte) -127);
                            class7.method67((byte) 111, var177, var178, var176, var175);
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -253) {
                            int var179 = class249.field3379.method1377(arg0 + 20998);
                            int var180 = class249.field3379.method1355(arg0 ^ 23985);
                            int var181 = class249.field3379.method1385(arg0 + -8373);
                            int var182 = class249.field3379.method1363(120);
                            if (var182 >> 30 != 0) {
                                int var183 = (var182 & 894068552) >> 28;
                                int var184 = ((var182 & 268432239) >> 14) - class40.field427;
                                int var185 = (var182 & 16383) + -class217.field2975;
                                if (var184 >= 0 && var185 >= 0 && ~class279.field3935 < ~var184 && ~class164.field2287 < ~var185) {
                                    int var186 = var184 * 128 + 64;
                                    int var187 = var185 * 128 - -64;
                                    class227 var188 = new class227(var180, 0, class221.field3033, var183, var186, -var181 + class372.method2335(var187, var183, (byte) 122, var186), var187, var184, var184, var185, var185);
                                    class334.field4906.method1125(-1, new class423(var188));
                                }
                            } else if (var182 >> 29 == 0) {
                                if (var182 >> 28 != 0) {
                                    int var189 = 65535 & var182;
                                    class133 var190;
                                    if (class188.field2547 == var189) {
                                        var190 = class390.field5715;
                                    } else {
                                        var190 = class375.field5473[var189];
                                    }
                                    if (var190 != null) {
                                        if (~var180 == -65536) {
                                            var180 = -1;
                                        }
                                        boolean var191 = true;
                                        if (var180 != -1 && ~var190.field6256 != 0) {
                                            if (~var190.field6256 == ~var180) {
                                                class377 var192 = class251.method1571(var180, (byte) 90);
                                                if (var192.field5521 && var192.field5536 != -1) {
                                                    class182 var193 = class437.method2717(var192.field5536, (byte) -103);
                                                    int var194 = var193.field2487;
                                                    if (~var194 != -1 && ~var194 != -3) {
                                                        if (~var194 == -2) {
                                                            var191 = true;
                                                        }
                                                    } else {
                                                        var191 = false;
                                                    }
                                                }
                                            } else {
                                                class377 var195 = class251.method1571(var180, (byte) 90);
                                                class377 var196 = class251.method1571(var190.field6256, (byte) 90);
                                                if (var195.field5536 != -1 && var196.field5536 != -1) {
                                                    class182 var197 = class437.method2717(var195.field5536, (byte) -103);
                                                    class182 var198 = class437.method2717(var196.field5536, (byte) -103);
                                                    if (~var198.field2489 < ~var197.field2489) {
                                                        var191 = false;
                                                    }
                                                }
                                            }
                                        }
                                        if (var191) {
                                            var190.field6304 = class221.field3033 - -var179;
                                            var190.field6315 = 0;
                                            var190.field6319 = var181;
                                            var190.field6256 = var180;
                                            var190.field6270 = 1;
                                            var190.field6332 = 0;
                                            if (var190.field6304 > class221.field3033) {
                                                var190.field6315 = -1;
                                            }
                                            if (var190.field6256 == 65535) {
                                                var190.field6256 = -1;
                                            }
                                            if (~var190.field6256 != 0 && class221.field3033 == var190.field6304) {
                                                int var199 = class251.method1571(var190.field6256, (byte) 90).field5536;
                                                if (var199 != -1) {
                                                    class182 var200 = class437.method2717(var199, (byte) -103);
                                                    if (var200 != null && var200.field2493 != null) {
                                                        class424.method2628(0, var190.field1304, var200, arg0 ^ 8249, var190.field1311, class390.field5715 == var190);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var201 = var182 & 65535;
                                class358 var202 = class81.field917[var201];
                                if (var202 != null) {
                                    if (~var180 == -65536) {
                                        var180 = -1;
                                    }
                                    boolean var203 = true;
                                    if (~var180 != 0 && var202.field6256 != -1) {
                                        if (~var202.field6256 != ~var180) {
                                            class377 var204 = class251.method1571(var180, (byte) 90);
                                            class377 var205 = class251.method1571(var202.field6256, (byte) 90);
                                            if (var204.field5536 != -1 && ~var205.field5536 != 0) {
                                                class182 var206 = class437.method2717(var204.field5536, (byte) -103);
                                                class182 var207 = class437.method2717(var205.field5536, (byte) -103);
                                                if (var207.field2489 > var206.field2489) {
                                                    var203 = false;
                                                }
                                            }
                                        } else {
                                            class377 var208 = class251.method1571(var180, (byte) 90);
                                            if (var208.field5521 && var208.field5536 != -1) {
                                                class182 var209 = class437.method2717(var208.field5536, (byte) -103);
                                                int var210 = var209.field2487;
                                                if (var210 != 0 && var210 != 2) {
                                                    if (~var210 == -2) {
                                                        var203 = true;
                                                    }
                                                } else {
                                                    var203 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var203) {
                                        var202.field6256 = var180;
                                        var202.field6319 = var181;
                                        var202.field6270 = 1;
                                        var202.field6304 = class221.field3033 + var179;
                                        var202.field6332 = 0;
                                        var202.field6315 = 0;
                                        if (class221.field3033 < var202.field6304) {
                                            var202.field6315 = -1;
                                        }
                                        if (var202.field6256 != -1 && ~class221.field3033 == ~var202.field6304) {
                                            int var211 = class251.method1571(var202.field6256, (byte) 90).field5536;
                                            if (~var211 != 0) {
                                                class182 var212 = class437.method2717(var211, (byte) -103);
                                                if (var212 != null && var212.field2493 != null) {
                                                    class424.method2628(0, var202.field1304, var212, 0, var202.field1311, false);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -94) {
                            class238.method1521((byte) -106);
                            class406.field5899 = class249.field3379.method1342((byte) -126);
                            class367.field5358 = -1;
                            class256.field3434 = class418.field6013;
                            return true;
                        } else if (~class367.field5358 == -145) {
                            class238.method1521((byte) -106);
                            int var213 = class249.field3379.method1363(114);
                            int var214 = class249.field3379.method1395(-90);
                            int var215 = class249.field3379.method1342((byte) -126);
                            class143.field2028[var215] = var213;
                            class423.field6068[var215] = var214;
                            class215.field2931[var215] = 1;
                            int var216 = class400.field5801[var215] + -1;
                            for (int var217 = 0; ~var217 > ~var216; ++var217) {
                                if (~class95.field1062[var217] >= ~var213) {
                                    class215.field2931[var215] = var217 + 2;
                                }
                            }
                            class112.field1296[class40.method253(class362.field5274++, 31)] = var215;
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -71) {
                            int var218 = class249.field3379.method1355(32136);
                            int var219 = class249.field3379.method1342((byte) -128);
                            int var220 = class249.field3379.method1342((byte) -127);
                            int var221 = class249.field3379.method1355(32136);
                            int var222 = class249.field3379.method1342((byte) -126);
                            int var223 = class249.field3379.method1342((byte) -127);
                            if (class376.method2367(87, var218)) {
                                class300.method1891(var222, var220, true, var219, (byte) -126, var221, var223);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 207) {
                            int var224 = class249.field3379.method1363(102);
                            class70.field797 = class323.field4554.method2396(var224, (byte) 83);
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 152) {
                            int var225 = class249.field3379.method1342((byte) -128);
                            int var226 = var225 >> 5;
                            int var227 = var225 & 31;
                            if (~var227 == -1) {
                                class286.field4039[var226] = null;
                                class367.field5358 = -1;
                                return true;
                            } else {
                                class58 var228 = new class58();
                                var228.field708 = var227;
                                var228.field696 = class249.field3379.method1342((byte) -128);
                                if (~var228.field696 <= -1 && ~var228.field696 > ~class147.field2062.length) {
                                    if (~var228.field708 != -2 && var228.field708 != 10) {
                                        if (var228.field708 >= 2 && var228.field708 <= 6) {
                                            if (var228.field708 == 2) {
                                                var228.field694 = 64;
                                                var228.field706 = 64;
                                            }
                                            if (var228.field708 == 3) {
                                                var228.field706 = 64;
                                                var228.field694 = 0;
                                            }
                                            if (~var228.field708 == -5) {
                                                var228.field694 = 128;
                                                var228.field706 = 64;
                                            }
                                            if (var228.field708 == 5) {
                                                var228.field706 = 0;
                                                var228.field694 = 64;
                                            }
                                            if (var228.field708 == 6) {
                                                var228.field694 = 64;
                                                var228.field706 = 128;
                                            }
                                            var228.field708 = 2;
                                            var228.field707 = class249.field3379.method1355(32136);
                                            var228.field702 = class249.field3379.method1355(arg0 ^ 23985);
                                            var228.field703 = class249.field3379.method1342((byte) -126);
                                            var228.field698 = class249.field3379.method1355(32136);
                                        }
                                    } else {
                                        var228.field697 = class249.field3379.method1355(arg0 + 23887);
                                        class249.field3379.field2888 += 5;
                                    }
                                    var228.field692 = class249.field3379.method1355(32136);
                                    if (~var228.field692 == -65536) {
                                        var228.field692 = -1;
                                    }
                                    class286.field4039[var226] = var228;
                                }
                                class367.field5358 = -1;
                                return true;
                            }
                        } else if (~class367.field5358 == -109) {
                            int var229 = class249.field3379.method1385(-100);
                            int var230 = class249.field3379.method1336((byte) -29);
                            int var231 = class249.field3379.method1385(-101);
                            if (class376.method2367(-67, var229)) {
                                class264.method1690(var230, 14, var231);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -89) {
                            for (int var232 = 0; ~class283.field3972.length < ~var232; ++var232) {
                                if (~class283.field3972[var232] != ~class282.field3967[var232]) {
                                    class283.field3972[var232] = class282.field3967[var232];
                                    class388.method2477(var232, 3504);
                                    class274.field3875[class40.method253(31, class25.field247++)] = var232;
                                }
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 6) {
                            int var233 = class249.field3379.method1344((byte) -4);
                            int var234 = class249.field3379.method1344((byte) -4);
                            int var235 = class249.field3379.method1393(-1);
                            int var236 = class249.field3379.method1349(-59);
                            if (class376.method2367(105, var236)) {
                                class260.method1626((byte) 82, var235, var233, var234);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -120) {
                            int var237 = class249.field3379.method1377(29247);
                            int var238 = class249.field3379.method1377(29247);
                            int var239 = class249.field3379.method1363(arg0 ^ 8310);
                            int var240 = class249.field3379.method1349(-73);
                            int var241 = class249.field3379.method1377(29247);
                            if (class376.method2367(arg0 + -8195, var237)) {
                                class221.method1442(17133, var238 << 16 | var240, var241, var239, 7);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -164) {
                            int var242 = class249.field3379.method1363(113);
                            int var243 = class249.field3379.method1355(32136);
                            int var244 = class249.field3379.method1356((byte) 83);
                            if (class376.method2367(-56, var243)) {
                                class207.method1314(var244, 61, var242);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 83) {
                            int var245 = class249.field3379.method1349(-56);
                            int var246 = class249.field3379.method1385(-106);
                            int var247 = class249.field3379.method1355(32136);
                            int var248 = class249.field3379.method1338(arg0 + -37309);
                            int var249 = class249.field3379.method1349(-87);
                            if (class376.method2367(100, var245)) {
                                class198.method1269(var249, var248, var247, arg0 + -8241, var246);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 151) {
                            class308.field4403 = class249.field3379.method1342((byte) -126);
                            class367.field5358 = -1;
                            class367.field5362 = class418.field6013;
                            return true;
                        } else if (class367.field5358 == 239) {
                            class424.method2629(false, (byte) 114);
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 214) {
                            class238.method1521((byte) -106);
                            class267.field3743 = class249.field3379.method1344((byte) -4);
                            class256.field3434 = class418.field6013;
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -118) {
                            boolean var250 = class249.field3379.method1342((byte) -128) == 1;
                            String var251 = class249.field3379.method1350(68);
                            String var252 = var251;
                            if (var250) {
                                var252 = class249.field3379.method1350(arg0 ^ 8302);
                            }
                            long var253 = (long) class249.field3379.method1355(arg0 + 23887);
                            long var255 = (long) class249.field3379.method1353(arg0 + -8160);
                            int var257 = class249.field3379.method1342((byte) -126);
                            long var258 = (var253 << 32) + var255;
                            boolean var260 = false;
                            int var261 = 0;
                            while (true) {
                                if (~var261 <= -101) {
                                    if (~var257 >= -2) {
                                        if ((!class149.field2095 || class303.field4330) && !class24.field239) {
                                            if (class117.method656(var252, false)) {
                                                var260 = true;
                                            }
                                        } else {
                                            var260 = true;
                                        }
                                    }
                                    break;
                                }
                                if (class39.field415[var261] == var258) {
                                    var260 = true;
                                    break;
                                }
                                ++var261;
                            }
                            if (!var260 && class307.field4396 == 0) {
                                class39.field415[class118.field1404] = var258;
                                class118.field1404 = (class118.field1404 + 1) % 100;
                                String var262 = class268.method1704(false, class20.method139((byte) -41, class297.method1880(class249.field3379, -37)));
                                if (~var257 != -3) {
                                    if (var257 == 1) {
                                        class348.method2213("<img=0>" + var252, var262, "<img=0>" + var251, -1, (String) null, 127, 7, 0);
                                    } else {
                                        class348.method2213(var252, var262, var251, -1, (String) null, 127, 3, 0);
                                    }
                                } else {
                                    class348.method2213("<img=1>" + var252, var262, "<img=1>" + var251, -1, (String) null, 123, 7, 0);
                                }
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -4) {
                            int var263 = class249.field3379.method1377(29247);
                            byte var264 = class249.field3379.method1351(arg0 + -8250);
                            class252.method1577(var263, var264, -63);
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 115) {
                            int var265 = class249.field3379.method1385(arg0 + -8346);
                            int var266 = class249.field3379.method1349(-42);
                            int var267 = class249.field3379.method1363(75);
                            int var268 = class249.field3379.method1393(arg0 + -8250);
                            if (class376.method2367(75, var265)) {
                                class221.method1442(17133, var266, var267, var268, 5);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 230) {
                            for (int var269 = 0; ~class375.field5473.length < ~var269; ++var269) {
                                if (class375.field5473[var269] != null) {
                                    class375.field5473[var269].field6312 = -1;
                                }
                            }
                            for (int var270 = 0; class81.field917.length > var270; ++var270) {
                                if (class81.field917[var270] != null) {
                                    class81.field917[var270].field6312 = -1;
                                }
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -175) {
                            byte var271 = class249.field3379.method1341((byte) 69);
                            int var272 = class249.field3379.method1349(95);
                            int var273 = class249.field3379.method1385(arg0 + -8353);
                            if (class376.method2367(52, var273)) {
                                class272.method1726(1664, var272, var271);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -140) {
                            int var274 = class249.field3379.method1342((byte) -126);
                            boolean var275 = ~(var274 & 1) == -2;
                            String var276 = class249.field3379.method1350(109);
                            String var277 = class249.field3379.method1350(99);
                            String var278 = class249.field3379.method1350(81);
                            String var279 = class249.field3379.method1350(65);
                            if (var275) {
                                for (int var280 = 0; ~class166.field2326 < ~var280; ++var280) {
                                    if (class19.field199[var280].equals(var279)) {
                                        class100.field1129[var280] = var276;
                                        if (!var277.equals("")) {
                                            class19.field199[var280] = var277;
                                        } else {
                                            class19.field199[var280] = var276;
                                        }
                                        class301.field4298[var280] = var278;
                                        if (var279.equals("")) {
                                            class176.field2445[var280] = var278;
                                        } else {
                                            class176.field2445[var280] = var279;
                                        }
                                        break;
                                    }
                                }
                            } else {
                                class100.field1129[class166.field2326] = var276;
                                if (!var277.equals("")) {
                                    class19.field199[class166.field2326] = var277;
                                } else {
                                    class19.field199[class166.field2326] = var276;
                                }
                                class301.field4298[class166.field2326] = var278;
                                if (var279.equals("")) {
                                    class176.field2445[class166.field2326] = var278;
                                } else {
                                    class176.field2445[class166.field2326] = var279;
                                }
                                class2.field21[class166.field2326] = class40.method253(var274, 2) == 2;
                                ++class166.field2326;
                            }
                            class367.field5362 = class418.field6013;
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -148) {
                            String var281 = class249.field3379.method1350(82);
                            int var282 = class249.field3379.method1377(arg0 ^ 20998);
                            int var283 = class249.field3379.method1355(32136);
                            if (class376.method2367(arg0 ^ 8223, var283)) {
                                class37.method216((byte) -66, var282, var281);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 40) {
                            int var284 = class249.field3379.method1355(32136);
                            int var285 = class249.field3379.method1393(-1);
                            int var286 = class249.field3379.method1385(-127);
                            if (~var286 == -65536) {
                                var286 = -1;
                            }
                            if (class376.method2367(-70, var284)) {
                                class221.method1442(17133, var286, -1, var285, 2);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 129) {
                            int var287 = class249.field3379.method1355(32136);
                            int var288 = class249.field3379.method1355(32136);
                            int var289 = class249.field3379.method1355(arg0 + 23887);
                            int var290 = class249.field3379.method1355(32136);
                            if (class376.method2367(-72, var287) && field3054[var288] != null) {
                                for (int var291 = var289; ~var291 > ~var290; ++var291) {
                                    int var292 = class249.field3379.method1353(124);
                                    if (~field3054[var288].length < ~var291 && field3054[var288][var291] != null) {
                                        field3054[var288][var291].field1541 = var292;
                                    }
                                }
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -167) {
                            int var293 = class249.field3379.method1385(-126);
                            if (var293 == 65535) {
                                var293 = -1;
                            }
                            int var294 = class249.field3379.method1355(arg0 + 23887);
                            if (~var294 == -65536) {
                                var294 = -1;
                            }
                            int var295 = class249.field3379.method1338(arg0 + -37309);
                            int var296 = class249.field3379.method1363(112);
                            int var297 = class249.field3379.method1349(-88);
                            if (class376.method2367(80, var297)) {
                                for (int var298 = var293; var294 >= var298; ++var298) {
                                    long var299 = ((long) var295 << 32) + (long) var298;
                                    class3 var301 = (class3) class302.field4309.method1204((byte) -128, var299);
                                    class3 var302;
                                    if (var301 != null) {
                                        var302 = new class3(var296, var301.field36);
                                        var301.method2290((byte) 98);
                                    } else if (~var298 != 0) {
                                        var302 = new class3(var296, -1);
                                    } else {
                                        var302 = new class3(var296, class179.method1170(var295, 818041328).field1443.field36);
                                    }
                                    class302.field4309.method1202(-1, var299, var302);
                                }
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 65) {
                            int var303 = class249.field3379.method1338(-29060);
                            int var304 = class249.field3379.method1385(-104);
                            if (class376.method2367(-116, var304)) {
                                class221.method1442(17133, 2047, 0, var303, 5);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 188) {
                            class173.field2414 = class249.field3379.method1342((byte) -128);
                            class299.field4265 = class249.field3379.method1356((byte) 101);
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -83) {
                            int var305 = class249.field3379.method1355(32136);
                            int var306 = class249.field3379.method1395(125);
                            if (class376.method2367(114, var305)) {
                                class174.field2425 = var306;
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 16) {
                            if (~class424.field6086 != 0) {
                                class237.method1513(0, class424.field6086, 65079);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 105) {
                            String var307 = class249.field3379.method1350(80);
                            boolean var308 = class249.field3379.method1342((byte) -126) == 1;
                            String var309;
                            if (var308) {
                                var309 = class249.field3379.method1350(115);
                            } else {
                                var309 = var307;
                            }
                            int var310 = class249.field3379.method1355(32136);
                            byte var311 = class249.field3379.method1373((byte) 30);
                            boolean var312 = false;
                            if (~var311 == 127) {
                                var312 = true;
                            }
                            if (var312) {
                                if (class54.field607 == 0) {
                                    class367.field5358 = -1;
                                    return true;
                                }
                                boolean var313 = false;
                                int var314;
                                for (var314 = 0; var314 < class54.field607 && (!class166.field2323[var314].field5054.equals(var309) || ~class166.field2323[var314].field5059 != ~var310); ++var314) {
                                }
                                if (class54.field607 > var314) {
                                    while (~(class54.field607 - 1) < ~var314) {
                                        class166.field2323[var314] = class166.field2323[var314 + 1];
                                        ++var314;
                                    }
                                    --class54.field607;
                                    class166.field2323[class54.field607] = null;
                                }
                            } else {
                                String var315 = class249.field3379.method1350(arg0 + -8126);
                                class344 var316 = new class344();
                                var316.field5059 = var310;
                                var316.field5055 = var307;
                                var316.field5058 = var315;
                                var316.field5054 = var309;
                                var316.field5056 = var311;
                                int var317;
                                for (var317 = class54.field607 + -1; ~var317 <= -1; --var317) {
                                    int var318 = class166.field2323[var317].field5054.compareTo(var316.field5054);
                                    if (var318 == 0) {
                                        class166.field2323[var317].field5059 = var310;
                                        class166.field2323[var317].field5056 = var311;
                                        class166.field2323[var317].field5058 = var315;
                                        if (var309.equals(class390.field5715.field1847)) {
                                            class341.field5023 = var311;
                                        }
                                        class367.field5358 = -1;
                                        class59.field709 = class418.field6013;
                                        return true;
                                    }
                                    if (var318 < 0) {
                                        break;
                                    }
                                }
                                if (class54.field607 >= class166.field2323.length) {
                                    class367.field5358 = -1;
                                    return true;
                                }
                                for (int var319 = class54.field607 + -1; var319 > var317; --var319) {
                                    class166.field2323[var319 + 1] = class166.field2323[var319];
                                }
                                if (~class54.field607 == -1) {
                                    class166.field2323 = new class344[100];
                                }
                                class166.field2323[var317 + 1] = var316;
                                ++class54.field607;
                                if (var309.equals(class390.field5715.field1847)) {
                                    class341.field5023 = var311;
                                }
                            }
                            class59.field709 = class418.field6013;
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -64) {
                            int var320 = class249.field3379.method1376(arg0 ^ 8377);
                            int var321 = class249.field3379.method1336((byte) -113);
                            int var322 = class249.field3379.method1342((byte) -126);
                            String var323 = "";
                            String var324 = var323;
                            if ((var322 & 1) != 0) {
                                var323 = class249.field3379.method1350(arg0 ^ 8319);
                                if ((2 & var322) != 0) {
                                    var324 = class249.field3379.method1350(arg0 ^ 8203);
                                } else {
                                    var324 = var323;
                                }
                            }
                            String var325 = class249.field3379.method1350(85);
                            if (var320 == 99) {
                                class400.method2531(var325, (byte) 82);
                            } else {
                                if (!var324.equals("") && class117.method656(var324, false)) {
                                    class367.field5358 = -1;
                                    return true;
                                }
                                class386.method2466(var321, -1, var324, var320, var325, var323);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 72) {
                            int var326 = class249.field3379.method1395(-110);
                            int var327 = class249.field3379.method1377(29247);
                            class337.method2173(var327, var326, (byte) -33);
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 98) {
                            int var328 = class249.field3379.method1355(arg0 + 23887);
                            int var329 = class249.field3379.method1336((byte) -89);
                            if (class376.method2367(-98, var328)) {
                                class201 var330 = (class201) class396.field5783.method1204((byte) -121, (long) var329);
                                if (var330 != null) {
                                    class164.method1057(true, var330, arg0 + -8249, false);
                                }
                                if (class344.field5061 != null) {
                                    class101.method543((byte) 81, class344.field5061);
                                    class344.field5061 = null;
                                }
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -30) {
                            boolean var331 = class249.field3379.method1342((byte) -126) == 1;
                            String var332 = class249.field3379.method1350(arg0 + -8124);
                            String var333 = var332;
                            if (var331) {
                                var333 = class249.field3379.method1350(45);
                            }
                            long var334 = class249.field3379.method1394(true);
                            long var336 = (long) class249.field3379.method1355(32136);
                            long var338 = (long) class249.field3379.method1353(107);
                            int var340 = class249.field3379.method1342((byte) -128);
                            long var341 = (var336 << 32) + var338;
                            boolean var343 = false;
                            int var344 = 0;
                            while (true) {
                                if (var344 >= 100) {
                                    if (~var340 >= -2) {
                                        if ((!class149.field2095 || class303.field4330) && !class24.field239) {
                                            if (class117.method656(var333, false)) {
                                                var343 = true;
                                            }
                                        } else {
                                            var343 = true;
                                        }
                                    }
                                    break;
                                }
                                if (~class39.field415[var344] == ~var341) {
                                    var343 = true;
                                    break;
                                }
                                ++var344;
                            }
                            if (!var343 && ~class307.field4396 == -1) {
                                class39.field415[class118.field1404] = var341;
                                class118.field1404 = (class118.field1404 - -1) % 100;
                                String var345 = class268.method1704(false, class20.method139((byte) -41, class297.method1880(class249.field3379, -71)));
                                if (var340 != 2 && var340 != 3) {
                                    if (var340 != 1) {
                                        class348.method2213(var333, var345, var332, -1, class362.method2305(0, var334), 124, 9, 0);
                                    } else {
                                        class348.method2213("<img=0>" + var333, var345, "<img=0>" + var332, -1, class362.method2305(0, var334), arg0 + -8125, 9, 0);
                                    }
                                } else {
                                    class348.method2213("<img=1>" + var333, var345, "<img=1>" + var332, -1, class362.method2305(0, var334), 123, 9, 0);
                                }
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 251) {
                            class249.field3379.field2888 += 28;
                            if (class249.field3379.method1378(arg0 + -26162)) {
                                class147.method871(class249.field3379.field2888 - 28, class249.field3379, 0);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -104) {
                            class99.field1117 = class249.field3379.method1377(29247) * 30;
                            class256.field3434 = class418.field6013;
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -127) {
                            int var346 = class249.field3379.method1377(arg0 ^ 20998);
                            int var347 = class249.field3379.method1377(29247);
                            String var348 = class249.field3379.method1350(117);
                            if (class376.method2367(arg0 + -8359, var346)) {
                                class37.method216((byte) -66, var347, var348);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -237) {
                            class334.method2147(class249.field3379.method1350(47), arg0 + -8250);
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -254) {
                            if (class223.field3042 != null) {
                                class175.method1158(-1, -1, -1, class288.field4081, false);
                            }
                            byte[] var349 = new byte[class290.field4131];
                            class249.field3379.method811(var349, 127, 0, class290.field4131);
                            String var350 = class288.method1835(var349, class290.field4131, 0, arg0 ^ -8257);
                            class274.method1735(25794, class323.field4554, var350, class341.field5018 == 1, true);
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 27) {
                            if (~class290.field4131 == -1) {
                                class433.field6286 = class251.field3397;
                            } else {
                                class433.field6286 = class249.field3379.method1350(90);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -11) {
                            int var351 = class249.field3379.method1372((byte) 107);
                            int var352 = class249.field3379.method1385(arg0 + -8367);
                            int var353 = class249.field3379.method1393(arg0 ^ -8250);
                            if (class376.method2367(-58, var352)) {
                                class99.method532(var353, -31358, var351);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -242) {
                            class50.field579 = class249.field3379.method1342((byte) -128);
                            class376.field5514 = class249.field3379.method1342((byte) -127);
                            class119.field1449 = class249.field3379.method1342((byte) -126);
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 154) {
                            class424.method2629(true, (byte) 95);
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 181) {
                            class299.field4265 = class249.field3379.method1342((byte) -128);
                            class173.field2414 = class249.field3379.method1356((byte) -46);
                            while (class249.field3379.field2888 < class290.field4131) {
                                class367.field5358 = class249.field3379.method1342((byte) -126);
                                class305.method1914(81);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -124) {
                            class383.method2457((byte) 123, class290.field4131, class249.field3379, class323.field4554);
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 23) {
                            int var354 = class249.field3379.method1355(32136);
                            int var355 = class249.field3379.method1385(-121);
                            int var356 = class249.field3379.method1377(29247);
                            if (class376.method2367(98, var356)) {
                                class166.method1092(0, -128, var354, var355);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (class367.field5358 == 74) {
                            class54.method317((byte) 8);
                            class238.method1521((byte) -106);
                            class25.field247 += 32;
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -78) {
                            int var357 = class249.field3379.method1355(32136);
                            String var358 = class249.field3379.method1350(82);
                            Object[] var359 = new Object[1 + var358.length()];
                            for (int var360 = var358.length() - 1; ~var360 <= -1; --var360) {
                                if (~var358.charAt(var360) == -116) {
                                    var359[var360 + 1] = class249.field3379.method1350(class97.method519(arg0, 8261));
                                } else {
                                    var359[var360 + 1] = new Integer(class249.field3379.method1336((byte) -78));
                                }
                            }
                            var359[0] = new Integer(class249.field3379.method1336((byte) -80));
                            if (class376.method2367(48, var357)) {
                                class191 var361 = new class191();
                                var361.field2602 = var359;
                                class387.method2471(var361);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -129) {
                            class173.field2414 = class249.field3379.method1395(118);
                            class299.field4265 = class249.field3379.method1382(-28295);
                            for (class111 var362 = (class111) class319.field4527.method1212(-71); var362 != null; var362 = (class111) class319.field4527.method1207(false)) {
                                int var364 = (int) (var362.field5248 & 16383L);
                                int var365 = (int) (16383L & var362.field5248 >> 14);
                                int var366 = (int) (var362.field5248 >> 28 & 3L);
                                if (~class410.field5931 == ~var366 && ~class299.field4265 >= ~var364 && ~(class299.field4265 - -8) < ~var364 && var365 >= class173.field2414 && class173.field2414 - -8 > var365) {
                                    var362.method2290((byte) 98);
                                    class32.method187(class410.field5931, arg0 ^ 8264, var365, var364);
                                }
                            }
                            for (class219 var363 = (class219) class327.field4643.method1124(arg0 ^ -8250); var363 != null; var363 = (class219) class327.field4643.method1119(false)) {
                                if (var363.field3005 >= class299.field4265 && ~var363.field3005 > ~(class299.field4265 - -8) && ~class173.field2414 >= ~var363.field2995 && var363.field2995 < class173.field2414 + 8 && class410.field5931 == var363.field2998) {
                                    var363.field2996 = 0;
                                }
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -163) {
                            String var367 = class249.field3379.method1350(86);
                            int var368 = class249.field3379.method1355(32136);
                            String var369 = class419.method2603(var368, true).method1821((byte) -51, class249.field3379);
                            class348.method2213(var367, var369, var367, var368, (String) null, 123, 19, 0);
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 == -9) {
                            int var370 = class249.field3379.method1363(118);
                            int var371 = class249.field3379.method1355(32136);
                            if (class376.method2367(65, var371)) {
                                class221.method1442(17133, -1, -1, var370, 3);
                            }
                            class367.field5358 = -1;
                            return true;
                        } else if (~class367.field5358 != -77) {
                            class411.method2578((Throwable) null, "T1 - " + class367.field5358 + "," + class148.field2070 + "," + class334.field4915 + " - " + class290.field4131, (byte) -68);
                            class6.method60((byte) -96);
                            return true;
                        } else {
                            int var372 = class249.field3379.method1336((byte) -53);
                            int var373 = class249.field3379.method1355(32136);
                            if (var372 < -70000) {
                                var373 += 32768;
                            }
                            class119 var374;
                            if (var372 < 0) {
                                var374 = null;
                            } else {
                                var374 = class179.method1170(var372, 818041328);
                            }
                            if (var374 != null) {
                                for (int var375 = 0; var375 < var374.field1580.length; ++var375) {
                                    var374.field1580[var375] = 0;
                                    var374.field1592[var375] = 0;
                                }
                            }
                            class300.method1896(var373, 0);
                            int var376 = class249.field3379.method1355(32136);
                            for (int var377 = 0; var376 > var377; ++var377) {
                                int var378 = class249.field3379.method1395(-29);
                                if (~var378 == -256) {
                                    var378 = class249.field3379.method1336((byte) -43);
                                }
                                int var379 = class249.field3379.method1349(arg0 + -8367);
                                if (var374 != null && ~var377 > ~var374.field1580.length) {
                                    var374.field1580[var377] = var379;
                                    var374.field1592[var377] = var378;
                                }
                                class111.method615(var379 + -1, var378, var377, (byte) 3, var373);
                            }
                            if (var374 != null) {
                                class101.method543((byte) 55, var374);
                            }
                            class238.method1521((byte) -106);
                            class281.field3954[class40.method253(class123.field1642++, 31)] = class40.method253(32767, var373);
                            class367.field5358 = -1;
                            return true;
                        }
                    } else {
                        class305.method1914(arg0 ^ 8310);
                        class367.field5358 = -1;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 3051)
    public class224() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)V", line = 2990)
    public static void method1453(byte arg0) {
        if (arg0 == -52) {
            field3060 = null;
            field3057 = null;
            field3054 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILra;)V", line = 3004)
    public static final void method1454(int arg0, class57 arg1) {
        ++field3059;
        if (arg0 != 4018) {
            method1451(21);
        }
        class392.field5735 = arg1;
        class298.field4253 = class392.field5735.method352(4, (byte) -75);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)[I", line = 3016)
    public final int[] method57(int arg0, int arg1) {
        ++field3055;
        if (arg1 != 0) {
            this.method57(96, 17);
        }
        int[] var3 = super.field1340.method14(55, arg0);
        if (super.field1340.field35) {
            int[] var4 = this.method631(true, 0, arg0);
            for (int var5 = 0; var5 < class218.field2979; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field3062 && this.field3056 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }
}
