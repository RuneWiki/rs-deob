import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class141 extends class93 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field1847 = 0;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Lqp;")
    public static class586 field1849 = new class586(46, -2);

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZF)F")
    public static final float method852(boolean arg0, float arg1) {
        field1848++;
        return arg0 ? -0.52826685F : arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method853(byte arg0) {
        int var1 = 11 % ((19 - arg0) / 33);
        field1849 = null;
    }

    static {
        new class487("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }
}
