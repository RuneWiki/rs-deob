import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class264 implements class271 {

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    private int field3680 = -1;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "Lqi;")
    private class458 field3685;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public int field3684;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    private int field3682;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    private int field3678;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    private int field3679;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "[I")
    private static int[] field3683 = new int[1];

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 6)
    public final void method1668(int arg0) {
        this.field3685.field6330.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field3678);
        this.field3680 = arg0;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "()V", line = 16)
    public final void method1050() {
        this.field3685.field6330.glFramebufferRenderbufferEXT(36160, this.field3680, 36161, 0);
        this.field3680 = -1;
    }

    @OriginalMember(owner = "client!mn", name = "finalize", descriptor = "()V", line = 21)
    protected final void finalize() throws Throwable {
        this.method1669();
        super.finalize();
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "()V", line = 26)
    public final void method1669() {
        if (this.field3678 > 0) {
            this.field3685.method2641(this.field3678, this.field3679);
            this.field3678 = 0;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lqi;III)V", line = 39)
    public class264(class458 arg0, int arg1, int arg2, int arg3) {
        this.field3685 = arg0;
        this.field3684 = arg2;
        this.field3681 = arg3;
        this.field3682 = arg1;
        opengl var5 = this.field3685.field6330;
        var5.glGenRenderbuffersEXT(1, field3683, 0);
        this.field3678 = field3683[0];
        var5.glBindRenderbufferEXT(36161, this.field3678);
        var5.glRenderbufferStorageEXT(36161, this.field3682, this.field3684, this.field3681);
        this.field3679 = this.field3684 * this.field3681 * this.field3685.method2655(this.field3682);
    }
}
