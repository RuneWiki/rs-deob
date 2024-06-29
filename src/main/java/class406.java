import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class406 extends class205 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)J", line = 4)
    public final long method1327(int arg0) {
        return arg0 > -125 ? 90L : System.nanoTime();
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 12)
    public class406() {
        System.nanoTime();
    }
}
