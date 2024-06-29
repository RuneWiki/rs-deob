import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class659 extends class559 {

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    private int field8778 = -1;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
    private int field8776 = -1;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
    public int field8774;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    public int field8780;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public int field8779;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "[I")
    public static int[] field8777 = new int[2];

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V", line = 6)
    public static void method3663(boolean arg0) {
        if (!arg0) {
            field8770 = 55;
        }
        field8777 = null;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)I", line = 20)
    public static final int method3664(byte arg0) {
        ++field8772;
        if (class96.field1322 == null) {
            return 0;
        } else {
            if (arg0 != -39) {
                field8777 = null;
            }
            return class96.field1322.length * 2;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)J", line = 36)
    public static final long method3665(int arg0, int arg1) {
        ++field8771;
        return arg0 != -1 ? -114L : (long) (arg1 - -11745) * 86400000L;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ldw;IIII)V", line = 47)
    public class659(class664 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field8774 = arg2;
        this.field8780 = arg3;
        this.field8779 = arg4;
        super.field7765.method3681(this, 0);
        OpenGL.glTexImage3Dub(super.field7768, 0, super.field7777, this.field8774, this.field8780, this.field8779, 0, class434.method2679(true, super.field7777), 5121, (byte[]) null, 0);
        this.method3292(3, true);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIII)V", line = 67)
    public final void method3666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field7765.method3681(this, 0);
        if (arg7 != -20156) {
            this.method3666(87, -22, -25, -18, -38, -43, -34, 55);
        }
        ++field8775;
        OpenGL.glCopyTexSubImage3D(super.field7768, 0, arg3, arg1, arg6, arg4, arg0, arg5, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 80)
    public final void method2235(int arg0) {
        ++field8773;
        OpenGL.glFramebufferTexture3DEXT(this.field8778, this.field8776, super.field7768, arg0, 0, 0);
        this.field8778 = -1;
        this.field8776 = -1;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ldw;IIII[BI)V", line = 94)
    public class659(class664 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field8774 = arg2;
        this.field8780 = arg3;
        this.field8779 = arg4;
        super.field7765.method3681(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field7768, 0, super.field7777, this.field8774, this.field8780, this.field8779, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3292(3, true);
    }
}
