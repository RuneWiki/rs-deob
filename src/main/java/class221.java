import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class221 {

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "[I")
    public static int[] field3265 = new int[5];

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field3259 = 0;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field3276 = 0;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field3269 = 0;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3281 = "wishes to trade with you.";

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field3277 = 0;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3280 = " has logged out.";

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Lhg;")
    public class150 field3257;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "Lij;")
    public static class69 field3278;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "[I")
    public int[] field3258;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "[I")
    public int[] field3264;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "[I")
    public int[] field3267;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "[I")
    public int[] field3268;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "[I")
    public int[] field3270;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "[I")
    public int[] field3275;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "[Lhg;")
    public class150[] field3261;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "[[I")
    public int[][] field3271;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "[[I")
    public int[][] field3279;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Lfl;")
    public static final class197 method1419(int arg0, int arg1) {
        field3256++;
        class197 var2 = (class197) class166.field2407.method263((byte) 121, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class7.field153.method1538(4, arg1, (byte) 58);
        class197 var4 = new class197();
        int var5 = -21 % ((-arg0 - 24) / 59);
        if (var3 != null) {
            var4.method1262(arg1, new class114(var3), -1);
        }
        class166.field2407.method255((long) arg1, var4, (byte) -124);
        return var4;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
    public static final void method1420(int arg0, boolean arg1) {
        field3260++;
        class270 var2 = class190.method1213(25702, arg0, 10);
        var2.method1806(-8173);
        if (arg1) {
            field3277 = 115;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Llc;Lve;ILve;)V")
    public static final void method1421(class143 arg0, class233 arg1, int arg2, class233 arg3) {
        class193.field2775 = arg0;
        class141.field2049 = arg1;
        field3282++;
        if (arg2 != -1) {
            return;
        }
        class131.field1904 = arg3;
        if (class131.field1904 != null) {
            class248.field3723 = class131.field1904.method1525(11672, 1);
        }
        if (class141.field2049 != null) {
            class217.field3197 = class141.field2049.method1525(arg2 ^ 0xFFFFD267, 1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z[B)V")
    private final void method1422(boolean arg0, byte[] arg1) {
        if (!arg0) {
            this.method1422(true, (byte[]) null);
        }
        field3266++;
        class114 var3 = new class114(class28.method210((byte) 68, arg1));
        int var4 = var3.method760(false);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3283 = 0;
        } else {
            this.field3283 = var3.method759((byte) 113);
        }
        int var5 = var3.method760(false);
        int var6 = -1;
        this.field3273 = var3.method756(-29901);
        int var7 = 0;
        this.field3264 = new int[this.field3273];
        for (int var8 = 0; var8 < this.field3273; var8++) {
            this.field3264[var8] = var7 += var3.method756(-29901);
            if (var6 < this.field3264[var8]) {
                var6 = this.field3264[var8];
            }
        }
        this.field3262 = var6 + 1;
        this.field3275 = new int[this.field3262];
        this.field3258 = new int[this.field3262];
        this.field3279 = new int[this.field3262][];
        this.field3270 = new int[this.field3262];
        this.field3267 = new int[this.field3262];
        if (var5 != 0) {
            this.field3268 = new int[this.field3262];
            for (int var9 = 0; var9 < this.field3262; var9++) {
                this.field3268[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3273; var10++) {
                this.field3268[this.field3264[var10]] = var3.method759((byte) 100);
            }
            this.field3257 = new class150(this.field3268);
        }
        for (int var11 = 0; var11 < this.field3273; var11++) {
            this.field3275[this.field3264[var11]] = var3.method759((byte) 113);
        }
        for (int var12 = 0; var12 < this.field3273; var12++) {
            this.field3258[this.field3264[var12]] = var3.method759((byte) 123);
        }
        for (int var13 = 0; var13 < this.field3273; var13++) {
            this.field3267[this.field3264[var13]] = var3.method756(-29901);
        }
        for (int var14 = 0; var14 < this.field3273; var14++) {
            int var21 = 0;
            int var22 = this.field3264[var14];
            int var23 = this.field3267[var22];
            int var24 = -1;
            this.field3279[var22] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field3279[var22][var25] = var21 += var3.method756(-29901);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field3270[var22] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field3279[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3261 = new class150[var6 + 1];
        this.field3271 = new int[var6 + 1][];
        for (int var15 = 0; var15 < this.field3273; var15++) {
            int var16 = this.field3264[var15];
            int var17 = this.field3267[var16];
            this.field3271[var16] = new int[this.field3270[var16]];
            for (int var18 = 0; var18 < this.field3270[var16]; var18++) {
                this.field3271[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3279[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3279[var16][var19];
                }
                this.field3271[var16][var20] = var3.method759((byte) 123);
            }
            this.field3261[var16] = new class150(this.field3271[var16]);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method1423(int arg0) {
        field3265 = null;
        field3280 = null;
        field3281 = null;
        if (arg0 == 10) {
            field3278 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3272++;
        int var7 = 42 / ((8 - arg0) / 46);
        if (arg2 - arg4 >= class93.field1412 && (arg2 + arg4) <= class142.field2061 && class93.field1418 <= arg1 - arg4 && (arg1 + arg4) <= class254.field3857) {
            class98.method659(arg6, arg2, arg3, 1443327457, arg5, arg1, arg4);
        } else {
            class269.method1800(arg1, arg2, arg6, (byte) 67, arg5, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
    public static final int method1425(int arg0) {
        field3263++;
        if (arg0 != 2) {
            return -2;
        } else if (class163.field2380) {
            return 0;
        } else if (class202.method1310(false)) {
            return class1.field17 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "([BI)V")
    public class221(byte[] arg0, int arg1) {
        this.field3274 = class185.method1198(arg0, 24426, arg0.length);
        if (this.field3274 != arg1) {
            throw new RuntimeException();
        }
        this.method1422(true, arg0);
    }
}
