import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class22 extends class82 {

    @OriginalMember(owner = "client!dc", name = "sb", descriptor = "I")
    public int field693 = -1;

    @OriginalMember(owner = "client!dc", name = "ub", descriptor = "I")
    public int field695 = 0;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "[I")
    public static int[] field678 = new int[32768];

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "I")
    public static int field683 = 0;

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "I")
    public static int field686 = 1;

    @OriginalMember(owner = "client!dc", name = "nb", descriptor = "Z")
    public static boolean field688 = false;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "La;")
    public static class1 field677 = class113.method934(-11538, "::fpson");

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "[I")
    public static int[] field685 = new int[50];

    @OriginalMember(owner = "client!dc", name = "tb", descriptor = "I")
    public static int field694 = 0;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!dc", name = "mb", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!dc", name = "ob", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!dc", name = "pb", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!dc", name = "qb", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!dc", name = "rb", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!dc", name = "vb", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!dc", name = "wb", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!dc", name = "xb", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!dc", name = "zb", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!dc", name = "Ab", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!dc", name = "yb", descriptor = "Lbd;")
    public static class11 field699;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "[Ljd;")
    public static class58[] field681;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 9)
    public static void method316(int arg0) {
        if (arg0 != -10) {
            field677 = null;
        }
        field685 = null;
        field699 = null;
        field678 = null;
        field677 = null;
        field681 = null;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V", line = 34)
    public static final void method317(int arg0) {
        field691++;
        if (class46.field1210 == 0) {
            class130.field3186 = new class3(4, 104, 104, class57.field1454);
            for (int var1 = 0; var1 < 4; var1++) {
                class102.field2572[var1] = new class5(104, 104);
            }
            class104.field2629 = new class58(512, 512);
            class133.field3277 = 5;
            class46.field1210 = 20;
            class123.field3082 = class100.field2483;
        } else if (class46.field1210 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 128 + 15;
                int var5 = var4 * 3 + 600;
                int var6 = class27.field776[var4];
                var2[var3] = var5 * var6 >> 16;
            }
            class3.method52(var2, 500, 800, 512, 334);
            class133.field3277 = 10;
            class123.field3082 = class62.field1560;
            class46.field1210 = 30;
        } else if (class46.field1210 == 30) {
            class52.field1381 = class107.method897(0, true, false, (byte) 127, true);
            class19.field658 = class107.method897(1, true, false, (byte) 125, true);
            class95.field2379 = class107.method897(2, true, true, (byte) 119, false);
            class131.field3203 = class107.method897(3, true, false, (byte) 119, true);
            class80.field2034 = class107.method897(4, true, false, (byte) 119, true);
            class128.field3134 = class107.method897(5, true, true, (byte) 123, true);
            class108.field2705 = class107.method897(6, false, true, (byte) 117, true);
            class76.field1893 = class107.method897(7, true, false, (byte) 124, true);
            class42.field1088 = class107.method897(8, true, false, (byte) 127, true);
            class70.field1755 = class107.method897(9, true, false, (byte) 127, true);
            class62.field1545 = class107.method897(10, true, false, (byte) 125, true);
            class93.field2327 = class107.method897(11, true, false, (byte) 120, true);
            class109.field2742 = class107.method897(12, true, false, (byte) 118, true);
            class46.field1210 = 40;
            class123.field3082 = class52.field1365;
            class133.field3277 = 20;
        } else if (class46.field1210 == 40) {
            byte var7 = 0;
            int var8 = var7 + class52.field1381.method980(100) * 5 / 100;
            int var9 = var8 + class19.field658.method980(100) * 5 / 100;
            int var10 = var9 + class95.field2379.method980(100) * 5 / 100;
            int var11 = var10 + class131.field3203.method980(100) * 5 / 100;
            int var12 = var11 + class80.field2034.method980(100) * 5 / 100;
            int var13 = var12 + class128.field3134.method980(arg0) * 5 / 100;
            int var14 = var13 + class108.field2705.method980(100) * 5 / 100;
            int var15 = var14 + class76.field1893.method980(100) * 40 / 100;
            int var16 = var15 + class42.field1088.method980(100) * 5 / 100;
            int var17 = var16 + class70.field1755.method980(arg0) * 5 / 100;
            int var18 = var17 + class62.field1545.method980(100) * 5 / 100;
            int var19 = var18 + class93.field2327.method980(100) * 5 / 100;
            int var20 = var19 + class109.field2742.method980(100) * 5 / 100;
            if (var20 == 100) {
                class46.field1210 = 45;
                class123.field3082 = class73.field1785;
                class133.field3277 = 30;
            } else {
                if (var20 != 0) {
                    class123.field3082 = class116.method959(arg0 - 42, new class1[] { class42.field1107, class48.method504(var20, -1), class89.field2184 });
                }
                class133.field3277 = 30;
            }
        } else if (class46.field1210 == 45) {
            class60.method577(class39.field1072, 0, !class93.field2335, (byte) 30);
            class99.field2438 = class122.method996(class39.field1072, class122.field3052, arg0 ^ 0x74BE);
            class108.field2708 = new class98(22050, class5.field193);
            class46.field1210 = 50;
            class123.field3082 = class93.field2328;
            class133.field3277 = 35;
        } else if (class46.field1210 == 50) {
            int var21 = 0;
            if (class116.field2895 == null) {
                class116.field2895 = class52.method531(class42.field1088, arg0 + 155, class132.field3237, class57.field1456);
            } else {
                var21++;
            }
            if (class106.field2687 == null) {
                class106.field2687 = class52.method531(class42.field1088, 255, class132.field3237, class133.field3250);
            } else {
                var21++;
            }
            if (class116.field2905 == null) {
                class116.field2905 = class52.method531(class42.field1088, 255, class132.field3237, class60.field1529);
            } else {
                var21++;
            }
            if (var21 < 3) {
                class123.field3082 = class116.method959(59, new class1[] { class93.field2322, class48.method504(var21 * 100 / 3, -1), class89.field2184 });
                class133.field3277 = 40;
            } else {
                class46.field1210 = 60;
                class133.field3277 = 40;
                class123.field3082 = class42.field1103;
            }
        } else if (class46.field1210 == 60) {
            int var22 = class118.method969(class62.field1545, class42.field1088, arg0 ^ 0xFFFFFFEB);
            int var23 = class39.method433((byte) 119);
            if (var22 < var23) {
                class123.field3082 = class116.method959(arg0 ^ 0x35, new class1[] { class98.field2410, class48.method504(var22 * 100 / var23, -1), class89.field2184 });
                class133.field3277 = 50;
            } else {
                class123.field3082 = class134.field3308;
                class133.field3277 = 50;
                class34.method400(5, 80);
                class46.field1210 = 70;
            }
        } else if (class46.field1210 == 70) {
            if (class95.field2379.method231((byte) 98)) {
                class79.method726(class95.field2379, -76);
                class76.method705(class95.field2379, (byte) 85);
                class113.method933(3, class95.field2379, class76.field1893);
                class113.method936(28987, class76.field1893, class93.field2335, class95.field2379);
                class63.method606(class76.field1893, arg0 ^ 0xFFFFD57A, class95.field2379);
                class85.method751(class95.field2379, class45.field1185, class76.field1893, -313);
                class15.method269(false, class19.field658, class95.field2379, class52.field1381);
                class108.method906(arg0 ^ 0x38, class76.field1893, class95.field2379);
                class102.method871(-17552, class95.field2379);
                client.method290(class95.field2379, true);
                class19.method293(class131.field3203, class42.field1088, class76.field1893, (byte) 90);
                class46.field1210 = 80;
                class133.field3277 = 60;
                class123.field3082 = class85.field2141;
            } else {
                class123.field3082 = class116.method959(107, new class1[] { class72.field1765, class48.method504(class95.field2379.method985(false), -1), class89.field2184 });
                class133.field3277 = 60;
            }
        } else if (class46.field1210 == 80) {
            int var24 = 0;
            if (class47.field1241 == null) {
                class47.field1241 = class132.method1041(class42.field1088, class107.field2703, (byte) 21, class132.field3237);
            } else {
                var24++;
            }
            if (class28.field785 == null) {
                class28.field785 = class132.method1041(class42.field1088, class121.field3010, (byte) 21, class132.field3237);
            } else {
                var24++;
            }
            if (class28.field801 == null) {
                class28.field801 = class28.method373(class42.field1088, (byte) -66, class66.field1649, class132.field3237);
            } else {
                var24++;
            }
            if (class14.field471 == null) {
                class14.field471 = class12.method246(class42.field1088, 0, class54.field1443, class132.field3237);
            } else {
                var24++;
            }
            if (class47.field1233 == null) {
                class47.field1233 = class12.method246(class42.field1088, 0, class57.field1469, class132.field3237);
            } else {
                var24++;
            }
            if (class52.field1379 == null) {
                class52.field1379 = class12.method246(class42.field1088, 0, class119.field2968, class132.field3237);
            } else {
                var24++;
            }
            if (class4.field179 == null) {
                class4.field179 = class12.method246(class42.field1088, 0, class38.field1035, class132.field3237);
            } else {
                var24++;
            }
            if (class76.field1889 == null) {
                class76.field1889 = class12.method246(class42.field1088, 0, class105.field2649, class132.field3237);
            } else {
                var24++;
            }
            if (class92.field2280 == null) {
                class92.field2280 = class132.method1041(class42.field1088, class57.field1464, (byte) 21, class132.field3237);
            } else {
                var24++;
            }
            if (field681 == null) {
                field681 = class12.method246(class42.field1088, 0, class9.field326, class132.field3237);
            } else {
                var24++;
            }
            if (class78.field1929 == null) {
                class78.field1929 = class12.method246(class42.field1088, 0, class127.field3121, class132.field3237);
            } else {
                var24++;
            }
            if (class63.field1581 == null) {
                class63.field1581 = class12.method246(class42.field1088, 0, class6.field235, class132.field3237);
            } else {
                var24++;
            }
            if (class11.field366 == null) {
                class11.field366 = class28.method373(class42.field1088, (byte) -125, class1.field23, class132.field3237);
            } else {
                var24++;
            }
            if (class104.field2617 == null) {
                class104.field2617 = class28.method373(class42.field1088, (byte) -55, class79.field1932, class132.field3237);
            } else {
                var24++;
            }
            if (var24 < 14) {
                class123.field3082 = class116.method959(arg0 - 139, new class1[] { class31.field834, class48.method504(var24 * 100 / 14, -1), class89.field2184 });
                class133.field3277 = 70;
            } else {
                class28.field785.method559();
                int var25 = (int) (Math.random() * 21.0D) - 10;
                int var26 = (int) (Math.random() * 21.0D) - 10;
                int var27 = (int) (Math.random() * 41.0D) - 20;
                int var28 = (int) (Math.random() * 21.0D) - 10;
                for (int var29 = 0; var29 < class14.field471.length; var29++) {
                    class14.field471[var29].method550(var25 + var27, var26 - -var27, var28 + var27);
                }
                class28.field801[0].method335(var25 + var27, var26 + var27, var27 + var28);
                class123.field3082 = class60.field1530;
                class133.field3277 = 70;
                class46.field1210 = 85;
            }
        } else if (class46.field1210 == 85) {
            int var30 = class107.method895(class42.field1088, (byte) -59);
            int var31 = class42.method457(false);
            if (var30 < var31) {
                class123.field3082 = class116.method959(97, new class1[] { class63.field1600, class48.method504(var30 * 100 / var31, -1), class89.field2184 });
                class133.field3277 = 80;
            } else {
                class123.field3082 = class54.field1434;
                class46.field1210 = 90;
                class133.field3277 = 80;
            }
        } else if (class46.field1210 == 90) {
            if (class70.field1755.method231((byte) 62)) {
                class75 var32 = new class75(class70.field1755, class42.field1088, 20, 0.8D, class93.field2335 ? 64 : 128);
                class27.method358(var32);
                class27.method366(0.8D);
                class46.field1210 = 110;
                class133.field3277 = 90;
                class123.field3082 = class80.field2001;
            } else {
                class123.field3082 = class116.method959(85, new class1[] { class28.field794, class48.method504(class70.field1755.method985(false), -1), class89.field2184 });
                class133.field3277 = 90;
            }
        } else if (class46.field1210 == 110) {
            class23.field709 = new class81();
            class39.field1072.method659(10, 0, class23.field709);
            class123.field3082 = class28.field797;
            class46.field1210 = 120;
            class133.field3277 = 94;
        } else if (class46.field1210 == 120) {
            if (class62.field1545.method240(class52.field1391, class132.field3237, -1234)) {
                class132 var33 = new class132(class62.field1545.method216(class132.field3237, class52.field1391, arg0 - 99));
                class59.method570(true, var33);
                class46.field1210 = 130;
                class123.field3082 = class102.field2578;
                class133.field3277 = 96;
            } else {
                class123.field3082 = class116.method959(75, new class1[] { class19.field672, class112.field2775 });
                class133.field3277 = 96;
            }
        } else if (class46.field1210 != 130) {
            if (arg0 != 100) {
                field681 = null;
            }
            if (class46.field1210 == 140) {
                class34.method400(10, arg0 ^ 0x27);
            }
        } else if (!class131.field3203.method231((byte) 66)) {
            class123.field3082 = class116.method959(-98, new class1[] { class73.field1792, class48.method504(class131.field3203.method985(false) * 4 / 5, arg0 ^ -101), class89.field2184 });
            class133.field3277 = 100;
        } else if (class109.field2742.method231((byte) 69)) {
            class123.field3082 = class38.field1032;
            class46.field1210 = 140;
            class133.field3277 = 100;
        } else {
            class123.field3082 = class116.method959(94, new class1[] { class73.field1792, class48.method504(class109.field2742.method985(false) / 5 + 80, -1), class89.field2184 });
            class133.field3277 = 100;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Lmd;", line = 450)
    public static final class76 method318(byte arg0, int arg1) {
        class76 var2 = (class76) class106.field2666.method264((long) arg1, (byte) 43);
        field684++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class80.field2027.method218(arg1, 127, 1);
        class76 var4 = new class76();
        if (var3 != null) {
            var4.method707((byte) 127, arg1, new class8(var3));
        }
        var4.method704(true);
        if (arg0 >= -39) {
            field677 = null;
        }
        class106.field2666.method263(-7208, (long) arg1, var4);
        return var4;
    }
}
