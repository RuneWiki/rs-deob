import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class365 extends class529 {

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "Lhk;")
    private class102 field5635;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "Lna;")
    private class211 field5649;

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "Las;")
    private class415 field5653;

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "I")
    private int field5648;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    private int field5642;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    private int field5636;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    private int field5644;

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "[[F")
    private float[][] field5651;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "[[F")
    private float[][] field5640;

    @OriginalMember(owner = "client!tt", name = "H", descriptor = "[[F")
    private float[][] field5655;

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "Lhw;")
    private class208 field5652;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "Lwm;")
    private class302 field5634;

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "Lru;")
    private class177 field5658;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "Ltb;")
    private class347 field5637;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "Lui;")
    private class383 field5645;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "Ldb;")
    private class67 field5646;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "Ldb;")
    private class67 field5647;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "Lbi;")
    public static class104 field5643 = new class104(39, 0);

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "Ljava/lang/String;")
    public static String field5657 = "";

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "Lqu;")
    public static class219 field5656 = new class219(25, -1);

    @OriginalMember(owner = "client!tt", name = "L", descriptor = "Lru;")
    public static class177 field5659 = new class177(64);

    @OriginalMember(owner = "client!tt", name = "M", descriptor = "Z")
    public static volatile boolean field5660 = false;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    private int field5638;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
    private int field5654;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(SI)V")
    private final void method2396(short arg0, int arg1) {
        if (this.field5649.field3560) {
            this.field5652.method1437(arg0, arg1 - 1);
        } else {
            this.field5652.method1467((byte) 23, arg0);
        }
        field5650++;
        if (arg1 != 1) {
            this.field5645 = null;
        }
        this.field5654++;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public static void method2397(int arg0) {
        field5659 = null;
        if (arg0 == 255) {
            field5657 = null;
            field5643 = null;
            field5656 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lmn;Llp;Lmn;Lmn;I)Z")
    public static final boolean method2398(class162 arg0, class53 arg1, class162 arg2, class162 arg3, int arg4) {
        class237.field3886 = arg3;
        field5633++;
        if (arg4 != 27898) {
            method2398(null, null, null, null, -47);
        }
        class453.field7022 = arg1;
        class215.field3652 = arg2;
        class52.field704 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I[[ZIII)V")
    public final void method2399(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        field5641++;
        if (this.field5637 == null || arg2 + arg4 < this.field5648 || (arg2 - arg4) > this.field5642 || (arg0 + arg4) < this.field5636 || this.field5644 < (arg0 - arg4)) {
            return;
        }
        int var6 = -113 / ((arg3 - 3) / 59);
        for (int var7 = this.field5636; var7 <= this.field5644; var7++) {
            for (int var8 = this.field5648; var8 <= this.field5642; var8++) {
                int var9 = var8 - arg2;
                int var10 = var7 - arg0;
                if (-arg4 < var9 && var9 < arg4 && var10 > (-arg4) && var10 < arg4 && arg1[arg4 + var9][var10 + arg4]) {
                    this.field5649.method1550((byte) -122, (int) (this.field5653.method2648(false) * 255.0F) << 24);
                    this.field5649.method1548(this.field5647, this.field5646, null, 32886, null);
                    this.field5649.method1537(this.field5637, 0, 0, this.field5654, 4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIII)V")
    private final void method2400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5639++;
        long var8 = -1L;
        int var10 = (arg4 << this.field5635.field3753) + arg0;
        int var11 = arg1 + (arg3 << this.field5635.field3753);
        int var12 = this.field5635.method692(var10, var11);
        if ((arg0 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class529 var13 = this.field5658.method1122((byte) 59, var8);
            if (var13 != null) {
                this.method2396(((class79) var13).field1183, 1);
                return;
            }
        }
        if (arg6 != -30134) {
            this.field5655 = null;
        }
        short var14 = (short) (this.field5638++);
        if (var8 != -1L) {
            this.field5658.method1127(new class79(var14), (byte) 109, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg1 == 0) {
            var15 = this.field5651[arg2][arg5];
            var16 = this.field5640[arg2][arg5];
            var17 = this.field5655[arg2][arg5];
        } else if (this.field5635.field3754 == arg0 && arg1 == 0) {
            var16 = this.field5640[arg2 + 1][arg5];
            var15 = this.field5651[arg2 + 1][arg5];
            var17 = this.field5655[arg2 + 1][arg5];
        } else if (this.field5635.field3754 == arg0 && this.field5635.field3754 == arg1) {
            var16 = this.field5640[arg2 + 1][arg5 + 1];
            var17 = this.field5655[arg2 + 1][arg5 + 1];
            var15 = this.field5651[arg2 + 1][arg5 + 1];
        } else if (arg0 == 0 && this.field5635.field3754 == arg1) {
            var15 = this.field5651[arg2][arg5 + 1];
            var17 = this.field5655[arg2][arg5 + 1];
            var16 = this.field5640[arg2][arg5 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field5635.field3754;
            float var19 = (float) arg1 / (float) this.field5635.field3754;
            float var20 = this.field5640[arg2][arg5];
            float var21 = this.field5655[arg2][arg5];
            float var22 = this.field5651[arg2][arg5];
            float var23 = this.field5640[arg2 + 1][arg5];
            float var24 = this.field5655[arg2 + 1][arg5];
            float var25 = (this.field5640[arg2 + 1][arg5 + 1] - var23) * var18 + var23;
            float var26 = (this.field5655[arg2 + 1][arg5 + 1] - var24) * var18 + var24;
            float var27 = (this.field5640[arg2][arg5 + 1] - var20) * var18 + var20;
            float var28 = (this.field5655[arg2][arg5 + 1] - var21) * var18 + var21;
            float var29 = this.field5651[arg2 + 1][arg5];
            float var30 = (this.field5651[arg2][arg5 + 1] - var22) * var18 + var22;
            var17 = (var26 - var28) * var19 + var28;
            float var31 = (this.field5651[arg2 + 1][arg5 + 1] - var29) * var18 + var29;
            var16 = (var25 - var27) * var19 + var27;
            var15 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field5653.method2650(127) - var10);
        float var33 = (float) (this.field5653.method2645(arg6 ^ 0xFFFF8A30) - var12);
        float var34 = (float) (this.field5653.method2654(0) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field5653.method2651(-108);
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
        int var44 = this.field5653.method2647(-36);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field5649.field3560) {
            this.field5634.method2030((float) var10, 9);
            this.field5634.method2030((float) var12, 9);
            this.field5634.method2030((float) var11, 9);
        } else {
            this.field5634.method2034((float) var10, false);
            this.field5634.method2034((float) var12, false);
            this.field5634.method2034((float) var11, false);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field5634.method1479((byte) -118, var45);
        this.field5634.method1479((byte) -123, var46);
        this.field5634.method1479((byte) -125, var47);
        this.field5634.method1479((byte) -123, 255);
        this.method2396(var14, 1);
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lna;Lhk;Las;[I)V")
    public class365(class211 arg0, class102 arg1, class415 arg2, int[] arg3) {
        this.field5635 = arg1;
        this.field5649 = arg0;
        this.field5653 = arg2;
        int var5 = this.field5653.method2651(-117) - (arg1.field3754 >> 1);
        this.field5648 = this.field5653.method2650(118) - var5 >> arg1.field3753;
        this.field5642 = var5 + this.field5653.method2650(122) >> arg1.field3753;
        this.field5636 = this.field5653.method2654(0) - var5 >> arg1.field3753;
        this.field5644 = var5 + this.field5653.method2654(0) >> arg1.field3753;
        int var6 = this.field5642 + 1 - this.field5648;
        int var7 = this.field5644 + 1 - this.field5636;
        this.field5651 = new float[var6 + 1][var7 + 1];
        this.field5640 = new float[var6 + 1][var7 + 1];
        this.field5655 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field5636 + var8;
            if (var24 > 0 && var24 < (this.field5635.field3752 - 1)) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = this.field5648 + var25;
                    if (var26 > 0 && this.field5635.field3755 - 1 > var26) {
                        int var27 = arg1.method688(var26 + 1, var24) - arg1.method688(var26 - 1, var24);
                        int var28 = arg1.method688(var26, var24 + 1) - arg1.method688(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + (var27 * var27 + 65536))));
                        this.field5640[var25][var8] = (float) var27 * var29;
                        this.field5655[var25][var8] = var29 * -256.0F;
                        this.field5651[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field5636; var11 <= this.field5644; var11++) {
            if (var11 >= 0 && arg1.field3752 > var11) {
                for (int var21 = this.field5648; var21 <= this.field5642; var21++) {
                    if (var21 >= 0 && arg1.field3755 > var21) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field1466[var21][var11];
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
                var10 += this.field5642 - this.field5648;
            }
        }
        if (var9 > 0) {
            this.field5652 = new class208(var9 * 2);
            this.field5634 = new class302(var9 * 16);
            this.field5658 = new class177(class123.method774(-104, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field5636; var14 <= this.field5644; var14++) {
                if (var14 >= 0 && arg1.field3752 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field5648; var16 <= this.field5642; var16++) {
                        if (var16 >= 0 && var16 < arg1.field3755) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field1466[var16][var14];
                            int[] var19 = arg1.field1464[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method2400(var18[var20], var19[var20], var15, var14, var16, var12, -30134);
                                    }
                                } else if (var17 == 3) {
                                    this.method2400(0, 0, var15, var14, var16, var12, -30134);
                                    this.method2400(arg1.field3754, 0, var15, var14, var16, var12, -30134);
                                    this.method2400(0, arg1.field3754, var15, var14, var16, var12, -30134);
                                } else if (var17 == 2) {
                                    this.method2400(arg1.field3754, 0, var15, var14, var16, var12, -30134);
                                    this.method2400(arg1.field3754, arg1.field3754, var15, var14, var16, var12, -30134);
                                    this.method2400(0, 0, var15, var14, var16, var12, -30134);
                                } else if (var17 == 5) {
                                    this.method2400(arg1.field3754, arg1.field3754, var15, var14, var16, var12, -30134);
                                    this.method2400(0, arg1.field3754, var15, var14, var16, var12, -30134);
                                    this.method2400(arg1.field3754, 0, var15, var14, var16, var12, -30134);
                                } else if (var17 == 4) {
                                    this.method2400(0, arg1.field3754, var15, var14, var16, var12, -30134);
                                    this.method2400(0, 0, var15, var14, var16, var12, -30134);
                                    this.method2400(arg1.field3754, arg1.field3754, var15, var14, var16, var12, -30134);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field5642 - this.field5648;
                }
                var12++;
            }
            this.field5637 = this.field5649.method1514(this.field5652.field3162, 16711680, 5123, false, this.field5652.field3193);
            this.field5645 = this.field5649.method1544(false, 16, this.field5634.field3162, this.field5634.field3193, false);
            this.field5646 = new class67(this.field5645, 5126, 3, 0);
            this.field5647 = new class67(this.field5645, 5121, 4, 12);
        } else {
            this.field5647 = null;
            this.field5645 = null;
            this.field5637 = null;
            this.field5646 = null;
        }
        this.field5640 = this.field5655 = this.field5651 = null;
        this.field5658 = null;
        this.field5634 = null;
        this.field5652 = null;
    }
}
