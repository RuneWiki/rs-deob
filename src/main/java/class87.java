import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class87 extends class328 {

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "[I")
    public static int[] field1271 = new int[25];

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lwj;")
    public static class270 field1270 = new class270(94, -1);

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "F")
    public static float field1276;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field1277;

    static {
        new class466("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        new class466("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)V", line = 3)
    public final void method4(int arg0, int arg1, int arg2) {
        ++field1272;
        if (arg1 != 0) {
            field1276 = -0.7600229F;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(III)V", line = 16)
    public final void method3(int arg0, int arg1, int arg2) {
        if (arg2 != -1342) {
            this.method5(-127, true, -48);
        }
        ++field1277;
        int var4 = this.field1278 * arg0 >> 12;
        int var5 = this.field1279 * arg0 >> 12;
        int var6 = this.field1274 * arg1 >> 12;
        int var7 = this.field1275 * arg1 >> 12;
        class368.method2217(var5, var7, (byte) 114, var4, var6, super.field4487);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 35)
    public static void method666(byte arg0) {
        field1271 = null;
        field1270 = null;
        if (arg0 < 26) {
            field1276 = 0.44030076F;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIII)V", line = 46)
    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1278 = arg0;
        this.field1274 = arg1;
        this.field1275 = arg3;
        this.field1279 = arg2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZI)V", line = 57)
    public final void method5(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field1275 = 124;
        }
        ++field1273;
    }
}
