import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class177 extends class212 {

    @OriginalMember(owner = "client!gg", name = "gb", descriptor = "I")
    private int field3107 = 1;

    @OriginalMember(owner = "client!gg", name = "pb", descriptor = "I")
    private int field3116 = 1;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "Lsc;")
    private static class181 field3096 = class149.method967(255, "scroll:");

    @OriginalMember(owner = "client!gg", name = "hb", descriptor = "I")
    public static int field3108 = 2;

    @OriginalMember(owner = "client!gg", name = "fb", descriptor = "I")
    public static int field3106 = 1;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public static int field3099 = 0;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "[I")
    public static int[] field3104 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "Lsc;")
    public static class181 field3097 = field3096;

    @OriginalMember(owner = "client!gg", name = "mb", descriptor = "Lsc;")
    public static class181 field3113 = null;

    @OriginalMember(owner = "client!gg", name = "ob", descriptor = "Lsc;")
    public static class181 field3115 = field3096;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!gg", name = "ib", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!gg", name = "jb", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!gg", name = "lb", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!gg", name = "nb", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!gg", name = "kb", descriptor = "J")
    public static long field3111;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "Lkf;")
    public static class225 field3100;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)V")
    public static final void method1178(int arg0, int arg1) {
        class210 var2 = class46.field726;
        synchronized (class46.field726) {
            class78.field1260 = arg0;
            if (arg1 != -1202771900) {
                field3111 = 56L;
            }
        }
        ++field3109;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)V")
    public static final void method1179(int arg0, boolean arg1) {
        ++field3103;
        class91 var2 = class31.method252(arg0, 1, false);
        if (arg1) {
            var2.method603(-74);
        }
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
    public static final void method1180(int arg0) {
        ++field3112;
        class247.field4311.method1798(-89);
        class97.field1568.method1798(-60);
        class146.field2390.method1798(-41);
        if (arg0 <= 2) {
            method1181(-23);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field3102;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field3651 = ~arg0.method1516((byte) 82) == -2;
                }
            } else {
                this.field3116 = arg0.method1516((byte) 82);
            }
        } else {
            this.field3107 = arg0.method1516((byte) 82);
        }
        if (arg2 != -3) {
            field3099 = 125;
        }
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)V")
    public static final void method1181(int arg0) {
        int var1 = class144.field2333.method1690((byte) 97);
        ++field3098;
        if (~var1 != -1) {
            class141.field2275.method541(192, 80);
            ++class27.field479;
            if (arg0 != -12061) {
                method1179(13, false);
            }
            class141.field2275.method1538(0, (byte) 98);
            int var2 = class141.field2275.field3933;
            class124 var3 = (class124) class144.field2333.method1688((byte) 27);
            class141.field2275.method1534(0, var3.field2029);
            int var4 = var3.field2029;
            int var5 = 0;
            class124 var6;
            while ((var6 = (class124) class144.field2333.method1688((byte) 27)) != null) {
                if (var5 < 255 && var4 + 1 == var6.field2029) {
                    ++var5;
                } else {
                    class141.field2275.method1538(var5, (byte) -99);
                    class141.field2275.method1534(0, var6.field2029);
                    var5 = 0;
                }
                var4 = var6.field2029;
            }
            class141.field2275.method1538(var5, (byte) 56);
            class141.field2275.method1553(class141.field2275.field3933 - var2, false);
        }
    }

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "(I)V")
    public static void method1182(int arg0) {
        field3096 = null;
        field3115 = null;
        field3113 = null;
        field3097 = null;
        if (arg0 <= -38) {
            field3104 = null;
            field3100 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lpf;I)V")
    public static final void method1183(class56 arg0, int arg1) {
        arg0.field860 = false;
        if (arg1 != -13048) {
            method1184(-120);
        }
        ++field3101;
        if (arg0.field858 != null) {
            arg0.field858.field541 = 0;
        }
        for (class56 var2 = arg0.method409(); var2 != null; var2 = arg0.method406()) {
            method1183(var2, -13048);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field3114;
        if (arg1 < 25) {
            return null;
        } else {
            int[] var3 = super.field3640.method737(true, arg0);
            if (super.field3640.field1813) {
                int var4 = this.field3107 + this.field3107 + 1;
                int var5 = this.field3116 + 1 + this.field3116;
                int var6 = 65536 / var5;
                int[][] var7 = new int[var5][];
                int var8 = 65536 / var4;
                for (int var9 = arg0 - this.field3116; ~(this.field3116 + arg0) <= ~var9; ++var9) {
                    int[] var13 = this.method1405(var9 & class4.field90, 0, 16);
                    int[] var14 = new int[class26.field452];
                    int var15 = 0;
                    for (int var16 = -this.field3107; ~this.field3107 <= ~var16; ++var16) {
                        var15 += var13[var16 & class186.field3300];
                    }
                    int var17 = 0;
                    while (var17 < class26.field452) {
                        var14[var17] = var8 * var15 >> 16;
                        int var18 = var15 - var13[class186.field3300 & var17 - this.field3107];
                        ++var17;
                        var15 = var13[var17 - -this.field3107 & class186.field3300] + var18;
                    }
                    var7[this.field3116 + var9 - arg0] = var14;
                }
                for (int var10 = 0; class26.field452 > var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var12 > ~var5; ++var12) {
                        var11 += var7[var12][var10];
                    }
                    var3[var10] = var6 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "(I)V")
    public static final void method1184(int arg0) {
        ++field3095;
        if (class100.field1680 == 28) {
            int var1 = class76.field1223.method1516((byte) 82);
            int var2 = (7 & var1 >> 4) + class259.field4523;
            int var3 = class213.field3670 - -(7 & var1);
            int var4 = class76.field1223.method1563(arg0 ^ -255660862) + var2;
            int var5 = var3 - -class76.field1223.method1563(arg0 + -255716546);
            int var6 = class76.field1223.method1515(-105);
            int var7 = class76.field1223.method1535(arg0 + -28360);
            int var8 = class76.field1223.method1516((byte) 82) * 4;
            int var9 = class76.field1223.method1516((byte) 82) * 4;
            int var10 = class76.field1223.method1535(2);
            int var11 = class76.field1223.method1535(2);
            int var12 = class76.field1223.method1516((byte) 82);
            int var13 = class76.field1223.method1516((byte) 82);
            if (~var2 <= -1 && var3 >= 0 && var2 < 104 && var3 < 104 && ~var4 <= -1 && var5 >= 0 && ~var4 > -105 && var5 < 104 && var7 != 65535) {
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 - -64;
                int var16 = var4 * 128 - -64;
                int var17 = var5 * 128 + 64;
                class125 var18 = new class125(var7, class38.field581, var14, var15, class232.method1606(class38.field581, (byte) -102, var15, var14) - var8, class237.field4125 + var10, var11 - -class237.field4125, var12, var13, var6, var9);
                var18.method814(class232.method1606(class38.field581, (byte) -68, var17, var16) - var9, var17, 117, var16, class237.field4125 + var10);
                class52.field827.method1689(new class86(var18), 102);
            }
        } else if (class100.field1680 == 93) {
            int var19 = class76.field1223.method1558((byte) -69);
            int var20 = class76.field1223.method1513(-12137);
            int var21 = ((var20 & 119) >> 4) + class259.field4523;
            int var22 = (7 & var20) + class213.field3670;
            if (var21 >= 0 && var22 >= 0 && ~var21 > -105 && var22 < 104) {
                class247 var23 = class132.field2183[class38.field581][var21][var22];
                if (var23 != null) {
                    for (class44 var24 = (class44) var23.method1686((byte) -83); var24 != null; var24 = (class44) var23.method1683(140)) {
                        if (~(32767 & var19) == ~var24.field686.field1303) {
                            var24.method290((byte) -48);
                            break;
                        }
                    }
                    if (var23.method1686((byte) -83) == null) {
                        class132.field2183[class38.field581][var21][var22] = null;
                    }
                    class78.method550(var21, true, var22);
                }
            }
        } else {
            if (arg0 != 28362) {
                field3099 = 127;
            }
            if (~class100.field1680 == -57) {
                int var25 = class76.field1223.method1516((byte) 82);
                int var26 = ((var25 & 243) >> 4) + class259.field4523 * 2;
                int var27 = class213.field3670 * 2 - -(var25 & 15);
                int var28 = var26 - -class76.field1223.method1563(-255688184);
                int var29 = class76.field1223.method1563(-255688184) + var27;
                int var30 = class76.field1223.method1515(arg0 + -28478);
                int var31 = class76.field1223.method1535(2);
                int var32 = class76.field1223.method1516((byte) 82) * 4;
                int var33 = class76.field1223.method1516((byte) 82) * 4;
                int var34 = class76.field1223.method1535(2);
                int var35 = class76.field1223.method1535(2);
                int var36 = class76.field1223.method1516((byte) 82);
                int var37 = class76.field1223.method1516((byte) 82);
                if (var26 >= 0 && ~var27 <= -1 && ~var26 > -209 && ~var27 > -209 && var28 >= 0 && var29 >= 0 && var28 < 208 && ~var29 > -209 && ~var31 != -65536) {
                    int var38 = var27 * 64;
                    int var39 = var26 * 64;
                    int var40 = var28 * 64;
                    int var41 = var29 * 64;
                    class125 var42 = new class125(var31, class38.field581, var39, var38, -var32 + class232.method1606(class38.field581, (byte) -74, var38, var39), var34 - -class237.field4125, class237.field4125 + var35, var36, var37, var30, var33);
                    var42.method814(-var33 + class232.method1606(class38.field581, (byte) -46, var41, var40), var41, 111, var40, class237.field4125 + var34);
                    class52.field827.method1689(new class86(var42), 79);
                }
            } else if (~class100.field1680 == -183) {
                int var43 = class76.field1223.method1516((byte) 82);
                int var44 = var43 >> 2;
                int var45 = var43 & 3;
                int var46 = class199.field3448[var44];
                int var47 = class76.field1223.method1535(2);
                int var48 = class76.field1223.method1516((byte) 82);
                int var49 = class213.field3670 - -(7 & var48);
                int var50 = ((var48 & 124) >> 4) + class259.field4523;
                if (var50 >= 0 && ~var49 <= -1 && var50 < 104 && var49 < 104) {
                    class261.method1771(var47, 0, var49, var50, var45, 0, var46, var44, class38.field581, -1);
                }
            } else if (class100.field1680 == 80) {
                int var51 = class76.field1223.method1554(arg0 ^ 28362);
                int var52 = class76.field1223.method1554(arg0 + -28362);
                int var53 = class76.field1223.method1543(255);
                int var54 = (var53 >> 4 & 7) + class259.field4523;
                int var55 = (var53 & 7) + class213.field3670;
                if (var54 >= 0 && ~var55 <= -1 && ~var54 > -105 && ~var55 > -105) {
                    class81 var56 = new class81();
                    var56.field1303 = var51;
                    var56.field1304 = var52;
                    if (class132.field2183[class38.field581][var54][var55] == null) {
                        class132.field2183[class38.field581][var54][var55] = new class247();
                    }
                    class132.field2183[class38.field581][var54][var55].method1689(new class44(var56), arg0 + -28302);
                    class78.method550(var54, true, var55);
                }
            } else if (~class100.field1680 == -233) {
                int var57 = class76.field1223.method1548(-100001);
                int var58 = class76.field1223.method1513(arg0 ^ -16803);
                if (~var57 == -65536) {
                    var57 = -1;
                }
                int var59 = var58 >> 2;
                int var60 = 3 & var58;
                int var61 = class199.field3448[var59];
                int var62 = class76.field1223.method1516((byte) 82);
                int var63 = (var62 >> 4 & 7) + class259.field4523;
                int var64 = class213.field3670 - -(var62 & 7);
                class76.method530(var59, 957, var61, var60, class38.field581, var57, var64, var63);
            } else if (class100.field1680 == 197) {
                int var65 = class76.field1223.method1516((byte) 82);
                int var66 = (7 & var65 >> 4) + class259.field4523;
                int var67 = (var65 & 7) + class213.field3670;
                int var68 = class76.field1223.method1535(arg0 ^ 28360);
                int var69 = class76.field1223.method1516((byte) 82);
                int var70 = class76.field1223.method1535(2);
                if (var66 >= 0 && ~var67 <= -1 && var66 < 104 && var67 < 104) {
                    int var71 = var67 * 128 - -64;
                    int var72 = var66 * 128 - -64;
                    class21 var73 = new class21(var68, class38.field581, var72, var71, class232.method1606(class38.field581, (byte) -28, var71, var72) + -var69, var70, class237.field4125);
                    class172.field2883.method1689(new class55(var73), arg0 + -28278);
                }
            } else if (class100.field1680 == 110) {
                int var74 = class76.field1223.method1539(arg0 ^ -12312);
                int var75 = class259.field4523 - -((var74 & 122) >> 4);
                int var76 = (7 & var74) + class213.field3670;
                int var77 = class76.field1223.method1554(0);
                int var78 = class76.field1223.method1548(-100001);
                int var79 = class76.field1223.method1554(0);
                if (~var75 <= -1 && ~var76 <= -1 && var75 < 104 && ~var76 > -105 && class199.field3452 != var77) {
                    class81 var80 = new class81();
                    var80.field1303 = var79;
                    var80.field1304 = var78;
                    if (class132.field2183[class38.field581][var75][var76] == null) {
                        class132.field2183[class38.field581][var75][var76] = new class247();
                    }
                    class132.field2183[class38.field581][var75][var76].method1689(new class44(var80), 82);
                    class78.method550(var75, true, var76);
                }
            } else {
                if (class100.field1680 == 11) {
                    int var81 = class76.field1223.method1554(0);
                    byte var82 = class76.field1223.method1563(-255688184);
                    int var83 = class76.field1223.method1513(-12137);
                    int var84 = var83 >> 2;
                    int var85 = class199.field3448[var84];
                    byte var86 = class76.field1223.method1563(-255688184);
                    int var87 = class76.field1223.method1548(-100001);
                    int var88 = var83 & 3;
                    int var89 = class76.field1223.method1548(-100001);
                    int var90 = class76.field1223.method1558((byte) -60);
                    byte var91 = class76.field1223.method1551((byte) 109);
                    int var92 = class76.field1223.method1543(255);
                    int var93 = ((121 & var92) >> 4) + class259.field4523;
                    int var94 = class213.field3670 - -(7 & var92);
                    byte var95 = class76.field1223.method1510(98);
                    class116 var96;
                    if (class199.field3452 == var81) {
                        var96 = class258.field4507;
                    } else {
                        var96 = class39.field602[var81];
                    }
                    if (var96 != null) {
                        class148 var97 = class62.method442((byte) 79, var90);
                        int var98;
                        int var99;
                        if (var88 != 1 && var88 != 3) {
                            var98 = var97.field2466;
                            var99 = var97.field2433;
                        } else {
                            var99 = var97.field2466;
                            var98 = var97.field2433;
                        }
                        int var100 = (var98 + 1 >> 1) + var93;
                        int var101 = (var99 + 1 >> 1) + var94;
                        int var102 = var93 - -(var98 >> 1);
                        int var103 = (var99 >> 1) + var94;
                        int[][] var104 = null;
                        int[][] var105 = class31.field505[class38.field581];
                        if (class38.field581 < 3) {
                            var104 = class31.field505[class38.field581 + 1];
                        }
                        int var106 = var105[var100][var103] - -var105[var100][var101] + var105[var102][var101] + var105[var102][var103] >> 2;
                        int var107 = (var94 << 7) + (var99 << 6);
                        int var108 = (var93 << 7) - -(var98 << 6);
                        class260 var109 = var97.method954(var107, false, (byte) 95, var105, var104, var108, (class134) null, var106, var88, var84, var97.field2448);
                        if (var109 != null) {
                            class261.method1771(-1, var87 + 1, var94, var93, 0, 0, var85, 0, class38.field581, var89 + 1);
                            if (~var91 > ~var86) {
                                byte var110 = var86;
                                var86 = var91;
                                var91 = var110;
                            }
                            var96.field1891 = class237.field4125 + var89;
                            var96.field1911 = var94 * 128 - -(var99 * 64);
                            var96.field1893 = var91 + var93;
                            var96.field1900 = (class249) var109.field4534;
                            if (~var82 > ~var95) {
                                byte var111 = var95;
                                var95 = var82;
                                var82 = var111;
                            }
                            var96.field1922 = var94 + var95;
                            var96.field1912 = var82 + var94;
                            var96.field1916 = var87 - -class237.field4125;
                            var96.field1903 = var106;
                            var96.field1882 = var93 * 128 + var98 * 64;
                            var96.field1918 = var86 + var93;
                        }
                    }
                }
                if (class100.field1680 == 61) {
                    int var112 = class76.field1223.method1516((byte) 82);
                    int var113 = (var112 >> 4 & 7) + class259.field4523;
                    int var114 = class213.field3670 - -(7 & var112);
                    int var115 = class76.field1223.method1516((byte) 82);
                    int var116 = var115 >> 2;
                    int var117 = var115 & 3;
                    int var118 = class199.field3448[var116];
                    if (var113 >= 0 && var114 >= 0 && ~var113 > -105 && var114 < 104) {
                        class261.method1771(-1, 0, var114, var113, var117, 0, var118, var116, class38.field581, -1);
                    }
                } else if (~class100.field1680 != -61) {
                    if (~class100.field1680 == -152) {
                        int var128 = class76.field1223.method1516((byte) 82);
                        int var129 = class213.field3670 - -(var128 & 7);
                        int var130 = (var128 >> 4 & 7) + class259.field4523;
                        int var131 = class76.field1223.method1535(arg0 ^ 28360);
                        if (var131 == 65535) {
                            var131 = -1;
                        }
                        int var132 = class76.field1223.method1516((byte) 82);
                        int var133 = 7 & var132;
                        int var134 = (var132 & 248) >> 4;
                        int var135 = class76.field1223.method1516((byte) 82);
                        if (var130 >= 0 && var129 >= 0 && ~var130 > -105 && ~var129 > -105) {
                            int var136 = var134 + 1;
                            if (~(-var136 + var130) >= ~class258.field4507.field2672[0] && ~(var130 + var136) <= ~class258.field4507.field2672[0] && class258.field4507.field2623[0] >= var129 - var136 && ~(var129 + var136) <= ~class258.field4507.field2623[0] && ~class55.field849 != -1 && var133 > 0 && ~class258.field4512 > -51 && var131 != -1) {
                                class111.field1824[class258.field4512] = var131;
                                class132.field2185[class258.field4512] = var133;
                                class94.field1512[class258.field4512] = var135;
                                class192.field3378[class258.field4512] = null;
                                class93.field1471[class258.field4512] = (var130 << 16) + (var129 << 8) + var134;
                                ++class258.field4512;
                            }
                        }
                    }
                } else {
                    int var119 = class76.field1223.method1516((byte) 82);
                    int var120 = (7 & var119) + class213.field3670;
                    int var121 = class259.field4523 - -((var119 & 121) >> 4);
                    int var122 = class76.field1223.method1535(arg0 + -28360);
                    int var123 = class76.field1223.method1535(2);
                    int var124 = class76.field1223.method1535(2);
                    if (var121 >= 0 && var120 >= 0 && var121 < 104 && var120 < 104) {
                        class247 var125 = class132.field2183[class38.field581][var121][var120];
                        if (var125 != null) {
                            for (class44 var126 = (class44) var125.method1686((byte) -83); var126 != null; var126 = (class44) var125.method1683(140)) {
                                class81 var127 = var126.field686;
                                if ((32767 & var122) == var127.field1303 && ~var127.field1304 == ~var123) {
                                    var127.field1304 = var124;
                                    break;
                                }
                            }
                            class78.method550(var121, true, var120);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        int[][] var3 = super.field3645.method1352(arg0, -119);
        if (arg1 != 16383) {
            field3099 = 59;
        }
        ++field3110;
        if (super.field3645.field3477) {
            int var4 = this.field3116 + 1 + this.field3116;
            int var5 = 65536 / var4;
            int var6 = this.field3107 + 1 + this.field3107;
            int[][][] var7 = new int[var4][][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field3116 + arg0; this.field3116 + arg0 >= var9; ++var9) {
                int[][] var19 = this.method1410(class4.field90 & var9, 0, (byte) -126);
                int[][] var20 = new int[3][class26.field452];
                int var21 = 0;
                int var22 = 0;
                int[] var23 = var19[1];
                int var24 = 0;
                int[] var25 = var19[2];
                int[] var26 = var19[0];
                for (int var27 = -this.field3107; ~this.field3107 <= ~var27; ++var27) {
                    int var37 = class186.field3300 & var27;
                    var22 += var23[var37];
                    var21 += var26[var37];
                    var24 += var25[var37];
                }
                int[] var28 = var20[1];
                int[] var29 = var20[0];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class26.field452 < ~var31) {
                    var29[var31] = var8 * var21 >> 16;
                    var28[var31] = var8 * var22 >> 16;
                    var30[var31] = var8 * var24 >> 16;
                    int var32 = var31 - this.field3107 & class186.field3300;
                    int var33 = var21 - var26[var32];
                    int var34 = var22 - var23[var32];
                    ++var31;
                    int var35 = var24 - var25[var32];
                    int var36 = var31 - -this.field3107 & class186.field3300;
                    var24 = var25[var36] + var35;
                    var21 = var26[var36] + var33;
                    var22 = var23[var36] + var34;
                }
                var7[var9 - arg0 + this.field3116] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[2];
            int[] var12 = var3[1];
            for (int var13 = 0; class26.field452 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var7[var17];
                    var16 += var18[0][var13];
                    var15 += var18[2][var13];
                    var14 += var18[1][var13];
                }
                var10[var13] = var5 * var16 >> 16;
                var12[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILsc;)Z")
    public static final boolean method1185(int arg0, class181 arg1) {
        ++field3105;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = arg0; var2 < class149.field2483; ++var2) {
                if (arg1.method1227(arg0 ^ 30093, class5.field100[var2])) {
                    return true;
                }
            }
            return arg1.method1227(30093, class258.field4507.field1883);
        }
    }
}
