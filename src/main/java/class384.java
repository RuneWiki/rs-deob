import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class384 {

    @OriginalMember(owner = "client!la", name = "d", descriptor = "J")
    public long field5139;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public int field5142;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Ljava/lang/String;")
    public String field5140;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Ljava/lang/String;")
    public String field5138;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lh;")
    public static class571 field5141;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
    public static int[] field5145;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method2254(int arg0) {
        field5141 = null;
        if (arg0 != 6530) {
            method2255(88, (byte) 105, 114);
        }
        field5145 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2255(int arg0, byte arg1, int arg2) {
        field5137++;
        class364 var3 = class18.field227.method1201((byte) -98, arg0);
        if (arg2 == 11) {
            arg2 = 10;
        }
        int var4 = -41 / ((arg1 + 58) / 47);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method2179(0, arg2);
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class384(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field5139 = arg4;
        this.field5142 = arg0;
        this.field5136 = arg2;
        this.field5140 = arg1;
        this.field5138 = arg3;
    }

    static {
        new class104("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field5141 = new class571(5);
        new class104("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field5143 = 0;
        field5145 = new int[] { 16, 32, 64, 128 };
    }
}
