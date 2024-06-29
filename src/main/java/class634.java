import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class634 extends class136 {

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "F")
    private float field8876 = -3.4028235E38F;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "F")
    private float field8907 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lsu;")
    private class192 field8912 = new class192();

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "[[I")
    private int[][] field8906;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Lgj;")
    public class580 field8881;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    private int field8884;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "[[S")
    public short[][] field8893;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "[[[I")
    public int[][][] field8890;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "[[[I")
    public int[][][] field8887;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "[[[I")
    private int[][][] field8911;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "[[[I")
    private int[][][] field8901;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    private int field8892;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "[[F")
    private float[][] field8916;

    @OriginalMember(owner = "client!kb", name = "ob", descriptor = "[[F")
    private float[][] field8924;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "[[[I")
    public int[][][] field8900;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "[[F")
    private float[][] field8920;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "[[[Lcn;")
    private class474[][][] field8870;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "[[B")
    private byte[][] field8878;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "[[B")
    private byte[][] field8915;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public int field8880;

    @OriginalMember(owner = "client!kb", name = "pb", descriptor = "Loj;")
    private class346 field8925;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Lqd;")
    private class412 field8888;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "[F")
    public static float[] field8873 = new float[4];

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lws;")
    public static class326 field8877 = class425.method2414((byte) 105);

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "Lfc;")
    public static class235 field8918 = new class235(46, -2);

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "F")
    public static float field8913;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    private int field8885;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    private int field8899;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
    private int field8917;

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "I")
    private int field8921;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "Lpj;")
    public static class132 field8882;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lst;")
    public static class397 field8875;

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "Liq;")
    private class555 field8919;

    @OriginalMember(owner = "client!kb", name = "nb", descriptor = "Liq;")
    private class555 field8923;

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "Lfl;")
    public class677 field8922;

    @OriginalMember(owner = "client!kb", name = "qb", descriptor = "[Lcn;")
    private class474[] field8926;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "[[[I")
    private int[][][] field8908;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)Lrp;", line = 4)
    public static final class400 method3521(int arg0, int arg1) {
        ++field8903;
        class400 var2 = (class400) class159.field2383.method1986((byte) -125, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class267.field3790.method940(1, arg1, 0);
            class400 var4 = new class400();
            var4.field5565 = arg1;
            if (var3 != null) {
                var4.method2275(0, new class96(var3));
            }
            var4.method2273((byte) 104);
            if (~var4.field5561 == -3 && class424.field5977.method2061(-17305, (long) arg1) == null) {
                class424.field5977.method2063((long) arg1, 1, new class108(class156.field2361));
                class376.field5326[class156.field2361++] = var4;
            }
            if (arg0 >= -78) {
                method3524(false);
            }
            class159.field2383.method1985(var4, (long) arg1, (byte) -102);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kb", name = "aa", descriptor = "(Lw;IIIIZ)V", line = 41)
    public final void method277(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8909;
        if (this.field8888 != null && arg0 != null) {
            int var7 = -(this.field8881.field8054 * arg2 >> 8) + arg1 >> this.field8881.field8036;
            int var8 = arg3 - (this.field8881.field8042 * arg2 >> 8) >> this.field8881.field8036;
            this.field8888.method2346(arg0, (byte) -93, var7, var8);
        }
    }

    @OriginalMember(owner = "client!kb", name = "EA", descriptor = "(III)V", line = 63)
    public final void method272(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(this.field8915[arg0][arg1] & 255)) {
            this.field8915[arg0][arg1] = (byte) arg2;
        }
        ++field8896;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lgj;IIII[[I[[II)V", line = 77)
    public class634(class580 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field8906 = arg5;
        this.field8881 = arg0;
        this.field8884 = super.field1921 + -2;
        this.field8893 = new short[arg3 * arg4][];
        this.field8890 = new int[arg3][arg4][];
        this.field8887 = new int[arg3][arg4][];
        this.field8911 = new int[arg3][arg4][];
        this.field8901 = new int[arg3][arg4][];
        this.field8892 = 1 << this.field8884;
        this.field8916 = new float[super.field1918 + 1][super.field1916 + 1];
        this.field8924 = new float[super.field1918 - -1][super.field1916 - -1];
        this.field8900 = new int[arg3][arg4][];
        this.field8920 = new float[super.field1918 + 1][super.field1916 + 1];
        this.field8870 = new class474[arg3][arg4][];
        this.field8878 = new byte[arg3][arg4];
        this.field8915 = new byte[arg3 + 1][arg4 + 1];
        this.field8880 = arg2;
        for (int var9 = 0; ~var9 >= ~super.field1916; ++var9) {
            for (int var10 = 0; var10 <= super.field1918; ++var10) {
                int var11 = this.field8906[var10][var9];
                if ((float) var11 < this.field8907) {
                    this.field8907 = (float) var11;
                }
                if ((float) var11 > this.field8876) {
                    this.field8876 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && super.field1918 > var10 && super.field1916 > var9) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * arg7 * 4 + var13 * var13)));
                    this.field8920[var10][var9] = (float) var12 * var14;
                    this.field8916[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field8924[var10][var9] = (float) var13 * var14;
                }
            }
        }
        --this.field8907;
        ++this.field8876;
        this.field8925 = new class346(128);
        if (~(this.field8880 & 16) != -1) {
            this.field8888 = new class412(this.field8881, this);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII[[Z)V", line = 147)
    public final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field8897;
        if (this.field8921 > 0) {
            class659 var9 = this.field8881.method3202((byte) -62, this.field8885);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; ~var13 > -5; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method779((byte) -20, true);
                if (var14 != null) {
                    Stream var15 = this.field8881.method3212(var14, (byte) -112);
                    if (Stream.method3418()) {
                        for (int var16 = arg4; var16 < arg6; ++var16) {
                            int var17 = super.field1918 * var16 + arg3;
                            for (int var18 = arg3; var18 < arg5; ++var18) {
                                if (arg7[var18 - arg3][var16 - arg4]) {
                                    short[] var19 = this.field8893[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var20 < var19.length; ++var20) {
                                            int var21 = 65535 & var19[var20];
                                            ++var10;
                                            var15.method3425(var21);
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            if (var12 < var21) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~var22 > ~arg6; ++var22) {
                            int var25 = super.field1918 * var22 + arg3;
                            for (int var26 = arg3; ~arg5 < ~var26; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field8893[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (var11 > var29) {
                                                var11 = var29;
                                            }
                                            var15.method3416(var29);
                                            ++var10;
                                            if (~var29 < ~var12) {
                                                var12 = var29;
                                            }
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3426();
                    if (var9.method774(-22324)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field8881.method3245(-32);
                this.field8881.method3207(false, 0);
                this.field8881.method3172(123, false);
                this.field8881.method3195(15420, false);
                this.field8881.method3250(false, false);
                this.field8881.method3242(-2, 0);
                this.field8881.method3183(false, 128, -2, false);
                this.field8881.method3232(false, (class467) null);
                class367 var23 = this.field8881.method3216(1);
                float[] var24 = this.field8881.method3181((byte) -34);
                var24[1] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field1919 * 128.0F * (float) this.field8881.field7876);
                var24[0] = (float) arg2 / ((float) super.field1919 * 128.0F * (float) this.field8881.field7934);
                var24[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field8881.field7876;
                var24[11] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field8881.field7934) + -1.0F;
                var24[4] = 0.0F;
                var24[7] = 0.0F;
                var24[10] = 1.0F / (this.field8876 - this.field8907);
                var24[8] = 0.0F;
                var24[3] = 0.0F;
                var24[6] = 0.0F;
                var24[15] = 1.0F;
                var24[14] = -this.field8907 / (this.field8876 - this.field8907);
                var24[9] = 0.0F;
                var24[2] = 0.0F;
                var23.method2143(0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 26176, 0.0F, 1.0F, 0.0F);
                this.field8881.method3184(0);
                this.field8881.method3228(true);
                if ((7 & this.field8880) != 0) {
                    this.field8881.method3172(93, true);
                    this.field8881.method298(-124);
                } else {
                    this.field8881.method3172(125, false);
                }
                this.field8881.method295(false, 116);
                this.field8881.method313(this.field8919, 15, 0);
                this.field8881.method313(this.field8923, 15, 1);
                this.field8881.method348((byte) -62, this.field8922);
                this.field8881.method318(-var11 + var12 + 1, 4025, var10 / 3, var11, var9, class47.field697, 0);
                this.field8881.method295(true, -27);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "ba", descriptor = "()V", line = 344)
    public final void method270() {
        if (~this.field8921 < -1) {
            byte[][] var1 = new byte[super.field1918 + 1][super.field1916 + 1];
            for (int var2 = 1; ~super.field1918 < ~var2; ++var2) {
                for (int var107 = 1; var107 < super.field1916; ++var107) {
                    var1[var2][var107] = (byte) ((this.field8915[var2][var107 + -1] >> 2) + (this.field8915[var2 + -1][var107] >> 2) + (this.field8915[var2 + 1][var107] >> 3) + (this.field8915[var2][var107 - -1] >> 3) + (this.field8915[var2][var107] >> 1));
                }
            }
            class474[] var3 = new class474[this.field8925.method2057(0)];
            this.field8925.method2059((byte) -88, var3);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4].method2698(this.field8921, 26632);
            }
            int var5 = 20;
            if (this.field8908 != null) {
                var5 += 4;
            }
            if (~(7 & this.field8880) != -1) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field8881.field7831.method3413(this.field8921 * 4, false);
            NativeHeapBuffer var7 = this.field8881.field7831.method3413(this.field8921 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class474[] var10 = new class474[this.field8921];
            int var11 = class694.method3810(this.field8921 / 4, 71828324);
            if (var11 < 1) {
                var11 = 1;
            }
            class346 var12 = new class346(var11);
            class474[] var13 = new class474[this.field8917];
            for (int var14 = 0; var14 < super.field1918; ++var14) {
                for (int var34 = 0; ~var34 > ~super.field1916; ++var34) {
                    if (this.field8900[var14][var34] != null) {
                        class474[] var35 = this.field8870[var14][var34];
                        int[] var36 = this.field8890[var14][var34];
                        int[] var37 = this.field8887[var14][var34];
                        int[] var38 = this.field8901[var14][var34];
                        int[] var39 = this.field8900[var14][var34];
                        int[] var40 = this.field8911 != null ? this.field8911[var14][var34] : null;
                        int[] var41 = this.field8908 != null ? this.field8908[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field8920[var14][var34];
                        float var43 = this.field8916[var14][var34];
                        float var44 = this.field8924[var14][var34];
                        float var45 = this.field8920[var14][var34 + 1];
                        float var46 = this.field8916[var14][var34 + 1];
                        float var47 = this.field8924[var14][var34 + 1];
                        float var48 = this.field8920[var14 + 1][var34 - -1];
                        float var49 = this.field8916[var14 + 1][var34 - -1];
                        float var50 = this.field8924[var14 - -1][var34 + 1];
                        float var51 = this.field8920[var14 + 1][var34];
                        float var52 = this.field8916[var14 - -1][var34];
                        float var53 = this.field8924[var14 + 1][var34];
                        int var54 = 255 & var1[var14][var34];
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = var1[var14 + 1][var34 + 1] & 255;
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label361: for (int var59 = 0; ~var39.length < ~var59; ++var59) {
                            class474 var105 = var35[var59];
                            for (int var106 = 0; ~var106 > ~var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label361;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field8893[super.field1918 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var61 > ~var39.length; ++var61) {
                            int var62 = (var14 << super.field1921) - -var36[var61];
                            int var63 = (var34 << super.field1921) - -var37[var61];
                            int var64 = var62 >> this.field8884;
                            int var65 = var63 >> this.field8884;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var65 | (long) var67 << 48 | (long) var66 << 32 | (long) (var64 << 16);
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75 = 1.0F;
                            float var76;
                            int var77;
                            float var78;
                            float var79;
                            if (var71 == 0 && var72 == 0) {
                                var76 = var44;
                                var77 = var73 - var54;
                                var78 = var42;
                                var79 = var43;
                            } else if (~var71 == -1 && super.field1919 == var72) {
                                var77 = var73 - var55;
                                var79 = var46;
                                var76 = var47;
                                var78 = var45;
                            } else if (~super.field1919 == ~var71 && ~super.field1919 == ~var72) {
                                var77 = var73 - var56;
                                var78 = var48;
                                var79 = var49;
                                var76 = var50;
                            } else if (super.field1919 == var71 && var72 == 0) {
                                var78 = var51;
                                var79 = var52;
                                var77 = var73 - var57;
                                var76 = var53;
                            } else {
                                float var80 = (float) var71 / (float) super.field1919;
                                float var81 = (float) var72 / (float) super.field1919;
                                float var82 = (-var42 + var51) * var80 + var42;
                                float var83 = (-var43 + var52) * var80 + var43;
                                float var84 = (-var44 + var53) * var80 + var44;
                                float var85 = (-var45 + var48) * var80 + var45;
                                float var86 = (-var46 + var49) * var80 + var46;
                                float var87 = (var50 - var47) * var80 + var47;
                                var78 = (-var82 + var85) * var81 + var82;
                                var79 = (var86 - var83) * var81 + var83;
                                var76 = (var87 - var84) * var81 + var84;
                                int var88 = ((-var54 + var57) * var71 >> super.field1921) + var54;
                                int var89 = ((-var55 + var56) * var71 >> super.field1921) + var55;
                                var77 = var73 - (((-var88 + var89) * var72 >> super.field1921) + var88);
                            }
                            if (~var66 != 0) {
                                int var90 = (127 & var66) * var77 >> 7;
                                if (var90 >= 2) {
                                    if (var90 > 126) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                if ((7 & this.field8880) == 0) {
                                    float var91 = this.field8881.field8070[2] * var76 + this.field8881.field8070[1] * var79 + this.field8881.field8070[0] * var78;
                                    var75 = var91 * (var91 > 0.0F ? this.field8881.field8025 : this.field8881.field8047) + this.field8881.field8039;
                                }
                                var74 = class35.field433[var90 | 65408 & var66];
                            }
                            class539 var92 = null;
                            if ((this.field8892 + -1 & var62) == 0 && ~(this.field8892 + -1 & var63) == -1) {
                                var92 = var12.method2061(-17305, var69);
                            }
                            int var103;
                            if (var92 == null) {
                                int var94;
                                if (var66 != var67) {
                                    int var93 = (var67 & 127) * var77 >> 7;
                                    if (var93 >= 2) {
                                        if (~var93 < -127) {
                                            var93 = 126;
                                        }
                                    } else {
                                        var93 = 2;
                                    }
                                    var94 = class35.field433[var93 | 65408 & var67];
                                    if ((7 & this.field8880) == 0) {
                                        float var95 = this.field8881.field8070[2] * var76 + this.field8881.field8070[0] * var78 + this.field8881.field8070[1] * var79;
                                        float var96 = this.field8881.field8039 + var75 * (var75 > 0.0F ? this.field8881.field8025 : this.field8881.field8047);
                                        int var97 = var94 >> 16 & 255;
                                        int var98 = (65451 & var94) >> 8;
                                        int var99 = 255 & var94;
                                        int var100 = (int) ((float) var97 * var96);
                                        if (~var100 > -1) {
                                            var100 = 0;
                                        } else if (~var100 < -256) {
                                            var100 = 255;
                                        }
                                        int var101 = (int) ((float) var98 * var96);
                                        if (var101 < 0) {
                                            var101 = 0;
                                        } else if (var101 > 255) {
                                            var101 = 255;
                                        }
                                        int var102 = (int) ((float) var99 * var96);
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (~var102 < -256) {
                                            var102 = 255;
                                        }
                                        var94 = var102 | var101 << 8 | var100 << 16;
                                    }
                                } else {
                                    var94 = var74;
                                }
                                if (!Stream.method3418()) {
                                    var8.method3428((float) var62);
                                    var8.method3428((float) (this.method267(var62, var63) + var68));
                                    var8.method3428((float) var63);
                                    var8.method3428((float) var62);
                                    var8.method3428((float) var63);
                                    if (this.field8908 != null) {
                                        var8.method3428((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if ((this.field8880 & 7) != 0) {
                                        var8.method3428(var78);
                                        var8.method3428(var79);
                                        var8.method3428(var76);
                                    }
                                } else {
                                    var8.method3421((float) var62);
                                    var8.method3421((float) (this.method267(var62, var63) - -var68));
                                    var8.method3421((float) var63);
                                    var8.method3421((float) var62);
                                    var8.method3421((float) var63);
                                    if (this.field8908 != null) {
                                        var8.method3421((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(7 & this.field8880) != -1) {
                                        var8.method3421(var78);
                                        var8.method3421(var79);
                                        var8.method3421(var76);
                                    }
                                }
                                if (this.field8881.field7999 != 0) {
                                    var9.method3424(var94 | -16777216);
                                } else {
                                    var9.method3427(-16777216 | var94);
                                }
                                var103 = this.field8899++;
                                var60[var61] = (short) var103;
                                if (~var66 != 0) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method2063(var69, 1, new class379(var60[var61]));
                            } else {
                                var60[var61] = ((class379) var92).field5339;
                                var103 = 65535 & var60[var61];
                                if (var66 != -1 && var35[var61].field7311 < var10[var103].field7311) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; var104 < var58; ++var104) {
                                var13[var104].method2693(var75, var74, var77, (byte) -111, var103);
                            }
                            ++this.field8885;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field8899 > var15; ++var15) {
                class474 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2688(var15, -1273);
                }
            }
            for (int var16 = 0; var16 < super.field1918; ++var16) {
                for (int var22 = 0; ~var22 > ~super.field1916; ++var22) {
                    short[] var23 = this.field8893[super.field1918 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var25 < var23.length) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = var23[var25++] & 65535;
                            int var28 = var23[var25++] & 65535;
                            class474 var29 = var10[var26];
                            class474 var30 = var10[var27];
                            class474 var31 = var10[var28];
                            class474 var32 = null;
                            if (var29 != null) {
                                var29.method2697(var16, var24, var22, (byte) -127);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method2697(var16, var24, var22, (byte) 119);
                                if (var32 == null || var32.field7311 > var30.field7311) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2697(var16, var24, var22, (byte) 26);
                                if (var32 == null || ~var31.field7311 > ~var32.field7311) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2688(var26, -1273);
                                }
                                if (var30 != null) {
                                    var32.method2688(var27, -1273);
                                }
                                if (var31 != null) {
                                    var32.method2688(var28, -1273);
                                }
                                var32.method2697(var16, var24, var22, (byte) -41);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3426();
            var9.method3426();
            this.field8923 = this.field8881.method337((byte) -61, false);
            this.field8923.method1247(this.field8899 * 4, (byte) -64, 4, var6);
            this.field8919 = this.field8881.method337((byte) -61, false);
            this.field8919.method1247(this.field8899 * var5, (byte) -64, var5, var7);
            if ((7 & this.field8880) == 0) {
                if (this.field8908 != null) {
                    this.field8922 = this.field8881.method307(new class215[] { new class215(new class657[] { class657.field9245, class657.field9255, class657.field9254 }), new class215(class657.field9253) }, (byte) 113);
                } else {
                    this.field8922 = this.field8881.method307(new class215[] { new class215(new class657[] { class657.field9245, class657.field9255 }), new class215(class657.field9253) }, (byte) 114);
                }
            } else if (this.field8908 == null) {
                this.field8922 = this.field8881.method307(new class215[] { new class215(new class657[] { class657.field9245, class657.field9255, class657.field9252 }), new class215(class657.field9253) }, (byte) 120);
            } else {
                this.field8922 = this.field8881.method307(new class215[] { new class215(new class657[] { class657.field9245, class657.field9255, class657.field9254, class657.field9252 }), new class215(class657.field9253) }, (byte) 115);
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (var3[var18].field6625 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field8926 = new class474[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; ~var20 > ~var17; ++var20) {
                class474 var21 = var3[var20];
                var19[var20] = var21.field7311;
                this.field8926[var20] = var21;
                var21.method2700(false, this.field8899);
            }
            class235.method1480(true, this.field8926, var19);
            if (this.field8888 != null) {
                this.field8888.method2350(123);
            }
        } else {
            this.field8888 = null;
        }
        ++field8910;
        this.field8920 = this.field8916 = this.field8924 = null;
        this.field8908 = null;
        this.field8911 = null;
        this.field8901 = null;
        this.field8925 = null;
        this.field8915 = null;
        this.field8900 = null;
        this.field8870 = null;
        this.field8890 = this.field8887 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILlb;I)V", line = 947)
    private final void method3522(int arg0, int arg1, class498 arg2, int arg3) {
        ++field8891;
        if (arg3 != 23483) {
            this.method274(91, 84, 66, 104, -43, 89, 92, (boolean[][]) null);
        }
        int[] var5 = this.field8890[arg0][arg1];
        int[] var6 = this.field8887[arg0][arg1];
        int var7 = var5.length;
        if (~class220.field3190.length > ~var7) {
            class220.field3190 = new int[var7];
            class223.field3218 = new int[var7];
        }
        for (int var8 = 0; var7 > var8; ++var8) {
            class220.field3190[var8] = var5[var8] >> this.field8881.field8036;
            class223.field3218[var8] = var6[var8] >> this.field8881.field8036;
        }
        int var9 = 0;
        while (var9 < var7) {
            int var10 = class220.field3190[var9];
            int var11 = class223.field3218[var9++];
            int var12 = class220.field3190[var9];
            int var13 = class223.field3218[var9++];
            int var14 = class220.field3190[var9];
            int var15 = class223.field3218[var9++];
            if ((var10 - var12) * (-var15 + var13) - (-var11 + var13) * (-var12 + var14) > 0) {
                arg2.method2782(var11, (byte) -113, var13, var10, var15, var12, var14);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)Z", line = 1005)
    public static final boolean method3523(byte arg0, int arg1, int arg2) {
        ++field8872;
        if (arg0 <= 110) {
            method3526((byte) 35);
        }
        if (!(class233.method1473(-105, arg2, arg1) | (arg2 & 65536) != 0) && !class662.method3670(arg2, arg1, (byte) -73)) {
            return ~(arg1 & 55) == -1 && class298.method1859(arg1, 19308, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lld;[I)V", line = 1021)
    public final void method282(class154 arg0, int[] arg1) {
        this.field8912.method1273(new class362(this.field8881, this, arg0, arg1), (byte) 122);
        ++field8879;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1035)
    public final void method275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field8889;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
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
        this.method266(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!kb", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1136)
    public final void method266(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field8908 == null) {
            this.field8908 = new int[super.field1918][super.field1916][];
        }
        if (arg3 != null && this.field8911 == null) {
            this.field8911 = new int[super.field1918][super.field1916][];
        }
        ++field8895;
        this.field8890[arg0][arg1] = arg2;
        this.field8887[arg0][arg1] = arg4;
        this.field8900[arg0][arg1] = arg6;
        this.field8901[arg0][arg1] = arg7;
        if (this.field8908 != null) {
            this.field8908[arg0][arg1] = arg5;
        }
        if (this.field8911 != null) {
            this.field8911[arg0][arg1] = arg3;
        }
        class474[] var15 = this.field8870[arg0][arg1] = new class474[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[var16];
            class539 var19;
            for (var19 = this.field8925.method2061(-17305, var17); var19 != null; var19 = this.field8925.method2064(6654)) {
                class474 var20 = (class474) var19;
                if (arg8[var16] == var20.field6613 && (float) arg9[var16] == var20.field6611 && var20.field6634 == arg10 && ~var20.field6626 == ~arg11 && ~var20.field6624 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class474) var19;
            } else {
                var15[var16] = new class474(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field8925.method2063(var17, 1, var15[var16]);
            }
        }
        if (arg13) {
            this.field8878[arg0][arg1] = (byte) class266.method1624(this.field8878[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field8917) {
            this.field8917 = arg6.length;
        }
        this.field8921 += arg6.length;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(IILw;)Lw;", line = 1203)
    public final class271 method281(int arg0, int arg1, class271 arg2) {
        ++field8883;
        if (~(1 & this.field8878[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field1919 >> this.field8881.field8036;
            class498 var5 = (class498) arg2;
            class498 var6;
            if (var5 != null && var5.method2785(var4, var4, (byte) 112)) {
                var6 = var5;
                var5.method2783(17530);
            } else {
                var6 = new class498(this.field8881, var4, var4);
            }
            var6.method2784(0, var4, 0, var4, 0);
            this.method3522(arg0, arg1, var6, 23483);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kb", name = "FA", descriptor = "(Lw;IIIIZ)V", line = 1230)
    public final void method278(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8894;
        if (this.field8888 != null && arg0 != null) {
            int var7 = -(this.field8881.field8054 * arg2 >> 8) + arg1 >> this.field8881.field8036;
            int var8 = -(this.field8881.field8042 * arg2 >> 8) + arg3 >> this.field8881.field8036;
            this.field8888.method2349(var7, 0, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 1249)
    public final void method280(int arg0, int arg1) {
        ++field8871;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lw;IIIIZ)Z", line = 1256)
    public final boolean method276(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8904;
        if (this.field8888 != null && arg0 != null) {
            int var7 = arg1 - (this.field8881.field8054 * arg2 >> 8) >> this.field8881.field8036;
            int var8 = -(this.field8881.field8042 * arg2 >> 8) + arg3 >> this.field8881.field8036;
            return this.field8888.method2351(false, var7, arg0, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V", line = 1280)
    public static void method3524(boolean arg0) {
        if (arg0) {
            field8905 = 105;
        }
        field8873 = null;
        field8918 = null;
        field8882 = null;
        field8877 = null;
        field8875 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[[ZZ)V", line = 1295)
    public final void method271(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field8886;
        this.method3525(true, arg3, -1, arg1, arg4, arg2, arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z[[ZIIZII)V", line = 1303)
    private final void method3525(boolean arg0, boolean[][] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field8902;
        if (this.field8926 != null) {
            int var8 = arg5 + 1 + arg5;
            int var9 = var8 * var8;
            if (class45.field666.length < var9) {
                class45.field666 = new int[var9];
            }
            int var10 = -arg5 + arg6;
            int var11 = var10;
            if (~var10 > -1) {
                var10 = 0;
            }
            int var12 = -arg5 + arg3;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg5 + arg6;
            if (~var14 < ~(super.field1918 + -1)) {
                var14 = super.field1918 + -1;
            }
            int var15 = arg3 + arg5;
            class568.field7644 = 0;
            if (super.field1916 + -1 < var15) {
                var15 = super.field1916 + -1;
            }
            for (int var16 = var10; ~var14 <= ~var16; ++var16) {
                boolean[] var23 = arg1[-var11 + var16];
                for (int var24 = var12; var24 <= var15; ++var24) {
                    if (var23[var24 - var13]) {
                        class45.field666[class568.field7644++] = super.field1918 * var24 - -var16;
                    }
                }
            }
            if (~arg2 == 0) {
                this.field8881.method3215(!arg0);
            } else {
                this.field8881.method3219(-11838, (float) arg2);
                this.field8881.method3217(-3);
            }
            this.field8881.method3251((byte) 123);
            this.field8881.method3172(-82, ~(7 & this.field8880) != -1);
            this.field8881.method3183(false, 128, -1, false);
            this.field8881.method313(this.field8919, 15, 0);
            for (int var17 = 0; ~this.field8926.length < ~var17; ++var17) {
                this.field8926[var17].method2692((byte) 59, class568.field7644, class45.field666);
            }
            class367 var18 = this.field8881.method3216(1);
            var18.method1288(0, -1, 0);
            this.field8881.method3228(true);
            if (!this.field8912.method1274((byte) 97)) {
                int var19 = this.field8881.field8002;
                int var20 = this.field8881.field8005;
                this.field8881.method453(0, var20, this.field8881.field7975);
                this.field8881.method3172(-69, false);
                this.field8881.method3250(false, !arg0);
                this.field8881.method3242(-2, 128);
                this.field8881.method3183(false, 128, -2, false);
                this.field8881.method3232(false, this.field8881.field7985);
                this.field8881.method3193(class137.field1929, class24.field325, 0);
                this.field8881.method3177(0, 86, class22.field305);
                this.field8881.method3235(class391.field5472, -12912, 0);
                for (class539 var21 = this.field8912.method1270((byte) -25); var21 != null; var21 = this.field8912.method1282(0)) {
                    class362 var22 = (class362) var21;
                    var22.method2122(arg3, (byte) 113, arg1, arg6, arg5);
                }
                this.field8881.method3177(0, 107, class558.field7530);
                this.field8881.method3235(class558.field7530, -12912, 0);
                this.field8881.method3232(false, (class467) null);
                this.field8881.method453(var19, var20, this.field8881.field7975);
            }
            if (this.field8888 != null) {
                this.field8881.method313(this.field8919, 15, 0);
                this.field8881.method313(this.field8923, 15, 1);
                this.field8881.method348((byte) -62, this.field8922);
                this.field8888.method2352(arg4, arg3, arg6, arg1, arg5, -36);
            }
        }
        if (!arg0) {
            this.method280(126, -3);
        }
    }

    @OriginalMember(owner = "client!kb", name = "sa", descriptor = "(II)I", line = 1450)
    public final int method267(int arg0, int arg1) {
        ++field8898;
        int var3 = arg0 >> super.field1921;
        int var4 = arg1 >> super.field1921;
        if (~var3 <= -1 && ~var4 <= -1 && var3 <= super.field1918 + -1 && ~var4 >= ~(super.field1916 - 1)) {
            int var5 = super.field1919 + -1 & arg0;
            int var6 = super.field1919 + -1 & arg1;
            int var7 = (super.field1919 - var5) * this.field8906[var3][var4] + this.field8906[var3 + 1][var4] * var5 >> super.field1921;
            int var8 = (-var5 + super.field1919) * this.field8906[var3][var4 + 1] + this.field8906[var3 + 1][var4 + 1] * var5 >> super.field1921;
            return (-var6 + super.field1919) * var7 + var6 * var8 >> super.field1921;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 1484)
    public static final void method3526(byte arg0) {
        ++field8914;
        class230.field3284.method2471(-22443);
        if (arg0 != 112) {
            method3524(false);
        }
        class268.field3802 = 1;
        class7.field68 = null;
    }

    @OriginalMember(owner = "client!kb", name = "JA", descriptor = "(II)I", line = 1503)
    public final int method273(int arg0, int arg1) {
        ++field8874;
        return this.field8906[arg0][arg1];
    }
}
