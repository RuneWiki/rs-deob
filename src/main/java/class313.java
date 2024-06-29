import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class313 implements class232 {

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    private int field4578 = -1;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Lge;")
    private class104 field4580;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public int field4582;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    private int field4577;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    private int field4579;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    private int field4575;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "[I")
    private static int[] field4576 = new int[1];

    @OriginalMember(owner = "client!cl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2124();
        super.finalize();
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()V")
    public final void method2124() {
        if (this.field4579 > 0) {
            this.field4580.method901(this.field4579, this.field4575);
            this.field4579 = 0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public final void method2125(int arg0) {
        this.field4580.field1604.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field4579);
        this.field4578 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
    public final void method658() {
        this.field4580.field1604.glFramebufferRenderbufferEXT(36160, this.field4578, 36161, 0);
        this.field4578 = -1;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lge;III)V")
    public class313(class104 arg0, int arg1, int arg2, int arg3) {
        this.field4580 = arg0;
        this.field4581 = arg2;
        this.field4582 = arg3;
        this.field4577 = arg1;
        opengl var5 = this.field4580.field1604;
        var5.glGenRenderbuffersEXT(1, field4576, 0);
        this.field4579 = field4576[0];
        var5.glBindRenderbufferEXT(36161, this.field4579);
        var5.glRenderbufferStorageEXT(36161, this.field4577, this.field4581, this.field4582);
        this.field4575 = this.field4582 * this.field4581 * this.field4580.method874(this.field4577);
    }
}
