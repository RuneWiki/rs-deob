import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class280 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Ljf;")
    private static class229 field4788 = class212.method1457((byte) 65, "Please wait)3)3)3");

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Ljf;")
    public static class229 field4791 = field4788;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Ljf;")
    public static class229 field4790 = class212.method1457((byte) 109, "(U");

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Ljf;")
    public static class229 field4793 = null;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 15)
    public static final void method1961(byte arg0) {
        field4789++;
        if (class104.field1796) {
            class22.field380 = null;
            class104.field1796 = false;
            int var1 = -54 / ((arg0 + 7) / 52);
            class170.field2964 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V", line = 33)
    public static final void method1962(int arg0, int arg1) {
        if (arg0 != 138318040) {
            field4790 = (class229) null;
        }
        field4795++;
        class122 var2 = class323.method2175(10, arg1, arg0 - 138343913);
        var2.method865(arg0 - 138318086);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lih;B)V", line = 53)
    public static final void method1963(class33 arg0, byte arg1) {
        if (arg1 < 35) {
            field4788 = (class229) null;
        }
        class165 var2 = (class165) class115.field2069.method1890(arg0.field621.method1617(107), -92);
        field4792++;
        if (var2 == null) {
            return;
        }
        if (var2.field2834 != null) {
            class104.field1816.method613(var2.field2834);
            var2.field2834 = null;
        }
        var2.method1747((byte) -119);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V", line = 81)
    public static void method1964(boolean arg0) {
        field4788 = null;
        field4790 = null;
        field4791 = null;
        field4793 = null;
        if (!arg0) {
            method1962(35, -104);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)Lcm;", line = 98)
    public static final class194 method1965(int arg0, int arg1) {
        class194 var2 = (class194) class308.field5196.method229((long) arg0, -14);
        int var3 = 94 % ((-arg1 - 26) / 36);
        field4794++;
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class89.field1629.method1275(class45.method400(arg0, -92), class83.method596(false, arg0), -5211);
        class194 var5 = new class194();
        if (var4 != null) {
            var5.method1326(new class14(var4), -75);
        }
        var5.method1325(116);
        class308.field5196.method227(-25077, var5, (long) arg0);
        return var5;
    }
}
