import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class262 extends class171 {

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Z")
    public volatile boolean field3956 = true;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public int field3959;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Ljk;")
    public class260 field3958;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Lta;")
    public class262 field3957;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([III)V")
    public final void method1727(int[] arg0, int arg1, int arg2) {
        if (this.field3956) {
            this.method361(arg0, arg1, arg2);
        } else {
            this.method356(arg2);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()I")
    public int method746() {
        return 255;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "([III)V")
    public abstract void method361(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()Lta;")
    public abstract class262 method355();

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
    public abstract void method356(int arg0);

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()Lta;")
    public abstract class262 method358();

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()I")
    public abstract int method362();
}
