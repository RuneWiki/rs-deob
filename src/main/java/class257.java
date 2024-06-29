import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class257 extends class60 {

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field3808 = 0;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "Z")
    public static boolean field3810 = true;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public static int field3824 = 0;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field3809 = 0;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "F")
    public static float field3812;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIILeh;IJIIII)Z", line = 8)
    public static final boolean method1775(int arg0, int arg1, int arg2, int arg3, class179 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class75.method596(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Z", line = 15)
    public final boolean method1776(byte arg0) {
        if (arg0 != 55) {
            this.method1777(7);
        }
        field3805++;
        return (this.field3822 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I", line = 26)
    public final int method1777(int arg0) {
        field3817++;
        return arg0 == -2171 ? class310.method2194(this.field3822, -113) : -38;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(Z)V", line = 37)
    public static final void method1778(boolean arg0) {
        if (!arg0) {
            field3812 = 0.003251749F;
        }
        field3825++;
        for (int var1 = 0; var1 < class113.field1828; var1++) {
            int var10002 = class200.field3068[var1]--;
            if (class200.field3068[var1] >= -10) {
                class234 var2 = class226.field3502[var1];
                if (var2 == null) {
                    var2 = class234.method1683(class208.field3288, class90.field1445[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class200.field3068[var1] += var2.method1684();
                    class226.field3502[var1] = var2;
                }
                if (class200.field3068[var1] < 0) {
                    int var3;
                    if (class308.field4878[var1] == 0) {
                        var3 = class180.field2869[var1] * class73.field1106 >> 8;
                    } else {
                        int var4 = (class308.field4878[var1] & 0xFF) * 128;
                        int var5 = class308.field4878[var1] >> 16 & 0xFF;
                        int var6 = (class308.field4878[var1] & 0xFFAD) >> 8;
                        int var7 = var6 * 128 + 64 - class345.field5363.field4672;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 * 128 + 64 - class345.field5363.field4671;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var7 - 128;
                        if (var9 > var4) {
                            class200.field3068[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var3 = class180.field2869[var1] * class22.field398 * (var4 - var9) / var4 >> 8;
                    }
                    if (var3 > 0) {
                        class187 var10 = var2.method1685().method1358(class342.field5293);
                        class269 var11 = class269.method1893(var10, 100, var3);
                        var11.method1880(client.field4120[var1] - 1);
                        class181.field2877.method2342(var11);
                    }
                    class200.field3068[var1] = -100;
                }
            } else {
                class113.field1828--;
                for (int var12 = var1; var12 < class113.field1828; var12++) {
                    class90.field1445[var12] = class90.field1445[var12 + 1];
                    class226.field3502[var12] = class226.field3502[var12 + 1];
                    client.field4120[var12] = client.field4120[var12 + 1];
                    class200.field3068[var12] = class200.field3068[var12 + 1];
                    class308.field4878[var12] = class308.field4878[var12 + 1];
                    class180.field2869[var12] = class180.field2869[var12 + 1];
                }
                var1--;
            }
        }
        if (class188.field2957 && !class14.method182(-25)) {
            if (class80.field1253 != 0 && class118.field1906 != -1) {
                class66.method527(class79.field1232, class80.field1253, 0, class118.field1906, false, 10000);
            }
            class188.field2957 = false;
        } else if (class80.field1253 != 0 && class118.field1906 != -1 && !class14.method182(-32)) {
            class209.field3305.method1808((byte) -74, 33);
            class209.field3305.method11(class118.field1906, 31932);
            class130.field2079++;
            class118.field1906 = -1;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z", line = 167)
    public final boolean method1779(int arg0, int arg1) {
        field3815++;
        if (arg0 == -1) {
            return (this.field3822 >> arg1 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)Z", line = 190)
    public final boolean method1780(int arg0) {
        field3826++;
        if (arg0 < 118) {
            this.method1786(85);
        }
        return (this.field3822 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLcm;I)V", line = 201)
    public static final void method1781(boolean arg0, class205 arg1, int arg2) {
        if (arg2 != -4535) {
            return;
        }
        if (class162.field2623 || arg0) {
            int var3 = class338.field5219;
            int var4 = var3 * 956 / 503;
            class6.field142.method695((class211.field3314 - var4) / 2, 0, var4, var3);
            class288.field4547.method990(class211.field3314 / 2 - (class288.field4547.field3065 / 2), 18);
        }
        arg1.method1492(class111.field1803, class211.field3314 / 2, class338.field5219 / 2 - 26, 16777215, -1);
        int var5 = class338.field5219 / 2 - 18;
        field3823++;
        if (class162.field2623) {
            class114.method897(class211.field3314 / 2 - 152, var5, 304, 34, 9179409);
            class114.method897(class211.field3314 / 2 - 151, var5 + 1, 302, 32, 0);
            class114.method887(class211.field3314 / 2 - 150, var5 + 2, class126.field2019 * 3, 30, 9179409);
            class114.method887(class126.field2019 * 3 + (class211.field3314 / 2 - 150), var5 + 2, 300 - class126.field2019 * 3, 30, 0);
        } else {
            class33.method293(class211.field3314 / 2 - 152, var5, 304, 34, 9179409);
            class33.method293(class211.field3314 / 2 - 151, var5 - -1, 302, 32, 0);
            class33.method288(class211.field3314 / 2 - 150, var5 + 2, class126.field2019 * 3, 30, 9179409);
            class33.method288(class126.field2019 * 3 + class211.field3314 / 2 - 150, var5 + 2, 300 - (class126.field2019 * 3), 30, 0);
        }
        arg1.method1492(class44.field696, class211.field3314 / 2, class338.field5219 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(Z)I", line = 242)
    public final int method1782(boolean arg0) {
        if (!arg0) {
            this.method1782(true);
        }
        field3819++;
        return (this.field3822 & 0x1FC1DB) >> 18;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V", line = 254)
    public static final void method1783(int arg0) {
        field3818++;
        if (class107.field1758 == 0 || class107.field1758 == 5) {
            return;
        }
        try {
            if ((++class311.field4917) > 2000) {
                if (class319.field5005 != null) {
                    class319.field5005.method371(-2);
                    class319.field5005 = null;
                }
                if (class49.field744 >= 1) {
                    class107.field1758 = 0;
                    class133.field2117 = -5;
                    return;
                }
                class311.field4917 = 0;
                class49.field744++;
                if (class166.field2679 == class10.field237) {
                    class166.field2679 = class247.field3681;
                } else {
                    class166.field2679 = class10.field237;
                }
                class107.field1758 = 1;
            }
            if (class107.field1758 == 1) {
                class334.field5192 = class92.field1484.method549(class342.field5303, class166.field2679, (byte) 113);
                class107.field1758 = 2;
            }
            if (class107.field1758 == 2) {
                if (class334.field5192.field405 == 2) {
                    throw new IOException();
                }
                if (class334.field5192.field405 != 1) {
                    return;
                }
                class319.field5005 = new class41((Socket) class334.field5192.field409, class92.field1484);
                class334.field5192 = null;
                long var1 = class337.field5213 = class106.method851(class314.field4949, -112);
                class209.field3305.field48 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class209.field3305.method21(-120, 14);
                class209.field3305.method21(31, var3);
                class319.field5005.method373(1, 0, class209.field3305.field34, 2);
                if (class55.field837 != null) {
                    class55.field837.method2326((byte) 35);
                }
                if (class255.field3765 != null) {
                    class255.field3765.method2326((byte) 123);
                }
                int var4 = class319.field5005.method372(0);
                if (class55.field837 != null) {
                    class55.field837.method2326((byte) 99);
                }
                if (class255.field3765 != null) {
                    class255.field3765.method2326((byte) 56);
                }
                if (var4 != 0) {
                    class107.field1758 = 0;
                    class133.field2117 = var4;
                    class319.field5005.method371(-2);
                    class319.field5005 = null;
                    return;
                }
                class107.field1758 = 3;
            }
            if (class107.field1758 == 3) {
                if (class319.field5005.method370((byte) 123) < 8) {
                    return;
                }
                class319.field5005.method377(10647, 0, 8, class80.field1248.field34);
                int[] var5 = new int[4];
                class80.field1248.field48 = 0;
                class202.field3161 = class80.field1248.method28((byte) -53);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class209.field3305.field48 = 0;
                var5[2] = (int) (class202.field3161 >> 32);
                var5[3] = (int) class202.field3161;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class209.field3305.method21(-125, 10);
                class209.field3305.method11(var5[0], 31932);
                class209.field3305.method11(var5[1], 31932);
                class209.field3305.method11(var5[2], 31932);
                class209.field3305.method11(var5[3], 31932);
                class209.field3305.method59(class106.method851(class314.field4949, -43), false);
                class209.field3305.method12(class106.field1736, (byte) -47);
                class209.field3305.method24(class308.field4877, -114, class232.field3540);
                class281.field4398.field48 = 0;
                if (class289.field4548 == 40) {
                    class281.field4398.method21(58, 18);
                } else {
                    class281.field4398.method21(-99, 16);
                }
                class281.field4398.method14(-246866616, class209.field3305.field48 + class274.method1951(-1, class259.field3844) + 163);
                class281.field4398.method11(544, 31932);
                class281.field4398.method21(-118, class3.field99);
                class281.field4398.method21(57, class67.field1020 ? 1 : 0);
                class281.field4398.method21(-103, 1);
                class281.field4398.method21(-118, class101.method823(-53));
                class281.field4398.method14(-246866616, class211.field3314);
                class281.field4398.method14(-246866616, class338.field5219);
                class281.field4398.method21(109, class315.field4973);
                class305.method2166(30896, class281.field4398);
                class281.field4398.method12(class259.field3844, (byte) -47);
                class281.field4398.method11(class151.field2464, 31932);
                class281.field4398.method11(class168.method1254(1), 31932);
                class117.field1905 = true;
                class281.field4398.method14(-246866616, class303.field4834);
                class281.field4398.method11(class74.field1138.method946((byte) 112), 31932);
                class281.field4398.method11(class185.field2932.method946((byte) 33), 31932);
                class281.field4398.method11(class144.field2328.method946((byte) -128), 31932);
                class281.field4398.method11(class52.field771.method946((byte) -111), 31932);
                class281.field4398.method11(class208.field3288.method946((byte) -125), 31932);
                class281.field4398.method11(class200.field3062.method946((byte) -125), 31932);
                class281.field4398.method11(class79.field1232.method946((byte) -121), 31932);
                class281.field4398.method11(class147.field2407.method946((byte) 31), 31932);
                class281.field4398.method11(class176.field2815.method946((byte) 106), 31932);
                class281.field4398.method11(class181.field2878.method946((byte) -113), 31932);
                class281.field4398.method11(class110.field1793.method946((byte) -124), 31932);
                class281.field4398.method11(class136.field2209.method946((byte) -114), 31932);
                class281.field4398.method11(class111.field1809.method946((byte) 46), 31932);
                class281.field4398.method11(class140.field2262.method946((byte) 7), 31932);
                class281.field4398.method11(class243.field3643.method946((byte) 45), 31932);
                class281.field4398.method11(class62.field910.method946((byte) 92), 31932);
                class281.field4398.method11(class30.field468.method946((byte) 69), 31932);
                class281.field4398.method11(class337.field5215.method946((byte) 117), 31932);
                class281.field4398.method11(class85.field1370.method946((byte) 52), 31932);
                class281.field4398.method11(class281.field4407.method946((byte) -122), 31932);
                class281.field4398.method11(class20.field363.method946((byte) -128), 31932);
                class281.field4398.method11(class242.field3626.method946((byte) -124), 31932);
                class281.field4398.method11(class106.field1747.method946((byte) -123), 31932);
                class281.field4398.method11(class73.field1113.method946((byte) -120), 31932);
                class281.field4398.method11(class120.field1965.method946((byte) -128), 31932);
                class281.field4398.method11(class122.field1982.method946((byte) 18), 31932);
                class281.field4398.method11(class120.field1938.method946((byte) -120), 31932);
                class281.field4398.method11(class180.field2864.method946((byte) -122), 31932);
                class281.field4398.method11(class5.field122.method946((byte) -121), 31932);
                class281.field4398.method61(class209.field3305.field48, class209.field3305.field34, 0, -2131480434);
                class319.field5005.method373(1, 0, class281.field4398.field34, class281.field4398.field48);
                class209.field3305.method1797(var5, 122);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class80.field1248.method1797(var5, 126);
                class107.field1758 = 4;
            }
            if (class107.field1758 == 4) {
                if (class319.field5005.method370((byte) 125) < 1) {
                    return;
                }
                int var7 = class319.field5005.method372(0);
                if (var7 == 21) {
                    class107.field1758 = 7;
                } else if (var7 == 29) {
                    class107.field1758 = 10;
                } else if (var7 == 1) {
                    class107.field1758 = 5;
                    class133.field2117 = var7;
                    return;
                } else if (var7 == 2) {
                    class107.field1758 = 8;
                } else if (var7 == 15) {
                    class133.field2117 = var7;
                    class107.field1758 = 0;
                    return;
                } else if (var7 == 23 && class49.field744 < 1) {
                    class49.field744++;
                    class107.field1758 = 1;
                    class311.field4917 = 0;
                    class319.field5005.method371(-2);
                    class319.field5005 = null;
                    return;
                } else {
                    class107.field1758 = 0;
                    class133.field2117 = var7;
                    class319.field5005.method371(-2);
                    class319.field5005 = null;
                    return;
                }
            }
            if (class107.field1758 == 6) {
                class209.field3305.field48 = 0;
                class209.field3305.method1808((byte) -74, 17);
                class319.field5005.method373(1, 0, class209.field3305.field34, class209.field3305.field48);
                class107.field1758 = 4;
                return;
            }
            if (class107.field1758 == 7) {
                if (class319.field5005.method370((byte) 123) >= 1) {
                    class284.field4424 = (class319.field5005.method372(0) + 3) * 60;
                    class107.field1758 = 0;
                    class133.field2117 = 21;
                    class319.field5005.method371(-2);
                    class319.field5005 = null;
                    return;
                }
                return;
            }
            if (class107.field1758 == 10) {
                if (class319.field5005.method370((byte) 125) < 1) {
                    return;
                }
                class157.field2572 = class319.field5005.method372(0);
                class107.field1758 = 0;
                class133.field2117 = 29;
                class319.field5005.method371(-2);
                class319.field5005 = null;
                return;
            }
            if (arg0 <= 110) {
                return;
            }
            if (class107.field1758 == 8) {
                if (class319.field5005.method370((byte) 125) < 14) {
                    return;
                }
                class319.field5005.method377(10647, 0, 14, class80.field1248.field34);
                class80.field1248.field48 = 0;
                class233.field3543 = class80.field1248.method15((byte) -122);
                class63.field929 = class80.field1248.method15((byte) -80);
                class241.field3614 = class80.field1248.method15((byte) -65) == 1;
                class173.field2768 = class80.field1248.method15((byte) -128) == 1;
                class64.field940 = class80.field1248.method15((byte) -56) == 1;
                class241.field3615 = class80.field1248.method15((byte) 112) == 1;
                class166.field2684 = class80.field1248.method15((byte) -91) == 1;
                class75.field1146 = class80.field1248.method56(19612);
                class89.field1427 = class80.field1248.method15((byte) -53) == 1;
                class179.field2854 = class80.field1248.method15((byte) 82) == 1;
                class313.method2207(class179.field2854, 27113);
                class297.method2107(class179.field2854, -114);
                if (!class67.field1020) {
                    if ((!class241.field3614 || class64.field940) && !class89.field1427) {
                        try {
                            class51.method419((byte) 57, class92.field1484.field1037, "unzap");
                        } catch (Throwable var14) {
                        }
                    } else {
                        try {
                            class51.method419((byte) 127, class92.field1484.field1037, "zap");
                        } catch (Throwable var13) {
                        }
                    }
                }
                try {
                    class51.method419((byte) -85, class92.field1484.field1037, "loggedin");
                } catch (Throwable var12) {
                }
                class60.field884 = class80.field1248.method1798((byte) 126);
                class128.field2060 = class80.field1248.method56(19612);
                class107.field1758 = 9;
            }
            if (class107.field1758 == 9) {
                if (class319.field5005.method370((byte) 126) >= class128.field2060) {
                    class80.field1248.field48 = 0;
                    class319.field5005.method377(10647, 0, class128.field2060, class80.field1248.field34);
                    class133.field2117 = 2;
                    class107.field1758 = 0;
                    class4.method85(7);
                    class211.field3316 = -1;
                    class24.method225(84, false);
                    class60.field884 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var15) {
            if (class319.field5005 != null) {
                class319.field5005.method371(-2);
                class319.field5005 = null;
            }
            if (class49.field744 < 1) {
                if (class166.field2679 == class10.field237) {
                    class166.field2679 = class247.field3681;
                } else {
                    class166.field2679 = class10.field237;
                }
                class107.field1758 = 1;
                class311.field4917 = 0;
                class49.field744++;
            } else {
                class107.field1758 = 0;
                class133.field2117 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)Z", line = 642)
    public final boolean method1784(byte arg0) {
        field3816++;
        if (arg0 != 47) {
            field3812 = 0.12999728F;
        }
        return (this.field3822 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(II)V", line = 651)
    public class257(int arg0, int arg1) {
        this.field3822 = arg0;
        this.field3807 = arg1;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)Z", line = 665)
    public final boolean method1785(byte arg0) {
        field3820++;
        if (arg0 == 58) {
            return (this.field3822 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)Z", line = 676)
    public final boolean method1786(int arg0) {
        if (arg0 < 112) {
            this.field3822 = 38;
        }
        field3811++;
        return (this.field3822 & 0x26E63CD2) >> 29 != 0;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Z", line = 687)
    public final boolean method1787(int arg0) {
        field3821++;
        if (arg0 != -32397) {
            this.field3807 = 123;
        }
        return (this.field3822 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(Z)Z", line = 708)
    public final boolean method1788(boolean arg0) {
        if (arg0) {
            field3814++;
            return (this.field3822 >> 21 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
