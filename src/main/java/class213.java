import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class213 extends class435 {

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Ljava/lang/String;")
    public String field2920;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Ljc;")
    public static class305 field2919 = new class305("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!db", name = "p", descriptor = "[I")
    public static int[] field2921 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field2918;

    static {
        new class305("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;Lur;BI)Lik;", line = 4)
    public static final class141 method1362(String arg0, class377 arg1, byte arg2, int arg3) {
        field2917++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        if (arg2 != 60) {
            return null;
        }
        OpenGL.glProgramStringARB(arg3, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class380.field5510, 0);
        if (class380.field5510[0] == -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class141(arg1, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLkh;)V", line = 33)
    public static final void method1363(byte arg0, class13 arg1) {
        field2918++;
        for (int var2 = 0; var2 < class154.field2019; var2++) {
            int var3 = class407.field5847[var2];
            class531 var4 = class29.field272[var3];
            int var5 = arg1.method2388((byte) -127);
            if ((var5 & 0x40) != 0) {
                var5 += arg1.method2388((byte) -128) << 8;
            }
            if ((var5 & 0x200) != 0) {
                var5 += arg1.method2388((byte) -120) << 16;
            }
            class169.method992(var3, arg1, 124, var4, var5);
        }
        if (arg0 != -77) {
            field2921 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 68)
    public static void method1364(int arg0) {
        if (arg0 == 4) {
            field2921 = null;
            field2919 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 80)
    public class213() {
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 84)
    public class213(String arg0, int arg1) {
        this.field2920 = arg0;
    }
}
