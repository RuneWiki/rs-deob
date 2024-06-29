import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class56 extends class41 {

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "Z")
    public volatile boolean field860 = true;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "Lm;")
    public class34 field858;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "Lpf;")
    public class56 field857;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()I")
    public int method405() {
        return 255;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()Lpf;")
    public abstract class56 method406();

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([III)V")
    public abstract void method407(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "()I")
    public abstract int method408();

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "()Lpf;")
    public abstract class56 method409();

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "([III)V")
    public final void method410(int[] arg0, int arg1, int arg2) {
        if (this.field860) {
            this.method407(arg0, arg1, arg2);
        } else {
            this.method411(arg2);
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
    public abstract void method411(int arg0);
}
