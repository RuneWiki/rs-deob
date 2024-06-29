import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class447 {

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public static int field6620 = 0;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BIIIII)V", line = 22)
    public static final void method2761(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == 97) {
            field6621++;
            for (int var6 = arg2; var6 <= arg3; var6++) {
                class238.method1577(arg4, class664.field9322[var6], arg1, arg5, (byte) -43);
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lbs;IIILkd;ILsu;I)V", line = 42)
    public static final void method2762(class689 arg0, int arg1, int arg2, int arg3, class282 arg4, int arg5, class211 arg6, int arg7) {
        field6619++;
        class449 var8 = new class449();
        var8.field6636 = arg1 << 9;
        var8.field6637 = arg2 << 9;
        var8.field6639 = arg5;
        if (arg7 != 1) {
            return;
        }
        if (arg6 != null) {
            var8.field6653 = arg6;
            int var10 = arg6.field3164;
            int var11 = arg6.field3152;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg6.field3152;
                var11 = arg6.field3164;
            }
            var8.field6635 = arg6.field3085;
            var8.field6644 = arg6.field3148;
            var8.field6632 = arg6.field3127 << 9;
            var8.field6649 = arg6.field3133;
            var8.field6648 = arg6.field3112 << 9;
            var8.field6641 = arg6.field3160;
            var8.field6638 = arg6.field3091;
            var8.field6657 = arg6.field3122;
            var8.field6658 = arg2 + var11 << 9;
            var8.field6643 = arg6.field3171;
            var8.field6652 = arg6.field3156;
            var8.field6650 = arg1 + var10 << 9;
            var8.field6651 = arg6.field3155;
            if (arg6.field3172 != null) {
                var8.field6654 = true;
                var8.method2767(arg7 - 47);
            }
            if (var8.field6644 != null) {
                var8.field6647 = var8.field6643 + (int) ((double) (var8.field6652 - var8.field6643) * Math.random());
            }
            class269.field3852.method1203(var8, (byte) -98);
            return;
        }
        if (arg4 != null) {
            var8.field6646 = arg4;
            class348 var9 = arg4.field4008;
            if (var9.field5076 != null) {
                var8.field6654 = true;
                var9 = var9.method2207(41, class83.field1160);
            }
            if (var9 != null) {
                var8.field6658 = var9.field5053 + arg2 << 9;
                var8.field6650 = var9.field5053 + arg1 << 9;
                var8.field6641 = class284.method1819(arg4, (byte) -103);
                var8.field6651 = var9.field5060;
                var8.field6649 = var9.field5095;
                var8.field6635 = var9.field5047;
                var8.field6648 = var9.field5085 << 9;
                var8.field6638 = var9.field5065;
                var8.field6632 = var9.field5090 << 9;
            }
            class478.field6929.method1203(var8, (byte) 79);
            return;
        }
        if (arg0 == null) {
            return;
        }
        var8.field6660 = arg0;
        var8.field6650 = arg0.method2579(false) + arg1 << 9;
        var8.field6658 = arg2 + arg0.method2579(false) << 9;
        var8.field6641 = class390.method2502(arg0, (byte) 121);
        var8.field6632 = arg0.field9527 << 9;
        var8.field6638 = arg0.field9493;
        var8.field6635 = 256;
        var8.field6648 = 0;
        var8.field6649 = 256;
        var8.field6651 = arg0.field9506;
        class87.field1236.method2278((byte) -93, (long) arg0.field6118, var8);
        return;
    }
}
