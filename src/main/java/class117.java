import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class117 extends class130 {

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Z")
    public volatile boolean field1687 = true;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public int field1686;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lbe;")
    public class117 field1685;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Lvg;")
    public class255 field1684;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([III)V")
    public final void method706(int[] arg0, int arg1, int arg2) {
        if (this.field1687) {
            this.method688(arg0, arg1, arg2);
        } else {
            this.method696(arg2);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()I")
    public int method707() {
        return 255;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()Lbe;")
    public abstract class117 method699();

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()I")
    public abstract int method689();

    @OriginalMember(owner = "client!be", name = "b", descriptor = "([III)V")
    public abstract void method688(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public abstract void method696(int arg0);

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()Lbe;")
    public abstract class117 method695();
}
