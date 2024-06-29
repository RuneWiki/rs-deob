import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class206 {

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[I")
    public static int[] field3729 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field3732 = 2;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field3735 = 0;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Lke;")
    public static class256 field3734 = class316.method2202("null", 27626);

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Lng;")
    public static class138 field3727;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[Lla;")
    public static class188[] field3726;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILke;III)V", line = 24)
    public static final void method1459(int arg0, class256 arg1, int arg2, int arg3, int arg4) {
        field3731++;
        class188 var5 = client.method832(arg3, arg2 + 15562, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field3410 != null) {
            class119 var6 = new class119();
            var6.field2118 = arg0;
            var6.field2116 = var5;
            var6.field2114 = var5.field3410;
            var6.field2108 = arg1;
            class91.method678((byte) -75, var6);
        }
        if (arg2 != 10205) {
            return;
        }
        boolean var7 = true;
        if (var5.field3357 > 0) {
            var7 = class192.method1390(false, var5);
        }
        if (!var7 || !class157.method1170(client.method828(var5), 1, arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class71.field1296++;
            class308.field5322.method1599(192, (byte) -84);
            class308.field5322.method365((byte) -32, arg3);
            class308.field5322.method366(arg4, -108);
        }
        if (arg0 == 2) {
            class84.field1522++;
            class308.field5322.method1599(35, (byte) 113);
            class308.field5322.method365((byte) -32, arg3);
            class308.field5322.method366(arg4, -125);
        }
        if (arg0 == 3) {
            class90.field1650++;
            class308.field5322.method1599(3, (byte) 87);
            class308.field5322.method365((byte) -32, arg3);
            class308.field5322.method366(arg4, -98);
        }
        if (arg0 == 4) {
            class308.field5322.method1599(124, (byte) 96);
            class197.field3605++;
            class308.field5322.method365((byte) -32, arg3);
            class308.field5322.method366(arg4, -95);
        }
        if (arg0 == 5) {
            class137.field2381++;
            class308.field5322.method1599(155, (byte) 77);
            class308.field5322.method365((byte) -32, arg3);
            class308.field5322.method366(arg4, -102);
        }
        if (arg0 == 6) {
            class308.field5322.method1599(45, (byte) 78);
            class308.field5322.method365((byte) -32, arg3);
            class308.field5322.method366(arg4, -114);
            class9.field138++;
        }
        if (arg0 == 7) {
            class308.field5322.method1599(144, (byte) -108);
            class85.field1539++;
            class308.field5322.method365((byte) -32, arg3);
            class308.field5322.method366(arg4, -99);
        }
        if (arg0 == 8) {
            class46.field854++;
            class308.field5322.method1599(169, (byte) 90);
            class308.field5322.method365((byte) -32, arg3);
            class308.field5322.method366(arg4, -102);
        }
        if (arg0 == 9) {
            class308.field5322.method1599(251, (byte) -113);
            class305.field5267++;
            class308.field5322.method365((byte) -32, arg3);
            class308.field5322.method366(arg4, -126);
        }
        if (arg0 == 10) {
            class177.field3130++;
            class308.field5322.method1599(208, (byte) 106);
            class308.field5322.method365((byte) -32, arg3);
            class308.field5322.method366(arg4, arg2 ^ 0xFFFFD842);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIII)V", line = 156)
    public static final void method1460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class111.field1943 = arg1;
        class148.field2595 = arg4;
        if (arg2 <= 53) {
            field3734 = (class256) null;
        }
        field3736++;
        class64.field1118 = arg3;
        class14.field192 = arg0;
        class14.field189 = arg5;
        if (class64.field1118 >= 100) {
            int var6 = class14.field189 * 128 + 64;
            int var7 = class111.field1943 * 128 + 64;
            int var8 = class297.method2080(var7, 109, class255.field4377, var6) - class148.field2595;
            int var9 = var7 - class50.field926;
            int var10 = var8 - class10.field152;
            int var11 = var6 - class72.field1319;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class180.field3192 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class210.field3784 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class180.field3192 < 128) {
                class180.field3192 = 128;
            }
            if (class180.field3192 > 383) {
                class180.field3192 = 383;
            }
        }
        class192.field3510 = 2;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 223)
    public static void method1461(int arg0) {
        field3729 = null;
        if (arg0 != -30806) {
            field3727 = (class138) null;
        }
        field3727 = null;
        field3734 = null;
        field3726 = null;
    }
}
