import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class118 {

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[C")
    public static char[] field1902 = new char[128];

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1897 = "white:";

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field1903 = -1;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "[I")
    public static int[] field1907 = new int[2500];

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lai;")
    public static class126 field1905;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
    public static int[] field1901;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lja;BII)Lnb;", line = 13)
    public static final class315 method871(class64 arg0, byte arg1, int arg2, int arg3) {
        int var4 = -94 / ((arg1 - 16) / 44);
        field1904++;
        return class150.method1152(arg0, arg3, 50, arg2) ? class156.method1179(127) : null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 29)
    public static final void method872(byte arg0) {
        int var1 = 28 / ((arg0 + 50) / 57);
        class183.field2922.method1832((byte) 119);
        field1899++;
        class103.field1740.method1832((byte) -78);
        class134.field2127.method1832((byte) -95);
        class11.field184.method1832((byte) 7);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 42)
    public static void method873(byte arg0) {
        field1902 = null;
        field1907 = null;
        field1901 = null;
        field1897 = null;
        field1905 = null;
        if (arg0 >= -125) {
            method875((class64) null, 56);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)Lai;", line = 61)
    public static final class126 method874(byte arg0) {
        int var1 = class3.field14[0] * class108.field1797[0];
        field1898++;
        byte[] var2 = class270.field4198[0];
        int[] var3 = new int[var1];
        int var4 = 0;
        int var5 = 88 / ((-arg0 - 73) / 52);
        while (var1 > var4) {
            var3[var4] = class251.field3871[class280.method2001(var2[var4], 255)];
            var4++;
        }
        class126 var6;
        if (class265.field4126) {
            var6 = new class105(class326.field5064, class52.field820, class246.field3811[0], class62.field962[0], class108.field1797[0], class3.field14[0], var3);
        } else {
            var6 = new class7(class326.field5064, class52.field820, class246.field3811[0], class62.field962[0], class108.field1797[0], class3.field14[0], var3);
        }
        class233.method1680((byte) -12);
        return var6;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lja;I)V", line = 90)
    public static final void method875(class64 arg0, int arg1) {
        class226.field3611 = arg0;
        field1906++;
        if (arg1 != -19470) {
            method873((byte) 49);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 113)
    public static final void method876(int arg0) {
        field1900++;
        if (arg0 > -104) {
            method874((byte) 51);
        }
        class16.field303.method1837(-127);
    }
}
