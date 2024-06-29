import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class120 extends class47 {

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Z")
    public volatile boolean field2942 = true;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Lre;")
    public class120 field2940;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "Llc;")
    public class78 field2943;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public abstract void method105(int arg0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()I")
    public abstract int method102();

    @OriginalMember(owner = "client!re", name = "a", descriptor = "([III)V")
    public abstract void method95(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()Lre;")
    public abstract class120 method100();

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()Lre;")
    public abstract class120 method106();

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()I")
    public int method648() {
        return 255;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "([III)V")
    public final void method1007(int[] arg0, int arg1, int arg2) {
        if (this.field2942) {
            this.method95(arg0, arg1, arg2);
        } else {
            this.method105(arg2);
        }
    }
}
