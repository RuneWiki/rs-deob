import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class class204 extends class68 {

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "Z")
    public volatile boolean field3485 = true;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public int field3486;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "Lci;")
    public class188 field3487;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Lmi;")
    public class204 field3484;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "([III)V", line = 17)
    public final void method1434(int[] arg0, int arg1, int arg2) {
        if (this.field3485) {
            this.method564(arg0, arg1, arg2);
        } else {
            this.method568(arg2);
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()I", line = 24)
    public int method1435() {
        return 255;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()I")
    public abstract int method573();

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()Lmi;")
    public abstract class204 method569();

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()Lmi;")
    public abstract class204 method571();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([III)V")
    public abstract void method564(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public abstract void method568(int arg0);
}
