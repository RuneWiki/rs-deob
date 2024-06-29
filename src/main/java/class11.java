import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class11 extends class264 {

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "I")
    private int field162 = 3216;

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "[I")
    private int[] field164 = new int[3];

    @OriginalMember(owner = "client!ub", name = "mb", descriptor = "I")
    private int field165 = 3216;

    @OriginalMember(owner = "client!ub", name = "sb", descriptor = "I")
    private int field171 = 4096;

    @OriginalMember(owner = "client!ub", name = "pb", descriptor = "I")
    public static int field168 = 0;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ub", name = "nb", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ub", name = "ob", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ub", name = "qb", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ub", name = "rb", descriptor = "[I")
    public static int[] field170;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZLeb;ZI)V", line = 4)
    public static final void method109(int arg0, boolean arg1, class253 arg2, boolean arg3, int arg4) {
        field167++;
        int var5 = arg2.field4228;
        if (arg2.field4332 == 0) {
            arg2.field4228 = arg2.field4283;
        } else if (arg2.field4332 == 1) {
            arg2.field4228 = arg4 - arg2.field4283;
        } else if (arg2.field4332 == 2) {
            arg2.field4228 = arg2.field4283 * arg4 >> 14;
        } else if (arg2.field4332 == 3) {
            if (arg2.field4216 == 2) {
                arg2.field4228 = arg2.field4283 * 32 + ((arg2.field4283 - 1) * arg2.field4244);
            } else if (arg2.field4216 == 7) {
                arg2.field4228 = arg2.field4283 * 115 + ((arg2.field4283 - 1) * arg2.field4244);
            }
        }
        if (!arg1) {
            return;
        }
        int var6 = arg2.field4190;
        if (arg2.field4323 == 0) {
            arg2.field4190 = arg2.field4248;
        } else if (arg2.field4323 == 1) {
            arg2.field4190 = arg0 - arg2.field4248;
        } else if (arg2.field4323 == 2) {
            arg2.field4190 = arg2.field4248 * arg0 >> 14;
        } else if (arg2.field4323 == 3) {
            if (arg2.field4216 == 2) {
                arg2.field4190 = arg2.field4248 * 32 + ((arg2.field4248 - 1) * arg2.field4203);
            } else if (arg2.field4216 == 7) {
                arg2.field4190 = (arg2.field4248 - 1) * arg2.field4203 + arg2.field4248 * 12;
            }
        }
        if (arg2.field4332 == 4) {
            arg2.field4228 = arg2.field4231 * arg2.field4190 / arg2.field4193;
        }
        if (arg2.field4323 == 4) {
            arg2.field4190 = arg2.field4228 * arg2.field4193 / arg2.field4231;
        }
        if (class184.field2833 && (client.method767(arg2) != 0 || arg2.field4216 == 0)) {
            if (arg2.field4190 < 5 && arg2.field4228 < 5) {
                arg2.field4228 = 5;
                arg2.field4190 = 5;
            } else {
                if (arg2.field4228 <= 0) {
                    arg2.field4228 = 5;
                }
                if (arg2.field4190 <= 0) {
                    arg2.field4190 = 5;
                }
            }
        }
        if (arg2.field4238 == 1337) {
            class208.field3306 = arg2;
        }
        if (arg3 && arg2.field4253 != null && (arg2.field4228 != var5 || arg2.field4190 != var6)) {
            class256 var7 = new class256();
            var7.field4382 = arg2;
            var7.field4372 = arg2.field4253;
            class157.field2360.method1485(-8564, var7);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[I", line = 108)
    public final int[] method5(int arg0, int arg1) {
        field166++;
        int[] var3 = this.field4501.method1176(arg1, 127);
        if (this.field4501.field2741) {
            int var4 = class234.field3871 * this.field171 >> 12;
            int[] var5 = this.method1815(0, class68.field1082 & arg1 - 1, 88);
            int[] var6 = this.method1815(0, arg1, 57);
            int[] var7 = this.method1815(0, arg1 + 1 & class68.field1082, -127);
            for (int var8 = 0; var8 < class226.field3716; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class256.field4370] - var6[class256.field4370 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class259.field4418[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field164[0] * var14 >> 12;
                int var17 = var13 * 4096 >> 8;
                int var18 = this.field164[2] * var17 >> 12;
                int var19 = this.field164[1] * var15 >> 12;
                var3[var8] = var18 + var19 + var16;
            }
        }
        return arg0 >= -58 ? (int[]) null : var3;
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V", line = 184)
    private final void method110(byte arg0) {
        field161++;
        double var2 = Math.cos((double) ((float) this.field162 / 4096.0F));
        this.field164[0] = (int) (var2 * Math.sin((double) ((float) this.field165 / 4096.0F)) * 4096.0D);
        int var4 = -122 / ((8 - arg0) / 58);
        this.field164[1] = (int) (Math.cos((double) ((float) this.field165 / 4096.0F)) * var2 * 4096.0D);
        this.field164[2] = (int) (Math.sin((double) ((float) this.field162 / 4096.0F)) * 4096.0D);
        int var5 = this.field164[2] * this.field164[2] >> 12;
        int var6 = this.field164[0] * this.field164[0] >> 12;
        int var7 = this.field164[1] * this.field164[1] >> 12;
        int var8 = (int) (Math.sqrt((double) (var5 + var6 + var7 >> 12)) * 4096.0D);
        if (var8 != 0) {
            this.field164[0] = (this.field164[0] << 12) / var8;
            this.field164[2] = (this.field164[2] << 12) / var8;
            this.field164[1] = (this.field164[1] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 228)
    public final void method111(int arg0) {
        int var2 = 6 / ((66 - arg0) / 44);
        this.method110((byte) 114);
        field169++;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)I", line = 239)
    public static final int method112(int arg0, int arg1) {
        int var2 = 124 / ((-arg1 - 20) / 62);
        field158++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V", line = 248)
    public static final void method113(int arg0) {
        if (arg0 > 2) {
            field160++;
            class300.field5062 = new class209(32);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 264)
    public class11() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIILkb;IJZ)Z", line = 268)
    public static final boolean method114(int arg0, int arg1, int arg2, int arg3, int arg4, class280 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class204.method1356(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILii;)V", line = 313)
    public final void method4(int arg0, int arg1, class221 arg2) {
        field159++;
        if (arg1 > -27) {
            this.field165 = -69;
        }
        if (arg0 == 0) {
            this.field171 = arg2.method1524((byte) 74);
        } else if (arg0 == 1) {
            this.field165 = arg2.method1524((byte) 57);
        } else if (arg0 == 2) {
            this.field162 = arg2.method1524((byte) 88);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[S[Lma;)V", line = 357)
    public static final void method115(int arg0, int arg1, int arg2, short[] arg3, class5[] arg4) {
        if (arg2 != 9357) {
            return;
        }
        field163++;
        if (arg0 <= arg1) {
            return;
        }
        int var5 = arg1;
        int var6 = (arg1 + arg0) / 2;
        class5 var7 = arg4[var6];
        arg4[var6] = arg4[arg0];
        arg4[arg0] = var7;
        short var8 = arg3[var6];
        arg3[var6] = arg3[arg0];
        arg3[arg0] = var8;
        for (int var9 = arg1; var9 < arg0; var9++) {
            if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].method48(255, var7)) {
                class5 var10 = arg4[var9];
                arg4[var9] = arg4[var5];
                arg4[var5] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var5];
                arg3[var5++] = var11;
            }
        }
        arg4[arg0] = arg4[var5];
        arg4[var5] = var7;
        arg3[arg0] = arg3[var5];
        arg3[var5] = var8;
        method115(var5 - 1, arg1, arg2, arg3, arg4);
        method115(arg0, var5 + 1, arg2 ^ 0x0, arg3, arg4);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V", line = 414)
    public static void method116(boolean arg0) {
        field170 = null;
        if (arg0) {
            field170 = (int[]) null;
        }
    }
}
