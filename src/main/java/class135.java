import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class135 extends class69 {

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Z")
    public volatile boolean field2257 = true;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Lok;")
    public class135 field2256;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lkc;")
    public class31 field2254;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()I")
    public int method273() {
        return 255;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()I")
    public abstract int method263();

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "()Lok;")
    public abstract class135 method262();

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([III)V")
    public final void method949(int[] arg0, int arg1, int arg2) {
        if (this.field2257) {
            this.method284(arg0, arg1, arg2);
        } else {
            this.method265(arg2);
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
    public abstract void method265(int arg0);

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "([III)V")
    public abstract void method284(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "()Lok;")
    public abstract class135 method245();
}
