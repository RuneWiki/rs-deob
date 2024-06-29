import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class119 extends class573 {

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    private int field2123 = 0;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    private int field2126 = 0;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    private int field2128 = 0;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field2120 = 0;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "[F")
    public static float[] field2130 = new float[4];

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    private int field2129;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    private int field2131;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    private int field2133;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    private int field2135;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    private int field2136;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    private int field2138;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "Lwt;")
    public static class284 field2122;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "Lek;")
    public static class471 field2137;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V")
    private final void method1039(int arg0, int arg1, int arg2, int arg3) {
        ++field2124;
        int var5 = -105 % ((arg0 - 39) / 33);
        int var6 = ~arg2 >= -2049 ? (arg3 + 4096) * arg2 >> 12 : -(arg2 * arg3 >> 12) + arg2 + arg3;
        if (~var6 < -1) {
            int var7 = arg1 * 6;
            int var8 = arg2 + arg2 + -var6;
            int var9 = (var6 - var8 << 12) / var6;
            int var10 = var7 >> 12;
            int var11 = var7 - (var10 << 12);
            int var13 = var9 * var6 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 - -var14;
            int var16 = var6 - var14;
            if (~var10 == -1) {
                this.field2131 = var6;
                this.field2133 = var8;
                this.field2138 = var15;
                return;
            }
            if (~var10 == -2) {
                this.field2138 = var6;
                this.field2131 = var16;
                this.field2133 = var8;
                return;
            }
            if (~var10 == -3) {
                this.field2138 = var6;
                this.field2133 = var15;
                this.field2131 = var8;
                return;
            }
            if (var10 == 3) {
                this.field2133 = var6;
                this.field2138 = var16;
                this.field2131 = var8;
                return;
            }
            if (var10 == 4) {
                this.field2138 = var8;
                this.field2133 = var6;
                this.field2131 = var15;
                return;
            }
            if (var10 == 5) {
                this.field2133 = var16;
                this.field2138 = var8;
                this.field2131 = var6;
                return;
            }
        } else {
            this.field2131 = this.field2138 = this.field2133 = arg2;
        }
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
    public static void method1040(int arg0) {
        field2137 = null;
        field2130 = null;
        field2122 = null;
        int var1 = 13 / ((arg0 - -31) / 50);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        ++field2121;
        if (arg2 != 3) {
            field2122 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field2123 = (arg0.method710((byte) 43) << 12) / 100;
                }
            } else {
                this.field2128 = (arg0.method710((byte) 43) << 12) / 100;
            }
        } else {
            this.field2126 = arg0.method721(-461515024);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIB)V")
    private final void method1041(int arg0, int arg1, int arg2, byte arg3) {
        ++field2132;
        if (arg3 > -119) {
            this.method1039(-47, 59, -107, 30);
        }
        int var5 = ~arg2 > ~arg0 ? arg0 : arg2;
        int var6 = ~var5 > ~arg1 ? arg1 : var5;
        int var7 = ~arg2 >= ~arg0 ? arg2 : arg0;
        int var8 = var7 > arg1 ? arg1 : var7;
        this.field2135 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (~var9 >= -1) {
            this.field2136 = 0;
        } else {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (-arg1 + var6 << 12) / var9;
            if (arg0 != var6) {
                if (~arg2 != ~var6) {
                    this.field2136 = ~arg0 == ~var8 ? var11 + 12288 : 20480 - var10;
                } else {
                    this.field2136 = ~arg1 == ~var8 ? var10 + 4096 : -var12 + 12288;
                }
            } else {
                this.field2136 = ~arg2 == ~var8 ? var12 + 20480 : -var11 + 4096;
            }
            this.field2136 /= 6;
        }
        if (this.field2135 > 0 && ~this.field2135 > -4097) {
            this.field2129 = (var9 << 12) / (~this.field2135 >= -2049 ? this.field2135 * 2 : 8192 - this.field2135 * 2);
        } else {
            this.field2129 = 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IBI)Z")
    public static final boolean method1042(int arg0, byte arg1, int arg2) {
        ++field2125;
        if (arg1 < 13) {
            field2130 = null;
        }
        return (arg0 & 262144) != 0 | class284.method1876(arg0, arg2, 0) || class629.method3599(arg0, -121, arg2);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class119() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field2127;
        if (arg0 > -116) {
            this.field2136 = -22;
        }
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (super.field8320.field3295) {
            int[][] var4 = this.method3293(0, 126, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class540.field7555; ++var11) {
                this.method1041(var5[var11], var7[var11], var6[var11], (byte) -122);
                this.field2129 += this.field2128;
                this.field2136 += this.field2126;
                this.field2135 += this.field2123;
                while (~this.field2136 > -1) {
                    this.field2136 += 4096;
                }
                while (this.field2136 > 4096) {
                    this.field2136 -= 4096;
                }
                if (this.field2129 < 0) {
                    this.field2129 = 0;
                }
                if (this.field2129 > 4096) {
                    this.field2129 = 4096;
                }
                if (this.field2135 < 0) {
                    this.field2135 = 0;
                }
                if (this.field2135 > 4096) {
                    this.field2135 = 4096;
                }
                this.method1039(80, this.field2136, this.field2135, this.field2129);
                var8[var11] = this.field2131;
                var9[var11] = this.field2138;
                var10[var11] = this.field2133;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B[B)Z")
    public static final boolean method1043(byte arg0, byte[] arg1) {
        ++field2134;
        class61 var2 = new class61(arg1);
        int var3 = var2.method732(-559537960);
        if (~var3 != -3) {
            return false;
        } else {
            int var4 = -85 % ((28 - arg0) / 42);
            boolean var5 = ~var2.method732(-559537960) == -2;
            if (var5) {
                class469.method2801(-196, var2);
            }
            class49.method605(var2, 65535);
            return true;
        }
    }
}
