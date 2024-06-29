import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class160 extends class118 {

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "Lcm;")
    public static class382 field2208 = new class382(8);

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field2211 = -1;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "[I")
    public static int[] field2215 = new int[100];

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "[I")
    public static int[] field2210;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "[Lba;")
    private class441[] field2207;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field2206;
        int[][] var3 = super.field1549.method2013(arg1, true);
        if (arg0) {
            field2211 = 117;
        }
        if (super.field1549.field4903) {
            int var4 = class440.field6474;
            int var5 = class289.field4403;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field1549.method2011(-75);
            this.method971(var6, 0);
            for (int var8 = 0; var8 < class289.field4403; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; class440.field6474 > var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class406.method2552(var15 << 4, 4080);
                    var12[var14] = class406.method2552(var15 >> 4, 4080);
                    var11[var14] = class406.method2552(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field2213;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (arg0 != 1) {
            this.field2207 = null;
        }
        if (super.field1537.field5756) {
            this.method971(super.field1537.method2394(0), 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZBI)Ltd;")
    public static final class333 method969(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        ++field2209;
        class333 var5 = new class333();
        var5.field4965 = arg1;
        var5.field4962 = arg4;
        class308.field4647.method2301(108, var5, (long) arg0);
        class292.method1810(arg1, arg3 ^ -92);
        if (arg3 != -92) {
            field2208 = null;
        }
        class170 var6 = class168.method1020(arg0, (byte) 80);
        if (var6 != null) {
            class405.method2543(var6, 125);
        }
        if (class98.field1359 != null) {
            class405.method2543(class98.field1359, 127);
            class98.field1359 = null;
        }
        class198.method1185(-2);
        if (var6 != null) {
            class207.method1215(var6, !arg2, 44);
        }
        if (!arg2) {
            class384.method2314(arg1);
        }
        if (!arg2 && class6.field69 != -1) {
            class250.method1526((byte) -63, 1, class6.field69);
        }
        return var5;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (~arg0 == -1) {
            this.field2207 = new class441[arg2.method2343(255)];
            for (int var4 = 0; var4 < this.field2207.length; ++var4) {
                int var5 = arg2.method2343(255);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field2207[var4] = client.method2790(30526, arg2);
                            }
                        } else {
                            this.field2207[var4] = class169.method1033(arg2, 10550);
                        }
                    } else {
                        this.field2207[var4] = class213.method1247(113, arg2);
                    }
                } else {
                    this.field2207[var4] = class328.method2021(50, arg2);
                }
            }
        } else if (arg0 == 1) {
            super.field1552 = arg2.method2343(255) == 1;
        }
        ++field2214;
        if (arg1 != 1) {
            field2211 = 93;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class160() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public static void method970(int arg0) {
        field2208 = null;
        field2215 = null;
        if (arg0 <= 64) {
            method969(87, -59, false, (byte) -38, -46);
        }
        field2210 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([[II)V")
    private final void method971(int[][] arg0, int arg1) {
        ++field2212;
        int var3 = class440.field6474;
        int var4 = class289.field4403;
        class385.method2347(true, arg0);
        class313.method1912(arg1, class438.field6441, 0, class87.field1230, arg1);
        if (this.field2207 != null) {
            for (int var5 = 0; ~this.field2207.length < ~var5; ++var5) {
                class441 var6 = this.field2207[var5];
                int var7 = var6.field6487;
                int var8 = var6.field6485;
                if (var7 >= 0) {
                    if (var8 >= 0) {
                        var6.method176(var3, 307, var4);
                    } else {
                        var6.method175((byte) -118, var3, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method174(var4, true, var3);
                }
            }
        }
    }
}
