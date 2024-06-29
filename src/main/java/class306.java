import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class306 implements class268 {

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    private int field4202 = -1;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Lhj;")
    private class338 field4200;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public int field4206;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    private int field4199;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    private int field4205;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    private int field4201;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "[I")
    private static int[] field4204 = new int[1];

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public final void method1951(int arg0) {
        this.field4200.field4607.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field4205);
        this.field4202 = arg0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()V")
    public final void method333() {
        this.field4200.field4607.glFramebufferRenderbufferEXT(36160, this.field4202, 36161, 0);
        this.field4202 = -1;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()V")
    public final void method1952() {
        if (this.field4205 > 0) {
            this.field4200.method2163(this.field4205, this.field4201);
            this.field4205 = 0;
        }
    }

    @OriginalMember(owner = "client!um", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1952();
        super.finalize();
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lhj;III)V")
    public class306(class338 arg0, int arg1, int arg2, int arg3) {
        this.field4200 = arg0;
        this.field4206 = arg2;
        this.field4203 = arg3;
        this.field4199 = arg1;
        opengl var5 = this.field4200.field4607;
        var5.glGenRenderbuffersEXT(1, field4204, 0);
        this.field4205 = field4204[0];
        var5.glBindRenderbufferEXT(36161, this.field4205);
        var5.glRenderbufferStorageEXT(36161, this.field4199, this.field4206, this.field4203);
        this.field4201 = this.field4206 * this.field4203 * this.field4200.method2124(this.field4199);
    }
}
