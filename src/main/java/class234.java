import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class234 {

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Lok;")
    public static class41 field3731 = class137.method956(" )2> <col=ff9040>", 45);

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Lok;")
    public static class41 field3742 = class137.method956(":chalreq:", 45);

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Lok;")
    private static class41 field3733 = class137.method956(" from your ignore list first)3", 45);

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "Lok;")
    public static class41 field3746 = field3733;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "Lok;")
    public static class41 field3739 = class137.method956("::errortest", 45);

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "[I")
    public static int[] field3747 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "[I")
    public static int[] field3744 = new int[2];

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[Z")
    public static boolean[] field3730 = new boolean[5];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public int field3740;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public int field3743;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public int field3751;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public int field3752;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public int field3753;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    public int field3756;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lic;", line = 17)
    public static final class171 method1684(int arg0, int arg1) {
        class171 var2 = (class171) class285.field4632.method136((long) arg1, true);
        field3759++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class138.field2069.method454(class223.method1597(1, arg1), 0, class299.method2067(-128, arg1));
        class171 var4 = new class171();
        if (arg0 != -2441) {
            return (class171) null;
        }
        var4.field2733 = arg1;
        if (var3 != null) {
            var4.method1222(12076, new class112(var3));
        }
        var4.method1228(1);
        if (var4.field2793) {
            var4.field2727 = false;
            var4.field2771 = 0;
        }
        if (!class33.field506 && var4.field2765) {
            var4.field2775 = null;
        }
        class285.field4632.method132((long) arg1, var4, arg0 + 2440);
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 51)
    public static final void method1685(int arg0) {
        if (arg0 != -20783) {
            field3731 = (class41) null;
        }
        if (class77.field1145 != null) {
            class77.field1145.method250(false);
        }
        field3750++;
        if (class20.field313 != null) {
            class20.field313.method250(false);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)I", line = 74)
    public static final int method1686(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field3736++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (~var4 == arg1) {
            return 1023 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZZZI)Lmh;", line = 100)
    public static final class65 method1687(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        field3745++;
        if (arg0 != 1000000) {
            method1686(-32, 8, -25, 17);
        }
        class134 var5 = null;
        if (class161.field2548 != null) {
            var5 = new class134(arg4, class161.field2548, class45.field713[arg4], 1000000);
        }
        class198.field3179[arg4] = class110.field1562.method1208(46, arg4, var5, class276.field4534);
        if (arg1) {
            class198.field3179[arg4].method650((byte) -52);
        }
        return new class65(class198.field3179[arg4], arg3, arg2);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 160)
    public static void method1688(byte arg0) {
        int var1 = 43 / ((38 - arg0) / 54);
        field3733 = null;
        field3742 = null;
        field3744 = null;
        field3731 = null;
        field3739 = null;
        field3746 = null;
        field3747 = null;
        field3730 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIILmh;ZBI)V", line = 186)
    public static final void method1689(int arg0, int arg1, int arg2, class65 arg3, boolean arg4, byte arg5, int arg6) {
        class199.field3199 = 1;
        class301.field4874 = arg3;
        class44.field698 = arg2;
        class77.field1142 = arg0;
        field3748++;
        class60.field888 = arg4;
        if (arg5 != 75) {
            method1688((byte) -67);
        }
        class298.field4829 = arg6;
        class65.field994 = arg1;
    }
}
