import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class207 extends class25 {

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "Z")
    public volatile boolean field3520 = true;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Lwj;")
    public class207 field3519;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "Lmb;")
    public class98 field3521;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([III)V", line = 3)
    public final void method1440(int[] arg0, int arg1, int arg2) {
        if (this.field3520) {
            this.method479(arg0, arg1, arg2);
        } else {
            this.method478(arg2);
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "()I", line = 15)
    public int method1441() {
        return 255;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()Lwj;")
    public abstract class207 method477();

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "()I")
    public abstract int method482();

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "([III)V")
    public abstract void method479(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "()Lwj;")
    public abstract class207 method480();

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
    public abstract void method478(int arg0);
}
