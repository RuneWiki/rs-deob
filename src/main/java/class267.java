import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class267 extends class132 implements class199 {

    @OriginalMember(owner = "client!fda", name = "z", descriptor = "I")
    private int field3738 = -1;

    @OriginalMember(owner = "client!fda", name = "M", descriptor = "I")
    private int field3749 = -1;

    @OriginalMember(owner = "client!fda", name = "L", descriptor = "I")
    private int field3748;

    @OriginalMember(owner = "client!fda", name = "J", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!fda", name = "H", descriptor = "Lgi;")
    private class583 field3744;

    @OriginalMember(owner = "client!fda", name = "I", descriptor = "I")
    public int field3745;

    @OriginalMember(owner = "client!fda", name = "G", descriptor = "I")
    private int field3743;

    @OriginalMember(owner = "client!fda", name = "A", descriptor = "I")
    private int field3739;

    @OriginalMember(owner = "client!fda", name = "E", descriptor = "Lcba;")
    public static class471 field3742 = new class471(31, 0);

    @OriginalMember(owner = "client!fda", name = "N", descriptor = "Ldv;")
    public static class566 field3750 = new class566(14, 8);

    @OriginalMember(owner = "client!fda", name = "O", descriptor = "Lbi;")
    public static class408 field3751 = new class408(0);

    @OriginalMember(owner = "client!fda", name = "y", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!fda", name = "C", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!fda", name = "D", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!fda", name = "K", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIZ)V")
    public final void method1747(int arg0, int arg1, boolean arg2) {
        field3737++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.field3743);
        this.field3749 = arg0;
        this.field3738 = arg1;
        if (arg2) {
            this.field3739 = 87;
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)V")
    public final void method1748(int arg0) {
        field3741++;
        if (this.field3743 > 0) {
            this.field3744.method3336(this.field3743, this.field3739, 118);
            this.field3743 = 0;
        }
        if (arg0 >= -110) {
            field3750 = null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(I)V")
    public static void method1749(int arg0) {
        field3751 = null;
        field3742 = null;
        int var1 = -42 / ((-arg0 - 29) / 37);
        field3750 = null;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
    public final void method1220(byte arg0) {
        field3740++;
        OpenGL.glFramebufferRenderbufferEXT(this.field3749, this.field3738, 36161, 0);
        if (arg0 == 73) {
            this.field3749 = -1;
            this.field3738 = -1;
        }
    }

    @OriginalMember(owner = "client!fda", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3747++;
        this.method1748(-113);
        super.finalize();
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lgi;III)V")
    public class267(class583 arg0, int arg1, int arg2, int arg3) {
        this.field3748 = arg1;
        this.field3746 = arg3;
        this.field3744 = arg0;
        this.field3745 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class177.field2533, 0);
        this.field3743 = class177.field2533[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3743);
        OpenGL.glRenderbufferStorageEXT(36161, this.field3748, this.field3745, this.field3746);
        this.field3739 = this.field3746 * this.field3745 * this.field3744.method3367(3553, this.field3748);
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lgi;IIII)V")
    public class267(class583 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3746 = arg3;
        this.field3748 = arg1;
        this.field3744 = arg0;
        this.field3745 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class177.field2533, 0);
        this.field3743 = class177.field2533[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3743);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field3748, this.field3745, this.field3746);
        this.field3739 = this.field3746 * this.field3745 * this.field3744.method3367(3553, this.field3748);
    }
}
