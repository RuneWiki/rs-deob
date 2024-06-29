import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class122 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lee;")
    public class44 field2252 = new class44();

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lq;")
    public static class145 field2261 = new class145(0, 0);

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Lkb;")
    public static class93 field2268 = class76.method390("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 0);

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Lkb;")
    public static class93 field2273 = class76.method390(")4lang)4de", 0);

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field2275 = 0;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Lkb;")
    public static class93 field2270 = null;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lee;")
    private class44 field2272;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "[S")
    public static short[] field2269;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljg;Ljg;Ljava/awt/Component;I)V")
    public static final void method689(class89 arg0, class89 arg1, Component arg2, int arg3) {
        field2254++;
        if (class101.field1853) {
            return;
        }
        class118.method662();
        byte[] var4 = arg1.method459(class148.field2863, true, class147.field2838);
        class145.field2825 = new class129(var4, arg2);
        class102.field1881 = class145.field2825.method743();
        class155.field3051 = method697(arg3 - 15, class14.field245, arg0, class148.field2863);
        class141.field2758 = method697(arg3 - 2, class201.field3903, arg0, class148.field2863);
        class9.field155 = method697(122, class83.field1523, arg0, class148.field2863);
        class139.field2707 = class27.method148(class85.field1548, arg0, (byte) -60, class148.field2863);
        class166.field3320 = class27.method148(class111.field2004, arg0, (byte) -116, class148.field2863);
        class73.field1350 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class73.field1350[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class73.field1350[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class73.field1350[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class73.field1350[var8 + 192] = 16777215;
        }
        class34.field544 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class34.field544[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class34.field544[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class34.field544[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class34.field544[var12 + 192] = 16777215;
        }
        class89.field1611 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class89.field1611[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class89.field1611[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class89.field1611[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class89.field1611[var16 + 192] = 16777215;
        }
        class174.field3450 = new int[32768];
        class2.field30 = new int[32768];
        class1.field27 = new int[256];
        class16.method96(null, 0);
        class139.field2694 = 0;
        class76.field1378 = new int[32768];
        class157.field3105 = false;
        if (class79.field1408 == 0) {
            class169.field3360 = true;
        } else {
            class169.field3360 = false;
        }
        class64.field1029 = new int[32768];
        class148.field2862 = class148.field2863;
        class148.field2850 = class148.field2863;
        if (class169.field3360) {
            class117.method650(2, (byte) 106);
        } else {
            class1.method1(38, class63.field1000, 2, false, class172.field3419, class148.field2863, 255);
        }
        class102.method570(false, arg3 ^ 0x7F);
        class101.field1853 = true;
        class145.field2825.method745(0, 0);
        class102.field1881.method745(382, 0);
        class155.field3051.method674(382 - class155.field3051.field2211 / 2, 18);
        class97.field1794 = new class129(arg3, 254);
        class47.field759 = new class129(128, 254);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lee;Lee;I)V")
    public final void method690(class44 arg0, class44 arg1, int arg2) {
        if (arg1.field721 != null) {
            arg1.method235(false);
        }
        if (arg2 != -65) {
            return;
        }
        field2258++;
        arg1.field716 = arg0;
        arg1.field721 = arg0.field721;
        arg1.field721.field716 = arg1;
        arg1.field716.field721 = arg1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lee;B)V")
    public final void method691(class44 arg0, byte arg1) {
        field2255++;
        if (arg0.field721 != null) {
            arg0.method235(false);
        }
        arg0.field721 = this.field2252.field721;
        arg0.field716 = this.field2252;
        arg0.field721.field716 = arg0;
        if (arg1 != 51) {
            field2270 = null;
        }
        arg0.field716.field721 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)Lee;")
    public final class44 method692(boolean arg0) {
        class44 var2 = this.field2252.field716;
        field2251++;
        if (this.field2252 == var2) {
            this.field2272 = null;
            return null;
        }
        if (arg0) {
            field2270 = null;
        }
        this.field2272 = var2.field716;
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Lee;")
    public final class44 method693(int arg0) {
        int var2 = -70 % ((-arg0 - 1) / 58);
        field2257++;
        class44 var3 = this.field2272;
        if (this.field2252 == var3) {
            this.field2272 = null;
            return null;
        } else {
            this.field2272 = var3.field721;
            return var3;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Lee;")
    public final class44 method694(byte arg0) {
        if (arg0 >= -21) {
            this.method699(null, -96);
        }
        class44 var2 = this.field2252.field716;
        field2256++;
        if (this.field2252 == var2) {
            return null;
        } else {
            var2.method235(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Lee;")
    public final class44 method695(int arg0) {
        field2267++;
        class44 var2 = this.field2272;
        if (this.field2252 == var2) {
            this.field2272 = null;
            return null;
        }
        this.field2272 = var2.field716;
        if (arg0 != 512) {
            this.method695(107);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V")
    public static final void method696(boolean arg0) {
        if (class147.field2840 != null) {
            class147.field2840.method10(false);
            class147.field2840 = null;
        }
        class186.method1211(-105);
        class175.field3458.method808();
        field2264++;
        for (int var1 = 0; var1 < 4; var1++) {
            class145.field2822[var1].method946(0);
        }
        if (!arg0) {
            field2275 = -82;
        }
        System.gc();
        class117.method650(2, (byte) 115);
        class191.field3735 = -1;
        class171.field3393 = false;
        class63.method324((byte) 74);
        class205.method1336(20, 10);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILkb;Ljg;Lkb;)Lna;")
    public static final class119 method697(int arg0, class93 arg1, class89 arg2, class93 arg3) {
        if (arg0 < 104) {
            method701(true);
        }
        field2260++;
        int var4 = arg2.method454(236, arg1);
        int var5 = arg2.method468(21, arg3, var4);
        return class158.method1049(var4, (byte) -125, var5, arg2);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)Lee;")
    public final class44 method698(byte arg0) {
        field2262++;
        class44 var2 = this.field2252.field721;
        if (this.field2252 == var2) {
            this.field2272 = null;
            return null;
        }
        if (arg0 != 33) {
            field2268 = null;
        }
        this.field2272 = var2.field721;
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lee;I)V")
    public final void method699(class44 arg0, int arg1) {
        if (arg0.field721 != null) {
            arg0.method235(false);
        }
        field2271++;
        arg0.field716 = this.field2252.field716;
        arg0.field721 = this.field2252;
        arg0.field721.field716 = arg0;
        if (arg1 < 90) {
            field2275 = -4;
        }
        arg0.field716.field721 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
    public static void method700(byte arg0) {
        field2269 = null;
        field2270 = null;
        field2268 = null;
        field2273 = null;
        if (arg0 <= 94) {
            field2270 = null;
        }
        field2261 = null;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)V")
    public static final void method701(boolean arg0) {
        field2259++;
        if (class184.field3623 == 0) {
            class175.field3458 = new class134(4, 104, 104, class151.field2935);
            for (int var1 = 0; var1 < 4; var1++) {
                class145.field2822[var1] = new class151(104, 104);
            }
            class12.field204 = new class129(512, 512);
            class148.field2843 = class37.field626;
            class62.field985 = 5;
            class184.field3623 = 20;
        } else if (class184.field3623 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class150.field2896[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class134.method831(var2, 500, 800, 512, 334, 25, 3500);
            class148.field2843 = class96.field1778;
            class184.field3623 = 30;
            class62.field985 = 10;
        } else if (class184.field3623 == 30) {
            class110.field1987 = class46.method245(true, false, 1000000, 0, true);
            class203.field3929 = class46.method245(true, false, 1000000, 1, true);
            class73.field1341 = class46.method245(true, true, 1000000, 2, false);
            class181.field3586 = class46.method245(true, false, 1000000, 3, true);
            class76.field1375 = class46.method245(true, false, 1000000, 4, true);
            class61.field974 = class46.method245(true, true, 1000000, 5, true);
            class63.field1000 = class46.method245(false, true, 1000000, 6, true);
            class26.field398 = class46.method245(true, false, 1000000, 7, true);
            class206.field4030 = class46.method245(true, false, 1000000, 8, true);
            class204.field3952 = class46.method245(true, true, 1000000, 9, false);
            class66.field1183 = class46.method245(true, false, 1000000, 10, true);
            class104.field1921 = class46.method245(true, false, 1000000, 11, true);
            class174.field3445 = class46.method245(true, false, 1000000, 12, true);
            class49.field789 = class46.method245(true, true, 1000000, 13, false);
            class63.field994 = class46.method245(false, false, 1000000, 14, true);
            class143.field2792 = class46.method245(true, false, 1000000, 15, true);
            class62.field985 = 20;
            class148.field2843 = class62.field990;
            class184.field3623 = 40;
        } else if (class184.field3623 == 40) {
            byte var7 = 0;
            int var8 = var7 + class110.field1987.method626(0) * 4 / 100;
            int var9 = var8 + class203.field3929.method626(0) * 4 / 100;
            int var10 = var9 + class73.field1341.method626(0) * 2 / 100;
            int var11 = var10 + class181.field3586.method626(0) * 2 / 100;
            int var12 = var11 + class76.field1375.method626(0) * 6 / 100;
            int var13 = var12 + class61.field974.method626(0) * 4 / 100;
            int var14 = var13 + class63.field1000.method626(0) * 2 / 100;
            int var15 = var14 + class26.field398.method626(0) * 60 / 100;
            int var16 = var15 + class206.field4030.method626(0) * 2 / 100;
            int var17 = var16 + class204.field3952.method626(0) * 2 / 100;
            int var18 = var17 + class66.field1183.method626(0) * 2 / 100;
            int var19 = var18 + class104.field1921.method626(0) * 2 / 100;
            int var20 = var19 + class174.field3445.method626(0) * 2 / 100;
            int var21 = var20 + class49.field789.method626(0) * 2 / 100;
            int var22 = var21 + class63.field994.method626(0) * 2 / 100;
            int var23 = var22 + class143.field2792.method626(0) * 2 / 100;
            if (var23 == 100) {
                class148.field2843 = class83.field1528;
                class62.field985 = 30;
                class184.field3623 = 45;
            } else {
                if (var23 != 0) {
                    class148.field2843 = class203.method1321(new class93[] { class197.field3837, class67.method357((byte) -106, var23), class23.field355 }, 94);
                }
                class62.field985 = 30;
            }
        } else if (class184.field3623 == 45) {
            class136.method858(104, 2, !class82.field1515, 22050);
            class153 var24 = new class153();
            var24.method970(1, 128, 9);
            class157.field3130 = class55.method297(class115.field2147, 0, 48, class77.field1393, 22050);
            class157.field3130.method252(var24, (byte) 75);
            class66.method347(var24, -1, class76.field1375, class63.field994, class143.field2792);
            class144.field2815 = class55.method297(class115.field2147, 1, 118, class77.field1393, 2048);
            class184.field3634 = new class168();
            class144.field2815.method252(class184.field3634, (byte) 75);
            class138.field2673 = new class85(22050, class170.field3385);
            class62.field985 = 35;
            class184.field3623 = 50;
            class148.field2843 = class203.field3914;
        } else if (class184.field3623 == 50) {
            int var25 = 0;
            if (class203.field3923 == null) {
                class203.field3923 = class96.method538(false, class206.field4030, class36.field585, class43.field712, class49.field789);
            } else {
                var25++;
            }
            if (class59.field943 == null) {
                class59.field943 = class203.field3923;
            } else {
                var25++;
            }
            if (class26.field410 == null) {
                class26.field410 = class96.method538(false, class206.field4030, class182.field3601, class43.field712, class49.field789);
            } else {
                var25++;
            }
            if (class68.field1250 == null) {
                class68.field1250 = class96.method538(false, class206.field4030, class177.field3526, class43.field712, class49.field789);
            } else {
                var25++;
            }
            if (var25 < 4) {
                class148.field2843 = class203.method1321(new class93[] { class32.field518, class67.method357((byte) -104, var25 * 100 / 4), class23.field355 }, -58);
                class62.field985 = 40;
            } else {
                class62.field985 = 40;
                class148.field2843 = class144.field2811;
                class184.field3623 = 60;
            }
        } else if (class184.field3623 == 60) {
            int var26 = class141.method890(class66.field1183, (byte) 14, class206.field4030);
            int var27 = class89.method466(87);
            if (var26 < var27) {
                class148.field2843 = class203.method1321(new class93[] { class191.field3725, class67.method357((byte) -96, var26 * 100 / var27), class23.field355 }, -4);
                class62.field985 = 50;
            } else {
                class62.field985 = 50;
                class148.field2843 = class49.field792;
                class205.method1336(20, 5);
                class184.field3623 = 70;
            }
        } else if (class184.field3623 == 70) {
            if (class73.field1341.method449(true)) {
                class100.method558(1915417345, class73.field1341);
                class61.method317(51, class73.field1341);
                class16.method94(class26.field398, 0, class73.field1341);
                class152.method953(-128, class73.field1341, class82.field1515, class26.field398);
                class101.method564(class26.field398, class73.field1341, 1);
                class14.method77(class73.field1341, class62.field988, class26.field398, -23150, class59.field943);
                class113.method619(class203.field3929, class73.field1341, class110.field1987, (byte) -124);
                class178.method1175(-26512, class26.field398, class73.field1341);
                class79.method400(class73.field1341, false);
                class69.method365(16, class73.field1341);
                class204.method1329(class206.field4030, class181.field3586, -105, class26.field398, class49.field789);
                class171.method1144(class73.field1341, (byte) -69);
                class18.method106((byte) 110, class73.field1341);
                class62.field985 = 60;
                class148.field2843 = class141.field2765;
                class120.method675(-10813);
                class184.field3623 = 80;
            } else {
                class148.field2843 = class203.method1321(new class93[] { class82.field1509, class67.method357((byte) -127, class73.field1341.method630(118)), class23.field355 }, 91);
                class62.field985 = 60;
            }
        } else if (class184.field3623 == 80) {
            int var28 = 0;
            if (class167.field3344 == null) {
                class167.field3344 = class130.method761(0, class43.field712, class65.field1084, class206.field4030);
            } else {
                var28++;
            }
            if (class26.field399 == null) {
                class26.field399 = class130.method761(0, class43.field712, class77.field1388, class206.field4030);
            } else {
                var28++;
            }
            if (class7.field116 == null) {
                class7.field116 = class27.method148(class44.field719, class206.field4030, (byte) -44, class43.field712);
            } else {
                var28++;
            }
            if (class2.field37 == null) {
                class2.field37 = class19.method111(class21.field340, false, class206.field4030, class43.field712);
            } else {
                var28++;
            }
            if (class115.field2167 == null) {
                class115.field2167 = class19.method111(class173.field3438, false, class206.field4030, class43.field712);
            } else {
                var28++;
            }
            if (class110.field1991 == null) {
                class110.field1991 = class19.method111(class205.field3957, false, class206.field4030, class43.field712);
            } else {
                var28++;
            }
            if (class70.field1291 == null) {
                class70.field1291 = class19.method111(class93.field1733, false, class206.field4030, class43.field712);
            } else {
                var28++;
            }
            if (class116.field2175 == null) {
                class116.field2175 = class19.method111(class32.field531, false, class206.field4030, class43.field712);
            } else {
                var28++;
            }
            if (class18.field306 == null) {
                class18.field306 = class19.method111(class193.field3748, false, class206.field4030, class43.field712);
            } else {
                var28++;
            }
            if (class204.field3951 == null) {
                class204.field3951 = class19.method111(class10.field157, false, class206.field4030, class43.field712);
            } else {
                var28++;
            }
            if (class63.field1006 == null) {
                class63.field1006 = class19.method111(class67.field1241, false, class206.field4030, class43.field712);
            } else {
                var28++;
            }
            if (class136.field2644 == null) {
                class136.field2644 = class27.method148(class154.field3037, class206.field4030, (byte) -115, class43.field712);
            } else {
                var28++;
            }
            if (class201.field3905 == null) {
                class201.field3905 = class27.method148(class170.field3381, class206.field4030, (byte) -125, class43.field712);
            } else {
                var28++;
            }
            if (class64.field1036 == null) {
                class64.field1036 = method697(120, class144.field2804, class206.field4030, class43.field712);
            } else {
                var28++;
            }
            if (var28 < 14) {
                class148.field2843 = class203.method1321(new class93[] { class113.field2107, class67.method357((byte) -111, var28 * 100 / 14), class23.field355 }, -94);
                class62.field985 = 70;
            } else {
                int var29 = (int) (Math.random() * 21.0D) - 10;
                class156.field3066 = class201.field3905;
                int var30 = (int) (Math.random() * 21.0D) - 10;
                int var31 = (int) (Math.random() * 21.0D) - 10;
                class26.field399.method735();
                int var32 = (int) (Math.random() * 41.0D) - 20;
                for (int var33 = 0; var33 < class2.field37.length; var33++) {
                    class2.field37[var33].method754(var29 + var32, var30 + var32, var31 + var32);
                }
                class7.field116[0].method673(var29 + var32, var30 + var32, var31 + var32);
                class191.method1230((byte) 15);
                class62.field985 = 70;
                class148.field2843 = class26.field422;
                class184.field3623 = 90;
            }
        } else if (class184.field3623 == 90) {
            if (class204.field3952.method449(true)) {
                class200 var34 = new class200(class204.field3952, class206.field4030, 20, class82.field1515 ? 64 : 128);
                class150.method917(var34);
                class150.method923(0.7F);
                class184.field3623 = 110;
                class62.field985 = 90;
                class148.field2843 = class57.field929;
            } else {
                class148.field2843 = class203.method1321(new class93[] { class158.field3171, class67.method357((byte) -93, class204.field3952.method630(118)), class23.field355 }, -119);
                class62.field985 = 90;
            }
        } else if (arg0) {
            if (class184.field3623 == 110) {
                class102.field1885 = new class193();
                class77.field1393.method909(-5836, class102.field1885, 10);
                class148.field2843 = class96.field1772;
                class62.field985 = 94;
                class184.field3623 = 120;
            } else if (class184.field3623 == 120) {
                if (class66.field1183.method450(class24.field366, 0, class43.field712)) {
                    class174 var35 = new class174(class66.field1183.method459(class43.field712, true, class24.field366));
                    class88.method445(var35, -6609);
                    class148.field2843 = class206.field4028;
                    class184.field3623 = 130;
                    class62.field985 = 96;
                } else {
                    class148.field2843 = class203.method1321(new class93[] { class115.field2166, class47.field753 }, -107);
                    class62.field985 = 96;
                }
            } else if (class184.field3623 == 130) {
                if (!class181.field3586.method449(true)) {
                    class148.field2843 = class203.method1321(new class93[] { class152.field2947, class67.method357((byte) -99, class181.field3586.method630(122) * 4 / 5), class23.field355 }, 102);
                    class62.field985 = 100;
                } else if (!class174.field3445.method449(true)) {
                    class148.field2843 = class203.method1321(new class93[] { class152.field2947, class67.method357((byte) -115, class174.field3445.method630(110) / 6 + 80), class23.field355 }, -118);
                    class62.field985 = 100;
                } else if (class49.field789.method449(true)) {
                    class184.field3623 = 140;
                    class62.field985 = 100;
                    class148.field2843 = class16.field279;
                } else {
                    class148.field2843 = class203.method1321(new class93[] { class152.field2947, class67.method357((byte) -100, class49.field789.method630(125) / 20 + 96), class23.field355 }, -75);
                    class62.field985 = 100;
                }
            } else if (class184.field3623 == 140) {
                class205.method1336(20, 10);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(B)V")
    public final void method702(byte arg0) {
        if (arg0 < 35) {
            field2274 = 7;
        }
        field2265++;
        while (true) {
            class44 var2 = this.field2252.field716;
            if (this.field2252 == var2) {
                return;
            }
            var2.method235(false);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class122() {
        this.field2252.field721 = this.field2252;
        this.field2252.field716 = this.field2252;
    }
}
