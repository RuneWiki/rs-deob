import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class16 {

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "J")
    public long field469 = 0L;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field463 = "Take";

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "[C")
    public static char[] field471 = new char[] { '-', ' ', ' ', '_', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Lg;")
    public static class181 field476 = null;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lml;")
    public class152 field465;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "Lml;")
    public class152 field473;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "Lek;")
    public static class206 field475;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method166(int arg0, byte arg1) {
        field467++;
        int var2 = 99 % ((22 - arg1) / 32);
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 21)
    public static void method167(byte arg0) {
        if (arg0 <= 79) {
            field462 = -83;
        }
        field471 = null;
        field476 = null;
        field475 = null;
        field463 = null;
    }
}
