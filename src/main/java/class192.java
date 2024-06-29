import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class192 extends class279 {

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "Z")
    public volatile boolean field3055 = true;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "Z")
    public boolean field3056;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "Z")
    public boolean field3063;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lug;II)Z", line = 5)
    public static final boolean method1415(class253 arg0, int arg1, int arg2) {
        field3057++;
        if (arg2 != 17082) {
            return false;
        }
        byte[] var3 = arg0.method1834(-128, arg1);
        if (var3 == null) {
            return false;
        } else {
            class139.method1036(63, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lug;Lug;IIB)Ldk;", line = 29)
    public static final class226 method1416(class253 arg0, class253 arg1, int arg2, int arg3, byte arg4) {
        int var5 = 113 % ((arg4 - 48) / 59);
        field3058++;
        return class287.method2029(arg1, arg3, 2, arg2) ? class169.method1263(-31445, arg0.method1813(arg3, arg2, true)) : null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBIIII)V", line = 45)
    public static final void method1417(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3062++;
        if (arg1 >= -81) {
            return;
        }
        int var6 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg3);
        int var7 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg2);
        int var8 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg5);
        int var9 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg0);
        for (int var10 = var6; var10 <= var7; var10++) {
            class256.method1853(class284.field4402[var10], var8, arg4, var9, 0);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lgn;ZI)V", line = 74)
    public static final void method1418(class321 arg0, boolean arg1, int arg2) {
        if (class109.field1458 || arg1) {
            int var3 = class95.field1258;
            int var4 = var3 * 956 / 503;
            class344.field5342.method1262((class127.field1841 - var4) / 2, 0, var4, var3);
            class327.field5128.method198(class127.field1841 / 2 - (class327.field5128.field297 / 2), 18);
        }
        arg0.method2258(class303.field4714, class127.field1841 / 2, class95.field1258 / 2 - 26, 16777215, -1);
        field3059++;
        int var5 = class95.field1258 / 2 - 18;
        if (class109.field1458) {
            class122.method888(class127.field1841 / 2 - 152, var5, 304, 34, 9179409);
            class122.method888(class127.field1841 / 2 - 151, var5 + 1, 302, 32, 0);
            class122.method897(class127.field1841 / 2 - 150, var5 - -2, class311.field4871 * 3, 30, 9179409);
            class122.method897(class127.field1841 / 2 + class311.field4871 * 3 - 150, var5 - -2, 300 - (class311.field4871 * 3), 30, 0);
        } else {
            class280.method1979(class127.field1841 / 2 - 152, var5, 304, 34, 9179409);
            class280.method1979(class127.field1841 / 2 - 151, var5 + 1, 302, 32, 0);
            class280.method1971(class127.field1841 / 2 - 150, var5 - -2, class311.field4871 * 3, 30, 9179409);
            class280.method1971(class311.field4871 * 3 + (class127.field1841 / 2 - 150), var5 + 2, 300 - class311.field4871 * 3, 30, 0);
        }
        arg0.method2258(class83.field1134, class127.field1841 / 2, class95.field1258 / 2 + 4, 16777215, -1);
        if (arg2 != -9742) {
            method1422(25, 'G');
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIILmn;)V", line = 117)
    public static final void method1419(int arg0, int arg1, int arg2, int arg3, class161 arg4) {
        field3052++;
        if (class78.field1046 >= 400) {
            return;
        }
        if (arg4.field2585 != null) {
            arg4 = arg4.method1192(-1);
        }
        if (arg4 == null || arg1 != 30 || !arg4.field2584) {
            return;
        }
        String var5 = arg4.field2560;
        if (arg4.field2564 != 0) {
            String var6 = class27.field409 == 1 ? class59.field853 : class1.field1;
            var5 = var5 + class125.method912(true, class146.field2310.field5259, arg4.field2564) + " (" + var6 + arg4.field2564 + ")";
        }
        if (class244.field3811 == 1) {
            class342.method2368(class78.field1054 + " -> <col=ffff00>" + var5, class24.field366, arg0, (byte) -68, class3.field32, (short) 57, (long) arg3, arg2);
            class248.field3907++;
        } else if (class56.field783) {
            class58 var7 = class171.field2825 == -1 ? null : class246.method1769(class171.field2825, (byte) -115);
            if ((class301.field4631 & 0x2) != 0 && (var7 == null || arg4.method1193(97, var7.field826, class171.field2825) != var7.field826)) {
                class120.field1666++;
                class342.method2368(class249.field3931 + " -> <col=ffff00>" + var5, class133.field1957, arg0, (byte) -68, class33.field488, (short) 48, (long) arg3, arg2);
            }
        } else {
            class95.field1261++;
            String[] var8 = arg4.field2547;
            if (class150.field2345) {
                var8 = class251.method1798(false, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class27.field409 != 0 || !var8[var9].equalsIgnoreCase(class48.field628))) {
                        class158.field2453++;
                        byte var10 = 0;
                        if (var9 == 0) {
                            var10 = 2;
                        }
                        int var11 = -1;
                        if (arg4.field2580 == var9) {
                            var11 = arg4.field2588;
                        }
                        if (var9 == 1) {
                            var10 = 37;
                        }
                        if (var9 == 2) {
                            var10 = 11;
                        }
                        if (arg4.field2570 == var9) {
                            var11 = arg4.field2565;
                        }
                        if (var9 == 3) {
                            var10 = 40;
                        }
                        if (var9 == 4) {
                            var10 = 30;
                        }
                        class342.method2368("<col=ffff00>" + var5, var8[var9], arg0, (byte) -68, var11, var10, (long) arg3, arg2);
                    }
                }
            }
            if (class27.field409 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class48.field628)) {
                        short var13 = 0;
                        if (var12 == 0) {
                            var13 = 2;
                        }
                        if (var12 == 1) {
                            var13 = 37;
                        }
                        if (var12 == 2) {
                            var13 = 11;
                        }
                        short var14 = 0;
                        class113.field1565++;
                        if (arg4.field2564 > class146.field2310.field5259) {
                            var14 = 2000;
                        }
                        if (var12 == 3) {
                            var13 = 40;
                        }
                        if (var12 == 4) {
                            var13 = 30;
                        }
                        if (var13 != 0) {
                            var13 += var14;
                        }
                        class342.method2368("<col=ffff00>" + var5, var8[var12], arg0, (byte) -68, arg4.field2610, var13, (long) arg3, arg2);
                    }
                }
            }
            class342.method2368("<col=ffff00>" + var5, class328.field5145, arg0, (byte) -68, class123.field1767, (short) 1005, (long) arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 277)
    public static final int method1420(String arg0, int arg1) {
        field3053++;
        return arg1 == 10 ? class63.method510(arg0, true, 10, 2) : 41;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Ljava/lang/String;I)I", line = 288)
    public static final int method1421(String arg0, int arg1) {
        field3060++;
        if (arg1 != 1068628072) {
            return -73;
        }
        int var2 = 0;
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            var2 = class58.method473(arg1 - 1068609008, arg0.charAt(var4)) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IC)C", line = 311)
    public static final char method1422(int arg0, char arg1) {
        field3061++;
        return (char) arg0 == arg1 || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)I", line = 326)
    public static final int method1423(int arg0, byte arg1) {
        if (arg1 == -36) {
            field3054++;
            return arg0 >>> 8;
        } else {
            return 51;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)I")
    public abstract int method598(byte arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method603(boolean arg0);
}
