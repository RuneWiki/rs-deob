import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public abstract class class124 extends class116 {

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "Z")
    public volatile boolean field2794 = true;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lrf;")
    public class124 field2791;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Lha;")
    public class50 field2792;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()I")
    public int method576() {
        return 255;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([III)V")
    public final void method946(int[] arg0, int arg1, int arg2) {
        if (this.field2794) {
            this.method495(arg0, arg1, arg2);
        } else {
            this.method474(arg2);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public abstract void method474(int arg0);

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()Lrf;")
    public abstract class124 method467();

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()I")
    public abstract int method483();

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "()Lrf;")
    public abstract class124 method470();

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "([III)V")
    public abstract void method495(int[] arg0, int arg1, int arg2);
}
