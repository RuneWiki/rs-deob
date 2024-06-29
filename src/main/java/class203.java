import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public abstract class class203 extends class125 {

    @OriginalMember(owner = "client!el", name = "y", descriptor = "Z")
    public volatile boolean field3540 = true;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "Lua;")
    public class114 field3539;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "Lel;")
    public class203 field3538;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()Lel;")
    public abstract class203 method154();

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([III)V")
    public abstract void method159(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()I")
    public int method1369() {
        return 255;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()I")
    public abstract int method144();

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public abstract void method177(int arg0);

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()Lel;")
    public abstract class203 method140();

    @OriginalMember(owner = "client!el", name = "b", descriptor = "([III)V")
    public final void method1370(int[] arg0, int arg1, int arg2) {
        if (this.field3540) {
            this.method159(arg0, arg1, arg2);
        } else {
            this.method177(arg2);
        }
    }
}
