import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class244 extends class176 {

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lbu;")
    private class19 field3487 = new class19();

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lte;")
    public class527 field3488;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[[I")
    private int[][] field3475;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    private int field3492;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "[[[I")
    private int[][][] field3500;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[[B")
    private byte[][] field3482;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "[[[Lhr;")
    private class449[][][] field3494;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    private int field3504;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "[[B")
    private byte[][] field3525;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[[S")
    public short[][] field3479;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "[[F")
    private float[][] field3514;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "[[[I")
    public int[][][] field3484;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "[[[I")
    public int[][][] field3512;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "[[F")
    private float[][] field3517;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "[[[I")
    private int[][][] field3480;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "[[F")
    private float[][] field3520;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "[[[I")
    private int[][][] field3506;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "Llb;")
    private class465 field3516;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lku;")
    private class317 field3478;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "[I")
    public static int[] field3509 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    private int field3503;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    private int field3505;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
    private int field3523;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
    private int field3524;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Lmaa;")
    public class403 field3513;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "Lmaa;")
    private class403 field3515;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "Lmaa;")
    public class403 field3521;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "Lmaa;")
    public class403 field3522;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "Lsp;")
    private class544 field3519;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Ljava/awt/Image;")
    public static Image field3486;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "[Lhr;")
    private class449[] field3518;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[[[I")
    private int[][][] field3476;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "(IILk;)Lk;", line = 3)
    public final class485 method1231(int arg0, int arg1, class485 arg2) {
        ++field3498;
        if ((this.field3482[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field2694 >> this.field3488.field7742;
            class198 var5 = (class198) arg2;
            class198 var6;
            if (var5 != null && var5.method1332(var4, -95, var4)) {
                var6 = var5;
                var5.method1330(-8);
            } else {
                var6 = new class198(this.field3488, var4, var4);
            }
            var6.method1333(0, 0, 119, var4, var4);
            this.method1548(arg0, var6, arg1, 78);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIZI[[ZI)V", line = 35)
    private final void method1544(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean[][] arg5, int arg6) {
        if (this.field3518 != null) {
            float var8 = this.field3488.field7810;
            float var9 = this.field3488.field7819;
            int var10 = arg1 + arg1 + 1;
            int var11 = var10 * var10;
            if (this.field3488.field7889.length < var11) {
                this.field3488.field7889 = new int[var11];
            }
            if (this.field3488.field7836.field2146.length < this.field3505 * 2) {
                this.field3488.field7836 = new class247(this.field3505 * 2);
            }
            int var12 = -arg1 + arg6;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg1 + arg2;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg1 + arg6;
            if (~var16 < ~(super.field2697 + -1)) {
                var16 = super.field2697 - 1;
            }
            int var17 = arg1 + arg2;
            if (~var17 < ~(super.field2693 + -1)) {
                var17 = super.field2693 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field3488.field7889;
            for (int var20 = var12; var16 >= var20; ++var20) {
                boolean[] var26 = arg5[-var13 + var20];
                for (int var27 = var14; var27 <= var17; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field2697 * var27 + var20;
                    }
                }
            }
            if (~arg0 == 0) {
                this.field3488.method3130(100);
            } else {
                this.field3488.method3135(29573, (float) arg0);
                this.field3488.method3163(-53);
            }
            this.field3488.method3184(true, (7 & this.field3490) != 0);
            for (int var21 = 0; ~this.field3518.length < ~var21; ++var21) {
                this.field3518[var21].method2718(var18, (byte) 122, var19);
            }
            if (!this.field3487.method119(true)) {
                int var22 = this.field3488.field7858;
                int var23 = this.field3488.field7784;
                this.field3488.method489(0, var23, this.field3488.field7777);
                this.field3488.method422(var9, var8 - 4.0F);
                this.field3488.method3184(true, false);
                this.field3488.method3142(false, (byte) 119);
                this.field3488.method3105(128, 2);
                this.field3488.method3123(-2, false);
                this.field3488.method3152(-2, this.field3488.field7796);
                this.field3488.method3183(8448, -128, 7681);
                this.field3488.method3157(34166, 0, true, 770);
                this.field3488.method3107(34167, (byte) -13, 770, 0);
                for (class417 var24 = this.field3487.method124((byte) 42); var24 != null; var24 = this.field3487.method120(-81)) {
                    class161 var25 = (class161) var24;
                    var25.method1154(arg1, arg5, (byte) -15, arg2, arg6);
                }
                this.field3488.method3157(5890, 0, true, 768);
                this.field3488.method3107(5890, (byte) -52, 770, 0);
                this.field3488.method3152(-2, (class228) null);
                this.field3488.method489(var22, var23, this.field3488.field7777);
            }
            if (this.field3478 != null) {
                this.field3488.method422(var9, var8 + -8.0F);
                this.field3488.method3130(62);
                this.field3488.method3164(this.field3521, (byte) -72, this.field3513, (class403) null, (class403) null);
                this.field3478.method1917(arg5, arg6, arg2, arg1, (byte) -93, arg3);
            }
            this.field3488.method422(var9, var8);
        }
        ++field3501;
        if (arg4 <= 124) {
            this.field3505 = -116;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lnm;[I)V", line = 189)
    public final void method1236(class405 arg0, int[] arg1) {
        this.field3487.method131(new class161(this.field3488, this, arg0, arg1), 0);
        ++field3481;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLgw;)Les;", line = 199)
    public static final class322 method1545(boolean arg0, class148 arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field3508;
            return new class322(arg1.method1047(0), arg1.method1047(0), arg1.method1047(0), arg1.method1047(0), arg1.method1028((byte) 123), arg1.method1028((byte) 123), arg1.method1032((byte) -33));
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lk;IIIIZ)Z", line = 213)
    public final boolean method1240(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3485;
        if (this.field3478 != null && arg0 != null) {
            int var7 = -(this.field3488.field7871 * arg2 >> 8) + arg1 >> this.field3488.field7742;
            int var8 = -(this.field3488.field7867 * arg2 >> 8) + arg3 >> this.field3488.field7742;
            return this.field3478.method1918(var7, (byte) -60, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIII[[Z)V", line = 233)
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3499;
        if (this.field3523 > 0) {
            this.field3488.method3141(false);
            this.field3488.method3106(false, -105);
            this.field3488.method3184(true, false);
            this.field3488.method3156(false, true);
            this.field3488.method3142(false, (byte) 85);
            this.field3488.method3105(0, 2);
            this.field3488.method3123(-2, false);
            this.field3488.method3152(-2, (class228) null);
            class360.field4899[0] = (float) arg2 / ((float) super.field2694 * 128.0F * (float) this.field3488.field7612);
            class360.field4899[10] = 0.0F;
            class360.field4899[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field3488.field7612) + -1.0F;
            class360.field4899[15] = 1.0F;
            class360.field4899[2] = 0.0F;
            class360.field4899[9] = 0.0F;
            class360.field4899[4] = 0.0F;
            class360.field4899[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3488.field7563) + 1.0F;
            class360.field4899[11] = 0.0F;
            class360.field4899[6] = 0.0F;
            class360.field4899[14] = 0.0F;
            class360.field4899[3] = 0.0F;
            class360.field4899[1] = 0.0F;
            class360.field4899[7] = 0.0F;
            class360.field4899[5] = (float) arg2 / ((float) super.field2694 * 128.0F * (float) this.field3488.field7563);
            class360.field4899[8] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class360.field4899, 0);
            class360.field4899[6] = 1.0F;
            class360.field4899[5] = 0.0F;
            class360.field4899[0] = 1.0F;
            class360.field4899[12] = 0.0F;
            class360.field4899[10] = 0.0F;
            class360.field4899[8] = 0.0F;
            class360.field4899[9] = 1.0F;
            class360.field4899[2] = 0.0F;
            class360.field4899[15] = 1.0F;
            class360.field4899[1] = 0.0F;
            class360.field4899[3] = 0.0F;
            class360.field4899[14] = 0.0F;
            class360.field4899[4] = 0.0F;
            class360.field4899[13] = 0.0F;
            class360.field4899[11] = 0.0F;
            class360.field4899[7] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class360.field4899, 0);
            if ((this.field3490 & 7) == 0) {
                this.field3488.method3184(true, false);
            } else {
                this.field3488.method3184(true, true);
                this.field3488.method3182((byte) 121);
            }
            this.field3488.method3164(this.field3521, (byte) -88, this.field3513, this.field3522, this.field3515);
            if (~this.field3488.field7836.field2146.length <= ~(this.field3505 * 2)) {
                this.field3488.field7836.field2177 = 0;
            } else {
                this.field3488.field7836 = new class247(this.field3505 * 2);
            }
            int var9 = 0;
            class247 var10 = this.field3488.field7836;
            if (this.field3488.field7842) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field2697 * var11 - -arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field3479[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    ++var9;
                                    var10.method1027(255, 65535 & var14[var15]);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field2697 * var16 - -arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][var16 - arg4]) {
                            short[] var20 = this.field3479[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    var10.method1057(var20[var21] & 65535, (byte) 85);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class172 var17 = new class172(this.field3488, 5123, var10.field2146, var10.field2177);
                this.field3488.method3170(0, 39, 4, var9, var17);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V", line = 406)
    public final void method583(int arg0, int arg1) {
        ++field3511;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lte;IIII[[I[[II)V", line = 415)
    public class244(class527 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3488 = arg0;
        this.field3475 = arg5;
        this.field3492 = super.field2695 + -2;
        this.field3500 = new int[arg3][arg4][];
        this.field3482 = new byte[arg3][arg4];
        this.field3494 = new class449[arg3][arg4][];
        this.field3504 = 1 << this.field3492;
        this.field3525 = new byte[arg3 + 1][arg4 + 1];
        this.field3479 = new short[arg3 * arg4][];
        this.field3514 = new float[super.field2697 + 1][super.field2693 + 1];
        this.field3484 = new int[arg3][arg4][];
        this.field3512 = new int[arg3][arg4][];
        this.field3517 = new float[super.field2697 + 1][super.field2693 - -1];
        this.field3490 = arg2;
        this.field3480 = new int[arg3][arg4][];
        this.field3520 = new float[super.field2697 + 1][super.field2693 - -1];
        this.field3506 = new int[arg3][arg4][];
        for (int var9 = 1; ~super.field2693 < ~var9; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field2697; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field3517[var10][var9] = (float) var11 * var13;
                this.field3514[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3520[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3516 = new class465(128);
        if (~(16 & this.field3490) != -1) {
            this.field3478 = new class317(this.field3488, this);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III[[ZZ)V", line = 474)
    public final void method1230(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field3496;
        this.method1544(-1, arg2, arg1, arg4, 127, arg3, arg0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)B", line = 487)
    public static final byte method1546(int arg0, int arg1, byte arg2) {
        ++field3483;
        if (arg2 <= 10) {
            return 127;
        } else if (~arg0 != -10) {
            return 0;
        } else {
            return (byte) ((arg1 & 1) != 0 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 505)
    public static void method1547(byte arg0) {
        if (arg0 < 92) {
            method1547((byte) 69);
        }
        field3486 = null;
        field3509 = null;
    }

    @OriginalMember(owner = "client!sb", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 517)
    public final void method1234(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field3497;
        if (arg3 != null && this.field3506 == null) {
            this.field3506 = new int[super.field2697][super.field2693][];
        }
        if (arg5 != null && this.field3476 == null) {
            this.field3476 = new int[super.field2697][super.field2693][];
        }
        this.field3512[arg0][arg1] = arg2;
        this.field3484[arg0][arg1] = arg4;
        this.field3500[arg0][arg1] = arg6;
        this.field3480[arg0][arg1] = arg7;
        if (this.field3476 != null) {
            this.field3476[arg0][arg1] = arg5;
        }
        if (this.field3506 != null) {
            this.field3506[arg0][arg1] = arg3;
        }
        class449[] var15 = this.field3494[arg0][arg1] = new class449[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
            class417 var19;
            for (var19 = this.field3516.method2799(var17, true); var19 != null; var19 = this.field3516.method2801(-74)) {
                class449 var20 = (class449) var19;
                if (arg8[var16] == var20.field6284 && (float) arg9[var16] == var20.field6288 && ~var20.field6291 == ~arg10 && ~var20.field6299 == ~arg11 && ~var20.field6282 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class449) var19;
            } else {
                var15[var16] = new class449(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3516.method2797(-4234, var15[var16], var17);
            }
        }
        if (arg13) {
            this.field3482[arg0][arg1] = (byte) class473.method2847(this.field3482[arg0][arg1], 1);
        }
        if (arg6.length > this.field3524) {
            this.field3524 = arg6.length;
        }
        this.field3523 += arg6.length;
    }

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "(III)V", line = 587)
    public final void method1238(int arg0, int arg1, int arg2) {
        if ((255 & this.field3525[arg0][arg1]) < arg2) {
            this.field3525[arg0][arg1] = (byte) arg2;
        }
        ++field3495;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILfa;II)V", line = 598)
    private final void method1548(int arg0, class198 arg1, int arg2, int arg3) {
        ++field3477;
        int[] var5 = this.field3512[arg0][arg2];
        int[] var6 = this.field3484[arg0][arg2];
        int var7 = var5.length;
        if (this.field3488.field7887.length < var7) {
            this.field3488.field7887 = new int[var7];
            this.field3488.field7890 = new int[var7];
        }
        int[] var8 = this.field3488.field7887;
        int[] var9 = this.field3488.field7890;
        for (int var10 = 0; var7 > var10; ++var10) {
            var8[var10] = var5[var10] >> this.field3488.field7742;
            var9[var10] = var6[var10] >> this.field3488.field7742;
        }
        int var11 = 94 % ((arg3 - 13) / 51);
        int var12 = 0;
        while (~var12 > ~var7) {
            int var13 = var8[var12];
            int var14 = var9[var12++];
            int var15 = var8[var12];
            int var16 = var9[var12++];
            int var17 = var8[var12];
            int var18 = var9[var12++];
            if ((var13 - var15) * (-var18 + var16) + -((-var14 + var16) * (-var15 + var17)) > 0) {
                arg1.method1329(var18, var16, var17, (byte) -26, var13, var15, var14);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "()V", line = 667)
    public final void method1237() {
        if (~this.field3523 >= -1) {
            this.field3478 = null;
        } else {
            byte[][] var1 = new byte[super.field2697 + 1][super.field2693 + 1];
            for (int var2 = 1; super.field2697 > var2; ++var2) {
                for (int var103 = 1; super.field2693 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field3525[var2][var103 + 1] >> 3) + (this.field3525[var2][var103 - 1] >> 2) + (this.field3525[var2 - 1][var103] >> 2) + (this.field3525[var2 + 1][var103] >> 3) + (this.field3525[var2][var103] >> 1));
                }
            }
            this.field3518 = new class449[this.field3516.method2803(0)];
            this.field3516.method2804(false, this.field3518);
            for (int var3 = 0; ~this.field3518.length < ~var3; ++var3) {
                this.field3518[var3].method2720(this.field3523, 4);
            }
            int var4 = 24;
            if (this.field3476 != null) {
                var4 += 4;
            }
            if (~(this.field3490 & 7) != -1) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field3488.field7744.method3440(this.field3523 * var4, false);
            Stream var6 = new Stream(var5);
            class449[] var7 = new class449[this.field3523];
            int var8 = class496.method2959(this.field3523 / 4, -123);
            if (var8 < 1) {
                var8 = 1;
            }
            class465 var9 = new class465(var8);
            class449[] var10 = new class449[this.field3524];
            for (int var11 = 0; ~super.field2697 < ~var11; ++var11) {
                for (int var30 = 0; ~super.field2693 < ~var30; ++var30) {
                    if (this.field3500[var11][var30] != null) {
                        class449[] var31 = this.field3494[var11][var30];
                        int[] var32 = this.field3512[var11][var30];
                        int[] var33 = this.field3484[var11][var30];
                        int[] var34 = this.field3480[var11][var30];
                        int[] var35 = this.field3500[var11][var30];
                        int[] var36 = this.field3506 != null ? this.field3506[var11][var30] : null;
                        int[] var37 = this.field3476 == null ? null : this.field3476[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field3517[var11][var30];
                        float var39 = this.field3514[var11][var30];
                        float var40 = this.field3520[var11][var30];
                        float var41 = this.field3517[var11][var30 + 1];
                        float var42 = this.field3514[var11][var30 + 1];
                        float var43 = this.field3520[var11][var30 + 1];
                        float var44 = this.field3517[var11 + 1][var30 + 1];
                        float var45 = this.field3514[var11 - -1][var30 + 1];
                        float var46 = this.field3520[var11 + 1][var30 + 1];
                        float var47 = this.field3517[var11 - -1][var30];
                        float var48 = this.field3514[var11 + 1][var30];
                        float var49 = this.field3520[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = 255 & var1[var11 - -1][var30 - -1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label338: for (int var55 = 0; var35.length > var55; ++var55) {
                            class449 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field3479[super.field2697 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field2695) - -var32[var57];
                            int var59 = (var30 << super.field2695) + var33[var57];
                            int var60 = var58 >> this.field3492;
                            int var61 = var59 >> this.field3492;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var62 << 32 | (long) var63 << 48;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            float var72;
                            float var73;
                            int var74;
                            if (~var67 == -1 && ~var68 == -1) {
                                var71 = var38;
                                var72 = var40;
                                var73 = var39;
                                var74 = var69 - var50;
                            } else if (~var67 == -1 && ~super.field2694 == ~var68) {
                                var74 = var69 - var51;
                                var71 = var41;
                                var73 = var42;
                                var72 = var43;
                            } else if (super.field2694 == var67 && super.field2694 == var68) {
                                var72 = var46;
                                var74 = var69 - var52;
                                var73 = var45;
                                var71 = var44;
                            } else if (~super.field2694 == ~var67 && ~var68 == -1) {
                                var71 = var47;
                                var74 = var69 - var53;
                                var72 = var49;
                                var73 = var48;
                            } else {
                                float var75 = (float) var67 / (float) super.field2694;
                                float var76 = (float) var68 / (float) super.field2694;
                                float var77 = (-var38 + var47) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (var49 - var40) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (-var42 + var45) * var75 + var42;
                                float var82 = (var46 - var43) * var75 + var43;
                                var71 = (-var77 + var80) * var76 + var77;
                                var73 = (var81 - var78) * var76 + var78;
                                var72 = (-var79 + var82) * var76 + var79;
                                int var83 = ((var53 - var50) * var67 >> super.field2695) + var50;
                                int var84 = ((-var51 + var52) * var67 >> super.field2695) + var51;
                                var74 = var69 - (((-var83 + var84) * var68 >> super.field2695) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var74 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                if ((7 & this.field3490) == 0) {
                                    float var87 = this.field3488.field7800[2] * var72 + this.field3488.field7800[1] * var73 + this.field3488.field7800[0] * var71;
                                    var85 = this.field3488.field7778 + (!(var87 > 0.0F) ? this.field3488.field7882 : this.field3488.field7849) * var87;
                                }
                                var70 = class60.field758[65408 & var62 | var86];
                            }
                            class417 var88 = null;
                            if (~(var58 & this.field3504 + -1) == -1 && ~(this.field3504 + -1 & var59) == -1) {
                                var88 = var9.method2799(var65, true);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (var62 != var63) {
                                    int var89 = (127 & var63) * var74 >> 7;
                                    if (~var89 <= -3) {
                                        if (var89 > 126) {
                                            var89 = 126;
                                        }
                                    } else {
                                        var89 = 2;
                                    }
                                    var90 = class60.field758[var63 & 65408 | var89];
                                    if ((this.field3490 & 7) == 0) {
                                        float var91 = this.field3488.field7800[2] * var72 + this.field3488.field7800[1] * var73 + this.field3488.field7800[0] * var71;
                                        float var92 = var85 * (!(var85 > 0.0F) ? this.field3488.field7882 : this.field3488.field7849) + this.field3488.field7778;
                                        int var93 = (var90 & 16729153) >> 16;
                                        int var94 = var90 >> 8 & 255;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = 255 & var90;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (~var95 <= -1) {
                                            if (var95 > 255) {
                                                var95 = 255;
                                            }
                                        } else {
                                            var95 = 0;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (~var98 < -256) {
                                            var98 = 255;
                                        }
                                        var90 = var98 | var95 << 16 | var97 << 8;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (this.field3488.field7842) {
                                    var6.method3446((float) var58);
                                    var6.method3446((float) (var64 + this.method1233(var58, var59)));
                                    var6.method3446((float) var59);
                                    var6.method3445((byte) (var90 >> 16));
                                    var6.method3445((byte) (var90 >> 8));
                                    var6.method3445((byte) var90);
                                    var6.method3445(-1);
                                    var6.method3446((float) var58);
                                    var6.method3446((float) var59);
                                    if (this.field3476 != null) {
                                        var6.method3446((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((this.field3490 & 7) != 0) {
                                        var6.method3446(var71);
                                        var6.method3446(var73);
                                        var6.method3446(var72);
                                    }
                                } else {
                                    var6.method3453((float) var58);
                                    var6.method3453((float) (this.method1233(var58, var59) + var64));
                                    var6.method3453((float) var59);
                                    var6.method3445((byte) (var90 >> 16));
                                    var6.method3445((byte) (var90 >> 8));
                                    var6.method3445((byte) var90);
                                    var6.method3445(-1);
                                    var6.method3453((float) var58);
                                    var6.method3453((float) var59);
                                    if (this.field3476 != null) {
                                        var6.method3453((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((this.field3490 & 7) != 0) {
                                        var6.method3453(var71);
                                        var6.method3453(var73);
                                        var6.method3453(var72);
                                    }
                                }
                                var99 = this.field3503++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2797(-4234, new class207(var56[var57]), var65);
                            } else {
                                var56[var57] = ((class207) var88).field3076;
                                var99 = var56[var57] & 65535;
                                if (var62 != -1 && var31[var57].field5651 < var7[var99].field5651) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method2713(24180, var74, var85, var70, var99);
                            }
                            ++this.field3505;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field3503; ++var12) {
                class449 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2715(var12, 4);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field2697; ++var13) {
                for (int var18 = 0; ~super.field2693 < ~var18; ++var18) {
                    short[] var19 = this.field3479[super.field2697 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class449 var25 = var7[var22];
                            class449 var26 = var7[var23];
                            class449 var27 = var7[var24];
                            class449 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method2716(89, var18, var20, var13);
                            }
                            if (var26 != null) {
                                var26.method2716(52, var18, var20, var13);
                                if (var28 == null || ~var26.field5651 > ~var28.field5651) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2716(45, var18, var20, var13);
                                if (var28 == null || var27.field5651 < var28.field5651) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2715(var22, 4);
                                }
                                if (var26 != null) {
                                    var28.method2715(var23, 4);
                                }
                                if (var27 != null) {
                                    var28.method2715(var24, 4);
                                }
                                var28.method2716(27, var18, var20, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3448();
            this.field3519 = this.field3488.method3172(var6.method3442(), false, var4, false, var5);
            this.field3513 = new class403(this.field3519, 5126, 3, 0);
            this.field3515 = new class403(this.field3519, 5121, 4, 12);
            byte var14;
            if (this.field3476 != null) {
                var14 = 28;
                this.field3521 = new class403(this.field3519, 5126, 3, 16);
            } else {
                this.field3521 = new class403(this.field3519, 5126, 2, 16);
                var14 = 24;
            }
            if (~(this.field3490 & 7) != -1) {
                this.field3522 = new class403(this.field3519, 5126, 3, var14);
            }
            long[] var15 = new long[this.field3518.length];
            for (int var16 = 0; var16 < this.field3518.length; ++var16) {
                class449 var17 = this.field3518[var16];
                var15[var16] = var17.field5651;
                var17.method2719(109, this.field3503);
            }
            class39.method250(104, var15, this.field3518);
            if (this.field3478 != null) {
                this.field3478.method1915((byte) -95);
            }
        }
        ++field3493;
        this.field3516 = null;
        this.field3517 = this.field3514 = this.field3520 = null;
        this.field3500 = null;
        this.field3525 = null;
        this.field3506 = null;
        this.field3494 = null;
        this.field3480 = null;
        this.field3476 = null;
        this.field3512 = this.field3484 = null;
    }

    @OriginalMember(owner = "client!sb", name = "ya", descriptor = "(Lk;IIIIZ)V", line = 1245)
    public final void method1241(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3489;
        if (this.field3478 != null && arg0 != null) {
            int var7 = arg1 - (this.field3488.field7871 * arg2 >> 8) >> this.field3488.field7742;
            int var8 = -(this.field3488.field7867 * arg2 >> 8) + arg3 >> this.field3488.field7742;
            this.field3478.method1921(var8, arg0, (byte) -36, var7);
        }
    }

    @OriginalMember(owner = "client!sb", name = "aa", descriptor = "(II)I", line = 1265)
    public final int method1233(int arg0, int arg1) {
        ++field3491;
        int var3 = arg0 >> super.field2695;
        int var4 = arg1 >> super.field2695;
        if (~var3 <= -1 && var4 >= 0 && var3 <= super.field2697 - 1 && super.field2693 + -1 >= var4) {
            int var5 = arg0 & super.field2694 - 1;
            int var6 = super.field2694 + -1 & arg1;
            int var7 = (-var5 + super.field2694) * this.field3475[var3][var4] + this.field3475[var3 + 1][var4] * var5 >> super.field2695;
            int var8 = (-var5 + super.field2694) * this.field3475[var3][var4 + 1] + this.field3475[var3 + 1][var4 + 1] * var5 >> super.field2695;
            return (-var6 + super.field2694) * var7 - -(var6 * var8) >> super.field2695;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "ba", descriptor = "(II)I", line = 1290)
    public final int method1239(int arg0, int arg1) {
        ++field3510;
        return this.field3475[arg0][arg1];
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1303)
    public final void method1235(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3507;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var18 > var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1234(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "(Lk;IIIIZ)V", line = 1394)
    public final void method1232(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3502;
        if (this.field3478 != null && arg0 != null) {
            int var7 = -(this.field3488.field7871 * arg2 >> 8) + arg1 >> this.field3488.field7742;
            int var8 = -(this.field3488.field7867 * arg2 >> 8) + arg3 >> this.field3488.field7742;
            this.field3478.method1916(var7, var8, arg0, -119);
        }
    }
}
