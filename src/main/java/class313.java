import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class class313 extends class529 {

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "Z")
    public volatile boolean field4909 = true;

    @OriginalMember(owner = "client!nu", name = "n", descriptor = "I")
    public int field4910;

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "Lnu;")
    public class313 field4911;

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "Lhf;")
    public class492 field4908;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([III)V")
    public abstract void method408(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "([III)V")
    public final void method2097(int[] arg0, int arg1, int arg2) {
        if (this.field4909) {
            this.method408(arg0, arg1, arg2);
        } else {
            this.method383(arg2);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "()I")
    public int method2098() {
        return 255;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
    public abstract void method383(int arg0);

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "()Lnu;")
    public abstract class313 method374();

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "()I")
    public abstract int method385();

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "()Lnu;")
    public abstract class313 method400();
}
