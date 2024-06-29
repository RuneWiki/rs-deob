import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class113 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[[I")
    public static int[][] field2518 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field2522 = 127;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lea;")
    private static class38 field2514 = class9.method46((byte) 116, "headicons_prayer");

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field2521 = 0;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "[I")
    public static int[] field2526 = new int[100];

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field2524 = 0;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lea;")
    public static class38 field2527 = class9.method46((byte) 120, "<col=ff3000>");

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lod;")
    public static class129 field2523;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lfd;")
    public static class50 field2515;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static final void method891(int arg0) {
        field2520++;
        if (client.field533 == 0) {
            class101.field2268 = new class157(4, 104, 104, class154.field3209);
            for (int var1 = 0; var1 < 4; var1++) {
                class160.field3337[var1] = new class54(104, 104);
            }
            class100.field2237 = new class89(512, 512);
            client.field533 = 20;
            class163.field3380 = 5;
            class187.field3721 = class54.field1378;
        } else if (client.field533 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = class93.field2091[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class157.method1133(var2, 500, 800, 512, 334);
            class187.field3721 = class165.field3420;
            class163.field3380 = 10;
            client.field533 = 30;
        } else {
            if (arg0 != 600) {
                field2518 = null;
            }
            if (client.field533 == 30) {
                class161.field3350 = class112.method889(true, true, 0, (byte) 121, false);
                class161.field3345 = class112.method889(true, true, 1, (byte) 20, false);
                class30.field597 = class112.method889(false, true, 2, (byte) 116, true);
                class80.field1892 = class112.method889(true, true, 3, (byte) 27, false);
                class14.field303 = class112.method889(true, true, 4, (byte) 37, false);
                class46.field1124 = class112.method889(true, true, 5, (byte) 70, true);
                class133.field2815 = class112.method889(true, false, 6, (byte) 20, true);
                class73.field1785 = class112.method889(true, true, 7, (byte) 33, false);
                class146.field3049 = class112.method889(true, true, 8, (byte) 90, false);
                class28.field550 = class112.method889(false, true, 9, (byte) 108, true);
                class124.field2673 = class112.method889(true, true, 10, (byte) 103, false);
                class96.field2150 = class112.method889(true, true, 11, (byte) 45, false);
                class188.field3754 = class112.method889(true, true, 12, (byte) 103, false);
                class16.field336 = class112.method889(false, true, 13, (byte) 110, true);
                class169.field3478 = class112.method889(true, false, 14, (byte) 25, false);
                class123.field2630 = class112.method889(true, true, 15, (byte) 73, false);
                client.field533 = 40;
                class163.field3380 = 20;
                class187.field3721 = class38.field834;
            } else if (client.field533 == 40) {
                byte var7 = 0;
                int var8 = var7 + class161.field3350.method940((byte) 85) * 4 / 100;
                int var9 = var8 + class161.field3345.method940((byte) 60) * 4 / 100;
                int var10 = var9 + class30.field597.method940((byte) 51) * 2 / 100;
                int var11 = var10 + class80.field1892.method940((byte) 118) * 2 / 100;
                int var12 = var11 + class14.field303.method940((byte) 112) * 6 / 100;
                int var13 = var12 + class46.field1124.method940((byte) 99) * 4 / 100;
                int var14 = var13 + class133.field2815.method940((byte) 92) * 2 / 100;
                int var15 = var14 + class73.field1785.method940((byte) 94) * 60 / 100;
                int var16 = var15 + class146.field3049.method940((byte) 48) * 2 / 100;
                int var17 = var16 + class28.field550.method940((byte) 96) * 2 / 100;
                int var18 = var17 + class124.field2673.method940((byte) 119) * 2 / 100;
                int var19 = var18 + class96.field2150.method940((byte) 57) * 2 / 100;
                int var20 = var19 + class188.field3754.method940((byte) 48) * 2 / 100;
                int var21 = var20 + class16.field336.method940((byte) 85) * 2 / 100;
                int var22 = var21 + class169.field3478.method940((byte) 70) * 2 / 100;
                int var23 = var22 + class123.field2630.method940((byte) 66) * 2 / 100;
                if (var23 == 100) {
                    class187.field3721 = class112.field2513;
                    client.field533 = 45;
                    class163.field3380 = 30;
                } else {
                    if (var23 != 0) {
                        class187.field3721 = class163.method1168(-98, new class38[] { class34.field720, class151.method1059(var23, (byte) -114), class12.field270 });
                    }
                    class163.field3380 = 30;
                }
            } else if (client.field533 == 45) {
                class122.method920(!class31.field610, 2, 22050, (byte) 59);
                class67 var24 = new class67();
                var24.method530(9, 128, 109);
                class202.field3991 = class41.method309(class51.field1313, class186.field3708, 22050, -1, 0);
                class202.field3991.method442(0, var24);
                class12.method70(class14.field303, class169.field3478, var24, 7201, class123.field2630);
                class52.field1339 = class41.method309(class51.field1313, class186.field3708, 2048, -1, 1);
                class3.field100 = new class64();
                class52.field1339.method442(0, class3.field100);
                class199.field3931 = new class75(22050, class87.field2030);
                class163.field3380 = 35;
                class187.field3721 = class53.field1360;
                client.field533 = 50;
            } else if (client.field533 == 50) {
                int var25 = 0;
                if (class14.field289 == null) {
                    class14.field289 = class56.method417(class137.field2881, class16.field336, class70.field1731, (byte) 121, class146.field3049);
                } else {
                    var25++;
                }
                if (class41.field914 == null) {
                    class41.field914 = class56.method417(class25.field516, class16.field336, class70.field1731, (byte) 120, class146.field3049);
                } else {
                    var25++;
                }
                if (class33.field686 == null) {
                    class33.field686 = class56.method417(class112.field2502, class16.field336, class70.field1731, (byte) 114, class146.field3049);
                } else {
                    var25++;
                }
                if (var25 < 3) {
                    class187.field3721 = class163.method1168(arg0 ^ 0x231, new class38[] { class172.field3526, class151.method1059(var25 * 100 / 3, (byte) -114), class12.field270 });
                    class163.field3380 = 40;
                } else {
                    class187.field3721 = class40.field884;
                    class163.field3380 = 40;
                    client.field533 = 60;
                }
            } else if (client.field533 == 60) {
                int var26 = class132.method971(class124.field2673, -114, class146.field3049);
                int var27 = class191.method1271(6);
                if (var26 < var27) {
                    class187.field3721 = class163.method1168(121, new class38[] { class59.field1468, class151.method1059(var26 * 100 / var27, (byte) -114), class12.field270 });
                    class163.field3380 = 50;
                } else {
                    class187.field3721 = class181.field3650;
                    class163.field3380 = 50;
                    class7.method31(5, 27931);
                    client.field533 = 70;
                }
            } else if (client.field533 == 70) {
                if (class30.field597.method198((byte) -114)) {
                    class14.method86(arg0 ^ 0xFFFFFDCE, class30.field597);
                    class5.method27(class30.field597, 110);
                    class46.method331(class73.field1785, class30.field597, 3);
                    class59.method427(127, class30.field597, class31.field610, class73.field1785);
                    class7.method39(class73.field1785, class30.field597, 114);
                    class70.method554(class143.field2978, class30.field597, (byte) 102, class14.field289, class73.field1785);
                    class8.method42(arg0 ^ 0x25A, class161.field3350, class161.field3345, class30.field597);
                    class39.method291(class73.field1785, (byte) 93, class30.field597);
                    class196.method1297(class30.field597, 0);
                    class141.method1018(class30.field597, 19014);
                    class194.method1289(-23499, class73.field1785, class146.field3049, class80.field1892, class16.field336);
                    class36.method237(-120, class30.field597);
                    class146.method1042(24434, class30.field597);
                    client.field533 = 80;
                    class163.field3380 = 60;
                    class187.field3721 = class38.field790;
                } else {
                    class187.field3721 = class163.method1168(107, new class38[] { class125.field2700, class151.method1059(class30.field597.method941((byte) -16), (byte) -114), class12.field270 });
                    class163.field3380 = 60;
                }
            } else if (client.field533 == 80) {
                int var28 = 0;
                if (class165.field3414 == null) {
                    class165.field3414 = class116.method898(false, class146.field3049, class70.field1731, class96.field2153);
                } else {
                    var28++;
                }
                if (class145.field3033 == null) {
                    class145.field3033 = class116.method898(false, class146.field3049, class70.field1731, class199.field3933);
                } else {
                    var28++;
                }
                if (class54.field1364 == null) {
                    class54.field1364 = class117.method904(class146.field3049, class70.field1731, 999999999, class58.field1446);
                } else {
                    var28++;
                }
                if (class139.field2894 == null) {
                    class139.field2894 = class87.method724(116, class51.field1314, class70.field1731, class146.field3049);
                } else {
                    var28++;
                }
                if (class145.field3031 == null) {
                    class145.field3031 = class87.method724(123, class12.field274, class70.field1731, class146.field3049);
                } else {
                    var28++;
                }
                if (class34.field712 == null) {
                    class34.field712 = class87.method724(127, class128.field2742, class70.field1731, class146.field3049);
                } else {
                    var28++;
                }
                if (class132.field2812 == null) {
                    class132.field2812 = class87.method724(118, field2514, class70.field1731, class146.field3049);
                } else {
                    var28++;
                }
                if (class203.field4013 == null) {
                    class203.field4013 = class87.method724(127, class145.field3036, class70.field1731, class146.field3049);
                } else {
                    var28++;
                }
                if (class125.field2689 == null) {
                    class125.field2689 = class87.method724(124, class65.field1561, class70.field1731, class146.field3049);
                } else {
                    var28++;
                }
                if (class177.field3592 == null) {
                    class177.field3592 = class87.method724(117, client.field536, class70.field1731, class146.field3049);
                } else {
                    var28++;
                }
                if (class167.field3447 == null) {
                    class167.field3447 = class87.method724(116, class46.field1139, class70.field1731, class146.field3049);
                } else {
                    var28++;
                }
                if (class137.field2877 == null) {
                    class137.field2877 = class117.method904(class146.field3049, class70.field1731, arg0 ^ 0x3B9ACBA7, class168.field3454);
                } else {
                    var28++;
                }
                if (class25.field506 == null) {
                    class25.field506 = class117.method904(class146.field3049, class70.field1731, 999999999, class144.field3008);
                } else {
                    var28++;
                }
                if (class80.field1893 == null) {
                    class80.field1893 = class75.method597(class70.field1731, -1094018352, class5.field140, class146.field3049);
                } else {
                    var28++;
                }
                if (var28 < 14) {
                    class187.field3721 = class163.method1168(-101, new class38[] { class53.field1361, class151.method1059(var28 * 100 / 14, (byte) -114), class12.field270 });
                    class163.field3380 = 70;
                } else {
                    int var29 = (int) (Math.random() * 21.0D) - 10;
                    class77.field1856 = class25.field506;
                    int var30 = (int) (Math.random() * 21.0D) - 10;
                    int var31 = (int) (Math.random() * 21.0D) - 10;
                    int var32 = (int) (Math.random() * 41.0D) - 20;
                    class145.field3033.method744();
                    for (int var33 = 0; var33 < class139.field2894.length; var33++) {
                        class139.field2894[var33].method732(var29 + var32, var30 + var32, var31 + var32);
                    }
                    class54.field1364[0].method334(var29 + var32, var30 + var32, var31 + var32);
                    class14.method87(-7274);
                    class187.field3721 = class99.field2199;
                    client.field533 = 90;
                    class163.field3380 = 70;
                }
            } else if (client.field533 == 90) {
                if (class28.field550.method198((byte) 8)) {
                    class191 var34 = new class191(class28.field550, class146.field3049, 20, class31.field610 ? 64 : 128);
                    class93.method787(var34);
                    class93.method780(0.8F);
                    class163.field3380 = 90;
                    client.field533 = 110;
                    class187.field3721 = class144.field2994;
                } else {
                    class187.field3721 = class163.method1168(-7, new class38[] { class195.field3846, class151.method1059(class28.field550.method941((byte) -16), (byte) -114), class12.field270 });
                    class163.field3380 = 90;
                }
            } else if (client.field533 == 110) {
                class163.field3397 = new class134();
                class186.field3708.method953(class163.field3397, 10, (byte) 65);
                class163.field3380 = 94;
                class187.field3721 = class102.field2302;
                client.field533 = 120;
            } else if (client.field533 == 120) {
                if (class124.field2673.method214(class39.field841, class70.field1731, -99)) {
                    class30 var35 = new class30(class124.field2673.method210((byte) 122, class39.field841, class70.field1731));
                    class152.method1065(-1, var35);
                    class163.field3380 = 96;
                    class187.field3721 = class3.field98;
                    client.field533 = 130;
                } else {
                    class187.field3721 = class163.method1168(125, new class38[] { class6.field162, class167.field3445 });
                    class163.field3380 = 96;
                }
            } else if (client.field533 == 130) {
                if (!class80.field1892.method198((byte) -83)) {
                    class187.field3721 = class163.method1168(-27, new class38[] { class108.field2437, class151.method1059(class80.field1892.method941((byte) -16) * 4 / 5, (byte) -114), class12.field270 });
                    class163.field3380 = 100;
                } else if (!class188.field3754.method198((byte) 69)) {
                    class187.field3721 = class163.method1168(106, new class38[] { class108.field2437, class151.method1059(class188.field3754.method941((byte) -16) / 6 + 80, (byte) -114), class12.field270 });
                    class163.field3380 = 100;
                } else if (class16.field336.method198((byte) -97)) {
                    client.field533 = 140;
                    class187.field3721 = class161.field3361;
                    class163.field3380 = 100;
                } else {
                    class187.field3721 = class163.method1168(116, new class38[] { class108.field2437, class151.method1059(class16.field336.method941((byte) -16) / 20 + 96, (byte) -114), class12.field270 });
                    class163.field3380 = 100;
                }
            } else if (client.field533 == 140) {
                class7.method31(10, arg0 + 27331);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[Lea;)Lea;")
    public static final class38 method892(int arg0, int arg1, int arg2, class38[] arg3) {
        field2517++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg3[arg1 + var5] == null) {
                arg3[arg1 + var5] = class105.field2347;
            }
            var4 += arg3[arg1 + var5].field802;
        }
        int var6 = -82 / ((-arg2 - 27) / 45);
        int var7 = 0;
        byte[] var8 = new byte[var4];
        for (int var9 = 0; var9 < arg0; var9++) {
            class38 var11 = arg3[arg1 + var9];
            class131.method964(var11.field821, 0, var8, var7, var11.field802);
            var7 += var11.field802;
        }
        class38 var10 = new class38();
        var10.field802 = var4;
        var10.field821 = var8;
        return var10;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BZZ)I")
    public static final int method893(byte arg0, boolean arg1, boolean arg2) {
        field2516++;
        if (arg0 != 113) {
            field2527 = null;
        }
        int var3 = 0;
        if (arg1) {
            var3 += class102.field2296 + class92.field2087;
        }
        if (arg2) {
            var3 += class162.field3376 + class116.field2548;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lfb;B)V")
    public static final void method894(class48 arg0, byte arg1) {
        class35.method232(arg0, -13, 200000);
        field2519++;
        if (arg1 < 55) {
            field2527 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static void method895(int arg0) {
        field2523 = null;
        field2515 = null;
        field2527 = null;
        field2514 = null;
        if (arg0 != 20) {
            field2527 = null;
        }
        field2518 = null;
        field2526 = null;
    }
}
