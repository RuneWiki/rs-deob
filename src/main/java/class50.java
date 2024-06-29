import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class50 extends class497 {

    @OriginalMember(owner = "client!sca", name = "ob", descriptor = "Z")
    private boolean field554 = true;

    @OriginalMember(owner = "client!sca", name = "v", descriptor = "I")
    private int field509 = 0;

    @OriginalMember(owner = "client!sca", name = "sb", descriptor = "I")
    private int field558 = 0;

    @OriginalMember(owner = "client!sca", name = "Jb", descriptor = "Z")
    private boolean field575 = false;

    @OriginalMember(owner = "client!sca", name = "ac", descriptor = "I")
    private int field592 = 0;

    @OriginalMember(owner = "client!sca", name = "Wb", descriptor = "I")
    private int field588 = 0;

    @OriginalMember(owner = "client!sca", name = "Y", descriptor = "Z")
    private boolean field538 = false;

    @OriginalMember(owner = "client!sca", name = "ic", descriptor = "Z")
    private boolean field600 = false;

    @OriginalMember(owner = "client!sca", name = "oc", descriptor = "I")
    private int field606 = 0;

    @OriginalMember(owner = "client!sca", name = "Dc", descriptor = "Llf;")
    private class250 field621;

    @OriginalMember(owner = "client!sca", name = "jc", descriptor = "Lut;")
    private class135 field601;

    @OriginalMember(owner = "client!sca", name = "Ob", descriptor = "Lut;")
    private class135 field580;

    @OriginalMember(owner = "client!sca", name = "tb", descriptor = "Lut;")
    private class135 field559;

    @OriginalMember(owner = "client!sca", name = "Mb", descriptor = "Lut;")
    private class135 field578;

    @OriginalMember(owner = "client!sca", name = "Ub", descriptor = "Lmt;")
    private class417 field586;

    @OriginalMember(owner = "client!sca", name = "sc", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!sca", name = "R", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client!sca", name = "u", descriptor = "[I")
    private int[] field508;

    @OriginalMember(owner = "client!sca", name = "I", descriptor = "[I")
    private int[] field522;

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "[I")
    private int[] field513;

    @OriginalMember(owner = "client!sca", name = "zb", descriptor = "[I")
    private int[] field565;

    @OriginalMember(owner = "client!sca", name = "Bb", descriptor = "[S")
    private short[] field567;

    @OriginalMember(owner = "client!sca", name = "y", descriptor = "[Lrea;")
    private class220[] field512;

    @OriginalMember(owner = "client!sca", name = "Db", descriptor = "[Lvja;")
    private class290[] field569;

    @OriginalMember(owner = "client!sca", name = "rc", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!sca", name = "r", descriptor = "[Luh;")
    private class177[] field505;

    @OriginalMember(owner = "client!sca", name = "Cc", descriptor = "[Len;")
    private class338[] field620;

    @OriginalMember(owner = "client!sca", name = "Tb", descriptor = "[S")
    private short[] field585;

    @OriginalMember(owner = "client!sca", name = "yb", descriptor = "[S")
    private short[] field564;

    @OriginalMember(owner = "client!sca", name = "Qb", descriptor = "[S")
    private short[] field582;

    @OriginalMember(owner = "client!sca", name = "Lb", descriptor = "[S")
    private short[] field577;

    @OriginalMember(owner = "client!sca", name = "Zb", descriptor = "[S")
    private short[] field591;

    @OriginalMember(owner = "client!sca", name = "Bc", descriptor = "[B")
    private byte[] field619;

    @OriginalMember(owner = "client!sca", name = "Fb", descriptor = "[S")
    private short[] field571;

    @OriginalMember(owner = "client!sca", name = "Rb", descriptor = "[S")
    private short[] field583;

    @OriginalMember(owner = "client!sca", name = "vc", descriptor = "[B")
    private byte[] field613;

    @OriginalMember(owner = "client!sca", name = "ib", descriptor = "[F")
    private float[] field548;

    @OriginalMember(owner = "client!sca", name = "vb", descriptor = "S")
    private short field561;

    @OriginalMember(owner = "client!sca", name = "Sb", descriptor = "[F")
    private float[] field584;

    @OriginalMember(owner = "client!sca", name = "t", descriptor = "[S")
    private short[] field507;

    @OriginalMember(owner = "client!sca", name = "M", descriptor = "[S")
    private short[] field526;

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "[S")
    private short[] field502;

    @OriginalMember(owner = "client!sca", name = "G", descriptor = "S")
    private short field520;

    @OriginalMember(owner = "client!sca", name = "s", descriptor = "[I")
    private int[] field506;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "[[I")
    private int[][] field503;

    @OriginalMember(owner = "client!sca", name = "Nb", descriptor = "[[I")
    private int[][] field579;

    @OriginalMember(owner = "client!sca", name = "Eb", descriptor = "[[I")
    private int[][] field570;

    @OriginalMember(owner = "client!sca", name = "Kb", descriptor = "Leo;")
    public static class313 field576 = new class313(5, 1);

    @OriginalMember(owner = "client!sca", name = "J", descriptor = "B")
    private byte field523;

    @OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!sca", name = "x", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!sca", name = "B", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!sca", name = "C", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!sca", name = "D", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!sca", name = "H", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!sca", name = "K", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!sca", name = "L", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!sca", name = "O", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!sca", name = "P", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!sca", name = "Q", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!sca", name = "S", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!sca", name = "T", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!sca", name = "U", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!sca", name = "V", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!sca", name = "W", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!sca", name = "X", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!sca", name = "Z", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!sca", name = "ab", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!sca", name = "bb", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!sca", name = "cb", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!sca", name = "db", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!sca", name = "eb", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!sca", name = "fb", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!sca", name = "gb", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!sca", name = "hb", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!sca", name = "jb", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!sca", name = "kb", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!sca", name = "mb", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!sca", name = "nb", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!sca", name = "pb", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!sca", name = "qb", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!sca", name = "rb", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!sca", name = "ub", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!sca", name = "wb", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!sca", name = "Ab", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!sca", name = "Cb", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!sca", name = "Gb", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!sca", name = "Hb", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!sca", name = "Ib", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!sca", name = "Pb", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!sca", name = "Xb", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!sca", name = "Yb", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!sca", name = "cc", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!sca", name = "dc", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!sca", name = "ec", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!sca", name = "fc", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!sca", name = "hc", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!sca", name = "kc", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!sca", name = "lc", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!sca", name = "mc", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!sca", name = "nc", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!sca", name = "pc", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!sca", name = "qc", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!sca", name = "tc", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!sca", name = "uc", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!sca", name = "wc", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!sca", name = "xc", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!sca", name = "yc", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!sca", name = "zc", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!sca", name = "Ac", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!sca", name = "A", descriptor = "Lvv;")
    private class343 field514;

    @OriginalMember(owner = "client!sca", name = "bc", descriptor = "Lot;")
    private class615 field593;

    @OriginalMember(owner = "client!sca", name = "gc", descriptor = "Ljia;")
    private class643 field598;

    @OriginalMember(owner = "client!sca", name = "w", descriptor = "S")
    private short field510;

    @OriginalMember(owner = "client!sca", name = "E", descriptor = "S")
    private short field518;

    @OriginalMember(owner = "client!sca", name = "F", descriptor = "S")
    private short field519;

    @OriginalMember(owner = "client!sca", name = "N", descriptor = "S")
    private short field527;

    @OriginalMember(owner = "client!sca", name = "lb", descriptor = "S")
    private short field551;

    @OriginalMember(owner = "client!sca", name = "xb", descriptor = "S")
    private short field563;

    @OriginalMember(owner = "client!sca", name = "Vb", descriptor = "S")
    private short field587;

    @OriginalMember(owner = "client!sca", name = "Ec", descriptor = "S")
    private short field622;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZI)V", line = 7)
    private final void method314(boolean arg0, int arg1) {
        field615++;
        boolean var3 = this.field578 != null && this.field578.field1837 == null;
        boolean var4 = this.field559 != null && this.field559.field1837 == null;
        boolean var5 = this.field601 != null && this.field601.field1837 == null;
        boolean var6 = this.field580 != null && this.field580.field1837 == null;
        if (arg0) {
            var6 &= (this.field523 & 0x8) != 0;
            var5 &= (this.field523 & 0x1) != 0;
            var3 &= (this.field523 & 0x2) != 0;
            var4 &= (this.field523 & 0x4) != 0;
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
        if (arg1 != -2338) {
            return;
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
        if (this.field621.field3623.field3789.length >= (this.field592 * var7)) {
            this.field621.field3623.field3725 = 0;
        } else {
            this.field621.field3623 = new class453((this.field592 + 100) * var7);
        }
        class453 var12 = this.field621.field3623;
        if (var5) {
            if (this.field621.field3561) {
                for (int var21 = 0; var21 < this.field509; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field565[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field522[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field513[var21]);
                    int var25 = this.field508[var21];
                    int var26 = this.field508[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field507[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field3725 = var7 * var28;
                        var12.method1686(arg1 + 2273, var22);
                        var12.method1686(-75, var23);
                        var12.method1686(-79, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field509; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field565[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field522[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field513[var13]);
                    int var17 = this.field508[var13];
                    int var18 = this.field508[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field507[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field3725 = var7 * var20;
                        var12.method1696(var14, (byte) 39);
                        var12.method1696(var15, (byte) 39);
                        var12.method1696(var16, (byte) 39);
                    }
                }
            }
        }
        if (var3) {
            if (this.field559 == null) {
                short[] var31;
                short[] var32;
                short[] var33;
                byte[] var34;
                if (this.field598 == null) {
                    var31 = this.field564;
                    var32 = this.field582;
                    var33 = this.field591;
                    var34 = this.field619;
                } else {
                    var31 = this.field598.field8653;
                    var33 = this.field598.field8652;
                    var32 = this.field598.field8658;
                    var34 = this.field598.field8651;
                }
                float var35 = this.field621.field3552[0];
                float var36 = this.field621.field3552[1];
                float var37 = this.field621.field3552[2];
                float var38 = this.field621.field3583;
                float var39 = this.field621.field3656 * 768.0F / (float) this.field561;
                float var40 = this.field621.field3610 * 768.0F / (float) this.field561;
                for (int var41 = 0; var41 < this.field606; var41++) {
                    int var42 = this.method321(this.field613[var41], arg1 ^ 0xFFFF09DE, this.field502[var41], this.field583[var41], this.field520);
                    float var43 = (float) ((var42 & 0xFF13) >> 8) * this.field621.field3644;
                    short var44 = this.field585[var41];
                    float var45 = (float) (var42 >>> 24) * this.field621.field3650;
                    float var46 = (float) (var42 >> 16 & 0xFF) * this.field621.field3584;
                    short var47 = (short) var34[var44];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var31[var44] * var37 + (float) var32[var44] * var35 + (float) var33[var44] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var31[var44] * var37 + (float) var32[var44] * var35 + (float) var33[var44] * var36) / (float) (var47 * 256);
                    }
                    float var49 = var38 + ((var48 < 0.0F) ? var40 : var39) * var48;
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
                    int var52 = (int) (var43 * var49);
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.field3725 = var7 * var44 + var9;
                    var12.method1725(var50, 65);
                    var12.method1725(var51, arg1 + 2357);
                    var12.method1725(var52, 44);
                    var12.method1725(255 - (this.field613[var41] & 0xFF), 25);
                    short var53 = this.field526[var41];
                    short var54 = (short) var34[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var35 + (float) var33[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var35 + (float) var33[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = var38 + (var55 < 0.0F ? var40 : var39) * var55;
                    int var57 = (int) (var45 * var56);
                    int var58 = (int) (var46 * var56);
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
                    var12.field3725 = var9 + (var7 * var53);
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method1725(var57, arg1 ^ 0xFFFFF6C4);
                    var12.method1725(var58, arg1 + 2426);
                    var12.method1725(var59, 95);
                    var12.method1725(255 - (this.field613[var41] & 0xFF), 31);
                    short var60 = this.field571[var41];
                    short var61 = (short) var34[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var35 + (float) var33[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var35 + (float) var33[var60] * var36) / (float) (var61 * 256);
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
                    var12.field3725 = var7 * var60 + var9;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method1725(var64, 63);
                    var12.method1725(var65, 51);
                    var12.method1725(var66, 113);
                    var12.method1725(255 - (this.field613[var41] & 0xFF), 61);
                }
            } else {
                for (int var29 = 0; var29 < this.field606; var29++) {
                    int var30 = this.method321(this.field613[var29], 65280, this.field502[var29], this.field583[var29], this.field520);
                    var12.field3725 = this.field585[var29] * var7 + var9;
                    var12.method1686(arg1 + 2225, var30);
                    var12.field3725 = this.field526[var29] * var7 + var9;
                    var12.method1686(102, var30);
                    var12.field3725 = this.field571[var29] * var7 + var9;
                    var12.method1686(arg1 + 2461, var30);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field598 == null) {
                var70 = this.field619;
                var67 = this.field591;
                var69 = this.field582;
                var68 = this.field564;
            } else {
                var67 = this.field598.field8652;
                var68 = this.field598.field8653;
                var69 = this.field598.field8658;
                var70 = this.field598.field8651;
            }
            float var71 = 3.0F / (float) this.field561;
            var12.field3725 = var10;
            float var72 = 3.0F / (float) (this.field561 / 2 + this.field561);
            if (this.field621.field3561) {
                for (int var76 = 0; var76 < this.field592; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2692(-125, (float) var69[var76] * var72);
                        var12.method2692(-81, (float) var67[var76] * var72);
                        var12.method2692(-85, (float) var68[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2692(-73, (float) var69[var76] * var78);
                        var12.method2692(arg1 ^ 0x954, (float) var67[var76] * var78);
                        var12.method2692(-75, (float) var68[var76] * var78);
                    }
                    var12.field3725 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field592; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2693((float) var69[var73] * var72, -1001058736);
                        var12.method2693((float) var67[var73] * var72, -1001058736);
                        var12.method2693((float) var68[var73] * var72, arg1 - 1001056398);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2693((float) var69[var73] * var75, -1001058736);
                        var12.method2693((float) var67[var73] * var75, -1001058736);
                        var12.method2693((float) var68[var73] * var75, -1001058736);
                    }
                    var12.field3725 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field3725 = var11;
            if (this.field621.field3561) {
                for (int var80 = 0; var80 < this.field592; var80++) {
                    var12.method2692(-125, this.field548[var80]);
                    var12.method2692(-95, this.field584[var80]);
                    var12.field3725 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field592; var79++) {
                    var12.method2693(this.field548[var79], -1001058736);
                    var12.method2693(this.field584[var79], -1001058736);
                    var12.field3725 += var7 - 8;
                }
            }
        }
        var12.field3725 = this.field592 * var7;
        class615 var81;
        if (arg0) {
            if (this.field593 == null) {
                this.field593 = this.field621.method1578((byte) 61, var12.field3725, true, var12.field3789, var7);
            } else {
                this.field593.method3417(var12.field3789, var7, true, var12.field3725);
            }
            var81 = this.field593;
            this.field523 = 0;
        } else {
            var81 = this.field621.method1578((byte) 61, var12.field3725, false, var12.field3789, var7);
            this.field554 = true;
        }
        if (var5) {
            this.field601.field1835 = var8;
            this.field601.field1837 = var81;
        }
        if (var6) {
            this.field580.field1837 = var81;
            this.field580.field1835 = var11;
        }
        if (var3) {
            this.field578.field1835 = var9;
            this.field578.field1837 = var81;
        }
        if (var4) {
            this.field559.field1835 = var10;
            this.field559.field1837 = var81;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lka;IIIZ)V", line = 531)
    public final void method287(class497 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field599++;
        class50 var6 = (class50) arg0;
        if (this.field606 == 0 || var6.field606 == 0) {
            return;
        }
        int var7 = var6.field509;
        int[] var8 = var6.field565;
        int[] var9 = var6.field522;
        int[] var10 = var6.field513;
        short[] var11 = var6.field582;
        short[] var12 = var6.field591;
        short[] var13 = var6.field564;
        byte[] var14 = var6.field619;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field598 == null) {
            var16 = null;
            var17 = null;
            var18 = null;
            var15 = null;
        } else {
            var15 = this.field598.field8658;
            var16 = this.field598.field8652;
            var17 = this.field598.field8653;
            var18 = this.field598.field8651;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field598 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field598.field8658;
            var19 = var6.field598.field8651;
            var22 = var6.field598.field8653;
            var20 = var6.field598.field8652;
        }
        int[] var23 = var6.field508;
        short[] var24 = var6.field507;
        if (!var6.field575) {
            var6.method318(126);
        }
        short var25 = var6.field510;
        short var26 = var6.field563;
        short var27 = var6.field551;
        short var28 = var6.field527;
        short var29 = var6.field587;
        short var30 = var6.field519;
        for (int var31 = 0; var31 < this.field509; var31++) {
            int var32 = this.field522[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field565[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field513[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field508[var31];
                        int var37 = this.field508[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field507[var38] - 1;
                            if (var35 == -1 || this.field619[var35] != 0) {
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
                                            this.field598 = new class643();
                                            var15 = this.field598.field8658 = class319.method2064(this.field582, 124);
                                            var16 = this.field598.field8652 = class319.method2064(this.field591, 109);
                                            var17 = this.field598.field8653 = class319.method2064(this.field564, 101);
                                            var18 = this.field598.field8651 = class600.method3365(-30, this.field619);
                                        }
                                        if (var21 == null) {
                                            class643 var44 = var6.field598 = new class643();
                                            var21 = var44.field8658 = class319.method2064(var11, 121);
                                            var20 = var44.field8652 = class319.method2064(var12, 117);
                                            var22 = var44.field8653 = class319.method2064(var13, 113);
                                            var19 = var44.field8651 = class600.method3365(-39, var14);
                                        }
                                        short var45 = this.field582[var35];
                                        short var46 = this.field591[var35];
                                        short var47 = this.field564[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field619[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var21[var52] += var45;
                                                var20[var52] += var46;
                                                var22[var52] += var47;
                                                var19[var52] += var49;
                                            }
                                        }
                                        short var53 = var11[var42];
                                        int var54 = this.field508[var31];
                                        short var55 = var13[var42];
                                        byte var56 = var14[var42];
                                        int var57 = this.field508[var31 + 1];
                                        short var58 = var12[var42];
                                        for (int var59 = var54; var59 < var57; var59++) {
                                            int var60 = this.field507[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var58;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                        if (this.field559 == null && this.field578 != null) {
                                            this.field578.field1837 = null;
                                        }
                                        if (this.field559 != null) {
                                            this.field559.field1837 = null;
                                        }
                                        if (var6.field559 == null && var6.field578 != null) {
                                            var6.field578.field1837 = null;
                                        }
                                        if (var6.field559 != null) {
                                            var6.field559.field1837 = null;
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

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "(I)V", line = 800)
    public final void method267(int arg0) {
        field557++;
        int var2 = class110.field1524[arg0];
        int var3 = class110.field1523[arg0];
        for (int var4 = 0; var4 < this.field509; var4++) {
            int var7 = this.field565[var4] * var3 + this.field513[var4] * var2 >> 14;
            this.field513[var4] = this.field513[var4] * var3 - this.field565[var4] * var2 >> 14;
            this.field565[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field592; var5++) {
            int var6 = this.field582[var5] * var3 + this.field564[var5] * var2 >> 14;
            this.field564[var5] = (short) (this.field564[var5] * var3 - (this.field582[var5] * var2) >> 14);
            this.field582[var5] = (short) var6;
        }
        if (this.field559 == null && this.field578 != null) {
            this.field578.field1837 = null;
        }
        if (this.field559 != null) {
            this.field559.field1837 = null;
        }
        this.field575 = false;
        if (this.field601 != null) {
            this.field601.field1837 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "NA", descriptor = "()Z", line = 855)
    public final boolean method292() {
        field525++;
        if (this.field503 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field588; var1++) {
            this.field565[var1] <<= 0x4;
            this.field522[var1] <<= 0x4;
            this.field513[var1] <<= 0x4;
        }
        class7.field56 = 0;
        class395.field5686 = 0;
        class703.field9417 = 0;
        return true;
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)V", line = 884)
    private final void method315(int arg0) {
        field552++;
        if (this.field558 == 0) {
            return;
        }
        if (this.field523 != 0) {
            this.method314(true, -2338);
        }
        this.method314(false, -2338);
        if (this.field586 != null) {
            if (this.field586.field6009 == null) {
                this.method327(arg0 ^ 0xFF, (this.field523 & 0x10) != 0);
            }
            if (this.field586.field6009 != null) {
                this.field621.method1639(this.field559 != null, -8);
                this.field621.method1634(this.field580, this.field601, this.field578, this.field559, (byte) 11);
                int var2 = this.field506.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field506[var3];
                    int var5 = this.field506[var3 + 1];
                    int var6 = this.field583[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field621.method1628(this.field559 != null, 24166, var6);
                    this.field621.method1568(false, var4 * 3, 4, (var5 - var4) * 3, this.field586.field6009);
                }
            }
        }
        if (arg0 != 255) {
            this.field510 = 127;
        }
        this.method319(126);
    }

    @OriginalMember(owner = "client!sca", name = "VA", descriptor = "(I)V", line = 942)
    public final void method290(int arg0) {
        field511++;
        int var2 = class110.field1524[arg0];
        int var3 = class110.field1523[arg0];
        for (int var4 = 0; var4 < this.field509; var4++) {
            int var5 = this.field565[var4] * var3 + this.field522[var4] * var2 >> 14;
            this.field522[var4] = this.field522[var4] * var3 - (this.field565[var4] * var2) >> 14;
            this.field565[var4] = var5;
        }
        this.field575 = false;
        if (this.field601 != null) {
            this.field601.field1837 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lsca;Lsca;ZZBI)Lka;", line = 973)
    private final class497 method316(class50 arg0, class50 arg1, boolean arg2, boolean arg3, byte arg4, int arg5) {
        arg0.field561 = this.field561;
        arg0.field523 = 0;
        arg0.field592 = this.field592;
        arg0.field520 = this.field520;
        if ((arg5 & 0x100) == 0) {
            arg0.field538 = this.field538;
        } else {
            arg0.field538 = true;
        }
        field541++;
        arg0.field588 = this.field588;
        arg0.field558 = this.field558;
        arg0.field610 = this.field610;
        arg0.field609 = this.field609;
        arg0.field600 = this.field600;
        arg0.field531 = arg5;
        arg0.field509 = this.field509;
        arg0.field606 = this.field606;
        boolean var7 = class220.method1410(-60, this.field610, arg5);
        boolean var8 = class357.method2267(this.field610, false, arg5);
        boolean var9 = class760.method4183((byte) 6, this.field610, arg5);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg0.field565 = this.field565;
            } else if (arg1.field565 == null || this.field588 > arg1.field565.length) {
                arg0.field565 = arg1.field565 = new int[this.field588];
            } else {
                arg0.field565 = arg1.field565;
            }
            if (!var8) {
                arg0.field522 = this.field522;
            } else if (arg1.field522 == null || arg1.field522.length < this.field588) {
                arg0.field522 = arg1.field522 = new int[this.field588];
            } else {
                arg0.field522 = arg1.field522;
            }
            if (!var9) {
                arg0.field513 = this.field513;
            } else if (arg1.field513 == null || arg1.field513.length < this.field588) {
                arg0.field513 = arg1.field513 = new int[this.field588];
            } else {
                arg0.field513 = arg1.field513;
            }
            for (int var11 = 0; var11 < this.field588; var11++) {
                if (var7) {
                    arg0.field565[var11] = this.field565[var11];
                }
                if (var8) {
                    arg0.field522[var11] = this.field522[var11];
                }
                if (var9) {
                    arg0.field513[var11] = this.field513[var11];
                }
            }
        } else {
            arg0.field565 = this.field565;
            arg0.field513 = this.field513;
            arg0.field522 = this.field522;
        }
        if (class429.method2579(this.field610, arg5, (byte) 77)) {
            arg0.field601 = arg1.field601;
            if (arg3) {
                arg0.field523 = (byte) (arg0.field523 | 0x1);
            }
            arg0.field601.field1837 = this.field601.field1837;
            arg0.field601.field1835 = this.field601.field1835;
        } else if (class550.method3160(arg5, this.field610, 0)) {
            arg0.field601 = this.field601;
        } else {
            arg0.field601 = null;
        }
        if (class469.method2751(0, arg5, this.field610)) {
            if (arg1.field502 == null || arg1.field502.length < this.field606) {
                arg0.field502 = arg1.field502 = new short[this.field606];
            } else {
                arg0.field502 = arg1.field502;
            }
            for (int var12 = 0; var12 < this.field606; var12++) {
                arg0.field502[var12] = this.field502[var12];
            }
        } else {
            arg0.field502 = this.field502;
        }
        if (class73.method596(this.field610, arg5, (byte) -2)) {
            if (arg1.field613 == null || this.field606 > arg1.field613.length) {
                arg0.field613 = arg1.field613 = new byte[this.field606];
            } else {
                arg0.field613 = arg1.field613;
            }
            for (int var13 = 0; var13 < this.field606; var13++) {
                arg0.field613[var13] = this.field613[var13];
            }
        } else {
            arg0.field613 = this.field613;
        }
        if (class84.method680(this.field610, arg5, (byte) -118)) {
            arg0.field578 = arg1.field578;
            if (arg3) {
                arg0.field523 = (byte) (arg0.field523 | 0x2);
            }
            arg0.field578.field1835 = this.field578.field1835;
            arg0.field578.field1837 = this.field578.field1837;
        } else if (class729.method4032(2048, this.field610, arg5)) {
            arg0.field578 = this.field578;
        } else {
            arg0.field578 = null;
        }
        if (class791.method4325(arg5, this.field610, (byte) 104)) {
            if (arg1.field582 == null || arg1.field582.length < this.field592) {
                int var14 = this.field592;
                arg0.field582 = arg1.field582 = new short[var14];
                arg0.field591 = arg1.field591 = new short[var14];
                arg0.field564 = arg1.field564 = new short[var14];
            } else {
                arg0.field591 = arg1.field591;
                arg0.field564 = arg1.field564;
                arg0.field582 = arg1.field582;
            }
            if (this.field598 == null) {
                for (int var15 = 0; var15 < this.field592; var15++) {
                    arg0.field582[var15] = this.field582[var15];
                    arg0.field591[var15] = this.field591[var15];
                    arg0.field564[var15] = this.field564[var15];
                }
            } else {
                if (arg1.field598 == null) {
                    arg1.field598 = new class643();
                }
                class643 var16 = arg0.field598 = arg1.field598;
                if (var16.field8658 == null || this.field592 > var16.field8658.length) {
                    int var17 = this.field592;
                    var16.field8653 = new short[var17];
                    var16.field8652 = new short[var17];
                    var16.field8658 = new short[var17];
                    var16.field8651 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field592; var18++) {
                    arg0.field582[var18] = this.field582[var18];
                    arg0.field591[var18] = this.field591[var18];
                    arg0.field564[var18] = this.field564[var18];
                    var16.field8658[var18] = this.field598.field8658[var18];
                    var16.field8652[var18] = this.field598.field8652[var18];
                    var16.field8653[var18] = this.field598.field8653[var18];
                    var16.field8651[var18] = this.field598.field8651[var18];
                }
            }
            arg0.field619 = this.field619;
        } else {
            arg0.field619 = this.field619;
            arg0.field591 = this.field591;
            arg0.field598 = this.field598;
            arg0.field564 = this.field564;
            arg0.field582 = this.field582;
        }
        if (arg4 <= 39) {
            return null;
        }
        if (class414.method2497(arg5, -112, this.field610)) {
            if (arg3) {
                arg0.field523 = (byte) (arg0.field523 | 0x4);
            }
            arg0.field559 = arg1.field559;
            arg0.field559.field1835 = this.field559.field1835;
            arg0.field559.field1837 = this.field559.field1837;
        } else if (class12.method81(55, this.field610, arg5)) {
            arg0.field559 = this.field559;
        } else {
            arg0.field559 = null;
        }
        if (class319.method2066(arg5, (byte) 110, this.field610)) {
            if (arg1.field548 == null || this.field606 > arg1.field548.length) {
                int var19 = this.field592;
                arg0.field584 = arg1.field584 = new float[var19];
                arg0.field548 = arg1.field548 = new float[var19];
            } else {
                arg0.field584 = arg1.field584;
                arg0.field548 = arg1.field548;
            }
            for (int var20 = 0; var20 < this.field592; var20++) {
                arg0.field548[var20] = this.field548[var20];
                arg0.field584[var20] = this.field584[var20];
            }
        } else {
            arg0.field548 = this.field548;
            arg0.field584 = this.field584;
        }
        if (class424.method2554((byte) -36, arg5, this.field610)) {
            if (arg3) {
                arg0.field523 = (byte) (arg0.field523 | 0x8);
            }
            arg0.field580 = arg1.field580;
            arg0.field580.field1835 = this.field580.field1835;
            arg0.field580.field1837 = this.field580.field1837;
        } else if (class477.method2824(this.field610, (byte) -123, arg5)) {
            arg0.field580 = this.field580;
        } else {
            arg0.field580 = null;
        }
        if (class479.method2828(arg5, 109, this.field610)) {
            if (arg1.field585 == null || arg1.field585.length < this.field606) {
                int var21 = this.field606;
                arg0.field585 = arg1.field585 = new short[var21];
                arg0.field526 = arg1.field526 = new short[var21];
                arg0.field571 = arg1.field571 = new short[var21];
            } else {
                arg0.field526 = arg1.field526;
                arg0.field571 = arg1.field571;
                arg0.field585 = arg1.field585;
            }
            for (int var22 = 0; var22 < this.field606; var22++) {
                arg0.field585[var22] = this.field585[var22];
                arg0.field526[var22] = this.field526[var22];
                arg0.field571[var22] = this.field571[var22];
            }
        } else {
            arg0.field585 = this.field585;
            arg0.field571 = this.field571;
            arg0.field526 = this.field526;
        }
        if (class292.method1872(arg5, this.field610, 1000)) {
            if (arg3) {
                arg0.field523 = (byte) (arg0.field523 | 0x10);
            }
            arg0.field586 = arg1.field586;
            arg0.field586.field6009 = this.field586.field6009;
        } else if (class197.method1291(arg5, -22235, this.field610)) {
            arg0.field586 = this.field586;
        } else {
            arg0.field586 = null;
        }
        if (class598.method3350(this.field610, 61, arg5)) {
            if (arg1.field583 == null || this.field606 > arg1.field583.length) {
                int var23 = this.field606;
                arg0.field583 = arg1.field583 = new short[var23];
            } else {
                arg0.field583 = arg1.field583;
            }
            for (int var24 = 0; var24 < this.field606; var24++) {
                arg0.field583[var24] = this.field583[var24];
            }
        } else {
            arg0.field583 = this.field583;
        }
        if (!class684.method3751(this.field610, arg5, (byte) 104)) {
            arg0.field620 = this.field620;
        } else if (arg1.field620 == null || arg1.field620.length < this.field609) {
            int var26 = this.field609;
            arg0.field620 = arg1.field620 = new class338[var26];
            for (int var27 = 0; var27 < this.field609; var27++) {
                arg0.field620[var27] = this.field620[var27].method2158(-28544);
            }
        } else {
            arg0.field620 = arg1.field620;
            for (int var25 = 0; var25 < this.field609; var25++) {
                arg0.field620[var25].method2159(28018, this.field620[var25]);
            }
        }
        arg0.field505 = this.field505;
        arg0.field570 = this.field570;
        arg0.field508 = this.field508;
        arg0.field577 = this.field577;
        arg0.field567 = this.field567;
        arg0.field506 = this.field506;
        arg0.field507 = this.field507;
        arg0.field569 = this.field569;
        if (this.field575) {
            arg0.field563 = this.field563;
            arg0.field575 = true;
            arg0.field510 = this.field510;
            arg0.field519 = this.field519;
            arg0.field622 = this.field622;
            arg0.field527 = this.field527;
            arg0.field551 = this.field551;
            arg0.field587 = this.field587;
            arg0.field518 = this.field518;
        } else {
            arg0.field575 = false;
        }
        arg0.field503 = this.field503;
        arg0.field579 = this.field579;
        arg0.field512 = this.field512;
        return arg0;
    }

    @OriginalMember(owner = "client!sca", name = "G", descriptor = "()I", line = 1444)
    public final int method273() {
        field556++;
        if (!this.field575) {
            this.method318(54);
        }
        return this.field519;
    }

    @OriginalMember(owner = "client!sca", name = "ba", descriptor = "(Lr;)Lr;", line = 1456)
    public final class195 method289(class195 arg0) {
        field581++;
        if (this.field592 == 0) {
            return null;
        }
        if (!this.field575) {
            this.method318(72);
        }
        int var2;
        int var3;
        if (this.field621.field3557 <= 0) {
            var2 = this.field551 - (this.field621.field3557 * this.field510 >> 8) >> this.field621.field3517;
            var3 = this.field527 - (this.field621.field3557 * this.field563 >> 8) >> this.field621.field3517;
        } else {
            var2 = this.field551 - (this.field621.field3557 * this.field563 >> 8) >> this.field621.field3517;
            var3 = this.field527 - (this.field621.field3557 * this.field510 >> 8) >> this.field621.field3517;
        }
        int var4;
        int var5;
        if (this.field621.field3563 <= 0) {
            var4 = this.field587 - (this.field621.field3563 * this.field510 >> 8) >> this.field621.field3517;
            var5 = this.field519 - (this.field621.field3563 * this.field563 >> 8) >> this.field621.field3517;
        } else {
            var4 = this.field587 - (this.field621.field3563 * this.field563 >> 8) >> this.field621.field3517;
            var5 = this.field519 - (this.field621.field3563 * this.field510 >> 8) >> this.field621.field3517;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 - (var4 - 1);
        class251 var8 = (class251) arg0;
        class251 var9;
        if (var8 != null && var8.method1650(var6, (byte) 110, var7)) {
            var9 = var8;
            var8.method1651((byte) -84);
        } else {
            var9 = new class251(this.field621, var6, var7);
        }
        var9.method1646(var5, var2, 0, var4, var3);
        this.method325(var9, (byte) -61);
        return var9;
    }

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "()[Lvja;", line = 1519)
    public final class290[] method263() {
        field597++;
        return this.field569;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIII)V", line = 1527)
    public final void method279(int arg0, int arg1, int arg2, int arg3) {
        field605++;
        for (int var5 = 0; var5 < this.field606; var5++) {
            int var9 = this.field502[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x39F) >> 7;
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
            this.field502[var5] = (short) class670.method3699(var12, class670.method3699(var10 << 10, var11 << 7));
        }
        if (this.field505 != null) {
            for (int var6 = 0; var6 < this.field609; var6++) {
                class177 var7 = this.field505[var6];
                class338 var8 = this.field620[var6];
                var8.field4749 = class217.field2836[this.field502[var7.field2327] & 0xFFFF] & 0xFFFFFF | var8.field4749 & 0xFF000000;
            }
        }
        if (this.field578 != null) {
            this.field578.field1837 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "LA", descriptor = "(I)V", line = 1584)
    public final void method244(int arg0) {
        this.field561 = (short) arg0;
        field614++;
        if (this.field578 != null) {
            this.field578.field1837 = null;
        }
        if (this.field559 != null) {
            this.field559.field1837 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "()V", line = 1601)
    public final void method274() {
        field562++;
        if (this.field592 <= 0 || this.field558 <= 0) {
            return;
        }
        this.method314(false, -2338);
        if ((this.field523 & 0x10) == 0 && this.field586.field6009 == null) {
            this.method327(0, false);
        }
        this.method319(125);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILgl;IBJIIFFI)S", line = 1621)
    private final short method317(int arg0, class625 arg1, int arg2, byte arg3, long arg4, int arg5, int arg6, float arg7, float arg8, int arg9) {
        field545++;
        int var12 = this.field508[arg5];
        int var13 = this.field508[arg5 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field507[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class565.field7736[var15] == arg4) {
                return (short) (var16 - 1);
            }
        }
        this.field507[var14] = (short) (this.field592 + 1);
        class565.field7736[var14] = arg4;
        this.field582[this.field592] = (short) arg0;
        this.field591[this.field592] = (short) arg2;
        this.field564[this.field592] = (short) arg6;
        if (arg3 <= 31) {
            this.method250();
        }
        this.field619[this.field592] = (byte) arg9;
        this.field548[this.field592] = arg8;
        this.field584[this.field592] = arg7;
        return (short) (this.field592++);
    }

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "()V", line = 1675)
    public final void method286() {
        field536++;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lal;Lju;II)V", line = 1682)
    public final void method258(class109 arg0, class136 arg1, int arg2, int arg3) {
        field572++;
        if (this.field592 == 0) {
            return;
        }
        class584 var5 = this.field621.field3545;
        if (!this.field575) {
            this.method318(84);
        }
        class584 var6 = (class584) arg0;
        class506.field7095 = var5.field7955 * var6.field7956 + var5.field7963 * var6.field7940 + var5.field7953 * var6.field7952 + var5.field7956;
        class757.field10279 = var5.field7955 * var6.field7963 + var5.field7963 * var6.field7927 + var5.field7953 * var6.field7951;
        float var7 = (float) this.field510 * class757.field10279 + class506.field7095;
        float var8 = (float) this.field563 * class757.field10279 + class506.field7095;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var9 = (float) this.field518 + var7;
            var10 = (float) (-this.field518) + var8;
        } else {
            var9 = (float) this.field518 + var8;
            var10 = (float) (-this.field518) + var7;
        }
        if ((this.field621.field3553 <= var10) || ((float) this.field621.field3631 >= var9)) {
            return;
        }
        class749.field10091 = var5.field7934 * var6.field7956 + var5.field7951 * var6.field7940 + var5.field7950 * var6.field7952 + var5.field7952;
        class29.field282 = var5.field7934 * var6.field7963 + var5.field7951 * var6.field7927 + var5.field7950 * var6.field7951;
        float var11 = (float) this.field510 * class29.field282 + class749.field10091;
        float var12 = (float) this.field563 * class29.field282 + class749.field10091;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) this.field518 + var11) * (float) this.field621.field3641;
            var14 = ((float) (-this.field518) + var12) * (float) this.field621.field3641;
        } else {
            var13 = ((float) this.field518 + var12) * (float) this.field621.field3641;
            var14 = (var11 - (float) this.field518) * (float) this.field621.field3641;
        }
        if ((var14 / (float) arg2 >= this.field621.field3627) || (this.field621.field3611 >= var13 / (float) arg2)) {
            return;
        }
        class5.field34 = var5.field7932 * var6.field7956 + var5.field7929 * var6.field7952 + var5.field7927 * var6.field7940 + var5.field7940;
        class777.field10682 = var5.field7932 * var6.field7963 + var5.field7929 * var6.field7951 + var5.field7927 * var6.field7927;
        float var15 = (float) this.field510 * class777.field10682 + class5.field34;
        float var16 = (float) this.field563 * class777.field10682 + class5.field34;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) (-this.field518) + var16) * (float) this.field621.field3626;
            var18 = ((float) this.field518 + var15) * (float) this.field621.field3626;
        } else {
            var18 = ((float) this.field518 + var16) * (float) this.field621.field3626;
            var17 = (var15 - (float) this.field518) * (float) this.field621.field3626;
        }
        if ((var17 / (float) arg2 >= this.field621.field3613) || (this.field621.field3590 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field505 != null) {
            class322.field4575 = var5.field7932 * var6.field7953 + var5.field7929 * var6.field7950 + var5.field7927 * var6.field7929;
            class742.field10045 = var5.field7955 * var6.field7955 + var5.field7963 * var6.field7932 + var5.field7953 * var6.field7934;
            class571.field7779 = var5.field7934 * var6.field7953 + var5.field7951 * var6.field7929 + var5.field7950 * var6.field7950;
            class127.field1741 = var5.field7934 * var6.field7955 + var5.field7951 * var6.field7932 + var5.field7950 * var6.field7934;
            class702.field9306 = var5.field7932 * var6.field7955 + var5.field7929 * var6.field7934 + var5.field7927 * var6.field7932;
            class539.field7463 = var5.field7955 * var6.field7953 + var5.field7963 * var6.field7929 + var5.field7953 * var6.field7950;
        }
        if (arg1 != null) {
            int var19 = this.field551 + this.field527 >> 1;
            int var20 = this.field587 + this.field519 >> 1;
            int var21 = (int) ((float) var20 * class127.field1741 + (float) this.field510 * class29.field282 + (float) var19 * class571.field7779 + class749.field10091);
            int var22 = (int) ((float) var20 * class702.field9306 + (float) this.field510 * class777.field10682 + (float) var19 * class322.field4575 + class5.field34);
            int var23 = (int) ((float) var20 * class742.field10045 + (float) this.field510 * class757.field10279 + (float) var19 * class539.field7463 + class506.field7095);
            int var24 = (int) ((float) var20 * class127.field1741 + (float) this.field563 * class29.field282 + (float) var19 * class571.field7779 + class749.field10091);
            int var25 = (int) ((float) var20 * class702.field9306 + (float) this.field563 * class777.field10682 + (float) var19 * class322.field4575 + class5.field34);
            int var26 = (int) ((float) var20 * class742.field10045 + (float) this.field563 * class757.field10279 + (float) var19 * class539.field7463 + class506.field7095);
            arg1.field1842 = this.field621.field3641 * var21 / arg2 + this.field621.field3639;
            arg1.field1844 = this.field621.field3626 * var25 / arg2 + this.field621.field3599;
            arg1.field1843 = this.field621.field3641 * var24 / arg2 + this.field621.field3639;
            arg1.field1841 = this.field621.field3626 * var22 / arg2 + this.field621.field3599;
            if (var23 >= this.field621.field3631 || this.field621.field3631 <= var26) {
                arg1.field1840 = true;
                arg1.field1845 = this.field621.field3639 + ((var21 + this.field518) * this.field621.field3641 / arg2) - arg1.field1842;
            }
        }
        this.field621.method1622((float) arg2, (byte) 51);
        this.field621.method1612(16);
        this.field621.method1623(0, var6);
        this.method315(255);
        this.field621.method1605((byte) -51);
        this.method324(true);
    }

    @OriginalMember(owner = "client!sca", name = "I", descriptor = "(I[IIIIZI[I)V", line = 1832)
    public final void method282(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field533++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            class395.field5686 = 0;
            int var13 = 0;
            class703.field9417 = 0;
            class7.field56 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field503.length > var15) {
                    int[] var16 = this.field503[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field567 == null || (this.field567[var18] & arg6) != 0) {
                            class395.field5686 += this.field565[var18];
                            class7.field56 += this.field522[var18];
                            var13++;
                            class703.field9417 += this.field513[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class7.field56 = var12;
                class703.field9417 = var10;
                class395.field5686 = var11;
            } else {
                class7.field56 = class7.field56 / var13 + var12;
                class329.field4682 = true;
                class395.field5686 = class395.field5686 / var13 + var11;
                class703.field9417 = class703.field9417 / var13 + var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + (arg7[7] * arg3) + 8192 >> 14;
                arg4 = var21;
                arg2 = var19;
                arg3 = var20;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field503.length > var26) {
                    int[] var27 = this.field503[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field567 == null || (arg6 & this.field567[var29]) != 0) {
                            this.field565[var29] += var24;
                            this.field522[var29] += var23;
                            this.field513[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field503.length) {
                        int[] var50 = this.field503[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field567 == null || (this.field567[var52] & arg6) != 0) {
                                this.field565[var52] -= class395.field5686;
                                this.field522[var52] -= class7.field56;
                                this.field513[var52] -= class703.field9417;
                                if (arg4 != 0) {
                                    int var53 = class110.field1524[arg4];
                                    int var54 = class110.field1523[arg4];
                                    int var55 = this.field565[var52] * var54 + this.field522[var52] * var53 + 16383 >> 14;
                                    this.field522[var52] = this.field522[var52] * var54 + 16383 - (this.field565[var52] * var53) >> 14;
                                    this.field565[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class110.field1524[arg2];
                                    int var57 = class110.field1523[arg2];
                                    int var58 = this.field522[var52] * var57 + 16383 - (this.field513[var52] * var56) >> 14;
                                    this.field513[var52] = this.field522[var52] * var56 + this.field513[var52] * var57 + 16383 >> 14;
                                    this.field522[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class110.field1524[arg3];
                                    int var60 = class110.field1523[arg3];
                                    int var61 = this.field513[var52] * var59 - (-(this.field565[var52] * var60) - 16383) >> 14;
                                    this.field513[var52] = this.field513[var52] * var60 + 16383 - (this.field565[var52] * var59) >> 14;
                                    this.field565[var52] = var61;
                                }
                                this.field565[var52] += class395.field5686;
                                this.field522[var52] += class7.field56;
                                this.field513[var52] += class703.field9417;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field503.length > var32) {
                            int[] var33 = this.field503[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field567 == null || (this.field567[var35] & arg6) != 0) {
                                    int var36 = this.field508[var35];
                                    int var37 = this.field508[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field507[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class110.field1524[arg4];
                                            int var41 = class110.field1523[arg4];
                                            int var42 = this.field591[var39] * var40 + this.field582[var39] * var41 + 16383 >> 14;
                                            this.field591[var39] = (short) (this.field591[var39] * var41 + 16383 - (this.field582[var39] * var40) >> 14);
                                            this.field582[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class110.field1524[arg2];
                                            int var44 = class110.field1523[arg2];
                                            int var45 = this.field591[var39] * var44 + 16383 - (this.field564[var39] * var43) >> 14;
                                            this.field564[var39] = (short) (this.field591[var39] * var43 + (this.field564[var39] * var44 + 16383) >> 14);
                                            this.field591[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class110.field1524[arg3];
                                            int var47 = class110.field1523[arg3];
                                            int var48 = this.field582[var39] * var47 + this.field564[var39] * var46 + 16383 >> 14;
                                            this.field564[var39] = (short) (this.field564[var39] * var47 + 16383 - (this.field582[var39] * var46) >> 14);
                                            this.field582[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field559 == null && this.field578 != null) {
                        this.field578.field1837 = null;
                    }
                    if (this.field559 != null) {
                        this.field559.field1837 = null;
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
                if (class329.field4682) {
                    int var68 = arg7[3] * class7.field56 + (arg7[0] * class395.field5686 - (-(arg7[6] * class703.field9417) - 8192)) >> 14;
                    int var69 = arg7[4] * class7.field56 + arg7[1] * class395.field5686 + (arg7[7] * class703.field9417) + 8192 >> 14;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[8] * class703.field9417 + arg7[5] * class7.field56 + (arg7[2] * class395.field5686 - -8192) >> 14;
                    int var73 = var67 + var72;
                    class7.field56 = var70;
                    class395.field5686 = var71;
                    class703.field9417 = var73;
                    class329.field4682 = false;
                }
                int[] var74 = new int[9];
                int var75 = class110.field1523[arg2];
                int var76 = class110.field1524[arg2];
                int var77 = class110.field1523[arg3];
                int var78 = class110.field1524[arg3];
                int var79 = class110.field1523[arg4];
                int var80 = class110.field1524[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[5] = -var76;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[1] = var78 * var81 + -var77 * var80 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                int var83 = var74[2] * -class703.field9417 + (var74[0] * -class395.field5686 + (var74[1] * -class7.field56)) + 8192 >> 14;
                int var84 = var74[4] * -class7.field56 + var74[3] * -class395.field5686 + (var74[5] * -class703.field9417) + 8192 >> 14;
                int var85 = var74[8] * -class703.field9417 + var74[7] * -class7.field56 + var74[6] * -class395.field5686 + 8192 >> 14;
                int var86 = var83 + class395.field5686;
                int var87 = class7.field56 + var84;
                int var88 = var85 + class703.field9417;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[1] * var66 + var74[0] * var65 - (-(var74[2] * var67) + -8192) >> 14;
                int var92 = var74[3] * var65 + (var74[4] * var66) + var74[5] * var67 + 8192 >> 14;
                int var93 = var86 + var91;
                int var94 = var74[8] * var67 + var74[7] * var66 + var74[6] * var65 + 8192 >> 14;
                int var95 = var87 + var92;
                int var96 = var88 + var94;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[1] * var95 + arg7[0] * var93 + arg7[2] * var96 + 8192 >> 14;
                int var100 = arg7[5] * var96 + arg7[4] * var95 + arg7[3] * var93 + 8192 >> 14;
                int var101 = arg7[8] * var96 + arg7[7] * var95 + arg7[6] * var93 + 8192 >> 14;
                int var102 = var63 + var100;
                int var103 = var62 + var99;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field503.length > var106) {
                        int[] var107 = this.field503[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field567 == null || (arg6 & this.field567[var109]) != 0) {
                                int var110 = this.field565[var109] * var97[0] + (this.field522[var109] * var97[1] + (this.field513[var109] * var97[2]) + 8192) >> 14;
                                int var111 = this.field513[var109] * var97[5] + (this.field565[var109] * var97[3] + this.field522[var109] * var97[4] + 8192) >> 14;
                                int var112 = this.field565[var109] * var97[6] + 8192 - (-(this.field522[var109] * var97[7]) - this.field513[var109] * var97[8]) >> 14;
                                int var113 = var103 + var110;
                                int var114 = var102 + var111;
                                int var115 = var104 + var112;
                                this.field565[var109] = var113;
                                this.field522[var109] = var114;
                                this.field513[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field503.length) {
                        int[] var174 = this.field503[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field567 == null || (arg6 & this.field567[var176]) != 0) {
                                this.field565[var176] -= class395.field5686;
                                this.field522[var176] -= class7.field56;
                                this.field513[var176] -= class703.field9417;
                                this.field565[var176] = this.field565[var176] * arg2 >> 7;
                                this.field522[var176] = this.field522[var176] * arg3 >> 7;
                                this.field513[var176] = this.field513[var176] * arg4 >> 7;
                                this.field565[var176] += class395.field5686;
                                this.field522[var176] += class7.field56;
                                this.field513[var176] += class703.field9417;
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
                if (class329.field4682) {
                    int var128 = arg7[0] * class395.field5686 + (arg7[6] * class703.field9417) + arg7[3] * class7.field56 + 8192 >> 14;
                    int var129 = arg7[4] * class7.field56 + arg7[1] * class395.field5686 + arg7[7] * class703.field9417 + 8192 >> 14;
                    int var130 = arg7[8] * class703.field9417 + arg7[5] * class7.field56 + arg7[2] * class395.field5686 + 8192 >> 14;
                    int var131 = var126 + var129;
                    int var132 = var125 + var128;
                    class7.field56 = var131;
                    class395.field5686 = var132;
                    int var133 = var127 + var130;
                    class703.field9417 = var133;
                    class329.field4682 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class395.field5686 * var134 + 8192 >> 14;
                int var138 = -class7.field56 * var135 + 8192 >> 14;
                int var139 = -class703.field9417 * var136 + 8192 >> 14;
                int var140 = class395.field5686 + var137;
                int var141 = class7.field56 + var138;
                int var142 = var139 + class703.field9417;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var141 + var145;
                int var147 = var140 + var144;
                int var148 = var127 * var136 + 8192 >> 14;
                int var149 = var142 + var148;
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
                int var152 = arg7[1] * var146 + arg7[0] * var147 + (arg7[2] * var149) + 8192 >> 14;
                int var153 = arg7[5] * var149 + arg7[4] * var146 + arg7[3] * var147 + 8192 >> 14;
                int var154 = arg7[6] * var147 + arg7[7] * var146 - (-(arg7[8] * var149) - 8192) >> 14;
                int var155 = var123 + var153;
                int var156 = var122 + var152;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field503.length > var159) {
                        int[] var160 = this.field503[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field567 == null || (this.field567[var162] & arg6) != 0) {
                                int var163 = this.field565[var162] * var150[0] + this.field522[var162] * var150[1] + this.field513[var162] * var150[2] + 8192 >> 14;
                                int var164 = this.field565[var162] * var150[3] + this.field522[var162] * var150[4] + this.field513[var162] * var150[5] + 8192 >> 14;
                                int var165 = var156 + var163;
                                int var166 = this.field513[var162] * var150[8] + (this.field565[var162] * var150[6] + (this.field522[var162] * var150[7]) + 8192) >> 14;
                                int var167 = var155 + var164;
                                this.field565[var162] = var165;
                                int var168 = var157 + var166;
                                this.field522[var162] = var167;
                                this.field513[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field570 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field570.length) {
                        int[] var182 = this.field570[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field577 == null || (this.field577[var184] & arg6) != 0) {
                                int var185 = (this.field613[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field613[var184] = (byte) var185;
                                if (this.field578 != null) {
                                    this.field578.field1837 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field505 != null) {
                    for (int var178 = 0; var178 < this.field609; var178++) {
                        class177 var179 = this.field505[var178];
                        class338 var180 = this.field620[var178];
                        var180.field4749 = var180.field4749 & 0xFFFFFF | 255 - (this.field613[var179.field2327] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field570 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field570.length) {
                        int[] var191 = this.field570[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field577 == null || (this.field577[var193] & arg6) != 0) {
                                int var194 = this.field502[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD89) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = arg2 + var195 & 0x3F;
                                int var200 = arg4 + var197;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field502[var193] = (short) class670.method3699(class670.method3699(var198 << 7, var199 << 10), var200);
                                if (this.field578 != null) {
                                    this.field578.field1837 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field505 != null) {
                    for (int var187 = 0; var187 < this.field609; var187++) {
                        class177 var188 = this.field505[var187];
                        class338 var189 = this.field620[var187];
                        var189.field4749 = var189.field4749 & 0xFF000000 | class217.field2836[this.field502[var188.field2327] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field579 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field579.length > var202) {
                        int[] var203 = this.field579[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class338 var205 = this.field620[var203[var204]];
                            var205.field4741 += arg3;
                            var205.field4748 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field579 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field579.length) {
                        int[] var208 = this.field579[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class338 var210 = this.field620[var208[var209]];
                            var210.field4744 = var210.field4744 * arg3 >> 7;
                            var210.field4742 = var210.field4742 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field579 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field579.length > var212) {
                    int[] var213 = this.field579[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class338 var215 = this.field620[var213[var214]];
                        var215.field4746 = var215.field4746 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "FA", descriptor = "(I)V", line = 2820)
    public final void method293(int arg0) {
        field595++;
        int var2 = class110.field1524[arg0];
        int var3 = class110.field1523[arg0];
        for (int var4 = 0; var4 < this.field509; var4++) {
            int var5 = this.field522[var4] * var3 - (this.field513[var4] * var2) >> 14;
            this.field513[var4] = this.field522[var4] * var2 + this.field513[var4] * var3 >> 14;
            this.field522[var4] = var5;
        }
        this.field575 = false;
        if (this.field601 != null) {
            this.field601.field1837 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)V", line = 2852)
    private final void method318(int arg0) {
        field616++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field509; var10++) {
            int var11 = this.field565[var10];
            int var12 = this.field522[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            int var13 = this.field513[var10];
            if (var13 > var7) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        if (arg0 <= 36) {
            this.method274();
        }
        this.field551 = (short) var2;
        this.field527 = (short) var5;
        this.field510 = (short) var3;
        this.field519 = (short) var7;
        this.field587 = (short) var4;
        this.field563 = (short) var6;
        this.field518 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field622 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field575 = true;
    }

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "(I)V", line = 2931)
    private final void method319(int arg0) {
        field537++;
        if (!this.field554) {
            return;
        }
        this.field554 = false;
        if (this.field569 == null && this.field512 == null && this.field505 == null) {
            boolean var2 = false;
            boolean var3 = false;
            boolean var4 = false;
            if (this.field565 != null && !class145.method1016(this.field531, this.field610, 113)) {
                if (this.field601 != null && this.field601.field1837 == null) {
                    this.field554 = true;
                } else {
                    if (!this.field575) {
                        this.method318(127);
                    }
                    var2 = true;
                }
            }
            if (this.field522 != null && !class423.method2550(this.field610, 29903, this.field531)) {
                if (this.field601 != null && this.field601.field1837 == null) {
                    this.field554 = true;
                } else {
                    if (!this.field575) {
                        this.method318(69);
                    }
                    var3 = true;
                }
            }
            if (this.field513 != null && !class355.method2258(this.field610, true, this.field531)) {
                if (this.field601 != null && this.field601.field1837 == null) {
                    this.field554 = true;
                } else {
                    var4 = true;
                    if (!this.field575) {
                        this.method318(71);
                    }
                }
            }
            if (var2) {
                this.field565 = null;
            }
            if (var4) {
                this.field513 = null;
            }
            if (var3) {
                this.field522 = null;
            }
        }
        if (this.field507 != null && this.field565 == null && this.field522 == null && this.field513 == null) {
            this.field508 = null;
            this.field507 = null;
        }
        if (this.field619 != null && !class482.method2837(this.field531, (byte) -8, this.field610)) {
            if (this.field559 == null) {
                if (this.field578 != null && this.field578.field1837 == null) {
                    this.field554 = true;
                } else {
                    this.field582 = this.field591 = this.field564 = null;
                    this.field619 = null;
                }
            } else if (this.field559.field1837 == null) {
                this.field554 = true;
            } else {
                this.field582 = this.field591 = this.field564 = null;
                this.field619 = null;
            }
        }
        if (this.field502 != null && !class309.method1995((byte) -70, this.field531, this.field610)) {
            if (this.field578 != null && this.field578.field1837 == null) {
                this.field554 = true;
            } else {
                this.field502 = null;
            }
        }
        if (arg0 <= 123) {
            this.field578 = null;
        }
        if (this.field613 != null && !class728.method4025(-84, this.field610, this.field531)) {
            if (this.field578 != null && this.field578.field1837 == null) {
                this.field554 = true;
            } else {
                this.field613 = null;
            }
        }
        if (this.field548 != null && !class28.method165((byte) 70, this.field531, this.field610)) {
            if (this.field580 != null && this.field580.field1837 == null) {
                this.field554 = true;
            } else {
                this.field548 = this.field584 = null;
            }
        }
        if (this.field583 != null && !class328.method2130(this.field531, this.field610, 45)) {
            if (this.field578 != null && this.field578.field1837 == null) {
                this.field554 = true;
            } else {
                this.field583 = null;
            }
        }
        if (this.field585 != null && !class744.method4085((byte) 73, this.field531, this.field610)) {
            if ((this.field586 == null || this.field586.field6009 != null) && (this.field578 == null || this.field578.field1837 != null)) {
                this.field585 = this.field526 = this.field571 = null;
            } else {
                this.field554 = true;
            }
        }
        if (this.field570 != null && !class480.method2832(this.field531, this.field610, (byte) 30)) {
            this.field577 = null;
            this.field570 = null;
        }
        if (this.field503 != null && !class578.method3277(false, this.field531, this.field610)) {
            this.field567 = null;
            this.field503 = null;
        }
        if (this.field579 != null && !class305.method1972(-36, this.field610, this.field531)) {
            this.field579 = null;
        }
        if (this.field506 != null && (this.field531 & 0x800) == 0 && (this.field531 & 0x40000) == 0) {
            this.field506 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V", line = 3123)
    public static void method320(boolean arg0) {
        field576 = null;
        if (arg0) {
            field566 = -104;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILal;ZII)Z", line = 3134)
    public final boolean method245(int arg0, int arg1, class109 arg2, boolean arg3, int arg4, int arg5) {
        field540++;
        return this.method323(arg5, arg0, (byte) 80, arg4, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!sca", name = "wa", descriptor = "()V", line = 3144)
    public final void method268() {
        field544++;
        for (int var1 = 0; var1 < this.field588; var1++) {
            this.field565[var1] = this.field565[var1] + 7 >> 4;
            this.field522[var1] = this.field522[var1] + 7 >> 4;
            this.field513[var1] = this.field513[var1] + 7 >> 4;
        }
        this.field575 = false;
        if (this.field601 != null) {
            this.field601.field1837 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "aa", descriptor = "(SS)V", line = 3167)
    public final void method278(short arg0, short arg1) {
        field534++;
        class161 var3 = this.field621.field913;
        for (int var4 = 0; var4 < this.field606; var4++) {
            if (this.field583[var4] == arg0) {
                this.field583[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class577 var7 = var3.method1114(arg0 & 0xFFFF, -77);
            var6 = var7.field7857;
            var5 = var7.field7865;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class577 var10 = var3.method1114(arg1 & 0xFFFF, -127);
            if (var10.field7861 != 0 || var10.field7852 != 0) {
                this.field600 = true;
            }
            var8 = var10.field7865;
            var9 = var10.field7857;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field505 != null) {
            for (int var11 = 0; var11 < this.field609; var11++) {
                class177 var12 = this.field505[var11];
                class338 var13 = this.field620[var11];
                var13.field4749 = var13.field4749 & 0xFF000000 | class217.field2836[this.field502[var12.field2327] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field578 != null) {
            this.field578.field1837 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(BIISI)I", line = 3243)
    private final int method321(byte arg0, int arg1, int arg2, short arg3, int arg4) {
        if (arg1 != 65280) {
            return -92;
        }
        field603++;
        int var6 = class217.field2836[class485.method2841(arg2, 82, arg4)];
        if (arg3 != -1) {
            class577 var7 = this.field621.field913.method1114(arg3 & 0xFFFF, arg1 ^ 0xFFFF00AB);
            int var8 = var7.field7865 & 0xFF;
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
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field7857 & 0xFF;
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
                var6 = ((var13 & 0xFF00) << 8) + ((var14 & 0xFF00) + (var15 >> 8));
            }
        }
        return (var6 << 8) + 255 - (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!sca", name = "v", descriptor = "()V", line = 3315)
    public final void method277() {
        for (int var1 = 0; var1 < this.field509; var1++) {
            this.field513[var1] = -this.field513[var1];
        }
        field516++;
        for (int var2 = 0; var2 < this.field592; var2++) {
            this.field564[var2] = (short) (-this.field564[var2]);
        }
        for (int var3 = 0; var3 < this.field606; var3++) {
            short var4 = this.field585[var3];
            this.field585[var3] = this.field571[var3];
            this.field571[var3] = var4;
        }
        if (this.field559 == null && this.field578 != null) {
            this.field578.field1837 = null;
        }
        if (this.field559 != null) {
            this.field559.field1837 = null;
        }
        if (this.field601 != null) {
            this.field601.field1837 = null;
        }
        if (this.field586 != null) {
            this.field586.field6009 = null;
        }
        this.field575 = false;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 3366)
    public static final byte[] method322(String arg0, int arg1) {
        field530++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        if (arg1 != -1985169656) {
            method322(null, 86);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lal;)V", line = 3518)
    public final void method259(class109 arg0) {
        field589++;
        class584 var2 = (class584) arg0;
        if (this.field569 != null) {
            for (int var3 = 0; var3 < this.field569.length; var3++) {
                class290 var4 = this.field569[var3];
                class290 var5 = var4;
                if (var4.field4130 != null) {
                    var5 = var4.field4130;
                }
                var5.field4146 = (int) ((float) this.field513[var4.field4142] * var2.field7934 + (float) this.field565[var4.field4142] * var2.field7950 + (float) this.field522[var4.field4142] * var2.field7951 + var2.field7952);
                var5.field4129 = (int) ((float) this.field513[var4.field4142] * var2.field7932 + (float) this.field565[var4.field4142] * var2.field7929 + (float) this.field522[var4.field4142] * var2.field7927 + var2.field7940);
                var5.field4132 = (int) ((float) this.field513[var4.field4142] * var2.field7955 + (float) this.field565[var4.field4142] * var2.field7953 + (float) this.field522[var4.field4142] * var2.field7963 + var2.field7956);
                var5.field4136 = (int) ((float) this.field513[var4.field4145] * var2.field7934 + (float) this.field565[var4.field4145] * var2.field7950 + (float) this.field522[var4.field4145] * var2.field7951 + var2.field7952);
                var5.field4147 = (int) ((float) this.field513[var4.field4145] * var2.field7932 + (float) this.field565[var4.field4145] * var2.field7929 + (float) this.field522[var4.field4145] * var2.field7927 + var2.field7940);
                var5.field4135 = (int) ((float) this.field513[var4.field4145] * var2.field7955 + (float) this.field565[var4.field4145] * var2.field7953 + (float) this.field522[var4.field4145] * var2.field7963 + var2.field7956);
                var5.field4149 = (int) ((float) this.field513[var4.field4133] * var2.field7934 + (float) this.field565[var4.field4133] * var2.field7950 + (float) this.field522[var4.field4133] * var2.field7951 + var2.field7952);
                var5.field4139 = (int) ((float) this.field513[var4.field4133] * var2.field7932 + (float) this.field565[var4.field4133] * var2.field7929 + (float) this.field522[var4.field4133] * var2.field7927 + var2.field7940);
                var5.field4131 = (int) ((float) this.field513[var4.field4133] * var2.field7955 + (float) this.field565[var4.field4133] * var2.field7953 + (float) this.field522[var4.field4133] * var2.field7963 + var2.field7956);
            }
        }
        if (this.field512 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field512.length; var6++) {
            class220 var7 = this.field512[var6];
            class220 var8 = var7;
            if (var7.field2855 != null) {
                var8 = var7.field2855;
            }
            if (var7.field2845 == null) {
                var7.field2845 = var2.method813();
            } else {
                var7.field2845.method816(var2);
            }
            var8.field2853 = (int) ((float) this.field513[var7.field2854] * var2.field7934 + (float) this.field565[var7.field2854] * var2.field7950 + (float) this.field522[var7.field2854] * var2.field7951 + var2.field7952);
            var8.field2848 = (int) ((float) this.field513[var7.field2854] * var2.field7932 + (float) this.field565[var7.field2854] * var2.field7929 + (float) this.field522[var7.field2854] * var2.field7927 + var2.field7940);
            var8.field2846 = (int) ((float) this.field513[var7.field2854] * var2.field7955 + (float) this.field565[var7.field2854] * var2.field7953 + (float) this.field522[var7.field2854] * var2.field7963 + var2.field7956);
        }
    }

    @OriginalMember(owner = "client!sca", name = "RA", descriptor = "()I", line = 3584)
    public final int method250() {
        field549++;
        if (!this.field575) {
            this.method318(59);
        }
        return this.field527;
    }

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "()[Lrea;", line = 3598)
    public final class220[] method283() {
        field504++;
        return this.field512;
    }

    @OriginalMember(owner = "client!sca", name = "F", descriptor = "()Z", line = 3607)
    public final boolean method272() {
        field604++;
        return this.field538;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "()V", line = 3616)
    public final void method269() {
        field612++;
    }

    @OriginalMember(owner = "client!sca", name = "H", descriptor = "(III)V", line = 3625)
    public final void method266(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field509; var4++) {
            if (arg0 != 0) {
                this.field565[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field522[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field513[var4] += arg2;
            }
        }
        field618++;
        this.field575 = false;
        if (this.field601 != null) {
            this.field601.field1837 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "P", descriptor = "(IIII)V", line = 3659)
    public final void method253(int arg0, int arg1, int arg2, int arg3) {
        field539++;
        if (arg0 == 0) {
            int var5 = 0;
            class7.field56 = 0;
            class395.field5686 = 0;
            class703.field9417 = 0;
            for (int var6 = 0; var6 < this.field509; var6++) {
                class395.field5686 += this.field565[var6];
                class7.field56 += this.field522[var6];
                class703.field9417 += this.field513[var6];
                var5++;
            }
            if (var5 > 0) {
                class395.field5686 = class395.field5686 / var5 + arg1;
                class703.field9417 = class703.field9417 / var5 + arg3;
                class7.field56 = class7.field56 / var5 + arg2;
            } else {
                class395.field5686 = arg1;
                class703.field9417 = arg3;
                class7.field56 = arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field509; var7++) {
                this.field565[var7] += arg1;
                this.field522[var7] += arg2;
                this.field513[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field509; var8++) {
                this.field565[var8] -= class395.field5686;
                this.field522[var8] -= class7.field56;
                this.field513[var8] -= class703.field9417;
                if (arg3 != 0) {
                    int var9 = class110.field1524[arg3];
                    int var10 = class110.field1523[arg3];
                    int var11 = this.field522[var8] * var9 + (this.field565[var8] * var10) + 16383 >> 14;
                    this.field522[var8] = this.field522[var8] * var10 + 16383 - this.field565[var8] * var9 >> 14;
                    this.field565[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class110.field1524[arg1];
                    int var13 = class110.field1523[arg1];
                    int var14 = this.field522[var8] * var13 - (this.field513[var8] * var12 - 16383) >> 14;
                    this.field513[var8] = this.field522[var8] * var12 + this.field513[var8] * var13 + 16383 >> 14;
                    this.field522[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class110.field1524[arg2];
                    int var16 = class110.field1523[arg2];
                    int var17 = this.field513[var8] * var15 + (this.field565[var8] * var16 + 16383) >> 14;
                    this.field513[var8] = this.field513[var8] * var16 + 16383 - this.field565[var8] * var15 >> 14;
                    this.field565[var8] = var17;
                }
                this.field565[var8] += class395.field5686;
                this.field522[var8] += class7.field56;
                this.field513[var8] += class703.field9417;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field509; var18++) {
                this.field565[var18] -= class395.field5686;
                this.field522[var18] -= class7.field56;
                this.field513[var18] -= class703.field9417;
                this.field565[var18] = this.field565[var18] * arg1 / 128;
                this.field522[var18] = this.field522[var18] * arg2 / 128;
                this.field513[var18] = this.field513[var18] * arg3 / 128;
                this.field565[var18] += class395.field5686;
                this.field522[var18] += class7.field56;
                this.field513[var18] += class703.field9417;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field606; var19++) {
                int var23 = (this.field613[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field613[var19] = (byte) var23;
            }
            if (this.field578 != null) {
                this.field578.field1837 = null;
            }
            if (this.field505 != null) {
                for (int var20 = 0; var20 < this.field609; var20++) {
                    class177 var21 = this.field505[var20];
                    class338 var22 = this.field620[var20];
                    var22.field4749 = var22.field4749 & 0xFFFFFF | 255 - (this.field613[var21.field2327] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field606; var24++) {
                int var28 = this.field502[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3CB) >> 7;
                int var31 = arg2 / 4 + var30;
                int var32 = var29 + arg1 & 0x3F;
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
                this.field502[var24] = (short) class670.method3699(class670.method3699(var32 << 10, var31 << 7), var34);
            }
            if (this.field578 != null) {
                this.field578.field1837 = null;
            }
            if (this.field505 != null) {
                for (int var25 = 0; var25 < this.field609; var25++) {
                    class177 var26 = this.field505[var25];
                    class338 var27 = this.field620[var25];
                    var27.field4749 = var27.field4749 & 0xFF000000 | class217.field2836[this.field502[var26.field2327] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field609; var35++) {
                class338 var36 = this.field620[var35];
                var36.field4741 += arg2;
                var36.field4748 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field609; var37++) {
                class338 var38 = this.field620[var37];
                var38.field4742 = var38.field4742 * arg1 >> 7;
                var38.field4744 = var38.field4744 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field609; var39++) {
                class338 var40 = this.field620[var39];
                var40.field4746 = var40.field4746 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILal;ZI)Z", line = 3968)
    public final boolean method248(int arg0, int arg1, class109 arg2, boolean arg3, int arg4) {
        field596++;
        return this.method323(-1, arg0, (byte) 80, arg4, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!sca", name = "r", descriptor = "()Z", line = 3983)
    public final boolean method285() {
        field529++;
        return this.field600;
    }

    @OriginalMember(owner = "client!sca", name = "WA", descriptor = "()I", line = 3991)
    public final int method262() {
        field594++;
        return this.field520;
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Llf;)V", line = 5890)
    public class50(class250 arg0) {
        this.field621 = arg0;
        this.field601 = new class135(null, 5126, 3, 0);
        this.field580 = new class135(null, 5126, 2, 0);
        this.field559 = new class135(null, 5126, 3, 0);
        this.field578 = new class135(null, 5121, 4, 0);
        this.field586 = new class417();
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Llf;Lgl;IIII)V", line = 5902)
    public class50(class250 arg0, class625 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field610 = arg5;
        this.field621 = arg0;
        this.field531 = arg2;
        if (class550.method3160(arg2, arg5, 0)) {
            this.field601 = new class135(null, 5126, 3, 0);
        }
        if (class477.method2824(arg5, (byte) 81, arg2)) {
            this.field580 = new class135(null, 5126, 2, 0);
        }
        if (class12.method81(55, arg5, arg2)) {
            this.field559 = new class135(null, 5126, 3, 0);
        }
        if (class729.method4032(2048, arg5, arg2)) {
            this.field578 = new class135(null, 5121, 4, 0);
        }
        if (class197.method1291(arg2, -22235, arg5)) {
            this.field586 = new class417();
        }
        class161 var7 = arg0.field913;
        int[] var8 = new int[arg1.field8442];
        this.field508 = new int[arg1.field8459 + 1];
        for (int var9 = 0; var9 < arg1.field8442; var9++) {
            if (arg1.field8428 == null || arg1.field8428[var9] != 2) {
                if (arg1.field8467 != null && arg1.field8467[var9] != -1) {
                    class577 var173 = var7.method1114(arg1.field8467[var9] & 0xFFFF, -107);
                    if (((this.field610 & 0x40) == 0 || !var173.field7868) && var173.field7863) {
                        continue;
                    }
                }
                var8[this.field606++] = var9;
                this.field508[arg1.field8461[var9]]++;
                this.field508[arg1.field8421[var9]]++;
                this.field508[arg1.field8437[var9]]++;
            }
        }
        this.field558 = this.field606;
        long[] var10 = new long[this.field606];
        boolean var11 = (this.field531 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field606; var12++) {
            int var156 = var8[var12];
            class577 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field8463 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field8463.length; var163++) {
                    class390 var164 = arg1.field8463[var163];
                    if (var164.field5641 == var156) {
                        class235 var165 = class345.method2185(127, var164.field5642);
                        if (var165.field3125) {
                            var162 = true;
                        }
                        if (var165.field3124 != -1) {
                            class577 var166 = var7.method1114(var165.field3124, -43);
                            if (var166.field7860 == 2) {
                                this.field538 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field558--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field8467 != null) {
                var167 = arg1.field8467[var156];
                if (var167 != -1) {
                    var157 = var7.method1114(var167 & 0xFFFF, -32);
                    if ((this.field610 & 0x40) != 0 && var157.field7868) {
                        var157 = null;
                        var167 = -1;
                    } else {
                        var161 = var157.field7867;
                        if (var157.field7861 != 0 || var157.field7852 != 0) {
                            this.field600 = true;
                        }
                        var160 = var157.field7855;
                    }
                }
            }
            boolean var168 = arg1.field8466 != null && arg1.field8466[var156] != 0 || var157 != null && var157.field7860 != 0;
            if ((var11 || var168) && arg1.field8470 != null) {
                var158 += arg1.field8470[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var167 & 0xFFFF << 16) + var159;
            int var171 = (var161 & 0xFF) + var169;
            int var172 = (var12 & 0xFFFF) + var170;
            var10[var12] = ((long) var171 << 32) + ((long) var172);
            this.field538 |= var168;
            this.field600 |= var157 != null && (var157.field7861 != 0 || var157.field7852 != 0);
        }
        class393.method2420(var10, var8, -93);
        this.field522 = arg1.field8441;
        this.field513 = arg1.field8452;
        this.field565 = arg1.field8453;
        this.field509 = arg1.field8459;
        this.field588 = arg1.field8438;
        this.field567 = arg1.field8471;
        this.field512 = arg1.field8430;
        class101[] var13 = new class101[this.field509];
        this.field569 = arg1.field8434;
        if (arg1.field8463 != null) {
            this.field609 = arg1.field8463.length;
            this.field505 = new class177[this.field609];
            this.field620 = new class338[this.field609];
            for (int var14 = 0; var14 < this.field609; var14++) {
                class390 var15 = arg1.field8463[var14];
                class235 var16 = class345.method2185(127, var15.field5642);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field606; var18++) {
                    if (var8[var18] == var15.field5641) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class217.field2836[arg1.field8439[var15.field5641] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field8466 == null ? 0 : arg1.field8466[var15.field5641]) << 24;
                this.field505[var14] = new class177(var17, arg1.field8461[var15.field5641], arg1.field8421[var15.field5641], arg1.field8437[var15.field5641], var16.field3131, var16.field3130, var16.field3124, var16.field3132, var16.field3126, var16.field3125, var16.field3127, var15.field5640);
                this.field620[var14] = new class338(var20);
            }
        }
        int var21 = this.field606 * 3;
        this.field585 = new short[this.field606];
        this.field564 = new short[var21];
        this.field582 = new short[var21];
        class565.field7736 = new long[var21];
        if (arg1.field8460 != null) {
            this.field577 = new short[this.field606];
        }
        this.field591 = new short[var21];
        this.field619 = new byte[var21];
        this.field571 = new short[this.field606];
        this.field583 = new short[this.field606];
        this.field613 = new byte[this.field606];
        this.field548 = new float[var21];
        this.field561 = (short) arg4;
        this.field584 = new float[var21];
        this.field507 = new short[var21];
        this.field526 = new short[this.field606];
        this.field502 = new short[this.field606];
        this.field520 = (short) arg3;
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field8459; var23++) {
            int var155 = this.field508[var23];
            this.field508[var23] = var22;
            var22 += var155;
            var13[var23] = new class101();
        }
        this.field508[arg1.field8459] = var22;
        class715 var24 = class758.method4157(arg1, false, var8, this.field606);
        class193[] var25 = new class193[arg1.field8442];
        for (int var26 = 0; var26 < arg1.field8442; var26++) {
            short var134 = arg1.field8461[var26];
            short var135 = arg1.field8421[var26];
            short var136 = arg1.field8437[var26];
            int var137 = this.field565[var135] - this.field565[var134];
            int var138 = this.field522[var135] - this.field522[var134];
            int var139 = this.field513[var135] - this.field513[var134];
            int var140 = this.field565[var136] - this.field565[var134];
            int var141 = this.field522[var136] - this.field522[var134];
            int var142 = this.field513[var136] - this.field513[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145;
            for (var145 = var137 * var141 - (var138 * var140); var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192; var145 >>= 0x1) {
                var143 >>= 0x1;
                var144 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var145 * var145 + var143 * var143 + var144 * var144));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var144 * 256 / var146;
            int var148 = var143 * 256 / var146;
            int var149 = var145 * 256 / var146;
            byte var150 = arg1.field8428 == null ? 0 : arg1.field8428[var26];
            if (var150 == 0) {
                class101 var151 = var13[var134];
                var151.field1461 += var148;
                var151.field1458 += var149;
                var151.field1462 += var147;
                var151.field1457++;
                class101 var152 = var13[var135];
                var152.field1457++;
                var152.field1462 += var147;
                var152.field1458 += var149;
                var152.field1461 += var148;
                class101 var153 = var13[var136];
                var153.field1458 += var149;
                var153.field1462 += var147;
                var153.field1461 += var148;
                var153.field1457++;
            } else if (var150 == 1) {
                class193 var154 = var25[var26] = new class193();
                var154.field2510 = var149;
                var154.field2514 = var148;
                var154.field2509 = var147;
            }
        }
        for (int var27 = 0; var27 < this.field606; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field8439[var43] & 0xFFFF;
            int var45;
            if (arg1.field8447 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field8447[var43];
            }
            int var46;
            if (arg1.field8466 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field8466[var43] & 0xFF;
            }
            short var47 = arg1.field8467 == null ? -1 : arg1.field8467[var43];
            if (var47 != -1 && (this.field610 & 0x40) != 0) {
                class577 var48 = var7.method1114(var47 & 0xFFFF, -110);
                if (var48.field7868) {
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
                    var56 = 2;
                    var51 = 1.0F;
                    var50 = 1.0F;
                    var49 = 0.0F;
                    var54 = 0.0F;
                    var55 = 1;
                    var53 = 0.0F;
                    var52 = 1.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field8427[var45];
                    if (var58 == 0) {
                        short var59 = arg1.field8461[var43];
                        short var60 = arg1.field8421[var43];
                        short var61 = arg1.field8437[var43];
                        short var62 = arg1.field8436[var45];
                        short var63 = arg1.field8454[var45];
                        short var64 = arg1.field8440[var45];
                        float var65 = (float) arg1.field8453[var62];
                        float var66 = (float) arg1.field8441[var62];
                        float var67 = (float) arg1.field8452[var62];
                        float var68 = (float) arg1.field8453[var63] - var65;
                        float var69 = (float) arg1.field8441[var63] - var66;
                        float var70 = (float) arg1.field8452[var63] - var67;
                        float var71 = (float) arg1.field8453[var64] - var65;
                        float var72 = (float) arg1.field8441[var64] - var66;
                        float var73 = (float) arg1.field8452[var64] - var67;
                        float var74 = (float) arg1.field8453[var59] - var65;
                        float var75 = (float) arg1.field8441[var59] - var66;
                        float var76 = (float) arg1.field8452[var59] - var67;
                        float var77 = (float) arg1.field8453[var60] - var65;
                        float var78 = (float) arg1.field8441[var60] - var66;
                        float var79 = (float) arg1.field8452[var60] - var67;
                        float var80 = (float) arg1.field8453[var61] - var65;
                        float var81 = (float) arg1.field8441[var61] - var66;
                        float var82 = (float) arg1.field8452[var61] - var67;
                        float var83 = var69 * var73 - var70 * var72;
                        float var84 = var70 * var71 - (var68 * var73);
                        float var85 = var68 * var72 - (var69 * var71);
                        float var86 = var72 * var85 - var73 * var84;
                        float var87 = var73 * var83 - (var71 * var85);
                        float var88 = var71 * var84 - (var72 * var83);
                        float var89 = 1.0F / (var70 * var88 + var68 * var86 + var69 * var87);
                        var49 = (var76 * var88 + var74 * var86 + var75 * var87) * var89;
                        var53 = (var82 * var88 + var80 * var86 + var81 * var87) * var89;
                        var51 = (var79 * var88 + var77 * var86 + var78 * var87) * var89;
                        float var90 = var68 * var84 - var69 * var83;
                        float var91 = var69 * var85 - var70 * var84;
                        float var92 = var70 * var83 - (var68 * var85);
                        float var93 = 1.0F / (var73 * var90 + var71 * var91 + var72 * var92);
                        var52 = (var79 * var90 + var77 * var91 + var78 * var92) * var93;
                        var54 = (var82 * var90 + var80 * var91 + var81 * var92) * var93;
                        var50 = (var76 * var90 + var74 * var91 + var75 * var92) * var93;
                    } else {
                        short var94 = arg1.field8461[var43];
                        short var95 = arg1.field8421[var43];
                        short var96 = arg1.field8437[var43];
                        int var97 = var24.field9748[var45];
                        int var98 = var24.field9755[var45];
                        int var99 = var24.field9751[var45];
                        float[] var100 = var24.field9753[var45];
                        byte var101 = arg1.field8476[var45];
                        float var102 = (float) arg1.field8449[var45] / 256.0F;
                        if (var58 == 1) {
                            float var103 = (float) arg1.field8424[var45] / 1024.0F;
                            class172.method1164(arg1.field8441[var94], -105, var100, arg1.field8453[var94], var101, var102, var103, class533.field7396, var98, var99, arg1.field8452[var94], var97);
                            var49 = class533.field7396[0];
                            var50 = class533.field7396[1];
                            class172.method1164(arg1.field8441[var95], -94, var100, arg1.field8453[var95], var101, var102, var103, class533.field7396, var98, var99, arg1.field8452[var95], var97);
                            var51 = class533.field7396[0];
                            var52 = class533.field7396[1];
                            class172.method1164(arg1.field8441[var96], -93, var100, arg1.field8453[var96], var101, var102, var103, class533.field7396, var98, var99, arg1.field8452[var96], var97);
                            var54 = class533.field7396[1];
                            var53 = class533.field7396[0];
                            float var104 = var103 / 2.0F;
                            if ((var101 & 0x1) == 0) {
                                if ((var53 - var49 > var104)) {
                                    var56 = 1;
                                    var53 -= var103;
                                } else if (var104 < var49 - var53) {
                                    var56 = 2;
                                    var53 += var103;
                                }
                                if (var104 < var51 - var49) {
                                    var55 = 1;
                                    var51 -= var103;
                                } else if (var104 < var49 - var51) {
                                    var51 += var103;
                                    var55 = 2;
                                }
                            } else {
                                if (var104 < var54 - var50) {
                                    var54 -= var103;
                                    var56 = 1;
                                } else if (var50 - var54 > var104) {
                                    var54 += var103;
                                    var56 = 2;
                                }
                                if (var52 - var50 > var104) {
                                    var52 -= var103;
                                    var55 = 1;
                                } else if (var50 - var52 > var104) {
                                    var52 += var103;
                                    var55 = 2;
                                }
                            }
                        } else if (var58 == 2) {
                            float var105 = (float) arg1.field8431[var45] / 256.0F;
                            float var106 = (float) arg1.field8458[var45] / 256.0F;
                            int var107 = arg1.field8453[var95] - arg1.field8453[var94];
                            int var108 = arg1.field8441[var95] - arg1.field8441[var94];
                            int var109 = arg1.field8452[var95] - arg1.field8452[var94];
                            int var110 = arg1.field8453[var96] - arg1.field8453[var94];
                            int var111 = arg1.field8441[var96] - arg1.field8441[var94];
                            int var112 = arg1.field8452[var96] - arg1.field8452[var94];
                            int var113 = var108 * var112 - (var109 * var111);
                            int var114 = var109 * var110 - (var107 * var112);
                            int var115 = var107 * var111 - (var108 * var110);
                            float var116 = 64.0F / (float) arg1.field8426[var45];
                            float var117 = 64.0F / (float) arg1.field8444[var45];
                            float var118 = 64.0F / (float) arg1.field8424[var45];
                            float var119 = (var100[2] * (float) var115 + var100[1] * (float) var114 + var100[0] * (float) var113) / var116;
                            float var120 = (var100[5] * (float) var115 + var100[3] * (float) var113 + var100[4] * (float) var114) / var117;
                            float var121 = (var100[8] * (float) var115 + var100[6] * (float) var113 + var100[7] * (float) var114) / var118;
                            var57 = class450.method2677(-103, var121, var120, var119);
                            class219.method1401(var98, arg1.field8453[var94], var97, var57, arg1.field8441[var94], var106, var100, var101, arg1.field8452[var94], var105, var102, var99, (byte) 125, class533.field7396);
                            var50 = class533.field7396[1];
                            var49 = class533.field7396[0];
                            class219.method1401(var98, arg1.field8453[var95], var97, var57, arg1.field8441[var95], var106, var100, var101, arg1.field8452[var95], var105, var102, var99, (byte) 105, class533.field7396);
                            var52 = class533.field7396[1];
                            var51 = class533.field7396[0];
                            class219.method1401(var98, arg1.field8453[var96], var97, var57, arg1.field8441[var96], var106, var100, var101, arg1.field8452[var96], var105, var102, var99, (byte) 100, class533.field7396);
                            var54 = class533.field7396[1];
                            var53 = class533.field7396[0];
                        } else if (var58 == 3) {
                            class756.method4145(arg1.field8441[var94], var102, var99, arg1.field8452[var94], class533.field7396, var98, var97, var100, var101, arg1.field8453[var94], 6);
                            var49 = class533.field7396[0];
                            var50 = class533.field7396[1];
                            class756.method4145(arg1.field8441[var95], var102, var99, arg1.field8452[var95], class533.field7396, var98, var97, var100, var101, arg1.field8453[var95], 6);
                            var51 = class533.field7396[0];
                            var52 = class533.field7396[1];
                            class756.method4145(arg1.field8441[var96], var102, var99, arg1.field8452[var96], class533.field7396, var98, var97, var100, var101, arg1.field8453[var96], 6);
                            var53 = class533.field7396[0];
                            var54 = class533.field7396[1];
                            if ((var101 & 0x1) == 0) {
                                if (var53 - var49 > 0.5F) {
                                    var53--;
                                    var56 = 1;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                                if ((var51 - var49 > 0.5F)) {
                                    var55 = 1;
                                    var51--;
                                } else if (var49 - var51 > 0.5F) {
                                    var55 = 2;
                                    var51++;
                                }
                            } else {
                                if ((var54 - var50 > 0.5F)) {
                                    var56 = 1;
                                    var54--;
                                } else if (var50 - var54 > 0.5F) {
                                    var54++;
                                    var56 = 2;
                                }
                                if ((var52 - var50 > 0.5F)) {
                                    var52--;
                                    var55 = 1;
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
            if (arg1.field8428 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field8428[var43];
            }
            if (var122 == 0) {
                long var126 = (long) (var45 << 2) + ((long) (var57 << 24) + ((long) var46) + (long) (var44 << 8) << 32);
                short var128 = arg1.field8461[var43];
                short var129 = arg1.field8421[var43];
                short var130 = arg1.field8437[var43];
                class101 var131 = var13[var128];
                this.field585[var27] = this.method317(var131.field1461, arg1, var131.field1462, (byte) 52, var126, var128, var131.field1458, var50, var49, var131.field1457);
                class101 var132 = var13[var129];
                this.field526[var27] = this.method317(var132.field1461, arg1, var132.field1462, (byte) 76, (long) var55 + var126, var129, var132.field1458, var52, var51, var132.field1457);
                class101 var133 = var13[var130];
                this.field571[var27] = this.method317(var133.field1461, arg1, var133.field1462, (byte) 116, (long) var56 + var126, var130, var133.field1458, var54, var53, var133.field1457);
            } else if (var122 == 1) {
                class193 var123 = var25[var43];
                long var124 = (long) ((var123.field2514 <= 0 ? 2048 : 1024) + ((var45 << 2) + (var123.field2509 + 256 << 12)) + (var123.field2510 + 256 << 22)) + ((long) (var44 << 8) + (long) (var57 << 24) + (long) var46 << 32);
                this.field585[var27] = this.method317(var123.field2514, arg1, var123.field2509, (byte) 63, var124, arg1.field8461[var43], var123.field2510, var50, var49, 0);
                this.field526[var27] = this.method317(var123.field2514, arg1, var123.field2509, (byte) 42, (long) var55 + var124, arg1.field8421[var43], var123.field2510, var52, var51, 0);
                this.field571[var27] = this.method317(var123.field2514, arg1, var123.field2509, (byte) 48, (long) var56 + var124, arg1.field8437[var43], var123.field2510, var54, var53, 0);
            }
            if (arg1.field8466 != null) {
                this.field613[var27] = arg1.field8466[var43];
            }
            if (arg1.field8460 != null) {
                this.field577[var27] = arg1.field8460[var43];
            }
            this.field502[var27] = arg1.field8439[var43];
            this.field583[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field558; var30++) {
            short var42 = this.field583[var30];
            if (var29 != var42) {
                var29 = var42;
                var28++;
            }
        }
        this.field506 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field558; var33++) {
            short var41 = this.field583[var33];
            if (var32 != var41) {
                var32 = var41;
                this.field506[var31++] = var33;
            }
        }
        this.field506[var31] = this.field558;
        class565.field7736 = null;
        this.field582 = class290.method1864(this.field592, this.field582, 0);
        this.field591 = class290.method1864(this.field592, this.field591, 0);
        this.field564 = class290.method1864(this.field592, this.field564, 0);
        this.field619 = class608.method3388((byte) 31, this.field619, this.field592);
        this.field548 = class400.method2438(this.field592, this.field548, (byte) 121);
        this.field584 = class400.method2438(this.field592, this.field584, (byte) 120);
        if (arg1.field8448 != null && class578.method3277(false, arg2, this.field610)) {
            this.field503 = arg1.method3448(false, false);
        }
        if (arg1.field8463 != null && class305.method1972(-76, this.field610, arg2)) {
            this.field579 = arg1.method3451(10956);
        }
        if (arg1.field8455 != null && class480.method2832(arg2, this.field610, (byte) 125)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field606; var36++) {
                int var40 = arg1.field8455[var8[var36]];
                if (var40 >= 0) {
                    if (var40 > var34) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field570 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field570[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field606; var38++) {
                int var39 = arg1.field8455[var8[var38]];
                if (var39 >= 0) {
                    this.field570[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "na", descriptor = "()I", line = 4006)
    public final int method280() {
        field560++;
        if (!this.field575) {
            this.method318(60);
        }
        return this.field518;
    }

    @OriginalMember(owner = "client!sca", name = "s", descriptor = "(I)V", line = 4021)
    public final void method270(int arg0) {
        this.field531 = arg0;
        field528++;
        if (this.field598 != null && (this.field531 & 0x10000) == 0) {
            this.field619 = this.field598.field8651;
            this.field582 = this.field598.field8658;
            this.field564 = this.field598.field8653;
            this.field591 = this.field598.field8652;
            this.field598 = null;
        }
        this.field554 = true;
        this.method319(125);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I[IIIIIZ)V", line = 4045)
    public final void method247(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field553++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            class395.field5686 = 0;
            class7.field56 = 0;
            class703.field9417 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field503.length) {
                    int[] var15 = this.field503[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class395.field5686 += this.field565[var17];
                        class7.field56 += this.field522[var17];
                        var12++;
                        class703.field9417 += this.field513[var17];
                    }
                }
            }
            if (var12 > 0) {
                class7.field56 = class7.field56 / var12 + var9;
                class395.field5686 = class395.field5686 / var12 + var10;
                class703.field9417 = class703.field9417 / var12 + var11;
            } else {
                class395.field5686 = var10;
                class703.field9417 = var11;
                class7.field56 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field503.length > var22) {
                    int[] var23 = this.field503[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field565[var25] += var19;
                        this.field522[var25] += var20;
                        this.field513[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field503.length) {
                    int[] var46 = this.field503[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field565[var59] -= class395.field5686;
                            this.field522[var59] -= class7.field56;
                            this.field513[var59] -= class703.field9417;
                            if (arg4 != 0) {
                                int var60 = class110.field1524[arg4];
                                int var61 = class110.field1523[arg4];
                                int var62 = this.field522[var59] * var60 + this.field565[var59] * var61 + 16383 >> 14;
                                this.field522[var59] = this.field522[var59] * var61 + 16383 - this.field565[var59] * var60 >> 14;
                                this.field565[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class110.field1524[arg2];
                                int var64 = class110.field1523[arg2];
                                int var65 = this.field522[var59] * var64 + 16383 - (this.field513[var59] * var63) >> 14;
                                this.field513[var59] = this.field522[var59] * var63 + this.field513[var59] * var64 + 16383 >> 14;
                                this.field522[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class110.field1524[arg3];
                                int var67 = class110.field1523[arg3];
                                int var68 = this.field565[var59] * var67 + this.field513[var59] * var66 + 16383 >> 14;
                                this.field513[var59] = this.field513[var59] * var67 + 16383 - (this.field565[var59] * var66) >> 14;
                                this.field565[var59] = var68;
                            }
                            this.field565[var59] += class395.field5686;
                            this.field522[var59] += class7.field56;
                            this.field513[var59] += class703.field9417;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field565[var48] -= class395.field5686;
                            this.field522[var48] -= class7.field56;
                            this.field513[var48] -= class703.field9417;
                            if (arg2 != 0) {
                                int var49 = class110.field1524[arg2];
                                int var50 = class110.field1523[arg2];
                                int var51 = this.field522[var48] * var50 + 16383 - (this.field513[var48] * var49) >> 14;
                                this.field513[var48] = this.field522[var48] * var49 - (-(this.field513[var48] * var50) - 16383) >> 14;
                                this.field522[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class110.field1524[arg4];
                                int var53 = class110.field1523[arg4];
                                int var54 = this.field565[var48] * var53 + this.field522[var48] * var52 + 16383 >> 14;
                                this.field522[var48] = this.field522[var48] * var53 + 16383 - (this.field565[var48] * var52) >> 14;
                                this.field565[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class110.field1524[arg3];
                                int var56 = class110.field1523[arg3];
                                int var57 = this.field565[var48] * var56 + this.field513[var48] * var55 + 16383 >> 14;
                                this.field513[var48] = this.field513[var48] * var56 + 16383 - (this.field565[var48] * var55) >> 14;
                                this.field565[var48] = var57;
                            }
                            this.field565[var48] += class395.field5686;
                            this.field522[var48] += class7.field56;
                            this.field513[var48] += class703.field9417;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field503.length > var28) {
                        int[] var29 = this.field503[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field508[var31];
                            int var33 = this.field508[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field507[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class110.field1524[arg4];
                                    int var37 = class110.field1523[arg4];
                                    int var38 = this.field591[var35] * var36 + this.field582[var35] * var37 + 16383 >> 14;
                                    this.field591[var35] = (short) (this.field591[var35] * var37 + 16383 - (this.field582[var35] * var36) >> 14);
                                    this.field582[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class110.field1524[arg2];
                                    int var40 = class110.field1523[arg2];
                                    int var41 = this.field591[var35] * var40 + 16383 - (this.field564[var35] * var39) >> 14;
                                    this.field564[var35] = (short) (this.field591[var35] * var39 + (this.field564[var35] * var40 + 16383) >> 14);
                                    this.field591[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class110.field1524[arg3];
                                    int var43 = class110.field1523[arg3];
                                    int var44 = this.field582[var35] * var43 + this.field564[var35] * var42 + 16383 >> 14;
                                    this.field564[var35] = (short) (this.field564[var35] * var43 + 16383 - (this.field582[var35] * var42) >> 14);
                                    this.field582[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field559 == null && this.field578 != null) {
                    this.field578.field1837 = null;
                }
                if (this.field559 != null) {
                    this.field559.field1837 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field503.length > var70) {
                    int[] var71 = this.field503[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field565[var73] -= class395.field5686;
                        this.field522[var73] -= class7.field56;
                        this.field513[var73] -= class703.field9417;
                        this.field565[var73] = this.field565[var73] * arg2 >> 7;
                        this.field522[var73] = this.field522[var73] * arg3 >> 7;
                        this.field513[var73] = this.field513[var73] * arg4 >> 7;
                        this.field565[var73] += class395.field5686;
                        this.field522[var73] += class7.field56;
                        this.field513[var73] += class703.field9417;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field570 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field570.length > var78) {
                        int[] var79 = this.field570[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field613[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field613[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field578 != null) {
                            this.field578.field1837 = null;
                        }
                    }
                }
                if (this.field505 != null) {
                    for (int var75 = 0; var75 < this.field609; var75++) {
                        class177 var76 = this.field505[var75];
                        class338 var77 = this.field620[var75];
                        var77.field4749 = var77.field4749 & 0xFFFFFF | 255 - (this.field613[var76.field2327] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field570 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field570.length > var87) {
                        int[] var88 = this.field570[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field502[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFC63) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var92 + arg2 & 0x3F;
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
                            this.field502[var90] = (short) class670.method3699(class670.method3699(var94 << 10, var95 << 7), var97);
                        }
                        if (var88.length > 0 && this.field578 != null) {
                            this.field578.field1837 = null;
                        }
                    }
                }
                if (this.field505 != null) {
                    for (int var84 = 0; var84 < this.field609; var84++) {
                        class177 var85 = this.field505[var84];
                        class338 var86 = this.field620[var84];
                        var86.field4749 = var86.field4749 & 0xFF000000 | class217.field2836[this.field502[var85.field2327] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field579 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field579.length) {
                        int[] var100 = this.field579[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class338 var102 = this.field620[var100[var101]];
                            var102.field4748 += arg2;
                            var102.field4741 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field579 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field579.length) {
                        int[] var105 = this.field579[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class338 var107 = this.field620[var105[var106]];
                            var107.field4742 = var107.field4742 * arg2 >> 7;
                            var107.field4744 = var107.field4744 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field579 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field579.length) {
                    int[] var110 = this.field579[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class338 var112 = this.field620[var110[var111]];
                        var112.field4746 = var112.field4746 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIBIZLal;I)Z", line = 4702)
    private final boolean method323(int arg0, int arg1, byte arg2, int arg3, boolean arg4, class109 arg5, int arg6) {
        field542++;
        class584 var8 = (class584) arg5;
        class584 var9 = this.field621.field3545;
        float var10 = var8.field7956 * var9.field7934 + var8.field7952 * var9.field7950 + var8.field7940 * var9.field7951 + var9.field7952;
        float var11 = var8.field7956 * var9.field7932 + var8.field7952 * var9.field7929 + var8.field7940 * var9.field7927 + var9.field7940;
        class127.field1741 = var8.field7955 * var9.field7934 + var8.field7934 * var9.field7950 + var8.field7932 * var9.field7951;
        class322.field4575 = var8.field7953 * var9.field7932 + var8.field7950 * var9.field7929 + var8.field7929 * var9.field7927;
        class571.field7779 = var8.field7953 * var9.field7934 + var8.field7950 * var9.field7950 + var8.field7929 * var9.field7951;
        class539.field7463 = var8.field7953 * var9.field7955 + var8.field7950 * var9.field7953 + var8.field7929 * var9.field7963;
        class757.field10279 = var8.field7963 * var9.field7955 + var8.field7951 * var9.field7953 + var8.field7927 * var9.field7963;
        class29.field282 = var8.field7963 * var9.field7934 + var8.field7951 * var9.field7950 + var8.field7927 * var9.field7951;
        class777.field10682 = var8.field7963 * var9.field7932 + var8.field7951 * var9.field7929 + var8.field7927 * var9.field7927;
        class702.field9306 = var8.field7955 * var9.field7932 + var8.field7934 * var9.field7929 + var8.field7932 * var9.field7927;
        class742.field10045 = var8.field7955 * var9.field7955 + var8.field7934 * var9.field7953 + var8.field7932 * var9.field7963;
        float var12 = var8.field7956 * var9.field7955 + var8.field7952 * var9.field7953 + var8.field7940 * var9.field7963 + var9.field7956;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field621.field3641;
        int var19 = this.field621.field3626;
        if (!this.field575) {
            this.method318(67);
        }
        int var20 = this.field527 - this.field551 >> 1;
        int var21 = this.field563 - this.field510 >> 1;
        int var22 = this.field519 - this.field587 >> 1;
        int var23 = this.field551 + var20;
        int var24 = this.field510 + var21;
        int var25 = this.field587 + var22;
        int var26 = var23 - (var20 << arg3);
        int var27 = var24 - (var21 << arg3);
        int var28 = var25 - (var22 << arg3);
        int var29 = (var20 << arg3) + var23;
        int var30 = (var21 << arg3) + var24;
        int var31 = (var22 << arg3) + var25;
        class110.field1526[0] = var26;
        class474.field6661[0] = var27;
        class775.field10660[0] = var28;
        class110.field1526[1] = var29;
        class474.field6661[1] = var27;
        class110.field1526[2] = var26;
        class775.field10660[1] = var28;
        if (arg2 != 80) {
            field576 = null;
        }
        class474.field6661[2] = var30;
        class775.field10660[2] = var28;
        class110.field1526[3] = var29;
        class474.field6661[3] = var30;
        class110.field1526[4] = var26;
        class775.field10660[3] = var28;
        class474.field6661[4] = var27;
        class775.field10660[4] = var31;
        class110.field1526[5] = var29;
        class474.field6661[5] = var27;
        class110.field1526[6] = var26;
        class775.field10660[5] = var31;
        class474.field6661[6] = var30;
        class110.field1526[7] = var29;
        class775.field10660[6] = var31;
        class474.field6661[7] = var30;
        class775.field10660[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class775.field10660[var32];
            float var54 = (float) class110.field1526[var32];
            float var55 = (float) class474.field6661[var32];
            float var56 = class742.field10045 * var53 + class757.field10279 * var55 + class539.field7463 * var54 + var12;
            float var57 = class127.field1741 * var53 + class571.field7779 * var54 + class29.field282 * var55 + var10;
            float var58 = class702.field9306 * var53 + class777.field10682 * var55 + class322.field4575 * var54 + var11;
            if (var56 >= (float) this.field621.field3631) {
                if (arg0 > 0) {
                    var56 = arg0;
                }
                float var59 = (float) var18 * var57 / var56 + (float) this.field621.field3639;
                float var60 = (float) var19 * var58 / var56 + (float) this.field621.field3599;
                if (var59 > var15) {
                    var15 = var59;
                }
                if (var14 > var59) {
                    var14 = var59;
                }
                if (var60 > var17) {
                    var17 = var60;
                }
                var13 = true;
                if (var60 < var16) {
                    var16 = var60;
                }
            }
        }
        if (var13 && var14 < (float) arg1 && var15 > (float) arg1 && (float) arg6 > var16 && (float) arg6 < var17) {
            if (arg4) {
                return true;
            }
            if (this.field592 > this.field621.field3666.length) {
                this.field621.field3664 = new int[this.field592];
                this.field621.field3666 = new int[this.field592];
            }
            int[] var33 = this.field621.field3666;
            int[] var34 = this.field621.field3664;
            for (int var35 = 0; var35 < this.field509; var35++) {
                float var37 = (float) this.field513[var35];
                float var38 = (float) this.field522[var35];
                float var39 = (float) this.field565[var35];
                float var40 = class702.field9306 * var37 + class777.field10682 * var38 + class322.field4575 * var39 + var11;
                float var41 = class127.field1741 * var37 + class571.field7779 * var39 + class29.field282 * var38 + var10;
                float var42 = class742.field10045 * var37 + class757.field10279 * var38 + class539.field7463 * var39 + var12;
                if (var42 >= (float) this.field621.field3631) {
                    if (arg0 > 0) {
                        var42 = arg0;
                    }
                    int var43 = (int) ((float) var18 * var41 / var42 + (float) this.field621.field3639);
                    int var44 = (int) ((float) var19 * var40 / var42 + (float) this.field621.field3599);
                    int var45 = this.field508[var35];
                    int var46 = this.field508[var35 + 1];
                    for (int var47 = var45; var47 < var46; var47++) {
                        int var48 = this.field507[var47] - 1;
                        if (var48 == -1) {
                            break;
                        }
                        var33[var48] = var43;
                        var34[var48] = var44;
                    }
                } else {
                    int var49 = this.field508[var35];
                    int var50 = this.field508[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field507[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[this.field507[var51] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field606; var36++) {
                if (var33[this.field585[var36]] != -999999 && var33[this.field526[var36]] != -999999 && var33[this.field571[var36]] != -999999 && this.method326(arg6, var34[this.field571[var36]], var34[this.field526[var36]], var33[this.field585[var36]], var33[this.field571[var36]], arg2 - 283728162, arg1, var33[this.field526[var36]], var34[this.field585[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)V", line = 4952)
    private final void method324(boolean arg0) {
        if (this.field505 != null) {
            class584 var2 = this.field621.field3513;
            this.field621.method1620(-107);
            this.field621.method508(!this.field538);
            this.field621.method1639(false, -8);
            this.field621.method1634(this.field621.field3580, this.field621.field3619, null, null, (byte) 11);
            for (int var3 = 0; var3 < this.field609; var3++) {
                class177 var4 = this.field505[var3];
                class338 var5 = this.field620[var3];
                if (!var4.field2331 || !this.field621.method472()) {
                    float var6 = (float) (this.field565[var4.field2336] + this.field565[var4.field2334] + this.field565[var4.field2330]) * 0.3333333F;
                    float var7 = (float) (this.field522[var4.field2334] + this.field522[var4.field2330] + this.field522[var4.field2336]) * 0.3333333F;
                    float var8 = (float) (this.field513[var4.field2336] + this.field513[var4.field2330] + this.field513[var4.field2334]) * 0.3333333F;
                    float var9 = class127.field1741 * var8 + class571.field7779 * var6 + class29.field282 * var7 + class749.field10091;
                    float var10 = class702.field9306 * var8 + class777.field10682 * var7 + class322.field4575 * var6 + class5.field34;
                    float var11 = class742.field10045 * var8 + class757.field10279 * var7 + class539.field7463 * var6 + class506.field7095;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field2328;
                    var2.method3290(var5.field4746, (byte) -26, var10 * var12 + (float) var5.field4741 - var10, var11 * var12 + -var11, var4.field2333 * var5.field4744 >> 7, (float) var5.field4748 + var9 - (var9 * var12), var4.field2340 * var5.field4742 >> 7);
                    this.field621.method1599(var2, 0);
                    int var13 = var5.field4749;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field621.method1580((byte) -52, var4.field2329);
                    this.field621.method1564(var4.field2335, (byte) 91);
                    this.field621.method1563(45, 7, 0, 4);
                }
            }
            this.field621.method508(true);
            this.field621.method1605((byte) -43);
        }
        if (!arg0) {
            this.field503 = null;
        }
        field573++;
    }

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "(IILs;Ls;III)V", line = 5012)
    public final void method281(int arg0, int arg1, class295 arg2, class295 arg3, int arg4, int arg5, int arg6) {
        if (!this.field575) {
            this.method318(113);
        }
        field535++;
        int var8 = arg4 + this.field551;
        int var9 = this.field527 + arg4;
        int var10 = this.field587 + arg6;
        int var11 = this.field519 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field4174 <= arg2.field4177 + var9 >> arg2.field4179 || var10 < 0 || arg2.field4177 + var11 >> arg2.field4179 >= arg2.field4173) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4174 <= (arg3.field4177 + var9 >> arg3.field4179) || var10 < 0 || arg3.field4173 <= arg3.field4177 + var11 >> arg3.field4179) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4179;
            int var13 = arg2.field4177 + var9 - 1 >> arg2.field4179;
            int var14 = var10 >> arg2.field4179;
            int var15 = arg2.field4177 + var11 - 1 >> arg2.field4179;
            if (arg5 == arg2.method1898(var14, var12, (byte) -14) && arg2.method1898(var14, var13, (byte) -53) == arg5 && arg2.method1898(var15, var12, (byte) -62) == arg5 && arg5 == arg2.method1898(var15, var13, (byte) -15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field509; var16++) {
                this.field522[var16] = this.field522[var16] + arg2.method1895(this.field565[var16] + arg4, this.field513[var16] + arg6, 107) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field510;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field509; var31++) {
                int var32 = (this.field522[var31] << 16) / var30;
                if (var32 < arg1) {
                    this.field522[var31] -= -((arg1 - var32) * (arg2.method1895(this.field565[var31] + arg4, this.field513[var31] - -arg6, 21) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var17 = (arg1 & 0xFF) * 4;
            int var18 = ((arg1 & 0xFFCC) >> 8) * 4;
            int var19 = (arg1 >> 16 & 0xFF) << 6;
            int var20 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var17 >> 1)) < 0 || arg2.field4174 << arg2.field4179 <= (var17 >> 1) + arg4 + arg2.field4177 || arg6 - (var18 >> 1) < 0 || (arg6 - (-(var18 >> 1) - arg2.field4177)) >= (arg2.field4173 << arg2.field4179)) {
                return;
            }
            this.method2922(arg4, var18, arg6, arg2, var19, arg5, 10, var20, var17);
        } else if (arg0 == 4) {
            int var28 = this.field563 - this.field510;
            for (int var29 = 0; var29 < this.field509; var29++) {
                this.field522[var29] = this.field522[var29] + var28 - (arg5 + -arg3.method1895(this.field565[var29] + arg4, this.field513[var29] + arg6, 92));
            }
        } else if (arg0 == 5) {
            int var21 = this.field563 - this.field510;
            for (int var22 = 0; var22 < this.field509; var22++) {
                int var23 = this.field565[var22] + arg4;
                int var24 = this.field513[var22] + arg6;
                int var25 = arg2.method1895(var23, var24, 99);
                int var26 = arg3.method1895(var23, var24, 66);
                int var27 = var25 - var26 - arg1;
                this.field522[var22] = ((this.field522[var22] << 8) / var21 * var27 >> 8) + var25 - arg5;
            }
        }
        this.field575 = false;
        if (this.field601 != null) {
            this.field601.field1837 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(BIZ)Lka;", line = 5165)
    public final class497 method271(byte arg0, int arg1, boolean arg2) {
        field574++;
        class50 var4;
        class50 var5;
        if (arg0 == 1) {
            var4 = this.field621.field3618;
            var5 = this.field621.field3582;
        } else if (arg0 == 2) {
            var4 = this.field621.field3658;
            var5 = this.field621.field3602;
        } else if (arg0 == 3) {
            var4 = this.field621.field3587;
            var5 = this.field621.field3661;
        } else if (arg0 == 4) {
            var4 = this.field621.field3634;
            var5 = this.field621.field3594;
        } else if (arg0 == 5) {
            var4 = this.field621.field3556;
            var5 = this.field621.field3612;
        } else {
            var5 = var4 = new class50(this.field621);
        }
        return this.method316(var5, var4, arg2, arg0 != 0, (byte) 54, arg1);
    }

    @OriginalMember(owner = "client!sca", name = "ua", descriptor = "()I", line = 5213)
    public final int method260() {
        field617++;
        return this.field531;
    }

    @OriginalMember(owner = "client!sca", name = "V", descriptor = "()I", line = 5222)
    public final int method252() {
        field608++;
        if (!this.field575) {
            this.method318(80);
        }
        return this.field551;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "()Z", line = 5237)
    public final boolean method255() {
        field517++;
        if (this.field583 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field583.length; var1++) {
            if (this.field583[var1] != -1 && !this.field621.field913.method1112(29302, this.field583[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sca", name = "EA", descriptor = "()I", line = 5267)
    public final int method291() {
        if (!this.field575) {
            this.method318(121);
        }
        field607++;
        return this.field563;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lkea;B)V", line = 5280)
    private final void method325(class251 arg0, byte arg1) {
        if (arg1 >= -40) {
            return;
        }
        if (this.field621.field3666.length < this.field592) {
            this.field621.field3666 = new int[this.field592];
            this.field621.field3664 = new int[this.field592];
        }
        field611++;
        int[] var3 = this.field621.field3666;
        int[] var4 = this.field621.field3664;
        for (int var5 = 0; var5 < this.field509; var5++) {
            int var16 = (this.field565[var5] - (this.field522[var5] * this.field621.field3557 >> 8) >> this.field621.field3517) - arg0.field3680;
            int var17 = (this.field513[var5] - (this.field522[var5] * this.field621.field3563 >> 8) >> this.field621.field3517) - arg0.field3673;
            int var18 = this.field508[var5];
            int var19 = this.field508[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field507[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field558; var6++) {
            if (this.field613 == null || this.field613[var6] <= 128) {
                short var7 = this.field585[var6];
                short var8 = this.field526[var6];
                short var9 = this.field571[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var14 - var13) * (var12 - var11)) > 0) {
                    arg0.method1647(var13, var11, (byte) 106, var15, var14, var10, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIIIIIII)Z", line = 5370)
    private final boolean method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field515++;
        if (arg8 > arg0 && arg2 > arg0 && arg0 < arg1) {
            return false;
        } else if (arg8 < arg0 && arg2 < arg0 && arg1 < arg0) {
            return false;
        } else if (arg6 < arg3 && arg6 < arg7 && arg4 > arg6) {
            return false;
        } else if (arg5 == -283728082) {
            return arg6 <= arg3 || arg7 >= arg6 || arg6 <= arg4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lal;Lju;I)V", line = 5404)
    public final void method254(class109 arg0, class136 arg1, int arg2) {
        field568++;
        if (this.field592 == 0) {
            return;
        }
        class584 var4 = this.field621.field3545;
        class584 var5 = (class584) arg0;
        if (!this.field575) {
            this.method318(98);
        }
        class757.field10279 = var4.field7955 * var5.field7963 + var4.field7963 * var5.field7927 + var4.field7953 * var5.field7951;
        class506.field7095 = var4.field7955 * var5.field7956 + var4.field7963 * var5.field7940 + var4.field7953 * var5.field7952 + var4.field7956;
        float var6 = (float) this.field510 * class757.field10279 + class506.field7095;
        float var7 = (float) this.field563 * class757.field10279 + class506.field7095;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var8 = (float) this.field518 + var6;
            var9 = var7 - (float) this.field518;
        } else {
            var8 = (float) this.field518 + var7;
            var9 = (float) (-this.field518) + var6;
        }
        if ((this.field621.field3605 <= var9) || (var8 <= (float) this.field621.field3631)) {
            return;
        }
        class749.field10091 = var4.field7934 * var5.field7956 + var4.field7951 * var5.field7940 + var4.field7950 * var5.field7952 + var4.field7952;
        class29.field282 = var4.field7934 * var5.field7963 + var4.field7951 * var5.field7927 + var4.field7950 * var5.field7951;
        float var10 = (float) this.field510 * class29.field282 + class749.field10091;
        float var11 = (float) this.field563 * class29.field282 + class749.field10091;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var12 = ((float) (-this.field518) + var11) * (float) this.field621.field3641;
            var13 = ((float) this.field518 + var10) * (float) this.field621.field3641;
        } else {
            var12 = (var10 - (float) this.field518) * (float) this.field621.field3641;
            var13 = ((float) this.field518 + var11) * (float) this.field621.field3641;
        }
        if ((var12 / var8 >= this.field621.field3627) || (var13 / var8 <= this.field621.field3611)) {
            return;
        }
        class777.field10682 = var4.field7932 * var5.field7963 + var4.field7929 * var5.field7951 + var4.field7927 * var5.field7927;
        class5.field34 = var4.field7932 * var5.field7956 + var4.field7929 * var5.field7952 + var4.field7927 * var5.field7940 + var4.field7940;
        float var14 = (float) this.field510 * class777.field10682 + class5.field34;
        float var15 = (float) this.field563 * class777.field10682 + class5.field34;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var16 = ((float) this.field518 + var14) * (float) this.field621.field3626;
            var17 = ((float) (-this.field518) + var15) * (float) this.field621.field3626;
        } else {
            var16 = ((float) this.field518 + var15) * (float) this.field621.field3626;
            var17 = (var14 - (float) this.field518) * (float) this.field621.field3626;
        }
        if ((this.field621.field3613 <= var17 / var8) || (this.field621.field3590 >= var16 / var8)) {
            return;
        }
        if (arg1 != null || this.field505 != null) {
            class702.field9306 = var4.field7932 * var5.field7955 + var4.field7929 * var5.field7934 + var4.field7927 * var5.field7932;
            class571.field7779 = var4.field7934 * var5.field7953 + var4.field7951 * var5.field7929 + var4.field7950 * var5.field7950;
            class127.field1741 = var4.field7934 * var5.field7955 + var4.field7951 * var5.field7932 + var4.field7950 * var5.field7934;
            class539.field7463 = var4.field7955 * var5.field7953 + var4.field7963 * var5.field7929 + var4.field7953 * var5.field7950;
            class322.field4575 = var4.field7932 * var5.field7953 + var4.field7929 * var5.field7950 + var4.field7927 * var5.field7929;
            class742.field10045 = var4.field7955 * var5.field7955 + var4.field7963 * var5.field7932 + var4.field7953 * var5.field7934;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field551 + this.field527 >> 1;
            int var21 = this.field587 + this.field519 >> 1;
            int var22 = (int) ((float) var21 * class127.field1741 + (float) this.field510 * class29.field282 + (float) var20 * class571.field7779 + class749.field10091);
            int var23 = (int) ((float) var21 * class702.field9306 + (float) this.field510 * class777.field10682 + (float) var20 * class322.field4575 + class5.field34);
            int var24 = (int) ((float) var21 * class742.field10045 + (float) this.field510 * class757.field10279 + (float) var20 * class539.field7463 + class506.field7095);
            if (var24 >= this.field621.field3631) {
                arg1.field1842 = this.field621.field3641 * var22 / var24 + this.field621.field3639;
                arg1.field1841 = this.field621.field3599 + (this.field621.field3626 * var23 / var24);
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class127.field1741 + (float) this.field563 * class29.field282 + (float) var20 * class571.field7779 + class749.field10091);
            int var26 = (int) ((float) var21 * class702.field9306 + (float) this.field563 * class777.field10682 + (float) var20 * class322.field4575 + class5.field34);
            int var27 = (int) ((float) var21 * class742.field10045 + (float) this.field563 * class757.field10279 + (float) var20 * class539.field7463 + class506.field7095);
            if (var27 >= this.field621.field3631) {
                arg1.field1843 = this.field621.field3639 + (this.field621.field3641 * var25 / var27);
                arg1.field1844 = this.field621.field3626 * var26 / var27 + this.field621.field3599;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field621.field3631 > var24 && var27 < this.field621.field3631) {
                    var19 = false;
                } else if (var24 < this.field621.field3631) {
                    int var28 = (var27 - this.field621.field3631 << 16) / (var27 - var24);
                    int var29 = var25 + ((var25 - var22) * var28 >> 16);
                    arg1.field1842 = this.field621.field3641 * var29 / this.field621.field3631 + this.field621.field3639;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field1841 = this.field621.field3626 * var30 / this.field621.field3631 + this.field621.field3599;
                } else if (var27 < this.field621.field3631) {
                    int var31 = (var24 - this.field621.field3631 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field1842 = this.field621.field3641 * var32 / this.field621.field3631 + this.field621.field3639;
                    arg1.field1841 = this.field621.field3626 * var33 / this.field621.field3631 + this.field621.field3599;
                }
            }
            if (var19) {
                arg1.field1840 = true;
                if (var27 < var24) {
                    arg1.field1845 = (var22 + this.field518) * this.field621.field3641 / var24 + this.field621.field3639 - arg1.field1842;
                } else {
                    arg1.field1845 = this.field621.field3639 + ((var25 + this.field518) * this.field621.field3641 / var27) - arg1.field1843;
                }
            }
        }
        this.field621.method1604(false);
        this.field621.method1623(0, var5);
        this.method315(255);
        this.field621.method1605((byte) -51);
        this.method324(true);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V", line = 5611)
    public final void method256(int arg0) {
        field547++;
        int var2 = class110.field1524[arg0];
        int var3 = class110.field1523[arg0];
        for (int var4 = 0; var4 < this.field509; var4++) {
            int var5 = this.field565[var4] * var3 + this.field513[var4] * var2 >> 14;
            this.field513[var4] = this.field513[var4] * var3 - (this.field565[var4] * var2) >> 14;
            this.field565[var4] = var5;
        }
        this.field575 = false;
        if (this.field601 != null) {
            this.field601.field1837 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "O", descriptor = "(III)V", line = 5640)
    public final void method294(int arg0, int arg1, int arg2) {
        field521++;
        for (int var4 = 0; var4 < this.field509; var4++) {
            if (arg0 != 128) {
                this.field565[var4] = this.field565[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field522[var4] = this.field522[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field513[var4] = this.field513[var4] * arg2 >> 7;
            }
        }
        if (this.field601 != null) {
            this.field601.field1837 = null;
        }
        this.field575 = false;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lal;IZ)V", line = 5671)
    public final void method261(class109 arg0, int arg1, boolean arg2) {
        field524++;
        if (this.field567 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field509; var5++) {
            if ((arg1 & this.field567[var5]) != 0) {
                if (arg2) {
                    arg0.method815(this.field565[var5], this.field522[var5], this.field513[var5], var4);
                } else {
                    arg0.method820(this.field565[var5], this.field522[var5], this.field513[var5], var4);
                }
                this.field565[var5] = var4[0];
                this.field522[var5] = var4[1];
                this.field513[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!sca", name = "C", descriptor = "(I)V", line = 5710)
    public final void method284(int arg0) {
        field602++;
        this.field520 = (short) arg0;
        if (this.field578 != null) {
            this.field578.field1837 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "HA", descriptor = "()I", line = 5731)
    public final int method246() {
        field532++;
        if (!this.field575) {
            this.method318(89);
        }
        return this.field587;
    }

    @OriginalMember(owner = "client!sca", name = "da", descriptor = "()I", line = 5749)
    public final int method288() {
        field590++;
        return this.field561;
    }

    @OriginalMember(owner = "client!sca", name = "fa", descriptor = "()I", line = 5757)
    public final int method265() {
        field543++;
        if (!this.field575) {
            this.method318(72);
        }
        return this.field510;
    }

    @OriginalMember(owner = "client!sca", name = "ia", descriptor = "(SS)V", line = 5770)
    public final void method295(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field606; var3++) {
            if (this.field502[var3] == arg0) {
                this.field502[var3] = arg1;
            }
        }
        field550++;
        if (this.field505 != null) {
            for (int var4 = 0; var4 < this.field609; var4++) {
                class177 var5 = this.field505[var4];
                class338 var6 = this.field620[var4];
                var6.field4749 = class217.field2836[this.field502[var5.field2327] & 0xFFFF] & 0xFFFFFF | var6.field4749 & 0xFF000000;
            }
        }
        if (this.field578 != null) {
            this.field578.field1837 = null;
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZ)V", line = 5829)
    private final void method327(int arg0, boolean arg1) {
        if (this.field621.field3623.field3789.length >= (this.field558 * 6)) {
            this.field621.field3623.field3725 = 0;
        } else {
            this.field621.field3623 = new class453(this.field558 * 6 + 600);
        }
        field555++;
        class453 var3 = this.field621.field3623;
        if (this.field621.field3561) {
            for (int var5 = 0; var5 < this.field558; var5++) {
                var3.method1733(this.field585[var5], -32466);
                var3.method1733(this.field526[var5], -32466);
                var3.method1733(this.field571[var5], -32466);
            }
        } else {
            for (int var4 = 0; var4 < this.field558; var4++) {
                var3.method1719(arg0 ^ 0x7C, this.field585[var4]);
                var3.method1719(arg0 ^ 0x7E, this.field526[var4]);
                var3.method1719(arg0 ^ 0x7F, this.field571[var4]);
            }
        }
        if (var3.field3725 == arg0) {
            return;
        }
        if (arg1) {
            if (this.field514 == null) {
                this.field514 = this.field621.method1615(var3.field3789, 5123, true, 0, var3.field3725);
            } else {
                this.field514.method1762(var3.field3725, var3.field3789, (byte) 107, 5123);
            }
            this.field586.field6009 = this.field514;
        } else {
            this.field586.field6009 = this.field621.method1615(var3.field3789, 5123, false, arg0, var3.field3725);
        }
        if (!arg1) {
            this.field554 = true;
        }
    }

    @OriginalMember(owner = "client!sca", name = "ma", descriptor = "()I", line = 6785)
    public final int method264() {
        field546++;
        if (!this.field575) {
            this.method318(91);
        }
        return this.field622;
    }
}
