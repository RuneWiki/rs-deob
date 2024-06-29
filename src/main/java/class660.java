import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class660 extends class40 {

    @OriginalMember(owner = "client!eba", name = "B", descriptor = "D")
    public static double field9442;

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "I")
    public static int field9436;

    @OriginalMember(owner = "client!eba", name = "x", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!eba", name = "A", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!eba", name = "C", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!eba", name = "y", descriptor = "J")
    public static long field9439;

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "Lclient;")
    public static client field9437;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BIII)V", line = 10)
    public final void method428(byte arg0, int arg1, int arg2, int arg3) {
        ++field9443;
        super.field678 = arg1;
        int var5 = 41 % ((arg0 - 46) / 45);
        super.field688 = arg3;
        super.field679 = arg2;
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(IIIIIF)V", line = 22)
    public class660(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "(I)V", line = 26)
    public static void method3766(int arg0) {
        field9437 = null;
        if (arg0 != -2535) {
            method3768((class346) null, -123, (class716[]) null);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(FI)V", line = 39)
    public final void method424(float arg0, int arg1) {
        super.field685 = arg0;
        ++field9438;
        if (arg1 != -1) {
            method3766(16);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B[Ljava/lang/String;[SII)V", line = 51)
    public static final void method3767(byte arg0, String[] arg1, short[] arg2, int arg3, int arg4) {
        if (~arg3 > ~arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg3; ~var9 > ~arg4; ++var9) {
                if (var7 == null || arg1[var9] != null && ~arg1[var9].compareTo(var7) > ~(1 & var9)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method3767((byte) 92, arg1, arg2, arg3, var6 + -1);
            method3767((byte) 88, arg1, arg2, var6 + 1, arg4);
        }
        ++field9440;
        int var12 = 19 % ((arg0 - 25) / 41);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lkw;I[Ltn;)Ldc;", line = 108)
    public static final class62 method3768(class346 arg0, int arg1, class716[] arg2) {
        ++field9441;
        for (int var3 = 0; ~var3 > ~arg2.length; ++var3) {
            if (arg2[var3] == null || ~arg2[var3].field10109 >= -1L) {
                return null;
            }
        }
        if (arg1 != 35716) {
            method3768((class346) null, 37, (class716[]) null);
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; ~arg2.length < ~var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field10109);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class51.field820, 0);
        if (~class51.field820[0] == -1) {
            if (class51.field820[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class51.field820, 1);
            if (~class51.field820[1] < -2) {
                byte[] var7 = new byte[class51.field820[1]];
                OpenGL.glGetInfoLogARB(var4, class51.field820[1], class51.field820, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (~class51.field820[0] == -1) {
                for (int var8 = 0; var8 < arg2.length; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field10109);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class62(arg0, var4, arg2);
    }
}
