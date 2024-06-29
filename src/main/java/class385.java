import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class385 implements class248 {

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    private int field5266 = -1;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lh;")
    private class327 field5268;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public int field5263;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public int field5270;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    private int field5269;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    private int field5265;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    private int field5267;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[I")
    private static int[] field5264 = new int[1];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public final void method2398(int arg0) {
        this.field5268.field4363.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field5265);
        this.field5266 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2399();
        super.finalize();
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
    public final void method2399() {
        if (this.field5265 > 0) {
            this.field5268.method2067(this.field5265, this.field5267);
            this.field5265 = 0;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
    public final void method878() {
        this.field5268.field4363.glFramebufferRenderbufferEXT(36160, this.field5266, 36161, 0);
        this.field5266 = -1;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lh;III)V")
    public class385(class327 arg0, int arg1, int arg2, int arg3) {
        this.field5268 = arg0;
        this.field5263 = arg2;
        this.field5270 = arg3;
        this.field5269 = arg1;
        opengl var5 = this.field5268.field4363;
        var5.glGenRenderbuffersEXT(1, field5264, 0);
        this.field5265 = field5264[0];
        var5.glBindRenderbufferEXT(36161, this.field5265);
        var5.glRenderbufferStorageEXT(36161, this.field5269, this.field5263, this.field5270);
        this.field5267 = this.field5270 * this.field5263 * this.field5268.method2062(this.field5269);
    }
}
