import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class118 implements class346 {

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "Lri;")
    private class97 field1890;

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "Lada;")
    private class149 field1891;

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "Lf;")
    private class702 field1894;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "Lri;")
    public static class97 field1889;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V", line = 5)
    public final void method587(int arg0) {
        field1893++;
        if (arg0 != 22478) {
            this.method1066(true, -35);
        }
        this.field1894 = class592.method3456(this.field1891.field2468, true, this.field1890);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZII)I", line = 22)
    public static final int method1062(boolean arg0, int arg1, int arg2) {
        field1900++;
        if (arg0) {
            return 0;
        }
        class527 var3 = class605.method3523(arg0, (byte) 120, arg2);
        if (var3 == null) {
            return class522.field7578.method2942((byte) -58, arg2).field2883;
        }
        int var4 = 0;
        int var5 = 101 / ((41 - arg1) / 42);
        for (int var6 = 0; var6 < var3.field7693.length; var6++) {
            if (var3.field7693[var6] == -1) {
                var4++;
            }
        }
        return var4 + class522.field7578.method2942((byte) -58, arg2).field2883 - var3.field7693.length;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)Z", line = 58)
    public final boolean method585(byte arg0) {
        if (arg0 < 119) {
            method1065(null, 113, null, (byte) -36);
        }
        field1899++;
        return this.field1890.method942(0, this.field1891.field2468);
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lri;Lada;)V", line = 69)
    public class118(class97 arg0, class149 arg1) {
        this.field1890 = arg0;
        this.field1891 = arg1;
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)V", line = 81)
    public static final void method1063(byte arg0) {
        field1898++;
        class275.field4413 = 0;
        class674.field9494 = new class681[50];
        if (arg0 != 10) {
            field1889 = null;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 93)
    public static final int method1064(String arg0, boolean arg1) {
        field1895++;
        if (arg0 == null) {
            return -1;
        }
        if (arg1) {
            field1889 = null;
        }
        for (int var2 = 0; var2 < class204.field3334; var2++) {
            if (arg0.equalsIgnoreCase(class527.field7700[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "([BILbea;B)Ldg;", line = 120)
    public static final class379 method1065(byte[] arg0, int arg1, class205 arg2, byte arg3) {
        field1897++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceRawARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        if (arg3 > -50) {
            return null;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class385.field5982, 0);
        if (class385.field5982[0] == 0) {
            if (class385.field5982[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class385.field5982, 1);
            if (class385.field5982[1] > 1) {
                byte[] var6 = new byte[class385.field5982[1]];
                OpenGL.glGetInfoLogARB(var4, class385.field5982[1], class385.field5982, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class385.field5982[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class379(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZI)V", line = 162)
    public final void method1066(boolean arg0, int arg1) {
        if (arg1 != -5506) {
            method1067(124);
        }
        field1892++;
        if (!arg0) {
            return;
        }
        int var3 = class56.field732 <= class585.field8333 ? class585.field8333 : class56.field732;
        int var4 = class259.field4147 <= class95.field1487 ? class95.field1487 : class259.field4147;
        int var5 = this.field1894.method1076();
        int var6 = this.field1894.method1079();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var4 < var9) {
            var10 = 0;
            var9 = var4;
            var8 = var4 * var5 / var6;
            var7 = (var3 - var8) / 2;
        }
        this.field1894.method3958(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)V", line = 201)
    public static void method1067(int arg0) {
        if (arg0 != 0) {
            method1063((byte) 37);
        }
        field1889 = null;
    }
}
