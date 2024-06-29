import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class195 extends class224 {

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    private int field3066 = 4096;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    private int field3065 = 0;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "Z")
    public static boolean field3073 = true;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "J")
    public static long field3069;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field3070;
        if (arg1 != 1) {
            field3073 = false;
        }
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042) {
            int[][] var4 = this.method1532(arg1 + 50, 0, arg0);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var4[1];
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~var11 > ~class78.field1108; ++var11) {
                int var12 = var8[var11];
                int var13 = var9[var11];
                int var14 = var7[var11];
                if (~this.field3065 < ~var12) {
                    var10[var11] = this.field3065;
                } else if (this.field3066 >= var12) {
                    var10[var11] = var12;
                } else {
                    var10[var11] = this.field3066;
                }
                if (var14 < this.field3065) {
                    var5[var11] = this.field3065;
                } else if (var14 <= this.field3066) {
                    var5[var11] = var14;
                } else {
                    var5[var11] = this.field3066;
                }
                if (~this.field3065 >= ~var13) {
                    if (var13 <= this.field3066) {
                        var6[var11] = var13;
                    } else {
                        var6[var11] = this.field3066;
                    }
                } else {
                    var6[var11] = this.field3065;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class195() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static final void method1352(byte arg0) {
        if (arg0 < 29) {
            method1353(62, false);
        }
        class190.field2998.method1430(-1);
        class116.field1720.method1430(-1);
        ++field3064;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field3624 = ~arg0.method201(255) == -2;
                }
            } else {
                this.field3066 = arg0.method190(-3);
            }
        } else {
            this.field3065 = arg0.method190(-3);
        }
        ++field3072;
        if (arg2 >= -46) {
            field3069 = 107L;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IZ)V")
    public static final void method1353(int arg0, boolean arg1) {
        class72.field1015 = null;
        class178.field2787 = null;
        class181.field2833 = null;
        class173.field2711 = null;
        class232.field3735 = null;
        ++field3067;
        class92.field1435 = null;
        if (arg1 && class176.field2755 != null) {
            class253.field4099 = class176.field2755.field2513;
        } else {
            class253.field4099 = null;
        }
        class30.field401 = 0;
        class126.field1868 = null;
        class39.field537 = null;
        int var2 = -117 / ((-62 - arg0) / 49);
        class1.field13 = null;
        class177.field2759 = null;
        class176.field2755 = null;
        class249.field3984.method346(true);
        class192.field3039 = null;
        class94.field1463 = -1;
        class107.field1644 = null;
        class253.field4043 = null;
        class184.field2891 = null;
        class35.field451 = null;
        class37.field503 = null;
        class285.field4519 = null;
        class123.field1811 = null;
        class68.field959 = null;
        class57.field804 = -1;
        class94.field1461 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            this.field3066 = 6;
        }
        ++field3074;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int[] var4 = this.method1527(arg0, 0, (byte) 84);
            for (int var5 = 0; ~var5 > ~class78.field1108; ++var5) {
                int var6 = var4[var5];
                if (this.field3065 > var6) {
                    var3[var5] = this.field3065;
                } else if (this.field3066 < var6) {
                    var3[var5] = this.field3066;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }
}
