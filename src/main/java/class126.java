import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class126 extends class381 {

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public int field1766;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "[C")
    public static char[] field1756 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1763 = "Loading fonts - ";

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "[I")
    public static int[] field1757 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "Ljava/lang/String;")
    public static String field1772 = "scroll:";

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Lac;")
    public static class216 field1759;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Lrk;")
    public static class427 field1765;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)Z", line = 3)
    public final boolean method977(int arg0, boolean arg1) {
        field1758++;
        if (!arg1) {
            field1772 = null;
        }
        return (this.field1767 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)Z", line = 18)
    public final boolean method978(int arg0) {
        field1762++;
        if (arg0 != -2588) {
            this.method986((byte) -92);
        }
        return (this.field1767 & 0x6087AB) >> 22 != 0;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)Z", line = 33)
    public final boolean method979(byte arg0) {
        field1771++;
        if (arg0 != -99) {
            field1757 = null;
        }
        return (this.field1767 & 0x205957) >> 21 != 0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)Z", line = 48)
    public final boolean method980(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field1761++;
            return (this.field1767 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V", line = 59)
    public static final void method981(int arg0) {
        if (arg0 != -758913124) {
            field1768 = 64;
        }
        class127.field1786.method2533(arg0 + 758913124);
        field1760++;
        class362.field4992.method2533(0);
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V", line = 77)
    public static void method982(int arg0) {
        field1765 = null;
        field1759 = null;
        field1756 = null;
        field1763 = null;
        field1772 = null;
        field1757 = null;
        if (arg0 != -14495) {
            field1765 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)Z", line = 92)
    public final boolean method983(int arg0) {
        int var2 = -128 / ((arg0 + 42) / 56);
        field1770++;
        return (this.field1767 & 0x425B13CB) >> 30 != 0;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)I", line = 102)
    public final int method984(boolean arg0) {
        if (arg0) {
            field1765 = null;
        }
        field1764++;
        return this.field1767 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)I", line = 117)
    public static final int method985(int arg0, int arg1, int arg2) {
        field1769++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < arg1) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)Z", line = 152)
    public final boolean method986(byte arg0) {
        int var2 = 23 / ((-arg0 - 25) / 37);
        field1773++;
        return (this.field1767 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)I", line = 165)
    public final int method987(int arg0) {
        if (arg0 == -13163) {
            field1755++;
            return class64.method566(13787, this.field1767);
        } else {
            return -29;
        }
    }

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)Z", line = 176)
    public final boolean method988(int arg0) {
        field1754++;
        if (arg0 == -758913124) {
            return (this.field1767 >> 28 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(II)V", line = 197)
    public class126(int arg0, int arg1) {
        this.field1766 = arg1;
        this.field1767 = arg0;
    }
}
