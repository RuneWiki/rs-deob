import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class189 extends class208 {

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Z")
    public volatile boolean field3031 = true;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Lci;")
    public class189 field3030;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Lbe;")
    public class286 field3032;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([III)V", line = 7)
    public final void method1308(int[] arg0, int arg1, int arg2) {
        if (this.field3031) {
            this.method364(arg0, arg1, arg2);
        } else {
            this.method369(arg2);
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "()I", line = 19)
    public int method735() {
        return 255;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()Lci;")
    public abstract class189 method374();

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "()I")
    public abstract int method368();

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "()Lci;")
    public abstract class189 method365();

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "([III)V")
    public abstract void method364(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
    public abstract void method369(int arg0);
}
