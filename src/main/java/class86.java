import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class class86 extends class383 {

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "Z")
    public volatile boolean field1078 = true;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "Lgk;")
    public class333 field1077;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "Lhu;")
    public class86 field1079;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public abstract void method688(int arg0);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "()Lhu;")
    public abstract class86 method689();

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "()I")
    public int method690() {
        return 255;
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "()I")
    public abstract int method691();

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "()Lhu;")
    public abstract class86 method692();

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "([III)V")
    public abstract void method693(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "([III)V")
    public final void method694(int[] arg0, int arg1, int arg2) {
        if (this.field1078) {
            this.method693(arg0, arg1, arg2);
        } else {
            this.method688(arg2);
        }
    }
}
