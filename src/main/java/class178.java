import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class178 extends class71 {

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "Z")
    public volatile boolean field2884 = true;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lba;")
    public class178 field2882;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Lcm;")
    public class205 field2885;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()I", line = 5)
    public int method967() {
        return 255;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "([III)V", line = 18)
    public final void method1238(int[] arg0, int arg1, int arg2) {
        if (this.field2884) {
            this.method284(arg0, arg1, arg2);
        } else {
            this.method288(arg2);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public abstract void method288(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([III)V")
    public abstract void method284(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()I")
    public abstract int method282();

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()Lba;")
    public abstract class178 method287();

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()Lba;")
    public abstract class178 method281();
}
