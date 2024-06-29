import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class19 {

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lkh;")
    public static class117 field539 = class224.method1450((byte) 108, "leuchten1:");

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "J")
    public static volatile long field538 = 0L;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
    public static int[] field534 = new int[1000];

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Lkh;")
    public static class117 field540 = class224.method1450((byte) 112, "Stufe)2");

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lkh;")
    public static class117 field541 = class224.method1450((byte) 126, "(U0a )2 in: ");

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lah;")
    public static class9 field537;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method174(byte arg0) {
        if (arg0 != -5) {
            return;
        }
        field541 = null;
        field539 = null;
        field540 = null;
        field537 = null;
        field534 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BII)I")
    public static final int method175(byte arg0, int arg1, int arg2) {
        field533++;
        int var3 = 119 % ((-arg0 - 22) / 59);
        int var4 = class161.method1150(arg2 + 91923, 4, (byte) -98, arg1 + 45365) + (class161.method1150(arg2 + 37821, 2, (byte) -98, arg1 + 10294) - 128 >> 1) + (class161.method1150(arg2, 1, (byte) -98, arg1) + -128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }
}
