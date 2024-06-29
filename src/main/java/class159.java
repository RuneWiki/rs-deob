import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class159 extends class69 {

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    private int field2800;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    private int field2804;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    private int field2803;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    private int field2802;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "Lcf;")
    public static class93 field2805 = class147.method1066("details", -48);

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "Lcf;")
    public static class93 field2811 = class147.method1066("leuchten2:", -48);

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "Lcf;")
    public static class93 field2807 = class147.method1066("null", -48);

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Ljc;")
    public static class238 field2799;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "[I")
    public static int[] field2810;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(III)V")
    public final void method470(int arg0, int arg1, int arg2) {
        int var4 = this.field2802 * arg0 >> 12;
        int var5 = this.field2803 * arg1 >> 12;
        int var6 = this.field2800 * arg1 >> 12;
        ++field2801;
        int var7 = this.field2804 * arg0 >> 12;
        class18.method82(var7, var6, arg2 ^ arg2, super.field1255, super.field1253, var4, var5);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIII)V")
    public class159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2800 = arg1;
        this.field2804 = arg2;
        this.field2803 = arg3;
        this.field2802 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)V")
    public final void method467(byte arg0, int arg1, int arg2) {
        ++field2809;
        int var4 = this.field2804 * arg2 >> 12;
        int var5 = this.field2802 * arg2 >> 12;
        int var6 = 40 % ((15 - arg0) / 49);
        int var7 = this.field2800 * arg1 >> 12;
        int var8 = this.field2803 * arg1 >> 12;
        class82.method575(var7, 0, super.field1255, var8, var4, super.field1254, var5, super.field1253);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ls;Lui;Lfl;BIIII)V")
    public static final void method1146(class237 arg0, class227 arg1, class240 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2812;
        class43 var8 = new class43();
        var8.field674 = arg4 * 128;
        var8.field692 = arg5;
        var8.field680 = arg7 * 128;
        if (arg3 <= -121) {
            if (arg2 == null) {
                if (arg1 != null) {
                    var8.field684 = arg1;
                    class145 var9 = arg1.field4062;
                    if (var9.field2523 != null) {
                        var8.field694 = true;
                        var9 = var9.method1058(249);
                    }
                    if (var9 != null) {
                        var8.field679 = (arg7 - -var9.field2504) * 128;
                        var8.field682 = (var9.field2504 + arg4) * 128;
                        var8.field687 = class267.method1786(49, arg1);
                        var8.field693 = var9.field2513 * 128;
                    }
                    class58.field990.method1152((byte) -5, var8);
                    return;
                }
                if (arg0 != null) {
                    var8.field688 = arg0;
                    var8.field679 = (arg0.method1475(false) + arg7) * 128;
                    var8.field682 = 128 * (arg0.method1475(false) + arg4);
                    var8.field687 = class68.method461(arg0, 786864876);
                    var8.field693 = arg0.field4224 * 128;
                    class117.field2064.method137(arg0.field4247.method679((byte) -93), var8, -1);
                    return;
                }
            } else {
                var8.field693 = arg2.field4319 * 128;
                var8.field672 = arg2.field4283;
                int var10 = arg2.field4288;
                var8.field681 = arg2.field4320;
                var8.field675 = arg2.field4296;
                var8.field685 = arg2;
                int var11 = arg2.field4285;
                if (arg6 == 1 || ~arg6 == -4) {
                    var10 = arg2.field4285;
                    var11 = arg2.field4288;
                }
                var8.field682 = (arg4 + var11) * 128;
                var8.field679 = (arg7 - -var10) * 128;
                var8.field687 = arg2.field4332;
                if (arg2.field4275 != null) {
                    var8.field694 = true;
                    var8.method243(24946);
                }
                if (var8.field675 != null) {
                    var8.field689 = var8.field681 + (int) (Math.random() * (double) (-var8.field681 + var8.field672));
                }
                class70.field1278.method1152((byte) -5, var8);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lhg;Lhg;Lvj;ZLhg;)Z")
    public static final boolean method1147(class177 arg0, class177 arg1, class115 arg2, boolean arg3, class177 arg4) {
        class234.field4175 = arg2;
        class254.field4605 = arg4;
        ++field2798;
        class66.field1209 = arg0;
        class203.field3653 = arg1;
        if (arg3) {
            method1147((class177) null, (class177) null, (class115) null, true, (class177) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public final void method465(int arg0, int arg1, int arg2) {
        ++field2796;
        int var4 = this.field2802 * arg2 >> 12;
        int var5 = this.field2804 * arg2 >> 12;
        if (arg1 >= -64) {
            field2799 = null;
        }
        int var6 = this.field2800 * arg0 >> 12;
        int var7 = this.field2803 * arg0 >> 12;
        class113.method810(var5, var7, super.field1254, var6, var4, 117);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
    public static final int method1148(int arg0, int arg1) {
        ++field2808;
        class141 var2 = class264.method1774(arg1, -6);
        int var3 = var2.field2462;
        int var4 = var2.field2463;
        int var5 = var2.field2456;
        if (arg0 != 1051585612) {
            return -7;
        } else {
            int var6 = class136.field2384[var5 - var3];
            return var6 & class176.field3061[var4] >> var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public static void method1149(int arg0) {
        field2807 = null;
        field2805 = null;
        field2810 = null;
        field2811 = null;
        if (arg0 != 1053812876) {
            method1150(84, 36, (byte) 15, 0, 6, -21, 126, 40, -45, 84);
        }
        field2799 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method1150(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2813;
        class53 var10 = (class53) class284.field5093.method1151(105);
        class53 var11 = null;
        while (var10 != null) {
            if (var10.field871 == arg5 && ~var10.field883 == ~arg7 && ~var10.field879 == ~arg0 && ~var10.field865 == ~arg1) {
                var11 = var10;
                break;
            }
            var10 = (class53) class284.field5093.method1159(49);
        }
        if (var11 == null) {
            var11 = new class53();
            var11.field871 = arg5;
            var11.field879 = arg0;
            var11.field883 = arg7;
            var11.field865 = arg1;
            class177.method1272(var11, (byte) -107);
            class284.field5093.method1152((byte) -5, var11);
        }
        var11.field872 = arg9;
        var11.field864 = arg3;
        var11.field863 = arg6;
        var11.field870 = arg8;
        var11.field877 = arg4;
        if (arg2 != 7) {
            method1149(81);
        }
    }
}
