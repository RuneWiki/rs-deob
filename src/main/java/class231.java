import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class231 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3266 = 0;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3269 = new String[100];

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field3273 = 1;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field3272 = -1;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field3274 = 0;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3271;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "[[B")
    public static byte[][] field3270;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 10)
    public static final void method1600(byte arg0) {
        int var1 = class204.field2946.method1904(class291.field4342);
        int var2 = 60 % ((arg0 + 5) / 60);
        for (int var3 = 0; var3 < class204.field2938; var3++) {
            int var4 = class204.field2946.method1904(class51.method353(80, var3));
            if (var1 < var4) {
                var1 = var4;
            }
        }
        var1 += 8;
        field3268++;
        int var5 = class204.field2938 * 15 + 21;
        int var6 = class82.field1189;
        if (var5 + var6 > class64.field836) {
            var6 = class64.field836 - var5;
        }
        int var7 = class55.field751 - (var1 / 2);
        if ((var7 + var1) > class187.field2592) {
            var7 = class187.field2592 - var1;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class316.field4811 == 1) {
            if (class89.field1253 == class55.field751 && class82.field1189 == class247.field3560) {
                class183.field2524 = var1;
                class100.field1380 = true;
                class316.field4811 = 0;
                class218.field3131 = class204.field2938 * 15 + (class141.field1924 ? 26 : 22);
                class8.field79 = var7;
                class312.field4704 = var6;
            }
        } else if (class55.field751 == class217.field3104 && class82.field1189 == class155.field2142) {
            class316.field4811 = 0;
            class183.field2524 = var1;
            class100.field1380 = true;
            class312.field4704 = var6;
            class218.field3131 = (class141.field1924 ? 26 : 22) + class204.field2938 * 15;
            class8.field79 = var7;
        } else {
            class247.field3560 = class155.field2142;
            class89.field1253 = class217.field3104;
            class316.field4811 = 1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 106)
    public static void method1601(int arg0) {
        field3269 = null;
        field3270 = (byte[][]) null;
        if (arg0 != 27429) {
            field3266 = 37;
        }
        field3271 = null;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V", line = 123)
    public static final void method1602(byte arg0) {
        field3267++;
        class343.method2361(false, false);
        class113.field1543 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class37.field425.length; var2++) {
            if (class11.field119[var2] != -1 && class37.field425[var2] == null) {
                class37.field425[var2] = class92.field1281.method955(class11.field119[var2], 0, -21853);
                if (class37.field425[var2] == null) {
                    var1 = false;
                    class113.field1543++;
                }
            }
            if (class202.field2866[var2] != -1 && class41.field468[var2] == null) {
                class41.field468[var2] = class92.field1281.method950(class202.field2866[var2], class47.field589[var2], 0, (byte) 127);
                if (class41.field468[var2] == null) {
                    var1 = false;
                    class113.field1543++;
                }
            }
            if (class67.field908) {
                if (class203.field2905[var2] != -1 && class71.field964[var2] == null) {
                    class71.field964[var2] = class92.field1281.method955(class203.field2905[var2], 0, -21853);
                    if (class71.field964[var2] == null) {
                        var1 = false;
                        class113.field1543++;
                    }
                }
                if (class66.field867[var2] != -1 && field3270[var2] == null) {
                    field3270[var2] = class92.field1281.method955(class66.field867[var2], 0, -21853);
                    if (field3270[var2] == null) {
                        class113.field1543++;
                        var1 = false;
                    }
                }
            }
            if (class7.field58 != null && class266.field3883[var2] == null && class7.field58[var2] != -1) {
                class266.field3883[var2] = class92.field1281.method950(class7.field58[var2], class47.field589[var2], 0, (byte) 127);
                if (class266.field3883[var2] == null) {
                    class113.field1543++;
                    var1 = false;
                }
            }
        }
        if (class111.field1506 == null) {
            if (class131.field1798 == null || !class307.field4595.method965((byte) -60, class131.field1798.field4406 + "_labels")) {
                class111.field1506 = new class176(0);
            } else if (class307.field4595.method951(class131.field1798.field4406 + "_labels", 2)) {
                class111.field1506 = class326.method2281(class131.field1798.field4406 + "_labels", class307.field4595, 73);
            } else {
                class113.field1543++;
                var1 = false;
            }
        }
        if (!var1) {
            class294.field4368 = 1;
            return;
        }
        class198.field2780 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class37.field425.length; var4++) {
            byte[] var5 = class41.field468[var4];
            if (var5 != null) {
                int var6 = (class256.field3702[var4] >> 8) * 64 - class132.field1809;
                int var7 = (class256.field3702[var4] & 0xFF) * 64 - class296.field4394;
                if (class45.field552) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class316.method2164((byte) 11, var5, var7, var6);
            }
            if (class67.field908) {
                byte[] var8 = field3270[var4];
                if (var8 != null) {
                    int var9 = (class256.field3702[var4] >> 8) * 64 - class132.field1809;
                    int var10 = (class256.field3702[var4] & 0xFF) * 64 - class296.field4394;
                    if (class45.field552) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class316.method2164((byte) 11, var8, var10, var9);
                }
            }
        }
        if (!var3) {
            class294.field4368 = 2;
            return;
        }
        if (class294.field4368 != 0) {
            class301.method2052(true, (byte) -118, class175.field2382 + "<br>(100%)");
        }
        class15.method98(-124);
        class173.method1212((byte) -115);
        boolean var11 = false;
        if (class67.field908 && class131.field1793) {
            for (int var12 = 0; var12 < class37.field425.length; var12++) {
                if (field3270[var12] != null || class71.field964[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class337.method2333(4, 104, 104, class67.field908 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class312.field4714[var13].method532((byte) -113);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class240.field3406[var14][var15][var16] = 0;
                }
            }
        }
        class73.method547(false, (byte) 4);
        if (class67.field908) {
            class322.field4891.method1778();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class322.field4889[var17][var18].field121 = true;
                }
            }
        }
        if (class67.field908) {
            class147.method1057();
        }
        if (class67.field908) {
            class148.method1075((byte) -124);
        }
        class15.method98(-128);
        System.gc();
        class343.method2361(false, true);
        class143.method1031(false, (byte) -68);
        if (!class45.field552) {
            class237.method1631(false, -76);
            class343.method2361(false, true);
            if (class67.field908) {
                int var19 = class173.field2356.field3768[0] >> 3;
                int var20 = class173.field2356.field3706[0] >> 3;
                class256.method1759(var20, var19, 0);
            }
            class278.method1928(128, false);
            if (class266.field3883 != null) {
                class41.method255((byte) 107);
            }
        }
        if (class45.field552) {
            class333.method2318(false, 4495);
            class343.method2361(false, true);
            if (class67.field908) {
                int var21 = class173.field2356.field3706[0] >> 3;
                int var22 = class173.field2356.field3768[0] >> 3;
                class256.method1759(var21, var22, 0);
            }
            class141.method1018(false, 58);
        }
        class173.method1212((byte) -101);
        class343.method2361(false, true);
        class254.method1739(-24746, false, class45.field552 ? class199.field2840 : (int[][][]) null, class312.field4714);
        if (class67.field908) {
            class147.method1064();
        }
        class343.method2361(false, true);
        int var23 = class320.field4868;
        if (var23 > class251.field3603) {
            var23 = class251.field3603;
        }
        if ((class251.field3603 - 1) > var23) {
            int var24 = class251.field3603 - 1;
        }
        if (class154.method1113(-127)) {
            class302.method2056(0);
        } else {
            class302.method2056(class320.field4868);
        }
        class204.method1448(18128);
        if (class67.field908 && var11) {
            class35.method198(true);
            class143.method1031(true, (byte) -89);
            if (!class45.field552) {
                class237.method1631(true, -76);
                class343.method2361(false, true);
                class278.method1928(128, true);
            }
            if (class45.field552) {
                class333.method2318(true, 4495);
                class343.method2361(false, true);
                class141.method1018(true, 78);
            }
            class173.method1212((byte) -116);
            class343.method2361(false, true);
            class254.method1739(-24746, true, class45.field552 ? class199.field2840 : (int[][][]) null, class312.field4714);
            class343.method2361(false, true);
            class204.method1448(18128);
            class35.method198(false);
        }
        if (class67.field908) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class322.field4889[var25][var26].method71(class333.field5020[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class153.method1104(var27, -99999999, var28);
            }
        }
        class312.method2135(false);
        class15.method98(-115);
        class148.method1073(0);
        class173.method1212((byte) -88);
        class33.field391 = false;
        if (class67.field908) {
            class8.method42(true, false);
        }
        if (class138.field1898 != null && class39.field442 != null && class148.field2051 == 25) {
            class4.field36++;
            class90.field1264.method2238(171, (byte) -128);
            class90.field1264.method2188(255, 1057001181);
        }
        if (!class45.field552) {
            int var29 = (class237.field3368 - 6) / 8;
            int var30 = (class237.field3368 + 6) / 8;
            int var31 = (class320.field4877 - 6) / 8;
            int var32 = (class320.field4877 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= (var30 + 1); var33++) {
                for (int var34 = var31 - 1; var34 <= var32 + 1; var34++) {
                    if (var33 < var29 || var30 < var33 || var34 < var31 || var34 > var32) {
                        class92.field1281.method960((byte) 74, "m" + var33 + "_" + var34);
                        class92.field1281.method960((byte) 115, "l" + var33 + "_" + var34);
                    }
                }
            }
        }
        if (class148.field2051 == 28) {
            class189.method1325(1, 10);
        } else {
            class189.method1325(1, 30);
            if (class39.field442 != null) {
                class90.field1264.method2238(195, (byte) -128);
            }
        }
        class334.method2324(-1);
        class15.method98(-117);
        class276.method1896((byte) -128);
        if (arg0 < 116) {
            field3274 = 88;
        }
    }
}
