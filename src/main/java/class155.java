import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class155 extends class37 {

    @OriginalMember(owner = "client!cda", name = "C", descriptor = "I")
    private int field2231 = -1;

    @OriginalMember(owner = "client!cda", name = "D", descriptor = "Ltea;")
    private class214 field2232;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!cda", name = "u", descriptor = "[[B")
    private byte[][] field2223;

    @OriginalMember(owner = "client!cda", name = "y", descriptor = "[[B")
    private byte[][] field2227;

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "F")
    private float field2217;

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "F")
    private float field2219;

    @OriginalMember(owner = "client!cda", name = "v", descriptor = "F")
    private float field2224;

    @OriginalMember(owner = "client!cda", name = "w", descriptor = "F")
    private float field2225;

    @OriginalMember(owner = "client!cda", name = "x", descriptor = "F")
    private float field2226;

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "F")
    private float field2228;

    @OriginalMember(owner = "client!cda", name = "A", descriptor = "F")
    private float field2229;

    @OriginalMember(owner = "client!cda", name = "B", descriptor = "F")
    private float field2230;

    @OriginalMember(owner = "client!cda", name = "E", descriptor = "F")
    private float field2233;

    @OriginalMember(owner = "client!cda", name = "F", descriptor = "F")
    private float field2234;

    @OriginalMember(owner = "client!cda", name = "H", descriptor = "F")
    private float field2236;

    @OriginalMember(owner = "client!cda", name = "I", descriptor = "F")
    private float field2237;

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "[[Lhu;")
    private class116[][] field2220;

    @OriginalMember(owner = "client!cda", name = "t", descriptor = "[[Lrba;")
    private class396[][] field2222;

    @OriginalMember(owner = "client!cda", name = "G", descriptor = "[[Lrs;")
    private class604[][] field2235;

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "[[Ltn;")
    private class76[][] field2221;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(II)I")
    private static final int method1079(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class651 var9 = this.field2232.method1422(Thread.currentThread());
        class579 var10 = var9.field9165;
        var10.field8160 = 0;
        var10.field8169 = false;
        this.field2232.method194();
        if (this.field2221 != null) {
            this.method1080(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field9158, var9.field9134);
        } else {
            if (this.field2222 != null) {
                this.method1082(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field9158, var9.field9134);
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "v", descriptor = "(IILha;)Lha;")
    public final class54 method441(int arg0, int arg1, class54 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(II)V")
    public final void method439(int arg0, int arg1) {
        class651 var3 = this.field2232.method1422(Thread.currentThread());
        var3.field9165.field8160 = 0;
        if (this.field2221 != null) {
            this.method1084(arg0, arg1, var3.field9118, var3, var3.field9165, var3.field9158, var3.field9134, var3.field9154, var3.field9140);
        } else {
            if (this.field2222 != null) {
                this.method1083(arg0, arg1, var3.field9165, var3.field9158, var3.field9134, var3.field9154, var3.field9140);
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIIII[[ZLgn;Loo;[I[I)V")
    private final void method1080(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class651 arg8, class579 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field9113;
        this.field2232.method178(false);
        arg9.field8158 = false;
        arg9.field8165 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field2221[var18][var19] != null) {
                        class76 var20 = this.field2221[var18][var19];
                        if (var20.field1312 != -1 && (var20.field1314 & 2) == 0 && var20.field1317 == 0) {
                            int var21 = this.field2232.method1424(var20.field1312);
                            arg9.method3295(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class477.method2799(var20.field1318, var21, -20439), class477.method2799(var20.field1319, var21, -20439), class477.method2799(var20.field1313, var21, -20439));
                            arg9.method3295(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class477.method2799(var20.field1320, var21, -20439), class477.method2799(var20.field1313, var21, -20439), class477.method2799(var20.field1319, var21, -20439));
                        } else if (var20.field1317 == 0) {
                            arg9.method3291(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field1318, var20.field1319, var20.field1313);
                            arg9.method3291(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field1320, var20.field1313, var20.field1319);
                        } else {
                            int var22 = var20.field1317;
                            arg9.method3291(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class89.method766((byte) -123, var20.field1318 & -16777216, var22), class89.method766((byte) -101, var20.field1319 & -16777216, var22), class89.method766((byte) -126, var20.field1313 & -16777216, var22));
                            arg9.method3291(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class89.method766((byte) -106, var20.field1320 & -16777216, var22), class89.method766((byte) -113, var20.field1313 & -16777216, var22), class89.method766((byte) -124, var20.field1319 & -16777216, var22));
                        }
                    } else if (this.field2220[var18][var19] != null) {
                        class116 var23 = this.field2220[var18][var19];
                        for (int var24 = 0; var24 < var23.field1774; ++var24) {
                            arg10[var24] = var23.field1773[var24] * var14 / super.field629 + var16;
                            arg11[var24] = var17 - var23.field1766[var24] * var14 / super.field629;
                        }
                        for (int var25 = 0; var25 < var23.field1775; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field1768 != null && var23.field1768[var25] != 0 && (var23.field1769 == null || var23.field1769 != null && var23.field1769[var25] == -1)) {
                                int var35 = var23.field1768[var25];
                                arg9.method3291(var32, var33, var34, var29, var30, var31, 100, 100, 100, class89.method766((byte) -121, -16777216 - (var23.field1770[var26] & -16777216), var35), class89.method766((byte) -112, -16777216 - (var23.field1770[var27] & -16777216), var35), class89.method766((byte) -115, -16777216 - (var23.field1770[var28] & -16777216), var35));
                            } else if (var23.field1769 != null && var23.field1769[var25] != -1) {
                                int var36 = this.field2232.method1424(var23.field1769[var25]);
                                arg9.method3295(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                            } else {
                                arg9.method3291(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field1770[var26], var23.field1770[var27], var23.field1770[var28]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field8158 = true;
        this.field2232.method178(var15);
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)Z")
    private final boolean method1081(int arg0) {
        if ((this.field2218 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III[[ZZI)V")
    public final void method443(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class140 var7 = this.field2232.field3006;
        this.field2231 = arg5;
        this.field2225 = var7.field2054;
        this.field2226 = var7.field2057;
        this.field2228 = var7.field2059;
        this.field2233 = var7.field2048;
        this.field2230 = var7.field2078;
        this.field2236 = var7.field2052;
        this.field2219 = var7.field2068;
        this.field2234 = var7.field2070;
        this.field2224 = var7.field2050;
        this.field2217 = var7.field2073;
        this.field2229 = var7.field2060;
        this.field2237 = var7.field2079;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field631 && var11 >= 0 && var11 < super.field632) {
                        this.method439(var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "BA", descriptor = "()V")
    public final void method436() {
        this.field2223 = null;
        this.field2227 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lrc;[I)V")
    public final void method429(class498 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(IIIIIII[[ZLgn;Loo;[I[I)V")
    private final void method1082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class651 arg8, class579 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field9113;
        this.field2232.method178(false);
        arg9.field8158 = false;
        arg9.field8165 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field2222[var18][var19] != null) {
                        class396 var20 = this.field2222[var18][var19];
                        if (var20.field5869 != -1 && (var20.field5871 & 2) == 0 && var20.field5873 == -1) {
                            int var21 = this.field2232.method1424(var20.field5869);
                            arg9.method3295(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class477.method2799(var20.field5874 & 65535, var21, -20439), class477.method2799(var20.field5872 & 65535, var21, -20439), class477.method2799(var20.field5870 & 65535, var21, -20439));
                            arg9.method3295(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class477.method2799(var20.field5875 & 65535, var21, -20439), class477.method2799(var20.field5870 & 65535, var21, -20439), class477.method2799(var20.field5872 & 65535, var21, -20439));
                        } else if (var20.field5873 == -1) {
                            arg9.method3295(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field5874 & 65535, var20.field5872 & 65535, var20.field5870 & 65535);
                            arg9.method3295(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field5875 & 65535, var20.field5870 & 65535, var20.field5872 & 65535);
                        } else {
                            int var22 = var20.field5873;
                            arg9.method3295(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var22, var22, var22);
                            arg9.method3295(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (this.field2235[var18][var19] != null) {
                        class604 var23 = this.field2235[var18][var19];
                        for (int var24 = 0; var24 < var23.field8534; ++var24) {
                            arg10[var24] = var23.field8532[var24] * var14 / super.field629 + var16;
                            arg11[var24] = var17 - var23.field8538[var24] * var14 / super.field629;
                        }
                        for (int var25 = 0; var25 < var23.field8537; ++var25) {
                            short var26 = var23.field8531[var25];
                            short var27 = var23.field8528[var25];
                            short var28 = var23.field8539[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field8535 != null && var23.field8535[var25] != -1) {
                                int var35 = var23.field8535[var25];
                                arg9.method3295(var32, var33, var34, var29, var30, var31, 100, 100, 100, class477.method2799(var23.field8529[var26], var35, -20439), class477.method2799(var23.field8529[var27], var35, -20439), class477.method2799(var23.field8529[var28], var35, -20439));
                            } else if (var23.field8533 != null && var23.field8533[var25] != -1) {
                                int var36 = this.field2232.method1424(var23.field8533[var25]);
                                arg9.method3295(var32, var33, var34, var29, var30, var31, 100, 100, 100, class477.method2799(var23.field8529[var26], var36, -20439), class477.method2799(var23.field8529[var27], var36, -20439), class477.method2799(var23.field8529[var28], var36, -20439));
                            } else {
                                int var37 = var23.field8536[var25];
                                arg9.method3295(var32, var33, var34, var29, var30, var31, 100, 100, 100, class477.method2799(var23.field8529[var26], var37, -20439), class477.method2799(var23.field8529[var27], var37, -20439), class477.method2799(var23.field8529[var28], var37, -20439));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field8158 = true;
        this.field2232.method178(var15);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IILoo;[I[I[I[I)V")
    private final void method1083(int arg0, int arg1, class579 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        class396 var8 = this.field2222[arg0][arg1];
        if (var8 != null) {
            if ((var8.field5871 & 2) == 0) {
                int var9 = super.field629 * arg0;
                int var10 = super.field629 + var9;
                int var11 = super.field629 * arg1;
                int var12 = super.field629 + var11;
                float var15;
                float var16;
                float var17;
                float var18;
                float var21;
                int var22;
                float var23;
                int var24;
                float var25;
                int var26;
                float var27;
                int var28;
                int var30;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                if ((var8.field5871 & 1) != 0) {
                    int var13 = super.field624[arg0][arg1];
                    float var14 = (float) var13 * this.field2217;
                    if (this.field2231 == -1) {
                        var15 = (float) var11 * this.field2229 + (float) var9 * this.field2224 + var14 + this.field2237;
                        if (var15 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var16 = (float) var11 * this.field2229 + (float) var10 * this.field2224 + var14 + this.field2237;
                        if (var16 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var17 = (float) var12 * this.field2229 + (float) var10 * this.field2224 + var14 + this.field2237;
                        if (var17 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var18 = (float) var12 * this.field2229 + (float) var9 * this.field2224 + var14 + this.field2237;
                        if (var18 <= (float) this.field2232.field3012) {
                            return;
                        }
                    } else {
                        var15 = (float) var11 * this.field2229 + (float) var9 * this.field2224 + var14 + this.field2237;
                        var16 = (float) var11 * this.field2229 + (float) var10 * this.field2224 + var14 + this.field2237;
                        var17 = (float) var12 * this.field2229 + (float) var10 * this.field2224 + var14 + this.field2237;
                        var18 = (float) var12 * this.field2229 + (float) var9 * this.field2224 + var14 + this.field2237;
                    }
                    float var19 = (float) var13 * this.field2226;
                    float var20 = (float) var13 * this.field2236;
                    if (this.field2231 == -1) {
                        var21 = (float) var11 * this.field2228 + (float) var9 * this.field2225 + var19 + this.field2233;
                        var22 = (int) ((float) this.field2232.field3009 * var21 / var15) + arg2.field8164;
                        var23 = (float) var11 * this.field2219 + (float) var9 * this.field2230 + var20 + this.field2234;
                        var24 = (int) ((float) this.field2232.field2994 * var23 / var15) + arg2.field8154;
                        var25 = (float) var11 * this.field2228 + (float) var10 * this.field2225 + var19 + this.field2233;
                        var26 = (int) ((float) this.field2232.field3009 * var25 / var16) + arg2.field8164;
                        var27 = (float) var11 * this.field2219 + (float) var10 * this.field2230 + var20 + this.field2234;
                        var28 = (int) ((float) this.field2232.field2994 * var27 / var16) + arg2.field8154;
                        float var29 = (float) var12 * this.field2228 + (float) var10 * this.field2225 + var19 + this.field2233;
                        var30 = (int) ((float) this.field2232.field3009 * var29 / var17) + arg2.field8164;
                        float var31 = (float) var12 * this.field2219 + (float) var10 * this.field2230 + var20 + this.field2234;
                        var32 = (int) ((float) this.field2232.field2994 * var31 / var17) + arg2.field8154;
                        var33 = (float) var12 * this.field2228 + (float) var9 * this.field2225 + var19 + this.field2233;
                        var34 = (int) ((float) this.field2232.field3009 * var33 / var18) + arg2.field8164;
                        var35 = (float) var12 * this.field2219 + (float) var9 * this.field2230 + var20 + this.field2234;
                        var36 = (int) ((float) this.field2232.field2994 * var35 / var18) + arg2.field8154;
                    } else {
                        var21 = (float) var11 * this.field2228 + (float) var9 * this.field2225 + var19 + this.field2233;
                        var22 = (int) ((float) this.field2232.field3009 * var21 / (float) this.field2231) + arg2.field8164;
                        var23 = (float) var11 * this.field2219 + (float) var9 * this.field2230 + var20 + this.field2234;
                        var24 = (int) ((float) this.field2232.field2994 * var23 / (float) this.field2231) + arg2.field8154;
                        var25 = (float) var11 * this.field2228 + (float) var10 * this.field2225 + var19 + this.field2233;
                        var26 = (int) ((float) this.field2232.field3009 * var25 / (float) this.field2231) + arg2.field8164;
                        var27 = (float) var11 * this.field2219 + (float) var10 * this.field2230 + var20 + this.field2234;
                        var28 = (int) ((float) this.field2232.field2994 * var27 / (float) this.field2231) + arg2.field8154;
                        float var37 = (float) var12 * this.field2228 + (float) var10 * this.field2225 + var19 + this.field2233;
                        var30 = (int) ((float) this.field2232.field3009 * var37 / (float) this.field2231) + arg2.field8164;
                        float var38 = (float) var12 * this.field2219 + (float) var10 * this.field2230 + var20 + this.field2234;
                        var32 = (int) ((float) this.field2232.field2994 * var38 / (float) this.field2231) + arg2.field8154;
                        var33 = (float) var12 * this.field2228 + (float) var9 * this.field2225 + var19 + this.field2233;
                        var34 = (int) ((float) this.field2232.field3009 * var33 / (float) this.field2231) + arg2.field8164;
                        var35 = (float) var12 * this.field2219 + (float) var9 * this.field2230 + var20 + this.field2234;
                        var36 = (int) ((float) this.field2232.field2994 * var35 / (float) this.field2231) + arg2.field8154;
                    }
                } else {
                    int var39 = super.field624[arg0][arg1];
                    int var40 = super.field624[arg0 + 1][arg1];
                    int var41 = super.field624[arg0 + 1][arg1 + 1];
                    int var42 = super.field624[arg0][arg1 + 1];
                    if (this.field2231 == -1) {
                        var15 = (float) var11 * this.field2229 + (float) var9 * this.field2224 + (float) var39 * this.field2217 + this.field2237;
                        if (var15 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var16 = (float) var11 * this.field2229 + (float) var10 * this.field2224 + (float) var40 * this.field2217 + this.field2237;
                        if (var16 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var17 = (float) var12 * this.field2229 + (float) var10 * this.field2224 + (float) var41 * this.field2217 + this.field2237;
                        if (var17 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var18 = (float) var12 * this.field2229 + (float) var9 * this.field2224 + (float) var42 * this.field2217 + this.field2237;
                        if (var18 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var21 = (float) var11 * this.field2228 + (float) var9 * this.field2225 + (float) var39 * this.field2226 + this.field2233;
                        var22 = (int) ((float) this.field2232.field3009 * var21 / var15) + arg2.field8164;
                        var23 = (float) var11 * this.field2219 + (float) var9 * this.field2230 + (float) var39 * this.field2236 + this.field2234;
                        var24 = (int) ((float) this.field2232.field2994 * var23 / var15) + arg2.field8154;
                        var25 = (float) var11 * this.field2228 + (float) var10 * this.field2225 + (float) var40 * this.field2226 + this.field2233;
                        var26 = (int) ((float) this.field2232.field3009 * var25 / var16) + arg2.field8164;
                        var27 = (float) var11 * this.field2219 + (float) var10 * this.field2230 + (float) var40 * this.field2236 + this.field2234;
                        var28 = (int) ((float) this.field2232.field2994 * var27 / var16) + arg2.field8154;
                        float var43 = (float) var12 * this.field2228 + (float) var10 * this.field2225 + (float) var41 * this.field2226 + this.field2233;
                        var30 = (int) ((float) this.field2232.field3009 * var43 / var17) + arg2.field8164;
                        float var44 = (float) var12 * this.field2219 + (float) var10 * this.field2230 + (float) var41 * this.field2236 + this.field2234;
                        var32 = (int) ((float) this.field2232.field2994 * var44 / var17) + arg2.field8154;
                        var33 = (float) var12 * this.field2228 + (float) var9 * this.field2225 + (float) var42 * this.field2226 + this.field2233;
                        var34 = (int) ((float) this.field2232.field3009 * var33 / var18) + arg2.field8164;
                        var35 = (float) var12 * this.field2219 + (float) var9 * this.field2230 + (float) var42 * this.field2236 + this.field2234;
                        var36 = (int) ((float) this.field2232.field2994 * var35 / var18) + arg2.field8154;
                    } else {
                        var15 = (float) var11 * this.field2229 + (float) var9 * this.field2224 + (float) var39 * this.field2217 + this.field2237;
                        var16 = (float) var11 * this.field2229 + (float) var10 * this.field2224 + (float) var40 * this.field2217 + this.field2237;
                        var17 = (float) var12 * this.field2229 + (float) var10 * this.field2224 + (float) var41 * this.field2217 + this.field2237;
                        var18 = (float) var12 * this.field2229 + (float) var9 * this.field2224 + (float) var42 * this.field2217 + this.field2237;
                        var21 = (float) var11 * this.field2228 + (float) var9 * this.field2225 + (float) var39 * this.field2226 + this.field2233;
                        var22 = (int) ((float) this.field2232.field3009 * var21 / (float) this.field2231) + arg2.field8164;
                        var23 = (float) var11 * this.field2219 + (float) var9 * this.field2230 + (float) var39 * this.field2236 + this.field2234;
                        var24 = (int) ((float) this.field2232.field2994 * var23 / (float) this.field2231) + arg2.field8154;
                        var25 = (float) var11 * this.field2228 + (float) var10 * this.field2225 + (float) var40 * this.field2226 + this.field2233;
                        var26 = (int) ((float) this.field2232.field3009 * var25 / (float) this.field2231) + arg2.field8164;
                        var27 = (float) var11 * this.field2219 + (float) var10 * this.field2230 + (float) var40 * this.field2236 + this.field2234;
                        var28 = (int) ((float) this.field2232.field2994 * var27 / (float) this.field2231) + arg2.field8154;
                        float var45 = (float) var12 * this.field2228 + (float) var10 * this.field2225 + (float) var41 * this.field2226 + this.field2233;
                        var30 = (int) ((float) this.field2232.field3009 * var45 / (float) this.field2231) + arg2.field8164;
                        float var46 = (float) var12 * this.field2219 + (float) var10 * this.field2230 + (float) var41 * this.field2236 + this.field2234;
                        var32 = (int) ((float) this.field2232.field2994 * var46 / (float) this.field2231) + arg2.field8154;
                        var33 = (float) var12 * this.field2228 + (float) var9 * this.field2225 + (float) var42 * this.field2226 + this.field2233;
                        var34 = (int) ((float) this.field2232.field3009 * var33 / (float) this.field2231) + arg2.field8164;
                        var35 = (float) var12 * this.field2219 + (float) var9 * this.field2230 + (float) var42 * this.field2236 + this.field2234;
                        var36 = (int) ((float) this.field2232.field2994 * var35 / (float) this.field2231) + arg2.field8154;
                    }
                }
                if (this.field2231 == -1) {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field8169 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field8159 || var34 > arg2.field8159 || var26 > arg2.field8159;
                        if (var8.field5869 >= 0) {
                            if (this.method1081(this.field2232.field2384.method1386(var8.field5869, -6514).field2300)) {
                                arg2.field8160 = 100;
                            }
                            arg2.method3293(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field5874 & 65535, var8.field5872 & 65535, var8.field5870 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field5869);
                            arg2.field8160 = 0;
                        } else {
                            arg2.method3295(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field5874 & 65535, var8.field5872 & 65535, var8.field5870 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field8169 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field8159 || var26 > arg2.field8159 || var34 > arg2.field8159;
                        if (var8.field5869 >= 0) {
                            if (this.method1081(this.field2232.field2384.method1386(var8.field5869, -6514).field2300)) {
                                arg2.field8160 = 100;
                            }
                            arg2.method3293(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field5875 & 65535, var8.field5870 & 65535, var8.field5872 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field5869);
                            arg2.field8160 = 0;
                            return;
                        }
                        arg2.method3295(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field5875 & 65535, var8.field5870 & 65535, var8.field5872 & 65535);
                        return;
                    }
                } else {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field8169 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field8159 || var34 > arg2.field8159 || var26 > arg2.field8159;
                        if (var8.field5869 >= 0) {
                            if (this.method1081(this.field2232.field2384.method1386(var8.field5869, -6514).field2300)) {
                                arg2.field8160 = 100;
                            }
                            arg2.method3293(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field5874 & 65535, var8.field5872 & 65535, var8.field5870 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field2231, this.field2231, this.field2231, var8.field5869);
                            arg2.field8160 = 0;
                        } else {
                            arg2.method3295(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field5874 & 65535, var8.field5872 & 65535, var8.field5870 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field8169 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field8159 || var26 > arg2.field8159 || var34 > arg2.field8159;
                        if (var8.field5869 >= 0) {
                            if (this.method1081(this.field2232.field2384.method1386(var8.field5869, -6514).field2300)) {
                                arg2.field8160 = 100;
                            }
                            arg2.method3293(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field5875 & 65535, var8.field5870 & 65535, var8.field5872 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field2231, this.field2231, this.field2231, var8.field5869);
                            arg2.field8160 = 0;
                            return;
                        }
                        arg2.method3295(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field5875 & 65535, var8.field5870 & 65535, var8.field5872 & 65535);
                    }
                }
            }
        } else {
            class604 var47 = this.field2235[arg0][arg1];
            if (var47 != null) {
                if (this.field2231 == -1) {
                    for (int var48 = 0; var48 < var47.field8534; ++var48) {
                        int var49 = (arg0 << super.field625) + var47.field8532[var48];
                        short var50 = var47.field8530[var48];
                        int var51 = (arg1 << super.field625) + var47.field8538[var48];
                        float var52 = (float) var51 * this.field2229 + (float) var49 * this.field2224 + (float) var50 * this.field2217 + this.field2237;
                        if (var52 <= (float) this.field2232.field3012) {
                            return;
                        }
                        float var53 = (float) var51 * this.field2228 + (float) var49 * this.field2225 + (float) var50 * this.field2226 + this.field2233;
                        float var54 = (float) var51 * this.field2219 + (float) var49 * this.field2230 + (float) var50 * this.field2236 + this.field2234;
                        arg3[var48] = (int) ((float) this.field2232.field3009 * var53 / var52) + arg2.field8164;
                        arg4[var48] = (int) ((float) this.field2232.field2994 * var54 / var52) + arg2.field8154;
                        arg5[var48] = (int) var52;
                    }
                } else {
                    for (int var55 = 0; var55 < var47.field8534; ++var55) {
                        int var107 = (arg0 << super.field625) + var47.field8532[var55];
                        short var108 = var47.field8530[var55];
                        int var109 = (arg1 << super.field625) + var47.field8538[var55];
                        float var110 = (float) var109 * this.field2229 + (float) var107 * this.field2224 + (float) var108 * this.field2217 + this.field2237;
                        float var111 = (float) var109 * this.field2228 + (float) var107 * this.field2225 + (float) var108 * this.field2226 + this.field2233;
                        float var112 = (float) var109 * this.field2219 + (float) var107 * this.field2230 + (float) var108 * this.field2236 + this.field2234;
                        arg3[var55] = (int) ((float) this.field2232.field3009 * var111 / (float) this.field2231) + arg2.field8164;
                        arg4[var55] = (int) ((float) this.field2232.field2994 * var112 / (float) this.field2231) + arg2.field8154;
                        arg5[var55] = (int) var110;
                    }
                }
                if (var47.field8533 != null) {
                    int var56 = super.field624[arg0][arg1];
                    int var57 = super.field624[arg0 + 1][arg1];
                    int var58 = super.field624[arg0][arg1 + 1];
                    int var59 = super.field629 * arg0;
                    int var60 = super.field629 + var59;
                    int var61 = super.field629 * arg1;
                    int var62 = super.field629 + var61;
                    float var63 = (float) var61 * this.field2228 + (float) var56 * this.field2226 + (float) var59 * this.field2225 + this.field2233;
                    float var64 = (float) var61 * this.field2219 + (float) var56 * this.field2236 + (float) var59 * this.field2230 + this.field2234;
                    float var65 = (float) var61 * this.field2229 + (float) var56 * this.field2217 + (float) var59 * this.field2224 + this.field2237;
                    float var66 = (float) var61 * this.field2228 + (float) var57 * this.field2226 + (float) var60 * this.field2225 + this.field2233;
                    float var67 = (float) var61 * this.field2219 + (float) var57 * this.field2236 + (float) var60 * this.field2230 + this.field2234;
                    float var68 = (float) var61 * this.field2229 + (float) var57 * this.field2217 + (float) var60 * this.field2224 + this.field2237;
                    float var69 = (float) var62 * this.field2228 + (float) var58 * this.field2226 + (float) var59 * this.field2225 + this.field2233;
                    float var70 = (float) var62 * this.field2219 + (float) var58 * this.field2236 + (float) var59 * this.field2230 + this.field2234;
                    float var71 = (float) var62 * this.field2229 + (float) var58 * this.field2217 + (float) var59 * this.field2224 + this.field2237;
                    if (this.field2231 == -1) {
                        for (int var72 = 0; var72 < var47.field8537; ++var72) {
                            short var73 = var47.field8531[var72];
                            short var74 = var47.field8528[var72];
                            short var75 = var47.field8539[var72];
                            int var76 = arg3[var73];
                            int var77 = arg3[var74];
                            int var78 = arg3[var75];
                            int var79 = arg4[var73];
                            int var80 = arg4[var74];
                            int var81 = arg4[var75];
                            if ((var76 - var77) * (var81 - var80) - (var78 - var77) * (var79 - var80) > 0) {
                                arg2.field8169 = var76 < 0 || var77 < 0 || var78 < 0 || var76 > arg2.field8159 || var77 > arg2.field8159 || var78 > arg2.field8159;
                                short var82 = var47.field8533[var72];
                                if (var82 != -1) {
                                    if (this.method1081(this.field2232.field2384.method1386(var82, -6514).field2300)) {
                                        arg2.field8160 = 100;
                                    }
                                    arg2.method3293(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], var47.field8529[var73], var47.field8529[var74], var47.field8529[var75], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, (int) var65, (int) var68, (int) var71, var82);
                                    arg2.field8160 = 0;
                                } else {
                                    int var83 = var47.field8536[var72];
                                    if (var83 != -1) {
                                        arg2.method3295(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], class477.method2799(var47.field8529[var73], var83, -20439), class477.method2799(var47.field8529[var74], var83, -20439), class477.method2799(var47.field8529[var75], var83, -20439));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var84 = 0; var84 < var47.field8537; ++var84) {
                        short var85 = var47.field8531[var84];
                        short var86 = var47.field8528[var84];
                        short var87 = var47.field8539[var84];
                        int var88 = arg3[var85];
                        int var89 = arg3[var86];
                        int var90 = arg3[var87];
                        int var91 = arg4[var85];
                        int var92 = arg4[var86];
                        int var93 = arg4[var87];
                        if ((var88 - var89) * (var93 - var92) - (var90 - var89) * (var91 - var92) > 0) {
                            arg2.field8169 = var88 < 0 || var89 < 0 || var90 < 0 || var88 > arg2.field8159 || var89 > arg2.field8159 || var90 > arg2.field8159;
                            short var94 = var47.field8533[var84];
                            if (var94 != -1) {
                                if (this.method1081(this.field2232.field2384.method1386(var94, -6514).field2300)) {
                                    arg2.field8160 = 100;
                                }
                                arg2.method3293(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], var47.field8529[var85], var47.field8529[var86], var47.field8529[var87], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, this.field2231, this.field2231, this.field2231, var94);
                                arg2.field8160 = 0;
                            } else {
                                int var95 = var47.field8536[var84];
                                if (var95 != -1) {
                                    arg2.method3295(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], class477.method2799(var47.field8529[var85], var95, -20439), class477.method2799(var47.field8529[var86], var95, -20439), class477.method2799(var47.field8529[var87], var95, -20439));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var96 = 0; var96 < var47.field8537; ++var96) {
                    short var97 = var47.field8531[var96];
                    short var98 = var47.field8528[var96];
                    short var99 = var47.field8539[var96];
                    int var100 = arg3[var97];
                    int var101 = arg3[var98];
                    int var102 = arg3[var99];
                    int var103 = arg4[var97];
                    int var104 = arg4[var98];
                    int var105 = arg4[var99];
                    if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                        int var106 = var47.field8536[var96];
                        if (var106 != -1) {
                            arg2.field8169 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg2.field8159 || var101 > arg2.field8159 || var102 > arg2.field8159;
                            arg2.method3295(var103, var104, var105, var100, var101, var102, arg5[var97], arg5[var98], arg5[var99], class477.method2799(var47.field8529[var97], var106, -20439), class477.method2799(var47.field8529[var98], var106, -20439), class477.method2799(var47.field8529[var99], var106, -20439));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method437(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)V")
    public final void method440(int arg0, int arg1, int arg2) {
        if (this.field2227[arg0][arg1] < arg2) {
            this.field2227[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!cda", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method433(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field2221 == null) {
            this.field2221 = new class76[super.field631][super.field632];
            this.field2220 = new class116[super.field631][super.field632];
        } else if (this.field2222 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class689.field9703[class373.method2250((byte) 88, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class689.field9703[class373.method2250((byte) 42, arg7[var16]) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field629 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field629 && arg4[var22] == super.field629) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field629) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field629 != arg2[var24] && arg2[0] - super.field629 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field629 != arg4[var24] && arg4[0] - super.field629 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class76 var25 = new class76();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field1317 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field1314 = (byte) (var25.field1314 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (super.field624[arg0 + 1][arg1] == super.field624[arg0][arg1] && super.field624[arg0 + 1][arg1 + 1] == super.field624[arg0][arg1] && super.field624[arg0][arg1 + 1] == super.field624[arg0][arg1]) {
                    var25.field1314 = (byte) (var25.field1314 | 1);
                }
                if (var27 != -1 && (var25.field1314 & 2) == 0 && !this.field2232.field2384.method1386(var27, -6514).field2305) {
                    var25.field1320 = this.field2223[arg0][arg1] - this.field2227[arg0][arg1];
                    var25.field1313 = this.field2223[arg0 + 1][arg1] - this.field2227[arg0 + 1][arg1];
                    var25.field1318 = this.field2223[arg0 + 1][arg1 + 1] - this.field2227[arg0 + 1][arg1 + 1];
                    var25.field1319 = this.field2223[arg0][arg1 + 1] - this.field2227[arg0][arg1 + 1];
                    var25.field1312 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field1320 = class148.method1058(arg10, var28, method1079(arg6[var18] >> 8, this.field2223[arg0][arg1] - this.field2227[arg0][arg1]), -63);
                    if (var25.field1317 != 0) {
                        var25.field1320 |= 255 - (this.field2223[arg0][arg1] - this.field2227[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field1313 = class148.method1058(arg10, var29, method1079(arg6[var19] >> 8, this.field2223[arg0 + 1][arg1] - this.field2227[arg0 + 1][arg1]), -113);
                    if (var25.field1317 != 0) {
                        var25.field1313 |= 255 - (this.field2223[arg0 + 1][arg1] - this.field2227[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field1318 = class148.method1058(arg10, var30, method1079(arg6[var20] >> 8, this.field2223[arg0 + 1][arg1 + 1] - this.field2227[arg0 + 1][arg1 + 1]), 91);
                    if (var25.field1317 != 0) {
                        var25.field1318 |= 255 - (this.field2223[arg0 + 1][arg1 + 1] - this.field2227[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field1319 = class148.method1058(arg10, var31, method1079(arg6[var21] >> 8, this.field2223[arg0][arg1 + 1] - this.field2227[arg0][arg1 + 1]), 54);
                    if (var25.field1317 != 0) {
                        var25.field1319 |= 255 - (this.field2223[arg0][arg1 + 1] - this.field2227[arg0][arg1 + 1]) << 25;
                    }
                    var25.field1312 = -1;
                }
                if (arg5 != null) {
                    var25.field1316 = (short) arg5[var20];
                    var25.field1311 = (short) arg5[var21];
                    var25.field1315 = (short) arg5[var19];
                    var25.field1321 = (short) arg5[var18];
                }
                this.field2221[arg0][arg1] = var25;
            } else {
                class116 var32 = new class116();
                var32.field1774 = (short) arg2.length;
                var32.field1775 = (short) (arg2.length / 3);
                var32.field1773 = new short[var32.field1774];
                var32.field1772 = new short[var32.field1774];
                var32.field1766 = new short[var32.field1774];
                var32.field1770 = new int[var32.field1774];
                if (arg5 != null) {
                    var32.field1767 = new short[var32.field1774];
                }
                for (int var33 = 0; var33 < var32.field1774; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field2223[arg0][arg1] - this.field2227[arg0][arg1];
                    } else if (var48 == 0 && super.field629 == var49) {
                        var51 = this.field2223[arg0][arg1 + 1] - this.field2227[arg0][arg1 + 1];
                    } else if (super.field629 == var48 && super.field629 == var49) {
                        var51 = this.field2223[arg0 + 1][arg1 + 1] - this.field2227[arg0 + 1][arg1 + 1];
                    } else if (super.field629 == var48 && var49 == 0) {
                        var51 = this.field2223[arg0 + 1][arg1] - this.field2227[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field2223[arg0 + 1][arg1] - this.field2227[arg0 + 1][arg1]) * var48 + (this.field2223[arg0][arg1] - this.field2227[arg0][arg1]) * (super.field629 - var48);
                        int var53 = (this.field2223[arg0 + 1][arg1 + 1] - this.field2227[arg0 + 1][arg1 + 1]) * var48 + (this.field2223[arg0][arg1 + 1] - this.field2227[arg0][arg1 + 1]) * (super.field629 - var48);
                        var51 = (super.field629 - var49) * var52 + var49 * var53 >> super.field625 * 2;
                    }
                    int var54 = (arg0 << super.field625) + var48;
                    int var55 = (arg1 << super.field625) + var49;
                    var32.field1773[var33] = (short) var48;
                    var32.field1766[var33] = (short) var49;
                    var32.field1772[var33] = (short) (this.method442(var54, true, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field2232.field2384.method1386(arg8[var33], -6514).field2305) {
                        var32.field1770[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field1770[var33] = var51 << 25;
                        } else {
                            var32.field1770[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field1767[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field1770[var33] = class148.method1058(arg10, var56, method1079(arg6[var33] >> 8, var51), -47);
                        if (arg7 != null) {
                            var32.field1770[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field1775; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field2232.field2384.method1386(arg8[var35 * 3], -6514).field2305) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field1768 = new int[var32.field1775];
                }
                if (var34) {
                    var32.field1769 = new short[var32.field1775];
                    var32.field1771 = new short[var32.field1775];
                }
                for (int var36 = 0; var36 < var32.field1775; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field1768[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field2232.field2384.method1386(var42, -6514).field2305) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field2232.field2384.method1386(var43, -6514).field2305) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field2232.field2384.method1386(var44, -6514).field2305) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field1769[var36] = (short) var44;
                            var32.field1771[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field2232.field2384.method1386(var45, -6514).field2305) {
                                    var32.field1770[var37] = class689.field9703[class373.method2250((byte) 48, this.field2232.field2384.method1386(var45, -6514).field2283 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field2232.field2384.method1386(var46, -6514).field2305) {
                                    var32.field1770[var38] = class689.field9703[class373.method2250((byte) 54, this.field2232.field2384.method1386(var46, -6514).field2283 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field2232.field2384.method1386(var47, -6514).field2305) {
                                    var32.field1770[var39] = class689.field9703[class373.method2250((byte) 119, this.field2232.field2384.method1386(var47, -6514).field2283 & 65535) & 65535];
                                }
                            }
                            var32.field1769[var36] = -1;
                        }
                    }
                }
                this.field2220[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method446(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method430(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method434(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field2222 == null) {
            this.field2222 = new class396[super.field631][super.field632];
            this.field2235 = new class604[super.field631][super.field632];
        } else if (this.field2221 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field629 != var20 || var21 != 0 && super.field629 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class604 var22 = new class604();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field8534 = var23;
            var22.field8529 = new short[var23];
            var22.field8532 = new short[var23];
            var22.field8530 = new short[var23];
            var22.field8538 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field8529[var25] = (short) (this.field2223[arg0][arg1] - this.field2227[arg0][arg1]);
                } else if (var30 == 0 && super.field629 == var31) {
                    var22.field8529[var25] = (short) (this.field2223[arg0][arg1 + 1] - this.field2227[arg0][arg1 + 1]);
                } else if (super.field629 == var30 && super.field629 == var31) {
                    var22.field8529[var25] = (short) (this.field2223[arg0 + 1][arg1 + 1] - this.field2227[arg0 + 1][arg1 + 1]);
                } else if (super.field629 == var30 && var31 == 0) {
                    var22.field8529[var25] = (short) (this.field2223[arg0 + 1][arg1] - this.field2227[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field2223[arg0 + 1][arg1] - this.field2227[arg0 + 1][arg1]) * var30 + (this.field2223[arg0][arg1] - this.field2227[arg0][arg1]) * (super.field629 - var30);
                    int var33 = (this.field2223[arg0 + 1][arg1 + 1] - this.field2227[arg0 + 1][arg1 + 1]) * var30 + (this.field2223[arg0][arg1 + 1] - this.field2227[arg0][arg1 + 1]) * (super.field629 - var30);
                    var22.field8529[var25] = (short) ((super.field629 - var31) * var32 + var31 * var33 >> super.field625 * 2);
                }
                int var34 = (arg0 << super.field625) + var30;
                int var35 = (arg1 << super.field625) + var31;
                var22.field8532[var25] = (short) var30;
                var22.field8538[var25] = (short) var31;
                var22.field8530[var25] = (short) (this.method442(var34, true, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field8529[var25] < 2) {
                    var22.field8529[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field2232.field2384.method1386(arg11[var28], -6514).field2305) {
                    var26 = true;
                }
            }
            var22.field8536 = new int[var27];
            if (arg10 != null) {
                var22.field8535 = new int[var27];
            }
            var22.field8531 = new short[var27];
            var22.field8528 = new short[var27];
            var22.field8539 = new short[var27];
            if (var26) {
                var22.field8533 = new short[var27];
                var22.field8540 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field8536[var22.field8537] = class373.method2250((byte) 68, arg9[var29]);
                    } else {
                        var22.field8536[var22.field8537] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field8535[var22.field8537] = class373.method2250((byte) 122, arg10[var29]);
                        } else {
                            var22.field8535[var22.field8537] = -1;
                        }
                    }
                    var22.field8531[var22.field8537] = (short) arg6[var29];
                    var22.field8528[var22.field8537] = (short) arg7[var29];
                    var22.field8539[var22.field8537] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field2232.field2384.method1386(arg11[var29], -6514).field2305) {
                            var22.field8533[var22.field8537] = (short) arg11[var29];
                            var22.field8540[var22.field8537] = (short) arg12[var29];
                        } else {
                            var22.field8533[var22.field8537] = -1;
                        }
                    }
                    ++var22.field8537;
                }
            }
            this.field2235[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class396 var36 = new class396();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field5873 = class477.method2799(this.field2223[arg0][arg1] - this.field2227[arg0][arg1], class373.method2250((byte) 41, arg10[0]), -20439);
                    if (var37 == -1) {
                        var36.field5871 = (byte) (var36.field5871 | 2);
                    }
                }
                if (super.field624[arg0 + 1][arg1] == super.field624[arg0][arg1] && super.field624[arg0 + 1][arg1 + 1] == super.field624[arg0][arg1] && super.field624[arg0][arg1 + 1] == super.field624[arg0][arg1]) {
                    var36.field5871 = (byte) (var36.field5871 | 1);
                }
                if (var38 != -1 && (var36.field5871 & 2) == 0 && !this.field2232.field2384.method1386(var38, -6514).field2305) {
                    var36.field5875 = (short) (this.field2223[arg0][arg1] - this.field2227[arg0][arg1]);
                    var36.field5870 = (short) (this.field2223[arg0 + 1][arg1] - this.field2227[arg0 + 1][arg1]);
                    var36.field5874 = (short) (this.field2223[arg0 + 1][arg1 + 1] - this.field2227[arg0 + 1][arg1 + 1]);
                    var36.field5872 = (short) (this.field2223[arg0][arg1 + 1] - this.field2227[arg0][arg1 + 1]);
                    var36.field5869 = (short) var38;
                } else {
                    short var39 = class373.method2250((byte) 111, var37);
                    var36.field5875 = (short) class477.method2799(this.field2223[arg0][arg1] - this.field2227[arg0][arg1], var39, -20439);
                    var36.field5870 = (short) class477.method2799(this.field2223[arg0 + 1][arg1] - this.field2227[arg0 + 1][arg1], var39, -20439);
                    var36.field5874 = (short) class477.method2799(this.field2223[arg0 + 1][arg1 + 1] - this.field2227[arg0 + 1][arg1 + 1], var39, -20439);
                    var36.field5872 = (short) class477.method2799(this.field2223[arg0][arg1 + 1] - this.field2227[arg0][arg1 + 1], var39, -20439);
                    var36.field5869 = -1;
                }
                this.field2222[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIZLgn;Loo;[I[I[I[I)V")
    private final void method1084(int arg0, int arg1, boolean arg2, class651 arg3, class579 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8) {
        class76 var10 = this.field2221[arg0][arg1];
        if (var10 != null) {
            if ((var10.field1314 & 2) == 0) {
                int var11 = super.field629 * arg0;
                int var12 = super.field629 + var11;
                int var13 = super.field629 * arg1;
                int var14 = super.field629 + var13;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                float var21;
                float var22;
                float var23;
                float var24;
                float var31;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                float var37;
                int var38;
                float var39;
                int var40;
                float var41;
                int var42;
                float var43;
                int var44;
                float var45;
                int var46;
                if ((var10.field1314 & 1) != 0 && !arg2) {
                    int var19 = super.field624[arg0][arg1];
                    float var20 = (float) var19 * this.field2217;
                    if (this.field2231 == -1) {
                        var21 = (float) var13 * this.field2229 + (float) var11 * this.field2224 + var20 + this.field2237;
                        if (var21 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var22 = (float) var13 * this.field2229 + (float) var12 * this.field2224 + var20 + this.field2237;
                        if (var22 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var23 = (float) var14 * this.field2229 + (float) var12 * this.field2224 + var20 + this.field2237;
                        if (var23 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var24 = (float) var14 * this.field2229 + (float) var11 * this.field2224 + var20 + this.field2237;
                        if (var24 <= (float) this.field2232.field3012) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field2229 + (float) var11 * this.field2224 + var20 + this.field2237;
                        var22 = (float) var13 * this.field2229 + (float) var12 * this.field2224 + var20 + this.field2237;
                        var23 = (float) var14 * this.field2229 + (float) var12 * this.field2224 + var20 + this.field2237;
                        var24 = (float) var14 * this.field2229 + (float) var11 * this.field2224 + var20 + this.field2237;
                    }
                    if (arg3.field9130) {
                        int var25 = (int) (var21 - (float) arg3.field9129);
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = (int) (var22 - (float) arg3.field9129);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field9129);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field9129);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    float var29 = (float) var19 * this.field2226;
                    float var30 = (float) var19 * this.field2236;
                    if (this.field2231 == -1) {
                        var31 = (float) var13 * this.field2228 + (float) var11 * this.field2225 + var29 + this.field2233;
                        var32 = (int) ((float) this.field2232.field3009 * var31 / var21) + arg4.field8164;
                        var33 = (float) var13 * this.field2219 + (float) var11 * this.field2230 + var30 + this.field2234;
                        var34 = (int) ((float) this.field2232.field2994 * var33 / var21) + arg4.field8154;
                        var35 = (float) var13 * this.field2228 + (float) var12 * this.field2225 + var29 + this.field2233;
                        var36 = (int) ((float) this.field2232.field3009 * var35 / var22) + arg4.field8164;
                        var37 = (float) var13 * this.field2219 + (float) var12 * this.field2230 + var30 + this.field2234;
                        var38 = (int) ((float) this.field2232.field2994 * var37 / var22) + arg4.field8154;
                        var39 = (float) var14 * this.field2228 + (float) var12 * this.field2225 + var29 + this.field2233;
                        var40 = (int) ((float) this.field2232.field3009 * var39 / var23) + arg4.field8164;
                        var41 = (float) var14 * this.field2219 + (float) var12 * this.field2230 + var30 + this.field2234;
                        var42 = (int) ((float) this.field2232.field2994 * var41 / var23) + arg4.field8154;
                        var43 = (float) var14 * this.field2228 + (float) var11 * this.field2225 + var29 + this.field2233;
                        var44 = (int) ((float) this.field2232.field3009 * var43 / var24) + arg4.field8164;
                        var45 = (float) var14 * this.field2219 + (float) var11 * this.field2230 + var30 + this.field2234;
                        var46 = (int) ((float) this.field2232.field2994 * var45 / var24) + arg4.field8154;
                    } else {
                        var31 = (float) var13 * this.field2228 + (float) var11 * this.field2225 + var29 + this.field2233;
                        var32 = (int) ((float) this.field2232.field3009 * var31 / (float) this.field2231) + arg4.field8164;
                        var33 = (float) var13 * this.field2219 + (float) var11 * this.field2230 + var30 + this.field2234;
                        var34 = (int) ((float) this.field2232.field2994 * var33 / (float) this.field2231) + arg4.field8154;
                        var35 = (float) var13 * this.field2228 + (float) var12 * this.field2225 + var29 + this.field2233;
                        var36 = (int) ((float) this.field2232.field3009 * var35 / (float) this.field2231) + arg4.field8164;
                        var37 = (float) var13 * this.field2219 + (float) var12 * this.field2230 + var30 + this.field2234;
                        var38 = (int) ((float) this.field2232.field2994 * var37 / (float) this.field2231) + arg4.field8154;
                        var39 = (float) var14 * this.field2228 + (float) var12 * this.field2225 + var29 + this.field2233;
                        var40 = (int) ((float) this.field2232.field3009 * var39 / (float) this.field2231) + arg4.field8164;
                        var41 = (float) var14 * this.field2219 + (float) var12 * this.field2230 + var30 + this.field2234;
                        var42 = (int) ((float) this.field2232.field2994 * var41 / (float) this.field2231) + arg4.field8154;
                        var43 = (float) var14 * this.field2228 + (float) var11 * this.field2225 + var29 + this.field2233;
                        var44 = (int) ((float) this.field2232.field3009 * var43 / (float) this.field2231) + arg4.field8164;
                        var45 = (float) var14 * this.field2219 + (float) var11 * this.field2230 + var30 + this.field2234;
                        var46 = (int) ((float) this.field2232.field2994 * var45 / (float) this.field2231) + arg4.field8154;
                    }
                } else {
                    int var47 = super.field624[arg0][arg1];
                    int var48 = super.field624[arg0 + 1][arg1];
                    int var49 = super.field624[arg0 + 1][arg1 + 1];
                    int var50 = super.field624[arg0][arg1 + 1];
                    if (this.field2231 == -1) {
                        var21 = (float) var13 * this.field2229 + (float) var11 * this.field2224 + (float) var47 * this.field2217 + this.field2237;
                        if (var21 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var22 = (float) var13 * this.field2229 + (float) var12 * this.field2224 + (float) var48 * this.field2217 + this.field2237;
                        if (var22 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var23 = (float) var14 * this.field2229 + (float) var12 * this.field2224 + (float) var49 * this.field2217 + this.field2237;
                        if (var23 <= (float) this.field2232.field3012) {
                            return;
                        }
                        var24 = (float) var14 * this.field2229 + (float) var11 * this.field2224 + (float) var50 * this.field2217 + this.field2237;
                        if (var24 <= (float) this.field2232.field3012) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field2229 + (float) var11 * this.field2224 + (float) var47 * this.field2217 + this.field2237;
                        var22 = (float) var13 * this.field2229 + (float) var12 * this.field2224 + (float) var48 * this.field2217 + this.field2237;
                        var23 = (float) var14 * this.field2229 + (float) var12 * this.field2224 + (float) var49 * this.field2217 + this.field2237;
                        var24 = (float) var14 * this.field2229 + (float) var11 * this.field2224 + (float) var50 * this.field2217 + this.field2237;
                    }
                    if (arg2) {
                        int var51 = (int) (var21 - (float) arg3.field9129);
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var15 = var51;
                            int var52 = var10.field1321 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = (int) (var22 - (float) arg3.field9129);
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var16 = var53;
                            int var54 = var10.field1315 * var53 / 255;
                            if (var54 > 0) {
                                var48 -= var54;
                            }
                        }
                        int var55 = (int) (var23 - (float) arg3.field9129);
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field1316 * var55 / 255;
                            if (var56 > 0) {
                                var49 -= var56;
                            }
                        }
                        int var57 = (int) (var24 - (float) arg3.field9129);
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var18 = var57;
                            int var58 = var10.field1311 * var57 / 255;
                            if (var58 > 0) {
                                var50 -= var58;
                            }
                        }
                    } else if (arg3.field9130) {
                        int var59 = (int) (var21 - (float) arg3.field9129);
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = (int) (var22 - (float) arg3.field9129);
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = (int) (var23 - (float) arg3.field9129);
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                        int var62 = (int) (var24 - (float) arg3.field9129);
                        if (var62 > 0) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    if (this.field2231 == -1) {
                        var31 = (float) var13 * this.field2228 + (float) var11 * this.field2225 + (float) var47 * this.field2226 + this.field2233;
                        var32 = (int) ((float) this.field2232.field3009 * var31 / var21) + arg4.field8164;
                        var33 = (float) var13 * this.field2219 + (float) var11 * this.field2230 + (float) var47 * this.field2236 + this.field2234;
                        var34 = (int) ((float) this.field2232.field2994 * var33 / var21) + arg4.field8154;
                        var35 = (float) var13 * this.field2228 + (float) var12 * this.field2225 + (float) var48 * this.field2226 + this.field2233;
                        var36 = (int) ((float) this.field2232.field3009 * var35 / var22) + arg4.field8164;
                        var37 = (float) var13 * this.field2219 + (float) var12 * this.field2230 + (float) var48 * this.field2236 + this.field2234;
                        var38 = (int) ((float) this.field2232.field2994 * var37 / var22) + arg4.field8154;
                        var39 = (float) var14 * this.field2228 + (float) var12 * this.field2225 + (float) var49 * this.field2226 + this.field2233;
                        var40 = (int) ((float) this.field2232.field3009 * var39 / var23) + arg4.field8164;
                        var41 = (float) var14 * this.field2219 + (float) var12 * this.field2230 + (float) var49 * this.field2236 + this.field2234;
                        var42 = (int) ((float) this.field2232.field2994 * var41 / var23) + arg4.field8154;
                        var43 = (float) var14 * this.field2228 + (float) var11 * this.field2225 + (float) var50 * this.field2226 + this.field2233;
                        var44 = (int) ((float) this.field2232.field3009 * var43 / var24) + arg4.field8164;
                        var45 = (float) var14 * this.field2219 + (float) var11 * this.field2230 + (float) var50 * this.field2236 + this.field2234;
                        var46 = (int) ((float) this.field2232.field2994 * var45 / var24) + arg4.field8154;
                    } else {
                        var31 = (float) var13 * this.field2228 + (float) var11 * this.field2225 + (float) var47 * this.field2226 + this.field2233;
                        var32 = (int) ((float) this.field2232.field3009 * var31 / (float) this.field2231) + arg4.field8164;
                        var33 = (float) var13 * this.field2219 + (float) var11 * this.field2230 + (float) var47 * this.field2236 + this.field2234;
                        var34 = (int) ((float) this.field2232.field2994 * var33 / (float) this.field2231) + arg4.field8154;
                        var35 = (float) var13 * this.field2228 + (float) var12 * this.field2225 + (float) var48 * this.field2226 + this.field2233;
                        var36 = (int) ((float) this.field2232.field3009 * var35 / (float) this.field2231) + arg4.field8164;
                        var37 = (float) var13 * this.field2219 + (float) var12 * this.field2230 + (float) var48 * this.field2236 + this.field2234;
                        var38 = (int) ((float) this.field2232.field2994 * var37 / (float) this.field2231) + arg4.field8154;
                        var39 = (float) var14 * this.field2228 + (float) var12 * this.field2225 + (float) var49 * this.field2226 + this.field2233;
                        var40 = (int) ((float) this.field2232.field3009 * var39 / (float) this.field2231) + arg4.field8164;
                        var41 = (float) var14 * this.field2219 + (float) var12 * this.field2230 + (float) var49 * this.field2236 + this.field2234;
                        var42 = (int) ((float) this.field2232.field2994 * var41 / (float) this.field2231) + arg4.field8154;
                        var43 = (float) var14 * this.field2228 + (float) var11 * this.field2225 + (float) var50 * this.field2226 + this.field2233;
                        var44 = (int) ((float) this.field2232.field3009 * var43 / (float) this.field2231) + arg4.field8164;
                        var45 = (float) var14 * this.field2219 + (float) var11 * this.field2230 + (float) var50 * this.field2236 + this.field2234;
                        var46 = (int) ((float) this.field2232.field2994 * var45 / (float) this.field2231) + arg4.field8154;
                    }
                }
                boolean var63 = var10.field1312 != -1 && this.method1081(this.field2232.field2384.method1386(var10.field1312, -6514).field2300);
                if (this.field2231 == -1) {
                    int var64 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field8169 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field8159 || var44 > arg4.field8159 || var36 > arg4.field8159;
                        if (var64 < 765) {
                            if (var63) {
                                arg4.field8160 = 100;
                            }
                            if (var64 > 0) {
                                if (var10.field1312 >= 0) {
                                    arg4.method3305(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field9124, var17, var18, var16, var10.field1318, var10.field1319, var10.field1313, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field1312);
                                } else {
                                    arg4.method3291(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class89.method766((byte) -95, var17 << 24 | arg3.field9124, var10.field1318), class89.method766((byte) -112, var18 << 24 | arg3.field9124, var10.field1319), class89.method766((byte) -124, var16 << 24 | arg3.field9124, var10.field1313));
                                }
                            } else if (var10.field1312 >= 0) {
                                arg4.method3293(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field1318, var10.field1319, var10.field1313, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field1312);
                            } else {
                                arg4.method3291(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field1318, var10.field1319, var10.field1313);
                            }
                            arg4.field8160 = 0;
                        } else {
                            arg4.method3303(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field9124);
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field8169 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field8159 || var36 > arg4.field8159 || var44 > arg4.field8159;
                        if (var65 < 765) {
                            if (var63) {
                                arg4.field8160 = 100;
                            }
                            if (var65 > 0) {
                                if (var10.field1312 >= 0) {
                                    arg4.method3305(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field9124, var15, var16, var18, var10.field1320, var10.field1313, var10.field1319, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field1312);
                                } else {
                                    arg4.method3291(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class89.method766((byte) -97, var15 << 24 | arg3.field9124, var10.field1320), class89.method766((byte) -97, var16 << 24 | arg3.field9124, var10.field1313), class89.method766((byte) -124, var18 << 24 | arg3.field9124, var10.field1319));
                                }
                            } else if (var10.field1312 >= 0) {
                                arg4.method3293(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field1320, var10.field1313, var10.field1319, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field1312);
                            } else {
                                arg4.method3291(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field1320, var10.field1313, var10.field1319);
                            }
                            arg4.field8160 = 0;
                            return;
                        }
                        arg4.method3303(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field9124);
                        return;
                    }
                } else {
                    int var66 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field8169 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field8159 || var44 > arg4.field8159 || var36 > arg4.field8159;
                        if (var66 < 765) {
                            if (var63) {
                                arg4.field8160 = 100;
                            }
                            if (var66 > 0) {
                                if (var10.field1312 >= 0) {
                                    arg4.method3305(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field9124, var17, var18, var16, var10.field1318, var10.field1319, var10.field1313, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field2231, this.field2231, this.field2231, var10.field1312);
                                } else {
                                    arg4.method3291(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class89.method766((byte) -128, var17 << 24 | arg3.field9124, var10.field1318), class89.method766((byte) -115, var18 << 24 | arg3.field9124, var10.field1319), class89.method766((byte) -119, var16 << 24 | arg3.field9124, var10.field1313));
                                }
                            } else if (var10.field1312 >= 0) {
                                arg4.method3293(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field1318, var10.field1319, var10.field1313, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field2231, this.field2231, this.field2231, var10.field1312);
                            } else {
                                arg4.method3291(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field1318, var10.field1319, var10.field1313);
                            }
                            arg4.field8160 = 0;
                        } else {
                            arg4.method3303(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field9124);
                        }
                    }
                    int var67 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field8169 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field8159 || var36 > arg4.field8159 || var44 > arg4.field8159;
                        if (var67 < 765) {
                            if (var63) {
                                arg4.field8160 = 100;
                            }
                            if (var67 > 0) {
                                if (var10.field1312 >= 0) {
                                    arg4.method3305(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field9124, var15, var16, var18, var10.field1320, var10.field1313, var10.field1319, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field2231, this.field2231, this.field2231, var10.field1312);
                                } else {
                                    arg4.method3291(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class89.method766((byte) -108, var15 << 24 | arg3.field9124, var10.field1320), class89.method766((byte) -117, var16 << 24 | arg3.field9124, var10.field1313), class89.method766((byte) -104, var18 << 24 | arg3.field9124, var10.field1319));
                                }
                            } else if (var10.field1312 >= 0) {
                                arg4.method3293(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field1320, var10.field1313, var10.field1319, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field2231, this.field2231, this.field2231, var10.field1312);
                            } else {
                                arg4.method3291(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field1320, var10.field1313, var10.field1319);
                            }
                            arg4.field8160 = 0;
                            return;
                        }
                        arg4.method3303(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field9124);
                    }
                }
            }
        } else {
            class116 var68 = this.field2220[arg0][arg1];
            if (var68 != null) {
                if (this.field2231 == -1) {
                    for (int var69 = 0; var69 < var68.field1774; ++var69) {
                        int var70 = (arg0 << super.field625) + var68.field1773[var69];
                        int var71 = var68.field1772[var69];
                        int var72 = (arg1 << super.field625) + var68.field1766[var69];
                        float var73 = (float) var72 * this.field2229 + (float) var70 * this.field2224 + (float) var71 * this.field2217 + this.field2237;
                        if (var73 <= (float) this.field2232.field3012) {
                            return;
                        }
                        arg8[var69] = 0;
                        if (arg2) {
                            int var74 = (int) (var73 - (float) arg3.field9129);
                            if (var74 > 255) {
                                var74 = 255;
                            }
                            if (var74 > 0) {
                                arg8[var69] = var74;
                                int var75 = var68.field1767[var69] * var74 / 255;
                                if (var75 > 0) {
                                    var71 -= var75;
                                }
                            }
                        } else if (arg3.field9130) {
                            int var76 = (int) (var73 - (float) arg3.field9129);
                            if (var76 > 0) {
                                arg8[var69] = var76;
                                if (arg8[var69] > 255) {
                                    arg8[var69] = 255;
                                }
                            }
                        }
                        float var77 = (float) var72 * this.field2228 + (float) var70 * this.field2225 + (float) var71 * this.field2226 + this.field2233;
                        float var78 = (float) var72 * this.field2219 + (float) var70 * this.field2230 + (float) var71 * this.field2236 + this.field2234;
                        arg5[var69] = (int) ((float) this.field2232.field3009 * var77 / var73) + arg4.field8164;
                        arg6[var69] = (int) ((float) this.field2232.field2994 * var78 / var73) + arg4.field8154;
                        arg7[var69] = (int) var73;
                    }
                } else {
                    for (int var79 = 0; var79 < var68.field1774; ++var79) {
                        int var131 = (arg0 << super.field625) + var68.field1773[var79];
                        int var132 = var68.field1772[var79];
                        int var133 = (arg1 << super.field625) + var68.field1766[var79];
                        float var134 = (float) var133 * this.field2229 + (float) var131 * this.field2224 + (float) var132 * this.field2217 + this.field2237;
                        arg8[var79] = 0;
                        if (arg2) {
                            int var135 = this.field2231 - arg3.field9129;
                            if (var135 > 255) {
                                var135 = 255;
                            }
                            if (var135 > 0) {
                                arg8[var79] = var135;
                                int var136 = var68.field1767[var79] * var135 / 255;
                                if (var136 > 0) {
                                    var132 -= var136;
                                }
                            }
                        } else if (arg3.field9130) {
                            int var137 = this.field2231 - arg3.field9129;
                            if (var137 > 0) {
                                arg8[var79] = var137;
                                if (arg8[var79] > 255) {
                                    arg8[var79] = 255;
                                }
                            }
                        }
                        float var138 = (float) var133 * this.field2228 + (float) var131 * this.field2225 + (float) var132 * this.field2226 + this.field2233;
                        float var139 = (float) var133 * this.field2219 + (float) var131 * this.field2230 + (float) var132 * this.field2236 + this.field2234;
                        arg5[var79] = (int) ((float) this.field2232.field3009 * var138 / (float) this.field2231) + arg4.field8164;
                        arg6[var79] = (int) ((float) this.field2232.field2994 * var139 / (float) this.field2231) + arg4.field8154;
                        arg7[var79] = (int) var134;
                    }
                }
                if (var68.field1769 != null) {
                    int var80 = super.field624[arg0][arg1];
                    int var81 = super.field624[arg0 + 1][arg1];
                    int var82 = super.field624[arg0][arg1 + 1];
                    int var83 = super.field629 * arg0;
                    int var84 = super.field629 + var83;
                    int var85 = super.field629 * arg1;
                    int var86 = super.field629 + var85;
                    float var87 = (float) var85 * this.field2228 + (float) var80 * this.field2226 + (float) var83 * this.field2225 + this.field2233;
                    float var88 = (float) var85 * this.field2219 + (float) var80 * this.field2236 + (float) var83 * this.field2230 + this.field2234;
                    float var89 = (float) var85 * this.field2229 + (float) var80 * this.field2217 + (float) var83 * this.field2224 + this.field2237;
                    float var90 = (float) var85 * this.field2228 + (float) var81 * this.field2226 + (float) var84 * this.field2225 + this.field2233;
                    float var91 = (float) var85 * this.field2219 + (float) var81 * this.field2236 + (float) var84 * this.field2230 + this.field2234;
                    float var92 = (float) var85 * this.field2229 + (float) var81 * this.field2217 + (float) var84 * this.field2224 + this.field2237;
                    float var93 = (float) var86 * this.field2228 + (float) var82 * this.field2226 + (float) var83 * this.field2225 + this.field2233;
                    float var94 = (float) var86 * this.field2219 + (float) var82 * this.field2236 + (float) var83 * this.field2230 + this.field2234;
                    float var95 = (float) var86 * this.field2229 + (float) var82 * this.field2217 + (float) var83 * this.field2224 + this.field2237;
                    if (this.field2231 == -1) {
                        for (int var96 = 0; var96 < var68.field1775; ++var96) {
                            int var97 = var96 * 3;
                            int var98 = var97 + 1;
                            int var99 = var98 + 1;
                            int var100 = arg5[var97];
                            int var101 = arg5[var98];
                            int var102 = arg5[var99];
                            int var103 = arg6[var97];
                            int var104 = arg6[var98];
                            int var105 = arg6[var99];
                            int var106 = arg8[var97] + arg8[var98] + arg8[var99];
                            if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                                arg4.field8169 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg4.field8159 || var101 > arg4.field8159 || var102 > arg4.field8159;
                                short var107 = var68.field1769[var96];
                                if (var106 < 765) {
                                    if (var107 != -1 && this.method1081(this.field2232.field2384.method1386(var107, -6514).field2300)) {
                                        arg4.field8160 = 100;
                                    }
                                    if (var106 > 0) {
                                        if (var107 != -1) {
                                            arg4.method3305(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field9124, arg8[var97], arg8[var98], arg8[var99], var68.field1770[var97], var68.field1770[var98], var68.field1770[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                        } else if ((var68.field1770[var97] & 16777215) != 0) {
                                            arg4.method3291(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], class89.method766((byte) -106, arg8[var97] << 24 | arg3.field9124, var68.field1770[var97]), class89.method766((byte) -115, arg8[var98] << 24 | arg3.field9124, var68.field1770[var98]), class89.method766((byte) -120, arg8[var99] << 24 | arg3.field9124, var68.field1770[var99]));
                                        }
                                    } else if (var107 != -1) {
                                        arg4.method3293(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field1770[var97], var68.field1770[var98], var68.field1770[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                    } else if ((var68.field1770[var97] & 16777215) != 0) {
                                        arg4.method3291(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field1770[var97], var68.field1770[var98], var68.field1770[var99]);
                                    }
                                    arg4.field8160 = 0;
                                } else {
                                    arg4.method3303(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field9124);
                                }
                            }
                        }
                        return;
                    }
                    for (int var108 = 0; var108 < var68.field1775; ++var108) {
                        int var109 = var108 * 3;
                        int var110 = var109 + 1;
                        int var111 = var110 + 1;
                        int var112 = arg5[var109];
                        int var113 = arg5[var110];
                        int var114 = arg5[var111];
                        int var115 = arg6[var109];
                        int var116 = arg6[var110];
                        int var117 = arg6[var111];
                        int var118 = arg8[var109] + arg8[var110] + arg8[var111];
                        if ((var112 - var113) * (var117 - var116) - (var114 - var113) * (var115 - var116) > 0) {
                            arg4.field8169 = var112 < 0 || var113 < 0 || var114 < 0 || var112 > arg4.field8159 || var113 > arg4.field8159 || var114 > arg4.field8159;
                            short var119 = var68.field1769[var108];
                            if (var118 < 765) {
                                if (var119 != -1 && this.method1081(this.field2232.field2384.method1386(var119, -6514).field2300)) {
                                    arg4.field8160 = 100;
                                }
                                if (var118 > 0) {
                                    if (var119 != -1) {
                                        arg4.method3305(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field9124, arg8[var109], arg8[var110], arg8[var111], var68.field1770[var109], var68.field1770[var110], var68.field1770[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field2231, this.field2231, this.field2231, var119);
                                    } else if ((var68.field1770[var109] & 16777215) != 0) {
                                        arg4.method3291(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], class89.method766((byte) -111, arg8[var109] << 24 | arg3.field9124, var68.field1770[var109]), class89.method766((byte) -98, arg8[var110] << 24 | arg3.field9124, var68.field1770[var110]), class89.method766((byte) -114, arg8[var111] << 24 | arg3.field9124, var68.field1770[var111]));
                                    }
                                } else if (var119 != -1) {
                                    arg4.method3293(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field1770[var109], var68.field1770[var110], var68.field1770[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field2231, this.field2231, this.field2231, var119);
                                } else if ((var68.field1770[var109] & 16777215) != 0) {
                                    arg4.method3291(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field1770[var109], var68.field1770[var110], var68.field1770[var111]);
                                }
                                arg4.field8160 = 0;
                            } else {
                                arg4.method3303(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field9124);
                            }
                        }
                    }
                    return;
                }
                for (int var120 = 0; var120 < var68.field1775; ++var120) {
                    int var121 = var120 * 3;
                    int var122 = var121 + 1;
                    int var123 = var122 + 1;
                    int var124 = arg5[var121];
                    int var125 = arg5[var122];
                    int var126 = arg5[var123];
                    int var127 = arg6[var121];
                    int var128 = arg6[var122];
                    int var129 = arg6[var123];
                    int var130 = arg8[var121] + arg8[var122] + arg8[var123];
                    if ((var124 - var125) * (var129 - var128) - (var126 - var125) * (var127 - var128) > 0) {
                        arg4.field8169 = var124 < 0 || var125 < 0 || var126 < 0 || var124 > arg4.field8159 || var125 > arg4.field8159 || var126 > arg4.field8159;
                        if (var130 < 765) {
                            if (var130 > 0) {
                                if ((var68.field1770[var121] & 16777215) != 0) {
                                    arg4.method3291(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], class148.method1058(arg3.field9124, arg8[var121], var68.field1770[var121], -79), class148.method1058(arg3.field9124, arg8[var122], var68.field1770[var122], -78), class148.method1058(arg3.field9124, arg8[var123], var68.field1770[var123], -43));
                                }
                            } else if ((var68.field1770[var121] & 16777215) != 0) {
                                arg4.method3291(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], var68.field1770[var121], var68.field1770[var122], var68.field1770[var123]);
                            }
                        } else {
                            arg4.method3303(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], arg3.field9124);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(III[[ZZ)V")
    public final void method445(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class140 var6 = this.field2232.field3006;
        this.field2231 = -1;
        this.field2225 = var6.field2054;
        this.field2226 = var6.field2057;
        this.field2228 = var6.field2059;
        this.field2233 = var6.field2048;
        this.field2230 = var6.field2078;
        this.field2236 = var6.field2052;
        this.field2219 = var6.field2068;
        this.field2234 = var6.field2070;
        this.field2224 = var6.field2050;
        this.field2217 = var6.field2073;
        this.field2229 = var6.field2060;
        this.field2237 = var6.field2079;
        for (int var7 = 0; var7 < arg2 + arg2; ++var7) {
            for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - arg2 + var7;
                    int var10 = arg1 - arg2 + var8;
                    if (var9 >= 0 && var9 < super.field631 && var10 >= 0 && var10 < super.field632) {
                        this.method439(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Ltea;IIII[[I[[II)V")
    public class155(class214 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field2232 = arg0;
        this.field2218 = arg2;
        this.field2223 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field2232.field3005 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field2232.field2995 * var18 + this.field2232.field2993 * var16 + this.field2232.field2989 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field2223[var11][var10] = (byte) var20;
            }
        }
        this.field2227 = new byte[arg3 + 1][arg4 + 1];
    }
}
