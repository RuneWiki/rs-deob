import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public abstract class class550 {

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field7652;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V", line = 6)
    public static void method3247(byte arg0) {
        field7652 = null;
        int var1 = -2 / ((-arg0 - 9) / 32);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IILpja;IIIIBIILha;I)V", line = 21)
    public static final void method3248(int arg0, int arg1, class171 arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, class473 arg10, int arg11) {
        field7653++;
        if (arg0 < arg8 && arg8 < arg0 + arg9 && arg1 > arg3 - 13 && arg1 < (arg3 + 3) && arg2.field2178) {
            arg4 = arg5;
        }
        int[] var12 = null;
        if (class557.method3281(arg2.field2174, -112)) {
            var12 = class35.field367.method3051((byte) -20, (int) arg2.field2179).field8162;
        } else if (arg2.field2171 != -1) {
            var12 = class35.field367.method3051((byte) -20, arg2.field2171).field8162;
        } else if (class651.method3728((byte) 65, arg2.field2174)) {
            class685 var15 = (class685) class450.field6288.method3669(false, (long) ((int) arg2.field2179));
            if (var15 != null) {
                class359 var16 = var15.field9573;
                class636 var17 = var16.field5172;
                if (var17.field8872 != null) {
                    var17 = var17.method3650(class173.field2192, (byte) 55);
                }
                if (var17 != null) {
                    var12 = var17.field8921;
                }
            }
        } else if (class593.method3465(arg2.field2174, (byte) -111)) {
            Object var13 = null;
            class286 var14;
            if (arg2.field2174 == 1003) {
                var14 = class390.field5558.method3065(-124, (int) arg2.field2179);
            } else {
                var14 = class390.field5558.method3065(56, (int) (arg2.field2179 >>> 32 & 0x7FFFFFFFL));
            }
            if (var14.field4136 != null) {
                var14 = var14.method1889(class173.field2192, false);
            }
            if (var14 != null) {
                var12 = var14.field4174;
            }
        }
        String var18 = class298.method1949(arg2, -126);
        if (var12 != null) {
            var18 = var18 + class468.method2797(111, var12);
        }
        class386.field5515.method2639(class313.field4505, 0, arg0 + 3, arg3, arg4, class492.field6782, var18, (byte) 110);
        if (arg2.field2173) {
            class208.field2898.method2025(arg0 + class705.field9812.method1953(var18, (byte) -76) + 5, arg3 - 12);
        }
        int var19 = 16 % ((-arg7 - 62) / 40);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)I", line = 94)
    public static final int method3249(int arg0, int arg1) {
        field7655++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 != 6520) {
            field7652 = null;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BJ)I", line = 142)
    public final int method3250(byte arg0, long arg1) {
        if (arg0 >= -72) {
            field7652 = null;
        }
        field7654++;
        long var4 = this.method2302((byte) -12);
        if (var4 > 0L) {
            class730.method4066((byte) -45, var4);
        }
        return this.method2299(true, arg1);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZJ)I")
    public abstract int method2299(boolean arg0, long arg1);

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)J")
    public abstract long method2303(byte arg0);

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "(B)J")
    public abstract long method2302(byte arg0);

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "(B)V")
    public abstract void method2300(byte arg0);
}
