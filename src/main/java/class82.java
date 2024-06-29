import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class82 {

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "Lps;")
    public static class82 field1143 = new class82(1);

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "Lps;")
    public static class82 field1145 = new class82(2);

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "Lps;")
    public static class82 field1146 = new class82(4);

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "Lps;")
    public static class82 field1147 = new class82(1);

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "Lps;")
    public static class82 field1148 = new class82(2);

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "Lps;")
    public static class82 field1149 = new class82(4);

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "Lps;")
    public static class82 field1150 = new class82(2);

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "Lps;")
    public static class82 field1151 = new class82(4);

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "Lvh;")
    public static class328 field1152 = new class328(50);

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "Luc;")
    public static class27 field1154 = new class27(51, 4);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 3)
    public static void method642(int arg0) {
        field1146 = null;
        field1145 = null;
        if (arg0 != 19645) {
            return;
        }
        field1150 = null;
        field1147 = null;
        field1149 = null;
        field1148 = null;
        field1151 = null;
        field1143 = null;
        field1152 = null;
        field1154 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)Z", line = 22)
    public static final boolean method643(int arg0, int arg1, int arg2) {
        if (arg2 < 15) {
            method643(-91, -101, 4);
        }
        field1139++;
        return (arg1 & 0x40000) != 0 | class627.method3488(arg0, arg1, (byte) -102) || class298.method1859(arg0, 19308, arg1);
    }

    @OriginalMember(owner = "client!ps", name = "toString", descriptor = "()Ljava/lang/String;", line = 38)
    public final String toString() {
        field1142++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)I", line = 46)
    public static final int method644(int arg0, int arg1) {
        field1140++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 <= 86) {
            field1145 = null;
        }
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(CZ)Z", line = 63)
    public static final boolean method645(char arg0, boolean arg1) {
        field1144++;
        if (arg1) {
            return true;
        } else {
            return arg0 >= '0' && arg0 <= '9';
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V", line = 81)
    private class82(int arg0) {
        this.field1141 = arg0;
    }
}
