import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class435 extends class761 {

    @OriginalMember(owner = "client!cea", name = "D", descriptor = "I")
    private int field6310 = 0;

    @OriginalMember(owner = "client!cea", name = "Ob", descriptor = "I")
    private int field6320 = 0;

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "I")
    private int field6344 = 0;

    @OriginalMember(owner = "client!cea", name = "C", descriptor = "Z")
    private boolean field6299 = false;

    @OriginalMember(owner = "client!cea", name = "Ec", descriptor = "Z")
    private boolean field6314 = true;

    @OriginalMember(owner = "client!cea", name = "ib", descriptor = "I")
    private int field6384 = 0;

    @OriginalMember(owner = "client!cea", name = "Y", descriptor = "Z")
    private boolean field6302 = false;

    @OriginalMember(owner = "client!cea", name = "gc", descriptor = "I")
    private int field6370 = 0;

    @OriginalMember(owner = "client!cea", name = "yb", descriptor = "Z")
    private boolean field6414 = false;

    @OriginalMember(owner = "client!cea", name = "Eb", descriptor = "Lml;")
    private class194 field6368;

    @OriginalMember(owner = "client!cea", name = "fc", descriptor = "Lso;")
    private class316 field6413;

    @OriginalMember(owner = "client!cea", name = "Bb", descriptor = "Lso;")
    private class316 field6324;

    @OriginalMember(owner = "client!cea", name = "jc", descriptor = "Lso;")
    private class316 field6393;

    @OriginalMember(owner = "client!cea", name = "Oc", descriptor = "Lso;")
    private class316 field6392;

    @OriginalMember(owner = "client!cea", name = "Qb", descriptor = "Lbga;")
    private class398 field6372;

    @OriginalMember(owner = "client!cea", name = "oc", descriptor = "I")
    private int field6327;

    @OriginalMember(owner = "client!cea", name = "Ic", descriptor = "I")
    private int field6386;

    @OriginalMember(owner = "client!cea", name = "bc", descriptor = "[I")
    private int[] field6351;

    @OriginalMember(owner = "client!cea", name = "nb", descriptor = "[I")
    private int[] field6375;

    @OriginalMember(owner = "client!cea", name = "Nc", descriptor = "[I")
    private int[] field6339;

    @OriginalMember(owner = "client!cea", name = "B", descriptor = "[S")
    private short[] field6403;

    @OriginalMember(owner = "client!cea", name = "mb", descriptor = "[I")
    private int[] field6321;

    @OriginalMember(owner = "client!cea", name = "gb", descriptor = "[Lkw;")
    private class510[] field6404;

    @OriginalMember(owner = "client!cea", name = "W", descriptor = "[Liia;")
    private class264[] field6383;

    @OriginalMember(owner = "client!cea", name = "kc", descriptor = "I")
    private int field6410;

    @OriginalMember(owner = "client!cea", name = "Z", descriptor = "[Ldh;")
    private class237[] field6407;

    @OriginalMember(owner = "client!cea", name = "Pc", descriptor = "[Luia;")
    private class326[] field6313;

    @OriginalMember(owner = "client!cea", name = "ob", descriptor = "[S")
    private short[] field6294;

    @OriginalMember(owner = "client!cea", name = "Pb", descriptor = "[S")
    private short[] field6309;

    @OriginalMember(owner = "client!cea", name = "xb", descriptor = "[S")
    private short[] field6342;

    @OriginalMember(owner = "client!cea", name = "Sb", descriptor = "[F")
    private float[] field6408;

    @OriginalMember(owner = "client!cea", name = "bb", descriptor = "[B")
    private byte[] field6363;

    @OriginalMember(owner = "client!cea", name = "zc", descriptor = "[S")
    private short[] field6359;

    @OriginalMember(owner = "client!cea", name = "Fc", descriptor = "[B")
    private byte[] field6345;

    @OriginalMember(owner = "client!cea", name = "y", descriptor = "[S")
    private short[] field6361;

    @OriginalMember(owner = "client!cea", name = "Rb", descriptor = "[F")
    private float[] field6401;

    @OriginalMember(owner = "client!cea", name = "vb", descriptor = "S")
    private short field6394;

    @OriginalMember(owner = "client!cea", name = "R", descriptor = "[S")
    private short[] field6306;

    @OriginalMember(owner = "client!cea", name = "Lc", descriptor = "[S")
    private short[] field6330;

    @OriginalMember(owner = "client!cea", name = "lc", descriptor = "[S")
    private short[] field6409;

    @OriginalMember(owner = "client!cea", name = "cb", descriptor = "[S")
    private short[] field6334;

    @OriginalMember(owner = "client!cea", name = "F", descriptor = "S")
    private short field6322;

    @OriginalMember(owner = "client!cea", name = "nc", descriptor = "[S")
    private short[] field6396;

    @OriginalMember(owner = "client!cea", name = "Tb", descriptor = "[I")
    private int[] field6402;

    @OriginalMember(owner = "client!cea", name = "tb", descriptor = "[[I")
    private int[][] field6301;

    @OriginalMember(owner = "client!cea", name = "Kc", descriptor = "[[I")
    private int[][] field6316;

    @OriginalMember(owner = "client!cea", name = "sb", descriptor = "[[I")
    private int[][] field6308;

    @OriginalMember(owner = "client!cea", name = "Qc", descriptor = "[Ljava/lang/String;")
    private static final String[] field6418 = new String[] { method3399(method3398("8Cc|=")), method3399(method3398("-\u0018!>")), method3399(method3398(" \b,|\u0001\u0002E")), method3399(method3398(" \b,|\u0006\u0002E")), method3399(method3398(" \b,|\u0013\u0001E")), method3399(method3398(" \b,|\u0017\u0002E")), method3399(method3398(" \b,|2k")), method3399(method3398(" \b,|\u0006k")), method3399(method3398(" \b,|\u000b\u0001E")), method3399(method3398(" \b,|\u0003\u0002E")), method3399(method3398(" \b,|0k")), method3399(method3398(" \b,|\t\u0002E")), method3399(method3398(" \b,|\u0001k")), method3399(method3398(" \b,|)\"E")), method3399(method3398(" \b,|\f\u0002E")), method3399(method3398(" \b,|5\"E")), method3399(method3398(" \b,|\"\"E")), method3399(method3398(" \b,|\u0007\u0002E")), method3399(method3398(" \b,|\b\u0002E")), method3399(method3398(" \b,|3k")), method3399(method3398(" \b,|\u0010\u0002E")), method3399(method3398(" \b,||*\u0003$&~k")), method3399(method3398(" \b,|+k")), method3399(method3398(" \b,|!k")), method3399(method3398(" \b,|\u0005k")), method3399(method3398(" \b,|\u000ek")), method3399(method3398(" \b,|\u0014k")), method3399(method3398(" \b,|!\"E")), method3399(method3398(" \b,|\u0004\u0002E")), method3399(method3398(" \b,|.\"E")), method3399(method3398(" \b,|\u0010k")), method3399(method3398(" \b,|\tk")), method3399(method3398(" \b,|\u0012\u0002E")), method3399(method3398(" \b,|\u0016\u0002E")), method3399(method3398(" \b,|\u000e\u0001E")), method3399(method3398(" \b,|\u000e\u0002E")), method3399(method3398(" \b,|\u000f\u0002E")), method3399(method3398(" \b,|\nk")), method3399(method3398(" \b,|-\"E")), method3399(method3398(" \b,|\fk")), method3399(method3398(" \b,|\u000bk")), method3399(method3398(" \b,|\b\u0001E")), method3399(method3398(" \b,|\u0011k")), method3399(method3398(" \b,|\u0013k")), method3399(method3398(" \b,|\u0015k")), method3399(method3398(" \b,|\n\u0001E")), method3399(method3398(" \b,|7\"E")), method3399(method3398(" \b,|\u0007k")), method3399(method3398(" \b,|\u0002k")), method3399(method3398(" \b,|\u0016k")), method3399(method3398(" \b,|\u0003k")), method3399(method3398(" \b,|\u0004k")), method3399(method3398(" \b,|\n\u0002E")), method3399(method3398(" \b,|\u0005\u0001E")), method3399(method3398(" \b,|\u0002\u0002E")), method3399(method3398(" \b,|\u0011\u0001E")), method3399(method3398(" \b,|\u000fk")), method3399(method3398(" \b,|&\"E")), method3399(method3398(" \b,|$\"E")), method3399(method3398(" \b,|\u0012k")), method3399(method3398(" \b,|\u0017k")), method3399(method3398(" \b,|\rk")), method3399(method3398(" \b,|6k")), method3399(method3398(" \b,|\u0005\u0002E")), method3399(method3398(" \b,|:\"E")), method3399(method3398(" \b,|\u0012\u0001E")), method3399(method3398(" \b,|\bk")) };

    @OriginalMember(owner = "client!cea", name = "pb", descriptor = "[F")
    public static float[] field6329 = new float[4];

    @OriginalMember(owner = "client!cea", name = "L", descriptor = "[I")
    public static int[] field6336 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!cea", name = "O", descriptor = "B")
    private byte field6380;

    @OriginalMember(owner = "client!cea", name = "Wb", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!cea", name = "N", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!cea", name = "kb", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!cea", name = "Hb", descriptor = "I")
    public static int field6297;

    @OriginalMember(owner = "client!cea", name = "qc", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!cea", name = "rb", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!cea", name = "Fb", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!cea", name = "Jb", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!cea", name = "Hc", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!cea", name = "J", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!cea", name = "ub", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!cea", name = "Ab", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!cea", name = "yc", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!cea", name = "Ib", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!cea", name = "eb", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!cea", name = "ec", descriptor = "I")
    public static int field6331;

    @OriginalMember(owner = "client!cea", name = "wc", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!cea", name = "I", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!cea", name = "Vb", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!cea", name = "ac", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!cea", name = "Ub", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!cea", name = "db", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!cea", name = "V", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!cea", name = "Q", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!cea", name = "Lb", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!cea", name = "ic", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!cea", name = "fb", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!cea", name = "Xb", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!cea", name = "qb", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!cea", name = "rc", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!cea", name = "dc", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!cea", name = "T", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!cea", name = "zb", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!cea", name = "tc", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!cea", name = "Mb", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!cea", name = "H", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!cea", name = "ab", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!cea", name = "pc", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!cea", name = "Gb", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!cea", name = "Kb", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!cea", name = "A", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!cea", name = "lb", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!cea", name = "M", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!cea", name = "Db", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!cea", name = "jb", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!cea", name = "P", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!cea", name = "sc", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!cea", name = "Cc", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!cea", name = "xc", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!cea", name = "mc", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!cea", name = "Yb", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!cea", name = "E", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!cea", name = "G", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!cea", name = "uc", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!cea", name = "x", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!cea", name = "X", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!cea", name = "Cb", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!cea", name = "U", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!cea", name = "hc", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!cea", name = "Bc", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!cea", name = "Zb", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!cea", name = "Nb", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!cea", name = "K", descriptor = "Lbda;")
    private class181 field6333;

    @OriginalMember(owner = "client!cea", name = "S", descriptor = "Lqq;")
    private class241 field6387;

    @OriginalMember(owner = "client!cea", name = "Dc", descriptor = "Laj;")
    private class94 field6318;

    @OriginalMember(owner = "client!cea", name = "Gc", descriptor = "S")
    private short field6304;

    @OriginalMember(owner = "client!cea", name = "Ac", descriptor = "S")
    private short field6305;

    @OriginalMember(owner = "client!cea", name = "wb", descriptor = "S")
    private short field6323;

    @OriginalMember(owner = "client!cea", name = "Mc", descriptor = "S")
    private short field6347;

    @OriginalMember(owner = "client!cea", name = "cc", descriptor = "S")
    private short field6354;

    @OriginalMember(owner = "client!cea", name = "hb", descriptor = "S")
    private short field6365;

    @OriginalMember(owner = "client!cea", name = "vc", descriptor = "S")
    private short field6374;

    @OriginalMember(owner = "client!cea", name = "Jc", descriptor = "S")
    private short field6391;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[IIIIIZ)V", line = 7)
    public final void method383(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        try {
            field6296++;
            int var8 = arg1.length;
            int var109;
            int var110;
            int var111;
            if (arg0 == 0) {
                var110 = arg3 << 4;
                var111 = arg4 << 4;
                var109 = arg2 << 4;
                int var9 = 0;
                class508.field7460 = 0;
                class576.field8325 = 0;
                class74.field1068 = 0;
                for (int var10 = 0; var10 < var8; var10++) {
                    int var11 = arg1[var10];
                    if (var11 < this.field6301.length) {
                        int[] var12 = this.field6301[var11];
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            int var14 = var12[var13];
                            class74.field1068 += this.field6339[var14];
                            class508.field7460 += this.field6375[var14];
                            class576.field8325 += this.field6321[var14];
                            var9++;
                        }
                    }
                }
                if (var9 <= 0) {
                    class508.field7460 = var110;
                    class74.field1068 = var109;
                    class576.field8325 = var111;
                } else {
                    class508.field7460 = class508.field7460 / var9 + var110;
                    class576.field8325 = class576.field8325 / var9 + var111;
                    class74.field1068 = class74.field1068 / var9 + var109;
                }
            } else if (arg0 == 1) {
                var109 = arg2 << 4;
                var111 = arg4 << 4;
                var110 = arg3 << 4;
                for (int var15 = 0; var15 < var8; var15++) {
                    int var16 = arg1[var15];
                    if (this.field6301.length > var16) {
                        int[] var17 = this.field6301[var16];
                        for (int var18 = 0; var18 < var17.length; var18++) {
                            int var19 = var17[var18];
                            this.field6339[var19] += var109;
                            this.field6375[var19] += var110;
                            this.field6321[var19] += var111;
                        }
                    }
                }
            } else if (arg0 == 2) {
                for (int var20 = 0; var20 < var8; var20++) {
                    int var21 = arg1[var20];
                    if (this.field6301.length > var21) {
                        int[] var22 = this.field6301[var21];
                        if ((arg5 & 0x1) == 0) {
                            for (int var34 = 0; var34 < var22.length; var34++) {
                                int var35 = var22[var34];
                                this.field6339[var35] -= class74.field1068;
                                this.field6375[var35] -= class508.field7460;
                                this.field6321[var35] -= class576.field8325;
                                if (arg4 != 0) {
                                    int var36 = class487.field7151[arg4];
                                    int var37 = class487.field7150[arg4];
                                    int var38 = this.field6339[var35] * var37 + (this.field6375[var35] * var36 + 16383) >> 14;
                                    this.field6375[var35] = this.field6375[var35] * var37 + 16383 - this.field6339[var35] * var36 >> 14;
                                    this.field6339[var35] = var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class487.field7151[arg2];
                                    int var40 = class487.field7150[arg2];
                                    int var41 = this.field6375[var35] * var40 + 16383 - (this.field6321[var35] * var39) >> 14;
                                    this.field6321[var35] = this.field6375[var35] * var39 + this.field6321[var35] * var40 + 16383 >> 14;
                                    this.field6375[var35] = var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class487.field7151[arg3];
                                    int var43 = class487.field7150[arg3];
                                    int var44 = this.field6321[var35] * var42 + (this.field6339[var35] * var43) + 16383 >> 14;
                                    this.field6321[var35] = this.field6321[var35] * var43 + 16383 - (this.field6339[var35] * var42) >> 14;
                                    this.field6339[var35] = var44;
                                }
                                this.field6339[var35] += class74.field1068;
                                this.field6375[var35] += class508.field7460;
                                this.field6321[var35] += class576.field8325;
                            }
                        } else {
                            for (int var23 = 0; var23 < var22.length; var23++) {
                                int var24 = var22[var23];
                                this.field6339[var24] -= class74.field1068;
                                this.field6375[var24] -= class508.field7460;
                                this.field6321[var24] -= class576.field8325;
                                if (arg2 != 0) {
                                    int var25 = class487.field7151[arg2];
                                    int var26 = class487.field7150[arg2];
                                    int var27 = this.field6375[var24] * var26 + 16383 - (this.field6321[var24] * var25) >> 14;
                                    this.field6321[var24] = this.field6375[var24] * var25 - (-(this.field6321[var24] * var26) - 16383) >> 14;
                                    this.field6375[var24] = var27;
                                }
                                if (arg4 != 0) {
                                    int var28 = class487.field7151[arg4];
                                    int var29 = class487.field7150[arg4];
                                    int var30 = this.field6375[var24] * var28 + this.field6339[var24] * var29 + 16383 >> 14;
                                    this.field6375[var24] = this.field6375[var24] * var29 + 16383 - (this.field6339[var24] * var28) >> 14;
                                    this.field6339[var24] = var30;
                                }
                                if (arg3 != 0) {
                                    int var31 = class487.field7151[arg3];
                                    int var32 = class487.field7150[arg3];
                                    int var33 = this.field6321[var24] * var31 + (this.field6339[var24] * var32) + 16383 >> 14;
                                    this.field6321[var24] = this.field6321[var24] * var32 + 16383 - (this.field6339[var24] * var31) >> 14;
                                    this.field6339[var24] = var33;
                                }
                                this.field6339[var24] += class74.field1068;
                                this.field6375[var24] += class508.field7460;
                                this.field6321[var24] += class576.field8325;
                            }
                        }
                    }
                }
                if (arg6) {
                    for (int var45 = 0; var45 < var8; var45++) {
                        int var46 = arg1[var45];
                        if (var46 < this.field6301.length) {
                            int[] var47 = this.field6301[var46];
                            for (int var48 = 0; var48 < var47.length; var48++) {
                                int var49 = var47[var48];
                                int var50 = this.field6351[var49];
                                int var51 = this.field6351[var49 + 1];
                                for (int var52 = var50; var52 < var51; var52++) {
                                    int var53 = this.field6409[var52] - 1;
                                    if (var53 == -1) {
                                        break;
                                    }
                                    if (arg4 != 0) {
                                        int var54 = class487.field7151[arg4];
                                        int var55 = class487.field7150[arg4];
                                        int var56 = this.field6334[var53] * var54 + this.field6359[var53] * var55 + 16383 >> 14;
                                        this.field6334[var53] = (short) (this.field6334[var53] * var55 + 16383 - (this.field6359[var53] * var54) >> 14);
                                        this.field6359[var53] = (short) var56;
                                    }
                                    if (arg2 != 0) {
                                        int var57 = class487.field7151[arg2];
                                        int var58 = class487.field7150[arg2];
                                        int var59 = this.field6334[var53] * var58 - (this.field6361[var53] * var57 - 16383) >> 14;
                                        this.field6361[var53] = (short) (this.field6361[var53] * var58 + this.field6334[var53] * var57 + 16383 >> 14);
                                        this.field6334[var53] = (short) var59;
                                    }
                                    if (arg3 != 0) {
                                        int var60 = class487.field7151[arg3];
                                        int var61 = class487.field7150[arg3];
                                        int var62 = this.field6361[var53] * var60 + this.field6359[var53] * var61 + 16383 >> 14;
                                        this.field6361[var53] = (short) (this.field6361[var53] * var61 + (16383 - (this.field6359[var53] * var60)) >> 14);
                                        this.field6359[var53] = (short) var62;
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6393 == null && this.field6392 != null) {
                        this.field6392.field4326 = null;
                    }
                    if (this.field6393 != null) {
                        this.field6393.field4326 = null;
                    }
                }
            } else if (arg0 == 3) {
                for (int var63 = 0; var63 < var8; var63++) {
                    int var64 = arg1[var63];
                    if (var64 < this.field6301.length) {
                        int[] var65 = this.field6301[var64];
                        for (int var66 = 0; var66 < var65.length; var66++) {
                            int var67 = var65[var66];
                            this.field6339[var67] -= class74.field1068;
                            this.field6375[var67] -= class508.field7460;
                            this.field6321[var67] -= class576.field8325;
                            this.field6339[var67] = this.field6339[var67] * arg2 >> 7;
                            this.field6375[var67] = this.field6375[var67] * arg3 >> 7;
                            this.field6321[var67] = this.field6321[var67] * arg4 >> 7;
                            this.field6339[var67] += class74.field1068;
                            this.field6375[var67] += class508.field7460;
                            this.field6321[var67] += class576.field8325;
                        }
                    }
                }
            } else if (arg0 == 5) {
                if (this.field6308 != null) {
                    for (int var68 = 0; var68 < var8; var68++) {
                        int var69 = arg1[var68];
                        if (this.field6308.length > var69) {
                            int[] var70 = this.field6308[var69];
                            for (int var71 = 0; var71 < var70.length; var71++) {
                                int var72 = var70[var71];
                                int var73 = (this.field6363[var72] & 0xFF) + arg2 * 8;
                                if (var73 < 0) {
                                    var73 = 0;
                                } else if (var73 > 255) {
                                    var73 = 255;
                                }
                                this.field6363[var72] = (byte) var73;
                            }
                            if (var70.length > 0 && this.field6392 != null) {
                                this.field6392.field4326 = null;
                            }
                        }
                    }
                    if (this.field6313 != null) {
                        for (int var74 = 0; var74 < this.field6410; var74++) {
                            class326 var75 = this.field6313[var74];
                            class237 var76 = this.field6407[var74];
                            var76.field3426 = var76.field3426 & 0xFFFFFF | 255 - (this.field6363[var75.field4460] & 0xFF) << 24;
                        }
                    }
                }
            } else if (arg0 == 7) {
                if (this.field6308 != null) {
                    for (int var77 = 0; var77 < var8; var77++) {
                        int var78 = arg1[var77];
                        if (this.field6308.length > var78) {
                            int[] var79 = this.field6308[var78];
                            for (int var80 = 0; var80 < var79.length; var80++) {
                                int var81 = var79[var80];
                                int var82 = this.field6294[var81] & 0xFFFF;
                                int var83 = (var82 & 0xFD5B) >> 10;
                                int var84 = (var82 & 0x3BD) >> 7;
                                int var85 = var82 & 0x7F;
                                int var86 = arg3 / 4 + var84;
                                int var87 = arg2 + var83 & 0x3F;
                                if (var86 < 0) {
                                    var86 = 0;
                                } else if (var86 > 7) {
                                    var86 = 7;
                                }
                                int var88 = arg4 + var85;
                                if (var88 < 0) {
                                    var88 = 0;
                                } else if (var88 > 127) {
                                    var88 = 127;
                                }
                                this.field6294[var81] = (short) class10.method71(class10.method71(var87 << 10, var86 << 7), var88);
                            }
                            if (var79.length > 0 && this.field6392 != null) {
                                this.field6392.field4326 = null;
                            }
                        }
                    }
                    if (this.field6313 != null) {
                        for (int var89 = 0; var89 < this.field6410; var89++) {
                            class326 var90 = this.field6313[var89];
                            class237 var91 = this.field6407[var89];
                            var91.field3426 = class360.field5233[this.field6294[var90.field4460] & 0xFFFF] & 0xFFFFFF | var91.field3426 & 0xFF000000;
                        }
                    }
                }
            } else if (arg0 == 8) {
                if (this.field6316 != null) {
                    for (int var92 = 0; var92 < var8; var92++) {
                        int var93 = arg1[var92];
                        if (var93 < this.field6316.length) {
                            int[] var94 = this.field6316[var93];
                            for (int var95 = 0; var95 < var94.length; var95++) {
                                class237 var96 = this.field6407[var94[var95]];
                                var96.field3434 += arg3;
                                var96.field3422 += arg2;
                            }
                        }
                    }
                }
            } else if (arg0 == 10) {
                if (this.field6316 != null) {
                    for (int var97 = 0; var97 < var8; var97++) {
                        int var98 = arg1[var97];
                        if (var98 < this.field6316.length) {
                            int[] var99 = this.field6316[var98];
                            for (int var100 = 0; var100 < var99.length; var100++) {
                                class237 var101 = this.field6407[var99[var100]];
                                var101.field3429 = var101.field3429 * arg2 >> 7;
                                var101.field3433 = var101.field3433 * arg3 >> 7;
                            }
                        }
                    }
                }
            } else if (arg0 == 9 && this.field6316 != null) {
                for (int var102 = 0; var102 < var8; var102++) {
                    int var103 = arg1[var102];
                    if (var103 < this.field6316.length) {
                        int[] var104 = this.field6316[var103];
                        for (int var105 = 0; var105 < var104.length; var105++) {
                            class237 var106 = this.field6407[var104[var105]];
                            var106.field3424 = var106.field3424 + arg2 & 0x3FFF;
                        }
                    }
                }
            }
        } catch (RuntimeException var108) {
            throw class665.method4799(var108, field6418[11] + arg0 + ',' + (arg1 == null ? field6418[1] : field6418[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(B)V", line = 664)
    private final void method3383(byte arg0) {
        try {
            field6367++;
            if (arg0 == -42) {
                int var2 = 32767;
                int var3 = 32767;
                int var4 = 32767;
                int var5 = -32768;
                int var6 = -32768;
                int var7 = -32768;
                int var8 = 0;
                int var9 = 0;
                for (int var10 = 0; var10 < this.field6344; var10++) {
                    int var11 = this.field6339[var10];
                    int var12 = this.field6375[var10];
                    int var13 = this.field6321[var10];
                    if (var12 > var6) {
                        var6 = var12;
                    }
                    if (var3 > var12) {
                        var3 = var12;
                    }
                    if (var5 < var11) {
                        var5 = var11;
                    }
                    if (var11 < var2) {
                        var2 = var11;
                    }
                    if (var13 < var4) {
                        var4 = var13;
                    }
                    if (var7 < var13) {
                        var7 = var13;
                    }
                    int var14 = var11 * var11 + var13 * var13;
                    if (var8 < var14) {
                        var8 = var14;
                    }
                    int var15 = var11 * var11 + var12 * var12 + var13 * var13;
                    if (var9 < var15) {
                        var9 = var15;
                    }
                }
                this.field6305 = (short) var5;
                this.field6374 = (short) var4;
                this.field6347 = (short) var7;
                this.field6391 = (short) var3;
                this.field6365 = (short) var6;
                this.field6304 = (short) var2;
                this.field6323 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
                this.field6354 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
                this.field6414 = true;
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field6418[42] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lqa;IZ)V", line = 753)
    public final void method389(class104 arg0, int arg1, boolean arg2) {
        try {
            field6369++;
            if (this.field6403 != null) {
                int[] var4 = new int[3];
                for (int var5 = 0; var5 < this.field6344; var5++) {
                    if ((arg1 & this.field6403[var5]) != 0) {
                        if (arg2) {
                            arg0.method732(this.field6339[var5], this.field6375[var5], this.field6321[var5], var4);
                        } else {
                            arg0.method740(this.field6339[var5], this.field6375[var5], this.field6321[var5], var4);
                        }
                        this.field6339[var5] = var4[0];
                        this.field6375[var5] = var4[1];
                        this.field6321[var5] = var4[2];
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6418[64] + (arg0 == null ? field6418[1] : field6418[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "ua", descriptor = "()I", line = 785)
    public final int method395() {
        try {
            field6362++;
            return this.field6327;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[15] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "HA", descriptor = "()I", line = 793)
    public final int method414() {
        try {
            if (!this.field6414) {
                this.method3383((byte) -42);
            }
            field6398++;
            return this.field6374;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[18] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "RA", descriptor = "()I", line = 804)
    public final int method417() {
        try {
            field6350++;
            if (!this.field6414) {
                this.method3383((byte) -42);
            }
            return this.field6305;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[32] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "wa", descriptor = "()V", line = 815)
    public final void method424() {
        try {
            field6389++;
            for (int var1 = 0; var1 < this.field6320; var1++) {
                this.field6339[var1] = this.field6339[var1] + 7 >> 4;
                this.field6375[var1] = this.field6375[var1] + 7 >> 4;
                this.field6321[var1] = this.field6321[var1] + 7 >> 4;
            }
            if (this.field6413 != null) {
                this.field6413.field4326 = null;
            }
            this.field6414 = false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6418[46] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V", line = 841)
    public final void method419(int arg0) {
        try {
            field6325++;
            int var2 = class487.field7151[arg0];
            int var3 = class487.field7150[arg0];
            for (int var4 = 0; var4 < this.field6344; var4++) {
                int var5 = this.field6339[var4] * var3 + this.field6321[var4] * var2 >> 14;
                this.field6321[var4] = this.field6321[var4] * var3 - (this.field6339[var4] * var2) >> 14;
                this.field6339[var4] = var5;
            }
            if (this.field6413 != null) {
                this.field6413.field4326 = null;
            }
            this.field6414 = false;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6418[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "()[B", line = 871)
    public final byte[] method407() {
        try {
            field6328++;
            return this.field6363;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[41] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IILqa;ZII)Z", line = 885)
    public final boolean method440(int arg0, int arg1, class104 arg2, boolean arg3, int arg4, int arg5) {
        try {
            field6338++;
            return this.method3391(arg1, 27461, arg0, arg3, arg4, arg5, arg2);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field6418[37] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6418[1] : field6418[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)V", line = 894)
    public static void method3384(boolean arg0) {
        try {
            field6329 = null;
            if (arg0) {
                method3389(100, (byte) 14);
            }
            field6336 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[28] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "WA", descriptor = "()I", line = 905)
    public final int method399() {
        try {
            field6364++;
            return this.field6394;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[5] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lml;)V", line = 5770)
    public class435(class194 arg0) {
        try {
            this.field6368 = arg0;
            this.field6413 = new class316(null, 5126, 3, 0);
            this.field6324 = new class316(null, 5126, 2, 0);
            this.field6393 = new class316(null, 5126, 3, 0);
            this.field6392 = new class316(null, 5121, 4, 0);
            this.field6372 = new class398();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6418[21] + (arg0 == null ? field6418[1] : field6418[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lml;Lrha;IIII)V", line = 5858)
    public class435(class194 arg0, class60 arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field6327 = arg2;
            this.field6368 = arg0;
            this.field6386 = arg5;
            if (class496.method3818(arg2, -110, arg5)) {
                this.field6413 = new class316(null, 5126, 3, 0);
            }
            if (class222.method1861(arg2, -27943, arg5)) {
                this.field6324 = new class316(null, 5126, 2, 0);
            }
            if (class322.method2548(arg5, arg2, -1)) {
                this.field6393 = new class316(null, 5126, 3, 0);
            }
            if (class151.method1284(arg2, (byte) -43, arg5)) {
                this.field6392 = new class316(null, 5121, 4, 0);
            }
            if (class218.method1844(true, arg5, arg2)) {
                this.field6372 = new class398();
            }
            class673 var7 = arg0.field237;
            this.field6351 = new int[arg1.field880 + 1];
            int[] var8 = new int[arg1.field903];
            for (int var9 = 0; var9 < arg1.field903; var9++) {
                if (arg1.field870 == null || arg1.field870[var9] != 2) {
                    if (arg1.field924 != null && arg1.field924[var9] != -1) {
                        class684 var10 = var7.method4500(-23641, arg1.field924[var9] & 0xFFFF);
                        if (((this.field6386 & 0x40) == 0 || !var10.field9583) && var10.field9586) {
                            continue;
                        }
                    }
                    var8[this.field6370++] = var9;
                    this.field6351[arg1.field914[var9]]++;
                    this.field6351[arg1.field889[var9]]++;
                    this.field6351[arg1.field900[var9]]++;
                }
            }
            this.field6310 = this.field6370;
            long[] var11 = new long[this.field6370];
            boolean var12 = (this.field6327 & 0x100) != 0;
            for (int var13 = 0; var13 < this.field6370; var13++) {
                int var14 = var8[var13];
                class684 var15 = null;
                int var16 = 0;
                byte var17 = 0;
                byte var18 = 0;
                byte var19 = 0;
                if (arg1.field883 != null) {
                    boolean var20 = false;
                    for (int var21 = 0; var21 < arg1.field883.length; var21++) {
                        class533 var22 = arg1.field883[var21];
                        if (var22.field7718 == var14) {
                            class9 var23 = class706.method5062(122, var22.field7713);
                            if (var23.field112) {
                                var20 = true;
                            }
                            if (var23.field109 != -1) {
                                class684 var24 = var7.method4500(-23641, var23.field109);
                                if (var24.field9584 == 2) {
                                    this.field6299 = true;
                                }
                            }
                        }
                    }
                    if (var20) {
                        var11[var13] = Long.MAX_VALUE;
                        this.field6310--;
                        continue;
                    }
                }
                short var25 = -1;
                if (arg1.field924 != null) {
                    var25 = arg1.field924[var14];
                    if (var25 != -1) {
                        var15 = var7.method4500(-23641, var25 & 0xFFFF);
                        if ((this.field6386 & 0x40) != 0 && var15.field9583) {
                            var15 = null;
                            var25 = -1;
                        } else {
                            if (var15.field9598 != 0 || var15.field9592 != 0) {
                                this.field6302 = true;
                            }
                            var18 = var15.field9605;
                            var19 = var15.field9600;
                        }
                    }
                }
                boolean var26 = arg1.field906 != null && arg1.field906[var14] != 0 || var15 != null && var15.field9584 != 0;
                if ((var12 || var26) && arg1.field884 != null) {
                    var16 += arg1.field884[var14] << 17;
                }
                if (var26) {
                    var16 += 65536;
                }
                int var27 = ((var18 & 0xFF) << 8) + var16;
                int var28 = (var25 & 0xFFFF << 16) + var17;
                int var29 = (var19 & 0xFF) + var27;
                int var30 = (var13 & 0xFFFF) + var28;
                var11[var13] = ((long) var29 << 32) + (long) var30;
                this.field6302 |= var15 != null && (var15.field9598 != 0 || var15.field9592 != 0);
                this.field6299 |= var26;
            }
            class96.method953(var8, 1, var11);
            this.field6375 = arg1.field921;
            this.field6339 = arg1.field905;
            this.field6344 = arg1.field880;
            this.field6403 = arg1.field886;
            this.field6320 = arg1.field874;
            this.field6321 = arg1.field918;
            class480[] var31 = new class480[this.field6344];
            this.field6404 = arg1.field915;
            this.field6383 = arg1.field869;
            if (arg1.field883 != null) {
                this.field6410 = arg1.field883.length;
                this.field6407 = new class237[this.field6410];
                this.field6313 = new class326[this.field6410];
                for (int var32 = 0; var32 < this.field6410; var32++) {
                    class533 var33 = arg1.field883[var32];
                    class9 var34 = class706.method5062(122, var33.field7713);
                    int var35 = -1;
                    for (int var36 = 0; var36 < this.field6370; var36++) {
                        if (var8[var36] == var33.field7718) {
                            var35 = var36;
                            break;
                        }
                    }
                    if (var35 == -1) {
                        throw new RuntimeException();
                    }
                    int var37 = class360.field5233[arg1.field919[var33.field7718] & 0xFFFF] & 0xFFFFFF;
                    int var38 = var37 | 255 - (arg1.field906 == null ? 0 : arg1.field906[var33.field7718]) << 24;
                    this.field6313[var32] = new class326(var35, arg1.field914[var33.field7718], arg1.field889[var33.field7718], arg1.field900[var33.field7718], var34.field111, var34.field114, var34.field109, var34.field113, var34.field116, var34.field112, var34.field105, var33.field7716);
                    this.field6407[var32] = new class237(var38);
                }
            }
            int var39 = this.field6370 * 3;
            this.field6294 = new short[this.field6370];
            if (arg1.field894 != null) {
                this.field6309 = new short[this.field6370];
            }
            class212.field3120 = new long[var39];
            this.field6342 = new short[this.field6370];
            this.field6408 = new float[var39];
            this.field6363 = new byte[this.field6370];
            this.field6359 = new short[var39];
            this.field6345 = new byte[var39];
            this.field6361 = new short[var39];
            this.field6401 = new float[var39];
            this.field6394 = (short) arg3;
            this.field6306 = new short[this.field6370];
            this.field6330 = new short[this.field6370];
            this.field6409 = new short[var39];
            this.field6334 = new short[var39];
            this.field6322 = (short) arg4;
            this.field6396 = new short[this.field6370];
            int var40 = 0;
            for (int var41 = 0; var41 < arg1.field880; var41++) {
                int var42 = this.field6351[var41];
                this.field6351[var41] = var40;
                var31[var41] = new class480();
                var40 += var42;
            }
            this.field6351[arg1.field880] = var40;
            class126 var43 = class447.method3468((byte) 34, this.field6370, var8, arg1);
            class24[] var44 = new class24[arg1.field903];
            for (int var45 = 0; var45 < arg1.field903; var45++) {
                short var46 = arg1.field914[var45];
                short var47 = arg1.field889[var45];
                short var48 = arg1.field900[var45];
                int var49 = this.field6339[var47] - this.field6339[var46];
                int var50 = this.field6375[var47] - this.field6375[var46];
                int var51 = this.field6321[var47] - this.field6321[var46];
                int var52 = this.field6339[var48] - this.field6339[var46];
                int var53 = this.field6375[var48] - this.field6375[var46];
                int var54 = this.field6321[var48] - this.field6321[var46];
                int var55 = var50 * var54 - var51 * var53;
                int var56 = var51 * var52 - (var49 * var54);
                int var57 = var49 * var53 - var50 * var52;
                while (var55 > 8192 || var56 > 8192 || var57 > 8192 || var55 < -8192 || var56 < -8192 || var57 < -8192) {
                    var56 >>= 0x1;
                    var57 >>= 0x1;
                    var55 >>= 0x1;
                }
                int var58 = (int) Math.sqrt((double) (var55 * var55 + (var56 * var56 + (var57 * var57))));
                if (var58 <= 0) {
                    var58 = 1;
                }
                int var59 = var57 * 256 / var58;
                int var60 = var55 * 256 / var58;
                int var61 = var56 * 256 / var58;
                byte var62 = arg1.field870 == null ? 0 : arg1.field870[var45];
                if (var62 == 0) {
                    class480 var64 = var31[var46];
                    var64.field7071 += var60;
                    var64.field7069 += var61;
                    var64.field7068++;
                    var64.field7070 += var59;
                    class480 var65 = var31[var47];
                    var65.field7071 += var60;
                    var65.field7069 += var61;
                    var65.field7068++;
                    var65.field7070 += var59;
                    class480 var66 = var31[var48];
                    var66.field7069 += var61;
                    var66.field7070 += var59;
                    var66.field7071 += var60;
                    var66.field7068++;
                } else if (var62 == 1) {
                    class24 var63 = var44[var45] = new class24();
                    var63.field289 = var59;
                    var63.field287 = var61;
                    var63.field286 = var60;
                }
            }
            for (int var67 = 0; var67 < this.field6370; var67++) {
                int var68 = var8[var67];
                int var69 = arg1.field919[var68] & 0xFFFF;
                int var70;
                if (arg1.field898 == null) {
                    var70 = -1;
                } else {
                    var70 = arg1.field898[var68];
                }
                int var71;
                if (arg1.field906 == null) {
                    var71 = 0;
                } else {
                    var71 = arg1.field906[var68] & 0xFF;
                }
                short var72 = arg1.field924 == null ? -1 : arg1.field924[var68];
                if (var72 != -1 && (this.field6386 & 0x40) != 0) {
                    class684 var73 = var7.method4500(-23641, var72 & 0xFFFF);
                    if (var73.field9583) {
                        var72 = -1;
                    }
                }
                float var74 = 0.0F;
                float var75 = 0.0F;
                float var76 = 0.0F;
                float var77 = 0.0F;
                float var78 = 0.0F;
                float var79 = 0.0F;
                byte var80 = 0;
                byte var81 = 0;
                int var82 = 0;
                if (var72 != -1) {
                    if (var70 == -1) {
                        var78 = 0.0F;
                        var77 = 1.0F;
                        var81 = 2;
                        var75 = 1.0F;
                        var79 = 0.0F;
                        var74 = 0.0F;
                        var80 = 1;
                        var76 = 1.0F;
                    } else {
                        var70 &= 0xFF;
                        byte var83 = arg1.field922[var70];
                        if (var83 == 0) {
                            short var112 = arg1.field914[var68];
                            short var113 = arg1.field889[var68];
                            short var114 = arg1.field900[var68];
                            short var115 = arg1.field891[var70];
                            short var116 = arg1.field899[var70];
                            short var117 = arg1.field909[var70];
                            float var118 = (float) arg1.field905[var115];
                            float var119 = (float) arg1.field921[var115];
                            float var120 = (float) arg1.field918[var115];
                            float var121 = (float) arg1.field905[var116] - var118;
                            float var122 = (float) arg1.field921[var116] - var119;
                            float var123 = (float) arg1.field918[var116] - var120;
                            float var124 = (float) arg1.field905[var117] - var118;
                            float var125 = (float) arg1.field921[var117] - var119;
                            float var126 = (float) arg1.field918[var117] - var120;
                            float var127 = (float) arg1.field905[var112] - var118;
                            float var128 = (float) arg1.field921[var112] - var119;
                            float var129 = (float) arg1.field918[var112] - var120;
                            float var130 = (float) arg1.field905[var113] - var118;
                            float var131 = (float) arg1.field921[var113] - var119;
                            float var132 = (float) arg1.field918[var113] - var120;
                            float var133 = (float) arg1.field905[var114] - var118;
                            float var134 = (float) arg1.field921[var114] - var119;
                            float var135 = (float) arg1.field918[var114] - var120;
                            float var136 = var122 * var126 - var123 * var125;
                            float var137 = var123 * var124 - (var121 * var126);
                            float var138 = var121 * var125 - (var122 * var124);
                            float var139 = var125 * var138 - var126 * var137;
                            float var140 = var126 * var136 - (var124 * var138);
                            float var141 = var124 * var137 - (var125 * var136);
                            float var142 = 1.0F / (var123 * var141 + var121 * var139 + var122 * var140);
                            var78 = (var135 * var141 + var133 * var139 + var134 * var140) * var142;
                            var76 = (var132 * var141 + var130 * var139 + var131 * var140) * var142;
                            var74 = (var129 * var141 + var127 * var139 + var128 * var140) * var142;
                            float var143 = var122 * var138 - var123 * var137;
                            float var144 = var121 * var137 - var122 * var136;
                            float var145 = var123 * var136 - var121 * var138;
                            float var146 = 1.0F / (var126 * var144 + var124 * var143 + var125 * var145);
                            var77 = (var132 * var144 + var130 * var143 + var131 * var145) * var146;
                            var79 = (var135 * var144 + var133 * var143 + var134 * var145) * var146;
                            var75 = (var129 * var144 + var127 * var143 + var128 * var145) * var146;
                        } else {
                            short var84 = arg1.field914[var68];
                            short var85 = arg1.field889[var68];
                            short var86 = arg1.field900[var68];
                            int var87 = var43.field1578[var70];
                            int var88 = var43.field1582[var70];
                            int var89 = var43.field1587[var70];
                            float[] var90 = var43.field1581[var70];
                            byte var91 = arg1.field893[var70];
                            float var92 = (float) arg1.field875[var70] / 256.0F;
                            if (var83 == 1) {
                                float var93 = (float) arg1.field877[var70] / 1024.0F;
                                class79.method790(var91, class256.field3670, var88, var89, arg1.field905[var84], (byte) 123, arg1.field918[var84], arg1.field921[var84], var92, var93, var90, var87);
                                var75 = class256.field3670[1];
                                var74 = class256.field3670[0];
                                class79.method790(var91, class256.field3670, var88, var89, arg1.field905[var85], (byte) 123, arg1.field918[var85], arg1.field921[var85], var92, var93, var90, var87);
                                var76 = class256.field3670[0];
                                var77 = class256.field3670[1];
                                class79.method790(var91, class256.field3670, var88, var89, arg1.field905[var86], (byte) 123, arg1.field918[var86], arg1.field921[var86], var92, var93, var90, var87);
                                var78 = class256.field3670[0];
                                var79 = class256.field3670[1];
                                float var94 = var93 / 2.0F;
                                if ((var91 & 0x1) == 0) {
                                    if (var76 - var74 > var94) {
                                        var76 -= var93;
                                        var80 = 1;
                                    } else if (var74 - var76 > var94) {
                                        var80 = 2;
                                        var76 += var93;
                                    }
                                    if (var94 < var78 - var74) {
                                        var81 = 1;
                                        var78 -= var93;
                                    } else if (var94 < var74 - var78) {
                                        var81 = 2;
                                        var78 += var93;
                                    }
                                } else {
                                    if ((var94 < var79 - var75)) {
                                        var79 -= var93;
                                        var81 = 1;
                                    } else if (var75 - var79 > var94) {
                                        var79 += var93;
                                        var81 = 2;
                                    }
                                    if (var94 < var77 - var75) {
                                        var80 = 1;
                                        var77 -= var93;
                                    } else if (var94 < var75 - var77) {
                                        var80 = 2;
                                        var77 += var93;
                                    }
                                }
                            } else if (var83 == 2) {
                                float var95 = (float) arg1.field888[var70] / 256.0F;
                                float var96 = (float) arg1.field923[var70] / 256.0F;
                                int var97 = arg1.field905[var85] - arg1.field905[var84];
                                int var98 = arg1.field921[var85] - arg1.field921[var84];
                                int var99 = arg1.field918[var85] - arg1.field918[var84];
                                int var100 = arg1.field905[var86] - arg1.field905[var84];
                                int var101 = arg1.field921[var86] - arg1.field921[var84];
                                int var102 = arg1.field918[var86] - arg1.field918[var84];
                                int var103 = var98 * var102 - (var99 * var101);
                                int var104 = var99 * var100 - (var97 * var102);
                                int var105 = var97 * var101 - (var98 * var100);
                                float var106 = 64.0F / (float) arg1.field907[var70];
                                float var107 = 64.0F / (float) arg1.field912[var70];
                                float var108 = 64.0F / (float) arg1.field877[var70];
                                float var109 = (var90[2] * (float) var105 + var90[1] * (float) var104 + var90[0] * (float) var103) / var106;
                                float var110 = (var90[5] * (float) var105 + var90[4] * (float) var104 + var90[3] * (float) var103) / var107;
                                float var111 = (var90[8] * (float) var105 + var90[7] * (float) var104 + var90[6] * (float) var103) / var108;
                                var82 = class213.method1793(var110, 0, var109, var111);
                                class687.method4916(var88, var82, arg1.field921[var84], var89, (byte) 95, arg1.field918[var84], var92, var96, var95, class256.field3670, arg1.field905[var84], var87, var90, var91);
                                var74 = class256.field3670[0];
                                var75 = class256.field3670[1];
                                class687.method4916(var88, var82, arg1.field921[var85], var89, (byte) -95, arg1.field918[var85], var92, var96, var95, class256.field3670, arg1.field905[var85], var87, var90, var91);
                                var76 = class256.field3670[0];
                                var77 = class256.field3670[1];
                                class687.method4916(var88, var82, arg1.field921[var86], var89, (byte) 88, arg1.field918[var86], var92, var96, var95, class256.field3670, arg1.field905[var86], var87, var90, var91);
                                var78 = class256.field3670[0];
                                var79 = class256.field3670[1];
                            } else if (var83 == 3) {
                                class696.method5016(var87, arg1.field905[var84], var89, var88, 3314, arg1.field918[var84], var90, var91, arg1.field921[var84], class256.field3670, var92);
                                var75 = class256.field3670[1];
                                var74 = class256.field3670[0];
                                class696.method5016(var87, arg1.field905[var85], var89, var88, 3314, arg1.field918[var85], var90, var91, arg1.field921[var85], class256.field3670, var92);
                                var77 = class256.field3670[1];
                                var76 = class256.field3670[0];
                                class696.method5016(var87, arg1.field905[var86], var89, var88, 3314, arg1.field918[var86], var90, var91, arg1.field921[var86], class256.field3670, var92);
                                var78 = class256.field3670[0];
                                var79 = class256.field3670[1];
                                if ((var91 & 0x1) == 0) {
                                    if (var76 - var74 > 0.5F) {
                                        var80 = 1;
                                        var76--;
                                    } else if (var74 - var76 > 0.5F) {
                                        var76++;
                                        var80 = 2;
                                    }
                                    if (var78 - var74 > 0.5F) {
                                        var81 = 1;
                                        var78--;
                                    } else if (var74 - var78 > 0.5F) {
                                        var78++;
                                        var81 = 2;
                                    }
                                } else {
                                    if ((var79 - var75 > 0.5F)) {
                                        var81 = 1;
                                        var79--;
                                    } else if (var75 - var79 > 0.5F) {
                                        var81 = 2;
                                        var79++;
                                    }
                                    if ((var77 - var75 > 0.5F)) {
                                        var80 = 1;
                                        var77--;
                                    } else if (var75 - var77 > 0.5F) {
                                        var80 = 2;
                                        var77++;
                                    }
                                }
                            }
                        }
                    }
                }
                byte var147;
                if (arg1.field870 == null) {
                    var147 = 0;
                } else {
                    var147 = arg1.field870[var68];
                }
                if (var147 == 0) {
                    long var148 = ((long) (var69 << 8) + (long) var71 + (long) (var82 << 24) << 32) + (long) (var70 << 2);
                    short var150 = arg1.field914[var68];
                    short var151 = arg1.field889[var68];
                    short var152 = arg1.field900[var68];
                    class480 var153 = var31[var150];
                    this.field6330[var67] = this.method3392(arg1, var150, var75, (byte) -64, var153.field7069, var153.field7070, var74, var153.field7071, var153.field7068, var148);
                    class480 var154 = var31[var151];
                    this.field6396[var67] = this.method3392(arg1, var151, var77, (byte) -112, var154.field7069, var154.field7070, var76, var154.field7071, var154.field7068, (long) var80 + var148);
                    class480 var155 = var31[var152];
                    this.field6342[var67] = this.method3392(arg1, var152, var79, (byte) -56, var155.field7069, var155.field7070, var78, var155.field7071, var155.field7068, (long) var81 + var148);
                } else if (var147 == 1) {
                    class24 var156 = var44[var68];
                    long var157 = ((long) (var82 << 24) + ((long) (var69 << 8)) + (long) var71 << 32) + (long) ((var156.field289 + 256 << 22) + (var156.field287 + 256 << 12) + (var156.field286 > 0 ? 1024 : 2048) + (var70 << 2));
                    this.field6330[var67] = this.method3392(arg1, arg1.field914[var68], var75, (byte) -110, var156.field287, var156.field289, var74, var156.field286, 0, var157);
                    this.field6396[var67] = this.method3392(arg1, arg1.field889[var68], var77, (byte) -92, var156.field287, var156.field289, var76, var156.field286, 0, (long) var80 + var157);
                    this.field6342[var67] = this.method3392(arg1, arg1.field900[var68], var79, (byte) -79, var156.field287, var156.field289, var78, var156.field286, 0, (long) var81 + var157);
                }
                if (arg1.field906 != null) {
                    this.field6363[var67] = arg1.field906[var68];
                }
                if (arg1.field894 != null) {
                    this.field6309[var67] = arg1.field894[var68];
                }
                this.field6294[var67] = arg1.field919[var68];
                this.field6306[var67] = var72;
            }
            int var159 = 0;
            short var160 = -10000;
            for (int var161 = 0; var161 < this.field6310; var161++) {
                short var162 = this.field6306[var161];
                if (var160 != var162) {
                    var160 = var162;
                    var159++;
                }
            }
            this.field6402 = new int[var159 + 1];
            short var163 = -10000;
            int var164 = 0;
            for (int var165 = 0; var165 < this.field6310; var165++) {
                short var166 = this.field6306[var165];
                if (var163 != var166) {
                    var163 = var166;
                    this.field6402[var164++] = var165;
                }
            }
            this.field6402[var164] = this.field6310;
            class212.field3120 = null;
            this.field6359 = class590.method4358(0, this.field6359, this.field6384);
            this.field6334 = class590.method4358(0, this.field6334, this.field6384);
            this.field6361 = class590.method4358(0, this.field6361, this.field6384);
            this.field6345 = class251.method2040(this.field6384, Integer.MAX_VALUE, this.field6345);
            this.field6401 = class391.method3060(this.field6384, this.field6401, (byte) 102);
            this.field6408 = class391.method3060(this.field6384, this.field6408, (byte) 80);
            if (arg1.field904 != null && class553.method4136(arg2, this.field6386, 32)) {
                this.field6301 = arg1.method638((byte) -41, false);
            }
            if (arg1.field883 != null && class118.method1076(this.field6386, arg2, (byte) -104)) {
                this.field6316 = arg1.method649(-7453);
            }
            if (arg1.field910 != null && class346.method2775((byte) 125, arg2, this.field6386)) {
                int var167 = 0;
                int[] var168 = new int[256];
                for (int var169 = 0; var169 < this.field6370; var169++) {
                    int var170 = arg1.field910[var8[var169]];
                    if (var170 >= 0) {
                        if (var170 > var167) {
                            var167 = var170;
                        }
                        int var10002 = var168[var170]++;
                    }
                }
                this.field6308 = new int[var167 + 1][];
                for (int var171 = 0; var171 <= var167; var171++) {
                    this.field6308[var171] = new int[var168[var171]];
                    var168[var171] = 0;
                }
                for (int var172 = 0; var172 < this.field6370; var172++) {
                    int var173 = arg1.field910[var8[var172]];
                    if (var173 >= 0) {
                        this.field6308[var173][var168[var173]++] = var172;
                    }
                }
            }
        } catch (RuntimeException var175) {
            throw class665.method4799(var175, field6418[21] + (arg0 == null ? field6418[1] : field6418[0]) + ',' + (arg1 == null ? field6418[1] : field6418[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "G", descriptor = "()I", line = 921)
    public final int method385() {
        try {
            field6405++;
            if (!this.field6414) {
                this.method3383((byte) -42);
            }
            return this.field6347;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[47] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "V", descriptor = "()I", line = 937)
    public final int method433() {
        try {
            if (!this.field6414) {
                this.method3383((byte) -42);
            }
            field6377++;
            return this.field6304;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[49] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "fa", descriptor = "()I", line = 953)
    public final int method432() {
        try {
            if (!this.field6414) {
                this.method3383((byte) -42);
            }
            field6293++;
            return this.field6391;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[57] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZB)V", line = 966)
    private final void method3385(boolean arg0, byte arg1) {
        try {
            field6356++;
            boolean var3 = this.field6392 != null && this.field6392.field4326 == null;
            boolean var4 = this.field6393 != null && this.field6393.field4326 == null;
            boolean var5 = this.field6413 != null && this.field6413.field4326 == null;
            boolean var6 = this.field6324 != null && this.field6324.field4326 == null;
            if (arg0) {
                var5 &= (this.field6380 & 0x1) != 0;
                var6 &= (this.field6380 & 0x8) != 0;
                var3 &= (this.field6380 & 0x2) != 0;
                var4 &= (this.field6380 & 0x4) != 0;
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
            if (var7 != 0) {
                if ((this.field6384 * var7) > this.field6368.field2890.field9996.length) {
                    this.field6368.field2890 = new class318((this.field6384 + 100) * var7);
                } else {
                    this.field6368.field2890.field9945 = 0;
                }
                class318 var12 = this.field6368.field2890;
                if (var5) {
                    if (this.field6368.field2842) {
                        for (int var21 = 0; var21 < this.field6344; var21++) {
                            int var22 = Stream.floatToRawIntBits((float) this.field6339[var21]);
                            int var23 = Stream.floatToRawIntBits((float) this.field6375[var21]);
                            int var24 = Stream.floatToRawIntBits((float) this.field6321[var21]);
                            int var25 = this.field6351[var21];
                            int var26 = this.field6351[var21 + 1];
                            for (int var27 = var25; var27 < var26; var27++) {
                                int var28 = this.field6409[var27] - 1;
                                if (var28 == -1) {
                                    break;
                                }
                                var12.field9945 = var7 * var28;
                                var12.method5127(var22, 26108);
                                var12.method5127(var23, arg1 ^ 0xFFFF9A51);
                                var12.method5127(var24, 26108);
                            }
                        }
                    } else {
                        for (int var13 = 0; var13 < this.field6344; var13++) {
                            int var14 = Stream.floatToRawIntBits((float) this.field6339[var13]);
                            int var15 = Stream.floatToRawIntBits((float) this.field6375[var13]);
                            int var16 = Stream.floatToRawIntBits((float) this.field6321[var13]);
                            int var17 = this.field6351[var13];
                            int var18 = this.field6351[var13 + 1];
                            for (int var19 = var17; var19 < var18; var19++) {
                                int var20 = this.field6409[var19] - 1;
                                if (var20 == -1) {
                                    break;
                                }
                                var12.field9945 = var7 * var20;
                                var12.method5109(var14, 1730285032);
                                var12.method5109(var15, 1730285032);
                                var12.method5109(var16, 1730285032);
                            }
                        }
                    }
                }
                if (arg1 != -83) {
                    this.method382(-6, -92, null, true, 20);
                }
                if (var3) {
                    if (this.field6393 == null) {
                        short[] var31;
                        short[] var32;
                        byte[] var33;
                        short[] var34;
                        if (this.field6387 == null) {
                            var31 = this.field6334;
                            var32 = this.field6359;
                            var33 = this.field6345;
                            var34 = this.field6361;
                        } else {
                            var32 = this.field6387.field3473;
                            var34 = this.field6387.field3469;
                            var31 = this.field6387.field3471;
                            var33 = this.field6387.field3468;
                        }
                        float var35 = this.field6368.field2803[0];
                        float var36 = this.field6368.field2803[1];
                        float var37 = this.field6368.field2803[2];
                        float var38 = this.field6368.field2893;
                        float var39 = this.field6368.field2889 * 768.0F / (float) this.field6322;
                        float var40 = this.field6368.field2817 * 768.0F / (float) this.field6322;
                        for (int var41 = 0; var41 < this.field6370; var41++) {
                            int var42 = this.method3393(this.field6363[var41], this.field6294[var41], this.field6306[var41], -4137, this.field6394);
                            short var43 = this.field6330[var41];
                            float var44 = (float) (var42 >> 8 & 0xFF) * this.field6368.field2808;
                            float var45 = (float) (var42 >>> 24) * this.field6368.field2853;
                            float var46 = (float) ((var42 & 0xFF6F7C) >> 16) * this.field6368.field2866;
                            short var47 = (short) var33[var43];
                            float var48;
                            if (var47 == 0) {
                                var48 = ((float) var34[var43] * var37 + (float) var31[var43] * var36 + (float) var32[var43] * var35) * 0.0026041667F;
                            } else {
                                var48 = ((float) var34[var43] * var37 + (float) var31[var43] * var36 + (float) var32[var43] * var35) / (float) (var47 * 256);
                            }
                            float var49 = ((var48 < 0.0F) ? var40 : var39) * var48 + var38;
                            int var50 = (int) (var45 * var49);
                            int var51 = (int) (var46 * var49);
                            if (var50 < 0) {
                                var50 = 0;
                            } else if (var50 > 255) {
                                var50 = 255;
                            }
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (var51 > 255) {
                                var51 = 255;
                            }
                            int var52 = (int) (var44 * var49);
                            if (var52 < 0) {
                                var52 = 0;
                            } else if (var52 > 255) {
                                var52 = 255;
                            }
                            var12.field9945 = var7 * var43 + var9;
                            var12.method5114(arg1 ^ 0xFFFFFF52, var50);
                            var12.method5114(arg1 ^ 0xFFFFFF52, var51);
                            var12.method5114(255, var52);
                            var12.method5114(arg1 + 338, -(this.field6363[var41] & 0xFF) + 255);
                            short var53 = this.field6396[var41];
                            short var54 = (short) var33[var53];
                            float var55;
                            if (var54 == 0) {
                                var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var36 + (float) var32[var53] * var35) * 0.0026041667F;
                            } else {
                                var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var36 + (float) var32[var53] * var35) / (float) (var54 * 256);
                            }
                            float var56 = (var55 < 0.0F ? var40 : var39) * var55 + var38;
                            int var57 = (int) (var45 * var56);
                            int var58 = (int) (var46 * var56);
                            if (var57 < 0) {
                                var57 = 0;
                            } else if (var57 > 255) {
                                var57 = 255;
                            }
                            int var59 = (int) (var44 * var56);
                            if (var58 < 0) {
                                var58 = 0;
                            } else if (var58 > 255) {
                                var58 = 255;
                            }
                            if (var59 < 0) {
                                var59 = 0;
                            } else if (var59 > 255) {
                                var59 = 255;
                            }
                            var12.field9945 = var7 * var53 + var9;
                            var12.method5114(255, var57);
                            var12.method5114(255, var58);
                            var12.method5114(255, var59);
                            var12.method5114(255, 255 - (this.field6363[var41] & 0xFF));
                            short var60 = this.field6342[var41];
                            short var61 = (short) var33[var60];
                            float var62;
                            if (var61 == 0) {
                                var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var36 + (float) var32[var60] * var35) * 0.0026041667F;
                            } else {
                                var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var36 + (float) var32[var60] * var35) / (float) (var61 * 256);
                            }
                            float var63 = var38 + ((var62 < 0.0F) ? var40 : var39) * var62;
                            int var64 = (int) (var45 * var63);
                            if (var64 < 0) {
                                var64 = 0;
                            } else if (var64 > 255) {
                                var64 = 255;
                            }
                            int var65 = (int) (var46 * var63);
                            int var66 = (int) (var44 * var63);
                            if (var65 < 0) {
                                var65 = 0;
                            } else if (var65 > 255) {
                                var65 = 255;
                            }
                            var12.field9945 = var7 * var60 + var9;
                            if (var66 < 0) {
                                var66 = 0;
                            } else if (var66 > 255) {
                                var66 = 255;
                            }
                            var12.method5114(255, var64);
                            var12.method5114(255, var65);
                            var12.method5114(255, var66);
                            var12.method5114(255, 255 - (this.field6363[var41] & 0xFF));
                        }
                    } else {
                        for (int var29 = 0; var29 < this.field6370; var29++) {
                            int var30 = this.method3393(this.field6363[var29], this.field6294[var29], this.field6306[var29], -4137, this.field6394);
                            var12.field9945 = this.field6330[var29] * var7 + var9;
                            var12.method5127(var30, 26108);
                            var12.field9945 = var9 + (this.field6396[var29] * var7);
                            var12.method5127(var30, 26108);
                            var12.field9945 = this.field6342[var29] * var7 + var9;
                            var12.method5127(var30, 26108);
                        }
                    }
                }
                if (var4) {
                    short[] var67;
                    short[] var68;
                    short[] var69;
                    byte[] var70;
                    if (this.field6387 == null) {
                        var69 = this.field6334;
                        var70 = this.field6345;
                        var67 = this.field6359;
                        var68 = this.field6361;
                    } else {
                        var67 = this.field6387.field3473;
                        var68 = this.field6387.field3469;
                        var69 = this.field6387.field3471;
                        var70 = this.field6387.field3468;
                    }
                    float var71 = 3.0F / (float) this.field6322;
                    float var72 = 3.0F / (float) (this.field6322 / 2 + this.field6322);
                    var12.field9945 = var10;
                    if (this.field6368.field2842) {
                        for (int var76 = 0; var76 < this.field6384; var76++) {
                            int var77 = var70[var76] & 0xFF;
                            if (var77 == 0) {
                                var12.method2524((float) var67[var76] * var72, true);
                                var12.method2524((float) var69[var76] * var72, true);
                                var12.method2524((float) var68[var76] * var72, true);
                            } else {
                                float var78 = var71 / (float) var77;
                                var12.method2524((float) var67[var76] * var78, true);
                                var12.method2524((float) var69[var76] * var78, true);
                                var12.method2524((float) var68[var76] * var78, true);
                            }
                            var12.field9945 += var7 - 12;
                        }
                    } else {
                        for (int var73 = 0; var73 < this.field6384; var73++) {
                            int var74 = var70[var73] & 0xFF;
                            if (var74 == 0) {
                                var12.method2527(160744152, (float) var67[var73] * var72);
                                var12.method2527(160744152, (float) var69[var73] * var72);
                                var12.method2527(arg1 + 160744235, (float) var68[var73] * var72);
                            } else {
                                float var75 = var71 / (float) var74;
                                var12.method2527(160744152, (float) var67[var73] * var75);
                                var12.method2527(160744152, (float) var69[var73] * var75);
                                var12.method2527(arg1 + 160744235, (float) var68[var73] * var75);
                            }
                            var12.field9945 += var7 - 12;
                        }
                    }
                }
                if (var6) {
                    var12.field9945 = var11;
                    if (this.field6368.field2842) {
                        for (int var79 = 0; var79 < this.field6384; var79++) {
                            var12.method2524(this.field6401[var79], true);
                            var12.method2524(this.field6408[var79], true);
                            var12.field9945 += var7 - 8;
                        }
                    } else {
                        for (int var80 = 0; var80 < this.field6384; var80++) {
                            var12.method2527(160744152, this.field6401[var80]);
                            var12.method2527(arg1 ^ 0xF66B3D75, this.field6408[var80]);
                            var12.field9945 += var7 - 8;
                        }
                    }
                }
                var12.field9945 = this.field6384 * var7;
                class94 var81;
                if (arg0) {
                    if (this.field6318 == null) {
                        this.field6318 = this.field6368.method1649(var7, var12.field9945, (byte) 67, true, var12.field9996);
                    } else {
                        this.field6318.method943(var12.field9945, var7, var12.field9996, (byte) 123);
                    }
                    this.field6380 = 0;
                    var81 = this.field6318;
                } else {
                    var81 = this.field6368.method1649(var7, var12.field9945, (byte) 67, false, var12.field9996);
                    this.field6314 = true;
                }
                if (var5) {
                    this.field6413.field4326 = var81;
                    this.field6413.field4331 = var8;
                }
                if (var6) {
                    this.field6324.field4326 = var81;
                    this.field6324.field4331 = var11;
                }
                if (var3) {
                    this.field6392.field4331 = var9;
                    this.field6392.field4326 = var81;
                }
                if (var4) {
                    this.field6393.field4326 = var81;
                    this.field6393.field4331 = var10;
                }
            }
        } catch (RuntimeException var83) {
            throw class665.method4799(var83, field6418[39] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "ia", descriptor = "(SS)V", line = 1488)
    public final void method386(short arg0, short arg1) {
        try {
            for (int var3 = 0; var3 < this.field6370; var3++) {
                if (this.field6294[var3] == arg0) {
                    this.field6294[var3] = arg1;
                }
            }
            field6319++;
            if (this.field6313 != null) {
                for (int var4 = 0; var4 < this.field6410; var4++) {
                    class326 var5 = this.field6313[var4];
                    class237 var6 = this.field6407[var4];
                    var6.field3426 = class360.field5233[this.field6294[var5.field4460] & 0xFFFF] & 0xFFFFFF | var6.field3426 & 0xFF000000;
                }
            }
            if (this.field6392 != null) {
                this.field6392.field4326 = null;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field6418[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BIZ)Lka;", line = 1530)
    public final class761 method418(byte arg0, int arg1, boolean arg2) {
        try {
            field6352++;
            class435 var4;
            class435 var5;
            if (arg0 == 1) {
                var4 = this.field6368.field2868;
                var5 = this.field6368.field2838;
            } else if (arg0 == 2) {
                var4 = this.field6368.field2885;
                var5 = this.field6368.field2801;
            } else if (arg0 == 3) {
                var4 = this.field6368.field2850;
                var5 = this.field6368.field2862;
            } else if (arg0 == 4) {
                var5 = this.field6368.field2896;
                var4 = this.field6368.field2837;
            } else if (arg0 == 5) {
                var4 = this.field6368.field2820;
                var5 = this.field6368.field2895;
            } else {
                var5 = var4 = new class435(this.field6368);
            }
            return this.method3388(var5, arg1, 256, arg0 != 0, arg2, var4);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6418[34] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "()V", line = 1578)
    public final void method401() {
        try {
            field6378++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[36] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lka;IIIZ)V", line = 1589)
    public final void method391(class761 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            field6355++;
            class435 var6 = (class435) arg0;
            if (this.field6370 != 0 && var6.field6370 != 0) {
                int var7 = var6.field6344;
                int[] var8 = var6.field6339;
                int[] var9 = var6.field6375;
                int[] var10 = var6.field6321;
                short[] var11 = var6.field6359;
                short[] var12 = var6.field6334;
                short[] var13 = var6.field6361;
                byte[] var14 = var6.field6345;
                short[] var15;
                short[] var16;
                byte[] var17;
                short[] var18;
                if (this.field6387 == null) {
                    var16 = null;
                    var18 = null;
                    var15 = null;
                    var17 = null;
                } else {
                    var15 = this.field6387.field3473;
                    var16 = this.field6387.field3469;
                    var17 = this.field6387.field3468;
                    var18 = this.field6387.field3471;
                }
                byte[] var19;
                short[] var20;
                short[] var21;
                short[] var22;
                if (var6.field6387 == null) {
                    var21 = null;
                    var22 = null;
                    var19 = null;
                    var20 = null;
                } else {
                    var19 = var6.field6387.field3468;
                    var20 = var6.field6387.field3471;
                    var21 = var6.field6387.field3469;
                    var22 = var6.field6387.field3473;
                }
                int[] var23 = var6.field6351;
                short[] var24 = var6.field6409;
                if (!var6.field6414) {
                    var6.method3383((byte) -42);
                }
                short var25 = var6.field6391;
                short var26 = var6.field6365;
                short var27 = var6.field6304;
                short var28 = var6.field6305;
                short var29 = var6.field6374;
                short var30 = var6.field6347;
                for (int var31 = 0; var31 < this.field6344; var31++) {
                    int var32 = this.field6375[var31] - arg2;
                    if (var25 <= var32 && var32 <= var26) {
                        int var33 = this.field6339[var31] - arg1;
                        if (var27 <= var33 && var28 >= var33) {
                            int var34 = this.field6321[var31] - arg3;
                            if (var29 <= var34 && var30 >= var34) {
                                int var35 = -1;
                                int var36 = this.field6351[var31];
                                int var37 = this.field6351[var31 + 1];
                                for (int var38 = var36; var38 < var37; var38++) {
                                    var35 = this.field6409[var38] - 1;
                                    if (var35 == -1 || this.field6345[var35] != 0) {
                                        break;
                                    }
                                }
                                if (var35 != -1) {
                                    for (int var39 = 0; var39 < var7; var39++) {
                                        if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                            int var40 = -1;
                                            int var41 = var23[var39 + 1];
                                            int var42 = var23[var39];
                                            for (int var43 = var42; var43 < var41; var43++) {
                                                var40 = var24[var43] - 1;
                                                if (var40 == -1 || var14[var40] != 0) {
                                                    break;
                                                }
                                            }
                                            if (var40 != -1) {
                                                if (var15 == null) {
                                                    this.field6387 = new class241();
                                                    var15 = this.field6387.field3473 = class488.method3760((byte) 83, this.field6359);
                                                    var18 = this.field6387.field3471 = class488.method3760((byte) 92, this.field6334);
                                                    var16 = this.field6387.field3469 = class488.method3760((byte) 115, this.field6361);
                                                    var17 = this.field6387.field3468 = class415.method3246(false, this.field6345);
                                                }
                                                if (var22 == null) {
                                                    class241 var44 = var6.field6387 = new class241();
                                                    var22 = var44.field3473 = class488.method3760((byte) 81, var11);
                                                    var20 = var44.field3471 = class488.method3760((byte) 94, var12);
                                                    var21 = var44.field3469 = class488.method3760((byte) 117, var13);
                                                    var19 = var44.field3468 = class415.method3246(false, var14);
                                                }
                                                short var45 = this.field6359[var35];
                                                short var46 = this.field6334[var35];
                                                short var47 = this.field6361[var35];
                                                int var48 = var23[var39 + 1];
                                                byte var49 = this.field6345[var35];
                                                int var50 = var23[var39];
                                                for (int var51 = var50; var51 < var48; var51++) {
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
                                                short var53 = var11[var40];
                                                int var54 = this.field6351[var31];
                                                byte var55 = var14[var40];
                                                int var56 = this.field6351[var31 + 1];
                                                short var57 = var12[var40];
                                                short var58 = var13[var40];
                                                for (int var59 = var54; var59 < var56; var59++) {
                                                    int var60 = this.field6409[var59] - 1;
                                                    if (var60 == -1) {
                                                        break;
                                                    }
                                                    if (var17[var60] != 0) {
                                                        var15[var60] += var53;
                                                        var18[var60] += var57;
                                                        var16[var60] += var58;
                                                        var17[var60] += var55;
                                                    }
                                                }
                                                if (this.field6393 == null && this.field6392 != null) {
                                                    this.field6392.field4326 = null;
                                                }
                                                if (this.field6393 != null) {
                                                    this.field6393.field4326 = null;
                                                }
                                                if (var6.field6393 == null && var6.field6392 != null) {
                                                    var6.field6392.field4326 = null;
                                                }
                                                if (var6.field6393 != null) {
                                                    var6.field6393.field4326 = null;
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
        } catch (RuntimeException var62) {
            throw class665.method4799(var62, field6418[55] + (arg0 == null ? field6418[1] : field6418[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIIIIIII)Z", line = 1857)
    private final boolean method3386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            if (arg4 >= -127) {
                return true;
            }
            field6406++;
            if (arg2 < arg0 && arg7 > arg2 && arg5 > arg2) {
                return false;
            } else if (arg2 > arg0 && arg2 > arg7 && arg2 > arg5) {
                return false;
            } else if (arg1 < arg3 && arg1 < arg6 && arg8 > arg1) {
                return false;
            } else {
                return arg1 <= arg3 || arg1 <= arg6 || arg1 <= arg8;
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field6418[40] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "(IILs;Ls;III)V", line = 1885)
    public final void method412(int arg0, int arg1, class751 arg2, class751 arg3, int arg4, int arg5, int arg6) {
        try {
            if (!this.field6414) {
                this.method3383((byte) -42);
            }
            field6326++;
            int var8 = this.field6304 + arg4;
            int var9 = this.field6305 + arg4;
            int var10 = this.field6374 + arg6;
            int var11 = this.field6347 + arg6;
            if (arg0 != 1 && arg0 != 2 && arg0 != 3 && arg0 != 5 || var8 >= 0 && (arg2.field10690 + var9 >> arg2.field10692) < arg2.field10701 && var10 >= 0 && arg2.field10703 > arg2.field10690 + var11 >> arg2.field10692) {
                if (arg0 == 4 || arg0 == 5) {
                    if (arg3 == null) {
                        return;
                    }
                    if (var8 < 0 || arg3.field10701 <= var9 + arg3.field10690 >> arg3.field10692 || var10 < 0 || arg3.field10690 + var11 >> arg3.field10692 >= arg3.field10703) {
                        return;
                    }
                } else {
                    int var12 = var8 >> arg2.field10692;
                    int var13 = var9 + arg2.field10690 - 1 >> arg2.field10692;
                    int var14 = var10 >> arg2.field10692;
                    int var15 = var11 + arg2.field10690 - 1 >> arg2.field10692;
                    if (arg5 == arg2.method5442(var12, var14, 31844) && arg5 == arg2.method5442(var13, var14, 31844) && arg5 == arg2.method5442(var12, var15, 31844) && arg5 == arg2.method5442(var13, var15, 31844)) {
                        return;
                    }
                }
                if (arg0 == 1) {
                    for (int var16 = 0; var16 < this.field6344; var16++) {
                        this.field6375[var16] = (this.field6375[var16] + arg2.method5440((byte) 15, this.field6339[var16] + arg4, this.field6321[var16] + arg6)) - arg5;
                    }
                } else if (arg0 == 2) {
                    short var30 = this.field6391;
                    if (var30 == 0) {
                        return;
                    }
                    for (int var31 = 0; var31 < this.field6344; var31++) {
                        int var32 = (this.field6375[var31] << 16) / var30;
                        if (var32 < arg1) {
                            this.field6375[var31] += (arg1 - var32) * (arg2.method5440((byte) 15, this.field6339[var31] + arg4, this.field6321[var31] + arg6) - arg5) / arg1;
                        }
                    }
                } else if (arg0 == 3) {
                    int var26 = (arg1 & 0xFF) * 4;
                    int var27 = ((arg1 & 0xFF44) >> 8) * 4;
                    int var28 = (arg1 & 0xFFB7AF) >> 16 << 6;
                    int var29 = arg1 >> 24 & 0xFF << 6;
                    if (arg4 - (var26 >> 1) < 0 || ((var26 >> 1) + arg2.field10690 + arg4) >= (arg2.field10701 << arg2.field10692) || (arg6 - (var27 >> 1)) < 0 || (var27 >> 1) + arg6 + arg2.field10690 >= arg2.field10703 << arg2.field10692) {
                        return;
                    }
                    this.method5513(arg4, var26, arg5, arg6, var29, var28, arg2, (byte) 23, var27);
                } else if (arg0 == 4) {
                    int var17 = this.field6365 - this.field6391;
                    for (int var18 = 0; var18 < this.field6344; var18++) {
                        this.field6375[var18] = this.field6375[var18] + arg3.method5440((byte) 15, this.field6339[var18] + arg4, this.field6321[var18] + arg6) + var17 - arg5;
                    }
                } else if (arg0 == 5) {
                    int var19 = this.field6365 - this.field6391;
                    for (int var20 = 0; var20 < this.field6344; var20++) {
                        int var21 = this.field6339[var20] + arg4;
                        int var22 = this.field6321[var20] + arg6;
                        int var23 = arg2.method5440((byte) 15, var21, var22);
                        int var24 = arg3.method5440((byte) 15, var21, var22);
                        int var25 = var23 - arg1 - var24;
                        this.field6375[var20] = ((this.field6375[var20] << 8) / var19 * var25 >> 8) + var23 - arg5;
                    }
                }
                if (this.field6413 != null) {
                    this.field6413.field4326 = null;
                }
                this.field6414 = false;
            }
        } catch (RuntimeException var34) {
            throw class665.method4799(var34, field6418[10] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6418[1] : field6418[0]) + ',' + (arg3 == null ? field6418[1] : field6418[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V", line = 2049)
    private final void method3387(int arg0) {
        try {
            field6358++;
            if (this.field6314) {
                this.field6314 = false;
                if (this.field6404 == null && this.field6383 == null && this.field6313 == null && !class213.method1791(false, this.field6327, this.field6386)) {
                    boolean var2 = false;
                    boolean var3 = false;
                    boolean var4 = false;
                    if (this.field6339 != null && !class445.method3461(this.field6386, (byte) 124, this.field6327)) {
                        if (this.field6413 != null && this.field6413.field4326 == null) {
                            this.field6314 = true;
                        } else {
                            var2 = true;
                            if (!this.field6414) {
                                this.method3383((byte) -42);
                            }
                        }
                    }
                    if (this.field6375 != null && !class228.method1900(this.field6386, this.field6327, true)) {
                        if (this.field6413 != null && this.field6413.field4326 == null) {
                            this.field6314 = true;
                        } else {
                            if (!this.field6414) {
                                this.method3383((byte) -42);
                            }
                            var3 = true;
                        }
                    }
                    if (this.field6321 != null && !class678.method4868(this.field6386, this.field6327, (byte) -98)) {
                        if (this.field6413 != null && this.field6413.field4326 == null) {
                            this.field6314 = true;
                        } else {
                            var4 = true;
                            if (!this.field6414) {
                                this.method3383((byte) -42);
                            }
                        }
                    }
                    if (var4) {
                        this.field6321 = null;
                    }
                    if (var3) {
                        this.field6375 = null;
                    }
                    if (var2) {
                        this.field6339 = null;
                    }
                }
                if (this.field6409 != null && this.field6339 == null && this.field6375 == null && this.field6321 == null) {
                    this.field6351 = null;
                    this.field6409 = null;
                }
                if (this.field6345 != null && !class753.method5458((byte) 119, this.field6327, this.field6386)) {
                    if (this.field6393 == null) {
                        if (this.field6392 != null && this.field6392.field4326 == null) {
                            this.field6314 = true;
                        } else {
                            this.field6345 = null;
                            this.field6359 = this.field6334 = this.field6361 = null;
                        }
                    } else if (this.field6393.field4326 == null) {
                        this.field6314 = true;
                    } else {
                        this.field6359 = this.field6334 = this.field6361 = null;
                        this.field6345 = null;
                    }
                }
                if (this.field6294 != null && !class85.method857(this.field6327, this.field6386, arg0 - 104)) {
                    if (this.field6392 != null && this.field6392.field4326 == null) {
                        this.field6314 = true;
                    } else {
                        this.field6294 = null;
                    }
                }
                if (this.field6363 != null && !class756.method5483(this.field6327, this.field6386, true)) {
                    if (this.field6392 != null && this.field6392.field4326 == null) {
                        this.field6314 = true;
                    } else {
                        this.field6363 = null;
                    }
                }
                if (this.field6401 != null && !class344.method2760((byte) -43, this.field6327, this.field6386)) {
                    if (this.field6324 != null && this.field6324.field4326 == null) {
                        this.field6314 = true;
                    } else {
                        this.field6401 = this.field6408 = null;
                    }
                }
                if (this.field6306 != null && !class51.method555(this.field6327, this.field6386, (byte) 125)) {
                    if (this.field6392 != null && this.field6392.field4326 == null) {
                        this.field6314 = true;
                    } else {
                        this.field6306 = null;
                    }
                }
                if (this.field6330 != null && !class21.method262(this.field6327, this.field6386, (byte) -113)) {
                    if ((this.field6372 == null || this.field6372.field5790 != null) && (this.field6392 == null || this.field6392.field4326 != null)) {
                        this.field6330 = this.field6396 = this.field6342 = null;
                    } else {
                        this.field6314 = true;
                    }
                }
                if (arg0 != -10) {
                    this.method3385(false, (byte) 66);
                }
                if (this.field6308 != null && !class346.method2775((byte) 125, this.field6327, this.field6386)) {
                    this.field6308 = null;
                    this.field6309 = null;
                }
                if (this.field6301 != null && !class553.method4136(this.field6327, this.field6386, 32)) {
                    this.field6301 = null;
                    this.field6403 = null;
                }
                if (this.field6316 != null && !class118.method1076(this.field6386, this.field6327, (byte) -95)) {
                    this.field6316 = null;
                }
                if (this.field6402 != null && (this.field6327 & 0x800) == 0 && (this.field6327 & 0x40000) == 0) {
                    this.field6402 = null;
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6418[44] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "FA", descriptor = "(I)V", line = 2238)
    public final void method436(int arg0) {
        try {
            field6371++;
            int var2 = class487.field7151[arg0];
            int var3 = class487.field7150[arg0];
            for (int var4 = 0; var4 < this.field6344; var4++) {
                int var5 = this.field6375[var4] * var3 - this.field6321[var4] * var2 >> 14;
                this.field6321[var4] = this.field6375[var4] * var2 + (this.field6321[var4] * var3) >> 14;
                this.field6375[var4] = var5;
            }
            this.field6414 = false;
            if (this.field6413 != null) {
                this.field6413.field4326 = null;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6418[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "ba", descriptor = "(Lr;)Lr;", line = 2267)
    public final class412 method406(class412 arg0) {
        try {
            field6307++;
            if (this.field6384 == 0) {
                return null;
            }
            if (!this.field6414) {
                this.method3383((byte) -42);
            }
            int var2;
            int var3;
            if (this.field6368.field2903 <= 0) {
                var2 = this.field6304 - (this.field6368.field2903 * this.field6391 >> 8) >> this.field6368.field2760;
                var3 = this.field6305 - (this.field6368.field2903 * this.field6365 >> 8) >> this.field6368.field2760;
            } else {
                var2 = this.field6304 - (this.field6368.field2903 * this.field6365 >> 8) >> this.field6368.field2760;
                var3 = this.field6305 - (this.field6368.field2903 * this.field6391 >> 8) >> this.field6368.field2760;
            }
            int var4;
            int var5;
            if (this.field6368.field2843 <= 0) {
                var4 = this.field6374 - (this.field6368.field2843 * this.field6391 >> 8) >> this.field6368.field2760;
                var5 = this.field6347 - (this.field6368.field2843 * this.field6365 >> 8) >> this.field6368.field2760;
            } else {
                var4 = this.field6374 - (this.field6368.field2843 * this.field6365 >> 8) >> this.field6368.field2760;
                var5 = this.field6347 - (this.field6368.field2843 * this.field6391 >> 8) >> this.field6368.field2760;
            }
            int var6 = var3 + 1 - var2;
            int var7 = var5 + 1 - var4;
            class143 var8 = (class143) arg0;
            class143 var9;
            if (var8 != null && var8.method1238(var6, var7, (byte) 27)) {
                var9 = var8;
                var8.method1236((byte) -108);
            } else {
                var9 = new class143(this.field6368, var6, var7);
            }
            var9.method1232(var2, (byte) 5, var5, var3, var4);
            this.method3394(-83, var9);
            return var9;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field6418[16] + (arg0 == null ? field6418[1] : field6418[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "ma", descriptor = "()I", line = 2334)
    public final int method423() {
        try {
            if (!this.field6414) {
                this.method3383((byte) -42);
            }
            field6416++;
            return this.field6354;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[38] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "()V", line = 2350)
    public final void method429() {
        try {
            field6297++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[4] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lqa;)V", line = 2357)
    public final void method402(class104 arg0) {
        try {
            field6332++;
            class70 var2 = (class70) arg0;
            if (this.field6404 != null) {
                for (int var3 = 0; var3 < this.field6404.length; var3++) {
                    class510 var4 = this.field6404[var3];
                    class510 var5 = var4;
                    if (var4.field7487 != null) {
                        var5 = var4.field7487;
                    }
                    var5.field7477 = (int) ((float) this.field6321[var4.field7488] * var2.field1030 + (float) this.field6375[var4.field7488] * var2.field1005 + (float) this.field6339[var4.field7488] * var2.field1010 + var2.field996);
                    var5.field7481 = (int) ((float) this.field6321[var4.field7488] * var2.field1002 + (float) this.field6375[var4.field7488] * var2.field1027 + (float) this.field6339[var4.field7488] * var2.field1018 + var2.field1028);
                    var5.field7479 = (int) ((float) this.field6321[var4.field7488] * var2.field1001 + (float) this.field6375[var4.field7488] * var2.field1032 + (float) this.field6339[var4.field7488] * var2.field1000 + var2.field995);
                    var5.field7489 = (int) ((float) this.field6321[var4.field7482] * var2.field1030 + (float) this.field6375[var4.field7482] * var2.field1005 + (float) this.field6339[var4.field7482] * var2.field1010 + var2.field996);
                    var5.field7493 = (int) ((float) this.field6321[var4.field7482] * var2.field1002 + (float) this.field6375[var4.field7482] * var2.field1027 + (float) this.field6339[var4.field7482] * var2.field1018 + var2.field1028);
                    var5.field7494 = (int) ((float) this.field6321[var4.field7482] * var2.field1001 + (float) this.field6375[var4.field7482] * var2.field1032 + (float) this.field6339[var4.field7482] * var2.field1000 + var2.field995);
                    var5.field7492 = (int) ((float) this.field6321[var4.field7490] * var2.field1030 + (float) this.field6375[var4.field7490] * var2.field1005 + (float) this.field6339[var4.field7490] * var2.field1010 + var2.field996);
                    var5.field7478 = (int) ((float) this.field6321[var4.field7490] * var2.field1002 + (float) this.field6375[var4.field7490] * var2.field1027 + (float) this.field6339[var4.field7490] * var2.field1018 + var2.field1028);
                    var5.field7480 = (int) ((float) this.field6321[var4.field7490] * var2.field1001 + (float) this.field6375[var4.field7490] * var2.field1032 + (float) this.field6339[var4.field7490] * var2.field1000 + var2.field995);
                }
            }
            if (this.field6383 != null) {
                for (int var6 = 0; var6 < this.field6383.length; var6++) {
                    class264 var7 = this.field6383[var6];
                    class264 var8 = var7;
                    if (var7.field3728 != null) {
                        var8 = var7.field3728;
                    }
                    if (var7.field3726 == null) {
                        var7.field3726 = var2.method737();
                    } else {
                        var7.field3726.method733(var2);
                    }
                    var8.field3734 = (int) ((float) this.field6321[var7.field3730] * var2.field1030 + (float) this.field6375[var7.field3730] * var2.field1005 + (float) this.field6339[var7.field3730] * var2.field1010 + var2.field996);
                    var8.field3733 = (int) ((float) this.field6321[var7.field3730] * var2.field1002 + (float) this.field6375[var7.field3730] * var2.field1027 + (float) this.field6339[var7.field3730] * var2.field1018 + var2.field1028);
                    var8.field3727 = (int) ((float) this.field6321[var7.field3730] * var2.field1001 + (float) this.field6375[var7.field3730] * var2.field1032 + (float) this.field6339[var7.field3730] * var2.field1000 + var2.field995);
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field6418[45] + (arg0 == null ? field6418[1] : field6418[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lcea;IIZZLcea;)Lka;", line = 2422)
    private final class761 method3388(class435 arg0, int arg1, int arg2, boolean arg3, boolean arg4, class435 arg5) {
        try {
            arg0.field6394 = this.field6394;
            arg0.field6384 = this.field6384;
            arg0.field6410 = this.field6410;
            arg0.field6380 = 0;
            arg0.field6327 = arg1;
            field6300++;
            arg0.field6320 = this.field6320;
            if ((arg2 & arg1) == 0) {
                arg0.field6299 = this.field6299;
            } else {
                arg0.field6299 = true;
            }
            arg0.field6386 = this.field6386;
            arg0.field6302 = this.field6302;
            arg0.field6370 = this.field6370;
            arg0.field6322 = this.field6322;
            arg0.field6310 = this.field6310;
            arg0.field6344 = this.field6344;
            boolean var7 = class168.method1412(this.field6386, arg1, false);
            boolean var8 = class560.method4187(arg1, arg2 ^ 0xFFFFFA10, this.field6386);
            boolean var9 = class605.method4471(arg1, this.field6386, (byte) -93);
            boolean var10 = var7 | var8 | var9;
            if (var10) {
                if (!var7) {
                    arg0.field6339 = this.field6339;
                } else if (arg5.field6339 == null || this.field6320 > arg5.field6339.length) {
                    arg0.field6339 = arg5.field6339 = new int[this.field6320];
                } else {
                    arg0.field6339 = arg5.field6339;
                }
                if (!var8) {
                    arg0.field6375 = this.field6375;
                } else if (arg5.field6375 == null || arg5.field6375.length < this.field6320) {
                    arg0.field6375 = arg5.field6375 = new int[this.field6320];
                } else {
                    arg0.field6375 = arg5.field6375;
                }
                if (!var9) {
                    arg0.field6321 = this.field6321;
                } else if (arg5.field6321 == null || this.field6320 > arg5.field6321.length) {
                    arg0.field6321 = arg5.field6321 = new int[this.field6320];
                } else {
                    arg0.field6321 = arg5.field6321;
                }
                for (int var11 = 0; var11 < this.field6320; var11++) {
                    if (var7) {
                        arg0.field6339[var11] = this.field6339[var11];
                    }
                    if (var8) {
                        arg0.field6375[var11] = this.field6375[var11];
                    }
                    if (var9) {
                        arg0.field6321[var11] = this.field6321[var11];
                    }
                }
            } else {
                arg0.field6321 = this.field6321;
                arg0.field6375 = this.field6375;
                arg0.field6339 = this.field6339;
            }
            if (class669.method4817(this.field6386, (byte) 113, arg1)) {
                arg0.field6413 = arg5.field6413;
                if (arg3) {
                    arg0.field6380 = (byte) (arg0.field6380 | 0x1);
                }
                arg0.field6413.field4326 = this.field6413.field4326;
                arg0.field6413.field4331 = this.field6413.field4331;
            } else if (class496.method3818(arg1, -116, this.field6386)) {
                arg0.field6413 = this.field6413;
            } else {
                arg0.field6413 = null;
            }
            if (class462.method3551((byte) 82, arg1, this.field6386)) {
                if (arg5.field6294 == null || arg5.field6294.length < this.field6370) {
                    arg0.field6294 = arg5.field6294 = new short[this.field6370];
                } else {
                    arg0.field6294 = arg5.field6294;
                }
                for (int var12 = 0; var12 < this.field6370; var12++) {
                    arg0.field6294[var12] = this.field6294[var12];
                }
            } else {
                arg0.field6294 = this.field6294;
            }
            if (class324.method2562(arg1, 1048832, this.field6386)) {
                if (arg5.field6363 == null || this.field6370 > arg5.field6363.length) {
                    arg0.field6363 = arg5.field6363 = new byte[this.field6370];
                } else {
                    arg0.field6363 = arg5.field6363;
                }
                for (int var13 = 0; var13 < this.field6370; var13++) {
                    arg0.field6363[var13] = this.field6363[var13];
                }
            } else {
                arg0.field6363 = this.field6363;
            }
            if (class754.method5469(arg1, this.field6386, arg2 ^ 0x31F1)) {
                arg0.field6392 = arg5.field6392;
                if (arg3) {
                    arg0.field6380 = (byte) (arg0.field6380 | 0x2);
                }
                arg0.field6392.field4326 = this.field6392.field4326;
                arg0.field6392.field4331 = this.field6392.field4331;
            } else if (class151.method1284(arg1, (byte) -43, this.field6386)) {
                arg0.field6392 = this.field6392;
            } else {
                arg0.field6392 = null;
            }
            if (class639.method4653(arg1, this.field6386, arg2 ^ 0xFFFFEFC3)) {
                if (arg5.field6359 == null || this.field6384 > arg5.field6359.length) {
                    int var14 = this.field6384;
                    arg0.field6359 = arg5.field6359 = new short[var14];
                    arg0.field6361 = arg5.field6361 = new short[var14];
                    arg0.field6334 = arg5.field6334 = new short[var14];
                } else {
                    arg0.field6359 = arg5.field6359;
                    arg0.field6334 = arg5.field6334;
                    arg0.field6361 = arg5.field6361;
                }
                if (this.field6387 == null) {
                    for (int var15 = 0; var15 < this.field6384; var15++) {
                        arg0.field6359[var15] = this.field6359[var15];
                        arg0.field6334[var15] = this.field6334[var15];
                        arg0.field6361[var15] = this.field6361[var15];
                    }
                } else {
                    if (arg5.field6387 == null) {
                        arg5.field6387 = new class241();
                    }
                    class241 var16 = arg0.field6387 = arg5.field6387;
                    if (var16.field3473 == null || var16.field3473.length < this.field6384) {
                        int var17 = this.field6384;
                        var16.field3471 = new short[var17];
                        var16.field3473 = new short[var17];
                        var16.field3469 = new short[var17];
                        var16.field3468 = new byte[var17];
                    }
                    for (int var18 = 0; var18 < this.field6384; var18++) {
                        arg0.field6359[var18] = this.field6359[var18];
                        arg0.field6334[var18] = this.field6334[var18];
                        arg0.field6361[var18] = this.field6361[var18];
                        var16.field3473[var18] = this.field6387.field3473[var18];
                        var16.field3471[var18] = this.field6387.field3471[var18];
                        var16.field3469[var18] = this.field6387.field3469[var18];
                        var16.field3468[var18] = this.field6387.field3468[var18];
                    }
                }
                arg0.field6345 = this.field6345;
            } else {
                arg0.field6345 = this.field6345;
                arg0.field6387 = this.field6387;
                arg0.field6359 = this.field6359;
                arg0.field6334 = this.field6334;
                arg0.field6361 = this.field6361;
            }
            if (class375.method2967(this.field6386, arg1, 4)) {
                arg0.field6393 = arg5.field6393;
                if (arg3) {
                    arg0.field6380 = (byte) (arg0.field6380 | 0x4);
                }
                arg0.field6393.field4326 = this.field6393.field4326;
                arg0.field6393.field4331 = this.field6393.field4331;
            } else if (class322.method2548(this.field6386, arg1, -1)) {
                arg0.field6393 = this.field6393;
            } else {
                arg0.field6393 = null;
            }
            if (class398.method3116((byte) -33, this.field6386, arg1)) {
                if (arg5.field6401 == null || arg5.field6401.length < this.field6370) {
                    int var19 = this.field6384;
                    arg0.field6408 = arg5.field6408 = new float[var19];
                    arg0.field6401 = arg5.field6401 = new float[var19];
                } else {
                    arg0.field6408 = arg5.field6408;
                    arg0.field6401 = arg5.field6401;
                }
                for (int var20 = 0; var20 < this.field6384; var20++) {
                    arg0.field6401[var20] = this.field6401[var20];
                    arg0.field6408[var20] = this.field6408[var20];
                }
            } else {
                arg0.field6408 = this.field6408;
                arg0.field6401 = this.field6401;
            }
            if (class145.method1256(0, this.field6386, arg1)) {
                arg0.field6324 = arg5.field6324;
                if (arg3) {
                    arg0.field6380 = (byte) (arg0.field6380 | 0x8);
                }
                arg0.field6324.field4326 = this.field6324.field4326;
                arg0.field6324.field4331 = this.field6324.field4331;
            } else if (class222.method1861(arg1, -27943, this.field6386)) {
                arg0.field6324 = this.field6324;
            } else {
                arg0.field6324 = null;
            }
            if (class324.method2564(this.field6386, arg1, 60)) {
                if (arg5.field6330 == null || this.field6370 > arg5.field6330.length) {
                    int var21 = this.field6370;
                    arg0.field6330 = arg5.field6330 = new short[var21];
                    arg0.field6396 = arg5.field6396 = new short[var21];
                    arg0.field6342 = arg5.field6342 = new short[var21];
                } else {
                    arg0.field6330 = arg5.field6330;
                    arg0.field6396 = arg5.field6396;
                    arg0.field6342 = arg5.field6342;
                }
                for (int var22 = 0; var22 < this.field6370; var22++) {
                    arg0.field6330[var22] = this.field6330[var22];
                    arg0.field6396[var22] = this.field6396[var22];
                    arg0.field6342[var22] = this.field6342[var22];
                }
            } else {
                arg0.field6330 = this.field6330;
                arg0.field6396 = this.field6396;
                arg0.field6342 = this.field6342;
            }
            if (class67.method709(arg1, this.field6386, 3)) {
                if (arg3) {
                    arg0.field6380 = (byte) (arg0.field6380 | 0x10);
                }
                arg0.field6372 = arg5.field6372;
                arg0.field6372.field5790 = this.field6372.field5790;
            } else if (class218.method1844(true, this.field6386, arg1)) {
                arg0.field6372 = this.field6372;
            } else {
                arg0.field6372 = null;
            }
            if (class263.method2174(arg1, arg2 ^ 0x17E, this.field6386)) {
                if (arg5.field6306 == null || arg5.field6306.length < this.field6370) {
                    int var23 = this.field6370;
                    arg0.field6306 = arg5.field6306 = new short[var23];
                } else {
                    arg0.field6306 = arg5.field6306;
                }
                for (int var24 = 0; var24 < this.field6370; var24++) {
                    arg0.field6306[var24] = this.field6306[var24];
                }
            } else {
                arg0.field6306 = this.field6306;
            }
            if (!class215.method1811(this.field6386, false, arg1)) {
                arg0.field6407 = this.field6407;
            } else if (arg5.field6407 == null || this.field6410 > arg5.field6407.length) {
                int var25 = this.field6410;
                arg0.field6407 = arg5.field6407 = new class237[var25];
                for (int var26 = 0; var26 < this.field6410; var26++) {
                    arg0.field6407[var26] = this.field6407[var26].method1967(class52.method560(arg2, -322));
                }
            } else {
                arg0.field6407 = arg5.field6407;
                for (int var27 = 0; var27 < this.field6410; var27++) {
                    arg0.field6407[var27].method1966(this.field6407[var27], (byte) 59);
                }
            }
            arg0.field6316 = this.field6316;
            if (this.field6414) {
                arg0.field6374 = this.field6374;
                arg0.field6414 = true;
                arg0.field6365 = this.field6365;
                arg0.field6323 = this.field6323;
                arg0.field6391 = this.field6391;
                arg0.field6304 = this.field6304;
                arg0.field6354 = this.field6354;
                arg0.field6347 = this.field6347;
                arg0.field6305 = this.field6305;
            } else {
                arg0.field6414 = false;
            }
            arg0.field6309 = this.field6309;
            arg0.field6313 = this.field6313;
            arg0.field6383 = this.field6383;
            arg0.field6409 = this.field6409;
            arg0.field6308 = this.field6308;
            arg0.field6402 = this.field6402;
            arg0.field6301 = this.field6301;
            arg0.field6351 = this.field6351;
            arg0.field6403 = this.field6403;
            arg0.field6404 = this.field6404;
            return arg0;
        } catch (RuntimeException var29) {
            throw class665.method4799(var29, field6418[2] + (arg0 == null ? field6418[1] : field6418[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field6418[1] : field6418[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "(I)V", line = 2895)
    public final void method390(int arg0) {
        try {
            field6312++;
            int var2 = class487.field7151[arg0];
            int var3 = class487.field7150[arg0];
            for (int var4 = 0; var4 < this.field6344; var4++) {
                int var5 = this.field6321[var4] * var2 + (this.field6339[var4] * var3) >> 14;
                this.field6321[var4] = this.field6321[var4] * var3 - (this.field6339[var4] * var2) >> 14;
                this.field6339[var4] = var5;
            }
            for (int var6 = 0; var6 < this.field6384; var6++) {
                int var7 = this.field6361[var6] * var2 + this.field6359[var6] * var3 >> 14;
                this.field6361[var6] = (short) (this.field6361[var6] * var3 - (this.field6359[var6] * var2) >> 14);
                this.field6359[var6] = (short) var7;
            }
            if (this.field6393 == null && this.field6392 != null) {
                this.field6392.field4326 = null;
            }
            if (this.field6393 != null) {
                this.field6393.field4326 = null;
            }
            this.field6414 = false;
            if (this.field6413 != null) {
                this.field6413.field4326 = null;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field6418[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IILqa;ZI)Z", line = 2946)
    public final boolean method382(int arg0, int arg1, class104 arg2, boolean arg3, int arg4) {
        try {
            field6388++;
            return this.method3391(arg1, 27461, arg0, arg3, arg4, -1, arg2);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6418[60] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6418[1] : field6418[0]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "(I)V", line = 2954)
    public final void method411(int arg0) {
        try {
            field6311++;
            this.field6327 = arg0;
            if (this.field6387 != null && (this.field6327 & 0x10000) == 0) {
                this.field6345 = this.field6387.field3468;
                this.field6334 = this.field6387.field3471;
                this.field6361 = this.field6387.field3469;
                this.field6359 = this.field6387.field3473;
                this.field6387 = null;
            }
            this.field6314 = true;
            this.method3387(-10);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6418[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lqa;Lwha;I)V", line = 2976)
    public final void method415(class104 arg0, class535 arg1, int arg2) {
        try {
            field6348++;
            if (this.field6384 != 0) {
                class70 var4 = this.field6368.field2786;
                class70 var5 = (class70) arg0;
                if (!this.field6414) {
                    this.method3383((byte) -42);
                }
                class503.field7341 = var4.field1001 * var5.field995 + var4.field1032 * var5.field1028 + var4.field1000 * var5.field996 + var4.field995;
                class622.field8884 = var4.field1001 * var5.field1032 + var4.field1032 * var5.field1027 + var4.field1000 * var5.field1005;
                float var6 = (float) this.field6391 * class622.field8884 + class503.field7341;
                float var7 = (float) this.field6365 * class622.field8884 + class503.field7341;
                float var8;
                float var9;
                if ((var6 > var7)) {
                    var8 = (float) this.field6323 + var6;
                    var9 = (float) (-this.field6323) + var7;
                } else {
                    var8 = (float) this.field6323 + var7;
                    var9 = (float) (-this.field6323) + var6;
                }
                if (!(this.field6368.field2863 <= var9) && !((float) this.field6368.field2816 >= var8)) {
                    class358.field5207 = var4.field1030 * var5.field1032 + var4.field1010 * var5.field1005 + var4.field1005 * var5.field1027;
                    class80.field1127 = var4.field1030 * var5.field995 + var4.field1010 * var5.field996 + var4.field1005 * var5.field1028 + var4.field996;
                    float var10 = (float) this.field6391 * class358.field5207 + class80.field1127;
                    float var11 = (float) this.field6365 * class358.field5207 + class80.field1127;
                    float var12;
                    float var13;
                    if (var11 < var10) {
                        var12 = ((float) this.field6323 + var10) * (float) this.field6368.field2796;
                        var13 = (var11 - (float) this.field6323) * (float) this.field6368.field2796;
                    } else {
                        var12 = ((float) this.field6323 + var11) * (float) this.field6368.field2796;
                        var13 = ((float) (-this.field6323) + var10) * (float) this.field6368.field2796;
                    }
                    if (!(var13 / var8 >= this.field6368.field2854) && !(var12 / var8 <= this.field6368.field2804)) {
                        class15.field199 = var4.field1002 * var5.field995 + var4.field1027 * var5.field1028 + var4.field1018 * var5.field996 + var4.field1028;
                        class502.field7336 = var4.field1002 * var5.field1032 + var4.field1027 * var5.field1027 + var4.field1018 * var5.field1005;
                        float var14 = (float) this.field6391 * class502.field7336 + class15.field199;
                        float var15 = (float) this.field6365 * class502.field7336 + class15.field199;
                        float var16;
                        float var17;
                        if ((var14 > var15)) {
                            var17 = ((float) this.field6323 + var14) * (float) this.field6368.field2886;
                            var16 = (var15 - (float) this.field6323) * (float) this.field6368.field2886;
                        } else {
                            var16 = ((float) (-this.field6323) + var14) * (float) this.field6368.field2886;
                            var17 = ((float) this.field6323 + var15) * (float) this.field6368.field2886;
                        }
                        if (!(this.field6368.field2864 <= var16 / var8) && !(this.field6368.field2865 >= var17 / var8)) {
                            if (arg1 != null || this.field6313 != null) {
                                class204.field3003 = var4.field1001 * var5.field1001 + var4.field1032 * var5.field1002 + var4.field1000 * var5.field1030;
                                class26.field325 = var4.field1002 * var5.field1000 + var4.field1027 * var5.field1018 + var4.field1018 * var5.field1010;
                                class717.field10234 = var4.field1030 * var5.field1001 + var4.field1010 * var5.field1030 + var4.field1005 * var5.field1002;
                                class634.field8997 = var4.field1030 * var5.field1000 + var4.field1010 * var5.field1010 + var4.field1005 * var5.field1018;
                                class210.field3060 = var4.field1001 * var5.field1000 + var4.field1032 * var5.field1018 + var4.field1000 * var5.field1010;
                                class756.field10811 = var4.field1002 * var5.field1001 + var4.field1027 * var5.field1002 + var4.field1018 * var5.field1030;
                            }
                            if (arg1 != null) {
                                boolean var18 = false;
                                boolean var19 = true;
                                int var20 = this.field6304 + this.field6305 >> 1;
                                int var21 = this.field6374 + this.field6347 >> 1;
                                int var22 = (int) ((float) var21 * class717.field10234 + (float) this.field6391 * class358.field5207 + (float) var20 * class634.field8997 + class80.field1127);
                                int var23 = (int) ((float) var21 * class756.field10811 + (float) this.field6391 * class502.field7336 + (float) var20 * class26.field325 + class15.field199);
                                int var24 = (int) ((float) var21 * class204.field3003 + (float) this.field6391 * class622.field8884 + (float) var20 * class210.field3060 + class503.field7341);
                                if (this.field6368.field2816 > var24) {
                                    var18 = true;
                                } else {
                                    arg1.field7766 = this.field6368.field2796 * var22 / var24 + this.field6368.field2848;
                                    arg1.field7764 = this.field6368.field2886 * var23 / var24 + this.field6368.field2811;
                                }
                                int var25 = (int) ((float) var21 * class717.field10234 + (float) this.field6365 * class358.field5207 + (float) var20 * class634.field8997 + class80.field1127);
                                int var26 = (int) ((float) var21 * class756.field10811 + (float) this.field6365 * class502.field7336 + (float) var20 * class26.field325 + class15.field199);
                                int var27 = (int) ((float) var21 * class204.field3003 + (float) this.field6365 * class622.field8884 + (float) var20 * class210.field3060 + class503.field7341);
                                if (var27 < this.field6368.field2816) {
                                    var18 = true;
                                } else {
                                    arg1.field7767 = this.field6368.field2796 * var25 / var27 + this.field6368.field2848;
                                    arg1.field7768 = this.field6368.field2886 * var26 / var27 + this.field6368.field2811;
                                }
                                if (var18) {
                                    if (this.field6368.field2816 > var24 && this.field6368.field2816 > var27) {
                                        var19 = false;
                                    } else if (var24 < this.field6368.field2816) {
                                        int var28 = (var27 - this.field6368.field2816 << 16) / (var27 - var24);
                                        int var29 = ((var25 - var22) * var28 >> 16) + var25;
                                        int var30 = ((var26 - var23) * var28 >> 16) + var26;
                                        arg1.field7766 = this.field6368.field2848 + (this.field6368.field2796 * var29 / this.field6368.field2816);
                                        arg1.field7764 = this.field6368.field2886 * var30 / this.field6368.field2816 + this.field6368.field2811;
                                    } else if (this.field6368.field2816 > var27) {
                                        int var31 = (var24 - this.field6368.field2816 << 16) / (var24 - var27);
                                        int var32 = ((var22 - var25) * var31 >> 16) + var22;
                                        int var33 = ((var23 - var26) * var31 >> 16) + var23;
                                        arg1.field7766 = this.field6368.field2848 + (this.field6368.field2796 * var32 / this.field6368.field2816);
                                        arg1.field7764 = this.field6368.field2886 * var33 / this.field6368.field2816 + this.field6368.field2811;
                                    }
                                }
                                if (var19) {
                                    if (var24 > var27) {
                                        arg1.field7765 = this.field6368.field2848 + ((this.field6323 + var22) * this.field6368.field2796 / var24) - arg1.field7766;
                                    } else {
                                        arg1.field7765 = (this.field6323 + var25) * this.field6368.field2796 / var27 + this.field6368.field2848 - arg1.field7767;
                                    }
                                    arg1.field7769 = true;
                                }
                            }
                            this.field6368.method1636(1);
                            this.field6368.method1677(var5, 0);
                            this.method3396(0);
                            this.field6368.method1656((byte) 87);
                            this.method3397((byte) -116);
                        }
                    }
                }
            }
        } catch (RuntimeException var35) {
            throw class665.method4799(var35, field6418[26] + (arg0 == null ? field6418[1] : field6418[0]) + ',' + (arg1 == null ? field6418[1] : field6418[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "()V", line = 3184)
    public final void method403() {
        try {
            field6343++;
            if (this.field6384 > 0 && this.field6310 > 0) {
                this.method3385(false, (byte) -83);
                if ((this.field6380 & 0x10) == 0 && this.field6372.field5790 == null) {
                    this.method3390(false, (byte) 31);
                }
                this.method3387(-10);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[9] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IB)Lvo;", line = 3201)
    public static final class782 method3389(int arg0, byte arg1) {
        try {
            field6412++;
            int var2 = arg0 >> 16;
            int var3 = arg0 & 0xFFFF;
            if (class9.field117[var2] == null || class9.field117[var2][var3] == null) {
                boolean var4 = class314.method2496(var2, (byte) -31);
                if (!var4) {
                    return null;
                }
            }
            if (arg1 > -113) {
                method3389(-50, (byte) 33);
            }
            return class9.field117[var2][var3];
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6418[48] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "()V", line = 3231)
    public final void method379() {
        try {
            field6379++;
            for (int var1 = 0; var1 < this.field6344; var1++) {
                this.field6321[var1] = -this.field6321[var1];
            }
            for (int var2 = 0; var2 < this.field6384; var2++) {
                this.field6361[var2] = (short) (-this.field6361[var2]);
            }
            for (int var3 = 0; var3 < this.field6370; var3++) {
                short var4 = this.field6330[var3];
                this.field6330[var3] = this.field6342[var3];
                this.field6342[var3] = var4;
            }
            if (this.field6393 == null && this.field6392 != null) {
                this.field6392.field4326 = null;
            }
            if (this.field6393 != null) {
                this.field6393.field4326 = null;
            }
            if (this.field6413 != null) {
                this.field6413.field4326 = null;
            }
            if (this.field6372 != null) {
                this.field6372.field5790 = null;
            }
            this.field6414 = false;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6418[62] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "F", descriptor = "()Z", line = 3283)
    public final boolean method422() {
        try {
            field6346++;
            return this.field6299;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[7] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIII)V", line = 3291)
    public final void method398(int arg0, int arg1, int arg2, int arg3) {
        try {
            for (int var5 = 0; var5 < this.field6370; var5++) {
                int var6 = this.field6294[var5] & 0xFFFF;
                int var7 = (var6 & 0xFFEA) >> 10;
                int var8 = var6 >> 7 & 0x7;
                int var9 = var6 & 0x7F;
                if (arg0 != -1) {
                    var7 += (arg0 - var7) * arg3 >> 7;
                }
                if (arg1 != -1) {
                    var8 += (arg1 - var8) * arg3 >> 7;
                }
                if (arg2 != -1) {
                    var9 -= -((arg2 - var9) * arg3 >> 7);
                }
                this.field6294[var5] = (short) class10.method71(var9, class10.method71(var7 << 10, var8 << 7));
            }
            field6360++;
            if (this.field6313 != null) {
                for (int var10 = 0; var10 < this.field6410; var10++) {
                    class326 var11 = this.field6313[var10];
                    class237 var12 = this.field6407[var10];
                    var12.field3426 = class360.field5233[this.field6294[var11.field4460] & 0xFFFF] & 0xFFFFFF | var12.field3426 & 0xFF000000;
                }
            }
            if (this.field6392 != null) {
                this.field6392.field4326 = null;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field6418[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "H", descriptor = "(III)V", line = 3348)
    public final void method430(int arg0, int arg1, int arg2) {
        try {
            for (int var4 = 0; var4 < this.field6344; var4++) {
                if (arg0 != 0) {
                    this.field6339[var4] += arg0;
                }
                if (arg1 != 0) {
                    this.field6375[var4] += arg1;
                }
                if (arg2 != 0) {
                    this.field6321[var4] += arg2;
                }
            }
            field6397++;
            this.field6414 = false;
            if (this.field6413 != null) {
                this.field6413.field4326 = null;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6418[66] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(ZB)V", line = 3381)
    private final void method3390(boolean arg0, byte arg1) {
        try {
            field6385++;
            if ((this.field6310 * 6) <= this.field6368.field2890.field9996.length) {
                this.field6368.field2890.field9945 = 0;
            } else {
                this.field6368.field2890 = new class318(this.field6310 * 6 + 600);
            }
            class318 var3 = this.field6368.field2890;
            if (this.field6368.field2842) {
                for (int var4 = 0; var4 < this.field6310; var4++) {
                    var3.method5138((byte) -113, this.field6330[var4]);
                    var3.method5138((byte) -102, this.field6396[var4]);
                    var3.method5138((byte) -120, this.field6342[var4]);
                }
            } else {
                for (int var5 = 0; var5 < this.field6310; var5++) {
                    var3.method5106(this.field6330[var5], -71);
                    var3.method5106(this.field6396[var5], -108);
                    var3.method5106(this.field6342[var5], -119);
                }
            }
            int var6 = 11 / ((arg1 + 52) / 38);
            if (var3.field9945 != 0) {
                if (arg0) {
                    if (this.field6333 == null) {
                        this.field6333 = this.field6368.method1612(var3.field9945, true, 5123, true, var3.field9996);
                    } else {
                        this.field6333.method1507(var3.field9945, -32534, 5123, var3.field9996);
                    }
                    this.field6372.field5790 = this.field6333;
                } else {
                    this.field6372.field5790 = this.field6368.method1612(var3.field9945, false, 5123, true, var3.field9996);
                }
                if (!arg0) {
                    this.field6314 = true;
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field6418[51] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIZIILqa;)Z", line = 3460)
    private final boolean method3391(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class104 arg6) {
        try {
            field6295++;
            class70 var8 = (class70) arg6;
            class70 var9 = this.field6368.field2786;
            float var10 = var8.field995 * var9.field1030 + var8.field996 * var9.field1010 + var8.field1028 * var9.field1005 + var9.field996;
            float var11 = var8.field995 * var9.field1002 + var8.field996 * var9.field1018 + var8.field1028 * var9.field1027 + var9.field1028;
            float var12 = var8.field995 * var9.field1001 + var8.field996 * var9.field1000 + var8.field1028 * var9.field1032 + var9.field995;
            class358.field5207 = var8.field1032 * var9.field1030 + var8.field1027 * var9.field1005 + var8.field1005 * var9.field1010;
            class622.field8884 = var8.field1032 * var9.field1001 + var8.field1027 * var9.field1032 + var8.field1005 * var9.field1000;
            class26.field325 = var8.field1000 * var9.field1002 + var8.field1018 * var9.field1027 + var8.field1010 * var9.field1018;
            class717.field10234 = var8.field1001 * var9.field1030 + var8.field1030 * var9.field1010 + var8.field1002 * var9.field1005;
            class756.field10811 = var8.field1001 * var9.field1002 + var8.field1030 * var9.field1018 + var8.field1002 * var9.field1027;
            class204.field3003 = var8.field1001 * var9.field1001 + var8.field1030 * var9.field1000 + var8.field1002 * var9.field1032;
            class634.field8997 = var8.field1000 * var9.field1030 + var8.field1018 * var9.field1005 + var8.field1010 * var9.field1010;
            class502.field7336 = var8.field1032 * var9.field1002 + var8.field1027 * var9.field1027 + var8.field1005 * var9.field1018;
            class210.field3060 = var8.field1000 * var9.field1001 + var8.field1018 * var9.field1032 + var8.field1010 * var9.field1000;
            boolean var13 = false;
            if (arg1 != 27461) {
                return false;
            }
            float var14 = Float.MAX_VALUE;
            float var15 = -3.4028235E38F;
            float var16 = Float.MAX_VALUE;
            float var17 = -3.4028235E38F;
            int var18 = this.field6368.field2796;
            int var19 = this.field6368.field2886;
            if (!this.field6414) {
                this.method3383((byte) -42);
            }
            int var20 = this.field6305 - this.field6304 >> 1;
            int var21 = this.field6365 - this.field6391 >> 1;
            int var22 = this.field6347 - this.field6374 >> 1;
            int var23 = this.field6304 + var20;
            int var24 = this.field6391 + var21;
            int var25 = this.field6374 + var22;
            int var26 = var23 - (var20 << arg4);
            int var27 = var24 - (var21 << arg4);
            int var28 = var25 - (var22 << arg4);
            int var29 = var23 + (var20 << arg4);
            int var30 = (var21 << arg4) + var24;
            class557.field8114[0] = var26;
            int var31 = (var22 << arg4) + var25;
            class425.field6125[0] = var27;
            class557.field8114[1] = var29;
            class136.field1753[0] = var28;
            class425.field6125[1] = var27;
            class557.field8114[2] = var26;
            class136.field1753[1] = var28;
            class425.field6125[2] = var30;
            class557.field8114[3] = var29;
            class136.field1753[2] = var28;
            class425.field6125[3] = var30;
            class136.field1753[3] = var28;
            class557.field8114[4] = var26;
            class425.field6125[4] = var27;
            class557.field8114[5] = var29;
            class136.field1753[4] = var31;
            class425.field6125[5] = var27;
            class136.field1753[5] = var31;
            class557.field8114[6] = var26;
            class425.field6125[6] = var30;
            class557.field8114[7] = var29;
            class136.field1753[6] = var31;
            class425.field6125[7] = var30;
            class136.field1753[7] = var31;
            for (int var32 = 0; var32 < 8; var32++) {
                float var33 = (float) class557.field8114[var32];
                float var34 = (float) class136.field1753[var32];
                float var35 = (float) class425.field6125[var32];
                float var36 = class717.field10234 * var34 + class634.field8997 * var33 + class358.field5207 * var35 + var10;
                float var37 = class204.field3003 * var34 + class622.field8884 * var35 + class210.field3060 * var33 + var12;
                float var38 = class756.field10811 * var34 + class502.field7336 * var35 + class26.field325 * var33 + var11;
                if ((float) this.field6368.field2816 <= var37) {
                    if (arg5 > 0) {
                        var37 = arg5;
                    }
                    float var39 = (float) var18 * var36 / var37 + (float) this.field6368.field2848;
                    if (var39 < var14) {
                        var14 = var39;
                    }
                    float var40 = (float) var19 * var38 / var37 + (float) this.field6368.field2811;
                    if (var15 < var39) {
                        var15 = var39;
                    }
                    if (var17 < var40) {
                        var17 = var40;
                    }
                    var13 = true;
                    if (var40 < var16) {
                        var16 = var40;
                    }
                }
            }
            if (var13 && var14 < (float) arg2 && var15 > (float) arg2 && (float) arg0 > var16 && var17 > (float) arg0) {
                if (arg3) {
                    return true;
                }
                if (this.field6384 > this.field6368.field2907.length) {
                    this.field6368.field2907 = new int[this.field6384];
                    this.field6368.field2908 = new int[this.field6384];
                }
                int[] var41 = this.field6368.field2907;
                int[] var42 = this.field6368.field2908;
                for (int var43 = 0; var43 < this.field6344; var43++) {
                    float var44 = (float) this.field6339[var43];
                    float var45 = (float) this.field6321[var43];
                    float var46 = (float) this.field6375[var43];
                    float var47 = class204.field3003 * var45 + class622.field8884 * var46 + class210.field3060 * var44 + var12;
                    float var48 = class756.field10811 * var45 + class502.field7336 * var46 + class26.field325 * var44 + var11;
                    float var49 = class717.field10234 * var45 + class634.field8997 * var44 + class358.field5207 * var46 + var10;
                    if ((float) this.field6368.field2816 <= var47) {
                        if (arg5 > 0) {
                            var47 = arg5;
                        }
                        int var50 = (int) ((float) var18 * var49 / var47 + (float) this.field6368.field2848);
                        int var51 = (int) ((float) var19 * var48 / var47 + (float) this.field6368.field2811);
                        int var52 = this.field6351[var43];
                        int var53 = this.field6351[var43 + 1];
                        for (int var54 = var52; var54 < var53; var54++) {
                            int var55 = this.field6409[var54] - 1;
                            if (var55 == -1) {
                                break;
                            }
                            var41[var55] = var50;
                            var42[var55] = var51;
                        }
                    } else {
                        int var56 = this.field6351[var43];
                        int var57 = this.field6351[var43 + 1];
                        for (int var58 = var56; var58 < var57; var58++) {
                            int var59 = this.field6409[var58] - 1;
                            if (var59 == -1) {
                                break;
                            }
                            var41[this.field6409[var58] - 1] = -999999;
                        }
                    }
                }
                for (int var60 = 0; var60 < this.field6370; var60++) {
                    if (var41[this.field6330[var60]] != -999999 && var41[this.field6396[var60]] != -999999 && var41[this.field6342[var60]] != -999999 && this.method3386(var42[this.field6330[var60]], arg2, arg0, var41[this.field6330[var60]], -128, var42[this.field6342[var60]], var41[this.field6396[var60]], var42[this.field6396[var60]], var41[this.field6342[var60]])) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var62) {
            throw class665.method4799(var62, field6418[43] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field6418[1] : field6418[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "()[Liia;", line = 3709)
    public final class264[] method413() {
        try {
            field6417++;
            return this.field6383;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[65] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "P", descriptor = "(IIII)V", line = 3720)
    public final void method394(int arg0, int arg1, int arg2, int arg3) {
        try {
            field6337++;
            if (arg0 == 0) {
                class508.field7460 = 0;
                int var5 = 0;
                class576.field8325 = 0;
                class74.field1068 = 0;
                for (int var6 = 0; var6 < this.field6344; var6++) {
                    class74.field1068 += this.field6339[var6];
                    class508.field7460 += this.field6375[var6];
                    var5++;
                    class576.field8325 += this.field6321[var6];
                }
                if (var5 > 0) {
                    class576.field8325 = class576.field8325 / var5 + arg3;
                    class74.field1068 = class74.field1068 / var5 + arg1;
                    class508.field7460 = class508.field7460 / var5 + arg2;
                } else {
                    class508.field7460 = arg2;
                    class576.field8325 = arg3;
                    class74.field1068 = arg1;
                }
            } else if (arg0 == 1) {
                for (int var7 = 0; var7 < this.field6344; var7++) {
                    this.field6339[var7] += arg1;
                    this.field6375[var7] += arg2;
                    this.field6321[var7] += arg3;
                }
            } else if (arg0 == 2) {
                for (int var8 = 0; var8 < this.field6344; var8++) {
                    this.field6339[var8] -= class74.field1068;
                    this.field6375[var8] -= class508.field7460;
                    this.field6321[var8] -= class576.field8325;
                    if (arg3 != 0) {
                        int var9 = class487.field7151[arg3];
                        int var10 = class487.field7150[arg3];
                        int var11 = this.field6375[var8] * var9 + this.field6339[var8] * var10 + 16383 >> 14;
                        this.field6375[var8] = this.field6375[var8] * var10 + 16383 - this.field6339[var8] * var9 >> 14;
                        this.field6339[var8] = var11;
                    }
                    if (arg1 != 0) {
                        int var12 = class487.field7151[arg1];
                        int var13 = class487.field7150[arg1];
                        int var14 = this.field6375[var8] * var13 + 16383 - this.field6321[var8] * var12 >> 14;
                        this.field6321[var8] = this.field6375[var8] * var12 + (this.field6321[var8] * var13) + 16383 >> 14;
                        this.field6375[var8] = var14;
                    }
                    if (arg2 != 0) {
                        int var15 = class487.field7151[arg2];
                        int var16 = class487.field7150[arg2];
                        int var17 = this.field6339[var8] * var16 + this.field6321[var8] * var15 + 16383 >> 14;
                        this.field6321[var8] = this.field6321[var8] * var16 + 16383 - (this.field6339[var8] * var15) >> 14;
                        this.field6339[var8] = var17;
                    }
                    this.field6339[var8] += class74.field1068;
                    this.field6375[var8] += class508.field7460;
                    this.field6321[var8] += class576.field8325;
                }
            } else if (arg0 == 3) {
                for (int var18 = 0; var18 < this.field6344; var18++) {
                    this.field6339[var18] -= class74.field1068;
                    this.field6375[var18] -= class508.field7460;
                    this.field6321[var18] -= class576.field8325;
                    this.field6339[var18] = this.field6339[var18] * arg1 / 128;
                    this.field6375[var18] = this.field6375[var18] * arg2 / 128;
                    this.field6321[var18] = this.field6321[var18] * arg3 / 128;
                    this.field6339[var18] += class74.field1068;
                    this.field6375[var18] += class508.field7460;
                    this.field6321[var18] += class576.field8325;
                }
            } else if (arg0 == 5) {
                for (int var19 = 0; var19 < this.field6370; var19++) {
                    int var20 = (this.field6363[var19] & 0xFF) + (arg1 * 8);
                    if (var20 < 0) {
                        var20 = 0;
                    } else if (var20 > 255) {
                        var20 = 255;
                    }
                    this.field6363[var19] = (byte) var20;
                }
                if (this.field6392 != null) {
                    this.field6392.field4326 = null;
                }
                if (this.field6313 != null) {
                    for (int var21 = 0; var21 < this.field6410; var21++) {
                        class326 var22 = this.field6313[var21];
                        class237 var23 = this.field6407[var21];
                        var23.field3426 = 255 - (this.field6363[var22.field4460] & 0xFF) << 24 | var23.field3426 & 0xFFFFFF;
                    }
                }
            } else if (arg0 == 7) {
                for (int var24 = 0; var24 < this.field6370; var24++) {
                    int var25 = this.field6294[var24] & 0xFFFF;
                    int var26 = var25 >> 10 & 0x3F;
                    int var27 = var25 >> 7 & 0x7;
                    int var28 = arg2 / 4 + var27;
                    int var29 = var25 & 0x7F;
                    int var30 = arg1 + var26 & 0x3F;
                    if (var28 < 0) {
                        var28 = 0;
                    } else if (var28 > 7) {
                        var28 = 7;
                    }
                    int var31 = arg3 + var29;
                    if (var31 < 0) {
                        var31 = 0;
                    } else if (var31 > 127) {
                        var31 = 127;
                    }
                    this.field6294[var24] = (short) class10.method71(class10.method71(var28 << 7, var30 << 10), var31);
                }
                if (this.field6392 != null) {
                    this.field6392.field4326 = null;
                }
                if (this.field6313 != null) {
                    for (int var32 = 0; var32 < this.field6410; var32++) {
                        class326 var33 = this.field6313[var32];
                        class237 var34 = this.field6407[var32];
                        var34.field3426 = var34.field3426 & 0xFF000000 | class360.field5233[this.field6294[var33.field4460] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            } else if (arg0 == 8) {
                for (int var35 = 0; var35 < this.field6410; var35++) {
                    class237 var36 = this.field6407[var35];
                    var36.field3422 += arg1;
                    var36.field3434 += arg2;
                }
            } else if (arg0 == 10) {
                for (int var37 = 0; var37 < this.field6410; var37++) {
                    class237 var38 = this.field6407[var37];
                    var38.field3429 = var38.field3429 * arg1 >> 7;
                    var38.field3433 = var38.field3433 * arg2 >> 7;
                }
            } else if (arg0 == 9) {
                for (int var39 = 0; var39 < this.field6410; var39++) {
                    class237 var40 = this.field6407[var39];
                    var40.field3424 = var40.field3424 + arg1 & 0x3FFF;
                }
            }
        } catch (RuntimeException var42) {
            throw class665.method4799(var42, field6418[30] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "da", descriptor = "()I", line = 4025)
    public final int method384() {
        try {
            field6390++;
            return this.field6322;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[58] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "()Z", line = 4035)
    public final boolean method431() {
        try {
            field6303++;
            if (this.field6306 == null) {
                return true;
            }
            for (int var1 = 0; var1 < this.field6306.length; var1++) {
                if (this.field6306[var1] != -1 && !this.field6368.field237.method4504(this.field6306[var1], -31410)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6418[20] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lrha;IFBIIFIIJ)S", line = 4058)
    private final short method3392(class60 arg0, int arg1, float arg2, byte arg3, int arg4, int arg5, float arg6, int arg7, int arg8, long arg9) {
        try {
            field6340++;
            int var12 = this.field6351[arg1];
            int var13 = this.field6351[arg1 + 1];
            int var14 = 0;
            int var15 = var12;
            if (arg3 > -39) {
                this.method418((byte) 63, 43, false);
            }
            while (var13 > var15) {
                short var16 = this.field6409[var15];
                if (var16 == 0) {
                    var14 = var15;
                    break;
                }
                if (class212.field3120[var15] == arg9) {
                    return (short) (var16 - 1);
                }
                var15++;
            }
            this.field6409[var14] = (short) (this.field6384 + 1);
            class212.field3120[var14] = arg9;
            this.field6359[this.field6384] = (short) arg7;
            this.field6334[this.field6384] = (short) arg4;
            this.field6361[this.field6384] = (short) arg5;
            this.field6345[this.field6384] = (byte) arg8;
            this.field6401[this.field6384] = arg6;
            this.field6408[this.field6384] = arg2;
            return (short) (this.field6384++);
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field6418[24] + (arg0 == null ? field6418[1] : field6418[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "LA", descriptor = "(I)V", line = 4104)
    public final void method439(int arg0) {
        try {
            field6298++;
            this.field6322 = (short) arg0;
            if (this.field6392 != null) {
                this.field6392.field4326 = null;
            }
            if (this.field6393 != null) {
                this.field6393.field4326 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6418[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BISII)I", line = 4127)
    private final int method3393(byte arg0, int arg1, short arg2, int arg3, int arg4) {
        try {
            field6399++;
            if (arg3 != -4137) {
                this.method379();
            }
            int var6 = class360.field5233[class201.method1727(arg1, -116, arg4)];
            if (arg2 != -1) {
                class684 var7 = this.field6368.field237.method4500(arg3 ^ 0x4C70, arg2 & 0xFFFF);
                int var8 = var7.field9589 & 0xFF;
                if (var8 != 0) {
                    int var9;
                    if (arg4 < 0) {
                        var9 = 0;
                    } else if (arg4 > 127) {
                        var9 = 16777215;
                    } else {
                        var9 = arg4 * 131586;
                    }
                    if (var8 == 256) {
                        var6 = var9;
                    } else {
                        int var11 = 256 - var8;
                        var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) >> 8;
                    }
                }
                int var12 = var7.field9602 & 0xFF;
                if (var12 != 0) {
                    var12 += 256;
                    int var13 = ((var6 & 0xFF0000) >> 16) * var12;
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
                    var6 = ((var13 & 0x6100FF00) << 8) + (var14 & 0xFF00) + (var15 >> 8);
                }
            }
            return (var6 << 8) - ((arg0 & 0xFF) - 255);
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field6418[61] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "()[Lkw;", line = 4200)
    public final class510[] method426() {
        try {
            field6382++;
            return this.field6404;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[52] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "C", descriptor = "(I)V", line = 4211)
    public final void method409(int arg0) {
        try {
            this.field6394 = (short) arg0;
            field6400++;
            if (this.field6392 != null) {
                this.field6392.field4326 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6418[50] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "O", descriptor = "(III)V", line = 4233)
    public final void method392(int arg0, int arg1, int arg2) {
        try {
            for (int var4 = 0; var4 < this.field6344; var4++) {
                if (arg0 != 128) {
                    this.field6339[var4] = this.field6339[var4] * arg0 >> 7;
                }
                if (arg1 != 128) {
                    this.field6375[var4] = this.field6375[var4] * arg1 >> 7;
                }
                if (arg2 != 128) {
                    this.field6321[var4] = this.field6321[var4] * arg2 >> 7;
                }
            }
            field6366++;
            this.field6414 = false;
            if (this.field6413 != null) {
                this.field6413.field4326 = null;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6418[56] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILsc;)V", line = 4269)
    private final void method3394(int arg0, class143 arg1) {
        try {
            if (this.field6368.field2907.length < this.field6384) {
                this.field6368.field2908 = new int[this.field6384];
                this.field6368.field2907 = new int[this.field6384];
            }
            field6395++;
            int[] var3 = this.field6368.field2907;
            int[] var4 = this.field6368.field2908;
            for (int var5 = 0; var5 < this.field6344; var5++) {
                int var6 = (this.field6339[var5] - (this.field6375[var5] * this.field6368.field2903 >> 8) >> this.field6368.field2760) - arg1.field1859;
                int var7 = (this.field6321[var5] - (this.field6375[var5] * this.field6368.field2843 >> 8) >> this.field6368.field2760) - arg1.field1850;
                int var8 = this.field6351[var5];
                int var9 = this.field6351[var5 + 1];
                for (int var10 = var8; var10 < var9; var10++) {
                    int var11 = this.field6409[var10] - 1;
                    if (var11 == -1) {
                        break;
                    }
                    var3[var11] = var6;
                    var4[var11] = var7;
                }
            }
            if (arg0 >= -60) {
                this.method424();
            }
            for (int var12 = 0; var12 < this.field6310; var12++) {
                if (this.field6363 == null || this.field6363[var12] <= 128) {
                    short var13 = this.field6330[var12];
                    short var14 = this.field6396[var12];
                    short var15 = this.field6342[var12];
                    int var16 = var3[var13];
                    int var17 = var3[var14];
                    int var18 = var3[var15];
                    int var19 = var4[var13];
                    int var20 = var4[var14];
                    int var21 = var4[var15];
                    if ((var16 - var17) * (var20 - var21) - ((var18 - var17) * (var20 - var19)) > 0) {
                        arg1.method1235(var16, var18, 1895170224, var20, var17, var19, var21);
                    }
                }
            }
        } catch (RuntimeException var23) {
            throw class665.method4799(var23, field6418[54] + arg0 + ',' + (arg1 == null ? field6418[1] : field6418[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "na", descriptor = "()I", line = 4359)
    public final int method377() {
        try {
            field6349++;
            if (!this.field6414) {
                this.method3383((byte) -42);
            }
            return this.field6323;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[29] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lqa;Lwha;II)V", line = 4371)
    public final void method427(class104 arg0, class535 arg1, int arg2, int arg3) {
        try {
            field6357++;
            if (this.field6384 != 0) {
                class70 var5 = this.field6368.field2786;
                class70 var6 = (class70) arg0;
                if (!this.field6414) {
                    this.method3383((byte) -42);
                }
                class503.field7341 = var5.field1001 * var6.field995 + var5.field1032 * var6.field1028 + var5.field1000 * var6.field996 + var5.field995;
                class622.field8884 = var5.field1001 * var6.field1032 + var5.field1032 * var6.field1027 + var5.field1000 * var6.field1005;
                float var7 = (float) this.field6391 * class622.field8884 + class503.field7341;
                float var8 = (float) this.field6365 * class622.field8884 + class503.field7341;
                float var9;
                float var10;
                if ((var7 > var8)) {
                    var9 = var8 - (float) this.field6323;
                    var10 = (float) this.field6323 + var7;
                } else {
                    var9 = var7 - (float) this.field6323;
                    var10 = (float) this.field6323 + var8;
                }
                if (!(var9 >= this.field6368.field2834) && !(var10 <= (float) this.field6368.field2816)) {
                    class358.field5207 = var5.field1030 * var6.field1032 + var5.field1010 * var6.field1005 + var5.field1005 * var6.field1027;
                    class80.field1127 = var5.field1030 * var6.field995 + var5.field1010 * var6.field996 + var5.field1005 * var6.field1028 + var5.field996;
                    float var11 = (float) this.field6391 * class358.field5207 + class80.field1127;
                    float var12 = (float) this.field6365 * class358.field5207 + class80.field1127;
                    float var13;
                    float var14;
                    if ((var11 > var12)) {
                        var13 = (var12 - (float) this.field6323) * (float) this.field6368.field2796;
                        var14 = ((float) this.field6323 + var11) * (float) this.field6368.field2796;
                    } else {
                        var13 = (var11 - (float) this.field6323) * (float) this.field6368.field2796;
                        var14 = ((float) this.field6323 + var12) * (float) this.field6368.field2796;
                    }
                    if (!(this.field6368.field2854 <= var13 / (float) arg2) && !(this.field6368.field2804 >= var14 / (float) arg2)) {
                        class15.field199 = var5.field1002 * var6.field995 + var5.field1027 * var6.field1028 + var5.field1018 * var6.field996 + var5.field1028;
                        class502.field7336 = var5.field1002 * var6.field1032 + var5.field1027 * var6.field1027 + var5.field1018 * var6.field1005;
                        float var15 = (float) this.field6391 * class502.field7336 + class15.field199;
                        float var16 = (float) this.field6365 * class502.field7336 + class15.field199;
                        float var17;
                        float var18;
                        if (var16 < var15) {
                            var17 = ((float) this.field6323 + var15) * (float) this.field6368.field2886;
                            var18 = (var16 - (float) this.field6323) * (float) this.field6368.field2886;
                        } else {
                            var18 = ((float) (-this.field6323) + var15) * (float) this.field6368.field2886;
                            var17 = ((float) this.field6323 + var16) * (float) this.field6368.field2886;
                        }
                        if (!(var18 / (float) arg2 >= this.field6368.field2864) && !(var17 / (float) arg2 <= this.field6368.field2865)) {
                            if (arg1 != null || this.field6313 != null) {
                                class756.field10811 = var5.field1002 * var6.field1001 + var5.field1027 * var6.field1002 + var5.field1018 * var6.field1030;
                                class634.field8997 = var5.field1030 * var6.field1000 + var5.field1010 * var6.field1010 + var5.field1005 * var6.field1018;
                                class210.field3060 = var5.field1001 * var6.field1000 + var5.field1032 * var6.field1018 + var5.field1000 * var6.field1010;
                                class204.field3003 = var5.field1001 * var6.field1001 + var5.field1032 * var6.field1002 + var5.field1000 * var6.field1030;
                                class26.field325 = var5.field1002 * var6.field1000 + var5.field1027 * var6.field1018 + var5.field1018 * var6.field1010;
                                class717.field10234 = var5.field1030 * var6.field1001 + var5.field1010 * var6.field1030 + var5.field1005 * var6.field1002;
                            }
                            if (arg1 != null) {
                                int var19 = this.field6305 + this.field6304 >> 1;
                                int var20 = this.field6374 + this.field6347 >> 1;
                                int var21 = (int) ((float) var20 * class717.field10234 + (float) this.field6391 * class358.field5207 + (float) var19 * class634.field8997 + class80.field1127);
                                int var22 = (int) ((float) var20 * class756.field10811 + (float) this.field6391 * class502.field7336 + (float) var19 * class26.field325 + class15.field199);
                                int var23 = (int) ((float) var20 * class204.field3003 + (float) this.field6391 * class622.field8884 + (float) var19 * class210.field3060 + class503.field7341);
                                int var24 = (int) ((float) var20 * class717.field10234 + (float) this.field6365 * class358.field5207 + (float) var19 * class634.field8997 + class80.field1127);
                                int var25 = (int) ((float) var20 * class756.field10811 + (float) this.field6365 * class502.field7336 + (float) var19 * class26.field325 + class15.field199);
                                arg1.field7768 = this.field6368.field2811 + (this.field6368.field2886 * var25 / arg2);
                                int var26 = (int) ((float) var20 * class204.field3003 + (float) this.field6365 * class622.field8884 + (float) var19 * class210.field3060 + class503.field7341);
                                arg1.field7767 = this.field6368.field2796 * var24 / arg2 + this.field6368.field2848;
                                arg1.field7766 = this.field6368.field2796 * var21 / arg2 + this.field6368.field2848;
                                arg1.field7764 = this.field6368.field2811 + (this.field6368.field2886 * var22 / arg2);
                                if (this.field6368.field2816 <= var23 || this.field6368.field2816 <= var26) {
                                    arg1.field7769 = true;
                                    arg1.field7765 = (this.field6323 + var21) * this.field6368.field2796 / arg2 + this.field6368.field2848 - arg1.field7766;
                                }
                            }
                            this.field6368.method1652(-4, (float) arg2);
                            this.field6368.method1686(30);
                            this.field6368.method1677(var6, 0);
                            this.method3396(0);
                            this.field6368.method1656((byte) 36);
                            this.method3397((byte) -103);
                        }
                    }
                }
            }
        } catch (RuntimeException var28) {
            throw class665.method4799(var28, field6418[17] + (arg0 == null ? field6418[1] : field6418[0]) + ',' + (arg1 == null ? field6418[1] : field6418[0]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjc;)Lcja;", line = 4521)
    public static final class753 method3395(int arg0, class711 arg1) {
        try {
            field6376++;
            class742 var2 = class404.method3168(arg1, (byte) -86);
            if (arg0 <= 55) {
                method3389(125, (byte) -37);
            }
            int var3 = arg1.method5113(18443);
            int var4 = arg1.method5113(18443);
            return new class753(var2.field10540, var2.field10539, var2.field10542, var2.field10547, var2.field10543, var2.field10541, var2.field10544, var2.field10545, var2.field10548, var3, var4);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6418[25] + arg0 + ',' + (arg1 == null ? field6418[1] : field6418[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "()Z", line = 4543)
    public final boolean method396() {
        try {
            field6415++;
            return this.field6302;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[6] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "VA", descriptor = "(I)V", line = 4551)
    public final void method437(int arg0) {
        try {
            field6341++;
            int var2 = class487.field7151[arg0];
            int var3 = class487.field7150[arg0];
            for (int var4 = 0; var4 < this.field6344; var4++) {
                int var5 = this.field6375[var4] * var2 + (this.field6339[var4] * var3) >> 14;
                this.field6375[var4] = this.field6375[var4] * var3 - (this.field6339[var4] * var2) >> 14;
                this.field6339[var4] = var5;
            }
            this.field6414 = false;
            if (this.field6413 != null) {
                this.field6413.field4326 = null;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6418[33] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "NA", descriptor = "()Z", line = 4580)
    public final boolean method393() {
        try {
            field6317++;
            if (this.field6301 == null) {
                return false;
            }
            for (int var1 = 0; var1 < this.field6320; var1++) {
                this.field6339[var1] <<= 0x4;
                this.field6375[var1] <<= 0x4;
                this.field6321[var1] <<= 0x4;
            }
            class576.field8325 = 0;
            class508.field7460 = 0;
            class74.field1068 = 0;
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6418[35] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "I", descriptor = "(I[IIIIZI[I)V", line = 4608)
    public final void method388(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        try {
            field6315++;
            int var9 = arg1.length;
            if (arg0 == 0) {
                arg2 <<= 0x4;
                arg4 <<= 0x4;
                arg3 <<= 0x4;
                class74.field1068 = 0;
                class576.field8325 = 0;
                int var10 = 0;
                class508.field7460 = 0;
                for (int var11 = 0; var11 < var9; var11++) {
                    int var12 = arg1[var11];
                    if (var12 < this.field6301.length) {
                        int[] var13 = this.field6301[var12];
                        for (int var14 = 0; var14 < var13.length; var14++) {
                            int var15 = var13[var14];
                            if (this.field6403 == null || (this.field6403[var15] & arg6) != 0) {
                                class74.field1068 += this.field6339[var15];
                                class508.field7460 += this.field6375[var15];
                                class576.field8325 += this.field6321[var15];
                                var10++;
                            }
                        }
                    }
                }
                if (var10 > 0) {
                    class493.field7253 = true;
                    class508.field7460 = class508.field7460 / var10 + arg3;
                    class576.field8325 = class576.field8325 / var10 + arg4;
                    class74.field1068 = class74.field1068 / var10 + arg2;
                } else {
                    class576.field8325 = arg4;
                    class74.field1068 = arg2;
                    class508.field7460 = arg3;
                }
            } else if (arg0 == 1) {
                if (arg7 != null) {
                    int var16 = arg7[1] * arg3 + arg7[0] * arg2 + (arg7[2] * arg4) + 8192 >> 14;
                    int var17 = arg7[4] * arg3 + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
                    int var18 = arg7[7] * arg3 + arg7[6] * arg2 - (-(arg7[8] * arg4) - 8192) >> 14;
                    arg3 = var17;
                    arg2 = var16;
                    arg4 = var18;
                }
                arg4 <<= 0x4;
                arg2 <<= 0x4;
                arg3 <<= 0x4;
                for (int var19 = 0; var19 < var9; var19++) {
                    int var20 = arg1[var19];
                    if (var20 < this.field6301.length) {
                        int[] var21 = this.field6301[var20];
                        for (int var22 = 0; var22 < var21.length; var22++) {
                            int var23 = var21[var22];
                            if (this.field6403 == null || (this.field6403[var23] & arg6) != 0) {
                                this.field6339[var23] += arg2;
                                this.field6375[var23] += arg3;
                                this.field6321[var23] += arg4;
                            }
                        }
                    }
                }
            } else if (arg0 == 2) {
                if (arg7 == null) {
                    for (int var84 = 0; var84 < var9; var84++) {
                        int var85 = arg1[var84];
                        if (this.field6301.length > var85) {
                            int[] var86 = this.field6301[var85];
                            for (int var87 = 0; var87 < var86.length; var87++) {
                                int var88 = var86[var87];
                                if (this.field6403 == null || (this.field6403[var88] & arg6) != 0) {
                                    this.field6339[var88] -= class74.field1068;
                                    this.field6375[var88] -= class508.field7460;
                                    this.field6321[var88] -= class576.field8325;
                                    if (arg4 != 0) {
                                        int var89 = class487.field7151[arg4];
                                        int var90 = class487.field7150[arg4];
                                        int var91 = this.field6375[var88] * var89 + this.field6339[var88] * var90 + 16383 >> 14;
                                        this.field6375[var88] = this.field6375[var88] * var90 + 16383 - (this.field6339[var88] * var89) >> 14;
                                        this.field6339[var88] = var91;
                                    }
                                    if (arg2 != 0) {
                                        int var92 = class487.field7151[arg2];
                                        int var93 = class487.field7150[arg2];
                                        int var94 = this.field6375[var88] * var93 + 16383 - (this.field6321[var88] * var92) >> 14;
                                        this.field6321[var88] = this.field6375[var88] * var92 + this.field6321[var88] * var93 + 16383 >> 14;
                                        this.field6375[var88] = var94;
                                    }
                                    if (arg3 != 0) {
                                        int var95 = class487.field7151[arg3];
                                        int var96 = class487.field7150[arg3];
                                        int var97 = this.field6339[var88] * var96 + (this.field6321[var88] * var95 + 16383) >> 14;
                                        this.field6321[var88] = this.field6321[var88] * var96 + 16383 - this.field6339[var88] * var95 >> 14;
                                        this.field6339[var88] = var97;
                                    }
                                    this.field6339[var88] += class74.field1068;
                                    this.field6375[var88] += class508.field7460;
                                    this.field6321[var88] += class576.field8325;
                                }
                            }
                        }
                    }
                    if (arg5) {
                        for (int var98 = 0; var98 < var9; var98++) {
                            int var99 = arg1[var98];
                            if (var99 < this.field6301.length) {
                                int[] var100 = this.field6301[var99];
                                for (int var101 = 0; var101 < var100.length; var101++) {
                                    int var102 = var100[var101];
                                    if (this.field6403 == null || (arg6 & this.field6403[var102]) != 0) {
                                        int var103 = this.field6351[var102];
                                        int var104 = this.field6351[var102 + 1];
                                        for (int var105 = var103; var105 < var104; var105++) {
                                            int var106 = this.field6409[var105] - 1;
                                            if (var106 == -1) {
                                                break;
                                            }
                                            if (arg4 != 0) {
                                                int var107 = class487.field7151[arg4];
                                                int var108 = class487.field7150[arg4];
                                                int var109 = this.field6334[var106] * var107 + (this.field6359[var106] * var108) + 16383 >> 14;
                                                this.field6334[var106] = (short) (this.field6334[var106] * var108 + 16383 - (this.field6359[var106] * var107) >> 14);
                                                this.field6359[var106] = (short) var109;
                                            }
                                            if (arg2 != 0) {
                                                int var110 = class487.field7151[arg2];
                                                int var111 = class487.field7150[arg2];
                                                int var112 = this.field6334[var106] * var111 + 16383 - (this.field6361[var106] * var110) >> 14;
                                                this.field6361[var106] = (short) (this.field6361[var106] * var111 + (this.field6334[var106] * var110 + 16383) >> 14);
                                                this.field6334[var106] = (short) var112;
                                            }
                                            if (arg3 != 0) {
                                                int var113 = class487.field7151[arg3];
                                                int var114 = class487.field7150[arg3];
                                                int var115 = this.field6359[var106] * var114 + this.field6361[var106] * var113 + 16383 >> 14;
                                                this.field6361[var106] = (short) (this.field6361[var106] * var114 + 16383 - (this.field6359[var106] * var113) >> 14);
                                                this.field6359[var106] = (short) var115;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (this.field6393 == null && this.field6392 != null) {
                            this.field6392.field4326 = null;
                        }
                        if (this.field6393 != null) {
                            this.field6393.field4326 = null;
                        }
                    }
                } else {
                    int var24 = arg7[9] << 4;
                    int var25 = arg7[10] << 4;
                    int var26 = arg7[11] << 4;
                    int var27 = arg7[12] << 4;
                    int var28 = arg7[13] << 4;
                    int var29 = arg7[14] << 4;
                    if (class493.field7253) {
                        int var30 = arg7[6] * class576.field8325 + arg7[0] * class74.field1068 + arg7[3] * class508.field7460 + 8192 >> 14;
                        int var31 = arg7[7] * class576.field8325 + arg7[1] * class74.field1068 + arg7[4] * class508.field7460 + 8192 >> 14;
                        int var32 = var27 + var30;
                        int var33 = arg7[2] * class74.field1068 + arg7[8] * class576.field8325 + arg7[5] * class508.field7460 + 8192 >> 14;
                        int var34 = var28 + var31;
                        class74.field1068 = var32;
                        class508.field7460 = var34;
                        int var35 = var29 + var33;
                        class576.field8325 = var35;
                        class493.field7253 = false;
                    }
                    int[] var36 = new int[9];
                    int var37 = class487.field7150[arg2];
                    int var38 = class487.field7151[arg2];
                    int var39 = class487.field7150[arg3];
                    int var40 = class487.field7151[arg3];
                    int var41 = class487.field7150[arg4];
                    int var42 = class487.field7151[arg4];
                    int var43 = var38 * var41 + 8192 >> 14;
                    int var44 = var38 * var42 + 8192 >> 14;
                    var36[8] = var37 * var39 + 8192 >> 14;
                    var36[5] = -var38;
                    var36[0] = var40 * var44 + var39 * var41 + 8192 >> 14;
                    var36[7] = var39 * var43 + var40 * var42 + 8192 >> 14;
                    var36[1] = var40 * var43 + -var39 * var42 + 8192 >> 14;
                    var36[4] = var37 * var41 + 8192 >> 14;
                    var36[6] = var39 * var44 + -var40 * var41 + 8192 >> 14;
                    var36[2] = var37 * var40 + 8192 >> 14;
                    var36[3] = var37 * var42 + 8192 >> 14;
                    int var45 = var36[1] * -class508.field7460 + var36[2] * -class576.field8325 + var36[0] * -class74.field1068 + 8192 >> 14;
                    int var46 = var36[3] * -class74.field1068 + 8192 - (-(var36[4] * -class508.field7460) - var36[5] * -class576.field8325) >> 14;
                    int var47 = var36[8] * -class576.field8325 + var36[7] * -class508.field7460 + var36[6] * -class74.field1068 + 8192 >> 14;
                    int var48 = var45 + class74.field1068;
                    int var49 = class508.field7460 + var46;
                    int var50 = class576.field8325 + var47;
                    int[] var51 = new int[9];
                    for (int var52 = 0; var52 < 3; var52++) {
                        for (int var53 = 0; var53 < 3; var53++) {
                            int var54 = 0;
                            for (int var55 = 0; var55 < 3; var55++) {
                                var54 += var36[var52 * 3 + var55] * arg7[var53 * 3 + var55];
                            }
                            var51[var52 * 3 + var53] = var54 + 8192 >> 14;
                        }
                    }
                    int var56 = var36[2] * var29 + var36[1] * var28 + var36[0] * var27 + 8192 >> 14;
                    int var57 = var36[5] * var29 + var36[4] * var28 + var36[3] * var27 + 8192 >> 14;
                    int var58 = var49 + var57;
                    int var59 = var36[8] * var29 + var36[6] * var27 + var36[7] * var28 + 8192 >> 14;
                    int var60 = var48 + var56;
                    int var61 = var50 + var59;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 3; var63++) {
                        for (int var64 = 0; var64 < 3; var64++) {
                            int var65 = 0;
                            for (int var66 = 0; var66 < 3; var66++) {
                                var65 += arg7[var63 * 3 + var66] * var51[var66 * 3 + var64];
                            }
                            var62[var63 * 3 + var64] = var65 + 8192 >> 14;
                        }
                    }
                    int var67 = arg7[2] * var61 + arg7[0] * var60 + (arg7[1] * var58) + 8192 >> 14;
                    int var68 = arg7[3] * var60 + (arg7[4] * var58) + arg7[5] * var61 + 8192 >> 14;
                    int var69 = arg7[6] * var60 + 8192 - (-(arg7[7] * var58) - (arg7[8] * var61)) >> 14;
                    int var70 = var24 + var67;
                    int var71 = var25 + var68;
                    int var72 = var26 + var69;
                    for (int var73 = 0; var73 < var9; var73++) {
                        int var74 = arg1[var73];
                        if (this.field6301.length > var74) {
                            int[] var75 = this.field6301[var74];
                            for (int var76 = 0; var76 < var75.length; var76++) {
                                int var77 = var75[var76];
                                if (this.field6403 == null || (this.field6403[var77] & arg6) != 0) {
                                    int var78 = this.field6321[var77] * var62[2] + (this.field6339[var77] * var62[0] + (this.field6375[var77] * var62[1])) + 8192 >> 14;
                                    int var79 = this.field6321[var77] * var62[5] + this.field6375[var77] * var62[4] + this.field6339[var77] * var62[3] + 8192 >> 14;
                                    int var80 = var70 + var78;
                                    int var81 = var71 + var79;
                                    int var82 = this.field6321[var77] * var62[8] + this.field6375[var77] * var62[7] + this.field6339[var77] * var62[6] + 8192 >> 14;
                                    this.field6339[var77] = var80;
                                    int var83 = var72 + var82;
                                    this.field6375[var77] = var81;
                                    this.field6321[var77] = var83;
                                }
                            }
                        }
                    }
                }
            } else if (arg0 == 3) {
                if (arg7 == null) {
                    for (int var166 = 0; var166 < var9; var166++) {
                        int var167 = arg1[var166];
                        if (this.field6301.length > var167) {
                            int[] var168 = this.field6301[var167];
                            for (int var169 = 0; var169 < var168.length; var169++) {
                                int var170 = var168[var169];
                                if (this.field6403 == null || (arg6 & this.field6403[var170]) != 0) {
                                    this.field6339[var170] -= class74.field1068;
                                    this.field6375[var170] -= class508.field7460;
                                    this.field6321[var170] -= class576.field8325;
                                    this.field6339[var170] = this.field6339[var170] * arg2 >> 7;
                                    this.field6375[var170] = this.field6375[var170] * arg3 >> 7;
                                    this.field6321[var170] = this.field6321[var170] * arg4 >> 7;
                                    this.field6339[var170] += class74.field1068;
                                    this.field6375[var170] += class508.field7460;
                                    this.field6321[var170] += class576.field8325;
                                }
                            }
                        }
                    }
                } else {
                    int var116 = arg7[9] << 4;
                    int var117 = arg7[10] << 4;
                    int var118 = arg7[11] << 4;
                    int var119 = arg7[12] << 4;
                    int var120 = arg7[13] << 4;
                    int var121 = arg7[14] << 4;
                    if (class493.field7253) {
                        int var122 = arg7[6] * class576.field8325 + arg7[0] * class74.field1068 + arg7[3] * class508.field7460 + 8192 >> 14;
                        int var123 = arg7[4] * class508.field7460 + arg7[1] * class74.field1068 + (arg7[7] * class576.field8325) + 8192 >> 14;
                        int var124 = var119 + var122;
                        int var125 = var120 + var123;
                        int var126 = arg7[8] * class576.field8325 + arg7[2] * class74.field1068 + (arg7[5] * class508.field7460) + 8192 >> 14;
                        class74.field1068 = var124;
                        class508.field7460 = var125;
                        int var127 = var121 + var126;
                        class576.field8325 = var127;
                        class493.field7253 = false;
                    }
                    int var128 = arg2 << 15 >> 7;
                    int var129 = arg3 << 15 >> 7;
                    int var130 = arg4 << 15 >> 7;
                    int var131 = -class74.field1068 * var128 + 8192 >> 14;
                    int var132 = -class508.field7460 * var129 + 8192 >> 14;
                    int var133 = -class576.field8325 * var130 + 8192 >> 14;
                    int var134 = class74.field1068 + var131;
                    int var135 = class508.field7460 + var132;
                    int var136 = class576.field8325 + var133;
                    int[] var137 = new int[] { arg7[0] * var128 + 8192 >> 14, arg7[3] * var128 + 8192 >> 14, arg7[6] * var128 + 8192 >> 14, arg7[1] * var129 + 8192 >> 14, arg7[4] * var129 + 8192 >> 14, arg7[7] * var129 + 8192 >> 14, arg7[2] * var130 + 8192 >> 14, arg7[5] * var130 + 8192 >> 14, arg7[8] * var130 + 8192 >> 14 };
                    int var138 = var119 * var128 + 8192 >> 14;
                    int var139 = var120 * var129 + 8192 >> 14;
                    int var140 = var135 + var139;
                    int var141 = var134 + var138;
                    int var142 = var121 * var130 + 8192 >> 14;
                    int var143 = var136 + var142;
                    int[] var144 = new int[9];
                    for (int var145 = 0; var145 < 3; var145++) {
                        for (int var146 = 0; var146 < 3; var146++) {
                            int var147 = 0;
                            for (int var148 = 0; var148 < 3; var148++) {
                                var147 += arg7[var145 * 3 + var148] * var137[var148 * 3 + var146];
                            }
                            var144[var145 * 3 + var146] = var147 + 8192 >> 14;
                        }
                    }
                    int var149 = arg7[0] * var141 + (arg7[1] * var140) + (arg7[2] * var143 - -8192) >> 14;
                    int var150 = arg7[3] * var141 + (arg7[4] * var140 + (arg7[5] * var143)) + 8192 >> 14;
                    int var151 = var116 + var149;
                    int var152 = var117 + var150;
                    int var153 = arg7[8] * var143 + arg7[6] * var141 + arg7[7] * var140 + 8192 >> 14;
                    int var154 = var118 + var153;
                    for (int var155 = 0; var155 < var9; var155++) {
                        int var156 = arg1[var155];
                        if (this.field6301.length > var156) {
                            int[] var157 = this.field6301[var156];
                            for (int var158 = 0; var158 < var157.length; var158++) {
                                int var159 = var157[var158];
                                if (this.field6403 == null || (arg6 & this.field6403[var159]) != 0) {
                                    int var160 = this.field6321[var159] * var144[2] + this.field6375[var159] * var144[1] + this.field6339[var159] * var144[0] + 8192 >> 14;
                                    int var161 = this.field6321[var159] * var144[5] + this.field6375[var159] * var144[4] + this.field6339[var159] * var144[3] + 8192 >> 14;
                                    int var162 = var152 + var161;
                                    int var163 = var151 + var160;
                                    int var164 = this.field6339[var159] * var144[6] + (this.field6375[var159] * var144[7]) - (-(this.field6321[var159] * var144[8]) - 8192) >> 14;
                                    int var165 = var154 + var164;
                                    this.field6339[var159] = var163;
                                    this.field6375[var159] = var162;
                                    this.field6321[var159] = var165;
                                }
                            }
                        }
                    }
                }
            } else if (arg0 == 5) {
                if (this.field6308 != null) {
                    for (int var171 = 0; var171 < var9; var171++) {
                        int var172 = arg1[var171];
                        if (this.field6308.length > var172) {
                            int[] var173 = this.field6308[var172];
                            for (int var174 = 0; var174 < var173.length; var174++) {
                                int var175 = var173[var174];
                                if (this.field6309 == null || (arg6 & this.field6309[var175]) != 0) {
                                    int var176 = (this.field6363[var175] & 0xFF) + arg2 * 8;
                                    if (var176 < 0) {
                                        var176 = 0;
                                    } else if (var176 > 255) {
                                        var176 = 255;
                                    }
                                    this.field6363[var175] = (byte) var176;
                                    if (this.field6392 != null) {
                                        this.field6392.field4326 = null;
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6313 != null) {
                        for (int var177 = 0; var177 < this.field6410; var177++) {
                            class326 var178 = this.field6313[var177];
                            class237 var179 = this.field6407[var177];
                            var179.field3426 = 255 - (this.field6363[var178.field4460] & 0xFF) << 24 | var179.field3426 & 0xFFFFFF;
                        }
                    }
                }
            } else if (arg0 == 7) {
                if (this.field6308 != null) {
                    for (int var180 = 0; var180 < var9; var180++) {
                        int var181 = arg1[var180];
                        if (var181 < this.field6308.length) {
                            int[] var182 = this.field6308[var181];
                            for (int var183 = 0; var183 < var182.length; var183++) {
                                int var184 = var182[var183];
                                if (this.field6309 == null || (this.field6309[var184] & arg6) != 0) {
                                    int var185 = this.field6294[var184] & 0xFFFF;
                                    int var186 = (var185 & 0xFCED) >> 10;
                                    int var187 = var185 >> 7 & 0x7;
                                    int var188 = var186 + arg2 & 0x3F;
                                    int var189 = var185 & 0x7F;
                                    int var190 = arg3 / 4 + var187;
                                    if (var190 < 0) {
                                        var190 = 0;
                                    } else if (var190 > 7) {
                                        var190 = 7;
                                    }
                                    int var191 = arg4 + var189;
                                    if (var191 < 0) {
                                        var191 = 0;
                                    } else if (var191 > 127) {
                                        var191 = 127;
                                    }
                                    this.field6294[var184] = (short) class10.method71(var191, class10.method71(var190 << 7, var188 << 10));
                                    if (this.field6392 != null) {
                                        this.field6392.field4326 = null;
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6313 != null) {
                        for (int var192 = 0; var192 < this.field6410; var192++) {
                            class326 var193 = this.field6313[var192];
                            class237 var194 = this.field6407[var192];
                            var194.field3426 = class360.field5233[this.field6294[var193.field4460] & 0xFFFF] & 0xFFFFFF | var194.field3426 & 0xFF000000;
                        }
                    }
                }
            } else if (arg0 == 8) {
                if (this.field6316 != null) {
                    for (int var195 = 0; var195 < var9; var195++) {
                        int var196 = arg1[var195];
                        if (this.field6316.length > var196) {
                            int[] var197 = this.field6316[var196];
                            for (int var198 = 0; var198 < var197.length; var198++) {
                                class237 var199 = this.field6407[var197[var198]];
                                var199.field3422 += arg2;
                                var199.field3434 += arg3;
                            }
                        }
                    }
                }
            } else if (arg0 == 10) {
                if (this.field6316 != null) {
                    for (int var200 = 0; var200 < var9; var200++) {
                        int var201 = arg1[var200];
                        if (this.field6316.length > var201) {
                            int[] var202 = this.field6316[var201];
                            for (int var203 = 0; var203 < var202.length; var203++) {
                                class237 var204 = this.field6407[var202[var203]];
                                var204.field3429 = var204.field3429 * arg2 >> 7;
                                var204.field3433 = var204.field3433 * arg3 >> 7;
                            }
                        }
                    }
                }
            } else if (arg0 == 9 && this.field6316 != null) {
                for (int var205 = 0; var205 < var9; var205++) {
                    int var206 = arg1[var205];
                    if (this.field6316.length > var206) {
                        int[] var207 = this.field6316[var206];
                        for (int var208 = 0; var208 < var207.length; var208++) {
                            class237 var209 = this.field6407[var207[var208]];
                            var209.field3424 = var209.field3424 + arg2 & 0x3FFF;
                        }
                    }
                }
            }
        } catch (RuntimeException var211) {
            throw class665.method4799(var211, field6418[31] + arg0 + ',' + (arg1 == null ? field6418[1] : field6418[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field6418[1] : field6418[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V", line = 5593)
    private final void method3396(int arg0) {
        try {
            field6373++;
            if (this.field6310 != 0) {
                if (this.field6380 != arg0) {
                    this.method3385(true, (byte) -83);
                }
                this.method3385(false, (byte) -83);
                if (this.field6372 != null) {
                    if (this.field6372.field5790 == null) {
                        this.method3390((this.field6380 & 0x10) != 0, (byte) 16);
                    }
                    if (this.field6372.field5790 != null) {
                        this.field6368.method1684(this.field6393 != null, (byte) -11);
                        this.field6368.method1653(arg0 ^ 0xFFFFF27B, this.field6392, this.field6324, this.field6393, this.field6413);
                        int var2 = this.field6402.length - 1;
                        for (int var3 = 0; var3 < var2; var3++) {
                            int var4 = this.field6402[var3];
                            int var5 = this.field6402[var3 + 1];
                            int var6 = this.field6306[var4] & 0xFFFF;
                            if (var6 == 65535) {
                                var6 = -1;
                            }
                            this.field6368.method1685(this.field6393 != null, (byte) 47, var6);
                            this.field6368.method1647(var4 * 3, (var5 - var4) * 3, this.field6372.field5790, -57, 4);
                        }
                    }
                }
                this.method3387(-10);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field6418[59] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(B[B)V", line = 5649)
    public final void method404(byte arg0, byte[] arg1) {
        try {
            if (arg1 == null) {
                for (int var3 = 0; var3 < this.field6370; var3++) {
                    this.field6363[var3] = arg0;
                }
            } else {
                for (int var4 = 0; var4 < this.field6370; var4++) {
                    int var5 = 255 - ((255 - (arg0 & 0xFF)) * (255 - (arg1[var4] & 0xFF)) / 255);
                    this.field6363[var4] = (byte) var5;
                }
            }
            field6331++;
            if (this.field6392 != null) {
                this.field6392.field4326 = null;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6418[53] + arg0 + ',' + (arg1 == null ? field6418[1] : field6418[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "EA", descriptor = "()I", line = 5690)
    public final int method410() {
        try {
            if (!this.field6414) {
                this.method3383((byte) -42);
            }
            field6335++;
            return this.field6365;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6418[63] + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "(B)V", line = 5705)
    private final void method3397(byte arg0) {
        try {
            int var2 = -114 / ((arg0 - 5) / 61);
            if (this.field6313 != null) {
                class70 var3 = this.field6368.field2757;
                this.field6368.method1639(0);
                this.field6368.method119(!this.field6299);
                this.field6368.method1684(false, (byte) -127);
                this.field6368.method1653(-3461, null, this.field6368.field2819, null, this.field6368.field2822);
                for (int var4 = 0; var4 < this.field6410; var4++) {
                    class326 var5 = this.field6313[var4];
                    class237 var6 = this.field6407[var4];
                    if (!var5.field4461 || !this.field6368.method217()) {
                        float var7 = (float) (this.field6339[var5.field4456] + this.field6339[var5.field4454] + this.field6339[var5.field4465]) * 0.3333333F;
                        float var8 = (float) (this.field6375[var5.field4456] + this.field6375[var5.field4454] + this.field6375[var5.field4465]) * 0.3333333F;
                        float var9 = (float) (this.field6321[var5.field4454] + this.field6321[var5.field4465] + this.field6321[var5.field4456]) * 0.3333333F;
                        float var10 = class717.field10234 * var9 + class634.field8997 * var7 + class358.field5207 * var8 + class80.field1127;
                        float var11 = class756.field10811 * var9 + class502.field7336 * var8 + class26.field325 * var7 + class15.field199;
                        float var12 = class204.field3003 * var9 + class622.field8884 * var8 + class210.field3060 * var7 + class503.field7341;
                        float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var10 * var10 + var11 * var11))) * (float) var5.field4457;
                        var3.method731(var5.field4458 * var6.field3433 >> 7, (byte) -108, var6.field3424, var11 * var13 + (float) var6.field3434 - var11, var12 * var13 + -var12, var5.field4464 * var6.field3429 >> 7, (float) var6.field3422 + var10 - (var10 * var13));
                        this.field6368.method1644(var3, (byte) 124);
                        int var14 = var6.field3426;
                        OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                        this.field6368.method1625(73, var5.field4452);
                        this.field6368.method1670(var5.field4459, (byte) 113);
                        this.field6368.method1623((byte) 7, 7, 4, 0);
                    }
                }
                this.field6368.method119(true);
                this.field6368.method1656((byte) 77);
            }
            field6353++;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field6418[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "aa", descriptor = "(SS)V", line = 5783)
    public final void method376(short arg0, short arg1) {
        try {
            field6381++;
            class673 var3 = this.field6368.field237;
            for (int var4 = 0; var4 < this.field6370; var4++) {
                if (arg0 == this.field6306[var4]) {
                    this.field6306[var4] = arg1;
                }
            }
            byte var5 = 0;
            byte var6 = 0;
            if (arg0 != -1) {
                class684 var7 = var3.method4500(-23641, arg0 & 0xFFFF);
                var6 = var7.field9602;
                var5 = var7.field9589;
            }
            byte var8 = 0;
            byte var9 = 0;
            if (arg1 != -1) {
                class684 var10 = var3.method4500(-23641, arg1 & 0xFFFF);
                if (var10.field9598 != 0 || var10.field9592 != 0) {
                    this.field6302 = true;
                }
                var8 = var10.field9589;
                var9 = var10.field9602;
            }
            if (var5 != var8 | var6 != var9) {
                if (this.field6313 != null) {
                    for (int var11 = 0; var11 < this.field6410; var11++) {
                        class326 var12 = this.field6313[var11];
                        class237 var13 = this.field6407[var11];
                        var13.field3426 = class360.field5233[this.field6294[var12.field4460] & 0xFFFF] & 0xFFFFFF | var13.field3426 & 0xFF000000;
                    }
                }
                if (this.field6392 != null) {
                    this.field6392.field4326 = null;
                    return;
                }
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field6418[27] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3398(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3399(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
