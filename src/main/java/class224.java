import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class224 extends class69 {

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    private final int field3851;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    private final int field3847;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    private final int field3845;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    private final int field3849;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    private final int field3850;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    private final int field3857;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    private final int field3855;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    private final int field3854;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "Leg;")
    public static class37 field3842 = class174.method1167("::errortest", 120);

    @OriginalMember(owner = "client!v", name = "z", descriptor = "Lpe;")
    public static class237 field3840 = null;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field3844 = -1;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field3839 = 0;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field3856 = 0;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "Lci;")
    public static class171 field3846 = new class171();

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "[I")
    public static int[] field3852;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static void method1559(boolean arg0) {
        field3842 = null;
        if (!arg0) {
            field3839 = -110;
        }
        field3846 = null;
        field3852 = null;
        field3840 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static final void method1560(int arg0) {
        if (arg0 != 3) {
            method1559(true);
        }
        ++field3841;
        while (~class213.field3680.method1701((byte) -95, class182.field3044) <= -28) {
            int var1 = class213.field3680.method1705((byte) 101, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class55.field833[var1] == null) {
                var2 = true;
                class55.field833[var1] = new class163();
            }
            class163 var3 = class55.field833[var1];
            class98.field1525[class46.field729++] = var1;
            var3.field1759 = class72.field1146;
            if (var3.field2691 != null && var3.field2691.method1858((byte) -39)) {
                class61.method439(-1, var3);
            }
            var3.method1094(-118, class148.method1022(class213.field3680.method1705((byte) 119, 14), (byte) -116));
            int var4 = class213.field3680.method1705((byte) 123, 5);
            int var5 = class213.field3680.method1705((byte) 99, 1);
            if (~var4 < -16) {
                var4 -= 32;
            }
            if (var5 == 1) {
                class203.field3463[class255.field4524++] = var1;
            }
            int var6 = class213.field3680.method1705((byte) 111, 1);
            int var7 = class60.field983[class213.field3680.method1705((byte) 102, 3)];
            if (var2) {
                var3.field1816 = var3.field1798 = var7;
            }
            int var8 = class213.field3680.method1705((byte) 121, 5);
            var3.method768(var3.field2691.field4839, 24025);
            var3.field1770 = var3.field2691.field4834;
            var3.field1767 = var3.field2691.field4885;
            var3.field1827 = var3.field2691.field4868;
            var3.field1790 = var3.field2691.field4877;
            if (~var8 < -16) {
                var8 -= 32;
            }
            var3.field1782 = var3.field2691.field4869;
            var3.field1787 = var3.field2691.field4878;
            var3.field1803 = var3.field2691.field4840;
            var3.field1819 = var3.field2691.field4850;
            if (~var3.field1819 == -1) {
                var3.field1798 = 0;
            }
            var3.method766(-1, class82.field1285.field1812[0] + var4, ~var6 == -2, var3.method763(-1), class82.field1285.field1780[0] - -var8);
            if (var3.field2691.method1858((byte) -39)) {
                class47.method314(0, (class133) null, var3.field1780[0], class237.field4140, var3.field1812[0], var3, true, (class188) null);
            }
        }
        class213.field3680.method1706((byte) 0);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(III)V")
    public final void method418(int arg0, int arg1, int arg2) {
        if (arg1 != 28440) {
            field3856 = -36;
        }
        ++field3853;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public final void method414(int arg0, int arg1, int arg2) {
        int var4 = this.field3854 * arg0 >> 12;
        int var5 = this.field3850 * arg1 >> 12;
        int var6 = this.field3857 * arg0 >> 12;
        if (arg2 == 31712) {
            int var7 = this.field3847 * arg0 >> 12;
            ++field3838;
            int var8 = this.field3851 * arg1 >> 12;
            int var9 = this.field3849 * arg1 >> 12;
            int var10 = this.field3845 * arg0 >> 12;
            int var11 = this.field3855 * arg1 >> 12;
            class159.method1083(var5, (byte) 9, var6, var8, var4, super.field1110, var10, var7, var9, var11);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3851 = arg3;
        this.field3847 = arg4;
        this.field3845 = arg6;
        this.field3849 = arg5;
        this.field3850 = arg1;
        this.field3857 = arg2;
        this.field3855 = arg7;
        this.field3854 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
    public final void method416(int arg0, int arg1, int arg2) {
        ++field3848;
        if (arg0 > -49) {
            method1560(-49);
        }
    }
}
