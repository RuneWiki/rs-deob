import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class class69 extends class329 {

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "Z")
    public volatile boolean field939 = true;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "Lbo;")
    public class243 field941;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "Lpn;")
    public class69 field940;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "()Lpn;")
    public abstract class69 method409();

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public abstract void method410(int arg0);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([III)V")
    public final void method411(int[] arg0, int arg1, int arg2) {
        if (this.field939) {
            this.method412(arg0, arg1, arg2);
        } else {
            this.method410(arg2);
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "([III)V")
    public abstract void method412(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "()Lpn;")
    public abstract class69 method413();

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "()I")
    public int method414() {
        return 255;
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "()I")
    public abstract int method415();
}
