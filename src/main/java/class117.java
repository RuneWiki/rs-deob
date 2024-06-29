import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class class117 extends class141 {

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "Z")
    public volatile boolean field2987 = true;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public int field2986;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "Lqf;")
    public class117 field2988;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "Lwd;")
    public class152 field2989;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()I")
    public abstract int method447();

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()Lqf;")
    public abstract class117 method468();

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()I")
    public int method484() {
        return 255;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([III)V")
    public abstract void method463(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "([III)V")
    public final void method1020(int[] arg0, int arg1, int arg2) {
        if (this.field2987) {
            this.method463(arg0, arg1, arg2);
        } else {
            this.method470(arg2);
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "()Lqf;")
    public abstract class117 method454();

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public abstract void method470(int arg0);
}
