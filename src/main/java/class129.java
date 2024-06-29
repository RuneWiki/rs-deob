import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class129 {

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    private int field1825 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "[Lpl;")
    public class390[] field1824;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lkn;")
    public static class442 field1823 = new class442("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field1827 = 0;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "J")
    private long field1812;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lnq;")
    public static class268 field1810;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lpl;")
    private class390 field1817;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Lpl;")
    private class390 field1826;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method879(int arg0) {
        if (arg0 != -12936) {
            method879(3);
        }
        field1810 = null;
        field1823 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([Lpl;B)I")
    public final int method880(class390[] arg0, byte arg1) {
        field1822++;
        int var3 = 0;
        if (arg1 != -3) {
            this.method886(-20L, 60);
        }
        for (int var4 = 0; var4 < this.field1809; var4++) {
            class390 var5 = this.field1824[var4];
            for (class390 var6 = var5.field5597; var6 != var5; var6 = var6.field5597) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Lpl;")
    public final class390 method881(byte arg0) {
        field1815++;
        if (arg0 != -68) {
            this.method883((byte) 56, -14L, (class390) null);
        }
        if (this.field1825 > 0 && this.field1824[this.field1825 - 1] != this.field1826) {
            class390 var2 = this.field1826;
            this.field1826 = var2.field5597;
            return var2;
        }
        while (this.field1825 < this.field1809) {
            class390 var3 = this.field1824[this.field1825++].field5597;
            if (this.field1824[this.field1825 - 1] != var3) {
                this.field1826 = var3.field5597;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)Lpl;")
    public final class390 method882(boolean arg0) {
        field1813++;
        if (this.field1817 == null) {
            return null;
        }
        if (!arg0) {
            this.field1826 = null;
        }
        class390 var2 = this.field1824[(int) ((long) (this.field1809 - 1) & this.field1812)];
        while (this.field1817 != var2) {
            if (this.field1817.field5600 == this.field1812) {
                class390 var3 = this.field1817;
                this.field1817 = this.field1817.field5597;
                return var3;
            }
            this.field1817 = this.field1817.field5597;
        }
        this.field1817 = null;
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BJLpl;)V")
    public final void method883(byte arg0, long arg1, class390 arg2) {
        field1820++;
        if (arg2.field5601 != null) {
            arg2.method2467((byte) 117);
        }
        class390 var5 = this.field1824[(int) ((long) (this.field1809 - 1) & arg1)];
        arg2.field5597 = var5;
        arg2.field5601 = var5.field5601;
        arg2.field5601.field5597 = arg2;
        arg2.field5597.field5601 = arg2;
        if (arg0 == -54) {
            arg2.field5600 = arg1;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I")
    public final int method884(int arg0) {
        field1818++;
        return arg0 == 14552 ? this.field1809 : -115;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)Lpl;")
    public final class390 method885(int arg0) {
        this.field1825 = 0;
        if (arg0 >= -51) {
            return null;
        } else {
            field1814++;
            return this.method881((byte) -68);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(JI)Lpl;")
    public final class390 method886(long arg0, int arg1) {
        if (arg1 != 25651) {
            return null;
        }
        field1816++;
        this.field1812 = arg0;
        class390 var4 = this.field1824[(int) (arg0 & (long) (this.field1809 - 1))];
        for (this.field1817 = var4.field5597; this.field1817 != var4; this.field1817 = this.field1817.field5597) {
            if (this.field1817.field5600 == arg0) {
                class390 var5 = this.field1817;
                this.field1817 = this.field1817.field5597;
                return var5;
            }
        }
        this.field1817 = null;
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)I")
    public final int method887(byte arg0) {
        field1819++;
        int var2 = 0;
        if (arg0 != 72) {
            this.method888(78);
        }
        for (int var3 = 0; var3 < this.field1809; var3++) {
            class390 var4 = this.field1824[var3];
            for (class390 var5 = var4.field5597; var5 != var4; var5 = var5.field5597) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public final void method888(int arg0) {
        field1821++;
        int var2 = -67 / ((64 - arg0) / 55);
        for (int var3 = 0; var3 < this.field1809; var3++) {
            class390 var4 = this.field1824[var3];
            while (true) {
                class390 var5 = var4.field5597;
                if (var4 == var5) {
                    break;
                }
                var5.method2467((byte) -75);
            }
        }
        this.field1817 = null;
        this.field1826 = null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V")
    public class129(int arg0) {
        this.field1809 = arg0;
        this.field1824 = new class390[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class390 var3 = this.field1824[var2] = new class390();
            var3.field5597 = var3;
            var3.field5601 = var3;
        }
    }
}
