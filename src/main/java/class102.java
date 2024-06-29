import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class102 {

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "[C")
    public static char[] field1460 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1459 = -1;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lwo;")
    public static class225 field1462;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[S")
    public static short[] field1461;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public static final void method687(boolean arg0) {
        class483.field7036 = null;
        class331.field5127 = null;
        class4.field62 = null;
        class216.field3001 = null;
        class225.field3228 = null;
        class112.field1564 = null;
        if (!arg0) {
            method687(true);
        }
        class41.field635 = null;
        field1458++;
        class285.field4250 = null;
        class84.field1153 = null;
        class23.field349 = null;
        class63.field892 = null;
        class414.field6216 = null;
        class494.field7231 = null;
        class129.field1814 = null;
        class316.field4825 = null;
        class104.field1497 = null;
        class432.field6406 = null;
        class439.field6538 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method688(int arg0) {
        field1460 = null;
        field1462 = null;
        field1461 = null;
        if (arg0 != -29898) {
            method687(true);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static final void method689(int arg0) {
        field1456++;
        class483.method2882(false, 8141);
        class488.field7154 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class310.field4643.length; var2++) {
            if (class471.field6894[var2] != -1 && class310.field4643[var2] == null) {
                class310.field4643[var2] = class255.field3538.method2650(0, -73, class471.field6894[var2]);
                if (class310.field4643[var2] == null) {
                    class488.field7154++;
                    var1 = false;
                }
            }
            if (class65.field901[var2] != -1 && class388.field5893[var2] == null) {
                class388.field5893[var2] = class255.field3538.method2620(class65.field901[var2], -6944, class215.field2992[var2], 0);
                if (class388.field5893[var2] == null) {
                    class488.field7154++;
                    var1 = false;
                }
            }
            if (class38.field612[var2] != -1 && class219.field3077[var2] == null) {
                class219.field3077[var2] = class255.field3538.method2650(0, -54, class38.field612[var2]);
                if (class219.field3077[var2] == null) {
                    var1 = false;
                    class488.field7154++;
                }
            }
            if (class334.field5157[var2] != -1 && class107.field1508[var2] == null) {
                class107.field1508[var2] = class255.field3538.method2650(0, -104, class334.field5157[var2]);
                if (class107.field1508[var2] == null) {
                    class488.field7154++;
                    var1 = false;
                }
            }
            if (class270.field3763 != null && class287.field4285[var2] == null && class270.field3763[var2] != -1) {
                class287.field4285[var2] = class255.field3538.method2620(class270.field3763[var2], -6944, class215.field2992[var2], 0);
                if (class287.field4285[var2] == null) {
                    class488.field7154++;
                    var1 = false;
                }
            }
        }
        if (class465.field6792 == null) {
            if (class296.field4399 == null || !class149.field2158.method2633((byte) -114, class296.field4399.field4831 + "_staticelements")) {
                class465.field6792 = new class338(0);
            } else if (class149.field2158.method2636(21946, class296.field4399.field4831 + "_staticelements")) {
                class465.field6792 = class530.method3130(class289.field4305, class149.field2158, -108, class296.field4399.field4831 + "_staticelements");
            } else {
                var1 = false;
                class488.field7154++;
            }
        }
        if (!var1) {
            class178.field2538 = 1;
            return;
        }
        class223.field3149 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class310.field4643.length; var4++) {
            byte[] var19 = class388.field5893[var4];
            if (var19 != null) {
                int var20 = (class253.field3509[var4] >> 8) * 64 - class82.field1105;
                int var21 = (class253.field3509[var4] & 0xFF) * 64 - class437.field6477;
                if (class51.field683 != 0) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class372.method2325(var21, true, var19, var20, class485.field7122, class96.field1403);
            }
            byte[] var22 = class107.field1508[var4];
            if (var22 != null) {
                int var23 = (class253.field3509[var4] >> 8) * 64 - class82.field1105;
                int var24 = (class253.field3509[var4] & 0xFF) * 64 - class437.field6477;
                if (class51.field683 != 0) {
                    var23 = 10;
                    var24 = 10;
                }
                var3 &= class372.method2325(var24, true, var22, var23, class485.field7122, class96.field1403);
            }
        }
        if (!var3) {
            class178.field2538 = 2;
            return;
        }
        if (class178.field2538 != 0) {
            class252.method1645(class84.field1153, (byte) 31, class107.field1512.method2335((byte) -100, class288.field4292) + "<br>(100%)", true);
        }
        if (arg0 > -6) {
            return;
        }
        class300.method1929((byte) -4);
        class220.method1494((byte) -127);
        boolean var5 = false;
        if (class337.field5242.method1056() && class96.field1399.field5194) {
            for (int var6 = 0; var6 < class310.field4643.length; var6++) {
                if (class107.field1508[var6] != null || class219.field3077[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class96.field1399.field5220) {
            var7 = class426.field6348[class463.field6779];
        } else {
            var7 = class525.field7773[class463.field6779];
        }
        if (class337.field5242.method1109()) {
            var7++;
        }
        class158.method1027(7, 4, class96.field1403, class485.field7122, var7, var5, class337.field5242.method1084() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class444.field6605[var8].method2322(-29126);
        }
        class452.method2724(-85);
        class244.method1626(false, -1);
        class187.method1316((byte) -125);
        class429.field6384 = null;
        class300.method1929((byte) -4);
        System.gc();
        class483.method2882(true, 8141);
        class256.method1666(0);
        class181.field2575 = class96.field1399.method2170(class441.field6563, true);
        class169.field2461 = class96.field1399.field5194;
        class518.field7691 = class455.field6684 >= 96;
        class286.field4263 = class96.field1399.method2171(class441.field6563, 114);
        class232.field3294 = !class96.field1399.field5235;
        class42.field641 = class96.field1399.method1734(117, class441.field6563) ? -1 : class430.field6399;
        class341.field5379 = class441.field6563 == 1 || class96.field1399.field5210;
        class168.field2445 = class96.field1399.field5209;
        class110.field1550 = new class167(4, class96.field1403, class485.field7122, false);
        if (class51.field683 == 0) {
            class338.method2187((byte) -13, class110.field1550, class310.field4643);
        } else {
            class327.method2112(class110.field1550, class310.field4643, -108);
        }
        class433.method2591(class96.field1403 >> 4, class485.field7122 >> 4, 0);
        class281.method1761(0);
        if (var5) {
            class439.method2655(true);
            class25.field413 = new class167(1, class96.field1403, class485.field7122, true);
            if (class51.field683 == 0) {
                class338.method2187((byte) 105, class25.field413, class219.field3077);
                class483.method2882(true, 8141);
            } else {
                class327.method2112(class25.field413, class219.field3077, 42);
                class483.method2882(true, 8141);
            }
            class25.field413.method2161(class110.field1550.field5184[0], 128, 0);
            class25.field413.method2158(class337.field5242, true, null, null);
            class439.method2655(false);
        }
        class110.field1550.method2158(class337.field5242, true, class444.field6605, var5 ? class25.field413.field5184 : null);
        if (class51.field683 == 0) {
            class483.method2882(true, 8141);
            class437.method2617(class110.field1550, class388.field5893, 1);
            if (class287.field4285 != null) {
                class493.method2925(-10253);
            }
        } else {
            class483.method2882(true, 8141);
            class153.method1002(class110.field1550, (byte) -43, class388.field5893);
        }
        class220.method1494((byte) -127);
        class483.method2882(true, 8141);
        class110.field1550.method2153(null, class337.field5242, (byte) -114, var5 ? class187.field2632[0] : null);
        class110.field1550.method1170(53, class337.field5242);
        class483.method2882(true, 8141);
        if (var5) {
            class439.method2655(true);
            class483.method2882(true, 8141);
            if (class51.field683 == 0) {
                class437.method2617(class25.field413, class107.field1508, 1);
            } else {
                class153.method1002(class25.field413, (byte) -43, class107.field1508);
            }
            class220.method1494((byte) -128);
            class483.method2882(true, 8141);
            class25.field413.method2153(class204.field2871[0], class337.field5242, (byte) 45, null);
            class25.field413.method1170(-127, class337.field5242);
            class483.method2882(true, 8141);
            class439.method2655(false);
        }
        class55.method375(false);
        int var9 = class110.field1550.field2432;
        if (class195.field2770 < var9) {
            var9 = class195.field2770;
        }
        if ((class195.field2770 - 1) > var9) {
            var9 = class195.field2770 - 1;
        }
        if (class96.field1399.method1734(115, class441.field6563)) {
            class299.method1926(0);
        } else {
            class299.method1926(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class96.field1403; var17++) {
                for (int var18 = 0; var18 < class485.field7122; var18++) {
                    class158.method1031(var10, (byte) -26, var17, var18);
                }
            }
        }
        class151.method988(0);
        class300.method1929((byte) -4);
        class211.method1455(3);
        class220.method1494((byte) -127);
        class37.field598 = false;
        class272.method1739(false);
        if (class452.field6646 != null && class81.field1092 != null && class144.field2077 == 25) {
            class179.method1287(false, class267.field3715);
            class10.field137++;
            class75.field1006.method615(28010, 1057001181);
        }
        if (class51.field683 == 0) {
            int var11 = (class10.field163 - (class96.field1403 >> 4)) / 8;
            int var12 = (class10.field163 + (class96.field1403 >> 4)) / 8;
            int var13 = (class77.field1036 - (class485.field7122 >> 4)) / 8;
            int var14 = ((class485.field7122 >> 4) + class77.field1036) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var11 > var15 || var15 > var12 || var13 > var16 || var16 > var14) {
                        class255.field3538.method2621("m" + var15 + "_" + var16, -1);
                        class255.field3538.method2621("l" + var15 + "_" + var16, -1);
                    }
                }
            }
        }
        if (class144.field2077 == 28) {
            class524.method3106(10, (byte) 90);
        } else {
            class524.method3106(30, (byte) 40);
            if (class81.field1092 != null) {
                class179.method1287(false, class397.field6024);
            }
        }
        class83.method537((byte) 54);
        class300.method1929((byte) -4);
        class55.method373(0);
    }
}
