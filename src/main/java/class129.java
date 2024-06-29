import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class class129 extends class99 {

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Z")
    public volatile boolean field2960 = true;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Lra;")
    public class119 field2959;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "Lsd;")
    public class129 field2961;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public abstract void method114(int arg0);

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
    public abstract int method133();

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()Lsd;")
    public abstract class129 method122();

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()I")
    public int method419() {
        return 255;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "()Lsd;")
    public abstract class129 method102();

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([III)V")
    public abstract void method132(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "([III)V")
    public final void method1006(int[] arg0, int arg1, int arg2) {
        if (this.field2960) {
            this.method132(arg0, arg1, arg2);
        } else {
            this.method114(arg2);
        }
    }
}
