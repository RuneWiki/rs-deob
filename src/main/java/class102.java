import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class102 extends class147 {

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Z")
    public volatile boolean field1643 = true;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "Lqb;")
    public class102 field1644;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Lik;")
    public class257 field1642;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([III)V", line = 6)
    public final void method742(int[] arg0, int arg1, int arg2) {
        if (this.field1643) {
            this.method427(arg0, arg1, arg2);
        } else {
            this.method443(arg2);
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()I", line = 14)
    public int method432() {
        return 255;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()I")
    public abstract int method435();

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()Lqb;")
    public abstract class102 method448();

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "([III)V")
    public abstract void method427(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "()Lqb;")
    public abstract class102 method470();

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public abstract void method443(int arg0);
}
