import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class22 extends class105 {

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    private int field658 = 4;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    private int field671 = 4;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "Lvf;")
    public static class265 field663 = class87.method582(-46, "Memory before cleanup=");

    @OriginalMember(owner = "client!na", name = "W", descriptor = "Lvf;")
    public static class265 field667 = class87.method582(-46, "Chargement de la liste des serveurs");

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "Z")
    public static boolean field669 = false;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Lvf;")
    public static class265 field659 = class87.method582(-46, ":trade:");

    @OriginalMember(owner = "client!na", name = "V", descriptor = "Lvf;")
    private static class265 field666 = class87.method582(-46, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!na", name = "T", descriptor = "Lvf;")
    public static class265 field664 = field666;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "Lrh;")
    public static class115 field668;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V")
    public static final void method219(int arg0, int arg1) {
        class8.field274 = 50;
        class260.field4480 = arg0;
        ++field665;
        if (arg1 != 0) {
            field668 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field661;
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int var4 = class102.field1804 / this.field658;
            int var5 = class94.field1668 / this.field671;
            int[] var7;
            if (var4 > 0) {
                int var6 = arg1 % var4;
                var7 = this.method705(class102.field1804 * var6 / var4, (byte) -102, 0);
            } else {
                var7 = this.method705(0, (byte) -111, 0);
            }
            for (int var8 = 0; ~var8 > ~class94.field1668; ++var8) {
                if (~var5 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var5;
                    var3[var8] = var7[class94.field1668 * var9 / var5];
                }
            }
        }
        return arg0 != 8055 ? null : var3;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class22() {
        super(1, false);
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(I)V")
    public static void method220(int arg0) {
        if (arg0 != 0) {
            field666 = null;
        }
        field659 = null;
        field667 = null;
        field663 = null;
        field664 = null;
        field666 = null;
        field668 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        if (arg1 > -110) {
            method220(-60);
        }
        ++field660;
        int[][] var3 = super.field1870.method569((byte) 95, arg0);
        if (super.field1870.field1567) {
            int var4 = class102.field1804 / this.field658;
            int var5 = class94.field1668 / this.field671;
            int[][] var7;
            if (~var4 < -1) {
                int var6 = arg0 % var4;
                var7 = this.method702((byte) 94, class102.field1804 * var6 / var4, 0);
            } else {
                var7 = this.method702((byte) 94, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class94.field1668 > var14; ++var14) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class94.field1668 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field658 = arg2.method920((byte) 101);
            }
        } else {
            this.field671 = arg2.method920((byte) 23);
        }
        if (arg1 != 255) {
            method220(32);
        }
        ++field657;
    }
}
