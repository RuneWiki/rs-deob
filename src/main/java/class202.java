import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class202 extends class109 {

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Z")
    public volatile boolean field4036 = true;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lrh;")
    public class169 field4033;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Lve;")
    public class202 field4035;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()I")
    public abstract int method707();

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()Lve;")
    public abstract class202 method682();

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "()Lve;")
    public abstract class202 method704();

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "()I")
    public int method686() {
        return 255;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([III)V")
    public abstract void method705(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public abstract void method694(int arg0);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "([III)V")
    public final void method1339(int[] arg0, int arg1, int arg2) {
        if (this.field4036) {
            this.method705(arg0, arg1, arg2);
        } else {
            this.method694(arg2);
        }
    }
}
