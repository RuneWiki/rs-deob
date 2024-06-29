import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class522 extends class381 {

    @OriginalMember(owner = "client!op", name = "D", descriptor = "Ltg;")
    private class334 field7324;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "Lvfa;")
    private class436 field7325;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "Luca;")
    private class287 field7310;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    private int field7303;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    private int field7308;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    private int field7314;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    private int field7315;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "[[F")
    private float[][] field7311;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "[[F")
    private float[][] field7307;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "[[F")
    private float[][] field7317;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "I")
    private int field7321;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "Lgv;")
    private class39 field7323;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "Lre;")
    private class290 field7302;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "Lfba;")
    private class558 field7306;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "Lgv;")
    private class39 field7304;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "Lgk;")
    private class540 field7312;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "Lbca;")
    private class449 field7318;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "Lefa;")
    private class322 field7322;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "Liba;")
    public static class211 field7326 = new class211(65, 3);

    @OriginalMember(owner = "client!op", name = "G", descriptor = "Lvg;")
    public static class622 field7327 = new class622(56, 2);

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    private int field7316;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZI[[ZI)V", line = 5)
    public final void method2947(int arg0, boolean arg1, int arg2, boolean[][] arg3, int arg4) {
        field7320++;
        if (this.field7302 == null || (arg0 + arg2) < this.field7303 || this.field7308 < arg0 - arg2) {
            return;
        }
        if (!arg1) {
            this.method2951((short) 20, 36);
        }
        if ((arg2 + arg4) < this.field7314 || (arg4 - arg2) > this.field7315) {
            return;
        }
        for (int var6 = this.field7314; var6 <= this.field7315; var6++) {
            for (int var7 = this.field7303; var7 <= this.field7308; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg4;
                if (var8 > (-arg2) && var8 < arg2 && -arg2 < var9 && arg2 > var9 && arg3[arg2 + var8][arg2 + var9]) {
                    this.field7310.method1759(true, (int) (this.field7324.method2053((byte) 111) * 255.0F) << 24);
                    this.field7310.method1714(null, -1, null, this.field7304, this.field7323);
                    this.field7310.method1702(4, 0, this.field7321, 28498, this.field7302);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lmv;[ILmv;I)V", line = 67)
    public static final void method2948(class295 arg0, int[] arg1, class295 arg2, int arg3) {
        class109.field1625 = arg0;
        if (arg1 != null) {
            class148.field2097 = arg1;
        }
        field7309++;
        class235.field3097 = arg2;
        if (arg3 != -1) {
            field7326 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIII)V", line = 83)
    private final void method2949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7313++;
        long var8 = -1L;
        if (arg1 != 17191) {
            return;
        }
        int var10 = (arg6 << this.field7325.field9623) + arg0;
        int var11 = (arg2 << this.field7325.field9623) + arg4;
        int var12 = this.field7325.method3824(var10, 118, var11);
        if ((arg0 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
            class381 var13 = this.field7322.method2002((byte) -113, var8);
            if (var13 != null) {
                this.method2951(((class263) var13).field3409, arg1 - 17190);
                return;
            }
        }
        short var14 = (short) (this.field7316++);
        if (var8 != -1L) {
            this.field7322.method2001(64, new class263(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg4 == 0) {
            var15 = this.field7317[arg3][arg5];
            var16 = this.field7307[arg3][arg5];
            var17 = this.field7311[arg3][arg5];
        } else if (this.field7325.field9629 == arg0 && arg4 == 0) {
            var17 = this.field7311[arg3 + 1][arg5];
            var16 = this.field7307[arg3 + 1][arg5];
            var15 = this.field7317[arg3 + 1][arg5];
        } else if (this.field7325.field9629 == arg0 && this.field7325.field9629 == arg4) {
            var15 = this.field7317[arg3 + 1][arg5 + 1];
            var17 = this.field7311[arg3 + 1][arg5 + 1];
            var16 = this.field7307[arg3 + 1][arg5 + 1];
        } else if (arg0 == 0 && this.field7325.field9629 == arg4) {
            var15 = this.field7317[arg3][arg5 + 1];
            var17 = this.field7311[arg3][arg5 + 1];
            var16 = this.field7307[arg3][arg5 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field7325.field9629;
            float var19 = (float) arg4 / (float) this.field7325.field9629;
            float var20 = this.field7307[arg3][arg5];
            float var21 = this.field7311[arg3][arg5];
            float var22 = this.field7317[arg3][arg5];
            float var23 = this.field7307[arg3 + 1][arg5];
            float var24 = this.field7311[arg3 + 1][arg5];
            float var25 = (this.field7317[arg3][arg5 + 1] - var22) * var18 + var22;
            float var26 = this.field7317[arg3 + 1][arg5];
            float var27 = (this.field7307[arg3 + 1][arg5 + 1] - var23) * var18 + var23;
            float var28 = (this.field7307[arg3][arg5 + 1] - var20) * var18 + var20;
            float var29 = (this.field7311[arg3 + 1][arg5 + 1] - var24) * var18 + var24;
            float var30 = (this.field7311[arg3][arg5 + 1] - var21) * var18 + var21;
            float var31 = (this.field7317[arg3 + 1][arg5 + 1] - var26) * var18 + var26;
            var17 = (var29 - var30) * var19 + var30;
            var16 = (var27 - var28) * var19 + var28;
            var15 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field7324.method2050((byte) -17) - var10);
        float var33 = (float) (this.field7324.method2045(0) - var12);
        float var34 = (float) (this.field7324.method2046(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field7324.method2051(-520326527);
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
        int var44 = this.field7324.method2049(0);
        int var45 = (int) ((float) ((var44 & 0xFF22CA) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF55) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field7310.field4060) {
            this.field7318.method2651(874114616, (float) var10);
            this.field7318.method2651(arg1 ^ 0x3419AD1F, (float) var12);
            this.field7318.method2651(874114616, (float) var11);
        } else {
            this.field7318.method2650(929234520, (float) var10);
            this.field7318.method2650(929234520, (float) var12);
            this.field7318.method2650(arg1 ^ 0x3762BD7F, (float) var11);
        }
        this.field7318.method3110(var45, arg1 - 17123);
        this.field7318.method3110(var46, 98);
        this.field7318.method3110(var47, 104);
        this.field7318.method3110(255, 101);
        this.method2951(var14, arg1 ^ 0x4326);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZLnc;Z)V", line = 253)
    public static final void method2950(int arg0, boolean arg1, class200 arg2, boolean arg3) {
        if (arg0 != -3223) {
            return;
        }
        field7305++;
        int var4 = arg2.field2716;
        int var5 = (int) arg2.field5740;
        arg2.method2360((byte) 66);
        if (arg3) {
            class233.method1441(var4, (byte) -120);
        }
        class45.method256(arg0 + 3339, var4);
        class5 var6 = class705.method3944(var5, (byte) 108);
        if (var6 != null) {
            class284.method1679(var6, -60);
        }
        class653.method3696(28623);
        if (!arg1 && class567.field8270 != -1) {
            class572.method3283((byte) -124, 1, class567.field8270);
        }
        class194 var7 = new class194(class318.field4623);
        for (class200 var8 = (class200) var7.method1260(arg0 ^ 0xFFFFF31F); var8 != null; var8 = (class200) var7.method1257((byte) -93)) {
            if (!var8.method2359(1578141260)) {
                var8 = (class200) var7.method1260(126);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2721 == 3) {
                int var9 = (int) var8.field5740;
                if (var9 >>> 16 == var4) {
                    method2950(arg0, arg1, var8, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(SI)V", line = 312)
    private final void method2951(short arg0, int arg1) {
        if (this.field7310.field4060) {
            this.field7312.method3162(-2003712696, arg0);
        } else {
            this.field7312.method3120(arg0, -23026);
        }
        field7319++;
        if (arg1 != 1) {
            field7327 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V", line = 332)
    public static void method2952(byte arg0) {
        field7326 = null;
        field7327 = null;
        if (arg0 <= 44) {
            field7327 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Luca;Lvfa;Ltg;[I)V", line = 355)
    public class522(class287 arg0, class436 arg1, class334 arg2, int[] arg3) {
        this.field7324 = arg2;
        this.field7325 = arg1;
        this.field7310 = arg0;
        int var5 = this.field7324.method2051(-520326527) - (arg1.field9629 >> 1);
        this.field7303 = this.field7324.method2050((byte) -27) - var5 >> arg1.field9623;
        this.field7308 = var5 + this.field7324.method2050((byte) -107) >> arg1.field9623;
        this.field7314 = this.field7324.method2046(true) - var5 >> arg1.field9623;
        this.field7315 = this.field7324.method2046(true) + var5 >> arg1.field9623;
        int var6 = this.field7308 + 1 - this.field7303;
        int var7 = this.field7315 + 1 - this.field7314;
        this.field7311 = new float[var6 + 1][var7 + 1];
        this.field7307 = new float[var6 + 1][var7 + 1];
        this.field7317 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field7314 + var8;
            if (var25 > 0 && (this.field7325.field9630 - 1) > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field7303 + var26;
                    if (var27 > 0 && (this.field7325.field9628 - 1) > var27) {
                        int var28 = arg1.method3822(var25, var27 + 1, 0) - arg1.method3822(var25, var27 - 1, 0);
                        int var29 = arg1.method3822(var25 + 1, var27, 0) - arg1.method3822(var25 - 1, var27, 0);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + (var28 * var28 + 65536))));
                        this.field7307[var26][var8] = (float) var28 * var30;
                        this.field7311[var26][var8] = var30 * -256.0F;
                        this.field7317[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field7314; var10 <= this.field7315; var10++) {
            if (var10 >= 0 && arg1.field9630 > var10) {
                for (int var21 = this.field7303; var21 <= this.field7308; var21++) {
                    if (var21 >= 0 && var21 < arg1.field9628) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field6329[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field7321 += 3;
                                    }
                                }
                            } else {
                                this.field7321 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field7308 - this.field7303;
            }
        }
        if (this.field7321 <= 0) {
            this.field7323 = null;
            this.field7302 = null;
            this.field7306 = null;
            this.field7304 = null;
        } else {
            this.field7312 = new class540(this.field7321 * 2);
            this.field7318 = new class449(this.field7321 * 16);
            this.field7322 = new class322(class240.method1478(-28325, this.field7321));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field7314; var13 <= this.field7315; var13++) {
                if (var13 >= 0 && var13 < arg1.field9630) {
                    int var14 = 0;
                    for (int var15 = this.field7303; var15 <= this.field7308; var15++) {
                        if (var15 >= 0 && arg1.field9628 > var15) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field6329[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field6336[var15][var13];
                                    int[] var19 = arg1.field6352[var15][var13];
                                    int var20 = 0;
                                    label112: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label112;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method2949(var18[var20], 17191, var13, var14, var19[var20], var11, var15);
                                                var20++;
                                                this.method2949(var18[var20], 17191, var13, var14, var19[var20], var11, var15);
                                                var20++;
                                                this.method2949(var18[var20], 17191, var13, var14, var19[var20], var11, var15);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method2949(0, 17191, var13, var14, 0, var11, var15);
                                    this.method2949(arg1.field9629, 17191, var13, var14, 0, var11, var15);
                                    this.method2949(0, 17191, var13, var14, arg1.field9629, var11, var15);
                                } else if (var16 == 2) {
                                    this.method2949(arg1.field9629, 17191, var13, var14, 0, var11, var15);
                                    this.method2949(arg1.field9629, 17191, var13, var14, arg1.field9629, var11, var15);
                                    this.method2949(0, 17191, var13, var14, 0, var11, var15);
                                } else if (var16 == 5) {
                                    this.method2949(arg1.field9629, 17191, var13, var14, arg1.field9629, var11, var15);
                                    this.method2949(0, 17191, var13, var14, arg1.field9629, var11, var15);
                                    this.method2949(arg1.field9629, 17191, var13, var14, 0, var11, var15);
                                } else if (var16 == 4) {
                                    this.method2949(0, 17191, var13, var14, arg1.field9629, var11, var15);
                                    this.method2949(0, 17191, var13, var14, 0, var11, var15);
                                    this.method2949(arg1.field9629, 17191, var13, var14, arg1.field9629, var11, var15);
                                }
                            }
                        }
                        var12++;
                        var14++;
                    }
                } else {
                    var12 += this.field7308 - this.field7303;
                }
                var11++;
            }
            this.field7302 = this.field7310.method1719(this.field7312.field7956, false, this.field7312.field7952, 5123, 0);
            this.field7306 = this.field7310.method1753(16, this.field7318.field7952, this.field7318.field7956, false, -11863);
            this.field7323 = new class39(this.field7306, 5126, 3, 0);
            this.field7304 = new class39(this.field7306, 5121, 4, 12);
        }
        this.field7322 = null;
        this.field7307 = this.field7311 = this.field7317 = null;
        this.field7312 = null;
        this.field7318 = null;
    }
}
