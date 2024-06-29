import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class47 {

    @OriginalMember(owner = "client!he", name = "o", descriptor = "[I")
    private int[] field1234;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lad;")
    private static class5 field1220 = class88.method674("Bad session id)3", 112);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lad;")
    public static class5 field1221 = field1220;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Lad;")
    public static class5 field1233 = class88.method674("Mem:", 52);

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1236 = 0;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lad;")
    public static class5 field1237 = class88.method674("invback", 11);

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Lrd;")
    public static class106 field1232;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lsb;")
    public static class110 field1225;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lkb;")
    public static class62 field1222;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Z")
    public static boolean field1228;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 4)
    public static void method411(byte arg0) {
        field1232 = null;
        field1225 = null;
        if (arg0 != 66) {
            return;
        }
        field1220 = null;
        field1237 = null;
        field1233 = null;
        field1221 = null;
        field1222 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 20)
    public static final void method412(int arg0) {
        field1231++;
        if (arg0 < 1) {
            return;
        }
        if (class129.field3099 == 0) {
            class42.field1065 = new class97(4, 104, 104, class42.field1062);
            for (int var1 = 0; var1 < 4; var1++) {
                class13.field387[var1] = new class58(104, 104);
            }
            class5.field208 = new class122(512, 512);
            class129.field3099 = 20;
            class101.field2463 = 5;
            class109.field2732 = class39.field1012;
        } else if (class129.field3099 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 143;
                int var5 = var4 * 3 + 600;
                int var6 = class114.field2831[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class97.method761(var2, 500, 800, 512, 334);
            class101.field2463 = 10;
            class109.field2732 = class120.field2989;
            class129.field3099 = 30;
        } else if (class129.field3099 == 30) {
            class39.field1009 = class6.method83(0, false, -27949, true, true);
            class46.field1217 = class6.method83(1, false, -27949, true, true);
            class52.field1305 = class6.method83(2, true, -27949, false, true);
            class87.field2050 = class6.method83(3, false, -27949, true, true);
            class110.field2778 = class6.method83(4, false, -27949, true, true);
            class20.field527 = class6.method83(5, true, -27949, true, true);
            class108.field2713 = class6.method83(6, true, -27949, true, false);
            class78.field1854 = class6.method83(7, false, -27949, true, true);
            class35.field872 = class6.method83(8, false, -27949, true, true);
            class87.field2049 = class6.method83(9, false, -27949, true, true);
            class78.field1827 = class6.method83(10, false, -27949, true, true);
            class132.field3192 = class6.method83(11, false, -27949, true, true);
            class110.field2758 = class6.method83(12, false, -27949, true, true);
            class109.field2732 = class92.field2191;
            class129.field3099 = 40;
            class101.field2463 = 20;
        } else if (class129.field3099 == 40) {
            byte var7 = 0;
            int var8 = var7 + class39.field1009.method921((byte) 83) * 5 / 100;
            int var9 = var8 + class46.field1217.method921((byte) -97) * 5 / 100;
            int var10 = var9 + class52.field1305.method921((byte) -115) * 5 / 100;
            int var11 = var10 + class87.field2050.method921((byte) -123) * 5 / 100;
            int var12 = var11 + class110.field2778.method921((byte) -122) * 5 / 100;
            int var13 = var12 + class20.field527.method921((byte) -98) * 5 / 100;
            int var14 = var13 + class108.field2713.method921((byte) -91) * 5 / 100;
            int var15 = var14 + class78.field1854.method921((byte) 14) * 40 / 100;
            int var16 = var15 + class35.field872.method921((byte) -117) * 5 / 100;
            int var17 = var16 + class87.field2049.method921((byte) 19) * 5 / 100;
            int var18 = var17 + class78.field1827.method921((byte) 19) * 5 / 100;
            int var19 = var18 + class132.field3192.method921((byte) -114) * 5 / 100;
            int var20 = var19 + class110.field2758.method921((byte) 27) * 5 / 100;
            if (var20 == 100) {
                class101.field2463 = 30;
                class129.field3099 = 45;
                class109.field2732 = class134.field3234;
            } else {
                if (var20 != 0) {
                    class109.field2732 = class69.method546(true, new class5[] { class54.field1370, class106.method864(18413, var20), class35.field870 });
                }
                class101.field2463 = 30;
            }
        } else if (class129.field3099 == 45) {
            class106.method855(10676, 0, !class40.field1048, class25.field631);
            class58.field1417 = class43.method362(class25.field631, class9.field305, 503);
            class79.field1863 = new class89(22050, class102.field2503);
            class101.field2463 = 35;
            class109.field2732 = class18.field476;
            class129.field3099 = 50;
        } else if (class129.field3099 == 50) {
            int var21 = 0;
            if (class49.field1263 == null) {
                class49.field1263 = class63.method504(class135.field3269, class98.field2369, class35.field872, (byte) 26);
            } else {
                var21++;
            }
            if (class82.field1924 == null) {
                class82.field1924 = class63.method504(class135.field3269, class78.field1852, class35.field872, (byte) 26);
            } else {
                var21++;
            }
            if (class135.field3263 == null) {
                class135.field3263 = class63.method504(class135.field3269, class91.field2141, class35.field872, (byte) 26);
            } else {
                var21++;
            }
            if (var21 < 3) {
                class109.field2732 = class69.method546(true, new class5[] { class54.field1350, class106.method864(18413, var21 * 100 / 3), class35.field870 });
                class101.field2463 = 40;
            } else {
                class101.field2463 = 40;
                class109.field2732 = class95.field2262;
                class129.field3099 = 60;
            }
        } else if (class129.field3099 == 60) {
            int var22 = class53.method437((byte) 118, class78.field1827, class35.field872);
            int var23 = class72.method571(-1);
            if (var23 > var22) {
                class109.field2732 = class69.method546(true, new class5[] { class88.field2087, class106.method864(18413, var22 * 100 / var23), class35.field870 });
                class101.field2463 = 50;
            } else {
                class109.field2732 = class116.field2875;
                class101.field2463 = 50;
                class69.method541(5, -128);
                class129.field3099 = 70;
            }
        } else if (class129.field3099 == 70) {
            if (class52.field1305.method859(25032)) {
                class118.method935((byte) -125, class52.field1305);
                class129.method998(9, class52.field1305);
                class63.method505(3, class78.field1854, class52.field1305);
                class30.method247(class52.field1305, class78.field1854, class40.field1048, true);
                class74.method592((byte) 106, class52.field1305, class78.field1854);
                class22.method171(class52.field1305, class14.field407, -24637, class78.field1854);
                class73.method585(true, class39.field1009, class52.field1305, class46.field1217);
                class118.method939(class52.field1305, -23861, class78.field1854);
                class132.method1024(class52.field1305, true);
                class129.method999(class52.field1305, -3);
                class25.method205(class87.field2050, (byte) 88, class35.field872, class78.field1854);
                class109.field2732 = class33.field788;
                class129.field3099 = 80;
                class101.field2463 = 60;
            } else {
                class109.field2732 = class69.method546(true, new class5[] { class69.field1612, class106.method864(18413, class52.field1305.method927((byte) 2)), class35.field870 });
                class101.field2463 = 60;
            }
        } else if (class129.field3099 == 80) {
            int var24 = 0;
            if (class12.field355 == null) {
                class12.field355 = class80.method622(false, class90.field2125, class135.field3269, class35.field872);
            } else {
                var24++;
            }
            if (class87.field2005 == null) {
                class87.field2005 = class80.method622(false, class96.field2280, class135.field3269, class35.field872);
            } else {
                var24++;
            }
            if (class53.field1328 == null) {
                class53.field1328 = class80.method623(class54.field1362, class135.field3269, class35.field872, (byte) -91);
            } else {
                var24++;
            }
            if (class18.field480 == null) {
                class18.field480 = class129.method995((byte) 82, class35.field872, class135.field3269, class88.field2086);
            } else {
                var24++;
            }
            if (class91.field2130 == null) {
                class91.field2130 = class129.method995((byte) 99, class35.field872, class135.field3269, class110.field2765);
            } else {
                var24++;
            }
            if (class77.field1812 == null) {
                class77.field1812 = class129.method995((byte) 108, class35.field872, class135.field3269, class6.field228);
            } else {
                var24++;
            }
            if (class87.field2013 == null) {
                class87.field2013 = class129.method995((byte) 96, class35.field872, class135.field3269, class20.field534);
            } else {
                var24++;
            }
            if (class39.field959 == null) {
                class39.field959 = class129.method995((byte) 113, class35.field872, class135.field3269, class43.field1085);
            } else {
                var24++;
            }
            if (class120.field2976 == null) {
                class120.field2976 = class80.method622(false, class18.field477, class135.field3269, class35.field872);
            } else {
                var24++;
            }
            if (class23.field592 == null) {
                class23.field592 = class129.method995((byte) 92, class35.field872, class135.field3269, class19.field511);
            } else {
                var24++;
            }
            if (class52.field1313 == null) {
                class52.field1313 = class129.method995((byte) 82, class35.field872, class135.field3269, class87.field2048);
            } else {
                var24++;
            }
            if (class35.field876 == null) {
                class35.field876 = class129.method995((byte) 81, class35.field872, class135.field3269, class25.field628);
            } else {
                var24++;
            }
            if (class74.field1761 == null) {
                class74.field1761 = class80.method623(class39.field1016, class135.field3269, class35.field872, (byte) -87);
            } else {
                var24++;
            }
            if (class116.field2866 == null) {
                class116.field2866 = class80.method623(class58.field1423, class135.field3269, class35.field872, (byte) -126);
            } else {
                var24++;
            }
            if (var24 < 14) {
                class109.field2732 = class69.method546(true, new class5[] { class78.field1859, class106.method864(18413, var24 * 100 / 14), class35.field870 });
                class101.field2463 = 70;
            } else {
                int var25 = (int) (Math.random() * 21.0D) - 10;
                int var26 = (int) (Math.random() * 21.0D) - 10;
                class87.field2005.method965();
                int var27 = (int) (Math.random() * 21.0D) - 10;
                int var28 = (int) (Math.random() * 41.0D) - 20;
                for (int var29 = 0; var29 < class18.field480.length; var29++) {
                    class18.field480[var29].method961(var25 + var28, var26 - -var28, var27 + var28);
                }
                class53.field1328[0].method977(var25 + var28, var26 + var28, var27 + var28);
                class101.field2463 = 70;
                class109.field2732 = class128.field3054;
                class129.field3099 = 85;
            }
        } else if (class129.field3099 == 85) {
            int var30 = class118.method930(class35.field872, (byte) -10);
            int var31 = class17.method135(1);
            if (var30 < var31) {
                class109.field2732 = class69.method546(true, new class5[] { class81.field1905, class106.method864(18413, var30 * 100 / var31), class35.field870 });
                class101.field2463 = 80;
            } else {
                class129.field3099 = 90;
                class109.field2732 = class116.field2877;
                class101.field2463 = 80;
            }
        } else if (class129.field3099 == 90) {
            if (class87.field2049.method859(25032)) {
                class65 var32 = new class65(class87.field2049, class35.field872, 20, 0.8D, class40.field1048 ? 64 : 128);
                class114.method913(var32);
                class114.method905(0.8D);
                class129.field3099 = 110;
                class101.field2463 = 90;
                class109.field2732 = class133.field3208;
            } else {
                class109.field2732 = class69.method546(true, new class5[] { class46.field1188, class106.method864(18413, class87.field2049.method927((byte) 2)), class35.field870 });
                class101.field2463 = 90;
            }
        } else if (class129.field3099 == 110) {
            class32.field777 = new class49();
            class25.field631.method13(10, class32.field777, 0);
            class129.field3099 = 120;
            class109.field2732 = class7.field264;
            class101.field2463 = 94;
        } else if (class129.field3099 == 120) {
            if (class78.field1827.method846(class61.field1497, class135.field3269, 5000)) {
                class36 var33 = new class36(class78.field1827.method854(class61.field1497, class135.field3269, 118));
                class23.method177(0, var33);
                class109.field2732 = class7.field269;
                class129.field3099 = 130;
                class101.field2463 = 96;
            } else {
                class109.field2732 = class69.method546(true, new class5[] { class78.field1849, class20.field542 });
                class101.field2463 = 96;
            }
        } else if (class129.field3099 == 130) {
            if (!class87.field2050.method859(25032)) {
                class109.field2732 = class69.method546(true, new class5[] { class99.field2404, class106.method864(18413, class87.field2050.method927((byte) 2) * 4 / 5), class35.field870 });
                class101.field2463 = 100;
            } else if (class110.field2758.method859(25032)) {
                class129.field3099 = 140;
                class101.field2463 = 100;
                class109.field2732 = class18.field473;
            } else {
                class109.field2732 = class69.method546(true, new class5[] { class99.field2404, class106.method864(18413, class110.field2758.method927((byte) 2) / 5 + 80), class35.field870 });
                class101.field2463 = 100;
            }
        } else if (class129.field3099 == 140) {
            class69.method541(10, 32);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V", line = 444)
    public static final void method413(byte arg0) {
        field1227++;
        if (class59.field1455 != null) {
            class59.field1455.method350(-5918);
            class59.field1455 = null;
        }
        class7.method86(-64);
        class42.field1065.method747();
        for (int var1 = 0; var1 < 4; var1++) {
            class13.field387[var1].method469(91);
        }
        System.gc();
        class78.method609(10, (byte) -56);
        if (arg0 <= 23) {
            method411((byte) 53);
        }
        class120.field2987 = -1;
        class98.field2376 = 0;
        class40.method345((byte) -10);
        class69.method541(10, 104);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lvd;ILvd;)V", line = 477)
    public static final void method414(class130 arg0, int arg1, class130 arg2) {
        field1229++;
        class109.field2751.method885(-103);
        if (class20.field524 == 0 || class20.field524 == 5) {
            byte var3 = 20;
            int var4 = 82 - var3;
            arg0.method1017(class88.field2088, 180, 74 - var3, 16777215);
            class55.method452(28, var4, 304, 34, 9179409);
            class55.method452(29, var4 + 1, 302, 32, 0);
            class55.method443(30, var4 + 2, class101.field2463 * 3, 30, 9179409);
            class55.method443(class101.field2463 * 3 + 30, var4 - -2, 300 - class101.field2463 * 3, 30, 0);
            arg0.method1017(class109.field2732, 180, 105 - var3, 16777215);
        }
        if (class20.field524 == 20) {
            class134.field3243.method976(0, 0);
            byte var5 = 40;
            arg0.method1000(class109.field2746, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg0.method1000(class109.field2734, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg0.method1000(class109.field2728, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg0.method1016(class69.method546(true, new class5[] { class106.field2673, class109.field2753 }), 90, var22, 16777215, true);
            int var23 = var22 + 15;
            arg0.method1016(class69.method546(true, new class5[] { class65.field1562, class109.field2736.method34((byte) -117) }), 92, var23, 16777215, true);
            int var24 = var23 + 15;
        }
        if (class20.field524 == 10) {
            class134.field3243.method976(0, 0);
            if (class86.field1989 == 0) {
                byte var13 = 100;
                byte var14 = 80;
                arg0.method1000(class8.field295, 180, var14, 16776960, true);
                int var35 = var14 + 30;
                byte var15 = 120;
                class54.field1358.method976(var13 - 73, var15 + -20);
                arg0.method1005(class100.field2418, var13 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var16 = 260;
                class54.field1358.method976(var16 - 73, var15 + -20);
                arg0.method1005(class77.field1810, var16 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class86.field1989 == 2) {
                byte var9 = 40;
                byte var10 = 100;
                arg0.method1000(class109.field2746, 180, var9, 16776960, true);
                short var11 = 150;
                int var29 = var9 + 15;
                arg0.method1000(class109.field2734, 180, var29, 16776960, true);
                int var30 = var29 + 15;
                arg0.method1000(class109.field2728, 180, var30, 16776960, true);
                int var31 = var30 + 15;
                int var32 = var31 + 10;
                arg0.method1016(class69.method546(true, new class5[] { class106.field2673, class109.field2753, class8.field288 == 0 & class69.field1636 % 40 < 20 ? class59.field1454 : class109.field2747 }), 90, var32, 16777215, true);
                int var33 = var32 + 15;
                arg0.method1016(class69.method546(true, new class5[] { class65.field1562, class109.field2736.method34((byte) 108), class69.field1636 % 40 < 20 & class8.field288 == 1 ? class59.field1454 : class109.field2747 }), 92, var33, 16777215, true);
                class54.field1358.method976(var10 - 73, var11 + -20);
                arg0.method1000(class77.field1816, var10, var11 + 5, 16777215, true);
                int var34 = var33 + 15;
                short var12 = 260;
                class54.field1358.method976(var12 - 73, var11 + -20);
                arg0.method1000(class99.field2389, var12, var11 + 5, 16777215, true);
            } else if (class86.field1989 == 3) {
                arg0.method1000(class6.field227, 180, 40, 16776960, true);
                short var6 = 180;
                byte var7 = 65;
                short var8 = 150;
                arg0.method1000(class36.field910, 180, var7, 16777215, true);
                int var25 = var7 + 15;
                arg0.method1000(class14.field405, 180, var25, 16777215, true);
                int var26 = var25 + 15;
                arg0.method1000(class56.field1400, 180, var26, 16777215, true);
                int var27 = var26 + 15;
                arg0.method1000(class58.field1416, 180, var27, 16777215, true);
                int var28 = var27 + 15;
                class54.field1358.method976(var6 - 73, var8 + -20);
                arg0.method1000(class99.field2389, var6, var8 + 5, 16777215, true);
            }
        }
        class128.method986(0);
        try {
            Graphics var17 = class9.field305.getGraphics();
            class109.field2751.method253(171, var17, false, 202);
            class12.field361.method253(0, var17, false, 0);
            field1225.method253(0, var17, false, 637);
            if (arg1 != -25870) {
                method412(28);
            }
            if (class120.field2979) {
                class120.field2979 = false;
                class14.field404.method253(0, var17, false, 128);
                class38.field941.method253(371, var17, false, 202);
                class102.field2487.method253(265, var17, false, 0);
                class21.field546.method253(265, var17, false, 562);
                client.field496.method253(171, var17, false, 128);
                class8.field289.method253(171, var17, false, 562);
            }
        } catch (Exception var18) {
            class9.field305.repaint();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)I", line = 622)
    public final int method415(int arg0, int arg1) {
        field1224++;
        if (arg1 != -1) {
            return -3;
        }
        int var3 = this.field1234.length - 2;
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field1234[var4];
            if (arg0 == var5) {
                return this.field1234[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "([I)V", line = 673)
    public class47(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1234 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1234[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1234[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1234[var5 + var5] = arg0[var4];
            this.field1234[var5 + var5 + 1] = var4++;
        }
    }
}
