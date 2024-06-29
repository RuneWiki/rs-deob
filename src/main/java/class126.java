import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class126 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lrc;")
    public static class105 field3055 = class43.method374("mapfunction", 0);

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lrc;")
    private static class105 field3059 = class43.method374("glow3:", 0);

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lrc;")
    public static class105 field3057 = field3059;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "[[[Lab;")
    public static class3[][][] field3060 = new class3[4][104][104];

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lrc;")
    public static class105 field3062 = class43.method374("gleiten:", 0);

    @OriginalMember(owner = "client!v", name = "i", descriptor = "[J")
    public static long[] field3063 = new long[100];

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lmd;")
    public static class76 field3066;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)V", line = 11)
    public static final void method1015(long arg0, int arg1) {
        field3058++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 < 64) {
            field3066 = null;
        }
        for (int var3 = 0; var3 < class17.field361; var3++) {
            if (class37.field866[var3] == arg0) {
                class17.field361--;
                class14.field260++;
                class80.field1805 = true;
                for (int var4 = var3; var4 < class17.field361; var4++) {
                    class37.field866[var4] = class37.field866[var4 + 1];
                }
                class66.field1472.method781(5, (byte) -97);
                class66.field1472.method64(arg0, -65);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(JI)V", line = 56)
    public static final void method1016(long arg0, int arg1) {
        field3056++;
        if (arg0 == 0L) {
            return;
        }
        if (class81.field1817 >= 100 && class72.field1591 != 1 || class81.field1817 >= 200) {
            client.method207(class43.field992, -126, 0, class92.field2104);
            return;
        }
        class105 var3 = class65.method553(arg0, -31825).method844(21975);
        for (int var4 = 0; var4 < class81.field1817; var4++) {
            if (class12.field238[var4] == arg0) {
                client.method207(class43.field992, -78, 0, class108.method878(new class105[] { var3, class117.field2745 }, 2867));
                return;
            }
        }
        for (int var5 = 0; var5 < class17.field361; var5++) {
            if (class37.field866[var5] == arg0) {
                client.method207(class43.field992, -2, 0, class108.method878(new class105[] { class16.field321, var3, class88.field2010 }, 2867));
                return;
            }
        }
        if (var3.method829(true, class119.field2842.field300)) {
            return;
        }
        class59.field1313++;
        class86.field1938[class81.field1817] = var3;
        class12.field238[class81.field1817] = arg0;
        if (arg1 != -21650) {
            method1015(-68L, 114);
        }
        class122.field2994[class81.field1817] = 0;
        class80.field1805 = true;
        class81.field1817++;
        class66.field1472.method781(159, (byte) -126);
        class66.field1472.method64(arg0, -114);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIII)V", line = 122)
    public static final void method1017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 9111) {
            field3062 = null;
        }
        field3067++;
        if (class29.method273(arg3, 110)) {
            class92.method761(class14.field282[arg3], arg6, 2, arg0, arg1, 0, arg8, arg5, 0, arg4, arg7, -1);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 178)
    public static final void method1018(byte arg0) {
        field3061++;
        if (class61.field1348 == 134) {
            int var1 = class18.field389.method67(0);
            int var2 = class18.field389.method90(57);
            int var3 = class43.field982 + (var2 >> 4 & 0x7);
            int var4 = class106.field2430 + (var2 & 0x7);
            int var5 = class18.field389.method101(2);
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                class98 var6 = new class98();
                var6.field2265 = var1;
                var6.field2255 = var5;
                if (field3060[class73.field1619][var3][var4] == null) {
                    field3060[class73.field1619][var3][var4] = new class3();
                }
                field3060[class73.field1619][var3][var4].method23(1024, var6);
                class86.method713(var4, var3, 1610612736);
            }
            return;
        }
        if (class61.field1348 == 221) {
            int var7 = class18.field389.method67(0);
            byte var8 = class18.field389.method112((byte) -27);
            int var9 = class18.field389.method65(false);
            int var10 = (var9 & 0x7) + class106.field2430;
            int var11 = (var9 >> 4 & 0x7) + class43.field982;
            byte var12 = class18.field389.method72(120);
            int var13 = class18.field389.method103(0);
            int var14 = class18.field389.method103(0);
            byte var15 = class18.field389.method85(-4794);
            int var16 = class18.field389.method96(27023);
            int var17 = var16 & 0x3;
            int var18 = var16 >> 2;
            int var19 = class18.field417[var18];
            byte var20 = class18.field389.method112((byte) -27);
            int var21 = class18.field389.method103(0);
            class15 var22;
            if (class55.field1112 == var14) {
                var22 = class119.field2842;
            } else {
                var22 = class58.field1303[var14];
            }
            if (var22 != null) {
                class121 var23 = class12.method149(var7, (byte) 62);
                int var24 = class9.field151[class73.field1619][var11][var10];
                int var25 = class9.field151[class73.field1619][var11 + 1][var10 + 1];
                int var26 = class9.field151[class73.field1619][var11][var10 + 1];
                int var27 = class9.field151[class73.field1619][var11 + 1][var10];
                class56 var28 = var23.method983(var25, var26, var27, var24, var17, (byte) 90, var18);
                if (var28 != null) {
                    class96.method795(var11, 0, var21 + 1, var13 + 1, class73.field1619, true, -1, var10, var19, 0);
                    var22.field292 = var21 + class104.field2351;
                    var22.field304 = class104.field2351 + var13;
                    if (var8 > var15) {
                        byte var29 = var8;
                        var8 = var15;
                        var15 = var29;
                    }
                    int var30 = var23.field2906;
                    int var31 = var23.field2912;
                    if (var17 == 1 || var17 == 3) {
                        var31 = var23.field2906;
                        var30 = var23.field2912;
                    }
                    var22.field288 = var28;
                    var22.field294 = var10 * 128 + var31 * 64;
                    var22.field307 = var11 * 128 + var30 * 64;
                    if (var20 < var12) {
                        byte var32 = var12;
                        var12 = var20;
                        var20 = var32;
                    }
                    var22.field316 = class134.method1061(11387, class73.field1619, var22.field307, var22.field294);
                    var22.field319 = var11 + var15;
                    var22.field302 = var10 + var12;
                    var22.field317 = var10 + var20;
                    var22.field297 = var8 + var11;
                }
            }
        }
        if (class61.field1348 == 36) {
            int var33 = class18.field389.method65(false);
            int var34 = var33 & 0x3;
            int var35 = var33 >> 2;
            int var36 = class18.field417[var35];
            int var37 = class18.field389.method96(27023);
            int var38 = class106.field2430 + (var37 & 0x7);
            int var39 = (var37 >> 4 & 0x7) + class43.field982;
            if (var39 >= 0 && var38 >= 0 && var39 < 104 && var38 < 104) {
                class96.method795(var39, var35, -1, 0, class73.field1619, true, -1, var38, var36, var34);
            }
        } else if (class61.field1348 == 103) {
            int var40 = class18.field389.method103(0);
            int var41 = class18.field389.method67(0);
            int var42 = class18.field389.method96(27023);
            int var43 = (var42 >> 4 & 0x7) + class43.field982;
            int var44 = (var42 & 0x7) + class106.field2430;
            int var45 = class18.field389.method103(0);
            if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104 && class55.field1112 != var41) {
                class98 var46 = new class98();
                var46.field2265 = var45;
                var46.field2255 = var40;
                if (field3060[class73.field1619][var43][var44] == null) {
                    field3060[class73.field1619][var43][var44] = new class3();
                }
                field3060[class73.field1619][var43][var44].method23(1024, var46);
                class86.method713(var44, var43, 1610612736);
            }
        } else if (class61.field1348 == 218) {
            int var47 = class18.field389.method96(27023);
            int var48 = (var47 & 0x7) + class106.field2430;
            int var49 = class43.field982 + (var47 >> 4 & 0x7);
            int var50 = class18.field389.method101(2);
            int var51 = class18.field389.method101(2);
            int var52 = class18.field389.method101(2);
            if (var49 >= 0 && var48 >= 0 && var49 < 104 && var48 < 104) {
                class3 var53 = field3060[class73.field1619][var49][var48];
                if (var53 != null) {
                    for (class98 var54 = (class98) var53.method31(1280); var54 != null; var54 = (class98) var53.method26((byte) 108)) {
                        if ((var50 & 0x7FFF) == var54.field2255 && var54.field2265 == var51) {
                            var54.field2265 = var52;
                            break;
                        }
                    }
                    class86.method713(var48, var49, 1610612736);
                }
            }
        } else {
            int var55 = -123 % ((-arg0 - 30) / 50);
            if (class61.field1348 == 75) {
                int var56 = class18.field389.method103(0);
                int var57 = class18.field389.method90(101);
                int var58 = class43.field982 + (var57 >> 4 & 0x7);
                int var59 = (var57 & 0x7) + class106.field2430;
                int var60 = class18.field389.method90(118);
                int var61 = var60 >> 2;
                int var62 = var60 & 0x3;
                int var63 = class18.field417[var61];
                if (var58 >= 0 && var59 >= 0 && var58 < 103 && var59 < 103) {
                    int var64 = class9.field151[class73.field1619][var58][var59];
                    int var65 = class9.field151[class73.field1619][var58][var59 + 1];
                    int var66 = class9.field151[class73.field1619][var58 + 1][var59];
                    int var67 = class9.field151[class73.field1619][var58 + 1][var59 + 1];
                    if (var63 == 0) {
                        class78 var68 = class130.field3161.method520(class73.field1619, var58, var59);
                        if (var68 != null) {
                            int var69 = var68.field1747 >> 14 & 0x7FFF;
                            if (var61 == 2) {
                                var68.field1762 = new class67(var69, 2, var62 + 4, var64, var66, var67, var65, var56, false, var68.field1762);
                                var68.field1770 = new class67(var69, 2, var62 + 1 & 0x3, var64, var66, var67, var65, var56, false, var68.field1770);
                            } else {
                                var68.field1762 = new class67(var69, var61, var62, var64, var66, var67, var65, var56, false, var68.field1762);
                            }
                        }
                    }
                    if (var63 == 1) {
                        class102 var70 = class130.field3161.method505(class73.field1619, var58, var59);
                        if (var70 != null) {
                            var70.field2300 = new class67(var70.field2310 >> 14 & 0x7FFF, 4, 0, var64, var66, var67, var65, var56, false, var70.field2300);
                        }
                    }
                    if (var63 == 2) {
                        if (var61 == 11) {
                            var61 = 10;
                        }
                        class83 var71 = class130.field3161.method513(class73.field1619, var58, var59);
                        if (var71 != null) {
                            var71.field1873 = new class67(var71.field1847 >> 14 & 0x7FFF, var61, var62, var64, var66, var67, var65, var56, false, var71.field1873);
                        }
                    }
                    if (var63 == 3) {
                        class37 var72 = class130.field3161.method517(class73.field1619, var58, var59);
                        if (var72 != null) {
                            var72.field848 = new class67(var72.field840 >> 14 & 0x7FFF, 22, var62, var64, var66, var67, var65, var56, false, var72.field848);
                        }
                    }
                }
            } else if (class61.field1348 == 23) {
                int var73 = class18.field389.method96(27023);
                int var74 = class43.field982 + (var73 >> 4 & 0x7);
                int var75 = (var73 & 0x7) + class106.field2430;
                int var76 = class18.field389.method85(-4794) + var74;
                int var77 = class18.field389.method85(-4794) + var75;
                int var78 = class18.field389.method99((byte) 66);
                int var79 = class18.field389.method101(2);
                int var80 = class18.field389.method96(27023) * 4;
                int var81 = class18.field389.method96(27023) * 4;
                int var82 = class18.field389.method101(2);
                int var83 = class18.field389.method101(2);
                int var84 = class18.field389.method96(27023);
                int var85 = class18.field389.method96(27023);
                if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104 && var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104 && var79 != 65535) {
                    int var86 = var74 * 128 + 64;
                    int var87 = var77 * 128 + 64;
                    int var88 = var75 * 128 + 64;
                    int var89 = var76 * 128 + 64;
                    class134 var90 = new class134(var79, class73.field1619, var86, var88, class134.method1061(11387, class73.field1619, var86, var88) - var80, var82 - -class104.field2351, class104.field2351 + var83, var84, var85, var78, var81);
                    var90.method1058(class104.field2351 + var82, var89, class134.method1061(11387, class73.field1619, var89, var87) - var81, var87, false);
                    class58.field1234.method23(1024, var90);
                }
            } else if (class61.field1348 == 172) {
                int var91 = class18.field389.method96(27023);
                int var92 = class43.field982 + (var91 >> 4 & 0x7);
                int var93 = class106.field2430 + (var91 & 0x7);
                int var94 = class18.field389.method101(2);
                int var95 = class18.field389.method96(27023);
                int var96 = class18.field389.method101(2);
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                    int var97 = var92 * 128 + 64;
                    int var98 = var93 * 128 + 64;
                    class42 var99 = new class42(var94, class73.field1619, var97, var98, class134.method1061(11387, class73.field1619, var97, var98) - var95, var96, class104.field2351);
                    class125.field3052.method23(1024, var99);
                }
            } else if (class61.field1348 == 59) {
                int var100 = class18.field389.method106((byte) -110);
                int var101 = (var100 & 0x7) + class106.field2430;
                int var102 = class43.field982 + (var100 >> 4 & 0x7);
                int var103 = class18.field389.method90(67);
                int var104 = var103 & 0x3;
                int var105 = var103 >> 2;
                int var106 = class18.field417[var105];
                int var107 = class18.field389.method108((byte) -126);
                if (var102 >= 0 && var101 >= 0 && var102 < 104 && var101 < 104) {
                    class96.method795(var102, var105, -1, 0, class73.field1619, true, var107, var101, var106, var104);
                }
            } else if (class61.field1348 == 214) {
                int var108 = class18.field389.method108((byte) -127);
                int var109 = class18.field389.method106((byte) 29);
                int var110 = class43.field982 + (var109 >> 4 & 0x7);
                int var111 = (var109 & 0x7) + class106.field2430;
                if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                    class3 var112 = field3060[class73.field1619][var110][var111];
                    if (var112 != null) {
                        for (class98 var113 = (class98) var112.method31(1280); var113 != null; var113 = (class98) var112.method26((byte) 108)) {
                            if ((var108 & 0x7FFF) == var113.field2255) {
                                var113.method551(40);
                                break;
                            }
                        }
                        if (var112.method31(1280) == null) {
                            field3060[class73.field1619][var110][var111] = null;
                        }
                        class86.method713(var111, var110, 1610612736);
                    }
                }
            } else if (class61.field1348 == 217) {
                int var114 = class18.field389.method96(27023);
                int var115 = (var114 >> 4 & 0x7) + class43.field982;
                int var116 = (var114 & 0x7) + class106.field2430;
                int var117 = class18.field389.method101(2);
                int var118 = class18.field389.method96(27023);
                int var119 = var118 >> 4 & 0xF;
                int var120 = var118 & 0x7;
                int var121 = class18.field389.method96(27023);
                if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                    int var122 = var119 + 1;
                    if (class119.field2842.field1281[0] >= var115 - var122 && class119.field2842.field1281[0] <= var115 + var122 && var116 - var122 <= class119.field2842.field1261[0] && var116 + var122 >= class119.field2842.field1261[0] && class92.field2152 != 0 && var120 > 0 && class104.field2353 < 50) {
                        class115.field2673[class104.field2353] = var117;
                        class30.field696[class104.field2353] = var120;
                        client.field446[class104.field2353] = var121;
                        class72.field1594[class104.field2353] = null;
                        class34.field799[class104.field2353] = (var115 << 16) + var119 + (var116 << 8);
                        class104.field2353++;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 715)
    public static void method1019(byte arg0) {
        field3059 = null;
        field3057 = null;
        field3066 = null;
        field3062 = null;
        field3063 = null;
        if (arg0 < -11) {
            field3060 = null;
            field3055 = null;
        }
    }
}
