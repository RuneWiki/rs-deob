import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class75 extends class130 {

    @OriginalMember(owner = "client!og", name = "k", descriptor = "J")
    public long field1267;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Lpn;")
    public static class49 field1268;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Ljp;")
    public static class55 field1270;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIILwl;III)V")
    public static final void method692(int arg0, int arg1, int arg2, class521 arg3, int arg4, int arg5, int arg6) {
        class193.method1331(arg4, arg2, arg0, arg3.field1274, (byte) 102, arg5, arg6, arg3.field1279, arg1, arg3.field1275);
        field1269++;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class75() {
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method693(int arg0) {
        field1268 = null;
        field1270 = null;
        int var1 = 96 / ((-arg0 - 26) / 32);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(J)V")
    public class75(long arg0) {
        this.field1267 = arg0;
    }

    static {
        new class179("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field1268 = new class49(74, 3);
        field1270 = new class55(111, 28);
    }
}
