import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class class628 extends class313 {

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([Lnt;Lmh;B)Lpi;", line = 10)
    public static final class422 method3598(class187[] arg0, class537 arg1, byte arg2) {
        field9022++;
        if (arg2 >= -1) {
            return null;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field2257 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field2257);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class567.field8323, 0);
        if (class567.field8323[0] == 0) {
            if (class567.field8323[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class567.field8323, 1);
            if (class567.field8323[1] > 1) {
                byte[] var7 = new byte[class567.field8323[1]];
                OpenGL.glGetInfoLogARB(var4, class567.field8323[1], class567.field8323, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class567.field8323[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field2257);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class422(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)Llm;")
    public abstract class423 method3044(int arg0);
}
