import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class516 implements class283 {

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Ljava/lang/String;")
    private String field7049;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lpl;")
    private class612 field7040;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Z")
    public static boolean field7044 = false;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[Liaa;")
    public static class513[] field7046;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I", line = 5)
    public final int method1266(int arg0) {
        field7042++;
        if (this.field7040.method3362(false, this.field7049)) {
            return 100;
        } else {
            int var2 = -1 / ((-arg0 - 55) / 49);
            return this.field7040.method3352(this.field7049, 60);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BIII)I", line = 19)
    public static final int method2793(byte arg0, int arg1, int arg2, int arg3) {
        field7039++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        }
        if (arg0 != -117) {
            field7046 = null;
        }
        if (var4 == 1) {
            return 4095 - arg3;
        } else if (var4 == 2) {
            return 4095 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Ltj;", line = 45)
    public final class31 method1265(byte arg0) {
        if (arg0 != -58) {
            field7041 = -116;
        }
        field7048++;
        return class31.field441;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 57)
    public static final void method2794(String arg0, boolean arg1) {
        field7047++;
        if (arg1) {
            System.out.println("Error: " + class597.method3284(0, arg0, "%0a", "\n"));
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 73)
    public static void method2795(int arg0) {
        field7046 = null;
        if (arg0 != 0) {
            field7044 = true;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z[Lcb;Llm;)Ldl;", line = 86)
    public static final class115 method2796(boolean arg0, class80[] arg1, class337 arg2) {
        field7037++;
        if (arg0) {
            field7038 = -16;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field1079 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field1079);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class214.field2668, 0);
        if (class214.field2668[0] == 0) {
            if (class214.field2668[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class214.field2668, 1);
            if (class214.field2668[1] > 1) {
                byte[] var7 = new byte[class214.field2668[1]];
                OpenGL.glGetInfoLogARB(var4, class214.field2668[1], class214.field2668, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class214.field2668[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field1079);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class115(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lpl;Ljava/lang/String;)V", line = 156)
    public class516(class612 arg0, String arg1) {
        this.field7049 = arg1;
        this.field7040 = arg0;
    }
}
