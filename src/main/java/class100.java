import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class100 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field1841 = 0;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
    public static int[] field1848 = new int[] { 18, 34, 38, 25, 8, 33, 20, 39 };

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "[I")
    public static int[] field1844;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)I")
    public static final int method557(int arg0, boolean arg1) {
        field1842++;
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCD) >>> 2);
        if (arg1) {
            return 92;
        } else {
            int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjg;)V")
    public static final void method558(int arg0, class89 arg1) {
        class127.field2399 = arg1;
        field1845++;
        if (arg0 != 1915417345) {
            method561(68, null, 23, null);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static void method559(boolean arg0) {
        if (arg0) {
            method560(null, (byte) 42, null);
        }
        field1848 = null;
        field1844 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Lqf;BLog;)V")
    public static final void method560(class151[] arg0, byte arg1, class134 arg2) {
        if (arg1 != 5) {
            field1841 = 52;
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var112 = 0; var112 < 104; var112++) {
                for (int var113 = 0; var113 < 104; var113++) {
                    if ((class136.field2637[var3][var112][var113] & 0x1) == 1) {
                        int var114 = var3;
                        if ((class136.field2637[1][var112][var113] & 0x2) == 2) {
                            var114 = var3 - 1;
                        }
                        if (var114 >= 0) {
                            arg0[var114].method940(var112, (byte) -90, var113);
                        }
                    }
                }
            }
        }
        class124.field2315 += (int) (Math.random() * 5.0D) - 2;
        if (class124.field2315 < -8) {
            class124.field2315 = -8;
        }
        field1849++;
        if (class124.field2315 > 8) {
            class124.field2315 = 8;
        }
        class108.field1970 += (int) (Math.random() * 5.0D) - 2;
        int var4 = class124.field2315 >> 2 << 10;
        if (class108.field1970 < -16) {
            class108.field1970 = -16;
        }
        int[][] var5 = new int[104][104];
        if (class108.field1970 > 16) {
            class108.field1970 = 16;
        }
        int var6 = class108.field1970 >> 1;
        int[][] var7 = new int[104][104];
        for (int var8 = 0; var8 < 4; var8++) {
            byte[][] var51 = class197.field3841[var8];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var102 = 1; var102 < 103; var102++) {
                    byte var103 = 96;
                    int var104 = class151.field2935[var8][var102 + 1][var54] - class151.field2935[var8][var102 - 1][var54];
                    int var105 = class151.field2935[var8][var102][var54 + 1] - class151.field2935[var8][var102][var54 - 1];
                    int var106 = (int) Math.sqrt((double) (var105 * var105 + var104 * var104 + 65536));
                    int var107 = 65536 / var106;
                    int var108 = (var104 << 8) / var106;
                    int var109 = (var105 << 8) / var106;
                    int var110 = (var107 * -10 + var108 * -50 + var109 * -50) / var53 + var103;
                    int var111 = (var51[var102][var54 + 1] >> 3) + (var51[var102][var54 - 1] >> 2) + (var51[var102 + -1][var54] >> 2) + (var51[var102 + 1][var54] >> 3) + (var51[var102][var54] >> 1);
                    var7[var102][var54] = var110 - var111;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class173.field3435[var55] = 0;
                class177.field3529[var55] = 0;
                class108.field1955[var55] = 0;
                class182.field3603[var55] = 0;
                class204.field3953[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var87 = 0; var87 < 104; var87++) {
                    int var96 = var56 + 5;
                    int var10002;
                    if (var96 < 104) {
                        int var97 = class35.field571[var8][var96][var87] & 0xFF;
                        if (var97 > 0) {
                            class66 var98 = class57.method304(false, var97 - 1);
                            class173.field3435[var87] += var98.field1187;
                            class177.field3529[var87] += var98.field1205;
                            class108.field1955[var87] += var98.field1198;
                            class182.field3603[var87] += var98.field1184;
                            var10002 = class204.field3953[var87]++;
                        }
                    }
                    int var99 = var56 - 5;
                    if (var99 >= 0) {
                        int var100 = class35.field571[var8][var99][var87] & 0xFF;
                        if (var100 > 0) {
                            class66 var101 = class57.method304(false, var100 - 1);
                            class173.field3435[var87] -= var101.field1187;
                            class177.field3529[var87] -= var101.field1205;
                            class108.field1955[var87] -= var101.field1198;
                            class182.field3603[var87] -= var101.field1184;
                            var10002 = class204.field3953[var87]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    for (int var93 = -5; var93 < 104; var93++) {
                        int var94 = var93 + 5;
                        if (var94 < 104) {
                            var89 += class177.field3529[var94];
                            var88 += class173.field3435[var94];
                            var92 += class204.field3953[var94];
                            var91 += class182.field3603[var94];
                            var90 += class108.field1955[var94];
                        }
                        int var95 = var93 - 5;
                        if (var95 >= 0) {
                            var90 -= class108.field1955[var95];
                            var91 -= class182.field3603[var95];
                            var88 -= class173.field3435[var95];
                            var89 -= class177.field3529[var95];
                            var92 -= class204.field3953[var95];
                        }
                        if (var93 >= 0 && var92 > 0) {
                            var5[var56][var93] = class21.method130(var90 / var92, 1487052578, var89 / var92, var88 * 256 / var91);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var60 = 1; var60 < 103; var60++) {
                    if (!class82.field1515 || (class136.field2637[0][var57][var60] & 0x2) != 0 || (class136.field2637[var8][var57][var60] & 0x10) == 0 && class27.method155(var57, var60, var8, 127) == class29.field474) {
                        if (var8 < class169.field3368) {
                            class169.field3368 = var8;
                        }
                        int var61 = class195.field3784[var8][var57][var60] & 0xFF;
                        int var62 = class35.field571[var8][var57][var60] & 0xFF;
                        if (var62 > 0 || var61 > 0) {
                            int var63 = class151.field2935[var8][var57][var60];
                            int var64 = class151.field2935[var8][var57 + 1][var60 + 1];
                            int var65 = class151.field2935[var8][var57][var60 + 1];
                            int var66 = class151.field2935[var8][var57 + 1][var60];
                            if (var8 > 0) {
                                boolean var67 = true;
                                if (var62 == 0 && class68.field1266[var8][var57][var60] != 0) {
                                    var67 = false;
                                }
                                if (var61 > 0 && !class159.method1091((byte) 63, var61 - 1).field3510) {
                                    var67 = false;
                                }
                                if (var67 && var63 == var66 && var63 == var64 && var63 == var65) {
                                    class95.field1768[var8][var57][var60] = class112.method607(class95.field1768[var8][var57][var60], 2340);
                                }
                            }
                            int var68;
                            int var71;
                            if (var62 > 0) {
                                var68 = var5[var57][var60];
                                int var69 = (var68 & 0x7F) + var6;
                                if (var69 < 0) {
                                    var69 = 0;
                                } else if (var69 > 127) {
                                    var69 = 127;
                                }
                                int var70 = (var68 + var4 & 0xFC00) + (var68 & 0x380) + var69;
                                var71 = class150.field2899[class36.method198(arg1 + 1587837442, var70, 96)];
                            } else {
                                var71 = 0;
                                var68 = -1;
                            }
                            int var72 = var7[var57 + 1][var60];
                            int var73 = var7[var57][var60 + 1];
                            int var74 = var7[var57 + 1][var60 + 1];
                            int var75 = var7[var57][var60];
                            if (var61 == 0) {
                                arg2.method843(var8, var57, var60, 0, 0, -1, var63, var66, var64, var65, class36.method198(1587837447, var68, var75), class36.method198(1587837447, var68, var72), class36.method198(1587837447, var68, var74), class36.method198(1587837447, var68, var73), 0, 0, 0, 0, var71, 0);
                            } else {
                                byte var76 = class70.field1287[var8][var57][var60];
                                int var77 = class68.field1266[var8][var57][var60] + 1;
                                class177 var78 = class159.method1091((byte) 63, var61 - 1);
                                int var79 = var78.field3517;
                                if (var79 >= 0 && !class150.field2894.method1105(arg1 ^ 0xFFFF9E15, var79)) {
                                    var79 = -1;
                                }
                                int var80;
                                int var81;
                                if (var79 >= 0) {
                                    var81 = -1;
                                    var80 = class150.field2899[class131.method764(96, class150.field2894.method1103((byte) 88, var79), (byte) -55)];
                                } else if (var78.field3522 == -1) {
                                    var80 = 0;
                                    var81 = -2;
                                } else {
                                    var81 = var78.field3522;
                                    int var82 = (var81 & 0x7F) + var6;
                                    if (var82 < 0) {
                                        var82 = 0;
                                    } else if (var82 > 127) {
                                        var82 = 127;
                                    }
                                    int var83 = (var81 & 0x380) + (var4 + var81 & 0xFC00) + var82;
                                    var80 = class150.field2899[class131.method764(96, var83, (byte) -127)];
                                }
                                if (var78.field3513 >= 0) {
                                    int var84 = var78.field3513;
                                    int var85 = (var84 & 0x7F) + var6;
                                    if (var85 < 0) {
                                        var85 = 0;
                                    } else if (var85 > 127) {
                                        var85 = 127;
                                    }
                                    int var86 = (var84 + var4 & 0xFC00) + (var84 & 0x380) + var85;
                                    var80 = class150.field2899[class131.method764(96, var86, (byte) -37)];
                                }
                                arg2.method843(var8, var57, var60, var77, var76, var79, var63, var66, var64, var65, class36.method198(1587837447, var68, var75), class36.method198(arg1 ^ 0x5EA47A02, var68, var72), class36.method198(1587837447, var68, var74), class36.method198(1587837447, var68, var73), class131.method764(var75, var81, (byte) -110), class131.method764(var72, var81, (byte) -32), class131.method764(var74, var81, (byte) -65), class131.method764(var73, var81, (byte) -72), var71, var80);
                            }
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    arg2.method827(var8, var59, var58, class27.method155(var59, var58, var8, arg1 ^ 0x79));
                }
            }
            class35.field571[var8] = null;
            class195.field3784[var8] = null;
            class68.field1266[var8] = null;
            class70.field1287[var8] = null;
            class197.field3841[var8] = null;
        }
        arg2.method825(-50, -10, -50);
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class136.field2637[1][var9][var50] & 0x2) == 2) {
                    arg2.method829(var9, var50);
                }
            }
        }
        int var10 = 1;
        int var11 = 2;
        int var12 = 4;
        for (int var13 = 0; var13 < 4; var13++) {
            if (var13 > 0) {
                var10 <<= 0x3;
                var12 <<= 0x3;
                var11 <<= 0x3;
            }
            for (int var14 = 0; var14 <= var13; var14++) {
                for (int var15 = 0; var15 <= 104; var15++) {
                    for (int var16 = 0; var16 <= 104; var16++) {
                        if ((class95.field1768[var14][var16][var15] & var10) != 0) {
                            int var17 = var15;
                            int var18 = var14;
                            int var19 = var15;
                            while (var17 > 0 && (class95.field1768[var14][var16][var17 - 1] & var10) != 0) {
                                var17--;
                            }
                            while (var19 < 104 && (class95.field1768[var14][var16][var19 + 1] & var10) != 0) {
                                var19++;
                            }
                            int var20 = var14;
                            label357: while (var18 > 0) {
                                for (int var21 = var17; var21 <= var19; var21++) {
                                    if ((var10 & class95.field1768[var18 - 1][var16][var21]) == 0) {
                                        break label357;
                                    }
                                }
                                var18--;
                            }
                            label346: while (var13 > var20) {
                                for (int var22 = var17; var22 <= var19; var22++) {
                                    if ((var10 & class95.field1768[var20 + 1][var16][var22]) == 0) {
                                        break label346;
                                    }
                                }
                                var20++;
                            }
                            int var23 = (var19 + 1 - var17) * (var20 + 1 - var18);
                            if (var23 >= 8) {
                                short var24 = 240;
                                int var25 = class151.field2935[var20][var16][var17] - var24;
                                int var26 = class151.field2935[var18][var16][var17];
                                class134.method838(var13, 1, var16 * 128, var16 * 128, var17 * 128, var19 * 128 + 128, var25, var26);
                                for (int var27 = var18; var27 <= var20; var27++) {
                                    for (int var28 = var17; var28 <= var19; var28++) {
                                        class95.field1768[var27][var16][var28] = class91.method479(class95.field1768[var27][var16][var28], ~var10);
                                    }
                                }
                            }
                        }
                        if ((class95.field1768[var14][var16][var15] & var11) != 0) {
                            int var29 = var16;
                            int var30 = var14;
                            int var31;
                            for (var31 = var16; var31 > 0 && (var11 & class95.field1768[var14][var31 - 1][var15]) != 0; var31--) {
                            }
                            int var32 = var14;
                            while (var29 < 104 && (class95.field1768[var14][var29 + 1][var15] & var11) != 0) {
                                var29++;
                            }
                            label411: while (var30 > 0) {
                                for (int var33 = var31; var33 <= var29; var33++) {
                                    if ((class95.field1768[var30 - 1][var33][var15] & var11) == 0) {
                                        break label411;
                                    }
                                }
                                var30--;
                            }
                            label400: while (var32 < var13) {
                                for (int var34 = var31; var34 <= var29; var34++) {
                                    if ((var11 & class95.field1768[var32 + 1][var34][var15]) == 0) {
                                        break label400;
                                    }
                                }
                                var32++;
                            }
                            int var35 = (var29 + 1 - var31) * (var32 + 1 - var30);
                            if (var35 >= 8) {
                                short var36 = 240;
                                int var37 = class151.field2935[var32][var31][var15] - var36;
                                int var38 = class151.field2935[var30][var31][var15];
                                class134.method838(var13, 2, var31 * 128, var29 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                                for (int var39 = var30; var39 <= var32; var39++) {
                                    for (int var40 = var31; var40 <= var29; var40++) {
                                        class95.field1768[var39][var40][var15] = class91.method479(class95.field1768[var39][var40][var15], ~var11);
                                    }
                                }
                            }
                        }
                        if ((var12 & class95.field1768[var14][var16][var15]) != 0) {
                            int var41 = var16;
                            int var42 = var16;
                            int var43 = var15;
                            int var44 = var15;
                            while (var43 < 104 && (class95.field1768[var14][var16][var43 + 1] & var12) != 0) {
                                var43++;
                            }
                            while (var44 > 0 && (class95.field1768[var14][var16][var44 - 1] & var12) != 0) {
                                var44--;
                            }
                            label465: while (var41 > 0) {
                                for (int var45 = var44; var45 <= var43; var45++) {
                                    if ((class95.field1768[var14][var41 - 1][var45] & var12) == 0) {
                                        break label465;
                                    }
                                }
                                var41--;
                            }
                            label454: while (var42 < 104) {
                                for (int var46 = var44; var46 <= var43; var46++) {
                                    if ((class95.field1768[var14][var42 + 1][var46] & var12) == 0) {
                                        break label454;
                                    }
                                }
                                var42++;
                            }
                            if ((var43 + 1 - var44) * (-var41 + var42 + 1) >= 4) {
                                int var47 = class151.field2935[var14][var41][var44];
                                class134.method838(var13, 4, var41 * 128, var42 * 128 + 128, var44 * 128, var43 * 128 + 128, var47, var47);
                                for (int var48 = var41; var48 <= var42; var48++) {
                                    for (int var49 = var44; var49 <= var43; var49++) {
                                        class95.field1768[var14][var48][var49] = class91.method479(class95.field1768[var14][var48][var49], ~var12);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILkb;ILjava/awt/Color;)V")
    public static final void method561(int arg0, class93 arg1, int arg2, Color arg3) {
        try {
            Graphics var4 = class115.field2147.getGraphics();
            if (class195.field3825 == null) {
                class195.field3825 = new Font("Helvetica", 1, 13);
                class10.field159 = class115.field2147.getFontMetrics(class195.field3825);
            }
            if (class180.field3572) {
                class180.field3572 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class138.field2665, class50.field802);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class201.field3899 == null) {
                    class201.field3899 = class115.field2147.createImage(304, 34);
                }
                Graphics var5 = class201.field3899.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(arg0, 0, 303, 33);
                var5.fillRect(2, 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class195.field3825);
                var5.setColor(Color.white);
                arg1.method496(22, 12522, var5, (304 - arg1.method508(false, class10.field159)) / 2);
                var4.drawImage(class201.field3899, class138.field2665 / 2 - 152, class50.field802 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class138.field2665 / 2 - 152;
                int var7 = class50.field802 / 2 - 18;
                var4.setColor(arg3);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(var6 + arg2 * 3 + 2, var7 + 2, 300 - arg2 * 3, 30);
                var4.setFont(class195.field3825);
                var4.setColor(Color.white);
                arg1.method496(var7 + 22, 12522, var4, var6 + (304 - arg1.method508(false, class10.field159)) / 2);
            }
        } catch (Exception var9) {
            class115.field2147.repaint();
        }
        field1847++;
    }
}
