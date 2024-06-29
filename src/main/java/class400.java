import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public abstract class class400 extends class362 {

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "Z")
    public volatile boolean field5903 = true;

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "I")
    public int field5905;

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "Ljba;")
    public class400 field5904;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "Lji;")
    public class610 field5906;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "([III)V")
    public final void method2501(int[] arg0, int arg1, int arg2) {
        if (this.field5903) {
            this.method92(arg0, arg1, arg2);
        } else {
            this.method89(arg2);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "()Ljba;")
    public abstract class400 method103();

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "([III)V")
    public abstract void method92(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "()Ljba;")
    public abstract class400 method69();

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
    public abstract void method89(int arg0);

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "()I")
    public int method2502() {
        return 255;
    }

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "()I")
    public abstract int method111();
}
