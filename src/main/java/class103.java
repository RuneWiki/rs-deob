import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class103 {

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    private int field1754;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field1748 = 0;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1740 = 0;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "[I")
    public static int[] field1746 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "Z")
    public static boolean field1760 = false;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Lbe;")
    public static class283 field1756 = class153.method941(-12, "lila:");

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[Lbe;")
    public static class283[] field1752 = new class283[500];

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public int field1739;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lek;")
    public static class172 field1741;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Ldg;")
    public class303 field1745;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[I")
    public int[] field1736;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "[I")
    public int[] field1743;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "[I")
    public int[] field1747;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "[I")
    public int[] field1755;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "[I")
    public int[] field1758;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "[I")
    public static int[] field1761;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "[I")
    public int[] field1763;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[Ldg;")
    public class303[] field1742;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "[[I")
    public int[][] field1749;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "[[I")
    public int[][] field1750;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Lra;", line = 16)
    public static final class304 method676(int arg0, int arg1) {
        class304 var2 = (class304) class114.field1913.method1629(78, (long) arg0);
        field1738++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class306.field5262.method1107(class126.method790(-90, arg0), class97.method651((byte) -93, arg0), 121);
        class304 var4 = new class304();
        var4.field5197 = arg0;
        if (var3 != null) {
            var4.method2060(new class229(var3), (byte) 97);
        }
        var4.method2064(1);
        if (var4.field5143 != -1) {
            var4.method2056((byte) -112, method676(var4.field5143, -1), method676(var4.field5131, -1));
        }
        if (var4.field5135 != -1) {
            var4.method2057((byte) 113, method676(var4.field5135, arg1 ^ 0x0), method676(var4.field5185, -1));
        }
        if (!class195.field3326 && var4.field5125) {
            var4.field5157 = false;
            var4.field5155 = class180.field3103;
            var4.field5129 = null;
            var4.field5191 = 0;
            var4.field5151 = null;
        }
        class114.field1913.method1630(true, (long) arg0, var4);
        return arg1 == -1 ? var4 : (class304) null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILek;)V", line = 61)
    public static final void method677(int arg0, class172 arg1) {
        field1753++;
        arg1.method1097(class200.field3419, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V", line = 77)
    public static final void method678(int arg0, int arg1, int arg2) {
        field1744++;
        class72 var3 = class25.method174(arg0, (byte) 96, arg2);
        var3.method477(-88);
        var3.field1265 = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([BB)V", line = 106)
    private final void method679(byte[] arg0, byte arg1) {
        field1737++;
        class229 var3 = new class229(class236.method1577(19, arg0));
        int var4 = var3.method1535((byte) 114);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1751 = var3.method1528(true);
        } else {
            this.field1751 = 0;
        }
        int var5 = var3.method1535((byte) 92);
        this.field1759 = var3.method1496(true);
        int var6 = 0;
        int var7 = -1;
        this.field1747 = new int[this.field1759];
        if (arg1 != 48) {
            return;
        }
        for (int var8 = 0; var8 < this.field1759; var8++) {
            this.field1747[var8] = var6 += var3.method1496(true);
            if (var7 < this.field1747[var8]) {
                var7 = this.field1747[var8];
            }
        }
        this.field1739 = var7 + 1;
        this.field1749 = new int[this.field1739][];
        this.field1743 = new int[this.field1739];
        this.field1755 = new int[this.field1739];
        this.field1763 = new int[this.field1739];
        this.field1758 = new int[this.field1739];
        if (var5 != 0) {
            this.field1736 = new int[this.field1739];
            for (int var9 = 0; var9 < this.field1739; var9++) {
                this.field1736[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1759; var10++) {
                this.field1736[this.field1747[var10]] = var3.method1528(true);
            }
            this.field1745 = new class303(this.field1736);
        }
        for (int var11 = 0; var11 < this.field1759; var11++) {
            this.field1743[this.field1747[var11]] = var3.method1528(true);
        }
        for (int var12 = 0; var12 < this.field1759; var12++) {
            this.field1763[this.field1747[var12]] = var3.method1528(true);
        }
        for (int var13 = 0; var13 < this.field1759; var13++) {
            this.field1755[this.field1747[var13]] = var3.method1496(true);
        }
        for (int var14 = 0; var14 < this.field1759; var14++) {
            int var15 = 0;
            int var16 = this.field1747[var14];
            int var17 = -1;
            int var18 = this.field1755[var16];
            this.field1749[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field1749[var16][var19] = var15 += var3.method1496(true);
                if (var20 > var17) {
                    var17 = var20;
                }
            }
            this.field1758[var16] = var17 + 1;
            if (var17 + 1 == var18) {
                this.field1749[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1750 = new int[var7 + 1][];
        this.field1742 = new class303[var7 + 1];
        for (int var21 = 0; var21 < this.field1759; var21++) {
            int var22 = this.field1747[var21];
            int var23 = this.field1755[var22];
            this.field1750[var22] = new int[this.field1758[var22]];
            for (int var24 = 0; var24 < this.field1758[var22]; var24++) {
                this.field1750[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field1749[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field1749[var22][var25];
                }
                this.field1750[var22][var26] = var3.method1528(true);
            }
            this.field1742[var22] = new class303(this.field1750[var22]);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 280)
    public static void method680(boolean arg0) {
        if (arg0) {
            method677(1, (class172) null);
        }
        field1756 = null;
        field1741 = null;
        field1752 = null;
        field1746 = null;
        field1761 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([BI)V", line = 322)
    public class103(byte[] arg0, int arg1) {
        this.field1754 = class71.method465(-90, arg0, arg0.length);
        if (this.field1754 != arg1) {
            throw new RuntimeException();
        }
        this.method679(arg0, (byte) 48);
    }
}
