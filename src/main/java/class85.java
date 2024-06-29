import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class85 extends class151 {

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Z")
    public volatile boolean field1521 = true;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Lfd;")
    public class281 field1520;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "Lcb;")
    public class85 field1522;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()I", line = 10)
    public int method539() {
        return 255;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "([III)V", line = 15)
    public final void method653(int[] arg0, int arg1, int arg2) {
        if (this.field1521) {
            this.method445(arg0, arg1, arg2);
        } else {
            this.method455(arg2);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([III)V")
    public abstract void method445(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()Lcb;")
    public abstract class85 method452();

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()I")
    public abstract int method447();

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()Lcb;")
    public abstract class85 method453();

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public abstract void method455(int arg0);
}
