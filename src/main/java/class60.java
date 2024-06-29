import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class60 {

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "Ljw;")
    public static class581 field821 = new class581(28, 8);

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public static int field823 = -2;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)V", line = 7)
    public static final void method419(int arg0, int arg1, int arg2) {
        class243 var3 = class626.field8501[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class745.method4126(var3.field3270);
        class745.method4126(var3.field3269);
        if (var3.field3270 != null) {
            var3.field3270 = null;
        }
        if (var3.field3269 != null) {
            var3.field3269 = null;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V", line = 26)
    public static void method420(byte arg0) {
        if (arg0 != -27) {
            field823 = 36;
        }
        field821 = null;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIILie;)V", line = 37)
    public static final void method421(int arg0, int arg1, int arg2, class6 arg3) {
        class243 var4 = class501.method2895(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field3280 = arg3;
        int var5 = class538.field7317 == class528.field7227 ? 1 : 0;
        if (arg3.method19(-116)) {
            if (arg3.method21(0)) {
                arg3.field2252 = class563.field7549[var5];
                class563.field7549[var5] = arg3;
                return;
            }
            arg3.field2252 = class308.field4450[var5];
            class308.field4450[var5] = arg3;
            class768.field10591 = true;
            return;
        }
        arg3.field2252 = class503.field6961[var5];
        class503.field6961[var5] = arg3;
    }
}
