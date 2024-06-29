import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class257 extends class87 {

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
    public int field3941 = (int) (class423.method2578(-19698) / 1000L);

    @OriginalMember(owner = "client!ku", name = "w", descriptor = "Ljava/lang/String;")
    public String field3938;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "S")
    public short field3943;

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "[I")
    public static int[] field3937 = new int[14];

    @OriginalMember(owner = "client!ku", name = "x", descriptor = "Lbj;")
    public static class162 field3939 = new class162(12, 7);

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "Lje;")
    public static class278 field3944 = new class278(6, 0, 4, 2);

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "Ls;")
    public static class186 field3945 = new class186(39, 12);

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "I")
    public static int field3942;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ku", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field3946;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method1657(String arg0, boolean arg1) {
        if (arg1) {
            field3942++;
            return class382.method2351(10, -3598, arg0, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILda;ILjava/lang/String;)Lrs;")
    public static final class466 method1658(int arg0, class44 arg1, int arg2, String arg3) {
        if (arg2 != 2) {
            return null;
        }
        field3936++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class376.field5504, 0);
        if (class376.field5504[0] == 0) {
            if (class376.field5504[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class376.field5504, 1);
            if (class376.field5504[1] > 1) {
                byte[] var6 = new byte[class376.field5504[1]];
                OpenGL.glGetInfoLogARB(var4, class376.field5504[1], class376.field5504, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class376.field5504[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class466(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(B)V")
    public static final void method1659(byte arg0) {
        try {
            Method var1 = (field3946 == null ? (field3946 = method1661("java.lang.Runtime")) : field3946).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class242.field3755 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field3940++;
        if (arg0 < 125) {
            method1658(-24, null, 118, null);
        }
    }

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)V")
    public static void method1660(int arg0) {
        if (arg0 > 61) {
            field3945 = null;
            field3939 = null;
            field3937 = null;
            field3944 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class257(String arg0, int arg1) {
        this.field3938 = arg0;
        this.field3943 = (short) arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1661(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
