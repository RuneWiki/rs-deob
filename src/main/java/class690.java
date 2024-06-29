import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class690 extends class710 {

    @OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
    private int field9424 = -1;

    @OriginalMember(owner = "client!sp", name = "C", descriptor = "I")
    private int field9432 = -1;

    @OriginalMember(owner = "client!sp", name = "B", descriptor = "I")
    public int field9431;

    @OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
    public int field9433;

    @OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
    public int field9434;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "[I")
    public static int[] field9429 = new int[50];

    @OriginalMember(owner = "client!sp", name = "A", descriptor = "I")
    public static int field9430 = 0;

    @OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!sp", name = "x", descriptor = "I")
    public static int field9427;

    @OriginalMember(owner = "client!sp", name = "y", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!sp", name = "w", descriptor = "Lfg;")
    public static class393 field9426;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIBIIII)V", line = 5)
    public final void method3758(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field9425;
        super.field9933.method3388(this, false);
        OpenGL.glCopyTexSubImage3D(super.field9928, 0, arg7, arg1, arg4, arg0, arg2, arg6, arg5);
        int var9 = -37 % ((44 - arg3) / 60);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lji;IIII[BI)V", line = 23)
    public class690(class622 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field9431 = arg3;
        this.field9433 = arg4;
        this.field9434 = arg2;
        super.field9933.method3388(this, false);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field9928, 0, super.field9923, this.field9434, this.field9431, this.field9433, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3905(true, true);
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lji;IIII)V", line = 42)
    public class690(class622 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field9434 = arg2;
        this.field9433 = arg4;
        this.field9431 = arg3;
        super.field9933.method3388(this, false);
        OpenGL.glTexImage3Dub(super.field9928, 0, super.field9923, this.field9434, this.field9431, this.field9433, 0, class149.method1100(super.field9923, 6409), 5121, (byte[]) null, 0);
        this.method3905(true, true);
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)V", line = 55)
    public static void method3759(int arg0) {
        field9429 = null;
        field9426 = null;
        if (arg0 != 30199) {
            field9426 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ldt;I)Z", line = 68)
    public static final boolean method3760(class576 arg0, int arg1) {
        ++field9428;
        if (arg1 != -17291) {
            field9429 = null;
        }
        if (arg0 == null) {
            return false;
        } else if (!arg0.field7840) {
            return false;
        } else if (!arg0.method3147(class706.field9829, (byte) 126)) {
            return false;
        } else if (class33.field491.method39((long) arg0.field7810, 31750) != null) {
            return false;
        } else {
            return class434.field5588.method39((long) arg0.field7831, 31750) == null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V", line = 105)
    public final void method1502(byte arg0) {
        if (arg0 < 33) {
            this.field9433 = 22;
        }
        OpenGL.glFramebufferTexture3DEXT(this.field9424, this.field9432, super.field9928, 0, 0, 0);
        ++field9427;
        this.field9424 = -1;
        this.field9432 = -1;
    }
}
