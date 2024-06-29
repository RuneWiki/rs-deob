import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class144 {

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "[B")
    public static byte[] field2045 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Z")
    public static boolean field2044;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "[I")
    public static int[] field2043;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZII)V")
    public static final void method983(boolean arg0, int arg1, int arg2) {
        field2046++;
        if (arg1 == 0) {
            class138.field1976 = class63.method522(arg1, class21.field261, class492.field6913, class378.field5618, class337.field5038.field3930 * 2, true);
        } else {
            if (arg0) {
                class138.field1976 = class63.method522(0, class21.field261, class492.field6913, class378.field5618, 0, true);
                class138.field1976.method589(0);
                class1 var3 = class361.method2221(class388.field5716, 98, 0, class297.field4451);
                class229 var4 = class138.field1976.method539(var3, class368.method2274(class425.field6075, class297.field4451, 0), true);
                class416.method2477(class226.field3314.method2036(class4.field85, (byte) -21), 73, var4, true);
                class138.field1976.method591();
                class188.method1300(true);
                class138.field1976.method507((byte) -108);
            }
            try {
                class138.field1976 = class63.method522(arg1, class21.field261, class492.field6913, class378.field5618, class337.field5038.field3930 * 2, true);
            } catch (Throwable var7) {
                arg1 = 0;
                class138.field1976 = class63.method522(0, class21.field261, class492.field6913, class378.field5618, 0, true);
            }
        }
        if (class138.field1976.method523()) {
            class381 var5 = class138.field1976.method505(157286400);
            class138.field1976.method561(var5);
        }
        class170.field2424 = arg1;
        class453.method2697((byte) -40);
        if (!class138.field1976.method576()) {
            class83.field1175 = 1;
        }
        class138.field1976.method553(class83.field1175);
        class138.field1976.method564(0);
        class227.field3321 = class138.field1976.method580();
        class263.field3908 = class138.field1976.method580();
        int var6 = (int) ((double) class379.field5642 * 34.46D);
        if (class138.field1976.method496()) {
            var6 += 128;
        }
        class138.field1976.method577(50, var6);
        if (arg2 > -73) {
            method988(-99, -40, 88, -87, -89);
        }
        class138.field1976.method527(!class337.field5038.field3939);
        if (class138.field1976.method528()) {
            class212.method1431(-119, class337.field5038.field3922);
        }
        class424.method2499(class379.field5642 >> 3, class138.field1976, class456.field6477 >> 3, 1);
        class414.method2471(0);
        class332.field4975 = false;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static void method984(int arg0) {
        field2043 = null;
        field2045 = null;
        if (arg0 != 1) {
            field2045 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZILje;I)V")
    public static final void method985(int arg0, boolean arg1, int arg2, class178 arg3, int arg4) {
        field2042++;
        int var5 = arg3.field2595;
        int var6 = arg3.field2589;
        if (arg3.field2614 == 0) {
            arg3.field2595 = arg3.field2641;
        } else if (arg3.field2614 == 1) {
            arg3.field2595 = arg4 - arg3.field2641;
        } else if (arg3.field2614 == 2) {
            arg3.field2595 = arg3.field2641 * arg4 >> 14;
        }
        if (arg0 != 1) {
            method988(-122, 43, 4, 48, 124);
        }
        if (arg3.field2543 == 0) {
            arg3.field2589 = arg3.field2603;
        } else if (arg3.field2543 == 1) {
            arg3.field2589 = arg2 - arg3.field2603;
        } else if (arg3.field2543 == 2) {
            arg3.field2589 = arg3.field2603 * arg2 >> 14;
        }
        if (arg3.field2614 == 4) {
            arg3.field2595 = arg3.field2589 * arg3.field2528 / arg3.field2606;
        }
        if (arg3.field2543 == 4) {
            arg3.field2589 = arg3.field2606 * arg3.field2595 / arg3.field2528;
        }
        if (class365.field5528 && (client.method2777(arg3).field2506 != 0 || arg3.field2655 == 0)) {
            if (arg3.field2589 < 5 && arg3.field2595 < 5) {
                arg3.field2595 = 5;
                arg3.field2589 = 5;
            } else {
                if (arg3.field2589 <= 0) {
                    arg3.field2589 = 5;
                }
                if (arg3.field2595 <= 0) {
                    arg3.field2595 = 5;
                }
            }
        }
        if (class124.field1701 == arg3.field2577) {
            class478.field6708 = arg3;
        }
        if (arg1 && arg3.field2532 != null && arg3.field2595 != var5 || arg3.field2589 != var6) {
            class415 var7 = new class415();
            var7.field5990 = arg3;
            var7.field5989 = arg3.field2532;
            class352.field5362.method2453((byte) -104, var7);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class157.field2193[arg0][var8][var14] == -class382.field5657) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class426.field6091) + 1;
            int var10 = (arg3 << class426.field6091) + 2;
            int var11 = class479.field6745[arg0].method199(arg1, arg3) + arg5;
            if (!class92.method710(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class426.field6091) - 1;
            if (!class92.method710(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class426.field6091) - 1;
            if (!class92.method710(var9, var11, var13)) {
                return false;
            } else if (class92.method710(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class247.method1583(arg0, arg1, arg3)) {
            int var6 = arg1 << class426.field6091;
            int var7 = arg3 << class426.field6091;
            return class92.method710(var6 + 1, class479.field6745[arg0].method199(arg1, arg3) + arg5, var7 + 1) && class92.method710(class75.field1055 + var6 - 1, class479.field6745[arg0].method199(arg1 + 1, arg3) + arg5, var7 + 1) && class92.method710(class75.field1055 + var6 - 1, class479.field6745[arg0].method199(arg1 + 1, arg3 + 1) + arg5, class75.field1055 + var7 - 1) && class92.method710(var6 + 1, class479.field6745[arg0].method199(arg1, arg3 + 1) + arg5, class75.field1055 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)V")
    public static final void method987(byte arg0, int arg1) {
        field2041++;
        if (class316.field4752 == arg1 || arg0 != 29) {
            return;
        }
        if (class316.field4752 == 0) {
            class187.method1290(arg0 ^ 0x63);
        }
        if (arg1 == 40) {
            class286.method1828(-3);
        }
        if (arg1 != 40 && class82.field1161 != null) {
            class82.field1161.method998((byte) -13);
            class82.field1161 = null;
        }
        if (class316.field4752 == 25 || class316.field4752 == 28) {
            class73.field983.field6378 = 2;
            class33.field428.field6378 = 2;
            class251.field3621.field6378 = 2;
            class466.field6566.field6378 = 2;
            class451.field6409.field6378 = 2;
            class130.field1819.field6378 = 2;
            class285.field4350.field6378 = 2;
        }
        if (arg1 == 25 || arg1 == 28) {
            class336.field5035 = 0;
            class488.field6845 = 1;
            class363.field5510 = 0;
            class163.field2264 = 1;
            class310.field4685 = 0;
            class281.method1806(true, (byte) -107);
            class73.field983.field6378 = 1;
            class33.field428.field6378 = 1;
            class251.field3621.field6378 = 1;
            class466.field6566.field6378 = 1;
            class451.field6409.field6378 = 1;
            class130.field1819.field6378 = 1;
            class285.field4350.field6378 = 1;
        }
        if (arg1 == 25 || arg1 == 10) {
            class340.method2086((byte) 109);
        }
        if (arg1 == 5) {
            class338.method2069(class425.field6075, class138.field1976, 31784);
        } else {
            class120.method849((byte) 89);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        boolean var3 = class316.field4752 == 5 || class316.field4752 == 10 || class316.field4752 == 28;
        if (var2 != var3) {
            if (var2) {
                class487.field6840 = class279.field4230;
                if (class337.field5038.field3946 == 0) {
                    class431.method2524(2, (byte) -27);
                } else {
                    class398.method2381(class337.field5038.field3946, (byte) 125, 2, class43.field598, false, 0, class279.field4230);
                }
                class154.field2154.method739(false, -2);
            } else {
                class431.method2524(2, (byte) -27);
                class154.field2154.method739(true, arg0 ^ 0xFFFFFFE3);
            }
        }
        if (arg1 == 25 || arg1 == 28 || arg1 == 40) {
            class138.field1976.method490();
        }
        class316.field4752 = arg1;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIII)V")
    public static final void method988(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class230.field3390.field6315 = 0;
        field2048++;
        class230.field3390.method2619((byte) 66, class109.field1542.field2407);
        class230.field3390.method2619((byte) -128, arg3);
        class230.field3390.method2619((byte) -125, arg1);
        class230.field3390.method2592(arg2, (byte) -123);
        class230.field3390.method2592(arg4, (byte) -105);
        class6.field95 = 0;
        class78.field1095 = 1;
        class309.field4619 = -3;
        class412.field5947 = 0;
        if (arg0 != -30571) {
            method987((byte) -31, 113);
        }
    }
}
