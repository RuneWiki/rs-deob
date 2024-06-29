import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class277 {

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "B")
    public static byte field4565 = 0;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "[I")
    public static int[] field4568 = new int[100];

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "Lth;")
    public static class57 field4566;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 7)
    public static void method2054(int arg0) {
        if (arg0 != 29765) {
            method2055(-31, -46, '.');
        }
        field4566 = null;
        field4568 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIC)I", line = 26)
    public static final int method2055(int arg0, int arg1, char arg2) {
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        field4564++;
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        int var4 = 42 / ((55 - arg1) / 38);
        return var3;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIII)V", line = 54)
    public static final void method2056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class161.method1253(arg3, class353.field5599[arg0], -1, arg1, arg4);
        if (arg2 != -15065) {
            return;
        }
        int var9 = arg5 - 1;
        class161.method1253(arg3, class353.field5599[arg5], arg2 + 15064, arg1, arg4);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class353.field5599[var6];
            var7[arg4] = var7[arg3] = arg1;
        }
        field4567++;
    }
}
