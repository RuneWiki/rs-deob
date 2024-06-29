import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class178 extends class110 {

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "[I")
    private int[] field3400;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "[Lle;")
    public class104[] field3403;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "[B")
    public byte[] field3420;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "[B")
    public byte[] field3405;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "[B")
    public byte[] field3411;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "[Ldc;")
    public class33[] field3416;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "[S")
    public short[] field3407;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public int field3404;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "Leh;")
    private static class47 field3399 = class195.method1282((byte) -4, "b12_full");

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static volatile int field3406 = 0;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "Leh;")
    private static class47 field3413 = class195.method1282((byte) -4, "Loaded fonts");

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "[S")
    public static short[] field3408 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "Leh;")
    public static class47 field3415 = class195.method1282((byte) -4, "Cabbage");

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "Leh;")
    public static class47 field3418 = class195.method1282((byte) -4, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "Leh;")
    public static class47 field3410 = field3413;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "Leh;")
    public static class47 field3419 = class195.method1282((byte) -4, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field3417 = 0;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "Lmh;")
    public static class116 field3397 = new class116();

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field3421 = 0;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "[Ldh;")
    public static class38[] field3402;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public final void method1186(int arg0) {
        if (arg0 == -41) {
            this.field3400 = null;
            field3414++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
    public static final void method1187(int arg0) {
        field3398++;
        if (class146.field2856 == 0) {
            class31.method277(4, 104, 104, class103.field2171);
            for (int var1 = 0; var1 < 4; var1++) {
                class54.field1043[var1] = new class37(104, 104);
            }
            class5.field84 = new class50(512, 512);
            class146.field2856 = 20;
            class162.field3167 = 5;
            class161.field3130 = class67.field1443;
        } else if (class146.field2856 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 143;
                int var5 = class17.field341[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class70.method625(var2, 500, 800, 512, 334, 25, 3500);
            class161.field3130 = class60.field1163;
            class146.field2856 = 30;
            class162.field3167 = 10;
        } else if (class146.field2856 == 30) {
            class206.field4048 = class77.method673(arg0 - 100, true, false, true, 0);
            class91.field1908 = class77.method673(0, true, false, true, 1);
            class124.field2508 = class77.method673(0, true, true, false, 2);
            class165.field3205 = class77.method673(0, true, false, true, 3);
            class147.field2882 = class77.method673(0, true, false, true, 4);
            class87.field1862 = class77.method673(arg0 - 100, true, true, true, 5);
            class189.field3667 = class77.method673(0, false, true, true, 6);
            class47.field936 = class77.method673(0, true, false, true, 7);
            class3.field45 = class77.method673(arg0 ^ 0x64, true, false, true, 8);
            class202.field3918 = class77.method673(0, true, true, false, 9);
            class25.field491 = class77.method673(0, true, false, true, 10);
            class72.field1548 = class77.method673(0, true, false, true, 11);
            class147.field2880 = class77.method673(0, true, false, true, 12);
            class8.field155 = class77.method673(arg0 ^ 0x64, true, true, false, 13);
            class79.field1693 = class77.method673(0, false, false, true, 14);
            class152.field2988 = class77.method673(0, true, false, true, 15);
            class146.field2856 = 40;
            class161.field3130 = class206.field4062;
            class162.field3167 = 20;
        } else if (class146.field2856 == 40) {
            byte var7 = 0;
            int var8 = var7 + class206.field4048.method459(100) * 4 / 100;
            int var9 = var8 + class91.field1908.method459(arg0) * 4 / 100;
            int var10 = var9 + class124.field2508.method459(arg0) * 2 / 100;
            int var11 = var10 + class165.field3205.method459(100) * 2 / 100;
            int var12 = var11 + class147.field2882.method459(100) * 6 / 100;
            int var13 = var12 + class87.field1862.method459(100) * 4 / 100;
            int var14 = var13 + class189.field3667.method459(100) * 2 / 100;
            int var15 = var14 + class47.field936.method459(100) * 60 / 100;
            int var16 = var15 + class3.field45.method459(arg0) * 2 / 100;
            int var17 = var16 + class202.field3918.method459(100) * 2 / 100;
            int var18 = var17 + class25.field491.method459(100) * 2 / 100;
            int var19 = var18 + class72.field1548.method459(100) * 2 / 100;
            int var20 = var19 + class147.field2880.method459(100) * 2 / 100;
            int var21 = var20 + class8.field155.method459(100) * 2 / 100;
            int var22 = var21 + class79.field1693.method459(100) * 2 / 100;
            int var23 = var22 + class152.field2988.method459(100) * 2 / 100;
            if (var23 == 100) {
                class161.field3130 = class69.field1525;
                class146.field2856 = 45;
                class162.field3167 = 30;
            } else {
                if (var23 != 0) {
                    class161.field3130 = class5.method24(new class47[] { class162.field3158, class167.method1133(var23, (byte) 78), class26.field514 }, (byte) 95);
                }
                class162.field3167 = 30;
            }
        } else if (class146.field2856 == 45) {
            class138.method1003(2, 22050, !class204.field4029, false);
            class96 var24 = new class96();
            var24.method761((byte) -17, 9, 128);
            class191.field3711 = class205.method1351(0, class47.field949, 637, class142.field2782, 22050);
            class191.field3711.method898(var24, 256000);
            class8.method53(772486855, class152.field2988, class147.field2882, class79.field1693, var24);
            class54.field1044 = class205.method1351(1, class47.field949, 637, class142.field2782, 2048);
            class182.field3491 = new class175();
            class54.field1044.method898(class182.field3491, 256000);
            class41.field817 = new class198(22050, class110.field2276);
            class146.field2856 = 50;
            class162.field3167 = 35;
            class161.field3130 = class106.field2211;
        } else if (class146.field2856 == 50) {
            int var25 = 0;
            if (class167.field3238 == null) {
                class167.field3238 = class143.method1024(class3.field45, class181.field3472, 0, class8.field155, class91.field1912);
            } else {
                var25++;
            }
            if (class98.field2088 == null) {
                class98.field2088 = class167.field3238;
            } else {
                var25++;
            }
            if (class47.field946 == null) {
                class47.field946 = class143.method1024(class3.field45, class181.field3472, 0, class8.field155, class74.field1622);
            } else {
                var25++;
            }
            if (class52.field1014 == null) {
                class52.field1014 = class143.method1024(class3.field45, class181.field3472, arg0 - 100, class8.field155, field3399);
            } else {
                var25++;
            }
            if (var25 < 4) {
                class161.field3130 = class5.method24(new class47[] { class82.field1763, class167.method1133(var25 * 100 / 4, (byte) 89), class26.field514 }, (byte) 78);
                class162.field3167 = 40;
            } else {
                class161.field3130 = field3410;
                class162.field3167 = 40;
                class146.field2856 = 60;
            }
        } else if (class146.field2856 == 60) {
            int var26 = class205.method1350(true, class25.field491, class3.field45);
            int var27 = class200.method1312((byte) 127);
            if (var26 < var27) {
                class161.field3130 = class5.method24(new class47[] { class85.field1811, class167.method1133(var26 * 100 / var27, (byte) 94), class26.field514 }, (byte) 78);
                class162.field3167 = 50;
            } else {
                class162.field3167 = 50;
                class161.field3130 = class189.field3663;
                class198.method1299(arg0 ^ 0x64, 5);
                class146.field2856 = 70;
            }
        } else if (class146.field2856 == 70) {
            if (class124.field2508.method58(0)) {
                class60.method508(class124.field2508, (byte) 34);
                class73.method645(class124.field2508, 23);
                class155.method1074((byte) 92, class124.field2508, class47.field936);
                class92.method740(class124.field2508, class47.field936, class204.field4029, (byte) -114);
                class185.method1226(true, class124.field2508, class47.field936);
                class198.method1306(true, class98.field2088, class99.field2096, class47.field936, class124.field2508);
                class2.method12(class124.field2508, -118, class91.field1908, class206.field4048);
                class159.method1086(256, class47.field936, class124.field2508);
                class204.method1338(class124.field2508, (byte) 118);
                class158.method1083(16, class124.field2508);
                class57.method492(class47.field936, true, class165.field3205, class8.field155, class3.field45);
                class139.method1010(class124.field2508, (byte) 124);
                class53.method468(class124.field2508, 116);
                class162.field3167 = 60;
                class161.field3130 = class193.field3736;
                class132.method972((byte) 113);
                class146.field2856 = 80;
            } else {
                class161.field3130 = class5.method24(new class47[] { class163.field3178, class167.method1133(class124.field2508.method463(arg0 + 13392), (byte) 82), class26.field514 }, (byte) 70);
                class162.field3167 = 60;
            }
        } else if (class146.field2856 == 80) {
            int var28 = 0;
            if (class181.field3464 == null) {
                class181.field3464 = class84.method698(-94, class152.field2969, class3.field45, class181.field3472);
            } else {
                var28++;
            }
            if (class202.field3925 == null) {
                class202.field3925 = class84.method698(arg0 - 203, class97.field2056, class3.field45, class181.field3472);
            } else {
                var28++;
            }
            if (class141.field2774 == null) {
                class141.field2774 = class68.method587(class181.field3472, (byte) 86, class3.field45, class199.field3880);
            } else {
                var28++;
            }
            if (class137.field2682 == null) {
                class137.field2682 = class87.method711(class181.field3472, class33.field633, class3.field45, -12568);
            } else {
                var28++;
            }
            if (class148.field2897 == null) {
                class148.field2897 = class87.method711(class181.field3472, class144.field2827, class3.field45, arg0 ^ 0xFFFFCE8C);
            } else {
                var28++;
            }
            if (class122.field2472 == null) {
                class122.field2472 = class87.method711(class181.field3472, class54.field1049, class3.field45, -12568);
            } else {
                var28++;
            }
            if (class137.field2688 == null) {
                class137.field2688 = class87.method711(class181.field3472, class67.field1442, class3.field45, -12568);
            } else {
                var28++;
            }
            if (class137.field2683 == null) {
                class137.field2683 = class87.method711(class181.field3472, class32.field604, class3.field45, -12568);
            } else {
                var28++;
            }
            if (class86.field1831 == null) {
                class86.field1831 = class87.method711(class181.field3472, class53.field1035, class3.field45, arg0 ^ 0xFFFFCE8C);
            } else {
                var28++;
            }
            if (class180.field3446 == null) {
                class180.field3446 = class87.method711(class181.field3472, class121.field2436, class3.field45, arg0 - 12668);
            } else {
                var28++;
            }
            if (class167.field3239 == null) {
                class167.field3239 = class87.method711(class181.field3472, class80.field1724, class3.field45, -12568);
            } else {
                var28++;
            }
            if (class70.field1535 == null) {
                class70.field1535 = class68.method587(class181.field3472, (byte) 85, class3.field45, class202.field3941);
            } else {
                var28++;
            }
            if (class126.field2517 == null) {
                class126.field2517 = class68.method587(class181.field3472, (byte) 108, class3.field45, class3.field46);
            } else {
                var28++;
            }
            if (var28 < 13) {
                class161.field3130 = class5.method24(new class47[] { class118.field2390, class167.method1133(var28 * 100 / 13, (byte) -107), class26.field514 }, (byte) 111);
                class162.field3167 = 70;
            } else {
                class13.field282 = class126.field2517;
                class202.field3925.method433();
                int var29 = (int) (Math.random() * 21.0D) - 10;
                class181.field3464.method433();
                int var30 = (int) (Math.random() * 21.0D) - 10;
                int var31 = (int) (Math.random() * 21.0D) - 10;
                int var32 = (int) (Math.random() * 41.0D) - 20;
                for (int var33 = 0; var33 < class137.field2682.length; var33++) {
                    class137.field2682[var33].method423(var29 + var32, var30 + var32, var31 + var32);
                }
                class141.field2774[0].method325(var29 + var32, var30 - -var32, var31 + var32);
                class161.field3130 = class79.field1713;
                class162.field3167 = 70;
                class146.field2856 = 90;
            }
        } else if (class146.field2856 == 90) {
            if (class202.field3918.method58(0)) {
                class91 var34 = new class91(class202.field3918, class3.field45, 20, class204.field4029 ? 64 : 128);
                class17.method194(var34);
                class17.method193(0.7F);
                class162.field3167 = 90;
                class146.field2856 = 110;
                class161.field3130 = class152.field2970;
            } else {
                class161.field3130 = class5.method24(new class47[] { class87.field1868, class167.method1133(class202.field3918.method463(13492), (byte) 119), class26.field514 }, (byte) 103);
                class162.field3167 = 90;
            }
        } else if (class146.field2856 == 110) {
            class16.field324 = new class41();
            class142.field2782.method1052(2, 10, class16.field324);
            class162.field3167 = 94;
            class161.field3130 = class23.field455;
            class146.field2856 = 120;
        } else if (class146.field2856 != 120) {
            if (arg0 != 100) {
                method1187(20);
            }
            if (class146.field2856 == 130) {
                if (!class165.field3205.method58(0)) {
                    class161.field3130 = class5.method24(new class47[] { class203.field3995, class167.method1133(class165.field3205.method463(13492) * 4 / 5, (byte) 91), class26.field514 }, (byte) 83);
                    class162.field3167 = 100;
                } else if (!class147.field2880.method58(0)) {
                    class161.field3130 = class5.method24(new class47[] { class203.field3995, class167.method1133(class147.field2880.method463(13492) / 6 + 80, (byte) 37), class26.field514 }, (byte) 79);
                    class162.field3167 = 100;
                } else if (class8.field155.method58(0)) {
                    class161.field3130 = class95.field1955;
                    class162.field3167 = 100;
                    class146.field2856 = 140;
                } else {
                    class161.field3130 = class5.method24(new class47[] { class203.field3995, class167.method1133(class8.field155.method463(arg0 + 13392) / 20 + 96, (byte) -98), class26.field514 }, (byte) 62);
                    class162.field3167 = 100;
                }
            } else if (class146.field2856 == 140) {
                class198.method1299(0, 10);
            }
        } else if (class25.field491.method74((byte) 98, class181.field3472, class186.field3566)) {
            class193 var35 = new class193(class25.field491.method78(class181.field3472, -2294, class186.field3566));
            class33.method287(arg0 ^ 0xFFFFFE68, var35);
            class161.field3130 = class183.field3511;
            class146.field2856 = 130;
            class162.field3167 = 96;
        } else {
            class161.field3130 = class5.method24(new class47[] { class36.field699, class33.field636 }, (byte) 73);
            class162.field3167 = 96;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)V")
    public static final void method1188(boolean arg0, int arg1) {
        field3412++;
        class34.field663 = arg0;
        if (arg1 != 16617) {
            return;
        }
        if (!class34.field663) {
            int var25 = class22.field418.method576(28836);
            int var26 = (class14.field304 - class22.field418.field1454) / 16;
            class176.field3374 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class176.field3374[var27][var37] = class22.field418.method595(77);
                }
            }
            int var28 = class22.field418.method564((byte) 106);
            int var29 = class22.field418.method586((byte) 106);
            boolean var30 = false;
            int var31 = class22.field418.method586((byte) 109);
            int var32 = class22.field418.method569(arg1 + 9879);
            class54.field1041 = new byte[var26][];
            class198.field3870 = new int[var26];
            class117.field2382 = new int[var26];
            class43.field868 = new byte[var26][];
            if ((var29 / 8 == 48 || var29 / 8 == 49) && (var32 / 8) == 48) {
                var30 = true;
            }
            class3.field32 = new int[var26];
            if (var29 / 8 == 48 && var32 / 8 == 148) {
                var30 = true;
            }
            int var33 = 0;
            for (int var34 = (var29 - 6) / 8; var34 <= (var29 + 6) / 8; var34++) {
                for (int var35 = (var32 - 6) / 8; var35 <= (var32 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var30 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class198.field3870[var33] = var36;
                        class3.field32[var33] = class87.field1862.method75(class5.method24(new class47[] { class92.field1931, class167.method1133(var34, (byte) 94), class119.field2408, class167.method1133(var35, (byte) -120) }, (byte) 104), 31499);
                        class117.field2382[var33] = class87.field1862.method75(class5.method24(new class47[] { class36.field690, class167.method1133(var34, (byte) -124), class119.field2408, class167.method1133(var35, (byte) 97) }, (byte) 105), 31499);
                        var33++;
                    }
                }
            }
            class108.method872(var25, var29, var31, var28, var32, -19789);
            return;
        }
        int var2 = class22.field418.method586((byte) 52);
        int var3 = class22.field418.method576(28836);
        int var4 = class22.field418.method586((byte) 91);
        int var5 = class22.field418.method604((byte) 2);
        class22.field418.method658(-9462);
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class22.field418.method655(1, 720);
                    if (var24 == 1) {
                        class23.field463[var6][var22][var23] = class22.field418.method655(26, 720);
                    } else {
                        class23.field463[var6][var22][var23] = -1;
                    }
                }
            }
        }
        class22.field418.method661(false);
        int var7 = (class14.field304 - class22.field418.field1454) / 16;
        class176.field3374 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class176.field3374[var8][var21] = class22.field418.method610((byte) 88);
            }
        }
        int var9 = class22.field418.method608(arg1 ^ 0x40BE);
        class198.field3870 = new int[var7];
        class3.field32 = new int[var7];
        class54.field1041 = new byte[var7][];
        class117.field2382 = new int[var7];
        class43.field868 = new byte[var7][];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class23.field463[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class198.field3870[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class198.field3870[var10] = var17;
                            int var19 = var17 >> 8 & 0xFF;
                            int var20 = var17 & 0xFF;
                            class3.field32[var10] = class87.field1862.method75(class5.method24(new class47[] { class92.field1931, class167.method1133(var19, (byte) -110), class119.field2408, class167.method1133(var20, (byte) 122) }, (byte) 108), 31499);
                            class117.field2382[var10] = class87.field1862.method75(class5.method24(new class47[] { class36.field690, class167.method1133(var19, (byte) 49), class119.field2408, class167.method1133(var20, (byte) -121) }, (byte) 83), arg1 + 14882);
                            var10++;
                        }
                    }
                }
            }
        }
        class108.method872(var9, var3, var2, var5, var4, arg1 ^ 0xFFFFF25A);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I[ILqd;[B)Z")
    public final boolean method1189(int arg0, int[] arg1, class148 arg2, byte[] arg3) {
        boolean var5 = true;
        field3401++;
        if (arg0 != 128) {
            method1187(53);
        }
        class104 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3400[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg2.method1047(var9 >> 2, arg1, true);
                        } else {
                            var6 = arg2.method1040(arg1, (byte) -35, var9 >> 2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3403[var8] = var6;
                        this.field3400[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
    public static void method1190(boolean arg0) {
        if (arg0) {
            field3418 = null;
        }
        field3408 = null;
        field3402 = null;
        field3399 = null;
        field3410 = null;
        field3418 = null;
        field3419 = null;
        field3415 = null;
        field3397 = null;
        field3413 = null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class178() {
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "([B)V")
    public class178(byte[] arg0) {
        this.field3400 = new int[128];
        this.field3403 = new class104[128];
        this.field3420 = new byte[128];
        this.field3405 = new byte[128];
        this.field3411 = new byte[128];
        this.field3416 = new class33[128];
        this.field3407 = new short[128];
        int var2 = 0;
        class68 var3 = new class68(arg0);
        while (var3.field1495[var3.field1454 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method567(-1);
        }
        var3.field1454++;
        int var6 = 0;
        int var7 = var3.field1454;
        var2++;
        var3.field1454 += var2;
        while (var3.field1495[var3.field1454 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method567(-1);
        }
        var6++;
        var3.field1454++;
        int var10 = var3.field1454;
        int var11 = 0;
        var3.field1454 += var6;
        while (var3.field1495[var3.field1454 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method567(-1);
        }
        var11++;
        var3.field1454++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method604((byte) -42);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class33[] var19 = new class33[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class33 var103 = var19[var20] = new class33();
            int var104 = var3.method604((byte) -124);
            if (var104 > 0) {
                var103.field640 = new byte[var104 * 2];
            }
            int var105 = var3.method604((byte) 112);
            if (var105 > 0) {
                var103.field644 = new byte[var105 * 2 + 2];
                var103.field644[1] = 64;
            }
        }
        int var21 = var3.method604((byte) 102);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var3.method604((byte) -127);
        int var24;
        for (var24 = 0; var3.field1495[var3.field1454 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method567(-1);
        }
        var3.field1454++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method604((byte) -31);
            this.field3407[var28] = (short) var27;
        }
        byte[] var29 = var23 > 0 ? new byte[var23 * 2] : null;
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method604((byte) -126);
            this.field3407[var31] = (short) (this.field3407[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var25.length > var34) {
                    var32 = var25[var34++];
                } else {
                    var32 = -1;
                }
                var33 = var3.method578(-1);
            }
            this.field3407[var35] = (short) (this.field3407[var35] + class142.method1018(var33 - 1 << 14, 32768));
            this.field3400[var35] = var33;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field3400[var39] != 0) {
                if (var37 == 0) {
                    var38 = var3.field1495[var7++] - 1;
                    if (var4.length <= var36) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                }
                var37--;
                this.field3420[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field3400[var43] != 0) {
                if (var40 == 0) {
                    var42 = var3.field1495[var10++] + 16 << 2;
                    if (var41 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                }
                var40--;
                this.field3405[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        class33 var45 = null;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field3400[var47] != 0) {
                if (var46 == 0) {
                    var45 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var46 = var12[var44++];
                    } else {
                        var46 = -1;
                    }
                }
                var46--;
                this.field3416[var47] = var45;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 < var25.length) {
                    var48 = var25[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field3400[var51] > 0) {
                    var50 = var3.method604((byte) -126) + 1;
                }
            }
            var48--;
            this.field3411[var51] = (byte) var50;
        }
        this.field3404 = var3.method604((byte) 67) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class33 var100 = var19[var52];
            if (var100.field640 != null) {
                for (int var101 = 1; var101 < var100.field640.length; var101 += 2) {
                    var100.field640[var101] = var3.method567(-1);
                }
            }
            if (var100.field644 != null) {
                for (int var102 = 3; var102 < var100.field644.length - 2; var102 += 2) {
                    var100.field644[var102] = var3.method567(-1);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method567(-1);
            }
        }
        if (var29 != null) {
            for (int var54 = 1; var54 < var29.length; var54 += 2) {
                var29[var54] = var3.method567(-1);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class33 var97 = var19[var55];
            if (var97.field644 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field644.length; var99 += 2) {
                    var98 = var98 + var3.method604((byte) -19) + 1;
                    var97.field644[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class33 var94 = var19[var56];
            if (var94.field640 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field640.length; var96 += 2) {
                    var95 += var3.method604((byte) -125) + 1;
                    var94.field640[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method604((byte) -125);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var3.method604((byte) -124) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field3411[var61] = (byte) (this.field3411[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                int var67 = (var66 - var59) * var60 + (var66 - var59) / 2;
                var62 += 2;
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class107.method867(var66 - var59, var67, -80);
                    var67 += var65 - var60;
                    this.field3411[var68] = (byte) (this.field3411[var68] * var69 + 32 >> 6);
                }
                var60 = var65;
                var59 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field3411[var64] = (byte) (this.field3411[var64] * var60 + 32 >> 6);
            }
        }
        if (var29 != null) {
            int var70 = var3.method604((byte) -126);
            var29[0] = (byte) var70;
            for (int var71 = 2; var71 < var29.length; var71 += 2) {
                var70 = var70 + var3.method604((byte) 52) + 1;
                var29[var71] = (byte) var70;
            }
            byte var72 = var29[0];
            int var73 = var29[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field3405[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field3405[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var29.length) {
                int var79 = var29[var75 + 1] << 1;
                byte var80 = var29[var75];
                int var81 = (var80 - var72) * var73 + (var80 - var72) / 2;
                for (int var82 = var72; var82 < var80; var82++) {
                    int var83 = class107.method867(var80 - var72, var81, -65);
                    var81 += var79 - var73;
                    int var84 = (this.field3405[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field3405[var82] = (byte) var84;
                }
                var73 = var79;
                var75 += 2;
                var72 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field3405[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field3405[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field631 = var3.method604((byte) 44);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class33 var93 = var19[var87];
            if (var93.field640 != null) {
                var93.field643 = var3.method604((byte) -128);
            }
            if (var93.field644 != null) {
                var93.field635 = var3.method604((byte) 40);
            }
            if (var93.field631 > 0) {
                var93.field642 = var3.method604((byte) -124);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field637 = var3.method604((byte) 9);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class33 var92 = var19[var89];
            if (var92.field637 > 0) {
                var92.field630 = var3.method604((byte) -124);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class33 var91 = var19[var90];
            if (var91.field630 > 0) {
                var91.field638 = var3.method604((byte) -125);
            }
        }
    }
}
