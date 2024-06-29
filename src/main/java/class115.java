import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class115 extends class42 {

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    private final int field2061;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    private final int field2053;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    private final int field2051;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    private final int field2058;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "Laj;")
    public static class46 field2062 = new class46(512);

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "[I")
    public static int[] field2063 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field2064 = 1;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(III)V")
    public final void method368(int arg0, int arg1, int arg2) {
        if (arg2 != -8259) {
            method915(true, 70);
        }
        ++field2055;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
    public static final void method915(boolean arg0, int arg1) {
        ++field2057;
        if (~arg1 != 0) {
            if (class128.field2237[arg1]) {
                class252.field4520.method1519(arg1, 27647);
                if (class99.field1839[arg1] != null) {
                    boolean var2 = arg0;
                    for (int var3 = 0; class99.field1839[arg1].length > var3; ++var3) {
                        if (class99.field1839[arg1][var3] != null) {
                            if (~class99.field1839[arg1][var3].field4306 == -3) {
                                var2 = false;
                            } else {
                                class99.field1839[arg1][var3] = null;
                            }
                        }
                    }
                    if (var2) {
                        class99.field1839[arg1] = null;
                    }
                    class128.field2237[arg1] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
    public static void method916(byte arg0) {
        field2063 = null;
        field2062 = null;
        if (arg0 < 85) {
            field2064 = -109;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZZ)V")
    public static final void method917(boolean arg0, boolean arg1) {
        class154.method1175(95);
        ++field2059;
        if (!arg1) {
            field2064 = 8;
        }
        if (~class57.field1057 == -31 || ~class57.field1057 == -26) {
            ++class58.field1119;
            if (class58.field1119 >= 50 || arg0) {
                class58.field1119 = 0;
                if (!class60.field1149 && class30.field556 != null) {
                    class153.field2747.method978(-128, 1);
                    try {
                        class30.field556.method1817(class153.field2747.field269, 0, -12152, class153.field2747.field318);
                        class153.field2747.field318 = 0;
                    } catch (IOException var2) {
                        class60.field1149 = true;
                    }
                    ++class192.field3401;
                }
                class154.method1175(95);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIII)V")
    public class115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2061 = arg0;
        this.field2053 = arg3;
        this.field2051 = arg2;
        this.field2058 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lka;B)V")
    public static final void method918(class245 arg0, byte arg1) {
        if (arg1 <= 97) {
            field2063 = null;
        }
        ++field2052;
        class245 var2 = class169.method1247(1000000, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class135.field2434;
            var4 = class180.field3155;
        } else {
            var3 = var2.field4307;
            var4 = var2.field4325;
        }
        class30.method281(var3, -32681, var4, arg0, false);
        class46.method397(var3, 500, arg0, var4);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lth;IIILtj;IILbf;)V")
    public static final void method919(class109 arg0, int arg1, int arg2, int arg3, class260 arg4, int arg5, int arg6, class194 arg7) {
        ++field2065;
        class66 var8 = new class66();
        var8.field1231 = arg1 * 128;
        var8.field1259 = arg5;
        var8.field1233 = arg2 * arg6;
        if (arg7 == null) {
            if (arg0 == null) {
                if (arg4 != null) {
                    var8.field1247 = arg4;
                    var8.field1257 = 128 * (arg4.method1005(0) + arg2);
                    var8.field1237 = 128 * (arg4.method1005(arg6 + -128) + arg1);
                    var8.field1255 = class60.method512(2183, arg4);
                    var8.field1258 = arg4.field4589 * 128;
                    class61.field1162.method388(-1, arg4.field4620.method1587(arg6 ^ 221), var8);
                    return;
                }
            } else {
                var8.field1252 = arg0;
                class97 var9 = arg0.field1956;
                if (var9.field1787 != null) {
                    var8.field1245 = true;
                    var9 = var9.method825((byte) -83);
                }
                if (var9 != null) {
                    var8.field1257 = (var9.field1769 + arg2) * 128;
                    var8.field1237 = (var9.field1769 + arg1) * 128;
                    var8.field1255 = class13.method138(arg0, -3217);
                    var8.field1258 = var9.field1743 * 128;
                }
                class201.field3563.method843(-5, var8);
            }
        } else {
            var8.field1255 = arg7.field3446;
            var8.field1258 = arg7.field3464 * 128;
            var8.field1242 = arg7.field3442;
            var8.field1253 = arg7.field3489;
            int var10 = arg7.field3476;
            int var11 = arg7.field3500;
            var8.field1256 = arg7;
            var8.field1249 = arg7.field3471;
            if (arg3 == 1 || ~arg3 == -4) {
                var11 = arg7.field3476;
                var10 = arg7.field3500;
            }
            var8.field1257 = (arg2 + var11) * 128;
            var8.field1237 = (arg1 - -var10) * 128;
            if (arg7.field3437 != null) {
                var8.field1245 = true;
                var8.method582(false);
            }
            if (var8.field1242 != null) {
                var8.field1251 = (int) (Math.random() * (double) (-var8.field1253 + var8.field1249)) + var8.field1253;
            }
            class230.field3972.method843(arg6 + -133, var8);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)V")
    public final void method371(int arg0, int arg1, byte arg2) {
        ++field2054;
        int var4 = this.field2061 * arg0 >> 12;
        int var5 = this.field2053 * arg1 >> 12;
        int var6 = this.field2051 * arg0 >> 12;
        int var7 = this.field2058 * arg1 >> 12;
        class117.method941(var5, var7, var6, var4, super.field768, -10);
        if (arg2 >= -34) {
            field2062 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)V")
    public final void method367(int arg0, int arg1, int arg2) {
        ++field2056;
        if (arg0 != 1) {
            this.method371(-36, -81, (byte) 40);
        }
    }
}
