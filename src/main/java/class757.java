import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class757 {

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "D")
    public static double field10561;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public static int field10562;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public static int field10563;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZI)V")
    public static final void method4213(int arg0, boolean arg1, int arg2) {
        if (arg0 != -1) {
            return;
        }
        field10563++;
        if (arg1) {
            class103 var3 = class752.method4186(260, class101.field1357, class449.field6285);
            var3.field1379.method3423(arg2, 1571862888);
            class27.method104(false, var3);
        } else {
            class498.method2783(class365.field4818, arg2, -1);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILji;)V")
    public static final void method4214(int arg0, class611 arg1) {
        if (arg0 <= 64) {
            return;
        }
        for (int var2 = 0; var2 < class725.field10129; var2++) {
            int var3 = arg1.method3396(1689622712);
            int var4 = arg1.method3402((byte) 127);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class318.field4284[var3] != null) {
                class318.field4284[var3].field697 = var4;
            }
        }
        field10562++;
    }
}
