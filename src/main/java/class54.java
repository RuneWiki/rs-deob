import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class54 {

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Li;")
    public static class88 field1005 = class208.method1425(105, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lea;")
    public static class46 field1006 = new class46(new byte[5000]);

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Li;")
    public static class88 field1010 = class208.method1425(105, "Konfig geladen)3");

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "[B")
    public static byte[] field1008 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field1012 = 0;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Li;")
    private static class88 field1013 = class208.method1425(105, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Li;")
    public static class88 field1007 = field1013;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "J")
    public static long field1002;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "Lcc;")
    public static class26 field1011;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "[I")
    public static int[] field1009;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)I")
    public static final int method394(int arg0, int arg1) {
        field1003++;
        int var2 = arg0 * 6 - 61440;
        int var3 = (arg0 * var2 >> 12) + 40960;
        int var4 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var5 = 8 / ((arg1 + 60) / 53);
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB[BI)Li;")
    public static final class88 method395(int arg0, byte arg1, byte[] arg2, int arg3) {
        field1004++;
        class88 var4 = new class88();
        var4.field1660 = 0;
        var4.field1643 = new byte[arg3];
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            if (arg2[var5] != 0) {
                var4.field1643[var4.field1660++] = arg2[var5];
            }
        }
        if (arg1 >= -89) {
            field1012 = -119;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method396(byte arg0) {
        field1009 = null;
        field1005 = null;
        field1013 = null;
        int var1 = 111 % ((44 - arg0) / 39);
        field1006 = null;
        field1010 = null;
        field1008 = null;
        field1011 = null;
        field1007 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Lpc;")
    public static final class166 method397(int arg0, int arg1, int arg2) {
        class52 var3 = class29.field489[arg0][arg1][arg2];
        return var3 == null || var3.field949 == null ? null : var3.field949;
    }
}
