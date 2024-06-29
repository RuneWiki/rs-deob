import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 extends class53 {

    @OriginalMember(owner = "client!fe", name = "Lb", descriptor = "I")
    private int field1078 = 0;

    @OriginalMember(owner = "client!fe", name = "Bb", descriptor = "Z")
    private boolean field1068 = false;

    @OriginalMember(owner = "client!fe", name = "Nb", descriptor = "B")
    private byte field1080 = 0;

    @OriginalMember(owner = "client!fe", name = "xb", descriptor = "I")
    private int field1064 = 0;

    @OriginalMember(owner = "client!fe", name = "Vb", descriptor = "I")
    private int field1088 = 0;

    @OriginalMember(owner = "client!fe", name = "Ub", descriptor = "[I")
    private int[] field1087;

    @OriginalMember(owner = "client!fe", name = "Ib", descriptor = "[I")
    private int[] field1075;

    @OriginalMember(owner = "client!fe", name = "Db", descriptor = "[I")
    private int[] field1070;

    @OriginalMember(owner = "client!fe", name = "Zb", descriptor = "[I")
    private int[] field1092;

    @OriginalMember(owner = "client!fe", name = "Ob", descriptor = "[I")
    private int[] field1081;

    @OriginalMember(owner = "client!fe", name = "Sb", descriptor = "[I")
    private int[] field1085;

    @OriginalMember(owner = "client!fe", name = "Pb", descriptor = "[I")
    private int[] field1082;

    @OriginalMember(owner = "client!fe", name = "Wb", descriptor = "[I")
    private int[] field1089;

    @OriginalMember(owner = "client!fe", name = "qb", descriptor = "[I")
    private int[] field1057;

    @OriginalMember(owner = "client!fe", name = "Rb", descriptor = "[I")
    private int[] field1084;

    @OriginalMember(owner = "client!fe", name = "Cb", descriptor = "[B")
    private byte[] field1069;

    @OriginalMember(owner = "client!fe", name = "rb", descriptor = "[B")
    private byte[] field1058;

    @OriginalMember(owner = "client!fe", name = "pb", descriptor = "[B")
    private byte[] field1056;

    @OriginalMember(owner = "client!fe", name = "sb", descriptor = "[B")
    private byte[] field1059;

    @OriginalMember(owner = "client!fe", name = "Yb", descriptor = "[I")
    private int[] field1091;

    @OriginalMember(owner = "client!fe", name = "Mb", descriptor = "[S")
    private short[] field1079;

    @OriginalMember(owner = "client!fe", name = "vb", descriptor = "[[I")
    private int[][] field1062;

    @OriginalMember(owner = "client!fe", name = "tb", descriptor = "[[I")
    private int[][] field1060;

    @OriginalMember(owner = "client!fe", name = "Fb", descriptor = "[Lbd;")
    private class12[] field1072;

    @OriginalMember(owner = "client!fe", name = "Kb", descriptor = "[Lpa;")
    private class105[] field1077;

    @OriginalMember(owner = "client!fe", name = "Gb", descriptor = "[Lbd;")
    private class12[] field1073;

    @OriginalMember(owner = "client!fe", name = "Hb", descriptor = "S")
    public short field1074;

    @OriginalMember(owner = "client!fe", name = "Eb", descriptor = "S")
    public short field1071;

    @OriginalMember(owner = "client!fe", name = "yb", descriptor = "[I")
    private static int[] field1065 = new int[10000];

    @OriginalMember(owner = "client!fe", name = "Jb", descriptor = "[I")
    private static int[] field1076 = new int[10000];

    @OriginalMember(owner = "client!fe", name = "ub", descriptor = "[I")
    private static int[] field1061 = new int[128];

    @OriginalMember(owner = "client!fe", name = "Qb", descriptor = "I")
    private static int field1083 = 0;

    @OriginalMember(owner = "client!fe", name = "wb", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client!fe", name = "zb", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "client!fe", name = "Ab", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client!fe", name = "Tb", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!fe", name = "Xb", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
    public final void method303() {
        for (int var1 = 0; var1 < this.field1088; ++var1) {
            this.field1070[var1] = -this.field1070[var1];
        }
        for (int var2 = 0; var2 < this.field1064; ++var2) {
            int var3 = this.field1092[var2];
            this.field1092[var2] = this.field1085[var2];
            this.field1085[var2] = var3;
        }
        this.method315();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lfe;I)I")
    private final int method304(class41 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1087[arg1];
        int var5 = arg0.field1075[arg1];
        int var6 = arg0.field1070[arg1];
        for (int var7 = 0; var7 < this.field1088; ++var7) {
            if (this.field1087[var7] == var4 && this.field1075[var7] == var5 && this.field1070[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1087[this.field1088] = var4;
            this.field1075[this.field1088] = var5;
            this.field1070[this.field1088] = var6;
            if (arg0.field1084 != null) {
                this.field1084[this.field1088] = arg0.field1084[arg1];
            }
            var3 = this.field1088++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lef;II)Lfe;")
    public static final class41 method305(class35 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method266(arg1, (byte) 121, arg2);
        return var3 == null ? null : new class41(var3);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()Lfe;")
    public final class41 method306() {
        class41 var1 = new class41();
        if (this.field1069 != null) {
            var1.field1069 = new byte[this.field1064];
            for (int var2 = 0; var2 < this.field1064; ++var2) {
                var1.field1069[var2] = this.field1069[var2];
            }
        }
        var1.field1088 = this.field1088;
        var1.field1064 = this.field1064;
        var1.field1078 = this.field1078;
        var1.field1087 = this.field1087;
        var1.field1075 = this.field1075;
        var1.field1070 = this.field1070;
        var1.field1092 = this.field1092;
        var1.field1081 = this.field1081;
        var1.field1085 = this.field1085;
        var1.field1056 = this.field1056;
        var1.field1059 = this.field1059;
        var1.field1058 = this.field1058;
        var1.field1079 = this.field1079;
        var1.field1080 = this.field1080;
        var1.field1082 = this.field1082;
        var1.field1089 = this.field1089;
        var1.field1057 = this.field1057;
        var1.field1084 = this.field1084;
        var1.field1091 = this.field1091;
        var1.field1062 = this.field1062;
        var1.field1060 = this.field1060;
        var1.field1072 = this.field1072;
        var1.field1077 = this.field1077;
        var1.field1074 = this.field1074;
        var1.field1071 = this.field1071;
        return var1;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()V")
    public final void method307() {
        for (int var1 = 0; var1 < this.field1088; ++var1) {
            this.field1087[var1] = -this.field1087[var1];
            this.field1070[var1] = -this.field1070[var1];
        }
        this.method315();
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
    public static void method308() {
        field1076 = null;
        field1065 = null;
        field1061 = null;
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "()V")
    private final void method309() {
        if (!this.field1068) {
            super.field1279 = 0;
            this.field1063 = 0;
            this.field1067 = 999999;
            this.field1086 = -999999;
            this.field1090 = -99999;
            this.field1066 = 99999;
            for (int var1 = 0; var1 < this.field1088; ++var1) {
                int var2 = this.field1087[var1];
                int var3 = this.field1075[var1];
                int var4 = this.field1070[var1];
                if (var2 < this.field1067) {
                    this.field1067 = var2;
                }
                if (var2 > this.field1086) {
                    this.field1086 = var2;
                }
                if (var4 < this.field1066) {
                    this.field1066 = var4;
                }
                if (var4 > this.field1090) {
                    this.field1090 = var4;
                }
                if (-var3 > super.field1279) {
                    super.field1279 = -var3;
                }
                if (var3 > this.field1063) {
                    this.field1063 = var3;
                }
            }
            this.field1068 = true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIZ)Lfe;")
    public final class41 method310(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
            return this;
        } else {
            class41 var6;
            if (arg4) {
                var6 = new class41();
                var6.field1088 = this.field1088;
                var6.field1064 = this.field1064;
                var6.field1078 = this.field1078;
                var6.field1087 = this.field1087;
                var6.field1070 = this.field1070;
                var6.field1092 = this.field1092;
                var6.field1081 = this.field1081;
                var6.field1085 = this.field1085;
                var6.field1069 = this.field1069;
                var6.field1056 = this.field1056;
                var6.field1059 = this.field1059;
                var6.field1058 = this.field1058;
                var6.field1079 = this.field1079;
                var6.field1080 = this.field1080;
                var6.field1082 = this.field1082;
                var6.field1089 = this.field1089;
                var6.field1057 = this.field1057;
                var6.field1084 = this.field1084;
                var6.field1091 = this.field1091;
                var6.field1062 = this.field1062;
                var6.field1060 = this.field1060;
                var6.field1074 = this.field1074;
                var6.field1071 = this.field1071;
                var6.field1075 = new int[var6.field1088];
            } else {
                var6 = this;
            }
            int var7 = (arg0 + arg1 + arg2 + arg3) / 4;
            for (int var8 = 0; var8 < var6.field1088; ++var8) {
                int var9 = this.field1087[var8];
                int var10 = this.field1075[var8];
                int var11 = this.field1070[var8];
                int var12 = (arg1 - arg0) * (var9 + 64) / 128 + arg0;
                int var13 = (arg2 - arg3) * (var9 + 64) / 128 + arg3;
                int var14 = (var13 - var12) * (var11 + 64) / 128 + var12;
                var6.field1075[var8] = var10 + var14 - var7;
            }
            var6.method315();
            return var6;
        }
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "()V")
    public final void method311() {
        for (int var1 = 0; var1 < this.field1088; ++var1) {
            int var2 = this.field1070[var1];
            this.field1070[var1] = this.field1087[var1];
            this.field1087[var1] = -var2;
        }
        this.method315();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
    public final void method312(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1088; ++var4) {
            this.field1087[var4] = this.field1087[var4] * arg0 / 128;
            this.field1075[var4] = this.field1075[var4] * arg1 / 128;
            this.field1070[var4] = this.field1070[var4] * arg2 / 128;
        }
        this.method315();
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)I")
    private static final int method313(int arg0) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 > 127) {
            arg0 = 127;
        }
        return field1061[arg0];
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "()V")
    public final void method314() {
        for (int var1 = 0; var1 < this.field1088; ++var1) {
            int var2 = this.field1087[var1];
            this.field1087[var1] = this.field1070[var1];
            this.field1070[var1] = -var2;
        }
        this.method315();
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "()V")
    private final void method315() {
        this.field1072 = null;
        this.field1073 = null;
        this.field1077 = null;
        this.field1068 = false;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
    public final void method316(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1088; ++var4) {
            this.field1087[var4] += arg0;
            this.field1075[var4] += arg1;
            this.field1070[var4] += arg2;
        }
        this.method315();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIII)Loa;")
    public final class98 method317(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method320();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class98 var8 = new class98();
        var8.field2457 = new int[this.field1064];
        var8.field2465 = new int[this.field1064];
        var8.field2449 = new int[this.field1064];
        for (int var9 = 0; var9 < this.field1064; ++var9) {
            byte var10;
            if (this.field1069 == null) {
                var10 = 0;
            } else {
                var10 = this.field1069[var9];
            }
            if (this.field1058 != null && this.field1058[var9] != -1) {
                if (var10 != 0) {
                    if (var10 == 1) {
                        class105 var17 = this.field1077[var9];
                        int var18 = (var17.field2589 * arg4 + var17.field2592 * arg2 + var17.field2591 * arg3) / (var7 / 2 + var7) + arg0;
                        var8.field2457[var9] = method313(var18);
                        var8.field2449[var9] = -1;
                    } else {
                        var8.field2449[var9] = -2;
                    }
                } else {
                    class12 var11;
                    if (this.field1073 != null && this.field1073[this.field1092[var9]] != null) {
                        var11 = this.field1073[this.field1092[var9]];
                    } else {
                        var11 = this.field1072[this.field1092[var9]];
                    }
                    int var12 = (var11.field343 * arg4 + var11.field337 * arg3 + var11.field335 * arg2) / (var11.field333 * var7) + arg0;
                    var8.field2457[var9] = method313(var12);
                    class12 var13;
                    if (this.field1073 != null && this.field1073[this.field1081[var9]] != null) {
                        var13 = this.field1073[this.field1081[var9]];
                    } else {
                        var13 = this.field1072[this.field1081[var9]];
                    }
                    int var14 = (var13.field343 * arg4 + var13.field337 * arg3 + var13.field335 * arg2) / (var13.field333 * var7) + arg0;
                    var8.field2465[var9] = method313(var14);
                    class12 var15;
                    if (this.field1073 != null && this.field1073[this.field1085[var9]] != null) {
                        var15 = this.field1073[this.field1085[var9]];
                    } else {
                        var15 = this.field1072[this.field1085[var9]];
                    }
                    int var16 = (var15.field343 * arg4 + var15.field337 * arg3 + var15.field335 * arg2) / (var15.field333 * var7) + arg0;
                    var8.field2449[var9] = method313(var16);
                }
            } else if (var10 != 0) {
                if (var10 == 1) {
                    class105 var26 = this.field1077[var9];
                    int var27 = (var26.field2589 * arg4 + var26.field2592 * arg2 + var26.field2591 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field2457[var9] = method318(this.field1079[var9] & 65535, var27);
                    var8.field2449[var9] = -1;
                } else {
                    var8.field2449[var9] = -2;
                }
            } else {
                int var19 = this.field1079[var9] & 65535;
                class12 var20;
                if (this.field1073 != null && this.field1073[this.field1092[var9]] != null) {
                    var20 = this.field1073[this.field1092[var9]];
                } else {
                    var20 = this.field1072[this.field1092[var9]];
                }
                int var21 = (var20.field343 * arg4 + var20.field337 * arg3 + var20.field335 * arg2) / (var20.field333 * var7) + arg0;
                var8.field2457[var9] = method318(var19, var21);
                class12 var22;
                if (this.field1073 != null && this.field1073[this.field1081[var9]] != null) {
                    var22 = this.field1073[this.field1081[var9]];
                } else {
                    var22 = this.field1072[this.field1081[var9]];
                }
                int var23 = (var22.field343 * arg4 + var22.field337 * arg3 + var22.field335 * arg2) / (var22.field333 * var7) + arg0;
                var8.field2465[var9] = method318(var19, var23);
                class12 var24;
                if (this.field1073 != null && this.field1073[this.field1085[var9]] != null) {
                    var24 = this.field1073[this.field1085[var9]];
                } else {
                    var24 = this.field1072[this.field1085[var9]];
                }
                int var25 = (var24.field343 * arg4 + var24.field337 * arg3 + var24.field335 * arg2) / (var24.field333 * var7) + arg0;
                var8.field2449[var9] = method318(var19, var25);
            }
        }
        this.method319();
        var8.field2478 = this.field1088;
        var8.field2494 = this.field1087;
        var8.field2451 = this.field1075;
        var8.field2450 = this.field1070;
        var8.field2464 = this.field1064;
        var8.field2460 = this.field1092;
        var8.field2452 = this.field1081;
        var8.field2459 = this.field1085;
        var8.field2471 = this.field1056;
        var8.field2458 = this.field1059;
        var8.field2447 = this.field1058;
        if (var8.field2447 != null) {
            var8.field2485 = this.field1079;
        } else {
            var8.field2485 = null;
        }
        var8.field2501 = this.field1080;
        var8.field2468 = this.field1078;
        var8.field2497 = this.field1082;
        var8.field2461 = this.field1089;
        var8.field2462 = this.field1057;
        var8.field2455 = this.field1062;
        var8.field2477 = this.field1060;
        return var8;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)I")
    private static final int method318(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "()V")
    private final void method319() {
        int var10002;
        if (this.field1084 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1088; ++var3) {
                int var7 = this.field1084[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1062 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field1062[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1088) {
                int var6 = this.field1084[var5];
                this.field1062[var6][var1[var6]++] = var5++;
            }
            this.field1084 = null;
        }
        if (this.field1091 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field1064; ++var10) {
                int var14 = this.field1091[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field1060 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field1060[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field1064) {
                int var13 = this.field1091[var12];
                this.field1060[var13][var8[var13]++] = var12++;
            }
            this.field1091 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "()V")
    public final void method320() {
        if (this.field1072 == null) {
            this.field1072 = new class12[this.field1088];
            for (int var1 = 0; var1 < this.field1088; ++var1) {
                this.field1072[var1] = new class12();
            }
            for (int var2 = 0; var2 < this.field1064; ++var2) {
                int var3 = this.field1092[var2];
                int var4 = this.field1081[var2];
                int var5 = this.field1085[var2];
                int var6 = this.field1087[var4] - this.field1087[var3];
                int var7 = this.field1075[var4] - this.field1075[var3];
                int var8 = this.field1070[var4] - this.field1070[var3];
                int var9 = this.field1087[var5] - this.field1087[var3];
                int var10 = this.field1075[var5] - this.field1075[var3];
                int var11 = this.field1070[var5] - this.field1070[var3];
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
                if (this.field1069 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field1069[var2];
                }
                if (var19 == 0) {
                    class12 var20 = this.field1072[var3];
                    var20.field335 += var16;
                    var20.field337 += var17;
                    var20.field343 += var18;
                    ++var20.field333;
                    class12 var21 = this.field1072[var4];
                    var21.field335 += var16;
                    var21.field337 += var17;
                    var21.field343 += var18;
                    ++var21.field333;
                    class12 var22 = this.field1072[var5];
                    var22.field335 += var16;
                    var22.field337 += var17;
                    var22.field343 += var18;
                    ++var22.field333;
                } else if (var19 == 1) {
                    if (this.field1077 == null) {
                        this.field1077 = new class105[this.field1064];
                    }
                    class105 var23 = this.field1077[var2] = new class105();
                    var23.field2592 = var16;
                    var23.field2591 = var17;
                    var23.field2589 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lfe;Lfe;IIIZ)V")
    public static final void method321(class41 arg0, class41 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method309();
        arg0.method320();
        arg1.method309();
        arg1.method320();
        ++field1083;
        int var6 = 0;
        int[] var7 = arg1.field1087;
        int var8 = arg1.field1088;
        for (int var9 = 0; var9 < arg0.field1088; ++var9) {
            class12 var12 = arg0.field1072[var9];
            if (var12.field333 != 0) {
                int var13 = arg0.field1075[var9] - arg3;
                if (var13 <= arg1.field1063) {
                    int var14 = arg0.field1087[var9] - arg2;
                    if (var14 >= arg1.field1067 && var14 <= arg1.field1086) {
                        int var15 = arg0.field1070[var9] - arg4;
                        if (var15 >= arg1.field1066 && var15 <= arg1.field1090) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class12 var17 = arg1.field1072[var16];
                                if (var7[var16] == var14 && arg1.field1070[var16] == var15 && arg1.field1075[var16] == var13 && var17.field333 != 0) {
                                    if (arg0.field1073 == null) {
                                        arg0.field1073 = new class12[arg0.field1088];
                                    }
                                    if (arg1.field1073 == null) {
                                        arg1.field1073 = new class12[var8];
                                    }
                                    class12 var18 = arg0.field1073[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field1073[var9] = new class12(var12);
                                    }
                                    class12 var19 = arg1.field1073[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field1073[var16] = new class12(var17);
                                    }
                                    var18.field335 += var17.field335;
                                    var18.field337 += var17.field337;
                                    var18.field343 += var17.field343;
                                    var18.field333 += var17.field333;
                                    var19.field335 += var12.field335;
                                    var19.field337 += var12.field337;
                                    var19.field343 += var12.field343;
                                    var19.field333 += var12.field333;
                                    ++var6;
                                    field1076[var9] = field1083;
                                    field1065[var16] = field1083;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field1064; ++var10) {
                if (field1076[arg0.field1092[var10]] == field1083 && field1076[arg0.field1081[var10]] == field1083 && field1076[arg0.field1085[var10]] == field1083) {
                    if (arg0.field1069 == null) {
                        arg0.field1069 = new byte[arg0.field1064];
                    }
                    arg0.field1069[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field1064; ++var11) {
                if (field1065[arg1.field1092[var11]] == field1083 && field1065[arg1.field1081[var11]] == field1083 && field1065[arg1.field1085[var11]] == field1083) {
                    if (arg1.field1069 == null) {
                        arg1.field1069 = new byte[arg1.field1064];
                    }
                    arg1.field1069[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(SS)V")
    public final void method322(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1064; ++var3) {
            if (this.field1079[var3] == arg0) {
                this.field1079[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    private class41() {
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([B)V")
    private class41(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class83 var4 = new class83(arg0);
        class83 var5 = new class83(arg0);
        class83 var6 = new class83(arg0);
        class83 var7 = new class83(arg0);
        class83 var8 = new class83(arg0);
        var4.field2076 = arg0.length - 18;
        int var9 = var4.method631((byte) -125);
        int var10 = var4.method631((byte) -113);
        int var11 = var4.method638(0);
        int var12 = var4.method638(0);
        int var13 = var4.method638(0);
        int var14 = var4.method638(0);
        int var15 = var4.method638(0);
        int var16 = var4.method638(0);
        int var17 = var4.method631((byte) -126);
        int var18 = var4.method631((byte) -125);
        int var19 = var4.method631((byte) -116);
        int var20 = var4.method631((byte) -107);
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
        this.field1088 = var9;
        this.field1064 = var10;
        this.field1078 = var11;
        this.field1087 = new int[var9];
        this.field1075 = new int[var9];
        this.field1070 = new int[var9];
        this.field1092 = new int[var10];
        this.field1081 = new int[var10];
        this.field1085 = new int[var10];
        if (var11 > 0) {
            this.field1082 = new int[var11];
            this.field1089 = new int[var11];
            this.field1057 = new int[var11];
        }
        if (var16 == 1) {
            this.field1084 = new int[var9];
        }
        if (var12 == 1) {
            this.field1069 = new byte[var10];
            this.field1058 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1056 = new byte[var10];
        } else {
            this.field1080 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1059 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1091 = new int[var10];
        }
        this.field1079 = new short[var10];
        var4.field2076 = var21;
        var5.field2076 = var36;
        var6.field2076 = var38;
        var7.field2076 = var40;
        var8.field2076 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var59 = var4.method638(0);
            int var60 = 0;
            if ((var59 & 1) != 0) {
                var60 = var5.method682(-58);
            }
            int var61 = 0;
            if ((var59 & 2) != 0) {
                var61 = var6.method682(-126);
            }
            int var62 = 0;
            if ((var59 & 4) != 0) {
                var62 = var7.method682(-121);
            }
            this.field1087[var46] = var43 + var60;
            this.field1075[var46] = var44 + var61;
            this.field1070[var46] = var45 + var62;
            var43 = this.field1087[var46];
            var44 = this.field1075[var46];
            var45 = this.field1070[var46];
            if (var16 == 1) {
                this.field1084[var46] = var8.method638(0);
            }
        }
        var4.field2076 = var32;
        var5.field2076 = var28;
        var6.field2076 = var26;
        var7.field2076 = var30;
        var8.field2076 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field1079[var47] = (short) var4.method631((byte) -105);
            if (var12 == 1) {
                int var58 = var5.method638(0);
                if ((var58 & 1) == 1) {
                    this.field1069[var47] = 1;
                    var3 = true;
                } else {
                    this.field1069[var47] = 0;
                }
                if ((var58 & 2) == 2) {
                    this.field1058[var47] = (byte) (var58 >> 2);
                    var2 = true;
                } else {
                    this.field1058[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1056[var47] = var6.method651(56);
            }
            if (var14 == 1) {
                this.field1059[var47] = var7.method651(89);
            }
            if (var15 == 1) {
                this.field1091[var47] = var8.method638(0);
            }
        }
        var4.field2076 = var25;
        var5.field2076 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var54 = var5.method638(0);
            if (var54 == 1) {
                var48 = var4.method682(-125) + var51;
                var49 = var4.method682(-74) + var48;
                var50 = var4.method682(-116) + var49;
                var51 = var50;
                this.field1092[var52] = var48;
                this.field1081[var52] = var49;
                this.field1085[var52] = var50;
            }
            if (var54 == 2) {
                var49 = var50;
                var50 = var4.method682(-115) + var51;
                var51 = var50;
                this.field1092[var52] = var48;
                this.field1081[var52] = var49;
                this.field1085[var52] = var50;
            }
            if (var54 == 3) {
                var48 = var50;
                var50 = var4.method682(-77) + var51;
                var51 = var50;
                this.field1092[var52] = var48;
                this.field1081[var52] = var49;
                this.field1085[var52] = var50;
            }
            if (var54 == 4) {
                int var57 = var48;
                var48 = var49;
                var49 = var57;
                var50 = var4.method682(-98) + var51;
                var51 = var50;
                this.field1092[var52] = var48;
                this.field1081[var52] = var57;
                this.field1085[var52] = var50;
            }
        }
        var4.field2076 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field1082[var53] = var4.method631((byte) -109);
            this.field1089[var53] = var4.method631((byte) -112);
            this.field1057[var53] = var4.method631((byte) -122);
        }
        if (!var2) {
            this.field1058 = null;
        }
        if (!var3) {
            this.field1069 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([Lfe;I)V")
    public class41(class41[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        this.field1088 = 0;
        this.field1064 = 0;
        this.field1078 = 0;
        this.field1080 = -1;
        for (int var8 = 0; var8 < arg1; ++var8) {
            class41 var14 = arg0[var8];
            if (var14 != null) {
                this.field1088 += var14.field1088;
                this.field1064 += var14.field1064;
                this.field1078 += var14.field1078;
                if (var14.field1056 != null) {
                    var4 = true;
                } else {
                    if (this.field1080 == -1) {
                        this.field1080 = var14.field1080;
                    }
                    if (this.field1080 != var14.field1080) {
                        var4 = true;
                    }
                }
                var3 |= var14.field1069 != null;
                var5 |= var14.field1059 != null;
                var6 |= var14.field1091 != null;
                var7 |= var14.field1058 != null;
            }
        }
        this.field1087 = new int[this.field1088];
        this.field1075 = new int[this.field1088];
        this.field1070 = new int[this.field1088];
        this.field1084 = new int[this.field1088];
        this.field1092 = new int[this.field1064];
        this.field1081 = new int[this.field1064];
        this.field1085 = new int[this.field1064];
        if (this.field1078 > 0) {
            this.field1082 = new int[this.field1078];
            this.field1089 = new int[this.field1078];
            this.field1057 = new int[this.field1078];
        }
        if (var3) {
            this.field1069 = new byte[this.field1064];
        }
        if (var4) {
            this.field1056 = new byte[this.field1064];
        }
        if (var5) {
            this.field1059 = new byte[this.field1064];
        }
        if (var7) {
            this.field1058 = new byte[this.field1064];
        }
        if (var6) {
            this.field1091 = new int[this.field1064];
        }
        this.field1079 = new short[this.field1064];
        this.field1088 = 0;
        this.field1064 = 0;
        this.field1078 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class41 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1064; ++var12) {
                    if (var3 && var11.field1069 != null) {
                        this.field1069[this.field1064] = var11.field1069[var12];
                    }
                    if (var4) {
                        if (var11.field1056 != null) {
                            this.field1056[this.field1064] = var11.field1056[var12];
                        } else {
                            this.field1056[this.field1064] = var11.field1080;
                        }
                    }
                    if (var5 && var11.field1059 != null) {
                        this.field1059[this.field1064] = var11.field1059[var12];
                    }
                    if (var7) {
                        if (var11.field1058 != null && var11.field1058[var12] != -1) {
                            this.field1058[this.field1064] = (byte) (var11.field1058[var12] + var9);
                        } else {
                            this.field1058[this.field1064] = -1;
                        }
                    }
                    if (var6 && var11.field1091 != null) {
                        this.field1091[this.field1064] = var11.field1091[var12];
                    }
                    this.field1079[this.field1064] = var11.field1079[var12];
                    this.field1092[this.field1064] = this.method304(var11, var11.field1092[var12]);
                    this.field1081[this.field1064] = this.method304(var11, var11.field1081[var12]);
                    this.field1085[this.field1064] = this.method304(var11, var11.field1085[var12]);
                    ++this.field1064;
                }
                for (int var13 = 0; var13 < var11.field1078; ++var13) {
                    this.field1082[this.field1078] = this.method304(var11, var11.field1082[var13]);
                    this.field1089[this.field1078] = this.method304(var11, var11.field1089[var13]);
                    this.field1057[this.field1078] = this.method304(var11, var11.field1057[var13]);
                    ++this.field1078;
                }
                var9 += var11.field1078;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lfe;ZZZ)V")
    public class41(class41 arg0, boolean arg1, boolean arg2, boolean arg3) {
        this.field1088 = arg0.field1088;
        this.field1064 = arg0.field1064;
        this.field1078 = arg0.field1078;
        if (arg1) {
            this.field1087 = arg0.field1087;
            this.field1075 = arg0.field1075;
            this.field1070 = arg0.field1070;
        } else {
            this.field1087 = new int[this.field1088];
            this.field1075 = new int[this.field1088];
            this.field1070 = new int[this.field1088];
            for (int var5 = 0; var5 < this.field1088; ++var5) {
                this.field1087[var5] = arg0.field1087[var5];
                this.field1075[var5] = arg0.field1075[var5];
                this.field1070[var5] = arg0.field1070[var5];
            }
        }
        if (arg2) {
            this.field1079 = arg0.field1079;
        } else {
            this.field1079 = new short[this.field1064];
            for (int var6 = 0; var6 < this.field1064; ++var6) {
                this.field1079[var6] = arg0.field1079[var6];
            }
        }
        if (arg3) {
            this.field1059 = arg0.field1059;
        } else {
            this.field1059 = new byte[this.field1064];
            if (arg0.field1059 == null) {
                for (int var7 = 0; var7 < this.field1064; ++var7) {
                    this.field1059[var7] = 0;
                }
            } else {
                for (int var8 = 0; var8 < this.field1064; ++var8) {
                    this.field1059[var8] = arg0.field1059[var8];
                }
            }
        }
        this.field1092 = arg0.field1092;
        this.field1081 = arg0.field1081;
        this.field1085 = arg0.field1085;
        this.field1069 = arg0.field1069;
        this.field1056 = arg0.field1056;
        this.field1058 = arg0.field1058;
        this.field1080 = arg0.field1080;
        this.field1082 = arg0.field1082;
        this.field1089 = arg0.field1089;
        this.field1057 = arg0.field1057;
        this.field1084 = arg0.field1084;
        this.field1091 = arg0.field1091;
        this.field1062 = arg0.field1062;
        this.field1060 = arg0.field1060;
        this.field1072 = arg0.field1072;
        this.field1077 = arg0.field1077;
        this.field1073 = arg0.field1073;
        this.field1074 = arg0.field1074;
        this.field1071 = arg0.field1071;
    }

    static {
        int var0 = 0;
        int var1 = 248;
        while (var0 < 9) {
            field1061[var0++] = 255;
        }
        while (var0 < 16) {
            field1061[var0++] = var1;
            var1 -= 8;
        }
        while (var0 < 32) {
            field1061[var0++] = var1;
            var1 -= 4;
        }
        while (var0 < 64) {
            field1061[var0++] = var1;
            var1 -= 2;
        }
        while (var0 < 128) {
            field1061[var0++] = var1--;
        }
    }
}
