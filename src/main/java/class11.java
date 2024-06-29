import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class11 extends class449 {

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Z")
    public volatile boolean field75 = true;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Loe;")
    public class11 field77;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Leq;")
    public class231 field74;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()I")
    public int method52() {
        return 255;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()Loe;")
    public abstract class11 method53();

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()I")
    public abstract int method54();

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "()Loe;")
    public abstract class11 method55();

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([III)V")
    public abstract void method56(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([III)V")
    public final void method57(int[] arg0, int arg1, int arg2) {
        if (this.field75) {
            this.method56(arg0, arg1, arg2);
        } else {
            this.method58(arg2);
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
    public abstract void method58(int arg0);
}
