import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class62 extends class80 implements class122 {

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
    private int field843 = -1;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    private int field845 = -1;

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "Lht;")
    private class410 field847;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "Ljm;")
    public static class485 field850 = new class485(41, 4);

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public final void method43(int arg0) {
        field846++;
        OpenGL.glFramebufferRenderbufferEXT(this.field843, this.field845, 36161, 0);
        int var2 = 42 / ((-arg0 - 72) / 38);
        this.field845 = -1;
        this.field843 = -1;
    }

    @OriginalMember(owner = "client!ps", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method393(26);
        field844++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BII)V")
    public final void method391(byte arg0, int arg1, int arg2) {
        field842++;
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field839);
        this.field843 = arg1;
        this.field845 = arg2;
        int var4 = -59 / ((arg0 - 15) / 60);
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "(I)V")
    public static void method392(int arg0) {
        field850 = null;
        if (arg0 != 0) {
            field850 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "(I)V")
    public final void method393(int arg0) {
        field849++;
        if (arg0 <= 22) {
            this.field840 = -99;
        }
        if (this.field839 > 0) {
            this.field847.method2382((byte) -119, this.field848, this.field839);
            this.field839 = 0;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lht;III)V")
    public class62(class410 arg0, int arg1, int arg2, int arg3) {
        this.field841 = arg3;
        this.field847 = arg0;
        this.field840 = arg2;
        this.field851 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class430.field6267, 0);
        this.field839 = class430.field6267[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field839);
        OpenGL.glRenderbufferStorageEXT(36161, this.field851, this.field840, this.field841);
        this.field848 = this.field841 * this.field840 * this.field847.method2419(-17837, this.field851);
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lht;IIII)V")
    public class62(class410 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field847 = arg0;
        this.field851 = arg1;
        this.field840 = arg2;
        this.field841 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class430.field6267, 0);
        this.field839 = class430.field6267[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field839);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field851, this.field840, this.field841);
        this.field848 = this.field841 * this.field840 * this.field847.method2419(-17837, this.field851);
    }
}
