import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class151 extends class630 {

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLit;)Lit;")
    public final class674 method1119(byte arg0, class674 arg1) {
        if (arg0 != 42) {
            this.method1119((byte) -4, null);
        }
        return new class616(arg1.field9471, arg1.method835(true), arg1.field9470);
    }
}
