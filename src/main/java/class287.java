import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class287 {

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([Laj;Lih;I)Leq;")
    public static final class256 method1864(class303[] arg0, class214 arg1, int arg2) {
        field4692++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field4858 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field4858);
        }
        if (arg2 != 1) {
            return null;
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class106.field1898, 0);
        if (class106.field1898[0] == 0) {
            if (class106.field1898[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class106.field1898, 1);
            if (class106.field1898[1] > 1) {
                byte[] var7 = new byte[class106.field1898[1]];
                OpenGL.glGetInfoLogARB(var4, class106.field1898[1], class106.field1898, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class106.field1898[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field4858);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class256(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)I")
    public static final int method1865(byte arg0) {
        int var1 = -59 / ((7 - arg0) / 53);
        field4693++;
        if (class422.field6374 == null) {
            return class426.field6406 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V")
    public static final void method1866(boolean arg0) {
        class303.field4852.method1604(4);
        if (arg0) {
            field4694++;
        }
    }
}
