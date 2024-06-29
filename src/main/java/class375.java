import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class375 {

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "Lrda;")
    private class690 field5719;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "J")
    public long field5714;

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5720 = new String[] { method3024(method3023(">\u00064\u0017|t")), method3024(method3023(">\u00064\u0017\u007ft")), method3024(method3023(">\u00064\u0017zt")), method3024(method3023(">\u00064\u0017X5\u000f4UW&\u0004}")), method3024(method3023("'O{\u0017C")), method3024(method3023("2\u00149U")), method3024(method3023(">\u00064\u0017\u00025\u000f<M\u0000t")), method3024(method3023("`\u0003'\u0007\u0016mQe\u001c\u0017")), method3024(method3023("\u0003\u0012!XJ5\u00020U[1\u0004;MM")), method3024(method3023("\b\u000e:R\u0004|")), method3024(method3023(">\u00064\u0017}t")), method3024(method3023("1\u0012")) };

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
    public static int field5711 = 0;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "Ldl;")
    public static class70 field5718 = new class70(128);

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!bga", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        try {
            this.field5719.method5052(-11984, this.field5714);
            field5715++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5720[3] + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V", line = 13)
    public static void method3019(byte arg0) {
        try {
            int var1 = 28 % ((arg0 - 6) / 40);
            field5718 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5720[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V", line = 28)
    public static final void method3020(int arg0) {
        try {
            field5717++;
            class549.method4140(-113, false);
            class117.field1395 = 0;
            boolean var1 = true;
            for (int var2 = 0; var2 < class530.field7791.length; var2++) {
                if (class694.field10133[var2] != -1 && class530.field7791[var2] == null) {
                    class530.field7791[var2] = class550.field8195.method3632(class694.field10133[var2], 0, arg0 + 15941);
                    if (class530.field7791[var2] == null) {
                        class117.field1395++;
                        var1 = false;
                    }
                }
                if (class301.field4726[var2] != -1 && class608.field8893[var2] == null) {
                    class608.field8893[var2] = class550.field8195.method3643(class301.field4726[var2], class28.field350[var2], false, 0);
                    if (class608.field8893[var2] == null) {
                        var1 = false;
                        class117.field1395++;
                    }
                }
                if (class516.field7461[var2] != -1 && class754.field10979[var2] == null) {
                    class754.field10979[var2] = class550.field8195.method3632(class516.field7461[var2], 0, 24);
                    if (class754.field10979[var2] == null) {
                        class117.field1395++;
                        var1 = false;
                    }
                }
                if (class416.field6135[var2] != -1 && class274.field4140[var2] == null) {
                    class274.field4140[var2] = class550.field8195.method3632(class416.field6135[var2], 0, arg0 + 15697);
                    if (class274.field4140[var2] == null) {
                        var1 = false;
                        class117.field1395++;
                    }
                }
                if (class88.field993 != null && class106.field1223[var2] == null && class88.field993[var2] != -1) {
                    class106.field1223[var2] = class550.field8195.method3643(class88.field993[var2], class28.field350[var2], false, 0);
                    if (class106.field1223[var2] == null) {
                        class117.field1395++;
                        var1 = false;
                    }
                }
            }
            if (class224.field3436 == null) {
                if (class451.field6614 == null || !class366.field5598.method3641(class451.field6614.field5553 + field5720[8], 1)) {
                    class224.field3436 = new class408(0);
                } else if (class366.field5598.method3647(class451.field6614.field5553 + field5720[8], 88)) {
                    class224.field3436 = class415.method3228(class366.field5598, class709.field10277, class451.field6614.field5553 + field5720[8], true);
                } else {
                    class117.field1395++;
                    var1 = false;
                }
            }
            if (var1) {
                class225.field3447 = 0;
                boolean var3 = true;
                for (int var4 = 0; var4 < class530.field7791.length; var4++) {
                    byte[] var5 = class608.field8893[var4];
                    if (var5 != null) {
                        int var6 = (class752.field10938[var4] >> 8) * 64 - class494.field7101;
                        int var7 = (class752.field10938[var4] & 0xFF) * 64 - class281.field4219;
                        if (class104.field1209 != 0) {
                            var7 = 10;
                            var6 = 10;
                        }
                        var3 &= class159.method1349(var7, var6, var5, (byte) -39, class659.field9506, class648.field9378);
                    }
                    byte[] var8 = class274.field4140[var4];
                    if (var8 != null) {
                        int var9 = (class752.field10938[var4] >> 8) * 64 - class494.field7101;
                        int var10 = (class752.field10938[var4] & 0xFF) * 64 - class281.field4219;
                        if (class104.field1209 != 0) {
                            var9 = 10;
                            var10 = 10;
                        }
                        var3 &= class159.method1349(var10, var9, var8, (byte) -39, class659.field9506, class648.field9378);
                    }
                }
                if (var3) {
                    if (class229.field3484 != 0) {
                        class145.method1227(true, class309.field4859.method2616(false, class167.field2300) + field5720[7], class309.field4911, class64.field664, class610.field8913, (byte) -125);
                    }
                    class318.method2691(1);
                    if (arg0 == -15815) {
                        class344.method2848(-6177);
                        class472.method3586(-110);
                        boolean var11 = false;
                        if (class610.field8913.method502() && class289.field4305.field799.method3608(false) == 2) {
                            for (int var12 = 0; var12 < class530.field7791.length; var12++) {
                                if (class274.field4140[var12] != null || class754.field10979[var12] != null) {
                                    var11 = true;
                                    break;
                                }
                            }
                        }
                        int var13;
                        if (class289.field4305.field827.method3572(false) == 1) {
                            var13 = class300.field4714[class470.field6830];
                        } else {
                            var13 = class192.field2599[class470.field6830];
                        }
                        if (class610.field8913.method576()) {
                            var13++;
                        }
                        class48.method374(class610.field8913, class157.field1958, 9, 4, class648.field9378, class659.field9506, var13, var11, class610.field8913.method578() > 0);
                        class89.method755(class153.field1892);
                        if (class153.field1892 == 0) {
                            class299.method2520(null);
                        } else {
                            class299.method2520(class562.field8349);
                        }
                        for (int var14 = 0; var14 < 4; var14++) {
                            class429.field6298[var14].method2755((byte) -113);
                        }
                        class196.method1666(28123);
                        class497.method3763(false, (byte) -119);
                        class238.method2041((byte) -43);
                        class424.field6257 = false;
                        class492.field7061 = null;
                        class318.method2691(1);
                        System.gc();
                        class549.method4140(-80, true);
                        class54.method405(0);
                        class277.field4176 = class289.field4305.field810.method112(false);
                        class222.field3405 = class568.field8403 >= 96;
                        class744.field10820 = class289.field4305.field799.method3608(false) == 2;
                        class685.field9935 = class289.field4305.field801.method1028(false) == 1;
                        class394.field5908 = class289.field4305.field825.method717(false) == 1 ? -1 : class419.field6182;
                        class387.field5848 = class289.field4305.field806.method5516(false) == 1;
                        class560.field8341 = class289.field4305.field835.method1184(false) == 1;
                        class531.field7799 = new class89(4, class648.field9378, class659.field9506, false);
                        if (class104.field1209 == 0) {
                            class610.method4507((byte) -117, class531.field7799, class530.field7791);
                        } else {
                            class693.method5065(class531.field7799, true, class530.field7791);
                        }
                        class291.method2360(class648.field9378 >> 4, (byte) 115, class659.field9506 >> 4);
                        class420.method3253(1776);
                        if (var11) {
                            class106.method931(true);
                            class415.field6125 = new class89(1, class648.field9378, class659.field9506, true);
                            if (class104.field1209 == 0) {
                                class610.method4507((byte) -117, class415.field6125, class754.field10979);
                                class549.method4140(-111, true);
                            } else {
                                class693.method5065(class415.field6125, true, class754.field10979);
                                class549.method4140(-73, true);
                            }
                            class415.field6125.method3359(0, class531.field7799.field6418[0], (byte) -57);
                            class415.field6125.method3354(class610.field8913, null, (byte) 23, null);
                            class106.method931(false);
                        }
                        class531.field7799.method3354(class610.field8913, class429.field6298, (byte) 23, var11 ? class415.field6125.field6418 : null);
                        if (class104.field1209 == 0) {
                            class549.method4140(-53, true);
                            class331.method2794(arg0 ^ 0xFFFFC20B, class608.field8893, class531.field7799);
                            if (class106.field1223 != null) {
                                class154.method1288((byte) -120);
                            }
                        } else {
                            class549.method4140(-21, true);
                            class444.method3412(class531.field7799, class608.field8893, (byte) -94);
                        }
                        class344.method2848(arg0 ^ 0x25E6);
                        if (class568.field8403 < 96) {
                            class326.method2763((byte) 22);
                        }
                        class549.method4140(-31, true);
                        class531.field7799.method3349(-1, class610.field8913, var11 ? class195.field2617[0] : null, null);
                        class531.field7799.method761(true, class610.field8913, false);
                        class549.method4140(-62, true);
                        if (var11) {
                            class106.method931(true);
                            class549.method4140(-104, true);
                            if (class104.field1209 == 0) {
                                class331.method2794(arg0 + 15862, class274.field4140, class415.field6125);
                            } else {
                                class444.method3412(class415.field6125, class274.field4140, (byte) 97);
                            }
                            class344.method2848(-6177);
                            class549.method4140(-128, true);
                            class415.field6125.method3349(arg0 + 15814, class610.field8913, null, class184.field2541[0]);
                            class415.field6125.method761(true, class610.field8913, true);
                            class549.method4140(-56, true);
                            class106.method931(false);
                        }
                        class618.method4609((byte) -28);
                        int var15 = class531.field7799.field1012;
                        if (var15 > class520.field7618) {
                            var15 = class520.field7618;
                        }
                        if ((class520.field7618 - 1) > var15) {
                            var15 = class520.field7618 - 1;
                        }
                        if (class289.field4305.field825.method717(false) == 0) {
                            class643.method4712(var15);
                        } else {
                            class643.method4712(0);
                        }
                        for (int var16 = 0; var16 < 4; var16++) {
                            for (int var17 = 0; var17 < class648.field9378; var17++) {
                                for (int var18 = 0; var18 < class659.field9506; var18++) {
                                    class437.method3346(var18, false, var17, var16);
                                }
                            }
                        }
                        class579.method4331(127);
                        class318.method2691(1);
                        class149.method1256((byte) -99);
                        class344.method2848(-6177);
                        class724.method5276(43);
                        if (class376.field5730 != null && class629.field9198 != null && class138.field1645 == 11) {
                            class684.field9925++;
                            class280 var19 = class610.method4508(class117.field1388, class279.field4190, (byte) -70);
                            var19.field4197.method1412(true, 1057001181);
                            class106.method934((byte) 53, var19);
                        }
                        if (class104.field1209 == 0) {
                            int var20 = (class247.field3771 - (class648.field9378 >> 4)) / 8;
                            int var21 = ((class648.field9378 >> 4) + class247.field3771) / 8;
                            int var22 = (class687.field9973 - (class659.field9506 >> 4)) / 8;
                            int var23 = ((class659.field9506 >> 4) + class687.field9973) / 8;
                            for (int var24 = var20 - 1; var24 <= var21 + 1; var24++) {
                                for (int var25 = var22 - 1; var25 <= var23 + 1; var25++) {
                                    if (var24 < var20 || var24 > var21 || var25 < var22 || var25 > var23) {
                                        class550.field8195.method3631("m" + var24 + "_" + var25, arg0 + 44567);
                                        class550.field8195.method3631("l" + var24 + "_" + var25, 28752);
                                    }
                                }
                            }
                        }
                        if (class138.field1645 == 4) {
                            class86.method728(3, (byte) -96);
                        } else if (class138.field1645 == 8) {
                            class86.method728(7, (byte) -96);
                        } else {
                            class86.method728(10, (byte) -96);
                            if (class629.field9198 != null) {
                                class280 var26 = class610.method4508(class702.field10198, class279.field4190, (byte) -111);
                                class106.method934((byte) 53, var26);
                            }
                        }
                        class232.method1985(false);
                        class318.method2691(1);
                        class270.method2235(125);
                        class222.field3412 = true;
                        if (class520.field7617) {
                            class437.method3350(46, field5720[9] + (class430.method3299(100) - class515.field7444) + field5720[11]);
                            class520.field7617 = false;
                        }
                    }
                } else {
                    class229.field3484 = 2;
                }
            } else {
                class229.field3484 = 1;
            }
        } catch (RuntimeException var28) {
            throw class759.method5498(var28, field5720[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IFFF)F", line = 515)
    public static final float method3021(int arg0, float arg1, float arg2, float arg3) {
        try {
            field5716++;
            return arg0 == -9942 ? (arg2 - arg3) * arg1 + arg3 : -1.6440147F;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5720[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIIZII)V", line = 526)
    public static final void method3022(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        try {
            field5712++;
            if (class734.field10683 == null) {
                class610.field8913.method593(-16777216, arg5, (byte) -82, arg0, arg4, arg2);
            } else if (class225.field3446.field6197 >= 0 && class648.field9378 * 512 > class225.field3446.field6197 && class225.field3446.field6211 >= 0 && class225.field3446.field6211 < (class659.field9506 * 512)) {
                class373.field5698++;
                if (class225.field3446 != null && class225.field3446.field6197 - ((class225.field3446.method2101(31463) - 1) * 256) >> 9 == class492.field7065 && class225.field3446.field6211 + 256 - class225.field3446.method2101(arg1 + 31453) * 256 >> 9 == class153.field1893) {
                    class492.field7065 = -1;
                    class153.field1893 = -1;
                    class204.method1812(0);
                }
                class281.method2299(112);
                if (!arg3) {
                    class324.method2749(10168);
                }
                class278.method2285(-110);
                class239.method2050(arg4, arg2, -29580, true, arg0, arg5);
                int var21 = class515.field7441;
                class726.field10487 = class726.field10489;
                int var23 = class344.field5337;
                if (arg1 == 10) {
                    int var22 = class655.field9463;
                    int var24 = class630.field9217;
                    if (class185.field2559 == 1) {
                        int var8 = (int) class98.field1099;
                        if ((class776.field11276 >> 8) > var8) {
                            var8 = class776.field11276 >> 8;
                        }
                        if (class28.field345[4] && var8 < class502.field7258[4] + 128) {
                            var8 = class502.field7258[4] + 128;
                        }
                        int var9 = (int) class377.field5748 + class446.field6544 & 0x3FFF;
                        class597.method4445(var8, class316.method2656(class225.field3446.field6197, class520.field7618, class225.field3446.field6211, 0) - 200, class477.field6945, var21, var9, (byte) 1, class578.field8576, (var8 >> 3) * 3 + 600 << 2);
                    } else if (class185.field2559 == 4) {
                        int var6 = (int) class98.field1099;
                        if ((class776.field11276 >> 8) > var6) {
                            var6 = class776.field11276 >> 8;
                        }
                        if (class28.field345[4] && (class502.field7258[4] + 128) > var6) {
                            var6 = class502.field7258[4] + 128;
                        }
                        int var7 = (int) class377.field5748 & 0x3FFF;
                        class597.method4445(var6, class316.method2656(class194.field2605, class520.field7618, class114.field1356, arg1 ^ 0xA) - 200, class477.field6945, var21, var7, (byte) 1, class578.field8576, (var6 >> 3) * 3 + 600 << 2);
                    } else if (class185.field2559 == 5) {
                        class429.method3292(var21, 23301);
                    }
                    int var10 = class271.field4116;
                    int var11 = class144.field1749;
                    int var12 = class683.field9899;
                    int var13 = class320.field5061;
                    int var14 = class93.field1052;
                    for (int var15 = 0; var15 < 5; var15++) {
                        if (class28.field345[var15]) {
                            int var16 = (int) ((double) (class646.field9356[var15] * 2 + 1) * Math.random() + Math.sin((double) class140.field1661[var15] / 100.0D * (double) class656.field9473[var15]) * (double) class502.field7258[var15] - (double) class646.field9356[var15]);
                            if (var15 == 3) {
                                class93.field1052 = class93.field1052 + var16 & 0x3FFF;
                            }
                            if (var15 == 1) {
                                class144.field1749 += var16 << 2;
                            }
                            if (var15 == 2) {
                                class683.field9899 += var16 << 2;
                            }
                            if (var15 == 0) {
                                class271.field4116 += var16 << 2;
                            }
                            if (var15 == 4) {
                                class320.field5061 += var16;
                                if (class320.field5061 < 1024) {
                                    class320.field5061 = 1024;
                                } else if (class320.field5061 > 3072) {
                                    class320.field5061 = 3072;
                                }
                            }
                        }
                    }
                    if (class271.field4116 < 0) {
                        class271.field4116 = 0;
                    }
                    if (class271.field4116 > ((class132.field1543 << 9) - 1)) {
                        class271.field4116 = (class132.field1543 << 9) - 1;
                    }
                    if (class683.field9899 < 0) {
                        class683.field9899 = 0;
                    }
                    if (class683.field9899 > (class216.field3296 << 9) - 1) {
                        class683.field9899 = (class216.field3296 << 9) - 1;
                    }
                    class774.method5609(arg1 ^ 0xFFFFFF8E);
                    class420.method3253(1776);
                    class610.field8913.method489(var24, var22, var24 + var23, var22 - -var21);
                    class120.method1047(arg1 - 9, true);
                    if (class235.field3549) {
                        class477.method3653(3650, class134.field1561);
                        if (class726.field10487 != class713.field10335) {
                            class222.field3412 = true;
                        }
                        class713.field10335 = class726.field10487;
                    } else {
                        class610.field8913.method586();
                        int var17 = class134.field1561;
                        if (class492.field7061 == null) {
                            class610.field8913.method483(var17);
                        } else {
                            class492.field7061.method3504(class320.field5061, var24, class610.field8913, 2, var22, class559.field8329 << 3, class93.field1052, var17, var23, var21);
                        }
                    }
                    class318.method2691(1);
                    class272.field4126.method2365(class271.field4116, class144.field1749, class683.field9899, -class320.field5061 & 0x3FFF, -class93.field1052 & 0x3FFF, -class684.field9916 & 0x3FFF);
                    class610.field8913.method495(class272.field4126);
                    class610.field8913.method479(var24 + (var23 / 2), var21 / 2 + var22, class517.field7482 << 1, class517.field7482 << 1);
                    class750.method5453(var21 / 2 + var22, class517.field7482 << 1, false, class517.field7482 << 1, var23 / 2 + var24);
                    class663.method4862(class683.field9899, -class93.field1052 & 0x3FFF, class144.field1749, -class684.field9916 & 0x3FFF, class271.field4116, -class320.field5061 & 0x3FFF, (byte) -8);
                    byte var18 = class289.field4305.field808.method4761(false) == 2 ? (byte) class373.field5698 : 1;
                    if (class235.field3549) {
                        class8.method58(-class684.field9916 & 0x3FFF, (byte) 125, -class93.field1052 & 0x3FFF, -class320.field5061 & 0x3FFF);
                        class505.method3807(class639.field9287, class144.field1749, class225.field3446.field6211 >> 9, class289.field4305.field822.method2831(false) == 0, class334.field5223, class225.field3446.field6200 + 1, class225.field3446.field6197 >> 9, class726.field10487, class683.field9899, field5711, 0, true, class152.field1872, class49.field556, class271.field4116, var18, class248.field3875, class520.field7621);
                    } else {
                        class478.method3660(field5711, class271.field4116, class144.field1749, class683.field9899, class520.field7621, class152.field1872, class334.field5223, class639.field9287, class248.field3875, class49.field556, class225.field3446.field6200 + 1, var18, class225.field3446.field6197 >> 9, class225.field3446.field6211 >> 9, class289.field4305.field822.method2831(false) == 0, true, class640.field9291 ? class726.field10487 : -1, 0, false);
                    }
                    class318.method2691(arg1 - 9);
                    if (class138.field1645 == 10) {
                        class89.method754(var21, var24, 256, true, var22, 256, var23);
                        class364.method2956(var24, var21, 256, var23, 256, (byte) -112, var22);
                        class224.method1943(var23, true, var24, 256, 256, var21, var22);
                        class388.method3092(65, var23, var24, var21, var22);
                    }
                    class751.method5458();
                    class683.field9899 = var12;
                    class144.field1749 = var11;
                    class320.field5061 = var13;
                    class93.field1052 = var14;
                    class271.field4116 = var10;
                    if (class743.field10816 && class768.field11093.method1252(arg1 - 9) == 0) {
                        class743.field10816 = false;
                    }
                    if (class743.field10816) {
                        class610.field8913.method593(-16777216, var24, (byte) -82, var21, var23, var22);
                        class145.method1227(false, class309.field4859.method2616(false, class167.field2300), class309.field4911, class64.field664, class610.field8913, (byte) -123);
                    }
                    class120.method1047(1, false);
                }
            } else {
                class610.field8913.method593(-16777216, arg5, (byte) -82, arg0, arg4, arg2);
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field5720[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lrda;J[Lhu;)V", line = 751)
    public class375(class690 arg0, long arg1, class143[] arg2) {
        try {
            this.field5719 = arg0;
            this.field5714 = arg1;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5720[6] + (arg0 == null ? field5720[5] : field5720[4]) + ',' + arg1 + ',' + (arg2 == null ? field5720[5] : field5720[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3023(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3024(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 92;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
