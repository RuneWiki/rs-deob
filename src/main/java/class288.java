import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class288 extends class125 {

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public int field5038 = 0;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public int field5049 = -1;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field5032 = 0;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field5036 = 0;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "[I")
    public static int[] field5035 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Loa;")
    public static class99 field5046 = class221.method1463(2844, "(U0a )2 via: ");

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "Loa;")
    public static class99 field5044 = class221.method1463(2844, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "Loa;")
    private static class99 field5052 = class221.method1463(2844, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "Loa;")
    public static class99 field5047 = field5052;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "[I")
    public static int[] field5053 = new int[99];

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public int field5030;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public int field5031;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public int field5033;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public int field5037;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public int field5040;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public int field5042;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public int field5043;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public int field5048;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public int field5050;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "[Lpi;")
    public static class139[] field5028;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "[[[Lef;")
    public static class216[][][] field5054;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILtg;)I")
    public static final int method1933(int arg0, class182 arg1) {
        field5039++;
        if (arg0 != -13429) {
            return -89;
        }
        int var2 = 0;
        if (arg1.method1229(class99.field1681, -1)) {
            var2++;
        }
        if (arg1.method1229(class105.field1760, arg0 ^ 0x3474)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLtf;)Loa;")
    public static final class99 method1934(byte arg0, class107 arg1) {
        int var2 = 125 / ((-arg0 - 22) / 46);
        field5034++;
        if (class290.method1943((byte) -126, client.method1066(arg1)) == 0) {
            return null;
        } else if (arg1.field1790 == null || arg1.field1790.method705(-34).method659(-112) == 0) {
            return class278.field4881 ? class52.field861 : null;
        } else {
            return arg1.field1790;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Z")
    public static final boolean method1935(int arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            field5051++;
            return (arg2 >> arg0 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
    public static final int method1936(int arg0, int arg1) {
        if (arg0 != 0) {
            method1938((byte) 111);
        }
        field5041++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
    public static void method1937(boolean arg0) {
        if (arg0) {
            method1934((byte) -34, (class107) null);
        }
        field5053 = null;
        field5052 = null;
        field5028 = null;
        field5054 = null;
        field5047 = null;
        field5035 = null;
        field5046 = null;
        field5044 = null;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
    public static final void method1938(byte arg0) {
        class165.field2888.method1812(-96);
        if (arg0 >= -33) {
            field5044 = null;
        }
        field5029++;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field5053[var1] = var0 / 4;
        }
    }
}
