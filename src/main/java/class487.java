import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public abstract class class487 extends class69 {

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "Z")
    public volatile boolean field6718 = true;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public int field6719;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "Lqp;")
    public class487 field6721;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "Lnt;")
    public class790 field6720;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "([III)V", line = 10)
    public final void method2890(int[] arg0, int arg1, int arg2) {
        if (this.field6718) {
            this.method604(arg0, arg1, arg2);
        } else {
            this.method599(arg2);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "()I", line = 17)
    public int method1089() {
        return 255;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public abstract void method599(int arg0);

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([III)V")
    public abstract void method604(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "()Lqp;")
    public abstract class487 method614();

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "()Lqp;")
    public abstract class487 method615();

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "()I")
    public abstract int method613();
}
