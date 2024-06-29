import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class472 {

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    private int field17;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "[I")
    public static int[] field15 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "[I")
    public static int[] field25 = new int[4];

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "[I")
    public static int[] field29 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field23;
        if (arg4 > -50) {
            field18 = 84;
        }
        class393 var10 = null;
        for (class393 var11 = (class393) class34.field445.method2843(1123227612); var11 != null; var11 = (class393) class34.field445.method2842(1673506446)) {
            if (~var11.field5581 == ~arg2 && ~var11.field5573 == ~arg0 && var11.field5579 == arg3 && var11.field5577 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class393();
            var10.field5577 = arg7;
            var10.field5581 = arg2;
            var10.field5573 = arg0;
            var10.field5579 = arg3;
            class187.method1152((byte) 83, var10);
            class34.field445.method2845(var10, (byte) 37);
        }
        var10.field5572 = arg1;
        var10.field5575 = arg8;
        var10.field5570 = arg5;
        var10.field5578 = arg6;
        var10.field5567 = arg9;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(Z)V")
    public static final void method9(boolean arg0) {
        if (arg0) {
            method8(101, 120, 3, -77, 91, -49, 13, 102, -6, -21);
        }
        class481.field6776.method1478((byte) -96);
        ++field22;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(Z)V")
    public static void method10(boolean arg0) {
        field15 = null;
        field25 = null;
        if (!arg0) {
            field29 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
    public static final void method11(byte arg0) {
        if (arg0 <= 76) {
            field25 = null;
        }
        ++field28;
        class330.field4781.method766((byte) -92);
        class327.field4741 = 1;
        client.field2623 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZIILnp;ILoh;)V")
    public static final void method12(int arg0, boolean arg1, int arg2, int arg3, class313 arg4, int arg5, class256 arg6) {
        ++field20;
        if (arg1) {
            class320.field4650.method1079((class144.field1900 - class320.field4650.method516()) / 2, (class244.field3634 - class320.field4650.method524()) / 2);
            class330.field4784.method1079((class144.field1900 - class330.field4784.method516()) / 2, 18);
        }
        arg6.method1596(0, (class95.field1225 != class456.field6416 ? class179.field2579 : class67.field849).method2065(114, class326.field4711), arg0, -1, class244.field3634 / 2 + -26, class144.field1900 / 2);
        int var7 = class244.field3634 / 2 + -18;
        arg4.method641(class144.field1900 / 2 - 152, var7, 304, 34, arg3, 0);
        arg4.method641(class144.field1900 / 2 + -151, var7 + 1, 302, 32, 0, 0);
        arg4.method650(class144.field1900 / 2 + -150, var7 + 2, class78.field966 * 3, 30, arg2, 0);
        arg4.method650(class78.field966 * 3 + (class144.field1900 / 2 - 150), var7 + 2, arg5 - class78.field966 * 3, 30, 0, 0);
        arg6.method1596(arg5 ^ 300, class216.field3247, arg0, -1, class244.field3634 / 2 + 4, class144.field1900 / 2);
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(IIIIIII)V")
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field27 = arg1;
        this.field17 = arg2;
        this.field16 = arg3;
        this.field13 = arg0;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)V")
    public static final void method13(int arg0, boolean arg1) {
        if (arg1) {
            ++field14;
            class489 var2 = class116.method731(-625541408, 9, arg0);
            var2.method2861(-229012000);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)V")
    public final void method14(int arg0, int arg1, int arg2) {
        ++field19;
        int var4 = this.field13 * arg1 >> 12;
        if (arg2 != -6196) {
            this.field27 = -28;
        }
        int var5 = this.field17 * arg1 >> 12;
        int var6 = this.field27 * arg0 >> 12;
        int var7 = this.field16 * arg0 >> 12;
        class385.method2317(super.field6640, (byte) 87, var7, super.field6641, var6, super.field6639, var5, var4);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBI)V")
    public final void method15(int arg0, byte arg1, int arg2) {
        ++field26;
        int var4 = this.field13 * arg2 >> 12;
        if (arg1 > -35) {
            method12(123, false, 115, -56, (class313) null, -91, (class256) null);
        }
        int var5 = this.field17 * arg2 >> 12;
        int var6 = this.field27 * arg0 >> 12;
        int var7 = this.field16 * arg0 >> 12;
        class216.method1385(-1, super.field6641, var4, var6, var7, var5);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZII)V")
    public final void method16(boolean arg0, int arg1, int arg2) {
        ++field30;
        int var4 = this.field13 * arg1 >> 12;
        int var5 = this.field17 * arg1 >> 12;
        if (arg0) {
            int var6 = this.field27 * arg2 >> 12;
            int var7 = this.field16 * arg2 >> 12;
            class421.method2472(arg0, var6, var5, var7, super.field6639, super.field6640, var4);
        }
    }
}
