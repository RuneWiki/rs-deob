import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class class88 extends class146 {

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Z")
    public volatile boolean field1414 = true;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Lqd;")
    public class162 field1413;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Lmi;")
    public class88 field1415;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([III)V")
    public final void method686(int[] arg0, int arg1, int arg2) {
        if (this.field1414) {
            this.method205(arg0, arg1, arg2);
        } else {
            this.method211(arg2);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()Lmi;")
    public abstract class88 method215();

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
    public abstract int method208();

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()I")
    public int method687() {
        return 255;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()Lmi;")
    public abstract class88 method193();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public abstract void method211(int arg0);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "([III)V")
    public abstract void method205(int[] arg0, int arg1, int arg2);
}
