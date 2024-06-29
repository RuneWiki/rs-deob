import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class169 extends class107 {

    @OriginalMember(owner = "client!l", name = "F", descriptor = "[I")
    public static int[] field2770 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field2772 = 1;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "[I")
    public static int[] field2779 = new int[100];

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "Lrk;")
    public static class292 field2780;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Lki;")
    public static class64 field2775;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Z")
    public static boolean field2774;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "[I")
    public static int[] field2769;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        if (arg1 != -117) {
            return null;
        } else {
            int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
            ++field2778;
            if (super.field1662.field3063) {
                int[][] var4 = this.method759(0, -128, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[1];
                int[] var9 = var3[0];
                int[] var10 = var3[2];
                for (int var11 = 0; class24.field443 > var11; ++var11) {
                    var9[var11] = -var5[var11] + 4096;
                    var8[var11] = -var6[var11] + 4096;
                    var10[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(III)Z")
    public static final boolean method1198(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class11.field213; ++var3) {
            class52 var4 = class91.field1457[var3];
            if (var4.field751 == 1) {
                int var5 = var4.field750 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field759 * var5 >> 8) + var4.field749;
                    int var7 = (var4.field752 * var5 >> 8) + var4.field760;
                    int var8 = (var4.field763 * var5 >> 8) + var4.field757;
                    int var9 = (var4.field758 * var5 >> 8) + var4.field753;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field751 == 2) {
                int var10 = arg0 - var4.field750;
                if (var10 > 0) {
                    int var11 = (var4.field759 * var10 >> 8) + var4.field749;
                    int var12 = (var4.field752 * var10 >> 8) + var4.field760;
                    int var13 = (var4.field763 * var10 >> 8) + var4.field757;
                    int var14 = (var4.field758 * var10 >> 8) + var4.field753;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field751 == 3) {
                int var15 = var4.field749 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field754 * var15 >> 8) + var4.field750;
                    int var17 = (var4.field769 * var15 >> 8) + var4.field748;
                    int var18 = (var4.field763 * var15 >> 8) + var4.field757;
                    int var19 = (var4.field758 * var15 >> 8) + var4.field753;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field751 == 4) {
                int var20 = arg2 - var4.field749;
                if (var20 > 0) {
                    int var21 = (var4.field754 * var20 >> 8) + var4.field750;
                    int var22 = (var4.field769 * var20 >> 8) + var4.field748;
                    int var23 = (var4.field763 * var20 >> 8) + var4.field757;
                    int var24 = (var4.field758 * var20 >> 8) + var4.field753;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field751 == 5) {
                int var25 = arg1 - var4.field757;
                if (var25 > 0) {
                    int var26 = (var4.field754 * var25 >> 8) + var4.field750;
                    int var27 = (var4.field769 * var25 >> 8) + var4.field748;
                    int var28 = (var4.field759 * var25 >> 8) + var4.field749;
                    int var29 = (var4.field752 * var25 >> 8) + var4.field760;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1199(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field2776;
        if (~class45.field669 == -1) {
            int var7 = class79.field1277;
            int var8 = class178.field2956;
            int var9 = class261.field4262;
            int var10 = class87.field1365;
            int var11 = (-arg6 + arg5) * (-var9 + var10) / arg0 + var9;
            int var12 = (var8 - var7) * (-arg2 + arg1) / arg4 + var7;
            if (class101.field1579 && (64 & class44.field652) != 0) {
                class248 var13 = class79.method571(class243.field3847, class122.field1940, (byte) -74);
                if (var13 != null) {
                    class205.method1420(class205.field3297, 0L, 111, var12, var11, class189.field3096, " ->", (short) 45);
                } else {
                    class51.method325(126);
                }
            } else {
                if (~class106.field1656 == -2) {
                    class205.method1420(class88.field1377, 0L, arg3 + 214, var12, var11, -1, "", (short) 19);
                }
                class205.method1420(class78.field1254, 0L, 105, var12, var11, -1, "", (short) 25);
                ++class256.field4217;
            }
        }
        long var14 = -1L;
        int var16 = 0;
        if (arg3 != -110) {
            field2774 = true;
        }
        while (~class294.field4795 < ~var16) {
            long var17 = class267.field4330[var16];
            int var19 = (1629023002 & (int) var17) >> 29;
            int var20 = (int) var17 & 127;
            int var21 = (int) var17 >> 7 & 127;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                label371: {
                    var14 = var17;
                    if (~var19 == -3 && class242.method1650(class214.field3389, var20, var21, var17)) {
                        class172 var23 = class49.method319(var22, 0);
                        if (var23.field2846 != null) {
                            var23 = var23.method1214(-109);
                        }
                        if (var23 == null) {
                            break label371;
                        }
                        if (class45.field669 == 1) {
                            class205.method1420(class33.field537, var17, 122, var20, var21, class90.field1409, class259.field4248 + " -> <col=00ffff>" + var23.field2858, (short) 42);
                            ++class127.field2021;
                        } else if (class101.field1579) {
                            class11 var24 = class133.field2135 != -1 ? class177.method1251(class133.field2135, (byte) -45) : null;
                            if (~(4 & class44.field652) != -1 && (var24 == null || ~var23.method1230(var24.field204, class133.field2135, false) != ~var24.field204)) {
                                class205.method1420(class205.field3297, var17, 118, var20, var21, class189.field3096, class211.field3367 + " -> <col=00ffff>" + var23.field2858, (short) 11);
                                ++class41.field626;
                            }
                        } else {
                            String[] var25 = var23.field2857;
                            ++class140.field2278;
                            if (class95.field1512) {
                                var25 = class84.method599(var25, (byte) -116);
                            }
                            if (var25 != null) {
                                for (int var26 = 4; ~var26 <= -1; --var26) {
                                    if (var25[var26] != null) {
                                        int var27 = -1;
                                        short var28 = 0;
                                        if (var26 == 0) {
                                            var28 = 15;
                                        }
                                        if (~var26 == -2) {
                                            var28 = 44;
                                        }
                                        ++class237.field3727;
                                        if (~var23.field2872 == ~var26) {
                                            var27 = var23.field2832;
                                        }
                                        if (var26 == 2) {
                                            var28 = 31;
                                        }
                                        if (var23.field2870 == var26) {
                                            var27 = var23.field2827;
                                        }
                                        if (var26 == 3) {
                                            var28 = 4;
                                        }
                                        if (var26 == 4) {
                                            var28 = 1008;
                                        }
                                        class205.method1420(var25[var26], var17, 117, var20, var21, var27, "<col=00ffff>" + var23.field2858, var28);
                                    }
                                }
                            }
                            class205.method1420(class98.field1552, (long) var23.field2843, 106, var20, var21, class63.field1026, "<col=00ffff>" + var23.field2858, (short) 1012);
                        }
                    }
                    if (~var19 == -2) {
                        class104 var29 = class131.field2113[var22];
                        if ((1 & var29.field1645.field3789) == 0 && ~(var29.field994 & 127) == -1 && ~(127 & var29.field929) == -1 || ~(var29.field1645.field3789 & 1) == -2 && (127 & var29.field994) == 64 && ~(var29.field929 & 127) == -65) {
                            int var30 = -(var29.field1645.field3789 * 64) + 64 + var29.field929;
                            int var31 = -((var29.field1645.field3789 + -1) * 64) + var29.field994;
                            for (int var32 = 0; ~class91.field1439 < ~var32; ++var32) {
                                class104 var37 = class131.field2113[class34.field556[var32]];
                                if (var37 != null && !var37.field926 && var29 != var37 && var37.field958) {
                                    int var38 = -((var37.field1645.field3789 - 1) * 64) + var37.field994;
                                    int var39 = -((var37.field1645.field3789 + -1) * 64) + var37.field929;
                                    if (~var38 <= ~var31 && ~(-(-var31 + var38 >> 7) + var29.field1645.field3789) <= ~var37.field1645.field3789 && ~var39 <= ~var30 && ~var37.field1645.field3789 >= ~(-(-var30 + var39 >> 7) + var29.field1645.field3789)) {
                                        class230.method1596(arg3 ^ 17653, var37.field1645, class34.field556[var32], var21, var20);
                                        var37.field926 = true;
                                    }
                                }
                            }
                            for (int var33 = 0; var33 < class134.field2172; ++var33) {
                                class12 var34 = class28.field494[class111.field1708[var33]];
                                if (var34 != null && !var34.field926 && var34.field958) {
                                    int var35 = var34.field994 - 64 * (-1 + var34.method101(false));
                                    int var36 = var34.field929 + -((var34.method101(false) + -1) * 64);
                                    if (var31 <= var35 && ~var34.method101(false) >= ~(-(-var31 + var35 >> 7) + var29.field1645.field3789) && var30 <= var36 && ~var34.method101(false) >= ~(var29.field1645.field3789 - (-var30 + var36 >> 7))) {
                                        class253.method1714(var21, class111.field1708[var33], 5, var34, var20);
                                        var34.field926 = true;
                                    }
                                }
                            }
                        }
                        if (var29.field926) {
                            break label371;
                        }
                        class230.method1596(arg3 + -17451, var29.field1645, var22, var21, var20);
                        var29.field926 = true;
                    }
                    if (~var19 == -1) {
                        class12 var40 = class28.field494[var22];
                        if (~(var40.field994 & 127) == -65 && ~(var40.field929 & 127) == -65) {
                            int var41 = var40.field994 - (-64 + var40.method101(false) * 64);
                            int var42 = var40.field929 - 64 * (var40.method101(false) + -1);
                            for (int var43 = 0; class91.field1439 > var43; ++var43) {
                                class104 var48 = class131.field2113[class34.field556[var43]];
                                if (var48 != null && !var48.field926 && var48.field958) {
                                    int var49 = -(var48.field1645.field3789 * 64) + 64 + var48.field994;
                                    int var50 = -((var48.field1645.field3789 + -1) * 64) + var48.field929;
                                    if (~var41 >= ~var49 && ~var48.field1645.field3789 >= ~(-(var49 - var41 >> 7) + var40.method101(false)) && var50 >= var42 && var48.field1645.field3789 <= -(-var42 + var50 >> 7) + var40.method101(false)) {
                                        class230.method1596(-17561, var48.field1645, class34.field556[var43], var21, var20);
                                        var48.field926 = true;
                                    }
                                }
                            }
                            for (int var44 = 0; class134.field2172 > var44; ++var44) {
                                class12 var45 = class28.field494[class111.field1708[var44]];
                                if (var45 != null && !var45.field926 && var40 != var45 && var45.field958) {
                                    int var46 = var45.field994 - (var45.method101(false) - 1) * 64;
                                    int var47 = var45.field929 - (-64 + var45.method101(false) * 64);
                                    if (var46 >= var41 && var45.method101(false) <= -(-var41 + var46 >> 7) + var40.method101(false) && var42 <= var47 && var45.method101(false) <= var40.method101(false) - (var47 - var42 >> 7)) {
                                        class253.method1714(var21, class111.field1708[var44], 5, var45, var20);
                                        var45.field926 = true;
                                    }
                                }
                            }
                        }
                        if (var40.field926) {
                            break label371;
                        }
                        class253.method1714(var21, var22, 5, var40, var20);
                        var40.field926 = true;
                    }
                    if (~var19 == -4) {
                        class223 var51 = class296.field4827[class214.field3389][var20][var21];
                        if (var51 != null) {
                            for (class121 var52 = (class121) var51.method1547(arg3 ^ -110); var52 != null; var52 = (class121) var51.method1552(-127)) {
                                int var53 = var52.field1913.field2628;
                                class158 var54 = class107.method754(arg3 + -20453, var53);
                                if (~class45.field669 == -2) {
                                    class205.method1420(class33.field537, (long) var53, 103, var20, var21, class90.field1409, class259.field4248 + " -> <col=ff9040>" + var54.field2532, (short) 48);
                                    ++class93.field1471;
                                } else if (class101.field1579) {
                                    class11 var55 = class133.field2135 == -1 ? null : class177.method1251(class133.field2135, (byte) -102);
                                    if (~(1 & class44.field652) != -1 && (var55 == null || ~var54.method1073(class133.field2135, var55.field204, -73) != ~var55.field204)) {
                                        class205.method1420(class205.field3297, (long) var53, arg3 + 236, var20, var21, class189.field3096, class211.field3367 + " -> <col=ff9040>" + var54.field2532, (short) 5);
                                        ++class244.field3858;
                                    }
                                } else {
                                    ++class255.field4206;
                                    String[] var56 = var54.field2531;
                                    if (class95.field1512) {
                                        var56 = class84.method599(var56, (byte) -115);
                                    }
                                    for (int var57 = 4; ~var57 <= -1; --var57) {
                                        if (var56 != null && var56[var57] != null) {
                                            ++class113.field1728;
                                            byte var58 = 0;
                                            if (var57 == 0) {
                                                var58 = 51;
                                            }
                                            if (~var57 == -2) {
                                                var58 = 9;
                                            }
                                            int var59 = -1;
                                            if (var54.field2535 == var57) {
                                                var59 = var54.field2556;
                                            }
                                            if (var57 == 2) {
                                                var58 = 34;
                                            }
                                            if (var54.field2579 == var57) {
                                                var59 = var54.field2573;
                                            }
                                            if (var57 == 3) {
                                                var58 = 20;
                                            }
                                            if (var57 == 4) {
                                                var58 = 60;
                                            }
                                            class205.method1420(var56[var57], (long) var53, 116, var20, var21, var59, "<col=ff9040>" + var54.field2532, var58);
                                        }
                                    }
                                    class205.method1420(class98.field1552, (long) var53, arg3 + 229, var20, var21, class63.field1026, "<col=ff9040>" + var54.field2532, (short) 1007);
                                }
                            }
                        }
                    }
                }
            }
            ++var16;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class169() {
        super(1, false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg2 != 28) {
            field2774 = true;
        }
        if (arg0 == 0) {
            super.field1660 = arg1.method1849(255) == 1;
        }
        ++field2781;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V")
    public static final void method1200(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class16.field305 = -1;
        class208.field3314 = -1;
        ++field2771;
        float var5 = (float) class262.field4278 / (float) class262.field4277;
        if (arg1 < 30) {
            method1202((byte) 87, -84);
        }
        int var6 = arg3;
        int var7 = arg2;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg4 - (arg3 - var6) / 2;
        int var9 = arg0 - (-var7 + arg2) / 2;
        class45.field667 = class262.field4278 * var9 / var7;
        class249.field4095 = class262.field4277 * var8 / var6;
        class66.method441(96);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int var3 = -32 / ((-34 - arg0) / 49);
        int[] var4 = super.field1661.method894(110, arg1);
        ++field2777;
        if (super.field1661.field2115) {
            int[] var5 = this.method756(0, arg1, -29053);
            for (int var6 = 0; ~class24.field443 < ~var6; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field2770 = null;
        field2779 = null;
        if (arg0 != 0) {
            field2774 = false;
        }
        field2775 = null;
        field2769 = null;
        field2780 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)[B")
    public static final byte[] method1202(byte arg0, int arg1) {
        class179 var2 = (class179) class7.field158.method61(86, (long) arg1);
        ++field2773;
        if (arg0 != 60) {
            method1202((byte) 31, 23);
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = 255 - var6;
                int var8 = class182.method1288(21953, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class179(var3);
            class7.field158.method59(var2, (long) arg1, 5);
        }
        return var2.field2961;
    }
}
