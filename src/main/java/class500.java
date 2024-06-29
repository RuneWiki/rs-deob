import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class500 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Z")
    public static boolean field7079 = false;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILlt;I)V", line = 4)
    public static final void method2852(int arg0, int arg1, int arg2, class289 arg3, int arg4) {
        if (arg0 != 0) {
            method2852(-59, -66, 24, null, -66);
        }
        field7080++;
        for (class65 var5 = (class65) class111.field1644.method1904(false); var5 != null; var5 = (class65) class111.field1644.method1901(120)) {
            if (var5.field1029 == arg2 && arg1 << 9 == var5.field1020 && (arg4 << 9) == var5.field1027 && var5.field1009.field4224 == arg3.field4224) {
                if (var5.field1034 != null) {
                    class556.field8166.method2205(var5.field1034);
                    var5.field1034 = null;
                }
                if (var5.field1036 != null) {
                    class556.field8166.method2205(var5.field1036);
                    var5.field1036 = null;
                }
                var5.method2360((byte) 66);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lps;Lps;Z)V", line = 47)
    public static final void method2853(class5 arg0, class5 arg1, boolean arg2) {
        field7081++;
        class285.field3810++;
        if (arg2) {
            method2854((byte) 95, -83);
        }
        class654 var3 = class631.method3628(class375.field5543, (byte) -51, class357.field5280);
        var3.field9358.method3146(arg0.field65, 80);
        var3.field9358.method3126(2124924176, arg1.field65);
        var3.field9358.method3163(-128, arg1.field53);
        var3.field9358.method3164(arg0.field53, (byte) 109);
        var3.field9358.method3163(-128, arg0.field59);
        var3.field9358.method3163(-128, arg1.field59);
        class444.method2623(119, var3);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Z", line = 71)
    public static final boolean method2854(byte arg0, int arg1) {
        field7078++;
        if (arg0 <= 117) {
            method2852(-87, 108, 96, null, 56);
        }
        return arg1 == 0;
    }
}
