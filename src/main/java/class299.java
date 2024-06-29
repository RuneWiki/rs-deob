import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class class299 extends class108 {

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "Z")
    public volatile boolean field3908 = true;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public int field3907;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "Lgv;")
    public class299 field3905;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "Lpb;")
    public class366 field3906;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "()Lgv;")
    public abstract class299 method259();

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "()I")
    public abstract int method258();

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "([III)V")
    public final void method1835(int[] arg0, int arg1, int arg2) {
        if (this.field3908) {
            this.method252(arg0, arg1, arg2);
        } else {
            this.method254(arg2);
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "()I")
    public int method1351() {
        return 255;
    }

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "()Lgv;")
    public abstract class299 method249();

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "([III)V")
    public abstract void method252(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public abstract void method254(int arg0);
}
