import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class362 extends class331 {

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field5230;

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "Lps;")
    public static class428 field5228 = new class428(new byte[5000]);

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "Lqp;")
    public static class586 field5232 = new class586(10, -1);

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
    public static int field5233 = -1;

    @OriginalMember(owner = "client!dr", name = "I", descriptor = "[[I")
    public static int[][] field5234 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
    public static int field5231;

    static {
        new class487("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method2218(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5229++;
        if (arg1 >= -101) {
            field5233 = -41;
        }
        class621 var5 = class442.method2691(arg4, 10, true);
        var5.method3592((byte) 115);
        var5.field9070 = arg2;
        var5.field9064 = arg0;
        var5.field9068 = arg3;
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 19)
    public final Object method122(byte arg0) {
        field5231++;
        return arg0 < 104 ? null : this.field5230;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)Z", line = 34)
    public final boolean method121(byte arg0) {
        int var2 = 9 / ((arg0 + 56) / 57);
        field5226++;
        return false;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lws;Ljava/lang/Object;I)V", line = 44)
    public class362(class531 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5230 = arg1;
    }

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "(I)V", line = 55)
    public static void method2219(int arg0) {
        field5232 = null;
        field5228 = null;
        if (arg0 != -23521) {
            field5232 = null;
        }
        field5234 = null;
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(IBI)V", line = 68)
    public static final void method2220(int arg0, byte arg1, int arg2) {
        field5227++;
        if (class461.field6666 == class181.field2783) {
            if (class632.method3679(false, -2, 1, -1, 1, 0, arg2, arg0, 0)) {
                return;
            }
            class632.method3679(false, -3, 1, -1, 1, 0, arg2, arg0, 0);
        } else if (class632.method3679(false, -3, 1, -1, 1, 0, arg2, arg0, 0)) {
            return;
        } else {
            class632.method3679(false, -2, 1, -1, 1, 0, arg2, arg0, 0);
        }
        if (arg1 <= 93) {
            method2220(21, (byte) -81, 66);
        }
    }
}
