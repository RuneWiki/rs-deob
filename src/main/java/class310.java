import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class310 implements class95 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V", line = 3)
    public final void method384() {
        if (client.field5162) {
            class154.method1113(true);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 8)
    public final void method385(int arg0) {
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()V", line = 10)
    public final void method387() {
        if (client.field5162) {
            class154.method1113(false);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()I", line = 15)
    public final int method383() {
        return 0;
    }
}
