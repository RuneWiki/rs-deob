import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class63 {

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "J")
    public long field1191 = 0L;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Z")
    public static boolean field1195 = false;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "[I")
    public static int[] field1196 = new int[2];

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Z")
    public static boolean field1185 = false;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Llc;")
    public static class143 field1189 = class66.method374("Fps:", -1);

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Z")
    public static boolean field1203 = false;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Llc;")
    public static class143 field1198 = class66.method374("tbrefresh", -1);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public int field1199;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lqk;")
    public class51 field1182;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lqk;")
    public class51 field1190;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "Lclient;")
    public static client field1201;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "[I")
    public static int[] field1197;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public static void method358(boolean arg0) {
        if (arg0) {
            return;
        }
        field1197 = null;
        field1196 = null;
        field1189 = null;
        field1201 = null;
        field1198 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Llc;BIII)V")
    public static final void method359(class143 arg0, byte arg1, int arg2, int arg3, int arg4) {
        class43 var5 = class185.method1211(-54, arg3, arg2);
        field1184++;
        if (var5 == null) {
            return;
        }
        if (var5.field762 != null) {
            class91 var6 = new class91();
            var6.field1639 = var5.field762;
            var6.field1641 = var5;
            var6.field1636 = arg4;
            var6.field1644 = arg0;
            class247.method1638(var6, (byte) -91);
        }
        boolean var7 = true;
        if (var5.field862 > 0) {
            var7 = class26.method182(var5, (byte) -29);
        }
        if (!var7) {
            return;
        }
        int var8 = 6 % ((-arg1 - 29) / 58);
        if (!class249.method1659(arg4 - 1, client.method1514(var5), false)) {
            return;
        }
        if (arg4 == 1) {
            class114.field1994++;
            class285.field5010.method799(103, 219);
            class285.field5010.method1280(-115, arg3);
            class285.field5010.method1278(arg2, (byte) 88);
        }
        if (arg4 == 2) {
            class53.field1033++;
            class285.field5010.method799(103, 182);
            class285.field5010.method1280(-112, arg3);
            class285.field5010.method1278(arg2, (byte) 22);
        }
        if (arg4 == 3) {
            class285.field5010.method799(103, 217);
            class18.field312++;
            class285.field5010.method1280(-128, arg3);
            class285.field5010.method1278(arg2, (byte) 109);
        }
        if (arg4 == 4) {
            class195.field3625++;
            class285.field5010.method799(103, 191);
            class285.field5010.method1280(-126, arg3);
            class285.field5010.method1278(arg2, (byte) 45);
        }
        if (arg4 == 5) {
            class285.field5010.method799(103, 63);
            class285.field5010.method1280(-119, arg3);
            class285.field5010.method1278(arg2, (byte) 95);
            class33.field555++;
        }
        if (arg4 == 6) {
            class285.field5010.method799(103, 86);
            class285.field5010.method1280(-122, arg3);
            class285.field5010.method1278(arg2, (byte) 88);
            class168.field2995++;
        }
        if (arg4 == 7) {
            class285.field5010.method799(103, 64);
            class33.field557++;
            class285.field5010.method1280(-115, arg3);
            class285.field5010.method1278(arg2, (byte) 44);
        }
        if (arg4 == 8) {
            class289.field5074++;
            class285.field5010.method799(103, 135);
            class285.field5010.method1280(-127, arg3);
            class285.field5010.method1278(arg2, (byte) 94);
        }
        if (arg4 == 9) {
            class82.field1490++;
            class285.field5010.method799(103, 108);
            class285.field5010.method1280(-120, arg3);
            class285.field5010.method1278(arg2, (byte) 24);
        }
        if (arg4 == 10) {
            class110.field1932++;
            class285.field5010.method799(103, 179);
            class285.field5010.method1280(-126, arg3);
            class285.field5010.method1278(arg2, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static final void method360(int arg0) {
        field1200++;
        if (class53.field1038 == 255) {
            int var1 = class161.field2902.method1260((byte) 47);
            int var2 = var1 & 0x3;
            int var3 = var1 >> 2;
            int var4 = class239.field4318[var3];
            int var5 = class161.field2902.method1260((byte) 38);
            int var6 = class190.field3496 + (var5 & 0x7);
            int var7 = ((var5 & 0x75) >> 4) + class225.field4074;
            if (var7 >= 0 && var6 >= 0 && var7 < 104 && var6 < 104) {
                class140.method842(var6, var3, (byte) -115, -1, var2, class170.field3044, -1, var4, var7, 0);
            }
        } else if (class53.field1038 == 163) {
            int var8 = class161.field2902.method1275(128);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = class161.field2902.method1236(25215);
            int var10 = var9 >> 2;
            int var11 = var9 & 0x3;
            int var12 = class239.field4318[var10];
            int var13 = class161.field2902.method1260((byte) 87);
            int var14 = (var13 >> 4 & 0x7) + class225.field4074;
            int var15 = (var13 & 0x7) + class190.field3496;
            class9.method68(1, class170.field3044, var14, var10, var8, var15, var12, var11);
        } else {
            int var16 = 127 % ((-arg0 - 16) / 47);
            if (class53.field1038 == 76) {
                int var17 = class161.field2902.method1265(125);
                int var18 = (var17 & 0x7) + class190.field3496;
                int var19 = ((var17 & 0x79) >> 4) + class225.field4074;
                int var20 = class161.field2902.method1275(128);
                int var21 = class161.field2902.method1265(114);
                int var22 = class161.field2902.method1275(128);
                if (var19 >= 0 && var18 >= 0 && var19 < 104 && var18 < 104) {
                    int var23 = var19 * 128 + 64;
                    int var24 = var18 * 128 + 64;
                    class24 var25 = new class24(var20, class170.field3044, var23, var24, class20.method140(var23, 114, var24, class170.field3044) - var21, var22, class146.field2635);
                    class59.field1139.method1290((byte) -44, new class62(var25));
                }
            } else if (class53.field1038 == 24) {
                int var26 = class161.field2902.method1265(116);
                int var27 = (var26 >> 4 & 0x7) + class225.field4074;
                int var28 = class190.field3496 + (var26 & 0x7);
                int var29 = class161.field2902.method1275(128);
                int var30 = class161.field2902.method1265(123);
                if (var29 == 65535) {
                    var29 = -1;
                }
                int var31 = var30 & 0x7;
                int var32 = var30 >> 4 & 0xF;
                int var33 = class161.field2902.method1265(114);
                if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                    int var34 = var32 + 1;
                    if (var27 - var34 <= class229.field4195.field4148[0] && class229.field4195.field4148[0] <= (var27 + var34) && (var28 - var34) <= class229.field4195.field4115[0] && class229.field4195.field4115[0] <= var28 + var34 && class58.field1117 != 0 && var31 > 0 && class187.field3388 < 50 && var29 != -1) {
                        class190.field3489[class187.field3388] = var29;
                        class89.field1615[class187.field3388] = var31;
                        class56.field1084[class187.field3388] = var33;
                        class75.field1403[class187.field3388] = null;
                        class149.field2741[class187.field3388] = (var27 << 16) + (var28 << 8) + var32;
                        class187.field3388++;
                    }
                }
            } else if (class53.field1038 == 49) {
                int var35 = class161.field2902.method1259(6385);
                int var36 = class161.field2902.method1260((byte) 109);
                int var37 = ((var36 & 0x74) >> 4) + class225.field4074;
                int var38 = (var36 & 0x7) + class190.field3496;
                int var39 = class161.field2902.method1250((byte) 100);
                int var40 = var39 >> 2;
                int var41 = class239.field4318[var40];
                int var42 = var39 & 0x3;
                if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                    class140.method842(var38, var40, (byte) -113, -1, var42, class170.field3044, var35, var41, var37, 0);
                }
            } else if (class53.field1038 == 43) {
                int var43 = class161.field2902.method1265(122);
                int var44 = (var43 & 0xF) + class190.field3496 * 2;
                int var45 = (var43 >> 4 & 0xF) + class225.field4074 * 2;
                int var46 = var45 + class161.field2902.method1234(false);
                int var47 = var44 + class161.field2902.method1234(false);
                int var48 = class161.field2902.method1274((byte) -2);
                int var49 = class161.field2902.method1275(128);
                int var50 = class161.field2902.method1265(126) * 4;
                int var51 = class161.field2902.method1265(125) * 4;
                int var52 = class161.field2902.method1275(128);
                int var53 = class161.field2902.method1275(128);
                int var54 = class161.field2902.method1265(113);
                int var55 = class161.field2902.method1265(121);
                if (var45 >= 0 && var44 >= 0 && var45 < 208 && var44 < 208 && var46 >= 0 && var47 >= 0 && var46 < 208 && var47 < 208 && var49 != 65535) {
                    int var56 = var46 * 64;
                    int var57 = var45 * 64;
                    int var58 = var44 * 64;
                    int var59 = var47 * 64;
                    class157 var60 = new class157(var49, class170.field3044, var57, var58, class20.method140(var57, 110, var58, class170.field3044) - var50, var52 - -class146.field2635, var53 + class146.field2635, var54, var55, var48, var51);
                    var60.method1028(var56, class20.method140(var56, 90, var59, class170.field3044) - var51, 117, var59, class146.field2635 + var52);
                    class140.field2446.method1290((byte) -44, new class113(var60));
                }
            } else if (class53.field1038 == 193) {
                int var61 = class161.field2902.method1265(116);
                int var62 = ((var61 & 0x79) >> 4) + class225.field4074;
                int var63 = (var61 & 0x7) + class190.field3496;
                int var64 = class161.field2902.method1275(128);
                int var65 = class161.field2902.method1275(128);
                int var66 = class161.field2902.method1275(128);
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                    class191 var67 = class130.field2306[class170.field3044][var62][var63];
                    if (var67 != null) {
                        for (class21 var68 = (class21) var67.method1294(false); var68 != null; var68 = (class21) var67.method1292((byte) 83)) {
                            class257 var69 = var68.field332;
                            if ((var64 & 0x7FFF) == var69.field4629 && var69.field4621 == var65) {
                                var69.field4621 = var66;
                                break;
                            }
                        }
                        class48.method295(var62, var63, 128);
                    }
                }
            } else if (class53.field1038 == 210) {
                int var70 = class161.field2902.method1250((byte) 124);
                int var71 = (var70 >> 4 & 0x7) + class225.field4074;
                int var72 = (var70 & 0x7) + class190.field3496;
                int var73 = class161.field2902.method1259(6385);
                int var74 = class161.field2902.method1275(128);
                if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                    class257 var75 = new class257();
                    var75.field4629 = var73;
                    var75.field4621 = var74;
                    if (class130.field2306[class170.field3044][var71][var72] == null) {
                        class130.field2306[class170.field3044][var71][var72] = new class191();
                    }
                    class130.field2306[class170.field3044][var71][var72].method1290((byte) -44, new class21(var75));
                    class48.method295(var71, var72, 128);
                }
            } else {
                if (class53.field1038 == 211) {
                    int var76 = class161.field2902.method1261(2);
                    byte var77 = class161.field2902.method1249(-65);
                    int var78 = class161.field2902.method1235(-29530);
                    byte var79 = class161.field2902.method1234(false);
                    int var80 = class161.field2902.method1261(2);
                    int var81 = class161.field2902.method1250((byte) 98);
                    int var82 = var81 >> 2;
                    int var83 = class239.field4318[var82];
                    int var84 = var81 & 0x3;
                    int var85 = class161.field2902.method1236(25215);
                    int var86 = class225.field4074 + (var85 >> 4 & 0x7);
                    int var87 = (var85 & 0x7) + class190.field3496;
                    int var88 = class161.field2902.method1259(6385);
                    byte var89 = class161.field2902.method1246(-1);
                    byte var90 = class161.field2902.method1234(false);
                    class32 var91;
                    if (class134.field2352 == var80) {
                        var91 = class229.field4195;
                    } else {
                        var91 = class6.field97[var80];
                    }
                    if (var91 != null) {
                        class209 var92 = class34.method232(167, var76);
                        int var93;
                        int var94;
                        if (var84 == 1 || var84 == 3) {
                            var94 = var92.field3877;
                            var93 = var92.field3836;
                        } else {
                            var93 = var92.field3877;
                            var94 = var92.field3836;
                        }
                        int[][] var95 = class192.field3535[class170.field3044];
                        int var96 = (var94 >> 1) + var87;
                        int var97 = (var93 >> 1) + var86;
                        int var98 = (var93 + 1 >> 1) + var86;
                        int var99 = var87 + (var94 + 1 >> 1);
                        int[][] var100 = null;
                        if (class170.field3044 < 3) {
                            var100 = class192.field3535[class170.field3044 + 1];
                        }
                        int var101 = var95[var97][var99] + var95[var98][var96] + var95[var97][var96] + var95[var98][var99] >> 2;
                        int var102 = (var86 << 7) + (var93 << 6);
                        int var103 = (var87 << 7) + (var94 << 6);
                        class268 var104 = var92.method1462(var82, var84, var95, var100, var103, (class100) null, var102, 15, false, var92.field3838, var101);
                        if (var104 != null) {
                            if (var79 > var89) {
                                byte var105 = var79;
                                var79 = var89;
                                var89 = var105;
                            }
                            class140.method842(var87, 0, (byte) -123, var78 + 1, 0, class170.field3044, -1, var83, var86, var88 + 1);
                            var91.field514 = var86 * 128 + var93 * 64;
                            var91.field535 = var86 + var89;
                            var91.field509 = class146.field2635 + var88;
                            if (var77 > var90) {
                                byte var106 = var77;
                                var77 = var90;
                                var90 = var106;
                            }
                            var91.field548 = var87 * 128 + var94 * 64;
                            var91.field531 = class146.field2635 + var78;
                            var91.field537 = var77 + var87;
                            var91.field517 = (class150) var104.field4802;
                            var91.field511 = var87 + var90;
                            var91.field529 = var79 + var86;
                            var91.field539 = var101;
                        }
                    }
                }
                if (class53.field1038 == 121) {
                    int var107 = class161.field2902.method1259(6385);
                    int var108 = class161.field2902.method1265(117);
                    int var109 = ((var108 & 0x70) >> 4) + class225.field4074;
                    int var110 = (var108 & 0x7) + class190.field3496;
                    if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                        class191 var111 = class130.field2306[class170.field3044][var109][var110];
                        if (var111 != null) {
                            for (class21 var112 = (class21) var111.method1294(false); var112 != null; var112 = (class21) var111.method1292((byte) 76)) {
                                if ((var107 & 0x7FFF) == var112.field332.field4629) {
                                    var112.method349(0);
                                    break;
                                }
                            }
                            if (var111.method1294(false) == null) {
                                class130.field2306[class170.field3044][var109][var110] = null;
                            }
                            class48.method295(var109, var110, 128);
                        }
                    }
                } else if (class53.field1038 == 98) {
                    int var113 = class161.field2902.method1250((byte) 109);
                    int var114 = ((var113 & 0x72) >> 4) + class225.field4074;
                    int var115 = class190.field3496 + (var113 & 0x7);
                    int var116 = class161.field2902.method1259(6385);
                    int var117 = class161.field2902.method1235(-29530);
                    int var118 = class161.field2902.method1261(2);
                    if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104 && class134.field2352 != var117) {
                        class257 var119 = new class257();
                        var119.field4629 = var118;
                        var119.field4621 = var116;
                        if (class130.field2306[class170.field3044][var114][var115] == null) {
                            class130.field2306[class170.field3044][var114][var115] = new class191();
                        }
                        class130.field2306[class170.field3044][var114][var115].method1290((byte) -44, new class21(var119));
                        class48.method295(var114, var115, 128);
                    }
                } else if (class53.field1038 == 46) {
                    int var120 = class161.field2902.method1265(122);
                    int var121 = (var120 & 0x7) + class190.field3496;
                    int var122 = ((var120 & 0x79) >> 4) + class225.field4074;
                    int var123 = var122 + class161.field2902.method1234(false);
                    int var124 = class161.field2902.method1234(false) + var121;
                    int var125 = class161.field2902.method1274((byte) -24);
                    int var126 = class161.field2902.method1275(128);
                    int var127 = class161.field2902.method1265(126) * 4;
                    int var128 = class161.field2902.method1265(125) * 4;
                    int var129 = class161.field2902.method1275(128);
                    int var130 = class161.field2902.method1275(128);
                    int var131 = class161.field2902.method1265(125);
                    int var132 = class161.field2902.method1265(122);
                    if (var122 >= 0 && var121 >= 0 && var122 < 104 && var121 < 104 && var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104 && var126 != 65535) {
                        int var133 = var123 * 128 + 64;
                        int var134 = var124 * 128 + 64;
                        int var135 = var122 * 128 + 64;
                        int var136 = var121 * 128 + 64;
                        class157 var137 = new class157(var126, class170.field3044, var135, var136, class20.method140(var135, 109, var136, class170.field3044) - var127, class146.field2635 + var129, class146.field2635 + var130, var131, var132, var125, var128);
                        var137.method1028(var133, class20.method140(var133, 109, var134, class170.field3044) - var128, 97, var134, var129 + class146.field2635);
                        class140.field2446.method1290((byte) -44, new class113(var137));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V")
    public static final void method361(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -57) {
            field1197 = null;
        }
        class147.field2651 = -1;
        class203.field3691 = class25.field426 * arg0 / arg2;
        class227.field4096 = -1;
        class41.field691 = class169.field3009 * arg3 / arg4;
        field1187++;
        class141.method849((byte) 93);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static final void method362(int arg0) {
        while (true) {
            if (class161.field2902.method809(class42.field708, -2542) >= 11) {
                int var1 = class161.field2902.method798(11, 8);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class6.field97[var1] == null) {
                        class6.field97[var1] = new class32();
                        if (class157.field2830[var1] != null) {
                            class6.field97[var1].method220(128, class157.field2830[var1]);
                        }
                        var2 = true;
                    }
                    class30.field467[class107.field1889++] = var1;
                    class32 var3 = class6.field97[var1];
                    var3.field4146 = class146.field2635;
                    int var4 = class161.field2902.method798(1, 8);
                    if (var4 == 1) {
                        class135.field2379[class268.field4809++] = var1;
                    }
                    int var5 = class161.field2902.method798(1, 8);
                    int var6 = class161.field2902.method798(5, 8);
                    int var7 = class58.field1118[class161.field2902.method798(3, 8)];
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var2) {
                        var3.field4168 = var3.field4183 = var7;
                    }
                    int var8 = class161.field2902.method798(5, 8);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method216(var5 == 1, class229.field4195.field4115[0] + var6, class229.field4195.field4148[0] - -var8, -73);
                    continue;
                }
            }
            field1186++;
            if (arg0 >= -122) {
                method360(12);
            }
            class161.field2902.method800(true);
            return;
        }
    }
}
