import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class381 extends class472 {

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "I")
    private int field5284 = 0;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "Z")
    private boolean field5286 = false;

    @OriginalMember(owner = "client!ln", name = "Cb", descriptor = "Z")
    private boolean field5335 = true;

    @OriginalMember(owner = "client!ln", name = "Xb", descriptor = "I")
    private int field5356 = 0;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "Z")
    private boolean field5288 = false;

    @OriginalMember(owner = "client!ln", name = "Y", descriptor = "Z")
    private boolean field5305 = false;

    @OriginalMember(owner = "client!ln", name = "sc", descriptor = "I")
    private int field5377 = 0;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
    private int field5300 = 0;

    @OriginalMember(owner = "client!ln", name = "Cc", descriptor = "I")
    private int field5387 = 0;

    @OriginalMember(owner = "client!ln", name = "lb", descriptor = "Lac;")
    private class541 field5318;

    @OriginalMember(owner = "client!ln", name = "ic", descriptor = "Lgk;")
    private class475 field5367;

    @OriginalMember(owner = "client!ln", name = "Gb", descriptor = "Lgk;")
    private class475 field5339;

    @OriginalMember(owner = "client!ln", name = "ab", descriptor = "Lgk;")
    private class475 field5307;

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "Lgk;")
    private class475 field5301;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "Ltr;")
    private class296 field5269;

    @OriginalMember(owner = "client!ln", name = "tc", descriptor = "I")
    private int field5378;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    private int field5268;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "[I")
    private int[] field5293;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "[I")
    private int[] field5278;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "[S")
    private short[] field5273;

    @OriginalMember(owner = "client!ln", name = "cc", descriptor = "[I")
    private int[] field5361;

    @OriginalMember(owner = "client!ln", name = "X", descriptor = "[I")
    private int[] field5304;

    @OriginalMember(owner = "client!ln", name = "Vb", descriptor = "[Lfk;")
    private class653[] field5354;

    @OriginalMember(owner = "client!ln", name = "fb", descriptor = "[Lcia;")
    private class614[] field5312;

    @OriginalMember(owner = "client!ln", name = "sb", descriptor = "I")
    private int field5325;

    @OriginalMember(owner = "client!ln", name = "Kb", descriptor = "[Lpk;")
    private class199[] field5343;

    @OriginalMember(owner = "client!ln", name = "cb", descriptor = "[Loaa;")
    private class290[] field5309;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "[S")
    private short[] field5275;

    @OriginalMember(owner = "client!ln", name = "xb", descriptor = "[S")
    private short[] field5330;

    @OriginalMember(owner = "client!ln", name = "wc", descriptor = "[S")
    private short[] field5381;

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "[S")
    private short[] field5295;

    @OriginalMember(owner = "client!ln", name = "Ec", descriptor = "[F")
    private float[] field5389;

    @OriginalMember(owner = "client!ln", name = "Lb", descriptor = "[S")
    private short[] field5344;

    @OriginalMember(owner = "client!ln", name = "hb", descriptor = "[S")
    private short[] field5314;

    @OriginalMember(owner = "client!ln", name = "Db", descriptor = "S")
    private short field5336;

    @OriginalMember(owner = "client!ln", name = "ub", descriptor = "S")
    private short field5327;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "[S")
    private short[] field5290;

    @OriginalMember(owner = "client!ln", name = "Wb", descriptor = "[B")
    private byte[] field5355;

    @OriginalMember(owner = "client!ln", name = "jc", descriptor = "[F")
    private float[] field5368;

    @OriginalMember(owner = "client!ln", name = "Zb", descriptor = "[S")
    private short[] field5358;

    @OriginalMember(owner = "client!ln", name = "Z", descriptor = "[B")
    private byte[] field5306;

    @OriginalMember(owner = "client!ln", name = "dc", descriptor = "[S")
    private short[] field5362;

    @OriginalMember(owner = "client!ln", name = "bb", descriptor = "[S")
    private short[] field5308;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "[I")
    private int[] field5291;

    @OriginalMember(owner = "client!ln", name = "gc", descriptor = "[[I")
    private int[][] field5365;

    @OriginalMember(owner = "client!ln", name = "Hb", descriptor = "[[I")
    private int[][] field5340;

    @OriginalMember(owner = "client!ln", name = "Ab", descriptor = "[[I")
    private int[][] field5333;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "[Z")
    public static boolean[] field5272 = new boolean[8];

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "I")
    public static int field5302 = -1;

    @OriginalMember(owner = "client!ln", name = "ac", descriptor = "B")
    private byte field5359;

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!ln", name = "W", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!ln", name = "eb", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!ln", name = "gb", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!ln", name = "ib", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!ln", name = "jb", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!ln", name = "kb", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!ln", name = "mb", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!ln", name = "nb", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!ln", name = "ob", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!ln", name = "pb", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!ln", name = "qb", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!ln", name = "rb", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!ln", name = "tb", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!ln", name = "vb", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!ln", name = "yb", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!ln", name = "zb", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!ln", name = "Bb", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ln", name = "Eb", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!ln", name = "Jb", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!ln", name = "Mb", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ln", name = "Nb", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!ln", name = "Pb", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ln", name = "Qb", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!ln", name = "Rb", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!ln", name = "Sb", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!ln", name = "Tb", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!ln", name = "Yb", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!ln", name = "bc", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!ln", name = "ec", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!ln", name = "fc", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!ln", name = "hc", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!ln", name = "kc", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!ln", name = "nc", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!ln", name = "oc", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!ln", name = "pc", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!ln", name = "qc", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!ln", name = "rc", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!ln", name = "uc", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!ln", name = "vc", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!ln", name = "xc", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!ln", name = "yc", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!ln", name = "zc", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!ln", name = "Ac", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!ln", name = "Bc", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!ln", name = "Dc", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!ln", name = "Fc", descriptor = "Lbb;")
    private class336 field5390;

    @OriginalMember(owner = "client!ln", name = "Ub", descriptor = "Ldw;")
    private class718 field5353;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "Lob;")
    private class738 field5271;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "S")
    private short field5280;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "S")
    private short field5281;

    @OriginalMember(owner = "client!ln", name = "db", descriptor = "S")
    private short field5310;

    @OriginalMember(owner = "client!ln", name = "wb", descriptor = "S")
    private short field5329;

    @OriginalMember(owner = "client!ln", name = "Ib", descriptor = "S")
    private short field5341;

    @OriginalMember(owner = "client!ln", name = "Ob", descriptor = "S")
    private short field5347;

    @OriginalMember(owner = "client!ln", name = "lc", descriptor = "S")
    private short field5370;

    @OriginalMember(owner = "client!ln", name = "mc", descriptor = "S")
    private short field5371;

    @OriginalMember(owner = "client!ln", name = "Fb", descriptor = "[I")
    public static int[] field5338;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIIII)Z", line = 5)
    private final boolean method2229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5315++;
        if (arg7 != 18818) {
            this.field5325 = 66;
        }
        if (arg2 < arg6 && arg1 > arg2 && arg2 < arg0) {
            return false;
        } else if (arg6 < arg2 && arg1 < arg2 && arg2 > arg0) {
            return false;
        } else if (arg5 > arg8 && arg8 < arg4 && arg8 < arg3) {
            return false;
        } else {
            return arg8 <= arg5 || arg4 >= arg8 || arg3 >= arg8;
        }
    }

    @OriginalMember(owner = "client!ln", name = "RA", descriptor = "()I", line = 29)
    public final int method203() {
        if (!this.field5286) {
            this.method2232(-128);
        }
        field5345++;
        return this.field5310;
    }

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "()I", line = 43)
    public final int method205() {
        field5360++;
        if (!this.field5286) {
            this.method2232(-102);
        }
        return this.field5281;
    }

    @OriginalMember(owner = "client!ln", name = "na", descriptor = "()I", line = 56)
    public final int method245() {
        field5276++;
        if (!this.field5286) {
            this.method2232(-118);
        }
        return this.field5341;
    }

    @OriginalMember(owner = "client!ln", name = "ua", descriptor = "()I", line = 69)
    public final int method225() {
        field5321++;
        return this.field5378;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V", line = 77)
    public static void method2230(int arg0) {
        field5338 = null;
        if (arg0 != 0) {
            method2236(null, 93, -2, -11, 41, 13, 96, 27, -66, 57, -56);
        }
        field5272 = null;
    }

    @OriginalMember(owner = "client!ln", name = "aa", descriptor = "(SS)V", line = 88)
    public final void method211(short arg0, short arg1) {
        field5382++;
        class152 var3 = this.field5318.field636;
        for (int var4 = 0; var4 < this.field5300; var4++) {
            if (this.field5330[var4] == arg0) {
                this.field5330[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class335 var7 = var3.method925(arg0 & 0xFFFF, -28755);
            var5 = var7.field4534;
            var6 = var7.field4533;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class335 var10 = var3.method925(arg1 & 0xFFFF, -28755);
            var9 = var10.field4533;
            var8 = var10.field4534;
            if (var10.field4525 != 0 || var10.field4542 != 0) {
                this.field5288 = true;
            }
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field5343 != null) {
            for (int var11 = 0; var11 < this.field5325; var11++) {
                class199 var12 = this.field5343[var11];
                class290 var13 = this.field5309[var11];
                var13.field3845 = class645.field8982[this.field5275[var12.field2368] & 0xFFFF] & 0xFFFFFF | var13.field3845 & 0xFF000000;
            }
        }
        if (this.field5301 != null) {
            this.field5301.field6571 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZZILln;Lln;)Lka;", line = 167)
    private final class472 method2231(int arg0, boolean arg1, boolean arg2, int arg3, class381 arg4, class381 arg5) {
        arg4.field5284 = this.field5284;
        arg4.field5377 = this.field5377;
        field5299++;
        arg4.field5356 = this.field5356;
        arg4.field5387 = this.field5387;
        if ((arg3 & 0x100) == 0) {
            arg4.field5305 = this.field5305;
        } else {
            arg4.field5305 = true;
        }
        arg4.field5268 = this.field5268;
        arg4.field5325 = this.field5325;
        arg4.field5336 = this.field5336;
        arg4.field5300 = this.field5300;
        arg4.field5327 = this.field5327;
        arg4.field5359 = 0;
        arg4.field5288 = this.field5288;
        arg4.field5378 = arg3;
        boolean var7 = class147.method908(this.field5268, arg3, 86);
        boolean var8 = class55.method317(arg3, this.field5268, (byte) 85);
        boolean var9 = class399.method2313(arg3, this.field5268, false);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg4.field5361 = this.field5361;
            } else if (arg5.field5361 == null || arg5.field5361.length < this.field5377) {
                arg4.field5361 = arg5.field5361 = new int[this.field5377];
            } else {
                arg4.field5361 = arg5.field5361;
            }
            if (!var8) {
                arg4.field5304 = this.field5304;
            } else if (arg5.field5304 == null || arg5.field5304.length < this.field5377) {
                arg4.field5304 = arg5.field5304 = new int[this.field5377];
            } else {
                arg4.field5304 = arg5.field5304;
            }
            if (!var9) {
                arg4.field5278 = this.field5278;
            } else if (arg5.field5278 == null || arg5.field5278.length < this.field5377) {
                arg4.field5278 = arg5.field5278 = new int[this.field5377];
            } else {
                arg4.field5278 = arg5.field5278;
            }
            for (int var11 = 0; var11 < this.field5377; var11++) {
                if (var7) {
                    arg4.field5361[var11] = this.field5361[var11];
                }
                if (var8) {
                    arg4.field5304[var11] = this.field5304[var11];
                }
                if (var9) {
                    arg4.field5278[var11] = this.field5278[var11];
                }
            }
        } else {
            arg4.field5361 = this.field5361;
            arg4.field5278 = this.field5278;
            arg4.field5304 = this.field5304;
        }
        if (class584.method3261(arg3, this.field5268, false)) {
            if (arg2) {
                arg4.field5359 = (byte) (arg4.field5359 | 0x1);
            }
            arg4.field5367 = arg5.field5367;
            arg4.field5367.field6567 = this.field5367.field6567;
            arg4.field5367.field6571 = this.field5367.field6571;
        } else if (class396.method2304(arg3, this.field5268, (byte) -112)) {
            arg4.field5367 = this.field5367;
        } else {
            arg4.field5367 = null;
        }
        if (class572.method3214(this.field5268, arg3, 124)) {
            if (arg5.field5275 == null || this.field5300 > arg5.field5275.length) {
                arg4.field5275 = arg5.field5275 = new short[this.field5300];
            } else {
                arg4.field5275 = arg5.field5275;
            }
            for (int var12 = 0; var12 < this.field5300; var12++) {
                arg4.field5275[var12] = this.field5275[var12];
            }
        } else {
            arg4.field5275 = this.field5275;
        }
        if (class571.method3212(arg3, 6, this.field5268)) {
            if (arg5.field5355 == null || arg5.field5355.length < this.field5300) {
                arg4.field5355 = arg5.field5355 = new byte[this.field5300];
            } else {
                arg4.field5355 = arg5.field5355;
            }
            for (int var13 = 0; var13 < this.field5300; var13++) {
                arg4.field5355[var13] = this.field5355[var13];
            }
        } else {
            arg4.field5355 = this.field5355;
        }
        if (class90.method644(55, arg3, this.field5268)) {
            arg4.field5301 = arg5.field5301;
            if (arg2) {
                arg4.field5359 = (byte) (arg4.field5359 | 0x2);
            }
            arg4.field5301.field6571 = this.field5301.field6571;
            arg4.field5301.field6567 = this.field5301.field6567;
        } else if (class653.method3684(this.field5268, 28733, arg3)) {
            arg4.field5301 = this.field5301;
        } else {
            arg4.field5301 = null;
        }
        if (class337.method1998(arg3, 544, this.field5268)) {
            if (arg5.field5308 == null || this.field5284 > arg5.field5308.length) {
                int var14 = this.field5284;
                arg4.field5308 = arg5.field5308 = new short[var14];
                arg4.field5290 = arg5.field5290 = new short[var14];
                arg4.field5358 = arg5.field5358 = new short[var14];
            } else {
                arg4.field5358 = arg5.field5358;
                arg4.field5290 = arg5.field5290;
                arg4.field5308 = arg5.field5308;
            }
            if (this.field5390 == null) {
                for (int var15 = 0; var15 < this.field5284; var15++) {
                    arg4.field5308[var15] = this.field5308[var15];
                    arg4.field5358[var15] = this.field5358[var15];
                    arg4.field5290[var15] = this.field5290[var15];
                }
            } else {
                if (arg5.field5390 == null) {
                    arg5.field5390 = new class336();
                }
                class336 var16 = arg4.field5390 = arg5.field5390;
                if (var16.field4544 == null || var16.field4544.length < this.field5284) {
                    int var17 = this.field5284;
                    var16.field4546 = new short[var17];
                    var16.field4544 = new short[var17];
                    var16.field4543 = new short[var17];
                    var16.field4547 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field5284; var18++) {
                    arg4.field5308[var18] = this.field5308[var18];
                    arg4.field5358[var18] = this.field5358[var18];
                    arg4.field5290[var18] = this.field5290[var18];
                    var16.field4544[var18] = this.field5390.field4544[var18];
                    var16.field4543[var18] = this.field5390.field4543[var18];
                    var16.field4546[var18] = this.field5390.field4546[var18];
                    var16.field4547[var18] = this.field5390.field4547[var18];
                }
            }
            arg4.field5306 = this.field5306;
        } else {
            arg4.field5390 = this.field5390;
            arg4.field5306 = this.field5306;
            arg4.field5290 = this.field5290;
            arg4.field5308 = this.field5308;
            arg4.field5358 = this.field5358;
        }
        if (class190.method1060(arg3, arg0 ^ 0xFFFFCF05, this.field5268)) {
            arg4.field5307 = arg5.field5307;
            if (arg2) {
                arg4.field5359 = (byte) (arg4.field5359 | 0x4);
            }
            arg4.field5307.field6567 = this.field5307.field6567;
            arg4.field5307.field6571 = this.field5307.field6571;
        } else if (class561.method3166(-27984, this.field5268, arg3)) {
            arg4.field5307 = this.field5307;
        } else {
            arg4.field5307 = null;
        }
        if (arg0 != 255) {
            this.field5314 = null;
        }
        if (class257.method1546(arg3, 15849, this.field5268)) {
            if (arg5.field5389 == null || arg5.field5389.length < this.field5300) {
                int var19 = this.field5284;
                arg4.field5389 = arg5.field5389 = new float[var19];
                arg4.field5368 = arg5.field5368 = new float[var19];
            } else {
                arg4.field5389 = arg5.field5389;
                arg4.field5368 = arg5.field5368;
            }
            for (int var20 = 0; var20 < this.field5284; var20++) {
                arg4.field5389[var20] = this.field5389[var20];
                arg4.field5368[var20] = this.field5368[var20];
            }
        } else {
            arg4.field5368 = this.field5368;
            arg4.field5389 = this.field5389;
        }
        if (class111.method747(this.field5268, arg3, -2)) {
            arg4.field5339 = arg5.field5339;
            if (arg2) {
                arg4.field5359 = (byte) (arg4.field5359 | 0x8);
            }
            arg4.field5339.field6567 = this.field5339.field6567;
            arg4.field5339.field6571 = this.field5339.field6571;
        } else if (class247.method1482(arg3, arg0 ^ 0xFF, this.field5268)) {
            arg4.field5339 = this.field5339;
        } else {
            arg4.field5339 = null;
        }
        if (class489.method2751(arg3, 16, this.field5268)) {
            if (arg5.field5381 == null || this.field5300 > arg5.field5381.length) {
                int var21 = this.field5300;
                arg4.field5295 = arg5.field5295 = new short[var21];
                arg4.field5344 = arg5.field5344 = new short[var21];
                arg4.field5381 = arg5.field5381 = new short[var21];
            } else {
                arg4.field5344 = arg5.field5344;
                arg4.field5295 = arg5.field5295;
                arg4.field5381 = arg5.field5381;
            }
            for (int var22 = 0; var22 < this.field5300; var22++) {
                arg4.field5381[var22] = this.field5381[var22];
                arg4.field5295[var22] = this.field5295[var22];
                arg4.field5344[var22] = this.field5344[var22];
            }
        } else {
            arg4.field5381 = this.field5381;
            arg4.field5295 = this.field5295;
            arg4.field5344 = this.field5344;
        }
        if (class224.method1272(this.field5268, (byte) -115, arg3)) {
            arg4.field5269 = arg5.field5269;
            if (arg2) {
                arg4.field5359 = (byte) (arg4.field5359 | 0x10);
            }
            arg4.field5269.field3978 = this.field5269.field3978;
        } else if (class296.method1769(this.field5268, arg3, 2048)) {
            arg4.field5269 = this.field5269;
        } else {
            arg4.field5269 = null;
        }
        if (class463.method2575(123, arg3, this.field5268)) {
            if (arg5.field5330 == null || arg5.field5330.length < this.field5300) {
                int var23 = this.field5300;
                arg4.field5330 = arg5.field5330 = new short[var23];
            } else {
                arg4.field5330 = arg5.field5330;
            }
            for (int var24 = 0; var24 < this.field5300; var24++) {
                arg4.field5330[var24] = this.field5330[var24];
            }
        } else {
            arg4.field5330 = this.field5330;
        }
        if (!class402.method2328(this.field5268, arg3, (byte) 76)) {
            arg4.field5309 = this.field5309;
        } else if (arg5.field5309 == null || this.field5325 > arg5.field5309.length) {
            int var26 = this.field5325;
            arg4.field5309 = arg5.field5309 = new class290[var26];
            for (int var27 = 0; var27 < this.field5325; var27++) {
                arg4.field5309[var27] = this.field5309[var27].method1733(128);
            }
        } else {
            arg4.field5309 = arg5.field5309;
            for (int var25 = 0; var25 < this.field5325; var25++) {
                arg4.field5309[var25].method1732(this.field5309[var25], 6);
            }
        }
        arg4.field5365 = this.field5365;
        arg4.field5291 = this.field5291;
        if (this.field5286) {
            arg4.field5286 = true;
            arg4.field5341 = this.field5341;
            arg4.field5329 = this.field5329;
            arg4.field5280 = this.field5280;
            arg4.field5371 = this.field5371;
            arg4.field5281 = this.field5281;
            arg4.field5347 = this.field5347;
            arg4.field5370 = this.field5370;
            arg4.field5310 = this.field5310;
        } else {
            arg4.field5286 = false;
        }
        arg4.field5340 = this.field5340;
        arg4.field5293 = this.field5293;
        arg4.field5362 = this.field5362;
        arg4.field5314 = this.field5314;
        arg4.field5354 = this.field5354;
        arg4.field5312 = this.field5312;
        arg4.field5343 = this.field5343;
        arg4.field5333 = this.field5333;
        arg4.field5273 = this.field5273;
        return arg4;
    }

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "(I)V", line = 634)
    public final void method236(int arg0) {
        field5357++;
        int var2 = class15.field113[arg0];
        int var3 = class15.field115[arg0];
        for (int var4 = 0; var4 < this.field5356; var4++) {
            int var7 = this.field5361[var4] * var3 + this.field5278[var4] * var2 >> 14;
            this.field5278[var4] = this.field5278[var4] * var3 - (this.field5361[var4] * var2) >> 14;
            this.field5361[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5284; var5++) {
            int var6 = this.field5290[var5] * var2 + (this.field5308[var5] * var3) >> 14;
            this.field5290[var5] = (short) (this.field5290[var5] * var3 - (this.field5308[var5] * var2) >> 14);
            this.field5308[var5] = (short) var6;
        }
        if (this.field5307 == null && this.field5301 != null) {
            this.field5301.field6571 = null;
        }
        if (this.field5307 != null) {
            this.field5307.field6571 = null;
        }
        if (this.field5367 != null) {
            this.field5367.field6571 = null;
        }
        this.field5286 = false;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 682)
    public final void method197(int arg0) {
        field5303++;
        int var2 = class15.field113[arg0];
        int var3 = class15.field115[arg0];
        for (int var4 = 0; var4 < this.field5356; var4++) {
            int var5 = this.field5361[var4] * var3 + this.field5278[var4] * var2 >> 14;
            this.field5278[var4] = this.field5278[var4] * var3 - (this.field5361[var4] * var2) >> 14;
            this.field5361[var4] = var5;
        }
        if (this.field5367 != null) {
            this.field5367.field6571 = null;
        }
        this.field5286 = false;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "()Z", line = 712)
    public final boolean method226() {
        field5326++;
        if (this.field5330 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5330.length; var1++) {
            if (this.field5330[var1] != -1 && !this.field5318.field636.method922(-25, this.field5330[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V", line = 738)
    private final void method2232(int arg0) {
        field5380++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (arg0 >= -85) {
            this.method227(-79, 52, 0);
        }
        while (this.field5356 > var10) {
            int var11 = this.field5361[var10];
            int var12 = this.field5304[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            int var13 = this.field5278[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
            var10++;
        }
        this.field5281 = (short) var2;
        this.field5347 = (short) var6;
        this.field5329 = (short) var3;
        this.field5310 = (short) var5;
        this.field5370 = (short) var7;
        this.field5371 = (short) var4;
        this.field5341 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field5280 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field5286 = true;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lhba;)V", line = 825)
    public final void method217(class10 arg0) {
        field5320++;
        class253 var2 = (class253) arg0;
        if (this.field5354 != null) {
            for (int var3 = 0; var3 < this.field5354.length; var3++) {
                class653 var4 = this.field5354[var3];
                class653 var5 = var4;
                if (var4.field9081 != null) {
                    var5 = var4.field9081;
                }
                var5.field9098 = (int) ((float) this.field5278[var4.field9093] * var2.field3264 + (float) this.field5361[var4.field9093] * var2.field3287 + (float) this.field5304[var4.field9093] * var2.field3263 + var2.field3253);
                var5.field9095 = (int) ((float) this.field5278[var4.field9093] * var2.field3288 + (float) this.field5361[var4.field9093] * var2.field3261 + (float) this.field5304[var4.field9093] * var2.field3255 + var2.field3278);
                var5.field9099 = (int) ((float) this.field5278[var4.field9093] * var2.field3252 + (float) this.field5361[var4.field9093] * var2.field3281 + (float) this.field5304[var4.field9093] * var2.field3257 + var2.field3259);
                var5.field9089 = (int) ((float) this.field5278[var4.field9087] * var2.field3264 + (float) this.field5361[var4.field9087] * var2.field3287 + (float) this.field5304[var4.field9087] * var2.field3263 + var2.field3253);
                var5.field9090 = (int) ((float) this.field5278[var4.field9087] * var2.field3288 + (float) this.field5361[var4.field9087] * var2.field3261 + (float) this.field5304[var4.field9087] * var2.field3255 + var2.field3278);
                var5.field9080 = (int) ((float) this.field5278[var4.field9087] * var2.field3252 + (float) this.field5361[var4.field9087] * var2.field3281 + (float) this.field5304[var4.field9087] * var2.field3257 + var2.field3259);
                var5.field9084 = (int) ((float) this.field5278[var4.field9102] * var2.field3264 + (float) this.field5361[var4.field9102] * var2.field3287 + (float) this.field5304[var4.field9102] * var2.field3263 + var2.field3253);
                var5.field9097 = (int) ((float) this.field5278[var4.field9102] * var2.field3288 + (float) this.field5361[var4.field9102] * var2.field3261 + (float) this.field5304[var4.field9102] * var2.field3255 + var2.field3278);
                var5.field9088 = (int) ((float) this.field5278[var4.field9102] * var2.field3252 + (float) this.field5361[var4.field9102] * var2.field3281 + (float) this.field5304[var4.field9102] * var2.field3257 + var2.field3259);
            }
        }
        if (this.field5312 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5312.length; var6++) {
            class614 var7 = this.field5312[var6];
            class614 var8 = var7;
            if (var7.field8599 != null) {
                var8 = var7.field8599;
            }
            if (var7.field8608 == null) {
                var7.field8608 = var2.method35();
            } else {
                var7.field8608.method25(var2);
            }
            var8.field8604 = (int) ((float) this.field5278[var7.field8598] * var2.field3264 + (float) this.field5361[var7.field8598] * var2.field3287 + (float) this.field5304[var7.field8598] * var2.field3263 + var2.field3253);
            var8.field8601 = (int) ((float) this.field5278[var7.field8598] * var2.field3288 + (float) this.field5361[var7.field8598] * var2.field3261 + (float) this.field5304[var7.field8598] * var2.field3255 + var2.field3278);
            var8.field8612 = (int) ((float) this.field5278[var7.field8598] * var2.field3252 + (float) this.field5361[var7.field8598] * var2.field3281 + (float) this.field5304[var7.field8598] * var2.field3257 + var2.field3259);
        }
    }

    @OriginalMember(owner = "client!ln", name = "VA", descriptor = "(I)V", line = 891)
    public final void method216(int arg0) {
        field5324++;
        int var2 = class15.field113[arg0];
        int var3 = class15.field115[arg0];
        for (int var4 = 0; var4 < this.field5356; var4++) {
            int var5 = this.field5361[var4] * var3 + this.field5304[var4] * var2 >> 14;
            this.field5304[var4] = this.field5304[var4] * var3 - (this.field5361[var4] * var2) >> 14;
            this.field5361[var4] = var5;
        }
        if (this.field5367 != null) {
            this.field5367.field6571 = null;
        }
        this.field5286 = false;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I[IIIIIZ)V", line = 928)
    public final void method239(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5351++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            class25.field190 = 0;
            int var12 = 0;
            class450.field6296 = 0;
            class144.field1869 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field5365.length) {
                    int[] var15 = this.field5365[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class144.field1869 += this.field5361[var17];
                        class450.field6296 += this.field5304[var17];
                        var12++;
                        class25.field190 += this.field5278[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class144.field1869 = var10;
                class450.field6296 = var9;
                class25.field190 = var11;
            } else {
                class450.field6296 = class450.field6296 / var12 + var9;
                class25.field190 = class25.field190 / var12 + var11;
                class144.field1869 = class144.field1869 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field5365.length) {
                    int[] var23 = this.field5365[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5361[var25] += var20;
                        this.field5304[var25] += var18;
                        this.field5278[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field5365.length > var45) {
                    int[] var46 = this.field5365[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5361[var48] -= class144.field1869;
                            this.field5304[var48] -= class450.field6296;
                            this.field5278[var48] -= class25.field190;
                            if (arg4 != 0) {
                                int var49 = class15.field113[arg4];
                                int var50 = class15.field115[arg4];
                                int var51 = this.field5361[var48] * var50 + this.field5304[var48] * var49 + 16383 >> 14;
                                this.field5304[var48] = this.field5304[var48] * var50 + 16383 - (this.field5361[var48] * var49) >> 14;
                                this.field5361[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class15.field113[arg2];
                                int var53 = class15.field115[arg2];
                                int var54 = this.field5304[var48] * var53 + 16383 - (this.field5278[var48] * var52) >> 14;
                                this.field5278[var48] = this.field5304[var48] * var52 + (this.field5278[var48] * var53) + 16383 >> 14;
                                this.field5304[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class15.field113[arg3];
                                int var56 = class15.field115[arg3];
                                int var57 = this.field5361[var48] * var56 + this.field5278[var48] * var55 + 16383 >> 14;
                                this.field5278[var48] = this.field5278[var48] * var56 + 16383 - (this.field5361[var48] * var55) >> 14;
                                this.field5361[var48] = var57;
                            }
                            this.field5361[var48] += class144.field1869;
                            this.field5304[var48] += class450.field6296;
                            this.field5278[var48] += class25.field190;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5361[var59] -= class144.field1869;
                            this.field5304[var59] -= class450.field6296;
                            this.field5278[var59] -= class25.field190;
                            if (arg2 != 0) {
                                int var60 = class15.field113[arg2];
                                int var61 = class15.field115[arg2];
                                int var62 = this.field5304[var59] * var61 + 16383 - this.field5278[var59] * var60 >> 14;
                                this.field5278[var59] = this.field5304[var59] * var60 + (this.field5278[var59] * var61) + 16383 >> 14;
                                this.field5304[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class15.field113[arg4];
                                int var64 = class15.field115[arg4];
                                int var65 = this.field5304[var59] * var63 + (this.field5361[var59] * var64) + 16383 >> 14;
                                this.field5304[var59] = this.field5304[var59] * var64 + 16383 - (this.field5361[var59] * var63) >> 14;
                                this.field5361[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class15.field113[arg3];
                                int var67 = class15.field115[arg3];
                                int var68 = this.field5361[var59] * var67 + (this.field5278[var59] * var66 + 16383) >> 14;
                                this.field5278[var59] = this.field5278[var59] * var67 + 16383 - (this.field5361[var59] * var66) >> 14;
                                this.field5361[var59] = var68;
                            }
                            this.field5361[var59] += class144.field1869;
                            this.field5304[var59] += class450.field6296;
                            this.field5278[var59] += class25.field190;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field5365.length) {
                        int[] var29 = this.field5365[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5293[var31];
                            int var33 = this.field5293[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5362[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class15.field113[arg4];
                                    int var37 = class15.field115[arg4];
                                    int var38 = this.field5308[var35] * var37 + this.field5358[var35] * var36 + 16383 >> 14;
                                    this.field5358[var35] = (short) (this.field5358[var35] * var37 + 16383 - (this.field5308[var35] * var36) >> 14);
                                    this.field5308[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class15.field113[arg2];
                                    int var40 = class15.field115[arg2];
                                    int var41 = this.field5358[var35] * var40 + 16383 - (this.field5290[var35] * var39) >> 14;
                                    this.field5290[var35] = (short) (this.field5290[var35] * var40 + this.field5358[var35] * var39 + 16383 >> 14);
                                    this.field5358[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class15.field113[arg3];
                                    int var43 = class15.field115[arg3];
                                    int var44 = this.field5308[var35] * var43 + this.field5290[var35] * var42 + 16383 >> 14;
                                    this.field5290[var35] = (short) (this.field5290[var35] * var43 + 16383 - (this.field5308[var35] * var42) >> 14);
                                    this.field5308[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field5307 == null && this.field5301 != null) {
                    this.field5301.field6571 = null;
                }
                if (this.field5307 != null) {
                    this.field5307.field6571 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field5365.length) {
                    int[] var71 = this.field5365[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5361[var73] -= class144.field1869;
                        this.field5304[var73] -= class450.field6296;
                        this.field5278[var73] -= class25.field190;
                        this.field5361[var73] = this.field5361[var73] * arg2 >> 7;
                        this.field5304[var73] = this.field5304[var73] * arg3 >> 7;
                        this.field5278[var73] = this.field5278[var73] * arg4 >> 7;
                        this.field5361[var73] += class144.field1869;
                        this.field5304[var73] += class450.field6296;
                        this.field5278[var73] += class25.field190;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5333 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field5333.length) {
                        int[] var79 = this.field5333[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field5355[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field5355[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field5301 != null) {
                            this.field5301.field6571 = null;
                        }
                    }
                }
                if (this.field5343 != null) {
                    for (int var75 = 0; var75 < this.field5325; var75++) {
                        class199 var76 = this.field5343[var75];
                        class290 var77 = this.field5309[var75];
                        var77.field3845 = var77.field3845 & 0xFFFFFF | 255 - (this.field5355[var76.field2368] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5333 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field5333.length > var87) {
                        int[] var88 = this.field5333[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field5275[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFEC7) >> 10;
                            int var93 = (var91 & 0x3D9) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = arg2 + var92 & 0x3F;
                            int var97 = arg4 + var94;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field5275[var90] = (short) class344.method2020(var97, class344.method2020(var96 << 10, var95 << 7));
                        }
                        if (var88.length > 0 && this.field5301 != null) {
                            this.field5301.field6571 = null;
                        }
                    }
                }
                if (this.field5343 != null) {
                    for (int var84 = 0; var84 < this.field5325; var84++) {
                        class199 var85 = this.field5343[var84];
                        class290 var86 = this.field5309[var84];
                        var86.field3845 = var86.field3845 & 0xFF000000 | class645.field8982[this.field5275[var85.field2368] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5340 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field5340.length > var99) {
                        int[] var100 = this.field5340[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class290 var102 = this.field5309[var100[var101]];
                            var102.field3846 += arg3;
                            var102.field3839 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5340 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field5340.length) {
                        int[] var105 = this.field5340[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class290 var107 = this.field5309[var105[var106]];
                            var107.field3838 = var107.field3838 * arg2 >> 7;
                            var107.field3847 = var107.field3847 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5340 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field5340.length) {
                    int[] var110 = this.field5340[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class290 var112 = this.field5309[var110[var111]];
                        var112.field3840 = var112.field3840 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lhba;IZ)V", line = 1584)
    public final void method208(class10 arg0, int arg1, boolean arg2) {
        field5369++;
        if (this.field5273 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field5356; var5++) {
            if ((arg1 & this.field5273[var5]) != 0) {
                if (arg2) {
                    arg0.method29(this.field5361[var5], this.field5304[var5], this.field5278[var5], var4);
                } else {
                    arg0.method36(this.field5361[var5], this.field5304[var5], this.field5278[var5], var4);
                }
                this.field5361[var5] = var4[0];
                this.field5304[var5] = var4[1];
                this.field5278[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "NA", descriptor = "()Z", line = 1618)
    public final boolean method220() {
        field5311++;
        if (this.field5365 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5377; var1++) {
            this.field5361[var1] <<= 0x4;
            this.field5304[var1] <<= 0x4;
            this.field5278[var1] <<= 0x4;
        }
        class450.field6296 = 0;
        class25.field190 = 0;
        class144.field1869 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "(III)V", line = 1646)
    public final void method227(int arg0, int arg1, int arg2) {
        field5331++;
        for (int var4 = 0; var4 < this.field5356; var4++) {
            if (arg0 != 128) {
                this.field5361[var4] = this.field5361[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5304[var4] = this.field5304[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field5278[var4] = this.field5278[var4] * arg2 >> 7;
            }
        }
        if (this.field5367 != null) {
            this.field5367.field6571 = null;
        }
        this.field5286 = false;
    }

    @OriginalMember(owner = "client!ln", name = "ba", descriptor = "(Lr;)Lr;", line = 1677)
    public final class184 method215(class184 arg0) {
        field5292++;
        if (this.field5284 == 0) {
            return null;
        }
        if (!this.field5286) {
            this.method2232(-107);
        }
        int var2;
        int var3;
        if (this.field5318.field7609 <= 0) {
            var2 = this.field5281 - (this.field5318.field7609 * this.field5329 >> 8) >> this.field5318.field7530;
            var3 = this.field5310 - (this.field5318.field7609 * this.field5347 >> 8) >> this.field5318.field7530;
        } else {
            var2 = this.field5281 - (this.field5318.field7609 * this.field5347 >> 8) >> this.field5318.field7530;
            var3 = this.field5310 - (this.field5318.field7609 * this.field5329 >> 8) >> this.field5318.field7530;
        }
        int var4;
        int var5;
        if (this.field5318.field7588 <= 0) {
            var4 = this.field5371 - (this.field5318.field7588 * this.field5329 >> 8) >> this.field5318.field7530;
            var5 = this.field5370 - (this.field5318.field7588 * this.field5347 >> 8) >> this.field5318.field7530;
        } else {
            var4 = this.field5371 - (this.field5318.field7588 * this.field5347 >> 8) >> this.field5318.field7530;
            var5 = this.field5370 - (this.field5318.field7588 * this.field5329 >> 8) >> this.field5318.field7530;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class322 var8 = (class322) arg0;
        class322 var9;
        if (var8 != null && var8.method1926(var7, (byte) -125, var6)) {
            var9 = var8;
            var8.method1925(92);
        } else {
            var9 = new class322(this.field5318, var6, var7);
        }
        var9.method1922(var2, var5, var3, var4, -1);
        this.method2238(var9, 0);
        return var9;
    }

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "(I[IIIIZI[I)V", line = 1742)
    public final void method222(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5342++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            class144.field1869 = 0;
            class25.field190 = 0;
            int var13 = 0;
            class450.field6296 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5365.length) {
                    int[] var16 = this.field5365[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5273 == null || (arg6 & this.field5273[var18]) != 0) {
                            class144.field1869 += this.field5361[var18];
                            class450.field6296 += this.field5304[var18];
                            var13++;
                            class25.field190 += this.field5278[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class144.field1869 = var12;
                class450.field6296 = var10;
                class25.field190 = var11;
            } else {
                class450.field6296 = class450.field6296 / var13 + var10;
                class144.field1869 = class144.field1869 / var13 + var12;
                class732.field10192 = true;
                class25.field190 = class25.field190 / var13 + var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + (arg7[1] * arg3) + 8192 >> 14;
                int var20 = arg7[3] * arg2 + 8192 - (-(arg7[4] * arg3) - arg7[5] * arg4) >> 14;
                int var21 = arg7[6] * arg2 - (-(arg7[8] * arg4) - (arg7[7] * arg3) - 8192) >> 14;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5365.length) {
                    int[] var27 = this.field5365[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5273 == null || (this.field5273[var29] & arg6) != 0) {
                            this.field5361[var29] += var24;
                            this.field5304[var29] += var23;
                            this.field5278[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field5365.length > var109) {
                        int[] var110 = this.field5365[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field5273 == null || (arg6 & this.field5273[var112]) != 0) {
                                this.field5361[var112] -= class144.field1869;
                                this.field5304[var112] -= class450.field6296;
                                this.field5278[var112] -= class25.field190;
                                if (arg4 != 0) {
                                    int var113 = class15.field113[arg4];
                                    int var114 = class15.field115[arg4];
                                    int var115 = this.field5361[var112] * var114 + this.field5304[var112] * var113 + 16383 >> 14;
                                    this.field5304[var112] = this.field5304[var112] * var114 + 16383 - (this.field5361[var112] * var113) >> 14;
                                    this.field5361[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class15.field113[arg2];
                                    int var117 = class15.field115[arg2];
                                    int var118 = this.field5304[var112] * var117 + 16383 - (this.field5278[var112] * var116) >> 14;
                                    this.field5278[var112] = this.field5304[var112] * var116 + (this.field5278[var112] * var117) + 16383 >> 14;
                                    this.field5304[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class15.field113[arg3];
                                    int var120 = class15.field115[arg3];
                                    int var121 = this.field5278[var112] * var119 + (this.field5361[var112] * var120) + 16383 >> 14;
                                    this.field5278[var112] = this.field5278[var112] * var120 + 16383 - (this.field5361[var112] * var119) >> 14;
                                    this.field5361[var112] = var121;
                                }
                                this.field5361[var112] += class144.field1869;
                                this.field5304[var112] += class450.field6296;
                                this.field5278[var112] += class25.field190;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field5365.length) {
                            int[] var93 = this.field5365[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field5273 == null || (this.field5273[var95] & arg6) != 0) {
                                    int var96 = this.field5293[var95];
                                    int var97 = this.field5293[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field5362[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class15.field113[arg4];
                                            int var101 = class15.field115[arg4];
                                            int var102 = this.field5358[var99] * var100 + this.field5308[var99] * var101 + 16383 >> 14;
                                            this.field5358[var99] = (short) (this.field5358[var99] * var101 + 16383 - (this.field5308[var99] * var100) >> 14);
                                            this.field5308[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class15.field113[arg2];
                                            int var104 = class15.field115[arg2];
                                            int var105 = this.field5358[var99] * var104 + 16383 - (this.field5290[var99] * var103) >> 14;
                                            this.field5290[var99] = (short) (this.field5290[var99] * var104 + this.field5358[var99] * var103 + 16383 >> 14);
                                            this.field5358[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class15.field113[arg3];
                                            int var107 = class15.field115[arg3];
                                            int var108 = this.field5308[var99] * var107 + this.field5290[var99] * var106 + 16383 >> 14;
                                            this.field5290[var99] = (short) (this.field5290[var99] * var107 + 16383 - (this.field5308[var99] * var106) >> 14);
                                            this.field5308[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5307 == null && this.field5301 != null) {
                        this.field5301.field6571 = null;
                    }
                    if (this.field5307 != null) {
                        this.field5307.field6571 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class732.field10192) {
                    int var36 = arg7[0] * class144.field1869 + arg7[6] * class25.field190 + arg7[3] * class450.field6296 + 8192 >> 14;
                    int var37 = arg7[7] * class25.field190 + arg7[4] * class450.field6296 + arg7[1] * class144.field1869 + 8192 >> 14;
                    int var38 = var34 + var37;
                    int var39 = arg7[2] * class144.field1869 + arg7[8] * class25.field190 + arg7[5] * class450.field6296 + 8192 >> 14;
                    int var40 = var33 + var36;
                    class144.field1869 = var40;
                    class450.field6296 = var38;
                    int var41 = var35 + var39;
                    class732.field10192 = false;
                    class25.field190 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class15.field115[arg2];
                int var44 = class15.field113[arg2];
                int var45 = class15.field115[arg3];
                int var46 = class15.field113[arg3];
                int var47 = class15.field115[arg4];
                int var48 = class15.field113[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[7] = var45 * var49 + var46 * var48 + 8192 >> 14;
                var42[5] = -var44;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                int var51 = var42[2] * -class25.field190 + var42[0] * -class144.field1869 + var42[1] * -class450.field6296 + 8192 >> 14;
                int var52 = var42[3] * -class144.field1869 + 8192 - (-(var42[4] * -class450.field6296) - var42[5] * -class25.field190) >> 14;
                int var53 = var42[6] * -class144.field1869 + (var42[7] * -class450.field6296) - (-(var42[8] * -class25.field190) - 8192) >> 14;
                int var54 = class144.field1869 + var51;
                int var55 = class450.field6296 + var52;
                int var56 = class25.field190 + var53;
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
                int var59 = var42[0] * var33 + (var42[1] * var34 - (-(var42[2] * var35) - 8192)) >> 14;
                int var60 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 8192 >> 14;
                int var61 = var42[7] * var34 + var42[6] * var33 + var42[8] * var35 + 8192 >> 14;
                int var62 = var54 + var59;
                int var63 = var55 + var60;
                int var64 = var56 + var61;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[0] * var62 + (arg7[1] * var63 + (arg7[2] * var64)) + 8192 >> 14;
                int var68 = arg7[4] * var63 + arg7[5] * var64 + arg7[3] * var62 + 8192 >> 14;
                int var69 = var30 + var67;
                int var70 = var31 + var68;
                int var71 = arg7[6] * var62 + arg7[7] * var63 + arg7[8] * var64 + 8192 >> 14;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field5365.length) {
                        int[] var75 = this.field5365[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field5273 == null || (this.field5273[var77] & arg6) != 0) {
                                int var78 = this.field5361[var77] * var65[0] + this.field5304[var77] * var65[1] + this.field5278[var77] * var65[2] + 8192 >> 14;
                                int var79 = this.field5361[var77] * var65[3] + this.field5278[var77] * var65[5] + (this.field5304[var77] * var65[4]) + 8192 >> 14;
                                int var80 = this.field5361[var77] * var65[6] + this.field5304[var77] * var65[7] + this.field5278[var77] * var65[8] + 8192 >> 14;
                                int var81 = var70 + var79;
                                int var82 = var69 + var78;
                                int var83 = var72 + var80;
                                this.field5361[var77] = var82;
                                this.field5304[var77] = var81;
                                this.field5278[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field5365.length > var123) {
                        int[] var124 = this.field5365[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field5273 == null || (arg6 & this.field5273[var126]) != 0) {
                                this.field5361[var126] -= class144.field1869;
                                this.field5304[var126] -= class450.field6296;
                                this.field5278[var126] -= class25.field190;
                                this.field5361[var126] = this.field5361[var126] * arg2 >> 7;
                                this.field5304[var126] = this.field5304[var126] * arg3 >> 7;
                                this.field5278[var126] = this.field5278[var126] * arg4 >> 7;
                                this.field5361[var126] += class144.field1869;
                                this.field5304[var126] += class450.field6296;
                                this.field5278[var126] += class25.field190;
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
                if (class732.field10192) {
                    int var133 = arg7[0] * class144.field1869 + 8192 - (-(arg7[3] * class450.field6296) - arg7[6] * class25.field190) >> 14;
                    int var134 = arg7[4] * class450.field6296 + arg7[7] * class25.field190 + arg7[1] * class144.field1869 + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = arg7[5] * class450.field6296 + (arg7[2] * class144.field1869 + (arg7[8] * class25.field190)) + 8192 >> 14;
                    int var137 = var131 + var134;
                    int var138 = var132 + var136;
                    class144.field1869 = var135;
                    class450.field6296 = var137;
                    class25.field190 = var138;
                    class732.field10192 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class144.field1869 * var139 + 8192 >> 14;
                int var143 = -class450.field6296 * var140 + 8192 >> 14;
                int var144 = -class25.field190 * var141 + 8192 >> 14;
                int var145 = class144.field1869 + var142;
                int var146 = class450.field6296 + var143;
                int var147 = class25.field190 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
                int var152 = var146 + var150;
                int var153 = var145 + var149;
                int var154 = var147 + var151;
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
                int var157 = arg7[0] * var153 + arg7[1] * var152 + (arg7[2] * var154) + 8192 >> 14;
                int var158 = arg7[3] * var153 + arg7[4] * var152 + arg7[5] * var154 + 8192 >> 14;
                int var159 = arg7[7] * var152 + arg7[6] * var153 + (arg7[8] * var154) + 8192 >> 14;
                int var160 = var127 + var157;
                int var161 = var128 + var158;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field5365.length > var164) {
                        int[] var165 = this.field5365[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field5273 == null || (arg6 & this.field5273[var167]) != 0) {
                                int var168 = this.field5278[var167] * var155[2] + this.field5361[var167] * var155[0] + this.field5304[var167] * var155[1] + 8192 >> 14;
                                int var169 = this.field5278[var167] * var155[5] + (this.field5361[var167] * var155[3] + this.field5304[var167] * var155[4] + 8192) >> 14;
                                int var170 = this.field5304[var167] * var155[7] + this.field5361[var167] * var155[6] + (this.field5278[var167] * var155[8] - -8192) >> 14;
                                int var171 = var160 + var168;
                                int var172 = var161 + var169;
                                int var173 = var162 + var170;
                                this.field5361[var167] = var171;
                                this.field5304[var167] = var172;
                                this.field5278[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5333 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field5333.length > var181) {
                        int[] var182 = this.field5333[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field5314 == null || (this.field5314[var184] & arg6) != 0) {
                                int var185 = (this.field5355[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field5355[var184] = (byte) var185;
                                if (this.field5301 != null) {
                                    this.field5301.field6571 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5343 != null) {
                    for (int var178 = 0; var178 < this.field5325; var178++) {
                        class199 var179 = this.field5343[var178];
                        class290 var180 = this.field5309[var178];
                        var180.field3845 = 255 - (this.field5355[var179.field2368] & 0xFF) << 24 | var180.field3845 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5333 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field5333.length > var190) {
                        int[] var191 = this.field5333[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field5314 == null || (arg6 & this.field5314[var193]) != 0) {
                                int var194 = this.field5275[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD5B) >> 10;
                                int var196 = (var194 & 0x3FC) >> 7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = var194 & 0x7F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var198;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field5275[var193] = (short) class344.method2020(class344.method2020(var199 << 7, var197 << 10), var200);
                                if (this.field5301 != null) {
                                    this.field5301.field6571 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5343 != null) {
                    for (int var187 = 0; var187 < this.field5325; var187++) {
                        class199 var188 = this.field5343[var187];
                        class290 var189 = this.field5309[var187];
                        var189.field3845 = var189.field3845 & 0xFF000000 | class645.field8982[this.field5275[var188.field2368] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5340 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field5340.length) {
                        int[] var203 = this.field5340[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class290 var205 = this.field5309[var203[var204]];
                            var205.field3846 += arg3;
                            var205.field3839 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5340 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field5340.length > var207) {
                        int[] var208 = this.field5340[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class290 var210 = this.field5309[var208[var209]];
                            var210.field3838 = var210.field3838 * arg2 >> 7;
                            var210.field3847 = var210.field3847 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5340 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field5340.length > var212) {
                    int[] var213 = this.field5340[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class290 var215 = this.field5309[var213[var214]];
                        var215.field3840 = var215.field3840 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BFIIIJFILlv;I)S", line = 2730)
    private final short method2233(byte arg0, float arg1, int arg2, int arg3, int arg4, long arg5, float arg6, int arg7, class446 arg8, int arg9) {
        field5270++;
        int var12 = this.field5293[arg2];
        int var13 = this.field5293[arg2 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field5362[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class102.field1377[var15] == arg5) {
                return (short) (var16 - 1);
            }
        }
        this.field5362[var14] = (short) (this.field5284 + 1);
        class102.field1377[var14] = arg5;
        this.field5308[this.field5284] = (short) arg4;
        this.field5358[this.field5284] = (short) arg7;
        this.field5290[this.field5284] = (short) arg9;
        this.field5306[this.field5284] = (byte) arg3;
        this.field5389[this.field5284] = arg6;
        if (arg0 < 14) {
            return 39;
        } else {
            this.field5368[this.field5284] = arg1;
            return (short) (this.field5284++);
        }
    }

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "(I)V", line = 2780)
    public final void method231(int arg0) {
        this.field5327 = (short) arg0;
        field5332++;
        if (this.field5301 != null) {
            this.field5301.field6571 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "(IIII)V", line = 2803)
    public final void method235(int arg0, int arg1, int arg2, int arg3) {
        field5346++;
        if (arg0 == 0) {
            class144.field1869 = 0;
            class25.field190 = 0;
            class450.field6296 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field5356; var6++) {
                class144.field1869 += this.field5361[var6];
                class450.field6296 += this.field5304[var6];
                class25.field190 += this.field5278[var6];
                var5++;
            }
            if (var5 > 0) {
                class144.field1869 = class144.field1869 / var5 + arg1;
                class25.field190 = class25.field190 / var5 + arg3;
                class450.field6296 = class450.field6296 / var5 + arg2;
            } else {
                class25.field190 = arg3;
                class144.field1869 = arg1;
                class450.field6296 = arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5356; var7++) {
                this.field5361[var7] += arg1;
                this.field5304[var7] += arg2;
                this.field5278[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5356; var8++) {
                this.field5361[var8] -= class144.field1869;
                this.field5304[var8] -= class450.field6296;
                this.field5278[var8] -= class25.field190;
                if (arg3 != 0) {
                    int var9 = class15.field113[arg3];
                    int var10 = class15.field115[arg3];
                    int var11 = this.field5361[var8] * var10 + (this.field5304[var8] * var9 + 16383) >> 14;
                    this.field5304[var8] = this.field5304[var8] * var10 + 16383 - (this.field5361[var8] * var9) >> 14;
                    this.field5361[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class15.field113[arg1];
                    int var13 = class15.field115[arg1];
                    int var14 = this.field5304[var8] * var13 + 16383 - (this.field5278[var8] * var12) >> 14;
                    this.field5278[var8] = this.field5304[var8] * var12 + (this.field5278[var8] * var13 + 16383) >> 14;
                    this.field5304[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class15.field113[arg2];
                    int var16 = class15.field115[arg2];
                    int var17 = this.field5278[var8] * var15 - (-(this.field5361[var8] * var16) - 16383) >> 14;
                    this.field5278[var8] = this.field5278[var8] * var16 + 16383 - (this.field5361[var8] * var15) >> 14;
                    this.field5361[var8] = var17;
                }
                this.field5361[var8] += class144.field1869;
                this.field5304[var8] += class450.field6296;
                this.field5278[var8] += class25.field190;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5356; var18++) {
                this.field5361[var18] -= class144.field1869;
                this.field5304[var18] -= class450.field6296;
                this.field5278[var18] -= class25.field190;
                this.field5361[var18] = this.field5361[var18] * arg1 / 128;
                this.field5304[var18] = this.field5304[var18] * arg2 / 128;
                this.field5278[var18] = this.field5278[var18] * arg3 / 128;
                this.field5361[var18] += class144.field1869;
                this.field5304[var18] += class450.field6296;
                this.field5278[var18] += class25.field190;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5300; var19++) {
                int var23 = (this.field5355[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5355[var19] = (byte) var23;
            }
            if (this.field5301 != null) {
                this.field5301.field6571 = null;
            }
            if (this.field5343 != null) {
                for (int var20 = 0; var20 < this.field5325; var20++) {
                    class199 var21 = this.field5343[var20];
                    class290 var22 = this.field5309[var20];
                    var22.field3845 = 255 - (this.field5355[var21.field2368] & 0xFF) << 24 | var22.field3845 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5300; var24++) {
                int var28 = this.field5275[var24] & 0xFFFF;
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
                this.field5275[var24] = (short) class344.method2020(class344.method2020(var31 << 10, var32 << 7), var34);
            }
            if (this.field5301 != null) {
                this.field5301.field6571 = null;
            }
            if (this.field5343 != null) {
                for (int var25 = 0; var25 < this.field5325; var25++) {
                    class199 var26 = this.field5343[var25];
                    class290 var27 = this.field5309[var25];
                    var27.field3845 = var27.field3845 & 0xFF000000 | class645.field8982[this.field5275[var26.field2368] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5325; var35++) {
                class290 var36 = this.field5309[var35];
                var36.field3846 += arg2;
                var36.field3839 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5325; var37++) {
                class290 var38 = this.field5309[var37];
                var38.field3838 = var38.field3838 * arg1 >> 7;
                var38.field3847 = var38.field3847 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5325; var39++) {
                class290 var40 = this.field5309[var39];
                var40.field3840 = var40.field3840 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "fa", descriptor = "()I", line = 3113)
    public final int method234() {
        if (!this.field5286) {
            this.method2232(-89);
        }
        field5323++;
        return this.field5329;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "()[Lfk;", line = 3124)
    public final class653[] method218() {
        field5317++;
        return this.field5354;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 3134)
    private final void method2234(byte arg0) {
        field5385++;
        if (this.field5387 == 0) {
            return;
        }
        if (this.field5359 != 0) {
            this.method2242(33, true);
        }
        this.method2242(114, false);
        if (this.field5269 != null) {
            if (this.field5269.field3978 == null) {
                this.method2240((this.field5359 & 0x10) != 0, -256);
            }
            if (this.field5269.field3978 != null) {
                this.field5318.method2994(this.field5307 != null, false);
                this.field5318.method3011(this.field5301, this.field5307, this.field5339, this.field5367, 0);
                int var2 = this.field5291.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5291[var3];
                    int var5 = this.field5291[var3 + 1];
                    int var6 = this.field5330[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field5318.method3051(this.field5307 != null, -90, var6);
                    this.field5318.method3008((var5 - var4) * 3, 4, this.field5269.field3978, false, var4 * 3);
                }
            }
        }
        this.method2235(-49);
        if (arg0 != -104) {
            this.field5390 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "LA", descriptor = "(I)V", line = 3193)
    public final void method207(int arg0) {
        this.field5336 = (short) arg0;
        field5322++;
        if (this.field5301 != null) {
            this.field5301.field6571 = null;
        }
        if (this.field5307 != null) {
            this.field5307.field6571 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V", line = 3211)
    private final void method2235(int arg0) {
        field5313++;
        if (!this.field5335) {
            return;
        }
        this.field5335 = false;
        if (arg0 >= -48) {
            this.method224();
        }
        if (this.field5354 == null && this.field5312 == null && this.field5343 == null) {
            if (this.field5361 != null && !class368.method2185(this.field5378, this.field5268, (byte) -11)) {
                if (this.field5367 != null && this.field5367.field6571 == null) {
                    this.field5335 = true;
                } else {
                    if (!this.field5286) {
                        this.method2232(-87);
                    }
                    this.field5361 = null;
                }
            }
            if (this.field5304 != null && !class354.method2049(this.field5378, this.field5268, (byte) 120)) {
                if (this.field5367 != null && this.field5367.field6571 == null) {
                    this.field5335 = true;
                } else {
                    if (!this.field5286) {
                        this.method2232(-102);
                    }
                    this.field5304 = null;
                }
            }
            if (this.field5278 != null && !class413.method2386((byte) -95, this.field5268, this.field5378)) {
                if (this.field5367 != null && this.field5367.field6571 == null) {
                    this.field5335 = true;
                } else {
                    if (!this.field5286) {
                        this.method2232(-111);
                    }
                    this.field5278 = null;
                }
            }
        }
        if (this.field5362 != null && this.field5361 == null && this.field5304 == null && this.field5278 == null) {
            this.field5362 = null;
            this.field5293 = null;
        }
        if (this.field5306 != null && !class631.method3549(this.field5378, this.field5268, 3)) {
            if (this.field5307 == null) {
                if (this.field5301 != null && this.field5301.field6571 == null) {
                    this.field5335 = true;
                } else {
                    this.field5306 = null;
                    this.field5308 = this.field5358 = this.field5290 = null;
                }
            } else if (this.field5307.field6571 == null) {
                this.field5335 = true;
            } else {
                this.field5306 = null;
                this.field5308 = this.field5358 = this.field5290 = null;
            }
        }
        if (this.field5275 != null && !class731.method4095(false, this.field5268, this.field5378)) {
            if (this.field5301 != null && this.field5301.field6571 == null) {
                this.field5335 = true;
            } else {
                this.field5275 = null;
            }
        }
        if (this.field5355 != null && !class30.method125(this.field5378, this.field5268, (byte) -15)) {
            if (this.field5301 != null && this.field5301.field6571 == null) {
                this.field5335 = true;
            } else {
                this.field5355 = null;
            }
        }
        if (this.field5389 != null && !class374.method2200(this.field5268, (byte) 70, this.field5378)) {
            if (this.field5339 != null && this.field5339.field6571 == null) {
                this.field5335 = true;
            } else {
                this.field5389 = this.field5368 = null;
            }
        }
        if (this.field5330 != null && !class501.method2793(this.field5378, this.field5268, 113)) {
            if (this.field5301 != null && this.field5301.field6571 == null) {
                this.field5335 = true;
            } else {
                this.field5330 = null;
            }
        }
        if (this.field5381 != null && !class129.method819(this.field5378, this.field5268, 48)) {
            if ((this.field5269 == null || this.field5269.field3978 != null) && (this.field5301 == null || this.field5301.field6571 != null)) {
                this.field5381 = this.field5295 = this.field5344 = null;
            } else {
                this.field5335 = true;
            }
        }
        if (this.field5333 != null && !class756.method4204(this.field5378, 22251, this.field5268)) {
            this.field5314 = null;
            this.field5333 = null;
        }
        if (this.field5365 != null && !class10.method28(this.field5268, this.field5378, (byte) -88)) {
            this.field5273 = null;
            this.field5365 = null;
        }
        if (this.field5340 != null && !class134.method839(this.field5268, this.field5378, -86)) {
            this.field5340 = null;
        }
        if (this.field5291 != null && (this.field5378 & 0x800) == 0 && (this.field5378 & 0x40000) == 0) {
            this.field5291 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILhba;ZI)Z", line = 3386)
    public final boolean method206(int arg0, int arg1, class10 arg2, boolean arg3, int arg4) {
        field5337++;
        return this.method2241(arg4, arg1, arg0, arg2, false, -1, arg3);
    }

    @OriginalMember(owner = "client!ln", name = "ma", descriptor = "()I", line = 3394)
    public final int method212() {
        if (!this.field5286) {
            this.method2232(-97);
        }
        field5375++;
        return this.field5280;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lhba;Llda;I)V", line = 3406)
    public final void method230(class10 arg0, class486 arg1, int arg2) {
        field5277++;
        if (this.field5284 == 0) {
            return;
        }
        class253 var4 = this.field5318.field7559;
        if (!this.field5286) {
            this.method2232(-126);
        }
        class253 var5 = (class253) arg0;
        class415.field5868 = var4.field3252 * var5.field3257 + var4.field3281 * var5.field3263 + var4.field3257 * var5.field3255;
        class32.field282 = var4.field3252 * var5.field3259 + var4.field3281 * var5.field3253 + var4.field3257 * var5.field3278 + var4.field3259;
        float var6 = (float) this.field5329 * class415.field5868 + class32.field282;
        float var7 = (float) this.field5347 * class415.field5868 + class32.field282;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = var7 - (float) this.field5341;
            var9 = (float) this.field5341 + var6;
        } else {
            var8 = var6 - (float) this.field5341;
            var9 = (float) this.field5341 + var7;
        }
        if ((this.field5318.field7612 <= var8) || ((float) this.field5318.field7615 >= var9)) {
            return;
        }
        class346.field4618 = var4.field3264 * var5.field3259 + var4.field3287 * var5.field3253 + var4.field3263 * var5.field3278 + var4.field3253;
        class439.field6146 = var4.field3264 * var5.field3257 + var4.field3287 * var5.field3263 + var4.field3263 * var5.field3255;
        float var10 = (float) this.field5329 * class439.field6146 + class346.field4618;
        float var11 = (float) this.field5347 * class439.field6146 + class346.field4618;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var13 = ((float) (-this.field5341) + var11) * (float) this.field5318.field7630;
            var12 = ((float) this.field5341 + var10) * (float) this.field5318.field7630;
        } else {
            var12 = ((float) this.field5341 + var11) * (float) this.field5318.field7630;
            var13 = ((float) (-this.field5341) + var10) * (float) this.field5318.field7630;
        }
        if ((this.field5318.field7575 <= var13 / var9) || (var12 / var9 <= this.field5318.field7632)) {
            return;
        }
        class169.field2107 = var4.field3288 * var5.field3259 + var4.field3261 * var5.field3253 + var4.field3255 * var5.field3278 + var4.field3278;
        class569.field8013 = var4.field3288 * var5.field3257 + var4.field3261 * var5.field3263 + var4.field3255 * var5.field3255;
        float var14 = (float) this.field5329 * class569.field8013 + class169.field2107;
        float var15 = (float) this.field5347 * class569.field8013 + class169.field2107;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = (var15 - (float) this.field5341) * (float) this.field5318.field7592;
            var16 = ((float) this.field5341 + var14) * (float) this.field5318.field7592;
        } else {
            var16 = ((float) this.field5341 + var15) * (float) this.field5318.field7592;
            var17 = (var14 - (float) this.field5341) * (float) this.field5318.field7592;
        }
        if ((this.field5318.field7648 <= var17 / var9) || (this.field5318.field7570 >= var16 / var9)) {
            return;
        }
        if (arg1 != null || this.field5343 != null) {
            class397.field5636 = var4.field3252 * var5.field3281 + var4.field3281 * var5.field3287 + var4.field3257 * var5.field3261;
            class702.field9858 = var4.field3252 * var5.field3252 + var4.field3281 * var5.field3264 + var4.field3257 * var5.field3288;
            class158.field2000 = var4.field3264 * var5.field3281 + var4.field3287 * var5.field3287 + var4.field3263 * var5.field3261;
            class24.field179 = var4.field3264 * var5.field3252 + var4.field3287 * var5.field3264 + var4.field3263 * var5.field3288;
            class106.field1416 = var4.field3288 * var5.field3281 + var4.field3261 * var5.field3287 + var4.field3255 * var5.field3261;
            class375.field5218 = var4.field3288 * var5.field3252 + var4.field3261 * var5.field3264 + var4.field3255 * var5.field3288;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5281 + this.field5310 >> 1;
            int var21 = this.field5371 + this.field5370 >> 1;
            int var22 = (int) ((float) var21 * class24.field179 + (float) this.field5329 * class439.field6146 + (float) var20 * class158.field2000 + class346.field4618);
            int var23 = (int) ((float) var21 * class375.field5218 + (float) this.field5329 * class569.field8013 + (float) var20 * class106.field1416 + class169.field2107);
            int var24 = (int) ((float) var21 * class702.field9858 + (float) this.field5329 * class415.field5868 + (float) var20 * class397.field5636 + class32.field282);
            if (var24 >= this.field5318.field7615) {
                arg1.field6675 = this.field5318.field7592 * var23 / var24 + this.field5318.field7605;
                arg1.field6673 = this.field5318.field7630 * var22 / var24 + this.field5318.field7662;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class24.field179 + (float) this.field5347 * class439.field6146 + (float) var20 * class158.field2000 + class346.field4618);
            int var26 = (int) ((float) var21 * class375.field5218 + (float) this.field5347 * class569.field8013 + (float) var20 * class106.field1416 + class169.field2107);
            int var27 = (int) ((float) var21 * class702.field9858 + (float) this.field5347 * class415.field5868 + (float) var20 * class397.field5636 + class32.field282);
            if (var27 >= this.field5318.field7615) {
                arg1.field6672 = this.field5318.field7630 * var25 / var27 + this.field5318.field7662;
                arg1.field6674 = this.field5318.field7605 + (this.field5318.field7592 * var26 / var27);
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field5318.field7615 && this.field5318.field7615 > var27) {
                    var19 = false;
                } else if (this.field5318.field7615 > var24) {
                    int var31 = (var27 - this.field5318.field7615 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field6673 = this.field5318.field7662 + (this.field5318.field7630 * var32 / this.field5318.field7615);
                    arg1.field6675 = this.field5318.field7592 * var33 / this.field5318.field7615 + this.field5318.field7605;
                } else if (this.field5318.field7615 > var27) {
                    int var28 = (var24 - this.field5318.field7615 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field6673 = this.field5318.field7630 * var29 / this.field5318.field7615 + this.field5318.field7662;
                    arg1.field6675 = this.field5318.field7592 * var30 / this.field5318.field7615 + this.field5318.field7605;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field6671 = (this.field5341 + var22) * this.field5318.field7630 / var24 + this.field5318.field7662 - arg1.field6673;
                } else {
                    arg1.field6671 = (this.field5341 + var25) * this.field5318.field7630 / var27 + this.field5318.field7662 - arg1.field6672;
                }
                arg1.field6676 = true;
            }
        }
        this.field5318.method3004(19330);
        this.field5318.method3026(var5, (byte) -128);
        this.method2234((byte) -104);
        this.field5318.method3045((byte) 60);
        this.method2239(-32768);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lpfa;IIIIIIIIII)Z", line = 3608)
    public static final boolean method2236(class298 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5374++;
        if (arg7 != 702412290) {
            field5302 = 35;
        }
        int var11 = arg6;
        int var12 = arg10;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg6 - var13;
        int var16 = arg10 - var14;
        class244.field3173[var13][var14] = 99;
        class525.field7061[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class43.field472[var17] = arg6;
        int var26 = var17 + 1;
        class386.field5451[var17] = arg10;
        int[][] var19 = arg0.field3994;
        while (var26 != var18) {
            var12 = class386.field5451[var18];
            var11 = class43.field472[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var11 - arg0.field3999;
            int var23 = var12 - arg0.field4003;
            if (arg4 == -4) {
                if (arg9 == var11 && arg8 == var12) {
                    class378.field5253 = var12;
                    class301.field4076 = var11;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class551.method3134(arg9, arg2, -112, var12, arg1, var11, arg8, 2, 2)) {
                    class378.field5253 = var12;
                    class301.field4076 = var11;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg0.method1774(arg9, arg1, arg8, -1, var12, arg2, 2, var11, 2, arg3)) {
                    class378.field5253 = var12;
                    class301.field4076 = var11;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg0.method1777(arg2, arg9, var12, 14672, 2, arg8, arg3, var11, arg1)) {
                    class301.field4076 = var11;
                    class378.field5253 = var12;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg0.method1790(arg8, var11, (byte) 98, 2, var12, arg5, arg9, arg4)) {
                    class301.field4076 = var11;
                    class378.field5253 = var12;
                    return true;
                }
            } else if (arg0.method1776(arg9, arg5, var12, arg8, arg4, 17761, 2, var11)) {
                class301.field4076 = var11;
                class378.field5253 = var12;
                return true;
            }
            int var25 = class525.field7061[var21][var20] + 1;
            if (var21 > 0 && class244.field3173[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class43.field472[var26] = var11 - 1;
                class386.field5451[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class244.field3173[var21 - 1][var20] = 2;
                class525.field7061[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class244.field3173[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class43.field472[var26] = var11 + 1;
                class386.field5451[var26] = var12;
                class244.field3173[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class525.field7061[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class244.field3173[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class43.field472[var26] = var11;
                class386.field5451[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class244.field3173[var21][var20 - 1] = 1;
                class525.field7061[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class244.field3173[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class43.field472[var26] = var11;
                class386.field5451[var26] = var12 + 1;
                class244.field3173[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class525.field7061[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class244.field3173[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class43.field472[var26] = var11 - 1;
                class386.field5451[var26] = var12 - 1;
                class244.field3173[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class525.field7061[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class244.field3173[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class43.field472[var26] = var11 + 1;
                class386.field5451[var26] = var12 - 1;
                class244.field3173[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class525.field7061[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class244.field3173[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class43.field472[var26] = var11 - 1;
                class386.field5451[var26] = var12 + 1;
                class244.field3173[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class525.field7061[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class244.field3173[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class43.field472[var26] = var11 + 1;
                class386.field5451[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class244.field3173[var21 + 1][var20 + 1] = 12;
                class525.field7061[var21 + 1][var20 + 1] = var25;
            }
        }
        class378.field5253 = var12;
        class301.field4076 = var11;
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lac;)V", line = 6103)
    public class381(class541 arg0) {
        this.field5318 = arg0;
        this.field5367 = new class475(null, 5126, 3, 0);
        this.field5339 = new class475(null, 5126, 2, 0);
        this.field5307 = new class475(null, 5126, 3, 0);
        this.field5301 = new class475(null, 5121, 4, 0);
        this.field5269 = new class296();
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lac;Llv;IIII)V", line = 6115)
    public class381(class541 arg0, class446 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5318 = arg0;
        this.field5378 = arg2;
        this.field5268 = arg5;
        if (class396.method2304(arg2, arg5, (byte) 2)) {
            this.field5367 = new class475(null, 5126, 3, 0);
        }
        if (class247.method1482(arg2, 0, arg5)) {
            this.field5339 = new class475(null, 5126, 2, 0);
        }
        if (class561.method3166(-27984, arg5, arg2)) {
            this.field5307 = new class475(null, 5126, 3, 0);
        }
        if (class653.method3684(arg5, 28733, arg2)) {
            this.field5301 = new class475(null, 5121, 4, 0);
        }
        if (class296.method1769(arg5, arg2, 2048)) {
            this.field5269 = new class296();
        }
        class152 var7 = arg0.field636;
        this.field5293 = new int[arg1.field6213 + 1];
        int[] var8 = new int[arg1.field6195];
        for (int var9 = 0; var9 < arg1.field6195; var9++) {
            if (arg1.field6225 == null || arg1.field6225[var9] != 2) {
                if (arg1.field6218 != null && arg1.field6218[var9] != -1) {
                    class335 var173 = var7.method925(arg1.field6218[var9] & 0xFFFF, -28755);
                    if (((this.field5268 & 0x40) == 0 || !var173.field4527) && var173.field4537) {
                        continue;
                    }
                }
                var8[this.field5300++] = var9;
                this.field5293[arg1.field6198[var9]]++;
                this.field5293[arg1.field6221[var9]]++;
                this.field5293[arg1.field6196[var9]]++;
            }
        }
        this.field5387 = this.field5300;
        long[] var10 = new long[this.field5300];
        boolean var11 = (this.field5378 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field5300; var12++) {
            int var156 = var8[var12];
            class335 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field6234 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field6234.length; var163++) {
                    class701 var164 = arg1.field6234[var163];
                    if (var164.field9846 == var156) {
                        class713 var165 = class364.method2083(var164.field9845, (byte) -124);
                        if (var165.field9950) {
                            var162 = true;
                        }
                        if (var165.field9945 != -1) {
                            class335 var166 = var7.method925(var165.field9945, -28755);
                            if (var166.field4520 == 2) {
                                this.field5305 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field5387--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field6218 != null) {
                var167 = arg1.field6218[var156];
                if (var167 != -1) {
                    var157 = var7.method925(var167 & 0xFFFF, -28755);
                    if ((this.field5268 & 0x40) != 0 && var157.field4527) {
                        var157 = null;
                        var167 = -1;
                    } else {
                        var160 = var157.field4522;
                        var161 = var157.field4518;
                        if (var157.field4525 != 0 || var157.field4542 != 0) {
                            this.field5288 = true;
                        }
                    }
                }
            }
            boolean var168 = arg1.field6222 != null && arg1.field6222[var156] != 0 || var157 != null && var157.field4520 != 0;
            if ((var11 || var168) && arg1.field6208 != null) {
                var158 += arg1.field6208[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = ((var167 & 0xFFFF) << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + (long) var172;
            this.field5288 |= var157 != null && (var157.field4525 != 0 || var157.field4542 != 0);
            this.field5305 |= var168;
        }
        class140.method866(var8, var10, (byte) 118);
        this.field5278 = arg1.field6233;
        this.field5377 = arg1.field6216;
        this.field5273 = arg1.field6217;
        this.field5361 = arg1.field6229;
        this.field5304 = arg1.field6206;
        this.field5356 = arg1.field6213;
        this.field5354 = arg1.field6224;
        this.field5312 = arg1.field6204;
        class439[] var13 = new class439[this.field5356];
        if (arg1.field6234 != null) {
            this.field5325 = arg1.field6234.length;
            this.field5343 = new class199[this.field5325];
            this.field5309 = new class290[this.field5325];
            for (int var14 = 0; var14 < this.field5325; var14++) {
                class701 var15 = arg1.field6234[var14];
                class713 var16 = class364.method2083(var15.field9845, (byte) -95);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5300; var18++) {
                    if (var8[var18] == var15.field9846) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class645.field8982[arg1.field6228[var15.field9846] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field6222 == null ? 0 : arg1.field6222[var15.field9846]) << 24;
                this.field5343[var14] = new class199(var17, arg1.field6198[var15.field9846], arg1.field6221[var15.field9846], arg1.field6196[var15.field9846], var16.field9947, var16.field9953, var16.field9945, var16.field9959, var16.field9952, var16.field9950, var16.field9957, var15.field9847);
                this.field5309[var14] = new class290(var20);
            }
        }
        int var21 = this.field5300 * 3;
        this.field5275 = new short[this.field5300];
        this.field5330 = new short[this.field5300];
        this.field5381 = new short[this.field5300];
        this.field5295 = new short[this.field5300];
        class102.field1377 = new long[var21];
        this.field5389 = new float[var21];
        this.field5344 = new short[this.field5300];
        if (arg1.field6199 != null) {
            this.field5314 = new short[this.field5300];
        }
        this.field5336 = (short) arg4;
        this.field5327 = (short) arg3;
        this.field5290 = new short[var21];
        this.field5355 = new byte[this.field5300];
        this.field5368 = new float[var21];
        this.field5358 = new short[var21];
        this.field5306 = new byte[var21];
        this.field5362 = new short[var21];
        this.field5308 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field6213; var23++) {
            int var155 = this.field5293[var23];
            this.field5293[var23] = var22;
            var22 += var155;
            var13[var23] = new class439();
        }
        this.field5293[arg1.field6213] = var22;
        class650 var24 = class700.method3954(var8, true, arg1, this.field5300);
        class397[] var25 = new class397[arg1.field6195];
        for (int var26 = 0; var26 < arg1.field6195; var26++) {
            short var134 = arg1.field6198[var26];
            short var135 = arg1.field6221[var26];
            short var136 = arg1.field6196[var26];
            int var137 = this.field5361[var135] - this.field5361[var134];
            int var138 = this.field5304[var135] - this.field5304[var134];
            int var139 = this.field5278[var135] - this.field5278[var134];
            int var140 = this.field5361[var136] - this.field5361[var134];
            int var141 = this.field5304[var136] - this.field5304[var134];
            int var142 = this.field5278[var136] - this.field5278[var134];
            int var143 = var138 * var142 - var139 * var141;
            int var144 = var139 * var140 - var137 * var142;
            int var145 = var137 * var141 - (var138 * var140);
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var144 >>= 0x1;
                var145 >>= 0x1;
                var143 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var144 * var144 + var143 * var143 + var145 * var145));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var144 * 256 / var146;
            int var148 = var145 * 256 / var146;
            int var149 = var143 * 256 / var146;
            byte var150 = arg1.field6225 == null ? 0 : arg1.field6225[var26];
            if (var150 == 0) {
                class439 var152 = var13[var134];
                var152.field6144++;
                var152.field6148 += var147;
                var152.field6147 += var148;
                var152.field6142 += var149;
                class439 var153 = var13[var135];
                var153.field6144++;
                var153.field6142 += var149;
                var153.field6148 += var147;
                var153.field6147 += var148;
                class439 var154 = var13[var136];
                var154.field6144++;
                var154.field6142 += var149;
                var154.field6147 += var148;
                var154.field6148 += var147;
            } else if (var150 == 1) {
                class397 var151 = var25[var26] = new class397();
                var151.field5632 = var147;
                var151.field5628 = var149;
                var151.field5629 = var148;
            }
        }
        for (int var27 = 0; var27 < this.field5300; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field6228[var43] & 0xFFFF;
            int var45;
            if (arg1.field6235 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field6235[var43];
            }
            int var46;
            if (arg1.field6222 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field6222[var43] & 0xFF;
            }
            short var47 = arg1.field6218 == null ? -1 : arg1.field6218[var43];
            if (var47 != -1 && (this.field5268 & 0x40) != 0) {
                class335 var48 = var7.method925(var47 & 0xFFFF, -28755);
                if (var48.field4527) {
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
                    var53 = 0.0F;
                    var50 = 1.0F;
                    var51 = 1.0F;
                    var49 = 0.0F;
                    var52 = 1.0F;
                    var56 = 2;
                    var54 = 0.0F;
                    var55 = 1;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field6190[var45];
                    if (var58 == 0) {
                        short var59 = arg1.field6198[var43];
                        short var60 = arg1.field6221[var43];
                        short var61 = arg1.field6196[var43];
                        short var62 = arg1.field6210[var45];
                        short var63 = arg1.field6237[var45];
                        short var64 = arg1.field6187[var45];
                        float var65 = (float) arg1.field6229[var62];
                        float var66 = (float) arg1.field6206[var62];
                        float var67 = (float) arg1.field6233[var62];
                        float var68 = (float) arg1.field6229[var63] - var65;
                        float var69 = (float) arg1.field6206[var63] - var66;
                        float var70 = (float) arg1.field6233[var63] - var67;
                        float var71 = (float) arg1.field6229[var64] - var65;
                        float var72 = (float) arg1.field6206[var64] - var66;
                        float var73 = (float) arg1.field6233[var64] - var67;
                        float var74 = (float) arg1.field6229[var59] - var65;
                        float var75 = (float) arg1.field6206[var59] - var66;
                        float var76 = (float) arg1.field6233[var59] - var67;
                        float var77 = (float) arg1.field6229[var60] - var65;
                        float var78 = (float) arg1.field6206[var60] - var66;
                        float var79 = (float) arg1.field6233[var60] - var67;
                        float var80 = (float) arg1.field6229[var61] - var65;
                        float var81 = (float) arg1.field6206[var61] - var66;
                        float var82 = (float) arg1.field6233[var61] - var67;
                        float var83 = var69 * var73 - (var70 * var72);
                        float var84 = var70 * var71 - (var68 * var73);
                        float var85 = var68 * var72 - (var69 * var71);
                        float var86 = var72 * var85 - var73 * var84;
                        float var87 = var73 * var83 - var71 * var85;
                        float var88 = var71 * var84 - var72 * var83;
                        float var89 = 1.0F / (var70 * var88 + var68 * var86 + var69 * var87);
                        var49 = (var76 * var88 + var74 * var86 + var75 * var87) * var89;
                        var53 = (var82 * var88 + var80 * var86 + var81 * var87) * var89;
                        var51 = (var79 * var88 + var77 * var86 + var78 * var87) * var89;
                        float var90 = var70 * var83 - var68 * var85;
                        float var91 = var68 * var84 - (var69 * var83);
                        float var92 = var69 * var85 - var70 * var84;
                        float var93 = 1.0F / (var73 * var91 + var71 * var92 + var72 * var90);
                        var54 = (var82 * var91 + var80 * var92 + var81 * var90) * var93;
                        var50 = (var76 * var91 + var74 * var92 + var75 * var90) * var93;
                        var52 = (var79 * var91 + var77 * var92 + var78 * var90) * var93;
                    } else {
                        short var94 = arg1.field6198[var43];
                        short var95 = arg1.field6221[var43];
                        short var96 = arg1.field6196[var43];
                        int var97 = var24.field9064[var45];
                        int var98 = var24.field9069[var45];
                        int var99 = var24.field9065[var45];
                        float[] var100 = var24.field9062[var45];
                        byte var101 = arg1.field6205[var45];
                        float var102 = (float) arg1.field6223[var45] / 256.0F;
                        if (var58 == 1) {
                            float var103 = (float) arg1.field6194[var45] / 1024.0F;
                            class395.method2296(arg1.field6229[var94], var99, 8, arg1.field6233[var94], var98, arg1.field6206[var94], var100, var103, var101, var97, var102, class308.field4190);
                            var50 = class308.field4190[1];
                            var49 = class308.field4190[0];
                            class395.method2296(arg1.field6229[var95], var99, 8, arg1.field6233[var95], var98, arg1.field6206[var95], var100, var103, var101, var97, var102, class308.field4190);
                            var52 = class308.field4190[1];
                            var51 = class308.field4190[0];
                            class395.method2296(arg1.field6229[var96], var99, 8, arg1.field6233[var96], var98, arg1.field6206[var96], var100, var103, var101, var97, var102, class308.field4190);
                            var53 = class308.field4190[0];
                            var54 = class308.field4190[1];
                            float var104 = var103 / 2.0F;
                            if ((var101 & 0x1) == 0) {
                                if ((var51 - var49 > var104)) {
                                    var55 = 1;
                                    var51 -= var103;
                                } else if (var49 - var51 > var104) {
                                    var51 += var103;
                                    var55 = 2;
                                }
                                if (var53 - var49 > var104) {
                                    var56 = 1;
                                    var53 -= var103;
                                } else if (var49 - var53 > var104) {
                                    var56 = 2;
                                    var53 += var103;
                                }
                            } else {
                                if (var54 - var50 > var104) {
                                    var54 -= var103;
                                    var56 = 1;
                                } else if (var104 < var50 - var54) {
                                    var56 = 2;
                                    var54 += var103;
                                }
                                if ((var52 - var50 > var104)) {
                                    var52 -= var103;
                                    var55 = 1;
                                } else if (var104 < var50 - var52) {
                                    var55 = 2;
                                    var52 += var103;
                                }
                            }
                        } else if (var58 == 2) {
                            float var105 = (float) arg1.field6202[var45] / 256.0F;
                            float var106 = (float) arg1.field6188[var45] / 256.0F;
                            int var107 = arg1.field6229[var95] - arg1.field6229[var94];
                            int var108 = arg1.field6206[var95] - arg1.field6206[var94];
                            int var109 = arg1.field6233[var95] - arg1.field6233[var94];
                            int var110 = arg1.field6229[var96] - arg1.field6229[var94];
                            int var111 = arg1.field6206[var96] - arg1.field6206[var94];
                            int var112 = arg1.field6233[var96] - arg1.field6233[var94];
                            int var113 = var108 * var112 - (var109 * var111);
                            int var114 = var109 * var110 - (var107 * var112);
                            int var115 = var107 * var111 - (var108 * var110);
                            float var116 = 64.0F / (float) arg1.field6193[var45];
                            float var117 = 64.0F / (float) arg1.field6211[var45];
                            float var118 = 64.0F / (float) arg1.field6194[var45];
                            float var119 = (var100[2] * (float) var115 + var100[0] * (float) var113 + var100[1] * (float) var114) / var116;
                            float var120 = (var100[5] * (float) var115 + var100[3] * (float) var113 + var100[4] * (float) var114) / var117;
                            float var121 = (var100[8] * (float) var115 + var100[7] * (float) var114 + var100[6] * (float) var113) / var118;
                            var57 = class179.method1018(var119, var121, (byte) -92, var120);
                            class32.method147(arg1.field6206[var94], var106, var101, var98, var102, 119, var105, var100, var57, class308.field4190, var99, arg1.field6233[var94], var97, arg1.field6229[var94]);
                            var49 = class308.field4190[0];
                            var50 = class308.field4190[1];
                            class32.method147(arg1.field6206[var95], var106, var101, var98, var102, 116, var105, var100, var57, class308.field4190, var99, arg1.field6233[var95], var97, arg1.field6229[var95]);
                            var51 = class308.field4190[0];
                            var52 = class308.field4190[1];
                            class32.method147(arg1.field6206[var96], var106, var101, var98, var102, 111, var105, var100, var57, class308.field4190, var99, arg1.field6233[var96], var97, arg1.field6229[var96]);
                            var53 = class308.field4190[0];
                            var54 = class308.field4190[1];
                        } else if (var58 == 3) {
                            class298.method1781(class308.field4190, arg1.field6206[var94], var101, var99, var100, arg1.field6233[var94], var98, var102, arg1.field6229[var94], var97, 113);
                            var49 = class308.field4190[0];
                            var50 = class308.field4190[1];
                            class298.method1781(class308.field4190, arg1.field6206[var95], var101, var99, var100, arg1.field6233[var95], var98, var102, arg1.field6229[var95], var97, 102);
                            var51 = class308.field4190[0];
                            var52 = class308.field4190[1];
                            class298.method1781(class308.field4190, arg1.field6206[var96], var101, var99, var100, arg1.field6233[var96], var98, var102, arg1.field6229[var96], var97, 125);
                            var54 = class308.field4190[1];
                            var53 = class308.field4190[0];
                            if ((var101 & 0x1) == 0) {
                                if (var51 - var49 > 0.5F) {
                                    var55 = 1;
                                    var51--;
                                } else if (var49 - var51 > 0.5F) {
                                    var55 = 2;
                                    var51++;
                                }
                                if (var53 - var49 > 0.5F) {
                                    var53--;
                                    var56 = 1;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                            } else {
                                if ((var54 - var50 > 0.5F)) {
                                    var56 = 1;
                                    var54--;
                                } else if (var50 - var54 > 0.5F) {
                                    var54++;
                                    var56 = 2;
                                }
                                if (var52 - var50 > 0.5F) {
                                    var55 = 1;
                                    var52--;
                                } else if (var50 - var52 > 0.5F) {
                                    var55 = 2;
                                    var52++;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field6225 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field6225[var43];
            }
            if (var122 == 0) {
                long var123 = ((long) (var57 << 24) + ((long) (var44 << 8)) + (long) var46 << 32) + (long) (var45 << 2);
                short var125 = arg1.field6198[var43];
                short var126 = arg1.field6221[var43];
                short var127 = arg1.field6196[var43];
                class439 var128 = var13[var125];
                this.field5381[var27] = this.method2233((byte) 72, var50, var125, var128.field6144, var128.field6142, var123, var49, var128.field6148, arg1, var128.field6147);
                class439 var129 = var13[var126];
                this.field5295[var27] = this.method2233((byte) 68, var52, var126, var129.field6144, var129.field6142, (long) var55 + var123, var51, var129.field6148, arg1, var129.field6147);
                class439 var130 = var13[var127];
                this.field5344[var27] = this.method2233((byte) 93, var54, var127, var130.field6144, var130.field6142, (long) var56 + var123, var53, var130.field6148, arg1, var130.field6147);
            } else if (var122 == 1) {
                class397 var131 = var25[var43];
                long var132 = (long) ((var131.field5629 + 256 << 22) + (var131.field5632 + 256 << 12) + (var131.field5628 <= 0 ? 2048 : 1024) + (var45 << 2)) + ((long) (var57 << 24) + ((long) (var44 << 8)) + (long) var46 << 32);
                this.field5381[var27] = this.method2233((byte) 43, var50, arg1.field6198[var43], 0, var131.field5628, var132, var49, var131.field5632, arg1, var131.field5629);
                this.field5295[var27] = this.method2233((byte) 83, var52, arg1.field6221[var43], 0, var131.field5628, (long) var55 + var132, var51, var131.field5632, arg1, var131.field5629);
                this.field5344[var27] = this.method2233((byte) 74, var54, arg1.field6196[var43], 0, var131.field5628, (long) var56 + var132, var53, var131.field5632, arg1, var131.field5629);
            }
            if (arg1.field6222 != null) {
                this.field5355[var27] = arg1.field6222[var43];
            }
            if (arg1.field6199 != null) {
                this.field5314[var27] = arg1.field6199[var43];
            }
            this.field5275[var27] = arg1.field6228[var43];
            this.field5330[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field5387; var30++) {
            short var42 = this.field5330[var30];
            if (var29 != var42) {
                var29 = var42;
                var28++;
            }
        }
        this.field5291 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field5387; var33++) {
            short var41 = this.field5330[var33];
            if (var32 != var41) {
                var32 = var41;
                this.field5291[var31++] = var33;
            }
        }
        this.field5291[var31] = this.field5387;
        class102.field1377 = null;
        this.field5308 = class238.method1441(this.field5284, 21119, this.field5308);
        this.field5358 = class238.method1441(this.field5284, 21119, this.field5358);
        this.field5290 = class238.method1441(this.field5284, 21119, this.field5290);
        this.field5306 = class196.method1089(this.field5306, (byte) -109, this.field5284);
        this.field5389 = class501.method2795((byte) -64, this.field5284, this.field5389);
        this.field5368 = class501.method2795((byte) -64, this.field5284, this.field5368);
        if (arg1.field6232 != null && class10.method28(this.field5268, arg2, (byte) -96)) {
            this.field5365 = arg1.method2505(91, false);
        }
        if (arg1.field6234 != null && class134.method839(this.field5268, arg2, -56)) {
            this.field5340 = arg1.method2506(21517);
        }
        if (arg1.field6200 != null && class756.method4204(arg2, 22251, this.field5268)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field5300; var36++) {
                int var40 = arg1.field6200[var8[var36]];
                if (var40 >= 0) {
                    if (var40 > var34) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field5333 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field5333[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field5300; var38++) {
                int var39 = arg1.field6200[var8[var38]];
                if (var39 >= 0) {
                    this.field5333[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBSIB)I", line = 3974)
    private final int method2237(int arg0, byte arg1, short arg2, int arg3, byte arg4) {
        if (arg4 != -97) {
            return 31;
        }
        field5287++;
        int var6 = class645.field8982[class759.method4217(arg0, 1391, arg3)];
        if (arg2 != -1) {
            class335 var7 = this.field5318.field636.method925(arg2 & 0xFFFF, -28755);
            int var8 = var7.field4534 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 <= 127) {
                    var9 = arg3 * 131586;
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
            int var12 = var7.field4533 & 0xFF;
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
                var6 = (var14 & 0xFF00) + (var15 >> 8) + (var13 << 8 & 0xFF0092);
            }
        }
        return (var6 << 8) + (255 - (arg1 & 0xFF));
    }

    @OriginalMember(owner = "client!ln", name = "ia", descriptor = "(SS)V", line = 4057)
    public final void method195(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5300; var3++) {
            if (this.field5275[var3] == arg0) {
                this.field5275[var3] = arg1;
            }
        }
        field5379++;
        if (this.field5343 != null) {
            for (int var4 = 0; var4 < this.field5325; var4++) {
                class199 var5 = this.field5343[var4];
                class290 var6 = this.field5309[var4];
                var6.field3845 = class645.field8982[this.field5275[var5.field2368] & 0xFFFF] & 0xFFFFFF | var6.field3845 & 0xFF000000;
            }
        }
        if (this.field5301 != null) {
            this.field5301.field6571 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Len;I)V", line = 4097)
    private final void method2238(class322 arg0, int arg1) {
        field5376++;
        if (this.field5318.field7682.length < this.field5284) {
            this.field5318.field7682 = new int[this.field5284];
            this.field5318.field7681 = new int[this.field5284];
        }
        int[] var3 = this.field5318.field7682;
        int[] var4 = this.field5318.field7681;
        for (int var5 = arg1; var5 < this.field5356; var5++) {
            int var16 = (this.field5361[var5] - (this.field5304[var5] * this.field5318.field7609 >> 8) >> this.field5318.field7530) - arg0.field4327;
            int var17 = (this.field5278[var5] - (this.field5304[var5] * this.field5318.field7588 >> 8) >> this.field5318.field7530) - arg0.field4320;
            int var18 = this.field5293[var5];
            int var19 = this.field5293[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field5362[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field5387; var6++) {
            if (this.field5355 == null || this.field5355[var6] <= 128) {
                short var7 = this.field5381[var6];
                short var8 = this.field5295[var6];
                short var9 = this.field5344[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg0.method1927(var13, var11, var10, var15, var14, arg1 ^ 0x59, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "()I", line = 4182)
    public final int method209() {
        if (!this.field5286) {
            this.method2232(-103);
        }
        field5285++;
        return this.field5370;
    }

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "()Z", line = 4196)
    public final boolean method204() {
        field5319++;
        return this.field5288;
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V", line = 4215)
    private final void method2239(int arg0) {
        field5388++;
        if (arg0 != -32768) {
            this.method224();
        }
        if (this.field5343 == null) {
            return;
        }
        class253 var2 = this.field5318.field7527;
        this.field5318.method2984(34167);
        this.field5318.method350(!this.field5305);
        this.field5318.method2994(false, false);
        this.field5318.method3011(null, null, this.field5318.field7647, this.field5318.field7576, 0);
        for (int var3 = 0; var3 < this.field5325; var3++) {
            class199 var4 = this.field5343[var3];
            class290 var5 = this.field5309[var3];
            if (!var4.field2366 || !this.field5318.method377()) {
                float var6 = (float) (this.field5361[var4.field2373] + this.field5361[var4.field2370] + this.field5361[var4.field2362]) * 0.3333333F;
                float var7 = (float) (this.field5304[var4.field2373] + this.field5304[var4.field2362] + this.field5304[var4.field2370]) * 0.3333333F;
                float var8 = (float) (this.field5278[var4.field2373] + this.field5278[var4.field2362] + this.field5278[var4.field2370]) * 0.3333333F;
                float var9 = class24.field179 * var8 + class439.field6146 * var7 + class158.field2000 * var6 + class346.field4618;
                float var10 = class375.field5218 * var8 + class569.field8013 * var7 + class106.field1416 * var6 + class169.field2107;
                float var11 = class702.field9858 * var8 + class415.field5868 * var7 + class397.field5636 * var6 + class32.field282;
                float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field2361;
                var2.method1504(var10 * var12 + ((float) var5.field3846 - var10), var4.field2363 * var5.field3847 >> 7, var5.field3840, var11 * var12 - var11, var4.field2371 * var5.field3838 >> 7, (byte) 63, (float) var5.field3839 + var9 - (var9 * var12));
                this.field5318.method3052(-32076, var2);
                int var13 = var5.field3845;
                OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                this.field5318.method2977(72, var4.field2364);
                this.field5318.method3013((byte) -56, var4.field2369);
                this.field5318.method3053(7, 4, false, 0);
            }
        }
        this.field5318.method350(true);
        this.field5318.method3045((byte) 60);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)V", line = 4278)
    private final void method2240(boolean arg0, int arg1) {
        field5348++;
        if ((this.field5387 * 6) > this.field5318.field7657.field8529.length) {
            this.field5318.field7657 = new class183(this.field5387 * 6 + 600);
        } else {
            this.field5318.field7657.field8520 = 0;
        }
        class183 var3 = this.field5318.field7657;
        if (this.field5318.field7608) {
            for (int var5 = 0; var5 < this.field5387; var5++) {
                var3.method3423(this.field5381[var5], 1571862888);
                var3.method3423(this.field5295[var5], arg1 ^ 0xA24F4668);
                var3.method3423(this.field5344[var5], arg1 + 1571863144);
            }
        } else {
            for (int var4 = 0; var4 < this.field5387; var4++) {
                var3.method3446(this.field5381[var4], 4);
                var3.method3446(this.field5295[var4], arg1 + 260);
                var3.method3446(this.field5344[var4], 4);
            }
        }
        if (var3.field8520 == 0) {
            return;
        }
        if (arg1 != -256) {
            this.field5355 = null;
        }
        if (arg0) {
            if (this.field5353 == null) {
                this.field5353 = this.field5318.method2981(5123, var3.field8529, arg1 + 263, true, var3.field8520);
            } else {
                this.field5353.method3342((byte) -47, var3.field8529, var3.field8520, 5123);
            }
            this.field5269.field3978 = this.field5353;
        } else {
            this.field5269.field3978 = this.field5318.method2981(5123, var3.field8529, 7, false, var3.field8520);
        }
        if (!arg0) {
            this.field5335 = true;
        }
    }

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "(IILs;Ls;III)V", line = 4343)
    public final void method214(int arg0, int arg1, class281 arg2, class281 arg3, int arg4, int arg5, int arg6) {
        if (!this.field5286) {
            this.method2232(-102);
        }
        field5282++;
        int var8 = this.field5281 + arg4;
        int var9 = arg4 + this.field5310;
        int var10 = this.field5371 + arg6;
        int var11 = this.field5370 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3730 + var9 >> arg2.field3722 >= arg2.field3727 || var10 < 0 || (var11 + arg2.field3730 >> arg2.field3722) >= arg2.field3728) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3727 <= (arg3.field3730 + var9 >> arg3.field3722) || var10 < 0 || arg3.field3728 <= (arg3.field3730 + var11 >> arg3.field3722)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3722;
            int var13 = arg2.field3730 + var9 - 1 >> arg2.field3722;
            int var14 = var10 >> arg2.field3722;
            int var15 = arg2.field3730 + var11 - 1 >> arg2.field3722;
            if (arg5 == arg2.method1685(var14, -12639, var12) && arg5 == arg2.method1685(var14, -12639, var13) && arg2.method1685(var15, -12639, var12) == arg5 && arg5 == arg2.method1685(var15, -12639, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field5356; var32++) {
                this.field5304[var32] = this.field5304[var32] + arg2.method1683(this.field5361[var32] + arg4, this.field5278[var32] + arg6, true) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field5329;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field5356; var17++) {
                int var18 = (this.field5304[var17] << 16) / var16;
                if (arg1 > var18) {
                    this.field5304[var17] -= -((arg1 - var18) * (arg2.method1683(this.field5361[var17] + arg4, this.field5278[var17] + arg6, true) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = ((arg1 & 0xFF4F) >> 8) * 4;
            int var30 = (arg1 >> 16 & 0xFF) << 6;
            int var31 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var28 >> 1) < 0 || (arg2.field3727 << arg2.field3722) <= ((var28 >> 1) + arg2.field3730 + arg4) || arg6 - (var29 >> 1) < 0 || (var29 >> 1) + arg2.field3730 + arg6 >= arg2.field3728 << arg2.field3722) {
                return;
            }
            this.method2658(var29, var28, arg2, arg5, arg4, arg6, var30, 2, var31);
        } else if (arg0 == 4) {
            int var19 = this.field5347 - this.field5329;
            for (int var20 = 0; var20 < this.field5356; var20++) {
                this.field5304[var20] = var19 + this.field5304[var20] + arg3.method1683(this.field5361[var20] + arg4, this.field5278[var20] - -arg6, true) - arg5;
            }
        } else if (arg0 == 5) {
            int var21 = this.field5347 - this.field5329;
            for (int var22 = 0; var22 < this.field5356; var22++) {
                int var23 = this.field5361[var22] + arg4;
                int var24 = this.field5278[var22] + arg6;
                int var25 = arg2.method1683(var23, var24, true);
                int var26 = arg3.method1683(var23, var24, true);
                int var27 = var25 - arg1 - var26;
                this.field5304[var22] = ((this.field5304[var22] << 8) / var21 * var27 >> 8) + var25 - arg5;
            }
        }
        this.field5286 = false;
        if (this.field5367 != null) {
            this.field5367.field6571 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIILhba;ZIZ)Z", line = 4504)
    private final boolean method2241(int arg0, int arg1, int arg2, class10 arg3, boolean arg4, int arg5, boolean arg6) {
        field5352++;
        class253 var8 = (class253) arg3;
        class253 var9 = this.field5318.field7559;
        float var10 = var8.field3259 * var9.field3264 + var8.field3278 * var9.field3263 + var8.field3253 * var9.field3287 + var9.field3253;
        float var11 = var8.field3259 * var9.field3288 + var8.field3278 * var9.field3255 + var8.field3253 * var9.field3261 + var9.field3278;
        class702.field9858 = var8.field3252 * var9.field3252 + var8.field3288 * var9.field3257 + var8.field3264 * var9.field3281;
        class397.field5636 = var8.field3281 * var9.field3252 + var8.field3287 * var9.field3281 + var8.field3261 * var9.field3257;
        class24.field179 = var8.field3252 * var9.field3264 + var8.field3288 * var9.field3263 + var8.field3264 * var9.field3287;
        class106.field1416 = var8.field3281 * var9.field3288 + var8.field3287 * var9.field3261 + var8.field3261 * var9.field3255;
        float var12 = var8.field3259 * var9.field3252 + var8.field3278 * var9.field3257 + var8.field3253 * var9.field3281 + var9.field3259;
        class569.field8013 = var8.field3257 * var9.field3288 + var8.field3263 * var9.field3261 + var8.field3255 * var9.field3255;
        class439.field6146 = var8.field3257 * var9.field3264 + var8.field3263 * var9.field3287 + var8.field3255 * var9.field3263;
        class158.field2000 = var8.field3281 * var9.field3264 + var8.field3287 * var9.field3287 + var8.field3261 * var9.field3263;
        class415.field5868 = var8.field3257 * var9.field3252 + var8.field3263 * var9.field3281 + var8.field3255 * var9.field3257;
        class375.field5218 = var8.field3252 * var9.field3288 + var8.field3288 * var9.field3255 + var8.field3264 * var9.field3261;
        boolean var13 = arg4;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field5318.field7630;
        int var19 = this.field5318.field7592;
        if (!this.field5286) {
            this.method2232(-125);
        }
        int var20 = this.field5310 - this.field5281 >> 1;
        int var21 = this.field5347 - this.field5329 >> 1;
        int var22 = this.field5370 - this.field5371 >> 1;
        int var23 = this.field5281 + var20;
        int var24 = this.field5329 + var21;
        int var25 = this.field5371 + var22;
        int var26 = var23 - (var20 << arg0);
        int var27 = var24 - (var21 << arg0);
        int var28 = var25 - (var22 << arg0);
        int var29 = var23 + (var20 << arg0);
        int var30 = (var21 << arg0) + var24;
        int var31 = (var22 << arg0) + var25;
        class163.field2045[0] = var26;
        class188.field2266[0] = var27;
        class285.field3764[0] = var28;
        class163.field2045[1] = var29;
        class188.field2266[1] = var27;
        class285.field3764[1] = var28;
        class163.field2045[2] = var26;
        class188.field2266[2] = var30;
        class285.field3764[2] = var28;
        class163.field2045[3] = var29;
        class188.field2266[3] = var30;
        class285.field3764[3] = var28;
        class163.field2045[4] = var26;
        class188.field2266[4] = var27;
        class163.field2045[5] = var29;
        class285.field3764[4] = var31;
        class188.field2266[5] = var27;
        class285.field3764[5] = var31;
        class163.field2045[6] = var26;
        class188.field2266[6] = var30;
        class163.field2045[7] = var29;
        class285.field3764[6] = var31;
        class188.field2266[7] = var30;
        class285.field3764[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class285.field3764[var32];
            float var54 = (float) class188.field2266[var32];
            float var55 = (float) class163.field2045[var32];
            float var56 = class702.field9858 * var53 + class415.field5868 * var54 + class397.field5636 * var55 + var12;
            float var57 = class375.field5218 * var53 + class569.field8013 * var54 + class106.field1416 * var55 + var11;
            float var58 = class24.field179 * var53 + class439.field6146 * var54 + class158.field2000 * var55 + var10;
            if ((float) this.field5318.field7615 <= var56) {
                if (arg5 > 0) {
                    var56 = arg5;
                }
                float var59 = (float) var18 * var58 / var56 + (float) this.field5318.field7662;
                if (var15 < var59) {
                    var15 = var59;
                }
                float var60 = (float) var19 * var57 / var56 + (float) this.field5318.field7605;
                if (var14 > var59) {
                    var14 = var59;
                }
                if (var60 < var16) {
                    var16 = var60;
                }
                if (var17 < var60) {
                    var17 = var60;
                }
                var13 = true;
            }
        }
        if (var13 && (float) arg2 > var14 && (float) arg2 < var15 && (float) arg1 > var16 && var17 > (float) arg1) {
            if (arg6) {
                return true;
            }
            if (this.field5284 > this.field5318.field7682.length) {
                this.field5318.field7682 = new int[this.field5284];
                this.field5318.field7681 = new int[this.field5284];
            }
            int[] var33 = this.field5318.field7682;
            int[] var34 = this.field5318.field7681;
            for (int var35 = 0; var35 < this.field5356; var35++) {
                float var37 = (float) this.field5304[var35];
                float var38 = (float) this.field5361[var35];
                float var39 = (float) this.field5278[var35];
                float var40 = class24.field179 * var39 + class439.field6146 * var37 + class158.field2000 * var38 + var10;
                float var41 = class375.field5218 * var39 + class569.field8013 * var37 + class106.field1416 * var38 + var11;
                float var42 = class702.field9858 * var39 + class415.field5868 * var37 + class397.field5636 * var38 + var12;
                if ((var42 >= (float) this.field5318.field7615)) {
                    if (arg5 > 0) {
                        var42 = arg5;
                    }
                    int var47 = (int) ((float) var18 * var40 / var42 + (float) this.field5318.field7662);
                    int var48 = (int) ((float) var19 * var41 / var42 + (float) this.field5318.field7605);
                    int var49 = this.field5293[var35];
                    int var50 = this.field5293[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field5362[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[var52] = var47;
                        var34[var52] = var48;
                    }
                } else {
                    int var43 = this.field5293[var35];
                    int var44 = this.field5293[var35 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field5362[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        var33[this.field5362[var45] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field5300; var36++) {
                if (var33[this.field5381[var36]] != -999999 && var33[this.field5295[var36]] != -999999 && var33[this.field5344[var36]] != -999999 && this.method2229(var34[this.field5344[var36]], var34[this.field5295[var36]], arg1, var33[this.field5344[var36]], var33[this.field5295[var36]], var33[this.field5381[var36]], var34[this.field5381[var36]], 18818, arg2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ln", name = "FA", descriptor = "(I)V", line = 4747)
    public final void method229(int arg0) {
        field5297++;
        int var2 = class15.field113[arg0];
        int var3 = class15.field115[arg0];
        for (int var4 = 0; var4 < this.field5356; var4++) {
            int var5 = this.field5304[var4] * var3 - (this.field5278[var4] * var2) >> 14;
            this.field5278[var4] = this.field5304[var4] * var2 + this.field5278[var4] * var3 >> 14;
            this.field5304[var4] = var5;
        }
        if (this.field5367 != null) {
            this.field5367.field6571 = null;
        }
        this.field5286 = false;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)V", line = 4776)
    public final void method233(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field5300; var5++) {
            int var9 = this.field5275[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3CE) >> 7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field5275[var5] = (short) class344.method2020(class344.method2020(var10 << 10, var11 << 7), var12);
        }
        field5283++;
        if (this.field5343 != null) {
            for (int var6 = 0; var6 < this.field5325; var6++) {
                class199 var7 = this.field5343[var6];
                class290 var8 = this.field5309[var6];
                var8.field3845 = var8.field3845 & 0xFF000000 | class645.field8982[this.field5275[var7.field2368] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5301 != null) {
            this.field5301.field6571 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "WA", descriptor = "()I", line = 4834)
    public final int method238() {
        field5363++;
        return this.field5327;
    }

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "(III)V", line = 4842)
    public final void method237(int arg0, int arg1, int arg2) {
        field5328++;
        for (int var4 = 0; var4 < this.field5356; var4++) {
            if (arg0 != 0) {
                this.field5361[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5304[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field5278[var4] += arg2;
            }
        }
        this.field5286 = false;
        if (this.field5367 != null) {
            this.field5367.field6571 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "()Z", line = 4874)
    public final boolean method219() {
        field5294++;
        return this.field5305;
    }

    @OriginalMember(owner = "client!ln", name = "HA", descriptor = "()I", line = 4885)
    public final int method246() {
        field5373++;
        if (!this.field5286) {
            this.method2232(-88);
        }
        return this.field5371;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lhba;Llda;II)V", line = 4896)
    public final void method243(class10 arg0, class486 arg1, int arg2, int arg3) {
        field5350++;
        if (this.field5284 == 0) {
            return;
        }
        class253 var5 = this.field5318.field7559;
        class253 var6 = (class253) arg0;
        if (!this.field5286) {
            this.method2232(-124);
        }
        class32.field282 = var5.field3252 * var6.field3259 + var5.field3281 * var6.field3253 + var5.field3257 * var6.field3278 + var5.field3259;
        class415.field5868 = var5.field3252 * var6.field3257 + var5.field3281 * var6.field3263 + var5.field3257 * var6.field3255;
        float var7 = (float) this.field5329 * class415.field5868 + class32.field282;
        float var8 = (float) this.field5347 * class415.field5868 + class32.field282;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = var8 - (float) this.field5341;
            var10 = (float) this.field5341 + var7;
        } else {
            var10 = (float) this.field5341 + var8;
            var9 = (float) (-this.field5341) + var7;
        }
        if ((this.field5318.field7590 <= var9) || ((float) this.field5318.field7615 >= var10)) {
            return;
        }
        class346.field4618 = var5.field3264 * var6.field3259 + var5.field3287 * var6.field3253 + var5.field3263 * var6.field3278 + var5.field3253;
        class439.field6146 = var5.field3264 * var6.field3257 + var5.field3287 * var6.field3263 + var5.field3263 * var6.field3255;
        float var11 = (float) this.field5329 * class439.field6146 + class346.field4618;
        float var12 = (float) this.field5347 * class439.field6146 + class346.field4618;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) this.field5341 + var11) * (float) this.field5318.field7630;
            var14 = (var12 - (float) this.field5341) * (float) this.field5318.field7630;
        } else {
            var13 = ((float) this.field5341 + var12) * (float) this.field5318.field7630;
            var14 = (var11 - (float) this.field5341) * (float) this.field5318.field7630;
        }
        if ((this.field5318.field7575 <= var14 / (float) arg2) || (this.field5318.field7632 >= var13 / (float) arg2)) {
            return;
        }
        class569.field8013 = var5.field3288 * var6.field3257 + var5.field3261 * var6.field3263 + var5.field3255 * var6.field3255;
        class169.field2107 = var5.field3288 * var6.field3259 + var5.field3261 * var6.field3253 + var5.field3255 * var6.field3278 + var5.field3278;
        float var15 = (float) this.field5329 * class569.field8013 + class169.field2107;
        float var16 = (float) this.field5347 * class569.field8013 + class169.field2107;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = (var16 - (float) this.field5341) * (float) this.field5318.field7592;
            var17 = ((float) this.field5341 + var15) * (float) this.field5318.field7592;
        } else {
            var17 = ((float) this.field5341 + var16) * (float) this.field5318.field7592;
            var18 = (var15 - (float) this.field5341) * (float) this.field5318.field7592;
        }
        if ((var18 / (float) arg2 >= this.field5318.field7648) || (var17 / (float) arg2 <= this.field5318.field7570)) {
            return;
        }
        if (arg1 != null || this.field5343 != null) {
            class24.field179 = var5.field3264 * var6.field3252 + var5.field3287 * var6.field3264 + var5.field3263 * var6.field3288;
            class106.field1416 = var5.field3288 * var6.field3281 + var5.field3261 * var6.field3287 + var5.field3255 * var6.field3261;
            class702.field9858 = var5.field3252 * var6.field3252 + var5.field3281 * var6.field3264 + var5.field3257 * var6.field3288;
            class397.field5636 = var5.field3252 * var6.field3281 + var5.field3281 * var6.field3287 + var5.field3257 * var6.field3261;
            class158.field2000 = var5.field3264 * var6.field3281 + var5.field3287 * var6.field3287 + var5.field3263 * var6.field3261;
            class375.field5218 = var5.field3288 * var6.field3252 + var5.field3261 * var6.field3264 + var5.field3255 * var6.field3288;
        }
        if (arg1 != null) {
            int var19 = this.field5281 + this.field5310 >> 1;
            int var20 = this.field5371 + this.field5370 >> 1;
            int var21 = (int) ((float) var20 * class24.field179 + (float) this.field5329 * class439.field6146 + (float) var19 * class158.field2000 + class346.field4618);
            int var22 = (int) ((float) var20 * class375.field5218 + (float) this.field5329 * class569.field8013 + (float) var19 * class106.field1416 + class169.field2107);
            int var23 = (int) ((float) var20 * class702.field9858 + (float) this.field5329 * class415.field5868 + (float) var19 * class397.field5636 + class32.field282);
            int var24 = (int) ((float) var20 * class24.field179 + (float) this.field5347 * class439.field6146 + (float) var19 * class158.field2000 + class346.field4618);
            int var25 = (int) ((float) var20 * class375.field5218 + (float) this.field5347 * class569.field8013 + (float) var19 * class106.field1416 + class169.field2107);
            int var26 = (int) ((float) var20 * class702.field9858 + (float) this.field5347 * class415.field5868 + (float) var19 * class397.field5636 + class32.field282);
            arg1.field6674 = this.field5318.field7592 * var25 / arg2 + this.field5318.field7605;
            arg1.field6672 = this.field5318.field7630 * var24 / arg2 + this.field5318.field7662;
            arg1.field6675 = this.field5318.field7592 * var22 / arg2 + this.field5318.field7605;
            arg1.field6673 = this.field5318.field7662 + (this.field5318.field7630 * var21 / arg2);
            if (this.field5318.field7615 <= var23 || var26 >= this.field5318.field7615) {
                arg1.field6676 = true;
                arg1.field6671 = (this.field5341 + var21) * this.field5318.field7630 / arg2 + this.field5318.field7662 - arg1.field6673;
            }
        }
        this.field5318.method3033((float) arg2, true);
        this.field5318.method3044((byte) -35);
        this.field5318.method3026(var6, (byte) -125);
        this.method2234((byte) -104);
        this.field5318.method3045((byte) 60);
        this.method2239(-32768);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILhba;ZII)Z", line = 5047)
    public final boolean method196(int arg0, int arg1, class10 arg2, boolean arg3, int arg4, int arg5) {
        field5386++;
        return this.method2241(arg4, arg1, arg0, arg2, false, arg5, arg3);
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "()V", line = 5060)
    public final void method223() {
        field5289++;
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "()V", line = 5069)
    public final void method242() {
        field5384++;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "()[Lcia;", line = 5081)
    public final class614[] method201() {
        field5349++;
        return this.field5312;
    }

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "(I)V", line = 5090)
    public final void method202(int arg0) {
        field5298++;
        this.field5378 = arg0;
        if (this.field5390 != null && (this.field5378 & 0x10000) == 0) {
            this.field5306 = this.field5390.field4547;
            this.field5308 = this.field5390.field4544;
            this.field5358 = this.field5390.field4543;
            this.field5290 = this.field5390.field4546;
            this.field5390 = null;
        }
        this.field5335 = true;
        this.method2235(-122);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)V", line = 5115)
    private final void method2242(int arg0, boolean arg1) {
        if (arg0 < 9) {
            return;
        }
        field5383++;
        boolean var3 = this.field5301 != null && this.field5301.field6571 == null;
        boolean var4 = this.field5307 != null && this.field5307.field6571 == null;
        boolean var5 = this.field5367 != null && this.field5367.field6571 == null;
        boolean var6 = this.field5339 != null && this.field5339.field6571 == null;
        if (arg1) {
            var6 &= (this.field5359 & 0x8) != 0;
            var3 &= (this.field5359 & 0x2) != 0;
            var4 &= (this.field5359 & 0x4) != 0;
            var5 &= (this.field5359 & 0x1) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
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
        if ((this.field5284 * var7) > this.field5318.field7657.field8529.length) {
            this.field5318.field7657 = new class183((this.field5284 + 100) * var7);
        } else {
            this.field5318.field7657.field8520 = 0;
        }
        class183 var12 = this.field5318.field7657;
        if (var5) {
            if (this.field5318.field7608) {
                for (int var13 = 0; var13 < this.field5356; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field5361[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field5304[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field5278[var13]);
                    int var17 = this.field5293[var13];
                    int var18 = this.field5293[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field5362[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field8520 = var7 * var20;
                        var12.method3384(1571862888, var14);
                        var12.method3384(1571862888, var15);
                        var12.method3384(1571862888, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field5356; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field5361[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field5304[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field5278[var21]);
                    int var25 = this.field5293[var21];
                    int var26 = this.field5293[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field5362[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field8520 = var7 * var28;
                        var12.method3417(var22, 1489446952);
                        var12.method3417(var23, 1489446952);
                        var12.method3417(var24, 1489446952);
                    }
                }
            }
        }
        if (var3) {
            if (this.field5307 == null) {
                short[] var31;
                byte[] var32;
                short[] var33;
                short[] var34;
                if (this.field5390 == null) {
                    var31 = this.field5290;
                    var32 = this.field5306;
                    var33 = this.field5308;
                    var34 = this.field5358;
                } else {
                    var34 = this.field5390.field4543;
                    var32 = this.field5390.field4547;
                    var31 = this.field5390.field4546;
                    var33 = this.field5390.field4544;
                }
                float var35 = this.field5318.field7649[0];
                float var36 = this.field5318.field7649[1];
                float var37 = this.field5318.field7649[2];
                float var38 = this.field5318.field7624;
                float var39 = this.field5318.field7646 * 768.0F / (float) this.field5336;
                float var40 = this.field5318.field7618 * 768.0F / (float) this.field5336;
                for (int var41 = 0; var41 < this.field5300; var41++) {
                    int var42 = this.method2237(this.field5275[var41], this.field5355[var41], this.field5330[var41], this.field5327, (byte) -97);
                    float var43 = (float) (var42 >> 16 & 0xFF) * this.field5318.field7631;
                    short var44 = this.field5381[var41];
                    float var45 = (float) (var42 >> 8 & 0xFF) * this.field5318.field7669;
                    float var46 = (float) (var42 >>> 24) * this.field5318.field7644;
                    short var47 = (short) var32[var44];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var31[var44] * var37 + (float) var33[var44] * var35 + (float) var34[var44] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var31[var44] * var37 + (float) var33[var44] * var35 + (float) var34[var44] * var36) / (float) (var47 * 256);
                    }
                    float var49 = var38 + (var48 < 0.0F ? var40 : var39) * var48;
                    int var50 = (int) (var46 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var51 = (int) (var43 * var49);
                    int var52 = (int) (var45 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    var12.field8520 = var9 + (var7 * var44);
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method3393(var50, -93);
                    var12.method3393(var51, -90);
                    var12.method3393(var52, -103);
                    var12.method3393(255 - (this.field5355[var41] & 0xFF), -37);
                    short var53 = this.field5295[var41];
                    short var54 = (short) var32[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var31[var53] * var37 + (float) var33[var53] * var35 + (float) var34[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var31[var53] * var37 + (float) var33[var53] * var35 + (float) var34[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = var38 + (var55 < 0.0F ? var40 : var39) * var55;
                    int var57 = (int) (var46 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var43 * var56);
                    int var59 = (int) (var45 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    var12.field8520 = var9 + (var7 * var53);
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method3393(var57, 90);
                    var12.method3393(var58, -52);
                    var12.method3393(var59, 118);
                    var12.method3393(255 - (this.field5355[var41] & 0xFF), -55);
                    short var60 = this.field5344[var41];
                    short var61 = (short) var32[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var31[var60] * var37 + (float) var33[var60] * var35 + (float) var34[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var31[var60] * var37 + (float) var33[var60] * var35 + (float) var34[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = var38 + var62 * (var62 < 0.0F ? var40 : var39);
                    int var64 = (int) (var46 * var63);
                    int var65 = (int) (var43 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var66 = (int) (var45 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.field8520 = var7 * var60 + var9;
                    var12.method3393(var64, -48);
                    var12.method3393(var65, -46);
                    var12.method3393(var66, 96);
                    var12.method3393(255 - (this.field5355[var41] & 0xFF), -44);
                }
            } else {
                for (int var29 = 0; var29 < this.field5300; var29++) {
                    int var30 = this.method2237(this.field5275[var29], this.field5355[var29], this.field5330[var29], this.field5327, (byte) -97);
                    var12.field8520 = this.field5381[var29] * var7 + var9;
                    var12.method3384(1571862888, var30);
                    var12.field8520 = this.field5295[var29] * var7 + var9;
                    var12.method3384(1571862888, var30);
                    var12.field8520 = this.field5344[var29] * var7 + var9;
                    var12.method3384(1571862888, var30);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field5390 == null) {
                var67 = this.field5306;
                var69 = this.field5308;
                var70 = this.field5358;
                var68 = this.field5290;
            } else {
                var67 = this.field5390.field4547;
                var68 = this.field5390.field4546;
                var69 = this.field5390.field4544;
                var70 = this.field5390.field4543;
            }
            float var71 = 3.0F / (float) this.field5336;
            var12.field8520 = var10;
            float var72 = 3.0F / (float) (this.field5336 / 2 + this.field5336);
            if (this.field5318.field7608) {
                for (int var73 = 0; var73 < this.field5284; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1037((byte) 71, (float) var69[var73] * var72);
                        var12.method1037((byte) -1, (float) var70[var73] * var72);
                        var12.method1037((byte) 123, (float) var68[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1037((byte) -103, (float) var69[var73] * var75);
                        var12.method1037((byte) 71, (float) var70[var73] * var75);
                        var12.method1037((byte) -94, (float) var68[var73] * var75);
                    }
                    var12.field8520 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field5284; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1038((byte) -52, (float) var69[var76] * var72);
                        var12.method1038((byte) -52, (float) var70[var76] * var72);
                        var12.method1038((byte) -52, (float) var68[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1038((byte) -52, (float) var69[var76] * var78);
                        var12.method1038((byte) -52, (float) var70[var76] * var78);
                        var12.method1038((byte) -52, (float) var68[var76] * var78);
                    }
                    var12.field8520 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field8520 = var11;
            if (this.field5318.field7608) {
                for (int var80 = 0; var80 < this.field5284; var80++) {
                    var12.method1037((byte) -95, this.field5389[var80]);
                    var12.method1037((byte) 42, this.field5368[var80]);
                    var12.field8520 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field5284; var79++) {
                    var12.method1038((byte) -52, this.field5389[var79]);
                    var12.method1038((byte) -52, this.field5368[var79]);
                    var12.field8520 += var7 - 8;
                }
            }
        }
        var12.field8520 = this.field5284 * var7;
        class738 var81;
        if (arg1) {
            if (this.field5271 == null) {
                this.field5271 = this.field5318.method3021(var12.field8520, true, var7, -119, var12.field8529);
            } else {
                this.field5271.method689(var12.field8520, 7896, var12.field8529, var7);
            }
            var81 = this.field5271;
            this.field5359 = 0;
        } else {
            var81 = this.field5318.method3021(var12.field8520, false, var7, -85, var12.field8529);
            this.field5335 = true;
        }
        if (var5) {
            this.field5367.field6567 = var8;
            this.field5367.field6571 = var81;
        }
        if (var6) {
            this.field5339.field6567 = var11;
            this.field5339.field6571 = var81;
        }
        if (var3) {
            this.field5301.field6567 = var9;
            this.field5301.field6571 = var81;
        }
        if (var4) {
            this.field5307.field6571 = var81;
            this.field5307.field6567 = var10;
        }
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "()V", line = 5635)
    public final void method240() {
        field5279++;
        if (this.field5284 <= 0 || this.field5387 <= 0) {
            return;
        }
        this.method2242(108, false);
        if ((this.field5359 & 0x10) == 0 && this.field5269.field3978 == null) {
            this.method2240(false, -256);
        }
        this.method2235(-54);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BIZ)Lka;", line = 5657)
    public final class472 method241(byte arg0, int arg1, boolean arg2) {
        field5334++;
        class381 var4;
        class381 var5;
        if (arg0 == 1) {
            var5 = this.field5318.field7639;
            var4 = this.field5318.field7580;
        } else if (arg0 == 2) {
            var4 = this.field5318.field7672;
            var5 = this.field5318.field7604;
        } else if (arg0 == 3) {
            var5 = this.field5318.field7673;
            var4 = this.field5318.field7572;
        } else if (arg0 == 4) {
            var5 = this.field5318.field7667;
            var4 = this.field5318.field7566;
        } else if (arg0 == 5) {
            var4 = this.field5318.field7593;
            var5 = this.field5318.field7597;
        } else {
            var5 = var4 = new class381(this.field5318);
        }
        return this.method2231(255, arg2, arg0 != 0, arg1, var5, var4);
    }

    @OriginalMember(owner = "client!ln", name = "wa", descriptor = "()V", line = 5705)
    public final void method221() {
        field5296++;
        for (int var1 = 0; var1 < this.field5377; var1++) {
            this.field5361[var1] = this.field5361[var1] + 7 >> 4;
            this.field5304[var1] = this.field5304[var1] + 7 >> 4;
            this.field5278[var1] = this.field5278[var1] + 7 >> 4;
        }
        this.field5286 = false;
        if (this.field5367 != null) {
            this.field5367.field6571 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lka;IIIZ)V", line = 5729)
    public final void method232(class472 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5366++;
        class381 var6 = (class381) arg0;
        if (this.field5300 == 0 || var6.field5300 == 0) {
            return;
        }
        int var7 = var6.field5356;
        int[] var8 = var6.field5361;
        int[] var9 = var6.field5304;
        int[] var10 = var6.field5278;
        short[] var11 = var6.field5308;
        short[] var12 = var6.field5358;
        short[] var13 = var6.field5290;
        byte[] var14 = var6.field5306;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field5390 == null) {
            var16 = null;
            var15 = null;
            var18 = null;
            var17 = null;
        } else {
            var15 = this.field5390.field4543;
            var16 = this.field5390.field4544;
            var17 = this.field5390.field4547;
            var18 = this.field5390.field4546;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field5390 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field5390.field4547;
            var22 = var6.field5390.field4543;
            var20 = var6.field5390.field4546;
            var19 = var6.field5390.field4544;
        }
        int[] var23 = var6.field5293;
        short[] var24 = var6.field5362;
        if (!var6.field5286) {
            var6.method2232(-113);
        }
        short var25 = var6.field5329;
        short var26 = var6.field5347;
        short var27 = var6.field5281;
        short var28 = var6.field5310;
        short var29 = var6.field5371;
        short var30 = var6.field5370;
        for (int var31 = 0; var31 < this.field5356; var31++) {
            int var32 = this.field5304[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field5361[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field5278[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5293[var31];
                        int var37 = this.field5293[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5362[var38] - 1;
                            if (var35 == -1 || this.field5306[var35] != 0) {
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
                                        if (var16 == null) {
                                            this.field5390 = new class336();
                                            var16 = this.field5390.field4544 = class274.method1641((byte) 110, this.field5308);
                                            var15 = this.field5390.field4543 = class274.method1641((byte) 116, this.field5358);
                                            var18 = this.field5390.field4546 = class274.method1641((byte) 120, this.field5290);
                                            var17 = this.field5390.field4547 = class507.method2819(this.field5306, true);
                                        }
                                        if (var19 == null) {
                                            class336 var44 = var6.field5390 = new class336();
                                            var19 = var44.field4544 = class274.method1641((byte) 110, var11);
                                            var22 = var44.field4543 = class274.method1641((byte) 123, var12);
                                            var20 = var44.field4546 = class274.method1641((byte) 114, var13);
                                            var21 = var44.field4547 = class507.method2819(var14, true);
                                        }
                                        short var45 = this.field5308[var35];
                                        short var46 = this.field5358[var35];
                                        short var47 = this.field5290[var35];
                                        int var48 = var23[var39 + 1];
                                        int var49 = var23[var39];
                                        byte var50 = this.field5306[var35];
                                        for (int var51 = var49; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var19[var52] += var45;
                                                var22[var52] += var46;
                                                var20[var52] += var47;
                                                var21[var52] += var50;
                                            }
                                        }
                                        short var53 = var13[var41];
                                        short var54 = var11[var41];
                                        int var55 = this.field5293[var31];
                                        byte var56 = var14[var41];
                                        short var57 = var12[var41];
                                        int var58 = this.field5293[var31 + 1];
                                        for (int var59 = var55; var59 < var58; var59++) {
                                            int var60 = this.field5362[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var54;
                                                var15[var60] += var57;
                                                var18[var60] += var53;
                                                var17[var60] += var56;
                                            }
                                        }
                                        if (this.field5307 == null && this.field5301 != null) {
                                            this.field5301.field6571 = null;
                                        }
                                        if (this.field5307 != null) {
                                            this.field5307.field6571 = null;
                                        }
                                        if (var6.field5307 == null && var6.field5301 != null) {
                                            var6.field5301.field6571 = null;
                                        }
                                        if (var6.field5307 != null) {
                                            var6.field5307.field6571 = null;
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

    @OriginalMember(owner = "client!ln", name = "da", descriptor = "()I", line = 6007)
    public final int method213() {
        field5274++;
        return this.field5336;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)I", line = 6021)
    public static final int method2243(byte arg0) {
        field5364++;
        if (class526.field7067 == null) {
            int var1 = -2 / ((arg0 - 56) / 44);
            return class684.field9509 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ln", name = "EA", descriptor = "()I", line = 6035)
    public final int method224() {
        field5316++;
        if (!this.field5286) {
            this.method2232(-96);
        }
        return this.field5347;
    }

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "()V", line = 6047)
    public final void method228() {
        field5372++;
        for (int var1 = 0; var1 < this.field5356; var1++) {
            this.field5278[var1] = -this.field5278[var1];
        }
        for (int var2 = 0; var2 < this.field5284; var2++) {
            this.field5290[var2] = (short) (-this.field5290[var2]);
        }
        for (int var3 = 0; var3 < this.field5300; var3++) {
            short var4 = this.field5381[var3];
            this.field5381[var3] = this.field5344[var3];
            this.field5344[var3] = var4;
        }
        if (this.field5307 == null && this.field5301 != null) {
            this.field5301.field6571 = null;
        }
        if (this.field5307 != null) {
            this.field5307.field6571 = null;
        }
        if (this.field5367 != null) {
            this.field5367.field6571 = null;
        }
        if (this.field5269 != null) {
            this.field5269.field3978 = null;
        }
        this.field5286 = false;
    }
}
