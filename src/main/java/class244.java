import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class244 extends class67 {

    @OriginalMember(owner = "client!we", name = "B", descriptor = "[Ldj;")
    public static class44[] field4493 = new class44[2048];

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field4495 = 0;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "Li;")
    public static class88 field4496 = class208.method1425(105, "Hierhin gehen");

    @OriginalMember(owner = "client!we", name = "F", descriptor = "[I")
    public static int[] field4497 = new int[32];

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "Lfe;")
    public static class61 field4490;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "Li;")
    public class88 field4488;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "[Li;")
    public class88[] field4492;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static final void method1600(int arg0) {
        field4491++;
        if (arg0 != -9063) {
            return;
        }
        if (class238.field4432 == 123) {
            int var1 = class230.field4314.method347(26119);
            int var2 = (var1 & 0xF) + class150.field2912 * 2;
            int var3 = (var1 >> 4 & 0xF) + class121.field2215 * 2;
            int var4 = class230.field4314.method324(34) + var3;
            int var5 = var2 + class230.field4314.method324(arg0 ^ 0xFFFFDCAC);
            int var6 = class230.field4314.method334((byte) -73);
            int var7 = class230.field4314.method301(107);
            int var8 = class230.field4314.method347(arg0 + 35182) * 4;
            int var9 = class230.field4314.method347(arg0 + 35182) * 4;
            int var10 = class230.field4314.method301(12);
            int var11 = class230.field4314.method301(127);
            int var12 = class230.field4314.method347(arg0 ^ 0xFFFFBA9E);
            int var13 = class230.field4314.method347(26119);
            if (var3 >= 0 && var2 >= 0 && var3 < 208 && var2 < 208 && var4 >= 0 && var5 >= 0 && var4 < 208 && var5 < 208 && var7 != 65535) {
                int var14 = var2 * 64;
                int var15 = var3 * 64;
                int var16 = var5 * 64;
                class77 var17 = new class77(var7, class149.field2909, var15, var14, class239.method1586(var15, var14, 2, class149.field2909) - var8, var10 - -class117.field2115, class117.field2115 + var11, var12, var13, var6, var9);
                int var18 = var4 * 64;
                var17.method520(var18, var10 + class117.field2115, class239.method1586(var18, var16, 2, class149.field2909) + -var9, -14596, var16);
                class167.field3222.method1624(new class20(var17), 118);
            }
        } else if (class238.field4432 == 135) {
            int var19 = class230.field4314.method319(4633);
            int var20 = (var19 & 0x7) + class150.field2912;
            int var21 = class121.field2215 + (var19 >> 4 & 0x7);
            int var22 = class230.field4314.method302(arg0 ^ 0xFFFFDC66);
            int var23 = class230.field4314.method349(true);
            int var24 = class230.field4314.method349(true);
            if (var21 >= 0 && var20 >= 0 && var21 < 104 && var20 < 104 && class220.field4166 != var23) {
                class111 var25 = new class111();
                var25.field2031 = var24;
                var25.field2032 = var22;
                if (class134.field2499[class149.field2909][var21][var20] == null) {
                    class134.field2499[class149.field2909][var21][var20] = new class248();
                }
                class134.field2499[class149.field2909][var21][var20].method1624(new class227(var25), 71);
                class29.method175(21280, var21, var20);
            }
        } else if (class238.field4432 == 173) {
            int var26 = class230.field4314.method347(26119);
            int var27 = class150.field2912 + (var26 & 0x7);
            int var28 = (var26 >> 4 & 0x7) + class121.field2215;
            int var29 = class230.field4314.method301(arg0 ^ 0xFFFFDCD4);
            int var30 = class230.field4314.method347(26119);
            int var31 = class230.field4314.method301(arg0 ^ 0xFFFFDC82);
            if (var28 >= 0 && var27 >= 0 && var28 < 104 && var27 < 104) {
                int var32 = var28 * 128 + 64;
                int var33 = var27 * 128 + 64;
                class18 var34 = new class18(var29, class149.field2909, var32, var33, class239.method1586(var32, var33, 2, class149.field2909) - var30, var31, class117.field2115);
                class42.field714.method1624(new class242(var34), 124);
            }
        } else if (class238.field4432 == 232) {
            int var35 = class230.field4314.method347(26119);
            int var36 = (var35 & 0x7) + class150.field2912;
            int var37 = (var35 >> 4 & 0x7) + class121.field2215;
            int var38 = class230.field4314.method301(arg0 + 9177);
            int var39 = class230.field4314.method301(18);
            int var40 = class230.field4314.method301(90);
            if (var37 >= 0 && var36 >= 0 && var37 < 104 && var36 < 104) {
                class248 var41 = class134.field2499[class149.field2909][var37][var36];
                if (var41 != null) {
                    for (class227 var42 = (class227) var41.method1612(false); var42 != null; var42 = (class227) var41.method1621(arg0 ^ 0xFFFFDCCB)) {
                        class111 var43 = var42.field4260;
                        if ((var38 & 0x7FFF) == var43.field2032 && var43.field2031 == var39) {
                            var43.field2031 = var40;
                            break;
                        }
                    }
                    class29.method175(21280, var37, var36);
                }
            }
        } else if (class238.field4432 == 44) {
            int var44 = class230.field4314.method347(26119);
            int var45 = var44 >> 2;
            int var46 = var44 & 0x3;
            int var47 = class98.field1794[var45];
            int var48 = class230.field4314.method302(255);
            int var49 = class230.field4314.method319(4633);
            int var50 = (var49 >> 4 & 0x7) + class121.field2215;
            int var51 = class150.field2912 + (var49 & 0x7);
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                class220.method1488(0, var51, var47, var46, -1, var45, class149.field2909, var50, arg0 ^ 0xFFFFDC99, var48);
            }
        } else if (class238.field4432 == 171) {
            int var52 = class230.field4314.method319(4633);
            int var53 = var52 & 0x3;
            int var54 = var52 >> 2;
            int var55 = class98.field1794[var54];
            int var56 = class230.field4314.method343(42);
            if (var56 == 65535) {
                var56 = -1;
            }
            int var57 = class230.field4314.method352(24758);
            int var58 = (var57 >> 4 & 0x7) + class121.field2215;
            int var59 = (var57 & 0x7) + class150.field2912;
            class113.method776(var54, var58, 12019, var55, var53, class149.field2909, var59, var56);
        } else {
            if (class238.field4432 == 61) {
                int var60 = class230.field4314.method301(arg0 ^ 0xFFFFDCCF);
                int var61 = class230.field4314.method295((byte) -114);
                int var62 = var61 >> 2;
                int var63 = var61 & 0x3;
                int var64 = class98.field1794[var62];
                int var65 = class230.field4314.method301(73);
                byte var66 = class230.field4314.method303(16777215);
                byte var67 = class230.field4314.method335(0);
                byte var68 = class230.field4314.method324(34);
                byte var69 = class230.field4314.method335(arg0 ^ 0xFFFFDC99);
                int var70 = class230.field4314.method301(120);
                int var71 = class230.field4314.method347(26119);
                int var72 = (var71 & 0x7) + class150.field2912;
                int var73 = (var71 >> 4 & 0x7) + class121.field2215;
                int var74 = class230.field4314.method349(true);
                class44 var75;
                if (class220.field4166 == var60) {
                    var75 = class240.field4458;
                } else {
                    var75 = field4493[var60];
                }
                if (var75 != null) {
                    class148 var76 = class190.method1323(var65, -12450);
                    int var77;
                    int var78;
                    if (var63 == 1 || var63 == 3) {
                        var78 = var76.field2776;
                        var77 = var76.field2796;
                    } else {
                        var77 = var76.field2776;
                        var78 = var76.field2796;
                    }
                    int var79 = (var77 >> 1) + var73;
                    int var80 = (var77 + 1 >> 1) + var73;
                    int var81 = (var78 >> 1) + var72;
                    int var82 = (var78 + 1 >> 1) + var72;
                    int[][] var83 = class62.field1137[class149.field2909];
                    int var84 = (var73 << 7) + (var77 << 6);
                    int var85 = var83[var79][var81] + var83[var80][var81] + var83[var80][var82] + var83[var79][var82] >> 2;
                    int var86 = (var72 << 7) + (var78 << 6);
                    int[][] var87 = null;
                    if (class149.field2909 < 3) {
                        var87 = class62.field1137[class149.field2909 + 1];
                    }
                    class210 var88 = var76.method999(var62, var87, var83, var84, false, var86, var63, var85, arg0 - 12674);
                    if (var88 != null) {
                        class220.method1488(var70 + 1, var72, var64, 0, var74 + 1, 0, class149.field2909, var73, 0, -1);
                        var75.field759 = var85;
                        var75.field755 = class117.field2115 + var70;
                        var75.field757 = var72 * 128 + var78 * 64;
                        var75.field758 = (class30) var88.field3986;
                        var75.field773 = var73 * 128 + var77 * 64;
                        if (var67 > var68) {
                            byte var89 = var67;
                            var67 = var68;
                            var68 = var89;
                        }
                        var75.field764 = var67 + var73;
                        var75.field744 = var68 + var73;
                        if (var66 < var69) {
                            byte var90 = var69;
                            var69 = var66;
                            var66 = var90;
                        }
                        var75.field741 = var72 + var69;
                        var75.field745 = var72 + var66;
                        var75.field762 = class117.field2115 + var74;
                    }
                }
            }
            if (class238.field4432 == 99) {
                int var91 = class230.field4314.method347(26119);
                int var92 = (var91 & 0x7) + class150.field2912;
                int var93 = (var91 >> 4 & 0x7) + class121.field2215;
                int var94 = class230.field4314.method349(true);
                int var95 = class230.field4314.method302(255);
                if (var93 >= 0 && var92 >= 0 && var93 < 104 && var92 < 104) {
                    class111 var96 = new class111();
                    var96.field2031 = var95;
                    var96.field2032 = var94;
                    if (class134.field2499[class149.field2909][var93][var92] == null) {
                        class134.field2499[class149.field2909][var93][var92] = new class248();
                    }
                    class134.field2499[class149.field2909][var93][var92].method1624(new class227(var96), arg0 ^ 0xFFFFDCC4);
                    class29.method175(arg0 + 30343, var93, var92);
                }
            } else if (class238.field4432 == 150) {
                int var97 = class230.field4314.method347(26119);
                int var98 = class121.field2215 + (var97 >> 4 & 0x7);
                int var99 = (var97 & 0x7) + class150.field2912;
                int var100 = var98 + class230.field4314.method324(111);
                int var101 = class230.field4314.method324(arg0 ^ 0xFFFFDC94) + var99;
                int var102 = class230.field4314.method334((byte) -73);
                int var103 = class230.field4314.method301(arg0 + 9111);
                int var104 = class230.field4314.method347(26119) * 4;
                int var105 = class230.field4314.method347(26119) * 4;
                int var106 = class230.field4314.method301(24);
                int var107 = class230.field4314.method301(91);
                int var108 = class230.field4314.method347(26119);
                int var109 = class230.field4314.method347(arg0 ^ 0xFFFFBA9E);
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                    int var110 = var98 * 128 + 64;
                    int var111 = var101 * 128 + 64;
                    int var112 = var100 * 128 + 64;
                    int var113 = var99 * 128 + 64;
                    class77 var114 = new class77(var103, class149.field2909, var110, var113, class239.method1586(var110, var113, arg0 ^ 0xFFFFDC9B, class149.field2909) - var104, class117.field2115 + var106, var107 + class117.field2115, var108, var109, var102, var105);
                    var114.method520(var112, class117.field2115 + var106, class239.method1586(var112, var111, 2, class149.field2909) + -var105, -14596, var111);
                    class167.field3222.method1624(new class20(var114), 109);
                }
            } else if (class238.field4432 == 198) {
                int var115 = class230.field4314.method319(4633);
                int var116 = (var115 >> 4 & 0x7) + class121.field2215;
                int var117 = (var115 & 0x7) + class150.field2912;
                int var118 = class230.field4314.method302(arg0 + 9318);
                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                    class248 var119 = class134.field2499[class149.field2909][var116][var117];
                    if (var119 != null) {
                        for (class227 var120 = (class227) var119.method1612(false); var120 != null; var120 = (class227) var119.method1621(arg0 ^ 0xFFFFDCCB)) {
                            if ((var118 & 0x7FFF) == var120.field4260.field2032) {
                                var120.method460(true);
                                break;
                            }
                        }
                        if (var119.method1612(false) == null) {
                            class134.field2499[class149.field2909][var116][var117] = null;
                        }
                        class29.method175(21280, var116, var117);
                    }
                }
            } else if (class238.field4432 == 75) {
                int var121 = class230.field4314.method347(arg0 ^ 0xFFFFBA9E);
                int var122 = var121 >> 2;
                int var123 = class98.field1794[var122];
                int var124 = var121 & 0x3;
                int var125 = class230.field4314.method295((byte) -80);
                int var126 = class150.field2912 + (var125 & 0x7);
                int var127 = (var125 >> 4 & 0x7) + class121.field2215;
                if (var127 >= 0 && var126 >= 0 && var127 < 104 && var126 < 104) {
                    class220.method1488(0, var126, var123, var124, -1, var122, class149.field2909, var127, arg0 + 9063, -1);
                }
            } else if (class238.field4432 == 52) {
                int var128 = class230.field4314.method347(arg0 + 35182);
                int var129 = class150.field2912 + (var128 & 0x7);
                int var130 = (var128 >> 4 & 0x7) + class121.field2215;
                int var131 = class230.field4314.method301(35);
                int var132 = class230.field4314.method347(26119);
                if (var131 == 65535) {
                    var131 = -1;
                }
                int var133 = var132 & 0x7;
                int var134 = class230.field4314.method347(26119);
                int var135 = var132 >> 4 & 0xF;
                if (var130 >= 0 && var129 >= 0 && var130 < 104 && var129 < 104) {
                    int var136 = var135 + 1;
                    if (class240.field4458.field4089[0] >= var130 - var136 && var130 + var136 >= class240.field4458.field4089[0] && var129 - var136 <= class240.field4458.field4143[0] && class240.field4458.field4143[0] <= var129 + var136 && class223.field4213 != 0 && var133 > 0 && class174.field3447 < 50 && var131 != -1) {
                        class25.field397[class174.field3447] = var131;
                        class110.field2018[class174.field3447] = var133;
                        class8.field116[class174.field3447] = var134;
                        class237.field4419[class174.field3447] = null;
                        class145.field2728[class174.field3447] = (var130 << 16) + (var129 << 8) + var135;
                        class174.field3447++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method1601(byte arg0) {
        if (arg0 != 77) {
            field4490 = null;
        }
        field4493 = null;
        field4496 = null;
        field4490 = null;
        field4497 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lu;I)V")
    public static final void method1602(class218 arg0, int arg1) {
        arg0.field4108 = arg0.field4107;
        field4489++;
        if (arg0.field4137 == 0) {
            arg0.field4110 = 0;
            return;
        }
        if (arg0.field4079 != -1 && arg0.field4142 == 0) {
            class109 var2 = class15.method75(arg0.field4079, (byte) -106);
            if (arg0.field4139 > 0 && var2.field1985 == 0) {
                arg0.field4110++;
                return;
            }
            if (arg0.field4139 <= 0 && var2.field1982 == 0) {
                arg0.field4110++;
                return;
            }
        }
        int var3 = arg0.field4138;
        int var4 = arg0.field4089[arg0.field4137 - 1] * 128 + arg0.field4105 * 64;
        int var5 = arg0.field4123;
        int var6 = arg0.field4143[arg0.field4137 - 1] * 128 + arg0.field4105 * 64;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg0.field4138 = var4;
            arg0.field4123 = var6;
            return;
        }
        if (var3 >= var4) {
            if (var4 >= var3) {
                if (var6 > var5) {
                    arg0.field4121 = 1024;
                } else if (var6 < var5) {
                    arg0.field4121 = 0;
                }
            } else if (var5 < var6) {
                arg0.field4121 = 768;
            } else if (var6 >= var5) {
                arg0.field4121 = 512;
            } else {
                arg0.field4121 = 256;
            }
        } else if (var5 < var6) {
            arg0.field4121 = 1280;
        } else if (var6 < var5) {
            arg0.field4121 = 1792;
        } else {
            arg0.field4121 = 1536;
        }
        int var7 = arg0.field4125;
        int var8 = arg0.field4121 - arg0.field4087 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field4094;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field4124;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field4086;
        }
        if (var7 == -1) {
            var7 = arg0.field4094;
        }
        int var9 = 4;
        boolean var10 = true;
        arg0.field4108 = var7;
        if (arg0 instanceof class191) {
            var10 = ((class191) arg0).field3684.field2356;
        }
        if (var10) {
            if (arg0.field4121 != arg0.field4087 && arg0.field4116 == -1 && arg0.field4104 != 0) {
                var9 = 2;
            }
            if (arg0.field4137 > 2) {
                var9 = 6;
            }
            if (arg0.field4137 > 3) {
                var9 = 8;
            }
            if (arg0.field4110 > 0 && arg0.field4137 > 1) {
                var9 = 8;
                arg0.field4110--;
            }
        } else {
            if (arg0.field4137 > 1) {
                var9 = 6;
            }
            if (arg0.field4137 > 2) {
                var9 = 8;
            }
            if (arg0.field4110 > 0 && arg0.field4137 > 1) {
                var9 = 8;
                arg0.field4110--;
            }
        }
        if (arg0.field4076[arg0.field4137 - 1]) {
            var9 <<= 0x1;
        }
        if (var4 > var3) {
            arg0.field4138 += var9;
            if (arg0.field4138 > var4) {
                arg0.field4138 = var4;
            }
        } else if (var4 < var3) {
            arg0.field4138 -= var9;
            if (var4 > arg0.field4138) {
                arg0.field4138 = var4;
            }
        }
        if (var9 >= 8 && arg0.field4108 == arg0.field4094 && arg0.field4106 != -1) {
            arg0.field4108 = arg0.field4106;
        }
        if (arg1 < 18) {
            method1602(null, 93);
        }
        if (var6 > var5) {
            arg0.field4123 += var9;
            if (var6 < arg0.field4123) {
                arg0.field4123 = var6;
            }
        } else if (var6 < var5) {
            arg0.field4123 -= var9;
            if (var6 > arg0.field4123) {
                arg0.field4123 = var6;
            }
        }
        if (arg0.field4138 != var4 || arg0.field4123 != var6) {
            return;
        }
        arg0.field4137--;
        if (arg0.field4139 > 0) {
            arg0.field4139--;
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[B)V")
    public static final void method1603(int arg0, byte[] arg1) {
        field4486++;
        class46 var2 = new class46(arg1);
        var2.field831 = arg1.length - 2;
        class172.field3347 = var2.method301(82);
        class67.field1218 = new int[class172.field3347];
        class116.field2106 = new byte[class172.field3347][];
        class135.field2512 = new int[class172.field3347];
        class247.field4530 = new int[class172.field3347];
        class102.field1853 = new int[class172.field3347];
        var2.field831 = arg1.length - class172.field3347 * 8 - 7;
        class15.field229 = var2.method301(101);
        class129.field2426 = var2.method301(41);
        int var3 = (var2.method347(arg0 + 26055) & 0xFF) + 1;
        int var4 = 0;
        if (arg0 != 64) {
            method1602(null, 35);
        }
        while (class172.field3347 > var4) {
            class247.field4530[var4] = var2.method301(62);
            var4++;
        }
        for (int var5 = 0; var5 < class172.field3347; var5++) {
            class135.field2512[var5] = var2.method301(47);
        }
        for (int var6 = 0; var6 < class172.field3347; var6++) {
            class102.field1853[var6] = var2.method301(class180.method1287(arg0, 44));
        }
        for (int var7 = 0; var7 < class172.field3347; var7++) {
            class67.field1218[var7] = var2.method301(61);
        }
        var2.field831 = arg1.length - class172.field3347 * 8 - (var3 + -1) * 3 - 7;
        class27.field456 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class27.field456[var8] = var2.method304(-29629);
            if (class27.field456[var8] == 0) {
                class27.field456[var8] = 1;
            }
        }
        var2.field831 = 0;
        for (int var9 = 0; var9 < class172.field3347; var9++) {
            int var10 = class67.field1218[var9];
            int var11 = class102.field1853[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class116.field2106[var9] = var13;
            int var14 = var2.method347(26119);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method324(arg0 - 43);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var10; var17++) {
                        var13[var11 * var17 + var16] = var2.method324(20);
                    }
                }
            }
        }
    }
}
