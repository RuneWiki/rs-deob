import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class312 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lvp;")
    public static class123 field4467 = new class123();

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4468 = 0;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1947(int arg0) {
        if (arg0 != 0) {
            method1948(null, 15, null);
        }
        field4467 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lod;I[Llv;)Lkh;")
    public static final class13 method1948(class349 arg0, int arg1, class307[] arg2) {
        field4470++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field4413 <= 0L) {
                return null;
            }
        }
        if (arg1 > -100) {
            return null;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field4413);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class12.field160, 0);
        if (class12.field160[0] == 0) {
            if (class12.field160[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class12.field160, 1);
            if (class12.field160[1] > 1) {
                byte[] var7 = new byte[class12.field160[1]];
                OpenGL.glGetInfoLogARB(var4, class12.field160[1], class12.field160, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class12.field160[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field4413);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class13(arg0, var4, arg2);
    }
}
