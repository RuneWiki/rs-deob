import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class406 extends class223 {

    @OriginalMember(owner = "client!iu", name = "y", descriptor = "Lfd;")
    private class365 field6048;

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "Loq;")
    private class240 field6058;

    @OriginalMember(owner = "client!iu", name = "J", descriptor = "Lvp;")
    private class124 field6059;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
    private int field6039;

    @OriginalMember(owner = "client!iu", name = "A", descriptor = "I")
    private int field6050;

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
    private int field6057;

    @OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
    private int field6046;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "[[F")
    private float[][] field6042;

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "[[F")
    private float[][] field6045;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "[[F")
    private float[][] field6036;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "Liv;")
    private class65 field6041;

    @OriginalMember(owner = "client!iu", name = "C", descriptor = "Lhk;")
    private class67 field6052;

    @OriginalMember(owner = "client!iu", name = "E", descriptor = "Lib;")
    private class106 field6054;

    @OriginalMember(owner = "client!iu", name = "u", descriptor = "Lbk;")
    private class254 field6044;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "Lvd;")
    private class30 field6035;

    @OriginalMember(owner = "client!iu", name = "F", descriptor = "Lpc;")
    private class473 field6055;

    @OriginalMember(owner = "client!iu", name = "D", descriptor = "Lpc;")
    private class473 field6053;

    @OriginalMember(owner = "client!iu", name = "G", descriptor = "I")
    public static int field6056 = 0;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
    private int field6043;

    @OriginalMember(owner = "client!iu", name = "x", descriptor = "I")
    private int field6047;

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!iu", name = "B", descriptor = "I")
    public static int field6051;

    static {
        new class331(" days.", " Tage.", " jours.", " dias.");
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIII)V", line = 8)
    private final void method2492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6051++;
        long var8 = -1L;
        if (arg3 != -26291) {
            this.field6043 = -98;
        }
        int var10 = (arg6 << this.field6058.field2001) + arg0;
        int var11 = (arg5 << this.field6058.field2001) + arg1;
        int var12 = this.field6058.method426(var10, var11);
        if ((arg0 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 << 16 & 0xFFFFL << 16;
            class223 var13 = this.field6054.method875(var8, 126);
            if (var13 != null) {
                this.method2493((byte) 21, ((class360) var13).field5002);
                return;
            }
        }
        short var14 = (short) (this.field6047++);
        if (var8 != -1L) {
            this.field6054.method878(var8, -2301, new class360(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg1 == 0) {
            var15 = this.field6036[arg4][arg2];
            var16 = this.field6042[arg4][arg2];
            var17 = this.field6045[arg4][arg2];
        } else if (this.field6058.field2006 == arg0 && arg1 == 0) {
            var17 = this.field6045[arg4 + 1][arg2];
            var16 = this.field6042[arg4 + 1][arg2];
            var15 = this.field6036[arg4 + 1][arg2];
        } else if (this.field6058.field2006 == arg0 && this.field6058.field2006 == arg1) {
            var17 = this.field6045[arg4 + 1][arg2 + 1];
            var16 = this.field6042[arg4 + 1][arg2 + 1];
            var15 = this.field6036[arg4 + 1][arg2 + 1];
        } else if (arg0 == 0 && this.field6058.field2006 == arg1) {
            var15 = this.field6036[arg4][arg2 + 1];
            var16 = this.field6042[arg4][arg2 + 1];
            var17 = this.field6045[arg4][arg2 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field6058.field2006;
            float var19 = (float) arg1 / (float) this.field6058.field2006;
            float var20 = this.field6036[arg4][arg2];
            float var21 = this.field6042[arg4][arg2];
            float var22 = this.field6045[arg4][arg2];
            float var23 = this.field6036[arg4 + 1][arg2];
            float var24 = this.field6042[arg4 + 1][arg2];
            float var25 = (this.field6042[arg4 + 1][arg2 + 1] - var24) * var18 + var24;
            float var26 = (this.field6045[arg4][arg2 + 1] - var22) * var18 + var22;
            float var27 = this.field6045[arg4 + 1][arg2];
            float var28 = (this.field6036[arg4 + 1][arg2 + 1] - var23) * var18 + var23;
            float var29 = (this.field6036[arg4][arg2 + 1] - var20) * var18 + var20;
            float var30 = (this.field6042[arg4][arg2 + 1] - var21) * var18 + var21;
            var16 = (var25 - var30) * var19 + var30;
            float var31 = (this.field6045[arg4 + 1][arg2 + 1] - var27) * var18 + var27;
            var15 = (var28 - var29) * var19 + var29;
            var17 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field6059.method980(false) - var10);
        float var33 = (float) (this.field6059.method981((byte) 27) - var12);
        float var34 = (float) (this.field6059.method983((byte) -119) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field6059.method984(arg3 + 26413);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var37 + var15 * var39 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6059.method982((byte) -113);
        int var45 = (int) ((float) ((var44 & 0xFF6200) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field6048.field5443) {
            this.field6052.method655((float) var10, (byte) 98);
            this.field6052.method655((float) var12, (byte) 98);
            this.field6052.method655((float) var11, (byte) 98);
        } else {
            this.field6052.method651((float) var10, arg3 + 1739693795);
            this.field6052.method651((float) var12, 1739667504);
            this.field6052.method651((float) var11, 1739667504);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field6052.method638(255, var45);
        this.field6052.method638(255, var46);
        this.field6052.method638(255, var47);
        this.field6052.method638(255, 255);
        this.method2493((byte) 19, var14);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BS)V", line = 183)
    private final void method2493(byte arg0, short arg1) {
        field6040++;
        if (this.field6048.field5443) {
            this.field6041.method611((byte) 67, arg1);
        } else {
            this.field6041.method628((byte) -92, arg1);
        }
        int var3 = -77 % ((arg0 + 40) / 40);
        this.field6043++;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILqm;)V", line = 200)
    public static final void method2494(int arg0, class97 arg1) {
        if (arg0 != 21944) {
            field6056 = 88;
        }
        field6038++;
        if (!class500.field7415) {
            arg1.method1525((byte) 81);
            class291.field4175--;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIII[[Z)V", line = 221)
    public final void method2495(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field6037++;
        if (this.field6044 == null || (arg0 + arg2) < this.field6039 || arg2 - arg0 > this.field6050 || arg1 <= 19 || this.field6057 > (arg0 + arg3) || arg3 - arg0 > this.field6046) {
            return;
        }
        for (int var6 = this.field6057; var6 <= this.field6046; var6++) {
            for (int var7 = this.field6039; var7 <= this.field6050; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg3;
                if (var8 > (-arg0) && arg0 > var8 && var9 > -arg0 && arg0 > var9 && arg4[arg0 + var8][arg0 + var9]) {
                    this.field6048.method2184((byte) -100, (int) (this.field6059.method979(false) * 255.0F) << 24);
                    this.field6048.method2217(this.field6053, 127, null, null, this.field6055);
                    this.field6048.method2250(0, this.field6043, 4, this.field6044, (byte) -95);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lfd;Loq;Lvp;[I)V", line = 295)
    public class406(class365 arg0, class240 arg1, class124 arg2, int[] arg3) {
        this.field6048 = arg0;
        this.field6058 = arg1;
        this.field6059 = arg2;
        int var5 = this.field6059.method984(115) - (arg1.field2006 >> 1);
        this.field6039 = this.field6059.method980(false) - var5 >> arg1.field2001;
        this.field6050 = this.field6059.method980(false) + var5 >> arg1.field2001;
        this.field6057 = this.field6059.method983((byte) -109) - var5 >> arg1.field2001;
        this.field6046 = this.field6059.method983((byte) -67) + var5 >> arg1.field2001;
        int var6 = this.field6050 + 1 - this.field6039;
        int var7 = this.field6046 + 1 - this.field6057;
        this.field6042 = new float[var6 + 1][var7 + 1];
        this.field6045 = new float[var6 + 1][var7 + 1];
        this.field6036 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field6057 + var8;
            if (var24 > 0 && (this.field6058.field2003 - 1) > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field6039 + var25;
                    if (var26 > 0 && var26 < (this.field6058.field2007 - 1)) {
                        int var27 = arg1.method430(var26 + 1, var24) - arg1.method430(var26 - 1, var24);
                        int var28 = arg1.method430(var26, var24 + 1) - arg1.method430(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var27 * var27 + 65536)));
                        this.field6036[var25][var8] = (float) var27 * var29;
                        this.field6042[var25][var8] = var29 * -256.0F;
                        this.field6045[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field6057; var11 <= this.field6046; var11++) {
            if (var11 >= 0 && arg1.field2003 > var11) {
                for (int var21 = this.field6039; var21 <= this.field6050; var21++) {
                    if (var21 >= 0 && var21 < arg1.field2007) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field3516[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field6050 - this.field6039;
            }
        }
        if (var9 > 0) {
            this.field6041 = new class65(var9 * 2);
            this.field6052 = new class67(var9 * 16);
            this.field6054 = new class106(class118.method934(var9, 269173057));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field6057; var14 <= this.field6046; var14++) {
                if (var14 >= 0 && var14 < arg1.field2003) {
                    int var15 = 0;
                    for (int var16 = this.field6039; var16 <= this.field6050; var16++) {
                        if (var16 >= 0 && arg1.field2007 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field3516[var16][var14];
                            int[] var19 = arg1.field3517[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method2492(var18[var20], var19[var20], var12, -26291, var15, var14, var16);
                                    }
                                } else if (var17 == 3) {
                                    this.method2492(0, 0, var12, -26291, var15, var14, var16);
                                    this.method2492(arg1.field2006, 0, var12, -26291, var15, var14, var16);
                                    this.method2492(0, arg1.field2006, var12, -26291, var15, var14, var16);
                                } else if (var17 == 2) {
                                    this.method2492(arg1.field2006, 0, var12, -26291, var15, var14, var16);
                                    this.method2492(arg1.field2006, arg1.field2006, var12, -26291, var15, var14, var16);
                                    this.method2492(0, 0, var12, -26291, var15, var14, var16);
                                } else if (var17 == 5) {
                                    this.method2492(arg1.field2006, arg1.field2006, var12, -26291, var15, var14, var16);
                                    this.method2492(0, arg1.field2006, var12, -26291, var15, var14, var16);
                                    this.method2492(arg1.field2006, 0, var12, -26291, var15, var14, var16);
                                } else if (var17 == 4) {
                                    this.method2492(0, arg1.field2006, var12, -26291, var15, var14, var16);
                                    this.method2492(0, 0, var12, -26291, var15, var14, var16);
                                    this.method2492(arg1.field2006, arg1.field2006, var12, -26291, var15, var14, var16);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field6050 - this.field6039;
                }
                var12++;
            }
            this.field6044 = this.field6048.method2238(125, this.field6041.field827, false, this.field6041.field783, 5123);
            this.field6035 = this.field6048.method2243(0, this.field6052.field827, this.field6052.field783, false, 16);
            this.field6055 = new class473(this.field6035, 5126, 3, 0);
            this.field6053 = new class473(this.field6035, 5121, 4, 12);
        } else {
            this.field6053 = null;
            this.field6035 = null;
            this.field6044 = null;
            this.field6055 = null;
        }
        this.field6054 = null;
        this.field6036 = this.field6042 = this.field6045 = null;
        this.field6041 = null;
        this.field6052 = null;
    }
}
