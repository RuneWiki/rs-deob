import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class78 extends class327 {

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public static volatile int field1181 = 0;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class186.field2991) {
            class344.method2376(arg1, arg3, arg1 + arg4, arg0 + arg3);
            class344.method2375(arg1, arg3, arg4, arg0, 0);
        } else {
            class216.method1571(arg1, arg3, arg1 + arg4, arg3 - -arg0);
            class216.method1573(arg1, arg3, arg4, arg0, 0);
        }
        field1179++;
        if (class334.field5182 < 100) {
            return;
        }
        if (class225.field3583 == null || class225.field3583.field5040 != arg4 || class225.field3583.field5030 != arg0) {
            class298 var5 = new class298(arg4, arg0);
            class216.method1572(var5.field4659, arg4, arg0);
            class157.method1089(class240.field3815, 0, arg2 ^ 0x1C84DEE, class331.field5158, arg4, arg0, 0, 0, 0);
            if (class186.field2991) {
                class225.field3583 = new class14(var5);
            } else {
                class225.field3583 = var5;
            }
            if (class186.field2991) {
                class216.field3480 = null;
            } else {
                class289.field4563.method2054(-25);
            }
        }
        class225.field3583.method78(arg1, arg3);
        int var6 = class291.field4587 * arg4 / class240.field3815 + arg1;
        int var7 = class303.field4737 * arg0 / class331.field5158 + arg3;
        int var8 = class325.field5069 * arg4 / class240.field3815;
        int var9 = 16711680;
        int var10 = class149.field2268 * arg0 / class331.field5158;
        if (arg2 != -2) {
            method578(87);
        }
        if (class20.field290 == 1) {
            var9 = 16777215;
        }
        if (class186.field2991) {
            class344.method2378(var6, var7, var8, var10, var9, 128);
            class344.method2371(var6, var7, var8, var10, var9);
        } else {
            class216.method1584(var6, var7, var8, var10, var9, 128);
            class216.method1579(var6, var7, var8, var10, var9);
        }
        if (class198.field3246 <= 0) {
            return;
        }
        int var11;
        if (class232.field3713 <= 10) {
            var11 = class232.field3713 * 25;
        } else {
            var11 = 500 - (class232.field3713 * 25);
        }
        for (class115 var12 = (class115) class17.field229.method1807((byte) 21); var12 != null; var12 = (class115) class17.field229.method1808(18051)) {
            if (class272.field4327 == var12.field1735) {
                int var13 = var12.field1728 * arg4 / class240.field3815 + arg1;
                int var14 = var12.field1727 * arg0 / class331.field5158 + arg3;
                if (class186.field2991) {
                    class344.method2378(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                } else {
                    class216.method1584(var13 - 2, var14 + -2, 4, 4, 16776960, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lh;III)V", line = 112)
    public static final void method574(class232 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class4.field43) {
            class230 var4 = class251.field3996[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3675 != null && var4.field3675.field667.method509()) {
                arg0.method550(var4.field3675.field667, 128, 0, 0, true);
            }
        }
        if (arg3 < class4.field43) {
            class230 var5 = class251.field3996[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3675 != null && var5.field3675.field667.method509()) {
                arg0.method550(var5.field3675.field667, 0, 0, 128, true);
            }
        }
        if (arg2 < class4.field43 && arg3 < class64.field844) {
            class230 var6 = class251.field3996[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3675 != null && var6.field3675.field667.method509()) {
                arg0.method550(var6.field3675.field667, 128, 0, 128, true);
            }
        }
        if (arg2 < class4.field43 && arg3 > 0) {
            class230 var7 = class251.field3996[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3675 != null && var7.field3675.field667.method509()) {
                arg0.method550(var7.field3675.field667, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lkb;I)I", line = 161)
    public static final int method575(class39 arg0, int arg1) {
        int var2 = -71 / ((-arg1 - 6) / 33);
        int var3 = 0;
        if (arg0.method246(false, class99.field1514)) {
            var3++;
        }
        field1176++;
        if (arg0.method246(false, class92.field1423)) {
            var3++;
        }
        if (arg0.method246(false, class79.field1192)) {
            var3++;
        }
        if (arg0.method246(false, class179.field2891)) {
            var3++;
        }
        if (arg0.method246(false, class99.field1519)) {
            var3++;
        }
        if (arg0.method246(false, class200.field3280)) {
            var3++;
        }
        if (arg0.method246(false, class157.field2422)) {
            var3++;
        }
        if (arg0.method246(false, class300.field4698)) {
            var3++;
        }
        if (arg0.method246(false, class308.field4817)) {
            var3++;
        }
        if (arg0.method246(false, class342.field5331)) {
            var3++;
        }
        if (arg0.method246(false, class168.field2696)) {
            var3++;
        }
        if (arg0.method246(false, class233.field3717)) {
            var3++;
        }
        if (arg0.method246(false, class74.field991)) {
            var3++;
        }
        if (arg0.method246(false, class74.field1002)) {
            var3++;
        }
        if (arg0.method246(false, class300.field4699)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIZI)I", line = 230)
    public static final int method576(int arg0, int arg1, boolean arg2, int arg3) {
        field1177++;
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        return arg2 ? (arg3 >> 1) + (arg0 >> 5 << 7) + (arg1 >> 2 << 10) : 82;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(BI)V", line = 256)
    public static final void method577(byte arg0, int arg1) {
        class308.field4819 = new int[arg1];
        if (arg0 <= 102) {
            return;
        }
        class60.field789 = new int[arg1];
        class58.field764 = new int[arg1];
        class232.field3712 = new int[arg1];
        field1180++;
        class69.field902 = new int[arg1];
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)Lhg;", line = 279)
    public static final class184 method578(int arg0) {
        if (arg0 != 7327) {
            method578(-11);
        }
        field1175++;
        try {
            return (class184) Class.forName("jn").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(I)V", line = 296)
    public static final void method579(int arg0) {
        field1182++;
        class87.method631(5, (byte) 2);
        class243.method1717(5, 0);
        class343.method2362((byte) -120, 5);
        class251.method1775(5, (byte) 96);
        class102.method719((byte) -124, 5);
        class249.method1763(14, 5);
        class232.method1667(5, -257);
        class261.method1866((byte) 112, 5);
        class142.method987(5, false);
        class235.method1684(18389, 5);
        class330.method2278(-18, 5);
        class164.method1134(115, 5);
        int var1 = 73 % ((90 - arg0) / 34);
        class340.method2345(5, (byte) -94);
        class271.method1935(5, (byte) 83);
        class253.method1787(5, (byte) -128);
        class48.method337(5, -106);
        class248.method1757(2, 5);
        class225.method1643(-1, 50);
        class269.method1922(true, 5);
        class185.method1273((byte) -54, 5);
        class187.field3040.method1625(5, (byte) 104);
        client.field4218.method1625(5, (byte) 126);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZILim;IIIIIIIZB)V", line = 327)
    public static final void method580(boolean arg0, int arg1, class192 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, byte arg11) {
        if (arg11 > -120) {
            return;
        }
        if (arg9 >= 0 && arg9 < 104 && arg6 >= 0 && arg6 < 104) {
            if (!arg0 && !arg10) {
                class81.field1229[arg7][arg9][arg6] = 0;
            }
            while (true) {
                int var12 = arg2.method1399(-1172389784);
                if (var12 == 0) {
                    if (arg0) {
                        class84.field1282[0][arg9 + arg1][arg6 + arg4] = class94.field1450[0][arg9 + arg1][arg6 + arg4];
                    } else if (arg7 == 0) {
                        class84.field1282[0][arg1 + arg9][arg4 + arg6] = -class188.method1324(arg3 + 932731, arg8 + 556238, 13802) * 8;
                    } else {
                        class84.field1282[arg7][arg9 + arg1][arg6 + arg4] = class84.field1282[arg7 - 1][arg1 + arg9][arg6 + arg4] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg2.method1399(-1172389784);
                    if (arg0) {
                        class84.field1282[0][arg9 + arg1][arg6 + arg4] = class94.field1450[0][arg9 + arg1][arg4 + arg6] + (var13 * 8);
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg7 == 0) {
                            class84.field1282[0][arg1 + arg9][arg6 + arg4] = -var13 * 8;
                        } else {
                            class84.field1282[arg7][arg1 + arg9][arg4 + arg6] = class84.field1282[arg7 - 1][arg1 + arg9][arg4 + arg6] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 > 49) {
                    if (var12 <= 81) {
                        if (!arg0 && !arg10) {
                            class81.field1229[arg7][arg9][arg6] = (byte) (var12 - 49);
                        }
                    } else if (!arg10) {
                        class297.field4658[arg7][arg9][arg6] = (byte) (var12 - 81);
                    }
                } else if (arg10) {
                    arg2.method1399(-1172389784);
                } else {
                    class42.field587[arg7][arg9][arg6] = arg2.method1377(true);
                    class90.field1370[arg7][arg9][arg6] = (byte) ((var12 - 2) / 4);
                    class231.field3702[arg7][arg9][arg6] = (byte) class200.method1465(3, var12 + arg5 - 2);
                }
            }
        } else {
            while (true) {
                int var14 = arg2.method1399(-1172389784);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg2.method1399(-1172389784);
                    break;
                }
                if (var14 <= 49) {
                    arg2.method1399(-1172389784);
                }
            }
        }
        field1178++;
    }
}
