import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class384 extends class421 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Loh;B)Loh;", line = 4)
    public final class22 method2294(class22 arg0, byte arg1) {
        if (arg1 != 13) {
            this.method2294((class22) null, (byte) -1);
        }
        return new class88(arg0.field371, arg0.method185(-112), arg0.field373);
    }
}
