import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class315 extends class172 {

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "J")
    public long field4868;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field4867 = 0;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "Lrn;")
    public static class18 field4865;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2225(boolean arg0) {
        if (!arg0) {
            field4865 = (class18) null;
        }
        field4865 = null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(III)Lbb;", line = 25)
    public static final class44 method2226(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        return var3 == null || var3.field5062 == null ? null : var3.field5062;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 32)
    public class315() {
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(J)V", line = 34)
    public class315(long arg0) {
        this.field4868 = arg0;
    }
}
