import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class325 extends class46 {

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "Ljn;")
    public static class134 field4581 = new class134(110, 6);

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIFIIIZ)[[I", line = 5)
    public static final int[][] method2058(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field4580++;
        int[][] var9 = new int[arg2][arg5];
        class618 var10 = new class618();
        var10.field8674 = arg3;
        var10.field8676 = arg7;
        var10.field8684 = (int) (arg4 * 4096.0F);
        var10.field8672 = arg1;
        var10.field8678 = arg8;
        int var11 = -89 / ((-arg6 - 72) / 42);
        var10.method653((byte) 101);
        class769.method4249(arg5, (byte) -77, arg2);
        for (int var12 = 0; var12 < arg2; var12++) {
            var10.method3568((byte) 118, var12, var9[var12]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V", line = 35)
    public static void method2059(int arg0) {
        if (arg0 >= -94) {
            field4581 = null;
        }
        field4581 = null;
    }
}
