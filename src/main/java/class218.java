import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class218 {

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field3847 = 0;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lmh;")
    private static class128 field3844 = class22.method156(126, "Opened title screen");

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lmh;")
    public static class128 field3842 = field3844;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method1503(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class310.field5264 != null) {
            class310.field5264.method1680(-30144);
        }
        field3846++;
        if (class257.field4412 != null) {
            class257.field4412.method1680(-30144);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 29)
    public static final void method1504(int arg0) {
        Container var1;
        if (class114.field1924 != null) {
            var1 = class114.field1924;
        } else if (class200.field3483 == null) {
            var1 = class288.field4925.field4677;
        } else {
            var1 = class200.field3483;
        }
        field3848++;
        class196.field3431 = var1.getSize().width;
        class57.field1090 = var1.getSize().height;
        if (class200.field3483 == var1) {
            Insets var2 = class200.field3483.getInsets();
            class57.field1090 -= var2.top + var2.bottom;
            class196.field3431 -= var2.right + var2.left;
        }
        if (class166.method1089(2) >= 2) {
            class16.field420 = class57.field1090;
            class199.field3465 = class196.field3431;
            class309.field5249 = 0;
            class170.field2968 = 0;
        } else {
            class309.field5249 = (class196.field3431 - 765) / 2;
            class199.field3465 = 765;
            class170.field2968 = 0;
            class16.field420 = 503;
        }
        if (class247.field4247) {
            class247.method1702(class199.field3465, class16.field420);
        }
        class203.field3589.setSize(class199.field3465, class16.field420);
        if (class200.field3483 == var1) {
            Insets var3 = class200.field3483.getInsets();
            class203.field3589.setLocation(class309.field5249 + var3.left, class170.field2968 + var3.top);
        } else {
            class203.field3589.setLocation(class309.field5249, class170.field2968);
        }
        if (~class196.field3433 != arg0) {
            class206.method1420(true, arg0 ^ 0x5D);
        }
        class259.method1818(0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZIII)V", line = 87)
    public static final void method1505(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class167.field2873++;
        field3836++;
        if (!arg2) {
            class20.method147(true, 64);
            class309.method2108(true, (byte) 7);
            class20.method147(false, 64);
        }
        class309.method2108(false, (byte) 7);
        if (!arg2) {
            class26.method172(-29059);
        }
        class56.method377(122);
        if (class247.field4247) {
            class69.method460(arg5, arg0, (byte) -96, arg1, arg3, true);
            arg3 = class57.field1089;
            arg0 = class140.field2403;
            arg5 = class116.field1951;
            arg1 = class45.field911;
        }
        if (class1.field21 == 1) {
            int var6 = class115.field1945;
            int var7 = class31.field696 + class118.field1997 & 0x7FF;
            if (class208.field3648 / 256 > var6) {
                var6 = class208.field3648 / 256;
            }
            if (class183.field3217[4] && (class306.field5216[4] + 128) > var6) {
                var6 = class306.field5216[4] + 128;
            }
            class291.method2001(arg3, class164.field2822, 24738, class64.method427(class163.field2796.field478, class163.field2796.field418, class133.field2315, (byte) 108) - 50, var6, class253.field4367, var6 * 3 + 600, var7);
        }
        int var8 = class142.field2436;
        int var9 = class187.field3249;
        int var10 = class143.field2445;
        int var11 = class33.field716;
        int var12 = class311.field5271;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class183.field3217[var13]) {
                int var14 = (int) (Math.random() * (double) (class93.field1581[var13] * 2 + 1) + Math.sin((double) class185.field3227[var13] / 100.0D * (double) class117.field1988[var13]) * (double) class306.field5216[var13] - (double) class93.field1581[var13]);
                if (var13 == 1) {
                    class187.field3249 += var14;
                }
                if (var13 == 0) {
                    class142.field2436 += var14;
                }
                if (var13 == 4) {
                    class311.field5271 += var14;
                    if (class311.field5271 < 128) {
                        class311.field5271 = 128;
                    }
                    if (class311.field5271 > 383) {
                        class311.field5271 = 383;
                    }
                }
                if (var13 == 2) {
                    class143.field2445 += var14;
                }
                if (var13 == 3) {
                    class33.field716 = class33.field716 + var14 & 0x7FF;
                }
            }
        }
        class30.method219((byte) 63);
        if (class247.field4247) {
            class269.method1875(arg0, arg1, arg0 + arg5, arg1 + arg3);
            float var15 = (float) class33.field716 * 0.17578125F;
            float var16 = (float) class311.field5271 * 0.17578125F;
            if (class1.field21 == 3) {
                var16 = class91.field1550 * 360.0F / 6.2831855F;
                var15 = class165.field2835 * 360.0F / 6.2831855F;
            }
            class247.method1703(arg0, arg1, arg5, arg3, arg5 / 2 + arg0, arg3 / 2 + arg1, var16, var15, class86.field1506, class86.field1506);
        } else {
            class213.method1470(arg0, arg1, arg0 + arg5, arg1 + arg3);
            class141.method943();
        }
        if (class271.field4721 || arg0 > class252.field4359 || class252.field4359 >= arg0 + arg5 || arg1 > class178.field3129 || arg1 + arg3 <= class178.field3129) {
            class281.field4853 = 0;
            class77.field1419 = false;
        } else {
            class77.field1419 = true;
            class281.field4853 = 0;
            int var17 = class170.field2965;
            int var18 = class98.field1704;
            class15.field409 = (class252.field4359 - arg0) * (var18 - var17) / arg5 + var17;
            int var19 = class262.field4550;
            int var20 = class8.field189;
            class152.field2614 = (class178.field3129 - arg1) * (var20 - var19) / arg3 + var19;
        }
        method1503(false);
        byte var21 = class290.method1997(16745) == 2 ? (byte) class167.field2873 : 1;
        if (class247.field4247) {
            class247.method1715();
            class247.method1713(true);
            class247.method1681(true);
            boolean var22 = false;
            int var23;
            if (class105.field1799 == 10) {
                var23 = class62.method407(class142.field2436 >> 10, class50.field992, (byte) 107, class254.field4378, class143.field2445 >> 10);
            } else {
                var23 = class62.method407(class163.field2796.field450[0] >> 3, class50.field992, (byte) 105, class254.field4378, class163.field2796.field422[0] >> 3);
            }
            class46.method307(class293.field5011, !class260.field4512);
            class247.method1712(var23);
            class185.method1252(class142.field2436, class33.field716, class143.field2445, 106, class311.field5271, class187.field3249);
            class247.field4243 = class293.field5011;
            class89.method558(class142.field2436, class187.field3249, class143.field2445, class311.field5271, class33.field716, class31.field684, class151.field2608, class248.field4276, class236.field4046, class117.field1981, class242.field4143, class133.field2315 + 1, var21, class163.field2796.field478 >> 7, class163.field2796.field418 >> 7);
            class226.field3947 = true;
            class46.method308();
            class185.method1252(0, 0, 0, 98, 0, 0);
            method1503(false);
            class42.method293();
            class27.method176(arg5, class86.field1506, arg3, class86.field1506, arg0, arg1, 29);
            class82.method527(arg0, arg1, arg3, -7142, class86.field1506, class86.field1506, arg5);
        } else {
            class213.method1464(arg0, arg1, arg5, arg3, 0);
            class89.method558(class142.field2436, class187.field3249, class143.field2445, class311.field5271, class33.field716, class31.field684, class151.field2608, class248.field4276, class236.field4046, class117.field1981, class242.field4143, class133.field2315 + 1, var21, class163.field2796.field478 >> 7, class163.field2796.field418 >> 7);
            method1503(false);
            class42.method293();
            class27.method176(arg5, 256, arg3, 256, arg0, arg1, 63);
            class82.method527(arg0, arg1, arg3, -7142, 256, 256, arg5);
        }
        ((class163) class141.field2419).method1074(class50.field992, 0);
        class34.method242(arg5, arg0, arg1, arg3, (byte) -28);
        class143.field2445 = var10;
        class311.field5271 = var12;
        class33.field716 = var11;
        class187.field3249 = var9;
        class142.field2436 = var8;
        if (class15.field403 && class56.field1078.method671((byte) -96) == 0) {
            class15.field403 = false;
        }
        if (class15.field403) {
            if (class247.field4247) {
                class269.method1878(arg0, arg1, arg5, arg3, 0);
            } else {
                class213.method1464(arg0, arg1, arg5, arg3, 0);
            }
            class309.method2107(class32.field706, false, -23465);
        }
        if (arg4 >= -46) {
            method1503(true);
        }
        if (!arg2 && !class15.field403 && !class271.field4721 && arg0 <= class252.field4359 && arg0 + arg5 > class252.field4359 && class178.field3129 >= arg1 && class178.field3129 < (arg1 + arg3)) {
            class313.method2136((byte) 85, arg1, arg0, arg3, class178.field3129, class252.field4359, arg5);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 309)
    public static void method1506(int arg0) {
        if (arg0 == -12926) {
            field3842 = null;
            field3844 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V", line = 324)
    public static final void method1507(int arg0) {
        field3840++;
        while (class54.field1051.method572(class102.field1749, (byte) -92) >= 11) {
            int var1 = class54.field1051.method564((byte) -117, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class140.field2405[var1] == null) {
                class140.field2405[var1] = new class123();
                var2 = true;
                if (class303.field5137[var1] != null) {
                    class140.field2405[var1].method754(class303.field5137[var1], (byte) -96);
                }
            }
            class203.field3593[class75.field1404++] = var1;
            class123 var3 = class140.field2405[var1];
            var3.field477 = class293.field5011;
            int var4 = class54.field1051.method564((byte) -124, 5);
            int var5 = class54.field1051.method564((byte) -115, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class54.field1051.method564((byte) -105, 1);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var6 == 1) {
                class158.field2715[class314.field5335++] = var1;
            }
            int var7 = class56.field1084[class54.field1051.method564((byte) -97, 3)];
            if (var2) {
                var3.field476 = var3.field460 = var7;
            }
            int var8 = class54.field1051.method564((byte) -127, 1);
            var3.method750(class163.field2796.field422[0] + var5, var8 == 1, -65536, class163.field2796.field450[0] + var4);
        }
        if (arg0 != -2) {
            field3844 = (class128) null;
        }
        class54.field1051.method562(0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZZIIB)V", line = 395)
    public static final void method1508(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != 64) {
            method1506(-58);
        }
        if (arg1 > arg0) {
            int var7 = (arg0 + arg1) / 2;
            class140 var8 = class219.field3862[var7];
            int var9 = arg0;
            class219.field3862[var7] = class219.field3862[arg1];
            class219.field3862[arg1] = var8;
            for (int var10 = arg0; var10 < arg1; var10++) {
                if (class290.method1995(-2628, arg2, arg3, arg4, var8, class219.field3862[var10], arg5) <= 0) {
                    class140 var11 = class219.field3862[var10];
                    class219.field3862[var10] = class219.field3862[var9];
                    class219.field3862[var9++] = var11;
                }
            }
            class219.field3862[arg1] = class219.field3862[var9];
            class219.field3862[var9] = var8;
            method1508(arg0, var9 - 1, arg2, arg3, arg4, arg5, (byte) 64);
            method1508(var9 + 1, arg1, arg2, arg3, arg4, arg5, (byte) 64);
        }
        field3843++;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V", line = 442)
    public static final void method1509(int arg0) {
        int var1 = (class142.field2436 >> 10) + (class221.field3889 >> 3);
        field3841++;
        if (arg0 < 74) {
            return;
        }
        int var2 = (class4.field72 >> 3) + (class143.field2445 >> 10);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class175.field3099 = new int[var6];
        class34.field733 = new byte[var6][];
        class128.field2177 = new int[var6];
        class189.field3283 = new int[var6];
        class56.field1079 = new int[var6];
        class226.field3949 = new int[var6];
        class52.field1025 = new byte[var6][];
        class8.field183 = new byte[var6][];
        class77.field1422 = new byte[var6][];
        class144.field2461 = new int[var6][4];
        class285.field4890 = new int[var6];
        class38.field810 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= ((var2 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class226.field3949[var7] = var10;
                class175.field3099[var7] = class288.field4924.method2142(1, class28.method177((byte) -123, new class128[] { class266.field4617, class257.method1811(var8, (byte) 69), class170.field2957, class257.method1811(var9, (byte) -120) }));
                class56.field1079[var7] = class288.field4924.method2142(1, class28.method177((byte) -72, new class128[] { class261.field4524, class257.method1811(var8, (byte) -121), class170.field2957, class257.method1811(var9, (byte) 40) }));
                class285.field4890[var7] = class288.field4924.method2142(1, class28.method177((byte) -106, new class128[] { class104.field1789, class257.method1811(var8, (byte) -126), class170.field2957, class257.method1811(var9, (byte) 29) }));
                class189.field3283[var7] = class288.field4924.method2142(1, class28.method177((byte) -81, new class128[] { class253.field4369, class257.method1811(var8, (byte) -120), class170.field2957, class257.method1811(var9, (byte) 58) }));
                class128.field2177[var7] = class288.field4924.method2142(1, class28.method177((byte) -116, new class128[] { class181.field3178, class257.method1811(var8, (byte) 85), class170.field2957, class257.method1811(var9, (byte) 107) }));
                if (class285.field4890[var7] == -1) {
                    class175.field3099[var7] = -1;
                    class56.field1079[var7] = -1;
                    class189.field3283[var7] = -1;
                    class128.field2177[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class285.field4890.length; var11++) {
            class285.field4890[var11] = -1;
            class175.field3099[var11] = -1;
            class56.field1079[var11] = -1;
            class189.field3283[var11] = -1;
            class128.field2177[var11] = -1;
        }
        class171.method1148(var5, var4, var3, 64, var1, var2, true);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZI)V", line = 522)
    public static final void method1510(int arg0, int arg1, boolean arg2, int arg3) {
        field3837++;
        if (class214.field3778 != 0 && arg0 != 0 && class295.field5039 < 50 && arg1 != -1) {
            class147.field2537[class295.field5039] = arg1;
            class176.field3102[class295.field5039] = arg0;
            class193.field3338[class295.field5039] = arg3;
            class254.field4375[class295.field5039] = null;
            class255.field4396[class295.field5039] = 0;
            class295.field5039++;
        }
        if (arg2) {
            method1508(-119, 106, true, true, 42, 106, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V", line = 557)
    public static final void method1511(int arg0, int arg1) {
        field3845++;
        class245 var2 = (class245) class151.field2591.method728(false, (long) arg0);
        if (arg1 != 503) {
            method1506(30);
        }
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field4185.length; var3++) {
                var2.field4185[var3] = -1;
                var2.field4184[var3] = 0;
            }
        }
    }
}
