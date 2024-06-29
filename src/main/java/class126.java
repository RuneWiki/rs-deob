import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class126 extends class115 {

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
    private int field2097 = 4096;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "Lqe;")
    public static class168 field2100 = class66.method448("gleiten:", -115);

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "[I")
    public static int[] field2102 = new int[4096];

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "Lqe;")
    public static class168 field2099 = class66.method448("Hierhin gehen", 102);

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "Lqe;")
    public static class168 field2105 = class66.method448(":", 102);

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "(I)V")
    public static void method859(int arg0) {
        field2105 = null;
        field2100 = null;
        field2102 = null;
        int var1 = 1 % ((arg0 - -67) / 38);
        field2099 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2097 = arg1.method731(false);
        }
        ++field2103;
        if (arg0 != 107) {
            method860((byte) 57, -106);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class126() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 <= 37) {
            field2099 = null;
        }
        ++field2104;
        int[] var3 = super.field1872.method182((byte) -95, arg0);
        if (super.field1872.field341) {
            int[] var4 = this.method792(0, 0, arg0 + -1 & class38.field522);
            int[] var5 = this.method792(0, 0, arg0);
            int[] var6 = this.method792(0, 0, arg0 + 1 & class38.field522);
            for (int var7 = 0; ~class130.field2297 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2097;
                int var9 = var8 >> 12;
                int var10 = var9 * var9 >> 12;
                int var11 = (var5[class134.field2350 & var7 + 1] - var5[var7 + -1 & class134.field2350]) * this.field2097;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + 4096 - -var10) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)V")
    public static final void method860(byte arg0, int arg1) {
        ++field2098;
        if (arg1 != -1) {
            if (class97.method636(arg1, -123)) {
                class129[] var2 = class108.field1741[arg1];
                for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                    class129 var5 = var2[var3];
                    if (var5.field2183 != null) {
                        class147 var6 = new class147();
                        var6.field2552 = var5;
                        var6.field2566 = var5.field2183;
                        class43.method287((byte) -6, 2000000, var6);
                    }
                }
                int var4 = 88 % ((-55 - arg0) / 35);
            }
        }
    }
}
