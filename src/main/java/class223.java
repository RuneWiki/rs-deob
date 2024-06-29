import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class223 extends class615 {

    @OriginalMember(owner = "client!rga", name = "G", descriptor = "I")
    private int field3137 = 16;

    @OriginalMember(owner = "client!rga", name = "I", descriptor = "I")
    private int field3139 = 4096;

    @OriginalMember(owner = "client!rga", name = "N", descriptor = "I")
    private int field3144 = 2000;

    @OriginalMember(owner = "client!rga", name = "M", descriptor = "I")
    private int field3143 = 0;

    @OriginalMember(owner = "client!rga", name = "O", descriptor = "I")
    private int field3145 = 0;

    @OriginalMember(owner = "client!rga", name = "J", descriptor = "F")
    public static float field3140 = 1.0F;

    @OriginalMember(owner = "client!rga", name = "H", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!rga", name = "K", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!rga", name = "L", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!rga", name = "P", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!rga", name = "F", descriptor = "[[I")
    public static int[][] field3136;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        ++field3142;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            this.field3139 = arg2.method2001((byte) -83);
                        }
                    } else {
                        this.field3143 = arg2.method2001((byte) -83);
                    }
                } else {
                    this.field3137 = arg2.method2034(255);
                }
            } else {
                this.field3144 = arg2.method2001((byte) -83);
            }
        } else {
            this.field3145 = arg2.method2034(255);
        }
        if (arg0 < 44) {
            this.field3137 = -56;
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        ++field3138;
        if (arg1 != -18) {
            this.method8(-126, (byte) -50);
        }
        int[] var3 = super.field8125.method298(arg0, arg1 ^ -108);
        if (super.field8125.field579) {
            int var4 = this.field3139 >> 1;
            int[][] var5 = super.field8125.method294((byte) 122);
            Random var6 = new Random((long) this.field3145);
            for (int var7 = 0; this.field3144 > var7; ++var7) {
                int var8 = ~this.field3139 < -1 ? this.field3143 + class660.method3697(arg1 ^ -18, this.field3139, var6) + -var4 : this.field3143;
                int var9 = 255 & var8 >> 4;
                int var10 = class660.method3697(0, class505.field6740, var6);
                int var11 = class660.method3697(0, class471.field6301, var6);
                int var12 = (class166.field2582[var9] * this.field3137 >> 12) + var10;
                int var13 = (class418.field5721[var9] * this.field3137 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class660.method3697(0, 4096, var6) >> 2) + 1024;
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = var26 - (-1024 - (-var10 + var28) * var25);
                        int var30 = class313.field4306 & var28;
                        int var31 = var21 & class658.field9107;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var24 -= var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        if (arg0 == 12404) {
            ++field3146;
            class201.method1312((byte) 100);
        }
    }

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "(I)V")
    public static final void method1397(int arg0) {
        ++field3141;
        class568.field7553.method1737(true);
        class704.field9906 = null;
        class71.field1059 = arg0;
    }

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "(B)V")
    public static void method1398(byte arg0) {
        field3136 = null;
        if (arg0 != -5) {
            field3136 = null;
        }
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "()V")
    public class223() {
        super(0, true);
    }
}
