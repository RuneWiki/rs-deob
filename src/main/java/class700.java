import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class700 {

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public int field9895;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "B")
    public byte field9891;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "S")
    public short field9894;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public int field9890;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public int field9896;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "S")
    public short field9901;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "S")
    public short field9893;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public int field9899;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public int field9904;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Z")
    public boolean field9898;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Lrga;")
    public static class280 field9902 = new class280(28, -1);

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "Lgb;")
    public static class162 field9903 = new class162();

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field9906 = 0;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "F")
    public static float field9905;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field9907;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method3929(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9889++;
        if (!class68.field926) {
            return false;
        } else if (class160.field2109 < 100) {
            return false;
        } else if (class455.method2433(arg1, arg3, -1, arg2)) {
            if (arg4 <= 1) {
                method3931(-59);
            }
            int var5 = arg3 << class52.field775;
            int var6 = arg2 << class52.field775;
            if (class175.method1100(false, class702.field9928, arg0, var6, class491.field6485[arg1].method1562(arg2, (byte) 51, arg3), var5, class702.field9928)) {
                class613.field8621++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
    public static final int method3930(int arg0) {
        if (!class301.field3698.field6620) {
            for (int var1 = 0; var1 < class404.field5070; var1++) {
                if (class338.field4383[var1].method561(true) == 's' || class338.field4383[var1].method561(true) == 'S') {
                    class301.field3698.field6620 = true;
                    break;
                }
            }
        }
        field9900++;
        if (class347.field4449 == class203.field2559) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class571.method3150(90);
            if (class174.field2264 == 0L) {
                class174.field2264 = var4;
            }
            if (var3 > 16384 && var4 - class174.field2264 < 5000L) {
                if (var4 - class496.field6547 > 1000L) {
                    System.gc();
                    class496.field6547 = var4;
                }
                return 0;
            }
        }
        if (class347.field4449 == class203.field2569) {
            if (class89.field1261 == null) {
                class89.field1261 = new class287(class323.field4157, class512.field6955, class306.field3779, class385.field4845);
            }
            if (!class89.field1261.method1613(-17427)) {
                return 0;
            }
            class602.method3303(0, false, null);
            class377.field4751 = !class360.method1984(0);
            class51.field772 = class556.method3061(false, 1, 1000000, class377.field4751 ? 34 : 32);
            class568.field7952 = class556.method3061(false, 1, 1000000, 33);
            class301.field3700 = class556.method3061(false, 1, 1000000, 13);
        }
        if (class347.field4449 == class203.field2570) {
            class568.field7952.method3356(28528);
            int var6 = class654.field9227[33].method1734((byte) 89);
            int var7 = var6 + class654.field9227[class377.field4751 ? 34 : 32].method1734((byte) 92);
            int var8 = var7 + class654.field9227[13].method1734((byte) 103);
            int var9 = var8 + class568.field7952.method3357(false);
            if (var9 != 400) {
                return var9 / 4;
            }
            class430.field5387 = class51.field772.method3340(6);
            class12.field221 = class568.field7952.method3340(6);
            class71.method419(class51.field772, (byte) 55);
            int var10 = class301.field3698.field6619;
            class676.field9498 = new class515(class98.field1337, class250.field3068, class568.field7952);
            int[] var11 = class676.field9498.method2792((byte) -27, var10);
            class504 var12 = new class504(class51.field772, class301.field3700);
            if (var11.length > 0) {
                class57.field812 = new class134[var11.length];
                for (int var13 = 0; var13 < class57.field812.length; var13++) {
                    class57.field812[var13] = new class270(class676.field9498.method2790(89, var11[var13]), var12);
                }
            }
        }
        if (class347.field4449 == class203.field2571) {
            class358.method1970(class301.field3700, 126, class329.method1872(-118), class51.field772);
        }
        if (class347.field4449 == class203.field2572) {
            int var14 = class444.method2374((byte) -120);
            int var15 = class83.method475(110);
            if (var14 < var15) {
                return var14 * 100 / var15;
            }
        }
        if (class347.field4449 == class203.field2573) {
            if (class57.field812 != null && class57.field812.length > 0) {
                if (class57.field812[0].method778((byte) 118) < 100) {
                    return 0;
                }
                if (class57.field812.length > 1 && class676.field9498.method2791((byte) -86) && class57.field812[1].method778((byte) 113) < 100) {
                    return 0;
                }
            }
            class608.method3321(8, class32.field452);
            class410.method2170(class32.field452, -27346);
            class361.method1987(1, 38);
        }
        if (class347.field4449 == class203.field2574) {
            for (int var16 = 0; var16 < 4; var16++) {
                class154.field1991[var16] = class109.method614(class452.field5802, class431.field5395, (byte) -121);
            }
        }
        if (class347.field4449 == class203.field2575) {
            class631.field8846 = class556.method3061(false, 1, 1000000, 8);
            class280.field3511 = class556.method3061(false, 1, 1000000, 0);
            class276.field3463 = class556.method3061(false, 1, 1000000, 1);
            class493.field6500 = class556.method3061(false, 1, 1000000, 2);
            class642.field9038 = class556.method3061(false, 1, 1000000, 3);
            class533.field7189 = class556.method3061(false, 1, 1000000, 4);
            class600.field8416 = class556.method3061(true, 1, 1000000, 5);
            class81.field1086 = class556.method3061(true, 1, 1000000, 6);
            class324.field4170 = class556.method3061(false, 1, 1000000, 7);
            class85.field1197 = class556.method3061(false, 1, 1000000, 9);
            class590.field8283 = class556.method3061(false, 1, 1000000, 10);
            class36.field496 = class556.method3061(false, 1, 1000000, 11);
            class689.field9770 = class556.method3061(false, 1, 1000000, 12);
            class472.field5993 = class556.method3061(false, 1, 1000000, 14);
            class518.field7073 = class556.method3061(false, 1, 1000000, 15);
            class242.field3020 = class556.method3061(false, 1, 1000000, 16);
            class622.field8709 = class556.method3061(false, 1, 1000000, 17);
            class415.field5188 = class556.method3061(false, 1, 1000000, 18);
            class673.field9472 = class556.method3061(false, 1, 1000000, 19);
            class105.field1411 = class556.method3061(false, 1, 1000000, 20);
            class475.field6030 = class556.method3061(false, 1, 1000000, 21);
            class581.field8130 = class556.method3061(false, 1, 1000000, 22);
            class381.field4806 = class556.method3061(true, 1, 1000000, 23);
            class572.field7994 = class556.method3061(false, 1, 1000000, 24);
            class374.field4711 = class556.method3061(false, 1, 1000000, 25);
            class193.field2408 = class556.method3061(true, 1, 1000000, 26);
            class224.field2809 = class556.method3061(false, 1, 1000000, 27);
            class398.field5007 = class556.method3061(true, 1, 1000000, 28);
            class488.field6460 = class556.method3061(false, 1, 1000000, 29);
            class382.field4821 = class556.method3061(true, 1, 1000000, 30);
            class689.field9772 = class556.method3061(true, 1, 1000000, 31);
        }
        if (class347.field4449 == class203.field2576) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class654.field9227[var18] != null) {
                    var17 += class654.field9227[var18].method1734((byte) 97) * class78.field1073[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class629.field8765 < 0) {
                    class629.field8765 = var17;
                }
                return (var17 - class629.field8765) * 100 / (100 - class629.field8765);
            }
            class517.method2800(class631.field8846, -21243);
            class358.method1970(class301.field3700, 101, class329.method1872(-89), class631.field8846);
        }
        if (class347.field4449 == class203.field2577) {
            class462.method2460((byte) -120);
            class361.method1987(2, 104);
        }
        if (class347.field4449 == class203.field2578) {
            class141.method827(class590.field8289, class382.field4821, -3550);
        }
        if (class347.field4449 == class203.field2579) {
            int var19 = class546.method2945(false);
            if (var19 < 100) {
                return var19;
            }
            class285.method1599((byte) -107, class398.field5007.method3344(109, 1));
            class615.method3388(class398.field5007.method3344(117, 3), true);
        }
        if (class347.field4449 == class203.field2580) {
            if (class405.field5073 != -1 && !class324.field4170.method3370(0, (byte) 109, class405.field5073)) {
                return 99;
            }
            class651.field9183 = new class469(class193.field2408, class85.field1197, class631.field8846);
            class705.field9939 = new class468(class98.field1337, class250.field3068, class493.field6500);
            class591.field8297 = new class338(class98.field1337, class250.field3068, class493.field6500);
            class493.field6503 = new class574(class98.field1337, class250.field3068, class493.field6500, class631.field8846);
            class397.field5005 = new class289(class98.field1337, class250.field3068, class622.field8709);
            class82.field1096 = new class684(class98.field1337, class250.field3068, class493.field6500);
            class583.field8147 = new class28(class98.field1337, class250.field3068, class493.field6500);
            class40.field540 = new class21(class98.field1337, class250.field3068, class493.field6500, class324.field4170);
            class354.field4508 = new class631(class98.field1337, class250.field3068, class493.field6500);
            class279.field3504 = new class195(class98.field1337, class250.field3068, class493.field6500);
            class428.field5352 = new class568(class98.field1337, class250.field3068, true, class242.field3020, class324.field4170);
            class556.field7727 = new class672(class98.field1337, class250.field3068, class493.field6500, class631.field8846);
            class48.field671 = new class668(class98.field1337, class250.field3068, class493.field6500, class631.field8846);
            class287.field3581 = new class255(class98.field1337, class250.field3068, true, class415.field5188, class324.field4170);
            class633.field8881 = new class72(class98.field1337, class250.field3068, true, class705.field9939, class673.field9472, class324.field4170);
            class453.field5806 = new class167(class98.field1337, class250.field3068, class493.field6500);
            class583.field8149 = new class322(class98.field1337, class250.field3068, class105.field1411, class280.field3511, class276.field3463);
            class64.field879 = new class528(class98.field1337, class250.field3068, class493.field6500);
            class470.field5972 = new class415(class98.field1337, class250.field3068, class493.field6500);
            class370.field4686 = new class702(class98.field1337, class250.field3068, class475.field6030, class324.field4170);
            class672.field9462 = new class324(class98.field1337, class250.field3068, class493.field6500);
            class528.field7148 = new class431(class98.field1337, class250.field3068, class493.field6500);
            class78.field1078 = new class411(class98.field1337, class250.field3068, class493.field6500);
            class452.field5800 = new class636(class98.field1337, class250.field3068, class581.field8130);
            class659.field9342 = new class19(class98.field1337, class250.field3068, class493.field6500);
            class446.method2387(class301.field3700, class642.field9038, class631.field8846, class324.field4170, (byte) -108);
            class223.method1329((byte) 30, class488.field6460);
            class343.field4402 = new class232(class250.field3068, class572.field7994, class374.field4711);
            class428.field5360 = new class673(class250.field3068, class572.field7994, class374.field4711, new class241());
            class227.method1361((byte) 123);
            class428.field5352.method3144(1, !class301.field3698.method135(class651.field9191, 118));
            class684.field9606 = new class196();
            class309.method1785((byte) 56);
            class440.method2335(class224.field2809, (byte) 57);
            class679.method3824(class324.field4170, class651.field9183, -27984);
            class156 var20 = new class156(class590.field8283.method3345(62, "huffman", ""));
            class436.method2296(false, var20);
            try {
                jagmisc.init();
            } catch (Throwable var30) {
            }
            class39.field524 = class225.method1352(15902);
        }
        if (class347.field4449 == class203.field2582) {
            int var21 = class323.method1848(class631.field8846, 65280) + class34.method222(true, (byte) -15);
            int var22 = class468.method2473(-124) + class83.method475(94);
            if (var21 < var22) {
                return var21 * 100 / var22;
            }
        }
        int var23 = 32 / ((46 - arg0) / 51);
        if (class347.field4449 == class203.field2583) {
            class656.method3680(class381.field4806, class82.field1096, class583.field8147, class428.field5352, class556.field7727, class48.field671, class684.field9606);
        }
        if (class347.field4449 == class203.field2584) {
            client.field9541 = new String[class528.field7148.field5394];
            class412.field5150 = new int[class78.field1078.field5142];
            class287.field3574 = new boolean[class78.field1078.field5142];
            for (int var24 = 0; var24 < class78.field1078.field5142; var24++) {
                if (class78.field1078.method2176((byte) -128, var24).field9072 == 0) {
                    class287.field3574[var24] = true;
                    class388.field4892++;
                }
                class412.field5150[var24] = -1;
            }
            class91.method528((byte) -109);
            class680.field9563 = class642.field9038.method3341("loginscreen", 104);
            class42.field555 = class642.field9038.method3341("lobbyscreen", 100);
            class600.field8416.method3343(false, true, (byte) 101);
            class81.field1086.method3343(true, true, (byte) 72);
            class631.field8846.method3343(true, true, (byte) 83);
            class301.field3700.method3343(true, true, (byte) 126);
            class590.field8283.method3343(true, true, (byte) 50);
            class642.field9038.method3343(true, true, (byte) 79);
            class574.field8006 = true;
            class493.field6500.field8600 = 2;
            class622.field8709.field8600 = 2;
            class242.field3020.field8600 = 2;
            class415.field5188.field8600 = 2;
            class673.field9472.field8600 = 2;
            class105.field1411.field8600 = 2;
            class475.field6030.field8600 = 2;
        }
        if (class347.field4449 == class203.field2585) {
            if (!class525.method2860((byte) 80, class680.field9563)) {
                return 0;
            }
            for (int var25 = 0; var25 < class103.field1390[class680.field9563].length; var25++) {
                class507 var26 = class103.field1390[class680.field9563][var25];
                if (var26.field6735 == 5 && var26.field6783 != -1) {
                    var26.method2735(class32.field452, -91);
                }
            }
        }
        if (class347.field4449 == class203.field2586) {
            for (int var27 = 0; var27 < class103.field1390[class680.field9563].length; var27++) {
                class507 var28 = class103.field1390[class680.field9563][var27];
                if (var28.field6735 == 5 && var28.field6783 != -1 && var28.method2735(class32.field452, -116) == null && class22.field347) {
                    return 0;
                }
            }
        }
        if (class347.field4449 == class203.field2587) {
            class611.method3336(52, true);
        }
        if (class347.field4449 == class203.field2588) {
            class407.field5098.method672(24551);
            try {
                class44.field581.join();
            } catch (InterruptedException var29) {
                return 0;
            }
            class51.field772 = null;
            class407.field5098 = null;
            class44.field581 = null;
            class568.field7952 = null;
            class57.field812 = null;
            class676.field9498 = null;
            class610.method3332(0);
            class527.field7136 = class301.field3698.field6620;
            class301.field3698.field6620 = true;
            class301.field3698.method138(class590.field8289, (byte) 57);
            if (class527.field7136) {
                class393.method2111(0, true);
            } else {
                class393.method2111(class301.field3698.field6632, true);
            }
            class220.method1301(false, (byte) 126, -1, -1, class301.field3698.field6616);
            class608.method3321(8, class32.field452);
            class410.method2170(class32.field452, -27346);
            class111.method622(class631.field8846, class32.field452, 0);
            class130.method687(true, class677.field9502);
        }
        return class458.method2450(20666);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public static void method3931(int arg0) {
        field9902 = null;
        if (arg0 != 13834) {
            method3932(85, false);
        }
        field9903 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)Z")
    public static final boolean method3932(int arg0, boolean arg1) {
        field9892++;
        boolean var2 = class32.field452.method1006();
        int var3 = -50 % ((39 - arg0) / 48);
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class32.field452.method1089();
        } else if (!class32.field452.method1032()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class301.field3698.field6648 = arg1;
            class301.field3698.method138(class590.field8289, (byte) 78);
            return true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIILjava/lang/Class;)Lqda;")
    public static final class172 method3933(int arg0, int arg1, int arg2, Class arg3) {
        class75 var4 = class270.field3423[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class138 var5 = var4.field1024; var5 != null; var5 = var5.field1789) {
            class172 var6 = var5.field1786;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field2247 == arg1 && var6.field2243 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZIIZ)I")
    public static final int method3934(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field9897++;
        class492 var5 = class183.method1141(arg0, (byte) 68, arg3);
        if (!arg4) {
            return 86;
        } else if (var5 == null) {
            return 0;
        } else {
            int var6 = 0;
            for (int var7 = 0; var7 < var5.field6496.length; var7++) {
                if (var5.field6496[var7] >= 0 && var5.field6496[var7] < class633.field8881.field974) {
                    class3 var8 = class633.field8881.method434(12388, var5.field6496[var7]);
                    int var9 = var8.method18(arg2, class705.field9939.method2477((byte) 6, arg2).field2627, -82);
                    if (arg1) {
                        var6 += var5.field6495[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9895 = arg2;
        this.field9891 = (byte) arg8;
        this.field9894 = (short) arg5;
        this.field9890 = arg0;
        this.field9896 = arg11;
        this.field9901 = (short) arg4;
        this.field9893 = (short) arg6;
        this.field9899 = arg1;
        this.field9904 = arg3;
        this.field9898 = arg10;
    }
}
