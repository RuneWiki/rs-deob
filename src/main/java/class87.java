import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class87 {

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    private int field1679 = 0;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    private int field1680 = -1;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lsf;")
    private class33 field1681 = new class33();

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "Z")
    public boolean field1692 = false;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "[[[I")
    private int[][][] field1683;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "[Lja;")
    private class89[] field1690;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field1675 = 0;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1673 = 0;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[Lia;")
    public static class257[] field1689 = new class257[100];

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[[I")
    public static int[][] field1686 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "[[B")
    public static byte[][] field1691 = new byte[50][];

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lie;")
    public static class117 field1678 = new class117(64);

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Lia;")
    public static class257 field1693 = class28.method234(123, "0(U");

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "Z")
    public static boolean field1695 = false;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field1694 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lp;IIII)V")
    public static final void method647(class233 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1684++;
        for (class103 var5 = (class103) class174.field2979.method288(26111); var5 != null; var5 = (class103) class174.field2979.method277(1)) {
            if (var5.field1931 == arg3 && (arg1 * 128) == var5.field1912 && arg2 * 128 == var5.field1932 && var5.field1930.field4019 == arg0.field4019) {
                if (var5.field1913 != null) {
                    class78.field1504.method459(var5.field1913);
                    var5.field1913 = null;
                }
                if (var5.field1925 != null) {
                    class78.field1504.method459(var5.field1925);
                    var5.field1925 = null;
                }
                var5.method254(1);
                return;
            }
        }
        if (arg4 >= -63) {
            method655(-69, 110, 33);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lme;Lia;B)Lia;")
    public static final class257 method648(class44 arg0, class257 arg1, byte arg2) {
        if (arg1.method1683(false, class200.field3415) != -1) {
            label62: while (true) {
                int var3 = arg1.method1683(false, class231.field3886);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method1683(false, class50.field1107);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method1683(false, class239.field4117);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method1683(false, class90.field1723);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method1683(false, class205.field3517);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method1683(false, class24.field456);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class257 var9 = class17.field378;
                                                        if (class75.field1455 != null) {
                                                            var9 = class46.method361(class75.field1455.field2998, true);
                                                            try {
                                                                if (class75.field1455.field3001 != null) {
                                                                    byte[] var10 = ((String) class75.field1455.field3001).getBytes("ISO-8859-1");
                                                                    var9 = class55.method422(-29067, var10.length, 0, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class233.method1528(new class257[] { arg1.method1713(48, 0, var8), var9, arg1.method1674(var8 + 4, 255) }, arg2 + 57);
                                                    }
                                                }
                                                arg1 = class233.method1528(new class257[] { arg1.method1713(48, 0, var7), class31.method261(class183.method1250(0, arg0, 4), (byte) 108), arg1.method1674(var7 + 2, 255) }, 0);
                                            }
                                        }
                                        arg1 = class233.method1528(new class257[] { arg1.method1713(48, 0, var6), class31.method261(class183.method1250(0, arg0, 3), (byte) 114), arg1.method1674(var6 + 2, 255) }, 0);
                                    }
                                }
                                arg1 = class233.method1528(new class257[] { arg1.method1713(48, 0, var5), class31.method261(class183.method1250(0, arg0, 2), (byte) 118), arg1.method1674(var5 + 2, 255) }, 0);
                            }
                        }
                        arg1 = class233.method1528(new class257[] { arg1.method1713(48, 0, var4), class31.method261(class183.method1250(0, arg0, 1), (byte) 126), arg1.method1674(var4 + 2, 255) }, arg2 + 57);
                    }
                }
                arg1 = class233.method1528(new class257[] { arg1.method1713(48, 0, var3), class31.method261(class183.method1250(0, arg0, 0), (byte) 112), arg1.method1674(var3 + 2, 255) }, 0);
            }
        }
        if (arg2 == -57) {
            field1687++;
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method649(int arg0, boolean arg1) {
        if (!arg1) {
            field1678 = null;
        }
        field1672++;
        if (this.field1688 == this.field1676) {
            this.field1692 = this.field1690[arg0] == null;
            this.field1690[arg0] = class17.field379;
            return this.field1683[arg0];
        } else if (this.field1688 == 1) {
            this.field1692 = this.field1680 != arg0;
            this.field1680 = arg0;
            return this.field1683[0];
        } else {
            class89 var3 = this.field1690[arg0];
            if (var3 == null) {
                this.field1692 = true;
                if (this.field1679 < this.field1688) {
                    var3 = new class89(arg0, this.field1679);
                    this.field1679++;
                } else {
                    class89 var4 = (class89) this.field1681.method280((byte) -57);
                    var3 = new class89(arg0, var4.field1705);
                    this.field1690[var4.field1700] = null;
                    var4.method254(1);
                }
                this.field1690[arg0] = var3;
            } else {
                this.field1692 = false;
            }
            this.field1681.method284(var3, 27886);
            return this.field1683[var3.field1705];
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public static void method650(boolean arg0) {
        field1693 = null;
        field1686 = null;
        field1689 = null;
        if (!arg0) {
            method653(-92, 38, 90);
        }
        field1678 = null;
        field1691 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V")
    public static final void method651(boolean arg0) {
        field1674++;
        if (class115.field2066 == 80) {
            int var1 = class40.field827.method1051((byte) -73);
            int var2 = (var1 >> 4 & 0x7) + class144.field2523;
            int var3 = (var1 & 0x7) + class20.field417;
            int var4 = class40.field827.method1063(-17162);
            int var5 = class40.field827.method1063(-17162);
            int var6 = class40.field827.method1063(-17162);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class33 var7 = class78.field1499[class189.field3261][var2][var3];
                if (var7 != null) {
                    for (class112 var8 = (class112) var7.method288(26111); var8 != null; var8 = (class112) var7.method277(1)) {
                        class1 var9 = var8.field2043;
                        if ((var4 & 0x7FFF) == var9.field3 && var9.field10 == var5) {
                            var9.field10 = var6;
                            break;
                        }
                    }
                    class10.method117(var3, var2, 4);
                }
            }
        } else if (class115.field2066 == 29) {
            int var10 = class40.field827.method1051((byte) -72);
            int var11 = (var10 & 0x7) + class20.field417;
            int var12 = ((var10 & 0x71) >> 4) + class144.field2523;
            int var13 = class40.field827.method1063(-17162);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class40.field827.method1051((byte) 123);
            int var15 = var14 & 0x7;
            int var16 = var14 >> 4 & 0xF;
            int var17 = class40.field827.method1051((byte) -35);
            if (var12 >= 0 && var11 >= 0 && var12 < 104 && var11 < 104) {
                int var18 = var16 + 1;
                if (var12 - var18 <= class137.field2441.field4182[0] && var12 + var18 >= class137.field2441.field4182[0] && var11 - var18 <= class137.field2441.field4119[0] && class137.field2441.field4119[0] <= var11 + var18 && class99.field1830 != 0 && var15 > 0 && class238.field4063 < 50 && var13 != -1) {
                    class40.field832[class238.field4063] = var13;
                    class108.field2023[class238.field4063] = var15;
                    class99.field1822[class238.field4063] = var17;
                    class9.field181[class238.field4063] = null;
                    class35.field709[class238.field4063] = (var12 << 16) + (var11 << 8) + var16;
                    class238.field4063++;
                }
            }
        } else if (class115.field2066 == 224) {
            int var19 = class40.field827.method1021((byte) 57);
            int var20 = (var19 >> 4 & 0x7) + class144.field2523;
            int var21 = (var19 & 0x7) + class20.field417;
            int var22 = class40.field827.method1041((byte) 108);
            int var23 = class40.field827.method1045((byte) 125);
            int var24 = var23 >> 2;
            int var25 = var23 & 0x3;
            int var26 = class1.field14[var24];
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                class70.method531(var24, (byte) -103, var20, -1, var21, class189.field3261, var26, 0, var22, var25);
            }
        } else {
            if (arg0) {
                field1689 = null;
            }
            if (class115.field2066 == 66) {
                int var27 = class40.field827.method1051((byte) -110);
                int var28 = var27 >> 2;
                int var29 = class1.field14[var28];
                int var30 = var27 & 0x3;
                int var31 = class40.field827.method1021((byte) 113);
                int var32 = ((var31 & 0x7D) >> 4) + class144.field2523;
                int var33 = (var31 & 0x7) + class20.field417;
                if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                    class70.method531(var28, (byte) 121, var32, -1, var33, class189.field3261, var29, 0, -1, var30);
                }
            } else if (class115.field2066 == 36) {
                int var34 = class40.field827.method1051((byte) 125);
                int var35 = class20.field417 + (var34 & 0x7);
                int var36 = class144.field2523 + ((var34 & 0x7A) >> 4);
                int var37 = class40.field827.method1063(-17162);
                int var38 = class40.field827.method1051((byte) -51);
                int var39 = class40.field827.method1063(-17162);
                if (var36 >= 0 && var35 >= 0 && var36 < 104 && var35 < 104) {
                    int var40 = var36 * 128 + 64;
                    int var41 = var35 * 128 + 64;
                    class74 var42 = new class74(var37, class189.field3261, var40, var41, class109.method803(class189.field3261, var41, (byte) -57, var40) - var38, var39, class7.field153);
                    class245.field4257.method287(new class118(var42), 0);
                }
            } else if (class115.field2066 == 254) {
                int var43 = class40.field827.method1051((byte) -88);
                int var44 = (var43 & 0xF) + class20.field417 * 2;
                int var45 = class144.field2523 * 2 + ((var43 & 0xF1) >> 4);
                int var46 = class40.field827.method1060((byte) -58) + var45;
                int var47 = var44 + class40.field827.method1060((byte) -58);
                int var48 = class40.field827.method1075(-7903);
                int var49 = class40.field827.method1063(-17162);
                int var50 = class40.field827.method1051((byte) -120) * 4;
                int var51 = class40.field827.method1051((byte) 105) * 4;
                int var52 = class40.field827.method1063(-17162);
                int var53 = class40.field827.method1063(-17162);
                int var54 = class40.field827.method1051((byte) 85);
                int var55 = class40.field827.method1051((byte) -116);
                if (var45 >= 0 && var44 >= 0 && var45 < 208 && var44 < 208 && var46 >= 0 && var47 >= 0 && var46 < 208 && var47 < 208 && var49 != 65535) {
                    int var56 = var44 * 64;
                    int var57 = var46 * 64;
                    int var58 = var47 * 64;
                    int var59 = var45 * 64;
                    class40 var60 = new class40(var49, class189.field3261, var59, var56, class109.method803(class189.field3261, var56, (byte) -93, var59) - var50, var52 - -class7.field153, var53 + class7.field153, var54, var55, var48, var51);
                    var60.method325(class109.method803(class189.field3261, var58, (byte) -66, var57) - var51, class7.field153 + var52, var57, var58, (byte) -60);
                    class28.field543.method287(new class42(var60), 0);
                }
            } else if (class115.field2066 == 21) {
                int var61 = class40.field827.method1021((byte) -120);
                int var62 = (var61 >> 4 & 0x7) + class144.field2523;
                int var63 = (var61 & 0x7) + class20.field417;
                int var64 = class40.field827.method1051((byte) -84);
                int var65 = var64 >> 2;
                int var66 = class1.field14[var65];
                int var67 = var64 & 0x3;
                int var68 = class40.field827.method1041((byte) 95);
                if (var68 == 65535) {
                    var68 = -1;
                }
                class55.method421(var67, var66, var65, var68, 0, var62, class189.field3261, var63);
            } else if (class115.field2066 == 55) {
                int var69 = class40.field827.method1041((byte) 89);
                int var70 = class40.field827.method1051((byte) 106);
                int var71 = class144.field2523 + ((var70 & 0x78) >> 4);
                int var72 = (var70 & 0x7) + class20.field417;
                if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                    class33 var73 = class78.field1499[class189.field3261][var71][var72];
                    if (var73 != null) {
                        for (class112 var74 = (class112) var73.method288(26111); var74 != null; var74 = (class112) var73.method277(1)) {
                            if ((var69 & 0x7FFF) == var74.field2043.field3) {
                                var74.method254(1);
                                break;
                            }
                        }
                        if (var73.method288(26111) == null) {
                            class78.field1499[class189.field3261][var71][var72] = null;
                        }
                        class10.method117(var72, var71, 4);
                    }
                }
            } else if (class115.field2066 == 34) {
                int var75 = class40.field827.method1052(false);
                int var76 = class40.field827.method1052(false);
                int var77 = class40.field827.method1045((byte) 123);
                int var78 = (var77 & 0x7) + class20.field417;
                int var79 = (var77 >> 4 & 0x7) + class144.field2523;
                if (var79 >= 0 && var78 >= 0 && var79 < 104 && var78 < 104) {
                    class1 var80 = new class1();
                    var80.field10 = var76;
                    var80.field3 = var75;
                    if (class78.field1499[class189.field3261][var79][var78] == null) {
                        class78.field1499[class189.field3261][var79][var78] = new class33();
                    }
                    class78.field1499[class189.field3261][var79][var78].method287(new class112(var80), 0);
                    class10.method117(var78, var79, 4);
                }
            } else if (class115.field2066 == 170) {
                int var81 = class40.field827.method1029(25925);
                int var82 = (var81 & 0x7) + class20.field417;
                int var83 = (var81 >> 4 & 0x7) + class144.field2523;
                int var84 = class40.field827.method1067(515473640);
                int var85 = class40.field827.method1067(515473640);
                int var86 = class40.field827.method1041((byte) 109);
                if (var83 >= 0 && var82 >= 0 && var83 < 104 && var82 < 104 && class173.field2958 != var84) {
                    class1 var87 = new class1();
                    var87.field10 = var86;
                    var87.field3 = var85;
                    if (class78.field1499[class189.field3261][var83][var82] == null) {
                        class78.field1499[class189.field3261][var83][var82] = new class33();
                    }
                    class78.field1499[class189.field3261][var83][var82].method287(new class112(var87), 0);
                    class10.method117(var82, var83, 4);
                }
            } else {
                if (class115.field2066 == 203) {
                    int var88 = class40.field827.method1029(25925);
                    int var89 = var88 >> 2;
                    int var90 = var88 & 0x3;
                    int var91 = class1.field14[var89];
                    byte var92 = class40.field827.method1058(!arg0);
                    int var93 = class40.field827.method1041((byte) 121);
                    int var94 = class40.field827.method1067(515473640);
                    byte var95 = class40.field827.method1035(0);
                    int var96 = class40.field827.method1045((byte) 112);
                    int var97 = class20.field417 + (var96 & 0x7);
                    int var98 = (var96 >> 4 & 0x7) + class144.field2523;
                    int var99 = class40.field827.method1063(-17162);
                    byte var100 = class40.field827.method1035(0);
                    byte var101 = class40.field827.method1060((byte) -58);
                    int var102 = class40.field827.method1063(-17162);
                    class180 var103;
                    if (class173.field2958 == var102) {
                        var103 = class137.field2441;
                    } else {
                        var103 = class55.field1180[var102];
                    }
                    if (var103 != null) {
                        class233 var104 = class5.method96(var93, false);
                        int var105;
                        int var106;
                        if (var90 == 1 || var90 == 3) {
                            var106 = var104.field3986;
                            var105 = var104.field3950;
                        } else {
                            var105 = var104.field3986;
                            var106 = var104.field3950;
                        }
                        int var107 = (var106 >> 1) + var98;
                        int var108 = (var106 + 1 >> 1) + var98;
                        int var109 = (var105 >> 1) + var97;
                        int[][] var110 = class243.field4208[class189.field3261];
                        int[][] var111 = null;
                        int var112 = (var105 + 1 >> 1) + var97;
                        int var113 = (var97 << 7) + (var105 << 6);
                        int var114 = (var98 << 7) + (var106 << 6);
                        if (class189.field3261 < 3) {
                            var111 = class243.field4208[class189.field3261 + 1];
                        }
                        int var115 = var110[var108][var109] + var110[var108][var112] + var110[var107][var109] + var110[var107][var112] >> 2;
                        class187 var116 = var104.method1531(false, (class155) null, var89, var104.field3961, var114, var90, 99, var110, var115, var113, var111);
                        if (var116 != null) {
                            class70.method531(0, (byte) -63, var98, var94 + 1, var97, class189.field3261, var91, var99 + 1, -1, 0);
                            var103.field3117 = var115;
                            var103.field3128 = var94 + class7.field153;
                            var103.field3131 = var99 + class7.field153;
                            var103.field3116 = var98 * 128 + (var106 * 64);
                            var103.field3134 = var97 * 128 + (var105 * 64);
                            var103.field3106 = (class168) var116.field3242;
                            if (var100 < var92) {
                                byte var117 = var92;
                                var92 = var100;
                                var100 = var117;
                            }
                            if (var101 > var95) {
                                byte var118 = var101;
                                var101 = var95;
                                var95 = var118;
                            }
                            var103.field3112 = var98 + var100;
                            var103.field3139 = var92 + var98;
                            var103.field3111 = var97 + var101;
                            var103.field3130 = var95 + var97;
                        }
                    }
                }
                if (class115.field2066 == 168) {
                    int var119 = class40.field827.method1051((byte) 94);
                    int var120 = (var119 & 0x7) + class20.field417;
                    int var121 = (var119 >> 4 & 0x7) + class144.field2523;
                    int var122 = var121 + class40.field827.method1060((byte) -58);
                    int var123 = class40.field827.method1060((byte) -58) + var120;
                    int var124 = class40.field827.method1075(-7903);
                    int var125 = class40.field827.method1063(-17162);
                    int var126 = class40.field827.method1051((byte) -84) * 4;
                    int var127 = class40.field827.method1051((byte) 85) * 4;
                    int var128 = class40.field827.method1063(-17162);
                    int var129 = class40.field827.method1063(-17162);
                    int var130 = class40.field827.method1051((byte) -67);
                    int var131 = class40.field827.method1051((byte) 94);
                    if (var121 >= 0 && var120 >= 0 && var121 < 104 && var120 < 104 && var122 >= 0 && var123 >= 0 && var122 < 104 && var123 < 104 && var125 != 65535) {
                        int var132 = var120 * 128 + 64;
                        int var133 = var121 * 128 + 64;
                        int var134 = var123 * 128 + 64;
                        int var135 = var122 * 128 + 64;
                        class40 var136 = new class40(var125, class189.field3261, var133, var132, class109.method803(class189.field3261, var132, (byte) 114, var133) - var126, class7.field153 + var128, var129 + class7.field153, var130, var131, var124, var127);
                        var136.method325(class109.method803(class189.field3261, var134, (byte) -45, var135) - var127, var128 - -class7.field153, var135, var134, (byte) -60);
                        class28.field543.method287(new class42(var136), 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method652(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1671++;
        int var8 = arg2;
        int var9 = 0;
        int var10 = arg7 - arg3;
        int var11 = 0;
        int var12 = arg7 * arg7;
        int var13 = arg2 * arg2;
        int var14 = arg2 - arg3;
        int var15 = var10 * var10;
        int var16 = var14 * var14;
        int var17 = var13 << 1;
        if (!arg0) {
            field1689 = null;
        }
        int var18 = var12 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = var14 << 1;
        int var22 = arg2 << 1;
        int var23 = (1 - var22) * var12 + var17;
        int var24 = (1 - var21) * var15 + var19;
        int var25 = var13 - ((var22 - 1) * var18);
        int var26 = var12 << 2;
        int var27 = var16 - (var21 - 1) * var20;
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = (var21 - 3) * var20;
        int var32 = var19 * 3;
        int var33 = var17 * 3;
        int var34 = var28;
        int var35 = (arg2 - 1) * var26;
        int var36 = (var22 - 3) * var18;
        int var37 = var30;
        int var38 = (var14 - 1) * var29;
        if (arg6 >= class40.field834 && arg6 <= class255.field4371) {
            int[] var39 = class185.field3220[arg6];
            int var40 = class34.method290(class145.field2540, arg1 - arg7, class123.field2211, -256);
            int var41 = class34.method290(class145.field2540, arg1 + arg7, class123.field2211, -256);
            int var42 = class34.method290(class145.field2540, arg1 - var10, class123.field2211, -256);
            int var43 = class34.method290(class145.field2540, arg1 + var10, class123.field2211, -256);
            class94.method692(var39, (byte) -124, var40, arg4, var42);
            class94.method692(var39, (byte) -125, var42, arg5, var43);
            class94.method692(var39, (byte) -128, var43, arg4, var41);
        }
        while (var8 > 0) {
            boolean var44 = var8 <= var14;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var11++;
                        var27 += var37;
                        var24 += var32;
                        var37 += var30;
                        var32 += var30;
                    }
                }
                if (var27 < 0) {
                    var24 += var32;
                    var27 += var37;
                    var11++;
                    var37 += var30;
                    var32 += var30;
                }
                var27 += -var31;
                var24 += -var38;
                var31 -= var29;
                var38 -= var29;
            }
            var8--;
            int var45 = arg6 - var8;
            if (var23 < 0) {
                while (var23 < 0) {
                    var25 += var34;
                    var34 += var28;
                    var23 += var33;
                    var9++;
                    var33 += var28;
                }
            }
            if (var25 < 0) {
                var25 += var34;
                var34 += var28;
                var9++;
                var23 += var33;
                var33 += var28;
            }
            var25 += -var36;
            var23 += -var35;
            var35 -= var26;
            var36 -= var26;
            int var46 = arg6 + var8;
            if (class40.field834 <= var46 && class255.field4371 >= var45) {
                int var47 = class34.method290(class145.field2540, arg1 + var9, class123.field2211, -256);
                int var48 = class34.method290(class145.field2540, arg1 - var9, class123.field2211, -256);
                if (var44) {
                    int var49 = class34.method290(class145.field2540, arg1 + var11, class123.field2211, -256);
                    int var50 = class34.method290(class145.field2540, arg1 - var11, class123.field2211, -256);
                    if (class40.field834 <= var45) {
                        int[] var51 = class185.field3220[var45];
                        class94.method692(var51, (byte) -125, var48, arg4, var50);
                        class94.method692(var51, (byte) 29, var50, arg5, var49);
                        class94.method692(var51, (byte) 6, var49, arg4, var47);
                    }
                    if (var46 <= class255.field4371) {
                        int[] var52 = class185.field3220[var46];
                        class94.method692(var52, (byte) -123, var48, arg4, var50);
                        class94.method692(var52, (byte) -127, var50, arg5, var49);
                        class94.method692(var52, (byte) -23, var49, arg4, var47);
                    }
                } else {
                    if (var45 >= class40.field834) {
                        class94.method692(class185.field3220[var45], (byte) -126, var48, arg4, var47);
                    }
                    if (class255.field4371 >= var46) {
                        class94.method692(class185.field3220[var46], (byte) 92, var48, arg4, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
    public static final void method653(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class236.field4045; var3++) {
            for (int var4 = 0; var4 < class140.field2491; var4++) {
                for (int var5 = 0; var5 < class73.field1427; var5++) {
                    class177 var6 = class75.field1463[var3][var4][var5];
                    if (var6 != null) {
                        class8 var7 = var6.field3024;
                        if (var7 != null && var7.field172.method493()) {
                            class90.method671(var7.field172, var3, var4, var5, 1, 1);
                            if (var7.field169 != null && var7.field169.method493()) {
                                class90.method671(var7.field169, var3, var4, var5, 1, 1);
                                var7.field172.method518(var7.field169, 0, 0, 0, false);
                                var7.field169 = var7.field169.method511(arg0, arg1, arg2);
                            }
                            var7.field172 = var7.field172.method511(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3012; var8++) {
                            class154 var10 = var6.field3017[var8];
                            if (var10 != null && var10.field2698.method493()) {
                                class90.method671(var10.field2698, var3, var4, var5, var10.field2695 + 1 - var10.field2693, var10.field2700 - var10.field2688 + 1);
                                var10.field2698 = var10.field2698.method511(arg0, arg1, arg2);
                            }
                        }
                        class115 var9 = var6.field3016;
                        if (var9 != null && var9.field2075.method493()) {
                            class243.method1592(var9.field2075, var3, var4, var5);
                            var9.field2075 = var9.field2075.method511(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)[[[I")
    public final int[][][] method654(boolean arg0) {
        field1670++;
        if (this.field1688 != this.field1676) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (!arg0) {
            method655(28, 117, -42);
        }
        while (var2 < this.field1688) {
            this.field1690[var2] = class17.field379;
            var2++;
        }
        return this.field1683;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)I")
    public static final int method655(int arg0, int arg1, int arg2) {
        field1685++;
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1 != -32686) {
            return 21;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public final void method656(byte arg0) {
        field1677++;
        for (int var2 = 0; var2 < this.field1688; var2++) {
            this.field1683[var2][0] = null;
            this.field1683[var2][1] = null;
            this.field1683[var2][2] = null;
            this.field1683[var2] = null;
        }
        this.field1690 = null;
        this.field1683 = null;
        if (arg0 == -19) {
            this.field1681.method282(-124);
            this.field1681 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
    public class87(int arg0, int arg1, int arg2) {
        this.field1688 = arg0;
        this.field1683 = new int[this.field1688][3][arg2];
        this.field1676 = arg1;
        this.field1690 = new class89[this.field1676];
    }
}
