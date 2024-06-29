import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class405 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lug;")
    public static class392 field6071 = new class392();

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Liv;")
    public static class64 field6074 = new class64(76, 7);

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[Lwg;")
    public static class291[] field6076;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lvf;")
    public static class103 field6072;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lm;")
    public static class126 field6073;

    static {
        new class342("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field6076 = new class291[14];
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 5)
    public static void method2475(int arg0) {
        field6073 = null;
        field6076 = null;
        field6074 = null;
        field6071 = null;
        field6072 = null;
        if (arg0 != -1) {
            method2475(-70);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lat;B)I", line = 35)
    public static final int method2476(class255 arg0, byte arg1) {
        field6070++;
        class42 var2 = arg0.field3677;
        int var3 = 52 / ((58 - arg1) / 49);
        if (var2.field797 != null) {
            var2 = var2.method427(class335.field5059, (byte) -80);
            if (var2 == null) {
                return -1;
            }
        }
        int var4 = var2.field825;
        class435 var5 = arg0.method3094(-74);
        if (arg0.field7682) {
            var4 = var2.field776;
        } else if (arg0.field7666 == var5.field6454 || arg0.field7666 == var5.field6493 || arg0.field7666 == var5.field6490 || arg0.field7666 == var5.field6488) {
            var4 = var2.field803;
        } else if (arg0.field7666 == var5.field6450 || arg0.field7666 == var5.field6448 || arg0.field7666 == var5.field6476 || arg0.field7666 == var5.field6462) {
            var4 = var2.field809;
        }
        return var4;
    }
}
