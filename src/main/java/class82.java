import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class82 extends class192 {

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "Lcd;")
    public static class136 field1119 = null;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "Z")
    public static boolean field1125 = false;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public static int field1129 = 0;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "Lga;")
    public class180 field1123;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "Z")
    public static boolean field1124;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "[B")
    public byte[] field1122;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)I", line = 7)
    public final int method598(byte arg0) {
        field1121++;
        if (this.field3055) {
            return 0;
        } else {
            if (arg0 >= -57) {
                field1125 = true;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([Ljava/lang/String;Z[S)V", line = 24)
    public static final void method599(String[] arg0, boolean arg1, short[] arg2) {
        if (arg1) {
            field1129 = -92;
        }
        field1120++;
        class76.method569(arg0.length - 1, 102, arg0, arg2, 0);
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V", line = 44)
    public static void method600(int arg0) {
        int var1 = -29 / ((-arg0 - 72) / 43);
        field1119 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V", line = 62)
    public static final void method601(int arg0, int arg1) {
        field1130++;
        class34 var2 = class91.method656(arg0, -2, 1);
        if (arg1 != 100) {
            field1125 = false;
        }
        var2.method306(arg1 - 87);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLcd;Z)V", line = 79)
    public static final void method602(byte arg0, class136 arg1, boolean arg2) {
        field1128++;
        int var3 = arg1.field1991 == 0 ? arg1.field2137 : arg1.field1991;
        if (arg0 != 65) {
            field1125 = false;
        }
        int var4 = arg1.field2007 == 0 ? arg1.field2078 : arg1.field2007;
        class51.method375(class269.field4182[arg1.field2069 >> 16], var3, -1, var4, arg2, arg1.field2069);
        if (arg1.field2062 != null) {
            class51.method375(arg1.field2062, var3, -1, var4, arg2, arg1.field2069);
        }
        class25 var5 = (class25) class210.field3304.method2168((long) arg1.field2069, (byte) -78);
        if (var5 != null) {
            class170.method1276(var4, var5.field376, arg0 ^ 0xFD8, var3, arg2);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)[B", line = 103)
    public final byte[] method603(boolean arg0) {
        if (!arg0) {
            this.field1118 = 77;
        }
        field1126++;
        if (this.field3055) {
            throw new RuntimeException();
        }
        return this.field1122;
    }
}
