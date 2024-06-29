import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class147 extends class209 {

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "Z")
    public boolean field2175 = true;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2171 = "cyan:";

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "[I")
    public static int[] field2179 = new int[2048];

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "[I")
    public int[] field2166;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "[I")
    private int[] field2169;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "[Ljava/lang/String;")
    private String[] field2176;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "[[I")
    private int[][] field2183;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BJZ)V")
    public static final void method1057(byte arg0, long arg1, boolean arg2) {
        field2170++;
        if (arg1 == 0L) {
            return;
        }
        if (class40.field677 >= 100) {
            class247.method1671(0, class88.field1380, -1, "");
            return;
        }
        String var4 = class292.method1939(arg1, -96);
        for (int var5 = 0; var5 < class40.field677; var5++) {
            if (class78.field1189[var5] == arg1) {
                class247.method1671(0, var4 + class300.field4823, -1, "");
                return;
            }
        }
        int var6 = 0;
        if (arg0 != 24) {
            field2171 = null;
        }
        while (var6 < class181.field2843) {
            if (class238.field3762[var6] == arg1) {
                class247.method1671(0, class57.field895 + var4 + class266.field4201, arg0 - 25, "");
                return;
            }
            var6++;
        }
        if (var4.equals(class263.field4168.field2064)) {
            class247.method1671(0, class188.field2957, arg0 - 25, "");
            return;
        }
        class162.field2446++;
        class78.field1189[class40.field677] = arg1;
        class226.field3627[class40.field677] = class279.method1894(arg1, (byte) 63);
        class214.field3275[class40.field677++] = arg2;
        class178.field2737 = class216.field3305;
        class240.field3826.method1762(138, true);
        class240.field3826.method313(-6968, arg1);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BII)I")
    public static final int method1058(byte arg0, int arg1, int arg2) {
        field2180++;
        int var3 = arg1 >> 31 & arg2 - 1;
        if (arg0 != 119) {
            field2179 = null;
        }
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lub;ZILub;)V")
    public static final void method1059(class92 arg0, boolean arg1, int arg2, class92 arg3) {
        class207.field3207 = arg3;
        class123.field1849 = arg0;
        if (arg2 == 0) {
            field2185++;
            class166.field2501 = arg1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method1060(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class2.field44 = 0;
        for (int var7 = -1; var7 < class259.field4112 + class117.field1782; var7++) {
            class296 var23;
            if (var7 == -1) {
                var23 = class263.field4168;
            } else if (class259.field4112 > var7) {
                var23 = class233.field3682[class26.field455[var7]];
            } else {
                var23 = class116.field1781[class255.field4084[var7 - class259.field4112]];
            }
            if (var23 != null && var23.method1006(-1)) {
                if (var23 instanceof class161) {
                    class95 var24 = ((class161) var23).field2421;
                    if (var24.field1547 != null) {
                        var24 = var24.method741(115);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class259.field4112 <= var7) {
                    class95 var25 = ((class161) var23).field2421;
                    if (var25.field1547 != null) {
                        var25 = var25.method741(104);
                    }
                    if (var25.field1540 >= 0 && class180.field2819.length > var25.field1540) {
                        int var26;
                        if (var25.field1535 == -1) {
                            var26 = var23.method1985((byte) 116) + 15;
                        } else {
                            var26 = var25.field1535 + 15;
                        }
                        class98.method764(arg1 >> 1, arg4 >> 1, var23, var26, 0, arg6, arg2);
                        if (class106.field1663 > -1) {
                            class180.field2819[var25.field1540].method425(arg0 + class106.field1663 - 12, class182.field2869 + arg3 + -30);
                        }
                    }
                    class173[] var27 = class136.field2053;
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        class173 var29 = var27[var28];
                        if (var29 != null && var29.field2670 == 1 && class255.field4084[var7 - class259.field4112] == var29.field2665 && class41.field686 % 20 < 10) {
                            int var30;
                            if (var25.field1535 == -1) {
                                var30 = var23.method1985((byte) -123) + 15;
                            } else {
                                var30 = var25.field1535 + 15;
                            }
                            class98.method764(arg1 >> 1, arg4 >> 1, var23, var30, 0, arg6, arg2);
                            if (class106.field1663 > -1) {
                                class15.field198[var29.field2662].method425(class106.field1663 + arg0 - 12, arg3 + -28 + class182.field2869);
                            }
                        }
                    }
                } else {
                    int var31 = 30;
                    class136 var32 = (class136) var23;
                    if (var32.field2035 != -1 || var32.field2061 != -1) {
                        class98.method764(arg1 >> 1, arg4 >> 1, var23, var23.method1985((byte) -112) + 15, 0, arg6, arg2);
                        if (class106.field1663 > -1) {
                            if (var32.field2035 != -1) {
                                class235.field3718[var32.field2035].method425(class106.field1663 + arg0 - 12, -var31 + arg3 + class182.field2869);
                                var31 += 25;
                            }
                            if (var32.field2061 != -1) {
                                class180.field2819[var32.field2061].method425(class106.field1663 + arg0 - 12, -var31 + class182.field2869 + arg3);
                                var31 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var33 = 0;
                        class173[] var34 = class136.field2053;
                        while (var33 < var34.length) {
                            class173 var35 = var34[var33];
                            if (var35 != null && var35.field2670 == 10 && class26.field455[var7] == var35.field2665) {
                                class98.method764(arg1 >> 1, arg4 >> 1, var23, var23.method1985((byte) 113) + 15, 0, arg6, arg2);
                                if (class106.field1663 > -1) {
                                    class15.field198[var35.field2662].method425(class106.field1663 + arg0 - 12, -var31 + arg3 - -class182.field2869);
                                }
                            }
                            var33++;
                        }
                    }
                }
                if (var23.field4695 != null && (var7 >= class259.field4112 || class149.field2215 == 0 || class149.field2215 == 3 || class149.field2215 == 1 && class191.method1358(false, ((class136) var23).field2064))) {
                    class98.method764(arg1 >> 1, arg4 >> 1, var23, var23.method1985((byte) 115), 0, arg6, arg2);
                    if (class106.field1663 > -1 && class2.field44 < class301.field4850) {
                        class301.field4836[class2.field44] = class73.field1118.method1788(var23.field4695) / 2;
                        class301.field4846[class2.field44] = class73.field1118.field4230;
                        class301.field4856[class2.field44] = class106.field1663;
                        class301.field4851[class2.field44] = class182.field2869;
                        class301.field4843[class2.field44] = var23.field4716;
                        class301.field4838[class2.field44] = var23.field4691;
                        class301.field4842[class2.field44] = var23.field4758;
                        class301.field4837[class2.field44] = var23.field4695;
                        class2.field44++;
                    }
                }
                if (class41.field686 < var23.field4671) {
                    class213 var36 = class63.field991[0];
                    class213 var37 = class63.field991[1];
                    int var38;
                    if ((var23 instanceof class161)) {
                        class161 var39 = (class161) var23;
                        class213[] var40 = (class213[]) class192.field3009.method1173((long) var39.field2421.field1507, arg5);
                        if (var40 == null) {
                            var40 = class196.method1400(0, class246.field3910, var39.field2421.field1507, (byte) 73);
                            if (var40 != null) {
                                class192.field3009.method1167((byte) -35, var40, (long) var39.field2421.field1507);
                            }
                        }
                        if (var40 != null && var40.length == 2) {
                            var37 = var40[1];
                            var36 = var40[0];
                        }
                        class95 var41 = var39.field2421;
                        if (var41.field1535 == -1) {
                            var38 = var23.method1985((byte) -90);
                        } else {
                            var38 = var41.field1535;
                        }
                    } else {
                        var38 = var23.method1985((byte) 124);
                    }
                    class98.method764(arg1 >> 1, arg4 >> 1, var23, var38 + var36.field3265 + 10, 0, arg6, arg2);
                    if (class106.field1663 > -1) {
                        int var42 = arg0 - ((var36.field3273 >> 1) - class106.field1663);
                        int var43 = arg3 + class182.field2869 - 3;
                        var36.method425(var42, var43);
                        int var44 = var36.field3265;
                        int var45 = var23.field4760 * var36.field3273 / 255;
                        class66.method523(var42, var43, var42 + var45, var43 + var44);
                        var37.method425(var42, var43);
                        class66.method524(arg0, arg3, arg0 + arg4, arg3 - -arg1);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (var23.field4733[var46] > class41.field686) {
                        int var49;
                        if (var23 instanceof class161) {
                            class161 var47 = (class161) var23;
                            class95 var48 = var47.field2421;
                            if (var48.field1535 == -1) {
                                var49 = var23.method1985((byte) -73) / 2;
                            } else {
                                var49 = var48.field1535 / 2;
                            }
                        } else {
                            var49 = var23.method1985((byte) -37) / 2;
                        }
                        class98.method764(arg1 >> 1, arg4 >> 1, var23, var49, 0, arg6, arg2);
                        if (class106.field1663 > -1) {
                            if (var46 == 1) {
                                class182.field2869 -= 20;
                            }
                            if (var46 == 2) {
                                class182.field2869 -= 10;
                                class106.field1663 -= 15;
                            }
                            if (var46 == 3) {
                                class106.field1663 += 15;
                                class182.field2869 -= 10;
                            }
                            class3.field48[var23.field4762[var46]].method425(class106.field1663 + arg0 - 12, class182.field2869 + arg3 - 12);
                            class117.field1786.method1808(Integer.toString(var23.field4680[var46]), arg0 + class106.field1663 - 1, arg3 + 3 - -class182.field2869, 16777215, 0);
                        }
                    }
                }
            }
        }
        field2168++;
        if (!arg5) {
            return;
        }
        for (int var8 = 0; var8 < class2.field44; var8++) {
            int var9 = class301.field4856[var8];
            int var10 = class301.field4836[var8];
            int var11 = class301.field4851[var8];
            boolean var12 = true;
            int var13 = class301.field4846[var8];
            while (var12) {
                var12 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (var11 + 2 > class301.field4851[var22] + -class301.field4846[var22] && class301.field4851[var22] + 2 > -var13 + var11 && (var9 - var10) < (class301.field4856[var22] + class301.field4836[var22]) && class301.field4856[var22] - class301.field4836[var22] < var9 - -var10 && var11 > class301.field4851[var22] - class301.field4846[var22]) {
                        var11 = class301.field4851[var22] - class301.field4846[var22];
                        var12 = true;
                    }
                }
            }
            class106.field1663 = class301.field4856[var8];
            class182.field2869 = class301.field4851[var8] = var11;
            String var14 = class301.field4837[var8];
            if (class62.field975 == 0) {
                int var15 = 16776960;
                if (class301.field4843[var8] < 6) {
                    var15 = class186.field2934[class301.field4843[var8]];
                }
                if (class301.field4843[var8] == 6) {
                    var15 = class33.field588 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class301.field4843[var8] == 7) {
                    var15 = (class33.field588 % 20) < 10 ? 255 : 65535;
                }
                if (class301.field4843[var8] == 8) {
                    var15 = class33.field588 % 20 < 10 ? 45056 : 8454016;
                }
                if (class301.field4843[var8] == 9) {
                    int var16 = 150 - class301.field4842[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16384000 + 16776960 - (var16 * 327680);
                    } else if (var16 < 150) {
                        var15 = ((var16 - 100) * 5) + 65280;
                    }
                }
                if (class301.field4843[var8] == 10) {
                    int var17 = 150 - class301.field4842[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var15 = (var17 - 100) * 327680 + 255 + 500 - (var17 * 5);
                    }
                }
                if (class301.field4843[var8] == 11) {
                    int var18 = 150 - class301.field4842[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = var18 * 327685 - 16318970;
                    } else if (var18 < 150) {
                        var15 = 32768000 + 16777215 - var18 * 327680;
                    }
                }
                if (class301.field4838[var8] == 0) {
                    class73.field1118.method1808(var14, arg0 + class106.field1663, class182.field2869 + arg3, var15, 0);
                }
                if (class301.field4838[var8] == 1) {
                    class73.field1118.method1801(var14, class106.field1663 + arg0, arg3 - -class182.field2869, var15, 0, class33.field588);
                }
                if (class301.field4838[var8] == 2) {
                    class73.field1118.method1796(var14, class106.field1663 + arg0, arg3 - -class182.field2869, var15, 0, class33.field588);
                }
                if (class301.field4838[var8] == 3) {
                    class73.field1118.method1805(var14, class106.field1663 + arg0, class182.field2869 + arg3, var15, 0, class33.field588, 150 - class301.field4842[var8]);
                }
                if (class301.field4838[var8] == 4) {
                    int var19 = (150 - class301.field4842[var8]) * (class73.field1118.method1788(var14) + 100) / 150;
                    class66.method523(class106.field1663 + arg0 - 50, arg3, class106.field1663 + arg0 + 50, arg3 - -arg1);
                    class73.field1118.method1810(var14, arg0 + class106.field1663 + 50 - var19, arg3 - -class182.field2869, var15, 0);
                    class66.method524(arg0, arg3, arg0 + arg4, arg3 - -arg1);
                }
                if (class301.field4838[var8] == 5) {
                    int var20 = 150 - class301.field4842[var8];
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class66.method523(arg0, class182.field2869 + arg3 - class73.field1118.field4230 - 1, arg0 + arg4, class182.field2869 + arg3 + 5);
                    class73.field1118.method1808(var14, class106.field1663 + arg0, class182.field2869 + arg3 + var21, var15, 0);
                    class66.method524(arg0, arg3, arg0 + arg4, arg1 + arg3);
                }
            } else {
                class73.field1118.method1808(var14, arg0 + class106.field1663, arg3 - -class182.field2869, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([I[I[ILgk;B)V")
    public static final void method1061(int[] arg0, int[] arg1, int[] arg2, class161 arg3, byte arg4) {
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var8 != 0 && arg3.field4710.length > var9; var9++) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg3.field4710[var9] = null;
                    } else {
                        class103 var10 = class250.method1700(var7, -35);
                        int var11 = var10.field1604;
                        class234 var12 = arg3.field4710[var9];
                        if (var12 != null) {
                            if (var12.field3696 == var7) {
                                if (var11 == 0) {
                                    var12 = arg3.field4710[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3701 = 0;
                                    var12.field3698 = var6;
                                    var12.field3695 = 1;
                                    var12.field3699 = 0;
                                    var12.field3702 = 0;
                                    class136.method1004(arg3.field4725, 0, arg3.field4709, var10, 255, false);
                                } else if (var11 == 2) {
                                    var12.field3702 = 0;
                                }
                            } else if (var10.field1589 >= class250.method1700(var12.field3696, -57).field1589) {
                                var12 = arg3.field4710[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class234 var13 = arg3.field4710[var9] = new class234();
                            var13.field3698 = var6;
                            var13.field3699 = 0;
                            var13.field3702 = 0;
                            var13.field3695 = 1;
                            var13.field3701 = 0;
                            var13.field3696 = var7;
                            class136.method1004(arg3.field4725, 0, arg3.field4709, var10, 255, false);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
        if (arg4 != 108) {
            field2165 = 27;
        }
        field2174++;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIB)I")
    public final int method1062(int arg0, int arg1, byte arg2) {
        field2186++;
        if (this.field2169 == null || arg1 < 0 || this.field2169.length < arg1) {
            return -1;
        } else if (this.field2183[arg1] == null || arg0 < 0 || arg0 > this.field2183[arg1].length) {
            return -1;
        } else {
            if (arg2 <= 118) {
                this.method1063((byte) -109, -110);
            }
            return this.field2183[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)I")
    public final int method1063(byte arg0, int arg1) {
        if (arg0 >= -97) {
            this.field2166 = null;
        }
        field2172++;
        return this.field2169 == null || arg1 < 0 || this.field2169.length < arg1 ? -1 : this.field2169[arg1];
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method1064(byte arg0) {
        field2182++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2176 == null) {
            return "";
        }
        var2.append(this.field2176[0]);
        for (int var3 = 1; var3 < this.field2176.length; var3++) {
            var2.append("...");
            var2.append(this.field2176[var3]);
        }
        return arg0 == -91 ? var2.toString() : null;
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)I")
    public final int method1065(int arg0) {
        field2177++;
        if (this.field2169 == null) {
            return 0;
        } else {
            if (arg0 < 38) {
                this.field2176 = null;
            }
            return this.field2169.length;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lha;I)V")
    public final void method1066(class31 arg0, int arg1) {
        if (arg1 != 0) {
            field2165 = -37;
        }
        while (true) {
            int var3 = arg0.method265(-119);
            if (var3 == 0) {
                field2173++;
                return;
            }
            this.method1067(arg0, 111, var3);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lha;II)V")
    private final void method1067(class31 arg0, int arg1, int arg2) {
        field2181++;
        int var4 = 58 / ((20 - arg1) / 43);
        if (arg2 == 1) {
            this.field2176 = class269.method1823('<', (byte) -90, arg0.method262(11386));
        } else if (arg2 == 2) {
            int var5 = arg0.method265(-101);
            this.field2166 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2166[var6] = arg0.method260((byte) -67);
            }
        } else if (arg2 == 3) {
            int var7 = arg0.method265(-126);
            this.field2169 = new int[var7];
            this.field2183 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg0.method260((byte) -67);
                this.field2169[var8] = var9;
                this.field2183[var8] = new int[class255.field4071[var9]];
                for (int var10 = 0; var10 < class255.field4071[var9]; var10++) {
                    this.field2183[var8][var10] = arg0.method260((byte) -67);
                }
            }
        } else if (arg2 == 4) {
            this.field2175 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lha;B)Ljava/lang/String;")
    public final String method1068(class31 arg0, byte arg1) {
        field2167++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2169 != null) {
            for (int var4 = 0; var4 < this.field2169.length; var4++) {
                var3.append(this.field2176[var4]);
                var3.append(class138.method1022((byte) -37, this.field2169[var4], this.field2183[var4], arg0.method278(class171.field2588[this.field2169[var4]], 8)));
            }
        }
        if (arg1 < 65) {
            this.method1065(113);
        }
        var3.append(this.field2176[this.field2176.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
    public final void method1069(int arg0) {
        field2178++;
        if (this.field2166 != null) {
            for (int var2 = 0; var2 < this.field2166.length; var2++) {
                this.field2166[var2] = class44.method377(this.field2166[var2], 32768);
            }
        }
        if (arg0 >= -16) {
            method1071(118, -81, 84, -1, 127, (class55) null, 73, -51L, true);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lha;I[I)V")
    public final void method1070(class31 arg0, int arg1, int[] arg2) {
        field2164++;
        if (this.field2169 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2169.length && arg2.length > var4; var4++) {
            int var5 = class89.field1408[this.method1063((byte) -103, var4)];
            if (var5 > 0) {
                arg0.method293(true, var5, (long) arg2[var4]);
            }
        }
        if (arg1 != -15820) {
            field2171 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIILnh;IJZ)Z")
    public static final boolean method1071(int arg0, int arg1, int arg2, int arg3, int arg4, class55 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class171.method1230(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(B)V")
    public static void method1072(byte arg0) {
        if (arg0 <= -74) {
            field2171 = null;
            field2179 = null;
        }
    }
}
