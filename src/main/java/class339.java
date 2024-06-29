import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class339 extends class276 {

    @OriginalMember(owner = "client!wu", name = "B", descriptor = "Lsu;")
    public class192 field4925 = new class192();

    @OriginalMember(owner = "client!wu", name = "C", descriptor = "Lfk;")
    public class598 field4926 = new class598();

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "Lso;")
    private class432 field4918;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4919;

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4923;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!wu", name = "D", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BIII[ILgi;)V")
    private final void method2031(byte arg0, int arg1, int arg2, int arg3, int[] arg4, class623 arg5) {
        if ((this.field4918.field6118[arg5.field8683] & 0x4) != 0 && arg5.field8666 < 0) {
            int var7 = this.field4918.field6058[arg5.field8683] / class29.field359;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field8671) / var7;
                if (var8 > arg1) {
                    arg5.field8671 += arg1 * var7;
                    break;
                }
                arg5.field8688.method1672(arg4, arg2, var8);
                arg1 -= var8;
                arg2 += var8;
                arg5.field8671 += var7 * var8 - 1048576;
                int var9 = class29.field359 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class559 var11 = arg5.field8688;
                if (this.field4918.field6067[arg5.field8683] == 0) {
                    arg5.field8688 = class559.method3080(arg5.field8679, var11.method3077(), var11.method3092(), var11.method3090());
                } else {
                    arg5.field8688 = class559.method3080(arg5.field8679, var11.method3077(), 0, var11.method3090());
                    this.field4918.method2455(arg5, 8, arg5.field8681.field843[arg5.field8668] < 0);
                    arg5.field8688.method3093(var9, var11.method3092());
                }
                if (arg5.field8681.field843[arg5.field8668] < 0) {
                    arg5.field8688.method3100(-1);
                }
                var11.method3070(var9);
                var11.method1672(arg4, arg2, arg3 - arg2);
                if (var11.method3079()) {
                    this.field4926.method3310(var11);
                }
            }
        }
        int var12 = 83 / ((arg0 + 60) / 36);
        field4922++;
        arg5.field8688.method1672(arg4, arg2, arg1);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "()Lvw;")
    public final class276 method1673() {
        field4927++;
        class623 var1 = (class623) this.field4925.method1270((byte) -25);
        if (var1 == null) {
            return null;
        } else if (var1.field8688 == null) {
            return this.method1676();
        } else {
            return var1.field8688;
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "()Lvw;")
    public final class276 method1676() {
        field4921++;
        class623 var1;
        do {
            var1 = (class623) this.field4925.method1282(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field8688 == null);
        return var1.field8688;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
    public final void method1678(int arg0) {
        this.field4926.method1678(arg0);
        field4920++;
        for (class623 var2 = (class623) this.field4925.method1270((byte) -25); var2 != null; var2 = (class623) this.field4925.method1282(0)) {
            if (!this.field4918.method2486(var2, (byte) 124)) {
                int var3 = arg0;
                do {
                    if (var2.field8672 >= var3) {
                        this.method2035(var3, var2, 14624);
                        var2.field8672 -= var3;
                        break;
                    }
                    this.method2035(var2.field8672, var2, 14624);
                    var3 -= var2.field8672;
                } while (!this.field4918.method2489(0, var2, var3, null, (byte) 101));
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "()I")
    public final int method1674() {
        field4917++;
        return 0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIIIIIZ)V")
    public static final void method2032(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg5 < arg3) {
            int var7 = (arg5 + arg3) / 2;
            int var8 = arg5;
            class233 var9 = class182.field2690[var7];
            class182.field2690[var7] = class182.field2690[arg3];
            class182.field2690[arg3] = var9;
            for (int var10 = arg5; var10 < arg3; var10++) {
                if (class171.method1172(arg6, arg2, arg0, class182.field2690[var10], var9, arg1 - 8573, arg4) <= 0) {
                    class233 var11 = class182.field2690[var10];
                    class182.field2690[var10] = class182.field2690[var8];
                    class182.field2690[var8++] = var11;
                }
            }
            class182.field2690[arg3] = class182.field2690[var8];
            class182.field2690[var8] = var9;
            method2032(arg0, 8573, arg2, var8 - 1, arg4, arg5, arg6);
            method2032(arg0, 8573, arg2, arg3, arg4, var8 + 1, arg6);
        }
        if (arg1 == 8573) {
            field4915++;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
    public static final void method2033(int arg0, int arg1) {
        field4916++;
        class379.method2196(0);
        class475.method2703((byte) 115);
        class201.method1351(arg0, 0, true);
        class292.method1833(128);
        class296.method1848((byte) 90, class630.field8790);
        if (arg1 != -28863) {
            field4923 = null;
        }
        class27.method124((byte) -128, class630.field8790);
        class479.method2720(class630.field8790, class460.field6517, arg1 + 39749);
        class517.method2877(arg1 ^ 0x7ED29822);
        class546.method3004(-10, class656.field9239);
        class336.method2026(100);
        class68.method553((byte) 101);
        if (class340.field4947 == 3) {
            class94.method690(4, (byte) 125);
        } else if (class340.field4947 == 7) {
            class94.method690(8, (byte) 125);
        } else if (class340.field4947 == 10) {
            class94.method690(11, (byte) 125);
        } else if (class340.field4947 == 1 || class340.field4947 == 2) {
            class485.field6724.method1857(-126);
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
    public static void method2034(int arg0) {
        if (arg0 == 142) {
            field4923 = null;
            field4919 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILgi;I)V")
    private final void method2035(int arg0, class623 arg1, int arg2) {
        field4914++;
        if (arg2 != 14624) {
            this.method1678(-107);
        }
        if ((this.field4918.field6118[arg1.field8683] & 0x4) != 0 && arg1.field8666 < 0) {
            int var4 = this.field4918.field6058[arg1.field8683] / class29.field359;
            int var5 = (var4 + 1048575 - arg1.field8671) / var4;
            arg1.field8671 = arg0 * var4 + arg1.field8671 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field4918.field6067[arg1.field8683] == 0) {
                    arg1.field8688 = class559.method3080(arg1.field8679, arg1.field8688.method3077(), arg1.field8688.method3092(), arg1.field8688.method3090());
                } else {
                    arg1.field8688 = class559.method3080(arg1.field8679, arg1.field8688.method3077(), 0, arg1.field8688.method3090());
                    this.field4918.method2455(arg1, 8, arg1.field8681.field843[arg1.field8668] < 0);
                }
                if (arg1.field8681.field843[arg1.field8668] < 0) {
                    arg1.field8688.method3100(-1);
                }
                arg0 = arg1.field8671 / var4;
            }
        }
        arg1.field8688.method1678(arg0);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([III)V")
    public final void method1672(int[] arg0, int arg1, int arg2) {
        field4924++;
        this.field4926.method1672(arg0, arg1, arg2);
        for (class623 var4 = (class623) this.field4925.method1270((byte) -25); var4 != null; var4 = (class623) this.field4925.method1282(0)) {
            if (!this.field4918.method2486(var4, (byte) 125)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field8672 >= var5) {
                        this.method2031((byte) -125, var5, var6, var5 + var6, arg0, var4);
                        var4.field8672 -= var5;
                        break;
                    }
                    this.method2031((byte) -125, var4.field8672, var6, var6 + var5, arg0, var4);
                    var5 -= var4.field8672;
                    var6 += var4.field8672;
                } while (!this.field4918.method2489(var6, var4, var5, arg0, (byte) 75));
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lso;)V")
    public class339(class432 arg0) {
        this.field4918 = arg0;
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field4919 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field4923 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }
}
