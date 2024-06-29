import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class592 extends class333 {

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "Leq;")
    private class670 field8353;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "Lmea;")
    private class72 field8350;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "Lvj;")
    private class422 field8355;

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
    private int field8358;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
    private int field8351;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
    private int field8354;

    @OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
    private int field8368;

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "[[F")
    private float[][] field8366;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "[[F")
    private float[][] field8357;

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "[[F")
    private float[][] field8361;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
    private int field8363;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "Lcn;")
    private class21 field8349;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "Lut;")
    private class199 field8352;

    @OriginalMember(owner = "client!mw", name = "D", descriptor = "Lhea;")
    private class351 field8367;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "Lhea;")
    private class351 field8356;

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "Lnp;")
    private class115 field8359;

    @OriginalMember(owner = "client!mw", name = "B", descriptor = "Lnea;")
    private class209 field8365;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "Lwa;")
    private class661 field8348;

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!mw", name = "A", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "I")
    private int field8369;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIIIII)V", line = 4)
    private final void method3331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8362++;
        long var8 = -1L;
        int var10 = arg2 + (arg6 << this.field8350.field3430);
        int var11 = arg4 + (arg5 << this.field8350.field3430);
        int var12 = this.field8350.method1610(var10, 126, var11);
        if ((arg2 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class333 var13 = this.field8348.method3669(var8, -1);
            if (var13 != null) {
                this.method3333(((class331) var13).field4164, 1);
                return;
            }
        }
        short var14 = (short) (this.field8369++);
        if (var8 != -1L) {
            this.field8348.method3671(false, new class331(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg4 == 0) {
            var15 = this.field8366[arg3][arg0];
            var16 = this.field8361[arg3][arg0];
            var17 = this.field8357[arg3][arg0];
        } else if (this.field8350.field3424 == arg2 && arg4 == 0) {
            var15 = this.field8366[arg3 + 1][arg0];
            var17 = this.field8357[arg3 + 1][arg0];
            var16 = this.field8361[arg3 + 1][arg0];
        } else if (this.field8350.field3424 == arg2 && this.field8350.field3424 == arg4) {
            var16 = this.field8361[arg3 + 1][arg0 + 1];
            var17 = this.field8357[arg3 + 1][arg0 + 1];
            var15 = this.field8366[arg3 + 1][arg0 + 1];
        } else if (arg2 == 0 && this.field8350.field3424 == arg4) {
            var17 = this.field8357[arg3][arg0 + 1];
            var16 = this.field8361[arg3][arg0 + 1];
            var15 = this.field8366[arg3][arg0 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field8350.field3424;
            float var19 = (float) arg4 / (float) this.field8350.field3424;
            float var20 = this.field8357[arg3][arg0];
            float var21 = this.field8361[arg3][arg0];
            float var22 = this.field8366[arg3][arg0];
            float var23 = this.field8357[arg3 + 1][arg0];
            float var24 = this.field8361[arg3 + 1][arg0];
            float var25 = (this.field8357[arg3 + 1][arg0 + 1] - var23) * var18 + var23;
            float var26 = (this.field8361[arg3 + 1][arg0 + 1] - var24) * var18 + var24;
            float var27 = (this.field8361[arg3][arg0 + 1] - var21) * var18 + var21;
            float var28 = this.field8366[arg3 + 1][arg0];
            float var29 = (this.field8366[arg3][arg0 + 1] - var22) * var18 + var22;
            float var30 = (this.field8357[arg3][arg0 + 1] - var20) * var18 + var20;
            var16 = (var26 - var27) * var19 + var27;
            var17 = (var25 - var30) * var19 + var30;
            float var31 = (this.field8366[arg3 + 1][arg0 + 1] - var28) * var18 + var28;
            var15 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field8353.method3711(1795643394) - var10);
        float var33 = (float) (this.field8353.method3703((byte) -29) - var12);
        float var34 = (float) (this.field8353.method3706((byte) 119) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        if (arg1 > -60) {
            return;
        }
        float var40 = var35 / (float) this.field8353.method3708((byte) 83);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var39 + var16 * var38 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8353.method3710(false);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFC2) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field8355.field5874) {
            this.field8365.method1242(-12989, (float) var10);
            this.field8365.method1242(-12989, (float) var12);
            this.field8365.method1242(-12989, (float) var11);
        } else {
            this.field8365.method1243(40, (float) var10);
            this.field8365.method1243(79, (float) var12);
            this.field8365.method1243(126, (float) var11);
        }
        this.field8365.method658(var45, (byte) 81);
        this.field8365.method658(var46, (byte) 116);
        this.field8365.method658(var47, (byte) 80);
        this.field8365.method658(255, (byte) 63);
        this.method3333(var14, 1);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IBI[[ZI)V", line = 190)
    public final void method3332(int arg0, byte arg1, int arg2, boolean[][] arg3, int arg4) {
        field8364++;
        if (this.field8349 == null || this.field8358 > (arg2 + arg0) || this.field8351 < arg2 - arg0 || this.field8354 > (arg0 + arg4) || (arg4 - arg0) > this.field8368 || arg1 >= -125) {
            return;
        }
        for (int var6 = this.field8354; var6 <= this.field8368; var6++) {
            for (int var7 = this.field8358; var7 <= this.field8351; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg4;
                if (-arg0 < var8 && var8 < arg0 && var9 > (-arg0) && arg0 > var9 && arg3[arg0 + var8][var9 + arg0]) {
                    this.field8355.method2379(true, (int) (this.field8353.method3704((byte) -94) * 255.0F) << 24);
                    this.field8355.method2419(this.field8356, 77, this.field8367, null, null);
                    this.field8355.method2403(this.field8349, 0, this.field8363, 4, 123);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(SI)V", line = 246)
    private final void method3333(short arg0, int arg1) {
        field8360++;
        if (arg1 != 1) {
            this.field8356 = null;
        }
        if (this.field8355.field5874) {
            this.field8359.method645(-672168216, arg0);
        } else {
            this.field8359.method667(13224, arg0);
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lvj;Lmea;Leq;[I)V", line = 265)
    public class592(class422 arg0, class72 arg1, class670 arg2, int[] arg3) {
        this.field8353 = arg2;
        this.field8350 = arg1;
        this.field8355 = arg0;
        int var5 = this.field8353.method3708((byte) 83) - (arg1.field3424 >> 1);
        this.field8358 = this.field8353.method3711(1795643394) - var5 >> arg1.field3430;
        this.field8351 = var5 + this.field8353.method3711(1795643394) >> arg1.field3430;
        this.field8354 = this.field8353.method3706((byte) -107) - var5 >> arg1.field3430;
        this.field8368 = this.field8353.method3706((byte) -14) + var5 >> arg1.field3430;
        int var6 = this.field8351 + 1 - this.field8358;
        int var7 = this.field8368 + 1 - this.field8354;
        this.field8366 = new float[var6 + 1][var7 + 1];
        this.field8357 = new float[var6 + 1][var7 + 1];
        this.field8361 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field8354 + var8;
            if (var25 > 0 && var25 < this.field8350.field3426 - 1) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field8358 + var26;
                    if (var27 > 0 && var27 < (this.field8350.field3428 - 1)) {
                        int var28 = arg1.method1608(var25, 840, var27 + 1) - arg1.method1608(var25, 840, var27 - 1);
                        int var29 = arg1.method1608(var25 + 1, 840, var27) - arg1.method1608(var25 - 1, 840, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var29 * var29 + 65536)));
                        this.field8357[var26][var8] = (float) var28 * var30;
                        this.field8361[var26][var8] = var30 * -256.0F;
                        this.field8366[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8354; var10 <= this.field8368; var10++) {
            if (var10 >= 0 && var10 < arg1.field3426) {
                for (int var21 = this.field8358; var21 <= this.field8351; var21++) {
                    if (var21 >= 0 && arg1.field3428 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field738[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field8363 += 3;
                                    }
                                }
                            } else {
                                this.field8363 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8351 - this.field8358;
            }
        }
        if (this.field8363 <= 0) {
            this.field8349 = null;
            this.field8352 = null;
            this.field8367 = null;
            this.field8356 = null;
        } else {
            this.field8359 = new class115(this.field8363 * 2);
            this.field8365 = new class209(this.field8363 * 16);
            this.field8348 = new class661(class553.method3138(1781323777, this.field8363));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field8354; var13 <= this.field8368; var13++) {
                if (var13 >= 0 && arg1.field3426 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field8358; var15 <= this.field8351; var15++) {
                        if (var15 >= 0 && var15 < arg1.field3428) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field738[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field714[var15][var13];
                                    int[] var19 = arg1.field732[var15][var13];
                                    int var20 = 0;
                                    label109: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label109;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method3331(var11, -66, var18[var20], var14, var19[var20], var13, var15);
                                                var20++;
                                                this.method3331(var11, -106, var18[var20], var14, var19[var20], var13, var15);
                                                var20++;
                                                this.method3331(var11, -126, var18[var20], var14, var19[var20], var13, var15);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method3331(var11, -119, 0, var14, 0, var13, var15);
                                    this.method3331(var11, -118, arg1.field3424, var14, 0, var13, var15);
                                    this.method3331(var11, -82, 0, var14, arg1.field3424, var13, var15);
                                } else if (var16 == 2) {
                                    this.method3331(var11, -82, arg1.field3424, var14, 0, var13, var15);
                                    this.method3331(var11, -111, arg1.field3424, var14, arg1.field3424, var13, var15);
                                    this.method3331(var11, -82, 0, var14, 0, var13, var15);
                                } else if (var16 == 5) {
                                    this.method3331(var11, -71, arg1.field3424, var14, arg1.field3424, var13, var15);
                                    this.method3331(var11, -104, 0, var14, arg1.field3424, var13, var15);
                                    this.method3331(var11, -126, arg1.field3424, var14, 0, var13, var15);
                                } else if (var16 == 4) {
                                    this.method3331(var11, -61, 0, var14, arg1.field3424, var13, var15);
                                    this.method3331(var11, -91, 0, var14, 0, var13, var15);
                                    this.method3331(var11, -128, arg1.field3424, var14, arg1.field3424, var13, var15);
                                }
                            }
                        }
                        var14++;
                        var12++;
                    }
                } else {
                    var12 += this.field8351 - this.field8358;
                }
                var11++;
            }
            this.field8349 = this.field8355.method2398(this.field8359.field1218, false, this.field8359.field1269, 5123, true);
            this.field8352 = this.field8355.method2438(this.field8365.field1269, 16, (byte) -75, false, this.field8365.field1218);
            this.field8356 = new class351(this.field8352, 5126, 3, 0);
            this.field8367 = new class351(this.field8352, 5121, 4, 12);
        }
        this.field8357 = this.field8361 = this.field8366 = null;
        this.field8365 = null;
        this.field8359 = null;
        this.field8348 = null;
    }
}
