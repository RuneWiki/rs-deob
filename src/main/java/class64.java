import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class64 {

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public int field955;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Llo;")
    public static class306 field956;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field954;

    static {
        new class306("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field956 = new class306(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");
    }

    @OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field948++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILza;ILl;II)V", line = 15)
    public static final void method418(int arg0, int arg1, class491 arg2, int arg3, class196 arg4, int arg5, int arg6) {
        field954++;
        if (class57.field900 < 100) {
            class36.method268((byte) 34, arg4, arg2);
        }
        arg2.method829(arg3, arg1, arg3 + arg5, arg1 - -arg6);
        if (class57.field900 < 100) {
            byte var7 = 20;
            int var8 = arg3 + (arg5 / 2);
            arg2.method914(arg3, arg1, arg5, arg6, -16777216, 0);
            int var9 = arg6 / 2 + arg1 - var7 - 18;
            arg2.method915(var8 - 152, var9, 304, 34, class235.field4074[class208.field3286].getRGB(), 0);
            arg2.method914(var8 - 150, var9 + 2, class57.field900 * 3, 30, class391.field5981[class208.field3286].getRGB(), 0);
            class127.field2188.method1897(var8, var7 + var9, class352.field5497[class208.field3286].getRGB(), class171.field2736.method1954(class300.field4813, -30366), 24244, -1);
            return;
        }
        int var10 = class494.field7217 - (int) ((float) arg5 / class210.field3335);
        int var11 = class471.field6970 + ((int) ((float) arg6 / class210.field3335));
        int var12 = (int) ((float) arg5 / class210.field3335) + class494.field7217;
        class156.field2537 = (int) ((float) (arg5 * 2) / class210.field3335);
        class104.field1712 = class471.field6970 - (int) ((float) arg6 / class210.field3335);
        class188.field2948 = class494.field7217 - ((int) ((float) arg5 / class210.field3335));
        class14.field158 = (int) ((float) (arg6 * 2) / class210.field3335);
        int var13 = class471.field6970 - ((int) ((float) arg6 / class210.field3335));
        class210.method1390(class210.field3357 + var10, class210.field3340 + var11, class210.field3357 + var12, class210.field3340 + var13, arg3, arg1, arg3 + arg5, arg1 - -arg6 - -1);
        class210.method1389(arg2);
        class411 var14 = class210.method1385(arg2);
        class509.method2993((byte) 106, 0, arg2, 0, var14);
        if (~class461.field6825 < arg0) {
            class187.field2933--;
            if (class187.field2933 == 0) {
                class461.field6825--;
                class187.field2933 = 20;
            }
        }
        if (!class81.field1420) {
            return;
        }
        int var15 = arg3 + arg5 - 5;
        int var16 = arg1 + arg6 - 8;
        class531.field7796.method1902(16776960, "Fps:" + class247.field4240, -16777216, -1, var15, var16);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class531.field7796.method1902(var19, "Mem:" + var18 + "k", -16777216, -1, var15, var20);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lia;I)Lkt;", line = 93)
    public static final class59 method419(class23 arg0, int arg1) {
        if (arg1 != 27644) {
            field949 = -109;
        }
        field953++;
        return new class59(arg0.method170(arg1 ^ 0x1D5EB7B9), arg0.method170(492756037), arg0.method170(492756037), arg0.method170(arg1 ^ 0x1D5EB7B9), arg0.method181(-126), arg0.method181(114), arg0.method126((byte) -72));
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 108)
    public static void method420(int arg0) {
        field956 = null;
        if (arg0 <= 32) {
            method418(-35, -108, null, -19, null, 30, 80);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BILih;Ljava/lang/String;)Laj;", line = 126)
    public static final class303 method421(byte arg0, int arg1, class214 arg2, String arg3) {
        if (arg0 > -117) {
            method420(7);
        }
        field952++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class286.field4683, 0);
        if (class286.field4683[0] == 0) {
            if (class286.field4683[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class286.field4683, 1);
            if (class286.field4683[1] > 1) {
                byte[] var6 = new byte[class286.field4683[1]];
                OpenGL.glGetInfoLogARB(var4, class286.field4683[1], class286.field4683, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class286.field4683[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class303(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZJ)V", line = 168)
    public static final void method422(boolean arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0) {
                field950 = -110;
            }
        } catch (InterruptedException var3) {
        }
        field951++;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(II)V", line = 187)
    public class64(int arg0, int arg1) {
        this.field955 = arg0;
    }
}
