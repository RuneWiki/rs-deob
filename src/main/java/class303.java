import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class303 extends class176 {

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "F")
    private float field4033 = -3.4028235E38F;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "F")
    private float field4044 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Lrh;")
    private class59 field4034 = new class59();

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[[I")
    private int[][] field4027;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "Lsv;")
    public class312 field4056;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    private int field4043;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "[[B")
    private byte[][] field4071;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    private int field4031;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "[[[I")
    public int[][][] field4041;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "[[[I")
    public int[][][] field4065;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "[[[I")
    public int[][][] field4062;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "[[[I")
    private int[][][] field4048;

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "[[F")
    private float[][] field4076;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "[[F")
    private float[][] field4067;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "[[F")
    private float[][] field4073;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "[[[Lal;")
    private class460[][][] field4047;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "[[S")
    public short[][] field4049;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[[B")
    private byte[][] field4037;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[[[I")
    private int[][][] field4026;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "Lnj;")
    private class436 field4072;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "Lrv;")
    private class273 field4051;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
    public static int[] field4035 = new int[4096];

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    private int field4028;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    private int field4032;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    private int field4068;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    private int field4074;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "Lvp;")
    private class467 field4069;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "Lvp;")
    private class467 field4070;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "Lqca;")
    public class547 field4066;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "[Lfca;")
    public static class188[] field4055;

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "[Lal;")
    private class460[] field4075;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "[[[I")
    private int[][][] field4040;

    @OriginalMember(owner = "client!ua", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method152(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4046;
        if (this.field4051 != null && arg0 != null) {
            int var7 = -(this.field4056.field4437 * arg2 >> 8) + arg1 >> this.field4056.field4438;
            int var8 = arg3 - (this.field4056.field4456 * arg2 >> 8) >> this.field4056.field4438;
            this.field4051.method1662(var8, arg0, var7, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method1823(byte arg0) {
        class251.field3389 = -1;
        if (arg0 != 63) {
            method1826(-115);
        }
        class251.field3388 = -1;
        class436.field6025 = -1;
        class325.field4740 = 0;
        ++field4036;
    }

    @OriginalMember(owner = "client!ua", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method153(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field4026 == null) {
            this.field4026 = new int[super.field2214][super.field2215][];
        }
        if (arg5 != null && this.field4040 == null) {
            this.field4040 = new int[super.field2214][super.field2215][];
        }
        ++field4030;
        this.field4062[arg0][arg1] = arg2;
        this.field4041[arg0][arg1] = arg4;
        this.field4065[arg0][arg1] = arg6;
        this.field4048[arg0][arg1] = arg7;
        if (this.field4040 != null) {
            this.field4040[arg0][arg1] = arg5;
        }
        if (this.field4026 != null) {
            this.field4026[arg0][arg1] = arg3;
        }
        class460[] var15 = this.field4047[arg0][arg1] = new class460[arg6.length];
        for (int var16 = 0; var16 < arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42;
            class28 var19;
            for (var19 = this.field4072.method2506(124, var17); var19 != null; var19 = this.field4072.method2507(-1)) {
                class460 var20 = (class460) var19;
                if (~arg8[var16] == ~var20.field6249 && (float) arg9[var16] == var20.field6252 && var20.field6251 == arg10 && var20.field6253 == arg11 && ~var20.field6260 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class460) var19;
            } else {
                var15[var16] = new class460(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field4072.method2504(var17, 118, var15[var16]);
            }
        }
        if (arg13) {
            this.field4037[arg0][arg1] = (byte) class288.method1722(this.field4037[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field4068) {
            this.field4068 = arg6.length;
        }
        this.field4074 += arg6.length;
    }

    @OriginalMember(owner = "client!ua", name = "EA", descriptor = "(III)V")
    public final void method154(int arg0, int arg1, int arg2) {
        if ((255 & this.field4071[arg0][arg1]) < arg2) {
            this.field4071[arg0][arg1] = (byte) arg2;
        }
        ++field4053;
    }

    @OriginalMember(owner = "client!ua", name = "JA", descriptor = "(II)I")
    public final int method150(int arg0, int arg1) {
        ++field4045;
        return this.field4027[arg0][arg1];
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field4063;
        if (~this.field4074 < -1) {
            class526 var9 = this.field4056.method2011(this.field4032, (byte) 124);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1025(true, (byte) 67);
                if (var14 != null) {
                    Stream var15 = this.field4056.method1920((byte) 109, var14);
                    if (!Stream.method1519()) {
                        for (int var16 = arg4; ~var16 > ~arg6; ++var16) {
                            int var17 = super.field2214 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[-arg3 + var18][var16 - arg4]) {
                                    short[] var19 = this.field4049[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var19.length > var20; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            ++var10;
                                            var15.method1525(var21);
                                            if (~var12 > ~var21) {
                                                var12 = var21;
                                            }
                                            if (~var21 > ~var11) {
                                                var11 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field2214 * var22 - -arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[var26 - arg3][-arg4 + var22]) {
                                    short[] var27 = this.field4049[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            if (var29 < var11) {
                                                var11 = var29;
                                            }
                                            var15.method1531(var29);
                                            ++var10;
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method1523();
                    if (var9.method1021(true)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field4056.method1979(3000);
                this.field4056.method2024(false, false);
                this.field4056.method1965(false, 0);
                this.field4056.method1994(false, false);
                this.field4056.method1949(-32, false);
                this.field4056.method1881(127, 0);
                this.field4056.method2018((byte) -87, -2, false, false);
                this.field4056.method1884((class619) null, -2);
                class492 var23 = this.field4056.method2004((byte) -28);
                float[] var24 = this.field4056.method1996((byte) 99);
                var24[11] = 0.0F;
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4056.field4340;
                var24[3] = 0.0F;
                var24[1] = 0.0F;
                var24[9] = 0.0F;
                var24[14] = -this.field4044 / (this.field4033 - this.field4044);
                var24[6] = 0.0F;
                var24[7] = 0.0F;
                var24[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field4056.field4345;
                var24[15] = 1.0F;
                var24[5] = (float) arg2 / ((float) super.field2210 * 128.0F * (float) this.field4056.field4340);
                var24[0] = (float) arg2 / ((float) super.field2210 * 128.0F * (float) this.field4056.field4345);
                var24[10] = 1.0F / (this.field4033 - this.field4044);
                var24[4] = 0.0F;
                var24[8] = 0.0F;
                var24[2] = 0.0F;
                var23.method2771(0.0F, 0.0F, 1.0F, 0.0F, 1.0F, (byte) 99, 1.0F, 0.0F, 0.0F, 0.0F);
                this.field4056.method1931(-62);
                this.field4056.method1959(false);
                if (~(7 & this.field4064) != -1) {
                    this.field4056.method1965(true, 0);
                    this.field4056.method812(8);
                } else {
                    this.field4056.method1965(false, 0);
                }
                this.field4056.method817((byte) -59, false);
                this.field4056.method809(1, 0, this.field4069);
                this.field4056.method809(1, 1, this.field4070);
                this.field4056.method849((byte) 43, this.field4066);
                this.field4056.method818(var11, -var11 + var12 + 1, var9, var10 / 3, -1, class319.field4687, 0);
                this.field4056.method817((byte) -98, true);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method158(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4039;
        if (this.field4051 != null && arg0 != null) {
            int var7 = -(this.field4056.field4437 * arg2 >> 8) + arg1 >> this.field4056.field4438;
            int var8 = -(this.field4056.field4456 * arg2 >> 8) + arg3 >> this.field4056.field4438;
            this.field4051.method1665(arg0, 1, var8, var7);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III[[ZZ)V")
    public final void method149(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method1824(arg2, arg0, -1, arg1, arg3, arg4, -3710);
        ++field4057;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII[[ZZI)V")
    private final void method1824(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5, int arg6) {
        ++field4042;
        if (this.field4075 != null) {
            int var8 = arg0 + arg0 + 1;
            int var9 = var8 * var8;
            if (~var9 < ~class34.field337.length) {
                class34.field337 = new int[var9];
            }
            int var10 = arg1 - arg0;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg0 + arg3;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg0 + arg1;
            if (~var14 < ~(super.field2214 - 1)) {
                var14 = super.field2214 + -1;
            }
            int var15 = arg0 + arg3;
            class350.field5119 = 0;
            if (~var15 < ~(super.field2215 + -1)) {
                var15 = super.field2215 + -1;
            }
            for (int var16 = var10; var16 <= var14; ++var16) {
                boolean[] var23 = arg4[-var11 + var16];
                for (int var24 = var12; ~var15 <= ~var24; ++var24) {
                    if (var23[-var13 + var24]) {
                        class34.field337[class350.field5119++] = super.field2214 * var24 + var16;
                    }
                }
            }
            if (~arg2 == 0) {
                this.field4056.method1958(20786);
            } else {
                this.field4056.method1955((byte) 123, (float) arg2);
                this.field4056.method1943((byte) -116);
            }
            this.field4056.method1916(2);
            this.field4056.method1965((this.field4064 & 7) != 0, 0);
            this.field4056.method2018((byte) 119, -1, false, false);
            this.field4056.method809(arg6 + 3711, 0, this.field4069);
            for (int var17 = 0; ~var17 > ~this.field4075.length; ++var17) {
                this.field4075[var17].method2597(false, class350.field5119, class34.field337);
            }
            class492 var18 = this.field4056.method2004((byte) -42);
            var18.method609(0, -1, 0);
            this.field4056.method1959(false);
            if (!this.field4034.method379(-1)) {
                int var19 = this.field4056.field4441;
                int var20 = this.field4056.field4439;
                this.field4056.method2001(0, var20, this.field4056.field4395);
                this.field4056.method1965(false, arg6 ^ -3710);
                this.field4056.method1949(-32, false);
                this.field4056.method1881(126, 128);
                this.field4056.method2018((byte) 91, -2, false, false);
                this.field4056.method1884(this.field4056.field4408, -2);
                this.field4056.method1917(false, class66.field868, class594.field8145);
                this.field4056.method1997(class577.field7974, 0, -100);
                this.field4056.method1914(class275.field3735, 0, (byte) 115);
                for (class28 var21 = this.field4034.method374((byte) 74); var21 != null; var21 = this.field4034.method372(-20740)) {
                    class612 var22 = (class612) var21;
                    var22.method3371(arg1, 0, arg0, arg4, arg3);
                }
                this.field4056.method1997(class322.field4722, 0, -94);
                this.field4056.method1914(class322.field4722, 0, (byte) 115);
                this.field4056.method1884((class619) null, -2);
                this.field4056.method2001(var19, var20, this.field4056.field4395);
            }
            if (this.field4051 != null) {
                this.field4056.method809(1, 0, this.field4069);
                this.field4056.method809(1, 1, this.field4070);
                this.field4056.method849((byte) 43, this.field4066);
                this.field4051.method1666(arg1, arg3, arg0, (byte) -45, arg5, arg4);
            }
        }
        if (arg6 != -3710) {
            this.method1827(-44, 91, -98, (class88) null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(IILw;)Lw;")
    public final class451 method147(int arg0, int arg1, class451 arg2) {
        ++field4060;
        if ((1 & this.field4037[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field2210 >> this.field4056.field4438;
            class88 var5 = (class88) arg2;
            class88 var6;
            if (var5 != null && var5.method495(126, var4, var4)) {
                var6 = var5;
                var5.method496(-2254);
            } else {
                var6 = new class88(this.field4056, var4, var4);
            }
            var6.method497(3694, 0, 0, var4, var4);
            this.method1827(arg0, -1, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lhj;[I)V")
    public final void method160(class329 arg0, int[] arg1) {
        this.field4034.method378(new class612(this.field4056, this, arg0, arg1), 31316);
        ++field4050;
    }

    @OriginalMember(owner = "client!ua", name = "ba", descriptor = "()V")
    public final void method148() {
        if (this.field4074 <= 0) {
            this.field4051 = null;
        } else {
            byte[][] var1 = new byte[super.field2214 + 1][super.field2215 + 1];
            for (int var2 = 1; ~var2 > ~super.field2214; ++var2) {
                for (int var107 = 1; ~super.field2215 < ~var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field4071[var2][var107 - 1] >> 2) + (this.field4071[var2][var107] >> 1) + (this.field4071[var2][var107 + 1] >> 3) + (this.field4071[var2 + -1][var107] >> 2) + (this.field4071[var2 + 1][var107] >> 3));
                }
            }
            class460[] var3 = new class460[this.field4072.method2505(-5643)];
            this.field4072.method2500(23557, var3);
            for (int var4 = 0; var3.length > var4; ++var4) {
                var3[var4].method2605(this.field4074, 65535);
            }
            int var5 = 20;
            if (this.field4040 != null) {
                var5 += 4;
            }
            if ((this.field4064 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field4056.field4190.method1534(this.field4074 * 4, false);
            NativeHeapBuffer var7 = this.field4056.field4190.method1534(this.field4074 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class460[] var10 = new class460[this.field4074];
            int var11 = class20.method114(this.field4074 / 4, (byte) 109);
            if (var11 < 1) {
                var11 = 1;
            }
            class436 var12 = new class436(var11);
            class460[] var13 = new class460[this.field4068];
            for (int var14 = 0; var14 < super.field2214; ++var14) {
                for (int var34 = 0; super.field2215 > var34; ++var34) {
                    if (this.field4065[var14][var34] != null) {
                        class460[] var35 = this.field4047[var14][var34];
                        int[] var36 = this.field4062[var14][var34];
                        int[] var37 = this.field4041[var14][var34];
                        int[] var38 = this.field4048[var14][var34];
                        int[] var39 = this.field4065[var14][var34];
                        int[] var40 = this.field4026 != null ? this.field4026[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field4040 == null ? null : this.field4040[var14][var34];
                        float var42 = this.field4073[var14][var34];
                        float var43 = this.field4076[var14][var34];
                        float var44 = this.field4067[var14][var34];
                        float var45 = this.field4073[var14][var34 + 1];
                        float var46 = this.field4076[var14][var34 + 1];
                        float var47 = this.field4067[var14][var34 + 1];
                        float var48 = this.field4073[var14 + 1][var34 + 1];
                        float var49 = this.field4076[var14 + 1][var34 + 1];
                        float var50 = this.field4067[var14 + 1][var34 + 1];
                        float var51 = this.field4073[var14 + 1][var34];
                        float var52 = this.field4076[var14 + 1][var34];
                        float var53 = this.field4067[var14 - -1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = 255 & var1[var14 - -1][var34 + 1];
                        int var57 = var1[var14 + 1][var34] & 255;
                        int var58 = 0;
                        label360: for (int var59 = 0; ~var39.length < ~var59; ++var59) {
                            class460 var105 = var35[var59];
                            for (int var106 = 0; var58 > var106; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label360;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field4049[super.field2214 * var34 - -var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field2212) + var36[var61];
                            int var63 = (var34 << super.field2212) - -var37[var61];
                            int var64 = var62 >> this.field4043;
                            int var65 = var63 >> this.field4043;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 == null ? 0 : var40[var61];
                            long var69 = (long) var67 << 48 | (long) var66 << 32 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            int var75;
                            float var76;
                            float var77;
                            float var78;
                            if (var71 == 0 && var72 == 0) {
                                var75 = var73 - var54;
                                var76 = var42;
                                var77 = var44;
                                var78 = var43;
                            } else if (var71 == 0 && ~super.field2210 == ~var72) {
                                var75 = var73 - var55;
                                var76 = var45;
                                var78 = var46;
                                var77 = var47;
                            } else if (super.field2210 == var71 && ~super.field2210 == ~var72) {
                                var78 = var49;
                                var76 = var48;
                                var75 = var73 - var56;
                                var77 = var50;
                            } else if (~super.field2210 == ~var71 && ~var72 == -1) {
                                var76 = var51;
                                var78 = var52;
                                var77 = var53;
                                var75 = var73 - var57;
                            } else {
                                float var79 = (float) var71 / (float) super.field2210;
                                float var80 = (float) var72 / (float) super.field2210;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (-var43 + var52) * var79 + var43;
                                float var83 = (-var44 + var53) * var79 + var44;
                                float var84 = (-var45 + var48) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                var76 = (var84 - var81) * var80 + var81;
                                float var86 = (var50 - var47) * var79 + var47;
                                var78 = (var85 - var82) * var80 + var82;
                                var77 = (var86 - var83) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field2212) + var54;
                                int var88 = var55 - -((var56 - var55) * var71 >> super.field2212);
                                var75 = var73 - (((-var87 + var88) * var72 >> super.field2212) + var87);
                            }
                            float var89 = 1.0F;
                            if (var66 != -1) {
                                int var90 = (127 & var66) * var75 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (var90 > 126) {
                                    var90 = 126;
                                }
                                if (~(this.field4064 & 7) == -1) {
                                    float var91 = this.field4056.field4443[2] * var77 + this.field4056.field4443[1] * var78 + this.field4056.field4443[0] * var76;
                                    var89 = this.field4056.field4475 + var91 * (!(var91 > 0.0F) ? this.field4056.field4432 : this.field4056.field4399);
                                }
                                var74 = class91.field1112[var90 | var66 & 65408];
                            }
                            class28 var92 = null;
                            if ((var62 & this.field4031 + -1) == 0 && ~(var63 & this.field4031 + -1) == -1) {
                                var92 = var12.method2506(84, var69);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class396) var92).field5661;
                                var93 = 65535 & var60[var61];
                                if (var66 != -1 && var10[var93].field272 > var35[var61].field272) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var95;
                                if (~var66 != ~var67) {
                                    int var94 = (127 & var67) * var75 >> 7;
                                    if (~var94 <= -3) {
                                        if (~var94 < -127) {
                                            var94 = 126;
                                        }
                                    } else {
                                        var94 = 2;
                                    }
                                    var95 = class91.field1112[var94 | 65408 & var67];
                                    if ((7 & this.field4064) == 0) {
                                        float var96 = this.field4056.field4443[2] * var77 + this.field4056.field4443[1] * var78 + this.field4056.field4443[0] * var76;
                                        float var97 = this.field4056.field4475 + (!(var89 > 0.0F) ? this.field4056.field4432 : this.field4056.field4399) * var89;
                                        int var98 = (var95 & 16748606) >> 16;
                                        int var99 = 255 & var95 >> 8;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = 255 & var95;
                                        if (~var100 > -1) {
                                            var100 = 0;
                                        } else if (~var100 < -256) {
                                            var100 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var97);
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (~var102 < -256) {
                                            var102 = 255;
                                        }
                                        int var103 = (int) ((float) var101 * var97);
                                        if (~var103 > -1) {
                                            var103 = 0;
                                        } else if (~var103 < -256) {
                                            var103 = 255;
                                        }
                                        var95 = var102 << 8 | var100 << 16 | var103;
                                    }
                                } else {
                                    var95 = var74;
                                }
                                if (!Stream.method1519()) {
                                    var8.method1520((float) var62);
                                    var8.method1520((float) (var68 + this.method159(var62, var63)));
                                    var8.method1520((float) var63);
                                    var8.method1520((float) var62);
                                    var8.method1520((float) var63);
                                    if (this.field4040 != null) {
                                        var8.method1520((float) (var41 == null ? 0 : var41[var61] - 1));
                                    }
                                    if ((7 & this.field4064) != 0) {
                                        var8.method1520(var76);
                                        var8.method1520(var78);
                                        var8.method1520(var77);
                                    }
                                } else {
                                    var8.method1530((float) var62);
                                    var8.method1530((float) (this.method159(var62, var63) + var68));
                                    var8.method1530((float) var63);
                                    var8.method1530((float) var62);
                                    var8.method1530((float) var63);
                                    if (this.field4040 != null) {
                                        var8.method1530((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if ((7 & this.field4064) != 0) {
                                        var8.method1530(var76);
                                        var8.method1530(var78);
                                        var8.method1530(var77);
                                    }
                                }
                                if (~this.field4056.field4462 == -1) {
                                    var9.method1527(var95 | -16777216);
                                } else {
                                    var9.method1524(-16777216 | var95);
                                }
                                var93 = this.field4028++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method2504(var69, -33, new class396(var60[var61]));
                            }
                            for (int var104 = 0; ~var104 > ~var58; ++var104) {
                                var13[var104].method2602(var74, var89, var93, (byte) 91, var75);
                            }
                            ++this.field4032;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field4028 > var15; ++var15) {
                class460 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2599(var15, -125);
                }
            }
            for (int var16 = 0; super.field2214 > var16; ++var16) {
                for (int var22 = 0; var22 < super.field2215; ++var22) {
                    short[] var23 = this.field4049[super.field2214 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var25 < var23.length) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class460 var29 = var10[var26];
                            class460 var30 = var10[var27];
                            class460 var31 = var10[var28];
                            class460 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method2601(true, var22, var16, var24);
                            }
                            if (var30 != null) {
                                var30.method2601(true, var22, var16, var24);
                                if (var32 == null || var32.field272 > var30.field272) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2601(true, var22, var16, var24);
                                if (var32 == null || ~var32.field272 < ~var31.field272) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2599(var26, -120);
                                }
                                if (var30 != null) {
                                    var32.method2599(var27, -122);
                                }
                                if (var31 != null) {
                                    var32.method2599(var28, -118);
                                }
                                var32.method2601(true, var22, var16, var24);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method1523();
            var9.method1523();
            this.field4070 = this.field4056.method819(false, (byte) -118);
            this.field4070.method1023(var6, 4, this.field4028 * 4, 35);
            this.field4069 = this.field4056.method819(false, (byte) 29);
            this.field4069.method1023(var7, var5, this.field4028 * var5, 56);
            if (~(7 & this.field4064) == -1) {
                if (this.field4040 != null) {
                    this.field4066 = this.field4056.method813(new class401[] { new class401(new class102[] { class102.field1241, class102.field1245, class102.field1244 }), new class401(class102.field1243) }, 74);
                } else {
                    this.field4066 = this.field4056.method813(new class401[] { new class401(new class102[] { class102.field1241, class102.field1245 }), new class401(class102.field1243) }, 45);
                }
            } else if (this.field4040 != null) {
                this.field4066 = this.field4056.method813(new class401[] { new class401(new class102[] { class102.field1241, class102.field1245, class102.field1244, class102.field1242 }), new class401(class102.field1243) }, 107);
            } else {
                this.field4066 = this.field4056.method813(new class401[] { new class401(new class102[] { class102.field1241, class102.field1245, class102.field1242 }), new class401(class102.field1243) }, 75);
            }
            int var17 = 0;
            for (int var18 = 0; ~var18 > ~var3.length; ++var18) {
                if (var3[var18].field6247 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field4075 = new class460[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var17 > var20; ++var20) {
                class460 var21 = var3[var20];
                var19[var20] = var21.field272;
                this.field4075[var20] = var21;
                var21.method2598(this.field4028, 4);
            }
            class624.method3409(var19, -128, this.field4075);
            if (this.field4051 != null) {
                this.field4051.method1668(-78);
            }
        }
        ++field4038;
        this.field4062 = this.field4041 = null;
        this.field4073 = this.field4076 = this.field4067 = null;
        this.field4047 = null;
        this.field4048 = null;
        this.field4071 = null;
        this.field4026 = null;
        this.field4040 = null;
        this.field4065 = null;
        this.field4072 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method162(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field4029;
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
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
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
        this.method153(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lsv;IIII[[I[[II)V")
    public class303(class312 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field4027 = arg5;
        this.field4056 = arg0;
        this.field4043 = super.field2212 + -2;
        this.field4071 = new byte[arg3 - -1][arg4 + 1];
        this.field4064 = arg2;
        this.field4031 = 1 << this.field4043;
        this.field4041 = new int[arg3][arg4][];
        this.field4065 = new int[arg3][arg4][];
        this.field4062 = new int[arg3][arg4][];
        this.field4048 = new int[arg3][arg4][];
        this.field4076 = new float[super.field2214 + 1][super.field2215 + 1];
        this.field4067 = new float[super.field2214 + 1][super.field2215 + 1];
        this.field4073 = new float[super.field2214 + 1][super.field2215 + 1];
        this.field4047 = new class460[arg3][arg4][];
        this.field4049 = new short[arg3 * arg4][];
        this.field4037 = new byte[arg3][arg4];
        this.field4026 = new int[arg3][arg4][];
        for (int var9 = 0; var9 <= super.field2215; ++var9) {
            for (int var10 = 0; ~super.field2214 <= ~var10; ++var10) {
                int var11 = this.field4027[var10][var9];
                if (this.field4044 > (float) var11) {
                    this.field4044 = (float) var11;
                }
                if (this.field4033 < (float) var11) {
                    this.field4033 = (float) var11;
                }
                if (~var10 < -1 && var9 > 0 && ~var10 > ~super.field2214 && ~super.field2215 < ~var9) {
                    int var12 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 - (-(arg7 * arg7 * 4) - var13 * var13))));
                    this.field4073[var10][var9] = (float) var12 * var14;
                    this.field4076[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field4067[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field4033;
        --this.field4044;
        this.field4072 = new class436(128);
        if (~(16 & this.field4064) != -1) {
            this.field4051 = new class273(this.field4056, this);
        }
    }

    @OriginalMember(owner = "client!ua", name = "sa", descriptor = "(II)I")
    public final int method159(int arg0, int arg1) {
        ++field4025;
        int var3 = arg0 >> super.field2212;
        int var4 = arg1 >> super.field2212;
        if (var3 >= 0 && ~var4 <= -1 && super.field2214 + -1 >= var3 && super.field2215 + -1 >= var4) {
            int var5 = super.field2210 + -1 & arg0;
            int var6 = super.field2210 - 1 & arg1;
            int var7 = (-var5 + super.field2210) * this.field4027[var3][var4] - -(this.field4027[var3 + 1][var4] * var5) >> super.field2212;
            int var8 = (super.field2210 - var5) * this.field4027[var3][var4 + 1] - -(this.field4027[var3 + 1][var4 - -1] * var5) >> super.field2212;
            return (-var6 + super.field2210) * var7 + var6 * var8 >> super.field2212;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1825(String arg0, int arg1) {
        ++field4052;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg0.length();
            while (var3 > var2 && class575.method3241(arg0.charAt(var2), 32)) {
                ++var2;
            }
            while (~var3 < ~var2 && class575.method3241(arg0.charAt(var3 + -1), 32)) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (var4 >= arg1 && ~var4 >= -13) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; var6 < var3; ++var6) {
                    char var7 = arg0.charAt(var6);
                    if (class495.method2798(96, var7)) {
                        char var8 = class73.method429(124, var7);
                        if (~var8 != -1) {
                            var5.append(var8);
                        }
                    }
                }
                if (var5.length() == 0) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method156(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4058;
        if (this.field4051 != null && arg0 != null) {
            int var7 = -(this.field4056.field4437 * arg2 >> 8) + arg1 >> this.field4056.field4438;
            int var8 = arg3 - (this.field4056.field4456 * arg2 >> 8) >> this.field4056.field4438;
            return this.field4051.method1663(arg0, var8, var7, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
    public final void method155(int arg0, int arg1) {
        ++field4061;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1826(int arg0) {
        if (arg0 != -1) {
            field4059 = -32;
        }
        field4055 = null;
        field4035 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILmn;)V")
    private final void method1827(int arg0, int arg1, int arg2, class88 arg3) {
        ++field4054;
        int[] var5 = this.field4062[arg0][arg2];
        int[] var6 = this.field4041[arg0][arg2];
        int var7 = var5.length;
        if (~var7 < ~class516.field7081.length) {
            class516.field7081 = new int[var7];
            class195.field2531 = new int[var7];
        }
        for (int var8 = 0; ~var8 > ~var7; ++var8) {
            class516.field7081[var8] = var5[var8] >> this.field4056.field4438;
            class195.field2531[var8] = var6[var8] >> this.field4056.field4438;
        }
        int var9 = 0;
        while (~var7 < ~var9) {
            int var10 = class516.field7081[var9];
            int var11 = class195.field2531[var9++];
            int var12 = class516.field7081[var9];
            int var13 = class195.field2531[var9++];
            int var14 = class516.field7081[var9];
            int var15 = class195.field2531[var9++];
            if (~((var10 - var12) * (-var15 + var13) + -((var14 - var12) * (-var11 + var13))) < -1) {
                arg3.method498(var13, var10, var12, var14, var15, var11, -22653);
            }
        }
        if (arg1 != -1) {
            this.field4072 = null;
        }
    }
}
