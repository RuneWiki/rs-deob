import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class86 extends class70 {

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Z")
    public volatile boolean field1940 = true;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public int field1941;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "Lfa;")
    public class37 field1943;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Lmc;")
    public class86 field1942;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([III)V")
    public abstract void method81(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()I")
    public int method80() {
        return 255;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()Lmc;")
    public abstract class86 method70();

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()Lmc;")
    public abstract class86 method86();

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "([III)V")
    public final void method684(int[] arg0, int arg1, int arg2) {
        if (this.field1940) {
            this.method81(arg0, arg1, arg2);
        } else {
            this.method64(arg2);
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V")
    public abstract void method64(int arg0);

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()I")
    public abstract int method49();
}
