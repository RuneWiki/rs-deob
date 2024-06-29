import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class240 extends class142 {

    @OriginalMember(owner = "client!oq", name = "F", descriptor = "Lpk;")
    private class133 field3532 = new class133();

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "[[I")
    private int[][] field3521;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "Lfd;")
    public class365 field3530;

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "I")
    private int field3522;

    @OriginalMember(owner = "client!oq", name = "U", descriptor = "[[S")
    public short[][] field3547;

    @OriginalMember(owner = "client!oq", name = "H", descriptor = "[[B")
    private byte[][] field3534;

    @OriginalMember(owner = "client!oq", name = "T", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "I")
    private int field3525;

    @OriginalMember(owner = "client!oq", name = "P", descriptor = "[[[Ldw;")
    private class502[][][] field3542;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "[[[I")
    private int[][][] field3520;

    @OriginalMember(owner = "client!oq", name = "M", descriptor = "[[[I")
    private int[][][] field3539;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "[[[I")
    public int[][][] field3517;

    @OriginalMember(owner = "client!oq", name = "I", descriptor = "[[[I")
    private int[][][] field3535;

    @OriginalMember(owner = "client!oq", name = "db", descriptor = "[[B")
    private byte[][] field3556;

    @OriginalMember(owner = "client!oq", name = "bb", descriptor = "[[F")
    private float[][] field3554;

    @OriginalMember(owner = "client!oq", name = "cb", descriptor = "[[F")
    private float[][] field3555;

    @OriginalMember(owner = "client!oq", name = "hb", descriptor = "[[F")
    private float[][] field3560;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "[[[I")
    public int[][][] field3516;

    @OriginalMember(owner = "client!oq", name = "eb", descriptor = "Lib;")
    private class106 field3557;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "Luf;")
    private class311 field3531;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "[S")
    public static short[] field3510 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!oq", name = "R", descriptor = "Lwa;")
    public static class433 field3544 = class153.method1092((byte) 108);

    @OriginalMember(owner = "client!oq", name = "V", descriptor = "I")
    public static int field3548 = 0;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    private int field3518;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!oq", name = "J", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!oq", name = "K", descriptor = "I")
    private int field3537;

    @OriginalMember(owner = "client!oq", name = "L", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!oq", name = "N", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!oq", name = "Q", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!oq", name = "S", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!oq", name = "Z", descriptor = "I")
    private int field3552;

    @OriginalMember(owner = "client!oq", name = "fb", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!oq", name = "O", descriptor = "Ltb;")
    public static class274 field3541;

    @OriginalMember(owner = "client!oq", name = "Y", descriptor = "Lvd;")
    private class30 field3551;

    @OriginalMember(owner = "client!oq", name = "G", descriptor = "Lfs;")
    public static class387 field3533;

    @OriginalMember(owner = "client!oq", name = "W", descriptor = "Lpc;")
    private class473 field3549;

    @OriginalMember(owner = "client!oq", name = "X", descriptor = "Lpc;")
    public class473 field3550;

    @OriginalMember(owner = "client!oq", name = "ab", descriptor = "Lpc;")
    public class473 field3553;

    @OriginalMember(owner = "client!oq", name = "gb", descriptor = "Lpc;")
    public class473 field3559;

    @OriginalMember(owner = "client!oq", name = "ib", descriptor = "[Ldw;")
    private class502[] field3561;

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "[[[I")
    private int[][][] field3526;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1592(boolean arg0) {
        if (!arg0) {
            field3510 = null;
            field3544 = null;
            field3533 = null;
            field3541 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(II)V", line = 19)
    public final void method420(int arg0, int arg1) {
        ++field3529;
    }

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "(III)V", line = 26)
    public final void method418(int arg0, int arg1, int arg2) {
        ++field3515;
        if (arg2 > (255 & this.field3556[arg0][arg1])) {
            this.field3556[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "(Lba;IIIIZ)V", line = 37)
    public final void method425(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3527;
        if (this.field3531 != null && arg0 != null) {
            int var7 = -(this.field3530.field5341 * arg2 >> 8) + arg1 >> this.field3530.field5307;
            int var8 = -(this.field3530.field5420 * arg2 >> 8) + arg3 >> this.field3530.field5307;
            this.field3531.method1938(var8, var7, arg0, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "(IILba;)Lba;", line = 54)
    public final class263 method431(int arg0, int arg1, class263 arg2) {
        ++field3514;
        if (~(1 & this.field3534[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field2006 >> this.field3530.field5307;
            class80 var5 = (class80) arg2;
            class80 var6;
            if (var5 != null && var5.method726(22582, var4, var4)) {
                var6 = var5;
                var5.method729(292993616);
            } else {
                var6 = new class80(this.field3530, var4, var4);
            }
            var6.method724(0, -102, 0, var4, var4);
            this.method1593(var6, arg0, (byte) -82, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIIII[[Z)V", line = 83)
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3538;
        if (this.field3558 > 0) {
            this.field3530.method2181(true);
            this.field3530.method2201(false, 0);
            this.field3530.method2189(false, -105);
            this.field3530.method2234(false, (byte) 92);
            this.field3530.method2194(-32, false);
            this.field3530.method2241(110, 0);
            this.field3530.method2240(false, -2);
            this.field3530.method2188((byte) 78, (class396) null);
            class118.field1639[7] = 0.0F;
            class118.field1639[5] = (float) arg2 / ((float) super.field2006 * 128.0F * (float) this.field3530.field5153);
            class118.field1639[6] = 0.0F;
            class118.field1639[9] = 0.0F;
            class118.field1639[1] = 0.0F;
            class118.field1639[3] = 0.0F;
            class118.field1639[10] = 0.0F;
            class118.field1639[15] = 1.0F;
            class118.field1639[14] = 0.0F;
            class118.field1639[2] = 0.0F;
            class118.field1639[0] = (float) arg2 / ((float) super.field2006 * 128.0F * (float) this.field3530.field5259);
            class118.field1639[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field3530.field5259;
            class118.field1639[4] = 0.0F;
            class118.field1639[8] = 0.0F;
            class118.field1639[11] = 0.0F;
            class118.field1639[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3530.field5153) + 1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class118.field1639, 0);
            class118.field1639[8] = 0.0F;
            class118.field1639[3] = 0.0F;
            class118.field1639[12] = 0.0F;
            class118.field1639[5] = 0.0F;
            class118.field1639[9] = 1.0F;
            class118.field1639[0] = 1.0F;
            class118.field1639[10] = 0.0F;
            class118.field1639[2] = 0.0F;
            class118.field1639[1] = 0.0F;
            class118.field1639[6] = 1.0F;
            class118.field1639[4] = 0.0F;
            class118.field1639[13] = 0.0F;
            class118.field1639[15] = 1.0F;
            class118.field1639[11] = 0.0F;
            class118.field1639[14] = 0.0F;
            class118.field1639[7] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class118.field1639, 0);
            if (~(this.field3546 & 7) == -1) {
                this.field3530.method2189(false, -44);
            } else {
                this.field3530.method2189(true, 99);
                this.field3530.method2197((byte) 66);
            }
            this.field3530.method2217(this.field3549, 123, this.field3559, this.field3550, this.field3553);
            if (class132.field1913.field783.length < this.field3518 * 2) {
                class132.field1913 = new class65(this.field3518 * 2);
            } else {
                class132.field1913.field827 = 0;
            }
            int var9 = 0;
            if (!this.field3530.field5443) {
                for (int var10 = arg4; var10 < arg6; ++var10) {
                    int var11 = super.field2007 * var10 - -arg3;
                    for (int var12 = arg3; ~var12 > ~arg5; ++var12) {
                        if (arg7[-arg3 + var12][-arg4 + var10]) {
                            short[] var13 = this.field3547[var11];
                            if (var13 != null) {
                                for (int var14 = 0; ~var14 > ~var13.length; ++var14) {
                                    ++var9;
                                    class132.field1913.method628((byte) -52, var13[var14] & 65535);
                                }
                            }
                        }
                        ++var11;
                    }
                }
            } else {
                for (int var15 = arg4; ~var15 > ~arg6; ++var15) {
                    int var17 = super.field2007 * var15 + arg3;
                    for (int var18 = arg3; ~var18 > ~arg5; ++var18) {
                        if (arg7[-arg3 + var18][-arg4 + var15]) {
                            short[] var19 = this.field3547[var17];
                            if (var19 != null) {
                                for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                    class132.field1913.method611((byte) 67, 65535 & var19[var20]);
                                    ++var9;
                                }
                            }
                        }
                        ++var17;
                    }
                }
            }
            if (~var9 < -1) {
                class194 var16 = new class194(this.field3530, 5123, class132.field1913.field783, class132.field1913.field827);
                this.field3530.method2250(0, var9, 4, var16, (byte) -95);
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lvp;[I)V", line = 255)
    public final void method424(class124 arg0, int[] arg1) {
        this.field3532.method1015(false, new class406(this.field3530, this, arg0, arg1));
        ++field3524;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lba;IIIIZ)Z", line = 269)
    public final boolean method428(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3536;
        if (this.field3531 != null && arg0 != null) {
            int var7 = arg1 - (this.field3530.field5341 * arg2 >> 8) >> this.field3530.field5307;
            int var8 = -(this.field3530.field5420 * arg2 >> 8) + arg3 >> this.field3530.field5307;
            return this.field3531.method1934((byte) -128, arg0, var8, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 289)
    public final void method422(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field3519;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
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
        this.method421(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(Lba;IIIIZ)V", line = 382)
    public final void method415(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3509;
        if (this.field3531 != null && arg0 != null) {
            int var7 = -(this.field3530.field5341 * arg2 >> 8) + arg1 >> this.field3530.field5307;
            int var8 = -(this.field3530.field5420 * arg2 >> 8) + arg3 >> this.field3530.field5307;
            this.field3531.method1939(-75, var8, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III[[ZZ)V", line = 401)
    public final void method429(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1595(arg0, (byte) 112, arg4, arg3, arg1, -1, arg2);
        ++field3540;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lgm;IBI)V", line = 413)
    private final void method1593(class80 arg0, int arg1, byte arg2, int arg3) {
        ++field3523;
        int[] var5 = this.field3516[arg1][arg3];
        int[] var6 = this.field3517[arg1][arg3];
        int var7 = var5.length;
        if (var7 > class344.field4773.length) {
            class344.field4773 = new int[var7];
            class521.field7661 = new int[var7];
        }
        for (int var8 = 0; var8 < var7; ++var8) {
            class344.field4773[var8] = class345.method2089(255, var5[var8]) >> this.field3530.field5307;
            class521.field7661[var8] = class345.method2089(var6[var8], 255) >> this.field3530.field5307;
        }
        int var9 = 59 % ((71 - arg2) / 43);
        int var10 = 0;
        while (~var7 < ~var10) {
            int var11 = class344.field4773[var10];
            int var12 = class521.field7661[var10++];
            int var13 = class344.field4773[var10];
            int var14 = class521.field7661[var10++];
            int var15 = class344.field4773[var10];
            int var16 = class521.field7661[var10++];
            if ((var11 - var13) * (-var16 + var14) + -((-var12 + var14) * (-var13 + var15)) > 0) {
                arg0.method728(var11, var14, var12, false, var13, var16, var15);
            }
        }
    }

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "(II)I", line = 473)
    public final int method430(int arg0, int arg1) {
        ++field3513;
        return this.field3521[arg0][arg1];
    }

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 482)
    public final void method421(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field3526 == null) {
            this.field3526 = new int[super.field2007][super.field2003][];
        }
        if (arg3 != null && this.field3520 == null) {
            this.field3520 = new int[super.field2007][super.field2003][];
        }
        ++field3528;
        this.field3516[arg0][arg1] = arg2;
        this.field3517[arg0][arg1] = arg4;
        this.field3539[arg0][arg1] = arg6;
        this.field3535[arg0][arg1] = arg7;
        if (this.field3526 != null) {
            this.field3526[arg0][arg1] = arg5;
        }
        if (this.field3520 != null) {
            this.field3520[arg0][arg1] = arg3;
        }
        class502[] var15 = this.field3542[arg0][arg1] = new class502[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class223 var19;
            for (var19 = this.field3557.method875(var17, 126); var19 != null; var19 = this.field3557.method872(-1)) {
                class502 var20 = (class502) var19;
                if (~arg8[var16] == ~var20.field7453 && (float) arg9[var16] == var20.field7452 && var20.field7440 == arg10 && var20.field7439 == arg11 && ~var20.field7447 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class502) var19;
            } else {
                var15[var16] = new class502(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3557.method878(var17, -2301, var15[var16]);
            }
        }
        if (arg13) {
            this.field3534[arg0][arg1] = (byte) class244.method1606(this.field3534[arg0][arg1], 1);
        }
        if (this.field3552 < arg6.length) {
            this.field3552 = arg6.length;
        }
        this.field3558 += arg6.length;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lfd;IIII[[I[[II)V", line = 552)
    public class240(class365 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field3521 = arg5;
        this.field3530 = arg0;
        this.field3522 = super.field2001 - 2;
        this.field3547 = new short[arg3 * arg4][];
        this.field3534 = new byte[arg3][arg4];
        this.field3546 = arg2;
        this.field3525 = 1 << this.field3522;
        this.field3542 = new class502[arg3][arg4][];
        this.field3520 = new int[arg3][arg4][];
        this.field3539 = new int[arg3][arg4][];
        this.field3517 = new int[arg3][arg4][];
        this.field3535 = new int[arg3][arg4][];
        this.field3556 = new byte[arg3 + 1][arg4 + 1];
        this.field3554 = new float[super.field2007 + 1][super.field2003 - -1];
        this.field3555 = new float[super.field2007 + 1][super.field2003 + 1];
        this.field3560 = new float[super.field2007 + 1][super.field2003 - -1];
        this.field3516 = new int[arg3][arg4][];
        for (int var9 = 1; ~var9 > ~super.field2003; ++var9) {
            for (int var10 = 1; super.field2007 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 - -(arg7 * 4 * arg7) - -(var12 * var12))));
                this.field3560[var10][var9] = (float) var11 * var13;
                this.field3554[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field3555[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3557 = new class106(128);
        if (~(16 & this.field3546) != -1) {
            this.field3531 = new class311(this.field3530, this);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)I", line = 613)
    public final int method426(int arg0, int arg1) {
        ++field3511;
        int var3 = arg0 >> super.field2001;
        int var4 = arg1 >> super.field2001;
        if (~var3 <= -1 && ~var4 <= -1 && super.field2007 + -1 >= var3 && super.field2003 + -1 >= var4) {
            int var5 = super.field2006 + -1 & arg0;
            int var6 = super.field2006 - 1 & arg1;
            int var7 = (-var5 + super.field2006) * this.field3521[var3][var4] + this.field3521[var3 + 1][var4] * var5 >> super.field2001;
            int var8 = (-var5 + super.field2006) * this.field3521[var3][var4 + 1] - -(this.field3521[var3 + 1][var4 - -1] * var5) >> super.field2001;
            return (-var6 + super.field2006) * var7 - -(var6 * var8) >> super.field2001;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oq", name = "ca", descriptor = "()V", line = 645)
    public final void method419() {
        ++field3543;
        if (this.field3558 <= 0) {
            this.field3531 = null;
        } else {
            byte[][] var1 = new byte[super.field2007 + 1][super.field2003 - -1];
            for (int var2 = 1; var2 < super.field2007; ++var2) {
                for (int var103 = 1; ~super.field2003 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field3556[var2][var103] >> 1) + (this.field3556[var2 + 1][var103] >> 3) + (this.field3556[var2 + -1][var103] >> 2) + (this.field3556[var2][var103 - 1] >> 2) + (this.field3556[var2][var103 + 1] >> 3));
                }
            }
            this.field3561 = new class502[this.field3557.method873(-5)];
            this.field3557.method883(-44, this.field3561);
            for (int var3 = 0; ~var3 > ~this.field3561.length; ++var3) {
                this.field3561[var3].method3008(-103, this.field3558);
            }
            int var4 = 24;
            if (this.field3526 != null) {
                var4 += 4;
            }
            if (~(7 & this.field3546) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field3530.field5305.method2681(this.field3558 * var4);
            NativeStream var6 = new NativeStream(var5);
            class502[] var7 = new class502[this.field3558];
            int var8 = class106.method871(this.field3558 / 4, false);
            if (var8 < 1) {
                var8 = 1;
            }
            class106 var9 = new class106(var8);
            class502[] var10 = new class502[this.field3552];
            for (int var11 = 0; ~super.field2007 < ~var11; ++var11) {
                for (int var30 = 0; var30 < super.field2003; ++var30) {
                    if (this.field3539[var11][var30] != null) {
                        class502[] var31 = this.field3542[var11][var30];
                        int[] var32 = this.field3516[var11][var30];
                        int[] var33 = this.field3517[var11][var30];
                        int[] var34 = this.field3535[var11][var30];
                        int[] var35 = this.field3539[var11][var30];
                        int[] var36 = this.field3520 != null ? this.field3520[var11][var30] : null;
                        int[] var37 = this.field3526 == null ? null : this.field3526[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field3560[var11][var30];
                        float var39 = this.field3554[var11][var30];
                        float var40 = this.field3555[var11][var30];
                        float var41 = this.field3560[var11][var30 - -1];
                        float var42 = this.field3554[var11][var30 - -1];
                        float var43 = this.field3555[var11][var30 - -1];
                        float var44 = this.field3560[var11 + 1][var30 + 1];
                        float var45 = this.field3554[var11 + 1][var30 - -1];
                        float var46 = this.field3555[var11 + 1][var30 + 1];
                        float var47 = this.field3560[var11 + 1][var30];
                        float var48 = this.field3554[var11 + 1][var30];
                        float var49 = this.field3555[var11 - -1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 - -1][var30 - -1] & 255;
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label339: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class502 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field3547[super.field2007 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field2001) - -var32[var57];
                            int var59 = (var30 << super.field2001) + var33[var57];
                            int var60 = var58 >> this.field3522;
                            int var61 = var59 >> this.field3522;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) var62 << 32 | (long) var63 << 48 | (long) (var60 << 16);
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            float var72;
                            int var73;
                            float var74;
                            if (~var67 == -1 && ~var68 == -1) {
                                var71 = var39;
                                var72 = var40;
                                var73 = var69 - var50;
                                var74 = var38;
                            } else if (var67 == 0 && ~super.field2006 == ~var68) {
                                var73 = var69 - var51;
                                var74 = var41;
                                var71 = var42;
                                var72 = var43;
                            } else if (~super.field2006 == ~var67 && super.field2006 == var68) {
                                var74 = var44;
                                var71 = var45;
                                var72 = var46;
                                var73 = var69 - var52;
                            } else if (super.field2006 == var67 && ~var68 == -1) {
                                var72 = var49;
                                var71 = var48;
                                var74 = var47;
                                var73 = var69 - var53;
                            } else {
                                float var75 = (float) var67 / (float) super.field2006;
                                float var76 = (float) var68 / (float) super.field2006;
                                float var77 = (var47 - var38) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (var44 - var41) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                var71 = (-var78 + var81) * var76 + var78;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var74 = (-var77 + var80) * var76 + var77;
                                var72 = (-var79 + var82) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field2001) + var50;
                                int var84 = ((-var51 + var52) * var67 >> super.field2001) + var51;
                                var73 = var69 - (var83 - -((-var83 + var84) * var68 >> super.field2001));
                            }
                            float var85 = 1.0F;
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var73 >> 7;
                                if (~var86 <= -3) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class37.field413[var86 | var62 & 65408];
                                if (~(this.field3546 & 7) == -1) {
                                    float var87 = this.field3530.field5425[2] * var72 + this.field3530.field5425[1] * var71 + this.field3530.field5425[0] * var74;
                                    var85 = var87 * (!(var87 > 0.0F) ? this.field3530.field5380 : this.field3530.field5414) + this.field3530.field5399;
                                }
                            }
                            class223 var88 = null;
                            if ((this.field3525 + -1 & var58) == 0 && ~(var59 & this.field3525 + -1) == -1) {
                                var88 = var9.method875(var65, 126);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var73 >> 7;
                                    if (var90 < 2) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var89 = class37.field413[var63 & 65408 | var90];
                                    if (~(7 & this.field3546) == -1) {
                                        float var91 = this.field3530.field5425[2] * var72 + this.field3530.field5425[0] * var74 + this.field3530.field5425[1] * var71;
                                        float var92 = this.field3530.field5399 + (var85 > 0.0F ? this.field3530.field5414 : this.field3530.field5380) * var85;
                                        int var93 = var89 >> 16 & 255;
                                        int var94 = (var89 & 65500) >> 8;
                                        int var95 = var89 & 255;
                                        int var96 = (int) ((float) var93 * var92);
                                        if (~var96 <= -1) {
                                            if (~var96 < -256) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        int var98 = (int) ((float) var95 * var92);
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        if (~var98 <= -1) {
                                            if (~var98 < -256) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var98 | var97 << 8 | var96 << 16;
                                    }
                                }
                                if (!this.field3530.field5443) {
                                    var6.method2679((float) var58);
                                    var6.method2679((float) (var64 + this.method426(var58, var59)));
                                    var6.method2679((float) var59);
                                    var6.method2680((byte) (var89 >> 16));
                                    var6.method2680((byte) (var89 >> 8));
                                    var6.method2680((byte) var89);
                                    var6.method2680(-1);
                                    var6.method2679((float) var58);
                                    var6.method2679((float) var59);
                                    if (this.field3526 != null) {
                                        var6.method2679((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((this.field3546 & 7) != 0) {
                                        var6.method2679(var74);
                                        var6.method2679(var71);
                                        var6.method2679(var72);
                                    }
                                } else {
                                    var6.method2677((float) var58);
                                    var6.method2677((float) (this.method426(var58, var59) - -var64));
                                    var6.method2677((float) var59);
                                    var6.method2680((byte) (var89 >> 16));
                                    var6.method2680((byte) (var89 >> 8));
                                    var6.method2680((byte) var89);
                                    var6.method2680(-1);
                                    var6.method2677((float) var58);
                                    var6.method2677((float) var59);
                                    if (this.field3526 != null) {
                                        var6.method2677((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field3546) != 0) {
                                        var6.method2677(var74);
                                        var6.method2677(var71);
                                        var6.method2677(var72);
                                    }
                                }
                                var99 = this.field3537++;
                                var56[var57] = (short) var99;
                                if (var62 != -1) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method878(var65, -2301, new class360(var56[var57]));
                            } else {
                                var56[var57] = ((class360) var88).field5002;
                                var99 = 65535 & var56[var57];
                                if (~var62 != 0 && var7[var99].field3271 > var31[var57].field3271) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method3007(var73, var99, (byte) 109, var70, var85);
                            }
                            ++this.field3518;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field3537; ++var12) {
                class502 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3009(var12, false);
                }
            }
            for (int var13 = 0; ~super.field2007 < ~var13; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field2003; ++var18) {
                    short[] var19 = this.field3547[super.field2007 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class502 var25 = var7[var22];
                            class502 var26 = var7[var23];
                            class502 var27 = var7[var24];
                            class502 var28 = null;
                            if (var25 != null) {
                                var25.method3006(var18, var20, var13, false);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method3006(var18, var20, var13, false);
                                if (var28 == null || var28.field3271 > var26.field3271) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3006(var18, var20, var13, false);
                                if (var28 == null || var28.field3271 > var27.field3271) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3009(var22, false);
                                }
                                if (var26 != null) {
                                    var28.method3009(var23, false);
                                }
                                if (var27 != null) {
                                    var28.method3009(var24, false);
                                }
                                var28.method3006(var18, var20, var13, false);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2675();
            this.field3551 = this.field3530.method2185(false, 121, var5, var6.method2674(), var4);
            this.field3553 = new class473(this.field3551, 5126, 3, 0);
            this.field3549 = new class473(this.field3551, 5121, 4, 12);
            byte var14;
            if (this.field3526 == null) {
                var14 = 24;
                this.field3550 = new class473(this.field3551, 5126, 2, 16);
            } else {
                var14 = 28;
                this.field3550 = new class473(this.field3551, 5126, 3, 16);
            }
            if ((7 & this.field3546) != 0) {
                this.field3559 = new class473(this.field3551, 5126, 3, var14);
            }
            long[] var15 = new long[this.field3561.length];
            for (int var16 = 0; ~this.field3561.length < ~var16; ++var16) {
                class502 var17 = this.field3561[var16];
                var15[var16] = var17.field3271;
                var17.method3003(this.field3537, 102);
            }
            class521.method3097(this.field3561, var15, (byte) 41);
            if (this.field3531 != null) {
                this.field3531.method1937(-1);
            }
        }
        this.field3520 = null;
        this.field3526 = null;
        this.field3535 = null;
        this.field3557 = null;
        this.field3542 = null;
        this.field3560 = this.field3554 = this.field3555 = null;
        this.field3516 = this.field3517 = null;
        this.field3556 = null;
        this.field3539 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLya;)V", line = 1226)
    public static final void method1594(byte arg0, class38 arg1) {
        ++field3545;
        int var2 = class389.field5748;
        int var3 = class429.field6318;
        int var4 = class22.field244;
        int var5 = class518.field7624;
        int var6 = -10660793;
        arg1.method367(var2, var4, var3, (byte) 58, var6, var5);
        arg1.method367(var2 + 1, var4 - 2, var3 + 1, (byte) 58, -16777216, 16);
        arg1.method370(var2 + 1, -16777216, var5 + -19, 8, var4 + -2, var3 + 18);
        class466.field6840.method1958(-1, var6, class192.field2804.method2031(true, class377.field5585), var3 - -14, var2 + 3, 0);
        if (arg0 != -76) {
            field3548 = -97;
        }
        int var7 = class104.field1460.method1268((byte) 58);
        int var8 = class104.field1460.method1280(3045);
        int var9 = 0;
        for (class97 var10 = (class97) class498.field7394.method1018(arg0 ^ -24); var10 != null; var10 = (class97) class498.field7394.method1022((byte) -112)) {
            int var11 = (-var9 + class291.field4175 + -1) * 16 + 31 + var3;
            short var12 = -1;
            if (~var2 > ~var7 && ~(var2 - -var4) < ~var7 && ~var8 < ~(var11 + -13) && ~(var11 - -3) < ~var8 && var10.field1304) {
                var12 = -256;
            }
            int[] var13 = null;
            if (!class293.method1857(var10.field1307, 0)) {
                if (~var10.field1299 == 0) {
                    if (!class478.method2889(var10.field1307, (byte) -117)) {
                        if (class9.method58(-99, var10.field1307)) {
                            Object var14 = null;
                            class222 var15;
                            if (var10.field1307 != 1010) {
                                var15 = class384.field5645.method786((int) (2147483647L & var10.field1308 >>> 32), 0);
                            } else {
                                var15 = class384.field5645.method786((int) var10.field1308, 0);
                            }
                            if (var15.field3233 != null) {
                                var15 = var15.method1509(class253.field3739, (byte) -16);
                            }
                            if (var15 != null) {
                                var13 = var15.field3245;
                            }
                        }
                    } else {
                        class461 var16 = class250.field3690[(int) var10.field1308];
                        if (var16 != null) {
                            class100 var17 = var16.field6790;
                            if (var17.field1364 != null) {
                                var17 = var17.method848(false, class253.field3739);
                            }
                            if (var17 != null) {
                                var13 = var17.field1404;
                            }
                        }
                    }
                } else {
                    var13 = class270.field3995.method6(22883, var10.field1299).field923;
                }
            } else {
                var13 = class270.field3995.method6(22883, (int) var10.field1308).field923;
            }
            String var18 = class87.method768(arg0 + 12, var10);
            if (var13 != null) {
                var18 = var18 + class213.method1463(var13, 126);
            }
            class466.field6840.method1957((byte) -114, class517.field7617, 0, class436.field6393, var12, var18, var2 + 3, var11);
            ++var9;
            if (var10.field1298) {
                class370.field5496.method111(class387.field5731.method1969(-1, var18) + var2 + 5, var11 + -12);
            }
        }
        class113.method914(class22.field244, class518.field7624, class429.field6318, 0, class389.field5748);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBZ[[ZIII)V", line = 1334)
    private final void method1595(int arg0, byte arg1, boolean arg2, boolean[][] arg3, int arg4, int arg5, int arg6) {
        if (this.field3561 != null) {
            float var8 = this.field3530.field5387;
            float var9 = this.field3530.field5371;
            int var10 = arg6 + 1 - -arg6;
            int var11 = var10 * var10;
            if (~var11 < ~class220.field3155.length) {
                class220.field3155 = new int[var11];
            }
            if (~class132.field1913.field783.length > ~(this.field3518 * 2)) {
                class132.field1913 = new class65(this.field3518 * 2);
            }
            int var12 = -arg6 + arg0;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = -arg6 + arg4;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg0 - -arg6;
            if (~var16 < ~(super.field2007 + -1)) {
                var16 = super.field2007 - 1;
            }
            int var17 = arg4 + arg6;
            if (~(super.field2003 + -1) > ~var17) {
                var17 = super.field2003 - 1;
            }
            class230.field3370 = 0;
            for (int var18 = var12; var16 >= var18; ++var18) {
                boolean[] var24 = arg3[-var13 + var18];
                for (int var25 = var14; var25 <= var17; ++var25) {
                    if (var24[-var15 + var25]) {
                        class220.field3155[class230.field3370++] = super.field2007 * var25 - -var18;
                    }
                }
            }
            if (arg5 != -1) {
                this.field3530.method2220((float) arg5, (byte) 99);
                this.field3530.method2211(true);
            } else {
                this.field3530.method2187(8);
            }
            this.field3530.method2189((this.field3546 & 7) != 0, -95);
            for (int var19 = 0; ~var19 > ~this.field3561.length; ++var19) {
                this.field3561[var19].method3004(class220.field3155, class230.field3370, -45);
            }
            if (!this.field3532.method1025((byte) -126)) {
                int var20 = this.field3530.field5392;
                int var21 = this.field3530.field5428;
                this.field3530.method368(0, var21, this.field3530.field5329);
                this.field3530.method319(var9, var8 - 4.0F);
                this.field3530.method2189(false, 57);
                this.field3530.method2194(-32, false);
                this.field3530.method2241(127, 128);
                this.field3530.method2240(false, -2);
                this.field3530.method2188((byte) 78, this.field3530.field5421);
                this.field3530.method2195(8448, 7681, true);
                this.field3530.method2228((byte) 79, 0, 770, 34166);
                this.field3530.method2237(true, 770, 34167, 0);
                for (class223 var22 = this.field3532.method1018(107); var22 != null; var22 = this.field3532.method1022((byte) -112)) {
                    class406 var23 = (class406) var22;
                    var23.method2495(arg6, 52, arg0, arg4, arg3);
                }
                this.field3530.method2228((byte) 79, 0, 768, 5890);
                this.field3530.method2237(true, 770, 5890, 0);
                this.field3530.method2188((byte) 78, (class396) null);
                this.field3530.method368(var20, var21, this.field3530.field5329);
            }
            if (this.field3531 != null) {
                this.field3530.method319(var9, var8 - 8.0F);
                this.field3530.method2187(8);
                this.field3530.method2217((class473) null, 126, (class473) null, this.field3550, this.field3553);
                this.field3531.method1935(arg2, arg4, arg0, arg3, arg6, false);
            }
            this.field3530.method319(var9, var8);
        }
        ++field3512;
        if (arg1 <= 108) {
            this.field3549 = null;
        }
    }
}
