import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class83 extends class67 {

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "Z")
    public volatile boolean field1858 = true;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Lde;")
    public class27 field1855;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Lmc;")
    public class83 field1857;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([III)V")
    public abstract void method37(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()I")
    public abstract int method21();

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()Lmc;")
    public abstract class83 method42();

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V")
    public abstract void method27(int arg0);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "([III)V")
    public final void method642(int[] arg0, int arg1, int arg2) {
        if (this.field1858) {
            this.method37(arg0, arg1, arg2);
        } else {
            this.method27(arg2);
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()I")
    public int method17() {
        return 255;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()Lmc;")
    public abstract class83 method32();
}
