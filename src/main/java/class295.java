import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class295 extends class163 {

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[I")
    public static int[] field5042 = new int[2];

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Lwm;")
    public static class152 field5043 = class157.method1048("M", 124);

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Lwm;")
    private static class152 field5037 = class157.method1048("You can(Wt add yourself to your own ignore list)3", 109);

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Lwm;")
    public static class152 field5044 = class157.method1048("<)4col>", 107);

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lwm;")
    public static class152 field5041 = field5037;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Lwm;")
    public static class152 field5053 = class157.method1048("M", 110);

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public int field5040;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "Loe;")
    public static class127 field5052;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lwm;")
    public class152 field5038;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Lwm;")
    public class152 field5047;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V", line = 15)
    public static void method2033(byte arg0) {
        field5037 = null;
        field5041 = null;
        field5044 = null;
        if (arg0 == -16) {
            field5053 = null;
            field5042 = null;
            field5043 = null;
            field5052 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[BI)I", line = 31)
    public static final int method2034(int arg0, int arg1, byte[] arg2, int arg3) {
        field5050++;
        int var4 = -1;
        int var5 = arg3;
        if (arg0 != 961145416) {
            method2035(-35, false);
        }
        while (var5 < arg1) {
            var4 = var4 >>> 8 ^ class231.field3769[(arg2[var5] ^ var4) & 0xFF];
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)I", line = 54)
    public static final int method2035(int arg0, boolean arg1) {
        field5036++;
        if (arg1) {
            field5053 = (class152) null;
        }
        class49 var2 = class38.method279(arg0, arg1);
        int var3 = var2.field769;
        int var4 = var2.field761;
        int var5 = var2.field763;
        int var6 = class275.field4710[var5 - var4];
        return class249.field4227[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILwm;Z)V", line = 84)
    public static final void method2036(int arg0, class152 arg1, boolean arg2) {
        field5045++;
        class303 var3 = class90.method589(arg2, arg0, 3);
        var3.method2117((byte) 37);
        var3.field5215 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)Lcb;", line = 98)
    public final class281 method2037(int arg0) {
        field5049++;
        return arg0 < 119 ? (class281) null : class123.field1726[this.field2584];
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILwm;)Z", line = 113)
    public static final boolean method2038(int arg0, class152 arg1) {
        field5039++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class199.field3206; var2++) {
            if (arg1.method995(-69, class176.field2838[var2])) {
                return true;
            }
        }
        if (arg0 < 32) {
            field5044 = (class152) null;
        }
        if (arg1.method995(-96, class85.field1176.field146)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BIZZI)V", line = 143)
    public static final void method2039(byte arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg0 != -26) {
            method2036(70, (class152) null, true);
        }
        field5046++;
        class58.method380(0, arg3, arg2, arg4, arg0 - 21, class262.field4456.length + -1, arg1);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V", line = 155)
    public static final void method2040(int arg0) {
        class219.field3563 = null;
        class66.field995 = null;
        class281.field4797 = (int[][][]) null;
        field5048++;
        class323.field5644 = null;
        class195.field3115 = (byte[][][]) null;
        if (arg0 != 0) {
            field5052 = (class127) null;
        }
        class117.field1661 = (byte[][][]) null;
        class27.field465 = null;
        class234.field3839 = (byte[][][]) null;
        class101.field1469 = null;
        class199.field3218 = (byte[][][]) null;
        class60.field912 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I[Ljava/lang/Object;B)V", line = 183)
    public static final void method2041(int[] arg0, Object[] arg1, byte arg2) {
        field5051++;
        if (arg2 != 55) {
            method2040(16);
        }
        class128.method821(0, -45, arg1, arg0, arg0.length - 1);
    }
}
