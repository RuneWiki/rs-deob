import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class127 extends class30 {

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Z")
    public volatile boolean field2267 = true;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lr;")
    public class127 field2269;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "Ldi;")
    public class223 field2270;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()Lr;")
    public abstract class127 method27();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()Lr;")
    public abstract class127 method24();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([III)V")
    public abstract void method12(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()I")
    public abstract int method37();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public abstract void method40(int arg0);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()I")
    public int method75() {
        return 255;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "([III)V")
    public final void method882(int[] arg0, int arg1, int arg2) {
        if (this.field2267) {
            this.method12(arg0, arg1, arg2);
        } else {
            this.method40(arg2);
        }
    }
}
