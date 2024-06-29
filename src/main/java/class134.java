import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class134 extends class67 {

    @OriginalMember(owner = "client!og", name = "u", descriptor = "Z")
    public volatile boolean field2790 = true;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "Log;")
    public class134 field2792;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "Lvb;")
    public class192 field2791;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()I")
    public abstract int method654();

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()I")
    public int method859() {
        return 255;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "()Log;")
    public abstract class134 method651();

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([III)V")
    public abstract void method653(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "([III)V")
    public final void method860(int[] arg0, int arg1, int arg2) {
        if (this.field2790) {
            this.method653(arg0, arg1, arg2);
        } else {
            this.method652(arg2);
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
    public abstract void method652(int arg0);

    @OriginalMember(owner = "client!og", name = "d", descriptor = "()Log;")
    public abstract class134 method655();
}
