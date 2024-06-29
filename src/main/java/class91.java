import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class91 extends class185 {

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    private int field1441 = 1024;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    private int field1446 = 2048;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    private int field1443 = 3072;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field1438 = 0;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "[I")
    public static int[] field1444 = new int[8];

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field1445 = 0;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field1434 = -1;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Lrl;")
    public static class164 field1435;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "[Lsb;")
    public static class230[] field1439;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "[Lmi;")
    public static class266[] field1433;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        if (arg1 <= 70) {
            field1434 = 116;
        }
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int[] var4 = this.method1146((byte) 124, arg0, 0);
            for (int var5 = 0; ~var5 > ~class174.field2648; ++var5) {
                var3[var5] = (var4[var5] * this.field1446 >> 12) + this.field1441;
            }
        }
        ++field1437;
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class91() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        ++field1440;
        if (arg0 != -9) {
            method585(60);
        }
        this.field1446 = -this.field1441 + this.field1443;
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V")
    public static void method585(int arg0) {
        field1433 = null;
        field1439 = null;
        field1444 = null;
        field1435 = null;
        if (arg0 != -27043) {
            method585(-66);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        int[][] var3 = super.field2802.method753(1, arg1);
        if (!arg0) {
            this.method34(-27, 110);
        }
        if (super.field2802.field1807) {
            int[][] var4 = this.method1152(!arg0, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; class174.field2648 > var11; ++var11) {
                var7[var11] = (var5[var11] * this.field1446 >> 12) + this.field1441;
                var8[var11] = (var6[var11] * this.field1446 >> 12) + this.field1441;
                var10[var11] = (var9[var11] * this.field1446 >> 12) + this.field1441;
            }
        }
        ++field1442;
        return var3;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field1436;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field2814 = arg1.method1593((byte) 27) == 1;
                }
            } else {
                this.field1443 = arg1.method1575(false);
            }
        } else {
            this.field1441 = arg1.method1575(false);
        }
        if (arg2 != -6357) {
            field1439 = null;
        }
    }
}
