import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class456 extends class513 {

    @OriginalMember(owner = "client!np", name = "y", descriptor = "Lul;")
    private class530 field6434;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "Lsm;")
    private class257 field6442;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "Lkga;")
    private class506 field6424;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    private int field6420;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    private int field6423;

    @OriginalMember(owner = "client!np", name = "v", descriptor = "I")
    private int field6431;

    @OriginalMember(owner = "client!np", name = "H", descriptor = "I")
    private int field6443;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "[[F")
    private float[][] field6429;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "[[F")
    private float[][] field6425;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "[[F")
    private float[][] field6419;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    private int field6427;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "Lun;")
    private class389 field6440;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "Lkw;")
    private class226 field6428;

    @OriginalMember(owner = "client!np", name = "x", descriptor = "Lwaa;")
    private class652 field6433;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "Luq;")
    private class145 field6432;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "Lew;")
    private class458 field6441;

    @OriginalMember(owner = "client!np", name = "B", descriptor = "Lrba;")
    private class399 field6437;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "Lrba;")
    private class399 field6421;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public static int field6422 = 0;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "[[Z")
    public static boolean[][] field6435 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!np", name = "A", descriptor = "I")
    private int field6436;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!np", name = "I", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(SI)V")
    private final void method2707(short arg0, int arg1) {
        field6438++;
        if (this.field6424.field7353) {
            this.field6440.method2261((byte) 62, arg0);
        } else {
            this.field6440.method2236(arg0, 35);
        }
        if (arg1 > -1) {
            this.method2711(-91, 10, 108, -53, -11, -87, -114);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIZBI)V")
    public static final void method2708(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        if (class375.field5039 == 0) {
            class112.method801((byte) 81, false);
        } else {
            class333.field4436 = class375.field5039;
            class435.method2608(101, 0);
        }
        field6426++;
        class37.field709 = arg2;
        class510.field7457 = arg4;
        class186.field2273 = arg0;
        if (arg3 != -52) {
            method2712(-20, -98);
        }
        class550.method3226(arg1);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "([[ZIIZI)V")
    public final void method2709(boolean[][] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field6430++;
        if (this.field6432 == null || this.field6420 > arg1 + arg2 || (arg2 - arg1) > this.field6423 || this.field6431 > (arg4 + arg1) || this.field6443 < arg4 - arg1 || arg3) {
            return;
        }
        for (int var6 = this.field6431; var6 <= this.field6443; var6++) {
            for (int var7 = this.field6420; var7 <= this.field6423; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg4;
                if (-arg1 < var8 && var8 < arg1 && var9 > (-arg1) && var9 < arg1 && arg0[arg1 + var8][arg1 + var9]) {
                    this.field6424.method2997((int) (this.field6434.method3117(false) * 255.0F) << 24, -123);
                    this.field6424.method2960(null, this.field6437, 0, null, this.field6421);
                    this.field6424.method2984(this.field6427, 0, 4, this.field6432, 512);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method2710(int arg0) {
        field6435 = null;
        int var1 = -78 / ((arg0 + 18) / 39);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIII)V")
    private final void method2711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6444++;
        long var8 = -1L;
        int var10 = arg4 + (arg0 << this.field6442.field696);
        int var11 = arg1 + (arg2 << this.field6442.field696);
        int var12 = this.field6442.method428(true, var10, var11);
        if ((arg4 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class513 var13 = this.field6433.method3678(var8, -125);
            if (var13 != null) {
                this.method2707(((class384) var13).field5118, -10);
                return;
            }
        }
        short var14 = (short) (this.field6436++);
        if (var8 != -1L) {
            this.field6433.method3670(var8, new class384(var14), (byte) 127);
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg1 == 0) {
            var15 = this.field6419[arg5][arg3];
            var16 = this.field6429[arg5][arg3];
            var17 = this.field6425[arg5][arg3];
        } else if (this.field6442.field695 == arg4 && arg1 == 0) {
            var15 = this.field6419[arg5 + 1][arg3];
            var17 = this.field6425[arg5 + 1][arg3];
            var16 = this.field6429[arg5 + 1][arg3];
        } else if (this.field6442.field695 == arg4 && this.field6442.field695 == arg1) {
            var16 = this.field6429[arg5 + 1][arg3 + 1];
            var17 = this.field6425[arg5 + 1][arg3 + 1];
            var15 = this.field6419[arg5 + 1][arg3 + 1];
        } else if (arg4 == 0 && this.field6442.field695 == arg1) {
            var15 = this.field6419[arg5][arg3 + 1];
            var16 = this.field6429[arg5][arg3 + 1];
            var17 = this.field6425[arg5][arg3 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field6442.field695;
            float var19 = (float) arg1 / (float) this.field6442.field695;
            float var20 = this.field6419[arg5][arg3];
            float var21 = this.field6429[arg5][arg3];
            float var22 = this.field6425[arg5][arg3];
            float var23 = this.field6419[arg5 + 1][arg3];
            float var24 = this.field6429[arg5 + 1][arg3];
            float var25 = (this.field6429[arg5 + 1][arg3 + 1] - var24) * var18 + var24;
            float var26 = (this.field6419[arg5][arg3 + 1] - var20) * var18 + var20;
            float var27 = (this.field6419[arg5 + 1][arg3 + 1] - var23) * var18 + var23;
            float var28 = (this.field6429[arg5][arg3 + 1] - var21) * var18 + var21;
            float var29 = this.field6425[arg5 + 1][arg3];
            float var30 = (this.field6425[arg5][arg3 + 1] - var22) * var18 + var22;
            float var31 = (this.field6425[arg5 + 1][arg3 + 1] - var29) * var18 + var29;
            var15 = (var27 - var26) * var19 + var26;
            var16 = (var25 - var28) * var19 + var28;
            var17 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field6434.method3118(34037) - var10);
        float var33 = (float) (this.field6434.method3119(3553) - var12);
        float var34 = (float) (this.field6434.method3115(-30190) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field6434.method3122(-11184);
        float var41 = (float) arg6 - (var40 * var40);
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
        int var44 = this.field6434.method3120(true);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFB2) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field6424.field7353) {
            this.field6428.method1377(134389112, (float) var10);
            this.field6428.method1377(134389112, (float) var12);
            this.field6428.method1377(arg6 + 134389111, (float) var11);
        } else {
            this.field6428.method1376((float) var10, (byte) -87);
            this.field6428.method1376((float) var12, (byte) -95);
            this.field6428.method1376((float) var11, (byte) -92);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field6428.method2281((byte) 58, var45);
        this.field6428.method2281((byte) 58, var46);
        this.field6428.method2281((byte) 58, var47);
        this.field6428.method2281((byte) 58, 255);
        this.method2707(var14, -24);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Z")
    public static final boolean method2712(int arg0, int arg1) {
        field6439++;
        if (arg0 < 37) {
            return true;
        } else {
            return arg1 == 0 || arg1 == 2;
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lkga;Lsm;Lul;[I)V")
    public class456(class506 arg0, class257 arg1, class530 arg2, int[] arg3) {
        this.field6434 = arg2;
        this.field6442 = arg1;
        this.field6424 = arg0;
        int var5 = this.field6434.method3122(-11184) - (arg1.field695 >> 1);
        this.field6420 = this.field6434.method3118(34037) - var5 >> arg1.field696;
        this.field6423 = var5 + this.field6434.method3118(34037) >> arg1.field696;
        this.field6431 = this.field6434.method3115(-30190) - var5 >> arg1.field696;
        this.field6443 = var5 + this.field6434.method3115(-30190) >> arg1.field696;
        int var6 = this.field6423 + 1 - this.field6420;
        int var7 = this.field6443 + 1 - this.field6431;
        this.field6429 = new float[var6 + 1][var7 + 1];
        this.field6425 = new float[var6 + 1][var7 + 1];
        this.field6419 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field6431 + var8;
            if (var25 > 0 && this.field6442.field706 - 1 > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field6420 + var26;
                    if (var27 > 0 && (this.field6442.field702 - 1) > var27) {
                        int var28 = arg1.method437(110, var25, var27 + 1) - arg1.method437(89, var25, var27 - 1);
                        int var29 = arg1.method437(126, var25 + 1, var27) - arg1.method437(125, var25 - 1, var27);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field6419[var26][var8] = (float) var28 * var30;
                        this.field6429[var26][var8] = var30 * -256.0F;
                        this.field6425[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field6431; var10 <= this.field6443; var10++) {
            if (var10 >= 0 && arg1.field706 > var10) {
                for (int var21 = this.field6420; var21 <= this.field6423; var21++) {
                    if (var21 >= 0 && arg1.field702 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field3489[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field6427 += 3;
                                    }
                                }
                            } else {
                                this.field6427 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field6423 - this.field6420;
            }
        }
        if (this.field6427 > 0) {
            this.field6440 = new class389(this.field6427 * 2);
            this.field6428 = new class226(this.field6427 * 16);
            this.field6433 = new class652(class698.method3915(this.field6427, (byte) 93));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field6431; var13 <= this.field6443; var13++) {
                if (var13 >= 0 && arg1.field706 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field6420; var15 <= this.field6423; var15++) {
                        if (var15 >= 0 && var15 < arg1.field702) {
                            int var16 = arg3[var12];
                            int[] var17 = arg1.field3489[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field3505[var15][var13];
                                    int[] var19 = arg1.field3509[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method2711(var15, var19[var20], var13, var11, var18[var20], var14, 1);
                                                var20++;
                                                this.method2711(var15, var19[var20], var13, var11, var18[var20], var14, 1);
                                                var20++;
                                                this.method2711(var15, var19[var20], var13, var11, var18[var20], var14, 1);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method2711(var15, 0, var13, var11, 0, var14, 1);
                                    this.method2711(var15, 0, var13, var11, arg1.field695, var14, 1);
                                    this.method2711(var15, arg1.field695, var13, var11, 0, var14, 1);
                                } else if (var16 == 2) {
                                    this.method2711(var15, 0, var13, var11, arg1.field695, var14, 1);
                                    this.method2711(var15, arg1.field695, var13, var11, arg1.field695, var14, 1);
                                    this.method2711(var15, 0, var13, var11, 0, var14, 1);
                                } else if (var16 == 5) {
                                    this.method2711(var15, arg1.field695, var13, var11, arg1.field695, var14, 1);
                                    this.method2711(var15, arg1.field695, var13, var11, 0, var14, 1);
                                    this.method2711(var15, 0, var13, var11, arg1.field695, var14, 1);
                                } else if (var16 == 4) {
                                    this.method2711(var15, arg1.field695, var13, var11, 0, var14, 1);
                                    this.method2711(var15, 0, var13, var11, 0, var14, 1);
                                    this.method2711(var15, arg1.field695, var13, var11, arg1.field695, var14, 1);
                                }
                            }
                        }
                        var14++;
                        var12++;
                    }
                } else {
                    var12 += this.field6423 - this.field6420;
                }
                var11++;
            }
            this.field6432 = this.field6424.method2980(5123, 1, this.field6440.field5205, false, this.field6440.field5195);
            this.field6441 = this.field6424.method2963(this.field6428.field5205, false, true, 16, this.field6428.field5195);
            this.field6437 = new class399(this.field6441, 5126, 3, 0);
            this.field6421 = new class399(this.field6441, 5121, 4, 12);
        } else {
            this.field6421 = null;
            this.field6437 = null;
            this.field6432 = null;
            this.field6441 = null;
        }
        this.field6433 = null;
        this.field6440 = null;
        this.field6419 = this.field6429 = this.field6425 = null;
        this.field6428 = null;
    }
}
