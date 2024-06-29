import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class98 {

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public int field1871 = -1;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field1867 = 0;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lsd;")
    private static class166 field1873 = class135.method935(" seconds)3", 0);

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "Lsd;")
    public static class166 field1875 = class135.method935(" )2> <col=ffff00>", 0);

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Lsd;")
    public static class166 field1878 = field1873;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lsd;")
    public static class166 field1868 = class135.method935("<col=00ff00>", 0);

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Lsd;")
    public static class166 field1877 = class135.method935("<)4col>", 0);

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field1880 = 0;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Lcb;")
    public static class22 field1866;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lcg;")
    public class27 field1869;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "[I")
    public int[] field1876;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "[Lsd;")
    public class166[] field1874;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)I")
    public static final int method738(int arg0, boolean arg1) {
        if (arg1) {
            return -50;
        }
        field1872++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method739(int arg0) {
        field1877 = null;
        field1875 = null;
        field1866 = null;
        field1868 = null;
        field1873 = null;
        field1878 = null;
        if (arg0 != -5527) {
            field1877 = null;
        }
    }
}
