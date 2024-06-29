import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class403 extends class219 {

    @OriginalMember(owner = "client!hn", name = "cb", descriptor = "Z")
    private boolean field5610 = false;

    @OriginalMember(owner = "client!hn", name = "Cb", descriptor = "I")
    private int field5636 = 0;

    @OriginalMember(owner = "client!hn", name = "sb", descriptor = "Z")
    private boolean field5626 = true;

    @OriginalMember(owner = "client!hn", name = "Z", descriptor = "I")
    private int field5607 = 0;

    @OriginalMember(owner = "client!hn", name = "yb", descriptor = "Z")
    private boolean field5632 = false;

    @OriginalMember(owner = "client!hn", name = "Dc", descriptor = "I")
    private int field5689 = 0;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "Z")
    private boolean field5581 = false;

    @OriginalMember(owner = "client!hn", name = "qc", descriptor = "I")
    private int field5676 = 0;

    @OriginalMember(owner = "client!hn", name = "Hc", descriptor = "I")
    private int field5693 = 0;

    @OriginalMember(owner = "client!hn", name = "ic", descriptor = "Leq;")
    private class357 field5668;

    @OriginalMember(owner = "client!hn", name = "fc", descriptor = "Lqe;")
    private class88 field5665;

    @OriginalMember(owner = "client!hn", name = "Tb", descriptor = "Lqe;")
    private class88 field5653;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "Lqe;")
    private class88 field5595;

    @OriginalMember(owner = "client!hn", name = "Fb", descriptor = "Lqe;")
    private class88 field5639;

    @OriginalMember(owner = "client!hn", name = "Rb", descriptor = "Lek;")
    private class492 field5651;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    private int field5593;

    @OriginalMember(owner = "client!hn", name = "sc", descriptor = "I")
    private int field5678;

    @OriginalMember(owner = "client!hn", name = "jb", descriptor = "[I")
    private int[] field5617;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "[I")
    private int[] field5572;

    @OriginalMember(owner = "client!hn", name = "Bc", descriptor = "[S")
    private short[] field5687;

    @OriginalMember(owner = "client!hn", name = "lb", descriptor = "[I")
    private int[] field5619;

    @OriginalMember(owner = "client!hn", name = "mb", descriptor = "[I")
    private int[] field5620;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "[Lal;")
    private class183[] field5573;

    @OriginalMember(owner = "client!hn", name = "cc", descriptor = "[Lmi;")
    private class27[] field5662;

    @OriginalMember(owner = "client!hn", name = "tc", descriptor = "I")
    private int field5679;

    @OriginalMember(owner = "client!hn", name = "Ib", descriptor = "[Lpca;")
    private class567[] field5642;

    @OriginalMember(owner = "client!hn", name = "Nb", descriptor = "[Lnia;")
    private class30[] field5647;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "[B")
    private byte[] field5590;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "[S")
    private short[] field5578;

    @OriginalMember(owner = "client!hn", name = "Fc", descriptor = "[S")
    private short[] field5691;

    @OriginalMember(owner = "client!hn", name = "eb", descriptor = "[S")
    private short[] field5612;

    @OriginalMember(owner = "client!hn", name = "Yb", descriptor = "[S")
    private short[] field5658;

    @OriginalMember(owner = "client!hn", name = "zb", descriptor = "[B")
    private byte[] field5633;

    @OriginalMember(owner = "client!hn", name = "lc", descriptor = "[F")
    private float[] field5671;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "[S")
    private short[] field5575;

    @OriginalMember(owner = "client!hn", name = "ec", descriptor = "S")
    private short field5664;

    @OriginalMember(owner = "client!hn", name = "Db", descriptor = "[S")
    private short[] field5637;

    @OriginalMember(owner = "client!hn", name = "ub", descriptor = "[S")
    private short[] field5628;

    @OriginalMember(owner = "client!hn", name = "Ob", descriptor = "[S")
    private short[] field5648;

    @OriginalMember(owner = "client!hn", name = "Kb", descriptor = "[S")
    private short[] field5644;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "[F")
    private float[] field5585;

    @OriginalMember(owner = "client!hn", name = "hb", descriptor = "S")
    private short field5615;

    @OriginalMember(owner = "client!hn", name = "Xb", descriptor = "[S")
    private short[] field5657;

    @OriginalMember(owner = "client!hn", name = "Gc", descriptor = "[I")
    private int[] field5692;

    @OriginalMember(owner = "client!hn", name = "tb", descriptor = "[[I")
    private int[][] field5627;

    @OriginalMember(owner = "client!hn", name = "Jb", descriptor = "[[I")
    private int[][] field5643;

    @OriginalMember(owner = "client!hn", name = "ib", descriptor = "[[I")
    private int[][] field5616;

    @OriginalMember(owner = "client!hn", name = "ob", descriptor = "[Lgu;")
    public static class536[] field5622 = new class536[37];

    @OriginalMember(owner = "client!hn", name = "Zb", descriptor = "I")
    public static int field5659 = -1;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "Lmq;")
    public static class78 field5589 = new class78(53, -1);

    @OriginalMember(owner = "client!hn", name = "Y", descriptor = "B")
    private byte field5606;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!hn", name = "W", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!hn", name = "X", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!hn", name = "ab", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!hn", name = "bb", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!hn", name = "db", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!hn", name = "gb", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!hn", name = "nb", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!hn", name = "pb", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!hn", name = "qb", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!hn", name = "rb", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!hn", name = "vb", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!hn", name = "wb", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!hn", name = "xb", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!hn", name = "Ab", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!hn", name = "Bb", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!hn", name = "Eb", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!hn", name = "Hb", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!hn", name = "Lb", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!hn", name = "Mb", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!hn", name = "Pb", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!hn", name = "Qb", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!hn", name = "Sb", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!hn", name = "Vb", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!hn", name = "Wb", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!hn", name = "ac", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!hn", name = "bc", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!hn", name = "dc", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!hn", name = "gc", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!hn", name = "hc", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!hn", name = "jc", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!hn", name = "kc", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!hn", name = "mc", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!hn", name = "nc", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!hn", name = "oc", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!hn", name = "pc", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!hn", name = "rc", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!hn", name = "uc", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!hn", name = "vc", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!hn", name = "xc", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!hn", name = "yc", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!hn", name = "Ac", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!hn", name = "Cc", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!hn", name = "Ec", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "Lun;")
    private class284 field5596;

    @OriginalMember(owner = "client!hn", name = "zc", descriptor = "Lur;")
    private class355 field5685;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "Ljb;")
    private class719 field5577;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "S")
    private short field5576;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "S")
    private short field5584;

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "S")
    private short field5599;

    @OriginalMember(owner = "client!hn", name = "fb", descriptor = "S")
    private short field5613;

    @OriginalMember(owner = "client!hn", name = "kb", descriptor = "S")
    private short field5618;

    @OriginalMember(owner = "client!hn", name = "Gb", descriptor = "S")
    private short field5640;

    @OriginalMember(owner = "client!hn", name = "Ub", descriptor = "S")
    private short field5654;

    @OriginalMember(owner = "client!hn", name = "wc", descriptor = "S")
    private short field5682;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lid;IIFIJIFBI)S", line = 7)
    private final short method2383(class415 arg0, int arg1, int arg2, float arg3, int arg4, long arg5, int arg6, float arg7, byte arg8, int arg9) {
        field5683++;
        int var12 = this.field5617[arg9];
        int var13 = this.field5617[arg9 + 1];
        int var14 = 0;
        if (arg8 > -76) {
            this.field5636 = 96;
        }
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field5637[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class98.field1224[var15] == arg5) {
                return (short) (var16 - 1);
            }
        }
        this.field5637[var14] = (short) (this.field5689 + 1);
        class98.field1224[var14] = arg5;
        this.field5612[this.field5689] = (short) arg2;
        this.field5648[this.field5689] = (short) arg4;
        this.field5575[this.field5689] = (short) arg1;
        this.field5590[this.field5689] = (byte) arg6;
        this.field5671[this.field5689] = arg7;
        this.field5585[this.field5689] = arg3;
        return (short) (this.field5689++);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "()[Lal;", line = 55)
    public final class183[] method1332() {
        field5661++;
        return this.field5573;
    }

    @OriginalMember(owner = "client!hn", name = "RA", descriptor = "()I", line = 63)
    public final int method1359() {
        field5672++;
        if (!this.field5632) {
            this.method2388(true);
        }
        return this.field5640;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BIZ)Lka;", line = 77)
    public final class219 method1337(byte arg0, int arg1, boolean arg2) {
        field5641++;
        class403 var4;
        class403 var5;
        if (arg0 == 1) {
            var4 = this.field5668.field5027;
            var5 = this.field5668.field5099;
        } else if (arg0 == 2) {
            var5 = this.field5668.field4998;
            var4 = this.field5668.field5041;
        } else if (arg0 == 3) {
            var5 = this.field5668.field5090;
            var4 = this.field5668.field5054;
        } else if (arg0 == 4) {
            var4 = this.field5668.field5036;
            var5 = this.field5668.field5064;
        } else if (arg0 == 5) {
            var5 = this.field5668.field5062;
            var4 = this.field5668.field5015;
        } else {
            var4 = var5 = new class403(this.field5668);
        }
        return this.method2392(arg1, arg0 != 0, var4, var5, arg2, 6);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(ZI)V", line = 126)
    private final void method2384(boolean arg0, int arg1) {
        field5598++;
        boolean var3 = this.field5639 != null && this.field5639.field1118 == null;
        boolean var4 = this.field5595 != null && this.field5595.field1118 == null;
        boolean var5 = this.field5665 != null && this.field5665.field1118 == null;
        boolean var6 = this.field5653 != null && this.field5653.field1118 == null;
        if (arg0) {
            var3 &= (this.field5606 & 0x2) != 0;
            var5 &= (this.field5606 & 0x1) != 0;
            var4 &= (this.field5606 & 0x4) != 0;
            var6 &= (this.field5606 & 0x8) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        if (arg1 != 255) {
            this.field5633 = null;
        }
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
        if (this.field5668.field5044.field2325.length < this.field5689 * var7) {
            this.field5668.field5044 = new class552((this.field5689 + 100) * var7);
        } else {
            this.field5668.field5044.field2354 = 0;
        }
        class552 var12 = this.field5668.field5044;
        if (var5) {
            if (this.field5668.field5025) {
                for (int var13 = 0; var13 < this.field5676; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field5572[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field5620[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field5619[var13]);
                    int var17 = this.field5617[var13];
                    int var18 = this.field5617[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field5637[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field2354 = var7 * var20;
                        var12.method1112(var14, arg1 - 382);
                        var12.method1112(var15, -121);
                        var12.method1112(var16, -127);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field5676; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field5572[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field5620[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field5619[var21]);
                    int var25 = this.field5617[var21];
                    int var26 = this.field5617[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field5637[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field2354 = var7 * var28;
                        var12.method1155(70, var22);
                        var12.method1155(-112, var23);
                        var12.method1155(-100, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field5595 == null) {
                short[] var29;
                short[] var30;
                byte[] var31;
                short[] var32;
                if (this.field5596 == null) {
                    var29 = this.field5575;
                    var30 = this.field5648;
                    var31 = this.field5590;
                    var32 = this.field5612;
                } else {
                    var30 = this.field5596.field3615;
                    var31 = this.field5596.field3619;
                    var32 = this.field5596.field3621;
                    var29 = this.field5596.field3620;
                }
                float var33 = this.field5668.field5031[0];
                float var34 = this.field5668.field5031[1];
                float var35 = this.field5668.field5031[2];
                float var36 = this.field5668.field5052;
                float var37 = this.field5668.field4994 * 768.0F / (float) this.field5664;
                float var38 = this.field5668.field5101 * 768.0F / (float) this.field5664;
                for (int var39 = 0; var39 < this.field5693; var39++) {
                    int var40 = this.method2385(this.field5615, this.field5578[var39], 92, this.field5658[var39], this.field5633[var39]);
                    float var41 = (float) (var40 >> 8 & 0xFF) * this.field5668.field5018;
                    float var42 = (float) ((var40 & 0xFF5DDB) >> 16) * this.field5668.field5019;
                    short var43 = this.field5628[var39];
                    float var44 = (float) (var40 >>> 24) * this.field5668.field5102;
                    short var45 = (short) var31[var43];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var29[var43] * var35 + (float) var30[var43] * var34 + (float) var32[var43] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var29[var43] * var35 + (float) var30[var43] * var34 + (float) var32[var43] * var33) / (float) (var45 * 256);
                    }
                    float var47 = ((var46 < 0.0F) ? var38 : var37) * var46 + var36;
                    int var48 = (int) (var44 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var42 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var41 * var47);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field2354 = var7 * var43 + var9;
                    var12.method1141(var48, 121);
                    var12.method1141(var49, arg1 ^ 0xD2);
                    var12.method1141(var50, 77);
                    var12.method1141(255 - (this.field5633[var39] & 0xFF), arg1 ^ 0xFFFFFF61);
                    short var51 = this.field5657[var39];
                    short var52 = (short) var31[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var29[var51] * var35 + (float) var30[var51] * var34 + (float) var32[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var29[var51] * var35 + (float) var30[var51] * var34 + (float) var32[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var36 + ((var53 < 0.0F) ? var38 : var37) * var53;
                    int var55 = (int) (var44 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var42 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var41 * var54);
                    var12.field2354 = var7 * var51 + var9;
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method1141(var55, -96);
                    var12.method1141(var56, -59);
                    var12.method1141(var57, arg1 ^ 0xE5);
                    var12.method1141(255 - (this.field5633[var39] & 0xFF), arg1 + -185);
                    short var58 = this.field5644[var39];
                    short var59 = (short) var31[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var29[var58] * var35 + (float) var30[var58] * var34 + (float) var32[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var29[var58] * var35 + (float) var30[var58] * var34 + (float) var32[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var36 + var60 * (var60 < 0.0F ? var38 : var37);
                    int var62 = (int) (var44 * var61);
                    int var63 = (int) (var42 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var41 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field2354 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method1141(var62, arg1 - 356);
                    var12.method1141(var63, arg1 ^ 0xFFFFFF70);
                    var12.method1141(var64, 102);
                    var12.method1141(255 - (this.field5633[var39] & 0xFF), -53);
                }
            } else {
                for (int var65 = 0; var65 < this.field5693; var65++) {
                    int var66 = this.method2385(this.field5615, this.field5578[var65], 77, this.field5658[var65], this.field5633[var65]);
                    var12.field2354 = this.field5628[var65] * var7 + var9;
                    var12.method1112(var66, -122);
                    var12.field2354 = this.field5657[var65] * var7 + var9;
                    var12.method1112(var66, arg1 ^ 0xFFFFFF7E);
                    var12.field2354 = this.field5644[var65] * var7 + var9;
                    var12.method1112(var66, -121);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field5596 == null) {
                var69 = this.field5612;
                var68 = this.field5590;
                var67 = this.field5575;
                var70 = this.field5648;
            } else {
                var67 = this.field5596.field3620;
                var68 = this.field5596.field3619;
                var69 = this.field5596.field3621;
                var70 = this.field5596.field3615;
            }
            float var71 = 3.0F / (float) this.field5664;
            var12.field2354 = var10;
            float var72 = 3.0F / (float) (this.field5664 / 2 + this.field5664);
            if (this.field5668.field5025) {
                for (int var76 = 0; var76 < this.field5689; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method3144((float) var69[var76] * var72, false);
                        var12.method3144((float) var70[var76] * var72, false);
                        var12.method3144((float) var67[var76] * var72, false);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method3144((float) var69[var76] * var78, false);
                        var12.method3144((float) var70[var76] * var78, false);
                        var12.method3144((float) var67[var76] * var78, false);
                    }
                    var12.field2354 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field5689; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method3145((float) var69[var73] * var72, -1);
                        var12.method3145((float) var70[var73] * var72, arg1 ^ 0xFFFFFF00);
                        var12.method3145((float) var67[var73] * var72, arg1 ^ 0xFFFFFF00);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method3145((float) var69[var73] * var75, arg1 - 256);
                        var12.method3145((float) var70[var73] * var75, -1);
                        var12.method3145((float) var67[var73] * var75, -1);
                    }
                    var12.field2354 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field2354 = var11;
            if (this.field5668.field5025) {
                for (int var80 = 0; var80 < this.field5689; var80++) {
                    var12.method3144(this.field5671[var80], false);
                    var12.method3144(this.field5585[var80], false);
                    var12.field2354 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field5689; var79++) {
                    var12.method3145(this.field5671[var79], -1);
                    var12.method3145(this.field5585[var79], -1);
                    var12.field2354 += var7 - 8;
                }
            }
        }
        var12.field2354 = this.field5689 * var7;
        class355 var81;
        if (arg0) {
            if (this.field5685 == null) {
                this.field5685 = this.field5668.method2180(var7, var12.field2354, var12.field2325, true, true);
            } else {
                this.field5685.method2109(var12.field2325, (byte) -76, var12.field2354, var7);
            }
            var81 = this.field5685;
            this.field5606 = 0;
        } else {
            var81 = this.field5668.method2180(var7, var12.field2354, var12.field2325, true, false);
            this.field5626 = true;
        }
        if (var5) {
            this.field5665.field1117 = var8;
            this.field5665.field1118 = var81;
        }
        if (var6) {
            this.field5653.field1118 = var81;
            this.field5653.field1117 = var11;
        }
        if (var3) {
            this.field5639.field1117 = var9;
            this.field5639.field1118 = var81;
        }
        if (var4) {
            this.field5595.field1118 = var81;
            this.field5595.field1117 = var10;
        }
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "()V", line = 648)
    public final void method1371() {
        field5621++;
    }

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "(I)V", line = 657)
    public final void method1336(int arg0) {
        field5582++;
        this.field5615 = (short) arg0;
        if (this.field5639 != null) {
            this.field5639.field1118 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ISIIB)I", line = 672)
    private final int method2385(int arg0, short arg1, int arg2, int arg3, byte arg4) {
        field5680++;
        int var6 = class198.field2542[class44.method366(arg3, false, arg0)];
        if (arg2 <= 72) {
            this.field5687 = null;
        }
        if (arg1 != -1) {
            class91 var7 = this.field5668.field6364.method389(9559, arg1 & 0xFFFF);
            int var8 = var7.field1156 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg0 < 0) {
                    var9 = 0;
                } else if (arg0 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg0 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field1166 & 0xFF;
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
                var6 = (var14 & 0xFF00) + (var15 >> 8) + (var13 << 8 & 0xFF003C);
            }
        }
        return (var6 << 8) + 255 - (arg4 & 0xFF);
    }

    @OriginalMember(owner = "client!hn", name = "WA", descriptor = "()I", line = 748)
    public final int method1321() {
        field5602++;
        return this.field5615;
    }

    @OriginalMember(owner = "client!hn", name = "fa", descriptor = "()I", line = 759)
    public final int method1353() {
        field5580++;
        if (!this.field5632) {
            this.method2388(true);
        }
        return this.field5618;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILwc;ZIIIZ)Z", line = 772)
    private final boolean method2386(int arg0, class376 arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5574++;
        class688 var8 = (class688) arg1;
        class688 var9 = this.field5668.field4987;
        float var10 = var8.field9774 * var9.field9773 + var8.field9782 * var9.field9763 + var8.field9775 * var9.field9755 + var9.field9782;
        float var11 = var8.field9774 * var9.field9758 + var8.field9782 * var9.field9753 + var8.field9775 * var9.field9771 + var9.field9775;
        class423.field6008 = var8.field9776 * var9.field9758 + var8.field9763 * var9.field9753 + var8.field9753 * var9.field9771;
        float var12 = var8.field9774 * var9.field9756 + var8.field9782 * var9.field9776 + var8.field9775 * var9.field9764 + var9.field9774;
        class576.field8040 = var8.field9764 * var9.field9758 + var8.field9771 * var9.field9771 + var8.field9755 * var9.field9753;
        class716.field10100 = var8.field9776 * var9.field9773 + var8.field9763 * var9.field9763 + var8.field9753 * var9.field9755;
        class14.field201 = var8.field9756 * var9.field9773 + var8.field9773 * var9.field9763 + var8.field9758 * var9.field9755;
        class204.field2595 = var8.field9764 * var9.field9756 + var8.field9771 * var9.field9764 + var8.field9755 * var9.field9776;
        class465.field6718 = var8.field9756 * var9.field9756 + var8.field9773 * var9.field9776 + var8.field9758 * var9.field9764;
        class612.field8454 = var8.field9764 * var9.field9773 + var8.field9771 * var9.field9755 + var8.field9755 * var9.field9763;
        class760.field10596 = var8.field9776 * var9.field9756 + var8.field9763 * var9.field9776 + var8.field9753 * var9.field9764;
        class700.field9874 = var8.field9756 * var9.field9758 + var8.field9773 * var9.field9753 + var8.field9758 * var9.field9771;
        boolean var13 = arg2;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field5668.field5055;
        int var19 = this.field5668.field5001;
        if (!this.field5632) {
            this.method2388(!arg2);
        }
        int var20 = this.field5640 - this.field5654 >> 1;
        int var21 = this.field5682 - this.field5618 >> 1;
        int var22 = this.field5613 - this.field5576 >> 1;
        int var23 = this.field5654 + var20;
        int var24 = this.field5618 + var21;
        int var25 = this.field5576 + var22;
        int var26 = var23 - (var20 << arg3);
        int var27 = var24 - (var21 << arg3);
        int var28 = var25 - (var22 << arg3);
        int var29 = (var20 << arg3) + var23;
        int var30 = (var21 << arg3) + var24;
        int var31 = var25 + (var22 << arg3);
        class49.field726[0] = var26;
        class279.field3543[0] = var27;
        class507.field7175[0] = var28;
        class49.field726[1] = var29;
        class279.field3543[1] = var27;
        class49.field726[2] = var26;
        class507.field7175[1] = var28;
        class279.field3543[2] = var30;
        class49.field726[3] = var29;
        class507.field7175[2] = var28;
        class279.field3543[3] = var30;
        class49.field726[4] = var26;
        class507.field7175[3] = var28;
        class279.field3543[4] = var27;
        class49.field726[5] = var29;
        class507.field7175[4] = var31;
        class279.field3543[5] = var27;
        class507.field7175[5] = var31;
        class49.field726[6] = var26;
        class279.field3543[6] = var30;
        class507.field7175[6] = var31;
        class49.field726[7] = var29;
        class279.field3543[7] = var30;
        class507.field7175[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class507.field7175[var32];
            float var54 = (float) class49.field726[var32];
            float var55 = (float) class279.field3543[var32];
            float var56 = class14.field201 * var53 + class716.field10100 * var54 + class612.field8454 * var55 + var10;
            float var57 = class700.field9874 * var53 + class576.field8040 * var55 + class423.field6008 * var54 + var11;
            float var58 = class465.field6718 * var53 + class760.field10596 * var54 + class204.field2595 * var55 + var12;
            if (var58 >= (float) this.field5668.field5060) {
                if (arg5 > 0) {
                    var58 = arg5;
                }
                float var59 = (float) var18 * var56 / var58 + (float) this.field5668.field5067;
                if (var59 < var14) {
                    var14 = var59;
                }
                float var60 = (float) var19 * var57 / var58 + (float) this.field5668.field5016;
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
        if (var13 && var14 < (float) arg4 && (float) arg4 < var15 && var16 < (float) arg0 && var17 > (float) arg0) {
            if (arg6) {
                return true;
            }
            if (this.field5689 > this.field5668.field5107.length) {
                this.field5668.field5107 = new int[this.field5689];
                this.field5668.field5105 = new int[this.field5689];
            }
            int[] var33 = this.field5668.field5107;
            int[] var34 = this.field5668.field5105;
            for (int var35 = 0; var35 < this.field5676; var35++) {
                float var37 = (float) this.field5572[var35];
                float var38 = (float) this.field5620[var35];
                float var39 = (float) this.field5619[var35];
                float var40 = class465.field6718 * var39 + class760.field10596 * var37 + class204.field2595 * var38 + var12;
                float var41 = class700.field9874 * var39 + class576.field8040 * var38 + class423.field6008 * var37 + var11;
                float var42 = class14.field201 * var39 + class716.field10100 * var37 + class612.field8454 * var38 + var10;
                if (((float) this.field5668.field5060 <= var40)) {
                    if (arg5 > 0) {
                        var40 = arg5;
                    }
                    int var47 = (int) ((float) var18 * var42 / var40 + (float) this.field5668.field5067);
                    int var48 = (int) ((float) var19 * var41 / var40 + (float) this.field5668.field5016);
                    int var49 = this.field5617[var35];
                    int var50 = this.field5617[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field5637[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[var52] = var47;
                        var34[var52] = var48;
                    }
                } else {
                    int var43 = this.field5617[var35];
                    int var44 = this.field5617[var35 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field5637[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        var33[this.field5637[var45] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field5693; var36++) {
                if (var33[this.field5628[var36]] != -999999 && var33[this.field5657[var36]] != -999999 && var33[this.field5644[var36]] != -999999 && this.method2390(var34[this.field5628[var36]], arg4, (byte) 69, var33[this.field5657[var36]], var33[this.field5644[var36]], var34[this.field5657[var36]], arg0, var34[this.field5644[var36]], var33[this.field5628[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "()[Lmi;", line = 1016)
    public final class27[] method1335() {
        field5601++;
        return this.field5662;
    }

    @OriginalMember(owner = "client!hn", name = "wa", descriptor = "()V", line = 1024)
    public final void method1352() {
        field5638++;
        for (int var1 = 0; var1 < this.field5636; var1++) {
            this.field5572[var1] = this.field5572[var1] + 7 >> 4;
            this.field5620[var1] = this.field5620[var1] + 7 >> 4;
            this.field5619[var1] = this.field5619[var1] + 7 >> 4;
        }
        if (this.field5665 != null) {
            this.field5665.field1118 = null;
        }
        this.field5632 = false;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lka;IIIZ)V", line = 1047)
    public final void method1329(class219 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5592++;
        class403 var6 = (class403) arg0;
        if (this.field5693 == 0 || var6.field5693 == 0) {
            return;
        }
        int var7 = var6.field5676;
        int[] var8 = var6.field5572;
        int[] var9 = var6.field5620;
        int[] var10 = var6.field5619;
        short[] var11 = var6.field5612;
        short[] var12 = var6.field5648;
        short[] var13 = var6.field5575;
        byte[] var14 = var6.field5590;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field5596 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var17 = this.field5596.field3620;
            var15 = this.field5596.field3621;
            var16 = this.field5596.field3619;
            var18 = this.field5596.field3615;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5596 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field5596.field3615;
            var20 = var6.field5596.field3619;
            var21 = var6.field5596.field3620;
            var22 = var6.field5596.field3621;
        }
        int[] var23 = var6.field5617;
        short[] var24 = var6.field5637;
        if (!var6.field5632) {
            var6.method2388(true);
        }
        short var25 = var6.field5618;
        short var26 = var6.field5682;
        short var27 = var6.field5654;
        short var28 = var6.field5640;
        short var29 = var6.field5576;
        short var30 = var6.field5613;
        for (int var31 = 0; var31 < this.field5676; var31++) {
            int var32 = this.field5620[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field5572[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field5619[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5617[var31];
                        int var37 = this.field5617[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5637[var38] - 1;
                            if (var35 == -1 || this.field5590[var35] != 0) {
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
                                        if (var15 == null) {
                                            this.field5596 = new class284();
                                            var15 = this.field5596.field3621 = class262.method1586(this.field5612, 0);
                                            var18 = this.field5596.field3615 = class262.method1586(this.field5648, 0);
                                            var17 = this.field5596.field3620 = class262.method1586(this.field5575, 0);
                                            var16 = this.field5596.field3619 = class522.method3000(false, this.field5590);
                                        }
                                        if (var22 == null) {
                                            class284 var44 = var6.field5596 = new class284();
                                            var22 = var44.field3621 = class262.method1586(var11, 0);
                                            var19 = var44.field3615 = class262.method1586(var12, 0);
                                            var21 = var44.field3620 = class262.method1586(var13, 0);
                                            var20 = var44.field3619 = class522.method3000(false, var14);
                                        }
                                        short var45 = this.field5612[var35];
                                        short var46 = this.field5648[var35];
                                        short var47 = this.field5575[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field5590[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var22[var52] += var45;
                                                var19[var52] += var46;
                                                var21[var52] += var47;
                                                var20[var52] += var49;
                                            }
                                        }
                                        int var53 = this.field5617[var31 + 1];
                                        int var54 = this.field5617[var31];
                                        byte var55 = var14[var42];
                                        short var56 = var12[var42];
                                        short var57 = var11[var42];
                                        short var58 = var13[var42];
                                        for (int var59 = var54; var59 < var53; var59++) {
                                            int var60 = this.field5637[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var15[var60] += var57;
                                                var18[var60] += var56;
                                                var17[var60] += var58;
                                                var16[var60] += var55;
                                            }
                                        }
                                        if (this.field5595 == null && this.field5639 != null) {
                                            this.field5639.field1118 = null;
                                        }
                                        if (this.field5595 != null) {
                                            this.field5595.field1118 = null;
                                        }
                                        if (var6.field5595 == null && var6.field5639 != null) {
                                            var6.field5639.field1118 = null;
                                        }
                                        if (var6.field5595 != null) {
                                            var6.field5595.field1118 = null;
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

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "(IIII)V", line = 1320)
    public final void method1350(int arg0, int arg1, int arg2, int arg3) {
        field5630++;
        if (arg0 == 0) {
            class437.field6135 = 0;
            class552.field7761 = 0;
            int var5 = 0;
            class745.field10394 = 0;
            for (int var6 = 0; var6 < this.field5676; var6++) {
                class745.field10394 += this.field5572[var6];
                class552.field7761 += this.field5620[var6];
                var5++;
                class437.field6135 += this.field5619[var6];
            }
            if (var5 > 0) {
                class745.field10394 = class745.field10394 / var5 + arg1;
                class437.field6135 = class437.field6135 / var5 + arg3;
                class552.field7761 = class552.field7761 / var5 + arg2;
            } else {
                class552.field7761 = arg2;
                class437.field6135 = arg3;
                class745.field10394 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5676; var7++) {
                this.field5572[var7] += arg1;
                this.field5620[var7] += arg2;
                this.field5619[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5676; var8++) {
                this.field5572[var8] -= class745.field10394;
                this.field5620[var8] -= class552.field7761;
                this.field5619[var8] -= class437.field6135;
                if (arg3 != 0) {
                    int var9 = class138.field1644[arg3];
                    int var10 = class138.field1645[arg3];
                    int var11 = this.field5620[var8] * var9 + this.field5572[var8] * var10 + 16383 >> 14;
                    this.field5620[var8] = this.field5620[var8] * var10 + 16383 - (this.field5572[var8] * var9) >> 14;
                    this.field5572[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class138.field1644[arg1];
                    int var13 = class138.field1645[arg1];
                    int var14 = this.field5620[var8] * var13 + 16383 - this.field5619[var8] * var12 >> 14;
                    this.field5619[var8] = this.field5620[var8] * var12 + this.field5619[var8] * var13 + 16383 >> 14;
                    this.field5620[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class138.field1644[arg2];
                    int var16 = class138.field1645[arg2];
                    int var17 = this.field5572[var8] * var16 + this.field5619[var8] * var15 + 16383 >> 14;
                    this.field5619[var8] = this.field5619[var8] * var16 + 16383 - (this.field5572[var8] * var15) >> 14;
                    this.field5572[var8] = var17;
                }
                this.field5572[var8] += class745.field10394;
                this.field5620[var8] += class552.field7761;
                this.field5619[var8] += class437.field6135;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5676; var18++) {
                this.field5572[var18] -= class745.field10394;
                this.field5620[var18] -= class552.field7761;
                this.field5619[var18] -= class437.field6135;
                this.field5572[var18] = this.field5572[var18] * arg1 / 128;
                this.field5620[var18] = this.field5620[var18] * arg2 / 128;
                this.field5619[var18] = this.field5619[var18] * arg3 / 128;
                this.field5572[var18] += class745.field10394;
                this.field5620[var18] += class552.field7761;
                this.field5619[var18] += class437.field6135;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5693; var19++) {
                int var23 = (this.field5633[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5633[var19] = (byte) var23;
            }
            if (this.field5639 != null) {
                this.field5639.field1118 = null;
            }
            if (this.field5642 != null) {
                for (int var20 = 0; var20 < this.field5679; var20++) {
                    class567 var21 = this.field5642[var20];
                    class30 var22 = this.field5647[var20];
                    var22.field486 = 255 - (this.field5633[var21.field7918] & 0xFF) << 24 | var22.field486 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5693; var24++) {
                int var28 = this.field5658[var24] & 0xFFFF;
                int var29 = (var28 & 0xFDF8) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = var29 + arg1 & 0x3F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field5658[var24] = (short) class216.method1308(class216.method1308(var33 << 7, var32 << 10), var34);
            }
            if (this.field5639 != null) {
                this.field5639.field1118 = null;
            }
            if (this.field5642 != null) {
                for (int var25 = 0; var25 < this.field5679; var25++) {
                    class567 var26 = this.field5642[var25];
                    class30 var27 = this.field5647[var25];
                    var27.field486 = class198.field2542[this.field5658[var26.field7918] & 0xFFFF] & 0xFFFFFF | var27.field486 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5679; var35++) {
                class30 var36 = this.field5647[var35];
                var36.field483 += arg1;
                var36.field484 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5679; var37++) {
                class30 var38 = this.field5647[var37];
                var38.field489 = var38.field489 * arg2 >> 7;
                var38.field478 = var38.field478 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5679; var39++) {
                class30 var40 = this.field5647[var39];
                var40.field481 = var40.field481 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lwc;)V", line = 1633)
    public final void method1366(class376 arg0) {
        field5675++;
        class688 var2 = (class688) arg0;
        if (this.field5573 != null) {
            for (int var3 = 0; var3 < this.field5573.length; var3++) {
                class183 var4 = this.field5573[var3];
                class183 var5 = var4;
                if (var4.field2408 != null) {
                    var5 = var4.field2408;
                }
                var5.field2395 = (int) ((float) this.field5619[var4.field2393] * var2.field9773 + (float) this.field5620[var4.field2393] * var2.field9755 + (float) this.field5572[var4.field2393] * var2.field9763 + var2.field9782);
                var5.field2396 = (int) ((float) this.field5619[var4.field2393] * var2.field9758 + (float) this.field5620[var4.field2393] * var2.field9771 + (float) this.field5572[var4.field2393] * var2.field9753 + var2.field9775);
                var5.field2403 = (int) ((float) this.field5619[var4.field2393] * var2.field9756 + (float) this.field5620[var4.field2393] * var2.field9764 + (float) this.field5572[var4.field2393] * var2.field9776 + var2.field9774);
                var5.field2390 = (int) ((float) this.field5619[var4.field2394] * var2.field9773 + (float) this.field5620[var4.field2394] * var2.field9755 + (float) this.field5572[var4.field2394] * var2.field9763 + var2.field9782);
                var5.field2399 = (int) ((float) this.field5619[var4.field2394] * var2.field9758 + (float) this.field5620[var4.field2394] * var2.field9771 + (float) this.field5572[var4.field2394] * var2.field9753 + var2.field9775);
                var5.field2397 = (int) ((float) this.field5619[var4.field2394] * var2.field9756 + (float) this.field5620[var4.field2394] * var2.field9764 + (float) this.field5572[var4.field2394] * var2.field9776 + var2.field9774);
                var5.field2409 = (int) ((float) this.field5619[var4.field2402] * var2.field9773 + (float) this.field5620[var4.field2402] * var2.field9755 + (float) this.field5572[var4.field2402] * var2.field9763 + var2.field9782);
                var5.field2406 = (int) ((float) this.field5619[var4.field2402] * var2.field9758 + (float) this.field5620[var4.field2402] * var2.field9771 + (float) this.field5572[var4.field2402] * var2.field9753 + var2.field9775);
                var5.field2405 = (int) ((float) this.field5619[var4.field2402] * var2.field9756 + (float) this.field5620[var4.field2402] * var2.field9764 + (float) this.field5572[var4.field2402] * var2.field9776 + var2.field9774);
            }
        }
        if (this.field5662 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5662.length; var6++) {
            class27 var7 = this.field5662[var6];
            class27 var8 = var7;
            if (var7.field445 != null) {
                var8 = var7.field445;
            }
            if (var7.field440 == null) {
                var7.field440 = var2.method1965();
            } else {
                var7.field440.method1961(var2);
            }
            var8.field447 = (int) ((float) this.field5619[var7.field444] * var2.field9773 + (float) this.field5620[var7.field444] * var2.field9755 + (float) this.field5572[var7.field444] * var2.field9763 + var2.field9782);
            var8.field443 = (int) ((float) this.field5619[var7.field444] * var2.field9758 + (float) this.field5620[var7.field444] * var2.field9771 + (float) this.field5572[var7.field444] * var2.field9753 + var2.field9775);
            var8.field451 = (int) ((float) this.field5619[var7.field444] * var2.field9756 + (float) this.field5620[var7.field444] * var2.field9764 + (float) this.field5572[var7.field444] * var2.field9776 + var2.field9774);
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Leq;)V", line = 5760)
    public class403(class357 arg0) {
        this.field5668 = arg0;
        this.field5665 = new class88(null, 5126, 3, 0);
        this.field5653 = new class88(null, 5126, 2, 0);
        this.field5595 = new class88(null, 5126, 3, 0);
        this.field5639 = new class88(null, 5121, 4, 0);
        this.field5651 = new class492();
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Leq;Lid;IIII)V", line = 5772)
    public class403(class357 arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5668 = arg0;
        this.field5593 = arg5;
        this.field5678 = arg2;
        if (class65.method492(arg5, arg2, 0)) {
            this.field5665 = new class88(null, 5126, 3, 0);
        }
        if (class439.method2592(-83, arg2, arg5)) {
            this.field5653 = new class88(null, 5126, 2, 0);
        }
        if (class34.method312(arg2, arg5, 16080)) {
            this.field5595 = new class88(null, 5126, 3, 0);
        }
        if (class710.method3922(arg2, (byte) -104, arg5)) {
            this.field5639 = new class88(null, 5121, 4, 0);
        }
        if (class589.method3277(true, arg2, arg5)) {
            this.field5651 = new class492();
        }
        class96 var7 = arg0.field6364;
        int[] var8 = new int[arg1.field5862];
        this.field5617 = new int[arg1.field5854 + 1];
        for (int var9 = 0; var9 < arg1.field5862; var9++) {
            if (arg1.field5875 == null || arg1.field5875[var9] != 2) {
                if (arg1.field5905 != null && arg1.field5905[var9] != -1) {
                    class91 var173 = var7.method389(9559, arg1.field5905[var9] & 0xFFFF);
                    if (((this.field5593 & 0x40) == 0 || !var173.field1167) && var173.field1164) {
                        continue;
                    }
                }
                var8[this.field5693++] = var9;
                this.field5617[arg1.field5865[var9]]++;
                this.field5617[arg1.field5902[var9]]++;
                this.field5617[arg1.field5890[var9]]++;
            }
        }
        this.field5607 = this.field5693;
        long[] var10 = new long[this.field5693];
        boolean var11 = (this.field5678 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field5693; var12++) {
            int var156 = var8[var12];
            class91 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field5855 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field5855.length; var163++) {
                    class609 var164 = arg1.field5855[var163];
                    if (var164.field8436 == var156) {
                        class13 var165 = class310.method1810((byte) -18, var164.field8440);
                        if (var165.field188) {
                            var162 = true;
                        }
                        if (var165.field184 != -1) {
                            class91 var166 = var7.method389(9559, var165.field184);
                            if (var166.field1165 == 2) {
                                this.field5581 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field5607--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field5905 != null) {
                var167 = arg1.field5905[var156];
                if (var167 != -1) {
                    var157 = var7.method389(9559, var167 & 0xFFFF);
                    if ((this.field5593 & 0x40) != 0 && var157.field1167) {
                        var167 = -1;
                        var157 = null;
                    } else {
                        var160 = var157.field1149;
                        if (var157.field1148 != 0 || var157.field1161 != 0) {
                            this.field5610 = true;
                        }
                        var161 = var157.field1160;
                    }
                }
            }
            boolean var168 = arg1.field5860 != null && arg1.field5860[var156] != 0 || var157 != null && var157.field1165 != 0;
            if ((var11 || var168) && arg1.field5872 != null) {
                var158 += arg1.field5872[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = ((var167 & 0xFFFF) << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + (long) var172;
            this.field5581 |= var168;
            this.field5610 |= var157 != null && (var157.field1148 != 0 || var157.field1161 != 0);
        }
        class630.method3432((byte) 116, var8, var10);
        this.field5636 = arg1.field5908;
        this.field5572 = arg1.field5892;
        this.field5687 = arg1.field5887;
        this.field5676 = arg1.field5854;
        this.field5619 = arg1.field5889;
        this.field5620 = arg1.field5857;
        this.field5573 = arg1.field5856;
        class181[] var13 = new class181[this.field5676];
        this.field5662 = arg1.field5888;
        if (arg1.field5855 != null) {
            this.field5679 = arg1.field5855.length;
            this.field5642 = new class567[this.field5679];
            this.field5647 = new class30[this.field5679];
            for (int var14 = 0; var14 < this.field5679; var14++) {
                class609 var15 = arg1.field5855[var14];
                class13 var16 = class310.method1810((byte) -128, var15.field8440);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5693; var18++) {
                    if (var8[var18] == var15.field8436) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class198.field2542[arg1.field5870[var15.field8436] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field5860 == null ? 0 : arg1.field5860[var15.field8436]) << 24;
                this.field5642[var14] = new class567(var17, arg1.field5865[var15.field8436], arg1.field5902[var15.field8436], arg1.field5890[var15.field8436], var16.field185, var16.field186, var16.field184, var16.field182, var16.field189, var16.field188, var16.field183, var15.field8442);
                this.field5647[var14] = new class30(var20);
            }
        }
        int var21 = this.field5693 * 3;
        this.field5590 = new byte[var21];
        this.field5578 = new short[this.field5693];
        class98.field1224 = new long[var21];
        if (arg1.field5879 != null) {
            this.field5691 = new short[this.field5693];
        }
        this.field5612 = new short[var21];
        this.field5658 = new short[this.field5693];
        this.field5633 = new byte[this.field5693];
        this.field5671 = new float[var21];
        this.field5575 = new short[var21];
        this.field5664 = (short) arg4;
        this.field5637 = new short[var21];
        this.field5628 = new short[this.field5693];
        this.field5648 = new short[var21];
        this.field5644 = new short[this.field5693];
        this.field5585 = new float[var21];
        this.field5615 = (short) arg3;
        this.field5657 = new short[this.field5693];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field5854; var23++) {
            int var155 = this.field5617[var23];
            this.field5617[var23] = var22;
            var13[var23] = new class181();
            var22 += var155;
        }
        this.field5617[arg1.field5854] = var22;
        class760 var24 = class570.method3204(var8, -94, this.field5693, arg1);
        class7[] var25 = new class7[arg1.field5862];
        for (int var26 = 0; var26 < arg1.field5862; var26++) {
            short var134 = arg1.field5865[var26];
            short var135 = arg1.field5902[var26];
            short var136 = arg1.field5890[var26];
            int var137 = this.field5572[var135] - this.field5572[var134];
            int var138 = this.field5620[var135] - this.field5620[var134];
            int var139 = this.field5619[var135] - this.field5619[var134];
            int var140 = this.field5572[var136] - this.field5572[var134];
            int var141 = this.field5620[var136] - this.field5620[var134];
            int var142 = this.field5619[var136] - this.field5619[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145 = var137 * var141 - var138 * var140;
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var145 >>= 0x1;
                var144 >>= 0x1;
                var143 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var145 * var145 + (var143 * var143 + (var144 * var144))));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var143 * 256 / var146;
            int var148 = var144 * 256 / var146;
            int var149 = var145 * 256 / var146;
            byte var150 = arg1.field5875 == null ? 0 : arg1.field5875[var26];
            if (var150 == 0) {
                class181 var151 = var13[var134];
                var151.field2378++;
                var151.field2379 += var147;
                var151.field2375 += var148;
                var151.field2374 += var149;
                class181 var152 = var13[var135];
                var152.field2378++;
                var152.field2375 += var148;
                var152.field2374 += var149;
                var152.field2379 += var147;
                class181 var153 = var13[var136];
                var153.field2375 += var148;
                var153.field2379 += var147;
                var153.field2374 += var149;
                var153.field2378++;
            } else if (var150 == 1) {
                class7 var154 = var25[var26] = new class7();
                var154.field70 = var147;
                var154.field75 = var149;
                var154.field74 = var148;
            }
        }
        for (int var27 = 0; var27 < this.field5693; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field5870[var43] & 0xFFFF;
            int var45;
            if (arg1.field5895 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field5895[var43];
            }
            int var46;
            if (arg1.field5860 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field5860[var43] & 0xFF;
            }
            short var47 = arg1.field5905 == null ? -1 : arg1.field5905[var43];
            if (var47 != -1 && (this.field5593 & 0x40) != 0) {
                class91 var48 = var7.method389(9559, var47 & 0xFFFF);
                if (var48.field1167) {
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
                    var53 = 0.0F;
                    var56 = 2;
                    var52 = 1.0F;
                    var54 = 0.0F;
                    var50 = 1.0F;
                    var51 = 1.0F;
                    var55 = 1;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field5869[var45];
                    if (var58 == 0) {
                        short var87 = arg1.field5865[var43];
                        short var88 = arg1.field5902[var43];
                        short var89 = arg1.field5890[var43];
                        short var90 = arg1.field5864[var45];
                        short var91 = arg1.field5859[var45];
                        short var92 = arg1.field5867[var45];
                        float var93 = (float) arg1.field5892[var90];
                        float var94 = (float) arg1.field5857[var90];
                        float var95 = (float) arg1.field5889[var90];
                        float var96 = (float) arg1.field5892[var91] - var93;
                        float var97 = (float) arg1.field5857[var91] - var94;
                        float var98 = (float) arg1.field5889[var91] - var95;
                        float var99 = (float) arg1.field5892[var92] - var93;
                        float var100 = (float) arg1.field5857[var92] - var94;
                        float var101 = (float) arg1.field5889[var92] - var95;
                        float var102 = (float) arg1.field5892[var87] - var93;
                        float var103 = (float) arg1.field5857[var87] - var94;
                        float var104 = (float) arg1.field5889[var87] - var95;
                        float var105 = (float) arg1.field5892[var88] - var93;
                        float var106 = (float) arg1.field5857[var88] - var94;
                        float var107 = (float) arg1.field5889[var88] - var95;
                        float var108 = (float) arg1.field5892[var89] - var93;
                        float var109 = (float) arg1.field5857[var89] - var94;
                        float var110 = (float) arg1.field5889[var89] - var95;
                        float var111 = var97 * var101 - var98 * var100;
                        float var112 = var98 * var99 - var96 * var101;
                        float var113 = var96 * var100 - (var97 * var99);
                        float var114 = var100 * var113 - var101 * var112;
                        float var115 = var101 * var111 - (var99 * var113);
                        float var116 = var99 * var112 - var100 * var111;
                        float var117 = 1.0F / (var98 * var116 + var96 * var114 + var97 * var115);
                        var53 = (var110 * var116 + var108 * var114 + var109 * var115) * var117;
                        var49 = (var104 * var116 + var102 * var114 + var103 * var115) * var117;
                        var51 = (var107 * var116 + var105 * var114 + var106 * var115) * var117;
                        float var118 = var98 * var111 - var96 * var113;
                        float var119 = var97 * var113 - (var98 * var112);
                        float var120 = var96 * var112 - var97 * var111;
                        float var121 = 1.0F / (var101 * var120 + var99 * var119 + var100 * var118);
                        var50 = (var104 * var120 + var102 * var119 + var103 * var118) * var121;
                        var54 = (var110 * var120 + var108 * var119 + var109 * var118) * var121;
                        var52 = (var107 * var120 + var105 * var119 + var106 * var118) * var121;
                    } else {
                        short var59 = arg1.field5865[var43];
                        short var60 = arg1.field5902[var43];
                        short var61 = arg1.field5890[var43];
                        int var62 = var24.field10593[var45];
                        int var63 = var24.field10592[var45];
                        int var64 = var24.field10589[var45];
                        float[] var65 = var24.field10590[var45];
                        byte var66 = arg1.field5885[var45];
                        float var67 = (float) arg1.field5863[var45] / 256.0F;
                        if (var58 == 1) {
                            float var85 = (float) arg1.field5899[var45] / 1024.0F;
                            class164.method1011(arg1.field5857[var59], var85, var67, var65, var62, var64, var63, arg1.field5889[var59], arg1.field5892[var59], var66, false, class33.field513);
                            var50 = class33.field513[1];
                            var49 = class33.field513[0];
                            class164.method1011(arg1.field5857[var60], var85, var67, var65, var62, var64, var63, arg1.field5889[var60], arg1.field5892[var60], var66, false, class33.field513);
                            var51 = class33.field513[0];
                            var52 = class33.field513[1];
                            class164.method1011(arg1.field5857[var61], var85, var67, var65, var62, var64, var63, arg1.field5889[var61], arg1.field5892[var61], var66, false, class33.field513);
                            var54 = class33.field513[1];
                            var53 = class33.field513[0];
                            float var86 = var85 / 2.0F;
                            if ((var66 & 0x1) == 0) {
                                if (var86 < var51 - var49) {
                                    var55 = 1;
                                    var51 -= var85;
                                } else if (var49 - var51 > var86) {
                                    var55 = 2;
                                    var51 += var85;
                                }
                                if ((var53 - var49 > var86)) {
                                    var53 -= var85;
                                    var56 = 1;
                                } else if (var86 < var49 - var53) {
                                    var56 = 2;
                                    var53 += var85;
                                }
                            } else {
                                if ((var86 < var52 - var50)) {
                                    var55 = 1;
                                    var52 -= var85;
                                } else if (var50 - var52 > var86) {
                                    var52 += var85;
                                    var55 = 2;
                                }
                                if (var54 - var50 > var86) {
                                    var56 = 1;
                                    var54 -= var85;
                                } else if (var86 < var50 - var54) {
                                    var56 = 2;
                                    var54 += var85;
                                }
                            }
                        } else if (var58 == 2) {
                            float var68 = (float) arg1.field5891[var45] / 256.0F;
                            float var69 = (float) arg1.field5882[var45] / 256.0F;
                            int var70 = arg1.field5892[var60] - arg1.field5892[var59];
                            int var71 = arg1.field5857[var60] - arg1.field5857[var59];
                            int var72 = arg1.field5889[var60] - arg1.field5889[var59];
                            int var73 = arg1.field5892[var61] - arg1.field5892[var59];
                            int var74 = arg1.field5857[var61] - arg1.field5857[var59];
                            int var75 = arg1.field5889[var61] - arg1.field5889[var59];
                            int var76 = var71 * var75 - (var72 * var74);
                            int var77 = var72 * var73 - (var70 * var75);
                            int var78 = var70 * var74 - (var71 * var73);
                            float var79 = 64.0F / (float) arg1.field5897[var45];
                            float var80 = 64.0F / (float) arg1.field5861[var45];
                            float var81 = 64.0F / (float) arg1.field5899[var45];
                            float var82 = (var65[2] * (float) var78 + var65[0] * (float) var76 + var65[1] * (float) var77) / var79;
                            float var83 = (var65[5] * (float) var78 + var65[4] * (float) var77 + var65[3] * (float) var76) / var80;
                            float var84 = (var65[8] * (float) var78 + var65[6] * (float) var76 + var65[7] * (float) var77) / var81;
                            var57 = class613.method3360(var82, 3, var84, var83);
                            class376.method2281(var66, var64, var67, var57, var69, class33.field513, arg1.field5857[var59], var62, var63, var65, (byte) 103, arg1.field5889[var59], arg1.field5892[var59], var68);
                            var50 = class33.field513[1];
                            var49 = class33.field513[0];
                            class376.method2281(var66, var64, var67, var57, var69, class33.field513, arg1.field5857[var60], var62, var63, var65, (byte) -17, arg1.field5889[var60], arg1.field5892[var60], var68);
                            var51 = class33.field513[0];
                            var52 = class33.field513[1];
                            class376.method2281(var66, var64, var67, var57, var69, class33.field513, arg1.field5857[var61], var62, var63, var65, (byte) -97, arg1.field5889[var61], arg1.field5892[var61], var68);
                            var53 = class33.field513[0];
                            var54 = class33.field513[1];
                        } else if (var58 == 3) {
                            class250.method1527(class33.field513, arg1.field5857[var59], var66, var65, (byte) 39, var67, var63, arg1.field5889[var59], var62, arg1.field5892[var59], var64);
                            var49 = class33.field513[0];
                            var50 = class33.field513[1];
                            class250.method1527(class33.field513, arg1.field5857[var60], var66, var65, (byte) 44, var67, var63, arg1.field5889[var60], var62, arg1.field5892[var60], var64);
                            var51 = class33.field513[0];
                            var52 = class33.field513[1];
                            class250.method1527(class33.field513, arg1.field5857[var61], var66, var65, (byte) -124, var67, var63, arg1.field5889[var61], var62, arg1.field5892[var61], var64);
                            var54 = class33.field513[1];
                            var53 = class33.field513[0];
                            if ((var66 & 0x1) == 0) {
                                if (var51 - var49 > 0.5F) {
                                    var55 = 1;
                                    var51--;
                                } else if (var49 - var51 > 0.5F) {
                                    var55 = 2;
                                    var51++;
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
                                    var54--;
                                    var56 = 1;
                                } else if (var50 - var54 > 0.5F) {
                                    var54++;
                                    var56 = 2;
                                }
                                if (var52 - var50 > 0.5F) {
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
            if (arg1.field5875 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field5875[var43];
            }
            if (var122 == 0) {
                long var126 = (long) (var45 << 2) + ((long) (var44 << 8) + (long) (var57 << 24) + (long) var46 << 32);
                short var128 = arg1.field5865[var43];
                short var129 = arg1.field5902[var43];
                short var130 = arg1.field5890[var43];
                class181 var131 = var13[var128];
                this.field5628[var27] = this.method2383(arg1, var131.field2374, var131.field2379, var50, var131.field2375, var126, var131.field2378, var49, (byte) -126, var128);
                class181 var132 = var13[var129];
                this.field5657[var27] = this.method2383(arg1, var132.field2374, var132.field2379, var52, var132.field2375, (long) var55 + var126, var132.field2378, var51, (byte) -117, var129);
                class181 var133 = var13[var130];
                this.field5644[var27] = this.method2383(arg1, var133.field2374, var133.field2379, var54, var133.field2375, (long) var56 + var126, var133.field2378, var53, (byte) -128, var130);
            } else if (var122 == 1) {
                class7 var123 = var25[var43];
                long var124 = (long) ((var123.field75 + 256 << 22) + ((var45 << 2) - (-(var123.field70 <= 0 ? 2048 : 1024) - (var123.field74 + 256 << 12)))) + ((long) (var44 << 8) + (long) (var57 << 24) + (long) var46 << 32);
                this.field5628[var27] = this.method2383(arg1, var123.field75, var123.field70, var50, var123.field74, var124, 0, var49, (byte) -113, arg1.field5865[var43]);
                this.field5657[var27] = this.method2383(arg1, var123.field75, var123.field70, var52, var123.field74, (long) var55 + var124, 0, var51, (byte) -125, arg1.field5902[var43]);
                this.field5644[var27] = this.method2383(arg1, var123.field75, var123.field70, var54, var123.field74, (long) var56 + var124, 0, var53, (byte) -115, arg1.field5890[var43]);
            }
            if (arg1.field5860 != null) {
                this.field5633[var27] = arg1.field5860[var43];
            }
            if (arg1.field5879 != null) {
                this.field5691[var27] = arg1.field5879[var43];
            }
            this.field5658[var27] = arg1.field5870[var43];
            this.field5578[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field5607; var30++) {
            short var42 = this.field5578[var30];
            if (var29 != var42) {
                var28++;
                var29 = var42;
            }
        }
        this.field5692 = new int[var28 + 1];
        short var31 = -10000;
        int var32 = 0;
        for (int var33 = 0; var33 < this.field5607; var33++) {
            short var41 = this.field5578[var33];
            if (var31 != var41) {
                this.field5692[var32++] = var33;
                var31 = var41;
            }
        }
        this.field5692[var32] = this.field5607;
        class98.field1224 = null;
        this.field5612 = class673.method3626(this.field5689, 2329, this.field5612);
        this.field5648 = class673.method3626(this.field5689, 2329, this.field5648);
        this.field5575 = class673.method3626(this.field5689, 2329, this.field5575);
        this.field5590 = class384.method2310(this.field5590, this.field5689, (byte) -106);
        this.field5671 = class533.method3033(this.field5671, 8, this.field5689);
        this.field5585 = class533.method3033(this.field5585, 8, this.field5689);
        if (arg1.field5884 != null && class704.method3902(32, arg2, this.field5593)) {
            this.field5627 = arg1.method2464(0, false);
        }
        if (arg1.field5855 != null && class239.method1492(arg2, this.field5593, (byte) -128)) {
            this.field5643 = arg1.method2465(-15);
        }
        if (arg1.field5886 != null && class595.method3295(arg2, true, this.field5593)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field5693; var36++) {
                int var40 = arg1.field5886[var8[var36]];
                if (var40 >= 0) {
                    int var10002 = var35[var40]++;
                    if (var34 < var40) {
                        var34 = var40;
                    }
                }
            }
            this.field5616 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field5616[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field5693; var38++) {
                int var39 = arg1.field5886[var8[var38]];
                if (var39 >= 0) {
                    this.field5616[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 1703)
    private final void method2387(int arg0) {
        field5603++;
        if (this.field5607 == 0) {
            return;
        }
        if (this.field5606 != 0) {
            this.method2384(true, 255);
        }
        this.method2384(false, 255);
        if (arg0 != 7760) {
            this.method1347();
        }
        if (this.field5651 != null) {
            if (this.field5651.field6971 == null) {
                this.method2395((this.field5606 & 0x10) != 0, true);
            }
            if (this.field5651.field6971 != null) {
                this.field5668.method2188(false, this.field5595 != null);
                this.field5668.method2181(this.field5595, this.field5665, this.field5639, this.field5653, 15063);
                int var2 = this.field5692.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5692[var3];
                    int var5 = this.field5692[var3 + 1];
                    int var6 = this.field5578[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field5668.method2160(var6, 0, this.field5595 != null);
                    this.field5668.method2183((var5 - var4) * 3, var4 * 3, -30308, 4, this.field5651.field6971);
                }
            }
        }
        this.method2394(true);
    }

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "(III)V", line = 1762)
    public final void method1377(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5676; var4++) {
            if (arg0 != 128) {
                this.field5572[var4] = this.field5572[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5620[var4] = this.field5620[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field5619[var4] = this.field5619[var4] * arg2 >> 7;
            }
        }
        field5655++;
        this.field5632 = false;
        if (this.field5665 != null) {
            this.field5665.field1118 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 1796)
    public final void method1358(int arg0) {
        field5666++;
        int var2 = class138.field1644[arg0];
        int var3 = class138.field1645[arg0];
        for (int var4 = 0; var4 < this.field5676; var4++) {
            int var5 = this.field5619[var4] * var2 + this.field5572[var4] * var3 >> 14;
            this.field5619[var4] = this.field5619[var4] * var3 - (this.field5572[var4] * var2) >> 14;
            this.field5572[var4] = var5;
        }
        if (this.field5665 != null) {
            this.field5665.field1118 = null;
        }
        this.field5632 = false;
    }

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "(I)V", line = 1830)
    public final void method1349(int arg0) {
        field5611++;
        int var2 = class138.field1644[arg0];
        int var3 = class138.field1645[arg0];
        for (int var4 = 0; var4 < this.field5676; var4++) {
            int var7 = this.field5619[var4] * var2 + this.field5572[var4] * var3 >> 14;
            this.field5619[var4] = this.field5619[var4] * var3 - this.field5572[var4] * var2 >> 14;
            this.field5572[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5689; var5++) {
            int var6 = this.field5612[var5] * var3 + this.field5575[var5] * var2 >> 14;
            this.field5575[var5] = (short) (this.field5575[var5] * var3 - (this.field5612[var5] * var2) >> 14);
            this.field5612[var5] = (short) var6;
        }
        if (this.field5595 == null && this.field5639 != null) {
            this.field5639.field1118 = null;
        }
        if (this.field5595 != null) {
            this.field5595.field1118 = null;
        }
        if (this.field5665 != null) {
            this.field5665.field1118 = null;
        }
        this.field5632 = false;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lwc;IZ)V", line = 1878)
    public final void method1325(class376 arg0, int arg1, boolean arg2) {
        field5681++;
        if (this.field5687 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field5676; var5++) {
            if ((arg1 & this.field5687[var5]) != 0) {
                if (arg2) {
                    arg0.method1974(this.field5572[var5], this.field5620[var5], this.field5619[var5], var4);
                } else {
                    arg0.method1971(this.field5572[var5], this.field5620[var5], this.field5619[var5], var4);
                }
                this.field5572[var5] = var4[0];
                this.field5620[var5] = var4[1];
                this.field5619[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lwc;Lfda;II)V", line = 1909)
    public final void method1375(class376 arg0, class678 arg1, int arg2, int arg3) {
        field5624++;
        if (this.field5689 == 0) {
            return;
        }
        class688 var5 = this.field5668.field4987;
        class688 var6 = (class688) arg0;
        if (!this.field5632) {
            this.method2388(true);
        }
        class204.field2595 = var5.field9756 * var6.field9764 + var5.field9776 * var6.field9755 + var5.field9764 * var6.field9771;
        class489.field6955 = var5.field9756 * var6.field9774 + var5.field9776 * var6.field9782 + var5.field9764 * var6.field9775 + var5.field9774;
        float var7 = (float) this.field5618 * class204.field2595 + class489.field6955;
        float var8 = (float) this.field5682 * class204.field2595 + class489.field6955;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var10 = (float) (-this.field5599) + var8;
            var9 = (float) this.field5599 + var7;
        } else {
            var9 = (float) this.field5599 + var8;
            var10 = var7 - (float) this.field5599;
        }
        if ((var10 >= this.field5668.field5002) || (var9 <= (float) this.field5668.field5060)) {
            return;
        }
        class151.field1834 = var5.field9773 * var6.field9774 + var5.field9763 * var6.field9782 + var5.field9755 * var6.field9775 + var5.field9782;
        class612.field8454 = var5.field9773 * var6.field9764 + var5.field9763 * var6.field9755 + var5.field9755 * var6.field9771;
        float var11 = (float) this.field5618 * class612.field8454 + class151.field1834;
        float var12 = (float) this.field5682 * class612.field8454 + class151.field1834;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = (var12 - (float) this.field5599) * (float) this.field5668.field5055;
            var14 = ((float) this.field5599 + var11) * (float) this.field5668.field5055;
        } else {
            var13 = (var11 - (float) this.field5599) * (float) this.field5668.field5055;
            var14 = ((float) this.field5599 + var12) * (float) this.field5668.field5055;
        }
        if ((this.field5668.field5089 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field5668.field5074)) {
            return;
        }
        class422.field6001 = var5.field9758 * var6.field9774 + var5.field9771 * var6.field9775 + var5.field9753 * var6.field9782 + var5.field9775;
        class576.field8040 = var5.field9758 * var6.field9764 + var5.field9771 * var6.field9771 + var5.field9753 * var6.field9755;
        float var15 = (float) this.field5618 * class576.field8040 + class422.field6001;
        float var16 = (float) this.field5682 * class576.field8040 + class422.field6001;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) this.field5599 + var15) * (float) this.field5668.field5001;
            var18 = (var16 - (float) this.field5599) * (float) this.field5668.field5001;
        } else {
            var17 = ((float) this.field5599 + var16) * (float) this.field5668.field5001;
            var18 = (var15 - (float) this.field5599) * (float) this.field5668.field5001;
        }
        if ((this.field5668.field5032 <= var18 / (float) arg2) || (this.field5668.field4995 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field5642 != null) {
            class700.field9874 = var5.field9758 * var6.field9756 + var5.field9771 * var6.field9758 + var5.field9753 * var6.field9773;
            class760.field10596 = var5.field9756 * var6.field9776 + var5.field9776 * var6.field9763 + var5.field9764 * var6.field9753;
            class716.field10100 = var5.field9773 * var6.field9776 + var5.field9763 * var6.field9763 + var5.field9755 * var6.field9753;
            class423.field6008 = var5.field9758 * var6.field9776 + var5.field9771 * var6.field9753 + var5.field9753 * var6.field9763;
            class465.field6718 = var5.field9756 * var6.field9756 + var5.field9776 * var6.field9773 + var5.field9764 * var6.field9758;
            class14.field201 = var5.field9773 * var6.field9756 + var5.field9763 * var6.field9773 + var5.field9755 * var6.field9758;
        }
        if (arg1 != null) {
            int var19 = this.field5654 + this.field5640 >> 1;
            int var20 = this.field5576 + this.field5613 >> 1;
            int var21 = (int) ((float) var20 * class14.field201 + (float) this.field5618 * class612.field8454 + (float) var19 * class716.field10100 + class151.field1834);
            int var22 = (int) ((float) var20 * class700.field9874 + (float) this.field5618 * class576.field8040 + (float) var19 * class423.field6008 + class422.field6001);
            int var23 = (int) ((float) var20 * class465.field6718 + (float) this.field5618 * class204.field2595 + (float) var19 * class760.field10596 + class489.field6955);
            int var24 = (int) ((float) var20 * class14.field201 + (float) this.field5682 * class612.field8454 + (float) var19 * class716.field10100 + class151.field1834);
            int var25 = (int) ((float) var20 * class700.field9874 + (float) this.field5682 * class576.field8040 + (float) var19 * class423.field6008 + class422.field6001);
            arg1.field9207 = this.field5668.field5055 * var21 / arg2 + this.field5668.field5067;
            arg1.field9205 = this.field5668.field5055 * var24 / arg2 + this.field5668.field5067;
            arg1.field9204 = this.field5668.field5001 * var25 / arg2 + this.field5668.field5016;
            arg1.field9203 = this.field5668.field5001 * var22 / arg2 + this.field5668.field5016;
            int var26 = (int) ((float) var20 * class465.field6718 + (float) this.field5682 * class204.field2595 + (float) var19 * class760.field10596 + class489.field6955);
            if (var23 >= this.field5668.field5060 || var26 >= this.field5668.field5060) {
                arg1.field9206 = this.field5668.field5067 - (arg1.field9207 - ((this.field5599 + var21) * this.field5668.field5055 / arg2));
                arg1.field9208 = true;
            }
        }
        this.field5668.method2147((byte) 112, (float) arg2);
        this.field5668.method2164(true);
        this.field5668.method2171(var6, -639156592);
        this.method2387(7760);
        this.field5668.method2157(-16937);
        this.method2393(1651526439);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V", line = 2060)
    private final void method2388(boolean arg0) {
        field5635++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5676; var10++) {
            int var11 = this.field5572[var10];
            int var12 = this.field5620[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field5619[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
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
            int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field5654 = (short) var2;
        this.field5613 = (short) var7;
        this.field5576 = (short) var4;
        this.field5618 = (short) var3;
        this.field5640 = (short) var5;
        this.field5682 = (short) var6;
        this.field5599 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field5584 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field5632 = arg0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIII)V", line = 2137)
    public final void method1369(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field5693; var5++) {
            int var9 = this.field5658[var5] & 0xFFFF;
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
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field5658[var5] = (short) class216.method1308(var12, class216.method1308(var10 << 10, var11 << 7));
        }
        field5588++;
        if (this.field5642 != null) {
            for (int var6 = 0; var6 < this.field5679; var6++) {
                class567 var7 = this.field5642[var6];
                class30 var8 = this.field5647[var6];
                var8.field486 = var8.field486 & 0xFF000000 | class198.field2542[this.field5658[var7.field7918] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5639 != null) {
            this.field5639.field1118 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "()Z", line = 2197)
    public final boolean method1342() {
        field5663++;
        return this.field5610;
    }

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "(IILs;Ls;III)V", line = 2208)
    public final void method1320(int arg0, int arg1, class402 arg2, class402 arg3, int arg4, int arg5, int arg6) {
        if (!this.field5632) {
            this.method2388(true);
        }
        field5623++;
        int var8 = this.field5654 + arg4;
        int var9 = this.field5640 + arg4;
        int var10 = this.field5576 + arg6;
        int var11 = this.field5613 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || var9 + arg2.field5561 >> arg2.field5570 >= arg2.field5569 || var10 < 0 || arg2.field5562 <= (arg2.field5561 + var11 >> arg2.field5570)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field5569 <= var9 + arg3.field5561 >> arg3.field5570 || var10 < 0 || arg3.field5562 <= (arg3.field5561 + var11 >> arg3.field5570)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field5570;
            int var13 = var9 - (1 - arg2.field5561) >> arg2.field5570;
            int var14 = var10 >> arg2.field5570;
            int var15 = var11 + arg2.field5561 - 1 >> arg2.field5570;
            if (arg5 == arg2.method2381(-112, var12, var14) && arg5 == arg2.method2381(-123, var13, var14) && arg5 == arg2.method2381(-111, var12, var15) && arg2.method2381(-89, var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field5676; var16++) {
                this.field5620[var16] = this.field5620[var16] + arg2.method2382((byte) 19, this.field5619[var16] + arg6, this.field5572[var16] + arg4) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field5618;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field5676; var18++) {
                int var19 = (this.field5620[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field5620[var18] -= -((arg1 - var19) * (arg2.method2382((byte) 19, this.field5619[var18] + arg6, this.field5572[var18] + arg4) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = (arg1 >> 8 & 0xFF) * 4;
            int var22 = arg1 >> 16 & 0xFF << 6;
            int var23 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var20 >> 1) < 0 || (arg2.field5569 << arg2.field5570) <= ((var20 >> 1) + arg2.field5561 + arg4) || arg6 - (var21 >> 1) < 0 || arg2.field5562 << arg2.field5570 <= (var21 >> 1) + arg6 + arg2.field5561) {
                return;
            }
            this.method1331(arg2, arg4, arg5, var23, var22, arg6, var20, 92, var21);
        } else if (arg0 == 4) {
            int var31 = this.field5682 - this.field5618;
            for (int var32 = 0; var32 < this.field5676; var32++) {
                this.field5620[var32] -= arg5 - arg3.method2382((byte) 19, this.field5619[var32] + arg6, this.field5572[var32] + arg4) - var31;
            }
        } else if (arg0 == 5) {
            int var24 = this.field5682 - this.field5618;
            for (int var25 = 0; var25 < this.field5676; var25++) {
                int var26 = this.field5572[var25] + arg4;
                int var27 = this.field5619[var25] + arg6;
                int var28 = arg2.method2382((byte) 19, var27, var26);
                int var29 = arg3.method2382((byte) 19, var27, var26);
                int var30 = var28 - var29 - arg1;
                this.field5620[var25] = var28 - (arg5 - ((this.field5620[var25] << 8) / var24 * var30 >> 8));
            }
        }
        if (this.field5665 != null) {
            this.field5665.field1118 = null;
        }
        this.field5632 = false;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I[IIIIIZ)V", line = 2365)
    public final void method1324(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5652++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class437.field6135 = 0;
            class552.field7761 = 0;
            int var12 = 0;
            class745.field10394 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field5627.length) {
                    int[] var15 = this.field5627[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class745.field10394 += this.field5572[var17];
                        class552.field7761 += this.field5620[var17];
                        class437.field6135 += this.field5619[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class745.field10394 = class745.field10394 / var12 + var9;
                class552.field7761 = class552.field7761 / var12 + var11;
                class437.field6135 = class437.field6135 / var12 + var10;
            } else {
                class745.field10394 = var9;
                class552.field7761 = var11;
                class437.field6135 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg2 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field5627.length) {
                    int[] var23 = this.field5627[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5572[var25] += var19;
                        this.field5620[var25] += var18;
                        this.field5619[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field5627.length > var45) {
                    int[] var46 = this.field5627[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5572[var59] -= class745.field10394;
                            this.field5620[var59] -= class552.field7761;
                            this.field5619[var59] -= class437.field6135;
                            if (arg4 != 0) {
                                int var60 = class138.field1644[arg4];
                                int var61 = class138.field1645[arg4];
                                int var62 = this.field5572[var59] * var61 + this.field5620[var59] * var60 + 16383 >> 14;
                                this.field5620[var59] = this.field5620[var59] * var61 + 16383 - (this.field5572[var59] * var60) >> 14;
                                this.field5572[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class138.field1644[arg2];
                                int var64 = class138.field1645[arg2];
                                int var65 = this.field5620[var59] * var64 + 16383 - (this.field5619[var59] * var63) >> 14;
                                this.field5619[var59] = this.field5620[var59] * var63 + this.field5619[var59] * var64 + 16383 >> 14;
                                this.field5620[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class138.field1644[arg3];
                                int var67 = class138.field1645[arg3];
                                int var68 = this.field5619[var59] * var66 + this.field5572[var59] * var67 + 16383 >> 14;
                                this.field5619[var59] = this.field5619[var59] * var67 + 16383 - (this.field5572[var59] * var66) >> 14;
                                this.field5572[var59] = var68;
                            }
                            this.field5572[var59] += class745.field10394;
                            this.field5620[var59] += class552.field7761;
                            this.field5619[var59] += class437.field6135;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5572[var48] -= class745.field10394;
                            this.field5620[var48] -= class552.field7761;
                            this.field5619[var48] -= class437.field6135;
                            if (arg2 != 0) {
                                int var49 = class138.field1644[arg2];
                                int var50 = class138.field1645[arg2];
                                int var51 = this.field5620[var48] * var50 + 16383 - (this.field5619[var48] * var49) >> 14;
                                this.field5619[var48] = this.field5619[var48] * var50 + this.field5620[var48] * var49 + 16383 >> 14;
                                this.field5620[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class138.field1644[arg4];
                                int var53 = class138.field1645[arg4];
                                int var54 = this.field5620[var48] * var52 + (this.field5572[var48] * var53) + 16383 >> 14;
                                this.field5620[var48] = this.field5620[var48] * var53 + 16383 - (this.field5572[var48] * var52) >> 14;
                                this.field5572[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class138.field1644[arg3];
                                int var56 = class138.field1645[arg3];
                                int var57 = this.field5619[var48] * var55 + (this.field5572[var48] * var56) + 16383 >> 14;
                                this.field5619[var48] = this.field5619[var48] * var56 + 16383 - (this.field5572[var48] * var55) >> 14;
                                this.field5572[var48] = var57;
                            }
                            this.field5572[var48] += class745.field10394;
                            this.field5620[var48] += class552.field7761;
                            this.field5619[var48] += class437.field6135;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field5627.length) {
                        int[] var29 = this.field5627[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5617[var31];
                            int var33 = this.field5617[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5637[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class138.field1644[arg4];
                                    int var37 = class138.field1645[arg4];
                                    int var38 = this.field5648[var35] * var36 + this.field5612[var35] * var37 + 16383 >> 14;
                                    this.field5648[var35] = (short) (this.field5648[var35] * var37 + 16383 - (this.field5612[var35] * var36) >> 14);
                                    this.field5612[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class138.field1644[arg2];
                                    int var40 = class138.field1645[arg2];
                                    int var41 = this.field5648[var35] * var40 + 16383 - (this.field5575[var35] * var39) >> 14;
                                    this.field5575[var35] = (short) (this.field5648[var35] * var39 + (this.field5575[var35] * var40 + 16383) >> 14);
                                    this.field5648[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class138.field1644[arg3];
                                    int var43 = class138.field1645[arg3];
                                    int var44 = this.field5612[var35] * var43 + (this.field5575[var35] * var42 + 16383) >> 14;
                                    this.field5575[var35] = (short) (this.field5575[var35] * var43 + 16383 - (this.field5612[var35] * var42) >> 14);
                                    this.field5612[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field5595 == null && this.field5639 != null) {
                    this.field5639.field1118 = null;
                }
                if (this.field5595 != null) {
                    this.field5595.field1118 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field5627.length > var70) {
                    int[] var71 = this.field5627[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5572[var73] -= class745.field10394;
                        this.field5620[var73] -= class552.field7761;
                        this.field5619[var73] -= class437.field6135;
                        this.field5572[var73] = this.field5572[var73] * arg2 >> 7;
                        this.field5620[var73] = this.field5620[var73] * arg3 >> 7;
                        this.field5619[var73] = this.field5619[var73] * arg4 >> 7;
                        this.field5572[var73] += class745.field10394;
                        this.field5620[var73] += class552.field7761;
                        this.field5619[var73] += class437.field6135;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5616 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field5616.length > var78) {
                        int[] var79 = this.field5616[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field5633[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field5633[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field5639 != null) {
                            this.field5639.field1118 = null;
                        }
                    }
                }
                if (this.field5642 != null) {
                    for (int var75 = 0; var75 < this.field5679; var75++) {
                        class567 var76 = this.field5642[var75];
                        class30 var77 = this.field5647[var75];
                        var77.field486 = var77.field486 & 0xFFFFFF | 255 - (this.field5633[var76.field7918] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5616 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field5616.length > var87) {
                        int[] var88 = this.field5616[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field5658[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3E6) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = var92 + arg2 & 0x3F;
                            int var96 = var91 & 0x7F;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            int var97 = arg4 + var96;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field5658[var90] = (short) class216.method1308(var97, class216.method1308(var94 << 7, var95 << 10));
                        }
                        if (var88.length > 0 && this.field5639 != null) {
                            this.field5639.field1118 = null;
                        }
                    }
                }
                if (this.field5642 != null) {
                    for (int var84 = 0; var84 < this.field5679; var84++) {
                        class567 var85 = this.field5642[var84];
                        class30 var86 = this.field5647[var84];
                        var86.field486 = var86.field486 & 0xFF000000 | class198.field2542[this.field5658[var85.field7918] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5643 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field5643.length > var99) {
                        int[] var100 = this.field5643[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class30 var102 = this.field5647[var100[var101]];
                            var102.field483 += arg2;
                            var102.field484 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5643 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field5643.length > var104) {
                        int[] var105 = this.field5643[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class30 var107 = this.field5647[var105[var106]];
                            var107.field489 = var107.field489 * arg3 >> 7;
                            var107.field478 = var107.field478 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5643 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field5643.length > var109) {
                    int[] var110 = this.field5643[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class30 var112 = this.field5647[var110[var111]];
                        var112.field481 = var112.field481 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "ba", descriptor = "(Lr;)Lr;", line = 3022)
    public final class108 method1334(class108 arg0) {
        field5587++;
        if (this.field5689 == 0) {
            return null;
        }
        if (!this.field5632) {
            this.method2388(true);
        }
        int var2;
        int var3;
        if (this.field5668.field5035 > 0) {
            var2 = this.field5654 - (this.field5668.field5035 * this.field5682 >> 8) >> this.field5668.field4956;
            var3 = this.field5640 - (this.field5668.field5035 * this.field5618 >> 8) >> this.field5668.field4956;
        } else {
            var2 = this.field5654 - (this.field5668.field5035 * this.field5618 >> 8) >> this.field5668.field4956;
            var3 = this.field5640 - (this.field5668.field5035 * this.field5682 >> 8) >> this.field5668.field4956;
        }
        int var4;
        int var5;
        if (this.field5668.field5023 > 0) {
            var4 = this.field5576 - (this.field5668.field5023 * this.field5682 >> 8) >> this.field5668.field4956;
            var5 = this.field5613 - (this.field5668.field5023 * this.field5618 >> 8) >> this.field5668.field4956;
        } else {
            var4 = this.field5576 - (this.field5668.field5023 * this.field5618 >> 8) >> this.field5668.field4956;
            var5 = this.field5613 - (this.field5668.field5023 * this.field5682 >> 8) >> this.field5668.field4956;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class8 var8 = (class8) arg0;
        class8 var9;
        if (var8 != null && var8.method34(var6, (byte) 1, var7)) {
            var9 = var8;
            var8.method38((byte) 52);
        } else {
            var9 = new class8(this.field5668, var6, var7);
        }
        var9.method35(0, var5, var4, var2, var3);
        this.method2389(16383, var9);
        return var9;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILkw;)V", line = 3086)
    private final void method2389(int arg0, class8 arg1) {
        if (this.field5668.field5107.length < this.field5689) {
            this.field5668.field5107 = new int[this.field5689];
            this.field5668.field5105 = new int[this.field5689];
        }
        field5604++;
        if (arg0 != 16383) {
            return;
        }
        int[] var3 = this.field5668.field5107;
        int[] var4 = this.field5668.field5105;
        for (int var5 = 0; var5 < this.field5676; var5++) {
            int var16 = (this.field5572[var5] - (this.field5620[var5] * this.field5668.field5035 >> 8) >> this.field5668.field4956) - arg1.field78;
            int var17 = (this.field5619[var5] - (this.field5620[var5] * this.field5668.field5023 >> 8) >> this.field5668.field4956) - arg1.field79;
            int var18 = this.field5617[var5];
            int var19 = this.field5617[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field5637[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field5607; var6++) {
            if (this.field5633 == null || this.field5633[var6] <= 128) {
                short var7 = this.field5628[var6];
                short var8 = this.field5657[var6];
                short var9 = this.field5644[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - ((var14 - var13) * (var12 - var11))) > 0) {
                    arg1.method37(var14, var13, var11, var10, -54, var12, var15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "()V", line = 3173)
    public final void method1367() {
        field5650++;
    }

    @OriginalMember(owner = "client!hn", name = "ua", descriptor = "()I", line = 3183)
    public final int method1340() {
        field5605++;
        return this.field5678;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBIIIIII)Z", line = 3191)
    private final boolean method2390(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5645++;
        if (arg0 > arg6 && arg5 > arg6 && arg7 > arg6) {
            return false;
        } else if (arg0 < arg6 && arg5 < arg6 && arg6 > arg7) {
            return false;
        } else if (arg1 < arg8 && arg3 > arg1 && arg4 > arg1) {
            return false;
        } else if (arg1 > arg8 && arg1 > arg3 && arg4 < arg1) {
            return false;
        } else {
            if (arg2 < 47) {
                this.method1355();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "()V", line = 3218)
    public final void method1376() {
        field5600++;
        if (this.field5689 <= 0 || this.field5607 <= 0) {
            return;
        }
        this.method2384(false, 255);
        if ((this.field5606 & 0x10) == 0 && this.field5651.field6971 == null) {
            this.method2395(false, true);
        }
        this.method2394(true);
    }

    @OriginalMember(owner = "client!hn", name = "da", descriptor = "()I", line = 3234)
    public final int method1341() {
        field5673++;
        return this.field5664;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 3243)
    public static void method2391(int arg0) {
        field5622 = null;
        if (arg0 == 6988) {
            field5589 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "(I[IIIIZI[I)V", line = 3259)
    public final void method1356(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5579++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class745.field10394 = 0;
            class552.field7761 = 0;
            int var13 = 0;
            class437.field6135 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5627.length) {
                    int[] var16 = this.field5627[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5687 == null || (this.field5687[var18] & arg6) != 0) {
                            class745.field10394 += this.field5572[var18];
                            class552.field7761 += this.field5620[var18];
                            var13++;
                            class437.field6135 += this.field5619[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class437.field6135 = var12;
                class552.field7761 = var11;
                class745.field10394 = var10;
            } else {
                class745.field10394 = class745.field10394 / var13 + var10;
                class437.field6135 = class437.field6135 / var13 + var12;
                class528.field7447 = true;
                class552.field7761 = class552.field7761 / var13 + var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + (arg7[6] * arg2 + (arg7[7] * arg3)) + 8192 >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg4 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field5627.length > var26) {
                    int[] var27 = this.field5627[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5687 == null || (this.field5687[var29] & arg6) != 0) {
                            this.field5572[var29] += var24;
                            this.field5620[var29] += var22;
                            this.field5619[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field5627.length) {
                        int[] var110 = this.field5627[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field5687 == null || (arg6 & this.field5687[var112]) != 0) {
                                this.field5572[var112] -= class745.field10394;
                                this.field5620[var112] -= class552.field7761;
                                this.field5619[var112] -= class437.field6135;
                                if (arg4 != 0) {
                                    int var113 = class138.field1644[arg4];
                                    int var114 = class138.field1645[arg4];
                                    int var115 = this.field5620[var112] * var113 + this.field5572[var112] * var114 + 16383 >> 14;
                                    this.field5620[var112] = this.field5620[var112] * var114 - (this.field5572[var112] * var113 - 16383) >> 14;
                                    this.field5572[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class138.field1644[arg2];
                                    int var117 = class138.field1645[arg2];
                                    int var118 = this.field5620[var112] * var117 + 16383 - (this.field5619[var112] * var116) >> 14;
                                    this.field5619[var112] = this.field5620[var112] * var116 + this.field5619[var112] * var117 + 16383 >> 14;
                                    this.field5620[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class138.field1644[arg3];
                                    int var120 = class138.field1645[arg3];
                                    int var121 = this.field5619[var112] * var119 + this.field5572[var112] * var120 + 16383 >> 14;
                                    this.field5619[var112] = this.field5619[var112] * var120 + 16383 - (this.field5572[var112] * var119) >> 14;
                                    this.field5572[var112] = var121;
                                }
                                this.field5572[var112] += class745.field10394;
                                this.field5620[var112] += class552.field7761;
                                this.field5619[var112] += class437.field6135;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field5627.length) {
                            int[] var93 = this.field5627[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field5687 == null || (this.field5687[var95] & arg6) != 0) {
                                    int var96 = this.field5617[var95];
                                    int var97 = this.field5617[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field5637[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class138.field1644[arg4];
                                            int var101 = class138.field1645[arg4];
                                            int var102 = this.field5648[var99] * var100 + this.field5612[var99] * var101 + 16383 >> 14;
                                            this.field5648[var99] = (short) (this.field5648[var99] * var101 + 16383 - (this.field5612[var99] * var100) >> 14);
                                            this.field5612[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class138.field1644[arg2];
                                            int var104 = class138.field1645[arg2];
                                            int var105 = this.field5648[var99] * var104 + 16383 - (this.field5575[var99] * var103) >> 14;
                                            this.field5575[var99] = (short) (this.field5648[var99] * var103 + this.field5575[var99] * var104 + 16383 >> 14);
                                            this.field5648[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class138.field1644[arg3];
                                            int var107 = class138.field1645[arg3];
                                            int var108 = this.field5575[var99] * var106 - (-(this.field5612[var99] * var107) - 16383) >> 14;
                                            this.field5575[var99] = (short) (this.field5575[var99] * var107 + 16383 - (this.field5612[var99] * var106) >> 14);
                                            this.field5612[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5595 == null && this.field5639 != null) {
                        this.field5639.field1118 = null;
                    }
                    if (this.field5595 != null) {
                        this.field5595.field1118 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class528.field7447) {
                    int var36 = arg7[3] * class552.field7761 + arg7[0] * class745.field10394 + (arg7[6] * class437.field6135 - -8192) >> 14;
                    int var37 = arg7[1] * class745.field10394 + arg7[4] * class552.field7761 + arg7[7] * class437.field6135 + 8192 >> 14;
                    int var38 = arg7[8] * class437.field6135 + arg7[2] * class745.field10394 + arg7[5] * class552.field7761 + 8192 >> 14;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    class552.field7761 = var40;
                    class745.field10394 = var39;
                    class437.field6135 = var41;
                    class528.field7447 = false;
                }
                int[] var42 = new int[9];
                int var43 = class138.field1645[arg2];
                int var44 = class138.field1644[arg2];
                int var45 = class138.field1645[arg3];
                int var46 = class138.field1644[arg3];
                int var47 = class138.field1645[arg4];
                int var48 = class138.field1644[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[7] = var46 * var48 - (-(var45 * var49) - 8192) >> 14;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[5] = -var44;
                int var51 = var42[0] * -class745.field10394 + var42[1] * -class552.field7761 - (-(var42[2] * -class437.field6135) - 8192) >> 14;
                int var52 = var42[3] * -class745.field10394 + var42[5] * -class437.field6135 + var42[4] * -class552.field7761 + 8192 >> 14;
                int var53 = var42[8] * -class437.field6135 + var42[6] * -class745.field10394 + (var42[7] * -class552.field7761 - -8192) >> 14;
                int var54 = class745.field10394 + var51;
                int var55 = class552.field7761 + var52;
                int var56 = class437.field6135 + var53;
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
                int var60 = var42[5] * var35 + (var42[3] * var33 + (var42[4] * var34)) + 8192 >> 14;
                int var61 = var42[8] * var35 + var42[6] * var33 + (var42[7] * var34) + 8192 >> 14;
                int var62 = var55 + var60;
                int var63 = var54 + var59;
                int var64 = var56 + var61;
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
                int var67 = arg7[2] * var64 + arg7[0] * var63 - (-(arg7[1] * var62) - 8192) >> 14;
                int var68 = arg7[4] * var62 + arg7[3] * var63 + (arg7[5] * var64 - -8192) >> 14;
                int var69 = var30 + var67;
                int var70 = var31 + var68;
                int var71 = arg7[8] * var64 + arg7[6] * var63 - (-(arg7[7] * var62) - 8192) >> 14;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field5627.length > var74) {
                        int[] var75 = this.field5627[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field5687 == null || (this.field5687[var77] & arg6) != 0) {
                                int var78 = this.field5619[var77] * var65[2] + this.field5572[var77] * var65[0] + (this.field5620[var77] * var65[1] - -8192) >> 14;
                                int var79 = this.field5572[var77] * var65[3] + this.field5620[var77] * var65[4] + this.field5619[var77] * var65[5] + 8192 >> 14;
                                int var80 = var69 + var78;
                                int var81 = this.field5572[var77] * var65[6] + this.field5620[var77] * var65[7] + this.field5619[var77] * var65[8] + 8192 >> 14;
                                int var82 = var70 + var79;
                                int var83 = var72 + var81;
                                this.field5572[var77] = var80;
                                this.field5620[var77] = var82;
                                this.field5619[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field5627.length) {
                        int[] var174 = this.field5627[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5687 == null || (this.field5687[var176] & arg6) != 0) {
                                this.field5572[var176] -= class745.field10394;
                                this.field5620[var176] -= class552.field7761;
                                this.field5619[var176] -= class437.field6135;
                                this.field5572[var176] = this.field5572[var176] * arg2 >> 7;
                                this.field5620[var176] = this.field5620[var176] * arg3 >> 7;
                                this.field5619[var176] = this.field5619[var176] * arg4 >> 7;
                                this.field5572[var176] += class745.field10394;
                                this.field5620[var176] += class552.field7761;
                                this.field5619[var176] += class437.field6135;
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
                if (class528.field7447) {
                    int var128 = arg7[6] * class437.field6135 + arg7[0] * class745.field10394 + arg7[3] * class552.field7761 + 8192 >> 14;
                    int var129 = arg7[7] * class437.field6135 + (arg7[1] * class745.field10394 - (-(arg7[4] * class552.field7761) - 8192)) >> 14;
                    int var130 = var125 + var128;
                    int var131 = var126 + var129;
                    int var132 = arg7[2] * class745.field10394 + (arg7[5] * class552.field7761) + (arg7[8] * class437.field6135 - -8192) >> 14;
                    int var133 = var127 + var132;
                    class745.field10394 = var130;
                    class552.field7761 = var131;
                    class437.field6135 = var133;
                    class528.field7447 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class745.field10394 * var134 + 8192 >> 14;
                int var138 = -class552.field7761 * var135 + 8192 >> 14;
                int var139 = -class437.field6135 * var136 + 8192 >> 14;
                int var140 = var137 + class745.field10394;
                int var141 = var138 + class552.field7761;
                int var142 = class437.field6135 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var140 + var144;
                int var147 = var141 + var145;
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
                int var152 = arg7[1] * var147 + (arg7[0] * var146 - (-(arg7[2] * var149) - 8192)) >> 14;
                int var153 = arg7[3] * var146 + 8192 - (-(arg7[4] * var147) - arg7[5] * var149) >> 14;
                int var154 = arg7[7] * var147 + (arg7[6] * var146 + (arg7[8] * var149)) + 8192 >> 14;
                int var155 = var122 + var152;
                int var156 = var123 + var153;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field5627.length) {
                        int[] var160 = this.field5627[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field5687 == null || (arg6 & this.field5687[var162]) != 0) {
                                int var163 = this.field5572[var162] * var150[0] + this.field5620[var162] * var150[1] + this.field5619[var162] * var150[2] + 8192 >> 14;
                                int var164 = this.field5620[var162] * var150[4] + this.field5572[var162] * var150[3] + (this.field5619[var162] * var150[5]) + 8192 >> 14;
                                int var165 = this.field5572[var162] * var150[6] + this.field5620[var162] * var150[7] + this.field5619[var162] * var150[8] + 8192 >> 14;
                                int var166 = var155 + var163;
                                int var167 = var156 + var164;
                                int var168 = var157 + var165;
                                this.field5572[var162] = var166;
                                this.field5620[var162] = var167;
                                this.field5619[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5616 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field5616.length) {
                        int[] var182 = this.field5616[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field5691 == null || (this.field5691[var184] & arg6) != 0) {
                                int var185 = (this.field5633[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field5633[var184] = (byte) var185;
                                if (this.field5639 != null) {
                                    this.field5639.field1118 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5642 != null) {
                    for (int var178 = 0; var178 < this.field5679; var178++) {
                        class567 var179 = this.field5642[var178];
                        class30 var180 = this.field5647[var178];
                        var180.field486 = 255 - (this.field5633[var179.field7918] & 0xFF) << 24 | var180.field486 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5616 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field5616.length) {
                        int[] var191 = this.field5616[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field5691 == null || (arg6 & this.field5691[var193]) != 0) {
                                int var194 = this.field5658[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x381) >> 7;
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
                                this.field5658[var193] = (short) class216.method1308(var200, class216.method1308(var199 << 7, var197 << 10));
                                if (this.field5639 != null) {
                                    this.field5639.field1118 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5642 != null) {
                    for (int var187 = 0; var187 < this.field5679; var187++) {
                        class567 var188 = this.field5642[var187];
                        class30 var189 = this.field5647[var187];
                        var189.field486 = var189.field486 & 0xFF000000 | class198.field2542[this.field5658[var188.field7918] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5643 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field5643.length > var202) {
                        int[] var203 = this.field5643[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class30 var205 = this.field5647[var203[var204]];
                            var205.field483 += arg2;
                            var205.field484 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5643 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field5643.length > var207) {
                        int[] var208 = this.field5643[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class30 var210 = this.field5647[var208[var209]];
                            var210.field478 = var210.field478 * arg2 >> 7;
                            var210.field489 = var210.field489 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5643 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field5643.length) {
                    int[] var213 = this.field5643[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class30 var215 = this.field5647[var213[var214]];
                        var215.field481 = var215.field481 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "()Z", line = 4246)
    public final boolean method1338() {
        field5608++;
        return this.field5581;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lwc;Lfda;I)V", line = 4265)
    public final void method1351(class376 arg0, class678 arg1, int arg2) {
        field5674++;
        if (this.field5689 == 0) {
            return;
        }
        class688 var4 = this.field5668.field4987;
        class688 var5 = (class688) arg0;
        if (!this.field5632) {
            this.method2388(true);
        }
        class489.field6955 = var4.field9756 * var5.field9774 + var4.field9776 * var5.field9782 + var4.field9764 * var5.field9775 + var4.field9774;
        class204.field2595 = var4.field9756 * var5.field9764 + var4.field9776 * var5.field9755 + var4.field9764 * var5.field9771;
        float var6 = (float) this.field5618 * class204.field2595 + class489.field6955;
        float var7 = (float) this.field5682 * class204.field2595 + class489.field6955;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) this.field5599 + var6;
            var9 = var7 - (float) this.field5599;
        } else {
            var8 = (float) this.field5599 + var7;
            var9 = (float) (-this.field5599) + var6;
        }
        if ((this.field5668.field5080 <= var9) || (var8 <= (float) this.field5668.field5060)) {
            return;
        }
        class151.field1834 = var4.field9773 * var5.field9774 + var4.field9763 * var5.field9782 + var4.field9755 * var5.field9775 + var4.field9782;
        class612.field8454 = var4.field9773 * var5.field9764 + var4.field9763 * var5.field9755 + var4.field9755 * var5.field9771;
        float var10 = (float) this.field5618 * class612.field8454 + class151.field1834;
        float var11 = (float) this.field5682 * class612.field8454 + class151.field1834;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) (-this.field5599) + var11) * (float) this.field5668.field5055;
            var13 = ((float) this.field5599 + var10) * (float) this.field5668.field5055;
        } else {
            var12 = ((float) (-this.field5599) + var10) * (float) this.field5668.field5055;
            var13 = ((float) this.field5599 + var11) * (float) this.field5668.field5055;
        }
        if ((this.field5668.field5089 <= var12 / var8) || (var13 / var8 <= this.field5668.field5074)) {
            return;
        }
        class422.field6001 = var4.field9758 * var5.field9774 + var4.field9771 * var5.field9775 + var4.field9753 * var5.field9782 + var4.field9775;
        class576.field8040 = var4.field9758 * var5.field9764 + var4.field9771 * var5.field9771 + var4.field9753 * var5.field9755;
        float var14 = (float) this.field5618 * class576.field8040 + class422.field6001;
        float var15 = (float) this.field5682 * class576.field8040 + class422.field6001;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var16 = ((float) (-this.field5599) + var15) * (float) this.field5668.field5001;
            var17 = ((float) this.field5599 + var14) * (float) this.field5668.field5001;
        } else {
            var16 = (var14 - (float) this.field5599) * (float) this.field5668.field5001;
            var17 = ((float) this.field5599 + var15) * (float) this.field5668.field5001;
        }
        if ((this.field5668.field5032 <= var16 / var8) || (var17 / var8 <= this.field5668.field4995)) {
            return;
        }
        if (arg1 != null || this.field5642 != null) {
            class465.field6718 = var4.field9756 * var5.field9756 + var4.field9776 * var5.field9773 + var4.field9764 * var5.field9758;
            class14.field201 = var4.field9773 * var5.field9756 + var4.field9763 * var5.field9773 + var4.field9755 * var5.field9758;
            class760.field10596 = var4.field9756 * var5.field9776 + var4.field9776 * var5.field9763 + var4.field9764 * var5.field9753;
            class423.field6008 = var4.field9758 * var5.field9776 + var4.field9771 * var5.field9753 + var4.field9753 * var5.field9763;
            class716.field10100 = var4.field9773 * var5.field9776 + var4.field9763 * var5.field9763 + var4.field9755 * var5.field9753;
            class700.field9874 = var4.field9758 * var5.field9756 + var4.field9771 * var5.field9758 + var4.field9753 * var5.field9773;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5654 + this.field5640 >> 1;
            int var21 = this.field5576 + this.field5613 >> 1;
            int var22 = (int) ((float) var21 * class14.field201 + (float) this.field5618 * class612.field8454 + (float) var20 * class716.field10100 + class151.field1834);
            int var23 = (int) ((float) var21 * class700.field9874 + (float) this.field5618 * class576.field8040 + (float) var20 * class423.field6008 + class422.field6001);
            int var24 = (int) ((float) var21 * class465.field6718 + (float) this.field5618 * class204.field2595 + (float) var20 * class760.field10596 + class489.field6955);
            if (this.field5668.field5060 <= var24) {
                arg1.field9207 = this.field5668.field5055 * var22 / var24 + this.field5668.field5067;
                arg1.field9203 = this.field5668.field5016 + (this.field5668.field5001 * var23 / var24);
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class14.field201 + (float) this.field5682 * class612.field8454 + (float) var20 * class716.field10100 + class151.field1834);
            int var26 = (int) ((float) var21 * class700.field9874 + (float) this.field5682 * class576.field8040 + (float) var20 * class423.field6008 + class422.field6001);
            int var27 = (int) ((float) var21 * class465.field6718 + (float) this.field5682 * class204.field2595 + (float) var20 * class760.field10596 + class489.field6955);
            if (var27 < this.field5668.field5060) {
                var18 = true;
            } else {
                arg1.field9205 = this.field5668.field5055 * var25 / var27 + this.field5668.field5067;
                arg1.field9204 = this.field5668.field5001 * var26 / var27 + this.field5668.field5016;
            }
            if (var18) {
                if (var24 < this.field5668.field5060 && this.field5668.field5060 > var27) {
                    var19 = false;
                } else if (this.field5668.field5060 > var24) {
                    int var31 = (var27 - this.field5668.field5060 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field9207 = this.field5668.field5067 + (this.field5668.field5055 * var32 / this.field5668.field5060);
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field9203 = this.field5668.field5001 * var33 / this.field5668.field5060 + this.field5668.field5016;
                } else if (var27 < this.field5668.field5060) {
                    int var28 = (var24 - this.field5668.field5060 << 16) / (var24 - var27);
                    int var29 = var22 + ((var22 - var25) * var28 >> 16);
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field9207 = this.field5668.field5055 * var29 / this.field5668.field5060 + this.field5668.field5067;
                    arg1.field9203 = this.field5668.field5001 * var30 / this.field5668.field5060 + this.field5668.field5016;
                }
            }
            if (var19) {
                arg1.field9208 = true;
                if (var27 < var24) {
                    arg1.field9206 = (this.field5599 + var22) * this.field5668.field5055 / var24 + this.field5668.field5067 - arg1.field9207;
                } else {
                    arg1.field9206 = this.field5668.field5067 + ((this.field5599 + var25) * this.field5668.field5055 / var27) - arg1.field9205;
                }
            }
        }
        this.field5668.method2126(1);
        this.field5668.method2171(var5, -639156592);
        this.method2387(7760);
        this.field5668.method2157(-16937);
        this.method2393(1651526439);
    }

    @OriginalMember(owner = "client!hn", name = "aa", descriptor = "(SS)V", line = 4473)
    public final void method1368(short arg0, short arg1) {
        field5686++;
        class96 var3 = this.field5668.field6364;
        for (int var4 = 0; var4 < this.field5693; var4++) {
            if (this.field5578[var4] == arg0) {
                this.field5578[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class91 var7 = var3.method389(9559, arg0 & 0xFFFF);
            var5 = var7.field1156;
            var6 = var7.field1166;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class91 var10 = var3.method389(9559, arg1 & 0xFFFF);
            if (var10.field1148 != 0 || var10.field1161 != 0) {
                this.field5610 = true;
            }
            var9 = var10.field1166;
            var8 = var10.field1156;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field5642 != null) {
            for (int var11 = 0; var11 < this.field5679; var11++) {
                class567 var12 = this.field5642[var11];
                class30 var13 = this.field5647[var11];
                var13.field486 = var13.field486 & 0xFF000000 | class198.field2542[this.field5658[var12.field7918] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5639 != null) {
            this.field5639.field1118 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!hn", name = "na", descriptor = "()I", line = 4555)
    public final int method1347() {
        field5670++;
        if (!this.field5632) {
            this.method2388(true);
        }
        return this.field5599;
    }

    @OriginalMember(owner = "client!hn", name = "ma", descriptor = "()I", line = 4567)
    public final int method1333() {
        if (!this.field5632) {
            this.method2388(true);
        }
        field5677++;
        return this.field5584;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZLhn;Lhn;ZI)Lka;", line = 4578)
    private final class219 method2392(int arg0, boolean arg1, class403 arg2, class403 arg3, boolean arg4, int arg5) {
        arg2.field5593 = this.field5593;
        arg2.field5689 = this.field5689;
        arg2.field5678 = arg0;
        arg2.field5636 = this.field5636;
        arg2.field5607 = this.field5607;
        arg2.field5676 = this.field5676;
        if ((arg0 & 0x100) == 0) {
            arg2.field5581 = this.field5581;
        } else {
            arg2.field5581 = true;
        }
        arg2.field5610 = this.field5610;
        arg2.field5615 = this.field5615;
        arg2.field5606 = 0;
        field5656++;
        arg2.field5693 = this.field5693;
        arg2.field5664 = this.field5664;
        arg2.field5679 = this.field5679;
        boolean var7 = class137.method853(-1, arg0, this.field5593);
        boolean var8 = class517.method2969((byte) 92, this.field5593, arg0);
        boolean var9 = class382.method2301((byte) -15, arg0, this.field5593);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg2.field5572 = this.field5572;
            } else if (arg3.field5572 == null || this.field5636 > arg3.field5572.length) {
                arg2.field5572 = arg3.field5572 = new int[this.field5636];
            } else {
                arg2.field5572 = arg3.field5572;
            }
            if (!var8) {
                arg2.field5620 = this.field5620;
            } else if (arg3.field5620 == null || arg3.field5620.length < this.field5636) {
                arg2.field5620 = arg3.field5620 = new int[this.field5636];
            } else {
                arg2.field5620 = arg3.field5620;
            }
            if (!var9) {
                arg2.field5619 = this.field5619;
            } else if (arg3.field5619 == null || arg3.field5619.length < this.field5636) {
                arg2.field5619 = arg3.field5619 = new int[this.field5636];
            } else {
                arg2.field5619 = arg3.field5619;
            }
            for (int var11 = 0; var11 < this.field5636; var11++) {
                if (var7) {
                    arg2.field5572[var11] = this.field5572[var11];
                }
                if (var8) {
                    arg2.field5620[var11] = this.field5620[var11];
                }
                if (var9) {
                    arg2.field5619[var11] = this.field5619[var11];
                }
            }
        } else {
            arg2.field5620 = this.field5620;
            arg2.field5572 = this.field5572;
            arg2.field5619 = this.field5619;
        }
        if (class10.method45(arg5 ^ arg5, this.field5593, arg0)) {
            if (arg1) {
                arg2.field5606 = (byte) (arg2.field5606 | 0x1);
            }
            arg2.field5665 = arg3.field5665;
            arg2.field5665.field1118 = this.field5665.field1118;
            arg2.field5665.field1117 = this.field5665.field1117;
        } else if (class65.method492(this.field5593, arg0, 0)) {
            arg2.field5665 = this.field5665;
        } else {
            arg2.field5665 = null;
        }
        if (class708.method3915(arg0, false, this.field5593)) {
            if (arg3.field5658 == null || arg3.field5658.length < this.field5693) {
                arg2.field5658 = arg3.field5658 = new short[this.field5693];
            } else {
                arg2.field5658 = arg3.field5658;
            }
            for (int var12 = 0; var12 < this.field5693; var12++) {
                arg2.field5658[var12] = this.field5658[var12];
            }
        } else {
            arg2.field5658 = this.field5658;
        }
        if (class357.method2184(arg0, this.field5593, -70)) {
            if (arg3.field5633 == null || this.field5693 > arg3.field5633.length) {
                arg2.field5633 = arg3.field5633 = new byte[this.field5693];
            } else {
                arg2.field5633 = arg3.field5633;
            }
            for (int var13 = 0; var13 < this.field5693; var13++) {
                arg2.field5633[var13] = this.field5633[var13];
            }
        } else {
            arg2.field5633 = this.field5633;
        }
        if (class407.method2411(this.field5593, arg0, 0)) {
            arg2.field5639 = arg3.field5639;
            if (arg1) {
                arg2.field5606 = (byte) (arg2.field5606 | 0x2);
            }
            arg2.field5639.field1117 = this.field5639.field1117;
            arg2.field5639.field1118 = this.field5639.field1118;
        } else if (class710.method3922(arg0, (byte) -125, this.field5593)) {
            arg2.field5639 = this.field5639;
        } else {
            arg2.field5639 = null;
        }
        if (class710.method3920(this.field5593, arg0, -1)) {
            if (arg3.field5612 == null || this.field5689 > arg3.field5612.length) {
                int var14 = this.field5689;
                arg2.field5612 = arg3.field5612 = new short[var14];
                arg2.field5575 = arg3.field5575 = new short[var14];
                arg2.field5648 = arg3.field5648 = new short[var14];
            } else {
                arg2.field5612 = arg3.field5612;
                arg2.field5648 = arg3.field5648;
                arg2.field5575 = arg3.field5575;
            }
            if (this.field5596 == null) {
                for (int var15 = 0; var15 < this.field5689; var15++) {
                    arg2.field5612[var15] = this.field5612[var15];
                    arg2.field5648[var15] = this.field5648[var15];
                    arg2.field5575[var15] = this.field5575[var15];
                }
            } else {
                if (arg3.field5596 == null) {
                    arg3.field5596 = new class284();
                }
                class284 var16 = arg2.field5596 = arg3.field5596;
                if (var16.field3621 == null || this.field5689 > var16.field3621.length) {
                    int var17 = this.field5689;
                    var16.field3619 = new byte[var17];
                    var16.field3620 = new short[var17];
                    var16.field3621 = new short[var17];
                    var16.field3615 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field5689; var18++) {
                    arg2.field5612[var18] = this.field5612[var18];
                    arg2.field5648[var18] = this.field5648[var18];
                    arg2.field5575[var18] = this.field5575[var18];
                    var16.field3621[var18] = this.field5596.field3621[var18];
                    var16.field3615[var18] = this.field5596.field3615[var18];
                    var16.field3620[var18] = this.field5596.field3620[var18];
                    var16.field3619[var18] = this.field5596.field3619[var18];
                }
            }
            arg2.field5590 = this.field5590;
        } else {
            arg2.field5612 = this.field5612;
            arg2.field5596 = this.field5596;
            arg2.field5590 = this.field5590;
            arg2.field5648 = this.field5648;
            arg2.field5575 = this.field5575;
        }
        if (class492.method2866(-1, this.field5593, arg0)) {
            if (arg1) {
                arg2.field5606 = (byte) (arg2.field5606 | 0x4);
            }
            arg2.field5595 = arg3.field5595;
            arg2.field5595.field1117 = this.field5595.field1117;
            arg2.field5595.field1118 = this.field5595.field1118;
        } else if (class34.method312(arg0, this.field5593, arg5 ^ 0x3ED6)) {
            arg2.field5595 = this.field5595;
        } else {
            arg2.field5595 = null;
        }
        if (class467.method2759(6509, this.field5593, arg0)) {
            if (arg3.field5671 == null || this.field5693 > arg3.field5671.length) {
                int var19 = this.field5689;
                arg2.field5671 = arg3.field5671 = new float[var19];
                arg2.field5585 = arg3.field5585 = new float[var19];
            } else {
                arg2.field5585 = arg3.field5585;
                arg2.field5671 = arg3.field5671;
            }
            for (int var20 = 0; var20 < this.field5689; var20++) {
                arg2.field5671[var20] = this.field5671[var20];
                arg2.field5585[var20] = this.field5585[var20];
            }
        } else {
            arg2.field5585 = this.field5585;
            arg2.field5671 = this.field5671;
        }
        if (class126.method815(arg0, 3, this.field5593)) {
            arg2.field5653 = arg3.field5653;
            if (arg1) {
                arg2.field5606 = (byte) (arg2.field5606 | 0x8);
            }
            arg2.field5653.field1117 = this.field5653.field1117;
            arg2.field5653.field1118 = this.field5653.field1118;
        } else if (class439.method2592(-64, arg0, this.field5593)) {
            arg2.field5653 = this.field5653;
        } else {
            arg2.field5653 = null;
        }
        if (class748.method4184(this.field5593, arg0, 0)) {
            if (arg3.field5628 == null || arg3.field5628.length < this.field5693) {
                int var21 = this.field5693;
                arg2.field5628 = arg3.field5628 = new short[var21];
                arg2.field5644 = arg3.field5644 = new short[var21];
                arg2.field5657 = arg3.field5657 = new short[var21];
            } else {
                arg2.field5644 = arg3.field5644;
                arg2.field5657 = arg3.field5657;
                arg2.field5628 = arg3.field5628;
            }
            for (int var22 = 0; var22 < this.field5693; var22++) {
                arg2.field5628[var22] = this.field5628[var22];
                arg2.field5657[var22] = this.field5657[var22];
                arg2.field5644[var22] = this.field5644[var22];
            }
        } else {
            arg2.field5628 = this.field5628;
            arg2.field5657 = this.field5657;
            arg2.field5644 = this.field5644;
        }
        if (class479.method2807(arg5 ^ 0x3D, this.field5593, arg0)) {
            if (arg1) {
                arg2.field5606 = (byte) (arg2.field5606 | 0x10);
            }
            arg2.field5651 = arg3.field5651;
            arg2.field5651.field6971 = this.field5651.field6971;
        } else if (class589.method3277(true, arg0, this.field5593)) {
            arg2.field5651 = this.field5651;
        } else {
            arg2.field5651 = null;
        }
        if (class141.method875(arg0, this.field5593, 32768)) {
            if (arg3.field5578 == null || arg3.field5578.length < this.field5693) {
                int var23 = this.field5693;
                arg2.field5578 = arg3.field5578 = new short[var23];
            } else {
                arg2.field5578 = arg3.field5578;
            }
            for (int var24 = 0; var24 < this.field5693; var24++) {
                arg2.field5578[var24] = this.field5578[var24];
            }
        } else {
            arg2.field5578 = this.field5578;
        }
        if (!class310.method1811(arg0, true, this.field5593)) {
            arg2.field5647 = this.field5647;
        } else if (arg3.field5647 == null || arg3.field5647.length < this.field5679) {
            int var26 = this.field5679;
            arg2.field5647 = arg3.field5647 = new class30[var26];
            for (int var27 = 0; var27 < this.field5679; var27++) {
                arg2.field5647[var27] = this.field5647[var27].method301(class14.method189(arg5, 134));
            }
        } else {
            arg2.field5647 = arg3.field5647;
            for (int var25 = 0; var25 < this.field5679; var25++) {
                arg2.field5647[var25].method299(this.field5647[var25], arg5 ^ 0x86);
            }
        }
        arg2.field5627 = this.field5627;
        arg2.field5691 = this.field5691;
        arg2.field5573 = this.field5573;
        arg2.field5642 = this.field5642;
        arg2.field5617 = this.field5617;
        arg2.field5687 = this.field5687;
        arg2.field5643 = this.field5643;
        arg2.field5616 = this.field5616;
        arg2.field5692 = this.field5692;
        if (this.field5632) {
            arg2.field5618 = this.field5618;
            arg2.field5599 = this.field5599;
            arg2.field5576 = this.field5576;
            arg2.field5613 = this.field5613;
            arg2.field5584 = this.field5584;
            arg2.field5682 = this.field5682;
            arg2.field5640 = this.field5640;
            arg2.field5632 = true;
            arg2.field5654 = this.field5654;
        } else {
            arg2.field5632 = false;
        }
        arg2.field5662 = this.field5662;
        arg2.field5637 = this.field5637;
        return arg2;
    }

    @OriginalMember(owner = "client!hn", name = "VA", descriptor = "(I)V", line = 5054)
    public final void method1373(int arg0) {
        field5634++;
        int var2 = class138.field1644[arg0];
        int var3 = class138.field1645[arg0];
        for (int var4 = 0; var4 < this.field5676; var4++) {
            int var5 = this.field5620[var4] * var2 + this.field5572[var4] * var3 >> 14;
            this.field5620[var4] = this.field5620[var4] * var3 - (this.field5572[var4] * var2) >> 14;
            this.field5572[var4] = var5;
        }
        this.field5632 = false;
        if (this.field5665 != null) {
            this.field5665.field1118 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 5084)
    private final void method2393(int arg0) {
        if (arg0 != 1651526439) {
            return;
        }
        field5583++;
        if (this.field5642 == null) {
            return;
        }
        class688 var2 = this.field5668.field4954;
        this.field5668.method2170(arg0 - 1651526326);
        this.field5668.method129(!this.field5581);
        this.field5668.method2188(false, false);
        this.field5668.method2181(null, this.field5668.field5051, null, this.field5668.field5084, 15063);
        for (int var3 = 0; var3 < this.field5679; var3++) {
            class567 var4 = this.field5642[var3];
            class30 var5 = this.field5647[var3];
            if (!var4.field7927 || !this.field5668.method57()) {
                float var6 = (float) (this.field5572[var4.field7926] + this.field5572[var4.field7914] + this.field5572[var4.field7915]) * 0.3333333F;
                float var7 = (float) (this.field5620[var4.field7926] + this.field5620[var4.field7914] + this.field5620[var4.field7915]) * 0.3333333F;
                float var8 = (float) (this.field5619[var4.field7926] - (-this.field5619[var4.field7915] - this.field5619[var4.field7914])) * 0.3333333F;
                float var9 = class14.field201 * var8 + class716.field10100 * var6 + class612.field8454 * var7 + class151.field1834;
                float var10 = class700.field9874 * var8 + class576.field8040 * var7 + class423.field6008 * var6 + class422.field6001;
                float var11 = class465.field6718 * var8 + class760.field10596 * var6 + class204.field2595 * var7 + class489.field6955;
                float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field7923;
                var2.method3850(var10 * var12 + (float) var5.field484 - var10, var4.field7922 * var5.field478 >> 7, (float) var5.field483 + var9 - (var9 * var12), arg0 ^ 0x9D8FB4FB, var11 * var12 - var11, var5.field481, var4.field7925 * var5.field489 >> 7);
                this.field5668.method2194((byte) -28, var2);
                int var13 = var5.field486;
                OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                this.field5668.method2140(arg0 ^ 0x62704B27, var4.field7919);
                this.field5668.method2195(-74, var4.field7920);
                this.field5668.method2133((byte) 65, 7, 4, 0);
            }
        }
        this.field5668.method129(true);
        this.field5668.method2157(arg0 ^ 0x9D8FF6F0);
    }

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "(I)V", line = 5148)
    public final void method1327(int arg0) {
        field5629++;
        this.field5678 = arg0;
        if (this.field5596 != null && (this.field5678 & 0x10000) == 0) {
            this.field5590 = this.field5596.field3619;
            this.field5648 = this.field5596.field3615;
            this.field5612 = this.field5596.field3621;
            this.field5575 = this.field5596.field3620;
            this.field5596 = null;
        }
        this.field5626 = true;
        this.method2394(true);
    }

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "(III)V", line = 5170)
    public final void method1348(int arg0, int arg1, int arg2) {
        field5660++;
        for (int var4 = 0; var4 < this.field5676; var4++) {
            if (arg0 != 0) {
                this.field5572[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5620[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field5619[var4] += arg2;
            }
        }
        this.field5632 = false;
        if (this.field5665 != null) {
            this.field5665.field1118 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "()I", line = 5211)
    public final int method1355() {
        field5594++;
        if (!this.field5632) {
            this.method2388(true);
        }
        return this.field5613;
    }

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "()I", line = 5222)
    public final int method1339() {
        if (!this.field5632) {
            this.method2388(true);
        }
        field5688++;
        return this.field5654;
    }

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "()V", line = 5238)
    public final void method1345() {
        for (int var1 = 0; var1 < this.field5676; var1++) {
            this.field5619[var1] = -this.field5619[var1];
        }
        field5631++;
        for (int var2 = 0; var2 < this.field5689; var2++) {
            this.field5575[var2] = (short) (-this.field5575[var2]);
        }
        for (int var3 = 0; var3 < this.field5693; var3++) {
            short var4 = this.field5628[var3];
            this.field5628[var3] = this.field5644[var3];
            this.field5644[var3] = var4;
        }
        if (this.field5595 == null && this.field5639 != null) {
            this.field5639.field1118 = null;
        }
        if (this.field5595 != null) {
            this.field5595.field1118 = null;
        }
        if (this.field5665 != null) {
            this.field5665.field1118 = null;
        }
        if (this.field5651 != null) {
            this.field5651.field6971 = null;
        }
        this.field5632 = false;
    }

    @OriginalMember(owner = "client!hn", name = "ia", descriptor = "(SS)V", line = 5290)
    public final void method1362(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5693; var3++) {
            if (this.field5658[var3] == arg0) {
                this.field5658[var3] = arg1;
            }
        }
        field5669++;
        if (this.field5642 != null) {
            for (int var4 = 0; var4 < this.field5679; var4++) {
                class567 var5 = this.field5642[var4];
                class30 var6 = this.field5647[var4];
                var6.field486 = class198.field2542[this.field5658[var5.field7918] & 0xFFFF] & 0xFFFFFF | var6.field486 & 0xFF000000;
            }
        }
        if (this.field5639 != null) {
            this.field5639.field1118 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "()Z", line = 5333)
    public final boolean method1323() {
        field5649++;
        if (this.field5578 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5578.length; var1++) {
            if (this.field5578[var1] != -1 && !this.field5668.field6364.method390(this.field5578[var1], -9396)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "LA", descriptor = "(I)V", line = 5356)
    public final void method1363(int arg0) {
        field5591++;
        this.field5664 = (short) arg0;
        if (this.field5639 != null) {
            this.field5639.field1118 = null;
        }
        if (this.field5595 != null) {
            this.field5595.field1118 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(Z)V", line = 5373)
    private final void method2394(boolean arg0) {
        field5597++;
        if (!this.field5626) {
            return;
        }
        this.field5626 = false;
        if (this.field5573 == null && this.field5662 == null && this.field5642 == null) {
            if (this.field5572 != null && !class571.method3211(113, this.field5593, this.field5678)) {
                if (this.field5665 != null && this.field5665.field1118 == null) {
                    this.field5626 = true;
                } else {
                    if (!this.field5632) {
                        this.method2388(arg0);
                    }
                    this.field5572 = null;
                }
            }
            if (this.field5620 != null && !class192.method1209(this.field5593, this.field5678, -83)) {
                if (this.field5665 != null && this.field5665.field1118 == null) {
                    this.field5626 = true;
                } else {
                    if (!this.field5632) {
                        this.method2388(arg0);
                    }
                    this.field5620 = null;
                }
            }
            if (this.field5619 != null && !class715.method3968(this.field5593, -65, this.field5678)) {
                if (this.field5665 != null && this.field5665.field1118 == null) {
                    this.field5626 = true;
                } else {
                    if (!this.field5632) {
                        this.method2388(true);
                    }
                    this.field5619 = null;
                }
            }
        }
        if (this.field5637 != null && this.field5572 == null && this.field5620 == null && this.field5619 == null) {
            this.field5637 = null;
            this.field5617 = null;
        }
        if (this.field5590 != null && !client.method716((byte) 112, this.field5593, this.field5678)) {
            if (this.field5595 == null) {
                if (this.field5639 != null && this.field5639.field1118 == null) {
                    this.field5626 = true;
                } else {
                    this.field5612 = this.field5648 = this.field5575 = null;
                    this.field5590 = null;
                }
            } else if (this.field5595.field1118 == null) {
                this.field5626 = true;
            } else {
                this.field5590 = null;
                this.field5612 = this.field5648 = this.field5575 = null;
            }
        }
        if (this.field5658 != null && !class484.method2819((byte) -113, this.field5678, this.field5593)) {
            if (this.field5639 != null && this.field5639.field1118 == null) {
                this.field5626 = true;
            } else {
                this.field5658 = null;
            }
        }
        if (this.field5633 != null && !class555.method3157((byte) 19, this.field5678, this.field5593)) {
            if (this.field5639 != null && this.field5639.field1118 == null) {
                this.field5626 = true;
            } else {
                this.field5633 = null;
            }
        }
        if (this.field5671 != null && !class411.method2430(this.field5678, this.field5593, 0)) {
            if (this.field5653 != null && this.field5653.field1118 == null) {
                this.field5626 = true;
            } else {
                this.field5671 = this.field5585 = null;
            }
        }
        if (this.field5578 != null && !class487.method2854(this.field5593, 4, this.field5678)) {
            if (this.field5639 != null && this.field5639.field1118 == null) {
                this.field5626 = true;
            } else {
                this.field5578 = null;
            }
        }
        if (this.field5628 != null && !class337.method1979(this.field5593, this.field5678, (byte) -95)) {
            if ((this.field5651 == null || this.field5651.field6971 != null) && (this.field5639 == null || this.field5639.field1118 != null)) {
                this.field5628 = this.field5657 = this.field5644 = null;
            } else {
                this.field5626 = true;
            }
        }
        if (!arg0) {
            return;
        }
        if (this.field5616 != null && !class595.method3295(this.field5678, true, this.field5593)) {
            this.field5616 = null;
            this.field5691 = null;
        }
        if (this.field5627 != null && !class704.method3902(32, this.field5678, this.field5593)) {
            this.field5627 = null;
            this.field5687 = null;
        }
        if (this.field5643 != null && !class239.method1492(this.field5678, this.field5593, (byte) -127)) {
            this.field5643 = null;
        }
        if (this.field5692 != null && (this.field5678 & 0x800) == 0 && (this.field5678 & 0x40000) == 0) {
            this.field5692 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILwc;ZI)Z", line = 5553)
    public final boolean method1378(int arg0, int arg1, class376 arg2, boolean arg3, int arg4) {
        field5586++;
        return this.method2386(arg1, arg2, false, arg4, arg0, -1, arg3);
    }

    @OriginalMember(owner = "client!hn", name = "EA", descriptor = "()I", line = 5564)
    public final int method1361() {
        if (!this.field5632) {
            this.method2388(true);
        }
        field5684++;
        return this.field5682;
    }

    @OriginalMember(owner = "client!hn", name = "HA", descriptor = "()I", line = 5575)
    public final int method1344() {
        field5614++;
        if (!this.field5632) {
            this.method2388(true);
        }
        return this.field5576;
    }

    @OriginalMember(owner = "client!hn", name = "NA", descriptor = "()Z", line = 5590)
    public final boolean method1328() {
        field5625++;
        if (this.field5627 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5636; var1++) {
            this.field5572[var1] <<= 0x4;
            this.field5620[var1] <<= 0x4;
            this.field5619[var1] <<= 0x4;
        }
        class745.field10394 = 0;
        class552.field7761 = 0;
        class437.field6135 = 0;
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "FA", descriptor = "(I)V", line = 5618)
    public final void method1343(int arg0) {
        field5609++;
        int var2 = class138.field1644[arg0];
        int var3 = class138.field1645[arg0];
        for (int var4 = 0; var4 < this.field5676; var4++) {
            int var5 = this.field5620[var4] * var3 - (this.field5619[var4] * var2) >> 14;
            this.field5619[var4] = this.field5620[var4] * var2 + (this.field5619[var4] * var3) >> 14;
            this.field5620[var4] = var5;
        }
        this.field5632 = false;
        if (this.field5665 != null) {
            this.field5665.field1118 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZZ)V", line = 5652)
    private final void method2395(boolean arg0, boolean arg1) {
        if ((this.field5607 * 6) > this.field5668.field5044.field2325.length) {
            this.field5668.field5044 = new class552((this.field5607 + 100) * 6);
        } else {
            this.field5668.field5044.field2354 = 0;
        }
        field5667++;
        class552 var3 = this.field5668.field5044;
        if (this.field5668.field5025) {
            for (int var5 = 0; var5 < this.field5607; var5++) {
                var3.method1157(this.field5628[var5], (byte) 121);
                var3.method1157(this.field5657[var5], (byte) 117);
                var3.method1157(this.field5644[var5], (byte) 125);
            }
        } else {
            for (int var4 = 0; var4 < this.field5607; var4++) {
                var3.method1098(this.field5628[var4], (byte) -10);
                var3.method1098(this.field5657[var4], (byte) -56);
                var3.method1098(this.field5644[var4], (byte) -43);
            }
        }
        if (var3.field2354 == 0) {
            return;
        }
        if (arg0) {
            if (this.field5577 == null) {
                this.field5577 = this.field5668.method2172(var3.field2325, 5123, -1, true, var3.field2354);
            } else {
                this.field5577.method2406(5123, -13184, var3.field2325, var3.field2354);
            }
            this.field5651.field6971 = this.field5577;
        } else {
            this.field5651.field6971 = this.field5668.method2172(var3.field2325, 5123, -1, false, var3.field2354);
        }
        if (!arg1) {
            this.method1368((short) 27, (short) 126);
        }
        if (!arg0) {
            this.field5626 = true;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IBI)V", line = 5718)
    public static final void method2396(int arg0, byte arg1, int arg2) {
        field5690++;
        class711 var3 = class73.field960[arg0][arg2];
        if (var3 != null) {
            class553.field7770 = var3.field10009;
            class394.field5489 = var3.field10007;
            class513.field7234 = var3.field10014;
        }
        int var4 = -107 % ((20 - arg1) / 43);
        class153.method948((byte) 117);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILwc;ZII)Z", line = 5748)
    public final boolean method1357(int arg0, int arg1, class376 arg2, boolean arg3, int arg4, int arg5) {
        field5646++;
        return this.method2386(arg1, arg2, false, arg4, arg0, arg5, arg3);
    }
}
