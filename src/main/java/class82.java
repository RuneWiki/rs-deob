import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 extends class12 {

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "I")
    public int field1738 = 0;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "[I")
    public int[] field1739 = new int[5];

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "[Lcb;")
    public class17[] field1747 = new class17[5];

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public int field1743;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Lpe;")
    public static class109 field1735 = class141.method1120(")3", 0);

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Z")
    public static boolean field1731 = false;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field1754 = 0;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Ljf;")
    public static class68 field1733 = new class68(5000);

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "Lpe;")
    public static class109 field1762 = class141.method1120("60 Sekunden noch einmal)3)3)3", 0);

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "Lpe;")
    public static class109 field1761 = class141.method1120("<img=0>", 0);

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lpe;")
    private static class109 field1763 = class141.method1120("Login server offline)3", 0);

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "Lpe;")
    public static class109 field1759 = field1763;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public int field1755;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public int field1757;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "Lpf;")
    public class110 field1753;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "Lqc;")
    public class114 field1758;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "Lvc;")
    public class149 field1751;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "Lfa;")
    public class37 field1750;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "Lia;")
    public class57 field1742;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "Llf;")
    public class82 field1764;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "Lob;")
    public class99 field1752;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "Z")
    public boolean field1740;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "Z")
    public boolean field1744;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "Z")
    public boolean field1756;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "[[[B")
    public static byte[][][] field1765;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)I")
    public static final int method704(int arg0, int arg1, int arg2) {
        field1734++;
        int var3 = arg1 * arg2 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)Z")
    public static final boolean method705(byte arg0, int arg1) {
        field1732++;
        if (arg0 < 68) {
            field1759 = null;
        }
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(III)V")
    public class82(int arg0, int arg1, int arg2) {
        this.field1745 = this.field1743 = arg0;
        this.field1760 = arg2;
        this.field1746 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static void method706(int arg0) {
        field1735 = null;
        field1762 = null;
        field1765 = null;
        field1759 = null;
        field1761 = null;
        if (arg0 != 0) {
            field1731 = true;
        }
        field1763 = null;
        field1733 = null;
    }
}
