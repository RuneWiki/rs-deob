import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class117 {

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
    public static int[] field1460 = new int[13];

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field1461 = 0;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[Lnm;")
    public static class496[] field1458;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZJ)V")
    public static final void method820(boolean arg0, long arg1) {
        if (arg0) {
            method821(-123);
        }
        field1462++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class389.method2383(arg1 - 1L, 1);
            class389.method2383(1L, 1);
        } else {
            class389.method2383(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method821(int arg0) {
        if (arg0 <= 95) {
            field1460 = null;
        }
        field1460 = null;
        field1458 = null;
    }
}
