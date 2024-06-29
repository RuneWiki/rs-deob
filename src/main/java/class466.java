import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class466 extends class14 {

    @OriginalMember(owner = "client!qp", name = "O", descriptor = "Z")
    private boolean field6430 = true;

    @OriginalMember(owner = "client!qp", name = "R", descriptor = "Z")
    private boolean field6433 = true;

    @OriginalMember(owner = "client!qp", name = "J", descriptor = "I")
    public static int field6425 = 0;

    @OriginalMember(owner = "client!qp", name = "M", descriptor = "Lok;")
    public static class166 field6428 = new class166(14, 7);

    @OriginalMember(owner = "client!qp", name = "T", descriptor = "Lff;")
    public static class9 field6435 = new class9(104, 7);

    @OriginalMember(owner = "client!qp", name = "U", descriptor = "[I")
    public static int[] field6436 = new int[6];

    @OriginalMember(owner = "client!qp", name = "L", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!qp", name = "N", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!qp", name = "P", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!qp", name = "Q", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!qp", name = "S", descriptor = "Lsh;")
    public static class49 field6434;

    @OriginalMember(owner = "client!qp", name = "K", descriptor = "[La;")
    public static class435[] field6426;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(III)Lpe;")
    public static final class431 method2648(int arg0, int arg1, int arg2) {
        class409 var3 = class497.field6886[arg0][arg1][arg2];
        return var3 != null && var3.field5618 != null ? var3.field5618 : null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field6431;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 >= -2) {
            return null;
        } else {
            if (super.field270.field5222) {
                int[] var4 = this.method145(!this.field6430 ? arg0 : -arg0 + class511.field7361, 0, -18596);
                if (!this.field6433) {
                    class254.method1534(var4, 0, var3, 0, class115.field1637);
                } else {
                    for (int var5 = 0; ~class115.field1637 < ~var5; ++var5) {
                        var3[var5] = var4[-var5 + class305.field4023];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[[I")
    public final int[][] method141(int arg0, int arg1) {
        ++field6429;
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (super.field268.field6091) {
            int[][] var4 = this.method139(0, arg0 ^ -30911, this.field6430 ? -arg1 + class511.field7361 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field6433) {
                for (int var11 = 0; ~var11 > ~class115.field1637; ++var11) {
                    var8[var11] = var5[-var11 + class305.field4023];
                    var9[var11] = var6[-var11 + class305.field4023];
                    var10[var11] = var7[class305.field4023 - var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class115.field1637; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        if (arg0 != -30909) {
            method2648(-123, -15, -50);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
    public class466() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)V")
    public static void method2649(int arg0) {
        field6435 = null;
        field6426 = null;
        field6428 = null;
        if (arg0 != 0) {
            field6436 = null;
        }
        field6436 = null;
        field6434 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZII)I")
    public static final int method2650(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method2649(124);
        }
        ++field6432;
        return arg2 != 4 && arg2 != 5 ? 256 : class58.field901[3 & arg1];
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        ++field6427;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field263 = arg2.method2238(255) == 1;
                }
            } else {
                this.field6430 = ~arg2.method2238(255) == -2;
            }
        } else {
            this.field6433 = arg2.method2238(255) == 1;
        }
        int var5 = -93 % ((arg1 - -51) / 37);
    }
}
