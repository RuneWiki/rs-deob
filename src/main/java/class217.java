import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class217 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field3042 = 0;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[I")
    public static int[] field3041 = new int[8];

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "Ldg;")
    public static class376 field3043 = new class376(35, 8);

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3044++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class141.field2081 - class352.field5074) * var8 / 100 + class352.field5074;
        int var10 = arg4 * var9 >> 8;
        int var11 = 16384 - arg7 & 0x3FFF;
        if (arg0 != -1651000018) {
            method1431(86);
        }
        int var12 = 16384 - arg3 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class189.field2719[var11] * -var10 >> 14;
            var15 = class189.field2721[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class189.field2719[var12] * var15 >> 14;
            var15 = class189.field2721[var12] * var15 >> 14;
        }
        class131.field1928 = arg6 - var13;
        class413.field6011 = arg5 - var15;
        class637.field9001 = arg3;
        class300.field4472 = 0;
        class568.field7998 = arg1 - var14;
        class544.field7662 = arg7;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method1431(int arg0) {
        if (arg0 == 226890990) {
            field3043 = null;
            field3041 = null;
        }
    }
}
