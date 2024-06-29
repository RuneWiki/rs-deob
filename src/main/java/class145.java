import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class145 extends class12 {

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    private int field2616 = 4096;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "Z")
    private boolean field2624 = true;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "Ltg;")
    private static class184 field2615 = class135.method812("OFF", 3);

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field2620 = -1;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Ltg;")
    public static class184 field2617 = field2615;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "B")
    public static byte field2625;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "Lvb;")
    public static class197 field2621;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "[I")
    public static int[] field2618;

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class145() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    public static final void method894(int arg0) {
        if (arg0 != 4096) {
            field2618 = null;
        }
        ++field2626;
        class55.field981.method770(false);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field2622;
        int var3 = 89 / ((-58 - arg1) / 34);
        int[][] var4 = super.field232.method673(arg0, -41);
        if (super.field232.field1962) {
            int[] var5 = this.method77(0, class173.field3274 & arg0 + -1, -124);
            int[] var6 = this.method77(0, arg0, -124);
            int[] var7 = this.method77(0, arg0 - -1 & class173.field3274, -120);
            int[] var8 = var4[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            for (int var11 = 0; var11 < class201.field3889; ++var11) {
                int var12 = (var7[var11] + -var5[var11]) * this.field2616;
                int var13 = (var6[var11 + 1 & class51.field937] + -var6[var11 - 1 & class51.field937]) * this.field2616;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((var16 + 4096 + var17) / 4096)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (~var18 != -1) {
                    var19 = 16777216 / var18;
                    var20 = var12 / var18;
                    var21 = var13 / var18;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                }
                if (this.field2624) {
                    var21 = (var21 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var20 = (var20 >> 1) + 2048;
                }
                var9[var11] = var21;
                var10[var11] = var20;
                var8[var11] = var19;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
    public static void method895(boolean arg0) {
        field2615 = null;
        field2617 = null;
        field2618 = null;
        field2621 = null;
        if (arg0) {
            field2615 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field2624 = arg0.method588((byte) -116) == 1;
            }
        } else {
            this.field2616 = arg0.method611(false);
        }
        if (arg2) {
            method895(false);
        }
        ++field2619;
    }
}
