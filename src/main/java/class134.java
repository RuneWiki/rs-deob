import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class134 extends class46 {

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public int field3143 = -1;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "Z")
    public boolean field3156 = false;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
    public int field3159 = 2;

    @OriginalMember(owner = "client!tb", name = "rb", descriptor = "I")
    public int field3161 = 5;

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
    public int field3148 = -1;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
    public int field3158 = -1;

    @OriginalMember(owner = "client!tb", name = "Cb", descriptor = "I")
    public int field3172 = 99;

    @OriginalMember(owner = "client!tb", name = "yb", descriptor = "I")
    public int field3168 = -1;

    @OriginalMember(owner = "client!tb", name = "Fb", descriptor = "I")
    public int field3175 = -1;

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "Lsc;")
    public static class128 field3153 = class129.method1017(false, ")3runescape)3com");

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
    public static int field3151 = 0;

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "Lsc;")
    public static class128 field3160 = class129.method1017(false, " <col=00ff80>");

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public static int field3154 = 0;

    @OriginalMember(owner = "client!tb", name = "Ab", descriptor = "Lsc;")
    private static class128 field3170 = class129.method1017(false, "Please reload this page)3");

    @OriginalMember(owner = "client!tb", name = "Bb", descriptor = "I")
    public static int field3171 = 1;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lsc;")
    public static class128 field3144 = field3170;

    @OriginalMember(owner = "client!tb", name = "vb", descriptor = "Lsc;")
    public static class128 field3165 = class129.method1017(false, "");

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "Lsc;")
    public static class128 field3157 = class129.method1017(false, "p12_full");

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!tb", name = "ub", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!tb", name = "wb", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!tb", name = "xb", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!tb", name = "zb", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!tb", name = "Db", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "Lsf;")
    public static class131 field3147;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "[I")
    public int[] field3142;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "[I")
    private int[] field3145;

    @OriginalMember(owner = "client!tb", name = "sb", descriptor = "[I")
    public int[] field3162;

    @OriginalMember(owner = "client!tb", name = "tb", descriptor = "[I")
    private int[] field3163;

    @OriginalMember(owner = "client!tb", name = "Eb", descriptor = "[I")
    public int[] field3174;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILtb;ZLlb;I)Llb;")
    public final class78 method1080(int arg0, class134 arg1, boolean arg2, class78 arg3, int arg4) {
        field3149++;
        int var6 = this.field3142[arg4];
        class108 var7 = class11.method88(127, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method1083(arg3, 88, arg0);
        }
        int var9 = arg1.field3142[arg0];
        class108 var10 = class11.method88(127, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class78 var12 = arg3.method571(!var7.method838(arg2, var8));
            var12.method585(var7, var8);
            return var12;
        } else {
            class78 var13 = arg3.method571(!var7.method838(false, var8) & !var10.method838(arg2, var11));
            var13.method581(var7, var8, var10, var11, this.field3145);
            return var13;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILmc;)V")
    public final void method1081(int arg0, class86 arg1) {
        while (true) {
            int var3 = arg1.method646(arg0 - 13178);
            if (var3 == 0) {
                if (arg0 != -2269) {
                    return;
                }
                field3155++;
                return;
            }
            this.method1087(var3, arg1, -4);
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)I")
    public static final int method1082(byte arg0) {
        if (arg0 != 102) {
            field3170 = null;
        }
        field3141++;
        return 6;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Llb;II)Llb;")
    public final class78 method1083(class78 arg0, int arg1, int arg2) {
        int var4 = this.field3142[arg2];
        field3167++;
        class108 var5 = class11.method88(127, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method571(true);
        }
        class78 var7 = arg0.method571(!var5.method838(false, var6));
        var7.method585(var5, var6);
        if (arg1 <= 51) {
            this.field3172 = 13;
        }
        return var7;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
    public static final void method1084(int arg0, int arg1, int arg2, int arg3) {
        field3146++;
        if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
            class127.field2884 = -1;
            class18.field316 = -1;
            return;
        }
        int var4 = class97.method755(arg2, class29.field553, arg0, 256) - arg1;
        int var5 = var4 - class65.field1430;
        int var6 = arg2 - class1.field2;
        int var7 = class114.field2564[class156.field3589];
        int var8 = class114.field2564[class1.field10];
        int var9 = arg0 - class147.field3410;
        int var10 = class114.field2557[class156.field3589];
        int var11 = class114.field2557[class1.field10];
        int var12 = 22 % ((-arg3 - 21) / 49);
        int var13 = var6 * var8 + var9 * var11 >> 16;
        int var14 = var6 * var11 - var8 * var9 >> 16;
        int var16 = var5 * var10 - var7 * var14 >> 16;
        int var17 = var5 * var7 + var10 * var14 >> 16;
        if (var17 < 50) {
            class127.field2884 = -1;
            class18.field316 = -1;
        } else {
            class18.field316 = (var13 << 9) / var17 + 256;
            class127.field2884 = (var16 << 9) / var17 + 167;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Llb;BI)Llb;")
    public final class78 method1085(class78 arg0, byte arg1, int arg2) {
        int var4 = this.field3142[arg2];
        field3169++;
        if (arg1 < 4) {
            return null;
        }
        class108 var5 = class11.method88(127, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method579(true);
        } else {
            class78 var7 = arg0.method579(!var5.method838(false, var6));
            var7.method585(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Llb;III)Llb;")
    public final class78 method1086(class78 arg0, int arg1, int arg2, int arg3) {
        field3150++;
        int var5 = this.field3142[arg1];
        class108 var6 = class11.method88(127, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method571(true);
        }
        int var8 = arg3 & 0x3;
        class78 var9 = arg0.method571(!var6.method838(false, var7));
        if (var8 == 1) {
            var9.method573();
        } else if (var8 == 2) {
            var9.method578();
        } else if (var8 == 3) {
            var9.method586();
        }
        var9.method585(var6, var7);
        if (arg2 != -25066) {
            this.field3143 = 17;
        }
        if (var8 == 1) {
            var9.method586();
        } else if (var8 == 2) {
            var9.method578();
        } else if (var8 == 3) {
            var9.method573();
        }
        return var9;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILmc;I)V")
    private final void method1087(int arg0, class86 arg1, int arg2) {
        field3164++;
        if (arg2 != -4) {
            method1084(-22, -112, -98, -96);
        }
        if (arg0 == 1) {
            int var4 = arg1.method632((byte) -80);
            this.field3162 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3162[var5] = arg1.method632((byte) -80);
            }
            this.field3142 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3142[var6] = arg1.method632((byte) -80);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3142[var7] += arg1.method632((byte) -80) << 16;
            }
        } else if (arg0 == 2) {
            this.field3158 = arg1.method632((byte) -80);
        } else if (arg0 == 3) {
            int var8 = arg1.method646(arg2 - 15443);
            this.field3145 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3145[var9] = arg1.method646(-15447);
            }
            this.field3145[var8] = 9999999;
        } else if (arg0 == 4) {
            this.field3156 = true;
        } else if (arg0 == 5) {
            this.field3161 = arg1.method646(-15447);
        } else if (arg0 == 6) {
            this.field3143 = arg1.method632((byte) -80);
        } else if (arg0 == 7) {
            this.field3168 = arg1.method632((byte) -80);
        } else if (arg0 == 8) {
            this.field3172 = arg1.method646(arg2 ^ 0x3C55);
        } else if (arg0 == 9) {
            this.field3148 = arg1.method646(-15447);
        } else if (arg0 == 10) {
            this.field3175 = arg1.method646(-15447);
        } else if (arg0 == 11) {
            this.field3159 = arg1.method646(-15447);
        } else if (arg0 == 12) {
            int var10 = arg1.method646(arg2 ^ 0x3C55);
            this.field3163 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3163[var11] = arg1.method632((byte) -80);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3163[var12] = (arg1.method632((byte) -80) << 16) + this.field3163[var12];
            }
            return;
        } else if (arg0 == 13) {
            int var13 = arg1.method646(-15447);
            this.field3174 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3174[var14] = arg1.method671(-104);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method1088(boolean arg0) {
        field3170 = null;
        field3144 = null;
        field3153 = null;
        if (!arg0) {
            field3165 = null;
            field3157 = null;
            field3160 = null;
            field3147 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1089(int arg0, boolean arg1) {
        field3140++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class121.field2760[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1004) {
            return true;
        } else {
            if (arg1) {
                field3157 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILlb;)Llb;")
    public final class78 method1090(byte arg0, int arg1, class78 arg2) {
        int var4 = this.field3142[arg1];
        field3166++;
        class108 var5 = class11.method88(127, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method571(true);
        }
        class108 var7 = null;
        int var8 = 0;
        if (this.field3163 != null && arg1 < this.field3163.length) {
            int var9 = this.field3163[arg1];
            var7 = class11.method88(127, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class78 var11 = arg2.method571(!var5.method838(false, var6));
            var11.method585(var5, var6);
            return var11;
        }
        if (arg0 != -89) {
            this.method1091(-111);
        }
        class78 var10 = arg2.method571(!var5.method838(false, var6) & !var7.method838(false, var8));
        var10.method585(var5, var6);
        var10.method585(var7, var8);
        return var10;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public final void method1091(int arg0) {
        if (this.field3148 == -1) {
            if (this.field3145 == null) {
                this.field3148 = 0;
            } else {
                this.field3148 = 2;
            }
        }
        if (arg0 != -2) {
            return;
        }
        if (this.field3175 == -1) {
            if (this.field3145 == null) {
                this.field3175 = 0;
            } else {
                this.field3175 = 2;
            }
        }
        field3173++;
    }
}
