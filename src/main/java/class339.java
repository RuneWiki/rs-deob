import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class339 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([Lbba;Lkga;B)Lfr;", line = 3)
    public static final class378 method1957(class97[] arg0, class506 arg1, byte arg2) {
        field4499++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field1312 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field1312);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class332.field4423, 0);
        if (class332.field4423[0] == 0) {
            if (class332.field4423[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class332.field4423, 1);
            if (class332.field4423[1] > 1) {
                byte[] var7 = new byte[class332.field4423[1]];
                OpenGL.glGetInfoLogARB(var4, class332.field4423[1], class332.field4423, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class332.field4423[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field1312);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        if (arg2 >= -2) {
            method1957(null, null, (byte) -43);
        }
        return new class378(arg1, var4, arg0);
    }
}
