import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 {

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Z")
    public static boolean field878 = true;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[Z")
    public static boolean[] field879 = new boolean[100];

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Ltd;")
    private static class136 field886 = class145.method1172("and choose the (Wcreate account(W", 45);

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Lke;")
    public static class74 field894 = null;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field880 = -1;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Ltd;")
    private static class136 field896 = class145.method1172("button near the top of that page)3", 45);

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Ltd;")
    public static class136 field888 = field896;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[I")
    public static int[] field891 = new int[5];

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Ltd;")
    public static class136 field882 = field886;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Ltd;")
    private static class136 field877 = class145.method1172("Loaded textures", 45);

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Ltd;")
    public static class136 field885 = field877;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lta;")
    public static final class133 method321(int arg0, int arg1) {
        field887++;
        class133 var2 = (class133) class155.field3569.method1162((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        class133 var3 = class140.method1138(arg0, class73.field1543, false, 32127, class59.field1283);
        if (arg1 != 500) {
            field882 = null;
        }
        if (var3 != null) {
            class155.field3569.method1164((long) arg0, var3, (byte) 127);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)I")
    public static final int method322(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        field898++;
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return (arg3 / arg0 << 10) + (arg1 / 32 << 7) + arg2 / 2;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lpd;BLaf;I)V")
    public static final void method323(class108 arg0, byte arg1, class7 arg2, int arg3) {
        field900++;
        class93 var4 = new class93();
        var4.field2177 = arg2;
        var4.field2090 = arg3;
        var4.field2186 = arg0;
        var4.field2192 = 1;
        class69 var5 = class147.field3383;
        synchronized (class147.field3383) {
            class147.field3383.method509(1, var4);
            if (arg1 < 33) {
                method326(null, null, true);
            }
        }
        class139.method1134((byte) 4);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static final void method324(int arg0) {
        if (arg0 != -1) {
            method326(null, null, true);
        }
        class143.field3315.method1165((byte) -73);
        field897++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static final void method325(byte arg0) {
        field899++;
        if (class51.field1141 == 0) {
            class146.field3366 = new class97(4, 104, 104, class78.field1804);
            for (int var1 = 0; var1 < 4; var1++) {
                class4.field83[var1] = new class83(104, 104);
            }
            class124.field2886 = new class10(512, 512);
            class51.field1141 = 20;
            class75.field1695 = 5;
            class81.field1910 = class16.field327;
        } else if (class51.field1141 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 143;
                int var5 = class103.field2456[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class97.method741(var2, 500, 800, 512, 334);
            class51.field1141 = 30;
            class81.field1910 = class77.field1736;
            class75.field1695 = 10;
        } else if (class51.field1141 == 30) {
            class146.field3370 = class116.method920(false, (byte) -89, true, 0, true);
            class56.field1278 = class116.method920(false, (byte) -89, true, 1, true);
            class122.field2851 = class116.method920(true, (byte) -89, false, 2, true);
            class31.field683 = class116.method920(false, (byte) -89, true, 3, true);
            class147.field3413 = class116.method920(false, (byte) -89, true, 4, true);
            class122.field2844 = class116.method920(true, (byte) -89, true, 5, true);
            class39.field921 = class116.method920(true, (byte) -89, true, 6, false);
            class121.field2757 = class116.method920(false, (byte) -89, true, 7, true);
            class143.field3328 = class116.method920(false, (byte) -89, true, 8, true);
            class108.field2537 = class116.method920(false, (byte) -89, true, 9, true);
            class133.field3142 = class116.method920(false, (byte) -89, true, 10, true);
            class28.field625 = class116.method920(false, (byte) -89, true, 11, true);
            class47.field1077 = class116.method920(false, (byte) -89, true, 12, true);
            class141.field3281 = class116.method920(true, (byte) -89, false, 13, true);
            class80.field1891 = class116.method920(false, (byte) -89, true, 14, false);
            class62.field1319 = class116.method920(false, (byte) -89, true, 15, true);
            class51.field1141 = 40;
            class81.field1910 = class43.field1008;
            class75.field1695 = 20;
        } else if (class51.field1141 == 40) {
            byte var7 = 0;
            int var8 = var7 + class146.field3370.method856((byte) -122) * 4 / 100;
            int var9 = var8 + class56.field1278.method856((byte) -104) * 4 / 100;
            int var10 = var9 + class122.field2851.method856((byte) -99) * 2 / 100;
            int var11 = var10 + class31.field683.method856((byte) -120) * 2 / 100;
            int var12 = var11 + class147.field3413.method856((byte) -74) * 6 / 100;
            int var13 = var12 + class122.field2844.method856((byte) -71) * 4 / 100;
            int var14 = var13 + class39.field921.method856((byte) -120) * 2 / 100;
            int var15 = var14 + class121.field2757.method856((byte) -73) * 60 / 100;
            int var16 = var15 + class143.field3328.method856((byte) -69) * 2 / 100;
            int var17 = var16 + class108.field2537.method856((byte) -99) * 2 / 100;
            int var18 = var17 + class133.field3142.method856((byte) -71) * 2 / 100;
            int var19 = var18 + class28.field625.method856((byte) -102) * 2 / 100;
            int var20 = var19 + class47.field1077.method856((byte) -92) * 2 / 100;
            int var21 = var20 + class141.field3281.method856((byte) -103) * 2 / 100;
            int var22 = var21 + class80.field1891.method856((byte) -103) * 2 / 100;
            int var23 = var22 + class62.field1319.method856((byte) -123) * 2 / 100;
            if (var23 == 100) {
                class51.field1141 = 45;
                class75.field1695 = 30;
                class81.field1910 = class27.field594;
            } else {
                if (var23 != 0) {
                    class81.field1910 = class79.method570(0, new class136[] { class54.field1208, class19.method140(var23, -116), class116.field2665 });
                }
                class75.field1695 = 30;
            }
        } else if (arg0 <= -121) {
            if (class51.field1141 == 45) {
                class141.method1151(!class65.field1399, (byte) 92, 22050, 2);
                class80 var24 = new class80();
                var24.method575(9, 128, (byte) -107);
                class71.field1506 = class55.method439(16384, 22050, 0, class14.field279, class44.field1010);
                class71.field1506.method260(var24, (byte) 113);
                class79.method567((byte) -117, class80.field1891, class147.field3413, class62.field1319, var24);
                class21.field419 = class55.method439(16384, 2048, 1, class14.field279, class44.field1010);
                class55.field1228 = new class98();
                class21.field419.method260(class55.field1228, (byte) 113);
                class88.field2080 = new class104(22050, class5.field89);
                class51.field1141 = 50;
                class75.field1695 = 35;
                class81.field1910 = class29.field650;
            } else if (class51.field1141 == 50) {
                int var25 = 0;
                if (class87.field2039 == null) {
                    class87.field2039 = class64.method482(class143.field3328, class76.field1710, class37.field871, true);
                } else {
                    var25++;
                }
                if (class100.field2413 == null) {
                    class100.field2413 = class64.method482(class143.field3328, class62.field1329, class37.field871, true);
                } else {
                    var25++;
                }
                if (class81.field1943 == null) {
                    class81.field1943 = class64.method482(class143.field3328, class94.field2204, class37.field871, true);
                } else {
                    var25++;
                }
                if (var25 < 3) {
                    class81.field1910 = class79.method570(0, new class136[] { class106.field2510, class19.method140(var25 * 100 / 3, -127), class116.field2665 });
                    class75.field1695 = 40;
                } else {
                    class75.field1695 = 40;
                    class51.field1141 = 60;
                    class81.field1910 = class16.field332;
                }
            } else if (class51.field1141 == 60) {
                int var26 = class65.method488(class133.field3142, 3, class143.field3328);
                int var27 = class26.method228(6);
                if (var26 < var27) {
                    class81.field1910 = class79.method570(0, new class136[] { class139.field3228, class19.method140(var26 * 100 / var27, -102), class116.field2665 });
                    class75.field1695 = 50;
                } else {
                    class75.field1695 = 50;
                    class81.field1910 = class124.field2882;
                    class73.method534((byte) 73, 5);
                    class51.field1141 = 70;
                }
            } else if (class51.field1141 == 70) {
                if (class122.field2851.method652(3)) {
                    class106.method845(67, class122.field2851);
                    class119.method931(256, class122.field2851);
                    class116.method922(class122.field2851, class121.field2757, 16057);
                    class3.method19((byte) 26, class121.field2757, class122.field2851, class65.field1399);
                    method326(class122.field2851, class121.field2757, false);
                    class80.method581(class87.field2039, -28221, class146.field3378, class122.field2851, class121.field2757);
                    class118.method927(class146.field3370, class122.field2851, 111, class56.field1278);
                    class4.method26(class122.field2851, (byte) -103, class121.field2757);
                    class84.method628(class122.field2851, 121);
                    class71.method529(64, class122.field2851);
                    class133.method1073(class143.field3328, class31.field683, (byte) 64, class121.field2757);
                    class9.method44(14104, class122.field2851);
                    class14.method102(class122.field2851, (byte) 65);
                    class81.field1910 = class31.field725;
                    class75.field1695 = 60;
                    class51.field1141 = 80;
                } else {
                    class81.field1910 = class79.method570(0, new class136[] { class75.field1697, class19.method140(class122.field2851.method855((byte) -21), -86), class116.field2665 });
                    class75.field1695 = 60;
                }
            } else if (class51.field1141 == 80) {
                int var28 = 0;
                if (class73.field1530 == null) {
                    class73.field1530 = class104.method838(class121.field2813, class143.field3328, class37.field871, -106);
                } else {
                    var28++;
                }
                if (class119.field2716 == null) {
                    class119.field2716 = class104.method838(class151.field3455, class143.field3328, class37.field871, -96);
                } else {
                    var28++;
                }
                if (class136.field3207 == null) {
                    class136.field3207 = class31.method274(class110.field2593, class143.field3328, class37.field871, (byte) -113);
                } else {
                    var28++;
                }
                if (class113.field2621 == null) {
                    class113.field2621 = class43.method348(class143.field3328, 1674879824, class37.field871, class24.field578);
                } else {
                    var28++;
                }
                if (class93.field2195 == null) {
                    class93.field2195 = class43.method348(class143.field3328, 1674879824, class37.field871, class146.field3368);
                } else {
                    var28++;
                }
                if (class101.field2424 == null) {
                    class101.field2424 = class43.method348(class143.field3328, 1674879824, class37.field871, class81.field1923);
                } else {
                    var28++;
                }
                if (class142.field3304 == null) {
                    class142.field3304 = class43.method348(class143.field3328, 1674879824, class37.field871, class124.field2885);
                } else {
                    var28++;
                }
                if (class149.field3427 == null) {
                    class149.field3427 = class43.method348(class143.field3328, 1674879824, class37.field871, class124.field2888);
                } else {
                    var28++;
                }
                if (class84.field1985 == null) {
                    class84.field1985 = class43.method348(class143.field3328, 1674879824, class37.field871, class4.field81);
                } else {
                    var28++;
                }
                if (class113.field2623 == null) {
                    class113.field2623 = class43.method348(class143.field3328, 1674879824, class37.field871, class12.field223);
                } else {
                    var28++;
                }
                if (class88.field2084 == null) {
                    class88.field2084 = class43.method348(class143.field3328, 1674879824, class37.field871, class113.field2626);
                } else {
                    var28++;
                }
                if (class40.field934 == null) {
                    class40.field934 = class31.method274(class14.field280, class143.field3328, class37.field871, (byte) -113);
                } else {
                    var28++;
                }
                if (class2.field45 == null) {
                    class2.field45 = class31.method274(class70.field1474, class143.field3328, class37.field871, (byte) -113);
                } else {
                    var28++;
                }
                if (class35.field806 == null) {
                    class35.field806 = class155.method1215(class37.field871, client.field461, -125, class143.field3328);
                } else {
                    var28++;
                }
                if (var28 < 14) {
                    class81.field1910 = class79.method570(0, new class136[] { class91.field2162, class19.method140(var28 * 100 / 14, -104), class116.field2665 });
                    class75.field1695 = 70;
                } else {
                    class95.field2229 = class2.field45;
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    int var30 = (int) (Math.random() * 21.0D) - 10;
                    class119.field2716.method71();
                    int var31 = (int) (Math.random() * 21.0D) - 10;
                    int var32 = (int) (Math.random() * 41.0D) - 20;
                    for (int var33 = 0; var33 < class113.field2621.length; var33++) {
                        class113.field2621[var33].method70(var29 + var32, var31 + var32, var30 + var32);
                    }
                    class136.field3207[0].method690(var29 + var32, var31 + var32, var30 + var32);
                    class152.method1199(25);
                    class51.field1141 = 90;
                    class81.field1910 = class67.field1424;
                    class75.field1695 = 70;
                }
            } else if (class51.field1141 == 90) {
                if (class108.field2537.method652(3)) {
                    class2 var34 = new class2(class108.field2537, class143.field3328, 20, 0.8D, class65.field1399 ? 64 : 128);
                    class103.method822(var34);
                    class103.method820(0.8D);
                    class81.field1910 = field885;
                    class51.field1141 = 110;
                    class75.field1695 = 90;
                } else {
                    class81.field1910 = class79.method570(0, new class136[] { class73.field1516, class19.method140(class108.field2537.method855((byte) -21), -123), class116.field2665 });
                    class75.field1695 = 90;
                }
            } else if (class51.field1141 == 110) {
                class73.field1522 = new class141();
                class44.field1010.method185(0, class73.field1522, 10);
                class51.field1141 = 120;
                class81.field1910 = class54.field1202;
                class75.field1695 = 94;
            } else if (class51.field1141 == 120) {
                if (class133.field3142.method663(class18.field353, class37.field871, (byte) 13)) {
                    class37 var35 = new class37(class133.field3142.method658(-10907, class18.field353, class37.field871));
                    class37.method314(233, var35);
                    class81.field1910 = class11.field187;
                    class75.field1695 = 96;
                    class51.field1141 = 130;
                } else {
                    class81.field1910 = class79.method570(0, new class136[] { class135.field3156, class1.field2 });
                    class75.field1695 = 96;
                }
            } else if (class51.field1141 == 130) {
                if (!class31.field683.method652(3)) {
                    class81.field1910 = class79.method570(0, new class136[] { class99.field2390, class19.method140(class31.field683.method855((byte) -21) * 4 / 5, -119), class116.field2665 });
                    class75.field1695 = 100;
                } else if (!class47.field1077.method652(3)) {
                    class81.field1910 = class79.method570(0, new class136[] { class99.field2390, class19.method140(class47.field1077.method855((byte) -21) / 6 + 80, -91), class116.field2665 });
                    class75.field1695 = 100;
                } else if (class141.field3281.method652(3)) {
                    class81.field1910 = class21.field418;
                    class75.field1695 = 100;
                    class51.field1141 = 140;
                } else {
                    class81.field1910 = class79.method570(0, new class136[] { class99.field2390, class19.method140(class141.field3281.method855((byte) -21) / 20 + 96, -112), class116.field2665 });
                    class75.field1695 = 100;
                }
            } else if (class51.field1141 == 140) {
                class73.method534((byte) 73, 10);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lmd;Lmd;Z)V")
    private static final void method326(class87 arg0, class87 arg1, boolean arg2) {
        client.field439 = arg0;
        class96.field2265 = arg1;
        field890++;
        if (arg2) {
            method322(79, 1, -107, -120);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static void method327(int arg0) {
        field882 = null;
        if (arg0 != 18862) {
            method325((byte) -53);
        }
        field896 = null;
        field879 = null;
        field894 = null;
        field885 = null;
        field886 = null;
        field891 = null;
        field888 = null;
        field877 = null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class38() {
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lfb;)V")
    public class38(class38 arg0) {
        this.field881 = arg0.field881;
        this.field883 = arg0.field883;
        this.field884 = arg0.field884;
        this.field895 = arg0.field895;
    }
}
