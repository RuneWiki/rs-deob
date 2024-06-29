import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class393 extends class512 {

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    private int field6015 = -1;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "[Llb;")
    public static class505[] field6008 = new class505[1024];

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "S")
    public static short field6012 = 32767;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public int field6017;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public int field6018;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "J")
    public static long field6021;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "[I")
    public int[] field6010;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V", line = 4)
    public final void method2260(int arg0) {
        ++field6011;
        super.method2260(arg0);
        if (arg0 == 2) {
            this.field6010 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[[I", line = 16)
    public int[][] method278(int arg0, int arg1) {
        ++field6019;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        if (super.field7496.field6942 && this.method2459(9067)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class227.field3953 == ~this.field6017 ? arg1 : this.field6017 * arg1 / class227.field3953) * this.field6018;
            if (class402.field6113 != this.field6018) {
                for (int var8 = 0; ~var8 > ~class402.field6113; ++var8) {
                    int var9 = this.field6018 * var8 / class402.field6113;
                    int var10 = this.field6010[var7 + var9];
                    var6[var8] = class344.method2224(var10, 255) << 4;
                    var5[var8] = class344.method2224(var10, 65280) >> 4;
                    var4[var8] = class344.method2224(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class402.field6113; ++var11) {
                    int var12 = this.field6010[var7++];
                    var6[var11] = class344.method2224(255, var12) << 4;
                    var5[var11] = class344.method2224(var12, 65280) >> 4;
                    var4[var11] = class344.method2224(16711680, var12) >> 12;
                }
            }
        }
        int var13 = 42 % ((-40 - arg0) / 47);
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 98)
    public class393() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lqs;I)I", line = 104)
    public static final int method2455(class496 arg0, int arg1) {
        ++field6020;
        int var2 = 0;
        if (arg1 > -72) {
            method2456(-34, true, 117);
        }
        if (arg0.method2929(class204.field3242, -127)) {
            ++var2;
        }
        if (arg0.method2929(class90.field1500, -64)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZI)I", line = 125)
    public static final int method2456(int arg0, boolean arg1, int arg2) {
        ++field6009;
        int var3 = class442.method2663(arg2 - 1, arg0 + -1, -94) + class442.method2663(arg2 - -1, arg0 + -1, -123) - (-class442.method2663(arg2 + -1, arg0 + 1, -109) - class442.method2663(arg2 + 1, arg0 + 1, -122));
        int var4 = class442.method2663(arg2 + -1, arg0, -17) - (-class442.method2663(arg2 + 1, arg0, -90) - class442.method2663(arg2, arg0 + -1, -90)) + class442.method2663(arg2, arg0 + 1, -19);
        if (!arg1) {
            field6012 = 17;
        }
        int var5 = class442.method2663(arg2, arg0, -1);
        return var5 / 4 + (var3 / 16 - -(var4 / 8));
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)I", line = 142)
    public final int method2457(int arg0) {
        if (arg0 != -1) {
            return -1;
        } else {
            ++field6014;
            return this.field6015;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V", line = 154)
    public static void method2458(byte arg0) {
        if (arg0 != 47) {
            field6007 = -5;
        }
        field6008 = null;
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)Z", line = 168)
    public final boolean method2459(int arg0) {
        ++field6016;
        if (this.field6010 != null) {
            return true;
        } else if (this.field6015 >= 0) {
            class523 var2 = ~class176.field2802 <= -1 ? class523.method3093(class485.field7121, class176.field2802, this.field6015) : class523.method3085(class485.field7121, this.field6015);
            var2.method3089();
            this.field6010 = var2.method3096();
            this.field6017 = var2.field7709;
            this.field6018 = var2.field7707;
            return true;
        } else {
            if (arg0 != 9067) {
                this.method71(false, -35, (class23) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZILia;)V", line = 194)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (arg0) {
            if (~arg1 == -1) {
                this.field6015 = arg2.method132(103);
            }
            ++field6013;
        }
    }
}
