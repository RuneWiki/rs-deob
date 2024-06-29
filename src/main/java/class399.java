import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class399 {

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "Z")
    public static boolean field5277 = false;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Lda;")
    public static class420 field5278;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V", line = 6)
    public static void method2307(byte arg0) {
        field5278 = null;
        if (arg0 < 2) {
            method2307((byte) 104);
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)V", line = 17)
    public static final void method2308(byte arg0) {
        int var1 = -15 / ((-arg0 - 48) / 44);
        field5276++;
        class80 var2 = null;
        try {
            var2 = class775.method4233("2", (byte) -99);
            class234 var3 = new class234((class104.field1396 * 6) + 3);
            var3.method1491(-129, 1);
            var3.method1541(374, class104.field1396);
            for (int var4 = 0; var4 < class176.field2317.length; var4++) {
                if (class681.field8791[var4]) {
                    var3.method1541(374, var4);
                    var3.method1496(class176.field2317[var4], (byte) 116);
                }
            }
            var2.method500(var3.field3193, var3.field3133, (byte) 0, 0);
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method503((byte) 61);
            }
        } catch (Exception var5) {
        }
        class17.field168 = class502.method2786(-7114);
        class564.field7164 = false;
    }
}
