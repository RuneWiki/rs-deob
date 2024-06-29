import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class105 extends class115 {

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    private int field1687 = 409;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    private int field1681 = 4096;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    private int field1688 = 4096;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "[I")
    private int[] field1685 = new int[3];

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
    private int field1691 = 4096;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "S")
    public static short field1679 = 1;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
    public static volatile int field1689 = 0;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "Lwd;")
    public static class67 field1690;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "(I)V")
    public static void method696(int arg0) {
        if (arg0 == -19065) {
            field1690 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field1684;
        if (arg1 < 11) {
            return null;
        } else {
            int[][] var3 = super.field1882.method1242(arg0, 48);
            if (super.field1882.field3344) {
                int[][] var4 = this.method789(0, (byte) -124, arg0);
                int[] var5 = var4[1];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                int[] var8 = var3[0];
                int[] var9 = var4[2];
                int[] var10 = var4[0];
                for (int var11 = 0; ~class130.field2297 < ~var11; ++var11) {
                    int var12 = var10[var11];
                    int var13 = -this.field1685[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var13 > this.field1687) {
                        var8[var11] = var12;
                        var6[var11] = var5[var11];
                        var7[var11] = var9[var11];
                    } else {
                        int var14 = var5[var11];
                        int var15 = -this.field1685[1] + var14;
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (~this.field1687 > ~var15) {
                            var8[var11] = var12;
                            var6[var11] = var14;
                            var7[var11] = var9[var11];
                        } else {
                            int var16 = var9[var11];
                            int var17 = -this.field1685[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (this.field1687 < var17) {
                                var8[var11] = var12;
                                var6[var11] = var14;
                                var7[var11] = var16;
                            } else {
                                var8[var11] = this.field1688 * var12 >> 12;
                                var6[var11] = this.field1681 * var14 >> 12;
                                var7[var11] = this.field1691 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field1682;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg1.method727(-27619);
                            this.field1685[1] = class86.method571(65280, var5) >> 4;
                            this.field1685[0] = class86.method571(var5 << 4, 267386880);
                            this.field1685[2] = class86.method571(0, var5 >> 12);
                        }
                    } else {
                        this.field1688 = arg1.method731(false);
                    }
                } else {
                    this.field1681 = arg1.method731(false);
                }
            } else {
                this.field1691 = arg1.method731(false);
            }
        } else {
            this.field1687 = arg1.method731(false);
        }
        if (arg0 != 107) {
            this.method3((byte) -30, (class112) null, 93);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZILoe;)Z")
    public static final boolean method697(boolean arg0, int arg1, class256 arg2) {
        if (arg0) {
            method697(false, 11, (class256) null);
        }
        ++field1683;
        byte[] var3 = arg2.method1700(59, arg1);
        if (var3 == null) {
            return false;
        } else {
            class38.method257(0, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class105() {
        super(1, false);
    }
}
