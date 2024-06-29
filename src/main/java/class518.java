import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class518 extends class331 {

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!gda", name = "o", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!gda", name = "r", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!gda", name = "s", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!gda", name = "t", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!gda", name = "u", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!gda", name = "v", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!gda", name = "w", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!gda", name = "y", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!gda", name = "z", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!gda", name = "A", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!gda", name = "p", descriptor = "Lbe;")
    public static class196 field7288;

    @OriginalMember(owner = "client!gda", name = "q", descriptor = "Lha;")
    public static class454 field7289;

    @OriginalMember(owner = "client!gda", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field7296;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)I", line = 3)
    public final int method2971(byte arg0) {
        if (arg0 >= -119) {
            return -56;
        } else {
            ++field7292;
            return super.field4202;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V", line = 14)
    public final void method224(int arg0) {
        ++field7287;
        if (this.method2976((byte) -128)) {
            if (super.field4203.field633.method4193((byte) 47) && !class37.method325(super.field4203.field633.method4191((byte) -121), true)) {
                super.field4202 = 1;
            }
            if (~super.field4203.field603.method3243((byte) -120) == -2) {
                super.field4202 = 1;
            }
        }
        if (arg0 != -1959) {
            this.method226((byte) 123);
        }
        if (~super.field4202 == -4) {
            super.field4202 = 2;
        }
        if (super.field4202 < 0 || super.field4202 > 3) {
            super.field4202 = this.method226((byte) 13);
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(II)I", line = 46)
    public final int method222(int arg0, int arg1) {
        ++field7297;
        if (class288.method1726(31685, arg0)) {
            if (super.field4203.field633.method4193((byte) 57) && !class37.method325(super.field4203.field633.method4191((byte) -121), true)) {
                return 3;
            }
            if (~super.field4203.field603.method3243((byte) -128) == -2) {
                return 3;
            }
        }
        if (~arg0 == -4) {
            return 3;
        } else {
            if (arg1 != 1) {
                method2977((byte) -6);
            }
            return class288.method1726(arg1 ^ 31684, arg0) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(II)Z", line = 80)
    public static final boolean method2972(int arg0, int arg1) {
        ++field7294;
        if (arg1 != 1) {
            field7293 = -94;
        }
        return ~arg0 == -1 || ~arg0 == -2 || ~arg0 == -3;
    }

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "(B)Z", line = 91)
    public final boolean method2973(byte arg0) {
        ++field7295;
        if (arg0 < 103) {
            method2975(121);
        }
        return true;
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)V", line = 103)
    public static void method2974(int arg0) {
        field7289 = null;
        field7288 = null;
        field7296 = null;
        if (arg0 != 1) {
            field7293 = -102;
        }
    }

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(I)V", line = 117)
    public static final void method2975(int arg0) {
        if (arg0 != 14) {
            method2977((byte) -20);
        }
        ++field7299;
        try {
            if (~class244.field3142 == -2) {
                int var1 = class106.field1297.method3685((byte) -12);
                if (var1 > 0 && class106.field1297.method3678(1715984807)) {
                    int var2 = var1 - class714.field10062;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class106.field1297.method3695(var2, arg0 + -14);
                    return;
                }
                class106.field1297.method3675(5194);
                class106.field1297.method3688((byte) -5);
                class376.field5262 = null;
                class188.field2470 = null;
                if (class379.field5303 == null) {
                    class244.field3142 = 0;
                } else {
                    class244.field3142 = 2;
                }
            }
            if (class244.field3142 == 3) {
                int var3 = class106.field1297.method3685((byte) -12);
                if (~var3 > ~class74.field991 && class106.field1297.method3678(1715984807)) {
                    int var4 = class189.field2478 + var3;
                    if (var4 > class74.field991) {
                        var4 = class74.field991;
                    }
                    class106.field1297.method3695(var4, 0);
                } else {
                    class244.field3142 = 0;
                    class189.field2478 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class106.field1297.method3675(5194);
            class379.field5303 = null;
            class188.field2470 = null;
            class244.field3142 = 0;
            class55.field799 = null;
            class376.field5262 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)I", line = 182)
    public final int method226(byte arg0) {
        ++field7286;
        if (arg0 != 13) {
            field7296 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(ILts;)V", line = 193)
    public class518(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lts;)V", line = 199)
    public class518(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "(II)V", line = 204)
    public final void method227(int arg0, int arg1) {
        super.field4202 = arg1;
        ++field7291;
        if (arg0 <= 113) {
            this.method2976((byte) -20);
        }
    }

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "(B)Z", line = 215)
    public final boolean method2976(byte arg0) {
        if (arg0 > -122) {
            this.method224(-8);
        }
        ++field7285;
        return class288.method1726(31685, super.field4202);
    }

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "(B)I", line = 227)
    public static final int method2977(byte arg0) {
        if (class223.field2944.field607.method3332((byte) -123) == 0) {
            for (int var1 = 0; class234.field3023 > var1; ++var1) {
                if (~class753.field10513[var1].method798(-17654) == -116 || ~class753.field10513[var1].method798(-17654) == -84) {
                    class223.field2944.method346(class223.field2944.field607, 1, false);
                    class129.field1557 = true;
                    break;
                }
            }
        }
        ++field7298;
        if (arg0 > -120) {
            return -107;
        } else {
            if (class218.field2741 == class147.field1776) {
                Runtime var2 = Runtime.getRuntime();
                int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
                long var4 = class97.method654((byte) 103);
                if (class486.field6905 == 0L) {
                    class486.field6905 = var4;
                }
                if (~var3 < -16385 && var4 - class486.field6905 < 5000L) {
                    if (~(var4 - class2.field10) < -1001L) {
                        System.gc();
                        class2.field10 = var4;
                    }
                    return 0;
                }
            }
            if (class218.field2752 == class147.field1776) {
                if (class424.field6032 == null) {
                    class424.field6032 = new class494(class101.field1243, class707.field9957, class286.field3632, class589.field8217);
                }
                if (!class424.field6032.method2873(30920)) {
                    return 0;
                }
                class525.method3012(0, (String) null, true, 18097);
                class81.field1055 = !class625.method3420(0);
                class149.field1803 = class295.method1763(1, -123, class81.field1055 ? 34 : 32, false);
                class710.field9985 = class295.method1763(1, -97, 33, false);
                class378.field5293 = class295.method1763(1, -116, 13, false);
            }
            if (class218.field2753 == class147.field1776) {
                boolean var6 = class710.field9985.method3829((byte) -27);
                int var7 = class403.field5622[33].method3057((byte) -90);
                int var8 = var7 + class403.field5622[class81.field1055 ? 34 : 32].method3057((byte) -100);
                int var9 = var8 + class403.field5622[13].method3057((byte) -128);
                int var10 = var9 + (var6 ? 100 : class710.field9985.method3832(89));
                if (~var10 != -401) {
                    return var10 / 4;
                }
                class728.field10189 = class149.field1803.method3833((byte) -107);
                class114.field1404 = class710.field9985.method3833((byte) 113);
                class181.method1163(class149.field1803, true);
                int var11 = class223.field2944.field614.method1525((byte) -127);
                class41.field627 = new class150(class702.field9902, class416.field5920, class710.field9985);
                int[] var12 = class41.field627.method938(var11, (byte) 114);
                if (~var12.length == -1) {
                    var12 = class41.field627.method938(0, (byte) 91);
                }
                class416 var13 = new class416(class149.field1803, class378.field5293);
                if (~var12.length < -1) {
                    class755.field10520 = new class334[var12.length];
                    for (int var14 = 0; ~class755.field10520.length < ~var14; ++var14) {
                        class755.field10520[var14] = new class190(class41.field627.method940(-80, var12[var14]), var13);
                    }
                }
            }
            if (class218.field2754 == class147.field1776) {
                class536.method3052(class30.method298(64), class149.field1803, 123, class378.field5293);
            }
            if (class218.field2755 == class147.field1776) {
                int var15 = class452.method2652((byte) -24);
                int var16 = class236.method1479(-74);
                if (~var15 > ~var16) {
                    return var15 * 100 / var16;
                }
            }
            if (class218.field2756 == class147.field1776) {
                if (class755.field10520 != null && ~class755.field10520.length < -1) {
                    if (class755.field10520[0].method235(9642) < 100) {
                        return 0;
                    }
                    if (class755.field10520.length > 1 && class41.field627.method939(-21122) && class755.field10520[1].method235(9642) < 100) {
                        return 0;
                    }
                }
                class613.method3357(class458.field6407, (byte) 47);
                class202.method1257((byte) -60, class458.field6407);
                class614.method3369(1, (byte) -73);
            }
            if (class218.field2757 == class147.field1776) {
                for (int var17 = 0; var17 < 4; ++var17) {
                    class410.field5786[var17] = class6.method30(class613.field8591, class1.field3, true);
                }
            }
            if (class218.field2758 == class147.field1776) {
                class645.field8897 = class295.method1763(1, -86, 8, false);
                class562.field7865 = class295.method1763(1, -102, 0, false);
                class459.field6436 = class295.method1763(1, -127, 1, false);
                class565.field7911 = class295.method1763(1, -85, 2, false);
                class570.field7946 = class295.method1763(1, -124, 3, false);
                class1.field2 = class295.method1763(1, -93, 4, false);
                class541.field7613 = class295.method1763(1, -102, 5, true);
                class456.field6388 = class295.method1763(1, -83, 6, true);
                class426.field6058 = class295.method1763(1, -88, 7, false);
                class399.field5523 = class295.method1763(1, -119, 9, false);
                class548.field7731 = class295.method1763(1, -76, 10, false);
                class487.field6937 = class295.method1763(1, -83, 11, false);
                class27.field446 = class295.method1763(1, -118, 12, false);
                class107.field1327 = class295.method1763(1, -119, 14, false);
                class250.field3179 = class295.method1763(1, -79, 15, false);
                class274.field3470 = class295.method1763(1, -75, 16, false);
                class37.field544 = class295.method1763(1, -99, 17, false);
                class687.field9729 = class295.method1763(1, -105, 18, false);
                class438.field6162 = class295.method1763(1, -59, 19, false);
                class530.field7471 = class295.method1763(1, -117, 20, false);
                class394.field5493 = class295.method1763(1, -77, 21, false);
                class102.field1255 = class295.method1763(1, -102, 22, false);
                class250.field3180 = class295.method1763(1, -116, 23, true);
                class494.field6985 = class295.method1763(1, -100, 24, false);
                class505.field7136 = class295.method1763(1, -101, 25, false);
                class224.field2954 = class295.method1763(1, -101, 26, true);
                class322.field4109 = class295.method1763(1, -100, 27, false);
                class395.field5502 = class295.method1763(1, -112, 28, true);
                class603.field8364 = class295.method1763(1, -91, 29, false);
                class663.field9080 = class295.method1763(1, -128, 30, true);
                class447.field6293 = class295.method1763(1, -119, 31, true);
                class583.field8102 = class295.method1763(2, -89, 36, true);
            }
            if (class218.field2759 == class147.field1776) {
                int var18 = 0;
                for (int var19 = 0; var19 < 37; ++var19) {
                    if (class403.field5622[var19] != null) {
                        var18 += class403.field5622[var19].method3057((byte) -123) * class737.field10322[var19] / 100;
                    }
                }
                if (var18 != 100) {
                    if (~class2.field12 > -1) {
                        class2.field12 = var18;
                    }
                    return (var18 - class2.field12) * 100 / (-class2.field12 + 100);
                }
                class400.method2375(true, class645.field8897);
                class536.method3052(class30.method298(64), class645.field8897, 94, class378.field5293);
            }
            if (class218.field2760 == class147.field1776) {
                if (class182.field2386 == -1) {
                    class182.field2386 = class456.field6388.method3820("scape main", -1);
                }
                class188.method1197(false);
                class614.method3369(2, (byte) -112);
            }
            if (class218.field2761 == class147.field1776) {
                class646.method3501(class681.field9312, -108, class663.field9080);
            }
            if (class218.field2762 == class147.field1776) {
                int var20 = class664.method3596(102);
                if (var20 < 100) {
                    return var20;
                }
                class441.method2603(class395.field5502.method3836(1, true), 125);
                class741.method4160(class395.field5502.method3836(3, true), 4);
            }
            if (class218.field2763 == class147.field1776) {
                if (class694.field9819 != -1 && !class426.field6058.method3811(0, (byte) 101, class694.field9819)) {
                    return 99;
                }
                class524.field7407 = new class48(class224.field2954, class399.field5523, class645.field8897);
                class188.field2466 = new class634(class702.field9902, class416.field5920, class565.field7911);
                class190.field2501 = new class487(class702.field9902, class416.field5920, class565.field7911);
                class525.field7423 = new class17(class702.field9902, class416.field5920, class565.field7911, class645.field8897);
                class186.field2453 = new class106(class702.field9902, class416.field5920, class37.field544);
                class347.field4487 = new class658(class702.field9902, class416.field5920, class565.field7911);
                class251.field3182 = new class92(class702.field9902, class416.field5920, class565.field7911);
                class398.field5521 = new class461(class702.field9902, class416.field5920, class565.field7911, class645.field8897);
                class5.field52 = new class418(class702.field9902, class416.field5920, class565.field7911, class426.field6058);
                class492.field6975 = new class550(class702.field9902, class416.field5920, class565.field7911);
                class545.field7652 = new class52(class702.field9902, class416.field5920, class565.field7911);
                class358.field5112 = new class143(class702.field9902, class416.field5920, true, class274.field3470, class426.field6058);
                class37.field551 = new class470(class702.field9902, class416.field5920, class565.field7911, class645.field8897);
                class70.field946 = new class237(class702.field9902, class416.field5920, class565.field7911, class645.field8897);
                class598.field8304 = new class224(class702.field9902, class416.field5920, true, class687.field9729, class426.field6058);
                class190.field2488 = new class713(class702.field9902, class416.field5920, true, class188.field2466, class438.field6162, class426.field6058);
                class223.field2925 = new class200(class702.field9902, class416.field5920, class565.field7911);
                class646.field8903 = new class93(class702.field9902, class416.field5920, class530.field7471, class562.field7865, class459.field6436);
                class182.field2384 = new class522(class702.field9902, class416.field5920, class565.field7911);
                class696.field9859 = new class184(class702.field9902, class416.field5920, class565.field7911);
                class250.field3177 = new class668(class702.field9902, class416.field5920, class394.field5493, class426.field6058);
                class580.field8064 = new class166(class702.field9902, class416.field5920, class565.field7911);
                class15.field218 = new class132(class702.field9902, class416.field5920, class565.field7911);
                class461.field6639 = new class90(class702.field9902, class416.field5920, class565.field7911);
                class197.field2537 = new class427(class702.field9902, class416.field5920, class102.field1255);
                class348.field4512 = new class153(class702.field9902, class416.field5920, class565.field7911);
                class190.method1202(class570.field7946, class426.field6058, class645.field8897, 5501, class378.field5293);
                class750.method4194(class603.field8364, 5126);
                class541.field7620 = new class348(class416.field5920, class494.field6985, class505.field7136);
                class674.field9178 = new class214(class416.field5920, class494.field6985, class505.field7136, new class386());
                class454.method2661(true);
                class358.field5112.method886(~class223.field2944.field619.method444((byte) -120) == -1, -1);
                class461.field6637 = new class281();
                class681.method3687((byte) 70);
                class269.method1614(class322.field4109, true);
                class491.method2861(class426.field6058, true, class524.field7407);
                class637 var21 = new class637(class548.field7731.method3813("huffman", "", -102));
                class593.method3292(var21, 1);
                try {
                    jagmisc.init();
                } catch (Throwable var29) {
                }
                class508.field7188 = class43.method364((byte) 9);
                class241.field3102 = new class618(true, class681.field9312);
            }
            if (class218.field2765 == class147.field1776) {
                int var22 = class642.method3490(0, class645.field8897) + class87.method611(-30366, true);
                int var23 = class17.method210(16) - -class236.method1479(-121);
                if (var23 > var22) {
                    return var22 * 100 / var23;
                }
            }
            if (class218.field2766 == class147.field1776) {
                class341.method2006(class250.field3180, class347.field4487, class251.field3182, class358.field5112, class37.field551, class70.field946, class461.field6637);
            }
            if (class218.field2767 == class147.field1776) {
                class173.field2267 = new int[class461.field6639.field1139];
                class665.field9111 = new boolean[class461.field6639.field1139];
                class702.field9903 = new String[class15.field218.field1570];
                for (int var24 = 0; class461.field6639.field1139 > var24; ++var24) {
                    if (~class461.field6639.method625(var24, -1).field690 == -1) {
                        class665.field9111[var24] = true;
                        ++class288.field3669;
                    }
                    class173.field2267[var24] = -1;
                }
                class169.method1059((byte) -128);
                class100.field1231 = class570.field7946.method3820("loginscreen", -1);
                class635.field8801 = class570.field7946.method3820("lobbyscreen", -1);
                class541.field7613.method3826(false, true, (byte) -2);
                class456.field6388.method3826(true, true, (byte) -2);
                class645.field8897.method3826(true, true, (byte) -2);
                class378.field5293.method3826(true, true, (byte) -2);
                class548.field7731.method3826(true, true, (byte) -2);
                class570.field7946.method3826(true, true, (byte) -2);
                class224.field2968 = true;
                class565.field7911.field9720 = 2;
                class37.field544.field9720 = 2;
                class274.field3470.field9720 = 2;
                class687.field9729.field9720 = 2;
                class438.field6162.field9720 = 2;
                class530.field7471.field9720 = 2;
                class394.field5493.field9720 = 2;
            }
            if (class218.field2768 == class147.field1776) {
                if (!class666.method3606(61, class100.field1231)) {
                    return 0;
                }
                boolean var25 = true;
                for (int var26 = 0; ~class323.field4125[class100.field1231].length < ~var26; ++var26) {
                    class460 var27 = class323.field4125[class100.field1231][var26];
                    if (~var27.field6483 == -6 && var27.field6491 != -1 && !class645.field8897.method3811(0, (byte) 101, var27.field6491)) {
                        var25 = false;
                    }
                }
                if (!var25) {
                    return 0;
                }
            }
            if (class218.field2769 == class147.field1776) {
                class177.method1084(true, true);
            }
            if (class218.field2770 == class147.field1776) {
                class733.field10249.method2369(4098);
                try {
                    class238.field3077.join();
                } catch (InterruptedException var28) {
                    return 0;
                }
                class238.field3077 = null;
                class41.field627 = null;
                class149.field1803 = null;
                class733.field10249 = null;
                class755.field10520 = null;
                class710.field9985 = null;
                class722.method3996((byte) 107);
                class717.field10117 = class223.field2944.field607.method3332((byte) -121) == 1;
                class223.field2944.method346(class223.field2944.field607, 1, false);
                if (class717.field10117) {
                    class223.field2944.method346(class223.field2944.field601, 0, false);
                } else if (class223.field2944.field601.field10491 && ~class241.field3102.field8654 > -513 && class241.field3102.field8654 != 0) {
                    class223.field2944.method346(class223.field2944.field601, 0, false);
                }
                class252.method1530((byte) 79);
                if (class717.field10117) {
                    class462.method2730(1, false, 0);
                } else {
                    class462.method2730(1, false, class223.field2944.field601.method4191((byte) -127));
                }
                class653.method3523(-1, class223.field2944.field617.method3243((byte) -124), -1, -1, false);
                class613.method3357(class458.field6407, (byte) 47);
                class202.method1257((byte) -111, class458.field6407);
                class216.method1310(class458.field6407, 0, class645.field8897);
                class734.method4106(12, class328.field4189);
            }
            return class571.method3212((byte) 115);
        }
    }
}
