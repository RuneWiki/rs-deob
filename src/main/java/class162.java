import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class162 implements class582 {

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Lfd;")
    private class485 field2482;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "Laq;")
    private class146 field2484;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "Lhb;")
    public static class666 field2486;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V", line = 5)
    public static void method1125(int arg0) {
        field2486 = null;
        if (arg0 < 35) {
            field2486 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBIIII)V", line = 15)
    public static final void method1126(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2483++;
        int var6 = arg2 - arg3;
        int var7 = arg4 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class458.method2645(arg5, arg0, arg4, (byte) 31, arg3);
            }
        } else if (var7 == 0) {
            class688.method3785(109, arg0, arg2, arg5, arg3);
        } else {
            int var8 = -122 / ((arg1 - 53) / 60);
            int var9 = (var7 << 12) / var6;
            int var10 = arg5 - (arg3 * var9 >> 12);
            int var11;
            int var12;
            if (class482.field6703 > arg3) {
                var11 = class482.field6703;
                var12 = (class482.field6703 * var9 >> 12) + var10;
            } else if (class144.field2148 >= arg3) {
                var12 = arg5;
                var11 = arg3;
            } else {
                var12 = (class144.field2148 * var9 >> 12) + var10;
                var11 = class144.field2148;
            }
            int var13;
            int var14;
            if (class482.field6703 > arg2) {
                var14 = class482.field6703;
                var13 = (class482.field6703 * var9 >> 12) + var10;
            } else if (arg2 > class144.field2148) {
                var13 = (class144.field2148 * var9 >> 12) + var10;
                var14 = class144.field2148;
            } else {
                var13 = arg4;
                var14 = arg2;
            }
            if (var13 < class92.field1219) {
                var13 = class92.field1219;
                var14 = (class92.field1219 - var10 << 12) / var9;
            } else if (class631.field8829 < var13) {
                var14 = (class631.field8829 - var10 << 12) / var9;
                var13 = class631.field8829;
            }
            if (var12 < class92.field1219) {
                var12 = class92.field1219;
                var11 = (class92.field1219 - var10 << 12) / var9;
            } else if (var12 > class631.field8829) {
                var11 = (class631.field8829 - var10 << 12) / var9;
                var12 = class631.field8829;
            }
            class313.method1923(0, var13, var14, var11, var12, arg0);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Z", line = 115)
    public final boolean method104(byte arg0) {
        field2481++;
        if (arg0 < 18) {
            this.method109(73, true);
        }
        return this.field2482.method2733((byte) 120);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)V", line = 128)
    public final void method109(int arg0, boolean arg1) {
        field2488++;
        if (arg0 != 8444) {
            return;
        }
        class511 var3 = this.field2482.method2734(this.field2484.field2174, false);
        if (var3 == null) {
            return;
        }
        int var4 = this.field2484.field2172.method371(this.field2484.field2164, (byte) -118, class652.field9217) + this.field2484.field2165;
        int var5 = this.field2484.field2168.method2192(class603.field8386, 2, this.field2484.field2175) + this.field2484.field2167;
        if (this.field2484.field2163) {
            class630.field8790.method399(var4, var5, this.field2484.field2164, this.field2484.field2175, this.field2484.field2171, 0);
        }
        int var6 = var5 + this.method1127(var3.field6991, 5, 118, var5, class548.field7419, var4) * 12;
        int var9 = var6 + 8;
        if (this.field2484.field2163) {
            class630.field8790.method415(var4, var9, this.field2484.field2164 + var4 - 1, var9, this.field2484.field2171, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method1127(var3.field6994, 5, 97, var6, class548.field7419, var4) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method1127(var3.field6992, 5, arg0 - 8360, var10, class548.field7419, var4) * 12;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lfd;Laq;)V", line = 160)
    public class162(class485 arg0, class146 arg1) {
        this.field2482 = arg0;
        this.field2484 = arg1;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 172)
    public final void method108(int arg0) {
        int var2 = -18 / ((41 - arg0) / 54);
        field2487++;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;IIILta;I)I", line = 183)
    private final int method1127(String arg0, int arg1, int arg2, int arg3, class194 arg4, int arg5) {
        if (arg2 <= 59) {
            return -124;
        } else {
            field2485++;
            return arg4.method1310(0, null, arg0, this.field2484.field2175 - (arg1 * 2), null, 0, 0, (byte) 95, this.field2484.field2164 - (arg1 * 2), this.field2484.field2173, 0, null, this.field2484.field2169, arg1 + arg3, arg1 + arg5, 0);
        }
    }
}
