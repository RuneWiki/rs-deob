import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class60 {

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public int field875 = -1;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
    public static boolean field868 = false;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
    public static int[] field869 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field874 = 0;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field876 = 0;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Lmh;")
    public static class62 field872 = class201.method1405(true, "welle2:");

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lea;")
    public class64 field873;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
    public int[] field879;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "[Lmh;")
    public class62[] field877;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([FI)[F", line = 4)
    public static final float[] method390(float[] arg0, int arg1) {
        field870++;
        int var2 = -9 / ((-arg1 - 63) / 32);
        if (arg0 == null) {
            return null;
        } else {
            float[] var3 = new float[arg0.length];
            class231.method1636(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 30)
    public static final void method391(byte arg0) {
        field867++;
        if (class196.field3326 > 1) {
            class149.field2356 = class105.field1716;
            class196.field3326--;
        }
        if (class260.field4377 > 0) {
            class260.field4377--;
        }
        if (class288.field4913) {
            class288.field4913 = false;
            class194.method1359(116);
            return;
        }
        for (int var1 = 0; var1 < 100 && class195.method1368((byte) 39); var1++) {
        }
        if (class118.field1983 != 30) {
            return;
        }
        class245.method1716(0, class170.field2772, 83);
        Object var2 = class197.field3336.field8;
        synchronized (class197.field3336.field8) {
            if (!class5.field62) {
                class197.field3336.field11 = 0;
            } else if (class235.field4049 != 0 || class197.field3336.field11 >= 40) {
                class183.field2923++;
                int var3 = 0;
                class170.field2772.method1693(39, false);
                class170.field2772.method717(arg0 ^ 0xFFFFFFEB, 0);
                int var4 = class170.field2772.field1476;
                for (int var5 = 0; class197.field3336.field11 > var5 && (class170.field2772.field1476 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class197.field3336.field13[var5];
                    int var7 = class197.field3336.field12[var5];
                    boolean var8 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class197.field3336.field12[var5] == -1 && class197.field3336.field13[var5] == -1) {
                        var7 = -1;
                        var8 = true;
                        var6 = -1;
                    }
                    if (class195.field3292 != var6 || class156.field2512 != var7) {
                        int var9 = var7 - class156.field2512;
                        class156.field2512 = var7;
                        int var10 = var6 - class195.field3292;
                        class195.field3292 = var6;
                        if (class163.field2641 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class170.field2772.method738((byte) -74, (var10 << 6) + ((class163.field2641 << 12) + var9));
                            class163.field2641 = 0;
                        } else if (class163.field2641 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class170.field2772.method717(1, class163.field2641 + 128);
                            class170.field2772.method738((byte) 77, (var10 << 8) + var9);
                            class163.field2641 = 0;
                        } else if (class163.field2641 < 32) {
                            class170.field2772.method717(1, class163.field2641 + 192);
                            if (var8) {
                                class170.field2772.method712(Integer.MIN_VALUE, -26);
                            } else {
                                class170.field2772.method712(var7 << 16 | var6, -112);
                            }
                            class163.field2641 = 0;
                        } else {
                            class170.field2772.method738((byte) -111, class163.field2641 + 57344);
                            if (var8) {
                                class170.field2772.method712(Integer.MIN_VALUE, 121);
                            } else {
                                class170.field2772.method712(var6 | var7 << 16, -15);
                            }
                            class163.field2641 = 0;
                        }
                    } else if (class163.field2641 < 2047) {
                        class163.field2641++;
                    }
                }
                class170.field2772.method695(class170.field2772.field1476 - var4, true);
                if (class197.field3336.field11 <= var3) {
                    class197.field3336.field11 = 0;
                } else {
                    class197.field3336.field11 -= var3;
                    for (int var11 = 0; var11 < class197.field3336.field11; var11++) {
                        class197.field3336.field13[var11] = class197.field3336.field13[var3 + var11];
                        class197.field3336.field12[var11] = class197.field3336.field12[var3 + var11];
                    }
                }
            }
        }
        if (class235.field4049 != 0) {
            class85.field1387++;
            long var13 = (class238.field4076 - class307.field5277) / 50L;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var15 = class171.field2786;
            byte var16 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            if (class235.field4049 == 2) {
                var16 = 1;
            }
            int var17 = class207.field3520;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            int var18 = (int) var13;
            class307.field5277 = class238.field4076;
            class170.field2772.method1693(223, false);
            class170.field2772.method747((byte) 22, var18 | var16 << 15);
            class170.field2772.method700(var17 << 16 | var15, -1745);
        }
        if (class221.field3799 > 0) {
            class221.field3799--;
        }
        if (class291.field4939[96] || class291.field4939[97] || class291.field4939[98] || class291.field4939[99]) {
            class278.field4785 = true;
        }
        if (class278.field4785 && class221.field3799 <= 0) {
            class278.field4785 = false;
            class284.field4846++;
            class221.field3799 = 20;
            class170.field2772.method1693(163, false);
            class170.field2772.method692(class20.field208, arg0 ^ 0x61C96502);
            class170.field2772.method736(class267.field4516, 120);
        }
        if (class74.field1170 && !class244.field4149) {
            class169.field2751++;
            class244.field4149 = true;
            class170.field2772.method1693(141, false);
            class170.field2772.method717(1, 1);
        }
        if (!class74.field1170 && class244.field4149) {
            class244.field4149 = false;
            class170.field2772.method1693(141, false);
            class170.field2772.method717(1, 0);
            class169.field2751++;
        }
        if (!class50.field730) {
            class245.field4177++;
            class170.field2772.method1693(103, false);
            class170.field2772.method745(27265, class135.method1022((byte) -39));
            class50.field730 = true;
        }
        class109.method840(true);
        if (class118.field1983 != 30) {
            return;
        }
        class14.method52(arg0 ^ 0x7502);
        class193.method1357(119);
        class32.field436++;
        if (class32.field436 > 750) {
            class194.method1359(arg0 ^ 0xFFFFFF9D);
            return;
        }
        class91.method680(2047);
        class262.method1816(-97);
        class177.method1247((byte) 92);
        if (class152.field2399 != null) {
            class240.method1684(true);
        }
        for (int var19 = class77.method594(-94, true); var19 != -1; var19 = class77.method594(-111, false)) {
            class308.method2099(var19, -42);
            class248.field4217[class234.method1648(class5.field57++, 31)] = var19;
        }
        for (class151 var20 = class292.method1981(arg0 + 9788); var20 != null; var20 = class292.method1981(9766)) {
            int var21 = var20.method1087(99);
            int var22 = var20.method1082(128);
            if (var21 == 1) {
                class194.field3264[var22] = var20.field2395;
                class183.field2930[class234.method1648(31, class162.field2629++)] = var22;
            } else if (var21 == 2) {
                class212.field3560[var22] = var20.field2384;
                class244.field4142[class234.method1648(class222.field3810++, 31)] = var22;
            } else if (var21 == 3) {
                class191 var23 = class1.method2(var22, (byte) -37);
                if (!var20.field2384.method446((byte) 65, var23.field3199)) {
                    var23.field3199 = var20.field2384;
                    class250.method1744(var23, (byte) -61);
                }
            } else if (var21 == 4) {
                class191 var24 = class1.method2(var22, (byte) -37);
                int var25 = var20.field2395;
                int var26 = var20.field2388;
                if (var24.field3105 != var25 || var24.field3141 != var26) {
                    var24.field3105 = var25;
                    var24.field3141 = var26;
                    class250.method1744(var24, (byte) -120);
                }
            } else if (var21 == 5) {
                class191 var42 = class1.method2(var22, (byte) -37);
                if (var20.field2395 != var42.field3177 || var20.field2395 == -1) {
                    var42.field3086 = 0;
                    var42.field3177 = var20.field2395;
                    var42.field3160 = 0;
                    class250.method1744(var42, (byte) -93);
                }
            } else if (var21 == 6) {
                int var36 = var20.field2395;
                int var37 = var36 >> 5 & 0x1F;
                int var38 = var36 & 0x1F;
                int var39 = (var36 & 0x7D6C) >> 10;
                int var40 = (var38 << 3) + ((var39 << 19) + (var37 << 11));
                class191 var41 = class1.method2(var22, (byte) -37);
                if (var41.field3174 != var40) {
                    var41.field3174 = var40;
                    class250.method1744(var41, (byte) 79);
                }
            } else if (var21 == 7) {
                class191 var34 = class1.method2(var22, (byte) -37);
                boolean var35 = var20.field2395 == 1;
                if (var35 != var34.field3116) {
                    var34.field3116 = var35;
                    class250.method1744(var34, (byte) -55);
                }
            } else if (var21 == 8) {
                class191 var27 = class1.method2(var22, (byte) -37);
                if (var20.field2395 != var27.field3182 || var20.field2388 != var27.field3192 || var20.field2380 != var27.field3118) {
                    var27.field3118 = var20.field2380;
                    if (var27.field3159 != -1) {
                        if (var27.field3202 > 0) {
                            var27.field3118 = var27.field3118 * 32 / var27.field3202;
                        } else if (var27.field3163 > 0) {
                            var27.field3118 = var27.field3118 * 32 / var27.field3163;
                        }
                    }
                    var27.field3182 = var20.field2395;
                    var27.field3192 = var20.field2388;
                    class250.method1744(var27, (byte) -54);
                }
            } else if (var21 == 9) {
                class191 var33 = class1.method2(var22, (byte) -37);
                if (var20.field2395 != var33.field3159 || var20.field2388 != var33.field3171) {
                    var33.field3171 = var20.field2388;
                    var33.field3159 = var20.field2395;
                    class250.method1744(var33, (byte) -128);
                }
            } else if (var21 == 10) {
                class191 var28 = class1.method2(var22, (byte) -37);
                if (var20.field2395 != var28.field3158 || var20.field2388 != var28.field3090 || var20.field2380 != var28.field3125) {
                    var28.field3090 = var20.field2388;
                    var28.field3125 = var20.field2380;
                    var28.field3158 = var20.field2395;
                    class250.method1744(var28, (byte) -122);
                }
            } else if (var21 == 11) {
                class191 var29 = class1.method2(var22, (byte) -37);
                var29.field3077 = 0;
                var29.field3152 = var29.field3049 = var20.field2395;
                var29.field3098 = var29.field3124 = var20.field2388;
                var29.field3072 = 0;
                class250.method1744(var29, (byte) 84);
            } else if (var21 == 12) {
                class191 var30 = class1.method2(var22, (byte) -37);
                int var31 = var20.field2395;
                if (var30 != null && var30.field3068 == 0) {
                    if ((var30.field3067 - var30.field3126) < var31) {
                        var31 = var30.field3067 - var30.field3126;
                    }
                    if (var31 < 0) {
                        var31 = 0;
                    }
                    if (var30.field3188 != var31) {
                        var30.field3188 = var31;
                        class250.method1744(var30, (byte) 125);
                    }
                }
            } else if (var21 == 13) {
                class191 var32 = class1.method2(var22, (byte) -37);
                var32.field3150 = var20.field2395;
            }
        }
        class277.field4757++;
        if (class156.field2519 != 0) {
            class218.field3761 += 20;
            if (class218.field3761 >= 400) {
                class156.field2519 = 0;
            }
        }
        if (class304.field5237 != null) {
            class194.field3262++;
            if (class194.field3262 >= 15) {
                class250.method1744(class304.field5237, (byte) 72);
                class304.field5237 = null;
            }
        }
        if (class254.field4319 != null) {
            class250.method1744(class254.field4319, (byte) -111);
            class270.field4586++;
            if (class275.field4725 > class227.field3944 + 5 || (class227.field3944 - 5) > class275.field4725 || (class146.field2311 + 5) < class221.field3795 || class221.field3795 < class146.field2311 - 5) {
                class304.field5239 = true;
            }
            if (class127.field2106 == 0) {
                if (class304.field5239 && class270.field4586 >= 5) {
                    if (class42.field640 == class254.field4319 && class30.field408 != class237.field4065) {
                        class191 var43 = class254.field4319;
                        class148.field2343++;
                        byte var44 = 0;
                        if (class161.field2593 == 1 && var43.field3083 == 206) {
                            var44 = 1;
                        }
                        if (var43.field3085[class30.field408] <= 0) {
                            var44 = 0;
                        }
                        if (class164.method1184(arg0 + 1494583955, client.method2058(var43))) {
                            int var47 = class30.field408;
                            int var48 = class237.field4065;
                            var43.field3085[var47] = var43.field3085[var48];
                            var43.field3106[var47] = var43.field3106[var48];
                            var43.field3085[var48] = -1;
                            var43.field3106[var48] = 0;
                        } else if (var44 == 1) {
                            int var45 = class237.field4065;
                            int var46 = class30.field408;
                            while (var45 != var46) {
                                if (var46 < var45) {
                                    var43.method1342(arg0 + 147, var45 + -1, var45);
                                    var45--;
                                } else if (var46 > var45) {
                                    var43.method1342(arg0 + 147, var45 + 1, var45);
                                    var45++;
                                }
                            }
                        } else {
                            var43.method1342(arg0 - 90, class30.field408, class237.field4065);
                        }
                        class170.field2772.method1693(28, false);
                        class170.field2772.method736(class237.field4065, 114);
                        class170.field2772.method741((byte) 95, var44);
                        class170.field2772.method747((byte) 116, class30.field408);
                        class170.field2772.method700(class254.field4319.field3142, arg0 ^ 0x6C5);
                    }
                } else if ((class240.field4090 == 1 || class195.method1373((byte) -127, class195.field3293 - 1)) && class195.field3293 > 2) {
                    class96.method763(18141);
                } else if (class195.field3293 > 0) {
                    class36.method237(-1);
                }
                class194.field3262 = 10;
                class254.field4319 = null;
                class235.field4049 = 0;
            }
        }
        class26.field301 = null;
        class191 var49 = class166.field2716;
        class99.field1628 = 0;
        if (arg0 != -22) {
            return;
        }
        class215.field3652 = false;
        class191 var50 = class22.field229;
        class22.field229 = null;
        class205.field3453 = false;
        class166.field2716 = null;
        while (class293.method1987(true) && class99.field1628 < 128) {
            class158.field2539[class99.field1628] = class246.field4182;
            class125.field2096[class99.field1628] = class73.field1125;
            class99.field1628++;
        }
        class152.field2399 = null;
        if (class301.field5183 != -1) {
            class200.method1404(0, 0, class306.field5258, 0, 0, false, field878, class301.field5183);
        }
        class105.field1716++;
        while (true) {
            class161 var51;
            class191 var52;
            class191 var53;
            do {
                var51 = (class161) class75.field1220.method329(25);
                if (var51 == null) {
                    while (true) {
                        class161 var54;
                        class191 var55;
                        class191 var56;
                        do {
                            var54 = (class161) class125.field2072.method329(arg0 + 47);
                            if (var54 == null) {
                                while (true) {
                                    class161 var57;
                                    class191 var58;
                                    class191 var59;
                                    do {
                                        var57 = (class161) class116.field1945.method329(25);
                                        if (var57 == null) {
                                            if (class278.field4779 && class152.field2399 == null) {
                                                class278.field4779 = false;
                                            }
                                            if (class164.field2674 != null) {
                                                class90.method673(arg0 + 22);
                                            }
                                            if (class293.field4985 > 0 && class291.field4939[82] && class291.field4939[81] && class269.field4565 != 0) {
                                                int var60 = class7.field85 - class269.field4565;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class159.method1165(40, class268.field4551.field3846[0] + class290.field4936, var60, class268.field4551.field3828[0] + class120.field2006);
                                            }
                                            if (class41.field622 != -1) {
                                                int var61 = class212.field3568;
                                                int var62 = class41.field622;
                                                if (class293.field4985 > 0 && class291.field4939[82] && class291.field4939[81]) {
                                                    class159.method1165(40, class290.field4936 + var61, class7.field85, class120.field2006 + var62);
                                                } else if (class206.field3488) {
                                                    class110.field1782++;
                                                    class170.field2772.method1693(168, false);
                                                    class170.field2772.method738((byte) -118, class290.field4936 + var61);
                                                    class170.field2772.method745(arg0 + 27287, class153.field2410);
                                                    class170.field2772.method738((byte) -83, class120.field2006 + var62);
                                                    class170.field2772.method747((byte) 116, class206.field3490);
                                                    class218.field3761 = 0;
                                                    class156.field2519 = 1;
                                                    class102.field1687 = class207.field3520;
                                                    class111.field1827 = class171.field2786;
                                                } else {
                                                    boolean var63 = class57.method377(true, 13581, 0, class268.field4551.field3828[0], var62, var61, 0, 0, 0, class268.field4551.field3846[0], 0, 0);
                                                    if (var63) {
                                                        class102.field1687 = class207.field3520;
                                                        class111.field1827 = class171.field2786;
                                                        class218.field3761 = 0;
                                                        class156.field2519 = 1;
                                                    }
                                                }
                                                class206.field3488 = false;
                                                class41.field622 = -1;
                                            }
                                            class232.method1640(6652);
                                            if (class166.field2716 != var49) {
                                                if (var49 != null) {
                                                    class250.method1744(var49, (byte) -120);
                                                }
                                                if (class166.field2716 != null) {
                                                    class250.method1744(class166.field2716, (byte) 105);
                                                }
                                            }
                                            if (class22.field229 != var50 && class29.field403 == class227.field3947) {
                                                if (var50 != null) {
                                                    class250.method1744(var50, (byte) 105);
                                                }
                                                if (class22.field229 != null) {
                                                    class250.method1744(class22.field229, (byte) 82);
                                                }
                                            }
                                            if (class22.field229 == null) {
                                                if (class227.field3947 > 0) {
                                                    class227.field3947--;
                                                }
                                            } else if (class227.field3947 < class29.field403) {
                                                class227.field3947++;
                                                if (class29.field403 == class227.field3947) {
                                                    class250.method1744(class22.field229, (byte) -103);
                                                }
                                            }
                                            if (class21.field220 == 1) {
                                                class296.method2004(false);
                                            } else if (class21.field220 == 2) {
                                                class237.method1672((byte) 111);
                                            } else {
                                                class298.method2013(true);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class186.field2979[var64]++;
                                            }
                                            int var65 = class137.method1038(arg0 - 44);
                                            int var66 = class57.method374((byte) 80);
                                            if (var65 > 4500 && var66 > 4500) {
                                                class260.field4377 = 250;
                                                class155.method1148(4000, (byte) 88);
                                                class170.field2772.method1693(212, false);
                                                class184.field2951++;
                                            }
                                            if (class133.field2174 != null && class133.field2174.field2322 == 1) {
                                                if (class133.field2174.field2323 != null) {
                                                    class300.method2044(class248.field4218, class200.field3390, 46);
                                                }
                                                class200.field3390 = false;
                                                class133.field2174 = null;
                                                class248.field4218 = null;
                                            }
                                            class161.field2600++;
                                            class183.field2924++;
                                            if (class183.field2924 > 500) {
                                                class183.field2924 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class292.field4956 += class63.field962;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class230.field4003 += class118.field1964;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class215.field3646 += class36.field476;
                                                }
                                            }
                                            if (class292.field4956 < -55) {
                                                class63.field962 = 2;
                                            }
                                            class108.field1749++;
                                            if (class230.field4003 < -50) {
                                                class118.field1964 = 2;
                                            }
                                            if (class161.field2600 > 500) {
                                                class161.field2600 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class187.field2984 += class268.field4547;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class149.field2350 += class72.field1108;
                                                }
                                            }
                                            if (class187.field2984 < -60) {
                                                class268.field4547 = 2;
                                            }
                                            if (class292.field4956 > 55) {
                                                class63.field962 = -2;
                                            }
                                            if (class230.field4003 > 50) {
                                                class118.field1964 = -2;
                                            }
                                            if (class187.field2984 > 60) {
                                                class268.field4547 = -2;
                                            }
                                            if (class215.field3646 < -40) {
                                                class36.field476 = 1;
                                            }
                                            if (class215.field3646 > 40) {
                                                class36.field476 = -1;
                                            }
                                            if (class149.field2350 < -20) {
                                                class72.field1108 = 1;
                                            }
                                            if (class149.field2350 > 10) {
                                                class72.field1108 = -1;
                                            }
                                            if (class108.field1749 > 50) {
                                                class259.field4360++;
                                                class170.field2772.method1693(131, false);
                                            }
                                            if (class204.field3436) {
                                                class189.method1321((byte) 109);
                                                class204.field3436 = false;
                                            }
                                            try {
                                                if (class200.field3381 != null && class170.field2772.field1476 > 0) {
                                                    class200.field3381.method1187(0, class170.field2772.field1476, -85, class170.field2772.field1495);
                                                    class108.field1749 = 0;
                                                    class170.field2772.field1476 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class194.method1359(arg0 ^ 0xFFFFFF86);
                                            }
                                            return;
                                        }
                                        var58 = var57.field2597;
                                        if (var58.field3104 < 0) {
                                            break;
                                        }
                                        var59 = class1.method2(var58.field3074, (byte) -37);
                                    } while (var59 == null || var59.field3180 == null || var59.field3180.length <= var58.field3104 || var59.field3180[var58.field3104] != var58);
                                    class262.method1818(var57, 8);
                                }
                            }
                            var55 = var54.field2597;
                            if (var55.field3104 < 0) {
                                break;
                            }
                            var56 = class1.method2(var55.field3074, (byte) -37);
                        } while (var56 == null || var56.field3180 == null || var55.field3104 >= var56.field3180.length || var56.field3180[var55.field3104] != var55);
                        class262.method1818(var54, 67);
                    }
                }
                var52 = var51.field2597;
                if (var52.field3104 < 0) {
                    break;
                }
                var53 = class1.method2(var52.field3074, (byte) -37);
            } while (var53 == null || var53.field3180 == null || var52.field3104 >= var53.field3180.length || var53.field3180[var52.field3104] != var52);
            class262.method1818(var51, 96);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 1026)
    public static void method392(byte arg0) {
        if (arg0 == 100) {
            field869 = null;
            field872 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[BI)I", line = 1048)
    public static final int method393(int arg0, int arg1, byte[] arg2, int arg3) {
        field871++;
        if (arg3 > -94) {
            return -21;
        }
        int var4 = -1;
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class141.field2268[(arg2[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }
}
