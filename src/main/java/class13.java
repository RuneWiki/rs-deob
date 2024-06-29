import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class class13 extends class97 {

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Z")
    public volatile boolean field279 = true;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Lbc;")
    public class13 field282;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Lva;")
    public class189 field280;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
    public abstract int method71();

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([III)V")
    public abstract void method72(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()Lbc;")
    public abstract class13 method73();

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "([III)V")
    public final void method74(int[] arg0, int arg1, int arg2) {
        if (this.field279) {
            this.method72(arg0, arg1, arg2);
        } else {
            this.method75(arg2);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public abstract void method75(int arg0);

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()I")
    public int method76() {
        return 255;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()Lbc;")
    public abstract class13 method77();
}
