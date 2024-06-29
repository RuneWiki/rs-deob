import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class325 extends class86 {

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "[B")
    public byte[] field5063;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field5061 = -1;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "Z")
    public static boolean field5062 = true;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(B)Z", line = 8)
    public static final boolean method2231(byte arg0) {
        field5059++;
        class37 var1 = class126.field1994;
        synchronized (class126.field1994) {
            if (class41.field619 == class161.field2395) {
                return false;
            }
            class170.field2532 = class228.field3537[class41.field619];
            class60.field896 = class182.field2721[class41.field619];
            int var2 = 104 % ((arg0 - 80) / 32);
            class41.field619 = class41.field619 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()V", line = 37)
    public static final void method2232() {
        class6.field55 = 0;
        label194: for (int var0 = 0; var0 < class262.field3901; var0++) {
            class96 var1 = class213.field3389[var0];
            if (class4.field22 != null) {
                for (int var2 = 0; var2 < class4.field22.length; var2++) {
                    if (class4.field22[var2] != -1000000 && (var1.field1406 <= class4.field22[var2] || var1.field1415 <= class4.field22[var2]) && (var1.field1419 <= class105.field1612[var2] || var1.field1416 <= class105.field1612[var2]) && (var1.field1419 >= class238.field3623[var2] || var1.field1416 >= class238.field3623[var2]) && (var1.field1407 <= class289.field4540[var2] || var1.field1427 <= class289.field4540[var2]) && (var1.field1407 >= class87.field1279[var2] || var1.field1427 >= class87.field1279[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field1408 == 1) {
                int var3 = var1.field1423 + class293.field4601 - class310.field4837;
                if (var3 >= 0 && var3 <= class293.field4601 + class293.field4601) {
                    int var4 = var1.field1431 + class293.field4601 - class58.field865;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1409 + class293.field4601 - class58.field865;
                    if (var5 > class293.field4601 + class293.field4601) {
                        var5 = class293.field4601 + class293.field4601;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class312.field4849[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class163.field2430 - var1.field1419;
                        if (var7 > 32) {
                            var1.field1401 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1401 = 2;
                            var7 = -var7;
                        }
                        var1.field1420 = (var1.field1407 - class35.field444 << 8) / var7;
                        var1.field1422 = (var1.field1427 - class35.field444 << 8) / var7;
                        var1.field1403 = (var1.field1406 - class6.field57 << 8) / var7;
                        var1.field1418 = (var1.field1415 - class6.field57 << 8) / var7;
                        class292.field4592[class6.field55++] = var1;
                    }
                }
            } else if (var1.field1408 == 2) {
                int var8 = var1.field1431 + class293.field4601 - class58.field865;
                if (var8 >= 0 && var8 <= class293.field4601 + class293.field4601) {
                    int var9 = var1.field1423 + class293.field4601 - class310.field4837;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1413 + class293.field4601 - class310.field4837;
                    if (var10 > class293.field4601 + class293.field4601) {
                        var10 = class293.field4601 + class293.field4601;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class312.field4849[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class35.field444 - var1.field1407;
                        if (var12 > 32) {
                            var1.field1401 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1401 = 4;
                            var12 = -var12;
                        }
                        var1.field1411 = (var1.field1419 - class163.field2430 << 8) / var12;
                        var1.field1425 = (var1.field1416 - class163.field2430 << 8) / var12;
                        var1.field1403 = (var1.field1406 - class6.field57 << 8) / var12;
                        var1.field1418 = (var1.field1415 - class6.field57 << 8) / var12;
                        class292.field4592[class6.field55++] = var1;
                    }
                }
            } else if (var1.field1408 == 4) {
                int var13 = var1.field1406 - class6.field57;
                if (var13 > 128) {
                    int var14 = var1.field1431 + class293.field4601 - class58.field865;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1409 + class293.field4601 - class58.field865;
                    if (var15 > class293.field4601 + class293.field4601) {
                        var15 = class293.field4601 + class293.field4601;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1423 + class293.field4601 - class310.field4837;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1413 + class293.field4601 - class310.field4837;
                        if (var17 > class293.field4601 + class293.field4601) {
                            var17 = class293.field4601 + class293.field4601;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class312.field4849[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1401 = 5;
                            var1.field1411 = (var1.field1419 - class163.field2430 << 8) / var13;
                            var1.field1425 = (var1.field1416 - class163.field2430 << 8) / var13;
                            var1.field1420 = (var1.field1407 - class35.field444 << 8) / var13;
                            var1.field1422 = (var1.field1427 - class35.field444 << 8) / var13;
                            class292.field4592[class6.field55++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 263)
    public static final void method2233(int arg0) {
        field5060++;
        if (class138.field2146 == 70) {
            int var145 = class88.field1293.method240((byte) 80);
            int var146 = class72.field1043 + (var145 >> 4 & 0x7);
            int var147 = (var145 & 0x7) + class261.field3864;
            int var148 = class88.field1293.method273(65280);
            int var149 = var148 & 0x3;
            int var150 = var148 >> 2;
            int var151 = class27.field304[var150];
            int var152 = class88.field1293.method252((byte) 123);
            if (var146 >= 0 && var147 >= 0 && var146 < 104 && var147 < 104) {
                class92.method733(var149, -1, class50.field775, var152, var151, -119, var147, var150, 0, var146);
            }
        } else if (class138.field2146 == 210) {
            int var1 = class88.field1293.method273(65280);
            int var2 = ((var1 & 0x7B) >> 4) + class72.field1043;
            int var3 = (var1 & 0x7) + class261.field3864;
            int var4 = class88.field1293.method300(-1394191632);
            int var5 = class88.field1293.method273(65280);
            int var6 = class88.field1293.method300(-1394191632);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                int var7 = var3 * 128 + 64;
                int var8 = var2 * 128 + 64;
                class67 var9 = new class67(var4, class50.field775, var8, var7, class294.method2080(899, var7, var8, class50.field775) - var5, var6, class312.field4852);
                class159.field2376.method977(4, new class156(var9));
            }
        } else if (class138.field2146 == 52) {
            int var136 = class88.field1293.method273(65280);
            int var137 = ((var136 & 0x72) >> 4) + class72.field1043;
            int var138 = (var136 & 0x7) + class261.field3864;
            int var139 = class88.field1293.method300(-1394191632);
            int var140 = class88.field1293.method300(-1394191632);
            int var141 = class88.field1293.method300(-1394191632);
            if (var137 >= 0 && var138 >= 0 && var137 < 104 && var138 < 104) {
                class128 var142 = class281.field4336[class50.field775][var137][var138];
                if (var142 != null) {
                    for (class205 var143 = (class205) var142.method986(false); var143 != null; var143 = (class205) var142.method982(14877)) {
                        class307 var144 = var143.field3253;
                        if ((var139 & 0x7FFF) == var144.field4785 && var144.field4787 == var140) {
                            var144.field4787 = var141;
                            break;
                        }
                    }
                    class182.method1313(var137, 1376312589, var138);
                }
            }
        } else if (class138.field2146 == 53) {
            int var127 = class88.field1293.method273(65280);
            int var128 = class72.field1043 + (var127 >> 4 & 0x7);
            int var129 = class261.field3864 + (var127 & 0x7);
            int var130 = class88.field1293.method300(-1394191632);
            if (var130 == 65535) {
                var130 = -1;
            }
            int var131 = class88.field1293.method273(65280);
            int var132 = var131 >> 4 & 0xF;
            int var133 = var131 & 0x7;
            int var134 = class88.field1293.method273(65280);
            if (var128 >= 0 && var129 >= 0 && var128 < 104 && var129 < 104) {
                int var135 = var132 + 1;
                if (class235.field3602.field4477[0] >= var128 - var135 && (var128 + var135) >= class235.field3602.field4477[0] && (var129 - var135) <= class235.field3602.field4470[0] && var129 + var135 >= class235.field3602.field4470[0] && class238.field3618 != 0 && var133 > 0 && class111.field1754 < 50 && var130 != -1) {
                    class54.field817[class111.field1754] = var130;
                    class142.field2199[class111.field1754] = var133;
                    class15.field179[class111.field1754] = var134;
                    class302.field4721[class111.field1754] = null;
                    class133.field2096[class111.field1754] = (var128 << 16) + (var129 << 8) + var132;
                    class111.field1754++;
                }
            }
        } else if (arg0 >= 80) {
            if (class138.field2146 == 132) {
                int var10 = class88.field1293.method273(65280);
                int var11 = class72.field1043 * 2 + (var10 >> 4 & 0xF);
                int var12 = (var10 & 0xF) + class261.field3864 * 2;
                int var13 = class88.field1293.method242((byte) -93) + var11;
                int var14 = var12 + class88.field1293.method242((byte) -93);
                int var15 = class88.field1293.method260((byte) -88);
                int var16 = class88.field1293.method260((byte) 113);
                int var17 = class88.field1293.method300(-1394191632);
                int var18 = class88.field1293.method242((byte) -93);
                int var19 = class88.field1293.method273(65280) * 4;
                int var20 = class88.field1293.method300(-1394191632);
                int var21 = class88.field1293.method300(-1394191632);
                int var22 = class88.field1293.method273(65280);
                if (var22 == 255) {
                    var22 = -1;
                }
                int var23 = class88.field1293.method273(65280);
                if (var11 >= 0 && var12 >= 0 && var11 < 208 && var12 < 208 && var13 >= 0 && var14 >= 0 && var13 < 208 && var14 < 208 && var17 != 65535) {
                    int var24 = var11 * 64;
                    int var25 = var12 * 64;
                    int var26 = var13 * 64;
                    if (var15 != 0) {
                        class288 var29;
                        int var30;
                        if (var15 >= 0) {
                            int var27 = var15 - 1;
                            int var28 = var27 & 0x7FF;
                            var29 = class161.field2394[var28];
                            var30 = (var27 & 0x7A51) >> 11;
                        } else {
                            int var31 = -var15 - 1;
                            var30 = (var31 & 0x78D5) >> 11;
                            int var32 = var31 & 0x7FF;
                            if (class196.field3111 == var32) {
                                var29 = class235.field3602;
                            } else {
                                var29 = class319.field4964[var32];
                            }
                        }
                        if (var29 != null) {
                            class132 var33 = var29.method2030(-13196);
                            if (var33.field2047 != null && var33.field2047[var30] != null) {
                                var18 -= var33.field2047[var30][1];
                                int var34 = var33.field2047[var30][0];
                                int var35 = var33.field2047[var30][2];
                                int var36 = class56.field830[var29.field4438];
                                int var37 = class56.field838[var29.field4438];
                                int var38 = var35 * var37 + (var34 * var36) >> 16;
                                int var39 = var35 * var36 - (var34 * var37) >> 16;
                                var25 += var39;
                                var24 += var38;
                            }
                        }
                    }
                    int var41 = var14 * 64;
                    class176 var42 = new class176(var17, class50.field775, var24, var25, class294.method2080(899, var25, var24, class50.field775) - var18, class312.field4852 + var20, var21 + class312.field4852, var22, var23, var16, var19);
                    var42.method1274(-23830, var41, class294.method2080(899, var41, var26, class50.field775) - var19, class312.field4852 + var20, var26);
                    class184.field2801.method977(4, new class41(var42));
                }
            } else if (class138.field2146 == 18) {
                int var43 = class88.field1293.method252((byte) 121);
                int var44 = class88.field1293.method240((byte) 125);
                int var45 = ((var44 & 0x7D) >> 4) + class72.field1043;
                int var46 = (var44 & 0x7) + class261.field3864;
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                    class128 var47 = class281.field4336[class50.field775][var45][var46];
                    if (var47 != null) {
                        for (class205 var48 = (class205) var47.method986(false); var48 != null; var48 = (class205) var47.method982(14877)) {
                            if ((var43 & 0x7FFF) == var48.field3253.field4785) {
                                var48.method1554((byte) -119);
                                break;
                            }
                        }
                        if (var47.method986(false) == null) {
                            class281.field4336[class50.field775][var45][var46] = null;
                        }
                        class182.method1313(var45, 1376312589, var46);
                    }
                }
            } else if (class138.field2146 == 29) {
                int var120 = class88.field1293.method300(-1394191632);
                int var121 = class88.field1293.method252((byte) 118);
                int var122 = class88.field1293.method245(-8);
                int var123 = class88.field1293.method273(65280);
                int var124 = ((var123 & 0x7B) >> 4) + class72.field1043;
                int var125 = class261.field3864 + (var123 & 0x7);
                if (var124 >= 0 && var125 >= 0 && var124 < 104 && var125 < 104 && class196.field3111 != var120) {
                    class307 var126 = new class307();
                    var126.field4787 = var122;
                    var126.field4785 = var121;
                    if (class281.field4336[class50.field775][var124][var125] == null) {
                        class281.field4336[class50.field775][var124][var125] = new class128();
                    }
                    class281.field4336[class50.field775][var124][var125].method977(4, new class205(var126));
                    class182.method1313(var124, 1376312589, var125);
                }
            } else if (class138.field2146 == 98) {
                int var49 = class88.field1293.method273(65280);
                int var50 = class72.field1043 * 2 + ((var49 & 0xF2) >> 4);
                int var51 = (var49 & 0xF) + class261.field3864 * 2;
                int var52 = var50 + class88.field1293.method242((byte) -93);
                int var53 = var51 + class88.field1293.method242((byte) -93);
                int var54 = class88.field1293.method260((byte) 121);
                int var55 = class88.field1293.method300(-1394191632);
                int var56 = class88.field1293.method273(65280) * 4;
                int var57 = class88.field1293.method273(65280) * 4;
                int var58 = class88.field1293.method300(-1394191632);
                int var59 = class88.field1293.method300(-1394191632);
                int var60 = class88.field1293.method273(65280);
                int var61 = class88.field1293.method273(65280);
                if (var60 == 255) {
                    var60 = -1;
                }
                if (var50 >= 0 && var51 >= 0 && var50 < 208 && var51 < 208 && var52 >= 0 && var53 >= 0 && var52 < 208 && var53 < 208 && var55 != 65535) {
                    int var62 = var51 * 64;
                    int var63 = var52 * 64;
                    int var64 = var50 * 64;
                    int var65 = var53 * 64;
                    class176 var66 = new class176(var55, class50.field775, var64, var62, class294.method2080(899, var62, var64, class50.field775) - var56, var58 - -class312.field4852, class312.field4852 + var59, var60, var61, var54, var57);
                    var66.method1274(-23830, var65, class294.method2080(899, var65, var63, class50.field775) - var57, class312.field4852 + var58, var63);
                    class184.field2801.method977(4, new class41(var66));
                }
            } else if (class138.field2146 == 88) {
                int var112 = class88.field1293.method286(-866);
                int var113 = (var112 >> 4 & 0x7) + class72.field1043;
                int var114 = class261.field3864 + (var112 & 0x7);
                int var115 = class88.field1293.method245(-16);
                int var116 = class88.field1293.method286(-866);
                int var117 = var116 >> 2;
                int var118 = var116 & 0x3;
                int var119 = class27.field304[var117];
                if (var115 == 65535) {
                    var115 = -1;
                }
                class96.method763(var114, -3, var115, class50.field775, var113, var119, var117, var118);
            } else if (class138.field2146 == 165) {
                int var105 = class88.field1293.method286(-866);
                int var106 = (var105 >> 4 & 0x7) + class72.field1043;
                int var107 = class261.field3864 + (var105 & 0x7);
                int var108 = class88.field1293.method240((byte) 113);
                int var109 = var108 >> 2;
                int var110 = var108 & 0x3;
                int var111 = class27.field304[var109];
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    class92.method733(var110, -1, class50.field775, -1, var111, 76, var107, var109, 0, var106);
                }
            } else if (class138.field2146 == 101) {
                int var87 = class88.field1293.method273(65280);
                int var88 = class261.field3864 + (var87 & 0x7);
                int var89 = class72.field1043 + (var87 >> 4 & 0x7);
                int var90 = var89 + class88.field1293.method242((byte) -93);
                int var91 = class88.field1293.method242((byte) -93) + var88;
                int var92 = class88.field1293.method260((byte) -16);
                int var93 = class88.field1293.method300(-1394191632);
                int var94 = class88.field1293.method273(65280) * 4;
                int var95 = class88.field1293.method273(65280) * 4;
                int var96 = class88.field1293.method300(-1394191632);
                int var97 = class88.field1293.method300(-1394191632);
                int var98 = class88.field1293.method273(65280);
                int var99 = class88.field1293.method273(65280);
                if (var98 == 255) {
                    var98 = -1;
                }
                if (var89 >= 0 && var88 >= 0 && var89 < 104 && var88 < 104 && var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && var93 != 65535) {
                    int var100 = var89 * 128 + 64;
                    int var101 = var88 * 128 + 64;
                    class176 var102 = new class176(var93, class50.field775, var100, var101, class294.method2080(899, var101, var100, class50.field775) - var94, class312.field4852 + var96, class312.field4852 + var97, var98, var99, var92, var95);
                    int var103 = var91 * 128 + 64;
                    int var104 = var90 * 128 + 64;
                    var102.method1274(-23830, var103, class294.method2080(899, var103, var104, class50.field775) - var95, class312.field4852 + var96, var104);
                    class184.field2801.method977(4, new class41(var102));
                }
            } else if (class138.field2146 == 61) {
                int var81 = class88.field1293.method245(-56);
                int var82 = class88.field1293.method300(-1394191632);
                int var83 = class88.field1293.method286(-866);
                int var84 = ((var83 & 0x71) >> 4) + class72.field1043;
                int var85 = class261.field3864 + (var83 & 0x7);
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    class307 var86 = new class307();
                    var86.field4787 = var81;
                    var86.field4785 = var82;
                    if (class281.field4336[class50.field775][var84][var85] == null) {
                        class281.field4336[class50.field775][var84][var85] = new class128();
                    }
                    class281.field4336[class50.field775][var84][var85].method977(4, new class205(var86));
                    class182.method1313(var84, 1376312589, var85);
                }
            } else if (class138.field2146 == 56) {
                int var67 = class88.field1293.method245(-115);
                int var68 = class88.field1293.method252((byte) 125);
                byte var69 = class88.field1293.method242((byte) -93);
                int var70 = class88.field1293.method258(437);
                int var71 = class88.field1293.method273(65280);
                int var72 = (var71 >> 4 & 0x7) + class72.field1043;
                int var73 = (var71 & 0x7) + class261.field3864;
                byte var74 = class88.field1293.method242((byte) -93);
                int var75 = class88.field1293.method260((byte) 127);
                byte var76 = class88.field1293.method298(25537);
                byte var77 = class88.field1293.method248(128);
                int var78 = class88.field1293.method246(-18967);
                int var79 = var78 >> 2;
                int var80 = var78 & 0x3;
                if (!class36.field534) {
                    class119.method925(var79, var74, var69, var73, var72, var75, var80, var68, 113, var67, var76, var70, var77);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "([B)V", line = 845)
    public class325(byte[] arg0) {
        this.field5063 = arg0;
    }
}
