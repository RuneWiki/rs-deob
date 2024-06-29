import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class105 extends class74 {

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    private int field1688 = 0;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    private int field1686 = 16;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    private int field1685 = 2000;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    private int field1689 = 4096;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    private int field1692 = 0;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "[I")
    public static int[] field1691 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    public static int field1695 = 1;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "[[[B")
    public static byte[][][] field1684;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        ++field1690;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            int var4 = this.field1689 >> 1;
            int[][] var5 = super.field1254.method1325(0);
            Random var6 = new Random((long) this.field1688);
            for (int var7 = 0; ~this.field1685 < ~var7; ++var7) {
                int var8 = ~this.field1689 >= -1 ? this.field1692 : this.field1692 + -var4 + class167.method1104(this.field1689, (byte) -84, var6);
                int var9 = (var8 & 4089) >> 4;
                int var10 = class167.method1104(class178.field2662, (byte) -120, var6);
                int var11 = class167.method1104(class209.field3248, (byte) -101, var6);
                int var12 = (class221.field3456[var9] * this.field1686 >> 12) + var10;
                int var13 = -var10 + var12;
                int var14 = (class11.field214[var9] * this.field1686 >> 12) + var11;
                int var15 = -var11 + var14;
                if (var13 != 0 || ~var15 != -1) {
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var13 < var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var14;
                        var14 = var18;
                        var11 = var17;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var11 = var14;
                        var10 = var12;
                        var14 = var20;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = 2048 / var22;
                    int var24 = -var11 + var14;
                    int var25 = ~var11 <= ~var14 ? -1 : 1;
                    int var26 = -var22 / 2;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var27 = -(class167.method1104(4096, (byte) -91, var6) >> 2) + 1024;
                    for (int var28 = var10; var28 < var12; ++var28) {
                        var26 += var24;
                        int var29 = var28 & class129.field2012;
                        int var30 = (-var10 + var28) * var23 + var27 + 1024;
                        int var31 = class218.field3419 & var21;
                        if (var16) {
                            var5[var31][var29] = var30;
                        } else {
                            var5[var29][var31] = var30;
                        }
                        if (~var26 < -1) {
                            var26 += -var22;
                            var21 += var25;
                        }
                    }
                }
            }
        }
        if (arg0 != 4) {
            this.method80((byte) 34, (class37) null, -92);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
    public static final void method803(byte arg0) {
        class172.field2555 = null;
        ++field1696;
        class31.method251(0, 67, class35.field573, class34.field544, -1, 0, 0, 0, class277.field4369);
        if (class172.field2555 != null) {
            class7.method88(0, class35.field573, 0, class172.field2555, class294.field4621, -1412584499, 0, class277.field4369, class6.field115, class53.field822.field2839);
            class172.field2555 = null;
        }
        if (arg0 != -118) {
            method804((byte) -77);
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)V")
    public static void method804(byte arg0) {
        field1691 = null;
        if (arg0 != 70) {
            method804((byte) 3);
        }
        field1684 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 != -79) {
            field1691 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field1689 = arg1.method293(arg0 + 18);
                        }
                    } else {
                        this.field1692 = arg1.method293(107);
                    }
                } else {
                    this.field1686 = arg1.method333((byte) -59);
                }
            } else {
                this.field1685 = arg1.method293(120);
            }
        } else {
            this.field1688 = arg1.method333((byte) -59);
        }
        ++field1694;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        class87.method698(arg0);
        ++field1693;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, true);
    }
}
