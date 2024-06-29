import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class212 extends class327 {

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "I")
    private int field2827 = 0;

    @OriginalMember(owner = "client!gca", name = "gb", descriptor = "I")
    private int field2855 = 0;

    @OriginalMember(owner = "client!gca", name = "J", descriptor = "Z")
    private boolean field2832 = false;

    @OriginalMember(owner = "client!gca", name = "Db", descriptor = "I")
    private int field2878 = 0;

    @OriginalMember(owner = "client!gca", name = "Ob", descriptor = "I")
    private int field2889 = 0;

    @OriginalMember(owner = "client!gca", name = "ib", descriptor = "I")
    private int field2857 = 0;

    @OriginalMember(owner = "client!gca", name = "Ub", descriptor = "Z")
    private boolean field2895 = true;

    @OriginalMember(owner = "client!gca", name = "uc", descriptor = "Lad;")
    private class362 field2921;

    @OriginalMember(owner = "client!gca", name = "qb", descriptor = "Lgr;")
    private class371 field2865;

    @OriginalMember(owner = "client!gca", name = "Fb", descriptor = "Lgr;")
    private class371 field2880;

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "Lgr;")
    private class371 field2826;

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "Lgr;")
    private class371 field2822;

    @OriginalMember(owner = "client!gca", name = "ac", descriptor = "Lbp;")
    private class326 field2901;

    @OriginalMember(owner = "client!gca", name = "Wb", descriptor = "I")
    private int field2897;

    @OriginalMember(owner = "client!gca", name = "Yb", descriptor = "I")
    private int field2899;

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "[I")
    private int[] field2821;

    @OriginalMember(owner = "client!gca", name = "P", descriptor = "[I")
    private int[] field2838;

    @OriginalMember(owner = "client!gca", name = "rc", descriptor = "[I")
    private int[] field2918;

    @OriginalMember(owner = "client!gca", name = "Y", descriptor = "[S")
    private short[] field2847;

    @OriginalMember(owner = "client!gca", name = "R", descriptor = "[I")
    private int[] field2840;

    @OriginalMember(owner = "client!gca", name = "Jb", descriptor = "[Lgl;")
    private class522[] field2884;

    @OriginalMember(owner = "client!gca", name = "pb", descriptor = "[Lfca;")
    private class75[] field2864;

    @OriginalMember(owner = "client!gca", name = "Nb", descriptor = "I")
    private int field2888;

    @OriginalMember(owner = "client!gca", name = "Bb", descriptor = "[Ldi;")
    private class109[] field2876;

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "[Lbr;")
    private class334[] field2823;

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "[B")
    private byte[] field2829;

    @OriginalMember(owner = "client!gca", name = "zb", descriptor = "[S")
    private short[] field2874;

    @OriginalMember(owner = "client!gca", name = "kc", descriptor = "[S")
    private short[] field2911;

    @OriginalMember(owner = "client!gca", name = "jb", descriptor = "[F")
    private float[] field2858;

    @OriginalMember(owner = "client!gca", name = "rb", descriptor = "[S")
    private short[] field2866;

    @OriginalMember(owner = "client!gca", name = "nb", descriptor = "[S")
    private short[] field2862;

    @OriginalMember(owner = "client!gca", name = "Pb", descriptor = "[S")
    private short[] field2890;

    @OriginalMember(owner = "client!gca", name = "V", descriptor = "[S")
    private short[] field2844;

    @OriginalMember(owner = "client!gca", name = "ub", descriptor = "[F")
    private float[] field2869;

    @OriginalMember(owner = "client!gca", name = "Ac", descriptor = "S")
    private short field2927;

    @OriginalMember(owner = "client!gca", name = "T", descriptor = "[S")
    private short[] field2842;

    @OriginalMember(owner = "client!gca", name = "Eb", descriptor = "[S")
    private short[] field2879;

    @OriginalMember(owner = "client!gca", name = "W", descriptor = "S")
    private short field2845;

    @OriginalMember(owner = "client!gca", name = "N", descriptor = "[S")
    private short[] field2836;

    @OriginalMember(owner = "client!gca", name = "M", descriptor = "[B")
    private byte[] field2835;

    @OriginalMember(owner = "client!gca", name = "Sb", descriptor = "[S")
    private short[] field2893;

    @OriginalMember(owner = "client!gca", name = "O", descriptor = "[I")
    private int[] field2837;

    @OriginalMember(owner = "client!gca", name = "cc", descriptor = "[[I")
    private int[][] field2903;

    @OriginalMember(owner = "client!gca", name = "U", descriptor = "[[I")
    private int[][] field2843;

    @OriginalMember(owner = "client!gca", name = "vb", descriptor = "[[I")
    private int[][] field2870;

    @OriginalMember(owner = "client!gca", name = "ic", descriptor = "I")
    public static int field2909 = -1;

    @OriginalMember(owner = "client!gca", name = "zc", descriptor = "Lks;")
    public static class375 field2926 = new class375(128);

    @OriginalMember(owner = "client!gca", name = "Qb", descriptor = "B")
    private byte field2891;

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!gca", name = "B", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!gca", name = "L", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!gca", name = "Q", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!gca", name = "S", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!gca", name = "Z", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!gca", name = "ab", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!gca", name = "bb", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!gca", name = "cb", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!gca", name = "db", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!gca", name = "eb", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!gca", name = "fb", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!gca", name = "hb", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!gca", name = "kb", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!gca", name = "lb", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!gca", name = "ob", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!gca", name = "sb", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!gca", name = "tb", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!gca", name = "wb", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!gca", name = "xb", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!gca", name = "Ab", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!gca", name = "Cb", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!gca", name = "Gb", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!gca", name = "Ib", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!gca", name = "Kb", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!gca", name = "Lb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!gca", name = "Mb", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!gca", name = "Rb", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!gca", name = "Tb", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!gca", name = "Vb", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!gca", name = "Xb", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!gca", name = "Zb", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!gca", name = "ec", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!gca", name = "fc", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!gca", name = "gc", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!gca", name = "hc", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!gca", name = "lc", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!gca", name = "mc", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!gca", name = "oc", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!gca", name = "qc", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!gca", name = "sc", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!gca", name = "tc", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!gca", name = "vc", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!gca", name = "wc", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!gca", name = "xc", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!gca", name = "yc", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!gca", name = "jc", descriptor = "Lbo;")
    private class632 field2910;

    @OriginalMember(owner = "client!gca", name = "X", descriptor = "Lnca;")
    private class650 field2846;

    @OriginalMember(owner = "client!gca", name = "nc", descriptor = "Lil;")
    private class7 field2914;

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "S")
    private short field2816;

    @OriginalMember(owner = "client!gca", name = "mb", descriptor = "S")
    private short field2861;

    @OriginalMember(owner = "client!gca", name = "yb", descriptor = "S")
    private short field2873;

    @OriginalMember(owner = "client!gca", name = "Hb", descriptor = "S")
    private short field2882;

    @OriginalMember(owner = "client!gca", name = "bc", descriptor = "S")
    private short field2902;

    @OriginalMember(owner = "client!gca", name = "dc", descriptor = "S")
    private short field2904;

    @OriginalMember(owner = "client!gca", name = "pc", descriptor = "S")
    private short field2916;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "()[Lgl;")
    public final class522[] method1348() {
        field2886++;
        return this.field2884;
    }

    @OriginalMember(owner = "client!gca", name = "ha", descriptor = "()I")
    public final int method1349() {
        field2824++;
        if (!this.field2832) {
            this.method1366(0);
        }
        return this.field2873;
    }

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "(I[IIIIIZ)V")
    public final void method1350(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2849++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = 0;
            class102.field1225 = 0;
            class590.field8477 = 0;
            class239.field3404 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field2903.length > var14) {
                    int[] var15 = this.field2903[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class239.field3404 += this.field2840[var17];
                        class102.field1225 += this.field2918[var17];
                        var12++;
                        class590.field8477 += this.field2838[var17];
                    }
                }
            }
            if (var12 > 0) {
                class239.field3404 = class239.field3404 / var12 + var10;
                class590.field8477 = class590.field8477 / var12 + var9;
                class102.field1225 = class102.field1225 / var12 + var11;
            } else {
                class590.field8477 = var9;
                class239.field3404 = var10;
                class102.field1225 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg2 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field2903.length > var22) {
                    int[] var23 = this.field2903[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field2840[var25] += var19;
                        this.field2918[var25] += var18;
                        this.field2838[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field2903.length > var45) {
                    int[] var46 = this.field2903[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field2840[var48] -= class239.field3404;
                            this.field2918[var48] -= class102.field1225;
                            this.field2838[var48] -= class590.field8477;
                            if (arg4 != 0) {
                                int var49 = class605.field8859[arg4];
                                int var50 = class605.field8858[arg4];
                                int var51 = this.field2918[var48] * var49 + this.field2840[var48] * var50 + 16383 >> 14;
                                this.field2918[var48] = this.field2918[var48] * var50 + 16383 - this.field2840[var48] * var49 >> 14;
                                this.field2840[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class605.field8859[arg2];
                                int var53 = class605.field8858[arg2];
                                int var54 = this.field2918[var48] * var53 - (this.field2838[var48] * var52 - 16383) >> 14;
                                this.field2838[var48] = this.field2918[var48] * var52 + (this.field2838[var48] * var53) + 16383 >> 14;
                                this.field2918[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class605.field8859[arg3];
                                int var56 = class605.field8858[arg3];
                                int var57 = this.field2838[var48] * var55 - (-(this.field2840[var48] * var56) - 16383) >> 14;
                                this.field2838[var48] = this.field2838[var48] * var56 + 16383 - this.field2840[var48] * var55 >> 14;
                                this.field2840[var48] = var57;
                            }
                            this.field2840[var48] += class239.field3404;
                            this.field2918[var48] += class102.field1225;
                            this.field2838[var48] += class590.field8477;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field2840[var59] -= class239.field3404;
                            this.field2918[var59] -= class102.field1225;
                            this.field2838[var59] -= class590.field8477;
                            if (arg2 != 0) {
                                int var60 = class605.field8859[arg2];
                                int var61 = class605.field8858[arg2];
                                int var62 = this.field2918[var59] * var61 + 16383 - this.field2838[var59] * var60 >> 14;
                                this.field2838[var59] = this.field2918[var59] * var60 + this.field2838[var59] * var61 + 16383 >> 14;
                                this.field2918[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class605.field8859[arg4];
                                int var64 = class605.field8858[arg4];
                                int var65 = this.field2840[var59] * var64 + (this.field2918[var59] * var63 + 16383) >> 14;
                                this.field2918[var59] = this.field2918[var59] * var64 + 16383 - (this.field2840[var59] * var63) >> 14;
                                this.field2840[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class605.field8859[arg3];
                                int var67 = class605.field8858[arg3];
                                int var68 = this.field2840[var59] * var67 + this.field2838[var59] * var66 + 16383 >> 14;
                                this.field2838[var59] = this.field2838[var59] * var67 + 16383 - (this.field2840[var59] * var66) >> 14;
                                this.field2840[var59] = var68;
                            }
                            this.field2840[var59] += class239.field3404;
                            this.field2918[var59] += class102.field1225;
                            this.field2838[var59] += class590.field8477;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field2903.length) {
                        int[] var29 = this.field2903[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field2821[var31];
                            int var33 = this.field2821[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field2874[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class605.field8859[arg4];
                                    int var37 = class605.field8858[arg4];
                                    int var38 = this.field2893[var35] * var36 + this.field2836[var35] * var37 + 16383 >> 14;
                                    this.field2893[var35] = (short) (this.field2893[var35] * var37 + 16383 - (this.field2836[var35] * var36) >> 14);
                                    this.field2836[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class605.field8859[arg2];
                                    int var40 = class605.field8858[arg2];
                                    int var41 = this.field2893[var35] * var40 + 16383 - (this.field2866[var35] * var39) >> 14;
                                    this.field2866[var35] = (short) (this.field2893[var35] * var39 + this.field2866[var35] * var40 + 16383 >> 14);
                                    this.field2893[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class605.field8859[arg3];
                                    int var43 = class605.field8858[arg3];
                                    int var44 = this.field2866[var35] * var42 + this.field2836[var35] * var43 + 16383 >> 14;
                                    this.field2866[var35] = (short) (this.field2866[var35] * var43 + 16383 - (this.field2836[var35] * var42) >> 14);
                                    this.field2836[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field2826 == null && this.field2822 != null) {
                    this.field2822.field5680 = null;
                }
                if (this.field2826 != null) {
                    this.field2826.field5680 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field2903.length > var70) {
                    int[] var71 = this.field2903[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field2840[var73] -= class239.field3404;
                        this.field2918[var73] -= class102.field1225;
                        this.field2838[var73] -= class590.field8477;
                        this.field2840[var73] = this.field2840[var73] * arg2 >> 7;
                        this.field2918[var73] = this.field2918[var73] * arg3 >> 7;
                        this.field2838[var73] = this.field2838[var73] * arg4 >> 7;
                        this.field2840[var73] += class239.field3404;
                        this.field2918[var73] += class102.field1225;
                        this.field2838[var73] += class590.field8477;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2870 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field2870.length) {
                        int[] var79 = this.field2870[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field2835[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field2835[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field2822 != null) {
                            this.field2822.field5680 = null;
                        }
                    }
                }
                if (this.field2876 != null) {
                    for (int var75 = 0; var75 < this.field2888; var75++) {
                        class109 var76 = this.field2876[var75];
                        class334 var77 = this.field2823[var75];
                        var77.field4798 = 255 - (this.field2835[var76.field1341] & 0xFF) << 24 | var77.field4798 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field2870 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field2870.length) {
                        int[] var88 = this.field2870[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field2842[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFD28) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = var92 + arg2 & 0x3F;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field2842[var90] = (short) class283.method1834(class283.method1834(var95 << 10, var94 << 7), var97);
                        }
                        if (var88.length > 0 && this.field2822 != null) {
                            this.field2822.field5680 = null;
                        }
                    }
                }
                if (this.field2876 != null) {
                    for (int var84 = 0; var84 < this.field2888; var84++) {
                        class109 var85 = this.field2876[var84];
                        class334 var86 = this.field2823[var84];
                        var86.field4798 = var86.field4798 & 0xFF000000 | class403.field6100[this.field2842[var85.field1341] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field2843 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field2843.length > var99) {
                        int[] var100 = this.field2843[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class334 var102 = this.field2823[var100[var101]];
                            var102.field4800 += arg3;
                            var102.field4799 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2843 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field2843.length) {
                        int[] var105 = this.field2843[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class334 var107 = this.field2823[var105[var106]];
                            var107.field4801 = var107.field4801 * arg2 >> 7;
                            var107.field4797 = var107.field4797 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2843 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field2843.length) {
                    int[] var110 = this.field2843[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class334 var112 = this.field2823[var110[var111]];
                        var112.field4802 = var112.field4802 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "UA", descriptor = "(SS)V")
    public final void method1351(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2827; var3++) {
            if (this.field2842[var3] == arg0) {
                this.field2842[var3] = arg1;
            }
        }
        field2887++;
        if (this.field2876 != null) {
            for (int var4 = 0; var4 < this.field2888; var4++) {
                class109 var5 = this.field2876[var4];
                class334 var6 = this.field2823[var4];
                var6.field4798 = var6.field4798 & 0xFF000000 | class403.field6100[this.field2842[var5.field1341] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field2822 != null) {
            this.field2822.field5680 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "EA", descriptor = "()I")
    public final int method1352() {
        field2871++;
        if (!this.field2832) {
            this.method1366(0);
        }
        return this.field2816;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "()[Lfca;")
    public final class75[] method1353() {
        field2881++;
        return this.field2864;
    }

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "(III)V")
    public final void method1354(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2878; var4++) {
            if (arg0 != 0) {
                this.field2840[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field2918[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field2838[var4] += arg2;
            }
        }
        field2848++;
        if (this.field2865 != null) {
            this.field2865.field5680 = null;
        }
        this.field2832 = false;
    }

    @OriginalMember(owner = "client!gca", name = "P", descriptor = "()V")
    public final void method1355() {
        field2860++;
        for (int var1 = 0; var1 < this.field2878; var1++) {
            this.field2838[var1] = -this.field2838[var1];
        }
        for (int var2 = 0; var2 < this.field2855; var2++) {
            this.field2866[var2] = (short) (-this.field2866[var2]);
        }
        for (int var3 = 0; var3 < this.field2827; var3++) {
            short var4 = this.field2879[var3];
            this.field2879[var3] = this.field2844[var3];
            this.field2844[var3] = var4;
        }
        if (this.field2826 == null && this.field2822 != null) {
            this.field2822.field5680 = null;
        }
        if (this.field2826 != null) {
            this.field2826.field5680 = null;
        }
        if (this.field2901 != null) {
            this.field2901.field4701 = null;
        }
        this.field2832 = false;
        if (this.field2865 != null) {
            this.field2865.field5680 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final void method1356(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field2924++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            class239.field3404 = 0;
            class590.field8477 = 0;
            class102.field1225 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field2903.length > var15) {
                    int[] var16 = this.field2903[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field2847 == null || (arg6 & this.field2847[var18]) != 0) {
                            class239.field3404 += this.field2840[var18];
                            class102.field1225 += this.field2918[var18];
                            class590.field8477 += this.field2838[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class102.field1225 = var11;
                class590.field8477 = var10;
                class239.field3404 = var12;
            } else {
                class590.field8477 = class590.field8477 / var13 + var10;
                class615.field8952 = true;
                class239.field3404 = class239.field3404 / var13 + var12;
                class102.field1225 = class102.field1225 / var13 + var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 - (-(arg7[8] * arg4) - 8192) >> 14;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field2903.length > var26) {
                    int[] var27 = this.field2903[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field2847 == null || (arg6 & this.field2847[var29]) != 0) {
                            this.field2840[var29] += var24;
                            this.field2918[var29] += var23;
                            this.field2838[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field2903.length > var49) {
                        int[] var50 = this.field2903[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field2847 == null || (this.field2847[var52] & arg6) != 0) {
                                this.field2840[var52] -= class239.field3404;
                                this.field2918[var52] -= class102.field1225;
                                this.field2838[var52] -= class590.field8477;
                                if (arg4 != 0) {
                                    int var53 = class605.field8859[arg4];
                                    int var54 = class605.field8858[arg4];
                                    int var55 = this.field2840[var52] * var54 + this.field2918[var52] * var53 + 16383 >> 14;
                                    this.field2918[var52] = this.field2918[var52] * var54 - (this.field2840[var52] * var53 - 16383) >> 14;
                                    this.field2840[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class605.field8859[arg2];
                                    int var57 = class605.field8858[arg2];
                                    int var58 = this.field2918[var52] * var57 + 16383 - (this.field2838[var52] * var56) >> 14;
                                    this.field2838[var52] = this.field2838[var52] * var57 + this.field2918[var52] * var56 + 16383 >> 14;
                                    this.field2918[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class605.field8859[arg3];
                                    int var60 = class605.field8858[arg3];
                                    int var61 = this.field2840[var52] * var60 + this.field2838[var52] * var59 + 16383 >> 14;
                                    this.field2838[var52] = this.field2838[var52] * var60 + 16383 - (this.field2840[var52] * var59) >> 14;
                                    this.field2840[var52] = var61;
                                }
                                this.field2840[var52] += class239.field3404;
                                this.field2918[var52] += class102.field1225;
                                this.field2838[var52] += class590.field8477;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field2903.length) {
                            int[] var33 = this.field2903[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field2847 == null || (arg6 & this.field2847[var35]) != 0) {
                                    int var36 = this.field2821[var35];
                                    int var37 = this.field2821[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field2874[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class605.field8859[arg4];
                                            int var41 = class605.field8858[arg4];
                                            int var42 = this.field2893[var39] * var40 + this.field2836[var39] * var41 + 16383 >> 14;
                                            this.field2893[var39] = (short) (this.field2893[var39] * var41 + 16383 - (this.field2836[var39] * var40) >> 14);
                                            this.field2836[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class605.field8859[arg2];
                                            int var44 = class605.field8858[arg2];
                                            int var45 = this.field2893[var39] * var44 + 16383 - this.field2866[var39] * var43 >> 14;
                                            this.field2866[var39] = (short) (this.field2893[var39] * var43 + this.field2866[var39] * var44 + 16383 >> 14);
                                            this.field2893[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class605.field8859[arg3];
                                            int var47 = class605.field8858[arg3];
                                            int var48 = this.field2866[var39] * var46 - (-(this.field2836[var39] * var47) - 16383) >> 14;
                                            this.field2866[var39] = (short) (this.field2866[var39] * var47 + (16383 - (this.field2836[var39] * var46)) >> 14);
                                            this.field2836[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field2826 == null && this.field2822 != null) {
                        this.field2822.field5680 = null;
                    }
                    if (this.field2826 != null) {
                        this.field2826.field5680 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class615.field8952) {
                    int var68 = arg7[0] * class239.field3404 + arg7[6] * class590.field8477 + arg7[3] * class102.field1225 + 8192 >> 14;
                    int var69 = arg7[7] * class590.field8477 + arg7[1] * class239.field3404 + arg7[4] * class102.field1225 + 8192 >> 14;
                    int var70 = var65 + var68;
                    int var71 = arg7[2] * class239.field3404 + (arg7[8] * class590.field8477) + arg7[5] * class102.field1225 + 8192 >> 14;
                    int var72 = var66 + var69;
                    int var73 = var67 + var71;
                    class239.field3404 = var70;
                    class102.field1225 = var72;
                    class590.field8477 = var73;
                    class615.field8952 = false;
                }
                int[] var74 = new int[9];
                int var75 = class605.field8858[arg2];
                int var76 = class605.field8859[arg2];
                int var77 = class605.field8858[arg3];
                int var78 = class605.field8859[arg3];
                int var79 = class605.field8858[arg4];
                int var80 = class605.field8859[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[0] = var77 * var79 - (-(var78 * var82) - 8192) >> 14;
                var74[5] = -var76;
                var74[1] = -var77 * var80 + (var78 * var81) + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[6] = var77 * var82 + (-var78 * var79 + 8192) >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                int var83 = var74[0] * -class239.field3404 + (var74[1] * -class102.field1225 + (var74[2] * -class590.field8477)) + 8192 >> 14;
                int var84 = var74[5] * -class590.field8477 + var74[4] * -class102.field1225 + var74[3] * -class239.field3404 + 8192 >> 14;
                int var85 = var74[8] * -class590.field8477 + var74[6] * -class239.field3404 + (var74[7] * -class102.field1225) + 8192 >> 14;
                int var86 = class239.field3404 + var83;
                int var87 = var84 + class102.field1225;
                int var88 = class590.field8477 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[0] * var65 + var74[2] * var67 + var74[1] * var66 + 8192 >> 14;
                int var92 = var74[3] * var65 + var74[4] * var66 + var74[5] * var67 + 8192 >> 14;
                int var93 = var74[6] * var65 + var74[8] * var67 + var74[7] * var66 + 8192 >> 14;
                int var94 = var87 + var92;
                int var95 = var86 + var91;
                int var96 = var88 + var93;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += var89[var116 + (var118 * 3)] * arg7[var98 * 3 + var118];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[1] * var94 + arg7[0] * var95 + 8192 >> 14;
                int var100 = arg7[3] * var95 + (arg7[4] * var94) + arg7[5] * var96 + 8192 >> 14;
                int var101 = var62 + var99;
                int var102 = var63 + var100;
                int var103 = arg7[8] * var96 + arg7[7] * var94 + arg7[6] * var95 + 8192 >> 14;
                int var104 = var64 + var103;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field2903.length > var106) {
                        int[] var107 = this.field2903[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field2847 == null || (arg6 & this.field2847[var109]) != 0) {
                                int var110 = this.field2918[var109] * var97[1] + this.field2840[var109] * var97[0] + this.field2838[var109] * var97[2] + 8192 >> 14;
                                int var111 = this.field2840[var109] * var97[3] + this.field2838[var109] * var97[5] + (this.field2918[var109] * var97[4]) + 8192 >> 14;
                                int var112 = var101 + var110;
                                int var113 = var102 + var111;
                                int var114 = this.field2838[var109] * var97[8] + this.field2840[var109] * var97[6] + (this.field2918[var109] * var97[7]) + 8192 >> 14;
                                this.field2840[var109] = var112;
                                int var115 = var104 + var114;
                                this.field2918[var109] = var113;
                                this.field2838[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field2903.length > var123) {
                        int[] var124 = this.field2903[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field2847 == null || (this.field2847[var126] & arg6) != 0) {
                                this.field2840[var126] -= class239.field3404;
                                this.field2918[var126] -= class102.field1225;
                                this.field2838[var126] -= class590.field8477;
                                this.field2840[var126] = this.field2840[var126] * arg2 >> 7;
                                this.field2918[var126] = this.field2918[var126] * arg3 >> 7;
                                this.field2838[var126] = this.field2838[var126] * arg4 >> 7;
                                this.field2840[var126] += class239.field3404;
                                this.field2918[var126] += class102.field1225;
                                this.field2838[var126] += class590.field8477;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class615.field8952) {
                    int var133 = arg7[0] * class239.field3404 + arg7[3] * class102.field1225 - (-(arg7[6] * class590.field8477) - 8192) >> 14;
                    int var134 = arg7[7] * class590.field8477 + (arg7[1] * class239.field3404 + (arg7[4] * class102.field1225)) + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = arg7[2] * class239.field3404 + arg7[8] * class590.field8477 + arg7[5] * class102.field1225 + 8192 >> 14;
                    int var137 = var131 + var134;
                    int var138 = var132 + var136;
                    class102.field1225 = var137;
                    class239.field3404 = var135;
                    class615.field8952 = false;
                    class590.field8477 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class239.field3404 * var139 + 8192 >> 14;
                int var143 = -class102.field1225 * var140 + 8192 >> 14;
                int var144 = -class590.field8477 * var141 + 8192 >> 14;
                int var145 = class239.field3404 + var142;
                int var146 = class102.field1225 + var143;
                int var147 = var144 + class590.field8477;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
                int var152 = var146 + var150;
                int var153 = var145 + var149;
                int var154 = var147 + var151;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[0] * var153 + arg7[1] * var152 + 8192 >> 14;
                int var158 = arg7[5] * var154 + arg7[4] * var152 + arg7[3] * var153 + 8192 >> 14;
                int var159 = var128 + var158;
                int var160 = arg7[6] * var153 + (arg7[7] * var152 + (arg7[8] * var154)) + 8192 >> 14;
                int var161 = var127 + var157;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field2903.length) {
                        int[] var165 = this.field2903[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field2847 == null || (this.field2847[var167] & arg6) != 0) {
                                int var168 = this.field2918[var167] * var155[1] + this.field2840[var167] * var155[0] + (this.field2838[var167] * var155[2]) + 8192 >> 14;
                                int var169 = this.field2918[var167] * var155[4] + this.field2840[var167] * var155[3] + (this.field2838[var167] * var155[5]) + 8192 >> 14;
                                int var170 = this.field2918[var167] * var155[7] + this.field2840[var167] * var155[6] + (this.field2838[var167] * var155[8]) + 8192 >> 14;
                                int var171 = var161 + var168;
                                int var172 = var159 + var169;
                                this.field2840[var167] = var171;
                                int var173 = var162 + var170;
                                this.field2918[var167] = var172;
                                this.field2838[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2870 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field2870.length > var181) {
                        int[] var182 = this.field2870[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field2911 == null || (this.field2911[var184] & arg6) != 0) {
                                int var185 = (this.field2835[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field2835[var184] = (byte) var185;
                                if (this.field2822 != null) {
                                    this.field2822.field5680 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field2876 != null) {
                    for (int var178 = 0; var178 < this.field2888; var178++) {
                        class109 var179 = this.field2876[var178];
                        class334 var180 = this.field2823[var178];
                        var180.field4798 = var180.field4798 & 0xFFFFFF | 255 - (this.field2835[var179.field1341] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field2870 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field2870.length > var190) {
                        int[] var191 = this.field2870[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field2911 == null || (arg6 & this.field2911[var193]) != 0) {
                                int var194 = this.field2842[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x3CD) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = var194 & 0x7F;
                                int var200 = arg4 + var199;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field2842[var193] = (short) class283.method1834(class283.method1834(var198 << 10, var197 << 7), var200);
                                if (this.field2822 != null) {
                                    this.field2822.field5680 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field2876 != null) {
                    for (int var187 = 0; var187 < this.field2888; var187++) {
                        class109 var188 = this.field2876[var187];
                        class334 var189 = this.field2823[var187];
                        var189.field4798 = var189.field4798 & 0xFF000000 | class403.field6100[this.field2842[var188.field1341] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field2843 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field2843.length) {
                        int[] var203 = this.field2843[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class334 var205 = this.field2823[var203[var204]];
                            var205.field4799 += arg2;
                            var205.field4800 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2843 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field2843.length) {
                        int[] var208 = this.field2843[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class334 var210 = this.field2823[var208[var209]];
                            var210.field4797 = var210.field4797 * arg3 >> 7;
                            var210.field4801 = var210.field4801 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2843 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field2843.length > var212) {
                    int[] var213 = this.field2843[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class334 var215 = this.field2823[var213[var214]];
                        var215.field4802 = var215.field4802 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "V", descriptor = "(I)V")
    public final void method1357(int arg0) {
        field2833++;
        int var2 = class605.field8859[arg0];
        int var3 = class605.field8858[arg0];
        for (int var4 = 0; var4 < this.field2878; var4++) {
            int var7 = this.field2840[var4] * var3 + this.field2838[var4] * var2 >> 14;
            this.field2838[var4] = this.field2838[var4] * var3 - this.field2840[var4] * var2 >> 14;
            this.field2840[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field2855; var5++) {
            int var6 = this.field2866[var5] * var2 + (this.field2836[var5] * var3) >> 14;
            this.field2866[var5] = (short) (this.field2866[var5] * var3 - (this.field2836[var5] * var2) >> 14);
            this.field2836[var5] = (short) var6;
        }
        if (this.field2826 == null && this.field2822 != null) {
            this.field2822.field5680 = null;
        }
        if (this.field2826 != null) {
            this.field2826.field5680 = null;
        }
        if (this.field2865 != null) {
            this.field2865.field5680 = null;
        }
        this.field2832 = false;
    }

    @OriginalMember(owner = "client!gca", name = "AA", descriptor = "(I)V")
    public final void method1358(int arg0) {
        field2828++;
        int var2 = class605.field8859[arg0];
        int var3 = class605.field8858[arg0];
        for (int var4 = 0; var4 < this.field2878; var4++) {
            int var5 = this.field2918[var4] * var3 - this.field2838[var4] * var2 >> 14;
            this.field2838[var4] = this.field2918[var4] * var2 + this.field2838[var4] * var3 >> 14;
            this.field2918[var4] = var5;
        }
        if (this.field2865 != null) {
            this.field2865.field5680 = null;
        }
        this.field2832 = false;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
    private final void method1359(int arg0) {
        field2922++;
        if (!this.field2895) {
            return;
        }
        this.field2895 = false;
        if (this.field2864 == null && this.field2884 == null && this.field2876 == null) {
            if (this.field2840 != null && !class16.method111(this.field2897, this.field2899, (byte) 119)) {
                if (this.field2865 != null && this.field2865.field5680 == null) {
                    this.field2895 = true;
                } else {
                    if (!this.field2832) {
                        this.method1366(arg0);
                    }
                    this.field2840 = null;
                }
            }
            if (this.field2918 != null && !class293.method1895(this.field2897, (byte) -56, this.field2899)) {
                if (this.field2865 != null && this.field2865.field5680 == null) {
                    this.field2895 = true;
                } else {
                    if (!this.field2832) {
                        this.method1366(0);
                    }
                    this.field2918 = null;
                }
            }
            if (this.field2838 != null && !class2.method7(this.field2897, -28843, this.field2899)) {
                if (this.field2865 != null && this.field2865.field5680 == null) {
                    this.field2895 = true;
                } else {
                    if (!this.field2832) {
                        this.method1366(0);
                    }
                    this.field2838 = null;
                }
            }
        }
        if (this.field2874 != null && this.field2840 == null && this.field2918 == null && this.field2838 == null) {
            this.field2874 = null;
            this.field2821 = null;
        }
        if (this.field2829 != null && !class306.method2038(this.field2897, this.field2899, arg0 + 118)) {
            if (this.field2826 == null) {
                if (this.field2822 != null && this.field2822.field5680 == null) {
                    this.field2895 = true;
                } else {
                    this.field2829 = null;
                    this.field2836 = this.field2893 = this.field2866 = null;
                }
            } else if (this.field2826.field5680 == null) {
                this.field2895 = true;
            } else {
                this.field2836 = this.field2893 = this.field2866 = null;
                this.field2829 = null;
            }
        }
        if (this.field2842 != null && !class340.method2188((byte) -125, this.field2899, this.field2897)) {
            if (this.field2822 != null && this.field2822.field5680 == null) {
                this.field2895 = true;
            } else {
                this.field2842 = null;
            }
        }
        if (this.field2835 != null && !class356.method2241(this.field2899, 30312, this.field2897)) {
            if (this.field2822 != null && this.field2822.field5680 == null) {
                this.field2895 = true;
            } else {
                this.field2835 = null;
            }
        }
        if (arg0 != 0) {
            return;
        }
        if (this.field2869 != null && !class563.method3255(this.field2899, 29686, this.field2897)) {
            if (this.field2880 != null && this.field2880.field5680 == null) {
                this.field2895 = true;
            } else {
                this.field2869 = this.field2858 = null;
            }
        }
        if (this.field2862 != null && !class33.method188(this.field2899, 126, this.field2897)) {
            if (this.field2822 != null && this.field2822.field5680 == null) {
                this.field2895 = true;
            } else {
                this.field2862 = null;
            }
        }
        if (this.field2879 != null && !class58.method418(this.field2899, this.field2897, -13)) {
            if ((this.field2901 == null || this.field2901.field4701 != null) && (this.field2822 == null || this.field2822.field5680 != null)) {
                this.field2879 = this.field2890 = this.field2844 = null;
            } else {
                this.field2895 = true;
            }
        }
        if (this.field2870 != null && !class329.method2143(this.field2897, (byte) 124, this.field2899)) {
            this.field2911 = null;
            this.field2870 = null;
        }
        if (this.field2903 != null && !class485.method2926(-120, this.field2899, this.field2897)) {
            this.field2903 = null;
            this.field2847 = null;
        }
        if (this.field2843 != null && !class381.method2447(this.field2897, (byte) 108, this.field2899)) {
            this.field2843 = null;
        }
        if (this.field2837 != null && (this.field2897 & 0x800) == 0 && (this.field2897 & 0x40000) == 0) {
            this.field2837 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "ZA", descriptor = "()I")
    public final int method1360() {
        field2898++;
        if (!this.field2832) {
            this.method1366(0);
        }
        return this.field2916;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lba;IIIZ)V")
    public final void method1361(class327 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2863++;
        class212 var6 = (class212) arg0;
        if (this.field2827 == 0 || var6.field2827 == 0) {
            return;
        }
        int var7 = var6.field2878;
        int[] var8 = var6.field2840;
        int[] var9 = var6.field2918;
        int[] var10 = var6.field2838;
        short[] var11 = var6.field2836;
        short[] var12 = var6.field2893;
        short[] var13 = var6.field2866;
        byte[] var14 = var6.field2829;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field2846 == null) {
            var18 = null;
            var15 = null;
            var17 = null;
            var16 = null;
        } else {
            var15 = this.field2846.field9384;
            var16 = this.field2846.field9382;
            var17 = this.field2846.field9378;
            var18 = this.field2846.field9380;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field2846 == null) {
            var19 = null;
            var21 = null;
            var22 = null;
            var20 = null;
        } else {
            var19 = var6.field2846.field9384;
            var20 = var6.field2846.field9378;
            var21 = var6.field2846.field9382;
            var22 = var6.field2846.field9380;
        }
        int[] var23 = var6.field2821;
        short[] var24 = var6.field2874;
        if (!var6.field2832) {
            var6.method1366(0);
        }
        short var25 = var6.field2861;
        short var26 = var6.field2816;
        short var27 = var6.field2873;
        short var28 = var6.field2902;
        short var29 = var6.field2882;
        short var30 = var6.field2904;
        for (int var31 = 0; var31 < this.field2878; var31++) {
            int var32 = this.field2918[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field2840[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field2838[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field2821[var31];
                        int var37 = this.field2821[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2874[var38] - 1;
                            if (var35 == -1 || this.field2829[var35] != 0) {
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
                                            this.field2846 = new class650();
                                            var15 = this.field2846.field9384 = class98.method608((byte) -110, this.field2836);
                                            var17 = this.field2846.field9378 = class98.method608((byte) -110, this.field2893);
                                            var18 = this.field2846.field9380 = class98.method608((byte) -110, this.field2866);
                                            var16 = this.field2846.field9382 = class359.method2244(0, this.field2829);
                                        }
                                        if (var19 == null) {
                                            class650 var44 = var6.field2846 = new class650();
                                            var19 = var44.field9384 = class98.method608((byte) -110, var11);
                                            var20 = var44.field9378 = class98.method608((byte) -110, var12);
                                            var22 = var44.field9380 = class98.method608((byte) -110, var13);
                                            var21 = var44.field9382 = class359.method2244(0, var14);
                                        }
                                        short var45 = this.field2836[var35];
                                        short var46 = this.field2893[var35];
                                        short var47 = this.field2866[var35];
                                        byte var48 = this.field2829[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var22[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        byte var53 = var14[var40];
                                        short var54 = var13[var40];
                                        int var55 = this.field2821[var31 + 1];
                                        short var56 = var12[var40];
                                        short var57 = var11[var40];
                                        int var58 = this.field2821[var31];
                                        for (int var59 = var58; var59 < var55; var59++) {
                                            int var60 = this.field2874[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var15[var60] += var57;
                                                var17[var60] += var56;
                                                var18[var60] += var54;
                                                var16[var60] += var53;
                                            }
                                        }
                                        if (this.field2826 == null && this.field2822 != null) {
                                            this.field2822.field5680 = null;
                                        }
                                        if (this.field2826 != null) {
                                            this.field2826.field5680 = null;
                                        }
                                        if (var6.field2826 == null && var6.field2822 != null) {
                                            var6.field2822.field5680 = null;
                                        }
                                        if (var6.field2826 != null) {
                                            var6.field2826.field5680 = null;
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

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIISB)I")
    private final int method1362(int arg0, int arg1, int arg2, short arg3, byte arg4) {
        field2923++;
        int var6 = class403.field6100[class377.method2429(arg1, arg0, (byte) 56)];
        if (arg3 != -1) {
            class614 var7 = this.field2921.field8852.method438(54, arg3 & 0xFFFF);
            int var8 = var7.field8926 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg1 < 0) {
                    var9 = 0;
                } else if (arg1 <= 127) {
                    var9 = arg1 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field8939 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = ((var13 & 0x6400FF00) << 8) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        int var16 = 33 / ((7 - arg2) / 48);
        return (var6 << 8) - ((arg4 & 0xFF) - 255);
    }

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "(I)V")
    public final void method1363(int arg0) {
        if (this.field2822 != null) {
            this.field2822.field5680 = null;
        }
        this.field2927 = (short) arg0;
        field2885++;
    }

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "()I")
    public final int method1364() {
        field2834++;
        return this.field2927;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lq;Lsda;II)V")
    public final void method1365(class364 arg0, class219 arg1, int arg2, int arg3) {
        field2913++;
        if (this.field2855 == 0) {
            return;
        }
        class302 var5 = this.field2921.field5453;
        if (!this.field2832) {
            this.method1366(0);
        }
        class302 var6 = (class302) arg0;
        class287.field3972 = var5.field4449 * var6.field4440 + var5.field4451 * var6.field4452 + var5.field4448 * var6.field4439 + var5.field4440;
        class611.field8899 = var5.field4449 * var6.field4448 + var5.field4451 * var6.field4444 + var5.field4448 * var6.field4458;
        float var7 = (float) this.field2861 * class611.field8899 + class287.field3972;
        float var8 = (float) this.field2816 * class611.field8899 + class287.field3972;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) this.field2916 + var7;
            var10 = (float) (-this.field2916) + var8;
        } else {
            var10 = (float) (-this.field2916) + var7;
            var9 = (float) this.field2916 + var8;
        }
        if ((this.field2921.field5460 <= var10) || ((float) this.field2921.field5455 >= var9)) {
            return;
        }
        class581.field8363 = var5.field4462 * var6.field4448 + var5.field4444 * var6.field4458 + var5.field4441 * var6.field4444;
        class413.field6261 = var5.field4462 * var6.field4440 + var5.field4444 * var6.field4439 + var5.field4441 * var6.field4452 + var5.field4452;
        float var11 = (float) this.field2861 * class581.field8363 + class413.field6261;
        float var12 = (float) this.field2816 * class581.field8363 + class413.field6261;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field2916 + var11) * (float) this.field2921.field5373;
            var14 = ((float) (-this.field2916) + var12) * (float) this.field2921.field5373;
        } else {
            var14 = (var11 - (float) this.field2916) * (float) this.field2921.field5373;
            var13 = ((float) this.field2916 + var12) * (float) this.field2921.field5373;
        }
        if ((var14 / (float) arg2 >= this.field2921.field5396) || (var13 / (float) arg2 <= this.field2921.field5419)) {
            return;
        }
        class481.field7063 = var5.field4450 * var6.field4448 + var5.field4458 * var6.field4458 + var5.field4434 * var6.field4444;
        class191.field2470 = var5.field4450 * var6.field4440 + var5.field4458 * var6.field4439 + var5.field4434 * var6.field4452 + var5.field4439;
        float var15 = (float) this.field2861 * class481.field7063 + class191.field2470;
        float var16 = (float) this.field2816 * class481.field7063 + class191.field2470;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = (var16 - (float) this.field2916) * (float) this.field2921.field5478;
            var18 = ((float) this.field2916 + var15) * (float) this.field2921.field5478;
        } else {
            var18 = ((float) this.field2916 + var16) * (float) this.field2921.field5478;
            var17 = (var15 - (float) this.field2916) * (float) this.field2921.field5478;
        }
        if ((var17 / (float) arg2 >= this.field2921.field5454) || (this.field2921.field5492 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field2876 != null) {
            class603.field8814 = var5.field4462 * var6.field4451 + var5.field4444 * var6.field4434 + var5.field4441 * var6.field4441;
            class556.field7892 = var5.field4449 * var6.field4449 + var5.field4451 * var6.field4462 + var5.field4448 * var6.field4450;
            class204.field2742 = var5.field4462 * var6.field4449 + var5.field4444 * var6.field4450 + var5.field4441 * var6.field4462;
            class147.field1803 = var5.field4450 * var6.field4449 + var5.field4458 * var6.field4450 + var5.field4434 * var6.field4462;
            class410.field6248 = var5.field4449 * var6.field4451 + var5.field4451 * var6.field4441 + var5.field4448 * var6.field4434;
            class611.field8900 = var5.field4450 * var6.field4451 + var5.field4458 * var6.field4434 + var5.field4434 * var6.field4441;
        }
        if (arg1 != null) {
            int var19 = this.field2902 + this.field2873 >> 1;
            int var20 = this.field2904 + this.field2882 >> 1;
            int var21 = (int) ((float) var20 * class204.field2742 + (float) this.field2861 * class581.field8363 + (float) var19 * class603.field8814 + class413.field6261);
            int var22 = (int) ((float) var20 * class147.field1803 + (float) this.field2861 * class481.field7063 + (float) var19 * class611.field8900 + class191.field2470);
            int var23 = (int) ((float) var20 * class556.field7892 + (float) this.field2861 * class611.field8899 + (float) var19 * class410.field6248 + class287.field3972);
            int var24 = (int) ((float) var20 * class204.field2742 + (float) this.field2816 * class581.field8363 + (float) var19 * class603.field8814 + class413.field6261);
            int var25 = (int) ((float) var20 * class147.field1803 + (float) this.field2816 * class481.field7063 + (float) var19 * class611.field8900 + class191.field2470);
            arg1.field3003 = this.field2921.field5478 * var25 / arg2 + this.field2921.field5456;
            arg1.field3002 = this.field2921.field5478 * var22 / arg2 + this.field2921.field5456;
            arg1.field3001 = this.field2921.field5373 * var21 / arg2 + this.field2921.field5469;
            arg1.field2998 = this.field2921.field5469 + (this.field2921.field5373 * var24 / arg2);
            int var26 = (int) ((float) var20 * class556.field7892 + (float) this.field2816 * class611.field8899 + (float) var19 * class410.field6248 + class287.field3972);
            if (var23 < this.field2921.field5455 && var26 < this.field2921.field5455) {
                arg1.field2999 = (this.field2916 + var21) * this.field2921.field5373 / arg2 + this.field2921.field5469 - arg1.field3001;
                arg1.field3000 = true;
            }
        }
        this.field2921.method2304((float) arg2, -2);
        this.field2921.method2265((byte) 86);
        this.field2921.method2328(110, var6);
        this.method1370(-1);
        this.field2921.method2262(100663296);
        this.method1398(-96);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
    private final void method1366(int arg0) {
        field2896++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = arg0; var10 < this.field2878; var10++) {
            int var11 = this.field2840[var10];
            int var12 = this.field2918[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            int var13 = this.field2838[var10];
            if (var7 < var13) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var13 * var13 + (var12 * var12);
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field2861 = (short) var3;
        this.field2882 = (short) var4;
        this.field2816 = (short) var6;
        this.field2873 = (short) var2;
        this.field2904 = (short) var7;
        this.field2902 = (short) var5;
        this.field2916 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field2832 = true;
    }

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "()I")
    public final int method1367() {
        field2830++;
        return this.field2845;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILgca;ZLgca;IZ)Lba;")
    private final class327 method1368(int arg0, class212 arg1, boolean arg2, class212 arg3, int arg4, boolean arg5) {
        arg1.field2891 = 0;
        arg1.field2897 = arg4;
        arg1.field2827 = this.field2827;
        field2907++;
        arg1.field2889 = this.field2889;
        arg1.field2857 = this.field2857;
        arg1.field2888 = this.field2888;
        arg1.field2845 = this.field2845;
        arg1.field2878 = this.field2878;
        arg1.field2927 = this.field2927;
        arg1.field2855 = this.field2855;
        int var7 = 35 % ((arg0 - 78) / 42);
        arg1.field2899 = this.field2899;
        boolean var8 = class271.method1777(arg4, this.field2899, 112);
        boolean var9 = class131.method804(-103, arg4, this.field2899);
        boolean var10 = class299.method1993(arg4, (byte) 93, this.field2899);
        boolean var11 = var10 | var8 | var9;
        if (var11) {
            if (!var8) {
                arg1.field2840 = this.field2840;
            } else if (arg3.field2840 == null || arg3.field2840.length < this.field2857) {
                arg1.field2840 = arg3.field2840 = new int[this.field2857];
            } else {
                arg1.field2840 = arg3.field2840;
            }
            if (!var9) {
                arg1.field2918 = this.field2918;
            } else if (arg3.field2918 == null || this.field2857 > arg3.field2918.length) {
                arg1.field2918 = arg3.field2918 = new int[this.field2857];
            } else {
                arg1.field2918 = arg3.field2918;
            }
            if (!var10) {
                arg1.field2838 = this.field2838;
            } else if (arg3.field2838 == null || arg3.field2838.length < this.field2857) {
                arg1.field2838 = arg3.field2838 = new int[this.field2857];
            } else {
                arg1.field2838 = arg3.field2838;
            }
            for (int var12 = 0; var12 < this.field2857; var12++) {
                if (var8) {
                    arg1.field2840[var12] = this.field2840[var12];
                }
                if (var9) {
                    arg1.field2918[var12] = this.field2918[var12];
                }
                if (var10) {
                    arg1.field2838[var12] = this.field2838[var12];
                }
            }
        } else {
            arg1.field2840 = this.field2840;
            arg1.field2838 = this.field2838;
            arg1.field2918 = this.field2918;
        }
        if (class430.method2681(arg4, this.field2899, 120)) {
            if (arg2) {
                arg1.field2891 = (byte) (arg1.field2891 | 0x1);
            }
            arg1.field2865 = arg3.field2865;
            arg1.field2865.field5680 = this.field2865.field5680;
            arg1.field2865.field5683 = this.field2865.field5683;
        } else if (class185.method1080(this.field2899, arg4, false)) {
            arg1.field2865 = this.field2865;
        } else {
            arg1.field2865 = null;
        }
        if (class531.method3113(106, arg4, this.field2899)) {
            if (arg3.field2842 == null || this.field2827 > arg3.field2842.length) {
                arg1.field2842 = arg3.field2842 = new short[this.field2827];
            } else {
                arg1.field2842 = arg3.field2842;
            }
            for (int var13 = 0; var13 < this.field2827; var13++) {
                arg1.field2842[var13] = this.field2842[var13];
            }
        } else {
            arg1.field2842 = this.field2842;
        }
        if (class147.method875(this.field2899, (byte) 95, arg4)) {
            if (arg3.field2835 == null || this.field2827 > arg3.field2835.length) {
                arg1.field2835 = arg3.field2835 = new byte[this.field2827];
            } else {
                arg1.field2835 = arg3.field2835;
            }
            for (int var14 = 0; var14 < this.field2827; var14++) {
                arg1.field2835[var14] = this.field2835[var14];
            }
        } else {
            arg1.field2835 = this.field2835;
        }
        if (class251.method1654(this.field2899, arg4, (byte) -85)) {
            arg1.field2822 = arg3.field2822;
            if (arg2) {
                arg1.field2891 = (byte) (arg1.field2891 | 0x2);
            }
            arg1.field2822.field5683 = this.field2822.field5683;
            arg1.field2822.field5680 = this.field2822.field5680;
        } else if (class429.method2676(arg4, this.field2899, -13555)) {
            arg1.field2822 = this.field2822;
        } else {
            arg1.field2822 = null;
        }
        if (class449.method2785(arg4, -21297, this.field2899)) {
            if (arg3.field2836 == null || this.field2855 > arg3.field2836.length) {
                int var15 = this.field2855;
                arg1.field2836 = arg3.field2836 = new short[var15];
                arg1.field2866 = arg3.field2866 = new short[var15];
                arg1.field2893 = arg3.field2893 = new short[var15];
            } else {
                arg1.field2893 = arg3.field2893;
                arg1.field2866 = arg3.field2866;
                arg1.field2836 = arg3.field2836;
            }
            if (this.field2846 == null) {
                for (int var16 = 0; var16 < this.field2855; var16++) {
                    arg1.field2836[var16] = this.field2836[var16];
                    arg1.field2893[var16] = this.field2893[var16];
                    arg1.field2866[var16] = this.field2866[var16];
                }
            } else {
                if (arg3.field2846 == null) {
                    arg3.field2846 = new class650();
                }
                class650 var17 = arg1.field2846 = arg3.field2846;
                if (var17.field9384 == null || var17.field9384.length < this.field2855) {
                    int var18 = this.field2855;
                    var17.field9380 = new short[var18];
                    var17.field9382 = new byte[var18];
                    var17.field9384 = new short[var18];
                    var17.field9378 = new short[var18];
                }
                for (int var19 = 0; var19 < this.field2855; var19++) {
                    arg1.field2836[var19] = this.field2836[var19];
                    arg1.field2893[var19] = this.field2893[var19];
                    arg1.field2866[var19] = this.field2866[var19];
                    var17.field9384[var19] = this.field2846.field9384[var19];
                    var17.field9378[var19] = this.field2846.field9378[var19];
                    var17.field9380[var19] = this.field2846.field9380[var19];
                    var17.field9382[var19] = this.field2846.field9382[var19];
                }
            }
            arg1.field2829 = this.field2829;
        } else {
            arg1.field2829 = this.field2829;
            arg1.field2846 = this.field2846;
            arg1.field2866 = this.field2866;
            arg1.field2836 = this.field2836;
            arg1.field2893 = this.field2893;
        }
        if (class41.method218(arg4, 113, this.field2899)) {
            arg1.field2826 = arg3.field2826;
            if (arg2) {
                arg1.field2891 = (byte) (arg1.field2891 | 0x4);
            }
            arg1.field2826.field5683 = this.field2826.field5683;
            arg1.field2826.field5680 = this.field2826.field5680;
        } else if (class113.method696(0, arg4, this.field2899)) {
            arg1.field2826 = this.field2826;
        } else {
            arg1.field2826 = null;
        }
        if (class55.method410(125, this.field2899, arg4)) {
            if (arg3.field2869 == null || this.field2827 > arg3.field2869.length) {
                int var20 = this.field2855;
                arg1.field2858 = arg3.field2858 = new float[var20];
                arg1.field2869 = arg3.field2869 = new float[var20];
            } else {
                arg1.field2858 = arg3.field2858;
                arg1.field2869 = arg3.field2869;
            }
            for (int var21 = 0; var21 < this.field2855; var21++) {
                arg1.field2869[var21] = this.field2869[var21];
                arg1.field2858[var21] = this.field2858[var21];
            }
        } else {
            arg1.field2869 = this.field2869;
            arg1.field2858 = this.field2858;
        }
        if (class496.method2975(this.field2899, (byte) -55, arg4)) {
            if (arg2) {
                arg1.field2891 = (byte) (arg1.field2891 | 0x8);
            }
            arg1.field2880 = arg3.field2880;
            arg1.field2880.field5680 = this.field2880.field5680;
            arg1.field2880.field5683 = this.field2880.field5683;
        } else if (class656.method3752(70, this.field2899, arg4)) {
            arg1.field2880 = this.field2880;
        } else {
            arg1.field2880 = null;
        }
        if (class585.method3405(1, this.field2899, arg4)) {
            if (arg3.field2879 == null || arg3.field2879.length < this.field2827) {
                int var22 = this.field2827;
                arg1.field2844 = arg3.field2844 = new short[var22];
                arg1.field2879 = arg3.field2879 = new short[var22];
                arg1.field2890 = arg3.field2890 = new short[var22];
            } else {
                arg1.field2844 = arg3.field2844;
                arg1.field2879 = arg3.field2879;
                arg1.field2890 = arg3.field2890;
            }
            for (int var23 = 0; var23 < this.field2827; var23++) {
                arg1.field2879[var23] = this.field2879[var23];
                arg1.field2890[var23] = this.field2890[var23];
                arg1.field2844[var23] = this.field2844[var23];
            }
        } else {
            arg1.field2890 = this.field2890;
            arg1.field2844 = this.field2844;
            arg1.field2879 = this.field2879;
        }
        if (class81.method533((byte) -124, this.field2899, arg4)) {
            if (arg2) {
                arg1.field2891 = (byte) (arg1.field2891 | 0x10);
            }
            arg1.field2901 = arg3.field2901;
            arg1.field2901.field4701 = this.field2901.field4701;
        } else if (class519.method3071(this.field2899, -8926, arg4)) {
            arg1.field2901 = this.field2901;
        } else {
            arg1.field2901 = null;
        }
        if (class600.method3484(arg4, 97, this.field2899)) {
            if (arg3.field2862 == null || this.field2827 > arg3.field2862.length) {
                int var24 = this.field2827;
                arg1.field2862 = arg3.field2862 = new short[var24];
            } else {
                arg1.field2862 = arg3.field2862;
            }
            for (int var25 = 0; var25 < this.field2827; var25++) {
                arg1.field2862[var25] = this.field2862[var25];
            }
        } else {
            arg1.field2862 = this.field2862;
        }
        if (!class300.method1995(this.field2899, arg4, -95)) {
            arg1.field2823 = this.field2823;
        } else if (arg3.field2823 == null || this.field2888 > arg3.field2823.length) {
            int var27 = this.field2888;
            arg1.field2823 = arg3.field2823 = new class334[var27];
            for (int var28 = 0; var28 < this.field2888; var28++) {
                arg1.field2823[var28] = this.field2823[var28].method2169(true);
            }
        } else {
            arg1.field2823 = arg3.field2823;
            for (int var26 = 0; var26 < this.field2888; var26++) {
                arg1.field2823[var26].method2171(this.field2823[var26], (byte) 49);
            }
        }
        arg1.field2843 = this.field2843;
        if (this.field2832) {
            arg1.field2902 = this.field2902;
            arg1.field2873 = this.field2873;
            arg1.field2816 = this.field2816;
            arg1.field2882 = this.field2882;
            arg1.field2832 = true;
            arg1.field2904 = this.field2904;
            arg1.field2916 = this.field2916;
            arg1.field2861 = this.field2861;
        } else {
            arg1.field2832 = false;
        }
        arg1.field2837 = this.field2837;
        arg1.field2911 = this.field2911;
        arg1.field2876 = this.field2876;
        arg1.field2884 = this.field2884;
        arg1.field2864 = this.field2864;
        arg1.field2847 = this.field2847;
        arg1.field2870 = this.field2870;
        arg1.field2903 = this.field2903;
        arg1.field2821 = this.field2821;
        arg1.field2874 = this.field2874;
        return arg1;
    }

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "(III)V")
    public final void method1369(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2878; var4++) {
            if (arg0 != 128) {
                this.field2840[var4] = this.field2840[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field2918[var4] = this.field2918[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field2838[var4] = this.field2838[var4] * arg2 >> 7;
            }
        }
        field2856++;
        this.field2832 = false;
        if (this.field2865 != null) {
            this.field2865.field5680 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)V")
    private final void method1370(int arg0) {
        field2853++;
        if (this.field2889 == 0) {
            return;
        }
        if (~this.field2891 != arg0) {
            this.method1392(true, 8192);
        }
        this.method1392(false, arg0 + 8193);
        if (this.field2901 != null) {
            if (this.field2901.field4701 == null) {
                this.method1390((this.field2891 & 0x10) != 0, 1098552610);
            }
            if (this.field2901.field4701 != null) {
                this.field2921.method2326(-1254361672, this.field2826 != null);
                this.field2921.method2255(this.field2865, (byte) 4, this.field2826, this.field2822, this.field2880);
                int var2 = this.field2837.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field2837[var3];
                    int var5 = this.field2837[var3 + 1];
                    int var6 = this.field2862[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field2921.method2251(false, var6, this.field2826 != null);
                    this.field2921.method2263(var4 * 3, (var5 - var4) * 3, 4, (byte) 119, this.field2901.field4701);
                }
            }
        }
        this.method1359(arg0 + 1);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lq;)V")
    public final void method1371(class364 arg0) {
        field2854++;
        class302 var2 = (class302) arg0;
        if (this.field2864 != null) {
            for (int var3 = 0; var3 < this.field2864.length; var3++) {
                class75 var4 = this.field2864[var3];
                class75 var5 = var4;
                if (var4.field799 != null) {
                    var5 = var4.field799;
                }
                var5.field813 = (int) ((float) this.field2838[var4.field798] * var2.field4462 + (float) this.field2918[var4.field798] * var2.field4444 + (float) this.field2840[var4.field798] * var2.field4441 + var2.field4452);
                var5.field805 = (int) ((float) this.field2838[var4.field798] * var2.field4450 + (float) this.field2918[var4.field798] * var2.field4458 + (float) this.field2840[var4.field798] * var2.field4434 + var2.field4439);
                var5.field801 = (int) ((float) this.field2838[var4.field798] * var2.field4449 + (float) this.field2918[var4.field798] * var2.field4448 + (float) this.field2840[var4.field798] * var2.field4451 + var2.field4440);
                var5.field808 = (int) ((float) this.field2838[var4.field800] * var2.field4462 + (float) this.field2918[var4.field800] * var2.field4444 + (float) this.field2840[var4.field800] * var2.field4441 + var2.field4452);
                var5.field812 = (int) ((float) this.field2838[var4.field800] * var2.field4450 + (float) this.field2918[var4.field800] * var2.field4458 + (float) this.field2840[var4.field800] * var2.field4434 + var2.field4439);
                var5.field802 = (int) ((float) this.field2838[var4.field800] * var2.field4449 + (float) this.field2918[var4.field800] * var2.field4448 + (float) this.field2840[var4.field800] * var2.field4451 + var2.field4440);
                var5.field811 = (int) ((float) this.field2838[var4.field809] * var2.field4462 + (float) this.field2918[var4.field809] * var2.field4444 + (float) this.field2840[var4.field809] * var2.field4441 + var2.field4452);
                var5.field794 = (int) ((float) this.field2838[var4.field809] * var2.field4450 + (float) this.field2918[var4.field809] * var2.field4458 + (float) this.field2840[var4.field809] * var2.field4434 + var2.field4439);
                var5.field795 = (int) ((float) this.field2838[var4.field809] * var2.field4449 + (float) this.field2918[var4.field809] * var2.field4448 + (float) this.field2840[var4.field809] * var2.field4451 + var2.field4440);
            }
        }
        if (this.field2884 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2884.length; var6++) {
            class522 var7 = this.field2884[var6];
            class522 var8 = var7;
            if (var7.field7587 != null) {
                var8 = var7.field7587;
            }
            if (var7.field7590 == null) {
                var7.field7590 = var2.method2020();
            } else {
                var7.field7590.method2004(var2);
            }
            var8.field7593 = (int) ((float) this.field2838[var7.field7591] * var2.field4462 + (float) this.field2918[var7.field7591] * var2.field4444 + (float) this.field2840[var7.field7591] * var2.field4441 + var2.field4452);
            var8.field7595 = (int) ((float) this.field2838[var7.field7591] * var2.field4450 + (float) this.field2918[var7.field7591] * var2.field4458 + (float) this.field2840[var7.field7591] * var2.field4434 + var2.field4439);
            var8.field7594 = (int) ((float) this.field2838[var7.field7591] * var2.field4449 + (float) this.field2918[var7.field7591] * var2.field4448 + (float) this.field2840[var7.field7591] * var2.field4451 + var2.field4440);
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "()V")
    public final void method1372() {
        field2892++;
        if (this.field2855 <= 0 || this.field2889 <= 0) {
            return;
        }
        this.method1392(false, 8192);
        if ((this.field2891 & 0x10) == 0 && this.field2901.field4701 == null) {
            this.method1390(false, 1098552610);
        }
        this.method1359(0);
    }

    @OriginalMember(owner = "client!gca", name = "Q", descriptor = "()Z")
    public final boolean method1373() {
        field2905++;
        if (this.field2903 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field2857; var1++) {
            this.field2840[var1] <<= 0x4;
            this.field2918[var1] <<= 0x4;
            this.field2838[var1] <<= 0x4;
        }
        class590.field8477 = 0;
        class239.field3404 = 0;
        class102.field1225 = 0;
        return true;
    }

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "()I")
    public final int method1374() {
        if (!this.field2832) {
            this.method1366(0);
        }
        field2850++;
        return this.field2904;
    }

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "()I")
    public final int method1375() {
        field2818++;
        return this.field2897;
    }

    @OriginalMember(owner = "client!gca", name = "ia", descriptor = "(I)V")
    public final void method1376(int arg0) {
        this.field2897 = arg0;
        field2877++;
        this.field2895 = true;
        if (this.field2846 != null && (this.field2897 & 0x10000) == 0) {
            this.field2829 = this.field2846.field9382;
            this.field2836 = this.field2846.field9384;
            this.field2893 = this.field2846.field9378;
            this.field2866 = this.field2846.field9380;
            this.field2846 = null;
        }
        this.method1359(0);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)Lui;")
    public static final class195 method1377(int arg0, byte arg1) {
        field2852++;
        class195 var2 = (class195) class368.field5560.method1801(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 123) {
            field2909 = 97;
        }
        byte[] var3 = class620.field8988.method1286(arg0, 0, (byte) -49);
        class195 var4 = new class195();
        if (var3 != null) {
            var4.method1247(20309, arg0, new class194(var3));
        }
        class368.field5560.method1808((long) arg0, var4, (byte) -43);
        return var4;
    }

    @OriginalMember(owner = "client!gca", name = "ua", descriptor = "(IIII)V")
    public final void method1378(int arg0, int arg1, int arg2, int arg3) {
        field2859++;
        if (arg0 == 0) {
            class590.field8477 = 0;
            int var5 = 0;
            class102.field1225 = 0;
            class239.field3404 = 0;
            for (int var6 = 0; var6 < this.field2878; var6++) {
                class239.field3404 += this.field2840[var6];
                class102.field1225 += this.field2918[var6];
                var5++;
                class590.field8477 += this.field2838[var6];
            }
            if (var5 > 0) {
                class590.field8477 = class590.field8477 / var5 + arg3;
                class239.field3404 = class239.field3404 / var5 + arg1;
                class102.field1225 = class102.field1225 / var5 + arg2;
            } else {
                class102.field1225 = arg2;
                class239.field3404 = arg1;
                class590.field8477 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2878; var7++) {
                this.field2840[var7] += arg1;
                this.field2918[var7] += arg2;
                this.field2838[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2878; var8++) {
                this.field2840[var8] -= class239.field3404;
                this.field2918[var8] -= class102.field1225;
                this.field2838[var8] -= class590.field8477;
                if (arg3 != 0) {
                    int var9 = class605.field8859[arg3];
                    int var10 = class605.field8858[arg3];
                    int var11 = this.field2840[var8] * var10 + (this.field2918[var8] * var9 + 16383) >> 14;
                    this.field2918[var8] = this.field2918[var8] * var10 + 16383 - (this.field2840[var8] * var9) >> 14;
                    this.field2840[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class605.field8859[arg1];
                    int var13 = class605.field8858[arg1];
                    int var14 = this.field2918[var8] * var13 + 16383 - (this.field2838[var8] * var12) >> 14;
                    this.field2838[var8] = this.field2918[var8] * var12 + this.field2838[var8] * var13 + 16383 >> 14;
                    this.field2918[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class605.field8859[arg2];
                    int var16 = class605.field8858[arg2];
                    int var17 = this.field2838[var8] * var15 + (this.field2840[var8] * var16) + 16383 >> 14;
                    this.field2838[var8] = this.field2838[var8] * var16 + 16383 - this.field2840[var8] * var15 >> 14;
                    this.field2840[var8] = var17;
                }
                this.field2840[var8] += class239.field3404;
                this.field2918[var8] += class102.field1225;
                this.field2838[var8] += class590.field8477;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2878; var18++) {
                this.field2840[var18] -= class239.field3404;
                this.field2918[var18] -= class102.field1225;
                this.field2838[var18] -= class590.field8477;
                this.field2840[var18] = this.field2840[var18] * arg1 / 128;
                this.field2918[var18] = this.field2918[var18] * arg2 / 128;
                this.field2838[var18] = this.field2838[var18] * arg3 / 128;
                this.field2840[var18] += class239.field3404;
                this.field2918[var18] += class102.field1225;
                this.field2838[var18] += class590.field8477;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2827; var19++) {
                int var23 = (this.field2835[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field2835[var19] = (byte) var23;
            }
            if (this.field2822 != null) {
                this.field2822.field5680 = null;
            }
            if (this.field2876 != null) {
                for (int var20 = 0; var20 < this.field2888; var20++) {
                    class109 var21 = this.field2876[var20];
                    class334 var22 = this.field2823[var20];
                    var22.field4798 = 255 - (this.field2835[var21.field1341] & 0xFF) << 24 | var22.field4798 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field2827; var24++) {
                int var28 = this.field2842[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3B9) >> 7;
                int var31 = arg2 / 4 + var30;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = var28 & 0x7F;
                int var34 = arg3 + var33;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field2842[var24] = (short) class283.method1834(class283.method1834(var32 << 10, var31 << 7), var34);
            }
            if (this.field2822 != null) {
                this.field2822.field5680 = null;
            }
            if (this.field2876 != null) {
                for (int var25 = 0; var25 < this.field2888; var25++) {
                    class109 var26 = this.field2876[var25];
                    class334 var27 = this.field2823[var25];
                    var27.field4798 = class403.field6100[this.field2842[var26.field1341] & 0xFFFF] & 0xFFFFFF | var27.field4798 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field2888; var35++) {
                class334 var36 = this.field2823[var35];
                var36.field4800 += arg2;
                var36.field4799 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field2888; var37++) {
                class334 var38 = this.field2823[var37];
                var38.field4801 = var38.field4801 * arg1 >> 7;
                var38.field4797 = var38.field4797 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field2888; var39++) {
                class334 var40 = this.field2823[var39];
                var40.field4802 = var40.field4802 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "DA", descriptor = "()I")
    public final int method1379() {
        if (!this.field2832) {
            this.method1366(0);
        }
        field2920++;
        return this.field2861;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lq;Lsda;I)V")
    public final void method1380(class364 arg0, class219 arg1, int arg2) {
        field2915++;
        if (this.field2855 == 0) {
            return;
        }
        class302 var4 = this.field2921.field5453;
        class302 var5 = (class302) arg0;
        if (!this.field2832) {
            this.method1366(0);
        }
        class611.field8899 = var4.field4449 * var5.field4448 + var4.field4451 * var5.field4444 + var4.field4448 * var5.field4458;
        class287.field3972 = var4.field4449 * var5.field4440 + var4.field4451 * var5.field4452 + var4.field4448 * var5.field4439 + var4.field4440;
        float var6 = (float) this.field2861 * class611.field8899 + class287.field3972;
        float var7 = (float) this.field2816 * class611.field8899 + class287.field3972;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var8 = (float) this.field2916 + var6;
            var9 = var7 - (float) this.field2916;
        } else {
            var8 = (float) this.field2916 + var7;
            var9 = var6 - (float) this.field2916;
        }
        if ((var9 >= this.field2921.field5475) || ((float) this.field2921.field5455 >= var8)) {
            return;
        }
        class581.field8363 = var4.field4462 * var5.field4448 + var4.field4444 * var5.field4458 + var4.field4441 * var5.field4444;
        class413.field6261 = var4.field4462 * var5.field4440 + var4.field4444 * var5.field4439 + var4.field4441 * var5.field4452 + var4.field4452;
        float var10 = (float) this.field2861 * class581.field8363 + class413.field6261;
        float var11 = (float) this.field2816 * class581.field8363 + class413.field6261;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) this.field2916 + var10) * (float) this.field2921.field5373;
            var13 = (var11 - (float) this.field2916) * (float) this.field2921.field5373;
        } else {
            var13 = (var10 - (float) this.field2916) * (float) this.field2921.field5373;
            var12 = ((float) this.field2916 + var11) * (float) this.field2921.field5373;
        }
        if ((var13 / var8 >= this.field2921.field5396) || (var12 / var8 <= this.field2921.field5419)) {
            return;
        }
        class191.field2470 = var4.field4450 * var5.field4440 + var4.field4458 * var5.field4439 + var4.field4434 * var5.field4452 + var4.field4439;
        class481.field7063 = var4.field4450 * var5.field4448 + var4.field4458 * var5.field4458 + var4.field4434 * var5.field4444;
        float var14 = (float) this.field2861 * class481.field7063 + class191.field2470;
        float var15 = (float) this.field2816 * class481.field7063 + class191.field2470;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = (var15 - (float) this.field2916) * (float) this.field2921.field5478;
            var17 = ((float) this.field2916 + var14) * (float) this.field2921.field5478;
        } else {
            var16 = (var14 - (float) this.field2916) * (float) this.field2921.field5478;
            var17 = ((float) this.field2916 + var15) * (float) this.field2921.field5478;
        }
        if ((var16 / var8 >= this.field2921.field5454) || (var17 / var8 <= this.field2921.field5492)) {
            return;
        }
        if (arg1 != null || this.field2876 != null) {
            class147.field1803 = var4.field4450 * var5.field4449 + var4.field4458 * var5.field4450 + var4.field4434 * var5.field4462;
            class611.field8900 = var4.field4450 * var5.field4451 + var4.field4458 * var5.field4434 + var4.field4434 * var5.field4441;
            class556.field7892 = var4.field4449 * var5.field4449 + var4.field4451 * var5.field4462 + var4.field4448 * var5.field4450;
            class410.field6248 = var4.field4449 * var5.field4451 + var4.field4451 * var5.field4441 + var4.field4448 * var5.field4434;
            class204.field2742 = var4.field4462 * var5.field4449 + var4.field4444 * var5.field4450 + var4.field4441 * var5.field4462;
            class603.field8814 = var4.field4462 * var5.field4451 + var4.field4444 * var5.field4434 + var4.field4441 * var5.field4441;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field2873 + this.field2902 >> 1;
            int var21 = this.field2904 + this.field2882 >> 1;
            int var22 = (int) ((float) var21 * class204.field2742 + (float) this.field2861 * class581.field8363 + (float) var20 * class603.field8814 + class413.field6261);
            int var23 = (int) ((float) var21 * class147.field1803 + (float) this.field2861 * class481.field7063 + (float) var20 * class611.field8900 + class191.field2470);
            int var24 = (int) ((float) var21 * class556.field7892 + (float) this.field2861 * class611.field8899 + (float) var20 * class410.field6248 + class287.field3972);
            if (var24 < this.field2921.field5455) {
                var18 = true;
            } else {
                arg1.field3002 = this.field2921.field5478 * var23 / var24 + this.field2921.field5456;
                arg1.field3001 = this.field2921.field5373 * var22 / var24 + this.field2921.field5469;
            }
            int var25 = (int) ((float) var21 * class204.field2742 + (float) this.field2816 * class581.field8363 + (float) var20 * class603.field8814 + class413.field6261);
            int var26 = (int) ((float) var21 * class147.field1803 + (float) this.field2816 * class481.field7063 + (float) var20 * class611.field8900 + class191.field2470);
            int var27 = (int) ((float) var21 * class556.field7892 + (float) this.field2816 * class611.field8899 + (float) var20 * class410.field6248 + class287.field3972);
            if (var27 < this.field2921.field5455) {
                var18 = true;
            } else {
                arg1.field2998 = this.field2921.field5373 * var25 / var27 + this.field2921.field5469;
                arg1.field3003 = this.field2921.field5456 + (this.field2921.field5478 * var26 / var27);
            }
            if (var18) {
                if (var24 < this.field2921.field5455 && this.field2921.field5455 > var27) {
                    var19 = false;
                } else if (this.field2921.field5455 > var24) {
                    int var28 = (var27 - this.field2921.field5455 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field3001 = this.field2921.field5373 * var29 / this.field2921.field5455 + this.field2921.field5469;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field3002 = this.field2921.field5478 * var30 / this.field2921.field5455 + this.field2921.field5456;
                } else if (this.field2921.field5455 > var27) {
                    int var31 = (var24 - this.field2921.field5455 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field3001 = this.field2921.field5373 * var32 / this.field2921.field5455 + this.field2921.field5469;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field3002 = this.field2921.field5456 + (this.field2921.field5478 * var33 / this.field2921.field5455);
                }
            }
            if (var19) {
                arg1.field3000 = true;
                if (var27 >= var24) {
                    arg1.field2999 = (this.field2916 + var25) * this.field2921.field5373 / var27 + this.field2921.field5469 - arg1.field2998;
                } else {
                    arg1.field2999 = this.field2921.field5469 + ((var22 + this.field2916) * this.field2921.field5373 / var24) - arg1.field3001;
                }
            }
        }
        this.field2921.method2253(false);
        this.field2921.method2328(109, var5);
        this.method1370(-1);
        this.field2921.method2262(100663296);
        this.method1398(65);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method1381(int arg0, int arg1, class364 arg2, boolean arg3) {
        field2912++;
        class302 var5 = (class302) arg2;
        class302 var6 = this.field2921.field5453;
        float var7 = var5.field4440 * var6.field4462 + var5.field4452 * var6.field4441 + var5.field4439 * var6.field4444 + var6.field4452;
        float var8 = var5.field4440 * var6.field4450 + var5.field4452 * var6.field4434 + var5.field4439 * var6.field4458 + var6.field4439;
        class556.field7892 = var5.field4449 * var6.field4449 + var5.field4462 * var6.field4451 + var5.field4450 * var6.field4448;
        class611.field8900 = var5.field4451 * var6.field4450 + var5.field4441 * var6.field4434 + var5.field4434 * var6.field4458;
        class410.field6248 = var5.field4451 * var6.field4449 + var5.field4441 * var6.field4451 + var5.field4434 * var6.field4448;
        class581.field8363 = var5.field4448 * var6.field4462 + var5.field4458 * var6.field4444 + var5.field4444 * var6.field4441;
        float var9 = var5.field4440 * var6.field4449 + var5.field4452 * var6.field4451 + var5.field4439 * var6.field4448 + var6.field4440;
        class147.field1803 = var5.field4449 * var6.field4450 + var5.field4462 * var6.field4434 + var5.field4450 * var6.field4458;
        class611.field8899 = var5.field4448 * var6.field4449 + var5.field4458 * var6.field4448 + var5.field4444 * var6.field4451;
        class603.field8814 = var5.field4451 * var6.field4462 + var5.field4441 * var6.field4441 + var5.field4434 * var6.field4444;
        class204.field2742 = var5.field4449 * var6.field4462 + var5.field4462 * var6.field4441 + var5.field4450 * var6.field4444;
        class481.field7063 = var5.field4448 * var6.field4450 + var5.field4458 * var6.field4458 + var5.field4444 * var6.field4434;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field2921.field5373;
        int var16 = this.field2921.field5478;
        if (!this.field2832) {
            this.method1366(0);
        }
        class283.field3933[0] = this.field2873;
        class263.field3734[0] = this.field2861;
        class90.field1038[0] = this.field2882;
        class283.field3933[1] = this.field2902;
        class263.field3734[1] = this.field2861;
        class90.field1038[1] = this.field2882;
        class283.field3933[2] = this.field2873;
        class263.field3734[2] = this.field2816;
        class283.field3933[3] = this.field2902;
        class90.field1038[2] = this.field2882;
        class263.field3734[3] = this.field2816;
        class90.field1038[3] = this.field2882;
        class283.field3933[4] = this.field2873;
        class263.field3734[4] = this.field2861;
        class283.field3933[5] = this.field2902;
        class90.field1038[4] = this.field2904;
        class263.field3734[5] = this.field2861;
        class90.field1038[5] = this.field2904;
        class283.field3933[6] = this.field2873;
        class263.field3734[6] = this.field2816;
        class90.field1038[6] = this.field2904;
        class283.field3933[7] = this.field2902;
        class263.field3734[7] = this.field2816;
        class90.field1038[7] = this.field2904;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class283.field3933[var17];
            float var39 = (float) class90.field1038[var17];
            float var40 = (float) class263.field3734[var17];
            float var41 = class204.field2742 * var39 + class603.field8814 * var38 + class581.field8363 * var40 + var7;
            float var42 = class147.field1803 * var39 + class611.field8900 * var38 + class481.field7063 * var40 + var8;
            float var43 = class556.field7892 * var39 + class611.field8899 * var40 + class410.field6248 * var38 + var9;
            if ((float) this.field2921.field5455 <= var43) {
                float var44 = (float) var15 * var41 / var43 + (float) this.field2921.field5469;
                if (var12 < var44) {
                    var12 = var44;
                }
                float var45 = (float) var16 * var42 / var43 + (float) this.field2921.field5456;
                if (var44 < var11) {
                    var11 = var44;
                }
                var10 = true;
                if (var13 > var45) {
                    var13 = var45;
                }
                if (var14 < var45) {
                    var14 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && var12 > (float) arg0 && var13 < (float) arg1 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field2921.field5496.length < this.field2855) {
                this.field2921.field5496 = new int[this.field2855];
                this.field2921.field5494 = new int[this.field2855];
            }
            int[] var18 = this.field2921.field5496;
            int[] var19 = this.field2921.field5494;
            for (int var20 = 0; var20 < this.field2878; var20++) {
                float var22 = (float) this.field2840[var20];
                float var23 = (float) this.field2838[var20];
                float var24 = (float) this.field2918[var20];
                float var25 = class147.field1803 * var23 + class611.field8900 * var22 + class481.field7063 * var24 + var8;
                float var26 = class556.field7892 * var23 + class611.field8899 * var24 + class410.field6248 * var22 + var9;
                float var27 = class204.field2742 * var23 + class603.field8814 * var22 + class581.field8363 * var24 + var7;
                if (((float) this.field2921.field5455 <= var26)) {
                    int var32 = (int) ((float) var15 * var27 / var26 + (float) this.field2921.field5469);
                    int var33 = (int) ((float) var16 * var25 / var26 + (float) this.field2921.field5456);
                    int var34 = this.field2821[var20];
                    int var35 = this.field2821[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field2874[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field2821[var20];
                    int var29 = this.field2821[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field2874[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field2874[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field2827; var21++) {
                if (var18[this.field2879[var21]] != -999999 && var18[this.field2890[var21]] != -999999 && var18[this.field2844[var21]] != -999999 && this.method1397(arg0, var18[this.field2890[var21]], var18[this.field2844[var21]], var18[this.field2879[var21]], (byte) 106, var19[this.field2844[var21]], var19[this.field2890[var21]], arg1, var19[this.field2879[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BIZ)Lba;")
    public final class327 method1382(byte arg0, int arg1, boolean arg2) {
        field2868++;
        class212 var4;
        class212 var5;
        if (arg0 == 1) {
            var4 = this.field2921.field5415;
            var5 = this.field2921.field5450;
        } else if (arg0 == 2) {
            var4 = this.field2921.field5405;
            var5 = this.field2921.field5434;
        } else if (arg0 == 3) {
            var5 = this.field2921.field5393;
            var4 = this.field2921.field5440;
        } else if (arg0 == 4) {
            var4 = this.field2921.field5491;
            var5 = this.field2921.field5394;
        } else if (arg0 == 5) {
            var5 = this.field2921.field5376;
            var4 = this.field2921.field5431;
        } else {
            var4 = var5 = new class212(this.field2921);
        }
        return this.method1368(127, var4, arg0 != 0, var5, arg1, arg2);
    }

    @OriginalMember(owner = "client!gca", name = "LA", descriptor = "()I")
    public final int method1383() {
        if (!this.field2832) {
            this.method1366(0);
        }
        field2906++;
        return this.field2882;
    }

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "(I)V")
    public static void method1384(int arg0) {
        int var1 = 31 % ((arg0 + 5) / 62);
        field2926 = null;
    }

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "(I)V")
    public final void method1385(int arg0) {
        field2900++;
        int var2 = class605.field8859[arg0];
        int var3 = class605.field8858[arg0];
        for (int var4 = 0; var4 < this.field2878; var4++) {
            int var5 = this.field2840[var4] * var3 + this.field2838[var4] * var2 >> 14;
            this.field2838[var4] = this.field2838[var4] * var3 - (this.field2840[var4] * var2) >> 14;
            this.field2840[var4] = var5;
        }
        this.field2832 = false;
        if (this.field2865 != null) {
            this.field2865.field5680 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(IIII)V")
    public static final void method1386(int arg0, int arg1, int arg2, int arg3) {
        field2883++;
        String var4 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg3 >> 6) + "," + (arg2 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        int var5 = 122 / ((arg1 + 23) / 41);
        class321.method2096(var4, 1, true, false);
    }

    @OriginalMember(owner = "client!gca", name = "Z", descriptor = "(Lw;)Lw;")
    public final class252 method1387(class252 arg0) {
        field2917++;
        if (this.field2855 == 0) {
            return null;
        }
        if (!this.field2832) {
            this.method1366(0);
        }
        int var2;
        int var3;
        if (this.field2921.field5449 <= 0) {
            var2 = this.field2873 - (this.field2921.field5449 * this.field2861 >> 8) >> this.field2921.field5348;
            var3 = this.field2902 - (this.field2921.field5449 * this.field2816 >> 8) >> this.field2921.field5348;
        } else {
            var2 = this.field2873 - (this.field2921.field5449 * this.field2816 >> 8) >> this.field2921.field5348;
            var3 = this.field2902 - (this.field2921.field5449 * this.field2861 >> 8) >> this.field2921.field5348;
        }
        int var4;
        int var5;
        if (this.field2921.field5482 <= 0) {
            var4 = this.field2882 - (this.field2921.field5482 * this.field2861 >> 8) >> this.field2921.field5348;
            var5 = this.field2904 - (this.field2921.field5482 * this.field2816 >> 8) >> this.field2921.field5348;
        } else {
            var4 = this.field2882 - (this.field2921.field5482 * this.field2816 >> 8) >> this.field2921.field5348;
            var5 = this.field2904 - (this.field2921.field5482 * this.field2861 >> 8) >> this.field2921.field5348;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class591 var8 = (class591) arg0;
        class591 var9;
        if (var8 != null && var8.method3446((byte) -121, var7, var6)) {
            var9 = var8;
            var8.method3443(119);
        } else {
            var9 = new class591(this.field2921, var6, var7);
        }
        var9.method3447(var5, var2, -1029, var3, var4);
        this.method1400((byte) 46, var9);
        return var9;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IC)Z")
    public static final boolean method1388(int arg0, char arg1) {
        field2919++;
        if (!(arg0 >= arg1 || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class461.field6874;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gca", name = "Y", descriptor = "()V")
    public final void method1389() {
        for (int var1 = 0; var1 < this.field2857; var1++) {
            this.field2840[var1] = this.field2840[var1] + 7 >> 4;
            this.field2918[var1] = this.field2918[var1] + 7 >> 4;
            this.field2838[var1] = this.field2838[var1] + 7 >> 4;
        }
        field2839++;
        if (this.field2865 != null) {
            this.field2865.field5680 = null;
        }
        this.field2832 = false;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZI)V")
    private final void method1390(boolean arg0, int arg1) {
        if (this.field2921.field5392.field2622.length < (this.field2889 * 6)) {
            this.field2921.field5392 = new class257((this.field2889 + 100) * 6);
        } else {
            this.field2921.field5392.field2610 = 0;
        }
        field2825++;
        class257 var3 = this.field2921.field5392;
        if (this.field2921.field5468) {
            for (int var5 = 0; var5 < this.field2889; var5++) {
                var3.method1229(this.field2879[var5], 30364);
                var3.method1229(this.field2890[var5], arg1 - 1098522246);
                var3.method1229(this.field2844[var5], 30364);
            }
        } else {
            for (int var4 = 0; var4 < this.field2889; var4++) {
                var3.method1185(this.field2879[var4], 1616065864);
                var3.method1185(this.field2890[var4], arg1 + 517513254);
                var3.method1185(this.field2844[var4], arg1 ^ 0x2129A06A);
            }
        }
        if (var3.field2610 == 0) {
            return;
        }
        if (arg1 != 1098552610) {
            this.field2857 = -115;
        }
        if (arg0) {
            if (this.field2914 == null) {
                this.field2914 = this.field2921.method2270(var3.field2622, var3.field2610, 5123, (byte) 9, true);
            } else {
                this.field2914.method38(var3.field2622, var3.field2610, 5123, true);
            }
            this.field2901.field4701 = this.field2914;
        } else {
            this.field2901.field4701 = this.field2921.method2270(var3.field2622, var3.field2610, 5123, (byte) 9, false);
        }
        if (!arg0) {
            this.field2895 = true;
        }
    }

    @OriginalMember(owner = "client!gca", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final void method1391(int arg0, int arg1, class132 arg2, class132 arg3, int arg4, int arg5, int arg6) {
        field2831++;
        if (!this.field2832) {
            this.method1366(0);
        }
        int var8 = this.field2873 + arg4;
        int var9 = this.field2902 + arg4;
        int var10 = this.field2882 + arg6;
        int var11 = this.field2904 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field1656 <= (var9 + arg2.field1662 >> arg2.field1663) || var10 < 0 || arg2.field1660 <= (arg2.field1662 + var11 >> arg2.field1663)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (var9 + arg3.field1662 >> arg3.field1663) >= arg3.field1656 || var10 < 0 || (var11 + arg3.field1662 >> arg3.field1663) >= arg3.field1660) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field1663;
            int var13 = var9 + arg2.field1662 - 1 >> arg2.field1663;
            int var14 = var10 >> arg2.field1663;
            int var15 = arg2.field1662 + var11 - 1 >> arg2.field1663;
            if (arg2.method259(var12, var14) == arg5 && arg5 == arg2.method259(var13, var14) && arg5 == arg2.method259(var12, var15) && arg2.method259(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field2878; var16++) {
                this.field2918[var16] = this.field2918[var16] + arg2.method249(this.field2840[var16] + arg4, this.field2838[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field2861;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field2878; var31++) {
                int var32 = (this.field2918[var31] << 16) / var30;
                if (arg1 > var32) {
                    this.field2918[var31] -= -((arg1 - var32) * (arg2.method249(this.field2840[var31] + arg4, this.field2838[var31] - -arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var17 = (arg1 & 0xFF) * 4;
            int var18 = ((arg1 & 0xFF78) >> 8) * 4;
            int var19 = (arg1 >> 16 & 0xFF) << 6;
            int var20 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var17 >> 1)) < 0 || (arg2.field1656 << arg2.field1663) <= ((var17 >> 1) + arg4 + arg2.field1662) || (arg6 - (var18 >> 1)) < 0 || ((var18 >> 1) + arg6 + arg2.field1662) >= (arg2.field1660 << arg2.field1663)) {
                return;
            }
            this.method2125(-1, arg2, var18, arg6, arg5, var19, var20, arg4, var17);
        } else if (arg0 == 4) {
            int var21 = this.field2816 - this.field2861;
            for (int var22 = 0; var22 < this.field2878; var22++) {
                this.field2918[var22] -= (arg5 - var21) - arg3.method249(this.field2840[var22] + arg4, this.field2838[var22] - -arg6);
            }
        } else if (arg0 == 5) {
            int var23 = this.field2816 - this.field2861;
            for (int var24 = 0; var24 < this.field2878; var24++) {
                int var25 = this.field2840[var24] + arg4;
                int var26 = this.field2838[var24] + arg6;
                int var27 = arg2.method249(var25, var26);
                int var28 = arg3.method249(var25, var26);
                int var29 = var27 - var28 - arg1;
                this.field2918[var24] = ((this.field2918[var24] << 8) / var23 * var29 >> 8) - (arg5 - var27);
            }
        }
        this.field2832 = false;
        if (this.field2865 != null) {
            this.field2865.field5680 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(ZI)V")
    private final void method1392(boolean arg0, int arg1) {
        field2908++;
        boolean var3 = this.field2822 != null && this.field2822.field5680 == null;
        boolean var4 = this.field2826 != null && this.field2826.field5680 == null;
        boolean var5 = this.field2865 != null && this.field2865.field5680 == null;
        boolean var6 = this.field2880 != null && this.field2880.field5680 == null;
        if (arg0) {
            var4 &= (this.field2891 & 0x4) != 0;
            var6 &= (this.field2891 & 0x8) != 0;
            var3 &= (this.field2891 & 0x2) != 0;
            var5 &= (this.field2891 & 0x1) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != 8192) {
            this.field2865 = null;
        }
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if ((this.field2855 * var7) > this.field2921.field5392.field2622.length) {
            this.field2921.field5392 = new class257((this.field2855 + 100) * var7);
        } else {
            this.field2921.field5392.field2610 = 0;
        }
        class257 var12 = this.field2921.field5392;
        if (var5) {
            if (this.field2921.field5468) {
                for (int var13 = 0; var13 < this.field2878; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field2840[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field2918[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field2838[var13]);
                    int var17 = this.field2821[var13];
                    int var18 = this.field2821[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field2874[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field2610 = var7 * var20;
                        var12.method1223(true, var14);
                        var12.method1223(true, var15);
                        var12.method1223(true, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field2878; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field2840[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field2918[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field2838[var21]);
                    int var25 = this.field2821[var21];
                    int var26 = this.field2821[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field2874[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field2610 = var7 * var28;
                        var12.method1207((byte) 57, var22);
                        var12.method1207((byte) -82, var23);
                        var12.method1207((byte) -118, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field2826 == null) {
                short[] var29;
                short[] var30;
                byte[] var31;
                short[] var32;
                if (this.field2846 == null) {
                    var29 = this.field2836;
                    var30 = this.field2866;
                    var31 = this.field2829;
                    var32 = this.field2893;
                } else {
                    var31 = this.field2846.field9382;
                    var30 = this.field2846.field9380;
                    var32 = this.field2846.field9378;
                    var29 = this.field2846.field9384;
                }
                float var33 = this.field2921.field5387[0];
                float var34 = this.field2921.field5387[1];
                float var35 = this.field2921.field5387[2];
                float var36 = this.field2921.field5386;
                float var37 = this.field2921.field5487 * 768.0F / (float) this.field2845;
                float var38 = this.field2921.field5465 * 768.0F / (float) this.field2845;
                for (int var39 = 0; var39 < this.field2827; var39++) {
                    int var40 = this.method1362(this.field2842[var39], this.field2927, arg1 ^ 0xFFFFDFB2, this.field2862[var39], this.field2835[var39]);
                    float var41 = (float) (var40 >>> 24) * this.field2921.field5380;
                    short var42 = this.field2879[var39];
                    float var43 = (float) (var40 >> 8 & 0xFF) * this.field2921.field5444;
                    float var44 = (float) ((var40 & 0xFF8064) >> 16) * this.field2921.field5420;
                    short var45 = (short) var31[var42];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var30[var42] * var35 + (float) var29[var42] * var33 + (float) var32[var42] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var30[var42] * var35 + (float) var29[var42] * var33 + (float) var32[var42] * var34) / (float) (var45 * 256);
                    }
                    float var47 = var36 + (var46 < 0.0F ? var38 : var37) * var46;
                    int var48 = (int) (var41 * var47);
                    int var49 = (int) (var44 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var50 = (int) (var43 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field2610 = var7 * var42 + var9;
                    var12.method1205((byte) -69, var48);
                    var12.method1205((byte) -69, var49);
                    var12.method1205((byte) -69, var50);
                    var12.method1205((byte) -69, 255 - (this.field2835[var39] & 0xFF));
                    short var51 = this.field2890[var39];
                    short var52 = (short) var31[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var30[var51] * var35 + (float) var29[var51] * var33 + (float) var32[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var30[var51] * var35 + (float) var29[var51] * var33 + (float) var32[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = var36 + (var53 < 0.0F ? var38 : var37) * var53;
                    int var55 = (int) (var41 * var54);
                    int var56 = (int) (var44 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var57 = (int) (var43 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field2610 = var9 + (var7 * var51);
                    var12.method1205((byte) -69, var55);
                    var12.method1205((byte) -69, var56);
                    var12.method1205((byte) -69, var57);
                    var12.method1205((byte) -69, 255 - (this.field2835[var39] & 0xFF));
                    short var58 = this.field2844[var39];
                    short var59 = (short) var31[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var30[var58] * var35 + (float) var29[var58] * var33 + (float) var32[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var30[var58] * var35 + (float) var29[var58] * var33 + (float) var32[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = ((var60 < 0.0F) ? var38 : var37) * var60 + var36;
                    int var62 = (int) (var41 * var61);
                    int var63 = (int) (var44 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var43 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.field2610 = var9 + (var7 * var58);
                    var12.method1205((byte) -69, var62);
                    var12.method1205((byte) -69, var63);
                    var12.method1205((byte) -69, var64);
                    var12.method1205((byte) -69, 255 - (this.field2835[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field2827; var65++) {
                    int var66 = this.method1362(this.field2842[var65], this.field2927, -124, this.field2862[var65], this.field2835[var65]);
                    var12.field2610 = var9 + (this.field2879[var65] * var7);
                    var12.method1223(true, var66);
                    var12.field2610 = this.field2890[var65] * var7 + var9;
                    var12.method1223(true, var66);
                    var12.field2610 = this.field2844[var65] * var7 + var9;
                    var12.method1223(true, var66);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field2846 == null) {
                var67 = this.field2829;
                var68 = this.field2836;
                var69 = this.field2866;
                var70 = this.field2893;
            } else {
                var70 = this.field2846.field9378;
                var69 = this.field2846.field9380;
                var67 = this.field2846.field9382;
                var68 = this.field2846.field9384;
            }
            float var71 = 3.0F / (float) this.field2845;
            var12.field2610 = var10;
            float var72 = 3.0F / (float) (this.field2845 / 2 + this.field2845);
            if (this.field2921.field5468) {
                for (int var73 = 0; var73 < this.field2855; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1716((float) var68[var73] * var72, -94);
                        var12.method1716((float) var70[var73] * var72, -105);
                        var12.method1716((float) var69[var73] * var72, -104);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1716((float) var68[var73] * var75, -100);
                        var12.method1716((float) var70[var73] * var75, arg1 ^ 0xFFFFDF90);
                        var12.method1716((float) var69[var73] * var75, -104);
                    }
                    var12.field2610 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field2855; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1715((float) var68[var76] * var72, (byte) -6);
                        var12.method1715((float) var70[var76] * var72, (byte) -6);
                        var12.method1715((float) var69[var76] * var72, (byte) -6);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1715((float) var68[var76] * var78, (byte) -6);
                        var12.method1715((float) var70[var76] * var78, (byte) -6);
                        var12.method1715((float) var69[var76] * var78, (byte) -6);
                    }
                    var12.field2610 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field2610 = var11;
            if (this.field2921.field5468) {
                for (int var79 = 0; var79 < this.field2855; var79++) {
                    var12.method1716(this.field2869[var79], -103);
                    var12.method1716(this.field2858[var79], -107);
                    var12.field2610 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field2855; var80++) {
                    var12.method1715(this.field2869[var80], (byte) -6);
                    var12.method1715(this.field2858[var80], (byte) -6);
                    var12.field2610 += var7 - 8;
                }
            }
        }
        var12.field2610 = this.field2855 * var7;
        class632 var81;
        if (arg0) {
            if (this.field2910 == null) {
                this.field2910 = this.field2921.method2317(var7, true, true, var12.field2610, var12.field2622);
            } else {
                this.field2910.method447(var12.field2610, var12.field2622, var7, (byte) 125);
            }
            var81 = this.field2910;
            this.field2891 = 0;
        } else {
            var81 = this.field2921.method2317(var7, true, false, var12.field2610, var12.field2622);
            this.field2895 = true;
        }
        if (var5) {
            this.field2865.field5680 = var81;
            this.field2865.field5683 = var8;
        }
        if (var6) {
            this.field2880.field5683 = var11;
            this.field2880.field5680 = var81;
        }
        if (var3) {
            this.field2822.field5680 = var81;
            this.field2822.field5683 = var9;
        }
        if (var4) {
            this.field2826.field5683 = var10;
            this.field2826.field5680 = var81;
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "()Z")
    public final boolean method1393() {
        field2851++;
        if (this.field2862 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field2862.length; var1++) {
            if (this.field2862[var1] != -1 && !this.field2921.field8852.method436(this.field2862[var1], -5686)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gca", name = "va", descriptor = "(I)V")
    public final void method1394(int arg0) {
        this.field2845 = (short) arg0;
        field2925++;
        if (this.field2822 != null) {
            this.field2822.field5680 = null;
        }
        if (this.field2826 != null) {
            this.field2826.field5680 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IJIFILor;FIII)S")
    private final short method1395(int arg0, long arg1, int arg2, float arg3, int arg4, class557 arg5, float arg6, int arg7, int arg8, int arg9) {
        if (arg7 > -66) {
            return 51;
        }
        field2817++;
        int var12 = this.field2821[arg9];
        int var13 = this.field2821[arg9 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field2874[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class46.field493[var15] == arg1) {
                return (short) (var16 - 1);
            }
        }
        this.field2874[var14] = (short) (this.field2855 + 1);
        class46.field493[var14] = arg1;
        this.field2836[this.field2855] = (short) arg0;
        this.field2893[this.field2855] = (short) arg2;
        this.field2866[this.field2855] = (short) arg8;
        this.field2829[this.field2855] = (byte) arg4;
        this.field2869[this.field2855] = arg3;
        this.field2858[this.field2855] = arg6;
        return (short) (this.field2855++);
    }

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "(I)V")
    public final void method1396(int arg0) {
        field2867++;
        int var2 = class605.field8859[arg0];
        int var3 = class605.field8858[arg0];
        for (int var4 = 0; var4 < this.field2878; var4++) {
            int var5 = this.field2918[var4] * var2 + this.field2840[var4] * var3 >> 14;
            this.field2918[var4] = this.field2918[var4] * var3 - this.field2840[var4] * var2 >> 14;
            this.field2840[var4] = var5;
        }
        if (this.field2865 != null) {
            this.field2865.field5680 = null;
        }
        this.field2832 = false;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIBIIII)Z")
    private final boolean method1397(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field2820++;
        if (arg8 > arg7 && arg7 < arg6 && arg5 > arg7) {
            return false;
        }
        if (arg4 <= 56) {
            this.method1370(75);
        }
        if (arg8 < arg7 && arg6 < arg7 && arg7 > arg5) {
            return false;
        } else if (arg3 > arg0 && arg0 < arg1 && arg0 < arg2) {
            return false;
        } else {
            return arg0 <= arg3 || arg0 <= arg1 || arg2 >= arg0;
        }
    }

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "(I)V")
    private final void method1398(int arg0) {
        field2875++;
        if (this.field2876 != null) {
            class302 var2 = this.field2921.field5347;
            float var3 = this.field2921.method2267();
            float var4 = this.field2921.method2256();
            this.field2921.method2275(-31202);
            this.field2921.method323(false);
            this.field2921.method2326(-1254361672, false);
            this.field2921.method2255(this.field2921.field5378, (byte) 4, null, null, this.field2921.field5448);
            for (int var5 = 0; var5 < this.field2888; var5++) {
                class109 var6 = this.field2876[var5];
                class334 var7 = this.field2823[var5];
                if (!var6.field1340 || !this.field2921.method359()) {
                    float var8 = (float) (this.field2840[var6.field1346] + this.field2840[var6.field1342] + this.field2840[var6.field1337]) * 0.3333333F;
                    float var9 = (float) (this.field2918[var6.field1342] + this.field2918[var6.field1337] + this.field2918[var6.field1346]) * 0.3333333F;
                    float var10 = (float) (this.field2838[var6.field1337] - (-this.field2838[var6.field1346] - this.field2838[var6.field1342])) * 0.3333333F;
                    float var11 = class204.field2742 * var10 + class603.field8814 * var8 + class581.field8363 * var9 + class413.field6261;
                    float var12 = class147.field1803 * var10 + class611.field8900 * var8 + class481.field7063 * var9 + class191.field2470;
                    float var13 = class556.field7892 * var10 + class611.field8899 * var9 + class410.field6248 * var8 + class287.field3972;
                    var2.method2008((float) var7.field4799 + var11, (float) var7.field4800 + -var12, var7.field4802, (byte) -117, var6.field1338 * var7.field4801 >> 7, -var13, var6.field1335 * var7.field4797 >> 7);
                    this.field2921.method2329(var2, 59);
                    this.field2921.method302(var4, var3 - (float) var6.field1345 * 1.5F);
                    int var14 = var7.field4798;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field2921.method2286(var6.field1344, (byte) -29);
                    this.field2921.method2327(var6.field1343, (byte) -127);
                    this.field2921.method2281(7, 4, 0, -34845);
                }
            }
            this.field2921.method302(var4, var3);
            this.field2921.method323(true);
            this.field2921.method2262(100663296);
        }
        int var15 = 120 % ((arg0 + 27) / 49);
    }

    @OriginalMember(owner = "client!gca", name = "ka", descriptor = "(SS)V")
    public final void method1399(short arg0, short arg1) {
        field2841++;
        class462 var3 = this.field2921.field8852;
        for (int var4 = 0; var4 < this.field2827; var4++) {
            if (this.field2862[var4] == arg0) {
                this.field2862[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class614 var7 = var3.method438(66, arg0 & 0xFFFF);
            var6 = var7.field8939;
            var5 = var7.field8926;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class614 var10 = var3.method438(84, arg1 & 0xFFFF);
            var9 = var10.field8939;
            var8 = var10.field8926;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field2876 != null) {
            for (int var11 = 0; var11 < this.field2888; var11++) {
                class109 var12 = this.field2876[var11];
                class334 var13 = this.field2823[var11];
                var13.field4798 = var13.field4798 & 0xFF000000 | class403.field6100[this.field2842[var12.field1341] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field2822 != null) {
            this.field2822.field5680 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLwca;)V")
    private final void method1400(byte arg0, class591 arg1) {
        if (arg0 != 46) {
            field2926 = null;
        }
        if (this.field2921.field5496.length < this.field2855) {
            this.field2921.field5496 = new int[this.field2855];
            this.field2921.field5494 = new int[this.field2855];
        }
        field2819++;
        int[] var3 = this.field2921.field5496;
        int[] var4 = this.field2921.field5494;
        for (int var5 = 0; var5 < this.field2878; var5++) {
            int var16 = (this.field2840[var5] - (this.field2918[var5] * this.field2921.field5449 >> 8) >> this.field2921.field5348) - arg1.field8490;
            int var17 = (this.field2838[var5] - (this.field2918[var5] * this.field2921.field5482 >> 8) >> this.field2921.field5348) - arg1.field8484;
            int var18 = this.field2821[var5];
            int var19 = this.field2821[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field2874[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field2889; var6++) {
            if (this.field2835 == null || this.field2835[var6] <= 128) {
                short var7 = this.field2879[var6];
                short var8 = this.field2890[var6];
                short var9 = this.field2844[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method3445(var10, var14, (byte) 88, var13, var15, var11, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIII)V")
    public final void method1401(int arg0, int arg1, int arg2, int arg3) {
        field2894++;
        for (int var5 = 0; var5 < this.field2827; var5++) {
            int var9 = this.field2842[var5] & 0xFFFF;
            int var10 = (var9 & 0xFEC1) >> 10;
            int var11 = (var9 & 0x3A4) >> 7;
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field2842[var5] = (short) class283.method1834(class283.method1834(var10 << 10, var11 << 7), var12);
        }
        if (this.field2876 != null) {
            for (int var6 = 0; var6 < this.field2888; var6++) {
                class109 var7 = this.field2876[var6];
                class334 var8 = this.field2823[var6];
                var8.field4798 = var8.field4798 & 0xFF000000 | class403.field6100[this.field2842[var7.field1341] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field2822 != null) {
            this.field2822.field5680 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "M", descriptor = "()I")
    public final int method1402() {
        if (!this.field2832) {
            this.method1366(0);
        }
        field2872++;
        return this.field2902;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lad;)V")
    public class212(class362 arg0) {
        this.field2921 = arg0;
        this.field2865 = new class371(null, 5126, 3, 0);
        this.field2880 = new class371(null, 5126, 2, 0);
        this.field2826 = new class371(null, 5126, 3, 0);
        this.field2822 = new class371(null, 5121, 4, 0);
        this.field2901 = new class326();
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lad;Lor;IIII)V")
    public class212(class362 arg0, class557 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2897 = arg2;
        this.field2921 = arg0;
        this.field2899 = arg5;
        if (class185.method1080(arg5, arg2, false)) {
            this.field2865 = new class371(null, 5126, 3, 0);
        }
        if (class656.method3752(99, arg5, arg2)) {
            this.field2880 = new class371(null, 5126, 2, 0);
        }
        if (class113.method696(0, arg2, arg5)) {
            this.field2826 = new class371(null, 5126, 3, 0);
        }
        if (class429.method2676(arg2, arg5, -13555)) {
            this.field2822 = new class371(null, 5121, 4, 0);
        }
        if (class519.method3071(arg5, -8926, arg2)) {
            this.field2901 = new class326();
        }
        class462 var7 = arg0.field8852;
        int[] var8 = new int[arg1.field7951];
        this.field2821 = new int[arg1.field7942 + 1];
        for (int var9 = 0; var9 < arg1.field7951; var9++) {
            if ((arg1.field7926 == null || arg1.field7926[var9] != 2) && (arg1.field7950 == null || arg1.field7950[var9] == -1 || !var7.method438(90, arg1.field7950[var9] & 0xFFFF).field8948)) {
                var8[this.field2827++] = var9;
                this.field2821[arg1.field7904[var9]]++;
                this.field2821[arg1.field7927[var9]]++;
                this.field2821[arg1.field7920[var9]]++;
            }
        }
        this.field2889 = this.field2827;
        long[] var10 = new long[this.field2827];
        boolean var11 = (this.field2897 & 0x100) != 0;
        label501: for (int var12 = 0; var12 < this.field2827; var12++) {
            int var180 = var8[var12];
            class614 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field7930 != null) {
                for (int var186 = 0; var186 < arg1.field7930.length; var186++) {
                    class392 var187 = arg1.field7930[var186];
                    if (var187.field6003 == var180) {
                        class195 var188 = method1377(var187.field5998, (byte) 124);
                        if (var188.field2643) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field2889--;
                            continue label501;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field7950 != null) {
                var189 = arg1.field7950[var180];
                if (var189 != -1) {
                    var181 = var7.method438(80, var189 & 0xFFFF);
                    var184 = var181.field8935;
                    var185 = var181.field8925;
                }
            }
            boolean var190 = arg1.field7902 != null && arg1.field7902[var180] != 0 || var181 != null && !var181.field8938 | var181.field8943;
            if ((var11 || var190) && arg1.field7937 != null) {
                var182 += arg1.field7937[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = ((var189 & 0xFFFF) << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class623.method3574(var10, 128, var8);
        this.field2838 = arg1.field7911;
        this.field2857 = arg1.field7899;
        this.field2918 = arg1.field7919;
        this.field2847 = arg1.field7913;
        this.field2840 = arg1.field7945;
        this.field2878 = arg1.field7942;
        this.field2884 = arg1.field7901;
        class568[] var13 = new class568[this.field2878];
        this.field2864 = arg1.field7907;
        if (arg1.field7930 != null) {
            this.field2888 = arg1.field7930.length;
            this.field2876 = new class109[this.field2888];
            this.field2823 = new class334[this.field2888];
            for (int var14 = 0; var14 < this.field2888; var14++) {
                class392 var15 = arg1.field7930[var14];
                class195 var16 = method1377(var15.field5998, (byte) 125);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field2827; var18++) {
                    if (var8[var18] == var15.field6003) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class403.field6100[arg1.field7923[var15.field6003] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7902 == null ? 0 : arg1.field7902[var15.field6003]) << 24;
                this.field2876[var14] = new class109(var17, arg1.field7904[var15.field6003], arg1.field7927[var15.field6003], arg1.field7920[var15.field6003], var16.field2650, var16.field2641, var16.field2638, var16.field2642, var16.field2651, var16.field2643, var16.field2646, var15.field6004);
                this.field2823[var14] = new class334(var20);
            }
        }
        int var21 = this.field2827 * 3;
        this.field2829 = new byte[var21];
        this.field2874 = new short[var21];
        if (arg1.field7947 != null) {
            this.field2911 = new short[this.field2827];
        }
        this.field2858 = new float[var21];
        this.field2866 = new short[var21];
        this.field2862 = new short[this.field2827];
        this.field2890 = new short[this.field2827];
        this.field2844 = new short[this.field2827];
        this.field2869 = new float[var21];
        this.field2927 = (short) arg3;
        this.field2842 = new short[this.field2827];
        this.field2879 = new short[this.field2827];
        this.field2845 = (short) arg4;
        this.field2836 = new short[var21];
        class46.field493 = new long[var21];
        this.field2835 = new byte[this.field2827];
        this.field2893 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7942; var23++) {
            int var179 = this.field2821[var23];
            this.field2821[var23] = var22;
            var22 += var179;
            var13[var23] = new class568();
        }
        this.field2821[arg1.field7942] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field7896 != null) {
            int var28 = arg1.field7898;
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
            var27 = new float[var28][];
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field2827; var36++) {
                int var43 = var8[var36];
                if (arg1.field7896[var43] != -1) {
                    int var44 = arg1.field7896[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field7904[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field7927[var43];
                        } else {
                            var46 = arg1.field7920[var43];
                        }
                        int var47 = arg1.field7945[var46];
                        int var48 = arg1.field7919[var46];
                        int var49 = arg1.field7911[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var25 = new int[var28];
            var26 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field7941[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field7908[var37];
                        if (var39 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 > 0) {
                            var41 = 1.0F;
                            var40 = (float) var39 / 1024.0F;
                        } else {
                            var40 = 1.0F;
                            var41 = (float) (-var39) / 1024.0F;
                        }
                        var42 = 64.0F / (float) arg1.field7910[var37];
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field7917[var37];
                        var41 = 64.0F / (float) arg1.field7908[var37];
                        var42 = 64.0F / (float) arg1.field7910[var37];
                    } else {
                        var41 = (float) arg1.field7908[var37] / 1024.0F;
                        var42 = (float) arg1.field7910[var37] / 1024.0F;
                        var40 = (float) arg1.field7917[var37] / 1024.0F;
                    }
                    var27[var37] = class122.method752(var42, 56, var40, var41, arg1.field7944[var37], arg1.field7906[var37], arg1.field7936[var37], class643.method3659(255, arg1.field7916[var37]));
                }
            }
        }
        class498[] var50 = new class498[arg1.field7951];
        for (int var51 = 0; var51 < arg1.field7951; var51++) {
            short var158 = arg1.field7904[var51];
            short var159 = arg1.field7927[var51];
            short var160 = arg1.field7920[var51];
            int var161 = this.field2840[var159] - this.field2840[var158];
            int var162 = this.field2918[var159] - this.field2918[var158];
            int var163 = this.field2838[var159] - this.field2838[var158];
            int var164 = this.field2840[var160] - this.field2840[var158];
            int var165 = this.field2918[var160] - this.field2918[var158];
            int var166 = this.field2838[var160] - this.field2838[var158];
            int var167 = var162 * var166 - var163 * var165;
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var167 >>= 0x1;
                var169 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + (var168 * var168) + (var169 * var169)));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field7926 == null ? 0 : arg1.field7926[var51];
            if (var174 == 0) {
                class568 var176 = var13[var158];
                var176.field8152 += var173;
                var176.field8153 += var172;
                var176.field8151 += var171;
                var176.field8154++;
                class568 var177 = var13[var159];
                var177.field8152 += var173;
                var177.field8151 += var171;
                var177.field8153 += var172;
                var177.field8154++;
                class568 var178 = var13[var160];
                var178.field8151 += var171;
                var178.field8152 += var173;
                var178.field8154++;
                var178.field8153 += var172;
            } else if (var174 == 1) {
                class498 var175 = var50[var51] = new class498();
                var175.field7251 = var173;
                var175.field7258 = var171;
                var175.field7256 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field2827; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field7923[var68] & 0xFFFF;
            short var70;
            if (arg1.field7950 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field7950[var68];
            }
            int var71;
            if (arg1.field7896 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field7896[var68];
            }
            int var72;
            if (arg1.field7902 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field7902[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var73 = 0.0F;
                    var77 = 0.0F;
                    var78 = 0.0F;
                    var76 = 1.0F;
                    var74 = 1.0F;
                    var79 = 1;
                    var75 = 1.0F;
                    var80 = 2;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field7941[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field7904[var68];
                        short var84 = arg1.field7927[var68];
                        short var85 = arg1.field7920[var68];
                        short var86 = arg1.field7944[var71];
                        short var87 = arg1.field7936[var71];
                        short var88 = arg1.field7906[var71];
                        float var89 = (float) arg1.field7945[var86];
                        float var90 = (float) arg1.field7919[var86];
                        float var91 = (float) arg1.field7911[var86];
                        float var92 = (float) arg1.field7945[var87] - var89;
                        float var93 = (float) arg1.field7919[var87] - var90;
                        float var94 = (float) arg1.field7911[var87] - var91;
                        float var95 = (float) arg1.field7945[var88] - var89;
                        float var96 = (float) arg1.field7919[var88] - var90;
                        float var97 = (float) arg1.field7911[var88] - var91;
                        float var98 = (float) arg1.field7945[var83] - var89;
                        float var99 = (float) arg1.field7919[var83] - var90;
                        float var100 = (float) arg1.field7911[var83] - var91;
                        float var101 = (float) arg1.field7945[var84] - var89;
                        float var102 = (float) arg1.field7919[var84] - var90;
                        float var103 = (float) arg1.field7911[var84] - var91;
                        float var104 = (float) arg1.field7945[var85] - var89;
                        float var105 = (float) arg1.field7919[var85] - var90;
                        float var106 = (float) arg1.field7911[var85] - var91;
                        float var107 = var93 * var97 - (var94 * var96);
                        float var108 = var94 * var95 - (var92 * var97);
                        float var109 = var92 * var96 - var93 * var95;
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - (var95 * var109);
                        float var112 = var95 * var108 - var96 * var107;
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        float var114 = var94 * var107 - (var92 * var109);
                        float var115 = var92 * var108 - var93 * var107;
                        float var116 = var93 * var109 - var94 * var108;
                        float var117 = 1.0F / (var97 * var115 + var95 * var116 + var96 * var114);
                        var78 = (var106 * var115 + var104 * var116 + var105 * var114) * var117;
                        var76 = (var103 * var115 + var101 * var116 + var102 * var114) * var117;
                        var74 = (var100 * var115 + var98 * var116 + var99 * var114) * var117;
                    } else {
                        short var118 = arg1.field7904[var68];
                        short var119 = arg1.field7927[var68];
                        short var120 = arg1.field7920[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field7949[var71];
                        float var126 = (float) arg1.field7914[var71] / 256.0F;
                        if (var82 == 1) {
                            float var144 = (float) arg1.field7917[var71] / 1024.0F;
                            class102.method637(var144, arg1.field7919[var118], var122, var123, arg1.field7945[var118], var126, var124, arg1.field7911[var118], var125, var121, (byte) 117);
                            var74 = class145.field1780;
                            var73 = class11.field97;
                            class102.method637(var144, arg1.field7919[var119], var122, var123, arg1.field7945[var119], var126, var124, arg1.field7911[var119], var125, var121, (byte) 117);
                            var76 = class145.field1780;
                            var75 = class11.field97;
                            class102.method637(var144, arg1.field7919[var120], var122, var123, arg1.field7945[var120], var126, var124, arg1.field7911[var120], var125, var121, (byte) 117);
                            var77 = class11.field97;
                            var78 = class145.field1780;
                            float var145 = var144 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if ((var145 < var77 - var73)) {
                                    var80 = 1;
                                    var77 -= var144;
                                } else if (var145 < var73 - var77) {
                                    var77 += var144;
                                    var80 = 2;
                                }
                                if ((var75 - var73 > var145)) {
                                    var75 -= var144;
                                    var79 = 1;
                                } else if (var145 < var73 - var75) {
                                    var75 += var144;
                                    var79 = 2;
                                }
                            } else {
                                if ((var76 - var74 > var145)) {
                                    var76 -= var144;
                                    var79 = 1;
                                } else if (var74 - var76 > var145) {
                                    var79 = 2;
                                    var76 += var144;
                                }
                                if ((var145 < var78 - var74)) {
                                    var78 -= var144;
                                    var80 = 1;
                                } else if (var145 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var144;
                                }
                            }
                        } else if (var82 == 2) {
                            float var127 = (float) arg1.field7932[var71] / 256.0F;
                            float var128 = (float) arg1.field7915[var71] / 256.0F;
                            int var129 = arg1.field7945[var119] - arg1.field7945[var118];
                            int var130 = arg1.field7919[var119] - arg1.field7919[var118];
                            int var131 = arg1.field7911[var119] - arg1.field7911[var118];
                            int var132 = arg1.field7945[var120] - arg1.field7945[var118];
                            int var133 = arg1.field7919[var120] - arg1.field7919[var118];
                            int var134 = arg1.field7911[var120] - arg1.field7911[var118];
                            int var135 = var130 * var134 - (var131 * var133);
                            int var136 = var131 * var132 - (var129 * var134);
                            int var137 = var129 * var133 - var130 * var132;
                            float var138 = 64.0F / (float) arg1.field7908[var71];
                            float var139 = 64.0F / (float) arg1.field7910[var71];
                            float var140 = 64.0F / (float) arg1.field7917[var71];
                            float var141 = (var124[2] * (float) var137 + var124[0] * (float) var135 + var124[1] * (float) var136) / var138;
                            float var142 = (var124[5] * (float) var137 + var124[3] * (float) var135 + var124[4] * (float) var136) / var139;
                            float var143 = (var124[8] * (float) var137 + var124[6] * (float) var135 + var124[7] * (float) var136) / var140;
                            var81 = class564.method3267(var141, var142, var143, (byte) 56);
                            class442.method2754(var81, var124, var125, var123, arg1.field7945[var118], -21794, var128, var122, arg1.field7919[var118], var121, var127, var126, arg1.field7911[var118]);
                            var74 = class67.field737;
                            var73 = class11.field94;
                            class442.method2754(var81, var124, var125, var123, arg1.field7945[var119], -21794, var128, var122, arg1.field7919[var119], var121, var127, var126, arg1.field7911[var119]);
                            var76 = class67.field737;
                            var75 = class11.field94;
                            class442.method2754(var81, var124, var125, var123, arg1.field7945[var120], -21794, var128, var122, arg1.field7919[var120], var121, var127, var126, arg1.field7911[var120]);
                            var77 = class11.field94;
                            var78 = class67.field737;
                        } else if (var82 == 3) {
                            class122.method753(var123, var122, var126, arg1.field7919[var118], var125, var124, arg1.field7911[var118], var121, arg1.field7945[var118], (byte) 45);
                            var73 = class13.field113;
                            var74 = class633.field9112;
                            class122.method753(var123, var122, var126, arg1.field7919[var119], var125, var124, arg1.field7911[var119], var121, arg1.field7945[var119], (byte) 45);
                            var76 = class633.field9112;
                            var75 = class13.field113;
                            class122.method753(var123, var122, var126, arg1.field7919[var120], var125, var124, arg1.field7911[var120], var121, arg1.field7945[var120], (byte) 45);
                            var77 = class13.field113;
                            var78 = class633.field9112;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                            } else {
                                if (var78 - var74 > 0.5F) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                                if (var76 - var74 > 0.5F) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field7926 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field7926[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var152 = arg1.field7904[var68];
                short var153 = arg1.field7927[var68];
                short var154 = arg1.field7920[var68];
                class568 var155 = var13[var152];
                this.field2879[var52] = this.method1395(var155.field8151, var150, var155.field8153, var73, var155.field8154, arg1, var74, -116, var155.field8152, var152);
                class568 var156 = var13[var153];
                this.field2890[var52] = this.method1395(var156.field8151, (long) var79 + var150, var156.field8153, var75, var156.field8154, arg1, var76, -96, var156.field8152, var153);
                class568 var157 = var13[var154];
                this.field2844[var52] = this.method1395(var157.field8151, (long) var80 + var150, var157.field8153, var77, var157.field8154, arg1, var78, -80, var157.field8152, var154);
            } else if (var146 == 1) {
                class498 var147 = var50[var68];
                long var148 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) ((var147.field7251 + 256 << 22) + (var147.field7256 + 256 << 12) + (var71 << 2) + (var147.field7258 > 0 ? 1024 : 2048));
                this.field2879[var52] = this.method1395(var147.field7258, var148, var147.field7256, var73, 0, arg1, var74, -116, var147.field7251, arg1.field7904[var68]);
                this.field2890[var52] = this.method1395(var147.field7258, (long) var79 + var148, var147.field7256, var75, 0, arg1, var76, -118, var147.field7251, arg1.field7927[var68]);
                this.field2844[var52] = this.method1395(var147.field7258, (long) var80 + var148, var147.field7256, var77, 0, arg1, var78, -120, var147.field7251, arg1.field7920[var68]);
            }
            if (arg1.field7950 == null) {
                this.field2862[var52] = -1;
            } else {
                this.field2862[var52] = arg1.field7950[var68];
            }
            if (arg1.field7902 != null) {
                this.field2835[var52] = arg1.field7902[var68];
            }
            if (arg1.field7947 != null) {
                this.field2911[var52] = arg1.field7947[var68];
            }
            this.field2842[var52] = arg1.field7923[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field2889; var55++) {
            short var67 = this.field2862[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field2837 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field2889; var58++) {
            short var66 = this.field2862[var58];
            if (var56 != var66) {
                var56 = var66;
                this.field2837[var57++] = var58;
            }
        }
        this.field2837[var57] = this.field2889;
        class46.field493 = null;
        this.field2836 = class87.method557(this.field2836, this.field2855, true);
        this.field2893 = class87.method557(this.field2893, this.field2855, true);
        this.field2866 = class87.method557(this.field2866, this.field2855, true);
        this.field2829 = class325.method2113(this.field2829, true, this.field2855);
        this.field2869 = class61.method439(this.field2869, this.field2855, 0);
        this.field2858 = class61.method439(this.field2858, this.field2855, 0);
        if (arg1.field7929 != null && class485.method2926(-76, this.field2899, arg2)) {
            this.field2903 = arg1.method3226(false, -26966);
        }
        if (arg1.field7930 != null && class381.method2447(arg2, (byte) 94, this.field2899)) {
            this.field2843 = arg1.method3217(-119);
        }
        if (arg1.field7940 != null && class329.method2143(arg2, (byte) -37, this.field2899)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field2827; var61++) {
                int var65 = arg1.field7940[var8[var61]];
                if (var65 >= 0) {
                    if (var59 < var65) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field2870 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field2870[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field2827; var63++) {
                int var64 = arg1.field7940[var8[var63]];
                if (var64 >= 0) {
                    this.field2870[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
