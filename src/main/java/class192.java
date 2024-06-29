import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class192 extends class117 {

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "[B")
    public byte[] field2811;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field2812 = 0;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "Lti;")
    public static class303 field2814 = new class303(new byte[5000]);

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Lsv;")
    public static class467 field2819 = new class467(7, 0, 1, 1);

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field2821 = 0;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field2820 = -1;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "Lhh;")
    public static class84 field2818;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZI)Lej;")
    public static final class78 method1311(int arg0, boolean arg1, int arg2) {
        field2810++;
        if (arg2 == -29496) {
            long var3 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
            return (class78) class156.field2367.method2485(arg2 + 29578, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
    public static void method1312(int arg0) {
        field2818 = null;
        if (arg0 != 64) {
            field2812 = 2;
        }
        field2819 = null;
        field2814 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;IZJBIZI)V")
    public static final void method1313(int arg0, int arg1, String arg2, String arg3, int arg4, boolean arg5, long arg6, byte arg7, int arg8, boolean arg9, int arg10) {
        field2817++;
        if (class314.field4487 || class106.field1669 >= 500) {
            return;
        }
        int var12 = arg1 == -1 ? class508.field7429 : arg1;
        class231 var13 = new class231(arg3, arg2, var12, arg8, arg0, arg6, arg4, arg10, arg9, arg5);
        class246.field3563.method2270(0, var13);
        class106.field1669++;
        if (arg7 != 35) {
            field2821 = -114;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "([B)V")
    public class192(byte[] arg0) {
        this.field2811 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILir;I)V")
    public static final void method1314(int arg0, class22 arg1, int arg2) {
        field2816++;
        if (arg2 <= 37) {
            field2819 = null;
        }
        int var3 = -1;
        int var4 = 0;
        if (class180.field2734 < arg1.field314) {
            class502.method2988(128, arg1);
        } else if (class180.field2734 <= arg1.field358) {
            class364.method2347((byte) -56, arg1);
        } else {
            class186.method1288(false, -8280, arg1);
            var4 = class432.field6300;
            var3 = class459.field6769;
        }
        if (arg1.field5529 < 128 || arg1.field5539 < 128 || (class237.field3436 * 128 - 128) <= arg1.field5529 || arg1.field5539 >= (class83.field1366 * 128 - 128)) {
            arg1.field359 = -1;
            arg1.field320 = -1;
            var4 = 0;
            var3 = -1;
            arg1.field358 = 0;
            arg1.field372 = -1;
            arg1.field314 = 0;
            arg1.field5529 = arg1.field409[0] * 128 + arg1.method184(1) * 64;
            arg1.field5539 = arg1.field416[0] * 128 + arg1.method184(1) * 64;
            arg1.method196(-121);
        }
        if (class95.field1558 == arg1 && (arg1.field5529 < 1536 || arg1.field5539 < 1536 || arg1.field5529 >= ((class237.field3436 - 12) * 128) || class83.field1366 * 128 - 1536 <= arg1.field5539)) {
            var3 = -1;
            arg1.field358 = 0;
            arg1.field314 = 0;
            arg1.field320 = -1;
            arg1.field372 = -1;
            var4 = 0;
            arg1.field359 = -1;
            arg1.field5529 = arg1.field409[0] * 128 + (arg1.method184(1) * 64);
            arg1.field5539 = arg1.field416[0] * 128 + arg1.method184(1) * 64;
            arg1.method196(-58);
        }
        int var5 = class91.method739(arg1, (byte) -82);
        class261.method1659(var4, 0, var5, var3, arg1);
        class348.method2271((byte) -54, arg1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZF)F")
    public static final float method1315(boolean arg0, float arg1) {
        field2813++;
        if (!arg0) {
            method1314(-92, null, -85);
        }
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[BIII)V")
    public static final void method1316(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field2815++;
        if (arg0 >= arg3) {
            return;
        }
        int var6 = arg3 - arg0 >> 2;
        int var7 = arg0 + arg1;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg3 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg5 == 7190) {
                            return;
                        } else {
                            field2818 = null;
                            return;
                        }
                    }
                    arg2[var7++] = 1;
                }
            }
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
        }
    }
}
