import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 extends class327 {

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "Z")
    private boolean field311 = false;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    private int field325 = 0;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Z")
    private boolean field305 = true;

    @OriginalMember(owner = "client!uc", name = "bc", descriptor = "I")
    private int field386 = 0;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
    private int field338 = 0;

    @OriginalMember(owner = "client!uc", name = "yb", descriptor = "I")
    private int field357 = 0;

    @OriginalMember(owner = "client!uc", name = "jc", descriptor = "I")
    private int field394 = 0;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "Lrl;")
    private class487 field322;

    @OriginalMember(owner = "client!uc", name = "Hb", descriptor = "Lbh;")
    private class27 field366;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "Lbh;")
    private class27 field327;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "Lbh;")
    private class27 field324;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "Lbh;")
    private class27 field320;

    @OriginalMember(owner = "client!uc", name = "tc", descriptor = "Los;")
    private class293 field404;

    @OriginalMember(owner = "client!uc", name = "zb", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!uc", name = "vb", descriptor = "[I")
    private int[] field354;

    @OriginalMember(owner = "client!uc", name = "Mb", descriptor = "[I")
    private int[] field371;

    @OriginalMember(owner = "client!uc", name = "ic", descriptor = "[I")
    private int[] field393;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "[I")
    private int[] field300;

    @OriginalMember(owner = "client!uc", name = "Eb", descriptor = "[S")
    private short[] field363;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "[Lgq;")
    private class339[] field339;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "[Lin;")
    private class56[] field301;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!uc", name = "Bb", descriptor = "[Lgi;")
    private class460[] field360;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "[Lca;")
    private class190[] field316;

    @OriginalMember(owner = "client!uc", name = "Nb", descriptor = "[S")
    private short[] field372;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "[F")
    private float[] field331;

    @OriginalMember(owner = "client!uc", name = "tb", descriptor = "[S")
    private short[] field352;

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "[F")
    private float[] field346;

    @OriginalMember(owner = "client!uc", name = "dc", descriptor = "S")
    private short field388;

    @OriginalMember(owner = "client!uc", name = "Qb", descriptor = "[S")
    private short[] field375;

    @OriginalMember(owner = "client!uc", name = "Pb", descriptor = "[B")
    private byte[] field374;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "[S")
    private short[] field337;

    @OriginalMember(owner = "client!uc", name = "hc", descriptor = "[S")
    private short[] field392;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "S")
    private short field299;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "[S")
    private short[] field297;

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "[S")
    private short[] field344;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "[S")
    private short[] field333;

    @OriginalMember(owner = "client!uc", name = "Vb", descriptor = "[B")
    private byte[] field380;

    @OriginalMember(owner = "client!uc", name = "rb", descriptor = "[S")
    private short[] field350;

    @OriginalMember(owner = "client!uc", name = "Wb", descriptor = "[S")
    private short[] field381;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "[I")
    private int[] field296;

    @OriginalMember(owner = "client!uc", name = "cc", descriptor = "[[I")
    private int[][] field387;

    @OriginalMember(owner = "client!uc", name = "gc", descriptor = "[[I")
    private int[][] field391;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "[[I")
    private int[][] field328;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Z")
    public static boolean field303 = false;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "B")
    private byte field317;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!uc", name = "pb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!uc", name = "qb", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!uc", name = "ub", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!uc", name = "wb", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!uc", name = "xb", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!uc", name = "Ab", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!uc", name = "Cb", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!uc", name = "Db", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!uc", name = "Fb", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!uc", name = "Gb", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!uc", name = "Ib", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!uc", name = "Jb", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!uc", name = "Kb", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!uc", name = "Lb", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!uc", name = "Rb", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!uc", name = "Sb", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!uc", name = "Tb", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!uc", name = "Ub", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!uc", name = "Xb", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!uc", name = "Yb", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!uc", name = "Zb", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!uc", name = "fc", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!uc", name = "kc", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!uc", name = "lc", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!uc", name = "mc", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!uc", name = "nc", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!uc", name = "oc", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!uc", name = "pc", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!uc", name = "qc", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "Llp;")
    private class255 field336;

    @OriginalMember(owner = "client!uc", name = "sc", descriptor = "Lre;")
    private class409 field403;

    @OriginalMember(owner = "client!uc", name = "uc", descriptor = "Lms;")
    private class511 field405;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "S")
    private short field329;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "S")
    private short field342;

    @OriginalMember(owner = "client!uc", name = "sb", descriptor = "S")
    private short field351;

    @OriginalMember(owner = "client!uc", name = "Ob", descriptor = "S")
    private short field373;

    @OriginalMember(owner = "client!uc", name = "ac", descriptor = "S")
    private short field385;

    @OriginalMember(owner = "client!uc", name = "ec", descriptor = "S")
    private short field389;

    @OriginalMember(owner = "client!uc", name = "rc", descriptor = "S")
    private short field402;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "()V")
    public final void method158() {
        for (int var1 = 0; var1 < this.field394; var1++) {
            this.field393[var1] = this.field393[var1] + 7 >> 4;
            this.field371[var1] = this.field371[var1] + 7 >> 4;
            this.field300[var1] = this.field300[var1] + 7 >> 4;
        }
        field377++;
        this.field311 = false;
        if (this.field366 != null) {
            this.field366.field442 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lva;IIIZ)V")
    public final void method159(class327 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field340++;
        class23 var6 = (class23) arg0;
        if (this.field325 == 0 || var6.field325 == 0) {
            return;
        }
        int var7 = var6.field338;
        int[] var8 = var6.field393;
        int[] var9 = var6.field371;
        int[] var10 = var6.field300;
        short[] var11 = var6.field333;
        short[] var12 = var6.field375;
        short[] var13 = var6.field350;
        byte[] var14 = var6.field374;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field403 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var18 = this.field403.field5995;
            var15 = this.field403.field5991;
            var17 = this.field403.field5990;
            var16 = this.field403.field5993;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field403 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var20 = var6.field403.field5991;
            var21 = var6.field403.field5990;
            var22 = var6.field403.field5993;
            var19 = var6.field403.field5995;
        }
        int[] var23 = var6.field354;
        short[] var24 = var6.field297;
        if (!var6.field311) {
            var6.method177(-32768);
        }
        short var25 = var6.field351;
        short var26 = var6.field342;
        short var27 = var6.field329;
        short var28 = var6.field373;
        short var29 = var6.field389;
        short var30 = var6.field385;
        for (int var31 = 0; var31 < this.field338; var31++) {
            int var32 = this.field371[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field393[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field300[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field354[var31];
                        int var37 = this.field354[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field297[var38] - 1;
                            if (var35 == -1 || this.field374[var35] != 0) {
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
                                        if (var16 == null) {
                                            this.field403 = new class409();
                                            var16 = this.field403.field5993 = class283.method1717(0, this.field333);
                                            var15 = this.field403.field5991 = class283.method1717(0, this.field375);
                                            var17 = this.field403.field5990 = class283.method1717(0, this.field350);
                                            var18 = this.field403.field5995 = class312.method1875(this.field374, 114);
                                        }
                                        if (var22 == null) {
                                            class409 var44 = var6.field403 = new class409();
                                            var22 = var44.field5993 = class283.method1717(0, var11);
                                            var20 = var44.field5991 = class283.method1717(0, var12);
                                            var21 = var44.field5990 = class283.method1717(0, var13);
                                            var19 = var44.field5995 = class312.method1875(var14, 115);
                                        }
                                        short var45 = this.field333[var35];
                                        short var46 = this.field375[var35];
                                        short var47 = this.field350[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field374[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var22[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var19[var52] += var49;
                                            }
                                        }
                                        short var53 = var12[var42];
                                        int var54 = this.field354[var31];
                                        byte var55 = var14[var42];
                                        int var56 = this.field354[var31 + 1];
                                        short var57 = var11[var42];
                                        short var58 = var13[var42];
                                        for (int var59 = var54; var59 < var56; var59++) {
                                            int var60 = this.field297[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var16[var60] += var57;
                                                var15[var60] += var53;
                                                var17[var60] += var58;
                                                var18[var60] += var55;
                                            }
                                        }
                                        if (this.field324 == null && this.field320 != null) {
                                            this.field320.field442 = null;
                                        }
                                        if (this.field324 != null) {
                                            this.field324.field442 = null;
                                        }
                                        if (var6.field324 == null && var6.field320 != null) {
                                            var6.field320.field442 = null;
                                        }
                                        if (var6.field324 != null) {
                                            var6.field324.field442 = null;
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

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lag;")
    public static final class463 method160(int arg0, int arg1) {
        field383++;
        class463[] var2 = class4.method26((byte) -128);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class463 var4 = var2[var3];
            if (var4.field6725 == arg0) {
                return var4;
            }
        }
        if (arg1 != 21901) {
            field303 = false;
        }
        return null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BSBII)I")
    private final int method161(byte arg0, short arg1, byte arg2, int arg3, int arg4) {
        field348++;
        if (arg0 != 107) {
            this.method180(-97, 56, 31, -63);
        }
        int var6 = class31.field518[class499.method3009(arg4, arg0 + 28737, arg3)];
        if (arg1 != -1) {
            class118 var7 = this.field322.field1695.method432(arg1 & 0xFFFF, true);
            int var8 = var7.field1541 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg3 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field1542 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
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
                var6 = ((var13 & 0xD500FF00) << 8) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return 255 - ((arg2 & 0xFF) - (var6 << 8));
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public final void method162(int arg0) {
        this.field299 = (short) arg0;
        if (this.field320 != null) {
            this.field320.field442 = null;
        }
        field308++;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public final void method163(int arg0) {
        field312++;
        int var2 = class323.field4731[arg0];
        int var3 = class323.field4733[arg0];
        for (int var4 = 0; var4 < this.field338; var4++) {
            int var7 = this.field393[var4] * var3 + this.field300[var4] * var2 >> 15;
            this.field300[var4] = this.field300[var4] * var3 - (this.field393[var4] * var2) >> 15;
            this.field393[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field386; var5++) {
            int var6 = this.field350[var5] * var2 + this.field333[var5] * var3 >> 15;
            this.field350[var5] = (short) (this.field350[var5] * var3 - (this.field333[var5] * var2) >> 15);
            this.field333[var5] = (short) var6;
        }
        if (this.field324 == null && this.field320 != null) {
            this.field320.field442 = null;
        }
        if (this.field324 != null) {
            this.field324.field442 = null;
        }
        if (this.field366 != null) {
            this.field366.field442 = null;
        }
        this.field311 = false;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILog;Log;III)V")
    public final void method164(int arg0, int arg1, class441 arg2, class441 arg3, int arg4, int arg5, int arg6) {
        field396++;
        if (!this.field311) {
            this.method177(-32768);
        }
        int var8 = this.field329 + arg4;
        int var9 = this.field373 + arg4;
        int var10 = this.field389 + arg6;
        int var11 = this.field385 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field6434 <= (arg2.field6438 + var9 >> arg2.field6441) || var10 < 0 || arg2.field6436 <= (arg2.field6438 + var11 >> arg2.field6441)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (var9 + arg3.field6438 >> arg3.field6441) >= arg3.field6434 || var10 < 0 || var11 + arg3.field6438 >> arg3.field6441 >= arg3.field6436) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field6441;
            int var13 = arg2.field6438 + var9 - 1 >> arg2.field6441;
            int var14 = var10 >> arg2.field6441;
            int var15 = var11 + arg2.field6438 - 1 >> arg2.field6441;
            if (arg5 == arg2.method848(var12, var14) && arg2.method848(var13, var14) == arg5 && arg5 == arg2.method848(var12, var15) && arg2.method848(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field338; var16++) {
                this.field371[var16] = this.field371[var16] + arg2.method855(this.field393[var16] + arg4, this.field300[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field351;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field338; var31++) {
                int var32 = (this.field371[var31] << 16) / var30;
                if (var32 < arg1) {
                    this.field371[var31] -= -((arg1 - var32) * (arg2.method855(this.field393[var31] + arg4, this.field300[var31] + arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var26 = (arg1 & 0xFF) * 4;
            int var27 = ((arg1 & 0xFFB6) >> 8) * 4;
            int var28 = (arg1 & 0xFFAEE6) >> 16 << 6;
            int var29 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var26 >> 1) < 0 || (arg2.field6434 << arg2.field6441) <= ((var26 >> 1) + arg4 + arg2.field6438) || (arg6 - (var27 >> 1)) < 0 || (arg2.field6436 << arg2.field6441) <= ((var27 >> 1) + arg2.field6438 + arg6)) {
                return;
            }
            this.method1964(arg6, var27, arg5, 28796, arg4, arg2, var29, var28, var26);
        } else if (arg0 == 4) {
            int var24 = this.field342 - this.field351;
            for (int var25 = 0; var25 < this.field338; var25++) {
                this.field371[var25] = var24 + this.field371[var25] + arg3.method855(this.field393[var25] - -arg4, this.field300[var25] + arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var17 = this.field342 - this.field351;
            for (int var18 = 0; var18 < this.field338; var18++) {
                int var19 = this.field393[var18] + arg4;
                int var20 = this.field300[var18] + arg6;
                int var21 = arg2.method855(var19, var20);
                int var22 = arg3.method855(var19, var20);
                int var23 = var21 - var22;
                this.field371[var18] = ((this.field371[var18] << 8) / var17 * var23 >> 8) + var21 - arg5;
            }
        }
        if (this.field366 != null) {
            this.field366.field442 = null;
        }
        this.field311 = false;
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
    public final void method165(int arg0) {
        if (this.field320 != null) {
            this.field320.field442 = null;
        }
        field368++;
        this.field388 = (short) arg0;
        if (this.field324 != null) {
            this.field324.field442 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
    public final void method166(int arg0) {
        field378++;
        int var2 = class323.field4731[arg0];
        int var3 = class323.field4733[arg0];
        for (int var4 = 0; var4 < this.field338; var4++) {
            int var5 = this.field393[var4] * var3 + this.field371[var4] * var2 >> 15;
            this.field371[var4] = this.field371[var4] * var3 - this.field393[var4] * var2 >> 15;
            this.field393[var4] = var5;
        }
        this.field311 = false;
        if (this.field366 != null) {
            this.field366.field442 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
    public final void method167() {
        field334++;
        if (this.field386 <= 0 || this.field357 <= 0) {
            return;
        }
        this.method170(false, 82);
        if ((this.field317 & 0x10) == 0 && this.field404.field4175 == null) {
            this.method209(true, false);
        }
        this.method210(-1);
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()I")
    public final int method168() {
        field304++;
        if (!this.field311) {
            this.method177(-32768);
        }
        return this.field385;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(FIJILfl;IIIIF)S")
    private final short method169(float arg0, int arg1, long arg2, int arg3, class499 arg4, int arg5, int arg6, int arg7, int arg8, float arg9) {
        field359++;
        int var12 = this.field354[arg5];
        int var13 = this.field354[arg5 + 1];
        int var14 = arg8;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field297[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class405.field5949[var15] == arg2) {
                return (short) (var16 - 1);
            }
        }
        this.field297[var14] = (short) (this.field386 + 1);
        class405.field5949[var14] = arg2;
        this.field333[this.field386] = (short) arg3;
        this.field375[this.field386] = (short) arg6;
        this.field350[this.field386] = (short) arg7;
        this.field374[this.field386] = (byte) arg1;
        this.field331[this.field386] = arg9;
        this.field346[this.field386] = arg0;
        return (short) (this.field386++);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)V")
    private final void method170(boolean arg0, int arg1) {
        field362++;
        boolean var3 = this.field320 != null && this.field320.field442 == null;
        boolean var4 = this.field324 != null && this.field324.field442 == null;
        boolean var5 = this.field366 != null && this.field366.field442 == null;
        boolean var6 = this.field327 != null && this.field327.field442 == null;
        if (arg0) {
            var3 &= (this.field317 & 0x2) != 0;
            var6 &= (this.field317 & 0x8) != 0;
            var4 &= (this.field317 & 0x4) != 0;
            var5 &= (this.field317 & 0x1) != 0;
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
        if (arg1 < 52) {
            this.field386 = -77;
        }
        if (var7 == 0) {
            return;
        }
        if (class66.field982.field2041.length < (this.field386 * var7)) {
            class66.field982 = new class269((this.field386 + 100) * var7);
        } else {
            class66.field982.field2018 = 0;
        }
        if (var5) {
            if (this.field322.field7350) {
                for (int var20 = 0; var20 < this.field338; var20++) {
                    int var21 = NativeStream.floatToRawIntBits((float) this.field393[var20]);
                    int var22 = NativeStream.floatToRawIntBits((float) this.field371[var20]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field300[var20]);
                    int var24 = this.field354[var20];
                    int var25 = this.field354[var20 + 1];
                    for (int var26 = var24; var26 < var25; var26++) {
                        int var27 = this.field297[var26] - 1;
                        if (var27 == -1) {
                            break;
                        }
                        class66.field982.field2018 = var7 * var27;
                        class66.field982.method969(19869, var21);
                        class66.field982.method969(19869, var22);
                        class66.field982.method969(19869, var23);
                    }
                }
            } else {
                for (int var12 = 0; var12 < this.field338; var12++) {
                    int var13 = NativeStream.floatToRawIntBits((float) this.field393[var12]);
                    int var14 = NativeStream.floatToRawIntBits((float) this.field371[var12]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field300[var12]);
                    int var16 = this.field354[var12];
                    int var17 = this.field354[var12 + 1];
                    for (int var18 = var16; var18 < var17; var18++) {
                        int var19 = this.field297[var18] - 1;
                        if (var19 == -1) {
                            break;
                        }
                        class66.field982.field2018 = var7 * var19;
                        class66.field982.method978(var13, 118);
                        class66.field982.method978(var14, 104);
                        class66.field982.method978(var15, 123);
                    }
                }
            }
        }
        if (var3) {
            if (this.field324 == null) {
                byte[] var28;
                short[] var29;
                short[] var30;
                short[] var31;
                if (this.field403 == null) {
                    var30 = this.field375;
                    var31 = this.field333;
                    var29 = this.field350;
                    var28 = this.field374;
                } else {
                    var28 = this.field403.field5995;
                    var29 = this.field403.field5990;
                    var30 = this.field403.field5991;
                    var31 = this.field403.field5993;
                }
                float var32 = this.field322.field7394[0];
                float var33 = this.field322.field7394[1];
                float var34 = this.field322.field7394[2];
                float var35 = this.field322.field7414;
                float var36 = this.field322.field7424 * 768.0F / (float) this.field388;
                float var37 = this.field322.field7398 * 768.0F / (float) this.field388;
                for (int var38 = 0; var38 < this.field325; var38++) {
                    int var39 = this.method161((byte) 107, this.field344[var38], this.field380[var38], this.field299, this.field381[var38]);
                    short var40 = this.field392[var38];
                    float var41 = (float) (var39 >> 16 & 0xFF) * this.field322.field7409;
                    float var42 = (float) (var39 >>> 24) * this.field322.field7396;
                    float var43 = (float) ((var39 & 0xFFBD) >> 8) * this.field322.field7436;
                    short var44 = (short) var28[var40];
                    float var45;
                    if (var44 == 0) {
                        var45 = ((float) var29[var40] * var34 + (float) var30[var40] * var33 + (float) var31[var40] * var32) * 0.0026041667F;
                    } else {
                        var45 = ((float) var29[var40] * var34 + (float) var30[var40] * var33 + (float) var31[var40] * var32) / (float) (var44 * 256);
                    }
                    float var46 = var45 * (var45 < 0.0F ? var37 : var36) + var35;
                    int var47 = (int) (var42 * var46);
                    if (var47 < 0) {
                        var47 = 0;
                    } else if (var47 > 255) {
                        var47 = 255;
                    }
                    int var48 = (int) (var41 * var46);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var43 * var46);
                    class66.field982.field2018 = var7 * var40 + var9;
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    class66.field982.method947(-59, var47);
                    class66.field982.method947(-34, var48);
                    class66.field982.method947(-97, var49);
                    class66.field982.method947(-63, 255 - (this.field380[var38] & 0xFF));
                    short var50 = this.field352[var38];
                    short var51 = (short) var28[var50];
                    float var52;
                    if (var51 == 0) {
                        var52 = ((float) var29[var50] * var34 + (float) var30[var50] * var33 + (float) var31[var50] * var32) * 0.0026041667F;
                    } else {
                        var52 = ((float) var29[var50] * var34 + (float) var30[var50] * var33 + (float) var31[var50] * var32) / (float) (var51 * 256);
                    }
                    float var53 = ((var52 < 0.0F) ? var37 : var36) * var52 + var35;
                    int var54 = (int) (var42 * var53);
                    int var55 = (int) (var41 * var53);
                    if (var54 < 0) {
                        var54 = 0;
                    } else if (var54 > 255) {
                        var54 = 255;
                    }
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var43 * var53);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    class66.field982.field2018 = var7 * var50 + var9;
                    class66.field982.method947(-112, var54);
                    class66.field982.method947(-41, var55);
                    class66.field982.method947(-29, var56);
                    class66.field982.method947(-67, 255 - (this.field380[var38] & 0xFF));
                    short var57 = this.field372[var38];
                    short var58 = (short) var28[var57];
                    float var59;
                    if (var58 == 0) {
                        var59 = ((float) var29[var57] * var34 + (float) var30[var57] * var33 + (float) var31[var57] * var32) * 0.0026041667F;
                    } else {
                        var59 = ((float) var29[var57] * var34 + (float) var30[var57] * var33 + (float) var31[var57] * var32) / (float) (var58 * 256);
                    }
                    float var60 = var35 + var59 * ((var59 < 0.0F) ? var37 : var36);
                    int var61 = (int) (var42 * var60);
                    if (var61 < 0) {
                        var61 = 0;
                    } else if (var61 > 255) {
                        var61 = 255;
                    }
                    int var62 = (int) (var41 * var60);
                    int var63 = (int) (var43 * var60);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    class66.field982.field2018 = var7 * var57 + var9;
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    class66.field982.method947(-59, var61);
                    class66.field982.method947(-94, var62);
                    class66.field982.method947(-125, var63);
                    class66.field982.method947(-79, 255 - (this.field380[var38] & 0xFF));
                }
            } else {
                for (int var64 = 0; var64 < this.field325; var64++) {
                    int var65 = this.method161((byte) 107, this.field344[var64], this.field380[var64], this.field299, this.field381[var64]);
                    class66.field982.field2018 = this.field392[var64] * var7 + var9;
                    class66.field982.method969(19869, var65);
                    class66.field982.field2018 = this.field352[var64] * var7 + var9;
                    class66.field982.method969(19869, var65);
                    class66.field982.field2018 = var9 + (this.field372[var64] * var7);
                    class66.field982.method969(19869, var65);
                }
            }
        }
        if (var4) {
            short[] var66;
            short[] var67;
            short[] var68;
            byte[] var69;
            if (this.field403 == null) {
                var66 = this.field375;
                var67 = this.field350;
                var68 = this.field333;
                var69 = this.field374;
            } else {
                var66 = this.field403.field5991;
                var68 = this.field403.field5993;
                var67 = this.field403.field5990;
                var69 = this.field403.field5995;
            }
            float var70 = 3.0F / (float) this.field388;
            float var71 = 3.0F / (float) (this.field388 / 2 + this.field388);
            class66.field982.field2018 = var10;
            if (this.field322.field7350) {
                for (int var75 = 0; var75 < this.field386; var75++) {
                    int var76 = var69[var75] & 0xFF;
                    if (var76 == 0) {
                        class66.field982.method1646((float) var68[var75] * var71, -136782152);
                        class66.field982.method1646((float) var66[var75] * var71, -136782152);
                        class66.field982.method1646((float) var67[var75] * var71, -136782152);
                    } else {
                        float var77 = var70 / (float) var76;
                        class66.field982.method1646((float) var68[var75] * var77, -136782152);
                        class66.field982.method1646((float) var66[var75] * var77, -136782152);
                        class66.field982.method1646((float) var67[var75] * var77, -136782152);
                    }
                    class66.field982.field2018 += var7 - 12;
                }
            } else {
                for (int var72 = 0; var72 < this.field386; var72++) {
                    int var73 = var69[var72] & 0xFF;
                    if (var73 == 0) {
                        class66.field982.method1647((float) var68[var72] * var71, true);
                        class66.field982.method1647((float) var66[var72] * var71, true);
                        class66.field982.method1647((float) var67[var72] * var71, true);
                    } else {
                        float var74 = var70 / (float) var73;
                        class66.field982.method1647((float) var68[var72] * var74, true);
                        class66.field982.method1647((float) var66[var72] * var74, true);
                        class66.field982.method1647((float) var67[var72] * var74, true);
                    }
                    class66.field982.field2018 += var7 - 12;
                }
            }
        }
        if (var6) {
            class66.field982.field2018 = var11;
            if (this.field322.field7350) {
                for (int var78 = 0; var78 < this.field386; var78++) {
                    class66.field982.method1646(this.field331[var78], -136782152);
                    class66.field982.method1646(this.field346[var78], -136782152);
                    class66.field982.field2018 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field386; var79++) {
                    class66.field982.method1647(this.field331[var79], true);
                    class66.field982.method1647(this.field346[var79], true);
                    class66.field982.field2018 += var7 - 8;
                }
            }
        }
        class66.field982.field2018 = this.field386 * var7;
        class511 var80;
        if (arg0) {
            if (this.field405 == null) {
                this.field405 = this.field322.method2900(var7, (byte) 66, true, class66.field982.field2018, class66.field982.field2041);
            } else {
                this.field405.method2187(class66.field982.field2018, var7, class66.field982.field2041, false);
            }
            this.field317 = 0;
            var80 = this.field405;
        } else {
            var80 = this.field322.method2900(var7, (byte) 105, false, class66.field982.field2018, class66.field982.field2041);
            this.field305 = true;
        }
        if (var5) {
            this.field366.field442 = var80;
            this.field366.field440 = var8;
        }
        if (var6) {
            this.field327.field442 = var80;
            this.field327.field440 = var11;
        }
        if (var3) {
            this.field320.field442 = var80;
            this.field320.field440 = var9;
        }
        if (var4) {
            this.field324.field442 = var80;
            this.field324.field440 = var10;
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
    public final void method171(int arg0) {
        field315++;
        int var2 = class323.field4731[arg0];
        int var3 = class323.field4733[arg0];
        for (int var4 = 0; var4 < this.field338; var4++) {
            int var5 = this.field393[var4] * var3 + this.field300[var4] * var2 >> 15;
            this.field300[var4] = this.field300[var4] * var3 - (this.field393[var4] * var2) >> 15;
            this.field393[var4] = var5;
        }
        this.field311 = false;
        if (this.field366 != null) {
            this.field366.field442 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(SS)V")
    public final void method172(short arg0, short arg1) {
        field345++;
        class59 var3 = this.field322.field1695;
        for (int var4 = 0; var4 < this.field325; var4++) {
            if (this.field344[var4] == arg0) {
                this.field344[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class118 var7 = var3.method432(arg0 & 0xFFFF, true);
            var5 = var7.field1541;
            var6 = var7.field1542;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class118 var10 = var3.method432(arg1 & 0xFFFF, true);
            var8 = var10.field1541;
            var9 = var10.field1542;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field316 != null) {
            for (int var11 = 0; var11 < this.field341; var11++) {
                class190 var12 = this.field316[var11];
                class460 var13 = this.field360[var11];
                var13.field6687 = class31.field518[this.field381[var12.field2695] & 0xFFFF] & 0xFFFFFF | var13.field6687 & 0xFF000000;
            }
        }
        if (this.field320 != null) {
            this.field320.field442 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIII)V")
    public final void method173(int arg0, int arg1, int arg2, int arg3) {
        field349++;
        if (arg0 == 0) {
            class478.field6885 = 0;
            class492.field7520 = 0;
            int var5 = 0;
            class211.field2989 = 0;
            for (int var6 = 0; var6 < this.field338; var6++) {
                class478.field6885 += this.field393[var6];
                class211.field2989 += this.field371[var6];
                class492.field7520 += this.field300[var6];
                var5++;
            }
            if (var5 > 0) {
                class211.field2989 = class211.field2989 / var5 + arg2;
                class492.field7520 = class492.field7520 / var5 + arg3;
                class478.field6885 = class478.field6885 / var5 + arg1;
            } else {
                class211.field2989 = arg2;
                class492.field7520 = arg3;
                class478.field6885 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field338; var7++) {
                this.field393[var7] += arg1;
                this.field371[var7] += arg2;
                this.field300[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field338; var8++) {
                this.field393[var8] -= class478.field6885;
                this.field371[var8] -= class211.field2989;
                this.field300[var8] -= class492.field7520;
                if (arg3 != 0) {
                    int var9 = class323.field4731[arg3];
                    int var10 = class323.field4733[arg3];
                    int var11 = this.field393[var8] * var10 + (this.field371[var8] * var9 + 32767) >> 15;
                    this.field371[var8] = this.field371[var8] * var10 + 32767 - (this.field393[var8] * var9) >> 15;
                    this.field393[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class323.field4731[arg1];
                    int var13 = class323.field4733[arg1];
                    int var14 = this.field371[var8] * var13 + 32767 - (this.field300[var8] * var12) >> 15;
                    this.field300[var8] = this.field371[var8] * var12 + (this.field300[var8] * var13) + 32767 >> 15;
                    this.field371[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class323.field4731[arg2];
                    int var16 = class323.field4733[arg2];
                    int var17 = this.field300[var8] * var15 + (this.field393[var8] * var16) + 32767 >> 15;
                    this.field300[var8] = this.field300[var8] * var16 + 32767 - (this.field393[var8] * var15) >> 15;
                    this.field393[var8] = var17;
                }
                this.field393[var8] += class478.field6885;
                this.field371[var8] += class211.field2989;
                this.field300[var8] += class492.field7520;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field338; var18++) {
                this.field393[var18] -= class478.field6885;
                this.field371[var18] -= class211.field2989;
                this.field300[var18] -= class492.field7520;
                this.field393[var18] = this.field393[var18] * arg1 / 128;
                this.field371[var18] = this.field371[var18] * arg2 / 128;
                this.field300[var18] = this.field300[var18] * arg3 / 128;
                this.field393[var18] += class478.field6885;
                this.field371[var18] += class211.field2989;
                this.field300[var18] += class492.field7520;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field325; var19++) {
                int var23 = (this.field380[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field380[var19] = (byte) var23;
            }
            if (this.field320 != null) {
                this.field320.field442 = null;
            }
            if (this.field316 != null) {
                for (int var20 = 0; var20 < this.field341; var20++) {
                    class190 var21 = this.field316[var20];
                    class460 var22 = this.field360[var20];
                    var22.field6687 = 255 - (this.field380[var21.field2695] & 0xFF) << 24 | var22.field6687 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field325; var24++) {
                int var28 = this.field381[var24] & 0xFFFF;
                int var29 = (var28 & 0xFC24) >> 10;
                int var30 = (var28 & 0x3C7) >> 7;
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
                this.field381[var24] = (short) class51.method379(var34, class51.method379(var32 << 10, var33 << 7));
            }
            if (this.field320 != null) {
                this.field320.field442 = null;
            }
            if (this.field316 != null) {
                for (int var25 = 0; var25 < this.field341; var25++) {
                    class190 var26 = this.field316[var25];
                    class460 var27 = this.field360[var25];
                    var27.field6687 = class31.field518[this.field381[var26.field2695] & 0xFFFF] & 0xFFFFFF | var27.field6687 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field341; var35++) {
                class460 var36 = this.field360[var35];
                var36.field6690 += arg1;
                var36.field6695 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field341; var37++) {
                class460 var38 = this.field360[var37];
                var38.field6689 = var38.field6689 * arg1 >> 7;
                var38.field6692 = var38.field6692 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field341; var39++) {
                class460 var40 = this.field360[var39];
                var40.field6688 = var40.field6688 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "()I")
    public final int method174() {
        field302++;
        if (!this.field311) {
            this.method177(-32768);
        }
        return this.field342;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(SS)V")
    public final void method175(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field325; var3++) {
            if (this.field381[var3] == arg0) {
                this.field381[var3] = arg1;
            }
        }
        field314++;
        if (this.field316 != null) {
            for (int var4 = 0; var4 < this.field341; var4++) {
                class190 var5 = this.field316[var4];
                class460 var6 = this.field360[var4];
                var6.field6687 = class31.field518[this.field381[var5.field2695] & 0xFFFF] & 0xFFFFFF | var6.field6687 & 0xFF000000;
            }
        }
        if (this.field320 != null) {
            this.field320.field442 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(III)V")
    public final void method176(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field338; var4++) {
            if (arg0 != 128) {
                this.field393[var4] = this.field393[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field371[var4] = this.field371[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field300[var4] = this.field300[var4] * arg2 >> 7;
            }
        }
        field364++;
        this.field311 = false;
        if (this.field366 != null) {
            this.field366.field442 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
    private final void method177(int arg0) {
        field382++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = arg0;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field338; var10++) {
            int var11 = this.field393[var10];
            int var12 = this.field371[var10];
            int var13 = this.field300[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
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
            int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field373 = (short) var5;
        this.field329 = (short) var2;
        this.field342 = (short) var6;
        this.field385 = (short) var7;
        this.field389 = (short) var4;
        this.field351 = (short) var3;
        this.field402 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field311 = true;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()V")
    public final void method178() {
        field356++;
        for (int var1 = 0; var1 < this.field338; var1++) {
            this.field300[var1] = -this.field300[var1];
        }
        for (int var2 = 0; var2 < this.field386; var2++) {
            this.field350[var2] = (short) (-this.field350[var2]);
        }
        for (int var3 = 0; var3 < this.field325; var3++) {
            short var4 = this.field392[var3];
            this.field392[var3] = this.field372[var3];
            this.field372[var3] = var4;
        }
        if (this.field324 == null && this.field320 != null) {
            this.field320.field442 = null;
        }
        if (this.field324 != null) {
            this.field324.field442 = null;
        }
        this.field311 = false;
        if (this.field404 != null) {
            this.field404.field4175 = null;
        }
        if (this.field366 != null) {
            this.field366.field442 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lgs;Lla;II)V")
    public final void method179(class33 arg0, class299 arg1, int arg2, int arg3) {
        field306++;
        if (this.field386 == 0) {
            return;
        }
        class252 var5 = this.field322.field7391;
        if (!this.field311) {
            this.method177(-32768);
        }
        class252 var6 = (class252) arg0;
        class163.field2111 = var5.field3644 * var6.field3625 + var5.field3650 * var6.field3629 + var5.field3625 * var6.field3640;
        class9.field142 = var5.field3644 * var6.field3618 + var5.field3650 * var6.field3643 + var5.field3625 * var6.field3623 + var5.field3618;
        float var7 = (float) this.field351 * class163.field2111 + class9.field142;
        float var8 = (float) this.field342 * class163.field2111 + class9.field142;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) this.field402 + var7;
            var10 = (float) (-this.field402) + var8;
        } else {
            var10 = (float) (-this.field402) + var7;
            var9 = (float) this.field402 + var8;
        }
        if ((var10 >= this.field322.field7344) || (var9 <= (float) this.field322.field7430)) {
            return;
        }
        class451.field6572 = var5.field3617 * var6.field3625 + var5.field3629 * var6.field3640 + var5.field3615 * var6.field3629;
        class115.field1480 = var5.field3617 * var6.field3618 + var5.field3629 * var6.field3623 + var5.field3615 * var6.field3643 + var5.field3643;
        float var11 = (float) this.field351 * class451.field6572 + class115.field1480;
        float var12 = (float) this.field342 * class451.field6572 + class115.field1480;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = ((float) this.field402 + var11) * (float) this.field322.field7342;
            var14 = (var12 - (float) this.field402) * (float) this.field322.field7342;
        } else {
            var13 = ((float) this.field402 + var12) * (float) this.field322.field7342;
            var14 = (var11 - (float) this.field402) * (float) this.field322.field7342;
        }
        if ((this.field322.field7445 <= var14 / (float) arg2) || (this.field322.field7389 >= var13 / (float) arg2)) {
            return;
        }
        class78.field1103 = var5.field3638 * var6.field3625 + var5.field3640 * var6.field3640 + var5.field3628 * var6.field3629;
        class135.field1728 = var5.field3638 * var6.field3618 + var5.field3640 * var6.field3623 + var5.field3628 * var6.field3643 + var5.field3623;
        float var15 = (float) this.field351 * class78.field1103 + class135.field1728;
        float var16 = (float) this.field342 * class78.field1103 + class135.field1728;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var17 = (var16 - (float) this.field402) * (float) this.field322.field7386;
            var18 = ((float) this.field402 + var15) * (float) this.field322.field7386;
        } else {
            var17 = ((float) (-this.field402) + var15) * (float) this.field322.field7386;
            var18 = ((float) this.field402 + var16) * (float) this.field322.field7386;
        }
        if ((var17 / (float) arg2 >= this.field322.field7435) || (var18 / (float) arg2 <= this.field322.field7356)) {
            return;
        }
        if (arg1 != null || this.field316 != null) {
            class87.field1200 = var5.field3617 * var6.field3644 + var5.field3629 * var6.field3638 + var5.field3615 * var6.field3617;
            class31.field521 = var5.field3638 * var6.field3644 + var5.field3640 * var6.field3638 + var5.field3628 * var6.field3617;
            class65.field966 = var5.field3638 * var6.field3650 + var5.field3640 * var6.field3628 + var5.field3628 * var6.field3615;
            class178.field2560 = var5.field3644 * var6.field3650 + var5.field3650 * var6.field3615 + var5.field3625 * var6.field3628;
            class209.field2953 = var5.field3644 * var6.field3644 + var5.field3650 * var6.field3617 + var5.field3625 * var6.field3638;
            class415.field6151 = var5.field3617 * var6.field3650 + var5.field3629 * var6.field3628 + var5.field3615 * var6.field3615;
        }
        if (arg1 != null) {
            int var19 = this.field373 + this.field329 >> 1;
            int var20 = this.field389 + this.field385 >> 1;
            int var21 = (int) ((float) var20 * class87.field1200 + (float) this.field351 * class451.field6572 + (float) var19 * class415.field6151 + class115.field1480);
            int var22 = (int) ((float) var20 * class31.field521 + (float) this.field351 * class78.field1103 + (float) var19 * class65.field966 + class135.field1728);
            int var23 = (int) ((float) var20 * class209.field2953 + (float) this.field351 * class163.field2111 + (float) var19 * class178.field2560 + class9.field142);
            int var24 = (int) ((float) var20 * class87.field1200 + (float) this.field342 * class451.field6572 + (float) var19 * class415.field6151 + class115.field1480);
            int var25 = (int) ((float) var20 * class31.field521 + (float) this.field342 * class78.field1103 + (float) var19 * class65.field966 + class135.field1728);
            int var26 = (int) ((float) var20 * class209.field2953 + (float) this.field342 * class163.field2111 + (float) var19 * class178.field2560 + class9.field142);
            arg1.field4344 = this.field322.field7402 + (this.field322.field7342 * var21 / arg2);
            arg1.field4345 = this.field322.field7375 + (this.field322.field7386 * var22 / arg2);
            arg1.field4348 = this.field322.field7386 * var25 / arg2 + this.field322.field7375;
            arg1.field4349 = this.field322.field7342 * var24 / arg2 + this.field322.field7402;
            if (var23 < this.field322.field7430 && this.field322.field7430 > var26) {
                arg1.field4347 = (this.field402 + var21) * this.field322.field7342 / arg2 + this.field322.field7402 - arg1.field4344;
                arg1.field4346 = true;
            }
        }
        this.field322.method2850((float) arg2, -4);
        this.field322.method2912((byte) 39);
        this.field322.method2917(2320, var6);
        this.method192(75);
        this.field322.method2866((byte) -118);
        this.method182(-2021565648);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)V")
    public final void method180(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field325; var5++) {
            int var9 = this.field381[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field381[var5] = (short) class51.method379(var12, class51.method379(var11 << 7, var10 << 10));
        }
        field326++;
        if (this.field316 != null) {
            for (int var6 = 0; var6 < this.field341; var6++) {
                class190 var7 = this.field316[var6];
                class460 var8 = this.field360[var6];
                var8.field6687 = var8.field6687 & 0xFF000000 | class31.field518[this.field381[var7.field2695] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field320 != null) {
            this.field320.field442 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lss;)Lss;")
    public final class283 method181(class283 arg0) {
        field307++;
        if (this.field386 == 0) {
            return null;
        }
        if (!this.field311) {
            this.method177(-32768);
        }
        int var2;
        int var3;
        if (this.field322.field7444 <= 0) {
            var2 = this.field329 - (this.field322.field7444 * this.field351 >> 8) >> this.field322.field7319;
            var3 = this.field373 - (this.field322.field7444 * this.field342 >> 8) >> this.field322.field7319;
        } else {
            var2 = this.field329 - (this.field322.field7444 * this.field342 >> 8) >> this.field322.field7319;
            var3 = this.field373 - (this.field322.field7444 * this.field351 >> 8) >> this.field322.field7319;
        }
        int var4;
        int var5;
        if (this.field322.field7359 <= 0) {
            var4 = this.field389 - (this.field322.field7359 * this.field351 >> 8) >> this.field322.field7319;
            var5 = this.field385 - (this.field322.field7359 * this.field342 >> 8) >> this.field322.field7319;
        } else {
            var4 = this.field389 - (this.field322.field7359 * this.field342 >> 8) >> this.field322.field7319;
            var5 = this.field385 - (this.field322.field7359 * this.field351 >> 8) >> this.field322.field7319;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class245 var8 = (class245) arg0;
        class245 var9;
        if (var8 != null && var8.method1532(var7, 585123152, var6)) {
            var9 = var8;
            var8.method1530(12304);
        } else {
            var9 = new class245(this.field322, var6, var7);
        }
        var9.method1533(var5, var4, -36, var2, var3);
        this.method190(var9, false);
        return var9;
    }

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)V")
    private final void method182(int arg0) {
        if (arg0 != -2021565648) {
            this.method158();
        }
        if (this.field316 != null) {
            class252 var2 = this.field322.field7315;
            float var3 = this.field322.method781();
            float var4 = this.field322.method790();
            this.field322.method2859(0);
            this.field322.method773(false);
            this.field322.method2884(false, (byte) 93);
            this.field322.method2861(null, 9149, this.field322.field7355, null, this.field322.field7458);
            for (int var5 = 0; var5 < this.field341; var5++) {
                class190 var6 = this.field316[var5];
                class460 var7 = this.field360[var5];
                if (!var6.field2687 || !this.field322.method822()) {
                    float var8 = (float) (this.field393[var6.field2698] + this.field393[var6.field2694] + this.field393[var6.field2696]) * 0.3333333F;
                    float var9 = (float) (this.field371[var6.field2698] + this.field371[var6.field2696] + this.field371[var6.field2694]) * 0.3333333F;
                    float var10 = (float) (this.field300[var6.field2698] + this.field300[var6.field2694] + this.field300[var6.field2696]) * 0.3333333F;
                    float var11 = class87.field1200 * var10 + class451.field6572 * var9 + class415.field6151 * var8 + class115.field1480;
                    float var12 = class31.field521 * var10 + class78.field1103 * var9 + class65.field966 * var8 + class135.field1728;
                    float var13 = class209.field2953 * var10 + class178.field2560 * var8 + class163.field2111 * var9 + class9.field142;
                    var2.method1582((float) var7.field6690 + var11, (float) var7.field6695 + -var12, -var13, var6.field2700 * var7.field6689 >> 7, var6.field2688 * var7.field6692 >> 7, var7.field6688, arg0 + 2021631184);
                    this.field322.method2887(var2, 102);
                    this.field322.method821(var4, var3 - ((float) var6.field2692 * 1.5F));
                    int var14 = var7.field6687;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field322.method2867(0, var6.field2689);
                    this.field322.method2852(0, var6.field2686);
                    this.field322.method2914(124, var6.field2685);
                    this.field322.method2898(0, (byte) -52, 7, 4);
                }
            }
            this.field322.method821(var4, var3);
            this.field322.method773(true);
            this.field322.method2866((byte) -62);
        }
        field343++;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "()Z")
    public final boolean method183() {
        field298++;
        if (this.field387 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field394; var1++) {
            this.field393[var1] <<= 0x4;
            this.field371[var1] <<= 0x4;
            this.field300[var1] <<= 0x4;
        }
        class211.field2989 = 0;
        class478.field6885 = 0;
        class492.field7520 = 0;
        return true;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILgs;Z)Z")
    public final boolean method184(int arg0, int arg1, class33 arg2, boolean arg3) {
        field321++;
        class252 var5 = (class252) arg2;
        class252 var6 = this.field322.field7391;
        float var7 = var5.field3618 * var6.field3617 + var5.field3643 * var6.field3615 + var5.field3623 * var6.field3629 + var6.field3643;
        float var8 = var5.field3618 * var6.field3638 + var5.field3643 * var6.field3628 + var5.field3623 * var6.field3640 + var6.field3623;
        class87.field1200 = var5.field3644 * var6.field3617 + var5.field3638 * var6.field3629 + var5.field3617 * var6.field3615;
        class31.field521 = var5.field3644 * var6.field3638 + var5.field3638 * var6.field3640 + var5.field3617 * var6.field3628;
        class178.field2560 = var5.field3650 * var6.field3644 + var5.field3628 * var6.field3625 + var5.field3615 * var6.field3650;
        class163.field2111 = var5.field3625 * var6.field3644 + var5.field3640 * var6.field3625 + var5.field3629 * var6.field3650;
        class451.field6572 = var5.field3625 * var6.field3617 + var5.field3640 * var6.field3629 + var5.field3629 * var6.field3615;
        float var9 = var5.field3618 * var6.field3644 + var5.field3643 * var6.field3650 + var5.field3623 * var6.field3625 + var6.field3618;
        class415.field6151 = var5.field3650 * var6.field3617 + var5.field3628 * var6.field3629 + var5.field3615 * var6.field3615;
        class65.field966 = var5.field3650 * var6.field3638 + var5.field3628 * var6.field3640 + var5.field3615 * var6.field3628;
        class209.field2953 = var5.field3644 * var6.field3644 + var5.field3638 * var6.field3625 + var5.field3617 * var6.field3650;
        class78.field1103 = var5.field3625 * var6.field3638 + var5.field3640 * var6.field3640 + var5.field3629 * var6.field3628;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field322.field7342;
        int var16 = this.field322.field7386;
        if (!this.field311) {
            this.method177(-32768);
        }
        class30.field497[0] = this.field329;
        class431.field6335[0] = this.field351;
        class30.field497[1] = this.field373;
        class141.field1850[0] = this.field389;
        class431.field6335[1] = this.field351;
        class30.field497[2] = this.field329;
        class141.field1850[1] = this.field389;
        class431.field6335[2] = this.field342;
        class30.field497[3] = this.field373;
        class141.field1850[2] = this.field389;
        class431.field6335[3] = this.field342;
        class30.field497[4] = this.field329;
        class141.field1850[3] = this.field389;
        class431.field6335[4] = this.field351;
        class30.field497[5] = this.field373;
        class141.field1850[4] = this.field385;
        class431.field6335[5] = this.field351;
        class30.field497[6] = this.field329;
        class141.field1850[5] = this.field385;
        class431.field6335[6] = this.field342;
        class141.field1850[6] = this.field385;
        class30.field497[7] = this.field373;
        class431.field6335[7] = this.field342;
        class141.field1850[7] = this.field385;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class141.field1850[var17];
            float var37 = (float) class431.field6335[var17];
            float var38 = (float) class30.field497[var17];
            float var39 = class87.field1200 * var36 + class451.field6572 * var37 + class415.field6151 * var38 + var7;
            float var40 = class209.field2953 * var36 + class178.field2560 * var38 + class163.field2111 * var37 + var9;
            float var41 = class31.field521 * var36 + class78.field1103 * var37 + class65.field966 * var38 + var8;
            if ((float) this.field322.field7430 <= var40) {
                float var42 = (float) var15 * var39 / var40 + (float) this.field322.field7402;
                if (var42 > var12) {
                    var12 = var42;
                }
                if (var11 > var42) {
                    var11 = var42;
                }
                float var43 = (float) var16 * var41 / var40 + (float) this.field322.field7375;
                var10 = true;
                if (var13 > var43) {
                    var13 = var43;
                }
                if (var14 < var43) {
                    var14 = var43;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (class372.field5577.length < this.field386) {
                class311.field4529 = new int[this.field386];
                class372.field5577 = new int[this.field386];
            }
            for (int var18 = 0; var18 < this.field338; var18++) {
                float var20 = (float) this.field371[var18];
                float var21 = (float) this.field300[var18];
                float var22 = (float) this.field393[var18];
                float var23 = class31.field521 * var21 + class78.field1103 * var20 + class65.field966 * var22 + var8;
                float var24 = class209.field2953 * var21 + class178.field2560 * var22 + class163.field2111 * var20 + var9;
                float var25 = class87.field1200 * var21 + class451.field6572 * var20 + class415.field6151 * var22 + var7;
                if (var24 >= (float) this.field322.field7430) {
                    int var26 = (int) ((float) var15 * var25 / var24 + (float) this.field322.field7402);
                    int var27 = (int) ((float) var16 * var23 / var24 + (float) this.field322.field7375);
                    int var28 = this.field354[var18];
                    int var29 = this.field354[var18 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field297[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        class372.field5577[var31] = var26;
                        class311.field4529[var31] = var27;
                    }
                } else {
                    int var32 = this.field354[var18];
                    int var33 = this.field354[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field297[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class372.field5577[this.field297[var34] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field325; var19++) {
                if (class372.field5577[this.field392[var19]] != -999999 && class372.field5577[this.field352[var19]] != -999999 && class372.field5577[this.field372[var19]] != -999999 && this.method202((byte) -72, class311.field4529[this.field392[var19]], arg1, class311.field4529[this.field352[var19]], class372.field5577[this.field352[var19]], class372.field5577[this.field392[var19]], arg0, class311.field4529[this.field372[var19]], class372.field5577[this.field372[var19]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "()[Lgq;")
    public final class339[] method185() {
        field395++;
        return this.field339;
    }

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "()I")
    public final int method186() {
        field369++;
        if (!this.field311) {
            this.method177(-32768);
        }
        return this.field389;
    }

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "()Z")
    public final boolean method187() {
        field323++;
        if (this.field344 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field344.length; var1++) {
            if (this.field344[var1] != -1 && !this.field322.field1695.method428(-14471, this.field344[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "()I")
    public final int method188() {
        field347++;
        if (!this.field311) {
            this.method177(-32768);
        }
        return this.field329;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public final void method189(int arg0) {
        field318++;
        int var2 = class323.field4731[arg0];
        int var3 = class323.field4733[arg0];
        for (int var4 = 0; var4 < this.field338; var4++) {
            int var5 = this.field371[var4] * var3 - (this.field300[var4] * var2) >> 15;
            this.field300[var4] = this.field371[var4] * var2 + this.field300[var4] * var3 >> 15;
            this.field371[var4] = var5;
        }
        this.field311 = false;
        if (this.field366 != null) {
            this.field366.field442 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lln;Z)V")
    private final void method190(class245 arg0, boolean arg1) {
        field400++;
        if (this.field386 > class372.field5577.length) {
            class311.field4529 = new int[this.field386];
            class372.field5577 = new int[this.field386];
        }
        for (int var3 = 0; var3 < this.field338; var3++) {
            int var14 = (this.field393[var3] - (this.field371[var3] * this.field322.field7444 >> 8) >> this.field322.field7319) - arg0.field3518;
            int var15 = (this.field300[var3] - (this.field371[var3] * this.field322.field7359 >> 8) >> this.field322.field7319) - arg0.field3524;
            int var16 = this.field354[var3];
            int var17 = this.field354[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field297[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class372.field5577[var19] = var14;
                class311.field4529[var19] = var15;
            }
        }
        for (int var4 = 0; var4 < this.field357; var4++) {
            if (this.field380 == null || this.field380[var4] <= 128) {
                short var5 = this.field392[var4];
                short var6 = this.field352[var4];
                short var7 = this.field372[var4];
                int var8 = class372.field5577[var5];
                int var9 = class372.field5577[var6];
                int var10 = class372.field5577[var7];
                int var11 = class311.field4529[var5];
                int var12 = class311.field4529[var6];
                int var13 = class311.field4529[var7];
                if ((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11)) > 0) {
                    arg0.method1529(var10, var8, var12, true, var9, var13, var11);
                }
            }
        }
        if (arg1) {
            this.method196();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lgs;Lla;I)V")
    public final void method191(class33 arg0, class299 arg1, int arg2) {
        field401++;
        if (this.field386 == 0) {
            return;
        }
        class252 var4 = this.field322.field7391;
        if (!this.field311) {
            this.method177(-32768);
        }
        class252 var5 = (class252) arg0;
        this.method204(var5, -52);
        class163.field2111 = var4.field3644 * var5.field3625 + var4.field3650 * var5.field3629 + var4.field3625 * var5.field3640;
        class9.field142 = var4.field3644 * var5.field3618 + var4.field3650 * var5.field3643 + var4.field3625 * var5.field3623 + var4.field3618;
        float var6 = (float) this.field351 * class163.field2111 + class9.field142;
        float var7 = (float) this.field342 * class163.field2111 + class9.field142;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field402 + var6;
            var9 = (float) (-this.field402) + var7;
        } else {
            var9 = var6 - (float) this.field402;
            var8 = (float) this.field402 + var7;
        }
        if ((var9 >= this.field322.field7357) || (var8 <= (float) this.field322.field7430)) {
            return;
        }
        class451.field6572 = var4.field3617 * var5.field3625 + var4.field3629 * var5.field3640 + var4.field3615 * var5.field3629;
        class115.field1480 = var4.field3617 * var5.field3618 + var4.field3629 * var5.field3623 + var4.field3615 * var5.field3643 + var4.field3643;
        float var10 = (float) this.field351 * class451.field6572 + class115.field1480;
        float var11 = (float) this.field342 * class451.field6572 + class115.field1480;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var13 = (var11 - (float) this.field402) * (float) this.field322.field7342;
            var12 = ((float) this.field402 + var10) * (float) this.field322.field7342;
        } else {
            var12 = ((float) this.field402 + var11) * (float) this.field322.field7342;
            var13 = ((float) (-this.field402) + var10) * (float) this.field322.field7342;
        }
        if ((this.field322.field7445 <= var13 / var8) || (var12 / var8 <= this.field322.field7389)) {
            return;
        }
        class135.field1728 = var4.field3638 * var5.field3618 + var4.field3640 * var5.field3623 + var4.field3628 * var5.field3643 + var4.field3623;
        class78.field1103 = var4.field3638 * var5.field3625 + var4.field3640 * var5.field3640 + var4.field3628 * var5.field3629;
        float var14 = (float) this.field351 * class78.field1103 + class135.field1728;
        float var15 = (float) this.field342 * class78.field1103 + class135.field1728;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) this.field402 + var14) * (float) this.field322.field7386;
            var17 = ((float) (-this.field402) + var15) * (float) this.field322.field7386;
        } else {
            var16 = ((float) this.field402 + var15) * (float) this.field322.field7386;
            var17 = ((float) (-this.field402) + var14) * (float) this.field322.field7386;
        }
        if ((var17 / var8 >= this.field322.field7435) || (this.field322.field7356 >= var16 / var8)) {
            return;
        }
        if (arg1 != null || this.field316 != null) {
            class65.field966 = var4.field3638 * var5.field3650 + var4.field3640 * var5.field3628 + var4.field3628 * var5.field3615;
            class31.field521 = var4.field3638 * var5.field3644 + var4.field3640 * var5.field3638 + var4.field3628 * var5.field3617;
            class415.field6151 = var4.field3617 * var5.field3650 + var4.field3629 * var5.field3628 + var4.field3615 * var5.field3615;
            class87.field1200 = var4.field3617 * var5.field3644 + var4.field3629 * var5.field3638 + var4.field3615 * var5.field3617;
            class209.field2953 = var4.field3644 * var5.field3644 + var4.field3650 * var5.field3617 + var4.field3625 * var5.field3638;
            class178.field2560 = var4.field3644 * var5.field3650 + var4.field3650 * var5.field3615 + var4.field3625 * var5.field3628;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field373 + this.field329 >> 1;
            int var21 = this.field389 + this.field385 >> 1;
            int var22 = (int) ((float) var21 * class87.field1200 + (float) this.field351 * class451.field6572 + (float) var20 * class415.field6151 + class115.field1480);
            int var23 = (int) ((float) var21 * class31.field521 + (float) this.field351 * class78.field1103 + (float) var20 * class65.field966 + class135.field1728);
            int var24 = (int) ((float) var21 * class209.field2953 + (float) this.field351 * class163.field2111 + (float) var20 * class178.field2560 + class9.field142);
            if (var24 >= this.field322.field7430) {
                arg1.field4345 = this.field322.field7375 + (this.field322.field7386 * var23 / var24);
                arg1.field4344 = this.field322.field7342 * var22 / var24 + this.field322.field7402;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class87.field1200 + (float) this.field342 * class451.field6572 + (float) var20 * class415.field6151 + class115.field1480);
            int var26 = (int) ((float) var21 * class31.field521 + (float) this.field342 * class78.field1103 + (float) var20 * class65.field966 + class135.field1728);
            int var27 = (int) ((float) var21 * class209.field2953 + (float) this.field342 * class163.field2111 + (float) var20 * class178.field2560 + class9.field142);
            if (var27 >= this.field322.field7430) {
                arg1.field4349 = this.field322.field7342 * var25 / var27 + this.field322.field7402;
                arg1.field4348 = this.field322.field7386 * var26 / var27 + this.field322.field7375;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field322.field7430 > var24 && this.field322.field7430 > var27) {
                    var19 = false;
                } else if (var24 < this.field322.field7430) {
                    int var28 = (var27 - this.field322.field7430 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field4344 = this.field322.field7342 * var29 / this.field322.field7430 + this.field322.field7402;
                    arg1.field4345 = this.field322.field7386 * var30 / this.field322.field7430 + this.field322.field7375;
                } else if (this.field322.field7430 > var27) {
                    int var31 = (var24 - this.field322.field7430 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field4344 = this.field322.field7342 * var32 / this.field322.field7430 + this.field322.field7402;
                    arg1.field4345 = this.field322.field7375 + (this.field322.field7386 * var33 / this.field322.field7430);
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field4347 = this.field322.field7402 + ((this.field402 + var22) * this.field322.field7342 / var24) - arg1.field4344;
                } else {
                    arg1.field4347 = (this.field402 + var25) * this.field322.field7342 / var27 + this.field322.field7402 - arg1.field4349;
                }
                arg1.field4346 = true;
            }
        }
        this.field322.method2891(8);
        this.field322.method2917(2320, var5);
        this.method192(-117);
        this.field322.method2866((byte) -104);
        this.method182(-2021565648);
    }

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "(I)V")
    private final void method192(int arg0) {
        field398++;
        if (this.field357 == 0) {
            return;
        }
        if (this.field317 != 0) {
            this.method170(true, 91);
        }
        this.method170(false, 103);
        int var2 = -20 / ((arg0 + 83) / 32);
        if (this.field404 != null) {
            if (this.field404.field4175 == null) {
                this.method209(true, (this.field317 & 0x10) != 0);
            }
            if (this.field404.field4175 != null) {
                this.field322.method2884(this.field324 != null, (byte) 101);
                this.field322.method2861(this.field320, 9149, this.field366, this.field324, this.field327);
                int var3 = this.field296.length - 1;
                for (int var4 = 0; var4 < var3; var4++) {
                    int var5 = this.field296[var4];
                    int var6 = this.field296[var4 + 1];
                    int var7 = this.field344[var5] & 0xFFFF;
                    if (var7 == 65535) {
                        var7 = -1;
                    }
                    this.field322.method2920(var7, true, this.field324 != null);
                    this.field322.method2929(0, (var6 - var5) * 3, var5 * 3, this.field404.field4175, 4);
                }
            }
        }
        this.method210(-1);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZIZLuc;Luc;)Lva;")
    private final class327 method193(int arg0, boolean arg1, int arg2, boolean arg3, class23 arg4, class23 arg5) {
        arg5.field335 = arg2;
        arg5.field299 = this.field299;
        arg5.field341 = this.field341;
        arg5.field325 = this.field325;
        arg5.field338 = this.field338;
        arg5.field357 = this.field357;
        arg5.field358 = this.field358;
        field330++;
        arg5.field317 = 0;
        arg5.field394 = this.field394;
        arg5.field386 = this.field386;
        arg5.field388 = this.field388;
        boolean var7 = class311.method1864(this.field358, arg2, arg0 + 18854);
        boolean var8 = class339.method2059(arg2, this.field358, -1);
        boolean var9 = class274.method1684(arg2, this.field358, 113);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg5.field393 = this.field393;
            } else if (arg4.field393 == null || this.field394 > arg4.field393.length) {
                arg5.field393 = arg4.field393 = new int[this.field394];
            } else {
                arg5.field393 = arg4.field393;
            }
            if (!var8) {
                arg5.field371 = this.field371;
            } else if (arg4.field371 == null || arg4.field371.length < this.field394) {
                arg5.field371 = arg4.field371 = new int[this.field394];
            } else {
                arg5.field371 = arg4.field371;
            }
            if (!var9) {
                arg5.field300 = this.field300;
            } else if (arg4.field300 == null || this.field394 > arg4.field300.length) {
                arg5.field300 = arg4.field300 = new int[this.field394];
            } else {
                arg5.field300 = arg4.field300;
            }
            for (int var11 = 0; var11 < this.field394; var11++) {
                if (var7) {
                    arg5.field393[var11] = this.field393[var11];
                }
                if (var8) {
                    arg5.field371[var11] = this.field371[var11];
                }
                if (var9) {
                    arg5.field300[var11] = this.field300[var11];
                }
            }
        } else {
            arg5.field371 = this.field371;
            arg5.field300 = this.field300;
            arg5.field393 = this.field393;
        }
        if (class466.method2729(arg2, this.field358, (byte) -115)) {
            if (arg3) {
                arg5.field317 = (byte) (arg5.field317 | 0x1);
            }
            arg5.field366 = arg4.field366;
            arg5.field366.field442 = this.field366.field442;
            arg5.field366.field440 = this.field366.field440;
        } else if (class322.method1934(this.field358, 0, arg2)) {
            arg5.field366 = this.field366;
        } else {
            arg5.field366 = null;
        }
        if (class397.method2375(540800, this.field358, arg2)) {
            if (arg4.field381 == null || arg4.field381.length < this.field325) {
                arg5.field381 = arg4.field381 = new short[this.field325];
            } else {
                arg5.field381 = arg4.field381;
            }
            for (int var12 = 0; var12 < this.field325; var12++) {
                arg5.field381[var12] = this.field381[var12];
            }
        } else {
            arg5.field381 = this.field381;
        }
        if (class294.method1778(this.field358, arg2, (byte) 70)) {
            if (arg4.field380 == null || this.field325 > arg4.field380.length) {
                arg5.field380 = arg4.field380 = new byte[this.field325];
            } else {
                arg5.field380 = arg4.field380;
            }
            for (int var13 = 0; var13 < this.field325; var13++) {
                arg5.field380[var13] = this.field380[var13];
            }
        } else {
            arg5.field380 = this.field380;
        }
        if (class56.method419(this.field358, true, arg2)) {
            if (arg3) {
                arg5.field317 = (byte) (arg5.field317 | 0x2);
            }
            arg5.field320 = arg4.field320;
            arg5.field320.field442 = this.field320.field442;
            arg5.field320.field440 = this.field320.field440;
        } else if (class169.method1064(arg2, this.field358, (byte) -67)) {
            arg5.field320 = this.field320;
        } else {
            arg5.field320 = null;
        }
        if (class235.method1430(true, this.field358, arg2)) {
            if (arg4.field333 == null || arg4.field333.length < this.field386) {
                int var14 = this.field386;
                arg5.field350 = arg4.field350 = new short[var14];
                arg5.field333 = arg4.field333 = new short[var14];
                arg5.field375 = arg4.field375 = new short[var14];
            } else {
                arg5.field350 = arg4.field350;
                arg5.field375 = arg4.field375;
                arg5.field333 = arg4.field333;
            }
            if (this.field403 == null) {
                for (int var15 = 0; var15 < this.field386; var15++) {
                    arg5.field333[var15] = this.field333[var15];
                    arg5.field375[var15] = this.field375[var15];
                    arg5.field350[var15] = this.field350[var15];
                }
            } else {
                if (arg4.field403 == null) {
                    arg4.field403 = new class409();
                }
                class409 var16 = arg5.field403 = arg4.field403;
                if (var16.field5993 == null || this.field386 > var16.field5993.length) {
                    int var17 = this.field386;
                    var16.field5990 = new short[var17];
                    var16.field5993 = new short[var17];
                    var16.field5991 = new short[var17];
                    var16.field5995 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field386; var18++) {
                    arg5.field333[var18] = this.field333[var18];
                    arg5.field375[var18] = this.field375[var18];
                    arg5.field350[var18] = this.field350[var18];
                    var16.field5993[var18] = this.field403.field5993[var18];
                    var16.field5991[var18] = this.field403.field5991[var18];
                    var16.field5990[var18] = this.field403.field5990[var18];
                    var16.field5995[var18] = this.field403.field5995[var18];
                }
            }
            arg5.field374 = this.field374;
        } else {
            arg5.field403 = this.field403;
            arg5.field350 = this.field350;
            arg5.field375 = this.field375;
            arg5.field333 = this.field333;
            arg5.field374 = this.field374;
        }
        if (class209.method1293(this.field358, -81, arg2)) {
            arg5.field324 = arg4.field324;
            if (arg3) {
                arg5.field317 = (byte) (arg5.field317 | 0x4);
            }
            arg5.field324.field440 = this.field324.field440;
            arg5.field324.field442 = this.field324.field442;
        } else if (class157.method1005((byte) 74, arg2, this.field358)) {
            arg5.field324 = this.field324;
        } else {
            arg5.field324 = null;
        }
        if (arg0 != -18979) {
            this.field363 = null;
        }
        if (class235.method1427(-24, arg2, this.field358)) {
            if (arg4.field331 == null || arg4.field331.length < this.field325) {
                int var19 = this.field386;
                arg5.field346 = arg4.field346 = new float[var19];
                arg5.field331 = arg4.field331 = new float[var19];
            } else {
                arg5.field331 = arg4.field331;
                arg5.field346 = arg4.field346;
            }
            for (int var20 = 0; var20 < this.field386; var20++) {
                arg5.field331[var20] = this.field331[var20];
                arg5.field346[var20] = this.field346[var20];
            }
        } else {
            arg5.field346 = this.field346;
            arg5.field331 = this.field331;
        }
        if (class147.method912(this.field358, arg2, (byte) 96)) {
            if (arg3) {
                arg5.field317 = (byte) (arg5.field317 | 0x8);
            }
            arg5.field327 = arg4.field327;
            arg5.field327.field440 = this.field327.field440;
            arg5.field327.field442 = this.field327.field442;
        } else if (class235.method1429(this.field358, (byte) 120, arg2)) {
            arg5.field327 = this.field327;
        } else {
            arg5.field327 = null;
        }
        if (class164.method1041(arg2, false, this.field358)) {
            if (arg4.field392 == null || this.field325 > arg4.field392.length) {
                int var21 = this.field325;
                arg5.field392 = arg4.field392 = new short[var21];
                arg5.field352 = arg4.field352 = new short[var21];
                arg5.field372 = arg4.field372 = new short[var21];
            } else {
                arg5.field352 = arg4.field352;
                arg5.field392 = arg4.field392;
                arg5.field372 = arg4.field372;
            }
            for (int var22 = 0; var22 < this.field325; var22++) {
                arg5.field392[var22] = this.field392[var22];
                arg5.field352[var22] = this.field352[var22];
                arg5.field372[var22] = this.field372[var22];
            }
        } else {
            arg5.field372 = this.field372;
            arg5.field352 = this.field352;
            arg5.field392 = this.field392;
        }
        if (class490.method2947((byte) 124, arg2, this.field358)) {
            arg5.field404 = arg4.field404;
            if (arg3) {
                arg5.field317 = (byte) (arg5.field317 | 0x10);
            }
            arg5.field404.field4175 = this.field404.field4175;
        } else if (class226.method1394(0, this.field358, arg2)) {
            arg5.field404 = this.field404;
        } else {
            arg5.field404 = null;
        }
        if (class455.method2656((byte) -85, arg2, this.field358)) {
            if (arg4.field344 == null || arg4.field344.length < this.field325) {
                int var23 = this.field325;
                arg5.field344 = arg4.field344 = new short[var23];
            } else {
                arg5.field344 = arg4.field344;
            }
            for (int var24 = 0; var24 < this.field325; var24++) {
                arg5.field344[var24] = this.field344[var24];
            }
        } else {
            arg5.field344 = this.field344;
        }
        if (!class179.method1139(this.field358, 8765, arg2)) {
            arg5.field360 = this.field360;
        } else if (arg4.field360 == null || this.field341 > arg4.field360.length) {
            int var26 = this.field341;
            arg5.field360 = arg4.field360 = new class460[var26];
            for (int var27 = 0; var27 < this.field341; var27++) {
                arg5.field360[var27] = this.field360[var27].method2676(false);
            }
        } else {
            arg5.field360 = arg4.field360;
            for (int var25 = 0; var25 < this.field341; var25++) {
                arg5.field360[var25].method2675(77, this.field360[var25]);
            }
        }
        arg5.field391 = this.field391;
        if (this.field311) {
            arg5.field385 = this.field385;
            arg5.field389 = this.field389;
            arg5.field311 = true;
            arg5.field402 = this.field402;
            arg5.field373 = this.field373;
            arg5.field342 = this.field342;
            arg5.field351 = this.field351;
            arg5.field329 = this.field329;
        } else {
            arg5.field311 = false;
        }
        arg5.field363 = this.field363;
        arg5.field328 = this.field328;
        arg5.field354 = this.field354;
        arg5.field387 = this.field387;
        arg5.field337 = this.field337;
        arg5.field296 = this.field296;
        arg5.field316 = this.field316;
        arg5.field339 = this.field339;
        arg5.field301 = this.field301;
        arg5.field297 = this.field297;
        return arg5;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BIZ)Lva;")
    public final class327 method194(byte arg0, int arg1, boolean arg2) {
        field376++;
        class23 var4;
        class23 var5;
        if (arg0 == 1) {
            var5 = this.field322.field7379;
            var4 = this.field322.field7461;
        } else if (arg0 == 2) {
            var4 = this.field322.field7377;
            var5 = this.field322.field7384;
        } else if (arg0 == 3) {
            var4 = this.field322.field7392;
            var5 = this.field322.field7416;
        } else if (arg0 == 4) {
            var5 = this.field322.field7446;
            var4 = this.field322.field7443;
        } else if (arg0 == 5) {
            var4 = this.field322.field7426;
            var5 = this.field322.field7361;
        } else {
            var5 = var4 = new class23(this.field322);
        }
        return this.method193(-18979, arg2, arg1, arg0 != 0, var4, var5);
    }

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "()I")
    public final int method195() {
        if (!this.field311) {
            this.method177(-32768);
        }
        field397++;
        return this.field351;
    }

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "()I")
    public final int method196() {
        if (!this.field311) {
            this.method177(-32768);
        }
        field365++;
        return this.field402;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method197(int arg0) {
        this.field335 = arg0;
        field313++;
        if (this.field403 != null && (this.field335 & 0x10000) == 0) {
            this.field375 = this.field403.field5991;
            this.field374 = this.field403.field5995;
            this.field333 = this.field403.field5993;
            this.field350 = this.field403.field5990;
            this.field403 = null;
        }
        this.field305 = true;
        this.method210(-1);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[IIIIZI[I)V")
    public final void method198(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field399++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            class492.field7520 = 0;
            class478.field6885 = 0;
            class211.field2989 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field387.length > var15) {
                    int[] var16 = this.field387[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field363 == null || (this.field363[var18] & arg6) != 0) {
                            class478.field6885 += this.field393[var18];
                            class211.field2989 += this.field371[var18];
                            class492.field7520 += this.field300[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class211.field2989 = class211.field2989 / var13 + var11;
                class144.field1864 = true;
                class492.field7520 = class492.field7520 / var13 + var12;
                class478.field6885 = class478.field6885 / var13 + var10;
            } else {
                class211.field2989 = var11;
                class478.field6885 = var10;
                class492.field7520 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + (arg7[7] * arg3 - -16384) >> 15;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field387.length > var26) {
                    int[] var27 = this.field387[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field363 == null || (arg6 & this.field363[var29]) != 0) {
                            this.field393[var29] += var23;
                            this.field371[var29] += var24;
                            this.field300[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field387.length > var109) {
                        int[] var110 = this.field387[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field363 == null || (this.field363[var112] & arg6) != 0) {
                                this.field393[var112] -= class478.field6885;
                                this.field371[var112] -= class211.field2989;
                                this.field300[var112] -= class492.field7520;
                                if (arg4 != 0) {
                                    int var113 = class323.field4731[arg4];
                                    int var114 = class323.field4733[arg4];
                                    int var115 = this.field393[var112] * var114 + this.field371[var112] * var113 + 32767 >> 15;
                                    this.field371[var112] = this.field371[var112] * var114 + 32767 - (this.field393[var112] * var113) >> 15;
                                    this.field393[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class323.field4731[arg2];
                                    int var117 = class323.field4733[arg2];
                                    int var118 = this.field371[var112] * var117 - (this.field300[var112] * var116 - 32767) >> 15;
                                    this.field300[var112] = this.field371[var112] * var116 + (this.field300[var112] * var117) + 32767 >> 15;
                                    this.field371[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class323.field4731[arg3];
                                    int var120 = class323.field4733[arg3];
                                    int var121 = this.field393[var112] * var120 + this.field300[var112] * var119 + 32767 >> 15;
                                    this.field300[var112] = this.field300[var112] * var120 - (this.field393[var112] * var119 - 32767) >> 15;
                                    this.field393[var112] = var121;
                                }
                                this.field393[var112] += class478.field6885;
                                this.field371[var112] += class211.field2989;
                                this.field300[var112] += class492.field7520;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field387.length > var92) {
                            int[] var93 = this.field387[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field363 == null || (arg6 & this.field363[var95]) != 0) {
                                    int var96 = this.field354[var95];
                                    int var97 = this.field354[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field297[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class323.field4731[arg4];
                                            int var101 = class323.field4733[arg4];
                                            int var102 = this.field333[var99] * var101 + this.field375[var99] * var100 + 32767 >> 15;
                                            this.field375[var99] = (short) (this.field375[var99] * var101 + 32767 - (this.field333[var99] * var100) >> 15);
                                            this.field333[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class323.field4731[arg2];
                                            int var104 = class323.field4733[arg2];
                                            int var105 = this.field375[var99] * var104 + 32767 - (this.field350[var99] * var103) >> 15;
                                            this.field350[var99] = (short) (this.field375[var99] * var103 + this.field350[var99] * var104 + 32767 >> 15);
                                            this.field375[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class323.field4731[arg3];
                                            int var107 = class323.field4733[arg3];
                                            int var108 = this.field350[var99] * var106 + this.field333[var99] * var107 + 32767 >> 15;
                                            this.field350[var99] = (short) (this.field350[var99] * var107 + 32767 - (this.field333[var99] * var106) >> 15);
                                            this.field333[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field324 == null && this.field320 != null) {
                        this.field320.field442 = null;
                    }
                    if (this.field324 != null) {
                        this.field324.field442 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class144.field1864) {
                    int var36 = arg7[6] * class492.field7520 + arg7[0] * class478.field6885 - (-(arg7[3] * class211.field2989) - 16384) >> 15;
                    int var37 = arg7[7] * class492.field7520 + arg7[4] * class211.field2989 + arg7[1] * class478.field6885 + 16384 >> 15;
                    int var38 = var33 + var36;
                    int var39 = arg7[2] * class478.field6885 + arg7[8] * class492.field7520 + arg7[5] * class211.field2989 + 16384 >> 15;
                    int var40 = var34 + var37;
                    int var41 = var35 + var39;
                    class478.field6885 = var38;
                    class211.field2989 = var40;
                    class492.field7520 = var41;
                    class144.field1864 = false;
                }
                int[] var42 = new int[9];
                int var43 = class323.field4733[arg2];
                int var44 = class323.field4731[arg2];
                int var45 = class323.field4733[arg3];
                int var46 = class323.field4731[arg3];
                int var47 = class323.field4733[arg4];
                int var48 = class323.field4731[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[6] = -var46 * var47 + (var45 * var50) + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[0] = var46 * var50 + var45 * var47 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[5] = -var44;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[1] = -var45 * var48 + (var46 * var49 + 16384) >> 15;
                int var51 = var42[0] * -class478.field6885 + (var42[2] * -class492.field7520) + var42[1] * -class211.field2989 + 16384 >> 15;
                int var52 = var42[3] * -class478.field6885 + (var42[4] * -class211.field2989) + var42[5] * -class492.field7520 + 16384 >> 15;
                int var53 = var42[6] * -class478.field6885 + (var42[7] * -class211.field2989) - (-(var42[8] * -class492.field7520) - 16384) >> 15;
                int var54 = class478.field6885 + var51;
                int var55 = class211.field2989 + var52;
                int var56 = class492.field7520 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[2] * var35 + (var42[0] * var33 + (var42[1] * var34)) + 16384 >> 15;
                int var60 = var42[3] * var33 + var42[4] * var34 + var42[5] * var35 + 16384 >> 15;
                int var61 = var55 + var60;
                int var62 = var42[6] * var33 + (var42[7] * var34) + (var42[8] * var35) + 16384 >> 15;
                int var63 = var54 + var59;
                int var64 = var56 + var62;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[2] * var64 + arg7[1] * var61 + arg7[0] * var63 + 16384 >> 15;
                int var68 = arg7[3] * var63 + arg7[4] * var61 + (arg7[5] * var64) + 16384 >> 15;
                int var69 = var30 + var67;
                int var70 = var31 + var68;
                int var71 = arg7[6] * var63 + arg7[7] * var61 + arg7[8] * var64 + 16384 >> 15;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field387.length) {
                        int[] var75 = this.field387[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field363 == null || (arg6 & this.field363[var77]) != 0) {
                                int var78 = this.field300[var77] * var65[2] + (this.field393[var77] * var65[0] + (this.field371[var77] * var65[1])) + 16384 >> 15;
                                int var79 = this.field371[var77] * var65[4] + this.field393[var77] * var65[3] + this.field300[var77] * var65[5] + 16384 >> 15;
                                int var80 = var70 + var79;
                                int var81 = var69 + var78;
                                int var82 = this.field393[var77] * var65[6] + 16384 - (-(this.field371[var77] * var65[7]) + -(this.field300[var77] * var65[8])) >> 15;
                                int var83 = var72 + var82;
                                this.field393[var77] = var81;
                                this.field371[var77] = var80;
                                this.field300[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field387.length > var173) {
                        int[] var174 = this.field387[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field363 == null || (this.field363[var176] & arg6) != 0) {
                                this.field393[var176] -= class478.field6885;
                                this.field371[var176] -= class211.field2989;
                                this.field300[var176] -= class492.field7520;
                                this.field393[var176] = this.field393[var176] * arg2 >> 7;
                                this.field371[var176] = this.field371[var176] * arg3 >> 7;
                                this.field300[var176] = this.field300[var176] * arg4 >> 7;
                                this.field393[var176] += class478.field6885;
                                this.field371[var176] += class211.field2989;
                                this.field300[var176] += class492.field7520;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (class144.field1864) {
                    int var128 = arg7[3] * class211.field2989 + arg7[6] * class492.field7520 + arg7[0] * class478.field6885 + 16384 >> 15;
                    int var129 = arg7[1] * class478.field6885 + arg7[4] * class211.field2989 + arg7[7] * class492.field7520 + 16384 >> 15;
                    int var130 = var126 + var129;
                    int var131 = arg7[8] * class492.field7520 + arg7[5] * class211.field2989 + arg7[2] * class478.field6885 + 16384 >> 15;
                    int var132 = var125 + var128;
                    class478.field6885 = var132;
                    class211.field2989 = var130;
                    int var133 = var127 + var131;
                    class492.field7520 = var133;
                    class144.field1864 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class478.field6885 * var134 + 16384 >> 15;
                int var138 = -class211.field2989 * var135 + 16384 >> 15;
                int var139 = -class492.field7520 * var136 + 16384 >> 15;
                int var140 = var137 + class478.field6885;
                int var141 = var138 + class211.field2989;
                int var142 = class492.field7520 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var141 + var145;
                int var147 = var127 * var136 + 16384 >> 15;
                int var148 = var140 + var144;
                int var149 = var142 + var147;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 16384 >> 15;
                    }
                }
                int var152 = arg7[0] * var148 + arg7[2] * var149 + arg7[1] * var146 + 16384 >> 15;
                int var153 = arg7[5] * var149 + arg7[4] * var146 + arg7[3] * var148 + 16384 >> 15;
                int var154 = var123 + var153;
                int var155 = arg7[6] * var148 + (arg7[7] * var146) - (-(arg7[8] * var149) - 16384) >> 15;
                int var156 = var122 + var152;
                int var157 = var124 + var155;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field387.length > var159) {
                        int[] var160 = this.field387[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field363 == null || (arg6 & this.field363[var162]) != 0) {
                                int var163 = this.field393[var162] * var150[0] + this.field371[var162] * var150[1] - (-(this.field300[var162] * var150[2]) + -16384) >> 15;
                                int var164 = this.field393[var162] * var150[3] + this.field371[var162] * var150[4] + this.field300[var162] * var150[5] + 16384 >> 15;
                                int var165 = this.field393[var162] * var150[6] + this.field300[var162] * var150[8] + this.field371[var162] * var150[7] + 16384 >> 15;
                                int var166 = var154 + var164;
                                int var167 = var156 + var163;
                                int var168 = var157 + var165;
                                this.field393[var162] = var167;
                                this.field371[var162] = var166;
                                this.field300[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field328 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field328.length > var181) {
                        int[] var182 = this.field328[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field337 == null || (arg6 & this.field337[var184]) != 0) {
                                int var185 = (this.field380[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field380[var184] = (byte) var185;
                                if (this.field320 != null) {
                                    this.field320.field442 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field316 != null) {
                    for (int var178 = 0; var178 < this.field341; var178++) {
                        class190 var179 = this.field316[var178];
                        class460 var180 = this.field360[var178];
                        var180.field6687 = 255 - (this.field380[var179.field2695] & 0xFF) << 24 | var180.field6687 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field328 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field328.length > var190) {
                        int[] var191 = this.field328[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field337 == null || (this.field337[var193] & arg6) != 0) {
                                int var194 = this.field381[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
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
                                this.field381[var193] = (short) class51.method379(class51.method379(var199 << 7, var197 << 10), var200);
                                if (this.field320 != null) {
                                    this.field320.field442 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field316 != null) {
                    for (int var187 = 0; var187 < this.field341; var187++) {
                        class190 var188 = this.field316[var187];
                        class460 var189 = this.field360[var187];
                        var189.field6687 = var189.field6687 & 0xFF000000 | class31.field518[this.field381[var188.field2695] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field391 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field391.length) {
                        int[] var203 = this.field391[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class460 var205 = this.field360[var203[var204]];
                            var205.field6695 += arg3;
                            var205.field6690 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field391 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field391.length) {
                        int[] var208 = this.field391[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class460 var210 = this.field360[var208[var209]];
                            var210.field6692 = var210.field6692 * arg3 >> 7;
                            var210.field6689 = var210.field6689 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field391 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field391.length) {
                    int[] var213 = this.field391[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class460 var215 = this.field360[var213[var214]];
                        var215.field6688 = var215.field6688 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method199(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field332++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            class478.field6885 = 0;
            int var12 = 0;
            class492.field7520 = 0;
            class211.field2989 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field387.length) {
                    int[] var15 = this.field387[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class478.field6885 += this.field393[var17];
                        class211.field2989 += this.field371[var17];
                        var12++;
                        class492.field7520 += this.field300[var17];
                    }
                }
            }
            if (var12 > 0) {
                class478.field6885 = class478.field6885 / var12 + var10;
                class211.field2989 = class211.field2989 / var12 + var9;
                class492.field7520 = class492.field7520 / var12 + var11;
            } else {
                class211.field2989 = var9;
                class478.field6885 = var10;
                class492.field7520 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field387.length) {
                    int[] var23 = this.field387[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field393[var25] += var19;
                        this.field371[var25] += var20;
                        this.field300[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field387.length) {
                    int[] var46 = this.field387[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field393[var48] -= class478.field6885;
                            this.field371[var48] -= class211.field2989;
                            this.field300[var48] -= class492.field7520;
                            if (arg4 != 0) {
                                int var49 = class323.field4731[arg4];
                                int var50 = class323.field4733[arg4];
                                int var51 = this.field393[var48] * var50 + this.field371[var48] * var49 + 32767 >> 15;
                                this.field371[var48] = this.field371[var48] * var50 + 32767 - (this.field393[var48] * var49) >> 15;
                                this.field393[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class323.field4731[arg2];
                                int var53 = class323.field4733[arg2];
                                int var54 = this.field371[var48] * var53 + 32767 - (this.field300[var48] * var52) >> 15;
                                this.field300[var48] = this.field300[var48] * var53 + this.field371[var48] * var52 + 32767 >> 15;
                                this.field371[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class323.field4731[arg3];
                                int var56 = class323.field4733[arg3];
                                int var57 = this.field393[var48] * var56 + (this.field300[var48] * var55 + 32767) >> 15;
                                this.field300[var48] = this.field300[var48] * var56 + 32767 - (this.field393[var48] * var55) >> 15;
                                this.field393[var48] = var57;
                            }
                            this.field393[var48] += class478.field6885;
                            this.field371[var48] += class211.field2989;
                            this.field300[var48] += class492.field7520;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field393[var59] -= class478.field6885;
                            this.field371[var59] -= class211.field2989;
                            this.field300[var59] -= class492.field7520;
                            if (arg2 != 0) {
                                int var60 = class323.field4731[arg2];
                                int var61 = class323.field4733[arg2];
                                int var62 = this.field371[var59] * var61 + 32767 - (this.field300[var59] * var60) >> 15;
                                this.field300[var59] = this.field371[var59] * var60 + this.field300[var59] * var61 + 32767 >> 15;
                                this.field371[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class323.field4731[arg4];
                                int var64 = class323.field4733[arg4];
                                int var65 = this.field371[var59] * var63 + this.field393[var59] * var64 + 32767 >> 15;
                                this.field371[var59] = this.field371[var59] * var64 + 32767 - (this.field393[var59] * var63) >> 15;
                                this.field393[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class323.field4731[arg3];
                                int var67 = class323.field4733[arg3];
                                int var68 = this.field393[var59] * var67 + this.field300[var59] * var66 + 32767 >> 15;
                                this.field300[var59] = this.field300[var59] * var67 + 32767 - (this.field393[var59] * var66) >> 15;
                                this.field393[var59] = var68;
                            }
                            this.field393[var59] += class478.field6885;
                            this.field371[var59] += class211.field2989;
                            this.field300[var59] += class492.field7520;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field387.length > var28) {
                        int[] var29 = this.field387[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field354[var31];
                            int var33 = this.field354[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field297[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class323.field4731[arg4];
                                    int var37 = class323.field4733[arg4];
                                    int var38 = this.field375[var35] * var36 + (this.field333[var35] * var37 + 32767) >> 15;
                                    this.field375[var35] = (short) (this.field375[var35] * var37 + 32767 - (this.field333[var35] * var36) >> 15);
                                    this.field333[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class323.field4731[arg2];
                                    int var40 = class323.field4733[arg2];
                                    int var41 = this.field375[var35] * var40 + 32767 - (this.field350[var35] * var39) >> 15;
                                    this.field350[var35] = (short) (this.field375[var35] * var39 + this.field350[var35] * var40 + 32767 >> 15);
                                    this.field375[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class323.field4731[arg3];
                                    int var43 = class323.field4733[arg3];
                                    int var44 = this.field350[var35] * var42 - (-(this.field333[var35] * var43) - 32767) >> 15;
                                    this.field350[var35] = (short) (this.field350[var35] * var43 + 32767 - (this.field333[var35] * var42) >> 15);
                                    this.field333[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field324 == null && this.field320 != null) {
                    this.field320.field442 = null;
                }
                if (this.field324 != null) {
                    this.field324.field442 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field387.length) {
                    int[] var71 = this.field387[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field393[var73] -= class478.field6885;
                        this.field371[var73] -= class211.field2989;
                        this.field300[var73] -= class492.field7520;
                        this.field393[var73] = this.field393[var73] * arg2 >> 7;
                        this.field371[var73] = this.field371[var73] * arg3 >> 7;
                        this.field300[var73] = this.field300[var73] * arg4 >> 7;
                        this.field393[var73] += class478.field6885;
                        this.field371[var73] += class211.field2989;
                        this.field300[var73] += class492.field7520;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field328 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field328.length) {
                        int[] var79 = this.field328[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field380[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field380[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field320 != null) {
                            this.field320.field442 = null;
                        }
                    }
                }
                if (this.field316 != null) {
                    for (int var75 = 0; var75 < this.field341; var75++) {
                        class190 var76 = this.field316[var75];
                        class460 var77 = this.field360[var75];
                        var77.field6687 = var77.field6687 & 0xFFFFFF | 255 - (this.field380[var76.field2695] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field328 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field328.length > var87) {
                        int[] var88 = this.field328[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field381[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3CB) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = var91 & 0x7F;
                            int var96 = arg2 + var92 & 0x3F;
                            int var97 = arg4 + var95;
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
                            this.field381[var90] = (short) class51.method379(class51.method379(var94 << 7, var96 << 10), var97);
                        }
                        if (var88.length > 0 && this.field320 != null) {
                            this.field320.field442 = null;
                        }
                    }
                }
                if (this.field316 != null) {
                    for (int var84 = 0; var84 < this.field341; var84++) {
                        class190 var85 = this.field316[var84];
                        class460 var86 = this.field360[var84];
                        var86.field6687 = var86.field6687 & 0xFF000000 | class31.field518[this.field381[var85.field2695] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field391 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field391.length) {
                        int[] var100 = this.field391[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class460 var102 = this.field360[var100[var101]];
                            var102.field6695 += arg3;
                            var102.field6690 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field391 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field391.length > var104) {
                        int[] var105 = this.field391[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class460 var107 = this.field360[var105[var106]];
                            var107.field6692 = var107.field6692 * arg3 >> 7;
                            var107.field6689 = var107.field6689 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field391 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field391.length) {
                    int[] var110 = this.field391[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class460 var112 = this.field360[var110[var111]];
                        var112.field6688 = var112.field6688 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "()I")
    public final int method200() {
        field367++;
        return this.field335;
    }

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "()I")
    public final int method201() {
        field353++;
        return this.field299;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BIIIIIIII)Z")
    private final boolean method202(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field361++;
        if (arg2 < arg1 && arg2 < arg3 && arg2 < arg7) {
            return false;
        } else if (arg1 < arg2 && arg3 < arg2 && arg2 > arg7) {
            return false;
        } else if (arg6 < arg5 && arg6 < arg4 && arg8 > arg6) {
            return false;
        } else if (arg6 > arg5 && arg6 > arg4 && arg6 > arg8) {
            return false;
        } else {
            if (arg0 != -72) {
                this.field388 = -101;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()[Lin;")
    public final class56[] method203() {
        field355++;
        return this.field301;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lml;I)V")
    private final void method204(class252 arg0, int arg1) {
        if (this.field301 != null) {
            for (int var3 = 0; var3 < this.field301.length; var3++) {
                class56 var4 = this.field301[var3];
                class56 var5 = var4;
                if (var4.field859 != null) {
                    var5 = var4.field859;
                }
                var5.field861 = (int) ((float) this.field300[var4.field863] * arg0.field3617 + (float) this.field393[var4.field863] * arg0.field3615 + (float) this.field371[var4.field863] * arg0.field3629 + arg0.field3643);
                var5.field860 = (int) ((float) this.field300[var4.field863] * arg0.field3638 + (float) this.field393[var4.field863] * arg0.field3628 + (float) this.field371[var4.field863] * arg0.field3640 + arg0.field3623);
                var5.field872 = (int) ((float) this.field300[var4.field863] * arg0.field3644 + (float) this.field393[var4.field863] * arg0.field3650 + (float) this.field371[var4.field863] * arg0.field3625 + arg0.field3618);
                var5.field870 = (int) ((float) this.field300[var4.field875] * arg0.field3617 + (float) this.field393[var4.field875] * arg0.field3615 + (float) this.field371[var4.field875] * arg0.field3629 + arg0.field3643);
                var5.field862 = (int) ((float) this.field300[var4.field875] * arg0.field3638 + (float) this.field393[var4.field875] * arg0.field3628 + (float) this.field371[var4.field875] * arg0.field3640 + arg0.field3623);
                var5.field866 = (int) ((float) this.field300[var4.field875] * arg0.field3644 + (float) this.field393[var4.field875] * arg0.field3650 + (float) this.field371[var4.field875] * arg0.field3625 + arg0.field3618);
                var5.field864 = (int) ((float) this.field300[var4.field876] * arg0.field3617 + (float) this.field393[var4.field876] * arg0.field3615 + (float) this.field371[var4.field876] * arg0.field3629 + arg0.field3643);
                var5.field868 = (int) ((float) this.field300[var4.field876] * arg0.field3638 + (float) this.field393[var4.field876] * arg0.field3628 + (float) this.field371[var4.field876] * arg0.field3640 + arg0.field3623);
                var5.field874 = (int) ((float) this.field300[var4.field876] * arg0.field3644 + (float) this.field393[var4.field876] * arg0.field3650 + (float) this.field371[var4.field876] * arg0.field3625 + arg0.field3618);
            }
        }
        field309++;
        if (this.field339 != null) {
            for (int var6 = 0; var6 < this.field339.length; var6++) {
                class339 var7 = this.field339[var6];
                class339 var8 = var7;
                if (var7.field4931 != null) {
                    var8 = var7.field4931;
                }
                if (var7.field4940 == null) {
                    var7.field4940 = arg0.method1578();
                } else {
                    var7.field4940.method266(arg0);
                }
                var8.field4938 = (int) ((float) this.field300[var7.field4933] * arg0.field3617 + (float) this.field393[var7.field4933] * arg0.field3615 + (float) this.field371[var7.field4933] * arg0.field3629 + arg0.field3643);
                var8.field4939 = (int) ((float) this.field300[var7.field4933] * arg0.field3638 + (float) this.field393[var7.field4933] * arg0.field3628 + (float) this.field371[var7.field4933] * arg0.field3640 + arg0.field3623);
                var8.field4936 = (int) ((float) this.field300[var7.field4933] * arg0.field3644 + (float) this.field393[var7.field4933] * arg0.field3650 + (float) this.field371[var7.field4933] * arg0.field3625 + arg0.field3618);
            }
        }
        if (arg1 > -21) {
            this.method167();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILdd;FIFIFFFII)[B")
    public static final byte[] method205(int arg0, class477 arg1, float arg2, int arg3, float arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10) {
        field384++;
        byte[] var11 = new byte[arg5 * arg9 * arg0];
        class127.method709(arg0, arg7, var11, arg2, arg4, arg10, arg8, arg9, arg5, 0, 0, arg1, arg6);
        return arg3 < 94 ? null : var11;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()I")
    public final int method206() {
        field310++;
        return this.field388;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public final void method207(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field338; var4++) {
            if (arg0 != 0) {
                this.field393[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field371[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field300[var4] += arg2;
            }
        }
        field390++;
        this.field311 = false;
        if (this.field366 != null) {
            this.field366.field442 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "()I")
    public final int method208() {
        if (!this.field311) {
            this.method177(-32768);
        }
        field319++;
        return this.field373;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZ)V")
    private final void method209(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field389 = 34;
        }
        field370++;
        if ((this.field357 * 6) <= class66.field982.field2041.length) {
            class66.field982.field2018 = 0;
        } else {
            class66.field982 = new class269(this.field357 * 6 + 600);
        }
        if (this.field322.field7350) {
            for (int var4 = 0; var4 < this.field357; var4++) {
                class66.field982.method961(this.field392[var4], 1608339368);
                class66.field982.method961(this.field352[var4], 1608339368);
                class66.field982.method961(this.field372[var4], 1608339368);
            }
        } else {
            for (int var3 = 0; var3 < this.field357; var3++) {
                class66.field982.method988(this.field392[var3], -461070776);
                class66.field982.method988(this.field352[var3], -461070776);
                class66.field982.method988(this.field372[var3], -461070776);
            }
        }
        if (class66.field982.field2018 == 0) {
            return;
        }
        if (arg1) {
            if (this.field336 == null) {
                this.field336 = this.field322.method2910(5123, true, class66.field982.field2041, class66.field982.field2018, 768);
            } else {
                this.field336.method891(5123, -4520, class66.field982.field2041, class66.field982.field2018);
            }
            this.field404.field4175 = this.field336;
        } else {
            this.field404.field4175 = this.field322.method2910(5123, false, class66.field982.field2041, class66.field982.field2018, 768);
        }
        if (!arg1) {
            this.field305 = true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "(I)V")
    private final void method210(int arg0) {
        field379++;
        if (!this.field305) {
            return;
        }
        this.field305 = false;
        if (this.field301 == null && this.field339 == null && this.field316 == null) {
            if (this.field393 != null && !class330.method1987(true, this.field358, this.field335)) {
                if (this.field366 != null && this.field366.field442 == null) {
                    this.field305 = true;
                } else {
                    if (!this.field311) {
                        this.method177(-32768);
                    }
                    this.field393 = null;
                }
            }
            if (this.field371 != null && !class465.method2722(this.field335, (byte) 127, this.field358)) {
                if (this.field366 != null && this.field366.field442 == null) {
                    this.field305 = true;
                } else {
                    if (!this.field311) {
                        this.method177(-32768);
                    }
                    this.field371 = null;
                }
            }
            if (this.field300 != null && !class274.method1681(this.field335, this.field358, -127)) {
                if (this.field366 != null && this.field366.field442 == null) {
                    this.field305 = true;
                } else {
                    if (!this.field311) {
                        this.method177(-32768);
                    }
                    this.field300 = null;
                }
            }
        }
        if (this.field297 != null && this.field393 == null && this.field371 == null && this.field300 == null) {
            this.field354 = null;
            this.field297 = null;
        }
        if (this.field374 != null && !class475.method2778(this.field335, (byte) 84, this.field358)) {
            if (this.field324 == null) {
                if (this.field320 != null && this.field320.field442 == null) {
                    this.field305 = true;
                } else {
                    this.field374 = null;
                    this.field333 = this.field375 = this.field350 = null;
                }
            } else if (this.field324.field442 == null) {
                this.field305 = true;
            } else {
                this.field333 = this.field375 = this.field350 = null;
                this.field374 = null;
            }
        }
        if (this.field381 != null && !class226.method1395(this.field358, -128, this.field335)) {
            if (this.field320 != null && this.field320.field442 == null) {
                this.field305 = true;
            } else {
                this.field381 = null;
            }
        }
        if (this.field380 != null && !class254.method1594((byte) 106, this.field335, this.field358)) {
            if (this.field320 != null && this.field320.field442 == null) {
                this.field305 = true;
            } else {
                this.field380 = null;
            }
        }
        if (this.field331 != null && !class194.method1217(this.field358, (byte) 75, this.field335)) {
            if (this.field327 != null && this.field327.field442 == null) {
                this.field305 = true;
            } else {
                this.field331 = this.field346 = null;
            }
        }
        if (this.field344 != null && !class203.method1249(this.field335, this.field358, 0)) {
            if (this.field320 != null && this.field320.field442 == null) {
                this.field305 = true;
            } else {
                this.field344 = null;
            }
        }
        if (this.field392 != null && !class272.method1663(this.field335, true, this.field358)) {
            if ((this.field404 == null || this.field404.field4175 != null) && (this.field320 == null || this.field320.field442 != null)) {
                this.field392 = this.field352 = this.field372 = null;
            } else {
                this.field305 = true;
            }
        }
        if (this.field328 != null && !class8.method66(arg0 + 385, this.field358, this.field335)) {
            this.field337 = null;
            this.field328 = null;
        }
        if (this.field387 != null && !class372.method2264(this.field335, this.field358, (byte) 110)) {
            this.field363 = null;
            this.field387 = null;
        }
        if (this.field391 != null && !class489.method2940(this.field358, this.field335, (byte) 116)) {
            this.field391 = null;
        }
        if (this.field296 != null && (this.field335 & 0x800) == 0 && (this.field335 & 0x40000) == 0) {
            this.field296 = null;
        }
        if (arg0 != -1) {
            this.method197(47);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lrl;)V")
    public class23(class487 arg0) {
        this.field322 = arg0;
        this.field366 = new class27(this.field322, null, 5126, 3, 0);
        this.field327 = new class27(this.field322, null, 5126, 2, 0);
        this.field324 = new class27(this.field322, null, 5126, 3, 0);
        this.field320 = new class27(this.field322, null, 5121, 4, 0);
        this.field404 = new class293();
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lrl;Lfl;IIII)V")
    public class23(class487 arg0, class499 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field322 = arg0;
        this.field358 = arg5;
        this.field335 = arg2;
        if (class322.method1934(arg5, 0, arg2)) {
            this.field366 = new class27(this.field322, null, 5126, 3, 0);
        }
        if (class235.method1429(arg5, (byte) 120, arg2)) {
            this.field327 = new class27(this.field322, null, 5126, 2, 0);
        }
        if (class157.method1005((byte) 99, arg2, arg5)) {
            this.field324 = new class27(this.field322, null, 5126, 3, 0);
        }
        if (class169.method1064(arg2, arg5, (byte) -45)) {
            this.field320 = new class27(this.field322, null, 5121, 4, 0);
        }
        if (class226.method1394(0, arg5, arg2)) {
            this.field404 = new class293();
        }
        class59 var7 = arg0.field1695;
        this.field354 = new int[arg1.field7621 + 1];
        int[] var8 = new int[arg1.field7641];
        for (int var9 = 0; var9 < arg1.field7641; var9++) {
            if ((arg1.field7601 == null || arg1.field7601[var9] != 2) && (arg1.field7637 == null || arg1.field7637[var9] == -1 || !var7.method432(arg1.field7637[var9] & 0xFFFF, true).field1544)) {
                var8[this.field325++] = var9;
                this.field354[arg1.field7632[var9]]++;
                this.field354[arg1.field7644[var9]]++;
                this.field354[arg1.field7613[var9]]++;
            }
        }
        this.field357 = this.field325;
        long[] var10 = new long[this.field325];
        boolean var11 = (this.field335 & 0x100) != 0;
        label492: for (int var12 = 0; var12 < this.field325; var12++) {
            int var180 = var8[var12];
            class118 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field7640 != null) {
                for (int var186 = 0; var186 < arg1.field7640.length; var186++) {
                    class202 var187 = arg1.field7640[var186];
                    if (var187.field2798 == var180) {
                        class440 var188 = class259.method1611(var187.field2796, -18663);
                        if (var188.field6430) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field357--;
                            continue label492;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field7637 != null) {
                var189 = arg1.field7637[var180];
                if (var189 != -1) {
                    var181 = var7.method432(var189 & 0xFFFF, true);
                    var185 = var181.field1530;
                    var184 = var181.field1540;
                }
            }
            boolean var190 = arg1.field7600 != null && arg1.field7600[var180] != 0 || var181 != null && !var181.field1523;
            if ((var11 || var190) && arg1.field7599 != null) {
                var182 += arg1.field7599[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = ((var189 & 0xFFFF) << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + ((long) var194);
        }
        class458.method2668((byte) 80, var8, var10);
        this.field371 = arg1.field7612;
        this.field393 = arg1.field7594;
        this.field394 = arg1.field7624;
        this.field300 = arg1.field7620;
        this.field338 = arg1.field7621;
        this.field363 = arg1.field7603;
        this.field339 = arg1.field7634;
        this.field301 = arg1.field7597;
        class41[] var13 = new class41[this.field338];
        if (arg1.field7640 != null) {
            this.field341 = arg1.field7640.length;
            this.field360 = new class460[this.field341];
            this.field316 = new class190[this.field341];
            for (int var14 = 0; var14 < this.field341; var14++) {
                class202 var15 = arg1.field7640[var14];
                class440 var16 = class259.method1611(var15.field2796, -18663);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field325; var18++) {
                    if (var8[var18] == var15.field2798) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class31.field518[arg1.field7625[var15.field2798] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7600 == null ? 0 : arg1.field7600[var15.field2798]) << 24;
                this.field316[var14] = new class190(var17, arg1.field7632[var15.field2798], arg1.field7644[var15.field2798], arg1.field7613[var15.field2798], var16.field6420, var16.field6433, var16.field6431, var16.field6425, var16.field6419, var16.field6430, var16.field6422, var15.field2799);
                this.field360[var14] = new class460(var20);
            }
        }
        int var21 = this.field325 * 3;
        this.field372 = new short[this.field325];
        this.field331 = new float[var21];
        this.field352 = new short[this.field325];
        this.field346 = new float[var21];
        this.field388 = (short) arg4;
        this.field375 = new short[var21];
        class405.field5949 = new long[var21];
        this.field374 = new byte[var21];
        if (arg1.field7636 != null) {
            this.field337 = new short[this.field325];
        }
        this.field392 = new short[this.field325];
        this.field299 = (short) arg3;
        this.field297 = new short[var21];
        this.field344 = new short[this.field325];
        this.field333 = new short[var21];
        this.field380 = new byte[this.field325];
        this.field350 = new short[var21];
        this.field381 = new short[this.field325];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7621; var23++) {
            int var179 = this.field354[var23];
            this.field354[var23] = var22;
            var22 += var179;
            var13[var23] = new class41();
        }
        this.field354[arg1.field7621] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field7605 != null) {
            int var28 = arg1.field7610;
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
            var26 = new int[var28];
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field325; var36++) {
                int var43 = var8[var36];
                if (arg1.field7605[var43] != -1) {
                    int var44 = arg1.field7605[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field7632[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field7644[var43];
                        } else {
                            var46 = arg1.field7613[var43];
                        }
                        int var47 = arg1.field7594[var46];
                        int var48 = arg1.field7612[var46];
                        int var49 = arg1.field7620[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var27 = new float[var28][];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field7619[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field7645[var37];
                        var40 = 64.0F / (float) arg1.field7602[var37];
                        if (var42 == 0) {
                            var39 = 1.0F;
                            var41 = 1.0F;
                        } else if (var42 > 0) {
                            var39 = (float) var42 / 1024.0F;
                            var41 = 1.0F;
                        } else {
                            var39 = 1.0F;
                            var41 = (float) (-var42) / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field7630[var37];
                        var40 = 64.0F / (float) arg1.field7602[var37];
                        var41 = 64.0F / (float) arg1.field7645[var37];
                    } else {
                        var40 = (float) arg1.field7602[var37] / 1024.0F;
                        var39 = (float) arg1.field7630[var37] / 1024.0F;
                        var41 = (float) arg1.field7645[var37] / 1024.0F;
                    }
                    var27[var37] = class214.method1324(arg1.field7595[var37], var39, var40, class500.method3013(arg1.field7642[var37], 255), -106, arg1.field7627[var37], var41, arg1.field7628[var37]);
                }
            }
        }
        class265[] var50 = new class265[arg1.field7641];
        for (int var51 = 0; var51 < arg1.field7641; var51++) {
            short var158 = arg1.field7632[var51];
            short var159 = arg1.field7644[var51];
            short var160 = arg1.field7613[var51];
            int var161 = this.field393[var159] - this.field393[var158];
            int var162 = this.field371[var159] - this.field371[var158];
            int var163 = this.field300[var159] - this.field300[var158];
            int var164 = this.field393[var160] - this.field393[var158];
            int var165 = this.field371[var160] - this.field371[var158];
            int var166 = this.field300[var160] - this.field300[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var168 >>= 0x1;
                var169 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var168 * var168 + (var167 * var167 + (var169 * var169))));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var167 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field7601 == null ? 0 : arg1.field7601[var51];
            if (var174 == 0) {
                class41 var176 = var13[var158];
                var176.field622 += var173;
                var176.field626 += var172;
                var176.field625++;
                var176.field623 += var171;
                class41 var177 = var13[var159];
                var177.field622 += var173;
                var177.field623 += var171;
                var177.field626 += var172;
                var177.field625++;
                class41 var178 = var13[var160];
                var178.field622 += var173;
                var178.field626 += var172;
                var178.field625++;
                var178.field623 += var171;
            } else if (var174 == 1) {
                class265 var175 = var50[var51] = new class265();
                var175.field3755 = var172;
                var175.field3756 = var171;
                var175.field3754 = var173;
            }
        }
        for (int var52 = 0; var52 < this.field325; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field7625[var68] & 0xFFFF;
            short var70;
            if (arg1.field7637 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field7637[var68];
            }
            int var71;
            if (arg1.field7605 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field7605[var68];
            }
            int var72;
            if (arg1.field7600 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field7600[var68] & 0xFF;
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
                    var77 = 0.0F;
                    var80 = 2;
                    var75 = 1.0F;
                    var74 = 1.0F;
                    var78 = 0.0F;
                    var73 = 0.0F;
                    var79 = 1;
                    var76 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field7619[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field7632[var68];
                        short var112 = arg1.field7644[var68];
                        short var113 = arg1.field7613[var68];
                        short var114 = arg1.field7628[var71];
                        short var115 = arg1.field7627[var71];
                        short var116 = arg1.field7595[var71];
                        float var117 = (float) arg1.field7594[var114];
                        float var118 = (float) arg1.field7612[var114];
                        float var119 = (float) arg1.field7620[var114];
                        float var120 = (float) arg1.field7594[var115] - var117;
                        float var121 = (float) arg1.field7612[var115] - var118;
                        float var122 = (float) arg1.field7620[var115] - var119;
                        float var123 = (float) arg1.field7594[var116] - var117;
                        float var124 = (float) arg1.field7612[var116] - var118;
                        float var125 = (float) arg1.field7620[var116] - var119;
                        float var126 = (float) arg1.field7594[var111] - var117;
                        float var127 = (float) arg1.field7612[var111] - var118;
                        float var128 = (float) arg1.field7620[var111] - var119;
                        float var129 = (float) arg1.field7594[var112] - var117;
                        float var130 = (float) arg1.field7612[var112] - var118;
                        float var131 = (float) arg1.field7620[var112] - var119;
                        float var132 = (float) arg1.field7594[var113] - var117;
                        float var133 = (float) arg1.field7612[var113] - var118;
                        float var134 = (float) arg1.field7620[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var122 * var135 - (var120 * var137);
                        float var143 = var120 * var136 - var121 * var135;
                        float var144 = var121 * var137 - (var122 * var136);
                        float var145 = 1.0F / (var125 * var143 + var123 * var144 + var124 * var142);
                        var74 = (var128 * var143 + var126 * var144 + var127 * var142) * var145;
                        var76 = (var131 * var143 + var129 * var144 + var130 * var142) * var145;
                        var78 = (var134 * var143 + var132 * var144 + var133 * var142) * var145;
                    } else {
                        short var83 = arg1.field7632[var68];
                        short var84 = arg1.field7644[var68];
                        short var85 = arg1.field7613[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field7633[var71];
                        float var91 = (float) arg1.field7604[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field7630[var71] / 1024.0F;
                            class86.method541(var89, var87, var86, var90, var91, arg1.field7620[var83], var88, var92, true, arg1.field7612[var83], arg1.field7594[var83]);
                            var74 = class126.field1621;
                            var73 = class61.field910;
                            class86.method541(var89, var87, var86, var90, var91, arg1.field7620[var84], var88, var92, true, arg1.field7612[var84], arg1.field7594[var84]);
                            var75 = class61.field910;
                            var76 = class126.field1621;
                            class86.method541(var89, var87, var86, var90, var91, arg1.field7620[var85], var88, var92, true, arg1.field7612[var85], arg1.field7594[var85]);
                            var77 = class61.field910;
                            var78 = class126.field1621;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if ((var93 < var77 - var73)) {
                                    var80 = 1;
                                    var77 -= var92;
                                } else if (var93 < var73 - var77) {
                                    var77 += var92;
                                    var80 = 2;
                                }
                                if (var75 - var73 > var93) {
                                    var79 = 1;
                                    var75 -= var92;
                                } else if (var73 - var75 > var93) {
                                    var75 += var92;
                                    var79 = 2;
                                }
                            } else {
                                if (var93 < var76 - var74) {
                                    var79 = 1;
                                    var76 -= var92;
                                } else if (var74 - var76 > var93) {
                                    var76 += var92;
                                    var79 = 2;
                                }
                                if (var93 < var78 - var74) {
                                    var78 -= var92;
                                    var80 = 1;
                                } else if (var74 - var78 > var93) {
                                    var78 += var92;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field7591[var71] / 256.0F;
                            float var95 = (float) arg1.field7629[var71] / 256.0F;
                            int var96 = arg1.field7594[var84] - arg1.field7594[var83];
                            int var97 = arg1.field7612[var84] - arg1.field7612[var83];
                            int var98 = arg1.field7620[var84] - arg1.field7620[var83];
                            int var99 = arg1.field7594[var85] - arg1.field7594[var83];
                            int var100 = arg1.field7612[var85] - arg1.field7612[var83];
                            int var101 = arg1.field7620[var85] - arg1.field7620[var83];
                            int var102 = var97 * var101 - var98 * var100;
                            int var103 = var98 * var99 - (var96 * var101);
                            int var104 = var96 * var100 - var97 * var99;
                            float var105 = 64.0F / (float) arg1.field7645[var71];
                            float var106 = 64.0F / (float) arg1.field7602[var71];
                            float var107 = 64.0F / (float) arg1.field7630[var71];
                            float var108 = (var89[2] * (float) var104 + var89[1] * (float) var103 + var89[0] * (float) var102) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[4] * (float) var103 + var89[3] * (float) var102) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[7] * (float) var103 + var89[6] * (float) var102) / var107;
                            var81 = class265.method1633(var108, (byte) -98, var109, var110);
                            class359.method2178(var89, var94, var95, var90, arg1.field7612[var83], arg1.field7620[var83], var81, var88, var87, var86, arg1.field7594[var83], var91, false);
                            var74 = class225.field3172;
                            var73 = class122.field1597;
                            class359.method2178(var89, var94, var95, var90, arg1.field7612[var84], arg1.field7620[var84], var81, var88, var87, var86, arg1.field7594[var84], var91, false);
                            var75 = class122.field1597;
                            var76 = class225.field3172;
                            class359.method2178(var89, var94, var95, var90, arg1.field7612[var85], arg1.field7620[var85], var81, var88, var87, var86, arg1.field7594[var85], var91, false);
                            var78 = class225.field3172;
                            var77 = class122.field1597;
                        } else if (var82 == 3) {
                            class471.method2755(var86, var88, var90, var89, var91, arg1.field7620[var83], arg1.field7612[var83], arg1.field7594[var83], 119, var87);
                            var73 = class337.field4910;
                            var74 = class336.field4874;
                            class471.method2755(var86, var88, var90, var89, var91, arg1.field7620[var84], arg1.field7612[var84], arg1.field7594[var84], 125, var87);
                            var76 = class336.field4874;
                            var75 = class337.field4910;
                            class471.method2755(var86, var88, var90, var89, var91, arg1.field7620[var85], arg1.field7612[var85], arg1.field7594[var85], 125, var87);
                            var77 = class337.field4910;
                            var78 = class336.field4874;
                            if ((var90 & 0x1) == 0) {
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                                if (var75 - var73 > 0.5F) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                            } else {
                                if (var76 - var74 > 0.5F) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field7601 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field7601[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var152 = arg1.field7632[var68];
                short var153 = arg1.field7644[var68];
                short var154 = arg1.field7613[var68];
                class41 var155 = var13[var152];
                this.field392[var52] = this.method169(var74, var155.field625, var150, var155.field626, arg1, var152, var155.field623, var155.field622, 0, var73);
                class41 var156 = var13[var153];
                this.field352[var52] = this.method169(var76, var156.field625, (long) var79 + var150, var156.field626, arg1, var153, var156.field623, var156.field622, 0, var75);
                class41 var157 = var13[var154];
                this.field372[var52] = this.method169(var78, var157.field625, (long) var80 + var150, var157.field626, arg1, var154, var157.field623, var157.field622, 0, var77);
            } else if (var146 == 1) {
                class265 var147 = var50[var68];
                long var148 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) ((var147.field3756 + 256 << 12) + (var147.field3755 <= 0 ? 2048 : 1024) + ((var71 << 2) - -(var147.field3754 + 256 << 22)));
                this.field392[var52] = this.method169(var74, 0, var148, var147.field3755, arg1, arg1.field7632[var68], var147.field3756, var147.field3754, 0, var73);
                this.field352[var52] = this.method169(var76, 0, (long) var79 + var148, var147.field3755, arg1, arg1.field7644[var68], var147.field3756, var147.field3754, 0, var75);
                this.field372[var52] = this.method169(var78, 0, (long) var80 + var148, var147.field3755, arg1, arg1.field7613[var68], var147.field3756, var147.field3754, 0, var77);
            }
            if (arg1.field7637 == null) {
                this.field344[var52] = -1;
            } else {
                this.field344[var52] = arg1.field7637[var68];
            }
            if (arg1.field7600 != null) {
                this.field380[var52] = arg1.field7600[var68];
            }
            if (arg1.field7636 != null) {
                this.field337[var52] = arg1.field7636[var68];
            }
            this.field381[var52] = arg1.field7625[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field357; var55++) {
            short var67 = this.field344[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field296 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field357; var58++) {
            short var66 = this.field344[var58];
            if (var57 != var66) {
                this.field296[var56++] = var58;
                var57 = var66;
            }
        }
        this.field296[var56] = this.field357;
        class405.field5949 = null;
        this.field333 = class409.method2443(376, this.field386, this.field333);
        this.field375 = class409.method2443(376, this.field386, this.field375);
        this.field350 = class409.method2443(376, this.field386, this.field350);
        this.field374 = class213.method1322(0, this.field386, this.field374);
        this.field331 = class139.method879(this.field386, this.field331, (byte) 9);
        this.field346 = class139.method879(this.field386, this.field346, (byte) 53);
        if (arg1.field7617 != null && class372.method2264(arg2, this.field358, (byte) 57)) {
            this.field387 = arg1.method2997(0);
        }
        if (arg1.field7640 != null && class489.method2940(this.field358, arg2, (byte) 116)) {
            this.field391 = arg1.method3000((byte) 59);
        }
        if (arg1.field7609 != null && class8.method66(384, this.field358, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field325; var61++) {
                int var65 = arg1.field7609[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var59 < var65) {
                        var59 = var65;
                    }
                }
            }
            this.field328 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field328[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field325; var63++) {
                int var64 = arg1.field7609[var8[var63]];
                if (var64 >= 0) {
                    this.field328[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
