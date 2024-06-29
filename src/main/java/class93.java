import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class93 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[I")
    public static int[] field1089 = new int[32];

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILaa;Loia;IILjb;)V", line = 3)
    public static final void method691(int arg0, int arg1, int arg2, class486 arg3, class88 arg4, int arg5, int arg6, class493 arg7) {
        field1088++;
        if (arg4 == null) {
            return;
        }
        if (arg0 >= -109) {
            field1089 = null;
        }
        int var8;
        if (class97.field1168 == 4) {
            var8 = (int) class552.field7773 & 0x3FFF;
        } else {
            var8 = (int) class552.field7773 + class535.field7520 & 0x3FFF;
        }
        int var9 = Math.max(arg7.field7095 / 2, arg7.field7031 / 2) + 10;
        int var10 = arg2 * arg2 + arg5 * arg5;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class164.field2258[var8];
        int var12 = class164.field2252[var8];
        if (class97.field1168 != 4) {
            var12 = var12 * 256 / (class180.field2412 + 256);
            var11 = var11 * 256 / (class180.field2412 + 256);
        }
        int var13 = arg5 * var11 + (arg2 * var12) >> 14;
        int var14 = arg5 * var12 - arg2 * var11 >> 14;
        arg4.method660(arg6 - (-(arg7.field7095 / 2) - (var13 - (arg4.method656() / 2))), arg7.field7031 / 2 + arg1 - (var14 - -(arg4.method670() / 2)), arg3, arg6, arg1);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 48)
    public static void method692(int arg0) {
        field1089 = null;
        if (arg0 != 2) {
            method691(8, 48, 58, null, null, -61, 89, null);
        }
    }
}
