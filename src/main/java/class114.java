import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class114 extends class246 {

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "[I")
    public static int[] field1739 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field1743 = new String[100];

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1745 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "[[I")
    public static int[][] field1738;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)Luf;")
    public static final class199 method818(byte arg0, int arg1) {
        field1740++;
        class199 var2 = (class199) class264.field4127.method675(31558, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -78) {
            method819((byte) 79);
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class150.field2179.method1605(-128, arg1, 0);
        } else {
            var3 = class27.field522.method1605(arg0 ^ 0x32, arg1 & 0x7FFF, 0);
        }
        class199 var4 = new class199();
        if (var3 != null) {
            var4.method1333(new class54(var3), (byte) 124);
        }
        if (arg1 >= 32768) {
            var4.method1331(42);
        }
        class264.field4127.method677((byte) 120, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method819(byte arg0) {
        field1739 = null;
        field1738 = null;
        if (arg0 >= -36) {
            field1742 = -34;
        }
        field1745 = null;
        field1743 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(BI)Lsk;")
    public static final class189 method820(byte arg0, int arg1) {
        field1741++;
        class189 var2 = (class189) class4.field53.method945((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class160.field2331.method1605(arg0 - 65, class159.method1075(-97, arg1), class150.method1020(arg1, true));
        class189 var4 = new class189();
        var4.field2850 = arg1;
        if (arg0 != -62) {
            field1742 = -66;
        }
        if (var3 != null) {
            var4.method1260(new class54(var3), (byte) 28);
        }
        var4.method1267((byte) 73);
        class4.field53.method941(var4, (long) arg1, -8447);
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lhc;)V")
    public static final void method821(class128 arg0) {
        for (int var1 = arg0.field1882; var1 <= arg0.field1879; var1++) {
            for (int var2 = arg0.field1870; var2 <= arg0.field1876; var2++) {
                class201 var3 = class3.field40[arg0.field1878][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3026; var4++) {
                        if (var3.field3037[var4] == arg0) {
                            var3.field3026--;
                            for (int var5 = var4; var5 < var3.field3026; var5++) {
                                var3.field3037[var5] = var3.field3037[var5 + 1];
                                var3.field3020[var5] = var3.field3020[var5 + 1];
                            }
                            var3.field3037[var3.field3026] = null;
                            break;
                        }
                    }
                    var3.field3036 = 0;
                    for (int var6 = 0; var6 < var3.field3026; var6++) {
                        var3.field3036 |= var3.field3020[var6];
                    }
                }
            }
        }
    }
}
