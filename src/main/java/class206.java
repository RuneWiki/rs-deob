import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class206 extends class508 {

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field2684 = 0;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Ltu;")
    public static class7 field2682 = new class7();

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Lpi;")
    public static class340 field2686 = new class340(51, 5);

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field2687 = -1;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class206() {
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
    public static void method1344(byte arg0) {
        if (arg0 > -26) {
            method1344((byte) 21);
        }
        field2686 = null;
        field2682 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Z")
    public static final boolean method1345(int arg0, int arg1, int arg2) {
        int var3 = -91 / ((62 - arg2) / 58);
        field2679++;
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V")
    public class206(int arg0) {
        this.field2681 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lgk;IILjava/lang/String;)Lgo;")
    public static final class307 method1346(class463 arg0, int arg1, int arg2, String arg3) {
        field2680++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        if (arg2 != -10993) {
            field2685 = -82;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class449.field6254, 0);
        if (class449.field6254[0] == 0) {
            if (class449.field6254[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class449.field6254, 1);
            if (class449.field6254[1] > 1) {
                byte[] var6 = new byte[class449.field6254[1]];
                OpenGL.glGetInfoLogARB(var4, class449.field6254[1], class449.field6254, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class449.field6254[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class307(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)V")
    public static final void method1347(int arg0, int arg1, int arg2) {
        if (arg2 >= -103) {
            method1345(-2, 48, 119);
        }
        field2683++;
        class294.field3816 = arg1 - class230.field2983;
        class203.field2665 = arg0 - class230.field2971;
    }
}
