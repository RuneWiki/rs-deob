import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class55 extends class343 {

    @OriginalMember(owner = "client!tn", name = "R", descriptor = "Lft;")
    private class4 field863 = new class4();

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    private int field828 = this.field5112 - 2;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "[[I")
    private int[][] field831;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "Lbl;")
    public class442 field854;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "[[B")
    private byte[][] field844;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "[[[Luc;")
    private class23[][][] field832;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "[[[I")
    private int[][][] field837;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "[[[I")
    public int[][][] field836;

    @OriginalMember(owner = "client!tn", name = "X", descriptor = "[[F")
    private float[][] field868;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "[[[I")
    private int[][][] field850;

    @OriginalMember(owner = "client!tn", name = "fb", descriptor = "[[F")
    private float[][] field876;

    @OriginalMember(owner = "client!tn", name = "hb", descriptor = "[[B")
    private byte[][] field878;

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "[[[I")
    private int[][][] field842;

    @OriginalMember(owner = "client!tn", name = "gb", descriptor = "[[F")
    private float[][] field877;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "[[S")
    public short[][] field835;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "[[[I")
    public int[][][] field834;

    @OriginalMember(owner = "client!tn", name = "cb", descriptor = "Lke;")
    private class407 field873;

    @OriginalMember(owner = "client!tn", name = "S", descriptor = "Lfv;")
    private class73 field864;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "F")
    public static float field843 = 1.0F;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "Loe;")
    public static class127 field847 = new class127(35, 15);

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!tn", name = "L", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "I")
    private int field859;

    @OriginalMember(owner = "client!tn", name = "O", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!tn", name = "P", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!tn", name = "T", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "client!tn", name = "V", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "client!tn", name = "Y", descriptor = "I")
    private int field869;

    @OriginalMember(owner = "client!tn", name = "U", descriptor = "Leo;")
    private class186 field866;

    @OriginalMember(owner = "client!tn", name = "Z", descriptor = "Lot;")
    public class400 field870;

    @OriginalMember(owner = "client!tn", name = "bb", descriptor = "Lot;")
    private class400 field872;

    @OriginalMember(owner = "client!tn", name = "db", descriptor = "Lot;")
    public class400 field874;

    @OriginalMember(owner = "client!tn", name = "eb", descriptor = "Lot;")
    public class400 field875;

    @OriginalMember(owner = "client!tn", name = "ab", descriptor = "[Luc;")
    private class23[] field871;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "[[[I")
    private int[][][] field848;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZLun;)V")
    private final void method383(int arg0, int arg1, boolean arg2, class279 arg3) {
        ++field860;
        int[] var5 = this.field834[arg0][arg1];
        int[] var6 = this.field836[arg0][arg1];
        int var7 = var5.length;
        if (class109.field1887.length < var7) {
            class327.field4908 = new int[var7];
            class109.field1887 = new int[var7];
        }
        if (!arg2) {
            this.method316((class480) null, (int[]) null);
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class109.field1887[var8] = class330.method2050(255, var5[var8]) >> this.field854.field6686;
            class327.field4908[var8] = class330.method2050(var6[var8], 255) >> this.field854.field6686;
        }
        int var9 = 0;
        while (~var7 < ~var9) {
            int var10 = class109.field1887[var9];
            int var11 = class327.field4908[var9++];
            int var12 = class109.field1887[var9];
            int var13 = class327.field4908[var9++];
            int var14 = class109.field1887[var9];
            int var15 = class327.field4908[var9++];
            if (~((var10 - var12) * (-var15 + var13) + -((var13 - var11) * (var14 - var12))) < -1) {
                arg3.method1709(var14, var10, var15, (byte) -1, var13, var11, var12);
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III[[ZZ)V")
    public final void method312(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method385(arg0, -1, arg1, arg2, arg4, (byte) 126, arg3);
        ++field829;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(II)I")
    public final int method314(int arg0, int arg1) {
        ++field839;
        int var3 = arg0 >> super.field5112;
        int var4 = arg1 >> super.field5112;
        if (~var3 <= -1 && var4 >= 0 && super.field5108 + -1 >= var3 && var4 <= super.field5105 + -1) {
            int var5 = super.field5107 + -1 & arg0;
            int var6 = super.field5107 + -1 & arg1;
            int var7 = (-var5 + super.field5107) * this.field831[var3][var4] + this.field831[var3 + 1][var4] * var5 >> super.field5112;
            int var8 = (-var5 + super.field5107) * this.field831[var3][var4 + 1] - -(this.field831[var3 + 1][var4 + 1] * var5) >> super.field5112;
            return (-var6 + super.field5107) * var7 + var6 * var8 >> super.field5112;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)I")
    public final int method318(int arg0, int arg1) {
        ++field840;
        return this.field831[arg0][arg1];
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V")
    public final void method306(int arg0, int arg1) {
        ++field856;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lbl;IIII[[I[[II)V")
    public class55(class442 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field831 = arg5;
        this.field854 = arg0;
        this.field844 = new byte[arg3][arg4];
        this.field855 = arg2;
        this.field832 = new class23[arg3][arg4][];
        this.field837 = new int[arg3][arg4][];
        this.field836 = new int[arg3][arg4][];
        this.field868 = new float[super.field5108 + 1][super.field5105 + 1];
        this.field850 = new int[arg3][arg4][];
        this.field876 = new float[super.field5108 + 1][super.field5105 - -1];
        this.field878 = new byte[arg3 + 1][arg4 + 1];
        this.field858 = 1 << this.field828;
        this.field842 = new int[arg3][arg4][];
        this.field877 = new float[super.field5108 + 1][super.field5105 + 1];
        this.field835 = new short[arg3 * arg4][];
        this.field834 = new int[arg3][arg4][];
        for (int var9 = 1; var9 < super.field5105; ++var9) {
            for (int var10 = 1; ~super.field5108 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * 4 * arg7 + var12 * var12)));
                this.field876[var10][var9] = (float) var11 * var13;
                this.field877[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field868[var10][var9] = (float) var12 * var13;
            }
        }
        this.field873 = new class407(128);
        if (~(16 & this.field855) != -1) {
            this.field864 = new class73(this.field854, this);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILh;)Lh;")
    public final class452 method309(int arg0, int arg1, class452 arg2) {
        ++field849;
        if (~(this.field844[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field5107 >> this.field854.field6686;
            class279 var5 = (class279) arg2;
            class279 var6;
            if (var5 != null && var5.method1708(var4, var4, -121)) {
                var6 = var5;
                var5.method1706((byte) 0);
            } else {
                var6 = new class279(this.field854, var4, var4);
            }
            var6.method1710(var4, 0, var4, 0, 0);
            this.method383(arg0, arg1, true, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lki;[I)V")
    public final void method316(class480 arg0, int[] arg1) {
        ++field861;
        this.field863.method4(1, new class134(this.field854, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method310(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field841;
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
        this.method311(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    public static void method384(byte arg0) {
        field847 = null;
        int var1 = 73 / ((arg0 - -75) / 50);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
    public final void method308() {
        if (~this.field867 >= -1) {
            this.field864 = null;
        } else {
            byte[][] var1 = new byte[super.field5108 + 1][super.field5105 + 1];
            for (int var2 = 1; ~var2 > ~super.field5108; ++var2) {
                for (int var102 = 1; ~var102 > ~super.field5105; ++var102) {
                    var1[var2][var102] = (byte) ((this.field878[var2][var102] >> 1) + (this.field878[var2][var102 + 1] >> 3) + (this.field878[var2][var102 + -1] >> 2) + (this.field878[var2 + -1][var102] >> 2) + (this.field878[var2 + 1][var102] >> 3));
                }
            }
            this.field871 = new class23[this.field873.method2411(true)];
            this.field873.method2406(this.field871, true);
            for (int var3 = 0; ~this.field871.length < ~var3; ++var3) {
                this.field871[var3].method120(true, this.field867);
            }
            int var4 = 24;
            if (this.field848 != null) {
                var4 += 4;
            }
            if ((this.field855 & 7) != 0) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field854.field6690.method2490(this.field867 * var4);
            NativeStream var6 = new NativeStream(var5);
            class23[] var7 = new class23[this.field867];
            class407 var8 = new class407(class339.method2093(-125, this.field867));
            class23[] var9 = new class23[this.field869];
            for (int var10 = 0; var10 < super.field5108; ++var10) {
                for (int var29 = 0; super.field5105 > var29; ++var29) {
                    if (this.field850[var10][var29] != null) {
                        class23[] var30 = this.field832[var10][var29];
                        int[] var31 = this.field834[var10][var29];
                        int[] var32 = this.field836[var10][var29];
                        int[] var33 = this.field837[var10][var29];
                        int[] var34 = this.field850[var10][var29];
                        int[] var35 = this.field842 == null ? null : this.field842[var10][var29];
                        int[] var36 = this.field848 != null ? this.field848[var10][var29] : null;
                        if (var33 == null) {
                            var33 = var34;
                        }
                        float var37 = this.field876[var10][var29];
                        float var38 = this.field877[var10][var29];
                        float var39 = this.field868[var10][var29];
                        float var40 = this.field876[var10][var29 + 1];
                        float var41 = this.field877[var10][var29 + 1];
                        float var42 = this.field868[var10][var29 - -1];
                        float var43 = this.field876[var10 + 1][var29 - -1];
                        float var44 = this.field877[var10 + 1][var29 + 1];
                        float var45 = this.field868[var10 + 1][var29 - -1];
                        float var46 = this.field876[var10 + 1][var29];
                        float var47 = this.field877[var10 + 1][var29];
                        float var48 = this.field868[var10 - -1][var29];
                        int var49 = 255 & var1[var10][var29];
                        int var50 = var1[var10][var29 - -1] & 255;
                        int var51 = var1[var10 + 1][var29 + 1] & 255;
                        int var52 = var1[var10 + 1][var29] & 255;
                        int var53 = 0;
                        label334: for (int var54 = 0; ~var54 > ~var34.length; ++var54) {
                            class23 var100 = var30[var54];
                            for (int var101 = 0; ~var53 < ~var101; ++var101) {
                                if (var9[var101] == var100) {
                                    continue label334;
                                }
                            }
                            var9[var53++] = var100;
                        }
                        short[] var55 = this.field835[super.field5108 * var29 + var10] = new short[var34.length];
                        for (int var56 = 0; ~var34.length < ~var56; ++var56) {
                            int var57 = (var10 << super.field5112) + var31[var56];
                            int var58 = (var29 << super.field5112) - -var32[var56];
                            int var59 = var57 >> this.field828;
                            int var60 = var58 >> this.field828;
                            int var61 = var34[var56];
                            int var62 = var33[var56];
                            int var63 = var35 == null ? 0 : var35[var56];
                            long var64 = (long) var60 | (long) (var59 << 16) | (long) var62 << 48 | (long) var61 << 32;
                            int var66 = var31[var56];
                            int var67 = var32[var56];
                            byte var68 = 74;
                            int var69 = 0;
                            int var70;
                            float var71;
                            float var72;
                            float var73;
                            if (~var66 == -1 && var67 == 0) {
                                var70 = var68 - var49;
                                var71 = var38;
                                var72 = var37;
                                var73 = var39;
                            } else if (var66 == 0 && super.field5107 == var67) {
                                var70 = var68 - var50;
                                var71 = var41;
                                var72 = var40;
                                var73 = var42;
                            } else if (~super.field5107 == ~var66 && super.field5107 == var67) {
                                var71 = var44;
                                var73 = var45;
                                var70 = var68 - var51;
                                var72 = var43;
                            } else if (~super.field5107 == ~var66 && ~var67 == -1) {
                                var71 = var47;
                                var70 = var68 - var52;
                                var72 = var46;
                                var73 = var48;
                            } else {
                                float var74 = (float) var66 / (float) super.field5107;
                                float var75 = (float) var67 / (float) super.field5107;
                                float var76 = (var46 - var37) * var74 + var37;
                                float var77 = (-var38 + var47) * var74 + var38;
                                float var78 = (var48 - var39) * var74 + var39;
                                float var79 = (-var40 + var43) * var74 + var40;
                                float var80 = (-var41 + var44) * var74 + var41;
                                var72 = (-var76 + var79) * var75 + var76;
                                float var81 = (-var42 + var45) * var74 + var42;
                                var71 = (-var77 + var80) * var75 + var77;
                                var73 = (var81 - var78) * var75 + var78;
                                int var82 = ((-var49 + var52) * var66 >> super.field5112) + var49;
                                int var83 = var50 - -((-var50 + var51) * var66 >> super.field5112);
                                var70 = var68 - (((-var82 + var83) * var67 >> super.field5112) + var82);
                            }
                            float var84 = 1.0F;
                            if (~var61 != 0) {
                                int var85 = (var61 & 127) * var70 >> 7;
                                if (~var85 > -3) {
                                    var85 = 2;
                                } else if (~var85 < -127) {
                                    var85 = 126;
                                }
                                var69 = class327.field4907[65408 & var61 | var85];
                                if ((this.field855 & 7) == 0) {
                                    float var86 = this.field854.field6798[2] * var73 + this.field854.field6798[1] * var71 + this.field854.field6798[0] * var72;
                                    var84 = var86 * (var86 > 0.0F ? this.field854.field6758 : this.field854.field6721) + this.field854.field6756;
                                }
                            }
                            class179 var87 = null;
                            if (~(var57 & this.field858 - 1) == -1 && (this.field858 - 1 & var58) == 0) {
                                var87 = var8.method2409(false, var64);
                            }
                            int var98;
                            if (var87 == null) {
                                int var89;
                                if (var61 != var62) {
                                    int var88 = (var62 & 127) * var70 >> 7;
                                    if (~var88 > -3) {
                                        var88 = 2;
                                    } else if (var88 > 126) {
                                        var88 = 126;
                                    }
                                    var89 = class327.field4907[var62 & 65408 | var88];
                                    if (~(7 & this.field855) == -1) {
                                        float var90 = this.field854.field6798[2] * var73 + this.field854.field6798[0] * var72 + this.field854.field6798[1] * var71;
                                        float var91 = (!(var84 > 0.0F) ? this.field854.field6721 : this.field854.field6758) * var84 + this.field854.field6756;
                                        int var92 = var89 >> 16 & 255;
                                        int var93 = (65299 & var89) >> 8;
                                        int var94 = (int) ((float) var92 * var91);
                                        int var95 = 255 & var89;
                                        if (~var94 > -1) {
                                            var94 = 0;
                                        } else if (var94 > 255) {
                                            var94 = 255;
                                        }
                                        int var96 = (int) ((float) var93 * var91);
                                        if (var96 < 0) {
                                            var96 = 0;
                                        } else if (~var96 < -256) {
                                            var96 = 255;
                                        }
                                        int var97 = (int) ((float) var95 * var91);
                                        if (var97 >= 0) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        var89 = var96 << 8 | var94 << 16 | var97;
                                    }
                                } else {
                                    var89 = var69;
                                }
                                if (this.field854.field6745) {
                                    var6.method2488((float) var57);
                                    var6.method2488((float) (this.method314(var57, var58) + var63));
                                    var6.method2488((float) var58);
                                    var6.method2486((byte) (var89 >> 16));
                                    var6.method2486((byte) (var89 >> 8));
                                    var6.method2486((byte) var89);
                                    var6.method2486(-1);
                                    var6.method2488((float) var57);
                                    var6.method2488((float) var58);
                                    if (this.field848 != null) {
                                        var6.method2488((float) (var36 == null ? 0 : var36[var56] - 1));
                                    }
                                    if (~(this.field855 & 7) != -1) {
                                        var6.method2488(var72);
                                        var6.method2488(var71);
                                        var6.method2488(var73);
                                    }
                                } else {
                                    var6.method2485((float) var57);
                                    var6.method2485((float) (var63 + this.method314(var57, var58)));
                                    var6.method2485((float) var58);
                                    var6.method2486((byte) (var89 >> 16));
                                    var6.method2486((byte) (var89 >> 8));
                                    var6.method2486((byte) var89);
                                    var6.method2486(-1);
                                    var6.method2485((float) var57);
                                    var6.method2485((float) var58);
                                    if (this.field848 != null) {
                                        var6.method2485((float) (var36 == null ? 0 : var36[var56] + -1));
                                    }
                                    if ((this.field855 & 7) != 0) {
                                        var6.method2485(var72);
                                        var6.method2485(var71);
                                        var6.method2485(var73);
                                    }
                                }
                                var98 = this.field859++;
                                var55[var56] = (short) var98;
                                if (var61 != -1) {
                                    var7[var98] = var30[var56];
                                }
                                var8.method2413(var64, -1, new class406(var55[var56]));
                            } else {
                                var55[var56] = ((class406) var87).field5896;
                                var98 = var55[var56] & 65535;
                                if (~var61 != 0 && ~var30[var56].field2798 > ~var7[var98].field2798) {
                                    var7[var98] = var30[var56];
                                }
                            }
                            for (int var99 = 0; ~var99 > ~var53; ++var99) {
                                var9[var99].method121(var70, -3509, var98, var69, var84);
                            }
                            ++this.field865;
                        }
                    }
                }
            }
            for (int var11 = 0; this.field859 > var11; ++var11) {
                class23 var28 = var7[var11];
                if (var28 != null) {
                    var28.method118(var11, 90);
                }
            }
            for (int var12 = 0; super.field5108 > var12; ++var12) {
                for (int var17 = 0; super.field5105 > var17; ++var17) {
                    short[] var18 = this.field835[super.field5108 * var17 + var12];
                    if (var18 != null) {
                        int var19 = 0;
                        int var20 = 0;
                        while (~var18.length < ~var20) {
                            int var21 = var18[var20++] & 65535;
                            int var22 = var18[var20++] & 65535;
                            int var23 = 65535 & var18[var20++];
                            class23 var24 = var7[var21];
                            class23 var25 = var7[var22];
                            class23 var26 = var7[var23];
                            class23 var27 = null;
                            if (var24 != null) {
                                var24.method123(var19, var12, var17, 65535);
                                var27 = var24;
                            }
                            if (var25 != null) {
                                var25.method123(var19, var12, var17, 65535);
                                if (var27 == null || var27.field2798 > var25.field2798) {
                                    var27 = var25;
                                }
                            }
                            if (var26 != null) {
                                var26.method123(var19, var12, var17, 65535);
                                if (var27 == null || var26.field2798 < var27.field2798) {
                                    var27 = var26;
                                }
                            }
                            if (var27 != null) {
                                if (var24 != null) {
                                    var27.method118(var21, 85);
                                }
                                if (var25 != null) {
                                    var27.method118(var22, 68);
                                }
                                if (var26 != null) {
                                    var27.method118(var23, 109);
                                }
                                var27.method123(var19, var12, var17, 65535);
                            }
                            ++var19;
                        }
                    }
                }
            }
            var6.method2484();
            this.field866 = this.field854.method2626(-108, var5, false, var6.method2482(), var4);
            this.field875 = new class400(this.field854, this.field866, 5126, 3, 0);
            this.field872 = new class400(this.field854, this.field866, 5121, 4, 12);
            byte var13;
            if (this.field848 == null) {
                this.field870 = new class400(this.field854, this.field866, 5126, 2, 16);
                var13 = 24;
            } else {
                this.field870 = new class400(this.field854, this.field866, 5126, 3, 16);
                var13 = 28;
            }
            if ((7 & this.field855) != 0) {
                this.field874 = new class400(this.field854, this.field866, 5126, 3, var13);
            }
            long[] var14 = new long[this.field871.length];
            for (int var15 = 0; ~var15 > ~this.field871.length; ++var15) {
                class23 var16 = this.field871[var15];
                var14[var15] = var16.field2798;
                var16.method122((byte) -117, this.field859);
            }
            class229.method1381(this.field871, (byte) 93, var14);
            if (this.field864 != null) {
                this.field864.method541(0);
            }
        }
        ++field845;
        this.field873 = null;
        this.field832 = null;
        this.field876 = this.field877 = this.field868 = null;
        this.field848 = null;
        this.field842 = null;
        this.field878 = null;
        this.field850 = null;
        this.field837 = null;
        this.field834 = this.field836 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
    public final void method300(int arg0, int arg1, int arg2) {
        if (~arg2 < ~(255 & this.field878[arg0][arg1])) {
            this.field878[arg0][arg1] = (byte) arg2;
        }
        ++field857;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method311(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field842 == null) {
            this.field842 = new int[super.field5108][super.field5105][];
        }
        if (arg5 != null && this.field848 == null) {
            this.field848 = new int[super.field5108][super.field5105][];
        }
        ++field853;
        this.field834[arg0][arg1] = arg2;
        this.field836[arg0][arg1] = arg4;
        this.field850[arg0][arg1] = arg6;
        this.field837[arg0][arg1] = arg7;
        if (this.field848 != null) {
            this.field848[arg0][arg1] = arg5;
        }
        if (this.field842 != null) {
            this.field842[arg0][arg1] = arg3;
        }
        class23[] var15 = this.field832[arg0][arg1] = new class23[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class179 var19;
            for (var19 = this.field873.method2409(false, var17); var19 != null; var19 = this.field873.method2410((byte) 122)) {
                class23 var20 = (class23) var19;
                if (arg8[var16] == var20.field304 && (float) arg9[var16] == var20.field299 && ~var20.field306 == ~arg10 && var20.field290 == arg11 && ~var20.field287 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class23) var19;
            } else {
                var15[var16] = new class23(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field873.method2413(var17, -1, var15[var16]);
            }
        }
        if (arg13) {
            this.field844[arg0][arg1] = (byte) class318.method1973(this.field844[arg0][arg1], 1);
        }
        if (arg6.length > this.field869) {
            this.field869 = arg6.length;
        }
        this.field867 += arg6.length;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Lh;IIIIZ)V")
    public final void method299(class452 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field838;
        if (this.field864 != null && arg0 != null) {
            int var7 = -(this.field854.field6790 * arg2 >> 8) + arg1 >> this.field854.field6686;
            int var8 = -(this.field854.field6748 * arg2 >> 8) + arg3 >> this.field854.field6686;
            this.field864.method542(var7, 113, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lh;IIIIZ)V")
    public final void method304(class452 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field851;
        if (this.field864 != null && arg0 != null) {
            int var7 = arg1 - (this.field854.field6790 * arg2 >> 8) >> this.field854.field6686;
            int var8 = -(this.field854.field6748 * arg2 >> 8) + arg3 >> this.field854.field6686;
            this.field864.method545(var8, (byte) -116, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIZB[[Z)V")
    private final void method385(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, boolean[][] arg6) {
        if (arg5 <= 105) {
            this.field874 = null;
        }
        ++field833;
        if (this.field871 != null) {
            float var8 = this.field854.field6808;
            float var9 = this.field854.field6782;
            int var10 = arg3 + 1 + arg3;
            int var11 = var10 * var10;
            if (~var11 < ~class257.field3925.length) {
                class257.field3925 = new int[var11];
            }
            if (~class456.field6997.field536.length > ~(this.field865 * 2)) {
                class456.field6997 = new class40(this.field865 * 2);
            }
            int var12 = arg0 - arg3;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg3 + arg2;
            int var15 = var14;
            if (var14 < 0) {
                var14 = 0;
            }
            int var16 = arg0 + arg3;
            if (~(super.field5108 + -1) > ~var16) {
                var16 = super.field5108 + -1;
            }
            int var17 = arg2 + arg3;
            class167.field2595 = 0;
            if (super.field5105 + -1 < var17) {
                var17 = super.field5105 + -1;
            }
            for (int var18 = var12; ~var18 >= ~var16; ++var18) {
                boolean[] var24 = arg6[-var13 + var18];
                for (int var25 = var14; var17 >= var25; ++var25) {
                    if (var24[-var15 + var25]) {
                        class257.field3925[class167.field2595++] = super.field5108 * var25 - -var18;
                    }
                }
            }
            if (~arg1 != 0) {
                this.field854.method2628((float) arg1, -8600);
                this.field854.method2622((byte) 34);
            } else {
                this.field854.method2576(24997);
            }
            this.field854.method2600((byte) 114, ~(7 & this.field855) != -1);
            for (int var19 = 0; ~this.field871.length < ~var19; ++var19) {
                this.field871[var19].method116(89, class257.field3925, class167.field2595);
            }
            if (!this.field863.method14(0)) {
                int var20 = this.field854.field6817;
                int var21 = this.field854.field6812;
                this.field854.method1947(0, var21, this.field854.field6785);
                this.field854.method1993(var9, var8 + -4.0F);
                this.field854.method2600((byte) -68, false);
                this.field854.method2598(30674, false);
                this.field854.method2640(27575, 128);
                this.field854.method2650((byte) -122, -2);
                this.field854.method2586(this.field854.field6728, false);
                this.field854.method2624((byte) 107, 7681, 8448);
                this.field854.method2597(34166, (byte) 97, 770, 0);
                this.field854.method2575((byte) -119, 34167, 770, 0);
                for (class179 var22 = this.field863.method8((byte) -98); var22 != null; var22 = this.field863.method17((byte) -67)) {
                    class134 var23 = (class134) var22;
                    var23.method884((byte) 10, arg6, arg3, arg2, arg0);
                }
                this.field854.method2597(5890, (byte) 106, 768, 0);
                this.field854.method2575((byte) -87, 5890, 770, 0);
                this.field854.method2586((class194) null, false);
                this.field854.method1947(var20, var21, this.field854.field6785);
            }
            if (this.field864 != null) {
                this.field854.method1993(var9, var8 + -8.0F);
                this.field854.method2576(24997);
                this.field854.method2646((class400) null, this.field870, -19887, (class400) null, this.field875);
                this.field864.method550(arg2, arg3, arg6, -13735, arg4, arg0);
            }
            this.field854.method1993(var9, var8);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field830;
        if (this.field867 > 0) {
            this.field854.method2588((byte) 77);
            this.field854.method2609(true, false);
            this.field854.method2600((byte) 104, false);
            this.field854.method2602(false, false);
            this.field854.method2598(30674, false);
            this.field854.method2640(27575, 0);
            this.field854.method2650((byte) -89, -2);
            this.field854.method2586((class194) null, false);
            class277.field4216[6] = 0.0F;
            class277.field4216[4] = 0.0F;
            class277.field4216[0] = (float) arg2 / ((float) super.field5107 * 128.0F * (float) this.field854.field6649);
            class277.field4216[14] = 0.0F;
            class277.field4216[9] = 0.0F;
            class277.field4216[15] = 1.0F;
            class277.field4216[5] = (float) arg2 / ((float) super.field5107 * 128.0F * (float) this.field854.field6497);
            class277.field4216[3] = 0.0F;
            class277.field4216[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field854.field6497;
            class277.field4216[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field854.field6649) + -1.0F;
            class277.field4216[8] = 0.0F;
            class277.field4216[11] = 0.0F;
            class277.field4216[1] = 0.0F;
            class277.field4216[7] = 0.0F;
            class277.field4216[10] = 0.0F;
            class277.field4216[2] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class277.field4216, 0);
            class277.field4216[1] = 0.0F;
            class277.field4216[4] = 0.0F;
            class277.field4216[15] = 1.0F;
            class277.field4216[14] = 0.0F;
            class277.field4216[2] = 0.0F;
            class277.field4216[12] = 0.0F;
            class277.field4216[0] = 1.0F;
            class277.field4216[10] = 0.0F;
            class277.field4216[8] = 0.0F;
            class277.field4216[13] = 0.0F;
            class277.field4216[7] = 0.0F;
            class277.field4216[11] = 0.0F;
            class277.field4216[5] = 0.0F;
            class277.field4216[9] = 1.0F;
            class277.field4216[3] = 0.0F;
            class277.field4216[6] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class277.field4216, 0);
            if (~(7 & this.field855) != -1) {
                this.field854.method2600((byte) 110, true);
                this.field854.method2603(29960);
            } else {
                this.field854.method2600((byte) 105, false);
            }
            this.field854.method2646(this.field874, this.field870, -19887, this.field872, this.field875);
            if (class456.field6997.field536.length < this.field865 * 2) {
                class456.field6997 = new class40(this.field865 * 2);
            } else {
                class456.field6997.field585 = 0;
            }
            int var9 = 0;
            if (this.field854.field6745) {
                for (int var10 = arg4; arg6 > var10; ++var10) {
                    int var11 = super.field5108 * var10 + arg3;
                    for (int var12 = arg3; ~arg5 < ~var12; ++var12) {
                        if (arg7[-arg3 + var12][var10 - arg4]) {
                            short[] var13 = this.field835[var11];
                            if (var13 != null) {
                                for (int var14 = 0; var14 < var13.length; ++var14) {
                                    ++var9;
                                    class456.field6997.method246((byte) -61, 65535 & var13[var14]);
                                }
                            }
                        }
                        ++var11;
                    }
                }
            } else {
                for (int var15 = arg4; var15 < arg6; ++var15) {
                    int var17 = super.field5108 * var15 - -arg3;
                    for (int var18 = arg3; var18 < arg5; ++var18) {
                        if (arg7[-arg3 + var18][-arg4 + var15]) {
                            short[] var19 = this.field835[var17];
                            if (var19 != null) {
                                for (int var20 = 0; var19.length > var20; ++var20) {
                                    class456.field6997.method260(65535 & var19[var20], -2916);
                                    ++var9;
                                }
                            }
                        }
                        ++var17;
                    }
                }
            }
            if (var9 > 0) {
                class49 var16 = new class49(this.field854, 5123, class456.field6997.field536, class456.field6997.field585);
                this.field854.method2593(4, true, 0, var9, var16);
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(Lh;IIIIZ)Z")
    public final boolean method302(class452 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field852;
        if (this.field864 != null && arg0 != null) {
            int var7 = -(this.field854.field6790 * arg2 >> 8) + arg1 >> this.field854.field6686;
            int var8 = -(this.field854.field6748 * arg2 >> 8) + arg3 >> this.field854.field6686;
            return this.field864.method544(var7, arg0, 111, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static final void method386(int arg0) {
        class189.method1196(arg0, arg0 ^ -12229);
        ++field846;
        class327.method2036((byte) 95);
        System.gc();
    }
}
