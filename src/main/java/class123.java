import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class class123 extends class154 {

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Z")
    public volatile boolean field2203 = true;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lri;")
    public class123 field2201;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lcv;")
    public class595 field2200;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()Lri;")
    public abstract class123 method355();

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([III)V")
    public final void method1069(int[] arg0, int arg1, int arg2) {
        if (this.field2203) {
            this.method356(arg0, arg1, arg2);
        } else {
            this.method351(arg2);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()I")
    public int method1070() {
        return 255;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "()I")
    public abstract int method354();

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "()Lri;")
    public abstract class123 method362();

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public abstract void method351(int arg0);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "([III)V")
    public abstract void method356(int[] arg0, int arg1, int arg2);
}
