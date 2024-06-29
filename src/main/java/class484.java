import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public abstract class class484 extends class472 {

    @OriginalMember(owner = "client!cv", name = "A", descriptor = "I")
    public int field7092;

    @OriginalMember(owner = "client!cv", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field7094 = new String[100];

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "[I")
    public static int[] field7095 = new int[8];

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
    public static int field7096 = 0;

    @OriginalMember(owner = "client!cv", name = "B", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IILjava/lang/String;Ltt;)Lup;", line = 4)
    public static final class280 method2930(int arg0, int arg1, String arg2, class249 arg3) {
        field7093++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class208.field3170, 0);
        int var5 = -58 % ((80 - arg1) / 45);
        if (class208.field3170[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class280(arg3, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "(B)V", line = 32)
    public static void method2931(byte arg0) {
        if (arg0 >= -72) {
            method2931((byte) 55);
        }
        field7095 = null;
        field7094 = null;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I)V", line = 47)
    public class484(int arg0) {
        this.field7092 = arg0;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)Z")
    public abstract boolean method2843(int arg0);

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method2842(byte arg0);
}
