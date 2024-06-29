import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class378 extends class284 {

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    private int field5307 = 0;

    @OriginalMember(owner = "client!dn", name = "ib", descriptor = "Z")
    private boolean field5345 = false;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    private int field5320 = 0;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "Z")
    private boolean field5312 = false;

    @OriginalMember(owner = "client!dn", name = "eb", descriptor = "I")
    private int field5341 = 0;

    @OriginalMember(owner = "client!dn", name = "ac", descriptor = "I")
    private int field5389 = 0;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "Z")
    private boolean field5299 = true;

    @OriginalMember(owner = "client!dn", name = "cc", descriptor = "Z")
    private boolean field5391 = false;

    @OriginalMember(owner = "client!dn", name = "zc", descriptor = "I")
    private int field5414 = 0;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "Ldw;")
    private class664 field5311;

    @OriginalMember(owner = "client!dn", name = "oc", descriptor = "Lss;")
    private class509 field5403;

    @OriginalMember(owner = "client!dn", name = "Z", descriptor = "Lss;")
    private class509 field5336;

    @OriginalMember(owner = "client!dn", name = "Ib", descriptor = "Lss;")
    private class509 field5371;

    @OriginalMember(owner = "client!dn", name = "Hb", descriptor = "Lss;")
    private class509 field5370;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "Lfr;")
    private class655 field5298;

    @OriginalMember(owner = "client!dn", name = "nb", descriptor = "I")
    private int field5350;

    @OriginalMember(owner = "client!dn", name = "hb", descriptor = "I")
    private int field5344;

    @OriginalMember(owner = "client!dn", name = "ob", descriptor = "[I")
    private int[] field5351;

    @OriginalMember(owner = "client!dn", name = "Bb", descriptor = "[S")
    private short[] field5364;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "[I")
    private int[] field5321;

    @OriginalMember(owner = "client!dn", name = "kc", descriptor = "[I")
    private int[] field5399;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "[I")
    private int[] field5309;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "[Lmv;")
    private class44[] field5308;

    @OriginalMember(owner = "client!dn", name = "Cc", descriptor = "[Lnba;")
    private class491[] field5417;

    @OriginalMember(owner = "client!dn", name = "V", descriptor = "I")
    private int field5332;

    @OriginalMember(owner = "client!dn", name = "gb", descriptor = "[Lps;")
    private class435[] field5343;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "[Lpi;")
    private class253[] field5314;

    @OriginalMember(owner = "client!dn", name = "kb", descriptor = "S")
    private short field5347;

    @OriginalMember(owner = "client!dn", name = "sc", descriptor = "[S")
    private short[] field5407;

    @OriginalMember(owner = "client!dn", name = "Dc", descriptor = "[S")
    private short[] field5418;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "[B")
    private byte[] field5310;

    @OriginalMember(owner = "client!dn", name = "tb", descriptor = "S")
    private short field5356;

    @OriginalMember(owner = "client!dn", name = "Y", descriptor = "[S")
    private short[] field5335;

    @OriginalMember(owner = "client!dn", name = "dc", descriptor = "[S")
    private short[] field5392;

    @OriginalMember(owner = "client!dn", name = "Mb", descriptor = "[B")
    private byte[] field5375;

    @OriginalMember(owner = "client!dn", name = "qc", descriptor = "[S")
    private short[] field5405;

    @OriginalMember(owner = "client!dn", name = "ab", descriptor = "[S")
    private short[] field5337;

    @OriginalMember(owner = "client!dn", name = "cb", descriptor = "[S")
    private short[] field5339;

    @OriginalMember(owner = "client!dn", name = "Vb", descriptor = "[F")
    private float[] field5384;

    @OriginalMember(owner = "client!dn", name = "rc", descriptor = "[S")
    private short[] field5406;

    @OriginalMember(owner = "client!dn", name = "db", descriptor = "[S")
    private short[] field5340;

    @OriginalMember(owner = "client!dn", name = "nc", descriptor = "[S")
    private short[] field5402;

    @OriginalMember(owner = "client!dn", name = "yc", descriptor = "[F")
    private float[] field5413;

    @OriginalMember(owner = "client!dn", name = "lb", descriptor = "[I")
    private int[] field5348;

    @OriginalMember(owner = "client!dn", name = "fc", descriptor = "[[I")
    private int[][] field5394;

    @OriginalMember(owner = "client!dn", name = "Ub", descriptor = "[[I")
    private int[][] field5383;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "[[I")
    private int[][] field5306;

    @OriginalMember(owner = "client!dn", name = "R", descriptor = "B")
    private byte field5328;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!dn", name = "Q", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!dn", name = "S", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!dn", name = "T", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!dn", name = "U", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!dn", name = "W", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!dn", name = "X", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!dn", name = "bb", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!dn", name = "jb", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!dn", name = "mb", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!dn", name = "pb", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!dn", name = "qb", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!dn", name = "rb", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!dn", name = "sb", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!dn", name = "vb", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!dn", name = "xb", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!dn", name = "yb", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!dn", name = "zb", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!dn", name = "Ab", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!dn", name = "Db", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!dn", name = "Eb", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!dn", name = "Fb", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!dn", name = "Gb", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!dn", name = "Jb", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!dn", name = "Kb", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!dn", name = "Lb", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!dn", name = "Ob", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!dn", name = "Pb", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!dn", name = "Qb", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!dn", name = "Sb", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!dn", name = "Tb", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!dn", name = "Wb", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!dn", name = "Xb", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!dn", name = "Yb", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!dn", name = "bc", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!dn", name = "ec", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!dn", name = "gc", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!dn", name = "hc", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!dn", name = "ic", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!dn", name = "jc", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!dn", name = "lc", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!dn", name = "mc", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!dn", name = "pc", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!dn", name = "tc", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!dn", name = "uc", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!dn", name = "vc", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!dn", name = "wc", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!dn", name = "xc", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!dn", name = "Ac", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!dn", name = "Bc", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "Lpa;")
    private class399 field5317;

    @OriginalMember(owner = "client!dn", name = "Rb", descriptor = "Lbia;")
    private class411 field5380;

    @OriginalMember(owner = "client!dn", name = "Nb", descriptor = "Lee;")
    private class513 field5376;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "S")
    private short field5319;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "S")
    private short field5322;

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "S")
    private short field5326;

    @OriginalMember(owner = "client!dn", name = "fb", descriptor = "S")
    private short field5342;

    @OriginalMember(owner = "client!dn", name = "ub", descriptor = "S")
    private short field5357;

    @OriginalMember(owner = "client!dn", name = "wb", descriptor = "S")
    private short field5359;

    @OriginalMember(owner = "client!dn", name = "Cb", descriptor = "S")
    private short field5365;

    @OriginalMember(owner = "client!dn", name = "Zb", descriptor = "S")
    private short field5388;

    @OriginalMember(owner = "client!dn", name = "V", descriptor = "()I")
    public final int method1678() {
        if (!this.field5391) {
            this.method2360(-116);
        }
        field5398++;
        return this.field5326;
    }

    @OriginalMember(owner = "client!dn", name = "FA", descriptor = "(I)V")
    public final void method1694(int arg0) {
        field5363++;
        int var2 = class24.field312[arg0];
        int var3 = class24.field308[arg0];
        for (int var4 = 0; var4 < this.field5389; var4++) {
            int var5 = this.field5309[var4] * var3 - this.field5321[var4] * var2 >> 14;
            this.field5321[var4] = this.field5309[var4] * var2 + (this.field5321[var4] * var3) >> 14;
            this.field5309[var4] = var5;
        }
        if (this.field5403 != null) {
            this.field5403.field7060 = null;
        }
        this.field5391 = false;
    }

    @OriginalMember(owner = "client!dn", name = "ua", descriptor = "()I")
    public final int method1703() {
        field5354++;
        return this.field5344;
    }

    @OriginalMember(owner = "client!dn", name = "NA", descriptor = "()Z")
    public final boolean method1656() {
        field5352++;
        if (this.field5394 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5320; var1++) {
            this.field5399[var1] <<= 0x4;
            this.field5309[var1] <<= 0x4;
            this.field5321[var1] <<= 0x4;
        }
        class529.field7331 = 0;
        class450.field6248 = 0;
        class150.field2068 = 0;
        return true;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILih;ZII)Z")
    public final boolean method1653(int arg0, int arg1, class744 arg2, boolean arg3, int arg4, int arg5) {
        field5369++;
        return this.method2372(arg5, arg0, arg4, arg2, arg3, 13878, arg1);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILdn;ZLdn;ZI)Lka;")
    private final class284 method2359(int arg0, class378 arg1, boolean arg2, class378 arg3, boolean arg4, int arg5) {
        arg3.field5350 = this.field5350;
        if ((arg5 & 0x100) == 0) {
            arg3.field5345 = this.field5345;
        } else {
            arg3.field5345 = true;
        }
        arg3.field5328 = 0;
        arg3.field5320 = this.field5320;
        field5390++;
        arg3.field5332 = this.field5332;
        arg3.field5347 = this.field5347;
        arg3.field5307 = this.field5307;
        arg3.field5389 = this.field5389;
        arg3.field5312 = this.field5312;
        arg3.field5344 = arg5;
        arg3.field5341 = this.field5341;
        arg3.field5414 = this.field5414;
        arg3.field5356 = this.field5356;
        boolean var7 = class352.method2272(this.field5350, -84, arg5);
        boolean var8 = class429.method2660(arg5, (byte) -47, this.field5350);
        boolean var9 = class35.method189(true, this.field5350, arg5);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg3.field5399 = this.field5399;
            } else if (arg1.field5399 == null || arg1.field5399.length < this.field5320) {
                arg3.field5399 = arg1.field5399 = new int[this.field5320];
            } else {
                arg3.field5399 = arg1.field5399;
            }
            if (!var8) {
                arg3.field5309 = this.field5309;
            } else if (arg1.field5309 == null || arg1.field5309.length < this.field5320) {
                arg3.field5309 = arg1.field5309 = new int[this.field5320];
            } else {
                arg3.field5309 = arg1.field5309;
            }
            if (!var9) {
                arg3.field5321 = this.field5321;
            } else if (arg1.field5321 == null || this.field5320 > arg1.field5321.length) {
                arg3.field5321 = arg1.field5321 = new int[this.field5320];
            } else {
                arg3.field5321 = arg1.field5321;
            }
            for (int var11 = 0; var11 < this.field5320; var11++) {
                if (var7) {
                    arg3.field5399[var11] = this.field5399[var11];
                }
                if (var8) {
                    arg3.field5309[var11] = this.field5309[var11];
                }
                if (var9) {
                    arg3.field5321[var11] = this.field5321[var11];
                }
            }
        } else {
            arg3.field5399 = this.field5399;
            arg3.field5309 = this.field5309;
            arg3.field5321 = this.field5321;
        }
        if (class639.method3568((byte) 120, this.field5350, arg5)) {
            arg3.field5403 = arg1.field5403;
            if (arg4) {
                arg3.field5328 = (byte) (arg3.field5328 | 0x1);
            }
            arg3.field5403.field7060 = this.field5403.field7060;
            arg3.field5403.field7062 = this.field5403.field7062;
        } else if (class268.method1818(this.field5350, (byte) -115, arg5)) {
            arg3.field5403 = this.field5403;
        } else {
            arg3.field5403 = null;
        }
        if (class523.method3112(this.field5350, arg0 - 22012, arg5)) {
            if (arg1.field5406 == null || arg1.field5406.length < this.field5341) {
                arg3.field5406 = arg1.field5406 = new short[this.field5341];
            } else {
                arg3.field5406 = arg1.field5406;
            }
            for (int var12 = 0; var12 < this.field5341; var12++) {
                arg3.field5406[var12] = this.field5406[var12];
            }
        } else {
            arg3.field5406 = this.field5406;
        }
        if (class343.method2197(arg0 ^ 0x55A9, this.field5350, arg5)) {
            if (arg1.field5375 == null || arg1.field5375.length < this.field5341) {
                arg3.field5375 = arg1.field5375 = new byte[this.field5341];
            } else {
                arg3.field5375 = arg1.field5375;
            }
            for (int var13 = 0; var13 < this.field5341; var13++) {
                arg3.field5375[var13] = this.field5375[var13];
            }
        } else {
            arg3.field5375 = this.field5375;
        }
        if (class489.method2970(true, arg5, this.field5350)) {
            if (arg4) {
                arg3.field5328 = (byte) (arg3.field5328 | 0x2);
            }
            arg3.field5370 = arg1.field5370;
            arg3.field5370.field7060 = this.field5370.field7060;
            arg3.field5370.field7062 = this.field5370.field7062;
        } else if (class324.method2077(-1, this.field5350, arg5)) {
            arg3.field5370 = this.field5370;
        } else {
            arg3.field5370 = null;
        }
        if (class670.method3782(this.field5350, 544, arg5)) {
            if (arg1.field5402 == null || arg1.field5402.length < this.field5414) {
                int var14 = this.field5414;
                arg3.field5402 = arg1.field5402 = new short[var14];
                arg3.field5337 = arg1.field5337 = new short[var14];
                arg3.field5340 = arg1.field5340 = new short[var14];
            } else {
                arg3.field5402 = arg1.field5402;
                arg3.field5337 = arg1.field5337;
                arg3.field5340 = arg1.field5340;
            }
            if (this.field5376 == null) {
                for (int var18 = 0; var18 < this.field5414; var18++) {
                    arg3.field5402[var18] = this.field5402[var18];
                    arg3.field5337[var18] = this.field5337[var18];
                    arg3.field5340[var18] = this.field5340[var18];
                }
            } else {
                if (arg1.field5376 == null) {
                    arg1.field5376 = new class513();
                }
                class513 var15 = arg3.field5376 = arg1.field5376;
                if (var15.field7092 == null || var15.field7092.length < this.field5414) {
                    int var16 = this.field5414;
                    var15.field7090 = new short[var16];
                    var15.field7092 = new short[var16];
                    var15.field7089 = new byte[var16];
                    var15.field7086 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field5414; var17++) {
                    arg3.field5402[var17] = this.field5402[var17];
                    arg3.field5337[var17] = this.field5337[var17];
                    arg3.field5340[var17] = this.field5340[var17];
                    var15.field7092[var17] = this.field5376.field7092[var17];
                    var15.field7090[var17] = this.field5376.field7090[var17];
                    var15.field7086[var17] = this.field5376.field7086[var17];
                    var15.field7089[var17] = this.field5376.field7089[var17];
                }
            }
            arg3.field5310 = this.field5310;
        } else {
            arg3.field5337 = this.field5337;
            arg3.field5402 = this.field5402;
            arg3.field5340 = this.field5340;
            arg3.field5310 = this.field5310;
            arg3.field5376 = this.field5376;
        }
        if (class381.method2386((byte) -124, arg5, this.field5350)) {
            arg3.field5371 = arg1.field5371;
            if (arg4) {
                arg3.field5328 = (byte) (arg3.field5328 | 0x4);
            }
            arg3.field5371.field7062 = this.field5371.field7062;
            arg3.field5371.field7060 = this.field5371.field7060;
        } else if (class694.method3924(this.field5350, arg5, arg0 - 19963)) {
            arg3.field5371 = this.field5371;
        } else {
            arg3.field5371 = null;
        }
        if (class525.method3122(6, this.field5350, arg5)) {
            if (arg1.field5413 == null || arg1.field5413.length < this.field5341) {
                int var19 = this.field5414;
                arg3.field5413 = arg1.field5413 = new float[var19];
                arg3.field5384 = arg1.field5384 = new float[var19];
            } else {
                arg3.field5413 = arg1.field5413;
                arg3.field5384 = arg1.field5384;
            }
            for (int var20 = 0; var20 < this.field5414; var20++) {
                arg3.field5413[var20] = this.field5413[var20];
                arg3.field5384[var20] = this.field5384[var20];
            }
        } else {
            arg3.field5413 = this.field5413;
            arg3.field5384 = this.field5384;
        }
        if (class383.method2404(85, this.field5350, arg5)) {
            if (arg4) {
                arg3.field5328 = (byte) (arg3.field5328 | 0x8);
            }
            arg3.field5336 = arg1.field5336;
            arg3.field5336.field7062 = this.field5336.field7062;
            arg3.field5336.field7060 = this.field5336.field7060;
        } else if (class329.method2115(this.field5350, arg5, arg0 ^ 0x55FB)) {
            arg3.field5336 = this.field5336;
        } else {
            arg3.field5336 = null;
        }
        if (class617.method3490(arg5, this.field5350, 0)) {
            if (arg1.field5335 == null || arg1.field5335.length < this.field5341) {
                int var21 = this.field5341;
                arg3.field5335 = arg1.field5335 = new short[var21];
                arg3.field5339 = arg1.field5339 = new short[var21];
                arg3.field5405 = arg1.field5405 = new short[var21];
            } else {
                arg3.field5405 = arg1.field5405;
                arg3.field5335 = arg1.field5335;
                arg3.field5339 = arg1.field5339;
            }
            for (int var22 = 0; var22 < this.field5341; var22++) {
                arg3.field5335[var22] = this.field5335[var22];
                arg3.field5405[var22] = this.field5405[var22];
                arg3.field5339[var22] = this.field5339[var22];
            }
        } else {
            arg3.field5405 = this.field5405;
            arg3.field5339 = this.field5339;
            arg3.field5335 = this.field5335;
        }
        if (class752.method4174(this.field5350, 111, arg5)) {
            arg3.field5298 = arg1.field5298;
            if (arg4) {
                arg3.field5328 = (byte) (arg3.field5328 | 0x10);
            }
            arg3.field5298.field8754 = this.field5298.field8754;
        } else if (class529.method3143(this.field5350, arg0 ^ 0xFFFFAA35, arg5)) {
            arg3.field5298 = this.field5298;
        } else {
            arg3.field5298 = null;
        }
        if (class65.method523(true, arg5, this.field5350)) {
            if (arg1.field5392 == null || arg1.field5392.length < this.field5341) {
                int var23 = this.field5341;
                arg3.field5392 = arg1.field5392 = new short[var23];
            } else {
                arg3.field5392 = arg1.field5392;
            }
            for (int var24 = 0; var24 < this.field5341; var24++) {
                arg3.field5392[var24] = this.field5392[var24];
            }
        } else {
            arg3.field5392 = this.field5392;
        }
        if (!class720.method4036(arg5, (byte) 64, this.field5350)) {
            arg3.field5343 = this.field5343;
        } else if (arg1.field5343 == null || this.field5332 > arg1.field5343.length) {
            int var26 = this.field5332;
            arg3.field5343 = arg1.field5343 = new class435[var26];
            for (int var27 = 0; var27 < this.field5332; var27++) {
                arg3.field5343[var27] = this.field5343[var27].method2686(17294);
            }
        } else {
            arg3.field5343 = arg1.field5343;
            for (int var25 = 0; var25 < this.field5332; var25++) {
                arg3.field5343[var25].method2685(this.field5343[var25], arg0 - 22101);
            }
        }
        arg3.field5351 = this.field5351;
        arg3.field5418 = this.field5418;
        if (arg0 != 22011) {
            this.method1679();
        }
        arg3.field5417 = this.field5417;
        arg3.field5348 = this.field5348;
        arg3.field5383 = this.field5383;
        if (this.field5391) {
            arg3.field5365 = this.field5365;
            arg3.field5319 = this.field5319;
            arg3.field5322 = this.field5322;
            arg3.field5388 = this.field5388;
            arg3.field5391 = true;
            arg3.field5326 = this.field5326;
            arg3.field5359 = this.field5359;
            arg3.field5342 = this.field5342;
            arg3.field5357 = this.field5357;
        } else {
            arg3.field5391 = false;
        }
        arg3.field5306 = this.field5306;
        arg3.field5314 = this.field5314;
        arg3.field5364 = this.field5364;
        arg3.field5394 = this.field5394;
        arg3.field5308 = this.field5308;
        arg3.field5407 = this.field5407;
        return arg3;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "()V")
    public final void method1679() {
        field5401++;
    }

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "(I)V")
    public final void method1691(int arg0) {
        field5349++;
        this.field5344 = arg0;
        this.field5299 = true;
        if (this.field5376 != null && (this.field5344 & 0x10000) == 0) {
            this.field5310 = this.field5376.field7089;
            this.field5340 = this.field5376.field7086;
            this.field5337 = this.field5376.field7090;
            this.field5402 = this.field5376.field7092;
            this.field5376 = null;
        }
        this.method2363((byte) -39);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lih;IZ)V")
    public final void method1699(class744 arg0, int arg1, boolean arg2) {
        field5409++;
        if (this.field5364 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field5389; var5++) {
            if ((arg1 & this.field5364[var5]) != 0) {
                if (arg2) {
                    arg0.method899(this.field5399[var5], this.field5309[var5], this.field5321[var5], var4);
                } else {
                    arg0.method881(this.field5399[var5], this.field5309[var5], this.field5321[var5], var4);
                }
                this.field5399[var5] = var4[0];
                this.field5309[var5] = var4[1];
                this.field5321[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "(IIII)V")
    public final void method1684(int arg0, int arg1, int arg2, int arg3) {
        field5366++;
        if (arg0 == 0) {
            class450.field6248 = 0;
            int var5 = 0;
            class150.field2068 = 0;
            class529.field7331 = 0;
            for (int var6 = 0; var6 < this.field5389; var6++) {
                class150.field2068 += this.field5399[var6];
                class529.field7331 += this.field5309[var6];
                var5++;
                class450.field6248 += this.field5321[var6];
            }
            if (var5 > 0) {
                class150.field2068 = class150.field2068 / var5 + arg1;
                class529.field7331 = class529.field7331 / var5 + arg2;
                class450.field6248 = class450.field6248 / var5 + arg3;
            } else {
                class529.field7331 = arg2;
                class150.field2068 = arg1;
                class450.field6248 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5389; var7++) {
                this.field5399[var7] += arg1;
                this.field5309[var7] += arg2;
                this.field5321[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5389; var8++) {
                this.field5399[var8] -= class150.field2068;
                this.field5309[var8] -= class529.field7331;
                this.field5321[var8] -= class450.field6248;
                if (arg3 != 0) {
                    int var9 = class24.field312[arg3];
                    int var10 = class24.field308[arg3];
                    int var11 = this.field5309[var8] * var9 + (this.field5399[var8] * var10) + 16383 >> 14;
                    this.field5309[var8] = this.field5309[var8] * var10 + 16383 - this.field5399[var8] * var9 >> 14;
                    this.field5399[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class24.field312[arg1];
                    int var13 = class24.field308[arg1];
                    int var14 = this.field5309[var8] * var13 + 16383 - (this.field5321[var8] * var12) >> 14;
                    this.field5321[var8] = this.field5321[var8] * var13 + this.field5309[var8] * var12 + 16383 >> 14;
                    this.field5309[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class24.field312[arg2];
                    int var16 = class24.field308[arg2];
                    int var17 = this.field5321[var8] * var15 + this.field5399[var8] * var16 + 16383 >> 14;
                    this.field5321[var8] = this.field5321[var8] * var16 + 16383 - (this.field5399[var8] * var15) >> 14;
                    this.field5399[var8] = var17;
                }
                this.field5399[var8] += class150.field2068;
                this.field5309[var8] += class529.field7331;
                this.field5321[var8] += class450.field6248;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5389; var18++) {
                this.field5399[var18] -= class150.field2068;
                this.field5309[var18] -= class529.field7331;
                this.field5321[var18] -= class450.field6248;
                this.field5399[var18] = this.field5399[var18] * arg1 / 128;
                this.field5309[var18] = this.field5309[var18] * arg2 / 128;
                this.field5321[var18] = this.field5321[var18] * arg3 / 128;
                this.field5399[var18] += class150.field2068;
                this.field5309[var18] += class529.field7331;
                this.field5321[var18] += class450.field6248;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5341; var19++) {
                int var23 = (this.field5375[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5375[var19] = (byte) var23;
            }
            if (this.field5370 != null) {
                this.field5370.field7060 = null;
            }
            if (this.field5314 != null) {
                for (int var20 = 0; var20 < this.field5332; var20++) {
                    class253 var21 = this.field5314[var20];
                    class435 var22 = this.field5343[var20];
                    var22.field6071 = 255 - (this.field5375[var21.field3709] & 0xFF) << 24 | var22.field6071 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5341; var24++) {
                int var28 = this.field5406[var24] & 0xFFFF;
                int var29 = (var28 & 0xFD4E) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field5406[var24] = (short) class678.method3817(class678.method3817(var32 << 10, var33 << 7), var34);
            }
            if (this.field5370 != null) {
                this.field5370.field7060 = null;
            }
            if (this.field5314 != null) {
                for (int var25 = 0; var25 < this.field5332; var25++) {
                    class253 var26 = this.field5314[var25];
                    class435 var27 = this.field5343[var25];
                    var27.field6071 = var27.field6071 & 0xFF000000 | class577.field7932[this.field5406[var26.field3709] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5332; var35++) {
                class435 var36 = this.field5343[var35];
                var36.field6061 += arg1;
                var36.field6070 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5332; var37++) {
                class435 var38 = this.field5343[var37];
                var38.field6073 = var38.field6073 * arg2 >> 7;
                var38.field6064 = var38.field6064 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5332; var39++) {
                class435 var40 = this.field5343[var39];
                var40.field6062 = var40.field6062 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "ia", descriptor = "(SS)V")
    public final void method1660(short arg0, short arg1) {
        field5379++;
        for (int var3 = 0; var3 < this.field5341; var3++) {
            if (this.field5406[var3] == arg0) {
                this.field5406[var3] = arg1;
            }
        }
        if (this.field5314 != null) {
            for (int var4 = 0; var4 < this.field5332; var4++) {
                class253 var5 = this.field5314[var4];
                class435 var6 = this.field5343[var4];
                var6.field6071 = class577.field7932[this.field5406[var5.field3709] & 0xFFFF] & 0xFFFFFF | var6.field6071 & 0xFF000000;
            }
        }
        if (this.field5370 != null) {
            this.field5370.field7060 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "()[Lnba;")
    public final class491[] method1688() {
        field5400++;
        return this.field5417;
    }

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "(III)V")
    public final void method1663(int arg0, int arg1, int arg2) {
        field5396++;
        for (int var4 = 0; var4 < this.field5389; var4++) {
            if (arg0 != 128) {
                this.field5399[var4] = this.field5399[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5309[var4] = this.field5309[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field5321[var4] = this.field5321[var4] * arg2 >> 7;
            }
        }
        if (this.field5403 != null) {
            this.field5403.field7060 = null;
        }
        this.field5391 = false;
    }

    @OriginalMember(owner = "client!dn", name = "aa", descriptor = "(SS)V")
    public final void method1665(short arg0, short arg1) {
        field5361++;
        class270 var3 = this.field5311.field7623;
        for (int var4 = 0; var4 < this.field5341; var4++) {
            if (this.field5392[var4] == arg0) {
                this.field5392[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class239 var7 = var3.method521(arg0 & 0xFFFF, 109);
            var5 = var7.field3570;
            var6 = var7.field3578;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class239 var10 = var3.method521(arg1 & 0xFFFF, 123);
            var9 = var10.field3578;
            if (var10.field3579 != 0 || var10.field3573 != 0) {
                this.field5312 = true;
            }
            var8 = var10.field3570;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field5314 != null) {
            for (int var11 = 0; var11 < this.field5332; var11++) {
                class253 var12 = this.field5314[var11];
                class435 var13 = this.field5343[var11];
                var13.field6071 = class577.field7932[this.field5406[var12.field3709] & 0xFFFF] & 0xFFFFFF | var13.field6071 & 0xFF000000;
            }
        }
        if (this.field5370 != null) {
            this.field5370.field7060 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
    private final void method2360(int arg0) {
        field5382++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        if (arg0 > -112) {
            this.field5307 = 42;
        }
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5389; var10++) {
            int var11 = this.field5399[var10];
            int var12 = this.field5309[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field5321[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var2 > var11) {
                var2 = var11;
            }
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
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field5319 = (short) var3;
        this.field5388 = (short) var7;
        this.field5326 = (short) var2;
        this.field5357 = (short) var4;
        this.field5359 = (short) var5;
        this.field5322 = (short) var6;
        this.field5342 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field5365 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field5391 = true;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lih;Lkia;II)V")
    public final void method1682(class744 arg0, class574 arg1, int arg2, int arg3) {
        field5408++;
        if (this.field5414 == 0) {
            return;
        }
        class480 var5 = this.field5311.field9038;
        class480 var6 = (class480) arg0;
        if (!this.field5391) {
            this.method2360(-117);
        }
        class433.field6042 = var5.field6673 * var6.field6670 + var5.field6692 * var6.field6704 + var5.field6670 * var6.field6689;
        class445.field6176 = var5.field6673 * var6.field6700 + var5.field6692 * var6.field6702 + var5.field6670 * var6.field6681 + var5.field6700;
        float var7 = (float) this.field5319 * class433.field6042 + class445.field6176;
        float var8 = (float) this.field5322 * class433.field6042 + class445.field6176;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var10 = (float) this.field5342 + var7;
            var9 = var8 - (float) this.field5342;
        } else {
            var9 = var7 - (float) this.field5342;
            var10 = (float) this.field5342 + var8;
        }
        if ((var9 >= this.field5311.field9046) || ((float) this.field5311.field9076 >= var10)) {
            return;
        }
        class463.field6451 = var5.field6697 * var6.field6670 + var5.field6704 * var6.field6689 + var5.field6696 * var6.field6704;
        class35.field453 = var5.field6697 * var6.field6700 + var5.field6704 * var6.field6681 + var5.field6696 * var6.field6702 + var5.field6702;
        float var11 = (float) this.field5319 * class463.field6451 + class35.field453;
        float var12 = (float) this.field5322 * class463.field6451 + class35.field453;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = ((float) this.field5342 + var11) * (float) this.field5311.field9072;
            var14 = ((float) (-this.field5342) + var12) * (float) this.field5311.field9072;
        } else {
            var13 = ((float) this.field5342 + var12) * (float) this.field5311.field9072;
            var14 = ((float) (-this.field5342) + var11) * (float) this.field5311.field9072;
        }
        if ((var14 / (float) arg2 >= this.field5311.field9102) || (var13 / (float) arg2 <= this.field5311.field9120)) {
            return;
        }
        class367.field5207 = var5.field6705 * var6.field6670 + var5.field6689 * var6.field6689 + var5.field6669 * var6.field6704;
        class78.field1128 = var5.field6705 * var6.field6700 + var5.field6689 * var6.field6681 + var5.field6669 * var6.field6702 + var5.field6681;
        float var15 = (float) this.field5319 * class367.field5207 + class78.field1128;
        float var16 = (float) this.field5322 * class367.field5207 + class78.field1128;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) this.field5342 + var15) * (float) this.field5311.field9087;
            var18 = ((float) (-this.field5342) + var16) * (float) this.field5311.field9087;
        } else {
            var18 = (var15 - (float) this.field5342) * (float) this.field5311.field9087;
            var17 = ((float) this.field5342 + var16) * (float) this.field5311.field9087;
        }
        if ((this.field5311.field9065 <= var18 / (float) arg2) || (var17 / (float) arg2 <= this.field5311.field9153)) {
            return;
        }
        if (arg1 != null || this.field5314 != null) {
            class75.field1103 = var5.field6697 * var6.field6692 + var5.field6704 * var6.field6669 + var5.field6696 * var6.field6696;
            class710.field9902 = var5.field6673 * var6.field6673 + var5.field6692 * var6.field6697 + var5.field6670 * var6.field6705;
            class688.field9571 = var5.field6705 * var6.field6692 + var5.field6689 * var6.field6669 + var5.field6669 * var6.field6696;
            class495.field6929 = var5.field6697 * var6.field6673 + var5.field6704 * var6.field6705 + var5.field6696 * var6.field6697;
            class379.field5425 = var5.field6705 * var6.field6673 + var5.field6689 * var6.field6705 + var5.field6669 * var6.field6697;
            class550.field7641 = var5.field6673 * var6.field6692 + var5.field6692 * var6.field6696 + var5.field6670 * var6.field6669;
        }
        if (arg1 != null) {
            int var19 = this.field5359 + this.field5326 >> 1;
            int var20 = this.field5357 + this.field5388 >> 1;
            int var21 = (int) ((float) var20 * class495.field6929 + (float) this.field5319 * class463.field6451 + (float) var19 * class75.field1103 + class35.field453);
            int var22 = (int) ((float) var20 * class379.field5425 + (float) this.field5319 * class367.field5207 + (float) var19 * class688.field9571 + class78.field1128);
            int var23 = (int) ((float) var20 * class710.field9902 + (float) this.field5319 * class433.field6042 + (float) var19 * class550.field7641 + class445.field6176);
            int var24 = (int) ((float) var20 * class495.field6929 + (float) this.field5322 * class463.field6451 + (float) var19 * class75.field1103 + class35.field453);
            int var25 = (int) ((float) var20 * class379.field5425 + (float) this.field5322 * class367.field5207 + (float) var19 * class688.field9571 + class78.field1128);
            arg1.field7912 = this.field5311.field9087 * var25 / arg2 + this.field5311.field9054;
            int var26 = (int) ((float) var20 * class710.field9902 + (float) this.field5322 * class433.field6042 + (float) var19 * class550.field7641 + class445.field6176);
            arg1.field7911 = this.field5311.field9072 * var21 / arg2 + this.field5311.field9112;
            arg1.field7909 = this.field5311.field9054 + (this.field5311.field9087 * var22 / arg2);
            arg1.field7913 = this.field5311.field9112 + (this.field5311.field9072 * var24 / arg2);
            if (this.field5311.field9076 <= var23 || var26 >= this.field5311.field9076) {
                arg1.field7910 = true;
                arg1.field7914 = this.field5311.field9112 + ((this.field5342 + var21) * this.field5311.field9072 / arg2) - arg1.field7911;
            }
        }
        this.field5311.method3706(3, (float) arg2);
        this.field5311.method3740((byte) 48);
        this.field5311.method3722(0, var6);
        this.method2367(-13072);
        this.field5311.method3746(-128);
        this.method2361(-31757);
    }

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "(I)V")
    public final void method1670(int arg0) {
        this.field5356 = (short) arg0;
        field5333++;
        if (this.field5370 != null) {
            this.field5370.field7060 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILih;ZI)Z")
    public final boolean method1669(int arg0, int arg1, class744 arg2, boolean arg3, int arg4) {
        field5416++;
        return this.method2372(-1, arg0, arg4, arg2, arg3, 13878, arg1);
    }

    @OriginalMember(owner = "client!dn", name = "WA", descriptor = "()I")
    public final int method1685() {
        field5373++;
        return this.field5356;
    }

    @OriginalMember(owner = "client!dn", name = "RA", descriptor = "()I")
    public final int method1655() {
        field5360++;
        if (!this.field5391) {
            this.method2360(-119);
        }
        return this.field5359;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lih;Lkia;I)V")
    public final void method1686(class744 arg0, class574 arg1, int arg2) {
        field5374++;
        if (this.field5414 == 0) {
            return;
        }
        class480 var4 = this.field5311.field9038;
        if (!this.field5391) {
            this.method2360(-128);
        }
        class480 var5 = (class480) arg0;
        class445.field6176 = var4.field6673 * var5.field6700 + var4.field6692 * var5.field6702 + var4.field6670 * var5.field6681 + var4.field6700;
        class433.field6042 = var4.field6673 * var5.field6670 + var4.field6692 * var5.field6704 + var4.field6670 * var5.field6689;
        float var6 = (float) this.field5319 * class433.field6042 + class445.field6176;
        float var7 = (float) this.field5322 * class433.field6042 + class445.field6176;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var9 = (float) (-this.field5342) + var7;
            var8 = (float) this.field5342 + var6;
        } else {
            var8 = (float) this.field5342 + var7;
            var9 = (float) (-this.field5342) + var6;
        }
        if ((this.field5311.field9066 <= var9) || (var8 <= (float) this.field5311.field9076)) {
            return;
        }
        class463.field6451 = var4.field6697 * var5.field6670 + var4.field6704 * var5.field6689 + var4.field6696 * var5.field6704;
        class35.field453 = var4.field6697 * var5.field6700 + var4.field6704 * var5.field6681 + var4.field6696 * var5.field6702 + var4.field6702;
        float var10 = (float) this.field5319 * class463.field6451 + class35.field453;
        float var11 = (float) this.field5322 * class463.field6451 + class35.field453;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) this.field5342 + var10) * (float) this.field5311.field9072;
            var13 = ((float) (-this.field5342) + var11) * (float) this.field5311.field9072;
        } else {
            var12 = ((float) this.field5342 + var11) * (float) this.field5311.field9072;
            var13 = ((float) (-this.field5342) + var10) * (float) this.field5311.field9072;
        }
        if ((var13 / var8 >= this.field5311.field9102) || (var12 / var8 <= this.field5311.field9120)) {
            return;
        }
        class367.field5207 = var4.field6705 * var5.field6670 + var4.field6689 * var5.field6689 + var4.field6669 * var5.field6704;
        class78.field1128 = var4.field6705 * var5.field6700 + var4.field6689 * var5.field6681 + var4.field6669 * var5.field6702 + var4.field6681;
        float var14 = (float) this.field5319 * class367.field5207 + class78.field1128;
        float var15 = (float) this.field5322 * class367.field5207 + class78.field1128;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) this.field5342 + var14) * (float) this.field5311.field9087;
            var17 = ((float) (-this.field5342) + var15) * (float) this.field5311.field9087;
        } else {
            var17 = ((float) (-this.field5342) + var14) * (float) this.field5311.field9087;
            var16 = ((float) this.field5342 + var15) * (float) this.field5311.field9087;
        }
        if ((this.field5311.field9065 <= var17 / var8) || (this.field5311.field9153 >= var16 / var8)) {
            return;
        }
        if (arg1 != null || this.field5314 != null) {
            class75.field1103 = var4.field6697 * var5.field6692 + var4.field6704 * var5.field6669 + var4.field6696 * var5.field6696;
            class550.field7641 = var4.field6673 * var5.field6692 + var4.field6692 * var5.field6696 + var4.field6670 * var5.field6669;
            class495.field6929 = var4.field6697 * var5.field6673 + var4.field6704 * var5.field6705 + var4.field6696 * var5.field6697;
            class688.field9571 = var4.field6705 * var5.field6692 + var4.field6689 * var5.field6669 + var4.field6669 * var5.field6696;
            class710.field9902 = var4.field6673 * var5.field6673 + var4.field6692 * var5.field6697 + var4.field6670 * var5.field6705;
            class379.field5425 = var4.field6705 * var5.field6673 + var4.field6689 * var5.field6705 + var4.field6669 * var5.field6697;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5326 + this.field5359 >> 1;
            int var21 = this.field5388 + this.field5357 >> 1;
            int var22 = (int) ((float) var21 * class495.field6929 + (float) this.field5319 * class463.field6451 + (float) var20 * class75.field1103 + class35.field453);
            int var23 = (int) ((float) var21 * class379.field5425 + (float) this.field5319 * class367.field5207 + (float) var20 * class688.field9571 + class78.field1128);
            int var24 = (int) ((float) var21 * class710.field9902 + (float) this.field5319 * class433.field6042 + (float) var20 * class550.field7641 + class445.field6176);
            if (var24 < this.field5311.field9076) {
                var18 = true;
            } else {
                arg1.field7911 = this.field5311.field9072 * var22 / var24 + this.field5311.field9112;
                arg1.field7909 = this.field5311.field9087 * var23 / var24 + this.field5311.field9054;
            }
            int var25 = (int) ((float) var21 * class495.field6929 + (float) this.field5322 * class463.field6451 + (float) var20 * class75.field1103 + class35.field453);
            int var26 = (int) ((float) var21 * class379.field5425 + (float) this.field5322 * class367.field5207 + (float) var20 * class688.field9571 + class78.field1128);
            int var27 = (int) ((float) var21 * class710.field9902 + (float) this.field5322 * class433.field6042 + (float) var20 * class550.field7641 + class445.field6176);
            if (var27 >= this.field5311.field9076) {
                arg1.field7913 = this.field5311.field9072 * var25 / var27 + this.field5311.field9112;
                arg1.field7912 = this.field5311.field9087 * var26 / var27 + this.field5311.field9054;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field5311.field9076 && this.field5311.field9076 > var27) {
                    var19 = false;
                } else if (this.field5311.field9076 > var24) {
                    int var31 = (var27 - this.field5311.field9076 << 16) / (var27 - var24);
                    int var32 = var25 + ((var25 - var22) * var31 >> 16);
                    int var33 = var26 + ((var26 - var23) * var31 >> 16);
                    arg1.field7911 = this.field5311.field9112 + (this.field5311.field9072 * var32 / this.field5311.field9076);
                    arg1.field7909 = this.field5311.field9087 * var33 / this.field5311.field9076 + this.field5311.field9054;
                } else if (this.field5311.field9076 > var27) {
                    int var28 = (var24 - this.field5311.field9076 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field7911 = this.field5311.field9072 * var29 / this.field5311.field9076 + this.field5311.field9112;
                    arg1.field7909 = this.field5311.field9054 + (this.field5311.field9087 * var30 / this.field5311.field9076);
                }
            }
            if (var19) {
                if (var27 >= var24) {
                    arg1.field7914 = (var25 + this.field5342) * this.field5311.field9072 / var27 + this.field5311.field9112 - arg1.field7913;
                } else {
                    arg1.field7914 = (this.field5342 + var22) * this.field5311.field9072 / var24 + this.field5311.field9112 - arg1.field7911;
                }
                arg1.field7910 = true;
            }
        }
        this.field5311.method3700(-9);
        this.field5311.method3722(0, var5);
        this.method2367(-13072);
        this.field5311.method3746(-128);
        this.method2361(-31757);
    }

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "()V")
    public final void method1674() {
        field5300++;
        for (int var1 = 0; var1 < this.field5389; var1++) {
            this.field5321[var1] = -this.field5321[var1];
        }
        for (int var2 = 0; var2 < this.field5414; var2++) {
            this.field5340[var2] = (short) (-this.field5340[var2]);
        }
        for (int var3 = 0; var3 < this.field5341; var3++) {
            short var4 = this.field5335[var3];
            this.field5335[var3] = this.field5339[var3];
            this.field5339[var3] = var4;
        }
        if (this.field5371 == null && this.field5370 != null) {
            this.field5370.field7060 = null;
        }
        if (this.field5371 != null) {
            this.field5371.field7060 = null;
        }
        if (this.field5298 != null) {
            this.field5298.field8754 = null;
        }
        if (this.field5403 != null) {
            this.field5403.field7060 = null;
        }
        this.field5391 = false;
    }

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "()Z")
    public final boolean method1689() {
        field5331++;
        return this.field5312;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method1680(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5372++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = 0;
            class529.field7331 = 0;
            class150.field2068 = 0;
            class450.field6248 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field5394.length) {
                    int[] var15 = this.field5394[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class150.field2068 += this.field5399[var17];
                        class529.field7331 += this.field5309[var17];
                        var12++;
                        class450.field6248 += this.field5321[var17];
                    }
                }
            }
            if (var12 > 0) {
                class450.field6248 = class450.field6248 / var12 + var9;
                class529.field7331 = class529.field7331 / var12 + var10;
                class150.field2068 = class150.field2068 / var12 + var11;
            } else {
                class450.field6248 = var9;
                class529.field7331 = var10;
                class150.field2068 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field5394.length > var22) {
                    int[] var23 = this.field5394[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5399[var25] += var20;
                        this.field5309[var25] += var18;
                        this.field5321[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field5394.length) {
                    int[] var46 = this.field5394[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5399[var59] -= class150.field2068;
                            this.field5309[var59] -= class529.field7331;
                            this.field5321[var59] -= class450.field6248;
                            if (arg4 != 0) {
                                int var60 = class24.field312[arg4];
                                int var61 = class24.field308[arg4];
                                int var62 = this.field5309[var59] * var60 + (this.field5399[var59] * var61) + 16383 >> 14;
                                this.field5309[var59] = this.field5309[var59] * var61 + (16383 - (this.field5399[var59] * var60)) >> 14;
                                this.field5399[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class24.field312[arg2];
                                int var64 = class24.field308[arg2];
                                int var65 = this.field5309[var59] * var64 + 16383 - (this.field5321[var59] * var63) >> 14;
                                this.field5321[var59] = this.field5321[var59] * var64 + this.field5309[var59] * var63 + 16383 >> 14;
                                this.field5309[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class24.field312[arg3];
                                int var67 = class24.field308[arg3];
                                int var68 = this.field5399[var59] * var67 + this.field5321[var59] * var66 + 16383 >> 14;
                                this.field5321[var59] = this.field5321[var59] * var67 + 16383 - (this.field5399[var59] * var66) >> 14;
                                this.field5399[var59] = var68;
                            }
                            this.field5399[var59] += class150.field2068;
                            this.field5309[var59] += class529.field7331;
                            this.field5321[var59] += class450.field6248;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5399[var48] -= class150.field2068;
                            this.field5309[var48] -= class529.field7331;
                            this.field5321[var48] -= class450.field6248;
                            if (arg2 != 0) {
                                int var49 = class24.field312[arg2];
                                int var50 = class24.field308[arg2];
                                int var51 = this.field5309[var48] * var50 + 16383 - (this.field5321[var48] * var49) >> 14;
                                this.field5321[var48] = this.field5321[var48] * var50 + this.field5309[var48] * var49 + 16383 >> 14;
                                this.field5309[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class24.field312[arg4];
                                int var53 = class24.field308[arg4];
                                int var54 = this.field5309[var48] * var52 + this.field5399[var48] * var53 + 16383 >> 14;
                                this.field5309[var48] = this.field5309[var48] * var53 + 16383 - this.field5399[var48] * var52 >> 14;
                                this.field5399[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class24.field312[arg3];
                                int var56 = class24.field308[arg3];
                                int var57 = this.field5399[var48] * var56 + this.field5321[var48] * var55 + 16383 >> 14;
                                this.field5321[var48] = this.field5321[var48] * var56 + (16383 - (this.field5399[var48] * var55)) >> 14;
                                this.field5399[var48] = var57;
                            }
                            this.field5399[var48] += class150.field2068;
                            this.field5309[var48] += class529.field7331;
                            this.field5321[var48] += class450.field6248;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field5394.length) {
                        int[] var29 = this.field5394[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5351[var31];
                            int var33 = this.field5351[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5407[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class24.field312[arg4];
                                    int var37 = class24.field308[arg4];
                                    int var38 = this.field5337[var35] * var36 + this.field5402[var35] * var37 + 16383 >> 14;
                                    this.field5337[var35] = (short) (this.field5337[var35] * var37 + 16383 - (this.field5402[var35] * var36) >> 14);
                                    this.field5402[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class24.field312[arg2];
                                    int var40 = class24.field308[arg2];
                                    int var41 = this.field5337[var35] * var40 + 16383 - (this.field5340[var35] * var39) >> 14;
                                    this.field5340[var35] = (short) (this.field5340[var35] * var40 + this.field5337[var35] * var39 + 16383 >> 14);
                                    this.field5337[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class24.field312[arg3];
                                    int var43 = class24.field308[arg3];
                                    int var44 = this.field5402[var35] * var43 + (this.field5340[var35] * var42 + 16383) >> 14;
                                    this.field5340[var35] = (short) (this.field5340[var35] * var43 + 16383 - (this.field5402[var35] * var42) >> 14);
                                    this.field5402[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field5371 == null && this.field5370 != null) {
                    this.field5370.field7060 = null;
                }
                if (this.field5371 != null) {
                    this.field5371.field7060 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field5394.length) {
                    int[] var71 = this.field5394[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5399[var73] -= class150.field2068;
                        this.field5309[var73] -= class529.field7331;
                        this.field5321[var73] -= class450.field6248;
                        this.field5399[var73] = this.field5399[var73] * arg2 >> 7;
                        this.field5309[var73] = this.field5309[var73] * arg3 >> 7;
                        this.field5321[var73] = this.field5321[var73] * arg4 >> 7;
                        this.field5399[var73] += class150.field2068;
                        this.field5309[var73] += class529.field7331;
                        this.field5321[var73] += class450.field6248;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5306 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field5306.length > var78) {
                        int[] var79 = this.field5306[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field5375[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field5375[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field5370 != null) {
                            this.field5370.field7060 = null;
                        }
                    }
                }
                if (this.field5314 != null) {
                    for (int var75 = 0; var75 < this.field5332; var75++) {
                        class253 var76 = this.field5314[var75];
                        class435 var77 = this.field5343[var75];
                        var77.field6071 = var77.field6071 & 0xFFFFFF | 255 - (this.field5375[var76.field3709] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5306 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field5306.length) {
                        int[] var88 = this.field5306[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field5406[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFCE9) >> 10;
                            int var93 = (var91 & 0x3FC) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = var92 + arg2 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            int var97 = arg4 + var94;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field5406[var90] = (short) class678.method3817(class678.method3817(var95 << 10, var96 << 7), var97);
                        }
                        if (var88.length > 0 && this.field5370 != null) {
                            this.field5370.field7060 = null;
                        }
                    }
                }
                if (this.field5314 != null) {
                    for (int var84 = 0; var84 < this.field5332; var84++) {
                        class253 var85 = this.field5314[var84];
                        class435 var86 = this.field5343[var84];
                        var86.field6071 = class577.field7932[this.field5406[var85.field3709] & 0xFFFF] & 0xFFFFFF | var86.field6071 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5383 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field5383.length) {
                        int[] var100 = this.field5383[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class435 var102 = this.field5343[var100[var101]];
                            var102.field6070 += arg3;
                            var102.field6061 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5383 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field5383.length > var104) {
                        int[] var105 = this.field5383[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class435 var107 = this.field5343[var105[var106]];
                            var107.field6064 = var107.field6064 * arg2 >> 7;
                            var107.field6073 = var107.field6073 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5383 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field5383.length > var109) {
                    int[] var110 = this.field5383[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class435 var112 = this.field5343[var110[var111]];
                        var112.field6062 = var112.field6062 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "()I")
    public final int method1666() {
        if (!this.field5391) {
            this.method2360(-125);
        }
        field5362++;
        return this.field5388;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
    private final void method2361(int arg0) {
        if (this.field5314 != null) {
            class480 var2 = this.field5311.field9005;
            this.field5311.method3697(arg0 + 31849);
            this.field5311.method1529(!this.field5345);
            this.field5311.method3680((byte) 106, false);
            this.field5311.method3725(null, (byte) 126, this.field5311.field9142, null, this.field5311.field9085);
            for (int var3 = 0; var3 < this.field5332; var3++) {
                class253 var4 = this.field5314[var3];
                class435 var5 = this.field5343[var3];
                if (!var4.field3713 || !this.field5311.method289()) {
                    float var6 = (float) (this.field5399[var4.field3710] - (-this.field5399[var4.field3711] - this.field5399[var4.field3705])) * 0.3333333F;
                    float var7 = (float) (this.field5309[var4.field3711] + this.field5309[var4.field3705] + this.field5309[var4.field3710]) * 0.3333333F;
                    float var8 = (float) (this.field5321[var4.field3710] + this.field5321[var4.field3705] + this.field5321[var4.field3711]) * 0.3333333F;
                    float var9 = class495.field6929 * var8 + class75.field1103 * var6 + class463.field6451 * var7 + class35.field453;
                    float var10 = class379.field5425 * var8 + class688.field9571 * var6 + class367.field5207 * var7 + class78.field1128;
                    float var11 = class710.field9902 * var8 + class550.field7641 * var6 + class433.field6042 * var7 + class445.field6176;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field3699;
                    var2.method2928((float) var5.field6061 + var9 - (var9 * var12), (byte) 106, var11 * var12 - var11, var4.field3698 * var5.field6073 >> 7, var10 * var12 + ((float) var5.field6070 - var10), var5.field6062, var4.field3700 * var5.field6064 >> 7);
                    this.field5311.method3745(var2, -78);
                    int var13 = var5.field6071;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field5311.method3709((byte) -94, var4.field3712);
                    this.field5311.method3737(0, var4.field3704);
                    this.field5311.method3741(4, 0, 7, 0);
                }
            }
            this.field5311.method1529(true);
            this.field5311.method3746(-128);
        }
        if (arg0 != -31757) {
            this.field5340 = null;
        }
        field5412++;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "()V")
    public final void method1667() {
        field5334++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)V")
    private final void method2362(boolean arg0, int arg1) {
        field5329++;
        boolean var3 = this.field5370 != null && this.field5370.field7060 == null;
        boolean var4 = this.field5371 != null && this.field5371.field7060 == null;
        boolean var5 = this.field5403 != null && this.field5403.field7060 == null;
        boolean var6 = this.field5336 != null && this.field5336.field7060 == null;
        if (arg0) {
            var5 &= (this.field5328 & 0x1) != 0;
            var3 &= (this.field5328 & 0x2) != 0;
            var6 &= (this.field5328 & 0x8) != 0;
            var4 &= (this.field5328 & 0x4) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 >= -106) {
            this.field5299 = true;
        }
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
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
        if (this.field5311.field9117.field954.length < (this.field5414 * var7)) {
            this.field5311.field9117 = new class172((this.field5414 + 100) * var7);
        } else {
            this.field5311.field9117.field956 = 0;
        }
        class172 var12 = this.field5311.field9117;
        if (var5) {
            if (this.field5311.field9051) {
                for (int var21 = 0; var21 < this.field5389; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field5399[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field5309[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field5321[var21]);
                    int var25 = this.field5351[var21];
                    int var26 = this.field5351[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field5407[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field956 = var7 * var28;
                        var12.method473(-123, var22);
                        var12.method473(-125, var23);
                        var12.method473(96, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field5389; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field5399[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field5309[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field5321[var13]);
                    int var17 = this.field5351[var13];
                    int var18 = this.field5351[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field5407[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field956 = var7 * var20;
                        var12.method470(var14, (byte) 125);
                        var12.method470(var15, (byte) 119);
                        var12.method470(var16, (byte) 123);
                    }
                }
            }
        }
        if (var3) {
            if (this.field5371 == null) {
                short[] var29;
                byte[] var30;
                short[] var31;
                short[] var32;
                if (this.field5376 == null) {
                    var31 = this.field5340;
                    var29 = this.field5337;
                    var30 = this.field5310;
                    var32 = this.field5402;
                } else {
                    var29 = this.field5376.field7090;
                    var30 = this.field5376.field7089;
                    var31 = this.field5376.field7086;
                    var32 = this.field5376.field7092;
                }
                float var33 = this.field5311.field9104[0];
                float var34 = this.field5311.field9104[1];
                float var35 = this.field5311.field9104[2];
                float var36 = this.field5311.field9091;
                float var37 = this.field5311.field9064 * 768.0F / (float) this.field5347;
                float var38 = this.field5311.field9145 * 768.0F / (float) this.field5347;
                for (int var39 = 0; var39 < this.field5341; var39++) {
                    int var40 = this.method2371(this.field5356, this.field5375[var39], this.field5392[var39], this.field5406[var39], -17173);
                    float var41 = (float) (var40 >>> 24) * this.field5311.field9107;
                    float var42 = (float) (var40 >> 16 & 0xFF) * this.field5311.field9077;
                    float var43 = (float) ((var40 & 0xFF50) >> 8) * this.field5311.field9080;
                    short var44 = this.field5335[var39];
                    short var45 = (short) var30[var44];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var44] * var35 + (float) var29[var44] * var34 + (float) var32[var44] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var44] * var35 + (float) var29[var44] * var34 + (float) var32[var44] * var33) / (float) (var45 * 256);
                    }
                    float var47 = (var46 < 0.0F ? var38 : var37) * var46 + var36;
                    int var48 = (int) (var41 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var42 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var43 * var47);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field956 = var7 * var44 + var9;
                    var12.method444(var48, 128);
                    var12.method444(var49, 128);
                    var12.method444(var50, 128);
                    var12.method444(255 - (this.field5375[var39] & 0xFF), 128);
                    short var51 = this.field5405[var39];
                    short var52 = (short) var30[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var34 + (float) var32[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var34 + (float) var32[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var36 + var53 * (var53 < 0.0F ? var38 : var37);
                    int var55 = (int) (var41 * var54);
                    int var56 = (int) (var42 * var54);
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
                    int var57 = (int) (var43 * var54);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field956 = var9 + (var7 * var51);
                    var12.method444(var55, 128);
                    var12.method444(var56, 128);
                    var12.method444(var57, 128);
                    var12.method444(255 - (this.field5375[var39] & 0xFF), 128);
                    short var58 = this.field5339[var39];
                    short var59 = (short) var30[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var34 + (float) var32[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var34 + (float) var32[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var60 * ((var60 < 0.0F) ? var38 : var37) + var36;
                    int var62 = (int) (var41 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var42 * var61);
                    int var64 = (int) (var43 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.field956 = var9 + (var7 * var58);
                    var12.method444(var62, 128);
                    var12.method444(var63, 128);
                    var12.method444(var64, 128);
                    var12.method444(255 - (this.field5375[var39] & 0xFF), 128);
                }
            } else {
                for (int var65 = 0; var65 < this.field5341; var65++) {
                    int var66 = this.method2371(this.field5356, this.field5375[var65], this.field5392[var65], this.field5406[var65], -17173);
                    var12.field956 = this.field5335[var65] * var7 + var9;
                    var12.method473(-124, var66);
                    var12.field956 = this.field5405[var65] * var7 + var9;
                    var12.method473(-127, var66);
                    var12.field956 = this.field5339[var65] * var7 + var9;
                    var12.method473(-122, var66);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field5376 == null) {
                var67 = this.field5340;
                var68 = this.field5310;
                var69 = this.field5402;
                var70 = this.field5337;
            } else {
                var69 = this.field5376.field7092;
                var70 = this.field5376.field7090;
                var68 = this.field5376.field7089;
                var67 = this.field5376.field7086;
            }
            float var71 = 3.0F / (float) this.field5347;
            var12.field956 = var10;
            float var72 = 3.0F / (float) (this.field5347 / 2 + this.field5347);
            if (this.field5311.field9051) {
                for (int var73 = 0; var73 < this.field5414; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1102(-732814632, (float) var69[var73] * var72);
                        var12.method1102(-732814632, (float) var70[var73] * var72);
                        var12.method1102(-732814632, (float) var67[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1102(-732814632, (float) var69[var73] * var75);
                        var12.method1102(-732814632, (float) var70[var73] * var75);
                        var12.method1102(-732814632, (float) var67[var73] * var75);
                    }
                    var12.field956 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field5414; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1100((float) var69[var76] * var72, -120);
                        var12.method1100((float) var70[var76] * var72, -112);
                        var12.method1100((float) var67[var76] * var72, 1);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1100((float) var69[var76] * var78, 124);
                        var12.method1100((float) var70[var76] * var78, -114);
                        var12.method1100((float) var67[var76] * var78, -127);
                    }
                    var12.field956 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field956 = var11;
            if (this.field5311.field9051) {
                for (int var79 = 0; var79 < this.field5414; var79++) {
                    var12.method1102(-732814632, this.field5413[var79]);
                    var12.method1102(-732814632, this.field5384[var79]);
                    var12.field956 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field5414; var80++) {
                    var12.method1100(this.field5413[var80], -122);
                    var12.method1100(this.field5384[var80], -109);
                    var12.field956 += var7 - 8;
                }
            }
        }
        var12.field956 = this.field5414 * var7;
        class411 var81;
        if (arg0) {
            if (this.field5380 == null) {
                this.field5380 = this.field5311.method3687(true, var7, var12.field954, var12.field956, -108);
            } else {
                this.field5380.method743(var12.field956, var7, 29764, var12.field954);
            }
            var81 = this.field5380;
            this.field5328 = 0;
        } else {
            var81 = this.field5311.method3687(false, var7, var12.field954, var12.field956, -119);
            this.field5299 = true;
        }
        if (var5) {
            this.field5403.field7062 = var8;
            this.field5403.field7060 = var81;
        }
        if (var6) {
            this.field5336.field7060 = var81;
            this.field5336.field7062 = var11;
        }
        if (var3) {
            this.field5370.field7060 = var81;
            this.field5370.field7062 = var9;
        }
        if (var4) {
            this.field5371.field7062 = var10;
            this.field5371.field7060 = var81;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    private final void method2363(byte arg0) {
        field5346++;
        if (!this.field5299) {
            return;
        }
        this.field5299 = false;
        if (this.field5308 == null && this.field5417 == null && this.field5314 == null) {
            if (this.field5399 != null && !class673.method3803(false, this.field5350, this.field5344)) {
                if (this.field5403 != null && this.field5403.field7060 == null) {
                    this.field5299 = true;
                } else {
                    if (!this.field5391) {
                        this.method2360(-113);
                    }
                    this.field5399 = null;
                }
            }
            if (this.field5309 != null && !class512.method3063(this.field5344, this.field5350, (byte) 125)) {
                if (this.field5403 != null && this.field5403.field7060 == null) {
                    this.field5299 = true;
                } else {
                    if (!this.field5391) {
                        this.method2360(-113);
                    }
                    this.field5309 = null;
                }
            }
            if (this.field5321 != null && !class679.method3822((byte) 118, this.field5350, this.field5344)) {
                if (this.field5403 != null && this.field5403.field7060 == null) {
                    this.field5299 = true;
                } else {
                    if (!this.field5391) {
                        this.method2360(-127);
                    }
                    this.field5321 = null;
                }
            }
        }
        if (this.field5407 != null && this.field5399 == null && this.field5309 == null && this.field5321 == null) {
            this.field5407 = null;
            this.field5351 = null;
        }
        if (this.field5310 != null && !class196.method1205(this.field5344, this.field5350, 12700)) {
            if (this.field5371 == null) {
                if (this.field5370 != null && this.field5370.field7060 == null) {
                    this.field5299 = true;
                } else {
                    this.field5402 = this.field5337 = this.field5340 = null;
                    this.field5310 = null;
                }
            } else if (this.field5371.field7060 == null) {
                this.field5299 = true;
            } else {
                this.field5402 = this.field5337 = this.field5340 = null;
                this.field5310 = null;
            }
        }
        if (this.field5406 != null && !class346.method2210(this.field5344, -28914, this.field5350)) {
            if (this.field5370 != null && this.field5370.field7060 == null) {
                this.field5299 = true;
            } else {
                this.field5406 = null;
            }
        }
        if (this.field5375 != null && !class223.method1320(this.field5350, this.field5344, (byte) -25)) {
            if (this.field5370 != null && this.field5370.field7060 == null) {
                this.field5299 = true;
            } else {
                this.field5375 = null;
            }
        }
        if (this.field5413 != null && !class513.method3067(this.field5350, this.field5344, (byte) -128)) {
            if (this.field5336 != null && this.field5336.field7060 == null) {
                this.field5299 = true;
            } else {
                this.field5413 = this.field5384 = null;
            }
        }
        if (this.field5392 != null && !class521.method3104(true, this.field5350, this.field5344)) {
            if (this.field5370 != null && this.field5370.field7060 == null) {
                this.field5299 = true;
            } else {
                this.field5392 = null;
            }
        }
        if (this.field5335 != null && !class596.method3415(true, this.field5344, this.field5350)) {
            if (this.field5298 != null && this.field5298.field8754 == null || this.field5370 != null && this.field5370.field7060 == null) {
                this.field5299 = true;
            } else {
                this.field5335 = this.field5405 = this.field5339 = null;
            }
        }
        if (this.field5306 != null && !class414.method2582(this.field5350, this.field5344, -20157)) {
            this.field5306 = null;
            this.field5418 = null;
        }
        if (this.field5394 != null && !class745.method4150(this.field5350, this.field5344, (byte) 86)) {
            this.field5394 = null;
            this.field5364 = null;
        }
        int var2 = -115 % ((arg0 - 38) / 46);
        if (this.field5383 != null && !class115.method735(this.field5350, -121, this.field5344)) {
            this.field5383 = null;
        }
        if (this.field5348 != null && (this.field5344 & 0x800) == 0 && (this.field5344 & 0x40000) == 0) {
            this.field5348 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)V")
    public final void method1700(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field5341; var5++) {
            int var9 = this.field5406[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field5406[var5] = (short) class678.method3817(var12, class678.method3817(var10 << 10, var11 << 7));
        }
        field5338++;
        if (this.field5314 != null) {
            for (int var6 = 0; var6 < this.field5332; var6++) {
                class253 var7 = this.field5314[var6];
                class435 var8 = this.field5343[var6];
                var8.field6071 = class577.field7932[this.field5406[var7.field3709] & 0xFFFF] & 0xFFFFFF | var8.field6071 & 0xFF000000;
            }
        }
        if (this.field5370 != null) {
            this.field5370.field7060 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "(I)V")
    public final void method1677(int arg0) {
        field5316++;
        int var2 = class24.field312[arg0];
        int var3 = class24.field308[arg0];
        for (int var4 = 0; var4 < this.field5389; var4++) {
            int var7 = this.field5321[var4] * var2 + (this.field5399[var4] * var3) >> 14;
            this.field5321[var4] = this.field5321[var4] * var3 - (this.field5399[var4] * var2) >> 14;
            this.field5399[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5414; var5++) {
            int var6 = this.field5340[var5] * var2 + (this.field5402[var5] * var3) >> 14;
            this.field5340[var5] = (short) (this.field5340[var5] * var3 - (this.field5402[var5] * var2) >> 14);
            this.field5402[var5] = (short) var6;
        }
        if (this.field5371 == null && this.field5370 != null) {
            this.field5370.field7060 = null;
        }
        if (this.field5371 != null) {
            this.field5371.field7060 = null;
        }
        if (this.field5403 != null) {
            this.field5403.field7060 = null;
        }
        this.field5391 = false;
    }

    @OriginalMember(owner = "client!dn", name = "na", descriptor = "()I")
    public final int method1658() {
        if (!this.field5391) {
            this.method2360(-122);
        }
        field5330++;
        return this.field5342;
    }

    @OriginalMember(owner = "client!dn", name = "LA", descriptor = "(I)V")
    public final void method1702(int arg0) {
        this.field5347 = (short) arg0;
        field5404++;
        if (this.field5370 != null) {
            this.field5370.field7060 = null;
        }
        if (this.field5371 != null) {
            this.field5371.field7060 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IFILvo;JIFIZI)S")
    private final short method2364(int arg0, float arg1, int arg2, class133 arg3, long arg4, int arg5, float arg6, int arg7, boolean arg8, int arg9) {
        field5302++;
        int var12 = this.field5351[arg5];
        int var13 = this.field5351[arg5 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field5407[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class381.field5463[var15] == arg4) {
                return (short) (var16 - 1);
            }
        }
        this.field5407[var14] = (short) (this.field5414 + 1);
        class381.field5463[var14] = arg4;
        if (!arg8) {
            return -33;
        }
        this.field5402[this.field5414] = (short) arg0;
        this.field5337[this.field5414] = (short) arg2;
        this.field5340[this.field5414] = (short) arg7;
        this.field5310[this.field5414] = (byte) arg9;
        this.field5413[this.field5414] = arg6;
        this.field5384[this.field5414] = arg1;
        return (short) (this.field5414++);
    }

    @OriginalMember(owner = "client!dn", name = "wa", descriptor = "()V")
    public final void method1657() {
        for (int var1 = 0; var1 < this.field5320; var1++) {
            this.field5399[var1] = this.field5399[var1] + 7 >> 4;
            this.field5309[var1] = this.field5309[var1] + 7 >> 4;
            this.field5321[var1] = this.field5321[var1] + 7 >> 4;
        }
        field5355++;
        this.field5391 = false;
        if (this.field5403 != null) {
            this.field5403.field7060 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "()V")
    public final void method1705() {
        field5327++;
        if (this.field5414 <= 0 || this.field5307 <= 0) {
            return;
        }
        this.method2362(false, -120);
        if ((this.field5328 & 0x10) == 0 && this.field5298.field8754 == null) {
            this.method2365(false, 114);
        }
        this.method2363((byte) -72);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(ZI)V")
    private final void method2365(boolean arg0, int arg1) {
        if (this.field5307 * 6 > this.field5311.field9117.field954.length) {
            this.field5311.field9117 = new class172((this.field5307 + 100) * 6);
        } else {
            this.field5311.field9117.field956 = 0;
        }
        field5411++;
        class172 var3 = this.field5311.field9117;
        if (arg1 <= 111) {
            this.method1701(null);
        }
        if (this.field5311.field9051) {
            for (int var5 = 0; var5 < this.field5307; var5++) {
                var3.method492(-2, this.field5335[var5]);
                var3.method492(-2, this.field5405[var5]);
                var3.method492(-2, this.field5339[var5]);
            }
        } else {
            for (int var4 = 0; var4 < this.field5307; var4++) {
                var3.method499(-25094, this.field5335[var4]);
                var3.method499(-25094, this.field5405[var4]);
                var3.method499(-25094, this.field5339[var4]);
            }
        }
        if (var3.field956 == 0) {
            return;
        }
        if (arg0) {
            if (this.field5317 == null) {
                this.field5317 = this.field5311.method3696(0, var3.field954, var3.field956, true, 5123);
            } else {
                this.field5317.method2486(119, var3.field956, var3.field954, 5123);
            }
            this.field5298.field8754 = this.field5317;
        } else {
            this.field5298.field8754 = this.field5311.method3696(0, var3.field954, var3.field956, false, 5123);
        }
        if (!arg0) {
            this.field5299 = true;
        }
    }

    @OriginalMember(owner = "client!dn", name = "ma", descriptor = "()I")
    public final int method1697() {
        field5353++;
        if (!this.field5391) {
            this.method2360(-117);
        }
        return this.field5365;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method1654(class284 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5385++;
        class378 var6 = (class378) arg0;
        if (this.field5341 == 0 || var6.field5341 == 0) {
            return;
        }
        int var7 = var6.field5389;
        int[] var8 = var6.field5399;
        int[] var9 = var6.field5309;
        int[] var10 = var6.field5321;
        short[] var11 = var6.field5402;
        short[] var12 = var6.field5337;
        short[] var13 = var6.field5340;
        byte[] var14 = var6.field5310;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field5376 == null) {
            var18 = null;
            var15 = null;
            var16 = null;
            var17 = null;
        } else {
            var15 = this.field5376.field7090;
            var16 = this.field5376.field7089;
            var17 = this.field5376.field7086;
            var18 = this.field5376.field7092;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5376 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field5376.field7086;
            var22 = var6.field5376.field7092;
            var19 = var6.field5376.field7090;
            var20 = var6.field5376.field7089;
        }
        int[] var23 = var6.field5351;
        short[] var24 = var6.field5407;
        if (!var6.field5391) {
            var6.method2360(-113);
        }
        short var25 = var6.field5319;
        short var26 = var6.field5322;
        short var27 = var6.field5326;
        short var28 = var6.field5359;
        short var29 = var6.field5357;
        short var30 = var6.field5388;
        for (int var31 = 0; var31 < this.field5389; var31++) {
            int var32 = this.field5309[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field5399[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field5321[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5351[var31];
                        int var37 = this.field5351[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5407[var38] - 1;
                            if (var35 == -1 || this.field5310[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = -1;
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var40; var43 < var42; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var18 == null) {
                                            this.field5376 = new class513();
                                            var18 = this.field5376.field7092 = class27.method157(this.field5402, 29563);
                                            var15 = this.field5376.field7090 = class27.method157(this.field5337, 29563);
                                            var17 = this.field5376.field7086 = class27.method157(this.field5340, 29563);
                                            var16 = this.field5376.field7089 = class11.method55(this.field5310, -2692);
                                        }
                                        if (var22 == null) {
                                            class513 var44 = var6.field5376 = new class513();
                                            var22 = var44.field7092 = class27.method157(var11, 29563);
                                            var19 = var44.field7090 = class27.method157(var12, 29563);
                                            var21 = var44.field7086 = class27.method157(var13, 29563);
                                            var20 = var44.field7089 = class11.method55(var14, -2692);
                                        }
                                        short var45 = this.field5402[var35];
                                        short var46 = this.field5337[var35];
                                        short var47 = this.field5340[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field5310[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var22[var52] += var45;
                                                var19[var52] += var46;
                                                var21[var52] += var47;
                                                var20[var52] += var49;
                                            }
                                        }
                                        short var53 = var12[var41];
                                        short var54 = var11[var41];
                                        int var55 = this.field5351[var31];
                                        byte var56 = var14[var41];
                                        short var57 = var13[var41];
                                        int var58 = this.field5351[var31 + 1];
                                        for (int var59 = var55; var59 < var58; var59++) {
                                            int var60 = this.field5407[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var18[var60] += var54;
                                                var15[var60] += var53;
                                                var17[var60] += var57;
                                                var16[var60] += var56;
                                            }
                                        }
                                        if (this.field5371 == null && this.field5370 != null) {
                                            this.field5370.field7060 = null;
                                        }
                                        if (this.field5371 != null) {
                                            this.field5371.field7060 = null;
                                        }
                                        if (var6.field5371 == null && var6.field5370 != null) {
                                            var6.field5370.field7060 = null;
                                        }
                                        if (var6.field5371 != null) {
                                            var6.field5371.field7060 = null;
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

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "()Z")
    public final boolean method1664() {
        field5381++;
        if (this.field5392 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5392.length; var1++) {
            if (this.field5392[var1] != -1 && !this.field5311.field7623.method517(this.field5392[var1], true)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dn", name = "EA", descriptor = "()I")
    public final int method1681() {
        if (!this.field5391) {
            this.method2360(-119);
        }
        field5301++;
        return this.field5322;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZIIIIII)Z")
    private final boolean method2366(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5325++;
        if (arg2) {
            return true;
        } else if (arg0 < arg6 && arg8 > arg0 && arg0 < arg3) {
            return false;
        } else if (arg0 > arg6 && arg0 > arg8 && arg0 > arg3) {
            return false;
        } else if (arg4 > arg1 && arg1 < arg5 && arg1 < arg7) {
            return false;
        } else {
            return arg1 <= arg4 || arg1 <= arg5 || arg1 <= arg7;
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "()[Lmv;")
    public final class44[] method1662() {
        field5393++;
        return this.field5308;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
    private final void method2367(int arg0) {
        field5305++;
        if (this.field5307 == 0) {
            return;
        }
        if (this.field5328 != 0) {
            this.method2362(true, -126);
        }
        this.method2362(false, -121);
        if (this.field5298 != null) {
            if (this.field5298.field8754 == null) {
                this.method2365((this.field5328 & 0x10) != 0, 118);
            }
            if (this.field5298.field8754 != null) {
                this.field5311.method3680((byte) 106, this.field5371 != null);
                this.field5311.method3725(this.field5370, (byte) 101, this.field5336, this.field5371, this.field5403);
                int var2 = this.field5348.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5348[var3];
                    int var5 = this.field5348[var3 + 1];
                    int var6 = this.field5392[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field5311.method3736(this.field5371 != null, false, var6);
                    this.field5311.method3688(var4 * 3, (var5 - var4) * 3, 4, this.field5298.field8754, arg0 ^ 0xFFFFCCF0);
                }
            }
        }
        this.method2363((byte) 105);
        if (arg0 != -13072) {
            this.field5306 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "fa", descriptor = "()I")
    public final int method1668() {
        if (!this.field5391) {
            this.method2360(-117);
        }
        field5368++;
        return this.field5319;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public final void method1704(int arg0) {
        field5358++;
        int var2 = class24.field312[arg0];
        int var3 = class24.field308[arg0];
        for (int var4 = 0; var4 < this.field5389; var4++) {
            int var5 = this.field5399[var4] * var3 + this.field5321[var4] * var2 >> 14;
            this.field5321[var4] = this.field5321[var4] * var3 - (this.field5399[var4] * var2) >> 14;
            this.field5399[var4] = var5;
        }
        if (this.field5403 != null) {
            this.field5403.field7060 = null;
        }
        this.field5391 = false;
    }

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "()Z")
    public final boolean method1673() {
        field5313++;
        return this.field5345;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZB)Ljava/lang/String;")
    public static final String method2368(int arg0, boolean arg1, byte arg2) {
        field5415++;
        if (arg1 && arg0 >= 0) {
            return arg2 >= -51 ? null : class250.method1710(arg1, 10, (byte) 10, arg0);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lpfa;B)V")
    private final void method2369(class231 arg0, byte arg1) {
        if (this.field5311.field9159.length < this.field5414) {
            this.field5311.field9160 = new int[this.field5414];
            this.field5311.field9159 = new int[this.field5414];
        }
        field5303++;
        int[] var3 = this.field5311.field9159;
        int[] var4 = this.field5311.field9160;
        for (int var5 = 0; var5 < this.field5389; var5++) {
            int var16 = (this.field5399[var5] - (this.field5309[var5] * this.field5311.field9090 >> 8) >> this.field5311.field9011) - arg0.field3130;
            int var17 = (this.field5321[var5] - (this.field5309[var5] * this.field5311.field9118 >> 8) >> this.field5311.field9011) - arg0.field3129;
            int var18 = this.field5351[var5];
            int var19 = this.field5351[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field5407[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        int var6 = 0;
        if (arg1 != 37) {
            return;
        }
        while (this.field5307 > var6) {
            if (this.field5375 == null || this.field5375[var6] <= 128) {
                short var7 = this.field5335[var6];
                short var8 = this.field5405[var6];
                short var9 = this.field5339[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13))) > 0) {
                    arg0.method1379(var15, var12, var13, var11, var10, var14, 13258);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[FI[II[III[FIB)V")
    public static final void method2370(int arg0, int arg1, int arg2, float[] arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9, float[] arg10, int arg11, byte arg12) {
        field5367++;
        if (arg12 != -36) {
            return;
        }
        int var13 = arg1 * arg6 + arg0;
        int var14 = arg2 * arg8 + arg4;
        int var15 = arg1 - arg11;
        int var16 = arg8 - arg11;
        if (arg7 == null) {
            for (int var17 = 0; var17 < arg9; var17++) {
                int var18 = arg11 + var13;
                while (var13 < var18) {
                    arg3[var14++] = arg10[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else if (arg10 == null) {
            for (int var21 = 0; var21 < arg9; var21++) {
                int var22 = arg11 + var13;
                while (var13 < var22) {
                    arg5[var14++] = arg7[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        } else {
            for (int var19 = 0; var19 < arg9; var19++) {
                int var20 = arg11 + var13;
                while (var20 > var13) {
                    arg5[var14] = arg7[var13];
                    arg3[var14++] = arg10[var13++];
                }
                var14 += var16;
                var13 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "da", descriptor = "()I")
    public final int method1683() {
        field5323++;
        return this.field5347;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBSII)I")
    private final int method2371(int arg0, byte arg1, short arg2, int arg3, int arg4) {
        field5410++;
        if (arg4 != -17173) {
            return -9;
        }
        int var6 = class577.field7932[class337.method2139(-22186, arg3, arg0)];
        if (arg2 != -1) {
            class239 var7 = this.field5311.field7623.method521(arg2 & 0xFFFF, 115);
            int var8 = var7.field3570 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg0 < 0) {
                    var9 = 0;
                } else if (arg0 <= 127) {
                    var9 = arg0 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field3578 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var14 & 0xFF00) + ((var13 << 8 & 0xFF004A) + (var15 >> 8));
            }
        }
        return (var6 << 8) + (255 - (arg1 & 0xFF));
    }

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method1696(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5304++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            int var13 = 0;
            class150.field2068 = 0;
            class450.field6248 = 0;
            class529.field7331 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5394.length) {
                    int[] var16 = this.field5394[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5364 == null || (arg6 & this.field5364[var18]) != 0) {
                            class150.field2068 += this.field5399[var18];
                            class529.field7331 += this.field5309[var18];
                            var13++;
                            class450.field6248 += this.field5321[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class150.field2068 = class150.field2068 / var13 + var12;
                class199.field2665 = true;
                class529.field7331 = class529.field7331 / var13 + var10;
                class450.field6248 = class450.field6248 / var13 + var11;
            } else {
                class529.field7331 = var10;
                class150.field2068 = var12;
                class450.field6248 = var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + (arg7[4] * arg3) + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field5394.length > var26) {
                    int[] var27 = this.field5394[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5364 == null || (arg6 & this.field5364[var29]) != 0) {
                            this.field5399[var29] += var23;
                            this.field5309[var29] += var22;
                            this.field5321[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field5394.length > var109) {
                        int[] var110 = this.field5394[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field5364 == null || (arg6 & this.field5364[var112]) != 0) {
                                this.field5399[var112] -= class150.field2068;
                                this.field5309[var112] -= class529.field7331;
                                this.field5321[var112] -= class450.field6248;
                                if (arg4 != 0) {
                                    int var113 = class24.field312[arg4];
                                    int var114 = class24.field308[arg4];
                                    int var115 = this.field5399[var112] * var114 + this.field5309[var112] * var113 + 16383 >> 14;
                                    this.field5309[var112] = this.field5309[var112] * var114 + 16383 - (this.field5399[var112] * var113) >> 14;
                                    this.field5399[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class24.field312[arg2];
                                    int var117 = class24.field308[arg2];
                                    int var118 = this.field5309[var112] * var117 - (this.field5321[var112] * var116 - 16383) >> 14;
                                    this.field5321[var112] = this.field5321[var112] * var117 + this.field5309[var112] * var116 + 16383 >> 14;
                                    this.field5309[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class24.field312[arg3];
                                    int var120 = class24.field308[arg3];
                                    int var121 = this.field5399[var112] * var120 + this.field5321[var112] * var119 + 16383 >> 14;
                                    this.field5321[var112] = this.field5321[var112] * var120 + 16383 - this.field5399[var112] * var119 >> 14;
                                    this.field5399[var112] = var121;
                                }
                                this.field5399[var112] += class150.field2068;
                                this.field5309[var112] += class529.field7331;
                                this.field5321[var112] += class450.field6248;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field5394.length > var92) {
                            int[] var93 = this.field5394[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field5364 == null || (this.field5364[var95] & arg6) != 0) {
                                    int var96 = this.field5351[var95];
                                    int var97 = this.field5351[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field5407[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class24.field312[arg4];
                                            int var101 = class24.field308[arg4];
                                            int var102 = this.field5337[var99] * var100 + (this.field5402[var99] * var101) + 16383 >> 14;
                                            this.field5337[var99] = (short) (this.field5337[var99] * var101 + 16383 - (this.field5402[var99] * var100) >> 14);
                                            this.field5402[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class24.field312[arg2];
                                            int var104 = class24.field308[arg2];
                                            int var105 = this.field5337[var99] * var104 + 16383 - this.field5340[var99] * var103 >> 14;
                                            this.field5340[var99] = (short) (this.field5340[var99] * var104 + this.field5337[var99] * var103 + 16383 >> 14);
                                            this.field5337[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class24.field312[arg3];
                                            int var107 = class24.field308[arg3];
                                            int var108 = this.field5402[var99] * var107 + (this.field5340[var99] * var106 + 16383) >> 14;
                                            this.field5340[var99] = (short) (this.field5340[var99] * var107 + 16383 - (this.field5402[var99] * var106) >> 14);
                                            this.field5402[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5371 == null && this.field5370 != null) {
                        this.field5370.field7060 = null;
                    }
                    if (this.field5371 != null) {
                        this.field5371.field7060 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class199.field2665) {
                    int var36 = arg7[6] * class450.field6248 + arg7[0] * class150.field2068 + (arg7[3] * class529.field7331) + 8192 >> 14;
                    int var37 = arg7[7] * class450.field6248 + arg7[1] * class150.field2068 + (arg7[4] * class529.field7331) + 8192 >> 14;
                    int var38 = var34 + var37;
                    int var39 = arg7[5] * class529.field7331 + arg7[2] * class150.field2068 + (arg7[8] * class450.field6248) + 8192 >> 14;
                    int var40 = var33 + var36;
                    int var41 = var35 + var39;
                    class150.field2068 = var40;
                    class529.field7331 = var38;
                    class199.field2665 = false;
                    class450.field6248 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class24.field308[arg2];
                int var44 = class24.field312[arg2];
                int var45 = class24.field308[arg3];
                int var46 = class24.field312[arg3];
                int var47 = class24.field308[arg4];
                int var48 = class24.field312[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[6] = -var46 * var47 + (var45 * var50) + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[5] = -var44;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[0] = var46 * var50 + (var45 * var47 + 8192) >> 14;
                var42[7] = var46 * var48 + var45 * var49 + 8192 >> 14;
                int var51 = var42[2] * -class450.field6248 + var42[1] * -class529.field7331 + var42[0] * -class150.field2068 + 8192 >> 14;
                int var52 = var42[3] * -class150.field2068 - (-(var42[4] * -class529.field7331) - (var42[5] * -class450.field6248 + 8192)) >> 14;
                int var53 = var42[7] * -class529.field7331 + var42[6] * -class150.field2068 - (-(var42[8] * -class450.field6248) + -8192) >> 14;
                int var54 = class150.field2068 + var51;
                int var55 = class529.field7331 + var52;
                int var56 = class450.field6248 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[0] * var33 + var42[2] * var35 + var42[1] * var34 + 8192 >> 14;
                int var60 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 8192 >> 14;
                int var61 = var54 + var59;
                int var62 = var55 + var60;
                int var63 = var42[8] * var35 + var42[6] * var33 + (var42[7] * var34) + 8192 >> 14;
                int var64 = var56 + var63;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += var57[var84 + (var86 * 3)] * arg7[var66 * 3 + var86];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[1] * var62 + arg7[0] * var61 + (arg7[2] * var64 - -8192) >> 14;
                int var68 = arg7[4] * var62 + arg7[3] * var61 - (-(arg7[5] * var64) - 8192) >> 14;
                int var69 = var31 + var68;
                int var70 = arg7[7] * var62 + arg7[6] * var61 + (arg7[8] * var64) + 8192 >> 14;
                int var71 = var30 + var67;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field5394.length) {
                        int[] var75 = this.field5394[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field5364 == null || (this.field5364[var77] & arg6) != 0) {
                                int var78 = this.field5309[var77] * var65[1] + (this.field5399[var77] * var65[0] + this.field5321[var77] * var65[2] + 8192) >> 14;
                                int var79 = this.field5399[var77] * var65[3] + this.field5321[var77] * var65[5] + this.field5309[var77] * var65[4] + 8192 >> 14;
                                int var80 = this.field5399[var77] * var65[6] + this.field5309[var77] * var65[7] + (this.field5321[var77] * var65[8]) + 8192 >> 14;
                                int var81 = var69 + var79;
                                int var82 = var71 + var78;
                                this.field5399[var77] = var82;
                                int var83 = var72 + var80;
                                this.field5309[var77] = var81;
                                this.field5321[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field5394.length) {
                        int[] var124 = this.field5394[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field5364 == null || (this.field5364[var126] & arg6) != 0) {
                                this.field5399[var126] -= class150.field2068;
                                this.field5309[var126] -= class529.field7331;
                                this.field5321[var126] -= class450.field6248;
                                this.field5399[var126] = this.field5399[var126] * arg2 >> 7;
                                this.field5309[var126] = this.field5309[var126] * arg3 >> 7;
                                this.field5321[var126] = this.field5321[var126] * arg4 >> 7;
                                this.field5399[var126] += class150.field2068;
                                this.field5309[var126] += class529.field7331;
                                this.field5321[var126] += class450.field6248;
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
                if (class199.field2665) {
                    int var133 = arg7[3] * class529.field7331 + (arg7[0] * class150.field2068 + arg7[6] * class450.field6248 + 8192) >> 14;
                    int var134 = arg7[1] * class150.field2068 + 8192 - (-(arg7[4] * class529.field7331) - (arg7[7] * class450.field6248)) >> 14;
                    int var135 = var130 + var133;
                    int var136 = var131 + var134;
                    int var137 = arg7[2] * class150.field2068 + (arg7[5] * class529.field7331) - (-(arg7[8] * class450.field6248) - 8192) >> 14;
                    class150.field2068 = var135;
                    class529.field7331 = var136;
                    int var138 = var132 + var137;
                    class199.field2665 = false;
                    class450.field6248 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class150.field2068 * var139 + 8192 >> 14;
                int var143 = -class529.field7331 * var140 + 8192 >> 14;
                int var144 = -class450.field6248 * var141 + 8192 >> 14;
                int var145 = class150.field2068 + var142;
                int var146 = class529.field7331 + var143;
                int var147 = class450.field6248 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var146 + var150;
                int var152 = var132 * var141 + 8192 >> 14;
                int var153 = var145 + var149;
                int var154 = var147 + var152;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[0] * var153 + (arg7[1] * var151) + 8192 >> 14;
                int var158 = arg7[5] * var154 + arg7[4] * var151 + arg7[3] * var153 + 8192 >> 14;
                int var159 = arg7[7] * var151 + arg7[6] * var153 + arg7[8] * var154 + 8192 >> 14;
                int var160 = var128 + var158;
                int var161 = var127 + var157;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field5394.length) {
                        int[] var165 = this.field5394[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field5364 == null || (arg6 & this.field5364[var167]) != 0) {
                                int var168 = this.field5399[var167] * var155[0] + this.field5309[var167] * var155[1] + this.field5321[var167] * var155[2] + 8192 >> 14;
                                int var169 = this.field5399[var167] * var155[3] + this.field5309[var167] * var155[4] - (-(this.field5321[var167] * var155[5]) + -8192) >> 14;
                                int var170 = var160 + var169;
                                int var171 = var161 + var168;
                                int var172 = this.field5399[var167] * var155[6] + 8192 - (-(this.field5321[var167] * var155[8]) + -(this.field5309[var167] * var155[7])) >> 14;
                                int var173 = var162 + var172;
                                this.field5399[var167] = var171;
                                this.field5309[var167] = var170;
                                this.field5321[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5306 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field5306.length) {
                        int[] var182 = this.field5306[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field5418 == null || (this.field5418[var184] & arg6) != 0) {
                                int var185 = (this.field5375[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field5375[var184] = (byte) var185;
                                if (this.field5370 != null) {
                                    this.field5370.field7060 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5314 != null) {
                    for (int var178 = 0; var178 < this.field5332; var178++) {
                        class253 var179 = this.field5314[var178];
                        class435 var180 = this.field5343[var178];
                        var180.field6071 = 255 - (this.field5375[var179.field3709] & 0xFF) << 24 | var180.field6071 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5306 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field5306.length > var190) {
                        int[] var191 = this.field5306[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field5418 == null || (arg6 & this.field5418[var193]) != 0) {
                                int var194 = this.field5406[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFF90) >> 10;
                                int var196 = (var194 & 0x3C1) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = var194 & 0x7F;
                                int var199 = arg2 + var195 & 0x3F;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                int var200 = arg4 + var198;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field5406[var193] = (short) class678.method3817(class678.method3817(var197 << 7, var199 << 10), var200);
                                if (this.field5370 != null) {
                                    this.field5370.field7060 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5314 != null) {
                    for (int var187 = 0; var187 < this.field5332; var187++) {
                        class253 var188 = this.field5314[var187];
                        class435 var189 = this.field5343[var187];
                        var189.field6071 = var189.field6071 & 0xFF000000 | class577.field7932[this.field5406[var188.field3709] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5383 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field5383.length) {
                        int[] var203 = this.field5383[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class435 var205 = this.field5343[var203[var204]];
                            var205.field6061 += arg2;
                            var205.field6070 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5383 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field5383.length > var207) {
                        int[] var208 = this.field5383[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class435 var210 = this.field5343[var208[var209]];
                            var210.field6073 = var210.field6073 * arg3 >> 7;
                            var210.field6064 = var210.field6064 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5383 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field5383.length > var212) {
                    int[] var213 = this.field5383[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class435 var215 = this.field5343[var213[var214]];
                        var215.field6062 = var215.field6062 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BIZ)Lka;")
    public final class284 method1659(byte arg0, int arg1, boolean arg2) {
        field5387++;
        class378 var4;
        class378 var5;
        if (arg0 == 1) {
            var5 = this.field5311.field9050;
            var4 = this.field5311.field9068;
        } else if (arg0 == 2) {
            var5 = this.field5311.field9048;
            var4 = this.field5311.field9044;
        } else if (arg0 == 3) {
            var5 = this.field5311.field9052;
            var4 = this.field5311.field9150;
        } else if (arg0 == 4) {
            var4 = this.field5311.field9079;
            var5 = this.field5311.field9103;
        } else if (arg0 == 5) {
            var4 = this.field5311.field9063;
            var5 = this.field5311.field9095;
        } else {
            var5 = var4 = new class378(this.field5311);
        }
        return this.method2359(22011, var4, arg2, var5, arg0 != 0, arg1);
    }

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method1687(int arg0, int arg1, class341 arg2, class341 arg3, int arg4, int arg5, int arg6) {
        if (!this.field5391) {
            this.method2360(-122);
        }
        field5318++;
        int var8 = this.field5326 + arg4;
        int var9 = this.field5359 + arg4;
        int var10 = arg6 + this.field5357;
        int var11 = this.field5388 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (arg2.field4818 + var9 >> arg2.field4822) >= arg2.field4814 || var10 < 0 || (arg2.field4818 + var11 >> arg2.field4822) >= arg2.field4817) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4814 <= var9 + arg3.field4818 >> arg3.field4822 || var10 < 0 || arg3.field4817 <= arg3.field4818 + var11 >> arg3.field4822) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4822;
            int var13 = var9 + arg2.field4818 - 1 >> arg2.field4822;
            int var14 = var10 >> arg2.field4822;
            int var15 = var11 + arg2.field4818 - 1 >> arg2.field4822;
            if (arg5 == arg2.method2171(var14, var12, 31) && arg5 == arg2.method2171(var14, var13, 31) && arg5 == arg2.method2171(var15, var12, 31) && arg2.method2171(var15, var13, 31) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field5389; var16++) {
                this.field5309[var16] = this.field5309[var16] + arg2.method2172(this.field5399[var16] + arg4, -1, this.field5321[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field5319;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field5389; var18++) {
                int var19 = (this.field5309[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field5309[var18] -= -((arg1 - var19) * (arg2.method2172(this.field5399[var18] + arg4, -1, this.field5321[var18] + arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = ((arg1 & 0xFF2F) >> 8) * 4;
            int var22 = arg1 >> 16 & 0xFF << 6;
            int var23 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var20 >> 1)) < 0 || arg2.field4814 << arg2.field4822 <= (var20 >> 1) + arg4 + arg2.field4818 || (arg6 - (var21 >> 1)) < 0 || arg6 - (-(var21 >> 1) - arg2.field4818) >= arg2.field4817 << arg2.field4822) {
                return;
            }
            this.method1892(var21, var22, arg6, arg4, arg5, arg2, var20, var23, 105);
        } else if (arg0 == 4) {
            int var24 = this.field5322 - this.field5319;
            for (int var25 = 0; var25 < this.field5389; var25++) {
                this.field5309[var25] = this.field5309[var25] + arg3.method2172(this.field5399[var25] + arg4, -1, this.field5321[var25] + arg6) + var24 - arg5;
            }
        } else if (arg0 == 5) {
            int var26 = this.field5322 - this.field5319;
            for (int var27 = 0; var27 < this.field5389; var27++) {
                int var28 = this.field5399[var27] + arg4;
                int var29 = this.field5321[var27] + arg6;
                int var30 = arg2.method2172(var28, -1, var29);
                int var31 = arg3.method2172(var28, -1, var29);
                int var32 = var30 - (arg1 + var31);
                this.field5309[var27] = ((this.field5309[var27] << 8) / var26 * var32 >> 8) - (arg5 - var30);
            }
        }
        if (this.field5403 != null) {
            this.field5403.field7060 = null;
        }
        this.field5391 = false;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILih;ZII)Z")
    private final boolean method2372(int arg0, int arg1, int arg2, class744 arg3, boolean arg4, int arg5, int arg6) {
        field5378++;
        class480 var8 = (class480) arg3;
        class480 var9 = this.field5311.field9038;
        float var10 = var8.field6700 * var9.field6697 + var8.field6702 * var9.field6696 + var8.field6681 * var9.field6704 + var9.field6702;
        float var11 = var8.field6700 * var9.field6705 + var8.field6702 * var9.field6669 + var8.field6681 * var9.field6689 + var9.field6681;
        class710.field9902 = var8.field6673 * var9.field6673 + var8.field6705 * var9.field6670 + var8.field6697 * var9.field6692;
        float var12 = var8.field6700 * var9.field6673 + var8.field6702 * var9.field6692 + var8.field6681 * var9.field6670 + var9.field6700;
        class550.field7641 = var8.field6692 * var9.field6673 + var8.field6696 * var9.field6692 + var8.field6669 * var9.field6670;
        class75.field1103 = var8.field6692 * var9.field6697 + var8.field6696 * var9.field6696 + var8.field6669 * var9.field6704;
        class495.field6929 = var8.field6673 * var9.field6697 + var8.field6705 * var9.field6704 + var8.field6697 * var9.field6696;
        class688.field9571 = var8.field6692 * var9.field6705 + var8.field6696 * var9.field6669 + var8.field6669 * var9.field6689;
        class379.field5425 = var8.field6673 * var9.field6705 + var8.field6705 * var9.field6689 + var8.field6697 * var9.field6669;
        class463.field6451 = var8.field6670 * var9.field6697 + var8.field6704 * var9.field6696 + var8.field6689 * var9.field6704;
        class433.field6042 = var8.field6670 * var9.field6673 + var8.field6704 * var9.field6692 + var8.field6689 * var9.field6670;
        class367.field5207 = var8.field6670 * var9.field6705 + var8.field6704 * var9.field6669 + var8.field6689 * var9.field6689;
        boolean var13 = false;
        if (arg5 != 13878) {
            return true;
        }
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field5311.field9072;
        int var19 = this.field5311.field9087;
        if (!this.field5391) {
            this.method2360(-124);
        }
        int var20 = this.field5359 - this.field5326 >> 1;
        int var21 = this.field5322 - this.field5319 >> 1;
        int var22 = this.field5388 - this.field5357 >> 1;
        int var23 = this.field5326 + var20;
        int var24 = this.field5319 + var21;
        int var25 = this.field5357 + var22;
        int var26 = var23 - (var20 << arg2);
        int var27 = var24 - (var21 << arg2);
        int var28 = var25 - (var22 << arg2);
        int var29 = var23 + (var20 << arg2);
        int var30 = (var21 << arg2) + var24;
        class445.field6180[0] = var26;
        int var31 = (var22 << arg2) + var25;
        class60.field873[0] = var27;
        class445.field6180[1] = var29;
        class532.field7384[0] = var28;
        class60.field873[1] = var27;
        class532.field7384[1] = var28;
        class445.field6180[2] = var26;
        class60.field873[2] = var30;
        class532.field7384[2] = var28;
        class445.field6180[3] = var29;
        class60.field873[3] = var30;
        class445.field6180[4] = var26;
        class532.field7384[3] = var28;
        class60.field873[4] = var27;
        class532.field7384[4] = var31;
        class445.field6180[5] = var29;
        class60.field873[5] = var27;
        class532.field7384[5] = var31;
        class445.field6180[6] = var26;
        class60.field873[6] = var30;
        class445.field6180[7] = var29;
        class532.field7384[6] = var31;
        class60.field873[7] = var30;
        class532.field7384[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class445.field6180[var32];
            float var54 = (float) class532.field7384[var32];
            float var55 = (float) class60.field873[var32];
            float var56 = class495.field6929 * var54 + class75.field1103 * var53 + class463.field6451 * var55 + var10;
            float var57 = class710.field9902 * var54 + class550.field7641 * var53 + class433.field6042 * var55 + var12;
            float var58 = class379.field5425 * var54 + class688.field9571 * var53 + class367.field5207 * var55 + var11;
            if (var57 >= (float) this.field5311.field9076) {
                if (arg0 > 0) {
                    var57 = arg0;
                }
                float var59 = (float) var18 * var56 / var57 + (float) this.field5311.field9112;
                if (var59 > var15) {
                    var15 = var59;
                }
                float var60 = (float) var19 * var58 / var57 + (float) this.field5311.field9054;
                if (var14 > var59) {
                    var14 = var59;
                }
                if (var16 > var60) {
                    var16 = var60;
                }
                var13 = true;
                if (var17 < var60) {
                    var17 = var60;
                }
            }
        }
        if (var13 && (float) arg1 > var14 && var15 > (float) arg1 && (float) arg6 > var16 && var17 > (float) arg6) {
            if (arg4) {
                return true;
            }
            if (this.field5311.field9159.length < this.field5414) {
                this.field5311.field9160 = new int[this.field5414];
                this.field5311.field9159 = new int[this.field5414];
            }
            int[] var33 = this.field5311.field9159;
            int[] var34 = this.field5311.field9160;
            for (int var35 = 0; var35 < this.field5389; var35++) {
                float var37 = (float) this.field5399[var35];
                float var38 = (float) this.field5321[var35];
                float var39 = (float) this.field5309[var35];
                float var40 = class710.field9902 * var38 + class550.field7641 * var37 + class433.field6042 * var39 + var12;
                float var41 = class379.field5425 * var38 + class688.field9571 * var37 + class367.field5207 * var39 + var11;
                float var42 = class495.field6929 * var38 + class75.field1103 * var37 + class463.field6451 * var39 + var10;
                if (((float) this.field5311.field9076 <= var40)) {
                    if (arg0 > 0) {
                        var40 = arg0;
                    }
                    int var47 = (int) ((float) var18 * var42 / var40 + (float) this.field5311.field9112);
                    int var48 = (int) ((float) var19 * var41 / var40 + (float) this.field5311.field9054);
                    int var49 = this.field5351[var35];
                    int var50 = this.field5351[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field5407[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[var52] = var47;
                        var34[var52] = var48;
                    }
                } else {
                    int var43 = this.field5351[var35];
                    int var44 = this.field5351[var35 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field5407[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        var33[this.field5407[var45] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field5341; var36++) {
                if (var33[this.field5335[var36]] != -999999 && var33[this.field5405[var36]] != -999999 && var33[this.field5339[var36]] != -999999 && this.method2366(arg6, arg1, false, var34[this.field5339[var36]], var33[this.field5335[var36]], var33[this.field5405[var36]], var34[this.field5335[var36]], var33[this.field5339[var36]], var34[this.field5405[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dn", name = "VA", descriptor = "(I)V")
    public final void method1690(int arg0) {
        field5395++;
        int var2 = class24.field312[arg0];
        int var3 = class24.field308[arg0];
        for (int var4 = 0; var4 < this.field5389; var4++) {
            int var5 = this.field5399[var4] * var3 + this.field5309[var4] * var2 >> 14;
            this.field5309[var4] = this.field5309[var4] * var3 - (this.field5399[var4] * var2) >> 14;
            this.field5399[var4] = var5;
        }
        if (this.field5403 != null) {
            this.field5403.field7060 = null;
        }
        this.field5391 = false;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lih;)V")
    public final void method1661(class744 arg0) {
        field5386++;
        class480 var2 = (class480) arg0;
        if (this.field5308 != null) {
            for (int var3 = 0; var3 < this.field5308.length; var3++) {
                class44 var4 = this.field5308[var3];
                class44 var5 = var4;
                if (var4.field547 != null) {
                    var5 = var4.field547;
                }
                var5.field534 = (int) ((float) this.field5321[var4.field542] * var2.field6697 + (float) this.field5399[var4.field542] * var2.field6696 + (float) this.field5309[var4.field542] * var2.field6704 + var2.field6702);
                var5.field548 = (int) ((float) this.field5321[var4.field542] * var2.field6705 + (float) this.field5399[var4.field542] * var2.field6669 + (float) this.field5309[var4.field542] * var2.field6689 + var2.field6681);
                var5.field536 = (int) ((float) this.field5321[var4.field542] * var2.field6673 + (float) this.field5399[var4.field542] * var2.field6692 + (float) this.field5309[var4.field542] * var2.field6670 + var2.field6700);
                var5.field541 = (int) ((float) this.field5321[var4.field550] * var2.field6697 + (float) this.field5399[var4.field550] * var2.field6696 + (float) this.field5309[var4.field550] * var2.field6704 + var2.field6702);
                var5.field545 = (int) ((float) this.field5321[var4.field550] * var2.field6705 + (float) this.field5399[var4.field550] * var2.field6669 + (float) this.field5309[var4.field550] * var2.field6689 + var2.field6681);
                var5.field552 = (int) ((float) this.field5321[var4.field550] * var2.field6673 + (float) this.field5399[var4.field550] * var2.field6692 + (float) this.field5309[var4.field550] * var2.field6670 + var2.field6700);
                var5.field544 = (int) ((float) this.field5321[var4.field535] * var2.field6697 + (float) this.field5399[var4.field535] * var2.field6696 + (float) this.field5309[var4.field535] * var2.field6704 + var2.field6702);
                var5.field551 = (int) ((float) this.field5321[var4.field535] * var2.field6705 + (float) this.field5399[var4.field535] * var2.field6669 + (float) this.field5309[var4.field535] * var2.field6689 + var2.field6681);
                var5.field537 = (int) ((float) this.field5321[var4.field535] * var2.field6673 + (float) this.field5399[var4.field535] * var2.field6692 + (float) this.field5309[var4.field535] * var2.field6670 + var2.field6700);
            }
        }
        if (this.field5417 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5417.length; var6++) {
            class491 var7 = this.field5417[var6];
            class491 var8 = var7;
            if (var7.field6902 != null) {
                var8 = var7.field6902;
            }
            if (var7.field6900 == null) {
                var7.field6900 = var2.method906();
            } else {
                var7.field6900.method900(var2);
            }
            var8.field6898 = (int) ((float) this.field5321[var7.field6901] * var2.field6697 + (float) this.field5399[var7.field6901] * var2.field6696 + (float) this.field5309[var7.field6901] * var2.field6704 + var2.field6702);
            var8.field6894 = (int) ((float) this.field5321[var7.field6901] * var2.field6705 + (float) this.field5399[var7.field6901] * var2.field6669 + (float) this.field5309[var7.field6901] * var2.field6689 + var2.field6681);
            var8.field6896 = (int) ((float) this.field5321[var7.field6901] * var2.field6673 + (float) this.field5399[var7.field6901] * var2.field6692 + (float) this.field5309[var7.field6901] * var2.field6670 + var2.field6700);
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Ldc;I)Luh;")
    public static final class415 method2373(class63 arg0, int arg1) {
        field5377++;
        if (arg1 <= 22) {
            return null;
        } else {
            int var2 = arg0.method457(-14532);
            return new class415(var2);
        }
    }

    @OriginalMember(owner = "client!dn", name = "HA", descriptor = "()I")
    public final int method1693() {
        field5397++;
        if (!this.field5391) {
            this.method2360(-123);
        }
        return this.field5357;
    }

    @OriginalMember(owner = "client!dn", name = "ba", descriptor = "(Lr;)Lr;")
    public final class709 method1701(class709 arg0) {
        field5324++;
        if (this.field5414 == 0) {
            return null;
        }
        if (!this.field5391) {
            this.method2360(-121);
        }
        int var2;
        int var3;
        if (this.field5311.field9090 > 0) {
            var2 = this.field5326 - (this.field5311.field9090 * this.field5322 >> 8) >> this.field5311.field9011;
            var3 = this.field5359 - (this.field5311.field9090 * this.field5319 >> 8) >> this.field5311.field9011;
        } else {
            var2 = this.field5326 - (this.field5311.field9090 * this.field5319 >> 8) >> this.field5311.field9011;
            var3 = this.field5359 - (this.field5311.field9090 * this.field5322 >> 8) >> this.field5311.field9011;
        }
        int var4;
        int var5;
        if (this.field5311.field9118 <= 0) {
            var4 = this.field5357 - (this.field5311.field9118 * this.field5319 >> 8) >> this.field5311.field9011;
            var5 = this.field5388 - (this.field5311.field9118 * this.field5322 >> 8) >> this.field5311.field9011;
        } else {
            var4 = this.field5357 - (this.field5311.field9118 * this.field5322 >> 8) >> this.field5311.field9011;
            var5 = this.field5388 - (this.field5311.field9118 * this.field5319 >> 8) >> this.field5311.field9011;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 - (var4 - 1);
        class231 var8 = (class231) arg0;
        class231 var9;
        if (var8 != null && var8.method1378(var6, var7, true)) {
            var9 = var8;
            var8.method1381(83);
        } else {
            var9 = new class231(this.field5311, var6, var7);
        }
        var9.method1383(var3, var5, var2, var4, 0);
        this.method2369(var9, (byte) 37);
        return var9;
    }

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "(III)V")
    public final void method1672(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5389; var4++) {
            if (arg0 != 0) {
                this.field5399[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5309[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field5321[var4] += arg2;
            }
        }
        field5315++;
        if (this.field5403 != null) {
            this.field5403.field7060 = null;
        }
        this.field5391 = false;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ldw;)V")
    public class378(class664 arg0) {
        this.field5311 = arg0;
        this.field5403 = new class509(null, 5126, 3, 0);
        this.field5336 = new class509(null, 5126, 2, 0);
        this.field5371 = new class509(null, 5126, 3, 0);
        this.field5370 = new class509(null, 5121, 4, 0);
        this.field5298 = new class655();
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ldw;Lvo;IIII)V")
    public class378(class664 arg0, class133 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5350 = arg5;
        this.field5311 = arg0;
        this.field5344 = arg2;
        if (class268.method1818(arg5, (byte) -122, arg2)) {
            this.field5403 = new class509(null, 5126, 3, 0);
        }
        if (class329.method2115(arg5, arg2, 0)) {
            this.field5336 = new class509(null, 5126, 2, 0);
        }
        if (class694.method3924(arg5, arg2, 2048)) {
            this.field5371 = new class509(null, 5126, 3, 0);
        }
        if (class324.method2077(-1, arg5, arg2)) {
            this.field5370 = new class509(null, 5121, 4, 0);
        }
        if (class529.method3143(arg5, -125, arg2)) {
            this.field5298 = new class655();
        }
        class270 var7 = arg0.field7623;
        int[] var8 = new int[arg1.field1865];
        this.field5351 = new int[arg1.field1852 + 1];
        for (int var9 = 0; var9 < arg1.field1865; var9++) {
            if (arg1.field1892 == null || arg1.field1892[var9] != 2) {
                if (arg1.field1896 != null && arg1.field1896[var9] != -1) {
                    class239 var173 = var7.method521(arg1.field1896[var9] & 0xFFFF, 106);
                    if (((this.field5350 & 0x40) == 0 || !var173.field3562) && var173.field3560) {
                        continue;
                    }
                }
                var8[this.field5341++] = var9;
                this.field5351[arg1.field1901[var9]]++;
                this.field5351[arg1.field1870[var9]]++;
                this.field5351[arg1.field1871[var9]]++;
            }
        }
        this.field5307 = this.field5341;
        long[] var10 = new long[this.field5341];
        boolean var11 = (this.field5344 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field5341; var12++) {
            int var156 = var8[var12];
            class239 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field1904 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field1904.length; var163++) {
                    class15 var164 = arg1.field1904[var163];
                    if (var164.field144 == var156) {
                        class238 var165 = class345.method2202(var164.field142, -121);
                        if (var165.field3540) {
                            var162 = true;
                        }
                        if (var165.field3553 != -1) {
                            class239 var166 = var7.method521(var165.field3553, 107);
                            if (var166.field3557 == 2) {
                                this.field5345 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field5307--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field1896 != null) {
                var167 = arg1.field1896[var156];
                if (var167 != -1) {
                    var157 = var7.method521(var167 & 0xFFFF, 112);
                    if ((this.field5350 & 0x40) != 0 && var157.field3562) {
                        var167 = -1;
                        var157 = null;
                    } else {
                        var160 = var157.field3561;
                        var161 = var157.field3567;
                        if (var157.field3579 != 0 || var157.field3573 != 0) {
                            this.field5312 = true;
                        }
                    }
                }
            }
            boolean var168 = arg1.field1855 != null && arg1.field1855[var156] != 0 || var157 != null && var157.field3557 != 0;
            if ((var11 || var168) && arg1.field1900 != null) {
                var158 += arg1.field1900[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = (var167 & 0xFFFF << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + (long) var172;
            this.field5312 |= var157 != null && (var157.field3579 != 0 || var157.field3573 != 0);
            this.field5345 |= var168;
        }
        class3.method13((byte) 120, var8, var10);
        this.field5364 = arg1.field1879;
        this.field5321 = arg1.field1878;
        this.field5389 = arg1.field1852;
        this.field5399 = arg1.field1866;
        this.field5320 = arg1.field1903;
        this.field5309 = arg1.field1899;
        this.field5308 = arg1.field1898;
        this.field5417 = arg1.field1893;
        class76[] var13 = new class76[this.field5389];
        if (arg1.field1904 != null) {
            this.field5332 = arg1.field1904.length;
            this.field5343 = new class435[this.field5332];
            this.field5314 = new class253[this.field5332];
            for (int var14 = 0; var14 < this.field5332; var14++) {
                class15 var15 = arg1.field1904[var14];
                class238 var16 = class345.method2202(var15.field142, 90);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5341; var18++) {
                    if (var8[var18] == var15.field144) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class577.field7932[arg1.field1867[var15.field144] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field1855 == null ? 0 : arg1.field1855[var15.field144]) << 24;
                this.field5314[var14] = new class253(var17, arg1.field1901[var15.field144], arg1.field1870[var15.field144], arg1.field1871[var15.field144], var16.field3552, var16.field3551, var16.field3553, var16.field3541, var16.field3548, var16.field3540, var16.field3550, var15.field138);
                this.field5343[var14] = new class435(var20);
            }
        }
        int var21 = this.field5341 * 3;
        this.field5347 = (short) arg4;
        this.field5407 = new short[var21];
        if (arg1.field1884 != null) {
            this.field5418 = new short[this.field5341];
        }
        this.field5310 = new byte[var21];
        this.field5356 = (short) arg3;
        this.field5335 = new short[this.field5341];
        this.field5392 = new short[this.field5341];
        this.field5375 = new byte[this.field5341];
        class381.field5463 = new long[var21];
        this.field5405 = new short[this.field5341];
        this.field5337 = new short[var21];
        this.field5339 = new short[this.field5341];
        this.field5384 = new float[var21];
        this.field5406 = new short[this.field5341];
        this.field5340 = new short[var21];
        this.field5402 = new short[var21];
        this.field5413 = new float[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field1852; var23++) {
            int var155 = this.field5351[var23];
            this.field5351[var23] = var22;
            var22 += var155;
            var13[var23] = new class76();
        }
        this.field5351[arg1.field1852] = var22;
        class532 var24 = class667.method3770(this.field5341, var8, Integer.MAX_VALUE, arg1);
        class621[] var25 = new class621[arg1.field1865];
        for (int var26 = 0; var26 < arg1.field1865; var26++) {
            short var134 = arg1.field1901[var26];
            short var135 = arg1.field1870[var26];
            short var136 = arg1.field1871[var26];
            int var137 = this.field5399[var135] - this.field5399[var134];
            int var138 = this.field5309[var135] - this.field5309[var134];
            int var139 = this.field5321[var135] - this.field5321[var134];
            int var140 = this.field5399[var136] - this.field5399[var134];
            int var141 = this.field5309[var136] - this.field5309[var134];
            int var142 = this.field5321[var136] - this.field5321[var134];
            int var143 = var138 * var142 - var139 * var141;
            int var144 = var139 * var140 - (var137 * var142);
            int var145;
            for (var145 = var137 * var141 - var138 * var140; var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192; var145 >>= 0x1) {
                var143 >>= 0x1;
                var144 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var143 * var143 + var145 * var145 + (var144 * var144)));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var143 * 256 / var146;
            int var148 = var144 * 256 / var146;
            int var149 = var145 * 256 / var146;
            byte var150 = arg1.field1892 == null ? 0 : arg1.field1892[var26];
            if (var150 == 0) {
                class76 var151 = var13[var134];
                var151.field1105 += var148;
                var151.field1110 += var147;
                var151.field1106 += var149;
                var151.field1111++;
                class76 var152 = var13[var135];
                var152.field1110 += var147;
                var152.field1106 += var149;
                var152.field1111++;
                var152.field1105 += var148;
                class76 var153 = var13[var136];
                var153.field1111++;
                var153.field1106 += var149;
                var153.field1105 += var148;
                var153.field1110 += var147;
            } else if (var150 == 1) {
                class621 var154 = var25[var26] = new class621();
                var154.field8316 = var148;
                var154.field8314 = var147;
                var154.field8311 = var149;
            }
        }
        for (int var27 = 0; var27 < this.field5341; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field1867[var43] & 0xFFFF;
            int var45;
            if (arg1.field1860 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field1860[var43];
            }
            int var46;
            if (arg1.field1855 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field1855[var43] & 0xFF;
            }
            short var47 = arg1.field1896 == null ? -1 : arg1.field1896[var43];
            if (var47 != -1 && (this.field5350 & 0x40) != 0) {
                class239 var48 = var7.method521(var47 & 0xFFFF, 118);
                if (var48.field3562) {
                    var47 = -1;
                }
            }
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            byte var55 = 0;
            byte var56 = 0;
            int var57 = 0;
            if (var47 != -1) {
                if (var45 == -1) {
                    var55 = 1;
                    var53 = 0.0F;
                    var52 = 1.0F;
                    var50 = 1.0F;
                    var49 = 0.0F;
                    var56 = 2;
                    var51 = 1.0F;
                    var54 = 0.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field1875[var45];
                    if (var58 == 0) {
                        short var87 = arg1.field1901[var43];
                        short var88 = arg1.field1870[var43];
                        short var89 = arg1.field1871[var43];
                        short var90 = arg1.field1894[var45];
                        short var91 = arg1.field1859[var45];
                        short var92 = arg1.field1880[var45];
                        float var93 = (float) arg1.field1866[var90];
                        float var94 = (float) arg1.field1899[var90];
                        float var95 = (float) arg1.field1878[var90];
                        float var96 = (float) arg1.field1866[var91] - var93;
                        float var97 = (float) arg1.field1899[var91] - var94;
                        float var98 = (float) arg1.field1878[var91] - var95;
                        float var99 = (float) arg1.field1866[var92] - var93;
                        float var100 = (float) arg1.field1899[var92] - var94;
                        float var101 = (float) arg1.field1878[var92] - var95;
                        float var102 = (float) arg1.field1866[var87] - var93;
                        float var103 = (float) arg1.field1899[var87] - var94;
                        float var104 = (float) arg1.field1878[var87] - var95;
                        float var105 = (float) arg1.field1866[var88] - var93;
                        float var106 = (float) arg1.field1899[var88] - var94;
                        float var107 = (float) arg1.field1878[var88] - var95;
                        float var108 = (float) arg1.field1866[var89] - var93;
                        float var109 = (float) arg1.field1899[var89] - var94;
                        float var110 = (float) arg1.field1878[var89] - var95;
                        float var111 = var97 * var101 - var98 * var100;
                        float var112 = var98 * var99 - var96 * var101;
                        float var113 = var96 * var100 - (var97 * var99);
                        float var114 = var100 * var113 - (var101 * var112);
                        float var115 = var101 * var111 - var99 * var113;
                        float var116 = var99 * var112 - (var100 * var111);
                        float var117 = 1.0F / (var98 * var116 + var96 * var114 + var97 * var115);
                        var53 = (var110 * var116 + var108 * var114 + var109 * var115) * var117;
                        var51 = (var107 * var116 + var105 * var114 + var106 * var115) * var117;
                        var49 = (var104 * var116 + var102 * var114 + var103 * var115) * var117;
                        float var118 = var98 * var111 - (var96 * var113);
                        float var119 = var97 * var113 - (var98 * var112);
                        float var120 = var96 * var112 - var97 * var111;
                        float var121 = 1.0F / (var101 * var120 + var99 * var119 + var100 * var118);
                        var54 = (var110 * var120 + var108 * var119 + var109 * var118) * var121;
                        var52 = (var107 * var120 + var105 * var119 + var106 * var118) * var121;
                        var50 = (var104 * var120 + var102 * var119 + var103 * var118) * var121;
                    } else {
                        short var59 = arg1.field1901[var43];
                        short var60 = arg1.field1870[var43];
                        short var61 = arg1.field1871[var43];
                        int var62 = var24.field7392[var45];
                        int var63 = var24.field7386[var45];
                        int var64 = var24.field7387[var45];
                        float[] var65 = var24.field7391[var45];
                        byte var66 = arg1.field1868[var45];
                        float var67 = (float) arg1.field1887[var45] / 256.0F;
                        if (var58 == 1) {
                            float var68 = (float) arg1.field1856[var45] / 1024.0F;
                            class524.method3118(arg1.field1878[var59], var64, var66, var63, arg1.field1899[var59], class286.field4114, var67, (byte) 76, var65, var68, var62, arg1.field1866[var59]);
                            var50 = class286.field4114[1];
                            var49 = class286.field4114[0];
                            class524.method3118(arg1.field1878[var60], var64, var66, var63, arg1.field1899[var60], class286.field4114, var67, (byte) 76, var65, var68, var62, arg1.field1866[var60]);
                            var52 = class286.field4114[1];
                            var51 = class286.field4114[0];
                            class524.method3118(arg1.field1878[var61], var64, var66, var63, arg1.field1899[var61], class286.field4114, var67, (byte) 76, var65, var68, var62, arg1.field1866[var61]);
                            var53 = class286.field4114[0];
                            var54 = class286.field4114[1];
                            float var69 = var68 / 2.0F;
                            if ((var66 & 0x1) == 0) {
                                if (var69 < var51 - var49) {
                                    var55 = 1;
                                    var51 -= var68;
                                } else if (var49 - var51 > var69) {
                                    var55 = 2;
                                    var51 += var68;
                                }
                                if (var53 - var49 > var69) {
                                    var56 = 1;
                                    var53 -= var68;
                                } else if (var69 < var49 - var53) {
                                    var53 += var68;
                                    var56 = 2;
                                }
                            } else {
                                if (var69 < var54 - var50) {
                                    var54 -= var68;
                                    var56 = 1;
                                } else if (var50 - var54 > var69) {
                                    var56 = 2;
                                    var54 += var68;
                                }
                                if (var69 < var52 - var50) {
                                    var52 -= var68;
                                    var55 = 1;
                                } else if (var50 - var52 > var69) {
                                    var55 = 2;
                                    var52 += var68;
                                }
                            }
                        } else if (var58 == 2) {
                            float var70 = (float) arg1.field1873[var45] / 256.0F;
                            float var71 = (float) arg1.field1861[var45] / 256.0F;
                            int var72 = arg1.field1866[var60] - arg1.field1866[var59];
                            int var73 = arg1.field1899[var60] - arg1.field1899[var59];
                            int var74 = arg1.field1878[var60] - arg1.field1878[var59];
                            int var75 = arg1.field1866[var61] - arg1.field1866[var59];
                            int var76 = arg1.field1899[var61] - arg1.field1899[var59];
                            int var77 = arg1.field1878[var61] - arg1.field1878[var59];
                            int var78 = var73 * var77 - (var74 * var76);
                            int var79 = var74 * var75 - var72 * var77;
                            int var80 = var72 * var76 - var73 * var75;
                            float var81 = 64.0F / (float) arg1.field1864[var45];
                            float var82 = 64.0F / (float) arg1.field1883[var45];
                            float var83 = 64.0F / (float) arg1.field1856[var45];
                            float var84 = (var65[2] * (float) var80 + var65[1] * (float) var79 + var65[0] * (float) var78) / var81;
                            float var85 = (var65[5] * (float) var80 + var65[3] * (float) var78 + var65[4] * (float) var79) / var82;
                            float var86 = (var65[8] * (float) var80 + var65[7] * (float) var79 + var65[6] * (float) var78) / var83;
                            var57 = class544.method3216(var84, (byte) -56, var85, var86);
                            class608.method3458(var67, arg1.field1866[var59], var57, var65, var70, arg1.field1899[var59], var71, var66, (byte) -82, var64, var63, var62, class286.field4114, arg1.field1878[var59]);
                            var50 = class286.field4114[1];
                            var49 = class286.field4114[0];
                            class608.method3458(var67, arg1.field1866[var60], var57, var65, var70, arg1.field1899[var60], var71, var66, (byte) -109, var64, var63, var62, class286.field4114, arg1.field1878[var60]);
                            var52 = class286.field4114[1];
                            var51 = class286.field4114[0];
                            class608.method3458(var67, arg1.field1866[var61], var57, var65, var70, arg1.field1899[var61], var71, var66, (byte) -38, var64, var63, var62, class286.field4114, arg1.field1878[var61]);
                            var54 = class286.field4114[1];
                            var53 = class286.field4114[0];
                        } else if (var58 == 3) {
                            class279.method1868(var66, var63, var67, var65, class286.field4114, -97, var62, arg1.field1878[var59], arg1.field1866[var59], var64, arg1.field1899[var59]);
                            var50 = class286.field4114[1];
                            var49 = class286.field4114[0];
                            class279.method1868(var66, var63, var67, var65, class286.field4114, 73, var62, arg1.field1878[var60], arg1.field1866[var60], var64, arg1.field1899[var60]);
                            var52 = class286.field4114[1];
                            var51 = class286.field4114[0];
                            class279.method1868(var66, var63, var67, var65, class286.field4114, -120, var62, arg1.field1878[var61], arg1.field1866[var61], var64, arg1.field1899[var61]);
                            var54 = class286.field4114[1];
                            var53 = class286.field4114[0];
                            if ((var66 & 0x1) == 0) {
                                if (var51 - var49 > 0.5F) {
                                    var55 = 1;
                                    var51--;
                                } else if (var49 - var51 > 0.5F) {
                                    var51++;
                                    var55 = 2;
                                }
                                if (var53 - var49 > 0.5F) {
                                    var56 = 1;
                                    var53--;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                            } else {
                                if ((var52 - var50 > 0.5F)) {
                                    var52--;
                                    var55 = 1;
                                } else if (var50 - var52 > 0.5F) {
                                    var55 = 2;
                                    var52++;
                                }
                                if (var54 - var50 > 0.5F) {
                                    var56 = 1;
                                    var54--;
                                } else if (var50 - var54 > 0.5F) {
                                    var56 = 2;
                                    var54++;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field1892 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field1892[var43];
            }
            if (var122 == 0) {
                long var126 = ((long) (var44 << 8) + (long) (var57 << 24) + (long) var46 << 32) + (long) (var45 << 2);
                short var128 = arg1.field1901[var43];
                short var129 = arg1.field1870[var43];
                short var130 = arg1.field1871[var43];
                class76 var131 = var13[var128];
                this.field5335[var27] = this.method2364(var131.field1110, var50, var131.field1105, arg1, var126, var128, var49, var131.field1106, true, var131.field1111);
                class76 var132 = var13[var129];
                this.field5405[var27] = this.method2364(var132.field1110, var52, var132.field1105, arg1, (long) var55 + var126, var129, var51, var132.field1106, true, var132.field1111);
                class76 var133 = var13[var130];
                this.field5339[var27] = this.method2364(var133.field1110, var54, var133.field1105, arg1, (long) var56 + var126, var130, var53, var133.field1106, true, var133.field1111);
            } else if (var122 == 1) {
                class621 var123 = var25[var43];
                long var124 = (long) ((var123.field8316 + 256 << 12) + (var123.field8314 <= 0 ? 2048 : 1024) + ((var45 << 2) - -(var123.field8311 + 256 << 22))) + ((long) (var57 << 24) + (long) var46 + ((long) (var44 << 8)) << 32);
                this.field5335[var27] = this.method2364(var123.field8314, var50, var123.field8316, arg1, var124, arg1.field1901[var43], var49, var123.field8311, true, 0);
                this.field5405[var27] = this.method2364(var123.field8314, var52, var123.field8316, arg1, (long) var55 + var124, arg1.field1870[var43], var51, var123.field8311, true, 0);
                this.field5339[var27] = this.method2364(var123.field8314, var54, var123.field8316, arg1, (long) var56 + var124, arg1.field1871[var43], var53, var123.field8311, true, 0);
            }
            if (arg1.field1855 != null) {
                this.field5375[var27] = arg1.field1855[var43];
            }
            if (arg1.field1884 != null) {
                this.field5418[var27] = arg1.field1884[var43];
            }
            this.field5406[var27] = arg1.field1867[var43];
            this.field5392[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field5307; var30++) {
            short var42 = this.field5392[var30];
            if (var29 != var42) {
                var29 = var42;
                var28++;
            }
        }
        this.field5348 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field5307; var33++) {
            short var41 = this.field5392[var33];
            if (var32 != var41) {
                this.field5348[var31++] = var33;
                var32 = var41;
            }
        }
        this.field5348[var31] = this.field5307;
        class381.field5463 = null;
        this.field5402 = class148.method950(this.field5402, 13192, this.field5414);
        this.field5337 = class148.method950(this.field5337, 13192, this.field5414);
        this.field5340 = class148.method950(this.field5340, 13192, this.field5414);
        this.field5310 = class505.method3039(-95, this.field5414, this.field5310);
        this.field5413 = class718.method4023(this.field5414, 27852, this.field5413);
        this.field5384 = class718.method4023(this.field5414, 27852, this.field5384);
        if (arg1.field1889 != null && class745.method4150(this.field5350, arg2, (byte) 86)) {
            this.field5394 = arg1.method841((byte) 76, false);
        }
        if (arg1.field1904 != null && class115.method735(this.field5350, -125, arg2)) {
            this.field5383 = arg1.method839((byte) 86);
        }
        if (arg1.field1890 != null && class414.method2582(this.field5350, arg2, -20157)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field5341; var36++) {
                int var40 = arg1.field1890[var8[var36]];
                if (var40 >= 0) {
                    int var10002 = var35[var40]++;
                    if (var34 < var40) {
                        var34 = var40;
                    }
                }
            }
            this.field5306 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field5306[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field5341; var38++) {
                int var39 = arg1.field1890[var8[var38]];
                if (var39 >= 0) {
                    this.field5306[var39][var35[var39]++] = var38;
                }
            }
        }
    }
}
