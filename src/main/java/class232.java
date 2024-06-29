import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class232 extends class28 {

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Z")
    public volatile boolean field3024 = true;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "Lwi;")
    public class232 field3021;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Lcu;")
    public class663 field3022;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([III)V", line = 9)
    public final void method1428(int[] arg0, int arg1, int arg2) {
        if (this.field3024) {
            this.method312(arg0, arg1, arg2);
        } else {
            this.method305(arg2);
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "()I", line = 23)
    public int method1429() {
        return 255;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "()Lwi;")
    public abstract class232 method322();

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()I")
    public abstract int method332();

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public abstract void method305(int arg0);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "([III)V")
    public abstract void method312(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "()Lwi;")
    public abstract class232 method304();
}
