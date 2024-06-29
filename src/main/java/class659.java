import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class659 extends class381 {

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Z")
    public volatile boolean field9407 = true;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public int field9405;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Leba;")
    public class253 field9404;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lac;")
    public class659 field9406;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()I", line = 4)
    public int method557() {
        return 255;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([III)V", line = 11)
    public final void method3712(int[] arg0, int arg1, int arg2) {
        if (this.field9407) {
            this.method549(arg0, arg1, arg2);
        } else {
            this.method526(arg2);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)V")
    public abstract void method549(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()I")
    public abstract int method545();

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public abstract void method526(int arg0);

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()Lac;")
    public abstract class659 method531();

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()Lac;")
    public abstract class659 method534();
}
