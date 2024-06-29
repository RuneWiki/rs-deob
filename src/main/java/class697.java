import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class697 extends class634 {

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    private int field9808 = 4096;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "Z")
    private boolean field9804 = true;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Z")
    public static boolean field9807 = false;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "Lcu;")
    public static class219 field9810 = new class219();

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "Ljava/lang/String;")
    public static String field9812 = null;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "Lkm;")
    public static class353 field9811;

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class697() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    public static void method3920(int arg0) {
        if (arg0 != -1722137631) {
            method3921(true, 23, -28);
        }
        field9811 = null;
        field9810 = null;
        field9812 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZII)V")
    public static final void method3921(boolean arg0, int arg1, int arg2) {
        class469.field6702 = -class656.field9374 + arg2;
        class99.field1035 = -class656.field9386 + arg1;
        if (!arg0) {
            ++field9806;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg2) {
            this.method3(-77, (class244) null, false);
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field9804 = arg1.method1423(-16) == 1;
            }
        } else {
            this.field9808 = arg1.method1476(10);
        }
        ++field9809;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)[[I")
    public final int[][] method7(byte arg0, int arg1) {
        int var3 = -110 % ((arg0 - -56) / 53);
        ++field9805;
        int[][] var4 = super.field9126.method132(0, arg1);
        if (super.field9126.field295) {
            int[] var5 = this.method3641(class312.field3870 & arg1 + -1, 20604, 0);
            int[] var6 = this.method3641(arg1, 20604, 0);
            int[] var7 = this.method3641(arg1 + 1 & class312.field3870, 20604, 0);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; class635.field9139 > var11; ++var11) {
                int var12 = (var7[var11] - var5[var11]) * this.field9808;
                int var13 = (var6[var11 + 1 & class110.field1162] - var6[class110.field1162 & var11 - 1]) * this.field9808;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 - (-var17 + -4096)) / 4096.0F)));
                int var19;
                int var20;
                int var21;
                if (var18 == 0) {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                } else {
                    var20 = var12 / var18;
                    var21 = var13 / var18;
                    var19 = 16777216 / var18;
                }
                if (this.field9804) {
                    var21 = (var21 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var11] = var21;
                var9[var11] = var20;
                var10[var11] = var19;
            }
        }
        return var4;
    }
}
