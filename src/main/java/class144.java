import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class144 extends class371 {

    @OriginalMember(owner = "client!pba", name = "I", descriptor = "I")
    private int field1862 = 0;

    @OriginalMember(owner = "client!pba", name = "K", descriptor = "I")
    private int field1864 = 2000;

    @OriginalMember(owner = "client!pba", name = "N", descriptor = "I")
    private int field1867 = 0;

    @OriginalMember(owner = "client!pba", name = "L", descriptor = "I")
    private int field1865 = 4096;

    @OriginalMember(owner = "client!pba", name = "J", descriptor = "I")
    private int field1863 = 16;

    @OriginalMember(owner = "client!pba", name = "R", descriptor = "Z")
    public static boolean field1871 = false;

    @OriginalMember(owner = "client!pba", name = "Q", descriptor = "F")
    public static float field1870;

    @OriginalMember(owner = "client!pba", name = "M", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!pba", name = "O", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!pba", name = "P", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!pba", name = "S", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "()V", line = 230)
    public class144() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IB)V", line = 7)
    public static final void method858(int arg0, byte arg1) {
        class181.field2785 = 100;
        class467.field6744 = arg0;
        ++field1869;
        class535.field7925 = -1;
        class59.field710 = 3;
        if (arg1 != -30) {
            field1871 = true;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V", line = 22)
    public final void method212(int arg0) {
        ++field1866;
        class568.method3315(false);
        if (arg0 != -19103) {
            field1870 = -1.8521565F;
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(BI)[I", line = 33)
    public final int[] method79(byte arg0, int arg1) {
        ++field1872;
        int[] var3 = super.field5378.method1451(-114, arg1);
        if (super.field5378.field3254) {
            int var4 = this.field1865 >> 1;
            int[][] var5 = super.field5378.method1448(107);
            Random var6 = new Random((long) this.field1867);
            for (int var7 = 0; var7 < this.field1864; ++var7) {
                int var8 = ~this.field1865 < -1 ? this.field1862 - (-class296.method1832(false, this.field1865, var6) + var4) : this.field1862;
                int var9 = var8 >> 4 & 255;
                int var10 = class296.method1832(false, class41.field455, var6);
                int var11 = class296.method1832(false, class23.field201, var6);
                int var12 = (class289.field4252[var9] * this.field1863 >> 12) + var10;
                int var13 = var11 - -(class212.field3118[var9] * this.field1863 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class296.method1832(false, 4096, var6) >> 2) + 1024;
                    int var27 = var11 < var13 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class343.field5013 & var28;
                        int var31 = class135.field1789 & var21;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 -= var22;
                        }
                    }
                }
            }
        }
        if (arg0 > -80) {
            this.field1864 = -35;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBLps;)V", line = 166)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field1868;
        int var4 = 6 % ((-15 - arg1) / 39);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field1865 = arg2.method2620(42);
                        }
                    } else {
                        this.field1862 = arg2.method2620(44);
                    }
                } else {
                    this.field1863 = arg2.method2561((byte) -85);
                }
            } else {
                this.field1864 = arg2.method2620(108);
            }
        } else {
            this.field1867 = arg2.method2561((byte) -40);
        }
    }
}
