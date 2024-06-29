import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class106 {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "B")
    private byte field1876;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lhi;")
    public static class82 field1874 = class95.method664((byte) -79, ")3");

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field1877 = 0;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lhi;")
    public static class82 field1882 = class95.method664((byte) -46, "hint_headicons");

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Lhi;")
    public static class82 field1888 = null;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Lhi;")
    public static class82 field1880 = class95.method664((byte) -86, "Cabbage");

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lum;")
    public static class222 field1884;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)I", line = 5)
    public final int method729(byte arg0) {
        field1878++;
        int var2 = 56 / ((arg0 + 67) / 36);
        return this.field1876 & 0x7;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)I", line = 33)
    public final int method730(byte arg0) {
        if (arg0 <= 49) {
            method731((byte) -53, (int[]) null, 38, 11L);
        }
        field1886++;
        return (this.field1876 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[IIJ)Lhi;", line = 46)
    public static final class82 method731(byte arg0, int[] arg1, int arg2, long arg3) {
        field1883++;
        int var5 = -66 / ((-arg0 - 60) / 38);
        if (class328.field5607 != null) {
            class82 var6 = class328.field5607.method416(arg1, -21323, arg2, arg3);
            if (var6 != null) {
                return var6;
            }
        }
        return arg2 == 5 ? class56.method388(arg3, 0).method553((byte) -74) : class201.method1408(66, arg3);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 99)
    public static void method732(int arg0) {
        field1884 = null;
        field1882 = null;
        field1874 = null;
        field1880 = null;
        field1888 = null;
        int var1 = 15 % ((9 - arg0) / 42);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 114)
    public class106() {
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lbc;)V", line = 116)
    public class106(class153 arg0) {
        this.field1876 = arg0.method1104(-1);
        this.field1885 = arg0.method1090(false);
        this.field1881 = arg0.method1097((byte) -81);
        this.field1875 = arg0.method1097((byte) -72);
        this.field1879 = arg0.method1097((byte) -80);
        this.field1887 = arg0.method1097((byte) -71);
    }
}
