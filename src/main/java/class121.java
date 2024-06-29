import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class121 {

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1722 = 0;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[S")
    public static short[] field1726 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIZB)V")
    public static final void method789(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        class241.field3505++;
        field1723++;
        class168.method1102(false);
        if (arg4) {
            class35.method221(false, 0, false, 0);
        } else {
            class175.method1137(arg5 + 21995, 0);
            class35.method221(false, 0, true, 0);
            if (class20.field241 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class35.method221(false, var7, false, 0);
                    class35.method221(true, var7, false, 0);
                    class175.method1137(22092, var7);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class175.method1137(arg5 + 21995, var6);
                    class35.method221(false, var6, false, 0);
                    class35.method221(true, var6, false, 0);
                }
            }
        }
        if (!arg4) {
            class41.method253((byte) 124);
        }
        class19.method120(arg5 ^ 0xFFFFE148);
        if (class4.field61 == 1) {
            int var8 = (int) class159.field2310;
            if (var8 < (class16.field195 / 256)) {
                var8 = class16.field195 / 256;
            }
            if (class229.field3259[4] && var8 < (class1.field16[4] + 128)) {
                var8 = class1.field16[4] + 128;
            }
            int var9 = (int) class274.field4085 + class226.field3174 & 0x7FF;
            class247.method1596(var9, (byte) -126, class70.field821, arg3, var8 * 3 + 600, var8, class238.field3426, class4.method21(class177.field2507.field4553, class199.field2833, class177.field2507.field4563, (byte) 26) - 50);
        } else if (class4.field61 == 5) {
            class231.method1511(arg3, arg5 - 13452);
        }
        int var10 = class245.field3560;
        int var11 = class225.field3172;
        int var12 = class280.field4246;
        int var13 = class138.field2010;
        int var14 = class204.field2902;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class229.field3259[var15]) {
                int var22 = (int) ((double) (class57.field674[var15] * 2 + 1) * Math.random() + Math.sin((double) class223.field3153[var15] / 100.0D * (double) class167.field2411[var15]) * (double) class1.field16[var15] - (double) class57.field674[var15]);
                if (var15 == 1) {
                    class225.field3172 += var22;
                }
                if (var15 == 0) {
                    class245.field3560 += var22;
                }
                if (var15 == 3) {
                    class138.field2010 = class138.field2010 + var22 & 0x7FF;
                }
                if (var15 == 4) {
                    class280.field4246 += var22;
                    if (class280.field4246 < 128) {
                        class280.field4246 = 128;
                    }
                    if (class280.field4246 > 383) {
                        class280.field4246 = 383;
                    }
                }
                if (var15 == 2) {
                    class204.field2902 += var22;
                }
            }
        }
        client.method1916(false);
        class155.method1022(arg0, arg2, arg0 + arg1, arg2 + arg3);
        class297.method1985();
        if (class167.field2397 >= 0) {
            class13 var16 = class34.method213(class167.field2397, class28.field333, class214.field2985, class94.field1257, arg5 ^ 0xFFFFFFEA);
            var16.method81(class261.field3795, arg0, arg2, arg1, arg3, class280.field4246, class138.field2010, 0);
        } else {
            class155.method1018(arg0, arg2, arg1, arg3, 0);
        }
        if (class177.field2518 || class17.field215 < arg0 || class17.field215 >= (arg0 + arg1) || arg2 > class72.field866 || arg2 + arg3 <= class72.field866) {
            class214.field2993 = false;
            class71.field834 = 0;
        } else {
            class214.field2993 = true;
            int var17 = class167.field2400;
            class71.field834 = 0;
            int var18 = class173.field2479;
            int var19 = class171.field2446;
            int var20 = class39.field472;
            class284.field4356 = (class72.field866 - arg2) * (var19 - var20) / arg3 + var20;
            class90.field1229 = (class17.field215 - arg0) * (var18 - var17) / arg1 + var17;
        }
        class6.method32(23);
        byte var21 = class221.method1439(21322) == 2 ? (byte) class241.field3505 : 1;
        if (arg5 != 97) {
            field1725 = 6;
        }
        method790(class245.field3560, class225.field3172, class204.field2902, class280.field4246, class138.field2010, class197.field2806, class21.field258, class279.field4239, class288.field4481, class238.field3428, class296.field4670, class199.field2833 + 1, var21, class177.field2507.field4563 >> 7, class177.field2507.field4553 >> 7);
        class6.method32(66);
        class243.method1582();
        class225.method1453(arg2, arg0, 256, arg1, arg3, 256, -58);
        class157.method1045(arg0, arg3, 256, arg2, arg1, 256, (byte) 13);
        ((class119) class297.field4685).method772(class123.field1771, -4172);
        class37.method231(arg3, arg2, arg1, arg5 ^ 0xFFFFC951, arg0);
        class280.field4246 = var12;
        class138.field2010 = var13;
        class204.field2902 = var14;
        class225.field3172 = var11;
        class245.field3560 = var10;
        if (class285.field4412 && class80.field950.method1054(true) == 0) {
            class285.field4412 = false;
        }
        if (class285.field4412) {
            class155.method1018(arg0, arg2, arg1, arg3, 0);
            class117.method755(16777215, false, class168.field2418);
        }
        if (!arg4 && !class285.field4412 && !class177.field2518 && arg0 <= class17.field215 && class17.field215 < (arg0 + arg1) && arg2 <= class72.field866 && class72.field866 < (arg2 + arg3)) {
            class76.method464(arg3, class72.field866, (byte) -17, class17.field215, arg1, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    private static final void method790(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class268.field3922 * 128) {
            arg0 = class268.field3922 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class97.field1292 * 128) {
            arg2 = class97.field1292 * 128 - 1;
        }
        class238.field3433 = class297.field4697[arg3];
        class152.field2206 = class297.field4698[arg3];
        class99.field1327 = class297.field4697[arg4];
        class64.field746 = class297.field4698[arg4];
        class77.field927 = arg0;
        class130.field1878 = arg1;
        class296.field4671 = arg2;
        class139.field2025 = arg0 / 128;
        class178.field2538 = arg2 / 128;
        class255.field3674 = class139.field2025 - class46.field547;
        if (class255.field3674 < 0) {
            class255.field3674 = 0;
        }
        class68.field797 = class178.field2538 - class46.field547;
        if (class68.field797 < 0) {
            class68.field797 = 0;
        }
        class290.field4543 = class46.field547 + class139.field2025;
        if (class290.field4543 > class268.field3922) {
            class290.field4543 = class268.field3922;
        }
        class203.field2882 = class46.field547 + class178.field2538;
        if (class203.field2882 > class97.field1292) {
            class203.field2882 = class97.field1292;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class46.field547 + class46.field547 + 2; var16++) {
            for (int var19 = 0; var19 < class46.field547 + class46.field547 + 2; var19++) {
                int var20 = (var16 - class46.field547 << 7) - (class77.field927 & 0x7F);
                int var21 = (var19 - class46.field547 << 7) - (class296.field4671 & 0x7F);
                int var22 = class139.field2025 + var16 - class46.field547;
                int var23 = class178.field2538 + var19 - class46.field547;
                if (var22 >= 0 && var23 >= 0 && var22 < class268.field3922 && var23 < class97.field1292) {
                    int var24;
                    if (class220.field3122 == null) {
                        var24 = class180.field2550[0][var22][var23] + 128 - class130.field1878;
                    } else {
                        var24 = class220.field3122[0][var22][var23] + 128 - class130.field1878;
                    }
                    int var25 = class180.field2550[3][var22][var23] - class130.field1878 - 1000;
                    class41.field503[var16][var19] = class274.method1762(var20, var25, var24, var21, var15);
                } else {
                    class41.field503[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class46.field547 + class46.field547 + 1; var17++) {
            for (int var18 = 0; var18 < class46.field547 + class46.field547 + 1; var18++) {
                class252.field3642[var17][var18] = class41.field503[var17][var18] || class41.field503[var17 + 1][var18] || class41.field503[var17][var18 + 1] || class41.field503[var17 + 1][var18 + 1];
            }
        }
        class195.field2779 = arg6;
        class193.field2767 = arg7;
        class129.field1855 = arg8;
        class80.field948 = arg9;
        class237.field3413 = arg10;
        class70.method422();
        if (class133.field1943 != null) {
            class189.method1245(true);
            class271.method1733(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class189.method1245(false);
        }
        class271.method1733(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method791(int arg0) {
        field1721++;
        class270.field3946 = new class234();
        if (arg0 != 0) {
            method792(-123);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static void method792(int arg0) {
        if (arg0 != -2600) {
            method789(-14, 22, -25, -26, true, (byte) -21);
        }
        field1726 = null;
    }
}
