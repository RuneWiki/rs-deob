import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class380 {

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "Lkaa;")
    public static class47 field5285 = new class47(77, 3);

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "Lkg;")
    public static class275 field5288 = new class275(1, 2, 2, 0);

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public static int field5289 = 0;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2243(boolean arg0) {
        field5285 = null;
        field5288 = null;
        if (arg0) {
            method2245(109);
        }
    }

    @OriginalMember(owner = "client!ku", name = "toString", descriptor = "()Ljava/lang/String;", line = 23)
    public final String toString() {
        field5287++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILjava/lang/String;ILrda;)Lcba;", line = 33)
    public static final class551 method2244(int arg0, String arg1, int arg2, class663 arg3) {
        field5286++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        if (arg0 != 4) {
            method2243(true);
        }
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class283.field4002, 0);
        if (class283.field4002[0] == 0) {
            if (class283.field4002[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class283.field4002, 1);
            if (class283.field4002[1] > 1) {
                byte[] var6 = new byte[class283.field4002[1]];
                OpenGL.glGetInfoLogARB(var4, class283.field4002[1], class283.field4002, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class283.field4002[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class551(arg3, var4, arg2);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 81)
    public static final void method2245(int arg0) {
        if (arg0 == 0) {
            if (class361.field5091 == 2) {
                class550.field7263[0].method3271(class289.field4110[0]);
                class550.field7263[1].method3271(class289.field4110[1]);
            } else if (class361.field5091 == 3) {
                class550.field7263[0].method3271(class289.field4110[0]);
                class550.field7263[1].method3271(class289.field4110[1]);
                class550.field7263[2].method3271(class289.field4110[2]);
            } else {
                class550.field7263[0].method3271(class289.field4110[0]);
                class550.field7263[1].method3271(class289.field4110[1]);
                class550.field7263[2].method3271(class289.field4110[2]);
                class550.field7263[3].method3271(class289.field4110[3]);
            }
        } else if (arg0 == 1) {
            if (class361.field5091 == 2) {
                class550.field7263[0].method3271(class289.field4110[2]);
            } else if (class361.field5091 == 3) {
                class550.field7263[0].method3271(class289.field4110[3]);
                class550.field7263[1].method3271(class289.field4110[4]);
            } else {
                class550.field7263[0].method3271(class289.field4110[4]);
                class550.field7263[1].method3271(class289.field4110[5]);
                class550.field7263[2].method3271(class289.field4110[6]);
            }
        } else if (arg0 == 2) {
            if (class361.field5091 == 2) {
                class550.field7263[0].method3271(class289.field4110[3]);
                return;
            }
            if (class361.field5091 == 3) {
                class550.field7263[0].method3271(class289.field4110[5]);
                return;
            }
            class550.field7263[0].method3271(class289.field4110[7]);
        }
    }
}
