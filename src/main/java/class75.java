import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class75 {

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lob;")
    public static class521 field1072 = new class521(75, -1);

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Lhn;")
    public static class509 field1078 = new class509(31, -2);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "[[[Lfq;")
    public static class138[][][] field1076;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 3)
    public static void method645(byte arg0) {
        field1072 = null;
        if (arg0 != 67) {
            field1078 = null;
        }
        field1078 = null;
        field1076 = null;
    }

    @OriginalMember(owner = "client!ri", name = "toString", descriptor = "()Ljava/lang/String;", line = 15)
    public final String toString() {
        field1073++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lod;ILjava/awt/Canvas;Lga;I)Lya;", line = 26)
    public static final class38 method646(class352 arg0, int arg1, Canvas arg2, class279 arg3, int arg4) {
        field1074++;
        if (arg1 != 0) {
            field1076 = null;
        }
        return new class166(arg4, arg2, arg3, arg0);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILkd;[Lsn;)Lfe;", line = 42)
    public static final class404 method647(int arg0, class188 arg1, class447[] arg2) {
        field1075++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field6549 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field6549);
        }
        OpenGL.glLinkProgramARB(var4);
        int var7 = -110 / ((arg0 - 52) / 33);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class390.field5845, 0);
        if (class390.field5845[0] == 0) {
            if (class390.field5845[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class390.field5845, 1);
            if (class390.field5845[1] > 1) {
                byte[] var8 = new byte[class390.field5845[1]];
                OpenGL.glGetInfoLogARB(var4, class390.field5845[1], class390.field5845, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (class390.field5845[0] == 0) {
                for (int var9 = 0; var9 < arg2.length; var9++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var9].field6549);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class404(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(II)V", line = 115)
    public class75(int arg0, int arg1) {
        this.field1077 = arg0;
    }
}
