import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class18 extends class206 {

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Z")
    public volatile boolean field178 = true;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lwf;")
    public class18 field176;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Lre;")
    public class279 field177;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "()I", line = 8)
    public int method77() {
        return 255;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "([III)V", line = 15)
    public final void method78(int[] arg0, int arg1, int arg2) {
        if (this.field178) {
            this.method65(arg0, arg1, arg2);
        } else {
            this.method69(arg2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()Lwf;")
    public abstract class18 method74();

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()I")
    public abstract int method71();

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "()Lwf;")
    public abstract class18 method68();

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([III)V")
    public abstract void method65(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public abstract void method69(int arg0);
}
