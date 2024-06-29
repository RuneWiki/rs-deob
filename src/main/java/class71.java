import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class71 extends class97 {

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Z")
    public volatile boolean field1787 = true;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Ls;")
    public class122 field1790;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lkb;")
    public class71 field1788;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()Lkb;")
    public abstract class71 method29();

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()I")
    public int method543() {
        return 255;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
    public abstract int method21();

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()Lkb;")
    public abstract class71 method23();

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V")
    public final void method544(int[] arg0, int arg1, int arg2) {
        if (this.field1787) {
            this.method19(arg0, arg1, arg2);
        } else {
            this.method20(arg2);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public abstract void method20(int arg0);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "([III)V")
    public abstract void method19(int[] arg0, int arg1, int arg2);
}
