import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class312 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Lsc;")
    public static class47 field4418;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[Lmq;")
    public static class85[] field4420;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;IILuf;Lda;Laa;IIZILrt;I)V", line = 5)
    public static final void method1905(String arg0, int arg1, int arg2, class519 arg3, class443 arg4, class88 arg5, int arg6, int arg7, boolean arg8, int arg9, class470 arg10, int arg11) {
        field4421++;
        int var12;
        if (class783.field10725 == 4) {
            var12 = (int) class98.field1423 & 0x3FFF;
        } else {
            var12 = (int) class98.field1423 + class654.field9251 & 0x3FFF;
        }
        int var13 = Math.max(arg3.field7128 / 2, arg3.field7255 / 2) + 10;
        int var14 = arg1 * arg1 + arg9 * arg9;
        if ((var13 * var13) < var14) {
            return;
        }
        int var15 = class253.field3634[var12];
        int var16 = class253.field3633[var12];
        if (arg8) {
            method1906((byte) -8);
        }
        if (class783.field10725 != 4) {
            var16 = var16 * 256 / (class592.field8487 + 256);
            var15 = var15 * 256 / (class592.field8487 + 256);
        }
        int var17 = arg1 * var15 + (arg9 * var16) >> 14;
        int var18 = arg1 * var16 - (arg9 * var15) >> 14;
        int var19 = arg10.method2744(100, arg0, null, -105);
        int var20 = arg10.method2745(100, arg0, -1, null, 0);
        int var21 = var17 - var19 / 2;
        if (var21 >= -arg3.field7128 && var21 <= arg3.field7128 && -arg3.field7255 <= var18 && arg3.field7255 >= var18) {
            arg4.method2627(1, arg0, arg2, var19, arg11 + (arg3.field7128 / 2) + var21, 0, 0, 50, arg7, arg5, 0, arg11, null, -1609, arg7 + arg3.field7255 / 2 - arg6 - var18 - var20, null);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 53)
    public static void method1906(byte arg0) {
        field4418 = null;
        field4420 = null;
        if (arg0 <= 14) {
            method1907(100, -18, 107, null, -110, -42, -16, 21);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILha;IIII)V", line = 65)
    public static final void method1907(int arg0, int arg1, int arg2, class475 arg3, int arg4, int arg5, int arg6, int arg7) {
        field4417++;
        arg3.method2765(arg7, arg1, 102, arg6, arg5, arg0);
        arg3.method2765(arg7 + 1, 16, arg2 + 11467, arg4, arg5 + 1, arg0 - 2);
        if (arg2 != -11342) {
            method1905(null, -34, -44, null, null, null, 92, 96, true, -32, null, -8);
        }
        arg3.method2771(arg1 - 19, arg5 + 1, arg4, 109, arg7 + 18, arg0 - 2);
    }
}
