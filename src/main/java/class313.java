import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class313 extends class154 {

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public int field5027;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lim;")
    public static class178 field5028;

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class313() {
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I)V")
    public class313(int arg0) {
        this.field5027 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method2114(byte arg0) {
        field5028 = null;
        if (arg0 != -43) {
            field5028 = null;
        }
    }
}
