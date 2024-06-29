import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class32 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lvt;")
    public static class344 field490 = new class344("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static void method184(byte arg0) {
        if (arg0 != 74) {
            method186((byte) -114, null, 54, null);
        }
        field490 = null;
    }

    @OriginalMember(owner = "client!lg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field489++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method185(int arg0, int arg1, int arg2, Class arg3) {
        class563 var4 = class199.field2605[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class15 var5 = var4.field7894; var5 != null; var5 = var5.field158) {
            class450 var6 = var5.field161;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6361 == arg1 && var6.field6359 == arg2) {
                class82.method462(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLuq;ILjava/lang/String;)Lqj;")
    public static final class504 method186(byte arg0, class313 arg1, int arg2, String arg3) {
        if (arg0 >= -83) {
            return null;
        }
        field491++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class579.field8067, 0);
        if (class579.field8067[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class504(arg1, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }
}
