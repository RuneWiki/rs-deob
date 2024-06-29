import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class class344 extends class86 {

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Z")
    public volatile boolean field4988 = true;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field4986;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Lcb;")
    public class344 field4989;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Lkc;")
    public class82 field4987;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()I", line = 10)
    public int method2075() {
        return 255;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "([III)V", line = 13)
    public final void method2076(int[] arg0, int arg1, int arg2) {
        if (this.field4988) {
            this.method651(arg0, arg1, arg2);
        } else {
            this.method650(arg2);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([III)V")
    public abstract void method651(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public abstract void method650(int arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
    public abstract int method644();

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()Lcb;")
    public abstract class344 method645();

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()Lcb;")
    public abstract class344 method642();
}
