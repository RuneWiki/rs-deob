import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class69 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Lv;")
    public static class122 field1811 = class55.method425(-55, "Wen m\u001c1chten Sie entfernen?");

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lv;")
    public static class122 field1813 = class55.method425(-54, ":duelreq:");

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[B")
    public static byte[] field1814 = new byte[520];

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
    public static int[] field1817 = new int[256];

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lv;")
    public static class122 field1820 = class55.method425(-79, "Schlie\u001c1en");

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[J")
    public static long[] field1821 = new long[32];

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1823 = 0;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "[I")
    public static int[] field1824 = new int[200];

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lv;")
    public static class122 field1819 = class55.method425(-49, "rot:");

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lvb;")
    public static class124 field1810;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lab;")
    public static class3 field1809;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lmb;")
    public static class74 field1812;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1817[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 17)
    public static void method570(byte arg0) {
        field1820 = null;
        field1817 = null;
        field1810 = null;
        field1809 = null;
        field1814 = null;
        if (arg0 != -87) {
            field1824 = null;
        }
        field1813 = null;
        field1824 = null;
        field1811 = null;
        field1819 = null;
        field1812 = null;
        field1821 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILv;Lkd;)I", line = 58)
    public static final int method571(int arg0, class122 arg1, class64 arg2) {
        int var3 = -57 / ((-arg0 - 18) / 32);
        field1816++;
        int var4 = arg2.field1617;
        arg2.method507(arg1.field2971, (byte) 116);
        arg2.field1617 += class19.field482.method385(arg2.field1679, 0, -104, arg1.field2971, arg1.field2923, arg2.field1617);
        return arg2.field1617 - var4;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 78)
    public static final void method572(boolean arg0) {
        field1822++;
        if (!arg0) {
            field1821 = null;
        }
        if (class40.field1010 == 2) {
            class10.method92(128, class38.field996 * 2, (class93.field2378 - class51.field1286 << 7) + class52.field1333, (-class2.field77 + class52.field1343 << 7) + class36.field909);
            if (class5.field134 > -1 && class16.field396 % 20 < 10) {
                class59.field1528[0].method985(class5.field134 - 12, class115.field2823 + -28);
            }
        }
    }
}
