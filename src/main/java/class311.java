import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class311 extends class196 {

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public int field5221 = 0;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "Z")
    private boolean field5249 = false;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "B")
    public byte field5241 = 0;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "I")
    public int field5232 = 0;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "[I")
    public int[] field5233;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "[I")
    public int[] field5213;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "[I")
    public int[] field5250;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "[I")
    public int[] field5229;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "[I")
    public int[] field5254;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "[I")
    public int[] field5217;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "[I")
    public int[] field5239;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "[B")
    public byte[] field5240;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "[B")
    public byte[] field5248;

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "[B")
    public byte[] field5256;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "[S")
    public short[] field5211;

    @OriginalMember(owner = "client!al", name = "bb", descriptor = "[S")
    public short[] field5257;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "[B")
    public byte[] field5237;

    @OriginalMember(owner = "client!al", name = "cb", descriptor = "[I")
    public int[] field5258;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "[B")
    public byte[] field5255;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "[S")
    public short[] field5235;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "[S")
    public short[] field5236;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "[S")
    public short[] field5220;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "[S")
    public short[] field5251;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "[S")
    public short[] field5227;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "[S")
    public short[] field5214;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "[B")
    public byte[] field5212;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "[B")
    public byte[] field5245;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "[B")
    public byte[] field5253;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "[B")
    public byte[] field5234;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "[B")
    public byte[] field5244;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public int field5222;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "[[I")
    public int[][] field5247;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "[[I")
    public int[][] field5238;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "[Lvf;")
    public class298[] field5246;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "[Lie;")
    public class81[] field5223;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "[Lvf;")
    public class298[] field5219;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "S")
    public short field5226;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "S")
    public short field5224;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "[I")
    private static int[] field5228 = new int[10000];

    @OriginalMember(owner = "client!al", name = "v", descriptor = "[I")
    private static int[] field5225 = class203.field3216;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "[I")
    private static int[] field5230 = new int[10000];

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    private static int field5218 = 0;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "[I")
    private static int[] field5231 = class203.field3208;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "S")
    private short field5215;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "S")
    private short field5216;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "S")
    private short field5242;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "S")
    private short field5243;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "S")
    private short field5252;

    @OriginalMember(owner = "client!al", name = "db", descriptor = "S")
    private short field5259;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIBSB)I", line = 5)
    public final int method2123(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field5254[this.field5221] = arg0;
        this.field5217[this.field5221] = arg1;
        this.field5239[this.field5221] = arg2;
        this.field5240[this.field5221] = arg3;
        this.field5237[this.field5221] = -1;
        this.field5211[this.field5221] = arg4;
        this.field5257[this.field5221] = -1;
        this.field5256[this.field5221] = arg5;
        return this.field5221++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lbg;IIIZ)V", line = 18)
    public final void method1159(class196 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class311 var6 = (class311) arg0;
        var6.method2136();
        var6.method2137();
        field5218++;
        int var7 = 0;
        int[] var8 = var6.field5233;
        int var9 = var6.field5232;
        for (int var10 = 0; var10 < this.field5232; var10++) {
            class298 var11 = this.field5246[var10];
            if (var11.field4983 != 0) {
                int var12 = this.field5213[var10] - arg2;
                if (var12 >= var6.field5252 && var12 <= var6.field5215) {
                    int var13 = this.field5233[var10] - arg1;
                    if (var13 >= var6.field5216 && var13 <= var6.field5243) {
                        int var14 = this.field5250[var10] - arg3;
                        if (var14 >= var6.field5259 && var14 <= var6.field5242) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class298 var16 = var6.field5246[var15];
                                if (var8[var15] == var13 && var6.field5250[var15] == var14 && var6.field5213[var15] == var12 && var16.field4983 != 0) {
                                    if (this.field5219 == null) {
                                        this.field5219 = new class298[this.field5232];
                                    }
                                    if (var6.field5219 == null) {
                                        var6.field5219 = new class298[var9];
                                    }
                                    class298 var17 = this.field5219[var10];
                                    if (var17 == null) {
                                        var17 = this.field5219[var10] = new class298(var11);
                                    }
                                    class298 var18 = var6.field5219[var15];
                                    if (var18 == null) {
                                        var18 = var6.field5219[var15] = new class298(var16);
                                    }
                                    var17.field4969 += var16.field4969;
                                    var17.field4981 += var16.field4981;
                                    var17.field4972 += var16.field4972;
                                    var17.field4983 += var16.field4983;
                                    var18.field4969 += var11.field4969;
                                    var18.field4981 += var11.field4981;
                                    var18.field4972 += var11.field4972;
                                    var18.field4983 += var11.field4983;
                                    var7++;
                                    field5230[var10] = field5218;
                                    field5228[var15] = field5218;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var19 = 0; var19 < this.field5221; var19++) {
            if (field5230[this.field5254[var19]] == field5218 && field5230[this.field5217[var19]] == field5218 && field5230[this.field5239[var19]] == field5218) {
                if (this.field5240 == null) {
                    this.field5240 = new byte[this.field5221];
                }
                this.field5240[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field5221; var20++) {
            if (field5228[var6.field5254[var20]] == field5218 && field5228[var6.field5217[var20]] == field5218 && field5228[var6.field5239[var20]] == field5218) {
                if (var6.field5240 == null) {
                    var6.field5240 = new byte[var6.field5221];
                }
                var6.field5240[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "()Lal;", line = 136)
    public final class311 method2124() {
        class311 var1 = new class311();
        if (this.field5240 != null) {
            var1.field5240 = new byte[this.field5221];
            for (int var2 = 0; var2 < this.field5221; var2++) {
                var1.field5240[var2] = this.field5240[var2];
            }
        }
        var1.field5232 = this.field5232;
        var1.field5221 = this.field5221;
        var1.field5222 = this.field5222;
        var1.field5233 = this.field5233;
        var1.field5213 = this.field5213;
        var1.field5250 = this.field5250;
        var1.field5254 = this.field5254;
        var1.field5217 = this.field5217;
        var1.field5239 = this.field5239;
        var1.field5248 = this.field5248;
        var1.field5256 = this.field5256;
        var1.field5237 = this.field5237;
        var1.field5211 = this.field5211;
        var1.field5257 = this.field5257;
        var1.field5241 = this.field5241;
        var1.field5255 = this.field5255;
        var1.field5235 = this.field5235;
        var1.field5236 = this.field5236;
        var1.field5220 = this.field5220;
        var1.field5251 = this.field5251;
        var1.field5227 = this.field5227;
        var1.field5214 = this.field5214;
        var1.field5212 = this.field5212;
        var1.field5245 = this.field5245;
        var1.field5253 = this.field5253;
        var1.field5234 = this.field5234;
        var1.field5244 = this.field5244;
        var1.field5229 = this.field5229;
        var1.field5258 = this.field5258;
        var1.field5247 = this.field5247;
        var1.field5238 = this.field5238;
        var1.field5246 = this.field5246;
        var1.field5223 = this.field5223;
        var1.field5226 = this.field5226;
        var1.field5224 = this.field5224;
        return var1;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "()V", line = 190)
    private final void method2125() {
        this.field5246 = null;
        this.field5219 = null;
        this.field5223 = null;
        this.field5249 = false;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([[III)I", line = 204)
    private static final int method2126(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(SS)V", line = 224)
    public final void method2127(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5221; var3++) {
            if (this.field5211[var3] == arg0) {
                this.field5211[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "()V", line = 237)
    public final void method2128() {
        for (int var1 = 0; var1 < this.field5232; var1++) {
            int var2 = this.field5250[var1];
            this.field5250[var1] = this.field5233[var1];
            this.field5233[var1] = -var2;
        }
        this.method2125();
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "()I", line = 250)
    public final int method74() {
        if (!this.field5249) {
            this.method2136();
        }
        return this.field5252;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()Z", line = 257)
    public final boolean method1180() {
        return true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lal;I)I", line = 265)
    private final int method2129(class311 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field5233[arg1];
        int var5 = arg0.field5213[arg1];
        int var6 = arg0.field5250[arg1];
        for (int var7 = 0; var7 < this.field5232; var7++) {
            if (this.field5233[var7] == var4 && this.field5213[var7] == var5 && this.field5250[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field5233[this.field5232] = var4;
            this.field5213[this.field5232] = var5;
            this.field5250[this.field5232] = var6;
            if (arg0.field5229 != null) {
                this.field5229[this.field5232] = arg0.field5229[arg1];
            }
            var3 = this.field5232++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "()V", line = 300)
    public final void method2130() {
        int var10002;
        if (this.field5229 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field5232; var3++) {
                int var4 = this.field5229[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field5247 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field5247[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field5232) {
                int var7 = this.field5229[var6];
                this.field5247[var7][var1[var7]++] = var6++;
            }
            this.field5229 = null;
        }
        if (this.field5258 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5221; var10++) {
            int var11 = this.field5258[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field5238 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field5238[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field5221) {
            int var14 = this.field5258[var13];
            this.field5238[var14][var8[var14]++] = var13++;
        }
        this.field5258 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIIIJ)V", line = 392)
    public final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "()V", line = 394)
    public static void method2131() {
        field5230 = null;
        field5228 = null;
        field5231 = null;
        field5225 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II[[I[[IIIIZZ)Lal;", line = 403)
    public final class311 method2132(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method2136();
        int var10 = this.field5216 + arg4;
        int var11 = this.field5243 + arg4;
        int var12 = this.field5259 + arg6;
        int var13 = this.field5242 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class311 var18;
        if (arg7) {
            var18 = new class311();
            var18.field5232 = this.field5232;
            var18.field5221 = this.field5221;
            var18.field5222 = this.field5222;
            var18.field5254 = this.field5254;
            var18.field5217 = this.field5217;
            var18.field5239 = this.field5239;
            var18.field5240 = this.field5240;
            var18.field5248 = this.field5248;
            var18.field5256 = this.field5256;
            var18.field5237 = this.field5237;
            var18.field5211 = this.field5211;
            var18.field5257 = this.field5257;
            var18.field5241 = this.field5241;
            var18.field5255 = this.field5255;
            var18.field5235 = this.field5235;
            var18.field5236 = this.field5236;
            var18.field5220 = this.field5220;
            var18.field5251 = this.field5251;
            var18.field5227 = this.field5227;
            var18.field5214 = this.field5214;
            var18.field5212 = this.field5212;
            var18.field5245 = this.field5245;
            var18.field5253 = this.field5253;
            var18.field5234 = this.field5234;
            var18.field5244 = this.field5244;
            var18.field5229 = this.field5229;
            var18.field5258 = this.field5258;
            var18.field5247 = this.field5247;
            var18.field5238 = this.field5238;
            var18.field5226 = this.field5226;
            var18.field5224 = this.field5224;
            var18.field5246 = this.field5246;
            var18.field5223 = this.field5223;
            var18.field5219 = this.field5219;
            if (arg0 == 3) {
                var18.field5233 = class109.method823(this.field5233, 0);
                var18.field5213 = class109.method823(this.field5213, 0);
                var18.field5250 = class109.method823(this.field5250, 0);
            } else {
                var18.field5233 = this.field5233;
                var18.field5213 = new int[var18.field5232];
                var18.field5250 = this.field5250;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field5232; var19++) {
                int var20 = this.field5233[var19] + arg4;
                int var21 = this.field5250[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field5213[var19] = this.field5213[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field5232; var29++) {
                int var30 = (this.field5213[var29] << 16) / this.field5252;
                if (var30 < arg1) {
                    int var31 = this.field5233[var29] + arg4;
                    int var32 = this.field5250[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field5213[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field5213[var29];
                } else {
                    var18.field5213[var29] = this.field5213[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method2151(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field5215 - this.field5252;
            for (int var43 = 0; var43 < this.field5232; var43++) {
                int var44 = this.field5233[var43] + arg4;
                int var45 = this.field5250[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field5213[var43] = var52 + this.field5213[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field5215 - this.field5252;
            for (int var54 = 0; var54 < this.field5232; var54++) {
                int var55 = this.field5233[var54] + arg4;
                int var56 = this.field5250[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field5213[var54] = ((this.field5213[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method2125();
        } else {
            this.field5249 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([B)V", line = 669)
    private final void method2133(byte[] arg0) {
        class26 var2 = new class26(arg0);
        class26 var3 = new class26(arg0);
        class26 var4 = new class26(arg0);
        class26 var5 = new class26(arg0);
        class26 var6 = new class26(arg0);
        class26 var7 = new class26(arg0);
        class26 var8 = new class26(arg0);
        var2.field478 = arg0.length - 23;
        int var9 = var2.method197(-1);
        int var10 = var2.method197(-1);
        int var11 = var2.method226(255);
        int var12 = var2.method226(255);
        int var13 = var2.method226(255);
        int var14 = var2.method226(255);
        int var15 = var2.method226(255);
        int var16 = var2.method226(255);
        int var17 = var2.method226(255);
        int var18 = var2.method197(-1);
        int var19 = var2.method197(-1);
        int var20 = var2.method197(-1);
        int var21 = var2.method197(-1);
        int var22 = var2.method197(-1);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field5255 = new byte[var11];
            var2.field478 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field5255[var26] = var2.method234(2193);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
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
        this.field5232 = var9;
        this.field5221 = var10;
        this.field5222 = var11;
        this.field5233 = new int[var9];
        this.field5213 = new int[var9];
        this.field5250 = new int[var9];
        this.field5254 = new int[var10];
        this.field5217 = new int[var10];
        this.field5239 = new int[var10];
        if (var17 == 1) {
            this.field5229 = new int[var9];
        }
        if (var12 == 1) {
            this.field5240 = new byte[var10];
        }
        if (var13 == 255) {
            this.field5248 = new byte[var10];
        } else {
            this.field5241 = (byte) var13;
        }
        if (var14 == 1) {
            this.field5256 = new byte[var10];
        }
        if (var15 == 1) {
            this.field5258 = new int[var10];
        }
        if (var16 == 1) {
            this.field5257 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field5237 = new byte[var10];
        }
        this.field5211 = new short[var10];
        if (var11 > 0) {
            this.field5235 = new short[var11];
            this.field5236 = new short[var11];
            this.field5220 = new short[var11];
            if (var24 > 0) {
                this.field5251 = new short[var24];
                this.field5227 = new short[var24];
                this.field5214 = new short[var24];
                this.field5212 = new byte[var24];
                this.field5245 = new byte[var24];
                this.field5253 = new byte[var24];
            }
            if (var25 > 0) {
                this.field5234 = new byte[var25];
                this.field5244 = new byte[var25];
            }
        }
        var2.field478 = var11;
        var3.field478 = var44;
        var4.field478 = var46;
        var5.field478 = var48;
        var6.field478 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var67 = var2.method226(255);
            int var68 = 0;
            if ((var67 & 0x1) != 0) {
                var68 = var3.method192((byte) -104);
            }
            int var69 = 0;
            if ((var67 & 0x2) != 0) {
                var69 = var4.method192((byte) -118);
            }
            int var70 = 0;
            if ((var67 & 0x4) != 0) {
                var70 = var5.method192((byte) -110);
            }
            this.field5233[var66] = var63 + var68;
            this.field5213[var66] = var64 + var69;
            this.field5250[var66] = var65 + var70;
            var63 = this.field5233[var66];
            var64 = this.field5213[var66];
            var65 = this.field5250[var66];
            if (var17 == 1) {
                this.field5229[var66] = var6.method226(255);
            }
        }
        var2.field478 = var42;
        var3.field478 = var31;
        var4.field478 = var34;
        var5.field478 = var37;
        var6.field478 = var35;
        var7.field478 = var40;
        var8.field478 = var39;
        for (int var71 = 0; var71 < var10; var71++) {
            this.field5211[var71] = (short) var2.method197(-1);
            if (var12 == 1) {
                this.field5240[var71] = var3.method234(2193);
            }
            if (var13 == 255) {
                this.field5248[var71] = var4.method234(2193);
            }
            if (var14 == 1) {
                this.field5256[var71] = var5.method234(2193);
            }
            if (var15 == 1) {
                this.field5258[var71] = var6.method226(255);
            }
            if (var16 == 1) {
                this.field5257[var71] = (short) (var7.method197(-1) - 1);
            }
            if (this.field5237 != null) {
                if (this.field5257[var71] == -1) {
                    this.field5237[var71] = -1;
                } else {
                    this.field5237[var71] = (byte) (var8.method226(255) - 1);
                }
            }
        }
        var2.field478 = var33;
        var3.field478 = var30;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        int var75 = 0;
        for (int var76 = 0; var76 < var10; var76++) {
            int var77 = var3.method226(255);
            if (var77 == 1) {
                var72 = var2.method192((byte) -128) + var75;
                var73 = var2.method192((byte) 98) + var72;
                var74 = var2.method192((byte) 97) + var73;
                var75 = var74;
                this.field5254[var76] = var72;
                this.field5217[var76] = var73;
                this.field5239[var76] = var74;
            }
            if (var77 == 2) {
                var73 = var74;
                var74 = var2.method192((byte) 70) + var75;
                var75 = var74;
                this.field5254[var76] = var72;
                this.field5217[var76] = var73;
                this.field5239[var76] = var74;
            }
            if (var77 == 3) {
                var72 = var74;
                var74 = var2.method192((byte) 96) + var75;
                var75 = var74;
                this.field5254[var76] = var72;
                this.field5217[var76] = var73;
                this.field5239[var76] = var74;
            }
            if (var77 == 4) {
                int var80 = var72;
                var72 = var73;
                var73 = var80;
                var74 = var2.method192((byte) 65) + var75;
                var75 = var74;
                this.field5254[var76] = var72;
                this.field5217[var76] = var80;
                this.field5239[var76] = var74;
            }
        }
        var2.field478 = var50;
        var3.field478 = var52;
        var4.field478 = var54;
        var5.field478 = var56;
        var6.field478 = var58;
        var7.field478 = var60;
        for (int var81 = 0; var81 < var11; var81++) {
            int var82 = this.field5255[var81] & 0xFF;
            if (var82 == 0) {
                this.field5235[var81] = (short) var2.method197(-1);
                this.field5236[var81] = (short) var2.method197(-1);
                this.field5220[var81] = (short) var2.method197(-1);
            }
            if (var82 == 1) {
                this.field5235[var81] = (short) var3.method197(-1);
                this.field5236[var81] = (short) var3.method197(-1);
                this.field5220[var81] = (short) var3.method197(-1);
                this.field5251[var81] = (short) var4.method197(-1);
                this.field5227[var81] = (short) var4.method197(-1);
                this.field5214[var81] = (short) var4.method197(-1);
                this.field5212[var81] = var5.method234(2193);
                this.field5245[var81] = var6.method234(2193);
                this.field5253[var81] = var7.method234(2193);
            }
            if (var82 == 2) {
                this.field5235[var81] = (short) var3.method197(-1);
                this.field5236[var81] = (short) var3.method197(-1);
                this.field5220[var81] = (short) var3.method197(-1);
                this.field5251[var81] = (short) var4.method197(-1);
                this.field5227[var81] = (short) var4.method197(-1);
                this.field5214[var81] = (short) var4.method197(-1);
                this.field5212[var81] = var5.method234(2193);
                this.field5245[var81] = var6.method234(2193);
                this.field5253[var81] = var7.method234(2193);
                this.field5234[var81] = var7.method234(2193);
                this.field5244[var81] = var7.method234(2193);
            }
            if (var82 == 3) {
                this.field5235[var81] = (short) var3.method197(-1);
                this.field5236[var81] = (short) var3.method197(-1);
                this.field5220[var81] = (short) var3.method197(-1);
                this.field5251[var81] = (short) var4.method197(-1);
                this.field5227[var81] = (short) var4.method197(-1);
                this.field5214[var81] = (short) var4.method197(-1);
                this.field5212[var81] = var5.method234(2193);
                this.field5245[var81] = var6.method234(2193);
                this.field5253[var81] = var7.method234(2193);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 1977)
    private class311() {
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "([B)V", line = 1979)
    private class311(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method2133(arg0);
        } else {
            this.method2152(arg0);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(III)V", line = 1986)
    public class311(int arg0, int arg1, int arg2) {
        this.field5233 = new int[arg0];
        this.field5213 = new int[arg0];
        this.field5250 = new int[arg0];
        this.field5229 = new int[arg0];
        this.field5254 = new int[arg1];
        this.field5217 = new int[arg1];
        this.field5239 = new int[arg1];
        this.field5240 = new byte[arg1];
        this.field5248 = new byte[arg1];
        this.field5256 = new byte[arg1];
        this.field5211 = new short[arg1];
        this.field5257 = new short[arg1];
        this.field5237 = new byte[arg1];
        this.field5258 = new int[arg1];
        if (arg2 > 0) {
            this.field5255 = new byte[arg2];
            this.field5235 = new short[arg2];
            this.field5236 = new short[arg2];
            this.field5220 = new short[arg2];
            this.field5251 = new short[arg2];
            this.field5227 = new short[arg2];
            this.field5214 = new short[arg2];
            this.field5212 = new byte[arg2];
            this.field5245 = new byte[arg2];
            this.field5253 = new byte[arg2];
            this.field5234 = new byte[arg2];
            this.field5244 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "([Lal;I)V", line = 2018)
    public class311(class311[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field5232 = 0;
        this.field5221 = 0;
        this.field5222 = 0;
        this.field5241 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class311 var10 = arg0[var9];
            if (var10 != null) {
                this.field5232 += var10.field5232;
                this.field5221 += var10.field5221;
                this.field5222 += var10.field5222;
                if (var10.field5248 == null) {
                    if (this.field5241 == -1) {
                        this.field5241 = var10.field5241;
                    }
                    if (this.field5241 != var10.field5241) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var10.field5240 != null;
                var5 |= var10.field5256 != null;
                var6 |= var10.field5258 != null;
                var7 |= var10.field5257 != null;
                var8 |= var10.field5237 != null;
            }
        }
        this.field5233 = new int[this.field5232];
        this.field5213 = new int[this.field5232];
        this.field5250 = new int[this.field5232];
        this.field5229 = new int[this.field5232];
        this.field5254 = new int[this.field5221];
        this.field5217 = new int[this.field5221];
        this.field5239 = new int[this.field5221];
        if (var3) {
            this.field5240 = new byte[this.field5221];
        }
        if (var4) {
            this.field5248 = new byte[this.field5221];
        }
        if (var5) {
            this.field5256 = new byte[this.field5221];
        }
        if (var6) {
            this.field5258 = new int[this.field5221];
        }
        if (var7) {
            this.field5257 = new short[this.field5221];
        }
        if (var8) {
            this.field5237 = new byte[this.field5221];
        }
        this.field5211 = new short[this.field5221];
        if (this.field5222 > 0) {
            this.field5255 = new byte[this.field5222];
            this.field5235 = new short[this.field5222];
            this.field5236 = new short[this.field5222];
            this.field5220 = new short[this.field5222];
            this.field5251 = new short[this.field5222];
            this.field5227 = new short[this.field5222];
            this.field5214 = new short[this.field5222];
            this.field5212 = new byte[this.field5222];
            this.field5245 = new byte[this.field5222];
            this.field5253 = new byte[this.field5222];
            this.field5234 = new byte[this.field5222];
            this.field5244 = new byte[this.field5222];
        }
        this.field5232 = 0;
        this.field5221 = 0;
        this.field5222 = 0;
        for (int var11 = 0; var11 < arg1; var11++) {
            class311 var12 = arg0[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < var12.field5221; var13++) {
                    if (var3 && var12.field5240 != null) {
                        this.field5240[this.field5221] = var12.field5240[var13];
                    }
                    if (var4) {
                        if (var12.field5248 == null) {
                            this.field5248[this.field5221] = var12.field5241;
                        } else {
                            this.field5248[this.field5221] = var12.field5248[var13];
                        }
                    }
                    if (var5 && var12.field5256 != null) {
                        this.field5256[this.field5221] = var12.field5256[var13];
                    }
                    if (var6 && var12.field5258 != null) {
                        this.field5258[this.field5221] = var12.field5258[var13];
                    }
                    if (var7) {
                        if (var12.field5257 == null) {
                            this.field5257[this.field5221] = -1;
                        } else {
                            this.field5257[this.field5221] = var12.field5257[var13];
                        }
                    }
                    if (var8) {
                        if (var12.field5237 == null || var12.field5237[var13] == -1) {
                            this.field5237[this.field5221] = -1;
                        } else {
                            this.field5237[this.field5221] = (byte) (var12.field5237[var13] + this.field5222);
                        }
                    }
                    this.field5211[this.field5221] = var12.field5211[var13];
                    this.field5254[this.field5221] = this.method2129(var12, var12.field5254[var13]);
                    this.field5217[this.field5221] = this.method2129(var12, var12.field5217[var13]);
                    this.field5239[this.field5221] = this.method2129(var12, var12.field5239[var13]);
                    this.field5221++;
                }
                for (int var14 = 0; var14 < var12.field5222; var14++) {
                    byte var15 = this.field5255[this.field5222] = var12.field5255[var14];
                    if (var15 == 0) {
                        this.field5235[this.field5222] = (short) this.method2129(var12, var12.field5235[var14]);
                        this.field5236[this.field5222] = (short) this.method2129(var12, var12.field5236[var14]);
                        this.field5220[this.field5222] = (short) this.method2129(var12, var12.field5220[var14]);
                    }
                    if (var15 >= 1 && var15 <= 3) {
                        this.field5235[this.field5222] = var12.field5235[var14];
                        this.field5236[this.field5222] = var12.field5236[var14];
                        this.field5220[this.field5222] = var12.field5220[var14];
                        this.field5251[this.field5222] = var12.field5251[var14];
                        this.field5227[this.field5222] = var12.field5227[var14];
                        this.field5214[this.field5222] = var12.field5214[var14];
                        this.field5212[this.field5222] = var12.field5212[var14];
                        this.field5245[this.field5222] = var12.field5245[var14];
                        this.field5253[this.field5222] = var12.field5253[var14];
                    }
                    if (var15 == 2) {
                        this.field5234[this.field5222] = var12.field5234[var14];
                        this.field5244[this.field5222] = var12.field5244[var14];
                    }
                    this.field5222++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lal;ZZZZ)V", line = 2227)
    public class311(class311 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field5232 = arg0.field5232;
        this.field5221 = arg0.field5221;
        this.field5222 = arg0.field5222;
        if (arg1) {
            this.field5233 = arg0.field5233;
            this.field5213 = arg0.field5213;
            this.field5250 = arg0.field5250;
        } else {
            this.field5233 = new int[this.field5232];
            this.field5213 = new int[this.field5232];
            this.field5250 = new int[this.field5232];
            for (int var6 = 0; var6 < this.field5232; var6++) {
                this.field5233[var6] = arg0.field5233[var6];
                this.field5213[var6] = arg0.field5213[var6];
                this.field5250[var6] = arg0.field5250[var6];
            }
        }
        if (arg2) {
            this.field5211 = arg0.field5211;
        } else {
            this.field5211 = new short[this.field5221];
            for (int var7 = 0; var7 < this.field5221; var7++) {
                this.field5211[var7] = arg0.field5211[var7];
            }
        }
        if (arg3 || arg0.field5257 == null) {
            this.field5257 = arg0.field5257;
        } else {
            this.field5257 = new short[this.field5221];
            for (int var8 = 0; var8 < this.field5221; var8++) {
                this.field5257[var8] = arg0.field5257[var8];
            }
        }
        if (arg4) {
            this.field5256 = arg0.field5256;
        } else {
            this.field5256 = new byte[this.field5221];
            if (arg0.field5256 == null) {
                for (int var9 = 0; var9 < this.field5221; var9++) {
                    this.field5256[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field5221; var10++) {
                    this.field5256[var10] = arg0.field5256[var10];
                }
            }
        }
        this.field5254 = arg0.field5254;
        this.field5217 = arg0.field5217;
        this.field5239 = arg0.field5239;
        this.field5240 = arg0.field5240;
        this.field5248 = arg0.field5248;
        this.field5237 = arg0.field5237;
        this.field5241 = arg0.field5241;
        this.field5255 = arg0.field5255;
        this.field5235 = arg0.field5235;
        this.field5236 = arg0.field5236;
        this.field5220 = arg0.field5220;
        this.field5251 = arg0.field5251;
        this.field5227 = arg0.field5227;
        this.field5214 = arg0.field5214;
        this.field5212 = arg0.field5212;
        this.field5245 = arg0.field5245;
        this.field5253 = arg0.field5253;
        this.field5234 = arg0.field5234;
        this.field5244 = arg0.field5244;
        this.field5229 = arg0.field5229;
        this.field5258 = arg0.field5258;
        this.field5247 = arg0.field5247;
        this.field5238 = arg0.field5238;
        this.field5246 = arg0.field5246;
        this.field5223 = arg0.field5223;
        this.field5219 = arg0.field5219;
        this.field5226 = arg0.field5226;
        this.field5224 = arg0.field5224;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(III)I", line = 1102)
    public final int method2134(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5232; var4++) {
            if (this.field5233[var4] == arg0 && this.field5213[var4] == arg1 && this.field5250[var4] == arg2) {
                return var4;
            }
        }
        this.field5233[this.field5232] = arg0;
        this.field5213[this.field5232] = arg1;
        this.field5250[this.field5232] = arg2;
        return this.field5232++;
    }

    @OriginalMember(owner = "client!al", name = "h", descriptor = "()V", line = 1124)
    public final void method2135() {
        for (int var1 = 0; var1 < this.field5232; var1++) {
            this.field5233[var1] = -this.field5233[var1];
            this.field5250[var1] = -this.field5250[var1];
        }
        this.method2125();
    }

    @OriginalMember(owner = "client!al", name = "i", descriptor = "()V", line = 1135)
    private final void method2136() {
        if (this.field5249) {
            return;
        }
        this.field5249 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field5232; var7++) {
            int var8 = this.field5233[var7];
            int var9 = this.field5213[var7];
            int var10 = this.field5250[var7];
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
        this.field5216 = (short) var1;
        this.field5243 = (short) var4;
        this.field5252 = (short) var2;
        this.field5215 = (short) var5;
        this.field5259 = (short) var3;
        this.field5242 = (short) var6;
    }

    @OriginalMember(owner = "client!al", name = "j", descriptor = "()V", line = 1196)
    public final void method2137() {
        if (this.field5246 != null) {
            return;
        }
        this.field5246 = new class298[this.field5232];
        for (int var1 = 0; var1 < this.field5232; var1++) {
            this.field5246[var1] = new class298();
        }
        for (int var2 = 0; var2 < this.field5221; var2++) {
            int var3 = this.field5254[var2];
            int var4 = this.field5217[var2];
            int var5 = this.field5239[var2];
            int var6 = this.field5233[var4] - this.field5233[var3];
            int var7 = this.field5213[var4] - this.field5213[var3];
            int var8 = this.field5250[var4] - this.field5250[var3];
            int var9 = this.field5233[var5] - this.field5233[var3];
            int var10 = this.field5213[var5] - this.field5213[var3];
            int var11 = this.field5250[var5] - this.field5250[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field5240 == null) {
                var19 = 0;
            } else {
                var19 = this.field5240[var2];
            }
            if (var19 == 0) {
                class298 var20 = this.field5246[var3];
                var20.field4969 += var16;
                var20.field4981 += var17;
                var20.field4972 += var18;
                var20.field4983++;
                class298 var21 = this.field5246[var4];
                var21.field4969 += var16;
                var21.field4981 += var17;
                var21.field4972 += var18;
                var21.field4983++;
                class298 var22 = this.field5246[var5];
                var22.field4969 += var16;
                var22.field4981 += var17;
                var22.field4972 += var18;
                var22.field4983++;
            } else if (var19 == 1) {
                if (this.field5223 == null) {
                    this.field5223 = new class81[this.field5221];
                }
                class81 var23 = this.field5223[var2] = new class81();
                var23.field1421 = var16;
                var23.field1423 = var17;
                var23.field1419 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)Lrf;", line = 1295)
    public final class266 method2138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class21.field350) {
            class152 var6 = new class152(this, arg0, arg1, true);
            var6.method1187();
            return var6;
        } else {
            return new class175(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 1308)
    public final void method2139(int arg0) {
        int var2 = field5231[arg0];
        int var3 = field5225[arg0];
        for (int var4 = 0; var4 < this.field5232; var4++) {
            int var5 = this.field5250[var4] * var2 + this.field5233[var4] * var3 >> 16;
            this.field5250[var4] = this.field5250[var4] * var3 - this.field5233[var4] * var2 >> 16;
            this.field5233[var4] = var5;
        }
        this.method2125();
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 1328)
    private final void method2140(int arg0) {
        int var2 = field5231[arg0];
        int var3 = field5225[arg0];
        for (int var4 = 0; var4 < this.field5232; var4++) {
            int var5 = this.field5213[var4] * var3 - this.field5250[var4] * var2 >> 16;
            this.field5250[var4] = this.field5250[var4] * var3 + this.field5213[var4] * var2 >> 16;
            this.field5213[var4] = var5;
        }
        this.method2125();
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(III)V", line = 1346)
    public final void method2141(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field5231[arg2];
            int var5 = field5225[arg2];
            for (int var6 = 0; var6 < this.field5232; var6++) {
                int var7 = this.field5233[var6] * var5 + this.field5213[var6] * var4 >> 16;
                this.field5213[var6] = this.field5213[var6] * var5 - this.field5233[var6] * var4 >> 16;
                this.field5233[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field5231[arg0];
            int var9 = field5225[arg0];
            for (int var10 = 0; var10 < this.field5232; var10++) {
                int var11 = this.field5213[var10] * var9 - this.field5250[var10] * var8 >> 16;
                this.field5250[var10] = this.field5250[var10] * var9 + this.field5213[var10] * var8 >> 16;
                this.field5213[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field5231[arg1];
        int var13 = field5225[arg1];
        for (int var14 = 0; var14 < this.field5232; var14++) {
            int var15 = this.field5250[var14] * var12 + this.field5233[var14] * var13 >> 16;
            this.field5250[var14] = this.field5250[var14] * var13 - this.field5233[var14] * var12 >> 16;
            this.field5233[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!al", name = "k", descriptor = "()V", line = 1414)
    public final void method2142() {
        for (int var1 = 0; var1 < this.field5232; var1++) {
            this.field5250[var1] = -this.field5250[var1];
        }
        for (int var2 = 0; var2 < this.field5221; var2++) {
            int var3 = this.field5254[var2];
            this.field5254[var2] = this.field5239[var2];
            this.field5239[var2] = var3;
        }
        this.method2125();
    }

    @OriginalMember(owner = "client!al", name = "l", descriptor = "()V", line = 1436)
    public final void method2143() {
        for (int var1 = 0; var1 < this.field5232; var1++) {
            int var2 = this.field5233[var1];
            this.field5233[var1] = this.field5250[var1];
            this.field5250[var1] = -var2;
        }
        this.method2125();
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(III)V", line = 1451)
    public final void method2144(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5232; var4++) {
            this.field5233[var4] += arg0;
            this.field5213[var4] += arg1;
            this.field5250[var4] += arg2;
        }
        this.method2125();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lce;II)Lal;", line = 1479)
    public static final class311 method2145(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1651(arg1, arg2, -1);
        return var3 == null ? null : new class311(var3);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 1487)
    private final void method2146(int arg0) {
        int var2 = field5231[arg0];
        int var3 = field5225[arg0];
        for (int var4 = 0; var4 < this.field5232; var4++) {
            int var5 = this.field5233[var4] * var3 + this.field5213[var4] * var2 >> 16;
            this.field5213[var4] = this.field5213[var4] * var3 - this.field5233[var4] * var2 >> 16;
            this.field5233[var4] = var5;
        }
        this.method2125();
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(IIIII)Lpj;", line = 1506)
    public final class175 method2147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class175(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(III)V", line = 1512)
    public final void method2148(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5232; var4++) {
            this.field5233[var4] = this.field5233[var4] * arg0 / 128;
            this.field5213[var4] = this.field5213[var4] * arg1 / 128;
            this.field5250[var4] = this.field5250[var4] * arg2 / 128;
        }
        this.method2125();
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(SS)V", line = 1540)
    public final void method2149(short arg0, short arg1) {
        if (this.field5257 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field5221; var3++) {
            if (this.field5257[var3] == arg0) {
                this.field5257[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "m", descriptor = "()V", line = 1556)
    public final void method2150() {
        this.field5229 = null;
        this.field5258 = null;
        this.field5247 = (int[][]) null;
        this.field5238 = (int[][]) null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Lbg;", line = 1562)
    public final class196 method1153(int arg0, int arg1, int arg2) {
        return this.method2138(this.field5226, this.field5224, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([[IIIIII)V", line = 1566)
    private final void method2151(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method2126(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method2126(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method2126(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method2126(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method2140(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method2146(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method2144(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "([B)V", line = 1638)
    private final void method2152(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class26 var4 = new class26(arg0);
        class26 var5 = new class26(arg0);
        class26 var6 = new class26(arg0);
        class26 var7 = new class26(arg0);
        class26 var8 = new class26(arg0);
        var4.field478 = arg0.length - 18;
        int var9 = var4.method197(-1);
        int var10 = var4.method197(-1);
        int var11 = var4.method226(255);
        int var12 = var4.method226(255);
        int var13 = var4.method226(255);
        int var14 = var4.method226(255);
        int var15 = var4.method226(255);
        int var16 = var4.method226(255);
        int var17 = var4.method197(-1);
        int var18 = var4.method197(-1);
        int var19 = var4.method197(-1);
        int var20 = var4.method197(-1);
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
        this.field5232 = var9;
        this.field5221 = var10;
        this.field5222 = var11;
        this.field5233 = new int[var9];
        this.field5213 = new int[var9];
        this.field5250 = new int[var9];
        this.field5254 = new int[var10];
        this.field5217 = new int[var10];
        this.field5239 = new int[var10];
        if (var11 > 0) {
            this.field5255 = new byte[var11];
            this.field5235 = new short[var11];
            this.field5236 = new short[var11];
            this.field5220 = new short[var11];
        }
        if (var16 == 1) {
            this.field5229 = new int[var9];
        }
        if (var12 == 1) {
            this.field5240 = new byte[var10];
            this.field5237 = new byte[var10];
            this.field5257 = new short[var10];
        }
        if (var13 == 255) {
            this.field5248 = new byte[var10];
        } else {
            this.field5241 = (byte) var13;
        }
        if (var14 == 1) {
            this.field5256 = new byte[var10];
        }
        if (var15 == 1) {
            this.field5258 = new int[var10];
        }
        this.field5211 = new short[var10];
        var4.field478 = var21;
        var5.field478 = var36;
        var6.field478 = var38;
        var7.field478 = var40;
        var8.field478 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method226(255);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method192((byte) 107);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method192((byte) 67);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method192((byte) -113);
            }
            this.field5233[var46] = var43 + var48;
            this.field5213[var46] = var44 + var49;
            this.field5250[var46] = var45 + var50;
            var43 = this.field5233[var46];
            var44 = this.field5213[var46];
            var45 = this.field5250[var46];
            if (var16 == 1) {
                this.field5229[var46] = var8.method226(255);
            }
        }
        var4.field478 = var32;
        var5.field478 = var28;
        var6.field478 = var26;
        var7.field478 = var30;
        var8.field478 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field5211[var51] = (short) var4.method197(-1);
            if (var12 == 1) {
                int var52 = var5.method226(255);
                if ((var52 & 0x1) == 1) {
                    this.field5240[var51] = 1;
                    var2 = true;
                } else {
                    this.field5240[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field5237[var51] = (byte) (var52 >> 2);
                    this.field5257[var51] = this.field5211[var51];
                    this.field5211[var51] = 127;
                    if (this.field5257[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field5237[var51] = -1;
                    this.field5257[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field5248[var51] = var6.method234(2193);
            }
            if (var14 == 1) {
                this.field5256[var51] = var7.method234(2193);
            }
            if (var15 == 1) {
                this.field5258[var51] = var8.method226(255);
            }
        }
        var4.field478 = var25;
        var5.field478 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method226(255);
            if (var58 == 1) {
                var53 = var4.method192((byte) -109) + var56;
                var54 = var4.method192((byte) -127) + var53;
                var55 = var4.method192((byte) -119) + var54;
                var56 = var55;
                this.field5254[var57] = var53;
                this.field5217[var57] = var54;
                this.field5239[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method192((byte) 48) + var56;
                var56 = var55;
                this.field5254[var57] = var53;
                this.field5217[var57] = var54;
                this.field5239[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method192((byte) 50) + var56;
                var56 = var55;
                this.field5254[var57] = var53;
                this.field5217[var57] = var54;
                this.field5239[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method192((byte) 69) + var56;
                var56 = var55;
                this.field5254[var57] = var53;
                this.field5217[var57] = var61;
                this.field5239[var57] = var55;
            }
        }
        var4.field478 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field5255[var62] = 0;
            this.field5235[var62] = (short) var4.method197(-1);
            this.field5236[var62] = (short) var4.method197(-1);
            this.field5220[var62] = (short) var4.method197(-1);
        }
        if (this.field5237 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field5237[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field5235[var65] & 0xFFFF) == this.field5254[var64] && (this.field5236[var65] & 0xFFFF) == this.field5217[var64] && (this.field5220[var65] & 0xFFFF) == this.field5239[var64]) {
                        this.field5237[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field5237 = null;
            }
        }
        if (!var3) {
            this.field5257 = null;
        }
        if (!var2) {
            this.field5240 = null;
        }
    }
}
