import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class52 extends class4 {

    @OriginalMember(owner = "client!fe", name = "Eb", descriptor = "I")
    public int field953 = 0;

    @OriginalMember(owner = "client!fe", name = "tb", descriptor = "I")
    public int field942 = 0;

    @OriginalMember(owner = "client!fe", name = "Rb", descriptor = "B")
    public byte field966 = 0;

    @OriginalMember(owner = "client!fe", name = "Jb", descriptor = "Z")
    private boolean field958 = false;

    @OriginalMember(owner = "client!fe", name = "Wb", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!fe", name = "ub", descriptor = "[I")
    public int[] field943;

    @OriginalMember(owner = "client!fe", name = "Ub", descriptor = "[I")
    public int[] field969;

    @OriginalMember(owner = "client!fe", name = "Bb", descriptor = "[I")
    public int[] field950;

    @OriginalMember(owner = "client!fe", name = "kb", descriptor = "[I")
    private int[] field933;

    @OriginalMember(owner = "client!fe", name = "Zb", descriptor = "[I")
    public int[] field974;

    @OriginalMember(owner = "client!fe", name = "ec", descriptor = "[I")
    public int[] field979;

    @OriginalMember(owner = "client!fe", name = "ac", descriptor = "[I")
    public int[] field975;

    @OriginalMember(owner = "client!fe", name = "Lb", descriptor = "[B")
    public byte[] field960;

    @OriginalMember(owner = "client!fe", name = "Db", descriptor = "[B")
    public byte[] field952;

    @OriginalMember(owner = "client!fe", name = "yb", descriptor = "[B")
    public byte[] field947;

    @OriginalMember(owner = "client!fe", name = "qb", descriptor = "[I")
    private int[] field939;

    @OriginalMember(owner = "client!fe", name = "Gb", descriptor = "[S")
    public short[] field955;

    @OriginalMember(owner = "client!fe", name = "wb", descriptor = "[B")
    public byte[] field945;

    @OriginalMember(owner = "client!fe", name = "xb", descriptor = "[S")
    public short[] field946;

    @OriginalMember(owner = "client!fe", name = "nb", descriptor = "[B")
    public byte[] field936;

    @OriginalMember(owner = "client!fe", name = "Tb", descriptor = "[S")
    public short[] field968;

    @OriginalMember(owner = "client!fe", name = "pb", descriptor = "[S")
    public short[] field938;

    @OriginalMember(owner = "client!fe", name = "Ob", descriptor = "[S")
    public short[] field963;

    @OriginalMember(owner = "client!fe", name = "Mb", descriptor = "[S")
    private short[] field961;

    @OriginalMember(owner = "client!fe", name = "cc", descriptor = "[S")
    private short[] field977;

    @OriginalMember(owner = "client!fe", name = "vb", descriptor = "[S")
    private short[] field944;

    @OriginalMember(owner = "client!fe", name = "Ab", descriptor = "[B")
    private byte[] field949;

    @OriginalMember(owner = "client!fe", name = "Pb", descriptor = "[B")
    private byte[] field964;

    @OriginalMember(owner = "client!fe", name = "Vb", descriptor = "[B")
    private byte[] field970;

    @OriginalMember(owner = "client!fe", name = "Nb", descriptor = "[B")
    private byte[] field962;

    @OriginalMember(owner = "client!fe", name = "Kb", descriptor = "[B")
    private byte[] field959;

    @OriginalMember(owner = "client!fe", name = "Xb", descriptor = "[[I")
    public int[][] field972;

    @OriginalMember(owner = "client!fe", name = "ob", descriptor = "[[I")
    public int[][] field937;

    @OriginalMember(owner = "client!fe", name = "mb", descriptor = "[Lqc;")
    public class147[] field935;

    @OriginalMember(owner = "client!fe", name = "Qb", descriptor = "[Ltf;")
    public class177[] field965;

    @OriginalMember(owner = "client!fe", name = "bc", descriptor = "[Lqc;")
    public class147[] field976;

    @OriginalMember(owner = "client!fe", name = "Ib", descriptor = "S")
    public short field957;

    @OriginalMember(owner = "client!fe", name = "rb", descriptor = "S")
    public short field940;

    @OriginalMember(owner = "client!fe", name = "sb", descriptor = "[I")
    private static int[] field941 = new int[10000];

    @OriginalMember(owner = "client!fe", name = "Hb", descriptor = "I")
    private static int field956 = 0;

    @OriginalMember(owner = "client!fe", name = "Fb", descriptor = "[I")
    private static int[] field954 = new int[10000];

    @OriginalMember(owner = "client!fe", name = "jb", descriptor = "[I")
    private static int[] field932 = class12.field279;

    @OriginalMember(owner = "client!fe", name = "Yb", descriptor = "[I")
    private static int[] field973 = class12.field283;

    @OriginalMember(owner = "client!fe", name = "lb", descriptor = "S")
    private short field934;

    @OriginalMember(owner = "client!fe", name = "zb", descriptor = "S")
    private short field948;

    @OriginalMember(owner = "client!fe", name = "Cb", descriptor = "S")
    private short field951;

    @OriginalMember(owner = "client!fe", name = "Sb", descriptor = "S")
    private short field967;

    @OriginalMember(owner = "client!fe", name = "dc", descriptor = "S")
    private short field978;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
    public final void method319(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field953; ++var4) {
            this.field943[var4] = this.field943[var4] * arg0 / 128;
            this.field969[var4] = this.field969[var4] * arg1 / 128;
            this.field950[var4] = this.field950[var4] * arg2 / 128;
        }
        this.method326();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()Lfe;")
    public final class52 method320() {
        class52 var1 = new class52();
        if (this.field960 != null) {
            var1.field960 = new byte[this.field942];
            for (int var2 = 0; var2 < this.field942; ++var2) {
                var1.field960[var2] = this.field960[var2];
            }
        }
        var1.field953 = this.field953;
        var1.field942 = this.field942;
        var1.field971 = this.field971;
        var1.field943 = this.field943;
        var1.field969 = this.field969;
        var1.field950 = this.field950;
        var1.field974 = this.field974;
        var1.field979 = this.field979;
        var1.field975 = this.field975;
        var1.field952 = this.field952;
        var1.field947 = this.field947;
        var1.field945 = this.field945;
        var1.field946 = this.field946;
        var1.field955 = this.field955;
        var1.field966 = this.field966;
        var1.field936 = this.field936;
        var1.field968 = this.field968;
        var1.field938 = this.field938;
        var1.field963 = this.field963;
        var1.field961 = this.field961;
        var1.field977 = this.field977;
        var1.field944 = this.field944;
        var1.field949 = this.field949;
        var1.field964 = this.field964;
        var1.field970 = this.field970;
        var1.field962 = this.field962;
        var1.field959 = this.field959;
        var1.field933 = this.field933;
        var1.field939 = this.field939;
        var1.field972 = this.field972;
        var1.field937 = this.field937;
        var1.field935 = this.field935;
        var1.field965 = this.field965;
        var1.field957 = this.field957;
        var1.field940 = this.field940;
        return var1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lfe;I)I")
    private final int method321(class52 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field943[arg1];
        int var5 = arg0.field969[arg1];
        int var6 = arg0.field950[arg1];
        for (int var7 = 0; var7 < this.field953; ++var7) {
            if (this.field943[var7] == var4 && this.field969[var7] == var5 && this.field950[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field943[this.field953] = var4;
            this.field969[this.field953] = var5;
            this.field950[this.field953] = var6;
            if (arg0.field933 != null) {
                this.field933[this.field953] = arg0.field933[arg1];
            }
            var3 = this.field953++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lfe;Lfe;IIIZ)V")
    public static final void method322(class52 arg0, class52 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method332();
        arg0.method335();
        arg1.method332();
        arg1.method335();
        ++field956;
        int var6 = 0;
        int[] var7 = arg1.field943;
        int var8 = arg1.field953;
        for (int var9 = 0; var9 < arg0.field953; ++var9) {
            class147 var12 = arg0.field935[var9];
            if (var12.field2708 != 0) {
                int var13 = arg0.field969[var9] - arg3;
                if (var13 >= arg1.field84 && var13 <= arg1.field978) {
                    int var14 = arg0.field943[var9] - arg2;
                    if (var14 >= arg1.field951 && var14 <= arg1.field967) {
                        int var15 = arg0.field950[var9] - arg4;
                        if (var15 >= arg1.field948 && var15 <= arg1.field934) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class147 var17 = arg1.field935[var16];
                                if (var7[var16] == var14 && arg1.field950[var16] == var15 && arg1.field969[var16] == var13 && var17.field2708 != 0) {
                                    if (arg0.field976 == null) {
                                        arg0.field976 = new class147[arg0.field953];
                                    }
                                    if (arg1.field976 == null) {
                                        arg1.field976 = new class147[var8];
                                    }
                                    class147 var18 = arg0.field976[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field976[var9] = new class147(var12);
                                    }
                                    class147 var19 = arg1.field976[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field976[var16] = new class147(var17);
                                    }
                                    var18.field2707 += var17.field2707;
                                    var18.field2709 += var17.field2709;
                                    var18.field2714 += var17.field2714;
                                    var18.field2708 += var17.field2708;
                                    var19.field2707 += var12.field2707;
                                    var19.field2709 += var12.field2709;
                                    var19.field2714 += var12.field2714;
                                    var19.field2708 += var12.field2708;
                                    ++var6;
                                    field941[var9] = field956;
                                    field954[var16] = field956;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field942; ++var10) {
                if (field941[arg0.field974[var10]] == field956 && field941[arg0.field979[var10]] == field956 && field941[arg0.field975[var10]] == field956) {
                    if (arg0.field960 == null) {
                        arg0.field960 = new byte[arg0.field942];
                    }
                    arg0.field960[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field942; ++var11) {
                if (field954[arg1.field974[var11]] == field956 && field954[arg1.field979[var11]] == field956 && field954[arg1.field975[var11]] == field956) {
                    if (arg1.field960 == null) {
                        arg1.field960 = new byte[arg1.field942];
                    }
                    arg1.field960[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
    public final void method323() {
        int var10002;
        if (this.field933 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field953; ++var3) {
                int var7 = this.field933[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field972 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field972[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field953) {
                int var6 = this.field933[var5];
                this.field972[var6][var1[var6]++] = var5++;
            }
            this.field933 = null;
        }
        if (this.field939 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field942; ++var10) {
                int var14 = this.field939[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field937 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field937[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field942) {
                int var13 = this.field939[var12];
                this.field937[var13][var8[var13]++] = var12++;
            }
            this.field939 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(SS)V")
    public final void method324(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field942; ++var3) {
            if (this.field946[var3] == arg0) {
                this.field946[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIZZ)Lcd;")
    public final class24 method325(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class30(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()V")
    private final void method326() {
        this.field935 = null;
        this.field976 = null;
        this.field965 = null;
        this.field958 = false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)Lda;")
    public final class30 method327(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class30(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
    public final void method328() {
        for (int var1 = 0; var1 < this.field953; ++var1) {
            this.field943[var1] = -this.field943[var1];
            this.field950[var1] = -this.field950[var1];
        }
        this.method326();
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V")
    public final void method329(int arg0) {
        int var2 = field932[arg0];
        int var3 = field973[arg0];
        for (int var4 = 0; var4 < this.field953; ++var4) {
            int var5 = this.field950[var4] * var2 + this.field943[var4] * var3 >> 16;
            this.field950[var4] = this.field950[var4] * var3 - this.field943[var4] * var2 >> 16;
            this.field943[var4] = var5;
        }
        this.method326();
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "()V")
    public final void method330() {
        for (int var1 = 0; var1 < this.field953; ++var1) {
            this.field950[var1] = -this.field950[var1];
        }
        for (int var2 = 0; var2 < this.field942; ++var2) {
            int var3 = this.field974[var2];
            this.field974[var2] = this.field975[var2];
            this.field975[var2] = var3;
        }
        this.method326();
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
    public final void method331(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field953; ++var4) {
            this.field943[var4] += arg0;
            this.field969[var4] += arg1;
            this.field950[var4] += arg2;
        }
        this.method326();
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "()V")
    private final void method332() {
        if (!this.field958) {
            this.field958 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field953; ++var7) {
                int var8 = this.field943[var7];
                int var9 = this.field969[var7];
                int var10 = this.field950[var7];
                if (var8 < var1) {
                    var1 = var8;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var9 < var2) {
                    var2 = var9;
                }
                if (var9 > var5) {
                    var5 = var9;
                }
                if (var10 < var3) {
                    var3 = var10;
                }
                if (var10 > var6) {
                    var6 = var10;
                }
            }
            this.field951 = (short) var1;
            this.field967 = (short) var4;
            super.field84 = (short) var2;
            this.field978 = (short) var5;
            this.field948 = (short) var3;
            this.field934 = (short) var6;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([[IIIIZI)Lfe;")
    public final class52 method333(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method332();
        int var7 = this.field951 + arg1;
        int var8 = this.field967 + arg1;
        int var9 = this.field948 + arg3;
        int var10 = this.field934 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class52 var15;
                if (arg4) {
                    var15 = new class52();
                    var15.field953 = this.field953;
                    var15.field942 = this.field942;
                    var15.field971 = this.field971;
                    var15.field943 = this.field943;
                    var15.field950 = this.field950;
                    var15.field974 = this.field974;
                    var15.field979 = this.field979;
                    var15.field975 = this.field975;
                    var15.field960 = this.field960;
                    var15.field952 = this.field952;
                    var15.field947 = this.field947;
                    var15.field945 = this.field945;
                    var15.field946 = this.field946;
                    var15.field955 = this.field955;
                    var15.field966 = this.field966;
                    var15.field936 = this.field936;
                    var15.field968 = this.field968;
                    var15.field938 = this.field938;
                    var15.field963 = this.field963;
                    var15.field961 = this.field961;
                    var15.field977 = this.field977;
                    var15.field944 = this.field944;
                    var15.field949 = this.field949;
                    var15.field964 = this.field964;
                    var15.field970 = this.field970;
                    var15.field962 = this.field962;
                    var15.field959 = this.field959;
                    var15.field933 = this.field933;
                    var15.field939 = this.field939;
                    var15.field972 = this.field972;
                    var15.field937 = this.field937;
                    var15.field957 = this.field957;
                    var15.field940 = this.field940;
                    var15.field969 = new int[var15.field953];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field953; ++var16) {
                        int var17 = this.field943[var16] + arg1;
                        int var18 = this.field950[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field969[var16] = this.field969[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field953; ++var26) {
                        int var27 = (this.field969[var26] << 16) / super.field84;
                        if (var27 < arg5) {
                            int var28 = this.field943[var26] + arg1;
                            int var29 = this.field950[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field969[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field969[var26];
                        } else {
                            var15.field969[var26] = this.field969[var26];
                        }
                    }
                }
                var15.method326();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([B)V")
    private final void method334(byte[] arg0) {
        class127 var2 = new class127(arg0);
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var2.field2346 = arg0.length - 23;
        int var9 = var2.method785(true);
        int var10 = var2.method785(true);
        int var11 = var2.method819((byte) 22);
        int var12 = var2.method819((byte) 22);
        int var13 = var2.method819((byte) 22);
        int var14 = var2.method819((byte) 22);
        int var15 = var2.method819((byte) 22);
        int var16 = var2.method819((byte) 22);
        int var17 = var2.method819((byte) 22);
        int var18 = var2.method785(true);
        int var19 = var2.method785(true);
        int var20 = var2.method785(true);
        int var21 = var2.method785(true);
        int var22 = var2.method785(true);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field936 = new byte[var11];
            var2.field2346 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field936[var26] = var2.method824((byte) -103);
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
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field953 = var9;
        this.field942 = var10;
        this.field971 = var11;
        this.field943 = new int[var9];
        this.field969 = new int[var9];
        this.field950 = new int[var9];
        this.field974 = new int[var10];
        this.field979 = new int[var10];
        this.field975 = new int[var10];
        if (var17 == 1) {
            this.field933 = new int[var9];
        }
        if (var12 == 1) {
            this.field960 = new byte[var10];
        }
        if (var13 == 255) {
            this.field952 = new byte[var10];
        } else {
            this.field966 = (byte) var13;
        }
        if (var14 == 1) {
            this.field947 = new byte[var10];
        }
        if (var15 == 1) {
            this.field939 = new int[var10];
        }
        if (var16 == 1) {
            this.field955 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field945 = new byte[var10];
        }
        this.field946 = new short[var10];
        if (var11 > 0) {
            this.field968 = new short[var11];
            this.field938 = new short[var11];
            this.field963 = new short[var11];
            if (var24 > 0) {
                this.field961 = new short[var24];
                this.field977 = new short[var24];
                this.field944 = new short[var24];
                this.field949 = new byte[var24];
                this.field964 = new byte[var24];
                this.field970 = new byte[var24];
            }
            if (var25 > 0) {
                this.field962 = new byte[var25];
                this.field959 = new byte[var25];
            }
        }
        var2.field2346 = var11;
        var3.field2346 = var44;
        var4.field2346 = var46;
        var5.field2346 = var48;
        var6.field2346 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method819((byte) 22);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method807(-1465967912);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method807(-1465967912);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method807(-1465967912);
            }
            this.field943[var67] = var64 + var82;
            this.field969[var67] = var65 + var83;
            this.field950[var67] = var66 + var84;
            var64 = this.field943[var67];
            var65 = this.field969[var67];
            var66 = this.field950[var67];
            if (var17 == 1) {
                this.field933[var67] = var6.method819((byte) 22);
            }
        }
        var2.field2346 = var42;
        var3.field2346 = var31;
        var4.field2346 = var34;
        var5.field2346 = var37;
        var6.field2346 = var35;
        var7.field2346 = var40;
        var8.field2346 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field946[var68] = (short) var2.method785(true);
            if (var12 == 1) {
                this.field960[var68] = var3.method824((byte) 70);
            }
            if (var13 == 255) {
                this.field952[var68] = var4.method824((byte) -78);
            }
            if (var14 == 1) {
                this.field947[var68] = var5.method824((byte) -50);
            }
            if (var15 == 1) {
                this.field939[var68] = var6.method819((byte) 22);
            }
            if (var16 == 1) {
                this.field955[var68] = (short) (var7.method785(true) - 1);
            }
            if (this.field945 != null) {
                if (this.field955[var68] != -1) {
                    this.field945[var68] = (byte) (var8.method819((byte) 22) - 1);
                } else {
                    this.field945[var68] = -1;
                }
            }
        }
        var2.field2346 = var33;
        var3.field2346 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method819((byte) 22);
            if (var77 == 1) {
                var69 = var2.method807(-1465967912) + var72;
                var70 = var2.method807(-1465967912) + var69;
                var71 = var2.method807(-1465967912) + var70;
                var72 = var71;
                this.field974[var73] = var69;
                this.field979[var73] = var70;
                this.field975[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method807(-1465967912) + var72;
                var72 = var71;
                this.field974[var73] = var69;
                this.field979[var73] = var70;
                this.field975[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method807(-1465967912) + var72;
                var72 = var71;
                this.field974[var73] = var69;
                this.field979[var73] = var70;
                this.field975[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method807(-1465967912) + var72;
                var72 = var71;
                this.field974[var73] = var69;
                this.field979[var73] = var80;
                this.field975[var73] = var71;
            }
        }
        var2.field2346 = var50;
        var3.field2346 = var52;
        var4.field2346 = var54;
        var5.field2346 = var56;
        var6.field2346 = var58;
        var7.field2346 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field936[var74] & 255;
            if (var76 == 0) {
                this.field968[var74] = (short) var2.method785(true);
                this.field938[var74] = (short) var2.method785(true);
                this.field963[var74] = (short) var2.method785(true);
            }
            if (var76 == 1) {
                this.field968[var74] = (short) var3.method785(true);
                this.field938[var74] = (short) var3.method785(true);
                this.field963[var74] = (short) var3.method785(true);
                this.field961[var74] = (short) var4.method785(true);
                this.field977[var74] = (short) var4.method785(true);
                this.field944[var74] = (short) var4.method785(true);
                this.field949[var74] = var5.method824((byte) -38);
                this.field964[var74] = var6.method824((byte) -113);
                this.field970[var74] = var7.method824((byte) 76);
            }
            if (var76 == 2) {
                this.field968[var74] = (short) var3.method785(true);
                this.field938[var74] = (short) var3.method785(true);
                this.field963[var74] = (short) var3.method785(true);
                this.field961[var74] = (short) var4.method785(true);
                this.field977[var74] = (short) var4.method785(true);
                this.field944[var74] = (short) var4.method785(true);
                this.field949[var74] = var5.method824((byte) -114);
                this.field964[var74] = var6.method824((byte) -122);
                this.field970[var74] = var7.method824((byte) 67);
                this.field962[var74] = var7.method824((byte) 64);
                this.field959[var74] = var7.method824((byte) 107);
            }
            if (var76 == 3) {
                this.field968[var74] = (short) var3.method785(true);
                this.field938[var74] = (short) var3.method785(true);
                this.field963[var74] = (short) var3.method785(true);
                this.field961[var74] = (short) var4.method785(true);
                this.field977[var74] = (short) var4.method785(true);
                this.field944[var74] = (short) var4.method785(true);
                this.field949[var74] = var5.method824((byte) -100);
                this.field964[var74] = var6.method824((byte) 116);
                this.field970[var74] = var7.method824((byte) -53);
            }
        }
        var2.field2346 = var62;
        int var75 = var2.method819((byte) 22);
        if (var75 != 0) {
            new class94();
            var2.method785(true);
            var2.method785(true);
            var2.method785(true);
            var2.method814(8);
        }
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "()V")
    public final void method335() {
        if (this.field935 == null) {
            this.field935 = new class147[this.field953];
            for (int var1 = 0; var1 < this.field953; ++var1) {
                this.field935[var1] = new class147();
            }
            for (int var2 = 0; var2 < this.field942; ++var2) {
                int var3 = this.field974[var2];
                int var4 = this.field979[var2];
                int var5 = this.field975[var2];
                int var6 = this.field943[var4] - this.field943[var3];
                int var7 = this.field969[var4] - this.field969[var3];
                int var8 = this.field950[var4] - this.field950[var3];
                int var9 = this.field943[var5] - this.field943[var3];
                int var10 = this.field969[var5] - this.field969[var3];
                int var11 = this.field950[var5] - this.field950[var3];
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
                if (this.field960 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field960[var2];
                }
                if (var19 == 0) {
                    class147 var20 = this.field935[var3];
                    var20.field2707 += var16;
                    var20.field2709 += var17;
                    var20.field2714 += var18;
                    ++var20.field2708;
                    class147 var21 = this.field935[var4];
                    var21.field2707 += var16;
                    var21.field2709 += var17;
                    var21.field2714 += var18;
                    ++var21.field2708;
                    class147 var22 = this.field935[var5];
                    var22.field2707 += var16;
                    var22.field2709 += var17;
                    var22.field2714 += var18;
                    ++var22.field2708;
                } else if (var19 == 1) {
                    if (this.field965 == null) {
                        this.field965 = new class177[this.field942];
                    }
                    class177 var23 = this.field965[var2] = new class177();
                    var23.field3461 = var16;
                    var23.field3458 = var17;
                    var23.field3463 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "()V")
    public static void method336() {
        field941 = null;
        field954 = null;
        field932 = null;
        field973 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lke;II)Lfe;")
    public static final class52 method337(class95 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method552(arg2, arg1, 0);
        return var3 == null ? null : new class52(var3);
    }

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "()V")
    public final void method338() {
        for (int var1 = 0; var1 < this.field953; ++var1) {
            int var2 = this.field943[var1];
            this.field943[var1] = this.field950[var1];
            this.field950[var1] = -var2;
        }
        this.method326();
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "([B)V")
    private final void method339(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class127 var4 = new class127(arg0);
        class127 var5 = new class127(arg0);
        class127 var6 = new class127(arg0);
        class127 var7 = new class127(arg0);
        class127 var8 = new class127(arg0);
        var4.field2346 = arg0.length - 18;
        int var9 = var4.method785(true);
        int var10 = var4.method785(true);
        int var11 = var4.method819((byte) 22);
        int var12 = var4.method819((byte) 22);
        int var13 = var4.method819((byte) 22);
        int var14 = var4.method819((byte) 22);
        int var15 = var4.method819((byte) 22);
        int var16 = var4.method819((byte) 22);
        int var17 = var4.method785(true);
        int var18 = var4.method785(true);
        int var19 = var4.method785(true);
        int var20 = var4.method785(true);
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
        this.field953 = var9;
        this.field942 = var10;
        this.field971 = var11;
        this.field943 = new int[var9];
        this.field969 = new int[var9];
        this.field950 = new int[var9];
        this.field974 = new int[var10];
        this.field979 = new int[var10];
        this.field975 = new int[var10];
        if (var11 > 0) {
            this.field936 = new byte[var11];
            this.field968 = new short[var11];
            this.field938 = new short[var11];
            this.field963 = new short[var11];
        }
        if (var16 == 1) {
            this.field933 = new int[var9];
        }
        if (var12 == 1) {
            this.field960 = new byte[var10];
            this.field945 = new byte[var10];
            this.field955 = new short[var10];
        }
        if (var13 == 255) {
            this.field952 = new byte[var10];
        } else {
            this.field966 = (byte) var13;
        }
        if (var14 == 1) {
            this.field947 = new byte[var10];
        }
        if (var15 == 1) {
            this.field939 = new int[var10];
        }
        this.field946 = new short[var10];
        var4.field2346 = var21;
        var5.field2346 = var36;
        var6.field2346 = var38;
        var7.field2346 = var40;
        var8.field2346 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method819((byte) 22);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method807(-1465967912);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method807(-1465967912);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method807(-1465967912);
            }
            this.field943[var46] = var43 + var63;
            this.field969[var46] = var44 + var64;
            this.field950[var46] = var45 + var65;
            var43 = this.field943[var46];
            var44 = this.field969[var46];
            var45 = this.field950[var46];
            if (var16 == 1) {
                this.field933[var46] = var8.method819((byte) 22);
            }
        }
        var4.field2346 = var32;
        var5.field2346 = var28;
        var6.field2346 = var26;
        var7.field2346 = var30;
        var8.field2346 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field946[var47] = (short) var4.method785(true);
            if (var12 == 1) {
                int var61 = var5.method819((byte) 22);
                if ((var61 & 1) == 1) {
                    this.field960[var47] = 1;
                    var2 = true;
                } else {
                    this.field960[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field945[var47] = (byte) (var61 >> 2);
                    this.field955[var47] = this.field946[var47];
                    this.field946[var47] = 127;
                    if (this.field955[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field945[var47] = -1;
                    this.field955[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field952[var47] = var6.method824((byte) 109);
            }
            if (var14 == 1) {
                this.field947[var47] = var7.method824((byte) 63);
            }
            if (var15 == 1) {
                this.field939[var47] = var8.method819((byte) 22);
            }
        }
        var4.field2346 = var25;
        var5.field2346 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method819((byte) 22);
            if (var57 == 1) {
                var48 = var4.method807(-1465967912) + var51;
                var49 = var4.method807(-1465967912) + var48;
                var50 = var4.method807(-1465967912) + var49;
                var51 = var50;
                this.field974[var52] = var48;
                this.field979[var52] = var49;
                this.field975[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method807(-1465967912) + var51;
                var51 = var50;
                this.field974[var52] = var48;
                this.field979[var52] = var49;
                this.field975[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method807(-1465967912) + var51;
                var51 = var50;
                this.field974[var52] = var48;
                this.field979[var52] = var49;
                this.field975[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method807(-1465967912) + var51;
                var51 = var50;
                this.field974[var52] = var48;
                this.field979[var52] = var60;
                this.field975[var52] = var50;
            }
        }
        var4.field2346 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field936[var53] = 0;
            this.field968[var53] = (short) var4.method785(true);
            this.field938[var53] = (short) var4.method785(true);
            this.field963[var53] = (short) var4.method785(true);
        }
        if (this.field945 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field945[var55] & 255;
                if (var56 != 255) {
                    if ((this.field968[var56] & 65535) == this.field974[var55] && (this.field938[var56] & 65535) == this.field979[var55] && (this.field963[var56] & 65535) == this.field975[var55]) {
                        this.field945[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field945 = null;
            }
        }
        if (!var3) {
            this.field955 = null;
        }
        if (!var2) {
            this.field960 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(SS)V")
    public final void method340(short arg0, short arg1) {
        if (this.field955 != null) {
            for (int var3 = 0; var3 < this.field942; ++var3) {
                if (this.field955[var3] == arg0) {
                    this.field955[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "()V")
    public final void method341() {
        for (int var1 = 0; var1 < this.field953; ++var1) {
            int var2 = this.field950[var1];
            this.field950[var1] = this.field943[var1];
            this.field943[var1] = -var2;
        }
        this.method326();
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    private class52() {
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([B)V")
    private class52(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method334(arg0);
        } else {
            this.method339(arg0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([Lfe;I)V")
    public class52(class52[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field953 = 0;
        this.field942 = 0;
        this.field971 = 0;
        this.field966 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class52 var15 = arg0[var9];
            if (var15 != null) {
                this.field953 += var15.field953;
                this.field942 += var15.field942;
                this.field971 += var15.field971;
                if (var15.field952 != null) {
                    var4 = true;
                } else {
                    if (this.field966 == -1) {
                        this.field966 = var15.field966;
                    }
                    if (this.field966 != var15.field966) {
                        var4 = true;
                    }
                }
                var3 |= var15.field960 != null;
                var5 |= var15.field947 != null;
                var6 |= var15.field939 != null;
                var7 |= var15.field955 != null;
                var8 |= var15.field945 != null;
            }
        }
        this.field943 = new int[this.field953];
        this.field969 = new int[this.field953];
        this.field950 = new int[this.field953];
        this.field933 = new int[this.field953];
        this.field974 = new int[this.field942];
        this.field979 = new int[this.field942];
        this.field975 = new int[this.field942];
        if (var3) {
            this.field960 = new byte[this.field942];
        }
        if (var4) {
            this.field952 = new byte[this.field942];
        }
        if (var5) {
            this.field947 = new byte[this.field942];
        }
        if (var6) {
            this.field939 = new int[this.field942];
        }
        if (var7) {
            this.field955 = new short[this.field942];
        }
        if (var8) {
            this.field945 = new byte[this.field942];
        }
        this.field946 = new short[this.field942];
        if (this.field971 > 0) {
            this.field936 = new byte[this.field971];
            this.field968 = new short[this.field971];
            this.field938 = new short[this.field971];
            this.field963 = new short[this.field971];
            this.field961 = new short[this.field971];
            this.field977 = new short[this.field971];
            this.field944 = new short[this.field971];
            this.field949 = new byte[this.field971];
            this.field964 = new byte[this.field971];
            this.field970 = new byte[this.field971];
            this.field962 = new byte[this.field971];
            this.field959 = new byte[this.field971];
        }
        this.field953 = 0;
        this.field942 = 0;
        this.field971 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class52 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field942; ++var12) {
                    if (var3 && var11.field960 != null) {
                        this.field960[this.field942] = var11.field960[var12];
                    }
                    if (var4) {
                        if (var11.field952 != null) {
                            this.field952[this.field942] = var11.field952[var12];
                        } else {
                            this.field952[this.field942] = var11.field966;
                        }
                    }
                    if (var5 && var11.field947 != null) {
                        this.field947[this.field942] = var11.field947[var12];
                    }
                    if (var6 && var11.field939 != null) {
                        this.field939[this.field942] = var11.field939[var12];
                    }
                    if (var7) {
                        if (var11.field955 != null) {
                            this.field955[this.field942] = var11.field955[var12];
                        } else {
                            this.field955[this.field942] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field945 != null && var11.field945[var12] != -1) {
                            this.field945[this.field942] = (byte) (var11.field945[var12] + this.field971);
                        } else {
                            this.field945[this.field942] = -1;
                        }
                    }
                    this.field946[this.field942] = var11.field946[var12];
                    this.field974[this.field942] = this.method321(var11, var11.field974[var12]);
                    this.field979[this.field942] = this.method321(var11, var11.field979[var12]);
                    this.field975[this.field942] = this.method321(var11, var11.field975[var12]);
                    ++this.field942;
                }
                for (int var13 = 0; var13 < var11.field971; ++var13) {
                    byte var14 = this.field936[this.field971] = var11.field936[var13];
                    if (var14 == 0) {
                        this.field968[this.field971] = (short) this.method321(var11, var11.field968[var13]);
                        this.field938[this.field971] = (short) this.method321(var11, var11.field938[var13]);
                        this.field963[this.field971] = (short) this.method321(var11, var11.field963[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field968[this.field971] = var11.field968[var13];
                        this.field938[this.field971] = var11.field938[var13];
                        this.field963[this.field971] = var11.field963[var13];
                        this.field961[this.field971] = var11.field961[var13];
                        this.field977[this.field971] = var11.field977[var13];
                        this.field944[this.field971] = var11.field944[var13];
                        this.field949[this.field971] = var11.field949[var13];
                        this.field964[this.field971] = var11.field964[var13];
                        this.field970[this.field971] = var11.field970[var13];
                    }
                    if (var14 == 2) {
                        this.field962[this.field971] = var11.field962[var13];
                        this.field959[this.field971] = var11.field959[var13];
                    }
                    ++this.field971;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lfe;ZZZZ)V")
    public class52(class52 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field953 = arg0.field953;
        this.field942 = arg0.field942;
        this.field971 = arg0.field971;
        if (arg1) {
            this.field943 = arg0.field943;
            this.field969 = arg0.field969;
            this.field950 = arg0.field950;
        } else {
            this.field943 = new int[this.field953];
            this.field969 = new int[this.field953];
            this.field950 = new int[this.field953];
            for (int var6 = 0; var6 < this.field953; ++var6) {
                this.field943[var6] = arg0.field943[var6];
                this.field969[var6] = arg0.field969[var6];
                this.field950[var6] = arg0.field950[var6];
            }
        }
        if (arg2) {
            this.field946 = arg0.field946;
        } else {
            this.field946 = new short[this.field942];
            for (int var7 = 0; var7 < this.field942; ++var7) {
                this.field946[var7] = arg0.field946[var7];
            }
        }
        if (!arg3 && arg0.field955 != null) {
            this.field955 = new short[this.field942];
            for (int var8 = 0; var8 < this.field942; ++var8) {
                this.field955[var8] = arg0.field955[var8];
            }
        } else {
            this.field955 = arg0.field955;
        }
        if (arg4) {
            this.field947 = arg0.field947;
        } else {
            this.field947 = new byte[this.field942];
            if (arg0.field947 == null) {
                for (int var9 = 0; var9 < this.field942; ++var9) {
                    this.field947[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field942; ++var10) {
                    this.field947[var10] = arg0.field947[var10];
                }
            }
        }
        this.field974 = arg0.field974;
        this.field979 = arg0.field979;
        this.field975 = arg0.field975;
        this.field960 = arg0.field960;
        this.field952 = arg0.field952;
        this.field945 = arg0.field945;
        this.field966 = arg0.field966;
        this.field936 = arg0.field936;
        this.field968 = arg0.field968;
        this.field938 = arg0.field938;
        this.field963 = arg0.field963;
        this.field961 = arg0.field961;
        this.field977 = arg0.field977;
        this.field944 = arg0.field944;
        this.field949 = arg0.field949;
        this.field964 = arg0.field964;
        this.field970 = arg0.field970;
        this.field962 = arg0.field962;
        this.field959 = arg0.field959;
        this.field933 = arg0.field933;
        this.field939 = arg0.field939;
        this.field972 = arg0.field972;
        this.field937 = arg0.field937;
        this.field935 = arg0.field935;
        this.field965 = arg0.field965;
        this.field976 = arg0.field976;
        this.field957 = arg0.field957;
        this.field940 = arg0.field940;
    }
}
