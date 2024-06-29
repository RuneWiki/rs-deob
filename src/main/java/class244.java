import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class244 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public int field3773 = -1;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Ls;")
    public static class186 field3775 = new class186(100, -1);

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lmf;")
    public static class291 field3781 = new class291();

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Lmd;")
    public class384 field3776;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[I")
    public int[] field3779;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field3777;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
    public static final void method1590(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class377.field5514 = arg2;
        class39.field566 = arg0;
        class84.field1744 = arg4;
        field3778++;
        class219.field3443 = arg1;
        if (arg3 <= 20) {
            field3781 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public static void method1591(boolean arg0) {
        field3775 = null;
        field3781 = null;
        if (arg0) {
            field3781 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLda;[Lrs;)Lvo;")
    public static final class32 method1592(boolean arg0, class44 arg1, class466[] arg2) {
        field3774++;
        if (arg0) {
            return null;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field6927 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field6927);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class77.field1559, 0);
        if (class77.field1559[0] == 0) {
            if (class77.field1559[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class77.field1559, 1);
            if (class77.field1559[1] > 1) {
                byte[] var7 = new byte[class77.field1559[1]];
                OpenGL.glGetInfoLogARB(var4, class77.field1559[1], class77.field1559, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class77.field1559[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field6927);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class32(arg1, var4, arg2);
    }

    static {
        new class309("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
    }
}
