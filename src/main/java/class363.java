import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class363 extends class45 {

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Z")
    public volatile boolean field5747 = true;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public int field5748;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "Loc;")
    public class219 field5750;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Ljk;")
    public class363 field5749;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([III)V", line = 7)
    public final void method2542(int[] arg0, int arg1, int arg2) {
        if (this.field5747) {
            this.method53(arg0, arg1, arg2);
        } else {
            this.method52(arg2);
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "()I", line = 17)
    public int method1052() {
        return 255;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()Ljk;")
    public abstract class363 method47();

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public abstract void method52(int arg0);

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "()Ljk;")
    public abstract class363 method43();

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "()I")
    public abstract int method46();

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "([III)V")
    public abstract void method53(int[] arg0, int arg1, int arg2);
}
