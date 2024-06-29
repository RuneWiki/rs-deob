import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class108 extends class250 {

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field1921 = 0;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "[J")
    public static long[] field1924 = new long[200];

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "[I")
    public static int[] field1926 = new int[32];

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Lml;")
    public static class159 field1920;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lcg;", line = 11)
    public static final class53 method762(int arg0, int arg1) {
        class53 var2 = (class53) class76.field1443.method2077(-13408, (long) arg1);
        field1925++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -19) {
            method762(42, -25);
        }
        byte[] var3 = class42.field808.method1016(1, 100, arg1);
        class53 var4 = new class53();
        if (var3 != null) {
            var4.method421((byte) 61, arg1, new class41(var3));
        }
        class76.field1443.method2074(var4, (long) arg1, -1);
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lke;I)V", line = 37)
    public static final void method763(class256 arg0, int arg1) {
        field1919++;
        class31 var2 = (class31) class234.field4003.method1270((byte) -121);
        if (arg1 != -24376) {
            field1926 = (int[]) null;
        }
        while (var2 != null) {
            if (var2.field506.method1806(false, arg0)) {
                class231.field3950 = var2;
                return;
            }
            var2 = (class31) class234.field4003.method1277(1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLng;)I", line = 76)
    public static final int method764(byte arg0, class138 arg1) {
        field1923++;
        int var2 = 0;
        if (arg1.method1011(class164.field2920, -23605)) {
            var2++;
        }
        if (arg1.method1011(class67.field1240, -23605)) {
            var2++;
        }
        if (arg1.method1011(class205.field3725, -23605)) {
            var2++;
        }
        if (arg1.method1011(class144.field2519, -23605)) {
            var2++;
        }
        if (arg1.method1011(class230.field3944, -23605)) {
            var2++;
        }
        if (arg1.method1011(class118.field2073, -23605)) {
            var2++;
        }
        if (arg1.method1011(class99.field1773, -23605)) {
            var2++;
        }
        if (arg1.method1011(class211.field3801, -23605)) {
            var2++;
        }
        if (arg1.method1011(class254.field4345, -23605)) {
            var2++;
        }
        if (arg0 <= 104) {
            field1920 = (class159) null;
        }
        if (arg1.method1011(class122.field2137, -23605)) {
            var2++;
        }
        if (arg1.method1011(class254.field4359, -23605)) {
            var2++;
        }
        if (arg1.method1011(class172.field3053, -23605)) {
            var2++;
        }
        if (arg1.method1011(class269.field4596, -23605)) {
            var2++;
        }
        if (arg1.method1011(class301.field5187, -23605)) {
            var2++;
        }
        if (arg1.method1011(class295.field5120, -23605)) {
            var2++;
        }
        if (arg1.method1011(class196.field3593, -23605)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 145)
    public static void method765(byte arg0) {
        field1924 = null;
        field1920 = null;
        int var1 = 47 / ((arg0 - 20) / 59);
        field1926 = null;
    }
}
