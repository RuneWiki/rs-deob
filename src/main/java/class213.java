import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class213 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3569 = 0;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Lbd;")
    public static class162 field3574 = class17.method142(0, "<col=ffff00>");

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Lbd;")
    public static class162 field3575 = class17.method142(0, "(U2");

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Z")
    public static boolean field3570 = false;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Lbd;")
    public static class162 field3578 = class17.method142(0, "(U");

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Lbd;")
    public static class162 field3572 = class17.method142(0, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "[[[B")
    public static byte[][][] field3580 = new byte[4][104][104];

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Lda;")
    public static class143 field3577;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "[Ldc;")
    public static class71[] field3579;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V", line = 18)
    public static final void method1556(int arg0, boolean arg1) {
        field3576++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class126.field2292[arg0];
        int var3 = class105.field1911[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (arg1) {
            method1556(54, true);
        }
        int var4 = (int) class240.field4002[arg0];
        int var5 = class35.field589[arg0];
        long var6 = class240.field4002[arg0];
        if (var3 == 25) {
            class187.field3229.method338(65, (byte) 8);
            class186.field3212++;
            class187.field3229.method746(127, var5);
            class187.field3229.method751(var4, -1044017976);
            class187.field3229.method731(-4, var2);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 41 && class243.field4040 == null) {
            class6.method28(var5, -125, var2);
            class243.field4040 = class112.method903(var5, var2, -25988);
            class55.method386(0, class243.field4040);
        }
        if (var3 == 1005) {
            class34.field551 = 0;
            class225.field3751 = class183.field3158;
            class286.field4822 = class153.field2721;
            class110.field1977 = 2;
            class60 var8 = class204.field3446[var4];
            if (var8 != null) {
                class83 var9 = var8.field926;
                if (var9.field1502 != null) {
                    var9 = var9.method643(!arg1);
                }
                if (var9 != null) {
                    class314.field5295++;
                    class187.field3229.method338(93, (byte) 8);
                    class187.field3229.method759(false, var9.field1443);
                }
            }
        }
        if (var3 == 20) {
            boolean var10 = class163.method1292(class122.field2215.field5050[0], 2, false, 0, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 0, 1);
            class72.field1153++;
            if (!var10) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 1, 1);
            }
            class110.field1977 = 2;
            class225.field3751 = class183.field3158;
            class286.field4822 = class153.field2721;
            class34.field551 = 0;
            class187.field3229.method338(152, (byte) 8);
            class187.field3229.method737(-118, class258.field4294 + var5);
            class187.field3229.method759(false, var4);
            class187.field3229.method737(-123, var2 + class178.field3052);
        }
        if (var3 == 46) {
            class39 var12 = class270.field4520[var4];
            if (var12 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var12.field5050[0], 0, class122.field2215.field5034[0], var12.field5034[0], 0, 1, 1);
                class275.field4567++;
                class225.field3751 = class183.field3158;
                class286.field4822 = class153.field2721;
                class110.field1977 = 2;
                class34.field551 = 0;
                class187.field3229.method338(199, (byte) 8);
                class187.field3229.method751(var4, -1044017976);
            }
        }
        if (var3 == 1004) {
            class78 var13 = class61.method419((byte) 28, var5);
            if (var13 == null || var13.field1368[var2] < 100000) {
                class51.field821++;
                class187.field3229.method338(233, (byte) 8);
                class187.field3229.method759(false, var4);
            } else {
                class82.method633(0, class135.method1062(new class162[] { class156.method1212(10, var13.field1368[var2]), class267.field4457, class304.method2075(var4, 4).field2091 }, !arg1), class244.field4053, -48);
            }
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 14) {
            class60 var14 = class204.field3446[var4];
            if (var14 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var14.field5050[0], 0, class122.field2215.field5034[0], var14.field5034[0], 0, 1, 1);
                class225.field3751 = class183.field3158;
                class34.field551 = 0;
                class110.field1977 = 2;
                class286.field4822 = class153.field2721;
                class136.field2423++;
                class187.field3229.method338(21, (byte) 8);
                class187.field3229.method759(arg1, var4);
            }
        }
        if (var3 == 18) {
            class262.method1803(class157.field2765, var2, var5);
        }
        if (var3 == 11) {
            class8.field94 = true;
            class262.method1803(class157.field2765, var2, var5);
        }
        if (var3 == 6) {
            class292.field4913++;
            class187.field3229.method338(175, (byte) 8);
            class187.field3229.method759(false, var2);
            class187.field3229.method751(var4, -1044017976);
            class187.field3229.method746(-88, var5);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 17) {
            class39 var15 = class270.field4520[var4];
            if (var15 != null) {
                class278.field4672++;
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var15.field5050[0], 0, class122.field2215.field5034[0], var15.field5034[0], 0, 1, 1);
                class286.field4822 = class153.field2721;
                class110.field1977 = 2;
                class225.field3751 = class183.field3158;
                class34.field551 = 0;
                class187.field3229.method338(215, (byte) 8);
                class187.field3229.method731(-4, var4);
            }
        }
        if (var3 == 15) {
            class128.method1029(0);
            class78 var49 = class61.method419((byte) 28, var5);
            class148.field2674 = 1;
            class146.field2640 = var4;
            class87.field1548 = var2;
            class165.field2918 = var5;
            class55.method386(0, var49);
            class190.field3246 = class135.method1062(new class162[] { class207.field3490, class304.method2075(var4, 4).field2091, class80.field1401 }, !arg1);
            if (class190.field3246 == null) {
                class190.field3246 = class9.field109;
            }
            return;
        }
        if (var3 == 38) {
            class94.field1707++;
            boolean var16 = class163.method1292(class122.field2215.field5050[0], 2, false, 0, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 0, 1);
            if (!var16) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 1, 1);
            }
            class34.field551 = 0;
            class286.field4822 = class153.field2721;
            class110.field1977 = 2;
            class225.field3751 = class183.field3158;
            class187.field3229.method338(106, (byte) 8);
            class187.field3229.method751(var4, -1044017976);
            class187.field3229.method751(class178.field3052 + var2, -1044017976);
            class187.field3229.method731(-4, class258.field4294 + var5);
        }
        if (var3 == 12) {
            class60 var18 = class204.field3446[var4];
            if (var18 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var18.field5050[0], 0, class122.field2215.field5034[0], var18.field5034[0], 0, 1, 1);
                class110.field1972++;
                class110.field1977 = 2;
                class34.field551 = 0;
                class225.field3751 = class183.field3158;
                class286.field4822 = class153.field2721;
                class187.field3229.method338(121, (byte) 8);
                class187.field3229.method759(false, class46.field729);
                class187.field3229.method748(class282.field4795, -793216136);
                class187.field3229.method751(var4, -1044017976);
            }
        }
        if (var3 == 8) {
            class187.field3229.method338(170, (byte) 8);
            class187.field3229.method704(false, var5);
            class187.field3229.method759(false, var2);
            class187.field3229.method759(arg1, class46.field729);
            class187.field3229.method704(arg1, class282.field4795);
            class98.field1777++;
        }
        if (var3 == 37) {
            class162.field2851++;
            class187.field3229.method338(232, (byte) 8);
            class187.field3229.method751(var2, -1044017976);
            class187.field3229.method704(false, var5);
            class187.field3229.method759(false, var4);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 24) {
            class126.field2290++;
            class187.field3229.method338(255, (byte) 8);
            class187.field3229.method737(-127, class46.field729);
            class187.field3229.method737(-116, var4);
            class187.field3229.method748(var5, -793216136);
            class187.field3229.method704(false, class282.field4795);
            class187.field3229.method751(var2, -1044017976);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 10) {
            class78 var19 = class112.method903(var5, var2, -25988);
            if (var19 != null) {
                class128.method1029(0);
                class34.method268(var2, class148.method1173(-172139252, client.method861(var19)), var5, false);
                class148.field2674 = 0;
                class245.field4074 = class13.method113(var19, 0);
                if (class245.field4074 == null) {
                    class245.field4074 = class268.field4489;
                }
                if (var19.field1229) {
                    class243.field4042 = class135.method1062(new class162[] { var19.field1320, class80.field1401 }, true);
                } else {
                    class243.field4042 = class135.method1062(new class162[] { class180.field3087, var19.field1301, class80.field1401 }, true);
                }
            }
            return;
        }
        if (var3 == 48) {
            class39 var20 = class270.field4520[var4];
            if (var20 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var20.field5050[0], 0, class122.field2215.field5034[0], var20.field5034[0], 0, 1, 1);
                class286.field4822 = class153.field2721;
                class34.field551 = 0;
                class110.field1977 = 2;
                class282.field4794++;
                class225.field3751 = class183.field3158;
                class187.field3229.method338(248, (byte) 8);
                class187.field3229.method751(var4, -1044017976);
            }
        }
        if (var3 == 2) {
            class39 var21 = class270.field4520[var4];
            if (var21 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var21.field5050[0], 0, class122.field2215.field5034[0], var21.field5034[0], 0, 1, 1);
                class110.field1977 = 2;
                class225.field3751 = class183.field3158;
                class94.field1674++;
                class34.field551 = 0;
                class286.field4822 = class153.field2721;
                class187.field3229.method338(157, (byte) 8);
                class187.field3229.method759(arg1, var4);
            }
        }
        if (var3 == 1) {
            class39 var22 = class270.field4520[var4];
            if (var22 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var22.field5050[0], 0, class122.field2215.field5034[0], var22.field5034[0], 0, 1, 1);
                class110.field1977 = 2;
                class286.field4822 = class153.field2721;
                class225.field3751 = class183.field3158;
                class34.field551 = 0;
                class187.field3229.method338(154, (byte) 8);
                class187.field3229.method751(var4, -1044017976);
                class239.field3968++;
            }
        }
        if (var3 == 4) {
            class231.method1647(var2, var5, (byte) -26, var6);
            class187.field3229.method338(12, (byte) 8);
            class94.field1666++;
            class187.field3229.method737(-125, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class187.field3229.method751(var2 + class178.field3052, -1044017976);
            class187.field3229.method751(class258.field4294 + var5, -1044017976);
        }
        if (var3 == 58 && class231.method1647(var2, var5, (byte) -26, var6)) {
            class187.field3229.method338(98, (byte) 8);
            class187.field3229.method748(class165.field2918, -793216136);
            class187.field3229.method737(-126, class146.field2640);
            class187.field3229.method751((int) (var6 >>> 32) & Integer.MAX_VALUE, -1044017976);
            class90.field1605++;
            class187.field3229.method737(-128, class178.field3052 + var2);
            class187.field3229.method731(-4, class258.field4294 + var5);
            class187.field3229.method737(-123, class87.field1548);
        }
        if (var3 == 36) {
            class187.field3229.method338(87, (byte) 8);
            class165.field2919++;
            class187.field3229.method730(false, var5);
            class78 var23 = class61.method419((byte) 28, var5);
            if (var23.field1259 != null && var23.field1259[0][0] == 5) {
                int var24 = var23.field1259[0][1];
                if (class129.field2329[var24] != var23.field1256[0]) {
                    class129.field2329[var24] = var23.field1256[0];
                    class55.method389(0, var24);
                }
            }
        }
        if (var3 == 43) {
            class184.field3181++;
            class231.method1647(var2, var5, (byte) -26, var6);
            class187.field3229.method338(185, (byte) 8);
            class187.field3229.method759(false, var5 + class258.field4294);
            class187.field3229.method751(class178.field3052 + var2, -1044017976);
            class187.field3229.method737(-128, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var3 == 34) {
            class77.field1214++;
            boolean var25 = class163.method1292(class122.field2215.field5050[0], 2, false, 0, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 0, 1);
            if (!var25) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 1, 1);
            }
            class110.field1977 = 2;
            class34.field551 = 0;
            class225.field3751 = class183.field3158;
            class286.field4822 = class153.field2721;
            class187.field3229.method338(54, (byte) 8);
            class187.field3229.method731(-4, class178.field3052 + var2);
            class187.field3229.method751(class258.field4294 + var5, -1044017976);
            class187.field3229.method737(-126, var4);
        }
        if (var3 == 40) {
            class214.field3591++;
            boolean var27 = class163.method1292(class122.field2215.field5050[0], 2, false, 0, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 0, 1);
            if (!var27) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 1, 1);
            }
            class286.field4822 = class153.field2721;
            class110.field1977 = 2;
            class225.field3751 = class183.field3158;
            class34.field551 = 0;
            class187.field3229.method338(133, (byte) 8);
            class187.field3229.method737(-118, var4);
            class187.field3229.method759(arg1, class258.field4294 + var5);
            class187.field3229.method730(false, class282.field4795);
            class187.field3229.method759(false, class46.field729);
            class187.field3229.method731(-4, class178.field3052 + var2);
        }
        if (var3 == 9) {
            class146.field2650++;
            class187.field3229.method338(131, (byte) 8);
            class187.field3229.method746(124, var5);
            class187.field3229.method746(123, class165.field2918);
            class187.field3229.method731(-4, class146.field2640);
            class187.field3229.method759(false, var2);
            class187.field3229.method751(class87.field1548, -1044017976);
            class187.field3229.method737(-120, var4);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 21) {
            class60 var29 = class204.field3446[var4];
            if (var29 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var29.field5050[0], 0, class122.field2215.field5034[0], var29.field5034[0], 0, 1, 1);
                class160.field2807++;
                class225.field3751 = class183.field3158;
                class34.field551 = 0;
                class286.field4822 = class153.field2721;
                class110.field1977 = 2;
                class187.field3229.method338(43, (byte) 8);
                class187.field3229.method759(false, var4);
            }
        }
        if (var3 == 26) {
            class60 var30 = class204.field3446[var4];
            if (var30 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var30.field5050[0], 0, class122.field2215.field5034[0], var30.field5034[0], 0, 1, 1);
                class286.field4822 = class153.field2721;
                class225.field3751 = class183.field3158;
                class110.field1977 = 2;
                class39.field613++;
                class34.field551 = 0;
                class187.field3229.method338(101, (byte) 8);
                class187.field3229.method737(-122, var4);
            }
        }
        if (var3 == 5) {
            class56.method398((byte) -2);
        }
        if (var3 == 32) {
            class165.field2919++;
            class187.field3229.method338(87, (byte) 8);
            class187.field3229.method730(false, var5);
            class78 var31 = class61.method419((byte) 28, var5);
            if (var31.field1259 != null && var31.field1259[0][0] == 5) {
                int var32 = var31.field1259[0][1];
                class129.field2329[var32] = 1 - class129.field2329[var32];
                class55.method389(0, var32);
            }
        }
        if (var3 == 33) {
            class267.field4452++;
            class231.method1647(var2, var5, (byte) -26, var6);
            class187.field3229.method338(159, (byte) 8);
            class187.field3229.method737(-116, class178.field3052 + var2);
            class187.field3229.method751(class258.field4294 + var5, -1044017976);
            class187.field3229.method759(arg1, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var3 == 1002) {
            class136.field2426++;
            class34.field551 = 0;
            class225.field3751 = class183.field3158;
            class286.field4822 = class153.field2721;
            class110.field1977 = 2;
            class187.field3229.method338(180, (byte) 8);
            class187.field3229.method737(-125, var4);
        }
        if (var3 == 59) {
            class187.field3229.method338(190, (byte) 8);
            class187.field3229.method759(false, var2);
            class50.field798++;
            class187.field3229.method730(arg1, var5);
            class187.field3229.method731(-4, var4);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 39) {
            class60 var33 = class204.field3446[var4];
            if (var33 != null) {
                class62.field958++;
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var33.field5050[0], 0, class122.field2215.field5034[0], var33.field5034[0], 0, 1, 1);
                class34.field551 = 0;
                class225.field3751 = class183.field3158;
                class286.field4822 = class153.field2721;
                class110.field1977 = 2;
                class187.field3229.method338(19, (byte) 8);
                class187.field3229.method737(-125, var4);
            }
        }
        if (var3 == 42) {
            class39 var34 = class270.field4520[var4];
            if (var34 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var34.field5050[0], 0, class122.field2215.field5034[0], var34.field5034[0], 0, 1, 1);
                class34.field551 = 0;
                class110.field1977 = 2;
                class255.field4220++;
                class286.field4822 = class153.field2721;
                class225.field3751 = class183.field3158;
                class187.field3229.method338(22, (byte) 8);
                class187.field3229.method751(var4, -1044017976);
            }
        }
        if (var3 == 47) {
            class187.field3229.method338(187, (byte) 8);
            class187.field3229.method737(-120, var4);
            class278.field4679++;
            class187.field3229.method748(var5, -793216136);
            class187.field3229.method737(-128, var2);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 49) {
            class60 var35 = class204.field3446[var4];
            if (var35 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var35.field5050[0], 0, class122.field2215.field5034[0], var35.field5034[0], 0, 1, 1);
                class131.field2356++;
                class34.field551 = 0;
                class225.field3751 = class183.field3158;
                class110.field1977 = 2;
                class286.field4822 = class153.field2721;
                class187.field3229.method338(105, (byte) 8);
                class187.field3229.method751(var4, -1044017976);
            }
        }
        if (var3 == 19) {
            class206.field3476++;
            class187.field3229.method338(223, (byte) 8);
            class187.field3229.method759(false, var2);
            class187.field3229.method751(var4, -1044017976);
            class187.field3229.method704(arg1, var5);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 22) {
            boolean var36 = class163.method1292(class122.field2215.field5050[0], 2, false, 0, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 0, 1);
            class199.field3379++;
            if (!var36) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 1, 1);
            }
            class110.field1977 = 2;
            class286.field4822 = class153.field2721;
            class34.field551 = 0;
            class225.field3751 = class183.field3158;
            class187.field3229.method338(151, (byte) 8);
            class187.field3229.method737(-120, class258.field4294 + var5);
            class187.field3229.method731(-4, var2 + class178.field3052);
            class187.field3229.method759(arg1, var4);
        }
        if (var3 == 51) {
            class187.field3229.method338(149, (byte) 8);
            class278.field4685++;
            class187.field3229.method730(false, var5);
            class187.field3229.method751(var2, -1044017976);
            class187.field3229.method737(-117, var4);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 3) {
            class81.field1404++;
            class231.method1647(var2, var5, (byte) -26, var6);
            class187.field3229.method338(237, (byte) 8);
            class187.field3229.method759(false, class178.field3052 + var2);
            class187.field3229.method759(arg1, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class187.field3229.method759(false, class258.field4294 + var5);
        }
        if (var3 == 44) {
            class317.field5335++;
            boolean var38 = class163.method1292(class122.field2215.field5050[0], 2, false, 0, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 0, 1);
            if (!var38) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 1, 1);
            }
            class286.field4822 = class153.field2721;
            class34.field551 = 0;
            class110.field1977 = 2;
            class225.field3751 = class183.field3158;
            class187.field3229.method338(79, (byte) 8);
            class187.field3229.method731(-4, var4);
            class187.field3229.method759(false, class178.field3052 + var2);
            class187.field3229.method737(-124, var5 + class258.field4294);
        }
        if (var3 == 7) {
            class141.field2511++;
            class187.field3229.method338(147, (byte) 8);
            class187.field3229.method759(false, var2);
            class187.field3229.method748(var5, -793216136);
            class187.field3229.method731(-4, var4);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 31 && class231.method1647(var2, var5, (byte) -26, var6)) {
            class187.field3229.method338(156, (byte) 8);
            class260.field4328++;
            class187.field3229.method751(class178.field3052 + var2, -1044017976);
            class187.field3229.method731(-4, class46.field729);
            class187.field3229.method737(-126, var5 + class258.field4294);
            class187.field3229.method704(arg1, class282.field4795);
            class187.field3229.method751((int) (var6 >>> 32) & Integer.MAX_VALUE, -1044017976);
        }
        if (var3 == 29 || var3 == 1003) {
            class304.method2076((byte) -94, var4, var5, class31.field516[arg0], var2);
        }
        if (var3 == 57) {
            class187.field3229.method338(83, (byte) 8);
            class93.field1645++;
            class187.field3229.method704(arg1, var5);
            class187.field3229.method737(-127, var2);
            class187.field3229.method737(-122, var4);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 1001) {
            class225.field3751 = class183.field3158;
            class51.field821++;
            class34.field551 = 0;
            class110.field1977 = 2;
            class286.field4822 = class153.field2721;
            class187.field3229.method338(233, (byte) 8);
            class187.field3229.method759(arg1, var4);
        }
        if (var3 == 30) {
            class60 var40 = class204.field3446[var4];
            if (var40 != null) {
                class163.field2881++;
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var40.field5050[0], 0, class122.field2215.field5034[0], var40.field5034[0], 0, 1, 1);
                class286.field4822 = class153.field2721;
                class225.field3751 = class183.field3158;
                class110.field1977 = 2;
                class34.field551 = 0;
                class187.field3229.method338(142, (byte) 8);
                class187.field3229.method737(-117, class87.field1548);
                class187.field3229.method737(-117, var4);
                class187.field3229.method746(123, class165.field2918);
                class187.field3229.method751(class146.field2640, -1044017976);
            }
        }
        if (var3 == 45) {
            class39 var41 = class270.field4520[var4];
            if (var41 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var41.field5050[0], 0, class122.field2215.field5034[0], var41.field5034[0], 0, 1, 1);
                class110.field1977 = 2;
                class134.field2396++;
                class225.field3751 = class183.field3158;
                class286.field4822 = class153.field2721;
                class34.field551 = 0;
                class187.field3229.method338(210, (byte) 8);
                class187.field3229.method748(class282.field4795, -793216136);
                class187.field3229.method751(class46.field729, -1044017976);
                class187.field3229.method731(-4, var4);
            }
        }
        if (var3 == 16) {
            class39 var42 = class270.field4520[var4];
            if (var42 != null) {
                class12.field195++;
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var42.field5050[0], 0, class122.field2215.field5034[0], var42.field5034[0], 0, 1, 1);
                class225.field3751 = class183.field3158;
                class34.field551 = 0;
                class286.field4822 = class153.field2721;
                class110.field1977 = 2;
                class187.field3229.method338(30, (byte) 8);
                class187.field3229.method737(-121, var4);
            }
        }
        if (var3 == 1007) {
            class231.method1647(var2, var5, (byte) -26, var6);
            class196.field3341++;
            class187.field3229.method338(136, (byte) 8);
            class187.field3229.method731(-4, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class187.field3229.method751(var2 + class178.field3052, -1044017976);
            class187.field3229.method759(false, var5 + class258.field4294);
        }
        if (var3 == 23) {
            boolean var43 = true;
            class78 var44 = class61.method419((byte) 28, var5);
            if (var44.field1313 > 0) {
                var43 = class61.method415((byte) -68, var44);
            }
            if (var43) {
                class165.field2919++;
                class187.field3229.method338(87, (byte) 8);
                class187.field3229.method730(false, var5);
            }
        }
        if (var3 == 50) {
            class39 var45 = class270.field4520[var4];
            if (var45 != null) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var45.field5050[0], 0, class122.field2215.field5034[0], var45.field5034[0], 0, 1, 1);
                class110.field1977 = 2;
                class286.field4822 = class153.field2721;
                class34.field551 = 0;
                class225.field3751 = class183.field3158;
                class187.field3229.method338(71, (byte) 8);
                class43.field709++;
                class187.field3229.method737(-116, var4);
            }
        }
        if (var3 == 35) {
            class39 var46 = class270.field4520[var4];
            if (var46 != null) {
                class290.field4890++;
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var46.field5050[0], 0, class122.field2215.field5034[0], var46.field5034[0], 0, 1, 1);
                class34.field551 = 0;
                class110.field1977 = 2;
                class286.field4822 = class153.field2721;
                class225.field3751 = class183.field3158;
                class187.field3229.method338(6, (byte) 8);
                class187.field3229.method704(false, class165.field2918);
                class187.field3229.method751(class146.field2640, -1044017976);
                class187.field3229.method737(-126, var4);
                class187.field3229.method731(-4, class87.field1548);
            }
        }
        if (var3 == 28) {
            class31.field521++;
            class187.field3229.method338(250, (byte) 8);
            class187.field3229.method730(false, var5);
            class187.field3229.method731(-4, var4);
            class187.field3229.method759(false, var2);
            class291.field4908 = 0;
            class205.field3458 = class61.method419((byte) 28, var5);
            class186.field3200 = var2;
        }
        if (var3 == 13) {
            boolean var47 = class163.method1292(class122.field2215.field5050[0], 2, false, 0, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 0, 1);
            if (!var47) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var2, 0, class122.field2215.field5034[0], var5, 0, 1, 1);
            }
            class110.field1977 = 2;
            class225.field3751 = class183.field3158;
            class286.field4822 = class153.field2721;
            class34.field551 = 0;
            class242.field4027++;
            class187.field3229.method338(111, (byte) 8);
            class187.field3229.method751(var4, -1044017976);
            class187.field3229.method737(-120, class178.field3052 + var2);
            class187.field3229.method759(false, class87.field1548);
            class187.field3229.method751(class146.field2640, -1044017976);
            class187.field3229.method759(arg1, var5 + class258.field4294);
            class187.field3229.method730(false, class165.field2918);
        }
        if (class148.field2674 != 0) {
            class148.field2674 = 0;
            class55.method386(0, class61.method419((byte) 28, class165.field2918));
        }
        if (class13.field213) {
            class128.method1029(0);
        }
        if (class205.field3458 != null && class291.field4908 == 0) {
            class55.method386(0, class205.field3458);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 1002)
    public static void method1557(boolean arg0) {
        field3577 = null;
        field3579 = null;
        field3578 = null;
        if (arg0) {
            method1557(false);
        }
        field3572 = null;
        field3574 = null;
        field3575 = null;
        field3580 = (byte[][][]) null;
    }
}
