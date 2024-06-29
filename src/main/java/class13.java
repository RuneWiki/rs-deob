import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class13 extends class120 {

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "S")
    public static short field158 = 256;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "Lok;")
    public static class41 field160 = class137.method956("::clientdrop", 45);

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "Z")
    public static boolean field157 = false;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "Lok;")
    private static class41 field169 = class137.method956("Discard", 45);

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "Lok;")
    public static class41 field167 = field169;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "Lei;")
    public static class164 field163;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "Lmh;")
    public static class65 field170;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "[Lbc;")
    public static class302[] field162;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V", line = 5)
    public static void method54(byte arg0) {
        field170 = null;
        field162 = null;
        field163 = null;
        field169 = null;
        if (arg0 >= 115) {
            field160 = null;
            field167 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 20)
    public class13() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V", line = 24)
    public static final void method55(int arg0) {
        field171++;
        if (class116.field1679 == 248) {
            int var128 = class164.field2597.method792(2);
            int var129 = (var128 & 0x7) + class295.field4769;
            int var130 = class176.field2867 + ((var128 & 0x70) >> 4);
            int var131 = class164.field2597.method759((byte) -95);
            if (var131 == 65535) {
                var131 = -1;
            }
            int var132 = class164.field2597.method792(arg0 ^ 0x115D);
            int var133 = var132 & 0x7;
            int var134 = (var132 & 0xF2) >> 4;
            int var135 = class164.field2597.method792(2);
            if (var130 >= 0 && var129 >= 0 && var130 < 104 && var129 < 104) {
                int var136 = var134 + 1;
                if (class62.field913.field4341[0] >= (var130 - var136) && class62.field913.field4341[0] <= var130 + var136 && class62.field913.field4306[0] >= (var129 - var136) && (var129 + var136) >= class62.field913.field4306[0] && class225.field3606 != 0 && var133 > 0 && class41.field620 < 50 && var131 != -1) {
                    class18.field227[class41.field620] = var131;
                    class52.field784[class41.field620] = var133;
                    class38.field587[class41.field620] = var135;
                    class271.field4360[class41.field620] = null;
                    class38.field595[class41.field620] = (var129 << 8) + (var130 << 16) + var134;
                    class41.field620++;
                }
            }
        } else if (class116.field1679 == 10) {
            int var1 = class164.field2597.method793(-114);
            int var2 = var1 & 0x3;
            int var3 = var1 >> 2;
            int var4 = class310.field5229[var3];
            int var5 = class164.field2597.method793(arg0 - 4570);
            int var6 = (var5 >> 4 & 0x7) + class176.field2867;
            int var7 = (var5 & 0x7) + class295.field4769;
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                class91.method642(var7, var3, -1, var2, -1, 0, var4, var6, (byte) -102, class55.field807);
            }
        } else if (class116.field1679 == 196) {
            int var120 = class164.field2597.method810(arg0 ^ 0x79A6);
            int var121 = ((var120 & 0x7C) >> 4) + class176.field2867;
            int var122 = (var120 & 0x7) + class295.field4769;
            int var123 = class164.field2597.method775(-124);
            if (var123 == 65535) {
                var123 = -1;
            }
            int var124 = class164.field2597.method793(-93);
            int var125 = var124 & 0x3;
            int var126 = var124 >> 2;
            int var127 = class310.field5229[var126];
            class101.method708(var123, var126, var127, -7, class55.field807, var122, var121, var125);
        } else if (class116.field1679 == 253) {
            int var113 = class164.field2597.method775(109);
            int var114 = class164.field2597.method759((byte) -116);
            int var115 = class164.field2597.method815(arg0 - 4192);
            int var116 = (var115 & 0x7) + class295.field4769;
            int var117 = class176.field2867 + (var115 >> 4 & 0x7);
            int var118 = class164.field2597.method808(255);
            if (var117 >= 0 && var116 >= 0 && var117 < 104 && var116 < 104 && class204.field3300 != var118) {
                class204 var119 = new class204();
                var119.field3290 = var114;
                var119.field3288 = var113;
                if (class81.field1199[class55.field807][var117][var116] == null) {
                    class81.field1199[class55.field807][var117][var116] = new class212();
                }
                class81.field1199[class55.field807][var117][var116].method1503(new class295(var119), (byte) -109);
                class158.method1115((byte) 30, var116, var117);
            }
        } else if (class116.field1679 == 68) {
            int var104 = class164.field2597.method792(2);
            int var105 = ((var104 & 0x7C) >> 4) + class176.field2867;
            int var106 = (var104 & 0x7) + class295.field4769;
            int var107 = class164.field2597.method759((byte) -112);
            int var108 = class164.field2597.method759((byte) -94);
            int var109 = class164.field2597.method759((byte) -46);
            if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                class212 var110 = class81.field1199[class55.field807][var105][var106];
                if (var110 != null) {
                    for (class295 var111 = (class295) var110.method1495(arg0 ^ 0xFFFFEF97); var111 != null; var111 = (class295) var110.method1501(88)) {
                        class204 var112 = var111.field4772;
                        if ((var107 & 0x7FFF) == var112.field3290 && var112.field3288 == var108) {
                            var112.field3288 = var109;
                            break;
                        }
                    }
                    class158.method1115((byte) 30, var106, var105);
                }
            }
        } else {
            if (class116.field1679 == 233) {
                int var8 = class164.field2597.method798((byte) 100);
                byte var9 = class164.field2597.method799(64);
                int var10 = class164.field2597.method810(26873);
                int var11 = var10 >> 2;
                int var12 = class310.field5229[var11];
                int var13 = var10 & 0x3;
                int var14 = class164.field2597.method808(255);
                byte var15 = class164.field2597.method799(64);
                int var16 = class164.field2597.method810(26873);
                int var17 = (var16 & 0x7) + class295.field4769;
                int var18 = (var16 >> 4 & 0x7) + class176.field2867;
                int var19 = class164.field2597.method775(arg0 - 4568);
                int var20 = class164.field2597.method759((byte) -99);
                byte var21 = class164.field2597.method799(64);
                byte var22 = class164.field2597.method764(arg0 ^ 0x112C);
                class245 var23;
                if (class204.field3300 == var20) {
                    var23 = class62.field913;
                } else {
                    var23 = class246.field3955[var20];
                }
                if (!class166.field2625 && var23 != null) {
                    class171 var24 = class234.method1684(-2441, var8);
                    int var25;
                    int var26;
                    if (var13 == 1 || var13 == 3) {
                        var25 = var24.field2752;
                        var26 = var24.field2784;
                    } else {
                        var25 = var24.field2784;
                        var26 = var24.field2752;
                    }
                    int var27 = (var26 >> 1) + var18;
                    int var28 = (var26 + 1 >> 1) + var18;
                    int var29 = (var25 >> 1) + var17;
                    int var30 = var17 + (var25 + 1 >> 1);
                    int[][] var31 = (int[][]) null;
                    int[][] var32 = class278.field4548[class55.field807];
                    if (class55.field807 < 3) {
                        var31 = class278.field4548[class55.field807 + 1];
                    }
                    int var33 = var32[var27][var30] + var32[var28][var29] + var32[var27][var29] + var32[var28][var30] >> 2;
                    int var34 = (var17 << 7) + (var25 << 6);
                    int var35 = (var18 << 7) + (var26 << 6);
                    class175 var36 = var24.method1231((class279) null, false, var13, var32, var34, var24.field2781, arg0 - 669, var35, var33, var31, var11);
                    if (var36 != null) {
                        class91.method642(var17, 0, var14 + 1, 0, -1, var19 + 1, var12, var18, (byte) -98, class55.field807);
                        var23.field3932 = var33;
                        var23.field3907 = (class287) var36.field2846;
                        var23.field3926 = class18.field234 + var14;
                        if (var9 < var15) {
                            byte var37 = var15;
                            var15 = var9;
                            var9 = var37;
                        }
                        var23.field3944 = var19 + class18.field234;
                        var23.field3919 = var17 * 128 + var25 * 64;
                        var23.field3947 = var15 + var18;
                        var23.field3931 = var18 + var9;
                        if (var22 < var21) {
                            byte var38 = var21;
                            var21 = var22;
                            var22 = var38;
                        }
                        var23.field3912 = var17 + var21;
                        var23.field3906 = var17 + var22;
                        var23.field3901 = var18 * 128 + var26 * 64;
                    }
                }
            }
            if (class116.field1679 == 38) {
                int var39 = class164.field2597.method792(2);
                int var40 = (var39 & 0x7) + class295.field4769;
                int var41 = (var39 >> 4 & 0x7) + class176.field2867;
                int var42 = var41 + class164.field2597.method785((byte) -114);
                int var43 = class164.field2597.method785((byte) -102) + var40;
                int var44 = class164.field2597.method771(-124);
                int var45 = class164.field2597.method759((byte) -49);
                int var46 = class164.field2597.method792(2) * 4;
                int var47 = class164.field2597.method792(2) * 4;
                int var48 = class164.field2597.method759((byte) -53);
                int var49 = class164.field2597.method759((byte) -85);
                int var50 = class164.field2597.method792(arg0 ^ 0x115D);
                int var51 = class164.field2597.method792(2);
                if (var41 >= 0 && var40 >= 0 && var41 < 104 && var40 < 104 && var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104 && var45 != 65535) {
                    int var52 = var42 * 128 + 64;
                    int var53 = var43 * 128 + 64;
                    int var54 = var41 * 128 + 64;
                    int var55 = var40 * 128 + 64;
                    class160 var56 = new class160(var45, class55.field807, var54, var55, class140.method983((byte) -79, class55.field807, var54, var55) - var46, class18.field234 + var48, class18.field234 + var49, var50, var51, var44, var47);
                    var56.method1131(class18.field234 + var48, var53, 1, class140.method983((byte) -94, class55.field807, var52, var53) - var47, var52);
                    class199.field3196.method1503(new class35(var56), (byte) -117);
                }
            } else {
                if (arg0 != 4447) {
                    field160 = (class41) null;
                }
                if (class116.field1679 == 134) {
                    int var57 = class164.field2597.method792(arg0 - 4445);
                    int var58 = (var57 & 0xF) + class295.field4769 * 2;
                    int var59 = class176.field2867 * 2 + (var57 >> 4 & 0xF);
                    int var60 = var59 + class164.field2597.method785((byte) -128);
                    int var61 = var58 + class164.field2597.method785((byte) -106);
                    int var62 = class164.field2597.method771(-108);
                    int var63 = class164.field2597.method759((byte) -54);
                    int var64 = class164.field2597.method792(2) * 4;
                    int var65 = class164.field2597.method792(2) * 4;
                    int var66 = class164.field2597.method759((byte) -40);
                    int var67 = class164.field2597.method759((byte) -107);
                    int var68 = class164.field2597.method792(2);
                    int var69 = class164.field2597.method792(arg0 ^ 0x115D);
                    if (var59 >= 0 && var58 >= 0 && var59 < 208 && var58 < 208 && var60 >= 0 && var61 >= 0 && var60 < 208 && var61 < 208 && var63 != 65535) {
                        int var70 = var61 * 64;
                        int var71 = var60 * 64;
                        int var72 = var58 * 64;
                        int var73 = var59 * 64;
                        class160 var74 = new class160(var63, class55.field807, var73, var72, class140.method983((byte) 51, class55.field807, var73, var72) - var64, var66 - -class18.field234, class18.field234 + var67, var68, var69, var62, var65);
                        var74.method1131(var66 + class18.field234, var70, arg0 - 4446, class140.method983((byte) 77, class55.field807, var71, var70) + -var65, var71);
                        class199.field3196.method1503(new class35(var74), (byte) -69);
                    }
                } else if (class116.field1679 == 127) {
                    int var75 = class164.field2597.method810(26873);
                    int var76 = (var75 & 0x7) + class295.field4769;
                    int var77 = (var75 >> 4 & 0x7) + class176.field2867;
                    int var78 = class164.field2597.method759((byte) -52);
                    int var79 = class164.field2597.method798((byte) -128);
                    if (var77 >= 0 && var76 >= 0 && var77 < 104 && var76 < 104) {
                        class204 var80 = new class204();
                        var80.field3288 = var79;
                        var80.field3290 = var78;
                        if (class81.field1199[class55.field807][var77][var76] == null) {
                            class81.field1199[class55.field807][var77][var76] = new class212();
                        }
                        class81.field1199[class55.field807][var77][var76].method1503(new class295(var80), (byte) -121);
                        class158.method1115((byte) 30, var76, var77);
                    }
                } else if (class116.field1679 == 43) {
                    int var96 = class164.field2597.method810(26873);
                    int var97 = ((var96 & 0x74) >> 4) + class176.field2867;
                    int var98 = (var96 & 0x7) + class295.field4769;
                    int var99 = class164.field2597.method792(2);
                    int var100 = var99 >> 2;
                    int var101 = var99 & 0x3;
                    int var102 = class310.field5229[var100];
                    int var103 = class164.field2597.method808(arg0 - 4192);
                    if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                        class91.method642(var98, var100, -1, var101, var103, 0, var102, var97, (byte) -72, class55.field807);
                    }
                } else if (class116.field1679 == 135) {
                    int var87 = class164.field2597.method792(arg0 ^ 0x115D);
                    int var88 = ((var87 & 0x74) >> 4) + class176.field2867;
                    int var89 = (var87 & 0x7) + class295.field4769;
                    int var90 = class164.field2597.method759((byte) -57);
                    int var91 = class164.field2597.method792(2);
                    int var92 = class164.field2597.method759((byte) -54);
                    if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                        int var93 = var89 * 128 + 64;
                        int var94 = var88 * 128 + 64;
                        class311 var95 = new class311(var90, class55.field807, var94, var93, class140.method983((byte) 68, class55.field807, var94, var93) - var91, var92, class18.field234);
                        class290.field4703.method1503(new class66(var95), (byte) -109);
                    }
                } else if (class116.field1679 == 187) {
                    int var81 = class164.field2597.method815(255);
                    int var82 = (var81 & 0x7) + class295.field4769;
                    int var83 = ((var81 & 0x72) >> 4) + class176.field2867;
                    int var84 = class164.field2597.method775(arg0 ^ 0xFFFFEEDD);
                    if (var83 >= 0 && var82 >= 0 && var83 < 104 && var82 < 104) {
                        class212 var85 = class81.field1199[class55.field807][var83][var82];
                        if (var85 != null) {
                            for (class295 var86 = (class295) var85.method1495(arg0 - 4759); var86 != null; var86 = (class295) var85.method1501(-121)) {
                                if ((var84 & 0x7FFF) == var86.field4772.field3290) {
                                    var86.method418(6971);
                                    break;
                                }
                            }
                            if (var85.method1495(-312) == null) {
                                class81.field1199[class55.field807][var83][var82] = null;
                            }
                            class158.method1115((byte) 30, var82, var83);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)I", line = 565)
    public static final int method56(int arg0, byte arg1) {
        field165++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            if (arg1 != 35) {
                field167 = (class41) null;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)I", line = 591)
    public static final int method57(int arg0) {
        if (arg0 != 6714) {
            field162 = (class302[]) null;
        }
        field173++;
        return ((class225.field3606 == 0 ? 0 : 1) << 22) + ((class1.field3 == 0 ? 0 : 1) << 20) + ((class235.field3760 ? 1 : 0) << 19) + ((class285.field4641 & 0x3) << 17) + ((class27.field393 ? 1 : 0) << 15) + ((class66.field1006 ? 1 : 0) << 13) + ((class152.field2419 & 0x3) << 11) + ((class14.field181 ? 1 : 0) << 8) + ((class296.field4778 ? 1 : 0) << 5) + ((class33.field499 ? 1 : 0) << 4) + ((class198.field3178 ? 1 : 0) << 3) + (class262.field4171 & 0x7) + ((class81.field1200 ? 1 : 0) << 6) - (-((class207.field3359 ? 1 : 0) << 7) - ((class241.field3863 ? 1 : 0) << 9) - ((class46.field722 ? 1 : 0) << 10) - (((class296.field4787 ? 1 : 0) << 16) - -((class244.field3900 == 0 ? 0 : 1) << 21)));
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V", line = 603)
    public static final void method58(int arg0) {
        if (arg0 != -4) {
            field157 = false;
        }
        class281.field4568 = true;
        field166++;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V", line = 621)
    public static final void method59(boolean arg0) {
        if (arg0) {
            method54((byte) 54);
        }
        field164++;
        while (class164.field2597.method848(class1.field7, -39) >= 11) {
            int var1 = class164.field2597.method849(11, 38);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class246.field3955[var1] == null) {
                class246.field3955[var1] = new class245();
                var2 = true;
                if (class50.field766[var1] != null) {
                    class246.field3955[var1].method1754(class50.field766[var1], (byte) 89);
                }
            }
            class118.field1737[class85.field1248++] = var1;
            class245 var3 = class246.field3955[var1];
            var3.field4294 = class18.field234;
            int var4 = class164.field2597.method849(1, 38);
            int var5 = class164.field2597.method849(5, 38);
            int var6 = class164.field2597.method849(5, 38);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class234.field3747[class164.field2597.method849(3, 38)];
            if (var2) {
                var3.field4332 = var3.field4297 = var7;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            int var8 = class164.field2597.method849(1, 38);
            if (var8 == 1) {
                class241.field3853[class85.field1239++] = var1;
            }
            var3.method1756(class62.field913.field4341[0] + var6, class62.field913.field4306[0] + var5, var4 == 1, -1);
        }
        class164.field2597.method841((byte) 90);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I", line = 688)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            method56(-37, (byte) -28);
        }
        field168++;
        return class203.field3278;
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V", line = 709)
    public static final void method60(int arg0) {
        if (arg0 != -1) {
            field170 = (class65) null;
        }
        field172++;
        class32.field466.method131(-2);
        class28.field418.method131(-2);
        class144.field2197.method131(-2);
    }
}
