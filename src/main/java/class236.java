import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class236 {

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lp;")
    public static class280 field4112 = class18.method140((byte) -118, ":duelstake:");

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lp;")
    public static class280 field4110 = class18.method140((byte) -119, "");

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Ltg;")
    public static class180 field4109;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Ltg;")
    public static class180 field4113;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method1583(int arg0) {
        field4113 = null;
        field4112 = null;
        if (arg0 != 11480) {
            method1586(12);
        }
        field4110 = null;
        field4109 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1584(int arg0, int arg1, int arg2, long arg3) {
        class162 var5 = class220.field3787[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2849 != null && var5.field2849.field2869 == arg3) {
            return true;
        } else if (var5.field2852 != null && var5.field2852.field807 == arg3) {
            return true;
        } else if (var5.field2839 != null && var5.field2839.field4303 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2841; var6++) {
                if (var5.field2845[var6].field2805 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIILrk;JLrk;Lrk;)V")
    public static final void method1585(int arg0, int arg1, int arg2, int arg3, class265 arg4, long arg5, class265 arg6, class265 arg7) {
        class196 var9 = new class196();
        var9.field3431 = arg4;
        var9.field3425 = arg1 * 128 + 64;
        var9.field3430 = arg2 * 128 + 64;
        var9.field3427 = arg3;
        var9.field3437 = arg5;
        var9.field3434 = arg6;
        var9.field3440 = arg7;
        int var10 = 0;
        class162 var11 = class220.field3787[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2841; var12++) {
                class160 var13 = var11.field2845[var12];
                if ((var13.field2805 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2811.method426();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3432 = -var10;
        if (class220.field3787[arg0][arg1][arg2] == null) {
            class220.field3787[arg0][arg1][arg2] = new class162(arg0, arg1, arg2);
        }
        class220.field3787[arg0][arg1][arg2].field2843 = var9;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static final void method1586(int arg0) {
        field4108++;
        class104.field1731.method1481(false);
        if (arg0 == -1) {
            class101.field1644.method1481(false);
            class232.field4046.method1481(false);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Z")
    public static final boolean method1587(int arg0, byte arg1) {
        field4111++;
        if (arg1 != 95) {
            return false;
        } else if (arg0 < 0) {
            return false;
        } else {
            int var2 = class275.field4765[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1001;
        }
    }
}
