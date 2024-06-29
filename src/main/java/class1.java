import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class1 extends class81 {

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Z")
    public volatile boolean field2 = true;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Lwf;")
    public class1 field3;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Leg;")
    public class217 field4;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()I")
    public int method1() {
        return 255;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()I")
    public abstract int method2();

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "()Lwf;")
    public abstract class1 method3();

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([III)V")
    public final void method4(int[] arg0, int arg1, int arg2) {
        if (this.field2) {
            this.method7(arg0, arg1, arg2);
        } else {
            this.method6(arg2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "()Lwf;")
    public abstract class1 method5();

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V")
    public abstract void method6(int arg0);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "([III)V")
    public abstract void method7(int[] arg0, int arg1, int arg2);
}
