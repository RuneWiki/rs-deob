import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class758 {

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lqe;")
    public static class469 field10593 = new class469(100, -2);

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Lqe;")
    public static class469 field10599 = new class469(43, 4);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field10591;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field10592;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field10595;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public int field10596;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public int field10597;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field10600;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Ljava/lang/String;")
    public static String field10601;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[Ltb;")
    public class401[] field10598;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/lang/String;Lwh;B)Lwj;", line = 5)
    public static final class396 method4225(int arg0, String arg1, class148 arg2, byte arg3) {
        field10594++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        if (arg3 < 95) {
            field10600 = -70;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class157.field2514, 0);
        if (class157.field2514[0] == 0) {
            if (class157.field2514[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class157.field2514, 1);
            if (class157.field2514[1] > 1) {
                byte[] var6 = new byte[class157.field2514[1]];
                OpenGL.glGetInfoLogARB(var4, class157.field2514[1], class157.field2514, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class157.field2514[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class396(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 47)
    public static void method4226(int arg0) {
        field10593 = null;
        field10601 = null;
        if (arg0 < -53) {
            field10599 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lrg;I)V", line = 61)
    public final void method4227(class645 arg0, int arg1) {
        this.field10596 = arg0.method3747((byte) -74);
        field10592++;
        this.field10597 = arg0.method3712((byte) -112);
        this.field10598 = new class401[arg0.method3745(-6314)];
        class439[] var3 = class75.method629((byte) 120);
        for (int var4 = arg1; var4 < this.field10598.length; var4++) {
            this.field10598[var4] = this.method4228((byte) -113, var3[arg0.method3745(-6314)], arg0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLio;Lrg;)Ltb;", line = 94)
    private final class401 method4228(byte arg0, class439 arg1, class645 arg2) {
        field10591++;
        if (class622.field8731 == arg1) {
            return class45.method323(-1, arg2);
        } else if (class529.field7543 == arg1) {
            return class347.method2192(arg2, (byte) 126);
        } else if (class307.field4353 == arg1) {
            return class535.method3137(-21837, arg2);
        } else if (class575.field8145 == arg1) {
            return class727.method4103(2, arg2);
        } else if (class247.field3593 == arg1) {
            return class756.method4221(false, arg2);
        } else if (class463.field6817 == arg1) {
            return class68.method597(-112, arg2);
        } else if (class76.field1065 == arg1) {
            return class304.method1924(arg2, -9);
        } else if (class457.field6746 == arg1) {
            return class729.method4115(arg2, 99);
        } else if (class189.field2867 == arg1) {
            return class66.method591(0, arg2);
        } else {
            int var4 = -68 % ((arg0 + 54) / 56);
            return class45.field500 == arg1 ? class194.method1350(arg2, 1) : null;
        }
    }
}
