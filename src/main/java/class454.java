import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class454 extends class65 {

    @OriginalMember(owner = "client!km", name = "n", descriptor = "Lvt;")
    private class759 field6606;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "Lru;")
    private class680 field6605;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "Lrs;")
    private class166 field6608;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    private int field6616;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    private int field6610;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    private int field6611;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    private int field6604;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "[[F")
    private float[][] field6622;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "[[F")
    private float[][] field6617;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "[[F")
    private float[][] field6607;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "I")
    private int field6619;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "Lsda;")
    private class749 field6613;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "Lak;")
    private class497 field6609;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "Lak;")
    private class497 field6612;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "Ljs;")
    private class170 field6625;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "Lofa;")
    private class301 field6626;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "Log;")
    private class547 field6624;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "Lpl;")
    private class616 field6615;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "D")
    public static double field6603;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    private int field6623;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III[[ZZ)V", line = 15)
    public final void method2786(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        field6620++;
        if (this.field6613 == null || arg0 + arg1 < this.field6616 || this.field6610 < arg0 - arg1) {
            return;
        }
        if (arg4) {
            this.field6616 = 119;
        }
        if (this.field6611 > arg1 + arg2 || this.field6604 < arg2 - arg1) {
            return;
        }
        for (int var6 = this.field6611; var6 <= this.field6604; var6++) {
            for (int var7 = this.field6616; var7 <= this.field6610; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg2;
                if ((-arg1) < var8 && arg1 > var8 && var9 > (-arg1) && var9 < arg1 && arg3[var8 + arg1][var9 + arg1]) {
                    this.field6608.method1259((int) (this.field6606.method4226(5) * 255.0F) << 24, -18335);
                    this.field6608.method1329(null, this.field6609, null, this.field6612, 36);
                    this.field6608.method1315(0, true, 4, this.field6619, this.field6613);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIII)V", line = 72)
    private final void method2787(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6618++;
        long var8 = -1L;
        int var10 = arg4 + (arg0 << this.field6605.field4962);
        int var11 = (arg6 << this.field6605.field4962) + arg2;
        int var12 = this.field6605.method2162(var11, arg5 ^ 0xFFFFFFFE, var10);
        if (~(arg4 & 0x7F) == arg5 || (arg2 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class65 var13 = this.field6615.method3512(true, var8);
            if (var13 != null) {
                this.method2788(((class486) var13).field7028, true);
                return;
            }
        }
        short var14 = (short) (this.field6623++);
        if (var8 != -1L) {
            this.field6615.method3516(255, var8, new class486(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg2 == 0) {
            var15 = this.field6622[arg1][arg3];
            var16 = this.field6607[arg1][arg3];
            var17 = this.field6617[arg1][arg3];
        } else if (this.field6605.field4958 == arg4 && arg2 == 0) {
            var15 = this.field6622[arg1 + 1][arg3];
            var17 = this.field6617[arg1 + 1][arg3];
            var16 = this.field6607[arg1 + 1][arg3];
        } else if (this.field6605.field4958 == arg4 && this.field6605.field4958 == arg2) {
            var16 = this.field6607[arg1 + 1][arg3 + 1];
            var17 = this.field6617[arg1 + 1][arg3 + 1];
            var15 = this.field6622[arg1 + 1][arg3 + 1];
        } else if (arg4 == 0 && this.field6605.field4958 == arg2) {
            var17 = this.field6617[arg1][arg3 + 1];
            var15 = this.field6622[arg1][arg3 + 1];
            var16 = this.field6607[arg1][arg3 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field6605.field4958;
            float var19 = (float) arg2 / (float) this.field6605.field4958;
            float var20 = this.field6607[arg1][arg3];
            float var21 = this.field6622[arg1][arg3];
            float var22 = this.field6617[arg1][arg3];
            float var23 = this.field6607[arg1 + 1][arg3];
            float var24 = this.field6622[arg1 + 1][arg3];
            float var25 = (this.field6617[arg1][arg3 + 1] - var22) * var18 + var22;
            float var26 = (this.field6607[arg1][arg3 + 1] - var20) * var18 + var20;
            float var27 = (this.field6622[arg1][arg3 + 1] - var21) * var18 + var21;
            float var28 = (this.field6622[arg1 + 1][arg3 + 1] - var24) * var18 + var24;
            float var29 = (this.field6607[arg1 + 1][arg3 + 1] - var23) * var18 + var23;
            float var30 = this.field6617[arg1 + 1][arg3];
            var16 = (var29 - var26) * var19 + var26;
            var15 = (var28 - var27) * var19 + var27;
            float var31 = (this.field6617[arg1 + 1][arg3 + 1] - var30) * var18 + var30;
            var17 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field6606.method4228(-113) - var10);
        float var33 = (float) (this.field6606.method4221((byte) -7) - var12);
        float var34 = (float) (this.field6606.method4223((byte) -24) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field6606.method4224((byte) 127);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var38 + var16 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field6606.method4227(false);
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
        if (this.field6608.field2796) {
            this.field6624.method3200((float) var10, 238551736);
            this.field6624.method3200((float) var12, arg5 + 238551737);
            this.field6624.method3200((float) var11, 238551736);
        } else {
            this.field6624.method3201(-1581865480, (float) var10);
            this.field6624.method3201(-1581865480, (float) var12);
            this.field6624.method3201(-1581865480, (float) var11);
        }
        this.field6624.method1926(var45, 65280);
        this.field6624.method1926(var46, 65280);
        this.field6624.method1926(var47, 65280);
        this.field6624.method1926(255, 65280);
        this.method2788(var14, true);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(SZ)V", line = 235)
    private final void method2788(short arg0, boolean arg1) {
        if (!arg1) {
            this.field6609 = null;
        }
        if (this.field6608.field2796) {
            this.field6626.method1939(arg0, 1134947720);
        } else {
            this.field6626.method1969(arg0, (byte) -100);
        }
        field6621++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)I", line = 261)
    public static final int method2789(int arg0, int arg1, int arg2, int arg3) {
        field6614++;
        if (arg2 != 13127) {
            method2789(122, -63, -86, 101);
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 4095 - arg1;
        } else {
            return 4095 - arg0;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lrs;Lru;Lvt;[I)V", line = 284)
    public class454(class166 arg0, class680 arg1, class759 arg2, int[] arg3) {
        this.field6606 = arg2;
        this.field6605 = arg1;
        this.field6608 = arg0;
        int var5 = this.field6606.method4224((byte) 127) - (arg1.field4958 >> 1);
        this.field6616 = this.field6606.method4228(-104) - var5 >> arg1.field4962;
        this.field6610 = this.field6606.method4228(-107) + var5 >> arg1.field4962;
        this.field6611 = this.field6606.method4223((byte) -37) - var5 >> arg1.field4962;
        this.field6604 = var5 + this.field6606.method4223((byte) -97) >> arg1.field4962;
        int var6 = this.field6610 + 1 - this.field6616;
        int var7 = this.field6604 + 1 - this.field6611;
        this.field6622 = new float[var6 + 1][var7 + 1];
        this.field6617 = new float[var6 + 1][var7 + 1];
        this.field6607 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field6611 + var8;
            if (var25 > 0 && var25 < this.field6605.field4960 - 1) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field6616 + var26;
                    if (var27 > 0 && this.field6605.field4956 - 1 > var27) {
                        int var28 = arg1.method2160(-73, var25, var27 + 1) - arg1.method2160(-71, var25, var27 - 1);
                        int var29 = arg1.method2160(-127, var25 + 1, var27) - arg1.method2160(-76, var25 - 1, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field6607[var26][var8] = (float) var28 * var30;
                        this.field6622[var26][var8] = var30 * -256.0F;
                        this.field6617[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field6611; var10 <= this.field6604; var10++) {
            if (var10 >= 0 && var10 < arg1.field4960) {
                for (int var21 = this.field6616; var21 <= this.field6610; var21++) {
                    if (var21 >= 0 && var21 < arg1.field4956) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field9581[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field6619 += 3;
                                    }
                                }
                            } else {
                                this.field6619 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field6610 - this.field6616;
            }
        }
        if (this.field6619 <= 0) {
            this.field6613 = null;
            this.field6609 = null;
            this.field6612 = null;
            this.field6625 = null;
        } else {
            this.field6626 = new class301(this.field6619 * 2);
            this.field6624 = new class547(this.field6619 * 16);
            this.field6615 = new class616(class567.method3292(this.field6619, -84));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field6611; var13 <= this.field6604; var13++) {
                if (var13 >= 0 && var13 < arg1.field4960) {
                    int var14 = 0;
                    for (int var15 = this.field6616; var15 <= this.field6610; var15++) {
                        if (var15 >= 0 && arg1.field4956 > var15) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field9581[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field9604[var15][var13];
                                    int[] var19 = arg1.field9583[var15][var13];
                                    int var20 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label111;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method2787(var15, var14, var19[var20], var11, var18[var20], -1, var13);
                                                var20++;
                                                this.method2787(var15, var14, var19[var20], var11, var18[var20], -1, var13);
                                                var20++;
                                                this.method2787(var15, var14, var19[var20], var11, var18[var20], -1, var13);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method2787(var15, var14, 0, var11, 0, -1, var13);
                                    this.method2787(var15, var14, 0, var11, arg1.field4958, -1, var13);
                                    this.method2787(var15, var14, arg1.field4958, var11, 0, -1, var13);
                                } else if (var16 == 2) {
                                    this.method2787(var15, var14, 0, var11, arg1.field4958, -1, var13);
                                    this.method2787(var15, var14, arg1.field4958, var11, arg1.field4958, -1, var13);
                                    this.method2787(var15, var14, 0, var11, 0, -1, var13);
                                } else if (var16 == 5) {
                                    this.method2787(var15, var14, arg1.field4958, var11, arg1.field4958, -1, var13);
                                    this.method2787(var15, var14, arg1.field4958, var11, 0, -1, var13);
                                    this.method2787(var15, var14, 0, var11, arg1.field4958, -1, var13);
                                } else if (var16 == 4) {
                                    this.method2787(var15, var14, arg1.field4958, var11, 0, -1, var13);
                                    this.method2787(var15, var14, 0, var11, 0, -1, var13);
                                    this.method2787(var15, var14, arg1.field4958, var11, arg1.field4958, -1, var13);
                                }
                            }
                        }
                        var12++;
                        var14++;
                    }
                } else {
                    var12 += this.field6610 - this.field6616;
                }
                var11++;
            }
            this.field6613 = this.field6608.method1302(this.field6626.field4543, (byte) -14, false, 5123, this.field6626.field4534);
            this.field6625 = this.field6608.method1255(516, false, this.field6624.field4534, this.field6624.field4543, 16);
            this.field6612 = new class497(this.field6625, 5126, 3, 0);
            this.field6609 = new class497(this.field6625, 5121, 4, 12);
        }
        this.field6624 = null;
        this.field6626 = null;
        this.field6607 = this.field6622 = this.field6617 = null;
        this.field6615 = null;
    }
}
