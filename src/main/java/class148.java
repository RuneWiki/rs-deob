import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class148 extends class514 {

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lme;")
    public class207 field2076;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lhv;")
    public static class546 field2077 = new class546(2, 2);

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1115(int arg0) {
        if (arg0 != -1) {
            method1116(-73, null, null);
        }
        field2077 = null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ldia;II[B)V")
    public class148(class246 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2076 = class125.method1023(arg3, 6406, arg2, arg0, arg1, 6406, false, (byte) -120);
        this.field2076.method1274(false, false, 10242);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[Lkd;Ldia;)Loca;")
    public static final class277 method1116(int arg0, class298[] arg1, class246 arg2) {
        field2079++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field4321 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field4321);
        }
        if (arg0 != 10782) {
            field2077 = null;
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class443.field6229, 0);
        if (class443.field6229[0] == 0) {
            if (class443.field6229[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class443.field6229, 1);
            if (class443.field6229[1] > 1) {
                byte[] var7 = new byte[class443.field6229[1]];
                OpenGL.glGetInfoLogARB(var4, class443.field6229[1], class443.field6229, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class443.field6229[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field4321);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class277(arg2, var4, arg1);
    }
}
