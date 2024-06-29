import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class373 extends class45 {

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
    private int field5665 = 4;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
    private int field5663 = 4;

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "Lrn;")
    public static class174 field5658 = new class174(18, 7);

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!ur", name = "I", descriptor = "[I")
    public static int[] field5657;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "[Z")
    public static boolean[] field5662;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field5659;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (arg0 != 8) {
            this.method49(78, -117);
        }
        if (super.field833.field1888) {
            int var4 = class259.field3768 / this.field5665;
            int var5 = class457.field6849 / this.field5663;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method437(0, 0, -57);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method437(0, class457.field6849 * var7 / var5, 60);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class259.field3768 > var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class259.field3768 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2324(String arg0, int arg1) {
        int var2 = 12 % (arg1 / 45);
        ++field5660;
        int var3 = arg0.length();
        int var4 = 0;
        for (int var5 = 0; ~var3 < ~var5; ++var5) {
            var4 = (var4 << 5) + -var4 + class429.method2572(-10707, arg0.charAt(var5));
        }
        return var4;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
    public class373() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field5664;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            int var4 = class259.field3768 / this.field5665;
            int var5 = class457.field6849 / this.field5663;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method434(0, class457.field6849 * var6 / var5, 119);
            } else {
                var7 = this.method434(0, 0, 118);
            }
            for (int var8 = 0; ~var8 > ~class259.field3768; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class259.field3768 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return arg0 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field5661;
        if (arg1 == -26471) {
            if (arg2 != 0) {
                if (arg2 == 1) {
                    this.field5663 = arg0.method1063((byte) 127);
                }
            } else {
                this.field5665 = arg0.method1063((byte) 107);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "(B)V")
    public static void method2325(byte arg0) {
        if (arg0 != -111) {
            method2325((byte) 75);
        }
        field5657 = null;
        field5658 = null;
        field5662 = null;
    }
}
