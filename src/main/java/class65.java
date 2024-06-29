import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 extends class29 {

    @OriginalMember(owner = "client!jc", name = "Eb", descriptor = "I")
    private int field1662;

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "client!jc", name = "vb", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client!jc", name = "zb", descriptor = "I")
    private int field1657;

    @OriginalMember(owner = "client!jc", name = "ub", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "client!jc", name = "nb", descriptor = "I")
    private int field1645;

    @OriginalMember(owner = "client!jc", name = "Db", descriptor = "Lh;")
    private class49 field1661;

    @OriginalMember(owner = "client!jc", name = "Ab", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client!jc", name = "yb", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!jc", name = "ib", descriptor = "Lwd;")
    public static class150 field1640 = class2.method9(true, "mn");

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "Lwd;")
    private static class150 field1637 = class2.method9(true, "skill)2");

    @OriginalMember(owner = "client!jc", name = "pb", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!jc", name = "lb", descriptor = "I")
    public static int field1643 = 0;

    @OriginalMember(owner = "client!jc", name = "ob", descriptor = "Lwd;")
    public static class150 field1646 = class2.method9(true, "Wen m-Ochten Sie von der Liste entfernen?");

    @OriginalMember(owner = "client!jc", name = "qb", descriptor = "I")
    public static int field1648 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!jc", name = "rb", descriptor = "Lwd;")
    public static class150 field1649 = field1637;

    @OriginalMember(owner = "client!jc", name = "wb", descriptor = "Lwd;")
    public static class150 field1654 = class2.method9(true, "@or3@");

    @OriginalMember(owner = "client!jc", name = "sb", descriptor = "Lwd;")
    public static class150 field1650 = class2.method9(true, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

    @OriginalMember(owner = "client!jc", name = "xb", descriptor = "Lwd;")
    public static class150 field1655 = class2.method9(true, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!jc", name = "Bb", descriptor = "Lwd;")
    public static class150 field1659 = class2.method9(true, "redstone3");

    @OriginalMember(owner = "client!jc", name = "Fb", descriptor = "Lwd;")
    public static class150 field1663 = class2.method9(true, "@gr2@");

    @OriginalMember(owner = "client!jc", name = "jb", descriptor = "Lwd;")
    public static class150 field1641 = class2.method9(true, "gr-Un:");

    @OriginalMember(owner = "client!jc", name = "mb", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!jc", name = "Cb", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!jc", name = "kb", descriptor = "Lff;")
    public static class42 field1642;

    @OriginalMember(owner = "client!jc", name = "tb", descriptor = "[I")
    public static int[] field1651;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public static void method507(int arg0) {
        field1642 = null;
        field1646 = null;
        field1640 = null;
        field1649 = null;
        field1641 = null;
        field1637 = null;
        field1654 = null;
        field1663 = null;
        if (arg0 != 33) {
            method507(103);
        }
        field1651 = null;
        field1650 = null;
        field1655 = null;
        field1659 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)Lbe;")
    public final class13 method12(boolean arg0) {
        field1644++;
        if (this.field1661 != null) {
            int var2 = class11.field280 - this.field1658;
            if (var2 > 100 && this.field1661.field1306 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (this.field1661.field1298[this.field1656] >= var2) {
                            break label42;
                        }
                        var2 -= this.field1661.field1298[this.field1656];
                        this.field1656++;
                    } while (this.field1656 < this.field1661.field1308.length);
                    this.field1656 -= this.field1661.field1306;
                } while (this.field1656 >= 0 && this.field1661.field1308.length > this.field1656);
                this.field1661 = null;
            }
            this.field1658 = class11.field280 - var2;
        }
        class61 var3 = class20.method145(this.field1639, (byte) -95);
        if (!arg0) {
            this.method12(false);
        }
        if (var3.field1560 != null) {
            var3 = var3.method479((byte) 95);
        }
        return var3 == null ? null : var3.method476(this.field1653, this.field1645, this.field1657, this.field1652, -31086, this.field1656, this.field1661, this.field1662, this.field1638);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIIIIZLe;)V")
    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class29 arg9) {
        this.field1662 = arg4;
        this.field1639 = arg0;
        this.field1653 = arg2;
        this.field1638 = arg6;
        this.field1657 = arg1;
        this.field1652 = arg5;
        this.field1645 = arg3;
        if (arg7 != -1) {
            this.field1661 = class111.method785(arg7, 22969);
            this.field1658 = class11.field280 - 1;
            this.field1656 = 0;
            if (this.field1661.field1295 == 0 && arg9 != null && arg9 instanceof class65) {
                class65 var11 = (class65) arg9;
                if (this.field1661 == var11.field1661) {
                    this.field1658 = var11.field1658;
                    this.field1656 = var11.field1656;
                    return;
                }
            }
            if (arg8 && this.field1661.field1306 != -1) {
                this.field1656 = (int) (Math.random() * (double) this.field1661.field1308.length);
                this.field1658 -= (int) (Math.random() * (double) this.field1661.field1298[this.field1656]);
                return;
            }
        }
    }
}
