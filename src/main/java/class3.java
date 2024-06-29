import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class694 {

    @OriginalMember(owner = "client!dp", name = "M", descriptor = "I")
    private int field18 = -1;

    @OriginalMember(owner = "client!dp", name = "L", descriptor = "S")
    public static short field17 = 1;

    @OriginalMember(owner = "client!dp", name = "F", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!dp", name = "G", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!dp", name = "H", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!dp", name = "J", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!dp", name = "K", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!dp", name = "O", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!dp", name = "P", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!dp", name = "Q", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!dp", name = "R", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!dp", name = "S", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!dp", name = "T", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!dp", name = "N", descriptor = "[I")
    public int[] field19;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "(I)V", line = 4)
    public static final void method12(int arg0) {
        class472.field6588.method1997(1);
        if (arg0 != -1125258460) {
            method18((byte) -64, (String) null);
        }
        ++field20;
    }

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "(I)I", line = 20)
    public static final int method13(int arg0) {
        if (arg0 != -12609) {
            return 7;
        } else {
            ++field16;
            return class245.field3490;
        }
    }

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "(I)V", line = 32)
    public final void method14(int arg0) {
        super.method14(arg0);
        ++field15;
        this.field19 = null;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V", line = 49)
    public class3() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(II)[[I", line = 52)
    public int[][] method15(int arg0, int arg1) {
        ++field13;
        if (arg0 != -22151) {
            this.field12 = 117;
        }
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738 && this.method17(arg0 ^ -22151)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class250.field3529 != ~this.field22 ? this.field22 * arg1 / class250.field3529 : arg1) * this.field12;
            if (~class465.field6544 != ~this.field12) {
                for (int var8 = 0; ~class465.field6544 < ~var8; ++var8) {
                    int var9 = this.field12 * var8 / class465.field6544;
                    int var10 = this.field19[var7 - -var9];
                    var6[var8] = class249.method1537(255, var10) << 4;
                    var5[var8] = class249.method1537(4080, var10 >> 4);
                    var4[var8] = class249.method1537(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class465.field6544 > var11; ++var11) {
                    int var12 = this.field19[var7++];
                    var6[var11] = class249.method1537(var12 << 4, 4080);
                    var5[var11] = class249.method1537(65280, var12) >> 4;
                    var4[var11] = class249.method1537(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)I", line = 122)
    public final int method16(int arg0) {
        if (arg0 != 1) {
            this.field12 = -70;
        }
        ++field24;
        return this.field18;
    }

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "(I)Z", line = 137)
    public final boolean method17(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field23;
            if (this.field19 != null) {
                return true;
            } else if (~this.field18 <= -1) {
                class543 var2 = ~class399.field5535 > -1 ? class543.method2981(class273.field3860, this.field18) : class543.method2990(class273.field3860, class399.field5535, this.field18);
                var2.method2994();
                this.field19 = var2.method2991();
                this.field22 = var2.field7373;
                this.field12 = var2.field7377;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BLjava/lang/String;)V", line = 163)
    public static final void method18(byte arg0, String arg1) {
        ++field14;
        if (!arg1.equals("")) {
            ++class686.field9651;
            class1.method5(1, class676.field9548);
            if (arg0 == 82) {
                class288.field4014.method746((byte) -125, class499.method2790(arg1, arg0 ^ 42));
                class288.field4014.method708(arg0 + -22, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjr;B)V", line = 182)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (~arg0 == -1) {
            this.field18 = arg1.method743((byte) -82);
        }
        ++field21;
        int var4 = 37 / ((58 - arg2) / 63);
    }
}
