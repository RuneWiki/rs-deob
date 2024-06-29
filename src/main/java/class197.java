import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class197 extends class34 {

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    private int field2972 = 4096;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "[J")
    public static long[] field2975 = new long[256];

    @OriginalMember(owner = "client!og", name = "X", descriptor = "Z")
    public static boolean field2979;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "Lhl;")
    public static class139 field2976;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "Z")
    public static volatile boolean field2980;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "Lpk;")
    public static class237 field2981;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "[I")
    public static int[] field2978;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class197() {
        super(1, true);
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 < 75) {
            field2976 = null;
        }
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int[] var4 = this.method230(arg1 - 1 & class201.field3014, -15337, 0);
            int[] var5 = this.method230(arg1, -15337, 0);
            int[] var6 = this.method230(class201.field3014 & arg1 + 1, -15337, 0);
            for (int var7 = 0; ~var7 > ~class226.field3527; ++var7) {
                int var8 = (var5[class167.field2457 & var7 + 1] - var5[var7 + -1 & class167.field2457]) * this.field2972;
                int var9 = (var6[var7] + -var4[var7]) * this.field2972;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 - (-var12 - 4096)) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        ++field2973;
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V")
    public static void method1324(byte arg0) {
        if (arg0 > -98) {
            field2981 = null;
        }
        field2978 = null;
        field2975 = null;
        field2981 = null;
        field2976 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        ++field2971;
        if (arg0 != 6) {
            method1324((byte) 71);
        }
        if (~arg1 == -1) {
            this.field2972 = arg2.method423(105);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(var1 & 1L) != -2L) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                }
            }
            field2975[var0] = var1;
        }
        field2979 = false;
        field2976 = new class139(5);
        field2980 = false;
    }
}
