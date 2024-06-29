import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class class409 extends class381 {

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "Z")
    public volatile boolean field5725 = true;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public int field5723;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Lnj;")
    public class230 field5726;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Lmi;")
    public class409 field5724;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()Lmi;")
    public abstract class409 method690();

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
    public int method710() {
        return 255;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()Lmi;")
    public abstract class409 method708();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([III)V")
    public final void method2531(int[] arg0, int arg1, int arg2) {
        if (this.field5725) {
            this.method713(arg0, arg1, arg2);
        } else {
            this.method683(arg2);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "([III)V")
    public abstract void method713(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()I")
    public abstract int method687();

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public abstract void method683(int arg0);
}
