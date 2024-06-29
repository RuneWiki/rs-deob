import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class186 extends class103 {

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Z")
    public volatile boolean field3177 = true;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Luh;")
    public class186 field3180;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Lfa;")
    public class68 field3178;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()Luh;")
    public abstract class186 method414();

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()Luh;")
    public abstract class186 method408();

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([III)V")
    public final void method1235(int[] arg0, int arg1, int arg2) {
        if (this.field3177) {
            this.method425(arg0, arg1, arg2);
        } else {
            this.method404(arg2);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "()I")
    public abstract int method395();

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "([III)V")
    public abstract void method425(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
    public abstract void method404(int arg0);

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "()I")
    public int method430() {
        return 255;
    }
}
