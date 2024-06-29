import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class474 {

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    private int field6635;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    private int field6641;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "Z")
    private boolean field6637;

    @OriginalMember(owner = "client!uda", name = "l", descriptor = "Z")
    private boolean field6646;

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "Loo;")
    public static class652 field6644 = new class652(10);

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!uda", name = "k", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!uda", name = "m", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!uda", name = "n", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method2813(boolean arg0) {
        field6648++;
        if (arg0) {
            method2818((byte) -75);
        }
        return this.field6637;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)I", line = 16)
    public final int method2814(int arg0) {
        field6638++;
        if (arg0 != 0) {
            method2815(true, -86, 91);
        }
        return this.field6635;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZII)Z", line = 31)
    public static final boolean method2815(boolean arg0, int arg1, int arg2) {
        field6640++;
        if (arg0) {
            method2817((byte) 31);
        }
        return (arg1 & 0x800) != 0 && (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lvn;IIIIIILvn;II)V", line = 43)
    public static final void method2816(class330 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class330 arg7, int arg8, int arg9) {
        field6639++;
        int var10 = arg0.method2101(arg9 ^ 0x4E08);
        if (arg9 != -20067) {
            method2817((byte) 78);
        }
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class241 var12 = (class241) class354.field4977.method3742((byte) 67, (long) var10);
        if (var12 == null) {
            class1[] var13 = class1.method14(class152.field2163, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class37.field491.method551(var13[0], true);
            class354.field4977.method3739((long) var10, (byte) 50, var12);
        }
        class773.method4258(arg6, arg7.field5742, (byte) -125, arg5 >> 1, arg2, arg7.field5746, arg7.field5755, 0, arg7.method2102(true) * 256, arg3 >> 1);
        int var14 = arg4 + class470.field6591[0] - 18;
        int var15 = class470.field6591[1] + arg1 - 16 - 54;
        int var16 = arg8 / 4 * 18 + var14;
        int var17 = arg8 % 4 * 18 + var15;
        var12.method1604(var16, var17);
        if (arg0 == arg7) {
            class37.field491.method540(18, var16 - 1, 25951, -256, var17 - 1, 18);
        }
        class33.method272(var16 - 1, var17 - 1, var17 + 18, false, var16 + 18);
        class360 var18 = class626.method3601(86);
        var18.field5056 = var17 + 16;
        var18.field5053 = arg0;
        var18.field5051 = var16;
        var18.field5055 = var16 + 16;
        var18.field5052 = var17;
        class306.field4398.method2173(-33, var18);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V", line = 95)
    public static void method2817(byte arg0) {
        field6644 = null;
        if (arg0 != -15) {
            method2818((byte) 19);
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(B)Z", line = 107)
    public static final boolean method2818(byte arg0) {
        field6645++;
        if (arg0 > -116) {
            field6636 = -20;
        }
        return class119.field1835;
    }

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "(B)Z", line = 120)
    public final boolean method2819(byte arg0) {
        field6643++;
        int var2 = -72 / ((arg0 - 68) / 55);
        return this.field6646;
    }

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "(B)I", line = 136)
    public final int method2820(byte arg0) {
        field6647++;
        int var2 = -12 % ((arg0 - 41) / 61);
        return this.field6641;
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V", line = 151)
    public static final void method2821(int arg0) {
        if (arg0 <= 48) {
            method2821(82);
        }
        class21.field353.method4080(true, class21.field353.field10075, 1);
        field6642++;
        class21.field353.method4080(true, class21.field353.field10086, 1);
        class21.field353.method4080(true, class21.field353.field10058, 1);
        class21.field353.method4080(true, class21.field353.field10073, 1);
        class21.field353.method4080(true, class21.field353.field10067, 1);
        class21.field353.method4080(true, class21.field353.field10089, 1);
        class21.field353.method4080(true, class21.field353.field10104, 0);
        class21.field353.method4080(true, class21.field353.field10064, 0);
        class21.field353.method4080(true, class21.field353.field10069, 0);
        class21.field353.method4080(true, class21.field353.field10062, 0);
        class21.field353.method4080(true, class21.field353.field10057, 0);
        class21.field353.method4080(true, class21.field353.field10080, 0);
        class21.field353.method4080(true, class21.field353.field10072, 0);
        class21.field353.method4080(true, class21.field353.field10091, 0);
        class21.field353.method4080(true, class21.field353.field10096, 0);
        class21.field353.method4080(true, class21.field353.field10070, 0);
        class21.field353.method4080(true, class21.field353.field10102, 0);
        class21.field353.method4080(true, class21.field353.field10100, 0);
        class21.field353.method4080(true, class21.field353.field10090, 0);
        class318.method2060(true);
        class21.field353.method4080(true, class21.field353.field10087, 2);
        class21.field353.method4080(true, class21.field353.field10088, 2);
        class594.method3464(true);
        class37.method289((byte) 68);
        class446.field6088 = true;
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(ZIIZ)V", line = 187)
    public class474(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field6635 = arg1;
        this.field6641 = arg2;
        this.field6637 = arg3;
        this.field6646 = arg0;
    }
}
