import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "c", descriptor = "Loe;")
    public static class137 field3 = new class137();

    @OriginalMember(owner = "client!us", name = "d", descriptor = "Lhn;")
    public static class509 field4 = new class509(57, 12);

    @OriginalMember(owner = "client!us", name = "e", descriptor = "Ltr;")
    public static class195 field5 = new class195(1, 5);

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 5)
    public static final void method1(int arg0, String arg1, int arg2) {
        field1++;
        int var3 = class111.field1558;
        int[] var4 = class318.field4804;
        boolean var5 = false;
        for (int var6 = arg0; var6 < var3; var6++) {
            class177 var7 = class26.field319[var4[var6]];
            if (var7 != null && class398.field5947 != var7 && var7.field2660 != null && var7.field2660.equalsIgnoreCase(arg1)) {
                var5 = true;
                if (arg2 == 1) {
                    class74.method640(-29627, class101.field1444);
                    class333.field4981++;
                    class71.field1020.method1508(-128, var4[var6]);
                    class71.field1020.method1530(0, (byte) 118);
                } else if (arg2 == 4) {
                    class353.field5233++;
                    class74.method640(-29627, class315.field4750);
                    class71.field1020.method1539((byte) -113, var4[var6]);
                    class71.field1020.method1530(0, (byte) -37);
                } else if (arg2 == 5) {
                    class74.method640(arg0 - 29627, class359.field5325);
                    class261.field3998++;
                    class71.field1020.method1525(-65, 0);
                    class71.field1020.method1539((byte) -103, var4[var6]);
                } else if (arg2 == 6) {
                    class74.method640(-29627, class467.field6750);
                    field2++;
                    class71.field1020.method1545(0, arg0 - 114);
                    class71.field1020.method1508(-128, var4[var6]);
                } else if (arg2 == 7) {
                    class74.method640(-29627, class131.field2009);
                    class448.field6558++;
                    class71.field1020.method1543((byte) 92, 0);
                    class71.field1020.method1539((byte) -113, var4[var6]);
                }
                break;
            }
        }
        if (!var5) {
            class358.method2249(arg0, class12.field154.method1635(class224.field3673, (byte) 117) + arg1);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 97)
    public static void method2(int arg0) {
        field4 = null;
        field5 = null;
        if (arg0 != 12) {
            field5 = null;
        }
        field3 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZZ)Z", line = 113)
    public static boolean method3(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
