import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 extends class29 {

    @OriginalMember(owner = "client!de", name = "mb", descriptor = "Z")
    private boolean field812 = false;

    @OriginalMember(owner = "client!de", name = "zb", descriptor = "B")
    private byte field825 = 0;

    @OriginalMember(owner = "client!de", name = "Cb", descriptor = "I")
    private int field828 = 0;

    @OriginalMember(owner = "client!de", name = "Bb", descriptor = "I")
    private int field827 = 0;

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
    private int field809 = 0;

    @OriginalMember(owner = "client!de", name = "ub", descriptor = "[I")
    private int[] field820;

    @OriginalMember(owner = "client!de", name = "Ob", descriptor = "[I")
    private int[] field840;

    @OriginalMember(owner = "client!de", name = "Ib", descriptor = "[I")
    private int[] field834;

    @OriginalMember(owner = "client!de", name = "Pb", descriptor = "[I")
    private int[] field841;

    @OriginalMember(owner = "client!de", name = "Eb", descriptor = "[I")
    private int[] field830;

    @OriginalMember(owner = "client!de", name = "rb", descriptor = "[I")
    private int[] field817;

    @OriginalMember(owner = "client!de", name = "vb", descriptor = "[I")
    private int[] field821;

    @OriginalMember(owner = "client!de", name = "Nb", descriptor = "[I")
    private int[] field839;

    @OriginalMember(owner = "client!de", name = "kb", descriptor = "[I")
    private int[] field810;

    @OriginalMember(owner = "client!de", name = "Fb", descriptor = "[I")
    private int[] field831;

    @OriginalMember(owner = "client!de", name = "Db", descriptor = "[B")
    private byte[] field829;

    @OriginalMember(owner = "client!de", name = "Lb", descriptor = "[B")
    private byte[] field837;

    @OriginalMember(owner = "client!de", name = "wb", descriptor = "[B")
    private byte[] field822;

    @OriginalMember(owner = "client!de", name = "nb", descriptor = "[B")
    private byte[] field813;

    @OriginalMember(owner = "client!de", name = "tb", descriptor = "[I")
    private int[] field819;

    @OriginalMember(owner = "client!de", name = "Hb", descriptor = "[S")
    private short[] field833;

    @OriginalMember(owner = "client!de", name = "Ab", descriptor = "[[I")
    private int[][] field826;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "[[I")
    private int[][] field806;

    @OriginalMember(owner = "client!de", name = "pb", descriptor = "[Lad;")
    private class5[] field815;

    @OriginalMember(owner = "client!de", name = "Kb", descriptor = "[Lsb;")
    private class124[] field836;

    @OriginalMember(owner = "client!de", name = "Jb", descriptor = "[Lad;")
    private class5[] field835;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "S")
    public short field808;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "S")
    public short field807;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "[I")
    private static int[] field805 = new int[128];

    @OriginalMember(owner = "client!de", name = "yb", descriptor = "I")
    private static int field824 = 0;

    @OriginalMember(owner = "client!de", name = "Gb", descriptor = "[I")
    private static int[] field832 = new int[10000];

    @OriginalMember(owner = "client!de", name = "qb", descriptor = "[I")
    private static int[] field816 = new int[10000];

    @OriginalMember(owner = "client!de", name = "lb", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!de", name = "ob", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "client!de", name = "sb", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "client!de", name = "xb", descriptor = "I")
    private int field823;

    @OriginalMember(owner = "client!de", name = "Mb", descriptor = "I")
    private int field838;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lff;II)Lde;")
    public static final class27 method215(class42 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method315(arg2, true, arg1);
        return var3 == null ? null : new class27(var3);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()Lde;")
    public final class27 method216() {
        class27 var1 = new class27();
        if (this.field829 != null) {
            var1.field829 = new byte[this.field828];
            for (int var2 = 0; var2 < this.field828; ++var2) {
                var1.field829[var2] = this.field829[var2];
            }
        }
        var1.field827 = this.field827;
        var1.field828 = this.field828;
        var1.field809 = this.field809;
        var1.field820 = this.field820;
        var1.field840 = this.field840;
        var1.field834 = this.field834;
        var1.field841 = this.field841;
        var1.field830 = this.field830;
        var1.field817 = this.field817;
        var1.field822 = this.field822;
        var1.field813 = this.field813;
        var1.field837 = this.field837;
        var1.field833 = this.field833;
        var1.field825 = this.field825;
        var1.field821 = this.field821;
        var1.field839 = this.field839;
        var1.field810 = this.field810;
        var1.field831 = this.field831;
        var1.field819 = this.field819;
        var1.field826 = this.field826;
        var1.field806 = this.field806;
        var1.field815 = this.field815;
        var1.field836 = this.field836;
        var1.field808 = this.field808;
        var1.field807 = this.field807;
        return var1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
    public final void method217(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field827; ++var4) {
            this.field820[var4] = this.field820[var4] * arg0 / 128;
            this.field840[var4] = this.field840[var4] * arg1 / 128;
            this.field834[var4] = this.field834[var4] * arg2 / 128;
        }
        this.method228();
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)I")
    private static final int method218(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)I")
    private static final int method219(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field805[arg0];
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(III)V")
    public final void method220(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field827; ++var4) {
            this.field820[var4] += arg0;
            this.field840[var4] += arg1;
            this.field834[var4] += arg2;
        }
        this.method228();
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()V")
    private final void method221() {
        if (!this.field812) {
            super.field871 = 0;
            this.field838 = 0;
            this.field823 = 999999;
            this.field818 = -999999;
            this.field814 = -99999;
            this.field811 = 99999;
            for (int var1 = 0; var1 < this.field827; ++var1) {
                int var2 = this.field820[var1];
                int var3 = this.field840[var1];
                int var4 = this.field834[var1];
                if (var2 < this.field823) {
                    this.field823 = var2;
                }
                if (var2 > this.field818) {
                    this.field818 = var2;
                }
                if (var4 < this.field811) {
                    this.field811 = var4;
                }
                if (var4 > this.field814) {
                    this.field814 = var4;
                }
                if (-var3 > super.field871) {
                    super.field871 = -var3;
                }
                if (var3 > this.field838) {
                    this.field838 = var3;
                }
            }
            this.field812 = true;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lde;Lde;IIIZ)V")
    public static final void method222(class27 arg0, class27 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method221();
        arg0.method231();
        arg1.method221();
        arg1.method231();
        ++field824;
        int var6 = 0;
        int[] var7 = arg1.field820;
        int var8 = arg1.field827;
        for (int var9 = 0; var9 < arg0.field827; ++var9) {
            class5 var12 = arg0.field815[var9];
            if (var12.field142 != 0) {
                int var13 = arg0.field840[var9] - arg3;
                if (var13 <= arg1.field838) {
                    int var14 = arg0.field820[var9] - arg2;
                    if (var14 >= arg1.field823 && var14 <= arg1.field818) {
                        int var15 = arg0.field834[var9] - arg4;
                        if (var15 >= arg1.field811 && var15 <= arg1.field814) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class5 var17 = arg1.field815[var16];
                                if (var7[var16] == var14 && arg1.field834[var16] == var15 && arg1.field840[var16] == var13 && var17.field142 != 0) {
                                    if (arg0.field835 == null) {
                                        arg0.field835 = new class5[arg0.field827];
                                    }
                                    if (arg1.field835 == null) {
                                        arg1.field835 = new class5[var8];
                                    }
                                    class5 var18 = arg0.field835[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field835[var9] = new class5(var12);
                                    }
                                    class5 var19 = arg1.field835[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field835[var16] = new class5(var17);
                                    }
                                    var18.field118 += var17.field118;
                                    var18.field116 += var17.field116;
                                    var18.field97 += var17.field97;
                                    var18.field142 += var17.field142;
                                    var19.field118 += var12.field118;
                                    var19.field116 += var12.field116;
                                    var19.field97 += var12.field97;
                                    var19.field142 += var12.field142;
                                    ++var6;
                                    field816[var9] = field824;
                                    field832[var16] = field824;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field828; ++var10) {
                if (field816[arg0.field841[var10]] == field824 && field816[arg0.field830[var10]] == field824 && field816[arg0.field817[var10]] == field824) {
                    if (arg0.field829 == null) {
                        arg0.field829 = new byte[arg0.field828];
                    }
                    arg0.field829[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field828; ++var11) {
                if (field832[arg1.field841[var11]] == field824 && field832[arg1.field830[var11]] == field824 && field832[arg1.field817[var11]] == field824) {
                    if (arg1.field829 == null) {
                        arg1.field829 = new byte[arg1.field828];
                    }
                    arg1.field829[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)Lbe;")
    public final class13 method223(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method231();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class13 var8 = new class13();
        var8.field333 = new int[this.field828];
        var8.field312 = new int[this.field828];
        var8.field328 = new int[this.field828];
        for (int var9 = 0; var9 < this.field828; ++var9) {
            byte var10;
            if (this.field829 == null) {
                var10 = 0;
            } else {
                var10 = this.field829[var9];
            }
            if (this.field837 != null && this.field837[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class124 var17 = this.field836[var9];
                        int var18 = (var17.field2861 * arg4 + var17.field2866 * arg2 + var17.field2859 * arg3) / (var7 / 2 + var7) + arg0;
                        var8.field333[var9] = method219(var18);
                        var8.field328[var9] = -1;
                    } else {
                        var8.field328[var9] = -2;
                    }
                } else {
                    class5 var11;
                    if (this.field835 != null && this.field835[this.field841[var9]] != null) {
                        var11 = this.field835[this.field841[var9]];
                    } else {
                        var11 = this.field815[this.field841[var9]];
                    }
                    int var12 = (var11.field97 * arg4 + var11.field118 * arg2 + var11.field116 * arg3) / (var11.field142 * var7) + arg0;
                    var8.field333[var9] = method219(var12);
                    class5 var13;
                    if (this.field835 != null && this.field835[this.field830[var9]] != null) {
                        var13 = this.field835[this.field830[var9]];
                    } else {
                        var13 = this.field815[this.field830[var9]];
                    }
                    int var14 = (var13.field97 * arg4 + var13.field118 * arg2 + var13.field116 * arg3) / (var13.field142 * var7) + arg0;
                    var8.field312[var9] = method219(var14);
                    class5 var15;
                    if (this.field835 != null && this.field835[this.field817[var9]] != null) {
                        var15 = this.field835[this.field817[var9]];
                    } else {
                        var15 = this.field815[this.field817[var9]];
                    }
                    int var16 = (var15.field97 * arg4 + var15.field118 * arg2 + var15.field116 * arg3) / (var15.field142 * var7) + arg0;
                    var8.field328[var9] = method219(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class124 var26 = this.field836[var9];
                    int var27 = (var26.field2861 * arg4 + var26.field2866 * arg2 + var26.field2859 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field333[var9] = method218(this.field833[var9] & 65535, var27);
                    var8.field328[var9] = -1;
                } else {
                    var8.field328[var9] = -2;
                }
            } else {
                int var19 = this.field833[var9] & 65535;
                class5 var20;
                if (this.field835 != null && this.field835[this.field841[var9]] != null) {
                    var20 = this.field835[this.field841[var9]];
                } else {
                    var20 = this.field815[this.field841[var9]];
                }
                int var21 = (var20.field97 * arg4 + var20.field118 * arg2 + var20.field116 * arg3) / (var20.field142 * var7) + arg0;
                var8.field333[var9] = method218(var19, var21);
                class5 var22;
                if (this.field835 != null && this.field835[this.field830[var9]] != null) {
                    var22 = this.field835[this.field830[var9]];
                } else {
                    var22 = this.field815[this.field830[var9]];
                }
                int var23 = (var22.field97 * arg4 + var22.field118 * arg2 + var22.field116 * arg3) / (var22.field142 * var7) + arg0;
                var8.field312[var9] = method218(var19, var23);
                class5 var24;
                if (this.field835 != null && this.field835[this.field817[var9]] != null) {
                    var24 = this.field835[this.field817[var9]];
                } else {
                    var24 = this.field815[this.field817[var9]];
                }
                int var25 = (var24.field97 * arg4 + var24.field118 * arg2 + var24.field116 * arg3) / (var24.field142 * var7) + arg0;
                var8.field328[var9] = method218(var19, var25);
            }
        }
        this.method230();
        var8.field321 = this.field827;
        var8.field326 = this.field820;
        var8.field320 = this.field840;
        var8.field327 = this.field834;
        var8.field325 = this.field828;
        var8.field318 = this.field841;
        var8.field310 = this.field830;
        var8.field307 = this.field817;
        var8.field314 = this.field822;
        var8.field323 = this.field813;
        var8.field313 = this.field837;
        if (var8.field313 != null) {
            var8.field324 = this.field833;
        } else {
            var8.field324 = null;
        }
        var8.field315 = this.field825;
        var8.field311 = this.field809;
        var8.field317 = this.field821;
        var8.field337 = this.field839;
        var8.field331 = this.field810;
        var8.field334 = this.field826;
        var8.field329 = this.field806;
        return var8;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()V")
    public final void method224() {
        for (int var1 = 0; var1 < this.field827; ++var1) {
            int var2 = this.field820[var1];
            this.field820[var1] = this.field834[var1];
            this.field834[var1] = -var2;
        }
        this.method228();
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()V")
    public final void method225() {
        for (int var1 = 0; var1 < this.field827; ++var1) {
            this.field820[var1] = -this.field820[var1];
            this.field834[var1] = -this.field834[var1];
        }
        this.method228();
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "()V")
    public static void method226() {
        field816 = null;
        field832 = null;
        field805 = null;
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "()V")
    public final void method227() {
        for (int var1 = 0; var1 < this.field827; ++var1) {
            int var2 = this.field834[var1];
            this.field834[var1] = this.field820[var1];
            this.field820[var1] = -var2;
        }
        this.method228();
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "()V")
    private final void method228() {
        this.field815 = null;
        this.field835 = null;
        this.field836 = null;
        this.field812 = false;
    }

    @OriginalMember(owner = "client!de", name = "h", descriptor = "()V")
    public final void method229() {
        for (int var1 = 0; var1 < this.field827; ++var1) {
            this.field834[var1] = -this.field834[var1];
        }
        for (int var2 = 0; var2 < this.field828; ++var2) {
            int var3 = this.field841[var2];
            this.field841[var2] = this.field817[var2];
            this.field817[var2] = var3;
        }
        this.method228();
    }

    @OriginalMember(owner = "client!de", name = "i", descriptor = "()V")
    private final void method230() {
        int var10002;
        if (this.field831 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field827; ++var3) {
                int var7 = this.field831[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field826 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field826[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field827) {
                int var6 = this.field831[var5];
                this.field826[var6][var1[var6]++] = var5++;
            }
            this.field831 = null;
        }
        if (this.field819 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field828; ++var10) {
                int var14 = this.field819[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field806 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field806[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field828) {
                int var13 = this.field819[var12];
                this.field806[var13][var8[var13]++] = var12++;
            }
            this.field819 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "j", descriptor = "()V")
    public final void method231() {
        if (this.field815 == null) {
            this.field815 = new class5[this.field827];
            for (int var1 = 0; var1 < this.field827; ++var1) {
                this.field815[var1] = new class5();
            }
            for (int var2 = 0; var2 < this.field828; ++var2) {
                int var3 = this.field841[var2];
                int var4 = this.field830[var2];
                int var5 = this.field817[var2];
                int var6 = this.field820[var4] - this.field820[var3];
                int var7 = this.field840[var4] - this.field840[var3];
                int var8 = this.field834[var4] - this.field834[var3];
                int var9 = this.field820[var5] - this.field820[var3];
                int var10 = this.field840[var5] - this.field840[var3];
                int var11 = this.field834[var5] - this.field834[var3];
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
                if (this.field829 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field829[var2];
                }
                if (var19 == 0) {
                    class5 var20 = this.field815[var3];
                    var20.field118 += var16;
                    var20.field116 += var17;
                    var20.field97 += var18;
                    ++var20.field142;
                    class5 var21 = this.field815[var4];
                    var21.field118 += var16;
                    var21.field116 += var17;
                    var21.field97 += var18;
                    ++var21.field142;
                    class5 var22 = this.field815[var5];
                    var22.field118 += var16;
                    var22.field116 += var17;
                    var22.field97 += var18;
                    ++var22.field142;
                } else if (var19 == 1) {
                    if (this.field836 == null) {
                        this.field836 = new class124[this.field828];
                    }
                    class124 var23 = this.field836[var2] = new class124();
                    var23.field2866 = var16;
                    var23.field2859 = var17;
                    var23.field2861 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIZ)Lde;")
    public final class27 method232(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class27 var6;
            if (arg4) {
                var6 = new class27();
                var6.field827 = this.field827;
                var6.field828 = this.field828;
                var6.field809 = this.field809;
                var6.field820 = this.field820;
                var6.field834 = this.field834;
                var6.field841 = this.field841;
                var6.field830 = this.field830;
                var6.field817 = this.field817;
                var6.field829 = this.field829;
                var6.field822 = this.field822;
                var6.field813 = this.field813;
                var6.field837 = this.field837;
                var6.field833 = this.field833;
                var6.field825 = this.field825;
                var6.field821 = this.field821;
                var6.field839 = this.field839;
                var6.field810 = this.field810;
                var6.field831 = this.field831;
                var6.field819 = this.field819;
                var6.field826 = this.field826;
                var6.field806 = this.field806;
                var6.field808 = this.field808;
                var6.field807 = this.field807;
                var6.field840 = new int[var6.field827];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field827; ++var8) {
                int var9 = this.field820[var8];
                int var10 = this.field840[var8];
                int var11 = this.field834[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field840[var8] = var10 + var14 - var7;
            }
            var6.method228();
            return var6;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lde;I)I")
    private final int method233(class27 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field820[arg1];
        int var5 = arg0.field840[arg1];
        int var6 = arg0.field834[arg1];
        for (int var7 = 0; var7 < this.field827; ++var7) {
            if (this.field820[var7] == var4 && this.field840[var7] == var5 && this.field834[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field820[this.field827] = var4;
            this.field840[this.field827] = var5;
            this.field834[this.field827] = var6;
            if (arg0.field831 != null) {
                this.field831[this.field827] = arg0.field831[arg1];
            }
            var3 = this.field827++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(SS)V")
    public final void method234(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field828; ++var3) {
            if (this.field833[var3] == arg0) {
                this.field833[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    private class27() {
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "([B)V")
    private class27(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class148 var4 = new class148(arg0);
        class148 var5 = new class148(arg0);
        class148 var6 = new class148(arg0);
        class148 var7 = new class148(arg0);
        class148 var8 = new class148(arg0);
        var4.field3601 = arg0.length - 18;
        int var9 = var4.method1140(-1);
        int var10 = var4.method1140(-1);
        int var11 = var4.method1137(255);
        int var12 = var4.method1137(255);
        int var13 = var4.method1137(255);
        int var14 = var4.method1137(255);
        int var15 = var4.method1137(255);
        int var16 = var4.method1137(255);
        int var17 = var4.method1140(-1);
        int var18 = var4.method1140(-1);
        int var19 = var4.method1140(-1);
        int var20 = var4.method1140(-1);
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
        this.field827 = var9;
        this.field828 = var10;
        this.field809 = var11;
        this.field820 = new int[var9];
        this.field840 = new int[var9];
        this.field834 = new int[var9];
        this.field841 = new int[var10];
        this.field830 = new int[var10];
        this.field817 = new int[var10];
        if (var11 > 0) {
            this.field821 = new int[var11];
            this.field839 = new int[var11];
            this.field810 = new int[var11];
        }
        if (var16 == 1) {
            this.field831 = new int[var9];
        }
        if (var12 == 1) {
            this.field829 = new byte[var10];
            this.field837 = new byte[var10];
        }
        if (var13 == 255) {
            this.field822 = new byte[var10];
        } else {
            this.field825 = (byte) var13;
        }
        if (var14 == 1) {
            this.field813 = new byte[var10];
        }
        if (var15 == 1) {
            this.field819 = new int[var10];
        }
        this.field833 = new short[var10];
        var4.field3601 = var21;
        var5.field3601 = var36;
        var6.field3601 = var38;
        var7.field3601 = var40;
        var8.field3601 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method1137(255);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method1148(255);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method1148(255);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method1148(255);
            }
            this.field820[var46] = var43 + var60;
            this.field840[var46] = var44 + var61;
            this.field834[var46] = var45 + var62;
            var43 = this.field820[var46];
            var44 = this.field840[var46];
            var45 = this.field834[var46];
            if (var16 == 1) {
                this.field831[var46] = var8.method1137(255);
            }
        }
        var4.field3601 = var32;
        var5.field3601 = var28;
        var6.field3601 = var26;
        var7.field3601 = var30;
        var8.field3601 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field833[var47] = (short) var4.method1140(-1);
            if (var12 == 1) {
                int var58 = var5.method1137(255);
                if ((var58 & 1) == 1) {
                    this.field829[var47] = 1;
                    var3 = true;
                } else {
                    this.field829[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field837[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field837[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field822[var47] = var6.method1124(8);
            }
            if (var14 == 1) {
                this.field813[var47] = var7.method1124(8);
            }
            if (var15 == 1) {
                this.field819[var47] = var8.method1137(255);
            }
        }
        var4.field3601 = var25;
        var5.field3601 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method1137(255);
            if (var54 == 1) {
                var48 = var4.method1148(255) + var51;
                var49 = var4.method1148(255) + var48;
                var50 = var4.method1148(255) + var49;
                var51 = var50;
                this.field841[var52] = var48;
                this.field830[var52] = var49;
                this.field817[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method1148(255) + var51;
                var51 = var50;
                this.field841[var52] = var48;
                this.field830[var52] = var49;
                this.field817[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method1148(255) + var51;
                var51 = var50;
                this.field841[var52] = var48;
                this.field830[var52] = var49;
                this.field817[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method1148(255) + var51;
                var51 = var50;
                this.field841[var52] = var48;
                this.field830[var52] = var57;
                this.field817[var52] = var50;
            }
        }
        var4.field3601 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field821[var53] = var4.method1140(-1);
            this.field839[var53] = var4.method1140(-1);
            this.field810[var53] = var4.method1140(-1);
        }
        if (!var2) {
            this.field837 = null;
        }
        if (!var3) {
            this.field829 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "([Lde;I)V")
    public class27(class27[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field827 = 0;
        this.field828 = 0;
        this.field809 = 0;
        this.field825 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class27 var14 = arg0[var8];
            if (var14 != null) {
                this.field827 += var14.field827;
                this.field828 += var14.field828;
                this.field809 += var14.field809;
                if (var14.field822 != null) {
                    var4 = true;
                } else {
                    if (this.field825 == -1) {
                        this.field825 = var14.field825;
                    }
                    if (this.field825 != var14.field825) {
                        var4 = true;
                    }
                }
                var3 |= var14.field829 != null;
                var5 |= var14.field813 != null;
                var6 |= var14.field819 != null;
                var7 |= var14.field837 != null;
            }
        }
        this.field820 = new int[this.field827];
        this.field840 = new int[this.field827];
        this.field834 = new int[this.field827];
        this.field831 = new int[this.field827];
        this.field841 = new int[this.field828];
        this.field830 = new int[this.field828];
        this.field817 = new int[this.field828];
        if (this.field809 > 0) {
            this.field821 = new int[this.field809];
            this.field839 = new int[this.field809];
            this.field810 = new int[this.field809];
        }
        if (var3) {
            this.field829 = new byte[this.field828];
        }
        if (var4) {
            this.field822 = new byte[this.field828];
        }
        if (var5) {
            this.field813 = new byte[this.field828];
        }
        if (var7) {
            this.field837 = new byte[this.field828];
        }
        if (var6) {
            this.field819 = new int[this.field828];
        }
        this.field833 = new short[this.field828];
        this.field827 = 0;
        this.field828 = 0;
        this.field809 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class27 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field828; ++var12) {
                    if (var3 && var11.field829 != null) {
                        this.field829[this.field828] = var11.field829[var12];
                    }
                    if (var4) {
                        if (var11.field822 != null) {
                            this.field822[this.field828] = var11.field822[var12];
                        } else {
                            this.field822[this.field828] = var11.field825;
                        }
                    }
                    if (var5 && var11.field813 != null) {
                        this.field813[this.field828] = var11.field813[var12];
                    }
                    if (var7) {
                        if (var11.field837 != null && var11.field837[var12] != -1) {
                            this.field837[this.field828] = (byte) (var11.field837[var12] + var9);
                        } else {
                            this.field837[this.field828] = -1;
                        }
                    }
                    if (var6 && var11.field819 != null) {
                        this.field819[this.field828] = var11.field819[var12];
                    }
                    this.field833[this.field828] = var11.field833[var12];
                    this.field841[this.field828] = this.method233(var11, var11.field841[var12]);
                    this.field830[this.field828] = this.method233(var11, var11.field830[var12]);
                    this.field817[this.field828] = this.method233(var11, var11.field817[var12]);
                    ++this.field828;
                }
                for (int var13 = 0; var13 < var11.field809; ++var13) {
                    this.field821[this.field809] = this.method233(var11, var11.field821[var13]);
                    this.field839[this.field809] = this.method233(var11, var11.field839[var13]);
                    this.field810[this.field809] = this.method233(var11, var11.field810[var13]);
                    ++this.field809;
                }
                var9 += var11.field809;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lde;ZZZ)V")
    public class27(class27 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field827 = arg0.field827;
        this.field828 = arg0.field828;
        this.field809 = arg0.field809;
        if (arg1) {
            this.field820 = arg0.field820;
            this.field840 = arg0.field840;
            this.field834 = arg0.field834;
        } else {
            this.field820 = new int[this.field827];
            this.field840 = new int[this.field827];
            this.field834 = new int[this.field827];
            for (int var5 = 0; var5 < this.field827; ++var5) {
                this.field820[var5] = arg0.field820[var5];
                this.field840[var5] = arg0.field840[var5];
                this.field834[var5] = arg0.field834[var5];
            }
        }
        if (arg2) {
            this.field833 = arg0.field833;
        } else {
            this.field833 = new short[this.field828];
            for (int var6 = 0; var6 < this.field828; ++var6) {
                this.field833[var6] = arg0.field833[var6];
            }
        }
        if (arg3) {
            this.field813 = arg0.field813;
        } else {
            this.field813 = new byte[this.field828];
            if (arg0.field813 == null) {
                for (int var7 = 0; var7 < this.field828; ++var7) {
                    this.field813[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field828; ++var8) {
                    this.field813[var8] = arg0.field813[var8];
                }
            }
        }
        this.field841 = arg0.field841;
        this.field830 = arg0.field830;
        this.field817 = arg0.field817;
        this.field829 = arg0.field829;
        this.field822 = arg0.field822;
        this.field837 = arg0.field837;
        this.field825 = arg0.field825;
        this.field821 = arg0.field821;
        this.field839 = arg0.field839;
        this.field810 = arg0.field810;
        this.field831 = arg0.field831;
        this.field819 = arg0.field819;
        this.field826 = arg0.field826;
        this.field806 = arg0.field806;
        this.field815 = arg0.field815;
        this.field836 = arg0.field836;
        this.field835 = arg0.field835;
        this.field808 = arg0.field808;
        this.field807 = arg0.field807;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field805[var0++] = 255;
        }
        while (var0 < 16) {
            field805[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field805[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field805[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field805[var0++] = var1--;
        }
    }
}
