import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 extends class60 {

    @OriginalMember(owner = "client!bc", name = "wb", descriptor = "I")
    private int field214 = 0;

    @OriginalMember(owner = "client!bc", name = "zb", descriptor = "Z")
    private boolean field217 = false;

    @OriginalMember(owner = "client!bc", name = "Bb", descriptor = "I")
    private int field219 = 0;

    @OriginalMember(owner = "client!bc", name = "ub", descriptor = "I")
    private int field212 = 0;

    @OriginalMember(owner = "client!bc", name = "Yb", descriptor = "B")
    private byte field242 = 0;

    @OriginalMember(owner = "client!bc", name = "Hb", descriptor = "[I")
    private int[] field225;

    @OriginalMember(owner = "client!bc", name = "rb", descriptor = "[I")
    private int[] field209;

    @OriginalMember(owner = "client!bc", name = "Gb", descriptor = "[I")
    private int[] field224;

    @OriginalMember(owner = "client!bc", name = "Qb", descriptor = "[I")
    private int[] field234;

    @OriginalMember(owner = "client!bc", name = "qb", descriptor = "[I")
    private int[] field208;

    @OriginalMember(owner = "client!bc", name = "Db", descriptor = "[I")
    private int[] field221;

    @OriginalMember(owner = "client!bc", name = "Ab", descriptor = "[I")
    private int[] field218;

    @OriginalMember(owner = "client!bc", name = "Vb", descriptor = "[I")
    private int[] field239;

    @OriginalMember(owner = "client!bc", name = "Pb", descriptor = "[I")
    private int[] field233;

    @OriginalMember(owner = "client!bc", name = "Kb", descriptor = "[I")
    private int[] field228;

    @OriginalMember(owner = "client!bc", name = "Mb", descriptor = "[B")
    private byte[] field230;

    @OriginalMember(owner = "client!bc", name = "sb", descriptor = "[B")
    private byte[] field210;

    @OriginalMember(owner = "client!bc", name = "tb", descriptor = "[B")
    private byte[] field211;

    @OriginalMember(owner = "client!bc", name = "Tb", descriptor = "[B")
    private byte[] field237;

    @OriginalMember(owner = "client!bc", name = "vb", descriptor = "[I")
    private int[] field213;

    @OriginalMember(owner = "client!bc", name = "Lb", descriptor = "[S")
    private short[] field229;

    @OriginalMember(owner = "client!bc", name = "Ub", descriptor = "[[I")
    private int[][] field238;

    @OriginalMember(owner = "client!bc", name = "Cb", descriptor = "[[I")
    private int[][] field220;

    @OriginalMember(owner = "client!bc", name = "Fb", descriptor = "[Lw;")
    private class143[] field223;

    @OriginalMember(owner = "client!bc", name = "Jb", descriptor = "[Lc;")
    private class15[] field227;

    @OriginalMember(owner = "client!bc", name = "pb", descriptor = "[Lw;")
    private class143[] field207;

    @OriginalMember(owner = "client!bc", name = "Wb", descriptor = "S")
    public short field240;

    @OriginalMember(owner = "client!bc", name = "yb", descriptor = "S")
    public short field216;

    @OriginalMember(owner = "client!bc", name = "ob", descriptor = "[I")
    private static int[] field206 = new int[10000];

    @OriginalMember(owner = "client!bc", name = "Eb", descriptor = "[I")
    private static int[] field222 = new int[10000];

    @OriginalMember(owner = "client!bc", name = "Ob", descriptor = "I")
    private static int field232 = 0;

    @OriginalMember(owner = "client!bc", name = "Nb", descriptor = "[I")
    private static int[] field231 = new int[128];

    @OriginalMember(owner = "client!bc", name = "xb", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!bc", name = "Ib", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!bc", name = "Rb", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!bc", name = "Sb", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!bc", name = "Xb", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()V")
    private final void method77() {
        int var10002;
        if (this.field228 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field219; ++var3) {
                int var7 = this.field228[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field238 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field238[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field219) {
                int var6 = this.field228[var5];
                this.field238[var6][var1[var6]++] = var5++;
            }
            this.field228 = null;
        }
        if (this.field213 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field212; ++var10) {
                int var14 = this.field213[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field220 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field220[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field212) {
                int var13 = this.field213[var12];
                this.field220[var13][var8[var13]++] = var12++;
            }
            this.field213 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)Ldf;")
    public final class28 method78(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method81();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class28 var8 = new class28();
        var8.field836 = new int[this.field212];
        var8.field838 = new int[this.field212];
        var8.field825 = new int[this.field212];
        for (int var9 = 0; var9 < this.field212; ++var9) {
            byte var10;
            if (this.field230 == null) {
                var10 = 0;
            } else {
                var10 = this.field230[var9];
            }
            if (this.field210 != null && this.field210[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class15 var17 = this.field227[var9];
                        int var18 = (var17.field344 * arg4 + var17.field342 * arg2 + var17.field340 * arg3) / (var7 / 2 + var7) + arg0;
                        var8.field836[var9] = method82(var18);
                        var8.field825[var9] = -1;
                    } else {
                        var8.field825[var9] = -2;
                    }
                } else {
                    class143 var11;
                    if (this.field207 != null && this.field207[this.field234[var9]] != null) {
                        var11 = this.field207[this.field234[var9]];
                    } else {
                        var11 = this.field223[this.field234[var9]];
                    }
                    int var12 = (var11.field3402 * arg4 + var11.field3410 * arg2 + var11.field3407 * arg3) / (var11.field3398 * var7) + arg0;
                    var8.field836[var9] = method82(var12);
                    class143 var13;
                    if (this.field207 != null && this.field207[this.field208[var9]] != null) {
                        var13 = this.field207[this.field208[var9]];
                    } else {
                        var13 = this.field223[this.field208[var9]];
                    }
                    int var14 = (var13.field3402 * arg4 + var13.field3410 * arg2 + var13.field3407 * arg3) / (var13.field3398 * var7) + arg0;
                    var8.field838[var9] = method82(var14);
                    class143 var15;
                    if (this.field207 != null && this.field207[this.field221[var9]] != null) {
                        var15 = this.field207[this.field221[var9]];
                    } else {
                        var15 = this.field223[this.field221[var9]];
                    }
                    int var16 = (var15.field3402 * arg4 + var15.field3410 * arg2 + var15.field3407 * arg3) / (var15.field3398 * var7) + arg0;
                    var8.field825[var9] = method82(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class15 var26 = this.field227[var9];
                    int var27 = (var26.field344 * arg4 + var26.field342 * arg2 + var26.field340 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field836[var9] = method95(this.field229[var9] & 65535, var27);
                    var8.field825[var9] = -1;
                } else {
                    var8.field825[var9] = -2;
                }
            } else {
                int var19 = this.field229[var9] & 65535;
                class143 var20;
                if (this.field207 != null && this.field207[this.field234[var9]] != null) {
                    var20 = this.field207[this.field234[var9]];
                } else {
                    var20 = this.field223[this.field234[var9]];
                }
                int var21 = (var20.field3402 * arg4 + var20.field3410 * arg2 + var20.field3407 * arg3) / (var20.field3398 * var7) + arg0;
                var8.field836[var9] = method95(var19, var21);
                class143 var22;
                if (this.field207 != null && this.field207[this.field208[var9]] != null) {
                    var22 = this.field207[this.field208[var9]];
                } else {
                    var22 = this.field223[this.field208[var9]];
                }
                int var23 = (var22.field3402 * arg4 + var22.field3410 * arg2 + var22.field3407 * arg3) / (var22.field3398 * var7) + arg0;
                var8.field838[var9] = method95(var19, var23);
                class143 var24;
                if (this.field207 != null && this.field207[this.field221[var9]] != null) {
                    var24 = this.field207[this.field221[var9]];
                } else {
                    var24 = this.field223[this.field221[var9]];
                }
                int var25 = (var24.field3402 * arg4 + var24.field3410 * arg2 + var24.field3407 * arg3) / (var24.field3398 * var7) + arg0;
                var8.field825[var9] = method95(var19, var25);
            }
        }
        this.method77();
        var8.field826 = this.field219;
        var8.field831 = this.field225;
        var8.field832 = this.field209;
        var8.field813 = this.field224;
        var8.field829 = this.field212;
        var8.field817 = this.field234;
        var8.field828 = this.field208;
        var8.field820 = this.field221;
        var8.field841 = this.field211;
        var8.field814 = this.field237;
        var8.field858 = this.field210;
        if (var8.field858 != null) {
            var8.field835 = this.field229;
        } else {
            var8.field835 = null;
        }
        var8.field827 = this.field242;
        var8.field837 = this.field214;
        var8.field830 = this.field218;
        var8.field818 = this.field239;
        var8.field822 = this.field233;
        var8.field824 = this.field238;
        var8.field819 = this.field220;
        return var8;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lge;II)Lbc;")
    public static final class11 method79(class47 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method526((byte) 113, arg1, arg2);
        return var3 == null ? null : new class11(var3);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
    public final void method80() {
        for (int var1 = 0; var1 < this.field219; ++var1) {
            this.field224[var1] = -this.field224[var1];
        }
        for (int var2 = 0; var2 < this.field212; ++var2) {
            int var3 = this.field234[var2];
            this.field234[var2] = this.field221[var2];
            this.field221[var2] = var3;
        }
        this.method83();
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
    public final void method81() {
        if (this.field223 == null) {
            this.field223 = new class143[this.field219];
            for (int var1 = 0; var1 < this.field219; ++var1) {
                this.field223[var1] = new class143();
            }
            for (int var2 = 0; var2 < this.field212; ++var2) {
                int var3 = this.field234[var2];
                int var4 = this.field208[var2];
                int var5 = this.field221[var2];
                int var6 = this.field225[var4] - this.field225[var3];
                int var7 = this.field209[var4] - this.field209[var3];
                int var8 = this.field224[var4] - this.field224[var3];
                int var9 = this.field225[var5] - this.field225[var3];
                int var10 = this.field209[var5] - this.field209[var3];
                int var11 = this.field224[var5] - this.field224[var3];
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
                if (this.field230 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field230[var2];
                }
                if (var19 == 0) {
                    class143 var20 = this.field223[var3];
                    var20.field3410 += var16;
                    var20.field3407 += var17;
                    var20.field3402 += var18;
                    ++var20.field3398;
                    class143 var21 = this.field223[var4];
                    var21.field3410 += var16;
                    var21.field3407 += var17;
                    var21.field3402 += var18;
                    ++var21.field3398;
                    class143 var22 = this.field223[var5];
                    var22.field3410 += var16;
                    var22.field3407 += var17;
                    var22.field3402 += var18;
                    ++var22.field3398;
                } else if (var19 == 1) {
                    if (this.field227 == null) {
                        this.field227 = new class15[this.field212];
                    }
                    class15 var23 = this.field227[var2] = new class15();
                    var23.field342 = var16;
                    var23.field340 = var17;
                    var23.field344 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)I")
    private static final int method82(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field231[arg0];
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()V")
    private final void method83() {
        this.field223 = null;
        this.field207 = null;
        this.field227 = null;
        this.field217 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIZ)Lbc;")
    public final class11 method84(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class11 var6;
            if (arg4) {
                var6 = new class11();
                var6.field219 = this.field219;
                var6.field212 = this.field212;
                var6.field214 = this.field214;
                var6.field225 = this.field225;
                var6.field224 = this.field224;
                var6.field234 = this.field234;
                var6.field208 = this.field208;
                var6.field221 = this.field221;
                var6.field230 = this.field230;
                var6.field211 = this.field211;
                var6.field237 = this.field237;
                var6.field210 = this.field210;
                var6.field229 = this.field229;
                var6.field242 = this.field242;
                var6.field218 = this.field218;
                var6.field239 = this.field239;
                var6.field233 = this.field233;
                var6.field228 = this.field228;
                var6.field213 = this.field213;
                var6.field238 = this.field238;
                var6.field220 = this.field220;
                var6.field240 = this.field240;
                var6.field216 = this.field216;
                var6.field209 = new int[var6.field219];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field219; ++var8) {
                int var9 = this.field225[var8];
                int var10 = this.field209[var8];
                int var11 = this.field224[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field209[var8] = var10 + var14 - var7;
            }
            var6.method83();
            return var6;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lbc;Lbc;IIIZ)V")
    public static final void method85(class11 arg0, class11 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method89();
        arg0.method81();
        arg1.method89();
        arg1.method81();
        ++field232;
        int var6 = 0;
        int[] var7 = arg1.field225;
        int var8 = arg1.field219;
        for (int var9 = 0; var9 < arg0.field219; ++var9) {
            class143 var12 = arg0.field223[var9];
            if (var12.field3398 != 0) {
                int var13 = arg0.field209[var9] - arg3;
                if (var13 <= arg1.field215) {
                    int var14 = arg0.field225[var9] - arg2;
                    if (var14 >= arg1.field235 && var14 <= arg1.field241) {
                        int var15 = arg0.field224[var9] - arg4;
                        if (var15 >= arg1.field226 && var15 <= arg1.field236) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class143 var17 = arg1.field223[var16];
                                if (var7[var16] == var14 && arg1.field224[var16] == var15 && arg1.field209[var16] == var13 && var17.field3398 != 0) {
                                    if (arg0.field207 == null) {
                                        arg0.field207 = new class143[arg0.field219];
                                    }
                                    if (arg1.field207 == null) {
                                        arg1.field207 = new class143[var8];
                                    }
                                    class143 var18 = arg0.field207[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field207[var9] = new class143(var12);
                                    }
                                    class143 var19 = arg1.field207[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field207[var16] = new class143(var17);
                                    }
                                    var18.field3410 += var17.field3410;
                                    var18.field3407 += var17.field3407;
                                    var18.field3402 += var17.field3402;
                                    var18.field3398 += var17.field3398;
                                    var19.field3410 += var12.field3410;
                                    var19.field3407 += var12.field3407;
                                    var19.field3402 += var12.field3402;
                                    var19.field3398 += var12.field3398;
                                    ++var6;
                                    field222[var9] = field232;
                                    field206[var16] = field232;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field212; ++var10) {
                if (field222[arg0.field234[var10]] == field232 && field222[arg0.field208[var10]] == field232 && field222[arg0.field221[var10]] == field232) {
                    if (arg0.field230 == null) {
                        arg0.field230 = new byte[arg0.field212];
                    }
                    arg0.field230[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field212; ++var11) {
                if (field206[arg1.field234[var11]] == field232 && field206[arg1.field208[var11]] == field232 && field206[arg1.field221[var11]] == field232) {
                    if (arg1.field230 == null) {
                        arg1.field230 = new byte[arg1.field212];
                    }
                    arg1.field230[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "()V")
    public final void method86() {
        for (int var1 = 0; var1 < this.field219; ++var1) {
            this.field225[var1] = -this.field225[var1];
            this.field224[var1] = -this.field224[var1];
        }
        this.method83();
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "()V")
    public final void method87() {
        for (int var1 = 0; var1 < this.field219; ++var1) {
            int var2 = this.field224[var1];
            this.field224[var1] = this.field225[var1];
            this.field225[var1] = -var2;
        }
        this.method83();
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "()Lbc;")
    public final class11 method88() {
        class11 var1 = new class11();
        if (this.field230 != null) {
            var1.field230 = new byte[this.field212];
            for (int var2 = 0; var2 < this.field212; ++var2) {
                var1.field230[var2] = this.field230[var2];
            }
        }
        var1.field219 = this.field219;
        var1.field212 = this.field212;
        var1.field214 = this.field214;
        var1.field225 = this.field225;
        var1.field209 = this.field209;
        var1.field224 = this.field224;
        var1.field234 = this.field234;
        var1.field208 = this.field208;
        var1.field221 = this.field221;
        var1.field211 = this.field211;
        var1.field237 = this.field237;
        var1.field210 = this.field210;
        var1.field229 = this.field229;
        var1.field242 = this.field242;
        var1.field218 = this.field218;
        var1.field239 = this.field239;
        var1.field233 = this.field233;
        var1.field228 = this.field228;
        var1.field213 = this.field213;
        var1.field238 = this.field238;
        var1.field220 = this.field220;
        var1.field223 = this.field223;
        var1.field227 = this.field227;
        var1.field240 = this.field240;
        var1.field216 = this.field216;
        return var1;
    }

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "()V")
    private final void method89() {
        if (!this.field217) {
            super.field1693 = 0;
            this.field215 = 0;
            this.field235 = 999999;
            this.field241 = -999999;
            this.field236 = -99999;
            this.field226 = 99999;
            for (int var1 = 0; var1 < this.field219; ++var1) {
                int var2 = this.field225[var1];
                int var3 = this.field209[var1];
                int var4 = this.field224[var1];
                if (var2 < this.field235) {
                    this.field235 = var2;
                }
                if (var2 > this.field241) {
                    this.field241 = var2;
                }
                if (var4 < this.field226) {
                    this.field226 = var4;
                }
                if (var4 > this.field236) {
                    this.field236 = var4;
                }
                if (-var3 > super.field1693) {
                    super.field1693 = -var3;
                }
                if (var3 > this.field215) {
                    this.field215 = var3;
                }
            }
            this.field217 = true;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)V")
    public final void method90(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field219; ++var4) {
            this.field225[var4] += arg0;
            this.field209[var4] += arg1;
            this.field224[var4] += arg2;
        }
        this.method83();
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(III)V")
    public final void method91(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field219; ++var4) {
            this.field225[var4] = this.field225[var4] * arg0 / 128;
            this.field209[var4] = this.field209[var4] * arg1 / 128;
            this.field224[var4] = this.field224[var4] * arg2 / 128;
        }
        this.method83();
    }

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "()V")
    public final void method92() {
        for (int var1 = 0; var1 < this.field219; ++var1) {
            int var2 = this.field225[var1];
            this.field225[var1] = this.field224[var1];
            this.field224[var1] = -var2;
        }
        this.method83();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lbc;I)I")
    private final int method93(class11 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field225[arg1];
        int var5 = arg0.field209[arg1];
        int var6 = arg0.field224[arg1];
        for (int var7 = 0; var7 < this.field219; ++var7) {
            if (this.field225[var7] == var4 && this.field209[var7] == var5 && this.field224[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field225[this.field219] = var4;
            this.field209[this.field219] = var5;
            this.field224[this.field219] = var6;
            if (arg0.field228 != null) {
                this.field228[this.field219] = arg0.field228[arg1];
            }
            var3 = this.field219++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "()V")
    public static void method94() {
        field222 = null;
        field206 = null;
        field231 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
    private static final int method95(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    private class11() {
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([B)V")
    private class11(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class14 var4 = new class14(arg0);
        class14 var5 = new class14(arg0);
        class14 var6 = new class14(arg0);
        class14 var7 = new class14(arg0);
        class14 var8 = new class14(arg0);
        var4.field314 = arg0.length - 18;
        int var9 = var4.method138((byte) 70);
        int var10 = var4.method138((byte) 113);
        int var11 = var4.method153(true);
        int var12 = var4.method153(true);
        int var13 = var4.method153(true);
        int var14 = var4.method153(true);
        int var15 = var4.method153(true);
        int var16 = var4.method153(true);
        int var17 = var4.method138((byte) 127);
        int var18 = var4.method138((byte) 80);
        int var19 = var4.method138((byte) 120);
        int var20 = var4.method138((byte) 109);
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
        this.field219 = var9;
        this.field212 = var10;
        this.field214 = var11;
        this.field225 = new int[var9];
        this.field209 = new int[var9];
        this.field224 = new int[var9];
        this.field234 = new int[var10];
        this.field208 = new int[var10];
        this.field221 = new int[var10];
        if (var11 > 0) {
            this.field218 = new int[var11];
            this.field239 = new int[var11];
            this.field233 = new int[var11];
        }
        if (var16 == 1) {
            this.field228 = new int[var9];
        }
        if (var12 == 1) {
            this.field230 = new byte[var10];
            this.field210 = new byte[var10];
        }
        if (var13 == 255) {
            this.field211 = new byte[var10];
        } else {
            this.field242 = (byte) var13;
        }
        if (var14 == 1) {
            this.field237 = new byte[var10];
        }
        if (var15 == 1) {
            this.field213 = new int[var10];
        }
        this.field229 = new short[var10];
        var4.field314 = var21;
        var5.field314 = var36;
        var6.field314 = var38;
        var7.field314 = var40;
        var8.field314 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method153(true);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method117((byte) -102);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method117((byte) -102);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method117((byte) -102);
            }
            this.field225[var46] = var43 + var60;
            this.field209[var46] = var44 + var61;
            this.field224[var46] = var45 + var62;
            var43 = this.field225[var46];
            var44 = this.field209[var46];
            var45 = this.field224[var46];
            if (var16 == 1) {
                this.field228[var46] = var8.method153(true);
            }
        }
        var4.field314 = var32;
        var5.field314 = var28;
        var6.field314 = var26;
        var7.field314 = var30;
        var8.field314 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field229[var47] = (short) var4.method138((byte) 116);
            if (var12 == 1) {
                int var58 = var5.method153(true);
                if ((var58 & 1) == 1) {
                    this.field230[var47] = 1;
                    var3 = true;
                } else {
                    this.field230[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field210[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field210[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field211[var47] = var6.method129((byte) -114);
            }
            if (var14 == 1) {
                this.field237[var47] = var7.method129((byte) 55);
            }
            if (var15 == 1) {
                this.field213[var47] = var8.method153(true);
            }
        }
        var4.field314 = var25;
        var5.field314 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method153(true);
            if (var54 == 1) {
                var48 = var4.method117((byte) -102) + var51;
                var49 = var4.method117((byte) -102) + var48;
                var50 = var4.method117((byte) -102) + var49;
                var51 = var50;
                this.field234[var52] = var48;
                this.field208[var52] = var49;
                this.field221[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method117((byte) -102) + var51;
                var51 = var50;
                this.field234[var52] = var48;
                this.field208[var52] = var49;
                this.field221[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method117((byte) -102) + var51;
                var51 = var50;
                this.field234[var52] = var48;
                this.field208[var52] = var49;
                this.field221[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method117((byte) -102) + var51;
                var51 = var50;
                this.field234[var52] = var48;
                this.field208[var52] = var57;
                this.field221[var52] = var50;
            }
        }
        var4.field314 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field218[var53] = var4.method138((byte) 120);
            this.field239[var53] = var4.method138((byte) 112);
            this.field233[var53] = var4.method138((byte) 95);
        }
        if (!var2) {
            this.field210 = null;
        }
        if (!var3) {
            this.field230 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([Lbc;I)V")
    public class11(class11[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field219 = 0;
        this.field212 = 0;
        this.field214 = 0;
        this.field242 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class11 var14 = arg0[var8];
            if (var14 != null) {
                this.field219 += var14.field219;
                this.field212 += var14.field212;
                this.field214 += var14.field214;
                if (var14.field211 != null) {
                    var4 = true;
                } else {
                    if (this.field242 == -1) {
                        this.field242 = var14.field242;
                    }
                    if (this.field242 != var14.field242) {
                        var4 = true;
                    }
                }
                var3 |= var14.field230 != null;
                var5 |= var14.field237 != null;
                var6 |= var14.field213 != null;
                var7 |= var14.field210 != null;
            }
        }
        this.field225 = new int[this.field219];
        this.field209 = new int[this.field219];
        this.field224 = new int[this.field219];
        this.field228 = new int[this.field219];
        this.field234 = new int[this.field212];
        this.field208 = new int[this.field212];
        this.field221 = new int[this.field212];
        if (this.field214 > 0) {
            this.field218 = new int[this.field214];
            this.field239 = new int[this.field214];
            this.field233 = new int[this.field214];
        }
        if (var3) {
            this.field230 = new byte[this.field212];
        }
        if (var4) {
            this.field211 = new byte[this.field212];
        }
        if (var5) {
            this.field237 = new byte[this.field212];
        }
        if (var7) {
            this.field210 = new byte[this.field212];
        }
        if (var6) {
            this.field213 = new int[this.field212];
        }
        this.field229 = new short[this.field212];
        this.field219 = 0;
        this.field212 = 0;
        this.field214 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class11 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field212; ++var12) {
                    if (var3 && var11.field230 != null) {
                        this.field230[this.field212] = var11.field230[var12];
                    }
                    if (var4) {
                        if (var11.field211 != null) {
                            this.field211[this.field212] = var11.field211[var12];
                        } else {
                            this.field211[this.field212] = var11.field242;
                        }
                    }
                    if (var5 && var11.field237 != null) {
                        this.field237[this.field212] = var11.field237[var12];
                    }
                    if (var7) {
                        if (var11.field210 != null && var11.field210[var12] != -1) {
                            this.field210[this.field212] = (byte) (var11.field210[var12] + var9);
                        } else {
                            this.field210[this.field212] = -1;
                        }
                    }
                    if (var6 && var11.field213 != null) {
                        this.field213[this.field212] = var11.field213[var12];
                    }
                    this.field229[this.field212] = var11.field229[var12];
                    this.field234[this.field212] = this.method93(var11, var11.field234[var12]);
                    this.field208[this.field212] = this.method93(var11, var11.field208[var12]);
                    this.field221[this.field212] = this.method93(var11, var11.field221[var12]);
                    ++this.field212;
                }
                for (int var13 = 0; var13 < var11.field214; ++var13) {
                    this.field218[this.field214] = this.method93(var11, var11.field218[var13]);
                    this.field239[this.field214] = this.method93(var11, var11.field239[var13]);
                    this.field233[this.field214] = this.method93(var11, var11.field233[var13]);
                    ++this.field214;
                }
                var9 += var11.field214;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lbc;ZZZ)V")
    public class11(class11 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field219 = arg0.field219;
        this.field212 = arg0.field212;
        this.field214 = arg0.field214;
        if (arg1) {
            this.field225 = arg0.field225;
            this.field209 = arg0.field209;
            this.field224 = arg0.field224;
        } else {
            this.field225 = new int[this.field219];
            this.field209 = new int[this.field219];
            this.field224 = new int[this.field219];
            for (int var5 = 0; var5 < this.field219; ++var5) {
                this.field225[var5] = arg0.field225[var5];
                this.field209[var5] = arg0.field209[var5];
                this.field224[var5] = arg0.field224[var5];
            }
        }
        if (arg2) {
            this.field229 = arg0.field229;
        } else {
            this.field229 = new short[this.field212];
            for (int var6 = 0; var6 < this.field212; ++var6) {
                this.field229[var6] = arg0.field229[var6];
            }
        }
        if (arg3) {
            this.field237 = arg0.field237;
        } else {
            this.field237 = new byte[this.field212];
            if (arg0.field237 == null) {
                for (int var7 = 0; var7 < this.field212; ++var7) {
                    this.field237[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field212; ++var8) {
                    this.field237[var8] = arg0.field237[var8];
                }
            }
        }
        this.field234 = arg0.field234;
        this.field208 = arg0.field208;
        this.field221 = arg0.field221;
        this.field230 = arg0.field230;
        this.field211 = arg0.field211;
        this.field210 = arg0.field210;
        this.field242 = arg0.field242;
        this.field218 = arg0.field218;
        this.field239 = arg0.field239;
        this.field233 = arg0.field233;
        this.field228 = arg0.field228;
        this.field213 = arg0.field213;
        this.field238 = arg0.field238;
        this.field220 = arg0.field220;
        this.field223 = arg0.field223;
        this.field227 = arg0.field227;
        this.field207 = arg0.field207;
        this.field240 = arg0.field240;
        this.field216 = arg0.field216;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(SS)V")
    public final void method96(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field212; ++var3) {
            if (this.field229[var3] == arg0) {
                this.field229[var3] = arg1;
            }
        }
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field231[var0++] = 255;
        }
        while (var0 < 16) {
            field231[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field231[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field231[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field231[var0++] = var1--;
        }
    }
}
