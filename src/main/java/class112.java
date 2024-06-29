import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class112 extends class272 {

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    private int field2025 = 0;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    private int field2031 = 4096;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "Z")
    public static boolean field2027 = false;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "Lli;")
    public static class185 field2023 = class245.method1649("", -117);

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "[S")
    public static short[] field2029 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
    public static final void method780(int arg0, int arg1) {
        if (arg0 != 5697) {
            method781(-24);
        }
        class149.field2824 = -1;
        class66.field1146 = arg1;
        class251.field4472 = -1;
        ++field2024;
        class268.method1820(-13248);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class112() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != 4421) {
            this.method35(24, -26);
        }
        ++field2030;
        int[] var3 = super.field4819.method1632(arg1 + -4421, arg0);
        if (super.field4819.field4294) {
            int[] var4 = this.method1866(arg0, 0, 74);
            for (int var5 = 0; ~class246.field4385 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field2025) {
                    var3[var5] = this.field2025;
                } else if (var6 <= this.field2031) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field2031;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V")
    public static void method781(int arg0) {
        int var1 = -12 / ((arg0 - -63) / 34);
        field2023 = null;
        field2029 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field4832 = ~arg0.method867(false) == -2;
                }
            } else {
                this.field2031 = arg0.method827(255);
            }
        } else {
            this.field2025 = arg0.method827(255);
        }
        ++field2026;
        int var5 = 102 % ((arg1 - -21) / 55);
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field2028;
        int[][] var3 = super.field4818.method1514(-2, arg0);
        int var4 = 44 / ((arg1 - -60) / 45);
        if (super.field4818.field3954) {
            int[][] var5 = this.method1860(arg0, 3, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class246.field4385; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (var13 >= this.field2025) {
                    if (this.field2031 >= var13) {
                        var10[var12] = var13;
                    } else {
                        var10[var12] = this.field2031;
                    }
                } else {
                    var10[var12] = this.field2025;
                }
                if (~this.field2025 >= ~var14) {
                    if (var14 <= this.field2031) {
                        var9[var12] = var14;
                    } else {
                        var9[var12] = this.field2031;
                    }
                } else {
                    var9[var12] = this.field2025;
                }
                if (~var15 <= ~this.field2025) {
                    if (~var15 >= ~this.field2031) {
                        var11[var12] = var15;
                    } else {
                        var11[var12] = this.field2031;
                    }
                } else {
                    var11[var12] = this.field2025;
                }
            }
        }
        return var3;
    }
}
