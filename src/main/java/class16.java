import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 extends class377 {

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    private int field156 = 2048;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    private int field159 = 3072;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    private int field160 = 1024;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "Llh;")
    public static class492 field152 = new class492("WTQA", 2);

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "Lws;")
    public static class333 field163 = new class333();

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "[[I")
    public static int[][] field164 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 4)
    public class16() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method88(int arg0, int arg1) {
        ++field157;
        int[] var3 = super.field4842.method2772(arg0, (byte) -128);
        int var4 = 90 / ((arg1 - 5) / 53);
        if (super.field4842.field6354) {
            int[] var5 = this.method2174(0, arg0, (byte) 94);
            for (int var6 = 0; var6 < class528.field6661; ++var6) {
                var3[var6] = (var5[var6] * this.field156 >> 12) + this.field160;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[[I", line = 38)
    public final int[][] method23(int arg0, byte arg1) {
        int var3 = 39 % ((arg1 - 31) / 42);
        ++field153;
        int[][] var4 = super.field4850.method2566(-27346, arg0);
        if (super.field4850.field5843) {
            int[][] var5 = this.method2173(1, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~class528.field6661 < ~var12; ++var12) {
                var9[var12] = (var6[var12] * this.field156 >> 12) + this.field160;
                var10[var12] = (var7[var12] * this.field156 >> 12) + this.field160;
                var11[var12] = this.field160 - -(var8[var12] * this.field156 >> 12);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILrr;I)Ljava/lang/String;", line = 90)
    public static final String method89(int arg0, class337 arg1, int arg2) {
        if (arg0 != -198102932) {
            method89(21, (class337) null, -26);
        }
        ++field155;
        if (!client.method1693(arg1).method2041(arg2, 0) && arg1.field4164 == null) {
            return null;
        } else if (arg1.field4242 != null && ~arg2 > ~arg1.field4242.length && arg1.field4242[arg2] != null && ~arg1.field4242[arg2].trim().length() != -1) {
            return arg1.field4242[arg2];
        } else {
            return class373.field4819 ? "Hidden-" + arg2 : null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(I)V", line = 116)
    public static void method90(int arg0) {
        field152 = null;
        field164 = null;
        if (arg0 != 1) {
            method89(22, (class337) null, 109);
        }
        field163 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILji;)V", line = 135)
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field158;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field4853 = arg2.method3097((byte) 12) == 1;
                }
            } else {
                this.field159 = arg2.method3031(-1);
            }
        } else {
            this.field160 = arg2.method3031(-1);
        }
        int var5 = 18 / ((arg1 - 13) / 55);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V", line = 176)
    public final void method91(byte arg0) {
        if (arg0 > 52) {
            this.field156 = -this.field160 + this.field159;
            ++field154;
        }
    }
}
