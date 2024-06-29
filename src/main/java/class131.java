import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class131 {

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    private int field1826;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[Lhd;")
    private class128[] field1820;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Ljm;")
    public static class126 field1830 = new class126(5000);

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "[I")
    public static int[] field1834 = new int[1024];

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field1835 = -1;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "J")
    private long field1824;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "J")
    public static long field1832;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lhd;")
    private class128 field1821;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "[I")
    public static int[] field1833;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1823;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILnh;)Z")
    public static final boolean method832(int arg0, int arg1, int arg2, class305 arg3) {
        int var4 = 3 / ((arg2 + 52) / 53);
        field1829++;
        byte[] var5 = arg3.method2050(110, arg1, arg0);
        if (var5 == null) {
            return false;
        } else {
            class115.method734(false, var5);
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBC)I")
    public static final int method833(int arg0, byte arg1, char arg2) {
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        field1827++;
        if (arg1 >= -12) {
            field1830 = null;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Lhd;")
    public final class128 method834(byte arg0) {
        field1822++;
        if (this.field1821 == null) {
            return null;
        }
        if (arg0 < 69) {
            field1832 = 1L;
        }
        class128 var2 = this.field1820[(int) ((long) (this.field1826 - 1) & this.field1824)];
        while (this.field1821 != var2) {
            if (this.field1821.field1793 == this.field1824) {
                class128 var3 = this.field1821;
                this.field1821 = this.field1821.field1789;
                return var3;
            }
            this.field1821 = this.field1821.field1789;
        }
        this.field1821 = null;
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lhd;JZ)V")
    public final void method835(class128 arg0, long arg1, boolean arg2) {
        if (!arg2) {
            this.field1821 = null;
        }
        field1819++;
        if (arg0.field1786 != null) {
            arg0.method819((byte) -12);
        }
        class128 var5 = this.field1820[(int) (arg1 & (long) (this.field1826 - 1))];
        arg0.field1793 = arg1;
        arg0.field1789 = var5;
        arg0.field1786 = var5.field1786;
        arg0.field1786.field1789 = arg0;
        arg0.field1789.field1786 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static void method836(byte arg0) {
        int var1 = -74 / ((87 - arg0) / 32);
        field1833 = null;
        field1834 = null;
        field1823 = null;
        field1830 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IJ)Lhd;")
    public final class128 method837(int arg0, long arg1) {
        this.field1824 = arg1;
        field1825++;
        class128 var4 = this.field1820[(int) (arg1 & (long) (this.field1826 - 1))];
        if (arg0 <= 94) {
            return null;
        }
        for (this.field1821 = var4.field1789; this.field1821 != var4; this.field1821 = this.field1821.field1789) {
            if (this.field1821.field1793 == arg1) {
                class128 var5 = this.field1821;
                this.field1821 = this.field1821.field1789;
                return var5;
            }
        }
        this.field1821 = null;
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;ZI)I")
    public static final int method838(String arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1823 = null;
        }
        field1828++;
        return class184.method1172((byte) 102, arg2, arg0, true);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
    public class131(int arg0) {
        this.field1826 = arg0;
        this.field1820 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field1820[var2] = new class128();
            var3.field1786 = var3;
            var3.field1789 = var3;
        }
    }
}
