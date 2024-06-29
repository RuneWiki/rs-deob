import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class63 {

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[I")
    private int[] field1807;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lrd;")
    public static class117 field1797 = class95.method812("Wen m-Ochten Sie der Liste hinzuf-Ugen?", (byte) 8);

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lrd;")
    private static class117 field1804 = class95.method812("red:", (byte) 8);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lrd;")
    public static class117 field1796 = field1804;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lrd;")
    public static class117 field1806 = class95.method812("Angreifen", (byte) 8);

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Lrd;")
    public static class117 field1802 = class95.method812("backvmid2", (byte) 8);

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1803 = 0;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lrd;")
    private static class117 field1809 = class95.method812("Please check your message)2centre for details)3", (byte) 8);

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lrd;")
    public static class117 field1801 = field1804;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lrd;")
    public static class117 field1800 = field1809;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1795 = new CRC32();

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "Lrd;")
    private static class117 field1812 = class95.method812("Close", (byte) 8);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1813 = 127;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1814 = -1;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Lrd;")
    public static class117 field1810 = field1812;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Lrd;")
    public static class117 field1811 = class95.method812("Diese Welt ist voll)3", (byte) 8);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILgd;I)V")
    public static final void method638(int arg0, int arg1, int arg2, class46 arg3, int arg4) {
        field1794++;
        if (class27.field803 >= 50 || field1813 == 0 || (arg3.field1291 == null || arg3.field1291.length <= arg1)) {
            return;
        }
        int var5 = arg3.field1291[arg1];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        class14.field298[class27.field803] = var6;
        int var7 = (var5 & 0x7D) >> arg0;
        class115.field2818[class27.field803] = var7;
        int var8 = var5 & 0xF;
        class77.field2088[class27.field803] = 0;
        class18.field454[class27.field803] = null;
        int var9 = (arg2 - 64) / 128;
        int var10 = (arg4 - 64) / 128;
        class100.field2492[class27.field803] = (var9 << 16) + var8 + (var10 << 8);
        class27.field803++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static final void method639(int arg0) {
        if (arg0 != 18110) {
            return;
        }
        field1798++;
        while (true) {
            class1 var1 = class132.field3168;
            class27 var2;
            synchronized (class132.field3168) {
                var2 = (class27) class132.field3156.method9(-87);
            }
            if (var2 == null) {
                return;
            }
            var2.field795.method55(false, var2.field791, (byte) 2, var2.field792, (int) var2.field2048);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static void method640(byte arg0) {
        if (arg0 != -63) {
            field1813 = -61;
        }
        field1811 = null;
        field1800 = null;
        field1809 = null;
        field1795 = null;
        field1802 = null;
        field1796 = null;
        field1804 = null;
        field1810 = null;
        field1801 = null;
        field1797 = null;
        field1806 = null;
        field1812 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I")
    public final int method641(int arg0, int arg1) {
        field1799++;
        if (arg1 <= 25) {
            field1810 = null;
        }
        int var3 = this.field1807.length - 2;
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field1807[var4];
            if (arg0 == var5) {
                return this.field1807[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static final void method642(boolean arg0) {
        field1805++;
        if (!class53.field1503) {
            return;
        }
        class147.field3597 = null;
        class86.field2241 = null;
        class143.field3409 = null;
        class101.field2532 = null;
        class128.field3116 = null;
        class118.field2913 = null;
        class144.field3431 = null;
        class101.field2546 = null;
        class107.field2671 = null;
        class119.field2929 = null;
        class101.field2531 = null;
        class2.field51 = null;
        class41.field1183 = null;
        class61.field1729 = null;
        class52.field1476 = null;
        class124.field2998 = null;
        class100.field2489 = null;
        class68.field1930 = null;
        class148.field3632 = null;
        class53.field1499 = null;
        class96.field2418 = null;
        class94.field2354 = null;
        class40.method466(2, (byte) 21);
        class59.method606(4096, true);
        class53.field1503 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([I)V")
    public class63(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1807 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1807[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1807[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1807[var5 + var5] = arg0[var4];
            this.field1807[var5 + var5 + 1] = var4++;
        }
    }
}
