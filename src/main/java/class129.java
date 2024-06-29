import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class129 extends class88 {

    @OriginalMember(owner = "client!tc", name = "pb", descriptor = "I")
    private int field3159 = 0;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "I")
    private int field3148 = 0;

    @OriginalMember(owner = "client!tc", name = "Eb", descriptor = "B")
    private byte field3174 = 0;

    @OriginalMember(owner = "client!tc", name = "Ib", descriptor = "Z")
    private boolean field3178 = false;

    @OriginalMember(owner = "client!tc", name = "Mb", descriptor = "I")
    private int field3182 = 0;

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "[I")
    private int[] field3150;

    @OriginalMember(owner = "client!tc", name = "Lb", descriptor = "[I")
    private int[] field3181;

    @OriginalMember(owner = "client!tc", name = "ob", descriptor = "[I")
    private int[] field3158;

    @OriginalMember(owner = "client!tc", name = "sb", descriptor = "[I")
    private int[] field3162;

    @OriginalMember(owner = "client!tc", name = "Gb", descriptor = "[I")
    private int[] field3176;

    @OriginalMember(owner = "client!tc", name = "Db", descriptor = "[I")
    private int[] field3173;

    @OriginalMember(owner = "client!tc", name = "Fb", descriptor = "[I")
    private int[] field3175;

    @OriginalMember(owner = "client!tc", name = "hb", descriptor = "[I")
    private int[] field3151;

    @OriginalMember(owner = "client!tc", name = "Bb", descriptor = "[I")
    private int[] field3171;

    @OriginalMember(owner = "client!tc", name = "mb", descriptor = "[I")
    private int[] field3156;

    @OriginalMember(owner = "client!tc", name = "Cb", descriptor = "[B")
    private byte[] field3172;

    @OriginalMember(owner = "client!tc", name = "Jb", descriptor = "[B")
    private byte[] field3179;

    @OriginalMember(owner = "client!tc", name = "qb", descriptor = "[B")
    private byte[] field3160;

    @OriginalMember(owner = "client!tc", name = "tb", descriptor = "[B")
    private byte[] field3163;

    @OriginalMember(owner = "client!tc", name = "wb", descriptor = "[I")
    private int[] field3166;

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "[S")
    private short[] field3149;

    @OriginalMember(owner = "client!tc", name = "Hb", descriptor = "[[I")
    private int[][] field3177;

    @OriginalMember(owner = "client!tc", name = "ub", descriptor = "[[I")
    private int[][] field3164;

    @OriginalMember(owner = "client!tc", name = "vb", descriptor = "[Ltb;")
    private class128[] field3165;

    @OriginalMember(owner = "client!tc", name = "yb", descriptor = "[Lce;")
    private class20[] field3168;

    @OriginalMember(owner = "client!tc", name = "ib", descriptor = "[Ltb;")
    private class128[] field3152;

    @OriginalMember(owner = "client!tc", name = "nb", descriptor = "S")
    public short field3157;

    @OriginalMember(owner = "client!tc", name = "zb", descriptor = "S")
    public short field3169;

    @OriginalMember(owner = "client!tc", name = "jb", descriptor = "[I")
    private static int[] field3153 = new int[128];

    @OriginalMember(owner = "client!tc", name = "xb", descriptor = "I")
    private static int field3167 = 0;

    @OriginalMember(owner = "client!tc", name = "Nb", descriptor = "[I")
    private static int[] field3183 = new int[10000];

    @OriginalMember(owner = "client!tc", name = "Ob", descriptor = "[I")
    private static int[] field3184 = new int[10000];

    @OriginalMember(owner = "client!tc", name = "kb", descriptor = "I")
    private int field3154;

    @OriginalMember(owner = "client!tc", name = "lb", descriptor = "I")
    private int field3155;

    @OriginalMember(owner = "client!tc", name = "rb", descriptor = "I")
    private int field3161;

    @OriginalMember(owner = "client!tc", name = "Ab", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!tc", name = "Kb", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(SS)V")
    public final void method1043(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3159; ++var3) {
            if (this.field3149[var3] == arg0) {
                this.field3149[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)Ldd;")
    public final class26 method1044(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1049();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class26 var8 = new class26();
        var8.field612 = new int[this.field3159];
        var8.field616 = new int[this.field3159];
        var8.field622 = new int[this.field3159];
        for (int var9 = 0; var9 < this.field3159; ++var9) {
            byte var10;
            if (this.field3172 == null) {
                var10 = 0;
            } else {
                var10 = this.field3172[var9];
            }
            if (this.field3179 != null && this.field3179[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class20 var17 = this.field3168[var9];
                        int var18 = (var17.field494 * arg4 + var17.field491 * arg2 + var17.field487 * arg3) / (var7 / 2 + var7) + arg0;
                        var8.field612[var9] = method1059(var18);
                        var8.field622[var9] = -1;
                    } else {
                        var8.field622[var9] = -2;
                    }
                } else {
                    class128 var11;
                    if (this.field3152 != null && this.field3152[this.field3162[var9]] != null) {
                        var11 = this.field3152[this.field3162[var9]];
                    } else {
                        var11 = this.field3165[this.field3162[var9]];
                    }
                    int var12 = (var11.field3135 * arg4 + var11.field3143 * arg2 + var11.field3137 * arg3) / (var11.field3133 * var7) + arg0;
                    var8.field612[var9] = method1059(var12);
                    class128 var13;
                    if (this.field3152 != null && this.field3152[this.field3176[var9]] != null) {
                        var13 = this.field3152[this.field3176[var9]];
                    } else {
                        var13 = this.field3165[this.field3176[var9]];
                    }
                    int var14 = (var13.field3135 * arg4 + var13.field3143 * arg2 + var13.field3137 * arg3) / (var13.field3133 * var7) + arg0;
                    var8.field616[var9] = method1059(var14);
                    class128 var15;
                    if (this.field3152 != null && this.field3152[this.field3173[var9]] != null) {
                        var15 = this.field3152[this.field3173[var9]];
                    } else {
                        var15 = this.field3165[this.field3173[var9]];
                    }
                    int var16 = (var15.field3135 * arg4 + var15.field3143 * arg2 + var15.field3137 * arg3) / (var15.field3133 * var7) + arg0;
                    var8.field622[var9] = method1059(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class20 var26 = this.field3168[var9];
                    int var27 = (var26.field494 * arg4 + var26.field491 * arg2 + var26.field487 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field612[var9] = method1054(this.field3149[var9] & 65535, var27);
                    var8.field622[var9] = -1;
                } else {
                    var8.field622[var9] = -2;
                }
            } else {
                int var19 = this.field3149[var9] & 65535;
                class128 var20;
                if (this.field3152 != null && this.field3152[this.field3162[var9]] != null) {
                    var20 = this.field3152[this.field3162[var9]];
                } else {
                    var20 = this.field3165[this.field3162[var9]];
                }
                int var21 = (var20.field3135 * arg4 + var20.field3143 * arg2 + var20.field3137 * arg3) / (var20.field3133 * var7) + arg0;
                var8.field612[var9] = method1054(var19, var21);
                class128 var22;
                if (this.field3152 != null && this.field3152[this.field3176[var9]] != null) {
                    var22 = this.field3152[this.field3176[var9]];
                } else {
                    var22 = this.field3165[this.field3176[var9]];
                }
                int var23 = (var22.field3135 * arg4 + var22.field3143 * arg2 + var22.field3137 * arg3) / (var22.field3133 * var7) + arg0;
                var8.field616[var9] = method1054(var19, var23);
                class128 var24;
                if (this.field3152 != null && this.field3152[this.field3173[var9]] != null) {
                    var24 = this.field3152[this.field3173[var9]];
                } else {
                    var24 = this.field3165[this.field3173[var9]];
                }
                int var25 = (var24.field3135 * arg4 + var24.field3143 * arg2 + var24.field3137 * arg3) / (var24.field3133 * var7) + arg0;
                var8.field622[var9] = method1054(var19, var25);
            }
        }
        this.method1052();
        var8.field610 = this.field3148;
        var8.field619 = this.field3150;
        var8.field621 = this.field3181;
        var8.field618 = this.field3158;
        var8.field598 = this.field3159;
        var8.field620 = this.field3162;
        var8.field602 = this.field3176;
        var8.field613 = this.field3173;
        var8.field614 = this.field3160;
        var8.field608 = this.field3163;
        var8.field617 = this.field3179;
        if (var8.field617 != null) {
            var8.field606 = this.field3149;
        } else {
            var8.field606 = null;
        }
        var8.field609 = this.field3174;
        var8.field611 = this.field3182;
        var8.field607 = this.field3175;
        var8.field604 = this.field3151;
        var8.field603 = this.field3171;
        var8.field600 = this.field3177;
        var8.field601 = this.field3164;
        return var8;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()V")
    public final void method1045() {
        for (int var1 = 0; var1 < this.field3148; ++var1) {
            int var2 = this.field3150[var1];
            this.field3150[var1] = this.field3158[var1];
            this.field3158[var1] = -var2;
        }
        this.method1058();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ltc;Ltc;IIIZ)V")
    public static final void method1046(class129 arg0, class129 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1055();
        arg0.method1049();
        arg1.method1055();
        arg1.method1049();
        ++field3167;
        int var6 = 0;
        int[] var7 = arg1.field3150;
        int var8 = arg1.field3148;
        for (int var9 = 0; var9 < arg0.field3148; ++var9) {
            class128 var12 = arg0.field3165[var9];
            if (var12.field3133 != 0) {
                int var13 = arg0.field3181[var9] - arg3;
                if (var13 <= arg1.field3180) {
                    int var14 = arg0.field3150[var9] - arg2;
                    if (var14 >= arg1.field3170 && var14 <= arg1.field3161) {
                        int var15 = arg0.field3158[var9] - arg4;
                        if (var15 >= arg1.field3155 && var15 <= arg1.field3154) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class128 var17 = arg1.field3165[var16];
                                if (var7[var16] == var14 && arg1.field3158[var16] == var15 && arg1.field3181[var16] == var13 && var17.field3133 != 0) {
                                    if (arg0.field3152 == null) {
                                        arg0.field3152 = new class128[arg0.field3148];
                                    }
                                    if (arg1.field3152 == null) {
                                        arg1.field3152 = new class128[var8];
                                    }
                                    class128 var18 = arg0.field3152[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field3152[var9] = new class128(var12);
                                    }
                                    class128 var19 = arg1.field3152[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field3152[var16] = new class128(var17);
                                    }
                                    var18.field3143 += var17.field3143;
                                    var18.field3137 += var17.field3137;
                                    var18.field3135 += var17.field3135;
                                    var18.field3133 += var17.field3133;
                                    var19.field3143 += var12.field3143;
                                    var19.field3137 += var12.field3137;
                                    var19.field3135 += var12.field3135;
                                    var19.field3133 += var12.field3133;
                                    ++var6;
                                    field3183[var9] = field3167;
                                    field3184[var16] = field3167;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field3159; ++var10) {
                if (field3183[arg0.field3162[var10]] == field3167 && field3183[arg0.field3176[var10]] == field3167 && field3183[arg0.field3173[var10]] == field3167) {
                    if (arg0.field3172 == null) {
                        arg0.field3172 = new byte[arg0.field3159];
                    }
                    arg0.field3172[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field3159; ++var11) {
                if (field3184[arg1.field3162[var11]] == field3167 && field3184[arg1.field3176[var11]] == field3167 && field3184[arg1.field3173[var11]] == field3167) {
                    if (arg1.field3172 == null) {
                        arg1.field3172 = new byte[arg1.field3159];
                    }
                    arg1.field3172[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()V")
    public final void method1047() {
        for (int var1 = 0; var1 < this.field3148; ++var1) {
            this.field3158[var1] = -this.field3158[var1];
        }
        for (int var2 = 0; var2 < this.field3159; ++var2) {
            int var3 = this.field3162[var2];
            this.field3162[var2] = this.field3173[var2];
            this.field3173[var2] = var3;
        }
        this.method1058();
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()V")
    public final void method1048() {
        for (int var1 = 0; var1 < this.field3148; ++var1) {
            int var2 = this.field3158[var1];
            this.field3158[var1] = this.field3150[var1];
            this.field3150[var1] = -var2;
        }
        this.method1058();
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()V")
    public final void method1049() {
        if (this.field3165 == null) {
            this.field3165 = new class128[this.field3148];
            for (int var1 = 0; var1 < this.field3148; ++var1) {
                this.field3165[var1] = new class128();
            }
            for (int var2 = 0; var2 < this.field3159; ++var2) {
                int var3 = this.field3162[var2];
                int var4 = this.field3176[var2];
                int var5 = this.field3173[var2];
                int var6 = this.field3150[var4] - this.field3150[var3];
                int var7 = this.field3181[var4] - this.field3181[var3];
                int var8 = this.field3158[var4] - this.field3158[var3];
                int var9 = this.field3150[var5] - this.field3150[var3];
                int var10 = this.field3181[var5] - this.field3181[var3];
                int var11 = this.field3158[var5] - this.field3158[var3];
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
                if (this.field3172 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field3172[var2];
                }
                if (var19 == 0) {
                    class128 var20 = this.field3165[var3];
                    var20.field3143 += var16;
                    var20.field3137 += var17;
                    var20.field3135 += var18;
                    ++var20.field3133;
                    class128 var21 = this.field3165[var4];
                    var21.field3143 += var16;
                    var21.field3137 += var17;
                    var21.field3135 += var18;
                    ++var21.field3133;
                    class128 var22 = this.field3165[var5];
                    var22.field3143 += var16;
                    var22.field3137 += var17;
                    var22.field3135 += var18;
                    ++var22.field3133;
                } else if (var19 == 1) {
                    if (this.field3168 == null) {
                        this.field3168 = new class20[this.field3159];
                    }
                    class20 var23 = this.field3168[var2] = new class20();
                    var23.field491 = var16;
                    var23.field487 = var17;
                    var23.field494 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "()V")
    public static void method1050() {
        field3183 = null;
        field3184 = null;
        field3153 = null;
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "()V")
    public final void method1051() {
        for (int var1 = 0; var1 < this.field3148; ++var1) {
            this.field3150[var1] = -this.field3150[var1];
            this.field3158[var1] = -this.field3158[var1];
        }
        this.method1058();
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "()V")
    private final void method1052() {
        int var10002;
        if (this.field3156 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3148; ++var3) {
                int var7 = this.field3156[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3177 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field3177[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3148) {
                int var6 = this.field3156[var5];
                this.field3177[var6][var1[var6]++] = var5++;
            }
            this.field3156 = null;
        }
        if (this.field3166 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field3159; ++var10) {
                int var14 = this.field3166[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field3164 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field3164[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field3159) {
                int var13 = this.field3166[var12];
                this.field3164[var13][var8[var13]++] = var12++;
            }
            this.field3166 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ltc;I)I")
    private final int method1053(class129 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3150[arg1];
        int var5 = arg0.field3181[arg1];
        int var6 = arg0.field3158[arg1];
        for (int var7 = 0; var7 < this.field3148; ++var7) {
            if (this.field3150[var7] == var4 && this.field3181[var7] == var5 && this.field3158[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3150[this.field3148] = var4;
            this.field3181[this.field3148] = var5;
            this.field3158[this.field3148] = var6;
            if (arg0.field3156 != null) {
                this.field3156[this.field3148] = arg0.field3156[arg1];
            }
            var3 = this.field3148++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)I")
    private static final int method1054(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "()V")
    private final void method1055() {
        if (!this.field3178) {
            super.field2187 = 0;
            this.field3180 = 0;
            this.field3170 = 999999;
            this.field3161 = -999999;
            this.field3154 = -99999;
            this.field3155 = 99999;
            for (int var1 = 0; var1 < this.field3148; ++var1) {
                int var2 = this.field3150[var1];
                int var3 = this.field3181[var1];
                int var4 = this.field3158[var1];
                if (var2 < this.field3170) {
                    this.field3170 = var2;
                }
                if (var2 > this.field3161) {
                    this.field3161 = var2;
                }
                if (var4 < this.field3155) {
                    this.field3155 = var4;
                }
                if (var4 > this.field3154) {
                    this.field3154 = var4;
                }
                if (-var3 > super.field2187) {
                    super.field2187 = -var3;
                }
                if (var3 > this.field3180) {
                    this.field3180 = var3;
                }
            }
            this.field3178 = true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
    public final void method1056(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3148; ++var4) {
            this.field3150[var4] = this.field3150[var4] * arg0 / 128;
            this.field3181[var4] = this.field3181[var4] * arg1 / 128;
            this.field3158[var4] = this.field3158[var4] * arg2 / 128;
        }
        this.method1058();
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)V")
    public final void method1057(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3148; ++var4) {
            this.field3150[var4] += arg0;
            this.field3181[var4] += arg1;
            this.field3158[var4] += arg2;
        }
        this.method1058();
    }

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "()V")
    private final void method1058() {
        this.field3165 = null;
        this.field3152 = null;
        this.field3168 = null;
        this.field3178 = false;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)I")
    private static final int method1059(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field3153[arg0];
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lpc;II)Ltc;")
    public static final class129 method1060(class105 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method903(arg1, (byte) -128, arg2);
        return var3 == null ? null : new class129(var3);
    }

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "()Ltc;")
    public final class129 method1061() {
        class129 var1 = new class129();
        if (this.field3172 != null) {
            var1.field3172 = new byte[this.field3159];
            for (int var2 = 0; var2 < this.field3159; ++var2) {
                var1.field3172[var2] = this.field3172[var2];
            }
        }
        var1.field3148 = this.field3148;
        var1.field3159 = this.field3159;
        var1.field3182 = this.field3182;
        var1.field3150 = this.field3150;
        var1.field3181 = this.field3181;
        var1.field3158 = this.field3158;
        var1.field3162 = this.field3162;
        var1.field3176 = this.field3176;
        var1.field3173 = this.field3173;
        var1.field3160 = this.field3160;
        var1.field3163 = this.field3163;
        var1.field3179 = this.field3179;
        var1.field3149 = this.field3149;
        var1.field3174 = this.field3174;
        var1.field3175 = this.field3175;
        var1.field3151 = this.field3151;
        var1.field3171 = this.field3171;
        var1.field3156 = this.field3156;
        var1.field3166 = this.field3166;
        var1.field3177 = this.field3177;
        var1.field3164 = this.field3164;
        var1.field3165 = this.field3165;
        var1.field3168 = this.field3168;
        var1.field3157 = this.field3157;
        var1.field3169 = this.field3169;
        return var1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIZ)Ltc;")
    public final class129 method1062(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class129 var6;
            if (arg4) {
                var6 = new class129();
                var6.field3148 = this.field3148;
                var6.field3159 = this.field3159;
                var6.field3182 = this.field3182;
                var6.field3150 = this.field3150;
                var6.field3158 = this.field3158;
                var6.field3162 = this.field3162;
                var6.field3176 = this.field3176;
                var6.field3173 = this.field3173;
                var6.field3172 = this.field3172;
                var6.field3160 = this.field3160;
                var6.field3163 = this.field3163;
                var6.field3179 = this.field3179;
                var6.field3149 = this.field3149;
                var6.field3174 = this.field3174;
                var6.field3175 = this.field3175;
                var6.field3151 = this.field3151;
                var6.field3171 = this.field3171;
                var6.field3156 = this.field3156;
                var6.field3166 = this.field3166;
                var6.field3177 = this.field3177;
                var6.field3164 = this.field3164;
                var6.field3157 = this.field3157;
                var6.field3169 = this.field3169;
                var6.field3181 = new int[var6.field3148];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field3148; ++var8) {
                int var9 = this.field3150[var8];
                int var10 = this.field3181[var8];
                int var11 = this.field3158[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field3181[var8] = var10 + var14 - var7;
            }
            var6.method1058();
            return var6;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    private class129() {
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V")
    private class129(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class57 var4 = new class57(arg0);
        class57 var5 = new class57(arg0);
        class57 var6 = new class57(arg0);
        class57 var7 = new class57(arg0);
        class57 var8 = new class57(arg0);
        var4.field1477 = arg0.length - 18;
        int var9 = var4.method506(-1);
        int var10 = var4.method506(-1);
        int var11 = var4.method510(-120);
        int var12 = var4.method510(-112);
        int var13 = var4.method510(-128);
        int var14 = var4.method510(-116);
        int var15 = var4.method510(-128);
        int var16 = var4.method510(-123);
        int var17 = var4.method506(-1);
        int var18 = var4.method506(-1);
        int var19 = var4.method506(-1);
        int var20 = var4.method506(-1);
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
        this.field3148 = var9;
        this.field3159 = var10;
        this.field3182 = var11;
        this.field3150 = new int[var9];
        this.field3181 = new int[var9];
        this.field3158 = new int[var9];
        this.field3162 = new int[var10];
        this.field3176 = new int[var10];
        this.field3173 = new int[var10];
        if (var11 > 0) {
            this.field3175 = new int[var11];
            this.field3151 = new int[var11];
            this.field3171 = new int[var11];
        }
        if (var16 == 1) {
            this.field3156 = new int[var9];
        }
        if (var12 == 1) {
            this.field3172 = new byte[var10];
            this.field3179 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3160 = new byte[var10];
        } else {
            this.field3174 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3163 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3166 = new int[var10];
        }
        this.field3149 = new short[var10];
        var4.field1477 = var21;
        var5.field1477 = var36;
        var6.field1477 = var38;
        var7.field1477 = var40;
        var8.field1477 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method510(-124);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method499(-11093);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method499(-11093);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method499(-11093);
            }
            this.field3150[var46] = var43 + var60;
            this.field3181[var46] = var44 + var61;
            this.field3158[var46] = var45 + var62;
            var43 = this.field3150[var46];
            var44 = this.field3181[var46];
            var45 = this.field3158[var46];
            if (var16 == 1) {
                this.field3156[var46] = var8.method510(-121);
            }
        }
        var4.field1477 = var32;
        var5.field1477 = var28;
        var6.field1477 = var26;
        var7.field1477 = var30;
        var8.field1477 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field3149[var47] = (short) var4.method506(-1);
            if (var12 == 1) {
                int var58 = var5.method510(-113);
                if ((var58 & 1) == 1) {
                    this.field3172[var47] = 1;
                    var3 = true;
                } else {
                    this.field3172[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field3179[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field3179[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3160[var47] = var6.method485(104);
            }
            if (var14 == 1) {
                this.field3163[var47] = var7.method485(104);
            }
            if (var15 == 1) {
                this.field3166[var47] = var8.method510(-125);
            }
        }
        var4.field1477 = var25;
        var5.field1477 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method510(-115);
            if (var54 == 1) {
                var48 = var4.method499(-11093) + var51;
                var49 = var4.method499(-11093) + var48;
                var50 = var4.method499(-11093) + var49;
                var51 = var50;
                this.field3162[var52] = var48;
                this.field3176[var52] = var49;
                this.field3173[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method499(-11093) + var51;
                var51 = var50;
                this.field3162[var52] = var48;
                this.field3176[var52] = var49;
                this.field3173[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method499(-11093) + var51;
                var51 = var50;
                this.field3162[var52] = var48;
                this.field3176[var52] = var49;
                this.field3173[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method499(-11093) + var51;
                var51 = var50;
                this.field3162[var52] = var48;
                this.field3176[var52] = var57;
                this.field3173[var52] = var50;
            }
        }
        var4.field1477 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field3175[var53] = var4.method506(-1);
            this.field3151[var53] = var4.method506(-1);
            this.field3171[var53] = var4.method506(-1);
        }
        if (!var2) {
            this.field3179 = null;
        }
        if (!var3) {
            this.field3172 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([Ltc;I)V")
    public class129(class129[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field3148 = 0;
        this.field3159 = 0;
        this.field3182 = 0;
        this.field3174 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class129 var14 = arg0[var8];
            if (var14 != null) {
                this.field3148 += var14.field3148;
                this.field3159 += var14.field3159;
                this.field3182 += var14.field3182;
                if (var14.field3160 != null) {
                    var4 = true;
                } else {
                    if (this.field3174 == -1) {
                        this.field3174 = var14.field3174;
                    }
                    if (this.field3174 != var14.field3174) {
                        var4 = true;
                    }
                }
                var3 |= var14.field3172 != null;
                var5 |= var14.field3163 != null;
                var6 |= var14.field3166 != null;
                var7 |= var14.field3179 != null;
            }
        }
        this.field3150 = new int[this.field3148];
        this.field3181 = new int[this.field3148];
        this.field3158 = new int[this.field3148];
        this.field3156 = new int[this.field3148];
        this.field3162 = new int[this.field3159];
        this.field3176 = new int[this.field3159];
        this.field3173 = new int[this.field3159];
        if (this.field3182 > 0) {
            this.field3175 = new int[this.field3182];
            this.field3151 = new int[this.field3182];
            this.field3171 = new int[this.field3182];
        }
        if (var3) {
            this.field3172 = new byte[this.field3159];
        }
        if (var4) {
            this.field3160 = new byte[this.field3159];
        }
        if (var5) {
            this.field3163 = new byte[this.field3159];
        }
        if (var7) {
            this.field3179 = new byte[this.field3159];
        }
        if (var6) {
            this.field3166 = new int[this.field3159];
        }
        this.field3149 = new short[this.field3159];
        this.field3148 = 0;
        this.field3159 = 0;
        this.field3182 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class129 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3159; ++var12) {
                    if (var3 && var11.field3172 != null) {
                        this.field3172[this.field3159] = var11.field3172[var12];
                    }
                    if (var4) {
                        if (var11.field3160 != null) {
                            this.field3160[this.field3159] = var11.field3160[var12];
                        } else {
                            this.field3160[this.field3159] = var11.field3174;
                        }
                    }
                    if (var5 && var11.field3163 != null) {
                        this.field3163[this.field3159] = var11.field3163[var12];
                    }
                    if (var7) {
                        if (var11.field3179 != null && var11.field3179[var12] != -1) {
                            this.field3179[this.field3159] = (byte) (var11.field3179[var12] + var9);
                        } else {
                            this.field3179[this.field3159] = -1;
                        }
                    }
                    if (var6 && var11.field3166 != null) {
                        this.field3166[this.field3159] = var11.field3166[var12];
                    }
                    this.field3149[this.field3159] = var11.field3149[var12];
                    this.field3162[this.field3159] = this.method1053(var11, var11.field3162[var12]);
                    this.field3176[this.field3159] = this.method1053(var11, var11.field3176[var12]);
                    this.field3173[this.field3159] = this.method1053(var11, var11.field3173[var12]);
                    ++this.field3159;
                }
                for (int var13 = 0; var13 < var11.field3182; ++var13) {
                    this.field3175[this.field3182] = this.method1053(var11, var11.field3175[var13]);
                    this.field3151[this.field3182] = this.method1053(var11, var11.field3151[var13]);
                    this.field3171[this.field3182] = this.method1053(var11, var11.field3171[var13]);
                    ++this.field3182;
                }
                var9 += var11.field3182;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Ltc;ZZZ)V")
    public class129(class129 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field3148 = arg0.field3148;
        this.field3159 = arg0.field3159;
        this.field3182 = arg0.field3182;
        if (arg1) {
            this.field3150 = arg0.field3150;
            this.field3181 = arg0.field3181;
            this.field3158 = arg0.field3158;
        } else {
            this.field3150 = new int[this.field3148];
            this.field3181 = new int[this.field3148];
            this.field3158 = new int[this.field3148];
            for (int var5 = 0; var5 < this.field3148; ++var5) {
                this.field3150[var5] = arg0.field3150[var5];
                this.field3181[var5] = arg0.field3181[var5];
                this.field3158[var5] = arg0.field3158[var5];
            }
        }
        if (arg2) {
            this.field3149 = arg0.field3149;
        } else {
            this.field3149 = new short[this.field3159];
            for (int var6 = 0; var6 < this.field3159; ++var6) {
                this.field3149[var6] = arg0.field3149[var6];
            }
        }
        if (arg3) {
            this.field3163 = arg0.field3163;
        } else {
            this.field3163 = new byte[this.field3159];
            if (arg0.field3163 == null) {
                for (int var7 = 0; var7 < this.field3159; ++var7) {
                    this.field3163[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field3159; ++var8) {
                    this.field3163[var8] = arg0.field3163[var8];
                }
            }
        }
        this.field3162 = arg0.field3162;
        this.field3176 = arg0.field3176;
        this.field3173 = arg0.field3173;
        this.field3172 = arg0.field3172;
        this.field3160 = arg0.field3160;
        this.field3179 = arg0.field3179;
        this.field3174 = arg0.field3174;
        this.field3175 = arg0.field3175;
        this.field3151 = arg0.field3151;
        this.field3171 = arg0.field3171;
        this.field3156 = arg0.field3156;
        this.field3166 = arg0.field3166;
        this.field3177 = arg0.field3177;
        this.field3164 = arg0.field3164;
        this.field3165 = arg0.field3165;
        this.field3168 = arg0.field3168;
        this.field3152 = arg0.field3152;
        this.field3157 = arg0.field3157;
        this.field3169 = arg0.field3169;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field3153[var0++] = 255;
        }
        while (var0 < 16) {
            field3153[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field3153[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field3153[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field3153[var0++] = var1--;
        }
    }
}
