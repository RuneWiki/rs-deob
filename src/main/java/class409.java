import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class409 {

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Lrl;")
    public static class672 field6301 = new class672(60, -1);

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lpca;")
    public static class665 field6303 = null;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field6304 = 0;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZIZ)V", line = 5)
    public static final void method2614(boolean arg0, int arg1, boolean arg2) {
        field6302++;
        class527 var3 = class605.method3523(arg0, (byte) 122, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field7693.length; var4++) {
            var3.field7693[var4] = -1;
            var3.field7697[var4] = 0;
        }
        if (arg2) {
            method2615(55);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 32)
    public static void method2615(int arg0) {
        if (arg0 == 1) {
            field6301 = null;
            field6303 = null;
        }
    }
}
