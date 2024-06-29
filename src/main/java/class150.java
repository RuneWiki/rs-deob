import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class150 extends class115 {

    @OriginalMember(owner = "client!up", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2098 = "flash1:";

    @OriginalMember(owner = "client!up", name = "P", descriptor = "I")
    public static volatile int field2102 = 0;

    @OriginalMember(owner = "client!up", name = "V", descriptor = "Z")
    public static boolean field2108 = false;

    @OriginalMember(owner = "client!up", name = "X", descriptor = "I")
    public static int field2110 = 0;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "I")
    private int field2097;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "I")
    private int field2103;

    @OriginalMember(owner = "client!up", name = "R", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!up", name = "S", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!up", name = "T", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!up", name = "U", descriptor = "I")
    private int field2107;

    @OriginalMember(owner = "client!up", name = "W", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!up", name = "Y", descriptor = "Z")
    public static boolean field2111;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)[[I")
    public final int[][] method144(int arg0, int arg1) {
        ++field2100;
        int var3 = -112 / ((arg1 - -80) / 45);
        int[][] var4 = super.field1342.method2530(arg0, (byte) 95);
        if (super.field1342.field5819) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class218.field2979; ++var8) {
                var5[var8] = this.field2097;
                var6[var8] = this.field2107;
                var7[var8] = this.field2103;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg2 == 0) {
            this.method894(-121, arg1.method1353(110));
        }
        if (arg0 >= 83) {
            ++field2106;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method892(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2101;
        if (arg3 != 1) {
            method892(55, -106, 93, -44, 79, 77, 118, -81);
        }
        if (~arg2 == ~arg6) {
            method897(arg7, arg1, arg6, arg5, arg0, false, arg4);
        } else if (class143.field2029 <= arg5 - arg6 && ~(arg5 + arg6) >= ~class128.field1785 && -arg2 + arg7 >= class20.field209 && ~class407.field5914 <= ~(arg7 - -arg2)) {
            class232.method1479(arg7, arg4, arg6, arg0, arg5, arg1, (byte) 107, arg2);
        } else {
            class335.method2155(arg1, arg5, arg2, arg7, arg4, arg0, 15676, arg6);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
    public class150() {
        this(0);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
    public static void method893(boolean arg0) {
        if (arg0) {
            method895((class433) null, (byte) 116);
        }
        field2098 = null;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(II)V")
    private final void method894(int arg0, int arg1) {
        this.field2097 = (16711680 & arg1) >> 12;
        this.field2107 = arg1 >> 4 & 4080;
        ++field2104;
        int var3 = -57 % ((-21 - arg0) / 41);
        this.field2103 = arg1 << 4 & 4080;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(I)V")
    private class150(int arg0) {
        super(0, false);
        this.method894(-93, arg0);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lbo;B)V")
    public static final void method895(class433 arg0, byte arg1) {
        ++field2099;
        int var2 = -class221.field3033 + arg0.field6331;
        if (arg1 >= 0) {
            method892(101, -15, -103, 54, 122, -72, 41, 87);
        }
        int var3 = arg0.field6246 * 128 - -(arg0.method786((byte) 70) * 64);
        int var4 = arg0.field6302 * 128 + 64 * arg0.method786((byte) 70);
        arg0.field1311 += (-arg0.field1311 + var4) / var2;
        arg0.field6339 = 0;
        arg0.field1304 += (-arg0.field1304 + var3) / var2;
        if (~arg0.field6311 == -1) {
            arg0.method2691(false, 8192);
        }
        if (~arg0.field6311 == -2) {
            arg0.method2691(false, 12288);
        }
        if (arg0.field6311 == 2) {
            arg0.method2691(false, 0);
        }
        if (arg0.field6311 == 3) {
            arg0.method2691(false, 4096);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZBIII)Lvh;")
    public static final class201 method896(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field2109;
        if (arg1 >= -71) {
            field2110 = -66;
        }
        class201 var5 = new class201();
        var5.field2776 = arg4;
        var5.field2771 = arg2;
        class396.field5783.method1202(-1, (long) arg3, var5);
        class2.method17((byte) -10, arg4);
        class119 var6 = class179.method1170(arg3, 818041328);
        if (var6 != null) {
            class101.method543((byte) 56, var6);
        }
        if (class344.field5061 != null) {
            class101.method543((byte) -110, class344.field5061);
            class344.field5061 = null;
        }
        class94.method505(false);
        if (var6 != null) {
            class433.method2686(!arg0, var6, 0);
        }
        if (!arg0) {
            class387.method2472(arg4);
        }
        if (!arg0 && class424.field6086 != -1) {
            class237.method1513(1, class424.field6086, 65079);
        }
        return var5;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIZI)V")
    private static final void method897(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (!arg5) {
            if (class143.field2029 <= arg3 - arg2 && ~class128.field1785 <= ~(arg2 + arg3) && ~class20.field209 >= ~(-arg2 + arg0) && ~class407.field5914 <= ~(arg0 - -arg2)) {
                class130.method783(arg0, arg6, arg3, arg1, arg2, 3, arg4);
            } else {
                class377.method2376(arg6, arg1, arg0, arg4, 0, arg2, arg3);
            }
            ++field2096;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != 21212) {
            return true;
        } else {
            ++field2105;
            if (~(arg3 + arg4) < ~arg5 && arg3 < arg5 + arg8) {
                return arg2 < arg7 - -arg1 && arg0 + arg2 > arg7;
            } else {
                return false;
            }
        }
    }
}
