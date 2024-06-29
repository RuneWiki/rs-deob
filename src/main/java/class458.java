import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class458 {

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Ljp;")
    private class236 field6309 = new class236(128);

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Lpc;")
    private class473 field6310;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field6312 = -2;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Lf;")
    public static class529 field6307;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2607(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return true;
        } else {
            field6308++;
            return class394.method2310((byte) -125, arg1, arg2) & class267.method1602(14029, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method2608(int arg0) {
        field6307 = null;
        if (arg0 != 14220) {
            method2610(43, -34, -9);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)Lqr;")
    public final class46 method2609(byte arg0, int arg1) {
        field6304++;
        class236 var3 = this.field6309;
        class46 var4;
        synchronized (this.field6309) {
            var4 = (class46) this.field6309.method1456((long) arg1, 109);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6310.method2708(class167.method1125(true, arg1), class71.method464(arg1, 255), (byte) 54);
        class46 var6 = new class46();
        if (var5 != null) {
            var6.method327(new class379(var5), 53);
        }
        class236 var7 = this.field6309;
        synchronized (this.field6309) {
            if (arg0 <= 84) {
                method2611(70, 51, -43, null, 46, 41);
            }
            this.field6309.method1462(var6, (long) arg1, -56);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)I")
    public static final int method2610(int arg0, int arg1, int arg2) {
        field6305++;
        if (arg0 != 65408) {
            return -14;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILjo;II)V")
    public static final void method2611(int arg0, int arg1, int arg2, class219 arg3, int arg4, int arg5) {
        field6306++;
        if (arg3.field2968 == -1 && arg3.field2957 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class154.field2244.field7772 * arg3.field2967 >> 8;
        if (arg5 > arg3.field2951) {
            var6 += arg5 - arg3.field2951;
        } else if (arg5 < arg3.field2958) {
            var6 += arg3.field2958 - arg5;
        }
        if (arg3.field2960 < arg4) {
            var6 += arg4 - arg3.field2960;
        } else if (arg3.field2950 > arg4) {
            var6 += arg3.field2950 - arg4;
        }
        if (~arg3.field2962 == arg2 || (var6 - 64) > arg3.field2962 || class154.field2244.field7772 == 0 || arg3.field2953 != arg1) {
            if (arg3.field2959 != null) {
                class318.field4175.method3070(arg3.field2959);
                arg3.field2959 = null;
            }
            if (arg3.field2945 != null) {
                class318.field4175.method3070(arg3.field2945);
                arg3.field2945 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field2962 - var6) * var7 / arg3.field2962;
        if (arg3.field2959 != null) {
            arg3.field2959.method98(var8);
        } else if (arg3.field2968 >= 0) {
            class113 var9 = class113.method776(class50.field774, arg3.field2968, 0);
            if (var9 != null) {
                class404 var10 = var9.method777().method2355(class516.field7649);
                class7 var11 = class7.method79(var10, 100, var8);
                var11.method85(-1);
                class318.field4175.method3069(var11);
                arg3.field2959 = var11;
            }
        }
        if (arg3.field2945 != null) {
            arg3.field2945.method98(var8);
            if (arg3.field2945.method302(-25575)) {
                return;
            }
            arg3.field2945 = null;
        } else if (arg3.field2957 != null && (arg3.field2949 -= arg0) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field2957.length);
            class113 var13 = class113.method776(class50.field774, arg3.field2957[var12], 0);
            if (var13 != null) {
                class404 var14 = var13.method777().method2355(class516.field7649);
                class7 var15 = class7.method79(var14, 100, var8);
                var15.method85(0);
                class318.field4175.method3069(var15);
                arg3.field2949 = arg3.field2966 + (int) (Math.random() * (double) (arg3.field2952 - arg3.field2966));
                arg3.field2945 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lrb;ILpc;)V")
    public class458(class234 arg0, int arg1, class473 arg2) {
        this.field6310 = arg2;
        if (this.field6310 != null) {
            int var4 = this.field6310.method2724(0) - 1;
            this.field6310.method2710(var4, (byte) -107);
        }
    }
}
