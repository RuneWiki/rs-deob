import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class84 implements class446 {

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    private int field945 = -1;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lpo;")
    private class332 field940;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    private int field943;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    private int field944;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "[I")
    private static int[] field947 = new int[1];

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public final void method458(int arg0) {
        this.field940.field4752.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field944);
        this.field945 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "()V")
    public final void method459() {
        if (this.field944 > 0) {
            this.field940.method2096(this.field944, this.field946);
            this.field944 = 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method459();
        super.finalize();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
    public final void method460() {
        this.field940.field4752.glFramebufferRenderbufferEXT(36160, this.field945, 36161, 0);
        this.field945 = -1;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lpo;III)V")
    public class84(class332 arg0, int arg1, int arg2, int arg3) {
        this.field940 = arg0;
        this.field941 = arg2;
        this.field942 = arg3;
        this.field943 = arg1;
        opengl var5 = this.field940.field4752;
        var5.glGenRenderbuffersEXT(1, field947, 0);
        this.field944 = field947[0];
        var5.glBindRenderbufferEXT(36161, this.field944);
        var5.glRenderbufferStorageEXT(36161, this.field943, this.field941, this.field942);
        this.field946 = this.field942 * this.field941 * this.field940.method2098(this.field943);
    }
}
