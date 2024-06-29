import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class56 extends class164 {

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "Z")
    public static boolean field662 = false;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "Lvm;")
    public static class589 field658 = new class589();

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "Ltda;")
    public static class546 field664 = new class546(14, 0, 4, 1);

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "Lh;")
    public static class572 field666;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "Llu;")
    public static class610 field667;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "Lkg;")
    public static class229 field668;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "[B")
    private byte[] field665;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    public static void method361(boolean arg0) {
        field666 = null;
        if (!arg0) {
            method364(68, true, 37);
        }
        field658 = null;
        field664 = null;
        field668 = null;
        field667 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)V")
    public static final void method362(byte arg0, int arg1) {
        class417 var2 = class494.field7036.method2798((byte) -63);
        if (arg0 != 41) {
            field664 = null;
        }
        while (var2 != null) {
            if ((var2.field5651 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method2457(-8422);
            }
            var2 = class494.field7036.method2806(true);
        }
        field660++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBZ)V")
    public final void method97(int arg0, byte arg1, boolean arg2) {
        field663++;
        if (arg2) {
            return;
        }
        int var4 = arg0 * 2;
        int var5 = arg1 & 0xFF;
        int var6 = var4 + 1;
        this.field665[var4] = (byte) (var5 * 3 >> 5);
        this.field665[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(IIII)[B")
    public final byte[] method363(int arg0, int arg1, int arg2, int arg3) {
        this.field665 = new byte[arg0 * arg2 * arg3 * 2];
        field659++;
        this.method1860(arg1, arg3, arg2, arg0);
        return this.field665;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZI)Z")
    public static final boolean method364(int arg0, boolean arg1, int arg2) {
        field661++;
        if (arg1) {
            field664 = null;
        }
        return class301.method1845(1602556193, arg2, arg0) || class286.method1775(arg2, -39, arg0);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class56() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    static {
        new class572("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field666 = new class572("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");
        field667 = new class610(43, 3);
    }
}
