import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class281 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
    public static final void method1834(int arg0) {
        class67.field1008.method900(arg0 - 2);
        field3950++;
        class212.field2966.method900(0);
        if (arg0 != 2) {
            method1835(-77, (class345) null, 98, -2, -31, 73, true, (class241) null, (class453) null);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILuo;IIIIZLep;Lms;)V")
    public static final void method1835(int arg0, class345 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class241 arg7, class453 arg8) {
        if (!arg6) {
            return;
        }
        field3951++;
        class25 var9 = class328.method2113(arg0, (byte) -125);
        if (var9 == null || !var9.field440 || !var9.method298((byte) -121)) {
            return;
        }
        if (var9.field442 != null) {
            int[] var10 = new int[var9.field442.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class128.field1807 == 4) {
                    var13 = (int) class333.field4599 & 0x3FFF;
                } else {
                    var13 = (int) class333.field4599 + class126.field1778 & 0x3FFF;
                }
                int var14 = class133.field1913[var13];
                int var15 = class133.field1908[var13];
                if (class128.field1807 != 4) {
                    var15 = var15 * 256 / (class374.field5308 + 256);
                    var14 = var14 * 256 / (class374.field5308 + 256);
                }
                var10[var11 * 2] = arg4 - (-((arg2 + (var9.field442[var11 * 2] * 4)) * var15 + (var9.field442[var11 * 2 + 1] * 4 + arg3) * var14 >> 15) - (arg8.field6342 / 2));
                var10[var11 * 2 + 1] = arg8.field6447 / 2 + arg5 - ((var9.field442[var11 * 2 + 1] * 4 + arg3) * var15 - ((var9.field442[var11 * 2] * 4 + arg2) * var14) >> 15);
            }
            class32.method329(arg1, var10, var9.field453, arg8.field6420, arg8.field6404);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg1.method132(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 1 + 2], var9.field422, 1, arg7, arg4, arg5);
            }
            arg1.method132(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field422, 1, arg7, arg4, arg5);
        }
        class226 var16 = null;
        if (var9.field435 != -1) {
            var16 = var9.method295(!arg6, false, arg1);
            if (var16 != null) {
                class69.method535(arg4, arg7, arg8, arg2, arg3, (byte) -111, var16, arg5);
            }
        }
        if (var9.field446 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method598();
        }
        class357 var18 = class51.field711;
        class337 var19 = class1.field14;
        if (var9.field431 == 1) {
            var19 = class293.field4104;
            var18 = class159.field2234;
        }
        if (var9.field431 == 2) {
            var19 = class95.field1313;
            var18 = class279.field3915;
        }
        class427.method2694(arg7, arg8, arg5, (byte) 89, arg2, var19, var9.field446, arg3, var18, arg4, var9.field437, var17);
        return;
    }
}
