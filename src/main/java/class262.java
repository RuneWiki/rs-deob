import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class262 extends class35 {

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "Luc;")
    private class59 field3954;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "Lge;")
    private class104 field3946;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "Lwh;")
    private class312 field3939;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    private int field3942;

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
    private int field3950;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    private int field3940;

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
    private int field3953;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "[[F")
    private float[][] field3944;

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "[[F")
    private float[][] field3952;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "[[F")
    private float[][] field3937;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "Lec;")
    private class37 field3941;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "Loi;")
    private class118 field3945;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "Ljj;")
    private class156 field3947;

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "Lgp;")
    private class259 field3951;

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "Luq;")
    private class233 field3948;

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "Ljm;")
    private class160 field3943;

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "Ljm;")
    private class160 field3949;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    private int field3936;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    private int field3938;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(SZ)V", line = 5)
    private final void method1879(short arg0, boolean arg1) {
        if (this.field3946.field1727) {
            this.field3941.method324(arg0, -41);
        } else {
            this.field3941.method301((byte) 119, arg0);
        }
        if (!arg1) {
            this.method1879((short) 70, true);
        }
        this.field3938++;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[[ZZ)V", line = 26)
    public final void method1880(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field3951 == null) {
            return;
        }
        if (arg4) {
            this.method1880(13, 28, -106, (boolean[][]) ((boolean[][]) null), false);
        }
        if (this.field3942 > (arg0 + arg2) || this.field3950 < arg2 - arg0 || arg1 + arg0 < this.field3940 || arg1 - arg0 > this.field3953) {
            return;
        }
        for (int var6 = this.field3940; var6 <= this.field3953; var6++) {
            for (int var7 = this.field3942; var7 <= this.field3950; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg1;
                if (-arg0 < var8 && var8 < arg0 && var9 > (-arg0) && var9 < arg0 && arg3[arg0 + var8][arg0 + var9]) {
                    this.field3946.method863((int) (this.field3954.field941 * 255.0F) << 24);
                    this.field3946.method902(this.field3943);
                    this.field3946.method854(this.field3949);
                    this.field3946.method876();
                    this.field3946.method878(this.field3951, 4, 0, this.field3938);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lge;Lwh;Luc;[I)V", line = 93)
    public class262(class104 arg0, class312 arg1, class59 arg2, int[] arg3) {
        this.field3954 = arg2;
        this.field3946 = arg0;
        this.field3939 = arg1;
        int var5 = this.field3954.field943 - (arg1.field4549 >> 1);
        this.field3942 = this.field3954.field942 - var5 >> arg1.field4553;
        this.field3950 = this.field3954.field942 + var5 >> arg1.field4553;
        this.field3940 = this.field3954.field945 - var5 >> arg1.field4553;
        this.field3953 = this.field3954.field945 + var5 >> arg1.field4553;
        int var6 = this.field3950 + 1 - this.field3942;
        int var7 = this.field3953 + 1 - this.field3940;
        this.field3944 = new float[var6 + 1][var7 + 1];
        this.field3952 = new float[var6 + 1][var7 + 1];
        this.field3937 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field3940 + var8;
            if (var9 > 0 && (this.field3939.field2045 - 1) > var9) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field3942 + var10;
                    if (var11 > 0 && this.field3939.field2037 - 1 > var11) {
                        int var12 = arg1.method794(var11 + 1, var9) - arg1.method794(var11 - 1, var9);
                        int var13 = arg1.method794(var11, var9 + 1) - arg1.method794(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + (var12 * var12 + 65536))));
                        this.field3944[var10][var8] = (float) var12 * var14;
                        this.field3952[var10][var8] = var14 * -256.0F;
                        this.field3937[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field3940; var17 <= this.field3953; var17++) {
            if (var17 >= 0 && arg1.field2045 > var17) {
                for (int var18 = this.field3942; var18 <= this.field3950; var18++) {
                    if (var18 >= 0 && var18 < arg1.field2037) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field4556[var18][var17];
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
                var16 += this.field3950 - this.field3942;
            }
        }
        if (var15 > 0) {
            this.field3941 = new class37(var15 * 2);
            this.field3945 = new class118(var15 * 16);
            this.field3947 = new class156(class202.method1526(var15, -2092404400));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field3940; var23 <= this.field3953; var23++) {
                if (var23 >= 0 && var23 < arg1.field2045) {
                    int var24 = 0;
                    for (int var25 = this.field3942; var25 <= this.field3950; var25++) {
                        if (var25 >= 0 && var25 < arg1.field2037) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field4556[var25][var23];
                            int[] var28 = arg1.field4542[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method1881(var24, var27[var29], var28[var29], -65, var22, var23, var25);
                                    }
                                } else if (var26 == 3) {
                                    this.method1881(var24, 0, 0, 61, var22, var23, var25);
                                    this.method1881(var24, arg1.field4549, 0, -62, var22, var23, var25);
                                    this.method1881(var24, 0, arg1.field4549, 124, var22, var23, var25);
                                } else if (var26 == 2) {
                                    this.method1881(var24, arg1.field4549, 0, 16, var22, var23, var25);
                                    this.method1881(var24, arg1.field4549, arg1.field4549, 122, var22, var23, var25);
                                    this.method1881(var24, 0, 0, -110, var22, var23, var25);
                                } else if (var26 == 5) {
                                    this.method1881(var24, arg1.field4549, arg1.field4549, -120, var22, var23, var25);
                                    this.method1881(var24, 0, arg1.field4549, 112, var22, var23, var25);
                                    this.method1881(var24, arg1.field4549, 0, -122, var22, var23, var25);
                                } else if (var26 == 4) {
                                    this.method1881(var24, 0, arg1.field4549, 43, var22, var23, var25);
                                    this.method1881(var24, 0, 0, -102, var22, var23, var25);
                                    this.method1881(var24, arg1.field4549, arg1.field4549, -82, var22, var23, var25);
                                }
                            }
                        }
                        var24++;
                        var21++;
                    }
                } else {
                    var21 += this.field3950 - this.field3942;
                }
                var22++;
            }
            this.field3951 = this.field3946.method875(5123, this.field3941.field578, this.field3941.field565, false);
            this.field3948 = this.field3946.method895(16, this.field3945.field578, this.field3945.field565, false);
            this.field3943 = new class160(this.field3946, this.field3948, 5126, 3, 0);
            this.field3949 = new class160(this.field3946, this.field3948, 5121, 4, 12);
        } else {
            this.field3948 = null;
            this.field3949 = null;
            this.field3943 = null;
            this.field3951 = null;
        }
        this.field3945 = null;
        this.field3944 = this.field3952 = this.field3937 = (float[][]) null;
        this.field3941 = null;
        this.field3947 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIII)V", line = 311)
    private final void method1881(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = arg1 + (arg6 << this.field3939.field4553);
        int var11 = arg2 + (arg5 << this.field3939.field4553);
        int var12 = this.field3939.method809(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class35 var13 = this.field3947.method1219(var8, -90);
            if (var13 != null) {
                this.method1879(((class13) var13).field212, true);
                return;
            }
        }
        short var14 = (short) (this.field3936++);
        if (var8 != -1L) {
            this.field3947.method1217(1, var8, new class13(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg2 == 0) {
            var15 = this.field3937[arg0][arg4];
            var16 = this.field3952[arg0][arg4];
            var17 = this.field3944[arg0][arg4];
        } else if (this.field3939.field4549 == arg1 && arg2 == 0) {
            var16 = this.field3952[arg0 + 1][arg4];
            var15 = this.field3937[arg0 + 1][arg4];
            var17 = this.field3944[arg0 + 1][arg4];
        } else if (this.field3939.field4549 == arg1 && this.field3939.field4549 == arg2) {
            var15 = this.field3937[arg0 + 1][arg4 + 1];
            var17 = this.field3944[arg0 + 1][arg4 + 1];
            var16 = this.field3952[arg0 + 1][arg4 + 1];
        } else if (arg1 == 0 && this.field3939.field4549 == arg2) {
            var16 = this.field3952[arg0][arg4 + 1];
            var17 = this.field3944[arg0][arg4 + 1];
            var15 = this.field3937[arg0][arg4 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field3939.field4549;
            float var19 = (float) arg2 / (float) this.field3939.field4549;
            float var20 = this.field3944[arg0][arg4];
            float var21 = this.field3952[arg0][arg4];
            float var22 = this.field3937[arg0][arg4];
            float var23 = this.field3944[arg0 + 1][arg4];
            float var24 = this.field3952[arg0 + 1][arg4];
            float var25 = (this.field3944[arg0 + 1][arg4 + 1] - var23) * var18 + var23;
            float var26 = (this.field3952[arg0 + 1][arg4 + 1] - var24) * var18 + var24;
            float var27 = (this.field3944[arg0][arg4 + 1] - var20) * var18 + var20;
            float var28 = this.field3937[arg0 + 1][arg4];
            float var29 = (this.field3937[arg0][arg4 + 1] - var22) * var18 + var22;
            float var30 = (this.field3952[arg0][arg4 + 1] - var21) * var18 + var21;
            var16 = (var26 - var30) * var19 + var30;
            float var31 = (this.field3937[arg0 + 1][arg4 + 1] - var28) * var18 + var28;
            var17 = (var25 - var27) * var19 + var27;
            var15 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field3954.field942 - var10);
        float var33 = (float) (this.field3954.field944 - var12);
        float var34 = (float) (this.field3954.field945 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field3954.field943;
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var38 + var16 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3954.field948;
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field3946.field1727) {
            this.field3945.method997((byte) -75, (float) var10);
            this.field3945.method997((byte) -75, (float) var12);
            this.field3945.method997((byte) -75, (float) var11);
        } else {
            this.field3945.method998((byte) 84, (float) var10);
            this.field3945.method998((byte) 93, (float) var12);
            this.field3945.method998((byte) -66, (float) var11);
        }
        this.field3945.method267(var45, false);
        this.field3945.method267(var46, false);
        this.field3945.method267(var47, false);
        this.field3945.method267(255, false);
        int var48 = 99 / ((-arg3 - 25) / 37);
        this.method1879(var14, true);
    }
}
