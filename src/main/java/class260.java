import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class260 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lpk;")
    private static class133 field3832 = new class133();

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
    public static final void method1671(boolean arg0) {
        if (!arg0) {
            return;
        }
        while (true) {
            class302 var1 = (class302) field3832.method1014(4095);
            if (var1 == null) {
                return;
            }
            var1.field4320.method101();
            var1.method1525((byte) 77);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLd;)V")
    public static final synchronized void method1672(byte arg0, class103 arg1) {
        class302 var2 = new class302();
        if (arg0 == 50) {
            var2.field4320 = arg1;
            field3832.method1015(false, var2);
        }
    }
}
