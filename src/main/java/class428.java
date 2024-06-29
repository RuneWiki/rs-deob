import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class428 extends class471 {

    @OriginalMember(owner = "client!li", name = "L", descriptor = "Z")
    private boolean field6017 = false;

    @OriginalMember(owner = "client!li", name = "db", descriptor = "I")
    private int field6035 = 0;

    @OriginalMember(owner = "client!li", name = "Kb", descriptor = "I")
    private int field6068 = 0;

    @OriginalMember(owner = "client!li", name = "kc", descriptor = "Z")
    private boolean field6094 = false;

    @OriginalMember(owner = "client!li", name = "Ub", descriptor = "I")
    private int field6078 = 0;

    @OriginalMember(owner = "client!li", name = "Wb", descriptor = "Z")
    private boolean field6080 = true;

    @OriginalMember(owner = "client!li", name = "rc", descriptor = "I")
    private int field6101 = 0;

    @OriginalMember(owner = "client!li", name = "ic", descriptor = "Z")
    private boolean field6092 = false;

    @OriginalMember(owner = "client!li", name = "mc", descriptor = "I")
    private int field6096 = 0;

    @OriginalMember(owner = "client!li", name = "Jb", descriptor = "Leea;")
    private class131 field6067;

    @OriginalMember(owner = "client!li", name = "cc", descriptor = "Lvp;")
    private class186 field6086;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "Lvp;")
    private class186 field6001;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "Lvp;")
    private class186 field6000;

    @OriginalMember(owner = "client!li", name = "gc", descriptor = "Lvp;")
    private class186 field6090;

    @OriginalMember(owner = "client!li", name = "ac", descriptor = "Lvha;")
    private class684 field6084;

    @OriginalMember(owner = "client!li", name = "mb", descriptor = "I")
    private int field6044;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    private int field6016;

    @OriginalMember(owner = "client!li", name = "hb", descriptor = "[I")
    private int[] field6039;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "[I")
    private int[] field6033;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "[I")
    private int[] field6020;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "[S")
    private short[] field6034;

    @OriginalMember(owner = "client!li", name = "tb", descriptor = "[I")
    private int[] field6051;

    @OriginalMember(owner = "client!li", name = "Nb", descriptor = "[Lok;")
    private class253[] field6071;

    @OriginalMember(owner = "client!li", name = "Qb", descriptor = "[Lde;")
    private class531[] field6074;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    private int field6018;

    @OriginalMember(owner = "client!li", name = "Ec", descriptor = "[Ljl;")
    private class270[] field6114;

    @OriginalMember(owner = "client!li", name = "Hc", descriptor = "[Lkga;")
    private class545[] field6117;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "[S")
    private short[] field6029;

    @OriginalMember(owner = "client!li", name = "Xb", descriptor = "S")
    private short field6081;

    @OriginalMember(owner = "client!li", name = "Fb", descriptor = "[S")
    private short[] field6063;

    @OriginalMember(owner = "client!li", name = "sc", descriptor = "[S")
    private short[] field6102;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "[S")
    private short[] field6008;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "[S")
    private short[] field6032;

    @OriginalMember(owner = "client!li", name = "vc", descriptor = "[S")
    private short[] field6105;

    @OriginalMember(owner = "client!li", name = "ec", descriptor = "[S")
    private short[] field6088;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "S")
    private short field6027;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "[B")
    private byte[] field6011;

    @OriginalMember(owner = "client!li", name = "nb", descriptor = "[F")
    private float[] field6045;

    @OriginalMember(owner = "client!li", name = "wc", descriptor = "[B")
    private byte[] field6106;

    @OriginalMember(owner = "client!li", name = "ib", descriptor = "[S")
    private short[] field6040;

    @OriginalMember(owner = "client!li", name = "Sb", descriptor = "[S")
    private short[] field6076;

    @OriginalMember(owner = "client!li", name = "eb", descriptor = "[F")
    private float[] field6036;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "[S")
    private short[] field6003;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "[I")
    private int[] field6028;

    @OriginalMember(owner = "client!li", name = "Zb", descriptor = "[[I")
    private int[][] field6083;

    @OriginalMember(owner = "client!li", name = "ub", descriptor = "[[I")
    private int[][] field6052;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "[[I")
    private int[][] field6021;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "Lgda;")
    public static class53 field5998 = new class53(18, 8);

    @OriginalMember(owner = "client!li", name = "Cc", descriptor = "Lqfa;")
    public static class98 field6112 = new class98(10, 0);

    @OriginalMember(owner = "client!li", name = "D", descriptor = "B")
    private byte field6009;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!li", name = "fb", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!li", name = "jb", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!li", name = "kb", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!li", name = "ob", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!li", name = "pb", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!li", name = "qb", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!li", name = "rb", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!li", name = "sb", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!li", name = "vb", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!li", name = "wb", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!li", name = "xb", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!li", name = "zb", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!li", name = "Bb", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!li", name = "Cb", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!li", name = "Db", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!li", name = "Eb", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!li", name = "Gb", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!li", name = "Hb", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!li", name = "Ib", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!li", name = "Lb", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!li", name = "Mb", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!li", name = "Ob", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!li", name = "Pb", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!li", name = "Rb", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!li", name = "Tb", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!li", name = "Vb", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!li", name = "Yb", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!li", name = "bc", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!li", name = "hc", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!li", name = "lc", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!li", name = "nc", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!li", name = "pc", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!li", name = "tc", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!li", name = "uc", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!li", name = "xc", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!li", name = "yc", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!li", name = "zc", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!li", name = "Ac", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!li", name = "Bc", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!li", name = "Dc", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!li", name = "Fc", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!li", name = "Gc", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!li", name = "Ic", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!li", name = "dc", descriptor = "Lqea;")
    private class126 field6087;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "Lpi;")
    private class497 field5997;

    @OriginalMember(owner = "client!li", name = "lb", descriptor = "Lsn;")
    private class630 field6043;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "S")
    private short field6015;

    @OriginalMember(owner = "client!li", name = "gb", descriptor = "S")
    private short field6038;

    @OriginalMember(owner = "client!li", name = "yb", descriptor = "S")
    private short field6056;

    @OriginalMember(owner = "client!li", name = "Ab", descriptor = "S")
    private short field6058;

    @OriginalMember(owner = "client!li", name = "fc", descriptor = "S")
    private short field6089;

    @OriginalMember(owner = "client!li", name = "jc", descriptor = "S")
    private short field6093;

    @OriginalMember(owner = "client!li", name = "oc", descriptor = "S")
    private short field6098;

    @OriginalMember(owner = "client!li", name = "qc", descriptor = "S")
    private short field6100;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BZ)V")
    private final void method2605(byte arg0, boolean arg1) {
        field6075++;
        if (this.field6067.field1923.field9154.length >= this.field6035 * 6) {
            this.field6067.field1923.field9146 = 0;
        } else {
            this.field6067.field1923 = new class267((this.field6035 + 100) * 6);
        }
        class267 var3 = this.field6067.field1923;
        if (this.field6067.field1865) {
            for (int var4 = 0; var4 < this.field6035; var4++) {
                var3.method3745(-120, this.field6105[var4]);
                var3.method3745(-125, this.field6076[var4]);
                var3.method3745(-123, this.field6008[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field6035; var5++) {
                var3.method3737(this.field6105[var5], -1682769048);
                var3.method3737(this.field6076[var5], -1682769048);
                var3.method3737(this.field6008[var5], -1682769048);
            }
        }
        if (var3.field9146 == 0) {
            return;
        }
        if (arg0 < 26) {
            this.method254();
        }
        if (arg1) {
            if (this.field6043 == null) {
                this.field6043 = this.field6067.method876(-16889, var3.field9154, var3.field9146, 5123, true);
            } else {
                this.field6043.method724(5123, var3.field9146, var3.field9154, -128);
            }
            this.field6084.field9372 = this.field6043;
        } else {
            this.field6084.field9372 = this.field6067.method876(-16889, var3.field9154, var3.field9146, 5123, false);
        }
        if (!arg1) {
            this.field6080 = true;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZB)V")
    private final void method2606(boolean arg0, byte arg1) {
        field6065++;
        boolean var3 = this.field6090 != null && this.field6090.field2509 == null;
        boolean var4 = this.field6000 != null && this.field6000.field2509 == null;
        boolean var5 = this.field6086 != null && this.field6086.field2509 == null;
        boolean var6 = this.field6001 != null && this.field6001.field2509 == null;
        if (arg0) {
            var3 &= (this.field6009 & 0x2) != 0;
            var6 &= (this.field6009 & 0x8) != 0;
            var4 &= (this.field6009 & 0x4) != 0;
            var5 &= (this.field6009 & 0x1) != 0;
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
        if (arg1 != 83) {
            this.field6063 = null;
        }
        if (this.field6067.field1923.field9154.length >= (this.field6096 * var7)) {
            this.field6067.field1923.field9146 = 0;
        } else {
            this.field6067.field1923 = new class267((this.field6096 + 100) * var7);
        }
        class267 var12 = this.field6067.field1923;
        if (var5) {
            if (this.field6067.field1865) {
                for (int var13 = 0; var13 < this.field6078; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field6051[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field6020[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field6033[var13]);
                    int var17 = this.field6039[var13];
                    int var18 = this.field6039[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field6040[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field9146 = var7 * var20;
                        var12.method3733(-49, var14);
                        var12.method3733(-49, var15);
                        var12.method3733(-49, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field6078; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field6051[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field6020[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field6033[var21]);
                    int var25 = this.field6039[var21];
                    int var26 = this.field6039[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field6040[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field9146 = var7 * var28;
                        var12.method3725(var22, 0);
                        var12.method3725(var23, 0);
                        var12.method3725(var24, 0);
                    }
                }
            }
        }
        if (var3) {
            if (this.field6000 == null) {
                short[] var31;
                byte[] var32;
                short[] var33;
                short[] var34;
                if (this.field5997 == null) {
                    var31 = this.field6003;
                    var32 = this.field6106;
                    var33 = this.field6102;
                    var34 = this.field6063;
                } else {
                    var31 = this.field5997.field7144;
                    var34 = this.field5997.field7143;
                    var32 = this.field5997.field7147;
                    var33 = this.field5997.field7146;
                }
                float var35 = this.field6067.field1845[0];
                float var36 = this.field6067.field1845[1];
                float var37 = this.field6067.field1845[2];
                float var38 = this.field6067.field1866;
                float var39 = this.field6067.field1892 * 768.0F / (float) this.field6081;
                float var40 = this.field6067.field1920 * 768.0F / (float) this.field6081;
                for (int var41 = 0; var41 < this.field6068; var41++) {
                    int var42 = this.method2613(this.field6029[var41], this.field6011[var41], this.field6027, arg1 ^ 0x37, this.field6088[var41]);
                    float var43 = (float) ((var42 & 0xFF61) >> 8) * this.field6067.field1851;
                    short var44 = this.field6105[var41];
                    float var45 = (float) (var42 >>> 24) * this.field6067.field1919;
                    float var46 = (float) ((var42 & 0xFF0773) >> 16) * this.field6067.field1895;
                    short var47 = (short) var32[var44];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var33[var44] * var37 + (float) var31[var44] * var36 + (float) var34[var44] * var35) * 0.0026041667F;
                    } else {
                        var48 = ((float) var33[var44] * var37 + (float) var31[var44] * var36 + (float) var34[var44] * var35) / (float) (var47 * 256);
                    }
                    float var49 = var38 + var48 * ((var48 < 0.0F) ? var40 : var39);
                    int var50 = (int) (var45 * var49);
                    int var51 = (int) (var46 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var52 = (int) (var43 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.field9146 = var7 * var44 + var9;
                    var12.method3694(var50, -1528071456);
                    var12.method3694(var51, -1528071456);
                    var12.method3694(var52, -1528071456);
                    var12.method3694(255 - (this.field6011[var41] & 0xFF), -1528071456);
                    short var53 = this.field6076[var41];
                    short var54 = (short) var32[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var33[var53] * var37 + (float) var31[var53] * var36 + (float) var34[var53] * var35) * 0.0026041667F;
                    } else {
                        var55 = ((float) var33[var53] * var37 + (float) var31[var53] * var36 + (float) var34[var53] * var35) / (float) (var54 * 256);
                    }
                    float var56 = var55 * (var55 < 0.0F ? var40 : var39) + var38;
                    int var57 = (int) (var45 * var56);
                    int var58 = (int) (var46 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var43 * var56);
                    var12.field9146 = var7 * var53 + var9;
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method3694(var57, -1528071456);
                    var12.method3694(var58, -1528071456);
                    var12.method3694(var59, -1528071456);
                    var12.method3694(255 - (this.field6011[var41] & 0xFF), arg1 ^ 0xA4EB7AB3);
                    short var60 = this.field6008[var41];
                    short var61 = (short) var32[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var33[var60] * var37 + (float) var31[var60] * var36 + (float) var34[var60] * var35) * 0.0026041667F;
                    } else {
                        var62 = ((float) var33[var60] * var37 + (float) var31[var60] * var36 + (float) var34[var60] * var35) / (float) (var61 * 256);
                    }
                    float var63 = ((var62 < 0.0F) ? var40 : var39) * var62 + var38;
                    int var64 = (int) (var45 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var46 * var63);
                    int var66 = (int) (var43 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    var12.field9146 = var7 * var60 + var9;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method3694(var64, -1528071456);
                    var12.method3694(var65, -1528071456);
                    var12.method3694(var66, -1528071456);
                    var12.method3694(255 - (this.field6011[var41] & 0xFF), -1528071456);
                }
            } else {
                for (int var29 = 0; var29 < this.field6068; var29++) {
                    int var30 = this.method2613(this.field6029[var29], this.field6011[var29], this.field6027, 79, this.field6088[var29]);
                    var12.field9146 = var9 + (this.field6105[var29] * var7);
                    var12.method3733(-49, var30);
                    var12.field9146 = this.field6076[var29] * var7 + var9;
                    var12.method3733(-49, var30);
                    var12.field9146 = var9 + (this.field6008[var29] * var7);
                    var12.method3733(arg1 - 132, var30);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field5997 == null) {
                var70 = this.field6106;
                var67 = this.field6102;
                var68 = this.field6063;
                var69 = this.field6003;
            } else {
                var67 = this.field5997.field7146;
                var68 = this.field5997.field7143;
                var69 = this.field5997.field7144;
                var70 = this.field5997.field7147;
            }
            float var71 = 3.0F / (float) this.field6081;
            float var72 = 3.0F / (float) (this.field6081 / 2 + this.field6081);
            var12.field9146 = var10;
            if (this.field6067.field1865) {
                for (int var73 = 0; var73 < this.field6096; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1742((float) var68[var73] * var72, -32197);
                        var12.method1742((float) var69[var73] * var72, -32197);
                        var12.method1742((float) var67[var73] * var72, -32197);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1742((float) var68[var73] * var75, -32197);
                        var12.method1742((float) var69[var73] * var75, -32197);
                        var12.method1742((float) var67[var73] * var75, arg1 - 32280);
                    }
                    var12.field9146 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field6096; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1741(arg1 - 1526311491, (float) var68[var76] * var72);
                        var12.method1741(-1526311408, (float) var69[var76] * var72);
                        var12.method1741(-1526311408, (float) var67[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1741(-1526311408, (float) var68[var76] * var78);
                        var12.method1741(-1526311408, (float) var69[var76] * var78);
                        var12.method1741(-1526311408, (float) var67[var76] * var78);
                    }
                    var12.field9146 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field9146 = var11;
            if (this.field6067.field1865) {
                for (int var79 = 0; var79 < this.field6096; var79++) {
                    var12.method1742(this.field6036[var79], -32197);
                    var12.method1742(this.field6045[var79], -32197);
                    var12.field9146 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field6096; var80++) {
                    var12.method1741(arg1 - 1526311491, this.field6036[var80]);
                    var12.method1741(-1526311408, this.field6045[var80]);
                    var12.field9146 += var7 - 8;
                }
            }
        }
        var12.field9146 = this.field6096 * var7;
        class126 var81;
        if (arg0) {
            if (this.field6087 == null) {
                this.field6087 = this.field6067.method903(var12.field9154, var12.field9146, var7, true, (byte) 46);
            } else {
                this.field6087.method851(var12.field9146, 506, var7, var12.field9154);
            }
            this.field6009 = 0;
            var81 = this.field6087;
        } else {
            var81 = this.field6067.method903(var12.field9154, var12.field9146, var7, false, (byte) 46);
            this.field6080 = true;
        }
        if (var5) {
            this.field6086.field2509 = var81;
            this.field6086.field2505 = var8;
        }
        if (var6) {
            this.field6001.field2509 = var81;
            this.field6001.field2505 = var11;
        }
        if (var3) {
            this.field6090.field2509 = var81;
            this.field6090.field2505 = var9;
        }
        if (var4) {
            this.field6000.field2505 = var10;
            this.field6000.field2509 = var81;
        }
    }

    @OriginalMember(owner = "client!li", name = "VA", descriptor = "(I)V")
    public final void method249(int arg0) {
        field6006++;
        int var2 = class164.field2258[arg0];
        int var3 = class164.field2252[arg0];
        for (int var4 = 0; var4 < this.field6078; var4++) {
            int var5 = this.field6051[var4] * var3 + this.field6020[var4] * var2 >> 14;
            this.field6020[var4] = this.field6020[var4] * var3 - this.field6051[var4] * var2 >> 14;
            this.field6051[var4] = var5;
        }
        this.field6017 = false;
        if (this.field6086 != null) {
            this.field6086.field2509 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method244(int arg0, int arg1, class278 arg2, class278 arg3, int arg4, int arg5, int arg6) {
        if (!this.field6017) {
            this.method2610((byte) -127);
        }
        field6007++;
        int var8 = this.field6015 + arg4;
        int var9 = this.field6093 + arg4;
        int var10 = this.field6098 + arg6;
        int var11 = arg6 + this.field6100;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3935 <= (arg2.field3925 + var9 >> arg2.field3929) || var10 < 0 || arg2.field3930 <= arg2.field3925 + var11 >> arg2.field3929) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3935 <= (arg3.field3925 + var9 >> arg3.field3929) || var10 < 0 || arg3.field3930 <= (arg3.field3925 + var11 >> arg3.field3929)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3929;
            int var13 = arg2.field3925 + var9 - 1 >> arg2.field3929;
            int var14 = var10 >> arg2.field3929;
            int var15 = arg2.field3925 + var11 - 1 >> arg2.field3929;
            if (arg2.method1816((byte) 27, var14, var12) == arg5 && arg2.method1816((byte) -107, var14, var13) == arg5 && arg5 == arg2.method1816((byte) -60, var15, var12) && arg2.method1816((byte) 6, var15, var13) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field6078; var32++) {
                this.field6020[var32] = this.field6020[var32] + arg2.method1815(this.field6033[var32] + arg6, this.field6051[var32] + arg4, -12) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field6038;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field6078; var17++) {
                int var18 = (this.field6020[var17] << 16) / var16;
                if (arg1 > var18) {
                    this.field6020[var17] += (arg1 - var18) * (arg2.method1815(this.field6033[var17] + arg6, this.field6051[var17] + arg4, 47) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var19 = (arg1 & 0xFF) * 4;
            int var20 = (arg1 >> 8 & 0xFF) * 4;
            int var21 = arg1 >> 16 & 0xFF << 6;
            int var22 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var19 >> 1)) < 0 || (var19 >> 1) + arg4 + arg2.field3925 >= arg2.field3935 << arg2.field3929 || (arg6 - (var20 >> 1)) < 0 || (arg6 + (var20 >> 1) + arg2.field3925) >= (arg2.field3930 << arg2.field3929)) {
                return;
            }
            this.method2818(var21, arg2, arg4, var20, var22, -3, arg6, var19, arg5);
        } else if (arg0 == 4) {
            int var23 = this.field6058 - this.field6038;
            for (int var24 = 0; var24 < this.field6078; var24++) {
                this.field6020[var24] = var23 + (this.field6020[var24] + arg3.method1815(this.field6033[var24] + arg6, this.field6051[var24] + arg4, -127) - arg5);
            }
        } else if (arg0 == 5) {
            int var25 = this.field6058 - this.field6038;
            for (int var26 = 0; var26 < this.field6078; var26++) {
                int var27 = this.field6051[var26] + arg4;
                int var28 = this.field6033[var26] + arg6;
                int var29 = arg2.method1815(var28, var27, -128);
                int var30 = arg3.method1815(var28, var27, -128);
                int var31 = var29 - var30 - arg1;
                this.field6020[var26] = ((this.field6020[var26] << 8) / var25 * var31 >> 8) + var29 - arg5;
            }
        }
        this.field6017 = false;
        if (this.field6086 != null) {
            this.field6086.field2509 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "aa", descriptor = "(SS)V")
    public final void method255(short arg0, short arg1) {
        field6047++;
        class149 var3 = this.field6067.field715;
        for (int var4 = 0; var4 < this.field6068; var4++) {
            if (this.field6088[var4] == arg0) {
                this.field6088[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class502 var7 = var3.method532((byte) 127, arg0 & 0xFFFF);
            var5 = var7.field7192;
            var6 = var7.field7196;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class502 var10 = var3.method532((byte) 127, arg1 & 0xFFFF);
            if (var10.field7207 != 0 || var10.field7193 != 0) {
                this.field6092 = true;
            }
            var9 = var10.field7196;
            var8 = var10.field7192;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field6114 != null) {
            for (int var11 = 0; var11 < this.field6018; var11++) {
                class270 var12 = this.field6114[var11];
                class545 var13 = this.field6117[var11];
                var13.field7596 = class295.field4163[this.field6029[var12.field3868] & 0xFFFF] & 0xFFFFFF | var13.field7596 & 0xFF000000;
            }
        }
        if (this.field6090 != null) {
            this.field6090.field2509 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "()V")
    public final void method256() {
        field6055++;
    }

    @OriginalMember(owner = "client!li", name = "LA", descriptor = "(I)V")
    public final void method250(int arg0) {
        field6116++;
        if (this.field6090 != null) {
            this.field6090.field2509 = null;
        }
        this.field6081 = (short) arg0;
        if (this.field6000 != null) {
            this.field6000.field2509 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)V")
    public final void method225(int arg0, int arg1, int arg2, int arg3) {
        field6108++;
        for (int var5 = 0; var5 < this.field6068; var5++) {
            int var9 = this.field6029[var5] & 0xFFFF;
            int var10 = (var9 & 0xFE68) >> 10;
            int var11 = (var9 & 0x3CF) >> 7;
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field6029[var5] = (short) class325.method2116(class325.method2116(var10 << 10, var11 << 7), var12);
        }
        if (this.field6114 != null) {
            for (int var6 = 0; var6 < this.field6018; var6++) {
                class270 var7 = this.field6114[var6];
                class545 var8 = this.field6117[var6];
                var8.field7596 = class295.field4163[this.field6029[var7.field3868] & 0xFFFF] & 0xFFFFFF | var8.field7596 & 0xFF000000;
            }
        }
        if (this.field6090 != null) {
            this.field6090.field2509 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB)Z")
    private static final boolean method2607(int arg0, int arg1, byte arg2) {
        if (arg2 != -53) {
            field6109 = 17;
        }
        field6054++;
        return (arg0 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "()[Lok;")
    public final class253[] method241() {
        field6042++;
        return this.field6071;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lli;BZZILli;)Lka;")
    private final class471 method2608(class428 arg0, byte arg1, boolean arg2, boolean arg3, int arg4, class428 arg5) {
        arg5.field6035 = this.field6035;
        arg5.field6009 = 0;
        arg5.field6092 = this.field6092;
        arg5.field6101 = this.field6101;
        arg5.field6068 = this.field6068;
        arg5.field6078 = this.field6078;
        field6014++;
        arg5.field6018 = this.field6018;
        if ((arg4 & 0x100) == 0) {
            arg5.field6094 = this.field6094;
        } else {
            arg5.field6094 = true;
        }
        arg5.field6044 = arg4;
        arg5.field6096 = this.field6096;
        arg5.field6027 = this.field6027;
        arg5.field6081 = this.field6081;
        arg5.field6016 = this.field6016;
        boolean var7 = class755.method4200(33, arg4, this.field6016);
        boolean var8 = class711.method4004(arg4, this.field6016, (byte) -77);
        boolean var9 = class399.method2493(this.field6016, -129767092, arg4);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg5.field6051 = this.field6051;
            } else if (arg0.field6051 == null || arg0.field6051.length < this.field6101) {
                arg5.field6051 = arg0.field6051 = new int[this.field6101];
            } else {
                arg5.field6051 = arg0.field6051;
            }
            if (!var8) {
                arg5.field6020 = this.field6020;
            } else if (arg0.field6020 == null || arg0.field6020.length < this.field6101) {
                arg5.field6020 = arg0.field6020 = new int[this.field6101];
            } else {
                arg5.field6020 = arg0.field6020;
            }
            if (!var9) {
                arg5.field6033 = this.field6033;
            } else if (arg0.field6033 == null || this.field6101 > arg0.field6033.length) {
                arg5.field6033 = arg0.field6033 = new int[this.field6101];
            } else {
                arg5.field6033 = arg0.field6033;
            }
            for (int var11 = 0; var11 < this.field6101; var11++) {
                if (var7) {
                    arg5.field6051[var11] = this.field6051[var11];
                }
                if (var8) {
                    arg5.field6020[var11] = this.field6020[var11];
                }
                if (var9) {
                    arg5.field6033[var11] = this.field6033[var11];
                }
            }
        } else {
            arg5.field6020 = this.field6020;
            arg5.field6051 = this.field6051;
            arg5.field6033 = this.field6033;
        }
        int var12 = -73 % ((arg1 + 51) / 55);
        if (class757.method4207((byte) 127, this.field6016, arg4)) {
            arg5.field6086 = arg0.field6086;
            if (arg3) {
                arg5.field6009 = (byte) (arg5.field6009 | 0x1);
            }
            arg5.field6086.field2505 = this.field6086.field2505;
            arg5.field6086.field2509 = this.field6086.field2509;
        } else if (class704.method3960(true, this.field6016, arg4)) {
            arg5.field6086 = this.field6086;
        } else {
            arg5.field6086 = null;
        }
        if (class634.method3527(9, arg4, this.field6016)) {
            if (arg0.field6029 == null || this.field6068 > arg0.field6029.length) {
                arg5.field6029 = arg0.field6029 = new short[this.field6068];
            } else {
                arg5.field6029 = arg0.field6029;
            }
            for (int var13 = 0; var13 < this.field6068; var13++) {
                arg5.field6029[var13] = this.field6029[var13];
            }
        } else {
            arg5.field6029 = this.field6029;
        }
        if (class325.method2117(arg4, 125, this.field6016)) {
            if (arg0.field6011 == null || this.field6068 > arg0.field6011.length) {
                arg5.field6011 = arg0.field6011 = new byte[this.field6068];
            } else {
                arg5.field6011 = arg0.field6011;
            }
            for (int var14 = 0; var14 < this.field6068; var14++) {
                arg5.field6011[var14] = this.field6011[var14];
            }
        } else {
            arg5.field6011 = this.field6011;
        }
        if (class129.method862(4285, arg4, this.field6016)) {
            if (arg3) {
                arg5.field6009 = (byte) (arg5.field6009 | 0x2);
            }
            arg5.field6090 = arg0.field6090;
            arg5.field6090.field2505 = this.field6090.field2505;
            arg5.field6090.field2509 = this.field6090.field2509;
        } else if (class103.method736(-124, arg4, this.field6016)) {
            arg5.field6090 = this.field6090;
        } else {
            arg5.field6090 = null;
        }
        if (class461.method2738(100, this.field6016, arg4)) {
            if (arg0.field6063 == null || this.field6096 > arg0.field6063.length) {
                int var15 = this.field6096;
                arg5.field6063 = arg0.field6063 = new short[var15];
                arg5.field6102 = arg0.field6102 = new short[var15];
                arg5.field6003 = arg0.field6003 = new short[var15];
            } else {
                arg5.field6063 = arg0.field6063;
                arg5.field6102 = arg0.field6102;
                arg5.field6003 = arg0.field6003;
            }
            if (this.field5997 == null) {
                for (int var19 = 0; var19 < this.field6096; var19++) {
                    arg5.field6063[var19] = this.field6063[var19];
                    arg5.field6003[var19] = this.field6003[var19];
                    arg5.field6102[var19] = this.field6102[var19];
                }
            } else {
                if (arg0.field5997 == null) {
                    arg0.field5997 = new class497();
                }
                class497 var16 = arg5.field5997 = arg0.field5997;
                if (var16.field7143 == null || this.field6096 > var16.field7143.length) {
                    int var17 = this.field6096;
                    var16.field7146 = new short[var17];
                    var16.field7144 = new short[var17];
                    var16.field7147 = new byte[var17];
                    var16.field7143 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field6096; var18++) {
                    arg5.field6063[var18] = this.field6063[var18];
                    arg5.field6003[var18] = this.field6003[var18];
                    arg5.field6102[var18] = this.field6102[var18];
                    var16.field7143[var18] = this.field5997.field7143[var18];
                    var16.field7144[var18] = this.field5997.field7144[var18];
                    var16.field7146[var18] = this.field5997.field7146[var18];
                    var16.field7147[var18] = this.field5997.field7147[var18];
                }
            }
            arg5.field6106 = this.field6106;
        } else {
            arg5.field6102 = this.field6102;
            arg5.field5997 = this.field5997;
            arg5.field6106 = this.field6106;
            arg5.field6063 = this.field6063;
            arg5.field6003 = this.field6003;
        }
        if (class351.method2265(this.field6016, (byte) -44, arg4)) {
            arg5.field6000 = arg0.field6000;
            if (arg3) {
                arg5.field6009 = (byte) (arg5.field6009 | 0x4);
            }
            arg5.field6000.field2509 = this.field6000.field2509;
            arg5.field6000.field2505 = this.field6000.field2505;
        } else if (class398.method2485(arg4, this.field6016, 0)) {
            arg5.field6000 = this.field6000;
        } else {
            arg5.field6000 = null;
        }
        if (class243.method1550(8, arg4, this.field6016)) {
            if (arg0.field6036 == null || this.field6068 > arg0.field6036.length) {
                int var20 = this.field6096;
                arg5.field6045 = arg0.field6045 = new float[var20];
                arg5.field6036 = arg0.field6036 = new float[var20];
            } else {
                arg5.field6036 = arg0.field6036;
                arg5.field6045 = arg0.field6045;
            }
            for (int var21 = 0; var21 < this.field6096; var21++) {
                arg5.field6036[var21] = this.field6036[var21];
                arg5.field6045[var21] = this.field6045[var21];
            }
        } else {
            arg5.field6045 = this.field6045;
            arg5.field6036 = this.field6036;
        }
        if (class562.method3236(this.field6016, arg4, -81)) {
            if (arg3) {
                arg5.field6009 = (byte) (arg5.field6009 | 0x8);
            }
            arg5.field6001 = arg0.field6001;
            arg5.field6001.field2509 = this.field6001.field2509;
            arg5.field6001.field2505 = this.field6001.field2505;
        } else if (class722.method4053(this.field6016, false, arg4)) {
            arg5.field6001 = this.field6001;
        } else {
            arg5.field6001 = null;
        }
        if (class686.method3837(this.field6016, arg4, 30743)) {
            if (arg0.field6105 == null || arg0.field6105.length < this.field6068) {
                int var22 = this.field6068;
                arg5.field6105 = arg0.field6105 = new short[var22];
                arg5.field6076 = arg0.field6076 = new short[var22];
                arg5.field6008 = arg0.field6008 = new short[var22];
            } else {
                arg5.field6008 = arg0.field6008;
                arg5.field6105 = arg0.field6105;
                arg5.field6076 = arg0.field6076;
            }
            for (int var23 = 0; var23 < this.field6068; var23++) {
                arg5.field6105[var23] = this.field6105[var23];
                arg5.field6076[var23] = this.field6076[var23];
                arg5.field6008[var23] = this.field6008[var23];
            }
        } else {
            arg5.field6076 = this.field6076;
            arg5.field6008 = this.field6008;
            arg5.field6105 = this.field6105;
        }
        if (class117.method820(5, this.field6016, arg4)) {
            arg5.field6084 = arg0.field6084;
            if (arg3) {
                arg5.field6009 = (byte) (arg5.field6009 | 0x10);
            }
            arg5.field6084.field9372 = this.field6084.field9372;
        } else if (class69.method569(arg4, (byte) 123, this.field6016)) {
            arg5.field6084 = this.field6084;
        } else {
            arg5.field6084 = null;
        }
        if (class268.method1746(this.field6016, (byte) -107, arg4)) {
            if (arg0.field6088 == null || arg0.field6088.length < this.field6068) {
                int var24 = this.field6068;
                arg5.field6088 = arg0.field6088 = new short[var24];
            } else {
                arg5.field6088 = arg0.field6088;
            }
            for (int var25 = 0; var25 < this.field6068; var25++) {
                arg5.field6088[var25] = this.field6088[var25];
            }
        } else {
            arg5.field6088 = this.field6088;
        }
        if (!method2607(arg4, this.field6016, (byte) -53)) {
            arg5.field6117 = this.field6117;
        } else if (arg0.field6117 == null || arg0.field6117.length < this.field6018) {
            int var27 = this.field6018;
            arg5.field6117 = arg0.field6117 = new class545[var27];
            for (int var28 = 0; var28 < this.field6018; var28++) {
                arg5.field6117[var28] = this.field6117[var28].method3159((byte) 75);
            }
        } else {
            arg5.field6117 = arg0.field6117;
            for (int var26 = 0; var26 < this.field6018; var26++) {
                arg5.field6117[var26].method3158((byte) -126, this.field6117[var26]);
            }
        }
        arg5.field6040 = this.field6040;
        arg5.field6021 = this.field6021;
        arg5.field6071 = this.field6071;
        if (this.field6017) {
            arg5.field6093 = this.field6093;
            arg5.field6038 = this.field6038;
            arg5.field6058 = this.field6058;
            arg5.field6098 = this.field6098;
            arg5.field6100 = this.field6100;
            arg5.field6015 = this.field6015;
            arg5.field6017 = true;
            arg5.field6089 = this.field6089;
            arg5.field6056 = this.field6056;
        } else {
            arg5.field6017 = false;
        }
        arg5.field6114 = this.field6114;
        arg5.field6074 = this.field6074;
        arg5.field6028 = this.field6028;
        arg5.field6039 = this.field6039;
        arg5.field6083 = this.field6083;
        arg5.field6032 = this.field6032;
        arg5.field6034 = this.field6034;
        arg5.field6052 = this.field6052;
        return arg5;
    }

    @OriginalMember(owner = "client!li", name = "na", descriptor = "()I")
    public final int method266() {
        field6064++;
        if (!this.field6017) {
            this.method2610((byte) -128);
        }
        return this.field6089;
    }

    @OriginalMember(owner = "client!li", name = "NA", descriptor = "()Z")
    public final boolean method254() {
        field6061++;
        if (this.field6083 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field6101; var1++) {
            this.field6051[var1] <<= 0x4;
            this.field6020[var1] <<= 0x4;
            this.field6033[var1] <<= 0x4;
        }
        class469.field6654 = 0;
        class681.field9335 = 0;
        class351.field4968 = 0;
        return true;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public static void method2609(int arg0) {
        if (arg0 != 0) {
            method2609(-83);
        }
        field5998 = null;
        field6112 = null;
    }

    @OriginalMember(owner = "client!li", name = "F", descriptor = "()Z")
    public final boolean method224() {
        field6012++;
        return this.field6094;
    }

    @OriginalMember(owner = "client!li", name = "ia", descriptor = "(SS)V")
    public final void method261(short arg0, short arg1) {
        field6111++;
        for (int var3 = 0; var3 < this.field6068; var3++) {
            if (this.field6029[var3] == arg0) {
                this.field6029[var3] = arg1;
            }
        }
        if (this.field6114 != null) {
            for (int var4 = 0; var4 < this.field6018; var4++) {
                class270 var5 = this.field6114[var4];
                class545 var6 = this.field6117[var4];
                var6.field7596 = class295.field4163[this.field6029[var5.field3868] & 0xFFFF] & 0xFFFFFF | var6.field7596 & 0xFF000000;
            }
        }
        if (this.field6090 != null) {
            this.field6090.field2509 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "ua", descriptor = "()I")
    public final int method228() {
        field6077++;
        return this.field6044;
    }

    @OriginalMember(owner = "client!li", name = "HA", descriptor = "()I")
    public final int method260() {
        if (!this.field6017) {
            this.method2610((byte) -126);
        }
        field6103++;
        return this.field6098;
    }

    @OriginalMember(owner = "client!li", name = "wa", descriptor = "()V")
    public final void method246() {
        field6048++;
        for (int var1 = 0; var1 < this.field6101; var1++) {
            this.field6051[var1] = this.field6051[var1] + 7 >> 4;
            this.field6020[var1] = this.field6020[var1] + 7 >> 4;
            this.field6033[var1] = this.field6033[var1] + 7 >> 4;
        }
        if (this.field6086 != null) {
            this.field6086.field2509 = null;
        }
        this.field6017 = false;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
    private final void method2610(byte arg0) {
        field6104++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        if (arg0 > -125) {
            this.field6092 = true;
        }
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field6078; var10++) {
            int var11 = this.field6051[var10];
            int var12 = this.field6020[var10];
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field6033[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field6098 = (short) var4;
        this.field6038 = (short) var3;
        this.field6093 = (short) var5;
        this.field6058 = (short) var6;
        this.field6100 = (short) var7;
        this.field6015 = (short) var2;
        this.field6089 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field6056 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field6017 = true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lnga;Lfn;I)V")
    public final void method221(class513 arg0, class137 arg1, int arg2) {
        field6060++;
        if (this.field6096 == 0) {
            return;
        }
        class55 var4 = this.field6067.field1816;
        class55 var5 = (class55) arg0;
        if (!this.field6017) {
            this.method2610((byte) -128);
        }
        class725.field10121 = var4.field638 * var5.field632 + var4.field661 * var5.field665 + var4.field656 * var5.field655 + var4.field632;
        class448.field6365 = var4.field638 * var5.field656 + var4.field661 * var5.field664 + var4.field656 * var5.field649;
        float var6 = (float) this.field6038 * class448.field6365 + class725.field10121;
        float var7 = (float) this.field6058 * class448.field6365 + class725.field10121;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field6089 + var6;
            var9 = var7 - (float) this.field6089;
        } else {
            var9 = (float) (-this.field6089) + var6;
            var8 = (float) this.field6089 + var7;
        }
        if ((var9 >= this.field6067.field1833) || (var8 <= (float) this.field6067.field1907)) {
            return;
        }
        class109.field1321 = var4.field643 * var5.field656 + var4.field664 * var5.field649 + var4.field628 * var5.field664;
        class738.field10274 = var4.field643 * var5.field632 + var4.field664 * var5.field655 + var4.field628 * var5.field665 + var4.field665;
        float var10 = (float) this.field6038 * class109.field1321 + class738.field10274;
        float var11 = (float) this.field6058 * class109.field1321 + class738.field10274;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var13 = ((float) (-this.field6089) + var11) * (float) this.field6067.field1910;
            var12 = ((float) this.field6089 + var10) * (float) this.field6067.field1910;
        } else {
            var12 = ((float) this.field6089 + var11) * (float) this.field6067.field1910;
            var13 = (var10 - (float) this.field6089) * (float) this.field6067.field1910;
        }
        if ((this.field6067.field1843 <= var13 / var8) || (this.field6067.field1891 >= var12 / var8)) {
            return;
        }
        class345.field4853 = var4.field647 * var5.field632 + var4.field649 * var5.field655 + var4.field626 * var5.field665 + var4.field655;
        class659.field9023 = var4.field647 * var5.field656 + var4.field649 * var5.field649 + var4.field626 * var5.field664;
        float var14 = (float) this.field6038 * class659.field9023 + class345.field4853;
        float var15 = (float) this.field6058 * class659.field9023 + class345.field4853;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = (var15 - (float) this.field6089) * (float) this.field6067.field1844;
            var17 = ((float) this.field6089 + var14) * (float) this.field6067.field1844;
        } else {
            var17 = ((float) this.field6089 + var15) * (float) this.field6067.field1844;
            var16 = (var14 - (float) this.field6089) * (float) this.field6067.field1844;
        }
        if ((this.field6067.field1848 <= var16 / var8) || (this.field6067.field1832 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field6114 != null) {
            class533.field7513 = var4.field643 * var5.field638 + var4.field664 * var5.field647 + var4.field628 * var5.field643;
            class145.field2090 = var4.field647 * var5.field638 + var4.field649 * var5.field647 + var4.field626 * var5.field643;
            class556.field7802 = var4.field643 * var5.field661 + var4.field664 * var5.field626 + var4.field628 * var5.field628;
            class365.field5166 = var4.field638 * var5.field661 + var4.field661 * var5.field628 + var4.field656 * var5.field626;
            class18.field283 = var4.field647 * var5.field661 + var4.field649 * var5.field626 + var4.field626 * var5.field628;
            class367.field5201 = var4.field638 * var5.field638 + var4.field661 * var5.field643 + var4.field656 * var5.field647;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field6093 + this.field6015 >> 1;
            int var21 = this.field6098 + this.field6100 >> 1;
            int var22 = (int) ((float) var21 * class533.field7513 + (float) this.field6038 * class109.field1321 + (float) var20 * class556.field7802 + class738.field10274);
            int var23 = (int) ((float) var21 * class145.field2090 + (float) this.field6038 * class659.field9023 + (float) var20 * class18.field283 + class345.field4853);
            int var24 = (int) ((float) var21 * class367.field5201 + (float) this.field6038 * class448.field6365 + (float) var20 * class365.field5166 + class725.field10121);
            if (var24 >= this.field6067.field1907) {
                arg1.field1986 = this.field6067.field1844 * var23 / var24 + this.field6067.field1901;
                arg1.field1985 = this.field6067.field1910 * var22 / var24 + this.field6067.field1884;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class533.field7513 + (float) this.field6058 * class109.field1321 + (float) var20 * class556.field7802 + class738.field10274);
            int var26 = (int) ((float) var21 * class145.field2090 + (float) this.field6058 * class659.field9023 + (float) var20 * class18.field283 + class345.field4853);
            int var27 = (int) ((float) var21 * class367.field5201 + (float) this.field6058 * class448.field6365 + (float) var20 * class365.field5166 + class725.field10121);
            if (var27 >= this.field6067.field1907) {
                arg1.field1990 = this.field6067.field1910 * var25 / var27 + this.field6067.field1884;
                arg1.field1989 = this.field6067.field1844 * var26 / var27 + this.field6067.field1901;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field6067.field1907 && this.field6067.field1907 > var27) {
                    var19 = false;
                } else if (this.field6067.field1907 > var24) {
                    int var31 = (var27 - this.field6067.field1907 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field1985 = this.field6067.field1910 * var32 / this.field6067.field1907 + this.field6067.field1884;
                    arg1.field1986 = this.field6067.field1901 + (this.field6067.field1844 * var33 / this.field6067.field1907);
                } else if (this.field6067.field1907 > var27) {
                    int var28 = (var24 - this.field6067.field1907 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    arg1.field1985 = this.field6067.field1910 * var29 / this.field6067.field1907 + this.field6067.field1884;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field1986 = this.field6067.field1844 * var30 / this.field6067.field1907 + this.field6067.field1901;
                }
            }
            if (var19) {
                if (var27 >= var24) {
                    arg1.field1988 = (var25 + this.field6089) * this.field6067.field1910 / var27 + this.field6067.field1884 - arg1.field1990;
                } else {
                    arg1.field1988 = (this.field6089 + var22) * this.field6067.field1910 / var24 + this.field6067.field1884 - arg1.field1985;
                }
                arg1.field1987 = true;
            }
        }
        this.field6067.method939(32);
        this.field6067.method893((byte) 81, var5);
        this.method2612((byte) 44);
        this.field6067.method878(-124);
        this.method2611(7);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public final void method231(int arg0) {
        field6082++;
        int var2 = class164.field2258[arg0];
        int var3 = class164.field2252[arg0];
        for (int var4 = 0; var4 < this.field6078; var4++) {
            int var5 = this.field6051[var4] * var3 + this.field6033[var4] * var2 >> 14;
            this.field6033[var4] = this.field6033[var4] * var3 - (this.field6051[var4] * var2) >> 14;
            this.field6051[var4] = var5;
        }
        this.field6017 = false;
        if (this.field6086 != null) {
            this.field6086.field2509 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILnga;ZI)Z")
    public final boolean method233(int arg0, int arg1, class513 arg2, boolean arg3, int arg4) {
        field6053++;
        return this.method2615(arg0, arg2, arg4, arg3, -1, arg1, 1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method232(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field6002++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            class351.field4968 = 0;
            class681.field9335 = 0;
            int var12 = 0;
            class469.field6654 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field6083.length > var14) {
                    int[] var15 = this.field6083[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class351.field4968 += this.field6051[var17];
                        class681.field9335 += this.field6020[var17];
                        var12++;
                        class469.field6654 += this.field6033[var17];
                    }
                }
            }
            if (var12 > 0) {
                class681.field9335 = class681.field9335 / var12 + var10;
                class469.field6654 = class469.field6654 / var12 + var9;
                class351.field4968 = class351.field4968 / var12 + var11;
            } else {
                class469.field6654 = var9;
                class681.field9335 = var10;
                class351.field4968 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field6083.length) {
                    int[] var23 = this.field6083[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field6051[var25] += var20;
                        this.field6020[var25] += var18;
                        this.field6033[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field6083.length) {
                    int[] var46 = this.field6083[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field6051[var48] -= class351.field4968;
                            this.field6020[var48] -= class681.field9335;
                            this.field6033[var48] -= class469.field6654;
                            if (arg4 != 0) {
                                int var49 = class164.field2258[arg4];
                                int var50 = class164.field2252[arg4];
                                int var51 = this.field6020[var48] * var49 + (this.field6051[var48] * var50 + 16383) >> 14;
                                this.field6020[var48] = this.field6020[var48] * var50 + 16383 - (this.field6051[var48] * var49) >> 14;
                                this.field6051[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class164.field2258[arg2];
                                int var53 = class164.field2252[arg2];
                                int var54 = this.field6020[var48] * var53 + 16383 - (this.field6033[var48] * var52) >> 14;
                                this.field6033[var48] = this.field6033[var48] * var53 + this.field6020[var48] * var52 + 16383 >> 14;
                                this.field6020[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class164.field2258[arg3];
                                int var56 = class164.field2252[arg3];
                                int var57 = this.field6051[var48] * var56 + this.field6033[var48] * var55 + 16383 >> 14;
                                this.field6033[var48] = this.field6033[var48] * var56 + 16383 - (this.field6051[var48] * var55) >> 14;
                                this.field6051[var48] = var57;
                            }
                            this.field6051[var48] += class351.field4968;
                            this.field6020[var48] += class681.field9335;
                            this.field6033[var48] += class469.field6654;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field6051[var59] -= class351.field4968;
                            this.field6020[var59] -= class681.field9335;
                            this.field6033[var59] -= class469.field6654;
                            if (arg2 != 0) {
                                int var60 = class164.field2258[arg2];
                                int var61 = class164.field2252[arg2];
                                int var62 = this.field6020[var59] * var61 + 16383 - (this.field6033[var59] * var60) >> 14;
                                this.field6033[var59] = this.field6033[var59] * var61 + this.field6020[var59] * var60 + 16383 >> 14;
                                this.field6020[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class164.field2258[arg4];
                                int var64 = class164.field2252[arg4];
                                int var65 = this.field6020[var59] * var63 + (this.field6051[var59] * var64) + 16383 >> 14;
                                this.field6020[var59] = this.field6020[var59] * var64 - (this.field6051[var59] * var63 - 16383) >> 14;
                                this.field6051[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class164.field2258[arg3];
                                int var67 = class164.field2252[arg3];
                                int var68 = this.field6051[var59] * var67 + this.field6033[var59] * var66 + 16383 >> 14;
                                this.field6033[var59] = this.field6033[var59] * var67 + 16383 - this.field6051[var59] * var66 >> 14;
                                this.field6051[var59] = var68;
                            }
                            this.field6051[var59] += class351.field4968;
                            this.field6020[var59] += class681.field9335;
                            this.field6033[var59] += class469.field6654;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field6083.length) {
                        int[] var29 = this.field6083[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field6039[var31];
                            int var33 = this.field6039[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field6040[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class164.field2258[arg4];
                                    int var37 = class164.field2252[arg4];
                                    int var38 = this.field6063[var35] * var37 + this.field6003[var35] * var36 + 16383 >> 14;
                                    this.field6003[var35] = (short) (this.field6003[var35] * var37 + 16383 - (this.field6063[var35] * var36) >> 14);
                                    this.field6063[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class164.field2258[arg2];
                                    int var40 = class164.field2252[arg2];
                                    int var41 = this.field6003[var35] * var40 + 16383 - this.field6102[var35] * var39 >> 14;
                                    this.field6102[var35] = (short) (this.field6102[var35] * var40 + this.field6003[var35] * var39 + 16383 >> 14);
                                    this.field6003[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class164.field2258[arg3];
                                    int var43 = class164.field2252[arg3];
                                    int var44 = this.field6102[var35] * var42 + this.field6063[var35] * var43 + 16383 >> 14;
                                    this.field6102[var35] = (short) (this.field6102[var35] * var43 + 16383 - (this.field6063[var35] * var42) >> 14);
                                    this.field6063[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field6000 == null && this.field6090 != null) {
                    this.field6090.field2509 = null;
                }
                if (this.field6000 != null) {
                    this.field6000.field2509 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field6083.length > var70) {
                    int[] var71 = this.field6083[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field6051[var73] -= class351.field4968;
                        this.field6020[var73] -= class681.field9335;
                        this.field6033[var73] -= class469.field6654;
                        this.field6051[var73] = this.field6051[var73] * arg2 >> 7;
                        this.field6020[var73] = this.field6020[var73] * arg3 >> 7;
                        this.field6033[var73] = this.field6033[var73] * arg4 >> 7;
                        this.field6051[var73] += class351.field4968;
                        this.field6020[var73] += class681.field9335;
                        this.field6033[var73] += class469.field6654;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6021 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field6021.length > var78) {
                        int[] var79 = this.field6021[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field6011[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field6011[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field6090 != null) {
                            this.field6090.field2509 = null;
                        }
                    }
                }
                if (this.field6114 != null) {
                    for (int var75 = 0; var75 < this.field6018; var75++) {
                        class270 var76 = this.field6114[var75];
                        class545 var77 = this.field6117[var75];
                        var77.field7596 = 255 - (this.field6011[var76.field3868] & 0xFF) << 24 | var77.field7596 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6021 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field6021.length > var87) {
                        int[] var88 = this.field6021[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field6029[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3D3) >> 7;
                            int var94 = var92 + arg2 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            int var97 = arg4 + var96;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field6029[var90] = (short) class325.method2116(class325.method2116(var94 << 10, var95 << 7), var97);
                        }
                        if (var88.length > 0 && this.field6090 != null) {
                            this.field6090.field2509 = null;
                        }
                    }
                }
                if (this.field6114 != null) {
                    for (int var84 = 0; var84 < this.field6018; var84++) {
                        class270 var85 = this.field6114[var84];
                        class545 var86 = this.field6117[var84];
                        var86.field7596 = var86.field7596 & 0xFF000000 | class295.field4163[this.field6029[var85.field3868] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6052 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field6052.length > var99) {
                        int[] var100 = this.field6052[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class545 var102 = this.field6117[var100[var101]];
                            var102.field7602 += arg3;
                            var102.field7594 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6052 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field6052.length > var104) {
                        int[] var105 = this.field6052[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class545 var107 = this.field6117[var105[var106]];
                            var107.field7598 = var107.field7598 * arg2 >> 7;
                            var107.field7593 = var107.field7593 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6052 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field6052.length > var109) {
                    int[] var110 = this.field6052[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class545 var112 = this.field6117[var110[var111]];
                        var112.field7601 = var112.field7601 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lnga;)V")
    public final void method239(class513 arg0) {
        field6073++;
        class55 var2 = (class55) arg0;
        if (this.field6074 != null) {
            for (int var3 = 0; var3 < this.field6074.length; var3++) {
                class531 var4 = this.field6074[var3];
                class531 var5 = var4;
                if (var4.field7484 != null) {
                    var5 = var4.field7484;
                }
                var5.field7478 = (int) ((float) this.field6033[var4.field7492] * var2.field643 + (float) this.field6051[var4.field7492] * var2.field628 + (float) this.field6020[var4.field7492] * var2.field664 + var2.field665);
                var5.field7485 = (int) ((float) this.field6033[var4.field7492] * var2.field647 + (float) this.field6051[var4.field7492] * var2.field626 + (float) this.field6020[var4.field7492] * var2.field649 + var2.field655);
                var5.field7491 = (int) ((float) this.field6033[var4.field7492] * var2.field638 + (float) this.field6051[var4.field7492] * var2.field661 + (float) this.field6020[var4.field7492] * var2.field656 + var2.field632);
                var5.field7490 = (int) ((float) this.field6033[var4.field7496] * var2.field643 + (float) this.field6051[var4.field7496] * var2.field628 + (float) this.field6020[var4.field7496] * var2.field664 + var2.field665);
                var5.field7480 = (int) ((float) this.field6033[var4.field7496] * var2.field647 + (float) this.field6051[var4.field7496] * var2.field626 + (float) this.field6020[var4.field7496] * var2.field649 + var2.field655);
                var5.field7479 = (int) ((float) this.field6033[var4.field7496] * var2.field638 + (float) this.field6051[var4.field7496] * var2.field661 + (float) this.field6020[var4.field7496] * var2.field656 + var2.field632);
                var5.field7488 = (int) ((float) this.field6033[var4.field7483] * var2.field643 + (float) this.field6051[var4.field7483] * var2.field628 + (float) this.field6020[var4.field7483] * var2.field664 + var2.field665);
                var5.field7495 = (int) ((float) this.field6033[var4.field7483] * var2.field647 + (float) this.field6051[var4.field7483] * var2.field626 + (float) this.field6020[var4.field7483] * var2.field649 + var2.field655);
                var5.field7477 = (int) ((float) this.field6033[var4.field7483] * var2.field638 + (float) this.field6051[var4.field7483] * var2.field661 + (float) this.field6020[var4.field7483] * var2.field656 + var2.field632);
            }
        }
        if (this.field6071 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field6071.length; var6++) {
            class253 var7 = this.field6071[var6];
            class253 var8 = var7;
            if (var7.field3707 != null) {
                var8 = var7.field3707;
            }
            if (var7.field3701 == null) {
                var7.field3701 = var2.method349();
            } else {
                var7.field3701.method344(var2);
            }
            var8.field3702 = (int) ((float) this.field6033[var7.field3693] * var2.field643 + (float) this.field6051[var7.field3693] * var2.field628 + (float) this.field6020[var7.field3693] * var2.field664 + var2.field665);
            var8.field3706 = (int) ((float) this.field6033[var7.field3693] * var2.field647 + (float) this.field6051[var7.field3693] * var2.field626 + (float) this.field6020[var7.field3693] * var2.field649 + var2.field655);
            var8.field3698 = (int) ((float) this.field6033[var7.field3693] * var2.field638 + (float) this.field6051[var7.field3693] * var2.field661 + (float) this.field6020[var7.field3693] * var2.field656 + var2.field632);
        }
    }

    @OriginalMember(owner = "client!li", name = "v", descriptor = "()V")
    public final void method263() {
        field6031++;
        for (int var1 = 0; var1 < this.field6078; var1++) {
            this.field6033[var1] = -this.field6033[var1];
        }
        for (int var2 = 0; var2 < this.field6096; var2++) {
            this.field6102[var2] = (short) (-this.field6102[var2]);
        }
        for (int var3 = 0; var3 < this.field6068; var3++) {
            short var4 = this.field6105[var3];
            this.field6105[var3] = this.field6008[var3];
            this.field6008[var3] = var4;
        }
        if (this.field6000 == null && this.field6090 != null) {
            this.field6090.field2509 = null;
        }
        if (this.field6000 != null) {
            this.field6000.field2509 = null;
        }
        if (this.field6084 != null) {
            this.field6084.field9372 = null;
        }
        this.field6017 = false;
        if (this.field6086 != null) {
            this.field6086.field2509 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    private final void method2611(int arg0) {
        if (arg0 != 7) {
            return;
        }
        if (this.field6114 != null) {
            class55 var2 = this.field6067.field1785;
            this.field6067.method928((byte) -114);
            this.field6067.method490(!this.field6094);
            this.field6067.method898(false, -25994);
            this.field6067.method935(null, this.field6067.field1855, null, (byte) 99, this.field6067.field1827);
            for (int var3 = 0; var3 < this.field6018; var3++) {
                class270 var4 = this.field6114[var3];
                class545 var5 = this.field6117[var3];
                if (!var4.field3864 || !this.field6067.method491()) {
                    float var6 = (float) (this.field6051[var4.field3871] + this.field6051[var4.field3862] + this.field6051[var4.field3873]) * 0.3333333F;
                    float var7 = (float) (this.field6020[var4.field3873] + this.field6020[var4.field3862] + this.field6020[var4.field3871]) * 0.3333333F;
                    float var8 = (float) (this.field6033[var4.field3873] - (-this.field6033[var4.field3871] - this.field6033[var4.field3862])) * 0.3333333F;
                    float var9 = class533.field7513 * var8 + class556.field7802 * var6 + class109.field1321 * var7 + class738.field10274;
                    float var10 = class145.field2090 * var8 + class659.field9023 * var7 + class18.field283 * var6 + class345.field4853;
                    float var11 = class367.field5201 * var8 + class448.field6365 * var7 + class365.field5166 * var6 + class725.field10121;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field3875;
                    var2.method358(1, var4.field3867 * var5.field7593 >> 7, var11 * var12 - var11, var4.field3872 * var5.field7598 >> 7, (float) var5.field7594 + var9 - var9 * var12, var10 * var12 + ((float) var5.field7602 - var10), var5.field7601);
                    this.field6067.method954(var2, 73);
                    int var13 = var5.field7596;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field6067.method922(arg0 + 116, var4.field3869);
                    this.field6067.method914(1, var4.field3866);
                    this.field6067.method899(7, 4, 0, 67);
                }
            }
            this.field6067.method490(true);
            this.field6067.method878(-124);
        }
        field6110++;
    }

    @OriginalMember(owner = "client!li", name = "H", descriptor = "(III)V")
    public final void method235(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field6078; var4++) {
            if (arg0 != 0) {
                this.field6051[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field6020[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field6033[var4] += arg2;
            }
        }
        field6066++;
        if (this.field6086 != null) {
            this.field6086.field2509 = null;
        }
        this.field6017 = false;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V")
    private final void method2612(byte arg0) {
        field6025++;
        if (this.field6035 == 0) {
            return;
        }
        if (this.field6009 != 0) {
            this.method2606(true, (byte) 83);
        }
        this.method2606(false, (byte) 83);
        if (arg0 < 37) {
            this.field6009 = 77;
        }
        if (this.field6084 != null) {
            if (this.field6084.field9372 == null) {
                this.method2605((byte) 116, (this.field6009 & 0x10) != 0);
            }
            if (this.field6084.field9372 != null) {
                this.field6067.method898(this.field6000 != null, -25994);
                this.field6067.method935(this.field6000, this.field6086, this.field6090, (byte) 115, this.field6001);
                int var2 = this.field6028.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field6028[var3];
                    int var5 = this.field6028[var3 + 1];
                    int var6 = this.field6088[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field6067.method925(this.field6000 != null, (byte) 93, var6);
                    this.field6067.method919(97, var4 * 3, 4, (var5 - var4) * 3, this.field6084.field9372);
                }
            }
        }
        this.method2614(-1);
    }

    @OriginalMember(owner = "client!li", name = "k", descriptor = "(I)V")
    public final void method252(int arg0) {
        field6070++;
        int var2 = class164.field2258[arg0];
        int var3 = class164.field2252[arg0];
        for (int var4 = 0; var4 < this.field6078; var4++) {
            int var7 = this.field6033[var4] * var2 + (this.field6051[var4] * var3) >> 14;
            this.field6033[var4] = this.field6033[var4] * var3 - (this.field6051[var4] * var2) >> 14;
            this.field6051[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field6096; var5++) {
            int var6 = this.field6102[var5] * var2 + this.field6063[var5] * var3 >> 14;
            this.field6102[var5] = (short) (this.field6102[var5] * var3 - (this.field6063[var5] * var2) >> 14);
            this.field6063[var5] = (short) var6;
        }
        if (this.field6000 == null && this.field6090 != null) {
            this.field6090.field2509 = null;
        }
        if (this.field6000 != null) {
            this.field6000.field2509 = null;
        }
        if (this.field6086 != null) {
            this.field6086.field2509 = null;
        }
        this.field6017 = false;
    }

    @OriginalMember(owner = "client!li", name = "fa", descriptor = "()I")
    public final int method253() {
        field6091++;
        if (!this.field6017) {
            this.method2610((byte) -128);
        }
        return this.field6038;
    }

    @OriginalMember(owner = "client!li", name = "O", descriptor = "(III)V")
    public final void method258(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field6078; var4++) {
            if (arg0 != 128) {
                this.field6051[var4] = this.field6051[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field6020[var4] = this.field6020[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field6033[var4] = this.field6033[var4] * arg2 >> 7;
            }
        }
        field6107++;
        if (this.field6086 != null) {
            this.field6086.field2509 = null;
        }
        this.field6017 = false;
    }

    @OriginalMember(owner = "client!li", name = "WA", descriptor = "()I")
    public final int method236() {
        field5999++;
        return this.field6027;
    }

    @OriginalMember(owner = "client!li", name = "RA", descriptor = "()I")
    public final int method259() {
        if (!this.field6017) {
            this.method2610((byte) -126);
        }
        field6057++;
        return this.field6093;
    }

    @OriginalMember(owner = "client!li", name = "C", descriptor = "(I)V")
    public final void method223(int arg0) {
        if (this.field6090 != null) {
            this.field6090.field2509 = null;
        }
        this.field6027 = (short) arg0;
        field6099++;
    }

    @OriginalMember(owner = "client!li", name = "P", descriptor = "(IIII)V")
    public final void method268(int arg0, int arg1, int arg2, int arg3) {
        field6113++;
        if (arg0 == 0) {
            int var5 = 0;
            class681.field9335 = 0;
            class469.field6654 = 0;
            class351.field4968 = 0;
            for (int var6 = 0; var6 < this.field6078; var6++) {
                class351.field4968 += this.field6051[var6];
                class681.field9335 += this.field6020[var6];
                class469.field6654 += this.field6033[var6];
                var5++;
            }
            if (var5 > 0) {
                class681.field9335 = class681.field9335 / var5 + arg2;
                class469.field6654 = class469.field6654 / var5 + arg3;
                class351.field4968 = class351.field4968 / var5 + arg1;
            } else {
                class351.field4968 = arg1;
                class681.field9335 = arg2;
                class469.field6654 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field6078; var7++) {
                this.field6051[var7] += arg1;
                this.field6020[var7] += arg2;
                this.field6033[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field6078; var8++) {
                this.field6051[var8] -= class351.field4968;
                this.field6020[var8] -= class681.field9335;
                this.field6033[var8] -= class469.field6654;
                if (arg3 != 0) {
                    int var9 = class164.field2258[arg3];
                    int var10 = class164.field2252[arg3];
                    int var11 = this.field6020[var8] * var9 + (this.field6051[var8] * var10) + 16383 >> 14;
                    this.field6020[var8] = this.field6020[var8] * var10 + 16383 - (this.field6051[var8] * var9) >> 14;
                    this.field6051[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class164.field2258[arg1];
                    int var13 = class164.field2252[arg1];
                    int var14 = this.field6020[var8] * var13 + 16383 - (this.field6033[var8] * var12) >> 14;
                    this.field6033[var8] = this.field6020[var8] * var12 + (this.field6033[var8] * var13) + 16383 >> 14;
                    this.field6020[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class164.field2258[arg2];
                    int var16 = class164.field2252[arg2];
                    int var17 = this.field6051[var8] * var16 + this.field6033[var8] * var15 + 16383 >> 14;
                    this.field6033[var8] = this.field6033[var8] * var16 + 16383 - (this.field6051[var8] * var15) >> 14;
                    this.field6051[var8] = var17;
                }
                this.field6051[var8] += class351.field4968;
                this.field6020[var8] += class681.field9335;
                this.field6033[var8] += class469.field6654;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field6078; var18++) {
                this.field6051[var18] -= class351.field4968;
                this.field6020[var18] -= class681.field9335;
                this.field6033[var18] -= class469.field6654;
                this.field6051[var18] = this.field6051[var18] * arg1 / 128;
                this.field6020[var18] = this.field6020[var18] * arg2 / 128;
                this.field6033[var18] = this.field6033[var18] * arg3 / 128;
                this.field6051[var18] += class351.field4968;
                this.field6020[var18] += class681.field9335;
                this.field6033[var18] += class469.field6654;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field6068; var19++) {
                int var23 = (this.field6011[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field6011[var19] = (byte) var23;
            }
            if (this.field6090 != null) {
                this.field6090.field2509 = null;
            }
            if (this.field6114 != null) {
                for (int var20 = 0; var20 < this.field6018; var20++) {
                    class270 var21 = this.field6114[var20];
                    class545 var22 = this.field6117[var20];
                    var22.field7596 = var22.field7596 & 0xFFFFFF | 255 - (this.field6011[var21.field3868] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field6068; var24++) {
                int var28 = this.field6029[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
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
                this.field6029[var24] = (short) class325.method2116(class325.method2116(var31 << 7, var33 << 10), var34);
            }
            if (this.field6090 != null) {
                this.field6090.field2509 = null;
            }
            if (this.field6114 != null) {
                for (int var25 = 0; var25 < this.field6018; var25++) {
                    class270 var26 = this.field6114[var25];
                    class545 var27 = this.field6117[var25];
                    var27.field7596 = class295.field4163[this.field6029[var26.field3868] & 0xFFFF] & 0xFFFFFF | var27.field7596 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field6018; var35++) {
                class545 var36 = this.field6117[var35];
                var36.field7602 += arg2;
                var36.field7594 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field6018; var37++) {
                class545 var38 = this.field6117[var37];
                var38.field7593 = var38.field7593 * arg2 >> 7;
                var38.field7598 = var38.field7598 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field6018; var39++) {
                class545 var40 = this.field6117[var39];
                var40.field7601 = var40.field7601 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IBIIS)I")
    private final int method2613(int arg0, byte arg1, int arg2, int arg3, short arg4) {
        field6026++;
        if (arg3 < 21) {
            return -43;
        }
        int var6 = class295.field4163[class462.method2742(116, arg0, arg2)];
        if (arg4 != -1) {
            class502 var7 = this.field6067.field715.method532((byte) 127, arg4 & 0xFFFF);
            int var8 = var7.field7192 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg2 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field7196 & 0xFF;
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
                var6 = (var13 << 8 & 0xFF000C) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lnga;IZ)V")
    public final void method264(class513 arg0, int arg1, boolean arg2) {
        field6024++;
        if (this.field6034 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field6078; var5++) {
            if ((arg1 & this.field6034[var5]) != 0) {
                if (arg2) {
                    arg0.method353(this.field6051[var5], this.field6020[var5], this.field6033[var5], var4);
                } else {
                    arg0.method357(this.field6051[var5], this.field6020[var5], this.field6033[var5], var4);
                }
                this.field6051[var5] = var4[0];
                this.field6020[var5] = var4[1];
                this.field6033[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "r", descriptor = "()Z")
    public final boolean method243() {
        field6030++;
        return this.field6092;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IILnga;ZII)Z")
    public final boolean method229(int arg0, int arg1, class513 arg2, boolean arg3, int arg4, int arg5) {
        field6010++;
        return this.method2615(arg0, arg2, arg4, arg3, arg5, arg1, 1);
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "()V")
    public final void method220() {
        field6118++;
    }

    @OriginalMember(owner = "client!li", name = "EA", descriptor = "()I")
    public final int method222() {
        if (!this.field6017) {
            this.method2610((byte) -126);
        }
        field6079++;
        return this.field6058;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BIZ)Lka;")
    public final class471 method226(byte arg0, int arg1, boolean arg2) {
        field6085++;
        class428 var4;
        class428 var5;
        if (arg0 == 1) {
            var4 = this.field6067.field1902;
            var5 = this.field6067.field1850;
        } else if (arg0 == 2) {
            var5 = this.field6067.field1899;
            var4 = this.field6067.field1871;
        } else if (arg0 == 3) {
            var5 = this.field6067.field1896;
            var4 = this.field6067.field1927;
        } else if (arg0 == 4) {
            var4 = this.field6067.field1859;
            var5 = this.field6067.field1860;
        } else if (arg0 == 5) {
            var4 = this.field6067.field1873;
            var5 = this.field6067.field1836;
        } else {
            var4 = var5 = new class428(this.field6067);
        }
        return this.method2608(var5, (byte) 25, arg2, arg0 != 0, arg1, var4);
    }

    @OriginalMember(owner = "client!li", name = "G", descriptor = "()I")
    public final int method245() {
        if (!this.field6017) {
            this.method2610((byte) -126);
        }
        field6069++;
        return this.field6100;
    }

    @OriginalMember(owner = "client!li", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method248(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field6004++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            class469.field6654 = 0;
            class351.field4968 = 0;
            int var13 = 0;
            class681.field9335 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field6083.length) {
                    int[] var16 = this.field6083[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field6034 == null || (this.field6034[var18] & arg6) != 0) {
                            class351.field4968 += this.field6051[var18];
                            class681.field9335 += this.field6020[var18];
                            class469.field6654 += this.field6033[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class351.field4968 = var12;
                class681.field9335 = var11;
                class469.field6654 = var10;
            } else {
                class681.field9335 = class681.field9335 / var13 + var11;
                class469.field6654 = class469.field6654 / var13 + var10;
                class475.field6745 = true;
                class351.field4968 = class351.field4968 / var13 + var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[2] * arg4 + (arg7[1] * arg3) + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[5] * arg4 + (arg7[4] * arg3) + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field6083.length) {
                    int[] var27 = this.field6083[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field6034 == null || (this.field6034[var29] & arg6) != 0) {
                            this.field6051[var29] += var23;
                            this.field6020[var29] += var22;
                            this.field6033[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field6083.length) {
                        int[] var110 = this.field6083[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field6034 == null || (arg6 & this.field6034[var112]) != 0) {
                                this.field6051[var112] -= class351.field4968;
                                this.field6020[var112] -= class681.field9335;
                                this.field6033[var112] -= class469.field6654;
                                if (arg4 != 0) {
                                    int var113 = class164.field2258[arg4];
                                    int var114 = class164.field2252[arg4];
                                    int var115 = this.field6020[var112] * var113 + (this.field6051[var112] * var114) + 16383 >> 14;
                                    this.field6020[var112] = this.field6020[var112] * var114 + 16383 - (this.field6051[var112] * var113) >> 14;
                                    this.field6051[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class164.field2258[arg2];
                                    int var117 = class164.field2252[arg2];
                                    int var118 = this.field6020[var112] * var117 + (16383 - (this.field6033[var112] * var116)) >> 14;
                                    this.field6033[var112] = this.field6020[var112] * var116 + this.field6033[var112] * var117 + 16383 >> 14;
                                    this.field6020[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class164.field2258[arg3];
                                    int var120 = class164.field2252[arg3];
                                    int var121 = this.field6033[var112] * var119 + this.field6051[var112] * var120 + 16383 >> 14;
                                    this.field6033[var112] = this.field6033[var112] * var120 + 16383 - (this.field6051[var112] * var119) >> 14;
                                    this.field6051[var112] = var121;
                                }
                                this.field6051[var112] += class351.field4968;
                                this.field6020[var112] += class681.field9335;
                                this.field6033[var112] += class469.field6654;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field6083.length) {
                            int[] var93 = this.field6083[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field6034 == null || (this.field6034[var95] & arg6) != 0) {
                                    int var96 = this.field6039[var95];
                                    int var97 = this.field6039[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field6040[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class164.field2258[arg4];
                                            int var101 = class164.field2252[arg4];
                                            int var102 = this.field6003[var99] * var100 + this.field6063[var99] * var101 + 16383 >> 14;
                                            this.field6003[var99] = (short) (this.field6003[var99] * var101 + 16383 - (this.field6063[var99] * var100) >> 14);
                                            this.field6063[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class164.field2258[arg2];
                                            int var104 = class164.field2252[arg2];
                                            int var105 = this.field6003[var99] * var104 - (this.field6102[var99] * var103 - 16383) >> 14;
                                            this.field6102[var99] = (short) (this.field6102[var99] * var104 + this.field6003[var99] * var103 + 16383 >> 14);
                                            this.field6003[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class164.field2258[arg3];
                                            int var107 = class164.field2252[arg3];
                                            int var108 = this.field6102[var99] * var106 + this.field6063[var99] * var107 + 16383 >> 14;
                                            this.field6102[var99] = (short) (this.field6102[var99] * var107 + 16383 - (this.field6063[var99] * var106) >> 14);
                                            this.field6063[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6000 == null && this.field6090 != null) {
                        this.field6090.field2509 = null;
                    }
                    if (this.field6000 != null) {
                        this.field6000.field2509 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class475.field6745) {
                    int var36 = arg7[6] * class469.field6654 + arg7[0] * class351.field4968 + arg7[3] * class681.field9335 + 8192 >> 14;
                    int var37 = arg7[7] * class469.field6654 + arg7[4] * class681.field9335 + arg7[1] * class351.field4968 + 8192 >> 14;
                    int var38 = arg7[2] * class351.field4968 + (arg7[5] * class681.field9335) + (arg7[8] * class469.field6654) + 8192 >> 14;
                    int var39 = var34 + var37;
                    int var40 = var33 + var36;
                    int var41 = var35 + var38;
                    class681.field9335 = var39;
                    class351.field4968 = var40;
                    class475.field6745 = false;
                    class469.field6654 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class164.field2252[arg2];
                int var44 = class164.field2258[arg2];
                int var45 = class164.field2252[arg3];
                int var46 = class164.field2258[arg3];
                int var47 = class164.field2252[arg4];
                int var48 = class164.field2258[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[5] = -var44;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[6] = -var46 * var47 - (-(var45 * var50) - 8192) >> 14;
                var42[7] = var46 * var48 - (-(var45 * var49) - 8192) >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                int var51 = var42[2] * -class469.field6654 + (var42[0] * -class351.field4968 + (var42[1] * -class681.field9335) + 8192) >> 14;
                int var52 = var42[5] * -class469.field6654 + var42[3] * -class351.field4968 - (-(var42[4] * -class681.field9335) + -8192) >> 14;
                int var53 = var42[6] * -class351.field4968 + (var42[7] * -class681.field9335 + var42[8] * -class469.field6654 + 8192) >> 14;
                int var54 = class351.field4968 + var51;
                int var55 = class681.field9335 + var52;
                int var56 = class469.field6654 + var53;
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
                int var59 = var42[2] * var35 + var42[1] * var34 + var42[0] * var33 + 8192 >> 14;
                int var60 = var42[5] * var35 + var42[4] * var34 + (var42[3] * var33 - -8192) >> 14;
                int var61 = var55 + var60;
                int var62 = var42[7] * var34 + (var42[8] * var35) + var42[6] * var33 + 8192 >> 14;
                int var63 = var54 + var59;
                int var64 = var56 + var62;
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
                int var67 = arg7[2] * var64 + arg7[0] * var63 + (arg7[1] * var61) + 8192 >> 14;
                int var68 = arg7[4] * var61 + (arg7[3] * var63 + arg7[5] * var64 + 8192) >> 14;
                int var69 = arg7[6] * var63 + arg7[8] * var64 + arg7[7] * var61 + 8192 >> 14;
                int var70 = var31 + var68;
                int var71 = var30 + var67;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field6083.length > var74) {
                        int[] var75 = this.field6083[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field6034 == null || (arg6 & this.field6034[var77]) != 0) {
                                int var78 = this.field6051[var77] * var65[0] + this.field6020[var77] * var65[1] + this.field6033[var77] * var65[2] + 8192 >> 14;
                                int var79 = this.field6051[var77] * var65[3] + this.field6033[var77] * var65[5] + (this.field6020[var77] * var65[4]) + 8192 >> 14;
                                int var80 = this.field6051[var77] * var65[6] + this.field6033[var77] * var65[8] + this.field6020[var77] * var65[7] + 8192 >> 14;
                                int var81 = var71 + var78;
                                int var82 = var70 + var79;
                                this.field6051[var77] = var81;
                                int var83 = var72 + var80;
                                this.field6020[var77] = var82;
                                this.field6033[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field6083.length) {
                        int[] var174 = this.field6083[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field6034 == null || (arg6 & this.field6034[var176]) != 0) {
                                this.field6051[var176] -= class351.field4968;
                                this.field6020[var176] -= class681.field9335;
                                this.field6033[var176] -= class469.field6654;
                                this.field6051[var176] = this.field6051[var176] * arg2 >> 7;
                                this.field6020[var176] = this.field6020[var176] * arg3 >> 7;
                                this.field6033[var176] = this.field6033[var176] * arg4 >> 7;
                                this.field6051[var176] += class351.field4968;
                                this.field6020[var176] += class681.field9335;
                                this.field6033[var176] += class469.field6654;
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
                if (class475.field6745) {
                    int var128 = arg7[6] * class469.field6654 + arg7[3] * class681.field9335 + arg7[0] * class351.field4968 + 8192 >> 14;
                    int var129 = arg7[7] * class469.field6654 + arg7[4] * class681.field9335 + arg7[1] * class351.field4968 + 8192 >> 14;
                    int var130 = var125 + var128;
                    int var131 = arg7[2] * class351.field4968 + arg7[5] * class681.field9335 + arg7[8] * class469.field6654 + 8192 >> 14;
                    int var132 = var126 + var129;
                    class681.field9335 = var132;
                    int var133 = var127 + var131;
                    class351.field4968 = var130;
                    class475.field6745 = false;
                    class469.field6654 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class351.field4968 * var134 + 8192 >> 14;
                int var138 = -class681.field9335 * var135 + 8192 >> 14;
                int var139 = -class469.field6654 * var136 + 8192 >> 14;
                int var140 = class351.field4968 + var137;
                int var141 = class681.field9335 + var138;
                int var142 = class469.field6654 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var141 + var145;
                int var147 = var127 * var136 + 8192 >> 14;
                int var148 = var140 + var144;
                int var149 = var142 + var147;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[2] * var149 + arg7[1] * var146 + (arg7[0] * var148 - -8192) >> 14;
                int var153 = arg7[4] * var146 + arg7[3] * var148 + (arg7[5] * var149) + 8192 >> 14;
                int var154 = var122 + var152;
                int var155 = var123 + var153;
                int var156 = arg7[6] * var148 + arg7[8] * var149 + arg7[7] * var146 + 8192 >> 14;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field6083.length) {
                        int[] var160 = this.field6083[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field6034 == null || (this.field6034[var162] & arg6) != 0) {
                                int var163 = this.field6020[var162] * var150[1] + (this.field6051[var162] * var150[0] - (-(this.field6033[var162] * var150[2]) - 8192)) >> 14;
                                int var164 = this.field6020[var162] * var150[4] + (this.field6033[var162] * var150[5]) + this.field6051[var162] * var150[3] + 8192 >> 14;
                                int var165 = var154 + var163;
                                int var166 = this.field6051[var162] * var150[6] + this.field6033[var162] * var150[8] + this.field6020[var162] * var150[7] + 8192 >> 14;
                                int var167 = var155 + var164;
                                this.field6051[var162] = var165;
                                int var168 = var157 + var166;
                                this.field6020[var162] = var167;
                                this.field6033[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6021 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field6021.length > var181) {
                        int[] var182 = this.field6021[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field6032 == null || (this.field6032[var184] & arg6) != 0) {
                                int var185 = (this.field6011[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field6011[var184] = (byte) var185;
                                if (this.field6090 != null) {
                                    this.field6090.field2509 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6114 != null) {
                    for (int var178 = 0; var178 < this.field6018; var178++) {
                        class270 var179 = this.field6114[var178];
                        class545 var180 = this.field6117[var178];
                        var180.field7596 = 255 - (this.field6011[var179.field3868] & 0xFF) << 24 | var180.field7596 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6021 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field6021.length > var190) {
                        int[] var191 = this.field6021[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field6032 == null || (this.field6032[var193] & arg6) != 0) {
                                int var194 = this.field6029[var193] & 0xFFFF;
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
                                this.field6029[var193] = (short) class325.method2116(var200, class325.method2116(var197 << 10, var199 << 7));
                                if (this.field6090 != null) {
                                    this.field6090.field2509 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6114 != null) {
                    for (int var187 = 0; var187 < this.field6018; var187++) {
                        class270 var188 = this.field6114[var187];
                        class545 var189 = this.field6117[var187];
                        var189.field7596 = class295.field4163[this.field6029[var188.field3868] & 0xFFFF] & 0xFFFFFF | var189.field7596 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field6052 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field6052.length) {
                        int[] var203 = this.field6052[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class545 var205 = this.field6117[var203[var204]];
                            var205.field7594 += arg2;
                            var205.field7602 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field6052 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field6052.length) {
                        int[] var208 = this.field6052[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class545 var210 = this.field6117[var208[var209]];
                            var210.field7598 = var210.field7598 * arg2 >> 7;
                            var210.field7593 = var210.field7593 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field6052 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field6052.length) {
                    int[] var213 = this.field6052[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class545 var215 = this.field6117[var213[var214]];
                        var215.field7601 = var215.field7601 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "FA", descriptor = "(I)V")
    public final void method238(int arg0) {
        field6062++;
        int var2 = class164.field2258[arg0];
        int var3 = class164.field2252[arg0];
        for (int var4 = 0; var4 < this.field6078; var4++) {
            int var5 = this.field6020[var4] * var3 - (this.field6033[var4] * var2) >> 14;
            this.field6033[var4] = this.field6033[var4] * var3 + this.field6020[var4] * var2 >> 14;
            this.field6020[var4] = var5;
        }
        if (this.field6086 != null) {
            this.field6086.field2509 = null;
        }
        this.field6017 = false;
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    private final void method2614(int arg0) {
        field6023++;
        if (!this.field6080) {
            return;
        }
        this.field6080 = false;
        if (this.field6074 == null && this.field6071 == null && this.field6114 == null) {
            if (this.field6051 != null && !class5.method27(this.field6044, this.field6016, -72)) {
                if (this.field6086 != null && this.field6086.field2509 == null) {
                    this.field6080 = true;
                } else {
                    if (!this.field6017) {
                        this.method2610((byte) -127);
                    }
                    this.field6051 = null;
                }
            }
            if (this.field6020 != null && !class136.method969(false, this.field6016, this.field6044)) {
                if (this.field6086 != null && this.field6086.field2509 == null) {
                    this.field6080 = true;
                } else {
                    if (!this.field6017) {
                        this.method2610((byte) -126);
                    }
                    this.field6020 = null;
                }
            }
            if (this.field6033 != null && !class18.method109((byte) -36, this.field6016, this.field6044)) {
                if (this.field6086 != null && this.field6086.field2509 == null) {
                    this.field6080 = true;
                } else {
                    if (!this.field6017) {
                        this.method2610((byte) -126);
                    }
                    this.field6033 = null;
                }
            }
        }
        if (this.field6040 != null && this.field6051 == null && this.field6020 == null && this.field6033 == null) {
            this.field6039 = null;
            this.field6040 = null;
        }
        if (this.field6106 != null && !class511.method3020(this.field6016, this.field6044, (byte) -27)) {
            if (this.field6000 == null) {
                if (this.field6090 != null && this.field6090.field2509 == null) {
                    this.field6080 = true;
                } else {
                    this.field6106 = null;
                    this.field6063 = this.field6003 = this.field6102 = null;
                }
            } else if (this.field6000.field2509 == null) {
                this.field6080 = true;
            } else {
                this.field6106 = null;
                this.field6063 = this.field6003 = this.field6102 = null;
            }
        }
        if (this.field6029 != null && !class70.method575(-71, this.field6016, this.field6044)) {
            if (this.field6090 != null && this.field6090.field2509 == null) {
                this.field6080 = true;
            } else {
                this.field6029 = null;
            }
        }
        if (this.field6011 != null && !class551.method3190(this.field6016, this.field6044, -14976)) {
            if (this.field6090 != null && this.field6090.field2509 == null) {
                this.field6080 = true;
            } else {
                this.field6011 = null;
            }
        }
        if (this.field6036 != null && !class753.method4192(this.field6016, this.field6044, (byte) 68)) {
            if (this.field6001 != null && this.field6001.field2509 == null) {
                this.field6080 = true;
            } else {
                this.field6036 = this.field6045 = null;
            }
        }
        if (this.field6088 != null && !class568.method3268(this.field6016, this.field6044, (byte) 5)) {
            if (this.field6090 != null && this.field6090.field2509 == null) {
                this.field6080 = true;
            } else {
                this.field6088 = null;
            }
        }
        if (this.field6105 != null && !class109.method777(this.field6016, this.field6044, (byte) -6)) {
            if ((this.field6084 == null || this.field6084.field9372 != null) && (this.field6090 == null || this.field6090.field2509 != null)) {
                this.field6105 = this.field6076 = this.field6008 = null;
            } else {
                this.field6080 = true;
            }
        }
        if (this.field6021 != null && !class281.method1847(this.field6016, (byte) -65, this.field6044)) {
            this.field6032 = null;
            this.field6021 = null;
        }
        if (this.field6083 != null && !class103.method738(12869, this.field6016, this.field6044)) {
            this.field6034 = null;
            this.field6083 = null;
        }
        if (arg0 != -1) {
            return;
        }
        if (this.field6052 != null && !class94.method694(arg0 ^ 0x7D, this.field6016, this.field6044)) {
            this.field6052 = null;
        }
        if (this.field6028 != null && (this.field6044 & 0x800) == 0 && (this.field6044 & 0x40000) == 0) {
            this.field6028 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lnga;Lfn;II)V")
    public final void method262(class513 arg0, class137 arg1, int arg2, int arg3) {
        field6097++;
        if (this.field6096 == 0) {
            return;
        }
        class55 var5 = this.field6067.field1816;
        class55 var6 = (class55) arg0;
        if (!this.field6017) {
            this.method2610((byte) -128);
        }
        class725.field10121 = var5.field638 * var6.field632 + var5.field661 * var6.field665 + var5.field656 * var6.field655 + var5.field632;
        class448.field6365 = var5.field638 * var6.field656 + var5.field661 * var6.field664 + var5.field656 * var6.field649;
        float var7 = (float) this.field6038 * class448.field6365 + class725.field10121;
        float var8 = (float) this.field6058 * class448.field6365 + class725.field10121;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = var8 - (float) this.field6089;
            var10 = (float) this.field6089 + var7;
        } else {
            var10 = (float) this.field6089 + var8;
            var9 = var7 - (float) this.field6089;
        }
        if ((this.field6067.field1900 <= var9) || ((float) this.field6067.field1907 >= var10)) {
            return;
        }
        class109.field1321 = var5.field643 * var6.field656 + var5.field664 * var6.field649 + var5.field628 * var6.field664;
        class738.field10274 = var5.field643 * var6.field632 + var5.field664 * var6.field655 + var5.field628 * var6.field665 + var5.field665;
        float var11 = (float) this.field6038 * class109.field1321 + class738.field10274;
        float var12 = (float) this.field6058 * class109.field1321 + class738.field10274;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = (var12 - (float) this.field6089) * (float) this.field6067.field1910;
            var14 = ((float) this.field6089 + var11) * (float) this.field6067.field1910;
        } else {
            var13 = (var11 - (float) this.field6089) * (float) this.field6067.field1910;
            var14 = ((float) this.field6089 + var12) * (float) this.field6067.field1910;
        }
        if ((this.field6067.field1843 <= var13 / (float) arg2) || (this.field6067.field1891 >= var14 / (float) arg2)) {
            return;
        }
        class345.field4853 = var5.field647 * var6.field632 + var5.field649 * var6.field655 + var5.field626 * var6.field665 + var5.field655;
        class659.field9023 = var5.field647 * var6.field656 + var5.field649 * var6.field649 + var5.field626 * var6.field664;
        float var15 = (float) this.field6038 * class659.field9023 + class345.field4853;
        float var16 = (float) this.field6058 * class659.field9023 + class345.field4853;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = ((float) this.field6089 + var15) * (float) this.field6067.field1844;
            var17 = (var16 - (float) this.field6089) * (float) this.field6067.field1844;
        } else {
            var17 = (var15 - (float) this.field6089) * (float) this.field6067.field1844;
            var18 = ((float) this.field6089 + var16) * (float) this.field6067.field1844;
        }
        if ((var17 / (float) arg2 >= this.field6067.field1848) || (this.field6067.field1832 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field6114 != null) {
            class18.field283 = var5.field647 * var6.field661 + var5.field649 * var6.field626 + var5.field626 * var6.field628;
            class533.field7513 = var5.field643 * var6.field638 + var5.field664 * var6.field647 + var5.field628 * var6.field643;
            class145.field2090 = var5.field647 * var6.field638 + var5.field649 * var6.field647 + var5.field626 * var6.field643;
            class365.field5166 = var5.field638 * var6.field661 + var5.field661 * var6.field628 + var5.field656 * var6.field626;
            class556.field7802 = var5.field643 * var6.field661 + var5.field664 * var6.field626 + var5.field628 * var6.field628;
            class367.field5201 = var5.field638 * var6.field638 + var5.field661 * var6.field643 + var5.field656 * var6.field647;
        }
        if (arg1 != null) {
            int var19 = this.field6093 + this.field6015 >> 1;
            int var20 = this.field6100 + this.field6098 >> 1;
            int var21 = (int) ((float) var20 * class533.field7513 + (float) this.field6038 * class109.field1321 + (float) var19 * class556.field7802 + class738.field10274);
            int var22 = (int) ((float) var20 * class145.field2090 + (float) this.field6038 * class659.field9023 + (float) var19 * class18.field283 + class345.field4853);
            int var23 = (int) ((float) var20 * class367.field5201 + (float) this.field6038 * class448.field6365 + (float) var19 * class365.field5166 + class725.field10121);
            int var24 = (int) ((float) var20 * class533.field7513 + (float) this.field6058 * class109.field1321 + (float) var19 * class556.field7802 + class738.field10274);
            int var25 = (int) ((float) var20 * class145.field2090 + (float) this.field6058 * class659.field9023 + (float) var19 * class18.field283 + class345.field4853);
            arg1.field1985 = this.field6067.field1910 * var21 / arg2 + this.field6067.field1884;
            arg1.field1986 = this.field6067.field1844 * var22 / arg2 + this.field6067.field1901;
            arg1.field1990 = this.field6067.field1910 * var24 / arg2 + this.field6067.field1884;
            arg1.field1989 = this.field6067.field1844 * var25 / arg2 + this.field6067.field1901;
            int var26 = (int) ((float) var20 * class367.field5201 + (float) this.field6058 * class448.field6365 + (float) var19 * class365.field5166 + class725.field10121);
            if (var23 >= this.field6067.field1907 || var26 >= this.field6067.field1907) {
                arg1.field1987 = true;
                arg1.field1988 = this.field6067.field1884 + ((var21 - -this.field6089) * this.field6067.field1910 / arg2) - arg1.field1985;
            }
        }
        this.field6067.method952((float) arg2, (byte) -124);
        this.field6067.method910(-17);
        this.field6067.method893((byte) 93, var6);
        this.method2612((byte) 117);
        this.field6067.method878(-127);
        this.method2611(7);
    }

    @OriginalMember(owner = "client!li", name = "V", descriptor = "()I")
    public final int method234() {
        if (!this.field6017) {
            this.method2610((byte) -128);
        }
        field6050++;
        return this.field6015;
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "()Z")
    public final boolean method257() {
        field6059++;
        if (this.field6088 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field6088.length; var1++) {
            if (this.field6088[var1] != -1 && !this.field6067.field715.method531(this.field6088[var1], 69)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!li", name = "ba", descriptor = "(Lr;)Lr;")
    public final class180 method217(class180 arg0) {
        field6046++;
        if (this.field6096 == 0) {
            return null;
        }
        if (!this.field6017) {
            this.method2610((byte) -126);
        }
        int var2;
        int var3;
        if (this.field6067.field1879 > 0) {
            var2 = this.field6015 - (this.field6067.field1879 * this.field6058 >> 8) >> this.field6067.field1786;
            var3 = this.field6093 - (this.field6067.field1879 * this.field6038 >> 8) >> this.field6067.field1786;
        } else {
            var2 = this.field6015 - (this.field6067.field1879 * this.field6038 >> 8) >> this.field6067.field1786;
            var3 = this.field6093 - (this.field6067.field1879 * this.field6058 >> 8) >> this.field6067.field1786;
        }
        int var4;
        int var5;
        if (this.field6067.field1856 <= 0) {
            var4 = this.field6098 - (this.field6067.field1856 * this.field6038 >> 8) >> this.field6067.field1786;
            var5 = this.field6100 - (this.field6067.field1856 * this.field6058 >> 8) >> this.field6067.field1786;
        } else {
            var4 = this.field6098 - (this.field6067.field1856 * this.field6058 >> 8) >> this.field6067.field1786;
            var5 = this.field6100 - (this.field6067.field1856 * this.field6038 >> 8) >> this.field6067.field1786;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class549 var8 = (class549) arg0;
        class549 var9;
        if (var8 != null && var8.method3176(var7, var6, (byte) -37)) {
            var9 = var8;
            var8.method3179(84);
        } else {
            var9 = new class549(this.field6067, var6, var7);
        }
        var9.method3177(var2, var5, 0, var3, var4);
        this.method2617(var9, (byte) -72);
        return var9;
    }

    @OriginalMember(owner = "client!li", name = "ma", descriptor = "()I")
    public final int method218() {
        field6072++;
        if (!this.field6017) {
            this.method2610((byte) -128);
        }
        return this.field6056;
    }

    @OriginalMember(owner = "client!li", name = "da", descriptor = "()I")
    public final int method265() {
        field6037++;
        return this.field6081;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILnga;IZIII)Z")
    private final boolean method2615(int arg0, class513 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field6019++;
        class55 var8 = (class55) arg1;
        class55 var9 = this.field6067.field1816;
        float var10 = var8.field632 * var9.field643 + var8.field665 * var9.field628 + var8.field655 * var9.field664 + var9.field665;
        float var11 = var8.field632 * var9.field647 + var8.field665 * var9.field626 + var8.field655 * var9.field649 + var9.field655;
        class145.field2090 = var8.field638 * var9.field647 + var8.field647 * var9.field649 + var8.field643 * var9.field626;
        float var12 = var8.field632 * var9.field638 + var8.field665 * var9.field661 + var8.field655 * var9.field656 + var9.field632;
        class556.field7802 = var8.field661 * var9.field643 + var8.field628 * var9.field628 + var8.field626 * var9.field664;
        class533.field7513 = var8.field638 * var9.field643 + var8.field647 * var9.field664 + var8.field643 * var9.field628;
        class448.field6365 = var8.field656 * var9.field638 + var8.field664 * var9.field661 + var8.field649 * var9.field656;
        class109.field1321 = var8.field656 * var9.field643 + var8.field664 * var9.field628 + var8.field649 * var9.field664;
        class367.field5201 = var8.field638 * var9.field638 + var8.field647 * var9.field656 + var8.field643 * var9.field661;
        class18.field283 = var8.field661 * var9.field647 + var8.field628 * var9.field626 + var8.field626 * var9.field649;
        class659.field9023 = var8.field656 * var9.field647 + var8.field664 * var9.field626 + var8.field649 * var9.field649;
        class365.field5166 = var8.field661 * var9.field638 + var8.field628 * var9.field661 + var8.field626 * var9.field656;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field6067.field1910;
        int var19 = this.field6067.field1844;
        if (!this.field6017) {
            this.method2610((byte) -126);
        }
        int var20 = this.field6093 - this.field6015 >> 1;
        int var21 = this.field6058 - this.field6038 >> 1;
        int var22 = this.field6100 - this.field6098 >> 1;
        int var23 = this.field6015 + var20;
        int var24 = this.field6038 + var21;
        int var25 = this.field6098 + var22;
        int var26 = var23 - (var20 << arg2);
        int var27 = var24 - (var21 << arg2);
        int var28 = var25 - (var22 << arg2);
        int var29 = (var20 << arg2) + var23;
        int var30 = var24 + (var21 << arg2);
        class54.field624[0] = var26;
        int var31 = (var22 << arg2) + var25;
        class451.field6388[0] = var27;
        class54.field624[1] = var29;
        class529.field7455[0] = var28;
        class451.field6388[arg6] = var27;
        class529.field7455[1] = var28;
        class54.field624[2] = var26;
        class451.field6388[2] = var30;
        class54.field624[3] = var29;
        class529.field7455[2] = var28;
        class451.field6388[3] = var30;
        class54.field624[4] = var26;
        class529.field7455[3] = var28;
        class451.field6388[4] = var27;
        class529.field7455[4] = var31;
        class54.field624[5] = var29;
        class451.field6388[5] = var27;
        class54.field624[6] = var26;
        class529.field7455[5] = var31;
        class451.field6388[6] = var30;
        class529.field7455[6] = var31;
        class54.field624[7] = var29;
        class451.field6388[7] = var30;
        class529.field7455[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class529.field7455[var32];
            float var54 = (float) class451.field6388[var32];
            float var55 = (float) class54.field624[var32];
            float var56 = class145.field2090 * var53 + class659.field9023 * var54 + class18.field283 * var55 + var11;
            float var57 = class533.field7513 * var53 + class556.field7802 * var55 + class109.field1321 * var54 + var10;
            float var58 = class367.field5201 * var53 + class448.field6365 * var54 + class365.field5166 * var55 + var12;
            if (var58 >= (float) this.field6067.field1907) {
                if (arg4 > 0) {
                    var58 = arg4;
                }
                float var59 = (float) var18 * var57 / var58 + (float) this.field6067.field1884;
                float var60 = (float) var19 * var56 / var58 + (float) this.field6067.field1901;
                if (var59 < var14) {
                    var14 = var59;
                }
                if (var59 > var15) {
                    var15 = var59;
                }
                if (var60 < var16) {
                    var16 = var60;
                }
                var13 = true;
                if (var60 > var17) {
                    var17 = var60;
                }
            }
        }
        if (var13 && (float) arg0 > var14 && var15 > (float) arg0 && (float) arg5 > var16 && var17 > (float) arg5) {
            if (arg3) {
                return true;
            }
            if (this.field6096 > this.field6067.field1939.length) {
                this.field6067.field1939 = new int[this.field6096];
                this.field6067.field1937 = new int[this.field6096];
            }
            int[] var33 = this.field6067.field1939;
            int[] var34 = this.field6067.field1937;
            for (int var35 = 0; var35 < this.field6078; var35++) {
                float var37 = (float) this.field6033[var35];
                float var38 = (float) this.field6020[var35];
                float var39 = (float) this.field6051[var35];
                float var40 = class533.field7513 * var37 + class556.field7802 * var39 + class109.field1321 * var38 + var10;
                float var41 = class145.field2090 * var37 + class659.field9023 * var38 + class18.field283 * var39 + var11;
                float var42 = class367.field5201 * var37 + class448.field6365 * var38 + class365.field5166 * var39 + var12;
                if (((float) this.field6067.field1907 <= var42)) {
                    if (arg4 > 0) {
                        var42 = arg4;
                    }
                    int var47 = (int) ((float) var18 * var40 / var42 + (float) this.field6067.field1884);
                    int var48 = (int) ((float) var19 * var41 / var42 + (float) this.field6067.field1901);
                    int var49 = this.field6039[var35];
                    int var50 = this.field6039[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field6040[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[var52] = var47;
                        var34[var52] = var48;
                    }
                } else {
                    int var43 = this.field6039[var35];
                    int var44 = this.field6039[var35 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field6040[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        var33[this.field6040[var45] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field6068; var36++) {
                if (var33[this.field6105[var36]] != -999999 && var33[this.field6076[var36]] != -999999 && var33[this.field6008[var36]] != -999999 && this.method2618(var34[this.field6076[var36]], arg0, var33[this.field6105[var36]], var33[this.field6008[var36]], arg6 - 111, arg5, var34[this.field6008[var36]], var33[this.field6076[var36]], var34[this.field6105[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(FFIIIIJILie;I)S")
    private final short method2616(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, long arg6, int arg7, class6 arg8, int arg9) {
        field6022++;
        int var12 = this.field6039[arg4];
        int var13 = this.field6039[arg4 + 1];
        int var14 = 0;
        if (arg5 > -59) {
            this.field6018 = -126;
        }
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field6040[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class94.field1105[var15] == arg6) {
                return (short) (var16 - 1);
            }
        }
        this.field6040[var14] = (short) (this.field6096 + 1);
        class94.field1105[var14] = arg6;
        this.field6063[this.field6096] = (short) arg7;
        this.field6003[this.field6096] = (short) arg9;
        this.field6102[this.field6096] = (short) arg2;
        this.field6106[this.field6096] = (byte) arg3;
        this.field6036[this.field6096] = arg1;
        this.field6045[this.field6096] = arg0;
        return (short) (this.field6096++);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Llba;B)V")
    private final void method2617(class549 arg0, byte arg1) {
        field6095++;
        if (this.field6067.field1939.length < this.field6096) {
            this.field6067.field1937 = new int[this.field6096];
            this.field6067.field1939 = new int[this.field6096];
        }
        if (arg1 > -59) {
            this.field6020 = null;
        }
        int[] var3 = this.field6067.field1939;
        int[] var4 = this.field6067.field1937;
        for (int var5 = 0; var5 < this.field6078; var5++) {
            int var16 = (this.field6051[var5] - (this.field6020[var5] * this.field6067.field1879 >> 8) >> this.field6067.field1786) - arg0.field7668;
            int var17 = (this.field6033[var5] - (this.field6020[var5] * this.field6067.field1856 >> 8) >> this.field6067.field1786) - arg0.field7658;
            int var18 = this.field6039[var5];
            int var19 = this.field6039[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field6040[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field6035; var6++) {
            if (this.field6011 == null || this.field6011[var6] <= 128) {
                short var7 = this.field6105[var6];
                short var8 = this.field6076[var6];
                short var9 = this.field6008[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var14 - var15) * (var10 - var11) - ((var14 - var13) * (var12 - var11))) > 0) {
                    arg0.method3180(var10, var11, var12, -122, var13, var14, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
    public final void method230() {
        field6013++;
        if (this.field6096 <= 0 || this.field6035 <= 0) {
            return;
        }
        this.method2606(false, (byte) 83);
        if ((this.field6009 & 0x10) == 0 && this.field6084.field9372 == null) {
            this.method2605((byte) 125, false);
        }
        this.method2614(-1);
    }

    @OriginalMember(owner = "client!li", name = "s", descriptor = "(I)V")
    public final void method242(int arg0) {
        this.field6044 = arg0;
        field6115++;
        this.field6080 = true;
        if (this.field5997 != null && (this.field6044 & 0x10000) == 0) {
            this.field6003 = this.field5997.field7144;
            this.field6106 = this.field5997.field7147;
            this.field6063 = this.field5997.field7143;
            this.field6102 = this.field5997.field7146;
            this.field5997 = null;
        }
        this.method2614(-1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method2618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6041++;
        if (arg8 > arg5 && arg5 < arg0 && arg6 > arg5) {
            return false;
        } else if (arg8 < arg5 && arg0 < arg5 && arg5 > arg6) {
            return false;
        } else if (arg2 > arg1 && arg1 < arg7 && arg3 > arg1) {
            return false;
        } else {
            if (arg4 >= -53) {
                this.method2608(null, (byte) -68, true, true, 101, null);
            }
            return arg1 <= arg2 || arg1 <= arg7 || arg3 >= arg1;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()[Lde;")
    public final class531[] method227() {
        field6005++;
        return this.field6074;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method237(class471 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6049++;
        class428 var6 = (class428) arg0;
        if (this.field6068 == 0 || var6.field6068 == 0) {
            return;
        }
        int var7 = var6.field6078;
        int[] var8 = var6.field6051;
        int[] var9 = var6.field6020;
        int[] var10 = var6.field6033;
        short[] var11 = var6.field6063;
        short[] var12 = var6.field6003;
        short[] var13 = var6.field6102;
        byte[] var14 = var6.field6106;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field5997 == null) {
            var18 = null;
            var17 = null;
            var15 = null;
            var16 = null;
        } else {
            var15 = this.field5997.field7147;
            var16 = this.field5997.field7146;
            var17 = this.field5997.field7143;
            var18 = this.field5997.field7144;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5997 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var22 = var6.field5997.field7146;
            var20 = var6.field5997.field7144;
            var21 = var6.field5997.field7143;
            var19 = var6.field5997.field7147;
        }
        int[] var23 = var6.field6039;
        short[] var24 = var6.field6040;
        if (!var6.field6017) {
            var6.method2610((byte) -127);
        }
        short var25 = var6.field6038;
        short var26 = var6.field6058;
        short var27 = var6.field6015;
        short var28 = var6.field6093;
        short var29 = var6.field6098;
        short var30 = var6.field6100;
        for (int var31 = 0; var31 < this.field6078; var31++) {
            int var32 = this.field6020[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field6051[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field6033[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field6039[var31];
                        int var37 = this.field6039[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field6040[var38] - 1;
                            if (var35 == -1 || this.field6106[var35] != 0) {
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
                                            this.field5997 = new class497();
                                            var17 = this.field5997.field7143 = class47.method304(this.field6063, 95);
                                            var18 = this.field5997.field7144 = class47.method304(this.field6003, 63);
                                            var16 = this.field5997.field7146 = class47.method304(this.field6102, 62);
                                            var15 = this.field5997.field7147 = class262.method1714(this.field6106, true);
                                        }
                                        if (var21 == null) {
                                            class497 var44 = var6.field5997 = new class497();
                                            var21 = var44.field7143 = class47.method304(var11, 108);
                                            var20 = var44.field7144 = class47.method304(var12, 31);
                                            var22 = var44.field7146 = class47.method304(var13, 126);
                                            var19 = var44.field7147 = class262.method1714(var14, true);
                                        }
                                        short var45 = this.field6063[var35];
                                        short var46 = this.field6003[var35];
                                        short var47 = this.field6102[var35];
                                        byte var48 = this.field6106[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var21[var52] += var45;
                                                var20[var52] += var46;
                                                var22[var52] += var47;
                                                var19[var52] += var48;
                                            }
                                        }
                                        short var53 = var13[var40];
                                        int var54 = this.field6039[var31 + 1];
                                        int var55 = this.field6039[var31];
                                        short var56 = var11[var40];
                                        byte var57 = var14[var40];
                                        short var58 = var12[var40];
                                        for (int var59 = var55; var59 < var54; var59++) {
                                            int var60 = this.field6040[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var56;
                                                var18[var60] += var58;
                                                var16[var60] += var53;
                                                var15[var60] += var57;
                                            }
                                        }
                                        if (this.field6000 == null && this.field6090 != null) {
                                            this.field6090.field2509 = null;
                                        }
                                        if (this.field6000 != null) {
                                            this.field6000.field2509 = null;
                                        }
                                        if (var6.field6000 == null && var6.field6090 != null) {
                                            var6.field6090.field2509 = null;
                                        }
                                        if (var6.field6000 != null) {
                                            var6.field6000.field2509 = null;
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

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Leea;)V")
    public class428(class131 arg0) {
        this.field6067 = arg0;
        this.field6086 = new class186(null, 5126, 3, 0);
        this.field6001 = new class186(null, 5126, 2, 0);
        this.field6000 = new class186(null, 5126, 3, 0);
        this.field6090 = new class186(null, 5121, 4, 0);
        this.field6084 = new class684();
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Leea;Lie;IIII)V")
    public class428(class131 arg0, class6 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6067 = arg0;
        this.field6044 = arg2;
        this.field6016 = arg5;
        if (class704.method3960(true, arg5, arg2)) {
            this.field6086 = new class186(null, 5126, 3, 0);
        }
        if (class722.method4053(arg5, false, arg2)) {
            this.field6001 = new class186(null, 5126, 2, 0);
        }
        if (class398.method2485(arg2, arg5, 0)) {
            this.field6000 = new class186(null, 5126, 3, 0);
        }
        if (class103.method736(-117, arg2, arg5)) {
            this.field6090 = new class186(null, 5121, 4, 0);
        }
        if (class69.method569(arg2, (byte) 126, arg5)) {
            this.field6084 = new class684();
        }
        class149 var7 = arg0.field715;
        this.field6039 = new int[arg1.field96 + 1];
        int[] var8 = new int[arg1.field103];
        for (int var9 = 0; var9 < arg1.field103; var9++) {
            if (arg1.field74 == null || arg1.field74[var9] != 2) {
                if (arg1.field91 != null && arg1.field91[var9] != -1) {
                    class502 var173 = var7.method532((byte) 127, arg1.field91[var9] & 0xFFFF);
                    if (((this.field6016 & 0x40) == 0 || !var173.field7194) && var173.field7201) {
                        continue;
                    }
                }
                var8[this.field6068++] = var9;
                this.field6039[arg1.field82[var9]]++;
                this.field6039[arg1.field72[var9]]++;
                this.field6039[arg1.field67[var9]]++;
            }
        }
        this.field6035 = this.field6068;
        long[] var10 = new long[this.field6068];
        boolean var11 = (this.field6044 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field6068; var12++) {
            int var156 = var8[var12];
            class502 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field77 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field77.length; var163++) {
                    class271 var164 = arg1.field77[var163];
                    if (var164.field3876 == var156) {
                        class346 var165 = class529.method3080(0, var164.field3878);
                        if (var165.field4873) {
                            var162 = true;
                        }
                        if (var165.field4866 != -1) {
                            class502 var166 = var7.method532((byte) 127, var165.field4866);
                            if (var166.field7203 == 2) {
                                this.field6094 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field6035--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field91 != null) {
                var167 = arg1.field91[var156];
                if (var167 != -1) {
                    var157 = var7.method532((byte) 127, var167 & 0xFFFF);
                    if ((this.field6016 & 0x40) != 0 && var157.field7194) {
                        var167 = -1;
                        var157 = null;
                    } else {
                        if (var157.field7207 != 0 || var157.field7193 != 0) {
                            this.field6092 = true;
                        }
                        var161 = var157.field7195;
                        var160 = var157.field7204;
                    }
                }
            }
            boolean var168 = arg1.field79 != null && arg1.field79[var156] != 0 || var157 != null && var157.field7203 != 0;
            if ((var11 || var168) && arg1.field90 != null) {
                var158 += arg1.field90[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var167 & 0xFFFF << 16) + var159;
            int var171 = (var161 & 0xFF) + var169;
            int var172 = (var12 & 0xFFFF) + var170;
            var10[var12] = ((long) var171 << 32) + ((long) var172);
            this.field6094 |= var168;
            this.field6092 |= var157 != null && (var157.field7207 != 0 || var157.field7193 != 0);
        }
        class129.method869(var8, (byte) -122, var10);
        this.field6033 = arg1.field54;
        this.field6078 = arg1.field96;
        this.field6020 = arg1.field107;
        this.field6101 = arg1.field63;
        this.field6034 = arg1.field57;
        this.field6051 = arg1.field73;
        this.field6071 = arg1.field55;
        class63[] var13 = new class63[this.field6078];
        this.field6074 = arg1.field84;
        if (arg1.field77 != null) {
            this.field6018 = arg1.field77.length;
            this.field6114 = new class270[this.field6018];
            this.field6117 = new class545[this.field6018];
            for (int var14 = 0; var14 < this.field6018; var14++) {
                class271 var15 = arg1.field77[var14];
                class346 var16 = class529.method3080(0, var15.field3878);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field6068; var18++) {
                    if (var8[var18] == var15.field3876) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class295.field4163[arg1.field83[var15.field3876] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field79 == null ? 0 : arg1.field79[var15.field3876]) << 24;
                this.field6114[var14] = new class270(var17, arg1.field82[var15.field3876], arg1.field72[var15.field3876], arg1.field67[var15.field3876], var16.field4869, var16.field4864, var16.field4866, var16.field4877, var16.field4876, var16.field4873, var16.field4872, var15.field3884);
                this.field6117[var14] = new class545(var20);
            }
        }
        int var21 = this.field6068 * 3;
        this.field6029 = new short[this.field6068];
        class94.field1105 = new long[var21];
        this.field6081 = (short) arg4;
        this.field6063 = new short[var21];
        this.field6102 = new short[var21];
        this.field6008 = new short[this.field6068];
        if (arg1.field61 != null) {
            this.field6032 = new short[this.field6068];
        }
        this.field6105 = new short[this.field6068];
        this.field6088 = new short[this.field6068];
        this.field6027 = (short) arg3;
        this.field6011 = new byte[this.field6068];
        this.field6045 = new float[var21];
        this.field6106 = new byte[var21];
        this.field6040 = new short[var21];
        this.field6076 = new short[this.field6068];
        this.field6036 = new float[var21];
        this.field6003 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field96; var23++) {
            int var155 = this.field6039[var23];
            this.field6039[var23] = var22;
            var22 += var155;
            var13[var23] = new class63();
        }
        this.field6039[arg1.field96] = var22;
        class171 var24 = class71.method590(this.field6068, var8, arg1, 24582);
        class425[] var25 = new class425[arg1.field103];
        for (int var26 = 0; var26 < arg1.field103; var26++) {
            short var134 = arg1.field82[var26];
            short var135 = arg1.field72[var26];
            short var136 = arg1.field67[var26];
            int var137 = this.field6051[var135] - this.field6051[var134];
            int var138 = this.field6020[var135] - this.field6020[var134];
            int var139 = this.field6033[var135] - this.field6033[var134];
            int var140 = this.field6051[var136] - this.field6051[var134];
            int var141 = this.field6020[var136] - this.field6020[var134];
            int var142 = this.field6033[var136] - this.field6033[var134];
            int var143 = var138 * var142 - var139 * var141;
            int var144 = var139 * var140 - var137 * var142;
            int var145;
            for (var145 = var137 * var141 - var138 * var140; var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192; var145 >>= 0x1) {
                var143 >>= 0x1;
                var144 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var145 * var145 + var143 * var143 + var144 * var144));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var143 * 256 / var146;
            int var148 = var145 * 256 / var146;
            int var149 = var144 * 256 / var146;
            byte var150 = arg1.field74 == null ? 0 : arg1.field74[var26];
            if (var150 == 0) {
                class63 var151 = var13[var134];
                var151.field777 += var147;
                var151.field781++;
                var151.field776 += var148;
                var151.field774 += var149;
                class63 var152 = var13[var135];
                var152.field781++;
                var152.field777 += var147;
                var152.field774 += var149;
                var152.field776 += var148;
                class63 var153 = var13[var136];
                var153.field781++;
                var153.field777 += var147;
                var153.field776 += var148;
                var153.field774 += var149;
            } else if (var150 == 1) {
                class425 var154 = var25[var26] = new class425();
                var154.field5979 = var149;
                var154.field5978 = var148;
                var154.field5983 = var147;
            }
        }
        for (int var27 = 0; var27 < this.field6068; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field83[var43] & 0xFFFF;
            int var45;
            if (arg1.field108 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field108[var43];
            }
            int var46;
            if (arg1.field79 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field79[var43] & 0xFF;
            }
            short var47 = arg1.field91 == null ? -1 : arg1.field91[var43];
            if (var47 != -1 && (this.field6016 & 0x40) != 0) {
                class502 var48 = var7.method532((byte) 127, var47 & 0xFFFF);
                if (var48.field7194) {
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
                    var49 = 0.0F;
                    var55 = 1;
                    var51 = 1.0F;
                    var53 = 0.0F;
                    var56 = 2;
                    var52 = 1.0F;
                    var54 = 0.0F;
                    var50 = 1.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field75[var45];
                    if (var58 == 0) {
                        short var59 = arg1.field82[var43];
                        short var60 = arg1.field72[var43];
                        short var61 = arg1.field67[var43];
                        short var62 = arg1.field60[var45];
                        short var63 = arg1.field58[var45];
                        short var64 = arg1.field88[var45];
                        float var65 = (float) arg1.field73[var62];
                        float var66 = (float) arg1.field107[var62];
                        float var67 = (float) arg1.field54[var62];
                        float var68 = (float) arg1.field73[var63] - var65;
                        float var69 = (float) arg1.field107[var63] - var66;
                        float var70 = (float) arg1.field54[var63] - var67;
                        float var71 = (float) arg1.field73[var64] - var65;
                        float var72 = (float) arg1.field107[var64] - var66;
                        float var73 = (float) arg1.field54[var64] - var67;
                        float var74 = (float) arg1.field73[var59] - var65;
                        float var75 = (float) arg1.field107[var59] - var66;
                        float var76 = (float) arg1.field54[var59] - var67;
                        float var77 = (float) arg1.field73[var60] - var65;
                        float var78 = (float) arg1.field107[var60] - var66;
                        float var79 = (float) arg1.field54[var60] - var67;
                        float var80 = (float) arg1.field73[var61] - var65;
                        float var81 = (float) arg1.field107[var61] - var66;
                        float var82 = (float) arg1.field54[var61] - var67;
                        float var83 = var69 * var73 - (var70 * var72);
                        float var84 = var70 * var71 - (var68 * var73);
                        float var85 = var68 * var72 - var69 * var71;
                        float var86 = var72 * var85 - var73 * var84;
                        float var87 = var73 * var83 - var71 * var85;
                        float var88 = var71 * var84 - (var72 * var83);
                        float var89 = 1.0F / (var70 * var88 + var68 * var86 + var69 * var87);
                        var51 = (var79 * var88 + var77 * var86 + var78 * var87) * var89;
                        var53 = (var82 * var88 + var80 * var86 + var81 * var87) * var89;
                        var49 = (var76 * var88 + var74 * var86 + var75 * var87) * var89;
                        float var90 = var68 * var84 - var69 * var83;
                        float var91 = var69 * var85 - var70 * var84;
                        float var92 = var70 * var83 - (var68 * var85);
                        float var93 = 1.0F / (var73 * var90 + var71 * var91 + var72 * var92);
                        var50 = (var76 * var90 + var74 * var91 + var75 * var92) * var93;
                        var54 = (var82 * var90 + var80 * var91 + var81 * var92) * var93;
                        var52 = (var79 * var90 + var77 * var91 + var78 * var92) * var93;
                    } else {
                        short var94 = arg1.field82[var43];
                        short var95 = arg1.field72[var43];
                        short var96 = arg1.field67[var43];
                        int var97 = var24.field2333[var45];
                        int var98 = var24.field2339[var45];
                        int var99 = var24.field2341[var45];
                        float[] var100 = var24.field2335[var45];
                        byte var101 = arg1.field69[var45];
                        float var102 = (float) arg1.field97[var45] / 256.0F;
                        if (var58 == 1) {
                            float var103 = (float) arg1.field100[var45] / 1024.0F;
                            class219.method1341((byte) -25, var97, var102, var98, var100, arg1.field54[var94], arg1.field73[var94], var101, class98.field1185, var99, arg1.field107[var94], var103);
                            var49 = class98.field1185[0];
                            var50 = class98.field1185[1];
                            class219.method1341((byte) -25, var97, var102, var98, var100, arg1.field54[var95], arg1.field73[var95], var101, class98.field1185, var99, arg1.field107[var95], var103);
                            var51 = class98.field1185[0];
                            var52 = class98.field1185[1];
                            class219.method1341((byte) -25, var97, var102, var98, var100, arg1.field54[var96], arg1.field73[var96], var101, class98.field1185, var99, arg1.field107[var96], var103);
                            var53 = class98.field1185[0];
                            var54 = class98.field1185[1];
                            float var104 = var103 / 2.0F;
                            if ((var101 & 0x1) == 0) {
                                if (var53 - var49 > var104) {
                                    var56 = 1;
                                    var53 -= var103;
                                } else if (var104 < var49 - var53) {
                                    var53 += var103;
                                    var56 = 2;
                                }
                                if ((var51 - var49 > var104)) {
                                    var55 = 1;
                                    var51 -= var103;
                                } else if (var49 - var51 > var104) {
                                    var51 += var103;
                                    var55 = 2;
                                }
                            } else {
                                if (var52 - var50 > var104) {
                                    var52 -= var103;
                                    var55 = 1;
                                } else if (var50 - var52 > var104) {
                                    var52 += var103;
                                    var55 = 2;
                                }
                                if ((var54 - var50 > var104)) {
                                    var54 -= var103;
                                    var56 = 1;
                                } else if (var104 < var50 - var54) {
                                    var54 += var103;
                                    var56 = 2;
                                }
                            }
                        } else if (var58 == 2) {
                            float var105 = (float) arg1.field81[var45] / 256.0F;
                            float var106 = (float) arg1.field98[var45] / 256.0F;
                            int var107 = arg1.field73[var95] - arg1.field73[var94];
                            int var108 = arg1.field107[var95] - arg1.field107[var94];
                            int var109 = arg1.field54[var95] - arg1.field54[var94];
                            int var110 = arg1.field73[var96] - arg1.field73[var94];
                            int var111 = arg1.field107[var96] - arg1.field107[var94];
                            int var112 = arg1.field54[var96] - arg1.field54[var94];
                            int var113 = var108 * var112 - (var109 * var111);
                            int var114 = var109 * var110 - (var107 * var112);
                            int var115 = var107 * var111 - var108 * var110;
                            float var116 = 64.0F / (float) arg1.field65[var45];
                            float var117 = 64.0F / (float) arg1.field86[var45];
                            float var118 = 64.0F / (float) arg1.field100[var45];
                            float var119 = (var100[2] * (float) var115 + var100[0] * (float) var113 + var100[1] * (float) var114) / var116;
                            float var120 = (var100[5] * (float) var115 + var100[4] * (float) var114 + var100[3] * (float) var113) / var117;
                            float var121 = (var100[8] * (float) var115 + var100[6] * (float) var113 + var100[7] * (float) var114) / var118;
                            var57 = class267.method1743(var120, var119, var121, (byte) 57);
                            class403.method2512(var57, 101, arg1.field107[var94], var99, var101, arg1.field73[var94], class98.field1185, arg1.field54[var94], var106, var105, var100, var97, var102, var98);
                            var49 = class98.field1185[0];
                            var50 = class98.field1185[1];
                            class403.method2512(var57, 49, arg1.field107[var95], var99, var101, arg1.field73[var95], class98.field1185, arg1.field54[var95], var106, var105, var100, var97, var102, var98);
                            var52 = class98.field1185[1];
                            var51 = class98.field1185[0];
                            class403.method2512(var57, 78, arg1.field107[var96], var99, var101, arg1.field73[var96], class98.field1185, arg1.field54[var96], var106, var105, var100, var97, var102, var98);
                            var53 = class98.field1185[0];
                            var54 = class98.field1185[1];
                        } else if (var58 == 3) {
                            class419.method2570(var99, arg1.field73[var94], arg1.field107[var94], var100, var97, var98, var101, var102, 7, class98.field1185, arg1.field54[var94]);
                            var50 = class98.field1185[1];
                            var49 = class98.field1185[0];
                            class419.method2570(var99, arg1.field73[var95], arg1.field107[var95], var100, var97, var98, var101, var102, 7, class98.field1185, arg1.field54[var95]);
                            var52 = class98.field1185[1];
                            var51 = class98.field1185[0];
                            class419.method2570(var99, arg1.field73[var96], arg1.field107[var96], var100, var97, var98, var101, var102, 7, class98.field1185, arg1.field54[var96]);
                            var54 = class98.field1185[1];
                            var53 = class98.field1185[0];
                            if ((var101 & 0x1) == 0) {
                                if (var53 - var49 > 0.5F) {
                                    var53--;
                                    var56 = 1;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                                if ((var51 - var49 > 0.5F)) {
                                    var51--;
                                    var55 = 1;
                                } else if (var49 - var51 > 0.5F) {
                                    var51++;
                                    var55 = 2;
                                }
                            } else {
                                if (var54 - var50 > 0.5F) {
                                    var54--;
                                    var56 = 1;
                                } else if (var50 - var54 > 0.5F) {
                                    var54++;
                                    var56 = 2;
                                }
                                if (var52 - var50 > 0.5F) {
                                    var55 = 1;
                                    var52--;
                                } else if (var50 - var52 > 0.5F) {
                                    var52++;
                                    var55 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field74 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field74[var43];
            }
            if (var122 == 0) {
                long var123 = ((long) (var57 << 24) + ((long) (var44 << 8)) + ((long) var46) << 32) + (long) (var45 << 2);
                short var125 = arg1.field82[var43];
                short var126 = arg1.field72[var43];
                short var127 = arg1.field67[var43];
                class63 var128 = var13[var125];
                this.field6105[var27] = this.method2616(var50, var49, var128.field776, var128.field781, var125, -88, var123, var128.field777, arg1, var128.field774);
                class63 var129 = var13[var126];
                this.field6076[var27] = this.method2616(var52, var51, var129.field776, var129.field781, var126, -111, (long) var55 + var123, var129.field777, arg1, var129.field774);
                class63 var130 = var13[var127];
                this.field6008[var27] = this.method2616(var54, var53, var130.field776, var130.field781, var127, -125, (long) var56 + var123, var130.field777, arg1, var130.field774);
            } else if (var122 == 1) {
                class425 var131 = var25[var43];
                long var132 = ((long) (var44 << 8) + ((long) var46) + (long) (var57 << 24) << 32) + (long) ((var45 << 2) + (var131.field5979 + 256 << 12) + (var131.field5978 + 256 << 22) + (var131.field5983 > 0 ? 1024 : 2048));
                this.field6105[var27] = this.method2616(var50, var49, var131.field5978, 0, arg1.field82[var43], -83, var132, var131.field5983, arg1, var131.field5979);
                this.field6076[var27] = this.method2616(var52, var51, var131.field5978, 0, arg1.field72[var43], -63, (long) var55 + var132, var131.field5983, arg1, var131.field5979);
                this.field6008[var27] = this.method2616(var54, var53, var131.field5978, 0, arg1.field67[var43], -82, (long) var56 + var132, var131.field5983, arg1, var131.field5979);
            }
            if (arg1.field79 != null) {
                this.field6011[var27] = arg1.field79[var43];
            }
            if (arg1.field61 != null) {
                this.field6032[var27] = arg1.field61[var43];
            }
            this.field6029[var27] = arg1.field83[var43];
            this.field6088[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field6035; var30++) {
            short var42 = this.field6088[var30];
            if (var29 != var42) {
                var29 = var42;
                var28++;
            }
        }
        this.field6028 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field6035; var33++) {
            short var41 = this.field6088[var33];
            if (var32 != var41) {
                var32 = var41;
                this.field6028[var31++] = var33;
            }
        }
        this.field6028[var31] = this.field6035;
        class94.field1105 = null;
        this.field6063 = class180.method1140(this.field6096, this.field6063, (byte) -75);
        this.field6003 = class180.method1140(this.field6096, this.field6003, (byte) -75);
        this.field6102 = class180.method1140(this.field6096, this.field6102, (byte) -75);
        this.field6106 = class368.method2343(27773, this.field6106, this.field6096);
        this.field6036 = class210.method1293(this.field6096, (byte) 31, this.field6036);
        this.field6045 = class210.method1293(this.field6096, (byte) 31, this.field6045);
        if (arg1.field102 != null && class103.method738(12869, this.field6016, arg2)) {
            this.field6083 = arg1.method35(-6395, false);
        }
        if (arg1.field77 != null && class94.method694(-128, this.field6016, arg2)) {
            this.field6052 = arg1.method42(-127);
        }
        if (arg1.field78 != null && class281.method1847(this.field6016, (byte) -65, arg2)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field6068; var36++) {
                int var40 = arg1.field78[var8[var36]];
                if (var40 >= 0) {
                    int var10002 = var35[var40]++;
                    if (var34 < var40) {
                        var34 = var40;
                    }
                }
            }
            this.field6021 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field6021[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field6068; var38++) {
                int var39 = arg1.field78[var8[var38]];
                if (var39 >= 0) {
                    this.field6021[var39][var35[var39]++] = var38;
                }
            }
        }
    }
}
