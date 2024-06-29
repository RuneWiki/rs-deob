import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class129 extends class23 {

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    private int field2433 = 0;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
    private int field2438 = 0;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
    private int field2436 = 20;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    private int field2434 = 1365;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "Ldc;")
    public static class37 field2432 = class185.method1233((byte) 86, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "Ldc;")
    private static class37 field2425 = class185.method1233((byte) 86, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field2424 = 50;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "Ldc;")
    private static class37 field2429 = class185.method1233((byte) 86, "flash2:");

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "Ldc;")
    public static class37 field2439 = field2425;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "Ldc;")
    public static class37 field2437 = field2429;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "Ldc;")
    public static class37 field2428 = field2429;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILdc;)V")
    public static final void method908(int arg0, class37 arg1) {
        ++field2435;
        class50.field1016 = arg1;
        if (arg0 != -314128180) {
            field2437 = null;
        }
        class145.method1004((byte) -94);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lmf;Z)V")
    public static final void method909(class136 arg0, boolean arg1) {
        int var2 = arg0.field2639 == 0 ? arg0.field2638 : arg0.field2639;
        ++field2426;
        int var3 = ~arg0.field2598 != -1 ? arg0.field2598 : arg0.field2509;
        class195.method1302(class177.field3344[arg0.field2608 >> 16], var3, var2, arg0.field2608, arg1);
        if (arg0.field2641 != null) {
            class195.method1302(arg0.field2641, var3, var2, arg0.field2608, arg1);
        }
        class201 var4 = (class201) class85.field1499.method1047((byte) -28, (long) arg0.field2608);
        if (var4 != null) {
            class62.method466(var2, 84, var3, var4.field3746);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field2427;
        if (arg0 != 0) {
            this.field2433 = 41;
        }
        int[] var3 = super.field405.method1461(arg1, (byte) -121);
        if (super.field405.field4114) {
            for (int var4 = 0; ~var4 > ~class199.field3705; ++var4) {
                int var5 = (class133.field2477[var4] << 12) / this.field2434 + this.field2438;
                int var6 = (class167.field3196[arg1] << 12) / this.field2434 - -this.field2433;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var5 * var5 >> 12;
                int var11 = var6;
                int var12 = 0;
                int var13 = var6 * var6 >> 12;
                while (~(var10 + var13) > -16385 && var12 < this.field2436) {
                    var11 = (var7 * var11 >> 12) * 2 + var8;
                    ++var12;
                    var7 = var10 - var13 + var9;
                    var13 = var11 * var11 >> 12;
                    var10 = var7 * var7 >> 12;
                }
                var3[var4] = ~var12 <= ~(this.field2436 + -1) ? 0 : (var12 << 12) / this.field2436;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class129() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V")
    public static void method910(int arg0) {
        field2437 = null;
        field2429 = null;
        field2428 = null;
        int var1 = -10 / ((arg0 - 43) / 58);
        field2432 = null;
        field2439 = null;
        field2425 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field2433 = arg0.method230((byte) -107);
                    }
                } else {
                    this.field2438 = arg0.method230((byte) -116);
                }
            } else {
                this.field2436 = arg0.method230((byte) -113);
            }
        } else {
            this.field2434 = arg0.method230((byte) -101);
        }
        ++field2430;
        if (arg2 != 1000) {
            field2425 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V")
    public static final void method911(byte arg0) {
        if (arg0 != 69) {
            field2428 = null;
        }
        class137.field2669.method1183((byte) -29);
        ++field2431;
    }
}
