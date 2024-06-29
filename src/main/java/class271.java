import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class class271 extends class181 {

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "Z")
    public volatile boolean field4222 = true;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "Lgj;")
    public class271 field4223;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "Lnf;")
    public class53 field4221;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([III)V")
    public abstract void method262(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()I")
    public abstract int method275();

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()Lgj;")
    public abstract class271 method259();

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public abstract void method280(int arg0);

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "([III)V")
    public final void method1822(int[] arg0, int arg1, int arg2) {
        if (this.field4222) {
            this.method262(arg0, arg1, arg2);
        } else {
            this.method280(arg2);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()I")
    public int method238() {
        return 255;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()Lgj;")
    public abstract class271 method250();
}
