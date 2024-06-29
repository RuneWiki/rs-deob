import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class643 extends class614 {

    @OriginalMember(owner = "client!bea", name = "Q", descriptor = "I")
    public static int field9329 = 328;

    @OriginalMember(owner = "client!bea", name = "S", descriptor = "Lim;")
    public static class353 field9331 = new class353(108, 3);

    @OriginalMember(owner = "client!bea", name = "V", descriptor = "[[I")
    public static int[][] field9334 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!bea", name = "R", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!bea", name = "T", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!bea", name = "U", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!bea", name = "W", descriptor = "Lm;")
    public static class105 field9335;

    @OriginalMember(owner = "client!bea", name = "P", descriptor = "Lqg;")
    public static class202 field9328;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V")
    public static void method3709(byte arg0) {
        field9335 = null;
        field9331 = null;
        field9334 = null;
        field9328 = null;
        if (arg0 >= -49) {
            method3709((byte) -37);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Luq;I[Lop;)Lqca;")
    public static final class610 method3710(class313 arg0, int arg1, class364[] arg2) {
        field9330++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field5093 <= 0L) {
                return null;
            }
        }
        if (arg1 <= 34) {
            field9335 = null;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field5093);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class463.field6582, 0);
        if (class463.field6582[0] == 0) {
            if (class463.field6582[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class463.field6582, 1);
            if (class463.field6582[1] > 1) {
                byte[] var7 = new byte[class463.field6582[1]];
                OpenGL.glGetInfoLogARB(var4, class463.field6582[1], class463.field6582, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class463.field6582[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field5093);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class610(arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BLkr;)V")
    public static final void method3711(byte arg0, class329 arg1) {
        field9332++;
        class49.field669 = arg1.method2053((byte) 40, "titlebg");
        if (arg0 < 67) {
            field9335 = null;
        }
        class208.field2707 = arg1.method2053((byte) 40, "logo");
    }
}
