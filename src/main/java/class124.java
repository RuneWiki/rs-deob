import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class124 extends class278 {

    @OriginalMember(owner = "client!op", name = "N", descriptor = "I")
    private int field1695 = 0;

    @OriginalMember(owner = "client!op", name = "P", descriptor = "I")
    private int field1697 = 16;

    @OriginalMember(owner = "client!op", name = "M", descriptor = "I")
    private int field1694 = 0;

    @OriginalMember(owner = "client!op", name = "R", descriptor = "I")
    private int field1699 = 4096;

    @OriginalMember(owner = "client!op", name = "T", descriptor = "I")
    private int field1701 = 2000;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!op", name = "L", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!op", name = "O", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!op", name = "Q", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!op", name = "S", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!op", name = "U", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "Lkj;")
    public static class397 field1691;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        ++field1698;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int var4 = this.field1699 >> 1;
            int[][] var5 = super.field3750.method253(0);
            Random var6 = new Random((long) this.field1695);
            for (int var7 = 0; ~this.field1701 < ~var7; ++var7) {
                int var8 = this.field1699 > 0 ? this.field1694 - (var4 + -class432.method2579((byte) -120, this.field1699, var6)) : this.field1694;
                int var9 = 255 & var8 >> 4;
                int var10 = class432.method2579((byte) 21, class507.field7456, var6);
                int var11 = class432.method2579((byte) 100, class307.field4211, var6);
                int var12 = (class441.field6422[var9] * this.field1697 >> 12) + var10;
                int var13 = var11 - -(class65.field888[var9] * this.field1697 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
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
                    int var26 = 1024 - (class432.method2579((byte) -125, 4096, var6) >> 2);
                    int var27 = var11 < var13 ? 1 : -1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class412.field6045 & var28;
                        int var31 = var21 & class40.field549;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        if (arg0 != -9) {
            this.method207(85);
        }
        return var3;
    }

    @OriginalMember(owner = "client!op", name = "g", descriptor = "(I)V")
    public static void method817(int arg0) {
        if (arg0 == 30785) {
            field1691 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
    public class124() {
        super(0, true);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field1692;
        if (arg1 != -30446) {
            this.method210((class365) null, -50, -18);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field1699 = arg0.method2062((byte) 14);
                        }
                    } else {
                        this.field1694 = arg0.method2062((byte) 14);
                    }
                } else {
                    this.field1697 = arg0.method2099(255);
                }
            } else {
                this.field1701 = arg0.method2062((byte) 14);
            }
        } else {
            this.field1695 = arg0.method2099(255);
        }
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(I)V")
    public final void method207(int arg0) {
        if (arg0 != 2) {
            this.method207(100);
        }
        class99.method664((byte) -69);
        ++field1696;
    }
}
