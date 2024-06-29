import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public abstract class class3 extends class508 {

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "Z")
    public volatile boolean field23 = true;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "Lnn;")
    public class170 field20;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "Lar;")
    public class3 field21;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "()I", line = 4)
    public int method14() {
        return 255;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "([III)V", line = 15)
    public final void method19(int[] arg0, int arg1, int arg2) {
        if (this.field23) {
            this.method17(arg0, arg1, arg2);
        } else {
            this.method18(arg2);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "()I")
    public abstract int method13();

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "()Lar;")
    public abstract class3 method15();

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "()Lar;")
    public abstract class3 method16();

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([III)V")
    public abstract void method17(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public abstract void method18(int arg0);
}
