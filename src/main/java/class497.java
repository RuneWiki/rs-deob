import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import java.awt.Color;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class497 extends class471 {

    @OriginalMember(owner = "client!ip", name = "V", descriptor = "Z")
    private boolean field7313 = false;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    private int field7281 = 0;

    @OriginalMember(owner = "client!ip", name = "Db", descriptor = "I")
    private int field7347 = 0;

    @OriginalMember(owner = "client!ip", name = "Zb", descriptor = "I")
    private int field7369 = 0;

    @OriginalMember(owner = "client!ip", name = "sb", descriptor = "Z")
    private boolean field7336 = true;

    @OriginalMember(owner = "client!ip", name = "yb", descriptor = "I")
    private int field7342 = 0;

    @OriginalMember(owner = "client!ip", name = "kc", descriptor = "I")
    private int field7380 = 0;

    @OriginalMember(owner = "client!ip", name = "Wb", descriptor = "Lfd;")
    private class365 field7366;

    @OriginalMember(owner = "client!ip", name = "C", descriptor = "Lpc;")
    private class473 field7294;

    @OriginalMember(owner = "client!ip", name = "Mb", descriptor = "Lpc;")
    private class473 field7356;

    @OriginalMember(owner = "client!ip", name = "cc", descriptor = "Lpc;")
    private class473 field7372;

    @OriginalMember(owner = "client!ip", name = "L", descriptor = "Lpc;")
    private class473 field7303;

    @OriginalMember(owner = "client!ip", name = "J", descriptor = "Lto;")
    private class8 field7301;

    @OriginalMember(owner = "client!ip", name = "Cb", descriptor = "I")
    private int field7346;

    @OriginalMember(owner = "client!ip", name = "Hb", descriptor = "I")
    private int field7351;

    @OriginalMember(owner = "client!ip", name = "Qb", descriptor = "[I")
    private int[] field7360;

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "[I")
    private int[] field7293;

    @OriginalMember(owner = "client!ip", name = "pc", descriptor = "[I")
    private int[] field7385;

    @OriginalMember(owner = "client!ip", name = "Y", descriptor = "[I")
    private int[] field7316;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "[S")
    private short[] field7283;

    @OriginalMember(owner = "client!ip", name = "Pb", descriptor = "[Lbu;")
    private class17[] field7359;

    @OriginalMember(owner = "client!ip", name = "Nb", descriptor = "[Lpf;")
    private class410[] field7357;

    @OriginalMember(owner = "client!ip", name = "ic", descriptor = "I")
    private int field7378;

    @OriginalMember(owner = "client!ip", name = "bc", descriptor = "[Lj;")
    private class377[] field7371;

    @OriginalMember(owner = "client!ip", name = "jb", descriptor = "[Lgo;")
    private class441[] field7327;

    @OriginalMember(owner = "client!ip", name = "Fb", descriptor = "[F")
    private float[] field7349;

    @OriginalMember(owner = "client!ip", name = "Gb", descriptor = "[B")
    private byte[] field7350;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "[F")
    private float[] field7282;

    @OriginalMember(owner = "client!ip", name = "tb", descriptor = "[S")
    private short[] field7337;

    @OriginalMember(owner = "client!ip", name = "tc", descriptor = "S")
    private short field7389;

    @OriginalMember(owner = "client!ip", name = "fc", descriptor = "[S")
    private short[] field7375;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "[S")
    private short[] field7289;

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "[S")
    private short[] field7295;

    @OriginalMember(owner = "client!ip", name = "K", descriptor = "[S")
    private short[] field7302;

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "[S")
    private short[] field7296;

    @OriginalMember(owner = "client!ip", name = "zb", descriptor = "[S")
    private short[] field7343;

    @OriginalMember(owner = "client!ip", name = "Ob", descriptor = "S")
    private short field7358;

    @OriginalMember(owner = "client!ip", name = "R", descriptor = "[S")
    private short[] field7309;

    @OriginalMember(owner = "client!ip", name = "hb", descriptor = "[S")
    private short[] field7325;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "[S")
    private short[] field7288;

    @OriginalMember(owner = "client!ip", name = "Rb", descriptor = "[B")
    private byte[] field7361;

    @OriginalMember(owner = "client!ip", name = "gc", descriptor = "[I")
    private int[] field7376;

    @OriginalMember(owner = "client!ip", name = "ac", descriptor = "[[I")
    private int[][] field7370;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "[[I")
    private int[][] field7286;

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "[[I")
    private int[][] field7292;

    @OriginalMember(owner = "client!ip", name = "lc", descriptor = "Lgk;")
    public static class331 field7381 = new class331("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!ip", name = "xc", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7393 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!ip", name = "qb", descriptor = "B")
    private byte field7334;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!ip", name = "H", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!ip", name = "M", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!ip", name = "N", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!ip", name = "O", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!ip", name = "P", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!ip", name = "Q", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!ip", name = "S", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!ip", name = "T", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!ip", name = "W", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!ip", name = "X", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!ip", name = "Z", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!ip", name = "ab", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!ip", name = "bb", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!ip", name = "cb", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!ip", name = "db", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!ip", name = "fb", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!ip", name = "gb", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!ip", name = "ib", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!ip", name = "kb", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!ip", name = "mb", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!ip", name = "nb", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!ip", name = "ob", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!ip", name = "pb", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!ip", name = "rb", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!ip", name = "vb", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!ip", name = "wb", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!ip", name = "xb", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!ip", name = "Bb", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!ip", name = "Eb", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!ip", name = "Jb", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!ip", name = "Kb", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!ip", name = "Lb", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!ip", name = "Sb", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!ip", name = "Tb", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!ip", name = "Ub", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!ip", name = "Vb", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!ip", name = "Xb", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!ip", name = "dc", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!ip", name = "ec", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!ip", name = "hc", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!ip", name = "mc", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!ip", name = "nc", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!ip", name = "oc", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!ip", name = "qc", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!ip", name = "rc", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!ip", name = "sc", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!ip", name = "uc", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!ip", name = "ub", descriptor = "Lll;")
    private class245 field7338;

    @OriginalMember(owner = "client!ip", name = "jc", descriptor = "Lbk;")
    private class254 field7379;

    @OriginalMember(owner = "client!ip", name = "wc", descriptor = "Lvd;")
    private class30 field7392;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "S")
    private short field7297;

    @OriginalMember(owner = "client!ip", name = "U", descriptor = "S")
    private short field7312;

    @OriginalMember(owner = "client!ip", name = "eb", descriptor = "S")
    private short field7322;

    @OriginalMember(owner = "client!ip", name = "lb", descriptor = "S")
    private short field7329;

    @OriginalMember(owner = "client!ip", name = "Ab", descriptor = "S")
    private short field7344;

    @OriginalMember(owner = "client!ip", name = "Ib", descriptor = "S")
    private short field7352;

    @OriginalMember(owner = "client!ip", name = "Yb", descriptor = "S")
    private short field7368;

    @OriginalMember(owner = "client!ip", name = "vc", descriptor = "[I")
    public static int[] field7391;

    @OriginalMember(owner = "client!ip", name = "XA", descriptor = "(I[IIIIIZ)V", line = 4)
    public final void method471(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field7335++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = 0;
            class338.field4689 = 0;
            class479.field7045 = 0;
            class224.field3289 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field7370.length > var14) {
                    int[] var15 = this.field7370[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class479.field7045 += this.field7293[var17];
                        class224.field3289 += this.field7385[var17];
                        class338.field4689 += this.field7316[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class338.field4689 = class338.field4689 / var12 + var10;
                class479.field7045 = class479.field7045 / var12 + var11;
                class224.field3289 = class224.field3289 / var12 + var9;
            } else {
                class338.field4689 = var10;
                class224.field3289 = var9;
                class479.field7045 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field7370.length) {
                    int[] var23 = this.field7370[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field7293[var25] += var18;
                        this.field7385[var25] += var19;
                        this.field7316[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field7370.length > var45) {
                    int[] var46 = this.field7370[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field7293[var59] -= class479.field7045;
                            this.field7385[var59] -= class224.field3289;
                            this.field7316[var59] -= class338.field4689;
                            if (arg4 != 0) {
                                int var60 = class340.field4724[arg4];
                                int var61 = class340.field4715[arg4];
                                int var62 = this.field7385[var59] * var60 + this.field7293[var59] * var61 + 32767 >> 15;
                                this.field7385[var59] = this.field7385[var59] * var61 + 32767 - this.field7293[var59] * var60 >> 15;
                                this.field7293[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class340.field4724[arg2];
                                int var64 = class340.field4715[arg2];
                                int var65 = this.field7385[var59] * var64 + 32767 - (this.field7316[var59] * var63) >> 15;
                                this.field7316[var59] = this.field7385[var59] * var63 + this.field7316[var59] * var64 + 32767 >> 15;
                                this.field7385[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class340.field4724[arg3];
                                int var67 = class340.field4715[arg3];
                                int var68 = this.field7293[var59] * var67 + this.field7316[var59] * var66 + 32767 >> 15;
                                this.field7316[var59] = this.field7316[var59] * var67 + 32767 - (this.field7293[var59] * var66) >> 15;
                                this.field7293[var59] = var68;
                            }
                            this.field7293[var59] += class479.field7045;
                            this.field7385[var59] += class224.field3289;
                            this.field7316[var59] += class338.field4689;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field7293[var48] -= class479.field7045;
                            this.field7385[var48] -= class224.field3289;
                            this.field7316[var48] -= class338.field4689;
                            if (arg2 != 0) {
                                int var49 = class340.field4724[arg2];
                                int var50 = class340.field4715[arg2];
                                int var51 = this.field7385[var48] * var50 + 32767 - (this.field7316[var48] * var49) >> 15;
                                this.field7316[var48] = this.field7316[var48] * var50 + (this.field7385[var48] * var49 + 32767) >> 15;
                                this.field7385[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class340.field4724[arg4];
                                int var53 = class340.field4715[arg4];
                                int var54 = this.field7385[var48] * var52 - (-(this.field7293[var48] * var53) - 32767) >> 15;
                                this.field7385[var48] = this.field7385[var48] * var53 + 32767 - (this.field7293[var48] * var52) >> 15;
                                this.field7293[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class340.field4724[arg3];
                                int var56 = class340.field4715[arg3];
                                int var57 = this.field7316[var48] * var55 + this.field7293[var48] * var56 + 32767 >> 15;
                                this.field7316[var48] = this.field7316[var48] * var56 + 32767 - (this.field7293[var48] * var55) >> 15;
                                this.field7293[var48] = var57;
                            }
                            this.field7293[var48] += class479.field7045;
                            this.field7385[var48] += class224.field3289;
                            this.field7316[var48] += class338.field4689;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field7370.length) {
                        int[] var29 = this.field7370[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field7360[var31];
                            int var33 = this.field7360[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field7375[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class340.field4724[arg4];
                                    int var37 = class340.field4715[arg4];
                                    int var38 = this.field7289[var35] * var36 + (this.field7296[var35] * var37) + 32767 >> 15;
                                    this.field7289[var35] = (short) (this.field7289[var35] * var37 + 32767 - (this.field7296[var35] * var36) >> 15);
                                    this.field7296[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class340.field4724[arg2];
                                    int var40 = class340.field4715[arg2];
                                    int var41 = this.field7289[var35] * var40 + 32767 - (this.field7295[var35] * var39) >> 15;
                                    this.field7295[var35] = (short) (this.field7295[var35] * var40 + this.field7289[var35] * var39 + 32767 >> 15);
                                    this.field7289[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class340.field4724[arg3];
                                    int var43 = class340.field4715[arg3];
                                    int var44 = this.field7296[var35] * var43 + this.field7295[var35] * var42 + 32767 >> 15;
                                    this.field7295[var35] = (short) (this.field7295[var35] * var43 + 32767 - (this.field7296[var35] * var42) >> 15);
                                    this.field7296[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field7372 == null && this.field7303 != null) {
                    this.field7303.field6975 = null;
                }
                if (this.field7372 != null) {
                    this.field7372.field6975 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field7370.length) {
                    int[] var71 = this.field7370[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field7293[var73] -= class479.field7045;
                        this.field7385[var73] -= class224.field3289;
                        this.field7316[var73] -= class338.field4689;
                        this.field7293[var73] = this.field7293[var73] * arg2 >> 7;
                        this.field7385[var73] = this.field7385[var73] * arg3 >> 7;
                        this.field7316[var73] = this.field7316[var73] * arg4 >> 7;
                        this.field7293[var73] += class479.field7045;
                        this.field7385[var73] += class224.field3289;
                        this.field7316[var73] += class338.field4689;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field7292 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field7292.length) {
                        int[] var79 = this.field7292[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field7350[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field7350[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field7303 != null) {
                            this.field7303.field6975 = null;
                        }
                    }
                }
                if (this.field7371 != null) {
                    for (int var75 = 0; var75 < this.field7378; var75++) {
                        class377 var76 = this.field7371[var75];
                        class441 var77 = this.field7327[var75];
                        var77.field6549 = 255 - (this.field7350[var76.field5571] & 0xFF) << 24 | var77.field6549 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field7292 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field7292.length) {
                        int[] var88 = this.field7292[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field7288[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFE1B) >> 10;
                            int var93 = (var91 & 0x3E5) >> 7;
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
                            this.field7288[var90] = (short) class244.method1606(class244.method1606(var96 << 10, var95 << 7), var97);
                        }
                        if (var88.length > 0 && this.field7303 != null) {
                            this.field7303.field6975 = null;
                        }
                    }
                }
                if (this.field7371 != null) {
                    for (int var84 = 0; var84 < this.field7378; var84++) {
                        class377 var85 = this.field7371[var84];
                        class441 var86 = this.field7327[var84];
                        var86.field6549 = var86.field6549 & 0xFF000000 | class37.field413[this.field7288[var85.field5571] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field7286 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field7286.length) {
                        int[] var100 = this.field7286[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class441 var102 = this.field7327[var100[var101]];
                            var102.field6555 += arg2;
                            var102.field6552 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field7286 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field7286.length) {
                        int[] var105 = this.field7286[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class441 var107 = this.field7327[var105[var106]];
                            var107.field6547 = var107.field6547 * arg2 >> 7;
                            var107.field6554 = var107.field6554 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field7286 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field7286.length > var109) {
                    int[] var110 = this.field7286[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class441 var112 = this.field7327[var110[var111]];
                        var112.field6551 = var112.field6551 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "N", descriptor = "(IIII)V", line = 654)
    public final void method439(int arg0, int arg1, int arg2, int arg3) {
        field7291++;
        if (arg0 == 0) {
            int var5 = 0;
            class479.field7045 = 0;
            class224.field3289 = 0;
            class338.field4689 = 0;
            for (int var6 = 0; var6 < this.field7369; var6++) {
                class479.field7045 += this.field7293[var6];
                class224.field3289 += this.field7385[var6];
                var5++;
                class338.field4689 += this.field7316[var6];
            }
            if (var5 > 0) {
                class479.field7045 = class479.field7045 / var5 + arg1;
                class224.field3289 = class224.field3289 / var5 + arg2;
                class338.field4689 = class338.field4689 / var5 + arg3;
            } else {
                class479.field7045 = arg1;
                class224.field3289 = arg2;
                class338.field4689 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field7369; var7++) {
                this.field7293[var7] += arg1;
                this.field7385[var7] += arg2;
                this.field7316[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field7369; var8++) {
                this.field7293[var8] -= class479.field7045;
                this.field7385[var8] -= class224.field3289;
                this.field7316[var8] -= class338.field4689;
                if (arg3 != 0) {
                    int var9 = class340.field4724[arg3];
                    int var10 = class340.field4715[arg3];
                    int var11 = this.field7385[var8] * var9 + this.field7293[var8] * var10 + 32767 >> 15;
                    this.field7385[var8] = this.field7385[var8] * var10 + 32767 - (this.field7293[var8] * var9) >> 15;
                    this.field7293[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class340.field4724[arg1];
                    int var13 = class340.field4715[arg1];
                    int var14 = this.field7385[var8] * var13 + 32767 - (this.field7316[var8] * var12) >> 15;
                    this.field7316[var8] = this.field7316[var8] * var13 + this.field7385[var8] * var12 + 32767 >> 15;
                    this.field7385[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class340.field4724[arg2];
                    int var16 = class340.field4715[arg2];
                    int var17 = this.field7316[var8] * var15 + (this.field7293[var8] * var16) + 32767 >> 15;
                    this.field7316[var8] = this.field7316[var8] * var16 + 32767 - this.field7293[var8] * var15 >> 15;
                    this.field7293[var8] = var17;
                }
                this.field7293[var8] += class479.field7045;
                this.field7385[var8] += class224.field3289;
                this.field7316[var8] += class338.field4689;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field7369; var18++) {
                this.field7293[var18] -= class479.field7045;
                this.field7385[var18] -= class224.field3289;
                this.field7316[var18] -= class338.field4689;
                this.field7293[var18] = this.field7293[var18] * arg1 / 128;
                this.field7385[var18] = this.field7385[var18] * arg2 / 128;
                this.field7316[var18] = this.field7316[var18] * arg3 / 128;
                this.field7293[var18] += class479.field7045;
                this.field7385[var18] += class224.field3289;
                this.field7316[var18] += class338.field4689;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field7380; var19++) {
                int var23 = (this.field7350[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field7350[var19] = (byte) var23;
            }
            if (this.field7303 != null) {
                this.field7303.field6975 = null;
            }
            if (this.field7371 != null) {
                for (int var20 = 0; var20 < this.field7378; var20++) {
                    class377 var21 = this.field7371[var20];
                    class441 var22 = this.field7327[var20];
                    var22.field6549 = var22.field6549 & 0xFFFFFF | 255 - (this.field7350[var21.field5571] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field7380; var24++) {
                int var28 = this.field7288[var24] & 0xFFFF;
                int var29 = (var28 & 0xFDF3) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg2 / 4 + var30;
                int var32 = var28 & 0x7F;
                int var33 = var29 + arg1 & 0x3F;
                int var34 = arg3 + var32;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field7288[var24] = (short) class244.method1606(class244.method1606(var33 << 10, var31 << 7), var34);
            }
            if (this.field7303 != null) {
                this.field7303.field6975 = null;
            }
            if (this.field7371 != null) {
                for (int var25 = 0; var25 < this.field7378; var25++) {
                    class377 var26 = this.field7371[var25];
                    class441 var27 = this.field7327[var25];
                    var27.field6549 = class37.field413[this.field7288[var26.field5571] & 0xFFFF] & 0xFFFFFF | var27.field6549 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field7378; var35++) {
                class441 var36 = this.field7327[var35];
                var36.field6552 += arg2;
                var36.field6555 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field7378; var37++) {
                class441 var38 = this.field7327[var37];
                var38.field6554 = var38.field6554 * arg2 >> 7;
                var38.field6547 = var38.field6547 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field7378; var39++) {
                class441 var40 = this.field7327[var39];
                var40.field6551 = var40.field6551 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "()V", line = 960)
    public final void method440() {
        for (int var1 = 0; var1 < this.field7347; var1++) {
            this.field7293[var1] = this.field7293[var1] + 7 >> 4;
            this.field7385[var1] = this.field7385[var1] + 7 >> 4;
            this.field7316[var1] = this.field7316[var1] + 7 >> 4;
        }
        field7340++;
        if (this.field7294 != null) {
            this.field7294.field6975 = null;
        }
        this.field7313 = false;
    }

    @OriginalMember(owner = "client!ip", name = "PA", descriptor = "()I", line = 988)
    public final int method453() {
        if (!this.field7313) {
            this.method2984(16383);
        }
        field7320++;
        return this.field7322;
    }

    @OriginalMember(owner = "client!ip", name = "UA", descriptor = "(I)V", line = 999)
    public final void method465(int arg0) {
        field7332++;
        this.field7351 = arg0;
        this.field7336 = true;
        if (this.field7338 != null && (this.field7351 & 0x10000) == 0) {
            this.field7289 = this.field7338.field3605;
            this.field7295 = this.field7338.field3612;
            this.field7361 = this.field7338.field3606;
            this.field7296 = this.field7338.field3610;
            this.field7338 = null;
        }
        this.method2987(-127);
    }

    @OriginalMember(owner = "client!ip", name = "fa", descriptor = "(Lba;)Lba;", line = 1023)
    public final class263 method449(class263 arg0) {
        field7305++;
        if (this.field7342 == 0) {
            return null;
        }
        if (!this.field7313) {
            this.method2984(16383);
        }
        int var2;
        int var3;
        if (this.field7366.field5341 > 0) {
            var2 = this.field7352 - (this.field7366.field5341 * this.field7344 >> 8) >> this.field7366.field5307;
            var3 = this.field7368 - (this.field7366.field5341 * this.field7329 >> 8) >> this.field7366.field5307;
        } else {
            var2 = this.field7352 - (this.field7366.field5341 * this.field7329 >> 8) >> this.field7366.field5307;
            var3 = this.field7368 - (this.field7366.field5341 * this.field7344 >> 8) >> this.field7366.field5307;
        }
        int var4;
        int var5;
        if (this.field7366.field5420 <= 0) {
            var4 = this.field7322 - (this.field7366.field5420 * this.field7329 >> 8) >> this.field7366.field5307;
            var5 = this.field7297 - (this.field7366.field5420 * this.field7344 >> 8) >> this.field7366.field5307;
        } else {
            var4 = this.field7322 - (this.field7366.field5420 * this.field7344 >> 8) >> this.field7366.field5307;
            var5 = this.field7297 - (this.field7366.field5420 * this.field7329 >> 8) >> this.field7366.field5307;
        }
        int var6 = var3 - (var2 - 1);
        int var7 = var5 + 1 - var4;
        class80 var8 = (class80) arg0;
        class80 var9;
        if (var8 != null && var8.method726(22582, var6, var7)) {
            var9 = var8;
            var8.method729(292993616);
        } else {
            var9 = new class80(this.field7366, var6, var7);
        }
        var9.method724(var4, -57, var2, var3, var5);
        this.method2980(var9, -99);
        return var9;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lt;IIIZ)V", line = 1088)
    public final void method437(class471 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7323++;
        class497 var6 = (class497) arg0;
        if (this.field7380 == 0 || var6.field7380 == 0) {
            return;
        }
        int var7 = var6.field7369;
        int[] var8 = var6.field7293;
        int[] var9 = var6.field7385;
        int[] var10 = var6.field7316;
        short[] var11 = var6.field7296;
        short[] var12 = var6.field7289;
        short[] var13 = var6.field7295;
        byte[] var14 = var6.field7361;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field7338 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var17 = this.field7338.field3605;
            var16 = this.field7338.field3606;
            var18 = this.field7338.field3612;
            var15 = this.field7338.field3610;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field7338 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field7338.field3606;
            var20 = var6.field7338.field3610;
            var21 = var6.field7338.field3605;
            var22 = var6.field7338.field3612;
        }
        int[] var23 = var6.field7360;
        short[] var24 = var6.field7375;
        if (!var6.field7313) {
            var6.method2984(16383);
        }
        short var25 = var6.field7329;
        short var26 = var6.field7344;
        short var27 = var6.field7352;
        short var28 = var6.field7368;
        short var29 = var6.field7322;
        short var30 = var6.field7297;
        for (int var31 = 0; var31 < this.field7369; var31++) {
            int var32 = this.field7385[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field7293[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field7316[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field7360[var31];
                        int var37 = this.field7360[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field7375[var38] - 1;
                            if (var35 == -1 || this.field7361[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field7338 = new class245();
                                            var15 = this.field7338.field3610 = class518.method3078(this.field7296, -96);
                                            var17 = this.field7338.field3605 = class518.method3078(this.field7289, -112);
                                            var18 = this.field7338.field3612 = class518.method3078(this.field7295, -101);
                                            var16 = this.field7338.field3606 = class452.method2725(this.field7361, 0);
                                        }
                                        if (var20 == null) {
                                            class245 var44 = var6.field7338 = new class245();
                                            var20 = var44.field3610 = class518.method3078(var11, -111);
                                            var21 = var44.field3605 = class518.method3078(var12, -106);
                                            var22 = var44.field3612 = class518.method3078(var13, -94);
                                            var19 = var44.field3606 = class452.method2725(var14, 0);
                                        }
                                        short var45 = this.field7296[var35];
                                        short var46 = this.field7289[var35];
                                        short var47 = this.field7295[var35];
                                        byte var48 = this.field7361[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var20[var52] += var45;
                                                var21[var52] += var46;
                                                var22[var52] += var47;
                                                var19[var52] += var48;
                                            }
                                        }
                                        byte var53 = var14[var40];
                                        int var54 = this.field7360[var31];
                                        int var55 = this.field7360[var31 + 1];
                                        short var56 = var13[var40];
                                        short var57 = var11[var40];
                                        short var58 = var12[var40];
                                        for (int var59 = var54; var59 < var55; var59++) {
                                            int var60 = this.field7375[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var15[var60] += var57;
                                                var17[var60] += var58;
                                                var18[var60] += var56;
                                                var16[var60] += var53;
                                            }
                                        }
                                        if (this.field7372 == null && this.field7303 != null) {
                                            this.field7303.field6975 = null;
                                        }
                                        if (this.field7372 != null) {
                                            this.field7372.field6975 = null;
                                        }
                                        if (var6.field7372 == null && var6.field7303 != null) {
                                            var6.field7303.field6975 = null;
                                        }
                                        if (var6.field7372 != null) {
                                            var6.field7372.field6975 = null;
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

    @OriginalMember(owner = "client!ip", name = "U", descriptor = "()I", line = 1359)
    public final int method470() {
        field7324++;
        if (!this.field7313) {
            this.method2984(16383);
        }
        return this.field7312;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "()[Lpf;", line = 1370)
    public final class410[] method444() {
        field7290++;
        return this.field7357;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILtu;)V", line = 1378)
    private final void method2974(int arg0, class231 arg1) {
        if (this.field7359 != null) {
            for (int var3 = 0; var3 < this.field7359.length; var3++) {
                class17 var4 = this.field7359[var3];
                class17 var5 = var4;
                if (var4.field185 != null) {
                    var5 = var4.field185;
                }
                var5.field181 = (int) ((float) this.field7316[var4.field189] * arg1.field3402 + (float) this.field7385[var4.field189] * arg1.field3401 + (float) this.field7293[var4.field189] * arg1.field3386 + arg1.field3407);
                var5.field182 = (int) ((float) this.field7316[var4.field189] * arg1.field3381 + (float) this.field7385[var4.field189] * arg1.field3396 + (float) this.field7293[var4.field189] * arg1.field3378 + arg1.field3399);
                var5.field194 = (int) ((float) this.field7316[var4.field189] * arg1.field3377 + (float) this.field7385[var4.field189] * arg1.field3392 + (float) this.field7293[var4.field189] * arg1.field3400 + arg1.field3376);
                var5.field183 = (int) ((float) this.field7316[var4.field197] * arg1.field3402 + (float) this.field7385[var4.field197] * arg1.field3401 + (float) this.field7293[var4.field197] * arg1.field3386 + arg1.field3407);
                var5.field184 = (int) ((float) this.field7316[var4.field197] * arg1.field3381 + (float) this.field7385[var4.field197] * arg1.field3396 + (float) this.field7293[var4.field197] * arg1.field3378 + arg1.field3399);
                var5.field190 = (int) ((float) this.field7316[var4.field197] * arg1.field3377 + (float) this.field7385[var4.field197] * arg1.field3392 + (float) this.field7293[var4.field197] * arg1.field3400 + arg1.field3376);
                var5.field191 = (int) ((float) this.field7316[var4.field180] * arg1.field3402 + (float) this.field7385[var4.field180] * arg1.field3401 + (float) this.field7293[var4.field180] * arg1.field3386 + arg1.field3407);
                var5.field186 = (int) ((float) this.field7316[var4.field180] * arg1.field3381 + (float) this.field7385[var4.field180] * arg1.field3396 + (float) this.field7293[var4.field180] * arg1.field3378 + arg1.field3399);
                var5.field192 = (int) ((float) this.field7316[var4.field180] * arg1.field3377 + (float) this.field7385[var4.field180] * arg1.field3392 + (float) this.field7293[var4.field180] * arg1.field3400 + arg1.field3376);
            }
        }
        field7317++;
        if (arg0 != 0) {
            this.field7329 = 0;
        }
        if (this.field7357 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field7357.length; var6++) {
            class410 var7 = this.field7357[var6];
            class410 var8 = var7;
            if (var7.field6096 != null) {
                var8 = var7.field6096;
            }
            if (var7.field6091 == null) {
                var7.field6091 = arg1.method245();
            } else {
                var7.field6091.method256(arg1);
            }
            var8.field6094 = (int) ((float) this.field7316[var7.field6089] * arg1.field3402 + (float) this.field7385[var7.field6089] * arg1.field3401 + (float) this.field7293[var7.field6089] * arg1.field3386 + arg1.field3407);
            var8.field6092 = (int) ((float) this.field7316[var7.field6089] * arg1.field3381 + (float) this.field7385[var7.field6089] * arg1.field3396 + (float) this.field7293[var7.field6089] * arg1.field3378 + arg1.field3399);
            var8.field6101 = (int) ((float) this.field7316[var7.field6089] * arg1.field3377 + (float) this.field7385[var7.field6089] * arg1.field3392 + (float) this.field7293[var7.field6089] * arg1.field3400 + arg1.field3376);
        }
    }

    @OriginalMember(owner = "client!ip", name = "HA", descriptor = "()I", line = 1455)
    public final int method456() {
        if (!this.field7313) {
            this.method2984(16383);
        }
        field7284++;
        return this.field7352;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V", line = 1467)
    public final void method438(int arg0) {
        field7310++;
        int var2 = class340.field4724[arg0];
        int var3 = class340.field4715[arg0];
        for (int var4 = 0; var4 < this.field7369; var4++) {
            int var7 = this.field7316[var4] * var2 + this.field7293[var4] * var3 >> 15;
            this.field7316[var4] = this.field7316[var4] * var3 - (this.field7293[var4] * var2) >> 15;
            this.field7293[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field7342; var5++) {
            int var6 = this.field7296[var5] * var3 + this.field7295[var5] * var2 >> 15;
            this.field7295[var5] = (short) (this.field7295[var5] * var3 - (this.field7296[var5] * var2) >> 15);
            this.field7296[var5] = (short) var6;
        }
        if (this.field7372 == null && this.field7303 != null) {
            this.field7303.field6975 = null;
        }
        if (this.field7372 != null) {
            this.field7372.field6975 = null;
        }
        this.field7313 = false;
        if (this.field7294 != null) {
            this.field7294.field6975 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "()I", line = 1515)
    public final int method432() {
        field7382++;
        return this.field7389;
    }

    @OriginalMember(owner = "client!ip", name = "BA", descriptor = "(SS)V", line = 1523)
    public final void method467(short arg0, short arg1) {
        field7348++;
        for (int var3 = 0; var3 < this.field7380; var3++) {
            if (this.field7288[var3] == arg0) {
                this.field7288[var3] = arg1;
            }
        }
        if (this.field7371 != null) {
            for (int var4 = 0; var4 < this.field7378; var4++) {
                class377 var5 = this.field7371[var4];
                class441 var6 = this.field7327[var4];
                var6.field6549 = class37.field413[this.field7288[var5.field5571] & 0xFFFF] & 0xFFFFFF | var6.field6549 & 0xFF000000;
            }
        }
        if (this.field7303 != null) {
            this.field7303.field6975 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "Z", descriptor = "(I)V", line = 1564)
    public final void method447(int arg0) {
        field7287++;
        int var2 = class340.field4724[arg0];
        int var3 = class340.field4715[arg0];
        for (int var4 = 0; var4 < this.field7369; var4++) {
            int var5 = this.field7385[var4] * var3 - (this.field7316[var4] * var2) >> 15;
            this.field7316[var4] = this.field7385[var4] * var2 + this.field7316[var4] * var3 >> 15;
            this.field7385[var4] = var5;
        }
        if (this.field7294 != null) {
            this.field7294.field6975 = null;
        }
        this.field7313 = false;
    }

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "(IILta;Lta;III)V", line = 1593)
    public final void method473(int arg0, int arg1, class142 arg2, class142 arg3, int arg4, int arg5, int arg6) {
        field7383++;
        if (!this.field7313) {
            this.method2984(16383);
        }
        int var8 = this.field7352 + arg4;
        int var9 = arg4 + this.field7368;
        int var10 = arg6 + this.field7322;
        int var11 = this.field7297 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field2006 + var9 >> arg2.field2001 >= arg2.field2007 || var10 < 0 || arg2.field2003 <= var11 + arg2.field2006 >> arg2.field2001) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field2006 + var9 >> arg3.field2001) >= arg3.field2007 || var10 < 0 || (arg3.field2006 + var11 >> arg3.field2001) >= arg3.field2003) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field2001;
            int var13 = var9 + arg2.field2006 - 1 >> arg2.field2001;
            int var14 = var10 >> arg2.field2001;
            int var15 = arg2.field2006 + var11 - 1 >> arg2.field2001;
            if (arg5 == arg2.method430(var12, var14) && arg2.method430(var13, var14) == arg5 && arg5 == arg2.method430(var12, var15) && arg5 == arg2.method430(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field7369; var32++) {
                this.field7385[var32] = this.field7385[var32] + arg2.method426(this.field7293[var32] + arg4, this.field7316[var32] - -arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field7329;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field7369; var30++) {
                int var31 = (this.field7385[var30] << 16) / var29;
                if (var31 < arg1) {
                    this.field7385[var30] += (arg1 - var31) * (arg2.method426(this.field7293[var30] + arg4, this.field7316[var30] - -arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var25 = (arg1 & 0xFF) * 4;
            int var26 = (arg1 >> 8 & 0xFF) * 4;
            int var27 = (arg1 >> 16 & 0xFF) << 6;
            int var28 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var25 >> 1)) < 0 || ((var25 >> 1) + arg2.field2006 + arg4) >= (arg2.field2007 << arg2.field2001) || (arg6 - (var26 >> 1)) < 0 || (var26 >> 1) + arg6 + arg2.field2006 >= arg2.field2003 << arg2.field2001) {
                return;
            }
            this.method2850(16384, arg4, arg6, var26, var27, arg2, var25, var28, arg5);
        } else if (arg0 == 4) {
            int var23 = this.field7344 - this.field7329;
            for (int var24 = 0; var24 < this.field7369; var24++) {
                this.field7385[var24] = this.field7385[var24] + var23 - (-arg3.method426(this.field7293[var24] + arg4, this.field7316[var24] + arg6) + arg5);
            }
        } else if (arg0 == 5) {
            int var16 = this.field7344 - this.field7329;
            for (int var17 = 0; var17 < this.field7369; var17++) {
                int var18 = this.field7293[var17] + arg4;
                int var19 = this.field7316[var17] + arg6;
                int var20 = arg2.method426(var18, var19);
                int var21 = arg3.method426(var18, var19);
                int var22 = var20 - var21;
                this.field7385[var17] = -arg5 - (-var20 - ((this.field7385[var17] << 8) / var16 * var22 >> 8));
            }
        }
        if (this.field7294 != null) {
            this.field7294.field6975 = null;
        }
        this.field7313 = false;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 1754)
    public static void method2975(int arg0) {
        field7381 = null;
        field7391 = null;
        field7393 = null;
        if (arg0 < 109) {
            method2976(-24, 66, true);
        }
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "()Z", line = 1766)
    public final boolean method461() {
        field7328++;
        if (this.field7337 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field7337.length; var1++) {
            if (this.field7337[var1] != -1 && !this.field7366.field425.method1776(this.field7337[var1], 19378)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ip", name = "NA", descriptor = "()I", line = 1789)
    public final int method450() {
        if (!this.field7313) {
            this.method2984(16383);
        }
        field7341++;
        return this.field7368;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIZ)V", line = 1806)
    public static final void method2976(int arg0, int arg1, boolean arg2) {
        field7386++;
        class110 var3 = class455.method2749(22, arg2, arg0);
        if (var3 != null) {
            for (int var4 = arg1; var4 < var3.field1558.length; var4++) {
                var3.field1558[var4] = -1;
                var3.field1555[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "()I", line = 1828)
    public final int method460() {
        field7314++;
        return this.field7358;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILc;Z)Z", line = 1843)
    public final boolean method443(int arg0, int arg1, class122 arg2, boolean arg3) {
        field7321++;
        class231 var5 = (class231) arg2;
        class231 var6 = this.field7366.field5400;
        float var7 = var5.field3376 * var6.field3402 + var5.field3407 * var6.field3386 + var5.field3399 * var6.field3401 + var6.field3407;
        float var8 = var5.field3376 * var6.field3381 + var5.field3407 * var6.field3378 + var5.field3399 * var6.field3396 + var6.field3399;
        class407.field6070 = var5.field3377 * var6.field3381 + var5.field3402 * var6.field3378 + var5.field3381 * var6.field3396;
        class24.field290 = var5.field3392 * var6.field3402 + var5.field3401 * var6.field3386 + var5.field3396 * var6.field3401;
        class166.field2355 = var5.field3377 * var6.field3377 + var5.field3402 * var6.field3400 + var5.field3381 * var6.field3392;
        class228.field3326 = var5.field3377 * var6.field3402 + var5.field3402 * var6.field3386 + var5.field3381 * var6.field3401;
        class273.field4035 = var5.field3392 * var6.field3377 + var5.field3401 * var6.field3400 + var5.field3396 * var6.field3392;
        class500.field7421 = var5.field3400 * var6.field3402 + var5.field3386 * var6.field3386 + var5.field3378 * var6.field3401;
        float var9 = var5.field3376 * var6.field3377 + var5.field3407 * var6.field3400 + var5.field3399 * var6.field3392 + var6.field3376;
        class203.field2946 = var5.field3400 * var6.field3377 + var5.field3386 * var6.field3400 + var5.field3378 * var6.field3392;
        class167.field2374 = var5.field3392 * var6.field3381 + var5.field3401 * var6.field3378 + var5.field3396 * var6.field3396;
        class420.field6220 = var5.field3400 * var6.field3381 + var5.field3386 * var6.field3378 + var5.field3378 * var6.field3396;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field7366.field5417;
        int var16 = this.field7366.field5360;
        if (!this.field7313) {
            this.method2984(16383);
        }
        class135.field1946[0] = this.field7352;
        class148.field2069[0] = this.field7329;
        class135.field1946[1] = this.field7368;
        class256.field3749[0] = this.field7322;
        class148.field2069[1] = this.field7329;
        class256.field3749[1] = this.field7322;
        class135.field1946[2] = this.field7352;
        class148.field2069[2] = this.field7344;
        class256.field3749[2] = this.field7322;
        class135.field1946[3] = this.field7368;
        class148.field2069[3] = this.field7344;
        class135.field1946[4] = this.field7352;
        class256.field3749[3] = this.field7322;
        class148.field2069[4] = this.field7329;
        class135.field1946[5] = this.field7368;
        class256.field3749[4] = this.field7297;
        class148.field2069[5] = this.field7329;
        class135.field1946[6] = this.field7352;
        class256.field3749[5] = this.field7297;
        class148.field2069[6] = this.field7344;
        class256.field3749[6] = this.field7297;
        class135.field1946[7] = this.field7368;
        class148.field2069[7] = this.field7344;
        class256.field3749[7] = this.field7297;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class148.field2069[var17];
            float var37 = (float) class135.field1946[var17];
            float var38 = (float) class256.field3749[var17];
            float var39 = class166.field2355 * var38 + class273.field4035 * var36 + class203.field2946 * var37 + var9;
            float var40 = class407.field6070 * var38 + class420.field6220 * var37 + class167.field2374 * var36 + var8;
            float var41 = class228.field3326 * var38 + class500.field7421 * var37 + class24.field290 * var36 + var7;
            if (var39 >= (float) this.field7366.field5344) {
                float var42 = (float) var15 * var41 / var39 + (float) this.field7366.field5362;
                if (var42 < var11) {
                    var11 = var42;
                }
                if (var42 > var12) {
                    var12 = var42;
                }
                float var43 = (float) var16 * var40 / var39 + (float) this.field7366.field5367;
                var10 = true;
                if (var13 > var43) {
                    var13 = var43;
                }
                if (var14 < var43) {
                    var14 = var43;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && (float) arg0 < var12 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (class527.field7752.length < this.field7342) {
                class22.field245 = new int[this.field7342];
                class527.field7752 = new int[this.field7342];
            }
            for (int var18 = 0; var18 < this.field7369; var18++) {
                float var20 = (float) this.field7293[var18];
                float var21 = (float) this.field7385[var18];
                float var22 = (float) this.field7316[var18];
                float var23 = class228.field3326 * var22 + class500.field7421 * var20 + class24.field290 * var21 + var7;
                float var24 = class166.field2355 * var22 + class273.field4035 * var21 + class203.field2946 * var20 + var9;
                float var25 = class407.field6070 * var22 + class420.field6220 * var20 + class167.field2374 * var21 + var8;
                if ((float) this.field7366.field5344 <= var24) {
                    int var26 = (int) ((float) var15 * var23 / var24 + (float) this.field7366.field5362);
                    int var27 = (int) ((float) var16 * var25 / var24 + (float) this.field7366.field5367);
                    int var28 = this.field7360[var18];
                    int var29 = this.field7360[var18 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field7375[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        class527.field7752[var31] = var26;
                        class22.field245[var31] = var27;
                    }
                } else {
                    int var32 = this.field7360[var18];
                    int var33 = this.field7360[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field7375[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class527.field7752[this.field7375[var34] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field7380; var19++) {
                if (class527.field7752[this.field7343[var19]] != -999999 && class527.field7752[this.field7309[var19]] != -999999 && class527.field7752[this.field7325[var19]] != -999999 && this.method2986(false, class527.field7752[this.field7343[var19]], class22.field245[this.field7343[var19]], class527.field7752[this.field7325[var19]], arg1, class527.field7752[this.field7309[var19]], class22.field245[this.field7309[var19]], class22.field245[this.field7325[var19]], arg0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "()I", line = 2053)
    public final int method433() {
        if (!this.field7313) {
            this.method2984(16383);
        }
        field7387++;
        return this.field7297;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V", line = 2068)
    private final void method2977(boolean arg0) {
        field7367++;
        if (this.field7281 == 0) {
            return;
        }
        if (this.field7334 != 0) {
            this.method2979(-12, true);
        }
        this.method2979(-12, arg0);
        if (this.field7301 != null) {
            if (this.field7301.field99 == null) {
                this.method2988((this.field7334 & 0x10) != 0, false);
            }
            if (this.field7301.field99 != null) {
                this.field7366.method2189(this.field7372 != null, -126);
                this.field7366.method2217(this.field7303, 126, this.field7372, this.field7356, this.field7294);
                int var2 = this.field7376.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field7376[var3];
                    int var5 = this.field7376[var3 + 1];
                    int var6 = this.field7337[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field7366.method2221(true, var6, this.field7372 != null);
                    this.field7366.method2250(var4 * 3, (var5 - var4) * 3, 4, this.field7301.field99, (byte) -95);
                }
            }
        }
        this.method2987(-128);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIBBS)I", line = 2125)
    private final int method2978(int arg0, int arg1, byte arg2, byte arg3, short arg4) {
        field7304++;
        if (arg2 != 105) {
            this.method470();
        }
        int var6 = class37.field413[class516.method3071(arg1, arg2 ^ 0x69, arg0)];
        if (arg4 != -1) {
            class104 var7 = this.field7366.field425.method1780(-31305, arg4 & 0xFFFF);
            int var8 = var7.field1444 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg1 < 0) {
                    var9 = 0;
                } else if (arg1 <= 127) {
                    var9 = arg1 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field1438 & 0xFF;
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
                var6 = (var14 & 0xFF00) + ((var13 << 8 & 0xFF00F4) + (var15 >> 8));
            }
        }
        return (var6 << 8) + 255 - (arg3 & 0xFF);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lfd;)V", line = 5641)
    public class497(class365 arg0) {
        this.field7366 = arg0;
        this.field7294 = new class473(null, 5126, 3, 0);
        this.field7356 = new class473(null, 5126, 2, 0);
        this.field7372 = new class473(null, 5126, 3, 0);
        this.field7303 = new class473(null, 5121, 4, 0);
        this.field7301 = new class8();
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lfd;Ljq;IIII)V", line = 5653)
    public class497(class365 arg0, class353 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7346 = arg5;
        this.field7366 = arg0;
        this.field7351 = arg2;
        if (class11.method76(arg5, (byte) 127, arg2)) {
            this.field7294 = new class473(null, 5126, 3, 0);
        }
        if (class480.method2896(arg2, arg5, -128)) {
            this.field7356 = new class473(null, 5126, 2, 0);
        }
        if (class91.method809(arg2, arg5, -122)) {
            this.field7372 = new class473(null, 5126, 3, 0);
        }
        if (class199.method1400(arg5, arg2, 127)) {
            this.field7303 = new class473(null, 5121, 4, 0);
        }
        if (class27.method223(arg5, arg2, (byte) -32)) {
            this.field7301 = new class8();
        }
        class277 var7 = arg0.field425;
        int[] var8 = new int[arg1.field4929];
        this.field7360 = new int[arg1.field4915 + 1];
        for (int var9 = 0; var9 < arg1.field4929; var9++) {
            if ((arg1.field4906 == null || arg1.field4906[var9] != 2) && (arg1.field4939 == null || arg1.field4939[var9] == -1 || !var7.method1780(-31305, arg1.field4939[var9] & 0xFFFF).field1448)) {
                var8[this.field7380++] = var9;
                this.field7360[arg1.field4898[var9]]++;
                this.field7360[arg1.field4895[var9]]++;
                this.field7360[arg1.field4890[var9]]++;
            }
        }
        this.field7281 = this.field7380;
        long[] var10 = new long[this.field7380];
        boolean var11 = (this.field7351 & 0x100) != 0;
        label492: for (int var12 = 0; var12 < this.field7380; var12++) {
            int var180 = var8[var12];
            class104 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field4909 != null) {
                for (int var186 = 0; var186 < arg1.field4909.length; var186++) {
                    class130 var187 = arg1.field4909[var186];
                    if (var187.field1869 == var180) {
                        class224 var188 = class213.method1460(true, var187.field1874);
                        if (var188.field3291) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field7281--;
                            continue label492;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field4939 != null) {
                var189 = arg1.field4939[var180];
                if (var189 != -1) {
                    var181 = var7.method1780(-31305, var189 & 0xFFFF);
                    var184 = var181.field1443;
                    var185 = var181.field1442;
                }
            }
            boolean var190 = arg1.field4932 != null && arg1.field4932[var180] != 0 || var181 != null && !var181.field1440;
            if ((var11 || var190) && arg1.field4893 != null) {
                var182 += arg1.field4893[var180] << 17;
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
        class112.method910(var8, var10, 29621);
        this.field7369 = arg1.field4915;
        this.field7293 = arg1.field4904;
        this.field7385 = arg1.field4889;
        this.field7347 = arg1.field4892;
        this.field7316 = arg1.field4936;
        this.field7283 = arg1.field4912;
        this.field7359 = arg1.field4925;
        this.field7357 = arg1.field4907;
        class515[] var13 = new class515[this.field7369];
        if (arg1.field4909 != null) {
            this.field7378 = arg1.field4909.length;
            this.field7371 = new class377[this.field7378];
            this.field7327 = new class441[this.field7378];
            for (int var14 = 0; var14 < this.field7378; var14++) {
                class130 var15 = arg1.field4909[var14];
                class224 var16 = class213.method1460(true, var15.field1874);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field7380; var18++) {
                    if (var8[var18] == var15.field1869) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class37.field413[arg1.field4914[var15.field1869] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field4932 == null ? 0 : arg1.field4932[var15.field1869]) << 24;
                this.field7371[var14] = new class377(var17, arg1.field4898[var15.field1869], arg1.field4895[var15.field1869], arg1.field4890[var15.field1869], var16.field3285, var16.field3292, var16.field3283, var16.field3282, var16.field3290, var16.field3291, var16.field3280, var15.field1876);
                this.field7327[var14] = new class441(var20);
            }
        }
        int var21 = this.field7380 * 3;
        this.field7349 = new float[var21];
        this.field7350 = new byte[this.field7380];
        this.field7282 = new float[var21];
        this.field7337 = new short[this.field7380];
        this.field7389 = (short) arg3;
        this.field7375 = new short[var21];
        this.field7289 = new short[var21];
        class32.field370 = new long[var21];
        this.field7295 = new short[var21];
        if (arg1.field4899 != null) {
            this.field7302 = new short[this.field7380];
        }
        this.field7296 = new short[var21];
        this.field7343 = new short[this.field7380];
        this.field7358 = (short) arg4;
        this.field7309 = new short[this.field7380];
        this.field7325 = new short[this.field7380];
        this.field7288 = new short[this.field7380];
        this.field7361 = new byte[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field4915; var23++) {
            int var179 = this.field7360[var23];
            this.field7360[var23] = var22;
            var13[var23] = new class515();
            var22 += var179;
        }
        this.field7360[arg1.field4915] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field4938 != null) {
            int var28 = arg1.field4940;
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
            for (int var36 = 0; var36 < this.field7380; var36++) {
                int var43 = var8[var36];
                if (arg1.field4938[var43] != -1) {
                    int var44 = arg1.field4938[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field4898[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field4895[var43];
                        } else {
                            var46 = arg1.field4890[var43];
                        }
                        int var47 = arg1.field4904[var46];
                        int var48 = arg1.field4889[var46];
                        int var49 = arg1.field4936[var46];
                        if (var29[var44] > var47) {
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
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var27 = new float[var28][];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field4941[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field4931[var37];
                        var40 = 64.0F / (float) arg1.field4928[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 > 0) {
                            var41 = 1.0F;
                            var42 = (float) var39 / 1024.0F;
                        } else {
                            var42 = 1.0F;
                            var41 = (float) (-var39) / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var42 = 64.0F / (float) arg1.field4934[var37];
                        var41 = 64.0F / (float) arg1.field4931[var37];
                        var40 = 64.0F / (float) arg1.field4928[var37];
                    } else {
                        var42 = (float) arg1.field4934[var37] / 1024.0F;
                        var40 = (float) arg1.field4928[var37] / 1024.0F;
                        var41 = (float) arg1.field4931[var37] / 1024.0F;
                    }
                    var27[var37] = class522.method3101(var41, class345.method2089(255, arg1.field4891[var37]), arg1.field4887[var37], arg1.field4923[var37], arg1.field4894[var37], (byte) -66, var40, var42);
                }
            }
        }
        class520[] var50 = new class520[arg1.field4929];
        for (int var51 = 0; var51 < arg1.field4929; var51++) {
            short var158 = arg1.field4898[var51];
            short var159 = arg1.field4895[var51];
            short var160 = arg1.field4890[var51];
            int var161 = this.field7293[var159] - this.field7293[var158];
            int var162 = this.field7385[var159] - this.field7385[var158];
            int var163 = this.field7316[var159] - this.field7316[var158];
            int var164 = this.field7293[var160] - this.field7293[var158];
            int var165 = this.field7385[var160] - this.field7385[var158];
            int var166 = this.field7316[var160] - this.field7316[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169;
            for (var169 = var161 * var165 - (var162 * var164); var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field4906 == null ? 0 : arg1.field4906[var51];
            if (var174 == 0) {
                class515 var176 = var13[var158];
                var176.field7586++;
                var176.field7583 += var172;
                var176.field7579 += var171;
                var176.field7575 += var173;
                class515 var177 = var13[var159];
                var177.field7579 += var171;
                var177.field7583 += var172;
                var177.field7586++;
                var177.field7575 += var173;
                class515 var178 = var13[var160];
                var178.field7579 += var171;
                var178.field7575 += var173;
                var178.field7583 += var172;
                var178.field7586++;
            } else if (var174 == 1) {
                class520 var175 = var50[var51] = new class520();
                var175.field7639 = var172;
                var175.field7640 = var173;
                var175.field7642 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field7380; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field4914[var68] & 0xFFFF;
            short var70;
            if (arg1.field4939 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field4939[var68];
            }
            int var71;
            if (arg1.field4938 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field4938[var68];
            }
            int var72;
            if (arg1.field4932 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field4932[var68] & 0xFF;
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
                    var76 = 1.0F;
                    var78 = 0.0F;
                    var74 = 1.0F;
                    var73 = 0.0F;
                    var80 = 2;
                    var77 = 0.0F;
                    var75 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field4941[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field4898[var68];
                        short var112 = arg1.field4895[var68];
                        short var113 = arg1.field4890[var68];
                        short var114 = arg1.field4894[var71];
                        short var115 = arg1.field4887[var71];
                        short var116 = arg1.field4923[var71];
                        float var117 = (float) arg1.field4904[var114];
                        float var118 = (float) arg1.field4889[var114];
                        float var119 = (float) arg1.field4936[var114];
                        float var120 = (float) arg1.field4904[var115] - var117;
                        float var121 = (float) arg1.field4889[var115] - var118;
                        float var122 = (float) arg1.field4936[var115] - var119;
                        float var123 = (float) arg1.field4904[var116] - var117;
                        float var124 = (float) arg1.field4889[var116] - var118;
                        float var125 = (float) arg1.field4936[var116] - var119;
                        float var126 = (float) arg1.field4904[var111] - var117;
                        float var127 = (float) arg1.field4889[var111] - var118;
                        float var128 = (float) arg1.field4936[var111] - var119;
                        float var129 = (float) arg1.field4904[var112] - var117;
                        float var130 = (float) arg1.field4889[var112] - var118;
                        float var131 = (float) arg1.field4936[var112] - var119;
                        float var132 = (float) arg1.field4904[var113] - var117;
                        float var133 = (float) arg1.field4889[var113] - var118;
                        float var134 = (float) arg1.field4936[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - (var121 * var123);
                        float var138 = var124 * var137 - (var125 * var136);
                        float var139 = var125 * var135 - var123 * var137;
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        float var142 = var120 * var136 - (var121 * var135);
                        float var143 = var121 * var137 - var122 * var136;
                        float var144 = var122 * var135 - var120 * var137;
                        float var145 = 1.0F / (var125 * var142 + var123 * var143 + var124 * var144);
                        var76 = (var131 * var142 + var129 * var143 + var130 * var144) * var145;
                        var74 = (var128 * var142 + var126 * var143 + var127 * var144) * var145;
                        var78 = (var134 * var142 + var132 * var143 + var133 * var144) * var145;
                    } else {
                        short var83 = arg1.field4898[var68];
                        short var84 = arg1.field4895[var68];
                        short var85 = arg1.field4890[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field4937[var71];
                        float var91 = (float) arg1.field4942[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field4934[var71] / 1024.0F;
                            class24.method198(arg1.field4936[var83], var91, var87, 8, arg1.field4889[var83], var89, arg1.field4904[var83], var86, var92, var90, var88);
                            var74 = class444.field6576;
                            var73 = class113.field1584;
                            class24.method198(arg1.field4936[var84], var91, var87, 8, arg1.field4889[var84], var89, arg1.field4904[var84], var86, var92, var90, var88);
                            var75 = class113.field1584;
                            var76 = class444.field6576;
                            class24.method198(arg1.field4936[var85], var91, var87, 8, arg1.field4889[var85], var89, arg1.field4904[var85], var86, var92, var90, var88);
                            var77 = class113.field1584;
                            var78 = class444.field6576;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var75 - var73 > var93) {
                                    var75 -= var92;
                                    var79 = 1;
                                } else if (var93 < var73 - var75) {
                                    var79 = 2;
                                    var75 += var92;
                                }
                                if (var93 < var77 - var73) {
                                    var80 = 1;
                                    var77 -= var92;
                                } else if (var93 < var73 - var77) {
                                    var77 += var92;
                                    var80 = 2;
                                }
                            } else {
                                if ((var93 < var76 - var74)) {
                                    var76 -= var92;
                                    var79 = 1;
                                } else if (var74 - var76 > var93) {
                                    var76 += var92;
                                    var79 = 2;
                                }
                                if (var78 - var74 > var93) {
                                    var80 = 1;
                                    var78 -= var92;
                                } else if (var74 - var78 > var93) {
                                    var80 = 2;
                                    var78 += var92;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field4896[var71] / 256.0F;
                            float var95 = (float) arg1.field4927[var71] / 256.0F;
                            int var96 = arg1.field4904[var84] - arg1.field4904[var83];
                            int var97 = arg1.field4889[var84] - arg1.field4889[var83];
                            int var98 = arg1.field4936[var84] - arg1.field4936[var83];
                            int var99 = arg1.field4904[var85] - arg1.field4904[var83];
                            int var100 = arg1.field4889[var85] - arg1.field4889[var83];
                            int var101 = arg1.field4936[var85] - arg1.field4936[var83];
                            int var102 = var97 * var101 - var98 * var100;
                            int var103 = var98 * var99 - (var96 * var101);
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field4931[var71];
                            float var106 = 64.0F / (float) arg1.field4928[var71];
                            float var107 = 64.0F / (float) arg1.field4934[var71];
                            float var108 = (var89[2] * (float) var104 + var89[1] * (float) var103 + var89[0] * (float) var102) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[4] * (float) var103 + var89[3] * (float) var102) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[7] * (float) var103 + var89[6] * (float) var102) / var107;
                            var81 = class293.method1855((byte) -91, var108, var110, var109);
                            class397.method2431(var89, true, var94, var91, arg1.field4904[var83], var95, arg1.field4889[var83], var88, var81, var90, var86, var87, arg1.field4936[var83]);
                            var73 = class178.field2513;
                            var74 = class332.field4622;
                            class397.method2431(var89, true, var94, var91, arg1.field4904[var84], var95, arg1.field4889[var84], var88, var81, var90, var86, var87, arg1.field4936[var84]);
                            var75 = class178.field2513;
                            var76 = class332.field4622;
                            class397.method2431(var89, true, var94, var91, arg1.field4904[var85], var95, arg1.field4889[var85], var88, var81, var90, var86, var87, arg1.field4936[var85]);
                            var77 = class178.field2513;
                            var78 = class332.field4622;
                        } else if (var82 == 3) {
                            class160.method1132(arg1.field4936[var83], var91, arg1.field4904[var83], var86, true, arg1.field4889[var83], var89, var90, var87, var88);
                            var74 = class386.field5695;
                            var73 = class349.field4835;
                            class160.method1132(arg1.field4936[var84], var91, arg1.field4904[var84], var86, true, arg1.field4889[var84], var89, var90, var87, var88);
                            var75 = class349.field4835;
                            var76 = class386.field5695;
                            class160.method1132(arg1.field4936[var85], var91, arg1.field4904[var85], var86, true, arg1.field4889[var85], var89, var90, var87, var88);
                            var77 = class349.field4835;
                            var78 = class386.field5695;
                            if ((var90 & 0x1) == 0) {
                                if (var77 - var73 > 0.5F) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if (var78 - var74 > 0.5F) {
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
            if (arg1.field4906 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field4906[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var81 << 24) + (long) var72 + (long) (var69 << 8) << 32) + (long) (var71 << 2);
                short var152 = arg1.field4898[var68];
                short var153 = arg1.field4895[var68];
                short var154 = arg1.field4890[var68];
                class515 var155 = var13[var152];
                this.field7343[var52] = this.method2983(var155.field7575, var150, var74, var73, var155.field7586, (byte) 5, var155.field7583, var152, arg1, var155.field7579);
                class515 var156 = var13[var153];
                this.field7309[var52] = this.method2983(var156.field7575, (long) var79 + var150, var76, var75, var156.field7586, (byte) 5, var156.field7583, var153, arg1, var156.field7579);
                class515 var157 = var13[var154];
                this.field7325[var52] = this.method2983(var157.field7575, (long) var80 + var150, var78, var77, var157.field7586, (byte) 5, var157.field7583, var154, arg1, var157.field7579);
            } else if (var146 == 1) {
                class520 var147 = var50[var68];
                long var148 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) ((var147.field7639 + 256 << 12) + (var147.field7642 > 0 ? 1024 : 2048) + (var147.field7640 + 256 << 22) + (var71 << 2));
                this.field7343[var52] = this.method2983(var147.field7640, var148, var74, var73, 0, (byte) 5, var147.field7639, arg1.field4898[var68], arg1, var147.field7642);
                this.field7309[var52] = this.method2983(var147.field7640, (long) var79 + var148, var76, var75, 0, (byte) 5, var147.field7639, arg1.field4895[var68], arg1, var147.field7642);
                this.field7325[var52] = this.method2983(var147.field7640, (long) var80 + var148, var78, var77, 0, (byte) 5, var147.field7639, arg1.field4890[var68], arg1, var147.field7642);
            }
            if (arg1.field4939 == null) {
                this.field7337[var52] = -1;
            } else {
                this.field7337[var52] = arg1.field4939[var68];
            }
            if (arg1.field4932 != null) {
                this.field7350[var52] = arg1.field4932[var68];
            }
            if (arg1.field4899 != null) {
                this.field7302[var52] = arg1.field4899[var68];
            }
            this.field7288[var52] = arg1.field4914[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field7281; var55++) {
            short var67 = this.field7337[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field7376 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field7281; var58++) {
            short var66 = this.field7337[var58];
            if (var56 != var66) {
                var56 = var66;
                this.field7376[var57++] = var58;
            }
        }
        this.field7376[var57] = this.field7281;
        class32.field370 = null;
        this.field7296 = class158.method1127(0, this.field7296, this.field7342);
        this.field7289 = class158.method1127(0, this.field7289, this.field7342);
        this.field7295 = class158.method1127(0, this.field7295, this.field7342);
        this.field7361 = class10.method69((byte) 106, this.field7361, this.field7342);
        this.field7349 = class149.method1079(this.field7342, this.field7349, 0);
        this.field7282 = class149.method1079(this.field7342, this.field7282, 0);
        if (arg1.field4922 != null && class33.method263(this.field7346, -128, arg2)) {
            this.field7370 = arg1.method2133((byte) 81);
        }
        if (arg1.field4909 != null && class431.method2616(-18445, arg2, this.field7346)) {
            this.field7286 = arg1.method2120((byte) 61);
        }
        if (arg1.field4908 != null && class470.method2847((byte) 111, this.field7346, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field7380; var61++) {
                int var65 = arg1.field4908[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field7292 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field7292[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field7380; var63++) {
                int var64 = arg1.field4908[var8[var63]];
                if (var64 >= 0) {
                    this.field7292[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IZ)V", line = 2201)
    private final void method2979(int arg0, boolean arg1) {
        field7345++;
        boolean var3 = this.field7303 != null && this.field7303.field6975 == null;
        boolean var4 = this.field7372 != null && this.field7372.field6975 == null;
        boolean var5 = this.field7294 != null && this.field7294.field6975 == null;
        boolean var6 = this.field7356 != null && this.field7356.field6975 == null;
        if (arg1) {
            var5 &= (this.field7334 & 0x1) != 0;
            var4 &= (this.field7334 & 0x4) != 0;
            var3 &= (this.field7334 & 0x2) != 0;
            var6 &= (this.field7334 & 0x8) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        if (arg0 != -12) {
            return;
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
        if (class118.field1655.field783.length >= this.field7342 * var7) {
            class118.field1655.field827 = 0;
        } else {
            class118.field1655 = new class67((this.field7342 + 100) * var7);
        }
        if (var5) {
            if (this.field7366.field5443) {
                for (int var12 = 0; var12 < this.field7369; var12++) {
                    int var13 = NativeStream.floatToRawIntBits((float) this.field7293[var12]);
                    int var14 = NativeStream.floatToRawIntBits((float) this.field7385[var12]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field7316[var12]);
                    int var16 = this.field7360[var12];
                    int var17 = this.field7360[var12 + 1];
                    for (int var18 = var16; var18 < var17; var18++) {
                        int var19 = this.field7375[var18] - 1;
                        if (var19 == -1) {
                            break;
                        }
                        class118.field1655.field827 = var7 * var19;
                        class118.field1655.method618(var13, (byte) 109);
                        class118.field1655.method618(var14, (byte) -40);
                        class118.field1655.method618(var15, (byte) -64);
                    }
                }
            } else {
                for (int var20 = 0; var20 < this.field7369; var20++) {
                    int var21 = NativeStream.floatToRawIntBits((float) this.field7293[var20]);
                    int var22 = NativeStream.floatToRawIntBits((float) this.field7385[var20]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field7316[var20]);
                    int var24 = this.field7360[var20];
                    int var25 = this.field7360[var20 + 1];
                    for (int var26 = var24; var26 < var25; var26++) {
                        int var27 = this.field7375[var26] - 1;
                        if (var27 == -1) {
                            break;
                        }
                        class118.field1655.field827 = var7 * var27;
                        class118.field1655.method637(arg0 ^ 0x198CD28C, var21);
                        class118.field1655.method637(-428659336, var22);
                        class118.field1655.method637(-428659336, var23);
                    }
                }
            }
        }
        if (var3) {
            if (this.field7372 == null) {
                short[] var30;
                byte[] var31;
                short[] var32;
                short[] var33;
                if (this.field7338 == null) {
                    var33 = this.field7296;
                    var32 = this.field7289;
                    var31 = this.field7361;
                    var30 = this.field7295;
                } else {
                    var30 = this.field7338.field3612;
                    var31 = this.field7338.field3606;
                    var32 = this.field7338.field3605;
                    var33 = this.field7338.field3610;
                }
                float var34 = this.field7366.field5425[0];
                float var35 = this.field7366.field5425[1];
                float var36 = this.field7366.field5425[2];
                float var37 = this.field7366.field5399;
                float var38 = this.field7366.field5414 * 768.0F / (float) this.field7358;
                float var39 = this.field7366.field5380 * 768.0F / (float) this.field7358;
                for (int var40 = 0; var40 < this.field7380; var40++) {
                    int var41 = this.method2978(this.field7288[var40], this.field7389, (byte) 105, this.field7350[var40], this.field7337[var40]);
                    short var42 = this.field7343[var40];
                    float var43 = (float) ((var41 & 0xFF00) >> 8) * this.field7366.field5418;
                    float var44 = (float) (var41 >>> 24) * this.field7366.field5412;
                    float var45 = (float) ((var41 & 0xFFFA5C) >> 16) * this.field7366.field5338;
                    short var46 = (short) var31[var42];
                    float var47;
                    if (var46 == 0) {
                        var47 = ((float) var30[var42] * var36 + (float) var32[var42] * var35 + (float) var33[var42] * var34) * 0.0026041667F;
                    } else {
                        var47 = ((float) var30[var42] * var36 + (float) var32[var42] * var35 + (float) var33[var42] * var34) / (float) (var46 * 256);
                    }
                    float var48 = var37 + (var47 < 0.0F ? var39 : var38) * var47;
                    int var49 = (int) (var44 * var48);
                    int var50 = (int) (var45 * var48);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var51 = (int) (var43 * var48);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    class118.field1655.field827 = var7 * var42 + var9;
                    class118.field1655.method638(255, var49);
                    class118.field1655.method638(255, var50);
                    class118.field1655.method638(arg0 + 267, var51);
                    class118.field1655.method638(255, 255 - (this.field7350[var40] & 0xFF));
                    short var52 = this.field7309[var40];
                    short var53 = (short) var31[var52];
                    float var54;
                    if (var53 == 0) {
                        var54 = ((float) var30[var52] * var36 + (float) var32[var52] * var35 + (float) var33[var52] * var34) * 0.0026041667F;
                    } else {
                        var54 = ((float) var30[var52] * var36 + (float) var32[var52] * var35 + (float) var33[var52] * var34) / (float) (var53 * 256);
                    }
                    float var55 = var54 * (var54 < 0.0F ? var39 : var38) + var37;
                    int var56 = (int) (var44 * var55);
                    int var57 = (int) (var45 * var55);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var43 * var55);
                    class118.field1655.field827 = var7 * var52 + var9;
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    class118.field1655.method638(arg0 ^ 0xFFFFFF0B, var56);
                    class118.field1655.method638(arg0 + 267, var57);
                    class118.field1655.method638(255, var58);
                    class118.field1655.method638(255, 255 - (this.field7350[var40] & 0xFF));
                    short var59 = this.field7325[var40];
                    short var60 = (short) var31[var59];
                    float var61;
                    if (var60 == 0) {
                        var61 = ((float) var30[var59] * var36 + (float) var32[var59] * var35 + (float) var33[var59] * var34) * 0.0026041667F;
                    } else {
                        var61 = ((float) var30[var59] * var36 + (float) var32[var59] * var35 + (float) var33[var59] * var34) / (float) (var60 * 256);
                    }
                    float var62 = var37 + (var61 < 0.0F ? var39 : var38) * var61;
                    int var63 = (int) (var44 * var62);
                    int var64 = (int) (var45 * var62);
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
                    int var65 = (int) (var43 * var62);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    class118.field1655.field827 = var9 + (var7 * var59);
                    class118.field1655.method638(arg0 ^ 0xFFFFFF0B, var63);
                    class118.field1655.method638(arg0 + 267, var64);
                    class118.field1655.method638(255, var65);
                    class118.field1655.method638(255, 255 - (this.field7350[var40] & 0xFF));
                }
            } else {
                for (int var28 = 0; var28 < this.field7380; var28++) {
                    int var29 = this.method2978(this.field7288[var28], this.field7389, (byte) 105, this.field7350[var28], this.field7337[var28]);
                    class118.field1655.field827 = this.field7343[var28] * var7 + var9;
                    class118.field1655.method618(var29, (byte) -37);
                    class118.field1655.field827 = var9 + (this.field7309[var28] * var7);
                    class118.field1655.method618(var29, (byte) 120);
                    class118.field1655.field827 = this.field7325[var28] * var7 + var9;
                    class118.field1655.method618(var29, (byte) -97);
                }
            }
        }
        if (var4) {
            short[] var66;
            short[] var67;
            byte[] var68;
            short[] var69;
            if (this.field7338 == null) {
                var67 = this.field7289;
                var68 = this.field7361;
                var66 = this.field7295;
                var69 = this.field7296;
            } else {
                var66 = this.field7338.field3612;
                var67 = this.field7338.field3605;
                var68 = this.field7338.field3606;
                var69 = this.field7338.field3610;
            }
            float var70 = 3.0F / (float) this.field7358;
            class118.field1655.field827 = var10;
            float var71 = 3.0F / (float) (this.field7358 + (this.field7358 / 2));
            if (this.field7366.field5443) {
                for (int var72 = 0; var72 < this.field7342; var72++) {
                    int var73 = var68[var72] & 0xFF;
                    if (var73 == 0) {
                        class118.field1655.method655((float) var69[var72] * var71, (byte) 98);
                        class118.field1655.method655((float) var67[var72] * var71, (byte) 98);
                        class118.field1655.method655((float) var66[var72] * var71, (byte) 98);
                    } else {
                        float var74 = var70 / (float) var73;
                        class118.field1655.method655((float) var69[var72] * var74, (byte) 98);
                        class118.field1655.method655((float) var67[var72] * var74, (byte) 98);
                        class118.field1655.method655((float) var66[var72] * var74, (byte) 98);
                    }
                    class118.field1655.field827 += var7 - 12;
                }
            } else {
                for (int var75 = 0; var75 < this.field7342; var75++) {
                    int var76 = var68[var75] & 0xFF;
                    if (var76 == 0) {
                        class118.field1655.method651((float) var69[var75] * var71, 1739667504);
                        class118.field1655.method651((float) var67[var75] * var71, arg0 + 1739667516);
                        class118.field1655.method651((float) var66[var75] * var71, 1739667504);
                    } else {
                        float var77 = var70 / (float) var76;
                        class118.field1655.method651((float) var69[var75] * var77, arg0 + 1739667516);
                        class118.field1655.method651((float) var67[var75] * var77, 1739667504);
                        class118.field1655.method651((float) var66[var75] * var77, 1739667504);
                    }
                    class118.field1655.field827 += var7 - 12;
                }
            }
        }
        if (var6) {
            class118.field1655.field827 = var11;
            if (this.field7366.field5443) {
                for (int var79 = 0; var79 < this.field7342; var79++) {
                    class118.field1655.method655(this.field7349[var79], (byte) 98);
                    class118.field1655.method655(this.field7282[var79], (byte) 98);
                    class118.field1655.field827 += var7 - 8;
                }
            } else {
                for (int var78 = 0; var78 < this.field7342; var78++) {
                    class118.field1655.method651(this.field7349[var78], 1739667504);
                    class118.field1655.method651(this.field7282[var78], arg0 + 1739667516);
                    class118.field1655.field827 += var7 - 8;
                }
            }
        }
        class118.field1655.field827 = this.field7342 * var7;
        class30 var80;
        if (arg1) {
            if (this.field7392 == null) {
                this.field7392 = this.field7366.method2243(arg0 ^ 0xFFFFFFF4, class118.field1655.field827, class118.field1655.field783, true, var7);
            } else {
                this.field7392.method240((byte) -85, class118.field1655.field827, var7, class118.field1655.field783);
            }
            var80 = this.field7392;
            this.field7334 = 0;
        } else {
            var80 = this.field7366.method2243(arg0 + 12, class118.field1655.field827, class118.field1655.field783, false, var7);
            this.field7336 = true;
        }
        if (var5) {
            this.field7294.field6976 = var8;
            this.field7294.field6975 = var80;
        }
        if (var6) {
            this.field7356.field6975 = var80;
            this.field7356.field6976 = var11;
        }
        if (var3) {
            this.field7303.field6975 = var80;
            this.field7303.field6976 = var9;
        }
        if (var4) {
            this.field7372.field6976 = var10;
            this.field7372.field6975 = var80;
        }
    }

    @OriginalMember(owner = "client!ip", name = "aa", descriptor = "(I)V", line = 2723)
    public final void method452(int arg0) {
        field7355++;
        if (this.field7303 != null) {
            this.field7303.field6975 = null;
        }
        this.field7358 = (short) arg0;
        if (this.field7372 != null) {
            this.field7372.field6975 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "()Z", line = 2742)
    public final boolean method436() {
        field7306++;
        if (this.field7370 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field7347; var1++) {
            this.field7293[var1] <<= 0x4;
            this.field7385[var1] <<= 0x4;
            this.field7316[var1] <<= 0x4;
        }
        class224.field3289 = 0;
        class479.field7045 = 0;
        class338.field4689 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lgm;I)V", line = 2771)
    private final void method2980(class80 arg0, int arg1) {
        field7363++;
        int var3 = 58 / ((arg1 - 59) / 52);
        if (class527.field7752.length < this.field7342) {
            class527.field7752 = new int[this.field7342];
            class22.field245 = new int[this.field7342];
        }
        for (int var4 = 0; var4 < this.field7369; var4++) {
            int var15 = (this.field7293[var4] - (this.field7385[var4] * this.field7366.field5341 >> 8) >> this.field7366.field5307) - arg0.field1071;
            int var16 = (this.field7316[var4] - (this.field7385[var4] * this.field7366.field5420 >> 8) >> this.field7366.field5307) - arg0.field1069;
            int var17 = this.field7360[var4];
            int var18 = this.field7360[var4 + 1];
            for (int var19 = var17; var19 < var18; var19++) {
                int var20 = this.field7375[var19] - 1;
                if (var20 == -1) {
                    break;
                }
                class527.field7752[var20] = var15;
                class22.field245[var20] = var16;
            }
        }
        for (int var5 = 0; var5 < this.field7281; var5++) {
            if (this.field7350 == null || this.field7350[var5] <= 128) {
                short var6 = this.field7343[var5];
                short var7 = this.field7309[var5];
                short var8 = this.field7325[var5];
                int var9 = class527.field7752[var6];
                int var10 = class527.field7752[var7];
                int var11 = class527.field7752[var8];
                int var12 = class22.field245[var6];
                int var13 = class22.field245[var7];
                int var14 = class22.field245[var8];
                if ((var13 - var14) * (var9 - var10) - (var11 - var10) * (var13 - var12) > 0) {
                    arg0.method728(var9, var13, var12, false, var10, var14, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(Z)V", line = 2855)
    private final void method2981(boolean arg0) {
        if (arg0) {
            return;
        }
        field7384++;
        if (this.field7371 == null) {
            return;
        }
        class231 var2 = this.field7366.field5302;
        float var3 = this.field7366.method361();
        float var4 = this.field7366.method395();
        this.field7366.method2248((byte) 126);
        this.field7366.method390(false);
        this.field7366.method2189(false, 115);
        this.field7366.method2217(null, 126, null, this.field7366.field5370, this.field7366.field5377);
        for (int var5 = 0; var5 < this.field7378; var5++) {
            class377 var6 = this.field7371[var5];
            class441 var7 = this.field7327[var5];
            if (!var6.field5578 || !this.field7366.method378()) {
                float var8 = (float) (this.field7293[var6.field5582] + this.field7293[var6.field5580] + this.field7293[var6.field5572]) * 0.3333333F;
                float var9 = (float) (this.field7385[var6.field5582] + this.field7385[var6.field5572] + this.field7385[var6.field5580]) * 0.3333333F;
                float var10 = (float) (this.field7316[var6.field5582] + this.field7316[var6.field5580] + this.field7316[var6.field5572]) * 0.3333333F;
                float var11 = class228.field3326 * var10 + class500.field7421 * var8 + class24.field290 * var9 + class95.field1283;
                float var12 = class407.field6070 * var10 + class420.field6220 * var8 + class167.field2374 * var9 + class474.field6986;
                float var13 = class166.field2355 * var10 + class273.field4035 * var9 + class203.field2946 * var8 + class270.field3986;
                var2.method1551(0, var7.field6551, var6.field5583 * var7.field6547 >> 7, (float) var7.field6552 - var12, var6.field5575 * var7.field6554 >> 7, (float) var7.field6555 + var11, -var13);
                this.field7366.method2225(var2, -24);
                this.field7366.method319(var4, var3 - (float) var6.field5573 * 1.5F);
                int var14 = var7.field6549;
                OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                this.field7366.method2240(false, var6.field5584);
                this.field7366.method2241(116, var6.field5576);
                this.field7366.method2183(7681, var6.field5577);
                this.field7366.method2208(1, 0, 7, 4);
            }
        }
        this.field7366.method319(var4, var3);
        this.field7366.method390(true);
        this.field7366.method2199(1);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lc;Lmi;II)V", line = 2920)
    public final void method464(class122 arg0, class341 arg1, int arg2, int arg3) {
        field7318++;
        if (this.field7342 == 0) {
            return;
        }
        class231 var5 = this.field7366.field5400;
        if (!this.field7313) {
            this.method2984(16383);
        }
        class231 var6 = (class231) arg0;
        class270.field3986 = var5.field3377 * var6.field3376 + var5.field3400 * var6.field3407 + var5.field3392 * var6.field3399 + var5.field3376;
        class273.field4035 = var5.field3377 * var6.field3392 + var5.field3400 * var6.field3401 + var5.field3392 * var6.field3396;
        float var7 = (float) this.field7329 * class273.field4035 + class270.field3986;
        float var8 = (float) this.field7344 * class273.field4035 + class270.field3986;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) this.field7312 + var7;
            var10 = var8 - (float) this.field7312;
        } else {
            var9 = (float) this.field7312 + var8;
            var10 = (float) (-this.field7312) + var7;
        }
        if ((var10 >= this.field7366.field5440) || (var9 <= (float) this.field7366.field5344)) {
            return;
        }
        class24.field290 = var5.field3402 * var6.field3392 + var5.field3401 * var6.field3396 + var5.field3386 * var6.field3401;
        class95.field1283 = var5.field3402 * var6.field3376 + var5.field3401 * var6.field3399 + var5.field3386 * var6.field3407 + var5.field3407;
        float var11 = (float) this.field7329 * class24.field290 + class95.field1283;
        float var12 = (float) this.field7344 * class24.field290 + class95.field1283;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field7312 + var11) * (float) this.field7366.field5417;
            var14 = (var12 - (float) this.field7312) * (float) this.field7366.field5417;
        } else {
            var13 = ((float) this.field7312 + var12) * (float) this.field7366.field5417;
            var14 = ((float) (-this.field7312) + var11) * (float) this.field7366.field5417;
        }
        if ((var14 / (float) arg2 >= this.field7366.field5372) || (var13 / (float) arg2 <= this.field7366.field5434)) {
            return;
        }
        class167.field2374 = var5.field3381 * var6.field3392 + var5.field3396 * var6.field3396 + var5.field3378 * var6.field3401;
        class474.field6986 = var5.field3381 * var6.field3376 + var5.field3396 * var6.field3399 + var5.field3378 * var6.field3407 + var5.field3399;
        float var15 = (float) this.field7329 * class167.field2374 + class474.field6986;
        float var16 = (float) this.field7344 * class167.field2374 + class474.field6986;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) (-this.field7312) + var16) * (float) this.field7366.field5360;
            var18 = ((float) this.field7312 + var15) * (float) this.field7366.field5360;
        } else {
            var18 = ((float) this.field7312 + var16) * (float) this.field7366.field5360;
            var17 = (var15 - (float) this.field7312) * (float) this.field7366.field5360;
        }
        if ((this.field7366.field5389 <= var17 / (float) arg2) || (this.field7366.field5357 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field7371 != null) {
            class166.field2355 = var5.field3377 * var6.field3377 + var5.field3400 * var6.field3402 + var5.field3392 * var6.field3381;
            class500.field7421 = var5.field3402 * var6.field3400 + var5.field3401 * var6.field3378 + var5.field3386 * var6.field3386;
            class203.field2946 = var5.field3377 * var6.field3400 + var5.field3400 * var6.field3386 + var5.field3392 * var6.field3378;
            class420.field6220 = var5.field3381 * var6.field3400 + var5.field3396 * var6.field3378 + var5.field3378 * var6.field3386;
            class407.field6070 = var5.field3381 * var6.field3377 + var5.field3396 * var6.field3381 + var5.field3378 * var6.field3402;
            class228.field3326 = var5.field3402 * var6.field3377 + var5.field3401 * var6.field3381 + var5.field3386 * var6.field3402;
        }
        if (arg1 != null) {
            int var19 = this.field7368 + this.field7352 >> 1;
            int var20 = this.field7322 + this.field7297 >> 1;
            int var21 = (int) ((float) var20 * class228.field3326 + (float) this.field7329 * class24.field290 + (float) var19 * class500.field7421 + class95.field1283);
            int var22 = (int) ((float) var20 * class407.field6070 + (float) this.field7329 * class167.field2374 + (float) var19 * class420.field6220 + class474.field6986);
            int var23 = (int) ((float) var20 * class166.field2355 + (float) this.field7329 * class273.field4035 + (float) var19 * class203.field2946 + class270.field3986);
            int var24 = (int) ((float) var20 * class228.field3326 + (float) this.field7344 * class24.field290 + (float) var19 * class500.field7421 + class95.field1283);
            int var25 = (int) ((float) var20 * class407.field6070 + (float) this.field7344 * class167.field2374 + (float) var19 * class420.field6220 + class474.field6986);
            arg1.field4728 = this.field7366.field5417 * var21 / arg2 + this.field7366.field5362;
            arg1.field4726 = this.field7366.field5360 * var22 / arg2 + this.field7366.field5367;
            arg1.field4730 = this.field7366.field5417 * var24 / arg2 + this.field7366.field5362;
            arg1.field4727 = this.field7366.field5367 + (this.field7366.field5360 * var25 / arg2);
            int var26 = (int) ((float) var20 * class166.field2355 + (float) this.field7344 * class273.field4035 + (float) var19 * class203.field2946 + class270.field3986);
            if (var23 < this.field7366.field5344 && this.field7366.field5344 > var26) {
                arg1.field4731 = this.field7366.field5362 + ((this.field7312 + var21) * this.field7366.field5417 / arg2) - arg1.field4728;
                arg1.field4729 = true;
            }
        }
        this.field7366.method2220((float) arg2, (byte) 97);
        this.field7366.method2211(true);
        this.field7366.method2231(0, var6);
        this.method2977(false);
        this.field7366.method2199(1);
        this.method2981(false);
    }

    @OriginalMember(owner = "client!ip", name = "JA", descriptor = "(III)V", line = 3067)
    public final void method446(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field7369; var4++) {
            if (arg0 != 0) {
                this.field7293[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field7385[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field7316[var4] += arg2;
            }
        }
        field7390++;
        if (this.field7294 != null) {
            this.field7294.field6975 = null;
        }
        this.field7313 = false;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILip;ZLip;Z)Lt;", line = 3098)
    private final class471 method2982(int arg0, int arg1, class497 arg2, boolean arg3, class497 arg4, boolean arg5) {
        arg4.field7389 = this.field7389;
        arg4.field7347 = this.field7347;
        arg4.field7369 = this.field7369;
        arg4.field7378 = this.field7378;
        arg4.field7346 = this.field7346;
        arg4.field7351 = arg1;
        arg4.field7342 = this.field7342;
        field7285++;
        arg4.field7358 = this.field7358;
        arg4.field7281 = this.field7281;
        arg4.field7334 = 0;
        arg4.field7380 = this.field7380;
        boolean var7 = class463.method2776(this.field7346, arg1, 2);
        boolean var8 = class484.method2911(arg1, arg0 - 1376317715, this.field7346);
        boolean var9 = class439.method2686((byte) 101, arg1, this.field7346);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg4.field7293 = this.field7293;
            } else if (arg2.field7293 == null || arg2.field7293.length < this.field7347) {
                arg4.field7293 = arg2.field7293 = new int[this.field7347];
            } else {
                arg4.field7293 = arg2.field7293;
            }
            if (!var8) {
                arg4.field7385 = this.field7385;
            } else if (arg2.field7385 == null || arg2.field7385.length < this.field7347) {
                arg4.field7385 = arg2.field7385 = new int[this.field7347];
            } else {
                arg4.field7385 = arg2.field7385;
            }
            if (!var9) {
                arg4.field7316 = this.field7316;
            } else if (arg2.field7316 == null || arg2.field7316.length < this.field7347) {
                arg4.field7316 = arg2.field7316 = new int[this.field7347];
            } else {
                arg4.field7316 = arg2.field7316;
            }
            for (int var11 = 0; var11 < this.field7347; var11++) {
                if (var7) {
                    arg4.field7293[var11] = this.field7293[var11];
                }
                if (var8) {
                    arg4.field7385[var11] = this.field7385[var11];
                }
                if (var9) {
                    arg4.field7316[var11] = this.field7316[var11];
                }
            }
        } else {
            arg4.field7316 = this.field7316;
            arg4.field7385 = this.field7385;
            arg4.field7293 = this.field7293;
        }
        if (class148.method1070(this.field7346, -1, arg1)) {
            arg4.field7294 = arg2.field7294;
            if (arg5) {
                arg4.field7334 = (byte) (arg4.field7334 | 0x1);
            }
            arg4.field7294.field6976 = this.field7294.field6976;
            arg4.field7294.field6975 = this.field7294.field6975;
        } else if (class11.method76(this.field7346, (byte) 122, arg1)) {
            arg4.field7294 = this.field7294;
        } else {
            arg4.field7294 = null;
        }
        if (class209.method1449(this.field7346, arg1, (byte) -91)) {
            if (arg2.field7288 == null || arg2.field7288.length < this.field7380) {
                arg4.field7288 = arg2.field7288 = new short[this.field7380];
            } else {
                arg4.field7288 = arg2.field7288;
            }
            for (int var12 = 0; var12 < this.field7380; var12++) {
                arg4.field7288[var12] = this.field7288[var12];
            }
        } else {
            arg4.field7288 = this.field7288;
        }
        if (class355.method2145(arg1, this.field7346, (byte) -60)) {
            if (arg2.field7350 == null || this.field7380 > arg2.field7350.length) {
                arg4.field7350 = arg2.field7350 = new byte[this.field7380];
            } else {
                arg4.field7350 = arg2.field7350;
            }
            for (int var13 = 0; var13 < this.field7380; var13++) {
                arg4.field7350[var13] = this.field7350[var13];
            }
        } else {
            arg4.field7350 = this.field7350;
        }
        if (class66.method645(-20147, this.field7346, arg1)) {
            if (arg5) {
                arg4.field7334 = (byte) (arg4.field7334 | 0x2);
            }
            arg4.field7303 = arg2.field7303;
            arg4.field7303.field6976 = this.field7303.field6976;
            arg4.field7303.field6975 = this.field7303.field6975;
        } else if (class199.method1400(this.field7346, arg1, arg0 ^ 0x147D)) {
            arg4.field7303 = this.field7303;
        } else {
            arg4.field7303 = null;
        }
        if (class37.method283(this.field7346, -127, arg1)) {
            if (arg2.field7296 == null || arg2.field7296.length < this.field7342) {
                int var14 = this.field7342;
                arg4.field7296 = arg2.field7296 = new short[var14];
                arg4.field7295 = arg2.field7295 = new short[var14];
                arg4.field7289 = arg2.field7289 = new short[var14];
            } else {
                arg4.field7296 = arg2.field7296;
                arg4.field7289 = arg2.field7289;
                arg4.field7295 = arg2.field7295;
            }
            if (this.field7338 == null) {
                for (int var15 = 0; var15 < this.field7342; var15++) {
                    arg4.field7296[var15] = this.field7296[var15];
                    arg4.field7289[var15] = this.field7289[var15];
                    arg4.field7295[var15] = this.field7295[var15];
                }
            } else {
                if (arg2.field7338 == null) {
                    arg2.field7338 = new class245();
                }
                class245 var16 = arg4.field7338 = arg2.field7338;
                if (var16.field3610 == null || var16.field3610.length < this.field7342) {
                    int var17 = this.field7342;
                    var16.field3610 = new short[var17];
                    var16.field3606 = new byte[var17];
                    var16.field3612 = new short[var17];
                    var16.field3605 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field7342; var18++) {
                    arg4.field7296[var18] = this.field7296[var18];
                    arg4.field7289[var18] = this.field7289[var18];
                    arg4.field7295[var18] = this.field7295[var18];
                    var16.field3610[var18] = this.field7338.field3610[var18];
                    var16.field3605[var18] = this.field7338.field3605[var18];
                    var16.field3612[var18] = this.field7338.field3612[var18];
                    var16.field3606[var18] = this.field7338.field3606[var18];
                }
            }
            arg4.field7361 = this.field7361;
        } else {
            arg4.field7361 = this.field7361;
            arg4.field7289 = this.field7289;
            arg4.field7295 = this.field7295;
            arg4.field7338 = this.field7338;
            arg4.field7296 = this.field7296;
        }
        if (class385.method2344(this.field7346, arg1, 25926)) {
            if (arg5) {
                arg4.field7334 = (byte) (arg4.field7334 | 0x4);
            }
            arg4.field7372 = arg2.field7372;
            arg4.field7372.field6975 = this.field7372.field6975;
            arg4.field7372.field6976 = this.field7372.field6976;
        } else if (class91.method809(arg1, this.field7346, 124)) {
            arg4.field7372 = this.field7372;
        } else {
            arg4.field7372 = null;
        }
        if (class457.method2754(arg1, -124, this.field7346)) {
            if (arg2.field7349 == null || arg2.field7349.length < this.field7380) {
                int var19 = this.field7342;
                arg4.field7349 = arg2.field7349 = new float[var19];
                arg4.field7282 = arg2.field7282 = new float[var19];
            } else {
                arg4.field7282 = arg2.field7282;
                arg4.field7349 = arg2.field7349;
            }
            for (int var20 = 0; var20 < this.field7342; var20++) {
                arg4.field7349[var20] = this.field7349[var20];
                arg4.field7282[var20] = this.field7282[var20];
            }
        } else {
            arg4.field7349 = this.field7349;
            arg4.field7282 = this.field7282;
        }
        if (arg0 != 5126) {
            this.field7371 = null;
        }
        if (class219.method1500(arg1, this.field7346, (byte) -50)) {
            if (arg5) {
                arg4.field7334 = (byte) (arg4.field7334 | 0x8);
            }
            arg4.field7356 = arg2.field7356;
            arg4.field7356.field6976 = this.field7356.field6976;
            arg4.field7356.field6975 = this.field7356.field6975;
        } else if (class480.method2896(arg1, this.field7346, -125)) {
            arg4.field7356 = this.field7356;
        } else {
            arg4.field7356 = null;
        }
        if (class150.method1083(arg1, (byte) 118, this.field7346)) {
            if (arg2.field7343 == null || arg2.field7343.length < this.field7380) {
                int var21 = this.field7380;
                arg4.field7325 = arg2.field7325 = new short[var21];
                arg4.field7309 = arg2.field7309 = new short[var21];
                arg4.field7343 = arg2.field7343 = new short[var21];
            } else {
                arg4.field7325 = arg2.field7325;
                arg4.field7309 = arg2.field7309;
                arg4.field7343 = arg2.field7343;
            }
            for (int var22 = 0; var22 < this.field7380; var22++) {
                arg4.field7343[var22] = this.field7343[var22];
                arg4.field7309[var22] = this.field7309[var22];
                arg4.field7325[var22] = this.field7325[var22];
            }
        } else {
            arg4.field7309 = this.field7309;
            arg4.field7325 = this.field7325;
            arg4.field7343 = this.field7343;
        }
        if (class473.method2863(arg1, this.field7346, 0)) {
            if (arg5) {
                arg4.field7334 = (byte) (arg4.field7334 | 0x10);
            }
            arg4.field7301 = arg2.field7301;
            arg4.field7301.field99 = this.field7301.field99;
        } else if (class27.method223(this.field7346, arg1, (byte) -32)) {
            arg4.field7301 = this.field7301;
        } else {
            arg4.field7301 = null;
        }
        if (class513.method3050(arg1, this.field7346, (byte) -99)) {
            if (arg2.field7337 == null || arg2.field7337.length < this.field7380) {
                int var23 = this.field7380;
                arg4.field7337 = arg2.field7337 = new short[var23];
            } else {
                arg4.field7337 = arg2.field7337;
            }
            for (int var24 = 0; var24 < this.field7380; var24++) {
                arg4.field7337[var24] = this.field7337[var24];
            }
        } else {
            arg4.field7337 = this.field7337;
        }
        if (!class237.method1574(this.field7346, arg1, true)) {
            arg4.field7327 = this.field7327;
        } else if (arg2.field7327 == null || arg2.field7327.length < this.field7378) {
            int var26 = this.field7378;
            arg4.field7327 = arg2.field7327 = new class441[var26];
            for (int var27 = 0; var27 < this.field7378; var27++) {
                arg4.field7327[var27] = this.field7327[var27].method2694(23495);
            }
        } else {
            arg4.field7327 = arg2.field7327;
            for (int var25 = 0; var25 < this.field7378; var25++) {
                arg4.field7327[var25].method2691(128, this.field7327[var25]);
            }
        }
        arg4.field7357 = this.field7357;
        arg4.field7371 = this.field7371;
        arg4.field7302 = this.field7302;
        arg4.field7375 = this.field7375;
        arg4.field7292 = this.field7292;
        arg4.field7376 = this.field7376;
        arg4.field7359 = this.field7359;
        if (this.field7313) {
            arg4.field7329 = this.field7329;
            arg4.field7352 = this.field7352;
            arg4.field7368 = this.field7368;
            arg4.field7322 = this.field7322;
            arg4.field7312 = this.field7312;
            arg4.field7313 = true;
            arg4.field7344 = this.field7344;
            arg4.field7297 = this.field7297;
        } else {
            arg4.field7313 = false;
        }
        arg4.field7286 = this.field7286;
        arg4.field7360 = this.field7360;
        arg4.field7370 = this.field7370;
        arg4.field7283 = this.field7283;
        return arg4;
    }

    @OriginalMember(owner = "client!ip", name = "H", descriptor = "(III)V", line = 3563)
    public final void method462(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field7369; var4++) {
            if (arg0 != 128) {
                this.field7293[var4] = this.field7293[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field7385[var4] = this.field7385[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field7316[var4] = this.field7316[var4] * arg2 >> 7;
            }
        }
        field7307++;
        if (this.field7294 != null) {
            this.field7294.field6975 = null;
        }
        this.field7313 = false;
    }

    @OriginalMember(owner = "client!ip", name = "M", descriptor = "(I[IIIIZI[I)V", line = 3601)
    public final void method435(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field7377++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = arg3 << 4;
            class224.field3289 = 0;
            class479.field7045 = 0;
            int var13 = 0;
            class338.field4689 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field7370.length > var15) {
                    int[] var16 = this.field7370[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field7283 == null || (this.field7283[var18] & arg6) != 0) {
                            class479.field7045 += this.field7293[var18];
                            class224.field3289 += this.field7385[var18];
                            class338.field4689 += this.field7316[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class289.field4157 = true;
                class479.field7045 = class479.field7045 / var13 + var10;
                class224.field3289 = class224.field3289 / var13 + var12;
                class338.field4689 = class338.field4689 / var13 + var11;
            } else {
                class224.field3289 = var12;
                class479.field7045 = var10;
                class338.field4689 = var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + (arg7[0] * arg2 + (arg7[1] * arg3) + 16384) >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + (arg7[4] * arg3) + 16384 >> 15;
                int var21 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 16384 >> 15;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field7370.length) {
                    int[] var27 = this.field7370[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field7283 == null || (arg6 & this.field7283[var29]) != 0) {
                            this.field7293[var29] += var24;
                            this.field7385[var29] += var23;
                            this.field7316[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field7370.length > var109) {
                        int[] var110 = this.field7370[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field7283 == null || (arg6 & this.field7283[var112]) != 0) {
                                this.field7293[var112] -= class479.field7045;
                                this.field7385[var112] -= class224.field3289;
                                this.field7316[var112] -= class338.field4689;
                                if (arg4 != 0) {
                                    int var113 = class340.field4724[arg4];
                                    int var114 = class340.field4715[arg4];
                                    int var115 = this.field7385[var112] * var113 + this.field7293[var112] * var114 + 32767 >> 15;
                                    this.field7385[var112] = this.field7385[var112] * var114 + 32767 - this.field7293[var112] * var113 >> 15;
                                    this.field7293[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class340.field4724[arg2];
                                    int var117 = class340.field4715[arg2];
                                    int var118 = this.field7385[var112] * var117 + 32767 - (this.field7316[var112] * var116) >> 15;
                                    this.field7316[var112] = this.field7316[var112] * var117 + this.field7385[var112] * var116 + 32767 >> 15;
                                    this.field7385[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class340.field4724[arg3];
                                    int var120 = class340.field4715[arg3];
                                    int var121 = this.field7316[var112] * var119 + this.field7293[var112] * var120 + 32767 >> 15;
                                    this.field7316[var112] = this.field7316[var112] * var120 + 32767 - (this.field7293[var112] * var119) >> 15;
                                    this.field7293[var112] = var121;
                                }
                                this.field7293[var112] += class479.field7045;
                                this.field7385[var112] += class224.field3289;
                                this.field7316[var112] += class338.field4689;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field7370.length) {
                            int[] var93 = this.field7370[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field7283 == null || (arg6 & this.field7283[var95]) != 0) {
                                    int var96 = this.field7360[var95];
                                    int var97 = this.field7360[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field7375[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class340.field4724[arg4];
                                            int var101 = class340.field4715[arg4];
                                            int var102 = this.field7296[var99] * var101 + this.field7289[var99] * var100 + 32767 >> 15;
                                            this.field7289[var99] = (short) (this.field7289[var99] * var101 + 32767 - (this.field7296[var99] * var100) >> 15);
                                            this.field7296[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class340.field4724[arg2];
                                            int var104 = class340.field4715[arg2];
                                            int var105 = this.field7289[var99] * var104 + 32767 - (this.field7295[var99] * var103) >> 15;
                                            this.field7295[var99] = (short) (this.field7295[var99] * var104 + this.field7289[var99] * var103 + 32767 >> 15);
                                            this.field7289[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class340.field4724[arg3];
                                            int var107 = class340.field4715[arg3];
                                            int var108 = this.field7296[var99] * var107 + this.field7295[var99] * var106 + 32767 >> 15;
                                            this.field7295[var99] = (short) (this.field7295[var99] * var107 + 32767 - (this.field7296[var99] * var106) >> 15);
                                            this.field7296[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field7372 == null && this.field7303 != null) {
                        this.field7303.field6975 = null;
                    }
                    if (this.field7372 != null) {
                        this.field7372.field6975 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class289.field4157) {
                    int var36 = arg7[0] * class479.field7045 + (arg7[3] * class224.field3289) + arg7[6] * class338.field4689 + 16384 >> 15;
                    int var37 = arg7[7] * class338.field4689 + arg7[1] * class479.field7045 + (arg7[4] * class224.field3289 - -16384) >> 15;
                    int var38 = var34 + var37;
                    int var39 = var33 + var36;
                    int var40 = arg7[8] * class338.field4689 + arg7[5] * class224.field3289 + arg7[2] * class479.field7045 + 16384 >> 15;
                    int var41 = var35 + var40;
                    class479.field7045 = var39;
                    class224.field3289 = var38;
                    class289.field4157 = false;
                    class338.field4689 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class340.field4715[arg2];
                int var44 = class340.field4724[arg2];
                int var45 = class340.field4715[arg3];
                int var46 = class340.field4724[arg3];
                int var47 = class340.field4715[arg4];
                int var48 = class340.field4724[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[5] = -var44;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                int var51 = var42[1] * -class224.field3289 + var42[0] * -class479.field7045 - (-(var42[2] * -class338.field4689) + -16384) >> 15;
                int var52 = var42[5] * -class338.field4689 + var42[4] * -class224.field3289 + var42[3] * -class479.field7045 + 16384 >> 15;
                int var53 = var42[8] * -class338.field4689 + (var42[6] * -class479.field7045 + (var42[7] * -class224.field3289) + 16384) >> 15;
                int var54 = class479.field7045 + var51;
                int var55 = class224.field3289 + var52;
                int var56 = var53 + class338.field4689;
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
                int var59 = var42[2] * var35 + var42[1] * var34 + var42[0] * var33 + 16384 >> 15;
                int var60 = var42[5] * var35 + var42[3] * var33 - (-(var42[4] * var34) - 16384) >> 15;
                int var61 = var54 + var59;
                int var62 = var55 + var60;
                int var63 = var42[6] * var33 + (var42[8] * var35) + var42[7] * var34 + 16384 >> 15;
                int var64 = var56 + var63;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += var57[var84 + (var86 * 3)] * arg7[var66 * 3 + var86];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[1] * var62 + arg7[0] * var61 + arg7[2] * var64 + 16384 >> 15;
                int var68 = arg7[3] * var61 + (arg7[4] * var62 - (-(arg7[5] * var64) - 16384)) >> 15;
                int var69 = arg7[8] * var64 + arg7[6] * var61 + (arg7[7] * var62) + 16384 >> 15;
                int var70 = var31 + var68;
                int var71 = var30 + var67;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field7370.length) {
                        int[] var75 = this.field7370[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field7283 == null || (this.field7283[var77] & arg6) != 0) {
                                int var78 = this.field7385[var77] * var65[1] + this.field7316[var77] * var65[2] + this.field7293[var77] * var65[0] + 16384 >> 15;
                                int var79 = this.field7293[var77] * var65[3] + this.field7385[var77] * var65[4] + this.field7316[var77] * var65[5] + 16384 >> 15;
                                int var80 = var71 + var78;
                                int var81 = var70 + var79;
                                int var82 = this.field7316[var77] * var65[8] + (this.field7293[var77] * var65[6] + (this.field7385[var77] * var65[7])) + 16384 >> 15;
                                int var83 = var72 + var82;
                                this.field7293[var77] = var80;
                                this.field7385[var77] = var81;
                                this.field7316[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field7370.length > var173) {
                        int[] var174 = this.field7370[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field7283 == null || (arg6 & this.field7283[var176]) != 0) {
                                this.field7293[var176] -= class479.field7045;
                                this.field7385[var176] -= class224.field3289;
                                this.field7316[var176] -= class338.field4689;
                                this.field7293[var176] = this.field7293[var176] * arg2 >> 7;
                                this.field7385[var176] = this.field7385[var176] * arg3 >> 7;
                                this.field7316[var176] = this.field7316[var176] * arg4 >> 7;
                                this.field7293[var176] += class479.field7045;
                                this.field7385[var176] += class224.field3289;
                                this.field7316[var176] += class338.field4689;
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
                if (class289.field4157) {
                    int var128 = arg7[0] * class479.field7045 + arg7[3] * class224.field3289 + arg7[6] * class338.field4689 + 16384 >> 15;
                    int var129 = arg7[4] * class224.field3289 + arg7[1] * class479.field7045 + arg7[7] * class338.field4689 + 16384 >> 15;
                    int var130 = var125 + var128;
                    int var131 = var126 + var129;
                    int var132 = arg7[2] * class479.field7045 + arg7[5] * class224.field3289 + (arg7[8] * class338.field4689) + 16384 >> 15;
                    int var133 = var127 + var132;
                    class224.field3289 = var131;
                    class479.field7045 = var130;
                    class289.field4157 = false;
                    class338.field4689 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class479.field7045 * var134 + 16384 >> 15;
                int var138 = -class224.field3289 * var135 + 16384 >> 15;
                int var139 = -class338.field4689 * var136 + 16384 >> 15;
                int var140 = class479.field7045 + var137;
                int var141 = class224.field3289 + var138;
                int var142 = var139 + class338.field4689;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var141 + var145;
                int var148 = var140 + var144;
                int var149 = var142 + var146;
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
                int var152 = arg7[0] * var148 + (arg7[1] * var147 + (arg7[2] * var149)) + 16384 >> 15;
                int var153 = arg7[3] * var148 + arg7[5] * var149 + arg7[4] * var147 + 16384 >> 15;
                int var154 = var123 + var153;
                int var155 = var122 + var152;
                int var156 = arg7[6] * var148 + 16384 - (-(arg7[7] * var147) + -(arg7[8] * var149)) >> 15;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field7370.length > var159) {
                        int[] var160 = this.field7370[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field7283 == null || (arg6 & this.field7283[var162]) != 0) {
                                int var163 = this.field7293[var162] * var150[0] + 16384 - (-(this.field7385[var162] * var150[1]) - this.field7316[var162] * var150[2]) >> 15;
                                int var164 = this.field7316[var162] * var150[5] + (this.field7293[var162] * var150[3] + (this.field7385[var162] * var150[4])) + 16384 >> 15;
                                int var165 = this.field7316[var162] * var150[8] + this.field7385[var162] * var150[7] + this.field7293[var162] * var150[6] + 16384 >> 15;
                                int var166 = var154 + var164;
                                int var167 = var155 + var163;
                                int var168 = var157 + var165;
                                this.field7293[var162] = var167;
                                this.field7385[var162] = var166;
                                this.field7316[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field7292 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field7292.length) {
                        int[] var182 = this.field7292[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field7302 == null || (this.field7302[var184] & arg6) != 0) {
                                int var185 = (this.field7350[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field7350[var184] = (byte) var185;
                                if (this.field7303 != null) {
                                    this.field7303.field6975 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field7371 != null) {
                    for (int var178 = 0; var178 < this.field7378; var178++) {
                        class377 var179 = this.field7371[var178];
                        class441 var180 = this.field7327[var178];
                        var180.field6549 = 255 - (this.field7350[var179.field5571] & 0xFF) << 24 | var180.field6549 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field7292 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field7292.length > var190) {
                        int[] var191 = this.field7292[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field7302 == null || (arg6 & this.field7302[var193]) != 0) {
                                int var194 = this.field7288[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFC1D) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                int var200 = arg4 + var199;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field7288[var193] = (short) class244.method1606(var200, class244.method1606(var198 << 7, var197 << 10));
                                if (this.field7303 != null) {
                                    this.field7303.field6975 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field7371 != null) {
                    for (int var187 = 0; var187 < this.field7378; var187++) {
                        class377 var188 = this.field7371[var187];
                        class441 var189 = this.field7327[var187];
                        var189.field6549 = var189.field6549 & 0xFF000000 | class37.field413[this.field7288[var188.field5571] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field7286 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field7286.length) {
                        int[] var203 = this.field7286[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class441 var205 = this.field7327[var203[var204]];
                            var205.field6552 += arg3;
                            var205.field6555 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field7286 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field7286.length > var207) {
                        int[] var208 = this.field7286[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class441 var210 = this.field7327[var208[var209]];
                            var210.field6554 = var210.field6554 * arg3 >> 7;
                            var210.field6547 = var210.field6547 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field7286 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field7286.length > var212) {
                    int[] var213 = this.field7286[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class441 var215 = this.field7327[var213[var214]];
                        var215.field6551 = var215.field6551 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "()[Lbu;", line = 4599)
    public final class17[] method454() {
        field7315++;
        return this.field7359;
    }

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "(I)V", line = 4608)
    public final void method468(int arg0) {
        field7374++;
        if (this.field7303 != null) {
            this.field7303.field6975 = null;
        }
        this.field7389 = (short) arg0;
    }

    @OriginalMember(owner = "client!ip", name = "Q", descriptor = "(I)V", line = 4623)
    public final void method451(int arg0) {
        field7373++;
        int var2 = class340.field4724[arg0];
        int var3 = class340.field4715[arg0];
        for (int var4 = 0; var4 < this.field7369; var4++) {
            int var5 = this.field7316[var4] * var2 + (this.field7293[var4] * var3) >> 15;
            this.field7316[var4] = this.field7316[var4] * var3 - (this.field7293[var4] * var2) >> 15;
            this.field7293[var4] = var5;
        }
        this.field7313 = false;
        if (this.field7294 != null) {
            this.field7294.field6975 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(BIZ)Lt;", line = 4657)
    public final class471 method458(byte arg0, int arg1, boolean arg2) {
        field7339++;
        class497 var4;
        class497 var5;
        if (arg0 == 1) {
            var4 = this.field7366.field5404;
            var5 = this.field7366.field5334;
        } else if (arg0 == 2) {
            var4 = this.field7366.field5358;
            var5 = this.field7366.field5401;
        } else if (arg0 == 3) {
            var5 = this.field7366.field5438;
            var4 = this.field7366.field5423;
        } else if (arg0 == 4) {
            var5 = this.field7366.field5402;
            var4 = this.field7366.field5346;
        } else if (arg0 == 5) {
            var4 = this.field7366.field5413;
            var5 = this.field7366.field5364;
        } else {
            var4 = var5 = new class497(this.field7366);
        }
        return this.method2982(5126, arg1, var5, arg2, var4, arg0 != 0);
    }

    @OriginalMember(owner = "client!ip", name = "R", descriptor = "(I)V", line = 4708)
    public final void method455(int arg0) {
        field7298++;
        int var2 = class340.field4724[arg0];
        int var3 = class340.field4715[arg0];
        for (int var4 = 0; var4 < this.field7369; var4++) {
            int var5 = this.field7385[var4] * var2 + this.field7293[var4] * var3 >> 15;
            this.field7385[var4] = this.field7385[var4] * var3 - (this.field7293[var4] * var2) >> 15;
            this.field7293[var4] = var5;
        }
        this.field7313 = false;
        if (this.field7294 != null) {
            this.field7294.field6975 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IJFFIBIILjq;I)S", line = 4741)
    private final short method2983(int arg0, long arg1, float arg2, float arg3, int arg4, byte arg5, int arg6, int arg7, class353 arg8, int arg9) {
        field7308++;
        int var12 = this.field7360[arg7];
        int var13 = this.field7360[arg7 + 1];
        if (arg5 != 5) {
            return 76;
        }
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field7375[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class32.field370[var15] == arg1) {
                return (short) (var16 - 1);
            }
        }
        this.field7375[var14] = (short) (this.field7342 + 1);
        class32.field370[var14] = arg1;
        this.field7296[this.field7342] = (short) arg9;
        this.field7289[this.field7342] = (short) arg6;
        this.field7295[this.field7342] = (short) arg0;
        this.field7361[this.field7342] = (byte) arg4;
        this.field7349[this.field7342] = arg3;
        this.field7282[this.field7342] = arg2;
        return (short) (this.field7342++);
    }

    @OriginalMember(owner = "client!ip", name = "IA", descriptor = "()V", line = 4792)
    public final void method469() {
        field7326++;
        for (int var1 = 0; var1 < this.field7369; var1++) {
            this.field7316[var1] = -this.field7316[var1];
        }
        for (int var2 = 0; var2 < this.field7342; var2++) {
            this.field7295[var2] = (short) (-this.field7295[var2]);
        }
        for (int var3 = 0; var3 < this.field7380; var3++) {
            short var4 = this.field7343[var3];
            this.field7343[var3] = this.field7325[var3];
            this.field7325[var3] = var4;
        }
        if (this.field7372 == null && this.field7303 != null) {
            this.field7303.field6975 = null;
        }
        if (this.field7372 != null) {
            this.field7372.field6975 = null;
        }
        if (this.field7294 != null) {
            this.field7294.field6975 = null;
        }
        if (this.field7301 != null) {
            this.field7301.field99 = null;
        }
        this.field7313 = false;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lc;Lmi;I)V", line = 4844)
    public final void method457(class122 arg0, class341 arg1, int arg2) {
        field7299++;
        if (this.field7342 == 0) {
            return;
        }
        class231 var4 = this.field7366.field5400;
        class231 var5 = (class231) arg0;
        if (!this.field7313) {
            this.method2984(16383);
        }
        this.method2974(0, var5);
        class270.field3986 = var4.field3377 * var5.field3376 + var4.field3400 * var5.field3407 + var4.field3392 * var5.field3399 + var4.field3376;
        class273.field4035 = var4.field3377 * var5.field3392 + var4.field3400 * var5.field3401 + var4.field3392 * var5.field3396;
        float var6 = (float) this.field7329 * class273.field4035 + class270.field3986;
        float var7 = (float) this.field7344 * class273.field4035 + class270.field3986;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var8 = (float) this.field7312 + var6;
            var9 = var7 - (float) this.field7312;
        } else {
            var8 = (float) this.field7312 + var7;
            var9 = (float) (-this.field7312) + var6;
        }
        if ((this.field7366.field5353 <= var9) || (var8 <= (float) this.field7366.field5344)) {
            return;
        }
        class95.field1283 = var4.field3402 * var5.field3376 + var4.field3401 * var5.field3399 + var4.field3386 * var5.field3407 + var4.field3407;
        class24.field290 = var4.field3402 * var5.field3392 + var4.field3401 * var5.field3396 + var4.field3386 * var5.field3401;
        float var10 = (float) this.field7329 * class24.field290 + class95.field1283;
        float var11 = (float) this.field7344 * class24.field290 + class95.field1283;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) (-this.field7312) + var11) * (float) this.field7366.field5417;
            var13 = ((float) this.field7312 + var10) * (float) this.field7366.field5417;
        } else {
            var12 = ((float) (-this.field7312) + var10) * (float) this.field7366.field5417;
            var13 = ((float) this.field7312 + var11) * (float) this.field7366.field5417;
        }
        if ((this.field7366.field5372 <= var12 / var8) || (var13 / var8 <= this.field7366.field5434)) {
            return;
        }
        class167.field2374 = var4.field3381 * var5.field3392 + var4.field3396 * var5.field3396 + var4.field3378 * var5.field3401;
        class474.field6986 = var4.field3381 * var5.field3376 + var4.field3396 * var5.field3399 + var4.field3378 * var5.field3407 + var4.field3399;
        float var14 = (float) this.field7329 * class167.field2374 + class474.field6986;
        float var15 = (float) this.field7344 * class167.field2374 + class474.field6986;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field7312 + var14) * (float) this.field7366.field5360;
            var17 = ((float) (-this.field7312) + var15) * (float) this.field7366.field5360;
        } else {
            var17 = (var14 - (float) this.field7312) * (float) this.field7366.field5360;
            var16 = ((float) this.field7312 + var15) * (float) this.field7366.field5360;
        }
        if ((this.field7366.field5389 <= var17 / var8) || (var16 / var8 <= this.field7366.field5357)) {
            return;
        }
        if (arg1 != null || this.field7371 != null) {
            class228.field3326 = var4.field3402 * var5.field3377 + var4.field3401 * var5.field3381 + var4.field3386 * var5.field3402;
            class166.field2355 = var4.field3377 * var5.field3377 + var4.field3400 * var5.field3402 + var4.field3392 * var5.field3381;
            class203.field2946 = var4.field3377 * var5.field3400 + var4.field3400 * var5.field3386 + var4.field3392 * var5.field3378;
            class500.field7421 = var4.field3402 * var5.field3400 + var4.field3401 * var5.field3378 + var4.field3386 * var5.field3386;
            class420.field6220 = var4.field3381 * var5.field3400 + var4.field3396 * var5.field3378 + var4.field3378 * var5.field3386;
            class407.field6070 = var4.field3381 * var5.field3377 + var4.field3396 * var5.field3381 + var4.field3378 * var5.field3402;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field7368 + this.field7352 >> 1;
            int var21 = this.field7322 + this.field7297 >> 1;
            int var22 = (int) ((float) var21 * class228.field3326 + (float) this.field7329 * class24.field290 + (float) var20 * class500.field7421 + class95.field1283);
            int var23 = (int) ((float) var21 * class407.field6070 + (float) this.field7329 * class167.field2374 + (float) var20 * class420.field6220 + class474.field6986);
            int var24 = (int) ((float) var21 * class166.field2355 + (float) this.field7329 * class273.field4035 + (float) var20 * class203.field2946 + class270.field3986);
            if (var24 < this.field7366.field5344) {
                var18 = true;
            } else {
                arg1.field4728 = this.field7366.field5362 + (this.field7366.field5417 * var22 / var24);
                arg1.field4726 = this.field7366.field5360 * var23 / var24 + this.field7366.field5367;
            }
            int var25 = (int) ((float) var21 * class228.field3326 + (float) this.field7344 * class24.field290 + (float) var20 * class500.field7421 + class95.field1283);
            int var26 = (int) ((float) var21 * class407.field6070 + (float) this.field7344 * class167.field2374 + (float) var20 * class420.field6220 + class474.field6986);
            int var27 = (int) ((float) var21 * class166.field2355 + (float) this.field7344 * class273.field4035 + (float) var20 * class203.field2946 + class270.field3986);
            if (this.field7366.field5344 <= var27) {
                arg1.field4727 = this.field7366.field5360 * var26 / var27 + this.field7366.field5367;
                arg1.field4730 = this.field7366.field5417 * var25 / var27 + this.field7366.field5362;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field7366.field5344 && var27 < this.field7366.field5344) {
                    var19 = false;
                } else if (var24 < this.field7366.field5344) {
                    int var31 = (var27 - this.field7366.field5344 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = var26 + ((var26 - var23) * var31 >> 16);
                    arg1.field4728 = this.field7366.field5417 * var32 / this.field7366.field5344 + this.field7366.field5362;
                    arg1.field4726 = this.field7366.field5367 + (this.field7366.field5360 * var33 / this.field7366.field5344);
                } else if (var27 < this.field7366.field5344) {
                    int var28 = (var24 - this.field7366.field5344 << 16) / (var24 - var27);
                    int var29 = var22 + ((var22 - var25) * var28 >> 16);
                    arg1.field4728 = this.field7366.field5417 * var29 / this.field7366.field5344 + this.field7366.field5362;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field4726 = this.field7366.field5360 * var30 / this.field7366.field5344 + this.field7366.field5367;
                }
            }
            if (var19) {
                if (var27 >= var24) {
                    arg1.field4731 = (var25 + this.field7312) * this.field7366.field5417 / var27 + this.field7366.field5362 - arg1.field4730;
                } else {
                    arg1.field4731 = (this.field7312 + var22) * this.field7366.field5417 / var24 + (this.field7366.field5362 - arg1.field4728);
                }
                arg1.field4729 = true;
            }
        }
        this.field7366.method2187(8);
        this.field7366.method2231(0, var5);
        this.method2977(false);
        this.field7366.method2199(1);
        this.method2981(false);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIII)V", line = 5053)
    public final void method434(int arg0, int arg1, int arg2, int arg3) {
        field7362++;
        for (int var5 = 0; var5 < this.field7380; var5++) {
            int var9 = this.field7288[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x392) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field7288[var5] = (short) class244.method1606(var12, class244.method1606(var11 << 7, var10 << 10));
        }
        if (this.field7371 != null) {
            for (int var6 = 0; var6 < this.field7378; var6++) {
                class377 var7 = this.field7371[var6];
                class441 var8 = this.field7327[var6];
                var8.field6549 = var8.field6549 & 0xFF000000 | class37.field413[this.field7288[var7.field5571] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field7303 != null) {
            this.field7303.field6975 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V", line = 5116)
    private final void method2984(int arg0) {
        field7364++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        if (arg0 != 16383) {
            return;
        }
        for (int var10 = 0; var10 < this.field7369; var10++) {
            int var11 = this.field7293[var10];
            int var12 = this.field7385[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field7316[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var13 * var13 + (var12 * var12);
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field7368 = (short) var5;
        this.field7322 = (short) var4;
        this.field7297 = (short) var7;
        this.field7344 = (short) var6;
        this.field7352 = (short) var2;
        this.field7329 = (short) var3;
        this.field7312 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field7313 = true;
    }

    @OriginalMember(owner = "client!ip", name = "WA", descriptor = "()I", line = 5212)
    public final int method448() {
        if (!this.field7313) {
            this.method2984(16383);
        }
        field7330++;
        return this.field7344;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "()V", line = 5223)
    public final void method441() {
        field7311++;
        if (this.field7342 <= 0 || this.field7281 <= 0) {
            return;
        }
        this.method2979(-12, false);
        if ((this.field7334 & 0x10) == 0 && this.field7301.field99 == null) {
            this.method2988(false, false);
        }
        this.method2987(-126);
    }

    @OriginalMember(owner = "client!ip", name = "I", descriptor = "(SS)V", line = 5240)
    public final void method445(short arg0, short arg1) {
        field7365++;
        class277 var3 = this.field7366.field425;
        for (int var4 = 0; var4 < this.field7380; var4++) {
            if (this.field7337[var4] == arg0) {
                this.field7337[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class104 var7 = var3.method1780(-31305, arg0 & 0xFFFF);
            var6 = var7.field1438;
            var5 = var7.field1444;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class104 var10 = var3.method1780(-31305, arg1 & 0xFFFF);
            var8 = var10.field1444;
            var9 = var10.field1438;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field7371 != null) {
            for (int var11 = 0; var11 < this.field7378; var11++) {
                class377 var12 = this.field7371[var11];
                class441 var13 = this.field7327[var11];
                var13.field6549 = var13.field6549 & 0xFF000000 | class37.field413[this.field7288[var12.field5571] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field7303 != null) {
            this.field7303.field6975 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 5313)
    public static final String method2985(long arg0, int arg1) {
        class96.field1297.setTime(new Date(arg0));
        field7333++;
        if (arg1 != -20881) {
            return null;
        }
        int var3 = class96.field1297.get(7);
        int var4 = class96.field1297.get(5);
        int var5 = class96.field1297.get(2);
        int var6 = class96.field1297.get(1);
        int var7 = class96.field1297.get(11);
        int var8 = class96.field1297.get(12);
        int var9 = class96.field1297.get(13);
        return class269.field3970[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class348.field4834[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ip", name = "P", descriptor = "()I", line = 5340)
    public final int method459() {
        field7300++;
        return this.field7351;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZIIIIIIII)Z", line = 5349)
    private final boolean method2986(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7354++;
        if (arg2 > arg4 && arg4 < arg6 && arg7 > arg4) {
            return false;
        } else if (arg2 < arg4 && arg4 > arg6 && arg4 > arg7) {
            return false;
        } else if (arg8 < arg1 && arg5 > arg8 && arg3 > arg8) {
            return false;
        } else if (arg8 > arg1 && arg8 > arg5 && arg3 < arg8) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)V", line = 5379)
    private final void method2987(int arg0) {
        field7331++;
        if (!this.field7336) {
            return;
        }
        this.field7336 = false;
        if (this.field7359 == null && this.field7357 == null && this.field7371 == null) {
            if (this.field7293 != null && !class470.method2844(this.field7346, -1, this.field7351)) {
                if (this.field7294 != null && this.field7294.field6975 == null) {
                    this.field7336 = true;
                } else {
                    if (!this.field7313) {
                        this.method2984(16383);
                    }
                    this.field7293 = null;
                }
            }
            if (this.field7385 != null && !class91.method804(this.field7351, this.field7346, 2074)) {
                if (this.field7294 != null && this.field7294.field6975 == null) {
                    this.field7336 = true;
                } else {
                    if (!this.field7313) {
                        this.method2984(16383);
                    }
                    this.field7385 = null;
                }
            }
            if (this.field7316 != null && !class420.method2581(this.field7346, 125, this.field7351)) {
                if (this.field7294 != null && this.field7294.field6975 == null) {
                    this.field7336 = true;
                } else {
                    if (!this.field7313) {
                        this.method2984(16383);
                    }
                    this.field7316 = null;
                }
            }
        }
        if (this.field7375 != null && this.field7293 == null && this.field7385 == null && this.field7316 == null) {
            this.field7360 = null;
            this.field7375 = null;
        }
        if (this.field7361 != null && !class518.method3076(this.field7346, (byte) -120, this.field7351)) {
            if (this.field7372 == null) {
                if (this.field7303 != null && this.field7303.field6975 == null) {
                    this.field7336 = true;
                } else {
                    this.field7361 = null;
                    this.field7296 = this.field7289 = this.field7295 = null;
                }
            } else if (this.field7372.field6975 == null) {
                this.field7336 = true;
            } else {
                this.field7296 = this.field7289 = this.field7295 = null;
                this.field7361 = null;
            }
        }
        if (arg0 > -115) {
            this.field7281 = -10;
        }
        if (this.field7288 != null && !class428.method2608(this.field7351, this.field7346, (byte) 112)) {
            if (this.field7303 != null && this.field7303.field6975 == null) {
                this.field7336 = true;
            } else {
                this.field7288 = null;
            }
        }
        if (this.field7350 != null && !class181.method1283(-16623, this.field7346, this.field7351)) {
            if (this.field7303 != null && this.field7303.field6975 == null) {
                this.field7336 = true;
            } else {
                this.field7350 = null;
            }
        }
        if (this.field7349 != null && !class192.method1348(true, this.field7346, this.field7351)) {
            if (this.field7356 != null && this.field7356.field6975 == null) {
                this.field7336 = true;
            } else {
                this.field7349 = this.field7282 = null;
            }
        }
        if (this.field7337 != null && !class425.method2598(this.field7346, false, this.field7351)) {
            if (this.field7303 != null && this.field7303.field6975 == null) {
                this.field7336 = true;
            } else {
                this.field7337 = null;
            }
        }
        if (this.field7343 != null && !class129.method996(this.field7346, this.field7351, 15)) {
            if ((this.field7301 == null || this.field7301.field99 != null) && (this.field7303 == null || this.field7303.field6975 != null)) {
                this.field7343 = this.field7309 = this.field7325 = null;
            } else {
                this.field7336 = true;
            }
        }
        if (this.field7292 != null && !class470.method2847((byte) 127, this.field7346, this.field7351)) {
            this.field7302 = null;
            this.field7292 = null;
        }
        if (this.field7370 != null && !class33.method263(this.field7346, 11, this.field7351)) {
            this.field7370 = null;
            this.field7283 = null;
        }
        if (this.field7286 != null && !class431.method2616(-18445, this.field7351, this.field7346)) {
            this.field7286 = null;
        }
        if (this.field7376 != null && (this.field7351 & 0x800) == 0 && (this.field7351 & 0x40000) == 0) {
            this.field7376 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZZ)V", line = 5557)
    private final void method2988(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method456();
        }
        if ((this.field7281 * 6) > class118.field1655.field783.length) {
            class118.field1655 = new class67(this.field7281 * 6 + 600);
        } else {
            class118.field1655.field827 = 0;
        }
        field7353++;
        if (this.field7366.field5443) {
            for (int var4 = 0; var4 < this.field7281; var4++) {
                class118.field1655.method611((byte) 67, this.field7343[var4]);
                class118.field1655.method611((byte) 67, this.field7309[var4]);
                class118.field1655.method611((byte) 67, this.field7325[var4]);
            }
        } else {
            for (int var3 = 0; var3 < this.field7281; var3++) {
                class118.field1655.method628((byte) -98, this.field7343[var3]);
                class118.field1655.method628((byte) -70, this.field7309[var3]);
                class118.field1655.method628((byte) -56, this.field7325[var3]);
            }
        }
        if (class118.field1655.field827 == 0) {
            return;
        }
        if (arg0) {
            if (this.field7379 == null) {
                this.field7379 = this.field7366.method2238(112, class118.field1655.field827, true, class118.field1655.field783, 5123);
            } else {
                this.field7379.method1361(class118.field1655.field783, true, 5123, class118.field1655.field827);
            }
            this.field7301.field99 = this.field7379;
        } else {
            this.field7301.field99 = this.field7366.method2238(107, class118.field1655.field827, false, class118.field1655.field783, 5123);
        }
        if (!arg0) {
            this.field7336 = true;
        }
    }

    @OriginalMember(owner = "client!ip", name = "MA", descriptor = "()I", line = 5631)
    public final int method463() {
        if (!this.field7313) {
            this.method2984(16383);
        }
        field7319++;
        return this.field7329;
    }
}
