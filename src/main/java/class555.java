import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public abstract class class555 extends class425 {

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "Z")
    public volatile boolean field7862 = true;

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "I")
    public int field7865;

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "Lgd;")
    public class313 field7864;

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "Loea;")
    public class555 field7863;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "()I")
    public abstract int method193();

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "([III)V")
    public abstract void method224(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "()I")
    public int method1623() {
        return 255;
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "()Loea;")
    public abstract class555 method227();

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "()Loea;")
    public abstract class555 method233();

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
    public abstract void method204(int arg0);

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "([III)V")
    public final void method3168(int[] arg0, int arg1, int arg2) {
        if (this.field7862) {
            this.method224(arg0, arg1, arg2);
        } else {
            this.method204(arg2);
        }
    }
}
