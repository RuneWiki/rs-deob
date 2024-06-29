import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public abstract class class417 extends class55 {

    @OriginalMember(owner = "client!mha", name = "l", descriptor = "Z")
    public volatile boolean field5874 = true;

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
    public int field5875;

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "Ljo;")
    public class338 field5876;

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "Lmha;")
    public class417 field5873;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
    public abstract void method1974(int arg0);

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "()Lmha;")
    public abstract class417 method1989();

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "()I")
    public int method2397() {
        return 255;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "([III)V")
    public final void method2398(int[] arg0, int arg1, int arg2) {
        if (this.field5874) {
            this.method1985(arg0, arg1, arg2);
        } else {
            this.method1974(arg2);
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "([III)V")
    public abstract void method1985(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "()I")
    public abstract int method1979();

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "()Lmha;")
    public abstract class417 method1991();
}
