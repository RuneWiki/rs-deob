import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class412 extends class330 {

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    private int field5762 = 2048;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    private int field5765 = 0;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    private int field5772 = 2048;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    private int field5764 = 12288;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    private int field5773 = 0;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    private int field5766 = 8192;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    private int field5774 = 4096;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "Ljn;")
    public static class134 field5768 = new class134(87, 3);

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "Lqk;")
    public static class1 field5775 = new class1(29, -1);

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "Lqk;")
    public static class1 field5776 = new class1(73, -1);

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "[Z")
    public static boolean[] field5778 = new boolean[5];

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "Lul;")
    public static class486 field5780 = new class486("", 19);

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)Z")
    private final boolean method2513(int arg0, byte arg1, int arg2) {
        ++field5769;
        int var4 = -27 / ((58 - arg1) / 41);
        int var5 = (arg0 + arg2) * this.field5764 >> 12;
        int var6 = class654.field9189[(var5 * 255 & 1047968) >> 12];
        int var7 = (var6 << 12) / this.field5764;
        int var8 = (var7 << 12) / this.field5766;
        int var9 = this.field5774 * var8 >> 12;
        return arg0 - arg2 < var9 && ~(arg0 - arg2) < ~(-var9);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        if (arg1) {
            this.method466((class511) null, -46, (byte) 75);
        }
        ++field5763;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int var4 = class300.field4352[arg0] + -2048;
            for (int var5 = 0; ~class80.field901 < ~var5; ++var5) {
                int var6 = class404.field5705[var5] - 2048;
                int var7 = var6 - -this.field5762;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = this.field5773 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field5765 + var6;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = this.field5772 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method2514((byte) -26, var12, var9) && !this.method2513(var18, (byte) -76, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)Z")
    private final boolean method2514(byte arg0, int arg1, int arg2) {
        ++field5771;
        int var4 = (arg1 - arg2) * this.field5764 >> 12;
        if (arg0 != -26) {
            return true;
        } else {
            int var5 = class654.field9189[(var4 * 255 & 1048527) >> 12];
            int var6 = (var5 << 12) / this.field5764;
            int var7 = (var6 << 12) / this.field5766;
            int var8 = this.field5774 * var7 >> 12;
            return arg1 + arg2 < var8 && ~(arg1 + arg2) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(III)Z")
    public static final boolean method2515(int arg0, int arg1, int arg2) {
        ++field5777;
        if (arg0 < 79) {
            field5778 = null;
        }
        return class385.method2391((byte) 89, arg2, arg1) | ~(393216 & arg1) != -1 || class404.method2480(-95, arg2, arg1);
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V")
    public final void method653(byte arg0) {
        ++field5770;
        class393.method2423(true);
        int var2 = -87 % ((50 - arg0) / 41);
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)V")
    public static void method2516(byte arg0) {
        field5776 = null;
        field5780 = null;
        field5775 = null;
        int var1 = -38 / ((arg0 - -65) / 50);
        field5778 = null;
        field5768 = null;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class412() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field5766 = arg0.method3002(-1);
                                }
                            } else {
                                this.field5774 = arg0.method3002(-1);
                            }
                        } else {
                            this.field5764 = arg0.method3002(-1);
                        }
                    } else {
                        this.field5772 = arg0.method3002(-1);
                    }
                } else {
                    this.field5765 = arg0.method3002(-1);
                }
            } else {
                this.field5773 = arg0.method3002(-1);
            }
        } else {
            this.field5762 = arg0.method3002(-1);
        }
        int var5 = -10 / ((arg2 - -41) / 42);
        ++field5767;
    }
}
