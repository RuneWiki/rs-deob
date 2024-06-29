import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class77 extends class185 {

    @OriginalMember(owner = "client!mba", name = "W", descriptor = "F")
    public float field1031;

    @OriginalMember(owner = "client!mba", name = "Y", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!mba", name = "T", descriptor = "F")
    public float field1028;

    @OriginalMember(owner = "client!mba", name = "R", descriptor = "Z")
    public boolean field1026;

    @OriginalMember(owner = "client!mba", name = "O", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!mba", name = "Q", descriptor = "[C")
    public static char[] field1025 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!mba", name = "U", descriptor = "F")
    public static float field1029;

    @OriginalMember(owner = "client!mba", name = "P", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!mba", name = "S", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!mba", name = "V", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!mba", name = "X", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Leq;IIIII)V", line = 3)
    public class77(class357 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1031 = (float) arg3 / (float) arg5;
        this.field1033 = arg2;
        this.field1028 = (float) arg2 / (float) arg4;
        this.field1026 = false;
        this.field1023 = arg3;
        this.method1188(10242, false, false);
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Leq;IIIII[BI)V", line = 19)
    public class77(class357 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1033 = arg2;
        this.field1023 = arg3;
        this.method1187(arg2, arg3, true, arg6, 0, 3317, arg7, 0, 0, 0);
        this.field1026 = false;
        this.field1031 = (float) arg3 / (float) arg5;
        this.field1028 = (float) arg2 / (float) arg4;
        this.method1188(10242, false, false);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lde;", line = 34)
    public static final class401 method558(Throwable arg0, String arg1) {
        ++field1024;
        class401 var2;
        if (!(arg0 instanceof class401)) {
            var2 = new class401(arg0, arg1);
        } else {
            var2 = (class401) arg0;
            var2.field5554 = var2.field5554 + ' ' + arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Leq;IIIIZ[BI)V", line = 52)
    public class77(class357 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field1023 = arg4;
        if (super.field5794 == 34037) {
            this.field1028 = (float) arg3;
            this.field1026 = false;
            this.field1031 = (float) arg4;
        } else {
            this.field1028 = this.field1031 = 1.0F;
            this.field1026 = true;
        }
        this.field1033 = arg3;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Leq;IIIZ[III)V", line = 75)
    public class77(class357 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field1033 = arg2;
        if (~super.field5794 == -34038) {
            this.field1026 = false;
            this.field1031 = (float) arg3;
            this.field1028 = (float) arg2;
        } else {
            this.field1026 = true;
            this.field1028 = this.field1031 = 1.0F;
        }
        this.field1023 = arg3;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZZII)V", line = 96)
    public static final void method559(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        class201.method1252(arg4, arg1, arg0, arg3, class303.field3903.length + -1, arg2, arg3 ^ 103);
        ++field1032;
        class374.field5248 = 0;
        class426.field6053 = null;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Leq;BILjava/lang/String;)Lci;", line = 106)
    public static final class692 method560(class357 arg0, byte arg1, int arg2, String arg3) {
        ++field1027;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class707.field9963, 0);
        if (arg1 < 24) {
            method560((class357) null, (byte) 28, -98, (String) null);
        }
        if (class707.field9963[0] == 0) {
            if (~class707.field9963[0] == -1) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class707.field9963, 1);
            if (class707.field9963[1] > 1) {
                byte[] var6 = new byte[class707.field9963[1]];
                OpenGL.glGetInfoLogARB(var4, class707.field9963[1], class707.field9963, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (~class707.field9963[0] == -1) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class692(arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Leq;IIIIIIZ)V", line = 147)
    public class77(class357 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1026 = false;
        this.field1023 = arg4;
        this.field1033 = arg3;
        this.field1031 = (float) arg4 / (float) arg6;
        this.field1028 = (float) arg3 / (float) arg5;
        this.method1188(10242, false, false);
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Leq;IIIIIZ)V", line = 160)
    public class77(class357 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field5794 != 34037) {
            this.field1026 = true;
            this.field1028 = this.field1031 = 1.0F;
        } else {
            this.field1031 = (float) arg5;
            this.field1028 = (float) arg4;
            this.field1026 = false;
        }
        this.field1023 = arg5;
        this.field1033 = arg4;
    }

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "(B)V", line = 184)
    public static void method561(byte arg0) {
        if (arg0 == 100) {
            field1025 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Leq;IIII[I)V", line = 194)
    public class77(class357 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1023 = arg2;
        this.field1033 = arg1;
        this.method1180(0, 0, arg5, 0, arg2, true, 0, arg1, 0);
        this.field1026 = false;
        this.field1028 = (float) arg1 / (float) arg3;
        this.field1031 = (float) arg2 / (float) arg4;
        this.method1188(10242, false, false);
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(IZ)Z", line = 209)
    public static final boolean method562(int arg0, boolean arg1) {
        ++field1030;
        if (!arg1) {
            return true;
        } else {
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Leq;IIII)V", line = 224)
    public class77(class357 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (super.field5794 != 34037) {
            this.field1028 = this.field1031 = 1.0F;
            this.field1026 = true;
        } else {
            this.field1031 = (float) arg4;
            this.field1026 = false;
            this.field1028 = (float) arg3;
        }
        this.field1033 = arg3;
        this.field1023 = arg4;
    }
}
