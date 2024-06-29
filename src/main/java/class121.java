import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class121 extends class69 {

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "Z")
    public volatile boolean field2262 = true;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "Lwj;")
    public class121 field2261;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "Lte;")
    public class195 field2264;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()I")
    public int method865() {
        return 255;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "()Lwj;")
    public abstract class121 method651();

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([III)V")
    public abstract void method649(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "()Lwj;")
    public abstract class121 method656();

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "()I")
    public abstract int method655();

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public abstract void method652(int arg0);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "([III)V")
    public final void method959(int[] arg0, int arg1, int arg2) {
        if (this.field2262) {
            this.method649(arg0, arg1, arg2);
        } else {
            this.method652(arg2);
        }
    }
}
