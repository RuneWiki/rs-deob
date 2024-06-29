import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class299 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public int field4510 = -1;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "[Z")
    public static boolean[] field4530 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lir;")
    public static class185 field4523;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Lbo;")
    private class453 field4529;

    // $FF: synthetic field
    @OriginalMember(owner = "client!i", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field4534;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Ljava/lang/String;")
    private String field4509;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Ljava/lang/String;")
    private String field4515;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
    private int[] field4511;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[I")
    private int[] field4512;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
    private int[] field4517;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "[I")
    private int[] field4519;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
    private int[] field4521;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[I")
    private int[] field4525;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "[I")
    private int[] field4531;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "[I")
    private int[] field4532;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field4514;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "[Ljava/lang/String;")
    private String[] field4526;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[[I")
    private int[][] field4524;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "[[I")
    private int[][] field4527;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "[[I")
    private int[][] field4528;

    // $FF: synthetic method
    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2031(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method2024(boolean arg0) {
        if (class21.field383 > 1) {
            class92.field1265 = class394.field5732;
            class21.field383--;
        }
        if (class87.field1203 > 0) {
            class87.field1203--;
        }
        field4516++;
        if (class40.field620) {
            class40.field620 = false;
            class11.method91((byte) -65);
            return;
        }
        if (!class165.field2244) {
            class106.method806((byte) -18);
        }
        for (int var1 = 0; var1 < 100 && class87.method706(-586191796); var1++) {
        }
        if (class381.field5579 != 30) {
            return;
        }
        class175.method1165(101, 248, class140.field1797);
        Object var2 = class107.field1411.field508;
        synchronized (class107.field1411.field508) {
            if (!class342.field5105) {
                class107.field1411.field513 = 0;
            } else if (class219.field3054 != 0 || class107.field1411.field513 >= 40) {
                class265.field3923++;
                class140.field1797.method1833(-20379, 73);
                class140.field1797.method2204(0, 8);
                int var3 = class140.field1797.field5049;
                int var4 = 0;
                for (int var5 = 0; class107.field1411.field513 > var5 && (class140.field1797.field5049 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class107.field1411.field514[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class107.field1411.field515[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class107.field1411.field514[var5] == -1 && class107.field1411.field515[var5] == -1) {
                        var7 = -1;
                        var8 = true;
                        var6 = -1;
                    }
                    if (class191.field2660 != var7 || class163.field2228 != var6) {
                        int var9 = var7 - class191.field2660;
                        class191.field2660 = var7;
                        int var10 = var6 - class163.field2228;
                        class163.field2228 = var6;
                        if (class162.field2177 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class140.field1797.method2250(false, (class162.field2177 << 12) + (var9 << 6) + var10);
                            class162.field2177 = 0;
                        } else if (class162.field2177 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class140.field1797.method2204(class162.field2177 + 128, 8);
                            var9 += 128;
                            var10 += 128;
                            class140.field1797.method2250(arg0, (var9 << 8) + var10);
                            class162.field2177 = 0;
                        } else if (class162.field2177 < 32) {
                            class140.field1797.method2204(class162.field2177 + 192, 8);
                            if (var8) {
                                class140.field1797.method2240((byte) -88, Integer.MIN_VALUE);
                            } else {
                                class140.field1797.method2240((byte) -88, var7 | var6 << 16);
                            }
                            class162.field2177 = 0;
                        } else {
                            class140.field1797.method2250(false, class162.field2177 + 57344);
                            if (var8) {
                                class140.field1797.method2240((byte) -88, Integer.MIN_VALUE);
                            } else {
                                class140.field1797.method2240((byte) -88, var6 << 16 | var7);
                            }
                            class162.field2177 = 0;
                        }
                    } else if (class162.field2177 < 2047) {
                        class162.field2177++;
                    }
                }
                class140.field1797.method2251(class140.field1797.field5049 - var3, (byte) -61);
                if (var4 >= class107.field1411.field513) {
                    class107.field1411.field513 = 0;
                } else {
                    class107.field1411.field513 -= var4;
                    for (int var11 = 0; var11 < class107.field1411.field513; var11++) {
                        class107.field1411.field515[var11] = class107.field1411.field515[var4 + var11];
                        class107.field1411.field514[var11] = class107.field1411.field514[var11 + var4];
                    }
                }
            }
        }
        if (class219.field3054 != 0) {
            long var12 = (class101.field1340 - class6.field75) / 50L;
            class6.field75 = class101.field1340;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class402.field5871;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class278.field4085;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (class219.field3054 == 2) {
                var16 = 1;
            }
            class140.field1797.method1833(-20379, 215);
            class16.field267++;
            int var17 = (int) var12;
            class140.field1797.method2253(var17 | var16 << 15, -71);
            class140.field1797.method2217(var14 << 16 | var15, 98);
        }
        if (class366.field5402 > 0) {
            class366.field5402--;
        }
        if (class164.field2233 && class366.field5402 <= 0) {
            class164.field2233 = false;
            class366.field5402 = 20;
            class248.field3558++;
            class140.field1797.method1833(-20379, 87);
            class140.field1797.method2250(false, (int) class39.field588 >> 3);
            class140.field1797.method2225((int) class247.field3479 >> 3, -97);
        }
        if (class104.field1363 && !class167.field2271) {
            class405.field5887++;
            class167.field2271 = true;
            class140.field1797.method1833(-20379, 150);
            class140.field1797.method2204(1, 8);
        }
        if (!class104.field1363 && class167.field2271) {
            class405.field5887++;
            class167.field2271 = false;
            class140.field1797.method1833(-20379, 150);
            class140.field1797.method2204(0, 8);
        }
        if (!class113.field1470) {
            class280.field4125++;
            class140.field1797.method1833(-20379, 166);
            class140.field1797.method2217(class277.method1821(false), 109);
            class113.field1470 = true;
        }
        if (class362.field5367) {
            class362.field5367 = false;
        } else {
            class397.field5791 /= 2.0F;
        }
        if (class322.field4796) {
            class322.field4796 = false;
        } else {
            class267.field3961 /= 2.0F;
        }
        class248.method1625((byte) 112);
        if (class381.field5579 != 30) {
            return;
        }
        class424.method2665(-1);
        class352.method2323(125);
        class185.method1212(-2);
        class195.field2702++;
        if (class195.field2702 > 750) {
            class11.method91((byte) -46);
            return;
        }
        class69.method579(19294);
        class192.method1284((byte) 45);
        class331.method2168(-97);
        for (int var18 = class370.method2439(true, 26729); var18 != -1; var18 = class370.method2439(false, 26729)) {
            class438.method2744(32325, var18);
            class9.field132[class394.method2529(class303.field4547++, 31)] = var18;
        }
        for (class440 var19 = class8.method55(0); var19 != null; var19 = class8.method55(0)) {
            int var20 = var19.method2753(true);
            int var21 = var19.method2751(119);
            if (var20 == 1) {
                class216.field3014[var21] = var19.field6375;
                class320.field4757 |= class28.field476[var21];
                class36.field554[class394.method2529(class86.field1192++, 31)] = var21;
            } else if (var20 == 2) {
                class178.field2391[var21] = var19.field6376;
                class254.field3711[class394.method2529(class179.field2398++, 31)] = var21;
            } else if (var20 == 3) {
                class248 var43 = class27.method224(65535, var21);
                if (!var19.field6376.equals(var43.field3588)) {
                    var43.field3588 = var19.field6376;
                    class92.method744(20491, var43);
                }
            } else if (var20 == 4) {
                class248 var39 = class27.method224(65535, var21);
                int var40 = var19.field6375;
                int var41 = var19.field6374;
                int var42 = var19.field6379;
                if (var39.field3535 != var40 || var39.field3638 != var41 || var39.field3643 != var42) {
                    var39.field3643 = var42;
                    var39.field3535 = var40;
                    var39.field3638 = var41;
                    class92.method744(20491, var39);
                }
            } else if (var20 == 5) {
                class248 var22 = class27.method224(65535, var21);
                if (var19.field6375 != var22.field3600 || var19.field6375 == -1) {
                    var22.field3606 = 1;
                    var22.field3662 = 0;
                    var22.field3622 = 0;
                    var22.field3600 = var19.field6375;
                    class92.method744(20491, var22);
                }
            } else if (var20 == 6) {
                int var33 = var19.field6375;
                int var34 = var33 >> 10 & 0x1F;
                int var35 = (var33 & 0x3E2) >> 5;
                int var36 = var33 & 0x1F;
                int var37 = (var36 << 3) + ((var34 << 19) + (var35 << 11));
                class248 var38 = class27.method224(65535, var21);
                if (var38.field3483 != var37) {
                    var38.field3483 = var37;
                    class92.method744(20491, var38);
                }
            } else if (var20 == 7) {
                class248 var23 = class27.method224(65535, var21);
                boolean var24 = var19.field6375 == 1;
                if (var24 != var23.field3605) {
                    var23.field3605 = var24;
                    class92.method744(20491, var23);
                }
            } else if (var20 == 8) {
                class248 var32 = class27.method224(65535, var21);
                if (var19.field6375 != var32.field3607 || var19.field6374 != var32.field3548 || var19.field6379 != var32.field3523) {
                    var32.field3548 = var19.field6374;
                    var32.field3607 = var19.field6375;
                    var32.field3523 = var19.field6379;
                    if (var32.field3494 != -1) {
                        if (var32.field3561 > 0) {
                            var32.field3523 = var32.field3523 * 32 / var32.field3561;
                        } else if (var32.field3567 > 0) {
                            var32.field3523 = var32.field3523 * 32 / var32.field3567;
                        }
                    }
                    class92.method744(20491, var32);
                }
            } else if (var20 == 9) {
                class248 var31 = class27.method224(65535, var21);
                if (var19.field6375 != var31.field3494 || var19.field6374 != var31.field3538) {
                    var31.field3538 = var19.field6374;
                    var31.field3494 = var19.field6375;
                    class92.method744(20491, var31);
                }
            } else if (var20 == 10) {
                class248 var30 = class27.method224(65535, var21);
                if (var19.field6375 != var30.field3579 || var19.field6374 != var30.field3652 || var19.field6379 != var30.field3621) {
                    var30.field3652 = var19.field6374;
                    var30.field3621 = var19.field6379;
                    var30.field3579 = var19.field6375;
                    class92.method744(20491, var30);
                }
            } else if (var20 == 11) {
                class248 var25 = class27.method224(65535, var21);
                var25.field3507 = var25.field3508 = var19.field6374;
                var25.field3503 = var25.field3599 = var19.field6375;
                var25.field3546 = 0;
                var25.field3524 = 0;
                class92.method744(20491, var25);
            } else if (var20 == 12) {
                class248 var26 = class27.method224(65535, var21);
                int var27 = var19.field6375;
                if (var26 != null && var26.field3555 == 0) {
                    if (var26.field3568 - var26.field3564 < var27) {
                        var27 = var26.field3568 - var26.field3564;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                    if (var26.field3499 != var27) {
                        var26.field3499 = var27;
                        class92.method744(20491, var26);
                    }
                }
            } else if (var20 == 13) {
                class248 var28 = class27.method224(65535, var21);
                var28.field3618 = var19.field6375;
            } else if (var20 == 14) {
                class248 var29 = class27.method224(65535, var21);
                var29.field3668 = var19.field6375;
            } else if (var20 == 15) {
                class400.field5859 = true;
                class47.field712 = var19.field6375;
                class142.field1805 = var19.field6374;
            }
        }
        if (class50.field757 != 0) {
            class48.field754 += 20;
            if (class48.field754 >= 400) {
                class50.field757 = 0;
            }
        }
        class216.field3021++;
        if (class46.field696 != null) {
            class134.field1746++;
            if (class134.field1746 >= 15) {
                class92.method744(20491, class46.field696);
                class46.field696 = null;
            }
        }
        class248 var44 = class273.field4009;
        class273.field4009 = null;
        class248 var45 = class242.field3380;
        class242.field3380 = null;
        class160.field2089 = null;
        class85.field1183 = 0;
        class77.field1057 = arg0;
        class96.field1304 = false;
        while (class335.method2186(127) && class85.field1183 < 128) {
            if (!class289.method1966(3032) || class114.field1493 != '`' && class114.field1493 != '§') {
                class348.field5181[class85.field1183] = class27.field475;
                class309.field4581[class85.field1183] = class114.field1493;
                class85.field1183++;
            } else if (class62.method548(true)) {
                class357.method2344((byte) -128);
            } else {
                class93.method748(-7065);
            }
        }
        if (class62.method548(true)) {
            class384.method2493((byte) 48);
        }
        class123.field1585 = null;
        class97.method766(125, (class248) null, -1, -1);
        class139.method976(-1, (byte) 103, -1, (class248) null);
        if (class233.field3246 != -1) {
            class435.method2715(0, class435.field6313, 0, class233.field3246, 0, (byte) -125, class357.field5298, 0);
        }
        class394.field5732++;
        if (class123.field1585 != null) {
            class330.method2160(-1);
        }
        if (class389.field5688) {
            class212.field2968++;
            class140.field1797.method1833(-20379, 52);
            class140.field1797.method2240((byte) -88, class352.field5218 | class53.field818 << 28 | class295.field4453 << 14);
            class389.field5688 = false;
        }
        while (true) {
            class452 var46;
            class248 var47;
            class248 var48;
            do {
                var46 = (class452) class127.field1656.method1569(24502);
                if (var46 == null) {
                    while (true) {
                        class452 var49;
                        class248 var50;
                        class248 var51;
                        do {
                            var49 = (class452) class57.field856.method1569(24502);
                            if (var49 == null) {
                                while (true) {
                                    class452 var52;
                                    class248 var53;
                                    class248 var54;
                                    do {
                                        var52 = (class452) class406.field5894.method1569(24502);
                                        if (var52 == null) {
                                            if (class123.field1585 == null) {
                                                class192.field2680 = 0;
                                            }
                                            if (class171.field2342 != null) {
                                                class27.method225(103);
                                            }
                                            if (class7.field93 > 0 && class277.field4063[82] && class277.field4063[81] && class240.field3366 != 0) {
                                                int var55 = class268.field3973 - class240.field3366;
                                                if (var55 < 0) {
                                                    var55 = 0;
                                                } else if (var55 > 3) {
                                                    var55 = 3;
                                                }
                                                class30.method241(-100, class383.field5609.field2189[0] + class90.field1223, var55, class383.field5609.field2190[0] + class236.field3292);
                                            }
                                            class440.method2752(-112);
                                            if (class346.field5156 != null) {
                                                class92.method744(20491, class346.field5156);
                                                if (class277.field4060 > class308.field4574 + 5 || class277.field4060 < (class308.field4574 - 5) || (class280.field4127 + 5) < class217.field3032 || class217.field3032 < (class280.field4127 - 5)) {
                                                    class274.field4026 = true;
                                                }
                                                class245.field3455++;
                                                if (class21.field388 == 0) {
                                                    if (class274.field4026 && class245.field3455 >= 5) {
                                                        if (class348.field5177 == class346.field5156 && class295.field4457 != class210.field2854) {
                                                            class248 var56 = class346.field5156;
                                                            byte var57 = 0;
                                                            if (class378.field5530 == 1 && var56.field3624 == 206) {
                                                                var57 = 1;
                                                            }
                                                            if (var56.field3651[class210.field2854] <= 0) {
                                                                var57 = 0;
                                                            }
                                                            class348.field5184++;
                                                            if (var57 == 1) {
                                                                int var58 = class295.field4457;
                                                                int var59 = class210.field2854;
                                                                while (var58 != var59) {
                                                                    if (var59 < var58) {
                                                                        var56.method1626(var58, var58 - 1, (byte) -72);
                                                                        var58--;
                                                                    } else if (var58 < var59) {
                                                                        var56.method1626(var58, var58 + 1, (byte) -86);
                                                                        var58++;
                                                                    }
                                                                }
                                                            } else {
                                                                var56.method1626(class295.field4457, class210.field2854, (byte) -122);
                                                            }
                                                            class140.field1797.method1833(-20379, 38);
                                                            class140.field1797.method2240((byte) -88, class346.field5156.field3636);
                                                            class140.field1797.method2225(class210.field2854, -125);
                                                            class140.field1797.method2220(1, var57);
                                                            class140.field1797.method2250(false, class295.field4457);
                                                        }
                                                    } else if ((class301.field4541 == 1 || class204.method1350((byte) -125)) && class402.field5874 > 2) {
                                                        class211.method1385(-124);
                                                    } else if (class170.method1135(false)) {
                                                        class134.method957(-112);
                                                    }
                                                    class346.field5156 = null;
                                                    class219.field3054 = 0;
                                                    class134.field1746 = 10;
                                                }
                                            }
                                            if (class273.field4009 != var44) {
                                                if (var44 != null) {
                                                    class92.method744(20491, var44);
                                                }
                                                if (class273.field4009 != null) {
                                                    class92.method744(20491, class273.field4009);
                                                }
                                            }
                                            if (class242.field3380 != var45 && class421.field6118 == class246.field3463) {
                                                if (var45 != null) {
                                                    class92.method744(20491, var45);
                                                }
                                                if (class242.field3380 != null) {
                                                    class92.method744(20491, class242.field3380);
                                                }
                                            }
                                            if (class242.field3380 == null) {
                                                if (class421.field6118 > 0) {
                                                    class421.field6118--;
                                                }
                                            } else if (class421.field6118 < class246.field3463) {
                                                class421.field6118++;
                                                if (class421.field6118 == class246.field3463) {
                                                    class92.method744(20491, class242.field3380);
                                                }
                                            }
                                            for (int var60 = 0; var60 < 5; var60++) {
                                                int var10002 = class110.field1434[var60]++;
                                            }
                                            int var61 = class369.method2431(26207);
                                            int var62 = class338.method2197(85);
                                            if (var61 > 15000 && var62 > 15000) {
                                                class87.field1203 = 250;
                                                class38.field574++;
                                                class140.method980(-90, 14500);
                                                class140.field1797.method1833(-20379, 191);
                                            }
                                            if (class320.field4757 && (class98.method768((byte) 62) - 60000L) > class171.field2341) {
                                                class322.method2119((byte) -50);
                                            }
                                            class239.field3358++;
                                            if (class239.field3358 > 500) {
                                                class239.field3358 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x4) == 4) {
                                                    class235.field3283 += class277.field4066;
                                                }
                                                if ((var63 & 0x1) == 1) {
                                                    class424.field6188 += class384.field5618;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class78.field1092 += class11.field190;
                                                }
                                            }
                                            if (class424.field6188 < -50) {
                                                class384.field5618 = 2;
                                            }
                                            if (class78.field1092 < -55) {
                                                class11.field190 = 2;
                                            }
                                            if (class424.field6188 > 50) {
                                                class384.field5618 = -2;
                                            }
                                            if (class78.field1092 > 55) {
                                                class11.field190 = -2;
                                            }
                                            if (class235.field3283 < -40) {
                                                class277.field4066 = 1;
                                            }
                                            class118.field1534++;
                                            if (class235.field3283 > 40) {
                                                class277.field4066 = -1;
                                            }
                                            if (class118.field1534 > 500) {
                                                class118.field1534 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x2) == 2) {
                                                    class30.field484 += class94.field1280;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class93.field1268 += class365.field5398;
                                                }
                                            }
                                            if (class93.field1268 < -60) {
                                                class365.field5398 = 2;
                                            }
                                            if (class30.field484 < -20) {
                                                class94.field1280 = 1;
                                            }
                                            if (class93.field1268 > 60) {
                                                class365.field5398 = -2;
                                            }
                                            class350.field5207++;
                                            if (class30.field484 > 10) {
                                                class94.field1280 = -1;
                                            }
                                            if (class350.field5207 > 50) {
                                                class423.field6146++;
                                                class140.field1797.method1833(-20379, 135);
                                            }
                                            if (class338.field5002) {
                                                class228.method1483(true);
                                                class338.field5002 = false;
                                            }
                                            try {
                                                if (class290.field4380 != null && class140.field1797.field5049 > 0) {
                                                    class290.field4380.method2365(class140.field1797.field5042, class140.field1797.field5049, 5000, 0);
                                                    class350.field5207 = 0;
                                                    class140.field1797.field5049 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class11.method91((byte) -124);
                                                return;
                                            }
                                        }
                                        var53 = var52.field6571;
                                        if (var53.field3505 < 0) {
                                            break;
                                        }
                                        var54 = class27.method224(65535, var53.field3584);
                                    } while (var54 == null || var54.field3528 == null || var53.field3505 >= var54.field3528.length || var54.field3528[var53.field3505] != var53);
                                    class293.method1989(var52);
                                }
                            }
                            var50 = var49.field6571;
                            if (var50.field3505 < 0) {
                                break;
                            }
                            var51 = class27.method224(65535, var50.field3584);
                        } while (var51 == null || var51.field3528 == null || var51.field3528.length <= var50.field3505 || var51.field3528[var50.field3505] != var50);
                        class293.method1989(var49);
                    }
                }
                var47 = var46.field6571;
                if (var47.field3505 < 0) {
                    break;
                }
                var48 = class27.method224(65535, var47.field3584);
            } while (var48 == null || var48.field3528 == null || var48.field3528.length <= var47.field3505 || var48.field3528[var47.field3505] != var47);
            class293.method1989(var46);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lfb;IZ)V", line = 982)
    private final void method2025(class341 arg0, int arg1, boolean arg2) {
        field4533++;
        if (arg2) {
            this.field4532 = null;
        }
        if (arg1 == 1) {
            this.field4515 = arg0.method2255(-4182);
        } else if (arg1 == 2) {
            this.field4509 = arg0.method2255(-4182);
        } else if (arg1 == 3) {
            int var22 = arg0.method2233((byte) 104);
            this.field4528 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field4528[var23][0] = arg0.method2239(-1076227960);
                this.field4528[var23][1] = arg0.method2232(-32);
                this.field4528[var23][2] = arg0.method2232(118);
            }
        } else if (arg1 == 4) {
            int var20 = arg0.method2233((byte) 104);
            this.field4524 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field4524[var21][0] = arg0.method2239(-1076227960);
                this.field4524[var21][1] = arg0.method2232(-123);
                this.field4524[var21][2] = arg0.method2232(-8);
            }
        } else if (arg1 == 5) {
            arg0.method2239(-1076227960);
        } else if (arg1 == 6) {
            arg0.method2233((byte) 104);
        } else if (arg1 == 7) {
            arg0.method2233((byte) 104);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method2233((byte) 104);
                return;
            }
            if (arg1 == 10) {
                int var4 = arg0.method2233((byte) 104);
                this.field4512 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4512[var5] = arg0.method2232(115);
                }
                return;
            }
            if (arg1 == 12) {
                arg0.method2232(-120);
                return;
            }
            if (arg1 == 13) {
                int var6 = arg0.method2233((byte) 104);
                this.field4521 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4521[var7] = arg0.method2239(-1076227960);
                }
                return;
            }
            if (arg1 == 14) {
                int var8 = arg0.method2233((byte) 104);
                this.field4527 = new int[var8][2];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field4527[var9][0] = arg0.method2233((byte) 104);
                    this.field4527[var9][1] = arg0.method2233((byte) 104);
                }
                return;
            }
            if (arg1 == 15) {
                arg0.method2239(-1076227960);
                return;
            }
            if (arg1 == 17) {
                this.field4510 = arg0.method2239(-1076227960);
                return;
            }
            if (arg1 != 18) {
                if (arg1 == 19) {
                    int var16 = arg0.method2233((byte) 104);
                    this.field4526 = new String[var16];
                    this.field4531 = new int[var16];
                    this.field4525 = new int[var16];
                    this.field4511 = new int[var16];
                    for (int var17 = 0; var17 < var16; var17++) {
                        this.field4525[var17] = arg0.method2232(103);
                        this.field4531[var17] = arg0.method2232(-105);
                        this.field4511[var17] = arg0.method2232(95);
                        this.field4526[var17] = arg0.method2261((byte) 106);
                    }
                } else if (arg1 == 249) {
                    int var10 = arg0.method2233((byte) 104);
                    if (this.field4529 == null) {
                        int var11 = class41.method299(2, var10);
                        this.field4529 = new class453(var11);
                    }
                    for (int var12 = 0; var12 < var10; var12++) {
                        boolean var13 = arg0.method2233((byte) 104) == 1;
                        int var14 = arg0.method2249(32767);
                        class418 var15;
                        if (var13) {
                            var15 = new class143(arg0.method2261((byte) 121));
                        } else {
                            var15 = new class17(arg0.method2232(-87));
                        }
                        this.field4529.method2815(-1, (long) var14, var15);
                    }
                    return;
                }
                return;
            }
            int var18 = arg0.method2233((byte) 104);
            this.field4514 = new String[var18];
            this.field4517 = new int[var18];
            this.field4519 = new int[var18];
            this.field4532 = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                this.field4532[var19] = arg0.method2232(94);
                this.field4519[var19] = arg0.method2232(105);
                this.field4517[var19] = arg0.method2232(-103);
                this.field4514[var19] = arg0.method2261((byte) 74);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLtj;I)Z", line = 1220)
    public static final boolean method2026(byte arg0, class298 arg1, int arg2) {
        field4520++;
        int var3 = (class351.field5217 - 104) / 2;
        int var4 = (class143.field1815 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var52 = var4; var52 < (var4 + 104); var52++) {
                for (int var53 = arg2; var53 <= 3; var53++) {
                    if (class329.method2155(16, var52, var53, var6, arg2)) {
                        int var54 = var53;
                        if (class186.method1239(var52, 256, var6)) {
                            var54 = var53 - 1;
                        }
                        if (var54 >= 0) {
                            var5 &= class138.method970(var52, var54, (byte) 74, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class322.field4804 = arg1.method514(var7, 0, 512, 512, 512);
        class357.method2343(false);
        int var9 = 121 % ((2 - arg0) / 37);
        int var10 = (((int) (Math.random() * 20.0D) - 10) + 238 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (238 - -((int) (Math.random() * 20.0D)) - 10) | 0xFF000000;
        int var11 = (((int) (Math.random() * 20.0D)) + 238 - 10 | 0x86B5FF00) << 16;
        int var12 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var13 = new boolean[class128.field1668][class128.field1668];
        for (int var14 = var3; var14 < (var3 + 104); var14 += class128.field1668) {
            for (int var37 = var4; var37 < (var4 + 104); var37 += class128.field1668) {
                arg1.method462(0, 0, class128.field1668 * 4, class128.field1668 * 4);
                arg1.method486(-16777216);
                for (int var38 = arg2; var38 <= 3; var38++) {
                    for (int var45 = 0; var45 < class128.field1668; var45++) {
                        for (int var51 = 0; var51 < class128.field1668; var51++) {
                            var13[var45][var51] = class329.method2155(16, var37 + var51, var38, var14 + var45, arg2);
                        }
                    }
                    class142.field1804[var38].method740(0, 0, 1024, var14, var37, class128.field1668 + var14, class128.field1668 + var37, var13);
                    if (!class325.field4808) {
                        for (int var46 = -4; var46 < class128.field1668; var46++) {
                            for (int var47 = -4; var47 < class128.field1668; var47++) {
                                int var48 = var14 + var46;
                                int var49 = var37 + var47;
                                if (var3 <= var48 && var49 >= var4 && class329.method2155(16, var49, var38, var48, arg2)) {
                                    int var50 = var38;
                                    if (class186.method1239(var49, 256, var48)) {
                                        var50 = var38 - 1;
                                    }
                                    if (var50 >= 0) {
                                        class4.method22(var10, var50, var49, (byte) -128, arg1, var48, var11, var46 * 4, (class128.field1668 - var47) * 4 - 4);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class325.field4808) {
                    class280 var39 = class420.field6108[arg2];
                    for (int var40 = 0; var40 < class128.field1668; var40++) {
                        for (int var41 = 0; var41 < class128.field1668; var41++) {
                            int var42 = var14 + var40;
                            int var43 = var37 + var41;
                            int var44 = var39.field4115[var42 - var39.field4110][var43 - var39.field4106];
                            if ((var44 & 0x40240000) != 0) {
                                arg1.method2023(4, var40 * 4, (class128.field1668 - var41) * 4 - 4, -11682, 4, -1713569622);
                            } else if ((var44 & 0x800000) != 0) {
                                arg1.method2016(-1713569622, var40 * 4, 4, 104, (class128.field1668 - var41) * 4 - 4);
                            } else if ((var44 & 0x2000000) != 0) {
                                arg1.method2017(4, (byte) -3, -1713569622, var40 * 4 + 3, (class128.field1668 - var41) * 4 + -4);
                            } else if ((var44 & 0x8000000) != 0) {
                                arg1.method2016(-1713569622, var40 * 4, 4, 110, (class128.field1668 - var41) * 4 - 1);
                            } else if ((var44 & 0x20000000) != 0) {
                                arg1.method2017(4, (byte) -3, -1713569622, var40 * 4, (class128.field1668 - var41) * 4 - 4);
                            }
                        }
                    }
                }
                arg1.method435(0, 0, class128.field1668 * 4, class128.field1668 * 4, var12, 2);
                class322.field4804.method262((var14 - var3) * 4 + 48, -((-var4 + var37) * 4) + 464 + -(class128.field1668 * 4), class128.field1668 * 4, class128.field1668 * 4, 0, 0);
            }
        }
        arg1.method472();
        arg1.method486(-16777215);
        class274.method1812(-1695);
        class330.field4868 = 0;
        class149.field1887.method1574(-32166);
        if (!class325.field4808) {
            for (int var15 = var3; var15 < (var3 + 104); var15++) {
                for (int var21 = var4; var21 < (var4 + 104); var21++) {
                    for (int var22 = arg2; arg2 + 1 >= var22 && var22 <= 3; var22++) {
                        if (class329.method2155(16, var21, var22, var15, arg2)) {
                            class56 var23 = (class56) class104.method792(var22, var15, var21);
                            if (var23 == null) {
                                var23 = (class56) class31.method243(var22, var15, var21, field4534 == null ? (field4534 = method2031("lk")) : field4534);
                            }
                            if (var23 == null) {
                                var23 = (class56) class57.method421(var22, var15, var21);
                            }
                            if (var23 == null) {
                                var23 = (class56) class235.method1526(var22, var15, var21);
                            }
                            if (var23 != null) {
                                class212 var24 = class372.method2447(var23.method116(24186), (byte) -88);
                                if (!var24.field2892 || class190.field2652) {
                                    int var25 = var24.field2940;
                                    if (var24.field2944 != null) {
                                        for (int var26 = 0; var26 < var24.field2944.length; var26++) {
                                            if (var24.field2944[var26] != -1) {
                                                class212 var27 = class372.method2447(var24.field2944[var26], (byte) -109);
                                                if (var27.field2940 >= 0) {
                                                    var25 = var27.field2940;
                                                }
                                            }
                                        }
                                    }
                                    if (var25 >= 0) {
                                        boolean var28 = false;
                                        if (var25 >= 0) {
                                            class170 var29 = class174.method1160(-28930, var25);
                                            if (var29 != null && var29.field2332) {
                                                var28 = true;
                                            }
                                        }
                                        int var30 = var15;
                                        int var31 = var21;
                                        if (var28) {
                                            int[][] var32 = class420.field6108[var22].field4115;
                                            int var33 = class420.field6108[var22].field4110;
                                            int var34 = class420.field6108[var22].field4106;
                                            for (int var35 = 0; var35 < 10; var35++) {
                                                int var36 = (int) (Math.random() * 4.0D);
                                                if (var36 == 0 && var30 > var3 && (var15 - 3) < var30 && (var32[var30 - (var33 + 1)][var31 - var34] & 0x2C0108) == 0) {
                                                    var30--;
                                                }
                                                if (var36 == 1 && var3 + 104 - 1 > var30 && var30 < (var15 + 3) && (var32[var30 + 1 - var33][var31 - var34] & 0x2C0180) == 0) {
                                                    var30++;
                                                }
                                                if (var36 == 2 && var31 > var4 && (var21 - 3) < var31 && (var32[var30 - var33][var31 - var34 - 1] & 0x2C0102) == 0) {
                                                    var31--;
                                                }
                                                if (var36 == 3 && var31 < var4 + 104 - 1 && var31 < (var21 + 3) && (var32[var30 - var33][var31 + 1 - var34] & 0x2C0120) == 0) {
                                                    var31++;
                                                }
                                            }
                                        }
                                        class443.field6398[class330.field4868] = var24.field2942;
                                        class78.field1094[class330.field4868] = var30;
                                        class271.field3996[class330.field4868] = var31;
                                        class330.field4868++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class162.field2130 != null) {
                class90.field1225.field2501 = 1;
                class350.method2314(1024, 64, 2);
                for (int var16 = 0; var16 < class162.field2130.field3983; var16++) {
                    int var17 = class162.field2130.field3984[var16];
                    if ((var17 >> 28) == class268.field3973) {
                        int var18 = (var17 >> 14 & 0x3FFF) - class236.field3292;
                        int var19 = (var17 & 0x3FFF) - class90.field1223;
                        if (var18 >= 0 && class351.field5217 > var18 && var19 >= 0 && var19 < class143.field1815) {
                            class149.field1887.method1560(-126, new class17(var16));
                        } else {
                            class170 var20 = class174.method1160(-28930, class162.field2130.field3979[var16]);
                            if (var20.field2326 != null && (var18 + var20.field2340) >= 0 && class351.field5217 > (var20.field2296 + var18) && var20.field2333 + var19 >= 0 && class143.field1815 > (var20.field2297 + var19)) {
                                class149.field1887.method1560(-112, new class17(var16));
                            }
                        }
                    }
                }
                class350.method2314(128, 64, 2);
                class90.field1225.field2501 = 2;
                class90.field1225.method1211(0);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILfb;)V", line = 1625)
    public final void method2027(int arg0, class341 arg1) {
        field4513++;
        if (arg0 < 48) {
            this.field4527 = null;
        }
        while (true) {
            int var3 = arg1.method2233((byte) 104);
            if (var3 == 0) {
                return;
            }
            this.method2025(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 1658)
    public static final void method2028(byte arg0) {
        field4518++;
        if (class17.field279 == 0) {
            return;
        }
        try {
            if ((++class40.field603) > 2000) {
                if (class290.field4380 != null) {
                    class290.field4380.method2360((byte) -125);
                    class290.field4380 = null;
                }
                if (class86.field1195 >= 1) {
                    class17.field279 = 0;
                    class8.field111 = -5;
                    return;
                }
                class40.field603 = 0;
                class17.field279 = 1;
                class86.field1195++;
                if (client.field842 == class64.field964) {
                    class64.field964 = class129.field1693;
                } else {
                    class64.field964 = client.field842;
                }
            }
            if (class17.field279 == 1) {
                class184.field2477 = class63.field948.method2385(0, class64.field964, class415.field6005);
                class17.field279 = 2;
            }
            if (class17.field279 == 2) {
                if (class184.field2477.field3104 == 2) {
                    throw new IOException();
                }
                if (class184.field2477.field3104 != 1) {
                    return;
                }
                class290.field4380 = new class359((Socket) class184.field2477.field3105, class63.field948);
                class184.field2477 = null;
                class290.field4380.method2365(class140.field1797.field5042, class140.field1797.field5049, 5000, 0);
                if (class78.field1088 != null) {
                    class78.field1088.method2536(0);
                }
                if (class261.field3836 != null) {
                    class261.field3836.method2536(0);
                }
                int var1 = class290.field4380.method2362(27648);
                if (class78.field1088 != null) {
                    class78.field1088.method2536(0);
                }
                if (class261.field3836 != null) {
                    class261.field3836.method2536(0);
                }
                if (var1 != 21) {
                    class17.field279 = 0;
                    class8.field111 = var1;
                    class290.field4380.method2360((byte) 95);
                    class290.field4380 = null;
                    return;
                }
                class17.field279 = 3;
            }
            if (class17.field279 == 3) {
                if (class290.field4380.method2359(true) < 1) {
                    return;
                }
                class139.field1793 = new String[class290.field4380.method2362(27648)];
                class17.field279 = 4;
            }
            if (class17.field279 == 4) {
                if (class290.field4380.method2359(true) >= class139.field1793.length * 8) {
                    class27.field471.field5049 = 0;
                    class290.field4380.method2366(class27.field471.field5042, 0, 0, class139.field1793.length * 8);
                    for (int var2 = 0; var2 < class139.field1793.length; var2++) {
                        class139.field1793[var2] = class237.method1544(class27.field471.method2231(67), 11764);
                    }
                    class17.field279 = 0;
                    class8.field111 = 21;
                    class290.field4380.method2360((byte) -35);
                    class290.field4380 = null;
                }
            } else if (arg0 <= 93) {
                method2024(true);
            }
        } catch (IOException var3) {
            if (class290.field4380 != null) {
                class290.field4380.method2360((byte) 68);
                class290.field4380 = null;
            }
            if (class86.field1195 < 1) {
                class17.field279 = 1;
                class86.field1195++;
                class40.field603 = 0;
                if (client.field842 == class64.field964) {
                    class64.field964 = class129.field1693;
                } else {
                    class64.field964 = client.field842;
                }
            } else {
                class17.field279 = 0;
                class8.field111 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V", line = 1826)
    public static void method2029(byte arg0) {
        field4523 = null;
        int var1 = 75 % ((52 - arg0) / 60);
        field4530 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 1836)
    public final void method2030(int arg0) {
        if (arg0 != -7) {
            this.field4512 = null;
        }
        if (this.field4509 == null) {
            this.field4509 = this.field4515;
        }
        field4522++;
    }
}
