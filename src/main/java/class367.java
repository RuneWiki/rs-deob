import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class367 {

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[I")
    public static int[] field5444 = new int[1024];

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Lpr;")
    public static class415 field5442;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lla;")
    public static class421 field5445;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B[I)Ljava/lang/String;")
    public static final String method2319(byte arg0, int[] arg1) {
        if (arg0 != -85) {
            return null;
        }
        field5440++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class546.field7760;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class117 var5 = class119.field2137.method2831(arg1[var4], -29);
            if (var5.field2065 != -1) {
                class702 var6 = (class702) class192.field3025.method1900((long) var5.field2065, arg0 + 158);
                if (var6 == null) {
                    class279 var7 = class279.method1841(class632.field9092, var5.field2065, 0);
                    if (var7 != null) {
                        var6 = class623.field9017.method170(var7, true);
                        class192.field3025.method1904(var6, (long) var5.field2065, -1);
                    }
                }
                if (var6 != null) {
                    class126.field2308[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIZIIIILpl;Lpl;)V")
    public static final void method2320(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class604 arg8, class604 arg9) {
        field5443++;
        int var10 = arg8.method456(-810);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class702 var12 = (class702) class37.field1048.method1900((long) var10, -127);
        if (var12 == null) {
            class279[] var13 = class279.method1844(class632.field9092, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class623.field9017.method170(var13[0], true);
            class37.field1048.method1904(var12, (long) var10, -1);
        }
        class478.method2906(arg0, (byte) 64, arg9.field9806, arg9.field9814, arg9.field9815, arg5 >> 1, arg4, 0, arg1 >> 1, arg9.method3446(0) * 256);
        int var14 = arg6 + class559.field7906[0] - 18;
        int var15 = arg7 / 4 * 18 + var14;
        int var16 = class559.field7906[1] + arg2 - 16 - 54;
        int var17 = arg7 % 4 * 18 + var16;
        if (arg3) {
            field5442 = null;
        }
        var12.method3914(var15, var17);
        if (arg8 == arg9) {
            class623.field9017.method1261(18, 25552, -256, 18, var15 - 1, var17 + -1);
        }
        class701 var18 = class470.method2812(2870);
        var18.field9861 = arg8;
        var18.field9860 = var17 + 16;
        var18.field9859 = var15 + 16;
        var18.field9865 = var17;
        var18.field9866 = var15;
        class534.field7491.method3322(var18, -56);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZBLlk;)V")
    public static final void method2321(boolean arg0, byte arg1, class545 arg2) {
        field5446++;
        int var3 = arg2.field7676 == 0 ? arg2.field7718 : arg2.field7676;
        int var4 = arg2.field7699 == 0 ? arg2.field7652 : arg2.field7699;
        class537.method3104(class156.field2667[arg2.field7755 >> 16], arg2.field7755, (byte) -69, arg0, var4, var3);
        if (arg2.field7641 != null) {
            class537.method3104(arg2.field7641, arg2.field7755, (byte) -69, arg0, var4, var3);
        }
        class601 var5 = (class601) class78.field1572.method2596((long) arg2.field7755, 49);
        if (arg1 == -41 && var5 != null) {
            class156.method1202(arg1 + 42, arg0, var3, var5.field8614, var4);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method2322(byte arg0) {
        if (arg0 >= -72) {
            method2321(true, (byte) 72, null);
        }
        field5442 = null;
        field5444 = null;
        field5445 = null;
    }
}
