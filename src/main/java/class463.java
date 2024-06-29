import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class class463 extends class263 {

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
    public volatile boolean field5756 = true;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public int field5757;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Lfp;")
    public class302 field5758;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lmi;")
    public class463 field5755;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()Lmi;")
    public abstract class463 method1487();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([III)V")
    public abstract void method1493(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
    public int method2534() {
        return 255;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()Lmi;")
    public abstract class463 method1496();

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "([III)V")
    public final void method2535(int[] arg0, int arg1, int arg2) {
        if (this.field5756) {
            this.method1493(arg0, arg1, arg2);
        } else {
            this.method1486(arg2);
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()I")
    public abstract int method1495();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public abstract void method1486(int arg0);
}
