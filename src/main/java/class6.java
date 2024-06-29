import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class6 implements class194 {

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    private int field93 = -1;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "Lao;")
    private class157 field94;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
    private static int[] field95 = new int[1];

    @OriginalMember(owner = "client!to", name = "a", descriptor = "()V")
    public final void method44() {
        this.field94.field1927.glFramebufferRenderbufferEXT(36160, this.field93, 36161, 0);
        this.field93 = -1;
    }

    @OriginalMember(owner = "client!to", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method45();
        super.finalize();
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "()V")
    public final void method45() {
        if (this.field90 > 0) {
            this.field94.method978(this.field90, this.field96);
            this.field90 = 0;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public final void method46(int arg0) {
        this.field94.field1927.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field90);
        this.field93 = arg0;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lao;III)V")
    public class6(class157 arg0, int arg1, int arg2, int arg3) {
        this.field94 = arg0;
        this.field92 = arg2;
        this.field91 = arg3;
        this.field89 = arg1;
        opengl var5 = this.field94.field1927;
        var5.glGenRenderbuffersEXT(1, field95, 0);
        this.field90 = field95[0];
        var5.glBindRenderbufferEXT(36161, this.field90);
        var5.glRenderbufferStorageEXT(36161, this.field89, this.field92, this.field91);
        this.field96 = this.field92 * this.field91 * this.field94.method1006(this.field89);
    }
}
