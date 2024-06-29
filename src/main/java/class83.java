import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class83 {

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lgd;")
    public static class40 field1871 = class14.method90(false, "(U(Y");

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lgd;")
    public static class40 field1873 = class14.method90(false, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lgd;")
    public static class40 field1875 = class14.method90(false, "scrollen:");

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[B")
    public static byte[] field1870 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field1877 = 78;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "J")
    public static long field1874 = 0L;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lgd;")
    public static class40 field1876 = class14.method90(false, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Z")
    public static boolean field1879 = true;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
    public static boolean field1878 = false;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "Lgd;")
    private static class40 field1882 = class14.method90(false, "Please try using a different world)3");

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Lgd;")
    public static class40 field1885 = field1882;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lgd;")
    public static class40 field1872 = field1882;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lgd;")
    public static class40 field1866 = field1882;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Lgd;")
    public static class40 field1881 = field1882;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Lgd;")
    public static class40 field1884 = field1882;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Lgd;")
    public static class40 field1883 = field1882;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Lmb;")
    public static class73 field1886;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[Lhd;")
    public static class46[] field1880;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILfa;I)V", line = 3)
    public static final void method550(int arg0, class31 arg1, int arg2) {
        if (arg1.field792 < 128 || arg1.field838 < 128 || arg1.field792 >= 13184 || arg1.field838 >= 13184) {
            arg1.field827 = -1;
            arg1.field826 = 0;
            arg1.field813 = -1;
            arg1.field822 = 0;
            arg1.field792 = arg1.field803[0] * 128 + arg1.field794 * 64;
            arg1.field838 = arg1.field819[0] * 128 + arg1.field794 * 64;
            arg1.method202(7);
        }
        if (class13.field332 == arg1 && (arg1.field792 < 1536 || arg1.field838 < 1536 || arg1.field792 >= 11776 || arg1.field838 >= 11776)) {
            arg1.field827 = -1;
            arg1.field826 = 0;
            arg1.field813 = -1;
            arg1.field822 = 0;
            arg1.field792 = arg1.field803[0] * 128 + arg1.field794 * 64;
            arg1.field838 = arg1.field819[0] * 128 + arg1.field794 * 64;
            arg1.method202(arg2 ^ 0x48BE);
        }
        field1868++;
        if (arg1.field826 > class10.field242) {
            class93.method629(arg1, (byte) 43);
        } else if (arg1.field822 >= class10.field242) {
            method554(13753, arg1);
        } else {
            class96.method645((byte) -72, arg1);
        }
        class52.method404(2047, arg1);
        class24.method149((byte) -38, arg1);
        if (arg2 != 18617) {
            field1880 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 63)
    public static void method551(boolean arg0) {
        field1880 = null;
        field1886 = null;
        field1884 = null;
        field1882 = null;
        field1872 = null;
        field1881 = null;
        field1885 = null;
        field1875 = null;
        if (!arg0) {
            method553(-72, 76);
        }
        field1870 = null;
        field1871 = null;
        field1883 = null;
        field1876 = null;
        field1873 = null;
        field1866 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BIII)V", line = 89)
    public static final void method552(byte arg0, int arg1, int arg2, int arg3) {
        field1865++;
        if (arg1 < 128 || arg3 < 128 || arg1 > 13056 || arg3 > 13056) {
            class16.field421 = -1;
            class23.field536 = -1;
            return;
        }
        int var4 = class58.method439(arg3, arg1, false, class99.field2361) - arg2;
        int var5 = arg3 - class24.field573;
        int var6 = var4 - class113.field2735;
        int var7 = class97.field2299[class53.field1350];
        int var8 = arg1 - class64.field1561;
        int var9 = class97.field2299[class128.field3073];
        int var10 = class97.field2284[class128.field3073];
        int var11 = var5 * var9 + var8 * var10 >> 16;
        int var12 = class97.field2284[class53.field1350];
        int var13 = var5 * var10 - var8 * var9 >> 16;
        int var15 = var6 * var12 - var7 * var13 >> 16;
        int var16 = var6 * var7 + var12 * var13 >> 16;
        if (arg0 != 57) {
            method553(53, -60);
        }
        if (var16 < 50) {
            class16.field421 = -1;
            class23.field536 = -1;
        } else {
            class23.field536 = (var15 << 9) / var16 + 167;
            class16.field421 = (var11 << 9) / var16 + 256;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Z", line = 144)
    public static final boolean method553(int arg0, int arg1) {
        field1869++;
        if (arg1 < 32) {
            return false;
        }
        if (arg0 != 12683) {
            field1877 = -101;
        }
        if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILfa;)V", line = 181)
    private static final void method554(int arg0, class31 arg1) {
        if (arg0 != 13753) {
            method553(-78, 58);
        }
        if (class10.field242 == arg1.field822 || arg1.field813 == -1 || arg1.field804 != 0 || arg1.field816 + 1 > class22.method126((byte) -116, arg1.field813).field1123[arg1.field799]) {
            int var2 = arg1.field822 - arg1.field826;
            int var3 = class10.field242 - arg1.field826;
            int var4 = arg1.field794 * 64 + arg1.field786 * 128;
            int var5 = arg1.field809 * 128 + arg1.field794 * 64;
            int var6 = arg1.field835 * 128 + arg1.field794 * 64;
            int var7 = arg1.field794 * 64 + arg1.field775 * 128;
            arg1.field838 = ((var2 - var3) * var7 + var3 * var6) / var2;
            arg1.field792 = ((var2 - var3) * var4 + var3 * var5) / var2;
        }
        field1887++;
        if (arg1.field800 == 0) {
            arg1.field781 = 1024;
        }
        if (arg1.field800 == 1) {
            arg1.field781 = 1536;
        }
        arg1.field768 = 0;
        if (arg1.field800 == 2) {
            arg1.field781 = 0;
        }
        if (arg1.field800 == 3) {
            arg1.field781 = 512;
        }
        arg1.field828 = arg1.field781;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)[B", line = 245)
    public static final synchronized byte[] method555(byte arg0, int arg1) {
        field1867++;
        if (arg0 != -100) {
            return null;
        } else if (arg1 == 100 && class131.field3189 > 0) {
            byte[] var2 = class133.field3250[--class131.field3189];
            class133.field3250[class131.field3189] = null;
            return var2;
        } else if (arg1 == 5000 && class59.field1489 > 0) {
            byte[] var3 = class11.field281[--class59.field1489];
            class11.field281[class59.field1489] = null;
            return var3;
        } else if (arg1 == 30000 && class67.field1637 > 0) {
            byte[] var4 = class69.field1665[--class67.field1637];
            class69.field1665[class67.field1637] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
