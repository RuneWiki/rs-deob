import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class40 extends class184 {

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Z")
    public volatile boolean field552 = true;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Lfn;")
    public class32 field550;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Lec;")
    public class40 field553;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "([III)V", line = 6)
    public final void method273(int[] arg0, int arg1, int arg2) {
        if (this.field552) {
            this.method271(arg0, arg1, arg2);
        } else {
            this.method272(arg2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()I", line = 20)
    public int method274() {
        return 255;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()Lec;")
    public abstract class40 method270();

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([III)V")
    public abstract void method271(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public abstract void method272(int arg0);

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()I")
    public abstract int method275();

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "()Lec;")
    public abstract class40 method276();
}
