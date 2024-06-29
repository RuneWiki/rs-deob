import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[Lmb;")
    public static class84[] field646 = new class84[200];

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    public static int[] field647 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Lmb;")
    public static class84 field654 = class79.method672(true, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field657 = 0;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Z")
    public static boolean field650 = false;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lmb;")
    public static class84 field659 = class79.method672(true, "headicons_prayer");

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Z")
    public static boolean field660 = true;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lmb;")
    public static class84 field645 = class79.method672(true, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!de", name = "u", descriptor = "Lmb;")
    public static class84 field665 = class79.method672(true, "redstone1");

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lmb;")
    private static class84 field664 = class79.method672(true, "Enter name of player to add to list");

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lmb;")
    public static class84 field648 = field664;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Lmb;")
    public static class84 field663 = class79.method672(true, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lfb;")
    public static class38 field652;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Lge;")
    public static class47 field655;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Lgf;")
    public static class48 field656;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILsd;I)Lr;")
    public static final class112 method195(int arg0, int arg1, class122 arg2, int arg3) {
        if (arg1 != 3) {
            method199(-59);
        }
        field653++;
        return class127.method1037(arg3, (byte) -74, arg2, arg0) ? class65.method591((byte) 48) : null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public static void method196(boolean arg0) {
        field648 = null;
        field652 = null;
        field665 = null;
        field646 = null;
        field663 = null;
        field645 = null;
        if (!arg0) {
            field646 = null;
        }
        field647 = null;
        field656 = null;
        field659 = null;
        field654 = null;
        field655 = null;
        field664 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method197(int arg0) {
        field661++;
        if (class124.field3012 && class13.field251 != class119.field2842) {
            class57.method507(class54.field1252, class40.field925.field3489[0], class40.field925.field3490[0], class13.field251, class53.field1191, true);
        } else if (arg0 == 0 && class13.field251 != class123.field2983) {
            class123.field2983 = class13.field251;
            class43.method316(class13.field251, 124);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static final void method198(int arg0) {
        field651++;
        if (class24.field572) {
            class125.method1027(88);
            class24.field572 = false;
            class1.method7(4095);
            class95.field2365 = true;
            class115.field2762 = true;
            class65.field1615 = true;
            class89.field2220 = true;
        }
        class46.method331(-3);
        if (class2.field42 && class117.field2784 == 1) {
            class89.field2220 = true;
        }
        if (class89.field2233 != -1) {
            boolean var1 = class36.method276(class89.field2233, true);
            if (var1) {
                class89.field2220 = true;
            }
        }
        if (class37.field829 == 2) {
            class89.field2220 = true;
        }
        if (class115.field2745 == 2) {
            class89.field2220 = true;
        }
        if (class89.field2220) {
            class89.field2220 = false;
            class41.method313((byte) -109);
        }
        if (class83.field2038 == -1) {
            class94.field2340.field1334 = class57.field1327 - class57.field1353 - 77;
            if (class20.field427 > 17 && class20.field427 < 560 && class60.field1498 > 332) {
                class77.method658(class60.field1498 - 357, 463, class57.field1327, -1, 77, class20.field427 - 17, class94.field2340, 0, 5393);
            }
            int var2 = class57.field1327 - class94.field2340.field1334 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class57.field1327 - 77) {
                var2 = class57.field1327 - 77;
            }
            if (class57.field1353 != var2) {
                class65.field1615 = true;
                class57.field1353 = var2;
            }
        }
        if (class83.field2038 == -1 && class92.field2289 == 3) {
            class94.field2340.field1334 = class53.field1190;
            int var3 = class106.field2572 * 14 + 7;
            if (class20.field427 > 17 && class20.field427 < 560 && class60.field1498 > 332) {
                class77.method658(class60.field1498 - 357, 463, var3, -1, 77, class20.field427 - 17, class94.field2340, 0, 5393);
            }
            int var4 = class94.field2340.field1334;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 - 77 < var4) {
                var4 = var3 - 77;
            }
            if (class53.field1190 != var4) {
                class53.field1190 = var4;
                class65.field1615 = true;
            }
        }
        if (class83.field2038 != -1) {
            boolean var5 = class36.method276(class83.field2038, true);
            if (var5) {
                class65.field1615 = true;
            }
        }
        if (class37.field829 == 3) {
            class65.field1615 = true;
        }
        if (class115.field2745 == 3) {
            class65.field1615 = true;
        }
        if (class68.field1658 != null) {
            class65.field1615 = true;
        }
        if (class2.field42 && class117.field2784 == 2) {
            class65.field1615 = true;
        }
        if (class65.field1615) {
            class65.field1615 = false;
            class51.method377(118);
        }
        method199(-8338);
        if (class128.field3085 != -1) {
            class95.field2365 = true;
        }
        if (class95.field2365) {
            if (class128.field3085 != -1 && class68.field1654 == class128.field3085) {
                class128.field3085 = -1;
                class80.field1978.method769((byte) 65, 2);
                class24.field556++;
                class80.field1978.method393(class68.field1654, -17343);
            }
            class94.field2335 = true;
            class95.field2365 = false;
            class22.method153(21104, class72.field1777, class68.field1654, class5.field100 % 20 >= 10 ? class128.field3085 : -1, class89.field2233 == -1);
        }
        if (class115.field2762) {
            class94.field2335 = true;
            class115.field2762 = false;
            class63.method571(class95.field2364, class88.field2214, class87.field2176, (byte) 122, class47.field1028);
        }
        class119.method968(class40.field925.field3535, 64, class40.field925.field3549, class108.field2613, class13.field251);
        class108.field2613 = 0;
        if (arg0 >= -10) {
            method199(65);
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    private static final void method199(int arg0) {
        class125.method1027(127);
        field658++;
        class68.method605(23723);
        if (class65.field1609 == 2 || class65.field1609 == 5) {
            byte[] var41 = class141.field3380.field2903;
            int[] var42 = class142.field3426;
            int var43 = var41.length;
            for (int var44 = 0; var44 < var43; var44++) {
                if (var41[var44] == 0) {
                    var42[var44] = 0;
                }
            }
            if (class65.field1609 < 3) {
                class129.field3121.method910(0, 0, 33, 33, 25, 25, class136.field3300, 256, class82.field2015, class62.field1543);
            }
            class96.method799((byte) -95);
            return;
        }
        int var1 = class136.field3300 + class120.field2892 & 0x7FF;
        int var2 = 464 - class40.field925.field3535 / 32;
        int var3 = class40.field925.field3549 / 32 + 48;
        class102.field2490.method910(25, 5, 146, 151, var3, var2, var1, class6.field106 + 256, class129.field3106, class72.field1776);
        for (int var4 = 0; var4 < class64.field1588; var4++) {
            int var39 = client.field494[var4] * 4 + 2 - class40.field925.field3549 / 32;
            int var40 = class107.field2595[var4] * 4 + 2 - class40.field925.field3535 / 32;
            class86.method744(var39, var40, (byte) -87, class143.field3439[var4]);
        }
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var35 = 0; var35 < 104; var35++) {
                class16 var36 = class39.field875[class13.field251][var5][var35];
                if (var36 != null) {
                    int var37 = var35 * 4 + 2 - class40.field925.field3535 / 32;
                    int var38 = var5 * 4 + 2 - class40.field925.field3549 / 32;
                    class86.method744(var38, var37, (byte) -95, class133.field3184[0]);
                }
            }
        }
        for (int var6 = 0; var6 < class77.field1940; var6++) {
            class103 var31 = class69.field1673[class87.field2146[var6]];
            if (var31 != null && var31.method569((byte) -116)) {
                class141 var32 = var31.field2510;
                if (var32 != null && var32.field3370 != null) {
                    var32 = var32.method1144(0);
                }
                if (var32 != null && var32.field3414 && var32.field3397) {
                    int var33 = var31.field3549 / 32 - class40.field925.field3549 / 32;
                    int var34 = var31.field3535 / 32 - class40.field925.field3535 / 32;
                    class86.method744(var33, var34, (byte) -60, class133.field3184[1]);
                }
            }
        }
        if (arg0 != -8338) {
            field665 = null;
        }
        for (int var7 = 0; var7 < class71.field1746; var7++) {
            class62 var23 = class44.field978[class80.field1990[var7]];
            if (var23 != null && var23.method569((byte) -97)) {
                int var24 = var23.field3535 / 32 - class40.field925.field3535 / 32;
                boolean var25 = false;
                int var26 = var23.field3549 / 32 - class40.field925.field3549 / 32;
                long var27 = var23.field1535.method700((byte) 25);
                for (int var29 = 0; var29 < class125.field3024; var29++) {
                    if (class30.field710[var29] == var27 && class71.field1741[var29] != 0) {
                        var25 = true;
                        break;
                    }
                }
                boolean var30 = false;
                if (class40.field925.field1526 != 0 && var23.field1526 != 0 && class40.field925.field1526 == var23.field1526) {
                    var30 = true;
                }
                if (var25) {
                    class86.method744(var26, var24, (byte) -87, class133.field3184[3]);
                } else if (var30) {
                    class86.method744(var26, var24, (byte) -71, class133.field3184[4]);
                } else {
                    class86.method744(var26, var24, (byte) -90, class133.field3184[2]);
                }
            }
        }
        if (class16.field339 != 0 && class5.field100 % 20 < 10) {
            if (class16.field339 == 1 && class38.field849 >= 0 && class38.field849 < class69.field1673.length) {
                class103 var8 = class69.field1673[class38.field849];
                if (var8 != null) {
                    int var9 = var8.field3549 / 32 - class40.field925.field3549 / 32;
                    int var10 = var8.field3535 / 32 - class40.field925.field3535 / 32;
                    class126.method1033(var9, var10, (byte) 34, class89.field2237[1]);
                }
            }
            if (class16.field339 == 2) {
                int var11 = (class133.field3170 - class10.field159) * 4 + 2 - class40.field925.field3535 / 32;
                int var12 = (class71.field1753 - class95.field2359) * 4 + 2 - class40.field925.field3549 / 32;
                class126.method1033(var12, var11, (byte) -128, class89.field2237[1]);
            }
            if (class16.field339 == 10 && class94.field2339 >= 0 && class94.field2339 < class44.field978.length) {
                class62 var13 = class44.field978[class94.field2339];
                if (var13 != null) {
                    int var14 = var13.field3535 / 32 - class40.field925.field3535 / 32;
                    int var15 = var13.field3549 / 32 - class40.field925.field3549 / 32;
                    class126.method1033(var15, var14, (byte) -78, class89.field2237[1]);
                }
            }
        }
        if (class1.field15 != 0) {
            int var16 = class40.field919 * 4 + 2 - class40.field925.field3535 / 32;
            int var17 = class1.field15 * 4 + 2 - class40.field925.field3549 / 32;
            class86.method744(var17, var16, (byte) -45, class89.field2237[0]);
        }
        class142.method1151(97, 78, 3, 3, 16777215);
        if (class65.field1609 >= 3) {
            byte[] var18 = class141.field3380.field2903;
            int[] var19 = class142.field3426;
            for (int var20 = 0; var20 <= 33; var20++) {
                int var21 = class141.field3380.field2904 * var20;
                for (int var22 = 0; var22 <= 33; var22++) {
                    if (var18[var21 + var22] == 0) {
                        var19[var21 + var22] = 0;
                    }
                }
            }
        } else {
            class129.field3121.method910(0, 0, 33, 33, 25, 25, class136.field3300, 256, class82.field2015, class62.field1543);
        }
        class96.method799((byte) 95);
    }
}
