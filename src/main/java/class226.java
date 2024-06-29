import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class226 extends class4 {

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    private int field2882 = 2000;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    private int field2885 = 16;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    private int field2884 = 0;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    private int field2883 = 0;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    private int field2890 = 4096;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "Lim;")
    public static class353 field2889 = new class353(68, 7);

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "Llj;")
    public static class59 field2891;

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class226() {
        super(0, true);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field2887;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (arg0 != 10) {
            this.method18(34);
        }
        if (super.field31.field5127) {
            int var4 = this.field2890 >> 1;
            int[][] var5 = super.field31.method2255((byte) -128);
            Random var6 = new Random((long) this.field2883);
            for (int var7 = 0; ~var7 > ~this.field2882; ++var7) {
                int var8 = ~this.field2890 >= -1 ? this.field2884 : this.field2884 - var4 - -class585.method3373(var6, true, this.field2890);
                int var9 = var8 >> 4 & 255;
                int var10 = class585.method3373(var6, true, class132.field1627);
                int var11 = class585.method3373(var6, true, class620.field8925);
                int var12 = (class125.field1560[var9] * this.field2885 >> 12) + var10;
                int var13 = var11 - -(class225.field2880[var9] * this.field2885 >> 12);
                int var14 = -var11 + var13;
                int var15 = var12 - var10;
                if (~var15 != -1 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
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
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class585.method3373(var6, true, 4096) >> 2) + 1024;
                    int var27 = var13 <= var11 ? -1 : 1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = var28 & class150.field1971;
                        int var31 = class376.field5248 & var21;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var24 > 0) {
                            var21 += var27;
                            var24 -= var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field2890 = arg1.method3090(-117);
                        }
                    } else {
                        this.field2884 = arg1.method3090(-94);
                    }
                } else {
                    this.field2885 = arg1.method3045(-128);
                }
            } else {
                this.field2882 = arg1.method3090(-103);
            }
        } else {
            this.field2883 = arg1.method3045(-127);
        }
        ++field2888;
        if (arg0 > -89) {
            method1433(124);
        }
    }

    @OriginalMember(owner = "client!id", name = "i", descriptor = "(I)V")
    public static void method1433(int arg0) {
        if (arg0 < 54) {
            method1433(7);
        }
        field2891 = null;
        field2889 = null;
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        ++field2886;
        class78.method446((byte) -86);
        if (arg0 != -9) {
            this.field2890 = 18;
        }
    }
}
