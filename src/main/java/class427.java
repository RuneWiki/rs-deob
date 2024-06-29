import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class class427 extends class108 {

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "Z")
    public volatile boolean field6239 = true;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public int field6238;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "Lko;")
    public class239 field6236;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "Lps;")
    public class427 field6237;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([III)V", line = 6)
    public final void method2550(int[] arg0, int arg1, int arg2) {
        if (this.field6239) {
            this.method38(arg0, arg1, arg2);
        } else {
            this.method48(arg2);
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "()I", line = 16)
    public int method1989() {
        return 255;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public abstract void method48(int arg0);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "()Lps;")
    public abstract class427 method45();

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "()I")
    public abstract int method39();

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "([III)V")
    public abstract void method38(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "()Lps;")
    public abstract class427 method36();
}
