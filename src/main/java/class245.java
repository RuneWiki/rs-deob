import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class245 extends class634 {

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    private int field2966 = -1;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    private int field2955;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "[I")
    private int[] field2957;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method7(byte arg0, int arg1) {
        ++field2965;
        int[][] var3 = super.field9126.method132(0, arg1);
        int var4 = -29 / ((arg0 - -56) / 53);
        if (super.field9126.field295) {
            int var5 = this.field2955 * (~class201.field2372 == ~this.field2959 ? arg1 : this.field2959 * arg1 / class201.field2372);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~class635.field9139 == ~this.field2955) {
                for (int var9 = 0; ~var9 > ~class635.field9139; ++var9) {
                    int var10 = this.field2957[var5++];
                    var8[var9] = class327.method1956(255, var10) << 4;
                    var7[var9] = class327.method1956(4080, var10 >> 4);
                    var6[var9] = class327.method1956(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~class635.field9139 < ~var11; ++var11) {
                    int var12 = this.field2955 * var11 / class635.field9139;
                    int var13 = this.field2957[var5 + var12];
                    var8[var11] = class327.method1956(var13 << 4, 4080);
                    var7[var11] = class327.method1956(var13, 65280) >> 4;
                    var6[var11] = class327.method1956(16711680, var13) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class245() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
    public static final void method1482(int arg0, int arg1) {
        ++field2960;
        if (arg0 != -10117) {
            method1485(118, -37, (class233) null, -128, true, (class404) null, -18);
        }
        class559.field7988.method3539((byte) 121, arg1);
        class657.field9393.method3539((byte) 123, arg1);
        class203.field2402.method3539((byte) 124, arg1);
        class336.field4318.method3539((byte) 21, arg1);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
    public final void method1483(byte arg0) {
        ++field2954;
        int var2 = 119 % ((arg0 - 42) / 49);
        super.method1483((byte) -125);
        this.field2957 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
    public final int method1484(int arg0) {
        int var2 = -24 % ((arg0 - -6) / 54);
        ++field2956;
        return this.field2966;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (!arg2) {
            if (~arg0 == -1) {
                this.field2966 = arg1.method1476(107);
            }
            ++field2963;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILdia;IZLoh;I)V")
    public static final void method1485(int arg0, int arg1, class233 arg2, int arg3, boolean arg4, class404 arg5, int arg6) {
        if (arg0 == 128) {
            class294.method1748(15251, arg1, arg4, arg5, arg3, arg6);
            ++field2964;
            class344.field4471 = arg2;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLwha;)Z")
    public static final boolean method1486(byte arg0, class281 arg1) {
        ++field2958;
        class316 var2 = class445.field6442.method3972((byte) 104, arg1.method1241((byte) 99));
        if (arg0 != 105) {
            return true;
        } else if (var2.field3990 == -1) {
            return true;
        } else {
            class645 var3 = class119.field1233.method2338(var2.field3990, (byte) -113);
            return var3.field9216 == -1 ? true : var3.method3672(1);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIB)V")
    public final void method1487(int arg0, int arg1, byte arg2) {
        if (arg2 >= 89) {
            ++field2962;
            super.method1487(arg0, arg1, (byte) 125);
            if (this.field2966 >= 0 && class151.field1662 != null) {
                int var4 = class151.field1662.method931(this.field2966, true).field3711 ? 64 : 128;
                this.field2957 = class151.field1662.method930(false, 127, var4, this.field2966, 1.0F, var4);
                this.field2955 = var4;
                this.field2959 = var4;
            }
        }
    }
}
