import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class490 {

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "Lqv;")
    public static class316 field7064 = new class316(42, 7);

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field7070 = 0;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field7071 = 10;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public int field7061;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public int field7062;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public int field7063;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public int field7065;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public int field7066;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public int field7067;

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "Laa;")
    public static class343 field7069;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILbt;Ljava/lang/String;I)Lbn;", line = 10)
    public static final class314 method2872(int arg0, class33 arg1, String arg2, int arg3) {
        field7060++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        int var6 = -43 / (arg0 / 33);
        OpenGL.glShaderSourceARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class448.field6441, 0);
        if (class448.field6441[0] == 0) {
            if (class448.field6441[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class448.field6441, 1);
            if (class448.field6441[1] > 1) {
                byte[] var7 = new byte[class448.field6441[1]];
                OpenGL.glGetInfoLogARB(var4, class448.field6441[1], class448.field6441, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class448.field6441[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class314(arg1, var4, arg3);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V", line = 52)
    public static void method2873(int arg0) {
        if (arg0 < 76) {
            method2874(-60, -70, (byte) 51);
        }
        field7064 = null;
        field7069 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIB)V", line = 65)
    public static final void method2874(int arg0, int arg1, byte arg2) {
        if (arg2 != 49) {
            method2872(-119, null, null, -34);
        }
        field7068++;
        if (class167.field2519 == class14.field163) {
            if (!class15.method88(1, 0, arg0, -2, 17686, arg1, false, 0, 1)) {
                class15.method88(1, 0, arg0, -3, 17686, arg1, false, 0, 1);
            }
        } else if (!class15.method88(1, 0, arg0, -3, arg2 ^ 0x4527, arg1, false, 0, 1)) {
            class15.method88(1, 0, arg0, -2, 17686, arg1, false, 0, 1);
        }
    }
}
