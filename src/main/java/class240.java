import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class240 extends class135 {

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    private int field4265 = 585;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lqj;")
    public static class196 field4264 = class80.method502("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", -48);

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field4266 = 0;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "Lqj;")
    public static class196 field4270 = class80.method502("sch-Utteln:", -48);

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "[J")
    public static long[] field4267 = new long[32];

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "Z")
    public static boolean field4271 = true;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "[I")
    public static int[] field4261;

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class240() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg2 != -16231) {
            field4271 = false;
        }
        if (~arg1 == -1) {
            this.field4265 = arg0.method318(true);
        }
        ++field4262;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Z")
    public static final boolean method1637(int arg0) throws IOException {
        ++field4263;
        if (class194.field3408 == null) {
            return false;
        } else {
            int var1 = class194.field3408.method479(30000);
            if (var1 == 0) {
                return false;
            } else {
                if (~class195.field3432 == 0) {
                    --var1;
                    class194.field3408.method482((byte) 113, 0, 1, class229.field4077.field693);
                    class229.field4077.field699 = 0;
                    class195.field3432 = class229.field4077.method1174(false);
                    class76.field1096 = class48.field581[class195.field3432];
                }
                if (~class76.field1096 == 0) {
                    if (~var1 >= -1) {
                        return false;
                    }
                    class194.field3408.method482((byte) 87, 0, 1, class229.field4077.field693);
                    class76.field1096 = 255 & class229.field4077.field693[0];
                    --var1;
                }
                if (class76.field1096 == -2) {
                    if (~var1 >= -2) {
                        return false;
                    }
                    class194.field3408.method482((byte) 84, 0, 2, class229.field4077.field693);
                    class229.field4077.field699 = 0;
                    class76.field1096 = class229.field4077.method318(true);
                    var1 -= 2;
                }
                if (~var1 > ~class76.field1096) {
                    return false;
                } else {
                    class229.field4077.field699 = 0;
                    class194.field3408.method482((byte) 60, 0, class76.field1096, class229.field4077.field693);
                    class62.field855 = 0;
                    class133.field1900 = class70.field979;
                    class70.field979 = class171.field2871;
                    class171.field2871 = class195.field3432;
                    if (class195.field3432 == 119) {
                        for (int var2 = 0; class247.field4397.length > var2; ++var2) {
                            if (class247.field4397[var2] != null) {
                                class247.field4397[var2].field2086 = -1;
                            }
                        }
                        for (int var3 = 0; class153.field2482.length > var3; ++var3) {
                            if (class153.field2482[var3] != null) {
                                class153.field2482[var3].field2086 = -1;
                            }
                        }
                        class195.field3432 = -1;
                        return true;
                    } else if (class195.field3432 == 19) {
                        int var4 = class229.field4077.method311(0);
                        int var5 = class229.field4077.method311(0);
                        class63 var6 = (class63) class101.field1445.method1551(32768, (long) var4);
                        class63 var7 = (class63) class101.field1445.method1551(32768, (long) var5);
                        if (var7 != null) {
                            class72.method457(var7, var6 == null || var6.field864 != var7.field864, (byte) -127);
                        }
                        if (var6 != null) {
                            var6.method797((byte) 124);
                            class101.field1445.method1552(var6, (long) var5, 0);
                        }
                        class178 var8 = class201.method1356(var4, (byte) -106);
                        if (var8 != null) {
                            class214.method1472(79, var8);
                        }
                        class178 var9 = class201.method1356(var5, (byte) 86);
                        if (var9 != null) {
                            class214.method1472(-96, var9);
                            class163.method1026(true, -3, var9);
                        }
                        if (~class9.field103 != 0) {
                            class17.method92(104, class9.field103, 1);
                        }
                        class195.field3432 = -1;
                        return true;
                    } else if (class195.field3432 == 132) {
                        int var10 = class229.field4077.method305(true);
                        byte var11 = class229.field4077.method350(16);
                        class150.method944(true, var10, var11);
                        class195.field3432 = -1;
                        return true;
                    } else if (class195.field3432 == 26) {
                        class90.method556(102, class229.field4077);
                        class195.field3432 = -1;
                        return true;
                    } else if (~class195.field3432 == -217) {
                        int var12 = class229.field4077.method318(true);
                        int var13 = class229.field4077.method367(1);
                        if (~var13 == -3) {
                            class60.method379((byte) -122);
                        }
                        class9.field103 = var12;
                        class10.method44(var12, 105);
                        class159.method1003(-121, false);
                        class158.method995(29288, class9.field103);
                        for (int var14 = 0; var14 < 100; ++var14) {
                            class161.field2588[var14] = true;
                        }
                        class195.field3432 = -1;
                        return true;
                    } else if (~class195.field3432 == -42) {
                        int var15 = class229.field4077.method318(true);
                        int var16 = class229.field4077.method367(1);
                        int var17 = class229.field4077.method318(true);
                        if (var15 == 65535) {
                            var15 = -1;
                        }
                        class46.method247(var15, var16, var17, (byte) 74);
                        class195.field3432 = -1;
                        return true;
                    } else if (class195.field3432 == 250) {
                        int var18 = class229.field4077.method315(61);
                        class196 var19 = class229.field4077.method326(true);
                        int var20 = class229.field4077.method315(73);
                        class93.method571(21601, var18);
                        class180.method1179((byte) -71, var19, var20);
                        class195.field3432 = -1;
                        return true;
                    } else if (class195.field3432 == 107) {
                        int var21 = class229.field4077.method315(80);
                        if (var21 == 65535) {
                            var21 = -1;
                        }
                        int var22 = class229.field4077.method305(true);
                        int var23 = class229.field4077.method348((byte) -114);
                        int var24 = class229.field4077.method335(true);
                        if (var22 == 65535) {
                            var22 = -1;
                        }
                        for (int var25 = var21; var25 <= var22; ++var25) {
                            long var26 = ((long) var23 << 32) + (long) var25;
                            class130 var28 = class189.field3299.method1551(32768, var26);
                            if (var28 != null) {
                                var28.method797((byte) 118);
                            }
                            class189.field3299.method1552(new class206(var24), var26, 0);
                        }
                        class195.field3432 = -1;
                        return true;
                    } else if (~class195.field3432 == -57) {
                        int var29 = class229.field4077.method311(0);
                        class63 var30 = (class63) class101.field1445.method1551(32768, (long) var29);
                        if (var30 != null) {
                            class72.method457(var30, true, (byte) -114);
                        }
                        if (class30.field387 != null) {
                            class214.method1472(90, class30.field387);
                            class30.field387 = null;
                        }
                        class195.field3432 = -1;
                        return true;
                    } else if (~class195.field3432 == -159) {
                        class211.field3796 = class76.field1096 / 8;
                        for (int var31 = 0; ~class211.field3796 < ~var31; ++var31) {
                            class116.field1680[var31] = class229.field4077.method319(18533);
                            class198.field3511[var31] = client.method627(class116.field1680[var31], (byte) -127);
                        }
                        class195.field3432 = -1;
                        class242.field4302 = class92.field1341;
                        return true;
                    } else if (~class195.field3432 == -223) {
                        class47.method249(-28276);
                        class182.method1193(-23);
                        class195.field3432 = -1;
                        class206.field3703 += 32;
                        return true;
                    } else if (~class195.field3432 == -13) {
                        if (~class9.field103 != 0) {
                            class17.method92(12, class9.field103, 0);
                        }
                        class195.field3432 = -1;
                        return true;
                    } else if (~class195.field3432 == -177) {
                        class103.field1492 = class229.field4077.method367(1);
                        class135.field1957 = class229.field4077.method367(1);
                        class183.field3216 = class229.field4077.method367(1);
                        class195.field3432 = -1;
                        return true;
                    } else if (~class195.field3432 == -237) {
                        int var32 = class229.field4077.method305(true);
                        if (var32 == 65535) {
                            var32 = -1;
                        }
                        int var33 = class229.field4077.method311(0);
                        int var34 = class229.field4077.method335(true);
                        class178 var35 = class201.method1356(var33, (byte) 72);
                        if (var35.field3030) {
                            var35.field3081 = var32;
                            var35.field3101 = var34;
                            class202 var36 = class178.method1154(false, var32);
                            var35.field3041 = var36.field3607;
                            var35.field3017 = var36.field3638;
                            var35.field3132 = var36.field3578;
                            var35.field3078 = var36.field3577;
                            if (var35.field3128 > 0) {
                                var35.field3132 = var35.field3132 * 32 / var35.field3128;
                            } else if (var35.field2995 > 0) {
                                var35.field3132 = var35.field3132 * 32 / var35.field2995;
                            }
                            var35.field3135 = var36.field3594;
                            var35.field3103 = var36.field3629;
                            class214.method1472(68, var35);
                        } else {
                            if (~var32 == 0) {
                                var35.field3073 = 0;
                                class195.field3432 = -1;
                                return true;
                            }
                            class202 var37 = class178.method1154(false, var32);
                            var35.field3094 = var32;
                            var35.field3132 = var37.field3578 * 100 / var34;
                            var35.field3073 = 4;
                            var35.field3041 = var37.field3607;
                            var35.field3017 = var37.field3638;
                            class214.method1472(-62, var35);
                        }
                        class195.field3432 = -1;
                        return true;
                    } else if (~class195.field3432 == -2) {
                        long var38 = class229.field4077.method319(18533);
                        long var40 = (long) class229.field4077.method318(true);
                        long var42 = (long) class229.field4077.method328(-1974);
                        int var44 = class229.field4077.method367(1);
                        long var45 = (var40 << 32) + var42;
                        boolean var47 = false;
                        int var48 = 0;
                        label1054: while (true) {
                            if (~var48 <= -101) {
                                if (~var44 >= -2) {
                                    if (~class33.field402 != -2 && ~class213.field3818 != -2) {
                                        for (int var49 = 0; ~var49 > ~class211.field3796; ++var49) {
                                            if (class116.field1680[var49] == var38) {
                                                var47 = true;
                                                break label1054;
                                            }
                                        }
                                    } else {
                                        var47 = true;
                                    }
                                }
                                break;
                            }
                            if (class61.field834[var48] == var45) {
                                var47 = true;
                                break;
                            }
                            ++var48;
                        }
                        if (!var47 && class1.field8 == 0) {
                            class61.field834[class67.field950] = var45;
                            class67.field950 = (class67.field950 - -1) % 100;
                            class196 var50 = class190.method1254(class136.method839(125, class229.field4077).method1308(0));
                            if (~var44 != -3 && ~var44 != -4) {
                                if (var44 != 1) {
                                    class236.method1586(var50, 106, 3, client.method627(var38, (byte) -127).method1307(-115));
                                } else {
                                    class236.method1586(var50, 111, 7, class93.method572(-57, new class196[] { class224.field4019, client.method627(var38, (byte) -128).method1307(-98) }));
                                }
                            } else {
                                class236.method1586(var50, 107, 7, class93.method572(-119, new class196[] { class78.field1139, client.method627(var38, (byte) -127).method1307(-128) }));
                            }
                        }
                        class195.field3432 = -1;
                        return true;
                    } else if (class195.field3432 == 24) {
                        class56.method353(class76.field1096, class168.field2844, 6201, class229.field4077);
                        class195.field3432 = -1;
                        return true;
                    } else if (~class195.field3432 == -39) {
                        int var51 = class229.field4077.method305(true);
                        if (var51 == 65535) {
                            var51 = -1;
                        }
                        class30.method162((byte) 14, var51);
                        class195.field3432 = -1;
                        return true;
                    } else if (class195.field3432 == 167) {
                        int var52 = class229.field4077.method318(true);
                        int var53 = class229.field4077.method362(true);
                        if (~var52 == -65536) {
                            var52 = -1;
                        }
                        class74.method474((byte) -82, var53, var52);
                        class195.field3432 = -1;
                        return true;
                    } else if (~class195.field3432 == -203) {
                        int var54 = class229.field4077.method367(1);
                        int var55 = class229.field4077.method367(1);
                        int var56 = class229.field4077.method318(true);
                        int var57 = class229.field4077.method367(1);
                        int var58 = class229.field4077.method367(1);
                        class173.method1132(var57, var56, var55, true, var54, var58);
                        class195.field3432 = -1;
                        return true;
                    } else if (~class195.field3432 == -82) {
                        int var59 = class229.field4077.method348((byte) -114);
                        class178 var60 = class201.method1356(var59, (byte) 124);
                        for (int var61 = 0; var60.field3045.length > var61; ++var61) {
                            var60.field3045[var61] = -1;
                            var60.field3045[var61] = 0;
                        }
                        class214.method1472(-52, var60);
                        class195.field3432 = -1;
                        return true;
                    } else if (class195.field3432 == 37) {
                        class110.field1570 = class229.field4077.method336((byte) 92);
                        class69.field973 = class229.field4077.method336((byte) -11);
                        for (int var62 = class110.field1570; ~(class110.field1570 + 8) < ~var62; ++var62) {
                            for (int var64 = class69.field973; var64 < class69.field973 + 8; ++var64) {
                                if (class178.field3040[class27.field335][var62][var64] != null) {
                                    class178.field3040[class27.field335][var62][var64] = null;
                                    class175.method1140(var62, var64, true);
                                }
                            }
                        }
                        for (class234 var63 = (class234) class144.field2222.method1651((byte) -23); var63 != null; var63 = (class234) class144.field2222.method1656(-66)) {
                            if (class110.field1570 <= var63.field4153 && ~var63.field4153 > ~(class110.field1570 + 8) && var63.field4152 >= class69.field973 && ~var63.field4152 > ~(class69.field973 + 8) && ~class27.field335 == ~var63.field4155) {
                                var63.field4161 = 0;
                            }
                        }
                        class195.field3432 = -1;
                        return true;
                    } else if (class195.field3432 == 185) {
                        int var65 = class229.field4077.method315(83);
                        if (~var65 == -65536) {
                            var65 = -1;
                        }
                        int var66 = class229.field4077.method348((byte) -114);
                        class178 var67 = class201.method1356(var66, (byte) 93);
                        if (~var67.field3073 != -2 || ~var67.field3094 != ~var65) {
                            var67.field3073 = 1;
                            var67.field3094 = var65;
                            class214.method1472(-113, var67);
                        }
                        class195.field3432 = -1;
                        return true;
                    } else if (class195.field3432 != 174 && ~class195.field3432 != -210 && class195.field3432 != 199 && ~class195.field3432 != -121 && ~class195.field3432 != -123 && ~class195.field3432 != -239 && class195.field3432 != 192 && class195.field3432 != 14 && ~class195.field3432 != -72 && ~class195.field3432 != -66 && ~class195.field3432 != -213 && ~class195.field3432 != -16) {
                        if (~class195.field3432 == -80) {
                            int var68 = class229.field4077.method339(-96);
                            int var69 = class229.field4077.method354(true);
                            int var70 = class229.field4077.method354(true);
                            int var71 = class229.field4077.method315(51);
                            class178 var72 = class201.method1356(var68, (byte) 87);
                            if (var72.field3017 != var70 || ~var72.field3041 != ~var69 || ~var72.field3132 != ~var71) {
                                var72.field3041 = var69;
                                var72.field3017 = var70;
                                var72.field3132 = var71;
                                class214.method1472(-72, var72);
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 3) {
                            int var73 = class229.field4077.method315(58);
                            int var74 = class229.field4077.method348((byte) -114);
                            int var75 = class229.field4077.method305(true);
                            class178 var76 = class201.method1356(var74, (byte) 120);
                            class195.field3432 = -1;
                            var76.field3038 = (var73 << 16) + var75;
                            return true;
                        } else if (~class195.field3432 == -127) {
                            int var77 = class229.field4077.method318(true);
                            int var78 = class229.field4077.method305(true);
                            class196 var79 = class229.field4077.method326(true);
                            class93.method571(21601, var78);
                            class180.method1179((byte) -84, var79, var77);
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -190) {
                            int var80 = class229.field4077.method347((byte) -88);
                            int var81 = class229.field4077.method311(0);
                            int var82 = class229.field4077.method313(65536);
                            class178 var83 = class201.method1356(var81, (byte) 90);
                            var83.field3150 = 0;
                            var83.field3151 = 0;
                            var83.field3042 = var83.field3155 = var82;
                            var83.field3105 = var83.field3013 = var80;
                            class214.method1472(-107, var83);
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 73) {
                            long var84 = class229.field4077.method319(18533);
                            int var86 = class229.field4077.method318(true);
                            byte var87 = class229.field4077.method350(16);
                            boolean var88 = false;
                            if ((var84 & Long.MIN_VALUE) != 0L) {
                                var88 = true;
                            }
                            if (!var88) {
                                class196 var89 = class229.field4077.method326(true);
                                class8 var90 = new class8();
                                var90.field1850 = var84;
                                var90.field85 = client.method627(var90.field1850, (byte) -128);
                                var90.field78 = var86;
                                var90.field86 = var87;
                                var90.field83 = var89;
                                int var91;
                                for (var91 = class103.field1485 + -1; ~var91 <= -1; --var91) {
                                    int var92 = class231.field4103[var91].field85.method1312(var90.field85, 1);
                                    if (var92 == 0) {
                                        class231.field4103[var91].field78 = var86;
                                        class231.field4103[var91].field86 = var87;
                                        class231.field4103[var91].field83 = var89;
                                        class229.field4080 = class92.field1341;
                                        class195.field3432 = -1;
                                        if (class22.field286 == var84) {
                                            class81.field1177 = var87;
                                        }
                                        return true;
                                    }
                                    if (var92 < 0) {
                                        break;
                                    }
                                }
                                if (class103.field1485 >= class231.field4103.length) {
                                    class195.field3432 = -1;
                                    return true;
                                }
                                for (int var93 = class103.field1485 + -1; var93 > var91; --var93) {
                                    class231.field4103[var93 - -1] = class231.field4103[var93];
                                }
                                if (class103.field1485 == 0) {
                                    class231.field4103 = new class8[100];
                                }
                                class231.field4103[var91 + 1] = var90;
                                if (class22.field286 == var84) {
                                    class81.field1177 = var87;
                                }
                                ++class103.field1485;
                            } else {
                                if (class103.field1485 == 0) {
                                    class195.field3432 = -1;
                                    return true;
                                }
                                long var94 = var84 & Long.MAX_VALUE;
                                boolean var96 = false;
                                int var97;
                                for (var97 = 0; ~var97 > ~class103.field1485 && (class231.field4103[var97].field1850 != var94 || ~class231.field4103[var97].field78 != ~var86); ++var97) {
                                }
                                if (var97 < class103.field1485) {
                                    while (~(class103.field1485 - 1) < ~var97) {
                                        class231.field4103[var97] = class231.field4103[var97 + 1];
                                        ++var97;
                                    }
                                    --class103.field1485;
                                    class231.field4103[class103.field1485] = null;
                                }
                            }
                            class229.field4080 = class92.field1341;
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 153) {
                            int var98 = class76.field1096 + class229.field4077.field699;
                            int var99 = class229.field4077.method318(true);
                            int var100 = class229.field4077.method318(true);
                            if (~class9.field103 != ~var99) {
                                class9.field103 = var99;
                                class10.method44(class9.field103, 96);
                                class159.method1003(88, false);
                                class158.method995(29288, class9.field103);
                                for (int var101 = 0; var101 < 100; ++var101) {
                                    class161.field2588[var101] = true;
                                }
                            }
                            while (var100-- > 0) {
                                int var110 = class229.field4077.method311(0);
                                int var111 = class229.field4077.method318(true);
                                int var112 = class229.field4077.method367(1);
                                class63 var113 = (class63) class101.field1445.method1551(32768, (long) var110);
                                if (var113 != null && var113.field864 != var111) {
                                    class72.method457(var113, true, (byte) -123);
                                    var113 = null;
                                }
                                if (var113 == null) {
                                    var113 = class45.method242(var112, 1, var110, var111);
                                }
                                var113.field868 = true;
                            }
                            for (class63 var102 = (class63) class101.field1445.method1554(6539); var102 != null; var102 = (class63) class101.field1445.method1547(342)) {
                                if (var102.field868) {
                                    var102.field868 = false;
                                } else {
                                    class72.method457(var102, true, (byte) -123);
                                }
                            }
                            class189.field3299.method1545(0);
                            while (var98 > class229.field4077.field699) {
                                int var103 = class229.field4077.method311(0);
                                int var104 = class229.field4077.method318(true);
                                int var105 = class229.field4077.method318(true);
                                int var106 = class229.field4077.method311(0);
                                for (int var107 = var104; var105 >= var107; ++var107) {
                                    long var108 = ((long) var103 << 32) + (long) var107;
                                    class189.field3299.method1552(new class206(var106), var108, 0);
                                }
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -180) {
                            int var114 = class229.field4077.method354(true);
                            int var115 = (32518 & var114) >> 10;
                            int var116 = class229.field4077.method311(0);
                            int var117 = 31 & var114 >> 5;
                            int var118 = var114 & 31;
                            class178 var119 = class201.method1356(var116, (byte) -23);
                            int var120 = (var118 << 3) + (var115 << 19) + (var117 << 11);
                            if (var119.field3009 != var120) {
                                var119.field3009 = var120;
                                class214.method1472(-126, var119);
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -146) {
                            class84.field1233 = class229.field4077.method354(true) * 30;
                            class195.field3432 = -1;
                            class151.field2423 = class92.field1341;
                            return true;
                        } else if (~class195.field3432 == -132) {
                            class12.field133 = 0;
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 166) {
                            int var121 = class229.field4077.method367(1);
                            int var122 = class229.field4077.method367(1);
                            int var123 = class229.field4077.method367(1);
                            int var124 = class229.field4077.method367(1);
                            int var125 = class229.field4077.method318(true);
                            class201.field3565[var121] = true;
                            class71.field1009[var121] = var122;
                            class90.field1324[var121] = var123;
                            class237.field4206[var121] = var124;
                            class194.field3415[var121] = var125;
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 203) {
                            class172.method1124(-430065760, false);
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -147) {
                            class196 var126 = class229.field4077.method326(true);
                            int var127 = class229.field4077.method367(1);
                            int var128 = class229.field4077.method343((byte) 109);
                            if (~var128 <= -2 && var128 <= 8) {
                                if (var126.method1320(false, class174.field2932)) {
                                    var126 = null;
                                }
                                class194.field3410[var128 + -1] = var126;
                                class229.field4081[var128 + -1] = var127 == 0;
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -105) {
                            int var129 = class229.field4077.method367(1);
                            int var130 = class229.field4077.method367(1);
                            int var131 = class229.field4077.method318(true);
                            int var132 = class229.field4077.method367(1);
                            int var133 = class229.field4077.method367(1);
                            class188.method1227((byte) -46, var133, var130, true, var132, var129, var131);
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 20) {
                            class182.method1193(-105);
                            int var134 = class229.field4077.method343((byte) -70);
                            int var135 = class229.field4077.method335(true);
                            int var136 = class229.field4077.method343((byte) -113);
                            class152.field2455[var136] = var135;
                            class104.field1511[var136] = var134;
                            class104.field1505[var136] = 1;
                            for (int var137 = 0; ~var137 > -99; ++var137) {
                                if (~var135 <= ~class177.field2986[var137]) {
                                    class104.field1505[var136] = var137 + 2;
                                }
                            }
                            class122.field1747[class65.method409(31, class166.field2744++)] = var136;
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -79) {
                            for (int var138 = 0; var138 < class215.field3873.length; ++var138) {
                                if (~class215.field3873[var138] != ~class214.field3823[var138]) {
                                    class215.field3873[var138] = class214.field3823[var138];
                                    class125.method771(29776, var138);
                                    class64.field885[class65.method409(class206.field3703++, 31)] = var138;
                                }
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 168) {
                            int var139 = class229.field4077.method367(1);
                            if (~class229.field4077.method367(1) == -1) {
                                class95.field1401[var139] = new class58();
                            } else {
                                --class229.field4077.field699;
                                class95.field1401[var139] = new class58(class229.field4077);
                            }
                            class209.field3758 = class92.field1341;
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -112) {
                            class196 var140 = class229.field4077.method326(true);
                            if (!var140.method1287(client.field1458, -1)) {
                                if (!var140.method1287(class235.field4176, -1)) {
                                    if (!var140.method1287(class225.field4039, -1)) {
                                        if (var140.method1287(class161.field2584, -1)) {
                                            class196 var141 = var140.method1290(var140.method1333(class161.field2584, 0), 13324, 0);
                                            class236.method1586(var141, 97, 11, class152.field2450);
                                        } else if (var140.method1287(class244.field4346, -1)) {
                                            class196 var142 = var140.method1290(var140.method1333(class244.field4346, 0), 13324, 0);
                                            if (~class1.field8 == -1) {
                                                class236.method1586(var142, 113, 12, class152.field2450);
                                            }
                                        } else if (!var140.method1287(class183.field3223, -1)) {
                                            if (!var140.method1287(class202.field3570, -1)) {
                                                if (!var140.method1287(class67.field958, -1)) {
                                                    if (!var140.method1287(class24.field301, -1)) {
                                                        class236.method1586(var140, 124, 0, class152.field2450);
                                                    } else {
                                                        class196 var143 = var140.method1290(var140.method1333(class5.field37, 0), 13324, 0);
                                                        long var144 = var143.method1330(0);
                                                        boolean var146 = false;
                                                        for (int var147 = 0; var147 < class211.field3796; ++var147) {
                                                            if (class116.field1680[var147] == var144) {
                                                                var146 = true;
                                                                break;
                                                            }
                                                        }
                                                        if (!var146 && class1.field8 == 0) {
                                                            class236.method1586(class152.field2450, 108, 16, var143);
                                                        }
                                                    }
                                                } else {
                                                    class196 var148 = var140.method1290(var140.method1333(class5.field37, 0), 13324, 0);
                                                    boolean var149 = false;
                                                    long var150 = var148.method1330(0);
                                                    for (int var152 = 0; var152 < class211.field3796; ++var152) {
                                                        if (~class116.field1680[var152] == ~var150) {
                                                            var149 = true;
                                                            break;
                                                        }
                                                    }
                                                    if (!var149 && class1.field8 == 0) {
                                                        class236.method1586(class152.field2450, 114, 15, var148);
                                                    }
                                                }
                                            } else {
                                                class196 var153 = var140.method1290(var140.method1333(class5.field37, 0), 13324, 0);
                                                boolean var154 = false;
                                                long var155 = var153.method1330(0);
                                                for (int var157 = 0; class211.field3796 > var157; ++var157) {
                                                    if (~class116.field1680[var157] == ~var155) {
                                                        var154 = true;
                                                        break;
                                                    }
                                                }
                                                if (!var154 && ~class1.field8 == -1) {
                                                    class236.method1586(class152.field2450, 101, 14, var153);
                                                }
                                            }
                                        } else {
                                            class196 var158 = var140.method1290(var140.method1333(class183.field3223, 0), 13324, 0);
                                            if (class1.field8 == 0) {
                                                class236.method1586(var158, 103, 13, class152.field2450);
                                            }
                                        }
                                    } else {
                                        class196 var159 = var140.method1290(var140.method1333(class5.field37, 0), 13324, 0);
                                        long var160 = var159.method1330(0);
                                        boolean var162 = false;
                                        for (int var163 = 0; var163 < class211.field3796; ++var163) {
                                            if (class116.field1680[var163] == var160) {
                                                var162 = true;
                                                break;
                                            }
                                        }
                                        if (!var162 && ~class1.field8 == -1) {
                                            class236.method1586(class152.field2450, 97, 10, var159);
                                        }
                                    }
                                } else {
                                    class196 var164 = var140.method1290(var140.method1333(class5.field37, 0), 13324, 0);
                                    long var165 = var164.method1330(0);
                                    boolean var167 = false;
                                    for (int var168 = 0; class211.field3796 > var168; ++var168) {
                                        if (~class116.field1680[var168] == ~var165) {
                                            var167 = true;
                                            break;
                                        }
                                    }
                                    if (!var167 && ~class1.field8 == -1) {
                                        class196 var169 = var140.method1290(-9 + var140.method1299(37), 13324, var140.method1333(class5.field37, 0) - -1);
                                        class236.method1586(var169, 125, 8, var164);
                                    }
                                }
                            } else {
                                class196 var170 = var140.method1290(var140.method1333(class5.field37, 0), 13324, 0);
                                long var171 = var170.method1330(0);
                                boolean var173 = false;
                                for (int var174 = 0; var174 < class211.field3796; ++var174) {
                                    if (class116.field1680[var174] == var171) {
                                        var173 = true;
                                        break;
                                    }
                                }
                                if (!var173 && class1.field8 == 0) {
                                    class236.method1586(class5.field44, 125, 4, var170);
                                }
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 88) {
                            int var175 = class229.field4077.method318(true);
                            int var176 = class229.field4077.method354(true);
                            class194.field3417 = var176;
                            class18.field216 = var175;
                            class231.method1549(3);
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -119) {
                            class182.method1193(-12);
                            class29.field366 = class229.field4077.method338((byte) -30);
                            class195.field3432 = -1;
                            class151.field2423 = class92.field1341;
                            return true;
                        } else if (class195.field3432 == 100) {
                            int var177 = class229.field4077.method311(0);
                            int var178 = class229.field4077.method305(true);
                            int var179 = class229.field4077.method315(74);
                            int var180 = class229.field4077.method354(true);
                            if (~(var177 >> 30) == -1) {
                                if (var177 >> 29 != 0) {
                                    int var181 = 65535 & var177;
                                    class164 var182 = class153.field2482[var181];
                                    if (var182 != null) {
                                        var182.field2059 = 0;
                                        var182.field2113 = var180;
                                        var182.field2090 = 0;
                                        var182.field2053 = var179;
                                        var182.field2072 = class171.field2879 - -var178;
                                        if (~var182.field2072 < ~class171.field2879) {
                                            var182.field2059 = -1;
                                        }
                                        if (~var182.field2113 == -65536) {
                                            var182.field2113 = -1;
                                        }
                                    }
                                } else if (~(var177 >> 28) != -1) {
                                    int var183 = var177 & 65535;
                                    class134 var184;
                                    if (class31.field395 == var183) {
                                        var184 = class102.field1477;
                                    } else {
                                        var184 = class247.field4397[var183];
                                    }
                                    if (var184 != null) {
                                        var184.field2090 = 0;
                                        var184.field2113 = var180;
                                        var184.field2053 = var179;
                                        var184.field2072 = class171.field2879 + var178;
                                        if (~var184.field2113 == -65536) {
                                            var184.field2113 = -1;
                                        }
                                        var184.field2059 = 0;
                                        if (var184.field2072 > class171.field2879) {
                                            var184.field2059 = -1;
                                        }
                                    }
                                }
                            } else {
                                int var185 = (var177 & 910597862) >> 28;
                                int var186 = (16383 & var177 >> 14) + -class106.field1523;
                                int var187 = (var177 & 16383) + -class178.field3011;
                                if (~var186 <= -1 && var187 >= 0 && ~var186 > -105 && ~var187 > -105) {
                                    int var188 = var187 * 128 + 64;
                                    int var189 = var186 * 128 + 64;
                                    class232 var190 = new class232(var180, var185, var189, var188, -var179 + class74.method470(var188, var185, 103, var189), var178, class171.field2879);
                                    class198.field3518.method1652(26532, new class169(var190));
                                }
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 76) {
                            int var191 = class229.field4077.method311(0);
                            int var192 = class229.field4077.method318(true);
                            if (var191 < -70000) {
                                var192 += 32768;
                            }
                            class178 var193;
                            if (~var191 > -1) {
                                var193 = null;
                            } else {
                                var193 = class201.method1356(var191, (byte) -47);
                            }
                            if (var193 != null) {
                                for (int var194 = 0; ~var194 > ~var193.field3045.length; ++var194) {
                                    var193.field3045[var194] = 0;
                                    var193.field2989[var194] = 0;
                                }
                            }
                            class91.method561(125, var192);
                            int var195 = class229.field4077.method318(true);
                            for (int var196 = 0; var195 > var196; ++var196) {
                                int var197 = class229.field4077.method315(123);
                                int var198 = class229.field4077.method343((byte) -56);
                                if (~var198 == -256) {
                                    var198 = class229.field4077.method311(0);
                                }
                                if (var193 != null && ~var196 > ~var193.field3045.length) {
                                    var193.field3045[var196] = var197;
                                    var193.field2989[var196] = var198;
                                }
                                class200.method1349(var198, var192, (byte) 84, var197 - 1, var196);
                            }
                            if (var193 != null) {
                                class214.method1472(-98, var193);
                            }
                            class182.method1193(111);
                            class96.field1415[class65.method409(class154.field2502++, 31)] = class65.method409(var192, 32767);
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 150) {
                            class69.field973 = class229.field4077.method343((byte) 113);
                            class110.field1570 = class229.field4077.method367(1);
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -152) {
                            byte[] var199 = new byte[class76.field1096];
                            class229.field4077.method1176(class76.field1096, 0, 0, var199);
                            class251.method1695(class16.method88(class76.field1096, 0, var199, 0), true, (byte) 82);
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 89) {
                            long var200 = class229.field4077.method319(18533);
                            class196 var202 = class190.method1254(class136.method839(42, class229.field4077).method1308(0));
                            class236.method1586(var202, 102, 6, client.method627(var200, (byte) -126).method1307(-123));
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -44) {
                            class41.method210(false);
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 27) {
                            int var203 = class229.field4077.method335(true);
                            class178 var204 = class201.method1356(var203, (byte) 85);
                            var204.field3073 = 3;
                            var204.field3094 = class102.field1477.field1916.method423(-1126);
                            class214.method1472(71, var204);
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 51) {
                            class159.method1002(126, class229.field4077.method326(true));
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -224) {
                            int var205 = class229.field4077.method311(0);
                            int var206 = class229.field4077.method318(true);
                            if (~var205 > 69999) {
                                var206 += 32768;
                            }
                            class178 var207;
                            if (~var205 <= -1) {
                                var207 = class201.method1356(var205, (byte) 71);
                            } else {
                                var207 = null;
                            }
                            while (~class229.field4077.field699 > ~class76.field1096) {
                                int var208 = class229.field4077.method307((byte) 73);
                                int var209 = class229.field4077.method318(true);
                                int var210 = 0;
                                if (var209 != 0) {
                                    var210 = class229.field4077.method367(1);
                                    if (~var210 == -256) {
                                        var210 = class229.field4077.method311(0);
                                    }
                                }
                                if (var207 != null && ~var208 <= -1 && var208 < var207.field3045.length) {
                                    var207.field3045[var208] = var209;
                                    var207.field2989[var208] = var210;
                                }
                                class200.method1349(var210, var206, (byte) 105, var209 + -1, var208);
                            }
                            if (var207 != null) {
                                class214.method1472(-61, var207);
                            }
                            class182.method1193(-75);
                            class96.field1415[class65.method409(31, class154.field2502++)] = class65.method409(32767, var206);
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 22) {
                            class7.method26((byte) 36);
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -95) {
                            class144.method895(0);
                            class195.field3432 = -1;
                            return false;
                        } else if (class195.field3432 == 178) {
                            int var211 = class229.field4077.method339(-111);
                            int var212 = class229.field4077.method315(82);
                            class178 var213 = class201.method1356(var211, (byte) -93);
                            if (var212 == 65535) {
                                var212 = -1;
                            }
                            if (var213.field3073 != 2 || ~var213.field3094 != ~var212) {
                                var213.field3073 = 2;
                                var213.field3094 = var212;
                                class214.method1472(88, var213);
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 215) {
                            int var214 = class229.field4077.method309((byte) 76);
                            int var215 = class229.field4077.method367(1);
                            int var216 = class229.field4077.method309((byte) 111);
                            class27.field335 = var216 >> 1;
                            class102.field1477.method859((var216 & 1) == 1, (byte) 112, var214, var215);
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 254) {
                            class156.field2510 = class229.field4077.method367(1);
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -234) {
                            int var217 = class229.field4077.method318(true);
                            int var218 = class229.field4077.method348((byte) -114);
                            class178 var219 = class201.method1356(var218, (byte) -79);
                            if (var219 != null && var219.field3123 == 0) {
                                if (-var219.field2997 + var219.field3056 < var217) {
                                    var217 = var219.field3056 - var219.field2997;
                                }
                                if (var217 < 0) {
                                    var217 = 0;
                                }
                                if (~var219.field2998 != ~var217) {
                                    var219.field2998 = var217;
                                    class214.method1472(62, var219);
                                }
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -243) {
                            if (class76.field1096 != 0) {
                                class245.field4358 = class229.field4077.method326(true);
                            } else {
                                class245.field4358 = class47.field560;
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -129) {
                            int var220 = class229.field4077.method309((byte) 114);
                            int var221 = class229.field4077.method305(true);
                            int var222 = class229.field4077.method315(111);
                            class93.method571(21601, var222);
                            class159.method1000(var221, -121, var220);
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -245) {
                            class113.method686(-24434);
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -241) {
                            int var223 = class229.field4077.method339(-122);
                            class57.field773 = class168.field2844.method1390(3, var223);
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -171) {
                            int var224 = class229.field4077.method335(true);
                            class196 var225 = class229.field4077.method326(true);
                            class178 var226 = class201.method1356(var224, (byte) -55);
                            if (!var225.method1326(var226.field3046, -1)) {
                                var226.field3046 = var225;
                                class214.method1472(105, var226);
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 84) {
                            int var227 = class229.field4077.method348((byte) -114);
                            int var228 = class229.field4077.method313(65536);
                            class178 var229 = class201.method1356(var227, (byte) -99);
                            if (var229.field3143 != var228 || var228 == -1) {
                                var229.field3025 = 0;
                                var229.field3074 = 0;
                                var229.field3143 = var228;
                                class214.method1472(95, var229);
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 90) {
                            int var230 = class229.field4077.method348((byte) -114);
                            int var231 = class229.field4077.method367(1);
                            int var232 = class229.field4077.method315(115);
                            class63 var233 = (class63) class101.field1445.method1551(32768, (long) var230);
                            if (var233 != null) {
                                class72.method457(var233, ~var233.field864 != ~var232, (byte) -118);
                            }
                            class45.method242(var231, 1, var230, var232);
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -62) {
                            int var234 = class229.field4077.method339(-114);
                            int var235 = class229.field4077.method354(true);
                            class101.method610(true, var234, var235);
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 4) {
                            int var236 = class229.field4077.method367(1);
                            class70 var237 = new class70();
                            int var238 = var236 >> 6;
                            var237.field983 = 63 & var236;
                            var237.field993 = class229.field4077.method367(1);
                            if (~var237.field993 <= -1 && class258.field4520.length > var237.field993) {
                                if (~var237.field983 != -2 && var237.field983 != 10) {
                                    if (var237.field983 >= 2 && ~var237.field983 >= -7) {
                                        if (~var237.field983 == -3) {
                                            var237.field991 = 64;
                                            var237.field976 = 64;
                                        }
                                        if (var237.field983 == 3) {
                                            var237.field976 = 0;
                                            var237.field991 = 64;
                                        }
                                        if (var237.field983 == 4) {
                                            var237.field976 = 128;
                                            var237.field991 = 64;
                                        }
                                        if (~var237.field983 == -6) {
                                            var237.field991 = 0;
                                            var237.field976 = 64;
                                        }
                                        if (~var237.field983 == -7) {
                                            var237.field991 = 128;
                                            var237.field976 = 64;
                                        }
                                        var237.field983 = 2;
                                        var237.field987 = class229.field4077.method318(true);
                                        var237.field982 = class229.field4077.method318(true);
                                        var237.field984 = class229.field4077.method367(1);
                                    }
                                } else {
                                    var237.field994 = class229.field4077.method318(true);
                                    class229.field4077.field699 += 3;
                                }
                                var237.field986 = class229.field4077.method318(true);
                                if (~var237.field986 == -65536) {
                                    var237.field986 = -1;
                                }
                                class214.field3834[var238] = var237;
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (~class195.field3432 == -71) {
                            class69.field973 = class229.field4077.method336((byte) -54);
                            class110.field1570 = class229.field4077.method336((byte) -65);
                            while (~class229.field4077.field699 > ~class76.field1096) {
                                class195.field3432 = class229.field4077.method367(1);
                                class242.method1647(-126);
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 217) {
                            class182.method1193(-31);
                            class84.field1235 = class229.field4077.method367(1);
                            class151.field2423 = class92.field1341;
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 141) {
                            int var239 = class229.field4077.method339(-120);
                            int var240 = 3 & var239 >> 28;
                            int var241 = (var239 & 268431673) >> 14;
                            int var242 = var239 & 16383;
                            int var243 = class229.field4077.method343((byte) -57);
                            int var244 = var243 >> 2;
                            int var245 = class125.field1771[var244];
                            int var246 = var243 & 3;
                            int var247 = class229.field4077.method315(73);
                            if (var247 == 65535) {
                                var247 = -1;
                            }
                            int var248 = var242 - class178.field3011;
                            int var249 = var241 - class106.field1523;
                            class109.method655(var249, -17258, var248, var246, var247, var245, var240, var244);
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 237) {
                            class172.method1124(-430065760, true);
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 248) {
                            int var250 = class229.field4077.method339(-124);
                            boolean var251 = ~class229.field4077.method336((byte) -24) == -2;
                            class178 var252 = class201.method1356(var250, (byte) -52);
                            if (var252.field3116 != var251) {
                                var252.field3116 = var251;
                                class214.method1472(62, var252);
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 123) {
                            class229.field4080 = class92.field1341;
                            long var253 = class229.field4077.method319(18533);
                            if (var253 == 0L) {
                                class195.field3432 = -1;
                                class62.field849 = null;
                                class103.field1485 = 0;
                                class103.field1484 = null;
                                class231.field4103 = null;
                                return true;
                            } else {
                                long var255 = class229.field4077.method319(18533);
                                class62.field849 = client.method627(var255, (byte) -125);
                                class103.field1484 = client.method627(var253, (byte) -128);
                                class154.field2491 = class229.field4077.method350(16);
                                int var257 = class229.field4077.method367(1);
                                if (~var257 == -256) {
                                    class195.field3432 = -1;
                                    return true;
                                } else {
                                    class103.field1485 = var257;
                                    class8[] var258 = new class8[100];
                                    for (int var259 = 0; var259 < class103.field1485; ++var259) {
                                        var258[var259] = new class8();
                                        var258[var259].field1850 = class229.field4077.method319(18533);
                                        var258[var259].field85 = client.method627(var258[var259].field1850, (byte) -126);
                                        var258[var259].field78 = class229.field4077.method318(true);
                                        var258[var259].field86 = class229.field4077.method350(16);
                                        var258[var259].field83 = class229.field4077.method326(true);
                                        if (~class22.field286 == ~var258[var259].field1850) {
                                            class81.field1177 = var258[var259].field86;
                                        }
                                    }
                                    boolean var260 = false;
                                    int var261 = class103.field1485;
                                    while (~var261 < -1) {
                                        boolean var262 = true;
                                        --var261;
                                        for (int var263 = 0; var261 > var263; ++var263) {
                                            if (var258[var263].field85.method1312(var258[var263 - -1].field85, 1) > 0) {
                                                var262 = false;
                                                class8 var264 = var258[var263];
                                                var258[var263] = var258[var263 - -1];
                                                var258[var263 + 1] = var264;
                                            }
                                        }
                                        if (var262) {
                                            break;
                                        }
                                    }
                                    class195.field3432 = -1;
                                    class231.field4103 = var258;
                                    return true;
                                }
                            }
                        } else if (class195.field3432 == 103) {
                            long var265 = class229.field4077.method319(18533);
                            long var267 = (long) class229.field4077.method318(true);
                            long var269 = (long) class229.field4077.method328(-1974);
                            long var271 = (var267 << 32) + var269;
                            int var273 = class229.field4077.method367(1);
                            int var274 = class229.field4077.method318(true);
                            boolean var275 = false;
                            int var276 = 0;
                            label1290: while (true) {
                                if (~var276 <= -101) {
                                    if (~var273 >= -2) {
                                        for (int var277 = 0; var277 < class211.field3796; ++var277) {
                                            if (class116.field1680[var277] == var265) {
                                                var275 = true;
                                                break label1290;
                                            }
                                        }
                                    }
                                    break;
                                }
                                if (~class61.field834[var276] == ~var271) {
                                    var275 = true;
                                    break;
                                }
                                ++var276;
                            }
                            if (!var275 && ~class1.field8 == -1) {
                                class61.field834[class67.field950] = var271;
                                class67.field950 = (class67.field950 + 1) % 100;
                                class196 var278 = class40.method207(var274, -104).method125(-28431, class229.field4077);
                                if (var273 != 2) {
                                    if (~var273 == -2) {
                                        class3.method10((class196) null, class93.method572(-125, new class196[] { class224.field4019, client.method627(var265, (byte) -128).method1307(-123) }), var274, var278, 99, 18);
                                    } else {
                                        class3.method10((class196) null, client.method627(var265, (byte) -125).method1307(-108), var274, var278, 99, 18);
                                    }
                                } else {
                                    class3.method10((class196) null, class93.method572(-82, new class196[] { class78.field1139, client.method627(var265, (byte) -127).method1307(-113) }), var274, var278, 99, 18);
                                }
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 207) {
                            int var279 = class229.field4077.method336((byte) 83);
                            int var280 = class229.field4077.method305(true);
                            int var281 = class229.field4077.method354(true);
                            class164 var282 = class153.field2482[var280];
                            if (var282 != null) {
                                class78.method490(var282, var281, var279, true);
                            }
                            class195.field3432 = -1;
                            return true;
                        } else if (class195.field3432 == 13) {
                            class174.field2929 = class229.field4077.method367(1);
                            class195.field3432 = -1;
                            class242.field4302 = class92.field1341;
                            return true;
                        } else if (class195.field3432 == 121) {
                            int var283 = class229.field4077.method305(true);
                            int var284 = class229.field4077.method343((byte) -78);
                            class101.method610(true, var284, var283);
                            class195.field3432 = -1;
                            return true;
                        } else {
                            if (arg0 >= -43) {
                                method1638((byte) -28);
                            }
                            if (~class195.field3432 == -19) {
                                long var285 = class229.field4077.method319(18533);
                                class229.field4077.method350(16);
                                long var287 = class229.field4077.method319(18533);
                                long var289 = (long) class229.field4077.method318(true);
                                long var291 = (long) class229.field4077.method328(-1974);
                                int var293 = class229.field4077.method367(1);
                                long var294 = (var289 << 32) + var291;
                                boolean var296 = false;
                                int var297 = 0;
                                label1319: while (true) {
                                    if (var297 >= 100) {
                                        if (var293 <= 1) {
                                            if (class33.field402 != 1 && class213.field3818 != 1) {
                                                for (int var298 = 0; var298 < class211.field3796; ++var298) {
                                                    if (class116.field1680[var298] == var285) {
                                                        var296 = true;
                                                        break label1319;
                                                    }
                                                }
                                            } else {
                                                var296 = true;
                                            }
                                        }
                                        break;
                                    }
                                    if (~class61.field834[var297] == ~var294) {
                                        var296 = true;
                                        break;
                                    }
                                    ++var297;
                                }
                                if (!var296 && ~class1.field8 == -1) {
                                    class61.field834[class67.field950] = var294;
                                    class67.field950 = (class67.field950 + 1) % 100;
                                    class196 var299 = class190.method1254(class136.method839(45, class229.field4077).method1308(0));
                                    if (var293 != 2 && var293 != 3) {
                                        if (var293 == 1) {
                                            class245.method1673(var299, class93.method572(-89, new class196[] { class224.field4019, client.method627(var285, (byte) -125).method1307(-108) }), 9, client.method627(var287, (byte) -125).method1307(-117), true);
                                        } else {
                                            class245.method1673(var299, client.method627(var285, (byte) -125).method1307(-107), 9, client.method627(var287, (byte) -126).method1307(-116), true);
                                        }
                                    } else {
                                        class245.method1673(var299, class93.method572(-122, new class196[] { class78.field1139, client.method627(var285, (byte) -128).method1307(-118) }), 9, client.method627(var287, (byte) -124).method1307(-106), true);
                                    }
                                }
                                class195.field3432 = -1;
                                return true;
                            } else if (class195.field3432 == 93) {
                                long var300 = class229.field4077.method319(18533);
                                class229.field4077.method350(16);
                                long var302 = class229.field4077.method319(18533);
                                long var304 = (long) class229.field4077.method318(true);
                                long var306 = (long) class229.field4077.method328(-1974);
                                long var308 = (var304 << 32) + var306;
                                int var310 = class229.field4077.method367(1);
                                boolean var311 = false;
                                int var312 = class229.field4077.method318(true);
                                int var313 = 0;
                                label1344: while (true) {
                                    if (var313 >= 100) {
                                        if (var310 <= 1) {
                                            for (int var314 = 0; var314 < class211.field3796; ++var314) {
                                                if (~class116.field1680[var314] == ~var300) {
                                                    var311 = true;
                                                    break label1344;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    if (class61.field834[var313] == var308) {
                                        var311 = true;
                                        break;
                                    }
                                    ++var313;
                                }
                                if (!var311 && class1.field8 == 0) {
                                    class61.field834[class67.field950] = var308;
                                    class67.field950 = (class67.field950 + 1) % 100;
                                    class196 var315 = class40.method207(var312, -101).method125(-28431, class229.field4077);
                                    if (var310 != 2 && var310 != 3) {
                                        if (var310 != 1) {
                                            class3.method10(client.method627(var302, (byte) -125).method1307(-100), client.method627(var300, (byte) -125).method1307(-101), var312, var315, 99, 20);
                                        } else {
                                            class3.method10(client.method627(var302, (byte) -128).method1307(-103), class93.method572(-64, new class196[] { class224.field4019, client.method627(var300, (byte) -124).method1307(-93) }), var312, var315, 99, 20);
                                        }
                                    } else {
                                        class3.method10(client.method627(var302, (byte) -128).method1307(-115), class93.method572(-119, new class196[] { class78.field1139, client.method627(var300, (byte) -125).method1307(-107) }), var312, var315, 99, 20);
                                    }
                                }
                                class195.field3432 = -1;
                                return true;
                            } else if (~class195.field3432 == -231) {
                                class196 var316 = class229.field4077.method326(true);
                                Object[] var317 = new Object[1 + var316.method1299(37)];
                                for (int var318 = var316.method1299(37) - 1; var318 >= 0; --var318) {
                                    if (~var316.method1335(var318, (byte) 33) == -116) {
                                        var317[var318 + 1] = class229.field4077.method326(true);
                                    } else {
                                        var317[var318 + 1] = new Integer(class229.field4077.method311(0));
                                    }
                                }
                                var317[0] = new Integer(class229.field4077.method311(0));
                                class157 var319 = new class157();
                                var319.field2534 = var317;
                                class88.method550(var319, -90);
                                class195.field3432 = -1;
                                return true;
                            } else if (class195.field3432 == 83) {
                                int var320 = class229.field4077.method318(true);
                                int var321 = class229.field4077.method339(-128);
                                class150.method944(true, var320, var321);
                                class195.field3432 = -1;
                                return true;
                            } else if (~class195.field3432 != -220) {
                                if (~class195.field3432 == -235) {
                                    long var341 = class229.field4077.method319(18533);
                                    int var343 = class229.field4077.method318(true);
                                    class196 var344 = class40.method207(var343, -127).method125(-28431, class229.field4077);
                                    class3.method10((class196) null, client.method627(var341, (byte) -124).method1307(-124), var343, var344, 99, 19);
                                    class195.field3432 = -1;
                                    return true;
                                } else if (~class195.field3432 == -227) {
                                    int var345 = class229.field4077.method354(true);
                                    class210.method1454(var345, 124);
                                    class96.field1415[class65.method409(31, class154.field2502++)] = class65.method409(var345, 32767);
                                    class195.field3432 = -1;
                                    return true;
                                } else if (class195.field3432 == 105) {
                                    int var346 = class229.field4077.method354(true);
                                    int var347 = class229.field4077.method335(true);
                                    int var348 = class229.field4077.method354(true);
                                    class93.method571(21601, var346);
                                    class159.method1000(var348, -85, var347);
                                    class195.field3432 = -1;
                                    return true;
                                } else {
                                    class165.method1054(35, "T1 - " + class195.field3432 + "," + class70.field979 + "," + class133.field1900 + " - " + class76.field1096, (Throwable) null);
                                    class144.method895(0);
                                    return true;
                                }
                            } else {
                                long var322 = class229.field4077.method319(18533);
                                boolean var324 = true;
                                int var325 = class229.field4077.method318(true);
                                int var326 = class229.field4077.method367(1);
                                class196 var327 = class152.field2450;
                                if (var322 < 0L) {
                                    var322 &= Long.MAX_VALUE;
                                    var324 = false;
                                }
                                if (var325 > 0) {
                                    var327 = class229.field4077.method326(true);
                                }
                                class196 var328 = client.method627(var322, (byte) -125).method1307(-127);
                                for (int var329 = 0; var329 < class156.field2514; ++var329) {
                                    if (~class91.field1333[var329] == ~var322) {
                                        if (~class52.field654[var329] != ~var325) {
                                            class52.field654[var329] = var325;
                                            if (~var325 < -1) {
                                                class236.method1586(class93.method572(-117, new class196[] { var328, class225.field4037 }), 119, 5, class152.field2450);
                                            }
                                            if (~var325 == -1) {
                                                class236.method1586(class93.method572(-122, new class196[] { var328, class106.field1526 }), 103, 5, class152.field2450);
                                            }
                                        }
                                        var328 = null;
                                        class28.field352[var329] = var327;
                                        class203.field3668[var329] = var326;
                                        class195.field3431[var329] = var324;
                                        break;
                                    }
                                }
                                if (var328 != null && ~class156.field2514 > -201) {
                                    class91.field1333[class156.field2514] = var322;
                                    class212.field3811[class156.field2514] = var328;
                                    class52.field654[class156.field2514] = var325;
                                    class28.field352[class156.field2514] = var327;
                                    class203.field3668[class156.field2514] = var326;
                                    class195.field3431[class156.field2514] = var324;
                                    ++class156.field2514;
                                }
                                class242.field4302 = class92.field1341;
                                boolean var330 = false;
                                int var331 = class156.field2514;
                                while (var331 > 0) {
                                    boolean var332 = true;
                                    --var331;
                                    for (int var333 = 0; var333 < var331; ++var333) {
                                        if (class52.field654[var333] != class158.field2549 && class52.field654[var333 - -1] == class158.field2549 || class52.field654[var333] == 0 && ~class52.field654[var333 - -1] != -1) {
                                            var332 = false;
                                            int var334 = class52.field654[var333];
                                            class52.field654[var333] = class52.field654[var333 + 1];
                                            class52.field654[var333 + 1] = var334;
                                            class196 var335 = class28.field352[var333];
                                            class28.field352[var333] = class28.field352[var333 + 1];
                                            class28.field352[var333 + 1] = var335;
                                            class196 var336 = class212.field3811[var333];
                                            class212.field3811[var333] = class212.field3811[var333 + 1];
                                            class212.field3811[var333 - -1] = var336;
                                            long var337 = class91.field1333[var333];
                                            class91.field1333[var333] = class91.field1333[var333 + 1];
                                            class91.field1333[var333 + 1] = var337;
                                            int var339 = class203.field3668[var333];
                                            class203.field3668[var333] = class203.field3668[var333 - -1];
                                            class203.field3668[var333 + 1] = var339;
                                            boolean var340 = class195.field3431[var333];
                                            class195.field3431[var333] = class195.field3431[var333 + 1];
                                            class195.field3431[var333 - -1] = var340;
                                        }
                                    }
                                    if (var332) {
                                        break;
                                    }
                                }
                                class195.field3432 = -1;
                                return true;
                            }
                        }
                    } else {
                        class242.method1647(-126);
                        class195.field3432 = -1;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            field4269 = -39;
        }
        ++field4268;
        int[] var3 = super.field1954.method110(arg0, 115);
        if (super.field1954.field244) {
            int var4 = class123.field1756[arg0];
            for (int var5 = 0; ~var5 > ~class131.field1862; ++var5) {
                int var6 = class82.field1189[var5];
                if (~this.field4265 > ~var6 && ~(-this.field4265 + 4096) < ~var6 && var4 > -this.field4265 + 2048 && ~var4 > ~(this.field4265 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4265);
                    var3[var5] = 4096 - var10;
                } else if (var6 > -this.field4265 + 2048 && var6 < this.field4265 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field4265;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field4265 + 2048);
                } else if (this.field4265 <= var4 && var4 <= -this.field4265 + 4096) {
                    if (~this.field4265 >= ~var6 && var6 <= -this.field4265 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field4265 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4265;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field4265 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(B)V")
    public static void method1638(byte arg0) {
        field4261 = null;
        if (arg0 <= -69) {
            field4267 = null;
            field4264 = null;
            field4270 = null;
        }
    }
}
