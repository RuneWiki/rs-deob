import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 {

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lsc;")
    public static class128 field1599 = class129.method1017(false, "<)4col>");

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lrb;")
    public static class120 field1591 = new class120(64);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    private int field1604;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "J")
    private long field1598;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "J")
    private long field1607;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Z")
    public boolean field1603;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
    private int[] field1587;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
    private int[] field1593;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I[IZ)V")
    public final void method528(int arg0, int arg1, int[] arg2, int[] arg3, boolean arg4) {
        field1605++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class86.field1932; var7++) {
                    class125 var8 = class44.method315(false, var7);
                    if (var8 != null && !var8.field2825 && var6 + (arg4 ? 7 : 0) == var8.field2836) {
                        arg2[class105.field2400[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        if (arg0 != 0) {
            method535(40);
        }
        this.field1587 = arg3;
        this.field1604 = arg1;
        this.field1603 = arg4;
        this.field1593 = arg2;
        this.method536(true);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method529(byte arg0) {
        field1596++;
        int var1 = -122 % ((-arg0 - 37) / 53);
        if (class151.field3460 == 0) {
            class154.field3553 = new class13(4, 104, 104, class55.field1229);
            for (int var2 = 0; var2 < 4; var2++) {
                class104.field2359[var2] = new class23(104, 104);
            }
            class156.field3581 = new class8(512, 512);
            class151.field3460 = 20;
            class132.field3058 = class5.field60;
            class14.field275 = 5;
        } else if (class151.field3460 == 20) {
            int[] var3 = new int[9];
            for (int var4 = 0; var4 < 9; var4++) {
                int var5 = var4 * 32 + 128 + 15;
                int var6 = var5 * 3 + 600;
                int var7 = class114.field2564[var5];
                var3[var4] = var6 * var7 >> 16;
            }
            class13.method101(var3, 500, 800, 512, 334);
            class132.field3058 = class70.field1563;
            class14.field275 = 10;
            class151.field3460 = 30;
        } else if (class151.field3460 == 30) {
            class120.field2728 = class154.method1218(-124, true, false, true, 0);
            class87.field1985 = class154.method1218(-125, true, false, true, 1);
            class67.field1514 = class154.method1218(-116, true, true, false, 2);
            class147.field3397 = class154.method1218(-126, true, false, true, 3);
            class108.field2446 = class154.method1218(-106, true, false, true, 4);
            class1.field1 = class154.method1218(-123, true, true, true, 5);
            class36.field701 = class154.method1218(-101, false, true, true, 6);
            class119.field2706 = class154.method1218(-113, true, false, true, 7);
            class135.field3184 = class154.method1218(-106, true, false, true, 8);
            class54.field1118 = class154.method1218(-126, true, false, true, 9);
            class12.field205 = class154.method1218(-102, true, false, true, 10);
            class146.field3377 = class154.method1218(-109, true, false, true, 11);
            class95.field2234 = class154.method1218(-126, true, false, true, 12);
            class92.field2080 = class154.method1218(-105, true, true, false, 13);
            class11.field181 = class154.method1218(-118, false, false, true, 14);
            class156.field3583 = class154.method1218(-122, true, false, true, 15);
            class132.field3058 = class120.field2719;
            class151.field3460 = 40;
            class14.field275 = 20;
        } else if (class151.field3460 == 40) {
            byte var8 = 0;
            int var9 = var8 + class120.field2728.method26(100) * 4 / 100;
            int var10 = var9 + class87.field1985.method26(100) * 4 / 100;
            int var11 = var10 + class67.field1514.method26(100) * 2 / 100;
            int var12 = var11 + class147.field3397.method26(100) * 2 / 100;
            int var13 = var12 + class108.field2446.method26(100) * 6 / 100;
            int var14 = var13 + class1.field1.method26(100) * 4 / 100;
            int var15 = var14 + class36.field701.method26(100) * 2 / 100;
            int var16 = var15 + class119.field2706.method26(100) * 60 / 100;
            int var17 = var16 + class135.field3184.method26(100) * 2 / 100;
            int var18 = var17 + class54.field1118.method26(100) * 2 / 100;
            int var19 = var18 + class12.field205.method26(100) * 2 / 100;
            int var20 = var19 + class146.field3377.method26(100) * 2 / 100;
            int var21 = var20 + class95.field2234.method26(100) * 2 / 100;
            int var22 = var21 + class92.field2080.method26(100) * 2 / 100;
            int var23 = var22 + class11.field181.method26(100) * 2 / 100;
            int var24 = var23 + class156.field3583.method26(100) * 2 / 100;
            if (var24 == 100) {
                class14.field275 = 30;
                class132.field3058 = class128.field2894;
                class151.field3460 = 45;
            } else {
                if (var24 != 0) {
                    class132.field3058 = class51.method395(new class128[] { class30.field594, class111.method857(var24, (byte) 124), class124.field2801 }, false);
                }
                class14.field275 = 30;
            }
        } else if (class151.field3460 == 45) {
            class6.method17(22050, !class110.field2487, 113, 2);
            class49 var25 = new class49();
            var25.method376(9, 128, (byte) -89);
            class27.field521 = class58.method443(-11911, class127.field2888, 22050, class144.field3353, 0);
            class27.field521.method723(-27293, var25);
            class103.method773(class108.field2446, 4797, class156.field3583, class11.field181, var25);
            class124.field2814 = class58.method443(-11911, class127.field2888, 2048, class144.field3353, 1);
            class92.field2088 = new class57();
            class124.field2814.method723(-27293, class92.field2088);
            class72.field1620 = new class21(22050, class49.field920);
            class14.field275 = 35;
            class132.field3058 = class2.field18;
            class151.field3460 = 50;
        } else if (class151.field3460 == 50) {
            int var26 = 0;
            if (class124.field2815 == null) {
                class124.field2815 = class73.method550(class92.field2080, class18.field323, (byte) 49, class135.field3184, class46.field856);
            } else {
                var26++;
            }
            if (class137.field3235 == null) {
                class137.field3235 = class73.method550(class92.field2080, class18.field323, (byte) 43, class135.field3184, class134.field3157);
            } else {
                var26++;
            }
            if (class97.field2255 == null) {
                class97.field2255 = class73.method550(class92.field2080, class18.field323, (byte) 125, class135.field3184, class146.field3378);
            } else {
                var26++;
            }
            if (var26 < 3) {
                class132.field3058 = class51.method395(new class128[] { class95.field2225, class111.method857(var26 * 100 / 3, (byte) 108), class124.field2801 }, false);
                class14.field275 = 40;
            } else {
                class151.field3460 = 60;
                class132.field3058 = class37.field718;
                class14.field275 = 40;
            }
        } else if (class151.field3460 == 60) {
            int var27 = class50.method388(class12.field205, 125, class135.field3184);
            int var28 = class134.method1082((byte) 102);
            if (var28 > var27) {
                class132.field3058 = class51.method395(new class128[] { class58.field1248, class111.method857(var27 * 100 / var28, (byte) 104), class124.field2801 }, false);
                class14.field275 = 50;
            } else {
                class132.field3058 = class66.field1471;
                class14.field275 = 50;
                class23.method206(20, 5);
                class151.field3460 = 70;
            }
        } else if (class151.field3460 == 70) {
            if (class67.field1514.method1028(0)) {
                class131.method1039(class67.field1514, 114);
                class154.method1217(-5107, class67.field1514);
                client.method189(class67.field1514, 3, class119.field2706);
                class94.method739(class119.field2706, class67.field1514, (byte) -112, class110.field2487);
                class106.method791((byte) -104, class67.field1514, class119.field2706);
                class82.method603(class119.field2706, class124.field2815, true, class40.field740, class67.field1514);
                class137.method1124(class87.field1985, class120.field2728, class67.field1514, 1715051808);
                class152.method1205((byte) 62, class119.field2706, class67.field1514);
                class55.method428(-119, class67.field1514);
                class29.method236((byte) -70, class67.field1514);
                class144.method1170(class92.field2080, class119.field2706, -96, class147.field3397, class135.field3184);
                class89.method697(class67.field1514, 1);
                class77.method564(true, class67.field1514);
                class132.field3058 = class31.field609;
                class14.field275 = 60;
                class151.field3460 = 80;
            } else {
                class132.field3058 = class51.method395(new class128[] { class124.field2809, class111.method857(class67.field1514.method19((byte) 115), (byte) 106), class124.field2801 }, false);
                class14.field275 = 60;
            }
        } else if (class151.field3460 == 80) {
            int var29 = 0;
            if (class122.field2778 == null) {
                class122.field2778 = class108.method841(class18.field323, class121.field2764, -2, class135.field3184);
            } else {
                var29++;
            }
            if (class43.field802 == null) {
                class43.field802 = class108.method841(class18.field323, class158.field3638, -2, class135.field3184);
            } else {
                var29++;
            }
            if (class97.field2264 == null) {
                class97.field2264 = class50.method392(class7.field107, -46, class135.field3184, class18.field323);
            } else {
                var29++;
            }
            if (class125.field2821 == null) {
                class125.field2821 = class65.method489(class95.field2245, true, class18.field323, class135.field3184);
            } else {
                var29++;
            }
            if (client.field427 == null) {
                client.field427 = class65.method489(class36.field687, true, class18.field323, class135.field3184);
            } else {
                var29++;
            }
            if (class58.field1246 == null) {
                class58.field1246 = class65.method489(class112.field2512, true, class18.field323, class135.field3184);
            } else {
                var29++;
            }
            if (class115.field2585 == null) {
                class115.field2585 = class65.method489(class23.field467, true, class18.field323, class135.field3184);
            } else {
                var29++;
            }
            if (class104.field2374 == null) {
                class104.field2374 = class65.method489(class158.field3622, true, class18.field323, class135.field3184);
            } else {
                var29++;
            }
            if (class105.field2402 == null) {
                class105.field2402 = class65.method489(class89.field2040, true, class18.field323, class135.field3184);
            } else {
                var29++;
            }
            if (class159.field3644 == null) {
                class159.field3644 = class65.method489(class158.field3627, true, class18.field323, class135.field3184);
            } else {
                var29++;
            }
            if (class21.field404 == null) {
                class21.field404 = class65.method489(class49.field871, true, class18.field323, class135.field3184);
            } else {
                var29++;
            }
            if (class119.field2688 == null) {
                class119.field2688 = class50.method392(class77.field1681, 97, class135.field3184, class18.field323);
            } else {
                var29++;
            }
            if (class70.field1566 == null) {
                class70.field1566 = class50.method392(class84.field1863, 104, class135.field3184, class18.field323);
            } else {
                var29++;
            }
            if (class115.field2600 == null) {
                class115.field2600 = class149.method1189(6858, class135.field3184, class18.field323, class152.field3510);
            } else {
                var29++;
            }
            if (var29 < 14) {
                class132.field3058 = class51.method395(new class128[] { class157.field3606, class111.method857(var29 * 100 / 14, (byte) 112), class124.field2801 }, false);
                class14.field275 = 70;
            } else {
                int var30 = (int) (Math.random() * 21.0D) - 10;
                int var31 = (int) (Math.random() * 21.0D) - 10;
                class133.field3115 = class70.field1566;
                int var32 = (int) (Math.random() * 21.0D) - 10;
                class43.field802.method54();
                int var33 = (int) (Math.random() * 41.0D) - 20;
                for (int var34 = 0; var34 < class125.field2821.length; var34++) {
                    class125.field2821[var34].method53(var31 + var33, var30 + var33, var32 + var33);
                }
                class97.field2264[0].method433(var31 + var33, var30 - -var33, var32 + var33);
                class131.method1032(-1);
                class151.field3460 = 90;
                class14.field275 = 70;
                class132.field3058 = class112.field2521;
            }
        } else if (class151.field3460 == 90) {
            if (class54.field1118.method1028(0)) {
                class115 var35 = new class115(class54.field1118, class135.field3184, 20, 0.8D, class110.field2487 ? 64 : 128);
                class114.method878(var35);
                class114.method870(0.8D);
                class151.field3460 = 110;
                class14.field275 = 90;
                class132.field3058 = class21.field402;
            } else {
                class132.field3058 = class51.method395(new class128[] { class143.field3350, class111.method857(class54.field1118.method19((byte) 104), (byte) -20), class124.field2801 }, false);
                class14.field275 = 90;
            }
        } else if (class151.field3460 == 110) {
            class73.field1641 = new class116();
            class144.field3353.method86(class73.field1641, 95, 10);
            class132.field3058 = class5.field57;
            class151.field3460 = 120;
            class14.field275 = 94;
        } else if (class151.field3460 == 120) {
            if (class12.field205.method1037((byte) 119, class30.field578, class18.field323)) {
                class126 var36 = new class126(class12.field205.method1029(class18.field323, -1, class30.field578));
                class100.method766(0, var36);
                class14.field275 = 96;
                class151.field3460 = 130;
                class132.field3058 = class86.field1931;
            } else {
                class132.field3058 = class51.method395(new class128[] { class149.field3432, class9.field148 }, false);
                class14.field275 = 96;
            }
        } else if (class151.field3460 == 130) {
            if (!class147.field3397.method1028(0)) {
                class132.field3058 = class51.method395(new class128[] { class137.field3239, class111.method857(class147.field3397.method19((byte) 114) * 4 / 5, (byte) 100), class124.field2801 }, false);
                class14.field275 = 100;
            } else if (!class95.field2234.method1028(0)) {
                class132.field3058 = class51.method395(new class128[] { class137.field3239, class111.method857(class95.field2234.method19((byte) 109) / 6 + 80, (byte) 107), class124.field2801 }, false);
                class14.field275 = 100;
            } else if (class92.field2080.method1028(0)) {
                class151.field3460 = 140;
                class14.field275 = 100;
                class132.field3058 = client.field453;
            } else {
                class132.field3058 = class51.method395(new class128[] { class137.field3239, class111.method857(class92.field2080.method19((byte) 111) / 20 + 96, (byte) 100), class124.field2801 }, false);
                class14.field275 = 100;
            }
        } else if (class151.field3460 == 140) {
            class23.method206(20, 10);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lhe;III)V")
    public static final void method530(class54 arg0, int arg1, int arg2, int arg3) {
        field1601++;
        if (class43.field814 != null || class135.field3180 || (arg0 == null || class20.method173((byte) -1, arg0) == null)) {
            return;
        }
        class43.field814 = arg0;
        class37.field727 = class20.method173((byte) -97, arg0);
        client.field433 = 0;
        if (arg2 == 3) {
            class25.field504 = false;
            class25.field505 = arg1;
            class144.field3355 = arg3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I")
    public final int method531(byte arg0) {
        if (arg0 >= -43) {
            field1591 = null;
        }
        field1594++;
        return this.field1604 == -1 ? (this.field1593[8] << 10) + (this.field1593[0] << 15) + (this.field1587[0] << 25) + (this.field1587[4] << 20) + (this.field1593[11] << 5) + this.field1593[1] : class69.method518(true, this.field1604).field1311 + 305419896;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
    public static void method532(byte arg0) {
        field1599 = null;
        field1591 = null;
        if (arg0 > -66) {
            method542(121, -97);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLsf;II)[Li;")
    public static final class56[] method533(byte arg0, class131 arg1, int arg2, int arg3) {
        field1600++;
        if (class100.method765(arg1, 100, arg3, arg2)) {
            if (arg0 != -35) {
                method529((byte) -99);
            }
            return class36.method261((byte) -70);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V")
    public static final void method534(byte arg0) {
        field1606++;
        if (arg0 != -70) {
            method542(-118, -103);
        }
        if (class115.field2603 != null || class43.field814 != null) {
            return;
        }
        int var1 = class120.field2726;
        if (class135.field3180) {
            if (var1 != 1) {
                int var2 = class64.field1380;
                int var3 = class18.field330;
                if (var2 < class99.field2298 - 10 || var2 > class99.field2298 + class149.field3441 + 10 || var3 < class100.field2306 - 10 || class92.field2082 + class100.field2306 + 10 < var3) {
                    class135.field3180 = false;
                    class19.method169((byte) -58, class99.field2298, class149.field3441, class92.field2082, class100.field2306);
                }
            }
            if (var1 == 1) {
                int var4 = class99.field2298;
                int var5 = class100.field2306;
                int var6 = class149.field3441;
                int var7 = class43.field806;
                int var8 = class9.field133;
                int var9 = -1;
                for (int var10 = 0; var10 < class7.field103; var10++) {
                    int var11 = (class7.field103 - var10 - 1) * 15 + var5 + 31;
                    if (var4 < var7 && var4 + var6 > var7 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class25.method221(var9, false);
                }
                class135.field3180 = false;
                class19.method169((byte) -58, class99.field2298, class149.field3441, class92.field2082, class100.field2306);
                return;
            }
            return;
        }
        if (var1 == 1 && class7.field103 > 0) {
            int var12 = class121.field2760[class7.field103 - 1];
            if (var12 == 31 || var12 == 17 || var12 == 29 || var12 == 30 || var12 == 16 || var12 == 22 || var12 == 57 || var12 == 44 || var12 == 11 || var12 == 28 || var12 == 9 || var12 == 1002) {
                int var13 = class82.field1840[class7.field103 - 1];
                int var14 = class67.field1518[class7.field103 - 1];
                class54 var15 = class46.method338(var14, 95);
                if (class135.method1093(class77.method561(54, var15), (byte) -108) || class35.method256(class77.method561(43, var15), 1)) {
                    class72.field1615 = false;
                    class127.field2879 = 0;
                    if (class115.field2603 != null) {
                        class89.method696(class115.field2603, arg0 ^ 0xFFFFFFBB);
                    }
                    class115.field2603 = class46.method338(var14, -80);
                    class84.field1862 = var13;
                    class2.field27 = class9.field133;
                    class103.field2343 = class43.field806;
                    class89.method696(class115.field2603, arg0 ^ 0xFFFFFFBB);
                    return;
                }
            }
        }
        if (var1 == 1 && (class49.field912 == 1 && class7.field103 > 2 || class134.method1089(class7.field103 - 1, false))) {
            var1 = 2;
        }
        if (var1 == 1 && class7.field103 > 0) {
            class25.method221(class7.field103 - 1, false);
        }
        if (var1 != 2 || class7.field103 <= 0) {
            return;
        }
        class7.method32(108);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method535(int arg0) {
        if (arg0 != 2) {
            return;
        }
        boolean var1 = false;
        field1592++;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class7.field103 - 1; var2++) {
                if (class121.field2760[var2] < 1000 && class121.field2760[var2 + 1] > 1000) {
                    var1 = false;
                    class128 var3 = class105.field2394[var2];
                    class105.field2394[var2] = class105.field2394[var2 + 1];
                    class105.field2394[var2 + 1] = var3;
                    class128 var4 = class120.field2738[var2];
                    class120.field2738[var2] = class120.field2738[var2 + 1];
                    class120.field2738[var2 + 1] = var4;
                    int var5 = class121.field2760[var2];
                    class121.field2760[var2] = class121.field2760[var2 + 1];
                    class121.field2760[var2 + 1] = var5;
                    int var6 = class82.field1840[var2];
                    class82.field1840[var2] = class82.field1840[var2 + 1];
                    class82.field1840[var2 + 1] = var6;
                    int var7 = class67.field1518[var2];
                    class67.field1518[var2] = class67.field1518[var2 + 1];
                    class67.field1518[var2 + 1] = var7;
                    int var8 = class41.field764[var2];
                    class41.field764[var2] = class41.field764[var2 + 1];
                    class41.field764[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    private final void method536(boolean arg0) {
        long var2 = this.field1607;
        this.field1607 = 0L;
        int var4 = this.field1593[9];
        int var5 = this.field1593[5];
        this.field1593[9] = var5;
        this.field1593[5] = var4;
        field1588++;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1607 <<= 0x4;
            if (this.field1593[var6] >= 256) {
                this.field1607 += this.field1593[var6] - 256;
            }
        }
        if (this.field1593[0] >= 256) {
            this.field1607 += this.field1593[0] - 256 >> 4;
        }
        if (this.field1593[1] >= 256) {
            this.field1607 += this.field1593[1] - 256 >> 8;
        }
        if (!arg0) {
            return;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1607 <<= 0x3;
            this.field1607 += this.field1587[var7];
        }
        this.field1607 <<= 0x1;
        this.field1593[9] = var4;
        this.field1593[5] = var5;
        this.field1607 += this.field1603 ? 1 : 0;
        if (var2 != 0L && this.field1607 != var2) {
            class14.field284.method911(var2, (byte) 29);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZ)V")
    public final void method537(int arg0, int arg1, boolean arg2) {
        field1589++;
        int var4 = this.field1587[arg0];
        if (arg2) {
            var4++;
            if (class21.field403[arg0].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class21.field403[arg0].length - 1;
            }
        }
        this.field1587[arg0] = var4;
        if (arg1 == 28160) {
            this.method536(true);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZI)V")
    public final void method538(int arg0, boolean arg1, int arg2) {
        if (arg2 > -112) {
            return;
        }
        field1582++;
        if (arg0 == 1 && this.field1603) {
            return;
        }
        int var4 = this.field1593[class105.field2400[arg0]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class125 var5;
        do {
            if (arg1) {
                var4++;
                if (var4 >= class86.field1932) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class86.field1932 - 1;
                }
            }
            var5 = class44.method315(false, var4);
        } while (var5 == null || var5.field2825 || (this.field1603 ? 7 : 0) + arg0 != var5.field2836);
        this.field1593[class105.field2400[arg0]] = var4 + 256;
        this.method536(true);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
    public final void method539(int arg0, boolean arg1) {
        field1585++;
        int var3 = -34 / ((arg0 - 32) / 45);
        if (arg1 != this.field1603) {
            this.method528(0, -1, null, this.field1587, arg1);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILmc;)V")
    public final void method540(int arg0, class86 arg1) {
        arg1.method653(this.field1603 ? 1 : 0, arg0 - 3070);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1593[class105.field2400[var3]];
            if (var5 == 0) {
                arg1.method653(-1, 0);
            } else {
                arg1.method653(var5 - 256, 0);
            }
        }
        field1595++;
        int var4 = 0;
        if (arg0 != 3070) {
            field1602 = -111;
        }
        while (var4 < 5) {
            arg1.method653(this.field1587[var4], 0);
            var4++;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static final void method541(int arg0) {
        field1584++;
        if (arg0 <= 48) {
            field1602 = 104;
        }
        int var1 = class158.field3626.method512(8, (byte) -78);
        if (var1 < class134.field3151) {
            for (int var2 = var1; var2 < class134.field3151; var2++) {
                class124.field2799[class97.field2260++] = class65.field1441[var2];
            }
        }
        if (var1 > class134.field3151) {
            throw new RuntimeException("gppov1");
        }
        class134.field3151 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class65.field1441[var3];
            class53 var5 = class106.field2421[var4];
            int var6 = class158.field3626.method512(1, (byte) -78);
            if (var6 == 0) {
                class65.field1441[class134.field3151++] = var4;
                var5.field1006 = class29.field554;
            } else {
                int var7 = class158.field3626.method512(2, (byte) -78);
                if (var7 == 0) {
                    class65.field1441[class134.field3151++] = var4;
                    var5.field1006 = class29.field554;
                    class55.field1228[class124.field2802++] = var4;
                } else if (var7 == 1) {
                    class65.field1441[class134.field3151++] = var4;
                    var5.field1006 = class29.field554;
                    int var8 = class158.field3626.method512(3, (byte) -78);
                    var5.method386(-34, false, var8);
                    int var9 = class158.field3626.method512(1, (byte) -78);
                    if (var9 == 1) {
                        class55.field1228[class124.field2802++] = var4;
                    }
                } else if (var7 == 2) {
                    class65.field1441[class134.field3151++] = var4;
                    var5.field1006 = class29.field554;
                    int var10 = class158.field3626.method512(3, (byte) -78);
                    var5.method386(-82, true, var10);
                    int var11 = class158.field3626.method512(3, (byte) -78);
                    var5.method386(-63, true, var11);
                    int var12 = class158.field3626.method512(1, (byte) -78);
                    if (var12 == 1) {
                        class55.field1228[class124.field2802++] = var4;
                    }
                } else if (var7 == 3) {
                    class124.field2799[class97.field2260++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
    public static final void method542(int arg0, int arg1) {
        field1597++;
        class5.method14(17688);
        class141.method1156(arg0 + 15017);
        int var2 = class84.method616(arg0 + 15067, arg1).field1609;
        if (var2 == 0) {
            return;
        }
        int var3 = class126.field2849[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class114.method870(0.9D);
                ((class115) class114.field2560).method891(0.9D, (byte) 106);
            }
            if (var3 == 2) {
                class114.method870(0.8D);
                ((class115) class114.field2560).method891(0.8D, (byte) -90);
            }
            if (var3 == 3) {
                class114.method870(0.7D);
                ((class115) class114.field2560).method891(0.7D, (byte) 107);
            }
            if (var3 == 4) {
                class114.method870(0.6D);
                ((class115) class114.field2560).method891(0.6D, (byte) -65);
            }
            class14.method150(true);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class149.field3440 != var4) {
                if (class149.field3440 == 0 && class141.field3305 != -1) {
                    class79.method595(0, class36.field701, 1, class141.field3305, false, var4);
                    class67.field1511 = false;
                } else if (var4 == 0) {
                    class35.method255((byte) -82);
                    class67.field1511 = false;
                } else {
                    class36.method263(var4, (byte) -56);
                }
                class149.field3440 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class50.field967 = 127;
            }
            if (var3 == 1) {
                class50.field967 = 96;
            }
            if (var3 == 2) {
                class50.field967 = 64;
            }
            if (var3 == 3) {
                class50.field967 = 32;
            }
            if (var3 == 4) {
                class50.field967 = 0;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class143.field3348 = 127;
            }
            if (var3 == 1) {
                class143.field3348 = 96;
            }
            if (var3 == 2) {
                class143.field3348 = 64;
            }
            if (var3 == 3) {
                class143.field3348 = 32;
            }
            if (var3 == 4) {
                class143.field3348 = 0;
            }
        }
        if (var2 == 6) {
            class105.field2380 = var3;
        }
        if (var2 == 5) {
            class49.field912 = var3;
        }
        if (arg0 != -15128) {
            method533((byte) 49, null, 11, 110);
        }
        if (var2 == 9) {
            class104.field2367 = var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)Ltd;")
    public final class136 method543(int arg0) {
        field1590++;
        if (this.field1604 != -1) {
            return class69.method518(true, this.field1604).method453(-1);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1593[var3];
            if (var12 >= 256 && var12 < 512 && !class44.method315(false, var12 - 256).method950(27762)) {
                var2 = true;
            }
            if (var12 >= 512 && !class27.method230((byte) -44, var12 - 512).method479(this.field1603, -9)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class136[] var4 = new class136[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1593[var6];
            if (var9 >= 256 && var9 < 512) {
                class136 var10 = class44.method315(false, var9 - 256).method949(true);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class136 var11 = class27.method230((byte) -44, var9 - 512).method472(arg0 ^ 0x4A, this.field1603);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class136 var7 = new class136(var4, var5);
        if (arg0 != -4) {
            method533((byte) 50, null, -127, -69);
        }
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field1587[var8] < class21.field403[var8].length) {
                var7.method1111(class20.field364[var8], class21.field403[var8][this.field1587[var8]]);
            }
            if (class21.field408[var8].length > this.field1587[var8]) {
                var7.method1111(class89.field2041[var8], class21.field408[var8][this.field1587[var8]]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILtb;Ltb;II)Llb;")
    public final class78 method544(int arg0, class134 arg1, class134 arg2, int arg3, int arg4) {
        field1586++;
        if (this.field1604 != -1) {
            return class69.method518(true, this.field1604).method460(arg1, arg4, -1, arg3, arg2);
        }
        long var6 = this.field1607;
        int[] var8 = this.field1593;
        if (arg1 != null && (arg1.field3143 >= 0 || arg1.field3168 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1593[var9];
            }
            if (arg1.field3143 >= 0) {
                var6 += arg1.field3143 - this.field1593[5] << 8;
                var8[5] = arg1.field3143;
            }
            if (arg1.field3168 >= 0) {
                var6 += arg1.field3168 - this.field1593[3] << 16;
                var8[3] = arg1.field3168;
            }
        }
        class78 var10 = (class78) class14.field284.method917(var6, -1);
        if (arg0 < 99) {
            return null;
        }
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class44.method315(false, var21 - 256).method957(192)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class27.method230((byte) -44, var21 - 512).method471((byte) 60, this.field1603)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1598 != -1L) {
                    var10 = (class78) class14.field284.method917(this.field1598, -1);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class136[] var13 = new class136[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class136 var19 = class44.method315(false, var18 - 256).method951(-2);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class136 var20 = class27.method230((byte) -44, var18 - 512).method484(this.field1603, 65536);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class136 var16 = new class136(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field1587[var17] < class21.field403[var17].length) {
                        var16.method1111(class20.field364[var17], class21.field403[var17][this.field1587[var17]]);
                    }
                    if (class21.field408[var17].length > this.field1587[var17]) {
                        var16.method1111(class89.field2041[var17], class21.field408[var17][this.field1587[var17]]);
                    }
                }
                var10 = var16.method1096(64, 850, -30, -50, -30);
                class14.field284.method913(var6, var10, (byte) -128);
                this.field1598 = var6;
            }
        }
        if (arg1 == null && arg2 == null) {
            return var10;
        }
        class78 var22;
        if (arg1 != null && arg2 != null) {
            var22 = arg1.method1080(arg4, arg2, false, var10, arg3);
        } else if (arg1 == null) {
            var22 = arg2.method1083(var10, 95, arg4);
        } else {
            var22 = arg1.method1083(var10, 85, arg3);
        }
        return var22;
    }
}
