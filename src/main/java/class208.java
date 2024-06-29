import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class208 extends class168 {

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "Lvh;")
    public static class62 field3144 = new class62(64);

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "[I")
    public static int[] field3151 = new int[5];

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "Lnk;")
    public static class16 field3147;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "Lnk;")
    public static class16 field3150;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)V", line = 7)
    public static void method1455(byte arg0) {
        field3147 = null;
        field3144 = null;
        field3150 = null;
        field3151 = null;
        if (arg0 > -89) {
            field3151 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILdf;)V", line = 20)
    public static final void method1456(int arg0, class185 arg1) {
        class154.method1122(arg0 ^ 0x7FFFE409, arg1, 200000);
        if (arg0 != -7155) {
            field3147 = (class16) null;
        }
        field3148++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lnk;B)V", line = 31)
    public static final void method1457(class16 arg0, byte arg1) {
        field3145++;
        if (class105.field1451) {
            return;
        }
        if (class272.field4317) {
            class239.method1664();
        } else {
            class343.method2367();
        }
        class43.field475 = class292.method2081(class271.field4265, true, arg0);
        int var2 = class95.field1307;
        int var3 = 41 % ((-arg1 - 9) / 60);
        int var4 = var2 * 956 / 503;
        class43.field475.method19((class165.field2546 - var4) / 2, 0, var4, var2);
        class86.field1135 = class89.method565(class156.field2441, (byte) -44, arg0);
        class86.field1135.method1089(class165.field2546 / 2 - (class86.field1135.field2366 / 2), 18);
        class105.field1451 = true;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V", line = 57)
    public static final void method1458(int arg0, int arg1) {
        field3146++;
        if (class28.field330 == 0) {
            class116.field1615.method615(28, arg1);
        } else {
            class2.field23 = arg1;
        }
        int var2 = -65 / ((63 - arg0) / 62);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;IZIIJZZILjava/lang/String;B)V", line = 80)
    public static final void method1459(String arg0, int arg1, boolean arg2, int arg3, int arg4, long arg5, boolean arg6, boolean arg7, int arg8, String arg9, byte arg10) {
        field3149++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class143 var14 = new class143(128);
        var14.method1055(10, 120);
        var14.method1003((arg7 ? 4 : 0) | (arg6 ? 1 : 0) | (arg2 ? 2 : 0), -2);
        var14.method1039(arg5, (byte) 99);
        var14.method1052(var12[0], false);
        var14.method1050(arg9, -32);
        var14.method1052(var12[1], false);
        var14.method1003(class233.field3522, -2);
        var14.method1055(arg3, arg10 + 13);
        var14.method1055(arg4, 101);
        var14.method1052(var12[2], false);
        var14.method1003(arg8, arg10 ^ 0xFFFFFF93);
        var14.method1003(arg1, -2);
        var14.method1052(var12[3], false);
        var14.method1064(class357.field5662, 96, class296.field4655);
        class143 var15 = new class143(350);
        var15.method1050(arg0, arg10 - 128);
        int var16 = 8 - (class55.method334((byte) -5, arg0) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1055((int) (Math.random() * 255.0D), 99);
        }
        var15.method1037(-1381298456, var12);
        class328.field5282.field2295 = 0;
        class328.field5282.method1055(22, 92);
        class328.field5282.method1003(var14.field2295 + var15.field2295 + 2, -2);
        if (arg10 != 109) {
            field3151 = (int[]) null;
        }
        class328.field5282.method1003(549, -2);
        class328.field5282.method1000(var14.field2295, 0, var14.field2260, (byte) -121);
        class328.field5282.method1000(var15.field2295, 0, var15.field2260, (byte) -105);
        class148.field2354 = 1;
        class212.field3217 = 0;
        class285.field4527 = -3;
        class172.field2609 = 0;
    }
}
