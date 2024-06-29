import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class624 extends class157 {

    @OriginalMember(owner = "client!ww", name = "R", descriptor = "Z")
    private boolean field9029 = false;

    @OriginalMember(owner = "client!ww", name = "J", descriptor = "I")
    private int field9021 = 0;

    @OriginalMember(owner = "client!ww", name = "zb", descriptor = "I")
    private int field9063 = 0;

    @OriginalMember(owner = "client!ww", name = "tb", descriptor = "I")
    private int field9057 = 0;

    @OriginalMember(owner = "client!ww", name = "Ib", descriptor = "Z")
    private boolean field9072 = true;

    @OriginalMember(owner = "client!ww", name = "Hb", descriptor = "I")
    private int field9071 = 0;

    @OriginalMember(owner = "client!ww", name = "Zb", descriptor = "I")
    private int field9089 = 0;

    @OriginalMember(owner = "client!ww", name = "fc", descriptor = "Lgi;")
    private class583 field9095;

    @OriginalMember(owner = "client!ww", name = "Xb", descriptor = "Ldd;")
    private class603 field9087;

    @OriginalMember(owner = "client!ww", name = "mc", descriptor = "Ldd;")
    private class603 field9102;

    @OriginalMember(owner = "client!ww", name = "sb", descriptor = "Ldd;")
    private class603 field9056;

    @OriginalMember(owner = "client!ww", name = "Sb", descriptor = "Ldd;")
    private class603 field9082;

    @OriginalMember(owner = "client!ww", name = "C", descriptor = "Lgp;")
    private class43 field9014;

    @OriginalMember(owner = "client!ww", name = "Z", descriptor = "I")
    private int field9037;

    @OriginalMember(owner = "client!ww", name = "S", descriptor = "I")
    private int field9030;

    @OriginalMember(owner = "client!ww", name = "w", descriptor = "[I")
    private int[] field9008;

    @OriginalMember(owner = "client!ww", name = "W", descriptor = "[I")
    private int[] field9034;

    @OriginalMember(owner = "client!ww", name = "db", descriptor = "[S")
    private short[] field9041;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "[I")
    private int[] field9001;

    @OriginalMember(owner = "client!ww", name = "Rb", descriptor = "[I")
    private int[] field9081;

    @OriginalMember(owner = "client!ww", name = "A", descriptor = "[Lig;")
    private class203[] field9012;

    @OriginalMember(owner = "client!ww", name = "ib", descriptor = "[Lrn;")
    private class225[] field9046;

    @OriginalMember(owner = "client!ww", name = "Jb", descriptor = "I")
    private int field9073;

    @OriginalMember(owner = "client!ww", name = "jc", descriptor = "[Lmo;")
    private class638[] field9099;

    @OriginalMember(owner = "client!ww", name = "lc", descriptor = "[Ldq;")
    private class597[] field9101;

    @OriginalMember(owner = "client!ww", name = "P", descriptor = "[F")
    private float[] field9027;

    @OriginalMember(owner = "client!ww", name = "ec", descriptor = "[S")
    private short[] field9094;

    @OriginalMember(owner = "client!ww", name = "bc", descriptor = "S")
    private short field9091;

    @OriginalMember(owner = "client!ww", name = "gc", descriptor = "[S")
    private short[] field9096;

    @OriginalMember(owner = "client!ww", name = "K", descriptor = "[S")
    private short[] field9022;

    @OriginalMember(owner = "client!ww", name = "xb", descriptor = "[S")
    private short[] field9061;

    @OriginalMember(owner = "client!ww", name = "ic", descriptor = "[S")
    private short[] field9098;

    @OriginalMember(owner = "client!ww", name = "gb", descriptor = "[B")
    private byte[] field9044;

    @OriginalMember(owner = "client!ww", name = "Lb", descriptor = "[S")
    private short[] field9075;

    @OriginalMember(owner = "client!ww", name = "Fb", descriptor = "[F")
    private float[] field9069;

    @OriginalMember(owner = "client!ww", name = "lb", descriptor = "S")
    private short field9049;

    @OriginalMember(owner = "client!ww", name = "y", descriptor = "[S")
    private short[] field9010;

    @OriginalMember(owner = "client!ww", name = "Eb", descriptor = "[B")
    private byte[] field9068;

    @OriginalMember(owner = "client!ww", name = "pc", descriptor = "[S")
    private short[] field9105;

    @OriginalMember(owner = "client!ww", name = "x", descriptor = "[S")
    private short[] field9009;

    @OriginalMember(owner = "client!ww", name = "nc", descriptor = "[S")
    private short[] field9103;

    @OriginalMember(owner = "client!ww", name = "Gb", descriptor = "[I")
    private int[] field9070;

    @OriginalMember(owner = "client!ww", name = "wb", descriptor = "[[I")
    private int[][] field9060;

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "[[I")
    private int[][] field9007;

    @OriginalMember(owner = "client!ww", name = "ac", descriptor = "[[I")
    private int[][] field9090;

    @OriginalMember(owner = "client!ww", name = "M", descriptor = "B")
    private byte field9024;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!ww", name = "t", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!ww", name = "B", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!ww", name = "D", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!ww", name = "E", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!ww", name = "F", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!ww", name = "H", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!ww", name = "I", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!ww", name = "L", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!ww", name = "N", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!ww", name = "O", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!ww", name = "T", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!ww", name = "U", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!ww", name = "V", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!ww", name = "X", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!ww", name = "Y", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!ww", name = "ab", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!ww", name = "bb", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!ww", name = "cb", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!ww", name = "eb", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!ww", name = "fb", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!ww", name = "hb", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!ww", name = "jb", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!ww", name = "kb", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!ww", name = "mb", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!ww", name = "ob", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!ww", name = "qb", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!ww", name = "rb", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!ww", name = "ub", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!ww", name = "vb", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!ww", name = "yb", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!ww", name = "Ab", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!ww", name = "Cb", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!ww", name = "Db", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!ww", name = "Kb", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!ww", name = "Mb", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!ww", name = "Nb", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!ww", name = "Ob", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!ww", name = "Pb", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!ww", name = "Qb", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!ww", name = "Tb", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!ww", name = "Ub", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!ww", name = "Vb", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!ww", name = "Wb", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!ww", name = "Yb", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!ww", name = "cc", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!ww", name = "hc", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!ww", name = "kc", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!ww", name = "qc", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!ww", name = "Q", descriptor = "Lcaa;")
    private class252 field9028;

    @OriginalMember(owner = "client!ww", name = "oc", descriptor = "Lah;")
    private class322 field9104;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "Lqd;")
    private class381 field9003;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "S")
    private short field9000;

    @OriginalMember(owner = "client!ww", name = "s", descriptor = "S")
    private short field9004;

    @OriginalMember(owner = "client!ww", name = "G", descriptor = "S")
    private short field9018;

    @OriginalMember(owner = "client!ww", name = "nb", descriptor = "S")
    private short field9051;

    @OriginalMember(owner = "client!ww", name = "pb", descriptor = "S")
    private short field9053;

    @OriginalMember(owner = "client!ww", name = "Bb", descriptor = "S")
    private short field9065;

    @OriginalMember(owner = "client!ww", name = "dc", descriptor = "S")
    private short field9093;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZI)V")
    private final void method3636(boolean arg0, int arg1) {
        field9015++;
        boolean var3 = this.field9082 != null && this.field9082.field8705 == null;
        boolean var4 = this.field9056 != null && this.field9056.field8705 == null;
        boolean var5 = this.field9087 != null && this.field9087.field8705 == null;
        boolean var6 = this.field9102 != null && this.field9102.field8705 == null;
        if (arg0) {
            var3 &= (this.field9024 & 0x2) != 0;
            var5 &= (this.field9024 & 0x1) != 0;
            var4 &= (this.field9024 & 0x4) != 0;
            var6 &= (this.field9024 & 0x8) != 0;
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
        if (arg1 == var7) {
            return;
        }
        if ((this.field9063 * var7) <= this.field9095.field8288.field138.length) {
            this.field9095.field8288.field165 = 0;
        } else {
            this.field9095.field8288 = new class541((this.field9063 + 100) * var7);
        }
        class541 var12 = this.field9095.field8288;
        if (var5) {
            if (this.field9095.field8254) {
                for (int var13 = 0; var13 < this.field9021; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field9081[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field9001[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field9034[var13]);
                    int var17 = this.field9008[var13];
                    int var18 = this.field9008[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field9022[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field165 = var7 * var20;
                        var12.method117(119, var14);
                        var12.method117(-127, var15);
                        var12.method117(117, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field9021; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field9081[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field9001[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field9034[var21]);
                    int var25 = this.field9008[var21];
                    int var26 = this.field9008[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field9022[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field165 = var7 * var28;
                        var12.method125((byte) -31, var22);
                        var12.method125((byte) -31, var23);
                        var12.method125((byte) -31, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field9056 == null) {
                short[] var31;
                byte[] var32;
                short[] var33;
                short[] var34;
                if (this.field9028 == null) {
                    var31 = this.field9105;
                    var32 = this.field9068;
                    var33 = this.field9094;
                    var34 = this.field9061;
                } else {
                    var31 = this.field9028.field3496;
                    var33 = this.field9028.field3492;
                    var34 = this.field9028.field3491;
                    var32 = this.field9028.field3495;
                }
                float var35 = this.field9095.field8329[0];
                float var36 = this.field9095.field8329[1];
                float var37 = this.field9095.field8329[2];
                float var38 = this.field9095.field8245;
                float var39 = this.field9095.field8310 * 768.0F / (float) this.field9049;
                float var40 = this.field9095.field8267 * 768.0F / (float) this.field9049;
                for (int var41 = 0; var41 < this.field9071; var41++) {
                    int var42 = this.method3647(this.field9044[var41], this.field9103[var41], this.field9091, (byte) -65, this.field9009[var41]);
                    float var43 = (float) (var42 >> 16 & 0xFF) * this.field9095.field8340;
                    float var44 = (float) (var42 >>> 24) * this.field9095.field8309;
                    short var45 = this.field9010[var41];
                    float var46 = (float) (var42 >> 8 & 0xFF) * this.field9095.field8274;
                    short var47 = (short) var32[var45];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var34[var45] * var37 + (float) var31[var45] * var36 + (float) var33[var45] * var35) * 0.0026041667F;
                    } else {
                        var48 = ((float) var34[var45] * var37 + (float) var31[var45] * var36 + (float) var33[var45] * var35) / (float) (var47 * 256);
                    }
                    float var49 = var38 + (var48 < 0.0F ? var40 : var39) * var48;
                    int var50 = (int) (var44 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var51 = (int) (var43 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    int var52 = (int) (var46 * var49);
                    var12.field165 = var7 * var45 + var9;
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method108((byte) -128, var50);
                    var12.method108((byte) -128, var51);
                    var12.method108((byte) -128, var52);
                    var12.method108((byte) -128, 255 - (this.field9044[var41] & 0xFF));
                    short var53 = this.field9096[var41];
                    short var54 = (short) var32[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var36 + (float) var33[var53] * var35) * 0.0026041667F;
                    } else {
                        var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var36 + (float) var33[var53] * var35) / (float) (var54 * 256);
                    }
                    float var56 = var55 * (var55 < 0.0F ? var40 : var39) + var38;
                    int var57 = (int) (var44 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var43 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var46 * var56);
                    var12.field165 = var7 * var53 + var9;
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method108((byte) -128, var57);
                    var12.method108((byte) -128, var58);
                    var12.method108((byte) -128, var59);
                    var12.method108((byte) -128, 255 - (this.field9044[var41] & 0xFF));
                    short var60 = this.field9075[var41];
                    short var61 = (short) var32[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var36 + (float) var33[var60] * var35) * 0.0026041667F;
                    } else {
                        var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var36 + (float) var33[var60] * var35) / (float) (var61 * 256);
                    }
                    float var63 = var38 + ((var62 < 0.0F) ? var40 : var39) * var62;
                    int var64 = (int) (var44 * var63);
                    int var65 = (int) (var43 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var66 = (int) (var46 * var63);
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
                    var12.field165 = var7 * var60 + var9;
                    var12.method108((byte) -128, var64);
                    var12.method108((byte) -128, var65);
                    var12.method108((byte) -128, var66);
                    var12.method108((byte) -128, 255 - (this.field9044[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field9071; var29++) {
                    int var30 = this.method3647(this.field9044[var29], this.field9103[var29], this.field9091, (byte) -44, this.field9009[var29]);
                    var12.field165 = this.field9010[var29] * var7 + var9;
                    var12.method117(arg1 ^ 0x5F, var30);
                    var12.field165 = var9 + (this.field9096[var29] * var7);
                    var12.method117(-67, var30);
                    var12.field165 = this.field9075[var29] * var7 + var9;
                    var12.method117(-107, var30);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field9028 == null) {
                var67 = this.field9068;
                var68 = this.field9105;
                var70 = this.field9094;
                var69 = this.field9061;
            } else {
                var67 = this.field9028.field3495;
                var68 = this.field9028.field3496;
                var69 = this.field9028.field3491;
                var70 = this.field9028.field3492;
            }
            float var71 = 3.0F / (float) this.field9049;
            float var72 = 3.0F / (float) (this.field9049 / 2 + this.field9049);
            var12.field165 = var10;
            if (this.field9095.field8254) {
                for (int var76 = 0; var76 < this.field9063; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method3100((float) var70[var76] * var72, arg1 - 794787512);
                        var12.method3100((float) var68[var76] * var72, arg1 ^ 0xD0A08148);
                        var12.method3100((float) var69[var76] * var72, arg1 - 794787512);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method3100((float) var70[var76] * var78, -794787512);
                        var12.method3100((float) var68[var76] * var78, -794787512);
                        var12.method3100((float) var69[var76] * var78, -794787512);
                    }
                    var12.field165 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field9063; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method3101((byte) 62, (float) var70[var73] * var72);
                        var12.method3101((byte) 109, (float) var68[var73] * var72);
                        var12.method3101((byte) 54, (float) var69[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method3101((byte) 67, (float) var70[var73] * var75);
                        var12.method3101((byte) 51, (float) var68[var73] * var75);
                        var12.method3101((byte) 124, (float) var69[var73] * var75);
                    }
                    var12.field165 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field165 = var11;
            if (this.field9095.field8254) {
                for (int var79 = 0; var79 < this.field9063; var79++) {
                    var12.method3100(this.field9027[var79], -794787512);
                    var12.method3100(this.field9069[var79], -794787512);
                    var12.field165 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field9063; var80++) {
                    var12.method3101((byte) 103, this.field9027[var80]);
                    var12.method3101((byte) 65, this.field9069[var80]);
                    var12.field165 += var7 - 8;
                }
            }
        }
        var12.field165 = this.field9063 * var7;
        class381 var81;
        if (arg0) {
            if (this.field9003 == null) {
                this.field9003 = this.field9095.method3400(var7, arg1 - 75, true, var12.field165, var12.field138);
            } else {
                this.field9003.method2019(var12.field165, var12.field138, var7, 12766);
            }
            var81 = this.field9003;
            this.field9024 = 0;
        } else {
            var81 = this.field9095.method3400(var7, -79, false, var12.field165, var12.field138);
            this.field9072 = true;
        }
        if (var5) {
            this.field9087.field8702 = var8;
            this.field9087.field8705 = var81;
        }
        if (var6) {
            this.field9102.field8702 = var11;
            this.field9102.field8705 = var81;
        }
        if (var3) {
            this.field9082.field8702 = var9;
            this.field9082.field8705 = var81;
        }
        if (var4) {
            this.field9056.field8705 = var81;
            this.field9056.field8702 = var10;
        }
    }

    @OriginalMember(owner = "client!ww", name = "ea", descriptor = "(I[IIIIIZ)V")
    public final void method167(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field9036++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class392.field5535 = 0;
            int var12 = 0;
            class606.field8734 = 0;
            class500.field6970 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field9060.length > var14) {
                    int[] var15 = this.field9060[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class392.field5535 += this.field9081[var17];
                        class606.field8734 += this.field9001[var17];
                        class500.field6970 += this.field9034[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class606.field8734 = class606.field8734 / var12 + var11;
                class392.field5535 = class392.field5535 / var12 + var9;
                class500.field6970 = class500.field6970 / var12 + var10;
            } else {
                class606.field8734 = var11;
                class392.field5535 = var9;
                class500.field6970 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field9060.length > var22) {
                    int[] var23 = this.field9060[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field9081[var25] += var19;
                        this.field9001[var25] += var20;
                        this.field9034[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field9060.length > var45) {
                    int[] var46 = this.field9060[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field9081[var59] -= class392.field5535;
                            this.field9001[var59] -= class606.field8734;
                            this.field9034[var59] -= class500.field6970;
                            if (arg4 != 0) {
                                int var60 = class1.field2[arg4];
                                int var61 = class1.field7[arg4];
                                int var62 = this.field9001[var59] * var60 - (-(this.field9081[var59] * var61) - 32767) >> 15;
                                this.field9001[var59] = this.field9001[var59] * var61 + 32767 - (this.field9081[var59] * var60) >> 15;
                                this.field9081[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class1.field2[arg2];
                                int var64 = class1.field7[arg2];
                                int var65 = this.field9001[var59] * var64 + 32767 - (this.field9034[var59] * var63) >> 15;
                                this.field9034[var59] = this.field9034[var59] * var64 + this.field9001[var59] * var63 + 32767 >> 15;
                                this.field9001[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class1.field2[arg3];
                                int var67 = class1.field7[arg3];
                                int var68 = this.field9034[var59] * var66 + (this.field9081[var59] * var67) + 32767 >> 15;
                                this.field9034[var59] = this.field9034[var59] * var67 + 32767 - (this.field9081[var59] * var66) >> 15;
                                this.field9081[var59] = var68;
                            }
                            this.field9081[var59] += class392.field5535;
                            this.field9001[var59] += class606.field8734;
                            this.field9034[var59] += class500.field6970;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field9081[var48] -= class392.field5535;
                            this.field9001[var48] -= class606.field8734;
                            this.field9034[var48] -= class500.field6970;
                            if (arg2 != 0) {
                                int var49 = class1.field2[arg2];
                                int var50 = class1.field7[arg2];
                                int var51 = this.field9001[var48] * var50 + 32767 - (this.field9034[var48] * var49) >> 15;
                                this.field9034[var48] = this.field9001[var48] * var49 + (this.field9034[var48] * var50) + 32767 >> 15;
                                this.field9001[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class1.field2[arg4];
                                int var53 = class1.field7[arg4];
                                int var54 = this.field9001[var48] * var52 + this.field9081[var48] * var53 + 32767 >> 15;
                                this.field9001[var48] = this.field9001[var48] * var53 + 32767 - this.field9081[var48] * var52 >> 15;
                                this.field9081[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class1.field2[arg3];
                                int var56 = class1.field7[arg3];
                                int var57 = this.field9081[var48] * var56 + this.field9034[var48] * var55 + 32767 >> 15;
                                this.field9034[var48] = this.field9034[var48] * var56 + 32767 - (this.field9081[var48] * var55) >> 15;
                                this.field9081[var48] = var57;
                            }
                            this.field9081[var48] += class392.field5535;
                            this.field9001[var48] += class606.field8734;
                            this.field9034[var48] += class500.field6970;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field9060.length) {
                        int[] var29 = this.field9060[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field9008[var31];
                            int var33 = this.field9008[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field9022[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class1.field2[arg4];
                                    int var37 = class1.field7[arg4];
                                    int var38 = this.field9094[var35] * var37 + (this.field9105[var35] * var36 + 32767) >> 15;
                                    this.field9105[var35] = (short) (this.field9105[var35] * var37 + (32767 - (this.field9094[var35] * var36)) >> 15);
                                    this.field9094[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class1.field2[arg2];
                                    int var40 = class1.field7[arg2];
                                    int var41 = this.field9105[var35] * var40 + 32767 - this.field9061[var35] * var39 >> 15;
                                    this.field9061[var35] = (short) (this.field9061[var35] * var40 + this.field9105[var35] * var39 + 32767 >> 15);
                                    this.field9105[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class1.field2[arg3];
                                    int var43 = class1.field7[arg3];
                                    int var44 = this.field9094[var35] * var43 + this.field9061[var35] * var42 + 32767 >> 15;
                                    this.field9061[var35] = (short) (this.field9061[var35] * var43 + 32767 - (this.field9094[var35] * var42) >> 15);
                                    this.field9094[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field9056 == null && this.field9082 != null) {
                    this.field9082.field8705 = null;
                }
                if (this.field9056 != null) {
                    this.field9056.field8705 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field9060.length) {
                    int[] var71 = this.field9060[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field9081[var73] -= class392.field5535;
                        this.field9001[var73] -= class606.field8734;
                        this.field9034[var73] -= class500.field6970;
                        this.field9081[var73] = this.field9081[var73] * arg2 >> 7;
                        this.field9001[var73] = this.field9001[var73] * arg3 >> 7;
                        this.field9034[var73] = this.field9034[var73] * arg4 >> 7;
                        this.field9081[var73] += class392.field5535;
                        this.field9001[var73] += class606.field8734;
                        this.field9034[var73] += class500.field6970;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9090 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field9090.length) {
                        int[] var79 = this.field9090[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field9044[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field9044[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field9082 != null) {
                            this.field9082.field8705 = null;
                        }
                    }
                }
                if (this.field9099 != null) {
                    for (int var75 = 0; var75 < this.field9073; var75++) {
                        class638 var76 = this.field9099[var75];
                        class597 var77 = this.field9101[var75];
                        var77.field8635 = var77.field8635 & 0xFFFFFF | 255 - (this.field9044[var76.field9288] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field9090 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field9090.length > var87) {
                        int[] var88 = this.field9090[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field9103[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFD15) >> 10;
                            int var93 = (var91 & 0x3CE) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = var92 + arg2 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            int var97 = arg4 + var94;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field9103[var90] = (short) class73.method578(class73.method578(var95 << 10, var96 << 7), var97);
                        }
                        if (var88.length > 0 && this.field9082 != null) {
                            this.field9082.field8705 = null;
                        }
                    }
                }
                if (this.field9099 != null) {
                    for (int var84 = 0; var84 < this.field9073; var84++) {
                        class638 var85 = this.field9099[var84];
                        class597 var86 = this.field9101[var84];
                        var86.field8635 = class118.field1940[this.field9103[var85.field9288] & 0xFFFF] & 0xFFFFFF | var86.field8635 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field9007 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field9007.length > var99) {
                        int[] var100 = this.field9007[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class597 var102 = this.field9101[var100[var101]];
                            var102.field8636 += arg2;
                            var102.field8626 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9007 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field9007.length) {
                        int[] var105 = this.field9007[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class597 var107 = this.field9101[var105[var106]];
                            var107.field8628 = var107.field8628 * arg3 >> 7;
                            var107.field8631 = var107.field8631 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9007 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field9007.length) {
                    int[] var110 = this.field9007[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class597 var112 = this.field9101[var110[var111]];
                        var112.field8624 = var112.field8624 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ww", name = "OA", descriptor = "(I)V")
    public final void method140(int arg0) {
        field9006++;
        int var2 = class1.field2[arg0];
        int var3 = class1.field7[arg0];
        for (int var4 = 0; var4 < this.field9021; var4++) {
            int var5 = this.field9081[var4] * var3 + this.field9034[var4] * var2 >> 15;
            this.field9034[var4] = this.field9034[var4] * var3 - (this.field9081[var4] * var2) >> 15;
            this.field9081[var4] = var5;
        }
        this.field9029 = false;
        if (this.field9087 != null) {
            this.field9087.field8705 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "Q", descriptor = "()I")
    public final int method135() {
        if (!this.field9029) {
            this.method3640(-9369);
        }
        field9025++;
        return this.field9004;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)V")
    private final void method3637(boolean arg0) {
        field9079++;
        if (!this.field9072) {
            return;
        }
        this.field9072 = false;
        if (this.field9012 == null && this.field9046 == null && this.field9099 == null) {
            if (this.field9081 != null && !class176.method1121(458752, this.field9037, this.field9030)) {
                if (this.field9087 != null && this.field9087.field8705 == null) {
                    this.field9072 = true;
                } else {
                    if (!this.field9029) {
                        this.method3640(-9369);
                    }
                    this.field9081 = null;
                }
            }
            if (this.field9001 != null && !class191.method1187(-30788, this.field9030, this.field9037)) {
                if (this.field9087 != null && this.field9087.field8705 == null) {
                    this.field9072 = true;
                } else {
                    if (!this.field9029) {
                        this.method3640(-9369);
                    }
                    this.field9001 = null;
                }
            }
            if (this.field9034 != null && !class481.method2798(this.field9030, this.field9037, (byte) 122)) {
                if (this.field9087 != null && this.field9087.field8705 == null) {
                    this.field9072 = true;
                } else {
                    if (!this.field9029) {
                        this.method3640(-9369);
                    }
                    this.field9034 = null;
                }
            }
        }
        if (this.field9022 != null && this.field9081 == null && this.field9001 == null && this.field9034 == null) {
            this.field9022 = null;
            this.field9008 = null;
        }
        if (this.field9068 != null && !class302.method1921(this.field9037, -448256272, this.field9030)) {
            if (this.field9056 == null) {
                if (this.field9082 != null && this.field9082.field8705 == null) {
                    this.field9072 = true;
                } else {
                    this.field9094 = this.field9105 = this.field9061 = null;
                    this.field9068 = null;
                }
            } else if (this.field9056.field8705 == null) {
                this.field9072 = true;
            } else {
                this.field9094 = this.field9105 = this.field9061 = null;
                this.field9068 = null;
            }
        }
        if (this.field9103 != null && !class520.method3002(this.field9030, this.field9037, (byte) 103)) {
            if (this.field9082 != null && this.field9082.field8705 == null) {
                this.field9072 = true;
            } else {
                this.field9103 = null;
            }
        }
        if (this.field9044 != null && !class505.method2923(this.field9030, 262144, this.field9037)) {
            if (this.field9082 != null && this.field9082.field8705 == null) {
                this.field9072 = true;
            } else {
                this.field9044 = null;
            }
        }
        if (this.field9027 != null && !class463.method2702(this.field9030, (byte) -67, this.field9037)) {
            if (this.field9102 != null && this.field9102.field8705 == null) {
                this.field9072 = true;
            } else {
                this.field9027 = this.field9069 = null;
            }
        }
        if (this.field9009 != null && !class214.method1397(this.field9037, -36, this.field9030)) {
            if (this.field9082 != null && this.field9082.field8705 == null) {
                this.field9072 = true;
            } else {
                this.field9009 = null;
            }
        }
        if (this.field9010 != null && !class477.method2777(-123, this.field9030, this.field9037)) {
            if ((this.field9014 == null || this.field9014.field813 != null) && (this.field9082 == null || this.field9082.field8705 != null)) {
                this.field9010 = this.field9096 = this.field9075 = null;
            } else {
                this.field9072 = true;
            }
        }
        if (this.field9090 != null && !class264.method1734(this.field9030, 93, this.field9037)) {
            this.field9090 = null;
            this.field9098 = null;
        }
        if (!arg0) {
            return;
        }
        if (this.field9060 != null && !class513.method2973(this.field9037, (byte) -91, this.field9030)) {
            this.field9041 = null;
            this.field9060 = null;
        }
        if (this.field9007 != null && !class483.method2816(this.field9037, (byte) -35, this.field9030)) {
            this.field9007 = null;
        }
        if (this.field9070 != null && (this.field9037 & 0x800) == 0 && (this.field9037 & 0x40000) == 0) {
            this.field9070 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "(I)V")
    public final void method138(int arg0) {
        this.field9037 = arg0;
        field9058++;
        this.field9072 = true;
        if (this.field9028 != null && (this.field9037 & 0x10000) == 0) {
            this.field9068 = this.field9028.field3495;
            this.field9061 = this.field9028.field3491;
            this.field9105 = this.field9028.field3496;
            this.field9094 = this.field9028.field3492;
            this.field9028 = null;
        }
        this.method3637(true);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lr;IIIZ)V")
    public final void method147(class157 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9039++;
        class624 var6 = (class624) arg0;
        if (this.field9071 == 0 || var6.field9071 == 0) {
            return;
        }
        int var7 = var6.field9021;
        int[] var8 = var6.field9081;
        int[] var9 = var6.field9001;
        int[] var10 = var6.field9034;
        short[] var11 = var6.field9094;
        short[] var12 = var6.field9105;
        short[] var13 = var6.field9061;
        byte[] var14 = var6.field9068;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field9028 == null) {
            var15 = null;
            var17 = null;
            var18 = null;
            var16 = null;
        } else {
            var15 = this.field9028.field3491;
            var16 = this.field9028.field3496;
            var17 = this.field9028.field3492;
            var18 = this.field9028.field3495;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field9028 == null) {
            var21 = null;
            var20 = null;
            var19 = null;
            var22 = null;
        } else {
            var19 = var6.field9028.field3496;
            var20 = var6.field9028.field3492;
            var21 = var6.field9028.field3491;
            var22 = var6.field9028.field3495;
        }
        int[] var23 = var6.field9008;
        short[] var24 = var6.field9022;
        if (!var6.field9029) {
            var6.method3640(-9369);
        }
        short var25 = var6.field9093;
        short var26 = var6.field9018;
        short var27 = var6.field9000;
        short var28 = var6.field9065;
        short var29 = var6.field9004;
        short var30 = var6.field9053;
        for (int var31 = 0; var31 < this.field9021; var31++) {
            int var32 = this.field9001[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field9081[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field9034[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field9008[var31];
                        int var37 = this.field9008[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field9022[var38] - 1;
                            if (var35 == -1 || this.field9068[var35] != 0) {
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
                                        if (var17 == null) {
                                            this.field9028 = new class252();
                                            var17 = this.field9028.field3492 = class582.method3326(114, this.field9094);
                                            var16 = this.field9028.field3496 = class582.method3326(90, this.field9105);
                                            var15 = this.field9028.field3491 = class582.method3326(105, this.field9061);
                                            var18 = this.field9028.field3495 = class58.method520(this.field9068, (byte) 93);
                                        }
                                        if (var20 == null) {
                                            class252 var44 = var6.field9028 = new class252();
                                            var20 = var44.field3492 = class582.method3326(120, var11);
                                            var19 = var44.field3496 = class582.method3326(106, var12);
                                            var21 = var44.field3491 = class582.method3326(91, var13);
                                            var22 = var44.field3495 = class58.method520(var14, (byte) 84);
                                        }
                                        short var45 = this.field9094[var35];
                                        short var46 = this.field9105[var35];
                                        short var47 = this.field9061[var35];
                                        byte var48 = this.field9068[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var20[var52] += var45;
                                                var19[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field9008[var31];
                                        short var54 = var12[var40];
                                        int var55 = this.field9008[var31 + 1];
                                        short var56 = var13[var40];
                                        byte var57 = var14[var40];
                                        short var58 = var11[var40];
                                        for (int var59 = var53; var59 < var55; var59++) {
                                            int var60 = this.field9022[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var17[var60] += var58;
                                                var16[var60] += var54;
                                                var15[var60] += var56;
                                                var18[var60] += var57;
                                            }
                                        }
                                        if (this.field9056 == null && this.field9082 != null) {
                                            this.field9082.field8705 = null;
                                        }
                                        if (this.field9056 != null) {
                                            this.field9056.field8705 = null;
                                        }
                                        if (var6.field9056 == null && var6.field9082 != null) {
                                            var6.field9082.field8705 = null;
                                        }
                                        if (var6.field9056 != null) {
                                            var6.field9056.field8705 = null;
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

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILvh;)V")
    private final void method3638(int arg0, class302 arg1) {
        field9047++;
        if (this.field9063 > this.field9095.field8347.length) {
            this.field9095.field8344 = new int[this.field9063];
            this.field9095.field8347 = new int[this.field9063];
        }
        int[] var3 = this.field9095.field8347;
        int[] var4 = this.field9095.field8344;
        if (arg0 > -71) {
            return;
        }
        for (int var5 = 0; var5 < this.field9021; var5++) {
            int var16 = (this.field9081[var5] - (this.field9001[var5] * this.field9095.field8256 >> 8) >> this.field9095.field8198) - arg1.field4125;
            int var17 = (this.field9034[var5] - (this.field9001[var5] * this.field9095.field8228 >> 8) >> this.field9095.field8198) - arg1.field4126;
            int var18 = this.field9008[var5];
            int var19 = this.field9008[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field9022[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field9089; var6++) {
            if (this.field9044 == null || this.field9044[var6] <= 128) {
                short var7 = this.field9010[var6];
                short var8 = this.field9096[var6];
                short var9 = this.field9075[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method1922(var14, var13, 87, var11, var10, var12, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ww", name = "ba", descriptor = "()I")
    public final int method166() {
        field9019++;
        return this.field9037;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZIILln;IFFJII)S")
    private final short method3639(boolean arg0, int arg1, int arg2, class317 arg3, int arg4, float arg5, float arg6, long arg7, int arg8, int arg9) {
        field9084++;
        int var12 = this.field9008[arg9];
        int var13 = this.field9008[arg9 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field9022[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class590.field8432[var15] == arg7) {
                return (short) (var16 - 1);
            }
        }
        if (!arg0) {
            this.field9094 = null;
        }
        this.field9022[var14] = (short) (this.field9063 + 1);
        class590.field8432[var14] = arg7;
        this.field9094[this.field9063] = (short) arg4;
        this.field9105[this.field9063] = (short) arg8;
        this.field9061[this.field9063] = (short) arg2;
        this.field9068[this.field9063] = (byte) arg1;
        this.field9027[this.field9063] = arg6;
        this.field9069[this.field9063] = arg5;
        return (short) (this.field9063++);
    }

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "()I")
    public final int method128() {
        if (!this.field9029) {
            this.method3640(-9369);
        }
        field9020++;
        return this.field9018;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V")
    private final void method3640(int arg0) {
        field9074++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        if (arg0 != -9369) {
            this.method127(null, null, -14, -67);
        }
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field9021; var10++) {
            int var11 = this.field9081[var10];
            int var12 = this.field9001[var10];
            int var13 = this.field9034[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var11 * var11 - (-(var12 * var12) - (var13 * var13));
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field9000 = (short) var2;
        this.field9093 = (short) var3;
        this.field9053 = (short) var7;
        this.field9018 = (short) var6;
        this.field9065 = (short) var5;
        this.field9004 = (short) var4;
        this.field9051 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field9029 = true;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZLww;ILww;IZ)Lr;")
    private final class157 method3641(boolean arg0, class624 arg1, int arg2, class624 arg3, int arg4, boolean arg5) {
        arg3.field9089 = this.field9089;
        arg3.field9057 = this.field9057;
        arg3.field9030 = this.field9030;
        arg3.field9037 = arg2;
        arg3.field9024 = 0;
        arg3.field9049 = this.field9049;
        arg3.field9091 = this.field9091;
        arg3.field9063 = this.field9063;
        field9062++;
        arg3.field9021 = this.field9021;
        arg3.field9073 = this.field9073;
        arg3.field9071 = this.field9071;
        boolean var7 = class391.method2353(-13, arg2, this.field9030);
        boolean var8 = class192.method1192(2, this.field9030, arg2);
        boolean var9 = class274.method1771(arg2, 0, this.field9030);
        if (arg4 != 22271) {
            this.field9105 = null;
        }
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg3.field9081 = this.field9081;
            } else if (arg1.field9081 == null || arg1.field9081.length < this.field9057) {
                arg3.field9081 = arg1.field9081 = new int[this.field9057];
            } else {
                arg3.field9081 = arg1.field9081;
            }
            if (!var8) {
                arg3.field9001 = this.field9001;
            } else if (arg1.field9001 == null || this.field9057 > arg1.field9001.length) {
                arg3.field9001 = arg1.field9001 = new int[this.field9057];
            } else {
                arg3.field9001 = arg1.field9001;
            }
            if (!var9) {
                arg3.field9034 = this.field9034;
            } else if (arg1.field9034 == null || arg1.field9034.length < this.field9057) {
                arg3.field9034 = arg1.field9034 = new int[this.field9057];
            } else {
                arg3.field9034 = arg1.field9034;
            }
            for (int var11 = 0; var11 < this.field9057; var11++) {
                if (var7) {
                    arg3.field9081[var11] = this.field9081[var11];
                }
                if (var8) {
                    arg3.field9001[var11] = this.field9001[var11];
                }
                if (var9) {
                    arg3.field9034[var11] = this.field9034[var11];
                }
            }
        } else {
            arg3.field9081 = this.field9081;
            arg3.field9001 = this.field9001;
            arg3.field9034 = this.field9034;
        }
        if (class6.method39(arg4 - 22321, arg2, this.field9030)) {
            if (arg5) {
                arg3.field9024 = (byte) (arg3.field9024 | 0x1);
            }
            arg3.field9087 = arg1.field9087;
            arg3.field9087.field8702 = this.field9087.field8702;
            arg3.field9087.field8705 = this.field9087.field8705;
        } else if (class563.method3214(arg2, 99, this.field9030)) {
            arg3.field9087 = this.field9087;
        } else {
            arg3.field9087 = null;
        }
        if (class100.method717(arg2, -5569, this.field9030)) {
            if (arg1.field9103 == null || arg1.field9103.length < this.field9071) {
                arg3.field9103 = arg1.field9103 = new short[this.field9071];
            } else {
                arg3.field9103 = arg1.field9103;
            }
            for (int var12 = 0; var12 < this.field9071; var12++) {
                arg3.field9103[var12] = this.field9103[var12];
            }
        } else {
            arg3.field9103 = this.field9103;
        }
        if (class26.method295(false, arg2, this.field9030)) {
            if (arg1.field9044 == null || this.field9071 > arg1.field9044.length) {
                arg3.field9044 = arg1.field9044 = new byte[this.field9071];
            } else {
                arg3.field9044 = arg1.field9044;
            }
            for (int var13 = 0; var13 < this.field9071; var13++) {
                arg3.field9044[var13] = this.field9044[var13];
            }
        } else {
            arg3.field9044 = this.field9044;
        }
        if (class191.method1190((byte) -25, arg2, this.field9030)) {
            arg3.field9082 = arg1.field9082;
            if (arg5) {
                arg3.field9024 = (byte) (arg3.field9024 | 0x2);
            }
            arg3.field9082.field8705 = this.field9082.field8705;
            arg3.field9082.field8702 = this.field9082.field8702;
        } else if (class644.method3712(this.field9030, (byte) 7, arg2)) {
            arg3.field9082 = this.field9082;
        } else {
            arg3.field9082 = null;
        }
        if (class490.method2845(122, this.field9030, arg2)) {
            if (arg1.field9094 == null || arg1.field9094.length < this.field9063) {
                int var14 = this.field9063;
                arg3.field9105 = arg1.field9105 = new short[var14];
                arg3.field9061 = arg1.field9061 = new short[var14];
                arg3.field9094 = arg1.field9094 = new short[var14];
            } else {
                arg3.field9094 = arg1.field9094;
                arg3.field9061 = arg1.field9061;
                arg3.field9105 = arg1.field9105;
            }
            if (this.field9028 == null) {
                for (int var18 = 0; var18 < this.field9063; var18++) {
                    arg3.field9094[var18] = this.field9094[var18];
                    arg3.field9105[var18] = this.field9105[var18];
                    arg3.field9061[var18] = this.field9061[var18];
                }
            } else {
                if (arg1.field9028 == null) {
                    arg1.field9028 = new class252();
                }
                class252 var15 = arg3.field9028 = arg1.field9028;
                if (var15.field3492 == null || this.field9063 > var15.field3492.length) {
                    int var16 = this.field9063;
                    var15.field3496 = new short[var16];
                    var15.field3491 = new short[var16];
                    var15.field3492 = new short[var16];
                    var15.field3495 = new byte[var16];
                }
                for (int var17 = 0; var17 < this.field9063; var17++) {
                    arg3.field9094[var17] = this.field9094[var17];
                    arg3.field9105[var17] = this.field9105[var17];
                    arg3.field9061[var17] = this.field9061[var17];
                    var15.field3492[var17] = this.field9028.field3492[var17];
                    var15.field3496[var17] = this.field9028.field3496[var17];
                    var15.field3491[var17] = this.field9028.field3491[var17];
                    var15.field3495[var17] = this.field9028.field3495[var17];
                }
            }
            arg3.field9068 = this.field9068;
        } else {
            arg3.field9028 = this.field9028;
            arg3.field9068 = this.field9068;
            arg3.field9094 = this.field9094;
            arg3.field9105 = this.field9105;
            arg3.field9061 = this.field9061;
        }
        if (class646.method3723(this.field9030, arg2, -123)) {
            if (arg5) {
                arg3.field9024 = (byte) (arg3.field9024 | 0x4);
            }
            arg3.field9056 = arg1.field9056;
            arg3.field9056.field8702 = this.field9056.field8702;
            arg3.field9056.field8705 = this.field9056.field8705;
        } else if (class560.method3193((byte) -128, arg2, this.field9030)) {
            arg3.field9056 = this.field9056;
        } else {
            arg3.field9056 = null;
        }
        if (class146.method972(arg2, arg4 - 22244, this.field9030)) {
            if (arg1.field9027 == null || this.field9071 > arg1.field9027.length) {
                int var19 = this.field9063;
                arg3.field9069 = arg1.field9069 = new float[var19];
                arg3.field9027 = arg1.field9027 = new float[var19];
            } else {
                arg3.field9069 = arg1.field9069;
                arg3.field9027 = arg1.field9027;
            }
            for (int var20 = 0; var20 < this.field9063; var20++) {
                arg3.field9027[var20] = this.field9027[var20];
                arg3.field9069[var20] = this.field9069[var20];
            }
        } else {
            arg3.field9027 = this.field9027;
            arg3.field9069 = this.field9069;
        }
        if (class345.method2085(90, arg2, this.field9030)) {
            if (arg5) {
                arg3.field9024 = (byte) (arg3.field9024 | 0x8);
            }
            arg3.field9102 = arg1.field9102;
            arg3.field9102.field8705 = this.field9102.field8705;
            arg3.field9102.field8702 = this.field9102.field8702;
        } else if (class320.method1994(arg4 ^ 0x568B, this.field9030, arg2)) {
            arg3.field9102 = this.field9102;
        } else {
            arg3.field9102 = null;
        }
        if (class16.method181(this.field9030, arg2, 16)) {
            if (arg1.field9010 == null || this.field9071 > arg1.field9010.length) {
                int var21 = this.field9071;
                arg3.field9096 = arg1.field9096 = new short[var21];
                arg3.field9075 = arg1.field9075 = new short[var21];
                arg3.field9010 = arg1.field9010 = new short[var21];
            } else {
                arg3.field9010 = arg1.field9010;
                arg3.field9075 = arg1.field9075;
                arg3.field9096 = arg1.field9096;
            }
            for (int var22 = 0; var22 < this.field9071; var22++) {
                arg3.field9010[var22] = this.field9010[var22];
                arg3.field9096[var22] = this.field9096[var22];
                arg3.field9075[var22] = this.field9075[var22];
            }
        } else {
            arg3.field9010 = this.field9010;
            arg3.field9096 = this.field9096;
            arg3.field9075 = this.field9075;
        }
        if (class58.method524(arg2, this.field9030, 0)) {
            if (arg5) {
                arg3.field9024 = (byte) (arg3.field9024 | 0x10);
            }
            arg3.field9014 = arg1.field9014;
            arg3.field9014.field813 = this.field9014.field813;
        } else if (class452.method2654(this.field9030, arg2, 127)) {
            arg3.field9014 = this.field9014;
        } else {
            arg3.field9014 = null;
        }
        if (class546.method3116(arg2, this.field9030, (byte) 71)) {
            if (arg1.field9009 == null || arg1.field9009.length < this.field9071) {
                int var23 = this.field9071;
                arg3.field9009 = arg1.field9009 = new short[var23];
            } else {
                arg3.field9009 = arg1.field9009;
            }
            for (int var24 = 0; var24 < this.field9071; var24++) {
                arg3.field9009[var24] = this.field9009[var24];
            }
        } else {
            arg3.field9009 = this.field9009;
        }
        if (!class414.method2491(0, arg2, this.field9030)) {
            arg3.field9101 = this.field9101;
        } else if (arg1.field9101 == null || this.field9073 > arg1.field9101.length) {
            int var26 = this.field9073;
            arg3.field9101 = arg1.field9101 = new class597[var26];
            for (int var27 = 0; var27 < this.field9073; var27++) {
                arg3.field9101[var27] = this.field9101[var27].method3525((byte) 98);
            }
        } else {
            arg3.field9101 = arg1.field9101;
            for (int var25 = 0; var25 < this.field9073; var25++) {
                arg3.field9101[var25].method3530(this.field9101[var25], (byte) 85);
            }
        }
        arg3.field9012 = this.field9012;
        arg3.field9007 = this.field9007;
        arg3.field9070 = this.field9070;
        arg3.field9098 = this.field9098;
        arg3.field9041 = this.field9041;
        arg3.field9022 = this.field9022;
        if (this.field9029) {
            arg3.field9093 = this.field9093;
            arg3.field9065 = this.field9065;
            arg3.field9053 = this.field9053;
            arg3.field9051 = this.field9051;
            arg3.field9018 = this.field9018;
            arg3.field9000 = this.field9000;
            arg3.field9004 = this.field9004;
            arg3.field9029 = true;
        } else {
            arg3.field9029 = false;
        }
        arg3.field9046 = this.field9046;
        arg3.field9099 = this.field9099;
        arg3.field9008 = this.field9008;
        arg3.field9060 = this.field9060;
        arg3.field9090 = this.field9090;
        return arg3;
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "()V")
    public final void method156() {
        field9080++;
        if (this.field9063 <= 0 || this.field9089 <= 0) {
            return;
        }
        this.method3636(false, 0);
        if ((this.field9024 & 0x10) == 0 && this.field9014.field813 == null) {
            this.method3643(false, 32767);
        }
        this.method3637(true);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BIZ)Lr;")
    public final class157 method163(byte arg0, int arg1, boolean arg2) {
        field9040++;
        class624 var4;
        class624 var5;
        if (arg0 == 1) {
            var5 = this.field9095.field8263;
            var4 = this.field9095.field8231;
        } else if (arg0 == 2) {
            var4 = this.field9095.field8223;
            var5 = this.field9095.field8311;
        } else if (arg0 == 3) {
            var4 = this.field9095.field8318;
            var5 = this.field9095.field8292;
        } else if (arg0 == 4) {
            var4 = this.field9095.field8298;
            var5 = this.field9095.field8304;
        } else if (arg0 == 5) {
            var5 = this.field9095.field8331;
            var4 = this.field9095.field8289;
        } else {
            var5 = var4 = new class624(this.field9095);
        }
        return this.method3641(arg2, var4, arg1, var5, 22271, arg0 != 0);
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V")
    public final void method141(int arg0) {
        field9042++;
        int var2 = class1.field2[arg0];
        int var3 = class1.field7[arg0];
        for (int var4 = 0; var4 < this.field9021; var4++) {
            int var5 = this.field9081[var4] * var3 + this.field9001[var4] * var2 >> 15;
            this.field9001[var4] = this.field9001[var4] * var3 - (this.field9081[var4] * var2) >> 15;
            this.field9081[var4] = var5;
        }
        this.field9029 = false;
        if (this.field9087 != null) {
            this.field9087.field8705 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lm;Lkn;I)V")
    public final void method154(class163 arg0, class631 arg1, int arg2) {
        field9011++;
        if (this.field9063 == 0) {
            return;
        }
        class266 var4 = this.field9095.field8321;
        if (!this.field9029) {
            this.method3640(-9369);
        }
        class266 var5 = (class266) arg0;
        this.method3642((byte) -90, var5);
        class1.field17 = var4.field3717 * var5.field3720 + var4.field3730 * var5.field3724 + var4.field3727 * var5.field3703 + var4.field3720;
        class526.field7395 = var4.field3717 * var5.field3730 + var4.field3730 * var5.field3705 + var4.field3727 * var5.field3712;
        float var6 = (float) this.field9093 * class526.field7395 + class1.field17;
        float var7 = (float) this.field9018 * class526.field7395 + class1.field17;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var8 = (float) this.field9051 + var6;
            var9 = var7 - (float) this.field9051;
        } else {
            var8 = (float) this.field9051 + var7;
            var9 = (float) (-this.field9051) + var6;
        }
        if ((var9 >= this.field9095.field8308) || ((float) this.field9095.field8334 >= var8)) {
            return;
        }
        class397.field5667 = var4.field3731 * var5.field3720 + var4.field3712 * var5.field3724 + var4.field3711 * var5.field3703 + var4.field3703;
        class187.field2620 = var4.field3731 * var5.field3730 + var4.field3712 * var5.field3705 + var4.field3711 * var5.field3712;
        float var10 = (float) this.field9093 * class187.field2620 + class397.field5667;
        float var11 = (float) this.field9018 * class187.field2620 + class397.field5667;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) (-this.field9051) + var11) * (float) this.field9095.field8243;
            var13 = ((float) this.field9051 + var10) * (float) this.field9095.field8243;
        } else {
            var13 = ((float) this.field9051 + var11) * (float) this.field9095.field8243;
            var12 = ((float) (-this.field9051) + var10) * (float) this.field9095.field8243;
        }
        if ((this.field9095.field8326 <= var12 / var8) || (var13 / var8 <= this.field9095.field8268)) {
            return;
        }
        class291.field4003 = var4.field3706 * var5.field3720 + var4.field3715 * var5.field3703 + var4.field3705 * var5.field3724 + var4.field3724;
        class270.field3769 = var4.field3706 * var5.field3730 + var4.field3715 * var5.field3712 + var4.field3705 * var5.field3705;
        float var14 = (float) this.field9093 * class270.field3769 + class291.field4003;
        float var15 = (float) this.field9018 * class270.field3769 + class291.field4003;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) (-this.field9051) + var15) * (float) this.field9095.field8330;
            var17 = ((float) this.field9051 + var14) * (float) this.field9095.field8330;
        } else {
            var16 = (var14 - (float) this.field9051) * (float) this.field9095.field8330;
            var17 = ((float) this.field9051 + var15) * (float) this.field9095.field8330;
        }
        if ((var16 / var8 >= this.field9095.field8342) || (var17 / var8 <= this.field9095.field8270)) {
            return;
        }
        if (arg1 != null || this.field9099 != null) {
            class253.field3503 = var4.field3706 * var5.field3727 + var4.field3715 * var5.field3711 + var4.field3705 * var5.field3715;
            class145.field2242 = var4.field3717 * var5.field3727 + var4.field3730 * var5.field3715 + var4.field3727 * var5.field3711;
            class147.field2267 = var4.field3706 * var5.field3717 + var4.field3715 * var5.field3731 + var4.field3705 * var5.field3706;
            class393.field5551 = var4.field3731 * var5.field3717 + var4.field3712 * var5.field3706 + var4.field3711 * var5.field3731;
            class169.field2445 = var4.field3717 * var5.field3717 + var4.field3730 * var5.field3706 + var4.field3727 * var5.field3731;
            class224.field3213 = var4.field3731 * var5.field3727 + var4.field3712 * var5.field3715 + var4.field3711 * var5.field3711;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field9065 + this.field9000 >> 1;
            int var21 = this.field9053 + this.field9004 >> 1;
            int var22 = (int) ((float) var21 * class393.field5551 + (float) this.field9093 * class187.field2620 + (float) var20 * class224.field3213 + class397.field5667);
            int var23 = (int) ((float) var21 * class147.field2267 + (float) this.field9093 * class270.field3769 + (float) var20 * class253.field3503 + class291.field4003);
            int var24 = (int) ((float) var21 * class169.field2445 + (float) this.field9093 * class526.field7395 + (float) var20 * class145.field2242 + class1.field17);
            if (var24 < this.field9095.field8334) {
                var18 = true;
            } else {
                arg1.field9236 = this.field9095.field8243 * var22 / var24 + this.field9095.field8299;
                arg1.field9235 = this.field9095.field8330 * var23 / var24 + this.field9095.field8226;
            }
            int var25 = (int) ((float) var21 * class393.field5551 + (float) this.field9018 * class187.field2620 + (float) var20 * class224.field3213 + class397.field5667);
            int var26 = (int) ((float) var21 * class147.field2267 + (float) this.field9018 * class270.field3769 + (float) var20 * class253.field3503 + class291.field4003);
            int var27 = (int) ((float) var21 * class169.field2445 + (float) this.field9018 * class526.field7395 + (float) var20 * class145.field2242 + class1.field17);
            if (var27 < this.field9095.field8334) {
                var18 = true;
            } else {
                arg1.field9234 = this.field9095.field8226 + (this.field9095.field8330 * var26 / var27);
                arg1.field9237 = this.field9095.field8243 * var25 / var27 + this.field9095.field8299;
            }
            if (var18) {
                if (this.field9095.field8334 > var24 && var27 < this.field9095.field8334) {
                    var19 = false;
                } else if (this.field9095.field8334 > var24) {
                    int var31 = (var27 - this.field9095.field8334 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field9236 = this.field9095.field8243 * var32 / this.field9095.field8334 + this.field9095.field8299;
                    arg1.field9235 = this.field9095.field8226 + (this.field9095.field8330 * var33 / this.field9095.field8334);
                } else if (this.field9095.field8334 > var27) {
                    int var28 = (var24 - this.field9095.field8334 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    arg1.field9236 = this.field9095.field8243 * var29 / this.field9095.field8334 + this.field9095.field8299;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field9235 = this.field9095.field8330 * var30 / this.field9095.field8334 + this.field9095.field8226;
                }
            }
            if (var19) {
                if (var24 <= var27) {
                    arg1.field9233 = (var25 + this.field9051) * this.field9095.field8243 / var27 + this.field9095.field8299 - arg1.field9237;
                } else {
                    arg1.field9233 = (this.field9051 + var22) * this.field9095.field8243 / var24 + this.field9095.field8299 - arg1.field9236;
                }
                arg1.field9232 = true;
            }
        }
        this.field9095.method3329(8);
        this.field9095.method3385(var5, -104);
        this.method3644(0);
        this.field9095.method3334(20354);
        this.method3645(-84);
    }

    @OriginalMember(owner = "client!ww", name = "wa", descriptor = "()I")
    public final int method139() {
        if (!this.field9029) {
            this.method3640(-9369);
        }
        field9066++;
        return this.field9000;
    }

    @OriginalMember(owner = "client!ww", name = "TA", descriptor = "()I")
    public final int method133() {
        if (!this.field9029) {
            this.method3640(-9369);
        }
        field9052++;
        return this.field9093;
    }

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "()I")
    public final int method150() {
        if (!this.field9029) {
            this.method3640(-9369);
        }
        field9076++;
        return this.field9051;
    }

    @OriginalMember(owner = "client!ww", name = "EA", descriptor = "(Lk;)Lk;")
    public final class485 method149(class485 arg0) {
        field9086++;
        if (this.field9063 == 0) {
            return null;
        }
        if (!this.field9029) {
            this.method3640(-9369);
        }
        int var2;
        int var3;
        if (this.field9095.field8256 > 0) {
            var2 = this.field9000 - (this.field9095.field8256 * this.field9018 >> 8) >> this.field9095.field8198;
            var3 = this.field9065 - (this.field9095.field8256 * this.field9093 >> 8) >> this.field9095.field8198;
        } else {
            var2 = this.field9000 - (this.field9095.field8256 * this.field9093 >> 8) >> this.field9095.field8198;
            var3 = this.field9065 - (this.field9095.field8256 * this.field9018 >> 8) >> this.field9095.field8198;
        }
        int var4;
        int var5;
        if (this.field9095.field8228 <= 0) {
            var4 = this.field9004 - (this.field9095.field8228 * this.field9093 >> 8) >> this.field9095.field8198;
            var5 = this.field9053 - (this.field9095.field8228 * this.field9018 >> 8) >> this.field9095.field8198;
        } else {
            var4 = this.field9004 - (this.field9095.field8228 * this.field9018 >> 8) >> this.field9095.field8198;
            var5 = this.field9053 - (this.field9095.field8228 * this.field9093 >> 8) >> this.field9095.field8198;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class302 var8 = (class302) arg0;
        class302 var9;
        if (var8 != null && var8.method1923(var7, -60, var6)) {
            var9 = var8;
            var8.method1920((byte) 73);
        } else {
            var9 = new class302(this.field9095, var6, var7);
        }
        var9.method1919(var4, -1, var2, var3, var5);
        this.method3638(-95, var9);
        return var9;
    }

    @OriginalMember(owner = "client!ww", name = "pa", descriptor = "(SS)V")
    public final void method137(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field9071; var3++) {
            if (this.field9103[var3] == arg0) {
                this.field9103[var3] = arg1;
            }
        }
        field9032++;
        if (this.field9099 != null) {
            for (int var4 = 0; var4 < this.field9073; var4++) {
                class638 var5 = this.field9099[var4];
                class597 var6 = this.field9101[var4];
                var6.field8635 = var6.field8635 & 0xFF000000 | class118.field1940[this.field9103[var5.field9288] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field9082 != null) {
            this.field9082.field8705 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lm;Lkn;II)V")
    public final void method127(class163 arg0, class631 arg1, int arg2, int arg3) {
        field9059++;
        if (this.field9063 == 0) {
            return;
        }
        class266 var5 = this.field9095.field8321;
        class266 var6 = (class266) arg0;
        if (!this.field9029) {
            this.method3640(-9369);
        }
        class1.field17 = var5.field3717 * var6.field3720 + var5.field3730 * var6.field3724 + var5.field3727 * var6.field3703 + var5.field3720;
        class526.field7395 = var5.field3717 * var6.field3730 + var5.field3730 * var6.field3705 + var5.field3727 * var6.field3712;
        float var7 = (float) this.field9093 * class526.field7395 + class1.field17;
        float var8 = (float) this.field9018 * class526.field7395 + class1.field17;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var10 = var8 - (float) this.field9051;
            var9 = (float) this.field9051 + var7;
        } else {
            var9 = (float) this.field9051 + var8;
            var10 = (float) (-this.field9051) + var7;
        }
        if ((var10 >= this.field9095.field8247) || (var9 <= (float) this.field9095.field8334)) {
            return;
        }
        class187.field2620 = var5.field3731 * var6.field3730 + var5.field3712 * var6.field3705 + var5.field3711 * var6.field3712;
        class397.field5667 = var5.field3731 * var6.field3720 + var5.field3712 * var6.field3724 + var5.field3711 * var6.field3703 + var5.field3703;
        float var11 = (float) this.field9093 * class187.field2620 + class397.field5667;
        float var12 = (float) this.field9018 * class187.field2620 + class397.field5667;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) (-this.field9051) + var12) * (float) this.field9095.field8243;
            var14 = ((float) this.field9051 + var11) * (float) this.field9095.field8243;
        } else {
            var14 = ((float) this.field9051 + var12) * (float) this.field9095.field8243;
            var13 = (var11 - (float) this.field9051) * (float) this.field9095.field8243;
        }
        if ((this.field9095.field8326 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field9095.field8268)) {
            return;
        }
        class270.field3769 = var5.field3706 * var6.field3730 + var5.field3715 * var6.field3712 + var5.field3705 * var6.field3705;
        class291.field4003 = var5.field3706 * var6.field3720 + var5.field3715 * var6.field3703 + var5.field3705 * var6.field3724 + var5.field3724;
        float var15 = (float) this.field9093 * class270.field3769 + class291.field4003;
        float var16 = (float) this.field9018 * class270.field3769 + class291.field4003;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var17 = ((float) (-this.field9051) + var16) * (float) this.field9095.field8330;
            var18 = ((float) this.field9051 + var15) * (float) this.field9095.field8330;
        } else {
            var17 = ((float) (-this.field9051) + var15) * (float) this.field9095.field8330;
            var18 = ((float) this.field9051 + var16) * (float) this.field9095.field8330;
        }
        if ((var17 / (float) arg2 >= this.field9095.field8342) || (this.field9095.field8270 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field9099 != null) {
            class393.field5551 = var5.field3731 * var6.field3717 + var5.field3712 * var6.field3706 + var5.field3711 * var6.field3731;
            class145.field2242 = var5.field3717 * var6.field3727 + var5.field3730 * var6.field3715 + var5.field3727 * var6.field3711;
            class169.field2445 = var5.field3717 * var6.field3717 + var5.field3730 * var6.field3706 + var5.field3727 * var6.field3731;
            class253.field3503 = var5.field3706 * var6.field3727 + var5.field3715 * var6.field3711 + var5.field3705 * var6.field3715;
            class224.field3213 = var5.field3731 * var6.field3727 + var5.field3712 * var6.field3715 + var5.field3711 * var6.field3711;
            class147.field2267 = var5.field3706 * var6.field3717 + var5.field3715 * var6.field3731 + var5.field3705 * var6.field3706;
        }
        if (arg1 != null) {
            int var19 = this.field9065 + this.field9000 >> 1;
            int var20 = this.field9053 + this.field9004 >> 1;
            int var21 = (int) ((float) var20 * class393.field5551 + (float) this.field9093 * class187.field2620 + (float) var19 * class224.field3213 + class397.field5667);
            int var22 = (int) ((float) var20 * class147.field2267 + (float) this.field9093 * class270.field3769 + (float) var19 * class253.field3503 + class291.field4003);
            int var23 = (int) ((float) var20 * class169.field2445 + (float) this.field9093 * class526.field7395 + (float) var19 * class145.field2242 + class1.field17);
            int var24 = (int) ((float) var20 * class393.field5551 + (float) this.field9018 * class187.field2620 + (float) var19 * class224.field3213 + class397.field5667);
            int var25 = (int) ((float) var20 * class147.field2267 + (float) this.field9018 * class270.field3769 + (float) var19 * class253.field3503 + class291.field4003);
            arg1.field9236 = this.field9095.field8243 * var21 / arg2 + this.field9095.field8299;
            arg1.field9235 = this.field9095.field8226 + (this.field9095.field8330 * var22 / arg2);
            arg1.field9237 = this.field9095.field8243 * var24 / arg2 + this.field9095.field8299;
            arg1.field9234 = this.field9095.field8330 * var25 / arg2 + this.field9095.field8226;
            int var26 = (int) ((float) var20 * class169.field2445 + (float) this.field9018 * class526.field7395 + (float) var19 * class145.field2242 + class1.field17);
            if (var23 < this.field9095.field8334 && this.field9095.field8334 > var26) {
                arg1.field9232 = true;
                arg1.field9233 = (this.field9051 + var21) * this.field9095.field8243 / arg2 + (this.field9095.field8299 - arg1.field9236);
            }
        }
        this.field9095.method3365((float) arg2, -128);
        this.field9095.method3347((byte) 38);
        this.field9095.method3385(var6, -28);
        this.method3644(0);
        this.field9095.method3334(20354);
        this.method3645(-42);
    }

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "()[Lig;")
    public final class203[] method161() {
        field9092++;
        return this.field9012;
    }

    @OriginalMember(owner = "client!ww", name = "D", descriptor = "(I)V")
    public final void method155(int arg0) {
        field9064++;
        int var2 = class1.field2[arg0];
        int var3 = class1.field7[arg0];
        for (int var4 = 0; var4 < this.field9021; var4++) {
            int var5 = this.field9001[var4] * var3 - (this.field9034[var4] * var2) >> 15;
            this.field9034[var4] = this.field9034[var4] * var3 + this.field9001[var4] * var2 >> 15;
            this.field9001[var4] = var5;
        }
        if (this.field9087 != null) {
            this.field9087.field8705 = null;
        }
        this.field9029 = false;
    }

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "(I)V")
    public final void method132(int arg0) {
        field9026++;
        int var2 = class1.field2[arg0];
        int var3 = class1.field7[arg0];
        for (int var4 = 0; var4 < this.field9021; var4++) {
            int var7 = this.field9034[var4] * var2 + (this.field9081[var4] * var3) >> 15;
            this.field9034[var4] = this.field9034[var4] * var3 - this.field9081[var4] * var2 >> 15;
            this.field9081[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field9063; var5++) {
            int var6 = this.field9094[var5] * var3 + this.field9061[var5] * var2 >> 15;
            this.field9061[var5] = (short) (this.field9061[var5] * var3 - (this.field9094[var5] * var2) >> 15);
            this.field9094[var5] = (short) var6;
        }
        if (this.field9056 == null && this.field9082 != null) {
            this.field9082.field8705 = null;
        }
        if (this.field9056 != null) {
            this.field9056.field8705 = null;
        }
        if (this.field9087 != null) {
            this.field9087.field8705 = null;
        }
        this.field9029 = false;
    }

    @OriginalMember(owner = "client!ww", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public final void method145(int arg0, int arg1, class174 arg2, class174 arg3, int arg4, int arg5, int arg6) {
        field9054++;
        if (!this.field9029) {
            this.method3640(-9369);
        }
        int var8 = this.field9000 + arg4;
        int var9 = this.field9065 + arg4;
        int var10 = this.field9004 + arg6;
        int var11 = this.field9053 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (var9 + arg2.field2504 >> arg2.field2506) >= arg2.field2505 || var10 < 0 || arg2.field2504 + var11 >> arg2.field2506 >= arg2.field2503) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field2505 <= arg3.field2504 + var9 >> arg3.field2506 || var10 < 0 || arg3.field2504 + var11 >> arg3.field2506 >= arg3.field2503) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field2506;
            int var13 = arg2.field2504 - (1 - var9) >> arg2.field2506;
            int var14 = var10 >> arg2.field2506;
            int var15 = arg2.field2504 + var11 - 1 >> arg2.field2506;
            if (arg2.method1104(var12, var14) == arg5 && arg5 == arg2.method1104(var13, var14) && arg5 == arg2.method1104(var12, var15) && arg2.method1104(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field9021; var16++) {
                this.field9001[var16] = this.field9001[var16] + arg2.method1105(this.field9081[var16] + arg4, this.field9034[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field9093;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field9021; var18++) {
                int var19 = (this.field9001[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field9001[var18] += (arg1 - var19) * (arg2.method1105(this.field9081[var18] + arg4, this.field9034[var18] - -arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var29 = (arg1 & 0xFF) * 4;
            int var30 = ((arg1 & 0xFF34) >> 8) * 4;
            int var31 = arg1 >> 16 & 0xFF << 6;
            int var32 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var29 >> 1) < 0 || (var29 >> 1) + arg4 + arg2.field2504 >= arg2.field2505 << arg2.field2506 || (arg6 - (var30 >> 1)) < 0 || ((var30 >> 1) + arg2.field2504 + arg6) >= (arg2.field2503 << arg2.field2506)) {
                return;
            }
            this.method1011(arg5, arg2, var31, arg4, var30, arg6, var32, var29, 0);
        } else if (arg0 == 4) {
            int var20 = this.field9018 - this.field9093;
            for (int var21 = 0; var21 < this.field9021; var21++) {
                this.field9001[var21] = var20 + this.field9001[var21] + arg3.method1105(this.field9081[var21] - -arg4, this.field9034[var21] + arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var22 = this.field9018 - this.field9093;
            for (int var23 = 0; var23 < this.field9021; var23++) {
                int var24 = this.field9081[var23] + arg4;
                int var25 = this.field9034[var23] + arg6;
                int var26 = arg2.method1105(var24, var25);
                int var27 = arg3.method1105(var24, var25);
                int var28 = var26 - var27 - arg1;
                this.field9001[var23] = ((this.field9001[var23] << 8) / var22 * var28 >> 8) + var26 - arg5;
            }
        }
        if (this.field9087 != null) {
            this.field9087.field8705 = null;
        }
        this.field9029 = false;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLen;)V")
    private final void method3642(byte arg0, class266 arg1) {
        if (arg0 != -90) {
            this.field9075 = null;
        }
        if (this.field9012 != null) {
            for (int var3 = 0; var3 < this.field9012.length; var3++) {
                class203 var4 = this.field9012[var3];
                class203 var5 = var4;
                if (var4.field2841 != null) {
                    var5 = var4.field2841;
                }
                var5.field2844 = (int) ((float) this.field9034[var4.field2836] * arg1.field3731 + (float) this.field9081[var4.field2836] * arg1.field3711 + (float) this.field9001[var4.field2836] * arg1.field3712 + arg1.field3703);
                var5.field2846 = (int) ((float) this.field9034[var4.field2836] * arg1.field3706 + (float) this.field9081[var4.field2836] * arg1.field3715 + (float) this.field9001[var4.field2836] * arg1.field3705 + arg1.field3724);
                var5.field2852 = (int) ((float) this.field9034[var4.field2836] * arg1.field3717 + (float) this.field9081[var4.field2836] * arg1.field3727 + (float) this.field9001[var4.field2836] * arg1.field3730 + arg1.field3720);
                var5.field2848 = (int) ((float) this.field9034[var4.field2839] * arg1.field3731 + (float) this.field9081[var4.field2839] * arg1.field3711 + (float) this.field9001[var4.field2839] * arg1.field3712 + arg1.field3703);
                var5.field2840 = (int) ((float) this.field9034[var4.field2839] * arg1.field3706 + (float) this.field9081[var4.field2839] * arg1.field3715 + (float) this.field9001[var4.field2839] * arg1.field3705 + arg1.field3724);
                var5.field2851 = (int) ((float) this.field9034[var4.field2839] * arg1.field3717 + (float) this.field9081[var4.field2839] * arg1.field3727 + (float) this.field9001[var4.field2839] * arg1.field3730 + arg1.field3720);
                var5.field2833 = (int) ((float) this.field9034[var4.field2843] * arg1.field3731 + (float) this.field9081[var4.field2843] * arg1.field3711 + (float) this.field9001[var4.field2843] * arg1.field3712 + arg1.field3703);
                var5.field2849 = (int) ((float) this.field9034[var4.field2843] * arg1.field3706 + (float) this.field9081[var4.field2843] * arg1.field3715 + (float) this.field9001[var4.field2843] * arg1.field3705 + arg1.field3724);
                var5.field2847 = (int) ((float) this.field9034[var4.field2843] * arg1.field3717 + (float) this.field9081[var4.field2843] * arg1.field3727 + (float) this.field9001[var4.field2843] * arg1.field3730 + arg1.field3720);
            }
        }
        field9013++;
        if (this.field9046 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field9046.length; var6++) {
            class225 var7 = this.field9046[var6];
            class225 var8 = var7;
            if (var7.field3224 != null) {
                var8 = var7.field3224;
            }
            if (var7.field3228 == null) {
                var7.field3228 = arg1.method1050();
            } else {
                var7.field3228.method1049(arg1);
            }
            var8.field3223 = (int) ((float) this.field9034[var7.field3227] * arg1.field3731 + (float) this.field9081[var7.field3227] * arg1.field3711 + (float) this.field9001[var7.field3227] * arg1.field3712 + arg1.field3703);
            var8.field3225 = (int) ((float) this.field9034[var7.field3227] * arg1.field3706 + (float) this.field9081[var7.field3227] * arg1.field3715 + (float) this.field9001[var7.field3227] * arg1.field3705 + arg1.field3724);
            var8.field3220 = (int) ((float) this.field9034[var7.field3227] * arg1.field3717 + (float) this.field9081[var7.field3227] * arg1.field3727 + (float) this.field9001[var7.field3227] * arg1.field3730 + arg1.field3720);
        }
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(ZI)V")
    private final void method3643(boolean arg0, int arg1) {
        field8999++;
        if (this.field9095.field8288.field138.length >= this.field9089 * 6) {
            this.field9095.field8288.field165 = 0;
        } else {
            this.field9095.field8288 = new class541(this.field9089 * 6 + 600);
        }
        class541 var3 = this.field9095.field8288;
        if (arg1 != 32767) {
            return;
        }
        if (this.field9095.field8254) {
            for (int var5 = 0; var5 < this.field9089; var5++) {
                var3.method84(this.field9010[var5], (byte) -123);
                var3.method84(this.field9096[var5], (byte) -110);
                var3.method84(this.field9075[var5], (byte) -120);
            }
        } else {
            for (int var4 = 0; var4 < this.field9089; var4++) {
                var3.method95(arg1 + 1412176745, this.field9010[var4]);
                var3.method95(1412209512, this.field9096[var4]);
                var3.method95(1412209512, this.field9075[var4]);
            }
        }
        if (var3.field165 == 0) {
            return;
        }
        if (arg0) {
            if (this.field9104 == null) {
                this.field9104 = this.field9095.method3391(7681, var3.field165, true, var3.field138, 5123);
            } else {
                this.field9104.method1998((byte) 126, var3.field138, var3.field165, 5123);
            }
            this.field9014.field813 = this.field9104;
        } else {
            this.field9014.field813 = this.field9095.method3391(7681, var3.field165, false, var3.field138, 5123);
        }
        if (!arg0) {
            this.field9072 = true;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIII)V")
    public final void method129(int arg0, int arg1, int arg2, int arg3) {
        field9106++;
        for (int var5 = 0; var5 < this.field9071; var5++) {
            int var9 = this.field9103[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3CD) >> 7;
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
            this.field9103[var5] = (short) class73.method578(class73.method578(var11 << 7, var10 << 10), var12);
        }
        if (this.field9099 != null) {
            for (int var6 = 0; var6 < this.field9073; var6++) {
                class638 var7 = this.field9099[var6];
                class597 var8 = this.field9101[var6];
                var8.field8635 = class118.field1940[this.field9103[var7.field9288] & 0xFFFF] & 0xFFFFFF | var8.field8635 & 0xFF000000;
            }
        }
        if (this.field9082 != null) {
            this.field9082.field8705 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "MA", descriptor = "()V")
    public final void method126() {
        for (int var1 = 0; var1 < this.field9057; var1++) {
            this.field9081[var1] = this.field9081[var1] + 7 >> 4;
            this.field9001[var1] = this.field9001[var1] + 7 >> 4;
            this.field9034[var1] = this.field9034[var1] + 7 >> 4;
        }
        field9097++;
        if (this.field9087 != null) {
            this.field9087.field8705 = null;
        }
        this.field9029 = false;
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "()[Lrn;")
    public final class225[] method131() {
        field9005++;
        return this.field9046;
    }

    @OriginalMember(owner = "client!ww", name = "sa", descriptor = "()Z")
    public final boolean method146() {
        field9038++;
        if (this.field9060 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field9057; var1++) {
            this.field9081[var1] <<= 0x4;
            this.field9001[var1] <<= 0x4;
            this.field9034[var1] <<= 0x4;
        }
        class606.field8734 = 0;
        class392.field5535 = 0;
        class500.field6970 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "()Z")
    public final boolean method169() {
        field9077++;
        if (this.field9009 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field9009.length; var1++) {
            if (this.field9009[var1] != -1 && !this.field9095.field2924.method188(this.field9009[var1], -112)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ww", name = "ga", descriptor = "()I")
    public final int method168() {
        field9083++;
        return this.field9049;
    }

    @OriginalMember(owner = "client!ww", name = "I", descriptor = "(I)V")
    public final void method158(int arg0) {
        field9031++;
        this.field9049 = (short) arg0;
        if (this.field9082 != null) {
            this.field9082.field8705 = null;
        }
        if (this.field9056 != null) {
            this.field9056.field8705 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "V", descriptor = "(III)V")
    public final void method162(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field9021; var4++) {
            if (arg0 != 128) {
                this.field9081[var4] = this.field9081[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field9001[var4] = this.field9001[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field9034[var4] = this.field9034[var4] * arg2 >> 7;
            }
        }
        field9016++;
        this.field9029 = false;
        if (this.field9087 != null) {
            this.field9087.field8705 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public final void method136(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field9055++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class392.field5535 = 0;
            class500.field6970 = 0;
            int var13 = 0;
            class606.field8734 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field9060.length) {
                    int[] var16 = this.field9060[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field9041 == null || (this.field9041[var18] & arg6) != 0) {
                            class392.field5535 += this.field9081[var18];
                            class606.field8734 += this.field9001[var18];
                            class500.field6970 += this.field9034[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class500.field6970 = var12;
                class606.field8734 = var11;
                class392.field5535 = var10;
            } else {
                class500.field6970 = class500.field6970 / var13 + var12;
                class246.field3439 = true;
                class606.field8734 = class606.field8734 / var13 + var11;
                class392.field5535 = class392.field5535 / var13 + var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + (arg7[1] * arg3 + arg7[0] * arg2 + 16384) >> 15;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 16384 >> 15;
                int var21 = arg7[6] * arg2 + arg7[7] * arg3 + (arg7[8] * arg4) + 16384 >> 15;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field9060.length) {
                    int[] var27 = this.field9060[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field9041 == null || (arg6 & this.field9041[var29]) != 0) {
                            this.field9081[var29] += var23;
                            this.field9001[var29] += var22;
                            this.field9034[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field9060.length) {
                        int[] var110 = this.field9060[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field9041 == null || (arg6 & this.field9041[var112]) != 0) {
                                this.field9081[var112] -= class392.field5535;
                                this.field9001[var112] -= class606.field8734;
                                this.field9034[var112] -= class500.field6970;
                                if (arg4 != 0) {
                                    int var113 = class1.field2[arg4];
                                    int var114 = class1.field7[arg4];
                                    int var115 = this.field9081[var112] * var114 + this.field9001[var112] * var113 + 32767 >> 15;
                                    this.field9001[var112] = this.field9001[var112] * var114 + 32767 - (this.field9081[var112] * var113) >> 15;
                                    this.field9081[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class1.field2[arg2];
                                    int var117 = class1.field7[arg2];
                                    int var118 = this.field9001[var112] * var117 + 32767 - this.field9034[var112] * var116 >> 15;
                                    this.field9034[var112] = this.field9001[var112] * var116 + (this.field9034[var112] * var117) + 32767 >> 15;
                                    this.field9001[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class1.field2[arg3];
                                    int var120 = class1.field7[arg3];
                                    int var121 = this.field9081[var112] * var120 + this.field9034[var112] * var119 + 32767 >> 15;
                                    this.field9034[var112] = this.field9034[var112] * var120 + 32767 - (this.field9081[var112] * var119) >> 15;
                                    this.field9081[var112] = var121;
                                }
                                this.field9081[var112] += class392.field5535;
                                this.field9001[var112] += class606.field8734;
                                this.field9034[var112] += class500.field6970;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field9060.length > var92) {
                            int[] var93 = this.field9060[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field9041 == null || (arg6 & this.field9041[var95]) != 0) {
                                    int var96 = this.field9008[var95];
                                    int var97 = this.field9008[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field9022[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class1.field2[arg4];
                                            int var101 = class1.field7[arg4];
                                            int var102 = this.field9094[var99] * var101 + (this.field9105[var99] * var100 + 32767) >> 15;
                                            this.field9105[var99] = (short) (this.field9105[var99] * var101 + 32767 - (this.field9094[var99] * var100) >> 15);
                                            this.field9094[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class1.field2[arg2];
                                            int var104 = class1.field7[arg2];
                                            int var105 = this.field9105[var99] * var104 + 32767 - this.field9061[var99] * var103 >> 15;
                                            this.field9061[var99] = (short) (this.field9105[var99] * var103 + this.field9061[var99] * var104 + 32767 >> 15);
                                            this.field9105[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class1.field2[arg3];
                                            int var107 = class1.field7[arg3];
                                            int var108 = this.field9094[var99] * var107 + this.field9061[var99] * var106 + 32767 >> 15;
                                            this.field9061[var99] = (short) (this.field9061[var99] * var107 + 32767 - (this.field9094[var99] * var106) >> 15);
                                            this.field9094[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field9056 == null && this.field9082 != null) {
                        this.field9082.field8705 = null;
                    }
                    if (this.field9056 != null) {
                        this.field9056.field8705 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class246.field3439) {
                    int var36 = arg7[3] * class606.field8734 + (arg7[0] * class392.field5535 + (arg7[6] * class500.field6970)) + 16384 >> 15;
                    int var37 = arg7[4] * class606.field8734 + (arg7[1] * class392.field5535 + (arg7[7] * class500.field6970)) + 16384 >> 15;
                    int var38 = var34 + var37;
                    int var39 = arg7[5] * class606.field8734 + (arg7[2] * class392.field5535 + (arg7[8] * class500.field6970)) + 16384 >> 15;
                    int var40 = var33 + var36;
                    class392.field5535 = var40;
                    class606.field8734 = var38;
                    int var41 = var35 + var39;
                    class246.field3439 = false;
                    class500.field6970 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class1.field7[arg2];
                int var44 = class1.field2[arg2];
                int var45 = class1.field7[arg3];
                int var46 = class1.field2[arg3];
                int var47 = class1.field7[arg4];
                int var48 = class1.field2[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[6] = -var46 * var47 + (var45 * var50) + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[5] = -var44;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[7] = var46 * var48 + (var45 * var49) + 16384 >> 15;
                var42[1] = -var45 * var48 - (-(var46 * var49) - 16384) >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                int var51 = var42[1] * -class606.field8734 + var42[0] * -class392.field5535 + var42[2] * -class500.field6970 + 16384 >> 15;
                int var52 = var42[3] * -class392.field5535 + var42[5] * -class500.field6970 + var42[4] * -class606.field8734 + 16384 >> 15;
                int var53 = var42[6] * -class392.field5535 + var42[7] * -class606.field8734 + var42[8] * -class500.field6970 + 16384 >> 15;
                int var54 = class392.field5535 + var51;
                int var55 = class606.field8734 + var52;
                int var56 = var53 + class500.field6970;
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
                int var59 = var42[0] * var33 + var42[1] * var34 + var42[2] * var35 + 16384 >> 15;
                int var60 = var42[3] * var33 + var42[4] * var34 + var42[5] * var35 + 16384 >> 15;
                int var61 = var55 + var60;
                int var62 = var42[8] * var35 + (var42[6] * var33 + (var42[7] * var34)) + 16384 >> 15;
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
                int var67 = arg7[2] * var64 + arg7[0] * var63 + arg7[1] * var61 + 16384 >> 15;
                int var68 = arg7[5] * var64 + arg7[4] * var61 + arg7[3] * var63 + 16384 >> 15;
                int var69 = arg7[8] * var64 + arg7[7] * var61 + (arg7[6] * var63 - -16384) >> 15;
                int var70 = var31 + var68;
                int var71 = var30 + var67;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field9060.length > var74) {
                        int[] var75 = this.field9060[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field9041 == null || (this.field9041[var77] & arg6) != 0) {
                                int var78 = this.field9081[var77] * var65[0] + this.field9034[var77] * var65[2] + this.field9001[var77] * var65[1] + 16384 >> 15;
                                int var79 = this.field9001[var77] * var65[4] + (this.field9081[var77] * var65[3] + (this.field9034[var77] * var65[5]) + 16384) >> 15;
                                int var80 = var71 + var78;
                                int var81 = var70 + var79;
                                int var82 = this.field9081[var77] * var65[6] + 16384 - (-(this.field9001[var77] * var65[7]) - this.field9034[var77] * var65[8]) >> 15;
                                int var83 = var72 + var82;
                                this.field9081[var77] = var80;
                                this.field9001[var77] = var81;
                                this.field9034[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field9060.length) {
                        int[] var124 = this.field9060[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field9041 == null || (arg6 & this.field9041[var126]) != 0) {
                                this.field9081[var126] -= class392.field5535;
                                this.field9001[var126] -= class606.field8734;
                                this.field9034[var126] -= class500.field6970;
                                this.field9081[var126] = this.field9081[var126] * arg2 >> 7;
                                this.field9001[var126] = this.field9001[var126] * arg3 >> 7;
                                this.field9034[var126] = this.field9034[var126] * arg4 >> 7;
                                this.field9081[var126] += class392.field5535;
                                this.field9001[var126] += class606.field8734;
                                this.field9034[var126] += class500.field6970;
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
                if (class246.field3439) {
                    int var133 = arg7[0] * class392.field5535 + arg7[3] * class606.field8734 + (arg7[6] * class500.field6970) + 16384 >> 15;
                    int var134 = arg7[7] * class500.field6970 + (arg7[1] * class392.field5535 - (-(arg7[4] * class606.field8734) - 16384)) >> 15;
                    int var135 = var131 + var134;
                    int var136 = var130 + var133;
                    int var137 = arg7[8] * class500.field6970 + arg7[5] * class606.field8734 + arg7[2] * class392.field5535 + 16384 >> 15;
                    int var138 = var132 + var137;
                    class392.field5535 = var136;
                    class606.field8734 = var135;
                    class246.field3439 = false;
                    class500.field6970 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class392.field5535 * var139 + 16384 >> 15;
                int var143 = -class606.field8734 * var140 + 16384 >> 15;
                int var144 = -class500.field6970 * var141 + 16384 >> 15;
                int var145 = class392.field5535 + var142;
                int var146 = class606.field8734 + var143;
                int var147 = class500.field6970 + var144;
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
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 16384 >> 15;
                    }
                }
                int var157 = arg7[1] * var153 + arg7[2] * var154 + arg7[0] * var152 + 16384 >> 15;
                int var158 = arg7[5] * var154 + arg7[4] * var153 + arg7[3] * var152 + 16384 >> 15;
                int var159 = var128 + var158;
                int var160 = arg7[8] * var154 + arg7[7] * var153 + arg7[6] * var152 + 16384 >> 15;
                int var161 = var127 + var157;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field9060.length > var164) {
                        int[] var165 = this.field9060[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field9041 == null || (arg6 & this.field9041[var167]) != 0) {
                                int var168 = this.field9081[var167] * var155[0] + this.field9001[var167] * var155[1] + this.field9034[var167] * var155[2] + 16384 >> 15;
                                int var169 = this.field9081[var167] * var155[3] + (this.field9034[var167] * var155[5]) + this.field9001[var167] * var155[4] + 16384 >> 15;
                                int var170 = this.field9081[var167] * var155[6] + (this.field9001[var167] * var155[7] + (this.field9034[var167] * var155[8])) + 16384 >> 15;
                                int var171 = var161 + var168;
                                int var172 = var159 + var169;
                                this.field9081[var167] = var171;
                                int var173 = var162 + var170;
                                this.field9001[var167] = var172;
                                this.field9034[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9090 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field9090.length > var181) {
                        int[] var182 = this.field9090[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field9098 == null || (this.field9098[var184] & arg6) != 0) {
                                int var185 = (this.field9044[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field9044[var184] = (byte) var185;
                                if (this.field9082 != null) {
                                    this.field9082.field8705 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field9099 != null) {
                    for (int var178 = 0; var178 < this.field9073; var178++) {
                        class638 var179 = this.field9099[var178];
                        class597 var180 = this.field9101[var178];
                        var180.field8635 = var180.field8635 & 0xFFFFFF | 255 - (this.field9044[var179.field9288] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field9090 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field9090.length) {
                        int[] var191 = this.field9090[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field9098 == null || (this.field9098[var193] & arg6) != 0) {
                                int var194 = this.field9103[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFC95) >> 10;
                                int var196 = (var194 & 0x396) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = var194 & 0x7F;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                int var200 = arg4 + var199;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field9103[var193] = (short) class73.method578(var200, class73.method578(var197 << 7, var198 << 10));
                                if (this.field9082 != null) {
                                    this.field9082.field8705 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field9099 != null) {
                    for (int var187 = 0; var187 < this.field9073; var187++) {
                        class638 var188 = this.field9099[var187];
                        class597 var189 = this.field9101[var187];
                        var189.field8635 = var189.field8635 & 0xFF000000 | class118.field1940[this.field9103[var188.field9288] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field9007 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field9007.length > var202) {
                        int[] var203 = this.field9007[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class597 var205 = this.field9101[var203[var204]];
                            var205.field8636 += arg2;
                            var205.field8626 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9007 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field9007.length > var207) {
                        int[] var208 = this.field9007[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class597 var210 = this.field9101[var208[var209]];
                            var210.field8631 = var210.field8631 * arg2 >> 7;
                            var210.field8628 = var210.field8628 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9007 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field9007.length) {
                    int[] var213 = this.field9007[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class597 var215 = this.field9101[var213[var214]];
                        var215.field8624 = var215.field8624 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)V")
    private final void method3644(int arg0) {
        field9078++;
        if (this.field9089 == 0) {
            return;
        }
        if (this.field9024 != 0) {
            this.method3636(true, 0);
        }
        this.method3636(false, arg0);
        if (this.field9014 != null) {
            if (this.field9014.field813 == null) {
                this.method3643((this.field9024 & 0x10) != 0, 32767);
            }
            if (this.field9014.field813 != null) {
                this.field9095.method3330(this.field9056 != null, (byte) 36);
                this.field9095.method3380(this.field9082, this.field9056, this.field9087, arg0 ^ 0x3AF9, this.field9102);
                int var2 = this.field9070.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field9070[var3];
                    int var5 = this.field9070[var3 + 1];
                    int var6 = this.field9009[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field9095.method3338((byte) 127, var6, this.field9056 != null);
                    this.field9095.method3366(this.field9014.field813, (var5 - var4) * 3, -22887, 4, var4 * 3);
                }
            }
        }
        this.method3637(true);
    }

    @OriginalMember(owner = "client!ww", name = "ca", descriptor = "(III)V")
    public final void method152(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field9021; var4++) {
            if (arg0 != 0) {
                this.field9081[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field9001[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field9034[var4] += arg2;
            }
        }
        field9088++;
        if (this.field9087 != null) {
            this.field9087.field8705 = null;
        }
        this.field9029 = false;
    }

    @OriginalMember(owner = "client!ww", name = "M", descriptor = "()I")
    public final int method160() {
        field9023++;
        return this.field9091;
    }

    @OriginalMember(owner = "client!ww", name = "L", descriptor = "(SS)V")
    public final void method130(short arg0, short arg1) {
        field9002++;
        class17 var3 = this.field9095.field2924;
        for (int var4 = 0; var4 < this.field9071; var4++) {
            if (this.field9009[var4] == arg0) {
                this.field9009[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class211 var7 = var3.method190((byte) -89, arg0 & 0xFFFF);
            var5 = var7.field2973;
            var6 = var7.field2975;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class211 var10 = var3.method190((byte) -89, arg1 & 0xFFFF);
            var9 = var10.field2975;
            var8 = var10.field2973;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field9099 != null) {
            for (int var11 = 0; var11 < this.field9073; var11++) {
                class638 var12 = this.field9099[var11];
                class597 var13 = this.field9101[var11];
                var13.field8635 = var13.field8635 & 0xFF000000 | class118.field1940[this.field9103[var12.field9288] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field9082 != null) {
            this.field9082.field8705 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ww", name = "U", descriptor = "()I")
    public final int method151() {
        field9048++;
        if (!this.field9029) {
            this.method3640(-9369);
        }
        return this.field9053;
    }

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "(I)V")
    private final void method3645(int arg0) {
        if (this.field9099 != null) {
            class266 var2 = this.field9095.field8197;
            float var3 = this.field9095.method1271();
            float var4 = this.field9095.method1326();
            this.field9095.method3384((byte) -125);
            this.field9095.method1309(false);
            this.field9095.method3330(false, (byte) 36);
            this.field9095.method3380(null, null, this.field9095.field8252, 15097, this.field9095.field8338);
            for (int var5 = 0; var5 < this.field9073; var5++) {
                class638 var6 = this.field9099[var5];
                class597 var7 = this.field9101[var5];
                if (!var6.field9295 || !this.field9095.method1328()) {
                    float var8 = (float) (this.field9081[var6.field9284] + this.field9081[var6.field9285] + this.field9081[var6.field9291]) * 0.3333333F;
                    float var9 = (float) (this.field9001[var6.field9291] + this.field9001[var6.field9284] + this.field9001[var6.field9285]) * 0.3333333F;
                    float var10 = (float) (this.field9034[var6.field9291] + this.field9034[var6.field9284] + this.field9034[var6.field9285]) * 0.3333333F;
                    float var11 = class393.field5551 * var10 + class224.field3213 * var8 + class187.field2620 * var9 + class397.field5667;
                    float var12 = class147.field2267 * var10 + class270.field3769 * var9 + class253.field3503 * var8 + class291.field4003;
                    float var13 = class169.field2445 * var10 + class526.field7395 * var9 + class145.field2242 * var8 + class1.field17;
                    var2.method1741(var6.field9289 * var7.field8628 >> 7, (float) var7.field8636 + var11, var7.field8624, (float) var7.field8626 - var12, var6.field9287 * var7.field8631 >> 7, -var13, 82);
                    this.field9095.method3392(true, var2);
                    this.field9095.method1333(var4, var3 - (float) var6.field9296 * 1.5F);
                    int var14 = var7.field8635;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field9095.method3408(var6.field9290, (byte) 124);
                    this.field9095.method3348(var6.field9297, (byte) 69);
                    this.field9095.method3396((byte) -123, var6.field9292);
                    this.field9095.method3342(0, 4, 20986, 7);
                }
            }
            this.field9095.method1333(var4, var3);
            this.field9095.method1309(true);
            this.field9095.method3334(20354);
        }
        field9033++;
        if (arg0 >= -12) {
            this.method163((byte) 81, -10, false);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIBIIII)Z")
    private final boolean method3646(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field9085++;
        if (arg6 > arg0 && arg8 > arg0 && arg0 < arg7) {
            return false;
        } else if (arg6 < arg0 && arg0 > arg8 && arg7 < arg0) {
            return false;
        } else {
            if (arg4 != -71) {
                this.field9098 = null;
            }
            if (arg5 < arg3 && arg5 < arg2 && arg5 < arg1) {
                return false;
            } else {
                return arg3 >= arg5 || arg2 >= arg5 || arg5 <= arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "(I)V")
    public final void method142(int arg0) {
        field9067++;
        this.field9091 = (short) arg0;
        if (this.field9082 != null) {
            this.field9082.field8705 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BIIBS)I")
    private final int method3647(byte arg0, int arg1, int arg2, byte arg3, short arg4) {
        field9100++;
        int var6 = class118.field1940[class442.method2618(arg1, arg2, true)];
        if (arg3 >= -21) {
            return -1;
        }
        if (arg4 != -1) {
            class211 var7 = this.field9095.field2924.method190((byte) -89, arg4 & 0xFFFF);
            int var8 = var7.field2973 & 0xFF;
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
            int var12 = var7.field2975 & 0xFF;
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
                var6 = (var13 << 8 & 0xFF0044) + (var14 & 0xFF00) + (var15 >> 8);
            }
        }
        return (var6 << 8) + 255 - (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "(IIII)V")
    public final void method165(int arg0, int arg1, int arg2, int arg3) {
        field9035++;
        if (arg0 == 0) {
            class392.field5535 = 0;
            int var5 = 0;
            class500.field6970 = 0;
            class606.field8734 = 0;
            for (int var6 = 0; var6 < this.field9021; var6++) {
                class392.field5535 += this.field9081[var6];
                class606.field8734 += this.field9001[var6];
                class500.field6970 += this.field9034[var6];
                var5++;
            }
            if (var5 <= 0) {
                class392.field5535 = arg1;
                class606.field8734 = arg2;
                class500.field6970 = arg3;
            } else {
                class500.field6970 = class500.field6970 / var5 + arg3;
                class606.field8734 = class606.field8734 / var5 + arg2;
                class392.field5535 = class392.field5535 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field9021; var7++) {
                this.field9081[var7] += arg1;
                this.field9001[var7] += arg2;
                this.field9034[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field9021; var8++) {
                this.field9081[var8] -= class392.field5535;
                this.field9001[var8] -= class606.field8734;
                this.field9034[var8] -= class500.field6970;
                if (arg3 != 0) {
                    int var9 = class1.field2[arg3];
                    int var10 = class1.field7[arg3];
                    int var11 = this.field9001[var8] * var9 - (-(this.field9081[var8] * var10) - 32767) >> 15;
                    this.field9001[var8] = this.field9001[var8] * var10 - (this.field9081[var8] * var9 - 32767) >> 15;
                    this.field9081[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class1.field2[arg1];
                    int var13 = class1.field7[arg1];
                    int var14 = this.field9001[var8] * var13 + 32767 - (this.field9034[var8] * var12) >> 15;
                    this.field9034[var8] = this.field9001[var8] * var12 + (this.field9034[var8] * var13) + 32767 >> 15;
                    this.field9001[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class1.field2[arg2];
                    int var16 = class1.field7[arg2];
                    int var17 = this.field9034[var8] * var15 + (this.field9081[var8] * var16) + 32767 >> 15;
                    this.field9034[var8] = this.field9034[var8] * var16 + 32767 - (this.field9081[var8] * var15) >> 15;
                    this.field9081[var8] = var17;
                }
                this.field9081[var8] += class392.field5535;
                this.field9001[var8] += class606.field8734;
                this.field9034[var8] += class500.field6970;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field9021; var18++) {
                this.field9081[var18] -= class392.field5535;
                this.field9001[var18] -= class606.field8734;
                this.field9034[var18] -= class500.field6970;
                this.field9081[var18] = this.field9081[var18] * arg1 / 128;
                this.field9001[var18] = this.field9001[var18] * arg2 / 128;
                this.field9034[var18] = this.field9034[var18] * arg3 / 128;
                this.field9081[var18] += class392.field5535;
                this.field9001[var18] += class606.field8734;
                this.field9034[var18] += class500.field6970;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field9071; var19++) {
                int var23 = (this.field9044[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field9044[var19] = (byte) var23;
            }
            if (this.field9082 != null) {
                this.field9082.field8705 = null;
            }
            if (this.field9099 != null) {
                for (int var20 = 0; var20 < this.field9073; var20++) {
                    class638 var21 = this.field9099[var20];
                    class597 var22 = this.field9101[var20];
                    var22.field8635 = var22.field8635 & 0xFFFFFF | 255 - (this.field9044[var21.field9288] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field9071; var24++) {
                int var28 = this.field9103[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x39F) >> 7;
                int var31 = arg2 / 4 + var30;
                int var32 = var28 & 0x7F;
                int var33 = arg1 + var29 & 0x3F;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field9103[var24] = (short) class73.method578(class73.method578(var31 << 7, var33 << 10), var34);
            }
            if (this.field9082 != null) {
                this.field9082.field8705 = null;
            }
            if (this.field9099 != null) {
                for (int var25 = 0; var25 < this.field9073; var25++) {
                    class638 var26 = this.field9099[var25];
                    class597 var27 = this.field9101[var25];
                    var27.field8635 = var27.field8635 & 0xFF000000 | class118.field1940[this.field9103[var26.field9288] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field9073; var35++) {
                class597 var36 = this.field9101[var35];
                var36.field8636 += arg1;
                var36.field8626 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field9073; var37++) {
                class597 var38 = this.field9101[var37];
                var38.field8631 = var38.field8631 * arg1 >> 7;
                var38.field8628 = var38.field8628 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field9073; var39++) {
                class597 var40 = this.field9101[var39];
                var40.field8624 = var40.field8624 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ww", name = "va", descriptor = "()I")
    public final int method148() {
        field9045++;
        if (!this.field9029) {
            this.method3640(-9369);
        }
        return this.field9065;
    }

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "(I)I")
    public static final int method3648(int arg0) {
        if (arg0 != 601328689) {
            method3648(-26);
        }
        field9050++;
        class571 var1 = class65.field1110;
        synchronized (class65.field1110) {
            return class65.field1110.method3239(0);
        }
    }

    @OriginalMember(owner = "client!ww", name = "X", descriptor = "()V")
    public final void method157() {
        field9043++;
        for (int var1 = 0; var1 < this.field9021; var1++) {
            this.field9034[var1] = -this.field9034[var1];
        }
        for (int var2 = 0; var2 < this.field9063; var2++) {
            this.field9061[var2] = (short) (-this.field9061[var2]);
        }
        for (int var3 = 0; var3 < this.field9071; var3++) {
            short var4 = this.field9010[var3];
            this.field9010[var3] = this.field9075[var3];
            this.field9075[var3] = var4;
        }
        if (this.field9056 == null && this.field9082 != null) {
            this.field9082.field8705 = null;
        }
        if (this.field9056 != null) {
            this.field9056.field8705 = null;
        }
        if (this.field9087 != null) {
            this.field9087.field8705 = null;
        }
        if (this.field9014 != null) {
            this.field9014.field813 = null;
        }
        this.field9029 = false;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lgi;)V")
    public class624(class583 arg0) {
        this.field9095 = arg0;
        this.field9087 = new class603(null, 5126, 3, 0);
        this.field9102 = new class603(null, 5126, 2, 0);
        this.field9056 = new class603(null, 5126, 3, 0);
        this.field9082 = new class603(null, 5121, 4, 0);
        this.field9014 = new class43();
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IILm;Z)Z")
    public final boolean method143(int arg0, int arg1, class163 arg2, boolean arg3) {
        field9017++;
        class266 var5 = (class266) arg2;
        class266 var6 = this.field9095.field8321;
        float var7 = var5.field3720 * var6.field3731 + var5.field3724 * var6.field3712 + var5.field3703 * var6.field3711 + var6.field3703;
        float var8 = var5.field3720 * var6.field3706 + var5.field3724 * var6.field3705 + var5.field3703 * var6.field3715 + var6.field3724;
        class253.field3503 = var5.field3727 * var6.field3706 + var5.field3715 * var6.field3705 + var5.field3711 * var6.field3715;
        class187.field2620 = var5.field3730 * var6.field3731 + var5.field3712 * var6.field3711 + var5.field3705 * var6.field3712;
        class393.field5551 = var5.field3717 * var6.field3731 + var5.field3731 * var6.field3711 + var5.field3706 * var6.field3712;
        float var9 = var5.field3720 * var6.field3717 + var5.field3724 * var6.field3730 + var5.field3703 * var6.field3727 + var6.field3720;
        class145.field2242 = var5.field3727 * var6.field3717 + var5.field3715 * var6.field3730 + var5.field3711 * var6.field3727;
        class169.field2445 = var5.field3717 * var6.field3717 + var5.field3731 * var6.field3727 + var5.field3706 * var6.field3730;
        class224.field3213 = var5.field3727 * var6.field3731 + var5.field3715 * var6.field3712 + var5.field3711 * var6.field3711;
        class147.field2267 = var5.field3717 * var6.field3706 + var5.field3731 * var6.field3715 + var5.field3706 * var6.field3705;
        class270.field3769 = var5.field3730 * var6.field3706 + var5.field3712 * var6.field3715 + var5.field3705 * var6.field3705;
        class526.field7395 = var5.field3730 * var6.field3717 + var5.field3712 * var6.field3727 + var5.field3705 * var6.field3730;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field9095.field8243;
        int var16 = this.field9095.field8330;
        if (!this.field9029) {
            this.method3640(-9369);
        }
        class369.field5014[0] = this.field9000;
        class390.field5524[0] = this.field9093;
        class105.field1584[0] = this.field9004;
        class369.field5014[1] = this.field9065;
        class390.field5524[1] = this.field9093;
        class105.field1584[1] = this.field9004;
        class369.field5014[2] = this.field9000;
        class390.field5524[2] = this.field9018;
        class369.field5014[3] = this.field9065;
        class105.field1584[2] = this.field9004;
        class390.field5524[3] = this.field9018;
        class369.field5014[4] = this.field9000;
        class105.field1584[3] = this.field9004;
        class390.field5524[4] = this.field9093;
        class369.field5014[5] = this.field9065;
        class105.field1584[4] = this.field9053;
        class390.field5524[5] = this.field9093;
        class105.field1584[5] = this.field9053;
        class369.field5014[6] = this.field9000;
        class390.field5524[6] = this.field9018;
        class369.field5014[7] = this.field9065;
        class105.field1584[6] = this.field9053;
        class390.field5524[7] = this.field9018;
        class105.field1584[7] = this.field9053;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class390.field5524[var17];
            float var39 = (float) class105.field1584[var17];
            float var40 = (float) class369.field5014[var17];
            float var41 = class169.field2445 * var39 + class526.field7395 * var38 + class145.field2242 * var40 + var9;
            float var42 = class147.field2267 * var39 + class270.field3769 * var38 + class253.field3503 * var40 + var8;
            float var43 = class393.field5551 * var39 + class224.field3213 * var40 + class187.field2620 * var38 + var7;
            if ((float) this.field9095.field8334 <= var41) {
                float var44 = (float) var15 * var43 / var41 + (float) this.field9095.field8299;
                if (var44 < var11) {
                    var11 = var44;
                }
                float var45 = (float) var16 * var42 / var41 + (float) this.field9095.field8226;
                if (var44 > var12) {
                    var12 = var44;
                }
                if (var13 > var45) {
                    var13 = var45;
                }
                if (var45 > var14) {
                    var14 = var45;
                }
                var10 = true;
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field9063 > this.field9095.field8347.length) {
                this.field9095.field8347 = new int[this.field9063];
                this.field9095.field8344 = new int[this.field9063];
            }
            int[] var18 = this.field9095.field8347;
            int[] var19 = this.field9095.field8344;
            for (int var20 = 0; var20 < this.field9021; var20++) {
                float var22 = (float) this.field9081[var20];
                float var23 = (float) this.field9034[var20];
                float var24 = (float) this.field9001[var20];
                float var25 = class393.field5551 * var23 + class224.field3213 * var22 + class187.field2620 * var24 + var7;
                float var26 = class147.field2267 * var23 + class270.field3769 * var24 + class253.field3503 * var22 + var8;
                float var27 = class169.field2445 * var23 + class526.field7395 * var24 + class145.field2242 * var22 + var9;
                if ((var27 >= (float) this.field9095.field8334)) {
                    int var32 = (int) ((float) var15 * var25 / var27 + (float) this.field9095.field8299);
                    int var33 = (int) ((float) var16 * var26 / var27 + (float) this.field9095.field8226);
                    int var34 = this.field9008[var20];
                    int var35 = this.field9008[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field9022[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field9008[var20];
                    int var29 = this.field9008[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field9022[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field9022[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field9071; var21++) {
                if (var18[this.field9010[var21]] != -999999 && var18[this.field9096[var21]] != -999999 && var18[this.field9075[var21]] != -999999 && this.method3646(arg1, var18[this.field9075[var21]], var18[this.field9096[var21]], var18[this.field9010[var21]], (byte) -71, arg0, var19[this.field9010[var21]], var19[this.field9075[var21]], var19[this.field9096[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lgi;Lln;IIII)V")
    public class624(class583 arg0, class317 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9037 = arg2;
        this.field9095 = arg0;
        this.field9030 = arg5;
        if (class563.method3214(arg2, 69, arg5)) {
            this.field9087 = new class603(null, 5126, 3, 0);
        }
        if (class320.method1994(49, arg5, arg2)) {
            this.field9102 = new class603(null, 5126, 2, 0);
        }
        if (class560.method3193((byte) -120, arg2, arg5)) {
            this.field9056 = new class603(null, 5126, 3, 0);
        }
        if (class644.method3712(arg5, (byte) 7, arg2)) {
            this.field9082 = new class603(null, 5121, 4, 0);
        }
        if (class452.method2654(arg5, arg2, 100)) {
            this.field9014 = new class43();
        }
        class17 var7 = arg0.field2924;
        int[] var8 = new int[arg1.field4294];
        this.field9008 = new int[arg1.field4272 + 1];
        for (int var9 = 0; var9 < arg1.field4294; var9++) {
            if ((arg1.field4282 == null || arg1.field4282[var9] != 2) && (arg1.field4274 == null || arg1.field4274[var9] == -1 || !var7.method190((byte) -89, arg1.field4274[var9] & 0xFFFF).field2983)) {
                var8[this.field9071++] = var9;
                this.field9008[arg1.field4299[var9]]++;
                this.field9008[arg1.field4303[var9]]++;
                this.field9008[arg1.field4288[var9]]++;
            }
        }
        this.field9089 = this.field9071;
        long[] var10 = new long[this.field9071];
        boolean var11 = (this.field9037 & 0x100) != 0;
        label497: for (int var12 = 0; var12 < this.field9071; var12++) {
            int var180 = var8[var12];
            class211 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field4252 != null) {
                for (int var186 = 0; var186 < arg1.field4252.length; var186++) {
                    class529 var187 = arg1.field4252[var186];
                    if (var187.field7410 == var180) {
                        class291 var188 = class208.method1376(var187.field7415, 86);
                        if (var188.field4007) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field9089--;
                            continue label497;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field4274 != null) {
                var189 = arg1.field4274[var180];
                if (var189 != -1) {
                    var181 = var7.method190((byte) -89, var189 & 0xFFFF);
                    var184 = var181.field2984;
                    var185 = var181.field2972;
                }
            }
            boolean var190 = arg1.field4255 != null && arg1.field4255[var180] != 0 || var181 != null && !var181.field2977 | var181.field2970;
            if ((var11 || var190) && arg1.field4287 != null) {
                var182 += arg1.field4287[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var189 & 0xFFFF << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + ((long) var194);
        }
        class263.method1731(var8, var10, true);
        this.field9021 = arg1.field4272;
        this.field9057 = arg1.field4265;
        this.field9034 = arg1.field4260;
        this.field9041 = arg1.field4251;
        this.field9001 = arg1.field4286;
        this.field9081 = arg1.field4259;
        class294[] var13 = new class294[this.field9021];
        this.field9012 = arg1.field4275;
        this.field9046 = arg1.field4256;
        if (arg1.field4252 != null) {
            this.field9073 = arg1.field4252.length;
            this.field9099 = new class638[this.field9073];
            this.field9101 = new class597[this.field9073];
            for (int var14 = 0; var14 < this.field9073; var14++) {
                class529 var15 = arg1.field4252[var14];
                class291 var16 = class208.method1376(var15.field7415, 99);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field9071; var18++) {
                    if (var8[var18] == var15.field7410) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class118.field1940[arg1.field4300[var15.field7410] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field4255 == null ? 0 : arg1.field4255[var15.field7410]) << 24;
                this.field9099[var14] = new class638(var17, arg1.field4299[var15.field7410], arg1.field4303[var15.field7410], arg1.field4288[var15.field7410], var16.field4013, var16.field4010, var16.field4004, var16.field4006, var16.field4012, var16.field4007, var16.field4008, var15.field7409);
                this.field9101[var14] = new class597(var20);
            }
        }
        int var21 = this.field9071 * 3;
        this.field9027 = new float[var21];
        this.field9094 = new short[var21];
        this.field9091 = (short) arg3;
        this.field9096 = new short[this.field9071];
        this.field9022 = new short[var21];
        class590.field8432 = new long[var21];
        this.field9061 = new short[var21];
        if (arg1.field4266 != null) {
            this.field9098 = new short[this.field9071];
        }
        this.field9044 = new byte[this.field9071];
        this.field9075 = new short[this.field9071];
        this.field9069 = new float[var21];
        this.field9049 = (short) arg4;
        this.field9010 = new short[this.field9071];
        this.field9068 = new byte[var21];
        this.field9105 = new short[var21];
        this.field9009 = new short[this.field9071];
        this.field9103 = new short[this.field9071];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field4272; var23++) {
            int var179 = this.field9008[var23];
            this.field9008[var23] = var22;
            var13[var23] = new class294();
            var22 += var179;
        }
        this.field9008[arg1.field4272] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field4257 != null) {
            int var28 = arg1.field4295;
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
            var25 = new int[var28];
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field9071; var36++) {
                int var43 = var8[var36];
                if (arg1.field4257[var43] != -1) {
                    int var44 = arg1.field4257[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field4299[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field4303[var43];
                        } else {
                            var46 = arg1.field4288[var43];
                        }
                        int var47 = arg1.field4259[var46];
                        int var48 = arg1.field4286[var46];
                        int var49 = arg1.field4260[var46];
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
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var27 = new float[var28][];
            var26 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field4293[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field4271[var37];
                        var40 = 64.0F / (float) arg1.field4253[var37];
                        if (var39 == 0) {
                            var42 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 > 0) {
                            var41 = (float) var39 / 1024.0F;
                            var42 = 1.0F;
                        } else {
                            var42 = (float) (-var39) / 1024.0F;
                            var41 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field4253[var37];
                        var42 = 64.0F / (float) arg1.field4271[var37];
                        var41 = 64.0F / (float) arg1.field4283[var37];
                    } else {
                        var41 = (float) arg1.field4283[var37] / 1024.0F;
                        var40 = (float) arg1.field4253[var37] / 1024.0F;
                        var42 = (float) arg1.field4271[var37] / 1024.0F;
                    }
                    var27[var37] = class28.method306(class589.method3454(arg1.field4292[var37], 255), var40, arg1.field4254[var37], var41, arg1.field4290[var37], arg1.field4284[var37], var42, (byte) 37);
                }
            }
        }
        class69[] var50 = new class69[arg1.field4294];
        for (int var51 = 0; var51 < arg1.field4294; var51++) {
            short var158 = arg1.field4299[var51];
            short var159 = arg1.field4303[var51];
            short var160 = arg1.field4288[var51];
            int var161 = this.field9081[var159] - this.field9081[var158];
            int var162 = this.field9001[var159] - this.field9001[var158];
            int var163 = this.field9034[var159] - this.field9034[var158];
            int var164 = this.field9081[var160] - this.field9081[var158];
            int var165 = this.field9001[var160] - this.field9001[var158];
            int var166 = this.field9034[var160] - this.field9034[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var168 * var168 + var167 * var167 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field4282 == null ? 0 : arg1.field4282[var51];
            if (var174 == 0) {
                class294 var175 = var13[var158];
                var175.field4045 += var171;
                var175.field4047 += var172;
                var175.field4046 += var173;
                var175.field4044++;
                class294 var176 = var13[var159];
                var176.field4046 += var173;
                var176.field4047 += var172;
                var176.field4045 += var171;
                var176.field4044++;
                class294 var177 = var13[var160];
                var177.field4047 += var172;
                var177.field4044++;
                var177.field4046 += var173;
                var177.field4045 += var171;
            } else if (var174 == 1) {
                class69 var178 = var50[var51] = new class69();
                var178.field1170 = var172;
                var178.field1164 = var171;
                var178.field1166 = var173;
            }
        }
        for (int var52 = 0; var52 < this.field9071; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field4300[var68] & 0xFFFF;
            short var70;
            if (arg1.field4274 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field4274[var68];
            }
            int var71;
            if (arg1.field4257 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field4257[var68];
            }
            int var72;
            if (arg1.field4255 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field4255[var68] & 0xFF;
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
                    var73 = 0.0F;
                    var74 = 1.0F;
                    var76 = 1.0F;
                    var78 = 0.0F;
                    var75 = 1.0F;
                    var79 = 1;
                    var80 = 2;
                    var77 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field4293[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field4299[var68];
                        short var112 = arg1.field4303[var68];
                        short var113 = arg1.field4288[var68];
                        short var114 = arg1.field4254[var71];
                        short var115 = arg1.field4290[var71];
                        short var116 = arg1.field4284[var71];
                        float var117 = (float) arg1.field4259[var114];
                        float var118 = (float) arg1.field4286[var114];
                        float var119 = (float) arg1.field4260[var114];
                        float var120 = (float) arg1.field4259[var115] - var117;
                        float var121 = (float) arg1.field4286[var115] - var118;
                        float var122 = (float) arg1.field4260[var115] - var119;
                        float var123 = (float) arg1.field4259[var116] - var117;
                        float var124 = (float) arg1.field4286[var116] - var118;
                        float var125 = (float) arg1.field4260[var116] - var119;
                        float var126 = (float) arg1.field4259[var111] - var117;
                        float var127 = (float) arg1.field4286[var111] - var118;
                        float var128 = (float) arg1.field4260[var111] - var119;
                        float var129 = (float) arg1.field4259[var112] - var117;
                        float var130 = (float) arg1.field4286[var112] - var118;
                        float var131 = (float) arg1.field4260[var112] - var119;
                        float var132 = (float) arg1.field4259[var113] - var117;
                        float var133 = (float) arg1.field4286[var113] - var118;
                        float var134 = (float) arg1.field4260[var113] - var119;
                        float var135 = var121 * var125 - var122 * var124;
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - (var125 * var136);
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        float var142 = var120 * var136 - (var121 * var135);
                        float var143 = var122 * var135 - var120 * var137;
                        float var144 = var121 * var137 - (var122 * var136);
                        float var145 = 1.0F / (var125 * var142 + var123 * var144 + var124 * var143);
                        var78 = (var134 * var142 + var132 * var144 + var133 * var143) * var145;
                        var76 = (var131 * var142 + var129 * var144 + var130 * var143) * var145;
                        var74 = (var128 * var142 + var126 * var144 + var127 * var143) * var145;
                    } else {
                        short var83 = arg1.field4299[var68];
                        short var84 = arg1.field4303[var68];
                        short var85 = arg1.field4288[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field4297[var71];
                        float var91 = (float) arg1.field4298[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field4283[var71] / 1024.0F;
                            class521.method3008(var92, arg1.field4260[var83], arg1.field4259[var83], var90, var88, var87, var89, arg1.field4286[var83], var86, -63, var91);
                            var74 = class523.field7352;
                            var73 = class586.field8382;
                            class521.method3008(var92, arg1.field4260[var84], arg1.field4259[var84], var90, var88, var87, var89, arg1.field4286[var84], var86, -59, var91);
                            var76 = class523.field7352;
                            var75 = class586.field8382;
                            class521.method3008(var92, arg1.field4260[var85], arg1.field4259[var85], var90, var88, var87, var89, arg1.field4286[var85], var86, -49, var91);
                            var78 = class523.field7352;
                            var77 = class586.field8382;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if ((var75 - var73 > var93)) {
                                    var75 -= var92;
                                    var79 = 1;
                                } else if (var73 - var75 > var93) {
                                    var79 = 2;
                                    var75 += var92;
                                }
                                if (var77 - var73 > var93) {
                                    var77 -= var92;
                                    var80 = 1;
                                } else if (var73 - var77 > var93) {
                                    var80 = 2;
                                    var77 += var92;
                                }
                            } else {
                                if ((var93 < var78 - var74)) {
                                    var80 = 1;
                                    var78 -= var92;
                                } else if (var74 - var78 > var93) {
                                    var78 += var92;
                                    var80 = 2;
                                }
                                if ((var93 < var76 - var74)) {
                                    var79 = 1;
                                    var76 -= var92;
                                } else if (var74 - var76 > var93) {
                                    var76 += var92;
                                    var79 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field4263[var71] / 256.0F;
                            float var95 = (float) arg1.field4270[var71] / 256.0F;
                            int var96 = arg1.field4259[var84] - arg1.field4259[var83];
                            int var97 = arg1.field4286[var84] - arg1.field4286[var83];
                            int var98 = arg1.field4260[var84] - arg1.field4260[var83];
                            int var99 = arg1.field4259[var85] - arg1.field4259[var83];
                            int var100 = arg1.field4286[var85] - arg1.field4286[var83];
                            int var101 = arg1.field4260[var85] - arg1.field4260[var83];
                            int var102 = var97 * var101 - var98 * var100;
                            int var103 = var98 * var99 - (var96 * var101);
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field4271[var71];
                            float var106 = 64.0F / (float) arg1.field4253[var71];
                            float var107 = 64.0F / (float) arg1.field4283[var71];
                            float var108 = (var89[2] * (float) var104 + var89[1] * (float) var103 + var89[0] * (float) var102) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[3] * (float) var102 + var89[4] * (float) var103) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[7] * (float) var103 + var89[6] * (float) var102) / var107;
                            var81 = class162.method1039(var110, var109, -11878, var108);
                            class21.method226(1, arg1.field4286[var83], arg1.field4259[var83], var91, var86, var89, var95, var90, var87, var88, var81, var94, arg1.field4260[var83]);
                            var73 = class137.field2158;
                            var74 = class608.field8769;
                            class21.method226(1, arg1.field4286[var84], arg1.field4259[var84], var91, var86, var89, var95, var90, var87, var88, var81, var94, arg1.field4260[var84]);
                            var76 = class608.field8769;
                            var75 = class137.field2158;
                            class21.method226(1, arg1.field4286[var85], arg1.field4259[var85], var91, var86, var89, var95, var90, var87, var88, var81, var94, arg1.field4260[var85]);
                            var78 = class608.field8769;
                            var77 = class137.field2158;
                        } else if (var82 == 3) {
                            class67.method554(var89, arg1.field4259[var83], var91, var90, arg1.field4260[var83], (byte) 122, var88, arg1.field4286[var83], var87, var86);
                            var74 = class137.field2152;
                            var73 = class328.field4397;
                            class67.method554(var89, arg1.field4259[var84], var91, var90, arg1.field4260[var84], (byte) 110, var88, arg1.field4286[var84], var87, var86);
                            var76 = class137.field2152;
                            var75 = class328.field4397;
                            class67.method554(var89, arg1.field4259[var85], var91, var90, arg1.field4260[var85], (byte) 101, var88, arg1.field4286[var85], var87, var86);
                            var78 = class137.field2152;
                            var77 = class328.field4397;
                            if ((var90 & 0x1) == 0) {
                                if ((var75 - var73 > 0.5F)) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                                if (var77 - var73 > 0.5F) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                            } else {
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                                if ((var76 - var74 > 0.5F)) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field4282 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field4282[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var81 << 24) + (long) var72 + (long) (var69 << 8) << 32) + (long) (var71 << 2);
                short var152 = arg1.field4299[var68];
                short var153 = arg1.field4303[var68];
                short var154 = arg1.field4288[var68];
                class294 var155 = var13[var152];
                this.field9010[var52] = this.method3639(true, var155.field4044, var155.field4045, arg1, var155.field4046, var74, var73, var150, var155.field4047, var152);
                class294 var156 = var13[var153];
                this.field9096[var52] = this.method3639(true, var156.field4044, var156.field4045, arg1, var156.field4046, var76, var75, (long) var79 + var150, var156.field4047, var153);
                class294 var157 = var13[var154];
                this.field9075[var52] = this.method3639(true, var157.field4044, var157.field4045, arg1, var157.field4046, var78, var77, (long) var80 + var150, var157.field4047, var154);
            } else if (var146 == 1) {
                class69 var147 = var50[var68];
                long var148 = (long) ((var147.field1164 + 256 << 22) + (var147.field1166 <= 0 ? 2048 : 1024) + (var147.field1170 - -256 << 12) + (var71 << 2)) + ((long) (var69 << 8) + (long) (var81 << 24) + ((long) var72) << 32);
                this.field9010[var52] = this.method3639(true, 0, var147.field1164, arg1, var147.field1166, var74, var73, var148, var147.field1170, arg1.field4299[var68]);
                this.field9096[var52] = this.method3639(true, 0, var147.field1164, arg1, var147.field1166, var76, var75, (long) var79 + var148, var147.field1170, arg1.field4303[var68]);
                this.field9075[var52] = this.method3639(true, 0, var147.field1164, arg1, var147.field1166, var78, var77, (long) var80 + var148, var147.field1170, arg1.field4288[var68]);
            }
            if (arg1.field4274 == null) {
                this.field9009[var52] = -1;
            } else {
                this.field9009[var52] = arg1.field4274[var68];
            }
            if (arg1.field4255 != null) {
                this.field9044[var52] = arg1.field4255[var68];
            }
            if (arg1.field4266 != null) {
                this.field9098[var52] = arg1.field4266[var68];
            }
            this.field9103[var52] = arg1.field4300[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field9089; var55++) {
            short var67 = this.field9009[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field9070 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field9089; var58++) {
            short var66 = this.field9009[var58];
            if (var56 != var66) {
                this.field9070[var57++] = var58;
                var56 = var66;
            }
        }
        this.field9070[var57] = this.field9089;
        class590.field8432 = null;
        this.field9094 = class131.method891(this.field9094, this.field9063, -13032);
        this.field9105 = class131.method891(this.field9105, this.field9063, -13032);
        this.field9061 = class131.method891(this.field9061, this.field9063, -13032);
        this.field9068 = class549.method3129(this.field9068, this.field9063, 3);
        this.field9027 = class78.method604((byte) 1, this.field9063, this.field9027);
        this.field9069 = class78.method604((byte) 1, this.field9063, this.field9069);
        if (arg1.field4268 != null && class513.method2973(arg2, (byte) -118, this.field9030)) {
            this.field9060 = arg1.method1970(false, (byte) 116);
        }
        if (arg1.field4252 != null && class483.method2816(arg2, (byte) -35, this.field9030)) {
            this.field9007 = arg1.method1975((byte) 80);
        }
        if (arg1.field4262 != null && class264.method1734(this.field9030, 122, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field9071; var61++) {
                int var65 = arg1.field4262[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var59 < var65) {
                        var59 = var65;
                    }
                }
            }
            this.field9090 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field9090[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field9071; var63++) {
                int var64 = arg1.field4262[var8[var63]];
                if (var64 >= 0) {
                    this.field9090[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
