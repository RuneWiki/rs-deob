import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class545 extends class411 {

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    private int field7653;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "Lms;")
    public static class52 field7652;

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Leq;II[BI)V", line = 3)
    public class545(class357 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field7653 = arg2;
        super.field5807.method2120(-1, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field5794, 0, super.field5809, this.field7653, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2433(true, -95);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZB)V", line = 20)
    public final void method3093(boolean arg0, byte arg1) {
        if (arg1 != 60) {
            method3094(-18, 8, 43);
        }
        ++field7650;
        super.field5807.method2120(arg1 ^ -61, this);
        OpenGL.glTexParameteri(super.field5794, 10242, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 36)
    public final void method369(boolean arg0) {
        ++field7649;
        if (!arg0) {
            this.method3093(true, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)Z", line = 47)
    public static final boolean method3094(int arg0, int arg1, int arg2) {
        if (arg2 != 29946) {
            return false;
        } else {
            ++field7646;
            return (65536 & arg0) != 0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILkha;ZIIJI)V", line = 59)
    public static final void method3095(int arg0, class687 arg1, boolean arg2, int arg3, int arg4, long arg5, int arg6) {
        if (arg3 == 13842) {
            ++field7648;
            class394.method2349(arg1, 0, arg6, arg0, -122, arg5, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V", line = 70)
    public static void method3096(byte arg0) {
        field7652 = null;
        if (arg0 != 69) {
            field7652 = null;
        }
    }
}
