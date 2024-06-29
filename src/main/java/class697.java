import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class697 extends class51 implements class411 {

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    private int field9885;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field9890;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field9892;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field9893;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "[I")
    public static int[] field9887;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)I", line = 3)
    public final int method2454(int arg0) {
        int var2 = -76 % ((-36 - arg0) / 55);
        ++field9891;
        return super.field672;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lkfa;IILjava/lang/String;)Lafa;", line = 16)
    public static final class189 method3921(class382 arg0, int arg1, int arg2, String arg3) {
        ++field9893;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class426.field6085, 0);
        if (arg2 != 8) {
            return null;
        } else {
            if (class426.field6085[0] == 0) {
                if (~class426.field6085[0] == -1) {
                    System.out.println("Shader compile failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class426.field6085, 1);
                if (~class426.field6085[1] < -2) {
                    byte[] var6 = new byte[class426.field6085[1]];
                    OpenGL.glGetInfoLogARB(var4, class426.field6085[1], class426.field6085, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (~class426.field6085[0] == -1) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class189(arg0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLsj;)V", line = 56)
    public static final void method3922(byte arg0, class373 arg1) {
        ++field9890;
        if (arg0 != 105) {
            field9887 = null;
        }
        for (int var2 = 0; ~class3.field38 < ~var2; ++var2) {
            int var3 = class657.field9276[var2];
            class270 var4 = class76.field1186[var3];
            int var5 = arg1.method2705(-98);
            if ((var5 & 8) != 0) {
                var5 += arg1.method2705(-124) << 8;
            }
            if ((var5 & 4096) != 0) {
                var5 += arg1.method2705(-65) << 16;
            }
            class420.method2487((byte) 102, var4, arg1, var5, var3);
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V", line = 89)
    public static void method3923(int arg0) {
        if (arg0 < 12) {
            method3924(72, 26, -20);
        }
        field9887 = null;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lkfa;ILjaclib/memory/Buffer;IZ)V", line = 100)
    public class697(class382 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field9885 = arg1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)J", line = 109)
    public final long method2456(byte arg0) {
        ++field9892;
        if (arg0 < 89) {
            this.method2455(93);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lkfa;I[BIZ)V", line = 122)
    public class697(class382 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field9885 = arg1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Z", line = 131)
    public static final boolean method3924(int arg0, int arg1, int arg2) {
        if (arg0 != 34962) {
            method3923(-82);
        }
        ++field9894;
        return class91.method675(arg2, arg1, false) || class18.method199(arg2, 27137, arg1);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([BIII)V", line = 142)
    public final void method2453(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method408(arg0, arg3, 109);
        if (arg2 == 12500) {
            ++field9889;
            this.field9885 = arg1;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V", line = 154)
    public final void method406(int arg0) {
        super.field670.method2322(-113, this);
        ++field9886;
        if (arg0 != 34963) {
            field9887 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I", line = 165)
    public final int method2455(int arg0) {
        ++field9888;
        return arg0 >= -70 ? 76 : this.field9885;
    }
}
