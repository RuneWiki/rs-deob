import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class46 extends class738 {

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    private int field759;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    private int field756;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Lgr;")
    public static class530 field764 = new class530(81, -1);

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V", line = 4)
    public final void method84(int arg0, int arg1, int arg2) {
        ++field757;
        int var4 = this.field759 * arg1 >> 12;
        int var5 = this.field756 * arg1 >> 12;
        int var6 = this.field760 * arg0 >> 12;
        int var7 = this.field765 * arg0 >> 12;
        class89.method692(-96, var6, var5, var7, super.field10305, var4);
        if (arg2 != 34065) {
            this.field765 = 16;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(JIIB)V", line = 24)
    public static final void method448(long arg0, int arg1, int arg2, byte arg3) {
        ++field758;
        int var5 = (int) arg0 >> 14 & 31;
        if (arg3 == -38) {
            int var6 = (int) arg0 >> 20 & 3;
            int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
            if (~var5 != -11 && var5 != 11 && var5 != 22) {
                class541.method3255(0, 0, var5, 0, arg1, arg2, var6, (byte) -49, true);
            } else {
                class482 var8 = class375.field5421.method2680(var7, (byte) 102);
                int var9;
                int var10;
                if (var6 != 0 && ~var6 != -3) {
                    var9 = var8.field6936;
                    var10 = var8.field6879;
                } else {
                    var10 = var8.field6936;
                    var9 = var8.field6879;
                }
                int var11 = var8.field6893;
                if (var6 != 0) {
                    var11 = (15 & var11 << var6) - -(var11 >> -var6 + 4);
                }
                class541.method3255(var10, var11, 0, var9, arg1, arg2, 0, (byte) -49, true);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIIII)V", line = 69)
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field760 = arg1;
        this.field759 = arg0;
        this.field765 = arg3;
        this.field756 = arg2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII)V", line = 81)
    public final void method83(byte arg0, int arg1, int arg2) {
        if (arg0 != 81) {
            this.method85(77, true, -48);
        }
        ++field762;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([Lms;ILmba;)Leaa;", line = 93)
    public static final class380 method449(class402[] arg0, int arg1, class643 arg2) {
        ++field761;
        for (int var3 = 0; var3 < arg0.length; ++var3) {
            if (arg0[var3] == null || arg0[var3].field5752 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field5752);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class644.field9264, 0);
        int var7 = -95 / ((arg1 - -58) / 62);
        if (class644.field9264[0] == 0) {
            if (~class644.field9264[0] == -1) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class644.field9264, 1);
            if (class644.field9264[1] > 1) {
                byte[] var8 = new byte[class644.field9264[1]];
                OpenGL.glGetInfoLogARB(var4, class644.field9264[1], class644.field9264, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (class644.field9264[0] == 0) {
                for (int var9 = 0; ~arg0.length < ~var9; ++var9) {
                    OpenGL.glDetachObjectARB(var4, arg0[var9].field5752);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class380(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZI)V", line = 159)
    public final void method85(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method85(-64, false, -61);
        }
        ++field763;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V", line = 169)
    public static void method450(int arg0) {
        if (arg0 != 1007) {
            field764 = null;
        }
        field764 = null;
    }
}
