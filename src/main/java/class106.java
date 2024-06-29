import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class106 {

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "[Lvi;")
    public static class227[] field1882 = new class227[50];

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field1877 = -1;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Loc;")
    public static class151 field1885 = class137.method873(2, "::qa_op_test");

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Loc;")
    private static class151 field1886 = class137.method873(2, "Enter your username (V password)3");

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Loc;")
    public static class151 field1875 = field1886;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Loc;")
    public static class151 field1890 = class137.method873(2, ":duelstake:");

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "J")
    public long field1881;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Lji;")
    public class106 field1887;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Lji;")
    public class106 field1889;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lnd;")
    public static class142 field1884;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "[I")
    public static int[] field1888;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "[[[B")
    public static byte[][][] field1876;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public final void method636(int arg0) {
        field1878++;
        if (this.field1889 == null) {
            return;
        }
        this.field1889.field1887 = this.field1887;
        this.field1887.field1889 = this.field1889;
        if (arg0 <= 57) {
            this.field1887 = null;
        }
        this.field1889 = null;
        this.field1887 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Z")
    public final boolean method637(byte arg0) {
        field1883++;
        if (arg0 != 118) {
            field1875 = null;
        }
        return this.field1889 != null;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
    public static void method638(byte arg0) {
        if (arg0 >= -81) {
            method638((byte) 77);
        }
        field1882 = null;
        field1890 = null;
        field1876 = null;
        field1884 = null;
        field1875 = null;
        field1885 = null;
        field1888 = null;
        field1886 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Llf;)V")
    public static final void method639(class124 arg0) {
        for (int var1 = arg0.field2224; var1 <= arg0.field2218; var1++) {
            for (int var2 = arg0.field2214; var2 <= arg0.field2225; var2++) {
                class72 var3 = class95.field1776[arg0.field2223][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1397; var4++) {
                        if (var3.field1405[var4] == arg0) {
                            var3.field1397--;
                            for (int var5 = var4; var5 < var3.field1397; var5++) {
                                var3.field1405[var5] = var3.field1405[var5 + 1];
                                var3.field1404[var5] = var3.field1404[var5 + 1];
                            }
                            var3.field1405[var3.field1397] = null;
                            break;
                        }
                    }
                    var3.field1395 = 0;
                    for (int var6 = 0; var6 < var3.field1397; var6++) {
                        var3.field1395 |= var3.field1404[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    public static final void method640(int arg0, int arg1) {
        field1880++;
        if (!class197.method1234(arg1, 115)) {
            return;
        }
        class232[] var2 = class115.field2067[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class232 var4 = var2[var3];
            if (var4 != null) {
                var4.field4150 = 0;
                var4.field4171 = 0;
            }
        }
    }
}
