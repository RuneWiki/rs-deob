import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class29 extends class97 {

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Z")
    public volatile boolean field371 = true;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lbo;")
    public class159 field369;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lwf;")
    public class29 field368;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()I")
    public int method165() {
        return 255;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()I")
    public abstract int method166();

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([III)V")
    public abstract void method167(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
    public abstract void method168(int arg0);

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "()Lwf;")
    public abstract class29 method169();

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "()Lwf;")
    public abstract class29 method170();

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "([III)V")
    public final void method171(int[] arg0, int arg1, int arg2) {
        if (this.field371) {
            this.method167(arg0, arg1, arg2);
        } else {
            this.method168(arg2);
        }
    }
}
