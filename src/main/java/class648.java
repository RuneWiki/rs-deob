import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class648 extends class20 {

    @OriginalMember(owner = "client!cca", name = "s", descriptor = "I")
    private int field9034;

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
    private int field9028;

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
    private int field9030;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
    private int field9029;

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!cca", name = "q", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!cca", name = "r", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "Lnba;")
    public static class569 field9026;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V", line = 3)
    public static void method3565(int arg0) {
        if (arg0 != -2051203508) {
            method3566(-47, 16, (String) null, (class622) null);
        }
        field9026 = null;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILjava/lang/String;Lji;)Lkk;", line = 16)
    public static final class238 method3566(int arg0, int arg1, String arg2, class622 arg3) {
        ++field9032;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        if (arg1 > -111) {
            field9026 = null;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class57.field773, 0);
        if (~class57.field773[0] == -1) {
            if (class57.field773[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class57.field773, 1);
            if (class57.field773[1] > 1) {
                byte[] var6 = new byte[class57.field773[1]];
                OpenGL.glGetInfoLogARB(var4, class57.field773[1], class57.field773, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (~class57.field773[0] == -1) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class238(arg3, var4, arg0);
    }

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "(III)V", line = 57)
    public static final void method3567(int arg0, int arg1, int arg2) {
        class530 var3 = class483.field6438[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field6878 != null) {
                var3.field6878 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BIIII)V", line = 70)
    public static final void method3568(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9033;
        float var5 = (float) class706.field9851 / (float) class706.field9861;
        int var6 = arg3;
        int var7 = arg1;
        if (!(var5 < 1.0F)) {
            var6 = (int) ((float) arg1 / var5);
        } else {
            var7 = (int) ((float) arg3 * var5);
        }
        int var8 = arg4 - (-var7 + arg1) / 2;
        int var9 = arg2 - (-var6 + arg3) / 2;
        class556.field7274 = class706.field9861 * var9 / var6;
        class527.field6862 = -(class706.field9851 * var8 / var7) + class706.field9851;
        class693.field9478 = -1;
        if (arg0 >= 111) {
            class82.field1112 = -1;
            class109.method840((byte) -32);
        }
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(IIIIIII)V", line = 101)
    public class648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9034 = arg3;
        this.field9028 = arg1;
        this.field9030 = arg2;
        this.field9029 = arg0;
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(III)V", line = 113)
    public final void method114(int arg0, int arg1, int arg2) {
        ++field9031;
        int var4 = this.field9029 * arg1 >> 12;
        if (arg0 < -28) {
            int var5 = this.field9030 * arg1 >> 12;
            int var6 = this.field9028 * arg2 >> 12;
            int var7 = this.field9034 * arg2 >> 12;
            class556.method2979(var4, var7, var6, super.field217, var5, 8);
        }
    }

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(III)V", line = 132)
    public final void method115(int arg0, int arg1, int arg2) {
        ++field9025;
        int var4 = this.field9029 * arg1 >> 12;
        int var5 = this.field9030 * arg1 >> 12;
        if (arg0 < 123) {
            this.method114(66, -8, -80);
        }
        int var6 = this.field9028 * arg2 >> 12;
        int var7 = this.field9034 * arg2 >> 12;
        class397.method2269(super.field216, var7, super.field217, super.field222, false, var6, var4, var5);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)V", line = 151)
    public final void method111(int arg0, int arg1, int arg2) {
        ++field9027;
        if (arg2 != 52) {
            this.method115(-126, -76, 57);
        }
    }
}
