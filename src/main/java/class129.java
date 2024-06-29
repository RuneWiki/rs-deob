import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class129 extends class66 {

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    private int field2948 = 0;

    @OriginalMember(owner = "client!sd", name = "Bb", descriptor = "I")
    private int field2971 = 0;

    @OriginalMember(owner = "client!sd", name = "Gb", descriptor = "B")
    private byte field2976 = 0;

    @OriginalMember(owner = "client!sd", name = "Pb", descriptor = "Z")
    private boolean field2985 = false;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    private int field2947;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "[I")
    private int[] field2946;

    @OriginalMember(owner = "client!sd", name = "Fb", descriptor = "[I")
    private int[] field2975;

    @OriginalMember(owner = "client!sd", name = "vb", descriptor = "[I")
    private int[] field2965;

    @OriginalMember(owner = "client!sd", name = "tb", descriptor = "[I")
    private int[] field2963;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "[I")
    private int[] field2944;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "[I")
    private int[] field2945;

    @OriginalMember(owner = "client!sd", name = "rb", descriptor = "[I")
    private int[] field2961;

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "[B")
    private byte[] field2952;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "[B")
    private byte[] field2949;

    @OriginalMember(owner = "client!sd", name = "Db", descriptor = "[B")
    private byte[] field2973;

    @OriginalMember(owner = "client!sd", name = "yb", descriptor = "[I")
    private int[] field2968;

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "[S")
    private short[] field2953;

    @OriginalMember(owner = "client!sd", name = "Rb", descriptor = "[B")
    private byte[] field2987;

    @OriginalMember(owner = "client!sd", name = "wb", descriptor = "[S")
    private short[] field2966;

    @OriginalMember(owner = "client!sd", name = "Jb", descriptor = "[B")
    private byte[] field2979;

    @OriginalMember(owner = "client!sd", name = "lb", descriptor = "[S")
    private short[] field2955;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "[S")
    private short[] field2950;

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "[S")
    private short[] field2954;

    @OriginalMember(owner = "client!sd", name = "Nb", descriptor = "[S")
    private short[] field2983;

    @OriginalMember(owner = "client!sd", name = "Ib", descriptor = "[S")
    private short[] field2978;

    @OriginalMember(owner = "client!sd", name = "Ob", descriptor = "[S")
    private short[] field2984;

    @OriginalMember(owner = "client!sd", name = "zb", descriptor = "[S")
    private short[] field2969;

    @OriginalMember(owner = "client!sd", name = "sb", descriptor = "[B")
    private byte[] field2962;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "[S")
    private short[] field2951;

    @OriginalMember(owner = "client!sd", name = "Cb", descriptor = "[S")
    private short[] field2972;

    @OriginalMember(owner = "client!sd", name = "nb", descriptor = "[[I")
    private int[][] field2957;

    @OriginalMember(owner = "client!sd", name = "xb", descriptor = "[[I")
    private int[][] field2967;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "[Lle;")
    private class81[] field2942;

    @OriginalMember(owner = "client!sd", name = "Qb", descriptor = "[Ltc;")
    private class135[] field2986;

    @OriginalMember(owner = "client!sd", name = "ob", descriptor = "[Lle;")
    private class81[] field2958;

    @OriginalMember(owner = "client!sd", name = "Eb", descriptor = "S")
    public short field2974;

    @OriginalMember(owner = "client!sd", name = "Mb", descriptor = "S")
    public short field2982;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "[I")
    private static int[] field2943 = class45.field1032;

    @OriginalMember(owner = "client!sd", name = "mb", descriptor = "[I")
    private static int[] field2956 = new int[10000];

    @OriginalMember(owner = "client!sd", name = "Ab", descriptor = "[I")
    private static int[] field2970 = new int[10000];

    @OriginalMember(owner = "client!sd", name = "Lb", descriptor = "[I")
    private static int[] field2981 = class45.field1030;

    @OriginalMember(owner = "client!sd", name = "Kb", descriptor = "I")
    private static int field2980 = 0;

    @OriginalMember(owner = "client!sd", name = "pb", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!sd", name = "qb", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!sd", name = "ub", descriptor = "I")
    private int field2964;

    @OriginalMember(owner = "client!sd", name = "Hb", descriptor = "I")
    private int field2977;

    @OriginalMember(owner = "client!sd", name = "Sb", descriptor = "I")
    private int field2988;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lsd;Lsd;IIIZ)V")
    public static final void method949(class129 arg0, class129 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method960();
        arg0.method967();
        arg1.method960();
        arg1.method967();
        ++field2980;
        int var6 = 0;
        int[] var7 = arg1.field2946;
        int var8 = arg1.field2948;
        for (int var9 = 0; var9 < arg0.field2948; ++var9) {
            class81 var12 = arg0.field2942[var9];
            if (var12.field1969 != 0) {
                int var13 = arg0.field2975[var9] - arg3;
                if (var13 <= arg1.field2964) {
                    int var14 = arg0.field2946[var9] - arg2;
                    if (var14 >= arg1.field2977 && var14 <= arg1.field2988) {
                        int var15 = arg0.field2965[var9] - arg4;
                        if (var15 >= arg1.field2960 && var15 <= arg1.field2959) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class81 var17 = arg1.field2942[var16];
                                if (var7[var16] == var14 && arg1.field2965[var16] == var15 && arg1.field2975[var16] == var13 && var17.field1969 != 0) {
                                    if (arg0.field2958 == null) {
                                        arg0.field2958 = new class81[arg0.field2948];
                                    }
                                    if (arg1.field2958 == null) {
                                        arg1.field2958 = new class81[var8];
                                    }
                                    class81 var18 = arg0.field2958[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field2958[var9] = new class81(var12);
                                    }
                                    class81 var19 = arg1.field2958[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field2958[var16] = new class81(var17);
                                    }
                                    var18.field1976 += var17.field1976;
                                    var18.field1966 += var17.field1966;
                                    var18.field1968 += var17.field1968;
                                    var18.field1969 += var17.field1969;
                                    var19.field1976 += var12.field1976;
                                    var19.field1966 += var12.field1966;
                                    var19.field1968 += var12.field1968;
                                    var19.field1969 += var12.field1969;
                                    ++var6;
                                    field2956[var9] = field2980;
                                    field2970[var16] = field2980;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field2971; ++var10) {
                if (field2956[arg0.field2944[var10]] == field2980 && field2956[arg0.field2945[var10]] == field2980 && field2956[arg0.field2961[var10]] == field2980) {
                    if (arg0.field2952 == null) {
                        arg0.field2952 = new byte[arg0.field2971];
                    }
                    arg0.field2952[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field2971; ++var11) {
                if (field2970[arg1.field2944[var11]] == field2980 && field2970[arg1.field2945[var11]] == field2980 && field2970[arg1.field2961[var11]] == field2980) {
                    if (arg1.field2952 == null) {
                        arg1.field2952 = new byte[arg1.field2971];
                    }
                    arg1.field2952[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
    public final void method950() {
        for (int var1 = 0; var1 < this.field2948; ++var1) {
            this.field2965[var1] = -this.field2965[var1];
        }
        for (int var2 = 0; var2 < this.field2971; ++var2) {
            int var3 = this.field2944[var2];
            this.field2944[var2] = this.field2961[var2];
            this.field2961[var2] = var3;
        }
        this.method956();
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
    public final void method951() {
        for (int var1 = 0; var1 < this.field2948; ++var1) {
            int var2 = this.field2946[var1];
            this.field2946[var1] = this.field2965[var1];
            this.field2965[var1] = -var2;
        }
        this.method956();
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
    public final void method952(int arg0) {
        int var2 = field2981[arg0];
        int var3 = field2943[arg0];
        for (int var4 = 0; var4 < this.field2948; ++var4) {
            int var5 = this.field2965[var4] * var2 + this.field2946[var4] * var3 >> 16;
            this.field2965[var4] = this.field2965[var4] * var3 - this.field2946[var4] * var2 >> 16;
            this.field2946[var4] = var5;
        }
        this.method956();
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)I")
    private static final int method953(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public final void method954(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2948; ++var4) {
            this.field2946[var4] += arg0;
            this.field2975[var4] += arg1;
            this.field2965[var4] += arg2;
        }
        this.method956();
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)V")
    public final void method955(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2948; ++var4) {
            this.field2946[var4] = this.field2946[var4] * arg0 / 128;
            this.field2975[var4] = this.field2975[var4] * arg1 / 128;
            this.field2965[var4] = this.field2965[var4] * arg2 / 128;
        }
        this.method956();
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()V")
    private final void method956() {
        this.field2942 = null;
        this.field2958 = null;
        this.field2986 = null;
        this.field2985 = false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lla;II)Lsd;")
    public static final class129 method957(class77 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method585(arg1, 98, arg2);
        return var3 == null ? null : new class129(var3);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
    private static final int method958(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([B)V")
    private final void method959(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class95 var4 = new class95(arg0);
        class95 var5 = new class95(arg0);
        class95 var6 = new class95(arg0);
        class95 var7 = new class95(arg0);
        class95 var8 = new class95(arg0);
        var4.field2304 = arg0.length - 18;
        int var9 = var4.method795(1);
        int var10 = var4.method795(1);
        int var11 = var4.method790((byte) 73);
        int var12 = var4.method790((byte) 73);
        int var13 = var4.method790((byte) 73);
        int var14 = var4.method790((byte) 73);
        int var15 = var4.method790((byte) 73);
        int var16 = var4.method790((byte) 73);
        int var17 = var4.method795(1);
        int var18 = var4.method795(1);
        int var19 = var4.method795(1);
        int var20 = var4.method795(1);
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
        this.field2948 = var9;
        this.field2971 = var10;
        this.field2947 = var11;
        this.field2946 = new int[var9];
        this.field2975 = new int[var9];
        this.field2965 = new int[var9];
        this.field2944 = new int[var10];
        this.field2945 = new int[var10];
        this.field2961 = new int[var10];
        if (var11 > 0) {
            this.field2979 = new byte[var11];
            this.field2955 = new short[var11];
            this.field2950 = new short[var11];
            this.field2954 = new short[var11];
        }
        if (var16 == 1) {
            this.field2963 = new int[var9];
        }
        if (var12 == 1) {
            this.field2952 = new byte[var10];
            this.field2987 = new byte[var10];
            this.field2953 = new short[var10];
        }
        if (var13 == 255) {
            this.field2949 = new byte[var10];
        } else {
            this.field2976 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2973 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2968 = new int[var10];
        }
        this.field2966 = new short[var10];
        var4.field2304 = var21;
        var5.field2304 = var36;
        var6.field2304 = var38;
        var7.field2304 = var40;
        var8.field2304 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method790((byte) 73);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method771(49152);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method771(49152);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method771(49152);
            }
            this.field2946[var46] = var43 + var63;
            this.field2975[var46] = var44 + var64;
            this.field2965[var46] = var45 + var65;
            var43 = this.field2946[var46];
            var44 = this.field2975[var46];
            var45 = this.field2965[var46];
            if (var16 == 1) {
                this.field2963[var46] = var8.method790((byte) 73);
            }
        }
        var4.field2304 = var32;
        var5.field2304 = var28;
        var6.field2304 = var26;
        var7.field2304 = var30;
        var8.field2304 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field2966[var47] = (short) var4.method795(1);
            if (var12 == 1) {
                int var61 = var5.method790((byte) 73);
                if ((var61 & 1) == 1) {
                    this.field2952[var47] = 1;
                    var2 = true;
                } else {
                    this.field2952[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field2987[var47] = (byte) (var61 >> 2);
                    this.field2953[var47] = this.field2966[var47];
                    this.field2966[var47] = 127;
                    if (this.field2953[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2987[var47] = -1;
                    this.field2953[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2949[var47] = var6.method770((byte) -120);
            }
            if (var14 == 1) {
                this.field2973[var47] = var7.method770((byte) -111);
            }
            if (var15 == 1) {
                this.field2968[var47] = var8.method790((byte) 73);
            }
        }
        var4.field2304 = var25;
        var5.field2304 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method790((byte) 73);
            if (var57 == 1) {
                var48 = var4.method771(49152) + var51;
                var49 = var4.method771(49152) + var48;
                var50 = var4.method771(49152) + var49;
                var51 = var50;
                this.field2944[var52] = var48;
                this.field2945[var52] = var49;
                this.field2961[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method771(49152) + var51;
                var51 = var50;
                this.field2944[var52] = var48;
                this.field2945[var52] = var49;
                this.field2961[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method771(49152) + var51;
                var51 = var50;
                this.field2944[var52] = var48;
                this.field2945[var52] = var49;
                this.field2961[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method771(49152) + var51;
                var51 = var50;
                this.field2944[var52] = var48;
                this.field2945[var52] = var60;
                this.field2961[var52] = var50;
            }
        }
        var4.field2304 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field2979[var53] = 0;
            this.field2955[var53] = (short) var4.method795(1);
            this.field2950[var53] = (short) var4.method795(1);
            this.field2954[var53] = (short) var4.method795(1);
        }
        if (this.field2987 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field2987[var55] & 255;
                if (var56 != 255) {
                    if ((this.field2955[var56] & 65535) == this.field2944[var55] && (this.field2950[var56] & 65535) == this.field2945[var55] && (this.field2954[var56] & 65535) == this.field2961[var55]) {
                        this.field2987[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2987 = null;
            }
        }
        if (!var3) {
            this.field2953 = null;
        }
        if (!var2) {
            this.field2952 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "()V")
    private final void method960() {
        if (!this.field2985) {
            super.field1488 = 0;
            this.field2964 = 0;
            this.field2977 = 999999;
            this.field2988 = -999999;
            this.field2959 = -99999;
            this.field2960 = 99999;
            for (int var1 = 0; var1 < this.field2948; ++var1) {
                int var2 = this.field2946[var1];
                int var3 = this.field2975[var1];
                int var4 = this.field2965[var1];
                if (var2 < this.field2977) {
                    this.field2977 = var2;
                }
                if (var2 > this.field2988) {
                    this.field2988 = var2;
                }
                if (var4 < this.field2960) {
                    this.field2960 = var4;
                }
                if (var4 > this.field2959) {
                    this.field2959 = var4;
                }
                if (-var3 > super.field1488) {
                    super.field1488 = -var3;
                }
                if (var3 > this.field2964) {
                    this.field2964 = var3;
                }
            }
            this.field2985 = true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)Lu;")
    public final class139 method961(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method967();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class139 var8 = new class139();
        var8.field3165 = new int[this.field2971];
        var8.field3154 = new int[this.field2971];
        var8.field3137 = new int[this.field2971];
        if (this.field2947 > 0 && this.field2987 != null) {
            int[] var9 = new int[this.field2947];
            for (int var10 = 0; var10 < this.field2971; ++var10) {
                if (this.field2987[var10] != -1) {
                    ++var9[this.field2987[var10] & 255];
                }
            }
            var8.field3158 = 0;
            for (int var11 = 0; var11 < this.field2947; ++var11) {
                if (var9[var11] > 0 && this.field2979[var11] == 0) {
                    ++var8.field3158;
                }
            }
            var8.field3138 = new int[var8.field3158];
            var8.field3142 = new int[var8.field3158];
            var8.field3139 = new int[var8.field3158];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field2947; ++var13) {
                if (var9[var13] > 0 && this.field2979[var13] == 0) {
                    var8.field3138[var12] = this.field2955[var13] & 65535;
                    var8.field3142[var12] = this.field2950[var13] & 65535;
                    var8.field3139[var12] = this.field2954[var13] & 65535;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field3148 = new byte[this.field2971];
            for (int var14 = 0; var14 < this.field2971; ++var14) {
                if (this.field2987[var14] != -1) {
                    var8.field3148[var14] = (byte) var9[this.field2987[var14] & 255];
                } else {
                    var8.field3148[var14] = -1;
                }
            }
        }
        for (int var15 = 0; var15 < this.field2971; ++var15) {
            byte var16;
            if (this.field2952 == null) {
                var16 = 0;
            } else {
                var16 = this.field2952[var15];
            }
            byte var17;
            if (this.field2973 == null) {
                var17 = 0;
            } else {
                var17 = this.field2973[var15];
            }
            short var18;
            if (this.field2953 == null) {
                var18 = -1;
            } else {
                var18 = this.field2953[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 != 0) {
                    if (var16 == 1) {
                        class135 var26 = this.field2986[var15];
                        int var27 = (var26.field3076 * arg4 + var26.field3079 * arg2 + var26.field3077 * arg3) / (var7 / 2 + var7) + arg0;
                        var8.field3165[var15] = method958(this.field2966[var15] & 65535, var27);
                        var8.field3137[var15] = -1;
                    } else if (var16 == 3) {
                        var8.field3165[var15] = 128;
                        var8.field3137[var15] = -1;
                    } else {
                        var8.field3137[var15] = -2;
                    }
                } else {
                    int var19 = this.field2966[var15] & 65535;
                    class81 var20;
                    if (this.field2958 != null && this.field2958[this.field2944[var15]] != null) {
                        var20 = this.field2958[this.field2944[var15]];
                    } else {
                        var20 = this.field2942[this.field2944[var15]];
                    }
                    int var21 = (var20.field1968 * arg4 + var20.field1976 * arg2 + var20.field1966 * arg3) / (var20.field1969 * var7) + arg0;
                    var8.field3165[var15] = method958(var19, var21);
                    class81 var22;
                    if (this.field2958 != null && this.field2958[this.field2945[var15]] != null) {
                        var22 = this.field2958[this.field2945[var15]];
                    } else {
                        var22 = this.field2942[this.field2945[var15]];
                    }
                    int var23 = (var22.field1968 * arg4 + var22.field1976 * arg2 + var22.field1966 * arg3) / (var22.field1969 * var7) + arg0;
                    var8.field3154[var15] = method958(var19, var23);
                    class81 var24;
                    if (this.field2958 != null && this.field2958[this.field2961[var15]] != null) {
                        var24 = this.field2958[this.field2961[var15]];
                    } else {
                        var24 = this.field2942[this.field2961[var15]];
                    }
                    int var25 = (var24.field1968 * arg4 + var24.field1976 * arg2 + var24.field1966 * arg3) / (var24.field1969 * var7) + arg0;
                    var8.field3137[var15] = method958(var19, var25);
                }
            } else if (var16 != 0) {
                if (var16 == 1) {
                    class135 var34 = this.field2986[var15];
                    int var35 = (var34.field3076 * arg4 + var34.field3079 * arg2 + var34.field3077 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field3165[var15] = method953(var35);
                    var8.field3137[var15] = -1;
                } else {
                    var8.field3137[var15] = -2;
                }
            } else {
                class81 var28;
                if (this.field2958 != null && this.field2958[this.field2944[var15]] != null) {
                    var28 = this.field2958[this.field2944[var15]];
                } else {
                    var28 = this.field2942[this.field2944[var15]];
                }
                int var29 = (var28.field1968 * arg4 + var28.field1976 * arg2 + var28.field1966 * arg3) / (var28.field1969 * var7) + arg0;
                var8.field3165[var15] = method953(var29);
                class81 var30;
                if (this.field2958 != null && this.field2958[this.field2945[var15]] != null) {
                    var30 = this.field2958[this.field2945[var15]];
                } else {
                    var30 = this.field2942[this.field2945[var15]];
                }
                int var31 = (var30.field1968 * arg4 + var30.field1976 * arg2 + var30.field1966 * arg3) / (var30.field1969 * var7) + arg0;
                var8.field3154[var15] = method953(var31);
                class81 var32;
                if (this.field2958 != null && this.field2958[this.field2961[var15]] != null) {
                    var32 = this.field2958[this.field2961[var15]];
                } else {
                    var32 = this.field2942[this.field2961[var15]];
                }
                int var33 = (var32.field1968 * arg4 + var32.field1976 * arg2 + var32.field1966 * arg3) / (var32.field1969 * var7) + arg0;
                var8.field3137[var15] = method953(var33);
            }
        }
        this.method962();
        var8.field3156 = this.field2948;
        var8.field3152 = this.field2946;
        var8.field3164 = this.field2975;
        var8.field3141 = this.field2965;
        var8.field3163 = this.field2971;
        var8.field3140 = this.field2944;
        var8.field3157 = this.field2945;
        var8.field3150 = this.field2961;
        var8.field3149 = this.field2949;
        var8.field3147 = this.field2973;
        var8.field3155 = this.field2976;
        var8.field3160 = this.field2957;
        var8.field3166 = this.field2967;
        var8.field3143 = this.field2953;
        return var8;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "()V")
    private final void method962() {
        int var10002;
        if (this.field2963 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2948; ++var3) {
                int var7 = this.field2963[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2957 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field2957[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2948) {
                int var6 = this.field2963[var5];
                this.field2957[var6][var1[var6]++] = var5++;
            }
            this.field2963 = null;
        }
        if (this.field2968 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field2971; ++var10) {
                int var14 = this.field2968[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field2967 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field2967[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field2971) {
                int var13 = this.field2968[var12];
                this.field2967[var13][var8[var13]++] = var12++;
            }
            this.field2968 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "()V")
    public final void method963() {
        for (int var1 = 0; var1 < this.field2948; ++var1) {
            this.field2946[var1] = -this.field2946[var1];
            this.field2965[var1] = -this.field2965[var1];
        }
        this.method956();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(SS)V")
    public final void method964(short arg0, short arg1) {
        if (this.field2953 != null) {
            for (int var3 = 0; var3 < this.field2971; ++var3) {
                if (this.field2953[var3] == arg0) {
                    this.field2953[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "()V")
    public static void method965() {
        field2956 = null;
        field2970 = null;
        field2981 = null;
        field2943 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(SS)V")
    public final void method966(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2971; ++var3) {
            if (this.field2966[var3] == arg0) {
                this.field2966[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "()V")
    public final void method967() {
        if (this.field2942 == null) {
            this.field2942 = new class81[this.field2948];
            for (int var1 = 0; var1 < this.field2948; ++var1) {
                this.field2942[var1] = new class81();
            }
            for (int var2 = 0; var2 < this.field2971; ++var2) {
                int var3 = this.field2944[var2];
                int var4 = this.field2945[var2];
                int var5 = this.field2961[var2];
                int var6 = this.field2946[var4] - this.field2946[var3];
                int var7 = this.field2975[var4] - this.field2975[var3];
                int var8 = this.field2965[var4] - this.field2965[var3];
                int var9 = this.field2946[var5] - this.field2946[var3];
                int var10 = this.field2975[var5] - this.field2975[var3];
                int var11 = this.field2965[var5] - this.field2965[var3];
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
                if (this.field2952 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field2952[var2];
                }
                if (var19 == 0) {
                    class81 var20 = this.field2942[var3];
                    var20.field1976 += var16;
                    var20.field1966 += var17;
                    var20.field1968 += var18;
                    ++var20.field1969;
                    class81 var21 = this.field2942[var4];
                    var21.field1976 += var16;
                    var21.field1966 += var17;
                    var21.field1968 += var18;
                    ++var21.field1969;
                    class81 var22 = this.field2942[var5];
                    var22.field1976 += var16;
                    var22.field1966 += var17;
                    var22.field1968 += var18;
                    ++var22.field1969;
                } else if (var19 == 1) {
                    if (this.field2986 == null) {
                        this.field2986 = new class135[this.field2971];
                    }
                    class135 var23 = this.field2986[var2] = new class135();
                    var23.field3079 = var16;
                    var23.field3077 = var17;
                    var23.field3076 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "()V")
    public final void method968() {
        for (int var1 = 0; var1 < this.field2948; ++var1) {
            int var2 = this.field2965[var1];
            this.field2965[var1] = this.field2946[var1];
            this.field2946[var1] = -var2;
        }
        this.method956();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([[IIIIZI)Lsd;")
    public final class129 method969(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method960();
        int var7 = this.field2977 + arg1;
        int var8 = this.field2988 + arg1;
        int var9 = this.field2960 + arg3;
        int var10 = this.field2959 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class129 var15;
                if (arg4) {
                    var15 = new class129();
                    var15.field2948 = this.field2948;
                    var15.field2971 = this.field2971;
                    var15.field2947 = this.field2947;
                    var15.field2946 = this.field2946;
                    var15.field2965 = this.field2965;
                    var15.field2944 = this.field2944;
                    var15.field2945 = this.field2945;
                    var15.field2961 = this.field2961;
                    var15.field2952 = this.field2952;
                    var15.field2949 = this.field2949;
                    var15.field2973 = this.field2973;
                    var15.field2987 = this.field2987;
                    var15.field2966 = this.field2966;
                    var15.field2953 = this.field2953;
                    var15.field2976 = this.field2976;
                    var15.field2979 = this.field2979;
                    var15.field2955 = this.field2955;
                    var15.field2950 = this.field2950;
                    var15.field2954 = this.field2954;
                    var15.field2983 = this.field2983;
                    var15.field2978 = this.field2978;
                    var15.field2984 = this.field2984;
                    var15.field2969 = this.field2969;
                    var15.field2962 = this.field2962;
                    var15.field2951 = this.field2951;
                    var15.field2972 = this.field2972;
                    var15.field2963 = this.field2963;
                    var15.field2968 = this.field2968;
                    var15.field2957 = this.field2957;
                    var15.field2967 = this.field2967;
                    var15.field2974 = this.field2974;
                    var15.field2982 = this.field2982;
                    var15.field2975 = new int[var15.field2948];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field2948; ++var16) {
                        int var17 = this.field2946[var16] + arg1;
                        int var18 = this.field2965[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field2975[var16] = this.field2975[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field2948; ++var26) {
                        int var27 = (-this.field2975[var26] << 16) / super.field1488;
                        if (var27 < arg5) {
                            int var28 = this.field2946[var26] + arg1;
                            int var29 = this.field2965[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field2975[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2975[var26];
                        }
                    }
                }
                var15.method956();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "([B)V")
    private final void method970(byte[] arg0) {
        class95 var2 = new class95(arg0);
        class95 var3 = new class95(arg0);
        class95 var4 = new class95(arg0);
        class95 var5 = new class95(arg0);
        class95 var6 = new class95(arg0);
        class95 var7 = new class95(arg0);
        class95 var8 = new class95(arg0);
        var2.field2304 = arg0.length - 23;
        int var9 = var2.method795(1);
        int var10 = var2.method795(1);
        int var11 = var2.method790((byte) 73);
        int var12 = var2.method790((byte) 73);
        int var13 = var2.method790((byte) 73);
        int var14 = var2.method790((byte) 73);
        int var15 = var2.method790((byte) 73);
        int var16 = var2.method790((byte) 73);
        int var17 = var2.method790((byte) 73);
        int var18 = var2.method795(1);
        int var19 = var2.method795(1);
        int var20 = var2.method795(1);
        int var21 = var2.method795(1);
        int var22 = var2.method795(1);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2979 = new byte[var11];
            var2.field2304 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field2979[var26] = var2.method770((byte) 64);
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
        this.field2948 = var9;
        this.field2971 = var10;
        this.field2947 = var11;
        this.field2946 = new int[var9];
        this.field2975 = new int[var9];
        this.field2965 = new int[var9];
        this.field2944 = new int[var10];
        this.field2945 = new int[var10];
        this.field2961 = new int[var10];
        if (var17 == 1) {
            this.field2963 = new int[var9];
        }
        if (var12 == 1) {
            this.field2952 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2949 = new byte[var10];
        } else {
            this.field2976 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2973 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2968 = new int[var10];
        }
        if (var16 == 1) {
            this.field2953 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2987 = new byte[var10];
        }
        this.field2966 = new short[var10];
        if (var11 > 0) {
            this.field2955 = new short[var11];
            this.field2950 = new short[var11];
            this.field2954 = new short[var11];
            if (var24 > 0) {
                this.field2983 = new short[var24];
                this.field2978 = new short[var24];
                this.field2984 = new short[var24];
                this.field2969 = new short[var24];
                this.field2962 = new byte[var24];
                this.field2951 = new short[var24];
            }
            if (var25 > 0) {
                this.field2972 = new short[var25];
            }
        }
        var2.field2304 = var11;
        var3.field2304 = var44;
        var4.field2304 = var46;
        var5.field2304 = var48;
        var6.field2304 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method790((byte) 73);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method771(49152);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method771(49152);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method771(49152);
            }
            this.field2946[var67] = var64 + var82;
            this.field2975[var67] = var65 + var83;
            this.field2965[var67] = var66 + var84;
            var64 = this.field2946[var67];
            var65 = this.field2975[var67];
            var66 = this.field2965[var67];
            if (var17 == 1) {
                this.field2963[var67] = var6.method790((byte) 73);
            }
        }
        var2.field2304 = var42;
        var3.field2304 = var31;
        var4.field2304 = var34;
        var5.field2304 = var37;
        var6.field2304 = var35;
        var7.field2304 = var40;
        var8.field2304 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field2966[var68] = (short) var2.method795(1);
            if (var12 == 1) {
                this.field2952[var68] = var3.method770((byte) 108);
            }
            if (var13 == 255) {
                this.field2949[var68] = var4.method770((byte) -124);
            }
            if (var14 == 1) {
                this.field2973[var68] = var5.method770((byte) -8);
            }
            if (var15 == 1) {
                this.field2968[var68] = var6.method790((byte) 73);
            }
            if (var16 == 1) {
                this.field2953[var68] = (short) (var7.method795(1) - 1);
            }
            if (this.field2987 != null && this.field2953[var68] != -1) {
                this.field2987[var68] = (byte) (var8.method790((byte) 73) - 1);
            }
        }
        var2.field2304 = var33;
        var3.field2304 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method790((byte) 73);
            if (var77 == 1) {
                var69 = var2.method771(49152) + var72;
                var70 = var2.method771(49152) + var69;
                var71 = var2.method771(49152) + var70;
                var72 = var71;
                this.field2944[var73] = var69;
                this.field2945[var73] = var70;
                this.field2961[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method771(49152) + var72;
                var72 = var71;
                this.field2944[var73] = var69;
                this.field2945[var73] = var70;
                this.field2961[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method771(49152) + var72;
                var72 = var71;
                this.field2944[var73] = var69;
                this.field2945[var73] = var70;
                this.field2961[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method771(49152) + var72;
                var72 = var71;
                this.field2944[var73] = var69;
                this.field2945[var73] = var80;
                this.field2961[var73] = var71;
            }
        }
        var2.field2304 = var50;
        var3.field2304 = var52;
        var4.field2304 = var54;
        var5.field2304 = var56;
        var6.field2304 = var58;
        var7.field2304 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field2979[var74] & 255;
            if (var76 == 0) {
                this.field2955[var74] = (short) var2.method795(1);
                this.field2950[var74] = (short) var2.method795(1);
                this.field2954[var74] = (short) var2.method795(1);
            }
            if (var76 == 1) {
                this.field2955[var74] = (short) var3.method795(1);
                this.field2950[var74] = (short) var3.method795(1);
                this.field2954[var74] = (short) var3.method795(1);
                this.field2983[var74] = (short) var4.method795(1);
                this.field2978[var74] = (short) var4.method795(1);
                this.field2984[var74] = (short) var4.method795(1);
                this.field2969[var74] = (short) var5.method795(1);
                this.field2962[var74] = var6.method770((byte) -108);
                this.field2951[var74] = (short) var7.method795(1);
            }
            if (var76 == 2) {
                this.field2955[var74] = (short) var3.method795(1);
                this.field2950[var74] = (short) var3.method795(1);
                this.field2954[var74] = (short) var3.method795(1);
                this.field2983[var74] = (short) var4.method795(1);
                this.field2978[var74] = (short) var4.method795(1);
                this.field2984[var74] = (short) var4.method795(1);
                this.field2969[var74] = (short) var5.method795(1);
                this.field2962[var74] = var6.method770((byte) 13);
                this.field2951[var74] = (short) var7.method795(1);
                this.field2972[var74] = (short) var7.method795(1);
            }
            if (var76 == 3) {
                this.field2955[var74] = (short) var3.method795(1);
                this.field2950[var74] = (short) var3.method795(1);
                this.field2954[var74] = (short) var3.method795(1);
                this.field2983[var74] = (short) var4.method795(1);
                this.field2978[var74] = (short) var4.method795(1);
                this.field2984[var74] = (short) var4.method795(1);
                this.field2969[var74] = (short) var5.method795(1);
                this.field2962[var74] = var6.method770((byte) 30);
                this.field2951[var74] = (short) var7.method795(1);
            }
        }
        var2.field2304 = var62;
        int var75 = var2.method790((byte) 73);
        if (var75 != 0) {
            new class121();
            var2.method795(1);
            var2.method795(1);
            var2.method795(1);
            var2.method740((byte) -127);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lsd;I)I")
    private final int method971(class129 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2946[arg1];
        int var5 = arg0.field2975[arg1];
        int var6 = arg0.field2965[arg1];
        for (int var7 = 0; var7 < this.field2948; ++var7) {
            if (this.field2946[var7] == var4 && this.field2975[var7] == var5 && this.field2965[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2946[this.field2948] = var4;
            this.field2975[this.field2948] = var5;
            this.field2965[this.field2948] = var6;
            if (arg0.field2963 != null) {
                this.field2963[this.field2948] = arg0.field2963[arg1];
            }
            var3 = this.field2948++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    private class129() {
    }

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "()Lsd;")
    public final class129 method972() {
        class129 var1 = new class129();
        if (this.field2952 != null) {
            var1.field2952 = new byte[this.field2971];
            for (int var2 = 0; var2 < this.field2971; ++var2) {
                var1.field2952[var2] = this.field2952[var2];
            }
        }
        var1.field2948 = this.field2948;
        var1.field2971 = this.field2971;
        var1.field2947 = this.field2947;
        var1.field2946 = this.field2946;
        var1.field2975 = this.field2975;
        var1.field2965 = this.field2965;
        var1.field2944 = this.field2944;
        var1.field2945 = this.field2945;
        var1.field2961 = this.field2961;
        var1.field2949 = this.field2949;
        var1.field2973 = this.field2973;
        var1.field2987 = this.field2987;
        var1.field2966 = this.field2966;
        var1.field2953 = this.field2953;
        var1.field2976 = this.field2976;
        var1.field2979 = this.field2979;
        var1.field2955 = this.field2955;
        var1.field2950 = this.field2950;
        var1.field2954 = this.field2954;
        var1.field2983 = this.field2983;
        var1.field2978 = this.field2978;
        var1.field2984 = this.field2984;
        var1.field2969 = this.field2969;
        var1.field2962 = this.field2962;
        var1.field2951 = this.field2951;
        var1.field2972 = this.field2972;
        var1.field2963 = this.field2963;
        var1.field2968 = this.field2968;
        var1.field2957 = this.field2957;
        var1.field2967 = this.field2967;
        var1.field2942 = this.field2942;
        var1.field2986 = this.field2986;
        var1.field2974 = this.field2974;
        var1.field2982 = this.field2982;
        return var1;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([B)V")
    private class129(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method970(arg0);
        } else {
            this.method959(arg0);
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([Lsd;I)V")
    public class129(class129[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2948 = 0;
        this.field2971 = 0;
        this.field2947 = 0;
        this.field2976 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class129 var15 = arg0[var9];
            if (var15 != null) {
                this.field2948 += var15.field2948;
                this.field2971 += var15.field2971;
                this.field2947 += var15.field2947;
                if (var15.field2949 != null) {
                    var4 = true;
                } else {
                    if (this.field2976 == -1) {
                        this.field2976 = var15.field2976;
                    }
                    if (this.field2976 != var15.field2976) {
                        var4 = true;
                    }
                }
                var3 |= var15.field2952 != null;
                var5 |= var15.field2973 != null;
                var6 |= var15.field2968 != null;
                var7 |= var15.field2953 != null;
                var8 |= var15.field2987 != null;
            }
        }
        this.field2946 = new int[this.field2948];
        this.field2975 = new int[this.field2948];
        this.field2965 = new int[this.field2948];
        this.field2963 = new int[this.field2948];
        this.field2944 = new int[this.field2971];
        this.field2945 = new int[this.field2971];
        this.field2961 = new int[this.field2971];
        if (var3) {
            this.field2952 = new byte[this.field2971];
        }
        if (var4) {
            this.field2949 = new byte[this.field2971];
        }
        if (var5) {
            this.field2973 = new byte[this.field2971];
        }
        if (var6) {
            this.field2968 = new int[this.field2971];
        }
        if (var7) {
            this.field2953 = new short[this.field2971];
        }
        if (var8) {
            this.field2987 = new byte[this.field2971];
        }
        this.field2966 = new short[this.field2971];
        if (this.field2947 > 0) {
            this.field2979 = new byte[this.field2947];
            this.field2955 = new short[this.field2947];
            this.field2950 = new short[this.field2947];
            this.field2954 = new short[this.field2947];
            this.field2983 = new short[this.field2947];
            this.field2978 = new short[this.field2947];
            this.field2984 = new short[this.field2947];
            this.field2969 = new short[this.field2947];
            this.field2962 = new byte[this.field2947];
            this.field2951 = new short[this.field2947];
            this.field2972 = new short[this.field2947];
        }
        this.field2948 = 0;
        this.field2971 = 0;
        this.field2947 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class129 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2971; ++var12) {
                    if (var3 && var11.field2952 != null) {
                        this.field2952[this.field2971] = var11.field2952[var12];
                    }
                    if (var4) {
                        if (var11.field2949 != null) {
                            this.field2949[this.field2971] = var11.field2949[var12];
                        } else {
                            this.field2949[this.field2971] = var11.field2976;
                        }
                    }
                    if (var5 && var11.field2973 != null) {
                        this.field2973[this.field2971] = var11.field2973[var12];
                    }
                    if (var6 && var11.field2968 != null) {
                        this.field2968[this.field2971] = var11.field2968[var12];
                    }
                    if (var7) {
                        if (var11.field2953 != null) {
                            this.field2953[this.field2971] = var11.field2953[var12];
                        } else {
                            this.field2953[this.field2971] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field2987 != null && var11.field2987[var12] != -1) {
                            this.field2987[this.field2971] = (byte) (var11.field2987[var12] + this.field2947);
                        } else {
                            this.field2987[this.field2971] = -1;
                        }
                    }
                    this.field2966[this.field2971] = var11.field2966[var12];
                    this.field2944[this.field2971] = this.method971(var11, var11.field2944[var12]);
                    this.field2945[this.field2971] = this.method971(var11, var11.field2945[var12]);
                    this.field2961[this.field2971] = this.method971(var11, var11.field2961[var12]);
                    ++this.field2971;
                }
                for (int var13 = 0; var13 < var11.field2947; ++var13) {
                    byte var14 = this.field2979[this.field2947] = var11.field2979[var13];
                    if (var14 == 0) {
                        this.field2955[this.field2947] = (short) this.method971(var11, var11.field2955[var13]);
                        this.field2950[this.field2947] = (short) this.method971(var11, var11.field2950[var13]);
                        this.field2954[this.field2947] = (short) this.method971(var11, var11.field2954[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2955[this.field2947] = var11.field2955[var13];
                        this.field2950[this.field2947] = var11.field2950[var13];
                        this.field2954[this.field2947] = var11.field2954[var13];
                        this.field2983[this.field2947] = var11.field2983[var13];
                        this.field2978[this.field2947] = var11.field2978[var13];
                        this.field2984[this.field2947] = var11.field2984[var13];
                        this.field2969[this.field2947] = var11.field2969[var13];
                        this.field2962[this.field2947] = var11.field2962[var13];
                        this.field2951[this.field2947] = var11.field2951[var13];
                    }
                    if (var14 == 2) {
                        this.field2972[this.field2947] = var11.field2972[var13];
                    }
                    ++this.field2947;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lsd;ZZZZ)V")
    public class129(class129 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2948 = arg0.field2948;
        this.field2971 = arg0.field2971;
        this.field2947 = arg0.field2947;
        if (arg1) {
            this.field2946 = arg0.field2946;
            this.field2975 = arg0.field2975;
            this.field2965 = arg0.field2965;
        } else {
            this.field2946 = new int[this.field2948];
            this.field2975 = new int[this.field2948];
            this.field2965 = new int[this.field2948];
            for (int var6 = 0; var6 < this.field2948; ++var6) {
                this.field2946[var6] = arg0.field2946[var6];
                this.field2975[var6] = arg0.field2975[var6];
                this.field2965[var6] = arg0.field2965[var6];
            }
        }
        if (arg2) {
            this.field2966 = arg0.field2966;
        } else {
            this.field2966 = new short[this.field2971];
            for (int var7 = 0; var7 < this.field2971; ++var7) {
                this.field2966[var7] = arg0.field2966[var7];
            }
        }
        if (!arg3 && arg0.field2953 != null) {
            this.field2953 = new short[this.field2971];
            for (int var8 = 0; var8 < this.field2971; ++var8) {
                this.field2953[var8] = arg0.field2953[var8];
            }
        } else {
            this.field2953 = arg0.field2953;
        }
        if (arg4) {
            this.field2973 = arg0.field2973;
        } else {
            this.field2973 = new byte[this.field2971];
            if (arg0.field2973 == null) {
                for (int var9 = 0; var9 < this.field2971; ++var9) {
                    this.field2973[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2971; ++var10) {
                    this.field2973[var10] = arg0.field2973[var10];
                }
            }
        }
        this.field2944 = arg0.field2944;
        this.field2945 = arg0.field2945;
        this.field2961 = arg0.field2961;
        this.field2952 = arg0.field2952;
        this.field2949 = arg0.field2949;
        this.field2987 = arg0.field2987;
        this.field2976 = arg0.field2976;
        this.field2979 = arg0.field2979;
        this.field2955 = arg0.field2955;
        this.field2950 = arg0.field2950;
        this.field2954 = arg0.field2954;
        this.field2983 = arg0.field2983;
        this.field2978 = arg0.field2978;
        this.field2984 = arg0.field2984;
        this.field2969 = arg0.field2969;
        this.field2962 = arg0.field2962;
        this.field2951 = arg0.field2951;
        this.field2972 = arg0.field2972;
        this.field2963 = arg0.field2963;
        this.field2968 = arg0.field2968;
        this.field2957 = arg0.field2957;
        this.field2967 = arg0.field2967;
        this.field2942 = arg0.field2942;
        this.field2986 = arg0.field2986;
        this.field2958 = arg0.field2958;
        this.field2974 = arg0.field2974;
        this.field2982 = arg0.field2982;
    }
}
