import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class class264 extends class165 {

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Z")
    public volatile boolean field4282 = true;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public int field4281;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "Luc;")
    public class216 field4284;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "Lsm;")
    public class264 field4283;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()I", line = 3)
    public int method1886() {
        return 255;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "([III)V", line = 7)
    public final void method1887(int[] arg0, int arg1, int arg2) {
        if (this.field4282) {
            this.method116(arg0, arg1, arg2);
        } else {
            this.method127(arg2);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "([III)V")
    public abstract void method116(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "()Lsm;")
    public abstract class264 method125();

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "()I")
    public abstract int method126();

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "()Lsm;")
    public abstract class264 method119();

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
    public abstract void method127(int arg0);
}
