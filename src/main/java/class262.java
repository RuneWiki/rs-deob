import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class262 extends class199 {

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
    private int field3795 = 0;

    @OriginalMember(owner = "client!lj", name = "hb", descriptor = "I")
    private int field3804 = 0;

    @OriginalMember(owner = "client!lj", name = "lb", descriptor = "I")
    private int field3808 = 0;

    @OriginalMember(owner = "client!lj", name = "mb", descriptor = "[F")
    public static float[] field3809 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!lj", name = "fb", descriptor = "I")
    public static int field3802 = -1;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    private int field3791;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    private int field3793;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
    private int field3794;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
    private int field3798;

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!lj", name = "db", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!lj", name = "eb", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!lj", name = "gb", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!lj", name = "ib", descriptor = "I")
    private int field3805;

    @OriginalMember(owner = "client!lj", name = "jb", descriptor = "I")
    private int field3806;

    @OriginalMember(owner = "client!lj", name = "kb", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "Lfh;")
    public static class140 field3790;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)Lco;", line = 5)
    public static final class294 method1803(int arg0, int arg1, int arg2) {
        class119 var3 = class345.field5367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1563; var4++) {
            class294 var5 = var3.field1549[var4];
            if ((var5.field4289 >> 29 & 0x3L) == 2L && var5.field4283 == arg1 && var5.field4287 == arg2) {
                class117.method853(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIB)V", line = 31)
    private final void method1804(int arg0, int arg1, int arg2, byte arg3) {
        field3797++;
        int var5 = arg1 > 2048 ? arg1 + arg2 - (arg1 * arg2 >> 12) : (arg2 + 4096) * arg1 >> 12;
        if (var5 > 0) {
            int var6 = arg1 + arg1 - var5;
            int var7 = (var5 - var6 << 12) / var5;
            int var8 = arg0 * 6;
            int var9 = var8 >> 12;
            int var11 = var8 - (var9 << 12);
            int var12 = var7 * var5 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var6 + var13;
            if (var9 == 0) {
                this.field3793 = var15;
                this.field3791 = var5;
                this.field3806 = var6;
            } else if (var9 == 1) {
                this.field3793 = var5;
                this.field3791 = var14;
                this.field3806 = var6;
            } else if (var9 == 2) {
                this.field3791 = var6;
                this.field3793 = var5;
                this.field3806 = var15;
            } else if (var9 == 3) {
                this.field3791 = var6;
                this.field3793 = var14;
                this.field3806 = var5;
            } else if (var9 == 4) {
                this.field3791 = var15;
                this.field3793 = var6;
                this.field3806 = var5;
            } else if (var9 == 5) {
                this.field3793 = var6;
                this.field3791 = var5;
                this.field3806 = var14;
            }
        } else {
            this.field3791 = this.field3793 = this.field3806 = arg1;
        }
        int var17 = 65 % ((arg3 + 33) / 61);
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 209)
    public class262() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)I", line = 150)
    public static final int method1805(int arg0, byte arg1) {
        field3796++;
        int var8 = arg0 - 1;
        int var2 = -70 % ((arg1 - 53) / 33);
        int var3 = var8 | var8 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLfd;I)V", line = 166)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field3800++;
        if (arg2 == 0) {
            this.field3804 = arg1.method2043(true);
        } else if (arg2 == 1) {
            this.field3808 = (arg1.method2104(106) << 12) / 100;
        } else if (arg2 == 2) {
            this.field3795 = (arg1.method2104(arg0 + 160) << 12) / 100;
        }
        if (arg0 != -43) {
            method1805(-95, (byte) 11);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V", line = 216)
    private final void method1806(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >= arg3 ? arg1 : arg3;
        int var6 = var5 < arg0 ? arg0 : var5;
        field3799++;
        int var7 = arg3 < arg1 ? arg3 : arg1;
        int var8 = var7 > arg0 ? arg0 : var7;
        this.field3798 = (var6 + var8) / 2;
        if (arg2 != -2) {
            this.method1806(-23, 40, -83, -78);
        }
        int var9 = var6 - var8;
        if (var9 <= 0) {
            this.field3794 = 0;
        } else {
            int var10 = (var6 - arg0 << 12) / var9;
            int var11 = (var6 - arg3 << 12) / var9;
            int var12 = (var6 - arg1 << 12) / var9;
            if (arg3 == var6) {
                this.field3794 = arg1 == var8 ? var10 + 20480 : -var12 + 4096;
            } else if (arg1 == var6) {
                this.field3794 = arg0 == var8 ? var11 + 4096 : -var10 + 12288;
            } else {
                this.field3794 = arg3 == var8 ? var12 + 12288 : -var11 + 20480;
            }
            this.field3794 /= 6;
        }
        if (this.field3798 > 0 && this.field3798 < 4096) {
            this.field3805 = (var9 << 12) / (this.field3798 <= 2048 ? this.field3798 * 2 : 8192 - (this.field3798 * 2));
        } else {
            this.field3805 = 0;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILwf;B)Ljava/lang/String;", line = 270)
    public static final String method1807(int arg0, class333 arg1, byte arg2) {
        field3792++;
        if (arg2 <= 27) {
            method1805(84, (byte) 81);
        }
        if (!client.method891(arg1).method1093(arg0, 58) && arg1.field5118 == null) {
            return null;
        } else if (arg1.field5165 == null || arg0 >= arg1.field5165.length || arg1.field5165[arg0] == null || arg1.field5165[arg0].trim().length() == 0) {
            return class40.field503 ? "Hidden-" + arg0 : null;
        } else {
            return arg1.field5165[arg0];
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[[I", line = 293)
    public final int[][] method215(int arg0, int arg1) {
        field3807++;
        if (arg1 != -29869) {
            method1809((class140) null, (byte) -12);
        }
        int[][] var3 = this.field2796.method2187(arg0, -102);
        if (this.field2796.field4667) {
            int[][] var4 = this.method1459(0, arg0, (byte) -51);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class95.field1235; var11++) {
                this.method1806(var8[var11], var6[var11], -2, var5[var11]);
                this.field3798 += this.field3795;
                this.field3805 += this.field3808;
                if (this.field3805 < 0) {
                    this.field3805 = 0;
                }
                this.field3794 += this.field3804;
                if (this.field3805 > 4096) {
                    this.field3805 = 4096;
                }
                while (this.field3794 < 0) {
                    this.field3794 += 4096;
                }
                if (this.field3798 < 0) {
                    this.field3798 = 0;
                }
                if (this.field3798 > 4096) {
                    this.field3798 = 4096;
                }
                while (this.field3794 > 4096) {
                    this.field3794 -= 4096;
                }
                this.method1804(this.field3794, this.field3798, this.field3805, (byte) -100);
                var7[var11] = this.field3791;
                var9[var11] = this.field3793;
                var10[var11] = this.field3806;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V", line = 369)
    public static void method1808(int arg0) {
        field3790 = null;
        if (arg0 != 12288) {
            field3789 = 47;
        }
        field3809 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lfh;B)V", line = 393)
    public static final void method1809(class140 arg0, byte arg1) {
        if (arg1 <= 107) {
            field3809 = (float[]) null;
        }
        class167.field2332 = arg0;
        field3801++;
    }
}
