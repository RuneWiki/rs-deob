import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class458 {

    @OriginalMember(owner = "client!np", name = "d", descriptor = "[Ltn;")
    public static class81[] field5710 = new class81[14];

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method2519(int arg0) {
        field5710 = null;
        if (arg0 != 2) {
            field5710 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Lww;")
    public static final class686 method2520(int arg0, int arg1) {
        field5707++;
        class285[] var2 = class694.field9611;
        synchronized (class694.field9611) {
            if (arg0 != 0) {
                method2520(-126, -106);
            }
            class686 var3;
            if (class694.field9611.length <= arg1 || class694.field9611[arg1].method1719((byte) 115)) {
                var3 = new class686();
                var3.field9361 = new class524[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field9361[var4] = new class524();
                }
            } else {
                var3 = (class686) class694.field9611[arg1].method1713((byte) 95);
                var3.method1619((byte) -76);
                int var10002 = class539.field6804[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
    public static final void method2521(byte arg0) {
        class545.method2919((byte) 24, false);
        if (arg0 < 122) {
            method2519(64);
        }
        field5708++;
        class592.field7948 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class552.field6912.length; var2++) {
            if (class576.field7563[var2] != -1 && class552.field6912[var2] == null) {
                class552.field6912[var2] = class109.field1364.method1659(-91, 0, class576.field7563[var2]);
                if (class552.field6912[var2] == null) {
                    class592.field7948++;
                    var1 = false;
                }
            }
            if (class269.field3416[var2] != -1 && class523.field6614[var2] == null) {
                class523.field6614[var2] = class109.field1364.method1670(0, class269.field3416[var2], -2, class589.field7901[var2]);
                if (class523.field6614[var2] == null) {
                    var1 = false;
                    class592.field7948++;
                }
            }
            if (class14.field139[var2] != -1 && class340.field4340[var2] == null) {
                class340.field4340[var2] = class109.field1364.method1659(-53, 0, class14.field139[var2]);
                if (class340.field4340[var2] == null) {
                    var1 = false;
                    class592.field7948++;
                }
            }
            if (class657.field8938[var2] != -1 && class418.field5342[var2] == null) {
                class418.field5342[var2] = class109.field1364.method1659(0, 0, class657.field8938[var2]);
                if (class418.field5342[var2] == null) {
                    var1 = false;
                    class592.field7948++;
                }
            }
            if (class599.field8032 != null && class257.field3289[var2] == null && class599.field8032[var2] != -1) {
                class257.field3289[var2] = class109.field1364.method1670(0, class599.field8032[var2], -2, class589.field7901[var2]);
                if (class257.field3289[var2] == null) {
                    var1 = false;
                    class592.field7948++;
                }
            }
        }
        if (class469.field5796 == null) {
            if (class496.field6205 == null || !class682.field9284.method1661(class496.field6205.field5857 + "_staticelements", false)) {
                class469.field5796 = new class489(0);
            } else if (class682.field9284.method1640(-21656, class496.field6205.field5857 + "_staticelements")) {
                class469.field5796 = class7.method22(class682.field9284, 0, class496.field6205.field5857 + "_staticelements", class196.field2308);
            } else {
                class592.field7948++;
                var1 = false;
            }
        }
        if (!var1) {
            class343.field4370 = 1;
            return;
        }
        boolean var3 = true;
        class40.field577 = 0;
        for (int var4 = 0; var4 < class552.field6912.length; var4++) {
            byte[] var21 = class523.field6614[var4];
            if (var21 != null) {
                int var22 = (class307.field3888[var4] >> 8) * 64 - class227.field2938;
                int var23 = (class307.field3888[var4] & 0xFF) * 64 - class522.field6612;
                if (class442.field5572 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class633.method3551(class656.field8932, class85.field1090, var22, -30586100, var23, var21);
            }
            byte[] var24 = class418.field5342[var4];
            if (var24 != null) {
                int var25 = (class307.field3888[var4] >> 8) * 64 - class227.field2938;
                int var26 = (class307.field3888[var4] & 0xFF) * 64 - class522.field6612;
                if (class442.field5572 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class633.method3551(class656.field8932, class85.field1090, var25, -30586100, var26, var24);
            }
        }
        if (!var3) {
            class343.field4370 = 2;
            return;
        }
        if (class343.field4370 != 0) {
            class340.method1951(class671.field9126.method3726((byte) 78, class71.field912) + "<br>(100%)", class321.field3994, -102, class616.field8348, class309.field3898, true);
        }
        class428.method2354(-6331);
        class373.method2160(true);
        boolean var5 = false;
        if (class309.field3898.method481() && class611.field8310.field8698) {
            for (int var6 = 0; var6 < class552.field6912.length; var6++) {
                if (class418.field5342[var6] != null || class340.field4340[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class611.field8310.field8700) {
            var7 = class60.field758[class570.field7217];
        } else {
            var7 = class15.field145[class570.field7217];
        }
        if (class309.field3898.method488()) {
            var7++;
        }
        class45.method278(9, 4, class85.field1090, class656.field8932, var7, var5, class309.field3898.method430() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class634.field8601[var8].method979(13292);
        }
        class325.method1872((byte) 109);
        class388.method2220(false, false);
        class195.method1146((byte) -116);
        class431.field5437 = false;
        class613.field8337 = null;
        class428.method2354(-6331);
        System.gc();
        class545.method2919((byte) 24, true);
        class644.method3603(2048);
        class292.field3687 = class611.field8310.method3598(-15929, class628.field8526);
        class348.field4467 = class357.field4610 >= 96;
        class337.field4308 = class611.field8310.field8698;
        class639.field8664 = class611.field8310.method3593(class628.field8526, (byte) -127);
        class654.field8910 = !class611.field8310.field8709;
        class596.field7997 = class611.field8310.method2744(class628.field8526, 4) ? -1 : class518.field6552;
        class558.field6975 = class22.method147(-14787, class628.field8526) || class611.field8310.field8717;
        class633.field8576 = class611.field8310.field8685;
        class639.field8665 = new class586(4, class85.field1090, class656.field8932, false);
        if (class442.field5572 == 0) {
            class227.method1371(class552.field6912, (byte) -66, class639.field8665);
        } else {
            class438.method2409(class639.field8665, class552.field6912, 0);
        }
        class436.method2399(class656.field8932 >> 4, -122, class85.field1090 >> 4);
        class82.method627(114);
        if (var5) {
            class689.method3809(true);
            class479.field5964 = new class586(1, class85.field1090, class656.field8932, true);
            if (class442.field5572 == 0) {
                class227.method1371(class340.field4340, (byte) -66, class479.field5964);
                class545.method2919((byte) 24, true);
            } else {
                class438.method2409(class479.field5964, class340.field4340, 0);
                class545.method2919((byte) 24, true);
            }
            class479.field5964.method1114(0, class639.field8665.field2232[0], 0);
            class479.field5964.method1118(null, (byte) -81, null, class309.field3898);
            class689.method3809(false);
        }
        class639.field8665.method1118(var5 ? class479.field5964.field2232 : null, (byte) -81, class634.field8601, class309.field3898);
        if (class442.field5572 == 0) {
            class545.method2919((byte) 24, true);
            class484.method2634(class523.field6614, 0, class639.field8665);
            if (class257.field3289 != null) {
                class594.method3283(-120);
            }
        } else {
            class545.method2919((byte) 24, true);
            class76.method602(94, class639.field8665, class523.field6614);
        }
        class373.method2160(true);
        if (class357.field4610 < 96) {
            class250.method1500(1);
        }
        class545.method2919((byte) 24, true);
        class639.field8665.method1119(class309.field3898, (byte) 96, null, var5 ? class286.field3633[0] : null);
        class639.field8665.method3255((byte) -128, class309.field3898);
        class545.method2919((byte) 24, true);
        if (var5) {
            class689.method3809(true);
            class545.method2919((byte) 24, true);
            if (class442.field5572 == 0) {
                class484.method2634(class418.field5342, 0, class479.field5964);
            } else {
                class76.method602(126, class479.field5964, class418.field5342);
            }
            class373.method2160(true);
            class545.method2919((byte) 24, true);
            class479.field5964.method1119(class309.field3898, (byte) 104, class252.field3250[0], null);
            class479.field5964.method3255((byte) -127, class309.field3898);
            class545.method2919((byte) 24, true);
            class689.method3809(false);
        }
        class683.method3778(false);
        int var9 = class639.field8665.field7869;
        if (class675.field9219 < var9) {
            var9 = class675.field9219;
        }
        if (class675.field9219 - 1 > var9) {
            var9 = class675.field9219 - 1;
        }
        if (class611.field8310.method2744(class628.field8526, 4)) {
            class190.method1127(0);
        } else {
            class190.method1127(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class85.field1090; var19++) {
                for (int var20 = 0; var20 < class656.field8932; var20++) {
                    class391.method2224((byte) -121, var20, var19, var10);
                }
            }
        }
        class89.method669((byte) -38);
        class428.method2354(-6331);
        class157.method959(0);
        class373.method2160(true);
        class497.method2711((byte) -114);
        if (class338.field4326 != null && class335.field4139 != null && class470.field5804 == 11) {
            class343.field4369++;
            class124 var11 = class336.method1924(class509.field6373, class636.field8620, (byte) 102);
            var11.field1516.method3061(1057001181, (byte) 115);
            class197.method1156((byte) 112, var11);
        }
        if (class442.field5572 == 0) {
            int var12 = (class563.field7027 - (class85.field1090 >> 4)) / 8;
            int var13 = ((class85.field1090 >> 4) + class563.field7027) / 8;
            int var14 = (class677.field9229 - (class656.field8932 >> 4)) / 8;
            int var15 = ((class656.field8932 >> 4) + class677.field9229) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                    if (var16 < var12 || var13 < var16 || var17 < var14 || var15 < var17) {
                        class109.field1364.method1668(-1, "m" + var16 + "_" + var17);
                        class109.field1364.method1668(-1, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class470.field5804 == 4) {
            class78.method609(10503, 3);
        } else if (class470.field5804 == 8) {
            class78.method609(10503, 7);
        } else {
            class78.method609(10503, 10);
            if (class335.field4139 != null) {
                class124 var18 = class336.method1924(class697.field9674, class636.field8620, (byte) -15);
                class197.method1156((byte) 109, var18);
            }
        }
        class304.method1812(-1);
        class428.method2354(-6331);
        class422.method2337(-28508);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IZIIII)V")
    public static final void method2522(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field5711++;
        if (class407.field5237 == null) {
            class309.field3898.method3630((byte) -103, arg5, arg3, arg4, -16777216, arg0);
        } else if (class67.field815.field8018 >= 0 && (class85.field1090 * 512) > class67.field815.field8018 && class67.field815.field8011 >= 0 && (class656.field8932 * 512) > class67.field815.field8011) {
            class197.field2318++;
            if (class67.field815 != null && (class67.field815.field8018 - (class67.field815.method210(false) - 1) * 256 >> 9) == class295.field3763 && class67.field815.field8011 - (class67.field815.method210(false) - 1) * 256 >> 9 == class536.field6752) {
                class295.field3763 = -1;
                class536.field6752 = -1;
                class706.method3896(arg2 ^ 0xFFFFE5AC);
            }
            class236.method1426((byte) -82);
            if (!arg1) {
                class571.method3025((byte) 84);
            }
            class333.method1905((byte) -124);
            if (arg2 == -6739) {
                class131.method849(arg5, arg4, arg0, 29967, true, arg3);
                int var6 = class556.field6955;
                int var7 = class509.field6376;
                int var8 = class356.field4595;
                int var9 = class469.field5799;
                if (class385.field4946 == 1) {
                    int var10 = (int) class23.field266;
                    if (var10 < (class300.field3817 >> 8)) {
                        var10 = class300.field3817 >> 8;
                    }
                    if (class642.field8705[4] && class491.field6123[4] + 128 > var10) {
                        var10 = class491.field6123[4] + 128;
                    }
                    int var11 = (int) class689.field9561 + class491.field6125 & 0x3FFF;
                    class436.method2400(0, class514.method2798(class67.field815.field8011, class67.field815.field8018, class675.field9219, (byte) 40) - 200, var8, ((var10 >> 3) * 3) + 600 << 2, var10, class305.field3862, class415.field5323, var11);
                } else if (class385.field4946 == 4) {
                    int var12 = (int) class23.field266;
                    if (var12 < class300.field3817 >> 8) {
                        var12 = class300.field3817 >> 8;
                    }
                    if (class642.field8705[4] && var12 < (class491.field6123[4] + 128)) {
                        var12 = class491.field6123[4] + 128;
                    }
                    int var13 = (int) class689.field9561 & 0x3FFF;
                    class436.method2400(arg2 ^ 0xFFFFE5AD, class514.method2798(class576.field7580, class702.field9824, class675.field9219, (byte) 50) - 200, var8, (var12 >> 3) * 3 + 600 << 2, var12, class305.field3862, class415.field5323, var13);
                } else if (class385.field4946 == 5) {
                    class242.method1448(-24377, var8);
                }
                int var14 = class238.field3071;
                int var15 = class455.field5688;
                int var16 = class710.field9924;
                int var17 = client.field3568;
                int var18 = class177.field2068;
                for (int var19 = 0; var19 < 5; var19++) {
                    if (class642.field8705[var19]) {
                        int var22 = (int) (Math.random() * (double) (class588.field7896[var19] * 2 + 1) + Math.sin((double) class25.field286[var19] / 100.0D * (double) class47.field633[var19]) * (double) class491.field6123[var19] - (double) class588.field7896[var19]);
                        if (var19 == 2) {
                            class710.field9924 += var22 << 2;
                        }
                        if (var19 == 3) {
                            class177.field2068 = class177.field2068 + var22 & 0x3FFF;
                        }
                        if (var19 == 0) {
                            class238.field3071 += var22 << 2;
                        }
                        if (var19 == 1) {
                            class455.field5688 += var22 << 2;
                        }
                        if (var19 == 4) {
                            client.field3568 += var22;
                            if (client.field3568 < 1024) {
                                client.field3568 = 1024;
                            } else if (client.field3568 > 3072) {
                                client.field3568 = 3072;
                            }
                        }
                    }
                }
                if (class238.field3071 < 0) {
                    class238.field3071 = 0;
                }
                if ((class546.field6871 << 9) - 1 < class238.field3071) {
                    class238.field3071 = (class546.field6871 << 9) - 1;
                }
                if (class710.field9924 < 0) {
                    class710.field9924 = 0;
                }
                if ((class36.field538 << 9) - 1 < class710.field9924) {
                    class710.field9924 = (class36.field538 << 9) - 1;
                }
                class162.method995((byte) -85);
                class82.method627(arg2 + 6801);
                class309.field3898.method403(var7, var6, var7 + var9, var6 + var8);
                class309.field3898.method322();
                int var20 = class16.field161;
                if (class613.field8337 == null) {
                    class309.field3898.method315(var20);
                } else {
                    class613.field8337.method791(var7, var6, (byte) 124, var9, class177.field2068, var8, class289.field3654 << 3, class309.field3898, client.field3568, var20);
                }
                class428.method2354(-6331);
                class142.field1735.method581(class238.field3071, class455.field5688, class710.field9924, -client.field3568 & 0x3FFF, -class177.field2068 & 0x3FFF, -class613.field8340 & 0x3FFF);
                class309.field3898.method490(class142.field1735);
                class309.field3898.method450(var9 / 2 + var7, var8 / 2 + var6, class100.field1293 << 1, class100.field1293 << 1);
                class201.method1166(class100.field1293 << 1, var8 / 2 + var6, (byte) 119, var9 / 2 + var7, class100.field1293 << 1);
                class433.method2379(-class613.field8340 & 0x3FFF, class710.field9924, -class177.field2068 & 0x3FFF, class455.field5688, class238.field3071, -client.field3568 & 0x3FFF, arg2 + 22867);
                byte var21 = class611.field8310.method2746(105, class628.field8526) == 2 ? (byte) class197.field2318 : 1;
                class224.method1363(class309.field3898, class665.field9027, class201.field2346, class142.field1735, class238.field3071, class455.field5688, class710.field9924, class252.field3249, class478.field5956, class711.field9936, class102.field1311, class228.field2948, class245.field3161, class67.field815.field8010 + 1, var21, class67.field815.field8018 >> 9, class67.field815.field8011 >> 9, !class611.field8310.field8699);
                class428.method2354(-6331);
                if (class470.field5804 == 10) {
                    class473.method2569(var8, var6, var7, 256, arg2 ^ 0x3657, var9, 256);
                    class422.method2335(var9, var6, 256, var7, var8, 0, 256);
                    class482.method2626(var8, var9, var7, -12, var6, 256, 256);
                    class638.method3585(var6, var7, true, var8, var9);
                }
                class505.method2757();
                client.field3568 = var17;
                class455.field5688 = var15;
                class238.field3071 = var14;
                class177.field2068 = var18;
                class710.field9924 = var16;
                if (class432.field5453 && class167.field1965.method692(0) == 0) {
                    class432.field5453 = false;
                }
                if (class432.field5453) {
                    class309.field3898.method3630((byte) -109, var9, var6, var7, -16777216, var8);
                    class340.method1951(class671.field9126.method3726((byte) 57, class71.field912), class321.field3994, -101, class616.field8348, class309.field3898, false);
                }
            }
        } else {
            class309.field3898.method3630((byte) 120, arg5, arg3, arg4, -16777216, arg0);
        }
    }
}
