import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class475 {

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lbj;")
    public static class162 field7042 = new class162(66, 6);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public int field7037;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public int field7039;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public int field7041;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public int field7046;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method2841(int arg0) {
        field7044++;
        if (arg0 >= -32) {
            method2842(false);
        }
        if (class155.field2523 == -1) {
            return;
        }
        int var1 = class393.field5991.method132(101);
        int var2 = class393.field5991.method139(-109);
        class356 var3 = (class356) class293.field4478.method1892(126);
        if (var3 != null) {
            var1 = var3.method52(-85);
            var2 = var3.method54(false);
        }
        class415.method2549(var2, 0, 4, class65.field1330, 0, 0, class155.field2523, 0, var1, class71.field1415);
        if (class67.field1371 != null) {
            class397.method2463(var1, (byte) 60, var2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method2842(boolean arg0) {
        field7042 = null;
        if (arg0) {
            field7042 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2843(byte arg0, String arg1) {
        field7038++;
        class492.method2969("", 0, arg1, "", arg0 ^ 0xFFFFFF9E, 0);
        if (arg0 != -98) {
            method2842(true);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
    public static final void method2844(int arg0, int arg1) {
        class95.field1867 = arg0;
        if (arg1 > -15) {
            method2842(true);
        }
        field7045++;
        class50.field1009.method2475((byte) 67);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)I")
    public static final int method2845(byte arg0, int arg1) {
        int var2 = -106 / ((-arg0 - 17) / 50);
        field7043++;
        return arg1 & 0xFF;
    }
}
