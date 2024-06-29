import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class484 extends class739 {

    @OriginalMember(owner = "client!cga", name = "N", descriptor = "I")
    private int field6938 = 0;

    @OriginalMember(owner = "client!cga", name = "G", descriptor = "I")
    private int field6931 = 0;

    @OriginalMember(owner = "client!cga", name = "T", descriptor = "I")
    private int field6944 = 0;

    @OriginalMember(owner = "client!cga", name = "H", descriptor = "[I")
    public static int[] field6932 = new int[500];

    @OriginalMember(owner = "client!cga", name = "M", descriptor = "Lkg;")
    public static class275 field6937 = new class275(1, -1);

    @OriginalMember(owner = "client!cga", name = "E", descriptor = "I")
    private int field6929;

    @OriginalMember(owner = "client!cga", name = "F", descriptor = "I")
    private int field6930;

    @OriginalMember(owner = "client!cga", name = "I", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!cga", name = "J", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!cga", name = "K", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!cga", name = "L", descriptor = "I")
    private int field6936;

    @OriginalMember(owner = "client!cga", name = "O", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!cga", name = "P", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!cga", name = "Q", descriptor = "I")
    private int field6941;

    @OriginalMember(owner = "client!cga", name = "R", descriptor = "I")
    private int field6942;

    @OriginalMember(owner = "client!cga", name = "S", descriptor = "I")
    private int field6943;

    @OriginalMember(owner = "client!cga", name = "U", descriptor = "Ljava/lang/Object;")
    public static Object field6945;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)V", line = 14)
    public static void method2855(byte arg0) {
        if (arg0 >= 42) {
            field6932 = null;
            field6937 = null;
            field6945 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIII)V", line = 27)
    private final void method2856(int arg0, int arg1, int arg2, int arg3) {
        ++field6933;
        int var5 = arg3 <= arg0 ? arg0 : arg3;
        int var6 = 122 % ((arg1 - 77) / 32);
        int var7 = arg2 > var5 ? arg2 : var5;
        int var8 = arg0 > arg3 ? arg3 : arg0;
        int var9 = ~var8 >= ~arg2 ? var8 : arg2;
        int var10 = -var9 + var7;
        this.field6930 = (var7 + var9) / 2;
        if (~var10 >= -1) {
            this.field6936 = 0;
        } else {
            int var11 = (-arg3 + var7 << 12) / var10;
            int var12 = (-arg0 + var7 << 12) / var10;
            int var13 = (-arg2 + var7 << 12) / var10;
            if (~arg3 != ~var7) {
                if (arg0 == var7) {
                    this.field6936 = arg2 != var9 ? 12288 - var13 : var11 + 4096;
                } else {
                    this.field6936 = arg3 != var9 ? -var11 + 20480 : var12 + 12288;
                }
            } else {
                this.field6936 = ~arg0 == ~var9 ? var13 + 20480 : 4096 - var12;
            }
            this.field6936 /= 6;
        }
        if (~this.field6930 < -1 && ~this.field6930 > -4097) {
            this.field6943 = (var10 << 12) / (this.field6930 <= 2048 ? this.field6930 * 2 : -(this.field6930 * 2) + 8192);
        } else {
            this.field6943 = 0;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZLmk;I)V", line = 80)
    public static final void method2857(boolean arg0, class56 arg1, int arg2) {
        if (arg0) {
            ++field6940;
            if (~class3.field26 > -51) {
                if (arg1 != null && arg1.field790 != null && arg1.field790.length > arg2 && arg1.field790[arg2] != null) {
                    int var3 = arg1.field790[arg2][0];
                    int var4 = var3 >> 8;
                    if (arg1.field790[arg2].length > 1) {
                        int var5 = (int) (Math.random() * (double) arg1.field790[arg2].length);
                        if (var5 > 0) {
                            var4 = arg1.field790[arg2][var5];
                        }
                    }
                    int var6 = (247 & var3) >> 5;
                    int var7 = 256;
                    if (arg1.field767 != null && arg1.field774 != null) {
                        var7 = class141.method1022(arg1.field774[arg2], arg1.field767[arg2], 2);
                    }
                    if (arg1.field783) {
                        class622.method3499(var4, var7, false, true, var6, 0, 255);
                    } else {
                        class75.method673(var6, 255, var4, 0, var7, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V", line = 127)
    public class484() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(BI)[[I", line = 130)
    public final int[][] method223(byte arg0, int arg1) {
        ++field6939;
        if (arg0 < 26) {
            this.field6943 = -29;
        }
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (super.field10312.field4922) {
            int[][] var4 = this.method4119(2, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class29.field523 > var11; ++var11) {
                this.method2856(var6[var11], -27, var7[var11], var5[var11]);
                this.field6943 += this.field6931;
                this.field6930 += this.field6938;
                for (this.field6936 += this.field6944; this.field6936 < 0; this.field6936 += 4096) {
                }
                while (~this.field6936 < -4097) {
                    this.field6936 -= 4096;
                }
                if (this.field6943 < 0) {
                    this.field6943 = 0;
                }
                if (this.field6930 < 0) {
                    this.field6930 = 0;
                }
                if (this.field6943 > 4096) {
                    this.field6943 = 4096;
                }
                if (this.field6930 > 4096) {
                    this.field6930 = 4096;
                }
                this.method2858(true, this.field6936, this.field6930, this.field6943);
                var8[var11] = this.field6942;
                var9[var11] = this.field6941;
                var10[var11] = this.field6929;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lsl;II)V", line = 201)
    public final void method214(class461 arg0, int arg1, int arg2) {
        ++field6935;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field6938 = (arg0.method2601(0) << 12) / 100;
                }
            } else {
                this.field6931 = (arg0.method2601(0) << 12) / 100;
            }
        } else {
            this.field6944 = arg0.method2577(2);
        }
        if (arg2 != -3) {
            method2857(false, (class56) null, 105);
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZIII)V", line = 245)
    private final void method2858(boolean arg0, int arg1, int arg2, int arg3) {
        ++field6934;
        int var5 = ~arg2 < -2049 ? -(arg2 * arg3 >> 12) + arg2 + arg3 : (arg3 + 4096) * arg2 >> 12;
        if (!arg0) {
            this.method223((byte) -42, 97);
        }
        if (var5 <= 0) {
            this.field6942 = this.field6941 = this.field6929 = arg2;
        } else {
            int var6 = arg1 * 6;
            int var7 = -var5 + arg2 + arg2;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field6929 = var15;
                                    this.field6941 = var7;
                                    this.field6942 = var5;
                                }
                            } else {
                                this.field6942 = var14;
                                this.field6941 = var7;
                                this.field6929 = var5;
                            }
                        } else {
                            this.field6941 = var15;
                            this.field6942 = var7;
                            this.field6929 = var5;
                        }
                    } else {
                        this.field6942 = var7;
                        this.field6941 = var5;
                        this.field6929 = var14;
                    }
                } else {
                    this.field6942 = var15;
                    this.field6929 = var7;
                    this.field6941 = var5;
                }
            } else {
                this.field6942 = var5;
                this.field6941 = var14;
                this.field6929 = var7;
            }
        }
    }
}
