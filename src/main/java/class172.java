import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class172 extends class80 {

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Z")
    public volatile boolean field2820 = true;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public int field2822;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lkj;")
    public class127 field2821;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "La;")
    public class172 field2823;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()I", line = 6)
    public int method1059() {
        return 255;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "([III)V", line = 10)
    public final void method1247(int[] arg0, int arg1, int arg2) {
        if (this.field2820) {
            this.method474(arg0, arg1, arg2);
        } else {
            this.method439(arg2);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()La;")
    public abstract class172 method459();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([III)V")
    public abstract void method474(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    public abstract void method439(int arg0);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
    public abstract int method451();

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()La;")
    public abstract class172 method463();
}
