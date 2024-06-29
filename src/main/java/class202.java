import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public abstract class class202 extends class104 {

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "Z")
    public volatile boolean field3614 = true;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public int field3612;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "Lii;")
    public class202 field3613;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "Llc;")
    public class238 field3615;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([III)V")
    public abstract void method503(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()I")
    public abstract int method501();

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()Lii;")
    public abstract class202 method511();

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "([III)V")
    public final void method1412(int[] arg0, int arg1, int arg2) {
        if (this.field3614) {
            this.method503(arg0, arg1, arg2);
        } else {
            this.method510(arg2);
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()Lii;")
    public abstract class202 method508();

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
    public abstract void method510(int arg0);

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()I")
    public int method757() {
        return 255;
    }
}
