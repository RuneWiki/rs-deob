import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class700 extends class359 {

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
    private int field9718 = 0;

    @OriginalMember(owner = "client!mo", name = "yb", descriptor = "Z")
    private boolean field9753 = true;

    @OriginalMember(owner = "client!mo", name = "Cb", descriptor = "I")
    private int field9757 = 0;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    private int field9714 = 0;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "Z")
    private boolean field9717 = false;

    @OriginalMember(owner = "client!mo", name = "jb", descriptor = "I")
    private int field9738 = 0;

    @OriginalMember(owner = "client!mo", name = "Nb", descriptor = "I")
    private int field9768 = 0;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "Ljaa;")
    private class576 field9706;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "Lce;")
    private class288 field9720;

    @OriginalMember(owner = "client!mo", name = "Jb", descriptor = "Lce;")
    private class288 field9764;

    @OriginalMember(owner = "client!mo", name = "lb", descriptor = "Lce;")
    private class288 field9740;

    @OriginalMember(owner = "client!mo", name = "Ub", descriptor = "Lce;")
    private class288 field9775;

    @OriginalMember(owner = "client!mo", name = "Pb", descriptor = "Lgw;")
    private class159 field9770;

    @OriginalMember(owner = "client!mo", name = "ec", descriptor = "I")
    private int field9785;

    @OriginalMember(owner = "client!mo", name = "Z", descriptor = "I")
    private int field9728;

    @OriginalMember(owner = "client!mo", name = "ob", descriptor = "[I")
    private int[] field9743;

    @OriginalMember(owner = "client!mo", name = "Xb", descriptor = "[I")
    private int[] field9778;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "[I")
    private int[] field9686;

    @OriginalMember(owner = "client!mo", name = "U", descriptor = "[S")
    private short[] field9723;

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "[I")
    private int[] field9711;

    @OriginalMember(owner = "client!mo", name = "G", descriptor = "[Lfd;")
    private class493[] field9709;

    @OriginalMember(owner = "client!mo", name = "cb", descriptor = "[Let;")
    private class556[] field9731;

    @OriginalMember(owner = "client!mo", name = "mc", descriptor = "I")
    private int field9793;

    @OriginalMember(owner = "client!mo", name = "nb", descriptor = "[Ldu;")
    private class331[] field9742;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "[Lqfa;")
    private class89[] field9694;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "[S")
    private short[] field9685;

    @OriginalMember(owner = "client!mo", name = "pc", descriptor = "[S")
    private short[] field9796;

    @OriginalMember(owner = "client!mo", name = "Qb", descriptor = "[S")
    private short[] field9771;

    @OriginalMember(owner = "client!mo", name = "Fb", descriptor = "[B")
    private byte[] field9760;

    @OriginalMember(owner = "client!mo", name = "Yb", descriptor = "[S")
    private short[] field9779;

    @OriginalMember(owner = "client!mo", name = "jc", descriptor = "S")
    private short field9790;

    @OriginalMember(owner = "client!mo", name = "eb", descriptor = "S")
    private short field9733;

    @OriginalMember(owner = "client!mo", name = "Sb", descriptor = "[S")
    private short[] field9773;

    @OriginalMember(owner = "client!mo", name = "Bb", descriptor = "[F")
    private float[] field9756;

    @OriginalMember(owner = "client!mo", name = "qb", descriptor = "[S")
    private short[] field9745;

    @OriginalMember(owner = "client!mo", name = "pb", descriptor = "[S")
    private short[] field9744;

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "[B")
    private byte[] field9712;

    @OriginalMember(owner = "client!mo", name = "cc", descriptor = "[S")
    private short[] field9783;

    @OriginalMember(owner = "client!mo", name = "Vb", descriptor = "[F")
    private float[] field9776;

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "[S")
    private short[] field9708;

    @OriginalMember(owner = "client!mo", name = "bb", descriptor = "[S")
    private short[] field9730;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "[I")
    private int[] field9724;

    @OriginalMember(owner = "client!mo", name = "Ob", descriptor = "[[I")
    private int[][] field9769;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "[[I")
    private int[][] field9688;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "[[I")
    private int[][] field9721;

    @OriginalMember(owner = "client!mo", name = "oc", descriptor = "Z")
    public static boolean field9795 = false;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "B")
    private byte field9693;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field9700;

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "I")
    public static int field9702;

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!mo", name = "B", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!mo", name = "H", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
    public static int field9715;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    public static int field9716;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!mo", name = "X", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!mo", name = "Y", descriptor = "I")
    public static int field9727;

    @OriginalMember(owner = "client!mo", name = "ab", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!mo", name = "db", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!mo", name = "fb", descriptor = "I")
    public static int field9734;

    @OriginalMember(owner = "client!mo", name = "gb", descriptor = "I")
    public static int field9735;

    @OriginalMember(owner = "client!mo", name = "hb", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!mo", name = "ib", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!mo", name = "kb", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!mo", name = "mb", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!mo", name = "rb", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!mo", name = "sb", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!mo", name = "tb", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!mo", name = "ub", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!mo", name = "wb", descriptor = "I")
    public static int field9751;

    @OriginalMember(owner = "client!mo", name = "xb", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!mo", name = "zb", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!mo", name = "Ab", descriptor = "I")
    public static int field9755;

    @OriginalMember(owner = "client!mo", name = "Db", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!mo", name = "Eb", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!mo", name = "Gb", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!mo", name = "Ib", descriptor = "I")
    public static int field9763;

    @OriginalMember(owner = "client!mo", name = "Kb", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!mo", name = "Lb", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!mo", name = "Mb", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!mo", name = "Rb", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!mo", name = "Wb", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!mo", name = "bc", descriptor = "I")
    public static int field9782;

    @OriginalMember(owner = "client!mo", name = "dc", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!mo", name = "fc", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!mo", name = "hc", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!mo", name = "ic", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!mo", name = "kc", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!mo", name = "lc", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!mo", name = "nc", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!mo", name = "ac", descriptor = "Lwb;")
    private class308 field9781;

    @OriginalMember(owner = "client!mo", name = "gc", descriptor = "Lad;")
    private class393 field9787;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "Lnr;")
    private class55 field9699;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "S")
    private short field9698;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "S")
    private short field9701;

    @OriginalMember(owner = "client!mo", name = "W", descriptor = "S")
    private short field9725;

    @OriginalMember(owner = "client!mo", name = "vb", descriptor = "S")
    private short field9750;

    @OriginalMember(owner = "client!mo", name = "Hb", descriptor = "S")
    private short field9762;

    @OriginalMember(owner = "client!mo", name = "Tb", descriptor = "S")
    private short field9774;

    @OriginalMember(owner = "client!mo", name = "Zb", descriptor = "S")
    private short field9780;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)V")
    private final void method3861(boolean arg0, int arg1) {
        field9791++;
        boolean var3 = this.field9775 != null && this.field9775.field3645 == null;
        boolean var4 = this.field9740 != null && this.field9740.field3645 == null;
        boolean var5 = this.field9720 != null && this.field9720.field3645 == null;
        boolean var6 = this.field9764 != null && this.field9764.field3645 == null;
        if (arg0) {
            var4 &= (this.field9693 & 0x4) != 0;
            var3 &= (this.field9693 & 0x2) != 0;
            var5 &= (this.field9693 & 0x1) != 0;
            var6 &= (this.field9693 & 0x8) != 0;
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
        if (this.field9768 * var7 > this.field9706.field7738.field7318.length) {
            this.field9706.field7738 = new class113((this.field9768 + 100) * var7);
        } else {
            this.field9706.field7738.field7313 = 0;
        }
        class113 var12 = this.field9706.field7738;
        if (var5) {
            if (this.field9706.field7643) {
                for (int var13 = 0; var13 < this.field9738; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field9686[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field9711[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field9778[var13]);
                    int var17 = this.field9743[var13];
                    int var18 = this.field9743[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field9744[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field7313 = var7 * var20;
                        var12.method3061(var14, (byte) 115);
                        var12.method3061(var15, (byte) 115);
                        var12.method3061(var16, (byte) 115);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field9738; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field9686[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field9711[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field9778[var21]);
                    int var25 = this.field9743[var21];
                    int var26 = this.field9743[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field9744[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field7313 = var7 * var28;
                        var12.method3075(var22, (byte) -52);
                        var12.method3075(var23, (byte) -52);
                        var12.method3075(var24, (byte) -52);
                    }
                }
            }
        }
        if (var3) {
            if (this.field9740 == null) {
                short[] var29;
                short[] var30;
                byte[] var31;
                short[] var32;
                if (this.field9699 == null) {
                    var29 = this.field9685;
                    var30 = this.field9796;
                    var31 = this.field9760;
                    var32 = this.field9745;
                } else {
                    var32 = this.field9699.field703;
                    var30 = this.field9699.field710;
                    var31 = this.field9699.field705;
                    var29 = this.field9699.field706;
                }
                float var33 = this.field9706.field7624[0];
                float var34 = this.field9706.field7624[1];
                float var35 = this.field9706.field7624[2];
                float var36 = this.field9706.field7644;
                float var37 = this.field9706.field7728 * 768.0F / (float) this.field9733;
                float var38 = this.field9706.field7729 * 768.0F / (float) this.field9733;
                for (int var39 = 0; var39 < this.field9757; var39++) {
                    int var40 = this.method3868(this.field9771[var39], this.field9790, this.field9712[var39], 16777215, this.field9708[var39]);
                    float var41 = (float) (var40 >>> 24) * this.field9706.field7711;
                    short var42 = this.field9773[var39];
                    float var43 = (float) (var40 >> 8 & 0xFF) * this.field9706.field7733;
                    float var44 = (float) (var40 >> 16 & 0xFF) * this.field9706.field7650;
                    short var45 = (short) var31[var42];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var29[var42] * var35 + (float) var30[var42] * var34 + (float) var32[var42] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var29[var42] * var35 + (float) var30[var42] * var34 + (float) var32[var42] * var33) / (float) (var45 * 256);
                    }
                    float var47 = var36 + ((var46 < 0.0F) ? var38 : var37) * var46;
                    int var48 = (int) (var41 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var44 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var43 * var47);
                    var12.field7313 = var7 * var42 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method3090(var48, 3);
                    var12.method3090(var49, 3);
                    var12.method3090(var50, 3);
                    var12.method3090(255 - (this.field9712[var39] & 0xFF), 3);
                    short var51 = this.field9730[var39];
                    short var52 = (short) var31[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var29[var51] * var35 + (float) var30[var51] * var34 + (float) var32[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var29[var51] * var35 + (float) var30[var51] * var34 + (float) var32[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var36 + (var53 < 0.0F ? var38 : var37) * var53;
                    int var55 = (int) (var41 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var44 * var54);
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
                    var12.field7313 = var7 * var51 + var9;
                    var12.method3090(var55, 3);
                    var12.method3090(var56, 3);
                    var12.method3090(var57, 3);
                    var12.method3090(255 - (this.field9712[var39] & 0xFF), 3);
                    short var58 = this.field9779[var39];
                    short var59 = (short) var31[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var29[var58] * var35 + (float) var30[var58] * var34 + (float) var32[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var29[var58] * var35 + (float) var30[var58] * var34 + (float) var32[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var60 * ((var60 < 0.0F) ? var38 : var37) + var36;
                    int var62 = (int) (var41 * var61);
                    int var63 = (int) (var44 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var43 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field7313 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method3090(var62, 3);
                    var12.method3090(var63, 3);
                    var12.method3090(var64, arg1 + 3);
                    var12.method3090(255 - (this.field9712[var39] & 0xFF), 3);
                }
            } else {
                for (int var65 = 0; var65 < this.field9757; var65++) {
                    int var66 = this.method3868(this.field9771[var65], this.field9790, this.field9712[var65], 16777215, this.field9708[var65]);
                    var12.field7313 = var9 + (this.field9773[var65] * var7);
                    var12.method3061(var66, (byte) 115);
                    var12.field7313 = this.field9730[var65] * var7 + var9;
                    var12.method3061(var66, (byte) 115);
                    var12.field7313 = var9 + (this.field9779[var65] * var7);
                    var12.method3061(var66, (byte) 115);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field9699 == null) {
                var67 = this.field9796;
                var68 = this.field9745;
                var69 = this.field9685;
                var70 = this.field9760;
            } else {
                var69 = this.field9699.field706;
                var67 = this.field9699.field710;
                var70 = this.field9699.field705;
                var68 = this.field9699.field703;
            }
            float var71 = 3.0F / (float) this.field9733;
            var12.field7313 = var10;
            float var72 = 3.0F / (float) (this.field9733 / 2 + this.field9733);
            if (this.field9706.field7643) {
                for (int var73 = 0; var73 < this.field9768; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method784(-1585528400, (float) var68[var73] * var72);
                        var12.method784(-1585528400, (float) var67[var73] * var72);
                        var12.method784(-1585528400, (float) var69[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method784(-1585528400, (float) var68[var73] * var75);
                        var12.method784(-1585528400, (float) var67[var73] * var75);
                        var12.method784(-1585528400, (float) var69[var73] * var75);
                    }
                    var12.field7313 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field9768; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method782(367967696, (float) var68[var76] * var72);
                        var12.method782(367967696, (float) var67[var76] * var72);
                        var12.method782(arg1 ^ 0x15EEBDD0, (float) var69[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method782(arg1 ^ 0x15EEBDD0, (float) var68[var76] * var78);
                        var12.method782(arg1 + 367967696, (float) var67[var76] * var78);
                        var12.method782(367967696, (float) var69[var76] * var78);
                    }
                    var12.field7313 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field7313 = var11;
            if (this.field9706.field7643) {
                for (int var79 = 0; var79 < this.field9768; var79++) {
                    var12.method784(-1585528400, this.field9756[var79]);
                    var12.method784(-1585528400, this.field9776[var79]);
                    var12.field7313 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field9768; var80++) {
                    var12.method782(arg1 + 367967696, this.field9756[var80]);
                    var12.method782(367967696, this.field9776[var80]);
                    var12.field7313 += var7 - 8;
                }
            }
        }
        var12.field7313 = this.field9768 * var7;
        class393 var81;
        if (arg0) {
            if (this.field9787 == null) {
                this.field9787 = this.field9706.method3136(arg1, var12.field7318, var12.field7313, var7, true);
            } else {
                this.field9787.method2231(var7, var12.field7313, 18449, var12.field7318);
            }
            var81 = this.field9787;
            this.field9693 = 0;
        } else {
            var81 = this.field9706.method3136(0, var12.field7318, var12.field7313, var7, false);
            this.field9753 = true;
        }
        if (var5) {
            this.field9720.field3645 = var81;
            this.field9720.field3644 = var8;
        }
        if (var6) {
            this.field9764.field3645 = var81;
            this.field9764.field3644 = var11;
        }
        if (var3) {
            this.field9775.field3645 = var81;
            this.field9775.field3644 = var9;
        }
        if (var4) {
            this.field9740.field3645 = var81;
            this.field9740.field3644 = var10;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
    public static final String method3862(boolean arg0, int arg1, byte arg2) {
        field9746++;
        if (arg0 && arg1 >= 0) {
            int var3 = 123 / ((37 - arg2) / 39);
            return class400.method2254(10, arg1, arg0, -81);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!mo", name = "ha", descriptor = "()I")
    public final int method2061() {
        field9732++;
        if (!this.field9717) {
            this.method3864(false);
        }
        return this.field9701;
    }

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "(I)V")
    public final void method2070(int arg0) {
        field9747++;
        int var2 = class243.field3129[arg0];
        int var3 = class243.field3128[arg0];
        for (int var4 = 0; var4 < this.field9738; var4++) {
            int var5 = this.field9711[var4] * var2 + this.field9686[var4] * var3 >> 14;
            this.field9711[var4] = this.field9711[var4] * var3 - (this.field9686[var4] * var2) >> 14;
            this.field9686[var4] = var5;
        }
        this.field9717 = false;
        if (this.field9720 != null) {
            this.field9720.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "()Z")
    public final boolean method2046() {
        field9705++;
        if (this.field9771 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field9771.length; var1++) {
            if (this.field9771[var1] != -1 && !this.field9706.field8781.method2717(this.field9771[var1], false)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    private final void method3863(int arg0) {
        field9758++;
        if (!this.field9753) {
            return;
        }
        this.field9753 = false;
        if (this.field9731 == null && this.field9709 == null && this.field9742 == null) {
            if (this.field9686 != null && !class214.method1248(-91, this.field9785, this.field9728)) {
                if (this.field9720 != null && this.field9720.field3645 == null) {
                    this.field9753 = true;
                } else {
                    if (!this.field9717) {
                        this.method3864(false);
                    }
                    this.field9686 = null;
                }
            }
            if (this.field9711 != null && !class250.method1506((byte) 101, this.field9728, this.field9785)) {
                if (this.field9720 != null && this.field9720.field3645 == null) {
                    this.field9753 = true;
                } else {
                    if (!this.field9717) {
                        this.method3864(false);
                    }
                    this.field9711 = null;
                }
            }
            if (this.field9778 != null && !class610.method3423(this.field9785, this.field9728, (byte) -59)) {
                if (this.field9720 != null && this.field9720.field3645 == null) {
                    this.field9753 = true;
                } else {
                    if (!this.field9717) {
                        this.method3864(false);
                    }
                    this.field9778 = null;
                }
            }
        }
        if (arg0 > -37) {
            this.method3871(-90, -71, -13, -25, -31, -107, (byte) 36, -85, 44);
        }
        if (this.field9744 != null && this.field9686 == null && this.field9711 == null && this.field9778 == null) {
            this.field9743 = null;
            this.field9744 = null;
        }
        if (this.field9760 != null && !class300.method1788(this.field9728, this.field9785, -1)) {
            if (this.field9740 == null) {
                if (this.field9775 != null && this.field9775.field3645 == null) {
                    this.field9753 = true;
                } else {
                    this.field9760 = null;
                    this.field9745 = this.field9796 = this.field9685 = null;
                }
            } else if (this.field9740.field3645 == null) {
                this.field9753 = true;
            } else {
                this.field9745 = this.field9796 = this.field9685 = null;
                this.field9760 = null;
            }
        }
        if (this.field9708 != null && !class406.method2281(this.field9728, this.field9785, (byte) -39)) {
            if (this.field9775 != null && this.field9775.field3645 == null) {
                this.field9753 = true;
            } else {
                this.field9708 = null;
            }
        }
        if (this.field9712 != null && !class15.method87(this.field9785, this.field9728, 256)) {
            if (this.field9775 != null && this.field9775.field3645 == null) {
                this.field9753 = true;
            } else {
                this.field9712 = null;
            }
        }
        if (this.field9756 != null && !class706.method3895(this.field9728, this.field9785, 14502)) {
            if (this.field9764 != null && this.field9764.field3645 == null) {
                this.field9753 = true;
            } else {
                this.field9756 = this.field9776 = null;
            }
        }
        if (this.field9771 != null && !class236.method1422(this.field9728, -456, this.field9785)) {
            if (this.field9775 != null && this.field9775.field3645 == null) {
                this.field9753 = true;
            } else {
                this.field9771 = null;
            }
        }
        if (this.field9773 != null && !class531.method2869(this.field9728, this.field9785, 35)) {
            if ((this.field9770 == null || this.field9770.field1880 != null) && (this.field9775 == null || this.field9775.field3645 != null)) {
                this.field9773 = this.field9730 = this.field9779 = null;
            } else {
                this.field9753 = true;
            }
        }
        if (this.field9721 != null && !class75.method599(this.field9785, (byte) 38, this.field9728)) {
            this.field9783 = null;
            this.field9721 = null;
        }
        if (this.field9769 != null && !class409.method2298(this.field9728, this.field9785, (byte) -93)) {
            this.field9723 = null;
            this.field9769 = null;
        }
        if (this.field9688 != null && !class499.method2722(121, this.field9785, this.field9728)) {
            this.field9688 = null;
        }
        if (this.field9724 != null && (this.field9785 & 0x800) == 0 && (this.field9785 & 0x40000) == 0) {
            this.field9724 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "()V")
    public final void method2052() {
        for (int var1 = 0; var1 < this.field9738; var1++) {
            this.field9778[var1] = -this.field9778[var1];
        }
        field9748++;
        for (int var2 = 0; var2 < this.field9768; var2++) {
            this.field9685[var2] = (short) (-this.field9685[var2]);
        }
        for (int var3 = 0; var3 < this.field9757; var3++) {
            short var4 = this.field9773[var3];
            this.field9773[var3] = this.field9779[var3];
            this.field9779[var3] = var4;
        }
        if (this.field9740 == null && this.field9775 != null) {
            this.field9775.field3645 = null;
        }
        if (this.field9740 != null) {
            this.field9740.field3645 = null;
        }
        if (this.field9720 != null) {
            this.field9720.field3645 = null;
        }
        this.field9717 = false;
        if (this.field9770 != null) {
            this.field9770.field1880 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
    private final void method3864(boolean arg0) {
        field9751++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        if (arg0) {
            this.field9756 = null;
        }
        int var9 = 0;
        for (int var10 = 0; var10 < this.field9738; var10++) {
            int var11 = this.field9686[var10];
            int var12 = this.field9711[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field9778[var10];
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field9762 = (short) var5;
        this.field9780 = (short) var7;
        this.field9698 = (short) var4;
        this.field9774 = (short) var3;
        this.field9750 = (short) var6;
        this.field9701 = (short) var2;
        this.field9725 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field9717 = true;
    }

    @OriginalMember(owner = "client!mo", name = "AA", descriptor = "(I)V")
    public final void method2083(int arg0) {
        field9690++;
        int var2 = class243.field3129[arg0];
        int var3 = class243.field3128[arg0];
        for (int var4 = 0; var4 < this.field9738; var4++) {
            int var5 = this.field9711[var4] * var3 - (this.field9778[var4] * var2) >> 14;
            this.field9778[var4] = this.field9778[var4] * var3 + this.field9711[var4] * var2 >> 14;
            this.field9711[var4] = var5;
        }
        if (this.field9720 != null) {
            this.field9720.field3645 = null;
        }
        this.field9717 = false;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    private final void method3865(byte arg0) {
        field9722++;
        if (this.field9714 == 0) {
            return;
        }
        if (this.field9693 != 0) {
            this.method3861(true, 0);
        }
        this.method3861(false, 0);
        if (this.field9770 != null) {
            if (this.field9770.field1880 == null) {
                this.method3874(-1, ~(this.field9693 & 0x10) != -1);
            }
            if (this.field9770.field1880 != null) {
                this.field9706.method3130(3156, this.field9740 != null);
                this.field9706.method3190(this.field9764, 32885, this.field9775, this.field9720, this.field9740);
                int var2 = this.field9724.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field9724[var3];
                    int var5 = this.field9724[var3 + 1];
                    int var6 = this.field9771[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field9706.method3170(false, this.field9740 != null, var6);
                    this.field9706.method3129(this.field9770.field1880, -75, var4 * 3, (var5 - var4) * 3, 4);
                }
            }
        }
        if (arg0 <= 21) {
            this.method2057(null, -6, -48, -25, false);
        }
        this.method3863(-39);
    }

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "()I")
    public final int method2068() {
        if (!this.field9717) {
            this.method3864(false);
        }
        field9719++;
        return this.field9762;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
    private final void method3866(int arg0) {
        if (this.field9742 != null) {
            class73 var2 = this.field9706.field7587;
            float var3 = this.field9706.method3153();
            float var4 = this.field9706.method3138();
            this.field9706.method3180(-114);
            this.field9706.method455(false);
            this.field9706.method3130(3156, false);
            this.field9706.method3190(this.field9706.field7695, 32885, null, this.field9706.field7713, null);
            for (int var5 = 0; var5 < this.field9793; var5++) {
                class331 var6 = this.field9742[var5];
                class89 var7 = this.field9694[var5];
                if (!var6.field4110 || !this.field9706.method393()) {
                    float var8 = (float) (this.field9686[var6.field4107] + this.field9686[var6.field4106] + this.field9686[var6.field4102]) * 0.3333333F;
                    float var9 = (float) (this.field9711[var6.field4107] + this.field9711[var6.field4102] + this.field9711[var6.field4106]) * 0.3333333F;
                    float var10 = (float) (this.field9778[var6.field4107] + this.field9778[var6.field4106] + this.field9778[var6.field4102]) * 0.3333333F;
                    float var11 = class539.field6794 * var10 + class411.field5281 * var8 + class254.field3276 * var9 + class437.field5501;
                    float var12 = class374.field4828 * var10 + class590.field7925 * var9 + class373.field4820 * var8 + class407.field5236;
                    float var13 = class141.field1698 * var10 + class51.field649 * var9 + class501.field6240 * var8 + class1.field1;
                    var2.method592((float) var7.field1154 + var11, -var13, var6.field4109 * var7.field1147 >> 7, (byte) 107, var6.field4105 * var7.field1151 >> 7, var7.field1149, (float) var7.field1146 - var12);
                    this.field9706.method3123(var2, -7270);
                    this.field9706.method406(var4, var3 - ((float) var6.field4108 * 1.5F));
                    int var14 = var7.field1145;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field9706.method3171(93, var6.field4112);
                    this.field9706.method3146(7261, var6.field4111);
                    this.field9706.method3120(-51, 0, 4, 7);
                }
            }
            this.field9706.method406(var4, var3);
            this.field9706.method455(true);
            this.field9706.method3172((byte) 125);
        }
        field9755++;
        if (arg0 <= 5) {
            this.method3864(true);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method2074(int arg0, int arg1, class396 arg2, boolean arg3) {
        field9729++;
        class73 var5 = (class73) arg2;
        class73 var6 = this.field9706.field7694;
        float var7 = var5.field957 * var6.field954 + var5.field972 * var6.field967 + var5.field944 * var6.field955 + var6.field972;
        float var8 = var5.field957 * var6.field962 + var5.field972 * var6.field966 + var5.field944 * var6.field973 + var6.field944;
        class590.field7925 = var5.field958 * var6.field962 + var5.field973 * var6.field973 + var5.field955 * var6.field966;
        class501.field6240 = var5.field961 * var6.field968 + var5.field967 * var6.field961 + var5.field966 * var6.field958;
        class254.field3276 = var5.field958 * var6.field954 + var5.field973 * var6.field955 + var5.field955 * var6.field967;
        class374.field4828 = var5.field968 * var6.field962 + var5.field962 * var6.field973 + var5.field954 * var6.field966;
        class411.field5281 = var5.field961 * var6.field954 + var5.field967 * var6.field967 + var5.field966 * var6.field955;
        class141.field1698 = var5.field968 * var6.field968 + var5.field962 * var6.field958 + var5.field954 * var6.field961;
        float var9 = var5.field957 * var6.field968 + var5.field972 * var6.field961 + var5.field944 * var6.field958 + var6.field957;
        class539.field6794 = var5.field968 * var6.field954 + var5.field962 * var6.field955 + var5.field954 * var6.field967;
        class373.field4820 = var5.field961 * var6.field962 + var5.field967 * var6.field966 + var5.field966 * var6.field973;
        class51.field649 = var5.field958 * var6.field968 + var5.field973 * var6.field958 + var5.field955 * var6.field961;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field9706.field7633;
        int var16 = this.field9706.field7621;
        if (!this.field9717) {
            this.method3864(false);
        }
        class164.field1935[0] = this.field9701;
        class324.field4049[0] = this.field9774;
        class307.field3879[0] = this.field9698;
        class164.field1935[1] = this.field9762;
        class324.field4049[1] = this.field9774;
        class164.field1935[2] = this.field9701;
        class307.field3879[1] = this.field9698;
        class324.field4049[2] = this.field9750;
        class307.field3879[2] = this.field9698;
        class164.field1935[3] = this.field9762;
        class324.field4049[3] = this.field9750;
        class164.field1935[4] = this.field9701;
        class307.field3879[3] = this.field9698;
        class324.field4049[4] = this.field9774;
        class307.field3879[4] = this.field9780;
        class164.field1935[5] = this.field9762;
        class324.field4049[5] = this.field9774;
        class307.field3879[5] = this.field9780;
        class164.field1935[6] = this.field9701;
        class324.field4049[6] = this.field9750;
        class164.field1935[7] = this.field9762;
        class307.field3879[6] = this.field9780;
        class324.field4049[7] = this.field9750;
        class307.field3879[7] = this.field9780;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class324.field4049[var17];
            float var39 = (float) class307.field3879[var17];
            float var40 = (float) class164.field1935[var17];
            float var41 = class539.field6794 * var39 + class411.field5281 * var40 + class254.field3276 * var38 + var7;
            float var42 = class141.field1698 * var39 + class51.field649 * var38 + class501.field6240 * var40 + var9;
            float var43 = class374.field4828 * var39 + class590.field7925 * var38 + class373.field4820 * var40 + var8;
            if ((float) this.field9706.field7696 <= var42) {
                float var44 = (float) var15 * var41 / var42 + (float) this.field9706.field7739;
                if (var11 > var44) {
                    var11 = var44;
                }
                if (var44 > var12) {
                    var12 = var44;
                }
                float var45 = (float) var16 * var43 / var42 + (float) this.field9706.field7638;
                var10 = true;
                if (var45 < var13) {
                    var13 = var45;
                }
                if (var45 > var14) {
                    var14 = var45;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && var12 > (float) arg0 && var13 < (float) arg1 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field9768 > this.field9706.field7741.length) {
                this.field9706.field7741 = new int[this.field9768];
                this.field9706.field7745 = new int[this.field9768];
            }
            int[] var18 = this.field9706.field7741;
            int[] var19 = this.field9706.field7745;
            for (int var20 = 0; var20 < this.field9738; var20++) {
                float var22 = (float) this.field9778[var20];
                float var23 = (float) this.field9686[var20];
                float var24 = (float) this.field9711[var20];
                float var25 = class539.field6794 * var22 + class411.field5281 * var23 + class254.field3276 * var24 + var7;
                float var26 = class141.field1698 * var22 + class51.field649 * var24 + class501.field6240 * var23 + var9;
                float var27 = class374.field4828 * var22 + class590.field7925 * var24 + class373.field4820 * var23 + var8;
                if (((float) this.field9706.field7696 <= var26)) {
                    int var32 = (int) ((float) var15 * var25 / var26 + (float) this.field9706.field7739);
                    int var33 = (int) ((float) var16 * var27 / var26 + (float) this.field9706.field7638);
                    int var34 = this.field9743[var20];
                    int var35 = this.field9743[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field9744[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field9743[var20];
                    int var29 = this.field9743[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field9744[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field9744[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field9757; var21++) {
                if (var18[this.field9773[var21]] != -999999 && var18[this.field9730[var21]] != -999999 && var18[this.field9779[var21]] != -999999 && this.method3871(arg0, var19[this.field9773[var21]], var18[this.field9730[var21]], var18[this.field9773[var21]], var18[this.field9779[var21]], arg1, (byte) 119, var19[this.field9730[var21]], var19[this.field9779[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "(III)V")
    public final void method2066(int arg0, int arg1, int arg2) {
        field9766++;
        for (int var4 = 0; var4 < this.field9738; var4++) {
            if (arg0 != 0) {
                this.field9686[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field9711[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field9778[var4] += arg2;
            }
        }
        this.field9717 = false;
        if (this.field9720 != null) {
            this.field9720.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "(I[IIIIIZ)V")
    public final void method2081(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field9704++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class173.field2031 = 0;
            class21.field232 = 0;
            int var12 = 0;
            class348.field4475 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field9769.length) {
                    int[] var15 = this.field9769[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class173.field2031 += this.field9686[var17];
                        class21.field232 += this.field9711[var17];
                        var12++;
                        class348.field4475 += this.field9778[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class348.field4475 = var10;
                class173.field2031 = var9;
                class21.field232 = var11;
            } else {
                class348.field4475 = class348.field4475 / var12 + var10;
                class173.field2031 = class173.field2031 / var12 + var9;
                class21.field232 = class21.field232 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg3 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field9769.length) {
                    int[] var23 = this.field9769[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field9686[var25] += var20;
                        this.field9711[var25] += var19;
                        this.field9778[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field9769.length) {
                    int[] var46 = this.field9769[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field9686[var59] -= class173.field2031;
                            this.field9711[var59] -= class21.field232;
                            this.field9778[var59] -= class348.field4475;
                            if (arg4 != 0) {
                                int var60 = class243.field3129[arg4];
                                int var61 = class243.field3128[arg4];
                                int var62 = this.field9711[var59] * var60 + (this.field9686[var59] * var61) + 16383 >> 14;
                                this.field9711[var59] = this.field9711[var59] * var61 + 16383 - this.field9686[var59] * var60 >> 14;
                                this.field9686[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class243.field3129[arg2];
                                int var64 = class243.field3128[arg2];
                                int var65 = this.field9711[var59] * var64 - (this.field9778[var59] * var63 - 16383) >> 14;
                                this.field9778[var59] = this.field9711[var59] * var63 + (this.field9778[var59] * var64) + 16383 >> 14;
                                this.field9711[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class243.field3129[arg3];
                                int var67 = class243.field3128[arg3];
                                int var68 = this.field9686[var59] * var67 + (this.field9778[var59] * var66 + 16383) >> 14;
                                this.field9778[var59] = this.field9778[var59] * var67 + 16383 - (this.field9686[var59] * var66) >> 14;
                                this.field9686[var59] = var68;
                            }
                            this.field9686[var59] += class173.field2031;
                            this.field9711[var59] += class21.field232;
                            this.field9778[var59] += class348.field4475;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field9686[var48] -= class173.field2031;
                            this.field9711[var48] -= class21.field232;
                            this.field9778[var48] -= class348.field4475;
                            if (arg2 != 0) {
                                int var49 = class243.field3129[arg2];
                                int var50 = class243.field3128[arg2];
                                int var51 = this.field9711[var48] * var50 - (this.field9778[var48] * var49 - 16383) >> 14;
                                this.field9778[var48] = this.field9711[var48] * var49 + this.field9778[var48] * var50 + 16383 >> 14;
                                this.field9711[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class243.field3129[arg4];
                                int var53 = class243.field3128[arg4];
                                int var54 = this.field9711[var48] * var52 + this.field9686[var48] * var53 + 16383 >> 14;
                                this.field9711[var48] = this.field9711[var48] * var53 + 16383 - (this.field9686[var48] * var52) >> 14;
                                this.field9686[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class243.field3129[arg3];
                                int var56 = class243.field3128[arg3];
                                int var57 = this.field9778[var48] * var55 + this.field9686[var48] * var56 + 16383 >> 14;
                                this.field9778[var48] = this.field9778[var48] * var56 + 16383 - (this.field9686[var48] * var55) >> 14;
                                this.field9686[var48] = var57;
                            }
                            this.field9686[var48] += class173.field2031;
                            this.field9711[var48] += class21.field232;
                            this.field9778[var48] += class348.field4475;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field9769.length > var28) {
                        int[] var29 = this.field9769[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field9743[var31];
                            int var33 = this.field9743[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field9744[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class243.field3129[arg4];
                                    int var37 = class243.field3128[arg4];
                                    int var38 = this.field9796[var35] * var36 + (this.field9745[var35] * var37) + 16383 >> 14;
                                    this.field9796[var35] = (short) (this.field9796[var35] * var37 + (16383 - (this.field9745[var35] * var36)) >> 14);
                                    this.field9745[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class243.field3129[arg2];
                                    int var40 = class243.field3128[arg2];
                                    int var41 = this.field9796[var35] * var40 + 16383 - (this.field9685[var35] * var39) >> 14;
                                    this.field9685[var35] = (short) (this.field9685[var35] * var40 + this.field9796[var35] * var39 + 16383 >> 14);
                                    this.field9796[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class243.field3129[arg3];
                                    int var43 = class243.field3128[arg3];
                                    int var44 = this.field9685[var35] * var42 + this.field9745[var35] * var43 + 16383 >> 14;
                                    this.field9685[var35] = (short) (this.field9685[var35] * var43 + 16383 - (this.field9745[var35] * var42) >> 14);
                                    this.field9745[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field9740 == null && this.field9775 != null) {
                    this.field9775.field3645 = null;
                }
                if (this.field9740 != null) {
                    this.field9740.field3645 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field9769.length > var70) {
                    int[] var71 = this.field9769[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field9686[var73] -= class173.field2031;
                        this.field9711[var73] -= class21.field232;
                        this.field9778[var73] -= class348.field4475;
                        this.field9686[var73] = this.field9686[var73] * arg2 >> 7;
                        this.field9711[var73] = this.field9711[var73] * arg3 >> 7;
                        this.field9778[var73] = this.field9778[var73] * arg4 >> 7;
                        this.field9686[var73] += class173.field2031;
                        this.field9711[var73] += class21.field232;
                        this.field9778[var73] += class348.field4475;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9721 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field9721.length > var78) {
                        int[] var79 = this.field9721[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field9712[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field9712[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field9775 != null) {
                            this.field9775.field3645 = null;
                        }
                    }
                }
                if (this.field9742 != null) {
                    for (int var75 = 0; var75 < this.field9793; var75++) {
                        class331 var76 = this.field9742[var75];
                        class89 var77 = this.field9694[var75];
                        var77.field1145 = 255 - (this.field9712[var76.field4115] & 0xFF) << 24 | var77.field1145 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field9721 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field9721.length > var87) {
                        int[] var88 = this.field9721[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field9708[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x38A) >> 7;
                            int var94 = arg2 + var92 & 0x3F;
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
                            this.field9708[var90] = (short) class364.method2113(var97, class364.method2113(var94 << 10, var95 << 7));
                        }
                        if (var88.length > 0 && this.field9775 != null) {
                            this.field9775.field3645 = null;
                        }
                    }
                }
                if (this.field9742 != null) {
                    for (int var84 = 0; var84 < this.field9793; var84++) {
                        class331 var85 = this.field9742[var84];
                        class89 var86 = this.field9694[var84];
                        var86.field1145 = class76.field999[this.field9708[var85.field4115] & 0xFFFF] & 0xFFFFFF | var86.field1145 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field9688 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field9688.length > var99) {
                        int[] var100 = this.field9688[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class89 var102 = this.field9694[var100[var101]];
                            var102.field1154 += arg2;
                            var102.field1146 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9688 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field9688.length) {
                        int[] var105 = this.field9688[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class89 var107 = this.field9694[var105[var106]];
                            var107.field1151 = var107.field1151 * arg2 >> 7;
                            var107.field1147 = var107.field1147 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9688 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field9688.length > var109) {
                    int[] var110 = this.field9688[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class89 var112 = this.field9694[var110[var111]];
                        var112.field1149 = var112.field1149 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "ZA", descriptor = "()I")
    public final int method2071() {
        field9691++;
        if (!this.field9717) {
            this.method3864(false);
        }
        return this.field9725;
    }

    @OriginalMember(owner = "client!mo", name = "DA", descriptor = "()I")
    public final int method2084() {
        if (!this.field9717) {
            this.method3864(false);
        }
        field9761++;
        return this.field9774;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lq;)V")
    public final void method2067(class396 arg0) {
        field9734++;
        class73 var2 = (class73) arg0;
        if (this.field9731 != null) {
            for (int var3 = 0; var3 < this.field9731.length; var3++) {
                class556 var4 = this.field9731[var3];
                class556 var5 = var4;
                if (var4.field6959 != null) {
                    var5 = var4.field6959;
                }
                var5.field6943 = (int) ((float) this.field9778[var4.field6951] * var2.field954 + (float) this.field9711[var4.field6951] * var2.field955 + (float) this.field9686[var4.field6951] * var2.field967 + var2.field972);
                var5.field6958 = (int) ((float) this.field9778[var4.field6951] * var2.field962 + (float) this.field9711[var4.field6951] * var2.field973 + (float) this.field9686[var4.field6951] * var2.field966 + var2.field944);
                var5.field6960 = (int) ((float) this.field9778[var4.field6951] * var2.field968 + (float) this.field9711[var4.field6951] * var2.field958 + (float) this.field9686[var4.field6951] * var2.field961 + var2.field957);
                var5.field6944 = (int) ((float) this.field9778[var4.field6953] * var2.field954 + (float) this.field9711[var4.field6953] * var2.field955 + (float) this.field9686[var4.field6953] * var2.field967 + var2.field972);
                var5.field6947 = (int) ((float) this.field9778[var4.field6953] * var2.field962 + (float) this.field9711[var4.field6953] * var2.field973 + (float) this.field9686[var4.field6953] * var2.field966 + var2.field944);
                var5.field6957 = (int) ((float) this.field9778[var4.field6953] * var2.field968 + (float) this.field9711[var4.field6953] * var2.field958 + (float) this.field9686[var4.field6953] * var2.field961 + var2.field957);
                var5.field6945 = (int) ((float) this.field9778[var4.field6949] * var2.field954 + (float) this.field9711[var4.field6949] * var2.field955 + (float) this.field9686[var4.field6949] * var2.field967 + var2.field972);
                var5.field6952 = (int) ((float) this.field9778[var4.field6949] * var2.field962 + (float) this.field9711[var4.field6949] * var2.field973 + (float) this.field9686[var4.field6949] * var2.field966 + var2.field944);
                var5.field6964 = (int) ((float) this.field9778[var4.field6949] * var2.field968 + (float) this.field9711[var4.field6949] * var2.field958 + (float) this.field9686[var4.field6949] * var2.field961 + var2.field957);
            }
        }
        if (this.field9709 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field9709.length; var6++) {
            class493 var7 = this.field9709[var6];
            class493 var8 = var7;
            if (var7.field6145 != null) {
                var8 = var7.field6145;
            }
            if (var7.field6142 == null) {
                var7.field6142 = var2.method576();
            } else {
                var7.field6142.method583(var2);
            }
            var8.field6141 = (int) ((float) this.field9778[var7.field6148] * var2.field954 + (float) this.field9711[var7.field6148] * var2.field955 + (float) this.field9686[var7.field6148] * var2.field967 + var2.field972);
            var8.field6151 = (int) ((float) this.field9778[var7.field6148] * var2.field962 + (float) this.field9711[var7.field6148] * var2.field973 + (float) this.field9686[var7.field6148] * var2.field966 + var2.field944);
            var8.field6147 = (int) ((float) this.field9778[var7.field6148] * var2.field968 + (float) this.field9711[var7.field6148] * var2.field958 + (float) this.field9686[var7.field6148] * var2.field961 + var2.field957);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lq;Lpo;I)V")
    public final void method2049(class396 arg0, class524 arg1, int arg2) {
        field9789++;
        if (this.field9768 == 0) {
            return;
        }
        class73 var4 = this.field9706.field7694;
        class73 var5 = (class73) arg0;
        if (!this.field9717) {
            this.method3864(false);
        }
        class51.field649 = var4.field968 * var5.field958 + var4.field961 * var5.field955 + var4.field958 * var5.field973;
        class1.field1 = var4.field968 * var5.field957 + var4.field961 * var5.field972 + var4.field958 * var5.field944 + var4.field957;
        float var6 = (float) this.field9774 * class51.field649 + class1.field1;
        float var7 = (float) this.field9750 * class51.field649 + class1.field1;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var9 = (float) (-this.field9725) + var7;
            var8 = (float) this.field9725 + var6;
        } else {
            var8 = (float) this.field9725 + var7;
            var9 = var6 - (float) this.field9725;
        }
        if ((this.field9706.field7682 <= var9) || (var8 <= (float) this.field9706.field7696)) {
            return;
        }
        class437.field5501 = var4.field954 * var5.field957 + var4.field967 * var5.field972 + var4.field955 * var5.field944 + var4.field972;
        class254.field3276 = var4.field954 * var5.field958 + var4.field967 * var5.field955 + var4.field955 * var5.field973;
        float var10 = (float) this.field9774 * class254.field3276 + class437.field5501;
        float var11 = (float) this.field9750 * class254.field3276 + class437.field5501;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var12 = ((float) (-this.field9725) + var11) * (float) this.field9706.field7633;
            var13 = ((float) this.field9725 + var10) * (float) this.field9706.field7633;
        } else {
            var12 = (var10 - (float) this.field9725) * (float) this.field9706.field7633;
            var13 = ((float) this.field9725 + var11) * (float) this.field9706.field7633;
        }
        if ((var12 / var8 >= this.field9706.field7654) || (var13 / var8 <= this.field9706.field7622)) {
            return;
        }
        class407.field5236 = var4.field962 * var5.field957 + var4.field973 * var5.field944 + var4.field966 * var5.field972 + var4.field944;
        class590.field7925 = var4.field962 * var5.field958 + var4.field973 * var5.field973 + var4.field966 * var5.field955;
        float var14 = (float) this.field9774 * class590.field7925 + class407.field5236;
        float var15 = (float) this.field9750 * class590.field7925 + class407.field5236;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = ((float) (-this.field9725) + var15) * (float) this.field9706.field7621;
            var16 = ((float) this.field9725 + var14) * (float) this.field9706.field7621;
        } else {
            var16 = ((float) this.field9725 + var15) * (float) this.field9706.field7621;
            var17 = (var14 - (float) this.field9725) * (float) this.field9706.field7621;
        }
        if ((this.field9706.field7666 <= var17 / var8) || (this.field9706.field7676 >= var16 / var8)) {
            return;
        }
        if (arg1 != null || this.field9742 != null) {
            class374.field4828 = var4.field962 * var5.field968 + var4.field973 * var5.field962 + var4.field966 * var5.field954;
            class501.field6240 = var4.field968 * var5.field961 + var4.field961 * var5.field967 + var4.field958 * var5.field966;
            class411.field5281 = var4.field954 * var5.field961 + var4.field967 * var5.field967 + var4.field955 * var5.field966;
            class141.field1698 = var4.field968 * var5.field968 + var4.field961 * var5.field954 + var4.field958 * var5.field962;
            class373.field4820 = var4.field962 * var5.field961 + var4.field973 * var5.field966 + var4.field966 * var5.field967;
            class539.field6794 = var4.field954 * var5.field968 + var4.field967 * var5.field954 + var4.field955 * var5.field962;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field9762 + this.field9701 >> 1;
            int var21 = this.field9698 + this.field9780 >> 1;
            int var22 = (int) ((float) var21 * class539.field6794 + (float) this.field9774 * class254.field3276 + (float) var20 * class411.field5281 + class437.field5501);
            int var23 = (int) ((float) var21 * class374.field4828 + (float) this.field9774 * class590.field7925 + (float) var20 * class373.field4820 + class407.field5236);
            int var24 = (int) ((float) var21 * class141.field1698 + (float) this.field9774 * class51.field649 + (float) var20 * class501.field6240 + class1.field1);
            if (var24 >= this.field9706.field7696) {
                arg1.field6627 = this.field9706.field7621 * var23 / var24 + this.field9706.field7638;
                arg1.field6624 = this.field9706.field7633 * var22 / var24 + this.field9706.field7739;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class539.field6794 + (float) this.field9750 * class254.field3276 + (float) var20 * class411.field5281 + class437.field5501);
            int var26 = (int) ((float) var21 * class374.field4828 + (float) this.field9750 * class590.field7925 + (float) var20 * class373.field4820 + class407.field5236);
            int var27 = (int) ((float) var21 * class141.field1698 + (float) this.field9750 * class51.field649 + (float) var20 * class501.field6240 + class1.field1);
            if (this.field9706.field7696 <= var27) {
                arg1.field6628 = this.field9706.field7621 * var26 / var27 + this.field9706.field7638;
                arg1.field6626 = this.field9706.field7633 * var25 / var27 + this.field9706.field7739;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field9706.field7696 && this.field9706.field7696 > var27) {
                    var19 = false;
                } else if (this.field9706.field7696 > var24) {
                    int var31 = (var27 - this.field9706.field7696 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field6624 = this.field9706.field7739 + (this.field9706.field7633 * var32 / this.field9706.field7696);
                    arg1.field6627 = this.field9706.field7621 * var33 / this.field9706.field7696 + this.field9706.field7638;
                } else if (var27 < this.field9706.field7696) {
                    int var28 = (var24 - this.field9706.field7696 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field6624 = this.field9706.field7633 * var29 / this.field9706.field7696 + this.field9706.field7739;
                    arg1.field6627 = this.field9706.field7621 * var30 / this.field9706.field7696 + this.field9706.field7638;
                }
            }
            if (var19) {
                if (var24 <= var27) {
                    arg1.field6623 = (var25 + this.field9725) * this.field9706.field7633 / var27 + this.field9706.field7739 - arg1.field6626;
                } else {
                    arg1.field6623 = (this.field9725 + var22) * this.field9706.field7633 / var24 + this.field9706.field7739 - arg1.field6624;
                }
                arg1.field6625 = true;
            }
        }
        this.field9706.method3122(122);
        this.field9706.method3116(5924, var5);
        this.method3865((byte) 105);
        this.field9706.method3172((byte) 116);
        this.method3866(77);
    }

    @OriginalMember(owner = "client!mo", name = "ka", descriptor = "(SS)V")
    public final void method2079(short arg0, short arg1) {
        field9782++;
        class498 var3 = this.field9706.field8781;
        for (int var4 = 0; var4 < this.field9757; var4++) {
            if (this.field9771[var4] == arg0) {
                this.field9771[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class152 var7 = var3.method2718(arg0 & 0xFFFF, (byte) 72);
            var5 = var7.field1820;
            var6 = var7.field1816;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class152 var10 = var3.method2718(arg1 & 0xFFFF, (byte) 72);
            var8 = var10.field1820;
            var9 = var10.field1816;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field9742 != null) {
            for (int var11 = 0; var11 < this.field9793; var11++) {
                class331 var12 = this.field9742[var11];
                class89 var13 = this.field9694[var11];
                var13.field1145 = class76.field999[this.field9708[var12.field4115] & 0xFFFF] & 0xFFFFFF | var13.field1145 & 0xFF000000;
            }
        }
        if (this.field9775 != null) {
            this.field9775.field3645 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!mo", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final void method2086(int arg0, int arg1, class140 arg2, class140 arg3, int arg4, int arg5, int arg6) {
        field9703++;
        if (!this.field9717) {
            this.method3864(false);
        }
        int var8 = this.field9701 + arg4;
        int var9 = this.field9762 + arg4;
        int var10 = arg6 + this.field9698;
        int var11 = this.field9780 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (arg2.field1686 + var9 >> arg2.field1683) >= arg2.field1685 || var10 < 0 || arg2.field1684 <= (var11 + arg2.field1686 >> arg2.field1683)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field1686 + var9 >> arg3.field1683) >= arg3.field1685 || var10 < 0 || arg3.field1684 <= (var11 + arg3.field1686 >> arg3.field1683)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field1683;
            int var13 = var9 - (1 - arg2.field1686) >> arg2.field1683;
            int var14 = var10 >> arg2.field1683;
            int var15 = var11 + arg2.field1686 - 1 >> arg2.field1683;
            if (arg5 == arg2.method201(var12, var14) && arg5 == arg2.method201(var13, var14) && arg5 == arg2.method201(var12, var15) && arg2.method201(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field9738; var16++) {
                this.field9711[var16] = this.field9711[var16] + arg2.method194(this.field9686[var16] + arg4, this.field9778[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field9774;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field9738; var18++) {
                int var19 = (this.field9711[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field9711[var18] += (arg1 - var19) * (arg2.method194(this.field9686[var18] + arg4, this.field9778[var18] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var29 = (arg1 & 0xFF) * 4;
            int var30 = ((arg1 & 0xFFD5) >> 8) * 4;
            int var31 = arg1 >> 16 & 0xFF << 6;
            int var32 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var29 >> 1)) < 0 || (arg2.field1685 << arg2.field1683) <= ((var29 >> 1) + arg2.field1686 + arg4) || (arg6 - (var30 >> 1)) < 0 || ((var30 >> 1) + arg6 + arg2.field1686) >= (arg2.field1684 << arg2.field1683)) {
                return;
            }
            this.method2082(var31, (byte) 88, var30, var29, arg5, arg2, var32, arg6, arg4);
        } else if (arg0 == 4) {
            int var27 = this.field9750 - this.field9774;
            for (int var28 = 0; var28 < this.field9738; var28++) {
                this.field9711[var28] = this.field9711[var28] + arg3.method194(this.field9686[var28] + arg4, this.field9778[var28] + arg6) + var27 - arg5;
            }
        } else if (arg0 == 5) {
            int var20 = this.field9750 - this.field9774;
            for (int var21 = 0; var21 < this.field9738; var21++) {
                int var22 = this.field9686[var21] + arg4;
                int var23 = this.field9778[var21] + arg6;
                int var24 = arg2.method194(var22, var23);
                int var25 = arg3.method194(var22, var23);
                int var26 = var24 - var25 - arg1;
                this.field9711[var21] = ((this.field9711[var21] << 8) / var20 * var26 >> 8) + var24 - arg5;
            }
        }
        this.field9717 = false;
        if (this.field9720 != null) {
            this.field9720.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "()I")
    public final int method2064() {
        field9695++;
        return this.field9790;
    }

    @OriginalMember(owner = "client!mo", name = "Z", descriptor = "(Lw;)Lw;")
    public final class279 method2055(class279 arg0) {
        field9713++;
        if (this.field9768 == 0) {
            return null;
        }
        if (!this.field9717) {
            this.method3864(false);
        }
        int var2;
        int var3;
        if (this.field9706.field7673 <= 0) {
            var2 = this.field9701 - (this.field9706.field7673 * this.field9774 >> 8) >> this.field9706.field7592;
            var3 = this.field9762 - (this.field9706.field7673 * this.field9750 >> 8) >> this.field9706.field7592;
        } else {
            var2 = this.field9701 - (this.field9706.field7673 * this.field9750 >> 8) >> this.field9706.field7592;
            var3 = this.field9762 - (this.field9706.field7673 * this.field9774 >> 8) >> this.field9706.field7592;
        }
        int var4;
        int var5;
        if (this.field9706.field7710 <= 0) {
            var4 = this.field9698 - (this.field9706.field7710 * this.field9774 >> 8) >> this.field9706.field7592;
            var5 = this.field9780 - (this.field9706.field7710 * this.field9750 >> 8) >> this.field9706.field7592;
        } else {
            var4 = this.field9698 - (this.field9706.field7710 * this.field9750 >> 8) >> this.field9706.field7592;
            var5 = this.field9780 - (this.field9706.field7710 * this.field9774 >> 8) >> this.field9706.field7592;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class266 var8 = (class266) arg0;
        class266 var9;
        if (var8 != null && var8.method1583(var6, var7, 866628848)) {
            var9 = var8;
            var8.method1581((byte) -113);
        } else {
            var9 = new class266(this.field9706, var6, var7);
        }
        var9.method1580(var5, var2, var3, var4, (byte) 119);
        this.method3869(122, var9);
        return var9;
    }

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "(I)V")
    public final void method2058(int arg0) {
        field9792++;
        int var2 = class243.field3129[arg0];
        int var3 = class243.field3128[arg0];
        for (int var4 = 0; var4 < this.field9738; var4++) {
            int var7 = this.field9778[var4] * var2 + (this.field9686[var4] * var3) >> 14;
            this.field9778[var4] = this.field9778[var4] * var3 - (this.field9686[var4] * var2) >> 14;
            this.field9686[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field9768; var5++) {
            int var6 = this.field9745[var5] * var3 + this.field9685[var5] * var2 >> 14;
            this.field9685[var5] = (short) (this.field9685[var5] * var3 - (this.field9745[var5] * var2) >> 14);
            this.field9745[var5] = (short) var6;
        }
        if (this.field9740 == null && this.field9775 != null) {
            this.field9775.field3645 = null;
        }
        if (this.field9740 != null) {
            this.field9740.field3645 = null;
        }
        this.field9717 = false;
        if (this.field9720 != null) {
            this.field9720.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lba;IIIZ)V")
    public final void method2057(class359 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9700++;
        class700 var6 = (class700) arg0;
        if (this.field9757 == 0 || var6.field9757 == 0) {
            return;
        }
        int var7 = var6.field9738;
        int[] var8 = var6.field9686;
        int[] var9 = var6.field9711;
        int[] var10 = var6.field9778;
        short[] var11 = var6.field9745;
        short[] var12 = var6.field9796;
        short[] var13 = var6.field9685;
        byte[] var14 = var6.field9760;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field9699 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var16 = this.field9699.field703;
            var18 = this.field9699.field710;
            var17 = this.field9699.field705;
            var15 = this.field9699.field706;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field9699 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field9699.field705;
            var19 = var6.field9699.field706;
            var22 = var6.field9699.field703;
            var20 = var6.field9699.field710;
        }
        int[] var23 = var6.field9743;
        short[] var24 = var6.field9744;
        if (!var6.field9717) {
            var6.method3864(false);
        }
        short var25 = var6.field9774;
        short var26 = var6.field9750;
        short var27 = var6.field9701;
        short var28 = var6.field9762;
        short var29 = var6.field9698;
        short var30 = var6.field9780;
        for (int var31 = 0; var31 < this.field9738; var31++) {
            int var32 = this.field9711[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field9686[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field9778[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field9743[var31];
                        int var37 = this.field9743[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field9744[var38] - 1;
                            if (var35 == -1 || this.field9760[var35] != 0) {
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
                                        if (var16 == null) {
                                            this.field9699 = new class55();
                                            var16 = this.field9699.field703 = class475.method2579(this.field9745, -28073);
                                            var18 = this.field9699.field710 = class475.method2579(this.field9796, -28073);
                                            var15 = this.field9699.field706 = class475.method2579(this.field9685, -28073);
                                            var17 = this.field9699.field705 = class11.method50(this.field9760, (byte) -92);
                                        }
                                        if (var22 == null) {
                                            class55 var44 = var6.field9699 = new class55();
                                            var22 = var44.field703 = class475.method2579(var11, -28073);
                                            var20 = var44.field710 = class475.method2579(var12, -28073);
                                            var19 = var44.field706 = class475.method2579(var13, -28073);
                                            var21 = var44.field705 = class11.method50(var14, (byte) -92);
                                        }
                                        short var45 = this.field9745[var35];
                                        short var46 = this.field9796[var35];
                                        short var47 = this.field9685[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field9760[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var22[var52] += var45;
                                                var20[var52] += var46;
                                                var19[var52] += var47;
                                                var21[var52] += var50;
                                            }
                                        }
                                        byte var53 = var14[var42];
                                        int var54 = this.field9743[var31];
                                        int var55 = this.field9743[var31 + 1];
                                        short var56 = var11[var42];
                                        short var57 = var12[var42];
                                        short var58 = var13[var42];
                                        for (int var59 = var54; var59 < var55; var59++) {
                                            int var60 = this.field9744[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var56;
                                                var18[var60] += var57;
                                                var15[var60] += var58;
                                                var17[var60] += var53;
                                            }
                                        }
                                        if (this.field9740 == null && this.field9775 != null) {
                                            this.field9775.field3645 = null;
                                        }
                                        if (this.field9740 != null) {
                                            this.field9740.field3645 = null;
                                        }
                                        if (var6.field9740 == null && var6.field9775 != null) {
                                            var6.field9775.field3645 = null;
                                        }
                                        if (var6.field9740 != null) {
                                            var6.field9740.field3645 = null;
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

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "()[Let;")
    public final class556[] method2077() {
        field9741++;
        return this.field9731;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "()[Lfd;")
    public final class493[] method2063() {
        field9788++;
        return this.field9709;
    }

    @OriginalMember(owner = "client!mo", name = "Y", descriptor = "()V")
    public final void method2056() {
        for (int var1 = 0; var1 < this.field9718; var1++) {
            this.field9686[var1] = this.field9686[var1] + 7 >> 4;
            this.field9711[var1] = this.field9711[var1] + 7 >> 4;
            this.field9778[var1] = this.field9778[var1] + 7 >> 4;
        }
        field9727++;
        this.field9717 = false;
        if (this.field9720 != null) {
            this.field9720.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJ)V")
    public static final void method3867(int arg0, long arg1) {
        field9739++;
        if (arg1 <= 0L || arg0 != 29279) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class174.method1044((byte) -61, arg1 - 1L);
            class174.method1044((byte) -61, 1L);
        } else {
            class174.method1044((byte) -61, arg1);
        }
    }

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "()Z")
    public final boolean method2091() {
        field9786++;
        if (this.field9769 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field9718; var1++) {
            this.field9686[var1] <<= 0x4;
            this.field9711[var1] <<= 0x4;
            this.field9778[var1] <<= 0x4;
        }
        class173.field2031 = 0;
        class348.field4475 = 0;
        class21.field232 = 0;
        return true;
    }

    @OriginalMember(owner = "client!mo", name = "ua", descriptor = "(IIII)V")
    public final void method2076(int arg0, int arg1, int arg2, int arg3) {
        field9692++;
        if (arg0 == 0) {
            class173.field2031 = 0;
            int var5 = 0;
            class21.field232 = 0;
            class348.field4475 = 0;
            for (int var6 = 0; var6 < this.field9738; var6++) {
                class173.field2031 += this.field9686[var6];
                class21.field232 += this.field9711[var6];
                class348.field4475 += this.field9778[var6];
                var5++;
            }
            if (var5 > 0) {
                class173.field2031 = class173.field2031 / var5 + arg1;
                class348.field4475 = class348.field4475 / var5 + arg3;
                class21.field232 = class21.field232 / var5 + arg2;
            } else {
                class173.field2031 = arg1;
                class348.field4475 = arg3;
                class21.field232 = arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field9738; var7++) {
                this.field9686[var7] += arg1;
                this.field9711[var7] += arg2;
                this.field9778[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field9738; var8++) {
                this.field9686[var8] -= class173.field2031;
                this.field9711[var8] -= class21.field232;
                this.field9778[var8] -= class348.field4475;
                if (arg3 != 0) {
                    int var9 = class243.field3129[arg3];
                    int var10 = class243.field3128[arg3];
                    int var11 = this.field9711[var8] * var9 + this.field9686[var8] * var10 + 16383 >> 14;
                    this.field9711[var8] = this.field9711[var8] * var10 + 16383 - (this.field9686[var8] * var9) >> 14;
                    this.field9686[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class243.field3129[arg1];
                    int var13 = class243.field3128[arg1];
                    int var14 = this.field9711[var8] * var13 + 16383 - this.field9778[var8] * var12 >> 14;
                    this.field9778[var8] = this.field9778[var8] * var13 + this.field9711[var8] * var12 + 16383 >> 14;
                    this.field9711[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class243.field3129[arg2];
                    int var16 = class243.field3128[arg2];
                    int var17 = this.field9778[var8] * var15 + this.field9686[var8] * var16 + 16383 >> 14;
                    this.field9778[var8] = this.field9778[var8] * var16 + 16383 - (this.field9686[var8] * var15) >> 14;
                    this.field9686[var8] = var17;
                }
                this.field9686[var8] += class173.field2031;
                this.field9711[var8] += class21.field232;
                this.field9778[var8] += class348.field4475;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field9738; var18++) {
                this.field9686[var18] -= class173.field2031;
                this.field9711[var18] -= class21.field232;
                this.field9778[var18] -= class348.field4475;
                this.field9686[var18] = this.field9686[var18] * arg1 / 128;
                this.field9711[var18] = this.field9711[var18] * arg2 / 128;
                this.field9778[var18] = this.field9778[var18] * arg3 / 128;
                this.field9686[var18] += class173.field2031;
                this.field9711[var18] += class21.field232;
                this.field9778[var18] += class348.field4475;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field9757; var19++) {
                int var23 = (this.field9712[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field9712[var19] = (byte) var23;
            }
            if (this.field9775 != null) {
                this.field9775.field3645 = null;
            }
            if (this.field9742 != null) {
                for (int var20 = 0; var20 < this.field9793; var20++) {
                    class331 var21 = this.field9742[var20];
                    class89 var22 = this.field9694[var20];
                    var22.field1145 = 255 - (this.field9712[var21.field4115] & 0xFF) << 24 | var22.field1145 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field9757; var24++) {
                int var28 = this.field9708[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg2 / 4 + var30;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = var28 & 0x7F;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                int var34 = arg3 + var33;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field9708[var24] = (short) class364.method2113(var34, class364.method2113(var31 << 7, var32 << 10));
            }
            if (this.field9775 != null) {
                this.field9775.field3645 = null;
            }
            if (this.field9742 != null) {
                for (int var25 = 0; var25 < this.field9793; var25++) {
                    class331 var26 = this.field9742[var25];
                    class89 var27 = this.field9694[var25];
                    var27.field1145 = var27.field1145 & 0xFF000000 | class76.field999[this.field9708[var26.field4115] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field9793; var35++) {
                class89 var36 = this.field9694[var35];
                var36.field1146 += arg2;
                var36.field1154 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field9793; var37++) {
                class89 var38 = this.field9694[var37];
                var38.field1151 = var38.field1151 * arg1 >> 7;
                var38.field1147 = var38.field1147 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field9793; var39++) {
                class89 var40 = this.field9694[var39];
                var40.field1149 = var40.field1149 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(SIBII)I")
    private final int method3868(short arg0, int arg1, byte arg2, int arg3, int arg4) {
        field9772++;
        if (arg3 != 16777215) {
            return -8;
        }
        int var6 = class76.field999[class165.method1009(arg4, (byte) -125, arg1)];
        if (arg0 != -1) {
            class152 var7 = this.field9706.field8781.method2718(arg0 & 0xFFFF, (byte) 72);
            int var8 = var7.field1820 & 0xFF;
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
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field1816 & 0xFF;
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
                var6 = (var15 >> 8) + ((var13 & 0x4400FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return 255 - ((arg2 & 0xFF) - (var6 << 8));
    }

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "()I")
    public final int method2054() {
        if (!this.field9717) {
            this.method3864(false);
        }
        field9687++;
        return this.field9780;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILuu;)V")
    private final void method3869(int arg0, class266 arg1) {
        field9736++;
        if (this.field9706.field7741.length < this.field9768) {
            this.field9706.field7741 = new int[this.field9768];
            this.field9706.field7745 = new int[this.field9768];
        }
        if (arg0 < 117) {
            return;
        }
        int[] var3 = this.field9706.field7741;
        int[] var4 = this.field9706.field7745;
        for (int var5 = 0; var5 < this.field9738; var5++) {
            int var16 = (this.field9686[var5] - (this.field9711[var5] * this.field9706.field7673 >> 8) >> this.field9706.field7592) - arg1.field3371;
            int var17 = (this.field9778[var5] - (this.field9711[var5] * this.field9706.field7710 >> 8) >> this.field9706.field7592) - arg1.field3366;
            int var18 = this.field9743[var5];
            int var19 = this.field9743[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field9744[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field9714; var6++) {
            if (this.field9712 == null || this.field9712[var6] <= 128) {
                short var7 = this.field9773[var6];
                short var8 = this.field9730[var6];
                short var9 = this.field9779[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - (var12 - var11) * (var14 - var13) > 0) {
                    arg1.method1582(943665136, var14, var12, var11, var10, var13, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "ia", descriptor = "(I)V")
    public final void method2069(int arg0) {
        this.field9785 = arg0;
        field9767++;
        if (this.field9699 != null && (this.field9785 & 0x10000) == 0) {
            this.field9760 = this.field9699.field705;
            this.field9796 = this.field9699.field710;
            this.field9745 = this.field9699.field703;
            this.field9685 = this.field9699.field706;
            this.field9699 = null;
        }
        this.field9753 = true;
        this.method3863(-110);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BIZ)Lba;")
    public final class359 method951(byte arg0, int arg1, boolean arg2) {
        field9759++;
        class700 var4;
        class700 var5;
        if (arg0 == 1) {
            var4 = this.field9706.field7684;
            var5 = this.field9706.field7722;
        } else if (arg0 == 2) {
            var5 = this.field9706.field7693;
            var4 = this.field9706.field7721;
        } else if (arg0 == 3) {
            var4 = this.field9706.field7642;
            var5 = this.field9706.field7688;
        } else if (arg0 == 4) {
            var5 = this.field9706.field7672;
            var4 = this.field9706.field7631;
        } else if (arg0 == 5) {
            var4 = this.field9706.field7691;
            var5 = this.field9706.field7630;
        } else {
            var5 = var4 = new class700(this.field9706);
        }
        return this.method3873(var5, arg0 != 0, var4, (byte) 94, arg1, arg2);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Z")
    public static final boolean method3870(int arg0, int arg1, int arg2) {
        field9752++;
        return arg1 == 65280 ? class242.method1446((byte) -72, arg2, arg0) & class58.method501(arg2, arg0, (byte) 94) : true;
    }

    @OriginalMember(owner = "client!mo", name = "UA", descriptor = "(SS)V")
    public final void method2080(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field9757; var3++) {
            if (this.field9708[var3] == arg0) {
                this.field9708[var3] = arg1;
            }
        }
        field9794++;
        if (this.field9742 != null) {
            for (int var4 = 0; var4 < this.field9793; var4++) {
                class331 var5 = this.field9742[var4];
                class89 var6 = this.field9694[var4];
                var6.field1145 = var6.field1145 & 0xFF000000 | class76.field999[this.field9708[var5.field4115] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field9775 != null) {
            this.field9775.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "LA", descriptor = "()I")
    public final int method2089() {
        field9726++;
        if (!this.field9717) {
            this.method3864(false);
        }
        return this.field9698;
    }

    @OriginalMember(owner = "client!mo", name = "va", descriptor = "(I)V")
    public final void method2048(int arg0) {
        field9715++;
        if (this.field9775 != null) {
            this.field9775.field3645 = null;
        }
        this.field9733 = (short) arg0;
        if (this.field9740 != null) {
            this.field9740.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "EA", descriptor = "()I")
    public final int method2085() {
        field9777++;
        if (!this.field9717) {
            this.method3864(false);
        }
        return this.field9750;
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "()V")
    public final void method2090() {
        field9737++;
        if (this.field9768 <= 0 || this.field9714 <= 0) {
            return;
        }
        this.method3861(false, 0);
        if ((this.field9693 & 0x10) == 0 && this.field9770.field1880 == null) {
            this.method3874(-1, false);
        }
        this.method3863(-79);
    }

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "(III)V")
    public final void method2088(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field9738; var4++) {
            if (arg0 != 128) {
                this.field9686[var4] = this.field9686[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field9711[var4] = this.field9711[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field9778[var4] = this.field9778[var4] * arg2 >> 7;
            }
        }
        field9689++;
        this.field9717 = false;
        if (this.field9720 != null) {
            this.field9720.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lq;Lpo;II)V")
    public final void method2059(class396 arg0, class524 arg1, int arg2, int arg3) {
        field9696++;
        if (this.field9768 == 0) {
            return;
        }
        class73 var5 = this.field9706.field7694;
        if (!this.field9717) {
            this.method3864(false);
        }
        class73 var6 = (class73) arg0;
        class51.field649 = var5.field968 * var6.field958 + var5.field961 * var6.field955 + var5.field958 * var6.field973;
        class1.field1 = var5.field968 * var6.field957 + var5.field961 * var6.field972 + var5.field958 * var6.field944 + var5.field957;
        float var7 = (float) this.field9774 * class51.field649 + class1.field1;
        float var8 = (float) this.field9750 * class51.field649 + class1.field1;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) this.field9725 + var7;
            var10 = (float) (-this.field9725) + var8;
        } else {
            var10 = var7 - (float) this.field9725;
            var9 = (float) this.field9725 + var8;
        }
        if ((this.field9706.field7692 <= var10) || (var9 <= (float) this.field9706.field7696)) {
            return;
        }
        class254.field3276 = var5.field954 * var6.field958 + var5.field967 * var6.field955 + var5.field955 * var6.field973;
        class437.field5501 = var5.field954 * var6.field957 + var5.field967 * var6.field972 + var5.field955 * var6.field944 + var5.field972;
        float var11 = (float) this.field9774 * class254.field3276 + class437.field5501;
        float var12 = (float) this.field9750 * class254.field3276 + class437.field5501;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var14 = ((float) (-this.field9725) + var12) * (float) this.field9706.field7633;
            var13 = ((float) this.field9725 + var11) * (float) this.field9706.field7633;
        } else {
            var13 = ((float) this.field9725 + var12) * (float) this.field9706.field7633;
            var14 = (var11 - (float) this.field9725) * (float) this.field9706.field7633;
        }
        if ((var14 / (float) arg2 >= this.field9706.field7654) || (this.field9706.field7622 >= var13 / (float) arg2)) {
            return;
        }
        class590.field7925 = var5.field962 * var6.field958 + var5.field973 * var6.field973 + var5.field966 * var6.field955;
        class407.field5236 = var5.field962 * var6.field957 + var5.field973 * var6.field944 + var5.field966 * var6.field972 + var5.field944;
        float var15 = (float) this.field9774 * class590.field7925 + class407.field5236;
        float var16 = (float) this.field9750 * class590.field7925 + class407.field5236;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var17 = ((float) this.field9725 + var15) * (float) this.field9706.field7621;
            var18 = (var16 - (float) this.field9725) * (float) this.field9706.field7621;
        } else {
            var17 = ((float) this.field9725 + var16) * (float) this.field9706.field7621;
            var18 = (var15 - (float) this.field9725) * (float) this.field9706.field7621;
        }
        if ((var18 / (float) arg2 >= this.field9706.field7666) || (var17 / (float) arg2 <= this.field9706.field7676)) {
            return;
        }
        if (arg1 != null || this.field9742 != null) {
            class373.field4820 = var5.field962 * var6.field961 + var5.field973 * var6.field966 + var5.field966 * var6.field967;
            class411.field5281 = var5.field954 * var6.field961 + var5.field967 * var6.field967 + var5.field955 * var6.field966;
            class539.field6794 = var5.field954 * var6.field968 + var5.field967 * var6.field954 + var5.field955 * var6.field962;
            class501.field6240 = var5.field968 * var6.field961 + var5.field961 * var6.field967 + var5.field958 * var6.field966;
            class374.field4828 = var5.field962 * var6.field968 + var5.field973 * var6.field962 + var5.field966 * var6.field954;
            class141.field1698 = var5.field968 * var6.field968 + var5.field961 * var6.field954 + var5.field958 * var6.field962;
        }
        if (arg1 != null) {
            int var19 = this.field9762 + this.field9701 >> 1;
            int var20 = this.field9780 + this.field9698 >> 1;
            int var21 = (int) ((float) var20 * class539.field6794 + (float) this.field9774 * class254.field3276 + (float) var19 * class411.field5281 + class437.field5501);
            int var22 = (int) ((float) var20 * class374.field4828 + (float) this.field9774 * class590.field7925 + (float) var19 * class373.field4820 + class407.field5236);
            int var23 = (int) ((float) var20 * class141.field1698 + (float) this.field9774 * class51.field649 + (float) var19 * class501.field6240 + class1.field1);
            int var24 = (int) ((float) var20 * class539.field6794 + (float) this.field9750 * class254.field3276 + (float) var19 * class411.field5281 + class437.field5501);
            int var25 = (int) ((float) var20 * class374.field4828 + (float) this.field9750 * class590.field7925 + (float) var19 * class373.field4820 + class407.field5236);
            arg1.field6624 = this.field9706.field7739 + (this.field9706.field7633 * var21 / arg2);
            arg1.field6626 = this.field9706.field7633 * var24 / arg2 + this.field9706.field7739;
            arg1.field6628 = this.field9706.field7621 * var25 / arg2 + this.field9706.field7638;
            arg1.field6627 = this.field9706.field7638 + (this.field9706.field7621 * var22 / arg2);
            int var26 = (int) ((float) var20 * class141.field1698 + (float) this.field9750 * class51.field649 + (float) var19 * class501.field6240 + class1.field1);
            if (var23 < this.field9706.field7696 && var26 < this.field9706.field7696) {
                arg1.field6623 = (var21 + this.field9725) * this.field9706.field7633 / arg2 + this.field9706.field7739 - arg1.field6624;
                arg1.field6625 = true;
            }
        }
        this.field9706.method3159(-4189, (float) arg2);
        this.field9706.method3117((byte) 119);
        this.field9706.method3116(5924, var6);
        this.method3865((byte) 79);
        this.field9706.method3172((byte) 120);
        this.method3866(40);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIII)V")
    public final void method2060(int arg0, int arg1, int arg2, int arg3) {
        field9716++;
        for (int var5 = 0; var5 < this.field9757; var5++) {
            int var9 = this.field9708[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field9708[var5] = (short) class364.method2113(var12, class364.method2113(var11 << 7, var10 << 10));
        }
        if (this.field9742 != null) {
            for (int var6 = 0; var6 < this.field9793; var6++) {
                class331 var7 = this.field9742[var6];
                class89 var8 = this.field9694[var6];
                var8.field1145 = var8.field1145 & 0xFF000000 | class76.field999[this.field9708[var7.field4115] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field9775 != null) {
            this.field9775.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIIBII)Z")
    private final boolean method3871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field9702++;
        if (arg1 > arg5 && arg5 < arg7 && arg5 < arg8) {
            return false;
        } else if (arg1 < arg5 && arg5 > arg7 && arg8 < arg5) {
            return false;
        } else if (arg0 < arg3 && arg0 < arg2 && arg4 > arg0) {
            return false;
        } else if (arg3 < arg0 && arg2 < arg0 && arg4 < arg0) {
            return false;
        } else {
            if (arg6 < 109) {
                this.method2084();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(FFIIIJILnj;II)S")
    private final short method3872(float arg0, float arg1, int arg2, int arg3, int arg4, long arg5, int arg6, class229 arg7, int arg8, int arg9) {
        field9784++;
        int var12 = this.field9743[arg4];
        int var13 = this.field9743[arg4 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field9744[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class186.field2191[var15] == arg5) {
                return (short) (var16 - 1);
            }
        }
        this.field9744[var14] = (short) (this.field9768 + arg6);
        class186.field2191[var14] = arg5;
        this.field9745[this.field9768] = (short) arg9;
        this.field9796[this.field9768] = (short) arg8;
        this.field9685[this.field9768] = (short) arg2;
        this.field9760[this.field9768] = (byte) arg3;
        this.field9756[this.field9768] = arg0;
        this.field9776[this.field9768] = arg1;
        return (short) (this.field9768++);
    }

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "(I)V")
    public final void method2072(int arg0) {
        if (this.field9775 != null) {
            this.field9775.field3645 = null;
        }
        this.field9790 = (short) arg0;
        field9710++;
    }

    @OriginalMember(owner = "client!mo", name = "F", descriptor = "()I")
    public final int method2062() {
        field9754++;
        return this.field9733;
    }

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "(I)V")
    public final void method2053(int arg0) {
        field9697++;
        int var2 = class243.field3129[arg0];
        int var3 = class243.field3128[arg0];
        for (int var4 = 0; var4 < this.field9738; var4++) {
            int var5 = this.field9778[var4] * var2 + (this.field9686[var4] * var3) >> 14;
            this.field9778[var4] = this.field9778[var4] * var3 - (this.field9686[var4] * var2) >> 14;
            this.field9686[var4] = var5;
        }
        this.field9717 = false;
        if (this.field9720 != null) {
            this.field9720.field3645 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lmo;ZLmo;BIZ)Lba;")
    private final class359 method3873(class700 arg0, boolean arg1, class700 arg2, byte arg3, int arg4, boolean arg5) {
        arg0.field9714 = this.field9714;
        arg0.field9768 = this.field9768;
        arg0.field9757 = this.field9757;
        arg0.field9793 = this.field9793;
        arg0.field9693 = 0;
        field9749++;
        arg0.field9790 = this.field9790;
        arg0.field9785 = arg4;
        arg0.field9738 = this.field9738;
        arg0.field9733 = this.field9733;
        arg0.field9728 = this.field9728;
        arg0.field9718 = this.field9718;
        boolean var7 = class518.method2808(arg4, arg3 ^ 0x28, this.field9728);
        boolean var8 = class45.method276(arg4, 1895, this.field9728);
        boolean var9 = class253.method1525(arg4, this.field9728, (byte) 123);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg0.field9686 = this.field9686;
            } else if (arg2.field9686 == null || arg2.field9686.length < this.field9718) {
                arg0.field9686 = arg2.field9686 = new int[this.field9718];
            } else {
                arg0.field9686 = arg2.field9686;
            }
            if (!var8) {
                arg0.field9711 = this.field9711;
            } else if (arg2.field9711 == null || this.field9718 > arg2.field9711.length) {
                arg0.field9711 = arg2.field9711 = new int[this.field9718];
            } else {
                arg0.field9711 = arg2.field9711;
            }
            if (!var9) {
                arg0.field9778 = this.field9778;
            } else if (arg2.field9778 == null || this.field9718 > arg2.field9778.length) {
                arg0.field9778 = arg2.field9778 = new int[this.field9718];
            } else {
                arg0.field9778 = arg2.field9778;
            }
            for (int var11 = 0; var11 < this.field9718; var11++) {
                if (var7) {
                    arg0.field9686[var11] = this.field9686[var11];
                }
                if (var8) {
                    arg0.field9711[var11] = this.field9711[var11];
                }
                if (var9) {
                    arg0.field9778[var11] = this.field9778[var11];
                }
            }
        } else {
            arg0.field9686 = this.field9686;
            arg0.field9778 = this.field9778;
            arg0.field9711 = this.field9711;
        }
        if (class632.method3547((byte) 104, arg4, this.field9728)) {
            if (arg1) {
                arg0.field9693 = (byte) (arg0.field9693 | 0x1);
            }
            arg0.field9720 = arg2.field9720;
            arg0.field9720.field3644 = this.field9720.field3644;
            arg0.field9720.field3645 = this.field9720.field3645;
        } else if (class617.method3442(arg4, -1, this.field9728)) {
            arg0.field9720 = this.field9720;
        } else {
            arg0.field9720 = null;
        }
        if (class430.method2365(true, arg4, this.field9728)) {
            if (arg2.field9708 == null || arg2.field9708.length < this.field9757) {
                arg0.field9708 = arg2.field9708 = new short[this.field9757];
            } else {
                arg0.field9708 = arg2.field9708;
            }
            for (int var12 = 0; var12 < this.field9757; var12++) {
                arg0.field9708[var12] = this.field9708[var12];
            }
        } else {
            arg0.field9708 = this.field9708;
        }
        if (class448.method2446(arg4, this.field9728, 95)) {
            if (arg2.field9712 == null || this.field9757 > arg2.field9712.length) {
                arg0.field9712 = arg2.field9712 = new byte[this.field9757];
            } else {
                arg0.field9712 = arg2.field9712;
            }
            for (int var13 = 0; var13 < this.field9757; var13++) {
                arg0.field9712[var13] = this.field9712[var13];
            }
        } else {
            arg0.field9712 = this.field9712;
        }
        if (class273.method1626((byte) -39, arg4, this.field9728)) {
            if (arg1) {
                arg0.field9693 = (byte) (arg0.field9693 | 0x2);
            }
            arg0.field9775 = arg2.field9775;
            arg0.field9775.field3644 = this.field9775.field3644;
            arg0.field9775.field3645 = this.field9775.field3645;
        } else if (class569.method3017(arg4, this.field9728, 0)) {
            arg0.field9775 = this.field9775;
        } else {
            arg0.field9775 = null;
        }
        if (class73.method587(arg4, this.field9728, (byte) 64)) {
            if (arg2.field9745 == null || arg2.field9745.length < this.field9768) {
                int var14 = this.field9768;
                arg0.field9685 = arg2.field9685 = new short[var14];
                arg0.field9796 = arg2.field9796 = new short[var14];
                arg0.field9745 = arg2.field9745 = new short[var14];
            } else {
                arg0.field9796 = arg2.field9796;
                arg0.field9685 = arg2.field9685;
                arg0.field9745 = arg2.field9745;
            }
            if (this.field9699 == null) {
                for (int var18 = 0; var18 < this.field9768; var18++) {
                    arg0.field9745[var18] = this.field9745[var18];
                    arg0.field9796[var18] = this.field9796[var18];
                    arg0.field9685[var18] = this.field9685[var18];
                }
            } else {
                if (arg2.field9699 == null) {
                    arg2.field9699 = new class55();
                }
                class55 var15 = arg0.field9699 = arg2.field9699;
                if (var15.field703 == null || this.field9768 > var15.field703.length) {
                    int var16 = this.field9768;
                    var15.field706 = new short[var16];
                    var15.field710 = new short[var16];
                    var15.field703 = new short[var16];
                    var15.field705 = new byte[var16];
                }
                for (int var17 = 0; var17 < this.field9768; var17++) {
                    arg0.field9745[var17] = this.field9745[var17];
                    arg0.field9796[var17] = this.field9796[var17];
                    arg0.field9685[var17] = this.field9685[var17];
                    var15.field703[var17] = this.field9699.field703[var17];
                    var15.field710[var17] = this.field9699.field710[var17];
                    var15.field706[var17] = this.field9699.field706[var17];
                    var15.field705[var17] = this.field9699.field705[var17];
                }
            }
            arg0.field9760 = this.field9760;
        } else {
            arg0.field9699 = this.field9699;
            arg0.field9760 = this.field9760;
            arg0.field9685 = this.field9685;
            arg0.field9745 = this.field9745;
            arg0.field9796 = this.field9796;
        }
        if (class394.method2236(arg4, this.field9728, true)) {
            if (arg1) {
                arg0.field9693 = (byte) (arg0.field9693 | 0x4);
            }
            arg0.field9740 = arg2.field9740;
            arg0.field9740.field3644 = this.field9740.field3644;
            arg0.field9740.field3645 = this.field9740.field3645;
        } else if (class525.method2833(this.field9728, 119, arg4)) {
            arg0.field9740 = this.field9740;
        } else {
            arg0.field9740 = null;
        }
        if (class242.method1446((byte) -72, arg4, this.field9728)) {
            if (arg2.field9756 == null || arg2.field9756.length < this.field9757) {
                int var19 = this.field9768;
                arg0.field9776 = arg2.field9776 = new float[var19];
                arg0.field9756 = arg2.field9756 = new float[var19];
            } else {
                arg0.field9756 = arg2.field9756;
                arg0.field9776 = arg2.field9776;
            }
            for (int var20 = 0; var20 < this.field9768; var20++) {
                arg0.field9756[var20] = this.field9756[var20];
                arg0.field9776[var20] = this.field9776[var20];
            }
        } else {
            arg0.field9756 = this.field9756;
            arg0.field9776 = this.field9776;
        }
        if (method3870(this.field9728, 65280, arg4)) {
            if (arg1) {
                arg0.field9693 = (byte) (arg0.field9693 | 0x8);
            }
            arg0.field9764 = arg2.field9764;
            arg0.field9764.field3644 = this.field9764.field3644;
            arg0.field9764.field3645 = this.field9764.field3645;
        } else if (class58.method501(arg4, this.field9728, (byte) 109)) {
            arg0.field9764 = this.field9764;
        } else {
            arg0.field9764 = null;
        }
        if (arg3 != 94) {
            this.method2048(-78);
        }
        if (class650.method3627(arg4, 1, this.field9728)) {
            if (arg2.field9773 == null || this.field9757 > arg2.field9773.length) {
                int var21 = this.field9757;
                arg0.field9779 = arg2.field9779 = new short[var21];
                arg0.field9773 = arg2.field9773 = new short[var21];
                arg0.field9730 = arg2.field9730 = new short[var21];
            } else {
                arg0.field9730 = arg2.field9730;
                arg0.field9779 = arg2.field9779;
                arg0.field9773 = arg2.field9773;
            }
            for (int var22 = 0; var22 < this.field9757; var22++) {
                arg0.field9773[var22] = this.field9773[var22];
                arg0.field9730[var22] = this.field9730[var22];
                arg0.field9779[var22] = this.field9779[var22];
            }
        } else {
            arg0.field9779 = this.field9779;
            arg0.field9730 = this.field9730;
            arg0.field9773 = this.field9773;
        }
        if (class97.method718(64, arg4, this.field9728)) {
            arg0.field9770 = arg2.field9770;
            if (arg1) {
                arg0.field9693 = (byte) (arg0.field9693 | 0x10);
            }
            arg0.field9770.field1880 = this.field9770.field1880;
        } else if (class339.method1946(arg4, this.field9728, (byte) -42)) {
            arg0.field9770 = this.field9770;
        } else {
            arg0.field9770 = null;
        }
        if (class92.method680(this.field9728, arg4, arg3 ^ 0x2A)) {
            if (arg2.field9771 == null || arg2.field9771.length < this.field9757) {
                int var23 = this.field9757;
                arg0.field9771 = arg2.field9771 = new short[var23];
            } else {
                arg0.field9771 = arg2.field9771;
            }
            for (int var24 = 0; var24 < this.field9757; var24++) {
                arg0.field9771[var24] = this.field9771[var24];
            }
        } else {
            arg0.field9771 = this.field9771;
        }
        if (!class410.method2302(this.field9728, arg4, (byte) -3)) {
            arg0.field9694 = this.field9694;
        } else if (arg2.field9694 == null || this.field9793 > arg2.field9694.length) {
            int var26 = this.field9793;
            arg0.field9694 = arg2.field9694 = new class89[var26];
            for (int var27 = 0; var27 < this.field9793; var27++) {
                arg0.field9694[var27] = this.field9694[var27].method665(arg3 - 7179);
            }
        } else {
            arg0.field9694 = arg2.field9694;
            for (int var25 = 0; var25 < this.field9793; var25++) {
                arg0.field9694[var25].method666(true, this.field9694[var25]);
            }
        }
        arg0.field9743 = this.field9743;
        arg0.field9721 = this.field9721;
        arg0.field9724 = this.field9724;
        arg0.field9744 = this.field9744;
        arg0.field9731 = this.field9731;
        arg0.field9783 = this.field9783;
        if (this.field9717) {
            arg0.field9774 = this.field9774;
            arg0.field9698 = this.field9698;
            arg0.field9780 = this.field9780;
            arg0.field9750 = this.field9750;
            arg0.field9762 = this.field9762;
            arg0.field9725 = this.field9725;
            arg0.field9701 = this.field9701;
            arg0.field9717 = true;
        } else {
            arg0.field9717 = false;
        }
        arg0.field9769 = this.field9769;
        arg0.field9742 = this.field9742;
        arg0.field9688 = this.field9688;
        arg0.field9723 = this.field9723;
        arg0.field9709 = this.field9709;
        return arg0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V")
    private final void method3874(int arg0, boolean arg1) {
        field9735++;
        if (this.field9714 * 6 > this.field9706.field7738.field7318.length) {
            this.field9706.field7738 = new class113((this.field9714 + 100) * 6);
        } else {
            this.field9706.field7738.field7313 = 0;
        }
        class113 var3 = this.field9706.field7738;
        if (this.field9706.field7643) {
            for (int var5 = 0; var5 < this.field9714; var5++) {
                var3.method3080((byte) -97, this.field9773[var5]);
                var3.method3080((byte) -56, this.field9730[var5]);
                var3.method3080((byte) -111, this.field9779[var5]);
            }
        } else {
            for (int var4 = 0; var4 < this.field9714; var4++) {
                var3.method3060(-32768, this.field9773[var4]);
                var3.method3060(-32768, this.field9730[var4]);
                var3.method3060(arg0 ^ 0x7FFF, this.field9779[var4]);
            }
        }
        if (~var3.field7313 == arg0) {
            return;
        }
        if (arg1) {
            if (this.field9781 == null) {
                this.field9781 = this.field9706.method3150(var3.field7318, 5123, var3.field7313, (byte) 31, true);
            } else {
                this.field9781.method1826(5123, 29039, var3.field7318, var3.field7313);
            }
            this.field9770.field1880 = this.field9781;
        } else {
            this.field9770.field1880 = this.field9706.method3150(var3.field7318, 5123, var3.field7313, (byte) 104, false);
        }
        if (!arg1) {
            this.field9753 = true;
        }
    }

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "()I")
    public final int method2075() {
        field9763++;
        return this.field9785;
    }

    @OriginalMember(owner = "client!mo", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final void method2050(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field9765++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            class348.field4475 = 0;
            class173.field2031 = 0;
            class21.field232 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field9769.length > var15) {
                    int[] var16 = this.field9769[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field9723 == null || (arg6 & this.field9723[var18]) != 0) {
                            class173.field2031 += this.field9686[var18];
                            class21.field232 += this.field9711[var18];
                            var13++;
                            class348.field4475 += this.field9778[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class348.field4475 = var10;
                class21.field232 = var11;
                class173.field2031 = var12;
            } else {
                class21.field232 = class21.field232 / var13 + var11;
                class348.field4475 = class348.field4475 / var13 + var10;
                class173.field2031 = class173.field2031 / var13 + var12;
                class206.field2373 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 + (arg7[2] * arg4) + 8192 >> 14;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg4 = var21;
                arg2 = var19;
                arg3 = var20;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field9769.length) {
                    int[] var27 = this.field9769[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field9723 == null || (this.field9723[var29] & arg6) != 0) {
                            this.field9686[var29] += var22;
                            this.field9711[var29] += var23;
                            this.field9778[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field9769.length > var109) {
                        int[] var110 = this.field9769[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field9723 == null || (arg6 & this.field9723[var112]) != 0) {
                                this.field9686[var112] -= class173.field2031;
                                this.field9711[var112] -= class21.field232;
                                this.field9778[var112] -= class348.field4475;
                                if (arg4 != 0) {
                                    int var113 = class243.field3129[arg4];
                                    int var114 = class243.field3128[arg4];
                                    int var115 = this.field9686[var112] * var114 + (this.field9711[var112] * var113 + 16383) >> 14;
                                    this.field9711[var112] = this.field9711[var112] * var114 + 16383 - (this.field9686[var112] * var113) >> 14;
                                    this.field9686[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class243.field3129[arg2];
                                    int var117 = class243.field3128[arg2];
                                    int var118 = this.field9711[var112] * var117 + 16383 - (this.field9778[var112] * var116) >> 14;
                                    this.field9778[var112] = this.field9778[var112] * var117 + (this.field9711[var112] * var116 + 16383) >> 14;
                                    this.field9711[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class243.field3129[arg3];
                                    int var120 = class243.field3128[arg3];
                                    int var121 = this.field9778[var112] * var119 + (this.field9686[var112] * var120) + 16383 >> 14;
                                    this.field9778[var112] = this.field9778[var112] * var120 + 16383 - this.field9686[var112] * var119 >> 14;
                                    this.field9686[var112] = var121;
                                }
                                this.field9686[var112] += class173.field2031;
                                this.field9711[var112] += class21.field232;
                                this.field9778[var112] += class348.field4475;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field9769.length > var92) {
                            int[] var93 = this.field9769[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field9723 == null || (this.field9723[var95] & arg6) != 0) {
                                    int var96 = this.field9743[var95];
                                    int var97 = this.field9743[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field9744[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class243.field3129[arg4];
                                            int var101 = class243.field3128[arg4];
                                            int var102 = this.field9796[var99] * var100 + this.field9745[var99] * var101 + 16383 >> 14;
                                            this.field9796[var99] = (short) (this.field9796[var99] * var101 + 16383 - (this.field9745[var99] * var100) >> 14);
                                            this.field9745[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class243.field3129[arg2];
                                            int var104 = class243.field3128[arg2];
                                            int var105 = this.field9796[var99] * var104 + 16383 - this.field9685[var99] * var103 >> 14;
                                            this.field9685[var99] = (short) (this.field9796[var99] * var103 + this.field9685[var99] * var104 + 16383 >> 14);
                                            this.field9796[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class243.field3129[arg3];
                                            int var107 = class243.field3128[arg3];
                                            int var108 = this.field9685[var99] * var106 - (-(this.field9745[var99] * var107) - 16383) >> 14;
                                            this.field9685[var99] = (short) (this.field9685[var99] * var107 + 16383 - (this.field9745[var99] * var106) >> 14);
                                            this.field9745[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field9740 == null && this.field9775 != null) {
                        this.field9775.field3645 = null;
                    }
                    if (this.field9740 != null) {
                        this.field9740.field3645 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class206.field2373) {
                    int var36 = arg7[0] * class173.field2031 + arg7[6] * class348.field4475 + arg7[3] * class21.field232 + 8192 >> 14;
                    int var37 = arg7[1] * class173.field2031 + arg7[7] * class348.field4475 + arg7[4] * class21.field232 + 8192 >> 14;
                    int var38 = var34 + var37;
                    int var39 = arg7[8] * class348.field4475 + arg7[5] * class21.field232 + arg7[2] * class173.field2031 + 8192 >> 14;
                    int var40 = var33 + var36;
                    int var41 = var35 + var39;
                    class173.field2031 = var40;
                    class21.field232 = var38;
                    class206.field2373 = false;
                    class348.field4475 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class243.field3128[arg2];
                int var44 = class243.field3129[arg2];
                int var45 = class243.field3128[arg3];
                int var46 = class243.field3129[arg3];
                int var47 = class243.field3128[arg4];
                int var48 = class243.field3129[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[0] = var46 * var50 + var45 * var47 + 8192 >> 14;
                var42[7] = var46 * var48 - (-(var45 * var49) - 8192) >> 14;
                var42[5] = -var44;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[1] = -var45 * var48 + (var46 * var49) + 8192 >> 14;
                int var51 = var42[1] * -class21.field232 + var42[0] * -class173.field2031 + (var42[2] * -class348.field4475) + 8192 >> 14;
                int var52 = var42[5] * -class348.field4475 + var42[4] * -class21.field232 + var42[3] * -class173.field2031 + 8192 >> 14;
                int var53 = var42[8] * -class348.field4475 + var42[7] * -class21.field232 + var42[6] * -class173.field2031 + 8192 >> 14;
                int var54 = class173.field2031 + var51;
                int var55 = var52 + class21.field232;
                int var56 = class348.field4475 + var53;
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
                int var59 = var42[2] * var35 + (var42[0] * var33 + (var42[1] * var34)) + 8192 >> 14;
                int var60 = var42[3] * var33 - (-(var42[5] * var35) - (var42[4] * var34) - 8192) >> 14;
                int var61 = var42[8] * var35 + (var42[6] * var33 - (-(var42[7] * var34) - 8192)) >> 14;
                int var62 = var55 + var60;
                int var63 = var54 + var59;
                int var64 = var56 + var61;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var84 + (var86 * 3)];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[2] * var64 + arg7[0] * var63 + arg7[1] * var62 + 8192 >> 14;
                int var68 = arg7[3] * var63 + (arg7[4] * var62) + arg7[5] * var64 + 8192 >> 14;
                int var69 = var30 + var67;
                int var70 = var31 + var68;
                int var71 = arg7[7] * var62 + arg7[8] * var64 + arg7[6] * var63 + 8192 >> 14;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field9769.length) {
                        int[] var75 = this.field9769[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field9723 == null || (this.field9723[var77] & arg6) != 0) {
                                int var78 = this.field9711[var77] * var65[1] + this.field9778[var77] * var65[2] + this.field9686[var77] * var65[0] + 8192 >> 14;
                                int var79 = this.field9711[var77] * var65[4] + this.field9778[var77] * var65[5] + this.field9686[var77] * var65[3] + 8192 >> 14;
                                int var80 = var70 + var79;
                                int var81 = var69 + var78;
                                int var82 = this.field9686[var77] * var65[6] + 8192 - (-(this.field9711[var77] * var65[7]) - this.field9778[var77] * var65[8]) >> 14;
                                int var83 = var72 + var82;
                                this.field9686[var77] = var81;
                                this.field9711[var77] = var80;
                                this.field9778[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field9769.length) {
                        int[] var124 = this.field9769[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field9723 == null || (arg6 & this.field9723[var126]) != 0) {
                                this.field9686[var126] -= class173.field2031;
                                this.field9711[var126] -= class21.field232;
                                this.field9778[var126] -= class348.field4475;
                                this.field9686[var126] = this.field9686[var126] * arg2 >> 7;
                                this.field9711[var126] = this.field9711[var126] * arg3 >> 7;
                                this.field9778[var126] = this.field9778[var126] * arg4 >> 7;
                                this.field9686[var126] += class173.field2031;
                                this.field9711[var126] += class21.field232;
                                this.field9778[var126] += class348.field4475;
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
                if (class206.field2373) {
                    int var133 = arg7[0] * class173.field2031 + arg7[3] * class21.field232 + arg7[6] * class348.field4475 + 8192 >> 14;
                    int var134 = arg7[7] * class348.field4475 + (arg7[1] * class173.field2031 - (-(arg7[4] * class21.field232) - 8192)) >> 14;
                    int var135 = var131 + var134;
                    int var136 = arg7[8] * class348.field4475 + arg7[5] * class21.field232 + arg7[2] * class173.field2031 + 8192 >> 14;
                    int var137 = var130 + var133;
                    class21.field232 = var135;
                    int var138 = var132 + var136;
                    class173.field2031 = var137;
                    class348.field4475 = var138;
                    class206.field2373 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class173.field2031 * var139 + 8192 >> 14;
                int var143 = -class21.field232 * var140 + 8192 >> 14;
                int var144 = -class348.field4475 * var141 + 8192 >> 14;
                int var145 = class173.field2031 + var142;
                int var146 = var143 + class21.field232;
                int var147 = class348.field4475 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
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
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[1] * var153 + arg7[0] * var152 + 8192 >> 14;
                int var158 = arg7[5] * var154 + arg7[4] * var153 + arg7[3] * var152 + 8192 >> 14;
                int var159 = var127 + var157;
                int var160 = arg7[6] * var152 + 8192 - (-(arg7[7] * var153) - arg7[8] * var154) >> 14;
                int var161 = var128 + var158;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field9769.length) {
                        int[] var165 = this.field9769[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field9723 == null || (arg6 & this.field9723[var167]) != 0) {
                                int var168 = this.field9778[var167] * var155[2] + this.field9711[var167] * var155[1] + this.field9686[var167] * var155[0] + 8192 >> 14;
                                int var169 = this.field9686[var167] * var155[3] + this.field9778[var167] * var155[5] + this.field9711[var167] * var155[4] + 8192 >> 14;
                                int var170 = var161 + var169;
                                int var171 = var159 + var168;
                                int var172 = this.field9778[var167] * var155[8] + this.field9711[var167] * var155[7] + this.field9686[var167] * var155[6] + 8192 >> 14;
                                int var173 = var162 + var172;
                                this.field9686[var167] = var171;
                                this.field9711[var167] = var170;
                                this.field9778[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9721 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field9721.length) {
                        int[] var182 = this.field9721[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field9783 == null || (this.field9783[var184] & arg6) != 0) {
                                int var185 = (this.field9712[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field9712[var184] = (byte) var185;
                                if (this.field9775 != null) {
                                    this.field9775.field3645 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field9742 != null) {
                    for (int var178 = 0; var178 < this.field9793; var178++) {
                        class331 var179 = this.field9742[var178];
                        class89 var180 = this.field9694[var178];
                        var180.field1145 = 255 - (this.field9712[var179.field4115] & 0xFF) << 24 | var180.field1145 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field9721 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field9721.length > var190) {
                        int[] var191 = this.field9721[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field9783 == null || (arg6 & this.field9783[var193]) != 0) {
                                int var194 = this.field9708[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD30) >> 10;
                                int var196 = (var194 & 0x3CE) >> 7;
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
                                this.field9708[var193] = (short) class364.method2113(var200, class364.method2113(var197 << 7, var198 << 10));
                                if (this.field9775 != null) {
                                    this.field9775.field3645 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field9742 != null) {
                    for (int var187 = 0; var187 < this.field9793; var187++) {
                        class331 var188 = this.field9742[var187];
                        class89 var189 = this.field9694[var187];
                        var189.field1145 = var189.field1145 & 0xFF000000 | class76.field999[this.field9708[var188.field4115] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field9688 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field9688.length) {
                        int[] var203 = this.field9688[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class89 var205 = this.field9694[var203[var204]];
                            var205.field1146 += arg3;
                            var205.field1154 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9688 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field9688.length > var207) {
                        int[] var208 = this.field9688[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class89 var210 = this.field9694[var208[var209]];
                            var210.field1151 = var210.field1151 * arg2 >> 7;
                            var210.field1147 = var210.field1147 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9688 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field9688.length) {
                    int[] var213 = this.field9688[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class89 var215 = this.field9694[var213[var214]];
                        var215.field1149 = var215.field1149 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Ljaa;)V")
    public class700(class576 arg0) {
        this.field9706 = arg0;
        this.field9720 = new class288(null, 5126, 3, 0);
        this.field9764 = new class288(null, 5126, 2, 0);
        this.field9740 = new class288(null, 5126, 3, 0);
        this.field9775 = new class288(null, 5121, 4, 0);
        this.field9770 = new class159();
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Ljaa;Lnj;IIII)V")
    public class700(class576 arg0, class229 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field9785 = arg2;
        this.field9706 = arg0;
        this.field9728 = arg5;
        if (class617.method3442(arg2, -1, arg5)) {
            this.field9720 = new class288(null, 5126, 3, 0);
        }
        if (class58.method501(arg2, arg5, (byte) 122)) {
            this.field9764 = new class288(null, 5126, 2, 0);
        }
        if (class525.method2833(arg5, 124, arg2)) {
            this.field9740 = new class288(null, 5126, 3, 0);
        }
        if (class569.method3017(arg2, arg5, 0)) {
            this.field9775 = new class288(null, 5121, 4, 0);
        }
        if (class339.method1946(arg2, arg5, (byte) -42)) {
            this.field9770 = new class159();
        }
        class498 var7 = arg0.field8781;
        int[] var8 = new int[arg1.field2972];
        this.field9743 = new int[arg1.field2965 + 1];
        for (int var9 = 0; var9 < arg1.field2972; var9++) {
            if ((arg1.field2988 == null || arg1.field2988[var9] != 2) && (arg1.field2986 == null || arg1.field2986[var9] == -1 || !var7.method2718(arg1.field2986[var9] & 0xFFFF, (byte) 72).field1817)) {
                var8[this.field9757++] = var9;
                this.field9743[arg1.field2953[var9]]++;
                this.field9743[arg1.field2995[var9]]++;
                this.field9743[arg1.field3004[var9]]++;
            }
        }
        this.field9714 = this.field9757;
        long[] var10 = new long[this.field9757];
        boolean var11 = (this.field9785 & 0x100) != 0;
        label499: for (int var12 = 0; var12 < this.field9757; var12++) {
            int var180 = var8[var12];
            class152 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field2990 != null) {
                for (int var186 = 0; var186 < arg1.field2990.length; var186++) {
                    class417 var187 = arg1.field2990[var186];
                    if (var187.field5333 == var180) {
                        class692 var188 = class234.method1413(true, var187.field5339);
                        if (var188.field9595) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field9714--;
                            continue label499;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field2986 != null) {
                var189 = arg1.field2986[var180];
                if (var189 != -1) {
                    var181 = var7.method2718(var189 & 0xFFFF, (byte) 72);
                    var184 = var181.field1809;
                    var185 = var181.field1815;
                }
            }
            boolean var190 = arg1.field3005 != null && arg1.field3005[var180] != 0 || var181 != null && var181.field1829 | !var181.field1811;
            if ((var11 || var190) && arg1.field2959 != null) {
                var182 += arg1.field2959[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = (var189 & 0xFFFF << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + ((long) var194);
        }
        class608.method3380(var8, -1, var10);
        this.field9778 = arg1.field2982;
        this.field9718 = arg1.field2993;
        this.field9738 = arg1.field2965;
        this.field9686 = arg1.field2981;
        this.field9723 = arg1.field2973;
        this.field9711 = arg1.field2991;
        this.field9709 = arg1.field2997;
        this.field9731 = arg1.field2956;
        class154[] var13 = new class154[this.field9738];
        if (arg1.field2990 != null) {
            this.field9793 = arg1.field2990.length;
            this.field9742 = new class331[this.field9793];
            this.field9694 = new class89[this.field9793];
            for (int var14 = 0; var14 < this.field9793; var14++) {
                class417 var15 = arg1.field2990[var14];
                class692 var16 = class234.method1413(true, var15.field5339);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field9757; var18++) {
                    if (var8[var18] == var15.field5333) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class76.field999[arg1.field2985[var15.field5333] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field3005 == null ? 0 : arg1.field3005[var15.field5333]) << 24;
                this.field9742[var14] = new class331(var17, arg1.field2953[var15.field5333], arg1.field2995[var15.field5333], arg1.field3004[var15.field5333], var16.field9598, var16.field9590, var16.field9594, var16.field9597, var16.field9593, var16.field9595, var16.field9599, var15.field5331);
                this.field9694[var14] = new class89(var20);
            }
        }
        int var21 = this.field9757 * 3;
        this.field9685 = new short[var21];
        this.field9796 = new short[var21];
        this.field9771 = new short[this.field9757];
        this.field9760 = new byte[var21];
        this.field9779 = new short[this.field9757];
        this.field9790 = (short) arg3;
        this.field9733 = (short) arg4;
        this.field9773 = new short[this.field9757];
        this.field9756 = new float[var21];
        this.field9745 = new short[var21];
        this.field9744 = new short[var21];
        this.field9712 = new byte[this.field9757];
        if (arg1.field2992 != null) {
            this.field9783 = new short[this.field9757];
        }
        class186.field2191 = new long[var21];
        this.field9776 = new float[var21];
        this.field9708 = new short[this.field9757];
        this.field9730 = new short[this.field9757];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field2965; var23++) {
            int var179 = this.field9743[var23];
            this.field9743[var23] = var22;
            var13[var23] = new class154();
            var22 += var179;
        }
        this.field9743[arg1.field2965] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field2979 != null) {
            int var28 = arg1.field2962;
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
            var26 = new int[var28];
            for (int var36 = 0; var36 < this.field9757; var36++) {
                int var43 = var8[var36];
                if (arg1.field2979[var43] != -1) {
                    int var44 = arg1.field2979[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field2953[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field2995[var43];
                        } else {
                            var46 = arg1.field3004[var43];
                        }
                        int var47 = arg1.field2981[var46];
                        int var48 = arg1.field2991[var46];
                        int var49 = arg1.field2982[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
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
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field2969[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field2955[var37];
                        if (var39 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 <= 0) {
                            var40 = (float) (-var39) / 1024.0F;
                            var41 = 1.0F;
                        } else {
                            var41 = (float) var39 / 1024.0F;
                            var40 = 1.0F;
                        }
                        var42 = 64.0F / (float) arg1.field2996[var37];
                    } else if (var38 == 2) {
                        var41 = 64.0F / (float) arg1.field3002[var37];
                        var40 = 64.0F / (float) arg1.field2955[var37];
                        var42 = 64.0F / (float) arg1.field2996[var37];
                    } else {
                        var42 = (float) arg1.field2996[var37] / 1024.0F;
                        var41 = (float) arg1.field3002[var37] / 1024.0F;
                        var40 = (float) arg1.field2955[var37] / 1024.0F;
                    }
                    var27[var37] = class441.method2417(var42, arg1.field3001[var37], var40, arg1.field2987[var37], var41, arg1.field2954[var37], class109.method762(255, arg1.field2976[var37]), (byte) -128);
                }
            }
        }
        class77[] var50 = new class77[arg1.field2972];
        for (int var51 = 0; var51 < arg1.field2972; var51++) {
            short var158 = arg1.field2953[var51];
            short var159 = arg1.field2995[var51];
            short var160 = arg1.field3004[var51];
            int var161 = this.field9686[var159] - this.field9686[var158];
            int var162 = this.field9711[var159] - this.field9711[var158];
            int var163 = this.field9778[var159] - this.field9778[var158];
            int var164 = this.field9686[var160] - this.field9686[var158];
            int var165 = this.field9711[var160] - this.field9711[var158];
            int var166 = this.field9778[var160] - this.field9778[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169 = var161 * var165 - var162 * var164;
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var168 >>= 0x1;
                var169 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var168 * var168 + var167 * var167 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field2988 == null ? 0 : arg1.field2988[var51];
            if (var174 == 0) {
                class154 var175 = var13[var158];
                var175.field1832 += var171;
                var175.field1834 += var173;
                var175.field1831 += var172;
                var175.field1835++;
                class154 var176 = var13[var159];
                var176.field1831 += var172;
                var176.field1832 += var171;
                var176.field1835++;
                var176.field1834 += var173;
                class154 var177 = var13[var160];
                var177.field1834 += var173;
                var177.field1832 += var171;
                var177.field1831 += var172;
                var177.field1835++;
            } else if (var174 == 1) {
                class77 var178 = var50[var51] = new class77();
                var178.field1005 = var171;
                var178.field1004 = var173;
                var178.field1003 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field9757; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field2985[var68] & 0xFFFF;
            short var70;
            if (arg1.field2986 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field2986[var68];
            }
            int var71;
            if (arg1.field2979 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field2979[var68];
            }
            int var72;
            if (arg1.field3005 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field3005[var68] & 0xFF;
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
                    var80 = 2;
                    var74 = 1.0F;
                    var76 = 1.0F;
                    var77 = 0.0F;
                    var78 = 0.0F;
                    var75 = 1.0F;
                    var79 = 1;
                    var73 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field2969[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field2953[var68];
                        short var84 = arg1.field2995[var68];
                        short var85 = arg1.field3004[var68];
                        short var86 = arg1.field3001[var71];
                        short var87 = arg1.field2987[var71];
                        short var88 = arg1.field2954[var71];
                        float var89 = (float) arg1.field2981[var86];
                        float var90 = (float) arg1.field2991[var86];
                        float var91 = (float) arg1.field2982[var86];
                        float var92 = (float) arg1.field2981[var87] - var89;
                        float var93 = (float) arg1.field2991[var87] - var90;
                        float var94 = (float) arg1.field2982[var87] - var91;
                        float var95 = (float) arg1.field2981[var88] - var89;
                        float var96 = (float) arg1.field2991[var88] - var90;
                        float var97 = (float) arg1.field2982[var88] - var91;
                        float var98 = (float) arg1.field2981[var83] - var89;
                        float var99 = (float) arg1.field2991[var83] - var90;
                        float var100 = (float) arg1.field2982[var83] - var91;
                        float var101 = (float) arg1.field2981[var84] - var89;
                        float var102 = (float) arg1.field2991[var84] - var90;
                        float var103 = (float) arg1.field2982[var84] - var91;
                        float var104 = (float) arg1.field2981[var85] - var89;
                        float var105 = (float) arg1.field2991[var85] - var90;
                        float var106 = (float) arg1.field2982[var85] - var91;
                        float var107 = var93 * var97 - (var94 * var96);
                        float var108 = var94 * var95 - var92 * var97;
                        float var109 = var92 * var96 - var93 * var95;
                        float var110 = var96 * var109 - (var97 * var108);
                        float var111 = var97 * var107 - (var95 * var109);
                        float var112 = var95 * var108 - var96 * var107;
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        float var114 = var92 * var108 - (var93 * var107);
                        float var115 = var94 * var107 - (var92 * var109);
                        float var116 = var93 * var109 - (var94 * var108);
                        float var117 = 1.0F / (var97 * var114 + var95 * var116 + var96 * var115);
                        var76 = (var103 * var114 + var101 * var116 + var102 * var115) * var117;
                        var78 = (var106 * var114 + var104 * var116 + var105 * var115) * var117;
                        var74 = (var100 * var114 + var98 * var116 + var99 * var115) * var117;
                    } else {
                        short var118 = arg1.field2953[var68];
                        short var119 = arg1.field2995[var68];
                        short var120 = arg1.field3004[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field2974[var71];
                        float var126 = (float) arg1.field2968[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field3002[var71] / 1024.0F;
                            class532.method2872(arg1.field2982[var118], var123, var122, 1, var121, var125, var127, var124, var126, arg1.field2981[var118], arg1.field2991[var118]);
                            var73 = class250.field3232;
                            var74 = class148.field1770;
                            class532.method2872(arg1.field2982[var119], var123, var122, 1, var121, var125, var127, var124, var126, arg1.field2981[var119], arg1.field2991[var119]);
                            var76 = class148.field1770;
                            var75 = class250.field3232;
                            class532.method2872(arg1.field2982[var120], var123, var122, 1, var121, var125, var127, var124, var126, arg1.field2981[var120], arg1.field2991[var120]);
                            var78 = class148.field1770;
                            var77 = class250.field3232;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > var128) {
                                    var79 = 1;
                                    var75 -= var127;
                                } else if (var73 - var75 > var128) {
                                    var75 += var127;
                                    var79 = 2;
                                }
                                if (var77 - var73 > var128) {
                                    var80 = 1;
                                    var77 -= var127;
                                } else if (var128 < var73 - var77) {
                                    var77 += var127;
                                    var80 = 2;
                                }
                            } else {
                                if ((var76 - var74 > var128)) {
                                    var79 = 1;
                                    var76 -= var127;
                                } else if (var128 < var74 - var76) {
                                    var79 = 2;
                                    var76 += var127;
                                }
                                if ((var78 - var74 > var128)) {
                                    var78 -= var127;
                                    var80 = 1;
                                } else if (var128 < var74 - var78) {
                                    var78 += var127;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field2966[var71] / 256.0F;
                            float var130 = (float) arg1.field2975[var71] / 256.0F;
                            int var131 = arg1.field2981[var119] - arg1.field2981[var118];
                            int var132 = arg1.field2991[var119] - arg1.field2991[var118];
                            int var133 = arg1.field2982[var119] - arg1.field2982[var118];
                            int var134 = arg1.field2981[var120] - arg1.field2981[var118];
                            int var135 = arg1.field2991[var120] - arg1.field2991[var118];
                            int var136 = arg1.field2982[var120] - arg1.field2982[var118];
                            int var137 = var132 * var136 - (var133 * var135);
                            int var138 = var133 * var134 - var131 * var136;
                            int var139 = var131 * var135 - (var132 * var134);
                            float var140 = 64.0F / (float) arg1.field2955[var71];
                            float var141 = 64.0F / (float) arg1.field2996[var71];
                            float var142 = 64.0F / (float) arg1.field3002[var71];
                            float var143 = (var124[2] * (float) var139 + var124[0] * (float) var137 + var124[1] * (float) var138) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[4] * (float) var138 + var124[3] * (float) var137) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[6] * (float) var137 + var124[7] * (float) var138) / var142;
                            var81 = class187.method1109(var144, var145, 2, var143);
                            class474.method2576(arg1.field2982[var118], var130, arg1.field2991[var118], var121, var125, var81, var123, arg1.field2981[var118], var129, -2, var126, var122, var124);
                            var73 = class646.field8747;
                            var74 = class417.field5338;
                            class474.method2576(arg1.field2982[var119], var130, arg1.field2991[var119], var121, var125, var81, var123, arg1.field2981[var119], var129, -2, var126, var122, var124);
                            var75 = class646.field8747;
                            var76 = class417.field5338;
                            class474.method2576(arg1.field2982[var120], var130, arg1.field2991[var120], var121, var125, var81, var123, arg1.field2981[var120], var129, -2, var126, var122, var124);
                            var77 = class646.field8747;
                            var78 = class417.field5338;
                        } else if (var82 == 3) {
                            class627.method3498(var125, var122, (byte) -127, arg1.field2982[var118], var121, var123, var124, arg1.field2991[var118], var126, arg1.field2981[var118]);
                            var74 = class672.field9182;
                            var73 = class315.field3950;
                            class627.method3498(var125, var122, (byte) -127, arg1.field2982[var119], var121, var123, var124, arg1.field2991[var119], var126, arg1.field2981[var119]);
                            var76 = class672.field9182;
                            var75 = class315.field3950;
                            class627.method3498(var125, var122, (byte) -126, arg1.field2982[var120], var121, var123, var124, arg1.field2991[var120], var126, arg1.field2981[var120]);
                            var78 = class672.field9182;
                            var77 = class315.field3950;
                            if ((var125 & 0x1) == 0) {
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                                if ((var75 - var73 > 0.5F)) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                            } else {
                                if ((var78 - var74 > 0.5F)) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                                if ((var76 - var74 > 0.5F)) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field2988 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field2988[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var81 << 24) + (long) var72 + (long) (var69 << 8) << 32) + (long) (var71 << 2);
                short var152 = arg1.field2953[var68];
                short var153 = arg1.field2995[var68];
                short var154 = arg1.field3004[var68];
                class154 var155 = var13[var152];
                this.field9773[var52] = this.method3872(var73, var74, var155.field1834, var155.field1835, var152, var150, 1, arg1, var155.field1831, var155.field1832);
                class154 var156 = var13[var153];
                this.field9730[var52] = this.method3872(var75, var76, var156.field1834, var156.field1835, var153, (long) var79 + var150, 1, arg1, var156.field1831, var156.field1832);
                class154 var157 = var13[var154];
                this.field9779[var52] = this.method3872(var77, var78, var157.field1834, var157.field1835, var154, (long) var80 + var150, 1, arg1, var157.field1831, var157.field1832);
            } else if (var146 == 1) {
                class77 var147 = var50[var68];
                long var148 = (long) ((var147.field1003 + 256 << 12) + (var147.field1005 <= 0 ? 2048 : 1024) + (var147.field1004 - -256 << 22) + (var71 << 2)) + ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32);
                this.field9773[var52] = this.method3872(var73, var74, var147.field1004, 0, arg1.field2953[var68], var148, 1, arg1, var147.field1003, var147.field1005);
                this.field9730[var52] = this.method3872(var75, var76, var147.field1004, 0, arg1.field2995[var68], (long) var79 + var148, 1, arg1, var147.field1003, var147.field1005);
                this.field9779[var52] = this.method3872(var77, var78, var147.field1004, 0, arg1.field3004[var68], (long) var80 + var148, 1, arg1, var147.field1003, var147.field1005);
            }
            if (arg1.field2986 == null) {
                this.field9771[var52] = -1;
            } else {
                this.field9771[var52] = arg1.field2986[var68];
            }
            if (arg1.field3005 != null) {
                this.field9712[var52] = arg1.field3005[var68];
            }
            if (arg1.field2992 != null) {
                this.field9783[var52] = arg1.field2992[var68];
            }
            this.field9708[var52] = arg1.field2985[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field9714; var55++) {
            short var67 = this.field9771[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field9724 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field9714; var58++) {
            short var66 = this.field9771[var58];
            if (var56 != var66) {
                this.field9724[var57++] = var58;
                var56 = var66;
            }
        }
        this.field9724[var57] = this.field9714;
        class186.field2191 = null;
        this.field9745 = class397.method2247(this.field9768, 0, this.field9745);
        this.field9796 = class397.method2247(this.field9768, 0, this.field9796);
        this.field9685 = class397.method2247(this.field9768, 0, this.field9685);
        this.field9760 = class96.method714(this.field9760, 0, this.field9768);
        this.field9756 = class224.method1357(this.field9768, -124, this.field9756);
        this.field9776 = class224.method1357(this.field9768, -87, this.field9776);
        if (arg1.field2971 != null && class409.method2298(this.field9728, arg2, (byte) -93)) {
            this.field9769 = arg1.method1385((byte) -112, false);
        }
        if (arg1.field2990 != null && class499.method2722(88, arg2, this.field9728)) {
            this.field9688 = arg1.method1389((byte) -107);
        }
        if (arg1.field2994 != null && class75.method599(arg2, (byte) 38, this.field9728)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field9757; var61++) {
                int var65 = arg1.field2994[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field9721 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field9721[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field9757; var63++) {
                int var64 = arg1.field2994[var8[var63]];
                if (var64 >= 0) {
                    this.field9721[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
