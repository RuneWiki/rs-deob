import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class471 implements class101 {

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    private int field6637 = -1;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lmi;")
    private class315 field6635;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public int field6631;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public int field6630;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    private int field6636;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    private int field6632;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    private int field6634;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[I")
    private static int[] field6633 = new int[1];

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()V")
    public final void method2773() {
        if (this.field6632 > 0) {
            this.field6635.method2000(this.field6632, this.field6634);
            this.field6632 = 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2773();
        super.finalize();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
    public final void method95() {
        this.field6635.field4445.glFramebufferRenderbufferEXT(36160, this.field6637, 36161, 0);
        this.field6637 = -1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public final void method2774(int arg0) {
        this.field6635.field4445.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field6632);
        this.field6637 = arg0;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lmi;III)V")
    public class471(class315 arg0, int arg1, int arg2, int arg3) {
        this.field6635 = arg0;
        this.field6631 = arg2;
        this.field6630 = arg3;
        this.field6636 = arg1;
        opengl var5 = this.field6635.field4445;
        var5.glGenRenderbuffersEXT(1, field6633, 0);
        this.field6632 = field6633[0];
        var5.glBindRenderbufferEXT(36161, this.field6632);
        var5.glRenderbufferStorageEXT(36161, this.field6636, this.field6631, this.field6630);
        this.field6634 = this.field6631 * this.field6630 * this.field6635.method1959(this.field6636);
    }
}
