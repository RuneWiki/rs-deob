import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class206 extends class366 {

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "Lpj;")
    private class132 field3032;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "Z")
    public static boolean field3037 = false;

    @OriginalMember(owner = "client!jda", name = "u", descriptor = "Lfc;")
    public static class235 field3048 = new class235(2, -1);

    @OriginalMember(owner = "client!jda", name = "v", descriptor = "Z")
    public static boolean field3049 = false;

    @OriginalMember(owner = "client!jda", name = "x", descriptor = "[[Z")
    public static boolean[][] field3051 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "I")
    private int field3041;

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!jda", name = "q", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!jda", name = "w", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "Lxa;")
    private class461 field3034;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "Lxa;")
    private class461 field3040;

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "Lxa;")
    private class461 field3042;

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "Lxa;")
    private class461 field3045;

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "Lxa;")
    private class461 field3046;

    @OriginalMember(owner = "client!jda", name = "t", descriptor = "Lxa;")
    private class461 field3047;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "[Lxa;")
    public static class461[] field3038;

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V")
    public static final void method1364(int arg0) {
        ++field3033;
        if (~class471.field6576 == arg0) {
            class471.field6576 = 7;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field3039;
        class402 var2 = (class402) super.field5206;
        this.field3034 = class110.method823(this.field3032.method938(var2.field5591, (byte) -53), true);
        this.field3042 = class110.method823(this.field3032.method938(var2.field5595, (byte) -53), true);
        this.field3046 = class110.method823(this.field3032.method938(var2.field5596, (byte) -53), true);
        this.field3040 = class110.method823(this.field3032.method938(var2.field5594, (byte) -53), true);
        int var3 = 124 % ((arg0 - 41) / 54);
        this.field3045 = class110.method823(this.field3032.method938(var2.field5589, (byte) -53), true);
        this.field3047 = class110.method823(this.field3032.method938(var2.field5588, (byte) -53), true);
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)V")
    public static void method1365(int arg0) {
        field3038 = null;
        if (arg0 == -19334) {
            field3048 = null;
            field3051 = null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIZI)V")
    public final void method1227(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 == 63) {
            ++field3036;
            if (arg2) {
                int[] var5 = new int[4];
                class630.field8790.method416(var5);
                class630.field8790.method442(arg1, arg0, super.field5206.field1113 + arg1, super.field5206.field1109 + arg0);
                int var6 = this.field3046.method33();
                int var7 = this.field3046.method29();
                int var8 = this.field3040.method33();
                int var9 = this.field3040.method29();
                this.field3046.method2660(arg1, (-var7 + super.field5206.field1109) / 2 + arg0);
                this.field3040.method2660(arg1 - -super.field5206.field1113 - var8, (super.field5206.field1109 - var9) / 2 + arg0);
                class630.field8790.method442(arg1, arg0, super.field5206.field1113 + arg1, arg0 + this.field3045.method29());
                this.field3045.method2661(arg1 + var6, arg0, -var6 + super.field5206.field1113 + -var8, super.field5206.field1109);
                int var10 = this.field3047.method29();
                class630.field8790.method442(arg1, arg0 - -super.field5206.field1109 - var10, arg1 - -super.field5206.field1113, super.field5206.field1109 + arg0);
                this.field3047.method2661(arg1 + var6, super.field5206.field1109 + arg0 + -var10, -var6 + -var8 + super.field5206.field1113, super.field5206.field1109);
                class630.field8790.method442(var5[0], var5[1], var5[2], var5[3]);
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)Z")
    public final boolean method104(byte arg0) {
        ++field3044;
        class402 var2 = (class402) super.field5206;
        if (!this.field3032.method947(-20, var2.field5591)) {
            return false;
        } else if (!this.field3032.method947(-45, var2.field5595)) {
            return false;
        } else if (!this.field3032.method947(-77, var2.field5596)) {
            return false;
        } else if (!this.field3032.method947(-57, var2.field5594)) {
            return false;
        } else if (!this.field3032.method947(-84, var2.field5589)) {
            return false;
        } else if (!this.field3032.method947(112, var2.field5594)) {
            return false;
        } else {
            if (arg0 < 18) {
                this.field3040 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lpj;Lks;)V")
    public class206(class132 arg0, class402 arg1) {
        super(arg1);
        this.field3032 = arg0;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIZB)V")
    public final void method1228(int arg0, int arg1, boolean arg2, byte arg3) {
        if (arg2 || ~class514.field7031 != ~this.field3041) {
            this.field3041 = class514.field7031;
            int var5 = arg0 - -this.field3046.method33();
            int var6 = arg0 - (-super.field5206.field1113 + this.field3040.method33());
            int var7 = arg1 - -this.field3045.method29();
            int var8 = super.field5206.field1109 + arg1 + -this.field3047.method29();
            int var9 = var6 - var5;
            int var10 = var8 - var7;
            int var11 = class514.field7031 * var9 / 100;
            int[] var12 = new int[4];
            class630.field8790.method416(var12);
            class630.field8790.method442(var5, var7, var5 + var11, var8);
            this.field3034.method2661(var5, var7, var9, var10);
            class630.field8790.method442(var5 - -var11, var7, var6, var8);
            this.field3042.method2661(var5, var7, var9, var10);
            class630.field8790.method442(var12[0], var12[1], var12[2], var12[3]);
        }
        if (arg3 != -68) {
            this.method1228(74, -36, false, (byte) -58);
        }
        ++field3043;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIII)V")
    public static final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 218) {
            method1364(70);
        }
        ++field3035;
        class679 var5 = class669.method3708(8, arg2, 1403048928);
        var5.method3748(true);
        var5.field9566 = arg3;
        var5.field9573 = arg4;
        var5.field9574 = arg1;
    }
}
