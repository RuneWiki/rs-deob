import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class297 extends class296 {

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "Ljia;")
    private class645 field4056 = new class645();

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    private int field4044 = this.field4036 + -2;

    @OriginalMember(owner = "client!vca", name = "J", descriptor = "Lhk;")
    public class111 field4069;

    @OriginalMember(owner = "client!vca", name = "T", descriptor = "[[F")
    private float[][] field4079;

    @OriginalMember(owner = "client!vca", name = "v", descriptor = "[[S")
    public short[][] field4055;

    @OriginalMember(owner = "client!vca", name = "R", descriptor = "[[F")
    private float[][] field4077;

    @OriginalMember(owner = "client!vca", name = "E", descriptor = "[[[Ljh;")
    private class171[][][] field4064;

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "[[[I")
    private int[][][] field4042;

    @OriginalMember(owner = "client!vca", name = "O", descriptor = "[[[I")
    public int[][][] field4074;

    @OriginalMember(owner = "client!vca", name = "bb", descriptor = "[[B")
    private byte[][] field4087;

    @OriginalMember(owner = "client!vca", name = "B", descriptor = "I")
    private int field4061;

    @OriginalMember(owner = "client!vca", name = "ab", descriptor = "[[F")
    private float[][] field4086;

    @OriginalMember(owner = "client!vca", name = "G", descriptor = "[[[I")
    public int[][][] field4066;

    @OriginalMember(owner = "client!vca", name = "K", descriptor = "[[B")
    private byte[][] field4070;

    @OriginalMember(owner = "client!vca", name = "N", descriptor = "[[[I")
    public int[][][] field4073;

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "[[[I")
    private int[][][] field4045;

    @OriginalMember(owner = "client!vca", name = "db", descriptor = "Lcja;")
    private class46 field4089;

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "Lpk;")
    private class211 field4053;

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "Lfja;")
    public static class783 field4047 = new class783(115, -2);

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "[I")
    public static int[] field4057 = new int[2];

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
    private int field4060;

    @OriginalMember(owner = "client!vca", name = "C", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!vca", name = "D", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!vca", name = "F", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!vca", name = "H", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!vca", name = "I", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!vca", name = "L", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!vca", name = "M", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!vca", name = "P", descriptor = "I")
    private int field4075;

    @OriginalMember(owner = "client!vca", name = "Q", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!vca", name = "V", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!vca", name = "X", descriptor = "I")
    private int field4083;

    @OriginalMember(owner = "client!vca", name = "cb", descriptor = "I")
    private int field4088;

    @OriginalMember(owner = "client!vca", name = "Y", descriptor = "Lwfa;")
    private class212 field4084;

    @OriginalMember(owner = "client!vca", name = "U", descriptor = "Lnba;")
    public class316 field4080;

    @OriginalMember(owner = "client!vca", name = "W", descriptor = "Lnba;")
    private class316 field4082;

    @OriginalMember(owner = "client!vca", name = "Z", descriptor = "Lnba;")
    public class316 field4085;

    @OriginalMember(owner = "client!vca", name = "eb", descriptor = "Lnba;")
    public class316 field4090;

    @OriginalMember(owner = "client!vca", name = "S", descriptor = "[Ljh;")
    private class171[] field4078;

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "[[[I")
    private int[][][] field4050;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V")
    public static void method1909(boolean arg0) {
        field4047 = null;
        field4057 = null;
        if (arg0) {
            field4057 = null;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIZIIIIII)Z")
    public static final boolean method1910(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 106 / ((arg8 - 60) / 54);
        ++field4052;
        int var10 = class235.field3379.field5304[0];
        int var11 = class235.field3379.field5308[0];
        if (~var10 <= -1 && ~var10 > ~class483.field6515 && ~var11 <= -1 && ~class65.field926 < ~var11) {
            if (~arg3 <= -1 && arg3 < class483.field6515 && ~arg5 <= -1 && arg5 < class65.field926) {
                int var12 = class260.method1689(arg0, -64, class235.field3379.method2342((byte) -110), arg6, arg5, var11, class711.field9798[class235.field3379.field7391], arg2, arg3, class203.field3066, arg7, class482.field6505, arg1, var10, arg4);
                if (~var12 > -2) {
                    return false;
                } else {
                    class231.field3356 = class482.field6505[var12 - 1];
                    class392.field5380 = class203.field3066[var12 - 1];
                    class625.field8714 = false;
                    class414.method2445(-8688);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vca", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1902(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4051;
        if (this.field4053 != null && arg0 != null) {
            int var7 = -(this.field4069.field1974 * arg2 >> 8) + arg1 >> this.field4069.field1936;
            int var8 = -(this.field4069.field2055 * arg2 >> 8) + arg3 >> this.field4069.field1936;
            this.field4053.method1488(var8, -1, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field4062;
        if (~this.field4088 < -1) {
            this.field4069.method984(-20823);
            this.field4069.method1000(-4180, false);
            this.field4069.method956(false, 80);
            this.field4069.method950(false, (byte) 75);
            this.field4069.method936(false, -128);
            this.field4069.method973(1, 0);
            this.field4069.method1006(1, -2);
            this.field4069.method939((class18) null, 8448);
            class404.field5548[7] = 0.0F;
            class404.field5548[6] = 0.0F;
            class404.field5548[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field4069.field1921) + 1.0F;
            class404.field5548[8] = 0.0F;
            class404.field5548[1] = 0.0F;
            class404.field5548[10] = 0.0F;
            class404.field5548[11] = 0.0F;
            class404.field5548[4] = 0.0F;
            class404.field5548[9] = 0.0F;
            class404.field5548[2] = 0.0F;
            class404.field5548[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field4069.field1813;
            class404.field5548[14] = 0.0F;
            class404.field5548[3] = 0.0F;
            class404.field5548[5] = (float) arg2 / ((float) super.field4035 * 128.0F * (float) this.field4069.field1921);
            class404.field5548[15] = 1.0F;
            class404.field5548[0] = (float) arg2 / ((float) super.field4035 * 128.0F * (float) this.field4069.field1813);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class404.field5548, 0);
            class404.field5548[13] = 0.0F;
            class404.field5548[12] = 0.0F;
            class404.field5548[7] = 0.0F;
            class404.field5548[0] = 1.0F;
            class404.field5548[4] = 0.0F;
            class404.field5548[11] = 0.0F;
            class404.field5548[9] = 1.0F;
            class404.field5548[3] = 0.0F;
            class404.field5548[6] = 1.0F;
            class404.field5548[8] = 0.0F;
            class404.field5548[5] = 0.0F;
            class404.field5548[15] = 1.0F;
            class404.field5548[1] = 0.0F;
            class404.field5548[10] = 0.0F;
            class404.field5548[2] = 0.0F;
            class404.field5548[14] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class404.field5548, 0);
            if (~(7 & this.field4046) != -1) {
                this.field4069.method956(true, 111);
                this.field4069.method1008(-3);
            } else {
                this.field4069.method956(false, 79);
            }
            this.field4069.method948(this.field4085, 8448, this.field4080, this.field4090, this.field4082);
            if (this.field4075 * 2 > this.field4069.field2042.field1413.length) {
                this.field4069.field2042 = new class335(this.field4075 * 2);
            } else {
                this.field4069.field2042.field1442 = 0;
            }
            int var9 = 0;
            class335 var10 = this.field4069.field2042;
            if (!this.field4069.field2000) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field4037 * var11 + arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[var13 - arg3][-arg4 + var11]) {
                            short[] var14 = this.field4055[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var15 > ~var14.length; ++var15) {
                                    var10.method748(255, 65535 & var14[var15]);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field4037 * var16 + arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field4055[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    var10.method781(97, 65535 & var20[var21]);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class679 var17 = new class679(this.field4069, 5123, var10.field1413, var10.field1442);
                this.field4069.method951(393, 0, var17, var9, 4);
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1906(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method1911(arg2, arg6, arg0, arg5, arg3, (byte) 127, arg4, arg1);
        ++field4068;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1898(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field4072;
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
        for (int var28 = 0; var18 > var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1896(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIII[[ZBZI)V")
    private final void method1911(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, byte arg5, boolean arg6, int arg7) {
        if (this.field4078 != null) {
            int var9 = arg0 - -arg0 - -1;
            int var10 = var9 * var9;
            if (~var10 < ~this.field4069.field2087.length) {
                this.field4069.field2087 = new int[var10];
            }
            if (this.field4069.field2042.field1413.length < this.field4075 * 2) {
                this.field4069.field2042 = new class335(this.field4075 * 2);
            }
            int var11 = -arg0 + arg2;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = -arg0 + arg7;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg0 + arg2;
            if (super.field4037 - 1 < var15) {
                var15 = super.field4037 + -1;
            }
            int var16 = arg7 - -arg0;
            if (var16 > super.field4034 + -1) {
                var16 = super.field4034 + -1;
            }
            int var17 = 0;
            int[] var18 = this.field4069.field2087;
            for (int var19 = var11; var19 <= var15; ++var19) {
                boolean[] var25 = arg4[-var12 + var19];
                for (int var26 = var13; var16 >= var26; ++var26) {
                    if (var25[-var14 + var26]) {
                        var18[var17++] = super.field4037 * var26 - -var19;
                    }
                }
            }
            if (~arg3 == 0) {
                this.field4069.method1009(false);
            } else {
                this.field4069.method1014(-41, (float) arg3);
                this.field4069.method985(-17);
            }
            this.field4069.method956((this.field4046 & 7) != 0, 124);
            for (int var20 = 0; var20 < this.field4078.length; ++var20) {
                this.field4078[var20].method1309(false, var17, var18);
            }
            if (!this.field4056.method3586(0)) {
                int var21 = this.field4069.field2070;
                int var22 = this.field4069.field2015;
                this.field4069.method499(0, var22, this.field4069.field2032);
                this.field4069.method956(false, 85);
                this.field4069.method936(false, -128);
                this.field4069.method973(1, 128);
                this.field4069.method1006(1, -2);
                this.field4069.method939(this.field4069.field1973, 8448);
                this.field4069.method990(8448, 7681, -29641);
                this.field4069.method988(34166, 6, 0, 770);
                this.field4069.method980(0, 34167, true, 770);
                for (class154 var23 = this.field4056.method3589((byte) -128); var23 != null; var23 = this.field4056.method3591(0)) {
                    class483 var24 = (class483) var23;
                    var24.method2760(arg7, arg2, arg0, arg4, -108);
                }
                this.field4069.method988(5890, 6, 0, 768);
                this.field4069.method980(0, 5890, true, 770);
                this.field4069.method939((class18) null, 8448);
                this.field4069.method499(var21, var22, this.field4069.field2032);
            }
            if (this.field4053 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                this.field4069.method948(this.field4085, 8448, (class316) null, this.field4090, (class316) null);
                this.field4053.method1483(arg4, arg2, -24638, arg6, arg0, arg7);
                OpenGL.glPopMatrix();
            }
        }
        if (arg5 > 87) {
            ++field4049;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1895(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field4067;
        this.method1911(arg2, arg5, arg0, -1, arg3, (byte) 94, arg4, arg1);
    }

    @OriginalMember(owner = "client!vca", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1896(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field4081;
        if (arg5 != null && this.field4050 == null) {
            this.field4050 = new int[super.field4037][super.field4034][];
        }
        class162 var15 = this.field4069.field970;
        if (arg3 != null && this.field4042 == null) {
            this.field4042 = new int[super.field4037][super.field4034][];
        }
        this.field4073[arg0][arg1] = arg2;
        this.field4066[arg0][arg1] = arg4;
        this.field4074[arg0][arg1] = arg6;
        this.field4045[arg0][arg1] = arg7;
        if (this.field4050 != null) {
            this.field4050[arg0][arg1] = arg5;
        }
        if (this.field4042 != null) {
            this.field4042[arg0][arg1] = arg3;
        }
        class171[] var16 = this.field4064[arg0][arg1] = new class171[arg6.length];
        for (int var17 = 0; ~var17 > ~arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field4046) != -1 && var18 != -1 && var15.method1270(var18, true).field4244) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) var18 | (long) (var19 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
            class154 var22;
            for (var22 = this.field4089.method337(var20, 1); var22 != null; var22 = this.field4089.method344((byte) 102)) {
                class171 var23 = (class171) var22;
                if (~var23.field2721 == ~var18 && (float) var19 == var23.field2719 && ~var23.field2734 == ~arg10 && var23.field2730 == arg11 && ~var23.field2720 == ~arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class171(this, var18, var19, arg10, arg11, arg12);
                this.field4089.method341(var20, var16[var17], (byte) 97);
            } else {
                var16[var17] = (class171) var22;
            }
        }
        if (arg13) {
            this.field4070[arg0][arg1] = (byte) class530.method3011(this.field4070[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field4083) {
            this.field4083 = arg6.length;
        }
        this.field4088 += arg6.length;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V")
    public final void method1903(int arg0, int arg1) {
        ++field4065;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIILvg;)V")
    private final void method1912(int arg0, int arg1, int arg2, class60 arg3) {
        ++field4059;
        int[] var5 = this.field4073[arg2][arg1];
        int[] var6 = this.field4066[arg2][arg1];
        int var7 = var5.length;
        if (var7 > this.field4069.field2086.length) {
            this.field4069.field2084 = new int[var7];
            this.field4069.field2086 = new int[var7];
        }
        int[] var8 = this.field4069.field2086;
        int[] var9 = this.field4069.field2084;
        for (int var10 = 0; var10 < var7; ++var10) {
            var8[var10] = var5[var10] >> this.field4069.field1936;
            var9[var10] = var6[var10] >> this.field4069.field1936;
        }
        int var11 = arg0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((var12 - var14) * (-var17 + var15) - (var16 - var14) * (-var13 + var15)) < -1) {
                arg3.method421(var14, var16, (byte) -37, var13, var17, var15, var12);
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "fa", descriptor = "(IILr;)Lr;")
    public final class196 method1908(int arg0, int arg1, class196 arg2) {
        ++field4071;
        if (~(1 & this.field4070[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field4035 >> this.field4069.field1936;
            class60 var5 = (class60) arg2;
            class60 var6;
            if (var5 != null && var5.method418(var4, var4, 20)) {
                var6 = var5;
                var5.method420(76);
            } else {
                var6 = new class60(this.field4069, var4, var4);
            }
            var6.method417(0, var4, var4, 0, -1819929872);
            this.method1912(0, arg1, arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1901(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4048;
        if (this.field4053 != null && arg0 != null) {
            int var7 = -(this.field4069.field1974 * arg2 >> 8) + arg1 >> this.field4069.field1936;
            int var8 = arg3 - (this.field4069.field2055 * arg2 >> 8) >> this.field4069.field1936;
            return this.field4053.method1490(var7, -55, var8, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lbq;[I)V")
    public final void method1900(class307 arg0, int[] arg1) {
        this.field4056.method3594((byte) 103, new class483(this.field4069, this, arg0, arg1));
        ++field4043;
    }

    @OriginalMember(owner = "client!vca", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1904(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4054;
        if (this.field4053 != null && arg0 != null) {
            int var7 = -(this.field4069.field1974 * arg2 >> 8) + arg1 >> this.field4069.field1936;
            int var8 = arg3 - (this.field4069.field2055 * arg2 >> 8) >> this.field4069.field1936;
            this.field4053.method1487(var8, 84, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lhk;IIII[[I[[II)V")
    public class297(class111 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field4069 = arg0;
        this.field4079 = new float[super.field4037 + 1][super.field4034 + 1];
        this.field4055 = new short[arg3 * arg4][];
        this.field4077 = new float[super.field4037 - -1][super.field4034 - -1];
        this.field4064 = new class171[arg3][arg4][];
        this.field4046 = arg2;
        this.field4042 = new int[arg3][arg4][];
        this.field4074 = new int[arg3][arg4][];
        this.field4087 = new byte[arg3 + 1][arg4 + 1];
        this.field4061 = 1 << this.field4044;
        this.field4086 = new float[super.field4037 - -1][super.field4034 + 1];
        this.field4066 = new int[arg3][arg4][];
        this.field4070 = new byte[arg3][arg4];
        this.field4073 = new int[arg3][arg4][];
        this.field4045 = new int[arg3][arg4][];
        for (int var9 = 1; ~var9 > ~super.field4034; ++var9) {
            for (int var10 = 1; ~super.field4037 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var11 * var11 + var12 * var12)));
                this.field4079[var10][var9] = (float) var11 * var13;
                this.field4077[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field4086[var10][var9] = (float) var12 * var13;
            }
        }
        this.field4089 = new class46(128);
        if ((16 & this.field4046) != 0) {
            this.field4053 = new class211(this.field4069, this);
        }
    }

    @OriginalMember(owner = "client!vca", name = "YA", descriptor = "()V")
    public final void method1905() {
        if (~this.field4088 < -1) {
            byte[][] var1 = new byte[super.field4037 - -1][super.field4034 - -1];
            for (int var2 = 1; ~var2 > ~super.field4037; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field4034; ++var103) {
                    var1[var2][var103] = (byte) ((this.field4087[var2][var103 + -1] >> 2) + (this.field4087[var2 + -1][var103] >> 2) + (this.field4087[var2][var103] >> 1) + (this.field4087[var2][var103 + 1] >> 3) + (this.field4087[var2 - -1][var103] >> 3));
                }
            }
            this.field4078 = new class171[this.field4089.method343(-70)];
            this.field4089.method342(this.field4078, -20773);
            for (int var3 = 0; ~var3 > ~this.field4078.length; ++var3) {
                this.field4078[var3].method1308(this.field4088, 65535);
            }
            int var4 = 24;
            if (this.field4050 != null) {
                var4 += 4;
            }
            if ((this.field4046 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field4069.field1935.method3898(this.field4088 * var4, false);
            Stream var6 = new Stream(var5);
            class171[] var7 = new class171[this.field4088];
            int var8 = class484.method2765(this.field4088 / 4, 71);
            if (var8 < 1) {
                var8 = 1;
            }
            class46 var9 = new class46(var8);
            class171[] var10 = new class171[this.field4083];
            for (int var11 = 0; var11 < super.field4037; ++var11) {
                for (int var30 = 0; var30 < super.field4034; ++var30) {
                    if (this.field4074[var11][var30] != null) {
                        class171[] var31 = this.field4064[var11][var30];
                        int[] var32 = this.field4073[var11][var30];
                        int[] var33 = this.field4066[var11][var30];
                        int[] var34 = this.field4045[var11][var30];
                        int[] var35 = this.field4074[var11][var30];
                        int[] var36 = this.field4042 != null ? this.field4042[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field4050 == null ? null : this.field4050[var11][var30];
                        float var38 = this.field4079[var11][var30];
                        float var39 = this.field4077[var11][var30];
                        float var40 = this.field4086[var11][var30];
                        float var41 = this.field4079[var11][var30 - -1];
                        float var42 = this.field4077[var11][var30 - -1];
                        float var43 = this.field4086[var11][var30 - -1];
                        float var44 = this.field4079[var11 - -1][var30 + 1];
                        float var45 = this.field4077[var11 + 1][var30 - -1];
                        float var46 = this.field4086[var11 + 1][var30 + 1];
                        float var47 = this.field4079[var11 - -1][var30];
                        float var48 = this.field4077[var11 + 1][var30];
                        float var49 = this.field4086[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = var1[var11 - -1][var30] & 255;
                        int var54 = 0;
                        label340: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class171 var101 = var31[var55];
                            for (int var102 = 0; var102 < var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label340;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field4055[super.field4037 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field4036) + var32[var57];
                            int var59 = (var30 << super.field4036) + var33[var57];
                            int var60 = var58 >> this.field4044;
                            int var61 = var59 >> this.field4044;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16);
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            int var72;
                            float var73;
                            float var74;
                            if (var67 == 0 && var68 == 0) {
                                var71 = var39;
                                var72 = var69 - var50;
                                var73 = var38;
                                var74 = var40;
                            } else if (~var67 == -1 && super.field4035 == var68) {
                                var72 = var69 - var51;
                                var71 = var42;
                                var73 = var41;
                                var74 = var43;
                            } else if (super.field4035 == var67 && super.field4035 == var68) {
                                var73 = var44;
                                var72 = var69 - var52;
                                var71 = var45;
                                var74 = var46;
                            } else if (super.field4035 == var67 && ~var68 == -1) {
                                var72 = var69 - var53;
                                var73 = var47;
                                var74 = var49;
                                var71 = var48;
                            } else {
                                float var75 = (float) var67 / (float) super.field4035;
                                float var76 = (float) var68 / (float) super.field4035;
                                float var77 = (-var38 + var47) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (-var42 + var45) * var75 + var42;
                                var73 = (var80 - var77) * var76 + var77;
                                var71 = (var81 - var78) * var76 + var78;
                                float var82 = (var46 - var43) * var75 + var43;
                                var74 = (-var79 + var82) * var76 + var79;
                                int var83 = ((-var50 + var53) * var67 >> super.field4036) + var50;
                                int var84 = ((-var51 + var52) * var67 >> super.field4036) + var51;
                                var72 = var69 - (((-var83 + var84) * var68 >> super.field4036) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var72 >> 7;
                                if (var86 < 2) {
                                    var86 = 2;
                                } else if (var86 > 126) {
                                    var86 = 126;
                                }
                                if ((7 & this.field4046) == 0) {
                                    float var87 = this.field4069.field2022[2] * var74 + this.field4069.field2022[0] * var73 + this.field4069.field2022[1] * var71;
                                    var85 = (var87 > 0.0F ? this.field4069.field2008 : this.field4069.field2052) * var87 + this.field4069.field1971;
                                }
                                var70 = class424.field5802[var62 & 65408 | var86];
                            }
                            class154 var88 = null;
                            if (~(this.field4061 - 1 & var58) == -1 && (var59 & this.field4061 - 1) == 0) {
                                var88 = var9.method337(var65, 1);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var72 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (var90 > 126) {
                                        var90 = 126;
                                    }
                                    var89 = class424.field5802[var63 & 65408 | var90];
                                    if (~(7 & this.field4046) == -1) {
                                        float var91 = this.field4069.field2022[2] * var74 + this.field4069.field2022[0] * var73 + this.field4069.field2022[1] * var71;
                                        float var92 = this.field4069.field1971 + var85 * (var85 > 0.0F ? this.field4069.field2008 : this.field4069.field2052);
                                        int var93 = (16722128 & var89) >> 16;
                                        int var94 = var89 >> 8 & 255;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var89 & 255;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (var95 > 255) {
                                            var95 = 255;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (var97 >= 0) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        var89 = var98 | var97 << 8 | var95 << 16;
                                    }
                                }
                                if (this.field4069.field2000) {
                                    var6.method3914((float) var58);
                                    var6.method3914((float) (var64 + this.method1907(var58, (byte) 98, var59)));
                                    var6.method3914((float) var59);
                                    var6.method3908((byte) (var89 >> 16));
                                    var6.method3908((byte) (var89 >> 8));
                                    var6.method3908((byte) var89);
                                    var6.method3908(-1);
                                    var6.method3914((float) var58);
                                    var6.method3914((float) var59);
                                    if (this.field4050 != null) {
                                        var6.method3914((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((7 & this.field4046) != 0) {
                                        var6.method3914(var73);
                                        var6.method3914(var71);
                                        var6.method3914(var74);
                                    }
                                } else {
                                    var6.method3909((float) var58);
                                    var6.method3909((float) (var64 + this.method1907(var58, (byte) -62, var59)));
                                    var6.method3909((float) var59);
                                    var6.method3908((byte) (var89 >> 16));
                                    var6.method3908((byte) (var89 >> 8));
                                    var6.method3908((byte) var89);
                                    var6.method3908(-1);
                                    var6.method3909((float) var58);
                                    var6.method3909((float) var59);
                                    if (this.field4050 != null) {
                                        var6.method3909((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field4046) != 0) {
                                        var6.method3909(var73);
                                        var6.method3909(var71);
                                        var6.method3909(var74);
                                    }
                                }
                                var99 = this.field4060++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method341(var65, new class33(var56[var57]), (byte) 39);
                            } else {
                                var56[var57] = ((class33) var88).field560;
                                var99 = var56[var57] & 65535;
                                if (~var62 != 0 && ~var31[var57].field2528 > ~var7[var99].field2528) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method1306(var85, (byte) 114, var72, var99, var70);
                            }
                            ++this.field4075;
                        }
                    }
                }
            }
            for (int var12 = 0; ~this.field4060 < ~var12; ++var12) {
                class171 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1307(var12, (byte) -1);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field4037; ++var13) {
                for (int var18 = 0; ~var18 > ~super.field4034; ++var18) {
                    short[] var19 = this.field4055[super.field4037 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var19.length < ~var21) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class171 var25 = var7[var22];
                            class171 var26 = var7[var23];
                            class171 var27 = var7[var24];
                            class171 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method1310(var13, var18, var20, 1);
                            }
                            if (var26 != null) {
                                var26.method1310(var13, var18, var20, 1);
                                if (var28 == null || ~var26.field2528 > ~var28.field2528) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1310(var13, var18, var20, 1);
                                if (var28 == null || var28.field2528 > var27.field2528) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1307(var22, (byte) -1);
                                }
                                if (var26 != null) {
                                    var28.method1307(var23, (byte) -1);
                                }
                                if (var27 != null) {
                                    var28.method1307(var24, (byte) -1);
                                }
                                var28.method1310(var13, var18, var20, 1);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3901();
            this.field4084 = this.field4069.method1011(var6.method3900(), var5, -15854, false, var4);
            this.field4085 = new class316(this.field4084, 5126, 3, 0);
            this.field4082 = new class316(this.field4084, 5121, 4, 12);
            byte var14;
            if (this.field4050 == null) {
                this.field4090 = new class316(this.field4084, 5126, 2, 16);
                var14 = 24;
            } else {
                this.field4090 = new class316(this.field4084, 5126, 3, 16);
                var14 = 28;
            }
            if (~(this.field4046 & 7) != -1) {
                this.field4080 = new class316(this.field4084, 5126, 3, var14);
            }
            long[] var15 = new long[this.field4078.length];
            for (int var16 = 0; ~var16 > ~this.field4078.length; ++var16) {
                class171 var17 = this.field4078[var16];
                var15[var16] = var17.field2528;
                var17.method1305(true, this.field4060);
            }
            class352.method2157(var15, (byte) -105, this.field4078);
            if (this.field4053 != null) {
                this.field4053.method1489(-1);
            }
        } else {
            this.field4053 = null;
        }
        ++field4058;
        this.field4074 = null;
        this.field4064 = null;
        this.field4050 = null;
        this.field4079 = this.field4077 = this.field4086 = null;
        this.field4042 = null;
        this.field4073 = this.field4066 = null;
        this.field4089 = null;
        this.field4087 = null;
        this.field4045 = null;
    }

    @OriginalMember(owner = "client!vca", name = "ka", descriptor = "(III)V")
    public final void method1894(int arg0, int arg1, int arg2) {
        ++field4063;
        if (~(this.field4087[arg0][arg1] & 255) > ~arg2) {
            this.field4087[arg0][arg1] = (byte) arg2;
        }
    }
}
