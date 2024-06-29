import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class371 {

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public int field5167;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public int field5171;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public int field5168;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lvt;")
    public static class344 field5165;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "[I")
    public static int[] field5169;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V")
    public static final void method2266(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5166++;
        int var5 = -120 % ((-arg1 - 36) / 41);
        if (class535.field7467 <= arg0 && class113.field1453 >= arg0) {
            int var6 = class69.method398((byte) 12, arg4, class355.field4972, class594.field8575);
            int var7 = class69.method398((byte) 20, arg3, class355.field4972, class594.field8575);
            class48.method265(arg2, var6, arg0, var7, 4);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public static final void method2267(byte arg0) {
        class610.field8774.method315(arg0 - 71);
        if (arg0 != 72) {
            field5165 = null;
        }
        field5164++;
        class583.field8437.method315(1);
        class276.field3592.method315(1);
        class280.field3670.method315(1);
        class628.field9150.method315(arg0 ^ 0x49);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static void method2268(int arg0) {
        if (arg0 == -27853) {
            field5165 = null;
            field5169 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5163++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIII)V")
    public class371(int arg0, int arg1, int arg2, int arg3) {
        this.field5167 = arg1;
        this.field5171 = arg2;
        this.field5168 = arg3;
        this.field5170 = arg0;
    }

    static {
        new class344("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field5165 = new class344("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");
        field5169 = new int[] { 32, 39, 44, 47 };
    }
}
