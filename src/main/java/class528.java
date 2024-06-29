import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class528 extends class657 {

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    private int field7433 = -1;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    private int field7434 = -1;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public int field7435;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public int field7439;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public int field7437;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field7432 = 0;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIZIII)V")
    public final void method3024(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field7438;
        if (!arg4) {
            this.method226(46);
        }
        super.field9210.method1505(-2, this);
        OpenGL.glCopyTexSubImage3D(super.field9226, 0, arg5, arg6, arg2, arg0, arg3, arg7, arg1);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lok;IIII[BI)V")
    public class528(class228 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field7435 = arg2;
        this.field7439 = arg3;
        this.field7437 = arg4;
        super.field9210.method1505(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field9226, 0, super.field9208, this.field7435, this.field7439, this.field7437, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3617((byte) 41, true);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V")
    public static final void method3025(byte arg0) {
        class112.method868(11, (byte) 66);
        ++field7440;
        int var1 = -103 % ((arg0 - -60) / 56);
        class648.method3597(-23888);
        System.gc();
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lok;IIII)V")
    public class528(class228 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field7437 = arg4;
        this.field7435 = arg2;
        this.field7439 = arg3;
        super.field9210.method1505(-2, this);
        OpenGL.glTexImage3Dub(super.field9226, 0, super.field9208, this.field7435, this.field7439, this.field7437, 0, class145.method1035(super.field9208, 6408), 5121, (byte[]) null, 0);
        this.method3617((byte) 41, true);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public final void method226(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field7434, this.field7433, super.field9226, 0, 0, 0);
        ++field7436;
        this.field7434 = arg0;
        this.field7433 = -1;
    }
}
