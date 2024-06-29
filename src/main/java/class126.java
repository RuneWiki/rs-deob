import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class126 {

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "B")
    public byte field1695;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "S")
    public short field1698;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "Z")
    public boolean field1692;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "S")
    public short field1701;

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "S")
    public short field1699;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    public int field1706;

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "B")
    public byte field1704;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "Z")
    public static boolean field1700 = false;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "Lkn;")
    public static class530 field1703;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public static int field1705;

    static {
        new class530("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field1703 = new class530("Drop", "Fallen lassen", "Poser", "Largar");
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)I", line = 12)
    public static final int method833(int arg0, int arg1, int arg2) {
        if (arg1 > -120) {
            field1700 = false;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        field1697++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 34)
    public static void method834(int arg0) {
        field1703 = null;
        if (arg0 != 126) {
            field1700 = true;
        }
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 61)
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field1695 = (byte) arg8;
        this.field1702 = arg2;
        this.field1696 = arg0;
        this.field1698 = (short) arg4;
        this.field1693 = arg3;
        this.field1692 = arg10;
        this.field1701 = (short) arg6;
        this.field1699 = (short) arg5;
        this.field1706 = arg1;
        this.field1694 = arg11;
        this.field1704 = (byte) arg7;
    }
}
