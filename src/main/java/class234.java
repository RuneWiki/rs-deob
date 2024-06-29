import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class234 extends class23 {

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "[[[B")
    public static byte[][][] field4379;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field4380;
        if (arg1 <= 19) {
            method1559(57);
        }
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int[] var4 = this.method120(arg0, false, 0);
            for (int var5 = 0; class70.field1276 > var5; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Z")
    public static final boolean method1556(int arg0, int arg1) {
        ++field4377;
        if (~arg0 > arg1) {
            return false;
        } else {
            int var2 = class53.field994[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1003;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
    public static final int method1557(int arg0, int arg1, int arg2, int arg3) {
        ++field4381;
        if (arg0 != 4570) {
            field4385 = -60;
        }
        if ((8 & class116.field2100[arg3][arg2][arg1]) != 0) {
            return 0;
        } else {
            return ~arg3 < -1 && (2 & class116.field2100[1][arg2][arg1]) != 0 ? arg3 - 1 : arg3;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class234() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IJ)Li;")
    public static final class88 method1558(int arg0, long arg1) {
        ++field4383;
        if (arg0 < 3) {
            method1557(-127, 2, 1, -91);
        }
        return class240.method1588(false, 10, arg1, false);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        int[][] var3 = super.field364.method1541(true, arg0);
        if (arg1 != 13) {
            field4385 = 46;
        }
        if (super.field364.field4312) {
            int[][] var4 = this.method121(0, (byte) 33, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~class70.field1276 < ~var11; ++var11) {
                var10[var11] = -var5[var11] + 4096;
                var8[var11] = -var6[var11] + 4096;
                var9[var11] = 4096 - var7[var11];
            }
        }
        ++field4378;
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public static void method1559(int arg0) {
        field4379 = null;
        if (arg0 != 65367) {
            field4379 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lnb;ZII)Lrc;")
    public static final class188 method1560(class144 arg0, boolean arg1, int arg2, int arg3) {
        ++field4386;
        if (arg1) {
            method1556(-106, -103);
        }
        return !class47.method358(854010832, arg0, arg2, arg3) ? null : class203.method1395((byte) 77);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            field4379 = null;
        }
        ++field4384;
        if (arg2 == 0) {
            super.field369 = ~arg0.method347(arg1 ^ -26118) == -2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)I")
    public static final int method1561(int arg0, boolean arg1) {
        ++field4376;
        double var2 = (double) ((65367 & arg0) >> 8) / 256.0D;
        double var4 = (double) ((arg0 & 16772013) >> 16) / 256.0D;
        if (!arg1) {
            field4385 = 103;
        }
        double var6 = (double) (255 & arg0) / 256.0D;
        double var8 = var4;
        if (var4 < var2) {
            var8 = var2;
        }
        double var10 = 0.0D;
        double var12 = var4;
        if (var2 < var4) {
            var12 = var2;
        }
        if (var8 < var6) {
            var8 = var6;
        }
        if (var12 > var6) {
            var12 = var6;
        }
        double var14 = 0.0D;
        double var16 = (var8 + var12) / 2.0D;
        if (var8 != var12) {
            if (var16 < 0.5D) {
                var10 = (var8 - var12) / (var8 + var12);
            }
            if (var4 == var8) {
                var14 = (var2 - var6) / (var8 - var12);
            } else if (var2 != var8) {
                if (var6 == var8) {
                    var14 = (-var2 + var4) / (-var12 + var8) + 4.0D;
                }
            } else {
                var14 = (var6 - var4) / (var8 - var12) + 2.0D;
            }
            if (var16 >= 0.5D) {
                var10 = (-var12 + var8) / (-var8 + 2.0D + -var12);
            }
        }
        double var18 = var14 / 6.0D;
        int var20 = (int) (var10 * 256.0D);
        int var21 = (int) (var18 * 256.0D);
        if (~var20 > -1) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (~var22 > -1) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (~var22 < -244) {
            var20 >>= 4;
        } else if (~var22 < -218) {
            var20 >>= 3;
        } else if (var22 <= 192) {
            if (~var22 < -180) {
                var20 >>= 1;
            }
        } else {
            var20 >>= 2;
        }
        return (var20 >> 5 << 7) + (var21 >> 2 << 10) + (var22 >> 1);
    }
}
