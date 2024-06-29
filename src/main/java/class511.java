import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class511 {

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Law;")
    public static class76 field6786 = new class76();

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field6789 = 1406;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "F")
    public static float field6788;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V", line = 7)
    public static void method2855(int arg0) {
        field6786 = null;
        if (arg0 != 3507) {
            method2857(-125, -120, -96, -8, null, null, 102, 55, 60, -6, (byte) 116, 113);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILlaa;[BI)Llf;", line = 22)
    public static final class239 method2856(int arg0, class122 arg1, byte[] arg2, int arg3) {
        field6785++;
        if (arg2 == null || arg2.length == 0) {
            return null;
        } else if (arg0 < 18) {
            return null;
        } else {
            long var4 = OpenGL.glCreateShaderObjectARB(arg3);
            OpenGL.glShaderSourceRawARB(var4, arg2);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class241.field3388, 0);
            if (class241.field3388[0] == 0) {
                if (class241.field3388[0] == 0) {
                    System.out.println("Shader compile failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class241.field3388, 1);
                if (class241.field3388[1] > 1) {
                    byte[] var6 = new byte[class241.field3388[1]];
                    OpenGL.glGetInfoLogARB(var4, class241.field3388[1], class241.field3388, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (class241.field3388[0] == 0) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class239(arg1, var4, arg3);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIILle;Lqj;IIIIBI)V", line = 67)
    public static final void method2857(int arg0, int arg1, int arg2, int arg3, class311 arg4, class512 arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11) {
        class328.field4677 = arg8;
        class452.field6184 = arg6;
        class397.field5535 = arg5;
        class298.field4236 = null;
        class277.field3858 = null;
        class465.field6410 = arg0;
        class65.field801 = arg11;
        class109.field1494 = arg4;
        class456.field6218 = arg2;
        field6787++;
        int var12 = -123 % ((5 - arg10) / 45);
        class32.field494 = arg7;
        class244.field3404 = arg3;
        class663.field8755 = arg9;
        class447.field6132 = arg1;
        class525.field6967 = null;
        class336.method2026((byte) -54);
        class689.field9594 = true;
    }
}
