import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class70 {

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Lmh;")
    private static class62 field1073 = class201.method1405(true, "OFF");

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lmh;")
    public static class62 field1072 = class201.method1405(true, ")4");

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field1071 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lmh;")
    public static class62 field1069 = field1073;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field1076 = 0;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Led;")
    public static class49 field1070 = new class49(16);

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lmh;")
    public static class62 field1077 = class201.method1405(true, "Konfig geladen)3");

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 25)
    public static void method508(byte arg0) {
        field1070 = null;
        field1073 = null;
        if (arg0 != 14) {
            field1071 = 114;
        }
        field1069 = null;
        field1077 = null;
        field1072 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZB)V", line = 63)
    public static final void method509(boolean arg0, byte arg1) {
        for (int var2 = 0; var2 < class133.field2163; var2++) {
            long var3 = (long) class288.field4914[var2] << 32 | 0x20000000L;
            class204 var5 = class301.field5186[class288.field4914[var2]];
            if (var5 != null && var5.method1100(26422) && arg0 == var5.field3435.field4700 && var5.field3435.method1879(false)) {
                int var6 = var5.field3814 >> 7;
                int var7 = var5.field3821 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var5.method1101(true) == 1 && (var5.field3821 & 0x7F) == 64 && (var5.field3814 & 0x7F) == 64) {
                        if (class134.field2179[var7][var6] == class282.field4815) {
                            continue;
                        }
                        class134.field2179[var7][var6] = class282.field4815;
                    }
                    if (!var5.field3435.field4708) {
                        var3 |= Long.MIN_VALUE;
                    }
                    var5.field3819 = class165.method1186((byte) -58, var5.field3814, var5.field3821, class7.field85);
                    class80.method618(class7.field85, var5.field3821, var5.field3814, var5.field3819, (var5.method1101(true) * 64 - 64) + 60, var5, var5.field3856, var3, var5.field3839);
                }
            }
        }
        field1075++;
        if (arg1 != 10) {
            field1072 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILhi;IZLhi;)Llf;", line = 115)
    public static final class299 method510(int arg0, class26 arg1, int arg2, boolean arg3, class26 arg4) {
        field1074++;
        if (class127.method951(arg1, arg0, -123, arg2)) {
            if (!arg3) {
                method508((byte) -9);
            }
            return class135.method1021(false, arg4.method157(arg2, arg0, (byte) 19));
        } else {
            return null;
        }
    }
}
