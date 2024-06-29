import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public abstract class class216 extends class65 {

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "Z")
    public volatile boolean field3562 = true;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "Laca;")
    public class216 field3564;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "Lnw;")
    public class441 field3561;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "([III)V", line = 7)
    public final void method1554(int[] arg0, int arg1, int arg2) {
        if (this.field3562) {
            this.method563(arg0, arg1, arg2);
        } else {
            this.method568(arg2);
        }
    }

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "()I", line = 17)
    public int method558() {
        return 255;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "()Laca;")
    public abstract class216 method532();

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "([III)V")
    public abstract void method563(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "()I")
    public abstract int method552();

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "()Laca;")
    public abstract class216 method531();

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
    public abstract void method568(int arg0);
}
