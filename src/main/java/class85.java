import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class85 extends class206 {

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public int field1399 = -1;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public int field1408 = 0;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field1392 = 0;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field1403 = 2;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "[I")
    public static int[] field1404;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "[[[Ltf;")
    public static class242[][][] field1409;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V", line = 16)
    public static final void method688(int arg0) {
        field1393++;
        class310 var1 = class263.field4546;
        synchronized (class263.field4546) {
            class61.field1066 = class34.field494;
            class66.field1135 = class29.field416;
            class203.field3439++;
            class26.field351 = class126.field2184;
            class87.field1435 = class120.field2017;
            class39.field595 = class78.field1332;
            class271.field4685 = class20.field271;
            class173.field2931 = class178.field3012;
            class120.field2017 = arg0;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII)V", line = 55)
    public static final void method689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1394++;
        if (arg4 >= 1 && arg7 >= 1 && arg4 <= 102 && arg7 <= 102) {
            if (!class300.method2067(-12461) && (class204.field3459[0][arg4][arg7] & 0x2) == 0) {
                int var8 = arg3;
                if ((class204.field3459[arg3][arg4][arg7] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class76.field1319 != var8) {
                    return;
                }
            }
            int var9 = arg3;
            if (arg3 < 3 && (class204.field3459[1][arg4][arg7] & 0x2) == 2) {
                var9 = arg3 + 1;
            }
            class244.method1769(arg7, arg4, arg0, arg3, class286.field4931[arg3], -40, var9);
            if (arg5 >= 0) {
                boolean var10 = class161.field2727;
                class161.field2727 = true;
                class247.method1786(var9, arg4, false, arg7, class286.field4931[arg3], arg3, arg5, arg1, false, false, arg6);
                class161.field2727 = var10;
            }
        }
        if (arg2 > -93) {
            method692((class60) null, (byte) -1);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 108)
    public static void method690(byte arg0) {
        field1404 = null;
        if (arg0 != -106) {
            field1404 = (int[]) null;
        }
        field1409 = (class242[][][]) null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(III)Z", line = 137)
    public static final boolean method691(int arg0, int arg1, int arg2) {
        field1397++;
        if (arg1 != -1) {
            method691(-84, 94, 50);
        }
        return (arg2 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lja;B)V", line = 151)
    public static final void method692(class60 arg0, byte arg1) {
        field1407++;
        if (arg0.field997.length - arg0.field1012 < 1) {
            return;
        }
        int var2 = arg0.method501(0);
        if (var2 < 0 || var2 > 3) {
            return;
        }
        byte var3;
        if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field997.length - arg0.field1012) < var3) {
            return;
        }
        class253.field4256 = arg0.method501(0);
        if (class253.field4256 < 1) {
            class253.field4256 = 1;
        } else if (class253.field4256 > 4) {
            class253.field4256 = 4;
        }
        class182.method1344(arg0.method501(0) == 1, (byte) 54);
        class74.field1239 = arg0.method501(0) == 1;
        class161.field2727 = arg0.method501(0) == 1;
        class273.field4709 = arg0.method501(0) == 1;
        class246.field4140 = arg0.method501(0) == 1;
        class125.field2088 = arg0.method501(0) == 1;
        class75.field1293 = arg0.method501(0) == 1;
        class75.field1286 = arg0.method501(0) == 1;
        class157.field2692 = arg0.method501(0);
        if (class157.field2692 > 2) {
            class157.field2692 = 2;
        }
        if (var2 < 2) {
            class116.field1970 = arg0.method501(0) == 1;
            arg0.method501(0);
        } else {
            class116.field1970 = arg0.method501(0) == 1;
        }
        class167.field2816 = arg0.method501(0) == 1;
        class69.field1193 = arg0.method501(0) == 1;
        class274.field4727 = arg0.method501(0);
        if (class274.field4727 > 2) {
            class274.field4727 = 2;
        }
        if (arg1 <= 47) {
            field1403 = -47;
        }
        class151.field2599 = arg0.method501(0) == 1;
        class17.field221 = arg0.method501(0);
        if (class17.field221 > 127) {
            class17.field221 = 127;
        }
        class164.field2783 = arg0.method501(0);
        class285.field4909 = arg0.method501(0);
        if (class285.field4909 > 127) {
            class285.field4909 = 127;
        }
        if (var2 >= 1) {
            class285.field4901 = arg0.method485((byte) -2);
            class177.field2985 = arg0.method485((byte) -2);
        }
        if (var2 >= 3) {
            class279.field4838 = arg0.method501(0) == 1;
        }
    }
}
