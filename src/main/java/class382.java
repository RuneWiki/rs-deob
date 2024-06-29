import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class382 extends class476 {

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Lkn;")
    public static class530 field5381 = new class530("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Lam;")
    public static class455 field5382;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Loi;")
    public static class53 field5384;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "[B")
    private byte[] field5379;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "[Lun;")
    public static class296[] field5383;

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class382() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBI)V")
    public final void method2219(int arg0, byte arg1, int arg2) {
        field5380++;
        int var4 = arg0 * 2;
        byte var5 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        if (arg2 != 3395) {
            field5381 = null;
        }
        this.field5379[var4++] = var5;
        this.field5379[var4] = var5;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static void method2220(byte arg0) {
        field5383 = null;
        field5382 = null;
        if (arg0 <= 104) {
            method2220((byte) -2);
        }
        field5384 = null;
        field5381 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)[B")
    public final byte[] method2221(int arg0, int arg1, int arg2, int arg3) {
        field5385++;
        if (arg0 <= 79) {
            this.method2221(-93, -26, -41, -46);
        }
        this.field5379 = new byte[arg1 * arg3 * arg2 * 2];
        this.method1864(arg1, arg2, arg3, (byte) -115);
        return this.field5379;
    }

    static {
        new class530("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        new class530("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }
}
