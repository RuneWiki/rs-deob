import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class381 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lcea;")
    public static class180 field5046 = new class180("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lrg;")
    public static class548 field5048 = new class548(73, -1);

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Lcea;")
    public static class180 field5049 = new class180("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field5050 = 503;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lmh;ILjava/lang/String;B)Lnt;")
    public static final class187 method2206(class537 arg0, int arg1, String arg2, byte arg3) {
        field5045++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class473.field6636, 0);
        if (arg3 != 79) {
            field5046 = null;
        }
        if (class473.field6636[0] == 0) {
            if (class473.field6636[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class473.field6636, 1);
            if (class473.field6636[1] > 1) {
                byte[] var6 = new byte[class473.field6636[1]];
                OpenGL.glGetInfoLogARB(var4, class473.field6636[1], class473.field6636, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class473.field6636[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class187(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method2207(byte arg0) {
        field5049 = null;
        if (arg0 != -6) {
            field5051 = -27;
        }
        field5048 = null;
        field5046 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZB)V")
    public static final void method2208(boolean arg0, byte arg1) {
        if (class250.field3223 == null) {
            class250.field3223 = new byte[4][class106.field1289][class422.field5452];
        }
        field5047++;
        int var2 = 0;
        if (!arg0) {
            method2208(false, (byte) 82);
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < class106.field1289; var3++) {
                for (int var4 = 0; var4 < class422.field5452; var4++) {
                    class250.field3223[var2][var3][var4] = arg1;
                }
            }
            var2++;
        }
    }
}
