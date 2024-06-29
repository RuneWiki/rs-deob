import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class class648 extends class627 {

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "Z")
    public volatile boolean field8912 = true;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public int field8911;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "Lcc;")
    public class178 field8910;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "Lrn;")
    public class648 field8913;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "()I", line = 5)
    public int method3505() {
        return 255;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([III)V", line = 9)
    public final void method3506(int[] arg0, int arg1, int arg2) {
        if (this.field8912) {
            this.method670(arg0, arg1, arg2);
        } else {
            this.method661(arg2);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "()I")
    public abstract int method671();

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public abstract void method661(int arg0);

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "([III)V")
    public abstract void method670(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "()Lrn;")
    public abstract class648 method662();

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "()Lrn;")
    public abstract class648 method673();
}
