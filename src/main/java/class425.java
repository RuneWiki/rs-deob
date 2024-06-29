import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class425 extends class289 {

    @OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
    private int field6259 = 0;

    @OriginalMember(owner = "client!qo", name = "vb", descriptor = "I")
    private int field6294 = 0;

    @OriginalMember(owner = "client!qo", name = "Nb", descriptor = "Z")
    private boolean field6312 = true;

    @OriginalMember(owner = "client!qo", name = "ec", descriptor = "Z")
    private boolean field6329 = false;

    @OriginalMember(owner = "client!qo", name = "kc", descriptor = "I")
    private int field6335 = 0;

    @OriginalMember(owner = "client!qo", name = "bc", descriptor = "I")
    private int field6326 = 0;

    @OriginalMember(owner = "client!qo", name = "fc", descriptor = "I")
    private int field6330 = 0;

    @OriginalMember(owner = "client!qo", name = "Wb", descriptor = "Ltt;")
    private class249 field6321;

    @OriginalMember(owner = "client!qo", name = "xb", descriptor = "Lpp;")
    private class387 field6296;

    @OriginalMember(owner = "client!qo", name = "hb", descriptor = "Lpp;")
    private class387 field6280;

    @OriginalMember(owner = "client!qo", name = "pc", descriptor = "Lpp;")
    private class387 field6340;

    @OriginalMember(owner = "client!qo", name = "qc", descriptor = "Lpp;")
    private class387 field6341;

    @OriginalMember(owner = "client!qo", name = "Mb", descriptor = "Lln;")
    private class71 field6311;

    @OriginalMember(owner = "client!qo", name = "Jb", descriptor = "I")
    private int field6308;

    @OriginalMember(owner = "client!qo", name = "Q", descriptor = "I")
    private int field6264;

    @OriginalMember(owner = "client!qo", name = "K", descriptor = "[I")
    private int[] field6258;

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "[I")
    private int[] field6252;

    @OriginalMember(owner = "client!qo", name = "Zb", descriptor = "[I")
    private int[] field6324;

    @OriginalMember(owner = "client!qo", name = "Xb", descriptor = "[I")
    private int[] field6322;

    @OriginalMember(owner = "client!qo", name = "X", descriptor = "[S")
    private short[] field6270;

    @OriginalMember(owner = "client!qo", name = "O", descriptor = "[Lu;")
    private class349[] field6262;

    @OriginalMember(owner = "client!qo", name = "mc", descriptor = "[Lod;")
    private class476[] field6337;

    @OriginalMember(owner = "client!qo", name = "Kb", descriptor = "I")
    private int field6309;

    @OriginalMember(owner = "client!qo", name = "T", descriptor = "[Lbb;")
    private class315[] field6267;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "[Lcf;")
    private class285[] field6236;

    @OriginalMember(owner = "client!qo", name = "eb", descriptor = "[S")
    private short[] field6277;

    @OriginalMember(owner = "client!qo", name = "qb", descriptor = "[S")
    private short[] field6289;

    @OriginalMember(owner = "client!qo", name = "G", descriptor = "[S")
    private short[] field6254;

    @OriginalMember(owner = "client!qo", name = "N", descriptor = "[S")
    private short[] field6261;

    @OriginalMember(owner = "client!qo", name = "ic", descriptor = "[S")
    private short[] field6333;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "[S")
    private short[] field6246;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "[S")
    private short[] field6235;

    @OriginalMember(owner = "client!qo", name = "J", descriptor = "[S")
    private short[] field6257;

    @OriginalMember(owner = "client!qo", name = "mb", descriptor = "[F")
    private float[] field6285;

    @OriginalMember(owner = "client!qo", name = "rb", descriptor = "[B")
    private byte[] field6290;

    @OriginalMember(owner = "client!qo", name = "P", descriptor = "[F")
    private float[] field6263;

    @OriginalMember(owner = "client!qo", name = "wb", descriptor = "S")
    private short field6295;

    @OriginalMember(owner = "client!qo", name = "yb", descriptor = "[S")
    private short[] field6297;

    @OriginalMember(owner = "client!qo", name = "zb", descriptor = "[B")
    private byte[] field6298;

    @OriginalMember(owner = "client!qo", name = "ab", descriptor = "S")
    private short field6273;

    @OriginalMember(owner = "client!qo", name = "ob", descriptor = "[S")
    private short[] field6287;

    @OriginalMember(owner = "client!qo", name = "Fb", descriptor = "[I")
    private int[] field6304;

    @OriginalMember(owner = "client!qo", name = "dc", descriptor = "[[I")
    private int[][] field6328;

    @OriginalMember(owner = "client!qo", name = "tb", descriptor = "[[I")
    private int[][] field6292;

    @OriginalMember(owner = "client!qo", name = "bb", descriptor = "[[I")
    private int[][] field6274;

    @OriginalMember(owner = "client!qo", name = "oc", descriptor = "I")
    public static int field6339 = -1;

    @OriginalMember(owner = "client!qo", name = "fb", descriptor = "B")
    private byte field6278;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!qo", name = "M", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!qo", name = "R", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!qo", name = "S", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!qo", name = "U", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!qo", name = "V", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!qo", name = "Y", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!qo", name = "cb", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!qo", name = "db", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!qo", name = "gb", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!qo", name = "ib", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!qo", name = "jb", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!qo", name = "kb", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!qo", name = "lb", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!qo", name = "nb", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!qo", name = "pb", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!qo", name = "sb", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!qo", name = "ub", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!qo", name = "Bb", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!qo", name = "Cb", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!qo", name = "Db", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!qo", name = "Eb", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!qo", name = "Gb", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!qo", name = "Ib", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!qo", name = "Lb", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!qo", name = "Ob", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!qo", name = "Pb", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!qo", name = "Rb", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!qo", name = "Sb", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!qo", name = "Tb", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!qo", name = "Ub", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!qo", name = "Vb", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!qo", name = "Yb", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!qo", name = "ac", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!qo", name = "cc", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!qo", name = "gc", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!qo", name = "hc", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!qo", name = "jc", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!qo", name = "lc", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!qo", name = "nc", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "Lql;")
    private class121 field6245;

    @OriginalMember(owner = "client!qo", name = "rc", descriptor = "Lfp;")
    private class440 field6342;

    @OriginalMember(owner = "client!qo", name = "Qb", descriptor = "Loq;")
    private class504 field6315;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "S")
    private short field6232;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "S")
    private short field6243;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "S")
    private short field6248;

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "S")
    private short field6253;

    @OriginalMember(owner = "client!qo", name = "I", descriptor = "S")
    private short field6256;

    @OriginalMember(owner = "client!qo", name = "Z", descriptor = "S")
    private short field6272;

    @OriginalMember(owner = "client!qo", name = "Ab", descriptor = "S")
    private short field6299;

    @OriginalMember(owner = "client!qo", name = "Hb", descriptor = "[Ljava/lang/String;")
    public static String[] field6306;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIIB)Z")
    private final boolean method2643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field6250++;
        if (arg5 > arg1 && arg3 > arg1 && arg1 < arg0) {
            return false;
        } else if (arg1 > arg5 && arg1 > arg3 && arg1 > arg0) {
            return false;
        } else if (arg8 != 103) {
            return false;
        } else if (arg4 < arg7 && arg2 > arg4 && arg4 < arg6) {
            return false;
        } else {
            return arg4 <= arg7 || arg4 <= arg2 || arg4 <= arg6;
        }
    }

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "(I)V")
    public final void method620(int arg0) {
        this.field6273 = (short) arg0;
        if (this.field6341 != null) {
            this.field6341.field5689 = null;
        }
        field6314++;
        if (this.field6340 != null) {
            this.field6340.field5689 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "S", descriptor = "()I")
    public final int method652() {
        field6310++;
        if (!this.field6329) {
            this.method2652(125);
        }
        return this.field6253;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lc;Lwg;II)V")
    public final void method656(class517 arg0, class41 arg1, int arg2, int arg3) {
        field6305++;
        if (this.field6335 == 0) {
            return;
        }
        class495 var5 = this.field6321.field3948;
        if (!this.field6329) {
            this.method2652(116);
        }
        class495 var6 = (class495) arg0;
        class37.field477 = var5.field7237 * var6.field7229 + var5.field7221 * var6.field7210 + var5.field7214 * var6.field7216 + var5.field7229;
        class1.field3 = var5.field7237 * var6.field7221 + var5.field7221 * var6.field7236 + var5.field7214 * var6.field7235;
        float var7 = (float) this.field6232 * class1.field3 + class37.field477;
        float var8 = (float) this.field6256 * class1.field3 + class37.field477;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) (-this.field6299) + var8;
            var10 = (float) this.field6299 + var7;
        } else {
            var10 = (float) this.field6299 + var8;
            var9 = (float) (-this.field6299) + var7;
        }
        if ((var9 >= this.field6321.field3949) || (var10 <= (float) this.field6321.field4013)) {
            return;
        }
        class191.field2945 = var5.field7230 * var6.field7229 + var5.field7235 * var6.field7210 + var5.field7233 * var6.field7216 + var5.field7216;
        class431.field6389 = var5.field7230 * var6.field7221 + var5.field7235 * var6.field7236 + var5.field7233 * var6.field7235;
        float var11 = (float) this.field6232 * class431.field6389 + class191.field2945;
        float var12 = (float) this.field6256 * class431.field6389 + class191.field2945;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) this.field6299 + var11) * (float) this.field6321.field4011;
            var14 = (var12 - (float) this.field6299) * (float) this.field6321.field4011;
        } else {
            var14 = (var11 - (float) this.field6299) * (float) this.field6321.field4011;
            var13 = ((float) this.field6299 + var12) * (float) this.field6321.field4011;
        }
        if ((var14 / (float) arg2 >= this.field6321.field4032) || (var13 / (float) arg2 <= this.field6321.field4012)) {
            return;
        }
        class295.field4545 = var5.field7209 * var6.field7221 + var5.field7236 * var6.field7236 + var5.field7231 * var6.field7235;
        class269.field4268 = var5.field7209 * var6.field7229 + var5.field7236 * var6.field7210 + var5.field7231 * var6.field7216 + var5.field7210;
        float var15 = (float) this.field6232 * class295.field4545 + class269.field4268;
        float var16 = (float) this.field6256 * class295.field4545 + class269.field4268;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) (-this.field6299) + var16) * (float) this.field6321.field4055;
            var18 = ((float) this.field6299 + var15) * (float) this.field6321.field4055;
        } else {
            var17 = ((float) (-this.field6299) + var15) * (float) this.field6321.field4055;
            var18 = ((float) this.field6299 + var16) * (float) this.field6321.field4055;
        }
        if ((this.field6321.field4022 <= var17 / (float) arg2) || (this.field6321.field4023 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field6267 != null) {
            class404.field5965 = var5.field7237 * var6.field7214 + var5.field7221 * var6.field7231 + var5.field7214 * var6.field7233;
            class504.field7323 = var5.field7209 * var6.field7214 + var5.field7236 * var6.field7231 + var5.field7231 * var6.field7233;
            class469.field6892 = var5.field7230 * var6.field7237 + var5.field7235 * var6.field7209 + var5.field7233 * var6.field7230;
            class240.field3601 = var5.field7230 * var6.field7214 + var5.field7235 * var6.field7231 + var5.field7233 * var6.field7233;
            class355.field5262 = var5.field7237 * var6.field7237 + var5.field7221 * var6.field7209 + var5.field7214 * var6.field7230;
            class227.field3444 = var5.field7209 * var6.field7237 + var5.field7236 * var6.field7209 + var5.field7231 * var6.field7230;
        }
        if (arg1 != null) {
            int var19 = this.field6272 + this.field6243 >> 1;
            int var20 = this.field6253 + this.field6248 >> 1;
            int var21 = (int) ((float) var20 * class469.field6892 + (float) this.field6232 * class431.field6389 + (float) var19 * class240.field3601 + class191.field2945);
            int var22 = (int) ((float) var20 * class227.field3444 + (float) this.field6232 * class295.field4545 + (float) var19 * class504.field7323 + class269.field4268);
            int var23 = (int) ((float) var20 * class355.field5262 + (float) this.field6232 * class1.field3 + (float) var19 * class404.field5965 + class37.field477);
            int var24 = (int) ((float) var20 * class469.field6892 + (float) this.field6256 * class431.field6389 + (float) var19 * class240.field3601 + class191.field2945);
            int var25 = (int) ((float) var20 * class227.field3444 + (float) this.field6256 * class295.field4545 + (float) var19 * class504.field7323 + class269.field4268);
            arg1.field672 = this.field6321.field3953 + (this.field6321.field4055 * var25 / arg2);
            arg1.field668 = this.field6321.field4011 * var21 / arg2 + this.field6321.field3997;
            arg1.field671 = this.field6321.field4055 * var22 / arg2 + this.field6321.field3953;
            arg1.field669 = this.field6321.field4011 * var24 / arg2 + this.field6321.field3997;
            int var26 = (int) ((float) var20 * class355.field5262 + (float) this.field6256 * class1.field3 + (float) var19 * class404.field5965 + class37.field477);
            if (var23 < this.field6321.field4013 && var26 < this.field6321.field4013) {
                arg1.field673 = true;
                arg1.field670 = (var21 + this.field6299) * this.field6321.field4011 / arg2 + this.field6321.field3997 - arg1.field668;
            }
        }
        this.field6321.method1723(-4, (float) arg2);
        this.field6321.method1730((byte) -83);
        this.field6321.method1747(true, var6);
        this.method2647(2);
        this.field6321.method1757((byte) 45);
        this.method2655(-113);
    }

    @OriginalMember(owner = "client!qo", name = "da", descriptor = "(IILya;Lya;III)V")
    public final void method677(int arg0, int arg1, class11 arg2, class11 arg3, int arg4, int arg5, int arg6) {
        field6239++;
        if (!this.field6329) {
            this.method2652(124);
        }
        int var8 = arg4 + this.field6272;
        int var9 = this.field6243 + arg4;
        int var10 = this.field6248 + arg6;
        int var11 = this.field6253 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field124 <= var9 + arg2.field127 >> arg2.field123 || var10 < 0 || arg2.field127 + var11 >> arg2.field123 >= arg2.field122) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field127 + var9 >> arg3.field123 >= arg3.field124 || var10 < 0 || arg3.field127 + var11 >> arg3.field123 >= arg3.field122) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field123;
            int var13 = -(-arg2.field127 - var9) - 1 >> arg2.field123;
            int var14 = var10 >> arg2.field123;
            int var15 = arg2.field127 + var11 - 1 >> arg2.field123;
            if (arg2.method56(var12, var14) == arg5 && arg5 == arg2.method56(var13, var14) && arg2.method56(var12, var15) == arg5 && arg2.method56(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field6330; var32++) {
                this.field6252[var32] = this.field6252[var32] + arg2.method68(this.field6322[var32] + arg4, this.field6324[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field6232;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field6330; var30++) {
                int var31 = (this.field6252[var30] << 16) / var29;
                if (arg1 > var31) {
                    this.field6252[var30] += (arg2.method68(this.field6322[var30] + arg4, this.field6324[var30] + arg6) - arg5) * (arg1 - var31) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = (arg1 >> 8 & 0xFF) * 4;
            int var18 = (arg1 & 0xFF01A3) >> 16 << 6;
            int var19 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var16 >> 1) < 0 || arg2.field124 << arg2.field123 <= (var16 >> 1) + arg2.field127 + arg4 || (arg6 - (var17 >> 1)) < 0 || arg2.field122 << arg2.field123 <= (var17 >> 1) + arg2.field127 + arg6) {
                return;
            }
            this.method1939(var17, arg4, var19, var18, arg5, var16, arg2, 200, arg6);
        } else if (arg0 == 4) {
            int var27 = this.field6256 - this.field6232;
            for (int var28 = 0; var28 < this.field6330; var28++) {
                this.field6252[var28] = this.field6252[var28] + arg3.method68(this.field6322[var28] + arg4, this.field6324[var28] + arg6) + var27 - arg5;
            }
        } else if (arg0 == 5) {
            int var20 = this.field6256 - this.field6232;
            for (int var21 = 0; var21 < this.field6330; var21++) {
                int var22 = this.field6322[var21] + arg4;
                int var23 = this.field6324[var21] + arg6;
                int var24 = arg2.method68(var22, var23);
                int var25 = arg3.method68(var22, var23);
                int var26 = var24 - var25;
                this.field6252[var21] = ((this.field6252[var21] << 8) / var20 * var26 >> 8) + (var24 - arg5);
            }
        }
        if (this.field6296 != null) {
            this.field6296.field5689 = null;
        }
        this.field6329 = false;
    }

    @OriginalMember(owner = "client!qo", name = "MA", descriptor = "()I")
    public final int method624() {
        if (!this.field6329) {
            this.method2652(122);
        }
        field6238++;
        return this.field6243;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public static final void method2644(int arg0) {
        if (arg0 != 27576) {
            method2656((byte) 37);
        }
        if (class350.field5227 != null) {
            class350.field5227.method2818((byte) -73);
        }
        field6269++;
        if (class176.field2707 != null) {
            class176.field2707.method2818((byte) -73);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
    public final void method678(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field6330; var4++) {
            if (arg0 != 0) {
                this.field6322[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field6252[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field6324[var4] += arg2;
            }
        }
        field6307++;
        this.field6329 = false;
        if (this.field6296 != null) {
            this.field6296.field5689 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "za", descriptor = "(IIII)V")
    public final void method648(int arg0, int arg1, int arg2, int arg3) {
        field6266++;
        if (arg0 == 0) {
            class175.field2691 = 0;
            int var5 = 0;
            class30.field345 = 0;
            class22.field249 = 0;
            for (int var6 = 0; var6 < this.field6330; var6++) {
                class22.field249 += this.field6322[var6];
                class175.field2691 += this.field6252[var6];
                class30.field345 += this.field6324[var6];
                var5++;
            }
            if (var5 <= 0) {
                class22.field249 = arg1;
                class175.field2691 = arg2;
                class30.field345 = arg3;
            } else {
                class175.field2691 = class175.field2691 / var5 + arg2;
                class30.field345 = class30.field345 / var5 + arg3;
                class22.field249 = class22.field249 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field6330; var7++) {
                this.field6322[var7] += arg1;
                this.field6252[var7] += arg2;
                this.field6324[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field6330; var8++) {
                this.field6322[var8] -= class22.field249;
                this.field6252[var8] -= class175.field2691;
                this.field6324[var8] -= class30.field345;
                if (arg3 != 0) {
                    int var9 = class58.field891[arg3];
                    int var10 = class58.field889[arg3];
                    int var11 = this.field6322[var8] * var10 + (this.field6252[var8] * var9 + 32767) >> 15;
                    this.field6252[var8] = this.field6252[var8] * var10 + 32767 - this.field6322[var8] * var9 >> 15;
                    this.field6322[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class58.field891[arg1];
                    int var13 = class58.field889[arg1];
                    int var14 = this.field6252[var8] * var13 + 32767 - (this.field6324[var8] * var12) >> 15;
                    this.field6324[var8] = this.field6324[var8] * var13 + this.field6252[var8] * var12 + 32767 >> 15;
                    this.field6252[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class58.field891[arg2];
                    int var16 = class58.field889[arg2];
                    int var17 = this.field6322[var8] * var16 + this.field6324[var8] * var15 + 32767 >> 15;
                    this.field6324[var8] = this.field6324[var8] * var16 + 32767 - (this.field6322[var8] * var15) >> 15;
                    this.field6322[var8] = var17;
                }
                this.field6322[var8] += class22.field249;
                this.field6252[var8] += class175.field2691;
                this.field6324[var8] += class30.field345;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field6330; var18++) {
                this.field6322[var18] -= class22.field249;
                this.field6252[var18] -= class175.field2691;
                this.field6324[var18] -= class30.field345;
                this.field6322[var18] = this.field6322[var18] * arg1 / 128;
                this.field6252[var18] = this.field6252[var18] * arg2 / 128;
                this.field6324[var18] = this.field6324[var18] * arg3 / 128;
                this.field6322[var18] += class22.field249;
                this.field6252[var18] += class175.field2691;
                this.field6324[var18] += class30.field345;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field6294; var19++) {
                int var23 = (this.field6298[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field6298[var19] = (byte) var23;
            }
            if (this.field6341 != null) {
                this.field6341.field5689 = null;
            }
            if (this.field6267 != null) {
                for (int var20 = 0; var20 < this.field6309; var20++) {
                    class315 var21 = this.field6267[var20];
                    class285 var22 = this.field6236[var20];
                    var22.field4443 = var22.field4443 & 0xFFFFFF | 255 - (this.field6298[var21.field4806] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field6294; var24++) {
                int var28 = this.field6261[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = arg2 / 4 + var30;
                int var33 = var28 & 0x7F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var33;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field6261[var24] = (short) class19.method118(class19.method118(var32 << 7, var31 << 10), var34);
            }
            if (this.field6341 != null) {
                this.field6341.field5689 = null;
            }
            if (this.field6267 != null) {
                for (int var25 = 0; var25 < this.field6309; var25++) {
                    class315 var26 = this.field6267[var25];
                    class285 var27 = this.field6236[var25];
                    var27.field4443 = var27.field4443 & 0xFF000000 | class203.field3141[this.field6261[var26.field4806] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field6309; var35++) {
                class285 var36 = this.field6236[var35];
                var36.field4445 += arg1;
                var36.field4437 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field6309; var37++) {
                class285 var38 = this.field6236[var37];
                var38.field4444 = var38.field4444 * arg2 >> 7;
                var38.field4435 = var38.field4435 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field6309; var39++) {
                class285 var40 = this.field6236[var39];
                var40.field4438 = var40.field4438 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "(I)V")
    public final void method662(int arg0) {
        this.field6264 = arg0;
        field6331++;
        this.field6312 = true;
        if (this.field6315 != null && (this.field6264 & 0x10000) == 0) {
            this.field6290 = this.field6315.field7319;
            this.field6254 = this.field6315.field7315;
            this.field6277 = this.field6315.field7318;
            this.field6333 = this.field6315.field7320;
            this.field6315 = null;
        }
        this.method2645(false);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
    private final void method2645(boolean arg0) {
        field6334++;
        if (!this.field6312) {
            return;
        }
        this.field6312 = arg0;
        if (this.field6337 == null && this.field6262 == null && this.field6267 == null) {
            if (this.field6322 != null && !class342.method2202(this.field6264, (byte) -13, this.field6308)) {
                if (this.field6296 != null && this.field6296.field5689 == null) {
                    this.field6312 = true;
                } else {
                    if (!this.field6329) {
                        this.method2652(116);
                    }
                    this.field6322 = null;
                }
            }
            if (this.field6252 != null && !class327.method2149(this.field6264, (byte) 53, this.field6308)) {
                if (this.field6296 != null && this.field6296.field5689 == null) {
                    this.field6312 = true;
                } else {
                    if (!this.field6329) {
                        this.method2652(121);
                    }
                    this.field6252 = null;
                }
            }
            if (this.field6324 != null && !class108.method849((byte) -113, this.field6308, this.field6264)) {
                if (this.field6296 != null && this.field6296.field5689 == null) {
                    this.field6312 = true;
                } else {
                    if (!this.field6329) {
                        this.method2652(123);
                    }
                    this.field6324 = null;
                }
            }
        }
        if (this.field6289 != null && this.field6322 == null && this.field6252 == null && this.field6324 == null) {
            this.field6289 = null;
            this.field6258 = null;
        }
        if (this.field6290 != null && !class234.method1586((byte) -66, this.field6308, this.field6264)) {
            if (this.field6340 == null) {
                if (this.field6341 != null && this.field6341.field5689 == null) {
                    this.field6312 = true;
                } else {
                    this.field6254 = this.field6333 = this.field6277 = null;
                    this.field6290 = null;
                }
            } else if (this.field6340.field5689 == null) {
                this.field6312 = true;
            } else {
                this.field6254 = this.field6333 = this.field6277 = null;
                this.field6290 = null;
            }
        }
        if (this.field6261 != null && !class396.method2502(this.field6308, this.field6264, -74)) {
            if (this.field6341 != null && this.field6341.field5689 == null) {
                this.field6312 = true;
            } else {
                this.field6261 = null;
            }
        }
        if (this.field6298 != null && !class381.method2419(this.field6308, this.field6264, true)) {
            if (this.field6341 != null && this.field6341.field5689 == null) {
                this.field6312 = true;
            } else {
                this.field6298 = null;
            }
        }
        if (this.field6285 != null && !class435.method2703(-19208, this.field6264, this.field6308)) {
            if (this.field6280 != null && this.field6280.field5689 == null) {
                this.field6312 = true;
            } else {
                this.field6285 = this.field6263 = null;
            }
        }
        if (this.field6257 != null && !class183.method1280((byte) 119, this.field6264, this.field6308)) {
            if (this.field6341 != null && this.field6341.field5689 == null) {
                this.field6312 = true;
            } else {
                this.field6257 = null;
            }
        }
        if (this.field6287 != null && !class155.method1128(this.field6264, this.field6308, -118)) {
            if ((this.field6311 == null || this.field6311.field1128 != null) && (this.field6341 == null || this.field6341.field5689 != null)) {
                this.field6287 = this.field6246 = this.field6297 = null;
            } else {
                this.field6312 = true;
            }
        }
        if (this.field6274 != null && !class46.method314(this.field6308, this.field6264, -54)) {
            this.field6235 = null;
            this.field6274 = null;
        }
        if (this.field6328 != null && !class281.method1896(this.field6264, this.field6308, (byte) 90)) {
            this.field6270 = null;
            this.field6328 = null;
        }
        if (this.field6292 != null && !class533.method3144((byte) -21, this.field6308, this.field6264)) {
            this.field6292 = null;
        }
        if (this.field6304 != null && (this.field6264 & 0x800) == 0 && (this.field6264 & 0x40000) == 0) {
            this.field6304 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)V")
    public final void method664(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field6294; var5++) {
            int var9 = this.field6261[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field6261[var5] = (short) class19.method118(var12, class19.method118(var10 << 10, var11 << 7));
        }
        field6251++;
        if (this.field6267 != null) {
            for (int var6 = 0; var6 < this.field6309; var6++) {
                class315 var7 = this.field6267[var6];
                class285 var8 = this.field6236[var6];
                var8.field4443 = class203.field3141[this.field6261[var7.field4806] & 0xFFFF] & 0xFFFFFF | var8.field4443 & 0xFF000000;
            }
        }
        if (this.field6341 != null) {
            this.field6341.field5689 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "()I")
    public final int method654() {
        if (!this.field6329) {
            this.method2652(114);
        }
        field6249++;
        return this.field6232;
    }

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "()I")
    public final int method655() {
        field6316++;
        if (!this.field6329) {
            this.method2652(125);
        }
        return this.field6299;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZLqo;Lqo;ZZ)Le;")
    private final class289 method2646(int arg0, boolean arg1, class425 arg2, class425 arg3, boolean arg4, boolean arg5) {
        arg3.field6294 = this.field6294;
        arg3.field6295 = this.field6295;
        arg3.field6326 = this.field6326;
        arg3.field6309 = this.field6309;
        arg3.field6264 = arg0;
        field6320++;
        arg3.field6259 = this.field6259;
        arg3.field6308 = this.field6308;
        arg3.field6335 = this.field6335;
        arg3.field6273 = this.field6273;
        arg3.field6330 = this.field6330;
        arg3.field6278 = 0;
        boolean var7 = class192.method1329(this.field6308, -1, arg0);
        boolean var8 = class178.method1256(13775, arg0, this.field6308);
        boolean var9 = class426.method2660(this.field6308, arg0, -75);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg3.field6322 = this.field6322;
            } else if (arg2.field6322 == null || this.field6259 > arg2.field6322.length) {
                arg3.field6322 = arg2.field6322 = new int[this.field6259];
            } else {
                arg3.field6322 = arg2.field6322;
            }
            if (!var8) {
                arg3.field6252 = this.field6252;
            } else if (arg2.field6252 == null || this.field6259 > arg2.field6252.length) {
                arg3.field6252 = arg2.field6252 = new int[this.field6259];
            } else {
                arg3.field6252 = arg2.field6252;
            }
            if (!var9) {
                arg3.field6324 = this.field6324;
            } else if (arg2.field6324 == null || this.field6259 > arg2.field6324.length) {
                arg3.field6324 = arg2.field6324 = new int[this.field6259];
            } else {
                arg3.field6324 = arg2.field6324;
            }
            for (int var11 = 0; var11 < this.field6259; var11++) {
                if (var7) {
                    arg3.field6322[var11] = this.field6322[var11];
                }
                if (var8) {
                    arg3.field6252[var11] = this.field6252[var11];
                }
                if (var9) {
                    arg3.field6324[var11] = this.field6324[var11];
                }
            }
        } else {
            arg3.field6252 = this.field6252;
            arg3.field6324 = this.field6324;
            arg3.field6322 = this.field6322;
        }
        if (class303.method2004(73, arg0, this.field6308)) {
            arg3.field6296 = arg2.field6296;
            if (arg4) {
                arg3.field6278 = (byte) (arg3.field6278 | 0x1);
            }
            arg3.field6296.field5689 = this.field6296.field5689;
            arg3.field6296.field5687 = this.field6296.field5687;
        } else if (class5.method23(arg0, this.field6308, -56)) {
            arg3.field6296 = this.field6296;
        } else {
            arg3.field6296 = null;
        }
        if (class269.method1862(-24050, this.field6308, arg0)) {
            if (arg2.field6261 == null || arg2.field6261.length < this.field6294) {
                arg3.field6261 = arg2.field6261 = new short[this.field6294];
            } else {
                arg3.field6261 = arg2.field6261;
            }
            for (int var12 = 0; var12 < this.field6294; var12++) {
                arg3.field6261[var12] = this.field6261[var12];
            }
        } else {
            arg3.field6261 = this.field6261;
        }
        if (class463.method2836(arg0, this.field6308, 89)) {
            if (arg2.field6298 == null || this.field6294 > arg2.field6298.length) {
                arg3.field6298 = arg2.field6298 = new byte[this.field6294];
            } else {
                arg3.field6298 = arg2.field6298;
            }
            for (int var13 = 0; var13 < this.field6294; var13++) {
                arg3.field6298[var13] = this.field6298[var13];
            }
        } else {
            arg3.field6298 = this.field6298;
        }
        if (arg1) {
            return null;
        }
        if (class229.method1555(arg0, this.field6308, (byte) 114)) {
            arg3.field6341 = arg2.field6341;
            if (arg4) {
                arg3.field6278 = (byte) (arg3.field6278 | 0x2);
            }
            arg3.field6341.field5689 = this.field6341.field5689;
            arg3.field6341.field5687 = this.field6341.field5687;
        } else if (class57.method371(arg0, this.field6308, 77)) {
            arg3.field6341 = this.field6341;
        } else {
            arg3.field6341 = null;
        }
        if (class181.method1269(arg1, this.field6308, arg0)) {
            if (arg2.field6254 == null || arg2.field6254.length < this.field6335) {
                int var14 = this.field6335;
                arg3.field6277 = arg2.field6277 = new short[var14];
                arg3.field6333 = arg2.field6333 = new short[var14];
                arg3.field6254 = arg2.field6254 = new short[var14];
            } else {
                arg3.field6254 = arg2.field6254;
                arg3.field6333 = arg2.field6333;
                arg3.field6277 = arg2.field6277;
            }
            if (this.field6315 == null) {
                for (int var15 = 0; var15 < this.field6335; var15++) {
                    arg3.field6254[var15] = this.field6254[var15];
                    arg3.field6333[var15] = this.field6333[var15];
                    arg3.field6277[var15] = this.field6277[var15];
                }
            } else {
                if (arg2.field6315 == null) {
                    arg2.field6315 = new class504();
                }
                class504 var16 = arg3.field6315 = arg2.field6315;
                if (var16.field7315 == null || this.field6335 > var16.field7315.length) {
                    int var17 = this.field6335;
                    var16.field7319 = new byte[var17];
                    var16.field7318 = new short[var17];
                    var16.field7315 = new short[var17];
                    var16.field7320 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field6335; var18++) {
                    arg3.field6254[var18] = this.field6254[var18];
                    arg3.field6333[var18] = this.field6333[var18];
                    arg3.field6277[var18] = this.field6277[var18];
                    var16.field7315[var18] = this.field6315.field7315[var18];
                    var16.field7320[var18] = this.field6315.field7320[var18];
                    var16.field7318[var18] = this.field6315.field7318[var18];
                    var16.field7319[var18] = this.field6315.field7319[var18];
                }
            }
            arg3.field6290 = this.field6290;
        } else {
            arg3.field6333 = this.field6333;
            arg3.field6290 = this.field6290;
            arg3.field6277 = this.field6277;
            arg3.field6254 = this.field6254;
            arg3.field6315 = this.field6315;
        }
        if (class262.method1833(30000, this.field6308, arg0)) {
            if (arg4) {
                arg3.field6278 = (byte) (arg3.field6278 | 0x4);
            }
            arg3.field6340 = arg2.field6340;
            arg3.field6340.field5687 = this.field6340.field5687;
            arg3.field6340.field5689 = this.field6340.field5689;
        } else if (class148.method1058(this.field6308, arg0, (byte) 110)) {
            arg3.field6340 = this.field6340;
        } else {
            arg3.field6340 = null;
        }
        if (class517.method3055((byte) -122, arg0, this.field6308)) {
            if (arg2.field6285 == null || this.field6294 > arg2.field6285.length) {
                int var19 = this.field6335;
                arg3.field6285 = arg2.field6285 = new float[var19];
                arg3.field6263 = arg2.field6263 = new float[var19];
            } else {
                arg3.field6263 = arg2.field6263;
                arg3.field6285 = arg2.field6285;
            }
            for (int var20 = 0; var20 < this.field6335; var20++) {
                arg3.field6285[var20] = this.field6285[var20];
                arg3.field6263[var20] = this.field6263[var20];
            }
        } else {
            arg3.field6285 = this.field6285;
            arg3.field6263 = this.field6263;
        }
        if (class155.method1130(103, this.field6308, arg0)) {
            if (arg4) {
                arg3.field6278 = (byte) (arg3.field6278 | 0x8);
            }
            arg3.field6280 = arg2.field6280;
            arg3.field6280.field5687 = this.field6280.field5687;
            arg3.field6280.field5689 = this.field6280.field5689;
        } else if (class51.method339(0, this.field6308, arg0)) {
            arg3.field6280 = this.field6280;
        } else {
            arg3.field6280 = null;
        }
        if (class541.method3179(arg0, (byte) -94, this.field6308)) {
            if (arg2.field6287 == null || arg2.field6287.length < this.field6294) {
                int var21 = this.field6294;
                arg3.field6246 = arg2.field6246 = new short[var21];
                arg3.field6297 = arg2.field6297 = new short[var21];
                arg3.field6287 = arg2.field6287 = new short[var21];
            } else {
                arg3.field6297 = arg2.field6297;
                arg3.field6246 = arg2.field6246;
                arg3.field6287 = arg2.field6287;
            }
            for (int var22 = 0; var22 < this.field6294; var22++) {
                arg3.field6287[var22] = this.field6287[var22];
                arg3.field6246[var22] = this.field6246[var22];
                arg3.field6297[var22] = this.field6297[var22];
            }
        } else {
            arg3.field6287 = this.field6287;
            arg3.field6297 = this.field6297;
            arg3.field6246 = this.field6246;
        }
        if (class103.method831(120, this.field6308, arg0)) {
            if (arg4) {
                arg3.field6278 = (byte) (arg3.field6278 | 0x10);
            }
            arg3.field6311 = arg2.field6311;
            arg3.field6311.field1128 = this.field6311.field1128;
        } else if (class34.method204(24448, this.field6308, arg0)) {
            arg3.field6311 = this.field6311;
        } else {
            arg3.field6311 = null;
        }
        if (class2.method12(arg0, 7963, this.field6308)) {
            if (arg2.field6257 == null || arg2.field6257.length < this.field6294) {
                int var23 = this.field6294;
                arg3.field6257 = arg2.field6257 = new short[var23];
            } else {
                arg3.field6257 = arg2.field6257;
            }
            for (int var24 = 0; var24 < this.field6294; var24++) {
                arg3.field6257[var24] = this.field6257[var24];
            }
        } else {
            arg3.field6257 = this.field6257;
        }
        if (!class331.method2161(-100, arg0, this.field6308)) {
            arg3.field6236 = this.field6236;
        } else if (arg2.field6236 == null || arg2.field6236.length < this.field6309) {
            int var26 = this.field6309;
            arg3.field6236 = arg2.field6236 = new class285[var26];
            for (int var27 = 0; var27 < this.field6309; var27++) {
                arg3.field6236[var27] = this.field6236[var27].method1917(false);
            }
        } else {
            arg3.field6236 = arg2.field6236;
            for (int var25 = 0; var25 < this.field6309; var25++) {
                arg3.field6236[var25].method1916(this.field6236[var25], (byte) -24);
            }
        }
        arg3.field6289 = this.field6289;
        arg3.field6267 = this.field6267;
        arg3.field6292 = this.field6292;
        arg3.field6337 = this.field6337;
        arg3.field6258 = this.field6258;
        if (this.field6329) {
            arg3.field6299 = this.field6299;
            arg3.field6253 = this.field6253;
            arg3.field6272 = this.field6272;
            arg3.field6243 = this.field6243;
            arg3.field6232 = this.field6232;
            arg3.field6248 = this.field6248;
            arg3.field6329 = true;
            arg3.field6256 = this.field6256;
        } else {
            arg3.field6329 = false;
        }
        arg3.field6235 = this.field6235;
        arg3.field6328 = this.field6328;
        arg3.field6274 = this.field6274;
        arg3.field6270 = this.field6270;
        arg3.field6262 = this.field6262;
        arg3.field6304 = this.field6304;
        return arg3;
    }

    @OriginalMember(owner = "client!qo", name = "ta", descriptor = "()I")
    public final int method674() {
        field6281++;
        if (!this.field6329) {
            this.method2652(121);
        }
        return this.field6272;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
    private final void method2647(int arg0) {
        field6233++;
        if (this.field6326 == 0) {
            return;
        }
        if (this.field6278 != 0) {
            this.method2649(true, false);
        }
        this.method2649(false, false);
        if (this.field6311 != null) {
            if (this.field6311.field1128 == null) {
                this.method2653((byte) 77, (this.field6278 & 0x10) != 0);
            }
            if (this.field6311.field1128 != null) {
                this.field6321.method1708(-8, this.field6340 != null);
                this.field6321.method1748(this.field6341, this.field6280, this.field6340, 0, this.field6296);
                int var2 = this.field6304.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field6304[var3];
                    int var5 = this.field6304[var3 + 1];
                    int var6 = this.field6257[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field6321.method1718(var6, 24295, this.field6340 != null);
                    this.field6321.method1762(var4 * 3, this.field6311.field1128, (byte) 126, 4, (var5 - var4) * 3);
                }
            }
        }
        if (arg0 != 2) {
            this.method640(35);
        }
        this.method2645(false);
    }

    @OriginalMember(owner = "client!qo", name = "pa", descriptor = "()I")
    public final int method643() {
        field6268++;
        return this.field6273;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "()[Lu;")
    public final class349[] method634() {
        field6242++;
        return this.field6262;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILgl;)V")
    private final void method2648(int arg0, class495 arg1) {
        if (this.field6337 != null) {
            for (int var3 = 0; var3 < this.field6337.length; var3++) {
                class476 var4 = this.field6337[var3];
                class476 var5 = var4;
                if (var4.field6964 != null) {
                    var5 = var4.field6964;
                }
                var5.field6953 = (int) ((float) this.field6324[var4.field6962] * arg1.field7230 + (float) this.field6322[var4.field6962] * arg1.field7233 + (float) this.field6252[var4.field6962] * arg1.field7235 + arg1.field7216);
                var5.field6969 = (int) ((float) this.field6324[var4.field6962] * arg1.field7209 + (float) this.field6322[var4.field6962] * arg1.field7231 + (float) this.field6252[var4.field6962] * arg1.field7236 + arg1.field7210);
                var5.field6954 = (int) ((float) this.field6324[var4.field6962] * arg1.field7237 + (float) this.field6322[var4.field6962] * arg1.field7214 + (float) this.field6252[var4.field6962] * arg1.field7221 + arg1.field7229);
                var5.field6967 = (int) ((float) this.field6324[var4.field6957] * arg1.field7230 + (float) this.field6322[var4.field6957] * arg1.field7233 + (float) this.field6252[var4.field6957] * arg1.field7235 + arg1.field7216);
                var5.field6972 = (int) ((float) this.field6324[var4.field6957] * arg1.field7209 + (float) this.field6322[var4.field6957] * arg1.field7231 + (float) this.field6252[var4.field6957] * arg1.field7236 + arg1.field7210);
                var5.field6960 = (int) ((float) this.field6324[var4.field6957] * arg1.field7237 + (float) this.field6322[var4.field6957] * arg1.field7214 + (float) this.field6252[var4.field6957] * arg1.field7221 + arg1.field7229);
                var5.field6961 = (int) ((float) this.field6324[var4.field6973] * arg1.field7230 + (float) this.field6322[var4.field6973] * arg1.field7233 + (float) this.field6252[var4.field6973] * arg1.field7235 + arg1.field7216);
                var5.field6968 = (int) ((float) this.field6324[var4.field6973] * arg1.field7209 + (float) this.field6322[var4.field6973] * arg1.field7231 + (float) this.field6252[var4.field6973] * arg1.field7236 + arg1.field7210);
                var5.field6971 = (int) ((float) this.field6324[var4.field6973] * arg1.field7237 + (float) this.field6322[var4.field6973] * arg1.field7214 + (float) this.field6252[var4.field6973] * arg1.field7221 + arg1.field7229);
            }
        }
        field6291++;
        if (this.field6262 != null) {
            for (int var6 = 0; var6 < this.field6262.length; var6++) {
                class349 var7 = this.field6262[var6];
                class349 var8 = var7;
                if (var7.field5207 != null) {
                    var8 = var7.field5207;
                }
                if (var7.field5200 == null) {
                    var7.field5200 = arg1.method950();
                } else {
                    var7.field5200.method962(arg1);
                }
                var8.field5203 = (int) ((float) this.field6324[var7.field5209] * arg1.field7230 + (float) this.field6322[var7.field5209] * arg1.field7233 + (float) this.field6252[var7.field5209] * arg1.field7235 + arg1.field7216);
                var8.field5210 = (int) ((float) this.field6324[var7.field5209] * arg1.field7209 + (float) this.field6322[var7.field5209] * arg1.field7231 + (float) this.field6252[var7.field5209] * arg1.field7236 + arg1.field7210);
                var8.field5202 = (int) ((float) this.field6324[var7.field5209] * arg1.field7237 + (float) this.field6322[var7.field5209] * arg1.field7214 + (float) this.field6252[var7.field5209] * arg1.field7221 + arg1.field7229);
            }
        }
        if (arg0 != 1956689935) {
            this.field6270 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BIZ)Le;")
    public final class289 method669(byte arg0, int arg1, boolean arg2) {
        field6241++;
        class425 var4;
        class425 var5;
        if (arg0 == 1) {
            var4 = this.field6321.field4046;
            var5 = this.field6321.field4018;
        } else if (arg0 == 2) {
            var5 = this.field6321.field4049;
            var4 = this.field6321.field4015;
        } else if (arg0 == 3) {
            var4 = this.field6321.field3951;
            var5 = this.field6321.field3974;
        } else if (arg0 == 4) {
            var5 = this.field6321.field4009;
            var4 = this.field6321.field4037;
        } else if (arg0 == 5) {
            var4 = this.field6321.field3989;
            var5 = this.field6321.field3973;
        } else {
            var5 = var4 = new class425(this.field6321);
        }
        return this.method2646(arg1, false, var4, var5, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!qo", name = "ma", descriptor = "(I)V")
    public final void method667(int arg0) {
        field6275++;
        int var2 = class58.field891[arg0];
        int var3 = class58.field889[arg0];
        for (int var4 = 0; var4 < this.field6330; var4++) {
            int var5 = this.field6324[var4] * var2 + this.field6322[var4] * var3 >> 15;
            this.field6324[var4] = this.field6324[var4] * var3 - this.field6322[var4] * var2 >> 15;
            this.field6322[var4] = var5;
        }
        this.field6329 = false;
        if (this.field6296 != null) {
            this.field6296.field5689 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "L", descriptor = "()V")
    public final void method672() {
        for (int var1 = 0; var1 < this.field6330; var1++) {
            this.field6324[var1] = -this.field6324[var1];
        }
        field6327++;
        for (int var2 = 0; var2 < this.field6335; var2++) {
            this.field6277[var2] = (short) (-this.field6277[var2]);
        }
        for (int var3 = 0; var3 < this.field6294; var3++) {
            short var4 = this.field6287[var3];
            this.field6287[var3] = this.field6297[var3];
            this.field6297[var3] = var4;
        }
        if (this.field6340 == null && this.field6341 != null) {
            this.field6341.field5689 = null;
        }
        if (this.field6340 != null) {
            this.field6340.field5689 = null;
        }
        if (this.field6311 != null) {
            this.field6311.field1128 = null;
        }
        this.field6329 = false;
        if (this.field6296 != null) {
            this.field6296.field5689 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZZ)V")
    private final void method2649(boolean arg0, boolean arg1) {
        field6318++;
        boolean var3 = this.field6341 != null && this.field6341.field5689 == null;
        boolean var4 = this.field6340 != null && this.field6340.field5689 == null;
        boolean var5 = this.field6296 != null && this.field6296.field5689 == null;
        boolean var6 = this.field6280 != null && this.field6280.field5689 == null;
        if (arg0) {
            var6 &= (this.field6278 & 0x8) != 0;
            var5 &= (this.field6278 & 0x1) != 0;
            var4 &= (this.field6278 & 0x4) != 0;
            var3 &= (this.field6278 & 0x2) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field6335 * var7 > this.field6321.field3954.field2973.length) {
            this.field6321.field3954 = new class268((this.field6335 + 100) * var7);
        } else {
            this.field6321.field3954.field2982 = 0;
        }
        class268 var12 = this.field6321.field3954;
        if (var5) {
            if (this.field6321.field3990) {
                for (int var21 = 0; var21 < this.field6330; var21++) {
                    int var22 = NativeStream.floatToRawIntBits((float) this.field6322[var21]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field6252[var21]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field6324[var21]);
                    int var25 = this.field6258[var21];
                    int var26 = this.field6258[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field6289[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field2982 = var7 * var28;
                        var12.method1348((byte) -65, var22);
                        var12.method1348((byte) -65, var23);
                        var12.method1348((byte) -65, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field6330; var13++) {
                    int var14 = NativeStream.floatToRawIntBits((float) this.field6322[var13]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field6252[var13]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field6324[var13]);
                    int var17 = this.field6258[var13];
                    int var18 = this.field6258[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field6289[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field2982 = var7 * var20;
                        var12.method1365(var14, (byte) 119);
                        var12.method1365(var15, (byte) 120);
                        var12.method1365(var16, (byte) 115);
                    }
                }
            }
        }
        if (var3) {
            if (this.field6340 == null) {
                short[] var29;
                byte[] var30;
                short[] var31;
                short[] var32;
                if (this.field6315 == null) {
                    var29 = this.field6277;
                    var30 = this.field6290;
                    var31 = this.field6333;
                    var32 = this.field6254;
                } else {
                    var30 = this.field6315.field7319;
                    var29 = this.field6315.field7318;
                    var31 = this.field6315.field7320;
                    var32 = this.field6315.field7315;
                }
                float var33 = this.field6321.field3986[0];
                float var34 = this.field6321.field3986[1];
                float var35 = this.field6321.field3986[2];
                float var36 = this.field6321.field3965;
                float var37 = this.field6321.field3983 * 768.0F / (float) this.field6273;
                float var38 = this.field6321.field4017 * 768.0F / (float) this.field6273;
                for (int var39 = 0; var39 < this.field6294; var39++) {
                    int var40 = this.method2650(this.field6257[var39], this.field6261[var39], this.field6295, 26020, this.field6298[var39]);
                    short var41 = this.field6287[var39];
                    float var42 = (float) (var40 >> 8 & 0xFF) * this.field6321.field3982;
                    float var43 = (float) (var40 >> 16 & 0xFF) * this.field6321.field3995;
                    float var44 = (float) (var40 >>> 24) * this.field6321.field4021;
                    short var45 = (short) var30[var41];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var29[var41] * var35 + (float) var31[var41] * var34 + (float) var32[var41] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var29[var41] * var35 + (float) var31[var41] * var34 + (float) var32[var41] * var33) / (float) (var45 * 256);
                    }
                    float var47 = var36 + var46 * ((var46 < 0.0F) ? var38 : var37);
                    int var48 = (int) (var44 * var47);
                    int var49 = (int) (var43 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var42 * var47);
                    var12.field2982 = var7 * var41 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method1381(var48, (byte) 106);
                    var12.method1381(var49, (byte) 126);
                    var12.method1381(var50, (byte) 115);
                    var12.method1381(255 - (this.field6298[var39] & 0xFF), (byte) 95);
                    short var51 = this.field6246[var39];
                    short var52 = (short) var30[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var29[var51] * var35 + (float) var31[var51] * var34 + (float) var32[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var29[var51] * var35 + (float) var31[var51] * var34 + (float) var32[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var36 + (var53 < 0.0F ? var38 : var37) * var53;
                    int var55 = (int) (var44 * var54);
                    int var56 = (int) (var43 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var42 * var54);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field2982 = var7 * var51 + var9;
                    var12.method1381(var55, (byte) 111);
                    var12.method1381(var56, (byte) 118);
                    var12.method1381(var57, (byte) 87);
                    var12.method1381(255 - (this.field6298[var39] & 0xFF), (byte) 101);
                    short var58 = this.field6297[var39];
                    short var59 = (short) var30[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var29[var58] * var35 + (float) var31[var58] * var34 + (float) var32[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var29[var58] * var35 + (float) var31[var58] * var34 + (float) var32[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var60 * ((var60 < 0.0F) ? var38 : var37) + var36;
                    int var62 = (int) (var44 * var61);
                    int var63 = (int) (var43 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    int var64 = (int) (var42 * var61);
                    var12.field2982 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method1381(var62, (byte) 88);
                    var12.method1381(var63, (byte) 124);
                    var12.method1381(var64, (byte) 100);
                    var12.method1381(255 - (this.field6298[var39] & 0xFF), (byte) 100);
                }
            } else {
                for (int var65 = 0; var65 < this.field6294; var65++) {
                    int var66 = this.method2650(this.field6257[var65], this.field6261[var65], this.field6295, 26020, this.field6298[var65]);
                    var12.field2982 = this.field6287[var65] * var7 + var9;
                    var12.method1348((byte) -65, var66);
                    var12.field2982 = this.field6246[var65] * var7 + var9;
                    var12.method1348((byte) -65, var66);
                    var12.field2982 = this.field6297[var65] * var7 + var9;
                    var12.method1348((byte) -65, var66);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field6315 == null) {
                var67 = this.field6277;
                var68 = this.field6290;
                var69 = this.field6333;
                var70 = this.field6254;
            } else {
                var67 = this.field6315.field7318;
                var70 = this.field6315.field7315;
                var69 = this.field6315.field7320;
                var68 = this.field6315.field7319;
            }
            float var71 = 3.0F / (float) this.field6273;
            float var72 = 3.0F / (float) (this.field6273 / 2 + this.field6273);
            var12.field2982 = var10;
            if (this.field6321.field3990) {
                for (int var76 = 0; var76 < this.field6335; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1857(false, (float) var70[var76] * var72);
                        var12.method1857(false, (float) var69[var76] * var72);
                        var12.method1857(false, (float) var67[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1857(false, (float) var70[var76] * var78);
                        var12.method1857(arg1, (float) var69[var76] * var78);
                        var12.method1857(false, (float) var67[var76] * var78);
                    }
                    var12.field2982 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field6335; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1859((float) var70[var73] * var72, 0);
                        var12.method1859((float) var69[var73] * var72, 0);
                        var12.method1859((float) var67[var73] * var72, 0);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1859((float) var70[var73] * var75, 0);
                        var12.method1859((float) var69[var73] * var75, 0);
                        var12.method1859((float) var67[var73] * var75, 0);
                    }
                    var12.field2982 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field2982 = var11;
            if (this.field6321.field3990) {
                for (int var80 = 0; var80 < this.field6335; var80++) {
                    var12.method1857(false, this.field6285[var80]);
                    var12.method1857(false, this.field6263[var80]);
                    var12.field2982 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field6335; var79++) {
                    var12.method1859(this.field6285[var79], 0);
                    var12.method1859(this.field6263[var79], 0);
                    var12.field2982 += var7 - 8;
                }
            }
        }
        if (arg1) {
            this.field6236 = null;
        }
        var12.field2982 = this.field6335 * var7;
        class121 var81;
        if (arg0) {
            if (this.field6245 == null) {
                this.field6245 = this.field6321.method1735(var12.field2973, true, var7, var12.field2982, 32);
            } else {
                this.field6245.method903(var12.field2982, var7, 11907, var12.field2973);
            }
            var81 = this.field6245;
            this.field6278 = 0;
        } else {
            var81 = this.field6321.method1735(var12.field2973, false, var7, var12.field2982, 32);
            this.field6312 = true;
        }
        if (var5) {
            this.field6296.field5689 = var81;
            this.field6296.field5687 = var8;
        }
        if (var6) {
            this.field6280.field5689 = var81;
            this.field6280.field5687 = var11;
        }
        if (var3) {
            this.field6341.field5687 = var9;
            this.field6341.field5689 = var81;
        }
        if (var4) {
            this.field6340.field5689 = var81;
            this.field6340.field5687 = var10;
        }
    }

    @OriginalMember(owner = "client!qo", name = "Z", descriptor = "()I")
    public final int method630() {
        field6332++;
        if (!this.field6329) {
            this.method2652(125);
        }
        return this.field6248;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(SIIIB)I")
    private final int method2650(short arg0, int arg1, int arg2, int arg3, byte arg4) {
        field6336++;
        int var6 = class203.field3141[class412.method2590(arg2, arg1, (byte) 70)];
        if (arg3 != 26020) {
            this.method657();
        }
        if (arg0 != -1) {
            class420 var7 = this.field6321.field4588.method938(28923, arg0 & 0xFFFF);
            int var8 = var7.field6165 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 <= 127) {
                    var9 = arg2 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field6162 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var14 & 0xFF00) + (var15 >> 8) + (var13 << 8 & 0xFF00E3);
            }
        }
        return (var6 << 8) + 255 - (arg4 & 0xFF);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lc;Lwg;I)V")
    public final void method673(class517 arg0, class41 arg1, int arg2) {
        field6286++;
        if (this.field6335 == 0) {
            return;
        }
        class495 var4 = this.field6321.field3948;
        class495 var5 = (class495) arg0;
        if (!this.field6329) {
            this.method2652(115);
        }
        this.method2648(1956689935, var5);
        class37.field477 = var4.field7237 * var5.field7229 + var4.field7221 * var5.field7210 + var4.field7214 * var5.field7216 + var4.field7229;
        class1.field3 = var4.field7237 * var5.field7221 + var4.field7221 * var5.field7236 + var4.field7214 * var5.field7235;
        float var6 = (float) this.field6232 * class1.field3 + class37.field477;
        float var7 = (float) this.field6256 * class1.field3 + class37.field477;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) this.field6299 + var6;
            var8 = var7 - (float) this.field6299;
        } else {
            var8 = var6 - (float) this.field6299;
            var9 = (float) this.field6299 + var7;
        }
        if ((var8 >= this.field6321.field4041) || ((float) this.field6321.field4013 >= var9)) {
            return;
        }
        class431.field6389 = var4.field7230 * var5.field7221 + var4.field7235 * var5.field7236 + var4.field7233 * var5.field7235;
        class191.field2945 = var4.field7230 * var5.field7229 + var4.field7235 * var5.field7210 + var4.field7233 * var5.field7216 + var4.field7216;
        float var10 = (float) this.field6232 * class431.field6389 + class191.field2945;
        float var11 = (float) this.field6256 * class431.field6389 + class191.field2945;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) (-this.field6299) + var11) * (float) this.field6321.field4011;
            var13 = ((float) this.field6299 + var10) * (float) this.field6321.field4011;
        } else {
            var13 = ((float) this.field6299 + var11) * (float) this.field6321.field4011;
            var12 = ((float) (-this.field6299) + var10) * (float) this.field6321.field4011;
        }
        if ((var12 / var9 >= this.field6321.field4032) || (var13 / var9 <= this.field6321.field4012)) {
            return;
        }
        class295.field4545 = var4.field7209 * var5.field7221 + var4.field7236 * var5.field7236 + var4.field7231 * var5.field7235;
        class269.field4268 = var4.field7209 * var5.field7229 + var4.field7236 * var5.field7210 + var4.field7231 * var5.field7216 + var4.field7210;
        float var14 = (float) this.field6232 * class295.field4545 + class269.field4268;
        float var15 = (float) this.field6256 * class295.field4545 + class269.field4268;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var16 = ((float) this.field6299 + var14) * (float) this.field6321.field4055;
            var17 = ((float) (-this.field6299) + var15) * (float) this.field6321.field4055;
        } else {
            var16 = ((float) this.field6299 + var15) * (float) this.field6321.field4055;
            var17 = (var14 - (float) this.field6299) * (float) this.field6321.field4055;
        }
        if ((var17 / var9 >= this.field6321.field4022) || (var16 / var9 <= this.field6321.field4023)) {
            return;
        }
        if (arg1 != null || this.field6267 != null) {
            class469.field6892 = var4.field7230 * var5.field7237 + var4.field7235 * var5.field7209 + var4.field7233 * var5.field7230;
            class404.field5965 = var4.field7237 * var5.field7214 + var4.field7221 * var5.field7231 + var4.field7214 * var5.field7233;
            class504.field7323 = var4.field7209 * var5.field7214 + var4.field7236 * var5.field7231 + var4.field7231 * var5.field7233;
            class227.field3444 = var4.field7209 * var5.field7237 + var4.field7236 * var5.field7209 + var4.field7231 * var5.field7230;
            class355.field5262 = var4.field7237 * var5.field7237 + var4.field7221 * var5.field7209 + var4.field7214 * var5.field7230;
            class240.field3601 = var4.field7230 * var5.field7214 + var4.field7235 * var5.field7231 + var4.field7233 * var5.field7233;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field6272 + this.field6243 >> 1;
            int var21 = this.field6253 + this.field6248 >> 1;
            int var22 = (int) ((float) var21 * class469.field6892 + (float) this.field6232 * class431.field6389 + (float) var20 * class240.field3601 + class191.field2945);
            int var23 = (int) ((float) var21 * class227.field3444 + (float) this.field6232 * class295.field4545 + (float) var20 * class504.field7323 + class269.field4268);
            int var24 = (int) ((float) var21 * class355.field5262 + (float) this.field6232 * class1.field3 + (float) var20 * class404.field5965 + class37.field477);
            if (var24 >= this.field6321.field4013) {
                arg1.field668 = this.field6321.field4011 * var22 / var24 + this.field6321.field3997;
                arg1.field671 = this.field6321.field4055 * var23 / var24 + this.field6321.field3953;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class469.field6892 + (float) this.field6256 * class431.field6389 + (float) var20 * class240.field3601 + class191.field2945);
            int var26 = (int) ((float) var21 * class227.field3444 + (float) this.field6256 * class295.field4545 + (float) var20 * class504.field7323 + class269.field4268);
            int var27 = (int) ((float) var21 * class355.field5262 + (float) this.field6256 * class1.field3 + (float) var20 * class404.field5965 + class37.field477);
            if (this.field6321.field4013 <= var27) {
                arg1.field672 = this.field6321.field4055 * var26 / var27 + this.field6321.field3953;
                arg1.field669 = this.field6321.field4011 * var25 / var27 + this.field6321.field3997;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field6321.field4013 && var27 < this.field6321.field4013) {
                    var19 = false;
                } else if (var24 < this.field6321.field4013) {
                    int var28 = (var27 - this.field6321.field4013 << 16) / (var27 - var24);
                    int var29 = var25 + ((var25 - var22) * var28 >> 16);
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field668 = this.field6321.field3997 + (this.field6321.field4011 * var29 / this.field6321.field4013);
                    arg1.field671 = this.field6321.field4055 * var30 / this.field6321.field4013 + this.field6321.field3953;
                } else if (this.field6321.field4013 > var27) {
                    int var31 = (var24 - this.field6321.field4013 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field668 = this.field6321.field4011 * var32 / this.field6321.field4013 + this.field6321.field3997;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field671 = this.field6321.field3953 + (this.field6321.field4055 * var33 / this.field6321.field4013);
                }
            }
            if (var19) {
                if (var24 <= var27) {
                    arg1.field670 = (this.field6299 + var25) * this.field6321.field4011 / var27 + this.field6321.field3997 - arg1.field669;
                } else {
                    arg1.field670 = (var22 + this.field6299) * this.field6321.field4011 / var24 + this.field6321.field3997 - arg1.field668;
                }
                arg1.field673 = true;
            }
        }
        this.field6321.method1724(-28440);
        this.field6321.method1747(true, var5);
        this.method2647(2);
        this.field6321.method1757((byte) 45);
        this.method2655(-127);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIFFILfe;IIJ)S")
    private final short method2651(int arg0, int arg1, int arg2, float arg3, float arg4, int arg5, class153 arg6, int arg7, int arg8, long arg9) {
        field6265++;
        int var12 = this.field6258[arg5];
        int var13 = this.field6258[arg5 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field6289[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class381.field5602[var15] == arg9) {
                return (short) (var16 - 1);
            }
        }
        this.field6289[var14] = (short) (this.field6335 + 1);
        if (arg2 < 106) {
            this.field6315 = null;
        }
        class381.field5602[var14] = arg9;
        this.field6254[this.field6335] = (short) arg0;
        this.field6333[this.field6335] = (short) arg7;
        this.field6277[this.field6335] = (short) arg8;
        this.field6290[this.field6335] = (byte) arg1;
        this.field6285[this.field6335] = arg4;
        this.field6263[this.field6335] = arg3;
        return (short) (this.field6335++);
    }

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "(III)V")
    public final void method676(int arg0, int arg1, int arg2) {
        field6255++;
        for (int var4 = 0; var4 < this.field6330; var4++) {
            if (arg0 != 128) {
                this.field6322[var4] = this.field6322[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field6252[var4] = this.field6252[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field6324[var4] = this.field6324[var4] * arg2 >> 7;
            }
        }
        this.field6329 = false;
        if (this.field6296 != null) {
            this.field6296.field5689 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
    private final void method2652(int arg0) {
        field6303++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        if (arg0 <= 111) {
            return;
        }
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field6330; var10++) {
            int var11 = this.field6322[var10];
            int var12 = this.field6252[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = this.field6324[var10];
            if (var13 < var4) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field6232 = (short) var3;
        this.field6253 = (short) var7;
        this.field6272 = (short) var2;
        this.field6248 = (short) var4;
        this.field6243 = (short) var5;
        this.field6256 = (short) var6;
        this.field6299 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field6329 = true;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BZ)V")
    private final void method2653(byte arg0, boolean arg1) {
        int var3 = 80 % ((arg0 - 28) / 42);
        if (this.field6321.field3954.field2973.length < this.field6326 * 6) {
            this.field6321.field3954 = new class268((this.field6326 + 100) * 6);
        } else {
            this.field6321.field3954.field2982 = 0;
        }
        field6338++;
        class268 var4 = this.field6321.field3954;
        if (this.field6321.field3990) {
            for (int var6 = 0; var6 < this.field6326; var6++) {
                var4.method1364(this.field6287[var6], true);
                var4.method1364(this.field6246[var6], true);
                var4.method1364(this.field6297[var6], true);
            }
        } else {
            for (int var5 = 0; var5 < this.field6326; var5++) {
                var4.method1366(true, this.field6287[var5]);
                var4.method1366(true, this.field6246[var5]);
                var4.method1366(true, this.field6297[var5]);
            }
        }
        if (var4.field2982 == 0) {
            return;
        }
        if (arg1) {
            if (this.field6342 == null) {
                this.field6342 = this.field6321.method1761(var4.field2982, true, 5123, (byte) -82, var4.field2973);
            } else {
                this.field6342.method114(var4.field2973, 20, 5123, var4.field2982);
            }
            this.field6311.field1128 = this.field6342;
        } else {
            this.field6311.field1128 = this.field6321.method1761(var4.field2982, false, 5123, (byte) -127, var4.field2973);
        }
        if (!arg1) {
            this.field6312 = true;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lag;B)V")
    private final void method2654(class355 arg0, byte arg1) {
        field6260++;
        if (this.field6321.field4066.length < this.field6335) {
            this.field6321.field4069 = new int[this.field6335];
            this.field6321.field4066 = new int[this.field6335];
        }
        int[] var3 = this.field6321.field4066;
        int[] var4 = this.field6321.field4069;
        int var5 = -26 % ((43 - arg1) / 46);
        for (int var6 = 0; var6 < this.field6330; var6++) {
            int var17 = (this.field6322[var6] - (this.field6252[var6] * this.field6321.field3958 >> 8) >> this.field6321.field3929) - arg0.field5250;
            int var18 = (this.field6324[var6] - (this.field6252[var6] * this.field6321.field3968 >> 8) >> this.field6321.field3929) - arg0.field5253;
            int var19 = this.field6258[var6];
            int var20 = this.field6258[var6 + 1];
            for (int var21 = var19; var21 < var20; var21++) {
                int var22 = this.field6289[var21] - 1;
                if (var22 == -1) {
                    break;
                }
                var3[var22] = var17;
                var4[var22] = var18;
            }
        }
        for (int var7 = 0; var7 < this.field6326; var7++) {
            if (this.field6298 == null || this.field6298[var7] <= 128) {
                short var8 = this.field6287[var7];
                short var9 = this.field6246[var7];
                short var10 = this.field6297[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var3[var10];
                int var14 = var4[var8];
                int var15 = var4[var9];
                int var16 = var4[var10];
                if ((var15 - var16) * (var11 - var12) - ((var15 - var14) * (var13 - var12)) > 0) {
                    arg0.method2262(0, var14, var16, var13, var11, var15, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "()[Lod;")
    public final class476[] method665() {
        field6300++;
        return this.field6337;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method638(int arg0, int arg1, class517 arg2, boolean arg3) {
        field6271++;
        class495 var5 = (class495) arg2;
        class495 var6 = this.field6321.field3948;
        float var7 = var5.field7229 * var6.field7230 + var5.field7216 * var6.field7233 + var5.field7210 * var6.field7235 + var6.field7216;
        float var8 = var5.field7229 * var6.field7209 + var5.field7216 * var6.field7231 + var5.field7210 * var6.field7236 + var6.field7210;
        float var9 = var5.field7229 * var6.field7237 + var5.field7216 * var6.field7214 + var5.field7210 * var6.field7221 + var6.field7229;
        class295.field4545 = var5.field7221 * var6.field7209 + var5.field7236 * var6.field7236 + var5.field7235 * var6.field7231;
        class431.field6389 = var5.field7221 * var6.field7230 + var5.field7236 * var6.field7235 + var5.field7235 * var6.field7233;
        class240.field3601 = var5.field7214 * var6.field7230 + var5.field7233 * var6.field7233 + var5.field7231 * var6.field7235;
        class504.field7323 = var5.field7214 * var6.field7209 + var5.field7233 * var6.field7231 + var5.field7231 * var6.field7236;
        class404.field5965 = var5.field7214 * var6.field7237 + var5.field7233 * var6.field7214 + var5.field7231 * var6.field7221;
        class355.field5262 = var5.field7237 * var6.field7237 + var5.field7230 * var6.field7214 + var5.field7209 * var6.field7221;
        class227.field3444 = var5.field7237 * var6.field7209 + var5.field7230 * var6.field7231 + var5.field7209 * var6.field7236;
        class469.field6892 = var5.field7237 * var6.field7230 + var5.field7230 * var6.field7233 + var5.field7209 * var6.field7235;
        class1.field3 = var5.field7221 * var6.field7237 + var5.field7236 * var6.field7221 + var5.field7235 * var6.field7214;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field6321.field4011;
        int var16 = this.field6321.field4055;
        if (!this.field6329) {
            this.method2652(123);
        }
        class16.field173[0] = this.field6272;
        class30.field363[0] = this.field6232;
        class484.field7095[0] = this.field6248;
        class16.field173[1] = this.field6243;
        class30.field363[1] = this.field6232;
        class484.field7095[1] = this.field6248;
        class16.field173[2] = this.field6272;
        class30.field363[2] = this.field6256;
        class16.field173[3] = this.field6243;
        class484.field7095[2] = this.field6248;
        class30.field363[3] = this.field6256;
        class16.field173[4] = this.field6272;
        class484.field7095[3] = this.field6248;
        class30.field363[4] = this.field6232;
        class484.field7095[4] = this.field6253;
        class16.field173[5] = this.field6243;
        class30.field363[5] = this.field6232;
        class484.field7095[5] = this.field6253;
        class16.field173[6] = this.field6272;
        class30.field363[6] = this.field6256;
        class484.field7095[6] = this.field6253;
        class16.field173[7] = this.field6243;
        class30.field363[7] = this.field6256;
        class484.field7095[7] = this.field6253;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class16.field173[var17];
            float var39 = (float) class484.field7095[var17];
            float var40 = (float) class30.field363[var17];
            float var41 = class227.field3444 * var39 + class504.field7323 * var38 + class295.field4545 * var40 + var8;
            float var42 = class355.field5262 * var39 + class404.field5965 * var38 + class1.field3 * var40 + var9;
            float var43 = class469.field6892 * var39 + class431.field6389 * var40 + class240.field3601 * var38 + var7;
            if ((float) this.field6321.field4013 <= var42) {
                float var44 = (float) var15 * var43 / var42 + (float) this.field6321.field3997;
                if (var11 > var44) {
                    var11 = var44;
                }
                float var45 = (float) var16 * var41 / var42 + (float) this.field6321.field3953;
                if (var12 < var44) {
                    var12 = var44;
                }
                if (var45 > var14) {
                    var14 = var45;
                }
                var10 = true;
                if (var13 > var45) {
                    var13 = var45;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && (float) arg0 < var12 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field6335 > this.field6321.field4066.length) {
                this.field6321.field4066 = new int[this.field6335];
                this.field6321.field4069 = new int[this.field6335];
            }
            int[] var18 = this.field6321.field4066;
            int[] var19 = this.field6321.field4069;
            for (int var20 = 0; var20 < this.field6330; var20++) {
                float var22 = (float) this.field6322[var20];
                float var23 = (float) this.field6324[var20];
                float var24 = (float) this.field6252[var20];
                float var25 = class469.field6892 * var23 + class431.field6389 * var24 + class240.field3601 * var22 + var7;
                float var26 = class227.field3444 * var23 + class504.field7323 * var22 + class295.field4545 * var24 + var8;
                float var27 = class355.field5262 * var23 + class404.field5965 * var22 + class1.field3 * var24 + var9;
                if (var27 >= (float) this.field6321.field4013) {
                    int var28 = (int) ((float) var15 * var25 / var27 + (float) this.field6321.field3997);
                    int var29 = (int) ((float) var16 * var26 / var27 + (float) this.field6321.field3953);
                    int var30 = this.field6258[var20];
                    int var31 = this.field6258[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field6289[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var18[var33] = var28;
                        var19[var33] = var29;
                    }
                } else {
                    int var34 = this.field6258[var20];
                    int var35 = this.field6258[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field6289[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[this.field6289[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field6294; var21++) {
                if (var18[this.field6287[var21]] != -999999 && var18[this.field6246[var21]] != -999999 && var18[this.field6297[var21]] != -999999 && this.method2643(var19[this.field6297[var21]], arg1, var18[this.field6246[var21]], var19[this.field6246[var21]], arg0, var19[this.field6287[var21]], var18[this.field6297[var21]], var18[this.field6287[var21]], (byte) 103)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qo", name = "K", descriptor = "(I)V")
    public final void method639(int arg0) {
        field6323++;
        int var2 = class58.field891[arg0];
        int var3 = class58.field889[arg0];
        for (int var4 = 0; var4 < this.field6330; var4++) {
            int var5 = this.field6322[var4] * var3 + this.field6252[var4] * var2 >> 15;
            this.field6252[var4] = this.field6252[var4] * var3 - (this.field6322[var4] * var2) >> 15;
            this.field6322[var4] = var5;
        }
        if (this.field6296 != null) {
            this.field6296.field5689 = null;
        }
        this.field6329 = false;
    }

    @OriginalMember(owner = "client!qo", name = "W", descriptor = "(I)V")
    public final void method666(int arg0) {
        field6247++;
        int var2 = class58.field891[arg0];
        int var3 = class58.field889[arg0];
        for (int var4 = 0; var4 < this.field6330; var4++) {
            int var5 = this.field6252[var4] * var3 - (this.field6324[var4] * var2) >> 15;
            this.field6324[var4] = this.field6324[var4] * var3 + this.field6252[var4] * var2 >> 15;
            this.field6252[var4] = var5;
        }
        if (this.field6296 != null) {
            this.field6296.field5689 = null;
        }
        this.field6329 = false;
    }

    @OriginalMember(owner = "client!qo", name = "EA", descriptor = "(Li;)Li;")
    public final class200 method636(class200 arg0) {
        field6319++;
        if (this.field6335 == 0) {
            return null;
        }
        if (!this.field6329) {
            this.method2652(112);
        }
        int var2;
        int var3;
        if (this.field6321.field3958 > 0) {
            var2 = this.field6272 - (this.field6321.field3958 * this.field6256 >> 8) >> this.field6321.field3929;
            var3 = this.field6243 - (this.field6321.field3958 * this.field6232 >> 8) >> this.field6321.field3929;
        } else {
            var2 = this.field6272 - (this.field6321.field3958 * this.field6232 >> 8) >> this.field6321.field3929;
            var3 = this.field6243 - (this.field6321.field3958 * this.field6256 >> 8) >> this.field6321.field3929;
        }
        int var4;
        int var5;
        if (this.field6321.field3968 <= 0) {
            var4 = this.field6248 - (this.field6321.field3968 * this.field6232 >> 8) >> this.field6321.field3929;
            var5 = this.field6253 - (this.field6321.field3968 * this.field6256 >> 8) >> this.field6321.field3929;
        } else {
            var4 = this.field6248 - (this.field6321.field3968 * this.field6256 >> 8) >> this.field6321.field3929;
            var5 = this.field6253 - (this.field6321.field3968 * this.field6232 >> 8) >> this.field6321.field3929;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class355 var8 = (class355) arg0;
        class355 var9;
        if (var8 != null && var8.method2263(var6, var7, true)) {
            var9 = var8;
            var8.method2269((byte) 79);
        } else {
            var9 = new class355(this.field6321, var6, var7);
        }
        var9.method2266(var5, false, var3, var2, var4);
        this.method2654(var9, (byte) -119);
        return var9;
    }

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "(I)V")
    public final void method631(int arg0) {
        field6244++;
        int var2 = class58.field891[arg0];
        int var3 = class58.field889[arg0];
        for (int var4 = 0; var4 < this.field6330; var4++) {
            int var7 = this.field6324[var4] * var2 + this.field6322[var4] * var3 >> 15;
            this.field6324[var4] = this.field6324[var4] * var3 - (this.field6322[var4] * var2) >> 15;
            this.field6322[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field6335; var5++) {
            int var6 = this.field6277[var5] * var2 + this.field6254[var5] * var3 >> 15;
            this.field6277[var5] = (short) (this.field6277[var5] * var3 - (this.field6254[var5] * var2) >> 15);
            this.field6254[var5] = (short) var6;
        }
        if (this.field6340 == null && this.field6341 != null) {
            this.field6341.field5689 = null;
        }
        if (this.field6340 != null) {
            this.field6340.field5689 = null;
        }
        this.field6329 = false;
        if (this.field6296 != null) {
            this.field6296.field5689 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "()V")
    public final void method657() {
        field6301++;
        if (this.field6335 <= 0 || this.field6326 <= 0) {
            return;
        }
        this.method2649(false, false);
        if ((this.field6278 & 0x10) == 0 && this.field6311.field1128 == null) {
            this.method2653((byte) -19, false);
        }
        this.method2645(false);
    }

    @OriginalMember(owner = "client!qo", name = "X", descriptor = "(I)V")
    public final void method640(int arg0) {
        if (this.field6341 != null) {
            this.field6341.field5689 = null;
        }
        field6317++;
        this.field6295 = (short) arg0;
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V")
    private final void method2655(int arg0) {
        if (arg0 >= -81) {
            this.method658();
        }
        field6276++;
        if (this.field6267 == null) {
            return;
        }
        class495 var2 = this.field6321.field3922;
        float var3 = this.field6321.method575();
        float var4 = this.field6321.method498();
        this.field6321.method1712(255);
        this.field6321.method509(false);
        this.field6321.method1708(-8, false);
        this.field6321.method1748(null, this.field6321.field4053, null, 0, this.field6321.field3956);
        for (int var5 = 0; var5 < this.field6309; var5++) {
            class315 var6 = this.field6267[var5];
            class285 var7 = this.field6236[var5];
            if (!var6.field4807 || !this.field6321.method544()) {
                float var8 = (float) (this.field6322[var6.field4809] + this.field6322[var6.field4802] + this.field6322[var6.field4798]) * 0.3333333F;
                float var9 = (float) (this.field6252[var6.field4802] + this.field6252[var6.field4798] + this.field6252[var6.field4809]) * 0.3333333F;
                float var10 = (float) (this.field6324[var6.field4809] + this.field6324[var6.field4802] + this.field6324[var6.field4798]) * 0.3333333F;
                float var11 = class469.field6892 * var10 + class431.field6389 * var9 + class240.field3601 * var8 + class191.field2945;
                float var12 = class227.field3444 * var10 + class504.field7323 * var8 + class295.field4545 * var9 + class269.field4268;
                float var13 = class355.field5262 * var10 + class404.field5965 * var8 + class1.field3 * var9 + class37.field477;
                var2.method2966((float) var7.field4445 + var11, var6.field4814 * var7.field4444 >> 7, (byte) -120, (float) var7.field4437 - var12, var6.field4799 * var7.field4435 >> 7, var7.field4438, -var13);
                this.field6321.method1722(var2, 12975);
                this.field6321.method606(var4, var3 - ((float) var6.field4812 * 1.5F));
                int var14 = var7.field4443;
                OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                this.field6321.method1725(-114, var6.field4800);
                this.field6321.method1732(var6.field4813, 9);
                this.field6321.method1734(-126, var6.field4801);
                this.field6321.method1707(true, 4, 0, 7);
            }
        }
        this.field6321.method606(var4, var3);
        this.field6321.method509(true);
        this.field6321.method1757((byte) 45);
    }

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "(SS)V")
    public final void method632(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field6294; var3++) {
            if (this.field6261[var3] == arg0) {
                this.field6261[var3] = arg1;
            }
        }
        field6283++;
        if (this.field6267 != null) {
            for (int var4 = 0; var4 < this.field6309; var4++) {
                class315 var5 = this.field6267[var4];
                class285 var6 = this.field6236[var4];
                var6.field4443 = class203.field3141[this.field6261[var5.field4806] & 0xFFFF] & 0xFFFFFF | var6.field4443 & 0xFF000000;
            }
        }
        if (this.field6341 != null) {
            this.field6341.field5689 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public static void method2656(byte arg0) {
        if (arg0 >= -36) {
            method2657(-35, null, -34, -94);
        }
        field6306 = null;
    }

    @OriginalMember(owner = "client!qo", name = "KA", descriptor = "()V")
    public final void method622() {
        field6282++;
        for (int var1 = 0; var1 < this.field6259; var1++) {
            this.field6322[var1] = this.field6322[var1] + 7 >> 4;
            this.field6252[var1] = this.field6252[var1] + 7 >> 4;
            this.field6324[var1] = this.field6324[var1] + 7 >> 4;
        }
        if (this.field6296 != null) {
            this.field6296.field5689 = null;
        }
        this.field6329 = false;
    }

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "(SS)V")
    public final void method647(short arg0, short arg1) {
        field6234++;
        class127 var3 = this.field6321.field4588;
        for (int var4 = 0; var4 < this.field6294; var4++) {
            if (this.field6257[var4] == arg0) {
                this.field6257[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class420 var7 = var3.method938(28923, arg0 & 0xFFFF);
            var6 = var7.field6162;
            var5 = var7.field6165;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class420 var10 = var3.method938(28923, arg1 & 0xFFFF);
            var9 = var10.field6162;
            var8 = var10.field6165;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field6267 != null) {
            for (int var11 = 0; var11 < this.field6309; var11++) {
                class315 var12 = this.field6267[var11];
                class285 var13 = this.field6236[var11];
                var13.field4443 = var13.field4443 & 0xFF000000 | class203.field3141[this.field6261[var12.field4806] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field6341 != null) {
            this.field6341.field5689 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Le;IIIZ)V")
    public final void method625(class289 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6302++;
        class425 var6 = (class425) arg0;
        if (this.field6294 == 0 || var6.field6294 == 0) {
            return;
        }
        int var7 = var6.field6330;
        int[] var8 = var6.field6322;
        int[] var9 = var6.field6252;
        int[] var10 = var6.field6324;
        short[] var11 = var6.field6254;
        short[] var12 = var6.field6333;
        short[] var13 = var6.field6277;
        byte[] var14 = var6.field6290;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field6315 == null) {
            var17 = null;
            var18 = null;
            var15 = null;
            var16 = null;
        } else {
            var15 = this.field6315.field7320;
            var16 = this.field6315.field7319;
            var17 = this.field6315.field7315;
            var18 = this.field6315.field7318;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field6315 == null) {
            var19 = null;
            var21 = null;
            var22 = null;
            var20 = null;
        } else {
            var19 = var6.field6315.field7318;
            var20 = var6.field6315.field7319;
            var21 = var6.field6315.field7320;
            var22 = var6.field6315.field7315;
        }
        int[] var23 = var6.field6258;
        short[] var24 = var6.field6289;
        if (!var6.field6329) {
            var6.method2652(114);
        }
        short var25 = var6.field6232;
        short var26 = var6.field6256;
        short var27 = var6.field6272;
        short var28 = var6.field6243;
        short var29 = var6.field6248;
        short var30 = var6.field6253;
        for (int var31 = 0; var31 < this.field6330; var31++) {
            int var32 = this.field6252[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field6322[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field6324[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field6258[var31];
                        int var37 = this.field6258[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field6289[var38] - 1;
                            if (var35 == -1 || this.field6290[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = var23[var39 + 1];
                                    int var42 = -1;
                                    for (int var43 = var40; var43 < var41; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var17 == null) {
                                            this.field6315 = new class504();
                                            var17 = this.field6315.field7315 = class76.method694(22868, this.field6254);
                                            var15 = this.field6315.field7320 = class76.method694(22868, this.field6333);
                                            var18 = this.field6315.field7318 = class76.method694(22868, this.field6277);
                                            var16 = this.field6315.field7319 = class40.method277(false, this.field6290);
                                        }
                                        if (var22 == null) {
                                            class504 var44 = var6.field6315 = new class504();
                                            var22 = var44.field7315 = class76.method694(22868, var11);
                                            var21 = var44.field7320 = class76.method694(22868, var12);
                                            var19 = var44.field7318 = class76.method694(22868, var13);
                                            var20 = var44.field7319 = class40.method277(false, var14);
                                        }
                                        short var45 = this.field6254[var35];
                                        short var46 = this.field6333[var35];
                                        short var47 = this.field6277[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field6290[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var22[var52] += var45;
                                                var21[var52] += var46;
                                                var19[var52] += var47;
                                                var20[var52] += var49;
                                            }
                                        }
                                        short var53 = var13[var42];
                                        short var54 = var11[var42];
                                        int var55 = this.field6258[var31];
                                        byte var56 = var14[var42];
                                        int var57 = this.field6258[var31 + 1];
                                        short var58 = var12[var42];
                                        for (int var59 = var55; var59 < var57; var59++) {
                                            int var60 = this.field6289[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var17[var60] += var54;
                                                var15[var60] += var58;
                                                var18[var60] += var53;
                                                var16[var60] += var56;
                                            }
                                        }
                                        if (this.field6340 == null && this.field6341 != null) {
                                            this.field6341.field5689 = null;
                                        }
                                        if (this.field6340 != null) {
                                            this.field6340.field5689 = null;
                                        }
                                        if (var6.field6340 == null && var6.field6341 != null) {
                                            var6.field6341.field5689 = null;
                                        }
                                        if (var6.field6340 != null) {
                                            var6.field6340.field5689 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "RA", descriptor = "()I")
    public final int method679() {
        field6237++;
        return this.field6264;
    }

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "()Z")
    public final boolean method650() {
        field6288++;
        if (this.field6328 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field6259; var1++) {
            this.field6322[var1] <<= 0x4;
            this.field6252[var1] <<= 0x4;
            this.field6324[var1] <<= 0x4;
        }
        class22.field249 = 0;
        class175.field2691 = 0;
        class30.field345 = 0;
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "()Z")
    public final boolean method633() {
        field6279++;
        if (this.field6257 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field6257.length; var1++) {
            if (this.field6257[var1] != -1 && !this.field6321.field4588.method936(this.field6257[var1], (byte) -119)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qo", name = "va", descriptor = "(I[IIIIIZ)V")
    public final void method637(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field6325++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = 0;
            class175.field2691 = 0;
            class30.field345 = 0;
            class22.field249 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field6328.length > var14) {
                    int[] var15 = this.field6328[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class22.field249 += this.field6322[var17];
                        class175.field2691 += this.field6252[var17];
                        class30.field345 += this.field6324[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class30.field345 = class30.field345 / var12 + var10;
                class22.field249 = class22.field249 / var12 + var11;
                class175.field2691 = class175.field2691 / var12 + var9;
            } else {
                class22.field249 = var11;
                class30.field345 = var10;
                class175.field2691 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field6328.length) {
                    int[] var23 = this.field6328[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field6322[var25] += var20;
                        this.field6252[var25] += var18;
                        this.field6324[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field6328.length) {
                    int[] var46 = this.field6328[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field6322[var59] -= class22.field249;
                            this.field6252[var59] -= class175.field2691;
                            this.field6324[var59] -= class30.field345;
                            if (arg4 != 0) {
                                int var60 = class58.field891[arg4];
                                int var61 = class58.field889[arg4];
                                int var62 = this.field6322[var59] * var61 + this.field6252[var59] * var60 + 32767 >> 15;
                                this.field6252[var59] = this.field6252[var59] * var61 + 32767 - (this.field6322[var59] * var60) >> 15;
                                this.field6322[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class58.field891[arg2];
                                int var64 = class58.field889[arg2];
                                int var65 = this.field6252[var59] * var64 + 32767 - (this.field6324[var59] * var63) >> 15;
                                this.field6324[var59] = this.field6324[var59] * var64 + this.field6252[var59] * var63 + 32767 >> 15;
                                this.field6252[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class58.field891[arg3];
                                int var67 = class58.field889[arg3];
                                int var68 = this.field6324[var59] * var66 + this.field6322[var59] * var67 + 32767 >> 15;
                                this.field6324[var59] = this.field6324[var59] * var67 + 32767 - (this.field6322[var59] * var66) >> 15;
                                this.field6322[var59] = var68;
                            }
                            this.field6322[var59] += class22.field249;
                            this.field6252[var59] += class175.field2691;
                            this.field6324[var59] += class30.field345;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field6322[var48] -= class22.field249;
                            this.field6252[var48] -= class175.field2691;
                            this.field6324[var48] -= class30.field345;
                            if (arg2 != 0) {
                                int var49 = class58.field891[arg2];
                                int var50 = class58.field889[arg2];
                                int var51 = this.field6252[var48] * var50 + 32767 - (this.field6324[var48] * var49) >> 15;
                                this.field6324[var48] = this.field6324[var48] * var50 + this.field6252[var48] * var49 + 32767 >> 15;
                                this.field6252[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class58.field891[arg4];
                                int var53 = class58.field889[arg4];
                                int var54 = this.field6322[var48] * var53 + this.field6252[var48] * var52 + 32767 >> 15;
                                this.field6252[var48] = this.field6252[var48] * var53 + 32767 - (this.field6322[var48] * var52) >> 15;
                                this.field6322[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class58.field891[arg3];
                                int var56 = class58.field889[arg3];
                                int var57 = this.field6324[var48] * var55 + this.field6322[var48] * var56 + 32767 >> 15;
                                this.field6324[var48] = this.field6324[var48] * var56 + 32767 - this.field6322[var48] * var55 >> 15;
                                this.field6322[var48] = var57;
                            }
                            this.field6322[var48] += class22.field249;
                            this.field6252[var48] += class175.field2691;
                            this.field6324[var48] += class30.field345;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field6328.length) {
                        int[] var29 = this.field6328[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field6258[var31];
                            int var33 = this.field6258[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field6289[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class58.field891[arg4];
                                    int var37 = class58.field889[arg4];
                                    int var38 = this.field6333[var35] * var36 + this.field6254[var35] * var37 + 32767 >> 15;
                                    this.field6333[var35] = (short) (this.field6333[var35] * var37 + 32767 - (this.field6254[var35] * var36) >> 15);
                                    this.field6254[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class58.field891[arg2];
                                    int var40 = class58.field889[arg2];
                                    int var41 = this.field6333[var35] * var40 + 32767 - (this.field6277[var35] * var39) >> 15;
                                    this.field6277[var35] = (short) (this.field6333[var35] * var39 + this.field6277[var35] * var40 + 32767 >> 15);
                                    this.field6333[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class58.field891[arg3];
                                    int var43 = class58.field889[arg3];
                                    int var44 = this.field6254[var35] * var43 + (this.field6277[var35] * var42 + 32767) >> 15;
                                    this.field6277[var35] = (short) (this.field6277[var35] * var43 + 32767 - (this.field6254[var35] * var42) >> 15);
                                    this.field6254[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field6340 == null && this.field6341 != null) {
                    this.field6341.field5689 = null;
                }
                if (this.field6340 != null) {
                    this.field6340.field5689 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field6328.length) {
                    int[] var71 = this.field6328[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field6322[var73] -= class22.field249;
                        this.field6252[var73] -= class175.field2691;
                        this.field6324[var73] -= class30.field345;
                        this.field6322[var73] = this.field6322[var73] * arg2 >> 7;
                        this.field6252[var73] = this.field6252[var73] * arg3 >> 7;
                        this.field6324[var73] = this.field6324[var73] * arg4 >> 7;
                        this.field6322[var73] += class22.field249;
                        this.field6252[var73] += class175.field2691;
                        this.field6324[var73] += class30.field345;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6274 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field6274.length > var78) {
                        int[] var79 = this.field6274[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field6298[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field6298[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field6341 != null) {
                            this.field6341.field5689 = null;
                        }
                    }
                }
                if (this.field6267 != null) {
                    for (int var75 = 0; var75 < this.field6309; var75++) {
                        class315 var76 = this.field6267[var75];
                        class285 var77 = this.field6236[var75];
                        var77.field4443 = var77.field4443 & 0xFFFFFF | 255 - (this.field6298[var76.field4806] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6274 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field6274.length) {
                        int[] var88 = this.field6274[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field6261[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFFC1) >> 10;
                            int var93 = (var91 & 0x3F5) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field6261[var90] = (short) class19.method118(var97, class19.method118(var94 << 7, var95 << 10));
                        }
                        if (var88.length > 0 && this.field6341 != null) {
                            this.field6341.field5689 = null;
                        }
                    }
                }
                if (this.field6267 != null) {
                    for (int var84 = 0; var84 < this.field6309; var84++) {
                        class315 var85 = this.field6267[var84];
                        class285 var86 = this.field6236[var84];
                        var86.field4443 = var86.field4443 & 0xFF000000 | class203.field3141[this.field6261[var85.field4806] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6292 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field6292.length > var99) {
                        int[] var100 = this.field6292[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class285 var102 = this.field6236[var100[var101]];
                            var102.field4437 += arg3;
                            var102.field4445 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6292 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field6292.length > var104) {
                        int[] var105 = this.field6292[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class285 var107 = this.field6236[var105[var106]];
                            var107.field4435 = var107.field4435 * arg2 >> 7;
                            var107.field4444 = var107.field4444 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6292 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field6292.length > var109) {
                    int[] var110 = this.field6292[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class285 var112 = this.field6236[var110[var111]];
                        var112.field4438 = var112.field4438 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "()I")
    public final int method658() {
        field6313++;
        if (!this.field6329) {
            this.method2652(121);
        }
        return this.field6256;
    }

    @OriginalMember(owner = "client!qo", name = "Y", descriptor = "()I")
    public final int method641() {
        field6240++;
        return this.field6295;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILfi;II)V")
    public static final void method2657(int arg0, class38 arg1, int arg2, int arg3) {
        field6284++;
        if (arg1.field630 == 0) {
            arg1.field540 = arg1.field585;
        } else if (arg1.field630 == 1) {
            arg1.field540 = (arg2 - arg1.field591) / 2 + arg1.field585;
        } else if (arg1.field630 == 2) {
            arg1.field540 = arg2 - arg1.field591 - arg1.field585;
        } else if (arg1.field630 == 3) {
            arg1.field540 = arg1.field585 * arg2 >> 14;
        } else if (arg1.field630 == 4) {
            arg1.field540 = (arg1.field585 * arg2 >> 14) + (arg2 - arg1.field591) / 2;
        } else {
            arg1.field540 = arg2 - (arg1.field585 * arg2 >> 14) - arg1.field591;
        }
        if (arg1.field527 == 0) {
            arg1.field627 = arg1.field521;
        } else if (arg1.field527 == 1) {
            arg1.field627 = (arg3 - arg1.field629) / 2 + arg1.field521;
        } else if (arg1.field527 == 2) {
            arg1.field627 = arg3 - arg1.field629 - arg1.field521;
        } else if (arg1.field527 == 3) {
            arg1.field627 = arg1.field521 * arg3 >> 14;
        } else if (arg1.field527 == 4) {
            arg1.field627 = (arg3 - arg1.field629) / 2 + (arg1.field521 * arg3 >> 14);
        } else {
            arg1.field627 = arg3 - (arg1.field521 * arg3 >> 14) - arg1.field629;
        }
        if (arg0 <= 100) {
            field6306 = null;
        }
        if (!class267.field4246 || client.method3078(arg1).field1503 == 0 && arg1.field503 != 0) {
            return;
        }
        if (arg1.field627 < 0) {
            arg1.field627 = 0;
        } else if (arg1.field627 + arg1.field629 > arg3) {
            arg1.field627 = arg3 - arg1.field629;
        }
        if (arg1.field540 < 0) {
            arg1.field540 = 0;
        } else if (arg2 < (arg1.field591 + arg1.field540)) {
            arg1.field540 = arg2 - arg1.field591;
            return;
        }
    }

    @OriginalMember(owner = "client!qo", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final void method649(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field6293++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            class22.field249 = 0;
            class30.field345 = 0;
            int var13 = 0;
            class175.field2691 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field6328.length > var15) {
                    int[] var16 = this.field6328[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field6270 == null || (this.field6270[var18] & arg6) != 0) {
                            class22.field249 += this.field6322[var18];
                            class175.field2691 += this.field6252[var18];
                            var13++;
                            class30.field345 += this.field6324[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class22.field249 = var12;
                class175.field2691 = var10;
                class30.field345 = var11;
            } else {
                class73.field1249 = true;
                class175.field2691 = class175.field2691 / var13 + var10;
                class30.field345 = class30.field345 / var13 + var11;
                class22.field249 = class22.field249 / var13 + var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[2] * arg4 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[3] * arg2 + arg7[5] * arg4 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 + (arg7[8] * arg4) + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field6328.length > var26) {
                    int[] var27 = this.field6328[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field6270 == null || (arg6 & this.field6270[var29]) != 0) {
                            this.field6322[var29] += var23;
                            this.field6252[var29] += var22;
                            this.field6324[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field6328.length) {
                        int[] var50 = this.field6328[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field6270 == null || (this.field6270[var52] & arg6) != 0) {
                                this.field6322[var52] -= class22.field249;
                                this.field6252[var52] -= class175.field2691;
                                this.field6324[var52] -= class30.field345;
                                if (arg4 != 0) {
                                    int var53 = class58.field891[arg4];
                                    int var54 = class58.field889[arg4];
                                    int var55 = this.field6322[var52] * var54 + this.field6252[var52] * var53 + 32767 >> 15;
                                    this.field6252[var52] = this.field6252[var52] * var54 + 32767 - (this.field6322[var52] * var53) >> 15;
                                    this.field6322[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class58.field891[arg2];
                                    int var57 = class58.field889[arg2];
                                    int var58 = this.field6252[var52] * var57 + 32767 - (this.field6324[var52] * var56) >> 15;
                                    this.field6324[var52] = this.field6252[var52] * var56 + (this.field6324[var52] * var57) + 32767 >> 15;
                                    this.field6252[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class58.field891[arg3];
                                    int var60 = class58.field889[arg3];
                                    int var61 = this.field6324[var52] * var59 + this.field6322[var52] * var60 + 32767 >> 15;
                                    this.field6324[var52] = this.field6324[var52] * var60 + 32767 - (this.field6322[var52] * var59) >> 15;
                                    this.field6322[var52] = var61;
                                }
                                this.field6322[var52] += class22.field249;
                                this.field6252[var52] += class175.field2691;
                                this.field6324[var52] += class30.field345;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field6328.length > var32) {
                            int[] var33 = this.field6328[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field6270 == null || (this.field6270[var35] & arg6) != 0) {
                                    int var36 = this.field6258[var35];
                                    int var37 = this.field6258[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field6289[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class58.field891[arg4];
                                            int var41 = class58.field889[arg4];
                                            int var42 = this.field6333[var39] * var40 + this.field6254[var39] * var41 + 32767 >> 15;
                                            this.field6333[var39] = (short) (this.field6333[var39] * var41 + 32767 - (this.field6254[var39] * var40) >> 15);
                                            this.field6254[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class58.field891[arg2];
                                            int var44 = class58.field889[arg2];
                                            int var45 = this.field6333[var39] * var44 + 32767 - (this.field6277[var39] * var43) >> 15;
                                            this.field6277[var39] = (short) (this.field6333[var39] * var43 + this.field6277[var39] * var44 + 32767 >> 15);
                                            this.field6333[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class58.field891[arg3];
                                            int var47 = class58.field889[arg3];
                                            int var48 = this.field6277[var39] * var46 + this.field6254[var39] * var47 + 32767 >> 15;
                                            this.field6277[var39] = (short) (this.field6277[var39] * var47 + 32767 - (this.field6254[var39] * var46) >> 15);
                                            this.field6254[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6340 == null && this.field6341 != null) {
                        this.field6341.field5689 = null;
                    }
                    if (this.field6340 != null) {
                        this.field6340.field5689 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class73.field1249) {
                    int var68 = arg7[6] * class30.field345 + arg7[3] * class175.field2691 + arg7[0] * class22.field249 + 16384 >> 15;
                    int var69 = arg7[7] * class30.field345 + arg7[4] * class175.field2691 + arg7[1] * class22.field249 + 16384 >> 15;
                    int var70 = var65 + var68;
                    int var71 = var66 + var69;
                    int var72 = arg7[5] * class175.field2691 + arg7[8] * class30.field345 + arg7[2] * class22.field249 + 16384 >> 15;
                    class22.field249 = var70;
                    class175.field2691 = var71;
                    int var73 = var67 + var72;
                    class73.field1249 = false;
                    class30.field345 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class58.field889[arg2];
                int var76 = class58.field891[arg2];
                int var77 = class58.field889[arg3];
                int var78 = class58.field891[arg3];
                int var79 = class58.field889[arg4];
                int var80 = class58.field891[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[1] = -var77 * var80 + (var78 * var81) + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[6] = var77 * var82 + (-var78 * var79 + 16384) >> 15;
                var74[7] = var78 * var80 + var77 * var81 + 16384 >> 15;
                var74[5] = -var76;
                var74[0] = var77 * var79 + var78 * var82 + 16384 >> 15;
                int var83 = var74[2] * -class30.field345 + var74[0] * -class22.field249 + (var74[1] * -class175.field2691) + 16384 >> 15;
                int var84 = var74[5] * -class30.field345 + (var74[4] * -class175.field2691 + var74[3] * -class22.field249 + 16384) >> 15;
                int var85 = var74[7] * -class175.field2691 + var74[6] * -class22.field249 + var74[8] * -class30.field345 + 16384 >> 15;
                int var86 = var83 + class22.field249;
                int var87 = var84 + class175.field2691;
                int var88 = var85 + class30.field345;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 16384 >> 15;
                    }
                }
                int var91 = var74[0] * var65 + (var74[2] * var67) + var74[1] * var66 + 16384 >> 15;
                int var92 = var74[3] * var65 + (var74[5] * var67) + var74[4] * var66 + 16384 >> 15;
                int var93 = var86 + var91;
                int var94 = var74[6] * var65 + var74[7] * var66 + var74[8] * var67 + 16384 >> 15;
                int var95 = var87 + var92;
                int var96 = var88 + var94;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 16384 >> 15;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[1] * var95 + arg7[0] * var93 + 16384 >> 15;
                int var100 = arg7[5] * var96 + arg7[3] * var93 + arg7[4] * var95 + 16384 >> 15;
                int var101 = arg7[8] * var96 + arg7[6] * var93 + (arg7[7] * var95) + 16384 >> 15;
                int var102 = var62 + var99;
                int var103 = var63 + var100;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field6328.length > var106) {
                        int[] var107 = this.field6328[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field6270 == null || (arg6 & this.field6270[var109]) != 0) {
                                int var110 = this.field6324[var109] * var97[2] + this.field6322[var109] * var97[0] + (this.field6252[var109] * var97[1]) + 16384 >> 15;
                                int var111 = this.field6322[var109] * var97[3] + (this.field6252[var109] * var97[4] + (this.field6324[var109] * var97[5])) + 16384 >> 15;
                                int var112 = var103 + var111;
                                int var113 = this.field6322[var109] * var97[6] + this.field6252[var109] * var97[7] - (-(this.field6324[var109] * var97[8]) - 16384) >> 15;
                                int var114 = var102 + var110;
                                int var115 = var104 + var113;
                                this.field6322[var109] = var114;
                                this.field6252[var109] = var112;
                                this.field6324[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field6328.length) {
                        int[] var124 = this.field6328[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field6270 == null || (arg6 & this.field6270[var126]) != 0) {
                                this.field6322[var126] -= class22.field249;
                                this.field6252[var126] -= class175.field2691;
                                this.field6324[var126] -= class30.field345;
                                this.field6322[var126] = this.field6322[var126] * arg2 >> 7;
                                this.field6252[var126] = this.field6252[var126] * arg3 >> 7;
                                this.field6324[var126] = this.field6324[var126] * arg4 >> 7;
                                this.field6322[var126] += class22.field249;
                                this.field6252[var126] += class175.field2691;
                                this.field6324[var126] += class30.field345;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class73.field1249) {
                    int var133 = arg7[6] * class30.field345 + arg7[0] * class22.field249 - (-(arg7[3] * class175.field2691) + -16384) >> 15;
                    int var134 = arg7[1] * class22.field249 + arg7[4] * class175.field2691 + arg7[7] * class30.field345 + 16384 >> 15;
                    int var135 = var130 + var133;
                    int var136 = var131 + var134;
                    int var137 = arg7[2] * class22.field249 + 16384 - (-(arg7[5] * class175.field2691) - arg7[8] * class30.field345) >> 15;
                    class175.field2691 = var136;
                    int var138 = var132 + var137;
                    class22.field249 = var135;
                    class30.field345 = var138;
                    class73.field1249 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class22.field249 * var139 + 16384 >> 15;
                int var143 = -class175.field2691 * var140 + 16384 >> 15;
                int var144 = -class30.field345 * var141 + 16384 >> 15;
                int var145 = class22.field249 + var142;
                int var146 = class175.field2691 + var143;
                int var147 = class30.field345 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 16384 >> 15, arg7[3] * var139 + 16384 >> 15, arg7[6] * var139 + 16384 >> 15, arg7[1] * var140 + 16384 >> 15, arg7[4] * var140 + 16384 >> 15, arg7[7] * var140 + 16384 >> 15, arg7[2] * var141 + 16384 >> 15, arg7[5] * var141 + 16384 >> 15, arg7[8] * var141 + 16384 >> 15 };
                int var149 = var130 * var139 + 16384 >> 15;
                int var150 = var131 * var140 + 16384 >> 15;
                int var151 = var132 * var141 + 16384 >> 15;
                int var152 = var145 + var149;
                int var153 = var146 + var150;
                int var154 = var147 + var151;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var174 + (var176 * 3)];
                        }
                        var155[var156 * 3 + var174] = var175 + 16384 >> 15;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[1] * var153 + arg7[0] * var152 + 16384 >> 15;
                int var158 = arg7[3] * var152 + arg7[5] * var154 + arg7[4] * var153 + 16384 >> 15;
                int var159 = var127 + var157;
                int var160 = var128 + var158;
                int var161 = arg7[7] * var153 + arg7[8] * var154 + arg7[6] * var152 + 16384 >> 15;
                int var162 = var129 + var161;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field6328.length) {
                        int[] var165 = this.field6328[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field6270 == null || (this.field6270[var167] & arg6) != 0) {
                                int var168 = this.field6324[var167] * var155[2] + this.field6322[var167] * var155[0] + this.field6252[var167] * var155[1] + 16384 >> 15;
                                int var169 = this.field6324[var167] * var155[5] + this.field6322[var167] * var155[3] + (this.field6252[var167] * var155[4]) + 16384 >> 15;
                                int var170 = var159 + var168;
                                int var171 = var160 + var169;
                                int var172 = this.field6322[var167] * var155[6] + this.field6252[var167] * var155[7] + this.field6324[var167] * var155[8] + 16384 >> 15;
                                this.field6322[var167] = var170;
                                int var173 = var162 + var172;
                                this.field6252[var167] = var171;
                                this.field6324[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6274 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field6274.length > var181) {
                        int[] var182 = this.field6274[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field6235 == null || (this.field6235[var184] & arg6) != 0) {
                                int var185 = (this.field6298[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field6298[var184] = (byte) var185;
                                if (this.field6341 != null) {
                                    this.field6341.field5689 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6267 != null) {
                    for (int var178 = 0; var178 < this.field6309; var178++) {
                        class315 var179 = this.field6267[var178];
                        class285 var180 = this.field6236[var178];
                        var180.field4443 = var180.field4443 & 0xFFFFFF | 255 - (this.field6298[var179.field4806] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6274 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field6274.length > var190) {
                        int[] var191 = this.field6274[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field6235 == null || (this.field6235[var193] & arg6) != 0) {
                                int var194 = this.field6261[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x388) >> 7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                int var200 = arg4 + var199;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field6261[var193] = (short) class19.method118(var200, class19.method118(var197 << 10, var198 << 7));
                                if (this.field6341 != null) {
                                    this.field6341.field5689 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6267 != null) {
                    for (int var187 = 0; var187 < this.field6309; var187++) {
                        class315 var188 = this.field6267[var187];
                        class285 var189 = this.field6236[var187];
                        var189.field4443 = class203.field3141[this.field6261[var188.field4806] & 0xFFFF] & 0xFFFFFF | var189.field4443 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6292 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field6292.length) {
                        int[] var203 = this.field6292[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class285 var205 = this.field6236[var203[var204]];
                            var205.field4445 += arg2;
                            var205.field4437 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6292 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field6292.length) {
                        int[] var208 = this.field6292[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class285 var210 = this.field6236[var208[var209]];
                            var210.field4444 = var210.field4444 * arg3 >> 7;
                            var210.field4435 = var210.field4435 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6292 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field6292.length > var212) {
                    int[] var213 = this.field6292[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class285 var215 = this.field6236[var213[var214]];
                        var215.field4438 = var215.field4438 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Ltt;)V")
    public class425(class249 arg0) {
        this.field6321 = arg0;
        this.field6296 = new class387(null, 5126, 3, 0);
        this.field6280 = new class387(null, 5126, 2, 0);
        this.field6340 = new class387(null, 5126, 3, 0);
        this.field6341 = new class387(null, 5121, 4, 0);
        this.field6311 = new class71();
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Ltt;Lfe;IIII)V")
    public class425(class249 arg0, class153 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6308 = arg5;
        this.field6264 = arg2;
        this.field6321 = arg0;
        if (class5.method23(arg2, arg5, -86)) {
            this.field6296 = new class387(null, 5126, 3, 0);
        }
        if (class51.method339(0, arg5, arg2)) {
            this.field6280 = new class387(null, 5126, 2, 0);
        }
        if (class148.method1058(arg5, arg2, (byte) 110)) {
            this.field6340 = new class387(null, 5126, 3, 0);
        }
        if (class57.method371(arg2, arg5, -57)) {
            this.field6341 = new class387(null, 5121, 4, 0);
        }
        if (class34.method204(24448, arg5, arg2)) {
            this.field6311 = new class71();
        }
        class127 var7 = arg0.field4588;
        this.field6258 = new int[arg1.field2340 + 1];
        int[] var8 = new int[arg1.field2324];
        for (int var9 = 0; var9 < arg1.field2324; var9++) {
            if ((arg1.field2338 == null || arg1.field2338[var9] != 2) && (arg1.field2330 == null || arg1.field2330[var9] == -1 || !var7.method938(28923, arg1.field2330[var9] & 0xFFFF).field6155)) {
                var8[this.field6294++] = var9;
                this.field6258[arg1.field2313[var9]]++;
                this.field6258[arg1.field2303[var9]]++;
                this.field6258[arg1.field2350[var9]]++;
            }
        }
        this.field6326 = this.field6294;
        long[] var10 = new long[this.field6294];
        boolean var11 = (this.field6264 & 0x100) != 0;
        label499: for (int var12 = 0; var12 < this.field6294; var12++) {
            int var180 = var8[var12];
            class420 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field2307 != null) {
                for (int var186 = 0; var186 < arg1.field2307.length; var186++) {
                    class144 var187 = arg1.field2307[var186];
                    if (var187.field2125 == var180) {
                        class80 var188 = class241.method1619(26750, var187.field2121);
                        if (var188.field1307) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field6326--;
                            continue label499;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field2330 != null) {
                var189 = arg1.field2330[var180];
                if (var189 != -1) {
                    var181 = var7.method938(28923, var189 & 0xFFFF);
                    var184 = var181.field6169;
                    var185 = var181.field6178;
                }
            }
            boolean var190 = arg1.field2302 != null && arg1.field2302[var180] != 0 || var181 != null && var181.field6168 | !var181.field6175;
            if ((var11 || var190) && arg1.field2336 != null) {
                var182 += arg1.field2336[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = ((var189 & 0xFFFF) << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
        }
        class453.method2775(-22367, var10, var8);
        this.field6259 = arg1.field2310;
        this.field6252 = arg1.field2301;
        this.field6330 = arg1.field2340;
        this.field6324 = arg1.field2309;
        this.field6322 = arg1.field2305;
        this.field6270 = arg1.field2321;
        this.field6262 = arg1.field2320;
        this.field6337 = arg1.field2323;
        class356[] var13 = new class356[this.field6330];
        if (arg1.field2307 != null) {
            this.field6309 = arg1.field2307.length;
            this.field6267 = new class315[this.field6309];
            this.field6236 = new class285[this.field6309];
            for (int var14 = 0; var14 < this.field6309; var14++) {
                class144 var15 = arg1.field2307[var14];
                class80 var16 = class241.method1619(26750, var15.field2121);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field6294; var18++) {
                    if (var8[var18] == var15.field2125) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class203.field3141[arg1.field2339[var15.field2125] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field2302 == null ? 0 : arg1.field2302[var15.field2125]) << 24;
                this.field6267[var14] = new class315(var17, arg1.field2313[var15.field2125], arg1.field2303[var15.field2125], arg1.field2350[var15.field2125], var16.field1311, var16.field1309, var16.field1318, var16.field1321, var16.field1317, var16.field1307, var16.field1306, var15.field2117);
                this.field6236[var14] = new class285(var20);
            }
        }
        int var21 = this.field6294 * 3;
        this.field6277 = new short[var21];
        this.field6289 = new short[var21];
        this.field6254 = new short[var21];
        this.field6261 = new short[this.field6294];
        this.field6333 = new short[var21];
        this.field6246 = new short[this.field6294];
        if (arg1.field2314 != null) {
            this.field6235 = new short[this.field6294];
        }
        this.field6257 = new short[this.field6294];
        this.field6285 = new float[var21];
        this.field6290 = new byte[var21];
        this.field6263 = new float[var21];
        this.field6295 = (short) arg3;
        this.field6297 = new short[this.field6294];
        this.field6298 = new byte[this.field6294];
        class381.field5602 = new long[var21];
        this.field6273 = (short) arg4;
        this.field6287 = new short[this.field6294];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field2340; var23++) {
            int var179 = this.field6258[var23];
            this.field6258[var23] = var22;
            var13[var23] = new class356();
            var22 += var179;
        }
        this.field6258[arg1.field2340] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field2325 != null) {
            int var28 = arg1.field2318;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var24 = new int[var28];
            var27 = new float[var28][];
            var25 = new int[var28];
            for (int var36 = 0; var36 < this.field6294; var36++) {
                int var43 = var8[var36];
                if (arg1.field2325[var43] != -1) {
                    int var44 = arg1.field2325[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field2313[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field2303[var43];
                        } else {
                            var46 = arg1.field2350[var43];
                        }
                        int var47 = arg1.field2305[var46];
                        int var48 = arg1.field2301[var46];
                        int var49 = arg1.field2309[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var26 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field2337[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field2327[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var40 = 1.0F;
                        } else if (var39 <= 0) {
                            var40 = 1.0F;
                            var41 = (float) (-var39) / 1024.0F;
                        } else {
                            var41 = 1.0F;
                            var40 = (float) var39 / 1024.0F;
                        }
                        var42 = 64.0F / (float) arg1.field2334[var37];
                    } else if (var38 == 2) {
                        var42 = 64.0F / (float) arg1.field2334[var37];
                        var41 = 64.0F / (float) arg1.field2327[var37];
                        var40 = 64.0F / (float) arg1.field2300[var37];
                    } else {
                        var42 = (float) arg1.field2334[var37] / 1024.0F;
                        var40 = (float) arg1.field2300[var37] / 1024.0F;
                        var41 = (float) arg1.field2327[var37] / 1024.0F;
                    }
                    var27[var37] = class74.method685(var40, class307.method2028(255, arg1.field2341[var37]), arg1.field2319[var37], var42, arg1.field2344[var37], 0, var41, arg1.field2331[var37]);
                }
            }
        }
        class468[] var50 = new class468[arg1.field2324];
        for (int var51 = 0; var51 < arg1.field2324; var51++) {
            short var158 = arg1.field2313[var51];
            short var159 = arg1.field2303[var51];
            short var160 = arg1.field2350[var51];
            int var161 = this.field6322[var159] - this.field6322[var158];
            int var162 = this.field6252[var159] - this.field6252[var158];
            int var163 = this.field6324[var159] - this.field6324[var158];
            int var164 = this.field6322[var160] - this.field6322[var158];
            int var165 = this.field6252[var160] - this.field6252[var158];
            int var166 = this.field6324[var160] - this.field6324[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + (var167 * var167 + (var168 * var168))));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field2338 == null ? 0 : arg1.field2338[var51];
            if (var174 == 0) {
                class356 var175 = var13[var158];
                var175.field5275++;
                var175.field5274 += var171;
                var175.field5273 += var172;
                var175.field5268 += var173;
                class356 var176 = var13[var159];
                var176.field5273 += var172;
                var176.field5274 += var171;
                var176.field5268 += var173;
                var176.field5275++;
                class356 var177 = var13[var160];
                var177.field5268 += var173;
                var177.field5273 += var172;
                var177.field5275++;
                var177.field5274 += var171;
            } else if (var174 == 1) {
                class468 var178 = var50[var51] = new class468();
                var178.field6886 = var172;
                var178.field6887 = var173;
                var178.field6890 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field6294; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field2339[var68] & 0xFFFF;
            short var70;
            if (arg1.field2330 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field2330[var68];
            }
            int var71;
            if (arg1.field2325 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field2325[var68];
            }
            int var72;
            if (arg1.field2302 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field2302[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var79 = 1;
                    var77 = 0.0F;
                    var73 = 0.0F;
                    var80 = 2;
                    var76 = 1.0F;
                    var78 = 0.0F;
                    var74 = 1.0F;
                    var75 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field2337[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field2313[var68];
                        short var84 = arg1.field2303[var68];
                        short var85 = arg1.field2350[var68];
                        short var86 = arg1.field2344[var71];
                        short var87 = arg1.field2331[var71];
                        short var88 = arg1.field2319[var71];
                        float var89 = (float) arg1.field2305[var86];
                        float var90 = (float) arg1.field2301[var86];
                        float var91 = (float) arg1.field2309[var86];
                        float var92 = (float) arg1.field2305[var87] - var89;
                        float var93 = (float) arg1.field2301[var87] - var90;
                        float var94 = (float) arg1.field2309[var87] - var91;
                        float var95 = (float) arg1.field2305[var88] - var89;
                        float var96 = (float) arg1.field2301[var88] - var90;
                        float var97 = (float) arg1.field2309[var88] - var91;
                        float var98 = (float) arg1.field2305[var83] - var89;
                        float var99 = (float) arg1.field2301[var83] - var90;
                        float var100 = (float) arg1.field2309[var83] - var91;
                        float var101 = (float) arg1.field2305[var84] - var89;
                        float var102 = (float) arg1.field2301[var84] - var90;
                        float var103 = (float) arg1.field2309[var84] - var91;
                        float var104 = (float) arg1.field2305[var85] - var89;
                        float var105 = (float) arg1.field2301[var85] - var90;
                        float var106 = (float) arg1.field2309[var85] - var91;
                        float var107 = var93 * var97 - var94 * var96;
                        float var108 = var94 * var95 - var92 * var97;
                        float var109 = var92 * var96 - var93 * var95;
                        float var110 = var96 * var109 - (var97 * var108);
                        float var111 = var97 * var107 - var95 * var109;
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        float var114 = var94 * var107 - (var92 * var109);
                        float var115 = var93 * var109 - var94 * var108;
                        float var116 = var92 * var108 - var93 * var107;
                        float var117 = 1.0F / (var97 * var116 + var95 * var115 + var96 * var114);
                        var76 = (var103 * var116 + var101 * var115 + var102 * var114) * var117;
                        var78 = (var106 * var116 + var104 * var115 + var105 * var114) * var117;
                        var74 = (var100 * var116 + var98 * var115 + var99 * var114) * var117;
                    } else {
                        short var118 = arg1.field2313[var68];
                        short var119 = arg1.field2303[var68];
                        short var120 = arg1.field2350[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field2328[var71];
                        float var126 = (float) arg1.field2317[var71] / 256.0F;
                        if (var82 == 1) {
                            float var144 = (float) arg1.field2300[var71] / 1024.0F;
                            class361.method2289(var122, var125, var121, var124, arg1.field2309[var118], var144, -10825, arg1.field2301[var118], var123, var126, arg1.field2305[var118]);
                            var74 = class6.field78;
                            var73 = class313.field4768;
                            class361.method2289(var122, var125, var121, var124, arg1.field2309[var119], var144, -10825, arg1.field2301[var119], var123, var126, arg1.field2305[var119]);
                            var75 = class313.field4768;
                            var76 = class6.field78;
                            class361.method2289(var122, var125, var121, var124, arg1.field2309[var120], var144, -10825, arg1.field2301[var120], var123, var126, arg1.field2305[var120]);
                            var77 = class313.field4768;
                            var78 = class6.field78;
                            float var145 = var144 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if ((var145 < var75 - var73)) {
                                    var79 = 1;
                                    var75 -= var144;
                                } else if (var145 < var73 - var75) {
                                    var79 = 2;
                                    var75 += var144;
                                }
                                if (var77 - var73 > var145) {
                                    var77 -= var144;
                                    var80 = 1;
                                } else if (var145 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var144;
                                }
                            } else {
                                if (var78 - var74 > var145) {
                                    var80 = 1;
                                    var78 -= var144;
                                } else if (var74 - var78 > var145) {
                                    var80 = 2;
                                    var78 += var144;
                                }
                                if (var145 < var76 - var74) {
                                    var76 -= var144;
                                    var79 = 1;
                                } else if (var145 < var74 - var76) {
                                    var79 = 2;
                                    var76 += var144;
                                }
                            }
                        } else if (var82 == 2) {
                            float var127 = (float) arg1.field2308[var71] / 256.0F;
                            float var128 = (float) arg1.field2304[var71] / 256.0F;
                            int var129 = arg1.field2305[var119] - arg1.field2305[var118];
                            int var130 = arg1.field2301[var119] - arg1.field2301[var118];
                            int var131 = arg1.field2309[var119] - arg1.field2309[var118];
                            int var132 = arg1.field2305[var120] - arg1.field2305[var118];
                            int var133 = arg1.field2301[var120] - arg1.field2301[var118];
                            int var134 = arg1.field2309[var120] - arg1.field2309[var118];
                            int var135 = var130 * var134 - (var131 * var133);
                            int var136 = var131 * var132 - var129 * var134;
                            int var137 = var129 * var133 - (var130 * var132);
                            float var138 = 64.0F / (float) arg1.field2327[var71];
                            float var139 = 64.0F / (float) arg1.field2334[var71];
                            float var140 = 64.0F / (float) arg1.field2300[var71];
                            float var141 = (var124[2] * (float) var137 + var124[0] * (float) var135 + var124[1] * (float) var136) / var138;
                            float var142 = (var124[5] * (float) var137 + var124[3] * (float) var135 + var124[4] * (float) var136) / var139;
                            float var143 = (var124[8] * (float) var137 + var124[6] * (float) var135 + var124[7] * (float) var136) / var140;
                            var81 = class498.method2976(114, var143, var142, var141);
                            class213.method1467(arg1.field2301[var118], var126, true, var81, arg1.field2305[var118], var125, var128, var123, var124, var127, arg1.field2309[var118], var122, var121);
                            var73 = class105.field1617;
                            var74 = class367.field5415;
                            class213.method1467(arg1.field2301[var119], var126, true, var81, arg1.field2305[var119], var125, var128, var123, var124, var127, arg1.field2309[var119], var122, var121);
                            var75 = class105.field1617;
                            var76 = class367.field5415;
                            class213.method1467(arg1.field2301[var120], var126, true, var81, arg1.field2305[var120], var125, var128, var123, var124, var127, arg1.field2309[var120], var122, var121);
                            var77 = class105.field1617;
                            var78 = class367.field5415;
                        } else if (var82 == 3) {
                            class22.method136(var126, var125, var123, var122, 81, var121, arg1.field2309[var118], arg1.field2301[var118], arg1.field2305[var118], var124);
                            var74 = class305.field4680;
                            var73 = class6.field79;
                            class22.method136(var126, var125, var123, var122, 84, var121, arg1.field2309[var119], arg1.field2301[var119], arg1.field2305[var119], var124);
                            var76 = class305.field4680;
                            var75 = class6.field79;
                            class22.method136(var126, var125, var123, var122, 96, var121, arg1.field2309[var120], arg1.field2301[var120], arg1.field2305[var120], var124);
                            var77 = class6.field79;
                            var78 = class305.field4680;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field2338 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field2338[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var69 << 8) + (long) var72 + (long) (var81 << 24) << 32) + (long) (var71 << 2);
                short var149 = arg1.field2313[var68];
                short var150 = arg1.field2303[var68];
                short var151 = arg1.field2350[var68];
                class356 var152 = var13[var149];
                this.field6287[var52] = this.method2651(var152.field5268, var152.field5275, 120, var74, var73, var149, arg1, var152.field5273, var152.field5274, var147);
                class356 var153 = var13[var150];
                this.field6246[var52] = this.method2651(var153.field5268, var153.field5275, 117, var76, var75, var150, arg1, var153.field5273, var153.field5274, (long) var79 + var147);
                class356 var154 = var13[var151];
                this.field6297[var52] = this.method2651(var154.field5268, var154.field5275, 117, var78, var77, var151, arg1, var154.field5273, var154.field5274, (long) var80 + var147);
            } else if (var146 == 1) {
                class468 var155 = var50[var68];
                long var156 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) ((var155.field6890 + 256 << 22) + (var155.field6886 + 256 << 12) + (var71 << 2) + (var155.field6887 <= 0 ? 2048 : 1024));
                this.field6287[var52] = this.method2651(var155.field6887, 0, 110, var74, var73, arg1.field2313[var68], arg1, var155.field6886, var155.field6890, var156);
                this.field6246[var52] = this.method2651(var155.field6887, 0, 116, var76, var75, arg1.field2303[var68], arg1, var155.field6886, var155.field6890, (long) var79 + var156);
                this.field6297[var52] = this.method2651(var155.field6887, 0, 109, var78, var77, arg1.field2350[var68], arg1, var155.field6886, var155.field6890, (long) var80 + var156);
            }
            if (arg1.field2330 == null) {
                this.field6257[var52] = -1;
            } else {
                this.field6257[var52] = arg1.field2330[var68];
            }
            if (arg1.field2302 != null) {
                this.field6298[var52] = arg1.field2302[var68];
            }
            if (arg1.field2314 != null) {
                this.field6235[var52] = arg1.field2314[var68];
            }
            this.field6261[var52] = arg1.field2339[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field6326; var55++) {
            short var67 = this.field6257[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field6304 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field6326; var58++) {
            short var66 = this.field6257[var58];
            if (var57 != var66) {
                this.field6304[var56++] = var58;
                var57 = var66;
            }
        }
        this.field6304[var56] = this.field6326;
        class381.field5602 = null;
        this.field6254 = class372.method2393(this.field6254, (byte) 32, this.field6335);
        this.field6333 = class372.method2393(this.field6333, (byte) 77, this.field6335);
        this.field6277 = class372.method2393(this.field6277, (byte) 51, this.field6335);
        this.field6290 = class129.method943(this.field6335, this.field6290, true);
        this.field6285 = class153.method1104((byte) -73, this.field6285, this.field6335);
        this.field6263 = class153.method1104((byte) -73, this.field6263, this.field6335);
        if (arg1.field2306 != null && class281.method1896(arg2, this.field6308, (byte) 90)) {
            this.field6328 = arg1.method1105(-30839);
        }
        if (arg1.field2307 != null && class533.method3144((byte) -21, this.field6308, arg2)) {
            this.field6292 = arg1.method1113((byte) -104);
        }
        if (arg1.field2343 != null && class46.method314(this.field6308, arg2, -73)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field6294; var61++) {
                int var65 = arg1.field2343[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field6274 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field6274[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field6294; var63++) {
                int var64 = arg1.field2343[var8[var63]];
                if (var64 >= 0) {
                    this.field6274[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
