import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class232 extends class261 {

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Z")
    public volatile boolean field3593 = true;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lkf;")
    public class168 field3592;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "Lsc;")
    public class232 field3590;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()I", line = 8)
    public int method1532() {
        return 255;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "([III)V", line = 11)
    public final void method1533(int[] arg0, int arg1, int arg2) {
        if (this.field3593) {
            this.method618(arg0, arg1, arg2);
        } else {
            this.method648(arg2);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([III)V")
    public abstract void method618(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()Lsc;")
    public abstract class232 method641();

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public abstract void method648(int arg0);

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()Lsc;")
    public abstract class232 method627();

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "()I")
    public abstract int method639();
}
