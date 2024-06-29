import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class763 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "Lhj;")
    public static class596 field10532 = new class596(111, 8);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field10533;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZ)V", line = 4)
    public static final void method4230(int arg0, int arg1, boolean arg2) {
        field10533++;
        int var3 = class332.field4108.method1819(class637.field8699.method3584(class770.field10592, true), (byte) 120);
        int var5;
        if (class304.field3626) {
            for (class581 var4 = (class581) class365.field4542.method1003((byte) 53); var4 != null; var4 = (class581) class365.field4542.method1004(arg2)) {
                int var6;
                if (var4.field7927 == 1) {
                    var6 = class711.method4029((byte) -82, (class75) var4.field7925.field1703.field1903);
                } else {
                    var6 = class610.method3461(-7830, var4);
                }
                if (var6 > var3) {
                    var3 = var6;
                }
            }
            class553.field7697 = class282.field3279 * 16 + (class35.field536 ? 26 : 22);
            var5 = class282.field3279 * 16 + 21;
            var3 += 8;
        } else {
            for (class75 var7 = (class75) class5.field52.method2725(37); var7 != null; var7 = (class75) class5.field52.method2726(-114)) {
                int var10 = class711.method4029((byte) -110, var7);
                if (var3 < var10) {
                    var3 = var10;
                }
            }
            var5 = class245.field2894 * 16 + 21;
            var3 += 8;
            class553.field7697 = class245.field2894 * 16 + (class35.field536 ? 26 : 22);
        }
        int var8 = arg0 - var3 / 2;
        if (class701.field9880 < (var8 + var3)) {
            var8 = class701.field9880 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var5 + arg1 > class705.field9921) {
            var9 = class705.field9921 - var5;
        }
        class705.field9916 = var8;
        if (var9 < 0) {
            var9 = 0;
        }
        class672.field9218 = arg2;
        class676.field9279 = var9;
        class119.field1505 = var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V", line = 87)
    public static void method4231(boolean arg0) {
        if (arg0) {
            method4230(-52, -119, false);
        }
        field10532 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIILet;Let;)V", line = 102)
    public static final void method4232(int arg0, int arg1, int arg2, class621 arg3, class621 arg4) {
        class727 var5 = class267.method1583(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field10173 = arg3;
        var5.field10187 = arg4;
        int var6 = class704.field9910 == class621.field8523 ? 1 : 0;
        if (!arg3.method503(false)) {
            arg3.field822 = class454.field6399[var6];
            class454.field6399[var6] = arg3;
        } else if (arg3.method504((byte) -24)) {
            arg3.field822 = class119.field1509[var6];
            class119.field1509[var6] = arg3;
        } else {
            arg3.field822 = class653.field9015[var6];
            class653.field9015[var6] = arg3;
            class257.field3034 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method503(false)) {
            if (arg4.method504((byte) -24)) {
                arg4.field822 = class119.field1509[var6];
                class119.field1509[var6] = arg4;
                return;
            }
            arg4.field822 = class653.field9015[var6];
            class653.field9015[var6] = arg4;
            class257.field3034 = true;
            return;
        }
        arg4.field822 = class454.field6399[var6];
        class454.field6399[var6] = arg4;
    }
}
