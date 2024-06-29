import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class class156 extends class90 {

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "Z")
    public volatile boolean field3218 = true;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public int field3219;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "Lqh;")
    public class156 field3221;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "Lr;")
    public class157 field3220;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()Lqh;")
    public abstract class156 method278();

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()I")
    public abstract int method284();

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([III)V")
    public final void method997(int[] arg0, int arg1, int arg2) {
        if (this.field3218) {
            this.method277(arg0, arg1, arg2);
        } else {
            this.method283(arg2);
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "()I")
    public int method998() {
        return 255;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "([III)V")
    public abstract void method277(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "()Lqh;")
    public abstract class156 method276();

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V")
    public abstract void method283(int arg0);
}
