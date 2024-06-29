import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class100 extends class5 {

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "Lhe;")
    public static class54 field2529 = class6.method58("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", false);

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "Lhe;")
    public static class54 field2526 = class6.method58(" )2> <col=ffff00>", false);

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "Lhe;")
    public static class54 field2533 = class6.method58("Lade)3)3)3", false);

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "Lee;")
    public static class34 field2527 = new class34();

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lhe;")
    public static class54 field2540 = class6.method58("<br>(X100(U(Y", false);

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "Lsf;")
    public static class131 field2541 = new class131(128);

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "Lhe;")
    public static class54 field2542 = class6.method58("Bitte warten Sie)3)3)3", false);

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "Lhe;")
    public static class54 field2543 = class6.method58("null", false);

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public int field2523;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public int field2535;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public int field2536;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "Lhe;")
    public class54 field2531;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "Lnc;")
    public class93 field2525;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "Lnc;")
    public class93 field2537;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "[Ljava/lang/Object;")
    public Object[] field2522;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "[[S")
    public static short[][] field2539;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "[[[B")
    public static byte[][][] field2530;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V")
    public static final void method794(boolean arg0) {
        if (arg0) {
            return;
        }
        field2532++;
        if (class89.field2203 == 0) {
            class74.field1831 = new class136(4, 104, 104, class141.field3211);
            for (int var1 = 0; var1 < 4; var1++) {
                class111.field2652[var1] = new class4(104, 104);
            }
            class6.field185 = new class113(512, 512);
            class4.field139 = 5;
            class89.field2203 = 20;
            class66.field1602 = class54.field1342;
        } else if (class89.field2203 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class152.field3416[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class136.method1037(var2, 500, 800, 512, 334);
            class89.field2203 = 30;
            class66.field1602 = class147.field3326;
            class4.field139 = 10;
        } else if (class89.field2203 == 30) {
            class146.field3309 = class121.method933(1, true, true, 0, false);
            class7.field213 = class121.method933(1, true, true, 1, false);
            class7.field215 = class121.method933(1, false, true, 2, true);
            class114.field2708 = class121.method933(1, true, true, 3, false);
            class131.field2977 = class121.method933(1, true, true, 4, false);
            class52.field1252 = class121.method933(1, true, true, 5, true);
            class105.field2602 = class121.method933(1, true, false, 6, true);
            class143.field3280 = class121.method933(1, true, true, 7, false);
            client.field607 = class121.method933(1, true, true, 8, false);
            class34.field862 = class121.method933(1, true, true, 9, false);
            class150.field3394 = class121.method933(1, true, true, 10, false);
            class49.field1186 = class121.method933(1, true, true, 11, false);
            class107.field2621 = class121.method933(1, true, true, 12, false);
            class52.field1262 = class121.method933(1, false, true, 13, true);
            class114.field2714 = class121.method933(1, true, false, 14, false);
            class79.field1947 = class121.method933(1, true, true, 15, false);
            class66.field1602 = class120.field2801;
            class4.field139 = 20;
            class89.field2203 = 40;
        } else if (class89.field2203 == 40) {
            byte var7 = 0;
            int var8 = var7 + class146.field3309.method234((byte) -31) * 4 / 100;
            int var9 = var8 + class7.field213.method234((byte) -31) * 4 / 100;
            int var10 = var9 + class7.field215.method234((byte) -31) * 2 / 100;
            int var11 = var10 + class114.field2708.method234((byte) -31) * 2 / 100;
            int var12 = var11 + class131.field2977.method234((byte) -31) * 6 / 100;
            int var13 = var12 + class52.field1252.method234((byte) -31) * 4 / 100;
            int var14 = var13 + class105.field2602.method234((byte) -31) * 2 / 100;
            int var15 = var14 + class143.field3280.method234((byte) -31) * 60 / 100;
            int var16 = var15 + client.field607.method234((byte) -31) * 2 / 100;
            int var17 = var16 + class34.field862.method234((byte) -31) * 2 / 100;
            int var18 = var17 + class150.field3394.method234((byte) -31) * 2 / 100;
            int var19 = var18 + class49.field1186.method234((byte) -31) * 2 / 100;
            int var20 = var19 + class107.field2621.method234((byte) -31) * 2 / 100;
            int var21 = var20 + class52.field1262.method234((byte) -31) * 2 / 100;
            int var22 = var21 + class114.field2714.method234((byte) -31) * 2 / 100;
            int var23 = var22 + class79.field1947.method234((byte) -31) * 2 / 100;
            if (var23 == 100) {
                class4.field139 = 30;
                class66.field1602 = class141.field3228;
                class89.field2203 = 45;
            } else {
                if (var23 != 0) {
                    class66.field1602 = class143.method1105(new class54[] { class38.field938, class147.method1117(-47, var23), class120.field2798 }, -842);
                }
                class4.field139 = 30;
            }
        } else if (class89.field2203 == 45) {
            class49.method352(22050, 18834, 2, !class118.field2768);
            class14 var24 = new class14();
            var24.method98(9, 128, 127);
            class21.field581 = class77.method588(-82, 22050, class80.field1963, class70.field1753, 0);
            class21.field581.method609(7, var24);
            class83.method628(class79.field1947, 44, class131.field2977, var24, class114.field2714);
            class52.field1273 = class77.method588(-79, 2048, class80.field1963, class70.field1753, 1);
            class5.field143 = new class61();
            class52.field1273.method609(7, class5.field143);
            class13.field357 = new class13(22050, class134.field3037);
            class4.field139 = 35;
            class66.field1602 = class6.field178;
            class89.field2203 = 50;
        } else if (class89.field2203 == 50) {
            int var25 = 0;
            if (class65.field1570 == null) {
                class65.field1570 = class111.method837(class52.field1245, client.field607, -107, class24.field671, class52.field1262);
            } else {
                var25++;
            }
            if (class108.field2626 == null) {
                class108.field2626 = class111.method837(class151.field3411, client.field607, 105, class24.field671, class52.field1262);
            } else {
                var25++;
            }
            if (class135.field3067 == null) {
                class135.field3067 = class111.method837(class43.field1113, client.field607, -111, class24.field671, class52.field1262);
            } else {
                var25++;
            }
            if (var25 < 3) {
                class66.field1602 = class143.method1105(new class54[] { class40.field1045, class147.method1117(-90, var25 * 100 / 3), class120.field2798 }, -842);
                class4.field139 = 40;
            } else {
                class4.field139 = 40;
                class66.field1602 = class24.field683;
                class89.field2203 = 60;
            }
        } else if (class89.field2203 == 60) {
            int var26 = class59.method466((byte) -95, class150.field3394, client.field607);
            int var27 = class133.method999(6);
            if (var27 > var26) {
                class66.field1602 = class143.method1105(new class54[] { class62.field1515, class147.method1117(-126, var26 * 100 / var27), class120.field2798 }, -842);
                class4.field139 = 50;
            } else {
                class66.field1602 = class9.field302;
                class4.field139 = 50;
                class4.method28(5, 1);
                class89.field2203 = 70;
            }
        } else if (class89.field2203 == 70) {
            if (class7.field215.method271((byte) -89)) {
                class11.method88(class7.field215, false);
                class63.method497((byte) 84, class7.field215);
                class63.method494((byte) 105, class7.field215, class143.field3280);
                class57.method450(-1, class143.field3280, class7.field215, class118.field2768);
                class67.method528(true, class7.field215, class143.field3280);
                class63.method495(class65.field1570, class143.field3280, (byte) -55, class7.field215, class150.field3395);
                class99.method791(class146.field3309, class7.field215, (byte) -85, class7.field213);
                class8.method70(111, class7.field215, class143.field3280);
                client.method168((byte) 45, class7.field215);
                class66.method513(class7.field215, 73);
                class58.method457(77, client.field607, class52.field1262, class114.field2708, class143.field3280);
                class67.method525(class7.field215, 14531);
                class107.method815((byte) 26, class7.field215);
                class4.field139 = 60;
                class66.field1602 = class94.field2378;
                class89.field2203 = 80;
            } else {
                class66.field1602 = class143.method1105(new class54[] { class11.field321, class147.method1117(-36, class7.field215.method226((byte) 119)), class120.field2798 }, -842);
                class4.field139 = 60;
            }
        } else if (class89.field2203 == 80) {
            int var28 = 0;
            if (class71.field1766 == null) {
                class71.field1766 = class111.method835(26149, client.field607, class123.field2847, class24.field671);
            } else {
                var28++;
            }
            if (class132.field2983 == null) {
                class132.field2983 = class111.method835(26149, client.field607, class84.field2087, class24.field671);
            } else {
                var28++;
            }
            if (class1.field7 == null) {
                class1.field7 = class125.method957(class24.field671, client.field607, 74, class31.field794);
            } else {
                var28++;
            }
            if (class35.field884 == null) {
                class35.field884 = class132.method996(class38.field988, client.field607, class24.field671, true);
            } else {
                var28++;
            }
            if (class130.field2931 == null) {
                class130.field2931 = class132.method996(class71.field1767, client.field607, class24.field671, true);
            } else {
                var28++;
            }
            if (class105.field2587 == null) {
                class105.field2587 = class132.method996(class102.field2551, client.field607, class24.field671, !arg0);
            } else {
                var28++;
            }
            if (class132.field2993 == null) {
                class132.field2993 = class132.method996(class40.field1029, client.field607, class24.field671, true);
            } else {
                var28++;
            }
            if (class28.field750 == null) {
                class28.field750 = class132.method996(class158.field3601, client.field607, class24.field671, true);
            } else {
                var28++;
            }
            if (class72.field1780 == null) {
                class72.field1780 = class132.method996(class5.field155, client.field607, class24.field671, true);
            } else {
                var28++;
            }
            if (class13.field359 == null) {
                class13.field359 = class132.method996(class67.field1674, client.field607, class24.field671, !arg0);
            } else {
                var28++;
            }
            if (class68.field1709 == null) {
                class68.field1709 = class132.method996(class123.field2833, client.field607, class24.field671, true);
            } else {
                var28++;
            }
            if (class13.field368 == null) {
                class13.field368 = class125.method957(class24.field671, client.field607, 44, class73.field1814);
            } else {
                var28++;
            }
            if (class111.field2663 == null) {
                class111.field2663 = class125.method957(class24.field671, client.field607, 124, class156.field3551);
            } else {
                var28++;
            }
            if (class4.field136 == null) {
                class4.field136 = class2.method9(24094, class24.field671, class5.field150, client.field607);
            } else {
                var28++;
            }
            if (var28 < 14) {
                class66.field1602 = class143.method1105(new class54[] { class67.field1634, class147.method1117(-14, var28 * 100 / 14), class120.field2798 }, -842);
                class4.field139 = 70;
            } else {
                class154.field3483 = class111.field2663;
                int var29 = (int) (Math.random() * 21.0D) - 10;
                class132.field2983.method851();
                int var30 = (int) (Math.random() * 21.0D) - 10;
                int var31 = (int) (Math.random() * 41.0D) - 20;
                int var32 = (int) (Math.random() * 21.0D) - 10;
                for (int var33 = 0; var33 < class35.field884.length; var33++) {
                    class35.field884[var33].method861(var29 + var31, var30 - -var31, var31 + var32);
                }
                class1.field7[0].method162(var29 + var31, var30 - -var31, var31 + var32);
                class31.method235(72);
                class89.field2203 = 90;
                class66.field1602 = class102.field2555;
                class4.field139 = 70;
            }
        } else if (class89.field2203 == 90) {
            if (class34.field862.method271((byte) 117)) {
                class66 var34 = new class66(class34.field862, client.field607, 20, 0.8D, class118.field2768 ? 64 : 128);
                class152.method1148(var34);
                class152.method1162(0.8D);
                class66.field1602 = class80.field1955;
                class89.field2203 = 110;
                class4.field139 = 90;
            } else {
                class66.field1602 = class143.method1105(new class54[] { class32.field812, class147.method1117(-42, class34.field862.method226((byte) 119)), class120.field2798 }, -842);
                class4.field139 = 90;
            }
        } else if (class89.field2203 == 110) {
            class63.field1543 = new class103();
            class80.field1963.method1121(class63.field1543, 10, 119);
            class4.field139 = 94;
            class89.field2203 = 120;
            class66.field1602 = class52.field1260;
        } else if (class89.field2203 == 120) {
            if (class150.field3394.method264((byte) 126, class79.field1931, class24.field671)) {
                class88 var35 = new class88(class150.field3394.method272(arg0, class79.field1931, class24.field671));
                class32.method247(-1, var35);
                class4.field139 = 96;
                class89.field2203 = 130;
                class66.field1602 = class31.field780;
            } else {
                class66.field1602 = class143.method1105(new class54[] { class67.field1643, class49.field1182 }, -842);
                class4.field139 = 96;
            }
        } else if (class89.field2203 == 130) {
            if (!class114.field2708.method271((byte) 100)) {
                class66.field1602 = class143.method1105(new class54[] { class22.field643, class147.method1117(-47, class114.field2708.method226((byte) 119) * 4 / 5), class120.field2798 }, -842);
                class4.field139 = 100;
            } else if (!class107.field2621.method271((byte) -46)) {
                class66.field1602 = class143.method1105(new class54[] { class22.field643, class147.method1117(-106, class107.field2621.method226((byte) 119) / 6 + 80), class120.field2798 }, -842);
                class4.field139 = 100;
            } else if (class52.field1262.method271((byte) -92)) {
                class89.field2203 = 140;
                class66.field1602 = class11.field305;
                class4.field139 = 100;
            } else {
                class66.field1602 = class143.method1105(new class54[] { class22.field643, class147.method1117(-25, class52.field1262.method226((byte) 119) / 20 + 96), class120.field2798 }, -842);
                class4.field139 = 100;
            }
        } else if (class89.field2203 == 140) {
            class4.method28(10, 1);
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(Z)V")
    public static void method795(boolean arg0) {
        field2541 = null;
        field2543 = null;
        field2539 = null;
        field2529 = null;
        field2540 = null;
        field2542 = null;
        field2533 = null;
        if (!arg0) {
            field2527 = null;
        }
        field2527 = null;
        field2526 = null;
        field2530 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public static final void method796(byte arg0) {
        field2534++;
        if (arg0 != 8) {
            field2529 = null;
        }
        if (class75.field1862 != null) {
            class75.field1862.method1130(-31709);
        }
    }
}
