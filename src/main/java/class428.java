import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class428 implements class92 {

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    private int field6336 = -1;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Lih;")
    private class330 field6334;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public int field6339;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public int field6340;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    private int field6333;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    private int field6338;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    private int field6335;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "[I")
    private static int[] field6337 = new int[1];

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()V")
    public final void method2736() {
        if (this.field6338 > 0) {
            this.field6334.method2070(this.field6338, this.field6335);
            this.field6338 = 0;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
    public final void method570() {
        this.field6334.field4741.glFramebufferRenderbufferEXT(36160, this.field6336, 36161, 0);
        this.field6336 = -1;
    }

    @OriginalMember(owner = "client!wk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2736();
        super.finalize();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public final void method2737(int arg0) {
        this.field6334.field4741.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field6338);
        this.field6336 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lih;III)V")
    public class428(class330 arg0, int arg1, int arg2, int arg3) {
        this.field6334 = arg0;
        this.field6339 = arg2;
        this.field6340 = arg3;
        this.field6333 = arg1;
        opengl var5 = this.field6334.field4741;
        var5.glGenRenderbuffersEXT(1, field6337, 0);
        this.field6338 = field6337[0];
        var5.glBindRenderbufferEXT(36161, this.field6338);
        var5.glRenderbufferStorageEXT(36161, this.field6333, this.field6339, this.field6340);
        this.field6335 = this.field6340 * this.field6339 * this.field6334.method2055(this.field6333);
    }
}
