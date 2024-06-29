import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class529 extends class254 {

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
    private int field7318 = -1;

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "I")
    private int field7323 = -1;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
    public int field7317;

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "I")
    public int field7319;

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "I")
    public int field7320;

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "Lcb;")
    public static class318 field7324 = new class318(91, 3);

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "I")
    public static int field7326 = -1;

    @OriginalMember(owner = "client!bu", name = "y", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B[Lpc;Lpea;)Log;", line = 3)
    public static final class564 method3008(byte arg0, class216[] arg1, class641 arg2) {
        ++field7322;
        for (int var3 = 0; arg1.length > var3; ++var3) {
            if (arg1[var3] == null || arg1[var3].field2786 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        if (arg0 >= -73) {
            return null;
        } else {
            for (int var6 = 0; ~arg1.length < ~var6; ++var6) {
                OpenGL.glAttachObjectARB(var4, arg1[var6].field2786);
            }
            OpenGL.glLinkProgramARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35714, class594.field8159, 0);
            if (class594.field8159[0] == 0) {
                if (~class594.field8159[0] == -1) {
                    System.out.println("Shader linking failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class594.field8159, 1);
                if (~class594.field8159[1] < -2) {
                    byte[] var7 = new byte[class594.field8159[1]];
                    OpenGL.glGetInfoLogARB(var4, class594.field8159[1], class594.field8159, 0, var7, 0);
                    System.out.println(new String(var7));
                }
                if (~class594.field8159[0] == -1) {
                    for (int var8 = 0; ~arg1.length < ~var8; ++var8) {
                        OpenGL.glDetachObjectARB(var4, arg1[var8].field2786);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class564(arg2, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lpea;IIII[BI)V", line = 81)
    public class529(class641 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field7317 = arg2;
        this.field7319 = arg3;
        this.field7320 = arg4;
        super.field3510.method3553((byte) 24, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3500, 0, super.field3502, this.field7317, this.field7319, this.field7320, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1592(86, true);
    }

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "(B)V", line = 96)
    public static void method3009(byte arg0) {
        field7324 = null;
        int var1 = 13 / ((-57 - arg0) / 62);
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lpea;IIII)V", line = 105)
    public class529(class641 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field7319 = arg3;
        this.field7317 = arg2;
        this.field7320 = arg4;
        super.field3510.method3553((byte) -108, this);
        OpenGL.glTexImage3Dub(super.field3500, 0, super.field3502, this.field7317, this.field7319, this.field7320, 0, class465.method2634(true, super.field3502), 5121, (byte[]) null, 0);
        this.method1592(84, true);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 128)
    public final void method545(int arg0) {
        ++field7325;
        OpenGL.glFramebufferTexture3DEXT(this.field7318, this.field7323, super.field3500, 0, 0, 0);
        this.field7323 = -1;
        this.field7318 = -1;
        int var2 = -105 % ((-59 - arg0) / 52);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIIII)V", line = 140)
    public final void method3010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7321;
        super.field3510.method3553((byte) -120, this);
        if (arg5 == -1) {
            OpenGL.glCopyTexSubImage3D(super.field3500, 0, arg4, arg7, arg2, arg0, arg3, arg1, arg6);
            OpenGL.glFlush();
        }
    }
}
