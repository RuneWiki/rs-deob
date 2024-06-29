import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public abstract class class404 extends class401 {

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Z")
    public volatile boolean field5675 = true;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public int field5674;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Luba;")
    public class395 field5672;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Ljc;")
    public class404 field5673;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()I", line = 3)
    public int method2357() {
        return 255;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "([III)V", line = 14)
    public final void method2358(int[] arg0, int arg1, int arg2) {
        if (this.field5675) {
            this.method1469(arg0, arg1, arg2);
        } else {
            this.method1460(arg2);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([III)V")
    public abstract void method1469(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()Ljc;")
    public abstract class404 method1457();

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "()Ljc;")
    public abstract class404 method1466();

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public abstract void method1460(int arg0);

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "()I")
    public abstract int method1465();
}
