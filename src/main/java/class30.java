import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public abstract class class30 extends class235 {

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "Z")
    public volatile boolean field546 = true;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "Lcc;")
    public class259 field547;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Lhk;")
    public class30 field548;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public abstract void method54(int arg0);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([III)V")
    public final void method281(int[] arg0, int arg1, int arg2) {
        if (this.field546) {
            this.method56(arg0, arg1, arg2);
        } else {
            this.method54(arg2);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()Lhk;")
    public abstract class30 method72();

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()I")
    public int method210() {
        return 255;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "([III)V")
    public abstract void method56(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "()Lhk;")
    public abstract class30 method88();

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()I")
    public abstract int method80();
}
