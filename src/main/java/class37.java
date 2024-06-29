import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class class37 extends class499 {

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Z")
    public volatile boolean field509 = true;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "Ldm;")
    public class37 field510;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "Lou;")
    public class429 field508;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()I")
    public abstract int method238();

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public abstract void method239(int arg0);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([III)V")
    public abstract void method240(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()I")
    public int method241() {
        return 255;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "()Ldm;")
    public abstract class37 method242();

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "([III)V")
    public final void method243(int[] arg0, int arg1, int arg2) {
        if (this.field509) {
            this.method240(arg0, arg1, arg2);
        } else {
            this.method239(arg2);
        }
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "()Ldm;")
    public abstract class37 method244();
}
