import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class class461 extends class513 {

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Z")
    public volatile boolean field6463 = true;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Lmda;")
    public class241 field6464;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Lmi;")
    public class461 field6461;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()I")
    public int method2026() {
        return 255;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([III)V")
    public abstract void method1228(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()Lmi;")
    public abstract class461 method1229();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public abstract void method1225(int arg0);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "([III)V")
    public final void method2718(int[] arg0, int arg1, int arg2) {
        if (this.field6463) {
            this.method1228(arg0, arg1, arg2);
        } else {
            this.method1225(arg2);
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()Lmi;")
    public abstract class461 method1221();

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()I")
    public abstract int method1223();
}
