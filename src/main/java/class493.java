import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class493 {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
    public static int[] field7511 = new int[32];

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Lsk;")
    public static class423 field7513;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lbg;")
    public static class310 field7516;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lsk;")
    public static class423 field7517;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lbg;")
    public static class310 field7518;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field7505;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public int field7507;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public int field7508;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public int field7509;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field7510;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public int field7512;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lwn;")
    public static class488 field7514;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method2977(int arg0) {
        field7517 = null;
        int var1 = 84 % ((53 - arg0) / 55);
        field7516 = null;
        field7511 = null;
        field7514 = null;
        field7513 = null;
        field7518 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Llt;III)Lco;")
    public static final class72 method2978(class458 arg0, int arg1, int arg2, int arg3) {
        field7506++;
        class40 var4 = new class40(arg0.method2715(arg3, arg2, false));
        class72 var5 = new class72(arg3, var4.method239(true), var4.method239(true), var4.method255((byte) 96), var4.method255((byte) 96), var4.method257((byte) 119) == 1, var4.method257((byte) 24), var4.method257((byte) 70));
        int var6 = var4.method257((byte) 121);
        for (int var7 = arg1; var7 < var6; var7++) {
            var5.field1267.method4(arg1 ^ 0x1, new class58(var4.method257((byte) 106), var4.method254((byte) -34), var4.method254((byte) -83), var4.method254((byte) -94), var4.method254((byte) -40), var4.method254((byte) -42), var4.method254((byte) -60), var4.method254((byte) -31), var4.method254((byte) -124)));
        }
        var5.method537((byte) -56);
        return var5;
    }

    static {
        new class423("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field7513 = new class423("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");
        field7515 = 0;
        field7516 = new class310(63, 12);
        field7517 = new class423("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
        field7518 = new class310(51, 3);
    }
}
