import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class206 extends class62 {

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Z")
    public volatile boolean field3494 = true;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Lvh;")
    public class135 field3495;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "Lj;")
    public class206 field3497;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([III)V")
    public final void method1422(int[] arg0, int arg1, int arg2) {
        if (this.field3494) {
            this.method391(arg0, arg1, arg2);
        } else {
            this.method394(arg2);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public abstract void method394(int arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()Lj;")
    public abstract class206 method411();

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()Lj;")
    public abstract class206 method395();

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I")
    public abstract int method396();

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
    public int method399() {
        return 255;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "([III)V")
    public abstract void method391(int[] arg0, int arg1, int arg2);
}
