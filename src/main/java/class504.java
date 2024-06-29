import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class504 extends class475 {

    @OriginalMember(owner = "client!lu", name = "rb", descriptor = "I")
    private int field7313 = 0;

    @OriginalMember(owner = "client!lu", name = "Jb", descriptor = "I")
    private int field7331 = 0;

    @OriginalMember(owner = "client!lu", name = "Bb", descriptor = "Z")
    private boolean field7323 = true;

    @OriginalMember(owner = "client!lu", name = "ub", descriptor = "I")
    private int field7316 = 0;

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "I")
    private int field7275 = 0;

    @OriginalMember(owner = "client!lu", name = "pc", descriptor = "Z")
    private boolean field7363 = false;

    @OriginalMember(owner = "client!lu", name = "Ac", descriptor = "I")
    private int field7374 = 0;

    @OriginalMember(owner = "client!lu", name = "kc", descriptor = "Lkd;")
    private class188 field7358;

    @OriginalMember(owner = "client!lu", name = "Tb", descriptor = "Lgi;")
    private class481 field7341;

    @OriginalMember(owner = "client!lu", name = "Mb", descriptor = "Lgi;")
    private class481 field7334;

    @OriginalMember(owner = "client!lu", name = "xc", descriptor = "Lgi;")
    private class481 field7371;

    @OriginalMember(owner = "client!lu", name = "vc", descriptor = "Lgi;")
    private class481 field7369;

    @OriginalMember(owner = "client!lu", name = "ib", descriptor = "Lwi;")
    private class328 field7304;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
    private int field7266;

    @OriginalMember(owner = "client!lu", name = "uc", descriptor = "I")
    private int field7368;

    @OriginalMember(owner = "client!lu", name = "D", descriptor = "[I")
    private int[] field7273;

    @OriginalMember(owner = "client!lu", name = "nb", descriptor = "[I")
    private int[] field7309;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "[I")
    private int[] field7272;

    @OriginalMember(owner = "client!lu", name = "ec", descriptor = "[I")
    private int[] field7352;

    @OriginalMember(owner = "client!lu", name = "mb", descriptor = "[S")
    private short[] field7308;

    @OriginalMember(owner = "client!lu", name = "ac", descriptor = "[Luj;")
    private class262[] field7348;

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "[Ldv;")
    private class471[] field7279;

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
    private int field7285;

    @OriginalMember(owner = "client!lu", name = "zc", descriptor = "[Ldk;")
    private class356[] field7373;

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "[Lou;")
    private class432[] field7276;

    @OriginalMember(owner = "client!lu", name = "Yb", descriptor = "[S")
    private short[] field7346;

    @OriginalMember(owner = "client!lu", name = "fc", descriptor = "[S")
    private short[] field7353;

    @OriginalMember(owner = "client!lu", name = "Pb", descriptor = "[S")
    private short[] field7337;

    @OriginalMember(owner = "client!lu", name = "dc", descriptor = "[S")
    private short[] field7351;

    @OriginalMember(owner = "client!lu", name = "Eb", descriptor = "[F")
    private float[] field7326;

    @OriginalMember(owner = "client!lu", name = "Ib", descriptor = "[S")
    private short[] field7330;

    @OriginalMember(owner = "client!lu", name = "bc", descriptor = "S")
    private short field7349;

    @OriginalMember(owner = "client!lu", name = "Lb", descriptor = "S")
    private short field7333;

    @OriginalMember(owner = "client!lu", name = "rc", descriptor = "[B")
    private byte[] field7365;

    @OriginalMember(owner = "client!lu", name = "wb", descriptor = "[S")
    private short[] field7318;

    @OriginalMember(owner = "client!lu", name = "qb", descriptor = "[F")
    private float[] field7312;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "[B")
    private byte[] field7277;

    @OriginalMember(owner = "client!lu", name = "kb", descriptor = "[S")
    private short[] field7306;

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "[S")
    private short[] field7283;

    @OriginalMember(owner = "client!lu", name = "cc", descriptor = "[S")
    private short[] field7350;

    @OriginalMember(owner = "client!lu", name = "tc", descriptor = "[S")
    private short[] field7367;

    @OriginalMember(owner = "client!lu", name = "tb", descriptor = "[I")
    private int[] field7315;

    @OriginalMember(owner = "client!lu", name = "V", descriptor = "[[I")
    private int[][] field7291;

    @OriginalMember(owner = "client!lu", name = "R", descriptor = "[[I")
    private int[][] field7287;

    @OriginalMember(owner = "client!lu", name = "bb", descriptor = "[[I")
    private int[][] field7297;

    @OriginalMember(owner = "client!lu", name = "W", descriptor = "Lak;")
    public static class234 field7292 = new class234("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "B")
    private byte field7265;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!lu", name = "Q", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!lu", name = "S", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!lu", name = "T", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!lu", name = "U", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!lu", name = "X", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!lu", name = "Y", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!lu", name = "Z", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!lu", name = "ab", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!lu", name = "cb", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!lu", name = "db", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!lu", name = "eb", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!lu", name = "gb", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!lu", name = "hb", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!lu", name = "jb", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!lu", name = "lb", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!lu", name = "pb", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!lu", name = "sb", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!lu", name = "vb", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!lu", name = "xb", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!lu", name = "yb", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!lu", name = "zb", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!lu", name = "Ab", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!lu", name = "Cb", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!lu", name = "Db", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!lu", name = "Gb", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!lu", name = "Hb", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!lu", name = "Nb", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!lu", name = "Ob", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!lu", name = "Qb", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!lu", name = "Rb", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!lu", name = "Ub", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!lu", name = "Wb", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!lu", name = "Xb", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!lu", name = "Zb", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!lu", name = "gc", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!lu", name = "hc", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!lu", name = "ic", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!lu", name = "lc", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!lu", name = "mc", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!lu", name = "nc", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!lu", name = "oc", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!lu", name = "qc", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!lu", name = "sc", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!lu", name = "yc", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!lu", name = "Kb", descriptor = "Lwu;")
    private class253 field7332;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "Lpl;")
    private class463 field7268;

    @OriginalMember(owner = "client!lu", name = "Fb", descriptor = "Liv;")
    private class66 field7327;

    @OriginalMember(owner = "client!lu", name = "B", descriptor = "S")
    private short field7271;

    @OriginalMember(owner = "client!lu", name = "fb", descriptor = "S")
    private short field7301;

    @OriginalMember(owner = "client!lu", name = "ob", descriptor = "S")
    private short field7310;

    @OriginalMember(owner = "client!lu", name = "Sb", descriptor = "S")
    private short field7340;

    @OriginalMember(owner = "client!lu", name = "Vb", descriptor = "S")
    private short field7343;

    @OriginalMember(owner = "client!lu", name = "jc", descriptor = "S")
    private short field7357;

    @OriginalMember(owner = "client!lu", name = "wc", descriptor = "S")
    private short field7370;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "(III)V", line = 3)
    public final void method424(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field7374; var4++) {
            if (arg0 != 128) {
                this.field7352[var4] = this.field7352[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field7272[var4] = this.field7272[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field7309[var4] = this.field7309[var4] * arg2 >> 7;
            }
        }
        field7342++;
        this.field7363 = false;
        if (this.field7341 != null) {
            this.field7341.field6921 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIII)V", line = 37)
    public final void method434(int arg0, int arg1, int arg2, int arg3) {
        field7335++;
        for (int var5 = 0; var5 < this.field7275; var5++) {
            int var9 = this.field7330[var5] & 0xFFFF;
            int var10 = (var9 & 0xFD55) >> 10;
            int var11 = (var9 & 0x3AF) >> 7;
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field7330[var5] = (short) class264.method1763(var12, class264.method1763(var11 << 7, var10 << 10));
        }
        if (this.field7373 != null) {
            for (int var6 = 0; var6 < this.field7285; var6++) {
                class356 var7 = this.field7373[var6];
                class432 var8 = this.field7276[var6];
                var8.field6401 = class312.field4694[this.field7330[var7.field5264] & 0xFFFF] & 0xFFFFFF | var8.field6401 & 0xFF000000;
            }
        }
        if (this.field7369 != null) {
            this.field7369.field6921 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIIIB)Z", line = 95)
    private final boolean method2992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field7338++;
        if (arg6 > arg7 && arg4 > arg7 && arg7 < arg1) {
            return false;
        }
        if (arg8 >= -41) {
            this.method2993(-68, -34, null, 0.2646978F, 60L, 103, 121, (byte) 30, -82, 0.039111502F);
        }
        if (arg6 < arg7 && arg4 < arg7 && arg1 < arg7) {
            return false;
        } else if (arg0 < arg2 && arg5 > arg0 && arg0 < arg3) {
            return false;
        } else {
            return arg2 >= arg0 || arg0 <= arg5 || arg3 >= arg0;
        }
    }

    @OriginalMember(owner = "client!lu", name = "XA", descriptor = "(I[IIIIIZ)V", line = 122)
    public final void method442(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field7278++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            class473.field6829 = 0;
            int var12 = 0;
            class101.field1453 = 0;
            class523.field7655 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field7291.length) {
                    int[] var15 = this.field7291[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class101.field1453 += this.field7352[var17];
                        class473.field6829 += this.field7272[var17];
                        var12++;
                        class523.field7655 += this.field7309[var17];
                    }
                }
            }
            if (var12 > 0) {
                class523.field7655 = class523.field7655 / var12 + var9;
                class101.field1453 = class101.field1453 / var12 + var10;
                class473.field6829 = class473.field6829 / var12 + var11;
            } else {
                class473.field6829 = var11;
                class101.field1453 = var10;
                class523.field7655 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg2 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field7291.length > var22) {
                    int[] var23 = this.field7291[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field7352[var25] += var19;
                        this.field7272[var25] += var18;
                        this.field7309[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field7291.length > var45) {
                    int[] var46 = this.field7291[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field7352[var59] -= class101.field1453;
                            this.field7272[var59] -= class473.field6829;
                            this.field7309[var59] -= class523.field7655;
                            if (arg4 != 0) {
                                int var60 = class281.field4278[arg4];
                                int var61 = class281.field4279[arg4];
                                int var62 = this.field7352[var59] * var61 + this.field7272[var59] * var60 + 32767 >> 15;
                                this.field7272[var59] = this.field7272[var59] * var61 + 32767 - (this.field7352[var59] * var60) >> 15;
                                this.field7352[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class281.field4278[arg2];
                                int var64 = class281.field4279[arg2];
                                int var65 = this.field7272[var59] * var64 + 32767 - (this.field7309[var59] * var63) >> 15;
                                this.field7309[var59] = this.field7272[var59] * var63 + (this.field7309[var59] * var64) + 32767 >> 15;
                                this.field7272[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class281.field4278[arg3];
                                int var67 = class281.field4279[arg3];
                                int var68 = this.field7309[var59] * var66 - (-(this.field7352[var59] * var67) - 32767) >> 15;
                                this.field7309[var59] = this.field7309[var59] * var67 + 32767 - this.field7352[var59] * var66 >> 15;
                                this.field7352[var59] = var68;
                            }
                            this.field7352[var59] += class101.field1453;
                            this.field7272[var59] += class473.field6829;
                            this.field7309[var59] += class523.field7655;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field7352[var48] -= class101.field1453;
                            this.field7272[var48] -= class473.field6829;
                            this.field7309[var48] -= class523.field7655;
                            if (arg2 != 0) {
                                int var49 = class281.field4278[arg2];
                                int var50 = class281.field4279[arg2];
                                int var51 = this.field7272[var48] * var50 + 32767 - this.field7309[var48] * var49 >> 15;
                                this.field7309[var48] = this.field7309[var48] * var50 + (this.field7272[var48] * var49 + 32767) >> 15;
                                this.field7272[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class281.field4278[arg4];
                                int var53 = class281.field4279[arg4];
                                int var54 = this.field7272[var48] * var52 + (this.field7352[var48] * var53) + 32767 >> 15;
                                this.field7272[var48] = this.field7272[var48] * var53 + 32767 - this.field7352[var48] * var52 >> 15;
                                this.field7352[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class281.field4278[arg3];
                                int var56 = class281.field4279[arg3];
                                int var57 = this.field7352[var48] * var56 + this.field7309[var48] * var55 + 32767 >> 15;
                                this.field7309[var48] = this.field7309[var48] * var56 + 32767 - (this.field7352[var48] * var55) >> 15;
                                this.field7352[var48] = var57;
                            }
                            this.field7352[var48] += class101.field1453;
                            this.field7272[var48] += class473.field6829;
                            this.field7309[var48] += class523.field7655;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field7291.length) {
                        int[] var29 = this.field7291[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field7273[var31];
                            int var33 = this.field7273[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field7306[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class281.field4278[arg4];
                                    int var37 = class281.field4279[arg4];
                                    int var38 = this.field7367[var35] * var36 + this.field7351[var35] * var37 + 32767 >> 15;
                                    this.field7367[var35] = (short) (this.field7367[var35] * var37 + 32767 - (this.field7351[var35] * var36) >> 15);
                                    this.field7351[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class281.field4278[arg2];
                                    int var40 = class281.field4279[arg2];
                                    int var41 = this.field7367[var35] * var40 + 32767 - (this.field7337[var35] * var39) >> 15;
                                    this.field7337[var35] = (short) (this.field7367[var35] * var39 + this.field7337[var35] * var40 + 32767 >> 15);
                                    this.field7367[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class281.field4278[arg3];
                                    int var43 = class281.field4279[arg3];
                                    int var44 = this.field7351[var35] * var43 + this.field7337[var35] * var42 + 32767 >> 15;
                                    this.field7337[var35] = (short) (this.field7337[var35] * var43 + 32767 - (this.field7351[var35] * var42) >> 15);
                                    this.field7351[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field7371 == null && this.field7369 != null) {
                    this.field7369.field6921 = null;
                }
                if (this.field7371 != null) {
                    this.field7371.field6921 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field7291.length > var70) {
                    int[] var71 = this.field7291[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field7352[var73] -= class101.field1453;
                        this.field7272[var73] -= class473.field6829;
                        this.field7309[var73] -= class523.field7655;
                        this.field7352[var73] = this.field7352[var73] * arg2 >> 7;
                        this.field7272[var73] = this.field7272[var73] * arg3 >> 7;
                        this.field7309[var73] = this.field7309[var73] * arg4 >> 7;
                        this.field7352[var73] += class101.field1453;
                        this.field7272[var73] += class473.field6829;
                        this.field7309[var73] += class523.field7655;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field7297 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field7297.length > var78) {
                        int[] var79 = this.field7297[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field7277[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field7277[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field7369 != null) {
                            this.field7369.field6921 = null;
                        }
                    }
                }
                if (this.field7373 != null) {
                    for (int var75 = 0; var75 < this.field7285; var75++) {
                        class356 var76 = this.field7373[var75];
                        class432 var77 = this.field7276[var75];
                        var77.field6401 = var77.field6401 & 0xFFFFFF | 255 - (this.field7277[var76.field5264] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field7297 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field7297.length) {
                        int[] var88 = this.field7297[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field7330[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = arg2 + var92 & 0x3F;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            int var97 = arg4 + var94;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field7330[var90] = (short) class264.method1763(var97, class264.method1763(var95 << 7, var96 << 10));
                        }
                        if (var88.length > 0 && this.field7369 != null) {
                            this.field7369.field6921 = null;
                        }
                    }
                }
                if (this.field7373 != null) {
                    for (int var84 = 0; var84 < this.field7285; var84++) {
                        class356 var85 = this.field7373[var84];
                        class432 var86 = this.field7276[var84];
                        var86.field6401 = var86.field6401 & 0xFF000000 | class312.field4694[this.field7330[var85.field5264] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field7287 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field7287.length) {
                        int[] var100 = this.field7287[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class432 var102 = this.field7276[var100[var101]];
                            var102.field6396 += arg3;
                            var102.field6394 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field7287 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field7287.length > var104) {
                        int[] var105 = this.field7287[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class432 var107 = this.field7276[var105[var106]];
                            var107.field6398 = var107.field6398 * arg2 >> 7;
                            var107.field6395 = var107.field6395 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field7287 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field7287.length > var109) {
                    int[] var110 = this.field7287[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class432 var112 = this.field7276[var110[var111]];
                        var112.field6399 = var112.field6399 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BIZ)Lt;", line = 773)
    public final class475 method449(byte arg0, int arg1, boolean arg2) {
        field7325++;
        class504 var4;
        class504 var5;
        if (arg0 == 1) {
            var5 = this.field7358.field3054;
            var4 = this.field7358.field3135;
        } else if (arg0 == 2) {
            var4 = this.field7358.field3064;
            var5 = this.field7358.field3137;
        } else if (arg0 == 3) {
            var4 = this.field7358.field3071;
            var5 = this.field7358.field3125;
        } else if (arg0 == 4) {
            var4 = this.field7358.field3050;
            var5 = this.field7358.field3079;
        } else if (arg0 == 5) {
            var5 = this.field7358.field3082;
            var4 = this.field7358.field3131;
        } else {
            var4 = var5 = new class504(this.field7358);
        }
        return this.method2994(arg1, arg2, (byte) 1, var5, var4, arg0 != 0);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILtp;FJIIBIF)S", line = 826)
    private final short method2993(int arg0, int arg1, class374 arg2, float arg3, long arg4, int arg5, int arg6, byte arg7, int arg8, float arg9) {
        field7293++;
        int var12 = this.field7273[arg0];
        if (arg7 < 21) {
            return -31;
        }
        int var13 = this.field7273[arg0 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field7306[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class490.field7045[var15] == arg4) {
                return (short) (var16 - 1);
            }
        }
        this.field7306[var14] = (short) (this.field7331 + 1);
        class490.field7045[var14] = arg4;
        this.field7351[this.field7331] = (short) arg6;
        this.field7367[this.field7331] = (short) arg8;
        this.field7337[this.field7331] = (short) arg5;
        this.field7365[this.field7331] = (byte) arg1;
        this.field7326[this.field7331] = arg9;
        this.field7312[this.field7331] = arg3;
        return (short) (this.field7331++);
    }

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "(SS)V", line = 872)
    public final void method457(short arg0, short arg1) {
        field7324++;
        class279 var3 = this.field7358.field524;
        for (int var4 = 0; var4 < this.field7275; var4++) {
            if (this.field7353[var4] == arg0) {
                this.field7353[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class281 var7 = var3.method584(true, arg0 & 0xFFFF);
            var5 = var7.field4273;
            var6 = var7.field4271;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class281 var10 = var3.method584(true, arg1 & 0xFFFF);
            var9 = var10.field4271;
            var8 = var10.field4273;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field7373 != null) {
            for (int var11 = 0; var11 < this.field7285; var11++) {
                class356 var12 = this.field7373[var11];
                class432 var13 = this.field7276[var11];
                var13.field6401 = class312.field4694[this.field7330[var12.field5264] & 0xFFFF] & 0xFFFFFF | var13.field6401 & 0xFF000000;
            }
        }
        if (this.field7369 != null) {
            this.field7369.field6921 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZBLlu;Llu;Z)Lt;", line = 945)
    private final class475 method2994(int arg0, boolean arg1, byte arg2, class504 arg3, class504 arg4, boolean arg5) {
        arg4.field7333 = this.field7333;
        arg4.field7313 = this.field7313;
        field7269++;
        arg4.field7265 = 0;
        arg4.field7374 = this.field7374;
        arg4.field7368 = this.field7368;
        arg4.field7266 = arg0;
        arg4.field7275 = this.field7275;
        arg4.field7316 = this.field7316;
        arg4.field7331 = this.field7331;
        arg4.field7285 = this.field7285;
        arg4.field7349 = this.field7349;
        boolean var7 = class266.method1773(this.field7368, (byte) -127, arg0);
        boolean var8 = class446.method2738(34, arg0, this.field7368);
        boolean var9 = class261.method1745(arg0, 20319, this.field7368);
        boolean var10 = var7 | var8 | var9;
        int var11 = -9 % ((-arg2 - 66) / 57);
        if (var10) {
            if (!var7) {
                arg4.field7352 = this.field7352;
            } else if (arg3.field7352 == null || this.field7316 > arg3.field7352.length) {
                arg4.field7352 = arg3.field7352 = new int[this.field7316];
            } else {
                arg4.field7352 = arg3.field7352;
            }
            if (!var8) {
                arg4.field7272 = this.field7272;
            } else if (arg3.field7272 == null || this.field7316 > arg3.field7272.length) {
                arg4.field7272 = arg3.field7272 = new int[this.field7316];
            } else {
                arg4.field7272 = arg3.field7272;
            }
            if (!var9) {
                arg4.field7309 = this.field7309;
            } else if (arg3.field7309 == null || arg3.field7309.length < this.field7316) {
                arg4.field7309 = arg3.field7309 = new int[this.field7316];
            } else {
                arg4.field7309 = arg3.field7309;
            }
            for (int var12 = 0; var12 < this.field7316; var12++) {
                if (var7) {
                    arg4.field7352[var12] = this.field7352[var12];
                }
                if (var8) {
                    arg4.field7272[var12] = this.field7272[var12];
                }
                if (var9) {
                    arg4.field7309[var12] = this.field7309[var12];
                }
            }
        } else {
            arg4.field7272 = this.field7272;
            arg4.field7309 = this.field7309;
            arg4.field7352 = this.field7352;
        }
        if (class281.method1830(this.field7368, -16385, arg0)) {
            arg4.field7341 = arg3.field7341;
            if (arg5) {
                arg4.field7265 = (byte) (arg4.field7265 | 0x1);
            }
            arg4.field7341.field6922 = this.field7341.field6922;
            arg4.field7341.field6921 = this.field7341.field6921;
        } else if (class334.method2112(16534, arg0, this.field7368)) {
            arg4.field7341 = this.field7341;
        } else {
            arg4.field7341 = null;
        }
        if (class215.method1488(this.field7368, arg0, 0)) {
            if (arg3.field7330 == null || this.field7275 > arg3.field7330.length) {
                arg4.field7330 = arg3.field7330 = new short[this.field7275];
            } else {
                arg4.field7330 = arg3.field7330;
            }
            for (int var13 = 0; var13 < this.field7275; var13++) {
                arg4.field7330[var13] = this.field7330[var13];
            }
        } else {
            arg4.field7330 = this.field7330;
        }
        if (class216.method1500(97, arg0, this.field7368)) {
            if (arg3.field7277 == null || arg3.field7277.length < this.field7275) {
                arg4.field7277 = arg3.field7277 = new byte[this.field7275];
            } else {
                arg4.field7277 = arg3.field7277;
            }
            for (int var14 = 0; var14 < this.field7275; var14++) {
                arg4.field7277[var14] = this.field7277[var14];
            }
        } else {
            arg4.field7277 = this.field7277;
        }
        if (class262.method1748(arg0, (byte) 49, this.field7368)) {
            arg4.field7369 = arg3.field7369;
            if (arg5) {
                arg4.field7265 = (byte) (arg4.field7265 | 0x2);
            }
            arg4.field7369.field6922 = this.field7369.field6922;
            arg4.field7369.field6921 = this.field7369.field6921;
        } else if (class362.method2273(22464, this.field7368, arg0)) {
            arg4.field7369 = this.field7369;
        } else {
            arg4.field7369 = null;
        }
        if (class379.method2380(arg0, this.field7368, 16384)) {
            if (arg3.field7351 == null || arg3.field7351.length < this.field7331) {
                int var15 = this.field7331;
                arg4.field7367 = arg3.field7367 = new short[var15];
                arg4.field7337 = arg3.field7337 = new short[var15];
                arg4.field7351 = arg3.field7351 = new short[var15];
            } else {
                arg4.field7367 = arg3.field7367;
                arg4.field7337 = arg3.field7337;
                arg4.field7351 = arg3.field7351;
            }
            if (this.field7327 == null) {
                for (int var19 = 0; var19 < this.field7331; var19++) {
                    arg4.field7351[var19] = this.field7351[var19];
                    arg4.field7367[var19] = this.field7367[var19];
                    arg4.field7337[var19] = this.field7337[var19];
                }
            } else {
                if (arg3.field7327 == null) {
                    arg3.field7327 = new class66();
                }
                class66 var16 = arg4.field7327 = arg3.field7327;
                if (var16.field856 == null || this.field7331 > var16.field856.length) {
                    int var17 = this.field7331;
                    var16.field858 = new short[var17];
                    var16.field856 = new short[var17];
                    var16.field851 = new short[var17];
                    var16.field852 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field7331; var18++) {
                    arg4.field7351[var18] = this.field7351[var18];
                    arg4.field7367[var18] = this.field7367[var18];
                    arg4.field7337[var18] = this.field7337[var18];
                    var16.field856[var18] = this.field7327.field856[var18];
                    var16.field851[var18] = this.field7327.field851[var18];
                    var16.field858[var18] = this.field7327.field858[var18];
                    var16.field852[var18] = this.field7327.field852[var18];
                }
            }
            arg4.field7365 = this.field7365;
        } else {
            arg4.field7365 = this.field7365;
            arg4.field7327 = this.field7327;
            arg4.field7337 = this.field7337;
            arg4.field7367 = this.field7367;
            arg4.field7351 = this.field7351;
        }
        if (class501.method2971((byte) 112, this.field7368, arg0)) {
            if (arg5) {
                arg4.field7265 = (byte) (arg4.field7265 | 0x4);
            }
            arg4.field7371 = arg3.field7371;
            arg4.field7371.field6921 = this.field7371.field6921;
            arg4.field7371.field6922 = this.field7371.field6922;
        } else if (class215.method1489(this.field7368, -1, arg0)) {
            arg4.field7371 = this.field7371;
        } else {
            arg4.field7371 = null;
        }
        if (class265.method1768(this.field7368, (byte) -79, arg0)) {
            if (arg3.field7326 == null || this.field7275 > arg3.field7326.length) {
                int var20 = this.field7331;
                arg4.field7312 = arg3.field7312 = new float[var20];
                arg4.field7326 = arg3.field7326 = new float[var20];
            } else {
                arg4.field7326 = arg3.field7326;
                arg4.field7312 = arg3.field7312;
            }
            for (int var21 = 0; var21 < this.field7331; var21++) {
                arg4.field7326[var21] = this.field7326[var21];
                arg4.field7312[var21] = this.field7312[var21];
            }
        } else {
            arg4.field7312 = this.field7312;
            arg4.field7326 = this.field7326;
        }
        if (class57.method518(true, arg0, this.field7368)) {
            arg4.field7334 = arg3.field7334;
            if (arg5) {
                arg4.field7265 = (byte) (arg4.field7265 | 0x8);
            }
            arg4.field7334.field6922 = this.field7334.field6922;
            arg4.field7334.field6921 = this.field7334.field6921;
        } else if (class405.method2528(arg0, false, this.field7368)) {
            arg4.field7334 = this.field7334;
        } else {
            arg4.field7334 = null;
        }
        if (class426.method2662(0, arg0, this.field7368)) {
            if (arg3.field7350 == null || arg3.field7350.length < this.field7275) {
                int var22 = this.field7275;
                arg4.field7350 = arg3.field7350 = new short[var22];
                arg4.field7283 = arg3.field7283 = new short[var22];
                arg4.field7318 = arg3.field7318 = new short[var22];
            } else {
                arg4.field7318 = arg3.field7318;
                arg4.field7283 = arg3.field7283;
                arg4.field7350 = arg3.field7350;
            }
            for (int var23 = 0; var23 < this.field7275; var23++) {
                arg4.field7350[var23] = this.field7350[var23];
                arg4.field7283[var23] = this.field7283[var23];
                arg4.field7318[var23] = this.field7318[var23];
            }
        } else {
            arg4.field7350 = this.field7350;
            arg4.field7318 = this.field7318;
            arg4.field7283 = this.field7283;
        }
        if (class78.method672(arg0, 14826, this.field7368)) {
            arg4.field7304 = arg3.field7304;
            if (arg5) {
                arg4.field7265 = (byte) (arg4.field7265 | 0x10);
            }
            arg4.field7304.field4936 = this.field7304.field4936;
        } else if (class281.method1831(arg0, this.field7368, 18794)) {
            arg4.field7304 = this.field7304;
        } else {
            arg4.field7304 = null;
        }
        if (class298.method1931(arg0, this.field7368, 2238)) {
            if (arg3.field7353 == null || arg3.field7353.length < this.field7275) {
                int var24 = this.field7275;
                arg4.field7353 = arg3.field7353 = new short[var24];
            } else {
                arg4.field7353 = arg3.field7353;
            }
            for (int var25 = 0; var25 < this.field7275; var25++) {
                arg4.field7353[var25] = this.field7353[var25];
            }
        } else {
            arg4.field7353 = this.field7353;
        }
        if (!class293.method1906(this.field7368, 16152, arg0)) {
            arg4.field7276 = this.field7276;
        } else if (arg3.field7276 == null || arg3.field7276.length < this.field7285) {
            int var27 = this.field7285;
            arg4.field7276 = arg3.field7276 = new class432[var27];
            for (int var28 = 0; var28 < this.field7285; var28++) {
                arg4.field7276[var28] = this.field7276[var28].method2682(true);
            }
        } else {
            arg4.field7276 = arg3.field7276;
            for (int var26 = 0; var26 < this.field7285; var26++) {
                arg4.field7276[var26].method2681(this.field7276[var26], 114);
            }
        }
        arg4.field7297 = this.field7297;
        arg4.field7315 = this.field7315;
        arg4.field7373 = this.field7373;
        arg4.field7348 = this.field7348;
        arg4.field7273 = this.field7273;
        arg4.field7291 = this.field7291;
        if (this.field7363) {
            arg4.field7343 = this.field7343;
            arg4.field7271 = this.field7271;
            arg4.field7363 = true;
            arg4.field7301 = this.field7301;
            arg4.field7357 = this.field7357;
            arg4.field7310 = this.field7310;
            arg4.field7340 = this.field7340;
            arg4.field7370 = this.field7370;
        } else {
            arg4.field7363 = false;
        }
        arg4.field7287 = this.field7287;
        arg4.field7306 = this.field7306;
        arg4.field7308 = this.field7308;
        arg4.field7346 = this.field7346;
        arg4.field7279 = this.field7279;
        return arg4;
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "()V", line = 1407)
    public final void method455() {
        field7270++;
        if (this.field7331 <= 0 || this.field7313 <= 0) {
            return;
        }
        this.method3001(false, (byte) -70);
        if ((this.field7265 & 0x10) == 0 && this.field7304.field4936 == null) {
            this.method3005((byte) 98, false);
        }
        this.method3003(true);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ISZIB)I", line = 1424)
    private final int method2995(int arg0, short arg1, boolean arg2, int arg3, byte arg4) {
        field7282++;
        int var6 = class312.field4694[class73.method633(-99, arg3, arg0)];
        if (arg1 != -1) {
            class281 var7 = this.field7358.field524.method584(true, arg1 & 0xFFFF);
            int var8 = var7.field4273 & 0xFF;
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
                    var6 = ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field4271 & 0xFF;
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
                var6 = (var14 & 0xFF00) + ((var13 & 0x5500FF00) << 8) + (var15 >> 8);
            }
        }
        if (!arg2) {
            this.method456();
        }
        return -(arg4 & 0xFF) - (-(var6 << 8) - 255);
    }

    @OriginalMember(owner = "client!lu", name = "NA", descriptor = "()I", line = 1503)
    public final int method451() {
        if (!this.field7363) {
            this.method3002(-112);
        }
        field7284++;
        return this.field7343;
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V", line = 1516)
    public final void method454(int arg0) {
        field7296++;
        int var2 = class281.field4278[arg0];
        int var3 = class281.field4279[arg0];
        for (int var4 = 0; var4 < this.field7374; var4++) {
            int var7 = this.field7352[var4] * var3 + this.field7309[var4] * var2 >> 15;
            this.field7309[var4] = this.field7309[var4] * var3 - (this.field7352[var4] * var2) >> 15;
            this.field7352[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field7331; var5++) {
            int var6 = this.field7351[var5] * var3 + this.field7337[var5] * var2 >> 15;
            this.field7337[var5] = (short) (this.field7337[var5] * var3 - (this.field7351[var5] * var2) >> 15);
            this.field7351[var5] = (short) var6;
        }
        if (this.field7371 == null && this.field7369 != null) {
            this.field7369.field6921 = null;
        }
        if (this.field7371 != null) {
            this.field7371.field6921 = null;
        }
        this.field7363 = false;
        if (this.field7341 != null) {
            this.field7341.field6921 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "R", descriptor = "(I)V", line = 1565)
    public final void method420(int arg0) {
        field7314++;
        int var2 = class281.field4278[arg0];
        int var3 = class281.field4279[arg0];
        for (int var4 = 0; var4 < this.field7374; var4++) {
            int var5 = this.field7352[var4] * var3 + this.field7272[var4] * var2 >> 15;
            this.field7272[var4] = this.field7272[var4] * var3 - (this.field7352[var4] * var2) >> 15;
            this.field7352[var4] = var5;
        }
        if (this.field7341 != null) {
            this.field7341.field6921 = null;
        }
        this.field7363 = false;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V", line = 1596)
    public static void method2996(byte arg0) {
        if (arg0 != 73) {
            method2996((byte) -121);
        }
        field7292 = null;
    }

    @OriginalMember(owner = "client!lu", name = "HA", descriptor = "()I", line = 1606)
    public final int method423() {
        if (!this.field7363) {
            this.method3002(-127);
        }
        field7345++;
        return this.field7301;
    }

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "()I", line = 1621)
    public final int method430() {
        field7274++;
        return this.field7333;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILqg;)V", line = 1634)
    private final void method2997(int arg0, class325 arg1) {
        if (arg0 != 4) {
            this.method2995(86, (short) -126, false, -62, (byte) 20);
        }
        field7280++;
        if (this.field7348 != null) {
            for (int var3 = 0; var3 < this.field7348.length; var3++) {
                class262 var4 = this.field7348[var3];
                class262 var5 = var4;
                if (var4.field4029 != null) {
                    var5 = var4.field4029;
                }
                var5.field4016 = (int) ((float) this.field7309[var4.field4025] * arg1.field4871 + (float) this.field7352[var4.field4025] * arg1.field4877 + (float) this.field7272[var4.field4025] * arg1.field4879 + arg1.field4875);
                var5.field4013 = (int) ((float) this.field7309[var4.field4025] * arg1.field4895 + (float) this.field7352[var4.field4025] * arg1.field4876 + (float) this.field7272[var4.field4025] * arg1.field4894 + arg1.field4887);
                var5.field4024 = (int) ((float) this.field7309[var4.field4025] * arg1.field4864 + (float) this.field7352[var4.field4025] * arg1.field4885 + (float) this.field7272[var4.field4025] * arg1.field4884 + arg1.field4889);
                var5.field4015 = (int) ((float) this.field7309[var4.field4026] * arg1.field4871 + (float) this.field7352[var4.field4026] * arg1.field4877 + (float) this.field7272[var4.field4026] * arg1.field4879 + arg1.field4875);
                var5.field4031 = (int) ((float) this.field7309[var4.field4026] * arg1.field4895 + (float) this.field7352[var4.field4026] * arg1.field4876 + (float) this.field7272[var4.field4026] * arg1.field4894 + arg1.field4887);
                var5.field4028 = (int) ((float) this.field7309[var4.field4026] * arg1.field4864 + (float) this.field7352[var4.field4026] * arg1.field4885 + (float) this.field7272[var4.field4026] * arg1.field4884 + arg1.field4889);
                var5.field4033 = (int) ((float) this.field7309[var4.field4027] * arg1.field4871 + (float) this.field7352[var4.field4027] * arg1.field4877 + (float) this.field7272[var4.field4027] * arg1.field4879 + arg1.field4875);
                var5.field4034 = (int) ((float) this.field7309[var4.field4027] * arg1.field4895 + (float) this.field7352[var4.field4027] * arg1.field4876 + (float) this.field7272[var4.field4027] * arg1.field4894 + arg1.field4887);
                var5.field4021 = (int) ((float) this.field7309[var4.field4027] * arg1.field4864 + (float) this.field7352[var4.field4027] * arg1.field4885 + (float) this.field7272[var4.field4027] * arg1.field4884 + arg1.field4889);
            }
        }
        if (this.field7279 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field7279.length; var6++) {
            class471 var7 = this.field7279[var6];
            class471 var8 = var7;
            if (var7.field6802 != null) {
                var8 = var7.field6802;
            }
            if (var7.field6809 == null) {
                var7.field6809 = arg1.method205();
            } else {
                var7.field6809.method214(arg1);
            }
            var8.field6803 = (int) ((float) this.field7309[var7.field6813] * arg1.field4871 + (float) this.field7352[var7.field6813] * arg1.field4877 + (float) this.field7272[var7.field6813] * arg1.field4879 + arg1.field4875);
            var8.field6806 = (int) ((float) this.field7309[var7.field6813] * arg1.field4895 + (float) this.field7352[var7.field6813] * arg1.field4876 + (float) this.field7272[var7.field6813] * arg1.field4894 + arg1.field4887);
            var8.field6805 = (int) ((float) this.field7309[var7.field6813] * arg1.field4864 + (float) this.field7352[var7.field6813] * arg1.field4885 + (float) this.field7272[var7.field6813] * arg1.field4884 + arg1.field4889);
        }
    }

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "()I", line = 1703)
    public final int method433() {
        field7295++;
        return this.field7266;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V", line = 1711)
    public static final void method2998(int arg0) {
        field7298++;
        if (arg0 != -26031) {
            field7292 = null;
        }
        for (class453 var1 = (class453) class100.field1431.method1004((byte) -104); var1 != null; var1 = (class453) class100.field1431.method996(1)) {
            class5 var2 = var1.field6605;
            if (var2.field61) {
                var1.method2677(arg0 ^ 0x3274);
                var2.method20(2920);
            } else if (class475.field6854 >= var2.field59) {
                var2.method19(0, class295.field4496);
                if (var2.field61) {
                    var1.method2677(-22491);
                } else {
                    class495.method2940(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lc;Lju;II)V", line = 1751)
    public final void method437(class125 arg0, class83 arg1, int arg2, int arg3) {
        field7267++;
        if (this.field7331 == 0) {
            return;
        }
        class325 var5 = this.field7358.field3063;
        class325 var6 = (class325) arg0;
        if (!this.field7363) {
            this.method3002(-120);
        }
        class86.field1237 = var5.field4864 * var6.field4889 + var5.field4885 * var6.field4875 + var5.field4884 * var6.field4887 + var5.field4889;
        class142.field2174 = var5.field4864 * var6.field4884 + var5.field4885 * var6.field4879 + var5.field4884 * var6.field4894;
        float var7 = (float) this.field7271 * class142.field2174 + class86.field1237;
        float var8 = (float) this.field7340 * class142.field2174 + class86.field1237;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = var8 - (float) this.field7310;
            var10 = (float) this.field7310 + var7;
        } else {
            var10 = (float) this.field7310 + var8;
            var9 = var7 - (float) this.field7310;
        }
        if ((var9 >= this.field7358.field3065) || (var10 <= (float) this.field7358.field3086)) {
            return;
        }
        class24.field305 = var5.field4871 * var6.field4884 + var5.field4879 * var6.field4894 + var5.field4877 * var6.field4879;
        class277.field4218 = var5.field4871 * var6.field4889 + var5.field4879 * var6.field4887 + var5.field4877 * var6.field4875 + var5.field4875;
        float var11 = (float) this.field7271 * class24.field305 + class277.field4218;
        float var12 = (float) this.field7340 * class24.field305 + class277.field4218;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field7310 + var11) * (float) this.field7358.field3109;
            var14 = (var12 - (float) this.field7310) * (float) this.field7358.field3109;
        } else {
            var14 = ((float) (-this.field7310) + var11) * (float) this.field7358.field3109;
            var13 = ((float) this.field7310 + var12) * (float) this.field7358.field3109;
        }
        if ((var14 / (float) arg2 >= this.field7358.field3105) || (var13 / (float) arg2 <= this.field7358.field3056)) {
            return;
        }
        class415.field6194 = var5.field4895 * var6.field4889 + var5.field4894 * var6.field4887 + var5.field4876 * var6.field4875 + var5.field4887;
        class474.field6845 = var5.field4895 * var6.field4884 + var5.field4894 * var6.field4894 + var5.field4876 * var6.field4879;
        float var15 = (float) this.field7271 * class474.field6845 + class415.field6194;
        float var16 = (float) this.field7340 * class474.field6845 + class415.field6194;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = ((float) this.field7310 + var15) * (float) this.field7358.field3099;
            var17 = ((float) (-this.field7310) + var16) * (float) this.field7358.field3099;
        } else {
            var17 = (var15 - (float) this.field7310) * (float) this.field7358.field3099;
            var18 = ((float) this.field7310 + var16) * (float) this.field7358.field3099;
        }
        if ((var17 / (float) arg2 >= this.field7358.field3052) || (this.field7358.field3113 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field7373 != null) {
            class444.field6522 = var5.field4864 * var6.field4885 + var5.field4885 * var6.field4877 + var5.field4884 * var6.field4876;
            class17.field222 = var5.field4864 * var6.field4864 + var5.field4885 * var6.field4871 + var5.field4884 * var6.field4895;
            class134.field2048 = var5.field4895 * var6.field4885 + var5.field4894 * var6.field4876 + var5.field4876 * var6.field4877;
            class471.field6810 = var5.field4895 * var6.field4864 + var5.field4894 * var6.field4895 + var5.field4876 * var6.field4871;
            class301.field4568 = var5.field4871 * var6.field4864 + var5.field4879 * var6.field4895 + var5.field4877 * var6.field4871;
            class294.field4472 = var5.field4871 * var6.field4885 + var5.field4879 * var6.field4876 + var5.field4877 * var6.field4877;
        }
        if (arg1 != null) {
            int var19 = this.field7301 + this.field7343 >> 1;
            int var20 = this.field7370 + this.field7357 >> 1;
            int var21 = (int) ((float) var20 * class301.field4568 + (float) this.field7271 * class24.field305 + (float) var19 * class294.field4472 + class277.field4218);
            int var22 = (int) ((float) var20 * class471.field6810 + (float) this.field7271 * class474.field6845 + (float) var19 * class134.field2048 + class415.field6194);
            int var23 = (int) ((float) var20 * class17.field222 + (float) this.field7271 * class142.field2174 + (float) var19 * class444.field6522 + class86.field1237);
            int var24 = (int) ((float) var20 * class301.field4568 + (float) this.field7340 * class24.field305 + (float) var19 * class294.field4472 + class277.field4218);
            int var25 = (int) ((float) var20 * class471.field6810 + (float) this.field7340 * class474.field6845 + (float) var19 * class134.field2048 + class415.field6194);
            arg1.field1202 = this.field7358.field3089 + (this.field7358.field3099 * var25 / arg2);
            arg1.field1199 = this.field7358.field3109 * var24 / arg2 + this.field7358.field3095;
            arg1.field1203 = this.field7358.field3099 * var22 / arg2 + this.field7358.field3089;
            arg1.field1200 = this.field7358.field3095 + (this.field7358.field3109 * var21 / arg2);
            int var26 = (int) ((float) var20 * class17.field222 + (float) this.field7340 * class142.field2174 + (float) var19 * class444.field6522 + class86.field1237);
            if (this.field7358.field3086 > var23 && this.field7358.field3086 > var26) {
                arg1.field1201 = true;
                arg1.field1198 = (this.field7310 + var21) * this.field7358.field3109 / arg2 + this.field7358.field3095 - arg1.field1200;
            }
        }
        this.field7358.method1245((float) arg2, (byte) 126);
        this.field7358.method1268((byte) -58);
        this.field7358.method1252(var6, false);
        this.method3000(1);
        this.field7358.method1312((byte) 112);
        this.method2999(65366951);
    }

    @OriginalMember(owner = "client!lu", name = "MA", descriptor = "()I", line = 1900)
    public final int method427() {
        if (!this.field7363) {
            this.method3002(-88);
        }
        field7354++;
        return this.field7271;
    }

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "(I)V", line = 1912)
    public final void method446(int arg0) {
        this.field7349 = (short) arg0;
        if (this.field7369 != null) {
            this.field7369.field6921 = null;
        }
        field7320++;
    }

    @OriginalMember(owner = "client!lu", name = "fa", descriptor = "(Lba;)Lba;", line = 1931)
    public final class265 method443(class265 arg0) {
        field7366++;
        if (this.field7331 == 0) {
            return null;
        }
        if (!this.field7363) {
            this.method3002(-91);
        }
        int var2;
        int var3;
        if (this.field7358.field3161 <= 0) {
            var2 = this.field7301 - (this.field7358.field3161 * this.field7271 >> 8) >> this.field7358.field3028;
            var3 = this.field7343 - (this.field7358.field3161 * this.field7340 >> 8) >> this.field7358.field3028;
        } else {
            var2 = this.field7301 - (this.field7358.field3161 * this.field7340 >> 8) >> this.field7358.field3028;
            var3 = this.field7343 - (this.field7358.field3161 * this.field7271 >> 8) >> this.field7358.field3028;
        }
        int var4;
        int var5;
        if (this.field7358.field3123 > 0) {
            var4 = this.field7357 - (this.field7358.field3123 * this.field7340 >> 8) >> this.field7358.field3028;
            var5 = this.field7370 - (this.field7358.field3123 * this.field7271 >> 8) >> this.field7358.field3028;
        } else {
            var4 = this.field7357 - (this.field7358.field3123 * this.field7271 >> 8) >> this.field7358.field3028;
            var5 = this.field7370 - (this.field7358.field3123 * this.field7340 >> 8) >> this.field7358.field3028;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class339 var8 = (class339) arg0;
        class339 var9;
        if (var8 != null && var8.method2143(var6, var7, 24853)) {
            var9 = var8;
            var8.method2142(-114);
        } else {
            var9 = new class339(this.field7358, var6, var7);
        }
        var9.method2144(var2, -1, var5, var3, var4);
        this.method3006(var9, (byte) 107);
        return var9;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "()[Ldv;", line = 1992)
    public final class471[] method456() {
        field7299++;
        return this.field7279;
    }

    @OriginalMember(owner = "client!lu", name = "D", descriptor = "()I", line = 2001)
    public final int method419() {
        field7344++;
        return this.field7349;
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)V", line = 2017)
    private final void method2999(int arg0) {
        if (this.field7373 != null) {
            class325 var2 = this.field7358.field3024;
            float var3 = this.field7358.method275();
            float var4 = this.field7358.method335();
            this.field7358.method1282(arg0 - 65366851);
            this.field7358.method282(false);
            this.field7358.method1272(false, arg0 - 65366992);
            this.field7358.method1267(null, this.field7358.field3112, (byte) -36, this.field7358.field3083, null);
            for (int var5 = 0; var5 < this.field7285; var5++) {
                class356 var6 = this.field7373[var5];
                class432 var7 = this.field7276[var5];
                if (!var6.field5274 || !this.field7358.method340()) {
                    float var8 = (float) (this.field7352[var6.field5273] + this.field7352[var6.field5266] + this.field7352[var6.field5267]) * 0.3333333F;
                    float var9 = (float) (this.field7272[var6.field5267] + this.field7272[var6.field5266] + this.field7272[var6.field5273]) * 0.3333333F;
                    float var10 = (float) (this.field7309[var6.field5267] + this.field7309[var6.field5266] + this.field7309[var6.field5273]) * 0.3333333F;
                    float var11 = class301.field4568 * var10 + class294.field4472 * var8 + class24.field305 * var9 + class277.field4218;
                    float var12 = class471.field6810 * var10 + class474.field6845 * var9 + class134.field2048 * var8 + class415.field6194;
                    float var13 = class17.field222 * var10 + class444.field6522 * var8 + class142.field2174 * var9 + class86.field1237;
                    var2.method2070((byte) 120, (float) var7.field6394 + var11, (float) var7.field6396 + -var12, -var13, var7.field6399, var6.field5269 * var7.field6398 >> 7, var6.field5263 * var7.field6395 >> 7);
                    this.field7358.method1273((byte) 98, var2);
                    this.field7358.method365(var4, var3 - (float) var6.field5260 * 1.5F);
                    int var14 = var7.field6401;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field7358.method1304(-26349, var6.field5265);
                    this.field7358.method1291(var6.field5277, false);
                    this.field7358.method1248(var6.field5272, true);
                    this.field7358.method1253(1, 0, 7, 4);
                }
            }
            this.field7358.method365(var4, var3);
            this.field7358.method282(true);
            this.field7358.method1312((byte) 112);
        }
        if (arg0 == 65366951) {
            field7336++;
        }
    }

    @OriginalMember(owner = "client!lu", name = "aa", descriptor = "(I)V", line = 2082)
    public final void method417(int arg0) {
        this.field7333 = (short) arg0;
        field7290++;
        if (this.field7369 != null) {
            this.field7369.field6921 = null;
        }
        if (this.field7371 != null) {
            this.field7371.field6921 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "UA", descriptor = "(I)V", line = 2104)
    public final void method435(int arg0) {
        field7300++;
        this.field7266 = arg0;
        this.field7323 = true;
        if (this.field7327 != null && (this.field7266 & 0x10000) == 0) {
            this.field7351 = this.field7327.field856;
            this.field7367 = this.field7327.field851;
            this.field7337 = this.field7327.field858;
            this.field7365 = this.field7327.field852;
            this.field7327 = null;
        }
        this.method3003(true);
    }

    @OriginalMember(owner = "client!lu", name = "IA", descriptor = "()V", line = 2129)
    public final void method458() {
        field7362++;
        for (int var1 = 0; var1 < this.field7374; var1++) {
            this.field7309[var1] = -this.field7309[var1];
        }
        for (int var2 = 0; var2 < this.field7331; var2++) {
            this.field7337[var2] = (short) (-this.field7337[var2]);
        }
        for (int var3 = 0; var3 < this.field7275; var3++) {
            short var4 = this.field7350[var3];
            this.field7350[var3] = this.field7318[var3];
            this.field7318[var3] = var4;
        }
        if (this.field7371 == null && this.field7369 != null) {
            this.field7369.field6921 = null;
        }
        if (this.field7371 != null) {
            this.field7371.field6921 = null;
        }
        this.field7363 = false;
        if (this.field7304 != null) {
            this.field7304.field4936 = null;
        }
        if (this.field7341 != null) {
            this.field7341.field6921 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "(IIII)V", line = 2181)
    public final void method426(int arg0, int arg1, int arg2, int arg3) {
        field7307++;
        if (arg0 == 0) {
            class523.field7655 = 0;
            class101.field1453 = 0;
            int var5 = 0;
            class473.field6829 = 0;
            for (int var6 = 0; var6 < this.field7374; var6++) {
                class101.field1453 += this.field7352[var6];
                class473.field6829 += this.field7272[var6];
                var5++;
                class523.field7655 += this.field7309[var6];
            }
            if (var5 <= 0) {
                class523.field7655 = arg3;
                class101.field1453 = arg1;
                class473.field6829 = arg2;
            } else {
                class523.field7655 = class523.field7655 / var5 + arg3;
                class101.field1453 = class101.field1453 / var5 + arg1;
                class473.field6829 = class473.field6829 / var5 + arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field7374; var7++) {
                this.field7352[var7] += arg1;
                this.field7272[var7] += arg2;
                this.field7309[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field7374; var8++) {
                this.field7352[var8] -= class101.field1453;
                this.field7272[var8] -= class473.field6829;
                this.field7309[var8] -= class523.field7655;
                if (arg3 != 0) {
                    int var9 = class281.field4278[arg3];
                    int var10 = class281.field4279[arg3];
                    int var11 = this.field7272[var8] * var9 + this.field7352[var8] * var10 + 32767 >> 15;
                    this.field7272[var8] = this.field7272[var8] * var10 + 32767 - (this.field7352[var8] * var9) >> 15;
                    this.field7352[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class281.field4278[arg1];
                    int var13 = class281.field4279[arg1];
                    int var14 = this.field7272[var8] * var13 + 32767 - this.field7309[var8] * var12 >> 15;
                    this.field7309[var8] = this.field7309[var8] * var13 + this.field7272[var8] * var12 + 32767 >> 15;
                    this.field7272[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class281.field4278[arg2];
                    int var16 = class281.field4279[arg2];
                    int var17 = this.field7352[var8] * var16 + this.field7309[var8] * var15 + 32767 >> 15;
                    this.field7309[var8] = this.field7309[var8] * var16 - (this.field7352[var8] * var15 - 32767) >> 15;
                    this.field7352[var8] = var17;
                }
                this.field7352[var8] += class101.field1453;
                this.field7272[var8] += class473.field6829;
                this.field7309[var8] += class523.field7655;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field7374; var18++) {
                this.field7352[var18] -= class101.field1453;
                this.field7272[var18] -= class473.field6829;
                this.field7309[var18] -= class523.field7655;
                this.field7352[var18] = this.field7352[var18] * arg1 / 128;
                this.field7272[var18] = this.field7272[var18] * arg2 / 128;
                this.field7309[var18] = this.field7309[var18] * arg3 / 128;
                this.field7352[var18] += class101.field1453;
                this.field7272[var18] += class473.field6829;
                this.field7309[var18] += class523.field7655;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field7275; var19++) {
                int var23 = (this.field7277[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field7277[var19] = (byte) var23;
            }
            if (this.field7369 != null) {
                this.field7369.field6921 = null;
            }
            if (this.field7373 != null) {
                for (int var20 = 0; var20 < this.field7285; var20++) {
                    class356 var21 = this.field7373[var20];
                    class432 var22 = this.field7276[var20];
                    var22.field6401 = 255 - (this.field7277[var21.field5264] & 0xFF) << 24 | var22.field6401 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field7275; var24++) {
                int var28 = this.field7330[var24] & 0xFFFF;
                int var29 = (var28 & 0xFC83) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = arg1 + var29 & 0x3F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field7330[var24] = (short) class264.method1763(var34, class264.method1763(var33 << 10, var32 << 7));
            }
            if (this.field7369 != null) {
                this.field7369.field6921 = null;
            }
            if (this.field7373 != null) {
                for (int var25 = 0; var25 < this.field7285; var25++) {
                    class356 var26 = this.field7373[var25];
                    class432 var27 = this.field7276[var25];
                    var27.field6401 = var27.field6401 & 0xFF000000 | class312.field4694[this.field7330[var26.field5264] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field7285; var35++) {
                class432 var36 = this.field7276[var35];
                var36.field6394 += arg1;
                var36.field6396 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field7285; var37++) {
                class432 var38 = this.field7276[var37];
                var38.field6395 = var38.field6395 * arg2 >> 7;
                var38.field6398 = var38.field6398 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field7285; var39++) {
                class432 var40 = this.field7276[var39];
                var40.field6399 = var40.field6399 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "()V", line = 2493)
    public final void method447() {
        for (int var1 = 0; var1 < this.field7316; var1++) {
            this.field7352[var1] = this.field7352[var1] + 7 >> 4;
            this.field7272[var1] = this.field7272[var1] + 7 >> 4;
            this.field7309[var1] = this.field7309[var1] + 7 >> 4;
        }
        field7347++;
        this.field7363 = false;
        if (this.field7341 != null) {
            this.field7341.field6921 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "(I)V", line = 2521)
    private final void method3000(int arg0) {
        field7361++;
        if (this.field7313 == 0) {
            return;
        }
        if (this.field7265 != 0) {
            this.method3001(true, (byte) -67);
        }
        if (arg0 != 1) {
            this.field7358 = null;
        }
        this.method3001(false, (byte) -112);
        if (this.field7304 != null) {
            if (this.field7304.field4936 == null) {
                this.method3005((byte) 98, (this.field7265 & 0x10) != 0);
            }
            if (this.field7304.field4936 != null) {
                this.field7358.method1272(this.field7371 != null, 106);
                this.field7358.method1267(this.field7371, this.field7334, (byte) -60, this.field7341, this.field7369);
                int var2 = this.field7315.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field7315[var3];
                    int var5 = this.field7315[var3 + 1];
                    int var6 = this.field7353[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field7358.method1319(34184, this.field7371 != null, var6);
                    this.field7358.method1270(this.field7304.field4936, (var5 - var4) * 3, var4 * 3, 4, -2);
                }
            }
        }
        this.method3003(true);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lc;Lju;I)V", line = 2579)
    public final void method439(class125 arg0, class83 arg1, int arg2) {
        field7329++;
        if (this.field7331 == 0) {
            return;
        }
        class325 var4 = this.field7358.field3063;
        class325 var5 = (class325) arg0;
        if (!this.field7363) {
            this.method3002(-75);
        }
        this.method2997(4, var5);
        class86.field1237 = var4.field4864 * var5.field4889 + var4.field4885 * var5.field4875 + var4.field4884 * var5.field4887 + var4.field4889;
        class142.field2174 = var4.field4864 * var5.field4884 + var4.field4885 * var5.field4879 + var4.field4884 * var5.field4894;
        float var6 = (float) this.field7271 * class142.field2174 + class86.field1237;
        float var7 = (float) this.field7340 * class142.field2174 + class86.field1237;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) this.field7310 + var6;
            var8 = (float) (-this.field7310) + var7;
        } else {
            var8 = var6 - (float) this.field7310;
            var9 = (float) this.field7310 + var7;
        }
        if ((this.field7358.field3090 <= var8) || ((float) this.field7358.field3086 >= var9)) {
            return;
        }
        class24.field305 = var4.field4871 * var5.field4884 + var4.field4879 * var5.field4894 + var4.field4877 * var5.field4879;
        class277.field4218 = var4.field4871 * var5.field4889 + var4.field4879 * var5.field4887 + var4.field4877 * var5.field4875 + var4.field4875;
        float var10 = (float) this.field7271 * class24.field305 + class277.field4218;
        float var11 = (float) this.field7340 * class24.field305 + class277.field4218;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var13 = ((float) this.field7310 + var10) * (float) this.field7358.field3109;
            var12 = ((float) (-this.field7310) + var11) * (float) this.field7358.field3109;
        } else {
            var12 = (var10 - (float) this.field7310) * (float) this.field7358.field3109;
            var13 = ((float) this.field7310 + var11) * (float) this.field7358.field3109;
        }
        if ((this.field7358.field3105 <= var12 / var9) || (var13 / var9 <= this.field7358.field3056)) {
            return;
        }
        class415.field6194 = var4.field4895 * var5.field4889 + var4.field4894 * var5.field4887 + var4.field4876 * var5.field4875 + var4.field4887;
        class474.field6845 = var4.field4895 * var5.field4884 + var4.field4894 * var5.field4894 + var4.field4876 * var5.field4879;
        float var14 = (float) this.field7271 * class474.field6845 + class415.field6194;
        float var15 = (float) this.field7340 * class474.field6845 + class415.field6194;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var16 = (var15 - (float) this.field7310) * (float) this.field7358.field3099;
            var17 = ((float) this.field7310 + var14) * (float) this.field7358.field3099;
        } else {
            var16 = (var14 - (float) this.field7310) * (float) this.field7358.field3099;
            var17 = ((float) this.field7310 + var15) * (float) this.field7358.field3099;
        }
        if ((this.field7358.field3052 <= var16 / var9) || (var17 / var9 <= this.field7358.field3113)) {
            return;
        }
        if (arg1 != null || this.field7373 != null) {
            class471.field6810 = var4.field4895 * var5.field4864 + var4.field4894 * var5.field4895 + var4.field4876 * var5.field4871;
            class294.field4472 = var4.field4871 * var5.field4885 + var4.field4879 * var5.field4876 + var4.field4877 * var5.field4877;
            class17.field222 = var4.field4864 * var5.field4864 + var4.field4885 * var5.field4871 + var4.field4884 * var5.field4895;
            class134.field2048 = var4.field4895 * var5.field4885 + var4.field4894 * var5.field4876 + var4.field4876 * var5.field4877;
            class301.field4568 = var4.field4871 * var5.field4864 + var4.field4879 * var5.field4895 + var4.field4877 * var5.field4871;
            class444.field6522 = var4.field4864 * var5.field4885 + var4.field4885 * var5.field4877 + var4.field4884 * var5.field4876;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field7343 + this.field7301 >> 1;
            int var21 = this.field7370 + this.field7357 >> 1;
            int var22 = (int) ((float) var21 * class301.field4568 + (float) this.field7271 * class24.field305 + (float) var20 * class294.field4472 + class277.field4218);
            int var23 = (int) ((float) var21 * class471.field6810 + (float) this.field7271 * class474.field6845 + (float) var20 * class134.field2048 + class415.field6194);
            int var24 = (int) ((float) var21 * class17.field222 + (float) this.field7271 * class142.field2174 + (float) var20 * class444.field6522 + class86.field1237);
            if (this.field7358.field3086 > var24) {
                var18 = true;
            } else {
                arg1.field1203 = this.field7358.field3089 + (this.field7358.field3099 * var23 / var24);
                arg1.field1200 = this.field7358.field3109 * var22 / var24 + this.field7358.field3095;
            }
            int var25 = (int) ((float) var21 * class301.field4568 + (float) this.field7340 * class24.field305 + (float) var20 * class294.field4472 + class277.field4218);
            int var26 = (int) ((float) var21 * class471.field6810 + (float) this.field7340 * class474.field6845 + (float) var20 * class134.field2048 + class415.field6194);
            int var27 = (int) ((float) var21 * class17.field222 + (float) this.field7340 * class142.field2174 + (float) var20 * class444.field6522 + class86.field1237);
            if (this.field7358.field3086 <= var27) {
                arg1.field1202 = this.field7358.field3099 * var26 / var27 + this.field7358.field3089;
                arg1.field1199 = this.field7358.field3095 + (this.field7358.field3109 * var25 / var27);
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field7358.field3086 && this.field7358.field3086 > var27) {
                    var19 = false;
                } else if (var24 < this.field7358.field3086) {
                    int var31 = (var27 - this.field7358.field3086 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field1200 = this.field7358.field3109 * var32 / this.field7358.field3086 + this.field7358.field3095;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field1203 = this.field7358.field3099 * var33 / this.field7358.field3086 + this.field7358.field3089;
                } else if (var27 < this.field7358.field3086) {
                    int var28 = (var24 - this.field7358.field3086 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    arg1.field1200 = this.field7358.field3109 * var29 / this.field7358.field3086 + this.field7358.field3095;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field1203 = this.field7358.field3099 * var30 / this.field7358.field3086 + this.field7358.field3089;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field1198 = (this.field7310 + var22) * this.field7358.field3109 / var24 + this.field7358.field3095 - arg1.field1200;
                } else {
                    arg1.field1198 = this.field7358.field3095 - (arg1.field1199 - ((this.field7310 + var25) * this.field7358.field3109 / var27));
                }
                arg1.field1201 = true;
            }
        }
        this.field7358.method1271(-9744);
        this.field7358.method1252(var5, false);
        this.method3000(1);
        this.field7358.method1312((byte) 112);
        this.method2999(65366951);
    }

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "()I", line = 2781)
    public final int method428() {
        field7302++;
        if (!this.field7363) {
            this.method3002(-106);
        }
        return this.field7370;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILc;Z)Z", line = 2793)
    public final boolean method440(int arg0, int arg1, class125 arg2, boolean arg3) {
        field7360++;
        class325 var5 = (class325) arg2;
        class325 var6 = this.field7358.field3063;
        float var7 = var5.field4889 * var6.field4871 + var5.field4887 * var6.field4879 + var5.field4875 * var6.field4877 + var6.field4875;
        float var8 = var5.field4889 * var6.field4895 + var5.field4887 * var6.field4894 + var5.field4875 * var6.field4876 + var6.field4887;
        class471.field6810 = var5.field4864 * var6.field4895 + var5.field4895 * var6.field4894 + var5.field4871 * var6.field4876;
        class134.field2048 = var5.field4885 * var6.field4895 + var5.field4877 * var6.field4876 + var5.field4876 * var6.field4894;
        class24.field305 = var5.field4884 * var6.field4871 + var5.field4894 * var6.field4879 + var5.field4879 * var6.field4877;
        class294.field4472 = var5.field4885 * var6.field4871 + var5.field4877 * var6.field4877 + var5.field4876 * var6.field4879;
        class444.field6522 = var5.field4885 * var6.field4864 + var5.field4877 * var6.field4885 + var5.field4876 * var6.field4884;
        class301.field4568 = var5.field4864 * var6.field4871 + var5.field4895 * var6.field4879 + var5.field4871 * var6.field4877;
        class17.field222 = var5.field4864 * var6.field4864 + var5.field4895 * var6.field4884 + var5.field4871 * var6.field4885;
        class142.field2174 = var5.field4884 * var6.field4864 + var5.field4894 * var6.field4884 + var5.field4879 * var6.field4885;
        float var9 = var5.field4889 * var6.field4864 + var5.field4887 * var6.field4884 + var5.field4875 * var6.field4885 + var6.field4889;
        class474.field6845 = var5.field4884 * var6.field4895 + var5.field4894 * var6.field4894 + var5.field4879 * var6.field4876;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field7358.field3109;
        int var16 = this.field7358.field3099;
        if (!this.field7363) {
            this.method3002(-112);
        }
        class409.field6103[0] = this.field7301;
        class325.field4898[0] = this.field7271;
        class371.field5522[0] = this.field7357;
        class409.field6103[1] = this.field7343;
        class325.field4898[1] = this.field7271;
        class409.field6103[2] = this.field7301;
        class371.field5522[1] = this.field7357;
        class325.field4898[2] = this.field7340;
        class409.field6103[3] = this.field7343;
        class371.field5522[2] = this.field7357;
        class325.field4898[3] = this.field7340;
        class409.field6103[4] = this.field7301;
        class371.field5522[3] = this.field7357;
        class325.field4898[4] = this.field7271;
        class371.field5522[4] = this.field7370;
        class409.field6103[5] = this.field7343;
        class325.field4898[5] = this.field7271;
        class409.field6103[6] = this.field7301;
        class371.field5522[5] = this.field7370;
        class325.field4898[6] = this.field7340;
        class371.field5522[6] = this.field7370;
        class409.field6103[7] = this.field7343;
        class325.field4898[7] = this.field7340;
        class371.field5522[7] = this.field7370;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class409.field6103[var17];
            float var39 = (float) class371.field5522[var17];
            float var40 = (float) class325.field4898[var17];
            float var41 = class17.field222 * var39 + class444.field6522 * var38 + class142.field2174 * var40 + var9;
            float var42 = class471.field6810 * var39 + class474.field6845 * var40 + class134.field2048 * var38 + var8;
            float var43 = class301.field4568 * var39 + class294.field4472 * var38 + class24.field305 * var40 + var7;
            if (var41 >= (float) this.field7358.field3086) {
                float var44 = (float) var15 * var43 / var41 + (float) this.field7358.field3095;
                if (var11 > var44) {
                    var11 = var44;
                }
                float var45 = (float) var16 * var42 / var41 + (float) this.field7358.field3089;
                if (var44 > var12) {
                    var12 = var44;
                }
                var10 = true;
                if (var13 > var45) {
                    var13 = var45;
                }
                if (var45 > var14) {
                    var14 = var45;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && (float) arg0 < var12 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field7331 > this.field7358.field3168.length) {
                this.field7358.field3168 = new int[this.field7331];
                this.field7358.field3172 = new int[this.field7331];
            }
            int[] var18 = this.field7358.field3168;
            int[] var19 = this.field7358.field3172;
            for (int var20 = 0; var20 < this.field7374; var20++) {
                float var22 = (float) this.field7309[var20];
                float var23 = (float) this.field7352[var20];
                float var24 = (float) this.field7272[var20];
                float var25 = class301.field4568 * var22 + class294.field4472 * var23 + class24.field305 * var24 + var7;
                float var26 = class471.field6810 * var22 + class474.field6845 * var24 + class134.field2048 * var23 + var8;
                float var27 = class17.field222 * var22 + class444.field6522 * var23 + class142.field2174 * var24 + var9;
                if (var27 >= (float) this.field7358.field3086) {
                    int var28 = (int) ((float) var15 * var25 / var27 + (float) this.field7358.field3095);
                    int var29 = (int) ((float) var16 * var26 / var27 + (float) this.field7358.field3089);
                    int var30 = this.field7273[var20];
                    int var31 = this.field7273[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field7306[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var18[var33] = var28;
                        var19[var33] = var29;
                    }
                } else {
                    int var34 = this.field7273[var20];
                    int var35 = this.field7273[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field7306[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[this.field7306[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field7275; var21++) {
                if (var18[this.field7350[var21]] != -999999 && var18[this.field7283[var21]] != -999999 && var18[this.field7318[var21]] != -999999 && this.method2992(arg0, var19[this.field7318[var21]], var18[this.field7350[var21]], var18[this.field7318[var21]], var19[this.field7283[var21]], var18[this.field7283[var21]], var19[this.field7350[var21]], arg1, (byte) -90)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "(I[IIIIZI[I)V", line = 3004)
    public final void method448(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field7289++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class473.field6829 = 0;
            int var13 = 0;
            class523.field7655 = 0;
            class101.field1453 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field7291.length) {
                    int[] var16 = this.field7291[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field7308 == null || (this.field7308[var18] & arg6) != 0) {
                            class101.field1453 += this.field7352[var18];
                            class473.field6829 += this.field7272[var18];
                            var13++;
                            class523.field7655 += this.field7309[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class101.field1453 = var10;
                class473.field6829 = var11;
                class523.field7655 = var12;
            } else {
                class473.field6829 = class473.field6829 / var13 + var11;
                class106.field1492 = true;
                class101.field1453 = class101.field1453 / var13 + var10;
                class523.field7655 = class523.field7655 / var13 + var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + (arg7[0] * arg2 + (arg7[1] * arg3)) + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[6] * arg2 + arg7[7] * arg3 + (arg7[8] * arg4) + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field7291.length > var26) {
                    int[] var27 = this.field7291[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field7308 == null || (this.field7308[var29] & arg6) != 0) {
                            this.field7352[var29] += var24;
                            this.field7272[var29] += var23;
                            this.field7309[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field7291.length) {
                        int[] var50 = this.field7291[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field7308 == null || (this.field7308[var52] & arg6) != 0) {
                                this.field7352[var52] -= class101.field1453;
                                this.field7272[var52] -= class473.field6829;
                                this.field7309[var52] -= class523.field7655;
                                if (arg4 != 0) {
                                    int var53 = class281.field4278[arg4];
                                    int var54 = class281.field4279[arg4];
                                    int var55 = this.field7352[var52] * var54 + this.field7272[var52] * var53 + 32767 >> 15;
                                    this.field7272[var52] = this.field7272[var52] * var54 + 32767 - this.field7352[var52] * var53 >> 15;
                                    this.field7352[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class281.field4278[arg2];
                                    int var57 = class281.field4279[arg2];
                                    int var58 = this.field7272[var52] * var57 + 32767 - this.field7309[var52] * var56 >> 15;
                                    this.field7309[var52] = this.field7272[var52] * var56 + (this.field7309[var52] * var57) + 32767 >> 15;
                                    this.field7272[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class281.field4278[arg3];
                                    int var60 = class281.field4279[arg3];
                                    int var61 = this.field7309[var52] * var59 + (this.field7352[var52] * var60) + 32767 >> 15;
                                    this.field7309[var52] = this.field7309[var52] * var60 + 32767 - (this.field7352[var52] * var59) >> 15;
                                    this.field7352[var52] = var61;
                                }
                                this.field7352[var52] += class101.field1453;
                                this.field7272[var52] += class473.field6829;
                                this.field7309[var52] += class523.field7655;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field7291.length > var32) {
                            int[] var33 = this.field7291[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field7308 == null || (this.field7308[var35] & arg6) != 0) {
                                    int var36 = this.field7273[var35];
                                    int var37 = this.field7273[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field7306[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class281.field4278[arg4];
                                            int var41 = class281.field4279[arg4];
                                            int var42 = this.field7351[var39] * var41 + this.field7367[var39] * var40 + 32767 >> 15;
                                            this.field7367[var39] = (short) (this.field7367[var39] * var41 + 32767 - (this.field7351[var39] * var40) >> 15);
                                            this.field7351[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class281.field4278[arg2];
                                            int var44 = class281.field4279[arg2];
                                            int var45 = this.field7367[var39] * var44 + 32767 - (this.field7337[var39] * var43) >> 15;
                                            this.field7337[var39] = (short) (this.field7367[var39] * var43 + this.field7337[var39] * var44 + 32767 >> 15);
                                            this.field7367[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class281.field4278[arg3];
                                            int var47 = class281.field4279[arg3];
                                            int var48 = this.field7337[var39] * var46 + (this.field7351[var39] * var47) + 32767 >> 15;
                                            this.field7337[var39] = (short) (this.field7337[var39] * var47 + 32767 - (this.field7351[var39] * var46) >> 15);
                                            this.field7351[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field7371 == null && this.field7369 != null) {
                        this.field7369.field6921 = null;
                    }
                    if (this.field7371 != null) {
                        this.field7371.field6921 = null;
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
                if (class106.field1492) {
                    int var68 = arg7[0] * class101.field1453 + arg7[6] * class523.field7655 + arg7[3] * class473.field6829 + 16384 >> 15;
                    int var69 = arg7[1] * class101.field1453 + arg7[7] * class523.field7655 + (arg7[4] * class473.field6829) + 16384 >> 15;
                    int var70 = arg7[2] * class101.field1453 + arg7[8] * class523.field7655 + arg7[5] * class473.field6829 + 16384 >> 15;
                    int var71 = var66 + var69;
                    int var72 = var65 + var68;
                    int var73 = var67 + var70;
                    class101.field1453 = var72;
                    class473.field6829 = var71;
                    class106.field1492 = false;
                    class523.field7655 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class281.field4279[arg2];
                int var76 = class281.field4278[arg2];
                int var77 = class281.field4279[arg3];
                int var78 = class281.field4278[arg3];
                int var79 = class281.field4279[arg4];
                int var80 = class281.field4278[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[1] = -var77 * var80 + var78 * var81 + 16384 >> 15;
                var74[5] = -var76;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[0] = var77 * var79 + var78 * var82 + 16384 >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[6] = -var78 * var79 + var77 * var82 + 16384 >> 15;
                var74[7] = var78 * var80 + (var77 * var81) + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                int var83 = var74[2] * -class523.field7655 + var74[1] * -class473.field6829 + (var74[0] * -class101.field1453 - -16384) >> 15;
                int var84 = var74[4] * -class473.field6829 + var74[3] * -class101.field1453 + var74[5] * -class523.field7655 + 16384 >> 15;
                int var85 = var74[6] * -class101.field1453 + var74[7] * -class473.field6829 + var74[8] * -class523.field7655 + 16384 >> 15;
                int var86 = class101.field1453 + var83;
                int var87 = class473.field6829 + var84;
                int var88 = class523.field7655 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += arg7[var119 * 3 + var121] * var74[var90 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 16384 >> 15;
                    }
                }
                int var91 = var74[2] * var67 + var74[0] * var65 + (var74[1] * var66) + 16384 >> 15;
                int var92 = var74[4] * var66 + var74[3] * var65 + var74[5] * var67 + 16384 >> 15;
                int var93 = var87 + var92;
                int var94 = var86 + var91;
                int var95 = var74[8] * var67 + var74[6] * var65 + var74[7] * var66 + 16384 >> 15;
                int var96 = var88 + var95;
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
                int var99 = arg7[2] * var96 + arg7[1] * var93 + arg7[0] * var94 + 16384 >> 15;
                int var100 = arg7[5] * var96 + arg7[4] * var93 + arg7[3] * var94 + 16384 >> 15;
                int var101 = var62 + var99;
                int var102 = var63 + var100;
                int var103 = arg7[8] * var96 + arg7[6] * var94 + arg7[7] * var93 + 16384 >> 15;
                int var104 = var64 + var103;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field7291.length > var106) {
                        int[] var107 = this.field7291[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field7308 == null || (arg6 & this.field7308[var109]) != 0) {
                                int var110 = this.field7352[var109] * var97[0] + this.field7272[var109] * var97[1] - (-(this.field7309[var109] * var97[2]) + -16384) >> 15;
                                int var111 = this.field7309[var109] * var97[5] + this.field7352[var109] * var97[3] + this.field7272[var109] * var97[4] + 16384 >> 15;
                                int var112 = var102 + var111;
                                int var113 = var101 + var110;
                                int var114 = this.field7352[var109] * var97[6] + 16384 - (-(this.field7309[var109] * var97[8]) + -(this.field7272[var109] * var97[7])) >> 15;
                                int var115 = var104 + var114;
                                this.field7352[var109] = var113;
                                this.field7272[var109] = var112;
                                this.field7309[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field7291.length) {
                        int[] var174 = this.field7291[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field7308 == null || (arg6 & this.field7308[var176]) != 0) {
                                this.field7352[var176] -= class101.field1453;
                                this.field7272[var176] -= class473.field6829;
                                this.field7309[var176] -= class523.field7655;
                                this.field7352[var176] = this.field7352[var176] * arg2 >> 7;
                                this.field7272[var176] = this.field7272[var176] * arg3 >> 7;
                                this.field7309[var176] = this.field7309[var176] * arg4 >> 7;
                                this.field7352[var176] += class101.field1453;
                                this.field7272[var176] += class473.field6829;
                                this.field7309[var176] += class523.field7655;
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
                if (class106.field1492) {
                    int var128 = arg7[3] * class473.field6829 + arg7[0] * class101.field1453 + arg7[6] * class523.field7655 + 16384 >> 15;
                    int var129 = arg7[1] * class101.field1453 + (arg7[4] * class473.field6829) + arg7[7] * class523.field7655 + 16384 >> 15;
                    int var130 = var125 + var128;
                    int var131 = var126 + var129;
                    int var132 = arg7[2] * class101.field1453 + arg7[8] * class523.field7655 + arg7[5] * class473.field6829 + 16384 >> 15;
                    class473.field6829 = var131;
                    class101.field1453 = var130;
                    int var133 = var127 + var132;
                    class523.field7655 = var133;
                    class106.field1492 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class101.field1453 * var134 + 16384 >> 15;
                int var138 = -class473.field6829 * var135 + 16384 >> 15;
                int var139 = -class523.field7655 * var136 + 16384 >> 15;
                int var140 = var137 + class101.field1453;
                int var141 = class473.field6829 + var138;
                int var142 = class523.field7655 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
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
                int var152 = arg7[0] * var147 + arg7[2] * var149 + (arg7[1] * var148) + 16384 >> 15;
                int var153 = arg7[4] * var148 + arg7[3] * var147 + arg7[5] * var149 + 16384 >> 15;
                int var154 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var155 = var123 + var153;
                int var156 = var122 + var152;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field7291.length) {
                        int[] var160 = this.field7291[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field7308 == null || (arg6 & this.field7308[var162]) != 0) {
                                int var163 = this.field7309[var162] * var150[2] + this.field7352[var162] * var150[0] + this.field7272[var162] * var150[1] + 16384 >> 15;
                                int var164 = this.field7352[var162] * var150[3] + this.field7272[var162] * var150[4] + (this.field7309[var162] * var150[5]) + 16384 >> 15;
                                int var165 = var156 + var163;
                                int var166 = var155 + var164;
                                int var167 = this.field7352[var162] * var150[6] + (this.field7272[var162] * var150[7]) + (this.field7309[var162] * var150[8]) + 16384 >> 15;
                                this.field7352[var162] = var165;
                                int var168 = var157 + var167;
                                this.field7272[var162] = var166;
                                this.field7309[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field7297 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field7297.length) {
                        int[] var182 = this.field7297[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field7346 == null || (arg6 & this.field7346[var184]) != 0) {
                                int var185 = (this.field7277[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field7277[var184] = (byte) var185;
                                if (this.field7369 != null) {
                                    this.field7369.field6921 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field7373 != null) {
                    for (int var178 = 0; var178 < this.field7285; var178++) {
                        class356 var179 = this.field7373[var178];
                        class432 var180 = this.field7276[var178];
                        var180.field6401 = 255 - (this.field7277[var179.field5264] & 0xFF) << 24 | var180.field6401 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field7297 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field7297.length) {
                        int[] var191 = this.field7297[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field7346 == null || (arg6 & this.field7346[var193]) != 0) {
                                int var194 = this.field7330[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFC90) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field7330[var193] = (short) class264.method1763(class264.method1763(var198 << 10, var199 << 7), var200);
                                if (this.field7369 != null) {
                                    this.field7369.field6921 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field7373 != null) {
                    for (int var187 = 0; var187 < this.field7285; var187++) {
                        class356 var188 = this.field7373[var187];
                        class432 var189 = this.field7276[var187];
                        var189.field6401 = class312.field4694[this.field7330[var188.field5264] & 0xFFFF] & 0xFFFFFF | var189.field6401 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field7287 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field7287.length) {
                        int[] var203 = this.field7287[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class432 var205 = this.field7276[var203[var204]];
                            var205.field6394 += arg2;
                            var205.field6396 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field7287 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field7287.length) {
                        int[] var208 = this.field7287[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class432 var210 = this.field7276[var208[var209]];
                            var210.field6398 = var210.field6398 * arg2 >> 7;
                            var210.field6395 = var210.field6395 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field7287 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field7287.length > var212) {
                    int[] var213 = this.field7287[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class432 var215 = this.field7276[var213[var214]];
                        var215.field6399 = var215.field6399 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lkd;)V", line = 5680)
    public class504(class188 arg0) {
        this.field7358 = arg0;
        this.field7341 = new class481(null, 5126, 3, 0);
        this.field7334 = new class481(null, 5126, 2, 0);
        this.field7371 = new class481(null, 5126, 3, 0);
        this.field7369 = new class481(null, 5121, 4, 0);
        this.field7304 = new class328();
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lkd;Ltp;IIII)V", line = 5692)
    public class504(class188 arg0, class374 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7266 = arg2;
        this.field7358 = arg0;
        this.field7368 = arg5;
        if (class334.method2112(16534, arg2, arg5)) {
            this.field7341 = new class481(null, 5126, 3, 0);
        }
        if (class405.method2528(arg2, false, arg5)) {
            this.field7334 = new class481(null, 5126, 2, 0);
        }
        if (class215.method1489(arg5, -1, arg2)) {
            this.field7371 = new class481(null, 5126, 3, 0);
        }
        if (class362.method2273(22464, arg5, arg2)) {
            this.field7369 = new class481(null, 5121, 4, 0);
        }
        if (class281.method1831(arg2, arg5, 18794)) {
            this.field7304 = new class328();
        }
        class279 var7 = arg0.field524;
        this.field7273 = new int[arg1.field5572 + 1];
        int[] var8 = new int[arg1.field5610];
        for (int var9 = 0; var9 < arg1.field5610; var9++) {
            if ((arg1.field5583 == null || arg1.field5583[var9] != 2) && (arg1.field5581 == null || arg1.field5581[var9] == -1 || !var7.method584(true, arg1.field5581[var9] & 0xFFFF).field4256)) {
                var8[this.field7275++] = var9;
                this.field7273[arg1.field5599[var9]]++;
                this.field7273[arg1.field5611[var9]]++;
                this.field7273[arg1.field5569[var9]]++;
            }
        }
        this.field7313 = this.field7275;
        long[] var10 = new long[this.field7275];
        boolean var11 = (this.field7266 & 0x100) != 0;
        label492: for (int var12 = 0; var12 < this.field7275; var12++) {
            int var180 = var8[var12];
            class281 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field5580 != null) {
                for (int var186 = 0; var186 < arg1.field5580.length; var186++) {
                    class290 var187 = arg1.field5580[var186];
                    if (var187.field4368 == var180) {
                        class296 var188 = class350.method2178(0, var187.field4365);
                        if (var188.field4517) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field7313--;
                            continue label492;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field5581 != null) {
                var189 = arg1.field5581[var180];
                if (var189 != -1) {
                    var181 = var7.method584(true, var189 & 0xFFFF);
                    var184 = var181.field4261;
                    var185 = var181.field4258;
                }
            }
            boolean var190 = arg1.field5593 != null && arg1.field5593[var180] != 0 || var181 != null && !var181.field4274;
            if ((var11 || var190) && arg1.field5567 != null) {
                var182 += arg1.field5567[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var189 & 0xFFFF << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
        }
        class452.method2755((byte) -105, var8, var10);
        this.field7309 = arg1.field5575;
        this.field7316 = arg1.field5561;
        this.field7272 = arg1.field5562;
        this.field7352 = arg1.field5609;
        this.field7308 = arg1.field5591;
        this.field7374 = arg1.field5572;
        this.field7348 = arg1.field5592;
        class158[] var13 = new class158[this.field7374];
        this.field7279 = arg1.field5558;
        if (arg1.field5580 != null) {
            this.field7285 = arg1.field5580.length;
            this.field7373 = new class356[this.field7285];
            this.field7276 = new class432[this.field7285];
            for (int var14 = 0; var14 < this.field7285; var14++) {
                class290 var15 = arg1.field5580[var14];
                class296 var16 = class350.method2178(0, var15.field4365);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field7275; var18++) {
                    if (var8[var18] == var15.field4368) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class312.field4694[arg1.field5579[var15.field4368] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field5593 == null ? 0 : arg1.field5593[var15.field4368]) << 24;
                this.field7373[var14] = new class356(var17, arg1.field5599[var15.field4368], arg1.field5611[var15.field4368], arg1.field5569[var15.field4368], var16.field4518, var16.field4521, var16.field4515, var16.field4512, var16.field4511, var16.field4517, var16.field4514, var15.field4364);
                this.field7276[var14] = new class432(var20);
            }
        }
        int var21 = this.field7275 * 3;
        if (arg1.field5582 != null) {
            this.field7346 = new short[this.field7275];
        }
        this.field7353 = new short[this.field7275];
        this.field7337 = new short[var21];
        this.field7351 = new short[var21];
        this.field7326 = new float[var21];
        this.field7330 = new short[this.field7275];
        this.field7349 = (short) arg3;
        this.field7333 = (short) arg4;
        this.field7365 = new byte[var21];
        class490.field7045 = new long[var21];
        this.field7318 = new short[this.field7275];
        this.field7312 = new float[var21];
        this.field7277 = new byte[this.field7275];
        this.field7306 = new short[var21];
        this.field7283 = new short[this.field7275];
        this.field7350 = new short[this.field7275];
        this.field7367 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field5572; var23++) {
            int var179 = this.field7273[var23];
            this.field7273[var23] = var22;
            var22 += var179;
            var13[var23] = new class158();
        }
        this.field7273[arg1.field5572] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field5598 != null) {
            int var28 = arg1.field5568;
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
            var25 = new int[var28];
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field7275; var36++) {
                int var43 = var8[var36];
                if (arg1.field5598[var43] != -1) {
                    int var44 = arg1.field5598[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field5599[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field5611[var43];
                        } else {
                            var46 = arg1.field5569[var43];
                        }
                        int var47 = arg1.field5609[var46];
                        int var48 = arg1.field5562[var46];
                        int var49 = arg1.field5575[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var27 = new float[var28][];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field5573[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field5597[var37];
                        var39 = 64.0F / (float) arg1.field5603[var37];
                        if (var42 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var42 <= 0) {
                            var40 = (float) (-var42) / 1024.0F;
                            var41 = 1.0F;
                        } else {
                            var40 = 1.0F;
                            var41 = (float) var42 / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field5603[var37];
                        var40 = 64.0F / (float) arg1.field5597[var37];
                        var41 = 64.0F / (float) arg1.field5559[var37];
                    } else {
                        var39 = (float) arg1.field5603[var37] / 1024.0F;
                        var40 = (float) arg1.field5597[var37] / 1024.0F;
                        var41 = (float) arg1.field5559[var37] / 1024.0F;
                    }
                    var27[var37] = class34.method233((byte) 36, var39, class74.method644(255, arg1.field5574[var37]), var40, arg1.field5586[var37], arg1.field5589[var37], arg1.field5577[var37], var41);
                }
            }
        }
        class382[] var50 = new class382[arg1.field5610];
        for (int var51 = 0; var51 < arg1.field5610; var51++) {
            short var158 = arg1.field5599[var51];
            short var159 = arg1.field5611[var51];
            short var160 = arg1.field5569[var51];
            int var161 = this.field7352[var159] - this.field7352[var158];
            int var162 = this.field7272[var159] - this.field7272[var158];
            int var163 = this.field7309[var159] - this.field7309[var158];
            int var164 = this.field7352[var160] - this.field7352[var158];
            int var165 = this.field7272[var160] - this.field7272[var158];
            int var166 = this.field7309[var160] - this.field7309[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var167 >>= 0x1;
                var169 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field5583 == null ? 0 : arg1.field5583[var51];
            if (var174 == 0) {
                class158 var175 = var13[var158];
                var175.field2387 += var173;
                var175.field2384 += var172;
                var175.field2383++;
                var175.field2386 += var171;
                class158 var176 = var13[var159];
                var176.field2387 += var173;
                var176.field2383++;
                var176.field2384 += var172;
                var176.field2386 += var171;
                class158 var177 = var13[var160];
                var177.field2386 += var171;
                var177.field2387 += var173;
                var177.field2383++;
                var177.field2384 += var172;
            } else if (var174 == 1) {
                class382 var178 = var50[var51] = new class382();
                var178.field5745 = var171;
                var178.field5749 = var173;
                var178.field5746 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field7275; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field5579[var68] & 0xFFFF;
            short var70;
            if (arg1.field5581 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field5581[var68];
            }
            int var71;
            if (arg1.field5598 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field5598[var68];
            }
            int var72;
            if (arg1.field5593 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field5593[var68] & 0xFF;
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
                    var73 = 0.0F;
                    var78 = 0.0F;
                    var75 = 1.0F;
                    var79 = 1;
                    var76 = 1.0F;
                    var74 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field5573[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field5599[var68];
                        short var112 = arg1.field5611[var68];
                        short var113 = arg1.field5569[var68];
                        short var114 = arg1.field5589[var71];
                        short var115 = arg1.field5586[var71];
                        short var116 = arg1.field5577[var71];
                        float var117 = (float) arg1.field5609[var114];
                        float var118 = (float) arg1.field5562[var114];
                        float var119 = (float) arg1.field5575[var114];
                        float var120 = (float) arg1.field5609[var115] - var117;
                        float var121 = (float) arg1.field5562[var115] - var118;
                        float var122 = (float) arg1.field5575[var115] - var119;
                        float var123 = (float) arg1.field5609[var116] - var117;
                        float var124 = (float) arg1.field5562[var116] - var118;
                        float var125 = (float) arg1.field5575[var116] - var119;
                        float var126 = (float) arg1.field5609[var111] - var117;
                        float var127 = (float) arg1.field5562[var111] - var118;
                        float var128 = (float) arg1.field5575[var111] - var119;
                        float var129 = (float) arg1.field5609[var112] - var117;
                        float var130 = (float) arg1.field5562[var112] - var118;
                        float var131 = (float) arg1.field5575[var112] - var119;
                        float var132 = (float) arg1.field5609[var113] - var117;
                        float var133 = (float) arg1.field5562[var113] - var118;
                        float var134 = (float) arg1.field5575[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - (var121 * var123);
                        float var138 = var124 * var137 - (var125 * var136);
                        float var139 = var125 * var135 - var123 * var137;
                        float var140 = var123 * var136 - var124 * var135;
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        float var142 = var122 * var135 - (var120 * var137);
                        float var143 = var120 * var136 - var121 * var135;
                        float var144 = var121 * var137 - (var122 * var136);
                        float var145 = 1.0F / (var125 * var143 + var123 * var144 + var124 * var142);
                        var78 = (var134 * var143 + var132 * var144 + var133 * var142) * var145;
                        var76 = (var131 * var143 + var129 * var144 + var130 * var142) * var145;
                        var74 = (var128 * var143 + var126 * var144 + var127 * var142) * var145;
                    } else {
                        short var83 = arg1.field5599[var68];
                        short var84 = arg1.field5611[var68];
                        short var85 = arg1.field5569[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field5571[var71];
                        float var91 = (float) arg1.field5604[var71] / 256.0F;
                        if (var82 == 1) {
                            float var109 = (float) arg1.field5559[var71] / 1024.0F;
                            class85.method710(var91, var89, var90, arg1.field5562[var83], var88, var86, arg1.field5575[var83], false, var87, var109, arg1.field5609[var83]);
                            var74 = class220.field3615;
                            var73 = class379.field5729;
                            class85.method710(var91, var89, var90, arg1.field5562[var84], var88, var86, arg1.field5575[var84], false, var87, var109, arg1.field5609[var84]);
                            var76 = class220.field3615;
                            var75 = class379.field5729;
                            class85.method710(var91, var89, var90, arg1.field5562[var85], var88, var86, arg1.field5575[var85], false, var87, var109, arg1.field5609[var85]);
                            var78 = class220.field3615;
                            var77 = class379.field5729;
                            float var110 = var109 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var77 - var73 > var110) {
                                    var77 -= var109;
                                    var80 = 1;
                                } else if (var73 - var77 > var110) {
                                    var77 += var109;
                                    var80 = 2;
                                }
                                if (var110 < var75 - var73) {
                                    var75 -= var109;
                                    var79 = 1;
                                } else if (var110 < var73 - var75) {
                                    var79 = 2;
                                    var75 += var109;
                                }
                            } else {
                                if ((var110 < var78 - var74)) {
                                    var80 = 1;
                                    var78 -= var109;
                                } else if (var74 - var78 > var110) {
                                    var78 += var109;
                                    var80 = 2;
                                }
                                if (var110 < var76 - var74) {
                                    var76 -= var109;
                                    var79 = 1;
                                } else if (var110 < var74 - var76) {
                                    var76 += var109;
                                    var79 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var92 = (float) arg1.field5566[var71] / 256.0F;
                            float var93 = (float) arg1.field5578[var71] / 256.0F;
                            int var94 = arg1.field5609[var84] - arg1.field5609[var83];
                            int var95 = arg1.field5562[var84] - arg1.field5562[var83];
                            int var96 = arg1.field5575[var84] - arg1.field5575[var83];
                            int var97 = arg1.field5609[var85] - arg1.field5609[var83];
                            int var98 = arg1.field5562[var85] - arg1.field5562[var83];
                            int var99 = arg1.field5575[var85] - arg1.field5575[var83];
                            int var100 = var95 * var99 - (var96 * var98);
                            int var101 = var96 * var97 - (var94 * var99);
                            int var102 = var94 * var98 - (var95 * var97);
                            float var103 = 64.0F / (float) arg1.field5597[var71];
                            float var104 = 64.0F / (float) arg1.field5603[var71];
                            float var105 = 64.0F / (float) arg1.field5559[var71];
                            float var106 = (var89[2] * (float) var102 + var89[1] * (float) var101 + var89[0] * (float) var100) / var103;
                            float var107 = (var89[5] * (float) var102 + var89[3] * (float) var100 + var89[4] * (float) var101) / var104;
                            float var108 = (var89[8] * (float) var102 + var89[7] * (float) var101 + var89[6] * (float) var100) / var105;
                            var81 = class223.method1596(var107, var108, var106, false);
                            class169.method1132(var89, var81, 12586, arg1.field5609[var83], arg1.field5575[var83], var88, var90, var91, var93, var87, var86, arg1.field5562[var83], var92);
                            var73 = class207.field3397;
                            var74 = class36.field415;
                            class169.method1132(var89, var81, 12586, arg1.field5609[var84], arg1.field5575[var84], var88, var90, var91, var93, var87, var86, arg1.field5562[var84], var92);
                            var76 = class36.field415;
                            var75 = class207.field3397;
                            class169.method1132(var89, var81, 12586, arg1.field5609[var85], arg1.field5575[var85], var88, var90, var91, var93, var87, var86, arg1.field5562[var85], var92);
                            var78 = class36.field415;
                            var77 = class207.field3397;
                        } else if (var82 == 3) {
                            class307.method1971(arg1.field5575[var83], var86, var87, false, arg1.field5609[var83], var90, arg1.field5562[var83], var89, var91, var88);
                            var73 = class348.field5153;
                            var74 = class289.field4360;
                            class307.method1971(arg1.field5575[var84], var86, var87, false, arg1.field5609[var84], var90, arg1.field5562[var84], var89, var91, var88);
                            var75 = class348.field5153;
                            var76 = class289.field4360;
                            class307.method1971(arg1.field5575[var85], var86, var87, false, arg1.field5609[var85], var90, arg1.field5562[var85], var89, var91, var88);
                            var77 = class348.field5153;
                            var78 = class289.field4360;
                            if ((var90 & 0x1) == 0) {
                                if (var77 - var73 > 0.5F) {
                                    var80 = 1;
                                    var77--;
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
                                if ((var76 - var74 > 0.5F)) {
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
                                    var78++;
                                    var80 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field5583 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field5583[var68];
            }
            if (var146 == 0) {
                long var147 = (long) (var71 << 2) + ((long) (var69 << 8) + (long) (var81 << 24) + ((long) var72) << 32);
                short var149 = arg1.field5599[var68];
                short var150 = arg1.field5611[var68];
                short var151 = arg1.field5569[var68];
                class158 var152 = var13[var149];
                this.field7350[var52] = this.method2993(var149, var152.field2383, arg1, var74, var147, var152.field2384, var152.field2387, (byte) 97, var152.field2386, var73);
                class158 var153 = var13[var150];
                this.field7283[var52] = this.method2993(var150, var153.field2383, arg1, var76, (long) var79 + var147, var153.field2384, var153.field2387, (byte) 52, var153.field2386, var75);
                class158 var154 = var13[var151];
                this.field7318[var52] = this.method2993(var151, var154.field2383, arg1, var78, (long) var80 + var147, var154.field2384, var154.field2387, (byte) 37, var154.field2386, var77);
            } else if (var146 == 1) {
                class382 var155 = var50[var68];
                long var156 = ((long) (var81 << 24) + ((long) var72) + (long) (var69 << 8) << 32) + (long) ((var155.field5745 + 256 << 12) + (var155.field5749 <= 0 ? 2048 : 1024) + (var71 << 2) + (var155.field5746 + 256 << 22));
                this.field7350[var52] = this.method2993(arg1.field5599[var68], 0, arg1, var74, var156, var155.field5746, var155.field5749, (byte) 38, var155.field5745, var73);
                this.field7283[var52] = this.method2993(arg1.field5611[var68], 0, arg1, var76, (long) var79 + var156, var155.field5746, var155.field5749, (byte) 67, var155.field5745, var75);
                this.field7318[var52] = this.method2993(arg1.field5569[var68], 0, arg1, var78, (long) var80 + var156, var155.field5746, var155.field5749, (byte) 39, var155.field5745, var77);
            }
            if (arg1.field5581 == null) {
                this.field7353[var52] = -1;
            } else {
                this.field7353[var52] = arg1.field5581[var68];
            }
            if (arg1.field5593 != null) {
                this.field7277[var52] = arg1.field5593[var68];
            }
            if (arg1.field5582 != null) {
                this.field7346[var52] = arg1.field5582[var68];
            }
            this.field7330[var52] = arg1.field5579[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field7313; var55++) {
            short var67 = this.field7353[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field7315 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field7313; var58++) {
            short var66 = this.field7353[var58];
            if (var57 != var66) {
                this.field7315[var56++] = var58;
                var57 = var66;
            }
        }
        this.field7315[var56] = this.field7313;
        class490.field7045 = null;
        this.field7351 = class501.method2979(this.field7331, this.field7351, (byte) 69);
        this.field7367 = class501.method2979(this.field7331, this.field7367, (byte) 119);
        this.field7337 = class501.method2979(this.field7331, this.field7337, (byte) -36);
        this.field7365 = class2.method6(this.field7331, this.field7365, -114);
        this.field7326 = class534.method3166(-62, this.field7331, this.field7326);
        this.field7312 = class534.method3166(-91, this.field7331, this.field7312);
        if (arg1.field5563 != null && class270.method1784(arg2, this.field7368, (byte) 30)) {
            this.field7291 = arg1.method2343((byte) 125);
        }
        if (arg1.field5580 != null && class196.method1369((byte) -106, arg2, this.field7368)) {
            this.field7287 = arg1.method2345(0);
        }
        if (arg1.field5607 != null && class86.method720(arg2, this.field7368, -125)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field7275; var61++) {
                int var65 = arg1.field5607[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field7297 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field7297[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field7275; var63++) {
                int var64 = arg1.field5607[var8[var63]];
                if (var64 >= 0) {
                    this.field7297[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "WA", descriptor = "()I", line = 3985)
    public final int method432() {
        if (!this.field7363) {
            this.method3002(-83);
        }
        field7328++;
        return this.field7340;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZB)V", line = 3997)
    private final void method3001(boolean arg0, byte arg1) {
        field7339++;
        boolean var3 = this.field7369 != null && this.field7369.field6921 == null;
        boolean var4 = this.field7371 != null && this.field7371.field6921 == null;
        boolean var5 = this.field7341 != null && this.field7341.field6921 == null;
        boolean var6 = this.field7334 != null && this.field7334.field6921 == null;
        if (arg0) {
            var3 &= (this.field7265 & 0x2) != 0;
            var5 &= (this.field7265 & 0x1) != 0;
            var4 &= (this.field7265 & 0x4) != 0;
            var6 &= (this.field7265 & 0x8) != 0;
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
        if (arg1 > -34) {
            this.method440(87, 97, null, false);
        }
        if (this.field7331 * var7 <= this.field7358.field3055.field3572.length) {
            this.field7358.field3055.field3556 = 0;
        } else {
            this.field7358.field3055 = new class23((this.field7331 + 100) * var7);
        }
        class23 var12 = this.field7358.field3055;
        if (var5) {
            if (this.field7358.field3141) {
                for (int var13 = 0; var13 < this.field7374; var13++) {
                    int var14 = NativeStream.floatToRawIntBits((float) this.field7352[var13]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field7272[var13]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field7309[var13]);
                    int var17 = this.field7273[var13];
                    int var18 = this.field7273[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field7306[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field3556 = var7 * var20;
                        var12.method1566(true, var14);
                        var12.method1566(true, var15);
                        var12.method1566(true, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field7374; var21++) {
                    int var22 = NativeStream.floatToRawIntBits((float) this.field7352[var21]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field7272[var21]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field7309[var21]);
                    int var25 = this.field7273[var21];
                    int var26 = this.field7273[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field7306[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field3556 = var7 * var28;
                        var12.method1558(false, var22);
                        var12.method1558(false, var23);
                        var12.method1558(false, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field7371 == null) {
                byte[] var29;
                short[] var30;
                short[] var31;
                short[] var32;
                if (this.field7327 == null) {
                    var29 = this.field7365;
                    var30 = this.field7367;
                    var32 = this.field7351;
                    var31 = this.field7337;
                } else {
                    var29 = this.field7327.field852;
                    var30 = this.field7327.field851;
                    var31 = this.field7327.field858;
                    var32 = this.field7327.field856;
                }
                float var33 = this.field7358.field3147[0];
                float var34 = this.field7358.field3147[1];
                float var35 = this.field7358.field3147[2];
                float var36 = this.field7358.field3134;
                float var37 = this.field7358.field3121 * 768.0F / (float) this.field7333;
                float var38 = this.field7358.field3062 * 768.0F / (float) this.field7333;
                for (int var39 = 0; var39 < this.field7275; var39++) {
                    int var40 = this.method2995(this.field7349, this.field7353[var39], true, this.field7330[var39], this.field7277[var39]);
                    short var41 = this.field7350[var39];
                    float var42 = (float) (var40 >> 16 & 0xFF) * this.field7358.field3136;
                    float var43 = (float) ((var40 & 0xFF48) >> 8) * this.field7358.field3155;
                    float var44 = (float) (var40 >>> 24) * this.field7358.field3130;
                    short var45 = (short) var29[var41];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var41] * var35 + (float) var30[var41] * var34 + (float) var32[var41] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var41] * var35 + (float) var30[var41] * var34 + (float) var32[var41] * var33) / (float) (var45 * 256);
                    }
                    float var47 = var36 + (var46 < 0.0F ? var38 : var37) * var46;
                    int var48 = (int) (var44 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var42 * var47);
                    int var50 = (int) (var43 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    var12.field3556 = var9 + (var7 * var41);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method1545(var48, -112);
                    var12.method1545(var49, -66);
                    var12.method1545(var50, -80);
                    var12.method1545(255 - (this.field7277[var39] & 0xFF), -119);
                    short var51 = this.field7283[var39];
                    short var52 = (short) var29[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var30[var51] * var34 + (float) var32[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var30[var51] * var34 + (float) var32[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = (var53 < 0.0F ? var38 : var37) * var53 + var36;
                    int var55 = (int) (var44 * var54);
                    int var56 = (int) (var42 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var57 = (int) (var43 * var54);
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
                    var12.field3556 = var7 * var51 + var9;
                    var12.method1545(var55, -122);
                    var12.method1545(var56, -48);
                    var12.method1545(var57, -97);
                    var12.method1545(255 - (this.field7277[var39] & 0xFF), -68);
                    short var58 = this.field7318[var39];
                    short var59 = (short) var29[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var30[var58] * var34 + (float) var32[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var30[var58] * var34 + (float) var32[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var36 + ((var60 < 0.0F) ? var38 : var37) * var60;
                    int var62 = (int) (var44 * var61);
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
                    var12.field3556 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method1545(var62, -54);
                    var12.method1545(var63, -125);
                    var12.method1545(var64, -44);
                    var12.method1545(255 - (this.field7277[var39] & 0xFF), -106);
                }
            } else {
                for (int var65 = 0; var65 < this.field7275; var65++) {
                    int var66 = this.method2995(this.field7349, this.field7353[var65], true, this.field7330[var65], this.field7277[var65]);
                    var12.field3556 = var9 + (this.field7350[var65] * var7);
                    var12.method1566(true, var66);
                    var12.field3556 = this.field7283[var65] * var7 + var9;
                    var12.method1566(true, var66);
                    var12.field3556 = this.field7318[var65] * var7 + var9;
                    var12.method1566(true, var66);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            byte[] var69;
            short[] var70;
            if (this.field7327 == null) {
                var70 = this.field7367;
                var68 = this.field7351;
                var69 = this.field7365;
                var67 = this.field7337;
            } else {
                var67 = this.field7327.field858;
                var68 = this.field7327.field856;
                var69 = this.field7327.field852;
                var70 = this.field7327.field851;
            }
            float var71 = 3.0F / (float) this.field7333;
            float var72 = 3.0F / (float) (this.field7333 + (this.field7333 / 2));
            var12.field3556 = var10;
            if (this.field7358.field3141) {
                for (int var73 = 0; var73 < this.field7331; var73++) {
                    int var74 = var69[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method173((float) var68[var73] * var72, 101127152);
                        var12.method173((float) var70[var73] * var72, 101127152);
                        var12.method173((float) var67[var73] * var72, 101127152);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method173((float) var68[var73] * var75, 101127152);
                        var12.method173((float) var70[var73] * var75, 101127152);
                        var12.method173((float) var67[var73] * var75, 101127152);
                    }
                    var12.field3556 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field7331; var76++) {
                    int var77 = var69[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method171((float) var68[var76] * var72, (byte) 51);
                        var12.method171((float) var70[var76] * var72, (byte) 51);
                        var12.method171((float) var67[var76] * var72, (byte) 51);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method171((float) var68[var76] * var78, (byte) 51);
                        var12.method171((float) var70[var76] * var78, (byte) 51);
                        var12.method171((float) var67[var76] * var78, (byte) 51);
                    }
                    var12.field3556 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field3556 = var11;
            if (this.field7358.field3141) {
                for (int var79 = 0; var79 < this.field7331; var79++) {
                    var12.method173(this.field7326[var79], 101127152);
                    var12.method173(this.field7312[var79], 101127152);
                    var12.field3556 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field7331; var80++) {
                    var12.method171(this.field7326[var80], (byte) 51);
                    var12.method171(this.field7312[var80], (byte) 51);
                    var12.field3556 += var7 - 8;
                }
            }
        }
        var12.field3556 = this.field7331 * var7;
        class253 var81;
        if (arg0) {
            if (this.field7332 == null) {
                this.field7332 = this.field7358.method1320(var7, true, 121, var12.field3572, var12.field3556);
            } else {
                this.field7332.method781(var12.field3572, var12.field3556, var7, false);
            }
            this.field7265 = 0;
            var81 = this.field7332;
        } else {
            var81 = this.field7358.method1320(var7, false, 29, var12.field3572, var12.field3556);
            this.field7323 = true;
        }
        if (var5) {
            this.field7341.field6921 = var81;
            this.field7341.field6922 = var8;
        }
        if (var6) {
            this.field7334.field6921 = var81;
            this.field7334.field6922 = var11;
        }
        if (var3) {
            this.field7369.field6921 = var81;
            this.field7369.field6922 = var9;
        }
        if (var4) {
            this.field7371.field6922 = var10;
            this.field7371.field6921 = var81;
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "()Z", line = 4520)
    public final boolean method445() {
        field7286++;
        if (this.field7353 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field7353.length; var1++) {
            if (this.field7353[var1] != -1 && !this.field7358.field524.method579(this.field7353[var1], true)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lu", name = "U", descriptor = "()I", line = 4552)
    public final int method429() {
        field7322++;
        if (!this.field7363) {
            this.method3002(-81);
        }
        return this.field7310;
    }

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)V", line = 4564)
    private final void method3002(int arg0) {
        field7317++;
        int var2 = 32767;
        int var3 = 32767;
        if (arg0 >= -74) {
            return;
        }
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field7374; var10++) {
            int var11 = this.field7352[var10];
            int var12 = this.field7272[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field7309[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field7301 = (short) var2;
        this.field7271 = (short) var3;
        this.field7370 = (short) var7;
        this.field7357 = (short) var4;
        this.field7343 = (short) var5;
        this.field7340 = (short) var6;
        this.field7310 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field7363 = true;
    }

    @OriginalMember(owner = "client!lu", name = "PA", descriptor = "()I", line = 4651)
    public final int method416() {
        field7305++;
        if (!this.field7363) {
            this.method3002(-116);
        }
        return this.field7357;
    }

    @OriginalMember(owner = "client!lu", name = "Z", descriptor = "(I)V", line = 4667)
    public final void method441(int arg0) {
        field7294++;
        int var2 = class281.field4278[arg0];
        int var3 = class281.field4279[arg0];
        for (int var4 = 0; var4 < this.field7374; var4++) {
            int var5 = this.field7272[var4] * var3 - this.field7309[var4] * var2 >> 15;
            this.field7309[var4] = this.field7309[var4] * var3 + this.field7272[var4] * var2 >> 15;
            this.field7272[var4] = var5;
        }
        this.field7363 = false;
        if (this.field7341 != null) {
            this.field7341.field6921 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "Q", descriptor = "(I)V", line = 4696)
    public final void method438(int arg0) {
        field7311++;
        int var2 = class281.field4278[arg0];
        int var3 = class281.field4279[arg0];
        for (int var4 = 0; var4 < this.field7374; var4++) {
            int var5 = this.field7352[var4] * var3 + this.field7309[var4] * var2 >> 15;
            this.field7309[var4] = this.field7309[var4] * var3 - (this.field7352[var4] * var2) >> 15;
            this.field7352[var4] = var5;
        }
        if (this.field7341 != null) {
            this.field7341.field6921 = null;
        }
        this.field7363 = false;
    }

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "()Z", line = 4725)
    public final boolean method418() {
        field7303++;
        if (this.field7291 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field7316; var1++) {
            this.field7352[var1] <<= 0x4;
            this.field7272[var1] <<= 0x4;
            this.field7309[var1] <<= 0x4;
        }
        class523.field7655 = 0;
        class101.field1453 = 0;
        class473.field6829 = 0;
        return true;
    }

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "(IILta;Lta;III)V", line = 4753)
    public final void method425(int arg0, int arg1, class145 arg2, class145 arg3, int arg4, int arg5, int arg6) {
        if (!this.field7363) {
            this.method3002(-113);
        }
        field7281++;
        int var8 = arg4 + this.field7301;
        int var9 = arg4 + this.field7343;
        int var10 = this.field7357 + arg6;
        int var11 = arg6 + this.field7370;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field2210 + var9 >> arg2.field2206 >= arg2.field2207 || var10 < 0 || arg2.field2211 <= (var11 + arg2.field2210 >> arg2.field2206)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field2207 <= (arg3.field2210 + var9 >> arg3.field2206) || var10 < 0 || var11 + arg3.field2210 >> arg3.field2206 >= arg3.field2211) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field2206;
            int var13 = var9 - (1 - arg2.field2210) >> arg2.field2206;
            int var14 = var10 >> arg2.field2206;
            int var15 = var11 + arg2.field2210 - 1 >> arg2.field2206;
            if (arg5 == arg2.method411(var12, var14) && arg2.method411(var13, var14) == arg5 && arg5 == arg2.method411(var12, var15) && arg2.method411(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field7374; var32++) {
                this.field7272[var32] = this.field7272[var32] + arg2.method412(this.field7352[var32] + arg4, this.field7309[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field7271;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field7374; var17++) {
                int var18 = (this.field7272[var17] << 16) / var16;
                if (var18 < arg1) {
                    this.field7272[var17] += (arg2.method412(this.field7352[var17] + arg4, this.field7309[var17] + arg6) - arg5) * (arg1 - var18) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = ((arg1 & 0xFF98) >> 8) * 4;
            int var30 = (arg1 >> 16 & 0xFF) << 6;
            int var31 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var28 >> 1) < 0 || (var28 >> 1) + arg4 + arg2.field2210 >= arg2.field2207 << arg2.field2206 || (arg6 - (var29 >> 1)) < 0 || arg2.field2211 << arg2.field2206 <= (var29 >> 1) + arg2.field2210 + arg6) {
                return;
            }
            this.method2855(var30, var28, arg2, arg6, -103, arg5, var31, arg4, var29);
        } else if (arg0 == 4) {
            int var19 = this.field7340 - this.field7271;
            for (int var20 = 0; var20 < this.field7374; var20++) {
                this.field7272[var20] = this.field7272[var20] + var19 + arg3.method412(this.field7352[var20] + arg4, this.field7309[var20] - -arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var21 = this.field7340 - this.field7271;
            for (int var22 = 0; var22 < this.field7374; var22++) {
                int var23 = this.field7352[var22] + arg4;
                int var24 = this.field7309[var22] + arg6;
                int var25 = arg2.method412(var23, var24);
                int var26 = arg3.method412(var23, var24);
                int var27 = var25 - var26;
                this.field7272[var22] = ((this.field7272[var22] << 8) / var21 * var27 >> 8) + var25 - arg5;
            }
        }
        if (this.field7341 != null) {
            this.field7341.field6921 = null;
        }
        this.field7363 = false;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)V", line = 4914)
    private final void method3003(boolean arg0) {
        field7288++;
        if (!this.field7323) {
            return;
        }
        this.field7323 = false;
        if (this.field7348 == null && this.field7279 == null && this.field7373 == null) {
            if (this.field7352 != null && !class337.method2126(2, this.field7266, this.field7368)) {
                if (this.field7341 != null && this.field7341.field6921 == null) {
                    this.field7323 = true;
                } else {
                    if (!this.field7363) {
                        this.method3002(-102);
                    }
                    this.field7352 = null;
                }
            }
            if (this.field7272 != null && !class94.method756(this.field7368, this.field7266, 112)) {
                if (this.field7341 != null && this.field7341.field6921 == null) {
                    this.field7323 = true;
                } else {
                    if (!this.field7363) {
                        this.method3002(-100);
                    }
                    this.field7272 = null;
                }
            }
            if (this.field7309 != null && !class271.method1789(255, this.field7266, this.field7368)) {
                if (this.field7341 != null && this.field7341.field6921 == null) {
                    this.field7323 = true;
                } else {
                    if (!this.field7363) {
                        this.method3002(-105);
                    }
                    this.field7309 = null;
                }
            }
        }
        if (this.field7306 != null && this.field7352 == null && this.field7272 == null && this.field7309 == null) {
            this.field7273 = null;
            this.field7306 = null;
        }
        if (this.field7365 != null && !class456.method2772(81, this.field7368, this.field7266)) {
            if (this.field7371 == null) {
                if (this.field7369 != null && this.field7369.field6921 == null) {
                    this.field7323 = true;
                } else {
                    this.field7351 = this.field7367 = this.field7337 = null;
                    this.field7365 = null;
                }
            } else if (this.field7371.field6921 == null) {
                this.field7323 = true;
            } else {
                this.field7365 = null;
                this.field7351 = this.field7367 = this.field7337 = null;
            }
        }
        if (this.field7330 != null && !class101.method810(this.field7368, this.field7266, 78)) {
            if (this.field7369 != null && this.field7369.field6921 == null) {
                this.field7323 = true;
            } else {
                this.field7330 = null;
            }
        }
        if (this.field7277 != null && !class529.method3133(false, this.field7266, this.field7368)) {
            if (this.field7369 != null && this.field7369.field6921 == null) {
                this.field7323 = true;
            } else {
                this.field7277 = null;
            }
        }
        if (this.field7326 != null && !class304.method1951(10212, this.field7368, this.field7266)) {
            if (this.field7334 != null && this.field7334.field6921 == null) {
                this.field7323 = true;
            } else {
                this.field7326 = this.field7312 = null;
            }
        }
        if (this.field7353 != null && !class114.method868(this.field7266, 125, this.field7368)) {
            if (this.field7369 != null && this.field7369.field6921 == null) {
                this.field7323 = true;
            } else {
                this.field7353 = null;
            }
        }
        if (this.field7350 != null && !class63.method547(this.field7266, 62, this.field7368)) {
            if ((this.field7304 == null || this.field7304.field4936 != null) && (this.field7369 == null || this.field7369.field6921 != null)) {
                this.field7350 = this.field7283 = this.field7318 = null;
            } else {
                this.field7323 = true;
            }
        }
        if (this.field7297 != null && !class86.method720(this.field7266, this.field7368, -123)) {
            this.field7346 = null;
            this.field7297 = null;
        }
        if (this.field7291 != null && !class270.method1784(this.field7266, this.field7368, (byte) 30)) {
            this.field7308 = null;
            this.field7291 = null;
        }
        if (!arg0) {
            return;
        }
        if (this.field7287 != null && !class196.method1369((byte) -106, this.field7266, this.field7368)) {
            this.field7287 = null;
        }
        if (this.field7315 != null && (this.field7266 & 0x800) == 0 && (this.field7266 & 0x40000) == 0) {
            this.field7315 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lt;IIIZ)V", line = 5095)
    public final void method422(class475 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7321++;
        class504 var6 = (class504) arg0;
        if (this.field7275 == 0 || var6.field7275 == 0) {
            return;
        }
        int var7 = var6.field7374;
        int[] var8 = var6.field7352;
        int[] var9 = var6.field7272;
        int[] var10 = var6.field7309;
        short[] var11 = var6.field7351;
        short[] var12 = var6.field7367;
        short[] var13 = var6.field7337;
        byte[] var14 = var6.field7365;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field7327 == null) {
            var17 = null;
            var18 = null;
            var15 = null;
            var16 = null;
        } else {
            var15 = this.field7327.field852;
            var16 = this.field7327.field851;
            var17 = this.field7327.field856;
            var18 = this.field7327.field858;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field7327 == null) {
            var21 = null;
            var22 = null;
            var20 = null;
            var19 = null;
        } else {
            var19 = var6.field7327.field856;
            var20 = var6.field7327.field858;
            var21 = var6.field7327.field852;
            var22 = var6.field7327.field851;
        }
        int[] var23 = var6.field7273;
        short[] var24 = var6.field7306;
        if (!var6.field7363) {
            var6.method3002(-103);
        }
        short var25 = var6.field7271;
        short var26 = var6.field7340;
        short var27 = var6.field7301;
        short var28 = var6.field7343;
        short var29 = var6.field7357;
        short var30 = var6.field7370;
        for (int var31 = 0; var31 < this.field7374; var31++) {
            int var32 = this.field7272[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field7352[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field7309[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field7273[var31];
                        int var37 = this.field7273[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field7306[var38] - 1;
                            if (var35 == -1 || this.field7365[var35] != 0) {
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
                                            this.field7327 = new class66();
                                            var17 = this.field7327.field856 = class128.method941((byte) 75, this.field7351);
                                            var16 = this.field7327.field851 = class128.method941((byte) 75, this.field7367);
                                            var18 = this.field7327.field858 = class128.method941((byte) 77, this.field7337);
                                            var15 = this.field7327.field852 = class393.method2475(this.field7365, (byte) 96);
                                        }
                                        if (var19 == null) {
                                            class66 var44 = var6.field7327 = new class66();
                                            var19 = var44.field856 = class128.method941((byte) 106, var11);
                                            var22 = var44.field851 = class128.method941((byte) 75, var12);
                                            var20 = var44.field858 = class128.method941((byte) 88, var13);
                                            var21 = var44.field852 = class393.method2475(var14, (byte) 75);
                                        }
                                        short var45 = this.field7351[var35];
                                        short var46 = this.field7367[var35];
                                        short var47 = this.field7337[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field7365[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var19[var52] += var45;
                                                var22[var52] += var46;
                                                var20[var52] += var47;
                                                var21[var52] += var49;
                                            }
                                        }
                                        int var53 = this.field7273[var31 + 1];
                                        short var54 = var11[var42];
                                        int var55 = this.field7273[var31];
                                        short var56 = var12[var42];
                                        short var57 = var13[var42];
                                        byte var58 = var14[var42];
                                        for (int var59 = var55; var59 < var53; var59++) {
                                            int var60 = this.field7306[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var54;
                                                var16[var60] += var56;
                                                var18[var60] += var57;
                                                var15[var60] += var58;
                                            }
                                        }
                                        if (this.field7371 == null && this.field7369 != null) {
                                            this.field7369.field6921 = null;
                                        }
                                        if (this.field7371 != null) {
                                            this.field7371.field6921 = null;
                                        }
                                        if (var6.field7371 == null && var6.field7369 != null) {
                                            var6.field7369.field6921 = null;
                                        }
                                        if (var6.field7371 != null) {
                                            var6.field7371.field6921 = null;
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

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 5366)
    public static final String method3004(long arg0, int arg1) {
        field7319++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        }
        int var3 = 24 % ((arg1 + 28) / 37);
        if ((arg0 % 37L) == 0L) {
            return null;
        }
        int var4 = 0;
        for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
            var4++;
        }
        StringBuffer var7 = new StringBuffer(var4);
        while (arg0 != 0L) {
            long var8 = arg0;
            arg0 /= 37L;
            char var10 = class342.field5078[(int) (var8 - (arg0 * 37L))];
            if (var10 == '_') {
                int var11 = var7.length() - 1;
                var10 = ' ';
                var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
            }
            var7.append(var10);
        }
        var7.reverse();
        var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
        return var7.toString();
    }

    @OriginalMember(owner = "client!lu", name = "BA", descriptor = "(SS)V", line = 5416)
    public final void method436(short arg0, short arg1) {
        field7355++;
        for (int var3 = 0; var3 < this.field7275; var3++) {
            if (this.field7330[var3] == arg0) {
                this.field7330[var3] = arg1;
            }
        }
        if (this.field7373 != null) {
            for (int var4 = 0; var4 < this.field7285; var4++) {
                class356 var5 = this.field7373[var4];
                class432 var6 = this.field7276[var4];
                var6.field6401 = class312.field4694[this.field7330[var5.field5264] & 0xFFFF] & 0xFFFFFF | var6.field6401 & 0xFF000000;
            }
        }
        if (this.field7369 != null) {
            this.field7369.field6921 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "JA", descriptor = "(III)V", line = 5461)
    public final void method450(int arg0, int arg1, int arg2) {
        field7359++;
        for (int var4 = 0; var4 < this.field7374; var4++) {
            if (arg0 != 0) {
                this.field7352[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field7272[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field7309[var4] += arg2;
            }
        }
        if (this.field7341 != null) {
            this.field7341.field6921 = null;
        }
        this.field7363 = false;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BZ)V", line = 5503)
    private final void method3005(byte arg0, boolean arg1) {
        if (this.field7313 * 6 > this.field7358.field3055.field3572.length) {
            this.field7358.field3055 = new class23(this.field7313 * 6 + 600);
        } else {
            this.field7358.field3055.field3556 = 0;
        }
        field7356++;
        class23 var3 = this.field7358.field3055;
        if (this.field7358.field3141) {
            for (int var5 = 0; var5 < this.field7313; var5++) {
                var3.method1542(this.field7350[var5], -2756);
                var3.method1542(this.field7283[var5], -2756);
                var3.method1542(this.field7318[var5], -2756);
            }
        } else {
            for (int var4 = 0; var4 < this.field7313; var4++) {
                var3.method1504((byte) 104, this.field7350[var4]);
                var3.method1504((byte) 104, this.field7283[var4]);
                var3.method1504((byte) 104, this.field7318[var4]);
            }
        }
        if (var3.field3556 == 0) {
            return;
        }
        if (arg0 != 98) {
            this.method441(-35);
        }
        if (arg1) {
            if (this.field7268 == null) {
                this.field7268 = this.field7358.method1321(5123, var3.field3572, true, var3.field3556, true);
            } else {
                this.field7268.method153(var3.field3556, 5123, (byte) 63, var3.field3572);
            }
            this.field7304.field4936 = this.field7268;
        } else {
            this.field7304.field4936 = this.field7358.method1321(5123, var3.field3572, false, var3.field3556, true);
        }
        if (!arg1) {
            this.field7323 = true;
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "()[Luj;", line = 5573)
    public final class262[] method431() {
        field7364++;
        return this.field7348;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Laa;B)V", line = 5588)
    private final void method3006(class339 arg0, byte arg1) {
        if (this.field7331 > this.field7358.field3168.length) {
            this.field7358.field3168 = new int[this.field7331];
            this.field7358.field3172 = new int[this.field7331];
        }
        field7372++;
        int[] var3 = this.field7358.field3168;
        int[] var4 = this.field7358.field3172;
        int var5 = 0;
        if (arg1 <= 94) {
            this.field7306 = null;
        }
        while (var5 < this.field7374) {
            int var16 = (this.field7352[var5] - (this.field7272[var5] * this.field7358.field3161 >> 8) >> this.field7358.field3028) - arg0.field5049;
            int var17 = (this.field7309[var5] - (this.field7272[var5] * this.field7358.field3123 >> 8) >> this.field7358.field3028) - arg0.field5045;
            int var18 = this.field7273[var5];
            int var19 = this.field7273[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field7306[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
            var5++;
        }
        for (int var6 = 0; var6 < this.field7313; var6++) {
            if (this.field7277 == null || this.field7277[var6] <= 128) {
                short var7 = this.field7350[var6];
                short var8 = this.field7283[var6];
                short var9 = this.field7318[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var14 - var13) * (var12 - var11)) > 0) {
                    arg0.method2141(var13, var14, var15, var12, true, var11, var10);
                }
            }
        }
    }
}
