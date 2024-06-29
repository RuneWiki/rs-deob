import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class173 extends class136 {

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "[Z")
    public static boolean[] field2456 = new boolean[5];

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field2453 = 1407;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "[I")
    public static int[] field2454 = new int[1024];

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "[Ll;")
    public static class16[] field2459;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (~arg1 == -1) {
            super.field1966 = arg2.method577(255) == 1;
        }
        ++field2457;
        if (arg0 != 4) {
            field2456 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1223(int arg0, int arg1, int arg2, int arg3) {
        if (!class518.method3077(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class527.field7754;
            int var5 = arg2 << class527.field7754;
            return class473.method2861(var4 + 1, class131.field1899[arg0].method430(arg1, arg2) + arg3, var5 + 1) && class473.method2861(class376.field5566 + var4 - 1, class131.field1899[arg0].method430(arg1 + 1, arg2) + arg3, var5 + 1) && class473.method2861(class376.field5566 + var4 - 1, class131.field1899[arg0].method430(arg1 + 1, arg2 + 1) + arg3, class376.field5566 + var5 - 1) && class473.method2861(var4 + 1, class131.field1899[arg0].method430(arg1, arg2 + 1) + arg3, class376.field5566 + var5 - 1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class173() {
        super(3, false);
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
    public static void method1224(int arg0) {
        field2454 = null;
        field2459 = null;
        field2456 = null;
        if (arg0 > -83) {
            field2456 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        int var3 = 70 / ((arg0 - 67) / 50);
        ++field2458;
        int[] var4 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int[] var5 = this.method1033(arg1, 0, 0);
            int[] var6 = this.method1033(arg1, 1, 0);
            int[] var7 = this.method1033(arg1, 2, 0);
            for (int var8 = 0; ~var8 > ~class467.field6889; ++var8) {
                int var9 = var7[var8];
                if (~var9 != -4097) {
                    if (~var9 == -1) {
                        var4[var8] = var6[var8];
                    } else {
                        var4[var8] = (4096 - var9) * var6[var8] + var5[var8] * var9 >> 12;
                    }
                } else {
                    var4[var8] = var5[var8];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZIII)I")
    public static final int method1225(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            return 29;
        } else {
            ++field2452;
            int var4 = ((arg1 & 65280) * arg2 & 16711680 | -16711936 & (arg1 & 16711935) * arg2) >>> 8;
            int var5 = -arg2 + 255;
            return ((16711680 & (arg3 & 65280) * var5 | (16711935 & arg3) * var5 & -16711936) >>> 8) - -var4;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method272(byte arg0, int arg1) {
        if (arg0 < 33) {
            return null;
        } else {
            ++field2455;
            int[][] var3 = super.field1952.method3127((byte) 79, arg1);
            if (super.field1952.field7770) {
                int[] var4 = this.method1033(arg1, 2, 0);
                int[][] var5 = this.method1036(3, 0, arg1);
                int[][] var6 = this.method1036(3, 1, arg1);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class467.field6889 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (var17 == 0) {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        } else {
                            int var18 = -var17 + 4096;
                            var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                            var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                            var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                        }
                    } else {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    }
                }
            }
            return var3;
        }
    }
}
