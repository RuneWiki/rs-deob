import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class282 extends class439 {

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    private int field3702;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    private int field3706;

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
    private int field3713;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    private int field3704;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "D")
    public static double field3707 = -1.0D;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "Lup;")
    public static class229 field3708 = null;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "Ljr;")
    public static class92 field3710 = new class92("", 12);

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "Ldn;")
    public static class438 field3709;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method1598(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++field3712;
        int var8 = class536.method3056(class271.field3513, 119, arg4, class563.field8282);
        int var9 = class536.method3056(class271.field3513, 115, arg2, class563.field8282);
        int var10 = class536.method3056(class592.field8588, 116, arg3, class470.field6589);
        int var11 = class536.method3056(class592.field8588, 116, arg1, class470.field6589);
        int var12 = class536.method3056(class271.field3513, 117, arg4 + arg7, class563.field8282);
        int var13 = class536.method3056(class271.field3513, arg5 ^ -62, -arg7 + arg2, class563.field8282);
        for (int var14 = var8; var14 < var12; ++var14) {
            class62.method363(var11, -127, arg0, class328.field4287[var14], var10);
        }
        for (int var15 = var9; ~var13 > ~var15; --var15) {
            class62.method363(var11, arg5 + -52, arg0, class328.field4287[var15], var10);
        }
        if (arg5 != -76) {
            method1599(-17);
        }
        int var16 = class536.method3056(class592.field8588, 124, arg3 + arg7, class470.field6589);
        int var17 = class536.method3056(class592.field8588, 113, -arg7 + arg1, class470.field6589);
        for (int var18 = var12; ~var13 <= ~var18; ++var18) {
            int[] var19 = class328.field4287[var18];
            class62.method363(var16, -127, arg0, var19, var10);
            class62.method363(var17, -128, arg6, var19, var16);
            class62.method363(var11, -127, arg0, var19, var17);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IBI)V")
    public final void method501(int arg0, byte arg1, int arg2) {
        ++field3711;
        int var4 = this.field3713 * arg2 >> 12;
        if (arg1 > -78) {
            this.field3702 = -47;
        }
        int var5 = this.field3704 * arg2 >> 12;
        int var6 = this.field3706 * arg0 >> 12;
        int var7 = this.field3702 * arg0 >> 12;
        class328.method1849(var6, var7, super.field6077, (byte) 115, var4, var5);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)V")
    public final void method498(int arg0, int arg1, int arg2) {
        if (arg2 != 46) {
            field3710 = null;
        }
        ++field3703;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BII)V")
    public final void method500(byte arg0, int arg1, int arg2) {
        ++field3705;
        int var4 = this.field3713 * arg2 >> 12;
        int var5 = this.field3704 * arg2 >> 12;
        int var6 = 69 / ((arg0 - -75) / 49);
        int var7 = this.field3706 * arg1 >> 12;
        int var8 = this.field3702 * arg1 >> 12;
        class460.method2682(var7, var5, super.field6077, (byte) -115, var8, super.field6079, super.field6076, var4);
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
    public static void method1599(int arg0) {
        if (arg0 == 16777215) {
            field3710 = null;
            field3709 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(IIIIIII)V")
    public class282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3702 = arg3;
        this.field3706 = arg1;
        this.field3713 = arg0;
        this.field3704 = arg2;
    }
}
