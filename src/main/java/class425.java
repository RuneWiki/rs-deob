import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class425 extends class667 {

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    private int field5939 = 4096;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    private int field5946 = 0;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field5945 = 0;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "Lfga;")
    public static class254 field5940 = new class254();

    @OriginalMember(owner = "client!q", name = "K", descriptor = "[Z")
    public static boolean[] field5947 = new boolean[200];

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field5950 = 0;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public static int field5949 = -1;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "[I")
    public static int[] field5948 = new int[1];

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field5951 = 2;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)[I", line = 9)
    public final int[] method117(byte arg0, int arg1) {
        ++field5941;
        if (arg0 >= -87) {
            field5951 = -86;
        }
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (super.field9355.field3728) {
            int[] var4 = this.method3744(arg1, (byte) 127, 0);
            for (int var5 = 0; ~class77.field1455 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (this.field5946 > var6) {
                    var3[var5] = this.field5946;
                } else if (~this.field5939 <= ~var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field5939;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 234)
    public class425() {
        super(1, false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lud;II)V", line = 58)
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 == 3) {
            ++field5944;
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        super.field9344 = arg0.method273(arg1 ^ 252) == 1;
                    }
                } else {
                    this.field5939 = arg0.method253(-13900);
                }
            } else {
                this.field5946 = arg0.method253(arg1 ^ -13897);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)[[I", line = 101)
    public final int[][] method777(boolean arg0, int arg1) {
        ++field5942;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (arg0) {
            field5945 = 87;
        }
        if (super.field9357.field5178) {
            int[][] var4 = this.method3748(arg1, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class77.field1455; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field5946 <= var12) {
                    if (var12 <= this.field5939) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field5939;
                    }
                } else {
                    var8[var11] = this.field5946;
                }
                if (this.field5946 <= var13) {
                    if (~this.field5939 > ~var13) {
                        var9[var11] = this.field5939;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field5946;
                }
                if (this.field5946 > var14) {
                    var10[var11] = this.field5946;
                } else if (~this.field5939 > ~var14) {
                    var10[var11] = this.field5939;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(III)V", line = 179)
    public static final void method2588(int arg0, int arg1, int arg2) {
        ++field5938;
        if (class4.method19(-65, arg2)) {
            class359.method2242(0, class117.field1849[arg2], arg0);
            if (arg1 != -2) {
                field5950 = 44;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)[Lria;", line = 198)
    public static final class284[] method2589(int arg0) {
        if (arg0 < 100) {
            method2588(87, 0, 21);
        }
        ++field5943;
        return new class284[] { class433.field6041, class433.field6054, class433.field6056, class433.field6057, class433.field6058, class433.field6059, class433.field6060, class433.field6061, class433.field6062, class433.field6063, class433.field6064, class433.field6065, class433.field6066, class433.field6067 };
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 217)
    public static void method2590(int arg0) {
        int var1 = -115 % ((45 - arg0) / 39);
        field5947 = null;
        field5940 = null;
        field5948 = null;
    }
}
