import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class70 extends class142 {

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lar;")
    private class479 field938 = new class479();

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "[[I")
    private int[][] field945;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "Lef;")
    public class338 field957;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    private int field960;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    private int field961;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "[[[I")
    private int[][][] field953;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "[[F")
    private float[][] field976;

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "[[S")
    public short[][] field969;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "[[[I")
    private int[][][] field941;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[[[I")
    private int[][][] field937;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "[[[Lln;")
    private class257[][][] field948;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "[[[I")
    public int[][][] field949;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "[[F")
    private float[][] field977;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "[[B")
    private byte[][] field944;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    public int field963;

    @OriginalMember(owner = "client!eg", name = "jb", descriptor = "[[F")
    private float[][] field988;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "[[[I")
    public int[][][] field968;

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "[[B")
    private byte[][] field986;

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "Lmn;")
    private class247 field981;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "Lgb;")
    private class143 field964;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Lqp;")
    public static class466 field966 = new class466("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!eg", name = "T", descriptor = "Ldi;")
    public static class83 field972 = new class83(12, 3);

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "Lwj;")
    public static class270 field973 = new class270(18, 12);

    @OriginalMember(owner = "client!eg", name = "lb", descriptor = "I")
    public static int field990 = 0;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
    private int field987;

    @OriginalMember(owner = "client!eg", name = "kb", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "Lem;")
    public static class150 field974;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "Lap;")
    private class334 field980;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "Lwc;")
    public class48 field978;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "Lwc;")
    public class48 field979;

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "Lwc;")
    public class48 field985;

    @OriginalMember(owner = "client!eg", name = "mb", descriptor = "Lwc;")
    private class48 field991;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "Lju;")
    public static class82 field982;

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "[Lln;")
    private class257[] field984;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "[[[I")
    private int[][][] field954;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I", line = 9)
    public final int method361(int arg0, int arg1) {
        ++field936;
        int var3 = arg0 >> super.field2035;
        int var4 = arg1 >> super.field2035;
        if (var3 >= 0 && var4 >= 0 && super.field2037 + -1 >= var3 && var4 <= super.field2031 + -1) {
            int var5 = super.field2030 - 1 & arg0;
            int var6 = arg1 & super.field2030 + -1;
            int var7 = (super.field2030 - var5) * this.field945[var3][var4] + this.field945[var3 + 1][var4] * var5 >> super.field2035;
            int var8 = (-var5 + super.field2030) * this.field945[var3][var4 + 1] + this.field945[var3 + 1][var4 + 1] * var5 >> super.field2035;
            return (-var6 + super.field2030) * var7 + var6 * var8 >> super.field2035;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII[[ZIZ)V", line = 33)
    private final void method585(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int arg5, boolean arg6) {
        ++field971;
        if (this.field984 != null) {
            float var8 = this.field957.field4805;
            float var9 = this.field957.field4813;
            int var10 = arg1 + arg1 + 1;
            int var11 = var10 * var10;
            if (var11 > class65.field898.length) {
                class65.field898 = new int[var11];
            }
            if (~(this.field942 * 2) < ~class194.field2768.field5678.length) {
                class194.field2768 = new class391(this.field942 * 2);
            }
            int var12 = arg0 - arg1;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg2 - arg1;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg0 + arg1;
            if (~var16 < ~(super.field2037 + -1)) {
                var16 = super.field2037 - 1;
            }
            int var17 = arg1 + arg2;
            if (super.field2031 + -1 < var17) {
                var17 = super.field2031 + -1;
            }
            class320.field4378 = 0;
            for (int var18 = var12; ~var16 <= ~var18; ++var18) {
                boolean[] var24 = arg4[-var13 + var18];
                for (int var25 = var14; ~var17 <= ~var25; ++var25) {
                    if (var24[-var15 + var25]) {
                        class65.field898[class320.field4378++] = super.field2037 * var25 + var18;
                    }
                }
            }
            if (~arg5 != 0) {
                this.field957.method1928((float) arg5, true);
                this.field957.method1995((byte) 104);
            } else {
                this.field957.method1988(-1);
            }
            this.field957.method1937(~(this.field963 & 7) != -1, -104);
            for (int var19 = 0; this.field984.length > var19; ++var19) {
                this.field984[var19].method1547(class320.field4378, -65536, class65.field898);
            }
            if (!this.field938.method2807(arg3 + 118)) {
                int var20 = this.field957.field4833;
                int var21 = this.field957.field4844;
                this.field957.method241(0, var21, this.field957.field4884);
                this.field957.method245(var9, var8 - 4.0F);
                this.field957.method1937(false, -115);
                this.field957.method1985(false, (byte) 54);
                this.field957.method1976(arg3 + -117, 128);
                this.field957.method1944(-2, 12429);
                this.field957.method1996(arg3 + -5, this.field957.field4852);
                this.field957.method1963(true, 8448, 7681);
                this.field957.method1975(34176, 34166, 770, 0);
                this.field957.method1973(34167, 0, 0, 770);
                for (class260 var22 = this.field938.method2818((byte) 106); var22 != null; var22 = this.field938.method2820((byte) -58)) {
                    class451 var23 = (class451) var22;
                    var23.method2665(110, arg4, arg2, arg0, arg1);
                }
                this.field957.method1975(arg3 ^ 34183, 5890, 768, 0);
                this.field957.method1973(5890, 0, 0, 770);
                this.field957.method1996(2, (class40) null);
                this.field957.method241(var20, var21, this.field957.field4884);
            }
            if (this.field964 != null) {
                this.field957.method245(var9, var8 - 8.0F);
                this.field957.method1988(arg3 + -8);
                this.field957.method1968(this.field979, (class48) null, arg3 ^ 108, (class48) null, this.field985);
                this.field964.method968(arg2, arg1, arg0, arg4, arg6, (byte) 102);
            }
            this.field957.method245(var9, var8);
        }
        if (arg3 != 7) {
            this.field938 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "(Lba;IIIIZ)V", line = 188)
    public final void method363(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field952;
        if (this.field964 != null && arg0 != null) {
            int var7 = -(this.field957.field4836 * arg2 >> 8) + arg1 >> this.field957.field4744;
            int var8 = -(this.field957.field4887 * arg2 >> 8) + arg3 >> this.field957.field4744;
            this.field964.method964(0, var8, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lba;IIIIZ)Z", line = 209)
    public final boolean method355(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field959;
        if (this.field964 != null && arg0 != null) {
            int var7 = -(this.field957.field4836 * arg2 >> 8) + arg1 >> this.field957.field4744;
            int var8 = -(this.field957.field4887 * arg2 >> 8) + arg3 >> this.field957.field4744;
            return this.field964.method967(arg0, var7, var8, (byte) 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "(IILba;)Lba;", line = 226)
    public final class263 method359(int arg0, int arg1, class263 arg2) {
        ++field940;
        if ((1 & this.field944[arg0][arg1]) == 0) {
            return null;
        } else {
            int var4 = super.field2030 >> this.field957.field4744;
            class462 var5 = (class462) arg2;
            class462 var6;
            if (var5 != null && var5.method2718(var4, 6, var4)) {
                var6 = var5;
                var5.method2717(92);
            } else {
                var6 = new class462(this.field957, var4, var4);
            }
            var6.method2716(0, 0, var4, (byte) 121, var4);
            this.method587(4606, arg1, var6, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 256)
    public final void method360(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field954 == null) {
            this.field954 = new int[super.field2037][super.field2031][];
        }
        ++field951;
        if (arg3 != null && this.field941 == null) {
            this.field941 = new int[super.field2037][super.field2031][];
        }
        this.field968[arg0][arg1] = arg2;
        this.field949[arg0][arg1] = arg4;
        this.field937[arg0][arg1] = arg6;
        this.field953[arg0][arg1] = arg7;
        if (this.field954 != null) {
            this.field954[arg0][arg1] = arg5;
        }
        if (this.field941 != null) {
            this.field941[arg0][arg1] = arg3;
        }
        class257[] var15 = this.field948[arg0][arg1] = new class257[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
            class260 var19;
            for (var19 = this.field981.method1492(var17, 6340); var19 != null; var19 = this.field981.method1488(1)) {
                class257 var20 = (class257) var19;
                if (~arg8[var16] == ~var20.field3571 && (float) arg9[var16] == var20.field3576 && ~var20.field3568 == ~arg10 && ~var20.field3583 == ~arg11 && ~var20.field3575 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class257) var19;
            } else {
                var15[var16] = new class257(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field981.method1487(-51, var17, var15[var16]);
            }
        }
        if (arg13) {
            this.field944[arg0][arg1] = (byte) class255.method1532(this.field944[arg0][arg1], 1);
        }
        if (~this.field987 > ~arg6.length) {
            this.field987 = arg6.length;
        }
        this.field983 += arg6.length;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljd;[I)V", line = 328)
    public final void method364(class153 arg0, int[] arg1) {
        this.field938.method2809(new class451(this.field957, this, arg0, arg1), 2);
        ++field958;
    }

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "(II)I", line = 338)
    public final int method351(int arg0, int arg1) {
        ++field970;
        return this.field945[arg0][arg1];
    }

    @OriginalMember(owner = "client!eg", name = "ca", descriptor = "()V", line = 349)
    public final void method365() {
        ++field967;
        if (~this.field983 < -1) {
            byte[][] var1 = new byte[super.field2037 - -1][super.field2031 + 1];
            for (int var2 = 1; ~super.field2037 < ~var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field2031; ++var103) {
                    var1[var2][var103] = (byte) ((this.field986[var2 + 1][var103] >> 3) + (this.field986[var2][var103 + -1] >> 2) + (this.field986[var2 + -1][var103] >> 2) + (this.field986[var2][var103 + 1] >> 3) + (this.field986[var2][var103] >> 1));
                }
            }
            this.field984 = new class257[this.field981.method1486((byte) -81)];
            this.field981.method1485((byte) -16, this.field984);
            for (int var3 = 0; var3 < this.field984.length; ++var3) {
                this.field984[var3].method1550(this.field983, 18481);
            }
            int var4 = 24;
            if (this.field954 != null) {
                var4 += 4;
            }
            if (~(this.field963 & 7) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field957.field4742.method2602(this.field983 * var4);
            NativeStream var6 = new NativeStream(var5);
            class257[] var7 = new class257[this.field983];
            int var8 = class498.method2905(this.field983 / 4, (byte) -127);
            if (var8 < 1) {
                var8 = 1;
            }
            class247 var9 = new class247(var8);
            class257[] var10 = new class257[this.field987];
            for (int var11 = 0; ~super.field2037 < ~var11; ++var11) {
                for (int var30 = 0; var30 < super.field2031; ++var30) {
                    if (this.field937[var11][var30] != null) {
                        class257[] var31 = this.field948[var11][var30];
                        int[] var32 = this.field968[var11][var30];
                        int[] var33 = this.field949[var11][var30];
                        int[] var34 = this.field953[var11][var30];
                        int[] var35 = this.field937[var11][var30];
                        int[] var36 = this.field941 == null ? null : this.field941[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field954 != null ? this.field954[var11][var30] : null;
                        float var38 = this.field988[var11][var30];
                        float var39 = this.field977[var11][var30];
                        float var40 = this.field976[var11][var30];
                        float var41 = this.field988[var11][var30 + 1];
                        float var42 = this.field977[var11][var30 + 1];
                        float var43 = this.field976[var11][var30 - -1];
                        float var44 = this.field988[var11 + 1][var30 - -1];
                        float var45 = this.field977[var11 + 1][var30 + 1];
                        float var46 = this.field976[var11 + 1][var30 + 1];
                        float var47 = this.field988[var11 + 1][var30];
                        float var48 = this.field977[var11 + 1][var30];
                        float var49 = this.field976[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 - -1];
                        int var52 = 255 & var1[var11 - -1][var30 + 1];
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label338: for (int var55 = 0; var35.length > var55; ++var55) {
                            class257 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field969[super.field2037 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field2035) + var32[var57];
                            int var59 = (var30 << super.field2035) - -var33[var57];
                            int var60 = var58 >> this.field960;
                            int var61 = var59 >> this.field960;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71;
                            int var72;
                            float var73;
                            float var74;
                            if (var67 == 0 && ~var68 == -1) {
                                var71 = var39;
                                var72 = var69 - var50;
                                var73 = var40;
                                var74 = var38;
                            } else if (~var67 == -1 && ~super.field2030 == ~var68) {
                                var73 = var43;
                                var71 = var42;
                                var74 = var41;
                                var72 = var69 - var51;
                            } else if (super.field2030 == var67 && super.field2030 == var68) {
                                var71 = var45;
                                var73 = var46;
                                var72 = var69 - var52;
                                var74 = var44;
                            } else if (super.field2030 == var67 && ~var68 == -1) {
                                var72 = var69 - var53;
                                var71 = var48;
                                var74 = var47;
                                var73 = var49;
                            } else {
                                float var75 = (float) var67 / (float) super.field2030;
                                float var76 = (float) var68 / (float) super.field2030;
                                float var77 = (-var38 + var47) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var74 = (var80 - var77) * var76 + var77;
                                var71 = (-var78 + var81) * var76 + var78;
                                var73 = (-var79 + var82) * var76 + var79;
                                int var83 = ((var53 - var50) * var67 >> super.field2035) + var50;
                                int var84 = var51 - -((-var51 + var52) * var67 >> super.field2035);
                                var72 = var69 - (((-var83 + var84) * var68 >> super.field2035) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var72 >> 7;
                                if (var86 >= 2) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class166.field2487[var86 | var62 & 65408];
                                if (~(7 & this.field963) == -1) {
                                    float var87 = this.field957.field4769[2] * var73 + this.field957.field4769[0] * var74 + this.field957.field4769[1] * var71;
                                    var85 = var87 * (var87 > 0.0F ? this.field957.field4784 : this.field957.field4846) + this.field957.field4825;
                                }
                            }
                            class260 var88 = null;
                            if ((var58 & this.field961 - 1) == 0 && (var59 & this.field961 + -1) == 0) {
                                var88 = var9.method1492(var65, 6340);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class44) var88).field537;
                                var89 = 65535 & var56[var57];
                                if (~var62 != 0 && ~var7[var89].field3615 < ~var31[var57].field3615) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (var62 != var63) {
                                    int var90 = (127 & var63) * var72 >> 7;
                                    if (~var90 > -3) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var91 = class166.field2487[65408 & var63 | var90];
                                    if (~(this.field963 & 7) == -1) {
                                        float var92 = this.field957.field4769[2] * var73 + this.field957.field4769[1] * var71 + this.field957.field4769[0] * var74;
                                        float var93 = this.field957.field4825 + (!(var85 > 0.0F) ? this.field957.field4846 : this.field957.field4784) * var85;
                                        int var94 = (16769193 & var91) >> 16;
                                        int var95 = (var91 & 65293) >> 8;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = 255 & var91;
                                        int var98 = (int) ((float) var95 * var93);
                                        if (var96 >= 0) {
                                            if (var96 > 255) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        int var99 = (int) ((float) var97 * var93);
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        if (~var99 > -1) {
                                            var99 = 0;
                                        } else if (var99 > 255) {
                                            var99 = 255;
                                        }
                                        var91 = var99 | var98 << 8 | var96 << 16;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (this.field957.field4772) {
                                    var6.method2595((float) var58);
                                    var6.method2595((float) (var64 + this.method361(var58, var59)));
                                    var6.method2595((float) var59);
                                    var6.method2593((byte) (var91 >> 16));
                                    var6.method2593((byte) (var91 >> 8));
                                    var6.method2593((byte) var91);
                                    var6.method2593(-1);
                                    var6.method2595((float) var58);
                                    var6.method2595((float) var59);
                                    if (this.field954 != null) {
                                        var6.method2595((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((this.field963 & 7) != 0) {
                                        var6.method2595(var74);
                                        var6.method2595(var71);
                                        var6.method2595(var73);
                                    }
                                } else {
                                    var6.method2598((float) var58);
                                    var6.method2598((float) (var64 + this.method361(var58, var59)));
                                    var6.method2598((float) var59);
                                    var6.method2593((byte) (var91 >> 16));
                                    var6.method2593((byte) (var91 >> 8));
                                    var6.method2593((byte) var91);
                                    var6.method2593(-1);
                                    var6.method2598((float) var58);
                                    var6.method2598((float) var59);
                                    if (this.field954 != null) {
                                        var6.method2598((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((7 & this.field963) != 0) {
                                        var6.method2598(var74);
                                        var6.method2598(var71);
                                        var6.method2598(var73);
                                    }
                                }
                                var89 = this.field946++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method1487(-37, var65, new class44(var56[var57]));
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method1548(var85, var72, var89, var70, true);
                            }
                            ++this.field942;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field946; ++var12) {
                class257 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1545(var12, (byte) 47);
                }
            }
            for (int var13 = 0; var13 < super.field2037; ++var13) {
                for (int var18 = 0; var18 < super.field2031; ++var18) {
                    short[] var19 = this.field969[super.field2037 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class257 var25 = var7[var22];
                            class257 var26 = var7[var23];
                            class257 var27 = var7[var24];
                            class257 var28 = null;
                            if (var25 != null) {
                                var25.method1549(var13, var18, 1, var20);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method1549(var13, var18, 1, var20);
                                if (var28 == null || ~var26.field3615 > ~var28.field3615) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1549(var13, var18, 1, var20);
                                if (var28 == null || ~var28.field3615 < ~var27.field3615) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1545(var22, (byte) -121);
                                }
                                if (var26 != null) {
                                    var28.method1545(var23, (byte) 49);
                                }
                                if (var27 != null) {
                                    var28.method1545(var24, (byte) 113);
                                }
                                var28.method1549(var13, var18, 1, var20);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2599();
            this.field980 = this.field957.method1940(var4, false, var6.method2596(), var5, -113);
            this.field979 = new class48(this.field980, 5126, 3, 0);
            this.field991 = new class48(this.field980, 5121, 4, 12);
            byte var14;
            if (this.field954 != null) {
                var14 = 28;
                this.field985 = new class48(this.field980, 5126, 3, 16);
            } else {
                var14 = 24;
                this.field985 = new class48(this.field980, 5126, 2, 16);
            }
            if ((this.field963 & 7) != 0) {
                this.field978 = new class48(this.field980, 5126, 3, var14);
            }
            long[] var15 = new long[this.field984.length];
            for (int var16 = 0; var16 < this.field984.length; ++var16) {
                class257 var17 = this.field984[var16];
                var15[var16] = var17.field3615;
                var17.method1544(this.field946, true);
            }
            class223.method1385(this.field984, var15, true);
            if (this.field964 != null) {
                this.field964.method966(97);
            }
        } else {
            this.field964 = null;
        }
        this.field986 = null;
        this.field953 = null;
        this.field988 = this.field977 = this.field976 = null;
        this.field981 = null;
        this.field937 = null;
        this.field954 = null;
        this.field968 = this.field949 = null;
        this.field948 = null;
        this.field941 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIII[[Z)V", line = 930)
    public final void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field943;
        if (this.field983 > 0) {
            this.field957.method1964(116);
            this.field957.method1932(false, -32);
            this.field957.method1937(false, -116);
            this.field957.method1938(34160, false);
            this.field957.method1985(false, (byte) -92);
            this.field957.method1976(-127, 0);
            this.field957.method1944(-2, 12429);
            this.field957.method1996(2, (class40) null);
            class92.field1318[15] = 1.0F;
            class92.field1318[2] = 0.0F;
            class92.field1318[11] = 0.0F;
            class92.field1318[5] = (float) arg2 / ((float) super.field2030 * 128.0F * (float) this.field957.field4548);
            class92.field1318[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field957.field4549) + -1.0F;
            class92.field1318[7] = 0.0F;
            class92.field1318[14] = 0.0F;
            class92.field1318[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field957.field4548) + 1.0F;
            class92.field1318[1] = 0.0F;
            class92.field1318[0] = (float) arg2 / ((float) super.field2030 * 128.0F * (float) this.field957.field4549);
            class92.field1318[10] = 0.0F;
            class92.field1318[6] = 0.0F;
            class92.field1318[8] = 0.0F;
            class92.field1318[4] = 0.0F;
            class92.field1318[3] = 0.0F;
            class92.field1318[9] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class92.field1318, 0);
            class92.field1318[14] = 0.0F;
            class92.field1318[9] = 1.0F;
            class92.field1318[2] = 0.0F;
            class92.field1318[13] = 0.0F;
            class92.field1318[4] = 0.0F;
            class92.field1318[3] = 0.0F;
            class92.field1318[7] = 0.0F;
            class92.field1318[8] = 0.0F;
            class92.field1318[6] = 1.0F;
            class92.field1318[5] = 0.0F;
            class92.field1318[0] = 1.0F;
            class92.field1318[15] = 1.0F;
            class92.field1318[10] = 0.0F;
            class92.field1318[11] = 0.0F;
            class92.field1318[1] = 0.0F;
            class92.field1318[12] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class92.field1318, 0);
            if (~(this.field963 & 7) != -1) {
                this.field957.method1937(true, -107);
                this.field957.method1927(-31484);
            } else {
                this.field957.method1937(false, -121);
            }
            this.field957.method1968(this.field979, this.field991, 123, this.field978, this.field985);
            if (~class194.field2768.field5678.length > ~(this.field942 * 2)) {
                class194.field2768 = new class391(this.field942 * 2);
            } else {
                class194.field2768.field5719 = 0;
            }
            int var9 = 0;
            if (!this.field957.field4772) {
                for (int var10 = arg4; arg6 > var10; ++var10) {
                    int var11 = super.field2037 * var10 + arg3;
                    for (int var12 = arg3; ~arg5 < ~var12; ++var12) {
                        if (arg7[-arg3 + var12][-arg4 + var10]) {
                            short[] var13 = this.field969[var11];
                            if (var13 != null) {
                                for (int var14 = 0; ~var13.length < ~var14; ++var14) {
                                    ++var9;
                                    class194.field2768.method2310((byte) 108, 65535 & var13[var14]);
                                }
                            }
                        }
                        ++var11;
                    }
                }
            } else {
                for (int var15 = arg4; var15 < arg6; ++var15) {
                    int var17 = super.field2037 * var15 + arg3;
                    for (int var18 = arg3; arg5 > var18; ++var18) {
                        if (arg7[-arg3 + var18][-arg4 + var15]) {
                            short[] var19 = this.field969[var17];
                            if (var19 != null) {
                                for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                                    ++var9;
                                    class194.field2768.method2355(1686288168, 65535 & var19[var20]);
                                }
                            }
                        }
                        ++var17;
                    }
                }
            }
            if (~var9 < -1) {
                class409 var16 = new class409(this.field957, 5123, class194.field2768.field5678, class194.field2768.field5719);
                this.field957.method1981((byte) 69, var9, 0, 4, var16);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III[[ZZ)V", line = 1098)
    public final void method362(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field965;
        this.method585(arg0, arg2, arg1, 7, arg3, -1, arg4);
    }

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "(III)V", line = 1106)
    public final void method366(int arg0, int arg1, int arg2) {
        ++field955;
        if (~(this.field986[arg0][arg1] & 255) > ~arg2) {
            this.field986[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 1120)
    public static final void method586(byte arg0) {
        int var1 = -21 / ((arg0 - 53) / 56);
        ++field962;
        class355 var2 = null;
        try {
            class56 var3 = class202.field2840.method2954(-29744, "2");
            while (~var3.field667 == -1) {
                class157.method1046(-128, 1L);
            }
            if (var3.field667 == 1) {
                var2 = (class355) var3.field670;
                byte[] var4 = new byte[(int) var2.method2125(76)];
                int var6;
                for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                    var6 = var2.method2124(var5, var4.length - var5, var4, false);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class264.method1583(new class391(var4), 17351);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2126(-1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Lba;IIIIZ)V", line = 1171)
    public final void method352(class263 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field989;
        if (this.field964 != null && arg0 != null) {
            int var7 = -(this.field957.field4836 * arg2 >> 8) + arg1 >> this.field957.field4744;
            int var8 = -(this.field957.field4887 * arg2 >> 8) + arg3 >> this.field957.field4744;
            this.field964.method963(var8, var7, 1, arg0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILfk;I)V", line = 1189)
    private final void method587(int arg0, int arg1, class462 arg2, int arg3) {
        ++field950;
        int[] var5 = this.field968[arg3][arg1];
        int[] var6 = this.field949[arg3][arg1];
        int var7 = var5.length;
        if (var7 > class365.field5357.length) {
            class365.field5357 = new int[var7];
            class249.field3445 = new int[var7];
        }
        if (arg0 != 4606) {
            this.field944 = null;
        }
        for (int var8 = 0; var8 < var7; ++var8) {
            class365.field5357[var8] = class251.method1501(255, var5[var8]) >> this.field957.field4744;
            class249.field3445[var8] = class251.method1501(255, var6[var8]) >> this.field957.field4744;
        }
        int var9 = 0;
        while (~var9 > ~var7) {
            int var10 = class365.field5357[var9];
            int var11 = class249.field3445[var9++];
            int var12 = class365.field5357[var9];
            int var13 = class249.field3445[var9++];
            int var14 = class365.field5357[var9];
            int var15 = class249.field3445[var9++];
            if (~((var10 - var12) * (-var15 + var13) - (var14 - var12) * (-var11 + var13)) < -1) {
                arg2.method2715(var15, var11, var14, var13, var10, var12, (byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lef;IIII[[I[[II)V", line = 1255)
    public class70(class338 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field945 = arg5;
        this.field957 = arg0;
        this.field960 = super.field2035 + -2;
        this.field961 = 1 << this.field960;
        this.field953 = new int[arg3][arg4][];
        this.field976 = new float[super.field2037 + 1][super.field2031 + 1];
        this.field969 = new short[arg3 * arg4][];
        this.field941 = new int[arg3][arg4][];
        this.field937 = new int[arg3][arg4][];
        this.field948 = new class257[arg3][arg4][];
        this.field949 = new int[arg3][arg4][];
        this.field977 = new float[super.field2037 - -1][super.field2031 - -1];
        this.field944 = new byte[arg3][arg4];
        this.field963 = arg2;
        this.field988 = new float[super.field2037 + 1][super.field2031 - -1];
        this.field968 = new int[arg3][arg4][];
        this.field986 = new byte[arg3 + 1][arg4 + 1];
        for (int var9 = 1; ~var9 > ~super.field2031; ++var9) {
            for (int var10 = 1; super.field2037 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field988[var10][var9] = (float) var11 * var13;
                this.field977[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field976[var10][var9] = (float) var12 * var13;
            }
        }
        this.field981 = new class247(128);
        if (~(16 & this.field963) != -1) {
            this.field964 = new class143(this.field957, this);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)V", line = 1312)
    public final void method358(int arg0, int arg1) {
        ++field956;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1319)
    public final void method353(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field947;
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
        this.method360(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V", line = 1413)
    public static void method588(int arg0) {
        if (arg0 != 5126) {
            method589(-48, -86, 40);
        }
        field982 = null;
        field973 = null;
        field974 = null;
        field966 = null;
        field972 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)Z", line = 1428)
    public static final boolean method589(int arg0, int arg1, int arg2) {
        ++field939;
        int var3 = 127 / ((58 - arg0) / 38);
        return class50.method440(arg2, arg1, 1) || class333.method1916(84, arg1, arg2);
    }
}
