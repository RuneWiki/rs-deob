import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Loa;")
    private static class98 field1080 = class38.method349(255, "wishes to trade with you)3");

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "[I")
    public static int[] field1084 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Loa;")
    public static class98 field1082 = field1080;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Loa;")
    public static class98 field1083 = class38.method349(255, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Loa;")
    public static class98 field1088 = class38.method349(255, "@red@");

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Lab;")
    public static class3 field1085 = new class3(512);

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Loa;")
    public static class98 field1093 = class38.method349(255, "@cr1@");

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Loc;")
    public static class100 field1089;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "[I")
    public static int[] field1092;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILb;IIIII)V")
    public static final void method408(int arg0, int arg1, class8 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1086++;
        if (arg1 >= 0 && arg1 < 104 && arg6 >= 0 && arg6 < 104) {
            class80.field1771[arg3][arg1][arg6] = 0;
            while (true) {
                int var8 = arg2.method62((byte) 123);
                if (var8 == 0) {
                    if (arg3 == 0) {
                        class25.field616[0][arg1][arg6] = -class120.method956(arg7 + arg6 + 556238, arg1 + arg5 + 932731, (byte) -85) * 8;
                    } else {
                        class25.field616[arg3][arg1][arg6] = class25.field616[arg3 - 1][arg1][arg6] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg2.method62((byte) 94);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg3 == 0) {
                        class25.field616[0][arg1][arg6] = -var9 * 8;
                    } else {
                        class25.field616[arg3][arg1][arg6] = class25.field616[arg3 - 1][arg1][arg6] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class21.field450[arg3][arg1][arg6] = arg2.method57(39);
                    class138.field3366[arg3][arg1][arg6] = (byte) ((var8 - 2) / 4);
                    class51.field1117[arg3][arg1][arg6] = (byte) class150.method1211(3, var8 + arg4 - 2);
                } else if (var8 <= 81) {
                    class80.field1771[arg3][arg1][arg6] = (byte) (var8 - 49);
                } else {
                    class51.field1126[arg3][arg1][arg6] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg2.method62((byte) 121);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg2.method62((byte) 92);
                    break;
                }
                if (var10 <= 49) {
                    arg2.method62((byte) 111);
                }
            }
        }
        int var11 = -72 % ((-arg0 - 68) / 43);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method409(int arg0) {
        if (arg0 <= 42) {
            field1093 = null;
        }
        class51.field1126 = null;
        class51.field1117 = null;
        class78.field1722 = null;
        class18.field402 = null;
        class44.field1001 = null;
        class44.field1000 = null;
        class138.field3366 = null;
        class21.field450 = null;
        class139.field3392 = null;
        class65.field1399 = null;
        field1087++;
        class127.field2864 = null;
        class88.field2026 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static final void method410(byte arg0) {
        class21.method190((byte) -39);
        if (arg0 >= -91) {
            method413(77, 127);
        }
        field1094++;
        class127.method999(true);
        if (class141.field3447 == 2 || class141.field3447 == 5) {
            byte[] var41 = class46.field1068.field2326;
            int[] var42 = class7.field117;
            int var43 = var41.length;
            for (int var44 = 0; var44 < var43; var44++) {
                if (var41[var44] == 0) {
                    var42[var44] = 0;
                }
            }
            if (class141.field3447 < 3) {
                class96.field2218.method485(0, 0, 33, 33, 25, 25, class25.field611, 256, class58.field1291, class80.field1763);
            }
            class55.method448(true);
            return;
        }
        int var1 = class25.field611 + class21.field462 & 0x7FF;
        int var2 = class73.field1536.field3657 / 32 + 48;
        int var3 = 464 - class73.field1536.field3667 / 32;
        class64.field1372.method485(25, 5, 146, 151, var2, var3, var1, class76.field1662 + 256, class79.field1730, class83.field1925);
        for (int var4 = 0; var4 < class54.field1203; var4++) {
            int var39 = class20.field430[var4] * 4 + 2 - class73.field1536.field3657 / 32;
            int var40 = class139.field3388[var4] * 4 + 2 - class73.field1536.field3667 / 32;
            class27.method279(var40, var39, class63.field1351[var4], -59);
        }
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var35 = 0; var35 < 104; var35++) {
                class63 var36 = class10.field207[class114.field2572][var5][var35];
                if (var36 != null) {
                    int var37 = var35 * 4 + 2 - class73.field1536.field3667 / 32;
                    int var38 = var5 * 4 + 2 - class73.field1536.field3657 / 32;
                    class27.method279(var37, var38, class113.field2529[0], -81);
                }
            }
        }
        for (int var6 = 0; var6 < class130.field3024; var6++) {
            class150 var31 = class38.field935[class90.field2073[var6]];
            if (var31 != null && var31.method450(-2289)) {
                class137 var32 = var31.field3709;
                if (var32 != null && var32.field3334 != null) {
                    var32 = var32.method1113(932);
                }
                if (var32 != null && var32.field3353 && var32.field3351) {
                    int var33 = var31.field3657 / 32 - class73.field1536.field3657 / 32;
                    int var34 = var31.field3667 / 32 - class73.field1536.field3667 / 32;
                    class27.method279(var34, var33, class113.field2529[1], -13);
                }
            }
        }
        for (int var7 = 0; var7 < class131.field3082; var7++) {
            class55 var23 = class33.field832[class65.field1394[var7]];
            if (var23 != null && var23.method450(-2289)) {
                int var24 = var23.field3657 / 32 - class73.field1536.field3657 / 32;
                boolean var25 = false;
                int var26 = var23.field3667 / 32 - class73.field1536.field3667 / 32;
                long var27 = var23.field1212.method809(0);
                for (int var29 = 0; var29 < class49.field1112; var29++) {
                    if (class4.field67[var29] == var27 && class105.field2404[var29] != 0) {
                        var25 = true;
                        break;
                    }
                }
                boolean var30 = false;
                if (class73.field1536.field1231 != 0 && var23.field1231 != 0 && class73.field1536.field1231 == var23.field1231) {
                    var30 = true;
                }
                if (var25) {
                    class27.method279(var26, var24, class113.field2529[3], -96);
                } else if (var30) {
                    class27.method279(var26, var24, class113.field2529[4], -30);
                } else {
                    class27.method279(var26, var24, class113.field2529[2], -25);
                }
            }
        }
        if (class105.field2402 != 0 && class119.field2680 % 20 < 10) {
            if (class105.field2402 == 1 && class149.field3687 >= 0 && class38.field935.length > class149.field3687) {
                class150 var8 = class38.field935[class149.field3687];
                if (var8 != null) {
                    int var9 = var8.field3667 / 32 - class73.field1536.field3667 / 32;
                    int var10 = var8.field3657 / 32 - class73.field1536.field3657 / 32;
                    class62.method506(class84.field1956[1], var9, var10, -7765);
                }
            }
            if (class105.field2402 == 2) {
                int var11 = (class90.field2061 - class21.field470) * 4 + 2 - class73.field1536.field3657 / 32;
                int var12 = (class82.field1868 - class71.field1479) * 4 + 2 - class73.field1536.field3667 / 32;
                class62.method506(class84.field1956[1], var12, var11, -7765);
            }
            if (class105.field2402 == 10 && class52.field1144 >= 0 && class52.field1144 < class33.field832.length) {
                class55 var13 = class33.field832[class52.field1144];
                if (var13 != null) {
                    int var14 = var13.field3657 / 32 - class73.field1536.field3657 / 32;
                    int var15 = var13.field3667 / 32 - class73.field1536.field3667 / 32;
                    class62.method506(class84.field1956[1], var15, var14, -7765);
                }
            }
        }
        if (class44.field1009 != 0) {
            int var16 = class44.field1009 * 4 + 2 - class73.field1536.field3657 / 32;
            int var17 = class90.field2055 * 4 + 2 - class73.field1536.field3667 / 32;
            class27.method279(var17, var16, class84.field1956[0], -109);
        }
        class7.method41(97, 78, 3, 3, 16777215);
        if (class141.field3447 < 3) {
            class96.field2218.method485(0, 0, 33, 33, 25, 25, class25.field611, 256, class58.field1291, class80.field1763);
        } else {
            byte[] var18 = class46.field1068.field2326;
            int[] var19 = class7.field117;
            for (int var20 = 0; var20 <= 33; var20++) {
                int var21 = class46.field1068.field2325 * var20;
                for (int var22 = 0; var22 <= 33; var22++) {
                    if (var18[var21 + var22] == 0) {
                        var19[var21 + var22] = 0;
                    }
                }
            }
        }
        class55.method448(true);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static final void method411(byte arg0) {
        class42.field978 = 0;
        field1081++;
        if (arg0 != 55) {
            field1083 = null;
        }
        for (int var1 = -1; var1 < class131.field3082 + class130.field3024; var1++) {
            class148 var18;
            if (var1 == -1) {
                var18 = class73.field1536;
            } else if (class131.field3082 <= var1) {
                var18 = class38.field935[class90.field2073[var1 - class131.field3082]];
            } else {
                var18 = class33.field832[class65.field1394[var1]];
            }
            if (var18 != null && var18.method450(arg0 - 2344)) {
                if (var18 instanceof class150) {
                    class137 var19 = ((class150) var18).field3709;
                    if (var19.field3334 != null) {
                        var19 = var19.method1113(932);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class131.field3082 <= var1) {
                    class137 var20 = ((class150) var18).field3709;
                    if (var20.field3334 != null) {
                        var20 = var20.method1113(932);
                    }
                    if (var20.field3350 >= 0 && var20.field3350 < class6.field109.length) {
                        class41.method355(20141, var18, var18.field3650 + 15);
                        if (class114.field2579 > -1) {
                            class6.field109[var20.field3350].method495(class114.field2579 - 12, class57.field1264 + -30);
                        }
                    }
                    if (class105.field2402 == 1 && class90.field2073[var1 - class131.field3082] == class149.field3687 && class119.field2680 % 20 < 10) {
                        class41.method355(20141, var18, var18.field3650 + 15);
                        if (class114.field2579 > -1) {
                            class123.field2733[0].method495(class114.field2579 - 12, class57.field1264 + -28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class55 var22 = (class55) var18;
                    if (var22.field1215 != -1 || var22.field1220 != -1) {
                        class41.method355(20141, var18, var18.field3650 + 15);
                        if (class114.field2579 > -1) {
                            if (var22.field1215 != -1) {
                                class33.field793[var22.field1215].method495(class114.field2579 - 12, -var21 + class57.field1264);
                                var21 += 25;
                            }
                            if (var22.field1220 != -1) {
                                class6.field109[var22.field1220].method495(class114.field2579 - 12, class57.field1264 - var21);
                                var21 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class105.field2402 == 10 && class65.field1394[var1] == class52.field1144) {
                        class41.method355(arg0 + 20086, var18, var18.field3650 + 15);
                        if (class114.field2579 > -1) {
                            class123.field2733[1].method495(class114.field2579 - 12, -var21 + class57.field1264);
                        }
                    }
                }
                if (var18.field3606 != null && (class131.field3082 <= var1 || class80.field1749 == 0 || class80.field1749 == 3 || class80.field1749 == 1 && class129.method1036(0, ((class55) var18).field1212))) {
                    class41.method355(20141, var18, var18.field3650);
                    if (class114.field2579 > -1 && class42.field978 < class139.field3404) {
                        class139.field3408[class42.field978] = class71.field1480.method398(var18.field3606) / 2;
                        class139.field3396[class42.field978] = class71.field1480.field1041;
                        class139.field3401[class42.field978] = class114.field2579;
                        class139.field3383[class42.field978] = class57.field1264;
                        class139.field3407[class42.field978] = var18.field3618;
                        class139.field3387[class42.field978] = var18.field3643;
                        class139.field3390[class42.field978] = var18.field3613;
                        class139.field3385[class42.field978] = var18.field3606;
                        class42.field978++;
                    }
                }
                if (class119.field2680 < var18.field3632) {
                    class41.method355(20141, var18, var18.field3650 + 15);
                    if (class114.field2579 > -1) {
                        int var23 = var18.field3634 * 30 / var18.field3611;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class7.method41(class114.field2579 - 15, class57.field1264 + -3, var23, 5, 65280);
                        class7.method41(class114.field2579 + var23 - 15, class57.field1264 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var18.field3644[var24] > class119.field2680) {
                        class41.method355(20141, var18, var18.field3650 / 2);
                        if (class114.field2579 > -1) {
                            if (var24 == 1) {
                                class57.field1264 -= 20;
                            }
                            if (var24 == 2) {
                                class114.field2579 -= 15;
                                class57.field1264 -= 10;
                            }
                            if (var24 == 3) {
                                class114.field2579 += 15;
                                class57.field1264 -= 10;
                            }
                            class5.field77[var18.field3630[var24]].method495(class114.field2579 - 12, class57.field1264 + -12);
                            class145.field3525.method388(class132.method1074(var18.field3610[var24], (byte) 109), class114.field2579, class57.field1264 + 4, 0);
                            class145.field3525.method388(class132.method1074(var18.field3610[var24], (byte) 53), class114.field2579 - 1, class57.field1264 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class42.field978; var2++) {
            int var3 = class139.field3401[var2];
            int var4 = class139.field3396[var2];
            int var5 = class139.field3408[var2];
            boolean var6 = true;
            int var7 = class139.field3383[var2];
            while (var6) {
                var6 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class139.field3383[var17] - class139.field3396[var17] < var7 - -2 && class139.field3383[var17] + 2 > -var4 + var7 && var3 - var5 < class139.field3408[var17] + class139.field3401[var17] && var3 + var5 > class139.field3401[var17] + -class139.field3408[var17] && var7 > class139.field3383[var17] - class139.field3396[var17]) {
                        var7 = class139.field3383[var17] - class139.field3396[var17];
                        var6 = true;
                    }
                }
            }
            class114.field2579 = class139.field3401[var2];
            class57.field1264 = class139.field3383[var2] = var7;
            class98 var8 = class139.field3385[var2];
            if (class96.field2209 == 0) {
                int var9 = 16776960;
                if (class139.field3407[var2] < 6) {
                    var9 = class147.field3582[class139.field3407[var2]];
                }
                if (class139.field3407[var2] == 6) {
                    var9 = class127.field2854 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class139.field3407[var2] == 7) {
                    var9 = class127.field2854 % 20 >= 10 ? 65535 : 255;
                }
                if (class139.field3407[var2] == 8) {
                    var9 = class127.field2854 % 20 < 10 ? 45056 : 8454016;
                }
                if (class139.field3407[var2] == 9) {
                    int var10 = 150 - class139.field3390[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = var10 * 5 + 65280 - 500;
                    }
                }
                if (class139.field3407[var2] == 10) {
                    int var11 = 150 - class139.field3390[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var9 = (var11 - 100) * 327680 + 255 - (var11 - 100) * 5;
                    }
                }
                if (class139.field3407[var2] == 11) {
                    int var12 = 150 - class139.field3390[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = var12 * 327685 + 65280 - 16384250;
                    } else if (var12 < 150) {
                        var9 = 16777215 + 32768000 - var12 * 327680;
                    }
                }
                if (class139.field3387[var2] == 0) {
                    class71.field1480.method388(var8, class114.field2579, class57.field1264 + 1, 0);
                    class71.field1480.method388(var8, class114.field2579, class57.field1264, var9);
                }
                if (class139.field3387[var2] == 1) {
                    class71.field1480.method389(var8, class114.field2579, class57.field1264 + 1, 0, class127.field2854);
                    class71.field1480.method389(var8, class114.field2579, class57.field1264, var9, class127.field2854);
                }
                if (class139.field3387[var2] == 2) {
                    class71.field1480.method390(var8, class114.field2579, class57.field1264 + 1, 0, class127.field2854);
                    class71.field1480.method390(var8, class114.field2579, class57.field1264, var9, class127.field2854);
                }
                if (class139.field3387[var2] == 3) {
                    class71.field1480.method393(var8, class114.field2579, class57.field1264 + 1, 0, class127.field2854, 150 - class139.field3390[var2]);
                    class71.field1480.method393(var8, class114.field2579, class57.field1264, var9, class127.field2854, 150 - class139.field3390[var2]);
                }
                if (class139.field3387[var2] == 4) {
                    int var13 = class71.field1480.method398(var8);
                    int var14 = (150 - class139.field3390[var2]) * (var13 + 100) / 150;
                    class7.method52(class114.field2579 - 50, 0, class114.field2579 + 50, 334);
                    class71.field1480.method391(var8, class114.field2579 + 50 - var14, class57.field1264 + 1, 0);
                    class71.field1480.method391(var8, class114.field2579 + 50 - var14, class57.field1264, var9);
                    class7.method39();
                }
                if (class139.field3387[var2] == 5) {
                    int var15 = 150 - class139.field3390[var2];
                    int var16 = 0;
                    class7.method52(0, class57.field1264 - class71.field1480.field1041 - 1, 512, class57.field1264 + 5);
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class71.field1480.method388(var8, class114.field2579, class57.field1264 + var16 + 1, 0);
                    class71.field1480.method388(var8, class114.field2579, class57.field1264 + var16, var9);
                    class7.method39();
                }
            } else {
                class71.field1480.method388(var8, class114.field2579, class57.field1264 + 1, 0);
                class71.field1480.method388(var8, class114.field2579, class57.field1264, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static void method412(int arg0) {
        field1084 = null;
        field1093 = null;
        field1089 = null;
        field1082 = null;
        field1088 = null;
        field1085 = null;
        field1080 = null;
        field1092 = null;
        if (arg0 != 32) {
            field1088 = null;
        }
        field1083 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Led;")
    public static final class33 method413(int arg0, int arg1) {
        if (arg0 > -75) {
            field1085 = null;
        }
        field1091++;
        class33 var2 = (class33) class73.field1509.method730((byte) 35, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class130.field3059.method1058(12, 126, arg1);
        class33 var4 = new class33();
        if (var3 != null) {
            var4.method326((byte) -33, new class8(var3));
        }
        var4.method322((byte) 85);
        class73.field1509.method732(-1, var4, (long) arg1);
        return var4;
    }
}
