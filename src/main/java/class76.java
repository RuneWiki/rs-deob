import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class76 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field1319 = 0;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLwc;IIILeb;Lbl;)V", line = 11)
    public static final void method664(int arg0, boolean arg1, class96 arg2, int arg3, int arg4, int arg5, class108 arg6, class295 arg7) {
        field1323++;
        class290 var8 = new class290();
        if (arg1) {
            return;
        }
        var8.field4968 = arg3 * 128;
        var8.field4980 = arg0;
        var8.field4974 = arg5 * 128;
        if (arg6 != null) {
            var8.field4971 = arg6.field1828;
            var8.field4965 = arg6.field1857;
            var8.field4977 = arg6.field1815 * 128;
            int var10 = arg6.field1856;
            var8.field4961 = arg6.field1859;
            var8.field4960 = arg6.field1801;
            var8.field4967 = arg6;
            int var11 = arg6.field1837;
            if (arg4 == 1 || arg4 == 3) {
                var10 = arg6.field1837;
                var11 = arg6.field1856;
            }
            var8.field4972 = (arg3 + var10) * 128;
            var8.field4979 = (arg5 + var11) * 128;
            if (arg6.field1812 != null) {
                var8.field4963 = true;
                var8.method2025(18792);
            }
            if (var8.field4971 != null) {
                var8.field4966 = (int) ((double) (var8.field4960 - var8.field4965) * Math.random()) + var8.field4965;
            }
            class54.field890.method1251(var8, -116);
        } else if (arg7 != null) {
            var8.field4962 = arg7;
            class229 var9 = arg7.field5070;
            if (var9.field3868 != null) {
                var8.field4963 = true;
                var9 = var9.method1673(false);
            }
            if (var9 != null) {
                var8.field4979 = (var9.field3854 + arg5) * 128;
                var8.field4972 = (var9.field3854 + arg3) * 128;
                var8.field4961 = class213.method1570(arg7, (byte) -118);
                var8.field4977 = var9.field3841 * 128;
            }
            class166.field2794.method1251(var8, -117);
        } else if (arg2 != null) {
            var8.field4970 = arg2;
            var8.field4972 = (arg2.method739(0) + arg3) * 128;
            var8.field4979 = (arg5 + arg2.method739(0)) * 128;
            var8.field4961 = class133.method1034((byte) 104, arg2);
            var8.field4977 = arg2.field1582 * 128;
            class2.field18.method1004((byte) 73, arg2.field1561.method630(-76), var8);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZII)V", line = 98)
    public static final void method665(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1322++;
        if (class51.method375(arg4, -116)) {
            if (arg3 != 37) {
                method666((class229) null, 21, -36, 20, -31);
            }
            class171.method1266(-1, arg2, arg1, 0, class249.field4198[arg4], arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lfe;IIII)V", line = 133)
    public static final void method666(class229 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1324++;
        if (class126.field2188 >= 400) {
            return;
        }
        if (arg0.field3868 != null) {
            arg0 = arg0.method1673(false);
        }
        if (arg0 == null || !arg0.field3887) {
            return;
        }
        if (arg2 != 37) {
            field1321 = 96;
        }
        class75 var5 = arg0.field3859;
        if (arg0.field3876 != 0) {
            var5 = class66.method562((byte) -49, new class75[] { var5, class282.method2000(0, arg0.field3876, class279.field4831.field1576), class13.field180, class120.field2018, class67.method565(42, arg0.field3876), class130.field2249 });
        }
        if (class13.field176 == 1) {
            class196.field3293++;
            class232.method1694(-501, class244.field4110, (short) 41, arg4, class66.method562((byte) 113, new class75[] { class237.field3994, class161.field2742, var5 }), arg3, (long) arg1);
        } else if (!class161.field2738) {
            class97.field1587++;
            class75[] var6 = arg0.field3870;
            if (class78.field1344) {
                var6 = class54.method395(var6, true);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class230.field3907 != 0 || !var6[var7].method614(class116.field1962, -66))) {
                        class200.field3379++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 44;
                        }
                        if (var7 == 1) {
                            var8 = 48;
                        }
                        if (var7 == 2) {
                            var8 = 39;
                        }
                        if (var7 == 3) {
                            var8 = 37;
                        }
                        if (var7 == 4) {
                            var8 = 25;
                        }
                        class232.method1694(-501, var6[var7], var8, arg4, class66.method562((byte) 116, new class75[] { class6.field80, var5 }), arg3, (long) arg1);
                    }
                }
            }
            if (class230.field3907 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method614(class116.field1962, -66)) {
                        short var10 = 0;
                        short var11 = 0;
                        if (class279.field4831.field1576 < arg0.field3876) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = 44;
                        }
                        class229.field3861++;
                        if (var9 == 1) {
                            var10 = 48;
                        }
                        if (var9 == 2) {
                            var10 = 39;
                        }
                        if (var9 == 3) {
                            var10 = 37;
                        }
                        if (var9 == 4) {
                            var10 = 25;
                        }
                        if (var10 != 0) {
                            var10 += var11;
                        }
                        class232.method1694(-501, var6[var9], var10, arg4, class66.method562((byte) 125, new class75[] { class6.field80, var5 }), arg3, (long) arg1);
                    }
                }
            }
            class232.method1694(arg2 - 538, class245.field4122, (short) 1001, arg4, class66.method562((byte) 117, new class75[] { class6.field80, var5 }), arg3, (long) arg1);
        } else if ((class123.field2056 & 0x2) == 2) {
            class161.field2739++;
            class232.method1694(-501, class197.field3307, (short) 45, arg4, class66.method562((byte) 123, new class75[] { class215.field3673, class161.field2742, var5 }), arg3, (long) arg1);
        }
    }
}
