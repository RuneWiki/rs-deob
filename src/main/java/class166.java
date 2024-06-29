import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class166 extends class67 {

    @OriginalMember(owner = "client!gb", name = "lb", descriptor = "[Lbf;")
    public static class31[] field2690 = new class31[14];

    @OriginalMember(owner = "client!gb", name = "nb", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!gb", name = "ob", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!gb", name = "qb", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!gb", name = "mb", descriptor = "Laj;")
    public static class151 field2691;

    @OriginalMember(owner = "client!gb", name = "pb", descriptor = "Li;")
    public static class74 field2694;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static void method1239(boolean arg0) {
        field2694 = null;
        field2691 = null;
        if (!arg0) {
            field2691 = null;
        }
        field2690 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        ++field2695;
        int[][] var3 = super.field2905.method50(arg1, (byte) 126);
        if (super.field2905.field158 && this.method459(32303)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg1 % super.field1136 * super.field1136;
            for (int var8 = 0; ~class4.field116 < ~var8; ++var8) {
                int var9 = super.field1129[var7 - -(var8 % super.field1137)];
                var5[var8] = class15.method84(var9 << 4, 4080);
                var6[var8] = class15.method84(var9, 65280) >> 4;
                var4[var8] = class15.method84(4080, var9 >> 12);
            }
        }
        int var10 = -115 % ((arg0 - -64) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)I")
    public static final int method1240(int arg0, int arg1) {
        ++field2693;
        return arg1 != -16091612 ? -2 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBI)V")
    public static final void method1241(int arg0, byte arg1, int arg2) {
        int var3 = class289.field4767 * arg0 >> 8;
        ++field2692;
        if (~arg2 == 0 && !class101.field1601) {
            class151.method1128((byte) 105);
        } else if (~arg2 != 0 && (~class57.field1004 != ~arg2 || !class141.method1052(4)) && ~var3 != -1 && !class101.field1601) {
            class310.method2087(0, arg2, 2, var3, (byte) -81, false, class71.field1246);
        }
        class57.field1004 = arg2;
        int var4 = -53 / ((arg1 - -58) / 57);
    }
}
