import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class548 {

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "I")
    private int field7704;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    private int field7694;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
    private int field7697;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
    private int field7698;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
    private int field7702;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
    private int field7709;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
    private int field7700;

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
    private int field7707;

    @OriginalMember(owner = "client!nu", name = "n", descriptor = "I")
    private int field7706;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    private int field7696;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "Lrw;")
    public static class703 field7699 = new class703(9, 2);

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "Lnea;")
    public static class664 field7710 = new class664(54, 6);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIIIIZII)V", line = 6)
    public final void method3096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        this.field7694 = arg9;
        field7693++;
        this.field7704 = arg4;
        this.field7697 = arg10;
        this.field7698 = arg0 * arg0;
        this.field7706 = this.field7704 + arg5;
        this.field7700 = this.field7697 + arg1;
        this.field7702 = this.field7704 + arg2;
        this.field7696 = this.field7697 + arg6;
        this.field7709 = this.field7694 + arg3;
        this.field7707 = this.field7694 + arg7;
        if (!arg8) {
            method3101(null, -35);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V", line = 28)
    public static void method3097(byte arg0) {
        field7699 = null;
        field7710 = null;
        int var1 = 119 / ((arg0 - 61) / 37);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BILok;Ljava/lang/String;)Lkfa;", line = 43)
    public static final class558 method3098(byte arg0, int arg1, class228 arg2, String arg3) {
        if (arg0 >= -92) {
            method3097((byte) -105);
        }
        field7708++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class388.field5763, 0);
        if (class388.field5763[0] == 0) {
            if (class388.field5763[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class388.field5763, 1);
            if (class388.field5763[1] > 1) {
                byte[] var6 = new byte[class388.field5763[1]];
                OpenGL.glGetInfoLogARB(var4, class388.field5763[1], class388.field5763, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class388.field5763[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class558(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V", line = 87)
    public static final void method3099(byte arg0) {
        class535.field7508 = -1;
        field7695++;
        class674.field9547 = -1;
        class581.field8187 = 0;
        if (arg0 > -27) {
            field7710 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BIII)Z", line = 100)
    public final boolean method3100(byte arg0, int arg1, int arg2, int arg3) {
        field7703++;
        if (arg1 < this.field7696 || this.field7700 < arg1) {
            return false;
        } else if (this.field7709 > arg2 || this.field7707 < arg2) {
            return false;
        } else if (this.field7706 <= arg3 && this.field7702 >= arg3) {
            int var5 = arg1 - this.field7697;
            if (arg0 == -125) {
                int var6 = arg3 - this.field7704;
                return var5 * var5 + (var6 * var6) < this.field7698;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lpu;I)V", line = 126)
    public static final void method3101(class522 arg0, int arg1) {
        field7705++;
        if (arg1 == 0) {
            class88.field1473 = arg0;
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 143)
    public class548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field7704 = arg2;
        this.field7694 = arg1;
        this.field7697 = arg0;
        this.field7698 = arg3 * arg3;
        this.field7702 = this.field7704 + arg9;
        this.field7709 = this.field7694 + arg6;
        this.field7700 = this.field7697 + arg5;
        this.field7707 = this.field7694 + arg7;
        this.field7706 = this.field7704 + arg8;
        this.field7696 = this.field7697 + arg4;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLjava/lang/Object;II)[B", line = 164)
    public static final byte[] method3102(boolean arg0, Object arg1, int arg2, int arg3) {
        if (!arg0) {
            field7699 = null;
        }
        field7701++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var4 = (byte[]) arg1;
            return class41.method459(41, arg3, arg2, var4);
        } else if (arg1 instanceof class70) {
            class70 var5 = (class70) arg1;
            return var5.method684(arg3, arg2, -1);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
