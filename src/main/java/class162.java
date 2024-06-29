import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class162 extends class128 {

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    private int field2229 = 0;

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
    private int field2239 = 0;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    private int field2227 = 0;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public static int field2228 = 0;

    @OriginalMember(owner = "client!wm", name = "W", descriptor = "Z")
    public static boolean field2241 = true;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "Z")
    public static boolean field2236 = false;

    @OriginalMember(owner = "client!wm", name = "X", descriptor = "I")
    public static int field2242 = 0;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    private int field2230;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    private int field2231;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
    private int field2233;

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    private int field2235;

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!wm", name = "Y", descriptor = "I")
    private int field2243;

    @OriginalMember(owner = "client!wm", name = "Z", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!wm", name = "ab", descriptor = "I")
    private int field2245;

    @OriginalMember(owner = "client!wm", name = "bb", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "Lsm;")
    public static class167 field2237;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIIII)V", line = 8)
    public static final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2232++;
        if (class285.method2039(arg5, -32660)) {
            class25.method161(arg1, arg3, arg0, -1, arg4, arg6, arg2, arg7 + 33484, class175.field2535[arg5], arg8);
            if (arg7 != -18460) {
                method1068(0);
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class285.field4483[var9] = true;
            }
        } else {
            class285.field4483[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIII)V", line = 38)
    private final void method1067(int arg0, int arg1, int arg2, int arg3) {
        field2234++;
        int var5 = arg3 <= 2048 ? (arg0 + 4096) * arg3 >> 12 : arg0 + arg3 - (arg0 * arg3 >> 12);
        if (arg2 != 8192) {
            field2228 = 37;
        }
        if (var5 <= 0) {
            this.field2235 = this.field2230 = this.field2243 = arg3;
            return;
        }
        int var6 = arg1 * 6;
        int var7 = arg3 + arg3 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var10 = var6 >> 12;
        int var11 = var8 * var5 >> 12;
        int var12 = var6 - (var10 << 12);
        int var13 = var11 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var7 + var13;
        if (var10 == 0) {
            this.field2230 = var15;
            this.field2235 = var5;
            this.field2243 = var7;
        } else if (var10 == 1) {
            this.field2230 = var5;
            this.field2235 = var14;
            this.field2243 = var7;
        } else if (var10 == 2) {
            this.field2235 = var7;
            this.field2230 = var5;
            this.field2243 = var15;
        } else if (var10 == 3) {
            this.field2230 = var14;
            this.field2243 = var5;
            this.field2235 = var7;
        } else if (var10 == 4) {
            this.field2243 = var5;
            this.field2230 = var7;
            this.field2235 = var15;
        } else if (var10 == 5) {
            this.field2235 = var5;
            this.field2243 = var14;
            this.field2230 = var7;
        }
    }

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)V", line = 145)
    public static void method1068(int arg0) {
        if (arg0 != -1) {
            field2236 = false;
        }
        field2237 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lp;II)V", line = 169)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 >= -85) {
            return;
        }
        if (arg1 == 0) {
            this.field2229 = arg0.method656(-68);
        } else if (arg1 == 1) {
            this.field2227 = (arg0.method679(-3) << 12) / 100;
        } else if (arg1 == 2) {
            this.field2239 = (arg0.method679(-3) << 12) / 100;
        }
        field2238++;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 359)
    public class162() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(IIII)V", line = 232)
    private final void method1069(int arg0, int arg1, int arg2, int arg3) {
        field2246++;
        int var5 = arg2 > arg1 ? arg2 : arg1;
        int var6 = arg0 > var5 ? arg0 : var5;
        int var7 = arg1 > arg2 ? arg2 : arg1;
        int var8 = var7 <= arg0 ? var7 : arg0;
        int var9 = var6 - var8;
        if (var9 <= 0) {
            this.field2233 = 0;
        } else {
            int var10 = (var6 - arg2 << 12) / var9;
            int var11 = (var6 - arg1 << 12) / var9;
            int var12 = (var6 - arg0 << 12) / var9;
            if (arg2 == var6) {
                this.field2233 = arg1 == var8 ? var12 + 20480 : -var11 + 4096;
            } else if (arg1 == var6) {
                this.field2233 = arg0 == var8 ? var10 + 4096 : 12288 - var12;
            } else {
                this.field2233 = arg2 == var8 ? var11 + 12288 : -var10 + 20480;
            }
            this.field2233 /= 6;
        }
        this.field2231 = (var6 + var8) / 2;
        if (this.field2231 > arg3 && this.field2231 < 4096) {
            this.field2245 = (var9 << 12) / (this.field2231 > 2048 ? 8192 - this.field2231 * 2 : this.field2231 * 2);
        } else {
            this.field2245 = 0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[[I", line = 291)
    public final int[][] method102(int arg0, int arg1) {
        if (arg1 != 5110) {
            this.field2229 = -104;
        }
        int[][] var3 = this.field1755.method875(78, arg0);
        field2240++;
        if (this.field1755.field1815) {
            int[][] var4 = this.method855(-3102, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class10.field141; var11++) {
                this.method1069(var7[var11], var6[var11], var5[var11], 0);
                this.field2233 += this.field2229;
                this.field2245 += this.field2227;
                while (this.field2233 < 0) {
                    this.field2233 += 4096;
                }
                if (this.field2245 < 0) {
                    this.field2245 = 0;
                }
                while (this.field2233 > 4096) {
                    this.field2233 -= 4096;
                }
                this.field2231 += this.field2239;
                if (this.field2231 < 0) {
                    this.field2231 = 0;
                }
                if (this.field2231 > 4096) {
                    this.field2231 = 4096;
                }
                if (this.field2245 > 4096) {
                    this.field2245 = 4096;
                }
                this.method1067(this.field2245, this.field2233, 8192, this.field2231);
                var8[var11] = this.field2235;
                var9[var11] = this.field2230;
                var10[var11] = this.field2243;
            }
        }
        return var3;
    }
}
