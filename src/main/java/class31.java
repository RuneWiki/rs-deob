import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public abstract class class31 extends class476 {

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "Z")
    public volatile boolean field470 = true;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "Llt;")
    public class198 field469;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "Loo;")
    public class31 field468;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "()I")
    public abstract int method225();

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "()Loo;")
    public abstract class31 method226();

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "()I")
    public int method227() {
        return 255;
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "()Loo;")
    public abstract class31 method228();

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([III)V")
    public final void method229(int[] arg0, int arg1, int arg2) {
        if (this.field470) {
            this.method231(arg0, arg1, arg2);
        } else {
            this.method230(arg2);
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
    public abstract void method230(int arg0);

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "([III)V")
    public abstract void method231(int[] arg0, int arg1, int arg2);
}
