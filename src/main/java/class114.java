import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class114 {

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "B")
    public byte field1766;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field1757 = 0;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "Lcb;")
    public static class631 field1774 = new class631(83, -1);

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "Ltm;")
    public static class334 field1778 = new class334(94, 3);

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "Llo;")
    public class114 field1776;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "Luw;")
    public class194 field1762;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "Luw;")
    public class194 field1764;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "Lqi;")
    public class291 field1772;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "Lfp;")
    public class466 field1767;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "Lfp;")
    public class466 field1777;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "Lmj;")
    public class713 field1768;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "Lmo;")
    public class733 field1771;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "S")
    public short field1760;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "S")
    public short field1765;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "S")
    public short field1770;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "S")
    public short field1773;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "[[Lraa;")
    public static class353[][] field1763;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 5)
    public static void method916(int arg0) {
        if (arg0 == -20073) {
            field1774 = null;
            field1763 = null;
            field1778 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)I", line = 18)
    public static final int method917(int arg0, int arg1) {
        if (arg1 != -2089) {
            method921((byte) 50, -40, -2, 23);
        }
        field1759++;
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCE) >>> 2);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IC)C", line = 34)
    public static final char method918(int arg0, char arg1) {
        if (arg0 != 69) {
            method919(null, -6, null, null);
        }
        field1761++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(I)V", line = 62)
    public class114(int arg0) {
        this.field1766 = (byte) arg0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 78)
    public static final String method919(String arg0, int arg1, String arg2, String arg3) {
        field1758++;
        int var4 = 16 / ((63 - arg1) / 44);
        for (int var5 = arg0.indexOf(arg2); var5 != -1; var5 = arg0.indexOf(arg2, arg3.length() + var5)) {
            arg0 = arg0.substring(0, var5) + arg3 + arg0.substring(arg2.length() + var5);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V", line = 103)
    public final void method920(int arg0) {
        field1769++;
        while (this.field1772 != null) {
            class291 var2 = this.field1772.field4479;
            this.field1772.method1897(arg0 ^ 0x1A440BA1);
            this.field1772 = var2;
        }
        if (arg0 != -440667103) {
            method918(92, '0');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BIII)V", line = 122)
    public static final void method921(byte arg0, int arg1, int arg2, int arg3) {
        field1775++;
        int var4 = arg2 * class654.field9289.field5420.method155(3) >> 8;
        if (arg0 <= 101) {
            return;
        }
        if (arg1 == -1 && !class354.field5373) {
            class232.method1614((byte) -2);
        } else if (arg1 != -1 && (class647.field9210 != arg1 || !class126.method971((byte) 0)) && var4 != 0 && !class354.field5373) {
            class683.method3812(arg1, var4, 0, 1, arg3, class521.field7518, false);
            class384.method2409(false);
        }
        if (class647.field9210 != arg1) {
            class431.field6300 = null;
        }
        class647.field9210 = arg1;
    }
}
