import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class221 extends class80 {

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Z")
    public volatile boolean field3779 = true;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lwd;")
    public class221 field3780;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lki;")
    public class55 field3777;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([III)V")
    public final void method1411(int[] arg0, int arg1, int arg2) {
        if (this.field3779) {
            this.method277(arg0, arg1, arg2);
        } else {
            this.method302(arg2);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()I")
    public abstract int method285();

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "([III)V")
    public abstract void method277(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "()Lwd;")
    public abstract class221 method278();

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "()I")
    public int method1412() {
        return 255;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "()Lwd;")
    public abstract class221 method308();

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public abstract void method302(int arg0);
}
