import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class522 {

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "[Z")
    public boolean[] field7442 = new boolean[256];

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "[Z")
    public boolean[] field7440 = new boolean[16];

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "[I")
    public int[] field7447 = new int[257];

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "[B")
    public byte[] field7449 = new byte[18002];

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "[B")
    public byte[] field7443 = new byte[18002];

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    public int field7455 = 0;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "[[I")
    public int[][] field7445 = new int[6][258];

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "[[I")
    public int[][] field7457 = new int[6][258];

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "I")
    public int field7464 = 0;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "[[B")
    public byte[][] field7441 = new byte[6][258];

    @OriginalMember(owner = "client!raa", name = "x", descriptor = "[I")
    public int[] field7462 = new int[256];

    @OriginalMember(owner = "client!raa", name = "D", descriptor = "[B")
    public byte[] field7468 = new byte[256];

    @OriginalMember(owner = "client!raa", name = "E", descriptor = "[I")
    public int[] field7469 = new int[6];

    @OriginalMember(owner = "client!raa", name = "H", descriptor = "[B")
    public byte[] field7472 = new byte[4096];

    @OriginalMember(owner = "client!raa", name = "w", descriptor = "[[I")
    public int[][] field7461 = new int[6][258];

    @OriginalMember(owner = "client!raa", name = "K", descriptor = "[I")
    public int[] field7474 = new int[16];

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "[B")
    public static byte[] field7452 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!raa", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field7467;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "B")
    public byte field7458;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public int field7439;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public int field7446;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    public int field7448;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
    public int field7450;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public int field7451;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
    public int field7454;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
    public int field7456;

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "I")
    public int field7459;

    @OriginalMember(owner = "client!raa", name = "v", descriptor = "I")
    public int field7460;

    @OriginalMember(owner = "client!raa", name = "A", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!raa", name = "B", descriptor = "I")
    public int field7466;

    @OriginalMember(owner = "client!raa", name = "F", descriptor = "I")
    public int field7470;

    @OriginalMember(owner = "client!raa", name = "G", descriptor = "I")
    public int field7471;

    @OriginalMember(owner = "client!raa", name = "I", descriptor = "I")
    public int field7473;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "[B")
    public byte[] field7453;

    @OriginalMember(owner = "client!raa", name = "y", descriptor = "[B")
    public byte[] field7463;

    static {
        new class572("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field7467 = new String[100];
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lup;I)Z", line = 13)
    public static final boolean method3079(class231 arg0, int arg1) {
        int var2 = -4 % ((-arg1 - 11) / 39);
        field7444++;
        class145 var3 = class216.field3172.method1505(-24044, arg0.method183(-19248));
        if (var3.field2110 == -1) {
            return true;
        } else {
            class554 var4 = class599.field8839.method545(var3.field2110, 34);
            return var4.field8255 == -1 ? true : var4.method3345((byte) -46);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IILte;Ljava/lang/String;)Lwe;", line = 64)
    public static final class346 method3080(int arg0, int arg1, class527 arg2, String arg3) {
        if (arg0 >= -47) {
            field7467 = null;
        }
        field7465++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class465.field6531, 0);
        if (class465.field6531[0] == 0) {
            if (class465.field6531[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class465.field6531, 1);
            if (class465.field6531[1] > 1) {
                byte[] var6 = new byte[class465.field6531[1]];
                OpenGL.glGetInfoLogARB(var4, class465.field6531[1], class465.field6531, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class465.field6531[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class346(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V", line = 134)
    public static void method3081(int arg0) {
        field7467 = null;
        if (arg0 != 6) {
            method3081(24);
        }
        field7452 = null;
    }
}
