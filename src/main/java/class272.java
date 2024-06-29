import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class272 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[Lwda;")
    public static class439[] field3551 = new class439[128];

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lps;")
    public static class5 field3554 = null;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static final void method1622(int arg0) {
        class673.field9460 = 1;
        class642.field9203 = -1;
        field3553++;
        long var1 = (long) arg0;
        if (class119.field1771 == null) {
            class668.method3746(35, true);
        } else {
            class540 var3 = new class540(class461.method2687(class2.method7(-71, class119.field1771), (byte) 87));
            long var4 = var3.method3165(61);
            class27.field465 = var3.method3165(51);
            class504.method2873(true, "", class444.method2626(-4943, var4), (byte) 114);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lcaa;III)V")
    public static final void method1623(class538 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class91.field1390) {
            class44 var4 = class603.field8695[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field672 != null && var4.field672.method309(true)) {
                arg0.method311(0, class503.field7110, class263.field3412, var4.field672, true, 109, 0);
            }
        }
        if (arg3 < class91.field1390) {
            class44 var5 = class603.field8695[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field672 != null && var5.field672.method309(true)) {
                arg0.method311(0, class503.field7110, 0, var5.field672, true, 76, class263.field3412);
            }
        }
        if (arg2 < class91.field1390 && arg3 < class575.field8372) {
            class44 var6 = class603.field8695[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field672 != null && var6.field672.method309(true)) {
                arg0.method311(0, class503.field7110, class263.field3412, var6.field672, true, 35, class263.field3412);
            }
        }
        if (arg2 < class91.field1390 && arg3 > 0) {
            class44 var7 = class603.field8695[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field672 != null && var7.field672.method309(true)) {
                arg0.method311(0, class503.field7110, class263.field3412, var7.field672, true, 104, -class263.field3412);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static final void method1624(byte arg0) {
        int var1 = -41 / ((22 - arg0) / 60);
        class170.field2401.method718(class45.field684, class335.field4872.field9487 ? class221.field2938 + 256 << 2 : -1, 0);
        field3552++;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static final void method1625(byte arg0) {
        field3555++;
        class285 var1 = (class285) class556.field8164.method1904(false);
        if (arg0 > -6) {
            method1626((byte) -11);
        }
        while (var1 != null) {
            if (var1.field3797 > 0) {
                var1.field3797--;
            }
            if (var1.field3797 != 0) {
                if (var1.field3795 > 0) {
                    var1.field3795--;
                }
                if (var1.field3795 == 0 && var1.field3808 >= 1 && var1.field3802 >= 1 && class72.field1144 - 2 >= var1.field3808 && (class668.field9444 - 2) >= var1.field3802 && (var1.field3799 < 0 || class289.method1778((byte) 90, var1.field3805, var1.field3799))) {
                    class345.method2143(var1.field3802, -2, var1.field3805, var1.field3801, -1, var1.field3799, var1.field3807, var1.field3808, var1.field3803);
                    var1.field3795 = -1;
                    if (var1.field3804 == var1.field3799 && var1.field3804 == -1) {
                        var1.method2360((byte) 66);
                    } else if (var1.field3804 == var1.field3799 && var1.field3806 == var1.field3801 && var1.field3805 == var1.field3794) {
                        var1.method2360((byte) 66);
                    }
                }
            } else if (var1.field3804 < 0 || class289.method1778((byte) 52, var1.field3794, var1.field3804)) {
                class345.method2143(var1.field3802, -2, var1.field3794, var1.field3806, -1, var1.field3804, var1.field3807, var1.field3808, var1.field3803);
                var1.method2360((byte) 66);
            }
            var1 = (class285) class556.field8164.method1901(127);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
    public static void method1626(byte arg0) {
        field3554 = null;
        field3551 = null;
        if (arg0 != -127) {
            method1622(-122);
        }
    }
}
