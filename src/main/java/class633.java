import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class633 extends class204 {

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "[I")
    private int[] field9101 = new int[this.field3132];

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
    private int field9095;

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!nfa", name = "r", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!nfa", name = "s", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!nfa", name = "u", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!nfa", name = "v", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!nfa", name = "w", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!nfa", name = "x", descriptor = "I")
    private int field9105;

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "Lom;")
    public static class344 field9098;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "[B")
    private byte[] field9096;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BII)V")
    public void method2013(byte arg0, int arg1, int arg2) {
        ++field9100;
        this.field9096[this.field9105++] = (byte) ((class481.method2919(arg0, 255) >> 1) + 127);
        int var4 = -95 / ((arg1 - 14) / 52);
    }

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "(Z)V")
    public final void method1243(boolean arg0) {
        this.field9095 = Math.abs(this.field9095);
        ++field9093;
        if (~this.field9095 <= -4097) {
            this.field9095 = 4095;
        }
        this.method2013((byte) (this.field9095 >> 4), 67, this.field9105++);
        if (!arg0) {
            this.method2013((byte) -126, -35, 47);
        }
        this.field9095 = 0;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field9099;
        class616 var10 = null;
        for (class616 var11 = (class616) class81.field1588.method1224(-2); var11 != null; var11 = (class616) class81.field1588.method1232(-2)) {
            if (var11.field8952 == arg2 && var11.field8953 == arg1 && var11.field8949 == arg0 && ~var11.field8944 == ~arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class616();
            var10.field8952 = arg2;
            var10.field8953 = arg1;
            var10.field8949 = arg0;
            var10.field8944 = arg7;
            if (~arg1 <= -1 && arg0 >= 0 && class675.field9604 > arg1 && ~arg0 > ~class218.field3316) {
                class446.method2681((byte) -15, var10);
            }
            class81.field1588.method1229(var10, (byte) 120);
        }
        var10.field8951 = arg5;
        var10.field8947 = arg3;
        int var12 = -127 / ((arg4 - 30) / 61);
        var10.field8942 = arg6;
        var10.field8954 = arg9;
        var10.field8955 = arg8;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III)V")
    public final void method1249(int arg0, int arg1, int arg2) {
        if (arg0 < -121) {
            ++field9097;
            this.field9095 += this.field9101[arg1] * arg2 >> 12;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V")
    public final void method1250(boolean arg0) {
        if (!arg0) {
            field9104 = 64;
        }
        ++field9102;
        this.field9105 = 0;
        this.field9095 = 0;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)V")
    public static final void method3610(int arg0, int arg1) {
        ++field9094;
        class19 var2 = class373.method2355(74, arg1, 11);
        var2.method438(806);
        if (arg0 >= -81) {
            field9098 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(III)Lfh;")
    public static final class605 method3611(int arg0, int arg1, int arg2) {
        ++field9103;
        class605 var3 = new class605();
        var3.field8807 = -1;
        var3.field8810 = arg2 + 1 + 5;
        if (arg1 > -12) {
            method3611(105, 48, 115);
        }
        var3.field8801 = arg0 + 6;
        var3.field8796 = -1;
        var3.field8803 = new int[var3.field8801][var3.field8810];
        var3.method3480((byte) -67);
        return var3;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
    public static void method3612(int arg0) {
        if (arg0 != -32487) {
            method3610(54, 68);
        }
        field9098 = null;
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(IIIIIF)V")
    public class633(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field3132 < ~var7; ++var7) {
            this.field9101[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }
}
