import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class294 {

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lhi;")
    public static class82 field4927 = class95.method664((byte) -52, "Impossible de trouver ");

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lhi;")
    private static class82 field4922 = class95.method664((byte) -115, " more options");

    @OriginalMember(owner = "client!t", name = "g", descriptor = "D")
    public static double field4928 = -1.0D;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field4930 = 0;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "Lhi;")
    public static class82 field4929 = field4922;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "S")
    public static short field4931 = 320;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lrd;")
    public static class139 field4926;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 7)
    public static void method2020(int arg0) {
        int var1 = 79 % ((arg0 - 73) / 39);
        field4926 = null;
        field4929 = null;
        field4927 = null;
        field4922 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 39)
    public static final void method2021(byte arg0) {
        class111.method768((byte) 121, false);
        class171.field2944 = 0;
        field4923++;
        boolean var1 = true;
        for (int var2 = 0; var2 < class287.field4830.length; var2++) {
            if (class56.field914[var2] != -1 && class287.field4830[var2] == null) {
                class287.field4830[var2] = class184.field3134.method1577(class56.field914[var2], 0, -29569);
                if (class287.field4830[var2] == null) {
                    class171.field2944++;
                    var1 = false;
                }
            }
            if (class129.field2242[var2] != -1 && class36.field590[var2] == null) {
                class36.field590[var2] = class184.field3134.method1603(-98, 0, class129.field2242[var2], class160.field2793[var2]);
                if (class36.field590[var2] == null) {
                    class171.field2944++;
                    var1 = false;
                }
            }
            if (class147.field2485) {
                if (class199.field3424[var2] != -1 && class71.field1094[var2] == null) {
                    class71.field1094[var2] = class184.field3134.method1577(class199.field3424[var2], 0, -29569);
                    if (class71.field1094[var2] == null) {
                        var1 = false;
                        class171.field2944++;
                    }
                }
                if (class104.field1838[var2] != -1 && class123.field2147[var2] == null) {
                    class123.field2147[var2] = class184.field3134.method1577(class104.field1838[var2], 0, -29569);
                    if (class123.field2147[var2] == null) {
                        var1 = false;
                        class171.field2944++;
                    }
                }
            }
            if (class149.field2526 != null && class107.field1902[var2] == null && class149.field2526[var2] != -1) {
                class107.field1902[var2] = class184.field3134.method1603(-125, 0, class149.field2526[var2], class160.field2793[var2]);
                if (class107.field1902[var2] == null) {
                    var1 = false;
                    class171.field2944++;
                }
            }
        }
        if (class32.field473 == null) {
            if (class139.field2383 == null || !class209.field3676.method1599(class29.method182(-6039, new class82[] { class139.field2383.field1955, class273.field4606 }), -1)) {
                class32.field473 = new class250(0);
            } else if (class209.field3676.method1600(false, class29.method182(-6039, new class82[] { class139.field2383.field1955, class273.field4606 }))) {
                class32.field473 = class230.method1635(class209.field3676, class29.method182(-6039, new class82[] { class139.field2383.field1955, class273.field4606 }), -78);
            } else {
                var1 = false;
                class171.field2944++;
            }
        }
        if (!var1) {
            class83.field1478 = 1;
            return;
        }
        boolean var3 = true;
        class231.field3983 = 0;
        int var4 = -14 % ((arg0 + 65) / 60);
        for (int var5 = 0; var5 < class287.field4830.length; var5++) {
            byte[] var6 = class36.field590[var5];
            if (var6 != null) {
                int var7 = (class93.field1664[var5] >> 8) * 64 - class230.field3976;
                int var8 = (class93.field1664[var5] & 0xFF) * 64 - class226.field3916;
                if (class182.field3115) {
                    var7 = 10;
                    var8 = 10;
                }
                var3 &= class69.method433(-101, var7, var6, var8);
            }
            if (class147.field2485) {
                byte[] var9 = class123.field2147[var5];
                if (var9 != null) {
                    int var10 = (class93.field1664[var5] >> 8) * 64 - class230.field3976;
                    int var11 = (class93.field1664[var5] & 0xFF) * 64 - class226.field3916;
                    if (class182.field3115) {
                        var11 = 10;
                        var10 = 10;
                    }
                    var3 &= class69.method433(-85, var10, var9, var11);
                }
            }
        }
        if (!var3) {
            class83.field1478 = 2;
            return;
        }
        if (class83.field1478 != 0) {
            class323.method2230(class29.method182(-6039, new class82[] { class289.field4847, class212.field3713 }), (byte) 95, true);
        }
        class283.method1968(40);
        class166.method1196(0);
        boolean var12 = false;
        if (class147.field2485 && class126.field2220) {
            for (int var13 = 0; var13 < class287.field4830.length; var13++) {
                if (class123.field2147[var13] != null || class71.field1094[var13] != null) {
                    var12 = true;
                    break;
                }
            }
        }
        class277.method1939(4, 104, 104, class147.field2485 ? 28 : 25, var12);
        for (int var14 = 0; var14 < 4; var14++) {
            class180.field3071[var14].method1305(-1);
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 104; var16++) {
                for (int var17 = 0; var17 < 104; var17++) {
                    class204.field3567[var15][var16][var17] = 0;
                }
            }
        }
        class65.method420((byte) 6, false);
        if (class147.field2485) {
            class248.field4292.method1276();
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    class248.field4293[var18][var19].field4262 = true;
                }
            }
        }
        if (class147.field2485) {
            class2.method14();
        }
        if (class147.field2485) {
            class132.method911((byte) -91);
        }
        class283.method1968(100);
        System.gc();
        class111.method768((byte) 121, true);
        class90.method644(false, 76);
        if (!class182.field3115) {
            class321.method2222((byte) 39, false);
            class111.method768((byte) 121, true);
            if (class147.field2485) {
                int var20 = class168.field2932.field1723[0] >> 3;
                int var21 = class168.field2932.field1720[0] >> 3;
                class312.method2150(var21, 1, var20);
            }
            class73.method466(-57, false);
            if (class107.field1902 != null) {
                class134.method915(false);
            }
        }
        if (class182.field3115) {
            class23.method154(false, 126);
            class111.method768((byte) 121, true);
            if (class147.field2485) {
                int var22 = class168.field2932.field1723[0] >> 3;
                int var23 = class168.field2932.field1720[0] >> 3;
                class312.method2150(var23, 1, var22);
            }
            class182.method1266((byte) 72, false);
        }
        class166.method1196(0);
        class111.method768((byte) 121, true);
        class222.method1576(false, class180.field3071, -21911);
        if (class147.field2485) {
            class2.method10();
        }
        class111.method768((byte) 121, true);
        int var24 = class193.field3280;
        if (var24 > class297.field5058) {
            var24 = class297.field5058;
        }
        if (class297.field5058 - 1 > var24) {
            int var25 = class297.field5058 - 1;
        }
        if (class123.method841(false)) {
            class138.method938(0);
        } else {
            class138.method938(class193.field3280);
        }
        class220.method1562((byte) -116);
        if (class147.field2485 && var12) {
            class90.method640(true);
            class90.method644(true, 115);
            if (!class182.field3115) {
                class321.method2222((byte) 39, true);
                class111.method768((byte) 121, true);
                class73.method466(-98, true);
            }
            if (class182.field3115) {
                class23.method154(true, 127);
                class111.method768((byte) 121, true);
                class182.method1266((byte) 72, true);
            }
            class166.method1196(0);
            class111.method768((byte) 121, true);
            class222.method1576(true, class180.field3071, -21911);
            class111.method768((byte) 121, true);
            class220.method1562((byte) -98);
            class90.method640(false);
        }
        if (class147.field2485) {
            for (int var26 = 0; var26 < 13; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    class248.field4293[var26][var27].method1761(class245.field4255[0], var26 * 8, var27 * 8);
                }
            }
        }
        for (int var28 = 0; var28 < 104; var28++) {
            for (int var29 = 0; var29 < 104; var29++) {
                class122.method837(var28, (byte) 110, var29);
            }
        }
        class43.method325(18916);
        class283.method1968(119);
        class209.method1500(-25);
        class166.method1196(0);
        if (class261.field4468 != null && class66.field1036 != null && class61.field959 == 25) {
            class61.field957.method1504(201, -1);
            class61.field957.method1065(178808912, 1057001181);
            class163.field2856++;
        }
        if (!class182.field3115) {
            int var30 = (class260.field4465 + 6) / 8;
            int var31 = (class260.field4465 - 6) / 8;
            int var32 = (class126.field2215 - 6) / 8;
            int var33 = (class126.field2215 + 6) / 8;
            for (int var34 = var31 - 1; var34 <= var30 + 1; var34++) {
                for (int var35 = var32 - 1; var35 <= var33 + 1; var35++) {
                    if (var31 > var34 || var34 > var30 || var35 < var32 || var33 < var35) {
                        class184.field3134.method1589(class29.method182(-6039, new class82[] { class260.field4464, class327.method2240((byte) -74, var34), class311.field5315, class327.method2240((byte) -74, var35) }), -75);
                        class184.field3134.method1589(class29.method182(-6039, new class82[] { class298.field5068, class327.method2240((byte) -74, var34), class311.field5315, class327.method2240((byte) -74, var35) }), 106);
                    }
                }
            }
        }
        if (class61.field959 == 28) {
            class292.method2014(28, 10);
        } else {
            class292.method2014(28, 30);
            if (class66.field1036 != null) {
                class61.field957.method1504(57, -1);
            }
        }
        class219.method1552(1);
        class283.method1968(85);
        class15.method84(true);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)I", line = 557)
    public static final int method2022(int arg0, int arg1) {
        field4924++;
        if (arg1 != 255) {
            method2021((byte) -30);
        }
        return arg0 & 0xFF;
    }
}
