import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class610 extends class470 {

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "I")
    private int field8663 = 0;

    @OriginalMember(owner = "client!lea", name = "K", descriptor = "Z")
    private boolean field8670 = false;

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "I")
    private int field8655 = 0;

    @OriginalMember(owner = "client!lea", name = "V", descriptor = "Z")
    private boolean field8681 = true;

    @OriginalMember(owner = "client!lea", name = "Eb", descriptor = "I")
    private int field8716 = 0;

    @OriginalMember(owner = "client!lea", name = "kc", descriptor = "Z")
    private boolean field8748 = false;

    @OriginalMember(owner = "client!lea", name = "qb", descriptor = "I")
    private int field8702 = 0;

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
    private int field8656 = 0;

    @OriginalMember(owner = "client!lea", name = "oc", descriptor = "Z")
    private boolean field8752 = false;

    @OriginalMember(owner = "client!lea", name = "dc", descriptor = "Lnv;")
    private class417 field8741;

    @OriginalMember(owner = "client!lea", name = "Kb", descriptor = "Lpw;")
    private class704 field8722;

    @OriginalMember(owner = "client!lea", name = "ac", descriptor = "Lpw;")
    private class704 field8738;

    @OriginalMember(owner = "client!lea", name = "N", descriptor = "Lpw;")
    private class704 field8673;

    @OriginalMember(owner = "client!lea", name = "Fb", descriptor = "Lpw;")
    private class704 field8717;

    @OriginalMember(owner = "client!lea", name = "ob", descriptor = "Lta;")
    private class212 field8700;

    @OriginalMember(owner = "client!lea", name = "jb", descriptor = "I")
    private int field8695;

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
    private int field8666;

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "[I")
    private int[] field8653;

    @OriginalMember(owner = "client!lea", name = "db", descriptor = "[S")
    private short[] field8689;

    @OriginalMember(owner = "client!lea", name = "ec", descriptor = "[I")
    private int[] field8742;

    @OriginalMember(owner = "client!lea", name = "mc", descriptor = "[I")
    private int[] field8750;

    @OriginalMember(owner = "client!lea", name = "cc", descriptor = "[I")
    private int[] field8740;

    @OriginalMember(owner = "client!lea", name = "cb", descriptor = "[Loia;")
    private class88[] field8688;

    @OriginalMember(owner = "client!lea", name = "Yb", descriptor = "[Lnda;")
    private class555[] field8736;

    @OriginalMember(owner = "client!lea", name = "lc", descriptor = "I")
    private int field8749;

    @OriginalMember(owner = "client!lea", name = "yc", descriptor = "[Lgs;")
    private class43[] field8762;

    @OriginalMember(owner = "client!lea", name = "lb", descriptor = "[Lbl;")
    private class647[] field8697;

    @OriginalMember(owner = "client!lea", name = "T", descriptor = "[B")
    private byte[] field8679;

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "[S")
    private short[] field8665;

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "S")
    private short field8664;

    @OriginalMember(owner = "client!lea", name = "ub", descriptor = "S")
    private short field8706;

    @OriginalMember(owner = "client!lea", name = "gb", descriptor = "[S")
    private short[] field8692;

    @OriginalMember(owner = "client!lea", name = "hc", descriptor = "[S")
    private short[] field8745;

    @OriginalMember(owner = "client!lea", name = "nc", descriptor = "[S")
    private short[] field8751;

    @OriginalMember(owner = "client!lea", name = "Qb", descriptor = "[S")
    private short[] field8728;

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "[S")
    private short[] field8667;

    @OriginalMember(owner = "client!lea", name = "Nb", descriptor = "[S")
    private short[] field8725;

    @OriginalMember(owner = "client!lea", name = "Zb", descriptor = "[S")
    private short[] field8737;

    @OriginalMember(owner = "client!lea", name = "Gb", descriptor = "[S")
    private short[] field8718;

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "[F")
    private float[] field8651;

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "[S")
    private short[] field8658;

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "[F")
    private float[] field8668;

    @OriginalMember(owner = "client!lea", name = "bc", descriptor = "[B")
    private byte[] field8739;

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "[I")
    private int[] field8657;

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "[[I")
    private int[][] field8662;

    @OriginalMember(owner = "client!lea", name = "vb", descriptor = "[[I")
    private int[][] field8707;

    @OriginalMember(owner = "client!lea", name = "pc", descriptor = "[[I")
    private int[][] field8753;

    @OriginalMember(owner = "client!lea", name = "tc", descriptor = "B")
    private byte field8757;

    @OriginalMember(owner = "client!lea", name = "fb", descriptor = "F")
    public static float field8691;

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!lea", name = "J", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!lea", name = "L", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!lea", name = "M", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!lea", name = "O", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!lea", name = "P", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!lea", name = "Q", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!lea", name = "R", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!lea", name = "S", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!lea", name = "U", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!lea", name = "W", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!lea", name = "Y", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!lea", name = "Z", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!lea", name = "ab", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!lea", name = "bb", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!lea", name = "eb", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!lea", name = "kb", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!lea", name = "mb", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!lea", name = "pb", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!lea", name = "sb", descriptor = "I")
    public static int field8704;

    @OriginalMember(owner = "client!lea", name = "tb", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!lea", name = "wb", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!lea", name = "xb", descriptor = "I")
    public static int field8709;

    @OriginalMember(owner = "client!lea", name = "yb", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!lea", name = "zb", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!lea", name = "Ab", descriptor = "I")
    public static int field8712;

    @OriginalMember(owner = "client!lea", name = "Cb", descriptor = "I")
    public static int field8714;

    @OriginalMember(owner = "client!lea", name = "Db", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!lea", name = "Hb", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!lea", name = "Jb", descriptor = "I")
    public static int field8721;

    @OriginalMember(owner = "client!lea", name = "Lb", descriptor = "I")
    public static int field8723;

    @OriginalMember(owner = "client!lea", name = "Mb", descriptor = "I")
    public static int field8724;

    @OriginalMember(owner = "client!lea", name = "Ob", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!lea", name = "Pb", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!lea", name = "Rb", descriptor = "I")
    public static int field8729;

    @OriginalMember(owner = "client!lea", name = "Sb", descriptor = "I")
    public static int field8730;

    @OriginalMember(owner = "client!lea", name = "Tb", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!lea", name = "Ub", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!lea", name = "Vb", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!lea", name = "Wb", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!lea", name = "fc", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!lea", name = "ic", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!lea", name = "jc", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!lea", name = "rc", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!lea", name = "sc", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!lea", name = "vc", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!lea", name = "wc", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!lea", name = "xc", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!lea", name = "zc", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!lea", name = "Ac", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!lea", name = "rb", descriptor = "Lae;")
    private class251 field8703;

    @OriginalMember(owner = "client!lea", name = "uc", descriptor = "Ltv;")
    private class558 field8758;

    @OriginalMember(owner = "client!lea", name = "Xb", descriptor = "Lid;")
    private class583 field8735;

    @OriginalMember(owner = "client!lea", name = "X", descriptor = "S")
    private short field8683;

    @OriginalMember(owner = "client!lea", name = "hb", descriptor = "S")
    private short field8693;

    @OriginalMember(owner = "client!lea", name = "ib", descriptor = "S")
    private short field8694;

    @OriginalMember(owner = "client!lea", name = "nb", descriptor = "S")
    private short field8699;

    @OriginalMember(owner = "client!lea", name = "Bb", descriptor = "S")
    private short field8713;

    @OriginalMember(owner = "client!lea", name = "Ib", descriptor = "S")
    private short field8720;

    @OriginalMember(owner = "client!lea", name = "gc", descriptor = "S")
    private short field8744;

    @OriginalMember(owner = "client!lea", name = "qc", descriptor = "S")
    private short field8754;

    @OriginalMember(owner = "client!lea", name = "EA", descriptor = "()I", line = 3)
    public final int method193() {
        if (!this.field8670) {
            this.method3451(-32768);
        }
        field8687++;
        return this.field8683;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(IZ)V", line = 15)
    private final void method3449(int arg0, boolean arg1) {
        field8763++;
        boolean var3 = this.field8717 != null && this.field8717.field9914 == null;
        boolean var4 = this.field8673 != null && this.field8673.field9914 == null;
        boolean var5 = this.field8722 != null && this.field8722.field9914 == null;
        boolean var6 = this.field8738 != null && this.field8738.field9914 == null;
        if (arg1) {
            var6 &= (this.field8757 & 0x8) != 0;
            var3 &= (this.field8757 & 0x2) != 0;
            var4 &= (this.field8757 & 0x4) != 0;
            var5 &= (this.field8757 & 0x1) != 0;
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
        if (arg0 != 29) {
            this.method192((short) -9, (short) -92);
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
        if ((this.field8655 * var7) > this.field8741.field6059.field2912.length) {
            this.field8741.field6059 = new class685((this.field8655 + 100) * var7);
        } else {
            this.field8741.field6059.field2903 = 0;
        }
        class685 var12 = this.field8741.field6059;
        if (var5) {
            if (this.field8741.field5992) {
                for (int var13 = 0; var13 < this.field8656; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field8742[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field8750[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field8740[var13]);
                    int var17 = this.field8653[var13];
                    int var18 = this.field8653[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field8718[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field2903 = var7 * var20;
                        var12.method1421(var14, -20798);
                        var12.method1421(var15, -20798);
                        var12.method1421(var16, -20798);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field8656; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field8742[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field8750[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field8740[var21]);
                    int var25 = this.field8653[var21];
                    int var26 = this.field8653[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field8718[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field2903 = var7 * var28;
                        var12.method1464(var22, (byte) 115);
                        var12.method1464(var23, (byte) 101);
                        var12.method1464(var24, (byte) 93);
                    }
                }
            }
        }
        if (var3) {
            if (this.field8673 == null) {
                short[] var31;
                short[] var32;
                byte[] var33;
                short[] var34;
                if (this.field8703 == null) {
                    var31 = this.field8728;
                    var32 = this.field8667;
                    var33 = this.field8679;
                    var34 = this.field8658;
                } else {
                    var32 = this.field8703.field3030;
                    var31 = this.field8703.field3034;
                    var33 = this.field8703.field3031;
                    var34 = this.field8703.field3033;
                }
                float var35 = this.field8741.field6003[0];
                float var36 = this.field8741.field6003[1];
                float var37 = this.field8741.field6003[2];
                float var38 = this.field8741.field6058;
                float var39 = this.field8741.field6029 * 768.0F / (float) this.field8664;
                float var40 = this.field8741.field6038 * 768.0F / (float) this.field8664;
                for (int var41 = 0; var41 < this.field8716; var41++) {
                    int var42 = this.method3454(3, this.field8725[var41], this.field8751[var41], this.field8706, this.field8739[var41]);
                    float var43 = (float) (var42 >> 8 & 0xFF) * this.field8741.field5974;
                    short var44 = this.field8737[var41];
                    float var45 = (float) (var42 >> 16 & 0xFF) * this.field8741.field6050;
                    float var46 = (float) (var42 >>> 24) * this.field8741.field5969;
                    short var47 = (short) var33[var44];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var31[var44] * var37 + (float) var32[var44] * var36 + (float) var34[var44] * var35) * 0.0026041667F;
                    } else {
                        var48 = ((float) var31[var44] * var37 + (float) var32[var44] * var36 + (float) var34[var44] * var35) / (float) (var47 * 256);
                    }
                    float var49 = var38 + (var48 < 0.0F ? var40 : var39) * var48;
                    int var50 = (int) (var46 * var49);
                    int var51 = (int) (var45 * var49);
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
                    int var52 = (int) (var43 * var49);
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.field2903 = var7 * var44 + var9;
                    var12.method1460(var50, arg0 ^ 0x609B);
                    var12.method1460(var51, 24710);
                    var12.method1460(var52, arg0 ^ 0x609B);
                    var12.method1460(255 - (this.field8739[var41] & 0xFF), arg0 ^ 0x609B);
                    short var53 = this.field8745[var41];
                    short var54 = (short) var33[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var36 + (float) var34[var53] * var35) * 0.0026041667F;
                    } else {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var36 + (float) var34[var53] * var35) / (float) (var54 * 256);
                    }
                    float var56 = (var55 < 0.0F ? var40 : var39) * var55 + var38;
                    int var57 = (int) (var46 * var56);
                    int var58 = (int) (var45 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var59 = (int) (var43 * var56);
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
                    var12.field2903 = var9 + (var7 * var53);
                    var12.method1460(var57, arg0 ^ 0x609B);
                    var12.method1460(var58, arg0 ^ 0x609B);
                    var12.method1460(var59, arg0 + 24681);
                    var12.method1460(255 - (this.field8739[var41] & 0xFF), 24710);
                    short var60 = this.field8692[var41];
                    short var61 = (short) var33[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var36 + (float) var34[var60] * var35) * 0.0026041667F;
                    } else {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var36 + (float) var34[var60] * var35) / (float) (var61 * 256);
                    }
                    float var63 = (var62 < 0.0F ? var40 : var39) * var62 + var38;
                    int var64 = (int) (var46 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var45 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    int var66 = (int) (var43 * var63);
                    var12.field2903 = var7 * var60 + var9;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method1460(var64, 24710);
                    var12.method1460(var65, arg0 ^ 0x609B);
                    var12.method1460(var66, 24710);
                    var12.method1460(255 - (this.field8739[var41] & 0xFF), 24710);
                }
            } else {
                for (int var29 = 0; var29 < this.field8716; var29++) {
                    int var30 = this.method3454(3, this.field8725[var29], this.field8751[var29], this.field8706, this.field8739[var29]);
                    var12.field2903 = this.field8737[var29] * var7 + var9;
                    var12.method1421(var30, arg0 ^ 0xFFFFAEDF);
                    var12.field2903 = this.field8745[var29] * var7 + var9;
                    var12.method1421(var30, arg0 ^ 0xFFFFAEDF);
                    var12.field2903 = this.field8692[var29] * var7 + var9;
                    var12.method1421(var30, -20798);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            byte[] var69;
            short[] var70;
            if (this.field8703 == null) {
                var67 = this.field8728;
                var68 = this.field8667;
                var70 = this.field8658;
                var69 = this.field8679;
            } else {
                var67 = this.field8703.field3034;
                var68 = this.field8703.field3030;
                var69 = this.field8703.field3031;
                var70 = this.field8703.field3033;
            }
            float var71 = 3.0F / (float) this.field8664;
            float var72 = 3.0F / (float) (this.field8664 / 2 + this.field8664);
            var12.field2903 = var10;
            if (this.field8741.field5992) {
                for (int var73 = 0; var73 < this.field8655; var73++) {
                    int var74 = var69[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method3878((byte) 69, (float) var70[var73] * var72);
                        var12.method3878((byte) 69, (float) var68[var73] * var72);
                        var12.method3878((byte) 69, (float) var67[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method3878((byte) 69, (float) var70[var73] * var75);
                        var12.method3878((byte) 69, (float) var68[var73] * var75);
                        var12.method3878((byte) 69, (float) var67[var73] * var75);
                    }
                    var12.field2903 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field8655; var76++) {
                    int var77 = var69[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method3880((float) var70[var76] * var72, -114);
                        var12.method3880((float) var68[var76] * var72, arg0 ^ 0xFFFFFF92);
                        var12.method3880((float) var67[var76] * var72, -123);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method3880((float) var70[var76] * var78, -116);
                        var12.method3880((float) var68[var76] * var78, 76);
                        var12.method3880((float) var67[var76] * var78, 66);
                    }
                    var12.field2903 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field2903 = var11;
            if (this.field8741.field5992) {
                for (int var80 = 0; var80 < this.field8655; var80++) {
                    var12.method3878((byte) 69, this.field8651[var80]);
                    var12.method3878((byte) 69, this.field8668[var80]);
                    var12.field2903 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field8655; var79++) {
                    var12.method3880(this.field8651[var79], 115);
                    var12.method3880(this.field8668[var79], 85);
                    var12.field2903 += var7 - 8;
                }
            }
        }
        var12.field2903 = this.field8655 * var7;
        class583 var81;
        if (arg1) {
            if (this.field8735 == null) {
                this.field8735 = this.field8741.method2598(var12.field2912, 34168, true, var12.field2903, var7);
            } else {
                this.field8735.method16(var7, var12.field2912, -127, var12.field2903);
            }
            this.field8757 = 0;
            var81 = this.field8735;
        } else {
            var81 = this.field8741.method2598(var12.field2912, 34168, false, var12.field2903, var7);
            this.field8681 = true;
        }
        if (var5) {
            this.field8722.field9914 = var81;
            this.field8722.field9919 = var8;
        }
        if (var6) {
            this.field8738.field9914 = var81;
            this.field8738.field9919 = var11;
        }
        if (var3) {
            this.field8717.field9919 = var9;
            this.field8717.field9914 = var81;
        }
        if (var4) {
            this.field8673.field9919 = var10;
            this.field8673.field9914 = var81;
        }
    }

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "()Z", line = 539)
    public final boolean method202() {
        field8714++;
        return this.field8752;
    }

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "(IILs;Ls;III)V", line = 547)
    public final void method219(int arg0, int arg1, class278 arg2, class278 arg3, int arg4, int arg5, int arg6) {
        field8652++;
        if (!this.field8670) {
            this.method3451(-32768);
        }
        int var8 = this.field8699 + arg4;
        int var9 = this.field8694 + arg4;
        int var10 = this.field8693 + arg6;
        int var11 = this.field8720 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (var9 + arg2.field3413 >> arg2.field3409) >= arg2.field3410 || var10 < 0 || arg2.field3408 <= (arg2.field3413 + var11 >> arg2.field3409)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field3413 + var9 >> arg3.field3409) >= arg3.field3410 || var10 < 0 || arg3.field3413 + var11 >> arg3.field3409 >= arg3.field3408) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3409;
            int var13 = var9 + arg2.field3413 - 1 >> arg2.field3409;
            int var14 = var10 >> arg2.field3409;
            int var15 = arg2.field3413 + var11 - 1 >> arg2.field3409;
            if (arg5 == arg2.method1671(var14, var12, (byte) 106) && arg5 == arg2.method1671(var14, var13, (byte) -104) && arg5 == arg2.method1671(var15, var12, (byte) 116) && arg2.method1671(var15, var13, (byte) -97) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field8656; var16++) {
                this.field8750[var16] = this.field8750[var16] + arg2.method1675(this.field8740[var16] + arg6, this.field8742[var16] + arg4, 65286) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field8754;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field8656; var18++) {
                int var19 = (this.field8750[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field8750[var18] -= -((arg2.method1675(this.field8740[var18] + arg6, this.field8742[var18] + arg4, 65286) - arg5) * (arg1 - var19) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = ((arg1 & 0xFF0E) >> 8) * 4;
            int var22 = arg1 >> 16 & 0xFF << 6;
            int var23 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var20 >> 1)) < 0 || arg2.field3410 << arg2.field3409 <= (var20 >> 1) + arg4 + arg2.field3413 || arg6 - (var21 >> 1) < 0 || (arg2.field3408 << arg2.field3409) <= (arg6 - (-(var21 >> 1) - arg2.field3413))) {
                return;
            }
            this.method2839(arg4, arg6, (byte) 112, var23, arg2, var20, var21, var22, arg5);
        } else if (arg0 == 4) {
            int var31 = this.field8683 - this.field8754;
            for (int var32 = 0; var32 < this.field8656; var32++) {
                this.field8750[var32] = this.field8750[var32] + var31 + arg3.method1675(this.field8740[var32] - -arg6, this.field8742[var32] + arg4, 65286) - arg5;
            }
        } else if (arg0 == 5) {
            int var24 = this.field8683 - this.field8754;
            for (int var25 = 0; var25 < this.field8656; var25++) {
                int var26 = this.field8742[var25] + arg4;
                int var27 = this.field8740[var25] + arg6;
                int var28 = arg2.method1675(var27, var26, 65286);
                int var29 = arg3.method1675(var27, var26, 65286);
                int var30 = var28 - arg1 - var29;
                this.field8750[var25] = var28 - (arg5 - ((this.field8750[var25] << 8) / var24 * var30 >> 8));
            }
        }
        if (this.field8722 != null) {
            this.field8722.field9914 = null;
        }
        this.field8670 = false;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V", line = 707)
    private final void method3450(int arg0) {
        field8685++;
        if (!this.field8681) {
            return;
        }
        this.field8681 = false;
        if (this.field8736 == null && this.field8688 == null && this.field8697 == null) {
            if (this.field8742 != null && !class725.method4035(this.field8695, (byte) 126, this.field8666)) {
                if (this.field8722 != null && this.field8722.field9914 == null) {
                    this.field8681 = true;
                } else {
                    if (!this.field8670) {
                        this.method3451(-32768);
                    }
                    this.field8742 = null;
                }
            }
            if (this.field8750 != null && !class350.method2073(this.field8666, arg0 ^ 0xFFFFE2A1, this.field8695)) {
                if (this.field8722 != null && this.field8722.field9914 == null) {
                    this.field8681 = true;
                } else {
                    if (!this.field8670) {
                        this.method3451(-32768);
                    }
                    this.field8750 = null;
                }
            }
            if (this.field8740 != null && !class20.method92(this.field8695, 0, this.field8666)) {
                if (this.field8722 != null && this.field8722.field9914 == null) {
                    this.field8681 = true;
                } else {
                    if (!this.field8670) {
                        this.method3451(-32768);
                    }
                    this.field8740 = null;
                }
            }
        }
        if (this.field8718 != null && this.field8742 == null && this.field8750 == null && this.field8740 == null) {
            this.field8653 = null;
            this.field8718 = null;
        }
        if (this.field8679 != null && !class38.method183(this.field8695, (byte) 5, this.field8666)) {
            if (this.field8673 == null) {
                if (this.field8717 != null && this.field8717.field9914 == null) {
                    this.field8681 = true;
                } else {
                    this.field8679 = null;
                    this.field8658 = this.field8667 = this.field8728 = null;
                }
            } else if (this.field8673.field9914 == null) {
                this.field8681 = true;
            } else {
                this.field8679 = null;
                this.field8658 = this.field8667 = this.field8728 = null;
            }
        }
        if (this.field8725 != null && !class337.method2003(this.field8695, true, this.field8666)) {
            if (this.field8717 != null && this.field8717.field9914 == null) {
                this.field8681 = true;
            } else {
                this.field8725 = null;
            }
        }
        if (this.field8739 != null && !class27.method128((byte) -126, this.field8695, this.field8666)) {
            if (this.field8717 != null && this.field8717.field9914 == null) {
                this.field8681 = true;
            } else {
                this.field8739 = null;
            }
        }
        if (this.field8651 != null && !class338.method2005(arg0 ^ 0x1D3D, this.field8666, this.field8695)) {
            if (this.field8738 != null && this.field8738.field9914 == null) {
                this.field8681 = true;
            } else {
                this.field8651 = this.field8668 = null;
            }
        }
        if (this.field8751 != null && !class304.method1826(this.field8666, -86, this.field8695)) {
            if (this.field8717 != null && this.field8717.field9914 == null) {
                this.field8681 = true;
            } else {
                this.field8751 = null;
            }
        }
        if (this.field8737 != null && !class498.method2965(8236, this.field8666, this.field8695)) {
            if (this.field8700 != null && this.field8700.field2494 == null || this.field8717 != null && this.field8717.field9914 == null) {
                this.field8681 = true;
            } else {
                this.field8737 = this.field8745 = this.field8692 = null;
            }
        }
        if (this.field8753 != null && !class555.method3254(this.field8666, (byte) 110, this.field8695)) {
            this.field8753 = null;
            this.field8665 = null;
        }
        if (this.field8662 != null && !class720.method4020(this.field8695, this.field8666, 0)) {
            this.field8689 = null;
            this.field8662 = null;
        }
        if (this.field8707 != null && !class289.method1722(this.field8666, (byte) -6, this.field8695)) {
            this.field8707 = null;
        }
        if (arg0 == -7519 && this.field8657 != null && (this.field8695 & 0x800) == 0 && (this.field8695 & 0x40000) == 0) {
            this.field8657 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "LA", descriptor = "(I)V", line = 885)
    public final void method196(int arg0) {
        field8680++;
        if (this.field8717 != null) {
            this.field8717.field9914 = null;
        }
        this.field8664 = (short) arg0;
        if (this.field8673 != null) {
            this.field8673.field9914 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "WA", descriptor = "()I", line = 903)
    public final int method225() {
        field8650++;
        return this.field8706;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V", line = 911)
    public final void method211(int arg0) {
        field8727++;
        int var2 = class260.field3230[arg0];
        int var3 = class260.field3229[arg0];
        for (int var4 = 0; var4 < this.field8656; var4++) {
            int var5 = this.field8742[var4] * var3 + this.field8740[var4] * var2 >> 14;
            this.field8740[var4] = this.field8740[var4] * var3 - (this.field8742[var4] * var2) >> 14;
            this.field8742[var4] = var5;
        }
        this.field8670 = false;
        if (this.field8722 != null) {
            this.field8722.field9914 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "ua", descriptor = "()I", line = 940)
    public final int method213() {
        field8647++;
        return this.field8695;
    }

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "(I)V", line = 952)
    public final void method207(int arg0) {
        this.field8695 = arg0;
        field8686++;
        this.field8681 = true;
        if (this.field8703 != null && (this.field8695 & 0x10000) == 0) {
            this.field8728 = this.field8703.field3034;
            this.field8658 = this.field8703.field3033;
            this.field8667 = this.field8703.field3030;
            this.field8679 = this.field8703.field3031;
            this.field8703 = null;
        }
        this.method3450(-7519);
    }

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "()I", line = 975)
    public final int method234() {
        if (!this.field8670) {
            this.method3451(-32768);
        }
        field8711++;
        return this.field8720;
    }

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "(I)V", line = 990)
    public final void method205(int arg0) {
        if (this.field8717 != null) {
            this.field8717.field9914 = null;
        }
        this.field8706 = (short) arg0;
        field8734++;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ldfa;Lim;I)V", line = 1004)
    public final void method228(class165 arg0, class569 arg1, int arg2) {
        field8671++;
        if (this.field8655 == 0) {
            return;
        }
        class624 var4 = this.field8741.field5943;
        if (!this.field8670) {
            this.method3451(-32768);
        }
        class624 var5 = (class624) arg0;
        class160.field1780 = var4.field8962 * var5.field8955 + var4.field8959 * var5.field8939 + var4.field8940 * var5.field8944 + var4.field8955;
        class311.field3862 = var4.field8962 * var5.field8940 + var4.field8959 * var5.field8951 + var4.field8940 * var5.field8968;
        float var6 = (float) this.field8754 * class311.field3862 + class160.field1780;
        float var7 = (float) this.field8683 * class311.field3862 + class160.field1780;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = var7 - (float) this.field8744;
            var8 = (float) this.field8744 + var6;
        } else {
            var8 = (float) this.field8744 + var7;
            var9 = (float) (-this.field8744) + var6;
        }
        if ((this.field8741.field5973 <= var9) || (var8 <= (float) this.field8741.field6039)) {
            return;
        }
        class252.field3042 = var4.field8961 * var5.field8955 + var4.field8954 * var5.field8939 + var4.field8951 * var5.field8944 + var4.field8939;
        class287.field3521 = var4.field8961 * var5.field8940 + var4.field8954 * var5.field8951 + var4.field8951 * var5.field8968;
        float var10 = (float) this.field8754 * class287.field3521 + class252.field3042;
        float var11 = (float) this.field8683 * class287.field3521 + class252.field3042;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) (-this.field8744) + var11) * (float) this.field8741.field5984;
            var13 = ((float) this.field8744 + var10) * (float) this.field8741.field5984;
        } else {
            var13 = ((float) this.field8744 + var11) * (float) this.field8741.field5984;
            var12 = ((float) (-this.field8744) + var10) * (float) this.field8741.field5984;
        }
        if ((var12 / var8 >= this.field8741.field5982) || (var13 / var8 <= this.field8741.field6043)) {
            return;
        }
        class215.field2504 = var4.field8942 * var5.field8940 + var4.field8968 * var5.field8968 + var4.field8958 * var5.field8951;
        class461.field6566 = var4.field8942 * var5.field8955 + var4.field8968 * var5.field8944 + var4.field8958 * var5.field8939 + var4.field8944;
        float var14 = (float) this.field8754 * class215.field2504 + class461.field6566;
        float var15 = (float) this.field8683 * class215.field2504 + class461.field6566;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = (var15 - (float) this.field8744) * (float) this.field8741.field5997;
            var17 = ((float) this.field8744 + var14) * (float) this.field8741.field5997;
        } else {
            var16 = ((float) (-this.field8744) + var14) * (float) this.field8741.field5997;
            var17 = ((float) this.field8744 + var15) * (float) this.field8741.field5997;
        }
        if ((var16 / var8 >= this.field8741.field5998) || (var17 / var8 <= this.field8741.field5994)) {
            return;
        }
        if (arg1 != null || this.field8697 != null) {
            class591.field8328 = var4.field8962 * var5.field8962 + var4.field8959 * var5.field8961 + var4.field8940 * var5.field8942;
            class515.field7348 = var4.field8961 * var5.field8959 + var4.field8954 * var5.field8954 + var4.field8951 * var5.field8958;
            class140.field1568 = var4.field8942 * var5.field8959 + var4.field8968 * var5.field8958 + var4.field8958 * var5.field8954;
            class560.field7997 = var4.field8942 * var5.field8962 + var4.field8968 * var5.field8942 + var4.field8958 * var5.field8961;
            class215.field2510 = var4.field8962 * var5.field8959 + var4.field8959 * var5.field8954 + var4.field8940 * var5.field8958;
            class6.field43 = var4.field8961 * var5.field8962 + var4.field8954 * var5.field8961 + var4.field8951 * var5.field8942;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field8699 + this.field8694 >> 1;
            int var21 = this.field8720 + this.field8693 >> 1;
            int var22 = (int) ((float) var21 * class6.field43 + (float) this.field8754 * class287.field3521 + (float) var20 * class515.field7348 + class252.field3042);
            int var23 = (int) ((float) var21 * class560.field7997 + (float) this.field8754 * class215.field2504 + (float) var20 * class140.field1568 + class461.field6566);
            int var24 = (int) ((float) var21 * class591.field8328 + (float) this.field8754 * class311.field3862 + (float) var20 * class215.field2510 + class160.field1780);
            if (this.field8741.field6039 > var24) {
                var18 = true;
            } else {
                arg1.field8083 = this.field8741.field5984 * var22 / var24 + this.field8741.field6002;
                arg1.field8085 = this.field8741.field5997 * var23 / var24 + this.field8741.field6044;
            }
            int var25 = (int) ((float) var21 * class6.field43 + (float) this.field8683 * class287.field3521 + (float) var20 * class515.field7348 + class252.field3042);
            int var26 = (int) ((float) var21 * class560.field7997 + (float) this.field8683 * class215.field2504 + (float) var20 * class140.field1568 + class461.field6566);
            int var27 = (int) ((float) var21 * class591.field8328 + (float) this.field8683 * class311.field3862 + (float) var20 * class215.field2510 + class160.field1780);
            if (this.field8741.field6039 > var27) {
                var18 = true;
            } else {
                arg1.field8081 = this.field8741.field5984 * var25 / var27 + this.field8741.field6002;
                arg1.field8086 = this.field8741.field5997 * var26 / var27 + this.field8741.field6044;
            }
            if (var18) {
                if (this.field8741.field6039 > var24 && this.field8741.field6039 > var27) {
                    var19 = false;
                } else if (this.field8741.field6039 > var24) {
                    int var31 = (var27 - this.field8741.field6039 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field8083 = this.field8741.field5984 * var32 / this.field8741.field6039 + this.field8741.field6002;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field8085 = this.field8741.field5997 * var33 / this.field8741.field6039 + this.field8741.field6044;
                } else if (var27 < this.field8741.field6039) {
                    int var28 = (var24 - this.field8741.field6039 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field8083 = this.field8741.field5984 * var29 / this.field8741.field6039 + this.field8741.field6002;
                    arg1.field8085 = this.field8741.field5997 * var30 / this.field8741.field6039 + this.field8741.field6044;
                }
            }
            if (var19) {
                arg1.field8082 = true;
                if (var24 > var27) {
                    arg1.field8084 = (var22 + this.field8744) * this.field8741.field5984 / var24 + this.field8741.field6002 - arg1.field8083;
                } else {
                    arg1.field8084 = (this.field8744 + var25) * this.field8741.field5984 / var27 + this.field8741.field6002 - arg1.field8081;
                }
            }
        }
        this.field8741.method2566(1);
        this.field8741.method2628((byte) -107, var5);
        this.method3459(true);
        this.field8741.method2561((byte) 115);
        this.method3457(false);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lka;IIIZ)V", line = 1212)
    public final void method230(class470 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8721++;
        class610 var6 = (class610) arg0;
        if (this.field8716 == 0 || var6.field8716 == 0) {
            return;
        }
        int var7 = var6.field8656;
        int[] var8 = var6.field8742;
        int[] var9 = var6.field8750;
        int[] var10 = var6.field8740;
        short[] var11 = var6.field8658;
        short[] var12 = var6.field8667;
        short[] var13 = var6.field8728;
        byte[] var14 = var6.field8679;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field8703 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var18 = this.field8703.field3031;
            var17 = this.field8703.field3034;
            var16 = this.field8703.field3030;
            var15 = this.field8703.field3033;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field8703 == null) {
            var20 = null;
            var22 = null;
            var19 = null;
            var21 = null;
        } else {
            var19 = var6.field8703.field3031;
            var20 = var6.field8703.field3030;
            var21 = var6.field8703.field3034;
            var22 = var6.field8703.field3033;
        }
        int[] var23 = var6.field8653;
        short[] var24 = var6.field8718;
        if (!var6.field8670) {
            var6.method3451(-32768);
        }
        short var25 = var6.field8754;
        short var26 = var6.field8683;
        short var27 = var6.field8699;
        short var28 = var6.field8694;
        short var29 = var6.field8693;
        short var30 = var6.field8720;
        for (int var31 = 0; var31 < this.field8656; var31++) {
            int var32 = this.field8750[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field8742[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field8740[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field8653[var31];
                        int var37 = this.field8653[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field8718[var38] - 1;
                            if (var35 == -1 || this.field8679[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = var23[var39];
                                    int var42 = -1;
                                    for (int var43 = var41; var43 < var40; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var15 == null) {
                                            this.field8703 = new class251();
                                            var15 = this.field8703.field3033 = class743.method4138(this.field8658, 113);
                                            var16 = this.field8703.field3030 = class743.method4138(this.field8667, 54);
                                            var17 = this.field8703.field3034 = class743.method4138(this.field8728, 84);
                                            var18 = this.field8703.field3031 = class173.method1077(0, this.field8679);
                                        }
                                        if (var22 == null) {
                                            class251 var44 = var6.field8703 = new class251();
                                            var22 = var44.field3033 = class743.method4138(var11, 104);
                                            var20 = var44.field3030 = class743.method4138(var12, 97);
                                            var21 = var44.field3034 = class743.method4138(var13, 84);
                                            var19 = var44.field3031 = class173.method1077(0, var14);
                                        }
                                        short var45 = this.field8658[var35];
                                        short var46 = this.field8667[var35];
                                        short var47 = this.field8728[var35];
                                        byte var48 = this.field8679[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var22[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var19[var52] += var48;
                                            }
                                        }
                                        short var53 = var12[var42];
                                        short var54 = var13[var42];
                                        int var55 = this.field8653[var31 + 1];
                                        int var56 = this.field8653[var31];
                                        byte var57 = var14[var42];
                                        short var58 = var11[var42];
                                        for (int var59 = var56; var59 < var55; var59++) {
                                            int var60 = this.field8718[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var58;
                                                var16[var60] += var53;
                                                var17[var60] += var54;
                                                var18[var60] += var57;
                                            }
                                        }
                                        if (this.field8673 == null && this.field8717 != null) {
                                            this.field8717.field9914 = null;
                                        }
                                        if (this.field8673 != null) {
                                            this.field8673.field9914 = null;
                                        }
                                        if (var6.field8673 == null && var6.field8717 != null) {
                                            var6.field8717.field9914 = null;
                                        }
                                        if (var6.field8673 != null) {
                                            var6.field8673.field9914 = null;
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

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)V", line = 1482)
    private final void method3451(int arg0) {
        field8746++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = arg0;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field8656; var10++) {
            int var11 = this.field8742[var10];
            int var12 = this.field8750[var10];
            int var13 = this.field8740[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var6 < var12) {
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
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field8683 = (short) var6;
        this.field8754 = (short) var3;
        this.field8699 = (short) var2;
        this.field8693 = (short) var4;
        this.field8720 = (short) var7;
        this.field8694 = (short) var5;
        this.field8744 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field8713 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field8670 = true;
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "()[Lnda;", line = 1556)
    public final class555[] method212() {
        field8743++;
        return this.field8736;
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lnv;)V", line = 5822)
    public class610(class417 arg0) {
        this.field8741 = arg0;
        this.field8722 = new class704(null, 5126, 3, 0);
        this.field8738 = new class704(null, 5126, 2, 0);
        this.field8673 = new class704(null, 5126, 3, 0);
        this.field8717 = new class704(null, 5121, 4, 0);
        this.field8700 = new class212();
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lnv;Luk;IIII)V", line = 5834)
    public class610(class417 arg0, class260 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8695 = arg2;
        this.field8741 = arg0;
        this.field8666 = arg5;
        if (class52.method298(arg2, arg5, true)) {
            this.field8722 = new class704(null, 5126, 3, 0);
        }
        if (class718.method4007(arg2, true, arg5)) {
            this.field8738 = new class704(null, 5126, 2, 0);
        }
        if (class619.method3531(true, arg2, arg5)) {
            this.field8673 = new class704(null, 5126, 3, 0);
        }
        if (class452.method2783(arg5, arg2, 62)) {
            this.field8717 = new class704(null, 5121, 4, 0);
        }
        if (class478.method2875(2048, arg5, arg2)) {
            this.field8700 = new class212();
        }
        class150 var7 = arg0.field578;
        this.field8653 = new int[arg1.field3204 + 1];
        int[] var8 = new int[arg1.field3220];
        for (int var9 = 0; var9 < arg1.field3220; var9++) {
            if (arg1.field3217 == null || arg1.field3217[var9] != 2) {
                if (arg1.field3203 != null && arg1.field3203[var9] != -1) {
                    class298 var173 = var7.method931(arg1.field3203[var9] & 0xFFFF, true);
                    if (((this.field8666 & 0x40) == 0 || !var173.field3694) && var173.field3710) {
                        continue;
                    }
                }
                var8[this.field8716++] = var9;
                this.field8653[arg1.field3189[var9]]++;
                this.field8653[arg1.field3179[var9]]++;
                this.field8653[arg1.field3197[var9]]++;
            }
        }
        this.field8702 = this.field8716;
        long[] var10 = new long[this.field8716];
        boolean var11 = (this.field8695 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field8716; var12++) {
            int var156 = var8[var12];
            class298 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field3208 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field3208.length; var163++) {
                    class714 var164 = arg1.field3208[var163];
                    if (var164.field10046 == var156) {
                        class128 var165 = class741.method4128(false, var164.field10043);
                        if (var165.field1336) {
                            var162 = true;
                        }
                        if (var165.field1345 != -1) {
                            class298 var166 = var7.method931(var165.field1345, true);
                            if (var166.field3698 == 2) {
                                this.field8748 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field8702--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field3203 != null) {
                var167 = arg1.field3203[var156];
                if (var167 != -1) {
                    var157 = var7.method931(var167 & 0xFFFF, true);
                    if ((this.field8666 & 0x40) != 0 && var157.field3694) {
                        var157 = null;
                        var167 = -1;
                    } else {
                        if (var157.field3704 != 0 || var157.field3699 != 0) {
                            this.field8752 = true;
                        }
                        var160 = var157.field3702;
                        var161 = var157.field3695;
                    }
                }
            }
            boolean var168 = arg1.field3199 != null && arg1.field3199[var156] != 0 || var157 != null && var157.field3698 != 0;
            if ((var11 || var168) && arg1.field3213 != null) {
                var158 += arg1.field3213[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = (var160 & 0xFF << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = (var167 & 0xFFFF << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + (long) var172;
            this.field8752 |= var157 != null && (var157.field3704 != 0 || var157.field3699 != 0);
            this.field8748 |= var168;
        }
        class722.method4024(var8, var10, 0);
        this.field8689 = arg1.field3211;
        this.field8663 = arg1.field3198;
        this.field8656 = arg1.field3204;
        this.field8742 = arg1.field3226;
        this.field8750 = arg1.field3192;
        this.field8740 = arg1.field3210;
        this.field8688 = arg1.field3174;
        class458[] var13 = new class458[this.field8656];
        this.field8736 = arg1.field3172;
        if (arg1.field3208 != null) {
            this.field8749 = arg1.field3208.length;
            this.field8762 = new class43[this.field8749];
            this.field8697 = new class647[this.field8749];
            for (int var14 = 0; var14 < this.field8749; var14++) {
                class714 var15 = arg1.field3208[var14];
                class128 var16 = class741.method4128(false, var15.field10043);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field8716; var18++) {
                    if (var8[var18] == var15.field10046) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class721.field10115[arg1.field3190[var15.field10046] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field3199 == null ? 0 : arg1.field3199[var15.field10046]) << 24;
                this.field8697[var14] = new class647(var17, arg1.field3189[var15.field10046], arg1.field3179[var15.field10046], arg1.field3197[var15.field10046], var16.field1337, var16.field1344, var16.field1345, var16.field1348, var16.field1346, var16.field1336, var16.field1343, var15.field10042);
                this.field8762[var14] = new class43(var20);
            }
        }
        int var21 = this.field8716 * 3;
        this.field8679 = new byte[var21];
        if (arg1.field3191 != null) {
            this.field8665 = new short[this.field8716];
        }
        this.field8664 = (short) arg4;
        this.field8706 = (short) arg3;
        this.field8692 = new short[this.field8716];
        this.field8745 = new short[this.field8716];
        this.field8751 = new short[this.field8716];
        class560.field7994 = new long[var21];
        this.field8728 = new short[var21];
        this.field8667 = new short[var21];
        this.field8725 = new short[this.field8716];
        this.field8737 = new short[this.field8716];
        this.field8718 = new short[var21];
        this.field8651 = new float[var21];
        this.field8658 = new short[var21];
        this.field8668 = new float[var21];
        this.field8739 = new byte[this.field8716];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field3204; var23++) {
            int var155 = this.field8653[var23];
            this.field8653[var23] = var22;
            var13[var23] = new class458();
            var22 += var155;
        }
        this.field8653[arg1.field3204] = var22;
        class74 var24 = class366.method2134(arg1, var8, this.field8716, -118);
        class348[] var25 = new class348[arg1.field3220];
        for (int var26 = 0; var26 < arg1.field3220; var26++) {
            short var134 = arg1.field3189[var26];
            short var135 = arg1.field3179[var26];
            short var136 = arg1.field3197[var26];
            int var137 = this.field8742[var135] - this.field8742[var134];
            int var138 = this.field8750[var135] - this.field8750[var134];
            int var139 = this.field8740[var135] - this.field8740[var134];
            int var140 = this.field8742[var136] - this.field8742[var134];
            int var141 = this.field8750[var136] - this.field8750[var134];
            int var142 = this.field8740[var136] - this.field8740[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145 = var137 * var141 - (var138 * var140);
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var144 >>= 0x1;
                var145 >>= 0x1;
                var143 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var145 * var145 + var143 * var143 + var144 * var144));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var143 * 256 / var146;
            int var148 = var145 * 256 / var146;
            int var149 = var144 * 256 / var146;
            byte var150 = arg1.field3217 == null ? 0 : arg1.field3217[var26];
            if (var150 == 0) {
                class458 var151 = var13[var134];
                var151.field6557 += var148;
                var151.field6554 += var149;
                var151.field6550 += var147;
                var151.field6552++;
                class458 var152 = var13[var135];
                var152.field6550 += var147;
                var152.field6557 += var148;
                var152.field6554 += var149;
                var152.field6552++;
                class458 var153 = var13[var136];
                var153.field6557 += var148;
                var153.field6554 += var149;
                var153.field6552++;
                var153.field6550 += var147;
            } else if (var150 == 1) {
                class348 var154 = var25[var26] = new class348();
                var154.field4497 = var148;
                var154.field4494 = var149;
                var154.field4493 = var147;
            }
        }
        for (int var27 = 0; var27 < this.field8716; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field3190[var43] & 0xFFFF;
            int var45;
            if (arg1.field3184 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field3184[var43];
            }
            int var46;
            if (arg1.field3199 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field3199[var43] & 0xFF;
            }
            short var47 = arg1.field3203 == null ? -1 : arg1.field3203[var43];
            if (var47 != -1 && (this.field8666 & 0x40) != 0) {
                class298 var48 = var7.method931(var47 & 0xFFFF, true);
                if (var48.field3694) {
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
                    var50 = 1.0F;
                    var52 = 1.0F;
                    var56 = 2;
                    var49 = 0.0F;
                    var51 = 1.0F;
                    var54 = 0.0F;
                    var53 = 0.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field3218[var45];
                    if (var58 == 0) {
                        short var87 = arg1.field3189[var43];
                        short var88 = arg1.field3179[var43];
                        short var89 = arg1.field3197[var43];
                        short var90 = arg1.field3176[var45];
                        short var91 = arg1.field3183[var45];
                        short var92 = arg1.field3188[var45];
                        float var93 = (float) arg1.field3226[var90];
                        float var94 = (float) arg1.field3192[var90];
                        float var95 = (float) arg1.field3210[var90];
                        float var96 = (float) arg1.field3226[var91] - var93;
                        float var97 = (float) arg1.field3192[var91] - var94;
                        float var98 = (float) arg1.field3210[var91] - var95;
                        float var99 = (float) arg1.field3226[var92] - var93;
                        float var100 = (float) arg1.field3192[var92] - var94;
                        float var101 = (float) arg1.field3210[var92] - var95;
                        float var102 = (float) arg1.field3226[var87] - var93;
                        float var103 = (float) arg1.field3192[var87] - var94;
                        float var104 = (float) arg1.field3210[var87] - var95;
                        float var105 = (float) arg1.field3226[var88] - var93;
                        float var106 = (float) arg1.field3192[var88] - var94;
                        float var107 = (float) arg1.field3210[var88] - var95;
                        float var108 = (float) arg1.field3226[var89] - var93;
                        float var109 = (float) arg1.field3192[var89] - var94;
                        float var110 = (float) arg1.field3210[var89] - var95;
                        float var111 = var97 * var101 - (var98 * var100);
                        float var112 = var98 * var99 - (var96 * var101);
                        float var113 = var96 * var100 - var97 * var99;
                        float var114 = var100 * var113 - var101 * var112;
                        float var115 = var101 * var111 - (var99 * var113);
                        float var116 = var99 * var112 - (var100 * var111);
                        float var117 = 1.0F / (var98 * var116 + var96 * var114 + var97 * var115);
                        var53 = (var110 * var116 + var108 * var114 + var109 * var115) * var117;
                        var49 = (var104 * var116 + var102 * var114 + var103 * var115) * var117;
                        var51 = (var107 * var116 + var105 * var114 + var106 * var115) * var117;
                        float var118 = var96 * var112 - (var97 * var111);
                        float var119 = var97 * var113 - (var98 * var112);
                        float var120 = var98 * var111 - (var96 * var113);
                        float var121 = 1.0F / (var101 * var118 + var99 * var119 + var100 * var120);
                        var54 = (var110 * var118 + var108 * var119 + var109 * var120) * var121;
                        var52 = (var107 * var118 + var105 * var119 + var106 * var120) * var121;
                        var50 = (var104 * var118 + var102 * var119 + var103 * var120) * var121;
                    } else {
                        short var59 = arg1.field3189[var43];
                        short var60 = arg1.field3179[var43];
                        short var61 = arg1.field3197[var43];
                        int var62 = var24.field771[var45];
                        int var63 = var24.field775[var45];
                        int var64 = var24.field774[var45];
                        float[] var65 = var24.field770[var45];
                        byte var66 = arg1.field3202[var45];
                        float var67 = (float) arg1.field3177[var45] / 256.0F;
                        if (var58 == 1) {
                            float var68 = (float) arg1.field3227[var45] / 1024.0F;
                            class741.method4127(var63, var68, var62, arg1.field3192[var59], arg1.field3226[var59], var67, var64, class747.field10415, var65, true, arg1.field3210[var59], var66);
                            var50 = class747.field10415[1];
                            var49 = class747.field10415[0];
                            class741.method4127(var63, var68, var62, arg1.field3192[var60], arg1.field3226[var60], var67, var64, class747.field10415, var65, true, arg1.field3210[var60], var66);
                            var51 = class747.field10415[0];
                            var52 = class747.field10415[1];
                            class741.method4127(var63, var68, var62, arg1.field3192[var61], arg1.field3226[var61], var67, var64, class747.field10415, var65, true, arg1.field3210[var61], var66);
                            var54 = class747.field10415[1];
                            var53 = class747.field10415[0];
                            float var69 = var68 / 2.0F;
                            if ((var66 & 0x1) == 0) {
                                if ((var51 - var49 > var69)) {
                                    var51 -= var68;
                                    var55 = 1;
                                } else if (var69 < var49 - var51) {
                                    var55 = 2;
                                    var51 += var68;
                                }
                                if (var53 - var49 > var69) {
                                    var56 = 1;
                                    var53 -= var68;
                                } else if (var69 < var49 - var53) {
                                    var56 = 2;
                                    var53 += var68;
                                }
                            } else {
                                if (var69 < var52 - var50) {
                                    var55 = 1;
                                    var52 -= var68;
                                } else if (var50 - var52 > var69) {
                                    var55 = 2;
                                    var52 += var68;
                                }
                                if ((var54 - var50 > var69)) {
                                    var54 -= var68;
                                    var56 = 1;
                                } else if (var69 < var50 - var54) {
                                    var54 += var68;
                                    var56 = 2;
                                }
                            }
                        } else if (var58 == 2) {
                            float var70 = (float) arg1.field3223[var45] / 256.0F;
                            float var71 = (float) arg1.field3195[var45] / 256.0F;
                            int var72 = arg1.field3226[var60] - arg1.field3226[var59];
                            int var73 = arg1.field3192[var60] - arg1.field3192[var59];
                            int var74 = arg1.field3210[var60] - arg1.field3210[var59];
                            int var75 = arg1.field3226[var61] - arg1.field3226[var59];
                            int var76 = arg1.field3192[var61] - arg1.field3192[var59];
                            int var77 = arg1.field3210[var61] - arg1.field3210[var59];
                            int var78 = var73 * var77 - (var74 * var76);
                            int var79 = var74 * var75 - (var72 * var77);
                            int var80 = var72 * var76 - (var73 * var75);
                            float var81 = 64.0F / (float) arg1.field3212[var45];
                            float var82 = 64.0F / (float) arg1.field3196[var45];
                            float var83 = 64.0F / (float) arg1.field3227[var45];
                            float var84 = (var65[2] * (float) var80 + var65[1] * (float) var79 + var65[0] * (float) var78) / var81;
                            float var85 = (var65[5] * (float) var80 + var65[3] * (float) var78 + var65[4] * (float) var79) / var82;
                            float var86 = (var65[8] * (float) var80 + var65[6] * (float) var78 + var65[7] * (float) var79) / var83;
                            var57 = class417.method2586((byte) -120, var85, var84, var86);
                            class336.method2000(var71, arg1.field3210[var59], var70, class747.field10415, var62, arg1.field3226[var59], var57, arg1.field3192[var59], 28795, var66, var64, var67, var63, var65);
                            var49 = class747.field10415[0];
                            var50 = class747.field10415[1];
                            class336.method2000(var71, arg1.field3210[var60], var70, class747.field10415, var62, arg1.field3226[var60], var57, arg1.field3192[var60], 28795, var66, var64, var67, var63, var65);
                            var52 = class747.field10415[1];
                            var51 = class747.field10415[0];
                            class336.method2000(var71, arg1.field3210[var61], var70, class747.field10415, var62, arg1.field3226[var61], var57, arg1.field3192[var61], 28795, var66, var64, var67, var63, var65);
                            var53 = class747.field10415[0];
                            var54 = class747.field10415[1];
                        } else if (var58 == 3) {
                            class202.method1222(arg1.field3226[var59], (byte) -102, var66, var63, var65, arg1.field3192[var59], class747.field10415, var67, var64, var62, arg1.field3210[var59]);
                            var49 = class747.field10415[0];
                            var50 = class747.field10415[1];
                            class202.method1222(arg1.field3226[var60], (byte) -109, var66, var63, var65, arg1.field3192[var60], class747.field10415, var67, var64, var62, arg1.field3210[var60]);
                            var51 = class747.field10415[0];
                            var52 = class747.field10415[1];
                            class202.method1222(arg1.field3226[var61], (byte) -100, var66, var63, var65, arg1.field3192[var61], class747.field10415, var67, var64, var62, arg1.field3210[var61]);
                            var54 = class747.field10415[1];
                            var53 = class747.field10415[0];
                            if ((var66 & 0x1) == 0) {
                                if ((var51 - var49 > 0.5F)) {
                                    var51--;
                                    var55 = 1;
                                } else if (var49 - var51 > 0.5F) {
                                    var51++;
                                    var55 = 2;
                                }
                                if (var53 - var49 > 0.5F) {
                                    var56 = 1;
                                    var53--;
                                } else if (var49 - var53 > 0.5F) {
                                    var53++;
                                    var56 = 2;
                                }
                            } else {
                                if (var54 - var50 > 0.5F) {
                                    var56 = 1;
                                    var54--;
                                } else if (var50 - var54 > 0.5F) {
                                    var56 = 2;
                                    var54++;
                                }
                                if ((var52 - var50 > 0.5F)) {
                                    var52--;
                                    var55 = 1;
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
            if (arg1.field3217 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field3217[var43];
            }
            if (var122 == 0) {
                long var126 = ((long) (var57 << 24) + (long) var46 + (long) (var44 << 8) << 32) + (long) (var45 << 2);
                short var128 = arg1.field3189[var43];
                short var129 = arg1.field3179[var43];
                short var130 = arg1.field3197[var43];
                class458 var131 = var13[var128];
                this.field8737[var27] = this.method3453(var131.field6550, var131.field6552, 90, var50, var131.field6557, var126, var131.field6554, var128, var49, arg1);
                class458 var132 = var13[var129];
                this.field8745[var27] = this.method3453(var132.field6550, var132.field6552, 14, var52, var132.field6557, (long) var55 + var126, var132.field6554, var129, var51, arg1);
                class458 var133 = var13[var130];
                this.field8692[var27] = this.method3453(var133.field6550, var133.field6552, 10, var54, var133.field6557, (long) var56 + var126, var133.field6554, var130, var53, arg1);
            } else if (var122 == 1) {
                class348 var123 = var25[var43];
                long var124 = (long) ((var123.field4494 + 256 << 12) + (var45 << 2) + ((var123.field4493 <= 0 ? 2048 : 1024) - -(var123.field4497 + 256 << 22))) + ((long) (var44 << 8) + (long) (var57 << 24) + (long) var46 << 32);
                this.field8737[var27] = this.method3453(var123.field4493, 0, 84, var50, var123.field4497, var124, var123.field4494, arg1.field3189[var43], var49, arg1);
                this.field8745[var27] = this.method3453(var123.field4493, 0, 73, var52, var123.field4497, (long) var55 + var124, var123.field4494, arg1.field3179[var43], var51, arg1);
                this.field8692[var27] = this.method3453(var123.field4493, 0, 47, var54, var123.field4497, (long) var56 + var124, var123.field4494, arg1.field3197[var43], var53, arg1);
            }
            if (arg1.field3199 != null) {
                this.field8739[var27] = arg1.field3199[var43];
            }
            if (arg1.field3191 != null) {
                this.field8665[var27] = arg1.field3191[var43];
            }
            this.field8725[var27] = arg1.field3190[var43];
            this.field8751[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field8702; var30++) {
            short var42 = this.field8751[var30];
            if (var29 != var42) {
                var29 = var42;
                var28++;
            }
        }
        this.field8657 = new int[var28 + 1];
        short var31 = -10000;
        int var32 = 0;
        for (int var33 = 0; var33 < this.field8702; var33++) {
            short var41 = this.field8751[var33];
            if (var31 != var41) {
                this.field8657[var32++] = var33;
                var31 = var41;
            }
        }
        this.field8657[var32] = this.field8702;
        class560.field7994 = null;
        this.field8658 = class223.method1294((byte) -112, this.field8658, this.field8655);
        this.field8667 = class223.method1294((byte) -62, this.field8667, this.field8655);
        this.field8728 = class223.method1294((byte) -115, this.field8728, this.field8655);
        this.field8679 = class463.method2818(this.field8655, 11585, this.field8679);
        this.field8651 = class614.method3470(-14, this.field8655, this.field8651);
        this.field8668 = class614.method3470(-14, this.field8655, this.field8668);
        if (arg1.field3173 != null && class720.method4020(arg2, this.field8666, 0)) {
            this.field8662 = arg1.method1550((byte) 78, false);
        }
        if (arg1.field3208 != null && class289.method1722(this.field8666, (byte) -6, arg2)) {
            this.field8707 = arg1.method1555(121);
        }
        if (arg1.field3186 != null && class555.method3254(this.field8666, (byte) -112, arg2)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field8716; var36++) {
                int var40 = arg1.field3186[var8[var36]];
                if (var40 >= 0) {
                    int var10002 = var35[var40]++;
                    if (var34 < var40) {
                        var34 = var40;
                    }
                }
            }
            this.field8753 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field8753[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field8716; var38++) {
                int var39 = arg1.field3186[var8[var38]];
                if (var39 >= 0) {
                    this.field8753[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "(I)V", line = 1567)
    public final void method209(int arg0) {
        field8654++;
        int var2 = class260.field3230[arg0];
        int var3 = class260.field3229[arg0];
        for (int var4 = 0; var4 < this.field8656; var4++) {
            int var7 = this.field8742[var4] * var3 + this.field8740[var4] * var2 >> 14;
            this.field8740[var4] = this.field8740[var4] * var3 - (this.field8742[var4] * var2) >> 14;
            this.field8742[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field8655; var5++) {
            int var6 = this.field8728[var5] * var2 + this.field8658[var5] * var3 >> 14;
            this.field8728[var5] = (short) (this.field8728[var5] * var3 - (this.field8658[var5] * var2) >> 14);
            this.field8658[var5] = (short) var6;
        }
        if (this.field8673 == null && this.field8717 != null) {
            this.field8717.field9914 = null;
        }
        if (this.field8673 != null) {
            this.field8673.field9914 = null;
        }
        if (this.field8722 != null) {
            this.field8722.field9914 = null;
        }
        this.field8670 = false;
    }

    @OriginalMember(owner = "client!lea", name = "ma", descriptor = "()I", line = 1615)
    public final int method217() {
        if (!this.field8670) {
            this.method3451(-32768);
        }
        field8676++;
        return this.field8713;
    }

    @OriginalMember(owner = "client!lea", name = "ia", descriptor = "(SS)V", line = 1629)
    public final void method187(short arg0, short arg1) {
        field8675++;
        for (int var3 = 0; var3 < this.field8716; var3++) {
            if (this.field8725[var3] == arg0) {
                this.field8725[var3] = arg1;
            }
        }
        if (this.field8697 != null) {
            for (int var4 = 0; var4 < this.field8749; var4++) {
                class647 var5 = this.field8697[var4];
                class43 var6 = this.field8762[var4];
                var6.field487 = var6.field487 & 0xFF000000 | class721.field10115[this.field8725[var5.field9258] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field8717 != null) {
            this.field8717.field9914 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "NA", descriptor = "()Z", line = 1671)
    public final boolean method208() {
        field8661++;
        if (this.field8662 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field8663; var1++) {
            this.field8742[var1] <<= 0x4;
            this.field8750[var1] <<= 0x4;
            this.field8740[var1] <<= 0x4;
        }
        class659.field9410 = 0;
        class592.field8347 = 0;
        class255.field3120 = 0;
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IILdfa;ZII)Z", line = 1698)
    public final boolean method191(int arg0, int arg1, class165 arg2, boolean arg3, int arg4, int arg5) {
        field8696++;
        return this.method3455(arg2, arg3, arg5, arg0, arg4, -28600, arg1);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ldfa;Lim;II)V", line = 1706)
    public final void method188(class165 arg0, class569 arg1, int arg2, int arg3) {
        field8712++;
        if (this.field8655 == 0) {
            return;
        }
        class624 var5 = this.field8741.field5943;
        class624 var6 = (class624) arg0;
        if (!this.field8670) {
            this.method3451(-32768);
        }
        class311.field3862 = var5.field8962 * var6.field8940 + var5.field8959 * var6.field8951 + var5.field8940 * var6.field8968;
        class160.field1780 = var5.field8962 * var6.field8955 + var5.field8959 * var6.field8939 + var5.field8940 * var6.field8944 + var5.field8955;
        float var7 = (float) this.field8754 * class311.field3862 + class160.field1780;
        float var8 = (float) this.field8683 * class311.field3862 + class160.field1780;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) (-this.field8744) + var8;
            var10 = (float) this.field8744 + var7;
        } else {
            var10 = (float) this.field8744 + var8;
            var9 = var7 - (float) this.field8744;
        }
        if ((var9 >= this.field8741.field6052) || (var10 <= (float) this.field8741.field6039)) {
            return;
        }
        class252.field3042 = var5.field8961 * var6.field8955 + var5.field8954 * var6.field8939 + var5.field8951 * var6.field8944 + var5.field8939;
        class287.field3521 = var5.field8961 * var6.field8940 + var5.field8954 * var6.field8951 + var5.field8951 * var6.field8968;
        float var11 = (float) this.field8754 * class287.field3521 + class252.field3042;
        float var12 = (float) this.field8683 * class287.field3521 + class252.field3042;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var14 = ((float) this.field8744 + var11) * (float) this.field8741.field5984;
            var13 = (var12 - (float) this.field8744) * (float) this.field8741.field5984;
        } else {
            var13 = ((float) (-this.field8744) + var11) * (float) this.field8741.field5984;
            var14 = ((float) this.field8744 + var12) * (float) this.field8741.field5984;
        }
        if ((var13 / (float) arg2 >= this.field8741.field5982) || (var14 / (float) arg2 <= this.field8741.field6043)) {
            return;
        }
        class215.field2504 = var5.field8942 * var6.field8940 + var5.field8968 * var6.field8968 + var5.field8958 * var6.field8951;
        class461.field6566 = var5.field8942 * var6.field8955 + var5.field8968 * var6.field8944 + var5.field8958 * var6.field8939 + var5.field8944;
        float var15 = (float) this.field8754 * class215.field2504 + class461.field6566;
        float var16 = (float) this.field8683 * class215.field2504 + class461.field6566;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) this.field8744 + var15) * (float) this.field8741.field5997;
            var18 = (var16 - (float) this.field8744) * (float) this.field8741.field5997;
        } else {
            var17 = ((float) this.field8744 + var16) * (float) this.field8741.field5997;
            var18 = ((float) (-this.field8744) + var15) * (float) this.field8741.field5997;
        }
        if ((var18 / (float) arg2 >= this.field8741.field5998) || (this.field8741.field5994 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field8697 != null) {
            class515.field7348 = var5.field8961 * var6.field8959 + var5.field8954 * var6.field8954 + var5.field8951 * var6.field8958;
            class560.field7997 = var5.field8942 * var6.field8962 + var5.field8968 * var6.field8942 + var5.field8958 * var6.field8961;
            class591.field8328 = var5.field8962 * var6.field8962 + var5.field8959 * var6.field8961 + var5.field8940 * var6.field8942;
            class140.field1568 = var5.field8942 * var6.field8959 + var5.field8968 * var6.field8958 + var5.field8958 * var6.field8954;
            class215.field2510 = var5.field8962 * var6.field8959 + var5.field8959 * var6.field8954 + var5.field8940 * var6.field8958;
            class6.field43 = var5.field8961 * var6.field8962 + var5.field8954 * var6.field8961 + var5.field8951 * var6.field8942;
        }
        if (arg1 != null) {
            int var19 = this.field8699 + this.field8694 >> 1;
            int var20 = this.field8720 + this.field8693 >> 1;
            int var21 = (int) ((float) var20 * class6.field43 + (float) this.field8754 * class287.field3521 + (float) var19 * class515.field7348 + class252.field3042);
            int var22 = (int) ((float) var20 * class560.field7997 + (float) this.field8754 * class215.field2504 + (float) var19 * class140.field1568 + class461.field6566);
            int var23 = (int) ((float) var20 * class591.field8328 + (float) this.field8754 * class311.field3862 + (float) var19 * class215.field2510 + class160.field1780);
            int var24 = (int) ((float) var20 * class6.field43 + (float) this.field8683 * class287.field3521 + (float) var19 * class515.field7348 + class252.field3042);
            int var25 = (int) ((float) var20 * class560.field7997 + (float) this.field8683 * class215.field2504 + (float) var19 * class140.field1568 + class461.field6566);
            arg1.field8083 = this.field8741.field5984 * var21 / arg2 + this.field8741.field6002;
            int var26 = (int) ((float) var20 * class591.field8328 + (float) this.field8683 * class311.field3862 + (float) var19 * class215.field2510 + class160.field1780);
            arg1.field8086 = this.field8741.field5997 * var25 / arg2 + this.field8741.field6044;
            arg1.field8081 = this.field8741.field5984 * var24 / arg2 + this.field8741.field6002;
            arg1.field8085 = this.field8741.field5997 * var22 / arg2 + this.field8741.field6044;
            if (var23 >= this.field8741.field6039 || this.field8741.field6039 <= var26) {
                arg1.field8082 = true;
                arg1.field8084 = (var21 + this.field8744) * this.field8741.field5984 / arg2 + this.field8741.field6002 - arg1.field8083;
            }
        }
        this.field8741.method2574((float) arg2, true);
        this.field8741.method2557((byte) -57);
        this.field8741.method2628((byte) -107, var6);
        this.method3459(true);
        this.field8741.method2561((byte) 118);
        this.method3457(false);
    }

    @OriginalMember(owner = "client!lea", name = "FA", descriptor = "(I)V", line = 1853)
    public final void method204(int arg0) {
        field8733++;
        int var2 = class260.field3230[arg0];
        int var3 = class260.field3229[arg0];
        for (int var4 = 0; var4 < this.field8656; var4++) {
            int var5 = this.field8750[var4] * var3 - (this.field8740[var4] * var2) >> 14;
            this.field8740[var4] = this.field8750[var4] * var2 + this.field8740[var4] * var3 >> 14;
            this.field8750[var4] = var5;
        }
        if (this.field8722 != null) {
            this.field8722.field9914 = null;
        }
        this.field8670 = false;
    }

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "(III)V", line = 1882)
    public final void method195(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8656; var4++) {
            if (arg0 != 0) {
                this.field8742[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field8750[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field8740[var4] += arg2;
            }
        }
        field8678++;
        if (this.field8722 != null) {
            this.field8722.field9914 = null;
        }
        this.field8670 = false;
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(IZ)V", line = 1916)
    private final void method3452(int arg0, boolean arg1) {
        if (this.field8702 * 6 <= this.field8741.field6059.field2912.length) {
            this.field8741.field6059.field2903 = 0;
        } else {
            this.field8741.field6059 = new class685((this.field8702 + 100) * 6);
        }
        field8715++;
        class685 var3 = this.field8741.field6059;
        if (this.field8741.field5992) {
            for (int var4 = 0; var4 < this.field8702; var4++) {
                var3.method1446(this.field8737[var4], true);
                var3.method1446(this.field8745[var4], true);
                var3.method1446(this.field8692[var4], true);
            }
        } else {
            for (int var5 = 0; var5 < this.field8702; var5++) {
                var3.method1432(this.field8737[var5], (byte) -100);
                var3.method1432(this.field8745[var5], (byte) 123);
                var3.method1432(this.field8692[var5], (byte) 126);
            }
        }
        if (arg0 <= 102) {
            this.method3460(null, true);
        }
        if (var3.field2903 == 0) {
            return;
        }
        if (arg1) {
            if (this.field8758 == null) {
                this.field8758 = this.field8741.method2608(5123, var3.field2903, 2, true, var3.field2912);
            } else {
                this.field8758.method919(var3.field2912, var3.field2903, 6748, 5123);
            }
            this.field8700.field2494 = this.field8758;
        } else {
            this.field8700.field2494 = this.field8741.method2608(5123, var3.field2903, 2, false, var3.field2912);
        }
        if (!arg1) {
            this.field8681 = true;
        }
    }

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "(I[IIIIZI[I)V", line = 1982)
    public final void method198(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field8648++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            int var13 = 0;
            class659.field9410 = 0;
            class255.field3120 = 0;
            class592.field8347 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field8662.length > var15) {
                    int[] var16 = this.field8662[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field8689 == null || (this.field8689[var18] & arg6) != 0) {
                            class255.field3120 += this.field8742[var18];
                            class592.field8347 += this.field8750[var18];
                            var13++;
                            class659.field9410 += this.field8740[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class659.field9410 = class659.field9410 / var13 + var10;
                class592.field8347 = class592.field8347 / var13 + var12;
                class255.field3120 = class255.field3120 / var13 + var11;
                class532.field7624 = true;
            } else {
                class659.field9410 = var10;
                class592.field8347 = var12;
                class255.field3120 = var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + (arg7[1] * arg3 - (-(arg7[2] * arg4) - 8192)) >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field8662.length > var26) {
                    int[] var27 = this.field8662[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field8689 == null || (this.field8689[var29] & arg6) != 0) {
                            this.field8742[var29] += var23;
                            this.field8750[var29] += var22;
                            this.field8740[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field8662.length) {
                        int[] var110 = this.field8662[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field8689 == null || (this.field8689[var112] & arg6) != 0) {
                                this.field8742[var112] -= class255.field3120;
                                this.field8750[var112] -= class592.field8347;
                                this.field8740[var112] -= class659.field9410;
                                if (arg4 != 0) {
                                    int var113 = class260.field3230[arg4];
                                    int var114 = class260.field3229[arg4];
                                    int var115 = this.field8750[var112] * var113 + this.field8742[var112] * var114 + 16383 >> 14;
                                    this.field8750[var112] = this.field8750[var112] * var114 + 16383 - (this.field8742[var112] * var113) >> 14;
                                    this.field8742[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class260.field3230[arg2];
                                    int var117 = class260.field3229[arg2];
                                    int var118 = this.field8750[var112] * var117 + 16383 - this.field8740[var112] * var116 >> 14;
                                    this.field8740[var112] = this.field8750[var112] * var116 + this.field8740[var112] * var117 + 16383 >> 14;
                                    this.field8750[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class260.field3230[arg3];
                                    int var120 = class260.field3229[arg3];
                                    int var121 = this.field8742[var112] * var120 + this.field8740[var112] * var119 + 16383 >> 14;
                                    this.field8740[var112] = this.field8740[var112] * var120 + 16383 - this.field8742[var112] * var119 >> 14;
                                    this.field8742[var112] = var121;
                                }
                                this.field8742[var112] += class255.field3120;
                                this.field8750[var112] += class592.field8347;
                                this.field8740[var112] += class659.field9410;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field8662.length > var92) {
                            int[] var93 = this.field8662[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field8689 == null || (this.field8689[var95] & arg6) != 0) {
                                    int var96 = this.field8653[var95];
                                    int var97 = this.field8653[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field8718[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class260.field3230[arg4];
                                            int var101 = class260.field3229[arg4];
                                            int var102 = this.field8658[var99] * var101 + this.field8667[var99] * var100 + 16383 >> 14;
                                            this.field8667[var99] = (short) (this.field8667[var99] * var101 + 16383 - (this.field8658[var99] * var100) >> 14);
                                            this.field8658[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class260.field3230[arg2];
                                            int var104 = class260.field3229[arg2];
                                            int var105 = this.field8667[var99] * var104 + 16383 - this.field8728[var99] * var103 >> 14;
                                            this.field8728[var99] = (short) (this.field8667[var99] * var103 + this.field8728[var99] * var104 + 16383 >> 14);
                                            this.field8667[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class260.field3230[arg3];
                                            int var107 = class260.field3229[arg3];
                                            int var108 = this.field8728[var99] * var106 + this.field8658[var99] * var107 + 16383 >> 14;
                                            this.field8728[var99] = (short) (this.field8728[var99] * var107 + 16383 - (this.field8658[var99] * var106) >> 14);
                                            this.field8658[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field8673 == null && this.field8717 != null) {
                        this.field8717.field9914 = null;
                    }
                    if (this.field8673 != null) {
                        this.field8673.field9914 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class532.field7624) {
                    int var36 = arg7[6] * class659.field9410 + arg7[3] * class592.field8347 + arg7[0] * class255.field3120 + 8192 >> 14;
                    int var37 = arg7[1] * class255.field3120 + arg7[4] * class592.field8347 + arg7[7] * class659.field9410 + 8192 >> 14;
                    int var38 = arg7[5] * class592.field8347 + arg7[2] * class255.field3120 + arg7[8] * class659.field9410 + 8192 >> 14;
                    int var39 = var34 + var37;
                    int var40 = var33 + var36;
                    int var41 = var35 + var38;
                    class255.field3120 = var40;
                    class592.field8347 = var39;
                    class532.field7624 = false;
                    class659.field9410 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class260.field3229[arg2];
                int var44 = class260.field3230[arg2];
                int var45 = class260.field3229[arg3];
                int var46 = class260.field3230[arg3];
                int var47 = class260.field3229[arg4];
                int var48 = class260.field3230[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[5] = -var44;
                var42[7] = var45 * var49 + var46 * var48 + 8192 >> 14;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                int var51 = var42[1] * -class592.field8347 + var42[2] * -class659.field9410 + var42[0] * -class255.field3120 + 8192 >> 14;
                int var52 = var42[5] * -class659.field9410 + var42[4] * -class592.field8347 + var42[3] * -class255.field3120 + 8192 >> 14;
                int var53 = var42[6] * -class255.field3120 + (var42[7] * -class592.field8347) - (-(var42[8] * -class659.field9410) - 8192) >> 14;
                int var54 = class255.field3120 + var51;
                int var55 = class592.field8347 + var52;
                int var56 = class659.field9410 + var53;
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
                int var62 = var42[6] * var33 - (-(var42[7] * var34) - var42[8] * var35 - 8192) >> 14;
                int var63 = var55 + var60;
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
                int var67 = arg7[2] * var64 + arg7[0] * var61 + (arg7[1] * var63) + 8192 >> 14;
                int var68 = arg7[5] * var64 + (arg7[3] * var61 + (arg7[4] * var63)) + 8192 >> 14;
                int var69 = arg7[8] * var64 + arg7[7] * var63 + arg7[6] * var61 + 8192 >> 14;
                int var70 = var31 + var68;
                int var71 = var30 + var67;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field8662.length > var74) {
                        int[] var75 = this.field8662[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field8689 == null || (arg6 & this.field8689[var77]) != 0) {
                                int var78 = this.field8750[var77] * var65[1] + this.field8740[var77] * var65[2] + this.field8742[var77] * var65[0] + 8192 >> 14;
                                int var79 = this.field8740[var77] * var65[5] + (this.field8742[var77] * var65[3] + (this.field8750[var77] * var65[4])) + 8192 >> 14;
                                int var80 = var71 + var78;
                                int var81 = this.field8740[var77] * var65[8] + this.field8742[var77] * var65[6] + this.field8750[var77] * var65[7] + 8192 >> 14;
                                int var82 = var70 + var79;
                                this.field8742[var77] = var80;
                                int var83 = var72 + var81;
                                this.field8750[var77] = var82;
                                this.field8740[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field8662.length) {
                        int[] var174 = this.field8662[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field8689 == null || (arg6 & this.field8689[var176]) != 0) {
                                this.field8742[var176] -= class255.field3120;
                                this.field8750[var176] -= class592.field8347;
                                this.field8740[var176] -= class659.field9410;
                                this.field8742[var176] = this.field8742[var176] * arg2 >> 7;
                                this.field8750[var176] = this.field8750[var176] * arg3 >> 7;
                                this.field8740[var176] = this.field8740[var176] * arg4 >> 7;
                                this.field8742[var176] += class255.field3120;
                                this.field8750[var176] += class592.field8347;
                                this.field8740[var176] += class659.field9410;
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
                if (class532.field7624) {
                    int var128 = arg7[3] * class592.field8347 + arg7[0] * class255.field3120 + arg7[6] * class659.field9410 + 8192 >> 14;
                    int var129 = arg7[7] * class659.field9410 + (arg7[1] * class255.field3120 + (arg7[4] * class592.field8347) + 8192) >> 14;
                    int var130 = arg7[5] * class592.field8347 + arg7[2] * class255.field3120 + arg7[8] * class659.field9410 + 8192 >> 14;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    class592.field8347 = var132;
                    class255.field3120 = var131;
                    class659.field9410 = var133;
                    class532.field7624 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class255.field3120 * var134 + 8192 >> 14;
                int var138 = -class592.field8347 * var135 + 8192 >> 14;
                int var139 = -class659.field9410 * var136 + 8192 >> 14;
                int var140 = var137 + class255.field3120;
                int var141 = class592.field8347 + var138;
                int var142 = class659.field9410 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var127 * var136 + 8192 >> 14;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += var143[var169 + (var171 * 3)] * arg7[var151 * 3 + var171];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[2] * var149 + arg7[1] * var148 + arg7[0] * var147 + 8192 >> 14;
                int var153 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 8192 >> 14;
                int var154 = arg7[7] * var148 + arg7[6] * var147 - (-(arg7[8] * var149) - 8192) >> 14;
                int var155 = var122 + var152;
                int var156 = var123 + var153;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field8662.length) {
                        int[] var160 = this.field8662[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field8689 == null || (this.field8689[var162] & arg6) != 0) {
                                int var163 = this.field8740[var162] * var150[2] + this.field8750[var162] * var150[1] + this.field8742[var162] * var150[0] + 8192 >> 14;
                                int var164 = this.field8740[var162] * var150[5] + this.field8750[var162] * var150[4] + this.field8742[var162] * var150[3] + 8192 >> 14;
                                int var165 = var156 + var164;
                                int var166 = this.field8740[var162] * var150[8] + this.field8750[var162] * var150[7] + this.field8742[var162] * var150[6] + 8192 >> 14;
                                int var167 = var155 + var163;
                                this.field8742[var162] = var167;
                                int var168 = var157 + var166;
                                this.field8750[var162] = var165;
                                this.field8740[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8753 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field8753.length) {
                        int[] var182 = this.field8753[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field8665 == null || (this.field8665[var184] & arg6) != 0) {
                                int var185 = (this.field8739[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field8739[var184] = (byte) var185;
                                if (this.field8717 != null) {
                                    this.field8717.field9914 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8697 != null) {
                    for (int var178 = 0; var178 < this.field8749; var178++) {
                        class647 var179 = this.field8697[var178];
                        class43 var180 = this.field8762[var178];
                        var180.field487 = var180.field487 & 0xFFFFFF | 255 - (this.field8739[var179.field9258] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8753 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field8753.length) {
                        int[] var191 = this.field8753[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field8665 == null || (arg6 & this.field8665[var193]) != 0) {
                                int var194 = this.field8725[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFE83) >> 10;
                                int var196 = (var194 & 0x3B7) >> 7;
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
                                this.field8725[var193] = (short) class695.method3919(class695.method3919(var198 << 10, var199 << 7), var200);
                                if (this.field8717 != null) {
                                    this.field8717.field9914 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field8697 != null) {
                    for (int var187 = 0; var187 < this.field8749; var187++) {
                        class647 var188 = this.field8697[var187];
                        class43 var189 = this.field8762[var187];
                        var189.field487 = class721.field10115[this.field8725[var188.field9258] & 0xFFFF] & 0xFFFFFF | var189.field487 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8707 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field8707.length > var202) {
                        int[] var203 = this.field8707[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class43 var205 = this.field8762[var203[var204]];
                            var205.field483 += arg2;
                            var205.field478 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8707 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field8707.length > var207) {
                        int[] var208 = this.field8707[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class43 var210 = this.field8762[var208[var209]];
                            var210.field484 = var210.field484 * arg2 >> 7;
                            var210.field477 = var210.field477 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8707 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field8707.length) {
                    int[] var213 = this.field8707[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class43 var215 = this.field8762[var213[var214]];
                        var215.field480 = var215.field480 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "()Z", line = 2974)
    public final boolean method200() {
        field8726++;
        if (this.field8751 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field8751.length; var1++) {
            if (this.field8751[var1] != -1 && !this.field8741.field578.method929(15715, this.field8751[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ldfa;IZ)V", line = 2998)
    public final void method210(class165 arg0, int arg1, boolean arg2) {
        field8684++;
        if (this.field8689 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field8656; var5++) {
            if ((arg1 & this.field8689[var5]) != 0) {
                if (arg2) {
                    arg0.method1020(this.field8742[var5], this.field8750[var5], this.field8740[var5], var4);
                } else {
                    arg0.method1030(this.field8742[var5], this.field8750[var5], this.field8740[var5], var4);
                }
                this.field8742[var5] = var4[0];
                this.field8750[var5] = var4[1];
                this.field8740[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIFIJIIFLuk;)S", line = 3036)
    private final short method3453(int arg0, int arg1, int arg2, float arg3, int arg4, long arg5, int arg6, int arg7, float arg8, class260 arg9) {
        field8723++;
        if (arg2 <= 2) {
            this.field8665 = null;
        }
        int var12 = this.field8653[arg7];
        int var13 = this.field8653[arg7 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field8718[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class560.field7994[var15] == arg5) {
                return (short) (var16 - 1);
            }
        }
        this.field8718[var14] = (short) (this.field8655 + 1);
        class560.field7994[var14] = arg5;
        this.field8658[this.field8655] = (short) arg0;
        this.field8667[this.field8655] = (short) arg6;
        this.field8728[this.field8655] = (short) arg4;
        this.field8679[this.field8655] = (byte) arg1;
        this.field8651[this.field8655] = arg8;
        this.field8668[this.field8655] = arg3;
        return (short) (this.field8655++);
    }

    @OriginalMember(owner = "client!lea", name = "HA", descriptor = "()I", line = 3082)
    public final int method238() {
        if (!this.field8670) {
            this.method3451(-32768);
        }
        field8649++;
        return this.field8693;
    }

    @OriginalMember(owner = "client!lea", name = "na", descriptor = "()I", line = 3097)
    public final int method203() {
        field8729++;
        if (!this.field8670) {
            this.method3451(-32768);
        }
        return this.field8744;
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "()[Loia;", line = 3110)
    public final class88[] method186() {
        field8747++;
        return this.field8688;
    }

    @OriginalMember(owner = "client!lea", name = "aa", descriptor = "(SS)V", line = 3118)
    public final void method192(short arg0, short arg1) {
        field8701++;
        class150 var3 = this.field8741.field578;
        for (int var4 = 0; var4 < this.field8716; var4++) {
            if (this.field8751[var4] == arg0) {
                this.field8751[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class298 var7 = var3.method931(arg0 & 0xFFFF, true);
            var5 = var7.field3696;
            var6 = var7.field3709;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class298 var10 = var3.method931(arg1 & 0xFFFF, true);
            var8 = var10.field3696;
            if (var10.field3704 != 0 || var10.field3699 != 0) {
                this.field8752 = true;
            }
            var9 = var10.field3709;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field8697 != null) {
            for (int var11 = 0; var11 < this.field8749; var11++) {
                class647 var12 = this.field8697[var11];
                class43 var13 = this.field8762[var11];
                var13.field487 = var13.field487 & 0xFF000000 | class721.field10115[this.field8725[var12.field9258] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field8717 != null) {
            this.field8717.field9914 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(BIZ)Lka;", line = 3196)
    public final class470 method237(byte arg0, int arg1, boolean arg2) {
        field8764++;
        class610 var4;
        class610 var5;
        if (arg0 == 1) {
            var4 = this.field8741.field6036;
            var5 = this.field8741.field5977;
        } else if (arg0 == 2) {
            var4 = this.field8741.field6001;
            var5 = this.field8741.field6015;
        } else if (arg0 == 3) {
            var5 = this.field8741.field6004;
            var4 = this.field8741.field6016;
        } else if (arg0 == 4) {
            var5 = this.field8741.field6035;
            var4 = this.field8741.field5979;
        } else if (arg0 == 5) {
            var4 = this.field8741.field5955;
            var5 = this.field8741.field5954;
        } else {
            var5 = var4 = new class610(this.field8741);
        }
        return this.method3461(arg1, arg2, arg0 != 0, var5, var4, 65);
    }

    @OriginalMember(owner = "client!lea", name = "VA", descriptor = "(I)V", line = 3244)
    public final void method214(int arg0) {
        field8660++;
        int var2 = class260.field3230[arg0];
        int var3 = class260.field3229[arg0];
        for (int var4 = 0; var4 < this.field8656; var4++) {
            int var5 = this.field8750[var4] * var2 + this.field8742[var4] * var3 >> 14;
            this.field8750[var4] = this.field8750[var4] * var3 - (this.field8742[var4] * var2) >> 14;
            this.field8742[var4] = var5;
        }
        this.field8670 = false;
        if (this.field8722 != null) {
            this.field8722.field9914 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "()V", line = 3273)
    public final void method233() {
        for (int var1 = 0; var1 < this.field8656; var1++) {
            this.field8740[var1] = -this.field8740[var1];
        }
        field8646++;
        for (int var2 = 0; var2 < this.field8655; var2++) {
            this.field8728[var2] = (short) (-this.field8728[var2]);
        }
        for (int var3 = 0; var3 < this.field8716; var3++) {
            short var4 = this.field8737[var3];
            this.field8737[var3] = this.field8692[var3];
            this.field8692[var3] = var4;
        }
        if (this.field8673 == null && this.field8717 != null) {
            this.field8717.field9914 = null;
        }
        if (this.field8673 != null) {
            this.field8673.field9914 = null;
        }
        this.field8670 = false;
        if (this.field8722 != null) {
            this.field8722.field9914 = null;
        }
        if (this.field8700 != null) {
            this.field8700.field2494 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "V", descriptor = "()I", line = 3338)
    public final int method221() {
        field8659++;
        if (!this.field8670) {
            this.method3451(-32768);
        }
        return this.field8699;
    }

    @OriginalMember(owner = "client!lea", name = "fa", descriptor = "()I", line = 3350)
    public final int method190() {
        if (!this.field8670) {
            this.method3451(-32768);
        }
        field8756++;
        return this.field8754;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IISIB)I", line = 3362)
    private final int method3454(int arg0, int arg1, short arg2, int arg3, byte arg4) {
        if (arg0 != 3) {
            this.field8679 = null;
        }
        field8761++;
        int var6 = class721.field10115[class70.method516(-1614, arg3, arg1)];
        if (arg2 != -1) {
            class298 var7 = this.field8741.field578.method931(arg2 & 0xFFFF, true);
            int var8 = var7.field3696 & 0xFF;
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
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field3709 & 0xFF;
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
                var6 = (var15 >> 8) + ((var13 & 0xC700FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + (255 - (arg4 & 0xFF));
    }

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "()Z", line = 3456)
    public final boolean method197() {
        field8731++;
        return this.field8748;
    }

    @OriginalMember(owner = "client!lea", name = "O", descriptor = "(III)V", line = 3467)
    public final void method232(int arg0, int arg1, int arg2) {
        field8677++;
        for (int var4 = 0; var4 < this.field8656; var4++) {
            if (arg0 != 128) {
                this.field8742[var4] = this.field8742[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field8750[var4] = this.field8750[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field8740[var4] = this.field8740[var4] * arg2 >> 7;
            }
        }
        this.field8670 = false;
        if (this.field8722 != null) {
            this.field8722.field9914 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ldfa;ZIIIII)Z", line = 3500)
    private final boolean method3455(class165 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8645++;
        class624 var8 = (class624) arg0;
        class624 var9 = this.field8741.field5943;
        float var10 = var8.field8955 * var9.field8961 + var8.field8944 * var9.field8951 + var8.field8939 * var9.field8954 + var9.field8939;
        float var11 = var8.field8955 * var9.field8942 + var8.field8944 * var9.field8968 + var8.field8939 * var9.field8958 + var9.field8944;
        class560.field7997 = var8.field8962 * var9.field8942 + var8.field8961 * var9.field8958 + var8.field8942 * var9.field8968;
        class140.field1568 = var8.field8959 * var9.field8942 + var8.field8958 * var9.field8968 + var8.field8954 * var9.field8958;
        class6.field43 = var8.field8962 * var9.field8961 + var8.field8961 * var9.field8954 + var8.field8942 * var9.field8951;
        class591.field8328 = var8.field8962 * var9.field8962 + var8.field8961 * var9.field8959 + var8.field8942 * var9.field8940;
        class215.field2510 = var8.field8959 * var9.field8962 + var8.field8958 * var9.field8940 + var8.field8954 * var9.field8959;
        class311.field3862 = var8.field8940 * var9.field8962 + var8.field8968 * var9.field8940 + var8.field8951 * var9.field8959;
        class515.field7348 = var8.field8959 * var9.field8961 + var8.field8958 * var9.field8951 + var8.field8954 * var9.field8954;
        float var12 = var8.field8955 * var9.field8962 + var8.field8944 * var9.field8940 + var8.field8939 * var9.field8959 + var9.field8955;
        class215.field2504 = var8.field8940 * var9.field8942 + var8.field8968 * var9.field8968 + var8.field8951 * var9.field8958;
        class287.field3521 = var8.field8940 * var9.field8961 + var8.field8968 * var9.field8951 + var8.field8951 * var9.field8954;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field8741.field5984;
        if (arg5 != -28600) {
            this.field8740 = null;
        }
        int var19 = this.field8741.field5997;
        if (!this.field8670) {
            this.method3451(arg5 - 4168);
        }
        int var20 = this.field8694 - this.field8699 >> 1;
        int var21 = this.field8683 - this.field8754 >> 1;
        int var22 = this.field8720 - this.field8693 >> 1;
        int var23 = this.field8699 + var20;
        int var24 = this.field8754 + var21;
        int var25 = this.field8693 + var22;
        int var26 = var23 - (var20 << arg4);
        int var27 = var24 - (var21 << arg4);
        int var28 = var25 - (var22 << arg4);
        int var29 = (var20 << arg4) + var23;
        int var30 = var24 + (var21 << arg4);
        int var31 = var25 + (var22 << arg4);
        class233.field2755[0] = var26;
        class660.field9428[0] = var27;
        class233.field2755[1] = var29;
        class174.field2056[0] = var28;
        class660.field9428[1] = var27;
        class233.field2755[2] = var26;
        class174.field2056[1] = var28;
        class660.field9428[2] = var30;
        class233.field2755[3] = var29;
        class174.field2056[2] = var28;
        class660.field9428[3] = var30;
        class233.field2755[4] = var26;
        class174.field2056[3] = var28;
        class660.field9428[4] = var27;
        class233.field2755[5] = var29;
        class174.field2056[4] = var31;
        class660.field9428[5] = var27;
        class174.field2056[5] = var31;
        class233.field2755[6] = var26;
        class660.field9428[6] = var30;
        class233.field2755[7] = var29;
        class174.field2056[6] = var31;
        class660.field9428[7] = var30;
        class174.field2056[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class233.field2755[var32];
            float var54 = (float) class174.field2056[var32];
            float var55 = (float) class660.field9428[var32];
            float var56 = class591.field8328 * var54 + class311.field3862 * var55 + class215.field2510 * var53 + var12;
            float var57 = class560.field7997 * var54 + class215.field2504 * var55 + class140.field1568 * var53 + var11;
            float var58 = class6.field43 * var54 + class515.field7348 * var53 + class287.field3521 * var55 + var10;
            if (var56 >= (float) this.field8741.field6039) {
                if (arg2 > 0) {
                    var56 = arg2;
                }
                float var59 = (float) var18 * var58 / var56 + (float) this.field8741.field6002;
                float var60 = (float) var19 * var57 / var56 + (float) this.field8741.field6044;
                if (var59 < var14) {
                    var14 = var59;
                }
                if (var59 > var15) {
                    var15 = var59;
                }
                var13 = true;
                if (var60 > var17) {
                    var17 = var60;
                }
                if (var16 > var60) {
                    var16 = var60;
                }
            }
        }
        if (var13 && var14 < (float) arg3 && (float) arg3 < var15 && var16 < (float) arg6 && (float) arg6 < var17) {
            if (arg1) {
                return true;
            }
            if (this.field8655 > this.field8741.field6064.length) {
                this.field8741.field6064 = new int[this.field8655];
                this.field8741.field6063 = new int[this.field8655];
            }
            int[] var33 = this.field8741.field6064;
            int[] var34 = this.field8741.field6063;
            for (int var35 = 0; var35 < this.field8656; var35++) {
                float var37 = (float) this.field8750[var35];
                float var38 = (float) this.field8742[var35];
                float var39 = (float) this.field8740[var35];
                float var40 = class6.field43 * var39 + class515.field7348 * var38 + class287.field3521 * var37 + var10;
                float var41 = class591.field8328 * var39 + class311.field3862 * var37 + class215.field2510 * var38 + var12;
                float var42 = class560.field7997 * var39 + class215.field2504 * var37 + class140.field1568 * var38 + var11;
                if (var41 >= (float) this.field8741.field6039) {
                    if (arg2 > 0) {
                        var41 = arg2;
                    }
                    int var43 = (int) ((float) var18 * var40 / var41 + (float) this.field8741.field6002);
                    int var44 = (int) ((float) var19 * var42 / var41 + (float) this.field8741.field6044);
                    int var45 = this.field8653[var35];
                    int var46 = this.field8653[var35 + 1];
                    for (int var47 = var45; var47 < var46; var47++) {
                        int var48 = this.field8718[var47] - 1;
                        if (var48 == -1) {
                            break;
                        }
                        var33[var48] = var43;
                        var34[var48] = var44;
                    }
                } else {
                    int var49 = this.field8653[var35];
                    int var50 = this.field8653[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field8718[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[this.field8718[var51] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field8716; var36++) {
                if (var33[this.field8737[var36]] != -999999 && var33[this.field8745[var36]] != -999999 && var33[this.field8692[var36]] != -999999 && this.method3458(var34[this.field8745[var36]], var34[this.field8692[var36]], arg6, (byte) -25, var33[this.field8745[var36]], arg3, var33[this.field8692[var36]], var33[this.field8737[var36]], var34[this.field8737[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "()V", line = 3743)
    public final void method189() {
        field8710++;
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "()V", line = 3752)
    public final void method199() {
        field8755++;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lso;B)V", line = 3759)
    public static final void method3456(class468 arg0, byte arg1) {
        field8760++;
        if (class38.field430 == arg0) {
            int var2 = class248.field3008.method1443(-1);
            int var3 = class248.field3008.method1425((byte) 18);
            int var4 = (var3 & 0x7) + class233.field2732;
            int var5 = var4 + class181.field2144;
            int var6 = ((var3 & 0x73) >> 4) + class615.field8821;
            int var7 = class464.field6624 + var6;
            int var8 = class248.field3008.method1439((byte) 94);
            int var9 = class248.field3008.method1439((byte) -53);
            if (class701.field9893 != var9) {
                boolean var10 = var6 >= 0 && var4 >= 0 && var6 < class489.field6976 && var4 < class153.field1677;
                if (var10 || class217.method1269(class614.field8787, (byte) -112)) {
                    class567.method3297(var5, new class602(var8, var2), class682.field9648, 24688, var7);
                    if (var10) {
                        class256.method1525((byte) 4, var4, class682.field9648, var6);
                    }
                }
            }
        } else if (class28.field308 == arg0) {
            int var11 = class248.field3008.method1423(-18);
            int var12 = ((var11 & 0xFA) >> 4) + class615.field8821 * 2;
            int var13 = class233.field2732 * 2 + (var11 & 0xF);
            int var14 = class248.field3008.method1423(-12);
            boolean var15 = (var14 & 0x1) != 0;
            boolean var16 = (var14 & 0x2) != 0;
            int var17 = var16 ? var14 >> 2 : -1;
            int var18 = class248.field3008.method1448((byte) -91) + var12;
            int var19 = class248.field3008.method1448((byte) -117) + var13;
            int var20 = class248.field3008.method1466((byte) 31);
            int var21 = class248.field3008.method1466((byte) 31);
            int var22 = class248.field3008.method1476(-85);
            int var23 = class248.field3008.method1423(-21);
            int var24;
            if (var16) {
                var24 = (byte) var23;
            } else {
                var24 = var23 * 4;
            }
            int var25 = class248.field3008.method1423(-124) * 4;
            int var26 = class248.field3008.method1476(123);
            int var27 = class248.field3008.method1476(120);
            int var28 = class248.field3008.method1423(-52);
            if (var28 == 255) {
                var28 = -1;
            }
            int var29 = class248.field3008.method1476(110);
            if (var12 >= 0 && var13 >= 0 && class489.field6976 * 2 > var12 && class489.field6976 * 2 > var13 && var18 >= 0 && var19 >= 0 && class153.field1677 * 2 > var18 && var19 < class153.field1677 * 2 && var22 != 65535) {
                int var30 = var24 << 2;
                int var31 = var12 * 256;
                int var32 = var29 << 2;
                int var33 = var19 * 256;
                int var34 = var25 << 2;
                int var35 = var18 * 256;
                int var36 = var13 * 256;
                if (var20 != 0 && var17 != -1) {
                    class504 var37 = null;
                    if (var20 >= 0) {
                        int var38 = var20 - 1;
                        class151 var39 = (class151) class253.field3052.method1754(false, (long) var38);
                        if (var39 != null) {
                            var37 = var39.field1661;
                        }
                    } else {
                        int var40 = -var20 - 1;
                        if (class701.field9893 == var40) {
                            var37 = class90.field937;
                        } else {
                            var37 = class75.field792[var40];
                        }
                    }
                    if (var37 != null) {
                        class255 var41 = var37.method2992(-1);
                        if (var41.field3070 != null && var41.field3070[var17] != null) {
                            var30 -= var41.field3070[var17][1];
                        }
                        if (var41.field3099 != null && var41.field3099[var17] != null) {
                            var30 -= var41.field3099[var17][1];
                        }
                    }
                }
                class172 var42 = new class172(var22, class682.field9648, class682.field9648, var31, var36, var30, var26 + class392.field5398, class392.field5398 + var27, var28, var32, var20, var21, var34, var15, var17);
                var42.method1065(var35, var26 + class392.field5398, var33, (byte) -89, class676.method3845(var33, var35, 0, class682.field9648) - var34);
                class395.field5414.method1721((byte) -51, new class114(var42));
            }
        } else if (class743.field10377 == arg0) {
            int var43 = class248.field3008.method1423(-18);
            int var44 = (var43 & 0x7) + class233.field2732;
            int var45 = var44 + class181.field2144;
            int var46 = (var43 >> 4 & 0x7) + class615.field8821;
            int var47 = var46 + class464.field6624;
            int var48 = class248.field3008.method1476(70);
            int var49 = class248.field3008.method1476(-114);
            int var50 = class248.field3008.method1476(-76);
            if (class450.field6490 != null) {
                class723 var51 = (class723) class450.field6490.method1754(false, (long) (var45 << 14 | class682.field9648 << 28 | var47));
                if (var51 != null) {
                    for (class602 var52 = (class602) var51.field10131.method1719(65280); var52 != null; var52 = (class602) var51.field10131.method1723(-20665)) {
                        if ((var48 & 0x7FFF) == var52.field8567 && var52.field8568 == var49) {
                            var52.method864(12983);
                            var52.field8568 = var50;
                            class567.method3297(var45, var52, class682.field9648, 24688, var47);
                            break;
                        }
                    }
                    if (var46 >= 0 && var44 >= 0 && class489.field6976 > var46 && class153.field1677 > var44) {
                        class256.method1525((byte) -127, var44, class682.field9648, var46);
                    }
                }
            }
        } else if (class339.field4365 == arg0) {
            int var53 = class248.field3008.method1425((byte) 18);
            int var54 = ((var53 & 0x70) >> 4) + class615.field8821;
            int var55 = (var53 & 0x7) + class233.field2732;
            int var56 = class248.field3008.method1450(-127);
            int var57 = var56 >> 2;
            int var58 = var56 & 0x3;
            int var59 = class96.field1016[var57];
            if (class217.method1269(class614.field8787, (byte) -127) || var54 >= 0 && var55 >= 0 && class489.field6976 > var54 && var55 < class153.field1677) {
                class311.method1851(-1, 0, var59, var54, -18898, class682.field9648, var57, -1, var55, var58);
            }
        } else if (class3.field26 == arg0) {
            int var60 = class248.field3008.method1476(18);
            int var61 = class248.field3008.method1423(-70);
            class445.field6442.method3972((byte) 118, var60).method1893(5410, var61);
        } else if (class496.field7010 == arg0) {
            class248.field3008.method1423(-60);
            int var62 = class248.field3008.method1423(-104);
            int var63 = ((var62 & 0x79) >> 4) + class615.field8821;
            int var64 = (var62 & 0x7) + class233.field2732;
            int var65 = class248.field3008.method1476(35);
            int var66 = class248.field3008.method1423(-86);
            int var67 = class248.field3008.method1458((byte) 70);
            String var68 = class248.field3008.method1468(-1468860088);
            class43.method255(var65, var67, class682.field9648, var64, var66, var63, var68, 84);
        } else if (class92.field948 == arg0) {
            int var69 = class248.field3008.method1423(-84);
            int var70 = ((var69 & 0x79) >> 4) + class615.field8821;
            int var71 = (var69 & 0x7) + class233.field2732;
            int var72 = class248.field3008.method1476(90);
            if (var72 == 65535) {
                var72 = -1;
            }
            int var73 = class248.field3008.method1423(-56);
            int var74 = var73 >> 4 & 0xF;
            int var75 = var73 & 0x7;
            int var76 = class248.field3008.method1423(-25);
            int var77 = class248.field3008.method1423(-86);
            int var78 = class248.field3008.method1476(110);
            if (var70 >= 0 && var71 >= 0 && class489.field6976 > var70 && class153.field1677 > var71) {
                int var79 = var74 + 1;
                if ((var70 - var79) <= class90.field937.field7187[0] && var70 + var79 >= class90.field937.field7187[0] && var71 - var79 <= class90.field937.field7193[0] && var71 + var79 >= class90.field937.field7193[0]) {
                    class212.method1258(var77, var78, 127, (var71 << 8) + (var70 << 16) + ((class682.field9648 << 24) - -var74), false, var72, var76, var75);
                }
            }
        } else if (class486.field6970 == arg0) {
            int var80 = class248.field3008.method1474((byte) 91);
            if (var80 == 65535) {
                var80 = -1;
            }
            int var81 = class248.field3008.method1425((byte) 18);
            int var82 = var81 >> 2;
            int var83 = var81 & 0x3;
            int var84 = class96.field1016[var82];
            int var85 = class248.field3008.method1423(-47);
            int var86 = class615.field8821 + (var85 >> 4 & 0x7);
            int var87 = (var85 & 0x7) + class233.field2732;
            class501.method2977(var80, var86, class682.field9648, var82, var84, 0, var83, var87);
        } else if (class685.field9682 == arg0) {
            int var88 = class248.field3008.method1423(-36);
            int var89 = class615.field8821 + (var88 >> 4 & 0x7);
            int var90 = (var88 & 0x7) + class233.field2732;
            int var91 = class248.field3008.method1476(-77);
            if (var91 == 65535) {
                var91 = -1;
            }
            int var92 = class248.field3008.method1423(-58);
            int var93 = (var92 & 0xFB) >> 4;
            int var94 = var92 & 0x7;
            int var95 = class248.field3008.method1423(-88);
            int var96 = class248.field3008.method1423(-80);
            int var97 = class248.field3008.method1476(-82);
            if (var89 >= 0 && var90 >= 0 && var89 < class489.field6976 && var90 < class153.field1677) {
                int var98 = var93 + 1;
                if (class90.field937.field7187[0] >= var89 - var98 && class90.field937.field7187[0] <= var89 + var98 && (var90 - var98) <= class90.field937.field7193[0] && class90.field937.field7193[0] <= (var90 + var98)) {
                    class643.method3666(var91, false, var94, var95, (var90 << 8) + ((class682.field9648 << 24) + (var89 << 16)) + var93, var96, var97);
                }
            }
        } else if (class457.field6547 == arg0) {
            int var99 = class248.field3008.method1443(-1);
            int var100 = class248.field3008.method1426((byte) 39);
            int var101 = (var100 & 0x7) + class233.field2732;
            int var102 = class181.field2144 + var101;
            int var103 = ((var100 & 0x7C) >> 4) + class615.field8821;
            int var104 = class464.field6624 + var103;
            int var105 = class248.field3008.method1476(83);
            boolean var106 = var103 >= 0 && var101 >= 0 && var103 < class489.field6976 && class153.field1677 > var101;
            if (var106 || class217.method1269(class614.field8787, (byte) -115)) {
                class567.method3297(var102, new class602(var99, var105), class682.field9648, 24688, var104);
                if (var106) {
                    class256.method1525((byte) 31, var101, class682.field9648, var103);
                }
            }
        } else if (class592.field8343 == arg0) {
            int var107 = class248.field3008.method1423(-115);
            int var108 = class615.field8821 + ((var107 & 0x78) >> 4);
            int var109 = class233.field2732 + (var107 & 0x7);
            int var110 = class248.field3008.method1476(30);
            int var111 = class248.field3008.method1423(-40);
            int var112 = class248.field3008.method1476(40);
            int var113 = class248.field3008.method1423(-116);
            if (var108 >= 0 && var109 >= 0 && var108 < class489.field6976 && var109 < class153.field1677) {
                int var114 = var108 * 512 + 256;
                int var115 = var109 * 512 + 256;
                int var116 = class682.field9648;
                if (var116 < 3 && class728.method4056(var109, var108, (byte) -110)) {
                    var116++;
                }
                class160 var117 = new class160(var110, var112, class392.field5398, class682.field9648, var116, var114, class676.method3845(var115, var114, 0, class682.field9648) - var111, var115, var108, var108, var109, var109, var113);
                class105.field1093.method1721((byte) -66, new class1(var117));
            }
        } else if (class237.field2824 == arg0) {
            int var118 = class248.field3008.method1443(-1);
            int var119 = class248.field3008.method1450(-122);
            int var120 = (var119 >> 4 & 0x7) + class615.field8821;
            int var121 = (var119 & 0x7) + class233.field2732;
            int var122 = class248.field3008.method1426((byte) 39);
            int var123 = var122 >> 2;
            int var124 = var122 & 0x3;
            int var125 = class96.field1016[var123];
            if (class217.method1269(class614.field8787, (byte) -108) || var120 >= 0 && var121 >= 0 && var120 < class489.field6976 && class153.field1677 > var121) {
                class311.method1851(-1, 0, var125, var120, -18898, class682.field9648, var123, var118, var121, var124);
            }
        } else if (class11.field84 == arg0) {
            int var126 = class248.field3008.method1423(-76);
            boolean var127 = (var126 & 0x80) != 0;
            int var128 = ((var126 & 0x3B) >> 3) + class615.field8821;
            int var129 = (var126 & 0x7) + class233.field2732;
            int var130 = var128 + class248.field3008.method1448((byte) -84);
            int var131 = var129 + class248.field3008.method1448((byte) -94);
            int var132 = class248.field3008.method1466((byte) 31);
            int var133 = class248.field3008.method1476(-110);
            int var134 = class248.field3008.method1423(-127) * 4;
            int var135 = class248.field3008.method1423(-126) * 4;
            int var136 = class248.field3008.method1476(-92);
            int var137 = class248.field3008.method1476(91);
            int var138 = class248.field3008.method1423(-19);
            if (var138 == 255) {
                var138 = -1;
            }
            int var139 = class248.field3008.method1476(-105);
            if (var128 >= 0 && var129 >= 0 && var128 < class489.field6976 && class153.field1677 > var129 && var130 >= 0 && var131 >= 0 && var130 < class489.field6976 && var131 < class153.field1677 && var133 != 65535) {
                int var140 = var130 * 512 + 256;
                int var141 = var128 * 512 + 256;
                int var142 = var131 * 512 + 256;
                int var143 = var139 << 2;
                int var144 = var134 << 2;
                int var145 = var129 * 512 + 256;
                int var146 = var135 << 2;
                class172 var147 = new class172(var133, class682.field9648, class682.field9648, var141, var145, var144, class392.field5398 + var136, class392.field5398 + var137, var138, var143, 0, var132, var146, var127, -1);
                var147.method1065(var140, class392.field5398 + var136, var142, (byte) -84, class676.method3845(var142, var140, 0, class682.field9648) - var146);
                class395.field5414.method1721((byte) -71, new class114(var147));
            }
        } else if (class602.field8569 == arg0) {
            int var148 = class248.field3008.method1476(-105);
            int var149 = class248.field3008.method1426((byte) 39);
            int var150 = (var149 & 0x7) + class233.field2732;
            int var151 = class181.field2144 + var150;
            int var152 = ((var149 & 0x75) >> 4) + class615.field8821;
            int var153 = class464.field6624 + var152;
            class723 var154 = (class723) class450.field6490.method1754(false, (long) (var151 << 14 | class682.field9648 << 28 | var153));
            if (var154 != null) {
                for (class602 var155 = (class602) var154.field10131.method1719(65280); var155 != null; var155 = (class602) var154.field10131.method1723(-20665)) {
                    if ((var148 & 0x7FFF) == var155.field8567) {
                        var155.method864(12983);
                        break;
                    }
                }
                if (var154.field10131.method1717((byte) 28)) {
                    var154.method864(12983);
                }
                if (var152 >= 0 && var150 >= 0 && class489.field6976 > var152 && var150 < class153.field1677) {
                    class256.method1525((byte) 53, var150, class682.field9648, var152);
                }
            }
        } else {
            class151.method936("T3 - " + arg0, null, 105);
            if (arg1 < -120) {
                class7.method25(false, (byte) 125);
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "P", descriptor = "(IIII)V", line = 4359)
    public final void method236(int arg0, int arg1, int arg2, int arg3) {
        field8759++;
        if (arg0 == 0) {
            int var5 = 0;
            class592.field8347 = 0;
            class659.field9410 = 0;
            class255.field3120 = 0;
            for (int var6 = 0; var6 < this.field8656; var6++) {
                class255.field3120 += this.field8742[var6];
                class592.field8347 += this.field8750[var6];
                var5++;
                class659.field9410 += this.field8740[var6];
            }
            if (var5 > 0) {
                class592.field8347 = class592.field8347 / var5 + arg2;
                class659.field9410 = class659.field9410 / var5 + arg3;
                class255.field3120 = class255.field3120 / var5 + arg1;
            } else {
                class592.field8347 = arg2;
                class659.field9410 = arg3;
                class255.field3120 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field8656; var7++) {
                this.field8742[var7] += arg1;
                this.field8750[var7] += arg2;
                this.field8740[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field8656; var8++) {
                this.field8742[var8] -= class255.field3120;
                this.field8750[var8] -= class592.field8347;
                this.field8740[var8] -= class659.field9410;
                if (arg3 != 0) {
                    int var9 = class260.field3230[arg3];
                    int var10 = class260.field3229[arg3];
                    int var11 = this.field8750[var8] * var9 + (this.field8742[var8] * var10) + 16383 >> 14;
                    this.field8750[var8] = this.field8750[var8] * var10 + 16383 - (this.field8742[var8] * var9) >> 14;
                    this.field8742[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class260.field3230[arg1];
                    int var13 = class260.field3229[arg1];
                    int var14 = this.field8750[var8] * var13 + 16383 - (this.field8740[var8] * var12) >> 14;
                    this.field8740[var8] = this.field8750[var8] * var12 + this.field8740[var8] * var13 + 16383 >> 14;
                    this.field8750[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class260.field3230[arg2];
                    int var16 = class260.field3229[arg2];
                    int var17 = this.field8740[var8] * var15 + (this.field8742[var8] * var16 + 16383) >> 14;
                    this.field8740[var8] = this.field8740[var8] * var16 + 16383 - this.field8742[var8] * var15 >> 14;
                    this.field8742[var8] = var17;
                }
                this.field8742[var8] += class255.field3120;
                this.field8750[var8] += class592.field8347;
                this.field8740[var8] += class659.field9410;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field8656; var18++) {
                this.field8742[var18] -= class255.field3120;
                this.field8750[var18] -= class592.field8347;
                this.field8740[var18] -= class659.field9410;
                this.field8742[var18] = this.field8742[var18] * arg1 / 128;
                this.field8750[var18] = this.field8750[var18] * arg2 / 128;
                this.field8740[var18] = this.field8740[var18] * arg3 / 128;
                this.field8742[var18] += class255.field3120;
                this.field8750[var18] += class592.field8347;
                this.field8740[var18] += class659.field9410;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field8716; var19++) {
                int var23 = (this.field8739[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field8739[var19] = (byte) var23;
            }
            if (this.field8717 != null) {
                this.field8717.field9914 = null;
            }
            if (this.field8697 != null) {
                for (int var20 = 0; var20 < this.field8749; var20++) {
                    class647 var21 = this.field8697[var20];
                    class43 var22 = this.field8762[var20];
                    var22.field487 = 255 - (this.field8739[var21.field9258] & 0xFF) << 24 | var22.field487 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field8716; var24++) {
                int var28 = this.field8725[var24] & 0xFFFF;
                int var29 = (var28 & 0xFCA2) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                int var34 = arg3 + var32;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field8725[var24] = (short) class695.method3919(var34, class695.method3919(var33 << 7, var31 << 10));
            }
            if (this.field8717 != null) {
                this.field8717.field9914 = null;
            }
            if (this.field8697 != null) {
                for (int var25 = 0; var25 < this.field8749; var25++) {
                    class647 var26 = this.field8697[var25];
                    class43 var27 = this.field8762[var25];
                    var27.field487 = class721.field10115[this.field8725[var26.field9258] & 0xFFFF] & 0xFFFFFF | var27.field487 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field8749; var35++) {
                class43 var36 = this.field8762[var35];
                var36.field483 += arg1;
                var36.field478 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field8749; var37++) {
                class43 var38 = this.field8762[var37];
                var38.field484 = var38.field484 * arg1 >> 7;
                var38.field477 = var38.field477 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field8749; var39++) {
                class43 var40 = this.field8762[var39];
                var40.field480 = var40.field480 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IILdfa;ZI)Z", line = 4663)
    public final boolean method227(int arg0, int arg1, class165 arg2, boolean arg3, int arg4) {
        field8708++;
        return this.method3455(arg2, arg3, -1, arg0, arg4, -28600, arg1);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)V", line = 4676)
    private final void method3457(boolean arg0) {
        if (this.field8697 != null) {
            class624 var2 = this.field8741.field5913;
            this.field8741.method2601(0);
            this.field8741.method364(!this.field8748);
            this.field8741.method2625((byte) 72, false);
            this.field8741.method2589(null, null, this.field8741.field5995, false, this.field8741.field6005);
            for (int var3 = 0; var3 < this.field8749; var3++) {
                class647 var4 = this.field8697[var3];
                class43 var5 = this.field8762[var3];
                if (!var4.field9247 || !this.field8741.method358()) {
                    float var6 = (float) (this.field8742[var4.field9253] + this.field8742[var4.field9250] + this.field8742[var4.field9248]) * 0.3333333F;
                    float var7 = (float) (this.field8750[var4.field9253] + this.field8750[var4.field9250] + this.field8750[var4.field9248]) * 0.3333333F;
                    float var8 = (float) (this.field8740[var4.field9253] - (-this.field8740[var4.field9250] - this.field8740[var4.field9248])) * 0.3333333F;
                    float var9 = class6.field43 * var8 + class515.field7348 * var6 + class287.field3521 * var7 + class252.field3042;
                    float var10 = class560.field7997 * var8 + class215.field2504 * var7 + class140.field1568 * var6 + class461.field6566;
                    float var11 = class591.field8328 * var8 + class311.field3862 * var7 + class215.field2510 * var6 + class160.field1780;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field9255;
                    var2.method3575(var10 * var12 + (float) var5.field478 - var10, (float) var5.field483 + var9 - var9 * var12, var5.field480, 2, var4.field9254 * var5.field477 >> 7, var11 * var12 - var11, var4.field9245 * var5.field484 >> 7);
                    this.field8741.method2579(0, var2);
                    int var13 = var5.field487;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field8741.method2624(var4.field9252, 2);
                    this.field8741.method2606(var4.field9259, -24754);
                    this.field8741.method2572(4, 7, 0, (byte) -45);
                }
            }
            this.field8741.method364(true);
            this.field8741.method2561((byte) 107);
        }
        field8698++;
        if (arg0) {
            this.method3455(null, true, -19, -97, -90, 34, -22);
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "()V", line = 4736)
    public final void method223() {
        field8690++;
        if (this.field8655 <= 0 || this.field8702 <= 0) {
            return;
        }
        this.method3449(29, false);
        if ((this.field8757 & 0x10) == 0 && this.field8700.field2494 == null) {
            this.method3452(118, false);
        }
        this.method3450(-7519);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIBIIIII)Z", line = 4752)
    private final boolean method3458(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8730++;
        if (arg2 < arg8 && arg0 > arg2 && arg2 < arg1) {
            return false;
        } else if (arg2 > arg8 && arg2 > arg0 && arg2 > arg1) {
            return false;
        } else if (arg7 > arg5 && arg4 > arg5 && arg5 < arg6) {
            return false;
        } else if (arg5 > arg7 && arg5 > arg4 && arg6 < arg5) {
            return false;
        } else {
            if (arg3 >= -23) {
                this.field8673 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(Z)V", line = 4782)
    private final void method3459(boolean arg0) {
        field8672++;
        if (this.field8702 == 0 || !arg0) {
            return;
        }
        if (this.field8757 != 0) {
            this.method3449(29, true);
        }
        this.method3449(29, false);
        if (this.field8700 != null) {
            if (this.field8700.field2494 == null) {
                this.method3452(120, (this.field8757 & 0x10) != 0);
            }
            if (this.field8700.field2494 != null) {
                this.field8741.method2625((byte) 98, this.field8673 != null);
                this.field8741.method2589(this.field8717, this.field8673, this.field8738, !arg0, this.field8722);
                int var2 = this.field8657.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field8657[var3];
                    int var5 = this.field8657[var3 + 1];
                    int var6 = this.field8751[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field8741.method2565((byte) 94, this.field8673 != null, var6);
                    this.field8741.method2593(4, (var5 - var4) * 3, this.field8700.field2494, (byte) -9, var4 * 3);
                }
            }
        }
        this.method3450(-7519);
    }

    @OriginalMember(owner = "client!lea", name = "RA", descriptor = "()I", line = 4841)
    public final int method222() {
        field8682++;
        if (!this.field8670) {
            this.method3451(-32768);
        }
        return this.field8694;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIII)V", line = 4852)
    public final void method226(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field8716; var5++) {
            int var9 = this.field8725[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field8725[var5] = (short) class695.method3919(class695.method3919(var11 << 7, var10 << 10), var12);
        }
        field8705++;
        if (this.field8697 != null) {
            for (int var6 = 0; var6 < this.field8749; var6++) {
                class647 var7 = this.field8697[var6];
                class43 var8 = this.field8762[var6];
                var8.field487 = class721.field10115[this.field8725[var7.field9258] & 0xFFFF] & 0xFFFFFF | var8.field487 & 0xFF000000;
            }
        }
        if (this.field8717 != null) {
            this.field8717.field9914 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ldfa;)V", line = 4913)
    public final void method220(class165 arg0) {
        field8719++;
        class624 var2 = (class624) arg0;
        if (this.field8736 != null) {
            for (int var3 = 0; var3 < this.field8736.length; var3++) {
                class555 var4 = this.field8736[var3];
                class555 var5 = var4;
                if (var4.field7943 != null) {
                    var5 = var4.field7943;
                }
                var5.field7952 = (int) ((float) this.field8740[var4.field7940] * var2.field8961 + (float) this.field8750[var4.field7940] * var2.field8951 + (float) this.field8742[var4.field7940] * var2.field8954 + var2.field8939);
                var5.field7946 = (int) ((float) this.field8740[var4.field7940] * var2.field8942 + (float) this.field8750[var4.field7940] * var2.field8968 + (float) this.field8742[var4.field7940] * var2.field8958 + var2.field8944);
                var5.field7942 = (int) ((float) this.field8740[var4.field7940] * var2.field8962 + (float) this.field8750[var4.field7940] * var2.field8940 + (float) this.field8742[var4.field7940] * var2.field8959 + var2.field8955);
                var5.field7958 = (int) ((float) this.field8740[var4.field7941] * var2.field8961 + (float) this.field8750[var4.field7941] * var2.field8951 + (float) this.field8742[var4.field7941] * var2.field8954 + var2.field8939);
                var5.field7956 = (int) ((float) this.field8740[var4.field7941] * var2.field8942 + (float) this.field8750[var4.field7941] * var2.field8968 + (float) this.field8742[var4.field7941] * var2.field8958 + var2.field8944);
                var5.field7961 = (int) ((float) this.field8740[var4.field7941] * var2.field8962 + (float) this.field8750[var4.field7941] * var2.field8940 + (float) this.field8742[var4.field7941] * var2.field8959 + var2.field8955);
                var5.field7948 = (int) ((float) this.field8740[var4.field7950] * var2.field8961 + (float) this.field8750[var4.field7950] * var2.field8951 + (float) this.field8742[var4.field7950] * var2.field8954 + var2.field8939);
                var5.field7947 = (int) ((float) this.field8740[var4.field7950] * var2.field8942 + (float) this.field8750[var4.field7950] * var2.field8968 + (float) this.field8742[var4.field7950] * var2.field8958 + var2.field8944);
                var5.field7949 = (int) ((float) this.field8740[var4.field7950] * var2.field8962 + (float) this.field8750[var4.field7950] * var2.field8940 + (float) this.field8742[var4.field7950] * var2.field8959 + var2.field8955);
            }
        }
        if (this.field8688 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field8688.length; var6++) {
            class88 var7 = this.field8688[var6];
            class88 var8 = var7;
            if (var7.field922 != null) {
                var8 = var7.field922;
            }
            if (var7.field920 == null) {
                var7.field920 = var2.method1024();
            } else {
                var7.field920.method1028(var2);
            }
            var8.field919 = (int) ((float) this.field8740[var7.field927] * var2.field8961 + (float) this.field8750[var7.field927] * var2.field8951 + (float) this.field8742[var7.field927] * var2.field8954 + var2.field8939);
            var8.field928 = (int) ((float) this.field8740[var7.field927] * var2.field8942 + (float) this.field8750[var7.field927] * var2.field8968 + (float) this.field8742[var7.field927] * var2.field8958 + var2.field8944);
            var8.field923 = (int) ((float) this.field8740[var7.field927] * var2.field8962 + (float) this.field8750[var7.field927] * var2.field8940 + (float) this.field8742[var7.field927] * var2.field8959 + var2.field8955);
        }
    }

    @OriginalMember(owner = "client!lea", name = "ba", descriptor = "(Lr;)Lr;", line = 4985)
    public final class182 method194(class182 arg0) {
        field8709++;
        if (this.field8655 == 0) {
            return null;
        }
        if (!this.field8670) {
            this.method3451(-32768);
        }
        int var2;
        int var3;
        if (this.field8741.field5960 <= 0) {
            var2 = this.field8699 - (this.field8741.field5960 * this.field8754 >> 8) >> this.field8741.field5920;
            var3 = this.field8694 - (this.field8741.field5960 * this.field8683 >> 8) >> this.field8741.field5920;
        } else {
            var2 = this.field8699 - (this.field8741.field5960 * this.field8683 >> 8) >> this.field8741.field5920;
            var3 = this.field8694 - (this.field8741.field5960 * this.field8754 >> 8) >> this.field8741.field5920;
        }
        int var4;
        int var5;
        if (this.field8741.field6027 > 0) {
            var4 = this.field8693 - (this.field8741.field6027 * this.field8683 >> 8) >> this.field8741.field5920;
            var5 = this.field8720 - (this.field8741.field6027 * this.field8754 >> 8) >> this.field8741.field5920;
        } else {
            var4 = this.field8693 - (this.field8741.field6027 * this.field8754 >> 8) >> this.field8741.field5920;
            var5 = this.field8720 - (this.field8741.field6027 * this.field8683 >> 8) >> this.field8741.field5920;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class396 var8 = (class396) arg0;
        class396 var9;
        if (var8 != null && var8.method2427(var6, var7, 20584)) {
            var9 = var8;
            var8.method2430(false);
        } else {
            var9 = new class396(this.field8741, var6, var7);
        }
        var9.method2428(var3, (byte) -20, var4, var5, var2);
        this.method3460(var9, true);
        return var9;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I[IIIIIZ)V", line = 5060)
    public final void method206(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8704++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            class659.field9410 = 0;
            class592.field8347 = 0;
            int var12 = 0;
            class255.field3120 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field8662.length > var14) {
                    int[] var15 = this.field8662[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class255.field3120 += this.field8742[var17];
                        class592.field8347 += this.field8750[var17];
                        var12++;
                        class659.field9410 += this.field8740[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class255.field3120 = var11;
                class659.field9410 = var10;
                class592.field8347 = var9;
            } else {
                class592.field8347 = class592.field8347 / var12 + var9;
                class659.field9410 = class659.field9410 / var12 + var10;
                class255.field3120 = class255.field3120 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field8662.length > var22) {
                    int[] var23 = this.field8662[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field8742[var25] += var19;
                        this.field8750[var25] += var20;
                        this.field8740[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field8662.length) {
                    int[] var46 = this.field8662[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field8742[var48] -= class255.field3120;
                            this.field8750[var48] -= class592.field8347;
                            this.field8740[var48] -= class659.field9410;
                            if (arg4 != 0) {
                                int var49 = class260.field3230[arg4];
                                int var50 = class260.field3229[arg4];
                                int var51 = this.field8750[var48] * var49 + (this.field8742[var48] * var50 + 16383) >> 14;
                                this.field8750[var48] = this.field8750[var48] * var50 + 16383 - (this.field8742[var48] * var49) >> 14;
                                this.field8742[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class260.field3230[arg2];
                                int var53 = class260.field3229[arg2];
                                int var54 = this.field8750[var48] * var53 + 16383 - (this.field8740[var48] * var52) >> 14;
                                this.field8740[var48] = this.field8750[var48] * var52 + this.field8740[var48] * var53 + 16383 >> 14;
                                this.field8750[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class260.field3230[arg3];
                                int var56 = class260.field3229[arg3];
                                int var57 = this.field8740[var48] * var55 - (-(this.field8742[var48] * var56) - 16383) >> 14;
                                this.field8740[var48] = this.field8740[var48] * var56 + 16383 - this.field8742[var48] * var55 >> 14;
                                this.field8742[var48] = var57;
                            }
                            this.field8742[var48] += class255.field3120;
                            this.field8750[var48] += class592.field8347;
                            this.field8740[var48] += class659.field9410;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field8742[var59] -= class255.field3120;
                            this.field8750[var59] -= class592.field8347;
                            this.field8740[var59] -= class659.field9410;
                            if (arg2 != 0) {
                                int var60 = class260.field3230[arg2];
                                int var61 = class260.field3229[arg2];
                                int var62 = this.field8750[var59] * var61 + 16383 - (this.field8740[var59] * var60) >> 14;
                                this.field8740[var59] = this.field8750[var59] * var60 + this.field8740[var59] * var61 + 16383 >> 14;
                                this.field8750[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class260.field3230[arg4];
                                int var64 = class260.field3229[arg4];
                                int var65 = this.field8750[var59] * var63 - (-(this.field8742[var59] * var64) - 16383) >> 14;
                                this.field8750[var59] = this.field8750[var59] * var64 + 16383 - (this.field8742[var59] * var63) >> 14;
                                this.field8742[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class260.field3230[arg3];
                                int var67 = class260.field3229[arg3];
                                int var68 = this.field8742[var59] * var67 + this.field8740[var59] * var66 + 16383 >> 14;
                                this.field8740[var59] = this.field8740[var59] * var67 + 16383 - (this.field8742[var59] * var66) >> 14;
                                this.field8742[var59] = var68;
                            }
                            this.field8742[var59] += class255.field3120;
                            this.field8750[var59] += class592.field8347;
                            this.field8740[var59] += class659.field9410;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field8662.length) {
                        int[] var29 = this.field8662[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field8653[var31];
                            int var33 = this.field8653[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field8718[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class260.field3230[arg4];
                                    int var37 = class260.field3229[arg4];
                                    int var38 = this.field8667[var35] * var36 + this.field8658[var35] * var37 + 16383 >> 14;
                                    this.field8667[var35] = (short) (this.field8667[var35] * var37 + 16383 - (this.field8658[var35] * var36) >> 14);
                                    this.field8658[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class260.field3230[arg2];
                                    int var40 = class260.field3229[arg2];
                                    int var41 = this.field8667[var35] * var40 + 16383 - (this.field8728[var35] * var39) >> 14;
                                    this.field8728[var35] = (short) (this.field8667[var35] * var39 + this.field8728[var35] * var40 + 16383 >> 14);
                                    this.field8667[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class260.field3230[arg3];
                                    int var43 = class260.field3229[arg3];
                                    int var44 = this.field8658[var35] * var43 + this.field8728[var35] * var42 + 16383 >> 14;
                                    this.field8728[var35] = (short) (this.field8728[var35] * var43 + 16383 - (this.field8658[var35] * var42) >> 14);
                                    this.field8658[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field8673 == null && this.field8717 != null) {
                    this.field8717.field9914 = null;
                }
                if (this.field8673 != null) {
                    this.field8673.field9914 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field8662.length) {
                    int[] var71 = this.field8662[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field8742[var73] -= class255.field3120;
                        this.field8750[var73] -= class592.field8347;
                        this.field8740[var73] -= class659.field9410;
                        this.field8742[var73] = this.field8742[var73] * arg2 >> 7;
                        this.field8750[var73] = this.field8750[var73] * arg3 >> 7;
                        this.field8740[var73] = this.field8740[var73] * arg4 >> 7;
                        this.field8742[var73] += class255.field3120;
                        this.field8750[var73] += class592.field8347;
                        this.field8740[var73] += class659.field9410;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8753 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field8753.length) {
                        int[] var79 = this.field8753[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field8739[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field8739[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field8717 != null) {
                            this.field8717.field9914 = null;
                        }
                    }
                }
                if (this.field8697 != null) {
                    for (int var75 = 0; var75 < this.field8749; var75++) {
                        class647 var76 = this.field8697[var75];
                        class43 var77 = this.field8762[var75];
                        var77.field487 = var77.field487 & 0xFFFFFF | 255 - (this.field8739[var76.field9258] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field8753 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field8753.length > var87) {
                        int[] var88 = this.field8753[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field8725[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
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
                            this.field8725[var90] = (short) class695.method3919(var97, class695.method3919(var95 << 7, var94 << 10));
                        }
                        if (var88.length > 0 && this.field8717 != null) {
                            this.field8717.field9914 = null;
                        }
                    }
                }
                if (this.field8697 != null) {
                    for (int var84 = 0; var84 < this.field8749; var84++) {
                        class647 var85 = this.field8697[var84];
                        class43 var86 = this.field8762[var84];
                        var86.field487 = var86.field487 & 0xFF000000 | class721.field10115[this.field8725[var85.field9258] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field8707 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field8707.length > var99) {
                        int[] var100 = this.field8707[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class43 var102 = this.field8762[var100[var101]];
                            var102.field478 += arg3;
                            var102.field483 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8707 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field8707.length > var104) {
                        int[] var105 = this.field8707[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class43 var107 = this.field8762[var105[var106]];
                            var107.field477 = var107.field477 * arg3 >> 7;
                            var107.field484 = var107.field484 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8707 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field8707.length) {
                    int[] var110 = this.field8707[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class43 var112 = this.field8762[var110[var111]];
                        var112.field480 = var112.field480 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lmt;Z)V", line = 5711)
    private final void method3460(class396 arg0, boolean arg1) {
        if (this.field8655 > this.field8741.field6064.length) {
            this.field8741.field6063 = new int[this.field8655];
            this.field8741.field6064 = new int[this.field8655];
        }
        field8724++;
        int[] var3 = this.field8741.field6064;
        int[] var4 = this.field8741.field6063;
        for (int var5 = 0; var5 < this.field8656; var5++) {
            int var16 = (this.field8742[var5] - (this.field8750[var5] * this.field8741.field5960 >> 8) >> this.field8741.field5920) - arg0.field5423;
            int var17 = (this.field8740[var5] - (this.field8750[var5] * this.field8741.field6027 >> 8) >> this.field8741.field5920) - arg0.field5426;
            int var18 = this.field8653[var5];
            int var19 = this.field8653[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field8718[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field8702; var6++) {
            if (this.field8739 == null || this.field8739[var6] <= 128) {
                short var7 = this.field8737[var6];
                short var8 = this.field8745[var6];
                short var9 = this.field8692[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - (var12 - var11) * (var14 - var13)) > 0) {
                    arg0.method2429(var12, 0, var15, var13, var11, var10, var14);
                }
            }
        }
        if (!arg1) {
            this.field8744 = -84;
        }
    }

    @OriginalMember(owner = "client!lea", name = "wa", descriptor = "()V", line = 5797)
    public final void method218() {
        for (int var1 = 0; var1 < this.field8663; var1++) {
            this.field8742[var1] = this.field8742[var1] + 7 >> 4;
            this.field8750[var1] = this.field8750[var1] + 7 >> 4;
            this.field8740[var1] = this.field8740[var1] + 7 >> 4;
        }
        field8669++;
        this.field8670 = false;
        if (this.field8722 != null) {
            this.field8722.field9914 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "da", descriptor = "()I", line = 6720)
    public final int method235() {
        field8732++;
        return this.field8664;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZZLlea;Llea;I)Lka;", line = 6728)
    private final class470 method3461(int arg0, boolean arg1, boolean arg2, class610 arg3, class610 arg4, int arg5) {
        arg3.field8752 = this.field8752;
        arg3.field8656 = this.field8656;
        arg3.field8663 = this.field8663;
        arg3.field8666 = this.field8666;
        field8674++;
        arg3.field8757 = 0;
        if ((arg0 & 0x100) == 0) {
            arg3.field8748 = this.field8748;
        } else {
            arg3.field8748 = true;
        }
        arg3.field8716 = this.field8716;
        arg3.field8702 = this.field8702;
        arg3.field8749 = this.field8749;
        arg3.field8706 = this.field8706;
        arg3.field8695 = arg0;
        arg3.field8664 = this.field8664;
        arg3.field8655 = this.field8655;
        boolean var7 = class756.method4200((byte) -46, arg0, this.field8666);
        boolean var8 = class54.method304(this.field8666, 0, arg0);
        boolean var9 = class595.method3395(this.field8666, arg0, (byte) 109);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg3.field8742 = this.field8742;
            } else if (arg4.field8742 == null || arg4.field8742.length < this.field8663) {
                arg3.field8742 = arg4.field8742 = new int[this.field8663];
            } else {
                arg3.field8742 = arg4.field8742;
            }
            if (!var8) {
                arg3.field8750 = this.field8750;
            } else if (arg4.field8750 == null || arg4.field8750.length < this.field8663) {
                arg3.field8750 = arg4.field8750 = new int[this.field8663];
            } else {
                arg3.field8750 = arg4.field8750;
            }
            if (!var9) {
                arg3.field8740 = this.field8740;
            } else if (arg4.field8740 == null || this.field8663 > arg4.field8740.length) {
                arg3.field8740 = arg4.field8740 = new int[this.field8663];
            } else {
                arg3.field8740 = arg4.field8740;
            }
            for (int var11 = 0; var11 < this.field8663; var11++) {
                if (var7) {
                    arg3.field8742[var11] = this.field8742[var11];
                }
                if (var8) {
                    arg3.field8750[var11] = this.field8750[var11];
                }
                if (var9) {
                    arg3.field8740[var11] = this.field8740[var11];
                }
            }
        } else {
            arg3.field8740 = this.field8740;
            arg3.field8742 = this.field8742;
            arg3.field8750 = this.field8750;
        }
        if (class713.method3987(arg0, -8, this.field8666)) {
            arg3.field8722 = arg4.field8722;
            if (arg2) {
                arg3.field8757 = (byte) (arg3.field8757 | 0x1);
            }
            arg3.field8722.field9919 = this.field8722.field9919;
            arg3.field8722.field9914 = this.field8722.field9914;
        } else if (class52.method298(arg0, this.field8666, true)) {
            arg3.field8722 = this.field8722;
        } else {
            arg3.field8722 = null;
        }
        if (class551.method3233(-23949, this.field8666, arg0)) {
            if (arg4.field8725 == null || arg4.field8725.length < this.field8716) {
                arg3.field8725 = arg4.field8725 = new short[this.field8716];
            } else {
                arg3.field8725 = arg4.field8725;
            }
            for (int var12 = 0; var12 < this.field8716; var12++) {
                arg3.field8725[var12] = this.field8725[var12];
            }
        } else {
            arg3.field8725 = this.field8725;
        }
        if (class470.method2840(10115, arg0, this.field8666)) {
            if (arg4.field8739 == null || arg4.field8739.length < this.field8716) {
                arg3.field8739 = arg4.field8739 = new byte[this.field8716];
            } else {
                arg3.field8739 = arg4.field8739;
            }
            for (int var13 = 0; var13 < this.field8716; var13++) {
                arg3.field8739[var13] = this.field8739[var13];
            }
        } else {
            arg3.field8739 = this.field8739;
        }
        if (class599.method3409(arg0, this.field8666, 55)) {
            if (arg2) {
                arg3.field8757 = (byte) (arg3.field8757 | 0x2);
            }
            arg3.field8717 = arg4.field8717;
            arg3.field8717.field9914 = this.field8717.field9914;
            arg3.field8717.field9919 = this.field8717.field9919;
        } else if (class452.method2783(this.field8666, arg0, 114)) {
            arg3.field8717 = this.field8717;
        } else {
            arg3.field8717 = null;
        }
        if (class147.method915(this.field8666, arg0, (byte) 101)) {
            if (arg4.field8658 == null || arg4.field8658.length < this.field8655) {
                int var14 = this.field8655;
                arg3.field8667 = arg4.field8667 = new short[var14];
                arg3.field8728 = arg4.field8728 = new short[var14];
                arg3.field8658 = arg4.field8658 = new short[var14];
            } else {
                arg3.field8658 = arg4.field8658;
                arg3.field8667 = arg4.field8667;
                arg3.field8728 = arg4.field8728;
            }
            if (this.field8703 == null) {
                for (int var18 = 0; var18 < this.field8655; var18++) {
                    arg3.field8658[var18] = this.field8658[var18];
                    arg3.field8667[var18] = this.field8667[var18];
                    arg3.field8728[var18] = this.field8728[var18];
                }
            } else {
                if (arg4.field8703 == null) {
                    arg4.field8703 = new class251();
                }
                class251 var15 = arg3.field8703 = arg4.field8703;
                if (var15.field3033 == null || var15.field3033.length < this.field8655) {
                    int var16 = this.field8655;
                    var15.field3030 = new short[var16];
                    var15.field3034 = new short[var16];
                    var15.field3031 = new byte[var16];
                    var15.field3033 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field8655; var17++) {
                    arg3.field8658[var17] = this.field8658[var17];
                    arg3.field8667[var17] = this.field8667[var17];
                    arg3.field8728[var17] = this.field8728[var17];
                    var15.field3033[var17] = this.field8703.field3033[var17];
                    var15.field3030[var17] = this.field8703.field3030[var17];
                    var15.field3034[var17] = this.field8703.field3034[var17];
                    var15.field3031[var17] = this.field8703.field3031[var17];
                }
            }
            arg3.field8679 = this.field8679;
        } else {
            arg3.field8658 = this.field8658;
            arg3.field8703 = this.field8703;
            arg3.field8679 = this.field8679;
            arg3.field8667 = this.field8667;
            arg3.field8728 = this.field8728;
        }
        if (class380.method2336(this.field8666, arg0, 0)) {
            if (arg2) {
                arg3.field8757 = (byte) (arg3.field8757 | 0x4);
            }
            arg3.field8673 = arg4.field8673;
            arg3.field8673.field9914 = this.field8673.field9914;
            arg3.field8673.field9919 = this.field8673.field9919;
        } else if (class619.method3531(true, arg0, this.field8666)) {
            arg3.field8673 = this.field8673;
        } else {
            arg3.field8673 = null;
        }
        if (class418.method2631(-78, this.field8666, arg0)) {
            if (arg4.field8651 == null || arg4.field8651.length < this.field8716) {
                int var19 = this.field8655;
                arg3.field8668 = arg4.field8668 = new float[var19];
                arg3.field8651 = arg4.field8651 = new float[var19];
            } else {
                arg3.field8668 = arg4.field8668;
                arg3.field8651 = arg4.field8651;
            }
            for (int var20 = 0; var20 < this.field8655; var20++) {
                arg3.field8651[var20] = this.field8651[var20];
                arg3.field8668[var20] = this.field8668[var20];
            }
        } else {
            arg3.field8668 = this.field8668;
            arg3.field8651 = this.field8651;
        }
        if (class600.method3412(this.field8666, arg0, 535678147)) {
            if (arg2) {
                arg3.field8757 = (byte) (arg3.field8757 | 0x8);
            }
            arg3.field8738 = arg4.field8738;
            arg3.field8738.field9919 = this.field8738.field9919;
            arg3.field8738.field9914 = this.field8738.field9914;
        } else if (class718.method4007(arg0, true, this.field8666)) {
            arg3.field8738 = this.field8738;
        } else {
            arg3.field8738 = null;
        }
        if (class542.method3188(this.field8666, (byte) -115, arg0)) {
            if (arg4.field8737 == null || this.field8716 > arg4.field8737.length) {
                int var21 = this.field8716;
                arg3.field8692 = arg4.field8692 = new short[var21];
                arg3.field8737 = arg4.field8737 = new short[var21];
                arg3.field8745 = arg4.field8745 = new short[var21];
            } else {
                arg3.field8692 = arg4.field8692;
                arg3.field8745 = arg4.field8745;
                arg3.field8737 = arg4.field8737;
            }
            for (int var22 = 0; var22 < this.field8716; var22++) {
                arg3.field8737[var22] = this.field8737[var22];
                arg3.field8745[var22] = this.field8745[var22];
                arg3.field8692[var22] = this.field8692[var22];
            }
        } else {
            arg3.field8737 = this.field8737;
            arg3.field8692 = this.field8692;
            arg3.field8745 = this.field8745;
        }
        if (class737.method4113(this.field8666, arg0, true)) {
            if (arg2) {
                arg3.field8757 = (byte) (arg3.field8757 | 0x10);
            }
            arg3.field8700 = arg4.field8700;
            arg3.field8700.field2494 = this.field8700.field2494;
        } else if (class478.method2875(2048, this.field8666, arg0)) {
            arg3.field8700 = this.field8700;
        } else {
            arg3.field8700 = null;
        }
        if (class315.method1875(arg0, this.field8666, -13230)) {
            if (arg4.field8751 == null || this.field8716 > arg4.field8751.length) {
                int var23 = this.field8716;
                arg3.field8751 = arg4.field8751 = new short[var23];
            } else {
                arg3.field8751 = arg4.field8751;
            }
            for (int var24 = 0; var24 < this.field8716; var24++) {
                arg3.field8751[var24] = this.field8751[var24];
            }
        } else {
            arg3.field8751 = this.field8751;
        }
        if (!class114.method755(arg0, this.field8666, -1)) {
            arg3.field8762 = this.field8762;
        } else if (arg4.field8762 == null || arg4.field8762.length < this.field8749) {
            int var26 = this.field8749;
            arg3.field8762 = arg4.field8762 = new class43[var26];
            for (int var27 = 0; var27 < this.field8749; var27++) {
                arg3.field8762[var27] = this.field8762[var27].method253((byte) -126);
            }
        } else {
            arg3.field8762 = arg4.field8762;
            for (int var25 = 0; var25 < this.field8749; var25++) {
                arg3.field8762[var25].method252(this.field8762[var25], 6);
            }
        }
        if (this.field8670) {
            arg3.field8694 = this.field8694;
            arg3.field8754 = this.field8754;
            arg3.field8744 = this.field8744;
            arg3.field8699 = this.field8699;
            arg3.field8713 = this.field8713;
            arg3.field8693 = this.field8693;
            arg3.field8683 = this.field8683;
            arg3.field8670 = true;
            arg3.field8720 = this.field8720;
        } else {
            arg3.field8670 = false;
        }
        if (arg5 <= 39) {
            return null;
        }
        arg3.field8753 = this.field8753;
        arg3.field8662 = this.field8662;
        arg3.field8697 = this.field8697;
        arg3.field8688 = this.field8688;
        arg3.field8665 = this.field8665;
        arg3.field8736 = this.field8736;
        arg3.field8689 = this.field8689;
        arg3.field8657 = this.field8657;
        arg3.field8707 = this.field8707;
        arg3.field8718 = this.field8718;
        arg3.field8653 = this.field8653;
        return arg3;
    }
}
