import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class568 extends class140 {

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "F")
    private float field7109 = -3.4028235E38F;

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "F")
    private float field7135 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "Lws;")
    private class333 field7131 = new class333();

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "[[I")
    private int[][] field7130;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "Lkea;")
    public class223 field7120;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    private int field7105;

    @OriginalMember(owner = "client!iq", name = "E", descriptor = "I")
    private int field7129;

    @OriginalMember(owner = "client!iq", name = "bb", descriptor = "[[F")
    private float[][] field7152;

    @OriginalMember(owner = "client!iq", name = "W", descriptor = "[[F")
    private float[][] field7147;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "[[[Lfr;")
    private class382[][][] field7112;

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "[[[I")
    private int[][][] field7139;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "[[[I")
    public int[][][] field7128;

    @OriginalMember(owner = "client!iq", name = "ab", descriptor = "[[F")
    private float[][] field7151;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "[[[I")
    public int[][][] field7127;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "[[S")
    public short[][] field7119;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "[[B")
    private byte[][] field7121;

    @OriginalMember(owner = "client!iq", name = "R", descriptor = "[[B")
    private byte[][] field7142;

    @OriginalMember(owner = "client!iq", name = "L", descriptor = "[[[I")
    public int[][][] field7136;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public int field7116;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "[[[I")
    private int[][][] field7132;

    @OriginalMember(owner = "client!iq", name = "U", descriptor = "Lhd;")
    private class694 field7145;

    @OriginalMember(owner = "client!iq", name = "Q", descriptor = "Lo;")
    private class28 field7141;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    private int field7124;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    private int field7125;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!iq", name = "T", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!iq", name = "X", descriptor = "I")
    private int field7148;

    @OriginalMember(owner = "client!iq", name = "cb", descriptor = "I")
    private int field7153;

    @OriginalMember(owner = "client!iq", name = "S", descriptor = "Lbf;")
    public class502 field7143;

    @OriginalMember(owner = "client!iq", name = "V", descriptor = "Lii;")
    private class519 field7146;

    @OriginalMember(owner = "client!iq", name = "Z", descriptor = "Lii;")
    private class519 field7150;

    @OriginalMember(owner = "client!iq", name = "Y", descriptor = "[Lfr;")
    private class382[] field7149;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "[[[I")
    private int[][][] field7113;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(IILw;)Lw;")
    public final class279 method199(int arg0, int arg1, class279 arg2) {
        ++field7137;
        if ((this.field7121[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field1686 >> this.field7120.field2833;
            class670 var5 = (class670) arg2;
            class670 var6;
            if (var5 != null && var5.method3718(var4, var4, -102)) {
                var6 = var5;
                var5.method3721(-1);
            } else {
                var6 = new class670(this.field7120, var4, var4);
            }
            var6.method3719(0, var4, var4, -11, 0);
            this.method3009(11939, var6, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V")
    public final void method186(int arg0, int arg1) {
        ++field7110;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILpca;II)V")
    private final void method3009(int arg0, class670 arg1, int arg2, int arg3) {
        ++field7140;
        int[] var5 = this.field7136[arg2][arg3];
        int[] var6 = this.field7127[arg2][arg3];
        int var7 = var5.length;
        if (var7 > class67.field816.length) {
            class67.field816 = new int[var7];
            class666.field9046 = new int[var7];
        }
        for (int var8 = 0; var8 < var7; ++var8) {
            class67.field816[var8] = var5[var8] >> this.field7120.field2833;
            class666.field9046[var8] = var6[var8] >> this.field7120.field2833;
        }
        if (arg0 == 11939) {
            int var9 = 0;
            while (var7 > var9) {
                int var10 = class67.field816[var9];
                int var11 = class666.field9046[var9++];
                int var12 = class67.field816[var9];
                int var13 = class666.field9046[var9++];
                int var14 = class67.field816[var9];
                int var15 = class666.field9046[var9++];
                if (~((var13 - var15) * (-var12 + var10) + -((var13 - var11) * (var14 - var12))) < -1) {
                    arg1.method3717(var14, var13, var15, var11, var10, false, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lbj;[I)V")
    public final void method198(class227 arg0, int[] arg1) {
        this.field7131.method1904(new class627(this.field7120, this, arg0, arg1), -26);
        ++field7134;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7133;
        if (~this.field7153 < -1) {
            class13 var9 = this.field7120.method1293(20932, this.field7124);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method62(true, true);
                if (var14 != null) {
                    Stream var15 = this.field7120.method1289(116, var14);
                    if (Stream.method3525()) {
                        for (int var16 = arg4; var16 < arg6; ++var16) {
                            int var17 = super.field1685 * var16 + arg3;
                            for (int var18 = arg3; ~arg5 < ~var18; ++var18) {
                                if (arg7[var18 - arg3][var16 - arg4]) {
                                    short[] var19 = this.field7119[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                            var15.method3526(var21);
                                            if (var21 > var12) {
                                                var12 = var21;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; var22 < arg6; ++var22) {
                            int var25 = super.field1685 * var22 + arg3;
                            for (int var26 = arg3; ~arg5 < ~var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field7119[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var28 < var27.length; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            if (var11 > var29) {
                                                var11 = var29;
                                            }
                                            ++var10;
                                            var15.method3519(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3530();
                    if (var9.method61((byte) 96)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field7120.method1292((byte) -4);
                this.field7120.method1302(false, false);
                this.field7120.method1294(false, -29852);
                this.field7120.method1343(-32, false);
                this.field7120.method1272(false, (byte) -11);
                this.field7120.method1321(-85, 0);
                this.field7120.method1312(false, 0, -2, false);
                this.field7120.method1349((class562) null, false);
                class581 var23 = this.field7120.method1329(1);
                float[] var24 = this.field7120.method1326((byte) -123);
                var24[3] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field7120.field2602;
                var24[7] = 0.0F;
                var24[10] = 1.0F / (this.field7109 - this.field7135);
                var24[5] = (float) arg2 / ((float) super.field1686 * 128.0F * (float) this.field7120.field2751);
                var24[0] = (float) arg2 / ((float) super.field1686 * 128.0F * (float) this.field7120.field2602);
                var24[11] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7120.field2751;
                var24[6] = 0.0F;
                var24[2] = 0.0F;
                var24[4] = 0.0F;
                var24[15] = 1.0F;
                var24[1] = 0.0F;
                var24[9] = 0.0F;
                var24[8] = 0.0F;
                var24[14] = -this.field7135 / (this.field7109 - this.field7135);
                var23.method3210(16383, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
                this.field7120.method1351(5);
                this.field7120.method1348(103);
                if ((7 & this.field7116) == 0) {
                    this.field7120.method1294(false, -29852);
                } else {
                    this.field7120.method1294(true, -29852);
                    this.field7120.method333((byte) -7);
                }
                this.field7120.method366(false, (byte) -123);
                this.field7120.method363(-74, 0, this.field7146);
                this.field7120.method363(-97, 1, this.field7150);
                this.field7120.method344(28303, this.field7143);
                this.field7120.method375(0, (byte) 16, var11, var12 - var11 + 1, var10 / 3, class701.field9803, var9);
                this.field7120.method366(true, (byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method203(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7111;
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
        for (int var28 = 0; var28 < var18; ++var28) {
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
        this.method196(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!iq", name = "sa", descriptor = "(II)I")
    public final int method194(int arg0, int arg1) {
        ++field7106;
        int var3 = arg0 >> super.field1683;
        int var4 = arg1 >> super.field1683;
        if (~var3 <= -1 && var4 >= 0 && super.field1685 + -1 >= var3 && var4 <= super.field1684 + -1) {
            int var5 = arg0 & super.field1686 + -1;
            int var6 = arg1 & super.field1686 + -1;
            int var7 = (-var5 + super.field1686) * this.field7130[var3][var4] + this.field7130[var3 - -1][var4] * var5 >> super.field1683;
            int var8 = (-var5 + super.field1686) * this.field7130[var3][var4 + 1] + this.field7130[var3 + 1][var4 + 1] * var5 >> super.field1683;
            return (-var6 + super.field1686) * var7 + var6 * var8 >> super.field1683;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILpp;BILqf;)V")
    public static final void method3010(int arg0, class365 arg1, byte arg2, int arg3, class638 arg4) {
        ++field7126;
        if ((8 & arg0) != 0) {
            int var5 = arg4.method3096(-85);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = arg4.method3064(arg2 + -2031091583);
            int var7 = arg4.method3068((byte) -128);
            arg1.method216(var7, var6, 0, var5, false);
        }
        byte var8 = -1;
        if (~(4096 & arg0) != -1) {
            int var9 = arg4.method3096(-34);
            arg1.field500 = arg4.method3097((byte) 12);
            arg1.field421 = arg4.method3063(0);
            arg1.field486 = ~(32768 & var9) != -1;
            arg1.field459 = var9 & 32767;
            arg1.field479 = class665.field9027 + arg1.field459 + arg1.field500;
        }
        if (arg2 != 119) {
            method3010(-48, (class365) null, (byte) 78, -126, (class638) null);
        }
        if ((arg0 & 65536) != 0) {
            arg1.field423 = arg4.method3087(66);
            arg1.field412 = arg4.method3095(arg2 + -119);
            arg1.field419 = arg4.method3087(107);
            arg1.field416 = (byte) arg4.method3076((byte) 90);
            arg1.field493 = class665.field9027 + arg4.method3054(-2);
            arg1.field439 = class665.field9027 - -arg4.method3084((byte) 91);
        }
        if (~(1 & arg0) != -1) {
            int[] var10 = new int[4];
            for (int var11 = 0; var11 < 4; ++var11) {
                var10[var11] = arg4.method3054(-2);
                if (var10[var11] == 65535) {
                    var10[var11] = -1;
                }
            }
            int var12 = arg4.method3076((byte) 92);
            class467.method2546(arg1, var10, var12, 0);
        }
        if ((arg0 & 16) != 0) {
            int var13 = arg4.method3063(arg2 ^ 119);
            byte[] var14 = new byte[var13];
            class572 var15 = new class572(var14);
            arg4.method3093(65280, var14, 0, var13);
            class171.field2000[arg3] = var15;
            arg1.method2122(arg2 ^ -120, var15);
        }
        if (~(arg0 & 128) != -1) {
            arg1.field4713 = arg4.method3054(-2);
            if (arg1.field503 == 0) {
                arg1.method228(33, arg1.field4713);
                arg1.field4713 = -1;
            }
        }
        if (~(2048 & arg0) != -1) {
            int var16 = arg4.method3031(-1);
            int var17 = arg4.method3048((byte) 43);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var18 = arg4.method3063(0);
            arg1.method216(var18, var17, arg2 + -119, var16, true);
        }
        if ((arg0 & 32768) != 0) {
            arg1.field456 = arg4.method3083(255);
            arg1.field449 = arg4.method3083(255);
            arg1.field437 = arg4.method3087(40);
            arg1.field410 = arg4.method3083(arg2 ^ 136);
            arg1.field470 = arg4.method3084((byte) 76) - -class665.field9027;
            arg1.field445 = arg4.method3084((byte) 79) - -class665.field9027;
            arg1.field409 = arg4.method3076((byte) -123);
            if (!arg1.field4718) {
                arg1.field410 += arg1.field511[0];
                arg1.field456 += arg1.field508[0];
                arg1.field503 = 1;
                arg1.field449 += arg1.field511[0];
                arg1.field437 += arg1.field508[0];
            } else {
                arg1.field410 += arg1.field4688;
                arg1.field437 += arg1.field4698;
                arg1.field449 += arg1.field4688;
                arg1.field503 = 0;
                arg1.field456 += arg1.field4698;
            }
            arg1.field506 = 0;
        }
        if ((arg0 & 4) != 0) {
            int var19 = arg4.method3096(-30);
            if (~var19 == -65536) {
                var19 = -1;
            }
            arg1.field491 = var19;
        }
        if (~(arg0 & 8192) != -1) {
            arg1.field494 = arg4.method3072(255);
            if (arg1.field494.charAt(0) == '~') {
                arg1.field494 = arg1.field494.substring(1);
                class417.method2324(arg1.method2129(arg2 + -35, true), arg1.method2123((byte) -98, false), arg1.field4710, arg1.field494, 0, (byte) -95, 2);
            } else if (class67.field815 == arg1) {
                class417.method2324(arg1.method2129(99, true), arg1.method2123((byte) -98, false), arg1.field4710, arg1.field494, 0, (byte) -95, 2);
            }
            arg1.field461 = 0;
            arg1.field485 = 150;
            arg1.field453 = 0;
        }
        if (~(arg0 & 32) != -1) {
            class183.field2154[arg3] = arg4.method3083(255);
        }
        if ((arg0 & 512) != 0) {
            int var20 = arg4.method3076((byte) -44);
            int[] var21 = new int[var20];
            int[] var22 = new int[var20];
            int[] var23 = new int[var20];
            for (int var24 = 0; var20 > var24; ++var24) {
                int var25 = arg4.method3096(-50);
                if (var25 == 65535) {
                    var25 = -1;
                }
                var21[var24] = var25;
                var22[var24] = arg4.method3063(arg2 + -119);
                var23[var24] = arg4.method3031(-1);
            }
            class111.method770(var22, var21, var23, arg1, 1);
        }
        if ((131072 & arg0) != 0) {
            int var26 = class665.field9027;
            int var27 = arg4.method3033((byte) 91);
            int var28 = arg4.method3068((byte) -107);
            arg1.method225(var26, var28, (byte) 108, var27);
        }
        if (~(256 & arg0) != -1) {
            arg1.field4697 = ~arg4.method3076((byte) -125) == -2;
        }
        if (~(arg0 & 1024) != -1) {
            var8 = arg4.method3066(27382);
        }
        if (~(64 & arg0) != -1) {
            int var29 = arg4.method3033((byte) 91);
            int var30 = arg4.method3076((byte) 122);
            arg1.method225(class665.field9027, var30, (byte) 111, var29);
            arg1.field434 = class665.field9027 + 300;
            arg1.field427 = arg4.method3076((byte) 109);
        }
        if (arg1.field4718) {
            if (var8 == 127) {
                arg1.method2120(-39, arg1.field4698, arg1.field4688);
            } else {
                byte var31;
                if (~var8 != 0) {
                    var31 = var8;
                } else {
                    var31 = class183.field2154[arg3];
                }
                arg1.method2121(arg1.field4688, true, var31, arg1.field4698);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III[[ZZ)V")
    public final void method195(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method3011(-102, arg0, arg3, -1, arg1, arg4, arg2);
        ++field7122;
    }

    @OriginalMember(owner = "client!iq", name = "EA", descriptor = "(III)V")
    public final void method202(int arg0, int arg1, int arg2) {
        ++field7118;
        if ((this.field7142[arg0][arg1] & 255) < arg2) {
            this.field7142[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method187(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7123;
        if (this.field7141 != null && arg0 != null) {
            int var7 = -(this.field7120.field2828 * arg2 >> 8) + arg1 >> this.field7120.field2833;
            int var8 = -(this.field7120.field2784 * arg2 >> 8) + arg3 >> this.field7120.field2833;
            return this.field7141.method168(var8, var7, arg0, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "ba", descriptor = "()V")
    public final void method191() {
        if (~this.field7153 >= -1) {
            this.field7141 = null;
        } else {
            byte[][] var1 = new byte[super.field1685 + 1][super.field1684 + 1];
            for (int var2 = 1; var2 < super.field1685; ++var2) {
                for (int var107 = 1; super.field1684 > var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field7142[var2][var107] >> 1) + (this.field7142[var2][var107 + 1] >> 3) + (this.field7142[var2][var107 + -1] >> 2) + (this.field7142[var2 - 1][var107] >> 2) + (this.field7142[var2 + 1][var107] >> 3));
                }
            }
            class382[] var3 = new class382[this.field7145.method3833(0)];
            this.field7145.method3836(var3, (byte) -113);
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                var3[var4].method2203(65535, this.field7153);
            }
            int var5 = 20;
            if (this.field7113 != null) {
                var5 += 4;
            }
            if ((7 & this.field7116) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7120.field2652.method3516(this.field7153 * 4, false);
            NativeHeapBuffer var7 = this.field7120.field2652.method3516(this.field7153 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class382[] var10 = new class382[this.field7153];
            int var11 = class217.method1256((byte) -64, this.field7153 / 4);
            if (var11 < 1) {
                var11 = 1;
            }
            class694 var12 = new class694(var11);
            class382[] var13 = new class382[this.field7148];
            for (int var14 = 0; super.field1685 > var14; ++var14) {
                for (int var34 = 0; ~super.field1684 < ~var34; ++var34) {
                    if (this.field7128[var14][var34] != null) {
                        class382[] var35 = this.field7112[var14][var34];
                        int[] var36 = this.field7136[var14][var34];
                        int[] var37 = this.field7127[var14][var34];
                        int[] var38 = this.field7132[var14][var34];
                        int[] var39 = this.field7128[var14][var34];
                        int[] var40 = this.field7139 == null ? null : this.field7139[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field7113 == null ? null : this.field7113[var14][var34];
                        float var42 = this.field7152[var14][var34];
                        float var43 = this.field7151[var14][var34];
                        float var44 = this.field7147[var14][var34];
                        float var45 = this.field7152[var14][var34 + 1];
                        float var46 = this.field7151[var14][var34 + 1];
                        float var47 = this.field7147[var14][var34 + 1];
                        float var48 = this.field7152[var14 + 1][var34 + 1];
                        float var49 = this.field7151[var14 + 1][var34 - -1];
                        float var50 = this.field7147[var14 + 1][var34 + 1];
                        float var51 = this.field7152[var14 - -1][var34];
                        float var52 = this.field7151[var14 - -1][var34];
                        float var53 = this.field7147[var14 - -1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = 255 & var1[var14][var34 - -1];
                        int var56 = 255 & var1[var14 + 1][var34 + 1];
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label359: for (int var59 = 0; var59 < var39.length; ++var59) {
                            class382 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field7119[super.field1685 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field1683) + var36[var61];
                            int var63 = (var34 << super.field1683) + var37[var61];
                            int var64 = var62 >> this.field7105;
                            int var65 = var63 >> this.field7105;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            float var77;
                            int var78;
                            float var79;
                            if (~var71 == -1 && ~var72 == -1) {
                                var76 = var42;
                                var77 = var43;
                                var78 = var73 - var54;
                                var79 = var44;
                            } else if (~var71 == -1 && super.field1686 == var72) {
                                var79 = var47;
                                var77 = var46;
                                var76 = var45;
                                var78 = var73 - var55;
                            } else if (super.field1686 == var71 && ~super.field1686 == ~var72) {
                                var79 = var50;
                                var78 = var73 - var56;
                                var76 = var48;
                                var77 = var49;
                            } else if (~super.field1686 == ~var71 && var72 == 0) {
                                var76 = var51;
                                var79 = var53;
                                var77 = var52;
                                var78 = var73 - var57;
                            } else {
                                float var80 = (float) var71 / (float) super.field1686;
                                float var81 = (float) var72 / (float) super.field1686;
                                float var82 = (-var42 + var51) * var80 + var42;
                                float var83 = (var52 - var43) * var80 + var43;
                                float var84 = (-var44 + var53) * var80 + var44;
                                float var85 = (var48 - var45) * var80 + var45;
                                float var86 = (var49 - var46) * var80 + var46;
                                var77 = (var86 - var83) * var81 + var83;
                                var76 = (var85 - var82) * var81 + var82;
                                float var87 = (-var47 + var50) * var80 + var47;
                                var79 = (-var84 + var87) * var81 + var84;
                                int var88 = ((-var54 + var57) * var71 >> super.field1683) + var54;
                                int var89 = ((-var55 + var56) * var71 >> super.field1683) + var55;
                                var78 = var73 - (((-var88 + var89) * var72 >> super.field1683) + var88);
                            }
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var78 >> 7;
                                if (~var90 <= -3) {
                                    if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                if ((7 & this.field7116) == 0) {
                                    float var91 = this.field7120.field2816[2] * var79 + this.field7120.field2816[0] * var76 + this.field7120.field2816[1] * var77;
                                    var75 = (!(var91 > 0.0F) ? this.field7120.field2824 : this.field7120.field2785) * var91 + this.field7120.field2815;
                                }
                                var74 = class76.field999[var90 | 65408 & var66];
                            }
                            class263 var92 = null;
                            if (~(var62 & this.field7129 + -1) == -1 && (this.field7129 + -1 & var63) == 0) {
                                var92 = var12.method3828(var69, (byte) -91);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class517) var92).field6544;
                                var93 = 65535 & var60[var61];
                                if (~var66 != 0 && ~var10[var93].field3321 < ~var35[var61].field3321) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var95;
                                if (var66 != var67) {
                                    int var94 = (127 & var67) * var78 >> 7;
                                    if (var94 >= 2) {
                                        if (~var94 < -127) {
                                            var94 = 126;
                                        }
                                    } else {
                                        var94 = 2;
                                    }
                                    var95 = class76.field999[65408 & var67 | var94];
                                    if (~(7 & this.field7116) == -1) {
                                        float var96 = this.field7120.field2816[2] * var79 + this.field7120.field2816[1] * var77 + this.field7120.field2816[0] * var76;
                                        float var97 = this.field7120.field2815 + (!(var75 > 0.0F) ? this.field7120.field2824 : this.field7120.field2785) * var75;
                                        int var98 = var95 >> 16 & 255;
                                        int var99 = (65505 & var95) >> 8;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = var95 & 255;
                                        int var102 = (int) ((float) var99 * var97);
                                        if (var100 >= 0) {
                                            if (var100 > 255) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (var102 > 255) {
                                            var102 = 255;
                                        }
                                        int var103 = (int) ((float) var101 * var97);
                                        if (~var103 > -1) {
                                            var103 = 0;
                                        } else if (~var103 < -256) {
                                            var103 = 255;
                                        }
                                        var95 = var103 | var102 << 8 | var100 << 16;
                                    }
                                } else {
                                    var95 = var74;
                                }
                                if (Stream.method3525()) {
                                    var8.method3517((float) var62);
                                    var8.method3517((float) (this.method194(var62, var63) + var68));
                                    var8.method3517((float) var63);
                                    var8.method3517((float) var62);
                                    var8.method3517((float) var63);
                                    if (this.field7113 != null) {
                                        var8.method3517((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((this.field7116 & 7) != 0) {
                                        var8.method3517(var76);
                                        var8.method3517(var77);
                                        var8.method3517(var79);
                                    }
                                } else {
                                    var8.method3527((float) var62);
                                    var8.method3527((float) (var68 + this.method194(var62, var63)));
                                    var8.method3527((float) var63);
                                    var8.method3527((float) var62);
                                    var8.method3527((float) var63);
                                    if (this.field7113 != null) {
                                        var8.method3527((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((7 & this.field7116) != 0) {
                                        var8.method3527(var76);
                                        var8.method3527(var77);
                                        var8.method3527(var79);
                                    }
                                }
                                if (~this.field7120.field2856 != -1) {
                                    var9.method3531(var95 | -16777216);
                                } else {
                                    var9.method3528(var95 | -16777216);
                                }
                                var93 = this.field7125++;
                                var60[var61] = (short) var93;
                                if (var66 != -1) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method3832(new class517(var60[var61]), var69, 104);
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method2201(var75, var78, var93, 0, var74);
                            }
                            ++this.field7124;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field7125 > var15; ++var15) {
                class382 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2200(var15, 26340);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field1685; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field1684; ++var22) {
                    short[] var23 = this.field7119[super.field1685 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var23.length < ~var25) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = 65535 & var23[var25++];
                            int var28 = 65535 & var23[var25++];
                            class382 var29 = var10[var26];
                            class382 var30 = var10[var27];
                            class382 var31 = var10[var28];
                            class382 var32 = null;
                            if (var29 != null) {
                                var29.method2198(var16, -14251, var24, var22);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method2198(var16, -14251, var24, var22);
                                if (var32 == null || var30.field3321 < var32.field3321) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2198(var16, -14251, var24, var22);
                                if (var32 == null || var31.field3321 < var32.field3321) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2200(var26, 26340);
                                }
                                if (var30 != null) {
                                    var32.method2200(var27, 26340);
                                }
                                if (var31 != null) {
                                    var32.method2200(var28, 26340);
                                }
                                var32.method2198(var16, -14251, var24, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3530();
            var9.method3530();
            this.field7150 = this.field7120.method341(106, false);
            this.field7150.method2813(-81, var6, 4, this.field7125 * 4);
            this.field7146 = this.field7120.method341(112, false);
            this.field7146.method2813(-48, var7, var5, this.field7125 * var5);
            if (~(this.field7116 & 7) == -1) {
                if (this.field7113 != null) {
                    this.field7143 = this.field7120.method350(new class192[] { new class192(new class133[] { class133.field1606, class133.field1619, class133.field1618 }), new class192(class133.field1617) }, (byte) -121);
                } else {
                    this.field7143 = this.field7120.method350(new class192[] { new class192(new class133[] { class133.field1606, class133.field1619 }), new class192(class133.field1617) }, (byte) -120);
                }
            } else if (this.field7113 != null) {
                this.field7143 = this.field7120.method350(new class192[] { new class192(new class133[] { class133.field1606, class133.field1619, class133.field1618, class133.field1611 }), new class192(class133.field1617) }, (byte) -119);
            } else {
                this.field7143 = this.field7120.method350(new class192[] { new class192(new class133[] { class133.field1606, class133.field1619, class133.field1611 }), new class192(class133.field1617) }, (byte) -121);
            }
            int var17 = 0;
            for (int var18 = 0; var18 < var3.length; ++var18) {
                if (~var3[var18].field4912 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field7149 = new class382[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var17 > var20; ++var20) {
                class382 var21 = var3[var20];
                var19[var20] = var21.field3321;
                this.field7149[var20] = var21;
                var21.method2194(this.field7125, false);
            }
            class591.method3276(var19, this.field7149, (byte) 107);
            if (this.field7141 != null) {
                this.field7141.method172((byte) 121);
            }
        }
        ++field7115;
        this.field7132 = null;
        this.field7128 = null;
        this.field7152 = this.field7151 = this.field7147 = null;
        this.field7112 = null;
        this.field7139 = null;
        this.field7113 = null;
        this.field7136 = this.field7127 = null;
        this.field7145 = null;
        this.field7142 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II[[ZIIZI)V")
    private final void method3011(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (this.field7149 != null) {
            int var8 = arg6 + arg6 + 1;
            int var9 = var8 * var8;
            if (class512.field6427.length < var9) {
                class512.field6427 = new int[var9];
            }
            int var10 = -arg6 + arg1;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = arg4 - arg6;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg1 - -arg6;
            if (~var14 < ~(super.field1685 + -1)) {
                var14 = super.field1685 + -1;
            }
            int var15 = arg4 + arg6;
            class546.field6867 = 0;
            if (var15 > super.field1684 + -1) {
                var15 = super.field1684 + -1;
            }
            for (int var16 = var10; ~var14 <= ~var16; ++var16) {
                boolean[] var23 = arg2[-var11 + var16];
                for (int var24 = var12; var15 >= var24; ++var24) {
                    if (var23[-var13 + var24]) {
                        class512.field6427[class546.field6867++] = super.field1685 * var24 + var16;
                    }
                }
            }
            if (arg3 != -1) {
                this.field7120.method1279(-73, (float) arg3);
                this.field7120.method1316(-123);
            } else {
                this.field7120.method1347((byte) -8);
            }
            this.field7120.method1311(98);
            this.field7120.method1294(~(7 & this.field7116) != -1, -29852);
            this.field7120.method1312(false, 0, -1, false);
            this.field7120.method363(-93, 0, this.field7146);
            for (int var17 = 0; var17 < this.field7149.length; ++var17) {
                this.field7149[var17].method2196(class512.field6427, (byte) 69, class546.field6867);
            }
            class581 var18 = this.field7120.method1329(1);
            var18.method591(0, -1, 0);
            this.field7120.method1348(72);
            if (!this.field7131.method1908((byte) -86)) {
                int var19 = this.field7120.field2808;
                int var20 = this.field7120.field2837;
                this.field7120.method418(0, var20, this.field7120.field2829);
                this.field7120.method1294(false, -29852);
                this.field7120.method1272(false, (byte) -77);
                this.field7120.method1321(-101, 128);
                this.field7120.method1312(false, 0, -2, false);
                this.field7120.method1349(this.field7120.field2847, false);
                this.field7120.method1287(class291.field3672, (byte) 57, class607.field8276);
                this.field7120.method1274((byte) -73, class666.field9048, 0);
                this.field7120.method1304(class195.field2295, 0, (byte) 120);
                for (class263 var21 = this.field7131.method1909(true); var21 != null; var21 = this.field7131.method1916((byte) 124)) {
                    class627 var22 = (class627) var21;
                    var22.method3503(arg2, arg6, arg1, arg4, 1);
                }
                this.field7120.method1274((byte) -60, class290.field3662, 0);
                this.field7120.method1304(class290.field3662, 0, (byte) -15);
                this.field7120.method1349((class562) null, false);
                this.field7120.method418(var19, var20, this.field7120.field2829);
            }
            if (this.field7141 != null) {
                this.field7120.method363(-112, 0, this.field7146);
                this.field7120.method363(-113, 1, this.field7150);
                this.field7120.method344(28303, this.field7143);
                this.field7141.method169(arg2, arg6, arg5, arg1, true, arg4);
            }
        }
        int var25 = 86 / ((-22 - arg0) / 50);
        ++field7108;
    }

    @OriginalMember(owner = "client!iq", name = "JA", descriptor = "(II)I")
    public final int method201(int arg0, int arg1) {
        ++field7114;
        return this.field7130[arg0][arg1];
    }

    @OriginalMember(owner = "client!iq", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method197(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7144;
        if (this.field7141 != null && arg0 != null) {
            int var7 = arg1 - (this.field7120.field2828 * arg2 >> 8) >> this.field7120.field2833;
            int var8 = -(this.field7120.field2784 * arg2 >> 8) + arg3 >> this.field7120.field2833;
            this.field7141.method171(var7, 1, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
    public static final void method3012(int arg0) {
        ++field7117;
        class556.field6948 = null;
        class174.method1043(0, class309.field3890, 0, -1, class491.field6129, 0, class305.field3866, (byte) -82, 0);
        if (arg0 == -31456) {
            if (class556.field6948 != null) {
                class90.method671(-1412584499, (byte) 38, class491.field6129, class85.field1089.field4171, 0, class556.field6948, class309.field3890, 0, class213.field2504, class361.field4632);
                class556.field6948 = null;
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method196(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field7113 == null) {
            this.field7113 = new int[super.field1685][super.field1684][];
        }
        ++field7138;
        if (arg3 != null && this.field7139 == null) {
            this.field7139 = new int[super.field1685][super.field1684][];
        }
        this.field7136[arg0][arg1] = arg2;
        this.field7127[arg0][arg1] = arg4;
        this.field7128[arg0][arg1] = arg6;
        this.field7132[arg0][arg1] = arg7;
        if (this.field7113 != null) {
            this.field7113[arg0][arg1] = arg5;
        }
        if (this.field7139 != null) {
            this.field7139[arg0][arg1] = arg3;
        }
        class382[] var15 = this.field7112[arg0][arg1] = new class382[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) arg8[var16];
            class263 var19;
            for (var19 = this.field7145.method3828(var17, (byte) -91); var19 != null; var19 = this.field7145.method3829((byte) 53)) {
                class382 var20 = (class382) var19;
                if (arg8[var16] == var20.field4901 && (float) arg9[var16] == var20.field4910 && ~var20.field4894 == ~arg10 && var20.field4896 == arg11 && var20.field4913 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class382) var19;
            } else {
                var15[var16] = new class382(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field7145.method3832(var15[var16], var17, 115);
            }
        }
        if (arg13) {
            this.field7121[arg0][arg1] = (byte) class364.method2113(this.field7121[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field7148) {
            this.field7148 = arg6.length;
        }
        this.field7153 += arg6.length;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lkea;IIII[[I[[II)V")
    public class568(class223 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field7130 = arg5;
        this.field7120 = arg0;
        this.field7105 = super.field1683 - 2;
        this.field7129 = 1 << this.field7105;
        this.field7152 = new float[super.field1685 + 1][super.field1684 - -1];
        this.field7147 = new float[super.field1685 + 1][super.field1684 + 1];
        this.field7112 = new class382[arg3][arg4][];
        this.field7139 = new int[arg3][arg4][];
        this.field7128 = new int[arg3][arg4][];
        this.field7151 = new float[super.field1685 + 1][super.field1684 + 1];
        this.field7127 = new int[arg3][arg4][];
        this.field7119 = new short[arg3 * arg4][];
        this.field7121 = new byte[arg3][arg4];
        this.field7142 = new byte[arg3 + 1][arg4 + 1];
        this.field7136 = new int[arg3][arg4][];
        this.field7116 = arg2;
        this.field7132 = new int[arg3][arg4][];
        for (int var9 = 0; ~var9 >= ~super.field1684; ++var9) {
            for (int var10 = 0; ~var10 >= ~super.field1685; ++var10) {
                int var11 = this.field7130[var10][var9];
                if ((float) var11 > this.field7109) {
                    this.field7109 = (float) var11;
                }
                if (this.field7135 > (float) var11) {
                    this.field7135 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && super.field1685 > var10 && ~var9 > ~super.field1684) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + (var12 * var12 - -(var13 * var13)))));
                    this.field7152[var10][var9] = (float) var12 * var14;
                    this.field7151[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7147[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field7135;
        ++this.field7109;
        this.field7145 = new class694(128);
        if ((16 & this.field7116) != 0) {
            this.field7141 = new class28(this.field7120, this);
        }
    }

    @OriginalMember(owner = "client!iq", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method190(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7107;
        if (this.field7141 != null && arg0 != null) {
            int var7 = -(this.field7120.field2828 * arg2 >> 8) + arg1 >> this.field7120.field2833;
            int var8 = -(this.field7120.field2784 * arg2 >> 8) + arg3 >> this.field7120.field2833;
            this.field7141.method173((byte) 16, arg0, var7, var8);
        }
    }
}
