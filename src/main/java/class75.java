import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class75 extends class136 {

    @OriginalMember(owner = "client!m", name = "B", descriptor = "[I")
    public int[] field1826 = new int[1];

    @OriginalMember(owner = "client!m", name = "G", descriptor = "[I")
    public int[] field1831 = new int[] { -1 };

    @OriginalMember(owner = "client!m", name = "E", descriptor = "Lpd;")
    public static class94 field1829 = class28.method249(-76, "@cya@");

    @OriginalMember(owner = "client!m", name = "K", descriptor = "[Lmb;")
    public static class73[] field1835 = new class73[256];

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field1837 = -1;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "Lad;")
    public static class5 field1836;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "[I")
    public static int[] field1823;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "[Ltc;")
    public static class116[] field1834;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V", line = 5)
    public static final void method556(boolean arg0) {
        field1832++;
        if (class90.field2336 == 251) {
            int var1 = class99.field2502.method943(-1025);
            int var2 = class126.field3164 + (var1 >> 4 & 0x7);
            int var3 = class123.field3121 + (var1 & 0x7);
            int var4 = var2 + class99.field2502.method934((byte) -108);
            int var5 = class99.field2502.method934((byte) -108) + var3;
            int var6 = class99.field2502.method957(1);
            int var7 = class99.field2502.method938((byte) 35);
            int var8 = class99.field2502.method943(-1025) * 4;
            int var9 = class99.field2502.method943(-1025) * 4;
            int var10 = class99.field2502.method938((byte) 124);
            int var11 = class99.field2502.method938((byte) 65);
            int var12 = class99.field2502.method943(-1025);
            int var13 = class99.field2502.method943(-1025);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var2 * 128 + 64;
                int var15 = var5 * 128 + 64;
                int var16 = var3 * 128 + 64;
                int var17 = var4 * 128 + 64;
                class14 var18 = new class14(var7, class64.field1589, var14, var16, class25.method226(class64.field1589, var16, var14, (byte) -57) - var8, class26.field699 + var10, class26.field699 + var11, var12, var13, var6, var9);
                var18.method85(class25.method226(class64.field1589, var15, var17, (byte) -57) - var9, 12575, class26.field699 + var10, var15, var17);
                class1.field40.method894(12800, var18);
            }
        } else if (class90.field2336 == 212) {
            int var19 = class99.field2502.method963(-15850);
            int var20 = var19 & 0x3;
            int var21 = var19 >> 2;
            int var22 = class2.field53[var21];
            int var23 = class99.field2502.method943(-1025);
            int var24 = (var23 & 0x7) + class123.field3121;
            int var25 = (var23 >> 4 & 0x7) + class126.field3164;
            int var26 = class99.field2502.method961(-128);
            if (var25 >= 0 && var24 >= 0 && var25 < 104 && var24 < 104) {
                class100.method750(0, -1, var24, var26, var20, var21, var22, class64.field1589, var25, (byte) 69);
            }
        } else if (class90.field2336 == 112) {
            int var27 = class99.field2502.method943(-1025);
            int var28 = (var27 >> 4 & 0x7) + class126.field3164;
            int var29 = (var27 & 0x7) + class123.field3121;
            int var30 = class99.field2502.method938((byte) -119);
            int var31 = class99.field2502.method938((byte) 48);
            int var32 = class99.field2502.method938((byte) 36);
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                class119 var33 = class9.field243[class64.field1589][var28][var29];
                if (var33 != null) {
                    for (class17 var34 = (class17) var33.method895(-14156); var34 != null; var34 = (class17) var33.method893(true)) {
                        if ((var30 & 0x7FFF) == var34.field418 && var34.field416 == var31) {
                            var34.field416 = var32;
                            break;
                        }
                    }
                    class90.method673(7928, var29, var28);
                }
            }
        } else if (class90.field2336 == 122) {
            int var35 = class99.field2502.method943(-1025);
            int var36 = (var35 >> 4 & 0x7) + class126.field3164;
            int var37 = (var35 & 0x7) + class123.field3121;
            int var38 = class99.field2502.method938((byte) -95);
            int var39 = class99.field2502.method943(-1025);
            int var40 = class99.field2502.method938((byte) 117);
            if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                int var41 = var37 * 128 + 64;
                int var42 = var36 * 128 + 64;
                class82 var43 = new class82(var38, class64.field1589, var42, var41, class25.method226(class64.field1589, var41, var42, (byte) -86) - var39, var40, class26.field699);
                class102.field2564.method894(12800, var43);
            }
        } else if (class90.field2336 == 205) {
            int var44 = class99.field2502.method961(-119);
            int var45 = class99.field2502.method961(-70);
            int var46 = class99.field2502.method942(false);
            int var47 = (var46 >> 4 & 0x7) + class126.field3164;
            int var48 = (var46 & 0x7) + class123.field3121;
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                class17 var49 = new class17();
                var49.field418 = var44;
                var49.field416 = var45;
                if (class9.field243[class64.field1589][var47][var48] == null) {
                    class9.field243[class64.field1589][var47][var48] = new class119();
                }
                class9.field243[class64.field1589][var47][var48].method894(12800, var49);
                class90.method673(7928, var48, var47);
            }
        } else if (class90.field2336 == 179) {
            int var50 = class99.field2502.method943(-1025);
            int var51 = (var50 & 0x7) + class123.field3121;
            int var52 = (var50 >> 4 & 0x7) + class126.field3164;
            int var53 = class99.field2502.method941(-957401312);
            int var54 = class99.field2502.method938((byte) 125);
            int var55 = class99.field2502.method921((byte) -109);
            if (var52 >= 0 && var51 >= 0 && var52 < 104 && var51 < 104 && class30.field860 != var55) {
                class17 var56 = new class17();
                var56.field418 = var54;
                var56.field416 = var53;
                if (class9.field243[class64.field1589][var52][var51] == null) {
                    class9.field243[class64.field1589][var52][var51] = new class119();
                }
                class9.field243[class64.field1589][var52][var51].method894(12800, var56);
                class90.method673(7928, var51, var52);
            }
        } else if (class90.field2336 == 31) {
            int var57 = class99.field2502.method942(false);
            int var58 = var57 >> 2;
            int var59 = var57 & 0x3;
            int var60 = class2.field53[var58];
            int var61 = class99.field2502.method958((byte) -110);
            int var62 = (var61 & 0x7) + class123.field3121;
            int var63 = class126.field3164 + (var61 >> 4 & 0x7);
            int var64 = class99.field2502.method961(-100);
            if (var63 >= 0 && var62 >= 0 && var63 < 103 && var62 < 103) {
                int var65 = class41.field1049[class64.field1589][var63][var62];
                int var66 = class41.field1049[class64.field1589][var63 + 1][var62];
                int var67 = class41.field1049[class64.field1589][var63 + 1][var62 + 1];
                int var68 = class41.field1049[class64.field1589][var63][var62 + 1];
                if (var60 == 0) {
                    class30 var69 = class64.field1585.method179(class64.field1589, var63, var62);
                    if (var69 != null) {
                        int var70 = var69.field856 >> 14 & 0x7FFF;
                        if (var58 == 2) {
                            var69.field858 = new class51(var70, 2, var59 + 4, var65, var66, var67, var68, var64, false, var69.field858);
                            var69.field865 = new class51(var70, 2, var59 + 1 & 0x3, var65, var66, var67, var68, var64, false, var69.field865);
                        } else {
                            var69.field858 = new class51(var70, var58, var59, var65, var66, var67, var68, var64, false, var69.field858);
                        }
                    }
                }
                if (var60 == 1) {
                    class102 var71 = class64.field1585.method214(class64.field1589, var63, var62);
                    if (var71 != null) {
                        var71.field2576 = new class51(var71.field2565 >> 14 & 0x7FFF, 4, 0, var65, var66, var67, var68, var64, false, var71.field2576);
                    }
                }
                if (var60 == 2) {
                    if (var58 == 11) {
                        var58 = 10;
                    }
                    class127 var72 = class64.field1585.method207(class64.field1589, var63, var62);
                    if (var72 != null) {
                        var72.field3203 = new class51(var72.field3197 >> 14 & 0x7FFF, var58, var59, var65, var66, var67, var68, var64, false, var72.field3203);
                    }
                }
                if (var60 == 3) {
                    class97 var73 = class64.field1585.method180(class64.field1589, var63, var62);
                    if (var73 != null) {
                        var73.field2462 = new class51(var73.field2460 >> 14 & 0x7FFF, 22, var59, var65, var66, var67, var68, var64, false, var73.field2462);
                    }
                }
            }
        } else {
            if (class90.field2336 == 12) {
                int var74 = class99.field2502.method963(-15850);
                int var75 = (var74 & 0x7) + class123.field3121;
                int var76 = (var74 >> 4 & 0x7) + class126.field3164;
                byte var77 = class99.field2502.method915(-88);
                int var78 = class99.field2502.method941(-957401312);
                byte var79 = class99.field2502.method956(-2);
                int var80 = class99.field2502.method958((byte) -116);
                int var81 = var80 >> 2;
                int var82 = var80 & 0x3;
                int var83 = class2.field53[var81];
                int var84 = class99.field2502.method961(-128);
                byte var85 = class99.field2502.method915(-48);
                int var86 = class99.field2502.method941(-957401312);
                int var87 = class99.field2502.method961(-103);
                byte var88 = class99.field2502.method934((byte) -108);
                class89 var89;
                if (class30.field860 == var87) {
                    var89 = class80.field2044;
                } else {
                    var89 = class85.field2138[var87];
                }
                if (var89 != null) {
                    class27 var90 = class55.method440(var86, (byte) 76);
                    int var91 = class41.field1049[class64.field1589][var76][var75];
                    int var92 = class41.field1049[class64.field1589][var76 + 1][var75 + 1];
                    int var93 = class41.field1049[class64.field1589][var76 + 1][var75];
                    int var94 = class41.field1049[class64.field1589][var76][var75 + 1];
                    class48 var95 = var90.method240(var81, var82, var93, 117, var94, var91, var92);
                    if (var95 != null) {
                        class100.method750(var84 + 1, var78 - -1, var75, -1, 0, 0, var83, class64.field1589, var76, (byte) 69);
                        var89.field2285 = class26.field699 + var84;
                        int var96 = var90.field771;
                        int var97 = var90.field715;
                        var89.field2290 = var95;
                        if (var88 < var77) {
                            byte var98 = var77;
                            var77 = var88;
                            var88 = var98;
                        }
                        if (var82 == 1 || var82 == 3) {
                            var97 = var90.field771;
                            var96 = var90.field715;
                        }
                        var89.field2316 = var76 * 128 + var96 * 64;
                        if (var85 > var79) {
                            byte var99 = var85;
                            var85 = var79;
                            var79 = var99;
                        }
                        var89.field2310 = class26.field699 + var78;
                        var89.field2289 = var75 * 128 + var97 * 64;
                        var89.field2302 = class25.method226(class64.field1589, var89.field2289, var89.field2316, (byte) -40);
                        var89.field2277 = var75 + var85;
                        var89.field2282 = var76 + var77;
                        var89.field2312 = var76 + var88;
                        var89.field2276 = var75 + var79;
                    }
                }
            }
            if (class90.field2336 == 18) {
                int var100 = class99.field2502.method943(-1025);
                int var101 = (var100 >> 4 & 0x7) + class126.field3164;
                int var102 = (var100 & 0x7) + class123.field3121;
                int var103 = class99.field2502.method938((byte) 68);
                int var104 = class99.field2502.method943(-1025);
                int var105 = var104 >> 4 & 0xF;
                int var106 = var104 & 0x7;
                int var107 = class99.field2502.method943(-1025);
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                    int var108 = var105 + 1;
                    if (class80.field2044.field165[0] >= var101 - var108 && var101 + var108 >= class80.field2044.field165[0] && class80.field2044.field219[0] >= var102 - var108 && var102 + var108 >= class80.field2044.field219[0] && class31.field897 != 0 && var106 > 0 && class9.field245 < 50) {
                        class52.field1311[class9.field245] = var103;
                        class23.field612[class9.field245] = var106;
                        class69.field1667[class9.field245] = var107;
                        class2.field63[class9.field245] = null;
                        class12.field296[class9.field245] = (var101 << 16) + (var102 << 8) + var105;
                        class9.field245++;
                    }
                }
            }
            if (arg0) {
                field1823 = null;
            }
            if (class90.field2336 == 169) {
                int var109 = class99.field2502.method958((byte) -100);
                int var110 = (var109 >> 4 & 0x7) + class126.field3164;
                int var111 = (var109 & 0x7) + class123.field3121;
                int var112 = class99.field2502.method941(-957401312);
                if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                    class119 var113 = class9.field243[class64.field1589][var110][var111];
                    if (var113 != null) {
                        for (class17 var114 = (class17) var113.method895(-14156); var114 != null; var114 = (class17) var113.method893(true)) {
                            if ((var112 & 0x7FFF) == var114.field418) {
                                var114.method1074((byte) -28);
                                break;
                            }
                        }
                        if (var113.method895(-14156) == null) {
                            class9.field243[class64.field1589][var110][var111] = null;
                        }
                        class90.method673(7928, var111, var110);
                    }
                }
            } else if (class90.field2336 == 92) {
                int var115 = class99.field2502.method942(false);
                int var116 = var115 >> 2;
                int var117 = var115 & 0x3;
                int var118 = class2.field53[var116];
                int var119 = class99.field2502.method958((byte) -109);
                int var120 = class126.field3164 + (var119 >> 4 & 0x7);
                int var121 = (var119 & 0x7) + class123.field3121;
                if (var120 >= 0 && var121 >= 0 && var120 < 104 && var121 < 104) {
                    class100.method750(0, -1, var121, -1, var117, var116, var118, class64.field1589, var120, (byte) 69);
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILde;[Lod;)V", line = 541)
    public static final void method557(int arg0, class24 arg1, class88[] arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((class108.field2679[var3][var110][var111] & 0x1) == 1) {
                        int var112 = var3;
                        if ((class108.field2679[1][var110][var111] & 0x2) == 2) {
                            var112 = var3 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method661(var110, var111, arg0 ^ 0x200001);
                        }
                    }
                }
            }
        }
        class63.field1553 += (int) (Math.random() * 5.0D) - 2;
        if (class63.field1553 < -8) {
            class63.field1553 = -8;
        }
        if (class63.field1553 > 8) {
            class63.field1553 = 8;
        }
        class85.field2152 += (int) (Math.random() * 5.0D) - 2;
        field1827++;
        if (class85.field2152 < -16) {
            class85.field2152 = -16;
        }
        if (class85.field2152 > 16) {
            class85.field2152 = 16;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var47 = class40.field1038[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; var50 < 103; var50++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    int var102 = class41.field1049[var4][var101][var50 + 1] - class41.field1049[var4][var101][var50 - 1];
                    int var103 = class41.field1049[var4][var101 + 1][var50] - class41.field1049[var4][var101 - 1][var50];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = (var103 << 8) / var104;
                    int var107 = (var47[var101 + 1][var50] >> 3) + (var47[var101 - 1][var50] >> 2) + (var47[var101][var50] >> 1) + (var47[var101][var50 + 1] >> 3) + (var47[var101][var50 + -1] >> 2);
                    int var108 = 65536 / var104;
                    int var109 = (var105 * -50 + var106 * -50 + var108 * -10) / var49 + 96;
                    class69.field1669[var101][var50] = var109 - var107;
                }
            }
            for (int var51 = 0; var51 < 104; var51++) {
                class6.field114[var51] = 0;
                class4.field97[var51] = 0;
                class63.field1543[var51] = 0;
                class98.field2488[var51] = 0;
                class12.field303[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; var52++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class127.field3206[var4][var95][var55] & 0xFF;
                        if (var96 > 0) {
                            class121 var97 = method563(var96 - 1, (byte) -88);
                            class6.field114[var55] += var97.field3022;
                            class4.field97[var55] += var97.field3026;
                            class63.field1543[var55] += var97.field3034;
                            class98.field2488[var55] += var97.field3017;
                            var10002 = class12.field303[var55]++;
                        }
                    }
                    int var98 = var52 - 5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class127.field3206[var4][var98][var55] & 0xFF;
                        if (var99 > 0) {
                            class121 var100 = method563(var99 - 1, (byte) -88);
                            class6.field114[var55] -= var100.field3022;
                            class4.field97[var55] -= var100.field3026;
                            class63.field1543[var55] -= var100.field3034;
                            class98.field2488[var55] -= var100.field3017;
                            var10002 = class12.field303[var55]--;
                        }
                    }
                }
                if (var52 >= 1 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; var61++) {
                        int var62 = var61 + 5;
                        if (var62 >= 0 && var62 < 104) {
                            var58 += class63.field1543[var62];
                            var59 += class98.field2488[var62];
                            var56 += class6.field114[var62];
                            var57 += class4.field97[var62];
                            var60 += class12.field303[var62];
                        }
                        int var63 = var61 - 5;
                        if (var63 >= 0 && var63 < 104) {
                            var57 -= class4.field97[var63];
                            var60 -= class12.field303[var63];
                            var58 -= class63.field1543[var63];
                            var59 -= class98.field2488[var63];
                            var56 -= class6.field114[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class115.field2912 || (class108.field2679[0][var52][var61] & 0x2) != 0 || (class108.field2679[var4][var52][var61] & 0x10) == 0 && client.method137(var61, true, var52, var4) == class102.field2581)) {
                            if (var4 < class50.field1255) {
                                class50.field1255 = var4;
                            }
                            int var64 = class127.field3206[var4][var52][var61] & 0xFF;
                            int var65 = class99.field2511[var4][var52][var61] & 0xFF;
                            if (var64 > 0 || var65 > 0) {
                                int var66 = class41.field1049[var4][var52][var61];
                                int var67 = class41.field1049[var4][var52][var61 + 1];
                                int var68 = class41.field1049[var4][var52 + 1][var61];
                                int var69 = class41.field1049[var4][var52 + 1][var61 + 1];
                                int var70 = class69.field1669[var52 + 1][var61 + 1];
                                int var71 = class69.field1669[var52][var61 + 1];
                                int var72 = class69.field1669[var52][var61];
                                int var73 = class69.field1669[var52 + 1][var61];
                                int var74 = -1;
                                int var75 = -1;
                                if (var64 > 0) {
                                    int var76 = var57 / var60;
                                    int var77 = var56 * 256 / var59;
                                    int var78 = var58 / var60;
                                    var74 = class107.method785(var78, var77, var76, arg0 ^ 0xFFFFD809);
                                    int var79 = class63.field1553 + var77 & 0xFF;
                                    int var80 = class85.field2152 + var78;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var75 = class107.method785(var80, var79, var76, arg0 ^ 0xFFFFD809);
                                }
                                if (var4 > 0) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class23.field599[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (var65 > 0 && !class115.method858(var65 - 1, 0).field1539) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var68 && var66 == var69 && var66 == var67) {
                                        class107.field2671[var4][var52][var61] = class100.method756(class107.field2671[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (var75 != -1) {
                                    var82 = class124.field3144[class92.method680((byte) -24, var75, 96)];
                                }
                                if (var65 == 0) {
                                    arg1.method195(var4, var52, var61, 0, 0, -1, var66, var68, var69, var67, class92.method680((byte) -103, var74, var72), class92.method680((byte) -62, var74, var73), class92.method680((byte) -101, var74, var70), class92.method680((byte) -74, var74, var71), 0, 0, 0, 0, var82, 0);
                                } else {
                                    int var83 = class23.field599[var4][var52][var61] + 1;
                                    byte var84 = class121.field3018[var4][var52][var61];
                                    class63 var85 = class115.method858(var65 - 1, 0);
                                    int var86 = var85.field1542;
                                    int var87;
                                    int var90;
                                    if (var86 >= 0) {
                                        var87 = -1;
                                        var90 = class124.field3148.method593(-19385, var86);
                                    } else if (var85.field1535 == 16711935) {
                                        var90 = -2;
                                        var86 = -1;
                                        var87 = -2;
                                    } else {
                                        var87 = class107.method785(var85.field1530, var85.field1538, var85.field1541, arg0 ^ 0xFFFFD809);
                                        int var88 = class63.field1553 + var85.field1538 & 0xFF;
                                        int var89 = class85.field2152 + var85.field1530;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        var90 = class107.method785(var89, var88, var85.field1541, -10232);
                                    }
                                    int var91 = 0;
                                    if (var90 != -2) {
                                        var91 = class124.field3144[class40.method300(var90, 96, 127)];
                                    }
                                    if (var85.field1555 != -1) {
                                        int var92 = class63.field1553 + var85.field1547 & 0xFF;
                                        int var93 = var85.field1558 + class85.field2152;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class107.method785(var93, var92, var85.field1537, -10232);
                                        var91 = class124.field3144[class40.method300(var94, 96, 127)];
                                    }
                                    arg1.method195(var4, var52, var61, var83, var84, var86, var66, var68, var69, var67, class92.method680((byte) -83, var74, var72), class92.method680((byte) -69, var74, var73), class92.method680((byte) -109, var74, var70), class92.method680((byte) -127, var74, var71), class40.method300(var87, var72, 127), class40.method300(var87, var73, 127), class40.method300(var87, var70, arg0 + 126), class40.method300(var87, var71, arg0 + 126), var82, var91);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; var53++) {
                for (int var54 = 1; var54 < 103; var54++) {
                    arg1.method173(var4, var54, var53, client.method137(var53, true, var54, var4));
                }
            }
            class127.field3206[var4] = null;
            class99.field2511[var4] = null;
            class23.field599[var4] = null;
            class121.field3018[var4] = null;
            class40.field1038[var4] = null;
        }
        arg1.method185(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var46 = 0; var46 < 104; var46++) {
                if ((class108.field2679[1][var5][var46] & 0x2) == 2) {
                    arg1.method192(var5, var46);
                }
            }
        }
        int var6 = arg0;
        int var7 = 4;
        int var8 = 2;
        for (int var9 = 0; var9 < 4; var9++) {
            if (var9 > 0) {
                var8 <<= 0x3;
                var6 <<= 0x3;
                var7 <<= 0x3;
            }
            for (int var10 = 0; var10 <= var9; var10++) {
                for (int var11 = 0; var11 <= 104; var11++) {
                    for (int var12 = 0; var12 <= 104; var12++) {
                        if ((var6 & class107.field2671[var10][var12][var11]) != 0) {
                            int var13 = var10;
                            int var14 = var11;
                            int var15;
                            for (var15 = var11; var15 > 0 && (class107.field2671[var10][var12][var15 - 1] & var6) != 0; var15--) {
                            }
                            while (var14 < 104 && (class107.field2671[var10][var12][var14 + 1] & var6) != 0) {
                                var14++;
                            }
                            label352: while (var13 > 0) {
                                for (int var16 = var15; var16 <= var14; var16++) {
                                    if ((var6 & class107.field2671[var13 - 1][var12][var16]) == 0) {
                                        break label352;
                                    }
                                }
                                var13--;
                            }
                            int var17;
                            label340: for (var17 = var10; var17 < var9; var17++) {
                                for (int var18 = var15; var18 <= var14; var18++) {
                                    if ((var6 & class107.field2671[var17 + 1][var12][var18]) == 0) {
                                        break label340;
                                    }
                                }
                            }
                            int var19 = (var14 + 1 - var15) * (var17 + 1 - var13);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class41.field1049[var13][var12][var15];
                                int var22 = class41.field1049[var17][var12][var15] - var20;
                                class24.method218(var9, 1, var12 * 128, var12 * 128, var15 * 128, var14 * 128 + 128, var22, var21);
                                for (int var23 = var13; var23 <= var17; var23++) {
                                    for (int var24 = var15; var24 <= var14; var24++) {
                                        class107.field2671[var23][var12][var24] = class81.method605(class107.field2671[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if ((var8 & class107.field2671[var10][var12][var11]) != 0) {
                            int var25 = var12;
                            int var26;
                            for (var26 = var12; var26 > 0 && (var8 & class107.field2671[var10][var26 - 1][var11]) != 0; var26--) {
                            }
                            int var27 = var10;
                            while (var25 < 104 && (var8 & class107.field2671[var10][var25 + 1][var11]) != 0) {
                                var25++;
                            }
                            label406: while (var27 > 0) {
                                for (int var28 = var26; var28 <= var25; var28++) {
                                    if ((var8 & class107.field2671[var27 - 1][var28][var11]) == 0) {
                                        break label406;
                                    }
                                }
                                var27--;
                            }
                            int var29;
                            label394: for (var29 = var10; var29 < var9; var29++) {
                                for (int var30 = var26; var30 <= var25; var30++) {
                                    if ((class107.field2671[var29 + 1][var30][var11] & var8) == 0) {
                                        break label394;
                                    }
                                }
                            }
                            int var31 = (var25 + 1 - var26) * (var29 + 1 - var27);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class41.field1049[var29][var26][var11] - var32;
                                int var34 = class41.field1049[var27][var26][var11];
                                class24.method218(var9, 2, var26 * 128, var25 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var35 <= var29; var35++) {
                                    for (int var36 = var26; var36 <= var25; var36++) {
                                        class107.field2671[var35][var36][var11] = class81.method605(class107.field2671[var35][var36][var11], ~var8);
                                    }
                                }
                            }
                        }
                        if ((var7 & class107.field2671[var10][var12][var11]) != 0) {
                            int var37 = var12;
                            int var38 = var12;
                            int var39 = var11;
                            int var40;
                            for (var40 = var11; var40 < 104 && (var7 & class107.field2671[var10][var12][var40 + 1]) != 0; var40++) {
                            }
                            while (var39 > 0 && (var7 & class107.field2671[var10][var12][var39 - 1]) != 0) {
                                var39--;
                            }
                            label460: while (var38 > 0) {
                                for (int var41 = var39; var41 <= var40; var41++) {
                                    if ((var7 & class107.field2671[var10][var38 - 1][var41]) == 0) {
                                        break label460;
                                    }
                                }
                                var38--;
                            }
                            label449: while (var37 < 104) {
                                for (int var42 = var39; var42 <= var40; var42++) {
                                    if ((class107.field2671[var10][var37 + 1][var42] & var7) == 0) {
                                        break label449;
                                    }
                                }
                                var37++;
                            }
                            if ((var37 + 1 - var38) * (var40 + 1 - var39) >= 4) {
                                int var43 = class41.field1049[var10][var38][var39];
                                class24.method218(var9, 4, var38 * 128, var37 * 128 + 128, var39 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var38; var44 <= var37; var44++) {
                                    for (int var45 = var39; var45 <= var40; var45++) {
                                        class107.field2671[var10][var44][var45] = class81.method605(class107.field2671[var10][var44][var45], ~var7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 1258)
    public static final void method558(int arg0) {
        class99.field2502.method323(28901);
        int var1 = class99.field2502.method319(8, arg0 ^ 0xFFFFFFF7);
        field1824++;
        if (var1 < class115.field2906) {
            for (int var2 = var1; var2 < class115.field2906; var2++) {
                client.field479[class13.field332++] = class95.field2442[var2];
            }
        }
        if (var1 > class115.field2906) {
            throw new RuntimeException("gnpov1");
        }
        if (arg0 != -1) {
            method560(-111);
        }
        class115.field2906 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class95.field2442[var3];
            class80 var5 = class28.field803[var4];
            int var6 = class99.field2502.method319(1, 8);
            if (var6 == 0) {
                class95.field2442[class115.field2906++] = var4;
                var5.field163 = class26.field699;
            } else {
                int var7 = class99.field2502.method319(2, 8);
                if (var7 == 0) {
                    class95.field2442[class115.field2906++] = var4;
                    var5.field163 = class26.field699;
                    class81.field2060[class66.field1613++] = var4;
                } else if (var7 == 1) {
                    class95.field2442[class115.field2906++] = var4;
                    var5.field163 = class26.field699;
                    int var8 = class99.field2502.method319(3, 8);
                    var5.method45(false, true, var8);
                    int var9 = class99.field2502.method319(1, arg0 ^ 0xFFFFFFF7);
                    if (var9 == 1) {
                        class81.field2060[class66.field1613++] = var4;
                    }
                } else if (var7 == 2) {
                    class95.field2442[class115.field2906++] = var4;
                    var5.field163 = class26.field699;
                    int var10 = class99.field2502.method319(3, arg0 ^ 0xFFFFFFF7);
                    var5.method45(true, true, var10);
                    int var11 = class99.field2502.method319(3, 8);
                    var5.method45(true, true, var11);
                    int var12 = class99.field2502.method319(1, 8);
                    if (var12 == 1) {
                        class81.field2060[class66.field1613++] = var4;
                    }
                } else if (var7 == 3) {
                    client.field479[class13.field332++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V", line = 1360)
    public static void method559(int arg0) {
        field1835 = null;
        field1836 = null;
        field1829 = null;
        field1823 = null;
        if (arg0 == 0) {
            field1834 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V", line = 1385)
    public static final void method560(int arg0) {
        field1833++;
        class8.field235.method496(55);
        if (arg0 != 0) {
            method559(-119);
        }
        class64.field1590.method33(0, 0);
        class12.field304 = class124.method985(class12.field304);
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V", line = 1403)
    public static final void method561(int arg0) {
        if (class64.field1595 > 0) {
            class64.field1595--;
        }
        if (class12.field312 > 1) {
            class12.field312--;
        }
        field1830++;
        if (class67.field1651) {
            class67.field1651 = false;
            class28.method248(-8455);
            return;
        }
        for (int var1 = 0; var1 < 100 && class105.method774(false); var1++) {
        }
        if (class115.field2922 != 30 && class115.field2922 != 35) {
            return;
        }
        if (class8.field182 && class115.field2922 == 30) {
            class86.field2157 = 0;
            class79.field2024 = 0;
            while (class113.method837(-74)) {
            }
            for (int var2 = 0; var2 < class92.field2353.length; var2++) {
                class92.field2353[var2] = false;
            }
        }
        class63.method475(class107.field2670, 27, 71);
        Object var3 = class108.field2681.field893;
        synchronized (class108.field2681.field893) {
            if (!class74.field1814) {
                class108.field2681.field894 = 0;
            } else if (class86.field2157 != 0 || class108.field2681.field894 >= 40) {
                class82.field2103++;
                class107.field2670.method326(167, arg0 ^ 0xFFFFFD73);
                class107.field2670.method916(-2, 0);
                int var4 = class107.field2670.field3047;
                int var5 = 0;
                for (int var6 = 0; class108.field2681.field894 > var6 && class107.field2670.field3047 - var4 < 240; var6++) {
                    var5++;
                    int var7 = class108.field2681.field896[var6];
                    int var8 = class108.field2681.field895[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class108.field2681.field896[var6] == -1 && class108.field2681.field895[var6] == -1) {
                        var9 = 524287;
                        var7 = -1;
                        var8 = -1;
                    }
                    if (class43.field1072 != var8 || class25.field676 != var7) {
                        int var10 = var8 - class43.field1072;
                        int var11 = var7 - class25.field676;
                        class25.field676 = var7;
                        class43.field1072 = var8;
                        if (class127.field3209 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class107.field2670.method944((byte) 38, (class127.field3209 << 12) + (var10 << 6) + var11);
                            class127.field3209 = 0;
                        } else if (class127.field3209 < 8) {
                            class107.field2670.method962((class127.field3209 << 19) + var9 + 8388608, (byte) -114);
                            class127.field3209 = 0;
                        } else {
                            class107.field2670.method917((class127.field3209 << 19) + var9 - 1073741824, true);
                            class127.field3209 = 0;
                        }
                    } else if (class127.field3209 < 2047) {
                        class127.field3209++;
                    }
                }
                class107.field2670.method927(false, class107.field2670.field3047 - var4);
                if (var5 >= class108.field2681.field894) {
                    class108.field2681.field894 = 0;
                } else {
                    class108.field2681.field894 -= var5;
                    for (int var12 = 0; var12 < class108.field2681.field894; var12++) {
                        class108.field2681.field895[var12] = class108.field2681.field895[var5 + var12];
                        class108.field2681.field896[var12] = class108.field2681.field896[var5 + var12];
                    }
                }
            }
        }
        if (class86.field2157 != 0) {
            long var13 = (class57.field1450 - class127.field3196) / 50L;
            class127.field3196 = class57.field1450;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            class99.field2499++;
            int var15 = class63.field1526;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var16 = class28.field788;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            int var17 = var15 * 765 + var16;
            byte var18 = 0;
            if (class86.field2157 == 2) {
                var18 = 1;
            }
            class107.field2670.method326(177, -120);
            int var19 = (int) var13;
            class107.field2670.method917((var18 << 19) + (var19 << 20) + var17, true);
        }
        if (class67.field1650 > 0) {
            class67.field1650--;
        }
        if (class92.field2353[96] || class92.field2353[97] || class92.field2353[98] || class92.field2353[99]) {
            class81.field2068 = true;
        }
        if (class81.field2068 && class67.field1650 <= 0) {
            class41.field1053++;
            class81.field2068 = false;
            class67.field1650 = 20;
            class107.field2670.method326(247, -125);
            class107.field2670.method932(class107.field2668, arg0 ^ 0x2D8);
            class107.field2670.method944((byte) 38, class28.field783);
        }
        if (class28.field809 && !class102.field2592) {
            class14.field352++;
            class102.field2592 = true;
            class107.field2670.method326(69, arg0 ^ 0xFFFFFD68);
            class107.field2670.method916(-2, 1);
        }
        if (!class28.field809 && class102.field2592) {
            class102.field2592 = false;
            class107.field2670.method326(69, -127);
            class107.field2670.method916(-2, 0);
            class14.field352++;
        }
        class9.method59((byte) 1);
        if (class115.field2922 != 30 && class115.field2922 != 35) {
            return;
        }
        class70.method521((byte) -107);
        class128.method1016((byte) 65);
        class76.field1841++;
        if (class76.field1841 > 750) {
            class28.method248(arg0 ^ 0xFFFFDC04);
            return;
        }
        class55.method443((byte) 4);
        class100.method757(-65);
        class21.method157(-20863);
        if (class4.field87 != 0) {
            class30.field875 += 20;
            if (class30.field875 >= 400) {
                class4.field87 = 0;
            }
        }
        class66.field1620++;
        if (class134.field3297 != 0) {
            class102.field2586++;
            if (class102.field2586 >= 15) {
                if (class134.field3297 == 3) {
                    class73.field1781 = true;
                }
                if (class134.field3297 == 2) {
                    class135.field3323 = true;
                }
                class134.field3297 = 0;
            }
        }
        if (class100.field2535 != 0) {
            if (class94.field2411 > class17.field423 + 5 || class94.field2411 < class17.field423 - 5 || class84.field2121 > class64.field1566 + 5 || class64.field1566 - 5 > class84.field2121) {
                class33.field906 = true;
            }
            client.field489++;
            if (class79.field2024 == 0) {
                if (class100.field2535 == 2) {
                    class135.field3323 = true;
                }
                if (class100.field2535 == 3) {
                    class73.field1781 = true;
                }
                class100.field2535 = 0;
                if (class33.field906 && client.field489 >= 5) {
                    class111.field2802 = -1;
                    class77.method574(126);
                    if (class119.field2977 == class111.field2802 && class50.field1249 != class136.field3325) {
                        class121.field3028++;
                        class77 var20 = class63.method466((byte) -38, class119.field2977);
                        byte var21 = 0;
                        if (class107.field2660 == 1 && var20.field1896 == 206) {
                            var21 = 1;
                        }
                        if (var20.field1869[class50.field1249] <= 0) {
                            var21 = 0;
                        }
                        if (var20.field1860) {
                            int var22 = class136.field3325;
                            int var23 = class50.field1249;
                            var20.field1869[var23] = var20.field1869[var22];
                            var20.field1919[var23] = var20.field1919[var22];
                            var20.field1869[var22] = -1;
                            var20.field1919[var22] = 0;
                        } else if (var21 == 1) {
                            int var24 = class136.field3325;
                            int var25 = class50.field1249;
                            while (var24 != var25) {
                                if (var25 < var24) {
                                    var20.method579(var24, var24 - 1, -128);
                                    var24--;
                                } else if (var25 > var24) {
                                    var20.method579(var24, var24 + 1, -85);
                                    var24++;
                                }
                            }
                        } else {
                            var20.method579(class136.field3325, class50.field1249, -119);
                        }
                        class107.field2670.method326(36, arg0 ^ 0xFFFFFD77);
                        class107.field2670.method919(class50.field1249, 16711680);
                        class107.field2670.method917(class119.field2977, true);
                        class107.field2670.method939(false, var21);
                        class107.field2670.method932(class136.field3325, -97);
                    }
                } else if ((class99.field2520 == 1 || class77.method575(72, class97.field2478 - 1)) && class97.field2478 > 2) {
                    class89.method668((byte) -107);
                } else if (class97.field2478 > 0) {
                    class120.method898(arg0 - 595, class97.field2478 + -1);
                }
                class102.field2586 = 10;
                class86.field2157 = 0;
            }
        }
        byte var26 = 34;
        if (class77.field1962 == -1) {
            if (class103.field2603 != -1) {
                class136.method1073(4, 3648, 4, class103.field2603, 338, 516, var26);
            }
            if (class45.field1108 != -1) {
                class136.method1073(205, 3648, 553, class45.field1108, 466, 743, var26);
            } else if (class42.field1065[class92.field2361] != -1) {
                class136.method1073(205, 3648, 553, class42.field1065[class92.field2361], 466, 743, var26);
            }
            if (class115.field2925 != -1) {
                class136.method1073(357, 3648, 17, class115.field2925, 453, 496, var26);
            } else if (field1837 != -1) {
                class136.method1073(357, 3648, 17, field1837, 453, 496, var26);
            }
        } else {
            class136.method1073(0, 3648, 0, class77.field1962, 503, 765, var26);
            if (class111.field2806 != -1) {
                class136.method1073(0, 3648, 0, class111.field2806, 503, 765, var26);
            }
        }
        if (class77.field1962 == -1) {
            if (class103.field2603 != -1) {
                class136.method1073(4, 3648, 4, class103.field2603, 338, 516, ~var26);
            }
            if (class45.field1108 != -1) {
                class136.method1073(205, 3648, 553, class45.field1108, 466, 743, ~var26);
            } else if (class42.field1065[class92.field2361] != -1) {
                class136.method1073(205, 3648, 553, class42.field1065[class92.field2361], 466, 743, ~var26);
            }
            if (class115.field2925 != -1) {
                class136.method1073(357, 3648, 17, class115.field2925, 453, 496, ~var26);
            } else if (field1837 != -1) {
                class136.method1073(357, 3648, 17, field1837, 453, 496, ~var26);
            }
        } else {
            class136.method1073(0, arg0 + 2883, 0, class77.field1962, 503, 765, ~var26);
            if (class111.field2806 != -1) {
                class136.method1073(0, 3648, 0, class111.field2806, 503, 765, ~var26);
            }
        }
        class9.method56(3051);
        if (class24.field635 != -1) {
            int var27 = class24.field635;
            int var28 = class24.field625;
            boolean var29 = class123.method973(0, 0, (byte) -84, var28, 0, var27, true, class80.field2044.field165[0], 0, 0, class80.field2044.field219[0], 0);
            if (var29) {
                class19.field524 = class28.field788;
                class4.field87 = 1;
                class30.field875 = 0;
                class47.field1144 = class63.field1526;
            }
            class24.field635 = -1;
        }
        if (class86.field2157 == 1 && class76.field1855 != null) {
            class76.field1855 = null;
            class73.field1781 = true;
            class86.field2157 = 0;
        }
        class50.method395(73);
        if (class77.field1962 == -1) {
            class113.method843(0);
            class105.method777(false);
            class40.method303((byte) 113);
        }
        if (class80.field2056 == -1 && class95.field2450 == -1 && class94.field2386 == -1) {
            if (class29.field844 > 0) {
                class29.field844--;
            }
        } else if (class29.field844 < class20.field564) {
            class29.field844++;
            if (class29.field844 == class20.field564) {
                if (class95.field2450 != -1) {
                    class135.field3323 = true;
                }
                if (class80.field2056 != -1) {
                    class73.field1781 = true;
                }
            }
        }
        if (class79.field2024 == 1 || class86.field2157 == 1) {
            class37.field968++;
        }
        class88.method659((byte) -93);
        if (class101.field2559) {
            class72.method533((byte) 122);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class43.field1087[var30]++;
        }
        if (arg0 != 765) {
            method560(-60);
        }
        class95.method732((byte) 24);
        int var31 = class107.method782((byte) -112);
        int var32 = class79.method591(-66);
        if (var31 > 4500 && var32 > 4500) {
            class64.field1595 = 250;
            class110.method795(4000, false);
            class115.field2905++;
            class107.field2670.method326(252, -105);
        }
        client.field477++;
        class77.field1898++;
        if (client.field477 > 500) {
            int var33 = (int) (Math.random() * 8.0D);
            client.field477 = 0;
            if ((var33 & 0x1) == 1) {
                class26.field697 += class1.field39;
            }
            if ((var33 & 0x4) == 4) {
                class41.field1043 += client.field474;
            }
            if ((var33 & 0x2) == 2) {
                class74.field1822 += class26.field695;
            }
        }
        class80.field2054++;
        if (class41.field1043 < -40) {
            client.field474 = 1;
        }
        if (class26.field697 < -50) {
            class1.field39 = 2;
        }
        if (class26.field697 > 50) {
            class1.field39 = -2;
        }
        if (class41.field1043 > 40) {
            client.field474 = -1;
        }
        if (class74.field1822 < -55) {
            class26.field695 = 2;
        }
        if (class80.field2054 > 500) {
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x1) == 1) {
                class119.field2976 += class21.field577;
            }
            class80.field2054 = 0;
            if ((var34 & 0x2) == 2) {
                class50.field1244 += class33.field919;
            }
        }
        if (class119.field2976 < -60) {
            class21.field577 = 2;
        }
        if (class74.field1822 > 55) {
            class26.field695 = -2;
        }
        if (class50.field1244 < -20) {
            class33.field919 = 1;
        }
        if (class50.field1244 > 10) {
            class33.field919 = -1;
        }
        if (class119.field2976 > 60) {
            class21.field577 = -2;
        }
        if (class77.field1898 > 50) {
            class107.field2670.method326(225, -120);
            class74.field1819++;
        }
        try {
            if (class1.field47 != null && class107.field2670.field3047 > 0) {
                class1.field47.method639(class107.field2670.field3074, 1885, class107.field2670.field3047, 0);
                class107.field2670.field3047 = 0;
                class77.field1898 = 0;
            }
        } catch (IOException var35) {
            class28.method248(arg0 - 9220);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([BLic;II)V", line = 2044)
    public static final void method562(byte[] arg0, class50 arg1, int arg2, int arg3) {
        field1825++;
        class33 var4 = new class33();
        var4.field901 = arg1;
        var4.field918 = arg0;
        var4.field3345 = arg2;
        var4.field902 = arg3;
        class119 var5 = class128.field3225;
        synchronized (class128.field3225) {
            class128.field3225.method894(12800, var4);
        }
        class100.method753(arg3 - 121);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Lub;", line = 2062)
    private static final class121 method563(int arg0, byte arg1) {
        field1828++;
        class121 var2 = (class121) class97.field2458.method1007((long) arg0, (byte) -46);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class79.field2029.method808((byte) -45, 1, arg0);
        class121 var4 = new class121();
        if (var3 != null) {
            var4.method913(-29532, arg0, new class122(var3));
        }
        var4.method910(-110);
        class97.field2458.method1012(arg1 + 138, var4, (long) arg0);
        return arg1 == -88 ? var4 : null;
    }
}
