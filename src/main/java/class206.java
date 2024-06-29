import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class206 extends class289 {

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    private int field3510 = 0;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    private int field3507 = 0;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public int field3511 = 0;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "Z")
    public boolean field3526 = false;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "B")
    private byte field3519 = 0;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "B")
    private byte field3529 = 0;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "[I")
    private int[] field3523;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "[I")
    public int[] field3532;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "[I")
    public int[] field3508;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "[I")
    public int[] field3515;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "[I")
    private int[] field3504;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "[S")
    private short[] field3516;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "[S")
    private short[] field3530;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "[S")
    private short[] field3517;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "[S")
    private short[] field3531;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "[F")
    private float[] field3525;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "[F")
    private float[] field3518;

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "[S")
    private short[] field3538;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "[B")
    private byte[] field3513;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "[S")
    private short[] field3506;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "[S")
    private short[] field3520;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "[S")
    private short[] field3500;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "[S")
    private short[] field3524;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[B")
    private byte[] field3509;

    @OriginalMember(owner = "client!h", name = "db", descriptor = "Luf;")
    public class21 field3537;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "Llh;")
    public class22 field3512;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "Llh;")
    private class22 field3527;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Llh;")
    private class22 field3503;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Llh;")
    private class22 field3501;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "Llh;")
    private class22 field3533;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "S")
    private short field3534;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "S")
    private short field3502;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "[S")
    private short[] field3499;

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "[I")
    private int[] field3536;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Lfe;")
    private static class229 field3514 = new class229(10000);

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "Lh;")
    private static class206 field3539 = new class206();

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "Lh;")
    private static class206 field3541 = new class206();

    @OriginalMember(owner = "client!h", name = "ib", descriptor = "Lh;")
    private static class206 field3542 = new class206();

    @OriginalMember(owner = "client!h", name = "jb", descriptor = "Lh;")
    private static class206 field3543 = new class206();

    @OriginalMember(owner = "client!h", name = "nb", descriptor = "[I")
    private static int[] field3547 = new int[1];

    @OriginalMember(owner = "client!h", name = "kb", descriptor = "[I")
    private static int[] field3544 = new int[1];

    @OriginalMember(owner = "client!h", name = "mb", descriptor = "F")
    private static float field3546;

    @OriginalMember(owner = "client!h", name = "ob", descriptor = "F")
    private static float field3548;

    @OriginalMember(owner = "client!h", name = "pb", descriptor = "F")
    private static float field3549;

    @OriginalMember(owner = "client!h", name = "qb", descriptor = "F")
    private static float field3550;

    @OriginalMember(owner = "client!h", name = "rb", descriptor = "F")
    private static float field3551;

    @OriginalMember(owner = "client!h", name = "sb", descriptor = "F")
    private static float field3552;

    @OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
    private static int field3545;

    @OriginalMember(owner = "client!h", name = "tb", descriptor = "I")
    private static int field3553;

    @OriginalMember(owner = "client!h", name = "ub", descriptor = "I")
    private static int field3554;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Ln;")
    private class268 field3522;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "Lhj;")
    private class28 field3521;

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3540;

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "[J")
    private static long[] field3535;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[[I")
    private int[][] field3505;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "[[I")
    private int[][] field3528;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILh;[[I[[IIII)V", line = 5)
    public final void method1321(int arg0, int arg1, class206 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field3537.field324) {
            arg2.method1338();
        }
        int var9 = arg2.field3537.field323 + arg5;
        int var10 = arg2.field3537.field329 + arg5;
        int var11 = arg2.field3537.field327 + arg7;
        int var12 = arg2.field3537.field325 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field3511; var17++) {
                int var18 = this.field3532[var17] + arg5;
                int var19 = this.field3515[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field3508[var17] = this.field3508[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field3537.field326;
            for (int var28 = 0; var28 < this.field3511; var28++) {
                int var29 = (this.field3508[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field3532[var28] + arg5;
                    int var31 = this.field3515[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field3508[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1976(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field3537.field330 - arg2.field3537.field326;
            for (int var42 = 0; var42 < this.field3511; var42++) {
                int var43 = this.field3532[var42] + arg5;
                int var44 = this.field3515[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field3508[var42] = var51 + this.field3508[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field3537.field330 - arg2.field3537.field326;
            for (int var53 = 0; var53 < this.field3511; var53++) {
                int var54 = this.field3532[var53] + arg5;
                int var55 = this.field3515[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field3508[var53] = ((this.field3508[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field3512.field340 = false;
        this.field3537.field324 = false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[IIIIZ)V", line = 204)
    private final void method1322(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field3554 = 0;
            field3545 = 0;
            field3553 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field3528.length) {
                    int[] var14 = this.field3528[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field3554 += this.field3532[var16];
                        field3545 += this.field3508[var16];
                        field3553 += this.field3515[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field3554 = field3554 / var11 + var8;
                field3545 = field3545 / var11 + var9;
                field3553 = field3553 / var11 + var10;
            } else {
                field3554 = var8;
                field3545 = var9;
                field3553 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field3528.length) {
                    int[] var22 = this.field3528[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field3532[var24] += var17;
                        this.field3508[var24] += var18;
                        this.field3515[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3528.length) {
                    int[] var27 = this.field3528[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field3532[var29] -= field3554;
                        this.field3508[var29] -= field3545;
                        this.field3515[var29] -= field3553;
                        if (arg4 != 0) {
                            int var30 = class139.field2309[arg4];
                            int var31 = class139.field2316[arg4];
                            int var32 = this.field3532[var29] * var31 + this.field3508[var29] * var30 + 32767 >> 16;
                            this.field3508[var29] = this.field3508[var29] * var31 + 32767 - this.field3532[var29] * var30 >> 16;
                            this.field3532[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class139.field2309[arg2];
                            int var34 = class139.field2316[arg2];
                            int var35 = this.field3508[var29] * var34 + 32767 - this.field3515[var29] * var33 >> 16;
                            this.field3515[var29] = this.field3515[var29] * var34 + this.field3508[var29] * var33 + 32767 >> 16;
                            this.field3508[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class139.field2309[arg3];
                            int var37 = class139.field2316[arg3];
                            int var38 = this.field3532[var29] * var37 + this.field3515[var29] * var36 + 32767 >> 16;
                            this.field3515[var29] = this.field3515[var29] * var37 + 32767 - this.field3532[var29] * var36 >> 16;
                            this.field3532[var29] = var38;
                        }
                        this.field3532[var29] += field3554;
                        this.field3508[var29] += field3545;
                        this.field3515[var29] += field3553;
                    }
                }
            }
            if (arg5 && this.field3516 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field3528.length) {
                        int[] var41 = this.field3528[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field3523[var43];
                            int var45 = this.field3523[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field3499[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class139.field2309[arg4];
                                    int var49 = class139.field2316[arg4];
                                    int var50 = this.field3530[var47] * var48 + this.field3516[var47] * var49 + 32767 >> 16;
                                    this.field3530[var47] = (short) (this.field3530[var47] * var49 + 32767 - this.field3516[var47] * var48 >> 16);
                                    this.field3516[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class139.field2309[arg2];
                                    int var52 = class139.field2316[arg2];
                                    int var53 = this.field3530[var47] * var52 + 32767 - this.field3517[var47] * var51 >> 16;
                                    this.field3517[var47] = (short) (this.field3530[var47] * var51 + this.field3517[var47] * var52 + 32767 >> 16);
                                    this.field3530[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class139.field2309[arg3];
                                    int var55 = class139.field2316[arg3];
                                    int var56 = this.field3517[var47] * var54 + this.field3516[var47] * var55 + 32767 >> 16;
                                    this.field3517[var47] = (short) (this.field3517[var47] * var55 + 32767 - this.field3516[var47] * var54 >> 16);
                                    this.field3516[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field3503 != null) {
                    this.field3503.field340 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field3528.length) {
                    int[] var59 = this.field3528[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field3532[var61] -= field3554;
                        this.field3508[var61] -= field3545;
                        this.field3515[var61] -= field3553;
                        this.field3532[var61] = this.field3532[var61] * arg2 >> 7;
                        this.field3508[var61] = this.field3508[var61] * arg3 >> 7;
                        this.field3515[var61] = this.field3515[var61] * arg4 >> 7;
                        this.field3532[var61] += field3554;
                        this.field3508[var61] += field3545;
                        this.field3515[var61] += field3553;
                    }
                }
            }
        } else if (arg0 == 5 && this.field3505 != null && this.field3513 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field3505.length) {
                    int[] var64 = this.field3505[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field3513[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field3513[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field3527.field340 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lgf;IIIZ)V", line = 548)
    public final void method43(class7 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class206 var6 = (class206) arg0;
        if (this.field3510 == 0 || var6.field3510 == 0) {
            return;
        }
        int var7 = var6.field3511;
        int[] var8 = var6.field3532;
        int[] var9 = var6.field3508;
        int[] var10 = var6.field3515;
        short[] var11 = var6.field3516;
        short[] var12 = var6.field3530;
        short[] var13 = var6.field3517;
        short[] var14 = var6.field3531;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3521 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field3521.field431;
            var16 = this.field3521.field433;
            var17 = this.field3521.field434;
            var18 = this.field3521.field432;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3521 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field3521.field431;
            var20 = var6.field3521.field433;
            var21 = var6.field3521.field434;
            var22 = var6.field3521.field432;
        }
        int[] var23 = var6.field3523;
        short[] var24 = var6.field3499;
        if (!var6.field3537.field324) {
            var6.method1338();
        }
        short var25 = var6.field3537.field326;
        short var26 = var6.field3537.field330;
        short var27 = var6.field3537.field323;
        short var28 = var6.field3537.field329;
        short var29 = var6.field3537.field327;
        short var30 = var6.field3537.field325;
        for (int var31 = 0; var31 < this.field3511; var31++) {
            int var32 = this.field3508[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3532[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3515[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3523[var31];
                        int var37 = this.field3523[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3499[var38] - 1;
                            if (var35 == -1 || this.field3531[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field3521 = new class28();
                                            var15 = this.field3521.field431 = class58.method378(this.field3516, 127);
                                            var16 = this.field3521.field433 = class58.method378(this.field3530, 127);
                                            var17 = this.field3521.field434 = class58.method378(this.field3517, 127);
                                            var18 = this.field3521.field432 = class58.method378(this.field3531, 127);
                                        }
                                        if (var19 == null) {
                                            class28 var44 = var6.field3521 = new class28();
                                            var19 = var44.field431 = class58.method378(var11, 127);
                                            var20 = var44.field433 = class58.method378(var12, 127);
                                            var21 = var44.field434 = class58.method378(var13, 127);
                                            var22 = var44.field432 = class58.method378(var14, 127);
                                        }
                                        short var45 = this.field3516[var35];
                                        short var46 = this.field3530[var35];
                                        short var47 = this.field3517[var35];
                                        short var48 = this.field3531[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field3523[var31];
                                        int var58 = this.field3523[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field3499[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lqb;)Lqb;", line = 785)
    public final class95 method1323(class95 arg0) {
        if (this.field3507 == 0) {
            return null;
        }
        if (!this.field3537.field324) {
            this.method1338();
        }
        int var2;
        int var3;
        if (class59.field808 > 0) {
            var2 = this.field3537.field323 - (class59.field808 * this.field3537.field330 >> 8) >> 3;
            var3 = this.field3537.field329 - (class59.field808 * this.field3537.field326 >> 8) >> 3;
        } else {
            var2 = this.field3537.field323 - (class59.field808 * this.field3537.field326 >> 8) >> 3;
            var3 = this.field3537.field329 - (class59.field808 * this.field3537.field330 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class59.field817 > 0) {
            var4 = this.field3537.field327 - (class59.field817 * this.field3537.field330 >> 8) >> 3;
            var5 = this.field3537.field325 - (class59.field817 * this.field3537.field326 >> 8) >> 3;
        } else {
            var4 = this.field3537.field327 - (class59.field817 * this.field3537.field326 >> 8) >> 3;
            var5 = this.field3537.field325 - (class59.field817 * this.field3537.field330 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class95 var8;
        if (arg0 == null || arg0.field1596.length < var6 * var7) {
            var8 = new class95(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field1468 = arg0.field1464 = var6;
            arg0.field1475 = arg0.field1465 = var7;
            arg0.method607();
        }
        var8.field1474 = var2;
        var8.field1470 = var4;
        if (field3544.length < this.field3507) {
            field3544 = new int[this.field3507];
            field3547 = new int[this.field3507];
        }
        for (int var9 = 0; var9 < this.field3511; var9++) {
            int var10 = (this.field3532[var9] - (this.field3508[var9] * class59.field808 >> 8) >> 3) - var2;
            int var11 = (this.field3515[var9] - (this.field3508[var9] * class59.field817 >> 8) >> 3) - var4;
            int var12 = this.field3523[var9];
            int var13 = this.field3523[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field3499[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3544[var15] = var10;
                field3547[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field3510; var16++) {
            if (this.field3513[var16] <= 128) {
                short var17 = this.field3506[var16];
                short var18 = this.field3520[var16];
                short var19 = this.field3500[var16];
                int var20 = field3544[var17];
                int var21 = field3544[var18];
                int var22 = field3544[var19];
                int var23 = field3547[var17];
                int var24 = field3547[var18];
                int var25 = field3547[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class139.method873(var8.field1596, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 908)
    private static final void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field3551 = var18;
        field3546 = var19;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(III)V", line = 989)
    public final void method1325(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3511; var4++) {
            this.field3532[var4] += arg0;
            this.field3508[var4] += arg1;
            this.field3515[var4] += arg2;
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "()I", line = 1003)
    public final int method1326() {
        if (!this.field3537.field324) {
            this.method1338();
        }
        return this.field3537.field328;
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "()I", line = 1009)
    public final int method1327() {
        if (!this.field3537.field324) {
            this.method1338();
        }
        return this.field3537.field329;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIFFF)[F", line = 1016)
    private static final float[] method1328(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII[FFIF)V", line = 1092)
    private static final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3549 = var16;
        field3552 = var17;
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "()I", line = 1136)
    public final int method1330() {
        return this.field3502;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 1140)
    public final void method1331(int arg0) {
        int var2 = class139.field2309[arg0];
        int var3 = class139.field2316[arg0];
        for (int var4 = 0; var4 < this.field3511; var4++) {
            int var5 = this.field3532[var4] * var3 + this.field3508[var4] * var2 >> 16;
            this.field3508[var4] = this.field3508[var4] * var3 - this.field3532[var4] * var2 >> 16;
            this.field3532[var4] = var5;
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([FI)[F", line = 1160)
    private static final float[] method1332(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class136.method844(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)I", line = 1166)
    private static final int method1333(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(III)V", line = 1202)
    public final void method1334(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3511; var4++) {
            this.field3532[var4] = this.field3532[var4] * arg0 >> 7;
            this.field3508[var4] = this.field3508[var4] * arg1 >> 7;
            this.field3515[var4] = this.field3515[var4] * arg2 >> 7;
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZZZZZZZ)V", line = 1216)
    public final void method1335(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field3529 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field3507 != 0) {
            if (arg6) {
                boolean var8 = !this.field3527.field340 && (arg1 || arg2 && !class44.field601);
                this.method1347(false, !this.field3512.field340 && arg0, var8, this.field3503 != null && !this.field3503.field340 && arg2, !this.field3501.field340 && arg3);
                if (!this.field3533.field340 && arg4 && arg1) {
                    this.method1369();
                }
            }
            if (arg0) {
                if (this.field3512.field340) {
                    this.field3532 = null;
                    this.field3508 = null;
                    this.field3515 = null;
                    this.field3499 = null;
                    this.field3523 = null;
                } else {
                    this.field3519 = (byte) (this.field3519 | 0x1);
                }
            }
            if (arg1) {
                if (this.field3527.field340) {
                    this.field3538 = null;
                    this.field3513 = null;
                } else {
                    this.field3519 = (byte) (this.field3519 | 0x2);
                }
            }
            if (arg2 && class44.field601) {
                if (this.field3503.field340) {
                    this.field3516 = null;
                    this.field3530 = null;
                    this.field3517 = null;
                    this.field3531 = null;
                } else {
                    this.field3519 = (byte) (this.field3519 | 0x4);
                }
            }
            if (arg3) {
                if (this.field3501.field340) {
                    this.field3525 = null;
                    this.field3518 = null;
                } else {
                    this.field3519 = (byte) (this.field3519 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field3533.field340 && this.field3527.field340) {
                    this.field3506 = null;
                    this.field3520 = null;
                    this.field3500 = null;
                } else {
                    this.field3519 = (byte) (this.field3519 | 0x10);
                }
            }
            if (arg5) {
                this.field3504 = null;
                this.field3509 = null;
                this.field3528 = (int[][]) null;
                this.field3505 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ISIB)I", line = 1311)
    private static final int method1336(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class139.field2317[class258.method1745(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class139.field2315.method643(-17, arg1 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class139.field2315.method637(-1, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZZZZZZZZZZZ)Lh;", line = 1370)
    public final class206 method1337(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class206 var12 = new class206();
        var12.field3511 = this.field3511;
        var12.field3507 = this.field3507;
        var12.field3510 = this.field3510;
        if (arg0) {
            var12.field3532 = this.field3532;
            var12.field3515 = this.field3515;
        } else {
            var12.field3532 = class287.method1967(this.field3532, 0);
            var12.field3515 = class287.method1967(this.field3515, 0);
        }
        if (arg1) {
            var12.field3508 = this.field3508;
        } else {
            var12.field3508 = class287.method1967(this.field3508, 0);
        }
        if (arg0 && arg1) {
            var12.field3512 = this.field3512;
            var12.field3537 = this.field3537;
        } else {
            var12.field3512 = new class22();
            var12.field3537 = new class21();
        }
        if (arg2) {
            var12.field3538 = this.field3538;
        } else {
            var12.field3538 = class58.method378(this.field3538, 127);
        }
        if (arg3) {
            var12.field3513 = this.field3513;
        } else {
            var12.field3513 = class195.method1254((byte) -98, this.field3513);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class44.field601) {
            var12.field3527 = new class22();
        } else {
            var12.field3527 = this.field3527;
        }
        if (arg5) {
            var12.field3516 = this.field3516;
            var12.field3530 = this.field3530;
            var12.field3517 = this.field3517;
            var12.field3531 = this.field3531;
        } else {
            var12.field3516 = class58.method378(this.field3516, 127);
            var12.field3530 = class58.method378(this.field3530, 127);
            var12.field3517 = class58.method378(this.field3517, 127);
            var12.field3531 = class58.method378(this.field3531, 127);
        }
        if (!class44.field601) {
            var12.field3503 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field3503 = this.field3503;
        } else {
            var12.field3503 = new class22();
        }
        if (arg8) {
            var12.field3525 = this.field3525;
            var12.field3518 = this.field3518;
            var12.field3501 = this.field3501;
        } else {
            var12.field3525 = class99.method655(-102, this.field3525);
            var12.field3518 = class99.method655(93, this.field3518);
            var12.field3501 = new class22();
        }
        if (arg9) {
            var12.field3506 = this.field3506;
            var12.field3520 = this.field3520;
            var12.field3500 = this.field3500;
            var12.field3533 = this.field3533;
        } else {
            var12.field3506 = class58.method378(this.field3506, 127);
            var12.field3520 = class58.method378(this.field3520, 127);
            var12.field3500 = class58.method378(this.field3500, 127);
            var12.field3533 = new class22();
        }
        if (arg10) {
            var12.field3524 = this.field3524;
        } else {
            var12.field3524 = class58.method378(this.field3524, 127);
        }
        var12.field3504 = this.field3504;
        var12.field3528 = this.field3528;
        var12.field3509 = this.field3509;
        var12.field3505 = this.field3505;
        var12.field3536 = this.field3536;
        var12.field3499 = this.field3499;
        var12.field3523 = this.field3523;
        var12.field3534 = this.field3534;
        var12.field3502 = this.field3502;
        return var12;
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "()V", line = 1506)
    private final void method1338() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3511; var9++) {
            int var10 = this.field3532[var9];
            int var11 = this.field3508[var9];
            int var12 = this.field3515[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field3537.field323 = (short) var1;
        this.field3537.field329 = (short) var4;
        this.field3537.field326 = (short) var2;
        this.field3537.field330 = (short) var5;
        this.field3537.field327 = (short) var3;
        this.field3537.field325 = (short) var6;
        this.field3537.field328 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field3537.field324 = true;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()V", line = 1577)
    public final void method1339() {
        for (int var1 = 0; var1 < this.field3511; var1++) {
            int var2 = this.field3515[var1];
            this.field3515[var1] = this.field3532[var1];
            this.field3532[var1] = -var2;
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lkj;IJIIIIFF)S", line = 1594)
    private final short method1340(class165 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field3523[arg1];
        int var12 = this.field3523[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field3499[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field3535[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field3499[var13] = (short) (this.field3507 + 1);
        field3535[var13] = arg2;
        this.field3516[this.field3507] = (short) arg3;
        this.field3530[this.field3507] = (short) arg4;
        this.field3517[this.field3507] = (short) arg5;
        this.field3531[this.field3507] = (short) arg6;
        this.field3525[this.field3507] = arg7;
        this.field3518[this.field3507] = arg8;
        return (short) (this.field3507++);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V", line = 1630)
    private final void method1341(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field3554 = 0;
            field3545 = 0;
            field3553 = 0;
            for (int var6 = 0; var6 < this.field3511; var6++) {
                field3554 += this.field3532[var6];
                field3545 += this.field3508[var6];
                field3553 += this.field3515[var6];
                var5++;
            }
            if (var5 > 0) {
                field3554 = field3554 / var5 + arg1;
                field3545 = field3545 / var5 + arg2;
                field3553 = field3553 / var5 + arg3;
            } else {
                field3554 = arg1;
                field3545 = arg2;
                field3553 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3511; var7++) {
                this.field3532[var7] += arg1;
                this.field3508[var7] += arg2;
                this.field3515[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3511; var8++) {
                this.field3532[var8] -= field3554;
                this.field3508[var8] -= field3545;
                this.field3515[var8] -= field3553;
                if (arg3 != 0) {
                    int var9 = class139.field2309[arg3];
                    int var10 = class139.field2316[arg3];
                    int var11 = this.field3532[var8] * var10 + this.field3508[var8] * var9 + 32767 >> 16;
                    this.field3508[var8] = this.field3508[var8] * var10 + 32767 - this.field3532[var8] * var9 >> 16;
                    this.field3532[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class139.field2309[arg1];
                    int var13 = class139.field2316[arg1];
                    int var14 = this.field3508[var8] * var13 + 32767 - this.field3515[var8] * var12 >> 16;
                    this.field3515[var8] = this.field3515[var8] * var13 + this.field3508[var8] * var12 + 32767 >> 16;
                    this.field3508[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class139.field2309[arg2];
                    int var16 = class139.field2316[arg2];
                    int var17 = this.field3532[var8] * var16 + this.field3515[var8] * var15 + 32767 >> 16;
                    this.field3515[var8] = this.field3515[var8] * var16 + 32767 - this.field3532[var8] * var15 >> 16;
                    this.field3532[var8] = var17;
                }
                this.field3532[var8] += field3554;
                this.field3508[var8] += field3545;
                this.field3515[var8] += field3553;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3511; var18++) {
                this.field3532[var18] -= field3554;
                this.field3508[var18] -= field3545;
                this.field3515[var18] -= field3553;
                this.field3532[var18] = this.field3532[var18] * arg1 / 128;
                this.field3508[var18] = this.field3508[var18] * arg2 / 128;
                this.field3515[var18] = this.field3515[var18] * arg3 / 128;
                this.field3532[var18] += field3554;
                this.field3508[var18] += field3545;
                this.field3515[var18] += field3553;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3510; var19++) {
                int var20 = (this.field3513[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field3513[var19] = (byte) var20;
            }
            this.field3527.field340 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "()V", line = 1785)
    public static void method1342() {
        field3535 = null;
        field3514 = null;
        field3540 = null;
        field3539 = null;
        field3541 = null;
        field3542 = null;
        field3543 = null;
        field3544 = null;
        field3547 = null;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 1796)
    public final void method1343(int arg0) {
        this.field3534 = (short) arg0;
        this.field3527.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V", line = 1801)
    public final void method1344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3507 == 0) {
            return;
        }
        GL var8 = class167.field2806;
        var8.glPushMatrix();
        if (arg3 != 0) {
            var8.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var8.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var8.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var8.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var8.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1345();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "()V", line = 1825)
    private final void method1345() {
        GL var1 = class167.field2806;
        if (this.field3510 == 0) {
            return;
        }
        if (this.field3529 != 0) {
            this.method1347(true, !this.field3512.field340 && (this.field3529 & 0x1) != 0, !this.field3527.field340 && (this.field3529 & 0x2) != 0, this.field3503 != null && !this.field3503.field340 && (this.field3529 & 0x4) != 0, false);
        }
        this.method1347(false, !this.field3512.field340, !this.field3527.field340, this.field3503 != null && !this.field3503.field340, !this.field3501.field340);
        if (!this.field3533.field340) {
            this.method1369();
        }
        if (this.field3519 != 0) {
            if ((this.field3519 & 0x1) != 0) {
                this.field3532 = null;
                this.field3508 = null;
                this.field3515 = null;
                this.field3499 = null;
                this.field3523 = null;
            }
            if ((this.field3519 & 0x2) != 0) {
                this.field3538 = null;
                this.field3513 = null;
            }
            if ((this.field3519 & 0x4) != 0) {
                this.field3516 = null;
                this.field3530 = null;
                this.field3517 = null;
                this.field3531 = null;
            }
            if ((this.field3519 & 0x8) != 0) {
                this.field3525 = null;
                this.field3518 = null;
            }
            if ((this.field3519 & 0x10) != 0) {
                this.field3506 = null;
                this.field3520 = null;
                this.field3500 = null;
            }
            this.field3519 = 0;
        }
        class268 var2 = null;
        if (this.field3512.field333 != null) {
            this.field3512.field333.method1803();
            var2 = this.field3512.field333;
            var1.glVertexPointer(3, 5126, this.field3512.field331, (long) this.field3512.field341);
        }
        if (this.field3527.field333 != null) {
            if (this.field3527.field333 != var2) {
                this.field3527.field333.method1803();
                var2 = this.field3527.field333;
            }
            var1.glColorPointer(4, 5121, this.field3527.field331, (long) this.field3527.field341);
        }
        if (class44.field601 && this.field3503.field333 != null) {
            if (this.field3503.field333 != var2) {
                this.field3503.field333.method1803();
                var2 = this.field3503.field333;
            }
            var1.glNormalPointer(5126, this.field3503.field331, (long) this.field3503.field341);
        }
        if (this.field3501.field333 != null) {
            if (this.field3501.field333 != var2) {
                this.field3501.field333.method1803();
                class268 var3 = this.field3501.field333;
            }
            var1.glTexCoordPointer(2, 5126, this.field3501.field331, (long) this.field3501.field341);
        }
        if (this.field3533.field333 != null) {
            this.field3533.field333.method1807();
        }
        if (this.field3512.field333 == null || this.field3527.field333 == null || class44.field601 && this.field3503.field333 == null || this.field3501.field333 == null) {
            if (class167.field2792) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field3512.field333 == null) {
                this.field3512.field335.position(this.field3512.field341);
                var1.glVertexPointer(3, 5126, this.field3512.field331, this.field3512.field335);
            }
            if (this.field3527.field333 == null) {
                this.field3527.field335.position(this.field3527.field341);
                var1.glColorPointer(4, 5121, this.field3527.field331, this.field3527.field335);
            }
            if (class44.field601 && this.field3503.field333 == null) {
                this.field3503.field335.position(this.field3503.field341);
                var1.glNormalPointer(5126, this.field3503.field331, this.field3503.field335);
            }
            if (this.field3501.field333 == null) {
                this.field3501.field335.position(this.field3501.field341);
                var1.glTexCoordPointer(2, 5126, this.field3501.field331, this.field3501.field335);
            }
        }
        if (this.field3533.field333 == null && class167.field2792) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field3536.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field3536[var5];
            int var7 = this.field3536[var5 + 1];
            short var8 = this.field3524[var6];
            if (var8 == -1) {
                class167.method1033(-1);
                class284.method1954(0, (byte) -30, 0);
            } else {
                class139.field2315.method634(var8 & 0xFFFF, 773268577);
            }
            if (this.field3533.field333 == null) {
                this.field3533.field335.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field3533.field335);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "()I", line = 1996)
    public final int method1346() {
        if (!this.field3537.field324) {
            this.method1338();
        }
        return this.field3537.field323;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 3631)
    private class206() {
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lkj;IIZ)V", line = 3633)
    public class206(class165 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2720];
        this.field3523 = new int[arg0.field2752 + 1];
        for (int var6 = 0; var6 < arg0.field2720; var6++) {
            if ((arg0.field2729 == null || arg0.field2729[var6] != 2) && (arg0.field2727 == null || arg0.field2727[var6] == -1 || !class139.field2315.method649(-27065, arg0.field2727[var6] & 0xFFFF))) {
                var5[this.field3510++] = var6;
                this.field3523[arg0.field2744[var6]]++;
                this.field3523[arg0.field2761[var6]]++;
                this.field3523[arg0.field2754[var6]]++;
            }
        }
        long[] var7 = new long[this.field3510];
        for (int var8 = 0; var8 < this.field3510; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2727 != null) {
                var14 = arg0.field2727[var9];
                if (var14 != -1) {
                    var12 = class139.field2315.method629(-111, var14 & 0xFFFF);
                    var13 = class139.field2315.method638(255, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field2736 != null && arg0.field2736[var9] != 0 || var14 != -1 && !class139.field2315.method627(var14 & 0xFFFF, -1);
            if ((arg3 || var15) && arg0.field2717 != null) {
                var10 += arg0.field2717[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class282.method1897(var7, -122, var5);
        this.field3511 = arg0.field2752;
        this.field3532 = arg0.field2757;
        this.field3508 = arg0.field2740;
        this.field3515 = arg0.field2759;
        this.field3504 = arg0.field2732;
        int var20 = this.field3510 * 3;
        this.field3516 = new short[var20];
        this.field3530 = new short[var20];
        this.field3517 = new short[var20];
        this.field3531 = new short[var20];
        this.field3525 = new float[var20];
        this.field3518 = new float[var20];
        this.field3538 = new short[this.field3510];
        this.field3513 = new byte[this.field3510];
        this.field3506 = new short[this.field3510];
        this.field3520 = new short[this.field3510];
        this.field3500 = new short[this.field3510];
        this.field3524 = new short[this.field3510];
        if (arg0.field2731 != null) {
            this.field3509 = new byte[this.field3510];
        }
        this.field3537 = new class21();
        this.field3512 = new class22();
        this.field3527 = new class22();
        if (class44.field601) {
            this.field3503 = new class22();
        }
        this.field3501 = new class22();
        this.field3533 = new class22();
        this.field3534 = (short) arg1;
        this.field3502 = (short) arg2;
        this.field3499 = new short[var20];
        field3535 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field2752; var22++) {
            int var23 = this.field3523[var22];
            this.field3523[var22] = var21;
            var21 += var23;
        }
        this.field3523[arg0.field2752] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2724 != null) {
            int var28 = arg0.field2750;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field3510; var36++) {
                int var37 = var5[var36];
                if (arg0.field2724[var37] != -1) {
                    int var38 = arg0.field2724[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2744[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2761[var37];
                        } else {
                            var40 = arg0.field2754[var37];
                        }
                        int var41 = arg0.field2757[var40];
                        int var42 = arg0.field2740[var40];
                        int var43 = arg0.field2759[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field2722[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2735[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field2755[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2735[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2755[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2725[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2735[var44] / 1024.0F;
                        var49 = (float) arg0.field2755[var44] / 1024.0F;
                        var48 = (float) arg0.field2725[var44] / 1024.0F;
                    }
                    var27[var44] = method1328(arg0.field2742[var44], arg0.field2726[var44], arg0.field2714[var44], arg0.field2749[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field3510; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2737[var51] & 0xFFFF;
            short var53;
            if (arg0.field2727 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2727[var51];
            }
            int var54;
            if (arg0.field2724 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2724[var51];
            }
            int var55;
            if (arg0.field2736 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2736[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field2722[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2744[var51];
                        int var67 = arg0.field2761[var51];
                        int var68 = arg0.field2754[var51];
                        short var69 = arg0.field2742[var54];
                        short var70 = arg0.field2726[var54];
                        short var71 = arg0.field2714[var54];
                        float var72 = (float) arg0.field2757[var69];
                        float var73 = (float) arg0.field2740[var69];
                        float var74 = (float) arg0.field2759[var69];
                        float var75 = (float) arg0.field2757[var70] - var72;
                        float var76 = (float) arg0.field2740[var70] - var73;
                        float var77 = (float) arg0.field2759[var70] - var74;
                        float var78 = (float) arg0.field2757[var71] - var72;
                        float var79 = (float) arg0.field2740[var71] - var73;
                        float var80 = (float) arg0.field2759[var71] - var74;
                        float var81 = (float) arg0.field2757[var66] - var72;
                        float var82 = (float) arg0.field2740[var66] - var73;
                        float var83 = (float) arg0.field2759[var66] - var74;
                        float var84 = (float) arg0.field2757[var67] - var72;
                        float var85 = (float) arg0.field2740[var67] - var73;
                        float var86 = (float) arg0.field2759[var67] - var74;
                        float var87 = (float) arg0.field2757[var68] - var72;
                        float var88 = (float) arg0.field2740[var68] - var73;
                        float var89 = (float) arg0.field2759[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field2744[var51];
                        int var102 = arg0.field2761[var51];
                        int var103 = arg0.field2754[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2758[var54];
                        float var109 = (float) arg0.field2751[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2725[var54] & 0xFFFF) / 1024.0F;
                            method1329(arg0.field2757[var101], arg0.field2740[var101], arg0.field2759[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3549;
                            var57 = field3552;
                            method1329(arg0.field2757[var102], arg0.field2740[var102], arg0.field2759[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3549;
                            var59 = field3552;
                            method1329(arg0.field2757[var103], arg0.field2740[var103], arg0.field2759[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3549;
                            var61 = field3552;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field2743[var54] / 256.0F;
                            float var113 = (float) arg0.field2730[var54] / 256.0F;
                            int var114 = arg0.field2757[var102] - arg0.field2757[var101];
                            int var115 = arg0.field2740[var102] - arg0.field2740[var101];
                            int var116 = arg0.field2759[var102] - arg0.field2759[var101];
                            int var117 = arg0.field2757[var103] - arg0.field2757[var101];
                            int var118 = arg0.field2740[var103] - arg0.field2740[var101];
                            int var119 = arg0.field2759[var103] - arg0.field2759[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2735[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2755[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2725[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1333(var126, var127, var128);
                            method1324(arg0.field2757[var101], arg0.field2740[var101], arg0.field2759[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3551;
                            var57 = field3546;
                            method1324(arg0.field2757[var102], arg0.field2740[var102], arg0.field2759[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3551;
                            var59 = field3546;
                            method1324(arg0.field2757[var103], arg0.field2740[var103], arg0.field2759[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3551;
                            var61 = field3546;
                        } else if (var65 == 3) {
                            method1366(arg0.field2757[var101], arg0.field2740[var101], arg0.field2759[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field3548;
                            var57 = field3550;
                            method1366(arg0.field2757[var102], arg0.field2740[var102], arg0.field2759[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field3548;
                            var59 = field3550;
                            method1366(arg0.field2757[var103], arg0.field2740[var103], arg0.field2759[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field3548;
                            var61 = field3550;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1009();
            byte var129;
            if (arg0.field2729 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2729[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2744[var51];
                class288 var133 = arg0.field2753[var132];
                this.field3506[var50] = this.method1340(arg0, var132, var130, var133.field4894, var133.field4903, var133.field4893, var133.field4900, var56, var57);
                int var134 = arg0.field2761[var51];
                class288 var135 = arg0.field2753[var134];
                this.field3520[var50] = this.method1340(arg0, var134, (long) var62 + var130, var135.field4894, var135.field4903, var135.field4893, var135.field4900, var58, var59);
                int var136 = arg0.field2754[var51];
                class288 var137 = arg0.field2753[var136];
                this.field3500[var50] = this.method1340(arg0, var136, (long) var63 + var130, var137.field4894, var137.field4903, var137.field4893, var137.field4900, var60, var61);
            } else if (var129 == 1) {
                class36 var138 = arg0.field2716[var51];
                long var139 = (long) ((var54 << 2) + (var138.field529 > 0 ? 1024 : 2048) + (var138.field535 + 256 << 12) + (var138.field532 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field3506[var50] = this.method1340(arg0, arg0.field2744[var51], var139, var138.field529, var138.field535, var138.field532, 0, var56, var57);
                this.field3520[var50] = this.method1340(arg0, arg0.field2761[var51], (long) var62 + var139, var138.field529, var138.field535, var138.field532, 0, var58, var59);
                this.field3500[var50] = this.method1340(arg0, arg0.field2754[var51], (long) var63 + var139, var138.field529, var138.field535, var138.field532, 0, var60, var61);
            }
            if (arg0.field2727 == null) {
                this.field3524[var50] = -1;
            } else {
                this.field3524[var50] = arg0.field2727[var51];
            }
            if (this.field3509 != null) {
                this.field3509[var50] = (byte) arg0.field2731[var51];
            }
            this.field3538[var50] = arg0.field2737[var51];
            if (arg0.field2736 != null) {
                this.field3513[var50] = arg0.field2736[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field3510; var143++) {
            short var144 = this.field3524[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field3536 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field3510; var147++) {
            short var148 = this.field3524[var147];
            if (var146 != var148) {
                this.field3536[var145++] = var147;
                var146 = var148;
            }
        }
        this.field3536[var145] = this.field3510;
        field3535 = null;
        this.field3516 = method1371(this.field3516, this.field3507);
        this.field3530 = method1371(this.field3530, this.field3507);
        this.field3517 = method1371(this.field3517, this.field3507);
        this.field3531 = method1371(this.field3531, this.field3507);
        this.field3525 = method1332(this.field3525, this.field3507);
        this.field3518 = method1332(this.field3518, this.field3507);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZZZZZ)V", line = 2006)
    private final void method1347(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field3512.field341 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field3527.field341 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field3503.field341 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field3501.field341 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field3514.field3879.length < this.field3507 * var6) {
            field3514 = new class229((this.field3507 + 100) * var6);
        } else {
            field3514.field3905 = 0;
        }
        if (arg1) {
            if (class167.field2795) {
                for (int var7 = 0; var7 < this.field3511; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field3532[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field3508[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field3515[var7]);
                    int var11 = this.field3523[var7];
                    int var12 = this.field3523[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field3499[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field3514.field3905 = var6 * var14;
                        field3514.method1515(var8, 95);
                        field3514.method1515(var9, 86);
                        field3514.method1515(var10, 75);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field3511; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field3532[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field3508[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field3515[var15]);
                    int var19 = this.field3523[var15];
                    int var20 = this.field3523[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field3499[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field3514.field3905 = var6 * var22;
                        field3514.method1517(118, var16);
                        field3514.method1517(124, var17);
                        field3514.method1517(90, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class44.field601) {
                for (int var42 = 0; var42 < this.field3510; var42++) {
                    int var43 = method1336(this.field3538[var42], this.field3524[var42], this.field3534, this.field3513[var42]);
                    field3514.field3905 = this.field3506[var42] * var6 + this.field3527.field341;
                    field3514.method1515(var43, 115);
                    field3514.field3905 = this.field3520[var42] * var6 + this.field3527.field341;
                    field3514.method1515(var43, 107);
                    field3514.field3905 = this.field3500[var42] * var6 + this.field3527.field341;
                    field3514.method1515(var43, 108);
                }
            } else {
                int var23 = (int) class59.field811[0];
                int var24 = (int) class59.field811[1];
                int var25 = (int) class59.field811[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field3534 * 1.3F);
                int var28 = this.field3502 * var26 >> 8;
                for (int var29 = 0; var29 < this.field3510; var29++) {
                    short var30 = this.field3506[var29];
                    short var31 = this.field3531[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field3517[var30] * var25 + this.field3530[var30] * var24 + this.field3516[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field3517[var30] * var25 + this.field3530[var30] * var24 + this.field3516[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field3531[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field3520[var29];
                    short var34 = this.field3531[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field3517[var33] * var25 + this.field3530[var33] * var24 + this.field3516[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field3517[var33] * var25 + this.field3530[var33] * var24 + this.field3516[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field3531[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field3500[var29];
                    short var37 = this.field3531[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field3517[var36] * var25 + this.field3530[var36] * var24 + this.field3516[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field3517[var36] * var25 + this.field3530[var36] * var24 + this.field3516[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field3531[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method1336(this.field3538[var29], this.field3524[var29], var32, this.field3513[var29]);
                    int var40 = method1336(this.field3538[var29], this.field3524[var29], var35, this.field3513[var29]);
                    int var41 = method1336(this.field3538[var29], this.field3524[var29], var38, this.field3513[var29]);
                    field3514.field3905 = var6 * var30 + this.field3527.field341;
                    field3514.method1515(var39, 121);
                    field3514.field3905 = var6 * var33 + this.field3527.field341;
                    field3514.method1515(var40, 92);
                    field3514.field3905 = var6 * var36 + this.field3527.field341;
                    field3514.method1515(var41, 72);
                }
                this.field3516 = null;
                this.field3530 = null;
                this.field3517 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field3502;
            float var45 = 3.0F / (float) (this.field3502 / 2 + this.field3502);
            field3514.field3905 = this.field3503.field341;
            if (class167.field2795) {
                for (int var46 = 0; var46 < this.field3507; var46++) {
                    short var47 = this.field3531[var46];
                    if (var47 == 0) {
                        field3514.method1519((float) this.field3516[var46] * var45, -1161532440);
                        field3514.method1519((float) this.field3530[var46] * var45, -1161532440);
                        field3514.method1519((float) this.field3517[var46] * var45, -1161532440);
                    } else {
                        float var48 = var44 / (float) var47;
                        field3514.method1519((float) this.field3516[var46] * var48, -1161532440);
                        field3514.method1519((float) this.field3530[var46] * var48, -1161532440);
                        field3514.method1519((float) this.field3517[var46] * var48, -1161532440);
                    }
                    field3514.field3905 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field3507; var49++) {
                    short var50 = this.field3531[var49];
                    if (var50 == 0) {
                        field3514.method1531((byte) 58, (float) this.field3516[var49] * var45);
                        field3514.method1531((byte) 58, (float) this.field3530[var49] * var45);
                        field3514.method1531((byte) 58, (float) this.field3517[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field3514.method1531((byte) 58, (float) this.field3516[var49] * var51);
                        field3514.method1531((byte) 58, (float) this.field3530[var49] * var51);
                        field3514.method1531((byte) 58, (float) this.field3517[var49] * var51);
                    }
                    field3514.field3905 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field3514.field3905 = this.field3501.field341;
            if (class167.field2795) {
                for (int var52 = 0; var52 < this.field3507; var52++) {
                    field3514.method1519(this.field3525[var52], -1161532440);
                    field3514.method1519(this.field3518[var52], -1161532440);
                    field3514.field3905 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field3507; var53++) {
                    field3514.method1531((byte) 58, this.field3525[var53]);
                    field3514.method1531((byte) 58, this.field3518[var53]);
                    field3514.field3905 += var6 - 8;
                }
            }
        }
        field3514.field3905 = this.field3507 * var6;
        if (arg0) {
            if (class167.field2785) {
                ByteBuffer var54 = ByteBuffer.wrap(field3514.field3879, 0, field3514.field3905);
                if (this.field3522 == null) {
                    this.field3522 = new class268(true);
                    this.field3522.method1806(var54);
                } else {
                    this.field3522.method1805(var54);
                }
                if (arg1) {
                    this.field3512.field340 = true;
                    this.field3512.field335 = null;
                    this.field3512.field333 = this.field3522;
                    this.field3512.field331 = var6;
                }
                if (arg2) {
                    this.field3527.field340 = true;
                    this.field3527.field335 = null;
                    this.field3527.field333 = this.field3522;
                    this.field3527.field331 = var6;
                }
                if (arg3) {
                    this.field3503.field340 = true;
                    this.field3503.field335 = null;
                    this.field3503.field333 = this.field3522;
                    this.field3503.field331 = var6;
                }
                if (arg4) {
                    this.field3501.field340 = true;
                    this.field3501.field335 = null;
                    this.field3501.field333 = this.field3522;
                    this.field3501.field331 = var6;
                }
            } else {
                if (field3540 == null || field3540.capacity() < field3514.field3905) {
                    field3540 = ByteBuffer.allocateDirect(var6 * 100 + field3514.field3905);
                } else {
                    field3540.clear();
                }
                field3540.put(field3514.field3879, 0, field3514.field3905);
                field3540.flip();
                if (arg1) {
                    this.field3512.field340 = true;
                    this.field3512.field335 = field3540;
                    this.field3512.field333 = null;
                    this.field3512.field331 = var6;
                }
                if (arg2) {
                    this.field3527.field340 = true;
                    this.field3527.field335 = field3540;
                    this.field3512.field333 = null;
                    this.field3527.field331 = var6;
                }
                if (arg3) {
                    this.field3503.field340 = true;
                    this.field3503.field335 = field3540;
                    this.field3503.field333 = null;
                    this.field3503.field331 = var6;
                }
                if (arg4) {
                    this.field3501.field340 = true;
                    this.field3501.field335 = field3540;
                    this.field3501.field333 = null;
                    this.field3501.field331 = var6;
                }
            }
        } else if (class167.field2792) {
            class268 var55 = new class268();
            ByteBuffer var56 = ByteBuffer.wrap(field3514.field3879, 0, field3514.field3905);
            var55.method1806(var56);
            if (arg1) {
                this.field3512.field340 = true;
                this.field3512.field335 = null;
                this.field3512.field333 = var55;
                this.field3512.field331 = var6;
            }
            if (arg2) {
                this.field3527.field340 = true;
                this.field3527.field335 = null;
                this.field3527.field333 = var55;
                this.field3527.field331 = var6;
            }
            if (arg3) {
                this.field3503.field340 = true;
                this.field3503.field335 = null;
                this.field3503.field333 = var55;
                this.field3503.field331 = var6;
            }
            if (arg4) {
                this.field3501.field340 = true;
                this.field3501.field335 = null;
                this.field3501.field333 = var55;
                this.field3501.field331 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field3514.field3905);
            var57.put(field3514.field3879, 0, field3514.field3905);
            var57.flip();
            if (arg1) {
                this.field3512.field340 = true;
                this.field3512.field335 = var57;
                this.field3512.field333 = null;
                this.field3512.field331 = var6;
            }
            if (arg2) {
                this.field3527.field340 = true;
                this.field3527.field335 = var57;
                this.field3512.field333 = null;
                this.field3527.field331 = var6;
            }
            if (arg3) {
                this.field3503.field340 = true;
                this.field3503.field335 = var57;
                this.field3503.field333 = null;
                this.field3503.field331 = var6;
            }
            if (arg4) {
                this.field3501.field340 = true;
                this.field3501.field335 = var57;
                this.field3501.field333 = null;
                this.field3501.field331 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lfm;I)V", line = 2534)
    public final void method1348(class42 arg0, int arg1) {
        if (this.field3528 == null || arg1 == -1) {
            return;
        }
        class41 var3 = arg0.field588[arg1];
        class66 var4 = var3.field583;
        field3554 = 0;
        field3545 = 0;
        field3553 = 0;
        for (int var5 = 0; var5 < var3.field577; var5++) {
            short var6 = var3.field575[var5];
            if (var4.field917[var6]) {
                if (var3.field580[var5] != -1) {
                    this.method1341(0, 0, 0, 0);
                }
                this.method1341(var4.field918[var6], var3.field578[var5], var3.field579[var5], var3.field573[var5]);
            }
        }
        this.field3512.field340 = false;
        this.field3537.field324 = false;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V", line = 2569)
    public final void method1349(int arg0) {
        this.field3502 = (short) arg0;
        if (this.field3503 != null) {
            this.field3503.field340 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "()V", line = 2578)
    public final void method1350() {
        for (int var1 = 0; var1 < this.field3511; var1++) {
            this.field3515[var1] = -this.field3515[var1];
        }
        if (this.field3517 != null) {
            for (int var2 = 0; var2 < this.field3507; var2++) {
                this.field3517[var2] = (short) (-this.field3517[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field3510; var3++) {
            short var4 = this.field3506[var3];
            this.field3506[var3] = this.field3500[var3];
            this.field3500[var3] = var4;
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
        if (this.field3503 != null) {
            this.field3503.field340 = false;
        }
        this.field3533.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "p", descriptor = "()V", line = 2615)
    public final void method1351() {
        if (this.field3516 == null) {
            this.method1360();
            return;
        }
        for (int var1 = 0; var1 < this.field3511; var1++) {
            this.field3532[var1] = -this.field3532[var1];
            this.field3515[var1] = -this.field3515[var1];
        }
        for (int var2 = 0; var2 < this.field3507; var2++) {
            this.field3516[var2] = (short) (-this.field3516[var2]);
            this.field3517[var2] = (short) (-this.field3517[var2]);
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
        if (this.field3503 != null) {
            this.field3503.field340 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIII)Z", line = 2650)
    private final boolean method1352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!h", name = "q", descriptor = "()V", line = 2666)
    public final void method1353() {
        if (this.field3516 == null) {
            this.method1339();
            return;
        }
        for (int var1 = 0; var1 < this.field3511; var1++) {
            int var2 = this.field3515[var1];
            this.field3515[var1] = this.field3532[var1];
            this.field3532[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3507; var3++) {
            short var4 = this.field3517[var3];
            this.field3517[var3] = this.field3516[var3];
            this.field3516[var3] = (short) (-var4);
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
        if (this.field3503 != null) {
            this.field3503.field340 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()I", line = 2709)
    public final int method40() {
        if (!this.field3537.field324) {
            this.method1338();
        }
        return this.field3537.field326;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIJ)V", line = 2716)
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field3507 == 0) {
            return;
        }
        if (!this.field3537.field324) {
            this.method1338();
        }
        short var11 = this.field3537.field328;
        short var12 = this.field3537.field326;
        short var13 = this.field3537.field330;
        int var14 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var15 = arg1 * arg6 + arg2 * var14 >> 16;
        int var16 = (arg1 * var13 + arg2 * var11 >> 16) + var15;
        if (var16 <= 50) {
            return;
        }
        int var17 = (-var11 * arg2 + arg1 * var12 >> 16) + var15;
        if (var17 >= 3584) {
            return;
        }
        int var18 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var19 = var11 + var18 << 9;
        if (var19 / var16 <= class195.field3324) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class138.field2291) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class305.field5202) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class103.field1762) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class139.field2309[arg0];
            var25 = class139.field2316[arg0];
        }
        if (arg8 > 0L && class71.field1242 && var17 > 0) {
            int var26;
            int var27;
            if (var18 > 0) {
                var26 = var20 / var16;
                var27 = var19 / var17;
            } else {
                var26 = var20 / var17;
                var27 = var19 / var16;
            }
            int var28;
            int var29;
            if (var21 > 0) {
                var28 = var23 / var16;
                var29 = var22 / var17;
            } else {
                var28 = var23 / var17;
                var29 = var22 / var16;
            }
            if (class65.field905 >= var26 && class65.field905 <= var27 && class1.field13 >= var28 && class1.field13 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field3537.field323;
                short var35 = this.field3537.field329;
                short var36 = this.field3537.field327;
                short var37 = this.field3537.field325;
                int[] var38 = new int[] { var34, var35, var34, var35, var34, var35, var34, var35 };
                int[] var39 = new int[] { var36, var36, var37, var37, var36, var36, var37, var37 };
                int[] var40 = new int[] { var12, var12, var12, var12, var13, var13, var13, var13 };
                for (int var41 = 0; var41 < 8; var41++) {
                    int var42 = var38[var41];
                    int var43 = var40[var41];
                    int var44 = var39[var41];
                    if (arg0 != 0) {
                        int var45 = var24 * var44 + var25 * var42 >> 16;
                        var44 = var25 * var44 - var24 * var42 >> 16;
                        var42 = var45;
                    }
                    int var46 = arg5 + var42;
                    int var47 = arg6 + var43;
                    int var48 = arg7 + var44;
                    int var49 = arg3 * var48 + arg4 * var46 >> 16;
                    int var50 = arg4 * var48 - arg3 * var46 >> 16;
                    int var52 = arg2 * var47 - arg1 * var50 >> 16;
                    int var53 = arg1 * var47 + arg2 * var50 >> 16;
                    if (var53 > 0) {
                        int var55 = (var49 << 9) / var53;
                        int var56 = (var52 << 9) / var53;
                        if (var55 < var30) {
                            var30 = var55;
                        }
                        if (var55 > var31) {
                            var31 = var55;
                        }
                        if (var56 < var32) {
                            var32 = var56;
                        }
                        if (var56 > var33) {
                            var33 = var56;
                        }
                    }
                }
                if (class65.field905 >= var30 && class65.field905 <= var31 && class1.field13 >= var32 && class1.field13 <= var33) {
                    if (this.field4906) {
                        class262.field4464[class278.field4648++] = arg8;
                    } else {
                        if (field3544.length < this.field3507) {
                            field3544 = new int[this.field3507];
                            field3547 = new int[this.field3507];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field3511) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field3510) {
                                        break label118;
                                    }
                                    short var78 = this.field3506[var77];
                                    short var79 = this.field3520[var77];
                                    short var80 = this.field3500[var77];
                                    if (this.method1352(class65.field905, class1.field13, field3547[var78], field3547[var79], field3547[var80], field3544[var78], field3544[var79], field3544[var80])) {
                                        class262.field4464[class278.field4648++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field3532[var57];
                            int var59 = this.field3508[var57];
                            int var60 = this.field3515[var57];
                            if (arg0 != 0) {
                                int var61 = var24 * var60 + var25 * var58 >> 16;
                                var60 = var25 * var60 - var24 * var58 >> 16;
                                var58 = var61;
                            }
                            int var62 = arg5 + var58;
                            int var63 = arg6 + var59;
                            int var64 = arg7 + var60;
                            int var65 = arg3 * var64 + arg4 * var62 >> 16;
                            int var66 = arg4 * var64 - arg3 * var62 >> 16;
                            int var68 = arg2 * var63 - arg1 * var66 >> 16;
                            int var69 = arg1 * var63 + arg2 * var66 >> 16;
                            if (var69 < 50) {
                                break;
                            }
                            int var71 = (var65 << 9) / var69;
                            int var72 = (var68 << 9) / var69;
                            int var73 = this.field3523[var57];
                            int var74 = this.field3523[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field3499[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field3544[var76] = var71;
                                field3547[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class167.field2806;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1345();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V", line = 2984)
    public final void method1354(int arg0) {
        if (this.field3516 == null) {
            this.method1356(arg0);
            return;
        }
        int var2 = class139.field2309[arg0];
        int var3 = class139.field2316[arg0];
        for (int var4 = 0; var4 < this.field3511; var4++) {
            int var5 = this.field3532[var4] * var3 + this.field3515[var4] * var2 >> 16;
            this.field3515[var4] = this.field3515[var4] * var3 - this.field3532[var4] * var2 >> 16;
            this.field3532[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field3507; var6++) {
            int var7 = this.field3517[var6] * var2 + this.field3516[var6] * var3 >> 16;
            this.field3517[var6] = (short) (this.field3517[var6] * var3 - this.field3516[var6] * var2 >> 16);
            this.field3516[var6] = (short) var7;
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
        if (this.field3503 != null) {
            this.field3503.field340 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(SS)V", line = 3029)
    public final void method1355(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3510; var3++) {
            if (this.field3524[var3] == arg0) {
                this.field3524[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class139.field2315.method643(-46, arg0 & 0xFFFF);
            var5 = class139.field2315.method637(-1, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class139.field2315.method643(-31, arg1 & 0xFFFF);
            var7 = class139.field2315.method637(-1, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field3527.field340 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 3068)
    public final void method1356(int arg0) {
        int var2 = class139.field2309[arg0];
        int var3 = class139.field2316[arg0];
        for (int var4 = 0; var4 < this.field3511; var4++) {
            int var5 = this.field3532[var4] * var3 + this.field3515[var4] * var2 >> 16;
            this.field3515[var4] = this.field3515[var4] * var3 - this.field3532[var4] * var2 >> 16;
            this.field3532[var4] = var5;
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "r", descriptor = "()V", line = 3088)
    public final void method1357() {
        int var10002;
        if (this.field3504 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3511; var3++) {
                int var4 = this.field3504[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3528 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3528[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3511) {
                int var7 = this.field3504[var6] & 0xFF;
                this.field3528[var7][var1[var7]++] = var6++;
            }
            this.field3504 = null;
        }
        if (this.field3509 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3510; var10++) {
            int var11 = this.field3509[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3505 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3505[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3510) {
            int var14 = this.field3509[var13] & 0xFF;
            this.field3505[var14][var8[var14]++] = var13++;
        }
        this.field3509 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Lgf;", line = 3180)
    public final class7 method46(int arg0, int arg1, int arg2) {
        this.field3526 = false;
        if (this.field3521 != null) {
            this.field3516 = this.field3521.field431;
            this.field3530 = this.field3521.field433;
            this.field3517 = this.field3521.field434;
            this.field3531 = this.field3521.field432;
            this.field3521 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "()I", line = 3193)
    public final int method1358() {
        if (!this.field3537.field324) {
            this.method1338();
        }
        return this.field3537.field327;
    }

    @OriginalMember(owner = "client!h", name = "s", descriptor = "()V", line = 3201)
    public final void method1359() {
        if (this.field3516 == null) {
            this.method1368();
            return;
        }
        for (int var1 = 0; var1 < this.field3511; var1++) {
            int var2 = this.field3532[var1];
            this.field3532[var1] = this.field3515[var1];
            this.field3515[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3507; var3++) {
            short var4 = this.field3516[var3];
            this.field3516[var3] = this.field3517[var3];
            this.field3517[var3] = (short) (-var4);
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
        if (this.field3503 != null) {
            this.field3503.field340 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()V", line = 3240)
    public final void method1360() {
        for (int var1 = 0; var1 < this.field3511; var1++) {
            this.field3532[var1] = -this.field3532[var1];
            this.field3515[var1] = -this.field3515[var1];
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "t", descriptor = "()V", line = 3255)
    public static final void method1361() {
        field3539 = new class206();
        field3541 = new class206();
        field3542 = new class206();
        field3543 = new class206();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 3262)
    public final void method1362(int arg0) {
        int var2 = class139.field2309[arg0];
        int var3 = class139.field2316[arg0];
        for (int var4 = 0; var4 < this.field3511; var4++) {
            int var5 = this.field3508[var4] * var3 - this.field3515[var4] * var2 >> 16;
            this.field3515[var4] = this.field3515[var4] * var3 + this.field3508[var4] * var2 >> 16;
            this.field3508[var4] = var5;
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "u", descriptor = "()I", line = 3281)
    public final int method1363() {
        return this.field3534;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lfm;IZ)V", line = 3284)
    public final void method1364(class42 arg0, int arg1, boolean arg2) {
        if (this.field3528 == null || arg1 == -1) {
            return;
        }
        class41 var4 = arg0.field588[arg1];
        class66 var5 = var4.field583;
        for (int var6 = 0; var6 < this.field3511; var6++) {
            this.field3532[var6] <<= 0x4;
            this.field3508[var6] <<= 0x4;
            this.field3515[var6] <<= 0x4;
        }
        field3554 = 0;
        field3545 = 0;
        field3553 = 0;
        for (int var7 = 0; var7 < var4.field577; var7++) {
            short var8 = var4.field575[var7];
            if (var4.field580[var7] != -1) {
                this.method1322(0, var5.field919[var4.field580[var7]], 0, 0, 0, arg2);
            }
            this.method1322(var5.field918[var8], var5.field919[var8], var4.field578[var7], var4.field579[var7], var4.field573[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field3511; var9++) {
            this.field3532[var9] >>= 0x4;
            this.field3508[var9] >>= 0x4;
            this.field3515[var9] >>= 0x4;
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZZ)Lhk;", line = 3337)
    public final class289 method1365(boolean arg0, boolean arg1) {
        return this.method1367(arg0, arg1, field3543, field3542);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()Z", line = 3340)
    public final boolean method48() {
        return this.field3526 && this.field3532 != null && this.field3516 != null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII[FIF)V", line = 3349)
    private static final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3548 = var16;
        field3550 = var17;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZZLh;Lh;)Lhk;", line = 3395)
    private final class289 method1367(boolean arg0, boolean arg1, class206 arg2, class206 arg3) {
        arg2.field3511 = this.field3511;
        arg2.field3507 = this.field3507;
        arg2.field3510 = this.field3510;
        arg2.field3534 = this.field3534;
        arg2.field3502 = this.field3502;
        arg2.field3529 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field3532 == null || arg2.field3532.length < this.field3511) {
            arg2.field3532 = new int[this.field3511 + 100];
            arg2.field3508 = new int[this.field3511 + 100];
            arg2.field3515 = new int[this.field3511 + 100];
        }
        for (int var5 = 0; var5 < this.field3511; var5++) {
            arg2.field3532[var5] = this.field3532[var5];
            arg2.field3508[var5] = this.field3508[var5];
            arg2.field3515[var5] = this.field3515[var5];
        }
        if (arg2.field3512 == null) {
            arg2.field3512 = new class22();
        }
        arg2.field3512.field340 = false;
        if (arg2.field3537 == null) {
            arg2.field3537 = new class21();
        }
        arg2.field3537.field324 = false;
        if (arg0) {
            arg2.field3513 = this.field3513;
            arg2.field3527 = this.field3527;
        } else {
            if (arg3.field3513 == null || arg3.field3513.length < this.field3510) {
                arg3.field3513 = new byte[this.field3510 + 100];
            }
            arg2.field3513 = arg3.field3513;
            for (int var6 = 0; var6 < this.field3510; var6++) {
                arg2.field3513[var6] = this.field3513[var6];
            }
            if (arg3.field3527 == null) {
                arg3.field3527 = new class22();
            }
            arg2.field3527 = arg3.field3527;
            arg2.field3527.field340 = false;
        }
        if (arg1) {
            arg2.field3516 = this.field3516;
            arg2.field3530 = this.field3530;
            arg2.field3517 = this.field3517;
            arg2.field3531 = this.field3531;
            arg2.field3503 = this.field3503;
        } else {
            if (arg3.field3516 == null || arg3.field3516.length < this.field3507) {
                arg3.field3516 = new short[this.field3507 + 100];
                arg3.field3530 = new short[this.field3507 + 100];
                arg3.field3517 = new short[this.field3507 + 100];
                arg3.field3531 = new short[this.field3507 + 100];
            }
            arg2.field3516 = arg3.field3516;
            arg2.field3530 = arg3.field3530;
            arg2.field3517 = arg3.field3517;
            arg2.field3531 = arg3.field3531;
            for (int var7 = 0; var7 < this.field3507; var7++) {
                arg2.field3516[var7] = this.field3516[var7];
                arg2.field3530[var7] = this.field3530[var7];
                arg2.field3517[var7] = this.field3517[var7];
                arg2.field3531[var7] = this.field3531[var7];
            }
            if (class44.field601) {
                if (arg3.field3503 == null) {
                    arg3.field3503 = new class22();
                }
                arg2.field3503 = arg3.field3503;
                arg2.field3503.field340 = false;
            } else {
                arg2.field3503 = null;
            }
        }
        arg2.field3525 = this.field3525;
        arg2.field3518 = this.field3518;
        arg2.field3504 = this.field3504;
        arg2.field3528 = this.field3528;
        arg2.field3538 = this.field3538;
        arg2.field3506 = this.field3506;
        arg2.field3520 = this.field3520;
        arg2.field3500 = this.field3500;
        arg2.field3524 = this.field3524;
        arg2.field3509 = this.field3509;
        arg2.field3505 = this.field3505;
        arg2.field3501 = this.field3501;
        arg2.field3533 = this.field3533;
        arg2.field3536 = this.field3536;
        arg2.field3499 = this.field3499;
        arg2.field3523 = this.field3523;
        arg2.field4906 = this.field4906;
        return arg2;
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "()V", line = 3521)
    public final void method1368() {
        for (int var1 = 0; var1 < this.field3511; var1++) {
            int var2 = this.field3532[var1];
            this.field3532[var1] = this.field3515[var1];
            this.field3515[var1] = -var2;
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "v", descriptor = "()V", line = 3540)
    private final void method1369() {
        if (field3514.field3879.length < this.field3507 * 12) {
            field3514 = new class229((this.field3507 + 100) * 12);
        } else {
            field3514.field3905 = 0;
        }
        if (class167.field2795) {
            for (int var1 = 0; var1 < this.field3510; var1++) {
                field3514.method1515(this.field3506[var1], 120);
                field3514.method1515(this.field3520[var1], 78);
                field3514.method1515(this.field3500[var1], 88);
            }
        } else {
            for (int var2 = 0; var2 < this.field3510; var2++) {
                field3514.method1517(75, this.field3506[var2]);
                field3514.method1517(106, this.field3520[var2]);
                field3514.method1517(106, this.field3500[var2]);
            }
        }
        if (!class167.field2792) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field3514.field3905);
            var5.put(field3514.field3879, 0, field3514.field3905);
            var5.flip();
            this.field3533.field340 = true;
            this.field3533.field335 = var5;
            this.field3533.field333 = null;
            return;
        }
        class268 var3 = new class268();
        ByteBuffer var4 = ByteBuffer.wrap(field3514.field3879, 0, field3514.field3905);
        var3.method1806(var4);
        this.field3533.field340 = true;
        this.field3533.field335 = null;
        this.field3533.field333 = var3;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()I", line = 3599)
    public final int method1370() {
        if (!this.field3537.field324) {
            this.method1338();
        }
        return this.field3537.field325;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([SI)[S", line = 3606)
    private static final short[] method1371(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class136.method848(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(SS)V", line = 3614)
    public final void method1372(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3510; var3++) {
            if (this.field3538[var3] == arg0) {
                this.field3538[var3] = arg1;
            }
        }
        this.field3527.field340 = false;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(ZZ)Lhk;", line = 3629)
    public final class289 method1373(boolean arg0, boolean arg1) {
        return this.method1367(arg0, arg1, field3541, field3539);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lfm;ILfm;I[IZ)V", line = 4379)
    public final void method1374(class42 arg0, int arg1, class42 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method1364(arg0, arg1, arg5);
            return;
        }
        class41 var7 = arg0.field588[arg1];
        class41 var8 = arg2.field588[arg3];
        class66 var9 = var7.field583;
        for (int var10 = 0; var10 < this.field3511; var10++) {
            this.field3532[var10] <<= 0x4;
            this.field3508[var10] <<= 0x4;
            this.field3515[var10] <<= 0x4;
        }
        field3554 = 0;
        field3545 = 0;
        field3553 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field577; var13++) {
            short var14 = var7.field575[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field918[var14] == 0) {
                if (var7.field580[var13] != -1) {
                    this.method1322(0, var9.field919[var7.field580[var13]], 0, 0, 0, arg5);
                }
                this.method1322(var9.field918[var14], var9.field919[var14], var7.field578[var13], var7.field579[var13], var7.field573[var13], arg5);
            }
        }
        field3554 = 0;
        field3545 = 0;
        field3553 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field577; var17++) {
            short var18 = var8.field575[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field918[var18] == 0) {
                if (var8.field580[var17] != -1) {
                    this.method1322(0, var9.field919[var8.field580[var17]], 0, 0, 0, arg5);
                }
                this.method1322(var9.field918[var18], var9.field919[var18], var8.field578[var17], var8.field579[var17], var8.field573[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field3511; var19++) {
            this.field3532[var19] >>= 0x4;
            this.field3508[var19] >>= 0x4;
            this.field3515[var19] >>= 0x4;
        }
        this.field3537.field324 = false;
        this.field3512.field340 = false;
    }
}
