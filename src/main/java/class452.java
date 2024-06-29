import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class class452 extends class43 {

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Z")
    public volatile boolean field6313 = true;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public int field6312;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lfn;")
    public class185 field6310;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Ltf;")
    public class452 field6311;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()I", line = 9)
    public int method482() {
        return 255;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "([III)V", line = 18)
    public final void method2799(int[] arg0, int arg1, int arg2) {
        if (this.field6313) {
            this.method112(arg0, arg1, arg2);
        } else {
            this.method108(arg2);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([III)V")
    public abstract void method112(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()Ltf;")
    public abstract class452 method114();

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()I")
    public abstract int method107();

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "()Ltf;")
    public abstract class452 method109();

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public abstract void method108(int arg0);
}
