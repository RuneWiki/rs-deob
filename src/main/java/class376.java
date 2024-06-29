import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public abstract class class376 extends class115 {

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "[S")
    public static short[] field5669 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "Ldp;")
    public static class347 field5671;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "Lkq;")
    public static class78 field5672;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "Laa;")
    public static class76 field5674;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "[[Lgo;")
    public static class310[][] field5673;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)J")
    public abstract long method950(boolean arg0);

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)I")
    public abstract int method955(byte arg0);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static void method2228(int arg0) {
        field5672 = null;
        if (arg0 == 0) {
            field5673 = null;
            field5669 = null;
            field5674 = null;
            field5671 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)I")
    public abstract int method952(int arg0);

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)I")
    public abstract int method954(int arg0);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lgk;B)V")
    public static final void method2229(class468 arg0, byte arg1) {
        field5670++;
        int var2 = arg0.method2724(255);
        class153.field2327 = new class439[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class153.field2327[var3] = new class439();
            class153.field2327[var3].field6455 = arg0.method2724(arg1 + 378);
            class153.field2327[var3].field6450 = arg0.method2771((byte) 77);
        }
        class378.field5696 = arg0.method2724(arg1 ^ 0xFFFFFF7A);
        class2.field14 = arg0.method2724(255);
        class367.field5584 = arg0.method2724(arg1 ^ 0xFFFFFF7A);
        class295.field4418 = new class152[class2.field14 + 1 - class378.field5696];
        for (int var4 = 0; var4 < class367.field5584; var4++) {
            int var5 = arg0.method2724(arg1 ^ 0xFFFFFF7A);
            class152 var6 = class295.field4418[var5] = new class152();
            var6.field7477 = arg0.method2765(arg1 ^ 0xFFFFFFF2);
            var6.field7473 = arg0.method2722(false);
            var6.field2311 = class378.field5696 + var5;
            var6.field2307 = arg0.method2771((byte) 77);
            var6.field2305 = arg0.method2771((byte) 77);
        }
        class169.field2485 = arg0.method2722(false);
        if (arg1 != -123) {
            method2228(59);
        }
        class488.field7280 = true;
    }

    static {
        new class347("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field5671 = new class347("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");
        field5672 = new class78("WTQA", 2);
        field5674 = new class76(17, 12);
    }
}
