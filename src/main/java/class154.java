import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class154 extends class45 {

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "Lkk;")
    private class371 field2083;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "Lnf;")
    private class256 field2088;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "Lwc;")
    private class367 field2086;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    private int field2091;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    private int field2082;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    private int field2084;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    private int field2092;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "[[F")
    private float[][] field2094;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "[[F")
    private float[][] field2077;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "[[F")
    private float[][] field2079;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "Lko;")
    private class19 field2078;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "Lgm;")
    private class336 field2087;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "Lgm;")
    private class336 field2089;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "Lna;")
    private class50 field2095;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Lnj;")
    private class228 field2090;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "Ljm;")
    private class160 field2093;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Lvk;")
    private class56 field2080;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    private int field2081;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    private int field2085;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(SI)V", line = 14)
    private final void method962(short arg0, int arg1) {
        if (arg1 != -15750) {
            this.field2077 = (float[][]) ((float[][]) null);
        }
        if (this.field2088.field3663) {
            this.field2090.method1326(arg0, arg1 ^ 0x3DB3);
        } else {
            this.field2090.method1359((byte) -114, arg0);
        }
        this.field2085++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIBIIII)V", line = 36)
    private final void method963(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg3 << this.field2083.field5378) + arg1;
        int var11 = (arg0 << this.field2083.field5378) + arg4;
        int var12 = this.field2083.method745(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var11 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class45 var13 = this.field2080.method384(var8, true);
            if (var13 != null) {
                this.method962(((class115) var13).field1608, -15750);
                return;
            }
        }
        short var14 = (short) (this.field2081++);
        if (var8 != -1L) {
            this.field2080.method381(true, new class115(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg4 == 0) {
            var15 = this.field2079[arg5][arg6];
            var16 = this.field2094[arg5][arg6];
            var17 = this.field2077[arg5][arg6];
        } else if (this.field2083.field5380 == arg1 && arg4 == 0) {
            var16 = this.field2094[arg5 + 1][arg6];
            var15 = this.field2079[arg5 + 1][arg6];
            var17 = this.field2077[arg5 + 1][arg6];
        } else if (this.field2083.field5380 == arg1 && this.field2083.field5380 == arg4) {
            var15 = this.field2079[arg5 + 1][arg6 + 1];
            var17 = this.field2077[arg5 + 1][arg6 + 1];
            var16 = this.field2094[arg5 + 1][arg6 + 1];
        } else if (arg1 == 0 && this.field2083.field5380 == arg4) {
            var16 = this.field2094[arg5][arg6 + 1];
            var17 = this.field2077[arg5][arg6 + 1];
            var15 = this.field2079[arg5][arg6 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field2083.field5380;
            float var19 = (float) arg4 / (float) this.field2083.field5380;
            float var20 = this.field2079[arg5][arg6];
            float var21 = this.field2094[arg5][arg6];
            float var22 = this.field2077[arg5][arg6];
            float var23 = this.field2079[arg5 + 1][arg6];
            float var24 = this.field2094[arg5 + 1][arg6];
            float var25 = (this.field2094[arg5 + 1][arg6 + 1] - var24) * var18 + var24;
            float var26 = (this.field2079[arg5 + 1][arg6 + 1] - var23) * var18 + var23;
            float var27 = (this.field2077[arg5][arg6 + 1] - var22) * var18 + var22;
            float var28 = this.field2077[arg5 + 1][arg6];
            float var29 = (this.field2079[arg5][arg6 + 1] - var20) * var18 + var20;
            float var30 = (this.field2094[arg5][arg6 + 1] - var21) * var18 + var21;
            var16 = (var25 - var30) * var19 + var30;
            float var31 = (this.field2077[arg5 + 1][arg6 + 1] - var28) * var18 + var28;
            var15 = (var26 - var29) * var19 + var29;
            var17 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field2086.field5308 - var10);
        float var33 = (float) (this.field2086.field5307 - var12);
        float var34 = (float) (this.field2086.field5310 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field2086.field5303;
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var37 + var16 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        if (arg2 != 93) {
            return;
        }
        int var44 = this.field2086.field5309;
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field2088.field3663) {
            this.field2093.method990(13302, (float) var10);
            this.field2093.method990(arg2 + 13209, (float) var12);
            this.field2093.method990(arg2 ^ 0x33AB, (float) var11);
        } else {
            this.field2093.method991((float) var10, (byte) -57);
            this.field2093.method991((float) var12, (byte) -57);
            this.field2093.method991((float) var11, (byte) -57);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field2093.method1346(var45, 32767);
        this.field2093.method1346(var46, arg2 + 32674);
        this.field2093.method1346(var47, arg2 + 32674);
        this.field2093.method1346(255, 32767);
        this.method962(var14, -15750);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III[[ZB)V", line = 204)
    public final void method964(int arg0, int arg1, int arg2, boolean[][] arg3, byte arg4) {
        if (this.field2078 == null || this.field2091 > (arg0 + arg2) || this.field2082 < arg2 - arg0 || (arg0 + arg1) < this.field2084 || (arg1 - arg0) > this.field2092) {
            return;
        }
        for (int var6 = this.field2084; var6 <= this.field2092; var6++) {
            for (int var7 = this.field2091; var7 <= this.field2082; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg1;
                if (var8 > (-arg0) && var8 < arg0 && var9 > (-arg0) && var9 < arg0 && arg3[arg0 + var8][arg0 + var9]) {
                    this.field2088.method1762((int) (this.field2086.field5299 * 255.0F) << 24);
                    this.field2088.method1718();
                    this.field2088.method1651(this.field2087);
                    this.field2088.method1635(this.field2089);
                    this.field2088.method1668(this.field2078, 4, 0, this.field2085);
                    return;
                }
            }
        }
        if (arg4 > -79) {
            this.field2089 = (class336) null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lnf;Lkk;Lwc;[I)V", line = 260)
    public class154(class256 arg0, class371 arg1, class367 arg2, int[] arg3) {
        this.field2083 = arg1;
        this.field2088 = arg0;
        this.field2086 = arg2;
        int var5 = this.field2086.field5303 - (arg1.field5380 >> 1);
        this.field2091 = this.field2086.field5308 - var5 >> arg1.field5378;
        this.field2082 = this.field2086.field5308 + var5 >> arg1.field5378;
        this.field2084 = this.field2086.field5310 - var5 >> arg1.field5378;
        this.field2092 = this.field2086.field5310 + var5 >> arg1.field5378;
        int var6 = this.field2082 + 1 - this.field2091;
        int var7 = this.field2092 + 1 - this.field2084;
        this.field2094 = new float[var6 + 1][var7 + 1];
        this.field2077 = new float[var6 + 1][var7 + 1];
        this.field2079 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = var8 + this.field2084;
            if (var9 > 0 && var9 < (this.field2083.field5085 - 1)) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = var10 + this.field2091;
                    if (var11 > 0 && (this.field2083.field5084 - 1) > var11) {
                        int var12 = arg1.method742(var11 + 1, var9) - arg1.method742(var11 - 1, var9);
                        int var13 = arg1.method742(var11, var9 + 1) - arg1.method742(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 - (-(var13 * var13) - 65536))));
                        this.field2079[var10][var8] = (float) var12 * var14;
                        this.field2094[var10][var8] = var14 * -256.0F;
                        this.field2077[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field2084; var17 <= this.field2092; var17++) {
            if (var17 >= 0 && arg1.field5085 > var17) {
                for (int var18 = this.field2091; var18 <= this.field2082; var18++) {
                    if (var18 >= 0 && var18 < arg1.field5084) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field5392[var18][var17];
                        if (var20 != null && var19 != 0) {
                            if (var19 == 1) {
                                var15 += var20.length;
                            } else {
                                var15 += 3;
                            }
                        }
                    }
                    var16++;
                }
            } else {
                var16 += this.field2082 - this.field2091;
            }
        }
        if (var15 <= 0) {
            this.field2078 = null;
            this.field2087 = null;
            this.field2089 = null;
            this.field2095 = null;
        } else {
            this.field2090 = new class228(var15 * 2);
            this.field2093 = new class160(var15 * 16);
            this.field2080 = new class56(class139.method896(var15, -79));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field2084; var23 <= this.field2092; var23++) {
                if (var23 >= 0 && var23 < arg1.field5085) {
                    int var24 = 0;
                    for (int var25 = this.field2091; var25 <= this.field2082; var25++) {
                        if (var25 >= 0 && var25 < arg1.field5084) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field5392[var25][var23];
                            int[] var28 = arg1.field5372[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method963(var23, var27[var29], (byte) 93, var25, var28[var29], var24, var22);
                                    }
                                } else if (var26 == 3) {
                                    this.method963(var23, 0, (byte) 93, var25, 0, var24, var22);
                                    this.method963(var23, arg1.field5380, (byte) 93, var25, 0, var24, var22);
                                    this.method963(var23, 0, (byte) 93, var25, arg1.field5380, var24, var22);
                                } else if (var26 == 2) {
                                    this.method963(var23, arg1.field5380, (byte) 93, var25, 0, var24, var22);
                                    this.method963(var23, arg1.field5380, (byte) 93, var25, arg1.field5380, var24, var22);
                                    this.method963(var23, 0, (byte) 93, var25, 0, var24, var22);
                                } else if (var26 == 5) {
                                    this.method963(var23, arg1.field5380, (byte) 93, var25, arg1.field5380, var24, var22);
                                    this.method963(var23, 0, (byte) 93, var25, arg1.field5380, var24, var22);
                                    this.method963(var23, arg1.field5380, (byte) 93, var25, 0, var24, var22);
                                } else if (var26 == 4) {
                                    this.method963(var23, 0, (byte) 93, var25, arg1.field5380, var24, var22);
                                    this.method963(var23, 0, (byte) 93, var25, 0, var24, var22);
                                    this.method963(var23, arg1.field5380, (byte) 93, var25, arg1.field5380, var24, var22);
                                }
                            }
                        }
                        var24++;
                        var21++;
                    }
                } else {
                    var21 += this.field2082 - this.field2091;
                }
                var22++;
            }
            this.field2078 = this.field2088.method1687(5123, this.field2090.field3040, this.field2090.field3029, false);
            this.field2095 = this.field2088.method1733(16, this.field2093.field3040, this.field2093.field3029, false);
            this.field2087 = new class336(this.field2088, this.field2095, 5126, 3, 0);
            this.field2089 = new class336(this.field2088, this.field2095, 5121, 4, 12);
        }
        this.field2080 = null;
        this.field2090 = null;
        this.field2093 = null;
        this.field2079 = this.field2094 = this.field2077 = (float[][]) null;
    }
}
