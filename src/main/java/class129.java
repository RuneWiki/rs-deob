import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class class129 extends class12 {

    @OriginalMember(owner = "client!li", name = "x", descriptor = "Z")
    public volatile boolean field2383 = true;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "Lli;")
    public class129 field2380;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Lnj;")
    public class152 field2382;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([III)V")
    public abstract void method341(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!li", name = "b", descriptor = "([III)V")
    public final void method880(int[] arg0, int arg1, int arg2) {
        if (this.field2383) {
            this.method341(arg0, arg1, arg2);
        } else {
            this.method347(arg2);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public abstract void method347(int arg0);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()I")
    public int method881() {
        return 255;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()Lli;")
    public abstract class129 method345();

    @OriginalMember(owner = "client!li", name = "c", descriptor = "()I")
    public abstract int method348();

    @OriginalMember(owner = "client!li", name = "d", descriptor = "()Lli;")
    public abstract class129 method344();
}
