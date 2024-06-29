import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class137 extends class280 {

    @OriginalMember(owner = "client!vr", name = "I", descriptor = "I")
    private int field1843 = -1;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "Liw;")
    private class316 field1834;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
    private int field1841;

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "[[B")
    private byte[][] field1837;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "[[B")
    private byte[][] field1835;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "F")
    private float field1825;

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "F")
    private float field1828;

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "F")
    private float field1829;

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "F")
    private float field1830;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "F")
    private float field1832;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "F")
    private float field1833;

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "F")
    private float field1836;

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "F")
    private float field1838;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "F")
    private float field1839;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "F")
    private float field1840;

    @OriginalMember(owner = "client!vr", name = "J", descriptor = "F")
    private float field1844;

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "F")
    private float field1845;

    @OriginalMember(owner = "client!vr", name = "L", descriptor = "[[Lri;")
    private class113[][] field1846;

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "[[Lifa;")
    private class428[][] field1831;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "[[Lmaa;")
    private class472[][] field1842;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "[[Lur;")
    private class539[][] field1826;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "[[Lwda;")
    private class641[][] field1827;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method957(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field1831 == null) {
            this.field1831 = new class428[super.field3963][super.field3962];
            this.field1826 = new class539[super.field3963][super.field3962];
        } else if (this.field1846 != null || this.field1827 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3965 != var20 || var21 != 0 && super.field3965 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class539 var22 = new class539();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field7696 = var23;
            var22.field7706 = new short[var23];
            var22.field7700 = new short[var23];
            var22.field7698 = new short[var23];
            var22.field7697 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var32 = arg2[var25];
                int var33 = arg4[var25];
                if (var32 == 0 && var33 == 0) {
                    var22.field7706[var25] = (short) (this.field1837[arg0][arg1] - this.field1835[arg0][arg1]);
                } else if (var32 == 0 && super.field3965 == var33) {
                    var22.field7706[var25] = (short) (this.field1837[arg0][arg1 + 1] - this.field1835[arg0][arg1 + 1]);
                } else if (super.field3965 == var32 && super.field3965 == var33) {
                    var22.field7706[var25] = (short) (this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1]);
                } else if (super.field3965 == var32 && var33 == 0) {
                    var22.field7706[var25] = (short) (this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1]);
                } else {
                    int var34 = (this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1]) * var32 + (this.field1837[arg0][arg1] - this.field1835[arg0][arg1]) * (super.field3965 - var32);
                    int var35 = (this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1]) * var32 + (this.field1837[arg0][arg1 + 1] - this.field1835[arg0][arg1 + 1]) * (super.field3965 - var32);
                    var22.field7706[var25] = (short) ((super.field3965 - var33) * var34 + var33 * var35 >> super.field3955 * 2);
                }
                int var36 = (arg0 << super.field3955) + var32;
                int var37 = (arg1 << super.field3955) + var33;
                var22.field7700[var25] = (short) var32;
                var22.field7697[var25] = (short) var33;
                var22.field7698[var25] = (short) (this.method1786(var37, (byte) 113, var36) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field7706[var25] < 2) {
                    var22.field7706[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                int var30 = arg11[var28];
                if (var30 != -1) {
                    class293 var31 = this.field1834.field849.method1124((byte) -105, var30);
                    if (!var31.field4184) {
                        var26 = true;
                        if (this.method962(var31.field4185) || var31.field4188 != 0 || var31.field4171 != 0) {
                            var22.field7699 = (byte) (var22.field7699 | 4);
                        }
                    }
                }
            }
            var22.field7705 = new int[var27];
            if (arg10 != null) {
                var22.field7694 = new int[var27];
            }
            var22.field7695 = new short[var27];
            var22.field7704 = new short[var27];
            var22.field7703 = new short[var27];
            if (var26) {
                var22.field7702 = new short[var27];
                var22.field7693 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field7705[var22.field7701] = class139.method982(arg9[var29], -16614);
                    } else {
                        var22.field7705[var22.field7701] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field7694[var22.field7701] = class139.method982(arg10[var29], -16614);
                        } else {
                            var22.field7694[var22.field7701] = -1;
                        }
                    }
                    var22.field7695[var22.field7701] = (short) arg6[var29];
                    var22.field7704[var22.field7701] = (short) arg7[var29];
                    var22.field7703[var22.field7701] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field1834.field849.method1124((byte) 49, arg11[var29]).field4184) {
                            var22.field7702[var22.field7701] = (short) arg11[var29];
                            var22.field7693[var22.field7701] = (short) arg12[var29];
                        } else {
                            var22.field7702[var22.field7701] = -1;
                        }
                    }
                    ++var22.field7701;
                }
            }
            this.field1826[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class428 var38 = new class428();
                int var39 = arg9[0];
                int var40 = arg11[0];
                if (arg10 != null) {
                    var38.field6344 = class22.method120(class139.method982(arg10[0], -16614), this.field1837[arg0][arg1] - this.field1835[arg0][arg1], (byte) -127);
                    if (var39 == -1) {
                        var38.field6345 = (byte) (var38.field6345 | 2);
                    }
                }
                if (super.field3968[arg0 + 1][arg1] == super.field3968[arg0][arg1] && super.field3968[arg0 + 1][arg1 + 1] == super.field3968[arg0][arg1] && super.field3968[arg0][arg1 + 1] == super.field3968[arg0][arg1]) {
                    var38.field6345 = (byte) (var38.field6345 | 1);
                }
                class293 var41 = null;
                if (var40 != -1) {
                    var41 = this.field1834.field849.method1124((byte) 59, var40);
                }
                if (var41 != null && (var38.field6345 & 2) == 0 && !var41.field4184) {
                    var38.field6339 = (short) (this.field1837[arg0][arg1] - this.field1835[arg0][arg1]);
                    var38.field6343 = (short) (this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1]);
                    var38.field6342 = (short) (this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1]);
                    var38.field6340 = (short) (this.field1837[arg0][arg1 + 1] - this.field1835[arg0][arg1 + 1]);
                    var38.field6341 = (short) var40;
                    if (this.method962(var41.field4185) || var41.field4188 != 0 || var41.field4171 != 0) {
                        var38.field6345 = (byte) (var38.field6345 | 4);
                    }
                } else {
                    short var42 = class139.method982(var39, -16614);
                    var38.field6339 = (short) class22.method120(var42, this.field1837[arg0][arg1] - this.field1835[arg0][arg1], (byte) -128);
                    var38.field6343 = (short) class22.method120(var42, this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1], (byte) -127);
                    var38.field6342 = (short) class22.method120(var42, this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1], (byte) -127);
                    var38.field6340 = (short) class22.method120(var42, this.field1837[arg0][arg1 + 1] - this.field1835[arg0][arg1 + 1], (byte) -127);
                    var38.field6341 = -1;
                }
                this.field1831[arg0][arg1] = var38;
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)I")
    private static final int method958(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILil;[I[I[I[II)V")
    private final void method959(int arg0, int arg1, class7 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int arg7) {
        class428 var9 = this.field1831[arg0][arg1];
        if (var9 != null) {
            if ((var9.field6345 & 2) == 0) {
                if (arg7 != 0) {
                    if ((var9.field6345 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                int var10 = super.field3965 * arg0;
                int var11 = super.field3965 + var10;
                int var12 = super.field3965 * arg1;
                int var13 = super.field3965 + var12;
                float var16;
                float var17;
                float var18;
                float var19;
                int var23;
                int var25;
                int var27;
                int var29;
                int var31;
                int var33;
                int var35;
                int var37;
                if ((var9.field6345 & 1) != 0) {
                    int var14 = super.field3968[arg0][arg1];
                    float var15 = (float) var14 * this.field1829;
                    if (this.field1843 == -1) {
                        var16 = (float) var12 * this.field1844 + (float) var10 * this.field1839 + var15 + this.field1828;
                        if (var16 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var17 = (float) var12 * this.field1844 + (float) var11 * this.field1839 + var15 + this.field1828;
                        if (var17 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var18 = (float) var13 * this.field1844 + (float) var11 * this.field1839 + var15 + this.field1828;
                        if (var18 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var19 = (float) var13 * this.field1844 + (float) var10 * this.field1839 + var15 + this.field1828;
                        if (var19 <= (float) this.field1834.field4494) {
                            return;
                        }
                    } else {
                        var16 = (float) var12 * this.field1844 + (float) var10 * this.field1839 + var15 + this.field1828;
                        var17 = (float) var12 * this.field1844 + (float) var11 * this.field1839 + var15 + this.field1828;
                        var18 = (float) var13 * this.field1844 + (float) var11 * this.field1839 + var15 + this.field1828;
                        var19 = (float) var13 * this.field1844 + (float) var10 * this.field1839 + var15 + this.field1828;
                    }
                    float var20 = (float) var14 * this.field1825;
                    float var21 = (float) var14 * this.field1845;
                    if (this.field1843 == -1) {
                        float var22 = (float) var12 * this.field1836 + (float) var10 * this.field1830 + var20 + this.field1838;
                        var23 = (int) ((float) this.field1834.field4484 * var22 / var16) + arg2.field61;
                        float var24 = (float) var12 * this.field1833 + (float) var10 * this.field1832 + var21 + this.field1840;
                        var25 = (int) ((float) this.field1834.field4508 * var24 / var16) + arg2.field65;
                        float var26 = (float) var12 * this.field1836 + (float) var11 * this.field1830 + var20 + this.field1838;
                        var27 = (int) ((float) this.field1834.field4484 * var26 / var17) + arg2.field61;
                        float var28 = (float) var12 * this.field1833 + (float) var11 * this.field1832 + var21 + this.field1840;
                        var29 = (int) ((float) this.field1834.field4508 * var28 / var17) + arg2.field65;
                        float var30 = (float) var13 * this.field1836 + (float) var11 * this.field1830 + var20 + this.field1838;
                        var31 = (int) ((float) this.field1834.field4484 * var30 / var18) + arg2.field61;
                        float var32 = (float) var13 * this.field1833 + (float) var11 * this.field1832 + var21 + this.field1840;
                        var33 = (int) ((float) this.field1834.field4508 * var32 / var18) + arg2.field65;
                        float var34 = (float) var13 * this.field1836 + (float) var10 * this.field1830 + var20 + this.field1838;
                        var35 = (int) ((float) this.field1834.field4484 * var34 / var19) + arg2.field61;
                        float var36 = (float) var13 * this.field1833 + (float) var10 * this.field1832 + var21 + this.field1840;
                        var37 = (int) ((float) this.field1834.field4508 * var36 / var19) + arg2.field65;
                    } else {
                        float var38 = (float) var12 * this.field1836 + (float) var10 * this.field1830 + var20 + this.field1838;
                        var23 = (int) ((float) this.field1834.field4484 * var38 / (float) this.field1843) + arg2.field61;
                        float var39 = (float) var12 * this.field1833 + (float) var10 * this.field1832 + var21 + this.field1840;
                        var25 = (int) ((float) this.field1834.field4508 * var39 / (float) this.field1843) + arg2.field65;
                        float var40 = (float) var12 * this.field1836 + (float) var11 * this.field1830 + var20 + this.field1838;
                        var27 = (int) ((float) this.field1834.field4484 * var40 / (float) this.field1843) + arg2.field61;
                        float var41 = (float) var12 * this.field1833 + (float) var11 * this.field1832 + var21 + this.field1840;
                        var29 = (int) ((float) this.field1834.field4508 * var41 / (float) this.field1843) + arg2.field65;
                        float var42 = (float) var13 * this.field1836 + (float) var11 * this.field1830 + var20 + this.field1838;
                        var31 = (int) ((float) this.field1834.field4484 * var42 / (float) this.field1843) + arg2.field61;
                        float var43 = (float) var13 * this.field1833 + (float) var11 * this.field1832 + var21 + this.field1840;
                        var33 = (int) ((float) this.field1834.field4508 * var43 / (float) this.field1843) + arg2.field65;
                        float var44 = (float) var13 * this.field1836 + (float) var10 * this.field1830 + var20 + this.field1838;
                        var35 = (int) ((float) this.field1834.field4484 * var44 / (float) this.field1843) + arg2.field61;
                        float var45 = (float) var13 * this.field1833 + (float) var10 * this.field1832 + var21 + this.field1840;
                        var37 = (int) ((float) this.field1834.field4508 * var45 / (float) this.field1843) + arg2.field65;
                    }
                } else {
                    int var46 = super.field3968[arg0][arg1];
                    int var47 = super.field3968[arg0 + 1][arg1];
                    int var48 = super.field3968[arg0 + 1][arg1 + 1];
                    int var49 = super.field3968[arg0][arg1 + 1];
                    if (this.field1843 == -1) {
                        var16 = (float) var12 * this.field1844 + (float) var10 * this.field1839 + (float) var46 * this.field1829 + this.field1828;
                        if (var16 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var17 = (float) var12 * this.field1844 + (float) var11 * this.field1839 + (float) var47 * this.field1829 + this.field1828;
                        if (var17 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var18 = (float) var13 * this.field1844 + (float) var11 * this.field1839 + (float) var48 * this.field1829 + this.field1828;
                        if (var18 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var19 = (float) var13 * this.field1844 + (float) var10 * this.field1839 + (float) var49 * this.field1829 + this.field1828;
                        if (var19 <= (float) this.field1834.field4494) {
                            return;
                        }
                        float var50 = (float) var12 * this.field1836 + (float) var10 * this.field1830 + (float) var46 * this.field1825 + this.field1838;
                        var23 = (int) ((float) this.field1834.field4484 * var50 / var16) + arg2.field61;
                        float var51 = (float) var12 * this.field1833 + (float) var10 * this.field1832 + (float) var46 * this.field1845 + this.field1840;
                        var25 = (int) ((float) this.field1834.field4508 * var51 / var16) + arg2.field65;
                        float var52 = (float) var12 * this.field1836 + (float) var11 * this.field1830 + (float) var47 * this.field1825 + this.field1838;
                        var27 = (int) ((float) this.field1834.field4484 * var52 / var17) + arg2.field61;
                        float var53 = (float) var12 * this.field1833 + (float) var11 * this.field1832 + (float) var47 * this.field1845 + this.field1840;
                        var29 = (int) ((float) this.field1834.field4508 * var53 / var17) + arg2.field65;
                        float var54 = (float) var13 * this.field1836 + (float) var11 * this.field1830 + (float) var48 * this.field1825 + this.field1838;
                        var31 = (int) ((float) this.field1834.field4484 * var54 / var18) + arg2.field61;
                        float var55 = (float) var13 * this.field1833 + (float) var11 * this.field1832 + (float) var48 * this.field1845 + this.field1840;
                        var33 = (int) ((float) this.field1834.field4508 * var55 / var18) + arg2.field65;
                        float var56 = (float) var13 * this.field1836 + (float) var10 * this.field1830 + (float) var49 * this.field1825 + this.field1838;
                        var35 = (int) ((float) this.field1834.field4484 * var56 / var19) + arg2.field61;
                        float var57 = (float) var13 * this.field1833 + (float) var10 * this.field1832 + (float) var49 * this.field1845 + this.field1840;
                        var37 = (int) ((float) this.field1834.field4508 * var57 / var19) + arg2.field65;
                    } else {
                        var16 = (float) var12 * this.field1844 + (float) var10 * this.field1839 + (float) var46 * this.field1829 + this.field1828;
                        var17 = (float) var12 * this.field1844 + (float) var11 * this.field1839 + (float) var47 * this.field1829 + this.field1828;
                        var18 = (float) var13 * this.field1844 + (float) var11 * this.field1839 + (float) var48 * this.field1829 + this.field1828;
                        var19 = (float) var13 * this.field1844 + (float) var10 * this.field1839 + (float) var49 * this.field1829 + this.field1828;
                        float var58 = (float) var12 * this.field1836 + (float) var10 * this.field1830 + (float) var46 * this.field1825 + this.field1838;
                        var23 = (int) ((float) this.field1834.field4484 * var58 / (float) this.field1843) + arg2.field61;
                        float var59 = (float) var12 * this.field1833 + (float) var10 * this.field1832 + (float) var46 * this.field1845 + this.field1840;
                        var25 = (int) ((float) this.field1834.field4508 * var59 / (float) this.field1843) + arg2.field65;
                        float var60 = (float) var12 * this.field1836 + (float) var11 * this.field1830 + (float) var47 * this.field1825 + this.field1838;
                        var27 = (int) ((float) this.field1834.field4484 * var60 / (float) this.field1843) + arg2.field61;
                        float var61 = (float) var12 * this.field1833 + (float) var11 * this.field1832 + (float) var47 * this.field1845 + this.field1840;
                        var29 = (int) ((float) this.field1834.field4508 * var61 / (float) this.field1843) + arg2.field65;
                        float var62 = (float) var13 * this.field1836 + (float) var11 * this.field1830 + (float) var48 * this.field1825 + this.field1838;
                        var31 = (int) ((float) this.field1834.field4484 * var62 / (float) this.field1843) + arg2.field61;
                        float var63 = (float) var13 * this.field1833 + (float) var11 * this.field1832 + (float) var48 * this.field1845 + this.field1840;
                        var33 = (int) ((float) this.field1834.field4508 * var63 / (float) this.field1843) + arg2.field65;
                        float var64 = (float) var13 * this.field1836 + (float) var10 * this.field1830 + (float) var49 * this.field1825 + this.field1838;
                        var35 = (int) ((float) this.field1834.field4484 * var64 / (float) this.field1843) + arg2.field61;
                        float var65 = (float) var13 * this.field1833 + (float) var10 * this.field1832 + (float) var49 * this.field1845 + this.field1840;
                        var37 = (int) ((float) this.field1834.field4508 * var65 / (float) this.field1843) + arg2.field65;
                    }
                }
                if (this.field1843 == -1) {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field69 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field70 || var35 > arg2.field70 || var27 > arg2.field70;
                        if (var9.field6341 >= 0) {
                            arg2.method37((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class9.field141[var9.field6342 & 65535] & 16777215, -16777216 | class9.field141[var9.field6340 & 65535] & 16777215, -16777216 | class9.field141[var9.field6343 & 65535] & 16777215, 0, 0, 0, 0, var9.field6341);
                        } else {
                            arg2.method48((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field6342 & 65535), (float) (var9.field6340 & 65535), (float) (var9.field6343 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field69 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field70 || var27 > arg2.field70 || var35 > arg2.field70;
                        if (var9.field6341 >= 0) {
                            arg2.method37((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class9.field141[var9.field6339 & 65535] & 16777215, -16777216 | class9.field141[var9.field6343 & 65535] & 16777215, -16777216 | class9.field141[var9.field6340 & 65535] & 16777215, 0, 0, 0, 0, var9.field6341);
                            return;
                        }
                        arg2.method48((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field6339 & 65535), (float) (var9.field6343 & 65535), (float) (var9.field6340 & 65535));
                        return;
                    }
                } else {
                    if ((var29 - var37) * (var31 - var35) - (var27 - var35) * (var33 - var37) > 0) {
                        arg2.field69 = var31 < 0 || var35 < 0 || var27 < 0 || var31 > arg2.field70 || var35 > arg2.field70 || var27 > arg2.field70;
                        if (var9.field6341 >= 0) {
                            arg2.method37((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, var18, var19, var17, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | class9.field141[var9.field6342 & 65535] & 16777215, -16777216 | class9.field141[var9.field6340 & 65535] & 16777215, -16777216 | class9.field141[var9.field6343 & 65535] & 16777215, 0, 0, 0, 0, var9.field6341);
                        } else {
                            arg2.method48((float) var33, (float) var37, (float) var29, (float) var31, (float) var35, (float) var27, (float) ((int) var18), (float) ((int) var19), (float) ((int) var17), (float) (var9.field6342 & 65535), (float) (var9.field6340 & 65535), (float) (var9.field6343 & 65535));
                        }
                    }
                    if ((var23 - var27) * (var37 - var29) - (var25 - var29) * (var35 - var27) > 0) {
                        arg2.field69 = var23 < 0 || var27 < 0 || var35 < 0 || var23 > arg2.field70 || var27 > arg2.field70 || var35 > arg2.field70;
                        if (var9.field6341 >= 0) {
                            arg2.method37((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, var16, var17, var19, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | class9.field141[var9.field6339 & 65535] & 16777215, -16777216 | class9.field141[var9.field6343 & 65535] & 16777215, -16777216 | class9.field141[var9.field6340 & 65535] & 16777215, 0, 0, 0, 0, var9.field6341);
                            return;
                        }
                        arg2.method48((float) var25, (float) var29, (float) var37, (float) var23, (float) var27, (float) var35, (float) ((int) var16), (float) ((int) var17), (float) ((int) var19), (float) (var9.field6339 & 65535), (float) (var9.field6343 & 65535), (float) (var9.field6340 & 65535));
                    }
                }
            }
        } else {
            class539 var66 = this.field1826[arg0][arg1];
            if (var66 != null) {
                if (arg7 != 0) {
                    if ((var66.field7699 & 4) != 0) {
                        if ((arg7 & 1) != 0) {
                            return;
                        }
                    } else if ((arg7 & 2) != 0) {
                        return;
                    }
                }
                if (this.field1843 == -1) {
                    for (int var67 = 0; var67 < var66.field7696; ++var67) {
                        int var68 = (arg0 << super.field3955) + var66.field7700[var67];
                        short var69 = var66.field7698[var67];
                        int var70 = (arg1 << super.field3955) + var66.field7697[var67];
                        float var71 = (float) var70 * this.field1844 + (float) var68 * this.field1839 + (float) var69 * this.field1829 + this.field1828;
                        if (var71 <= (float) this.field1834.field4494) {
                            return;
                        }
                        float var72 = (float) var70 * this.field1836 + (float) var68 * this.field1830 + (float) var69 * this.field1825 + this.field1838;
                        float var73 = (float) var70 * this.field1833 + (float) var68 * this.field1832 + (float) var69 * this.field1845 + this.field1840;
                        arg3[var67] = (int) ((float) this.field1834.field4484 * var72 / var71) + arg2.field61;
                        arg4[var67] = (int) ((float) this.field1834.field4508 * var73 / var71) + arg2.field65;
                        arg5[var67] = (int) var71;
                    }
                } else {
                    for (int var74 = 0; var74 < var66.field7696; ++var74) {
                        int var110 = (arg0 << super.field3955) + var66.field7700[var74];
                        short var111 = var66.field7698[var74];
                        int var112 = (arg1 << super.field3955) + var66.field7697[var74];
                        float var113 = (float) var112 * this.field1844 + (float) var110 * this.field1839 + (float) var111 * this.field1829 + this.field1828;
                        float var114 = (float) var112 * this.field1836 + (float) var110 * this.field1830 + (float) var111 * this.field1825 + this.field1838;
                        float var115 = (float) var112 * this.field1833 + (float) var110 * this.field1832 + (float) var111 * this.field1845 + this.field1840;
                        arg3[var74] = (int) ((float) this.field1834.field4484 * var114 / (float) this.field1843) + arg2.field61;
                        arg4[var74] = (int) ((float) this.field1834.field4508 * var115 / (float) this.field1843) + arg2.field65;
                        arg5[var74] = (int) var113;
                    }
                }
                if (var66.field7702 != null) {
                    if (this.field1843 == -1) {
                        for (int var75 = 0; var75 < var66.field7701; ++var75) {
                            short var76 = var66.field7695[var75];
                            short var77 = var66.field7704[var75];
                            short var78 = var66.field7703[var75];
                            int var79 = arg3[var76];
                            int var80 = arg3[var77];
                            int var81 = arg3[var78];
                            int var82 = arg4[var76];
                            int var83 = arg4[var77];
                            int var84 = arg4[var78];
                            if ((var79 - var80) * (var84 - var83) - (var81 - var80) * (var82 - var83) > 0) {
                                arg2.field69 = var79 < 0 || var80 < 0 || var81 < 0 || var79 > arg2.field70 || var80 > arg2.field70 || var81 > arg2.field70;
                                short var85 = var66.field7702[var75];
                                if (var85 != -1) {
                                    arg2.method37((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) var66.field7700[var76] / (float) super.field3965, (float) var66.field7700[var77] / (float) super.field3965, (float) var66.field7700[var78] / (float) super.field3965, (float) var66.field7697[var76] / (float) super.field3965, (float) var66.field7697[var77] / (float) super.field3965, (float) var66.field7697[var78] / (float) super.field3965, -16777216 | class9.field141[var66.field7706[var76] & 65535] & 16777215, -16777216 | class9.field141[var66.field7706[var77] & 65535] & 16777215, -16777216 | class9.field141[var66.field7706[var78] & 65535] & 16777215, 0, 0, 0, 0, var85);
                                } else {
                                    int var86 = var66.field7705[var75];
                                    if (var86 != -1) {
                                        arg2.method48((float) var82, (float) var83, (float) var84, (float) var79, (float) var80, (float) var81, (float) arg5[var76], (float) arg5[var77], (float) arg5[var78], (float) class22.method120(var86, var66.field7706[var76], (byte) -125), (float) class22.method120(var86, var66.field7706[var77], (byte) -128), (float) class22.method120(var86, var66.field7706[var78], (byte) -126));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var87 = 0; var87 < var66.field7701; ++var87) {
                        short var88 = var66.field7695[var87];
                        short var89 = var66.field7704[var87];
                        short var90 = var66.field7703[var87];
                        int var91 = arg3[var88];
                        int var92 = arg3[var89];
                        int var93 = arg3[var90];
                        int var94 = arg4[var88];
                        int var95 = arg4[var89];
                        int var96 = arg4[var90];
                        if ((var91 - var92) * (var96 - var95) - (var93 - var92) * (var94 - var95) > 0) {
                            arg2.field69 = var91 < 0 || var92 < 0 || var93 < 0 || var91 > arg2.field70 || var92 > arg2.field70 || var93 > arg2.field70;
                            short var97 = var66.field7702[var87];
                            if (var97 != -1) {
                                arg2.method37((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) var66.field7700[var88] / (float) super.field3965, (float) var66.field7700[var89] / (float) super.field3965, (float) var66.field7700[var90] / (float) super.field3965, (float) var66.field7697[var88] / (float) super.field3965, (float) var66.field7697[var89] / (float) super.field3965, (float) var66.field7697[var90] / (float) super.field3965, -16777216 | class9.field141[var66.field7706[var88] & 65535] & 16777215, -16777216 | class9.field141[var66.field7706[var89] & 65535] & 16777215, -16777216 | class9.field141[var66.field7706[var90] & 65535] & 16777215, 0, 0, 0, 0, var97);
                            } else {
                                int var98 = var66.field7705[var87];
                                if (var98 != -1) {
                                    arg2.method48((float) var94, (float) var95, (float) var96, (float) var91, (float) var92, (float) var93, (float) arg5[var88], (float) arg5[var89], (float) arg5[var90], (float) class22.method120(var98, var66.field7706[var88], (byte) -126), (float) class22.method120(var98, var66.field7706[var89], (byte) -126), (float) class22.method120(var98, var66.field7706[var90], (byte) -127));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var99 = 0; var99 < var66.field7701; ++var99) {
                    short var100 = var66.field7695[var99];
                    short var101 = var66.field7704[var99];
                    short var102 = var66.field7703[var99];
                    int var103 = arg3[var100];
                    int var104 = arg3[var101];
                    int var105 = arg3[var102];
                    int var106 = arg4[var100];
                    int var107 = arg4[var101];
                    int var108 = arg4[var102];
                    if ((var103 - var104) * (var108 - var107) - (var105 - var104) * (var106 - var107) > 0) {
                        int var109 = var66.field7705[var99];
                        if (var109 != -1) {
                            arg2.field69 = var103 < 0 || var104 < 0 || var105 < 0 || var103 > arg2.field70 || var104 > arg2.field70 || var105 > arg2.field70;
                            arg2.method48((float) var106, (float) var107, (float) var108, (float) var103, (float) var104, (float) var105, (float) arg5[var100], (float) arg5[var101], (float) arg5[var102], (float) class22.method120(var109, var66.field7706[var100], (byte) -125), (float) class22.method120(var109, var66.field7706[var101], (byte) -128), (float) class22.method120(var109, var66.field7706[var102], (byte) -124));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
    public final void method960(int arg0, int arg1) {
        this.method971(arg0, arg1, 0);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIZLmd;Lil;[I[I[I[II)V")
    private final void method961(int arg0, int arg1, boolean arg2, class545 arg3, class7 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class641 var11 = this.field1827[arg0][arg1];
        if (arg9 == 0 || (arg9 & 2) == 0) {
            if (var11 != null) {
                if (this.field1843 == -1) {
                    for (int var12 = 0; var12 < var11.field8999; ++var12) {
                        int var13 = (arg0 << super.field3955) + var11.field9000[var12];
                        int var14 = var11.field8991[var12];
                        int var15 = (arg1 << super.field3955) + var11.field8997[var12];
                        float var16 = (float) var15 * this.field1844 + (float) var13 * this.field1839 + (float) var14 * this.field1829 + this.field1828;
                        if (var16 <= (float) this.field1834.field4494) {
                            return;
                        }
                        arg8[var12] = 0;
                        if (arg2) {
                            int var17 = (int) (var16 - (float) arg3.field7753);
                            if (var17 > 255) {
                                var17 = 255;
                            }
                            if (var17 > 0) {
                                arg8[var12] = var17;
                                int var18 = var11.field8993[var12] * var17 / 255;
                                if (var18 > 0) {
                                    var14 -= var18;
                                }
                            }
                        } else if (arg3.field7755) {
                            int var19 = (int) (var16 - (float) arg3.field7753);
                            if (var19 > 0) {
                                arg8[var12] = var19;
                                if (arg8[var12] > 255) {
                                    arg8[var12] = 255;
                                }
                            }
                        }
                        float var20 = (float) var15 * this.field1836 + (float) var13 * this.field1830 + (float) var14 * this.field1825 + this.field1838;
                        float var21 = (float) var15 * this.field1833 + (float) var13 * this.field1832 + (float) var14 * this.field1845 + this.field1840;
                        arg5[var12] = (int) ((float) this.field1834.field4484 * var20 / var16) + arg4.field61;
                        arg6[var12] = (int) ((float) this.field1834.field4508 * var21 / var16) + arg4.field65;
                        arg7[var12] = (int) var16;
                    }
                } else {
                    for (int var22 = 0; var22 < var11.field8999; ++var22) {
                        int var36 = (arg0 << super.field3955) + var11.field9000[var22];
                        int var37 = var11.field8991[var22];
                        int var38 = (arg1 << super.field3955) + var11.field8997[var22];
                        float var39 = (float) var38 * this.field1844 + (float) var36 * this.field1839 + (float) var37 * this.field1829 + this.field1828;
                        arg8[var22] = 0;
                        if (arg2) {
                            int var40 = this.field1843 - arg3.field7753;
                            if (var40 > 255) {
                                var40 = 255;
                            }
                            if (var40 > 0) {
                                arg8[var22] = var40;
                                int var41 = var11.field8993[var22] * var40 / 255;
                                if (var41 > 0) {
                                    var37 -= var41;
                                }
                            }
                        } else if (arg3.field7755) {
                            int var42 = this.field1843 - arg3.field7753;
                            if (var42 > 0) {
                                arg8[var22] = var42;
                                if (arg8[var22] > 255) {
                                    arg8[var22] = 255;
                                }
                            }
                        }
                        float var43 = (float) var38 * this.field1836 + (float) var36 * this.field1830 + (float) var37 * this.field1825 + this.field1838;
                        float var44 = (float) var38 * this.field1833 + (float) var36 * this.field1832 + (float) var37 * this.field1845 + this.field1840;
                        arg5[var22] = (int) ((float) this.field1834.field4484 * var43 / (float) this.field1843) + arg4.field61;
                        arg6[var22] = (int) ((float) this.field1834.field4508 * var44 / (float) this.field1843) + arg4.field65;
                        arg7[var22] = (int) var39;
                    }
                }
                float var23 = (float) super.field3965;
                for (int var24 = 0; var24 < var11.field9001; ++var24) {
                    int var25 = var24 * 3;
                    int var26 = var25 + 1;
                    int var27 = var26 + 1;
                    int var28 = arg5[var25];
                    int var29 = arg5[var26];
                    int var30 = arg5[var27];
                    int var31 = arg6[var25];
                    int var32 = arg6[var26];
                    int var33 = arg6[var27];
                    if ((var28 - var29) * (var33 - var32) - (var30 - var29) * (var31 - var32) > 0) {
                        arg4.field69 = var28 < 0 || var29 < 0 || var30 < 0 || var28 > arg4.field70 || var29 > arg4.field70 || var30 > arg4.field70;
                        if (arg8[var25] + arg8[var26] + arg8[var27] < 765) {
                            int var34 = arg0 << super.field3955;
                            int var35 = arg1 << super.field3955;
                            if ((var11.field8995[var25] & 16777215) != 0) {
                                if (var11.field8994[var25] == var11.field8994[var26] && var11.field8994[var25] == var11.field8994[var27] && var11.field8992[var25] == var11.field8992[var26] && var11.field8992[var25] == var11.field8992[var27]) {
                                    arg4.method37((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field9000[var25] + var34) / (float) var11.field8992[var25], (float) (var11.field9000[var26] + var34) / (float) var11.field8992[var26], (float) (var11.field9000[var27] + var34) / (float) var11.field8992[var27], (float) (var11.field8997[var25] + var35) / (float) var11.field8992[var25], (float) (var11.field8997[var26] + var35) / (float) var11.field8992[var26], (float) (var11.field8997[var27] + var35) / (float) var11.field8992[var27], var11.field8995[var25], var11.field8995[var26], var11.field8995[var27], arg3.field7758, arg8[var25], arg8[var26], arg8[var27], var11.field8994[var25]);
                                } else {
                                    arg4.method39((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], (float) (var11.field9000[var25] + var34) / var23, (float) (var11.field9000[var26] + var34) / var23, (float) (var11.field9000[var27] + var34) / var23, (float) (var11.field8997[var25] + var35) / var23, (float) (var11.field8997[var26] + var35) / var23, (float) (var11.field8997[var27] + var35) / var23, var11.field8995[var25], var11.field8995[var26], var11.field8995[var27], arg3.field7758, arg8[var25], arg8[var26], arg8[var27], var11.field8994[var25], var23 / (float) var11.field8992[var25], var11.field8994[var26], var23 / (float) var11.field8992[var26], var11.field8994[var27], var23 / (float) var11.field8992[var27]);
                                }
                            }
                        } else {
                            arg4.method44((float) var31, (float) var32, (float) var33, (float) var28, (float) var29, (float) var30, (float) arg7[var25], (float) arg7[var26], (float) arg7[var27], arg3.field7758);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)Z")
    private final boolean method962(int arg0) {
        if ((this.field1841 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!vr", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method963(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method964(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIII[[ZLmd;Lil;[I[I)V")
    private final void method965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class545 arg8, class7 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7759;
        this.field1834.method463(false);
        arg9.field67 = false;
        arg9.field71 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field1846 != null) {
                        if (this.field1846[var18][var19] != null) {
                            class113 var20 = this.field1846[var18][var19];
                            if (var20.field1568 != -1 && (var20.field1570 & 2) == 0 && var20.field1566 == 0) {
                                int var21 = this.field1834.method2002(var20.field1568);
                                arg9.method48((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class22.method120(var21, var20.field1572, (byte) -128), (float) class22.method120(var21, var20.field1569, (byte) -124), (float) class22.method120(var21, var20.field1574, (byte) -126));
                                arg9.method48((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class22.method120(var21, var20.field1573, (byte) -128), (float) class22.method120(var21, var20.field1574, (byte) -125), (float) class22.method120(var21, var20.field1569, (byte) -124));
                            } else if (var20.field1566 == 0) {
                                arg9.method47((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, var20.field1572, var20.field1569, var20.field1574);
                                arg9.method47((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, var20.field1573, var20.field1574, var20.field1569);
                            } else {
                                int var22 = var20.field1566;
                                arg9.method47((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, class322.method2048(var20.field1572 & -16777216, (byte) 127, var22), class322.method2048(var20.field1569 & -16777216, (byte) 94, var22), class322.method2048(var20.field1574 & -16777216, (byte) 124, var22));
                                arg9.method47((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, class322.method2048(var20.field1573 & -16777216, (byte) 123, var22), class322.method2048(var20.field1574 & -16777216, (byte) 109, var22), class322.method2048(var20.field1569 & -16777216, (byte) 89, var22));
                            }
                        } else if (this.field1842[var18][var19] != null) {
                            class472 var23 = this.field1842[var18][var19];
                            for (int var24 = 0; var24 < var23.field6871; ++var24) {
                                arg10[var24] = var23.field6876[var24] * var14 / super.field3965 + var16;
                                arg11[var24] = var17 - var23.field6870[var24] * var14 / super.field3965;
                            }
                            for (int var25 = 0; var25 < var23.field6872; ++var25) {
                                int var26 = var25 * 3;
                                int var27 = var26 + 1;
                                int var28 = var27 + 1;
                                int var29 = arg10[var26];
                                int var30 = arg10[var27];
                                int var31 = arg10[var28];
                                int var32 = arg11[var26];
                                int var33 = arg11[var27];
                                int var34 = arg11[var28];
                                if (var23.field6877 != null && var23.field6877[var25] != 0 && (var23.field6868 == null || var23.field6868 != null && var23.field6868[var25] == -1)) {
                                    int var35 = var23.field6877[var25];
                                    arg9.method47((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, class322.method2048(-16777216 - (var23.field6874[var26] & -16777216), (byte) 80, var35), class322.method2048(-16777216 - (var23.field6874[var27] & -16777216), (byte) 78, var35), class322.method2048(-16777216 - (var23.field6874[var28] & -16777216), (byte) 124, var35));
                                } else if (var23.field6868 != null && var23.field6868[var25] != -1) {
                                    int var36 = this.field1834.method2002(var23.field6868[var25]);
                                    arg9.method48((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) var36, (float) var36, (float) var36);
                                } else {
                                    arg9.method47((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, var23.field6874[var26], var23.field6874[var27], var23.field6874[var28]);
                                }
                            }
                        }
                    } else if (this.field1827[var18][var19] != null) {
                        class641 var37 = this.field1827[var18][var19];
                        for (int var38 = 0; var38 < var37.field8999; ++var38) {
                            arg10[var38] = var37.field9000[var38] * var14 / super.field3965 + var16;
                            arg11[var38] = var17 - var37.field8997[var38] * var14 / super.field3965;
                        }
                        for (int var39 = 0; var39 < var37.field9001; ++var39) {
                            int var40 = var39 * 3;
                            int var41 = var40 + 1;
                            int var42 = var41 + 1;
                            int var43 = arg10[var40];
                            int var44 = arg10[var41];
                            int var45 = arg10[var42];
                            int var46 = arg11[var40];
                            int var47 = arg11[var41];
                            int var48 = arg11[var42];
                            if (var37.field8996 != null && var37.field8996[var39] != 0) {
                                int var49 = var37.field8996[var39];
                                arg9.method47((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var49, var49, var49);
                            } else {
                                arg9.method47((float) var46, (float) var47, (float) var48, (float) var43, (float) var44, (float) var45, 100.0F, 100.0F, 100.0F, var37.field8995[var40], var37.field8995[var41], var37.field8995[var42]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field67 = true;
        this.field1834.method463(var15);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lraa;[I)V")
    public final void method966(class609 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!vr", name = "fa", descriptor = "(IILr;)Lr;")
    public final class183 method967(int arg0, int arg1, class183 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Liw;IIII[[I[[II)V")
    public class137(class316 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field1834 = arg0;
        this.field1841 = arg2;
        this.field1837 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1834.field4487 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1834.field4485 * var18 + this.field1834.field4499 * var16 + this.field1834.field4481 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1837[var11][var10] = (byte) var20;
            }
        }
        this.field1835 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(IIZLmd;Lil;[I[I[I[II)V")
    private final void method968(int arg0, int arg1, boolean arg2, class545 arg3, class7 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9) {
        class113 var11 = this.field1846[arg0][arg1];
        if (var11 != null) {
            if ((var11.field1570 & 2) == 0) {
                if (arg9 != 0) {
                    if ((var11.field1570 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                int var12 = super.field3965 * arg0;
                int var13 = super.field3965 + var12;
                int var14 = super.field3965 * arg1;
                int var15 = super.field3965 + var14;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                float var22;
                float var23;
                float var24;
                float var25;
                int var33;
                int var35;
                int var37;
                int var39;
                int var41;
                int var43;
                int var45;
                int var47;
                if ((var11.field1570 & 1) != 0 && !arg2) {
                    int var20 = super.field3968[arg0][arg1];
                    float var21 = (float) var20 * this.field1829;
                    if (this.field1843 == -1) {
                        var22 = (float) var14 * this.field1844 + (float) var12 * this.field1839 + var21 + this.field1828;
                        if (var22 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var23 = (float) var14 * this.field1844 + (float) var13 * this.field1839 + var21 + this.field1828;
                        if (var23 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var24 = (float) var15 * this.field1844 + (float) var13 * this.field1839 + var21 + this.field1828;
                        if (var24 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var25 = (float) var15 * this.field1844 + (float) var12 * this.field1839 + var21 + this.field1828;
                        if (var25 <= (float) this.field1834.field4494) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field1844 + (float) var12 * this.field1839 + var21 + this.field1828;
                        var23 = (float) var14 * this.field1844 + (float) var13 * this.field1839 + var21 + this.field1828;
                        var24 = (float) var15 * this.field1844 + (float) var13 * this.field1839 + var21 + this.field1828;
                        var25 = (float) var15 * this.field1844 + (float) var12 * this.field1839 + var21 + this.field1828;
                    }
                    if (arg3.field7755) {
                        int var26 = (int) (var22 - (float) arg3.field7753);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field7753);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field7753);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                        int var29 = (int) (var25 - (float) arg3.field7753);
                        if (var29 > 0) {
                            var19 = var29;
                            if (var29 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    float var30 = (float) var20 * this.field1825;
                    float var31 = (float) var20 * this.field1845;
                    if (this.field1843 == -1) {
                        float var32 = (float) var14 * this.field1836 + (float) var12 * this.field1830 + var30 + this.field1838;
                        var33 = (int) ((float) this.field1834.field4484 * var32 / var22) + arg4.field61;
                        float var34 = (float) var14 * this.field1833 + (float) var12 * this.field1832 + var31 + this.field1840;
                        var35 = (int) ((float) this.field1834.field4508 * var34 / var22) + arg4.field65;
                        float var36 = (float) var14 * this.field1836 + (float) var13 * this.field1830 + var30 + this.field1838;
                        var37 = (int) ((float) this.field1834.field4484 * var36 / var23) + arg4.field61;
                        float var38 = (float) var14 * this.field1833 + (float) var13 * this.field1832 + var31 + this.field1840;
                        var39 = (int) ((float) this.field1834.field4508 * var38 / var23) + arg4.field65;
                        float var40 = (float) var15 * this.field1836 + (float) var13 * this.field1830 + var30 + this.field1838;
                        var41 = (int) ((float) this.field1834.field4484 * var40 / var24) + arg4.field61;
                        float var42 = (float) var15 * this.field1833 + (float) var13 * this.field1832 + var31 + this.field1840;
                        var43 = (int) ((float) this.field1834.field4508 * var42 / var24) + arg4.field65;
                        float var44 = (float) var15 * this.field1836 + (float) var12 * this.field1830 + var30 + this.field1838;
                        var45 = (int) ((float) this.field1834.field4484 * var44 / var25) + arg4.field61;
                        float var46 = (float) var15 * this.field1833 + (float) var12 * this.field1832 + var31 + this.field1840;
                        var47 = (int) ((float) this.field1834.field4508 * var46 / var25) + arg4.field65;
                    } else {
                        float var48 = (float) var14 * this.field1836 + (float) var12 * this.field1830 + var30 + this.field1838;
                        var33 = (int) ((float) this.field1834.field4484 * var48 / (float) this.field1843) + arg4.field61;
                        float var49 = (float) var14 * this.field1833 + (float) var12 * this.field1832 + var31 + this.field1840;
                        var35 = (int) ((float) this.field1834.field4508 * var49 / (float) this.field1843) + arg4.field65;
                        float var50 = (float) var14 * this.field1836 + (float) var13 * this.field1830 + var30 + this.field1838;
                        var37 = (int) ((float) this.field1834.field4484 * var50 / (float) this.field1843) + arg4.field61;
                        float var51 = (float) var14 * this.field1833 + (float) var13 * this.field1832 + var31 + this.field1840;
                        var39 = (int) ((float) this.field1834.field4508 * var51 / (float) this.field1843) + arg4.field65;
                        float var52 = (float) var15 * this.field1836 + (float) var13 * this.field1830 + var30 + this.field1838;
                        var41 = (int) ((float) this.field1834.field4484 * var52 / (float) this.field1843) + arg4.field61;
                        float var53 = (float) var15 * this.field1833 + (float) var13 * this.field1832 + var31 + this.field1840;
                        var43 = (int) ((float) this.field1834.field4508 * var53 / (float) this.field1843) + arg4.field65;
                        float var54 = (float) var15 * this.field1836 + (float) var12 * this.field1830 + var30 + this.field1838;
                        var45 = (int) ((float) this.field1834.field4484 * var54 / (float) this.field1843) + arg4.field61;
                        float var55 = (float) var15 * this.field1833 + (float) var12 * this.field1832 + var31 + this.field1840;
                        var47 = (int) ((float) this.field1834.field4508 * var55 / (float) this.field1843) + arg4.field65;
                    }
                } else {
                    int var56 = super.field3968[arg0][arg1];
                    int var57 = super.field3968[arg0 + 1][arg1];
                    int var58 = super.field3968[arg0 + 1][arg1 + 1];
                    int var59 = super.field3968[arg0][arg1 + 1];
                    if (this.field1843 == -1) {
                        var22 = (float) var14 * this.field1844 + (float) var12 * this.field1839 + (float) var56 * this.field1829 + this.field1828;
                        if (var22 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var23 = (float) var14 * this.field1844 + (float) var13 * this.field1839 + (float) var57 * this.field1829 + this.field1828;
                        if (var23 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var24 = (float) var15 * this.field1844 + (float) var13 * this.field1839 + (float) var58 * this.field1829 + this.field1828;
                        if (var24 <= (float) this.field1834.field4494) {
                            return;
                        }
                        var25 = (float) var15 * this.field1844 + (float) var12 * this.field1839 + (float) var59 * this.field1829 + this.field1828;
                        if (var25 <= (float) this.field1834.field4494) {
                            return;
                        }
                    } else {
                        var22 = (float) var14 * this.field1844 + (float) var12 * this.field1839 + (float) var56 * this.field1829 + this.field1828;
                        var23 = (float) var14 * this.field1844 + (float) var13 * this.field1839 + (float) var57 * this.field1829 + this.field1828;
                        var24 = (float) var15 * this.field1844 + (float) var13 * this.field1839 + (float) var58 * this.field1829 + this.field1828;
                        var25 = (float) var15 * this.field1844 + (float) var12 * this.field1839 + (float) var59 * this.field1829 + this.field1828;
                    }
                    if (arg2) {
                        int var60 = (int) (var22 - (float) arg3.field7753);
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var16 = var60;
                            int var61 = var11.field1576 * var60 / 255;
                            if (var61 > 0) {
                                var56 -= var61;
                            }
                        }
                        int var62 = (int) (var23 - (float) arg3.field7753);
                        if (var62 > 255) {
                            var62 = 255;
                        }
                        if (var62 > 0) {
                            var17 = var62;
                            int var63 = var11.field1575 * var62 / 255;
                            if (var63 > 0) {
                                var57 -= var63;
                            }
                        }
                        int var64 = (int) (var24 - (float) arg3.field7753);
                        if (var64 > 255) {
                            var64 = 255;
                        }
                        if (var64 > 0) {
                            var18 = var64;
                            int var65 = var11.field1567 * var64 / 255;
                            if (var65 > 0) {
                                var58 -= var65;
                            }
                        }
                        int var66 = (int) (var25 - (float) arg3.field7753);
                        if (var66 > 255) {
                            var66 = 255;
                        }
                        if (var66 > 0) {
                            var19 = var66;
                            int var67 = var11.field1571 * var66 / 255;
                            if (var67 > 0) {
                                var59 -= var67;
                            }
                        }
                    } else if (arg3.field7755) {
                        int var68 = (int) (var22 - (float) arg3.field7753);
                        if (var68 > 0) {
                            var16 = var68;
                            if (var68 > 255) {
                                var16 = 255;
                            }
                        }
                        int var69 = (int) (var23 - (float) arg3.field7753);
                        if (var69 > 0) {
                            var17 = var69;
                            if (var69 > 255) {
                                var17 = 255;
                            }
                        }
                        int var70 = (int) (var24 - (float) arg3.field7753);
                        if (var70 > 0) {
                            var18 = var70;
                            if (var70 > 255) {
                                var18 = 255;
                            }
                        }
                        int var71 = (int) (var25 - (float) arg3.field7753);
                        if (var71 > 0) {
                            var19 = var71;
                            if (var71 > 255) {
                                var19 = 255;
                            }
                        }
                    }
                    if (this.field1843 == -1) {
                        float var72 = (float) var14 * this.field1836 + (float) var12 * this.field1830 + (float) var56 * this.field1825 + this.field1838;
                        var33 = (int) ((float) this.field1834.field4484 * var72 / var22) + arg4.field61;
                        float var73 = (float) var14 * this.field1833 + (float) var12 * this.field1832 + (float) var56 * this.field1845 + this.field1840;
                        var35 = (int) ((float) this.field1834.field4508 * var73 / var22) + arg4.field65;
                        float var74 = (float) var14 * this.field1836 + (float) var13 * this.field1830 + (float) var57 * this.field1825 + this.field1838;
                        var37 = (int) ((float) this.field1834.field4484 * var74 / var23) + arg4.field61;
                        float var75 = (float) var14 * this.field1833 + (float) var13 * this.field1832 + (float) var57 * this.field1845 + this.field1840;
                        var39 = (int) ((float) this.field1834.field4508 * var75 / var23) + arg4.field65;
                        float var76 = (float) var15 * this.field1836 + (float) var13 * this.field1830 + (float) var58 * this.field1825 + this.field1838;
                        var41 = (int) ((float) this.field1834.field4484 * var76 / var24) + arg4.field61;
                        float var77 = (float) var15 * this.field1833 + (float) var13 * this.field1832 + (float) var58 * this.field1845 + this.field1840;
                        var43 = (int) ((float) this.field1834.field4508 * var77 / var24) + arg4.field65;
                        float var78 = (float) var15 * this.field1836 + (float) var12 * this.field1830 + (float) var59 * this.field1825 + this.field1838;
                        var45 = (int) ((float) this.field1834.field4484 * var78 / var25) + arg4.field61;
                        float var79 = (float) var15 * this.field1833 + (float) var12 * this.field1832 + (float) var59 * this.field1845 + this.field1840;
                        var47 = (int) ((float) this.field1834.field4508 * var79 / var25) + arg4.field65;
                    } else {
                        float var80 = (float) var14 * this.field1836 + (float) var12 * this.field1830 + (float) var56 * this.field1825 + this.field1838;
                        var33 = (int) ((float) this.field1834.field4484 * var80 / (float) this.field1843) + arg4.field61;
                        float var81 = (float) var14 * this.field1833 + (float) var12 * this.field1832 + (float) var56 * this.field1845 + this.field1840;
                        var35 = (int) ((float) this.field1834.field4508 * var81 / (float) this.field1843) + arg4.field65;
                        float var82 = (float) var14 * this.field1836 + (float) var13 * this.field1830 + (float) var57 * this.field1825 + this.field1838;
                        var37 = (int) ((float) this.field1834.field4484 * var82 / (float) this.field1843) + arg4.field61;
                        float var83 = (float) var14 * this.field1833 + (float) var13 * this.field1832 + (float) var57 * this.field1845 + this.field1840;
                        var39 = (int) ((float) this.field1834.field4508 * var83 / (float) this.field1843) + arg4.field65;
                        float var84 = (float) var15 * this.field1836 + (float) var13 * this.field1830 + (float) var58 * this.field1825 + this.field1838;
                        var41 = (int) ((float) this.field1834.field4484 * var84 / (float) this.field1843) + arg4.field61;
                        float var85 = (float) var15 * this.field1833 + (float) var13 * this.field1832 + (float) var58 * this.field1845 + this.field1840;
                        var43 = (int) ((float) this.field1834.field4508 * var85 / (float) this.field1843) + arg4.field65;
                        float var86 = (float) var15 * this.field1836 + (float) var12 * this.field1830 + (float) var59 * this.field1825 + this.field1838;
                        var45 = (int) ((float) this.field1834.field4484 * var86 / (float) this.field1843) + arg4.field61;
                        float var87 = (float) var15 * this.field1833 + (float) var12 * this.field1832 + (float) var59 * this.field1845 + this.field1840;
                        var47 = (int) ((float) this.field1834.field4508 * var87 / (float) this.field1843) + arg4.field65;
                    }
                }
                boolean var88 = var11.field1568 != -1 && this.method962(this.field1834.field849.method1124((byte) -92, var11.field1568).field4185);
                if (this.field1843 == -1) {
                    int var89 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field69 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field70 || var45 > arg4.field70 || var37 > arg4.field70;
                        if (var89 < 765) {
                            if (var89 > 0) {
                                if (var11.field1568 >= 0) {
                                    int var90 = -16777216;
                                    if (var88) {
                                        var90 = -1694498816;
                                    }
                                    arg4.method37((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var90 | var11.field1572 & 16777215, var90 | var11.field1569 & 16777215, var90 | var11.field1574 & 16777215, arg3.field7758, var18, var19, var17, var11.field1568);
                                } else {
                                    if (var88) {
                                        arg4.field68 = 100;
                                    }
                                    arg4.method47((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class322.method2048(var18 << 24 | arg3.field7758, (byte) 122, var11.field1572), class322.method2048(var19 << 24 | arg3.field7758, (byte) 70, var11.field1569), class322.method2048(var17 << 24 | arg3.field7758, (byte) 123, var11.field1574));
                                    arg4.field68 = 0;
                                }
                            } else if (var11.field1568 >= 0) {
                                int var91 = -16777216;
                                if (var88) {
                                    var91 = -1694498816;
                                }
                                arg4.method37((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var91 | var11.field1572 & 16777215, var91 | var11.field1569 & 16777215, var91 | var11.field1574 & 16777215, 0, 0, 0, 0, var11.field1568);
                            } else {
                                if (var88) {
                                    arg4.field68 = 100;
                                }
                                arg4.method47((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1572, var11.field1569, var11.field1574);
                                arg4.field68 = 0;
                            }
                        } else {
                            arg4.method44((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7758);
                        }
                    }
                    int var92 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field69 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field70 || var37 > arg4.field70 || var45 > arg4.field70;
                        if (var92 < 765) {
                            if (var88) {
                                arg4.field68 = -1694498816;
                            }
                            if (var92 > 0) {
                                if (var11.field1568 >= 0) {
                                    int var93 = -16777216;
                                    if (var88) {
                                        var93 = -1694498816;
                                    }
                                    arg4.method37((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var93 | var11.field1573 & 16777215, var93 | var11.field1574 & 16777215, var93 | var11.field1569 & 16777215, arg3.field7758, var16, var17, var19, var11.field1568);
                                    return;
                                }
                                if (var88) {
                                    arg4.field68 = 100;
                                }
                                arg4.method47((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class322.method2048(var16 << 24 | arg3.field7758, (byte) 116, var11.field1573), class322.method2048(var17 << 24 | arg3.field7758, (byte) 82, var11.field1574), class322.method2048(var19 << 24 | arg3.field7758, (byte) 103, var11.field1569));
                                arg4.field68 = 0;
                                return;
                            }
                            if (var11.field1568 >= 0) {
                                int var94 = -16777216;
                                if (var88) {
                                    var94 = -1694498816;
                                }
                                arg4.method37((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var94 | var11.field1573 & 16777215, var94 | var11.field1574 & 16777215, var94 | var11.field1569 & 16777215, 0, 0, 0, 0, var11.field1568);
                                return;
                            }
                            if (var88) {
                                arg4.field68 = 100;
                            }
                            arg4.method47((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1573, var11.field1574, var11.field1569);
                            arg4.field68 = 0;
                            return;
                        }
                        arg4.method44((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7758);
                        return;
                    }
                } else {
                    int var95 = var17 + var18 + var19;
                    if ((var39 - var47) * (var41 - var45) - (var37 - var45) * (var43 - var47) > 0) {
                        arg4.field69 = var41 < 0 || var45 < 0 || var37 < 0 || var41 > arg4.field70 || var45 > arg4.field70 || var37 > arg4.field70;
                        if (var95 < 765) {
                            if (var88) {
                                arg4.field68 = -1694498816;
                            }
                            if (var95 > 0) {
                                if (var11.field1568 >= 0) {
                                    int var96 = -16777216;
                                    if (var88) {
                                        var96 = -1694498816;
                                    }
                                    arg4.method37((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var96 | var11.field1572 & 16777215, var96 | var11.field1569 & 16777215, var96 | var11.field1574 & 16777215, arg3.field7758, var18, var19, var17, var11.field1568);
                                } else {
                                    if (var88) {
                                        arg4.field68 = 100;
                                    }
                                    arg4.method47((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), class322.method2048(var18 << 24 | arg3.field7758, (byte) 110, var11.field1572), class322.method2048(var19 << 24 | arg3.field7758, (byte) 87, var11.field1569), class322.method2048(var17 << 24 | arg3.field7758, (byte) 112, var11.field1574));
                                    arg4.field68 = 0;
                                }
                            } else if (var11.field1568 >= 0) {
                                int var97 = -16777216;
                                if (var88) {
                                    var97 = -1694498816;
                                }
                                arg4.method37((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, var24, var25, var23, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var97 | var11.field1572 & 16777215, var97 | var11.field1569 & 16777215, var97 | var11.field1574 & 16777215, 0, 0, 0, 0, var11.field1568);
                            } else {
                                if (var88) {
                                    arg4.field68 = 100;
                                }
                                arg4.method47((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), var11.field1572, var11.field1569, var11.field1574);
                                arg4.field68 = 0;
                            }
                        } else {
                            arg4.method44((float) var43, (float) var47, (float) var39, (float) var41, (float) var45, (float) var37, (float) ((int) var24), (float) ((int) var25), (float) ((int) var23), arg3.field7758);
                        }
                    }
                    int var98 = var16 + var17 + var19;
                    if ((var33 - var37) * (var47 - var39) - (var35 - var39) * (var45 - var37) > 0) {
                        arg4.field69 = var33 < 0 || var37 < 0 || var45 < 0 || var33 > arg4.field70 || var37 > arg4.field70 || var45 > arg4.field70;
                        if (var98 < 765) {
                            if (var88) {
                                arg4.field68 = -1694498816;
                            }
                            if (var98 > 0) {
                                if (var11.field1568 >= 0) {
                                    int var99 = -16777216;
                                    if (var88) {
                                        var99 = -1694498816;
                                    }
                                    arg4.method37((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var99 | var11.field1573 & 16777215, var99 | var11.field1574 & 16777215, var99 | var11.field1569 & 16777215, arg3.field7758, var16, var17, var19, var11.field1568);
                                    return;
                                }
                                if (var88) {
                                    arg4.field68 = 100;
                                }
                                arg4.method47((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), class322.method2048(var16 << 24 | arg3.field7758, (byte) 109, var11.field1573), class322.method2048(var17 << 24 | arg3.field7758, (byte) 117, var11.field1574), class322.method2048(var19 << 24 | arg3.field7758, (byte) 107, var11.field1569));
                                arg4.field68 = 0;
                                return;
                            }
                            if (var11.field1568 >= 0) {
                                int var100 = -16777216;
                                if (var88) {
                                    var100 = -1694498816;
                                }
                                arg4.method37((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, var22, var23, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var100 | var11.field1573 & 16777215, var100 | var11.field1574 & 16777215, var100 | var11.field1569 & 16777215, 0, 0, 0, 0, var11.field1568);
                                return;
                            }
                            if (var88) {
                                arg4.field68 = 100;
                            }
                            arg4.method47((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), var11.field1573, var11.field1574, var11.field1569);
                            arg4.field68 = 0;
                            return;
                        }
                        arg4.method44((float) var35, (float) var39, (float) var47, (float) var33, (float) var37, (float) var45, (float) ((int) var22), (float) ((int) var23), (float) ((int) var25), arg3.field7758);
                    }
                }
            }
        } else {
            class472 var101 = this.field1842[arg0][arg1];
            if (var101 != null) {
                if (arg9 != 0) {
                    if ((var101.field6873 & 4) != 0) {
                        if ((arg9 & 1) != 0) {
                            return;
                        }
                    } else if ((arg9 & 2) != 0) {
                        return;
                    }
                }
                if (this.field1843 == -1) {
                    for (int var102 = 0; var102 < var101.field6871; ++var102) {
                        int var103 = (arg0 << super.field3955) + var101.field6876[var102];
                        int var104 = var101.field6875[var102];
                        int var105 = (arg1 << super.field3955) + var101.field6870[var102];
                        float var106 = (float) var105 * this.field1844 + (float) var103 * this.field1839 + (float) var104 * this.field1829 + this.field1828;
                        if (var106 <= (float) this.field1834.field4494) {
                            return;
                        }
                        arg8[var102] = 0;
                        if (arg2) {
                            int var107 = (int) (var106 - (float) arg3.field7753);
                            if (var107 > 255) {
                                var107 = 255;
                            }
                            if (var107 > 0) {
                                arg8[var102] = var107;
                                int var108 = var101.field6869[var102] * var107 / 255;
                                if (var108 > 0) {
                                    var104 -= var108;
                                }
                            }
                        } else if (arg3.field7755) {
                            int var109 = (int) (var106 - (float) arg3.field7753);
                            if (var109 > 0) {
                                arg8[var102] = var109;
                                if (arg8[var102] > 255) {
                                    arg8[var102] = 255;
                                }
                            }
                        }
                        float var110 = (float) var105 * this.field1836 + (float) var103 * this.field1830 + (float) var104 * this.field1825 + this.field1838;
                        float var111 = (float) var105 * this.field1833 + (float) var103 * this.field1832 + (float) var104 * this.field1845 + this.field1840;
                        arg5[var102] = (int) ((float) this.field1834.field4484 * var110 / var106) + arg4.field61;
                        arg6[var102] = (int) ((float) this.field1834.field4508 * var111 / var106) + arg4.field65;
                        arg7[var102] = (int) var106;
                    }
                } else {
                    for (int var112 = 0; var112 < var101.field6871; ++var112) {
                        int var152 = (arg0 << super.field3955) + var101.field6876[var112];
                        int var153 = var101.field6875[var112];
                        int var154 = (arg1 << super.field3955) + var101.field6870[var112];
                        float var155 = (float) var154 * this.field1844 + (float) var152 * this.field1839 + (float) var153 * this.field1829 + this.field1828;
                        arg8[var112] = 0;
                        if (arg2) {
                            int var156 = this.field1843 - arg3.field7753;
                            if (var156 > 255) {
                                var156 = 255;
                            }
                            if (var156 > 0) {
                                arg8[var112] = var156;
                                int var157 = var101.field6869[var112] * var156 / 255;
                                if (var157 > 0) {
                                    var153 -= var157;
                                }
                            }
                        } else if (arg3.field7755) {
                            int var158 = this.field1843 - arg3.field7753;
                            if (var158 > 0) {
                                arg8[var112] = var158;
                                if (arg8[var112] > 255) {
                                    arg8[var112] = 255;
                                }
                            }
                        }
                        float var159 = (float) var154 * this.field1836 + (float) var152 * this.field1830 + (float) var153 * this.field1825 + this.field1838;
                        float var160 = (float) var154 * this.field1833 + (float) var152 * this.field1832 + (float) var153 * this.field1845 + this.field1840;
                        arg5[var112] = (int) ((float) this.field1834.field4484 * var159 / (float) this.field1843) + arg4.field61;
                        arg6[var112] = (int) ((float) this.field1834.field4508 * var160 / (float) this.field1843) + arg4.field65;
                        arg7[var112] = (int) var155;
                    }
                }
                if (var101.field6868 != null) {
                    if (this.field1843 == -1) {
                        for (int var113 = 0; var113 < var101.field6872; ++var113) {
                            int var114 = var113 * 3;
                            int var115 = var114 + 1;
                            int var116 = var115 + 1;
                            int var117 = arg5[var114];
                            int var118 = arg5[var115];
                            int var119 = arg5[var116];
                            int var120 = arg6[var114];
                            int var121 = arg6[var115];
                            int var122 = arg6[var116];
                            int var123 = arg8[var114] + arg8[var115] + arg8[var116];
                            if ((var117 - var118) * (var122 - var121) - (var119 - var118) * (var120 - var121) > 0) {
                                arg4.field69 = var117 < 0 || var118 < 0 || var119 < 0 || var117 > arg4.field70 || var118 > arg4.field70 || var119 > arg4.field70;
                                short var124 = var101.field6868[var113];
                                if (var123 < 765) {
                                    if (var123 > 0) {
                                        if (var124 != -1) {
                                            int var125 = -16777216;
                                            if (var124 != -1 && this.method962(this.field1834.field849.method1124((byte) -123, var124).field4185)) {
                                                var125 = -1694498816;
                                            }
                                            arg4.method37((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field6876[var114] / (float) super.field3965, (float) var101.field6876[var115] / (float) super.field3965, (float) var101.field6876[var116] / (float) super.field3965, (float) var101.field6870[var114] / (float) super.field3965, (float) var101.field6870[var115] / (float) super.field3965, (float) var101.field6870[var116] / (float) super.field3965, var125 | var101.field6874[var114] & 16777215, var125 | var101.field6874[var115] & 16777215, var125 | var101.field6874[var116] & 16777215, arg3.field7758, arg8[var114], arg8[var115], arg8[var116], var124);
                                        } else if ((var101.field6874[var114] & 16777215) != 0) {
                                            if (var124 != -1 && this.method962(this.field1834.field849.method1124((byte) -94, var124).field4185)) {
                                                arg4.field68 = -1694498816;
                                            }
                                            arg4.method47((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], class322.method2048(arg8[var114] << 24 | arg3.field7758, (byte) 115, var101.field6874[var114]), class322.method2048(arg8[var115] << 24 | arg3.field7758, (byte) 70, var101.field6874[var115]), class322.method2048(arg8[var116] << 24 | arg3.field7758, (byte) 104, var101.field6874[var116]));
                                            arg4.field68 = 0;
                                        }
                                    } else if (var124 != -1) {
                                        int var126 = -16777216;
                                        if (var124 != -1 && this.method962(this.field1834.field849.method1124((byte) 47, var124).field4185)) {
                                            var126 = -1694498816;
                                        }
                                        arg4.method37((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], (float) var101.field6876[var114] / (float) super.field3965, (float) var101.field6876[var115] / (float) super.field3965, (float) var101.field6876[var116] / (float) super.field3965, (float) var101.field6870[var114] / (float) super.field3965, (float) var101.field6870[var115] / (float) super.field3965, (float) var101.field6870[var116] / (float) super.field3965, var126 | var101.field6874[var114] & 16777215, var126 | var101.field6874[var115] & 16777215, var126 | var101.field6874[var116] & 16777215, 0, 0, 0, 0, var124);
                                    } else if ((var101.field6874[var114] & 16777215) != 0) {
                                        if (var124 != -1 && this.method962(this.field1834.field849.method1124((byte) -125, var124).field4185)) {
                                            arg4.field68 = -1694498816;
                                        }
                                        arg4.method47((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], var101.field6874[var114], var101.field6874[var115], var101.field6874[var116]);
                                        arg4.field68 = 0;
                                    }
                                } else {
                                    arg4.method44((float) var120, (float) var121, (float) var122, (float) var117, (float) var118, (float) var119, (float) arg7[var114], (float) arg7[var115], (float) arg7[var116], arg3.field7758);
                                }
                            }
                        }
                        return;
                    }
                    for (int var127 = 0; var127 < var101.field6872; ++var127) {
                        int var128 = var127 * 3;
                        int var129 = var128 + 1;
                        int var130 = var129 + 1;
                        int var131 = arg5[var128];
                        int var132 = arg5[var129];
                        int var133 = arg5[var130];
                        int var134 = arg6[var128];
                        int var135 = arg6[var129];
                        int var136 = arg6[var130];
                        int var137 = arg8[var128] + arg8[var129] + arg8[var130];
                        if ((var131 - var132) * (var136 - var135) - (var133 - var132) * (var134 - var135) > 0) {
                            arg4.field69 = var131 < 0 || var132 < 0 || var133 < 0 || var131 > arg4.field70 || var132 > arg4.field70 || var133 > arg4.field70;
                            short var138 = var101.field6868[var127];
                            if (var137 < 765) {
                                if (var138 != -1 && this.method962(this.field1834.field849.method1124((byte) 89, var138).field4185)) {
                                    arg4.field68 = -1694498816;
                                }
                                if (var137 > 0) {
                                    if (var138 != -1) {
                                        int var139 = -16777216;
                                        if (var138 != -1 && this.method962(this.field1834.field849.method1124((byte) 65, var138).field4185)) {
                                            var139 = -1694498816;
                                        }
                                        arg4.method37((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field6876[var128] / (float) super.field3965, (float) var101.field6876[var129] / (float) super.field3965, (float) var101.field6876[var130] / (float) super.field3965, (float) var101.field6870[var128] / (float) super.field3965, (float) var101.field6870[var129] / (float) super.field3965, (float) var101.field6870[var130] / (float) super.field3965, var139 | var101.field6874[var128] & 16777215, var139 | var101.field6874[var129] & 16777215, var139 | var101.field6874[var130] & 16777215, arg3.field7758, arg8[var128], arg8[var129], arg8[var130], var138);
                                    } else if ((var101.field6874[var128] & 16777215) != 0) {
                                        if (var138 != -1 && this.method962(this.field1834.field849.method1124((byte) 71, var138).field4185)) {
                                            arg4.field68 = -1694498816;
                                        }
                                        arg4.method47((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], class322.method2048(arg8[var128] << 24 | arg3.field7758, (byte) 116, var101.field6874[var128]), class322.method2048(arg8[var129] << 24 | arg3.field7758, (byte) 83, var101.field6874[var129]), class322.method2048(arg8[var130] << 24 | arg3.field7758, (byte) 98, var101.field6874[var130]));
                                        arg4.field68 = 0;
                                    }
                                } else if (var138 != -1) {
                                    int var140 = -16777216;
                                    if (var138 != -1 && this.method962(this.field1834.field849.method1124((byte) 103, var138).field4185)) {
                                        var140 = -1694498816;
                                    }
                                    arg4.method37((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], (float) var101.field6876[var128] / (float) super.field3965, (float) var101.field6876[var129] / (float) super.field3965, (float) var101.field6876[var130] / (float) super.field3965, (float) var101.field6870[var128] / (float) super.field3965, (float) var101.field6870[var129] / (float) super.field3965, (float) var101.field6870[var130] / (float) super.field3965, var140 | var101.field6874[var128] & 16777215, var140 | var101.field6874[var129] & 16777215, var140 | var101.field6874[var130] & 16777215, 0, 0, 0, 0, var138);
                                } else if ((var101.field6874[var128] & 16777215) != 0) {
                                    if (var138 != -1 && this.method962(this.field1834.field849.method1124((byte) 67, var138).field4185)) {
                                        arg4.field68 = -1694498816;
                                    }
                                    arg4.method47((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], var101.field6874[var128], var101.field6874[var129], var101.field6874[var130]);
                                    arg4.field68 = 0;
                                }
                                arg4.field68 = 0;
                            } else {
                                arg4.method44((float) var134, (float) var135, (float) var136, (float) var131, (float) var132, (float) var133, (float) arg7[var128], (float) arg7[var129], (float) arg7[var130], arg3.field7758);
                            }
                        }
                    }
                    return;
                }
                for (int var141 = 0; var141 < var101.field6872; ++var141) {
                    int var142 = var141 * 3;
                    int var143 = var142 + 1;
                    int var144 = var143 + 1;
                    int var145 = arg5[var142];
                    int var146 = arg5[var143];
                    int var147 = arg5[var144];
                    int var148 = arg6[var142];
                    int var149 = arg6[var143];
                    int var150 = arg6[var144];
                    int var151 = arg8[var142] + arg8[var143] + arg8[var144];
                    if ((var145 - var146) * (var150 - var149) - (var147 - var146) * (var148 - var149) > 0) {
                        arg4.field69 = var145 < 0 || var146 < 0 || var147 < 0 || var145 > arg4.field70 || var146 > arg4.field70 || var147 > arg4.field70;
                        if (var151 < 765) {
                            if (var151 > 0) {
                                if ((var101.field6874[var142] & 16777215) != 0) {
                                    arg4.method47((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], class173.method1234(arg8[var142], var101.field6874[var142], arg3.field7758, -2359), class173.method1234(arg8[var143], var101.field6874[var143], arg3.field7758, -2359), class173.method1234(arg8[var144], var101.field6874[var144], arg3.field7758, -2359));
                                }
                            } else if ((var101.field6874[var142] & 16777215) != 0) {
                                arg4.method47((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], var101.field6874[var142], var101.field6874[var143], var101.field6874[var144]);
                            }
                        } else {
                            arg4.method44((float) var148, (float) var149, (float) var150, (float) var145, (float) var146, (float) var147, (float) arg7[var142], (float) arg7[var143], (float) arg7[var144], arg3.field7758);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(IIIIIII[[ZLmd;Lil;[I[I)V")
    private final void method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class545 arg8, class7 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field7759;
        this.field1834.method463(false);
        arg9.field67 = false;
        arg9.field71 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field1831[var18][var19] != null) {
                        class428 var20 = this.field1831[var18][var19];
                        if (var20.field6341 != -1 && (var20.field6345 & 2) == 0 && var20.field6344 == -1) {
                            int var21 = this.field1834.method2002(var20.field6341);
                            arg9.method48((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) class22.method120(var21, var20.field6342 & 65535, (byte) -125), (float) class22.method120(var21, var20.field6340 & 65535, (byte) -125), (float) class22.method120(var21, var20.field6343 & 65535, (byte) -127));
                            arg9.method48((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) class22.method120(var21, var20.field6339 & 65535, (byte) -124), (float) class22.method120(var21, var20.field6343 & 65535, (byte) -125), (float) class22.method120(var21, var20.field6340 & 65535, (byte) -124));
                        } else if (var20.field6344 == -1) {
                            arg9.method48((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) (var20.field6342 & 65535), (float) (var20.field6340 & 65535), (float) (var20.field6343 & 65535));
                            arg9.method48((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) (var20.field6339 & 65535), (float) (var20.field6343 & 65535), (float) (var20.field6340 & 65535));
                        } else {
                            int var22 = var20.field6344;
                            arg9.method48((float) (var17 - var14), (float) (var17 - var14), (float) var17, (float) (var14 + var16), (float) var16, (float) (var14 + var16), 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                            arg9.method48((float) var17, (float) var17, (float) (var17 - var14), (float) var16, (float) (var14 + var16), (float) var16, 100.0F, 100.0F, 100.0F, (float) var22, (float) var22, (float) var22);
                        }
                    } else if (this.field1826[var18][var19] != null) {
                        class539 var23 = this.field1826[var18][var19];
                        for (int var24 = 0; var24 < var23.field7696; ++var24) {
                            arg10[var24] = var23.field7700[var24] * var14 / super.field3965 + var16;
                            arg11[var24] = var17 - var23.field7697[var24] * var14 / super.field3965;
                        }
                        for (int var25 = 0; var25 < var23.field7701; ++var25) {
                            short var26 = var23.field7695[var25];
                            short var27 = var23.field7704[var25];
                            short var28 = var23.field7703[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field7694 != null && var23.field7694[var25] != -1) {
                                int var35 = var23.field7694[var25];
                                arg9.method48((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class22.method120(var35, var23.field7706[var26], (byte) -125), (float) class22.method120(var35, var23.field7706[var27], (byte) -128), (float) class22.method120(var35, var23.field7706[var28], (byte) -126));
                            } else if (var23.field7702 != null && var23.field7702[var25] != -1) {
                                int var36 = this.field1834.method2002(var23.field7702[var25]);
                                arg9.method48((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class22.method120(var36, var23.field7706[var26], (byte) -124), (float) class22.method120(var36, var23.field7706[var27], (byte) -128), (float) class22.method120(var36, var23.field7706[var28], (byte) -128));
                            } else {
                                int var37 = var23.field7705[var25];
                                arg9.method48((float) var32, (float) var33, (float) var34, (float) var29, (float) var30, (float) var31, 100.0F, 100.0F, 100.0F, (float) class22.method120(var37, var23.field7706[var26], (byte) -126), (float) class22.method120(var37, var23.field7706[var27], (byte) -126), (float) class22.method120(var37, var23.field7706[var28], (byte) -125));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field67 = true;
        this.field1834.method463(var15);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class545 var9 = this.field1834.method2005(Thread.currentThread());
        class7 var10 = var9.field7778;
        var10.field68 = 0;
        var10.field69 = true;
        this.field1834.method444();
        if (this.field1846 == null && this.field1827 == null) {
            if (this.field1831 != null) {
                this.method969(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7767, var9.field7782);
            }
        } else {
            this.method965(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field7767, var9.field7782);
        }
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(III)V")
    private final void method971(int arg0, int arg1, int arg2) {
        class545 var4 = this.field1834.method2005(Thread.currentThread());
        var4.field7778.field68 = 0;
        if (this.field1846 != null) {
            this.method968(arg0, arg1, var4.field7749, var4, var4.field7778, var4.field7767, var4.field7782, var4.field7773, var4.field7764, arg2);
        } else if (this.field1831 != null) {
            this.method959(arg0, arg1, var4.field7778, var4.field7767, var4.field7782, var4.field7773, var4.field7764, arg2);
        } else {
            if (this.field1827 != null) {
                this.method961(arg0, arg1, var4.field7749, var4, var4.field7778, var4.field7767, var4.field7782, var4.field7773, var4.field7764, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "YA", descriptor = "()V")
    public final void method972() {
        this.field1837 = null;
        this.field1835 = null;
    }

    @OriginalMember(owner = "client!vr", name = "ka", descriptor = "(III)V")
    public final void method973(int arg0, int arg1, int arg2) {
        if (this.field1835[arg0][arg1] < arg2) {
            this.field1835[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!vr", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method974(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        boolean var15 = (this.field1841 & 32) == 0;
        if (this.field1846 == null && !var15) {
            this.field1846 = new class113[super.field3963][super.field3962];
            this.field1842 = new class472[super.field3963][super.field3962];
        } else if (this.field1827 == null && var15) {
            this.field1827 = new class641[super.field3963][super.field3962];
        } else if (this.field1831 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var16 = 0; var16 < arg6.length; ++var16) {
                if (arg6[var16] == -1) {
                    arg6[var16] = 0;
                } else {
                    arg6[var16] = class9.field141[class139.method982(arg6[var16], -16614) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var17 = 0; var17 < arg7.length; ++var17) {
                    if (arg7[var17] == -1) {
                        arg7[var17] = 0;
                    } else {
                        arg7[var17] = class9.field141[class139.method982(arg7[var17], -16614) & 65535] << 8 | 255;
                    }
                }
            }
            if (var15) {
                class641 var18 = new class641();
                var18.field8999 = (short) arg2.length;
                var18.field9001 = (short) (arg2.length / 3);
                var18.field9000 = new short[var18.field8999];
                var18.field8991 = new short[var18.field8999];
                var18.field8997 = new short[var18.field8999];
                var18.field8995 = new int[var18.field8999];
                var18.field8994 = new short[var18.field8999];
                var18.field8992 = new short[var18.field8999];
                var18.field8998 = new byte[var18.field8999];
                if (arg5 != null) {
                    var18.field8993 = new short[var18.field8999];
                }
                for (int var19 = 0; var19 < var18.field8999; ++var19) {
                    int var22 = arg2[var19];
                    int var23 = arg4[var19];
                    boolean var24 = false;
                    int var25;
                    if (var22 == 0 && var23 == 0) {
                        var25 = this.field1837[arg0][arg1] - this.field1835[arg0][arg1];
                    } else if (var22 == 0 && super.field3965 == var23) {
                        var25 = this.field1837[arg0][arg1 + 1] - this.field1835[arg0][arg1 + 1];
                    } else if (super.field3965 == var22 && super.field3965 == var23) {
                        var25 = this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1];
                    } else if (super.field3965 == var22 && var23 == 0) {
                        var25 = this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1];
                    } else {
                        int var26 = (this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1]) * var22 + (this.field1837[arg0][arg1] - this.field1835[arg0][arg1]) * (super.field3965 - var22);
                        int var27 = (this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1]) * var22 + (this.field1837[arg0][arg1 + 1] - this.field1835[arg0][arg1 + 1]) * (super.field3965 - var22);
                        var25 = (super.field3965 - var23) * var26 + var23 * var27 >> super.field3955 * 2;
                    }
                    int var28 = (arg0 << super.field3955) + var22;
                    int var29 = (arg1 << super.field3955) + var23;
                    var18.field9000[var19] = (short) var22;
                    var18.field8997[var19] = (short) var23;
                    var18.field8991[var19] = (short) (this.method1786(var29, (byte) 113, var28) + (arg3 != null ? arg3[var19] : 0));
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (arg6[var19] == 0) {
                        var18.field8995[var19] = 0;
                        if (arg7 != null) {
                            var18.field8998[var19] = (byte) var25;
                        }
                    } else {
                        int var30 = 0;
                        if (arg5 != null) {
                            short var31 = var18.field8993[var19] = (short) arg5[var19];
                            if (arg11 != 0) {
                                var30 = var31 * 255 / arg11;
                                if (var30 < 0) {
                                    var30 = 0;
                                } else if (var30 > 255) {
                                    var30 = 255;
                                }
                            }
                        }
                        int var32 = -16777216;
                        if (arg8[var19] != -1 && this.method962(this.field1834.field849.method1124((byte) 108, arg8[var19]).field4185)) {
                            var32 = -1694498816;
                        }
                        var18.field8995[var19] = var32 | class173.method1234(var30, method958(arg6[var19] >> 8, var25), arg10, -2359);
                        if (arg7 != null) {
                            var18.field8998[var19] = (byte) var25;
                        }
                    }
                    var18.field8994[var19] = (short) arg8[var19];
                    var18.field8992[var19] = (short) arg9[var19];
                }
                if (arg7 != null) {
                    var18.field8996 = new int[var18.field9001];
                }
                for (int var20 = 0; var20 < var18.field9001; ++var20) {
                    int var21 = var20 * 3;
                    if (arg7 != null && arg7[var21] != 0) {
                        var18.field8996[var20] = -16777216 | arg7[var21] >> 8;
                    }
                }
                this.field1827[arg0][arg1] = var18;
            } else {
                boolean var33 = true;
                int var34 = -1;
                int var35 = -1;
                int var36 = -1;
                int var37 = -1;
                if (arg2.length == 6) {
                    for (int var38 = 0; var38 < 6; ++var38) {
                        if (arg2[var38] == 0 && arg4[var38] == 0) {
                            if (var34 != -1 && arg6[var34] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var34 = var38;
                        } else if (arg2[var38] == super.field3965 && arg4[var38] == 0) {
                            if (var35 != -1 && arg6[var35] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var35 = var38;
                        } else if (arg2[var38] == super.field3965 && arg4[var38] == super.field3965) {
                            if (var36 != -1 && arg6[var36] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var36 = var38;
                        } else if (arg2[var38] == 0 && arg4[var38] == super.field3965) {
                            if (var37 != -1 && arg6[var37] != arg6[var38]) {
                                var33 = false;
                                break;
                            }
                            var37 = var38;
                        }
                    }
                    if (var34 == -1 || var35 == -1 || var36 == -1 || var37 == -1) {
                        var33 = false;
                    }
                    if (var33) {
                        if (arg3 != null) {
                            for (int var39 = 0; var39 < 4; ++var39) {
                                if (arg3[var39] != 0) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                        if (var33) {
                            for (int var40 = 1; var40 < 4; ++var40) {
                                if (arg2[var40] != arg2[0] && arg2[0] + super.field3965 != arg2[var40] && arg2[0] - super.field3965 != arg2[var40]) {
                                    var33 = false;
                                    break;
                                }
                                if (arg4[var40] != arg4[0] && arg4[0] + super.field3965 != arg4[var40] && arg4[0] - super.field3965 != arg4[var40]) {
                                    var33 = false;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    var33 = false;
                }
                if (var33) {
                    class113 var41 = new class113();
                    int var42 = arg6[0];
                    int var43 = arg8[0];
                    if (arg7 != null) {
                        var41.field1566 = arg7[0] >> 8;
                        if (var42 == 0) {
                            var41.field1570 = (byte) (var41.field1570 | 2);
                        }
                    } else if (var42 == 0) {
                        return;
                    }
                    if (super.field3968[arg0 + 1][arg1] == super.field3968[arg0][arg1] && super.field3968[arg0 + 1][arg1 + 1] == super.field3968[arg0][arg1] && super.field3968[arg0][arg1 + 1] == super.field3968[arg0][arg1]) {
                        var41.field1570 = (byte) (var41.field1570 | 1);
                    }
                    if (var43 != -1 && (var41.field1570 & 2) == 0 && !this.field1834.field849.method1124((byte) -111, var43).field4184) {
                        int var44;
                        if (arg5 != null && arg11 != 0) {
                            var44 = arg5[var34] * 255 / arg11;
                            if (var44 < 0) {
                                var44 = 0;
                            } else if (var44 > 255) {
                                var44 = 255;
                            }
                        } else {
                            var44 = 0;
                        }
                        var41.field1573 = class173.method1234(var44, method958(arg6[var34] >> 8, this.field1837[arg0][arg1] - this.field1835[arg0][arg1]), arg10, -2359);
                        if (var41.field1566 != 0) {
                            var41.field1573 |= 255 - (this.field1837[arg0][arg1] - this.field1835[arg0][arg1]) << 25;
                        }
                        int var45;
                        if (arg5 != null && arg11 != 0) {
                            var45 = arg5[var35] * 255 / arg11;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 > 255) {
                                var45 = 255;
                            }
                        } else {
                            var45 = 0;
                        }
                        var41.field1574 = class173.method1234(var45, method958(arg6[var35] >> 8, this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1]), arg10, -2359);
                        if (var41.field1566 != 0) {
                            var41.field1574 |= 255 - (this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1]) << 25;
                        }
                        int var46;
                        if (arg5 != null && arg11 != 0) {
                            var46 = arg5[var36] * 255 / arg11;
                            if (var46 < 0) {
                                var46 = 0;
                            } else if (var46 > 255) {
                                var46 = 255;
                            }
                        } else {
                            var46 = 0;
                        }
                        var41.field1572 = class173.method1234(var46, method958(arg6[var36] >> 8, this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1]), arg10, -2359);
                        if (var41.field1566 != 0) {
                            var41.field1572 |= 255 - (this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var47;
                        if (arg5 != null && arg11 != 0) {
                            var47 = arg5[var37] * 255 / arg11;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 > 255) {
                                var47 = 255;
                            }
                        } else {
                            var47 = 0;
                        }
                        var41.field1569 = class173.method1234(var47, method958(arg6[var37] >> 8, this.field1837[arg0][arg1 + 1] - this.field1835[arg0][arg1 + 1]), arg10, -2359);
                        var41.field1568 = (short) var43;
                    } else {
                        int var48;
                        if (arg5 != null && arg11 != 0) {
                            var48 = arg5[var34] * 255 / arg11;
                            if (var48 < 0) {
                                var48 = 0;
                            } else if (var48 > 255) {
                                var48 = 255;
                            }
                        } else {
                            var48 = 0;
                        }
                        var41.field1573 = class173.method1234(var48, method958(arg6[var34] >> 8, this.field1837[arg0][arg1] - this.field1835[arg0][arg1]), arg10, -2359);
                        if (var41.field1566 != 0) {
                            var41.field1573 |= 255 - (this.field1837[arg0][arg1] - this.field1835[arg0][arg1]) << 25;
                        }
                        int var49;
                        if (arg5 != null && arg11 != 0) {
                            var49 = arg5[var35] * 255 / arg11;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 > 255) {
                                var49 = 255;
                            }
                        } else {
                            var49 = 0;
                        }
                        var41.field1574 = class173.method1234(var49, method958(arg6[var35] >> 8, this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1]), arg10, -2359);
                        if (var41.field1566 != 0) {
                            var41.field1574 |= 255 - (this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1]) << 25;
                        }
                        int var50;
                        if (arg5 != null && arg11 != 0) {
                            var50 = arg5[var36] * 255 / arg11;
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 > 255) {
                                var50 = 255;
                            }
                        } else {
                            var50 = 0;
                        }
                        var41.field1572 = class173.method1234(var50, method958(arg6[var36] >> 8, this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1]), arg10, -2359);
                        if (var41.field1566 != 0) {
                            var41.field1572 |= 255 - (this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1]) << 25;
                        }
                        int var51;
                        if (arg5 != null && arg11 != 0) {
                            var51 = arg5[var37] * 255 / arg11;
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (var51 > 255) {
                                var51 = 255;
                            }
                        } else {
                            var51 = 0;
                        }
                        var41.field1569 = class173.method1234(var51, method958(arg6[var37] >> 8, this.field1837[arg0][arg1 + 1] - this.field1835[arg0][arg1 + 1]), arg10, -2359);
                        if (var41.field1566 != 0) {
                            var41.field1569 |= 255 - (this.field1837[arg0][arg1 + 1] - this.field1835[arg0][arg1 + 1]) << 25;
                        }
                        var41.field1568 = -1;
                    }
                    if (arg5 != null) {
                        var41.field1567 = (short) arg5[var36];
                        var41.field1571 = (short) arg5[var37];
                        var41.field1575 = (short) arg5[var35];
                        var41.field1576 = (short) arg5[var34];
                    }
                    this.field1846[arg0][arg1] = var41;
                } else {
                    class472 var52 = new class472();
                    var52.field6871 = (short) arg2.length;
                    var52.field6872 = (short) (arg2.length / 3);
                    var52.field6876 = new short[var52.field6871];
                    var52.field6875 = new short[var52.field6871];
                    var52.field6870 = new short[var52.field6871];
                    var52.field6874 = new int[var52.field6871];
                    if (arg5 != null) {
                        var52.field6869 = new short[var52.field6871];
                    }
                    for (int var53 = 0; var53 < var52.field6871; ++var53) {
                        int var68 = arg2[var53];
                        int var69 = arg4[var53];
                        boolean var70 = false;
                        int var71;
                        if (var68 == 0 && var69 == 0) {
                            var71 = this.field1837[arg0][arg1] - this.field1835[arg0][arg1];
                        } else if (var68 == 0 && super.field3965 == var69) {
                            var71 = this.field1837[arg0][arg1 + 1] - this.field1835[arg0][arg1 + 1];
                        } else if (super.field3965 == var68 && super.field3965 == var69) {
                            var71 = this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1];
                        } else if (super.field3965 == var68 && var69 == 0) {
                            var71 = this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1];
                        } else {
                            int var72 = (this.field1837[arg0 + 1][arg1] - this.field1835[arg0 + 1][arg1]) * var68 + (this.field1837[arg0][arg1] - this.field1835[arg0][arg1]) * (super.field3965 - var68);
                            int var73 = (this.field1837[arg0 + 1][arg1 + 1] - this.field1835[arg0 + 1][arg1 + 1]) * var68 + (this.field1837[arg0][arg1 + 1] - this.field1835[arg0][arg1 + 1]) * (super.field3965 - var68);
                            var71 = (super.field3965 - var69) * var72 + var69 * var73 >> super.field3955 * 2;
                        }
                        int var74 = (arg0 << super.field3955) + var68;
                        int var75 = (arg1 << super.field3955) + var69;
                        var52.field6876[var53] = (short) var68;
                        var52.field6870[var53] = (short) var69;
                        var52.field6875[var53] = (short) (this.method1786(var75, (byte) 113, var74) + (arg3 != null ? arg3[var53] : 0));
                        if (var71 < 0) {
                            var71 = 0;
                        }
                        if (arg6[var53] == 0) {
                            if (arg7 != null) {
                                var52.field6874[var53] = var71 << 25;
                            } else {
                                var52.field6874[var53] = 0;
                            }
                        } else {
                            int var76 = 0;
                            if (arg5 != null) {
                                short var77 = var52.field6869[var53] = (short) arg5[var53];
                                if (arg11 != 0) {
                                    var76 = var77 * 255 / arg11;
                                    if (var76 < 0) {
                                        var76 = 0;
                                    } else if (var76 > 255) {
                                        var76 = 255;
                                    }
                                }
                            }
                            var52.field6874[var53] = class173.method1234(var76, method958(arg6[var53] >> 8, var71), arg10, -2359);
                            if (arg7 != null) {
                                var52.field6874[var53] |= var71 << 25;
                            }
                        }
                    }
                    boolean var54 = false;
                    for (int var55 = 0; var55 < var52.field6872; ++var55) {
                        if (arg8[var55 * 3] != -1 && !this.field1834.field849.method1124((byte) -86, arg8[var55 * 3]).field4184) {
                            var54 = true;
                        }
                    }
                    if (arg7 != null) {
                        var52.field6877 = new int[var52.field6872];
                    }
                    if (var54) {
                        var52.field6868 = new short[var52.field6872];
                        var52.field6878 = new short[var52.field6872];
                    }
                    for (int var56 = 0; var56 < var52.field6872; ++var56) {
                        int var57 = var56 * 3;
                        if (arg7 != null && arg7[var57] != 0) {
                            var52.field6877[var56] = arg7[var57] >> 8;
                        }
                        if (var54) {
                            int var58 = var57 + 1;
                            int var59 = var58 + 1;
                            boolean var60 = false;
                            boolean var61 = true;
                            int var62 = arg8[var57];
                            if (var62 != -1 && !this.field1834.field849.method1124((byte) -105, var62).field4184) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var63 = arg8[var58];
                            if (var63 != -1 && !this.field1834.field849.method1124((byte) 49, var63).field4184) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            int var64 = arg8[var59];
                            if (var64 != -1 && !this.field1834.field849.method1124((byte) -101, var64).field4184) {
                                var60 = true;
                            } else {
                                var61 = false;
                            }
                            if (var61) {
                                var52.field6868[var56] = (short) var64;
                                var52.field6878[var56] = (short) arg9[var57];
                            } else {
                                if (var60) {
                                    int var65 = arg8[var57];
                                    if (var65 != -1 && !this.field1834.field849.method1124((byte) 59, var65).field4184) {
                                        var52.field6874[var57] = class9.field141[class139.method982(this.field1834.field849.method1124((byte) -107, var65).field4175 & 65535, -16614) & 65535];
                                    }
                                    int var66 = arg8[var58];
                                    if (var66 != -1 && !this.field1834.field849.method1124((byte) -96, var66).field4184) {
                                        var52.field6874[var58] = class9.field141[class139.method982(this.field1834.field849.method1124((byte) 100, var66).field4175 & 65535, -16614) & 65535];
                                    }
                                    int var67 = arg8[var59];
                                    if (var67 != -1 && !this.field1834.field849.method1124((byte) 26, var67).field4184) {
                                        var52.field6874[var59] = class9.field141[class139.method982(this.field1834.field849.method1124((byte) -116, var67).field4175 & 65535, -16614) & 65535];
                                    }
                                }
                                var52.field6868[var56] = -1;
                            }
                        }
                    }
                    this.field1842[arg0][arg1] = var52;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III[[ZZII)V")
    public final void method975(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        class99 var8 = this.field1834.field4482;
        this.field1843 = arg5;
        this.field1830 = var8.field1395;
        this.field1825 = var8.field1390;
        this.field1836 = var8.field1419;
        this.field1838 = var8.field1398;
        this.field1832 = var8.field1420;
        this.field1845 = var8.field1406;
        this.field1833 = var8.field1417;
        this.field1840 = var8.field1418;
        this.field1839 = var8.field1388;
        this.field1829 = var8.field1389;
        this.field1844 = var8.field1401;
        this.field1828 = var8.field1410;
        for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
            for (int var10 = 0; var10 < arg2 + arg2; ++var10) {
                if (arg3[var9][var10]) {
                    int var11 = arg0 - arg2 + var9;
                    int var12 = arg1 - arg2 + var10;
                    if (var11 >= 0 && var11 < super.field3963 && var12 >= 0 && var12 < super.field3962) {
                        this.method971(var11, var12, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method976(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III[[ZZI)V")
    public final void method977(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class99 var7 = this.field1834.field4482;
        this.field1843 = -1;
        this.field1830 = var7.field1395;
        this.field1825 = var7.field1390;
        this.field1836 = var7.field1419;
        this.field1838 = var7.field1398;
        this.field1832 = var7.field1420;
        this.field1845 = var7.field1406;
        this.field1833 = var7.field1417;
        this.field1840 = var7.field1418;
        this.field1839 = var7.field1388;
        this.field1829 = var7.field1389;
        this.field1844 = var7.field1401;
        this.field1828 = var7.field1410;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3963 && var11 >= 0 && var11 < super.field3962) {
                        this.method971(var10, var11, arg5);
                    }
                }
            }
        }
    }
}
