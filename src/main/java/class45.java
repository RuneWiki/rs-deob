import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class45 implements class184 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    private int field579 = -1;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lmm;")
    private class357 field581;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[I")
    private static int[] field586 = new int[1];

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method375(int arg0) {
        this.field581.field4794.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field584);
        this.field579 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method376();
        super.finalize();
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
    public final void method376() {
        if (this.field584 > 0) {
            this.field581.method2156(this.field584, this.field583);
            this.field584 = 0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
    public final void method377() {
        this.field581.field4794.glFramebufferRenderbufferEXT(36160, this.field579, 36161, 0);
        this.field579 = -1;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lmm;III)V")
    public class45(class357 arg0, int arg1, int arg2, int arg3) {
        this.field581 = arg0;
        this.field580 = arg2;
        this.field582 = arg3;
        this.field585 = arg1;
        opengl var5 = this.field581.field4794;
        var5.glGenRenderbuffersEXT(1, field586, 0);
        this.field584 = field586[0];
        var5.glBindRenderbufferEXT(36161, this.field584);
        var5.glRenderbufferStorageEXT(36161, this.field585, this.field580, this.field582);
        this.field583 = this.field582 * this.field580 * this.field581.method2184(this.field585);
    }
}
