import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class53 extends class188 {

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Z")
    public volatile boolean field611 = true;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lbe;")
    public class329 field614;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lqd;")
    public class53 field613;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([III)V", line = 5)
    public final void method319(int[] arg0, int arg1, int arg2) {
        if (this.field611) {
            this.method323(arg0, arg1, arg2);
        } else {
            this.method318(arg2);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()I", line = 14)
    public int method320() {
        return 255;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()Lqd;")
    public abstract class53 method317();

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public abstract void method318(int arg0);

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "()Lqd;")
    public abstract class53 method321();

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()I")
    public abstract int method322();

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "([III)V")
    public abstract void method323(int[] arg0, int arg1, int arg2);
}
