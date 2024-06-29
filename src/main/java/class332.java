import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class332 extends class381 {

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "[I")
    public int[] field4366;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "[I")
    public int[] field4367;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "[I")
    public static int[] field4365 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "[I")
    public static int[] field4368;

    static {
        new class304("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBI)Lbk;", line = 8)
    public static final class253 method1911(int arg0, byte arg1, int arg2) {
        field4369++;
        int var3 = -115 / ((arg1 + 81) / 36);
        class253 var4 = (class253) class59.field921.method182((long) arg0 | (long) arg2 << 32, (byte) 106);
        if (var4 == null) {
            var4 = new class253(arg2, arg0);
            class59.field921.method173(var4.field622, var4, (byte) 82);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(II[I[I)V", line = 31)
    public class332(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field4366 = arg2;
        this.field4367 = arg3;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V", line = 44)
    public static void method1912(byte arg0) {
        field4365 = null;
        int var1 = 22 / ((arg0 + 13) / 40);
        field4368 = null;
    }
}
