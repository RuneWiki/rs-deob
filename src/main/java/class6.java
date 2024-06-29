import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lnba;")
    public static class268 field57 = new class268();

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
    public static int[] field58 = new int[1];

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method36(int arg0) {
        field57 = null;
        field58 = null;
        if (arg0 > -121) {
            method36(-38);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(JILpu;IZIII)V")
    public static final void method37(long arg0, int arg1, class522 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field60++;
        class599.field8465 = 10000;
        class313.field4623 = 1;
        class594.field8392 = arg5;
        class676.field9576 = arg6;
        if (arg1 != -13723) {
            method38(87, 52, -32);
        }
        class685.field9652 = arg7;
        class596.field8425 = arg3;
        class208.field2929 = arg2;
        class196.field2800 = arg0;
        class666.field9405 = arg4;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Lsu;")
    public static final class191 method38(int arg0, int arg1, int arg2) {
        if (arg1 > -65) {
            method37(52L, 23, null, 85, false, -22, 57, 78);
        }
        field59++;
        class191 var3 = (class191) class229.field3594.method1405((long) arg0 << 32 | (long) arg2, (byte) -95);
        if (var3 == null) {
            var3 = new class191(arg0, arg2);
            class229.field3594.method1403((byte) -18, var3, var3.field9386);
        }
        return var3;
    }
}
