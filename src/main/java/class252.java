import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class252 extends class320 {

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Z")
    public volatile boolean field4059 = true;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Lmj;")
    public class252 field4058;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Lbd;")
    public class333 field4061;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()I", line = 5)
    public int method1757() {
        return 255;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "([III)V", line = 16)
    public final void method1758(int[] arg0, int arg1, int arg2) {
        if (this.field4059) {
            this.method49(arg0, arg1, arg2);
        } else {
            this.method53(arg2);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([III)V")
    public abstract void method49(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "()I")
    public abstract int method50();

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()Lmj;")
    public abstract class252 method52();

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "()Lmj;")
    public abstract class252 method54();

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
    public abstract void method53(int arg0);
}
