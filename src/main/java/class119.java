import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class119 {

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lbg;")
    public static class177 field2107 = new class177(64);

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Lng;")
    public static class139 field2108 = new class139(64);

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Llc;")
    private static class143 field2111 = class66.method374("Loading config )2 ", -1);

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Llc;")
    public static class143 field2110 = field2111;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
    public static int method729(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIII)V")
    public static final void method730(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 >= class31.field481 && arg4 <= class9.field173 && arg1 >= class188.field3398 && arg3 <= class239.field4321) {
            if (arg6 == 1) {
                class207.method1442(arg1, arg2, (byte) -127, arg3, arg0, arg4);
            } else {
                class282.method1852(-22212, arg3, arg6, arg4, arg0, arg2, arg1);
            }
        } else if (arg6 == 1) {
            class194.method1335(arg3, arg1, arg0, arg4, 0, arg2);
        } else {
            class123.method746(arg1, arg4, arg2, arg6, arg0, arg3, -5);
        }
        if (arg5 < 91) {
            field2108 = null;
        }
        field2104++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lwb;Lwb;IIZIZ)I")
    public static final int method731(class133 arg0, class133 arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var7 = class33.method222(arg1, (byte) 15, arg0, arg2, arg6);
        field2105++;
        if (arg5 != 255) {
            return -102;
        } else if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class33.method222(arg1, (byte) 15, arg0, arg3, arg4);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)I")
    public static final int method732(int arg0, int arg1) {
        field2106++;
        if (arg0 <= arg1 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method733(int arg0) {
        field2107 = null;
        field2110 = null;
        if (arg0 != 64) {
            field2111 = null;
        }
        field2108 = null;
        field2111 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIB)V")
    public static final void method734(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        for (class124 var5 = (class124) class57.field1103.method1294(false); var5 != null; var5 = (class124) class57.field1103.method1292((byte) 40)) {
            class26.method180(arg3, var5, 81, arg2, arg0, arg1);
        }
        field2112++;
        for (class124 var6 = (class124) class285.field5001.method1294(false); var6 != null; var6 = (class124) class285.field5001.method1292((byte) 100)) {
            byte var10 = 1;
            if (var6.field2164.field4137 == var6.field2164.field4133) {
                var10 = 0;
            } else if (var6.field2164.field4171 == var6.field2164.field4133) {
                var10 = 2;
            }
            if (var6.field2165 != var10) {
                int var11 = class145.method921(-1, var6.field2164);
                if (var6.field2175 != var11) {
                    if (var6.field2171 != null) {
                        class86.field1578.method1000(var6.field2171);
                        var6.field2171 = null;
                    }
                    var6.field2175 = var11;
                }
                var6.field2165 = var10;
            }
            var6.field2180 = var6.field2164.field4178;
            var6.field2169 = var6.field2164.field4178 + (var6.field2164.method218((byte) -123) * 64);
            var6.field2162 = var6.field2164.field4108;
            var6.field2163 = var6.field2164.field4108 + var6.field2164.method218((byte) 77) * 64;
            class26.method180(arg3, var6, 70, arg2, arg0, arg1);
        }
        if (arg4 != -52) {
            method730(-1, -23, -16, -13, 76, 42, 90);
        }
        for (class124 var7 = (class124) class254.field4565.method1818(false); var7 != null; var7 = (class124) class254.field4565.method1834((byte) -119)) {
            byte var8 = 1;
            if (var7.field2181.field4137 == var7.field2181.field4133) {
                var8 = 0;
            } else if (var7.field2181.field4171 == var7.field2181.field4133) {
                var8 = 2;
            }
            if (var7.field2165 != var8) {
                int var9 = class272.method1799(var7.field2181, arg4 + 29927);
                if (var7.field2175 != var9) {
                    if (var7.field2171 != null) {
                        class86.field1578.method1000(var7.field2171);
                        var7.field2171 = null;
                    }
                    var7.field2175 = var9;
                }
                var7.field2165 = var8;
            }
            var7.field2180 = var7.field2181.field4178;
            var7.field2169 = var7.field2181.field4178 + (var7.field2181.method218((byte) -128) * 64);
            var7.field2162 = var7.field2181.field4108;
            var7.field2163 = var7.field2181.field4108 + var7.field2181.method218((byte) -34) * 64;
            class26.method180(arg3, var7, 94, arg2, arg0, arg1);
        }
    }
}
