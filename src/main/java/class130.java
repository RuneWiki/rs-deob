import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class130 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lsc;")
    public static class270 field1929 = new class270(2, 4, 4, 0);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "J")
    public long field1932;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Ll;")
    public static class127 field1930;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Ldd;")
    public class130 field1934;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Ldd;")
    public class130 field1936;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lum;")
    public static class83 field1931;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public static final void method945(int arg0) {
        field1927++;
        class472.field6928 = new class455(8);
        class71.field1133 = 0;
        class382 var1 = (class382) class73.field1251.method1076((byte) 116);
        int var2 = 69 % ((13 - arg0) / 36);
        while (var1 != null) {
            var1.method2428();
            var1 = (class382) class73.field1251.method1077(-1);
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
    public static void method946(int arg0) {
        field1929 = null;
        field1931 = null;
        field1930 = null;
        int var1 = 122 / ((arg0 + 67) / 57);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    public final void method947(byte arg0) {
        field1928++;
        if (this.field1936 == null) {
            return;
        }
        this.field1936.field1934 = this.field1934;
        if (arg0 < 90) {
            method948((byte) -49, 124);
        }
        this.field1934.field1936 = this.field1936;
        this.field1936 = null;
        this.field1934 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
    public static final void method948(byte arg0, int arg1) {
        if (arg0 < 91) {
            method945(10);
        }
        class421.method2624((byte) 115);
        field1933++;
        int var2 = class390.field5714.method52(arg1, (byte) -72).field7521;
        if (var2 == 0) {
            return;
        }
        int var3 = class288.field4476.field5434[arg1];
        if (var2 == 6) {
            class216.field3265 = var3;
        }
        if (var2 == 5) {
            class336.field5064 = var3;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)Z")
    public final boolean method949(int arg0) {
        field1935++;
        if (this.field1936 == null) {
            return false;
        } else {
            return arg0 == 1767;
        }
    }
}
