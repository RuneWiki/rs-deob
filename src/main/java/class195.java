import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class195 extends class298 {

    @OriginalMember(owner = "client!fq", name = "R", descriptor = "I")
    private int field2668 = 0;

    @OriginalMember(owner = "client!fq", name = "O", descriptor = "I")
    private int field2665 = 2048;

    @OriginalMember(owner = "client!fq", name = "V", descriptor = "I")
    private int field2672 = 12288;

    @OriginalMember(owner = "client!fq", name = "S", descriptor = "I")
    private int field2669 = 4096;

    @OriginalMember(owner = "client!fq", name = "X", descriptor = "I")
    private int field2674 = 8192;

    @OriginalMember(owner = "client!fq", name = "U", descriptor = "I")
    private int field2671 = 0;

    @OriginalMember(owner = "client!fq", name = "Z", descriptor = "I")
    private int field2676 = 2048;

    @OriginalMember(owner = "client!fq", name = "N", descriptor = "[I")
    public static int[] field2664 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fq", name = "Q", descriptor = "F")
    public static float field2667 = 0.0F;

    @OriginalMember(owner = "client!fq", name = "L", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!fq", name = "M", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!fq", name = "P", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!fq", name = "T", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!fq", name = "W", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!fq", name = "Y", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V", line = 5)
    public class195() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V", line = 8)
    public final void method15(int arg0) {
        ++field2666;
        if (arg0 >= -41) {
            this.field2671 = -12;
        }
        class292.method1836(6090);
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)V", line = 19)
    public static void method1057(int arg0) {
        if (arg0 != -29838) {
            method1057(81);
        }
        field2664 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IILvt;)V", line = 32)
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 > -44) {
            this.method15(30);
        }
        ++field2670;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field2674 = arg2.method916(21933);
                                }
                            } else {
                                this.field2669 = arg2.method916(21933);
                            }
                        } else {
                            this.field2672 = arg2.method916(21933);
                        }
                    } else {
                        this.field2676 = arg2.method916(21933);
                    }
                } else {
                    this.field2668 = arg2.method916(21933);
                }
            } else {
                this.field2671 = arg2.method916(21933);
            }
        } else {
            this.field2665 = arg2.method916(21933);
        }
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(III)Z", line = 121)
    private final boolean method1058(int arg0, int arg1, int arg2) {
        ++field2675;
        if (arg1 != 0) {
            method1059(-32, 93, 91);
        }
        int var4 = (arg0 - -arg2) * this.field2672 >> 12;
        int var5 = class159.field1909[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2672;
        int var7 = (var6 << 12) / this.field2674;
        int var8 = this.field2669 * var7 >> 12;
        return ~(-arg2 + arg0) > ~var8 && -var8 < -arg2 + arg0;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZ)[I", line = 148)
    public final int[] method13(int arg0, boolean arg1) {
        ++field2662;
        if (!arg1) {
            method1059(-82, 41, -87);
        }
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            int var4 = class156.field1865[arg0] + -2048;
            for (int var5 = 0; var5 < class158.field1877; ++var5) {
                int var6 = class236.field3260[var5] - 2048;
                int var7 = var6 - -this.field2665;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var8 <= 2048 ? var8 : var8 - 4096;
                int var10 = this.field2671 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = var11 > 2048 ? var11 - 4096 : var11;
                int var13 = this.field2668 + var6;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = this.field2676 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 - -4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method1060(var12, var9, -128) && !this.method1058(var18, 0, var15) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "(III)V", line = 201)
    public static final void method1059(int arg0, int arg1, int arg2) {
        ++field2663;
        class160 var3 = class200.field2784[arg1][arg0];
        if (var3 != null) {
            class244.field3334 = var3.field1910;
            class451.field6386 = var3.field1925;
            class231.field3207 = var3.field1915;
        }
        class72.method367(true);
        if (arg2 >= -31) {
            method1057(53);
        }
    }

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "(III)Z", line = 239)
    private final boolean method1060(int arg0, int arg1, int arg2) {
        ++field2673;
        if (arg2 >= -34) {
            this.field2672 = 31;
        }
        int var4 = (arg0 - arg1) * this.field2672 >> 12;
        int var5 = class159.field1909[(1046994 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field2672;
        int var7 = (var6 << 12) / this.field2674;
        int var8 = this.field2669 * var7 >> 12;
        return var8 > arg0 + arg1 && ~(-var8) > ~(arg1 - -arg0);
    }
}
