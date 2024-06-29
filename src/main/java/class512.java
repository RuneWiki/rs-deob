import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class512 {

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public static int field7301 = 0;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "[I")
    public static int[] field7307 = new int[2];

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "Lg;")
    public static class155 field7303;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lwp;I)V")
    public static final void method3022(class179 arg0, int arg1) {
        field7305++;
        for (int var2 = 0; var2 < class165.field1846; var2++) {
            int var4 = class111.field1169[var2];
            class183 var5 = class75.field792[var4];
            int var6 = arg0.method1423(-86);
            if ((var6 & 0x1) != 0) {
                var6 += arg0.method1423(-118) << 8;
            }
            if ((var6 & 0x1000) != 0) {
                var6 += arg0.method1423(-42) << 16;
            }
            class390.method2405(arg0, var5, (byte) -49, var4, var6);
        }
        int var3 = 63 % ((-arg1 - 15) / 48);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
    public static final void method3023(byte arg0) {
        class620 var1 = class326.field4231;
        synchronized (class326.field4231) {
            class326.field4231.method3541(-647);
            if (arg0 != 115) {
                method3024(-100, 70, 7);
            }
        }
        field7306++;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)I")
    public static final int method3024(int arg0, int arg1, int arg2) {
        field7304++;
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        if (arg1 != 12435) {
            field7303 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lha;IBIII)V")
    public static final void method3025(class58 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field7310++;
        class574.field8144 = arg0;
        class624.field8947 = class574.field8144.method352();
        if (arg2 != 99) {
            method3028(-38, null, 124, null, 67, null, null, -112, null);
        }
        class541.field7790 = class574.field8144.method352();
        class227.field2589 = class574.field8144.method352();
        class11.field87 = null;
        class151.field1667 = null;
        class485.field6895 = arg1;
        class200.field2367 = arg3;
        class3.field27 = 0;
        class85.method598(arg5, arg2 ^ 0xFFFFFF9C, arg4);
        class649.field9281 = -1;
        class71.field759 = -1;
        class308.field3828 = -1;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(BIIIIZ)V")
    public static final void method3026(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field7309++;
        if (class638.field9170 == null) {
            class275.field3370.method410(-16777216, arg3, arg2, -97, arg1, arg4);
        } else if (class90.field937.field4635 >= 0 && class489.field6976 * 512 > class90.field937.field4635 && class90.field937.field4629 >= 0 && class90.field937.field4629 < (class153.field1677 * 512)) {
            class188.field2231++;
            if (class90.field937 != null && class90.field937.field4635 - (class90.field937.method1128(-1) - 1) * 256 >> 9 == class471.field6718 && (class90.field937.field4629 + 256 - (class90.field937.method1128(-1) * 256) >> 9) == class75.field796) {
                class471.field6718 = -1;
                class75.field796 = -1;
                class286.method1705((byte) 8);
            }
            class556.method3266((byte) -86);
            if (!arg5) {
                class565.method3288(-4);
            }
            class377.method2191((byte) -111);
            class96.method683(arg3, true, 334, arg1, arg4, arg2);
            int var6 = class429.field6240;
            int var7 = class519.field7377;
            int var8 = class440.field6390;
            int var9 = class183.field2159;
            class586.field8268 = class586.field8269;
            if (class496.field7014 == 1) {
                int var12 = (int) class308.field3835;
                if ((class591.field8330 >> 8) > var12) {
                    var12 = class591.field8330 >> 8;
                }
                if (class320.field4080[4] && var12 < (class99.field1032[4] + 128)) {
                    var12 = class99.field1032[4] + 128;
                }
                int var13 = (int) class227.field2590 + class641.field9184 & 0x3FFF;
                class71.method522(var13, -1, (var12 >> 3) * 3 + 600 << 2, var12, var9, class496.field7015, class676.method3845(class90.field937.field4629, class90.field937.field4635, 0, class122.field1278) - 200, class559.field7986);
            } else if (class496.field7014 == 4) {
                int var10 = (int) class308.field3835;
                if (var10 < class591.field8330 >> 8) {
                    var10 = class591.field8330 >> 8;
                }
                if (class320.field4080[4] && var10 < class99.field1032[4] + 128) {
                    var10 = class99.field1032[4] + 128;
                }
                int var11 = (int) class227.field2590 & 0x3FFF;
                class71.method522(var11, -1, (var10 >> 3) * 3 + 600 << 2, var10, var9, class496.field7015, class676.method3845(class246.field2994, class175.field2062, 0, class122.field1278) - 200, class559.field7986);
            } else if (class496.field7014 == 5) {
                class431.method2702(var9, 2);
            }
            int var14 = class167.field1855;
            int var15 = class204.field2409;
            if (arg0 < 93) {
                field7301 = -61;
            }
            int var16 = class590.field8319;
            int var17 = class27.field281;
            int var18 = class152.field1670;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class320.field4080[var19]) {
                    int var22 = (int) ((double) (-class169.field1894[var19]) + Math.random() * (double) (class169.field1894[var19] * 2 + 1) + Math.sin((double) class20.field182[var19] / 100.0D * (double) class745.field10407[var19]) * (double) class99.field1032[var19]);
                    if (var19 == 1) {
                        class204.field2409 += var22 << 2;
                    }
                    if (var19 == 2) {
                        class590.field8319 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class152.field1670 = class152.field1670 + var22 & 0x3FFF;
                    }
                    if (var19 == 0) {
                        class167.field1855 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class27.field281 += var22;
                        if (class27.field281 < 1024) {
                            class27.field281 = 1024;
                        } else if (class27.field281 > 3072) {
                            class27.field281 = 3072;
                        }
                    }
                }
            }
            if (class167.field1855 < 0) {
                class167.field1855 = 0;
            }
            if (class590.field8319 < 0) {
                class590.field8319 = 0;
            }
            if (class167.field1855 > ((class284.field3473 << 9) - 1)) {
                class167.field1855 = (class284.field3473 << 9) - 1;
            }
            if ((class151.field1664 << 9) - 1 < class590.field8319) {
                class590.field8319 = (class151.field1664 << 9) - 1;
            }
            class742.method4133(-1);
            class135.method868(-21176);
            class275.field3370.method432(var7, var8, var6 + var7, var8 - -var9);
            class496.method2960(-30022, true);
            if (class397.field5443) {
                class200.method1208(94, class501.field7036);
                if (class586.field8268 != class271.field3354) {
                    class568.field8076 = true;
                }
                class271.field3354 = class586.field8268;
            } else {
                class275.field3370.method319();
                int var20 = class501.field7036;
                if (class12.field103 == null) {
                    class275.field3370.method378(var20);
                } else {
                    class12.field103.method2632(var6, var20, class566.field8055 << 3, var9, class27.field281, false, class152.field1670, class275.field3370, var7, var8);
                }
            }
            class381.method2343(false);
            class667.field9490.method1018(class167.field1855, class204.field2409, class590.field8319, -class27.field281 & 0x3FFF, -class152.field1670 & 0x3FFF, -class522.field7423 & 0x3FFF);
            class275.field3370.method339(class667.field9490);
            class275.field3370.method400(var6 / 2 + var7, var9 / 2 + var8, class227.field2594 << 1, class227.field2594 << 1);
            class286.method1703(class227.field2594 << 1, class227.field2594 << 1, -102, var8 + (var9 / 2), var6 / 2 + var7);
            class256.method1528(-class152.field1670 & 0x3FFF, class590.field8319, class204.field2409, -class522.field7423 & 0x3FFF, class167.field1855, -class27.field281 & 0x3FFF, 97);
            byte var21 = class654.field9334.field9834.method549(35) == 2 ? (byte) class188.field2231 : 1;
            if (class397.field5443) {
                class192.method1164(-class152.field1670 & 0x3FFF, -class27.field281 & 0x3FFF, -2124701936, -class522.field7423 & 0x3FFF);
                class421.method2644(class167.field1855, class590.field8319, class586.field8268, class90.field937.field4635 >> 9, class90.field937.field4628 + 1, class169.field1892, class204.field2409, class637.field9155, var21, class392.field5398, class219.field2538, class654.field9334.field9847.method999(16) == 0, true, class368.field4706, -107, class90.field937.field4629 >> 9, class11.field91, class200.field2371);
            } else {
                class287.method1707(class392.field5398, class167.field1855, class204.field2409, class590.field8319, class637.field9155, class11.field91, class169.field1892, class368.field4706, class219.field2538, class200.field2371, class90.field937.field4628 + 1, var21, class90.field937.field4635 >> 9, class90.field937.field4629 >> 9, class654.field9334.field9847.method999(-120) == 0, true, class626.field8994 ? class586.field8268 : -1, 0, false);
            }
            class381.method2343(false);
            if (class392.field5397 == 10) {
                class301.method1803(var7, var8, var9, 256, (byte) -55, var6, 256);
                class266.method1600(var8, 256, 256, var7, var9, (byte) -114, var6);
                class414.method2530(256, 32268, var7, var6, 256, var8, var9);
                class479.method2880(var9, var8, var7, var6, 0);
            }
            class735.method4097();
            class152.field1670 = var18;
            class27.field281 = var17;
            class204.field2409 = var15;
            class590.field8319 = var16;
            class167.field1855 = var14;
            if (class385.field5353 && class227.field2592.method2011(0) == 0) {
                class385.field5353 = false;
            }
            if (class385.field5353) {
                class275.field3370.method410(-16777216, var7, var9, 78, var8, var6);
                class192.method1170(class720.field10104, false, -8069, class275.field3370, class486.field6916.method2936(class489.field6978, -64), class740.field10344);
            }
            class496.method2960(-30022, false);
        } else {
            class275.field3370.method410(-16777216, arg3, arg2, -119, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILha;)V")
    public static final void method3027(int arg0, class58 arg1) {
        if (arg0 >= -77) {
            return;
        }
        for (class257 var2 = (class257) class125.field1310.method2790(120); var2 != null; var2 = (class257) class125.field1310.method2794(71)) {
            if (var2.field3147) {
                var2.method1544(arg1);
            }
        }
        field7308++;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public static final void method3028(int arg0, String arg1, int arg2, String arg3, int arg4, String arg5, String arg6, int arg7, String arg8) {
        field7300++;
        class265 var9 = class206.field2433[99];
        if (arg7 != 23265) {
            method3023((byte) 28);
        }
        for (int var10 = 99; var10 > 0; var10--) {
            class206.field2433[var10] = class206.field2433[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class265(arg2, arg0, arg5, arg6, arg8, arg1, arg4, arg3);
        } else {
            var9.method1596(arg6, arg5, arg8, (byte) -36, arg0, arg2, arg3, arg1, arg4);
        }
        class726.field10151++;
        class206.field2433[0] = var9;
        class735.field10279 = class514.field7334;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)V")
    public static final void method3029(boolean arg0) {
        if (class544.field7822 <= 0) {
            class417.field5723 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class15.field140.length; var2++) {
                if (class15.field140[var2].indexOf("--> ") != -1) {
                    int var10000 = ~class544.field7822;
                    var1++;
                    if (var10000 == ~var1) {
                        class417.field5723 = class15.field140[var2].substring(class15.field140[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        }
        field7302++;
        if (!arg0) {
            field7307 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(B)V")
    public static void method3030(byte arg0) {
        if (arg0 != 64) {
            field7303 = null;
        }
        field7307 = null;
        field7303 = null;
    }
}
