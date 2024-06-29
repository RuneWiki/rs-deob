import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class209 {

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public static int field3090 = 100;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "Lgn;")
    public static class702 field3089;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V")
    public static void method1393(byte arg0) {
        field3089 = null;
        if (arg0 != 86) {
            field3090 = -75;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I[Lvfa;ZIBI)V")
    public static final void method1394(int arg0, class672[] arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        field3092++;
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class672 var7 = arg1[var6];
            if (var7 != null && var7.field9255 == arg0) {
                class505.method2839(var7, (byte) 13, arg2, arg3, arg5);
                class339.method2035(var7, arg3, arg5, arg4 - 144);
                if ((var7.field9329 - var7.field9287) < var7.field9216) {
                    var7.field9216 = var7.field9329 - var7.field9287;
                }
                if (var7.field9226 > (var7.field9300 - var7.field9178)) {
                    var7.field9226 = var7.field9300 - var7.field9178;
                }
                if (var7.field9216 < 0) {
                    var7.field9216 = 0;
                }
                if (var7.field9226 < 0) {
                    var7.field9226 = 0;
                }
                if (var7.field9239 == 0) {
                    class312.method1914(arg2, (byte) 100, var7);
                }
            }
        }
        if (arg4 != 90) {
            method1393((byte) -33);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
    public static final void method1395(int arg0) {
        field3091++;
        if (arg0 != -24458) {
            return;
        }
        int var1 = class586.field7665;
        int[] var2 = class20.field351;
        for (int var3 = 0; var3 < var1; var3++) {
            class383 var4 = class248.field3438[var2[var3]];
            if (var4 != null) {
                class169.method1206(256, var4, var4.method2256(-1));
            }
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IB[B)I")
    public static final int method1396(int arg0, byte arg1, byte[] arg2) {
        if (arg1 <= 81) {
            method1393((byte) 29);
        }
        field3093++;
        return class59.method399(104, arg0, 0, arg2);
    }
}
