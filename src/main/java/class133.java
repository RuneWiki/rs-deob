import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class133 extends class435 {

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Z")
    public volatile boolean field1756 = true;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public int field1754;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lvb;")
    public class133 field1753;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Llu;")
    public class504 field1755;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "()I", line = 10)
    public int method805() {
        return 255;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([III)V", line = 13)
    public final void method806(int[] arg0, int arg1, int arg2) {
        if (this.field1756) {
            this.method572(arg0, arg1, arg2);
        } else {
            this.method580(arg2);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()I")
    public abstract int method594();

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public abstract void method580(int arg0);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "()Lvb;")
    public abstract class133 method602();

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "()Lvb;")
    public abstract class133 method596();

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "([III)V")
    public abstract void method572(int[] arg0, int arg1, int arg2);
}
