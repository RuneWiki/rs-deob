import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class251 extends class202 {

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Z")
    public volatile boolean field3986 = true;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public int field3985;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Lfa;")
    public class251 field3984;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lof;")
    public class267 field3987;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
    public abstract void method168(int arg0);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()Lfa;")
    public abstract class251 method153();

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([III)V")
    public abstract void method150(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "([III)V")
    public final void method1713(int[] arg0, int arg1, int arg2) {
        if (this.field3986) {
            this.method150(arg0, arg1, arg2);
        } else {
            this.method168(arg2);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()Lfa;")
    public abstract class251 method154();

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()I")
    public abstract int method178();

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()I")
    public int method183() {
        return 255;
    }
}
