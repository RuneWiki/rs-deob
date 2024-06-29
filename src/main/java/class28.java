import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 extends class70 {

    @OriginalMember(owner = "client!df", name = "Ab", descriptor = "Z")
    private boolean field728 = false;

    @OriginalMember(owner = "client!df", name = "Fb", descriptor = "I")
    private int field733 = 0;

    @OriginalMember(owner = "client!df", name = "Vb", descriptor = "B")
    private byte field749 = 0;

    @OriginalMember(owner = "client!df", name = "Ob", descriptor = "I")
    private int field742 = 0;

    @OriginalMember(owner = "client!df", name = "Kb", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "[I")
    private int[] field715;

    @OriginalMember(owner = "client!df", name = "ac", descriptor = "[I")
    private int[] field754;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "[I")
    private int[] field712;

    @OriginalMember(owner = "client!df", name = "Mb", descriptor = "[I")
    private int[] field740;

    @OriginalMember(owner = "client!df", name = "wb", descriptor = "[I")
    private int[] field724;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "[I")
    private int[] field710;

    @OriginalMember(owner = "client!df", name = "Lb", descriptor = "[I")
    private int[] field739;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "[B")
    private byte[] field714;

    @OriginalMember(owner = "client!df", name = "Ub", descriptor = "[B")
    private byte[] field748;

    @OriginalMember(owner = "client!df", name = "tb", descriptor = "[B")
    private byte[] field721;

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "[I")
    private int[] field711;

    @OriginalMember(owner = "client!df", name = "Zb", descriptor = "[S")
    private short[] field753;

    @OriginalMember(owner = "client!df", name = "Db", descriptor = "[B")
    private byte[] field731;

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "[S")
    private short[] field709;

    @OriginalMember(owner = "client!df", name = "pb", descriptor = "[B")
    private byte[] field717;

    @OriginalMember(owner = "client!df", name = "rb", descriptor = "[S")
    private short[] field719;

    @OriginalMember(owner = "client!df", name = "Hb", descriptor = "[S")
    private short[] field735;

    @OriginalMember(owner = "client!df", name = "vb", descriptor = "[S")
    private short[] field723;

    @OriginalMember(owner = "client!df", name = "Nb", descriptor = "[S")
    private short[] field741;

    @OriginalMember(owner = "client!df", name = "Qb", descriptor = "[S")
    private short[] field744;

    @OriginalMember(owner = "client!df", name = "Gb", descriptor = "[S")
    private short[] field734;

    @OriginalMember(owner = "client!df", name = "zb", descriptor = "[S")
    private short[] field727;

    @OriginalMember(owner = "client!df", name = "qb", descriptor = "[B")
    private byte[] field718;

    @OriginalMember(owner = "client!df", name = "Jb", descriptor = "[S")
    private short[] field737;

    @OriginalMember(owner = "client!df", name = "Wb", descriptor = "[S")
    private short[] field750;

    @OriginalMember(owner = "client!df", name = "Sb", descriptor = "[[I")
    private int[][] field746;

    @OriginalMember(owner = "client!df", name = "Rb", descriptor = "[[I")
    private int[][] field745;

    @OriginalMember(owner = "client!df", name = "xb", descriptor = "[Lob;")
    private class99[] field725;

    @OriginalMember(owner = "client!df", name = "Eb", descriptor = "[Lkf;")
    private class75[] field732;

    @OriginalMember(owner = "client!df", name = "Pb", descriptor = "[Lob;")
    private class99[] field743;

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "S")
    public short field716;

    @OriginalMember(owner = "client!df", name = "yb", descriptor = "S")
    public short field726;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "[I")
    private static int[] field713 = new int[10000];

    @OriginalMember(owner = "client!df", name = "ub", descriptor = "[I")
    private static int[] field722 = class11.field249;

    @OriginalMember(owner = "client!df", name = "Ib", descriptor = "[I")
    private static int[] field736 = class11.field244;

    @OriginalMember(owner = "client!df", name = "Cb", descriptor = "[I")
    private static int[] field730 = new int[10000];

    @OriginalMember(owner = "client!df", name = "Yb", descriptor = "I")
    private static int field752 = 0;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
    private int field708;

    @OriginalMember(owner = "client!df", name = "sb", descriptor = "I")
    private int field720;

    @OriginalMember(owner = "client!df", name = "Bb", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "client!df", name = "Tb", descriptor = "I")
    private int field747;

    @OriginalMember(owner = "client!df", name = "Xb", descriptor = "I")
    private int field751;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public final void method208(int arg0) {
        int var2 = field736[arg0];
        int var3 = field722[arg0];
        for (int var4 = 0; var4 < this.field742; ++var4) {
            int var5 = this.field715[var4] * var3 + this.field712[var4] * var2 >> 16;
            this.field712[var4] = this.field712[var4] * var3 - this.field715[var4] * var2 >> 16;
            this.field715[var4] = var5;
        }
        this.method211();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldf;I)I")
    private final int method209(class28 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field715[arg1];
        int var5 = arg0.field754[arg1];
        int var6 = arg0.field712[arg1];
        for (int var7 = 0; var7 < this.field742; ++var7) {
            if (this.field715[var7] == var4 && this.field754[var7] == var5 && this.field712[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field715[this.field742] = var4;
            this.field754[this.field742] = var5;
            this.field712[this.field742] = var6;
            if (arg0.field740 != null) {
                this.field740[this.field742] = arg0.field740[arg1];
            }
            var3 = this.field742++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldd;II)Ldf;")
    public static final class28 method210(class26 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method193(false, arg2, arg1);
        return var3 == null ? null : new class28(var3);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    private final void method211() {
        this.field725 = null;
        this.field743 = null;
        this.field732 = null;
        this.field728 = false;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
    private final void method212() {
        if (!this.field728) {
            super.field1775 = 0;
            this.field751 = 0;
            this.field729 = 999999;
            this.field720 = -999999;
            this.field747 = -99999;
            this.field708 = 99999;
            for (int var1 = 0; var1 < this.field742; ++var1) {
                int var2 = this.field715[var1];
                int var3 = this.field754[var1];
                int var4 = this.field712[var1];
                if (var2 < this.field729) {
                    this.field729 = var2;
                }
                if (var2 > this.field720) {
                    this.field720 = var2;
                }
                if (var4 < this.field708) {
                    this.field708 = var4;
                }
                if (var4 > this.field747) {
                    this.field747 = var4;
                }
                if (-var3 > super.field1775) {
                    super.field1775 = -var3;
                }
                if (var3 > this.field751) {
                    this.field751 = var3;
                }
            }
            this.field728 = true;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([[IIIIZI)Ldf;")
    public final class28 method213(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method212();
        int var7 = this.field729 + arg1;
        int var8 = this.field720 + arg1;
        int var9 = this.field708 + arg3;
        int var10 = this.field747 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class28 var15;
                if (arg4) {
                    var15 = new class28();
                    var15.field742 = this.field742;
                    var15.field733 = this.field733;
                    var15.field738 = this.field738;
                    var15.field715 = this.field715;
                    var15.field712 = this.field712;
                    var15.field724 = this.field724;
                    var15.field710 = this.field710;
                    var15.field739 = this.field739;
                    var15.field714 = this.field714;
                    var15.field748 = this.field748;
                    var15.field721 = this.field721;
                    var15.field731 = this.field731;
                    var15.field709 = this.field709;
                    var15.field753 = this.field753;
                    var15.field749 = this.field749;
                    var15.field717 = this.field717;
                    var15.field719 = this.field719;
                    var15.field735 = this.field735;
                    var15.field723 = this.field723;
                    var15.field741 = this.field741;
                    var15.field744 = this.field744;
                    var15.field734 = this.field734;
                    var15.field727 = this.field727;
                    var15.field718 = this.field718;
                    var15.field737 = this.field737;
                    var15.field750 = this.field750;
                    var15.field740 = this.field740;
                    var15.field711 = this.field711;
                    var15.field746 = this.field746;
                    var15.field745 = this.field745;
                    var15.field716 = this.field716;
                    var15.field726 = this.field726;
                    var15.field754 = new int[var15.field742];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field742; ++var16) {
                        int var17 = this.field715[var16] + arg1;
                        int var18 = this.field712[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field754[var16] = this.field754[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field742; ++var26) {
                        int var27 = (-this.field754[var26] << 16) / super.field1775;
                        if (var27 < arg5) {
                            int var28 = this.field715[var26] + arg1;
                            int var29 = this.field712[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field754[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field754[var26];
                        }
                    }
                }
                var15.method211();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
    public final void method214(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field742; ++var4) {
            this.field715[var4] += arg0;
            this.field754[var4] += arg1;
            this.field712[var4] += arg2;
        }
        this.method211();
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
    public final void method215() {
        for (int var1 = 0; var1 < this.field742; ++var1) {
            this.field712[var1] = -this.field712[var1];
        }
        for (int var2 = 0; var2 < this.field733; ++var2) {
            int var3 = this.field724[var2];
            this.field724[var2] = this.field739[var2];
            this.field739[var2] = var3;
        }
        this.method211();
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
    public final void method216() {
        if (this.field725 == null) {
            this.field725 = new class99[this.field742];
            for (int var1 = 0; var1 < this.field742; ++var1) {
                this.field725[var1] = new class99();
            }
            for (int var2 = 0; var2 < this.field733; ++var2) {
                int var3 = this.field724[var2];
                int var4 = this.field710[var2];
                int var5 = this.field739[var2];
                int var6 = this.field715[var4] - this.field715[var3];
                int var7 = this.field754[var4] - this.field754[var3];
                int var8 = this.field712[var4] - this.field712[var3];
                int var9 = this.field715[var5] - this.field715[var3];
                int var10 = this.field754[var5] - this.field754[var3];
                int var11 = this.field712[var5] - this.field712[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field714 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field714[var2];
                }
                if (var19 == 0) {
                    class99 var20 = this.field725[var3];
                    var20.field2459 += var16;
                    var20.field2455 += var17;
                    var20.field2453 += var18;
                    ++var20.field2458;
                    class99 var21 = this.field725[var4];
                    var21.field2459 += var16;
                    var21.field2455 += var17;
                    var21.field2453 += var18;
                    ++var21.field2458;
                    class99 var22 = this.field725[var5];
                    var22.field2459 += var16;
                    var22.field2455 += var17;
                    var22.field2453 += var18;
                    ++var22.field2458;
                } else if (var19 == 1) {
                    if (this.field732 == null) {
                        this.field732 = new class75[this.field733];
                    }
                    class75 var23 = this.field732[var2] = new class75();
                    var23.field1847 = var16;
                    var23.field1848 = var17;
                    var23.field1852 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)Lnb;")
    public final class92 method217(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method216();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class92 var8 = new class92();
        var8.field2353 = new int[this.field733];
        var8.field2340 = new int[this.field733];
        var8.field2344 = new int[this.field733];
        if (this.field753 != null) {
            var8.field2339 = new short[this.field733];
            for (int var9 = 0; var9 < this.field733; ++var9) {
                short var10 = this.field753[var9];
                if (var10 != -1 && class11.field235.method323(-1527, var10)) {
                    var8.field2339[var9] = var10;
                } else {
                    var8.field2339[var9] = -1;
                }
            }
        } else {
            var8.field2339 = null;
        }
        if (this.field738 > 0 && this.field731 != null) {
            int[] var11 = new int[this.field738];
            for (int var12 = 0; var12 < this.field733; ++var12) {
                if (this.field731[var12] != -1) {
                    ++var11[this.field731[var12] & 255];
                }
            }
            var8.field2352 = 0;
            for (int var13 = 0; var13 < this.field738; ++var13) {
                if (var11[var13] > 0 && this.field717[var13] == 0) {
                    ++var8.field2352;
                }
            }
            var8.field2354 = new int[var8.field2352];
            var8.field2335 = new int[var8.field2352];
            var8.field2337 = new int[var8.field2352];
            int var14 = 0;
            for (int var15 = 0; var15 < this.field738; ++var15) {
                if (var11[var15] > 0 && this.field717[var15] == 0) {
                    var8.field2354[var14] = this.field719[var15] & 65535;
                    var8.field2335[var14] = this.field735[var15] & 65535;
                    var8.field2337[var14] = this.field723[var15] & 65535;
                    var11[var15] = var14++;
                } else {
                    var11[var15] = -1;
                }
            }
            var8.field2350 = new byte[this.field733];
            for (int var16 = 0; var16 < this.field733; ++var16) {
                if (this.field731[var16] != -1) {
                    var8.field2350[var16] = (byte) var11[this.field731[var16] & 255];
                    if (var8.field2350[var16] == -1 && var8.field2339 != null) {
                        var8.field2339[var16] = -1;
                    }
                } else {
                    var8.field2350[var16] = -1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field733; ++var17) {
            byte var18;
            if (this.field714 == null) {
                var18 = 0;
            } else {
                var18 = this.field714[var17];
            }
            byte var19;
            if (this.field721 == null) {
                var19 = 0;
            } else {
                var19 = this.field721[var17];
            }
            short var20;
            if (var8.field2339 == null) {
                var20 = -1;
            } else {
                var20 = var8.field2339[var17];
            }
            if (var19 == -2) {
                var18 = 3;
            }
            if (var19 == -1) {
                var18 = 2;
            }
            if (var20 == -1) {
                if (var18 != 0) {
                    if (var18 == 1) {
                        class75 var28 = this.field732[var17];
                        int var29 = (var28.field1852 * arg4 + var28.field1848 * arg3 + var28.field1847 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field2353[var17] = method224(this.field709[var17] & 65535, var29);
                        var8.field2344[var17] = -1;
                    } else if (var18 == 3) {
                        var8.field2353[var17] = 128;
                        var8.field2344[var17] = -1;
                    } else {
                        var8.field2344[var17] = -2;
                    }
                } else {
                    int var21 = this.field709[var17] & 65535;
                    class99 var22;
                    if (this.field743 != null && this.field743[this.field724[var17]] != null) {
                        var22 = this.field743[this.field724[var17]];
                    } else {
                        var22 = this.field725[this.field724[var17]];
                    }
                    int var23 = (var22.field2453 * arg4 + var22.field2459 * arg2 + var22.field2455 * arg3) / (var22.field2458 * var7) + arg0;
                    var8.field2353[var17] = method224(var21, var23);
                    class99 var24;
                    if (this.field743 != null && this.field743[this.field710[var17]] != null) {
                        var24 = this.field743[this.field710[var17]];
                    } else {
                        var24 = this.field725[this.field710[var17]];
                    }
                    int var25 = (var24.field2453 * arg4 + var24.field2459 * arg2 + var24.field2455 * arg3) / (var24.field2458 * var7) + arg0;
                    var8.field2340[var17] = method224(var21, var25);
                    class99 var26;
                    if (this.field743 != null && this.field743[this.field739[var17]] != null) {
                        var26 = this.field743[this.field739[var17]];
                    } else {
                        var26 = this.field725[this.field739[var17]];
                    }
                    int var27 = (var26.field2453 * arg4 + var26.field2459 * arg2 + var26.field2455 * arg3) / (var26.field2458 * var7) + arg0;
                    var8.field2344[var17] = method224(var21, var27);
                }
            } else if (var18 != 0) {
                if (var18 == 1) {
                    class75 var36 = this.field732[var17];
                    int var37 = (var36.field1852 * arg4 + var36.field1848 * arg3 + var36.field1847 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field2353[var17] = method219(var37);
                    var8.field2344[var17] = -1;
                } else {
                    var8.field2344[var17] = -2;
                }
            } else {
                class99 var30;
                if (this.field743 != null && this.field743[this.field724[var17]] != null) {
                    var30 = this.field743[this.field724[var17]];
                } else {
                    var30 = this.field725[this.field724[var17]];
                }
                int var31 = (var30.field2453 * arg4 + var30.field2459 * arg2 + var30.field2455 * arg3) / (var30.field2458 * var7) + arg0;
                var8.field2353[var17] = method219(var31);
                class99 var32;
                if (this.field743 != null && this.field743[this.field710[var17]] != null) {
                    var32 = this.field743[this.field710[var17]];
                } else {
                    var32 = this.field725[this.field710[var17]];
                }
                int var33 = (var32.field2453 * arg4 + var32.field2459 * arg2 + var32.field2455 * arg3) / (var32.field2458 * var7) + arg0;
                var8.field2340[var17] = method219(var33);
                class99 var34;
                if (this.field743 != null && this.field743[this.field739[var17]] != null) {
                    var34 = this.field743[this.field739[var17]];
                } else {
                    var34 = this.field725[this.field739[var17]];
                }
                int var35 = (var34.field2453 * arg4 + var34.field2459 * arg2 + var34.field2455 * arg3) / (var34.field2458 * var7) + arg0;
                var8.field2344[var17] = method219(var35);
            }
        }
        this.method226();
        var8.field2357 = this.field742;
        var8.field2355 = this.field715;
        var8.field2347 = this.field754;
        var8.field2343 = this.field712;
        var8.field2332 = this.field733;
        var8.field2336 = this.field724;
        var8.field2345 = this.field710;
        var8.field2349 = this.field739;
        var8.field2341 = this.field748;
        var8.field2330 = this.field721;
        var8.field2346 = this.field749;
        var8.field2356 = this.field746;
        var8.field2342 = this.field745;
        return var8;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([B)V")
    private final void method218(byte[] arg0) {
        class157 var2 = new class157(arg0);
        class157 var3 = new class157(arg0);
        class157 var4 = new class157(arg0);
        class157 var5 = new class157(arg0);
        class157 var6 = new class157(arg0);
        class157 var7 = new class157(arg0);
        class157 var8 = new class157(arg0);
        var2.field3457 = arg0.length - 23;
        int var9 = var2.method1161((byte) 60);
        int var10 = var2.method1161((byte) 60);
        int var11 = var2.method1194(false);
        int var12 = var2.method1194(false);
        int var13 = var2.method1194(false);
        int var14 = var2.method1194(false);
        int var15 = var2.method1194(false);
        int var16 = var2.method1194(false);
        int var17 = var2.method1194(false);
        int var18 = var2.method1161((byte) 60);
        int var19 = var2.method1161((byte) 60);
        int var20 = var2.method1161((byte) 60);
        int var21 = var2.method1161((byte) 60);
        int var22 = var2.method1161((byte) 60);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field717 = new byte[var11];
            var2.field3457 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field717[var26] = var2.method1169((byte) 97);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field742 = var9;
        this.field733 = var10;
        this.field738 = var11;
        this.field715 = new int[var9];
        this.field754 = new int[var9];
        this.field712 = new int[var9];
        this.field724 = new int[var10];
        this.field710 = new int[var10];
        this.field739 = new int[var10];
        if (var17 == 1) {
            this.field740 = new int[var9];
        }
        if (var12 == 1) {
            this.field714 = new byte[var10];
        }
        if (var13 == 255) {
            this.field748 = new byte[var10];
        } else {
            this.field749 = (byte) var13;
        }
        if (var14 == 1) {
            this.field721 = new byte[var10];
        }
        if (var15 == 1) {
            this.field711 = new int[var10];
        }
        if (var16 == 1) {
            this.field753 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field731 = new byte[var10];
        }
        this.field709 = new short[var10];
        if (var11 > 0) {
            this.field719 = new short[var11];
            this.field735 = new short[var11];
            this.field723 = new short[var11];
            if (var24 > 0) {
                this.field741 = new short[var24];
                this.field744 = new short[var24];
                this.field734 = new short[var24];
                this.field727 = new short[var24];
                this.field718 = new byte[var24];
                this.field737 = new short[var24];
            }
            if (var25 > 0) {
                this.field750 = new short[var25];
            }
        }
        var2.field3457 = var11;
        var3.field3457 = var44;
        var4.field3457 = var46;
        var5.field3457 = var48;
        var6.field3457 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method1194(false);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method1210(-120);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method1210(-98);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method1210(-26);
            }
            this.field715[var67] = var64 + var82;
            this.field754[var67] = var65 + var83;
            this.field712[var67] = var66 + var84;
            var64 = this.field715[var67];
            var65 = this.field754[var67];
            var66 = this.field712[var67];
            if (var17 == 1) {
                this.field740[var67] = var6.method1194(false);
            }
        }
        var2.field3457 = var42;
        var3.field3457 = var31;
        var4.field3457 = var34;
        var5.field3457 = var37;
        var6.field3457 = var35;
        var7.field3457 = var40;
        var8.field3457 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field709[var68] = (short) var2.method1161((byte) 60);
            if (var12 == 1) {
                this.field714[var68] = var3.method1169((byte) -73);
            }
            if (var13 == 255) {
                this.field748[var68] = var4.method1169((byte) -69);
            }
            if (var14 == 1) {
                this.field721[var68] = var5.method1169((byte) -56);
            }
            if (var15 == 1) {
                this.field711[var68] = var6.method1194(false);
            }
            if (var16 == 1) {
                this.field753[var68] = (short) (var7.method1161((byte) 60) - 1);
            }
            if (this.field731 != null) {
                if (this.field753[var68] != -1) {
                    this.field731[var68] = (byte) (var8.method1194(false) - 1);
                } else {
                    this.field731[var68] = -1;
                }
            }
        }
        var2.field3457 = var33;
        var3.field3457 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method1194(false);
            if (var77 == 1) {
                var69 = var2.method1210(-117) + var72;
                var70 = var2.method1210(-16) + var69;
                var71 = var2.method1210(-32) + var70;
                var72 = var71;
                this.field724[var73] = var69;
                this.field710[var73] = var70;
                this.field739[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method1210(-74) + var72;
                var72 = var71;
                this.field724[var73] = var69;
                this.field710[var73] = var70;
                this.field739[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method1210(-43) + var72;
                var72 = var71;
                this.field724[var73] = var69;
                this.field710[var73] = var70;
                this.field739[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method1210(-118) + var72;
                var72 = var71;
                this.field724[var73] = var69;
                this.field710[var73] = var80;
                this.field739[var73] = var71;
            }
        }
        var2.field3457 = var50;
        var3.field3457 = var52;
        var4.field3457 = var54;
        var5.field3457 = var56;
        var6.field3457 = var58;
        var7.field3457 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field717[var74] & 255;
            if (var76 == 0) {
                this.field719[var74] = (short) var2.method1161((byte) 60);
                this.field735[var74] = (short) var2.method1161((byte) 60);
                this.field723[var74] = (short) var2.method1161((byte) 60);
            }
            if (var76 == 1) {
                this.field719[var74] = (short) var3.method1161((byte) 60);
                this.field735[var74] = (short) var3.method1161((byte) 60);
                this.field723[var74] = (short) var3.method1161((byte) 60);
                this.field741[var74] = (short) var4.method1161((byte) 60);
                this.field744[var74] = (short) var4.method1161((byte) 60);
                this.field734[var74] = (short) var4.method1161((byte) 60);
                this.field727[var74] = (short) var5.method1161((byte) 60);
                this.field718[var74] = var6.method1169((byte) 115);
                this.field737[var74] = (short) var7.method1161((byte) 60);
            }
            if (var76 == 2) {
                this.field719[var74] = (short) var3.method1161((byte) 60);
                this.field735[var74] = (short) var3.method1161((byte) 60);
                this.field723[var74] = (short) var3.method1161((byte) 60);
                this.field741[var74] = (short) var4.method1161((byte) 60);
                this.field744[var74] = (short) var4.method1161((byte) 60);
                this.field734[var74] = (short) var4.method1161((byte) 60);
                this.field727[var74] = (short) var5.method1161((byte) 60);
                this.field718[var74] = var6.method1169((byte) -55);
                this.field737[var74] = (short) var7.method1161((byte) 60);
                this.field750[var74] = (short) var7.method1161((byte) 60);
            }
            if (var76 == 3) {
                this.field719[var74] = (short) var3.method1161((byte) 60);
                this.field735[var74] = (short) var3.method1161((byte) 60);
                this.field723[var74] = (short) var3.method1161((byte) 60);
                this.field741[var74] = (short) var4.method1161((byte) 60);
                this.field744[var74] = (short) var4.method1161((byte) 60);
                this.field734[var74] = (short) var4.method1161((byte) 60);
                this.field727[var74] = (short) var5.method1161((byte) 60);
                this.field718[var74] = var6.method1169((byte) -107);
                this.field737[var74] = (short) var7.method1161((byte) 60);
            }
        }
        var2.field3457 = var62;
        int var75 = var2.method1194(false);
        if (var75 != 0) {
            new class152();
            var2.method1161((byte) 60);
            var2.method1161((byte) 60);
            var2.method1161((byte) 60);
            var2.method1175((byte) -113);
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)I")
    private static final int method219(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "()Ldf;")
    public final class28 method220() {
        class28 var1 = new class28();
        if (this.field714 != null) {
            var1.field714 = new byte[this.field733];
            for (int var2 = 0; var2 < this.field733; ++var2) {
                var1.field714[var2] = this.field714[var2];
            }
        }
        var1.field742 = this.field742;
        var1.field733 = this.field733;
        var1.field738 = this.field738;
        var1.field715 = this.field715;
        var1.field754 = this.field754;
        var1.field712 = this.field712;
        var1.field724 = this.field724;
        var1.field710 = this.field710;
        var1.field739 = this.field739;
        var1.field748 = this.field748;
        var1.field721 = this.field721;
        var1.field731 = this.field731;
        var1.field709 = this.field709;
        var1.field753 = this.field753;
        var1.field749 = this.field749;
        var1.field717 = this.field717;
        var1.field719 = this.field719;
        var1.field735 = this.field735;
        var1.field723 = this.field723;
        var1.field741 = this.field741;
        var1.field744 = this.field744;
        var1.field734 = this.field734;
        var1.field727 = this.field727;
        var1.field718 = this.field718;
        var1.field737 = this.field737;
        var1.field750 = this.field750;
        var1.field740 = this.field740;
        var1.field711 = this.field711;
        var1.field746 = this.field746;
        var1.field745 = this.field745;
        var1.field725 = this.field725;
        var1.field732 = this.field732;
        var1.field716 = this.field716;
        var1.field726 = this.field726;
        return var1;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "()V")
    public final void method221() {
        for (int var1 = 0; var1 < this.field742; ++var1) {
            this.field715[var1] = -this.field715[var1];
            this.field712[var1] = -this.field712[var1];
        }
        this.method211();
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
    public final void method222(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field742; ++var4) {
            this.field715[var4] = this.field715[var4] * arg0 / 128;
            this.field754[var4] = this.field754[var4] * arg1 / 128;
            this.field712[var4] = this.field712[var4] * arg2 / 128;
        }
        this.method211();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(SS)V")
    public final void method223(short arg0, short arg1) {
        if (this.field753 != null) {
            for (int var3 = 0; var3 < this.field733; ++var3) {
                if (this.field753[var3] == arg0) {
                    this.field753[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
    private static final int method224(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "([B)V")
    private final void method225(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class157 var4 = new class157(arg0);
        class157 var5 = new class157(arg0);
        class157 var6 = new class157(arg0);
        class157 var7 = new class157(arg0);
        class157 var8 = new class157(arg0);
        var4.field3457 = arg0.length - 18;
        int var9 = var4.method1161((byte) 60);
        int var10 = var4.method1161((byte) 60);
        int var11 = var4.method1194(false);
        int var12 = var4.method1194(false);
        int var13 = var4.method1194(false);
        int var14 = var4.method1194(false);
        int var15 = var4.method1194(false);
        int var16 = var4.method1194(false);
        int var17 = var4.method1161((byte) 60);
        int var18 = var4.method1161((byte) 60);
        int var19 = var4.method1161((byte) 60);
        int var20 = var4.method1161((byte) 60);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field742 = var9;
        this.field733 = var10;
        this.field738 = var11;
        this.field715 = new int[var9];
        this.field754 = new int[var9];
        this.field712 = new int[var9];
        this.field724 = new int[var10];
        this.field710 = new int[var10];
        this.field739 = new int[var10];
        if (var11 > 0) {
            this.field717 = new byte[var11];
            this.field719 = new short[var11];
            this.field735 = new short[var11];
            this.field723 = new short[var11];
        }
        if (var16 == 1) {
            this.field740 = new int[var9];
        }
        if (var12 == 1) {
            this.field714 = new byte[var10];
            this.field731 = new byte[var10];
            this.field753 = new short[var10];
        }
        if (var13 == 255) {
            this.field748 = new byte[var10];
        } else {
            this.field749 = (byte) var13;
        }
        if (var14 == 1) {
            this.field721 = new byte[var10];
        }
        if (var15 == 1) {
            this.field711 = new int[var10];
        }
        this.field709 = new short[var10];
        var4.field3457 = var21;
        var5.field3457 = var36;
        var6.field3457 = var38;
        var7.field3457 = var40;
        var8.field3457 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method1194(false);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method1210(-20);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method1210(-45);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method1210(-38);
            }
            this.field715[var46] = var43 + var63;
            this.field754[var46] = var44 + var64;
            this.field712[var46] = var45 + var65;
            var43 = this.field715[var46];
            var44 = this.field754[var46];
            var45 = this.field712[var46];
            if (var16 == 1) {
                this.field740[var46] = var8.method1194(false);
            }
        }
        var4.field3457 = var32;
        var5.field3457 = var28;
        var6.field3457 = var26;
        var7.field3457 = var30;
        var8.field3457 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field709[var47] = (short) var4.method1161((byte) 60);
            if (var12 == 1) {
                int var61 = var5.method1194(false);
                if ((var61 & 1) == 1) {
                    this.field714[var47] = 1;
                    var2 = true;
                } else {
                    this.field714[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field731[var47] = (byte) (var61 >> 2);
                    this.field753[var47] = this.field709[var47];
                    this.field709[var47] = 127;
                    if (this.field753[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field731[var47] = -1;
                    this.field753[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field748[var47] = var6.method1169((byte) 96);
            }
            if (var14 == 1) {
                this.field721[var47] = var7.method1169((byte) -48);
            }
            if (var15 == 1) {
                this.field711[var47] = var8.method1194(false);
            }
        }
        var4.field3457 = var25;
        var5.field3457 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method1194(false);
            if (var57 == 1) {
                var48 = var4.method1210(-30) + var51;
                var49 = var4.method1210(-70) + var48;
                var50 = var4.method1210(-42) + var49;
                var51 = var50;
                this.field724[var52] = var48;
                this.field710[var52] = var49;
                this.field739[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1210(-112) + var51;
                var51 = var50;
                this.field724[var52] = var48;
                this.field710[var52] = var49;
                this.field739[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1210(-112) + var51;
                var51 = var50;
                this.field724[var52] = var48;
                this.field710[var52] = var49;
                this.field739[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1210(-69) + var51;
                var51 = var50;
                this.field724[var52] = var48;
                this.field710[var52] = var60;
                this.field739[var52] = var50;
            }
        }
        var4.field3457 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field717[var53] = 0;
            this.field719[var53] = (short) var4.method1161((byte) 60);
            this.field735[var53] = (short) var4.method1161((byte) 60);
            this.field723[var53] = (short) var4.method1161((byte) 60);
        }
        if (this.field731 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field731[var55] & 255;
                if (var56 != 255) {
                    if ((this.field719[var56] & 65535) == this.field724[var55] && (this.field735[var56] & 65535) == this.field710[var55] && (this.field723[var56] & 65535) == this.field739[var55]) {
                        this.field731[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field731 = null;
            }
        }
        if (!var3) {
            this.field753 = null;
        }
        if (!var2) {
            this.field714 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "()V")
    private final void method226() {
        int var10002;
        if (this.field740 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field742; ++var3) {
                int var7 = this.field740[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field746 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field746[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field742) {
                int var6 = this.field740[var5];
                this.field746[var6][var1[var6]++] = var5++;
            }
            this.field740 = null;
        }
        if (this.field711 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field733; ++var10) {
                int var14 = this.field711[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field745 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field745[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field733) {
                int var13 = this.field711[var12];
                this.field745[var13][var8[var13]++] = var12++;
            }
            this.field711 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldf;Ldf;IIIZ)V")
    public static final void method227(class28 arg0, class28 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method212();
        arg0.method216();
        arg1.method212();
        arg1.method216();
        ++field752;
        int var6 = 0;
        int[] var7 = arg1.field715;
        int var8 = arg1.field742;
        for (int var9 = 0; var9 < arg0.field742; ++var9) {
            class99 var12 = arg0.field725[var9];
            if (var12.field2458 != 0) {
                int var13 = arg0.field754[var9] - arg3;
                if (var13 <= arg1.field751) {
                    int var14 = arg0.field715[var9] - arg2;
                    if (var14 >= arg1.field729 && var14 <= arg1.field720) {
                        int var15 = arg0.field712[var9] - arg4;
                        if (var15 >= arg1.field708 && var15 <= arg1.field747) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class99 var17 = arg1.field725[var16];
                                if (var7[var16] == var14 && arg1.field712[var16] == var15 && arg1.field754[var16] == var13 && var17.field2458 != 0) {
                                    if (arg0.field743 == null) {
                                        arg0.field743 = new class99[arg0.field742];
                                    }
                                    if (arg1.field743 == null) {
                                        arg1.field743 = new class99[var8];
                                    }
                                    class99 var18 = arg0.field743[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field743[var9] = new class99(var12);
                                    }
                                    class99 var19 = arg1.field743[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field743[var16] = new class99(var17);
                                    }
                                    var18.field2459 += var17.field2459;
                                    var18.field2455 += var17.field2455;
                                    var18.field2453 += var17.field2453;
                                    var18.field2458 += var17.field2458;
                                    var19.field2459 += var12.field2459;
                                    var19.field2455 += var12.field2455;
                                    var19.field2453 += var12.field2453;
                                    var19.field2458 += var12.field2458;
                                    ++var6;
                                    field713[var9] = field752;
                                    field730[var16] = field752;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field733; ++var10) {
                if (field713[arg0.field724[var10]] == field752 && field713[arg0.field710[var10]] == field752 && field713[arg0.field739[var10]] == field752) {
                    if (arg0.field714 == null) {
                        arg0.field714 = new byte[arg0.field733];
                    }
                    arg0.field714[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field733; ++var11) {
                if (field730[arg1.field724[var11]] == field752 && field730[arg1.field710[var11]] == field752 && field730[arg1.field739[var11]] == field752) {
                    if (arg1.field714 == null) {
                        arg1.field714 = new byte[arg1.field733];
                    }
                    arg1.field714[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(SS)V")
    public final void method228(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field733; ++var3) {
            if (this.field709[var3] == arg0) {
                this.field709[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "()V")
    public final void method229() {
        for (int var1 = 0; var1 < this.field742; ++var1) {
            int var2 = this.field712[var1];
            this.field712[var1] = this.field715[var1];
            this.field715[var1] = -var2;
        }
        this.method211();
    }

    @OriginalMember(owner = "client!df", name = "i", descriptor = "()V")
    public final void method230() {
        for (int var1 = 0; var1 < this.field742; ++var1) {
            int var2 = this.field715[var1];
            this.field715[var1] = this.field712[var1];
            this.field712[var1] = -var2;
        }
        this.method211();
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    private class28() {
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V")
    private class28(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method218(arg0);
        } else {
            this.method225(arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([Ldf;I)V")
    public class28(class28[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field742 = 0;
        this.field733 = 0;
        this.field738 = 0;
        this.field749 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class28 var15 = arg0[var9];
            if (var15 != null) {
                this.field742 += var15.field742;
                this.field733 += var15.field733;
                this.field738 += var15.field738;
                if (var15.field748 != null) {
                    var4 = true;
                } else {
                    if (this.field749 == -1) {
                        this.field749 = var15.field749;
                    }
                    if (this.field749 != var15.field749) {
                        var4 = true;
                    }
                }
                var3 |= var15.field714 != null;
                var5 |= var15.field721 != null;
                var6 |= var15.field711 != null;
                var7 |= var15.field753 != null;
                var8 |= var15.field731 != null;
            }
        }
        this.field715 = new int[this.field742];
        this.field754 = new int[this.field742];
        this.field712 = new int[this.field742];
        this.field740 = new int[this.field742];
        this.field724 = new int[this.field733];
        this.field710 = new int[this.field733];
        this.field739 = new int[this.field733];
        if (var3) {
            this.field714 = new byte[this.field733];
        }
        if (var4) {
            this.field748 = new byte[this.field733];
        }
        if (var5) {
            this.field721 = new byte[this.field733];
        }
        if (var6) {
            this.field711 = new int[this.field733];
        }
        if (var7) {
            this.field753 = new short[this.field733];
        }
        if (var8) {
            this.field731 = new byte[this.field733];
        }
        this.field709 = new short[this.field733];
        if (this.field738 > 0) {
            this.field717 = new byte[this.field738];
            this.field719 = new short[this.field738];
            this.field735 = new short[this.field738];
            this.field723 = new short[this.field738];
            this.field741 = new short[this.field738];
            this.field744 = new short[this.field738];
            this.field734 = new short[this.field738];
            this.field727 = new short[this.field738];
            this.field718 = new byte[this.field738];
            this.field737 = new short[this.field738];
            this.field750 = new short[this.field738];
        }
        this.field742 = 0;
        this.field733 = 0;
        this.field738 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class28 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field733; ++var12) {
                    if (var3 && var11.field714 != null) {
                        this.field714[this.field733] = var11.field714[var12];
                    }
                    if (var4) {
                        if (var11.field748 != null) {
                            this.field748[this.field733] = var11.field748[var12];
                        } else {
                            this.field748[this.field733] = var11.field749;
                        }
                    }
                    if (var5 && var11.field721 != null) {
                        this.field721[this.field733] = var11.field721[var12];
                    }
                    if (var6 && var11.field711 != null) {
                        this.field711[this.field733] = var11.field711[var12];
                    }
                    if (var7) {
                        if (var11.field753 != null) {
                            this.field753[this.field733] = var11.field753[var12];
                        } else {
                            this.field753[this.field733] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field731 != null && var11.field731[var12] != -1) {
                            this.field731[this.field733] = (byte) (var11.field731[var12] + this.field738);
                        } else {
                            this.field731[this.field733] = -1;
                        }
                    }
                    this.field709[this.field733] = var11.field709[var12];
                    this.field724[this.field733] = this.method209(var11, var11.field724[var12]);
                    this.field710[this.field733] = this.method209(var11, var11.field710[var12]);
                    this.field739[this.field733] = this.method209(var11, var11.field739[var12]);
                    ++this.field733;
                }
                for (int var13 = 0; var13 < var11.field738; ++var13) {
                    byte var14 = this.field717[this.field738] = var11.field717[var13];
                    if (var14 == 0) {
                        this.field719[this.field738] = (short) this.method209(var11, var11.field719[var13]);
                        this.field735[this.field738] = (short) this.method209(var11, var11.field735[var13]);
                        this.field723[this.field738] = (short) this.method209(var11, var11.field723[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field719[this.field738] = var11.field719[var13];
                        this.field735[this.field738] = var11.field735[var13];
                        this.field723[this.field738] = var11.field723[var13];
                        this.field741[this.field738] = var11.field741[var13];
                        this.field744[this.field738] = var11.field744[var13];
                        this.field734[this.field738] = var11.field734[var13];
                        this.field727[this.field738] = var11.field727[var13];
                        this.field718[this.field738] = var11.field718[var13];
                        this.field737[this.field738] = var11.field737[var13];
                    }
                    if (var14 == 2) {
                        this.field750[this.field738] = var11.field750[var13];
                    }
                    ++this.field738;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "j", descriptor = "()V")
    public static void method231() {
        field713 = null;
        field730 = null;
        field736 = null;
        field722 = null;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ldf;ZZZZ)V")
    public class28(class28 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field742 = arg0.field742;
        this.field733 = arg0.field733;
        this.field738 = arg0.field738;
        if (arg1) {
            this.field715 = arg0.field715;
            this.field754 = arg0.field754;
            this.field712 = arg0.field712;
        } else {
            this.field715 = new int[this.field742];
            this.field754 = new int[this.field742];
            this.field712 = new int[this.field742];
            for (int var6 = 0; var6 < this.field742; ++var6) {
                this.field715[var6] = arg0.field715[var6];
                this.field754[var6] = arg0.field754[var6];
                this.field712[var6] = arg0.field712[var6];
            }
        }
        if (arg2) {
            this.field709 = arg0.field709;
        } else {
            this.field709 = new short[this.field733];
            for (int var7 = 0; var7 < this.field733; ++var7) {
                this.field709[var7] = arg0.field709[var7];
            }
        }
        if (!arg3 && arg0.field753 != null) {
            this.field753 = new short[this.field733];
            for (int var8 = 0; var8 < this.field733; ++var8) {
                this.field753[var8] = arg0.field753[var8];
            }
        } else {
            this.field753 = arg0.field753;
        }
        if (arg4) {
            this.field721 = arg0.field721;
        } else {
            this.field721 = new byte[this.field733];
            if (arg0.field721 == null) {
                for (int var9 = 0; var9 < this.field733; ++var9) {
                    this.field721[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field733; ++var10) {
                    this.field721[var10] = arg0.field721[var10];
                }
            }
        }
        this.field724 = arg0.field724;
        this.field710 = arg0.field710;
        this.field739 = arg0.field739;
        this.field714 = arg0.field714;
        this.field748 = arg0.field748;
        this.field731 = arg0.field731;
        this.field749 = arg0.field749;
        this.field717 = arg0.field717;
        this.field719 = arg0.field719;
        this.field735 = arg0.field735;
        this.field723 = arg0.field723;
        this.field741 = arg0.field741;
        this.field744 = arg0.field744;
        this.field734 = arg0.field734;
        this.field727 = arg0.field727;
        this.field718 = arg0.field718;
        this.field737 = arg0.field737;
        this.field750 = arg0.field750;
        this.field740 = arg0.field740;
        this.field711 = arg0.field711;
        this.field746 = arg0.field746;
        this.field745 = arg0.field745;
        this.field725 = arg0.field725;
        this.field732 = arg0.field732;
        this.field743 = arg0.field743;
        this.field716 = arg0.field716;
        this.field726 = arg0.field726;
    }
}
