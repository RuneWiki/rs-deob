import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class168 extends class266 {

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field2938 = 0;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Lp;")
    public static class280 field2943 = class18.method140((byte) -120, "logo");

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Ltg;")
    public static class180 field2940;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "Lsa;")
    public static class257 field2941;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[[[I")
    public static int[][][] field2937;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIZILua;)V")
    public static final void method1168(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class113 arg6) {
        field2942++;
        if (!arg4) {
            method1170(false, (byte) -118);
        }
        int var7 = arg2 * arg2 + arg5 * arg5;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg6.field1869 / 2, arg6.field1995 / 2);
        if (var7 <= var8 * var8) {
            class48.method358(arg6, class20.field375[arg3], arg0, arg2, arg1, (byte) 33, arg5);
            return;
        }
        int var9 = class273.field4756 + class25.field487 & 0x7FF;
        int var10 = class146.field2545[var9];
        var8 -= 10;
        int var11 = var10 * 256 / (class142.field2461 + 256);
        int var12 = class146.field2541[var9];
        int var13 = var12 * 256 / (class142.field2461 + 256);
        int var14 = arg2 * var13 + arg5 * var11 >> 16;
        int var15 = arg5 * var13 - (arg2 * var11) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class223) class254.field4448[arg3]).method1298(arg6.field1869 / 2 + arg0 + var18 - 10, arg6.field1995 / 2 + arg1 + -var19 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
    public static final void method1169(byte arg0) {
        field2935++;
        try {
            if (class253.field4441 == 1) {
                int var1 = class232.field4055.method17((byte) -46);
                if (var1 > 0 && class232.field4055.method25(123)) {
                    int var2 = var1 - class275.field4780;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class232.field4055.method31(-2080769, var2);
                    return;
                }
                class232.field4055.method42(arg0 ^ 0x35);
                class232.field4055.method29((byte) 118);
                class9.field201 = null;
                if (class268.field4707 == null) {
                    class253.field4441 = 0;
                } else {
                    class253.field4441 = 2;
                }
                class67.field1117 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class232.field4055.method42(91);
            class253.field4441 = 0;
            class67.field1117 = null;
            class268.field4707 = null;
            class9.field201 = null;
        }
        if (arg0 != 98) {
            field2940 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZB)V")
    public static final void method1170(boolean arg0, byte arg1) {
        for (class23 var2 = (class23) class13.field259.method651(12916); var2 != null; var2 = (class23) class13.field259.method643(11066)) {
            if (var2.field411 != null) {
                class234.field4082.method1823(var2.field411);
                var2.field411 = null;
            }
            if (var2.field408 != null) {
                class234.field4082.method1823(var2.field408);
                var2.field408 = null;
            }
            var2.method1146(26159);
        }
        if (arg0) {
            for (class23 var3 = (class23) class38.field678.method651(12916); var3 != null; var3 = (class23) class38.field678.method643(11066)) {
                if (var3.field411 != null) {
                    class234.field4082.method1823(var3.field411);
                    var3.field411 = null;
                }
                var3.method1146(26159);
            }
            for (class23 var4 = (class23) class83.field1370.method142(true); var4 != null; var4 = (class23) class83.field1370.method143((byte) -123)) {
                if (var4.field411 != null) {
                    class234.field4082.method1823(var4.field411);
                    var4.field411 = null;
                }
                var4.method1146(26159);
            }
        }
        field2939++;
        int var5 = 6 % ((arg1 + 36) / 62);
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
    public static final void method1171(byte arg0) {
        class100.method710(5147, false);
        int var1 = 16 / ((arg0 - 31) / 36);
        System.gc();
        field2936++;
        class90.method641((byte) 66, 25);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static void method1172(int arg0) {
        field2943 = null;
        field2940 = null;
        field2941 = null;
        if (arg0 < -90) {
            field2937 = null;
        }
    }
}
