import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class252 extends class154 {

    @OriginalMember(owner = "client!am", name = "k", descriptor = "[I")
    public static int[] field4494 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lud;")
    private static class279 field4495 = class130.method1024("scroll:", 255);

    @OriginalMember(owner = "client!am", name = "r", descriptor = "[Lqm;")
    public static class230[] field4501 = new class230[28];

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field4496 = 0;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Lud;")
    public static class279 field4497 = field4495;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Lud;")
    public static class279 field4502 = field4495;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "[I")
    public static int[] field4503 = new int[2048];

    @OriginalMember(owner = "client!am", name = "v", descriptor = "[I")
    public static int[] field4505 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field4504 = 0;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field4493 = -1;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field4500 = 0;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)I", line = 26)
    public static final int method1806(int arg0, int arg1) {
        field4506++;
        if (arg1 > -62) {
            return -124;
        } else if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V", line = 48)
    public static void method1807(byte arg0) {
        field4501 = null;
        field4497 = null;
        field4495 = null;
        if (arg0 > -94) {
            field4502 = (class279) null;
        }
        field4494 = null;
        field4502 = null;
        field4505 = null;
        field4503 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Lcn;", line = 80)
    public static final class264 method1808(int arg0, byte arg1) {
        field4507++;
        class264 var2 = (class264) class238.field4171.method1336((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class224.field3961.method1192(arg1 ^ 0x4, class161.method1276(arg0, -3420), class37.method337((byte) -116, arg0));
        class264 var4 = new class264();
        if (arg1 != 4) {
            field4504 = -53;
        }
        var4.field4727 = arg0;
        if (var3 != null) {
            var4.method1889(new class53(var3), false);
        }
        var4.method1887((byte) -72);
        if (!class48.field974 && var4.field4764) {
            var4.field4721 = null;
        }
        if (var4.field4745) {
            var4.field4704 = 0;
            var4.field4751 = false;
        }
        class238.field4171.method1331(var4, 30237, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V", line = 151)
    public static final void method1809(byte arg0) {
        class285.field5082++;
        int var1 = 33 % ((8 - arg0) / 44);
        class314.field5534.method1634(219, 0);
        class314.field5534.method490(0L, 14886);
        field4498++;
    }
}
