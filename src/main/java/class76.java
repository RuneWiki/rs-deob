import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class76 {

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    private int field1139 = 0;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    private int field1142 = -1;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Lnk;")
    private class2 field1134 = new class2();

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "Z")
    public boolean field1147 = false;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "[[[I")
    private int[][][] field1143;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    private int field1136;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "[Lnl;")
    private class197[] field1130;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "[I")
    public static int[] field1135 = new int[500];

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field1132 = 0;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "Lnk;")
    public static class2 field1141 = new class2();

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field1144 = new String[500];

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "[Ljh;")
    public static class207[] field1128;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "[Lfi;")
    public static class288[] field1146;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "[[[B")
    public static byte[][][] field1145;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 17)
    public static final void method534(byte arg0) {
        if (class181.field2782 > 1) {
            class181.field2782--;
            class168.field2570 = class71.field1068;
        }
        if (class312.field4940 > 0) {
            class312.field4940--;
        }
        field1137++;
        if (class269.field4144) {
            class269.field4144 = false;
            class330.method2232(125);
            return;
        }
        for (int var1 = 0; var1 < 100 && class81.method558((byte) -92); var1++) {
        }
        if (class304.field4758 != 30) {
            return;
        }
        class249.method1694(173, class265.field4095, false);
        Object var2 = class294.field4531.field1448;
        synchronized (class294.field4531.field1448) {
            if (!class214.field3388) {
                class294.field4531.field1466 = 0;
            } else if (class256.field3994 != 0 || class294.field4531.field1466 >= 40) {
                class265.field4095.method2064(255, 207);
                class44.field624++;
                class265.field4095.method2034(-53, 0);
                int var3 = 0;
                int var4 = class265.field4095.field4679;
                for (int var5 = 0; class294.field4531.field1466 > var5 && (class265.field4095.field4679 - var4) < 240; var5++) {
                    int var6 = class294.field4531.field1465[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class294.field4531.field1464[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    var3++;
                    if (class294.field4531.field1465[var5] == -1 && class294.field4531.field1464[var5] == -1) {
                        var6 = -1;
                        var7 = true;
                        var8 = -1;
                    }
                    if (class278.field4293 != var8 || class288.field4407 != var6) {
                        int var9 = var8 - class278.field4293;
                        class278.field4293 = var8;
                        int var10 = var6 - class288.field4407;
                        class288.field4407 = var6;
                        if (class97.field1508 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class265.field4095.method2044(1247686728, (class97.field1508 << 12) + (var9 << 6) + var10);
                            class97.field1508 = 0;
                        } else if (class97.field1508 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class265.field4095.method2034(-114, class97.field1508 + 128);
                            var10 += 128;
                            var9 += 128;
                            class265.field4095.method2044(1247686728, (var9 << 8) + var10);
                            class97.field1508 = 0;
                        } else if (class97.field1508 >= 32) {
                            class265.field4095.method2044(1247686728, class97.field1508 + 57344);
                            if (var7) {
                                class265.field4095.method2013(Integer.MIN_VALUE, -84);
                            } else {
                                class265.field4095.method2013(var8 | var6 << 16, -91);
                            }
                            class97.field1508 = 0;
                        } else {
                            class265.field4095.method2034(-34, class97.field1508 + 192);
                            if (var7) {
                                class265.field4095.method2013(Integer.MIN_VALUE, -111);
                            } else {
                                class265.field4095.method2013(var6 << 16 | var8, -57);
                            }
                            class97.field1508 = 0;
                        }
                    } else if (class97.field1508 < 2047) {
                        class97.field1508++;
                    }
                }
                class265.field4095.method2019(class265.field4095.field4679 - var4, -16870);
                if (class294.field4531.field1466 > var3) {
                    class294.field4531.field1466 -= var3;
                    for (int var11 = 0; var11 < class294.field4531.field1466; var11++) {
                        class294.field4531.field1464[var11] = class294.field4531.field1464[var3 + var11];
                        class294.field4531.field1465[var11] = class294.field4531.field1465[var11 + var3];
                    }
                } else {
                    class294.field4531.field1466 = 0;
                }
            }
        }
        if (class256.field3994 != 0) {
            class35.field449++;
            long var13 = (class320.field5009 - class124.field1948) / 50L;
            class124.field1948 = class320.field5009;
            int var15 = class7.field81;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var16 = class85.field1295;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var17 = 0;
            if (class256.field3994 == 2) {
                var17 = 1;
            }
            class265.field4095.method2064(255, 212);
            int var18 = (int) var13;
            class265.field4095.method2044(1247686728, var17 << 15 | var18);
            class265.field4095.method2008(var15 << 16 | var16, (byte) 124);
        }
        if (class171.field2600 > 0) {
            class171.field2600--;
        }
        if (class171.field2602 && class171.field2600 <= 0) {
            class171.field2602 = false;
            class171.field2600 = 20;
            class265.field4095.method2064(255, 172);
            class265.field4095.method2044(1247686728, (int) class123.field1922);
            class179.field2739++;
            class265.field4095.method2007(false, (int) class309.field4866);
        }
        if (class2.field8 && !class259.field4024) {
            class345.field5350++;
            class259.field4024 = true;
            class265.field4095.method2064(255, 152);
            class265.field4095.method2034(-40, 1);
        }
        if (!class2.field8 && class259.field4024) {
            class345.field5350++;
            class259.field4024 = false;
            class265.field4095.method2064(255, 152);
            class265.field4095.method2034(-67, 0);
        }
        if (!class342.field5335) {
            class265.field4095.method2064(255, 153);
            class265.field4095.method2058(class297.method1950((byte) -109), -21049);
            class98.field1529++;
            class342.field5335 = true;
        }
        if (class138.field2147) {
            class138.field2147 = false;
        } else {
            class207.field3125 /= 2.0F;
        }
        if (class120.field1844) {
            class120.field1844 = false;
        } else {
            class228.field3656 /= 2.0F;
        }
        class163.method1116(-16366);
        if (class304.field4758 != 30) {
            return;
        }
        class2.method9(-13604);
        class179.method1223(0);
        class98.method677((byte) -48);
        class56.field786++;
        if (class56.field786 > 750) {
            class330.method2232(120);
            return;
        }
        class272.method1788((byte) -33);
        class265.method1758(0);
        int var19 = 77 % ((-arg0 - 51) / 59);
        class174.method1180(false);
        if (class277.field4275 != null) {
            class171.method1159(14382);
        }
        for (int var20 = class51.method345(true, 26512); var20 != -1; var20 = class51.method345(false, 26512)) {
            class150.method1057(var20, -10);
            class104.field1596[class311.method2135(class101.field1576++, 31)] = var20;
        }
        for (class75 var21 = class112.method754(true); var21 != null; var21 = class112.method754(true)) {
            int var22 = var21.method529(false);
            int var23 = var21.method530(-8256);
            if (var22 == 1) {
                class286.field4382[var23] = var21.field1122;
                class160.field2488[class311.method2135(31, class274.field4223++)] = var23;
            } else if (var22 == 2) {
                class204.field3090[var23] = var21.field1118;
                class262.field4051[class311.method2135(class44.field633++, 31)] = var23;
            } else if (var22 == 3) {
                class207 var44 = class78.method547(var23, 112);
                if (!var21.field1118.equals(var44.field3291)) {
                    var44.field3291 = var21.field1118;
                    class277.method1822(4096, var44);
                }
            } else if (var22 == 4) {
                class207 var24 = class78.method547(var23, 113);
                int var25 = var21.field1122;
                int var26 = var21.field1124;
                int var27 = var21.field1117;
                if (var24.field3204 != var25 || var24.field3207 != var26 || var24.field3251 != var27) {
                    var24.field3204 = var25;
                    var24.field3207 = var26;
                    var24.field3251 = var27;
                    class277.method1822(4096, var24);
                }
            } else if (var22 == 5) {
                class207 var28 = class78.method547(var23, 126);
                if (var21.field1122 != var28.field3243 || var21.field1122 == -1) {
                    var28.field3275 = 0;
                    var28.field3289 = 0;
                    var28.field3210 = 1;
                    var28.field3243 = var21.field1122;
                    class277.method1822(4096, var28);
                }
            } else if (var22 == 6) {
                int var38 = var21.field1122;
                int var39 = (var38 & 0x7F07) >> 10;
                int var40 = var38 & 0x1F;
                int var41 = var38 >> 5 & 0x1F;
                int var42 = (var40 << 3) + (var39 << 19) + (var41 << 11);
                class207 var43 = class78.method547(var23, 127);
                if (var43.field3139 != var42) {
                    var43.field3139 = var42;
                    class277.method1822(4096, var43);
                }
            } else if (var22 == 7) {
                class207 var29 = class78.method547(var23, 106);
                boolean var30 = var21.field1122 == 1;
                if (var29.field3197 != var30) {
                    var29.field3197 = var30;
                    class277.method1822(4096, var29);
                }
            } else if (var22 == 8) {
                class207 var37 = class78.method547(var23, 127);
                if (var21.field1122 != var37.field3247 || var21.field1124 != var37.field3215 || var21.field1117 != var37.field3183) {
                    var37.field3215 = var21.field1124;
                    var37.field3183 = var21.field1117;
                    var37.field3247 = var21.field1122;
                    if (var37.field3142 != -1) {
                        if (var37.field3213 > 0) {
                            var37.field3183 = var37.field3183 * 32 / var37.field3213;
                        } else if (var37.field3264 > 0) {
                            var37.field3183 = var37.field3183 * 32 / var37.field3264;
                        }
                    }
                    class277.method1822(4096, var37);
                }
            } else if (var22 == 9) {
                class207 var31 = class78.method547(var23, 124);
                if (var21.field1122 != var31.field3142 || var21.field1124 != var31.field3231) {
                    var31.field3142 = var21.field1122;
                    var31.field3231 = var21.field1124;
                    class277.method1822(4096, var31);
                }
            } else if (var22 == 10) {
                class207 var32 = class78.method547(var23, 99);
                if (var21.field1122 != var32.field3296 || var21.field1124 != var32.field3167 || var21.field1117 != var32.field3249) {
                    var32.field3296 = var21.field1122;
                    var32.field3249 = var21.field1117;
                    var32.field3167 = var21.field1124;
                    class277.method1822(4096, var32);
                }
            } else if (var22 == 11) {
                class207 var36 = class78.method547(var23, 122);
                var36.field3212 = var36.field3143 = var21.field1124;
                var36.field3135 = 0;
                var36.field3177 = var36.field3208 = var21.field1122;
                var36.field3229 = 0;
                class277.method1822(4096, var36);
            } else if (var22 == 12) {
                class207 var33 = class78.method547(var23, 109);
                int var34 = var21.field1122;
                if (var33 != null && var33.field3273 == 0) {
                    if ((var33.field3187 - var33.field3239) < var34) {
                        var34 = var33.field3187 - var33.field3239;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field3270 != var34) {
                        var33.field3270 = var34;
                        class277.method1822(4096, var33);
                    }
                }
            } else if (var22 == 13) {
                class207 var35 = class78.method547(var23, 109);
                var35.field3185 = var21.field1122;
            }
        }
        class81.field1208++;
        if (class329.field5084 != 0) {
            class109.field1691 += 20;
            if (class109.field1691 >= 400) {
                class329.field5084 = 0;
            }
        }
        if (class237.field3803 != null) {
            class275.field4225++;
            if (class275.field4225 >= 15) {
                class277.method1822(4096, class237.field3803);
                class237.field3803 = null;
            }
        }
        if (class294.field4529 != null) {
            class277.method1822(4096, class294.field4529);
            class52.field739++;
            if (class199.field2985 > (class272.field4180 + 5) || class199.field2985 < class272.field4180 - 5 || (class155.field2427 + 5) < class107.field1636 || class107.field1636 < class155.field2427 - 5) {
                class315.field4959 = true;
            }
            if (class63.field941 == 0) {
                if (class315.field4959 && class52.field739 >= 5) {
                    if (class294.field4529 == class249.field3915 && class7.field72 != class64.field974) {
                        class163.field2518++;
                        class207 var45 = class294.field4529;
                        byte var46 = 0;
                        if (class297.field4559 == 1 && var45.field3149 == 206) {
                            var46 = 1;
                        }
                        if (var45.field3301[class7.field72] <= 0) {
                            var46 = 0;
                        }
                        if (client.method888(var45).method725((byte) -45)) {
                            int var49 = class64.field974;
                            int var50 = class7.field72;
                            var45.field3301[var50] = var45.field3301[var49];
                            var45.field3227[var50] = var45.field3227[var49];
                            var45.field3301[var49] = -1;
                            var45.field3227[var49] = 0;
                        } else if (var46 == 1) {
                            int var47 = class7.field72;
                            int var48 = class64.field974;
                            while (var47 != var48) {
                                if (var47 < var48) {
                                    var45.method1382(var48 - 1, var48, true);
                                    var48--;
                                } else if (var48 < var47) {
                                    var45.method1382(var48 + 1, var48, true);
                                    var48++;
                                }
                            }
                        } else {
                            var45.method1382(class7.field72, class64.field974, true);
                        }
                        class265.field4095.method2064(255, 182);
                        class265.field4095.method2012(125, class294.field4529.field3250);
                        class265.field4095.method2018(var46, 128);
                        class265.field4095.method1997(class7.field72, 25311);
                        class265.field4095.method2055(class64.field974, 1);
                    }
                } else if ((class183.field2797 == 1 || class298.method1959(class168.field2565 - 1, 0)) && class168.field2565 > 2) {
                    class246.method1665((byte) -70);
                } else if (class168.field2565 > 0) {
                    class293.method1912((byte) -76);
                }
                class294.field4529 = null;
                class256.field3994 = 0;
                class275.field4225 = 10;
            }
        }
        class183.field2803 = null;
        class71.field1072 = 0;
        class152.field2391 = false;
        class259.field4032 = false;
        class207 var51 = class168.field2575;
        class168.field2575 = null;
        class207 var52 = class310.field4907;
        class310.field4907 = null;
        while (class228.method1566(-5040) && class71.field1072 < 128) {
            class196.field2948[class71.field1072] = class306.field4791;
            class226.field3621[class71.field1072] = class257.field4003;
            class71.field1072++;
        }
        class277.field4275 = null;
        if (class253.field3936 != -1) {
            class230.method1578(0, 0, 0, class174.field2644, -1, 0, class253.field3936, class334.field5203);
        }
        class71.field1068++;
        while (true) {
            class120 var53;
            class207 var54;
            class207 var55;
            do {
                var53 = (class120) class310.field4917.method12(-105);
                if (var53 == null) {
                    while (true) {
                        class120 var56;
                        class207 var57;
                        class207 var58;
                        do {
                            var56 = (class120) field1141.method12(-93);
                            if (var56 == null) {
                                while (true) {
                                    class120 var59;
                                    class207 var60;
                                    class207 var61;
                                    do {
                                        var59 = (class120) class101.field1569.method12(90);
                                        if (var59 == null) {
                                            if (class277.field4275 == null) {
                                                field1132 = 0;
                                            }
                                            if (class50.field706 != null) {
                                                class50.method342((byte) 27);
                                            }
                                            if (class215.field3399 > 0 && class294.field4534[82] && class294.field4534[81] && class3.field28 != 0) {
                                                int var62 = class77.field1154 - class3.field28;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class97.method669(false, class30.field374 + class79.field1173.field476[0], class294.field4535 - -class79.field1173.field505[0], var62);
                                            }
                                            if (class215.field3399 > 0 && class294.field4534[82] && class294.field4534[81]) {
                                                if (class13.field140 != -1) {
                                                    class97.method669(false, class30.field374 + class13.field140, class294.field4535 + class220.field3496, class77.field1154);
                                                }
                                                class56.field790 = 0;
                                                class106.field1631 = 0;
                                            } else if (class106.field1631 == 2) {
                                                if (class13.field140 != -1) {
                                                    class265.field4095.method2064(255, 79);
                                                    class265.field4095.method2055(class253.field3934, 1);
                                                    class270.field4155++;
                                                    class265.field4095.method2044(1247686728, class30.field374 + class13.field140);
                                                    class265.field4095.method2044(1247686728, class294.field4535 + class220.field3496);
                                                    class265.field4095.method2058(class197.field2954, -21049);
                                                    class109.field1691 = 0;
                                                    class329.field5084 = 1;
                                                    class213.field3366 = class7.field81;
                                                    class160.field2486 = class85.field1295;
                                                }
                                                class106.field1631 = 0;
                                            } else if (class56.field790 == 2) {
                                                if (class13.field140 != -1) {
                                                    class265.field4095.method2064(255, 136);
                                                    class68.field1019++;
                                                    class265.field4095.method2007(false, class30.field374 + class13.field140);
                                                    class265.field4095.method2044(1247686728, class294.field4535 + class220.field3496);
                                                    class109.field1691 = 0;
                                                    class329.field5084 = 1;
                                                    class213.field3366 = class7.field81;
                                                    class160.field2486 = class85.field1295;
                                                }
                                                class56.field790 = 0;
                                            } else if (class13.field140 != -1 && class106.field1631 == 0 && class56.field790 == 0) {
                                                class307.method2113(-5, (class220.field3496 << 1) + 1 - class79.field1173.method271((byte) 62) >> 1, (class13.field140 << 1) + 1 - class79.field1173.method271((byte) 90) >> 1, 0);
                                                class329.field5084 = 1;
                                                class160.field2486 = class85.field1295;
                                                class213.field3366 = class7.field81;
                                                class109.field1691 = 0;
                                            }
                                            class13.field140 = -1;
                                            class179.method1222((byte) 124);
                                            if (class168.field2575 != var51) {
                                                if (var51 != null) {
                                                    class277.method1822(4096, var51);
                                                }
                                                if (class168.field2575 != null) {
                                                    class277.method1822(4096, class168.field2575);
                                                }
                                            }
                                            if (class310.field4907 != var52 && class233.field3741 == class170.field2591) {
                                                if (var52 != null) {
                                                    class277.method1822(4096, var52);
                                                }
                                                if (class310.field4907 != null) {
                                                    class277.method1822(4096, class310.field4907);
                                                }
                                            }
                                            if (class310.field4907 == null) {
                                                if (class233.field3741 > 0) {
                                                    class233.field3741--;
                                                }
                                            } else if (class170.field2591 > class233.field3741) {
                                                class233.field3741++;
                                                if (class233.field3741 == class170.field2591) {
                                                    class277.method1822(4096, class310.field4907);
                                                }
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class99.field1536[var63]++;
                                            }
                                            int var64 = class88.method606(-1);
                                            int var65 = class237.method1617(121);
                                            if (var64 > 15000 && var65 > 15000) {
                                                class96.field1477++;
                                                class312.field4940 = 250;
                                                class101.method687(14500, (byte) -104);
                                                class265.field4095.method2064(255, 94);
                                            }
                                            if (class14.field145 != null && class14.field145.field3931 == 1) {
                                                if (class14.field145.field3929 != null) {
                                                    class158.method1097(-1, class83.field1256, class19.field261);
                                                }
                                                class19.field261 = null;
                                                class14.field145 = null;
                                                class83.field1256 = false;
                                            }
                                            class190.field2877++;
                                            class260.field4035++;
                                            if (class260.field4035 > 500) {
                                                int var66 = (int) (Math.random() * 8.0D);
                                                class260.field4035 = 0;
                                                if ((var66 & 0x4) == 4) {
                                                    class265.field4098 += class233.field3733;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class299.field4643 += class233.field3753;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class104.field1610 += class181.field2781;
                                                }
                                            }
                                            if (class299.field4643 < -50) {
                                                class233.field3753 = 2;
                                            }
                                            if (class104.field1610 < -55) {
                                                class181.field2781 = 2;
                                            }
                                            if (class299.field4643 > 50) {
                                                class233.field3753 = -2;
                                            }
                                            class197.field2953++;
                                            if (class197.field2953 > 500) {
                                                class197.field2953 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x1) == 1) {
                                                    class138.field2133 += class203.field3065;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class14.field148 += class43.field611;
                                                }
                                            }
                                            if (class138.field2133 < -60) {
                                                class203.field3065 = 2;
                                            }
                                            if (class14.field148 < -20) {
                                                class43.field611 = 1;
                                            }
                                            if (class14.field148 > 10) {
                                                class43.field611 = -1;
                                            }
                                            if (class138.field2133 > 60) {
                                                class203.field3065 = -2;
                                            }
                                            if (class104.field1610 > 55) {
                                                class181.field2781 = -2;
                                            }
                                            if (class265.field4098 < -40) {
                                                class233.field3733 = 1;
                                            }
                                            if (class265.field4098 > 40) {
                                                class233.field3733 = -1;
                                            }
                                            if (class190.field2877 > 50) {
                                                class64.field973++;
                                                class265.field4095.method2064(255, 242);
                                            }
                                            if (class205.field3107) {
                                                class81.method555(0);
                                                class205.field3107 = false;
                                            }
                                            try {
                                                if (class308.field4851 != null && class265.field4095.field4679 > 0) {
                                                    class308.field4851.method598(0, class265.field4095.field4679, 1, class265.field4095.field4716);
                                                    class190.field2877 = 0;
                                                    class265.field4095.field4679 = 0;
                                                }
                                            } catch (IOException var69) {
                                                class330.method2232(106);
                                            }
                                            return;
                                        }
                                        var60 = var59.field1845;
                                        if (var60.field3283 < 0) {
                                            break;
                                        }
                                        var61 = class78.method547(var60.field3232, 98);
                                    } while (var61 == null || var61.field3253 == null || var61.field3253.length <= var60.field3283 || var61.field3253[var60.field3283] != var60);
                                    class122.method834((byte) 84, var59);
                                }
                            }
                            var57 = var56.field1845;
                            if (var57.field3283 < 0) {
                                break;
                            }
                            var58 = class78.method547(var57.field3232, 113);
                        } while (var58 == null || var58.field3253 == null || var58.field3253.length <= var57.field3283 || var58.field3253[var57.field3283] != var57);
                        class122.method834((byte) 5, var56);
                    }
                }
                var54 = var53.field1845;
                if (var54.field3283 < 0) {
                    break;
                }
                var55 = class78.method547(var54.field3232, 126);
            } while (var55 == null || var55.field3253 == null || var54.field3283 >= var55.field3253.length || var55.field3253[var54.field3283] != var54);
            class122.method834((byte) 104, var53);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 1012)
    public final void method535(int arg0) {
        field1129++;
        for (int var2 = arg0; var2 < this.field1140; var2++) {
            this.field1143[var2][0] = null;
            this.field1143[var2][1] = null;
            this.field1143[var2][2] = null;
            this.field1143[var2] = (int[][]) null;
        }
        this.field1143 = (int[][][]) null;
        this.field1130 = null;
        this.field1134.method5(arg0 + 43);
        this.field1134 = null;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V", line = 1039)
    public static void method536(byte arg0) {
        field1135 = null;
        field1146 = null;
        field1144 = null;
        field1145 = (byte[][][]) null;
        field1141 = null;
        if (arg0 < 126) {
            field1141 = (class2) null;
        }
        field1128 = null;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)V", line = 1054)
    public static final void method537(byte arg0) {
        field1138++;
        try {
            if (class278.field4286 == 1) {
                int var1 = class89.field1362.method440(2);
                if (var1 > 0 && class89.field1362.method452(-1)) {
                    int var2 = var1 - class283.field4341;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class89.field1362.method435(8, var2);
                    return;
                }
                class89.field1362.method443(127);
                class89.field1362.method455(true);
                class240.field3820 = null;
                class323.field5026 = null;
                if (class85.field1289 == null) {
                    class278.field4286 = 0;
                } else {
                    class278.field4286 = 2;
                }
            }
            int var3 = -38 / ((73 - arg0) / 41);
        } catch (Exception var5) {
            var5.printStackTrace();
            class89.field1362.method443(127);
            class240.field3820 = null;
            class85.field1289 = null;
            class278.field4286 = 0;
            class323.field5026 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(III)V", line = 1220)
    public class76(int arg0, int arg1, int arg2) {
        this.field1140 = arg0;
        this.field1143 = new int[this.field1140][3][arg2];
        this.field1136 = arg1;
        this.field1130 = new class197[this.field1136];
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)[[[I", line = 1105)
    public final int[][][] method538(boolean arg0) {
        field1133++;
        if (this.field1140 != this.field1136) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0) {
            for (int var2 = 0; var2 < this.field1140; var2++) {
                this.field1130[var2] = class70.field1041;
            }
            return this.field1143;
        } else {
            return (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)[[I", line = 1135)
    public final int[][] method539(int arg0, int arg1) {
        if (arg0 != 152) {
            return (int[][]) ((int[][]) null);
        }
        field1131++;
        if (this.field1140 == this.field1136) {
            this.field1147 = this.field1130[arg1] == null;
            this.field1130[arg1] = class70.field1041;
            return this.field1143[arg1];
        } else if (this.field1140 == 1) {
            this.field1147 = this.field1142 != arg1;
            this.field1142 = arg1;
            return this.field1143[0];
        } else {
            class197 var3 = this.field1130[arg1];
            if (var3 == null) {
                this.field1147 = true;
                if (this.field1139 >= this.field1140) {
                    class197 var4 = (class197) this.field1134.method6(true);
                    var3 = new class197(arg1, var4.field2960);
                    this.field1130[var4.field2962] = null;
                    var4.method1284(0);
                } else {
                    var3 = new class197(arg1, this.field1139);
                    this.field1139++;
                }
                this.field1130[arg1] = var3;
            } else {
                this.field1147 = false;
            }
            this.field1134.method14(var3, 103);
            return this.field1143[var3.field2960];
        }
    }
}
