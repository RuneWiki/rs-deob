import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 extends class101 {

    @OriginalMember(owner = "client!c", name = "qb", descriptor = "Z")
    private boolean field364 = false;

    @OriginalMember(owner = "client!c", name = "Bb", descriptor = "I")
    private int field375 = 0;

    @OriginalMember(owner = "client!c", name = "pb", descriptor = "B")
    private byte field363 = 0;

    @OriginalMember(owner = "client!c", name = "Ob", descriptor = "I")
    private int field388 = 0;

    @OriginalMember(owner = "client!c", name = "Tb", descriptor = "I")
    private int field393 = 0;

    @OriginalMember(owner = "client!c", name = "ub", descriptor = "[I")
    private int[] field368;

    @OriginalMember(owner = "client!c", name = "Jb", descriptor = "[I")
    private int[] field383;

    @OriginalMember(owner = "client!c", name = "Kb", descriptor = "[I")
    private int[] field384;

    @OriginalMember(owner = "client!c", name = "xb", descriptor = "[I")
    private int[] field371;

    @OriginalMember(owner = "client!c", name = "Nb", descriptor = "[I")
    private int[] field387;

    @OriginalMember(owner = "client!c", name = "Db", descriptor = "[I")
    private int[] field377;

    @OriginalMember(owner = "client!c", name = "Ab", descriptor = "[I")
    private int[] field374;

    @OriginalMember(owner = "client!c", name = "ob", descriptor = "[I")
    private int[] field362;

    @OriginalMember(owner = "client!c", name = "Qb", descriptor = "[I")
    private int[] field390;

    @OriginalMember(owner = "client!c", name = "Rb", descriptor = "[I")
    private int[] field391;

    @OriginalMember(owner = "client!c", name = "Eb", descriptor = "[B")
    private byte[] field378;

    @OriginalMember(owner = "client!c", name = "sb", descriptor = "[B")
    private byte[] field366;

    @OriginalMember(owner = "client!c", name = "Gb", descriptor = "[B")
    private byte[] field380;

    @OriginalMember(owner = "client!c", name = "Ub", descriptor = "[B")
    private byte[] field394;

    @OriginalMember(owner = "client!c", name = "Vb", descriptor = "[I")
    private int[] field395;

    @OriginalMember(owner = "client!c", name = "yb", descriptor = "[S")
    private short[] field372;

    @OriginalMember(owner = "client!c", name = "rb", descriptor = "[[I")
    private int[][] field365;

    @OriginalMember(owner = "client!c", name = "vb", descriptor = "[[I")
    private int[][] field369;

    @OriginalMember(owner = "client!c", name = "Hb", descriptor = "[Lib;")
    private class58[] field381;

    @OriginalMember(owner = "client!c", name = "Sb", descriptor = "[Ldb;")
    private class24[] field392;

    @OriginalMember(owner = "client!c", name = "Mb", descriptor = "[Lib;")
    private class58[] field386;

    @OriginalMember(owner = "client!c", name = "Pb", descriptor = "S")
    public short field389;

    @OriginalMember(owner = "client!c", name = "Wb", descriptor = "S")
    public short field396;

    @OriginalMember(owner = "client!c", name = "tb", descriptor = "[I")
    private static int[] field367 = new int[10000];

    @OriginalMember(owner = "client!c", name = "Ib", descriptor = "I")
    private static int field382 = 0;

    @OriginalMember(owner = "client!c", name = "Xb", descriptor = "[I")
    private static int[] field397 = new int[128];

    @OriginalMember(owner = "client!c", name = "Yb", descriptor = "[I")
    private static int[] field398 = new int[10000];

    @OriginalMember(owner = "client!c", name = "wb", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!c", name = "zb", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!c", name = "Cb", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!c", name = "Fb", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!c", name = "Lb", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
    public final void method140() {
        if (this.field381 == null) {
            this.field381 = new class58[this.field375];
            for (int var1 = 0; var1 < this.field375; ++var1) {
                this.field381[var1] = new class58();
            }
            for (int var2 = 0; var2 < this.field393; ++var2) {
                int var3 = this.field371[var2];
                int var4 = this.field387[var2];
                int var5 = this.field377[var2];
                int var6 = this.field368[var4] - this.field368[var3];
                int var7 = this.field383[var4] - this.field383[var3];
                int var8 = this.field384[var4] - this.field384[var3];
                int var9 = this.field368[var5] - this.field368[var3];
                int var10 = this.field383[var5] - this.field383[var3];
                int var11 = this.field384[var5] - this.field384[var3];
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
                if (this.field378 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field378[var2];
                }
                if (var19 == 0) {
                    class58 var20 = this.field381[var3];
                    var20.field1380 += var16;
                    var20.field1376 += var17;
                    var20.field1373 += var18;
                    ++var20.field1378;
                    class58 var21 = this.field381[var4];
                    var21.field1380 += var16;
                    var21.field1376 += var17;
                    var21.field1373 += var18;
                    ++var21.field1378;
                    class58 var22 = this.field381[var5];
                    var22.field1380 += var16;
                    var22.field1376 += var17;
                    var22.field1373 += var18;
                    ++var22.field1378;
                } else if (var19 == 1) {
                    if (this.field392 == null) {
                        this.field392 = new class24[this.field393];
                    }
                    class24 var23 = this.field392[var2] = new class24();
                    var23.field648 = var16;
                    var23.field649 = var17;
                    var23.field646 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lc;Lc;IIIZ)V")
    public static final void method141(class15 arg0, class15 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method143();
        arg0.method140();
        arg1.method143();
        arg1.method140();
        ++field382;
        int var6 = 0;
        int[] var7 = arg1.field368;
        int var8 = arg1.field375;
        for (int var9 = 0; var9 < arg0.field375; ++var9) {
            class58 var12 = arg0.field381[var9];
            if (var12.field1378 != 0) {
                int var13 = arg0.field383[var9] - arg3;
                if (var13 <= arg1.field379) {
                    int var14 = arg0.field368[var9] - arg2;
                    if (var14 >= arg1.field376 && var14 <= arg1.field385) {
                        int var15 = arg0.field384[var9] - arg4;
                        if (var15 >= arg1.field373 && var15 <= arg1.field370) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class58 var17 = arg1.field381[var16];
                                if (var7[var16] == var14 && arg1.field384[var16] == var15 && arg1.field383[var16] == var13 && var17.field1378 != 0) {
                                    if (arg0.field386 == null) {
                                        arg0.field386 = new class58[arg0.field375];
                                    }
                                    if (arg1.field386 == null) {
                                        arg1.field386 = new class58[var8];
                                    }
                                    class58 var18 = arg0.field386[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field386[var9] = new class58(var12);
                                    }
                                    class58 var19 = arg1.field386[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field386[var16] = new class58(var17);
                                    }
                                    var18.field1380 += var17.field1380;
                                    var18.field1376 += var17.field1376;
                                    var18.field1373 += var17.field1373;
                                    var18.field1378 += var17.field1378;
                                    var19.field1380 += var12.field1380;
                                    var19.field1376 += var12.field1376;
                                    var19.field1373 += var12.field1373;
                                    var19.field1378 += var12.field1378;
                                    ++var6;
                                    field398[var9] = field382;
                                    field367[var16] = field382;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field393; ++var10) {
                if (field398[arg0.field371[var10]] == field382 && field398[arg0.field387[var10]] == field382 && field398[arg0.field377[var10]] == field382) {
                    if (arg0.field378 == null) {
                        arg0.field378 = new byte[arg0.field393];
                    }
                    arg0.field378[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field393; ++var11) {
                if (field367[arg1.field371[var11]] == field382 && field367[arg1.field387[var11]] == field382 && field367[arg1.field377[var11]] == field382) {
                    if (arg1.field378 == null) {
                        arg1.field378 = new byte[arg1.field393];
                    }
                    arg1.field378[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(SS)V")
    public final void method142(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field393; ++var3) {
            if (this.field372[var3] == arg0) {
                this.field372[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()V")
    private final void method143() {
        if (!this.field364) {
            super.field2386 = 0;
            this.field379 = 0;
            this.field376 = 999999;
            this.field385 = -999999;
            this.field370 = -99999;
            this.field373 = 99999;
            for (int var1 = 0; var1 < this.field375; ++var1) {
                int var2 = this.field368[var1];
                int var3 = this.field383[var1];
                int var4 = this.field384[var1];
                if (var2 < this.field376) {
                    this.field376 = var2;
                }
                if (var2 > this.field385) {
                    this.field385 = var2;
                }
                if (var4 < this.field373) {
                    this.field373 = var4;
                }
                if (var4 > this.field370) {
                    this.field370 = var4;
                }
                if (-var3 > super.field2386) {
                    super.field2386 = -var3;
                }
                if (var3 > this.field379) {
                    this.field379 = var3;
                }
            }
            this.field364 = true;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I")
    private static final int method144(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIZ)Lc;")
    public final class15 method145(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class15 var6;
            if (arg4) {
                var6 = new class15();
                var6.field375 = this.field375;
                var6.field393 = this.field393;
                var6.field388 = this.field388;
                var6.field368 = this.field368;
                var6.field384 = this.field384;
                var6.field371 = this.field371;
                var6.field387 = this.field387;
                var6.field377 = this.field377;
                var6.field378 = this.field378;
                var6.field380 = this.field380;
                var6.field394 = this.field394;
                var6.field366 = this.field366;
                var6.field372 = this.field372;
                var6.field363 = this.field363;
                var6.field374 = this.field374;
                var6.field362 = this.field362;
                var6.field390 = this.field390;
                var6.field391 = this.field391;
                var6.field395 = this.field395;
                var6.field365 = this.field365;
                var6.field369 = this.field369;
                var6.field389 = this.field389;
                var6.field396 = this.field396;
                var6.field383 = new int[var6.field375];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field375; ++var8) {
                int var9 = this.field368[var8];
                int var10 = this.field383[var8];
                int var11 = this.field384[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field383[var8] = var10 + var14 - var7;
            }
            var6.method155();
            return var6;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()Lc;")
    public final class15 method146() {
        class15 var1 = new class15();
        if (this.field378 != null) {
            var1.field378 = new byte[this.field393];
            for (int var2 = 0; var2 < this.field393; ++var2) {
                var1.field378[var2] = this.field378[var2];
            }
        }
        var1.field375 = this.field375;
        var1.field393 = this.field393;
        var1.field388 = this.field388;
        var1.field368 = this.field368;
        var1.field383 = this.field383;
        var1.field384 = this.field384;
        var1.field371 = this.field371;
        var1.field387 = this.field387;
        var1.field377 = this.field377;
        var1.field380 = this.field380;
        var1.field394 = this.field394;
        var1.field366 = this.field366;
        var1.field372 = this.field372;
        var1.field363 = this.field363;
        var1.field374 = this.field374;
        var1.field362 = this.field362;
        var1.field390 = this.field390;
        var1.field391 = this.field391;
        var1.field395 = this.field395;
        var1.field365 = this.field365;
        var1.field369 = this.field369;
        var1.field381 = this.field381;
        var1.field392 = this.field392;
        var1.field389 = this.field389;
        var1.field396 = this.field396;
        return var1;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)I")
    private static final int method147(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field397[arg0];
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lc;I)I")
    private final int method148(class15 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field368[arg1];
        int var5 = arg0.field383[arg1];
        int var6 = arg0.field384[arg1];
        for (int var7 = 0; var7 < this.field375; ++var7) {
            if (this.field368[var7] == var4 && this.field383[var7] == var5 && this.field384[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field368[this.field375] = var4;
            this.field383[this.field375] = var5;
            this.field384[this.field375] = var6;
            if (arg0.field391 != null) {
                this.field391[this.field375] = arg0.field391[arg1];
            }
            var3 = this.field375++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
    public final void method149(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field375; ++var4) {
            this.field368[var4] = this.field368[var4] * arg0 / 128;
            this.field383[var4] = this.field383[var4] * arg1 / 128;
            this.field384[var4] = this.field384[var4] * arg2 / 128;
        }
        this.method155();
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()V")
    public final void method150() {
        for (int var1 = 0; var1 < this.field375; ++var1) {
            int var2 = this.field384[var1];
            this.field384[var1] = this.field368[var1];
            this.field368[var1] = -var2;
        }
        this.method155();
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIII)Leb;")
    public final class31 method151(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method140();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class31 var8 = new class31();
        var8.field789 = new int[this.field393];
        var8.field802 = new int[this.field393];
        var8.field798 = new int[this.field393];
        for (int var9 = 0; var9 < this.field393; ++var9) {
            byte var10;
            if (this.field378 == null) {
                var10 = 0;
            } else {
                var10 = this.field378[var9];
            }
            if (this.field366 != null && this.field366[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class24 var17 = this.field392[var9];
                        int var18 = (var17.field646 * arg4 + var17.field649 * arg3 + var17.field648 * arg2) / (var7 / 2 + var7) + arg0;
                        var8.field789[var9] = method147(var18);
                        var8.field798[var9] = -1;
                    } else {
                        var8.field798[var9] = -2;
                    }
                } else {
                    class58 var11;
                    if (this.field386 != null && this.field386[this.field371[var9]] != null) {
                        var11 = this.field386[this.field371[var9]];
                    } else {
                        var11 = this.field381[this.field371[var9]];
                    }
                    int var12 = (var11.field1373 * arg4 + var11.field1380 * arg2 + var11.field1376 * arg3) / (var11.field1378 * var7) + arg0;
                    var8.field789[var9] = method147(var12);
                    class58 var13;
                    if (this.field386 != null && this.field386[this.field387[var9]] != null) {
                        var13 = this.field386[this.field387[var9]];
                    } else {
                        var13 = this.field381[this.field387[var9]];
                    }
                    int var14 = (var13.field1373 * arg4 + var13.field1380 * arg2 + var13.field1376 * arg3) / (var13.field1378 * var7) + arg0;
                    var8.field802[var9] = method147(var14);
                    class58 var15;
                    if (this.field386 != null && this.field386[this.field377[var9]] != null) {
                        var15 = this.field386[this.field377[var9]];
                    } else {
                        var15 = this.field381[this.field377[var9]];
                    }
                    int var16 = (var15.field1373 * arg4 + var15.field1380 * arg2 + var15.field1376 * arg3) / (var15.field1378 * var7) + arg0;
                    var8.field798[var9] = method147(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class24 var26 = this.field392[var9];
                    int var27 = (var26.field646 * arg4 + var26.field649 * arg3 + var26.field648 * arg2) / (var7 / 2 + var7) + arg0;
                    var8.field789[var9] = method144(this.field372[var9] & 65535, var27);
                    var8.field798[var9] = -1;
                } else {
                    var8.field798[var9] = -2;
                }
            } else {
                int var19 = this.field372[var9] & 65535;
                class58 var20;
                if (this.field386 != null && this.field386[this.field371[var9]] != null) {
                    var20 = this.field386[this.field371[var9]];
                } else {
                    var20 = this.field381[this.field371[var9]];
                }
                int var21 = (var20.field1373 * arg4 + var20.field1380 * arg2 + var20.field1376 * arg3) / (var20.field1378 * var7) + arg0;
                var8.field789[var9] = method144(var19, var21);
                class58 var22;
                if (this.field386 != null && this.field386[this.field387[var9]] != null) {
                    var22 = this.field386[this.field387[var9]];
                } else {
                    var22 = this.field381[this.field387[var9]];
                }
                int var23 = (var22.field1373 * arg4 + var22.field1380 * arg2 + var22.field1376 * arg3) / (var22.field1378 * var7) + arg0;
                var8.field802[var9] = method144(var19, var23);
                class58 var24;
                if (this.field386 != null && this.field386[this.field377[var9]] != null) {
                    var24 = this.field386[this.field377[var9]];
                } else {
                    var24 = this.field381[this.field377[var9]];
                }
                int var25 = (var24.field1373 * arg4 + var24.field1380 * arg2 + var24.field1376 * arg3) / (var24.field1378 * var7) + arg0;
                var8.field798[var9] = method144(var19, var25);
            }
        }
        this.method156();
        var8.field780 = this.field375;
        var8.field781 = this.field368;
        var8.field794 = this.field383;
        var8.field784 = this.field384;
        var8.field776 = this.field393;
        var8.field797 = this.field371;
        var8.field777 = this.field387;
        var8.field800 = this.field377;
        var8.field834 = this.field380;
        var8.field801 = this.field394;
        var8.field795 = this.field366;
        if (var8.field795 != null) {
            var8.field785 = this.field372;
        } else {
            var8.field785 = null;
        }
        var8.field793 = this.field363;
        var8.field791 = this.field388;
        var8.field778 = this.field374;
        var8.field779 = this.field362;
        var8.field790 = this.field390;
        var8.field803 = this.field365;
        var8.field804 = this.field369;
        return var8;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lkb;II)Lc;")
    public static final class15 method152(class71 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method572(arg1, false, arg2);
        return var3 == null ? null : new class15(var3);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V")
    public final void method153(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field375; ++var4) {
            this.field368[var4] += arg0;
            this.field383[var4] += arg1;
            this.field384[var4] += arg2;
        }
        this.method155();
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()V")
    public final void method154() {
        for (int var1 = 0; var1 < this.field375; ++var1) {
            this.field384[var1] = -this.field384[var1];
        }
        for (int var2 = 0; var2 < this.field393; ++var2) {
            int var3 = this.field371[var2];
            this.field371[var2] = this.field377[var2];
            this.field377[var2] = var3;
        }
        this.method155();
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "()V")
    private final void method155() {
        this.field381 = null;
        this.field386 = null;
        this.field392 = null;
        this.field364 = false;
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "()V")
    private final void method156() {
        int var10002;
        if (this.field391 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field375; ++var3) {
                int var7 = this.field391[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field365 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field365[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field375) {
                int var6 = this.field391[var5];
                this.field365[var6][var1[var6]++] = var5++;
            }
            this.field391 = null;
        }
        if (this.field395 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field393; ++var10) {
                int var14 = this.field395[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field369 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field369[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field393) {
                int var13 = this.field395[var12];
                this.field369[var13][var8[var13]++] = var12++;
            }
            this.field395 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "()V")
    public final void method157() {
        for (int var1 = 0; var1 < this.field375; ++var1) {
            int var2 = this.field368[var1];
            this.field368[var1] = this.field384[var1];
            this.field384[var1] = -var2;
        }
        this.method155();
    }

    @OriginalMember(owner = "client!c", name = "i", descriptor = "()V")
    public final void method158() {
        for (int var1 = 0; var1 < this.field375; ++var1) {
            this.field368[var1] = -this.field368[var1];
            this.field384[var1] = -this.field384[var1];
        }
        this.method155();
    }

    @OriginalMember(owner = "client!c", name = "j", descriptor = "()V")
    public static void method159() {
        field398 = null;
        field367 = null;
        field397 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    private class15() {
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "([B)V")
    private class15(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class122 var4 = new class122(arg0);
        class122 var5 = new class122(arg0);
        class122 var6 = new class122(arg0);
        class122 var7 = new class122(arg0);
        class122 var8 = new class122(arg0);
        var4.field2903 = arg0.length - 18;
        int var9 = var4.method965(false);
        int var10 = var4.method965(false);
        int var11 = var4.method931((byte) 124);
        int var12 = var4.method931((byte) 124);
        int var13 = var4.method931((byte) 124);
        int var14 = var4.method931((byte) 124);
        int var15 = var4.method931((byte) 124);
        int var16 = var4.method931((byte) 124);
        int var17 = var4.method965(false);
        int var18 = var4.method965(false);
        int var19 = var4.method965(false);
        int var20 = var4.method965(false);
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
        this.field375 = var9;
        this.field393 = var10;
        this.field388 = var11;
        this.field368 = new int[var9];
        this.field383 = new int[var9];
        this.field384 = new int[var9];
        this.field371 = new int[var10];
        this.field387 = new int[var10];
        this.field377 = new int[var10];
        if (var11 > 0) {
            this.field374 = new int[var11];
            this.field362 = new int[var11];
            this.field390 = new int[var11];
        }
        if (var16 == 1) {
            this.field391 = new int[var9];
        }
        if (var12 == 1) {
            this.field378 = new byte[var10];
            this.field366 = new byte[var10];
        }
        if (var13 == 255) {
            this.field380 = new byte[var10];
        } else {
            this.field363 = (byte) var13;
        }
        if (var14 == 1) {
            this.field394 = new byte[var10];
        }
        if (var15 == 1) {
            this.field395 = new int[var10];
        }
        this.field372 = new short[var10];
        var4.field2903 = var21;
        var5.field2903 = var36;
        var6.field2903 = var38;
        var7.field2903 = var40;
        var8.field2903 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method931((byte) 124);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method958(-24839);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method958(-24839);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method958(-24839);
            }
            this.field368[var46] = var43 + var60;
            this.field383[var46] = var44 + var61;
            this.field384[var46] = var45 + var62;
            var43 = this.field368[var46];
            var44 = this.field383[var46];
            var45 = this.field384[var46];
            if (var16 == 1) {
                this.field391[var46] = var8.method931((byte) 124);
            }
        }
        var4.field2903 = var32;
        var5.field2903 = var28;
        var6.field2903 = var26;
        var7.field2903 = var30;
        var8.field2903 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field372[var47] = (short) var4.method965(false);
            if (var12 == 1) {
                int var58 = var5.method931((byte) 124);
                if ((var58 & 1) == 1) {
                    this.field378[var47] = 1;
                    var3 = true;
                } else {
                    this.field378[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field366[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field366[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field380[var47] = var6.method977(true);
            }
            if (var14 == 1) {
                this.field394[var47] = var7.method977(true);
            }
            if (var15 == 1) {
                this.field395[var47] = var8.method931((byte) 124);
            }
        }
        var4.field2903 = var25;
        var5.field2903 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method931((byte) 124);
            if (var54 == 1) {
                var48 = var4.method958(-24839) + var51;
                var49 = var4.method958(-24839) + var48;
                var50 = var4.method958(-24839) + var49;
                var51 = var50;
                this.field371[var52] = var48;
                this.field387[var52] = var49;
                this.field377[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method958(-24839) + var51;
                var51 = var50;
                this.field371[var52] = var48;
                this.field387[var52] = var49;
                this.field377[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method958(-24839) + var51;
                var51 = var50;
                this.field371[var52] = var48;
                this.field387[var52] = var49;
                this.field377[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method958(-24839) + var51;
                var51 = var50;
                this.field371[var52] = var48;
                this.field387[var52] = var57;
                this.field377[var52] = var50;
            }
        }
        var4.field2903 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field374[var53] = var4.method965(false);
            this.field362[var53] = var4.method965(false);
            this.field390[var53] = var4.method965(false);
        }
        if (!var2) {
            this.field366 = null;
        }
        if (!var3) {
            this.field378 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "([Lc;I)V")
    public class15(class15[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field375 = 0;
        this.field393 = 0;
        this.field388 = 0;
        this.field363 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class15 var14 = arg0[var8];
            if (var14 != null) {
                this.field375 += var14.field375;
                this.field393 += var14.field393;
                this.field388 += var14.field388;
                if (var14.field380 != null) {
                    var4 = true;
                } else {
                    if (this.field363 == -1) {
                        this.field363 = var14.field363;
                    }
                    if (this.field363 != var14.field363) {
                        var4 = true;
                    }
                }
                var3 |= var14.field378 != null;
                var5 |= var14.field394 != null;
                var6 |= var14.field395 != null;
                var7 |= var14.field366 != null;
            }
        }
        this.field368 = new int[this.field375];
        this.field383 = new int[this.field375];
        this.field384 = new int[this.field375];
        this.field391 = new int[this.field375];
        this.field371 = new int[this.field393];
        this.field387 = new int[this.field393];
        this.field377 = new int[this.field393];
        if (this.field388 > 0) {
            this.field374 = new int[this.field388];
            this.field362 = new int[this.field388];
            this.field390 = new int[this.field388];
        }
        if (var3) {
            this.field378 = new byte[this.field393];
        }
        if (var4) {
            this.field380 = new byte[this.field393];
        }
        if (var5) {
            this.field394 = new byte[this.field393];
        }
        if (var7) {
            this.field366 = new byte[this.field393];
        }
        if (var6) {
            this.field395 = new int[this.field393];
        }
        this.field372 = new short[this.field393];
        this.field375 = 0;
        this.field393 = 0;
        this.field388 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class15 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field393; ++var12) {
                    if (var3 && var11.field378 != null) {
                        this.field378[this.field393] = var11.field378[var12];
                    }
                    if (var4) {
                        if (var11.field380 != null) {
                            this.field380[this.field393] = var11.field380[var12];
                        } else {
                            this.field380[this.field393] = var11.field363;
                        }
                    }
                    if (var5 && var11.field394 != null) {
                        this.field394[this.field393] = var11.field394[var12];
                    }
                    if (var7) {
                        if (var11.field366 != null && var11.field366[var12] != -1) {
                            this.field366[this.field393] = (byte) (var11.field366[var12] + var9);
                        } else {
                            this.field366[this.field393] = -1;
                        }
                    }
                    if (var6 && var11.field395 != null) {
                        this.field395[this.field393] = var11.field395[var12];
                    }
                    this.field372[this.field393] = var11.field372[var12];
                    this.field371[this.field393] = this.method148(var11, var11.field371[var12]);
                    this.field387[this.field393] = this.method148(var11, var11.field387[var12]);
                    this.field377[this.field393] = this.method148(var11, var11.field377[var12]);
                    ++this.field393;
                }
                for (int var13 = 0; var13 < var11.field388; ++var13) {
                    this.field374[this.field388] = this.method148(var11, var11.field374[var13]);
                    this.field362[this.field388] = this.method148(var11, var11.field362[var13]);
                    this.field390[this.field388] = this.method148(var11, var11.field390[var13]);
                    ++this.field388;
                }
                var9 += var11.field388;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lc;ZZZ)V")
    public class15(class15 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field375 = arg0.field375;
        this.field393 = arg0.field393;
        this.field388 = arg0.field388;
        if (arg1) {
            this.field368 = arg0.field368;
            this.field383 = arg0.field383;
            this.field384 = arg0.field384;
        } else {
            this.field368 = new int[this.field375];
            this.field383 = new int[this.field375];
            this.field384 = new int[this.field375];
            for (int var5 = 0; var5 < this.field375; ++var5) {
                this.field368[var5] = arg0.field368[var5];
                this.field383[var5] = arg0.field383[var5];
                this.field384[var5] = arg0.field384[var5];
            }
        }
        if (arg2) {
            this.field372 = arg0.field372;
        } else {
            this.field372 = new short[this.field393];
            for (int var6 = 0; var6 < this.field393; ++var6) {
                this.field372[var6] = arg0.field372[var6];
            }
        }
        if (arg3) {
            this.field394 = arg0.field394;
        } else {
            this.field394 = new byte[this.field393];
            if (arg0.field394 == null) {
                for (int var7 = 0; var7 < this.field393; ++var7) {
                    this.field394[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field393; ++var8) {
                    this.field394[var8] = arg0.field394[var8];
                }
            }
        }
        this.field371 = arg0.field371;
        this.field387 = arg0.field387;
        this.field377 = arg0.field377;
        this.field378 = arg0.field378;
        this.field380 = arg0.field380;
        this.field366 = arg0.field366;
        this.field363 = arg0.field363;
        this.field374 = arg0.field374;
        this.field362 = arg0.field362;
        this.field390 = arg0.field390;
        this.field391 = arg0.field391;
        this.field395 = arg0.field395;
        this.field365 = arg0.field365;
        this.field369 = arg0.field369;
        this.field381 = arg0.field381;
        this.field392 = arg0.field392;
        this.field386 = arg0.field386;
        this.field389 = arg0.field389;
        this.field396 = arg0.field396;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field397[var0++] = 255;
        }
        while (var0 < 16) {
            field397[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field397[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field397[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field397[var0++] = var1--;
        }
    }
}
