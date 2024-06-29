import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class104 extends class4 {

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "Lim;")
    public static class353 field1364 = new class353(42, 8);

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "Lbv;")
    public static class568 field1366 = new class568();

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "Lfk;")
    public static class117 field1365;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field44 = arg1.method3045(-125) == 1;
        }
        ++field1360;
        if (arg0 > -89) {
            this.method15((byte) -41, -31);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V")
    public static void method573(byte arg0) {
        field1365 = null;
        if (arg0 == 126) {
            field1366 = null;
            field1364 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZZ)Z")
    public static boolean method574(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljq;BLqa;)V")
    public static final void method575(class447 arg0, byte arg1, class167 arg2) {
        ++field1363;
        boolean var3 = class98.field1307.method3387(arg2, arg0.field6263, arg0.field6217, arg0.field6262, arg0.field6254 ? class147.field1899.field274 : null, arg0.field6324, -1751, arg0.field6183 | -16777216) == null;
        if (var3) {
            class370.field5155.method3181(new class526(arg0.field6263, arg0.field6324, arg0.field6217, arg0.field6183 | -16777216, arg0.field6262, arg0.field6254), true);
            class90.method501(arg0, -1);
        }
        if (arg1 < 82) {
            field1366 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        if (arg0 != 10) {
            return null;
        } else {
            ++field1362;
            int[] var3 = super.field31.method2252(arg1, arg0 + 1);
            if (super.field31.field5127) {
                int[] var4 = this.method20(0, -21986, arg1);
                int[] var5 = this.method20(1, -21986, arg1);
                int[] var6 = this.method20(2, -21986, arg1);
                for (int var7 = 0; ~var7 > ~class132.field1627; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field1361;
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (super.field38.field7618) {
            int[] var4 = this.method20(2, -21986, arg0);
            int[][] var5 = this.method22(arg0, (byte) -123, 0);
            int[][] var6 = this.method22(arg0, (byte) -116, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class132.field1627; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 == 0) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = 4096 - var17;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return arg1 > -83 ? null : var3;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
    public class104() {
        super(3, false);
    }
}
