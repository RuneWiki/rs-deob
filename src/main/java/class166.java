import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class166 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field2793 = 0;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
    public static int[] field2791 = new int[1000];

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Lwa;")
    private static class75 field2798 = class66.method560("M", false);

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Lwa;")
    public static class75 field2800 = field2798;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lwa;")
    public static class75 field2797 = class66.method560("<col=ff0000>", false);

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Lwa;")
    public static class75 field2801 = class66.method560("Weiter", false);

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Lwa;")
    public static class75 field2805 = field2798;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lmc;")
    public static class170 field2794 = new class170();

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Lwa;")
    public static class75 field2806 = class66.method560("; version=1; path=)4; domain=", false);

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "Lwa;")
    public static class75 field2807 = class66.method560("floorshadows", false);

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "Z")
    public static boolean field2808 = false;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "J")
    public static long field2792;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([BZ)Lie;", line = 9)
    public static final class80 method1232(byte[] arg0, boolean arg1) {
        if (arg1) {
            return (class80) null;
        }
        field2796++;
        if (arg0 == null) {
            return null;
        } else {
            class80 var2 = new class80(arg0, class85.field1404, class232.field3934, class210.field3590, class287.field4936, class42.field687);
            class235.method1713(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(JZIIB)Lwa;", line = 28)
    public static final class75 method1233(long arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field2803++;
        class75 var6 = class89.method708(arg4 ^ 0xFFFFE33C, 0);
        if (arg0 < 0L) {
            var6.method633(-95, class207.field3500);
            arg0 = -arg0;
        }
        class75 var7 = class155.field2661;
        class75 var8 = class180.field3017;
        if (arg3 == 1) {
            var8 = class155.field2661;
            var7 = class180.field3017;
        }
        if (arg3 == 2) {
            var7 = class180.field3017;
            var8 = class273.field4716;
        }
        class75 var9 = class89.method708(7391, 0);
        class75 var10 = class89.method708(7391, 0);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method633(-87, class67.method565(30, (int) (arg0 % 10L)));
            arg0 /= 10L;
        }
        int var12 = 0;
        if (arg0 == 0L) {
            var9 = class185.field3070;
        }
        while (arg0 > 0L) {
            if (arg1 && var12 != 0 && var12 % 3 == 0) {
                var9.method633(-108, var8);
            }
            var12++;
            var9.method633(-65, class67.method565(84, (int) (arg0 % 10L)));
            arg0 /= 10L;
        }
        if (var10.method640(1) > 0) {
            var10.method633(arg4 ^ 0x7F, var7);
        }
        if (arg4 == -29) {
            return class66.method562((byte) 118, new class75[] { var6, var9.method625((byte) 39), var10.method625((byte) 39) });
        } else {
            return (class75) null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLre;)Lre;", line = 111)
    public static final class262 method1234(byte arg0, class262 arg1) {
        field2795++;
        if (arg1.field4446 != -1) {
            return class51.method374(-9, arg1.field4446);
        }
        int var2 = arg1.field4418 >>> 16;
        class298 var3 = new class298(class73.field1224);
        if (arg0 < 54) {
            return (class262) null;
        }
        for (class93 var4 = (class93) var3.method2061(0); var4 != null; var4 = (class93) var3.method2060((byte) 120)) {
            if (var4.field1518 == var2) {
                return class51.method374(-100, (int) var4.field3488);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 151)
    public static final void method1235(int arg0) {
        if (arg0 != 10024) {
            field2797 = (class75) null;
        }
        class140.method1079(0, (byte) -50, 0);
        field2802++;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V", line = 191)
    public static void method1236(int arg0) {
        field2797 = null;
        field2807 = null;
        field2805 = null;
        field2800 = null;
        field2798 = null;
        if (arg0 == 1) {
            field2794 = null;
            field2806 = null;
            field2801 = null;
            field2791 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII)Z", line = 213)
    public static final boolean method1237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class154.field2641[arg0][var8][var9] == -class158.field2713) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class53.field879[arg0][arg1][arg3] + arg5;
            if (!class2.method9(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class2.method9(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class2.method9(var10, var12, var14)) {
                return false;
            } else if (class2.method9(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class3.method18(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class2.method9(var6 + 1, class53.field879[arg0][arg1][arg3] + arg5, var7 + 1) && class2.method9(var6 + 128 - 1, class53.field879[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class2.method9(var6 + 128 - 1, class53.field879[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class2.method9(var6 + 1, class53.field879[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
