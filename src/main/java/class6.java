import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class6 {

    @OriginalMember(owner = "client!er", name = "c", descriptor = "Lht;")
    public static class607 field74 = new class607("", 17);

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "Ltf;")
    public static class701 field76;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 6)
    public static final String method44(String arg0, byte arg1) {
        field73++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -83) {
            field76 = null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && class426.method2459(true, arg0.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class426.method2459(true, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class628.method3529(arg1 - 45, var7)) {
                char var8 = class656.method3649(var7, (byte) 117);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZLvj;Ljava/lang/String;)Lmc;", line = 65)
    public static final class424 method45(int arg0, boolean arg1, class422 arg2, String arg3) {
        if (!arg1) {
            return null;
        }
        field72++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class416.field5579, 0);
        if (class416.field5579[0] == 0) {
            if (class416.field5579[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class416.field5579, 1);
            if (class416.field5579[1] > 1) {
                byte[] var6 = new byte[class416.field5579[1]];
                OpenGL.glGetInfoLogARB(var4, class416.field5579[1], class416.field5579, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class416.field5579[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class424(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 106)
    public static void method46(byte arg0) {
        int var1 = -57 % ((arg0 + 11) / 35);
        field76 = null;
        field74 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILjava/lang/String;)I", line = 117)
    public static final int method47(int arg0, String arg1) {
        field75++;
        int var2 = arg1.length();
        int var3 = 0;
        int var4 = 0;
        if (arg0 != 4114) {
            field76 = null;
        }
        while (var4 < var2) {
            char var5 = arg1.charAt(var4);
            if (var5 <= '\u007F') {
                var3++;
            } else if (var5 <= '߿') {
                var3 += 2;
            } else {
                var3 += 3;
            }
            var4++;
        }
        return var3;
    }
}
