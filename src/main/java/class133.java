import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class133 {

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "B")
    public byte field1818;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public int field1830;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Lai;")
    public class133 field1821;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Lbn;")
    public static class160 field1831 = new class160(43, 3);

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field1834 = 0;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public int field1814;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public int field1816;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "Lic;")
    public static class235 field1825;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "Lcs;")
    public static class401 field1833;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIZ)I")
    public static final int method889(int arg0, int arg1, int arg2, boolean arg3) {
        field1817++;
        if (class215.field3069 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        if (arg3) {
            method889(-98, -109, -5, true);
        }
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || (class195.field2745 - 1) < var4 || class78.field984 - 1 < var5) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class131.field1790[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class215.field3069[var6].method1427(arg1, arg2);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/lang/String;ZI)I")
    public static final int method890(int arg0, String arg1, boolean arg2, int arg3) {
        field1813++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        int var5 = -82 % ((arg0 - 20) / 33);
        boolean var6 = false;
        int var7 = 0;
        int var8 = arg1.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg1.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg2) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg3 <= var12) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg3 * var7 + var12;
            if (var11 / arg3 != var7) {
                throw new NumberFormatException();
            }
            var6 = true;
            var7 = var11;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method891(byte arg0) {
        if (arg0 <= 22) {
            method891((byte) -40);
        }
        field1825 = null;
        field1831 = null;
        field1833 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method892(boolean arg0, String arg1) {
        field1832++;
        if (class253.field3720 == null) {
            return;
        }
        class316.field4621++;
        class257.method1773((byte) -10, class28.field396);
        class159.field2132.method1727(-128, class248.method1646(arg1, (byte) -55));
        if (arg0) {
            class159.field2132.method1712(arg1, 87);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIIB)V")
    public class133(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field1818 = arg4;
        this.field1819 = arg0;
        this.field1823 = arg1;
        this.field1830 = arg3;
        this.field1820 = arg2;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static final void method893(byte arg0) {
        class160.field2138.method2313(127);
        field1815++;
        if (arg0 <= 75) {
            method889(-110, -40, 112, false);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lai;I)V")
    public class133(class133 arg0, int arg1) {
        this.field1821 = arg0;
        this.field1820 = this.field1821.field1820 + arg1;
        this.field1823 = this.field1821.field1823 + arg1;
        this.field1830 = this.field1821.field1830 + arg1;
        this.field1818 = this.field1821.field1818;
        this.field1819 = this.field1821.field1819;
    }

    static {
        new class409("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
