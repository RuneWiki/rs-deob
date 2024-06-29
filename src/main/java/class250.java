import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class250 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3847 = 3;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "[I")
    public static int[] field3846 = new int[25];

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Lsc;")
    public static class256 field3850 = new class256(64);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Llh;")
    public static final class295 method1673(int arg0, int arg1, int arg2) {
        class295 var3 = (class295) class56.field868.method1414(true, (long) arg1 << 32 | (long) arg2);
        int var4 = -99 % ((-arg0 - 52) / 52);
        if (var3 == null) {
            var3 = new class295(arg1, arg2);
            class56.field868.method1409(var3.field1408, 1, var3);
        }
        field3849++;
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILag;ILqd;III)V")
    public static final void method1674(int arg0, class188 arg1, int arg2, class3 arg3, int arg4, int arg5, int arg6) {
        field3845++;
        if (arg3 == null) {
            return;
        }
        int var7 = (int) class276.field4334 + class133.field2060 & 0x7FF;
        int var8 = arg2 * arg2 + arg4 * arg4;
        int var9 = Math.max(arg1.field2922 / 2, arg1.field2928 / 2) + 10;
        if ((var9 * var9) < var8) {
            return;
        }
        int var10 = class97.field1556[var7];
        int var11 = var10 * 256 / (class296.field4674 + 256);
        int var12 = class97.field1557[var7];
        int var13 = var12 * 256 / (class296.field4674 + 256);
        int var14 = arg2 * var13 + arg4 * var11 >> 16;
        int var15 = arg2 * var11 - arg4 * var13 >> 16;
        ((class49) arg3).method401(arg1.field2922 / arg5 + arg0 + var14 - (arg3.field46 / 2), arg6 - -(arg1.field2928 / 2) + -(arg3.field43 / 2) + -var15, arg1.field2850, arg1.field2858);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1675(int arg0) {
        if (arg0 >= 105) {
            field3850 = null;
            field3846 = null;
        }
    }
}
