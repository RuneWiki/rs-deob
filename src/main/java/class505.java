import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class505 {

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "Lji;")
    public static class611 field6853 = new class611(1350);

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "Llga;")
    public static class712 field6856 = new class712(78, 11);

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2814(int arg0) {
        class29[] var1 = class8.field52;
        synchronized (class8.field52) {
            if (arg0 != 1350) {
                return;
            }
            int var2 = 0;
            while (true) {
                if (class8.field52.length <= var2) {
                    break;
                }
                class8.field52[var2] = new class29();
                class669.field9308[var2] = 0;
                var2++;
            }
        }
        field6852++;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V", line = 29)
    public static void method2815(byte arg0) {
        field6856 = null;
        if (arg0 == -119) {
            field6853 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BIIII)V", line = 42)
    public static final void method2816(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > arg3) {
            class168.method980(arg1, class300.field4036[arg4], arg3, arg2, (byte) 65);
        } else {
            class168.method980(arg1, class300.field4036[arg4], arg2, arg3, (byte) -127);
        }
        if (arg0 < -66) {
            field6854++;
        }
    }
}
