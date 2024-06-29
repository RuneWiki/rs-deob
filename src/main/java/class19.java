import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class19 {

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lhe;")
    private static class54 field538 = class6.method58("Malformed login packet)3", false);

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field543 = 0;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "Lhe;")
    public static class54 field563 = class6.method58("sl_arrows", false);

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "Lhe;")
    private static class54 field566 = class6.method58("Service unavailable)3", false);

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
    public static int[] field544 = new int[50];

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Lhe;")
    public static class54 field565 = field566;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "[I")
    private static int[] field559 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lhe;")
    public static class54 field548 = field538;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field552 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Ljava/lang/Object;")
    public static Object field568 = new Object();

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Lsf;")
    public static class131 field569 = new class131(64);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public int field539;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "[Lce;")
    public static class20[] field561;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static final void method157(int arg0) {
        field540++;
        if (class85.field2123 == 39) {
            int var1 = class40.field1044.method645(0);
            int var2 = class40.field1044.method662(arg0 ^ 0xFFFF8068);
            int var3 = (var2 >> 4 & 0x7) + class48.field1157;
            int var4 = class129.field2914 + (var2 & 0x7);
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                class130 var5 = class77.field1878[class157.field3573][var3][var4];
                if (var5 != null) {
                    for (class48 var6 = (class48) var5.method979(-127); var6 != null; var6 = (class48) var5.method983(18485)) {
                        if ((var1 & 0x7FFF) == var6.field1169) {
                            var6.method48(arg0 ^ 0x152);
                            break;
                        }
                    }
                    if (var5.method979(-127) == null) {
                        class77.field1878[class157.field3573][var3][var4] = null;
                    }
                    class124.method951(var4, var3, arg0 ^ 0xFFFFFFD7);
                }
            }
        } else if (class85.field2123 == 186) {
            int var7 = class40.field1044.method638(0);
            int var8 = (var7 & 0x7) + class129.field2914;
            int var9 = (var7 >> 4 & 0x7) + class48.field1157;
            int var10 = class40.field1044.method631((byte) -101);
            int var11 = class40.field1044.method638(0);
            int var12 = class40.field1044.method631((byte) -100);
            if (var9 >= 0 && var8 >= 0 && var9 < 104 && var8 < 104) {
                int var13 = var9 * 128 + 64;
                int var14 = var8 * 128 + 64;
                class44 var15 = new class44(var10, class157.field3573, var13, var14, class134.method1007(var13, var14, true, class157.field3573) - var11, var12, class4.field138);
                class95.field2393.method976(var15, (byte) -115);
            }
        } else {
            if (class85.field2123 == 239) {
                int var16 = class40.field1044.method631((byte) -105);
                int var17 = class40.field1044.method645(0);
                byte var18 = class40.field1044.method651(-123);
                byte var19 = class40.field1044.method664(0);
                int var20 = class40.field1044.method661((byte) 69);
                int var21 = (var20 & 0x7) + class129.field2914;
                int var22 = (var20 >> 4 & 0x7) + class48.field1157;
                byte var23 = class40.field1044.method683(arg0 ^ 0x39);
                int var24 = class40.field1044.method645(0);
                int var25 = class40.field1044.method661((byte) 66);
                int var26 = var25 >> 2;
                int var27 = var25 & 0x3;
                int var28 = field559[var26];
                byte var29 = class40.field1044.method667(12605);
                int var30 = class40.field1044.method635((byte) -93);
                class22 var31;
                if (class4.field131 == var16) {
                    var31 = class108.field2639;
                } else {
                    var31 = class48.field1148[var16];
                }
                if (var31 != null) {
                    class3 var32 = class4.method34(true, var30);
                    int var33 = class141.field3211[class157.field3573][var22][var21];
                    int var34 = class141.field3211[class157.field3573][var22 + 1][var21];
                    int var35 = class141.field3211[class157.field3573][var22 + 1][var21 + 1];
                    int var36 = class141.field3211[class157.field3573][var22][var21 + 1];
                    class98 var37 = var32.method15(var34, var26, var27, var35, var36, false, var33);
                    if (var37 != null) {
                        class57.method445(-1, 0, var22, 0, var28, -1, var17 + 1, var21, var24 + 1, class157.field3573);
                        var31.field634 = class4.field138 + var24;
                        int var38 = var32.field67;
                        var31.field641 = var17 + class4.field138;
                        var31.field629 = var37;
                        if (var19 > var29) {
                            byte var39 = var19;
                            var19 = var29;
                            var29 = var39;
                        }
                        int var40 = var32.field86;
                        if (var18 < var23) {
                            byte var41 = var23;
                            var23 = var18;
                            var18 = var41;
                        }
                        if (var27 == 1 || var27 == 3) {
                            var40 = var32.field67;
                            var38 = var32.field86;
                        }
                        var31.field631 = var21 * 128 + var40 * 64;
                        var31.field635 = var22 * 128 + var38 * 64;
                        var31.field616 = class134.method1007(var31.field635, var31.field631, true, class157.field3573);
                        var31.field624 = var18 + var21;
                        var31.field645 = var22 + var29;
                        var31.field644 = var19 + var22;
                        var31.field638 = var21 + var23;
                    }
                }
            }
            if (class85.field2123 == 218) {
                int var42 = class40.field1044.method638(0);
                int var43 = (var42 >> 4 & 0x7) + class48.field1157;
                int var44 = (var42 & 0x7) + class129.field2914;
                int var45 = class40.field1044.method651(arg0 ^ 0xFFFFFFCF) + var43;
                int var46 = var44 + class40.field1044.method651(14);
                int var47 = class40.field1044.method660((byte) -56);
                int var48 = class40.field1044.method631((byte) -107);
                int var49 = class40.field1044.method638(0) * 4;
                int var50 = class40.field1044.method638(0) * 4;
                int var51 = class40.field1044.method631((byte) -100);
                int var52 = class40.field1044.method631((byte) -105);
                int var53 = class40.field1044.method638(arg0 + 105);
                int var54 = class40.field1044.method638(arg0 ^ 0xFFFFFF97);
                if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104 && var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && var48 != 65535) {
                    int var55 = var44 * 128 + 64;
                    int var56 = var45 * 128 + 64;
                    int var57 = var46 * 128 + 64;
                    int var58 = var43 * 128 + 64;
                    class70 var59 = new class70(var48, class157.field3573, var58, var55, class134.method1007(var58, var55, true, class157.field3573) - var49, class4.field138 + var51, class4.field138 + var52, var53, var54, var47, var50);
                    var59.method552(var56, class134.method1007(var56, var57, true, class157.field3573) - var50, var51 - -class4.field138, var57, 121);
                    class85.field2106.method976(var59, (byte) -117);
                }
            } else {
                if (arg0 != -105) {
                    field543 = -53;
                }
                if (class85.field2123 == 208) {
                    int var60 = class40.field1044.method638(0);
                    int var61 = (var60 >> 4 & 0x7) + class48.field1157;
                    int var62 = (var60 & 0x7) + class129.field2914;
                    int var63 = class40.field1044.method631((byte) -107);
                    int var64 = class40.field1044.method631((byte) -119);
                    int var65 = class40.field1044.method631((byte) -101);
                    if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                        class130 var66 = class77.field1878[class157.field3573][var61][var62];
                        if (var66 != null) {
                            for (class48 var67 = (class48) var66.method979(-126); var67 != null; var67 = (class48) var66.method983(18485)) {
                                if ((var63 & 0x7FFF) == var67.field1169 && var67.field1168 == var64) {
                                    var67.field1168 = var65;
                                    break;
                                }
                            }
                            class124.method951(var62, var61, 64);
                        }
                    }
                } else {
                    if (class85.field2123 == 61) {
                        int var68 = class40.field1044.method638(0);
                        int var69 = (var68 >> 4 & 0x7) + class48.field1157;
                        int var70 = (var68 & 0x7) + class129.field2914;
                        int var71 = class40.field1044.method631((byte) -121);
                        int var72 = class40.field1044.method638(0);
                        int var73 = var72 >> 4 & 0xF;
                        int var74 = var72 & 0x7;
                        int var75 = class40.field1044.method638(0);
                        if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                            int var76 = var73 + 1;
                            if (var69 - var76 <= class108.field2639.field952[0] && class108.field2639.field952[0] <= var69 + var76 && class108.field2639.field951[0] >= var70 - var76 && class108.field2639.field951[0] <= var70 + var76 && class139.field3190 != 0 && var74 > 0 && class8.field227 < 50) {
                                class39.field999[class8.field227] = var71;
                                field544[class8.field227] = var74;
                                class50.field1217[class8.field227] = var75;
                                class89.field2188[class8.field227] = null;
                                class1.field19[class8.field227] = (var69 << 16) + (var70 << 8) + var73;
                                class8.field227++;
                            }
                        }
                    }
                    if (class85.field2123 == 26) {
                        int var77 = class40.field1044.method662(32767);
                        int var78 = (var77 & 0x7) + class129.field2914;
                        int var79 = class48.field1157 + (var77 >> 4 & 0x7);
                        int var80 = class40.field1044.method645(arg0 ^ 0xFFFFFF97);
                        int var81 = class40.field1044.method645(arg0 + 105);
                        int var82 = class40.field1044.method657((byte) 109);
                        if (var79 >= 0 && var78 >= 0 && var79 < 104 && var78 < 104 && class4.field131 != var82) {
                            class48 var83 = new class48();
                            var83.field1169 = var81;
                            var83.field1168 = var80;
                            if (class77.field1878[class157.field3573][var79][var78] == null) {
                                class77.field1878[class157.field3573][var79][var78] = new class130();
                            }
                            class77.field1878[class157.field3573][var79][var78].method976(var83, (byte) -123);
                            class124.method951(var78, var79, arg0 + 169);
                        }
                    } else if (class85.field2123 == 16) {
                        int var84 = class40.field1044.method661((byte) 59);
                        int var85 = var84 & 0x3;
                        int var86 = var84 >> 2;
                        int var87 = field559[var86];
                        int var88 = class40.field1044.method661((byte) 126);
                        int var89 = (var88 >> 4 & 0x7) + class48.field1157;
                        int var90 = class129.field2914 + (var88 & 0x7);
                        if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                            class57.method445(-1, var85, var89, var86, var87, -1, 0, var90, -1, class157.field3573);
                        }
                    } else if (class85.field2123 == 17) {
                        int var91 = class40.field1044.method661((byte) 45);
                        int var92 = class48.field1157 + (var91 >> 4 & 0x7);
                        int var93 = class129.field2914 + (var91 & 0x7);
                        int var94 = class40.field1044.method635((byte) -108);
                        int var95 = class40.field1044.method661((byte) 44);
                        int var96 = var95 & 0x3;
                        int var97 = var95 >> 2;
                        int var98 = field559[var97];
                        if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                            class57.method445(-1, var96, var92, var97, var98, var94, 0, var93, -1, class157.field3573);
                        }
                    } else if (class85.field2123 == 140) {
                        int var99 = class40.field1044.method657((byte) -64);
                        int var100 = class40.field1044.method638(0);
                        int var101 = (var100 >> 4 & 0x7) + class48.field1157;
                        int var102 = class129.field2914 + (var100 & 0x7);
                        int var103 = class40.field1044.method638(0);
                        int var104 = var103 & 0x3;
                        int var105 = var103 >> 2;
                        int var106 = field559[var105];
                        if (var101 >= 0 && var102 >= 0 && var101 < 103 && var102 < 103) {
                            int var107 = class141.field3211[class157.field3573][var101 + 1][var102 + 1];
                            int var108 = class141.field3211[class157.field3573][var101][var102 + 1];
                            int var109 = class141.field3211[class157.field3573][var101 + 1][var102];
                            int var110 = class141.field3211[class157.field3573][var101][var102];
                            if (var106 == 0) {
                                class135 var111 = class74.field1831.method1059(class157.field3573, var101, var102);
                                if (var111 != null) {
                                    int var112 = var111.field3054 >> 14 & 0x7FFF;
                                    if (var105 == 2) {
                                        var111.field3055 = new class74(var112, 2, var104 + 4, var110, var109, var107, var108, var99, false, var111.field3055);
                                        var111.field3058 = new class74(var112, 2, var104 + 1 & 0x3, var110, var109, var107, var108, var99, false, var111.field3058);
                                    } else {
                                        var111.field3055 = new class74(var112, var105, var104, var110, var109, var107, var108, var99, false, var111.field3055);
                                    }
                                }
                            }
                            if (var106 == 1) {
                                class50 var113 = class74.field1831.method1028(class157.field3573, var101, var102);
                                if (var113 != null) {
                                    var113.field1194 = new class74(var113.field1196 >> 14 & 0x7FFF, 4, 0, var110, var109, var107, var108, var99, false, var113.field1194);
                                }
                            }
                            if (var106 == 2) {
                                if (var105 == 11) {
                                    var105 = 10;
                                }
                                class134 var114 = class74.field1831.method1032(class157.field3573, var101, var102);
                                if (var114 != null) {
                                    var114.field3049 = new class74(var114.field3044 >> 14 & 0x7FFF, var105, var104, var110, var109, var107, var108, var99, false, var114.field3049);
                                }
                            }
                            if (var106 == 3) {
                                class147 var115 = class74.field1831.method1025(class157.field3573, var101, var102);
                                if (var115 != null) {
                                    var115.field3317 = new class74(var115.field3314 >> 14 & 0x7FFF, 22, var104, var110, var109, var107, var108, var99, false, var115.field3317);
                                }
                            }
                        }
                    } else if (class85.field2123 == 112) {
                        int var116 = class40.field1044.method631((byte) -117);
                        int var117 = class40.field1044.method635((byte) -124);
                        int var118 = class40.field1044.method662(32767);
                        int var119 = (var118 >> 4 & 0x7) + class48.field1157;
                        int var120 = class129.field2914 + (var118 & 0x7);
                        if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104) {
                            class48 var121 = new class48();
                            var121.field1168 = var117;
                            var121.field1169 = var116;
                            if (class77.field1878[class157.field3573][var119][var120] == null) {
                                class77.field1878[class157.field3573][var119][var120] = new class130();
                            }
                            class77.field1878[class157.field3573][var119][var120].method976(var121, (byte) -116);
                            class124.method951(var120, var119, arg0 + 169);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIII)V")
    public static final void method158(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            field568 = null;
        }
        for (int var5 = arg1; var5 <= arg1 + arg3; var5++) {
            for (int var6 = arg4; var6 <= arg4 + arg0; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class100.field2530[0][var6][var5] = 127;
                    if (arg4 == var6 && var6 > 0) {
                        class141.field3211[0][var6][var5] = class141.field3211[0][var6 - 1][var5];
                    }
                    if (arg0 + arg4 == var6 && var6 < 103) {
                        class141.field3211[0][var6][var5] = class141.field3211[0][var6 + 1][var5];
                    }
                    if (arg1 == var5 && var5 > 0) {
                        class141.field3211[0][var6][var5] = class141.field3211[0][var6][var5 - 1];
                    }
                    if (arg1 + arg3 == var5 && var5 < 103) {
                        class141.field3211[0][var6][var5] = class141.field3211[0][var6][var5 + 1];
                    }
                }
            }
        }
        field547++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I")
    public static final int method159(int arg0, int arg1) {
        field560++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg0 != -473856792) {
            field552 = null;
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static void method160(boolean arg0) {
        field566 = null;
        if (!arg0) {
            method159(-102, -78);
        }
        field561 = null;
        field544 = null;
        field568 = null;
        field548 = null;
        field538 = null;
        field565 = null;
        field569 = null;
        field563 = null;
        field552 = null;
        field559 = null;
    }
}
