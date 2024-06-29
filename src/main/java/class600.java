import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class600 {

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lgga;")
    public static class462 field8091 = new class462();

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "[Ljq;")
    public static class348[] field8095 = new class348[14];

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Lhca;")
    public static class365 field8094 = new class365();

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLwk;)V")
    public static final void method3264(boolean arg0, class227 arg1) {
        field8089++;
        boolean var2 = false;
        if (class424.field5503 == arg1.field3000 || arg1.field3021 == -1 || arg1.field2939 != 0) {
            var2 = true;
        } else {
            class348 var3 = class552.field7163.method3031(-96, arg1.field3021);
            if (var3.field4459 || (arg1.field2943 + 1) > var3.field4453[arg1.field3015]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field3000 - arg1.field2973;
            int var5 = class424.field5503 - arg1.field2973;
            int var6 = arg1.field3024 * 512 + (arg1.method1265(105) * 256);
            int var7 = arg1.field2964 * 512 + (arg1.method1265(72) * 256);
            int var8 = arg1.field3013 * 512 + arg1.method1265(126) * 256;
            int var9 = arg1.field2959 * 512 + (arg1.method1265(62) * 256);
            arg1.field503 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field506 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg1.field3036 = 0;
        if (arg1.field2953 == 0) {
            arg1.method1422(8192, -120, false);
        }
        if (arg1.field2953 == 1) {
            arg1.method1422(12288, -89, false);
        }
        if (!arg0) {
            method3264(false, null);
        }
        if (arg1.field2953 == 2) {
            arg1.method1422(0, -16, false);
        }
        if (arg1.field2953 == 3) {
            arg1.method1422(4096, -68, false);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method3265(int arg0) {
        field8095 = null;
        field8094 = null;
        field8091 = null;
        if (arg0 >= -23) {
            method3267(104, -125, -64, 3, 54);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
    public static final void method3266(int arg0, int arg1) {
        class556.field7274 = arg1;
        class693.field9478 = -1;
        class82.field1112 = arg0;
        field8090++;
        class109.method840((byte) -62);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
    public static final void method3267(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8088++;
        for (class118 var5 = (class118) class434.field5598.method2090(true); var5 != null; var5 = (class118) class434.field5598.method2088(-152)) {
            class534.method2844(arg1, arg2, var5, (byte) -118, arg0, arg4);
        }
        for (class118 var6 = (class118) class253.field3444.method2090(true); var6 != null; var6 = (class118) class253.field3444.method2088(-152)) {
            byte var11 = 1;
            class501 var12 = var6.field1518.method1435((byte) 126);
            if (var6.field1518.field2976) {
                var11 = 0;
            } else if (var6.field1518.field3025 == var12.field6570 || var6.field1518.field3025 == var12.field6574 || var6.field1518.field3025 == var12.field6587 || var6.field1518.field3025 == var12.field6608) {
                var11 = 2;
            } else if (var6.field1518.field3025 == var12.field6610 || var6.field1518.field3025 == var12.field6572 || var6.field1518.field3025 == var12.field6612 || var6.field1518.field3025 == var12.field6597) {
                var11 = 3;
            }
            if (var6.field1531 != var11) {
                int var13 = class88.method671(var6.field1518, -69);
                class699 var14 = var6.field1518.field6914;
                if (var14.field9714 != null) {
                    var14 = var14.method3823(class397.field5054, -32574);
                }
                if (var14 == null || var13 == -1) {
                    var6.field1513 = false;
                    var6.field1525 = -1;
                } else if (var6.field1525 != var13 || var6.field1513 != var14.field9725) {
                    if (var6.field1530 != null) {
                        class690.field9426.method2236(var6.field1530);
                        var6.field1530 = null;
                    }
                    var6.field1513 = var14.field9725;
                    var6.field1525 = var13;
                    var6.field1534 = null;
                    var6.field1515 = null;
                }
                var6.field1531 = var11;
            }
            var6.field1524 = var6.field1518.field506;
            var6.field1517 = var6.field1518.field506 + (var6.field1518.method1265(79) << 8);
            var6.field1516 = var6.field1518.field503;
            var6.field1529 = var6.field1518.field503 + (var6.field1518.method1265(97) << 8);
            class534.method2844(arg1, arg2, var6, (byte) -128, arg0, arg4);
        }
        class118 var7 = (class118) class145.field1891.method42((byte) 105);
        if (arg3 < 84) {
            return;
        }
        while (var7 != null) {
            byte var8 = 1;
            class501 var9 = var7.field1512.method1435((byte) 118);
            if (var7.field1512.field2976) {
                var8 = 0;
            } else if (var7.field1512.field3025 == var9.field6570 || var7.field1512.field3025 == var9.field6574 || var7.field1512.field3025 == var9.field6587 || var7.field1512.field3025 == var9.field6608) {
                var8 = 2;
            } else if (var7.field1512.field3025 == var9.field6610 || var7.field1512.field3025 == var9.field6572 || var7.field1512.field3025 == var9.field6612 || var7.field1512.field3025 == var9.field6597) {
                var8 = 3;
            }
            if (var7.field1531 != var8) {
                int var10 = class542.method2876(-1, var7.field1512);
                if (var7.field1525 != var10 || var7.field1513 != var7.field1512.field2516) {
                    if (var7.field1530 != null) {
                        class690.field9426.method2236(var7.field1530);
                        var7.field1530 = null;
                    }
                    var7.field1534 = null;
                    var7.field1525 = var10;
                    var7.field1515 = null;
                    var7.field1513 = var7.field1512.field2516;
                }
                var7.field1531 = var8;
            }
            var7.field1524 = var7.field1512.field506;
            var7.field1517 = var7.field1512.field506 + (var7.field1512.method1265(112) << 8);
            var7.field1516 = var7.field1512.field503;
            var7.field1529 = var7.field1512.field503 + (var7.field1512.method1265(114) << 8);
            class534.method2844(arg1, arg2, var7, (byte) -119, arg0, arg4);
            var7 = (class118) class145.field1891.method40(false);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Ltc;")
    public static final class477 method3268(int arg0, int arg1) {
        field8093++;
        int var2 = -47 % ((arg0 - 71) / 37);
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class322.field4179[var3] == null || class322.field4179[var3][var4] == null) {
            boolean var5 = class152.method1106(36, var3);
            if (!var5) {
                return null;
            }
        }
        return class322.field4179[var3][var4];
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)I")
    public static final int method3269(boolean arg0) {
        field8092++;
        if (arg0) {
            field8095 = null;
        }
        return class693.field9483;
    }
}
