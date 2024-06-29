import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class329 implements class10 {

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    private int field4937 = -1;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lcg;")
    private class393 field4938;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public int field4932;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    private int field4933;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    private int field4936;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    private int field4935;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
    private static int[] field4934 = new int[1];

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
    public final void method70() {
        this.field4938.field5783.glFramebufferRenderbufferEXT(36160, this.field4937, 36161, 0);
        this.field4937 = -1;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()V")
    public final void method2025() {
        if (this.field4936 > 0) {
            this.field4938.method2477(this.field4936, this.field4935);
            this.field4936 = 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2025();
        super.finalize();
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public final void method2026(int arg0) {
        this.field4938.field5783.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field4936);
        this.field4937 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lcg;III)V")
    public class329(class393 arg0, int arg1, int arg2, int arg3) {
        this.field4938 = arg0;
        this.field4932 = arg2;
        this.field4939 = arg3;
        this.field4933 = arg1;
        opengl var5 = this.field4938.field5783;
        var5.glGenRenderbuffersEXT(1, field4934, 0);
        this.field4936 = field4934[0];
        var5.glBindRenderbufferEXT(36161, this.field4936);
        var5.glRenderbufferStorageEXT(36161, this.field4933, this.field4932, this.field4939);
        this.field4935 = this.field4939 * this.field4932 * this.field4938.method2494(this.field4933);
    }
}
