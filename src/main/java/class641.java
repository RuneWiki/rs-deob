import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class641 extends class634 {

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    private int field9177 = -1;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
    public static int field9184 = 0;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public int field9179;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public int field9180;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field9183;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    public static int field9187;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "[I")
    public int[] field9186;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)Lbda;", line = 5)
    public static final class504 method3654(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 12487) {
            method3656(89, 104);
        }
        ++field9181;
        class691 var4 = class638.field9170[arg0][arg2][arg1];
        if (var4 == null) {
            return null;
        } else {
            class504 var5 = null;
            int var6 = -1;
            for (class398 var7 = var4.field9739; var7 != null; var7 = var7.field5451) {
                class340 var8 = var7.field5449;
                if (var8 instanceof class504) {
                    class504 var9 = (class504) var8;
                    int var10 = 252 + 256 * (-1 + var9.method1128(-1));
                    int var11 = -var10 + var9.field4635 >> 9;
                    int var12 = var9.field4629 - var10 >> 9;
                    int var13 = var9.field4635 + var10 >> 9;
                    int var14 = var9.field4629 + var10 >> 9;
                    if (arg2 >= var11 && arg1 >= var12 && ~arg2 >= ~var13 && ~var14 <= ~arg1) {
                        int var15 = (var13 + 1 + -arg2) * (var14 + 1 + -arg1);
                        if (~var15 < ~var6) {
                            var5 = var9;
                            var6 = var15;
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 168)
    public class641() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)[[I", line = 76)
    public int[][] method7(byte arg0, int arg1) {
        ++field9187;
        int[][] var3 = super.field9126.method132(0, arg1);
        if (super.field9126.field295 && this.method3657((byte) -126)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field9180 * (class201.field2372 != this.field9179 ? this.field9179 * arg1 / class201.field2372 : arg1);
            if (~class635.field9139 == ~this.field9180) {
                for (int var8 = 0; class635.field9139 > var8; ++var8) {
                    int var9 = this.field9186[var7++];
                    var6[var8] = class327.method1956(255, var9) << 4;
                    var5[var8] = class327.method1956(4080, var9 >> 4);
                    var4[var8] = class327.method1956(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; ~class635.field9139 < ~var10; ++var10) {
                    int var11 = this.field9180 * var10 / class635.field9139;
                    int var12 = this.field9186[var7 + var11];
                    var6[var10] = class327.method1956(var12, 255) << 4;
                    var5[var10] = class327.method1956(4080, var12 >> 4);
                    var4[var10] = class327.method1956(var12 >> 12, 4080);
                }
            }
        }
        int var13 = 84 % ((arg0 - -56) / 53);
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIILoh;BIZ)V", line = 144)
    public static final void method3655(int arg0, int arg1, int arg2, class404 arg3, byte arg4, int arg5, boolean arg6) {
        class344.field4471 = null;
        class34.field372 = arg6;
        ++field9185;
        class30.field344 = arg2;
        class446.field6457 = 1;
        class407.field5582 = arg5;
        if (arg4 >= 30) {
            class231.field2696 = arg1;
            class462.field6583 = arg3;
            class163.field1819 = arg0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I", line = 173)
    public final int method3643(int arg0) {
        if (arg0 != -1) {
            return -122;
        } else {
            ++field9176;
            return this.field9177;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILig;Z)V", line = 185)
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field9177 = arg1.method1476(-95);
        }
        ++field9175;
        if (arg2) {
            this.field9180 = -31;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 198)
    public final void method1483(byte arg0) {
        int var2 = -41 / ((42 - arg0) / 49);
        ++field9183;
        super.method1483((byte) -34);
        this.field9186 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V", line = 209)
    public static final void method3656(int arg0, int arg1) {
        ++field9182;
        class47 var2 = class258.method1546(17, arg0, (byte) 121);
        var2.method274(false);
        if (arg1 <= 47) {
            field9184 = 18;
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)Z", line = 222)
    public final boolean method3657(byte arg0) {
        ++field9178;
        if (this.field9186 != null) {
            return true;
        } else {
            int var2 = -41 / ((arg0 - -70) / 39);
            if (this.field9177 >= 0) {
                class155 var3 = class204.field2407 >= 0 ? class155.method953(class567.field8073, class204.field2407, this.field9177) : class155.method960(class567.field8073, this.field9177);
                var3.method950();
                this.field9186 = var3.method948();
                this.field9180 = var3.field1708;
                this.field9179 = var3.field1706;
                return true;
            } else {
                return false;
            }
        }
    }
}
