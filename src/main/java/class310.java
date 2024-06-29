import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class310 {

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Ldn;")
    private class201 field4005;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public int field4001;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Leo;")
    public static class423 field4000 = null;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Z")
    public static boolean field4004 = false;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "[Lf;")
    public static class404[] field4007;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Lps;")
    public static final class344 method1851(byte arg0) {
        field4003++;
        if (arg0 >= -3) {
            method1853(61, null, null);
        }
        class344 var1 = (class344) class16.field273.method2126((byte) -124);
        if (var1 == null) {
            return new class344();
        } else {
            class338.field4315--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method1852(int arg0) {
        int var1 = -114 % ((63 - arg0) / 34);
        field4007 = null;
        field4000 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILgk;[Lgo;)Lss;")
    public static final class322 method1853(int arg0, class463 arg1, class307[] arg2) {
        field4006++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field3949 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        if (arg0 <= 68) {
            return null;
        }
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field3949);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class529.field7803, 0);
        if (class529.field7803[0] == 0) {
            if (class529.field7803[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class529.field7803, 1);
            if (class529.field7803[1] > 1) {
                byte[] var7 = new byte[class529.field7803[1]];
                OpenGL.glGetInfoLogARB(var4, class529.field7803[1], class529.field7803, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class529.field7803[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field3949);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class322(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lgt;ILdn;)V")
    public class310(class65 arg0, int arg1, class201 arg2) {
        new class11(64);
        this.field4005 = arg2;
        this.field4001 = this.field4005.method1302(-94, 15);
    }
}
