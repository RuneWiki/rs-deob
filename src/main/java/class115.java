import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class115 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lnj;")
    public static class487 field1514 = new class487("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field1522 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method705(int arg0) {
        if (arg0 != 30064) {
            field1522 = -111;
        }
        field1514 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIZIIIII)V")
    public final void method706(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1513 = arg6;
        this.field1526 = arg7 * arg7;
        field1521++;
        this.field1523 = arg9;
        if (arg5) {
            return;
        }
        this.field1516 = arg1;
        this.field1519 = this.field1513 + arg2;
        this.field1525 = this.field1523 + arg0;
        this.field1524 = this.field1523 + arg3;
        this.field1517 = this.field1516 + arg8;
        this.field1520 = this.field1513 + arg10;
        this.field1518 = this.field1516 + arg4;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)Z")
    public final boolean method707(int arg0, int arg1, int arg2, int arg3) {
        field1512++;
        if (this.field1519 > arg3 || arg3 > this.field1520) {
            return false;
        } else if (this.field1524 > arg0 || arg0 > this.field1525) {
            return false;
        } else if (arg2 >= this.field1517 && arg2 <= this.field1518) {
            int var5 = arg3 - this.field1513;
            if (arg1 != 0) {
                method705(48);
            }
            int var6 = arg2 - this.field1516;
            return var5 * var5 + var6 * var6 < this.field1526;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lps;I)Lhg;")
    public static final class449 method708(class428 arg0, int arg1) {
        field1515++;
        if (arg1 != 24771) {
            method708(null, -97);
        }
        return new class449(arg0.method2622((byte) 123), arg0.method2622((byte) 123), arg0.method2622((byte) 125), arg0.method2622((byte) 127), arg0.method2601(arg1 - 24746), arg0.method2561((byte) 110));
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1516 = arg2;
        this.field1513 = arg0;
        this.field1523 = arg1;
        this.field1526 = arg3 * arg3;
        this.field1517 = this.field1516 + arg8;
        this.field1519 = this.field1513 + arg4;
        this.field1525 = this.field1523 + arg7;
        this.field1524 = this.field1523 + arg6;
        this.field1520 = this.field1513 + arg5;
        this.field1518 = this.field1516 + arg9;
    }

    static {
        new class487("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
    }
}
