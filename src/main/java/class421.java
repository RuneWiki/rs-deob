import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class421 extends class498 {

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    private int field5505 = 0;

    @OriginalMember(owner = "client!df", name = "hb", descriptor = "I")
    private int field5540 = 0;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Z")
    private boolean field5522 = false;

    @OriginalMember(owner = "client!df", name = "jb", descriptor = "Z")
    private boolean field5542 = true;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    private int field5498 = 0;

    @OriginalMember(owner = "client!df", name = "tb", descriptor = "I")
    private int field5552 = 0;

    @OriginalMember(owner = "client!df", name = "Wb", descriptor = "I")
    private int field5581 = 0;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Z")
    private boolean field5494 = false;

    @OriginalMember(owner = "client!df", name = "Ub", descriptor = "Z")
    private boolean field5579 = false;

    @OriginalMember(owner = "client!df", name = "nb", descriptor = "Lpc;")
    private class700 field5546;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "Lsf;")
    private class550 field5515;

    @OriginalMember(owner = "client!df", name = "Nb", descriptor = "Lsf;")
    private class550 field5572;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Lsf;")
    private class550 field5511;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Lsf;")
    private class550 field5500;

    @OriginalMember(owner = "client!df", name = "Rb", descriptor = "Lqfa;")
    private class108 field5576;

    @OriginalMember(owner = "client!df", name = "kc", descriptor = "I")
    private int field5595;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    private int field5526;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "[I")
    private int[] field5506;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "[I")
    private int[] field5517;

    @OriginalMember(owner = "client!df", name = "Kb", descriptor = "[I")
    private int[] field5569;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "[S")
    private short[] field5508;

    @OriginalMember(owner = "client!df", name = "ob", descriptor = "[I")
    private int[] field5547;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "[Lmk;")
    private class62[] field5507;

    @OriginalMember(owner = "client!df", name = "xb", descriptor = "[Lir;")
    private class28[] field5556;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    private int field5527;

    @OriginalMember(owner = "client!df", name = "kb", descriptor = "[Lbea;")
    private class237[] field5543;

    @OriginalMember(owner = "client!df", name = "vb", descriptor = "[Lds;")
    private class16[] field5554;

    @OriginalMember(owner = "client!df", name = "Qb", descriptor = "[S")
    private short[] field5575;

    @OriginalMember(owner = "client!df", name = "wc", descriptor = "[F")
    private float[] field5607;

    @OriginalMember(owner = "client!df", name = "ec", descriptor = "[F")
    private float[] field5589;

    @OriginalMember(owner = "client!df", name = "jc", descriptor = "[S")
    private short[] field5594;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "[S")
    private short[] field5518;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "[S")
    private short[] field5536;

    @OriginalMember(owner = "client!df", name = "pb", descriptor = "[S")
    private short[] field5548;

    @OriginalMember(owner = "client!df", name = "Gc", descriptor = "[S")
    private short[] field5617;

    @OriginalMember(owner = "client!df", name = "oc", descriptor = "[S")
    private short[] field5599;

    @OriginalMember(owner = "client!df", name = "Xb", descriptor = "[B")
    private byte[] field5582;

    @OriginalMember(owner = "client!df", name = "Db", descriptor = "[B")
    private byte[] field5562;

    @OriginalMember(owner = "client!df", name = "ib", descriptor = "S")
    private short field5541;

    @OriginalMember(owner = "client!df", name = "nc", descriptor = "[S")
    private short[] field5598;

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "[S")
    private short[] field5537;

    @OriginalMember(owner = "client!df", name = "Hb", descriptor = "S")
    private short field5566;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "[S")
    private short[] field5524;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "[I")
    private int[] field5523;

    @OriginalMember(owner = "client!df", name = "gb", descriptor = "[[I")
    private int[][] field5539;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "[[I")
    private int[][] field5497;

    @OriginalMember(owner = "client!df", name = "yb", descriptor = "[[I")
    private int[][] field5557;

    @OriginalMember(owner = "client!df", name = "tc", descriptor = "Lmja;")
    public static class441 field5604 = new class441("stellardawn", "Stellar Dawn", 1);

    @OriginalMember(owner = "client!df", name = "Cc", descriptor = "I")
    public static int field5613 = 0;

    @OriginalMember(owner = "client!df", name = "Fc", descriptor = "Z")
    public static boolean field5616 = false;

    @OriginalMember(owner = "client!df", name = "yc", descriptor = "B")
    private byte field5609;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!df", name = "fb", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!df", name = "lb", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!df", name = "rb", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!df", name = "sb", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!df", name = "ub", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!df", name = "wb", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!df", name = "zb", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!df", name = "Ab", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!df", name = "Bb", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!df", name = "Cb", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!df", name = "Eb", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!df", name = "Fb", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!df", name = "Gb", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!df", name = "Ib", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!df", name = "Jb", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!df", name = "Lb", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!df", name = "Mb", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!df", name = "Sb", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!df", name = "Tb", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!df", name = "Vb", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!df", name = "ac", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!df", name = "bc", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!df", name = "cc", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!df", name = "dc", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!df", name = "fc", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!df", name = "hc", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!df", name = "ic", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!df", name = "lc", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!df", name = "mc", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!df", name = "pc", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!df", name = "qc", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!df", name = "rc", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!df", name = "sc", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!df", name = "uc", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!df", name = "vc", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!df", name = "xc", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!df", name = "zc", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!df", name = "Ac", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!df", name = "Bc", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!df", name = "Dc", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!df", name = "Ec", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Len;")
    private class339 field5496;

    @OriginalMember(owner = "client!df", name = "Yb", descriptor = "Lbia;")
    private class525 field5583;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Lpea;")
    private class755 field5499;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "S")
    private short field5495;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "S")
    private short field5510;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "S")
    private short field5535;

    @OriginalMember(owner = "client!df", name = "qb", descriptor = "S")
    private short field5549;

    @OriginalMember(owner = "client!df", name = "Ob", descriptor = "S")
    private short field5573;

    @OriginalMember(owner = "client!df", name = "Pb", descriptor = "S")
    private short field5574;

    @OriginalMember(owner = "client!df", name = "Zb", descriptor = "S")
    private short field5584;

    @OriginalMember(owner = "client!df", name = "gc", descriptor = "S")
    private short field5591;

    @OriginalMember(owner = "client!df", name = "fa", descriptor = "()I", line = 5)
    public final int method404() {
        field5525++;
        if (!this.field5579) {
            this.method2522(108);
        }
        return this.field5584;
    }

    @OriginalMember(owner = "client!df", name = "EA", descriptor = "()I", line = 16)
    public final int method400() {
        if (!this.field5579) {
            this.method2522(120);
        }
        field5587++;
        return this.field5549;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILnh;ZII)Z", line = 31)
    public final boolean method379(int arg0, int arg1, class778 arg2, boolean arg3, int arg4, int arg5) {
        field5590++;
        return this.method2519(arg0, -93, arg2, arg3, arg5, arg4, arg1);
    }

    @OriginalMember(owner = "client!df", name = "aa", descriptor = "(SS)V", line = 41)
    public final void method399(short arg0, short arg1) {
        field5608++;
        class162 var3 = this.field5546.field890;
        for (int var4 = 0; var4 < this.field5540; var4++) {
            if (this.field5548[var4] == arg0) {
                this.field5548[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class359 var7 = var3.method1138(arg0 & 0xFFFF, 94);
            var6 = var7.field4458;
            var5 = var7.field4462;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class359 var10 = var3.method1138(arg1 & 0xFFFF, 37);
            if (var10.field4444 != 0 || var10.field4449 != 0) {
                this.field5494 = true;
            }
            var8 = var10.field4462;
            var9 = var10.field4458;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field5554 != null) {
            for (int var11 = 0; var11 < this.field5527; var11++) {
                class16 var12 = this.field5554[var11];
                class237 var13 = this.field5543[var11];
                var13.field2799 = class437.field5749[this.field5536[var12.field288] & 0xFFFF] & 0xFFFFFF | var13.field2799 & 0xFF000000;
            }
        }
        if (this.field5500 != null) {
            this.field5500.field7650 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 120)
    private final void method2510(int arg0) {
        field5520++;
        if (!this.field5542) {
            return;
        }
        this.field5542 = false;
        if (this.field5507 == null && this.field5556 == null && this.field5554 == null && !class537.method3191(this.field5526, arg0 - 30802, this.field5595)) {
            boolean var2 = false;
            boolean var3 = false;
            if (this.field5547 != null && !class283.method1625((byte) 125, this.field5595, this.field5526)) {
                if (this.field5515 != null && this.field5515.field7650 == null) {
                    this.field5542 = true;
                } else {
                    if (!this.field5579) {
                        this.method2522(-62);
                    }
                    var2 = true;
                }
            }
            boolean var4 = false;
            if (this.field5569 != null && !class61.method521(this.field5526, (byte) 41, this.field5595)) {
                if (this.field5515 != null && this.field5515.field7650 == null) {
                    this.field5542 = true;
                } else {
                    var3 = true;
                    if (!this.field5579) {
                        this.method2522(-111);
                    }
                }
            }
            if (this.field5517 != null && !class788.method4358(this.field5595, -99, this.field5526)) {
                if (this.field5515 != null && this.field5515.field7650 == null) {
                    this.field5542 = true;
                } else {
                    if (!this.field5579) {
                        this.method2522(arg0 - 83);
                    }
                    var4 = true;
                }
            }
            if (var4) {
                this.field5517 = null;
            }
            if (var3) {
                this.field5569 = null;
            }
            if (var2) {
                this.field5547 = null;
            }
        }
        if (arg0 != 0) {
            return;
        }
        if (this.field5594 != null && this.field5547 == null && this.field5569 == null && this.field5517 == null) {
            this.field5506 = null;
            this.field5594 = null;
        }
        if (this.field5582 != null && !class617.method3494(this.field5526, arg0 + 8, this.field5595)) {
            if (this.field5511 == null) {
                if (this.field5500 != null && this.field5500.field7650 == null) {
                    this.field5542 = true;
                } else {
                    this.field5617 = this.field5598 = this.field5575 = null;
                    this.field5582 = null;
                }
            } else if (this.field5511.field7650 == null) {
                this.field5542 = true;
            } else {
                this.field5582 = null;
                this.field5617 = this.field5598 = this.field5575 = null;
            }
        }
        if (this.field5536 != null && !class286.method1656(this.field5526, 64, this.field5595)) {
            if (this.field5500 != null && this.field5500.field7650 == null) {
                this.field5542 = true;
            } else {
                this.field5536 = null;
            }
        }
        if (this.field5562 != null && !class207.method1312(this.field5526, this.field5595, 4)) {
            if (this.field5500 != null && this.field5500.field7650 == null) {
                this.field5542 = true;
            } else {
                this.field5562 = null;
            }
        }
        if (this.field5607 != null && !class389.method2279(true, this.field5595, this.field5526)) {
            if (this.field5572 != null && this.field5572.field7650 == null) {
                this.field5542 = true;
            } else {
                this.field5607 = this.field5589 = null;
            }
        }
        if (this.field5548 != null && !class309.method1829(this.field5526, this.field5595, (byte) -12)) {
            if (this.field5500 != null && this.field5500.field7650 == null) {
                this.field5542 = true;
            } else {
                this.field5548 = null;
            }
        }
        if (this.field5537 != null && !class648.method3657(this.field5595, this.field5526, -1)) {
            if ((this.field5576 == null || this.field5576.field1357 != null) && (this.field5500 == null || this.field5500.field7650 != null)) {
                this.field5537 = this.field5599 = this.field5524 = null;
            } else {
                this.field5542 = true;
            }
        }
        if (this.field5557 != null && !class589.method3381(this.field5595, this.field5526, 94)) {
            this.field5557 = null;
            this.field5518 = null;
        }
        if (this.field5539 != null && !class343.method2032(this.field5526, this.field5595, true)) {
            this.field5539 = null;
            this.field5508 = null;
        }
        if (this.field5497 != null && !class529.method3161(this.field5595, -111, this.field5526)) {
            this.field5497 = null;
        }
        if (this.field5523 != null && (this.field5526 & 0x800) == 0 && (this.field5526 & 0x40000) == 0) {
            this.field5523 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V", line = 315)
    private final void method2511(boolean arg0, int arg1) {
        field5503++;
        boolean var3 = this.field5500 != null && this.field5500.field7650 == null;
        boolean var4 = this.field5511 != null && this.field5511.field7650 == null;
        boolean var5 = this.field5515 != null && this.field5515.field7650 == null;
        boolean var6 = this.field5572 != null && this.field5572.field7650 == null;
        if (arg0) {
            var6 &= (this.field5609 & 0x8) != 0;
            var3 &= (this.field5609 & 0x2) != 0;
            var5 &= (this.field5609 & 0x1) != 0;
            var4 &= (this.field5609 & 0x4) != 0;
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
        if (this.field5498 * var7 > this.field5546.field9779.field5275.length) {
            this.field5546.field9779 = new class283((this.field5498 + 100) * var7);
        } else {
            this.field5546.field9779.field5262 = 0;
        }
        class283 var12 = this.field5546.field9779;
        if (var5) {
            if (this.field5546.field9772) {
                for (int var21 = 0; var21 < this.field5581; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field5547[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field5569[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field5517[var21]);
                    int var25 = this.field5506[var21];
                    int var26 = this.field5506[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field5594[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field5262 = var7 * var28;
                        var12.method2391(-99, var22);
                        var12.method2391(-103, var23);
                        var12.method2391(-103, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field5581; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field5547[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field5569[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field5517[var13]);
                    int var17 = this.field5506[var13];
                    int var18 = this.field5506[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field5594[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field5262 = var7 * var20;
                        var12.method2403((byte) 80, var14);
                        var12.method2403((byte) 107, var15);
                        var12.method2403((byte) 45, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field5511 == null) {
                byte[] var31;
                short[] var32;
                short[] var33;
                short[] var34;
                if (this.field5499 == null) {
                    var31 = this.field5582;
                    var32 = this.field5575;
                    var33 = this.field5617;
                    var34 = this.field5598;
                } else {
                    var31 = this.field5499.field10463;
                    var33 = this.field5499.field10466;
                    var32 = this.field5499.field10462;
                    var34 = this.field5499.field10465;
                }
                float var35 = this.field5546.field9869[0];
                float var36 = this.field5546.field9869[1];
                float var37 = this.field5546.field9869[2];
                float var38 = this.field5546.field9850;
                float var39 = this.field5546.field9830 * 768.0F / (float) this.field5541;
                float var40 = this.field5546.field9788 * 768.0F / (float) this.field5541;
                for (int var41 = 0; var41 < this.field5540; var41++) {
                    int var42 = this.method2517(this.field5562[var41], this.field5536[var41], this.field5548[var41], this.field5566, 65280);
                    float var43 = (float) ((var42 & 0xFF598C) >> 16) * this.field5546.field9857;
                    float var44 = (float) (var42 >>> 24) * this.field5546.field9781;
                    float var45 = (float) ((var42 & 0xFFA8) >> 8) * this.field5546.field9813;
                    short var46 = this.field5537[var41];
                    short var47 = (short) var31[var46];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var32[var46] * var37 + (float) var33[var46] * var35 + (float) var34[var46] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var32[var46] * var37 + (float) var33[var46] * var35 + (float) var34[var46] * var36) / (float) (var47 * 256);
                    }
                    float var49 = var38 + (var48 < 0.0F ? var40 : var39) * var48;
                    int var50 = (int) (var44 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var51 = (int) (var43 * var49);
                    int var52 = (int) (var45 * var49);
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
                    var12.field5262 = var9 + (var7 * var46);
                    var12.method2353(-116, var50);
                    var12.method2353(-93, var51);
                    var12.method2353(-91, var52);
                    var12.method2353(115, 255 - (this.field5562[var41] & 0xFF));
                    short var53 = this.field5599[var41];
                    short var54 = (short) var31[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var32[var53] * var37 + (float) var33[var53] * var35 + (float) var34[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var32[var53] * var37 + (float) var33[var53] * var35 + (float) var34[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = var38 + var55 * ((var55 < 0.0F) ? var40 : var39);
                    int var57 = (int) (var44 * var56);
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
                    int var59 = (int) (var45 * var56);
                    var12.field5262 = var7 * var53 + var9;
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method2353(-116, var57);
                    var12.method2353(-64, var58);
                    var12.method2353(-58, var59);
                    var12.method2353(104, 255 - (this.field5562[var41] & 0xFF));
                    short var60 = this.field5524[var41];
                    short var61 = (short) var31[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var32[var60] * var37 + (float) var33[var60] * var35 + (float) var34[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var32[var60] * var37 + (float) var33[var60] * var35 + (float) var34[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = ((var62 < 0.0F) ? var40 : var39) * var62 + var38;
                    int var64 = (int) (var44 * var63);
                    int var65 = (int) (var43 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    int var66 = (int) (var45 * var63);
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.field5262 = var7 * var60 + var9;
                    var12.method2353(57, var64);
                    var12.method2353(118, var65);
                    var12.method2353(arg1 - 335, var66);
                    var12.method2353(-93, 255 - (this.field5562[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field5540; var29++) {
                    int var30 = this.method2517(this.field5562[var29], this.field5536[var29], this.field5548[var29], this.field5566, 65280);
                    var12.field5262 = this.field5537[var29] * var7 + var9;
                    var12.method2391(-127, var30);
                    var12.field5262 = var9 + (this.field5599[var29] * var7);
                    var12.method2391(-116, var30);
                    var12.field5262 = this.field5524[var29] * var7 + var9;
                    var12.method2391(-113, var30);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field5499 == null) {
                var67 = this.field5598;
                var68 = this.field5582;
                var69 = this.field5575;
                var70 = this.field5617;
            } else {
                var67 = this.field5499.field10465;
                var68 = this.field5499.field10463;
                var69 = this.field5499.field10462;
                var70 = this.field5499.field10466;
            }
            float var71 = 3.0F / (float) this.field5541;
            var12.field5262 = var10;
            float var72 = 3.0F / (float) (this.field5541 / 2 + this.field5541);
            if (this.field5546.field9772) {
                for (int var73 = 0; var73 < this.field5498; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1628((float) var70[var73] * var72, 8625);
                        var12.method1628((float) var67[var73] * var72, 8625);
                        var12.method1628((float) var69[var73] * var72, 8625);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1628((float) var70[var73] * var75, 8625);
                        var12.method1628((float) var67[var73] * var75, 8625);
                        var12.method1628((float) var69[var73] * var75, 8625);
                    }
                    var12.field5262 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field5498; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1626((float) var70[var76] * var72, -44927608);
                        var12.method1626((float) var67[var76] * var72, -44927608);
                        var12.method1626((float) var69[var76] * var72, arg1 ^ 0xFD527577);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1626((float) var70[var76] * var78, -44927608);
                        var12.method1626((float) var67[var76] * var78, arg1 - 44927863);
                        var12.method1626((float) var69[var76] * var78, -44927608);
                    }
                    var12.field5262 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field5262 = var11;
            if (this.field5546.field9772) {
                for (int var80 = 0; var80 < this.field5498; var80++) {
                    var12.method1628(this.field5607[var80], 8625);
                    var12.method1628(this.field5589[var80], 8625);
                    var12.field5262 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field5498; var79++) {
                    var12.method1626(this.field5607[var79], arg1 ^ 0xFD527577);
                    var12.method1626(this.field5589[var79], -44927608);
                    var12.field5262 += var7 - 8;
                }
            }
        }
        var12.field5262 = this.field5498 * var7;
        class339 var81;
        if (arg0) {
            if (this.field5496 == null) {
                this.field5496 = this.field5546.method3904(var12.field5262, (byte) 124, true, var12.field5275, var7);
            } else {
                this.field5496.method467(-127, var12.field5262, var7, var12.field5275);
            }
            var81 = this.field5496;
            this.field5609 = 0;
        } else {
            var81 = this.field5546.method3904(var12.field5262, (byte) 124, false, var12.field5275, var7);
            this.field5542 = true;
        }
        if (arg1 != 255) {
            this.field5536 = null;
        }
        if (var5) {
            this.field5515.field7650 = var81;
            this.field5515.field7648 = var8;
        }
        if (var6) {
            this.field5572.field7648 = var11;
            this.field5572.field7650 = var81;
        }
        if (var3) {
            this.field5500.field7648 = var9;
            this.field5500.field7650 = var81;
        }
        if (var4) {
            this.field5511.field7650 = var81;
            this.field5511.field7648 = var10;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V", line = 834)
    public static void method2512(int arg0) {
        if (arg0 != 2575) {
            method2525(-104, null, -26);
        }
        field5604 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lnfa;I)V", line = 844)
    private final void method2513(class709 arg0, int arg1) {
        field5532++;
        if (this.field5498 > this.field5546.field9873.length) {
            this.field5546.field9876 = new int[this.field5498];
            this.field5546.field9873 = new int[this.field5498];
        }
        int[] var3 = this.field5546.field9873;
        int[] var4 = this.field5546.field9876;
        for (int var5 = 0; var5 < this.field5581; var5++) {
            int var16 = (this.field5547[var5] - (this.field5569[var5] * this.field5546.field9784 >> 8) >> this.field5546.field9727) - arg0.field9960;
            int var17 = (this.field5517[var5] - (this.field5569[var5] * this.field5546.field9785 >> 8) >> this.field5546.field9727) - arg0.field9959;
            int var18 = this.field5506[var5];
            int var19 = this.field5506[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field5594[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field5505; var6++) {
            if (this.field5562 == null || this.field5562[var6] <= 128) {
                short var7 = this.field5537[var6];
                short var8 = this.field5599[var6];
                short var9 = this.field5524[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - (var12 - var11) * (var14 - var13)) > 0) {
                    arg0.method4021(var14, var12, var13, var11, -118, var15, var10);
                }
            }
        }
        if (arg1 != -10711) {
            this.method355(null, null, 62);
        }
    }

    @OriginalMember(owner = "client!df", name = "r", descriptor = "()Z", line = 930)
    public final boolean method391() {
        field5514++;
        return this.field5494;
    }

    @OriginalMember(owner = "client!df", name = "ma", descriptor = "()I", line = 939)
    public final int method394() {
        field5516++;
        if (!this.field5579) {
            this.method2522(-65);
        }
        return this.field5495;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V", line = 952)
    public final void method382(int arg0, int arg1, int arg2, int arg3) {
        field5493++;
        for (int var5 = 0; var5 < this.field5540; var5++) {
            int var9 = this.field5536[var5] & 0xFFFF;
            int var10 = (var9 & 0xFF4B) >> 10;
            int var11 = (var9 & 0x391) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field5536[var5] = (short) class5.method105(var12, class5.method105(var10 << 10, var11 << 7));
        }
        if (this.field5554 != null) {
            for (int var6 = 0; var6 < this.field5527; var6++) {
                class16 var7 = this.field5554[var6];
                class237 var8 = this.field5543[var6];
                var8.field2799 = var8.field2799 & 0xFF000000 | class437.field5749[this.field5536[var7.field288] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5500 != null) {
            this.field5500.field7650 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "na", descriptor = "()I", line = 1011)
    public final int method367() {
        field5502++;
        if (!this.field5579) {
            this.method2522(87);
        }
        return this.field5573;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "()Z", line = 1023)
    public final boolean method385() {
        field5580++;
        if (this.field5548 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5548.length; var1++) {
            if (this.field5548[var1] != -1 && !this.field5546.field890.method1137(12429, this.field5548[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBIIIIII)Z", line = 1051)
    private final boolean method2514(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5558++;
        if (arg2 < 16) {
            this.method398(-121);
        }
        if (arg6 > arg8 && arg1 > arg8 && arg5 > arg8) {
            return false;
        } else if (arg8 > arg6 && arg8 > arg1 && arg5 < arg8) {
            return false;
        } else if (arg3 > arg4 && arg4 < arg0 && arg4 < arg7) {
            return false;
        } else {
            return arg3 >= arg4 || arg4 <= arg0 || arg4 <= arg7;
        }
    }

    @OriginalMember(owner = "client!df", name = "k", descriptor = "(I)V", line = 1077)
    public final void method375(int arg0) {
        field5504++;
        int var2 = class789.field10868[arg0];
        int var3 = class789.field10864[arg0];
        for (int var4 = 0; var4 < this.field5581; var4++) {
            int var7 = this.field5547[var4] * var3 + this.field5517[var4] * var2 >> 14;
            this.field5517[var4] = this.field5517[var4] * var3 - (this.field5547[var4] * var2) >> 14;
            this.field5547[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5498; var5++) {
            int var6 = this.field5617[var5] * var3 + this.field5575[var5] * var2 >> 14;
            this.field5575[var5] = (short) (this.field5575[var5] * var3 - (this.field5617[var5] * var2) >> 14);
            this.field5617[var5] = (short) var6;
        }
        if (this.field5511 == null && this.field5500 != null) {
            this.field5500.field7650 = null;
        }
        if (this.field5511 != null) {
            this.field5511.field7650 = null;
        }
        if (this.field5515 != null) {
            this.field5515.field7650 = null;
        }
        this.field5579 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B[B)Ljava/lang/String;", line = 1127)
    public static final String method2515(byte arg0, byte[] arg1) {
        if (arg0 > -67) {
            field5613 = -19;
        }
        field5614++;
        return class260.method1555(arg1, 0, 2000, arg1.length);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 1139)
    public final void method360(int arg0) {
        field5555++;
        int var2 = class789.field10868[arg0];
        int var3 = class789.field10864[arg0];
        for (int var4 = 0; var4 < this.field5581; var4++) {
            int var5 = this.field5547[var4] * var3 + this.field5517[var4] * var2 >> 14;
            this.field5517[var4] = this.field5517[var4] * var3 - this.field5547[var4] * var2 >> 14;
            this.field5547[var4] = var5;
        }
        if (this.field5515 != null) {
            this.field5515.field7650 = null;
        }
        this.field5579 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lnh;)V", line = 1169)
    public final void method389(class778 arg0) {
        field5571++;
        class446 var2 = (class446) arg0;
        if (this.field5507 != null) {
            for (int var3 = 0; var3 < this.field5507.length; var3++) {
                class62 var4 = this.field5507[var3];
                class62 var5 = var4;
                if (var4.field846 != null) {
                    var5 = var4.field846;
                }
                var5.field834 = (int) ((float) this.field5517[var4.field844] * var2.field5999 + (float) this.field5569[var4.field844] * var2.field5976 + (float) this.field5547[var4.field844] * var2.field5987 + var2.field5993);
                var5.field849 = (int) ((float) this.field5517[var4.field844] * var2.field5981 + (float) this.field5569[var4.field844] * var2.field5982 + (float) this.field5547[var4.field844] * var2.field5986 + var2.field5969);
                var5.field840 = (int) ((float) this.field5517[var4.field844] * var2.field5977 + (float) this.field5569[var4.field844] * var2.field5983 + (float) this.field5547[var4.field844] * var2.field6007 + var2.field5995);
                var5.field833 = (int) ((float) this.field5517[var4.field843] * var2.field5999 + (float) this.field5569[var4.field843] * var2.field5976 + (float) this.field5547[var4.field843] * var2.field5987 + var2.field5993);
                var5.field835 = (int) ((float) this.field5517[var4.field843] * var2.field5981 + (float) this.field5569[var4.field843] * var2.field5982 + (float) this.field5547[var4.field843] * var2.field5986 + var2.field5969);
                var5.field827 = (int) ((float) this.field5517[var4.field843] * var2.field5977 + (float) this.field5569[var4.field843] * var2.field5983 + (float) this.field5547[var4.field843] * var2.field6007 + var2.field5995);
                var5.field828 = (int) ((float) this.field5517[var4.field839] * var2.field5999 + (float) this.field5569[var4.field839] * var2.field5976 + (float) this.field5547[var4.field839] * var2.field5987 + var2.field5993);
                var5.field832 = (int) ((float) this.field5517[var4.field839] * var2.field5981 + (float) this.field5569[var4.field839] * var2.field5982 + (float) this.field5547[var4.field839] * var2.field5986 + var2.field5969);
                var5.field848 = (int) ((float) this.field5517[var4.field839] * var2.field5977 + (float) this.field5569[var4.field839] * var2.field5983 + (float) this.field5547[var4.field839] * var2.field6007 + var2.field5995);
            }
        }
        if (this.field5556 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5556.length; var6++) {
            class28 var7 = this.field5556[var6];
            class28 var8 = var7;
            if (var7.field431 != null) {
                var8 = var7.field431;
            }
            if (var7.field427 == null) {
                var7.field427 = var2.method136();
            } else {
                var7.field427.method141(var2);
            }
            var8.field432 = (int) ((float) this.field5517[var7.field424] * var2.field5999 + (float) this.field5569[var7.field424] * var2.field5976 + (float) this.field5547[var7.field424] * var2.field5987 + var2.field5993);
            var8.field435 = (int) ((float) this.field5517[var7.field424] * var2.field5981 + (float) this.field5569[var7.field424] * var2.field5982 + (float) this.field5547[var7.field424] * var2.field5986 + var2.field5969);
            var8.field425 = (int) ((float) this.field5517[var7.field424] * var2.field5977 + (float) this.field5569[var7.field424] * var2.field5983 + (float) this.field5547[var7.field424] * var2.field6007 + var2.field5995);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILnh;ZI)Z", line = 1236)
    public final boolean method363(int arg0, int arg1, class778 arg2, boolean arg3, int arg4) {
        field5529++;
        return this.method2519(arg0, -99, arg2, arg3, -1, arg4, arg1);
    }

    @OriginalMember(owner = "client!df", name = "ua", descriptor = "()I", line = 1244)
    public final int method396() {
        field5602++;
        return this.field5526;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V", line = 1254)
    private final void method2516(int arg0) {
        field5605++;
        if (this.field5505 == 0) {
            return;
        }
        if (this.field5609 != 0) {
            this.method2511(true, 255);
        }
        this.method2511(false, 255);
        if (this.field5576 != null) {
            if (this.field5576.field1357 == null) {
                this.method2520((this.field5609 & 0x10) != 0, 5123);
            }
            if (this.field5576.field1357 != null) {
                this.field5546.method3892(this.field5511 != null, 1);
                this.field5546.method3935(this.field5572, this.field5515, this.field5500, this.field5511, arg0 + 2407);
                int var2 = this.field5523.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5523[var3];
                    int var5 = this.field5523[var3 + 1];
                    int var6 = this.field5548[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field5546.method3966(var6, (byte) 58, this.field5511 != null);
                    this.field5546.method3944(4, var4 * 3, (byte) 78, (var5 - var4) * 3, this.field5576.field1357);
                }
            }
        }
        this.method2510(arg0);
    }

    @OriginalMember(owner = "client!df", name = "RA", descriptor = "()I", line = 1315)
    public final int method383() {
        if (!this.field5579) {
            this.method2522(-67);
        }
        field5533++;
        return this.field5574;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lnh;Lgca;II)V", line = 1328)
    public final void method388(class778 arg0, class265 arg1, int arg2, int arg3) {
        field5534++;
        if (this.field5498 == 0) {
            return;
        }
        class446 var5 = this.field5546.field9754;
        class446 var6 = (class446) arg0;
        if (!this.field5579) {
            this.method2522(103);
        }
        class680.field9313 = var5.field5977 * var6.field5995 + var5.field6007 * var6.field5993 + var5.field5983 * var6.field5969 + var5.field5995;
        class5.field56 = var5.field5977 * var6.field5983 + var5.field6007 * var6.field5976 + var5.field5983 * var6.field5982;
        float var7 = (float) this.field5584 * class5.field56 + class680.field9313;
        float var8 = (float) this.field5549 * class5.field56 + class680.field9313;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) this.field5573 + var7;
            var10 = (float) (-this.field5573) + var8;
        } else {
            var10 = var7 - (float) this.field5573;
            var9 = (float) this.field5573 + var8;
        }
        if ((this.field5546.field9862 <= var10) || ((float) this.field5546.field9824 >= var9)) {
            return;
        }
        class366.field4543 = var5.field5999 * var6.field5995 + var5.field5987 * var6.field5993 + var5.field5976 * var6.field5969 + var5.field5993;
        class7.field125 = var5.field5999 * var6.field5983 + var5.field5987 * var6.field5976 + var5.field5976 * var6.field5982;
        float var11 = (float) this.field5584 * class7.field125 + class366.field4543;
        float var12 = (float) this.field5549 * class7.field125 + class366.field4543;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = ((float) this.field5573 + var11) * (float) this.field5546.field9855;
            var14 = (var12 - (float) this.field5573) * (float) this.field5546.field9855;
        } else {
            var13 = ((float) this.field5573 + var12) * (float) this.field5546.field9855;
            var14 = ((float) (-this.field5573) + var11) * (float) this.field5546.field9855;
        }
        if ((var14 / (float) arg2 >= this.field5546.field9829) || (var13 / (float) arg2 <= this.field5546.field9853)) {
            return;
        }
        class657.field9058 = var5.field5981 * var6.field5983 + var5.field5986 * var6.field5976 + var5.field5982 * var6.field5982;
        class708.field9939 = var5.field5981 * var6.field5995 + var5.field5986 * var6.field5993 + var5.field5982 * var6.field5969 + var5.field5969;
        float var15 = (float) this.field5584 * class657.field9058 + class708.field9939;
        float var16 = (float) this.field5549 * class657.field9058 + class708.field9939;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) (-this.field5573) + var16) * (float) this.field5546.field9776;
            var18 = ((float) this.field5573 + var15) * (float) this.field5546.field9776;
        } else {
            var18 = ((float) this.field5573 + var16) * (float) this.field5546.field9776;
            var17 = (var15 - (float) this.field5573) * (float) this.field5546.field9776;
        }
        if ((this.field5546.field9773 <= var17 / (float) arg2) || (this.field5546.field9792 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field5554 != null) {
            class239.field2803 = var5.field5981 * var6.field5977 + var5.field5986 * var6.field5999 + var5.field5982 * var6.field5981;
            class30.field479 = var5.field5977 * var6.field5977 + var5.field6007 * var6.field5999 + var5.field5983 * var6.field5981;
            class298.field3557 = var5.field5999 * var6.field5977 + var5.field5987 * var6.field5999 + var5.field5976 * var6.field5981;
            class141.field1766 = var5.field5981 * var6.field6007 + var5.field5986 * var6.field5987 + var5.field5982 * var6.field5986;
            class470.field6559 = var5.field5999 * var6.field6007 + var5.field5987 * var6.field5987 + var5.field5976 * var6.field5986;
            class776.field10711 = var5.field5977 * var6.field6007 + var5.field6007 * var6.field5987 + var5.field5983 * var6.field5986;
        }
        if (arg1 != null) {
            int var19 = this.field5574 + this.field5535 >> 1;
            int var20 = this.field5591 + this.field5510 >> 1;
            int var21 = (int) ((float) var20 * class298.field3557 + (float) this.field5584 * class7.field125 + (float) var19 * class470.field6559 + class366.field4543);
            int var22 = (int) ((float) var20 * class239.field2803 + (float) this.field5584 * class657.field9058 + (float) var19 * class141.field1766 + class708.field9939);
            int var23 = (int) ((float) var20 * class30.field479 + (float) this.field5584 * class5.field56 + (float) var19 * class776.field10711 + class680.field9313);
            int var24 = (int) ((float) var20 * class298.field3557 + (float) this.field5549 * class7.field125 + (float) var19 * class470.field6559 + class366.field4543);
            int var25 = (int) ((float) var20 * class239.field2803 + (float) this.field5549 * class657.field9058 + (float) var19 * class141.field1766 + class708.field9939);
            arg1.field3135 = this.field5546.field9769 + (this.field5546.field9855 * var24 / arg2);
            arg1.field3133 = this.field5546.field9776 * var22 / arg2 + this.field5546.field9812;
            arg1.field3138 = this.field5546.field9776 * var25 / arg2 + this.field5546.field9812;
            arg1.field3136 = this.field5546.field9855 * var21 / arg2 + this.field5546.field9769;
            int var26 = (int) ((float) var20 * class30.field479 + (float) this.field5549 * class5.field56 + (float) var19 * class776.field10711 + class680.field9313);
            if (var23 >= this.field5546.field9824 || var26 >= this.field5546.field9824) {
                arg1.field3137 = true;
                arg1.field3134 = (this.field5573 + var21) * this.field5546.field9855 / arg2 + this.field5546.field9769 - arg1.field3136;
            }
        }
        this.field5546.method3958(-895270824, (float) arg2);
        this.field5546.method3934(126);
        this.field5546.method3965(var6, (byte) 95);
        this.method2516(0);
        this.field5546.method3923(-1);
        this.method2521((byte) -104);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BISII)I", line = 1475)
    private final int method2517(byte arg0, int arg1, short arg2, int arg3, int arg4) {
        field5570++;
        int var6 = class437.field5749[class151.method1083(arg1, arg4 + 128, arg3)];
        if (arg2 != -1) {
            class359 var7 = this.field5546.field890.method1138(arg2 & 0xFFFF, 55);
            int var8 = var7.field4462 & 0xFF;
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
            int var12 = var7.field4458 & 0xFF;
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
                var6 = ((var13 & 0x1E00FF00) << 8) + ((var14 & 0xFF00) + (var15 >> 8));
            }
        }
        if (arg4 != 65280) {
            this.method352();
        }
        return (var6 << 8) + 255 - (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!df", name = "P", descriptor = "(IIII)V", line = 1553)
    public final void method386(int arg0, int arg1, int arg2, int arg3) {
        field5615++;
        if (arg0 == 0) {
            class26.field416 = 0;
            int var5 = 0;
            class241.field2838 = 0;
            class318.field3918 = 0;
            for (int var6 = 0; var6 < this.field5581; var6++) {
                class26.field416 += this.field5547[var6];
                class318.field3918 += this.field5569[var6];
                var5++;
                class241.field2838 += this.field5517[var6];
            }
            if (var5 <= 0) {
                class26.field416 = arg1;
                class241.field2838 = arg3;
                class318.field3918 = arg2;
            } else {
                class26.field416 = class26.field416 / var5 + arg1;
                class318.field3918 = class318.field3918 / var5 + arg2;
                class241.field2838 = class241.field2838 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5581; var7++) {
                this.field5547[var7] += arg1;
                this.field5569[var7] += arg2;
                this.field5517[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5581; var8++) {
                this.field5547[var8] -= class26.field416;
                this.field5569[var8] -= class318.field3918;
                this.field5517[var8] -= class241.field2838;
                if (arg3 != 0) {
                    int var9 = class789.field10868[arg3];
                    int var10 = class789.field10864[arg3];
                    int var11 = this.field5569[var8] * var9 + this.field5547[var8] * var10 + 16383 >> 14;
                    this.field5569[var8] = this.field5569[var8] * var10 + 16383 - (this.field5547[var8] * var9) >> 14;
                    this.field5547[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class789.field10868[arg1];
                    int var13 = class789.field10864[arg1];
                    int var14 = this.field5569[var8] * var13 + 16383 - (this.field5517[var8] * var12) >> 14;
                    this.field5517[var8] = this.field5569[var8] * var12 + this.field5517[var8] * var13 + 16383 >> 14;
                    this.field5569[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class789.field10868[arg2];
                    int var16 = class789.field10864[arg2];
                    int var17 = this.field5517[var8] * var15 - (-(this.field5547[var8] * var16) - 16383) >> 14;
                    this.field5517[var8] = this.field5517[var8] * var16 + 16383 - (this.field5547[var8] * var15) >> 14;
                    this.field5547[var8] = var17;
                }
                this.field5547[var8] += class26.field416;
                this.field5569[var8] += class318.field3918;
                this.field5517[var8] += class241.field2838;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5581; var18++) {
                this.field5547[var18] -= class26.field416;
                this.field5569[var18] -= class318.field3918;
                this.field5517[var18] -= class241.field2838;
                this.field5547[var18] = this.field5547[var18] * arg1 / 128;
                this.field5569[var18] = this.field5569[var18] * arg2 / 128;
                this.field5517[var18] = this.field5517[var18] * arg3 / 128;
                this.field5547[var18] += class26.field416;
                this.field5569[var18] += class318.field3918;
                this.field5517[var18] += class241.field2838;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5540; var19++) {
                int var23 = (this.field5562[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5562[var19] = (byte) var23;
            }
            if (this.field5500 != null) {
                this.field5500.field7650 = null;
            }
            if (this.field5554 != null) {
                for (int var20 = 0; var20 < this.field5527; var20++) {
                    class16 var21 = this.field5554[var20];
                    class237 var22 = this.field5543[var20];
                    var22.field2799 = 255 - (this.field5562[var21.field288] & 0xFF) << 24 | var22.field2799 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5540; var24++) {
                int var28 = this.field5536[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field5536[var24] = (short) class5.method105(class5.method105(var33 << 7, var31 << 10), var34);
            }
            if (this.field5500 != null) {
                this.field5500.field7650 = null;
            }
            if (this.field5554 != null) {
                for (int var25 = 0; var25 < this.field5527; var25++) {
                    class16 var26 = this.field5554[var25];
                    class237 var27 = this.field5543[var25];
                    var27.field2799 = class437.field5749[this.field5536[var26.field288] & 0xFFFF] & 0xFFFFFF | var27.field2799 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5527; var35++) {
                class237 var36 = this.field5543[var35];
                var36.field2794 += arg2;
                var36.field2793 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5527; var37++) {
                class237 var38 = this.field5543[var37];
                var38.field2791 = var38.field2791 * arg1 >> 7;
                var38.field2801 = var38.field2801 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5527; var39++) {
                class237 var40 = this.field5543[var39];
                var40.field2800 = var40.field2800 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "F", descriptor = "()Z", line = 1859)
    public final boolean method380() {
        field5592++;
        return this.field5522;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lka;IIIZ)V", line = 1867)
    public final void method384(class498 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5551++;
        class421 var6 = (class421) arg0;
        if (this.field5540 == 0 || var6.field5540 == 0) {
            return;
        }
        int var7 = var6.field5581;
        int[] var8 = var6.field5547;
        int[] var9 = var6.field5569;
        int[] var10 = var6.field5517;
        short[] var11 = var6.field5617;
        short[] var12 = var6.field5598;
        short[] var13 = var6.field5575;
        byte[] var14 = var6.field5582;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field5499 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var16 = this.field5499.field10463;
            var15 = this.field5499.field10462;
            var17 = this.field5499.field10465;
            var18 = this.field5499.field10466;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5499 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field5499.field10465;
            var21 = var6.field5499.field10466;
            var20 = var6.field5499.field10463;
            var22 = var6.field5499.field10462;
        }
        int[] var23 = var6.field5506;
        short[] var24 = var6.field5594;
        if (!var6.field5579) {
            var6.method2522(-69);
        }
        short var25 = var6.field5584;
        short var26 = var6.field5549;
        short var27 = var6.field5535;
        short var28 = var6.field5574;
        short var29 = var6.field5510;
        short var30 = var6.field5591;
        for (int var31 = 0; var31 < this.field5581; var31++) {
            int var32 = this.field5569[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field5547[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field5517[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5506[var31];
                        int var37 = this.field5506[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5594[var38] - 1;
                            if (var35 == -1 || this.field5582[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = -1;
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var40; var43 < var42; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var18 == null) {
                                            this.field5499 = new class755();
                                            var18 = this.field5499.field10466 = class89.method812(this.field5617, 0);
                                            var17 = this.field5499.field10465 = class89.method812(this.field5598, 0);
                                            var15 = this.field5499.field10462 = class89.method812(this.field5575, 0);
                                            var16 = this.field5499.field10463 = class85.method789((byte) -85, this.field5582);
                                        }
                                        if (var21 == null) {
                                            class755 var44 = var6.field5499 = new class755();
                                            var21 = var44.field10466 = class89.method812(var11, 0);
                                            var19 = var44.field10465 = class89.method812(var12, 0);
                                            var22 = var44.field10462 = class89.method812(var13, 0);
                                            var20 = var44.field10463 = class85.method789((byte) -75, var14);
                                        }
                                        short var45 = this.field5617[var35];
                                        short var46 = this.field5598[var35];
                                        short var47 = this.field5575[var35];
                                        byte var48 = this.field5582[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var21[var52] += var45;
                                                var19[var52] += var46;
                                                var22[var52] += var47;
                                                var20[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var41];
                                        int var54 = this.field5506[var31];
                                        int var55 = this.field5506[var31 + 1];
                                        short var56 = var12[var41];
                                        short var57 = var13[var41];
                                        byte var58 = var14[var41];
                                        for (int var59 = var54; var59 < var55; var59++) {
                                            int var60 = this.field5594[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var18[var60] += var53;
                                                var17[var60] += var56;
                                                var15[var60] += var57;
                                                var16[var60] += var58;
                                            }
                                        }
                                        if (this.field5511 == null && this.field5500 != null) {
                                            this.field5500.field7650 = null;
                                        }
                                        if (this.field5511 != null) {
                                            this.field5511.field7650 = null;
                                        }
                                        if (var6.field5511 == null && var6.field5500 != null) {
                                            var6.field5500.field7650 = null;
                                        }
                                        if (var6.field5511 != null) {
                                            var6.field5511.field7650 = null;
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

    @OriginalMember(owner = "client!df", name = "FA", descriptor = "(I)V", line = 2137)
    public final void method398(int arg0) {
        field5501++;
        int var2 = class789.field10868[arg0];
        int var3 = class789.field10864[arg0];
        for (int var4 = 0; var4 < this.field5581; var4++) {
            int var5 = this.field5569[var4] * var3 - (this.field5517[var4] * var2) >> 14;
            this.field5517[var4] = this.field5569[var4] * var2 + this.field5517[var4] * var3 >> 14;
            this.field5569[var4] = var5;
        }
        this.field5579 = false;
        if (this.field5515 != null) {
            this.field5515.field7650 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lpc;)V", line = 5795)
    public class421(class700 arg0) {
        this.field5546 = arg0;
        this.field5515 = new class550(null, 5126, 3, 0);
        this.field5572 = new class550(null, 5126, 2, 0);
        this.field5511 = new class550(null, 5126, 3, 0);
        this.field5500 = new class550(null, 5121, 4, 0);
        this.field5576 = new class108();
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lpc;Lso;IIII)V", line = 5807)
    public class421(class700 arg0, class496 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5546 = arg0;
        this.field5595 = arg5;
        this.field5526 = arg2;
        if (class377.method2211(arg5, 2048, arg2)) {
            this.field5515 = new class550(null, 5126, 3, 0);
        }
        if (class12.method189(-108, arg5, arg2)) {
            this.field5572 = new class550(null, 5126, 2, 0);
        }
        if (class123.method957(arg2, false, arg5)) {
            this.field5511 = new class550(null, 5126, 3, 0);
        }
        if (class314.method1850(arg5, 110, arg2)) {
            this.field5500 = new class550(null, 5121, 4, 0);
        }
        if (class26.method255(arg2, false, arg5)) {
            this.field5576 = new class108();
        }
        class162 var7 = arg0.field890;
        this.field5506 = new int[arg1.field6908 + 1];
        int[] var8 = new int[arg1.field6897];
        for (int var9 = 0; var9 < arg1.field6897; var9++) {
            if (arg1.field6939 == null || arg1.field6939[var9] != 2) {
                if (arg1.field6912 != null && arg1.field6912[var9] != -1) {
                    class359 var173 = var7.method1138(arg1.field6912[var9] & 0xFFFF, 34);
                    if (((this.field5595 & 0x40) == 0 || !var173.field4464) && var173.field4455) {
                        continue;
                    }
                }
                var8[this.field5540++] = var9;
                this.field5506[arg1.field6900[var9]]++;
                this.field5506[arg1.field6936[var9]]++;
                this.field5506[arg1.field6921[var9]]++;
            }
        }
        this.field5505 = this.field5540;
        long[] var10 = new long[this.field5540];
        boolean var11 = (this.field5526 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field5540; var12++) {
            int var156 = var8[var12];
            class359 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field6938 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field6938.length; var163++) {
                    class33 var164 = arg1.field6938[var163];
                    if (var164.field511 == var156) {
                        class73 var165 = class65.method547(false, var164.field521);
                        if (var165.field1000) {
                            var162 = true;
                        }
                        if (var165.field1004 != -1) {
                            class359 var166 = var7.method1138(var165.field1004, 48);
                            if (var166.field4457 == 2) {
                                this.field5522 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field5505--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field6912 != null) {
                var167 = arg1.field6912[var156];
                if (var167 != -1) {
                    var157 = var7.method1138(var167 & 0xFFFF, 83);
                    if ((this.field5595 & 0x40) != 0 && var157.field4464) {
                        var167 = -1;
                        var157 = null;
                    } else {
                        if (var157.field4444 != 0 || var157.field4449 != 0) {
                            this.field5494 = true;
                        }
                        var160 = var157.field4459;
                        var161 = var157.field4445;
                    }
                }
            }
            boolean var168 = arg1.field6903 != null && arg1.field6903[var156] != 0 || var157 != null && var157.field4457 != 0;
            if ((var11 || var168) && arg1.field6941 != null) {
                var158 += arg1.field6941[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = ((var167 & 0xFFFF) << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + (long) var172;
            this.field5494 |= var157 != null && (var157.field4444 != 0 || var157.field4449 != 0);
            this.field5522 |= var168;
        }
        class96.method840(var10, var8, 73);
        this.field5517 = arg1.field6894;
        this.field5569 = arg1.field6913;
        this.field5552 = arg1.field6928;
        this.field5581 = arg1.field6908;
        this.field5508 = arg1.field6905;
        this.field5547 = arg1.field6926;
        this.field5507 = arg1.field6904;
        class484[] var13 = new class484[this.field5581];
        this.field5556 = arg1.field6910;
        if (arg1.field6938 != null) {
            this.field5527 = arg1.field6938.length;
            this.field5543 = new class237[this.field5527];
            this.field5554 = new class16[this.field5527];
            for (int var14 = 0; var14 < this.field5527; var14++) {
                class33 var15 = arg1.field6938[var14];
                class73 var16 = class65.method547(false, var15.field521);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5540; var18++) {
                    if (var8[var18] == var15.field511) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class437.field5749[arg1.field6918[var15.field511] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field6903 == null ? 0 : arg1.field6903[var15.field511]) << 24;
                this.field5554[var14] = new class16(var17, arg1.field6900[var15.field511], arg1.field6936[var15.field511], arg1.field6921[var15.field511], var16.field999, var16.field1007, var16.field1004, var16.field1002, var16.field1006, var16.field1000, var16.field1003, var15.field512);
                this.field5543[var14] = new class237(var20);
            }
        }
        int var21 = this.field5540 * 3;
        this.field5575 = new short[var21];
        this.field5607 = new float[var21];
        this.field5589 = new float[var21];
        this.field5594 = new short[var21];
        if (arg1.field6907 != null) {
            this.field5518 = new short[this.field5540];
        }
        this.field5536 = new short[this.field5540];
        this.field5548 = new short[this.field5540];
        this.field5617 = new short[var21];
        this.field5599 = new short[this.field5540];
        this.field5582 = new byte[var21];
        this.field5562 = new byte[this.field5540];
        this.field5541 = (short) arg4;
        this.field5598 = new short[var21];
        this.field5537 = new short[this.field5540];
        this.field5566 = (short) arg3;
        class272.field3202 = new long[var21];
        this.field5524 = new short[this.field5540];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field6908; var23++) {
            int var155 = this.field5506[var23];
            this.field5506[var23] = var22;
            var22 += var155;
            var13[var23] = new class484();
        }
        this.field5506[arg1.field6908] = var22;
        class149 var24 = class585.method3361(arg1, var8, (byte) -51, this.field5540);
        class249[] var25 = new class249[arg1.field6897];
        for (int var26 = 0; var26 < arg1.field6897; var26++) {
            short var134 = arg1.field6900[var26];
            short var135 = arg1.field6936[var26];
            short var136 = arg1.field6921[var26];
            int var137 = this.field5547[var135] - this.field5547[var134];
            int var138 = this.field5569[var135] - this.field5569[var134];
            int var139 = this.field5517[var135] - this.field5517[var134];
            int var140 = this.field5547[var136] - this.field5547[var134];
            int var141 = this.field5569[var136] - this.field5569[var134];
            int var142 = this.field5517[var136] - this.field5517[var134];
            int var143 = var138 * var142 - var139 * var141;
            int var144 = var139 * var140 - (var137 * var142);
            int var145;
            for (var145 = var137 * var141 - (var138 * var140); var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192; var145 >>= 0x1) {
                var144 >>= 0x1;
                var143 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var143 * var143 + var145 * var145 + (var144 * var144)));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var144 * 256 / var146;
            int var148 = var143 * 256 / var146;
            int var149 = var145 * 256 / var146;
            byte var150 = arg1.field6939 == null ? 0 : arg1.field6939[var26];
            if (var150 == 0) {
                class484 var151 = var13[var134];
                var151.field6753 += var148;
                var151.field6747++;
                var151.field6752 += var147;
                var151.field6750 += var149;
                class484 var152 = var13[var135];
                var152.field6752 += var147;
                var152.field6747++;
                var152.field6750 += var149;
                var152.field6753 += var148;
                class484 var153 = var13[var136];
                var153.field6750 += var149;
                var153.field6747++;
                var153.field6752 += var147;
                var153.field6753 += var148;
            } else if (var150 == 1) {
                class249 var154 = var25[var26] = new class249();
                var154.field2929 = var149;
                var154.field2930 = var147;
                var154.field2933 = var148;
            }
        }
        for (int var27 = 0; var27 < this.field5540; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field6918[var43] & 0xFFFF;
            int var45;
            if (arg1.field6915 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field6915[var43];
            }
            int var46;
            if (arg1.field6903 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field6903[var43] & 0xFF;
            }
            short var47 = arg1.field6912 == null ? -1 : arg1.field6912[var43];
            if (var47 != -1 && (this.field5595 & 0x40) != 0) {
                class359 var48 = var7.method1138(var47 & 0xFFFF, 29);
                if (var48.field4464) {
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
                    var53 = 0.0F;
                    var56 = 2;
                    var55 = 1;
                    var54 = 0.0F;
                    var49 = 0.0F;
                    var51 = 1.0F;
                    var52 = 1.0F;
                    var50 = 1.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field6898[var45];
                    if (var58 == 0) {
                        short var87 = arg1.field6900[var43];
                        short var88 = arg1.field6936[var43];
                        short var89 = arg1.field6921[var43];
                        short var90 = arg1.field6932[var45];
                        short var91 = arg1.field6937[var45];
                        short var92 = arg1.field6895[var45];
                        float var93 = (float) arg1.field6926[var90];
                        float var94 = (float) arg1.field6913[var90];
                        float var95 = (float) arg1.field6894[var90];
                        float var96 = (float) arg1.field6926[var91] - var93;
                        float var97 = (float) arg1.field6913[var91] - var94;
                        float var98 = (float) arg1.field6894[var91] - var95;
                        float var99 = (float) arg1.field6926[var92] - var93;
                        float var100 = (float) arg1.field6913[var92] - var94;
                        float var101 = (float) arg1.field6894[var92] - var95;
                        float var102 = (float) arg1.field6926[var87] - var93;
                        float var103 = (float) arg1.field6913[var87] - var94;
                        float var104 = (float) arg1.field6894[var87] - var95;
                        float var105 = (float) arg1.field6926[var88] - var93;
                        float var106 = (float) arg1.field6913[var88] - var94;
                        float var107 = (float) arg1.field6894[var88] - var95;
                        float var108 = (float) arg1.field6926[var89] - var93;
                        float var109 = (float) arg1.field6913[var89] - var94;
                        float var110 = (float) arg1.field6894[var89] - var95;
                        float var111 = var97 * var101 - (var98 * var100);
                        float var112 = var98 * var99 - var96 * var101;
                        float var113 = var96 * var100 - (var97 * var99);
                        float var114 = var100 * var113 - var101 * var112;
                        float var115 = var101 * var111 - var99 * var113;
                        float var116 = var99 * var112 - var100 * var111;
                        float var117 = 1.0F / (var98 * var116 + var96 * var114 + var97 * var115);
                        var51 = (var107 * var116 + var105 * var114 + var106 * var115) * var117;
                        var53 = (var110 * var116 + var108 * var114 + var109 * var115) * var117;
                        var49 = (var104 * var116 + var102 * var114 + var103 * var115) * var117;
                        float var118 = var97 * var113 - var98 * var112;
                        float var119 = var98 * var111 - (var96 * var113);
                        float var120 = var96 * var112 - (var97 * var111);
                        float var121 = 1.0F / (var101 * var120 + var99 * var118 + var100 * var119);
                        var52 = (var107 * var120 + var105 * var118 + var106 * var119) * var121;
                        var54 = (var110 * var120 + var108 * var118 + var109 * var119) * var121;
                        var50 = (var104 * var120 + var102 * var118 + var103 * var119) * var121;
                    } else {
                        short var59 = arg1.field6900[var43];
                        short var60 = arg1.field6936[var43];
                        short var61 = arg1.field6921[var43];
                        int var62 = var24.field1861[var45];
                        int var63 = var24.field1860[var45];
                        int var64 = var24.field1865[var45];
                        float[] var65 = var24.field1863[var45];
                        byte var66 = arg1.field6943[var45];
                        float var67 = (float) arg1.field6899[var45] / 256.0F;
                        if (var58 == 1) {
                            float var68 = (float) arg1.field6925[var45] / 1024.0F;
                            class728.method4117(arg1.field6913[var59], var68, 0, var63, var65, var67, var64, var62, arg1.field6894[var59], class319.field3956, var66, arg1.field6926[var59]);
                            var50 = class319.field3956[1];
                            var49 = class319.field3956[0];
                            class728.method4117(arg1.field6913[var60], var68, 0, var63, var65, var67, var64, var62, arg1.field6894[var60], class319.field3956, var66, arg1.field6926[var60]);
                            var51 = class319.field3956[0];
                            var52 = class319.field3956[1];
                            class728.method4117(arg1.field6913[var61], var68, 0, var63, var65, var67, var64, var62, arg1.field6894[var61], class319.field3956, var66, arg1.field6926[var61]);
                            var54 = class319.field3956[1];
                            var53 = class319.field3956[0];
                            float var69 = var68 / 2.0F;
                            if ((var66 & 0x1) == 0) {
                                if ((var53 - var49 > var69)) {
                                    var53 -= var68;
                                    var56 = 1;
                                } else if (var49 - var53 > var69) {
                                    var53 += var68;
                                    var56 = 2;
                                }
                                if ((var51 - var49 > var69)) {
                                    var51 -= var68;
                                    var55 = 1;
                                } else if (var69 < var49 - var51) {
                                    var55 = 2;
                                    var51 += var68;
                                }
                            } else {
                                if ((var69 < var52 - var50)) {
                                    var52 -= var68;
                                    var55 = 1;
                                } else if (var69 < var50 - var52) {
                                    var52 += var68;
                                    var55 = 2;
                                }
                                if (var69 < var54 - var50) {
                                    var56 = 1;
                                    var54 -= var68;
                                } else if (var69 < var50 - var54) {
                                    var56 = 2;
                                    var54 += var68;
                                }
                            }
                        } else if (var58 == 2) {
                            float var70 = (float) arg1.field6935[var45] / 256.0F;
                            float var71 = (float) arg1.field6909[var45] / 256.0F;
                            int var72 = arg1.field6926[var60] - arg1.field6926[var59];
                            int var73 = arg1.field6913[var60] - arg1.field6913[var59];
                            int var74 = arg1.field6894[var60] - arg1.field6894[var59];
                            int var75 = arg1.field6926[var61] - arg1.field6926[var59];
                            int var76 = arg1.field6913[var61] - arg1.field6913[var59];
                            int var77 = arg1.field6894[var61] - arg1.field6894[var59];
                            int var78 = var73 * var77 - (var74 * var76);
                            int var79 = var74 * var75 - (var72 * var77);
                            int var80 = var72 * var76 - (var73 * var75);
                            float var81 = 64.0F / (float) arg1.field6945[var45];
                            float var82 = 64.0F / (float) arg1.field6922[var45];
                            float var83 = 64.0F / (float) arg1.field6925[var45];
                            float var84 = (var65[2] * (float) var80 + var65[1] * (float) var79 + var65[0] * (float) var78) / var81;
                            float var85 = (var65[5] * (float) var80 + var65[4] * (float) var79 + var65[3] * (float) var78) / var82;
                            float var86 = (var65[8] * (float) var80 + var65[7] * (float) var79 + var65[6] * (float) var78) / var83;
                            var57 = class98.method842(var85, var84, -23996, var86);
                            class782.method4333(-21631, var70, arg1.field6926[var59], var65, var66, class319.field3956, var63, var71, var64, var57, var67, var62, arg1.field6913[var59], arg1.field6894[var59]);
                            var50 = class319.field3956[1];
                            var49 = class319.field3956[0];
                            class782.method4333(-21631, var70, arg1.field6926[var60], var65, var66, class319.field3956, var63, var71, var64, var57, var67, var62, arg1.field6913[var60], arg1.field6894[var60]);
                            var52 = class319.field3956[1];
                            var51 = class319.field3956[0];
                            class782.method4333(-21631, var70, arg1.field6926[var61], var65, var66, class319.field3956, var63, var71, var64, var57, var67, var62, arg1.field6913[var61], arg1.field6894[var61]);
                            var54 = class319.field3956[1];
                            var53 = class319.field3956[0];
                        } else if (var58 == 3) {
                            class442.method2602(arg1.field6913[var59], var66, var62, var65, class319.field3956, var67, var63, var64, arg1.field6894[var59], arg1.field6926[var59], 3);
                            var50 = class319.field3956[1];
                            var49 = class319.field3956[0];
                            class442.method2602(arg1.field6913[var60], var66, var62, var65, class319.field3956, var67, var63, var64, arg1.field6894[var60], arg1.field6926[var60], 3);
                            var52 = class319.field3956[1];
                            var51 = class319.field3956[0];
                            class442.method2602(arg1.field6913[var61], var66, var62, var65, class319.field3956, var67, var63, var64, arg1.field6894[var61], arg1.field6926[var61], 3);
                            var53 = class319.field3956[0];
                            var54 = class319.field3956[1];
                            if ((var66 & 0x1) == 0) {
                                if ((var51 - var49 > 0.5F)) {
                                    var55 = 1;
                                    var51--;
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
                                if (var52 - var50 > 0.5F) {
                                    var52--;
                                    var55 = 1;
                                } else if (var50 - var52 > 0.5F) {
                                    var52++;
                                    var55 = 2;
                                }
                                if (var54 - var50 > 0.5F) {
                                    var56 = 1;
                                    var54--;
                                } else if (var50 - var54 > 0.5F) {
                                    var56 = 2;
                                    var54++;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field6939 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field6939[var43];
            }
            if (var122 == 0) {
                long var123 = ((long) (var44 << 8) + (long) var46 + (long) (var57 << 24) << 32) + (long) (var45 << 2);
                short var125 = arg1.field6900[var43];
                short var126 = arg1.field6936[var43];
                short var127 = arg1.field6921[var43];
                class484 var128 = var13[var125];
                this.field5537[var27] = this.method2523(var50, var125, var128.field6752, (byte) -125, var49, var128.field6747, var128.field6753, var128.field6750, var123, arg1);
                class484 var129 = var13[var126];
                this.field5599[var27] = this.method2523(var52, var126, var129.field6752, (byte) -126, var51, var129.field6747, var129.field6753, var129.field6750, (long) var55 + var123, arg1);
                class484 var130 = var13[var127];
                this.field5524[var27] = this.method2523(var54, var127, var130.field6752, (byte) -128, var53, var130.field6747, var130.field6753, var130.field6750, (long) var56 + var123, arg1);
            } else if (var122 == 1) {
                class249 var131 = var25[var43];
                long var132 = ((long) (var57 << 24) + ((long) var46) + (long) (var44 << 8) << 32) + (long) ((var131.field2929 + 256 << 22) + (var131.field2933 <= 0 ? 2048 : 1024) + (var131.field2930 + 256 << 12) + (var45 << 2));
                this.field5537[var27] = this.method2523(var50, arg1.field6900[var43], var131.field2930, (byte) -127, var49, 0, var131.field2933, var131.field2929, var132, arg1);
                this.field5599[var27] = this.method2523(var52, arg1.field6936[var43], var131.field2930, (byte) -123, var51, 0, var131.field2933, var131.field2929, (long) var55 + var132, arg1);
                this.field5524[var27] = this.method2523(var54, arg1.field6921[var43], var131.field2930, (byte) -128, var53, 0, var131.field2933, var131.field2929, (long) var56 + var132, arg1);
            }
            if (arg1.field6903 != null) {
                this.field5562[var27] = arg1.field6903[var43];
            }
            if (arg1.field6907 != null) {
                this.field5518[var27] = arg1.field6907[var43];
            }
            this.field5536[var27] = arg1.field6918[var43];
            this.field5548[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field5505; var30++) {
            short var42 = this.field5548[var30];
            if (var29 != var42) {
                var29 = var42;
                var28++;
            }
        }
        this.field5523 = new int[var28 + 1];
        short var31 = -10000;
        int var32 = 0;
        for (int var33 = 0; var33 < this.field5505; var33++) {
            short var41 = this.field5548[var33];
            if (var31 != var41) {
                var31 = var41;
                this.field5523[var32++] = var33;
            }
        }
        this.field5523[var32] = this.field5505;
        class272.field3202 = null;
        this.field5617 = class262.method1571(this.field5617, this.field5498, -22600);
        this.field5598 = class262.method1571(this.field5598, this.field5498, -22600);
        this.field5575 = class262.method1571(this.field5575, this.field5498, -22600);
        this.field5582 = method2525(0, this.field5582, this.field5498);
        this.field5607 = class506.method3036(this.field5498, 5336, this.field5607);
        this.field5589 = class506.method3036(this.field5498, 5336, this.field5589);
        if (arg1.field6906 != null && class343.method2032(arg2, this.field5595, true)) {
            this.field5539 = arg1.method2931(true, false);
        }
        if (arg1.field6938 != null && class529.method3161(this.field5595, -102, arg2)) {
            this.field5497 = arg1.method2919((byte) -20);
        }
        if (arg1.field6891 != null && class589.method3381(this.field5595, arg2, 81)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field5540; var36++) {
                int var40 = arg1.field6891[var8[var36]];
                if (var40 >= 0) {
                    if (var40 > var34) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field5557 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field5557[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field5540; var38++) {
                int var39 = arg1.field6891[var8[var38]];
                if (var39 >= 0) {
                    this.field5557[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "ba", descriptor = "(Lr;)Lr;", line = 2171)
    public final class196 method365(class196 arg0) {
        field5561++;
        if (this.field5498 == 0) {
            return null;
        }
        if (!this.field5579) {
            this.method2522(80);
        }
        int var2;
        int var3;
        if (this.field5546.field9784 <= 0) {
            var2 = this.field5535 - (this.field5546.field9784 * this.field5584 >> 8) >> this.field5546.field9727;
            var3 = this.field5574 - (this.field5546.field9784 * this.field5549 >> 8) >> this.field5546.field9727;
        } else {
            var2 = this.field5535 - (this.field5546.field9784 * this.field5549 >> 8) >> this.field5546.field9727;
            var3 = this.field5574 - (this.field5546.field9784 * this.field5584 >> 8) >> this.field5546.field9727;
        }
        int var4;
        int var5;
        if (this.field5546.field9785 > 0) {
            var4 = this.field5510 - (this.field5546.field9785 * this.field5549 >> 8) >> this.field5546.field9727;
            var5 = this.field5591 - (this.field5546.field9785 * this.field5584 >> 8) >> this.field5546.field9727;
        } else {
            var4 = this.field5510 - (this.field5546.field9785 * this.field5584 >> 8) >> this.field5546.field9727;
            var5 = this.field5591 - (this.field5546.field9785 * this.field5549 >> 8) >> this.field5546.field9727;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class709 var8 = (class709) arg0;
        class709 var9;
        if (var8 != null && var8.method4023(var7, var6, 124)) {
            var9 = var8;
            var8.method4022(-119);
        } else {
            var9 = new class709(this.field5546, var6, var7);
        }
        var9.method4020(var3, 108, var2, var5, var4);
        this.method2513(var9, -10711);
        return var9;
    }

    @OriginalMember(owner = "client!df", name = "NA", descriptor = "()Z", line = 2233)
    public final boolean method356() {
        field5585++;
        if (this.field5539 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5552; var1++) {
            this.field5547[var1] <<= 0x4;
            this.field5569[var1] <<= 0x4;
            this.field5517[var1] <<= 0x4;
        }
        class26.field416 = 0;
        class241.field2838 = 0;
        class318.field3918 = 0;
        return true;
    }

    @OriginalMember(owner = "client!df", name = "VA", descriptor = "(I)V", line = 2262)
    public final void method353(int arg0) {
        field5521++;
        int var2 = class789.field10868[arg0];
        int var3 = class789.field10864[arg0];
        for (int var4 = 0; var4 < this.field5581; var4++) {
            int var5 = this.field5569[var4] * var2 + (this.field5547[var4] * var3) >> 14;
            this.field5569[var4] = this.field5569[var4] * var3 - (this.field5547[var4] * var2) >> 14;
            this.field5547[var4] = var5;
        }
        this.field5579 = false;
        if (this.field5515 != null) {
            this.field5515.field7650 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "p", descriptor = "(IILs;Ls;III)V", line = 2294)
    public final void method354(int arg0, int arg1, class296 arg2, class296 arg3, int arg4, int arg5, int arg6) {
        if (!this.field5579) {
            this.method2522(112);
        }
        field5603++;
        int var8 = this.field5535 + arg4;
        int var9 = this.field5574 + arg4;
        int var10 = this.field5510 + arg6;
        int var11 = this.field5591 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (var9 + arg2.field3525 >> arg2.field3530) >= arg2.field3533 || var10 < 0 || (arg2.field3525 + var11 >> arg2.field3530) >= arg2.field3524) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3533 <= arg3.field3525 + var9 >> arg3.field3530 || var10 < 0 || arg3.field3525 + var11 >> arg3.field3530 >= arg3.field3524) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3530;
            int var13 = var9 + arg2.field3525 - 1 >> arg2.field3530;
            int var14 = var10 >> arg2.field3530;
            int var15 = var11 + arg2.field3525 - 1 >> arg2.field3530;
            if (arg5 == arg2.method1728(var14, (byte) -70, var12) && arg5 == arg2.method1728(var14, (byte) -63, var13) && arg5 == arg2.method1728(var15, (byte) -104, var12) && arg5 == arg2.method1728(var15, (byte) -83, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field5581; var32++) {
                this.field5569[var32] = this.field5569[var32] + arg2.method1730(this.field5547[var32] + arg4, this.field5517[var32] - -arg6, -1) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field5584;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field5581; var30++) {
                int var31 = (this.field5569[var30] << 16) / var29;
                if (var31 < arg1) {
                    this.field5569[var30] -= -((arg1 - var31) * (arg2.method1730(this.field5547[var30] + arg4, this.field5517[var30] + arg6, -1) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = (arg1 >> 8 & 0xFF) * 4;
            int var18 = arg1 >> 16 & 0xFF << 6;
            int var19 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var16 >> 1) < 0 || ((var16 >> 1) + arg2.field3525 + arg4) >= (arg2.field3533 << arg2.field3530) || (arg6 - (var17 >> 1)) < 0 || (var17 >> 1) + arg6 + arg2.field3525 >= arg2.field3524 << arg2.field3530) {
                return;
            }
            this.method2943(var19, var17, arg2, arg4, var16, var18, 0, arg5, arg6);
        } else if (arg0 == 4) {
            int var20 = this.field5549 - this.field5584;
            for (int var21 = 0; var21 < this.field5581; var21++) {
                this.field5569[var21] = this.field5569[var21] + arg3.method1730(this.field5547[var21] + arg4, this.field5517[var21] + arg6, -1) + var20 - arg5;
            }
        } else if (arg0 == 5) {
            int var22 = this.field5549 - this.field5584;
            for (int var23 = 0; var23 < this.field5581; var23++) {
                int var24 = this.field5547[var23] + arg4;
                int var25 = this.field5517[var23] + arg6;
                int var26 = arg2.method1730(var24, var25, -1);
                int var27 = arg3.method1730(var24, var25, -1);
                int var28 = var26 - arg1 - var27;
                this.field5569[var23] = ((this.field5569[var23] << 8) / var22 * var28 >> 8) + var26 - arg5;
            }
        }
        if (this.field5515 != null) {
            this.field5515.field7650 = null;
        }
        this.field5579 = false;
    }

    @OriginalMember(owner = "client!df", name = "HA", descriptor = "()I", line = 2453)
    public final int method361() {
        if (!this.field5579) {
            this.method2522(72);
        }
        field5577++;
        return this.field5510;
    }

    @OriginalMember(owner = "client!df", name = "v", descriptor = "()V", line = 2466)
    public final void method374() {
        field5568++;
        for (int var1 = 0; var1 < this.field5581; var1++) {
            this.field5517[var1] = -this.field5517[var1];
        }
        for (int var2 = 0; var2 < this.field5498; var2++) {
            this.field5575[var2] = (short) (-this.field5575[var2]);
        }
        for (int var3 = 0; var3 < this.field5540; var3++) {
            short var4 = this.field5537[var3];
            this.field5537[var3] = this.field5524[var3];
            this.field5524[var3] = var4;
        }
        if (this.field5511 == null && this.field5500 != null) {
            this.field5500.field7650 = null;
        }
        if (this.field5511 != null) {
            this.field5511.field7650 = null;
        }
        if (this.field5576 != null) {
            this.field5576.field1357 = null;
        }
        if (this.field5515 != null) {
            this.field5515.field7650 = null;
        }
        this.field5579 = false;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lnh;IZ)V", line = 2521)
    public final void method390(class778 arg0, int arg1, boolean arg2) {
        field5559++;
        if (this.field5508 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field5581; var5++) {
            if ((this.field5508[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method134(this.field5547[var5], this.field5569[var5], this.field5517[var5], var4);
                } else {
                    arg0.method132(this.field5547[var5], this.field5569[var5], this.field5517[var5], var4);
                }
                this.field5547[var5] = var4[0];
                this.field5569[var5] = var4[1];
                this.field5517[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "()V", line = 2552)
    public final void method397() {
        field5578++;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()V", line = 2560)
    public final void method392() {
        field5586++;
        if (this.field5498 <= 0 || this.field5505 <= 0) {
            return;
        }
        this.method2511(false, 255);
        if ((this.field5609 & 0x10) == 0 && this.field5576.field1357 == null) {
            this.method2520(false, 5123);
        }
        this.method2510(0);
    }

    @OriginalMember(owner = "client!df", name = "C", descriptor = "(I)V", line = 2576)
    public final void method362(int arg0) {
        this.field5566 = (short) arg0;
        field5519++;
        if (this.field5500 != null) {
            this.field5500.field7650 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "s", descriptor = "(I)V", line = 2591)
    public final void method378(int arg0) {
        field5550++;
        this.field5526 = arg0;
        this.field5542 = true;
        if (this.field5499 != null && (this.field5526 & 0x10000) == 0) {
            this.field5617 = this.field5499.field10466;
            this.field5598 = this.field5499.field10465;
            this.field5582 = this.field5499.field10463;
            this.field5575 = this.field5499.field10462;
            this.field5499 = null;
        }
        this.method2510(0);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(IIII)V", line = 2615)
    public static final void method2518(int arg0, int arg1, int arg2, int arg3) {
        field5601++;
        class714 var4 = class350.method2072((long) arg0, 9, (byte) 124);
        var4.method4043(arg3 ^ 0x4086);
        var4.field10018 = arg1;
        if (arg3 != 22634) {
            field5613 = -23;
        }
        var4.field10021 = arg2;
    }

    @OriginalMember(owner = "client!df", name = "da", descriptor = "()I", line = 2632)
    public final int method352() {
        field5553++;
        return this.field5541;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()[Lir;", line = 2640)
    public final class28[] method370() {
        field5588++;
        return this.field5556;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lnh;Lgca;I)V", line = 2654)
    public final void method355(class778 arg0, class265 arg1, int arg2) {
        field5600++;
        if (this.field5498 == 0) {
            return;
        }
        class446 var4 = this.field5546.field9754;
        class446 var5 = (class446) arg0;
        if (!this.field5579) {
            this.method2522(116);
        }
        class680.field9313 = var4.field5977 * var5.field5995 + var4.field6007 * var5.field5993 + var4.field5983 * var5.field5969 + var4.field5995;
        class5.field56 = var4.field5977 * var5.field5983 + var4.field6007 * var5.field5976 + var4.field5983 * var5.field5982;
        float var6 = (float) this.field5584 * class5.field56 + class680.field9313;
        float var7 = (float) this.field5549 * class5.field56 + class680.field9313;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) this.field5573 + var6;
            var9 = var7 - (float) this.field5573;
        } else {
            var9 = (float) (-this.field5573) + var6;
            var8 = (float) this.field5573 + var7;
        }
        if ((var9 >= this.field5546.field9820) || (var8 <= (float) this.field5546.field9824)) {
            return;
        }
        class7.field125 = var4.field5999 * var5.field5983 + var4.field5987 * var5.field5976 + var4.field5976 * var5.field5982;
        class366.field4543 = var4.field5999 * var5.field5995 + var4.field5987 * var5.field5993 + var4.field5976 * var5.field5969 + var4.field5993;
        float var10 = (float) this.field5584 * class7.field125 + class366.field4543;
        float var11 = (float) this.field5549 * class7.field125 + class366.field4543;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = (var11 - (float) this.field5573) * (float) this.field5546.field9855;
            var13 = ((float) this.field5573 + var10) * (float) this.field5546.field9855;
        } else {
            var13 = ((float) this.field5573 + var11) * (float) this.field5546.field9855;
            var12 = ((float) (-this.field5573) + var10) * (float) this.field5546.field9855;
        }
        if ((var12 / var8 >= this.field5546.field9829) || (var13 / var8 <= this.field5546.field9853)) {
            return;
        }
        class708.field9939 = var4.field5981 * var5.field5995 + var4.field5986 * var5.field5993 + var4.field5982 * var5.field5969 + var4.field5969;
        class657.field9058 = var4.field5981 * var5.field5983 + var4.field5986 * var5.field5976 + var4.field5982 * var5.field5982;
        float var14 = (float) this.field5584 * class657.field9058 + class708.field9939;
        float var15 = (float) this.field5549 * class657.field9058 + class708.field9939;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = (var15 - (float) this.field5573) * (float) this.field5546.field9776;
            var17 = ((float) this.field5573 + var14) * (float) this.field5546.field9776;
        } else {
            var17 = ((float) this.field5573 + var15) * (float) this.field5546.field9776;
            var16 = (var14 - (float) this.field5573) * (float) this.field5546.field9776;
        }
        if ((var16 / var8 >= this.field5546.field9773) || (this.field5546.field9792 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field5554 != null) {
            class776.field10711 = var4.field5977 * var5.field6007 + var4.field6007 * var5.field5987 + var4.field5983 * var5.field5986;
            class239.field2803 = var4.field5981 * var5.field5977 + var4.field5986 * var5.field5999 + var4.field5982 * var5.field5981;
            class470.field6559 = var4.field5999 * var5.field6007 + var4.field5987 * var5.field5987 + var4.field5976 * var5.field5986;
            class30.field479 = var4.field5977 * var5.field5977 + var4.field6007 * var5.field5999 + var4.field5983 * var5.field5981;
            class298.field3557 = var4.field5999 * var5.field5977 + var4.field5987 * var5.field5999 + var4.field5976 * var5.field5981;
            class141.field1766 = var4.field5981 * var5.field6007 + var4.field5986 * var5.field5987 + var4.field5982 * var5.field5986;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5535 + this.field5574 >> 1;
            int var21 = this.field5510 + this.field5591 >> 1;
            int var22 = (int) ((float) var21 * class298.field3557 + (float) this.field5584 * class7.field125 + (float) var20 * class470.field6559 + class366.field4543);
            int var23 = (int) ((float) var21 * class239.field2803 + (float) this.field5584 * class657.field9058 + (float) var20 * class141.field1766 + class708.field9939);
            int var24 = (int) ((float) var21 * class30.field479 + (float) this.field5584 * class5.field56 + (float) var20 * class776.field10711 + class680.field9313);
            if (this.field5546.field9824 > var24) {
                var18 = true;
            } else {
                arg1.field3136 = this.field5546.field9855 * var22 / var24 + this.field5546.field9769;
                arg1.field3133 = this.field5546.field9776 * var23 / var24 + this.field5546.field9812;
            }
            int var25 = (int) ((float) var21 * class298.field3557 + (float) this.field5549 * class7.field125 + (float) var20 * class470.field6559 + class366.field4543);
            int var26 = (int) ((float) var21 * class239.field2803 + (float) this.field5549 * class657.field9058 + (float) var20 * class141.field1766 + class708.field9939);
            int var27 = (int) ((float) var21 * class30.field479 + (float) this.field5549 * class5.field56 + (float) var20 * class776.field10711 + class680.field9313);
            if (var27 < this.field5546.field9824) {
                var18 = true;
            } else {
                arg1.field3135 = this.field5546.field9769 + (this.field5546.field9855 * var25 / var27);
                arg1.field3138 = this.field5546.field9776 * var26 / var27 + this.field5546.field9812;
            }
            if (var18) {
                if (this.field5546.field9824 > var24 && var27 < this.field5546.field9824) {
                    var19 = false;
                } else if (this.field5546.field9824 > var24) {
                    int var31 = (var27 - this.field5546.field9824 << 16) / (var27 - var24);
                    int var32 = var25 + ((var25 - var22) * var31 >> 16);
                    arg1.field3136 = this.field5546.field9855 * var32 / this.field5546.field9824 + this.field5546.field9769;
                    int var33 = var26 + ((var26 - var23) * var31 >> 16);
                    arg1.field3133 = this.field5546.field9776 * var33 / this.field5546.field9824 + this.field5546.field9812;
                } else if (var27 < this.field5546.field9824) {
                    int var28 = (var24 - this.field5546.field9824 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field3136 = this.field5546.field9769 + (this.field5546.field9855 * var29 / this.field5546.field9824);
                    arg1.field3133 = this.field5546.field9776 * var30 / this.field5546.field9824 + this.field5546.field9812;
                }
            }
            if (var19) {
                arg1.field3137 = true;
                if (var27 < var24) {
                    arg1.field3134 = (this.field5573 + var22) * this.field5546.field9855 / var24 + this.field5546.field9769 - arg1.field3136;
                } else {
                    arg1.field3134 = (this.field5573 + var25) * this.field5546.field9855 / var27 + this.field5546.field9769 - arg1.field3135;
                }
            }
        }
        this.field5546.method3942((byte) 127);
        this.field5546.method3965(var5, (byte) 95);
        this.method2516(0);
        this.field5546.method3923(-1);
        this.method2521((byte) -104);
    }

    @OriginalMember(owner = "client!df", name = "WA", descriptor = "()I", line = 2855)
    public final int method369() {
        field5544++;
        return this.field5566;
    }

    @OriginalMember(owner = "client!df", name = "O", descriptor = "(III)V", line = 2864)
    public final void method357(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5581; var4++) {
            if (arg0 != 128) {
                this.field5547[var4] = this.field5547[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5569[var4] = this.field5569[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field5517[var4] = this.field5517[var4] * arg2 >> 7;
            }
        }
        field5606++;
        this.field5579 = false;
        if (this.field5515 != null) {
            this.field5515.field7650 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "G", descriptor = "()I", line = 2897)
    public final int method393() {
        if (!this.field5579) {
            this.method2522(-43);
        }
        field5545++;
        return this.field5591;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILnh;ZIII)Z", line = 2926)
    private final boolean method2519(int arg0, int arg1, class778 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field5530++;
        class446 var8 = (class446) arg2;
        class446 var9 = this.field5546.field9754;
        float var10 = var8.field5995 * var9.field5999 + var8.field5993 * var9.field5987 + var8.field5969 * var9.field5976 + var9.field5993;
        float var11 = var8.field5995 * var9.field5981 + var8.field5993 * var9.field5986 + var8.field5969 * var9.field5982 + var9.field5969;
        class657.field9058 = var8.field5983 * var9.field5981 + var8.field5982 * var9.field5982 + var8.field5976 * var9.field5986;
        class470.field6559 = var8.field6007 * var9.field5999 + var8.field5987 * var9.field5987 + var8.field5986 * var9.field5976;
        float var12 = var8.field5995 * var9.field5977 + var8.field5993 * var9.field6007 + var8.field5969 * var9.field5983 + var9.field5995;
        class30.field479 = var8.field5977 * var9.field5977 + var8.field5999 * var9.field6007 + var8.field5981 * var9.field5983;
        class298.field3557 = var8.field5977 * var9.field5999 + var8.field5999 * var9.field5987 + var8.field5981 * var9.field5976;
        class5.field56 = var8.field5983 * var9.field5977 + var8.field5982 * var9.field5983 + var8.field5976 * var9.field6007;
        class239.field2803 = var8.field5977 * var9.field5981 + var8.field5999 * var9.field5986 + var8.field5981 * var9.field5982;
        class141.field1766 = var8.field6007 * var9.field5981 + var8.field5987 * var9.field5986 + var8.field5986 * var9.field5982;
        class7.field125 = var8.field5983 * var9.field5999 + var8.field5982 * var9.field5976 + var8.field5976 * var9.field5987;
        class776.field10711 = var8.field6007 * var9.field5977 + var8.field5987 * var9.field6007 + var8.field5986 * var9.field5983;
        boolean var13 = false;
        if (arg1 > -59) {
            this.method362(-34);
        }
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field5546.field9855;
        int var19 = this.field5546.field9776;
        if (!this.field5579) {
            this.method2522(-61);
        }
        int var20 = this.field5574 - this.field5535 >> 1;
        int var21 = this.field5549 - this.field5584 >> 1;
        int var22 = this.field5591 - this.field5510 >> 1;
        int var23 = this.field5535 + var20;
        int var24 = this.field5584 + var21;
        int var25 = this.field5510 + var22;
        int var26 = var23 - (var20 << arg5);
        int var27 = var24 - (var21 << arg5);
        int var28 = var25 - (var22 << arg5);
        int var29 = (var20 << arg5) + var23;
        int var30 = (var21 << arg5) + var24;
        class173.field2068[0] = var26;
        int var31 = (var22 << arg5) + var25;
        class116.field1468[0] = var27;
        class394.field5119[0] = var28;
        class173.field2068[1] = var29;
        class116.field1468[1] = var27;
        class394.field5119[1] = var28;
        class173.field2068[2] = var26;
        class116.field1468[2] = var30;
        class173.field2068[3] = var29;
        class394.field5119[2] = var28;
        class116.field1468[3] = var30;
        class173.field2068[4] = var26;
        class394.field5119[3] = var28;
        class116.field1468[4] = var27;
        class173.field2068[5] = var29;
        class394.field5119[4] = var31;
        class116.field1468[5] = var27;
        class394.field5119[5] = var31;
        class173.field2068[6] = var26;
        class116.field1468[6] = var30;
        class173.field2068[7] = var29;
        class394.field5119[6] = var31;
        class116.field1468[7] = var30;
        class394.field5119[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class116.field1468[var32];
            float var54 = (float) class394.field5119[var32];
            float var55 = (float) class173.field2068[var32];
            float var56 = class30.field479 * var54 + class776.field10711 * var55 + class5.field56 * var53 + var12;
            float var57 = class239.field2803 * var54 + class657.field9058 * var53 + class141.field1766 * var55 + var11;
            float var58 = class298.field3557 * var54 + class7.field125 * var53 + class470.field6559 * var55 + var10;
            if ((float) this.field5546.field9824 <= var56) {
                if (arg4 > 0) {
                    var56 = arg4;
                }
                float var59 = (float) var18 * var58 / var56 + (float) this.field5546.field9769;
                if (var14 > var59) {
                    var14 = var59;
                }
                if (var15 < var59) {
                    var15 = var59;
                }
                float var60 = (float) var19 * var57 / var56 + (float) this.field5546.field9812;
                if (var60 < var16) {
                    var16 = var60;
                }
                var13 = true;
                if (var17 < var60) {
                    var17 = var60;
                }
            }
        }
        if (var13 && var14 < (float) arg0 && (float) arg0 < var15 && (float) arg6 > var16 && (float) arg6 < var17) {
            if (arg3) {
                return true;
            }
            if (this.field5546.field9873.length < this.field5498) {
                this.field5546.field9873 = new int[this.field5498];
                this.field5546.field9876 = new int[this.field5498];
            }
            int[] var33 = this.field5546.field9873;
            int[] var34 = this.field5546.field9876;
            for (int var35 = 0; var35 < this.field5581; var35++) {
                float var37 = (float) this.field5569[var35];
                float var38 = (float) this.field5517[var35];
                float var39 = (float) this.field5547[var35];
                float var40 = class298.field3557 * var38 + class7.field125 * var37 + class470.field6559 * var39 + var10;
                float var41 = class30.field479 * var38 + class776.field10711 * var39 + class5.field56 * var37 + var12;
                float var42 = class239.field2803 * var38 + class657.field9058 * var37 + class141.field1766 * var39 + var11;
                if ((float) this.field5546.field9824 <= var41) {
                    if (arg4 > 0) {
                        var41 = arg4;
                    }
                    int var43 = (int) ((float) var18 * var40 / var41 + (float) this.field5546.field9769);
                    int var44 = (int) ((float) var19 * var42 / var41 + (float) this.field5546.field9812);
                    int var45 = this.field5506[var35];
                    int var46 = this.field5506[var35 + 1];
                    for (int var47 = var45; var47 < var46; var47++) {
                        int var48 = this.field5594[var47] - 1;
                        if (var48 == -1) {
                            break;
                        }
                        var33[var48] = var43;
                        var34[var48] = var44;
                    }
                } else {
                    int var49 = this.field5506[var35];
                    int var50 = this.field5506[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field5594[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[this.field5594[var51] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field5540; var36++) {
                if (var33[this.field5537[var36]] != -999999 && var33[this.field5599[var36]] != -999999 && var33[this.field5524[var36]] != -999999 && this.method2514(var33[this.field5599[var36]], var34[this.field5599[var36]], (byte) 124, var33[this.field5537[var36]], arg0, var34[this.field5524[var36]], var34[this.field5537[var36]], var33[this.field5524[var36]], arg6)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!df", name = "H", descriptor = "(III)V", line = 3173)
    public final void method377(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5581; var4++) {
            if (arg0 != 0) {
                this.field5547[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5569[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field5517[var4] += arg2;
            }
        }
        field5611++;
        this.field5579 = false;
        if (this.field5515 != null) {
            this.field5515.field7650 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(ZI)V", line = 3212)
    private final void method2520(boolean arg0, int arg1) {
        if (arg1 != 5123) {
            this.field5573 = 17;
        }
        field5610++;
        if ((this.field5505 * 6) <= this.field5546.field9779.field5275.length) {
            this.field5546.field9779.field5262 = 0;
        } else {
            this.field5546.field9779 = new class283(this.field5505 * 6 + 600);
        }
        class283 var3 = this.field5546.field9779;
        if (this.field5546.field9772) {
            for (int var4 = 0; var4 < this.field5505; var4++) {
                var3.method2369(-18090, this.field5537[var4]);
                var3.method2369(-18090, this.field5599[var4]);
                var3.method2369(arg1 ^ 0xFFFFAD55, this.field5524[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field5505; var5++) {
                var3.method2379(this.field5537[var5], arg1 ^ 0xFFFFC4BD);
                var3.method2379(this.field5599[var5], -12098);
                var3.method2379(this.field5524[var5], -12098);
            }
        }
        if (var3.field5262 == 0) {
            return;
        }
        if (arg0) {
            if (this.field5583 == null) {
                this.field5583 = this.field5546.method3948((byte) -120, var3.field5262, 5123, var3.field5275, true);
            } else {
                this.field5583.method1319(var3.field5262, 5123, arg1 ^ 0xFFFFB901, var3.field5275);
            }
            this.field5576.field1357 = this.field5583;
        } else {
            this.field5576.field1357 = this.field5546.method3948((byte) -120, var3.field5262, 5123, var3.field5275, false);
        }
        if (!arg0) {
            this.field5542 = true;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 3280)
    private final void method2521(byte arg0) {
        field5513++;
        if (arg0 != -104) {
            this.field5579 = false;
        }
        if (this.field5554 == null) {
            return;
        }
        class446 var2 = this.field5546.field9723;
        this.field5546.method3963(-96);
        this.field5546.method635(!this.field5522);
        this.field5546.method3892(false, arg0 + 105);
        this.field5546.method3935(this.field5546.field9817, this.field5546.field9767, null, null, 2407);
        for (int var3 = 0; var3 < this.field5527; var3++) {
            class16 var4 = this.field5554[var3];
            class237 var5 = this.field5543[var3];
            if (!var4.field299 || !this.field5546.method54()) {
                float var6 = (float) (this.field5547[var4.field293] + this.field5547[var4.field287] + this.field5547[var4.field289]) * 0.3333333F;
                float var7 = (float) (this.field5569[var4.field289] + this.field5569[var4.field287] + this.field5569[var4.field293]) * 0.3333333F;
                float var8 = (float) (this.field5517[var4.field289] + this.field5517[var4.field287] + this.field5517[var4.field293]) * 0.3333333F;
                float var9 = class298.field3557 * var8 + class7.field125 * var7 + class470.field6559 * var6 + class366.field4543;
                float var10 = class239.field2803 * var8 + class657.field9058 * var7 + class141.field1766 * var6 + class708.field9939;
                float var11 = class30.field479 * var8 + class776.field10711 * var6 + class5.field56 * var7 + class680.field9313;
                float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field296;
                var2.method2628(var11 * var12 - var11, (float) var5.field2793 + var9 - var9 * var12, (byte) 76, var5.field2800, var10 * var12 + ((float) var5.field2794 - var10), var4.field297 * var5.field2791 >> 7, var4.field290 * var5.field2801 >> 7);
                this.field5546.method3897(0, var2);
                int var13 = var5.field2799;
                OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                this.field5546.method3901(var4.field295, false);
                this.field5546.method3888((byte) 28, var4.field292);
                this.field5546.method3945(4, 7, 3, 0);
            }
        }
        this.field5546.method635(true);
        this.field5546.method3923(-1);
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V", line = 3359)
    private final void method2522(int arg0) {
        field5597++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        int var10 = -49 / ((15 - arg0) / 56);
        for (int var11 = 0; var11 < this.field5581; var11++) {
            int var12 = this.field5547[var11];
            int var13 = this.field5569[var11];
            if (var6 < var13) {
                var6 = var13;
            }
            int var14 = this.field5517[var11];
            if (var5 < var12) {
                var5 = var12;
            }
            if (var3 > var13) {
                var3 = var13;
            }
            if (var12 < var2) {
                var2 = var12;
            }
            if (var14 < var4) {
                var4 = var14;
            }
            if (var7 < var14) {
                var7 = var14;
            }
            int var15 = var12 * var12 + (var14 * var14);
            if (var15 > var8) {
                var8 = var15;
            }
            int var16 = var12 * var12 + var13 * var13 + (var14 * var14);
            if (var9 < var16) {
                var9 = var16;
            }
        }
        this.field5535 = (short) var2;
        this.field5584 = (short) var3;
        this.field5591 = (short) var7;
        this.field5574 = (short) var5;
        this.field5510 = (short) var4;
        this.field5549 = (short) var6;
        this.field5573 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field5495 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field5579 = true;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(FIIBFIIIJLso;)S", line = 3438)
    private final short method2523(float arg0, int arg1, int arg2, byte arg3, float arg4, int arg5, int arg6, int arg7, long arg8, class496 arg9) {
        field5564++;
        int var12 = this.field5506[arg1];
        int var13 = this.field5506[arg1 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field5594[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class272.field3202[var15] == arg8) {
                return (short) (var16 - 1);
            }
        }
        if (arg3 >= -122) {
            this.field5581 = 47;
        }
        this.field5594[var14] = (short) (this.field5498 + 1);
        class272.field3202[var14] = arg8;
        this.field5617[this.field5498] = (short) arg6;
        this.field5598[this.field5498] = (short) arg2;
        this.field5575[this.field5498] = (short) arg7;
        this.field5582[this.field5498] = (byte) arg5;
        this.field5607[this.field5498] = arg4;
        this.field5589[this.field5498] = arg0;
        return (short) (this.field5498++);
    }

    @OriginalMember(owner = "client!df", name = "V", descriptor = "()I", line = 3487)
    public final int method381() {
        if (!this.field5579) {
            this.method2522(-62);
        }
        field5531++;
        return this.field5535;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()[Lmk;", line = 3507)
    public final class62[] method371() {
        field5563++;
        return this.field5507;
    }

    @OriginalMember(owner = "client!df", name = "ia", descriptor = "(SS)V", line = 3518)
    public final void method402(short arg0, short arg1) {
        field5567++;
        for (int var3 = 0; var3 < this.field5540; var3++) {
            if (this.field5536[var3] == arg0) {
                this.field5536[var3] = arg1;
            }
        }
        if (this.field5554 != null) {
            for (int var4 = 0; var4 < this.field5527; var4++) {
                class16 var5 = this.field5554[var4];
                class237 var6 = this.field5543[var4];
                var6.field2799 = var6.field2799 & 0xFF000000 | class437.field5749[this.field5536[var5.field288] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5500 != null) {
            this.field5500.field7650 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ldf;ZBLdf;IZ)Lka;", line = 3567)
    private final class498 method2524(class421 arg0, boolean arg1, byte arg2, class421 arg3, int arg4, boolean arg5) {
        arg3.field5581 = this.field5581;
        if ((arg4 & 0x100) == 0) {
            arg3.field5522 = this.field5522;
        } else {
            arg3.field5522 = true;
        }
        arg3.field5527 = this.field5527;
        arg3.field5566 = this.field5566;
        arg3.field5505 = this.field5505;
        arg3.field5494 = this.field5494;
        arg3.field5609 = 0;
        arg3.field5552 = this.field5552;
        arg3.field5541 = this.field5541;
        arg3.field5526 = arg4;
        field5528++;
        arg3.field5498 = this.field5498;
        arg3.field5540 = this.field5540;
        arg3.field5595 = this.field5595;
        boolean var7 = class792.method4368(arg4, this.field5595, (byte) -118);
        boolean var8 = class173.method1170(arg4, (byte) 29, this.field5595);
        boolean var9 = class61.method527(this.field5595, arg4, 0);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg3.field5547 = this.field5547;
            } else if (arg0.field5547 == null || this.field5552 > arg0.field5547.length) {
                arg3.field5547 = arg0.field5547 = new int[this.field5552];
            } else {
                arg3.field5547 = arg0.field5547;
            }
            if (!var8) {
                arg3.field5569 = this.field5569;
            } else if (arg0.field5569 == null || this.field5552 > arg0.field5569.length) {
                arg3.field5569 = arg0.field5569 = new int[this.field5552];
            } else {
                arg3.field5569 = arg0.field5569;
            }
            if (!var9) {
                arg3.field5517 = this.field5517;
            } else if (arg0.field5517 == null || this.field5552 > arg0.field5517.length) {
                arg3.field5517 = arg0.field5517 = new int[this.field5552];
            } else {
                arg3.field5517 = arg0.field5517;
            }
            for (int var11 = 0; var11 < this.field5552; var11++) {
                if (var7) {
                    arg3.field5547[var11] = this.field5547[var11];
                }
                if (var8) {
                    arg3.field5569[var11] = this.field5569[var11];
                }
                if (var9) {
                    arg3.field5517[var11] = this.field5517[var11];
                }
            }
        } else {
            arg3.field5547 = this.field5547;
            arg3.field5517 = this.field5517;
            arg3.field5569 = this.field5569;
        }
        if (class551.method3229(arg4, 101, this.field5595)) {
            arg3.field5515 = arg0.field5515;
            if (arg5) {
                arg3.field5609 = (byte) (arg3.field5609 | 0x1);
            }
            arg3.field5515.field7650 = this.field5515.field7650;
            arg3.field5515.field7648 = this.field5515.field7648;
        } else if (class377.method2211(this.field5595, 2048, arg4)) {
            arg3.field5515 = this.field5515;
        } else {
            arg3.field5515 = null;
        }
        if (class672.method3779(arg4, -1219194420, this.field5595)) {
            if (arg0.field5536 == null || this.field5540 > arg0.field5536.length) {
                arg3.field5536 = arg0.field5536 = new short[this.field5540];
            } else {
                arg3.field5536 = arg0.field5536;
            }
            for (int var12 = 0; var12 < this.field5540; var12++) {
                arg3.field5536[var12] = this.field5536[var12];
            }
        } else {
            arg3.field5536 = this.field5536;
        }
        if (class504.method3022(this.field5595, (byte) -34, arg4)) {
            if (arg0.field5562 == null || this.field5540 > arg0.field5562.length) {
                arg3.field5562 = arg0.field5562 = new byte[this.field5540];
            } else {
                arg3.field5562 = arg0.field5562;
            }
            for (int var13 = 0; var13 < this.field5540; var13++) {
                arg3.field5562[var13] = this.field5562[var13];
            }
        } else {
            arg3.field5562 = this.field5562;
        }
        if (class388.method2276(arg4, -5845, this.field5595)) {
            arg3.field5500 = arg0.field5500;
            if (arg5) {
                arg3.field5609 = (byte) (arg3.field5609 | 0x2);
            }
            arg3.field5500.field7648 = this.field5500.field7648;
            arg3.field5500.field7650 = this.field5500.field7650;
        } else if (class314.method1850(this.field5595, 125, arg4)) {
            arg3.field5500 = this.field5500;
        } else {
            arg3.field5500 = null;
        }
        if (class86.method797(51, this.field5595, arg4)) {
            if (arg0.field5617 == null || arg0.field5617.length < this.field5498) {
                int var14 = this.field5498;
                arg3.field5575 = arg0.field5575 = new short[var14];
                arg3.field5617 = arg0.field5617 = new short[var14];
                arg3.field5598 = arg0.field5598 = new short[var14];
            } else {
                arg3.field5598 = arg0.field5598;
                arg3.field5617 = arg0.field5617;
                arg3.field5575 = arg0.field5575;
            }
            if (this.field5499 == null) {
                for (int var15 = 0; var15 < this.field5498; var15++) {
                    arg3.field5617[var15] = this.field5617[var15];
                    arg3.field5598[var15] = this.field5598[var15];
                    arg3.field5575[var15] = this.field5575[var15];
                }
            } else {
                if (arg0.field5499 == null) {
                    arg0.field5499 = new class755();
                }
                class755 var16 = arg3.field5499 = arg0.field5499;
                if (var16.field10466 == null || var16.field10466.length < this.field5498) {
                    int var17 = this.field5498;
                    var16.field10463 = new byte[var17];
                    var16.field10465 = new short[var17];
                    var16.field10466 = new short[var17];
                    var16.field10462 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field5498; var18++) {
                    arg3.field5617[var18] = this.field5617[var18];
                    arg3.field5598[var18] = this.field5598[var18];
                    arg3.field5575[var18] = this.field5575[var18];
                    var16.field10466[var18] = this.field5499.field10466[var18];
                    var16.field10465[var18] = this.field5499.field10465[var18];
                    var16.field10462[var18] = this.field5499.field10462[var18];
                    var16.field10463[var18] = this.field5499.field10463[var18];
                }
            }
            arg3.field5582 = this.field5582;
        } else {
            arg3.field5617 = this.field5617;
            arg3.field5598 = this.field5598;
            arg3.field5582 = this.field5582;
            arg3.field5575 = this.field5575;
            arg3.field5499 = this.field5499;
        }
        if (class319.method1904(this.field5595, arg4, 0)) {
            if (arg5) {
                arg3.field5609 = (byte) (arg3.field5609 | 0x4);
            }
            arg3.field5511 = arg0.field5511;
            arg3.field5511.field7648 = this.field5511.field7648;
            arg3.field5511.field7650 = this.field5511.field7650;
        } else if (class123.method957(arg4, false, this.field5595)) {
            arg3.field5511 = this.field5511;
        } else {
            arg3.field5511 = null;
        }
        if (class597.method3412(arg4, this.field5595, -4)) {
            if (arg0.field5607 == null || arg0.field5607.length < this.field5540) {
                int var19 = this.field5498;
                arg3.field5589 = arg0.field5589 = new float[var19];
                arg3.field5607 = arg0.field5607 = new float[var19];
            } else {
                arg3.field5607 = arg0.field5607;
                arg3.field5589 = arg0.field5589;
            }
            for (int var20 = 0; var20 < this.field5498; var20++) {
                arg3.field5607[var20] = this.field5607[var20];
                arg3.field5589[var20] = this.field5589[var20];
            }
        } else {
            arg3.field5607 = this.field5607;
            arg3.field5589 = this.field5589;
        }
        if (class786.method4351(this.field5595, (byte) 113, arg4)) {
            if (arg5) {
                arg3.field5609 = (byte) (arg3.field5609 | 0x8);
            }
            arg3.field5572 = arg0.field5572;
            arg3.field5572.field7650 = this.field5572.field7650;
            arg3.field5572.field7648 = this.field5572.field7648;
        } else if (class12.method189(-100, this.field5595, arg4)) {
            arg3.field5572 = this.field5572;
        } else {
            arg3.field5572 = null;
        }
        if (class473.method2827(this.field5595, arg4, -67)) {
            if (arg0.field5537 == null || this.field5540 > arg0.field5537.length) {
                int var21 = this.field5540;
                arg3.field5599 = arg0.field5599 = new short[var21];
                arg3.field5537 = arg0.field5537 = new short[var21];
                arg3.field5524 = arg0.field5524 = new short[var21];
            } else {
                arg3.field5599 = arg0.field5599;
                arg3.field5537 = arg0.field5537;
                arg3.field5524 = arg0.field5524;
            }
            for (int var22 = 0; var22 < this.field5540; var22++) {
                arg3.field5537[var22] = this.field5537[var22];
                arg3.field5599[var22] = this.field5599[var22];
                arg3.field5524[var22] = this.field5524[var22];
            }
        } else {
            arg3.field5599 = this.field5599;
            arg3.field5524 = this.field5524;
            arg3.field5537 = this.field5537;
        }
        if (class52.method475(arg4, this.field5595, (byte) -125)) {
            if (arg5) {
                arg3.field5609 = (byte) (arg3.field5609 | 0x10);
            }
            arg3.field5576 = arg0.field5576;
            arg3.field5576.field1357 = this.field5576.field1357;
        } else if (class26.method255(arg4, false, this.field5595)) {
            arg3.field5576 = this.field5576;
        } else {
            arg3.field5576 = null;
        }
        if (class93.method826(this.field5595, arg4, (byte) 126)) {
            if (arg0.field5548 == null || arg0.field5548.length < this.field5540) {
                int var23 = this.field5540;
                arg3.field5548 = arg0.field5548 = new short[var23];
            } else {
                arg3.field5548 = arg0.field5548;
            }
            for (int var24 = 0; var24 < this.field5540; var24++) {
                arg3.field5548[var24] = this.field5548[var24];
            }
        } else {
            arg3.field5548 = this.field5548;
        }
        if (!class112.method893(arg4, -124, this.field5595)) {
            arg3.field5543 = this.field5543;
        } else if (arg0.field5543 == null || arg0.field5543.length < this.field5527) {
            int var26 = this.field5527;
            arg3.field5543 = arg0.field5543 = new class237[var26];
            for (int var27 = 0; var27 < this.field5527; var27++) {
                arg3.field5543[var27] = this.field5543[var27].method1444(-25014);
            }
        } else {
            arg3.field5543 = arg0.field5543;
            for (int var25 = 0; var25 < this.field5527; var25++) {
                arg3.field5543[var25].method1443((byte) 96, this.field5543[var25]);
            }
        }
        arg3.field5523 = this.field5523;
        arg3.field5497 = this.field5497;
        arg3.field5556 = this.field5556;
        arg3.field5507 = this.field5507;
        arg3.field5557 = this.field5557;
        arg3.field5539 = this.field5539;
        arg3.field5554 = this.field5554;
        arg3.field5508 = this.field5508;
        int var28 = -7 / ((-arg2 - 70) / 53);
        arg3.field5506 = this.field5506;
        arg3.field5594 = this.field5594;
        if (this.field5579) {
            arg3.field5584 = this.field5584;
            arg3.field5510 = this.field5510;
            arg3.field5535 = this.field5535;
            arg3.field5574 = this.field5574;
            arg3.field5573 = this.field5573;
            arg3.field5579 = true;
            arg3.field5495 = this.field5495;
            arg3.field5549 = this.field5549;
            arg3.field5591 = this.field5591;
        } else {
            arg3.field5579 = false;
        }
        arg3.field5518 = this.field5518;
        return arg3;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()V", line = 4037)
    public final void method359() {
        field5596++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[BI)[B", line = 4048)
    private static final byte[] method2525(int arg0, byte[] arg1, int arg2) {
        field5612++;
        byte[] var3 = new byte[arg2];
        class211.method1330(arg1, 0, var3, arg0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[IIIIIZ)V", line = 4062)
    public final void method401(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5560++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            class241.field2838 = 0;
            class318.field3918 = 0;
            int var12 = 0;
            class26.field416 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field5539.length > var14) {
                    int[] var15 = this.field5539[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class26.field416 += this.field5547[var17];
                        class318.field3918 += this.field5569[var17];
                        var12++;
                        class241.field2838 += this.field5517[var17];
                    }
                }
            }
            if (var12 > 0) {
                class26.field416 = class26.field416 / var12 + var9;
                class241.field2838 = class241.field2838 / var12 + var11;
                class318.field3918 = class318.field3918 / var12 + var10;
            } else {
                class241.field2838 = var11;
                class26.field416 = var9;
                class318.field3918 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field5539.length > var22) {
                    int[] var23 = this.field5539[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5547[var25] += var18;
                        this.field5569[var25] += var19;
                        this.field5517[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field5539.length) {
                    int[] var46 = this.field5539[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5547[var48] -= class26.field416;
                            this.field5569[var48] -= class318.field3918;
                            this.field5517[var48] -= class241.field2838;
                            if (arg4 != 0) {
                                int var49 = class789.field10868[arg4];
                                int var50 = class789.field10864[arg4];
                                int var51 = this.field5569[var48] * var49 + this.field5547[var48] * var50 + 16383 >> 14;
                                this.field5569[var48] = this.field5569[var48] * var50 + 16383 - (this.field5547[var48] * var49) >> 14;
                                this.field5547[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class789.field10868[arg2];
                                int var53 = class789.field10864[arg2];
                                int var54 = this.field5569[var48] * var53 + 16383 - (this.field5517[var48] * var52) >> 14;
                                this.field5517[var48] = this.field5569[var48] * var52 + this.field5517[var48] * var53 + 16383 >> 14;
                                this.field5569[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class789.field10868[arg3];
                                int var56 = class789.field10864[arg3];
                                int var57 = this.field5547[var48] * var56 + this.field5517[var48] * var55 + 16383 >> 14;
                                this.field5517[var48] = this.field5517[var48] * var56 + 16383 - (this.field5547[var48] * var55) >> 14;
                                this.field5547[var48] = var57;
                            }
                            this.field5547[var48] += class26.field416;
                            this.field5569[var48] += class318.field3918;
                            this.field5517[var48] += class241.field2838;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5547[var59] -= class26.field416;
                            this.field5569[var59] -= class318.field3918;
                            this.field5517[var59] -= class241.field2838;
                            if (arg2 != 0) {
                                int var60 = class789.field10868[arg2];
                                int var61 = class789.field10864[arg2];
                                int var62 = this.field5569[var59] * var61 + 16383 - (this.field5517[var59] * var60) >> 14;
                                this.field5517[var59] = this.field5569[var59] * var60 + (this.field5517[var59] * var61) + 16383 >> 14;
                                this.field5569[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class789.field10868[arg4];
                                int var64 = class789.field10864[arg4];
                                int var65 = this.field5569[var59] * var63 + (this.field5547[var59] * var64) + 16383 >> 14;
                                this.field5569[var59] = this.field5569[var59] * var64 + 16383 - (this.field5547[var59] * var63) >> 14;
                                this.field5547[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class789.field10868[arg3];
                                int var67 = class789.field10864[arg3];
                                int var68 = this.field5547[var59] * var67 + this.field5517[var59] * var66 + 16383 >> 14;
                                this.field5517[var59] = this.field5517[var59] * var67 + 16383 - (this.field5547[var59] * var66) >> 14;
                                this.field5547[var59] = var68;
                            }
                            this.field5547[var59] += class26.field416;
                            this.field5569[var59] += class318.field3918;
                            this.field5517[var59] += class241.field2838;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field5539.length) {
                        int[] var29 = this.field5539[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5506[var31];
                            int var33 = this.field5506[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5594[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class789.field10868[arg4];
                                    int var37 = class789.field10864[arg4];
                                    int var38 = this.field5617[var35] * var37 + (this.field5598[var35] * var36 + 16383) >> 14;
                                    this.field5598[var35] = (short) (this.field5598[var35] * var37 + 16383 - (this.field5617[var35] * var36) >> 14);
                                    this.field5617[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class789.field10868[arg2];
                                    int var40 = class789.field10864[arg2];
                                    int var41 = this.field5598[var35] * var40 + 16383 - (this.field5575[var35] * var39) >> 14;
                                    this.field5575[var35] = (short) (this.field5598[var35] * var39 + this.field5575[var35] * var40 + 16383 >> 14);
                                    this.field5598[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class789.field10868[arg3];
                                    int var43 = class789.field10864[arg3];
                                    int var44 = this.field5575[var35] * var42 - (-(this.field5617[var35] * var43) - 16383) >> 14;
                                    this.field5575[var35] = (short) (this.field5575[var35] * var43 + 16383 - (this.field5617[var35] * var42) >> 14);
                                    this.field5617[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field5511 == null && this.field5500 != null) {
                    this.field5500.field7650 = null;
                }
                if (this.field5511 != null) {
                    this.field5511.field7650 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field5539.length) {
                    int[] var71 = this.field5539[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5547[var73] -= class26.field416;
                        this.field5569[var73] -= class318.field3918;
                        this.field5517[var73] -= class241.field2838;
                        this.field5547[var73] = this.field5547[var73] * arg2 >> 7;
                        this.field5569[var73] = this.field5569[var73] * arg3 >> 7;
                        this.field5517[var73] = this.field5517[var73] * arg4 >> 7;
                        this.field5547[var73] += class26.field416;
                        this.field5569[var73] += class318.field3918;
                        this.field5517[var73] += class241.field2838;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5557 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field5557.length) {
                        int[] var79 = this.field5557[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field5562[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field5562[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field5500 != null) {
                            this.field5500.field7650 = null;
                        }
                    }
                }
                if (this.field5554 != null) {
                    for (int var75 = 0; var75 < this.field5527; var75++) {
                        class16 var76 = this.field5554[var75];
                        class237 var77 = this.field5543[var75];
                        var77.field2799 = 255 - (this.field5562[var76.field288] & 0xFF) << 24 | var77.field2799 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5557 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field5557.length) {
                        int[] var88 = this.field5557[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field5536[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x395) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = var91 & 0x7F;
                            int var96 = arg2 + var92 & 0x3F;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            int var97 = arg4 + var95;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field5536[var90] = (short) class5.method105(class5.method105(var96 << 10, var94 << 7), var97);
                        }
                        if (var88.length > 0 && this.field5500 != null) {
                            this.field5500.field7650 = null;
                        }
                    }
                }
                if (this.field5554 != null) {
                    for (int var84 = 0; var84 < this.field5527; var84++) {
                        class16 var85 = this.field5554[var84];
                        class237 var86 = this.field5543[var84];
                        var86.field2799 = class437.field5749[this.field5536[var85.field288] & 0xFFFF] & 0xFFFFFF | var86.field2799 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5497 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field5497.length) {
                        int[] var100 = this.field5497[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class237 var102 = this.field5543[var100[var101]];
                            var102.field2794 += arg3;
                            var102.field2793 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5497 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field5497.length > var104) {
                        int[] var105 = this.field5497[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class237 var107 = this.field5543[var105[var106]];
                            var107.field2791 = var107.field2791 * arg2 >> 7;
                            var107.field2801 = var107.field2801 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5497 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field5497.length) {
                    int[] var110 = this.field5497[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class237 var112 = this.field5543[var110[var111]];
                        var112.field2800 = var112.field2800 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "wa", descriptor = "()V", line = 4724)
    public final void method372() {
        for (int var1 = 0; var1 < this.field5552; var1++) {
            this.field5547[var1] = this.field5547[var1] + 7 >> 4;
            this.field5569[var1] = this.field5569[var1] + 7 >> 4;
            this.field5517[var1] = this.field5517[var1] + 7 >> 4;
        }
        field5593++;
        this.field5579 = false;
        if (this.field5515 != null) {
            this.field5515.field7650 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "I", descriptor = "(I[IIIIZI[I)V", line = 4746)
    public final void method395(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5512++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            class318.field3918 = 0;
            int var13 = 0;
            class26.field416 = 0;
            class241.field2838 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field5539.length > var15) {
                    int[] var16 = this.field5539[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5508 == null || (arg6 & this.field5508[var18]) != 0) {
                            class26.field416 += this.field5547[var18];
                            class318.field3918 += this.field5569[var18];
                            class241.field2838 += this.field5517[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class26.field416 = class26.field416 / var13 + var12;
                class148.field1856 = true;
                class318.field3918 = class318.field3918 / var13 + var10;
                class241.field2838 = class241.field2838 / var13 + var11;
            } else {
                class241.field2838 = var11;
                class318.field3918 = var10;
                class26.field416 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 - (-(arg7[2] * arg4) - 8192) >> 14;
                int var20 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field5539.length > var26) {
                    int[] var27 = this.field5539[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5508 == null || (this.field5508[var29] & arg6) != 0) {
                            this.field5547[var29] += var24;
                            this.field5569[var29] += var23;
                            this.field5517[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field5539.length > var49) {
                        int[] var50 = this.field5539[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field5508 == null || (arg6 & this.field5508[var52]) != 0) {
                                this.field5547[var52] -= class26.field416;
                                this.field5569[var52] -= class318.field3918;
                                this.field5517[var52] -= class241.field2838;
                                if (arg4 != 0) {
                                    int var53 = class789.field10868[arg4];
                                    int var54 = class789.field10864[arg4];
                                    int var55 = this.field5569[var52] * var53 + (this.field5547[var52] * var54) + 16383 >> 14;
                                    this.field5569[var52] = this.field5569[var52] * var54 + 16383 - (this.field5547[var52] * var53) >> 14;
                                    this.field5547[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class789.field10868[arg2];
                                    int var57 = class789.field10864[arg2];
                                    int var58 = this.field5569[var52] * var57 + 16383 - (this.field5517[var52] * var56) >> 14;
                                    this.field5517[var52] = this.field5569[var52] * var56 + this.field5517[var52] * var57 + 16383 >> 14;
                                    this.field5569[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class789.field10868[arg3];
                                    int var60 = class789.field10864[arg3];
                                    int var61 = this.field5547[var52] * var60 + this.field5517[var52] * var59 + 16383 >> 14;
                                    this.field5517[var52] = this.field5517[var52] * var60 + 16383 - (this.field5547[var52] * var59) >> 14;
                                    this.field5547[var52] = var61;
                                }
                                this.field5547[var52] += class26.field416;
                                this.field5569[var52] += class318.field3918;
                                this.field5517[var52] += class241.field2838;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field5539.length > var32) {
                            int[] var33 = this.field5539[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field5508 == null || (this.field5508[var35] & arg6) != 0) {
                                    int var36 = this.field5506[var35];
                                    int var37 = this.field5506[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field5594[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class789.field10868[arg4];
                                            int var41 = class789.field10864[arg4];
                                            int var42 = this.field5617[var39] * var41 + this.field5598[var39] * var40 + 16383 >> 14;
                                            this.field5598[var39] = (short) (this.field5598[var39] * var41 + 16383 - (this.field5617[var39] * var40) >> 14);
                                            this.field5617[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class789.field10868[arg2];
                                            int var44 = class789.field10864[arg2];
                                            int var45 = this.field5598[var39] * var44 + 16383 - this.field5575[var39] * var43 >> 14;
                                            this.field5575[var39] = (short) (this.field5598[var39] * var43 + this.field5575[var39] * var44 + 16383 >> 14);
                                            this.field5598[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class789.field10868[arg3];
                                            int var47 = class789.field10864[arg3];
                                            int var48 = this.field5575[var39] * var46 + (this.field5617[var39] * var47 + 16383) >> 14;
                                            this.field5575[var39] = (short) (this.field5575[var39] * var47 + 16383 - (this.field5617[var39] * var46) >> 14);
                                            this.field5617[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5511 == null && this.field5500 != null) {
                        this.field5500.field7650 = null;
                    }
                    if (this.field5511 != null) {
                        this.field5511.field7650 = null;
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
                if (class148.field1856) {
                    int var68 = arg7[6] * class241.field2838 + arg7[3] * class318.field3918 + arg7[0] * class26.field416 + 8192 >> 14;
                    int var69 = arg7[7] * class241.field2838 + arg7[1] * class26.field416 + (arg7[4] * class318.field3918) + 8192 >> 14;
                    int var70 = arg7[2] * class26.field416 + arg7[8] * class241.field2838 + arg7[5] * class318.field3918 + 8192 >> 14;
                    int var71 = var66 + var69;
                    int var72 = var65 + var68;
                    int var73 = var67 + var70;
                    class318.field3918 = var71;
                    class26.field416 = var72;
                    class241.field2838 = var73;
                    class148.field1856 = false;
                }
                int[] var74 = new int[9];
                int var75 = class789.field10864[arg2];
                int var76 = class789.field10868[arg2];
                int var77 = class789.field10864[arg3];
                int var78 = class789.field10868[arg3];
                int var79 = class789.field10864[arg4];
                int var80 = class789.field10868[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[1] = -var77 * var80 + (var78 * var81 + 8192) >> 14;
                var74[5] = -var76;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[7] = var78 * var80 + (var77 * var81) + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[6] = var77 * var82 + -var78 * var79 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                int var83 = var74[1] * -class318.field3918 + var74[0] * -class26.field416 + var74[2] * -class241.field2838 + 8192 >> 14;
                int var84 = var74[5] * -class241.field2838 + var74[3] * -class26.field416 + (var74[4] * -class318.field3918) + 8192 >> 14;
                int var85 = var74[7] * -class318.field3918 + (var74[8] * -class241.field2838) + var74[6] * -class26.field416 + 8192 >> 14;
                int var86 = var83 + class26.field416;
                int var87 = class318.field3918 + var84;
                int var88 = var85 + class241.field2838;
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
                int var91 = var74[1] * var66 + var74[0] * var65 + var74[2] * var67 + 8192 >> 14;
                int var92 = var74[4] * var66 + var74[3] * var65 + var74[5] * var67 + 8192 >> 14;
                int var93 = var74[6] * var65 + var74[7] * var66 + var74[8] * var67 + 8192 >> 14;
                int var94 = var87 + var92;
                int var95 = var86 + var91;
                int var96 = var88 + var93;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += var89[var116 + (var118 * 3)] * arg7[var98 * 3 + var118];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[1] * var94 + arg7[0] * var95 + arg7[2] * var96 + 8192 >> 14;
                int var100 = arg7[4] * var94 + arg7[3] * var95 + (arg7[5] * var96) + 8192 >> 14;
                int var101 = var63 + var100;
                int var102 = var62 + var99;
                int var103 = arg7[6] * var95 + arg7[8] * var96 + arg7[7] * var94 + 8192 >> 14;
                int var104 = var64 + var103;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field5539.length > var106) {
                        int[] var107 = this.field5539[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field5508 == null || (this.field5508[var109] & arg6) != 0) {
                                int var110 = this.field5547[var109] * var97[0] + (this.field5569[var109] * var97[1]) + (this.field5517[var109] * var97[2] - -8192) >> 14;
                                int var111 = this.field5569[var109] * var97[4] + this.field5547[var109] * var97[3] - (-(this.field5517[var109] * var97[5]) - 8192) >> 14;
                                int var112 = var101 + var111;
                                int var113 = var102 + var110;
                                int var114 = this.field5517[var109] * var97[8] + this.field5569[var109] * var97[7] + this.field5547[var109] * var97[6] + 8192 >> 14;
                                this.field5547[var109] = var113;
                                int var115 = var104 + var114;
                                this.field5569[var109] = var112;
                                this.field5517[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field5539.length > var173) {
                        int[] var174 = this.field5539[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5508 == null || (arg6 & this.field5508[var176]) != 0) {
                                this.field5547[var176] -= class26.field416;
                                this.field5569[var176] -= class318.field3918;
                                this.field5517[var176] -= class241.field2838;
                                this.field5547[var176] = this.field5547[var176] * arg2 >> 7;
                                this.field5569[var176] = this.field5569[var176] * arg3 >> 7;
                                this.field5517[var176] = this.field5517[var176] * arg4 >> 7;
                                this.field5547[var176] += class26.field416;
                                this.field5569[var176] += class318.field3918;
                                this.field5517[var176] += class241.field2838;
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
                if (class148.field1856) {
                    int var128 = arg7[0] * class26.field416 + 8192 - (-(arg7[3] * class318.field3918) - arg7[6] * class241.field2838) >> 14;
                    int var129 = arg7[7] * class241.field2838 + arg7[4] * class318.field3918 + arg7[1] * class26.field416 + 8192 >> 14;
                    int var130 = var125 + var128;
                    int var131 = var126 + var129;
                    int var132 = arg7[2] * class26.field416 + arg7[8] * class241.field2838 + arg7[5] * class318.field3918 + 8192 >> 14;
                    int var133 = var127 + var132;
                    class318.field3918 = var131;
                    class26.field416 = var130;
                    class148.field1856 = false;
                    class241.field2838 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class26.field416 * var134 + 8192 >> 14;
                int var138 = -class318.field3918 * var135 + 8192 >> 14;
                int var139 = -class241.field2838 * var136 + 8192 >> 14;
                int var140 = class26.field416 + var137;
                int var141 = class318.field3918 + var138;
                int var142 = var139 + class241.field2838;
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
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[2] * var149 + arg7[1] * var148 + arg7[0] * var147 + 8192 >> 14;
                int var153 = arg7[4] * var148 + (arg7[3] * var147 + (arg7[5] * var149) + 8192) >> 14;
                int var154 = var122 + var152;
                int var155 = var123 + var153;
                int var156 = arg7[6] * var147 + arg7[7] * var148 + (arg7[8] * var149) + 8192 >> 14;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field5539.length > var159) {
                        int[] var160 = this.field5539[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field5508 == null || (this.field5508[var162] & arg6) != 0) {
                                int var163 = this.field5569[var162] * var150[1] + this.field5547[var162] * var150[0] + this.field5517[var162] * var150[2] + 8192 >> 14;
                                int var164 = this.field5569[var162] * var150[4] + this.field5547[var162] * var150[3] + this.field5517[var162] * var150[5] + 8192 >> 14;
                                int var165 = var155 + var164;
                                int var166 = this.field5569[var162] * var150[7] + this.field5517[var162] * var150[8] + this.field5547[var162] * var150[6] + 8192 >> 14;
                                int var167 = var154 + var163;
                                int var168 = var157 + var166;
                                this.field5547[var162] = var167;
                                this.field5569[var162] = var165;
                                this.field5517[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5557 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field5557.length) {
                        int[] var182 = this.field5557[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field5518 == null || (arg6 & this.field5518[var184]) != 0) {
                                int var185 = (this.field5562[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field5562[var184] = (byte) var185;
                                if (this.field5500 != null) {
                                    this.field5500.field7650 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5554 != null) {
                    for (int var178 = 0; var178 < this.field5527; var178++) {
                        class16 var179 = this.field5554[var178];
                        class237 var180 = this.field5543[var178];
                        var180.field2799 = 255 - (this.field5562[var179.field288] & 0xFF) << 24 | var180.field2799 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5557 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field5557.length) {
                        int[] var191 = this.field5557[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field5518 == null || (this.field5518[var193] & arg6) != 0) {
                                int var194 = this.field5536[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFF1D) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var195 + arg2 & 0x3F;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field5536[var193] = (short) class5.method105(class5.method105(var198 << 7, var199 << 10), var200);
                                if (this.field5500 != null) {
                                    this.field5500.field7650 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5554 != null) {
                    for (int var187 = 0; var187 < this.field5527; var187++) {
                        class16 var188 = this.field5554[var187];
                        class237 var189 = this.field5543[var187];
                        var189.field2799 = var189.field2799 & 0xFF000000 | class437.field5749[this.field5536[var188.field288] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5497 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field5497.length > var202) {
                        int[] var203 = this.field5497[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class237 var205 = this.field5543[var203[var204]];
                            var205.field2793 += arg2;
                            var205.field2794 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5497 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field5497.length > var207) {
                        int[] var208 = this.field5497[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class237 var210 = this.field5543[var208[var209]];
                            var210.field2801 = var210.field2801 * arg3 >> 7;
                            var210.field2791 = var210.field2791 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5497 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field5497.length > var212) {
                    int[] var213 = this.field5497[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class237 var215 = this.field5543[var213[var214]];
                        var215.field2800 = var215.field2800 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "LA", descriptor = "(I)V", line = 5726)
    public final void method373(int arg0) {
        if (this.field5500 != null) {
            this.field5500.field7650 = null;
        }
        field5538++;
        this.field5541 = (short) arg0;
        if (this.field5511 != null) {
            this.field5511.field7650 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BIZ)Lka;", line = 5748)
    public final class498 method364(byte arg0, int arg1, boolean arg2) {
        field5509++;
        class421 var4;
        class421 var5;
        if (arg0 == 1) {
            var4 = this.field5546.field9782;
            var5 = this.field5546.field9827;
        } else if (arg0 == 2) {
            var4 = this.field5546.field9861;
            var5 = this.field5546.field9763;
        } else if (arg0 == 3) {
            var4 = this.field5546.field9852;
            var5 = this.field5546.field9809;
        } else if (arg0 == 4) {
            var4 = this.field5546.field9826;
            var5 = this.field5546.field9821;
        } else if (arg0 == 5) {
            var5 = this.field5546.field9777;
            var4 = this.field5546.field9838;
        } else {
            var4 = var5 = new class421(this.field5546);
        }
        return this.method2524(var5, arg2, (byte) -124, var4, arg1, arg0 != 0);
    }
}
