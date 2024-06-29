import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class class68 extends class217 {

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Z")
    public volatile boolean field1005 = true;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lhd;")
    public class120 field1007;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "Lri;")
    public class68 field1008;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([III)V", line = 7)
    public final void method572(int[] arg0, int arg1, int arg2) {
        if (this.field1005) {
            this.method576(arg0, arg1, arg2);
        } else {
            this.method571(arg2);
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "()I", line = 16)
    public int method574() {
        return 255;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()Lri;")
    public abstract class68 method570();

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public abstract void method571(int arg0);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()I")
    public abstract int method573();

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "()Lri;")
    public abstract class68 method575();

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "([III)V")
    public abstract void method576(int[] arg0, int arg1, int arg2);
}
