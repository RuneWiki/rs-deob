import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class483 extends class38 {

    @OriginalMember(owner = "client!cga", name = "I", descriptor = "Z")
    private boolean field6970 = true;

    @OriginalMember(owner = "client!cga", name = "D", descriptor = "Z")
    private boolean field6965 = true;

    @OriginalMember(owner = "client!cga", name = "E", descriptor = "[I")
    public static int[] field6966 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!cga", name = "F", descriptor = "Z")
    public static boolean field6967 = false;

    @OriginalMember(owner = "client!cga", name = "G", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!cga", name = "H", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!cga", name = "J", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!cga", name = "K", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!cga", name = "L", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(II)V", line = 3)
    public static final void method2889(int arg0, int arg1) {
        if (arg0 == -5727) {
            ++field6972;
            class150 var2 = class676.method3885(arg0 + 6727, 14, arg1);
            var2.method1115(true);
        }
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)V", line = 17)
    public static void method2890(int arg0) {
        field6966 = null;
        if (arg0 != 2832) {
            method2889(-121, 126);
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V", line = 27)
    public class483() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZZ)V", line = 38)
    public static final void method2891(boolean arg0, boolean arg1) {
        if (arg1) {
            method2890(103);
        }
        class237.method1572(class87.field1249, arg0, class501.field7123, (byte) 0, class510.field7263);
        ++field6973;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(BI)[I", line = 51)
    public final int[] method199(byte arg0, int arg1) {
        ++field6968;
        int[] var3 = super.field397.method1376(arg1, (byte) -73);
        if (arg0 > -43) {
            this.method196(-88, 73);
        }
        if (super.field397.field3005) {
            int[] var4 = this.method189(!this.field6970 ? arg1 : -arg1 + class619.field8708, 0, (byte) -92);
            if (!this.field6965) {
                class319.method2016(var4, 0, var3, 0, class729.field10216);
            } else {
                for (int var5 = 0; ~class729.field10216 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class554.field7909];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IILrg;)V", line = 96)
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field6969;
        if (arg0 > 34) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        super.field388 = ~arg2.method3745(-6314) == -2;
                    }
                } else {
                    this.field6970 = arg2.method3745(-6314) == 1;
                }
            } else {
                this.field6965 = ~arg2.method3745(-6314) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)[[I", line = 143)
    public final int[][] method196(int arg0, int arg1) {
        ++field6971;
        int[][] var3 = super.field387.method2809(arg1, (byte) -48);
        if (super.field387.field6792) {
            int[][] var4 = this.method195(true, 0, this.field6970 ? -arg1 + class619.field8708 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field6965) {
                for (int var11 = 0; ~class729.field10216 < ~var11; ++var11) {
                    var8[var11] = var5[-var11 + class554.field7909];
                    var9[var11] = var6[class554.field7909 - var11];
                    var10[var11] = var7[class554.field7909 - var11];
                }
            } else {
                for (int var12 = 0; ~class729.field10216 < ~var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return arg0 != -18210 ? null : var3;
    }
}
