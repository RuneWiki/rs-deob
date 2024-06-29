import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class407 extends class499 {

    @OriginalMember(owner = "client!bp", name = "Nb", descriptor = "I")
    private int field6415 = 0;

    @OriginalMember(owner = "client!bp", name = "Ab", descriptor = "Z")
    private boolean field6414 = false;

    @OriginalMember(owner = "client!bp", name = "ac", descriptor = "I")
    private int field6473 = 0;

    @OriginalMember(owner = "client!bp", name = "nb", descriptor = "I")
    private int field6480 = 0;

    @OriginalMember(owner = "client!bp", name = "cc", descriptor = "Z")
    private boolean field6409 = true;

    @OriginalMember(owner = "client!bp", name = "jc", descriptor = "I")
    private int field6477 = 0;

    @OriginalMember(owner = "client!bp", name = "Ec", descriptor = "I")
    private int field6450 = 0;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "Z")
    private boolean field6428 = false;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "Z")
    private boolean field6462 = false;

    @OriginalMember(owner = "client!bp", name = "hb", descriptor = "Lvf;")
    private class159 field6529;

    @OriginalMember(owner = "client!bp", name = "uc", descriptor = "Lkn;")
    private class774 field6531;

    @OriginalMember(owner = "client!bp", name = "Xb", descriptor = "Lkn;")
    private class774 field6436;

    @OriginalMember(owner = "client!bp", name = "Cc", descriptor = "Lkn;")
    private class774 field6483;

    @OriginalMember(owner = "client!bp", name = "Pb", descriptor = "Lkn;")
    private class774 field6435;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "Ljka;")
    private class691 field6490;

    @OriginalMember(owner = "client!bp", name = "zc", descriptor = "I")
    private int field6461;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    private int field6510;

    @OriginalMember(owner = "client!bp", name = "V", descriptor = "[I")
    private int[] field6468;

    @OriginalMember(owner = "client!bp", name = "Ib", descriptor = "[I")
    private int[] field6517;

    @OriginalMember(owner = "client!bp", name = "Rb", descriptor = "[I")
    private int[] field6475;

    @OriginalMember(owner = "client!bp", name = "tb", descriptor = "[I")
    private int[] field6419;

    @OriginalMember(owner = "client!bp", name = "pc", descriptor = "[S")
    private short[] field6499;

    @OriginalMember(owner = "client!bp", name = "xc", descriptor = "[Lui;")
    private class239[] field6511;

    @OriginalMember(owner = "client!bp", name = "db", descriptor = "[Lok;")
    private class265[] field6448;

    @OriginalMember(owner = "client!bp", name = "wc", descriptor = "I")
    private int field6514;

    @OriginalMember(owner = "client!bp", name = "ib", descriptor = "[Lufa;")
    private class711[] field6456;

    @OriginalMember(owner = "client!bp", name = "vb", descriptor = "[Lwfa;")
    private class208[] field6440;

    @OriginalMember(owner = "client!bp", name = "Vb", descriptor = "S")
    private short field6444;

    @OriginalMember(owner = "client!bp", name = "eb", descriptor = "[S")
    private short[] field6530;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "[S")
    private short[] field6488;

    @OriginalMember(owner = "client!bp", name = "Ac", descriptor = "[S")
    private short[] field6425;

    @OriginalMember(owner = "client!bp", name = "ic", descriptor = "[B")
    private byte[] field6417;

    @OriginalMember(owner = "client!bp", name = "Eb", descriptor = "[B")
    private byte[] field6446;

    @OriginalMember(owner = "client!bp", name = "ec", descriptor = "[S")
    private short[] field6493;

    @OriginalMember(owner = "client!bp", name = "Sb", descriptor = "S")
    private short field6412;

    @OriginalMember(owner = "client!bp", name = "Jb", descriptor = "[S")
    private short[] field6482;

    @OriginalMember(owner = "client!bp", name = "tc", descriptor = "[F")
    private float[] field6474;

    @OriginalMember(owner = "client!bp", name = "Gb", descriptor = "[S")
    private short[] field6458;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "[F")
    private float[] field6424;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "[S")
    private short[] field6460;

    @OriginalMember(owner = "client!bp", name = "qb", descriptor = "[S")
    private short[] field6501;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "[S")
    private short[] field6523;

    @OriginalMember(owner = "client!bp", name = "S", descriptor = "[S")
    private short[] field6500;

    @OriginalMember(owner = "client!bp", name = "Dc", descriptor = "[I")
    private int[] field6437;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "[[I")
    private int[][] field6487;

    @OriginalMember(owner = "client!bp", name = "cb", descriptor = "[[I")
    private int[][] field6452;

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "[[I")
    private int[][] field6420;

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field6532 = new String[] { method3280(method3279("dO\u001f)\u0007.")), method3280(method3279("dO\u001f\"n")), method3280(method3279("}\u0011\u001f@;")), method3280(method3279("hJ]\u0002")), method3280(method3279("dO\u001f\u001dn")), method3280(method3279("dO\u001f,\u0007.")), method3280(method3279("dO\u001f=n")), method3280(method3279("dO\u001f:n")), method3280(method3279("dO\u001f-\u0007.")), method3280(method3279("dO\u001f<n")), method3280(method3279("dO\u001f&\u0007.")), method3280(method3279("dO\u001f\u0007'.")), method3280(method3279("dO\u001f\u001b'.")), method3280(method3279("dO\u001f \u0007.")), method3280(method3279("dO\u001f?n")), method3280(method3279("dO\u001f*\u0004.")), method3280(method3279("dO\u001f+n")), method3280(method3279("dO\u001f9n")), method3280(method3279("dO\u001f\b'.")), method3280(method3279("dO\u001f-n")), method3280(method3279("dO\u001f\u0005n")), method3280(method3279("dO\u001f$\u0007.")), method3280(method3279("dO\u001f/n")), method3280(method3279("dO\u001f!n")), method3280(method3279("dO\u001f\u000fn")), method3280(method3279("dO\u001f\u001en")), method3280(method3279("dO\u001f\u0000'.")), method3280(method3279("dO\u001f9\u0007.")), method3280(method3279("dO\u001f#\u0007.")), method3280(method3279("dO\u001fR/hVEPn")), method3280(method3279("dO\u001f\"\u0007.")), method3280(method3279("dO\u001f8n")), method3280(method3279("dO\u001f>n")), method3280(method3279("dO\u001f\u0019'.")), method3280(method3279("dO\u001f,n")), method3280(method3279("dO\u001f(n")), method3280(method3279("dO\u001f,\u0004.")), method3280(method3279("dO\u001f-\u0004.")), method3280(method3279("dO\u001f*\u0007.")), method3280(method3279("dO\u001f;n")), method3280(method3279("dO\u001f\u001cn")), method3280(method3279("dO\u001f\n'.")), method3280(method3279("dO\u001f'\u0007.")), method3280(method3279("dO\u001f(\u0007.")), method3280(method3279("dO\u001f&n")), method3280(method3279("dO\u001f)n")), method3280(method3279("dO\u001f!\u0007.")), method3280(method3279("dO\u001f\u000f'.")), method3280(method3279("dO\u001f\u0014'.")), method3280(method3279("dO\u001f8\u0007.")), method3280(method3279("dO\u001f;\u0007.")), method3280(method3279("dO\u001f*n")), method3280(method3279("dO\u001f\u0018n")), method3280(method3279("dO\u001f/\u0007.")), method3280(method3279("dO\u001f n")), method3280(method3279("dO\u001f#n")), method3280(method3279("dO\u001f\f'.")), method3280(method3279("dO\u001f$n")), method3280(method3279("dO\u001f+\u0007.")), method3280(method3279("dO\u001f?\u0007.")), method3280(method3279("dO\u001f=\u0007.")), method3280(method3279("dO\u001f'n")), method3280(method3279("dO\u001f%n")), method3280(method3279("dO\u001f\u0003'.")), method3280(method3279("dO\u001f<\u0007.")), method3280(method3279("dO\u001f+\u0004.")) };

    @OriginalMember(owner = "client!bp", name = "ob", descriptor = "[I")
    public static int[] field6441 = new int[13];

    @OriginalMember(owner = "client!bp", name = "yb", descriptor = "I")
    public static int field6451 = 0;

    @OriginalMember(owner = "client!bp", name = "ub", descriptor = "B")
    private byte field6518;

    @OriginalMember(owner = "client!bp", name = "hc", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!bp", name = "Wb", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!bp", name = "Fc", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!bp", name = "J", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!bp", name = "lb", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!bp", name = "oc", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!bp", name = "kb", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!bp", name = "wb", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!bp", name = "Db", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!bp", name = "qc", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!bp", name = "X", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!bp", name = "Hb", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!bp", name = "gb", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!bp", name = "yc", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!bp", name = "Z", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!bp", name = "rb", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!bp", name = "gc", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!bp", name = "U", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!bp", name = "W", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!bp", name = "sb", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!bp", name = "R", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!bp", name = "Kb", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!bp", name = "T", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!bp", name = "bc", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!bp", name = "Lb", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!bp", name = "Qb", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!bp", name = "nc", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!bp", name = "Zb", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!bp", name = "Bb", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!bp", name = "Bc", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!bp", name = "dc", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!bp", name = "bb", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!bp", name = "pb", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!bp", name = "Yb", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!bp", name = "fb", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!bp", name = "ab", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!bp", name = "vc", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!bp", name = "lc", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!bp", name = "fc", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!bp", name = "L", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!bp", name = "Cb", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!bp", name = "xb", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!bp", name = "rc", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!bp", name = "mb", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!bp", name = "mc", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!bp", name = "Q", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!bp", name = "sc", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!bp", name = "Ob", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!bp", name = "kc", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!bp", name = "jb", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!bp", name = "Tb", descriptor = "Lg;")
    private class163 field6520;

    @OriginalMember(owner = "client!bp", name = "Fb", descriptor = "Lbv;")
    private class322 field6506;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "Lika;")
    private class450 field6470;

    @OriginalMember(owner = "client!bp", name = "O", descriptor = "S")
    private short field6410;

    @OriginalMember(owner = "client!bp", name = "Mb", descriptor = "S")
    private short field6423;

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "S")
    private short field6430;

    @OriginalMember(owner = "client!bp", name = "zb", descriptor = "S")
    private short field6454;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "S")
    private short field6484;

    @OriginalMember(owner = "client!bp", name = "Y", descriptor = "S")
    private short field6495;

    @OriginalMember(owner = "client!bp", name = "Ub", descriptor = "S")
    private short field6512;

    @OriginalMember(owner = "client!bp", name = "M", descriptor = "S")
    private short field6524;

    @OriginalMember(owner = "client!bp", name = "VA", descriptor = "(I)V", line = 3)
    public final void method404(int arg0) {
        try {
            field6467++;
            int var2 = class763.field11199[arg0];
            int var3 = class763.field11200[arg0];
            for (int var4 = 0; var4 < this.field6480; var4++) {
                int var5 = this.field6475[var4] * var2 + (this.field6419[var4] * var3) >> 14;
                this.field6475[var4] = this.field6475[var4] * var3 - (this.field6419[var4] * var2) >> 14;
                this.field6419[var4] = var5;
            }
            if (this.field6531 != null) {
                this.field6531.field11320 = null;
            }
            this.field6428 = false;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6532[49] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "V", descriptor = "()I", line = 32)
    public final int method417() {
        try {
            field6481++;
            if (!this.field6428) {
                this.method3269((byte) 86);
            }
            return this.field6495;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[31] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BZ)V", line = 49)
    private final void method3263(byte arg0, boolean arg1) {
        try {
            field6464++;
            boolean var3 = this.field6435 != null && this.field6435.field11320 == null;
            boolean var4 = this.field6483 != null && this.field6483.field11320 == null;
            boolean var5 = this.field6531 != null && this.field6531.field11320 == null;
            boolean var6 = this.field6436 != null && this.field6436.field11320 == null;
            if (arg1) {
                var4 &= (this.field6518 & 0x4) != 0;
                var6 &= (this.field6518 & 0x8) != 0;
                var3 &= (this.field6518 & 0x2) != 0;
                var5 &= (this.field6518 & 0x1) != 0;
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
                if (this.field6529.field2453.field2805.length < (this.field6473 * var7)) {
                    this.field6529.field2453 = new class647((this.field6473 + 100) * var7);
                } else {
                    this.field6529.field2453.field2799 = 0;
                }
                class647 var12 = this.field6529.field2453;
                if (var5) {
                    if (this.field6529.field2500) {
                        for (int var21 = 0; var21 < this.field6480; var21++) {
                            int var22 = Stream.floatToRawIntBits((float) this.field6419[var21]);
                            int var23 = Stream.floatToRawIntBits((float) this.field6475[var21]);
                            int var24 = Stream.floatToRawIntBits((float) this.field6517[var21]);
                            int var25 = this.field6468[var21];
                            int var26 = this.field6468[var21 + 1];
                            for (int var27 = var25; var27 < var26; var27++) {
                                int var28 = this.field6530[var27] - 1;
                                if (var28 == -1) {
                                    break;
                                }
                                var12.field2799 = var7 * var28;
                                var12.method1641((byte) -108, var22);
                                var12.method1641((byte) -108, var23);
                                var12.method1641((byte) -108, var24);
                            }
                        }
                    } else {
                        for (int var13 = 0; var13 < this.field6480; var13++) {
                            int var14 = Stream.floatToRawIntBits((float) this.field6419[var13]);
                            int var15 = Stream.floatToRawIntBits((float) this.field6475[var13]);
                            int var16 = Stream.floatToRawIntBits((float) this.field6517[var13]);
                            int var17 = this.field6468[var13];
                            int var18 = this.field6468[var13 + 1];
                            for (int var19 = var17; var19 < var18; var19++) {
                                int var20 = this.field6530[var19] - 1;
                                if (var20 == -1) {
                                    break;
                                }
                                var12.field2799 = var7 * var20;
                                var12.method1664(var14, (byte) -85);
                                var12.method1664(var15, (byte) -85);
                                var12.method1664(var16, (byte) -85);
                            }
                        }
                    }
                }
                if (var3) {
                    if (this.field6483 == null) {
                        short[] var31;
                        short[] var32;
                        byte[] var33;
                        short[] var34;
                        if (this.field6520 == null) {
                            var31 = this.field6500;
                            var32 = this.field6488;
                            var33 = this.field6417;
                            var34 = this.field6523;
                        } else {
                            var32 = this.field6520.field2635;
                            var34 = this.field6520.field2634;
                            var31 = this.field6520.field2641;
                            var33 = this.field6520.field2637;
                        }
                        float var35 = this.field6529.field2431[0];
                        float var36 = this.field6529.field2431[1];
                        float var37 = this.field6529.field2431[2];
                        float var38 = this.field6529.field2461;
                        float var39 = this.field6529.field2449 * 768.0F / (float) this.field6444;
                        float var40 = this.field6529.field2485 * 768.0F / (float) this.field6444;
                        for (int var41 = 0; var41 < this.field6450; var41++) {
                            int var42 = this.method3276(this.field6446[var41], this.field6501[var41], this.field6412, this.field6458[var41], 255);
                            float var43 = (float) ((var42 & 0xFF68AD) >> 16) * this.field6529.field2476;
                            float var44 = (float) (var42 >> 8 & 0xFF) * this.field6529.field2448;
                            short var45 = this.field6460[var41];
                            float var46 = (float) (var42 >>> 24) * this.field6529.field2480;
                            short var47 = (short) var33[var45];
                            float var48;
                            if (var47 == 0) {
                                var48 = ((float) var32[var45] * var37 + (float) var31[var45] * var35 + (float) var34[var45] * var36) * 0.0026041667F;
                            } else {
                                var48 = ((float) var32[var45] * var37 + (float) var31[var45] * var35 + (float) var34[var45] * var36) / (float) (var47 * 256);
                            }
                            float var49 = var38 + var48 * ((var48 < 0.0F) ? var40 : var39);
                            int var50 = (int) (var46 * var49);
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
                            int var52 = (int) (var44 * var49);
                            if (var52 < 0) {
                                var52 = 0;
                            } else if (var52 > 255) {
                                var52 = 255;
                            }
                            var12.field2799 = var9 + (var7 * var45);
                            var12.method1678(var50, 65280);
                            var12.method1678(var51, 65280);
                            var12.method1678(var52, 65280);
                            var12.method1678(255 - (this.field6446[var41] & 0xFF), 65280);
                            short var53 = this.field6482[var41];
                            short var54 = (short) var33[var53];
                            float var55;
                            if (var54 == 0) {
                                var55 = ((float) var32[var53] * var37 + (float) var31[var53] * var35 + (float) var34[var53] * var36) * 0.0026041667F;
                            } else {
                                var55 = ((float) var32[var53] * var37 + (float) var31[var53] * var35 + (float) var34[var53] * var36) / (float) (var54 * 256);
                            }
                            float var56 = (var55 < 0.0F ? var40 : var39) * var55 + var38;
                            int var57 = (int) (var46 * var56);
                            int var58 = (int) (var43 * var56);
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
                            int var59 = (int) (var44 * var56);
                            if (var59 < 0) {
                                var59 = 0;
                            } else if (var59 > 255) {
                                var59 = 255;
                            }
                            var12.field2799 = var7 * var53 + var9;
                            var12.method1678(var57, 65280);
                            var12.method1678(var58, 65280);
                            var12.method1678(var59, arg0 ^ 0xFFFF0097);
                            var12.method1678(255 - (this.field6446[var41] & 0xFF), 65280);
                            short var60 = this.field6493[var41];
                            short var61 = (short) var33[var60];
                            float var62;
                            if (var61 == 0) {
                                var62 = ((float) var32[var60] * var37 + (float) var31[var60] * var35 + (float) var34[var60] * var36) * 0.0026041667F;
                            } else {
                                var62 = ((float) var32[var60] * var37 + (float) var31[var60] * var35 + (float) var34[var60] * var36) / (float) (var61 * 256);
                            }
                            float var63 = var38 + (var62 < 0.0F ? var40 : var39) * var62;
                            int var64 = (int) (var46 * var63);
                            if (var64 < 0) {
                                var64 = 0;
                            } else if (var64 > 255) {
                                var64 = 255;
                            }
                            int var65 = (int) (var43 * var63);
                            int var66 = (int) (var44 * var63);
                            if (var65 < 0) {
                                var65 = 0;
                            } else if (var65 > 255) {
                                var65 = 255;
                            }
                            var12.field2799 = var9 + (var7 * var60);
                            if (var66 < 0) {
                                var66 = 0;
                            } else if (var66 > 255) {
                                var66 = 255;
                            }
                            var12.method1678(var64, 65280);
                            var12.method1678(var65, 65280);
                            var12.method1678(var66, arg0 + 65385);
                            var12.method1678(255 - (this.field6446[var41] & 0xFF), arg0 ^ 0xFFFF0097);
                        }
                    } else {
                        for (int var29 = 0; var29 < this.field6450; var29++) {
                            int var30 = this.method3276(this.field6446[var29], this.field6501[var29], this.field6412, this.field6458[var29], arg0 ^ 0xFFFFFF68);
                            var12.field2799 = this.field6460[var29] * var7 + var9;
                            var12.method1641((byte) -108, var30);
                            var12.field2799 = this.field6482[var29] * var7 + var9;
                            var12.method1641((byte) -108, var30);
                            var12.field2799 = var9 + (this.field6493[var29] * var7);
                            var12.method1641((byte) -108, var30);
                        }
                    }
                }
                if (var4) {
                    short[] var67;
                    short[] var68;
                    byte[] var69;
                    short[] var70;
                    if (this.field6520 == null) {
                        var68 = this.field6488;
                        var67 = this.field6500;
                        var70 = this.field6523;
                        var69 = this.field6417;
                    } else {
                        var67 = this.field6520.field2641;
                        var68 = this.field6520.field2635;
                        var69 = this.field6520.field2637;
                        var70 = this.field6520.field2634;
                    }
                    float var71 = 3.0F / (float) this.field6444;
                    float var72 = 3.0F / (float) (this.field6444 / 2 + this.field6444);
                    var12.field2799 = var10;
                    if (this.field6529.field2500) {
                        for (int var73 = 0; var73 < this.field6473; var73++) {
                            int var74 = var69[var73] & 0xFF;
                            if (var74 == 0) {
                                var12.method4708((float) var67[var73] * var72, true);
                                var12.method4708((float) var70[var73] * var72, true);
                                var12.method4708((float) var68[var73] * var72, true);
                            } else {
                                float var75 = var71 / (float) var74;
                                var12.method4708((float) var67[var73] * var75, true);
                                var12.method4708((float) var70[var73] * var75, true);
                                var12.method4708((float) var68[var73] * var75, true);
                            }
                            var12.field2799 += var7 - 12;
                        }
                    } else {
                        for (int var76 = 0; var76 < this.field6473; var76++) {
                            int var77 = var69[var76] & 0xFF;
                            if (var77 == 0) {
                                var12.method4710(-1597413832, (float) var67[var76] * var72);
                                var12.method4710(-1597413832, (float) var70[var76] * var72);
                                var12.method4710(arg0 - 1597413727, (float) var68[var76] * var72);
                            } else {
                                float var78 = var71 / (float) var77;
                                var12.method4710(-1597413832, (float) var67[var76] * var78);
                                var12.method4710(-1597413832, (float) var70[var76] * var78);
                                var12.method4710(-1597413832, (float) var68[var76] * var78);
                            }
                            var12.field2799 += var7 - 12;
                        }
                    }
                }
                if (var6) {
                    var12.field2799 = var11;
                    if (this.field6529.field2500) {
                        for (int var79 = 0; var79 < this.field6473; var79++) {
                            var12.method4708(this.field6424[var79], true);
                            var12.method4708(this.field6474[var79], true);
                            var12.field2799 += var7 - 8;
                        }
                    } else {
                        for (int var80 = 0; var80 < this.field6473; var80++) {
                            var12.method4710(-1597413832, this.field6424[var80]);
                            var12.method4710(arg0 - 1597413727, this.field6474[var80]);
                            var12.field2799 += var7 - 8;
                        }
                    }
                }
                var12.field2799 = this.field6473 * var7;
                class450 var81;
                if (arg1) {
                    if (this.field6470 == null) {
                        this.field6470 = this.field6529.method1488((byte) 31, var12.field2799, var12.field2805, var7, true);
                    } else {
                        this.field6470.method3028(var12.field2799, var12.field2805, var7, 77);
                    }
                    this.field6518 = 0;
                    var81 = this.field6470;
                } else {
                    var81 = this.field6529.method1488((byte) 31, var12.field2799, var12.field2805, var7, false);
                    this.field6409 = true;
                }
                if (var5) {
                    this.field6531.field11324 = var8;
                    this.field6531.field11320 = var81;
                }
                if (var6) {
                    this.field6436.field11324 = var11;
                    this.field6436.field11320 = var81;
                }
                if (arg0 == -105) {
                    if (var3) {
                        this.field6435.field11320 = var81;
                        this.field6435.field11324 = var9;
                    }
                    if (var4) {
                        this.field6483.field11320 = var81;
                        this.field6483.field11324 = var10;
                    }
                }
            }
        } catch (RuntimeException var83) {
            throw class590.method4333(var83, field6532[39] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lsj;Lrp;II)V", line = 571)
    public final void method423(class486 arg0, class463 arg1, int arg2, int arg3) {
        try {
            field6413++;
            if (this.field6473 != 0) {
                class680 var5 = this.field6529.field2423;
                if (!this.field6428) {
                    this.method3269((byte) 74);
                }
                class680 var6 = (class680) arg0;
                class730.field10691 = var5.field9685 * var6.field9705 + var5.field9705 * var6.field9703 + var5.field9678 * var6.field9691;
                class390.field6225 = var5.field9685 * var6.field9689 + var5.field9705 * var6.field9680 + var5.field9678 * var6.field9681 + var5.field9689;
                float var7 = (float) this.field6524 * class730.field10691 + class390.field6225;
                float var8 = (float) this.field6484 * class730.field10691 + class390.field6225;
                float var9;
                float var10;
                if ((var8 < var7)) {
                    var10 = (float) this.field6423 + var7;
                    var9 = var8 - (float) this.field6423;
                } else {
                    var9 = var7 - (float) this.field6423;
                    var10 = (float) this.field6423 + var8;
                }
                if (!(var9 >= this.field6529.field2474) && !(var10 <= (float) this.field6529.field2512)) {
                    class130.field1857 = var5.field9683 * var6.field9705 + var5.field9700 * var6.field9691 + var5.field9691 * var6.field9703;
                    class700.field10073 = var5.field9683 * var6.field9689 + var5.field9700 * var6.field9681 + var5.field9691 * var6.field9680 + var5.field9681;
                    float var11 = (float) this.field6524 * class130.field1857 + class700.field10073;
                    float var12 = (float) this.field6484 * class130.field1857 + class700.field10073;
                    float var13;
                    float var14;
                    if ((var11 > var12)) {
                        var14 = ((float) (-this.field6423) + var12) * (float) this.field6529.field2526;
                        var13 = ((float) this.field6423 + var11) * (float) this.field6529.field2526;
                    } else {
                        var13 = ((float) this.field6423 + var12) * (float) this.field6529.field2526;
                        var14 = (var11 - (float) this.field6423) * (float) this.field6529.field2526;
                    }
                    if (!(this.field6529.field2442 <= var14 / (float) arg2) && !(var13 / (float) arg2 <= this.field6529.field2484)) {
                        class745.field10968 = var5.field9698 * var6.field9689 + var5.field9703 * var6.field9680 + var5.field9675 * var6.field9681 + var5.field9680;
                        class548.field8046 = var5.field9698 * var6.field9705 + var5.field9703 * var6.field9703 + var5.field9675 * var6.field9691;
                        float var15 = (float) this.field6524 * class548.field8046 + class745.field10968;
                        float var16 = (float) this.field6484 * class548.field8046 + class745.field10968;
                        float var17;
                        float var18;
                        if (var16 < var15) {
                            var17 = ((float) this.field6423 + var15) * (float) this.field6529.field2455;
                            var18 = ((float) (-this.field6423) + var16) * (float) this.field6529.field2455;
                        } else {
                            var18 = (var15 - (float) this.field6423) * (float) this.field6529.field2455;
                            var17 = ((float) this.field6423 + var16) * (float) this.field6529.field2455;
                        }
                        if (!(var18 / (float) arg2 >= this.field6529.field2477) && !(this.field6529.field2501 >= var17 / (float) arg2)) {
                            if (arg1 != null || this.field6440 != null) {
                                class253.field3863 = var5.field9698 * var6.field9685 + var5.field9703 * var6.field9698 + var5.field9675 * var6.field9683;
                                class745.field10956 = var5.field9685 * var6.field9678 + var5.field9705 * var6.field9675 + var5.field9678 * var6.field9700;
                                class398.field6299 = var5.field9685 * var6.field9685 + var5.field9705 * var6.field9698 + var5.field9678 * var6.field9683;
                                class541.field7975 = var5.field9683 * var6.field9685 + var5.field9700 * var6.field9683 + var5.field9691 * var6.field9698;
                                class694.field10008 = var5.field9698 * var6.field9678 + var5.field9703 * var6.field9675 + var5.field9675 * var6.field9700;
                                class191.field3018 = var5.field9683 * var6.field9678 + var5.field9700 * var6.field9700 + var5.field9691 * var6.field9675;
                            }
                            if (arg1 != null) {
                                int var19 = this.field6495 + this.field6430 >> 1;
                                int var20 = this.field6512 + this.field6410 >> 1;
                                int var21 = (int) ((float) var20 * class541.field7975 + (float) this.field6524 * class130.field1857 + (float) var19 * class191.field3018 + class700.field10073);
                                int var22 = (int) ((float) var20 * class253.field3863 + (float) this.field6524 * class548.field8046 + (float) var19 * class694.field10008 + class745.field10968);
                                int var23 = (int) ((float) var20 * class398.field6299 + (float) this.field6524 * class730.field10691 + (float) var19 * class745.field10956 + class390.field6225);
                                int var24 = (int) ((float) var20 * class541.field7975 + (float) this.field6484 * class130.field1857 + (float) var19 * class191.field3018 + class700.field10073);
                                int var25 = (int) ((float) var20 * class253.field3863 + (float) this.field6484 * class548.field8046 + (float) var19 * class694.field10008 + class745.field10968);
                                int var26 = (int) ((float) var20 * class398.field6299 + (float) this.field6484 * class730.field10691 + (float) var19 * class745.field10956 + class390.field6225);
                                arg1.field7118 = this.field6529.field2521 + (this.field6529.field2526 * var24 / arg2);
                                arg1.field7121 = this.field6529.field2521 + (this.field6529.field2526 * var21 / arg2);
                                arg1.field7117 = this.field6529.field2473 + (this.field6529.field2455 * var22 / arg2);
                                arg1.field7116 = this.field6529.field2473 + (this.field6529.field2455 * var25 / arg2);
                                if (var23 >= this.field6529.field2512 || this.field6529.field2512 <= var26) {
                                    arg1.field7119 = (this.field6423 + var21) * this.field6529.field2526 / arg2 + this.field6529.field2521 - arg1.field7121;
                                    arg1.field7120 = true;
                                }
                            }
                            this.field6529.method1457((float) arg2, false);
                            this.field6529.method1487(-17);
                            this.field6529.method1501(var6, (byte) 4);
                            this.method3277((byte) -120);
                            this.field6529.method1437(-1);
                            this.method3272(-36297049);
                        }
                    }
                }
            }
        } catch (RuntimeException var28) {
            throw class590.method4333(var28, field6532[65] + (arg0 == null ? field6532[3] : field6532[2]) + ',' + (arg1 == null ? field6532[3] : field6532[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lsj;IZ)V", line = 729)
    public final void method427(class486 arg0, int arg1, boolean arg2) {
        try {
            field6432++;
            if (this.field6499 != null) {
                int[] var4 = new int[3];
                for (int var5 = 0; var5 < this.field6480; var5++) {
                    if ((this.field6499[var5] & arg1) != 0) {
                        if (arg2) {
                            arg0.method2462(this.field6419[var5], this.field6475[var5], this.field6517[var5], var4);
                        } else {
                            arg0.method2457(this.field6419[var5], this.field6475[var5], this.field6517[var5], var4);
                        }
                        this.field6419[var5] = var4[0];
                        this.field6475[var5] = var4[1];
                        this.field6517[var5] = var4[2];
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6532[48] + (arg0 == null ? field6532[3] : field6532[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "(I)V", line = 761)
    public final void method411(int arg0) {
        try {
            this.field6510 = arg0;
            field6507++;
            this.field6409 = true;
            if (this.field6520 != null && (this.field6510 & 0x10000) == 0) {
                this.field6500 = this.field6520.field2641;
                this.field6488 = this.field6520.field2635;
                this.field6417 = this.field6520.field2637;
                this.field6523 = this.field6520.field2634;
                this.field6520 = null;
            }
            this.method3265(-884909049);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6532[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lvf;)V", line = 5881)
    public class407(class159 arg0) {
        try {
            this.field6529 = arg0;
            this.field6531 = new class774(null, 5126, 3, 0);
            this.field6436 = new class774(null, 5126, 2, 0);
            this.field6483 = new class774(null, 5126, 3, 0);
            this.field6435 = new class774(null, 5121, 4, 0);
            this.field6490 = new class691();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6532[29] + (arg0 == null ? field6532[3] : field6532[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lvf;Lkc;IIII)V", line = 5893)
    public class407(class159 arg0, class141 arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.field6461 = arg5;
            this.field6529 = arg0;
            this.field6510 = arg2;
            if (class740.method5385(arg2, arg5, (byte) 123)) {
                this.field6531 = new class774(null, 5126, 3, 0);
            }
            if (class370.method3045(arg2, (byte) 16, arg5)) {
                this.field6436 = new class774(null, 5126, 2, 0);
            }
            if (class525.method3925(arg5, arg2, (byte) -4)) {
                this.field6483 = new class774(null, 5126, 3, 0);
            }
            if (class75.method784(arg2, arg5, -65536)) {
                this.field6435 = new class774(null, 5121, 4, 0);
            }
            if (class114.method1130(124, arg2, arg5)) {
                this.field6490 = new class691();
            }
            class158 var7 = arg0.field864;
            this.field6468 = new int[arg1.field1997 + 1];
            int[] var8 = new int[arg1.field1982];
            for (int var9 = 0; var9 < arg1.field1982; var9++) {
                if (arg1.field1978 == null || arg1.field1978[var9] != 2) {
                    if (arg1.field1975 != null && arg1.field1975[var9] != -1) {
                        class304 var10 = var7.method1419(arg1.field1975[var9] & 0xFFFF, -102);
                        if (((this.field6461 & 0x40) == 0 || !var10.field4890) && var10.field4900) {
                            continue;
                        }
                    }
                    var8[this.field6450++] = var9;
                    this.field6468[arg1.field1983[var9]]++;
                    this.field6468[arg1.field2002[var9]]++;
                    this.field6468[arg1.field1969[var9]]++;
                }
            }
            this.field6415 = this.field6450;
            long[] var11 = new long[this.field6450];
            boolean var12 = (this.field6510 & 0x100) != 0;
            for (int var13 = 0; var13 < this.field6450; var13++) {
                int var14 = var8[var13];
                class304 var15 = null;
                int var16 = 0;
                byte var17 = 0;
                byte var18 = 0;
                byte var19 = 0;
                if (arg1.field2014 != null) {
                    boolean var20 = false;
                    for (int var21 = 0; var21 < arg1.field2014.length; var21++) {
                        class785 var22 = arg1.field2014[var21];
                        if (var22.field11471 == var14) {
                            class297 var23 = class442.method3468((byte) 47, var22.field11467);
                            if (var23.field4833) {
                                var20 = true;
                            }
                            if (var23.field4832 != -1) {
                                class304 var24 = var7.method1419(var23.field4832, -109);
                                if (var24.field4892 == 2) {
                                    this.field6414 = true;
                                }
                            }
                        }
                    }
                    if (var20) {
                        var11[var13] = Long.MAX_VALUE;
                        this.field6415--;
                        continue;
                    }
                }
                short var25 = -1;
                if (arg1.field1975 != null) {
                    var25 = arg1.field1975[var14];
                    if (var25 != -1) {
                        var15 = var7.method1419(var25 & 0xFFFF, -121);
                        if ((this.field6461 & 0x40) != 0 && var15.field4890) {
                            var15 = null;
                            var25 = -1;
                        } else {
                            var19 = var15.field4901;
                            if (var15.field4899 != 0 || var15.field4902 != 0) {
                                this.field6462 = true;
                            }
                            var18 = var15.field4913;
                        }
                    }
                }
                boolean var26 = arg1.field2008 != null && arg1.field2008[var14] != 0 || var15 != null && var15.field4892 != 0;
                if ((var12 || var26) && arg1.field1974 != null) {
                    var16 += arg1.field1974[var14] << 17;
                }
                if (var26) {
                    var16 += 65536;
                }
                int var27 = (var18 & 0xFF << 8) + var16;
                int var28 = (var25 & 0xFFFF << 16) + var17;
                int var29 = (var19 & 0xFF) + var27;
                int var30 = (var13 & 0xFFFF) + var28;
                var11[var13] = ((long) var29 << 32) + ((long) var30);
                this.field6414 |= var26;
                this.field6462 |= var15 != null && (var15.field4899 != 0 || var15.field4902 != 0);
            }
            class690.method5019(var11, var8, (byte) -121);
            this.field6477 = arg1.field2013;
            this.field6517 = arg1.field1986;
            this.field6480 = arg1.field1997;
            this.field6475 = arg1.field1967;
            this.field6419 = arg1.field2015;
            this.field6499 = arg1.field2009;
            class156[] var31 = new class156[this.field6480];
            this.field6511 = arg1.field1980;
            this.field6448 = arg1.field1964;
            if (arg1.field2014 != null) {
                this.field6514 = arg1.field2014.length;
                this.field6456 = new class711[this.field6514];
                this.field6440 = new class208[this.field6514];
                for (int var32 = 0; var32 < this.field6514; var32++) {
                    class785 var33 = arg1.field2014[var32];
                    class297 var34 = class442.method3468((byte) 104, var33.field11467);
                    int var35 = -1;
                    for (int var36 = 0; var36 < this.field6450; var36++) {
                        if (var33.field11471 == var8[var36]) {
                            var35 = var36;
                            break;
                        }
                    }
                    if (var35 == -1) {
                        throw new RuntimeException();
                    }
                    int var37 = class613.field8810[arg1.field1996[var33.field11471] & 0xFFFF] & 0xFFFFFF;
                    int var38 = var37 | 255 - (arg1.field2008 == null ? 0 : arg1.field2008[var33.field11471]) << 24;
                    this.field6440[var32] = new class208(var35, arg1.field1983[var33.field11471], arg1.field2002[var33.field11471], arg1.field1969[var33.field11471], var34.field4843, var34.field4846, var34.field4832, var34.field4839, var34.field4840, var34.field4833, var34.field4834, var33.field11465);
                    this.field6456[var32] = new class711(var38);
                }
            }
            int var39 = this.field6450 * 3;
            this.field6444 = (short) arg4;
            class716.field10359 = new long[var39];
            this.field6530 = new short[var39];
            this.field6488 = new short[var39];
            if (arg1.field2000 != null) {
                this.field6425 = new short[this.field6450];
            }
            this.field6417 = new byte[var39];
            this.field6446 = new byte[this.field6450];
            this.field6493 = new short[this.field6450];
            this.field6412 = (short) arg3;
            this.field6482 = new short[this.field6450];
            this.field6474 = new float[var39];
            this.field6458 = new short[this.field6450];
            this.field6424 = new float[var39];
            this.field6460 = new short[this.field6450];
            this.field6501 = new short[this.field6450];
            this.field6523 = new short[var39];
            this.field6500 = new short[var39];
            int var40 = 0;
            for (int var41 = 0; var41 < arg1.field1997; var41++) {
                int var42 = this.field6468[var41];
                this.field6468[var41] = var40;
                var31[var41] = new class156();
                var40 += var42;
            }
            this.field6468[arg1.field1997] = var40;
            class439 var43 = class490.method3715(this.field6450, arg1, var8, 115);
            class690[] var44 = new class690[arg1.field1982];
            for (int var45 = 0; var45 < arg1.field1982; var45++) {
                short var46 = arg1.field1983[var45];
                short var47 = arg1.field2002[var45];
                short var48 = arg1.field1969[var45];
                int var49 = this.field6419[var47] - this.field6419[var46];
                int var50 = this.field6475[var47] - this.field6475[var46];
                int var51 = this.field6517[var47] - this.field6517[var46];
                int var52 = this.field6419[var48] - this.field6419[var46];
                int var53 = this.field6475[var48] - this.field6475[var46];
                int var54 = this.field6517[var48] - this.field6517[var46];
                int var55 = var50 * var54 - (var51 * var53);
                int var56 = var51 * var52 - (var49 * var54);
                int var57 = var49 * var53 - (var50 * var52);
                while (var55 > 8192 || var56 > 8192 || var57 > 8192 || var55 < -8192 || var56 < -8192 || var57 < -8192) {
                    var57 >>= 0x1;
                    var55 >>= 0x1;
                    var56 >>= 0x1;
                }
                int var58 = (int) Math.sqrt((double) (var57 * var57 + (var55 * var55 + (var56 * var56))));
                if (var58 <= 0) {
                    var58 = 1;
                }
                int var59 = var56 * 256 / var58;
                int var60 = var57 * 256 / var58;
                int var61 = var55 * 256 / var58;
                byte var62 = arg1.field1978 == null ? 0 : arg1.field1978[var45];
                if (var62 == 0) {
                    class156 var63 = var31[var46];
                    var63.field2160 += var60;
                    var63.field2161 += var59;
                    var63.field2165 += var61;
                    var63.field2164++;
                    class156 var64 = var31[var47];
                    var64.field2164++;
                    var64.field2165 += var61;
                    var64.field2160 += var60;
                    var64.field2161 += var59;
                    class156 var65 = var31[var48];
                    var65.field2165 += var61;
                    var65.field2161 += var59;
                    var65.field2164++;
                    var65.field2160 += var60;
                } else if (var62 == 1) {
                    class690 var66 = var44[var45] = new class690();
                    var66.field9958 = var60;
                    var66.field9951 = var61;
                    var66.field9952 = var59;
                }
            }
            for (int var67 = 0; var67 < this.field6450; var67++) {
                int var68 = var8[var67];
                int var69 = arg1.field1996[var68] & 0xFFFF;
                int var70;
                if (arg1.field2001 == null) {
                    var70 = -1;
                } else {
                    var70 = arg1.field2001[var68];
                }
                int var71;
                if (arg1.field2008 == null) {
                    var71 = 0;
                } else {
                    var71 = arg1.field2008[var68] & 0xFF;
                }
                short var72 = arg1.field1975 == null ? -1 : arg1.field1975[var68];
                if (var72 != -1 && (this.field6461 & 0x40) != 0) {
                    class304 var73 = var7.method1419(var72 & 0xFFFF, -117);
                    if (var73.field4890) {
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
                        var74 = 0.0F;
                        var81 = 2;
                        var76 = 1.0F;
                        var75 = 1.0F;
                        var80 = 1;
                        var79 = 0.0F;
                        var78 = 0.0F;
                        var77 = 1.0F;
                    } else {
                        var70 &= 0xFF;
                        byte var83 = arg1.field2007[var70];
                        if (var83 == 0) {
                            short var112 = arg1.field1983[var68];
                            short var113 = arg1.field2002[var68];
                            short var114 = arg1.field1969[var68];
                            short var115 = arg1.field1965[var70];
                            short var116 = arg1.field1970[var70];
                            short var117 = arg1.field1998[var70];
                            float var118 = (float) arg1.field2015[var115];
                            float var119 = (float) arg1.field1967[var115];
                            float var120 = (float) arg1.field1986[var115];
                            float var121 = (float) arg1.field2015[var116] - var118;
                            float var122 = (float) arg1.field1967[var116] - var119;
                            float var123 = (float) arg1.field1986[var116] - var120;
                            float var124 = (float) arg1.field2015[var117] - var118;
                            float var125 = (float) arg1.field1967[var117] - var119;
                            float var126 = (float) arg1.field1986[var117] - var120;
                            float var127 = (float) arg1.field2015[var112] - var118;
                            float var128 = (float) arg1.field1967[var112] - var119;
                            float var129 = (float) arg1.field1986[var112] - var120;
                            float var130 = (float) arg1.field2015[var113] - var118;
                            float var131 = (float) arg1.field1967[var113] - var119;
                            float var132 = (float) arg1.field1986[var113] - var120;
                            float var133 = (float) arg1.field2015[var114] - var118;
                            float var134 = (float) arg1.field1967[var114] - var119;
                            float var135 = (float) arg1.field1986[var114] - var120;
                            float var136 = var122 * var126 - var123 * var125;
                            float var137 = var123 * var124 - var121 * var126;
                            float var138 = var121 * var125 - (var122 * var124);
                            float var139 = var125 * var138 - var126 * var137;
                            float var140 = var126 * var136 - (var124 * var138);
                            float var141 = var124 * var137 - var125 * var136;
                            float var142 = 1.0F / (var123 * var141 + var121 * var139 + var122 * var140);
                            var76 = (var132 * var141 + var130 * var139 + var131 * var140) * var142;
                            var78 = (var135 * var141 + var133 * var139 + var134 * var140) * var142;
                            var74 = (var129 * var141 + var127 * var139 + var128 * var140) * var142;
                            float var143 = var121 * var137 - var122 * var136;
                            float var144 = var122 * var138 - (var123 * var137);
                            float var145 = var123 * var136 - (var121 * var138);
                            float var146 = 1.0F / (var126 * var143 + var124 * var144 + var125 * var145);
                            var77 = (var132 * var143 + var130 * var144 + var131 * var145) * var146;
                            var75 = (var129 * var143 + var127 * var144 + var128 * var145) * var146;
                            var79 = (var135 * var143 + var133 * var144 + var134 * var145) * var146;
                        } else {
                            short var84 = arg1.field1983[var68];
                            short var85 = arg1.field2002[var68];
                            short var86 = arg1.field1969[var68];
                            int var87 = var43.field6857[var70];
                            int var88 = var43.field6853[var70];
                            int var89 = var43.field6852[var70];
                            float[] var90 = var43.field6851[var70];
                            byte var91 = arg1.field1993[var70];
                            float var92 = (float) arg1.field1976[var70] / 256.0F;
                            if (var83 == 1) {
                                float var93 = (float) arg1.field1963[var70] / 1024.0F;
                                class9.method72(arg1.field2015[var84], var91, var87, arg1.field1986[var84], var90, var88, class67.field922, var93, arg1.field1967[var84], var92, var89, true);
                                var74 = class67.field922[0];
                                var75 = class67.field922[1];
                                class9.method72(arg1.field2015[var85], var91, var87, arg1.field1986[var85], var90, var88, class67.field922, var93, arg1.field1967[var85], var92, var89, true);
                                var76 = class67.field922[0];
                                var77 = class67.field922[1];
                                class9.method72(arg1.field2015[var86], var91, var87, arg1.field1986[var86], var90, var88, class67.field922, var93, arg1.field1967[var86], var92, var89, true);
                                var78 = class67.field922[0];
                                var79 = class67.field922[1];
                                float var94 = var93 / 2.0F;
                                if ((var91 & 0x1) == 0) {
                                    if ((var94 < var78 - var74)) {
                                        var78 -= var93;
                                        var81 = 1;
                                    } else if (var94 < var74 - var78) {
                                        var78 += var93;
                                        var81 = 2;
                                    }
                                    if ((var76 - var74 > var94)) {
                                        var76 -= var93;
                                        var80 = 1;
                                    } else if (var94 < var74 - var76) {
                                        var80 = 2;
                                        var76 += var93;
                                    }
                                } else {
                                    if (var94 < var77 - var75) {
                                        var77 -= var93;
                                        var80 = 1;
                                    } else if (var75 - var77 > var94) {
                                        var80 = 2;
                                        var77 += var93;
                                    }
                                    if ((var79 - var75 > var94)) {
                                        var79 -= var93;
                                        var81 = 1;
                                    } else if (var94 < var75 - var79) {
                                        var79 += var93;
                                        var81 = 2;
                                    }
                                }
                            } else if (var83 == 2) {
                                float var95 = (float) arg1.field1966[var70] / 256.0F;
                                float var96 = (float) arg1.field1979[var70] / 256.0F;
                                int var97 = arg1.field2015[var85] - arg1.field2015[var84];
                                int var98 = arg1.field1967[var85] - arg1.field1967[var84];
                                int var99 = arg1.field1986[var85] - arg1.field1986[var84];
                                int var100 = arg1.field2015[var86] - arg1.field2015[var84];
                                int var101 = arg1.field1967[var86] - arg1.field1967[var84];
                                int var102 = arg1.field1986[var86] - arg1.field1986[var84];
                                int var103 = var98 * var102 - (var99 * var101);
                                int var104 = var99 * var100 - (var97 * var102);
                                int var105 = var97 * var101 - var98 * var100;
                                float var106 = 64.0F / (float) arg1.field1999[var70];
                                float var107 = 64.0F / (float) arg1.field2010[var70];
                                float var108 = 64.0F / (float) arg1.field1963[var70];
                                float var109 = (var90[2] * (float) var105 + var90[1] * (float) var104 + var90[0] * (float) var103) / var106;
                                float var110 = (var90[5] * (float) var105 + var90[4] * (float) var104 + var90[3] * (float) var103) / var107;
                                float var111 = (var90[8] * (float) var105 + var90[6] * (float) var103 + var90[7] * (float) var104) / var108;
                                var82 = class213.method1917(var110, var111, var109, (byte) -92);
                                class715.method5180(var89, var88, var87, arg1.field1986[var84], arg1.field1967[var84], -2800, var95, class67.field922, arg1.field2015[var84], var92, var90, var91, var82, var96);
                                var74 = class67.field922[0];
                                var75 = class67.field922[1];
                                class715.method5180(var89, var88, var87, arg1.field1986[var85], arg1.field1967[var85], -2800, var95, class67.field922, arg1.field2015[var85], var92, var90, var91, var82, var96);
                                var76 = class67.field922[0];
                                var77 = class67.field922[1];
                                class715.method5180(var89, var88, var87, arg1.field1986[var86], arg1.field1967[var86], -2800, var95, class67.field922, arg1.field2015[var86], var92, var90, var91, var82, var96);
                                var79 = class67.field922[1];
                                var78 = class67.field922[0];
                            } else if (var83 == 3) {
                                class292.method2489(var87, arg1.field1967[var84], (byte) -20, var92, arg1.field2015[var84], var90, var89, var91, var88, arg1.field1986[var84], class67.field922);
                                var74 = class67.field922[0];
                                var75 = class67.field922[1];
                                class292.method2489(var87, arg1.field1967[var85], (byte) -20, var92, arg1.field2015[var85], var90, var89, var91, var88, arg1.field1986[var85], class67.field922);
                                var77 = class67.field922[1];
                                var76 = class67.field922[0];
                                class292.method2489(var87, arg1.field1967[var86], (byte) -20, var92, arg1.field2015[var86], var90, var89, var91, var88, arg1.field1986[var86], class67.field922);
                                var79 = class67.field922[1];
                                var78 = class67.field922[0];
                                if ((var91 & 0x1) == 0) {
                                    if ((var76 - var74 > 0.5F)) {
                                        var80 = 1;
                                        var76--;
                                    } else if (var74 - var76 > 0.5F) {
                                        var80 = 2;
                                        var76++;
                                    }
                                    if ((var78 - var74 > 0.5F)) {
                                        var81 = 1;
                                        var78--;
                                    } else if (var74 - var78 > 0.5F) {
                                        var81 = 2;
                                        var78++;
                                    }
                                } else {
                                    if (var77 - var75 > 0.5F) {
                                        var80 = 1;
                                        var77--;
                                    } else if (var75 - var77 > 0.5F) {
                                        var80 = 2;
                                        var77++;
                                    }
                                    if (var79 - var75 > 0.5F) {
                                        var79--;
                                        var81 = 1;
                                    } else if (var75 - var79 > 0.5F) {
                                        var79++;
                                        var81 = 2;
                                    }
                                }
                            }
                        }
                    }
                }
                byte var147;
                if (arg1.field1978 == null) {
                    var147 = 0;
                } else {
                    var147 = arg1.field1978[var68];
                }
                if (var147 == 0) {
                    long var151 = ((long) (var69 << 8) + (long) (var82 << 24) + ((long) var71) << 32) + (long) (var70 << 2);
                    short var153 = arg1.field1983[var68];
                    short var154 = arg1.field2002[var68];
                    short var155 = arg1.field1969[var68];
                    class156 var156 = var31[var153];
                    this.field6460[var67] = this.method3267(var156.field2165, var156.field2161, var153, var156.field2160, var75, var74, var156.field2164, 7, arg1, var151);
                    class156 var157 = var31[var154];
                    this.field6482[var67] = this.method3267(var157.field2165, var157.field2161, var154, var157.field2160, var77, var76, var157.field2164, 7, arg1, (long) var80 + var151);
                    class156 var158 = var31[var155];
                    this.field6493[var67] = this.method3267(var158.field2165, var158.field2161, var155, var158.field2160, var79, var78, var158.field2164, 7, arg1, (long) var81 + var151);
                } else if (var147 == 1) {
                    class690 var148 = var44[var68];
                    long var149 = (long) ((var148.field9951 > 0 ? 1024 : 2048) + (var148.field9958 + 256 << 22) + ((var70 << 2) - -(var148.field9952 + 256 << 12))) + ((long) (var82 << 24) + ((long) var71) + (long) (var69 << 8) << 32);
                    this.field6460[var67] = this.method3267(var148.field9951, var148.field9952, arg1.field1983[var68], var148.field9958, var75, var74, 0, 7, arg1, var149);
                    this.field6482[var67] = this.method3267(var148.field9951, var148.field9952, arg1.field2002[var68], var148.field9958, var77, var76, 0, 7, arg1, (long) var80 + var149);
                    this.field6493[var67] = this.method3267(var148.field9951, var148.field9952, arg1.field1969[var68], var148.field9958, var79, var78, 0, 7, arg1, (long) var81 + var149);
                }
                if (arg1.field2008 != null) {
                    this.field6446[var67] = arg1.field2008[var68];
                }
                if (arg1.field2000 != null) {
                    this.field6425[var67] = arg1.field2000[var68];
                }
                this.field6458[var67] = arg1.field1996[var68];
                this.field6501[var67] = var72;
            }
            int var159 = 0;
            short var160 = -10000;
            for (int var161 = 0; var161 < this.field6415; var161++) {
                short var162 = this.field6501[var161];
                if (var160 != var162) {
                    var159++;
                    var160 = var162;
                }
            }
            this.field6437 = new int[var159 + 1];
            int var163 = 0;
            short var164 = -10000;
            for (int var165 = 0; var165 < this.field6415; var165++) {
                short var166 = this.field6501[var165];
                if (var164 != var166) {
                    this.field6437[var163++] = var165;
                    var164 = var166;
                }
            }
            this.field6437[var163] = this.field6415;
            class716.field10359 = null;
            this.field6500 = class156.method1406(this.field6473, 65, this.field6500);
            this.field6523 = class156.method1406(this.field6473, 92, this.field6523);
            this.field6488 = class156.method1406(this.field6473, -125, this.field6488);
            this.field6417 = class760.method5493(0, this.field6473, this.field6417);
            this.field6424 = class684.method4987(-1396, this.field6424, this.field6473);
            this.field6474 = class684.method4987(-1396, this.field6474, this.field6473);
            if (arg1.field2004 != null && class585.method4298(this.field6461, 2048, arg2)) {
                this.field6487 = arg1.method1314(false, 0);
            }
            if (arg1.field2014 != null && class548.method4066(this.field6461, -66, arg2)) {
                this.field6452 = arg1.method1311(true);
            }
            if (arg1.field1992 != null && class620.method4531(0, arg2, this.field6461)) {
                int var167 = 0;
                int[] var168 = new int[256];
                for (int var169 = 0; var169 < this.field6450; var169++) {
                    int var170 = arg1.field1992[var8[var169]];
                    if (var170 >= 0) {
                        if (var167 < var170) {
                            var167 = var170;
                        }
                        int var10002 = var168[var170]++;
                    }
                }
                this.field6420 = new int[var167 + 1][];
                for (int var171 = 0; var171 <= var167; var171++) {
                    this.field6420[var171] = new int[var168[var171]];
                    var168[var171] = 0;
                }
                for (int var172 = 0; var172 < this.field6450; var172++) {
                    int var173 = arg1.field1992[var8[var172]];
                    if (var173 >= 0) {
                        this.field6420[var173][var168[var173]++] = var172;
                    }
                }
            }
        } catch (RuntimeException var175) {
            throw class590.method4333(var175, field6532[29] + (arg0 == null ? field6532[3] : field6532[2]) + ',' + (arg1 == null ? field6532[3] : field6532[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "LA", descriptor = "(I)V", line = 786)
    public final void method414(int arg0) {
        try {
            if (this.field6435 != null) {
                this.field6435.field11320 = null;
            }
            field6525++;
            this.field6444 = (short) arg0;
            if (this.field6483 != null) {
                this.field6483.field11320 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6532[30] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "ma", descriptor = "()I", line = 804)
    public final int method390() {
        try {
            field6502++;
            if (!this.field6428) {
                this.method3269((byte) 80);
            }
            return this.field6454;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[63] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLor;)V", line = 819)
    private final void method3264(byte arg0, class669 arg1) {
        try {
            field6528++;
            if (this.field6529.field2538.length < this.field6473) {
                this.field6529.field2538 = new int[this.field6473];
                this.field6529.field2543 = new int[this.field6473];
            }
            int[] var3 = this.field6529.field2538;
            int[] var4 = this.field6529.field2543;
            for (int var5 = 0; var5 < this.field6480; var5++) {
                int var6 = (this.field6419[var5] - (this.field6475[var5] * this.field6529.field2503 >> 8) >> this.field6529.field2390) - arg1.field9513;
                int var7 = (this.field6517[var5] - (this.field6475[var5] * this.field6529.field2511 >> 8) >> this.field6529.field2390) - arg1.field9504;
                int var8 = this.field6468[var5];
                int var9 = this.field6468[var5 + 1];
                for (int var10 = var8; var10 < var9; var10++) {
                    int var11 = this.field6530[var10] - 1;
                    if (var11 == -1) {
                        break;
                    }
                    var3[var11] = var6;
                    var4[var11] = var7;
                }
            }
            for (int var12 = 0; var12 < this.field6415; var12++) {
                if (this.field6446 == null || this.field6446[var12] <= 128) {
                    short var13 = this.field6460[var12];
                    short var14 = this.field6482[var12];
                    short var15 = this.field6493[var12];
                    int var16 = var3[var13];
                    int var17 = var3[var14];
                    int var18 = var3[var15];
                    int var19 = var4[var13];
                    int var20 = var4[var14];
                    int var21 = var4[var15];
                    if ((var16 - var17) * (var20 - var21) - (var18 - var17) * (var20 - var19) > 0) {
                        arg1.method4854(var17, var16, var18, var19, false, var21, var20);
                    }
                }
            }
            if (arg0 != -80) {
                this.field6480 = -53;
            }
        } catch (RuntimeException var23) {
            throw class590.method4333(var23, field6532[9] + arg0 + ',' + (arg1 == null ? field6532[3] : field6532[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V", line = 909)
    private final void method3265(int arg0) {
        try {
            field6426++;
            if (this.field6409) {
                this.field6409 = false;
                if (this.field6511 == null && this.field6448 == null && this.field6440 == null && !class541.method4029(this.field6461, this.field6510, arg0 + 884908959)) {
                    boolean var2 = false;
                    boolean var3 = false;
                    boolean var4 = false;
                    if (this.field6419 != null && !class524.method3917(1, this.field6461, this.field6510)) {
                        if (this.field6531 != null && this.field6531.field11320 == null) {
                            this.field6409 = true;
                        } else {
                            if (!this.field6428) {
                                this.method3269((byte) 63);
                            }
                            var2 = true;
                        }
                    }
                    if (this.field6475 != null && !class490.method3716((byte) -86, this.field6461, this.field6510)) {
                        if (this.field6531 != null && this.field6531.field11320 == null) {
                            this.field6409 = true;
                        } else {
                            if (!this.field6428) {
                                this.method3269((byte) 96);
                            }
                            var3 = true;
                        }
                    }
                    if (this.field6517 != null && !class619.method4524(0, this.field6510, this.field6461)) {
                        if (this.field6531 != null && this.field6531.field11320 == null) {
                            this.field6409 = true;
                        } else {
                            var4 = true;
                            if (!this.field6428) {
                                this.method3269((byte) 108);
                            }
                        }
                    }
                    if (var3) {
                        this.field6475 = null;
                    }
                    if (var2) {
                        this.field6419 = null;
                    }
                    if (var4) {
                        this.field6517 = null;
                    }
                }
                if (this.field6530 != null && this.field6419 == null && this.field6475 == null && this.field6517 == null) {
                    this.field6530 = null;
                    this.field6468 = null;
                }
                if (this.field6417 != null && !class409.method3281(this.field6510, (byte) 88, this.field6461)) {
                    if (this.field6483 == null) {
                        if (this.field6435 != null && this.field6435.field11320 == null) {
                            this.field6409 = true;
                        } else {
                            this.field6417 = null;
                            this.field6500 = this.field6523 = this.field6488 = null;
                        }
                    } else if (this.field6483.field11320 == null) {
                        this.field6409 = true;
                    } else {
                        this.field6500 = this.field6523 = this.field6488 = null;
                        this.field6417 = null;
                    }
                }
                if (this.field6458 != null && !class464.method3586(-109, this.field6510, this.field6461)) {
                    if (this.field6435 != null && this.field6435.field11320 == null) {
                        this.field6409 = true;
                    } else {
                        this.field6458 = null;
                    }
                }
                if (this.field6446 != null && !class606.method4426(this.field6510, -118, this.field6461)) {
                    if (this.field6435 != null && this.field6435.field11320 == null) {
                        this.field6409 = true;
                    } else {
                        this.field6446 = null;
                    }
                }
                if (arg0 == -884909049) {
                    if (this.field6424 != null && !class441.method3455(this.field6461, this.field6510, 55)) {
                        if (this.field6436 != null && this.field6436.field11320 == null) {
                            this.field6409 = true;
                        } else {
                            this.field6424 = this.field6474 = null;
                        }
                    }
                    if (this.field6501 != null && !class539.method4021(this.field6461, this.field6510, (byte) 55)) {
                        if (this.field6435 != null && this.field6435.field11320 == null) {
                            this.field6409 = true;
                        } else {
                            this.field6501 = null;
                        }
                    }
                    if (this.field6460 != null && !class636.method4608(this.field6461, (byte) 114, this.field6510)) {
                        if ((this.field6490 == null || this.field6490.field9963 != null) && (this.field6435 == null || this.field6435.field11320 != null)) {
                            this.field6460 = this.field6482 = this.field6493 = null;
                        } else {
                            this.field6409 = true;
                        }
                    }
                    if (this.field6420 != null && !class620.method4531(arg0 ^ 0xCB415C07, this.field6510, this.field6461)) {
                        this.field6420 = null;
                        this.field6425 = null;
                    }
                    if (this.field6487 != null && !class585.method4298(this.field6461, 2048, this.field6510)) {
                        this.field6487 = null;
                        this.field6499 = null;
                    }
                    if (this.field6452 != null && !class548.method4066(this.field6461, 123, this.field6510)) {
                        this.field6452 = null;
                    }
                    if (this.field6437 != null && (this.field6510 & 0x800) == 0 && (this.field6510 & 0x40000) == 0) {
                        this.field6437 = null;
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6532[34] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IBIIZI)V", line = 1107)
    public static final void method3266(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        try {
            field6442++;
            if (arg1 <= 112) {
                method3278((byte) -46);
            }
            long var6 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg5);
            class454 var8 = (class454) class152.field2126.method737((byte) -39, var6);
            if (var8 == null) {
                var8 = new class454();
                class152.field2126.method738(var8, var6, -12002);
            }
            if (arg2 >= var8.field7018.length) {
                int[] var9 = new int[arg2 + 1];
                int[] var10 = new int[arg2 + 1];
                for (int var11 = 0; var11 < var8.field7018.length; var11++) {
                    var9[var11] = var8.field7018[var11];
                    var10[var11] = var8.field7013[var11];
                }
                for (int var12 = var8.field7018.length; var12 < arg2; var12++) {
                    var9[var12] = -1;
                    var10[var12] = 0;
                }
                var8.field7018 = var9;
                var8.field7013 = var10;
            }
            var8.field7018[arg2] = arg3;
            var8.field7013[arg2] = arg0;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field6532[57] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lsj;)V", line = 1160)
    public final void method418(class486 arg0) {
        try {
            field6476++;
            class680 var2 = (class680) arg0;
            if (this.field6511 != null) {
                for (int var3 = 0; var3 < this.field6511.length; var3++) {
                    class239 var4 = this.field6511[var3];
                    class239 var5 = var4;
                    if (var4.field3678 != null) {
                        var5 = var4.field3678;
                    }
                    var5.field3671 = (int) ((float) this.field6517[var4.field3665] * var2.field9683 + (float) this.field6475[var4.field3665] * var2.field9691 + (float) this.field6419[var4.field3665] * var2.field9700 + var2.field9681);
                    var5.field3667 = (int) ((float) this.field6517[var4.field3665] * var2.field9698 + (float) this.field6475[var4.field3665] * var2.field9703 + (float) this.field6419[var4.field3665] * var2.field9675 + var2.field9680);
                    var5.field3675 = (int) ((float) this.field6517[var4.field3665] * var2.field9685 + (float) this.field6475[var4.field3665] * var2.field9705 + (float) this.field6419[var4.field3665] * var2.field9678 + var2.field9689);
                    var5.field3681 = (int) ((float) this.field6517[var4.field3670] * var2.field9683 + (float) this.field6475[var4.field3670] * var2.field9691 + (float) this.field6419[var4.field3670] * var2.field9700 + var2.field9681);
                    var5.field3679 = (int) ((float) this.field6517[var4.field3670] * var2.field9698 + (float) this.field6475[var4.field3670] * var2.field9703 + (float) this.field6419[var4.field3670] * var2.field9675 + var2.field9680);
                    var5.field3664 = (int) ((float) this.field6517[var4.field3670] * var2.field9685 + (float) this.field6475[var4.field3670] * var2.field9705 + (float) this.field6419[var4.field3670] * var2.field9678 + var2.field9689);
                    var5.field3666 = (int) ((float) this.field6517[var4.field3669] * var2.field9683 + (float) this.field6475[var4.field3669] * var2.field9691 + (float) this.field6419[var4.field3669] * var2.field9700 + var2.field9681);
                    var5.field3680 = (int) ((float) this.field6517[var4.field3669] * var2.field9698 + (float) this.field6475[var4.field3669] * var2.field9703 + (float) this.field6419[var4.field3669] * var2.field9675 + var2.field9680);
                    var5.field3677 = (int) ((float) this.field6517[var4.field3669] * var2.field9685 + (float) this.field6475[var4.field3669] * var2.field9705 + (float) this.field6419[var4.field3669] * var2.field9678 + var2.field9689);
                }
            }
            if (this.field6448 != null) {
                for (int var6 = 0; var6 < this.field6448.length; var6++) {
                    class265 var7 = this.field6448[var6];
                    class265 var8 = var7;
                    if (var7.field4291 != null) {
                        var8 = var7.field4291;
                    }
                    if (var7.field4297 == null) {
                        var7.field4297 = var2.method2472();
                    } else {
                        var7.field4297.method2461(var2);
                    }
                    var8.field4299 = (int) ((float) this.field6517[var7.field4296] * var2.field9683 + (float) this.field6475[var7.field4296] * var2.field9691 + (float) this.field6419[var7.field4296] * var2.field9700 + var2.field9681);
                    var8.field4292 = (int) ((float) this.field6517[var7.field4296] * var2.field9698 + (float) this.field6475[var7.field4296] * var2.field9703 + (float) this.field6419[var7.field4296] * var2.field9675 + var2.field9680);
                    var8.field4290 = (int) ((float) this.field6517[var7.field4296] * var2.field9685 + (float) this.field6475[var7.field4296] * var2.field9705 + (float) this.field6419[var7.field4296] * var2.field9678 + var2.field9689);
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field6532[5] + (arg0 == null ? field6532[3] : field6532[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIFFIILkc;J)S", line = 1225)
    private final short method3267(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, int arg6, int arg7, class141 arg8, long arg9) {
        try {
            field6434++;
            int var12 = this.field6468[arg2];
            int var13 = this.field6468[arg2 + 1];
            int var14 = 0;
            for (int var15 = var12; var15 < var13; var15++) {
                short var16 = this.field6530[var15];
                if (var16 == 0) {
                    var14 = var15;
                    break;
                }
                if (class716.field10359[var15] == arg9) {
                    return (short) (var16 - 1);
                }
            }
            this.field6530[var14] = (short) (this.field6473 + 1);
            class716.field10359[var14] = arg9;
            this.field6500[this.field6473] = (short) arg0;
            if (arg7 != 7) {
                this.method423(null, null, 17, 54);
            }
            this.field6523[this.field6473] = (short) arg1;
            this.field6488[this.field6473] = (short) arg3;
            this.field6417[this.field6473] = (byte) arg6;
            this.field6424[this.field6473] = arg5;
            this.field6474[this.field6473] = arg4;
            return (short) (this.field6473++);
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field6532[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field6532[3] : field6532[2]) + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "()V", line = 1272)
    public final void method421() {
        try {
            field6429++;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[8] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZB)V", line = 1280)
    private final void method3268(boolean arg0, byte arg1) {
        try {
            field6449++;
            if (this.field6529.field2453.field2805.length < this.field6415 * 6) {
                this.field6529.field2453 = new class647((this.field6415 + 100) * 6);
            } else {
                this.field6529.field2453.field2799 = 0;
            }
            class647 var3 = this.field6529.field2453;
            if (arg1 < -98) {
                if (this.field6529.field2500) {
                    for (int var5 = 0; var5 < this.field6415; var5++) {
                        var3.method1650((byte) -95, this.field6460[var5]);
                        var3.method1650((byte) -95, this.field6482[var5]);
                        var3.method1650((byte) -95, this.field6493[var5]);
                    }
                } else {
                    for (int var4 = 0; var4 < this.field6415; var4++) {
                        var3.method1633(this.field6460[var4], -24955);
                        var3.method1633(this.field6482[var4], -24955);
                        var3.method1633(this.field6493[var4], -24955);
                    }
                }
                if (var3.field2799 != 0) {
                    if (arg0) {
                        if (this.field6506 == null) {
                            this.field6506 = this.field6529.method1465(true, true, 5123, var3.field2799, var3.field2805);
                        } else {
                            this.field6506.method623(5123, var3.field2799, false, var3.field2805);
                        }
                        this.field6490.field9963 = this.field6506;
                    } else {
                        this.field6490.field9963 = this.field6529.method1465(false, true, 5123, var3.field2799, var3.field2805);
                    }
                    if (!arg0) {
                        this.field6409 = true;
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6532[38] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 1347)
    private final void method3269(byte arg0) {
        try {
            field6455++;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = 32767;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = -32768;
            int var8 = 0;
            int var9 = 0;
            if (arg0 <= 34) {
                this.field6448 = null;
            }
            for (int var10 = 0; var10 < this.field6480; var10++) {
                int var11 = this.field6419[var10];
                int var12 = this.field6475[var10];
                int var13 = this.field6517[var10];
                if (var5 < var11) {
                    var5 = var11;
                }
                if (var12 < var3) {
                    var3 = var12;
                }
                if (var2 > var11) {
                    var2 = var11;
                }
                if (var6 < var12) {
                    var6 = var12;
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
                int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
                if (var15 > var9) {
                    var9 = var15;
                }
            }
            this.field6495 = (short) var2;
            this.field6512 = (short) var7;
            this.field6524 = (short) var3;
            this.field6410 = (short) var4;
            this.field6484 = (short) var6;
            this.field6430 = (short) var5;
            this.field6423 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
            this.field6454 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
            this.field6428 = true;
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field6532[42] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "da", descriptor = "()I", line = 1437)
    public final int method398() {
        try {
            field6471++;
            return this.field6444;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[41] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "()I", line = 1445)
    public final int method422() {
        try {
            field6526++;
            if (!this.field6428) {
                this.method3269((byte) 80);
            }
            return this.field6512;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[45] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "O", descriptor = "(III)V", line = 1457)
    public final void method435(int arg0, int arg1, int arg2) {
        try {
            field6485++;
            for (int var4 = 0; var4 < this.field6480; var4++) {
                if (arg0 != 128) {
                    this.field6419[var4] = this.field6419[var4] * arg0 >> 7;
                }
                if (arg1 != 128) {
                    this.field6475[var4] = this.field6475[var4] * arg1 >> 7;
                }
                if (arg2 != 128) {
                    this.field6517[var4] = this.field6517[var4] * arg2 >> 7;
                }
            }
            if (this.field6531 != null) {
                this.field6531.field11320 = null;
            }
            this.field6428 = false;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6532[23] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILsj;IIIZ)Z", line = 1490)
    private final boolean method3270(int arg0, int arg1, class486 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        try {
            field6496++;
            class680 var8 = (class680) arg2;
            class680 var9 = this.field6529.field2423;
            float var10 = var8.field9689 * var9.field9683 + var8.field9681 * var9.field9700 + var8.field9680 * var9.field9691 + var9.field9681;
            float var11 = var8.field9689 * var9.field9698 + var8.field9681 * var9.field9675 + var8.field9680 * var9.field9703 + var9.field9680;
            class730.field10691 = var8.field9705 * var9.field9685 + var8.field9703 * var9.field9705 + var8.field9691 * var9.field9678;
            class745.field10956 = var8.field9678 * var9.field9685 + var8.field9700 * var9.field9678 + var8.field9675 * var9.field9705;
            class191.field3018 = var8.field9678 * var9.field9683 + var8.field9700 * var9.field9700 + var8.field9675 * var9.field9691;
            class130.field1857 = var8.field9705 * var9.field9683 + var8.field9703 * var9.field9691 + var8.field9691 * var9.field9700;
            class548.field8046 = var8.field9705 * var9.field9698 + var8.field9703 * var9.field9703 + var8.field9691 * var9.field9675;
            class253.field3863 = var8.field9685 * var9.field9698 + var8.field9698 * var9.field9703 + var8.field9683 * var9.field9675;
            class398.field6299 = var8.field9685 * var9.field9685 + var8.field9698 * var9.field9705 + var8.field9683 * var9.field9678;
            class694.field10008 = var8.field9678 * var9.field9698 + var8.field9700 * var9.field9675 + var8.field9675 * var9.field9703;
            class541.field7975 = var8.field9685 * var9.field9683 + var8.field9698 * var9.field9691 + var8.field9683 * var9.field9700;
            float var12 = var8.field9689 * var9.field9685 + var8.field9681 * var9.field9678 + var8.field9680 * var9.field9705 + var9.field9689;
            boolean var13 = false;
            if (arg3 < 76) {
                field6451 = 118;
            }
            float var14 = Float.MAX_VALUE;
            float var15 = -3.4028235E38F;
            float var16 = Float.MAX_VALUE;
            float var17 = -3.4028235E38F;
            int var18 = this.field6529.field2526;
            int var19 = this.field6529.field2455;
            if (!this.field6428) {
                this.method3269((byte) 90);
            }
            int var20 = this.field6430 - this.field6495 >> 1;
            int var21 = this.field6484 - this.field6524 >> 1;
            int var22 = this.field6512 - this.field6410 >> 1;
            int var23 = this.field6495 + var20;
            int var24 = this.field6524 + var21;
            int var25 = this.field6410 + var22;
            int var26 = var23 - (var20 << arg5);
            int var27 = var24 - (var21 << arg5);
            int var28 = var25 - (var22 << arg5);
            int var29 = (var20 << arg5) + var23;
            int var30 = (var21 << arg5) + var24;
            int var31 = (var22 << arg5) + var25;
            class129.field1848[0] = var26;
            class574.field8286[0] = var27;
            class429.field6756[0] = var28;
            class129.field1848[1] = var29;
            class574.field8286[1] = var27;
            class429.field6756[1] = var28;
            class129.field1848[2] = var26;
            class574.field8286[2] = var30;
            class429.field6756[2] = var28;
            class129.field1848[3] = var29;
            class574.field8286[3] = var30;
            class429.field6756[3] = var28;
            class129.field1848[4] = var26;
            class574.field8286[4] = var27;
            class429.field6756[4] = var31;
            class129.field1848[5] = var29;
            class574.field8286[5] = var27;
            class129.field1848[6] = var26;
            class429.field6756[5] = var31;
            class574.field8286[6] = var30;
            class129.field1848[7] = var29;
            class429.field6756[6] = var31;
            class574.field8286[7] = var30;
            class429.field6756[7] = var31;
            for (int var32 = 0; var32 < 8; var32++) {
                float var33 = (float) class129.field1848[var32];
                float var34 = (float) class574.field8286[var32];
                float var35 = (float) class429.field6756[var32];
                float var36 = class253.field3863 * var35 + class694.field10008 * var33 + class548.field8046 * var34 + var11;
                float var37 = class398.field6299 * var35 + class745.field10956 * var33 + class730.field10691 * var34 + var12;
                float var38 = class541.field7975 * var35 + class191.field3018 * var33 + class130.field1857 * var34 + var10;
                if ((float) this.field6529.field2512 <= var37) {
                    if (arg0 > 0) {
                        var37 = arg0;
                    }
                    float var39 = (float) var18 * var38 / var37 + (float) this.field6529.field2521;
                    if (var39 > var15) {
                        var15 = var39;
                    }
                    float var40 = (float) var19 * var36 / var37 + (float) this.field6529.field2473;
                    if (var39 < var14) {
                        var14 = var39;
                    }
                    var13 = true;
                    if (var40 > var17) {
                        var17 = var40;
                    }
                    if (var40 < var16) {
                        var16 = var40;
                    }
                }
            }
            if (var13 && var14 < (float) arg4 && (float) arg4 < var15 && (float) arg1 > var16 && (float) arg1 < var17) {
                if (arg6) {
                    return true;
                }
                if (this.field6529.field2538.length < this.field6473) {
                    this.field6529.field2543 = new int[this.field6473];
                    this.field6529.field2538 = new int[this.field6473];
                }
                int[] var41 = this.field6529.field2538;
                int[] var42 = this.field6529.field2543;
                for (int var43 = 0; var43 < this.field6480; var43++) {
                    float var44 = (float) this.field6517[var43];
                    float var45 = (float) this.field6419[var43];
                    float var46 = (float) this.field6475[var43];
                    float var47 = class398.field6299 * var44 + class745.field10956 * var45 + class730.field10691 * var46 + var12;
                    float var48 = class253.field3863 * var44 + class694.field10008 * var45 + class548.field8046 * var46 + var11;
                    float var49 = class541.field7975 * var44 + class191.field3018 * var45 + class130.field1857 * var46 + var10;
                    if ((float) this.field6529.field2512 <= var47) {
                        if (arg0 > 0) {
                            var47 = arg0;
                        }
                        int var50 = (int) ((float) var18 * var49 / var47 + (float) this.field6529.field2521);
                        int var51 = (int) ((float) var19 * var48 / var47 + (float) this.field6529.field2473);
                        int var52 = this.field6468[var43];
                        int var53 = this.field6468[var43 + 1];
                        for (int var54 = var52; var54 < var53; var54++) {
                            int var55 = this.field6530[var54] - 1;
                            if (var55 == -1) {
                                break;
                            }
                            var41[var55] = var50;
                            var42[var55] = var51;
                        }
                    } else {
                        int var56 = this.field6468[var43];
                        int var57 = this.field6468[var43 + 1];
                        for (int var58 = var56; var58 < var57; var58++) {
                            int var59 = this.field6530[var58] - 1;
                            if (var59 == -1) {
                                break;
                            }
                            var41[this.field6530[var58] - 1] = -999999;
                        }
                    }
                }
                for (int var60 = 0; var60 < this.field6450; var60++) {
                    if (var41[this.field6460[var60]] != -999999 && var41[this.field6482[var60]] != -999999 && var41[this.field6493[var60]] != -999999 && this.method3275(var41[this.field6482[var60]], var42[this.field6493[var60]], var42[this.field6482[var60]], (byte) 35, arg1, var42[this.field6460[var60]], var41[this.field6493[var60]], arg4, var41[this.field6460[var60]])) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var62) {
            throw class590.method4333(var62, field6532[17] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6532[3] : field6532[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "()Z", line = 1739)
    public final boolean method389() {
        try {
            field6431++;
            if (this.field6501 == null) {
                return true;
            }
            for (int var1 = 0; var1 < this.field6501.length; var1++) {
                if (this.field6501[var1] != -1 && !this.field6529.field864.method1417((byte) -68, this.field6501[var1])) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6532[36] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "na", descriptor = "()I", line = 1762)
    public final int method400() {
        try {
            if (!this.field6428) {
                this.method3269((byte) 76);
            }
            field6491++;
            return this.field6423;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[26] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lka;IIIZ)V", line = 1775)
    public final void method412(class499 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            field6478++;
            class407 var6 = (class407) arg0;
            if (this.field6450 != 0 && var6.field6450 != 0) {
                int var7 = var6.field6480;
                int[] var8 = var6.field6419;
                int[] var9 = var6.field6475;
                int[] var10 = var6.field6517;
                short[] var11 = var6.field6500;
                short[] var12 = var6.field6523;
                short[] var13 = var6.field6488;
                byte[] var14 = var6.field6417;
                byte[] var15;
                short[] var16;
                short[] var17;
                short[] var18;
                if (this.field6520 == null) {
                    var15 = null;
                    var16 = null;
                    var17 = null;
                    var18 = null;
                } else {
                    var15 = this.field6520.field2637;
                    var16 = this.field6520.field2634;
                    var17 = this.field6520.field2641;
                    var18 = this.field6520.field2635;
                }
                short[] var19;
                short[] var20;
                short[] var21;
                byte[] var22;
                if (var6.field6520 == null) {
                    var20 = null;
                    var21 = null;
                    var19 = null;
                    var22 = null;
                } else {
                    var19 = var6.field6520.field2641;
                    var20 = var6.field6520.field2634;
                    var21 = var6.field6520.field2635;
                    var22 = var6.field6520.field2637;
                }
                int[] var23 = var6.field6468;
                short[] var24 = var6.field6530;
                if (!var6.field6428) {
                    var6.method3269((byte) 123);
                }
                short var25 = var6.field6524;
                short var26 = var6.field6484;
                short var27 = var6.field6495;
                short var28 = var6.field6430;
                short var29 = var6.field6410;
                short var30 = var6.field6512;
                for (int var31 = 0; var31 < this.field6480; var31++) {
                    int var32 = this.field6475[var31] - arg2;
                    if (var32 >= var25 && var32 <= var26) {
                        int var33 = this.field6419[var31] - arg1;
                        if (var33 >= var27 && var33 <= var28) {
                            int var34 = this.field6517[var31] - arg3;
                            if (var29 <= var34 && var30 >= var34) {
                                int var35 = -1;
                                int var36 = this.field6468[var31];
                                int var37 = this.field6468[var31 + 1];
                                for (int var38 = var36; var38 < var37; var38++) {
                                    var35 = this.field6530[var38] - 1;
                                    if (var35 == -1 || this.field6417[var35] != 0) {
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
                                                    this.field6520 = new class163();
                                                    var17 = this.field6520.field2641 = class211.method1908(this.field6500, -82);
                                                    var16 = this.field6520.field2634 = class211.method1908(this.field6523, -49);
                                                    var18 = this.field6520.field2635 = class211.method1908(this.field6488, 97);
                                                    var15 = this.field6520.field2637 = class658.method4788(false, this.field6417);
                                                }
                                                if (var19 == null) {
                                                    class163 var44 = var6.field6520 = new class163();
                                                    var19 = var44.field2641 = class211.method1908(var11, -102);
                                                    var20 = var44.field2634 = class211.method1908(var12, 112);
                                                    var21 = var44.field2635 = class211.method1908(var13, 122);
                                                    var22 = var44.field2637 = class658.method4788(false, var14);
                                                }
                                                short var45 = this.field6500[var35];
                                                short var46 = this.field6523[var35];
                                                short var47 = this.field6488[var35];
                                                int var48 = var23[var39];
                                                byte var49 = this.field6417[var35];
                                                int var50 = var23[var39 + 1];
                                                for (int var51 = var48; var51 < var50; var51++) {
                                                    int var52 = var24[var51] - 1;
                                                    if (var52 == -1) {
                                                        break;
                                                    }
                                                    if (var22[var52] != 0) {
                                                        var19[var52] += var45;
                                                        var20[var52] += var46;
                                                        var21[var52] += var47;
                                                        var22[var52] += var49;
                                                    }
                                                }
                                                int var53 = this.field6468[var31 + 1];
                                                short var54 = var11[var42];
                                                short var55 = var13[var42];
                                                byte var56 = var14[var42];
                                                short var57 = var12[var42];
                                                int var58 = this.field6468[var31];
                                                for (int var59 = var58; var59 < var53; var59++) {
                                                    int var60 = this.field6530[var59] - 1;
                                                    if (var60 == -1) {
                                                        break;
                                                    }
                                                    if (var15[var60] != 0) {
                                                        var17[var60] += var54;
                                                        var16[var60] += var57;
                                                        var18[var60] += var55;
                                                        var15[var60] += var56;
                                                    }
                                                }
                                                if (this.field6483 == null && this.field6435 != null) {
                                                    this.field6435.field11320 = null;
                                                }
                                                if (this.field6483 != null) {
                                                    this.field6483.field11320 = null;
                                                }
                                                if (var6.field6483 == null && var6.field6435 != null) {
                                                    var6.field6435.field11320 = null;
                                                }
                                                if (var6.field6483 != null) {
                                                    var6.field6483.field11320 = null;
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
            throw class590.method4333(var62, field6532[59] + (arg0 == null ? field6532[3] : field6532[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V", line = 2043)
    public static void method3271(int arg0) {
        try {
            field6441 = null;
            if (arg0 >= -22) {
                method3266(-71, (byte) 116, -118, 58, false, 68);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[55] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lsj;Lrp;I)V", line = 2054)
    public final void method426(class486 arg0, class463 arg1, int arg2) {
        try {
            field6463++;
            if (this.field6473 != 0) {
                class680 var4 = this.field6529.field2423;
                if (!this.field6428) {
                    this.method3269((byte) 87);
                }
                class680 var5 = (class680) arg0;
                class730.field10691 = var4.field9685 * var5.field9705 + var4.field9705 * var5.field9703 + var4.field9678 * var5.field9691;
                class390.field6225 = var4.field9685 * var5.field9689 + var4.field9705 * var5.field9680 + var4.field9678 * var5.field9681 + var4.field9689;
                float var6 = (float) this.field6524 * class730.field10691 + class390.field6225;
                float var7 = (float) this.field6484 * class730.field10691 + class390.field6225;
                float var8;
                float var9;
                if (var6 > var7) {
                    var8 = (float) (-this.field6423) + var7;
                    var9 = (float) this.field6423 + var6;
                } else {
                    var9 = (float) this.field6423 + var7;
                    var8 = (float) (-this.field6423) + var6;
                }
                if (!(var8 >= this.field6529.field2468) && !(var9 <= (float) this.field6529.field2512)) {
                    class130.field1857 = var4.field9683 * var5.field9705 + var4.field9700 * var5.field9691 + var4.field9691 * var5.field9703;
                    class700.field10073 = var4.field9683 * var5.field9689 + var4.field9700 * var5.field9681 + var4.field9691 * var5.field9680 + var4.field9681;
                    float var10 = (float) this.field6524 * class130.field1857 + class700.field10073;
                    float var11 = (float) this.field6484 * class130.field1857 + class700.field10073;
                    float var12;
                    float var13;
                    if ((var10 > var11)) {
                        var12 = ((float) this.field6423 + var10) * (float) this.field6529.field2526;
                        var13 = ((float) (-this.field6423) + var11) * (float) this.field6529.field2526;
                    } else {
                        var12 = ((float) this.field6423 + var11) * (float) this.field6529.field2526;
                        var13 = ((float) (-this.field6423) + var10) * (float) this.field6529.field2526;
                    }
                    if (!(var13 / var9 >= this.field6529.field2442) && !(var12 / var9 <= this.field6529.field2484)) {
                        class548.field8046 = var4.field9698 * var5.field9705 + var4.field9703 * var5.field9703 + var4.field9675 * var5.field9691;
                        class745.field10968 = var4.field9698 * var5.field9689 + var4.field9703 * var5.field9680 + var4.field9675 * var5.field9681 + var4.field9680;
                        float var14 = (float) this.field6524 * class548.field8046 + class745.field10968;
                        float var15 = (float) this.field6484 * class548.field8046 + class745.field10968;
                        float var16;
                        float var17;
                        if (var15 < var14) {
                            var16 = ((float) this.field6423 + var14) * (float) this.field6529.field2455;
                            var17 = ((float) (-this.field6423) + var15) * (float) this.field6529.field2455;
                        } else {
                            var16 = ((float) this.field6423 + var15) * (float) this.field6529.field2455;
                            var17 = ((float) (-this.field6423) + var14) * (float) this.field6529.field2455;
                        }
                        if (!(var17 / var9 >= this.field6529.field2477) && !(this.field6529.field2501 >= var16 / var9)) {
                            if (arg1 != null || this.field6440 != null) {
                                class745.field10956 = var4.field9685 * var5.field9678 + var4.field9705 * var5.field9675 + var4.field9678 * var5.field9700;
                                class398.field6299 = var4.field9685 * var5.field9685 + var4.field9705 * var5.field9698 + var4.field9678 * var5.field9683;
                                class694.field10008 = var4.field9698 * var5.field9678 + var4.field9703 * var5.field9675 + var4.field9675 * var5.field9700;
                                class253.field3863 = var4.field9698 * var5.field9685 + var4.field9703 * var5.field9698 + var4.field9675 * var5.field9683;
                                class541.field7975 = var4.field9683 * var5.field9685 + var4.field9700 * var5.field9683 + var4.field9691 * var5.field9698;
                                class191.field3018 = var4.field9683 * var5.field9678 + var4.field9700 * var5.field9700 + var4.field9691 * var5.field9675;
                            }
                            if (arg1 != null) {
                                boolean var18 = false;
                                boolean var19 = true;
                                int var20 = this.field6495 + this.field6430 >> 1;
                                int var21 = this.field6512 + this.field6410 >> 1;
                                int var22 = (int) ((float) var21 * class541.field7975 + (float) this.field6524 * class130.field1857 + (float) var20 * class191.field3018 + class700.field10073);
                                int var23 = (int) ((float) var21 * class253.field3863 + (float) this.field6524 * class548.field8046 + (float) var20 * class694.field10008 + class745.field10968);
                                int var24 = (int) ((float) var21 * class398.field6299 + (float) this.field6524 * class730.field10691 + (float) var20 * class745.field10956 + class390.field6225);
                                if (this.field6529.field2512 <= var24) {
                                    arg1.field7117 = this.field6529.field2455 * var23 / var24 + this.field6529.field2473;
                                    arg1.field7121 = this.field6529.field2526 * var22 / var24 + this.field6529.field2521;
                                } else {
                                    var18 = true;
                                }
                                int var25 = (int) ((float) var21 * class541.field7975 + (float) this.field6484 * class130.field1857 + (float) var20 * class191.field3018 + class700.field10073);
                                int var26 = (int) ((float) var21 * class253.field3863 + (float) this.field6484 * class548.field8046 + (float) var20 * class694.field10008 + class745.field10968);
                                int var27 = (int) ((float) var21 * class398.field6299 + (float) this.field6484 * class730.field10691 + (float) var20 * class745.field10956 + class390.field6225);
                                if (var27 < this.field6529.field2512) {
                                    var18 = true;
                                } else {
                                    arg1.field7118 = this.field6529.field2526 * var25 / var27 + this.field6529.field2521;
                                    arg1.field7116 = this.field6529.field2455 * var26 / var27 + this.field6529.field2473;
                                }
                                if (var18) {
                                    if (this.field6529.field2512 > var24 && this.field6529.field2512 > var27) {
                                        var19 = false;
                                    } else if (var24 < this.field6529.field2512) {
                                        int var31 = (var27 - this.field6529.field2512 << 16) / (var27 - var24);
                                        int var32 = ((var25 - var22) * var31 >> 16) + var25;
                                        int var33 = ((var26 - var23) * var31 >> 16) + var26;
                                        arg1.field7121 = this.field6529.field2526 * var32 / this.field6529.field2512 + this.field6529.field2521;
                                        arg1.field7117 = this.field6529.field2455 * var33 / this.field6529.field2512 + this.field6529.field2473;
                                    } else if (this.field6529.field2512 > var27) {
                                        int var28 = (var24 - this.field6529.field2512 << 16) / (var24 - var27);
                                        int var29 = ((var22 - var25) * var28 >> 16) + var22;
                                        int var30 = ((var23 - var26) * var28 >> 16) + var23;
                                        arg1.field7121 = this.field6529.field2526 * var29 / this.field6529.field2512 + this.field6529.field2521;
                                        arg1.field7117 = this.field6529.field2455 * var30 / this.field6529.field2512 + this.field6529.field2473;
                                    }
                                }
                                if (var19) {
                                    arg1.field7120 = true;
                                    if (var27 >= var24) {
                                        arg1.field7119 = (var25 + this.field6423) * this.field6529.field2526 / var27 + this.field6529.field2521 - arg1.field7118;
                                    } else {
                                        arg1.field7119 = (this.field6423 + var22) * this.field6529.field2526 / var24 + this.field6529.field2521 - arg1.field7121;
                                    }
                                }
                            }
                            this.field6529.method1499(16);
                            this.field6529.method1501(var5, (byte) 4);
                            this.method3277((byte) -112);
                            this.field6529.method1437(-1);
                            this.method3272(-36297049);
                        }
                    }
                }
            }
        } catch (RuntimeException var35) {
            throw class590.method4333(var35, field6532[28] + (arg0 == null ? field6532[3] : field6532[2]) + ',' + (arg1 == null ? field6532[3] : field6532[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "wa", descriptor = "()V", line = 2258)
    public final void method432() {
        try {
            for (int var1 = 0; var1 < this.field6477; var1++) {
                this.field6419[var1] = this.field6419[var1] + 7 >> 4;
                this.field6475[var1] = this.field6475[var1] + 7 >> 4;
                this.field6517[var1] = this.field6517[var1] + 7 >> 4;
            }
            field6469++;
            if (this.field6531 != null) {
                this.field6531.field11320 = null;
            }
            this.field6428 = false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6532[33] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V", line = 2282)
    private final void method3272(int arg0) {
        try {
            if (arg0 == -36297049) {
                field6489++;
                if (this.field6440 != null) {
                    class680 var2 = this.field6529.field2388;
                    this.field6529.method1422((byte) 73);
                    this.field6529.method265(!this.field6414);
                    this.field6529.method1474(false, (byte) 104);
                    this.field6529.method1481(null, this.field6529.field2537, (byte) -109, this.field6529.field2472, null);
                    for (int var3 = 0; var3 < this.field6514; var3++) {
                        class208 var4 = this.field6440[var3];
                        class711 var5 = this.field6456[var3];
                        if (!var4.field3246 || !this.field6529.method167()) {
                            float var6 = (float) (this.field6419[var4.field3251] + this.field6419[var4.field3249] + this.field6419[var4.field3254]) * 0.3333333F;
                            float var7 = (float) (this.field6475[var4.field3254] + this.field6475[var4.field3251] + this.field6475[var4.field3249]) * 0.3333333F;
                            float var8 = (float) (this.field6517[var4.field3251] + this.field6517[var4.field3249] + this.field6517[var4.field3254]) * 0.3333333F;
                            float var9 = class541.field7975 * var8 + class191.field3018 * var6 + class130.field1857 * var7 + class700.field10073;
                            float var10 = class253.field3863 * var8 + class694.field10008 * var6 + class548.field8046 * var7 + class745.field10968;
                            float var11 = class398.field6299 * var8 + class745.field10956 * var6 + class730.field10691 * var7 + class390.field6225;
                            float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field3247;
                            var2.method4954(var4.field3253 * var5.field10287 >> 7, var4.field3252 * var5.field10288 >> 7, (float) var5.field10293 + var9 - var9 * var12, var10 * var12 + ((float) var5.field10285 - var10), -20, var11 * var12 - var11, var5.field10291);
                            this.field6529.method1423(var2, 0);
                            int var13 = var5.field10296;
                            OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                            this.field6529.method1447(var4.field3245, 20014);
                            this.field6529.method1482(arg0 + 36310419, var4.field3250);
                            this.field6529.method1450(0, 7, 34200, 4);
                        }
                    }
                    this.field6529.method265(true);
                    this.field6529.method1437(arg0 ^ 0x229D958);
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field6532[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "()V", line = 2342)
    public final void method428() {
        try {
            field6513++;
            if (this.field6473 > 0 && this.field6415 > 0) {
                this.method3263((byte) -105, false);
                if ((this.field6518 & 0x10) == 0 && this.field6490.field9963 == null) {
                    this.method3268(false, (byte) -99);
                }
                this.method3265(-884909049);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[54] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "(I[IIIIZI[I)V", line = 2357)
    public final void method387(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        try {
            field6486++;
            int var9 = arg1.length;
            if (arg0 == 0) {
                arg4 <<= 0x4;
                arg3 <<= 0x4;
                arg2 <<= 0x4;
                class38.field429 = 0;
                class459.field7081 = 0;
                class655.field9379 = 0;
                int var10 = 0;
                for (int var11 = 0; var11 < var9; var11++) {
                    int var12 = arg1[var11];
                    if (var12 < this.field6487.length) {
                        int[] var13 = this.field6487[var12];
                        for (int var14 = 0; var14 < var13.length; var14++) {
                            int var15 = var13[var14];
                            if (this.field6499 == null || (this.field6499[var15] & arg6) != 0) {
                                class459.field7081 += this.field6419[var15];
                                class38.field429 += this.field6475[var15];
                                class655.field9379 += this.field6517[var15];
                                var10++;
                            }
                        }
                    }
                }
                if (var10 > 0) {
                    class38.field429 = class38.field429 / var10 + arg3;
                    class459.field7081 = class459.field7081 / var10 + arg2;
                    class181.field2892 = true;
                    class655.field9379 = class655.field9379 / var10 + arg4;
                } else {
                    class459.field7081 = arg2;
                    class38.field429 = arg3;
                    class655.field9379 = arg4;
                }
            } else if (arg0 == 1) {
                if (arg7 != null) {
                    int var16 = arg7[0] * arg2 + arg7[1] * arg3 + (arg7[2] * arg4) + 8192 >> 14;
                    int var17 = arg7[3] * arg2 + arg7[4] * arg3 + (arg7[5] * arg4) + 8192 >> 14;
                    int var18 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
                    arg3 = var17;
                    arg2 = var16;
                    arg4 = var18;
                }
                arg4 <<= 0x4;
                arg3 <<= 0x4;
                arg2 <<= 0x4;
                for (int var19 = 0; var19 < var9; var19++) {
                    int var20 = arg1[var19];
                    if (var20 < this.field6487.length) {
                        int[] var21 = this.field6487[var20];
                        for (int var22 = 0; var22 < var21.length; var22++) {
                            int var23 = var21[var22];
                            if (this.field6499 == null || (this.field6499[var23] & arg6) != 0) {
                                this.field6419[var23] += arg2;
                                this.field6475[var23] += arg3;
                                this.field6517[var23] += arg4;
                            }
                        }
                    }
                }
            } else if (arg0 == 2) {
                if (arg7 == null) {
                    for (int var84 = 0; var84 < var9; var84++) {
                        int var85 = arg1[var84];
                        if (this.field6487.length > var85) {
                            int[] var86 = this.field6487[var85];
                            for (int var87 = 0; var87 < var86.length; var87++) {
                                int var88 = var86[var87];
                                if (this.field6499 == null || (arg6 & this.field6499[var88]) != 0) {
                                    this.field6419[var88] -= class459.field7081;
                                    this.field6475[var88] -= class38.field429;
                                    this.field6517[var88] -= class655.field9379;
                                    if (arg4 != 0) {
                                        int var89 = class763.field11199[arg4];
                                        int var90 = class763.field11200[arg4];
                                        int var91 = this.field6475[var88] * var89 + this.field6419[var88] * var90 + 16383 >> 14;
                                        this.field6475[var88] = this.field6475[var88] * var90 + 16383 - (this.field6419[var88] * var89) >> 14;
                                        this.field6419[var88] = var91;
                                    }
                                    if (arg2 != 0) {
                                        int var92 = class763.field11199[arg2];
                                        int var93 = class763.field11200[arg2];
                                        int var94 = this.field6475[var88] * var93 + 16383 - (this.field6517[var88] * var92) >> 14;
                                        this.field6517[var88] = this.field6517[var88] * var93 + this.field6475[var88] * var92 + 16383 >> 14;
                                        this.field6475[var88] = var94;
                                    }
                                    if (arg3 != 0) {
                                        int var95 = class763.field11199[arg3];
                                        int var96 = class763.field11200[arg3];
                                        int var97 = this.field6517[var88] * var95 + this.field6419[var88] * var96 + 16383 >> 14;
                                        this.field6517[var88] = this.field6517[var88] * var96 + 16383 - (this.field6419[var88] * var95) >> 14;
                                        this.field6419[var88] = var97;
                                    }
                                    this.field6419[var88] += class459.field7081;
                                    this.field6475[var88] += class38.field429;
                                    this.field6517[var88] += class655.field9379;
                                }
                            }
                        }
                    }
                    if (arg5) {
                        for (int var98 = 0; var98 < var9; var98++) {
                            int var99 = arg1[var98];
                            if (this.field6487.length > var99) {
                                int[] var100 = this.field6487[var99];
                                for (int var101 = 0; var101 < var100.length; var101++) {
                                    int var102 = var100[var101];
                                    if (this.field6499 == null || (this.field6499[var102] & arg6) != 0) {
                                        int var103 = this.field6468[var102];
                                        int var104 = this.field6468[var102 + 1];
                                        for (int var105 = var103; var105 < var104; var105++) {
                                            int var106 = this.field6530[var105] - 1;
                                            if (var106 == -1) {
                                                break;
                                            }
                                            if (arg4 != 0) {
                                                int var107 = class763.field11199[arg4];
                                                int var108 = class763.field11200[arg4];
                                                int var109 = this.field6523[var106] * var107 + this.field6500[var106] * var108 + 16383 >> 14;
                                                this.field6523[var106] = (short) (this.field6523[var106] * var108 + 16383 - (this.field6500[var106] * var107) >> 14);
                                                this.field6500[var106] = (short) var109;
                                            }
                                            if (arg2 != 0) {
                                                int var110 = class763.field11199[arg2];
                                                int var111 = class763.field11200[arg2];
                                                int var112 = this.field6523[var106] * var111 + (16383 - (this.field6488[var106] * var110)) >> 14;
                                                this.field6488[var106] = (short) (this.field6523[var106] * var110 + this.field6488[var106] * var111 + 16383 >> 14);
                                                this.field6523[var106] = (short) var112;
                                            }
                                            if (arg3 != 0) {
                                                int var113 = class763.field11199[arg3];
                                                int var114 = class763.field11200[arg3];
                                                int var115 = this.field6488[var106] * var113 + (this.field6500[var106] * var114) + 16383 >> 14;
                                                this.field6488[var106] = (short) (this.field6488[var106] * var114 + 16383 - (this.field6500[var106] * var113) >> 14);
                                                this.field6500[var106] = (short) var115;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (this.field6483 == null && this.field6435 != null) {
                            this.field6435.field11320 = null;
                        }
                        if (this.field6483 != null) {
                            this.field6483.field11320 = null;
                        }
                    }
                } else {
                    int var24 = arg7[9] << 4;
                    int var25 = arg7[10] << 4;
                    int var26 = arg7[11] << 4;
                    int var27 = arg7[12] << 4;
                    int var28 = arg7[13] << 4;
                    int var29 = arg7[14] << 4;
                    if (class181.field2892) {
                        int var30 = arg7[6] * class655.field9379 + arg7[3] * class38.field429 + arg7[0] * class459.field7081 + 8192 >> 14;
                        int var31 = arg7[1] * class459.field7081 + arg7[4] * class38.field429 - (-(arg7[7] * class655.field9379) + -8192) >> 14;
                        int var32 = var28 + var31;
                        int var33 = arg7[2] * class459.field7081 + (arg7[5] * class38.field429) + arg7[8] * class655.field9379 + 8192 >> 14;
                        int var34 = var27 + var30;
                        int var35 = var29 + var33;
                        class38.field429 = var32;
                        class459.field7081 = var34;
                        class181.field2892 = false;
                        class655.field9379 = var35;
                    }
                    int[] var36 = new int[9];
                    int var37 = class763.field11200[arg2];
                    int var38 = class763.field11199[arg2];
                    int var39 = class763.field11200[arg3];
                    int var40 = class763.field11199[arg3];
                    int var41 = class763.field11200[arg4];
                    int var42 = class763.field11199[arg4];
                    int var43 = var38 * var41 + 8192 >> 14;
                    int var44 = var38 * var42 + 8192 >> 14;
                    var36[8] = var37 * var39 + 8192 >> 14;
                    var36[7] = var39 * var43 + (var40 * var42 + 8192) >> 14;
                    var36[1] = -var39 * var42 - (-(var40 * var43) - 8192) >> 14;
                    var36[6] = -var40 * var41 + (var39 * var44) + 8192 >> 14;
                    var36[5] = -var38;
                    var36[2] = var37 * var40 + 8192 >> 14;
                    var36[4] = var37 * var41 + 8192 >> 14;
                    var36[0] = var40 * var44 + var39 * var41 + 8192 >> 14;
                    var36[3] = var37 * var42 + 8192 >> 14;
                    int var45 = var36[2] * -class655.field9379 + var36[0] * -class459.field7081 + (var36[1] * -class38.field429) + 8192 >> 14;
                    int var46 = var36[5] * -class655.field9379 + var36[4] * -class38.field429 + var36[3] * -class459.field7081 + 8192 >> 14;
                    int var47 = var36[6] * -class459.field7081 + var36[8] * -class655.field9379 + (var36[7] * -class38.field429) + 8192 >> 14;
                    int var48 = var45 + class459.field7081;
                    int var49 = var46 + class38.field429;
                    int var50 = var47 + class655.field9379;
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
                    int var56 = var36[0] * var27 + var36[1] * var28 + (var36[2] * var29) + 8192 >> 14;
                    int var57 = var36[5] * var29 + var36[3] * var27 + var36[4] * var28 + 8192 >> 14;
                    int var58 = var48 + var56;
                    int var59 = var49 + var57;
                    int var60 = var36[7] * var28 + (var36[6] * var27 + var36[8] * var29 + 8192) >> 14;
                    int var61 = var50 + var60;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 3; var63++) {
                        for (int var64 = 0; var64 < 3; var64++) {
                            int var65 = 0;
                            for (int var66 = 0; var66 < 3; var66++) {
                                var65 += var51[var64 + (var66 * 3)] * arg7[var63 * 3 + var66];
                            }
                            var62[var63 * 3 + var64] = var65 + 8192 >> 14;
                        }
                    }
                    int var67 = arg7[1] * var59 + arg7[0] * var58 + arg7[2] * var61 + 8192 >> 14;
                    int var68 = arg7[3] * var58 + arg7[4] * var59 + arg7[5] * var61 + 8192 >> 14;
                    int var69 = arg7[6] * var58 + 8192 - (-(arg7[7] * var59) - arg7[8] * var61) >> 14;
                    int var70 = var24 + var67;
                    int var71 = var25 + var68;
                    int var72 = var26 + var69;
                    for (int var73 = 0; var73 < var9; var73++) {
                        int var74 = arg1[var73];
                        if (var74 < this.field6487.length) {
                            int[] var75 = this.field6487[var74];
                            for (int var76 = 0; var76 < var75.length; var76++) {
                                int var77 = var75[var76];
                                if (this.field6499 == null || (this.field6499[var77] & arg6) != 0) {
                                    int var78 = this.field6517[var77] * var62[2] + (this.field6419[var77] * var62[0] - (-(this.field6475[var77] * var62[1]) - 8192)) >> 14;
                                    int var79 = this.field6517[var77] * var62[5] + (this.field6419[var77] * var62[3] + (this.field6475[var77] * var62[4])) + 8192 >> 14;
                                    int var80 = var71 + var79;
                                    int var81 = var70 + var78;
                                    int var82 = this.field6475[var77] * var62[7] + this.field6517[var77] * var62[8] + this.field6419[var77] * var62[6] + 8192 >> 14;
                                    this.field6419[var77] = var81;
                                    int var83 = var72 + var82;
                                    this.field6475[var77] = var80;
                                    this.field6517[var77] = var83;
                                }
                            }
                        }
                    }
                }
            } else if (arg0 == 3) {
                if (arg7 == null) {
                    for (int var116 = 0; var116 < var9; var116++) {
                        int var117 = arg1[var116];
                        if (var117 < this.field6487.length) {
                            int[] var118 = this.field6487[var117];
                            for (int var119 = 0; var119 < var118.length; var119++) {
                                int var120 = var118[var119];
                                if (this.field6499 == null || (arg6 & this.field6499[var120]) != 0) {
                                    this.field6419[var120] -= class459.field7081;
                                    this.field6475[var120] -= class38.field429;
                                    this.field6517[var120] -= class655.field9379;
                                    this.field6419[var120] = this.field6419[var120] * arg2 >> 7;
                                    this.field6475[var120] = this.field6475[var120] * arg3 >> 7;
                                    this.field6517[var120] = this.field6517[var120] * arg4 >> 7;
                                    this.field6419[var120] += class459.field7081;
                                    this.field6475[var120] += class38.field429;
                                    this.field6517[var120] += class655.field9379;
                                }
                            }
                        }
                    }
                } else {
                    int var121 = arg7[9] << 4;
                    int var122 = arg7[10] << 4;
                    int var123 = arg7[11] << 4;
                    int var124 = arg7[12] << 4;
                    int var125 = arg7[13] << 4;
                    int var126 = arg7[14] << 4;
                    if (class181.field2892) {
                        int var127 = arg7[6] * class655.field9379 + (arg7[0] * class459.field7081 + (arg7[3] * class38.field429)) + 8192 >> 14;
                        int var128 = arg7[7] * class655.field9379 + arg7[1] * class459.field7081 + (arg7[4] * class38.field429) + 8192 >> 14;
                        int var129 = arg7[5] * class38.field429 + arg7[2] * class459.field7081 + arg7[8] * class655.field9379 + 8192 >> 14;
                        int var130 = var125 + var128;
                        int var131 = var124 + var127;
                        class459.field7081 = var131;
                        int var132 = var126 + var129;
                        class38.field429 = var130;
                        class655.field9379 = var132;
                        class181.field2892 = false;
                    }
                    int var133 = arg2 << 15 >> 7;
                    int var134 = arg3 << 15 >> 7;
                    int var135 = arg4 << 15 >> 7;
                    int var136 = -class459.field7081 * var133 + 8192 >> 14;
                    int var137 = -class38.field429 * var134 + 8192 >> 14;
                    int var138 = -class655.field9379 * var135 + 8192 >> 14;
                    int var139 = var136 + class459.field7081;
                    int var140 = var137 + class38.field429;
                    int var141 = var138 + class655.field9379;
                    int[] var142 = new int[] { arg7[0] * var133 + 8192 >> 14, arg7[3] * var133 + 8192 >> 14, arg7[6] * var133 + 8192 >> 14, arg7[1] * var134 + 8192 >> 14, arg7[4] * var134 + 8192 >> 14, arg7[7] * var134 + 8192 >> 14, arg7[2] * var135 + 8192 >> 14, arg7[5] * var135 + 8192 >> 14, arg7[8] * var135 + 8192 >> 14 };
                    int var143 = var124 * var133 + 8192 >> 14;
                    int var144 = var125 * var134 + 8192 >> 14;
                    int var145 = var139 + var143;
                    int var146 = var126 * var135 + 8192 >> 14;
                    int var147 = var140 + var144;
                    int var148 = var141 + var146;
                    int[] var149 = new int[9];
                    for (int var150 = 0; var150 < 3; var150++) {
                        for (int var151 = 0; var151 < 3; var151++) {
                            int var152 = 0;
                            for (int var153 = 0; var153 < 3; var153++) {
                                var152 += var142[var151 + (var153 * 3)] * arg7[var150 * 3 + var153];
                            }
                            var149[var150 * 3 + var151] = var152 + 8192 >> 14;
                        }
                    }
                    int var154 = arg7[2] * var148 + arg7[0] * var145 + arg7[1] * var147 + 8192 >> 14;
                    int var155 = arg7[5] * var148 + arg7[3] * var145 + arg7[4] * var147 + 8192 >> 14;
                    int var156 = var121 + var154;
                    int var157 = arg7[6] * var145 + (arg7[7] * var147 - (-(arg7[8] * var148) - 8192)) >> 14;
                    int var158 = var122 + var155;
                    int var159 = var123 + var157;
                    for (int var160 = 0; var160 < var9; var160++) {
                        int var161 = arg1[var160];
                        if (this.field6487.length > var161) {
                            int[] var162 = this.field6487[var161];
                            for (int var163 = 0; var163 < var162.length; var163++) {
                                int var164 = var162[var163];
                                if (this.field6499 == null || (this.field6499[var164] & arg6) != 0) {
                                    int var165 = this.field6475[var164] * var149[1] + this.field6517[var164] * var149[2] + this.field6419[var164] * var149[0] + 8192 >> 14;
                                    int var166 = this.field6517[var164] * var149[5] + this.field6475[var164] * var149[4] + this.field6419[var164] * var149[3] + 8192 >> 14;
                                    int var167 = this.field6419[var164] * var149[6] + this.field6475[var164] * var149[7] + this.field6517[var164] * var149[8] + 8192 >> 14;
                                    int var168 = var156 + var165;
                                    int var169 = var158 + var166;
                                    int var170 = var159 + var167;
                                    this.field6419[var164] = var168;
                                    this.field6475[var164] = var169;
                                    this.field6517[var164] = var170;
                                }
                            }
                        }
                    }
                }
            } else if (arg0 == 5) {
                if (this.field6420 != null) {
                    for (int var171 = 0; var171 < var9; var171++) {
                        int var172 = arg1[var171];
                        if (this.field6420.length > var172) {
                            int[] var173 = this.field6420[var172];
                            for (int var174 = 0; var174 < var173.length; var174++) {
                                int var175 = var173[var174];
                                if (this.field6425 == null || (arg6 & this.field6425[var175]) != 0) {
                                    int var176 = (this.field6446[var175] & 0xFF) + arg2 * 8;
                                    if (var176 < 0) {
                                        var176 = 0;
                                    } else if (var176 > 255) {
                                        var176 = 255;
                                    }
                                    this.field6446[var175] = (byte) var176;
                                    if (this.field6435 != null) {
                                        this.field6435.field11320 = null;
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6440 != null) {
                        for (int var177 = 0; var177 < this.field6514; var177++) {
                            class208 var178 = this.field6440[var177];
                            class711 var179 = this.field6456[var177];
                            var179.field10296 = 255 - (this.field6446[var178.field3255] & 0xFF) << 24 | var179.field10296 & 0xFFFFFF;
                        }
                    }
                }
            } else if (arg0 == 7) {
                if (this.field6420 != null) {
                    for (int var180 = 0; var180 < var9; var180++) {
                        int var181 = arg1[var180];
                        if (var181 < this.field6420.length) {
                            int[] var182 = this.field6420[var181];
                            for (int var183 = 0; var183 < var182.length; var183++) {
                                int var184 = var182[var183];
                                if (this.field6425 == null || (this.field6425[var184] & arg6) != 0) {
                                    int var185 = this.field6458[var184] & 0xFFFF;
                                    int var186 = var185 >> 10 & 0x3F;
                                    int var187 = var185 >> 7 & 0x7;
                                    int var188 = arg3 / 4 + var187;
                                    int var189 = var185 & 0x7F;
                                    int var190 = var186 + arg2 & 0x3F;
                                    if (var188 < 0) {
                                        var188 = 0;
                                    } else if (var188 > 7) {
                                        var188 = 7;
                                    }
                                    int var191 = arg4 + var189;
                                    if (var191 < 0) {
                                        var191 = 0;
                                    } else if (var191 > 127) {
                                        var191 = 127;
                                    }
                                    this.field6458[var184] = (short) class553.method4099(var191, class553.method4099(var188 << 7, var190 << 10));
                                    if (this.field6435 != null) {
                                        this.field6435.field11320 = null;
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6440 != null) {
                        for (int var192 = 0; var192 < this.field6514; var192++) {
                            class208 var193 = this.field6440[var192];
                            class711 var194 = this.field6456[var192];
                            var194.field10296 = class613.field8810[this.field6458[var193.field3255] & 0xFFFF] & 0xFFFFFF | var194.field10296 & 0xFF000000;
                        }
                    }
                }
            } else if (arg0 == 8) {
                if (this.field6452 != null) {
                    for (int var195 = 0; var195 < var9; var195++) {
                        int var196 = arg1[var195];
                        if (var196 < this.field6452.length) {
                            int[] var197 = this.field6452[var196];
                            for (int var198 = 0; var198 < var197.length; var198++) {
                                class711 var199 = this.field6456[var197[var198]];
                                var199.field10293 += arg2;
                                var199.field10285 += arg3;
                            }
                        }
                    }
                }
            } else if (arg0 == 10) {
                if (this.field6452 != null) {
                    for (int var200 = 0; var200 < var9; var200++) {
                        int var201 = arg1[var200];
                        if (var201 < this.field6452.length) {
                            int[] var202 = this.field6452[var201];
                            for (int var203 = 0; var203 < var202.length; var203++) {
                                class711 var204 = this.field6456[var202[var203]];
                                var204.field10287 = var204.field10287 * arg3 >> 7;
                                var204.field10288 = var204.field10288 * arg2 >> 7;
                            }
                        }
                    }
                }
            } else if (arg0 == 9 && this.field6452 != null) {
                for (int var205 = 0; var205 < var9; var205++) {
                    int var206 = arg1[var205];
                    if (this.field6452.length > var206) {
                        int[] var207 = this.field6452[var206];
                        for (int var208 = 0; var208 < var207.length; var208++) {
                            class711 var209 = this.field6456[var207[var208]];
                            var209.field10291 = var209.field10291 + arg2 & 0x3FFF;
                        }
                    }
                }
            }
        } catch (RuntimeException var211) {
            throw class590.method4333(var211, field6532[61] + arg0 + ',' + (arg1 == null ? field6532[3] : field6532[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field6532[3] : field6532[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 3346)
    public static final int method3273(boolean arg0, String arg1) {
        try {
            field6504++;
            int var2 = arg1.length();
            int var3 = 0;
            if (arg0) {
                for (int var4 = 0; var4 < var2; var4++) {
                    var3 = (var3 << 5) + arg1.charAt(var4) - var3;
                }
                return var3;
            } else {
                return 122;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6532[53] + arg0 + ',' + (arg1 == null ? field6532[3] : field6532[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "()[Lui;", line = 3372)
    public final class239[] method392() {
        try {
            field6439++;
            return this.field6511;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[21] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "aa", descriptor = "(SS)V", line = 3386)
    public final void method431(short arg0, short arg1) {
        try {
            field6519++;
            class158 var3 = this.field6529.field864;
            for (int var4 = 0; var4 < this.field6450; var4++) {
                if (arg0 == this.field6501[var4]) {
                    this.field6501[var4] = arg1;
                }
            }
            byte var5 = 0;
            byte var6 = 0;
            if (arg0 != -1) {
                class304 var7 = var3.method1419(arg0 & 0xFFFF, -111);
                var5 = var7.field4893;
                var6 = var7.field4905;
            }
            byte var8 = 0;
            byte var9 = 0;
            if (arg1 != -1) {
                class304 var10 = var3.method1419(arg1 & 0xFFFF, -85);
                var8 = var10.field4893;
                if (var10.field4899 != 0 || var10.field4902 != 0) {
                    this.field6462 = true;
                }
                var9 = var10.field4905;
            }
            if (var5 != var8 | var6 != var9) {
                if (this.field6440 != null) {
                    for (int var11 = 0; var11 < this.field6514; var11++) {
                        class208 var12 = this.field6440[var11];
                        class711 var13 = this.field6456[var11];
                        var13.field10296 = class613.field8810[this.field6458[var12.field3255] & 0xFFFF] & 0xFFFFFF | var13.field10296 & 0xFF000000;
                    }
                }
                if (this.field6435 != null) {
                    this.field6435.field11320 = null;
                    return;
                }
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field6532[47] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "()[Lok;", line = 3467)
    public final class265[] method408() {
        try {
            field6472++;
            return this.field6448;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[15] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "()Z", line = 3478)
    public final boolean method407() {
        try {
            field6479++;
            return this.field6414;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[35] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "()V", line = 3488)
    public final void method436() {
        try {
            field6515++;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[37] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILbp;ZZLbp;)Lka;", line = 3495)
    private final class499 method3274(int arg0, int arg1, class407 arg2, boolean arg3, boolean arg4, class407 arg5) {
        try {
            arg2.field6444 = this.field6444;
            arg2.field6415 = this.field6415;
            field6516++;
            arg2.field6473 = this.field6473;
            arg2.field6480 = this.field6480;
            arg2.field6412 = this.field6412;
            arg2.field6510 = arg0;
            arg2.field6477 = this.field6477;
            if (arg1 != -20624) {
                return null;
            }
            if ((arg0 & 0x100) == 0) {
                arg2.field6414 = this.field6414;
            } else {
                arg2.field6414 = true;
            }
            arg2.field6450 = this.field6450;
            arg2.field6461 = this.field6461;
            arg2.field6462 = this.field6462;
            arg2.field6518 = 0;
            arg2.field6514 = this.field6514;
            boolean var7 = class46.method465(arg0, -6635, this.field6461);
            boolean var8 = class663.method4810(-1085436191, arg0, this.field6461);
            boolean var9 = class356.method2946(arg1 + 20676, this.field6461, arg0);
            boolean var10 = var9 | var8 | var7;
            if (var10) {
                if (!var7) {
                    arg2.field6419 = this.field6419;
                } else if (arg5.field6419 == null || this.field6477 > arg5.field6419.length) {
                    arg2.field6419 = arg5.field6419 = new int[this.field6477];
                } else {
                    arg2.field6419 = arg5.field6419;
                }
                if (!var8) {
                    arg2.field6475 = this.field6475;
                } else if (arg5.field6475 == null || this.field6477 > arg5.field6475.length) {
                    arg2.field6475 = arg5.field6475 = new int[this.field6477];
                } else {
                    arg2.field6475 = arg5.field6475;
                }
                if (!var9) {
                    arg2.field6517 = this.field6517;
                } else if (arg5.field6517 == null || this.field6477 > arg5.field6517.length) {
                    arg2.field6517 = arg5.field6517 = new int[this.field6477];
                } else {
                    arg2.field6517 = arg5.field6517;
                }
                for (int var11 = 0; var11 < this.field6477; var11++) {
                    if (var7) {
                        arg2.field6419[var11] = this.field6419[var11];
                    }
                    if (var8) {
                        arg2.field6475[var11] = this.field6475[var11];
                    }
                    if (var9) {
                        arg2.field6517[var11] = this.field6517[var11];
                    }
                }
            } else {
                arg2.field6517 = this.field6517;
                arg2.field6419 = this.field6419;
                arg2.field6475 = this.field6475;
            }
            if (class639.method4622(this.field6461, (byte) -126, arg0)) {
                if (arg4) {
                    arg2.field6518 = (byte) (arg2.field6518 | 0x1);
                }
                arg2.field6531 = arg5.field6531;
                arg2.field6531.field11320 = this.field6531.field11320;
                arg2.field6531.field11324 = this.field6531.field11324;
            } else if (class740.method5385(arg0, this.field6461, (byte) 102)) {
                arg2.field6531 = this.field6531;
            } else {
                arg2.field6531 = null;
            }
            if (class763.method5508(this.field6461, arg0, -128)) {
                if (arg5.field6458 == null || this.field6450 > arg5.field6458.length) {
                    arg2.field6458 = arg5.field6458 = new short[this.field6450];
                } else {
                    arg2.field6458 = arg5.field6458;
                }
                for (int var12 = 0; var12 < this.field6450; var12++) {
                    arg2.field6458[var12] = this.field6458[var12];
                }
            } else {
                arg2.field6458 = this.field6458;
            }
            if (class269.method2323(1048832, this.field6461, arg0)) {
                if (arg5.field6446 == null || this.field6450 > arg5.field6446.length) {
                    arg2.field6446 = arg5.field6446 = new byte[this.field6450];
                } else {
                    arg2.field6446 = arg5.field6446;
                }
                for (int var13 = 0; var13 < this.field6450; var13++) {
                    arg2.field6446[var13] = this.field6446[var13];
                }
            } else {
                arg2.field6446 = this.field6446;
            }
            if (class553.method4098(arg1 ^ 0x4E25, arg0, this.field6461)) {
                arg2.field6435 = arg5.field6435;
                if (arg4) {
                    arg2.field6518 = (byte) (arg2.field6518 | 0x2);
                }
                arg2.field6435.field11324 = this.field6435.field11324;
                arg2.field6435.field11320 = this.field6435.field11320;
            } else if (class75.method784(arg0, this.field6461, -65536)) {
                arg2.field6435 = this.field6435;
            } else {
                arg2.field6435 = null;
            }
            if (class319.method2736((byte) 114, arg0, this.field6461)) {
                if (arg5.field6500 == null || arg5.field6500.length < this.field6473) {
                    int var14 = this.field6473;
                    arg2.field6500 = arg5.field6500 = new short[var14];
                    arg2.field6523 = arg5.field6523 = new short[var14];
                    arg2.field6488 = arg5.field6488 = new short[var14];
                } else {
                    arg2.field6523 = arg5.field6523;
                    arg2.field6500 = arg5.field6500;
                    arg2.field6488 = arg5.field6488;
                }
                if (this.field6520 == null) {
                    for (int var15 = 0; var15 < this.field6473; var15++) {
                        arg2.field6500[var15] = this.field6500[var15];
                        arg2.field6523[var15] = this.field6523[var15];
                        arg2.field6488[var15] = this.field6488[var15];
                    }
                } else {
                    if (arg5.field6520 == null) {
                        arg5.field6520 = new class163();
                    }
                    class163 var16 = arg2.field6520 = arg5.field6520;
                    if (var16.field2641 == null || var16.field2641.length < this.field6473) {
                        int var17 = this.field6473;
                        var16.field2634 = new short[var17];
                        var16.field2641 = new short[var17];
                        var16.field2635 = new short[var17];
                        var16.field2637 = new byte[var17];
                    }
                    for (int var18 = 0; var18 < this.field6473; var18++) {
                        arg2.field6500[var18] = this.field6500[var18];
                        arg2.field6523[var18] = this.field6523[var18];
                        arg2.field6488[var18] = this.field6488[var18];
                        var16.field2641[var18] = this.field6520.field2641[var18];
                        var16.field2634[var18] = this.field6520.field2634[var18];
                        var16.field2635[var18] = this.field6520.field2635[var18];
                        var16.field2637[var18] = this.field6520.field2637[var18];
                    }
                }
                arg2.field6417 = this.field6417;
            } else {
                arg2.field6417 = this.field6417;
                arg2.field6500 = this.field6500;
                arg2.field6520 = this.field6520;
                arg2.field6488 = this.field6488;
                arg2.field6523 = this.field6523;
            }
            if (class359.method2972(arg0, this.field6461, -1298)) {
                if (arg4) {
                    arg2.field6518 = (byte) (arg2.field6518 | 0x4);
                }
                arg2.field6483 = arg5.field6483;
                arg2.field6483.field11320 = this.field6483.field11320;
                arg2.field6483.field11324 = this.field6483.field11324;
            } else if (class525.method3925(this.field6461, arg0, (byte) -4)) {
                arg2.field6483 = this.field6483;
            } else {
                arg2.field6483 = null;
            }
            if (class625.method4565(arg0, 22206, this.field6461)) {
                if (arg5.field6424 == null || arg5.field6424.length < this.field6450) {
                    int var19 = this.field6473;
                    arg2.field6424 = arg5.field6424 = new float[var19];
                    arg2.field6474 = arg5.field6474 = new float[var19];
                } else {
                    arg2.field6424 = arg5.field6424;
                    arg2.field6474 = arg5.field6474;
                }
                for (int var20 = 0; var20 < this.field6473; var20++) {
                    arg2.field6424[var20] = this.field6424[var20];
                    arg2.field6474[var20] = this.field6474[var20];
                }
            } else {
                arg2.field6474 = this.field6474;
                arg2.field6424 = this.field6424;
            }
            if (class574.method4220(arg0, this.field6461, 94)) {
                if (arg4) {
                    arg2.field6518 = (byte) (arg2.field6518 | 0x8);
                }
                arg2.field6436 = arg5.field6436;
                arg2.field6436.field11320 = this.field6436.field11320;
                arg2.field6436.field11324 = this.field6436.field11324;
            } else if (class370.method3045(arg0, (byte) 62, this.field6461)) {
                arg2.field6436 = this.field6436;
            } else {
                arg2.field6436 = null;
            }
            if (class344.method2887(this.field6461, -30958, arg0)) {
                if (arg5.field6460 == null || arg5.field6460.length < this.field6450) {
                    int var21 = this.field6450;
                    arg2.field6482 = arg5.field6482 = new short[var21];
                    arg2.field6460 = arg5.field6460 = new short[var21];
                    arg2.field6493 = arg5.field6493 = new short[var21];
                } else {
                    arg2.field6493 = arg5.field6493;
                    arg2.field6460 = arg5.field6460;
                    arg2.field6482 = arg5.field6482;
                }
                for (int var22 = 0; var22 < this.field6450; var22++) {
                    arg2.field6460[var22] = this.field6460[var22];
                    arg2.field6482[var22] = this.field6482[var22];
                    arg2.field6493[var22] = this.field6493[var22];
                }
            } else {
                arg2.field6493 = this.field6493;
                arg2.field6482 = this.field6482;
                arg2.field6460 = this.field6460;
            }
            if (class133.method1253(arg0, -108, this.field6461)) {
                if (arg4) {
                    arg2.field6518 = (byte) (arg2.field6518 | 0x10);
                }
                arg2.field6490 = arg5.field6490;
                arg2.field6490.field9963 = this.field6490.field9963;
            } else if (class114.method1130(-64, arg0, this.field6461)) {
                arg2.field6490 = this.field6490;
            } else {
                arg2.field6490 = null;
            }
            if (class437.method3435(this.field6461, (byte) 80, arg0)) {
                if (arg5.field6501 == null || arg5.field6501.length < this.field6450) {
                    int var23 = this.field6450;
                    arg2.field6501 = arg5.field6501 = new short[var23];
                } else {
                    arg2.field6501 = arg5.field6501;
                }
                for (int var24 = 0; var24 < this.field6450; var24++) {
                    arg2.field6501[var24] = this.field6501[var24];
                }
            } else {
                arg2.field6501 = this.field6501;
            }
            if (!class429.method3398(arg0, this.field6461, false)) {
                arg2.field6456 = this.field6456;
            } else if (arg5.field6456 == null || arg5.field6456.length < this.field6514) {
                int var25 = this.field6514;
                arg2.field6456 = arg5.field6456 = new class711[var25];
                for (int var26 = 0; var26 < this.field6514; var26++) {
                    arg2.field6456[var26] = this.field6456[var26].method5164(-66);
                }
            } else {
                arg2.field6456 = arg5.field6456;
                for (int var27 = 0; var27 < this.field6514; var27++) {
                    arg2.field6456[var27].method5162(this.field6456[var27], arg1 + 20718);
                }
            }
            arg2.field6499 = this.field6499;
            arg2.field6440 = this.field6440;
            arg2.field6511 = this.field6511;
            arg2.field6425 = this.field6425;
            if (this.field6428) {
                arg2.field6495 = this.field6495;
                arg2.field6454 = this.field6454;
                arg2.field6484 = this.field6484;
                arg2.field6410 = this.field6410;
                arg2.field6512 = this.field6512;
                arg2.field6428 = true;
                arg2.field6430 = this.field6430;
                arg2.field6524 = this.field6524;
                arg2.field6423 = this.field6423;
            } else {
                arg2.field6428 = false;
            }
            arg2.field6468 = this.field6468;
            arg2.field6487 = this.field6487;
            arg2.field6437 = this.field6437;
            arg2.field6448 = this.field6448;
            arg2.field6420 = this.field6420;
            arg2.field6452 = this.field6452;
            arg2.field6530 = this.field6530;
            return arg2;
        } catch (RuntimeException var29) {
            throw class590.method4333(var29, field6532[51] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6532[3] : field6532[2]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field6532[3] : field6532[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "WA", descriptor = "()I", line = 3965)
    public final int method424() {
        try {
            field6411++;
            return this.field6412;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[27] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIII)V", line = 3975)
    public final void method416(int arg0, int arg1, int arg2, int arg3) {
        try {
            for (int var5 = 0; var5 < this.field6450; var5++) {
                int var6 = this.field6458[var5] & 0xFFFF;
                int var7 = var6 >> 10 & 0x3F;
                int var8 = var6 >> 7 & 0x7;
                int var9 = var6 & 0x7F;
                if (arg1 != -1) {
                    var8 += (arg1 - var8) * arg3 >> 7;
                }
                if (arg0 != -1) {
                    var7 += (arg0 - var7) * arg3 >> 7;
                }
                if (arg2 != -1) {
                    var9 += (arg2 - var9) * arg3 >> 7;
                }
                this.field6458[var5] = (short) class553.method4099(class553.method4099(var7 << 10, var8 << 7), var9);
            }
            field6433++;
            if (this.field6440 != null) {
                for (int var10 = 0; var10 < this.field6514; var10++) {
                    class208 var11 = this.field6440[var10];
                    class711 var12 = this.field6456[var10];
                    var12.field10296 = class613.field8810[this.field6458[var11.field3255] & 0xFFFF] & 0xFFFFFF | var12.field10296 & 0xFF000000;
                }
            }
            if (this.field6435 != null) {
                this.field6435.field11320 = null;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field6532[50] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "(IILs;Ls;III)V", line = 4031)
    public final void method419(int arg0, int arg1, class293 arg2, class293 arg3, int arg4, int arg5, int arg6) {
        try {
            if (!this.field6428) {
                this.method3269((byte) 123);
            }
            field6427++;
            int var8 = this.field6495 + arg4;
            int var9 = this.field6430 + arg4;
            int var10 = arg6 + this.field6410;
            int var11 = this.field6512 + arg6;
            if (arg0 != 1 && arg0 != 2 && arg0 != 3 && arg0 != 5 || var8 >= 0 && (var9 + arg2.field4702 >> arg2.field4706) < arg2.field4704 && var10 >= 0 && arg2.field4697 > (arg2.field4702 + var11 >> arg2.field4706)) {
                if (arg0 == 4 || arg0 == 5) {
                    if (arg3 == null) {
                        return;
                    }
                    if (var8 < 0 || arg3.field4704 <= (arg3.field4702 + var9 >> arg3.field4706) || var10 < 0 || arg3.field4697 <= arg3.field4702 + var11 >> arg3.field4706) {
                        return;
                    }
                } else {
                    int var12 = var8 >> arg2.field4706;
                    int var13 = arg2.field4702 + var9 - 1 >> arg2.field4706;
                    int var14 = var10 >> arg2.field4706;
                    int var15 = arg2.field4702 + var11 - 1 >> arg2.field4706;
                    if (arg5 == arg2.method2495(var14, 1, var12) && arg5 == arg2.method2495(var14, 1, var13) && arg2.method2495(var15, 1, var12) == arg5 && arg5 == arg2.method2495(var15, 1, var13)) {
                        return;
                    }
                }
                if (arg0 == 1) {
                    for (int var32 = 0; var32 < this.field6480; var32++) {
                        this.field6475[var32] -= arg5 - arg2.method2497((byte) -100, this.field6419[var32] + arg4, this.field6517[var32] - -arg6);
                    }
                } else if (arg0 == 2) {
                    short var29 = this.field6524;
                    if (var29 == 0) {
                        return;
                    }
                    for (int var30 = 0; var30 < this.field6480; var30++) {
                        int var31 = (this.field6475[var30] << 16) / var29;
                        if (arg1 > var31) {
                            this.field6475[var30] -= -((arg1 - var31) * (arg2.method2497((byte) -105, this.field6419[var30] + arg4, this.field6517[var30] + arg6) - arg5) / arg1);
                        }
                    }
                } else if (arg0 == 3) {
                    int var25 = (arg1 & 0xFF) * 4;
                    int var26 = ((arg1 & 0xFFE1) >> 8) * 4;
                    int var27 = (arg1 >> 16 & 0xFF) << 6;
                    int var28 = arg1 >> 24 & 0xFF << 6;
                    if ((arg4 - (var25 >> 1)) < 0 || (arg2.field4704 << arg2.field4706) <= ((var25 >> 1) + arg4 + arg2.field4702) || arg6 - (var26 >> 1) < 0 || (var26 >> 1) + arg6 + arg2.field4702 >= arg2.field4697 << arg2.field4706) {
                        return;
                    }
                    this.method3775(var28, var25, arg4, var27, arg5, -1, arg6, var26, arg2);
                } else if (arg0 == 4) {
                    int var23 = this.field6484 - this.field6524;
                    for (int var24 = 0; var24 < this.field6480; var24++) {
                        this.field6475[var24] = this.field6475[var24] + var23 + arg3.method2497((byte) -119, this.field6419[var24] + arg4, this.field6517[var24] + arg6) - arg5;
                    }
                } else if (arg0 == 5) {
                    int var16 = this.field6484 - this.field6524;
                    for (int var17 = 0; var17 < this.field6480; var17++) {
                        int var18 = this.field6419[var17] + arg4;
                        int var19 = this.field6517[var17] + arg6;
                        int var20 = arg2.method2497((byte) -111, var18, var19);
                        int var21 = arg3.method2497((byte) -92, var18, var19);
                        int var22 = var20 - var21 - arg1;
                        this.field6475[var17] = ((this.field6475[var17] << 8) / var16 * var22 >> 8) + (var20 - arg5);
                    }
                }
                this.field6428 = false;
                if (this.field6531 != null) {
                    this.field6531.field11320 = null;
                }
            }
        } catch (RuntimeException var34) {
            throw class590.method4333(var34, field6532[25] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6532[3] : field6532[2]) + ',' + (arg3 == null ? field6532[3] : field6532[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I[IIIIIZ)V", line = 4182)
    public final void method410(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        try {
            field6498++;
            int var8 = arg1.length;
            int var109;
            int var110;
            int var111;
            if (arg0 == 0) {
                var110 = arg3 << 4;
                var109 = arg2 << 4;
                var111 = arg4 << 4;
                int var9 = 0;
                class459.field7081 = 0;
                class655.field9379 = 0;
                class38.field429 = 0;
                for (int var10 = 0; var10 < var8; var10++) {
                    int var11 = arg1[var10];
                    if (this.field6487.length > var11) {
                        int[] var12 = this.field6487[var11];
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            int var14 = var12[var13];
                            class459.field7081 += this.field6419[var14];
                            class38.field429 += this.field6475[var14];
                            var9++;
                            class655.field9379 += this.field6517[var14];
                        }
                    }
                }
                if (var9 <= 0) {
                    class38.field429 = var110;
                    class459.field7081 = var109;
                    class655.field9379 = var111;
                } else {
                    class459.field7081 = class459.field7081 / var9 + var109;
                    class655.field9379 = class655.field9379 / var9 + var111;
                    class38.field429 = class38.field429 / var9 + var110;
                }
            } else if (arg0 == 1) {
                var111 = arg4 << 4;
                var110 = arg3 << 4;
                var109 = arg2 << 4;
                for (int var15 = 0; var15 < var8; var15++) {
                    int var16 = arg1[var15];
                    if (this.field6487.length > var16) {
                        int[] var17 = this.field6487[var16];
                        for (int var18 = 0; var18 < var17.length; var18++) {
                            int var19 = var17[var18];
                            this.field6419[var19] += var109;
                            this.field6475[var19] += var110;
                            this.field6517[var19] += var111;
                        }
                    }
                }
            } else if (arg0 == 2) {
                for (int var20 = 0; var20 < var8; var20++) {
                    int var21 = arg1[var20];
                    if (var21 < this.field6487.length) {
                        int[] var22 = this.field6487[var21];
                        if ((arg5 & 0x1) == 0) {
                            for (int var34 = 0; var34 < var22.length; var34++) {
                                int var35 = var22[var34];
                                this.field6419[var35] -= class459.field7081;
                                this.field6475[var35] -= class38.field429;
                                this.field6517[var35] -= class655.field9379;
                                if (arg4 != 0) {
                                    int var36 = class763.field11199[arg4];
                                    int var37 = class763.field11200[arg4];
                                    int var38 = this.field6475[var35] * var36 + this.field6419[var35] * var37 + 16383 >> 14;
                                    this.field6475[var35] = this.field6475[var35] * var37 + 16383 - (this.field6419[var35] * var36) >> 14;
                                    this.field6419[var35] = var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class763.field11199[arg2];
                                    int var40 = class763.field11200[arg2];
                                    int var41 = this.field6475[var35] * var40 + 16383 - (this.field6517[var35] * var39) >> 14;
                                    this.field6517[var35] = this.field6517[var35] * var40 + this.field6475[var35] * var39 + 16383 >> 14;
                                    this.field6475[var35] = var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class763.field11199[arg3];
                                    int var43 = class763.field11200[arg3];
                                    int var44 = this.field6517[var35] * var42 + this.field6419[var35] * var43 + 16383 >> 14;
                                    this.field6517[var35] = this.field6517[var35] * var43 + 16383 - (this.field6419[var35] * var42) >> 14;
                                    this.field6419[var35] = var44;
                                }
                                this.field6419[var35] += class459.field7081;
                                this.field6475[var35] += class38.field429;
                                this.field6517[var35] += class655.field9379;
                            }
                        } else {
                            for (int var23 = 0; var23 < var22.length; var23++) {
                                int var24 = var22[var23];
                                this.field6419[var24] -= class459.field7081;
                                this.field6475[var24] -= class38.field429;
                                this.field6517[var24] -= class655.field9379;
                                if (arg2 != 0) {
                                    int var25 = class763.field11199[arg2];
                                    int var26 = class763.field11200[arg2];
                                    int var27 = this.field6475[var24] * var26 + 16383 - (this.field6517[var24] * var25) >> 14;
                                    this.field6517[var24] = this.field6517[var24] * var26 + (this.field6475[var24] * var25 + 16383) >> 14;
                                    this.field6475[var24] = var27;
                                }
                                if (arg4 != 0) {
                                    int var28 = class763.field11199[arg4];
                                    int var29 = class763.field11200[arg4];
                                    int var30 = this.field6475[var24] * var28 + this.field6419[var24] * var29 + 16383 >> 14;
                                    this.field6475[var24] = this.field6475[var24] * var29 + 16383 - (this.field6419[var24] * var28) >> 14;
                                    this.field6419[var24] = var30;
                                }
                                if (arg3 != 0) {
                                    int var31 = class763.field11199[arg3];
                                    int var32 = class763.field11200[arg3];
                                    int var33 = this.field6517[var24] * var31 + (this.field6419[var24] * var32) + 16383 >> 14;
                                    this.field6517[var24] = this.field6517[var24] * var32 + (16383 - (this.field6419[var24] * var31)) >> 14;
                                    this.field6419[var24] = var33;
                                }
                                this.field6419[var24] += class459.field7081;
                                this.field6475[var24] += class38.field429;
                                this.field6517[var24] += class655.field9379;
                            }
                        }
                    }
                }
                if (arg6) {
                    for (int var45 = 0; var45 < var8; var45++) {
                        int var46 = arg1[var45];
                        if (var46 < this.field6487.length) {
                            int[] var47 = this.field6487[var46];
                            for (int var48 = 0; var48 < var47.length; var48++) {
                                int var49 = var47[var48];
                                int var50 = this.field6468[var49];
                                int var51 = this.field6468[var49 + 1];
                                for (int var52 = var50; var52 < var51; var52++) {
                                    int var53 = this.field6530[var52] - 1;
                                    if (var53 == -1) {
                                        break;
                                    }
                                    if (arg4 != 0) {
                                        int var54 = class763.field11199[arg4];
                                        int var55 = class763.field11200[arg4];
                                        int var56 = this.field6523[var53] * var54 + (this.field6500[var53] * var55) + 16383 >> 14;
                                        this.field6523[var53] = (short) (this.field6523[var53] * var55 + 16383 - (this.field6500[var53] * var54) >> 14);
                                        this.field6500[var53] = (short) var56;
                                    }
                                    if (arg2 != 0) {
                                        int var57 = class763.field11199[arg2];
                                        int var58 = class763.field11200[arg2];
                                        int var59 = this.field6523[var53] * var58 + 16383 - (this.field6488[var53] * var57) >> 14;
                                        this.field6488[var53] = (short) (this.field6523[var53] * var57 + this.field6488[var53] * var58 + 16383 >> 14);
                                        this.field6523[var53] = (short) var59;
                                    }
                                    if (arg3 != 0) {
                                        int var60 = class763.field11199[arg3];
                                        int var61 = class763.field11200[arg3];
                                        int var62 = this.field6500[var53] * var61 + this.field6488[var53] * var60 + 16383 >> 14;
                                        this.field6488[var53] = (short) (this.field6488[var53] * var61 + 16383 - (this.field6500[var53] * var60) >> 14);
                                        this.field6500[var53] = (short) var62;
                                    }
                                }
                            }
                        }
                    }
                    if (this.field6483 == null && this.field6435 != null) {
                        this.field6435.field11320 = null;
                    }
                    if (this.field6483 != null) {
                        this.field6483.field11320 = null;
                    }
                }
            } else if (arg0 == 3) {
                for (int var63 = 0; var63 < var8; var63++) {
                    int var64 = arg1[var63];
                    if (this.field6487.length > var64) {
                        int[] var65 = this.field6487[var64];
                        for (int var66 = 0; var66 < var65.length; var66++) {
                            int var67 = var65[var66];
                            this.field6419[var67] -= class459.field7081;
                            this.field6475[var67] -= class38.field429;
                            this.field6517[var67] -= class655.field9379;
                            this.field6419[var67] = this.field6419[var67] * arg2 >> 7;
                            this.field6475[var67] = this.field6475[var67] * arg3 >> 7;
                            this.field6517[var67] = this.field6517[var67] * arg4 >> 7;
                            this.field6419[var67] += class459.field7081;
                            this.field6475[var67] += class38.field429;
                            this.field6517[var67] += class655.field9379;
                        }
                    }
                }
            } else if (arg0 == 5) {
                if (this.field6420 != null) {
                    for (int var68 = 0; var68 < var8; var68++) {
                        int var69 = arg1[var68];
                        if (var69 < this.field6420.length) {
                            int[] var70 = this.field6420[var69];
                            for (int var71 = 0; var71 < var70.length; var71++) {
                                int var72 = var70[var71];
                                int var73 = (this.field6446[var72] & 0xFF) + arg2 * 8;
                                if (var73 < 0) {
                                    var73 = 0;
                                } else if (var73 > 255) {
                                    var73 = 255;
                                }
                                this.field6446[var72] = (byte) var73;
                            }
                            if (var70.length > 0 && this.field6435 != null) {
                                this.field6435.field11320 = null;
                            }
                        }
                    }
                    if (this.field6440 != null) {
                        for (int var74 = 0; var74 < this.field6514; var74++) {
                            class208 var75 = this.field6440[var74];
                            class711 var76 = this.field6456[var74];
                            var76.field10296 = var76.field10296 & 0xFFFFFF | 255 - (this.field6446[var75.field3255] & 0xFF) << 24;
                        }
                    }
                }
            } else if (arg0 == 7) {
                if (this.field6420 != null) {
                    for (int var77 = 0; var77 < var8; var77++) {
                        int var78 = arg1[var77];
                        if (this.field6420.length > var78) {
                            int[] var79 = this.field6420[var78];
                            for (int var80 = 0; var80 < var79.length; var80++) {
                                int var81 = var79[var80];
                                int var82 = this.field6458[var81] & 0xFFFF;
                                int var83 = (var82 & 0xFFA5) >> 10;
                                int var84 = var82 >> 7 & 0x7;
                                int var85 = arg2 + var83 & 0x3F;
                                int var86 = var82 & 0x7F;
                                int var87 = arg3 / 4 + var84;
                                int var88 = arg4 + var86;
                                if (var87 < 0) {
                                    var87 = 0;
                                } else if (var87 > 7) {
                                    var87 = 7;
                                }
                                if (var88 < 0) {
                                    var88 = 0;
                                } else if (var88 > 127) {
                                    var88 = 127;
                                }
                                this.field6458[var81] = (short) class553.method4099(var88, class553.method4099(var87 << 7, var85 << 10));
                            }
                            if (var79.length > 0 && this.field6435 != null) {
                                this.field6435.field11320 = null;
                            }
                        }
                    }
                    if (this.field6440 != null) {
                        for (int var89 = 0; var89 < this.field6514; var89++) {
                            class208 var90 = this.field6440[var89];
                            class711 var91 = this.field6456[var89];
                            var91.field10296 = class613.field8810[this.field6458[var90.field3255] & 0xFFFF] & 0xFFFFFF | var91.field10296 & 0xFF000000;
                        }
                    }
                }
            } else if (arg0 == 8) {
                if (this.field6452 != null) {
                    for (int var92 = 0; var92 < var8; var92++) {
                        int var93 = arg1[var92];
                        if (this.field6452.length > var93) {
                            int[] var94 = this.field6452[var93];
                            for (int var95 = 0; var95 < var94.length; var95++) {
                                class711 var96 = this.field6456[var94[var95]];
                                var96.field10293 += arg2;
                                var96.field10285 += arg3;
                            }
                        }
                    }
                }
            } else if (arg0 == 10) {
                if (this.field6452 != null) {
                    for (int var97 = 0; var97 < var8; var97++) {
                        int var98 = arg1[var97];
                        if (var98 < this.field6452.length) {
                            int[] var99 = this.field6452[var98];
                            for (int var100 = 0; var100 < var99.length; var100++) {
                                class711 var101 = this.field6456[var99[var100]];
                                var101.field10287 = var101.field10287 * arg3 >> 7;
                                var101.field10288 = var101.field10288 * arg2 >> 7;
                            }
                        }
                    }
                }
            } else if (arg0 == 9 && this.field6452 != null) {
                for (int var102 = 0; var102 < var8; var102++) {
                    int var103 = arg1[var102];
                    if (var103 < this.field6452.length) {
                        int[] var104 = this.field6452[var103];
                        for (int var105 = 0; var105 < var104.length; var105++) {
                            class711 var106 = this.field6456[var104[var105]];
                            var106.field10291 = var106.field10291 + arg2 & 0x3FFF;
                        }
                    }
                }
            }
        } catch (RuntimeException var108) {
            throw class590.method4333(var108, field6532[60] + arg0 + ',' + (arg1 == null ? field6532[3] : field6532[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILsj;ZII)Z", line = 4842)
    public final boolean method429(int arg0, int arg1, class486 arg2, boolean arg3, int arg4, int arg5) {
        try {
            field6494++;
            return this.method3270(arg5, arg1, arg2, 80, arg0, arg4, arg3);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field6532[14] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6532[3] : field6532[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIBIIIII)Z", line = 4858)
    private final boolean method3275(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field6443++;
            if (arg4 < arg5 && arg4 < arg2 && arg1 > arg4) {
                return false;
            } else if (arg5 < arg4 && arg4 > arg2 && arg1 < arg4) {
                return false;
            } else if (arg8 > arg7 && arg7 < arg0 && arg7 < arg6) {
                return false;
            } else if (arg7 > arg8 && arg7 > arg0 && arg6 < arg7) {
                return false;
            } else {
                if (arg3 <= 12) {
                    this.field6460 = null;
                }
                return true;
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6532[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "(III)V", line = 4890)
    public final void method395(int arg0, int arg1, int arg2) {
        try {
            field6416++;
            for (int var4 = 0; var4 < this.field6480; var4++) {
                if (arg0 != 0) {
                    this.field6419[var4] += arg0;
                }
                if (arg1 != 0) {
                    this.field6475[var4] += arg1;
                }
                if (arg2 != 0) {
                    this.field6517[var4] += arg2;
                }
            }
            this.field6428 = false;
            if (this.field6531 != null) {
                this.field6531.field11320 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6532[44] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "NA", descriptor = "()Z", line = 4927)
    public final boolean method406() {
        try {
            field6492++;
            if (this.field6487 == null) {
                return false;
            }
            for (int var1 = 0; var1 < this.field6477; var1++) {
                this.field6419[var1] <<= 0x4;
                this.field6475[var1] <<= 0x4;
                this.field6517[var1] <<= 0x4;
            }
            class655.field9379 = 0;
            class38.field429 = 0;
            class459.field7081 = 0;
            return true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6532[13] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 4958)
    public final void method413(int arg0) {
        try {
            field6505++;
            int var2 = class763.field11199[arg0];
            int var3 = class763.field11200[arg0];
            for (int var4 = 0; var4 < this.field6480; var4++) {
                int var5 = this.field6517[var4] * var2 + this.field6419[var4] * var3 >> 14;
                this.field6517[var4] = this.field6517[var4] * var3 - (this.field6419[var4] * var2) >> 14;
                this.field6419[var4] = var5;
            }
            if (this.field6531 != null) {
                this.field6531.field11320 = null;
            }
            this.field6428 = false;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6532[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "ua", descriptor = "()I", line = 4988)
    public final int method433() {
        try {
            field6497++;
            return this.field6510;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[12] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "(IIII)V", line = 4998)
    public final void method402(int arg0, int arg1, int arg2, int arg3) {
        try {
            field6508++;
            if (arg0 == 0) {
                class38.field429 = 0;
                int var5 = 0;
                class655.field9379 = 0;
                class459.field7081 = 0;
                for (int var6 = 0; var6 < this.field6480; var6++) {
                    class459.field7081 += this.field6419[var6];
                    class38.field429 += this.field6475[var6];
                    var5++;
                    class655.field9379 += this.field6517[var6];
                }
                if (var5 > 0) {
                    class459.field7081 = class459.field7081 / var5 + arg1;
                    class655.field9379 = class655.field9379 / var5 + arg3;
                    class38.field429 = class38.field429 / var5 + arg2;
                } else {
                    class655.field9379 = arg3;
                    class459.field7081 = arg1;
                    class38.field429 = arg2;
                }
            } else if (arg0 == 1) {
                for (int var7 = 0; var7 < this.field6480; var7++) {
                    this.field6419[var7] += arg1;
                    this.field6475[var7] += arg2;
                    this.field6517[var7] += arg3;
                }
            } else if (arg0 == 2) {
                for (int var8 = 0; var8 < this.field6480; var8++) {
                    this.field6419[var8] -= class459.field7081;
                    this.field6475[var8] -= class38.field429;
                    this.field6517[var8] -= class655.field9379;
                    if (arg3 != 0) {
                        int var9 = class763.field11199[arg3];
                        int var10 = class763.field11200[arg3];
                        int var11 = this.field6475[var8] * var9 + this.field6419[var8] * var10 + 16383 >> 14;
                        this.field6475[var8] = this.field6475[var8] * var10 + 16383 - (this.field6419[var8] * var9) >> 14;
                        this.field6419[var8] = var11;
                    }
                    if (arg1 != 0) {
                        int var12 = class763.field11199[arg1];
                        int var13 = class763.field11200[arg1];
                        int var14 = this.field6475[var8] * var13 + 16383 - this.field6517[var8] * var12 >> 14;
                        this.field6517[var8] = this.field6517[var8] * var13 + this.field6475[var8] * var12 + 16383 >> 14;
                        this.field6475[var8] = var14;
                    }
                    if (arg2 != 0) {
                        int var15 = class763.field11199[arg2];
                        int var16 = class763.field11200[arg2];
                        int var17 = this.field6419[var8] * var16 + this.field6517[var8] * var15 + 16383 >> 14;
                        this.field6517[var8] = this.field6517[var8] * var16 + 16383 - this.field6419[var8] * var15 >> 14;
                        this.field6419[var8] = var17;
                    }
                    this.field6419[var8] += class459.field7081;
                    this.field6475[var8] += class38.field429;
                    this.field6517[var8] += class655.field9379;
                }
            } else if (arg0 == 3) {
                for (int var18 = 0; var18 < this.field6480; var18++) {
                    this.field6419[var18] -= class459.field7081;
                    this.field6475[var18] -= class38.field429;
                    this.field6517[var18] -= class655.field9379;
                    this.field6419[var18] = this.field6419[var18] * arg1 / 128;
                    this.field6475[var18] = this.field6475[var18] * arg2 / 128;
                    this.field6517[var18] = this.field6517[var18] * arg3 / 128;
                    this.field6419[var18] += class459.field7081;
                    this.field6475[var18] += class38.field429;
                    this.field6517[var18] += class655.field9379;
                }
            } else if (arg0 == 5) {
                for (int var19 = 0; var19 < this.field6450; var19++) {
                    int var20 = (this.field6446[var19] & 0xFF) + arg1 * 8;
                    if (var20 < 0) {
                        var20 = 0;
                    } else if (var20 > 255) {
                        var20 = 255;
                    }
                    this.field6446[var19] = (byte) var20;
                }
                if (this.field6435 != null) {
                    this.field6435.field11320 = null;
                }
                if (this.field6440 != null) {
                    for (int var21 = 0; var21 < this.field6514; var21++) {
                        class208 var22 = this.field6440[var21];
                        class711 var23 = this.field6456[var21];
                        var23.field10296 = 255 - (this.field6446[var22.field3255] & 0xFF) << 24 | var23.field10296 & 0xFFFFFF;
                    }
                }
            } else if (arg0 == 7) {
                for (int var24 = 0; var24 < this.field6450; var24++) {
                    int var25 = this.field6458[var24] & 0xFFFF;
                    int var26 = var25 >> 10 & 0x3F;
                    int var27 = (var25 & 0x3A2) >> 7;
                    int var28 = var25 & 0x7F;
                    int var29 = arg1 + var26 & 0x3F;
                    int var30 = arg2 / 4 + var27;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 > 7) {
                        var30 = 7;
                    }
                    int var31 = arg3 + var28;
                    if (var31 < 0) {
                        var31 = 0;
                    } else if (var31 > 127) {
                        var31 = 127;
                    }
                    this.field6458[var24] = (short) class553.method4099(var31, class553.method4099(var30 << 7, var29 << 10));
                }
                if (this.field6435 != null) {
                    this.field6435.field11320 = null;
                }
                if (this.field6440 != null) {
                    for (int var32 = 0; var32 < this.field6514; var32++) {
                        class208 var33 = this.field6440[var32];
                        class711 var34 = this.field6456[var32];
                        var34.field10296 = class613.field8810[this.field6458[var33.field3255] & 0xFFFF] & 0xFFFFFF | var34.field10296 & 0xFF000000;
                    }
                }
            } else if (arg0 == 8) {
                for (int var35 = 0; var35 < this.field6514; var35++) {
                    class711 var36 = this.field6456[var35];
                    var36.field10293 += arg1;
                    var36.field10285 += arg2;
                }
            } else if (arg0 == 10) {
                for (int var37 = 0; var37 < this.field6514; var37++) {
                    class711 var38 = this.field6456[var37];
                    var38.field10287 = var38.field10287 * arg2 >> 7;
                    var38.field10288 = var38.field10288 * arg1 >> 7;
                }
            } else if (arg0 == 9) {
                for (int var39 = 0; var39 < this.field6514; var39++) {
                    class711 var40 = this.field6456[var39];
                    var40.field10291 = var40.field10291 + arg1 & 0x3FFF;
                }
            }
        } catch (RuntimeException var42) {
            throw class590.method4333(var42, field6532[32] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BSIII)I", line = 5311)
    private final int method3276(byte arg0, short arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg4 != 255) {
                this.method406();
            }
            field6421++;
            int var6 = class613.field8810[class190.method1770(arg3, 1, arg2)];
            if (arg1 != -1) {
                class304 var7 = this.field6529.field864.method1419(arg1 & 0xFFFF, -107);
                int var8 = var7.field4893 & 0xFF;
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
                        var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                    }
                }
                int var12 = var7.field4905 & 0xFF;
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
                    var6 = (var13 << 8 & 0xFF00F7) + (var14 & 0xFF00) + (var15 >> 8);
                }
            }
            return (var6 << 8) - ((arg0 & 0xFF) - 255);
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field6532[62] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "RA", descriptor = "()I", line = 5388)
    public final int method396() {
        try {
            field6466++;
            if (!this.field6428) {
                this.method3269((byte) 71);
            }
            return this.field6430;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[64] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "()V", line = 5400)
    public final void method415() {
        try {
            for (int var1 = 0; var1 < this.field6480; var1++) {
                this.field6517[var1] = -this.field6517[var1];
            }
            field6457++;
            for (int var2 = 0; var2 < this.field6473; var2++) {
                this.field6488[var2] = (short) (-this.field6488[var2]);
            }
            for (int var3 = 0; var3 < this.field6450; var3++) {
                short var4 = this.field6460[var3];
                this.field6460[var3] = this.field6493[var3];
                this.field6493[var3] = var4;
            }
            if (this.field6483 == null && this.field6435 != null) {
                this.field6435.field11320 = null;
            }
            if (this.field6483 != null) {
                this.field6483.field11320 = null;
            }
            this.field6428 = false;
            if (this.field6490 != null) {
                this.field6490.field9963 = null;
            }
            if (this.field6531 != null) {
                this.field6531.field11320 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6532[52] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "fa", descriptor = "()I", line = 5457)
    public final int method438() {
        try {
            field6418++;
            if (!this.field6428) {
                this.method3269((byte) 126);
            }
            return this.field6524;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[18] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BIZ)Lka;", line = 5478)
    public final class499 method394(byte arg0, int arg1, boolean arg2) {
        try {
            field6522++;
            class407 var4;
            class407 var5;
            if (arg0 == 1) {
                var4 = this.field6529.field2509;
                var5 = this.field6529.field2510;
            } else if (arg0 == 2) {
                var5 = this.field6529.field2529;
                var4 = this.field6529.field2445;
            } else if (arg0 == 3) {
                var4 = this.field6529.field2478;
                var5 = this.field6529.field2488;
            } else if (arg0 == 4) {
                var5 = this.field6529.field2536;
                var4 = this.field6529.field2429;
            } else if (arg0 == 5) {
                var5 = this.field6529.field2523;
                var4 = this.field6529.field2498;
            } else {
                var5 = var4 = new class407(this.field6529);
            }
            return this.method3274(arg1, -20624, var5, arg2, arg0 != 0, var4);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6532[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "HA", descriptor = "()I", line = 5526)
    public final int method388() {
        try {
            field6503++;
            if (!this.field6428) {
                this.method3269((byte) 79);
            }
            return this.field6410;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[10] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "()Z", line = 5538)
    public final boolean method409() {
        try {
            field6527++;
            return this.field6462;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[40] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V", line = 5547)
    private final void method3277(byte arg0) {
        try {
            field6465++;
            if (arg0 <= -100 && this.field6415 != 0) {
                if (this.field6518 != 0) {
                    this.method3263((byte) -105, true);
                }
                this.method3263((byte) -105, false);
                if (this.field6490 != null) {
                    if (this.field6490.field9963 == null) {
                        this.method3268((this.field6518 & 0x10) != 0, (byte) -122);
                    }
                    if (this.field6490.field9963 != null) {
                        this.field6529.method1474(this.field6483 != null, (byte) 113);
                        this.field6529.method1481(this.field6435, this.field6436, (byte) -89, this.field6531, this.field6483);
                        int var2 = this.field6437.length - 1;
                        for (int var3 = 0; var3 < var2; var3++) {
                            int var4 = this.field6437[var3];
                            int var5 = this.field6437[var3 + 1];
                            int var6 = this.field6501[var4] & 0xFFFF;
                            if (var6 == 65535) {
                                var6 = -1;
                            }
                            this.field6529.method1504(var6, this.field6483 != null, (byte) -12);
                            this.field6529.method1461((byte) -15, this.field6490.field9963, var4 * 3, (var5 - var4) * 3, 4);
                        }
                    }
                }
                this.method3265(-884909049);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field6532[22] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "ba", descriptor = "(Lr;)Lr;", line = 5603)
    public final class192 method405(class192 arg0) {
        try {
            field6453++;
            if (this.field6473 == 0) {
                return null;
            }
            if (!this.field6428) {
                this.method3269((byte) 85);
            }
            int var2;
            int var3;
            if (this.field6529.field2503 > 0) {
                var2 = this.field6495 - (this.field6529.field2503 * this.field6484 >> 8) >> this.field6529.field2390;
                var3 = this.field6430 - (this.field6529.field2503 * this.field6524 >> 8) >> this.field6529.field2390;
            } else {
                var2 = this.field6495 - (this.field6529.field2503 * this.field6524 >> 8) >> this.field6529.field2390;
                var3 = this.field6430 - (this.field6529.field2503 * this.field6484 >> 8) >> this.field6529.field2390;
            }
            int var4;
            int var5;
            if (this.field6529.field2511 > 0) {
                var4 = this.field6410 - (this.field6529.field2511 * this.field6484 >> 8) >> this.field6529.field2390;
                var5 = this.field6512 - (this.field6529.field2511 * this.field6524 >> 8) >> this.field6529.field2390;
            } else {
                var4 = this.field6410 - (this.field6529.field2511 * this.field6524 >> 8) >> this.field6529.field2390;
                var5 = this.field6512 - (this.field6529.field2511 * this.field6484 >> 8) >> this.field6529.field2390;
            }
            int var6 = var3 + 1 - var2;
            int var7 = var5 + 1 - var4;
            class669 var8 = (class669) arg0;
            class669 var9;
            if (var8 != null && var8.method4851(var6, var7, (byte) 122)) {
                var9 = var8;
                var8.method4853(-1);
            } else {
                var9 = new class669(this.field6529, var6, var7);
            }
            var9.method4850(var4, -82, var2, var3, var5);
            this.method3264((byte) -80, var9);
            return var9;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6532[56] + (arg0 == null ? field6532[3] : field6532[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "(I)V", line = 5668)
    public final void method437(int arg0) {
        try {
            field6459++;
            int var2 = class763.field11199[arg0];
            int var3 = class763.field11200[arg0];
            for (int var4 = 0; var4 < this.field6480; var4++) {
                int var5 = this.field6517[var4] * var2 + this.field6419[var4] * var3 >> 14;
                this.field6517[var4] = this.field6517[var4] * var3 - this.field6419[var4] * var2 >> 14;
                this.field6419[var4] = var5;
            }
            for (int var6 = 0; var6 < this.field6473; var6++) {
                int var7 = this.field6488[var6] * var2 + (this.field6500[var6] * var3) >> 14;
                this.field6488[var6] = (short) (this.field6488[var6] * var3 - (this.field6500[var6] * var2) >> 14);
                this.field6500[var6] = (short) var7;
            }
            if (this.field6483 == null && this.field6435 != null) {
                this.field6435.field11320 = null;
            }
            if (this.field6483 != null) {
                this.field6483.field11320 = null;
            }
            this.field6428 = false;
            if (this.field6531 != null) {
                this.field6531.field11320 = null;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6532[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "FA", descriptor = "(I)V", line = 5718)
    public final void method386(int arg0) {
        try {
            field6447++;
            int var2 = class763.field11199[arg0];
            int var3 = class763.field11200[arg0];
            for (int var4 = 0; var4 < this.field6480; var4++) {
                int var5 = this.field6475[var4] * var3 - this.field6517[var4] * var2 >> 14;
                this.field6517[var4] = this.field6475[var4] * var2 + (this.field6517[var4] * var3) >> 14;
                this.field6475[var4] = var5;
            }
            this.field6428 = false;
            if (this.field6531 != null) {
                this.field6531.field11320 = null;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6532[43] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "ia", descriptor = "(SS)V", line = 5752)
    public final void method420(short arg0, short arg1) {
        try {
            for (int var3 = 0; var3 < this.field6450; var3++) {
                if (this.field6458[var3] == arg0) {
                    this.field6458[var3] = arg1;
                }
            }
            field6509++;
            if (this.field6440 != null) {
                for (int var4 = 0; var4 < this.field6514; var4++) {
                    class208 var5 = this.field6440[var4];
                    class711 var6 = this.field6456[var4];
                    var6.field10296 = var6.field10296 & 0xFF000000 | class613.field8810[this.field6458[var5.field3255] & 0xFFFF] & 0xFFFFFF;
                }
            }
            if (this.field6435 != null) {
                this.field6435.field11320 = null;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field6532[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILsj;ZI)Z", line = 5794)
    public final boolean method425(int arg0, int arg1, class486 arg2, boolean arg3, int arg4) {
        try {
            field6445++;
            return this.method3270(-1, arg1, arg2, 79, arg0, arg4, arg3);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6532[46] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6532[3] : field6532[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "(I)V", line = 5810)
    public final void method393(int arg0) {
        try {
            field6422++;
            this.field6412 = (short) arg0;
            if (this.field6435 != null) {
                this.field6435.field11320 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6532[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "EA", descriptor = "()I", line = 5830)
    public final int method434() {
        try {
            field6438++;
            if (!this.field6428) {
                this.method3269((byte) 107);
            }
            return this.field6484;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6532[58] + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)V", line = 5843)
    public static final void method3278(byte arg0) {
        try {
            field6521++;
            int[] var1 = new int[class229.field3563.field625];
            int var2 = 0;
            for (int var3 = 0; var3 < class229.field3563.field625; var3++) {
                class584 var4 = class229.field3563.method531(var3, (byte) 107);
                if (var4.field8448 >= 0 || var4.field8416 >= 0) {
                    var1[var2++] = var3;
                }
            }
            class188.field2984 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                class188.field2984[var5] = var1[var5];
            }
            int var6 = 13 / ((10 - arg0) / 51);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field6532[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3279(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3280(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 6;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
