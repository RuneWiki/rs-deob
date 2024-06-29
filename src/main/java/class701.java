import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class701 extends class473 {

    @OriginalMember(owner = "client!ic", name = "Jb", descriptor = "[I")
    private int[] field9729;

    @OriginalMember(owner = "client!ic", name = "cc", descriptor = "I")
    private int field9748;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    private int field9659;

    @OriginalMember(owner = "client!ic", name = "Kc", descriptor = "I")
    private int field9782;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    private int field9668;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "[I")
    private int[] field9671;

    @OriginalMember(owner = "client!ic", name = "Db", descriptor = "[S")
    private short[] field9723;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "[I")
    private int[] field9686;

    @OriginalMember(owner = "client!ic", name = "Ac", descriptor = "[I")
    private int[] field9772;

    @OriginalMember(owner = "client!ic", name = "Fb", descriptor = "I")
    private int field9725;

    @OriginalMember(owner = "client!ic", name = "sb", descriptor = "[Lol;")
    private class285[] field9712;

    @OriginalMember(owner = "client!ic", name = "qc", descriptor = "[Lwr;")
    private class459[] field9762;

    @OriginalMember(owner = "client!ic", name = "Zb", descriptor = "I")
    private int field9745;

    @OriginalMember(owner = "client!ic", name = "Ab", descriptor = "[Lrt;")
    private class228[] field9720;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "[Llba;")
    private class551[] field9698;

    @OriginalMember(owner = "client!ic", name = "mc", descriptor = "[F")
    private float[] field9758;

    @OriginalMember(owner = "client!ic", name = "pb", descriptor = "S")
    private short field9709;

    @OriginalMember(owner = "client!ic", name = "Gb", descriptor = "[S")
    private short[] field9726;

    @OriginalMember(owner = "client!ic", name = "ub", descriptor = "[S")
    private short[] field9714;

    @OriginalMember(owner = "client!ic", name = "Jc", descriptor = "[F")
    private float[] field9781;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "[S")
    private short[] field9691;

    @OriginalMember(owner = "client!ic", name = "dc", descriptor = "[S")
    private short[] field9749;

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "[S")
    private short[] field9701;

    @OriginalMember(owner = "client!ic", name = "uc", descriptor = "S")
    private short field9766;

    @OriginalMember(owner = "client!ic", name = "Tb", descriptor = "[S")
    private short[] field9739;

    @OriginalMember(owner = "client!ic", name = "ac", descriptor = "[S")
    private short[] field9746;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "[S")
    private short[] field9664;

    @OriginalMember(owner = "client!ic", name = "ec", descriptor = "[S")
    private short[] field9750;

    @OriginalMember(owner = "client!ic", name = "Vb", descriptor = "[S")
    private short[] field9741;

    @OriginalMember(owner = "client!ic", name = "mb", descriptor = "[S")
    private short[] field9706;

    @OriginalMember(owner = "client!ic", name = "Hb", descriptor = "[B")
    private byte[] field9727;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "[S")
    private short[] field9676;

    @OriginalMember(owner = "client!ic", name = "qb", descriptor = "[B")
    private byte[] field9710;

    @OriginalMember(owner = "client!ic", name = "Hc", descriptor = "[I")
    private int[] field9779;

    @OriginalMember(owner = "client!ic", name = "rc", descriptor = "[I")
    private int[] field9763;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "[I")
    private int[] field9670;

    @OriginalMember(owner = "client!ic", name = "jb", descriptor = "I")
    private int field9703;

    @OriginalMember(owner = "client!ic", name = "gc", descriptor = "I")
    private int field9752;

    @OriginalMember(owner = "client!ic", name = "Ec", descriptor = "[[I")
    private int[][] field9776;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "[[I")
    private int[][] field9684;

    @OriginalMember(owner = "client!ic", name = "wc", descriptor = "[[I")
    private int[][] field9768;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "Z")
    private boolean field9693;

    @OriginalMember(owner = "client!ic", name = "Mb", descriptor = "Z")
    private boolean field9732;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Z")
    private boolean field9683;

    @OriginalMember(owner = "client!ic", name = "ob", descriptor = "Z")
    private boolean field9708;

    @OriginalMember(owner = "client!ic", name = "bc", descriptor = "Z")
    private boolean field9747;

    @OriginalMember(owner = "client!ic", name = "vb", descriptor = "Lwu;")
    private class373 field9715;

    @OriginalMember(owner = "client!ic", name = "Wb", descriptor = "Lhh;")
    private class130 field9742;

    @OriginalMember(owner = "client!ic", name = "Lb", descriptor = "Lhh;")
    private class130 field9731;

    @OriginalMember(owner = "client!ic", name = "hc", descriptor = "Lhh;")
    private class130 field9753;

    @OriginalMember(owner = "client!ic", name = "Ic", descriptor = "Lhh;")
    private class130 field9780;

    @OriginalMember(owner = "client!ic", name = "xb", descriptor = "Lmg;")
    private class149 field9717;

    @OriginalMember(owner = "client!ic", name = "Qb", descriptor = "Z")
    public static boolean field9736 = false;

    @OriginalMember(owner = "client!ic", name = "Sb", descriptor = "I")
    public static int field9738 = 0;

    @OriginalMember(owner = "client!ic", name = "Dc", descriptor = "I")
    public static int field9775 = -1;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field9669;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field9674;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    private int field9677;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field9679;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field9682;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
    private int field9699;

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "I")
    public static int field9700;

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
    public static int field9702;

    @OriginalMember(owner = "client!ic", name = "kb", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!ic", name = "lb", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!ic", name = "nb", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!ic", name = "rb", descriptor = "I")
    public static int field9711;

    @OriginalMember(owner = "client!ic", name = "tb", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!ic", name = "wb", descriptor = "I")
    private int field9716;

    @OriginalMember(owner = "client!ic", name = "yb", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!ic", name = "zb", descriptor = "I")
    private int field9719;

    @OriginalMember(owner = "client!ic", name = "Bb", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!ic", name = "Cb", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!ic", name = "Eb", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!ic", name = "Ib", descriptor = "I")
    private int field9728;

    @OriginalMember(owner = "client!ic", name = "Kb", descriptor = "I")
    private int field9730;

    @OriginalMember(owner = "client!ic", name = "Nb", descriptor = "I")
    public static int field9733;

    @OriginalMember(owner = "client!ic", name = "Ob", descriptor = "I")
    public static int field9734;

    @OriginalMember(owner = "client!ic", name = "Pb", descriptor = "I")
    public static int field9735;

    @OriginalMember(owner = "client!ic", name = "Rb", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!ic", name = "Ub", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!ic", name = "Xb", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!ic", name = "Yb", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!ic", name = "fc", descriptor = "I")
    public static int field9751;

    @OriginalMember(owner = "client!ic", name = "ic", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!ic", name = "jc", descriptor = "I")
    public static int field9755;

    @OriginalMember(owner = "client!ic", name = "kc", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!ic", name = "lc", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!ic", name = "nc", descriptor = "I")
    private int field9759;

    @OriginalMember(owner = "client!ic", name = "oc", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!ic", name = "pc", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!ic", name = "sc", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!ic", name = "tc", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!ic", name = "vc", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!ic", name = "xc", descriptor = "I")
    private int field9769;

    @OriginalMember(owner = "client!ic", name = "yc", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!ic", name = "zc", descriptor = "I")
    public static int field9771;

    @OriginalMember(owner = "client!ic", name = "Bc", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!ic", name = "Cc", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!ic", name = "Fc", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!ic", name = "Gc", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!ic", name = "Lc", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "Lwn;")
    private class725 field9672;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIZ)Lka;", line = 3)
    public final class473 method251(byte arg0, int arg1, boolean arg2) {
        field9694++;
        class701 var4;
        class701 var5;
        if (arg0 == 1) {
            var4 = this.field9715.field5656;
            var5 = this.field9715.field5655;
        } else if (arg0 == 2) {
            var4 = this.field9715.field5667;
            var5 = this.field9715.field5673;
        } else if (arg0 == 3) {
            var5 = this.field9715.field5659;
            var4 = this.field9715.field5670;
        } else if (arg0 == 4) {
            var5 = this.field9715.field5663;
            var4 = this.field9715.field5664;
        } else if (arg0 == 5) {
            var5 = this.field9715.field5668;
            var4 = this.field9715.field5653;
        } else {
            var4 = var5 = new class701(this.field9715, 0, 0, true, false);
        }
        return this.method3978(var5, arg1, arg0 != 0, true, var4, arg2);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lql;)V", line = 52)
    public final void method244(class738 arg0) {
        field9669++;
        class441 var2 = (class441) arg0;
        if (this.field9762 != null) {
            for (int var3 = 0; var3 < this.field9762.length; var3++) {
                class459 var4 = this.field9762[var3];
                class459 var5 = var4;
                if (var4.field6762 != null) {
                    var5 = var4.field6762;
                }
                var5.field6776 = (int) ((float) this.field9686[var4.field6766] * var2.field6535 + (float) this.field9772[var4.field6766] * var2.field6530 + (float) this.field9671[var4.field6766] * var2.field6534 + var2.field6568);
                var5.field6764 = (int) ((float) this.field9686[var4.field6766] * var2.field6565 + (float) this.field9772[var4.field6766] * var2.field6538 + (float) this.field9671[var4.field6766] * var2.field6540 + var2.field6531);
                var5.field6774 = (int) ((float) this.field9686[var4.field6766] * var2.field6541 + (float) this.field9772[var4.field6766] * var2.field6532 + (float) this.field9671[var4.field6766] * var2.field6573 + var2.field6526);
                var5.field6760 = (int) ((float) this.field9686[var4.field6770] * var2.field6535 + (float) this.field9772[var4.field6770] * var2.field6530 + (float) this.field9671[var4.field6770] * var2.field6534 + var2.field6568);
                var5.field6765 = (int) ((float) this.field9686[var4.field6770] * var2.field6565 + (float) this.field9772[var4.field6770] * var2.field6538 + (float) this.field9671[var4.field6770] * var2.field6540 + var2.field6531);
                var5.field6768 = (int) ((float) this.field9686[var4.field6770] * var2.field6541 + (float) this.field9772[var4.field6770] * var2.field6532 + (float) this.field9671[var4.field6770] * var2.field6573 + var2.field6526);
                var5.field6772 = (int) ((float) this.field9686[var4.field6757] * var2.field6535 + (float) this.field9772[var4.field6757] * var2.field6530 + (float) this.field9671[var4.field6757] * var2.field6534 + var2.field6568);
                var5.field6758 = (int) ((float) this.field9686[var4.field6757] * var2.field6565 + (float) this.field9772[var4.field6757] * var2.field6538 + (float) this.field9671[var4.field6757] * var2.field6540 + var2.field6531);
                var5.field6761 = (int) ((float) this.field9686[var4.field6757] * var2.field6541 + (float) this.field9772[var4.field6757] * var2.field6532 + (float) this.field9671[var4.field6757] * var2.field6573 + var2.field6526);
            }
        }
        if (this.field9712 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field9712.length; var6++) {
            class285 var7 = this.field9712[var6];
            class285 var8 = var7;
            if (var7.field4054 != null) {
                var8 = var7.field4054;
            }
            if (var7.field4046 == null) {
                var7.field4046 = var2.method759();
            } else {
                var7.field4046.method772(var2);
            }
            var8.field4048 = (int) ((float) this.field9686[var7.field4055] * var2.field6535 + (float) this.field9772[var7.field4055] * var2.field6530 + (float) this.field9671[var7.field4055] * var2.field6534 + var2.field6568);
            var8.field4045 = (int) ((float) this.field9686[var7.field4055] * var2.field6565 + (float) this.field9772[var7.field4055] * var2.field6538 + (float) this.field9671[var7.field4055] * var2.field6540 + var2.field6531);
            var8.field4049 = (int) ((float) this.field9686[var7.field4055] * var2.field6541 + (float) this.field9772[var7.field4055] * var2.field6532 + (float) this.field9671[var7.field4055] * var2.field6573 + var2.field6526);
        }
    }

    @OriginalMember(owner = "client!ic", name = "LA", descriptor = "(I)V", line = 123)
    public final void method287(int arg0) {
        this.field9766 = (short) arg0;
        field9761++;
        this.method3988(-104926648);
        this.method3984(-9714);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lql;IZ)V", line = 136)
    public final void method276(class738 arg0, int arg1, boolean arg2) {
        field9661++;
        if (this.field9723 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field9668; var5++) {
            if ((arg1 & this.field9723[var5]) != 0) {
                if (arg2) {
                    arg0.method766(this.field9671[var5], this.field9772[var5], this.field9686[var5], var4);
                } else {
                    arg0.method767(this.field9671[var5], this.field9772[var5], this.field9686[var5], var4);
                }
                this.field9671[var5] = var4[0];
                this.field9772[var5] = var4[1];
                this.field9686[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()V", line = 169)
    public final void method280() {
        field9662++;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()[Lol;", line = 178)
    public final class285[] method285() {
        field9757++;
        return this.field9712;
    }

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "(I)V", line = 186)
    public final void method282(int arg0) {
        this.field9709 = (short) arg0;
        field9735++;
        this.method3986((byte) 95);
    }

    @OriginalMember(owner = "client!ic", name = "VA", descriptor = "(I)V", line = 197)
    public final void method279(int arg0) {
        field9783++;
        int var2 = class373.field5548[arg0];
        int var3 = class373.field5549[arg0];
        for (int var4 = 0; var4 < this.field9668; var4++) {
            int var5 = this.field9772[var4] * var2 + this.field9671[var4] * var3 >> 14;
            this.field9772[var4] = this.field9772[var4] * var3 - (this.field9671[var4] * var2) >> 14;
            this.field9671[var4] = var5;
        }
        this.method3988(-104926648);
        this.field9708 = false;
    }

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "(III)V", line = 225)
    public final void method238(int arg0, int arg1, int arg2) {
        field9663++;
        for (int var4 = 0; var4 < this.field9668; var4++) {
            if (arg0 != 0) {
                this.field9671[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field9772[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field9686[var4] += arg2;
            }
        }
        this.method3988(-104926648);
        this.field9708 = false;
    }

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "(I)V", line = 254)
    public final void method271(int arg0) {
        if (this.field9742 != null) {
            this.field9742.field1742 = class530.method3102(this.field9752, arg0, 113);
        }
        field9674++;
        if (this.field9731 != null) {
            this.field9731.field1742 = class33.method163(this.field9752, arg0, 544);
        }
        if (this.field9753 != null) {
            this.field9753.field1742 = class348.method2206(arg0, this.field9752, 55);
        }
        if (this.field9780 != null) {
            this.field9780.field1742 = class456.method2790(this.field9752, -6, arg0);
        }
        this.field9782 = arg0;
        if (this.field9672 != null && (this.field9782 & 0x10000) == 0) {
            this.field9741 = this.field9672.field10117;
            this.field9710 = this.field9672.field10115;
            this.field9739 = this.field9672.field10119;
            this.field9691 = this.field9672.field10122;
            this.field9672 = null;
        }
        this.field9747 = true;
        this.method3982((byte) -82);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V", line = 297)
    public static final void method3976(int arg0, int arg1, int arg2) {
        field9675++;
        if (arg0 != 7838) {
            field9736 = true;
        }
        class150 var3 = class676.method3885(1000, 5, arg2);
        var3.method1116(arg0 - 7784);
        var3.field2346 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V", line = 313)
    private final void method3977(int arg0) {
        field9681++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        if (arg0 != -645696473) {
            this.method3982((byte) 110);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < this.field9668; var10++) {
            int var11 = this.field9671[var10];
            int var12 = this.field9772[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            int var13 = this.field9686[var10];
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
            int var15 = var11 * var11 - (-(var13 * var13) - var12 * var12);
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field9699 = var7;
        this.field9716 = var4;
        this.field9769 = var5;
        this.field9677 = var3;
        this.field9759 = var2;
        this.field9728 = var6;
        this.field9719 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field9730 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field9708 = true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[IIIIIZ)V", line = 395)
    public final void method248(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field9704++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = 0;
            class264.field3781 = 0;
            class220.field3227 = 0;
            class631.field8821 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field9776.length) {
                    int[] var15 = this.field9776[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class631.field8821 += this.field9671[var17];
                        class264.field3781 += this.field9772[var17];
                        var12++;
                        class220.field3227 += this.field9686[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class264.field3781 = var11;
                class220.field3227 = var10;
                class631.field8821 = var9;
            } else {
                class220.field3227 = class220.field3227 / var12 + var10;
                class631.field8821 = class631.field8821 / var12 + var9;
                class264.field3781 = class264.field3781 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field9776.length > var22) {
                    int[] var23 = this.field9776[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field9671[var25] += var18;
                        this.field9772[var25] += var19;
                        this.field9686[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field9776.length) {
                    int[] var46 = this.field9776[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field9671[var48] -= class631.field8821;
                            this.field9772[var48] -= class264.field3781;
                            this.field9686[var48] -= class220.field3227;
                            if (arg4 != 0) {
                                int var49 = class373.field5548[arg4];
                                int var50 = class373.field5549[arg4];
                                int var51 = this.field9772[var48] * var49 + this.field9671[var48] * var50 + 16383 >> 14;
                                this.field9772[var48] = this.field9772[var48] * var50 + 16383 - (this.field9671[var48] * var49) >> 14;
                                this.field9671[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class373.field5548[arg2];
                                int var53 = class373.field5549[arg2];
                                int var54 = this.field9772[var48] * var53 + 16383 - (this.field9686[var48] * var52) >> 14;
                                this.field9686[var48] = this.field9772[var48] * var52 + (this.field9686[var48] * var53) + 16383 >> 14;
                                this.field9772[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class373.field5548[arg3];
                                int var56 = class373.field5549[arg3];
                                int var57 = this.field9686[var48] * var55 + this.field9671[var48] * var56 + 16383 >> 14;
                                this.field9686[var48] = this.field9686[var48] * var56 + 16383 - (this.field9671[var48] * var55) >> 14;
                                this.field9671[var48] = var57;
                            }
                            this.field9671[var48] += class631.field8821;
                            this.field9772[var48] += class264.field3781;
                            this.field9686[var48] += class220.field3227;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field9671[var59] -= class631.field8821;
                            this.field9772[var59] -= class264.field3781;
                            this.field9686[var59] -= class220.field3227;
                            if (arg2 != 0) {
                                int var60 = class373.field5548[arg2];
                                int var61 = class373.field5549[arg2];
                                int var62 = this.field9772[var59] * var61 + 16383 - this.field9686[var59] * var60 >> 14;
                                this.field9686[var59] = this.field9772[var59] * var60 + this.field9686[var59] * var61 + 16383 >> 14;
                                this.field9772[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class373.field5548[arg4];
                                int var64 = class373.field5549[arg4];
                                int var65 = this.field9772[var59] * var63 + this.field9671[var59] * var64 + 16383 >> 14;
                                this.field9772[var59] = this.field9772[var59] * var64 + 16383 - this.field9671[var59] * var63 >> 14;
                                this.field9671[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class373.field5548[arg3];
                                int var67 = class373.field5549[arg3];
                                int var68 = this.field9686[var59] * var66 - (-(this.field9671[var59] * var67) - 16383) >> 14;
                                this.field9686[var59] = this.field9686[var59] * var67 + 16383 - (this.field9671[var59] * var66) >> 14;
                                this.field9671[var59] = var68;
                            }
                            this.field9671[var59] += class631.field8821;
                            this.field9772[var59] += class264.field3781;
                            this.field9686[var59] += class220.field3227;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field9776.length) {
                        int[] var29 = this.field9776[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field9729[var31];
                            int var33 = this.field9729[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field9664[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class373.field5548[arg4];
                                    int var37 = class373.field5549[arg4];
                                    int var38 = this.field9691[var35] * var37 + this.field9741[var35] * var36 + 16383 >> 14;
                                    this.field9741[var35] = (short) (this.field9741[var35] * var37 + 16383 - (this.field9691[var35] * var36) >> 14);
                                    this.field9691[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class373.field5548[arg2];
                                    int var40 = class373.field5549[arg2];
                                    int var41 = this.field9741[var35] * var40 + 16383 - (this.field9739[var35] * var39) >> 14;
                                    this.field9739[var35] = (short) (this.field9741[var35] * var39 + this.field9739[var35] * var40 + 16383 >> 14);
                                    this.field9741[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class373.field5548[arg3];
                                    int var43 = class373.field5549[arg3];
                                    int var44 = this.field9739[var35] * var42 + this.field9691[var35] * var43 + 16383 >> 14;
                                    this.field9739[var35] = (short) (this.field9739[var35] * var43 + 16383 - (this.field9691[var35] * var42) >> 14);
                                    this.field9691[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method3984(-9714);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field9776.length > var70) {
                    int[] var71 = this.field9776[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field9671[var73] -= class631.field8821;
                        this.field9772[var73] -= class264.field3781;
                        this.field9686[var73] -= class220.field3227;
                        this.field9671[var73] = this.field9671[var73] * arg2 >> 7;
                        this.field9772[var73] = this.field9772[var73] * arg3 >> 7;
                        this.field9686[var73] = this.field9686[var73] * arg4 >> 7;
                        this.field9671[var73] += class631.field8821;
                        this.field9772[var73] += class264.field3781;
                        this.field9686[var73] += class220.field3227;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9768 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (this.field9768.length > var79) {
                        int[] var80 = this.field9768[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field9727[var82] & 0xFF) + (arg2 * 8);
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field9727[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field9720 != null) {
                        for (int var76 = 0; var76 < this.field9745; var76++) {
                            class228 var77 = this.field9720[var76];
                            class551 var78 = this.field9698[var76];
                            var78.field7856 = 255 - (this.field9727[var77.field3359] & 0xFF) << 24 | var78.field7856 & 0xFFFFFF;
                        }
                    }
                    this.method3986((byte) 104);
                }
            }
        } else if (arg0 == 7) {
            if (this.field9768 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (var89 < this.field9768.length) {
                        int[] var90 = this.field9768[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field9706[var92] & 0xFFFF;
                            int var94 = var93 >> 10 & 0x3F;
                            int var95 = var93 >> 7 & 0x7;
                            int var96 = var93 & 0x7F;
                            int var97 = arg2 + var94 & 0x3F;
                            int var98 = arg3 / 4 + var95;
                            int var99 = arg4 + var96;
                            if (var98 < 0) {
                                var98 = 0;
                            } else if (var98 > 7) {
                                var98 = 7;
                            }
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field9706[var92] = (short) class625.method3600(var99, class625.method3600(var97 << 10, var98 << 7));
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field9720 != null) {
                        for (int var86 = 0; var86 < this.field9745; var86++) {
                            class228 var87 = this.field9720[var86];
                            class551 var88 = this.field9698[var86];
                            var88.field7856 = class324.field4632[this.field9706[var87.field3359] & 0xFFFF] & 0xFFFFFF | var88.field7856 & 0xFF000000;
                        }
                    }
                    this.method3986((byte) 97);
                }
            }
        } else if (arg0 == 8) {
            if (this.field9684 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (this.field9684.length > var101) {
                        int[] var102 = this.field9684[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class551 var104 = this.field9698[var102[var103]];
                            var104.field7855 += arg2;
                            var104.field7861 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9684 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field9684.length) {
                        int[] var107 = this.field9684[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class551 var109 = this.field9698[var107[var108]];
                            var109.field7854 = var109.field7854 * arg3 >> 7;
                            var109.field7858 = var109.field7858 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9684 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (var111 < this.field9684.length) {
                    int[] var112 = this.field9684[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class551 var114 = this.field9698[var112[var113]];
                        var114.field7860 = var114.field7860 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lic;IZZLic;Z)Lka;", line = 1051)
    private final class473 method3978(class701 arg0, int arg1, boolean arg2, boolean arg3, class701 arg4, boolean arg5) {
        arg4.field9745 = this.field9745;
        arg4.field9725 = this.field9725;
        arg4.field9709 = this.field9709;
        arg4.field9782 = arg1;
        if ((arg1 & 0x100) == 0) {
            arg4.field9693 = this.field9693;
        } else {
            arg4.field9693 = true;
        }
        field9705++;
        arg4.field9732 = this.field9732;
        arg4.field9703 = this.field9703;
        arg4.field9659 = this.field9659;
        arg4.field9752 = this.field9752;
        arg4.field9766 = this.field9766;
        arg4.field9668 = this.field9668;
        arg4.field9748 = this.field9748;
        boolean var7 = class263.method1696(this.field9752, -25072, arg1);
        boolean var8 = class629.method3630(-119, this.field9752, arg1);
        boolean var9 = class724.method4085((byte) 62, this.field9752, arg1);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg4.field9671 = this.field9671;
            } else if (arg0.field9671 == null || this.field9725 > arg0.field9671.length) {
                arg4.field9671 = arg0.field9671 = new int[this.field9725];
            } else {
                arg4.field9671 = arg0.field9671;
            }
            if (!var8) {
                arg4.field9772 = this.field9772;
            } else if (arg0.field9772 == null || this.field9725 > arg0.field9772.length) {
                arg4.field9772 = arg0.field9772 = new int[this.field9725];
            } else {
                arg4.field9772 = arg0.field9772;
            }
            if (!var9) {
                arg4.field9686 = this.field9686;
            } else if (arg0.field9686 == null || arg0.field9686.length < this.field9725) {
                arg4.field9686 = arg0.field9686 = new int[this.field9725];
            } else {
                arg4.field9686 = arg0.field9686;
            }
            for (int var11 = 0; var11 < this.field9725; var11++) {
                if (var7) {
                    arg4.field9671[var11] = this.field9671[var11];
                }
                if (var8) {
                    arg4.field9772[var11] = this.field9772[var11];
                }
                if (var9) {
                    arg4.field9686[var11] = this.field9686[var11];
                }
            }
        } else {
            arg4.field9686 = this.field9686;
            arg4.field9671 = this.field9671;
            arg4.field9772 = this.field9772;
        }
        if (class530.method3102(this.field9752, arg1, -30)) {
            arg4.field9742 = arg0.field9742;
            arg4.field9742.field1747 = this.field9742.field1747;
            arg4.field9742.field1743 = this.field9742.field1743;
            arg4.field9742.field1742 = true;
        } else if (class741.method4149(arg1, this.field9752, 1)) {
            arg4.field9742 = this.field9742;
        } else {
            arg4.field9742 = null;
        }
        if (class86.method700(102, this.field9752, arg1)) {
            if (arg0.field9706 == null || this.field9748 > arg0.field9706.length) {
                arg4.field9706 = arg0.field9706 = new short[this.field9748];
            } else {
                arg4.field9706 = arg0.field9706;
            }
            for (int var12 = 0; var12 < this.field9748; var12++) {
                arg4.field9706[var12] = this.field9706[var12];
            }
        } else {
            arg4.field9706 = this.field9706;
        }
        if (class423.method2653(arg1, this.field9752, !arg3)) {
            if (arg0.field9727 == null || this.field9748 > arg0.field9727.length) {
                arg4.field9727 = arg0.field9727 = new byte[this.field9748];
            } else {
                arg4.field9727 = arg0.field9727;
            }
            for (int var13 = 0; var13 < this.field9748; var13++) {
                arg4.field9727[var13] = this.field9727[var13];
            }
        } else {
            arg4.field9727 = this.field9727;
        }
        if (class348.method2206(arg1, this.field9752, 55)) {
            arg4.field9753 = arg0.field9753;
            arg4.field9753.field1742 = true;
            arg4.field9753.field1743 = this.field9753.field1743;
            arg4.field9753.field1747 = this.field9753.field1747;
        } else if (class585.method3385(arg1, (byte) 126, this.field9752)) {
            arg4.field9753 = this.field9753;
        } else {
            arg4.field9753 = null;
        }
        if (class33.method170(this.field9752, (byte) -87, arg1)) {
            if (arg0.field9691 == null || this.field9703 > arg0.field9691.length) {
                int var14 = this.field9703;
                arg4.field9739 = arg0.field9739 = new short[var14];
                arg4.field9691 = arg0.field9691 = new short[var14];
                arg4.field9741 = arg0.field9741 = new short[var14];
            } else {
                arg4.field9691 = arg0.field9691;
                arg4.field9741 = arg0.field9741;
                arg4.field9739 = arg0.field9739;
            }
            if (this.field9672 == null) {
                arg4.field9672 = null;
                for (int var18 = 0; var18 < this.field9703; var18++) {
                    arg4.field9691[var18] = this.field9691[var18];
                    arg4.field9741[var18] = this.field9741[var18];
                    arg4.field9739[var18] = this.field9739[var18];
                }
            } else {
                if (arg0.field9672 == null) {
                    arg0.field9672 = new class725();
                }
                class725 var15 = arg4.field9672 = arg0.field9672;
                if (var15.field10122 == null || this.field9703 > var15.field10122.length) {
                    int var16 = this.field9703;
                    var15.field10115 = new byte[var16];
                    var15.field10119 = new short[var16];
                    var15.field10122 = new short[var16];
                    var15.field10117 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field9703; var17++) {
                    arg4.field9691[var17] = this.field9691[var17];
                    arg4.field9741[var17] = this.field9741[var17];
                    arg4.field9739[var17] = this.field9739[var17];
                    var15.field10122[var17] = this.field9672.field10122[var17];
                    var15.field10117[var17] = this.field9672.field10117[var17];
                    var15.field10119[var17] = this.field9672.field10119[var17];
                    var15.field10115[var17] = this.field9672.field10115[var17];
                }
            }
            arg4.field9710 = this.field9710;
        } else {
            arg4.field9741 = this.field9741;
            arg4.field9672 = this.field9672;
            arg4.field9710 = this.field9710;
            arg4.field9691 = this.field9691;
            arg4.field9739 = this.field9739;
        }
        if (class456.method2790(this.field9752, -6, arg1)) {
            arg4.field9780 = arg0.field9780;
            arg4.field9780.field1747 = this.field9780.field1747;
            arg4.field9780.field1743 = this.field9780.field1743;
            arg4.field9780.field1742 = true;
        } else if (class385.method2479(arg1, (byte) 8, this.field9752)) {
            arg4.field9780 = this.field9780;
        } else {
            arg4.field9780 = null;
        }
        if (class612.method3545((byte) -64, arg1, this.field9752)) {
            if (arg0.field9758 == null || this.field9748 > arg0.field9758.length) {
                int var19 = this.field9703;
                arg4.field9781 = arg0.field9781 = new float[var19];
                arg4.field9758 = arg0.field9758 = new float[var19];
            } else {
                arg4.field9781 = arg0.field9781;
                arg4.field9758 = arg0.field9758;
            }
            for (int var20 = 0; var20 < this.field9703; var20++) {
                arg4.field9758[var20] = this.field9758[var20];
                arg4.field9781[var20] = this.field9781[var20];
            }
        } else {
            arg4.field9781 = this.field9781;
            arg4.field9758 = this.field9758;
        }
        if (class33.method163(this.field9752, arg1, 544)) {
            arg4.field9731 = arg0.field9731;
            arg4.field9731.field1747 = this.field9731.field1747;
            arg4.field9731.field1743 = this.field9731.field1743;
            arg4.field9731.field1742 = true;
        } else if (class201.method1381(this.field9752, arg1, -49)) {
            arg4.field9731 = this.field9731;
        } else {
            arg4.field9731 = null;
        }
        if (class399.method2535(500, this.field9752, arg1)) {
            if (arg0.field9676 == null || arg0.field9676.length < this.field9748) {
                int var21 = this.field9748;
                arg4.field9714 = arg0.field9714 = new short[var21];
                arg4.field9726 = arg0.field9726 = new short[var21];
                arg4.field9676 = arg0.field9676 = new short[var21];
            } else {
                arg4.field9714 = arg0.field9714;
                arg4.field9676 = arg0.field9676;
                arg4.field9726 = arg0.field9726;
            }
            for (int var22 = 0; var22 < this.field9748; var22++) {
                arg4.field9676[var22] = this.field9676[var22];
                arg4.field9714[var22] = this.field9714[var22];
                arg4.field9726[var22] = this.field9726[var22];
            }
        } else {
            arg4.field9714 = this.field9714;
            arg4.field9676 = this.field9676;
            arg4.field9726 = this.field9726;
        }
        if (class96.method749(arg3, arg1, this.field9752)) {
            arg4.field9717 = arg0.field9717;
            arg4.field9717.field2322 = this.field9717.field2322;
            arg4.field9717.field2329 = true;
            arg4.field9717.field2325 = this.field9717.field2325;
        } else if (class262.method1693(this.field9752, (byte) -4, arg1)) {
            arg4.field9717 = this.field9717;
        } else {
            arg4.field9717 = null;
        }
        if (class310.method1963((byte) 102, this.field9752, arg1)) {
            if (arg0.field9750 == null || this.field9748 > arg0.field9750.length) {
                int var23 = this.field9748;
                arg4.field9750 = arg0.field9750 = new short[var23];
            } else {
                arg4.field9750 = arg0.field9750;
            }
            for (int var24 = 0; var24 < this.field9748; var24++) {
                arg4.field9750[var24] = this.field9750[var24];
            }
        } else {
            arg4.field9750 = this.field9750;
        }
        if (!class223.method1499(this.field9752, arg1, -31024)) {
            arg4.field9698 = this.field9698;
        } else if (arg0.field9698 == null || arg0.field9698.length < this.field9745) {
            int var26 = this.field9745;
            arg4.field9698 = arg0.field9698 = new class551[var26];
            for (int var27 = 0; var27 < this.field9745; var27++) {
                arg4.field9698[var27] = this.field9698[var27].method3216((byte) -117);
            }
        } else {
            arg4.field9698 = arg0.field9698;
            for (int var25 = 0; var25 < this.field9745; var25++) {
                arg4.field9698[var25].method3215(0, this.field9698[var25]);
            }
        }
        arg4.field9701 = this.field9701;
        arg4.field9746 = this.field9746;
        arg4.field9768 = this.field9768;
        arg4.field9776 = this.field9776;
        arg4.field9684 = this.field9684;
        if (this.field9708) {
            arg4.field9728 = this.field9728;
            arg4.field9759 = this.field9759;
            arg4.field9677 = this.field9677;
            arg4.field9716 = this.field9716;
            arg4.field9769 = this.field9769;
            arg4.field9730 = this.field9730;
            arg4.field9699 = this.field9699;
            arg4.field9719 = this.field9719;
            arg4.field9708 = true;
        } else {
            arg4.field9708 = false;
        }
        arg4.field9723 = this.field9723;
        arg4.field9763 = this.field9763;
        arg4.field9720 = this.field9720;
        arg4.field9779 = this.field9779;
        arg4.field9729 = this.field9729;
        arg4.field9749 = this.field9749;
        arg4.field9670 = this.field9670;
        arg4.field9664 = this.field9664;
        arg4.field9762 = this.field9762;
        arg4.field9712 = this.field9712;
        return arg4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Z", line = 1512)
    private final boolean method3979(boolean arg0) {
        field9695++;
        if (this.field9717.field2322) {
            return true;
        }
        if (this.field9717.field2321 == null) {
            this.field9717.field2321 = this.field9715.method2362(107, this.field9683);
        }
        class216 var2 = this.field9717.field2321;
        var2.method1458((byte) 91, this.field9659 * 6);
        Buffer var3 = var2.method1457(arg0, -127);
        if (var3 != null) {
            Stream var4 = this.field9715.method2392(var3, -15232);
            if (Stream.method3869()) {
                for (int var6 = 0; var6 < this.field9659; var6++) {
                    var4.method3861(this.field9676[var6]);
                    var4.method3861(this.field9714[var6]);
                    var4.method3861(this.field9726[var6]);
                }
            } else {
                for (int var5 = 0; var5 < this.field9659; var5++) {
                    var4.method3858(this.field9676[var5]);
                    var4.method3858(this.field9714[var5]);
                    var4.method3858(this.field9726[var5]);
                }
            }
            var4.method3872();
            if (var2.method1459(-26499)) {
                this.field9717.field2322 = true;
                this.field9747 = true;
                this.field9717.field2325 = var2;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBLql;ZII)Z", line = 1579)
    private final boolean method3980(int arg0, int arg1, byte arg2, class738 arg3, boolean arg4, int arg5, int arg6) {
        field9737++;
        class441 var8 = (class441) arg3;
        class441 var9 = this.field9715.field5542;
        float var10 = var8.field6526 * var9.field6535 + var8.field6568 * var9.field6534 + var8.field6531 * var9.field6530 + var9.field6568;
        float var11 = var8.field6526 * var9.field6565 + var8.field6568 * var9.field6540 + var8.field6531 * var9.field6538 + var9.field6531;
        class391.field5888 = var8.field6541 * var9.field6565 + var8.field6565 * var9.field6538 + var8.field6535 * var9.field6540;
        class542.field7729 = var8.field6573 * var9.field6565 + var8.field6540 * var9.field6538 + var8.field6534 * var9.field6540;
        class458.field6751 = var8.field6532 * var9.field6541 + var8.field6538 * var9.field6532 + var8.field6530 * var9.field6573;
        class551.field7852 = var8.field6573 * var9.field6541 + var8.field6540 * var9.field6532 + var8.field6534 * var9.field6573;
        class571.field8084 = var8.field6541 * var9.field6541 + var8.field6565 * var9.field6532 + var8.field6535 * var9.field6573;
        class28.field275 = var8.field6532 * var9.field6535 + var8.field6538 * var9.field6530 + var8.field6530 * var9.field6534;
        class381.field5750 = var8.field6532 * var9.field6565 + var8.field6538 * var9.field6538 + var8.field6530 * var9.field6540;
        class98.field1378 = var8.field6541 * var9.field6535 + var8.field6565 * var9.field6530 + var8.field6535 * var9.field6534;
        class71.field1006 = var8.field6573 * var9.field6535 + var8.field6540 * var9.field6530 + var8.field6534 * var9.field6534;
        float var12 = var8.field6526 * var9.field6541 + var8.field6568 * var9.field6573 + var8.field6531 * var9.field6532 + var9.field6526;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field9715.field5571;
        int var19 = this.field9715.field5561;
        if (!this.field9708) {
            this.method3977(arg2 ^ 0xD983744A);
        }
        int var20 = this.field9769 - this.field9759 >> 1;
        int var21 = this.field9728 - this.field9677 >> 1;
        int var22 = this.field9699 - this.field9716 >> 1;
        int var23 = this.field9759 + var20;
        int var24 = this.field9677 + var21;
        int var25 = this.field9716 + var22;
        int var26 = var23 - (var20 << arg6);
        int var27 = var24 - (var21 << arg6);
        int var28 = var25 - (var22 << arg6);
        int var29 = (var20 << arg6) + var23;
        int var30 = (var21 << arg6) + var24;
        int var31 = var25 + (var22 << arg6);
        class258.field3697[0] = var26;
        class353.field5141[0] = var27;
        class258.field3697[1] = var29;
        class393.field5918[0] = var28;
        if (arg2 != 109) {
            return true;
        }
        class353.field5141[1] = var27;
        class393.field5918[1] = var28;
        class258.field3697[2] = var26;
        class353.field5141[2] = var30;
        class258.field3697[3] = var29;
        class393.field5918[2] = var28;
        class353.field5141[3] = var30;
        class258.field3697[4] = var26;
        class393.field5918[3] = var28;
        class353.field5141[4] = var27;
        class393.field5918[4] = var31;
        class258.field3697[5] = var29;
        class353.field5141[5] = var27;
        class258.field3697[6] = var26;
        class393.field5918[5] = var31;
        class353.field5141[6] = var30;
        class258.field3697[7] = var29;
        class393.field5918[6] = var31;
        class353.field5141[7] = var30;
        class393.field5918[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var51 = (float) class353.field5141[var32];
            float var52 = (float) class258.field3697[var32];
            float var53 = (float) class393.field5918[var32];
            float var54 = class98.field1378 * var53 + class71.field1006 * var52 + class28.field275 * var51 + var10;
            float var55 = class571.field8084 * var53 + class551.field7852 * var52 + class458.field6751 * var51 + var12;
            float var56 = class391.field5888 * var53 + class542.field7729 * var52 + class381.field5750 * var51 + var11;
            if ((float) this.field9715.field5600 <= var55) {
                if (arg5 > 0) {
                    var55 = arg5;
                }
                float var57 = (float) var18 * var54 / var55 + (float) this.field9715.field5572;
                float var58 = (float) var19 * var56 / var55 + (float) this.field9715.field5588;
                if (var14 > var57) {
                    var14 = var57;
                }
                if (var57 > var15) {
                    var15 = var57;
                }
                if (var58 < var16) {
                    var16 = var58;
                }
                var13 = true;
                if (var17 < var58) {
                    var17 = var58;
                }
            }
        }
        if (var13 && var14 < (float) arg1 && var15 > (float) arg1 && var16 < (float) arg0 && var17 > (float) arg0) {
            if (arg4) {
                return true;
            }
            if (this.field9703 > class390.field5878.length) {
                class679.field9438 = new int[this.field9703];
                class390.field5878 = new int[this.field9703];
            }
            for (int var33 = 0; var33 < this.field9668; var33++) {
                float var35 = (float) this.field9772[var33];
                float var36 = (float) this.field9686[var33];
                float var37 = (float) this.field9671[var33];
                float var38 = class98.field1378 * var36 + class71.field1006 * var37 + class28.field275 * var35 + var10;
                float var39 = class571.field8084 * var36 + class551.field7852 * var37 + class458.field6751 * var35 + var12;
                float var40 = class391.field5888 * var36 + class542.field7729 * var37 + class381.field5750 * var35 + var11;
                if ((float) this.field9715.field5600 <= var39) {
                    if (arg5 > 0) {
                        var39 = arg5;
                    }
                    int var41 = (int) ((float) var18 * var38 / var39 + (float) this.field9715.field5572);
                    int var42 = (int) ((float) var19 * var40 / var39 + (float) this.field9715.field5588);
                    int var43 = this.field9729[var33];
                    int var44 = this.field9729[var33 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field9664[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        class390.field5878[var46] = var41;
                        class679.field9438[var46] = var42;
                    }
                } else {
                    int var47 = this.field9729[var33];
                    int var48 = this.field9729[var33 + 1];
                    for (int var49 = var47; var49 < var48; var49++) {
                        int var50 = this.field9664[var49] - 1;
                        if (var50 == -1) {
                            break;
                        }
                        class390.field5878[this.field9664[var49] - 1] = -999999;
                    }
                }
            }
            for (int var34 = 0; var34 < this.field9748; var34++) {
                if (class390.field5878[this.field9676[var34]] != -999999 && class390.field5878[this.field9714[var34]] != -999999 && class390.field5878[this.field9726[var34]] != -999999 && this.method3987(arg1, class390.field5878[this.field9726[var34]], class679.field9438[this.field9714[var34]], 10542, arg0, class390.field5878[this.field9714[var34]], class390.field5878[this.field9676[var34]], class679.field9438[this.field9676[var34]], class679.field9438[this.field9726[var34]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "aa", descriptor = "(SS)V", line = 1822)
    public final void method254(short arg0, short arg1) {
        field9687++;
        class151 var3 = this.field9715.field849;
        for (int var4 = 0; var4 < this.field9748; var4++) {
            if (this.field9750[var4] == arg0) {
                this.field9750[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class293 var7 = var3.method1124((byte) -96, arg0 & 0xFFFF);
            var6 = var7.field4193;
            var5 = var7.field4179;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class293 var10 = var3.method1124((byte) -91, arg1 & 0xFFFF);
            if (var10.field4188 != 0 || var10.field4171 != 0) {
                this.field9732 = true;
            }
            var8 = var10.field4179;
            var9 = var10.field4193;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field9720 != null) {
            for (int var11 = 0; var11 < this.field9745; var11++) {
                class228 var12 = this.field9720[var11];
                class551 var13 = this.field9698[var11];
                var13.field7856 = class324.field4632[this.field9706[var12.field3359] & 0xFFFF] & 0xFFFFFF | var13.field7856 & 0xFF000000;
            }
        }
        this.method3986((byte) 117);
    }

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "(IILs;Ls;III)V", line = 1897)
    public final void method270(int arg0, int arg1, class280 arg2, class280 arg3, int arg4, int arg5, int arg6) {
        field9713++;
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        int var8 = this.field9759 + arg4;
        int var9 = this.field9769 + arg4;
        int var10 = this.field9716 + arg6;
        int var11 = this.field9699 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3963 <= arg2.field3965 + var9 >> arg2.field3955 || var10 < 0 || (arg2.field3965 + var11 >> arg2.field3955) >= arg2.field3962) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field3965 + var9 >> arg3.field3955) >= arg3.field3963 || var10 < 0 || arg3.field3962 <= arg3.field3965 + var11 >> arg3.field3955) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3955;
            int var13 = arg2.field3965 + var9 - 1 >> arg2.field3955;
            int var14 = var10 >> arg2.field3955;
            int var15 = var11 + arg2.field3965 - 1 >> arg2.field3955;
            if (arg2.method1787(var12, 19646, var14) == arg5 && arg2.method1787(var13, 19646, var14) == arg5 && arg2.method1787(var12, 19646, var15) == arg5 && arg5 == arg2.method1787(var13, 19646, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field9668; var32++) {
                this.field9772[var32] -= arg5 - arg2.method1786(this.field9686[var32] + arg6, (byte) 113, this.field9671[var32] + arg4);
            }
        } else if (arg0 == 2) {
            int var29 = this.field9677;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field9668; var30++) {
                int var31 = (this.field9772[var30] << 16) / var29;
                if (var31 < arg1) {
                    this.field9772[var30] -= -((arg2.method1786(this.field9686[var30] + arg6, (byte) 113, this.field9671[var30] + arg4) - arg5) * (arg1 - var31) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = ((arg1 & 0xFFB8) >> 8) * 4;
            int var18 = (arg1 >> 16 & 0xFF) << 6;
            int var19 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var16 >> 1) < 0 || (arg2.field3963 << arg2.field3955) <= ((var16 >> 1) + arg2.field3965 + arg4) || arg6 - (var17 >> 1) < 0 || ((var17 >> 1) + arg6 + arg2.field3965) >= (arg2.field3962 << arg2.field3955)) {
                return;
            }
            this.method2852(var16, var17, var19, var18, arg5, 115, arg2, arg4, arg6);
        } else if (arg0 == 4) {
            int var20 = this.field9728 - this.field9677;
            for (int var21 = 0; var21 < this.field9668; var21++) {
                this.field9772[var21] = this.field9772[var21] + arg3.method1786(this.field9686[var21] + arg6, (byte) 113, this.field9671[var21] + arg4) + (-arg5 - -var20);
            }
        } else if (arg0 == 5) {
            int var22 = this.field9728 - this.field9677;
            for (int var23 = 0; var23 < this.field9668; var23++) {
                int var24 = this.field9671[var23] + arg4;
                int var25 = this.field9686[var23] + arg6;
                int var26 = arg2.method1786(var25, (byte) 113, var24);
                int var27 = arg3.method1786(var25, (byte) 113, var24);
                int var28 = var26 - arg1 - var27;
                this.field9772[var23] = ((this.field9772[var23] << 8) / var22 * var28 >> 8) + var26 - arg5;
            }
        }
        this.method3988(-104926648);
        this.field9708 = false;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lwu;Ldh;IIII)V", line = 2055)
    public class701(class373 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class151 var7 = arg0.field849;
        int[] var8 = new int[arg1.field4593];
        this.field9729 = new int[arg1.field4568 + 1];
        for (int var9 = 0; var9 < arg1.field4593; var9++) {
            if (arg1.field4571 == null || arg1.field4571[var9] != 2) {
                if (arg1.field4592 != null && arg1.field4592[var9] != -1) {
                    class293 var178 = var7.method1124((byte) -98, arg1.field4592[var9] & 0xFFFF);
                    if (((this.field9752 & 0x40) == 0 || !var178.field4184) && var178.field4187) {
                        continue;
                    }
                }
                var8[this.field9748++] = var9;
                this.field9729[arg1.field4567[var9]]++;
                this.field9729[arg1.field4563[var9]]++;
                this.field9729[arg1.field4572[var9]]++;
            }
        }
        this.field9659 = this.field9748;
        long[] var10 = new long[this.field9748];
        boolean var11 = (this.field9782 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field9748; var12++) {
            int var161 = var8[var12];
            class293 var162 = null;
            int var163 = 0;
            byte var164 = 0;
            byte var165 = 0;
            byte var166 = 0;
            if (arg1.field4581 != null) {
                boolean var167 = false;
                for (int var168 = 0; var168 < arg1.field4581.length; var168++) {
                    class542 var169 = arg1.field4581[var168];
                    if (var169.field7728 == var161) {
                        class702 var170 = class495.method2947(var169.field7727, (byte) -79);
                        if (var170.field9790) {
                            var167 = true;
                        }
                        if (var170.field9787 != -1) {
                            class293 var171 = var7.method1124((byte) 42, var170.field9787);
                            if (var171.field4192 == 2) {
                                this.field9693 = true;
                            }
                        }
                    }
                }
                if (var167) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field9659--;
                    continue;
                }
            }
            short var172 = -1;
            if (arg1.field4592 != null) {
                var172 = arg1.field4592[var161];
                if (var172 != -1) {
                    var162 = var7.method1124((byte) 53, var172 & 0xFFFF);
                    if ((this.field9752 & 0x40) != 0 && var162.field4184) {
                        var162 = null;
                        var172 = -1;
                    } else {
                        var165 = var162.field4185;
                        var166 = var162.field4176;
                    }
                }
            }
            boolean var173 = arg1.field4552 != null && arg1.field4552[var161] != 0 || var162 != null && var162.field4192 != 0;
            if ((var11 || var173) && arg1.field4591 != null) {
                var163 += arg1.field4591[var161] << 17;
            }
            if (var173) {
                var163 += 65536;
            }
            int var174 = (var165 & 0xFF << 8) + var163;
            int var175 = (var166 & 0xFF) + var174;
            int var176 = (var172 & 0xFFFF << 16) + var164;
            int var177 = (var12 & 0xFFFF) + var176;
            var10[var12] = ((long) var175 << 32) + ((long) var177);
            this.field9732 |= var162 != null && (var162.field4188 != 0 || var162.field4171 != 0);
            this.field9693 |= var173;
        }
        class334.method2109(var8, (byte) -44, var10);
        this.field9668 = arg1.field4568;
        this.field9671 = arg1.field4561;
        this.field9723 = arg1.field4587;
        this.field9686 = arg1.field4553;
        this.field9772 = arg1.field4564;
        this.field9725 = arg1.field4590;
        this.field9712 = arg1.field4589;
        this.field9762 = arg1.field4562;
        class295[] var13 = new class295[this.field9668];
        if (arg1.field4581 != null) {
            this.field9745 = arg1.field4581.length;
            this.field9720 = new class228[this.field9745];
            this.field9698 = new class551[this.field9745];
            for (int var14 = 0; var14 < this.field9745; var14++) {
                class542 var15 = arg1.field4581[var14];
                class702 var16 = class495.method2947(var15.field7727, (byte) -79);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field9748; var18++) {
                    if (var8[var18] == var15.field7728) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class324.field4632[arg1.field4604[var15.field7728] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field4552 == null ? 0 : arg1.field4552[var15.field7728]) << 24;
                this.field9720[var14] = new class228(var17, arg1.field4567[var15.field7728], arg1.field4563[var15.field7728], arg1.field4572[var15.field7728], var16.field9794, var16.field9792, var16.field9787, var16.field9785, var16.field9791, var16.field9790, var16.field9793, var15.field7733);
                this.field9698[var14] = new class551(var20);
            }
        }
        int var21 = this.field9748 * 3;
        this.field9758 = new float[var21];
        this.field9709 = (short) arg3;
        this.field9726 = new short[this.field9748];
        this.field9714 = new short[this.field9748];
        this.field9781 = new float[var21];
        this.field9691 = new short[var21];
        this.field9749 = new short[var21];
        class297.field4214 = new long[var21];
        if (arg1.field4598 != null) {
            this.field9701 = new short[this.field9748];
        }
        this.field9766 = (short) arg4;
        this.field9739 = new short[var21];
        this.field9746 = new short[var21];
        this.field9664 = new short[var21];
        this.field9750 = new short[this.field9748];
        this.field9741 = new short[var21];
        this.field9706 = new short[this.field9748];
        this.field9727 = new byte[this.field9748];
        this.field9676 = new short[this.field9748];
        this.field9710 = new byte[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field4568; var23++) {
            int var160 = this.field9729[var23];
            this.field9729[var23] = var22;
            var22 += var160;
            var13[var23] = new class295();
        }
        this.field9729[arg1.field4568] = var22;
        class445 var24 = class149.method1112(this.field9748, arg1, var8, -3);
        class581[] var25 = new class581[arg1.field4593];
        for (int var26 = 0; var26 < arg1.field4593; var26++) {
            short var139 = arg1.field4567[var26];
            short var140 = arg1.field4563[var26];
            short var141 = arg1.field4572[var26];
            int var142 = this.field9671[var140] - this.field9671[var139];
            int var143 = this.field9772[var140] - this.field9772[var139];
            int var144 = this.field9686[var140] - this.field9686[var139];
            int var145 = this.field9671[var141] - this.field9671[var139];
            int var146 = this.field9772[var141] - this.field9772[var139];
            int var147 = this.field9686[var141] - this.field9686[var139];
            int var148 = var143 * var147 - (var144 * var146);
            int var149 = var144 * var145 - (var142 * var147);
            int var150;
            for (var150 = var142 * var146 - (var143 * var145); var148 > 8192 || var149 > 8192 || var150 > 8192 || var148 < -8192 || var149 < -8192 || var150 < -8192; var150 >>= 0x1) {
                var149 >>= 0x1;
                var148 >>= 0x1;
            }
            int var151 = (int) Math.sqrt((double) (var148 * var148 + var149 * var149 + var150 * var150));
            if (var151 <= 0) {
                var151 = 1;
            }
            int var152 = var149 * 256 / var151;
            int var153 = var148 * 256 / var151;
            int var154 = var150 * 256 / var151;
            byte var155 = arg1.field4571 == null ? 0 : arg1.field4571[var26];
            if (var155 == 0) {
                class295 var157 = var13[var139];
                var157.field4204++;
                var157.field4203 += var153;
                var157.field4199 += var152;
                var157.field4201 += var154;
                class295 var158 = var13[var140];
                var158.field4201 += var154;
                var158.field4199 += var152;
                var158.field4203 += var153;
                var158.field4204++;
                class295 var159 = var13[var141];
                var159.field4199 += var152;
                var159.field4201 += var154;
                var159.field4204++;
                var159.field4203 += var153;
            } else if (var155 == 1) {
                class581 var156 = var25[var26] = new class581();
                var156.field8254 = var153;
                var156.field8250 = var154;
                var156.field8253 = var152;
            }
        }
        for (int var27 = 0; var27 < this.field9748; var27++) {
            int var48 = var8[var27];
            int var49 = arg1.field4604[var48] & 0xFFFF;
            int var50;
            if (arg1.field4597 == null) {
                var50 = -1;
            } else {
                var50 = arg1.field4597[var48];
            }
            int var51;
            if (arg1.field4552 == null) {
                var51 = 0;
            } else {
                var51 = arg1.field4552[var48] & 0xFF;
            }
            short var52 = arg1.field4592 == null ? -1 : arg1.field4592[var48];
            if (var52 != -1 && (this.field9752 & 0x40) != 0) {
                class293 var53 = var7.method1124((byte) 52, var52 & 0xFFFF);
                if (var53.field4184) {
                    var52 = -1;
                }
            }
            float var54 = 0.0F;
            float var55 = 0.0F;
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            byte var60 = 0;
            byte var61 = 0;
            int var62 = 0;
            if (var52 != -1) {
                if (var50 == -1) {
                    var58 = 0.0F;
                    var57 = 1.0F;
                    var61 = 2;
                    var60 = 1;
                    var59 = 0.0F;
                    var54 = 0.0F;
                    var55 = 1.0F;
                    var56 = 1.0F;
                } else {
                    var50 &= 0xFF;
                    byte var63 = arg1.field4558[var50];
                    if (var63 == 0) {
                        short var64 = arg1.field4567[var48];
                        short var65 = arg1.field4563[var48];
                        short var66 = arg1.field4572[var48];
                        short var67 = arg1.field4580[var50];
                        short var68 = arg1.field4601[var50];
                        short var69 = arg1.field4594[var50];
                        float var70 = (float) arg1.field4561[var67];
                        float var71 = (float) arg1.field4564[var67];
                        float var72 = (float) arg1.field4553[var67];
                        float var73 = (float) arg1.field4561[var68] - var70;
                        float var74 = (float) arg1.field4564[var68] - var71;
                        float var75 = (float) arg1.field4553[var68] - var72;
                        float var76 = (float) arg1.field4561[var69] - var70;
                        float var77 = (float) arg1.field4564[var69] - var71;
                        float var78 = (float) arg1.field4553[var69] - var72;
                        float var79 = (float) arg1.field4561[var64] - var70;
                        float var80 = (float) arg1.field4564[var64] - var71;
                        float var81 = (float) arg1.field4553[var64] - var72;
                        float var82 = (float) arg1.field4561[var65] - var70;
                        float var83 = (float) arg1.field4564[var65] - var71;
                        float var84 = (float) arg1.field4553[var65] - var72;
                        float var85 = (float) arg1.field4561[var66] - var70;
                        float var86 = (float) arg1.field4564[var66] - var71;
                        float var87 = (float) arg1.field4553[var66] - var72;
                        float var88 = var74 * var78 - var75 * var77;
                        float var89 = var75 * var76 - var73 * var78;
                        float var90 = var73 * var77 - (var74 * var76);
                        float var91 = var77 * var90 - (var78 * var89);
                        float var92 = var78 * var88 - (var76 * var90);
                        float var93 = var76 * var89 - (var77 * var88);
                        float var94 = 1.0F / (var75 * var93 + var73 * var91 + var74 * var92);
                        var56 = (var84 * var93 + var82 * var91 + var83 * var92) * var94;
                        var54 = (var81 * var93 + var79 * var91 + var80 * var92) * var94;
                        var58 = (var87 * var93 + var85 * var91 + var86 * var92) * var94;
                        float var95 = var74 * var90 - (var75 * var89);
                        float var96 = var73 * var89 - (var74 * var88);
                        float var97 = var75 * var88 - var73 * var90;
                        float var98 = 1.0F / (var78 * var96 + var76 * var95 + var77 * var97);
                        var59 = (var87 * var96 + var85 * var95 + var86 * var97) * var98;
                        var57 = (var84 * var96 + var82 * var95 + var83 * var97) * var98;
                        var55 = (var81 * var96 + var79 * var95 + var80 * var97) * var98;
                    } else {
                        short var99 = arg1.field4567[var48];
                        short var100 = arg1.field4563[var48];
                        short var101 = arg1.field4572[var48];
                        int var102 = var24.field6611[var50];
                        int var103 = var24.field6606[var50];
                        int var104 = var24.field6609[var50];
                        float[] var105 = var24.field6608[var50];
                        byte var106 = arg1.field4602[var50];
                        float var107 = (float) arg1.field4600[var50] / 256.0F;
                        if (var63 == 1) {
                            float var108 = (float) arg1.field4588[var50] / 1024.0F;
                            class657.method3797(-64, arg1.field4564[var99], var103, var106, var108, var105, class81.field1145, var104, arg1.field4553[var99], arg1.field4561[var99], var102, var107);
                            var55 = class81.field1145[1];
                            var54 = class81.field1145[0];
                            class657.method3797(-97, arg1.field4564[var100], var103, var106, var108, var105, class81.field1145, var104, arg1.field4553[var100], arg1.field4561[var100], var102, var107);
                            var57 = class81.field1145[1];
                            var56 = class81.field1145[0];
                            class657.method3797(-116, arg1.field4564[var101], var103, var106, var108, var105, class81.field1145, var104, arg1.field4553[var101], arg1.field4561[var101], var102, var107);
                            var58 = class81.field1145[0];
                            var59 = class81.field1145[1];
                            float var109 = var108 / 2.0F;
                            if ((var106 & 0x1) == 0) {
                                if (var109 < var58 - var54) {
                                    var61 = 1;
                                    var58 -= var108;
                                } else if (var109 < var54 - var58) {
                                    var61 = 2;
                                    var58 += var108;
                                }
                                if ((var109 < var56 - var54)) {
                                    var60 = 1;
                                    var56 -= var108;
                                } else if (var109 < var54 - var56) {
                                    var56 += var108;
                                    var60 = 2;
                                }
                            } else {
                                if (var109 < var59 - var55) {
                                    var61 = 1;
                                    var59 -= var108;
                                } else if (var55 - var59 > var109) {
                                    var61 = 2;
                                    var59 += var108;
                                }
                                if (var109 < var57 - var55) {
                                    var57 -= var108;
                                    var60 = 1;
                                } else if (var109 < var55 - var57) {
                                    var57 += var108;
                                    var60 = 2;
                                }
                            }
                        } else if (var63 == 2) {
                            float var110 = (float) arg1.field4599[var50] / 256.0F;
                            float var111 = (float) arg1.field4574[var50] / 256.0F;
                            int var112 = arg1.field4561[var100] - arg1.field4561[var99];
                            int var113 = arg1.field4564[var100] - arg1.field4564[var99];
                            int var114 = arg1.field4553[var100] - arg1.field4553[var99];
                            int var115 = arg1.field4561[var101] - arg1.field4561[var99];
                            int var116 = arg1.field4564[var101] - arg1.field4564[var99];
                            int var117 = arg1.field4553[var101] - arg1.field4553[var99];
                            int var118 = var113 * var117 - (var114 * var116);
                            int var119 = var114 * var115 - (var112 * var117);
                            int var120 = var112 * var116 - (var113 * var115);
                            float var121 = 64.0F / (float) arg1.field4560[var50];
                            float var122 = 64.0F / (float) arg1.field4566[var50];
                            float var123 = 64.0F / (float) arg1.field4588[var50];
                            float var124 = (var105[2] * (float) var120 + var105[1] * (float) var119 + var105[0] * (float) var118) / var121;
                            float var125 = (var105[5] * (float) var120 + var105[3] * (float) var118 + var105[4] * (float) var119) / var122;
                            float var126 = (var105[8] * (float) var120 + var105[7] * (float) var119 + var105[6] * (float) var118) / var123;
                            var62 = class192.method1336(10264, var124, var125, var126);
                            class426.method2659(class81.field1145, arg1.field4564[var99], var102, (byte) -84, var103, var104, arg1.field4561[var99], var62, var111, arg1.field4553[var99], var107, var105, var110, var106);
                            var54 = class81.field1145[0];
                            var55 = class81.field1145[1];
                            class426.method2659(class81.field1145, arg1.field4564[var100], var102, (byte) -84, var103, var104, arg1.field4561[var100], var62, var111, arg1.field4553[var100], var107, var105, var110, var106);
                            var56 = class81.field1145[0];
                            var57 = class81.field1145[1];
                            class426.method2659(class81.field1145, arg1.field4564[var101], var102, (byte) -84, var103, var104, arg1.field4561[var101], var62, var111, arg1.field4553[var101], var107, var105, var110, var106);
                            var59 = class81.field1145[1];
                            var58 = class81.field1145[0];
                        } else if (var63 == 3) {
                            class134.method944(var104, var106, -19454, arg1.field4553[var99], arg1.field4561[var99], arg1.field4564[var99], var103, var105, class81.field1145, var107, var102);
                            var55 = class81.field1145[1];
                            var54 = class81.field1145[0];
                            class134.method944(var104, var106, -19454, arg1.field4553[var100], arg1.field4561[var100], arg1.field4564[var100], var103, var105, class81.field1145, var107, var102);
                            var56 = class81.field1145[0];
                            var57 = class81.field1145[1];
                            class134.method944(var104, var106, -19454, arg1.field4553[var101], arg1.field4561[var101], arg1.field4564[var101], var103, var105, class81.field1145, var107, var102);
                            var59 = class81.field1145[1];
                            var58 = class81.field1145[0];
                            if ((var106 & 0x1) == 0) {
                                if ((var58 - var54 > 0.5F)) {
                                    var58--;
                                    var61 = 1;
                                } else if (var54 - var58 > 0.5F) {
                                    var61 = 2;
                                    var58++;
                                }
                                if (var56 - var54 > 0.5F) {
                                    var60 = 1;
                                    var56--;
                                } else if (var54 - var56 > 0.5F) {
                                    var60 = 2;
                                    var56++;
                                }
                            } else {
                                if ((var57 - var55 > 0.5F)) {
                                    var60 = 1;
                                    var57--;
                                } else if (var55 - var57 > 0.5F) {
                                    var57++;
                                    var60 = 2;
                                }
                                if (var59 - var55 > 0.5F) {
                                    var59--;
                                    var61 = 1;
                                } else if (var55 - var59 > 0.5F) {
                                    var61 = 2;
                                    var59++;
                                }
                            }
                        }
                    }
                }
            }
            byte var127;
            if (arg1.field4571 == null) {
                var127 = 0;
            } else {
                var127 = arg1.field4571[var48];
            }
            if (var127 == 0) {
                long var131 = (long) (var50 << 2) + ((long) (var49 << 8) + (long) (var62 << 24) + (long) var51 << 32);
                short var133 = arg1.field4567[var48];
                short var134 = arg1.field4563[var48];
                short var135 = arg1.field4572[var48];
                class295 var136 = var13[var133];
                this.field9676[var27] = this.method3989(var54, var136.field4199, var131, var55, var133, var136.field4201, var136.field4204, var27, -8834, var136.field4203, arg1);
                class295 var137 = var13[var134];
                this.field9714[var27] = this.method3989(var56, var137.field4199, (long) var60 + var131, var57, var134, var137.field4201, var137.field4204, var27, -8834, var137.field4203, arg1);
                class295 var138 = var13[var135];
                this.field9726[var27] = this.method3989(var58, var138.field4199, (long) var61 + var131, var59, var135, var138.field4201, var138.field4204, var27, -8834, var138.field4203, arg1);
            } else if (var127 == 1) {
                class581 var128 = var25[var48];
                long var129 = ((long) (var49 << 8) + (long) (var62 << 24) + ((long) var51) << 32) + (long) ((var128.field8250 + 256 << 22) + (var128.field8253 + 256 << 12) + (var50 << 2) + (var128.field8254 <= 0 ? 2048 : 1024));
                this.field9676[var27] = this.method3989(var54, var128.field8253, var129, var55, arg1.field4567[var48], var128.field8250, 0, var27, -8834, var128.field8254, arg1);
                this.field9714[var27] = this.method3989(var56, var128.field8253, (long) var60 + var129, var57, arg1.field4563[var48], var128.field8250, 0, var27, -8834, var128.field8254, arg1);
                this.field9726[var27] = this.method3989(var58, var128.field8253, (long) var61 + var129, var59, arg1.field4572[var48], var128.field8250, 0, var27, -8834, var128.field8254, arg1);
            }
            if (arg1.field4552 != null) {
                this.field9727[var27] = arg1.field4552[var48];
            }
            if (arg1.field4598 != null) {
                this.field9701[var27] = arg1.field4598[var48];
            }
            this.field9706[var27] = arg1.field4604[var48];
            this.field9750[var27] = var52;
        }
        if (this.field9659 > 0) {
            int var28 = 1;
            short var29 = this.field9750[0];
            for (int var30 = 0; var30 < this.field9659; var30++) {
                short var40 = this.field9750[var30];
                if (var29 != var40) {
                    var28++;
                    var29 = var40;
                }
            }
            this.field9779 = new int[var28];
            this.field9763 = new int[var28 + 1];
            this.field9670 = new int[var28];
            this.field9763[0] = 0;
            int var31 = this.field9703;
            short var32 = 0;
            int var33 = 0;
            short var34 = this.field9750[0];
            for (int var35 = 0; var35 < this.field9659; var35++) {
                short var36 = this.field9750[var35];
                if (var34 != var36) {
                    this.field9779[var33] = var31;
                    this.field9670[var33] = var32 - (var31 - 1);
                    var33++;
                    this.field9763[var33] = var35;
                    var31 = this.field9703;
                    var34 = var36;
                    var32 = 0;
                }
                short var37 = this.field9676[var35];
                if (var32 < var37) {
                    var32 = var37;
                }
                if (var37 < var31) {
                    var31 = var37;
                }
                short var38 = this.field9714[var35];
                if (var32 < var38) {
                    var32 = var38;
                }
                if (var38 < var31) {
                    var31 = var38;
                }
                short var39 = this.field9726[var35];
                if (var39 < var31) {
                    var31 = var39;
                }
                if (var32 < var39) {
                    var32 = var39;
                }
            }
            this.field9779[var33] = var31;
            this.field9670[var33] = var32 + 1 - var31;
            var33++;
            this.field9763[var33] = this.field9659;
        }
        class297.field4214 = null;
        this.field9746 = class177.method1259(this.field9746, 0, this.field9703);
        this.field9749 = class177.method1259(this.field9749, 0, this.field9703);
        this.field9691 = class177.method1259(this.field9691, 0, this.field9703);
        this.field9741 = class177.method1259(this.field9741, 0, this.field9703);
        this.field9739 = class177.method1259(this.field9739, 0, this.field9703);
        this.field9710 = class647.method3762(this.field9703, this.field9710, 127);
        this.field9758 = class488.method2924(this.field9703, true, this.field9758);
        this.field9781 = class488.method2924(this.field9703, true, this.field9781);
        if (arg1.field4585 != null && class201.method1379((byte) -2, arg2, this.field9752)) {
            this.field9776 = arg1.method2039(false, false);
        }
        if (arg1.field4581 != null && class453.method2777(this.field9752, -47, arg2)) {
            this.field9684 = arg1.method2044(30384);
        }
        if (arg1.field4583 != null && class755.method4206(arg2, 48, this.field9752)) {
            int var41 = 0;
            int[] var42 = new int[256];
            for (int var43 = 0; var43 < this.field9748; var43++) {
                int var47 = arg1.field4583[var8[var43]];
                if (var47 >= 0) {
                    int var10002 = var42[var47]++;
                    if (var47 > var41) {
                        var41 = var47;
                    }
                }
            }
            this.field9768 = new int[var41 + 1][];
            for (int var44 = 0; var44 <= var41; var44++) {
                this.field9768[var44] = new int[var42[var44]];
                var42[var44] = 0;
            }
            for (int var45 = 0; var45 < this.field9748; var45++) {
                int var46 = arg1.field4583[var8[var45]];
                if (var46 >= 0) {
                    this.field9768[var46][var42[var46]++] = var45;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "ba", descriptor = "(Lr;)Lr;", line = 2954)
    public final class183 method242(class183 arg0) {
        field9656++;
        if (this.field9703 == 0) {
            return null;
        }
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        int var2;
        int var3;
        if (this.field9715.field5628 > 0) {
            var2 = this.field9759 - (this.field9715.field5628 * this.field9728 >> 8) >> this.field9715.field5551;
            var3 = this.field9769 - (this.field9715.field5628 * this.field9677 >> 8) >> this.field9715.field5551;
        } else {
            var2 = this.field9759 - (this.field9715.field5628 * this.field9677 >> 8) >> this.field9715.field5551;
            var3 = this.field9769 - (this.field9715.field5628 * this.field9728 >> 8) >> this.field9715.field5551;
        }
        int var4;
        int var5;
        if (this.field9715.field5611 > 0) {
            var4 = this.field9716 - (this.field9715.field5611 * this.field9728 >> 8) >> this.field9715.field5551;
            var5 = this.field9699 - (this.field9715.field5611 * this.field9677 >> 8) >> this.field9715.field5551;
        } else {
            var4 = this.field9716 - (this.field9715.field5611 * this.field9677 >> 8) >> this.field9715.field5551;
            var5 = this.field9699 - (this.field9715.field5611 * this.field9728 >> 8) >> this.field9715.field5551;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class750 var8 = (class750) arg0;
        class750 var9;
        if (var8 != null && var8.method4183(var6, var7, 0)) {
            var9 = var8;
            var8.method4186(30976);
        } else {
            var9 = new class750(this.field9715, var6, var7);
        }
        var9.method4187(var2, var3, var4, var5, (byte) -95);
        this.method3985(-128, var9);
        return var9;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V", line = 3015)
    public final void method267(int arg0, int arg1, int arg2, int arg3) {
        field9764++;
        for (int var5 = 0; var5 < this.field9748; var5++) {
            int var9 = this.field9706[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field9706[var5] = (short) class625.method3600(class625.method3600(var10 << 10, var11 << 7), var12);
        }
        if (this.field9720 != null) {
            for (int var6 = 0; var6 < this.field9745; var6++) {
                class228 var7 = this.field9720[var6];
                class551 var8 = this.field9698[var6];
                var8.field7856 = class324.field4632[this.field9706[var7.field3359] & 0xFFFF] & 0xFFFFFF | var8.field7856 & 0xFF000000;
            }
        }
        this.method3986((byte) -112);
    }

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "()I", line = 3071)
    public final int method258() {
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        field9657++;
        return this.field9759;
    }

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "(IIII)V", line = 3083)
    public final void method245(int arg0, int arg1, int arg2, int arg3) {
        field9744++;
        if (arg0 == 0) {
            int var5 = 0;
            class631.field8821 = 0;
            class264.field3781 = 0;
            class220.field3227 = 0;
            for (int var6 = 0; var6 < this.field9668; var6++) {
                class631.field8821 += this.field9671[var6];
                class264.field3781 += this.field9772[var6];
                var5++;
                class220.field3227 += this.field9686[var6];
            }
            if (var5 <= 0) {
                class631.field8821 = arg1;
                class220.field3227 = arg3;
                class264.field3781 = arg2;
            } else {
                class264.field3781 = class264.field3781 / var5 + arg2;
                class220.field3227 = class220.field3227 / var5 + arg3;
                class631.field8821 = class631.field8821 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field9668; var7++) {
                this.field9671[var7] += arg1;
                this.field9772[var7] += arg2;
                this.field9686[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field9668; var8++) {
                this.field9671[var8] -= class631.field8821;
                this.field9772[var8] -= class264.field3781;
                this.field9686[var8] -= class220.field3227;
                if (arg3 != 0) {
                    int var9 = class373.field5548[arg3];
                    int var10 = class373.field5549[arg3];
                    int var11 = this.field9772[var8] * var9 + this.field9671[var8] * var10 + 16383 >> 14;
                    this.field9772[var8] = this.field9772[var8] * var10 + 16383 - (this.field9671[var8] * var9) >> 14;
                    this.field9671[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class373.field5548[arg1];
                    int var13 = class373.field5549[arg1];
                    int var14 = this.field9772[var8] * var13 + (16383 - (this.field9686[var8] * var12)) >> 14;
                    this.field9686[var8] = this.field9772[var8] * var12 - (-(this.field9686[var8] * var13) - 16383) >> 14;
                    this.field9772[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class373.field5548[arg2];
                    int var16 = class373.field5549[arg2];
                    int var17 = this.field9686[var8] * var15 + (this.field9671[var8] * var16) + 16383 >> 14;
                    this.field9686[var8] = this.field9686[var8] * var16 + 16383 - (this.field9671[var8] * var15) >> 14;
                    this.field9671[var8] = var17;
                }
                this.field9671[var8] += class631.field8821;
                this.field9772[var8] += class264.field3781;
                this.field9686[var8] += class220.field3227;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field9668; var18++) {
                this.field9671[var18] -= class631.field8821;
                this.field9772[var18] -= class264.field3781;
                this.field9686[var18] -= class220.field3227;
                this.field9671[var18] = this.field9671[var18] * arg1 / 128;
                this.field9772[var18] = this.field9772[var18] * arg2 / 128;
                this.field9686[var18] = this.field9686[var18] * arg3 / 128;
                this.field9671[var18] += class631.field8821;
                this.field9772[var18] += class264.field3781;
                this.field9686[var18] += class220.field3227;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field9748; var19++) {
                int var23 = (this.field9727[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field9727[var19] = (byte) var23;
            }
            if (this.field9720 != null) {
                for (int var20 = 0; var20 < this.field9745; var20++) {
                    class228 var21 = this.field9720[var20];
                    class551 var22 = this.field9698[var20];
                    var22.field7856 = 255 - (this.field9727[var21.field3359] & 0xFF) << 24 | var22.field7856 & 0xFFFFFF;
                }
            }
            this.method3986((byte) 90);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field9748; var24++) {
                int var28 = this.field9706[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3E0) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = var29 + arg1 & 0x3F;
                int var34 = arg3 + var31;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field9706[var24] = (short) class625.method3600(var34, class625.method3600(var32 << 7, var33 << 10));
            }
            if (this.field9720 != null) {
                for (int var25 = 0; var25 < this.field9745; var25++) {
                    class228 var26 = this.field9720[var25];
                    class551 var27 = this.field9698[var25];
                    var27.field7856 = class324.field4632[this.field9706[var26.field3359] & 0xFFFF] & 0xFFFFFF | var27.field7856 & 0xFF000000;
                }
            }
            this.method3986((byte) 113);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field9745; var35++) {
                class551 var36 = this.field9698[var35];
                var36.field7861 += arg2;
                var36.field7855 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field9745; var37++) {
                class551 var38 = this.field9698[var37];
                var38.field7854 = var38.field7854 * arg2 >> 7;
                var38.field7858 = var38.field7858 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field9745; var39++) {
                class551 var40 = this.field9698[var39];
                var40.field7860 = var40.field7860 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "FA", descriptor = "(I)V", line = 3391)
    public final void method243(int arg0) {
        field9658++;
        int var2 = class373.field5548[arg0];
        int var3 = class373.field5549[arg0];
        for (int var4 = 0; var4 < this.field9668; var4++) {
            int var5 = this.field9772[var4] * var3 - (this.field9686[var4] * var2) >> 14;
            this.field9686[var4] = this.field9772[var4] * var2 + this.field9686[var4] * var3 >> 14;
            this.field9772[var4] = var5;
        }
        this.method3988(-104926648);
        this.field9708 = false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 3420)
    public final void method257(int arg0) {
        field9765++;
        int var2 = class373.field5548[arg0];
        int var3 = class373.field5549[arg0];
        for (int var4 = 0; var4 < this.field9668; var4++) {
            int var5 = this.field9686[var4] * var2 + this.field9671[var4] * var3 >> 14;
            this.field9686[var4] = this.field9686[var4] * var3 - (this.field9671[var4] * var2) >> 14;
            this.field9671[var4] = var5;
        }
        this.method3988(-104926648);
        this.field9708 = false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 3448)
    private final void method3981(byte arg0) {
        if (this.field9720 != null) {
            this.field9715.method463(!this.field9693);
            this.field9715.method2336(0, false);
            this.field9715.method2329(1, (byte) -126, class469.field6850);
            this.field9715.method2407(1, class469.field6850, 57);
            for (int var2 = 0; var2 < this.field9745; var2++) {
                class228 var3 = this.field9720[var2];
                class551 var4 = this.field9698[var2];
                if (!var3.field3343 || !this.field9715.method441()) {
                    float var5 = (float) (this.field9671[var3.field3357] + this.field9671[var3.field3344] + this.field9671[var3.field3350]) * 0.3333333F;
                    float var6 = (float) (this.field9772[var3.field3357] + this.field9772[var3.field3344] + this.field9772[var3.field3350]) * 0.3333333F;
                    float var7 = (float) (this.field9686[var3.field3350] + this.field9686[var3.field3344] + this.field9686[var3.field3357]) * 0.3333333F;
                    float var8 = class98.field1378 * var7 + class71.field1006 * var5 + class28.field275 * var6 + class387.field5840;
                    float var9 = class391.field5888 * var7 + class542.field7729 * var5 + class381.field5750 * var6 + class430.field6437;
                    float var10 = class571.field8084 * var7 + class551.field7852 * var5 + class458.field6751 * var6 + class382.field5765;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9))) * (float) var3.field3356;
                    class441 var12 = this.field9715.method2334((byte) 69);
                    var12.method2737((float) var4.field7861 + var9 - var9 * var11, var10 - var10 * var11, var3.field3355 * var4.field7858 >> 7, var4.field7860, false, (float) var4.field7855 + var8 - var8 * var11, var3.field3358 * var4.field7854 >> 7);
                    var12.method2718(this.field9715.field5543, 126);
                    this.field9715.method2406(true);
                    int var13 = var4.field7856;
                    this.field9715.method2398(false, false, false, var3.field3348);
                    this.field9715.method2405(var3.field3342, 124);
                    this.field9715.method2415(var13, 0);
                    this.field9715.method2422(-25804);
                }
            }
            this.field9715.method2407(1, class328.field4670, 86);
            this.field9715.method2329(1, (byte) -128, class328.field4670);
            this.field9715.method463(true);
        }
        field9673++;
        if (arg0 >= -44) {
            this.method262();
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V", line = 3510)
    private final void method3982(byte arg0) {
        field9740++;
        if (!this.field9747) {
            return;
        }
        this.field9747 = false;
        if (this.field9762 == null && this.field9712 == null && this.field9720 == null) {
            if (this.field9671 != null && !class660.method3805(this.field9782, -53, this.field9752)) {
                if (this.field9742 == null || this.field9742.method926(65)) {
                    if (!this.field9708) {
                        this.method3977(arg0 - 645696391);
                    }
                    this.field9671 = null;
                } else {
                    this.field9747 = true;
                }
            }
            if (this.field9772 != null && !class642.method3679(this.field9752, -87, this.field9782)) {
                if (this.field9742 == null || this.field9742.method926(65)) {
                    if (!this.field9708) {
                        this.method3977(-645696473);
                    }
                    this.field9772 = null;
                } else {
                    this.field9747 = true;
                }
            }
            if (this.field9686 != null && !class461.method2810((byte) 34, this.field9782, this.field9752)) {
                if (this.field9742 == null || this.field9742.method926(arg0 + 147)) {
                    if (!this.field9708) {
                        this.method3977(-645696473);
                    }
                    this.field9686 = null;
                } else {
                    this.field9747 = true;
                }
            }
        }
        if (this.field9664 != null && this.field9671 == null && this.field9772 == null && this.field9686 == null) {
            this.field9664 = null;
            this.field9729 = null;
        }
        if (this.field9710 != null && !class514.method3038(0, this.field9752, this.field9782)) {
            label204: {
                label203: {
                    boolean var10000;
                    if ((this.field9752 & 0x37) == 0) {
                        if (this.field9753 == null || this.field9753.method926(arg0 ^ 0xFFFFFFEF)) {
                            break label203;
                        }
                        var10000 = false;
                    } else {
                        if (this.field9780 == null || this.field9780.method926(65)) {
                            break label203;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field9747 = true;
                        break label204;
                    }
                }
                this.field9710 = null;
                this.field9691 = this.field9741 = this.field9739 = null;
            }
        }
        if (this.field9706 != null && !class577.method3338(this.field9782, this.field9752, 0)) {
            if (this.field9753 == null || this.field9753.method926(65)) {
                this.field9706 = null;
            } else {
                this.field9747 = true;
            }
        }
        if (this.field9727 != null && !class475.method2865(255, this.field9752, this.field9782)) {
            if (this.field9753 == null || this.field9753.method926(65)) {
                this.field9727 = null;
            } else {
                this.field9747 = true;
            }
        }
        if (arg0 != -82) {
            this.method277(125, -121, null, true, 62);
        }
        if (this.field9758 != null && !class501.method2980(arg0 ^ 0xFFFFE528, this.field9782, this.field9752)) {
            if (this.field9731 == null || this.field9731.method926(65)) {
                this.field9758 = this.field9781 = null;
            } else {
                this.field9747 = true;
            }
        }
        if (this.field9750 != null && !class99.method762((byte) -94, this.field9782, this.field9752)) {
            if (this.field9753 == null || this.field9753.method926(65)) {
                this.field9750 = null;
            } else {
                this.field9747 = true;
            }
        }
        if (this.field9676 != null && !class143.method990(this.field9782, this.field9752, 0)) {
            if ((this.field9717 == null || this.field9717.method1107((byte) -44)) && (this.field9753 == null || this.field9753.method926(65))) {
                this.field9676 = this.field9714 = this.field9726 = null;
            } else {
                this.field9747 = true;
            }
        }
        if (this.field9746 != null) {
            if (this.field9742 == null || this.field9742.method926(65)) {
                this.field9746 = null;
            } else {
                this.field9747 = true;
            }
        }
        if (this.field9749 != null) {
            if (this.field9753 == null || this.field9753.method926(65)) {
                this.field9749 = null;
            } else {
                this.field9747 = true;
            }
        }
        if (this.field9768 != null && !class755.method4206(this.field9782, 116, this.field9752)) {
            this.field9768 = null;
            this.field9701 = null;
        }
        if (this.field9776 != null && !class201.method1379((byte) -2, this.field9782, this.field9752)) {
            this.field9776 = null;
            this.field9723 = null;
        }
        if (this.field9684 != null && !class453.method2777(this.field9752, arg0 + 208, this.field9782)) {
            this.field9684 = null;
        }
        if (this.field9763 != null && (this.field9782 & 0x800) == 0 && (this.field9782 & 0x40000) == 0) {
            this.field9779 = null;
            this.field9670 = null;
            this.field9763 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "EA", descriptor = "()I", line = 3690)
    public final int method236() {
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        field9770++;
        return this.field9728;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 3702)
    private final void method3983(int arg0) {
        if (arg0 == -13666) {
            field9733++;
            if (this.field9717 != null) {
                this.field9717.field2322 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "wa", descriptor = "()V", line = 3716)
    public final void method241() {
        for (int var1 = 0; var1 < this.field9725; var1++) {
            this.field9671[var1] = this.field9671[var1] + 7 >> 4;
            this.field9772[var1] = this.field9772[var1] + 7 >> 4;
            this.field9686[var1] = this.field9686[var1] + 7 >> 4;
        }
        field9767++;
        this.method3988(-104926648);
        this.field9708 = false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lka;IIIZ)V", line = 3739)
    public final void method264(class473 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9722++;
        class701 var6 = (class701) arg0;
        if (this.field9748 == 0 || var6.field9748 == 0) {
            return;
        }
        int var7 = var6.field9668;
        int[] var8 = var6.field9671;
        int[] var9 = var6.field9772;
        int[] var10 = var6.field9686;
        short[] var11 = var6.field9691;
        short[] var12 = var6.field9741;
        short[] var13 = var6.field9739;
        byte[] var14 = var6.field9710;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field9672 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var18 = this.field9672.field10115;
            var15 = this.field9672.field10117;
            var17 = this.field9672.field10122;
            var16 = this.field9672.field10119;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field9672 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field9672.field10117;
            var20 = var6.field9672.field10119;
            var19 = var6.field9672.field10122;
            var22 = var6.field9672.field10115;
        }
        int[] var23 = var6.field9729;
        short[] var24 = var6.field9664;
        if (!var6.field9708) {
            var6.method3977(-645696473);
        }
        int var25 = var6.field9677;
        int var26 = var6.field9728;
        int var27 = var6.field9759;
        int var28 = var6.field9769;
        int var29 = var6.field9716;
        int var30 = var6.field9699;
        for (int var31 = 0; var31 < this.field9668; var31++) {
            int var32 = this.field9772[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field9671[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field9686[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field9729[var31];
                        int var37 = this.field9729[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field9664[var38] - 1;
                            if (var35 == -1 || this.field9710[var35] != 0) {
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
                                        if (var17 == null) {
                                            this.field9672 = new class725();
                                            var17 = this.field9672.field10122 = class304.method1918(this.field9691, -980740478);
                                            var15 = this.field9672.field10117 = class304.method1918(this.field9741, -980740478);
                                            var16 = this.field9672.field10119 = class304.method1918(this.field9739, -980740478);
                                            var18 = this.field9672.field10115 = class510.method3021(this.field9710, -128);
                                        }
                                        if (var19 == null) {
                                            class725 var44 = var6.field9672 = new class725();
                                            var19 = var44.field10122 = class304.method1918(var11, -980740478);
                                            var21 = var44.field10117 = class304.method1918(var12, -980740478);
                                            var20 = var44.field10119 = class304.method1918(var13, -980740478);
                                            var22 = var44.field10115 = class510.method3021(var14, -120);
                                        }
                                        short var45 = this.field9691[var35];
                                        short var46 = this.field9741[var35];
                                        short var47 = this.field9739[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field9710[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var21[var52] += var46;
                                                var20[var52] += var47;
                                                var22[var52] += var50;
                                            }
                                        }
                                        short var53 = var13[var42];
                                        int var54 = this.field9729[var31];
                                        int var55 = this.field9729[var31 + 1];
                                        short var56 = var11[var42];
                                        short var57 = var12[var42];
                                        byte var58 = var14[var42];
                                        for (int var59 = var54; var59 < var55; var59++) {
                                            int var60 = this.field9664[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var17[var60] += var56;
                                                var15[var60] += var57;
                                                var16[var60] += var53;
                                                var18[var60] += var58;
                                            }
                                        }
                                        var6.method3984(-9714);
                                        this.method3984(-9714);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "()I", line = 3997)
    public final int method250() {
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        field9771++;
        return this.field9699;
    }

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "(III)V", line = 4009)
    public final void method286(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field9668; var4++) {
            if (arg0 != 128) {
                this.field9671[var4] = this.field9671[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field9772[var4] = this.field9772[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field9686[var4] = this.field9686[var4] * arg2 >> 7;
            }
        }
        field9667++;
        this.method3988(-104926648);
        this.field9708 = false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILql;ZI)Z", line = 4050)
    public final boolean method277(int arg0, int arg1, class738 arg2, boolean arg3, int arg4) {
        field9760++;
        return this.method3980(arg1, arg0, (byte) 109, arg2, arg3, -1, arg4);
    }

    @OriginalMember(owner = "client!ic", name = "fa", descriptor = "()I", line = 4058)
    public final int method253() {
        field9655++;
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        return this.field9677;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V", line = 4071)
    private final void method3984(int arg0) {
        if ((this.field9752 & 0x37) == 0) {
            if (this.field9753 != null) {
                this.field9753.field1747 = false;
            }
        } else if (this.field9780 != null) {
            this.field9780.field1747 = false;
        }
        if (arg0 == -9714) {
            field9665++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "da", descriptor = "()I", line = 4099)
    public final int method268() {
        field9696++;
        return this.field9766;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lwu;IIZZ)V", line = 6287)
    public class701(class373 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field9668 = 0;
        this.field9683 = false;
        this.field9693 = false;
        this.field9659 = 0;
        this.field9732 = false;
        this.field9708 = false;
        this.field9725 = 0;
        this.field9703 = 0;
        this.field9748 = 0;
        this.field9747 = true;
        this.field9752 = arg2;
        this.field9715 = arg0;
        this.field9782 = arg1;
        this.field9683 = arg4;
        if (arg3 || class741.method4149(this.field9782, this.field9752, 1)) {
            this.field9742 = new class130(class530.method3102(this.field9752, this.field9782, 109));
        }
        if (arg3 || class201.method1381(this.field9752, this.field9782, -123)) {
            this.field9731 = new class130(class33.method163(this.field9752, this.field9782, 544));
        }
        if (arg3 || class585.method3385(this.field9782, (byte) 116, this.field9752)) {
            this.field9753 = new class130(class348.method2206(this.field9782, this.field9752, 55));
        }
        if (arg3 || class385.method2479(this.field9782, (byte) 8, this.field9752)) {
            this.field9780 = new class130(class456.method2790(this.field9752, -6, this.field9782));
        }
        if (arg3 || class262.method1693(this.field9752, (byte) -31, this.field9782)) {
            this.field9717 = new class149(class96.method749(true, this.field9782, this.field9752));
        }
    }

    @OriginalMember(owner = "client!ic", name = "ua", descriptor = "()I", line = 4130)
    public final int method255() {
        field9692++;
        return this.field9782;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()[Lwr;", line = 4139)
    public final class459[] method266() {
        field9678++;
        return this.field9762;
    }

    @OriginalMember(owner = "client!ic", name = "NA", descriptor = "()Z", line = 4147)
    public final boolean method273() {
        field9685++;
        if (this.field9776 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field9725; var1++) {
            this.field9671[var1] <<= 0x4;
            this.field9772[var1] <<= 0x4;
            this.field9686[var1] <<= 0x4;
        }
        class631.field8821 = 0;
        class220.field3227 = 0;
        class264.field3781 = 0;
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILwga;)V", line = 4175)
    private final void method3985(int arg0, class750 arg1) {
        if (this.field9703 > class390.field5878.length) {
            class390.field5878 = new int[this.field9703];
            class679.field9438 = new int[this.field9703];
        }
        field9711++;
        for (int var3 = 0; var3 < this.field9668; var3++) {
            int var15 = (this.field9671[var3] - (this.field9772[var3] * this.field9715.field5628 >> 8) >> this.field9715.field5551) - arg1.field10487;
            int var16 = (this.field9686[var3] - (this.field9772[var3] * this.field9715.field5611 >> 8) >> this.field9715.field5551) - arg1.field10495;
            int var17 = this.field9729[var3];
            int var18 = this.field9729[var3 + 1];
            for (int var19 = var17; var19 < var18; var19++) {
                int var20 = this.field9664[var19] - 1;
                if (var20 == -1) {
                    break;
                }
                class390.field5878[var20] = var15;
                class679.field9438[var20] = var16;
            }
        }
        int var4 = 125 % ((-arg0 - 77) / 41);
        for (int var5 = 0; var5 < this.field9659; var5++) {
            if (this.field9727 == null || this.field9727[var5] <= 128) {
                short var6 = this.field9676[var5];
                short var7 = this.field9714[var5];
                short var8 = this.field9726[var5];
                int var9 = class390.field5878[var6];
                int var10 = class390.field5878[var7];
                int var11 = class390.field5878[var8];
                int var12 = class679.field9438[var6];
                int var13 = class679.field9438[var7];
                int var14 = class679.field9438[var8];
                if (((var9 - var10) * (var13 - var14) - (var11 - var10) * (var13 - var12)) > 0) {
                    arg1.method4188(var9, var14, var13, true, var12, var11, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "()V", line = 4258)
    public final void method260() {
        field9777++;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V", line = 4265)
    private final void method3986(byte arg0) {
        int var2 = 25 / ((50 - arg0) / 38);
        field9773++;
        if (this.field9753 != null) {
            this.field9753.field1747 = false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "ia", descriptor = "(SS)V", line = 4280)
    public final void method259(short arg0, short arg1) {
        field9743++;
        for (int var3 = 0; var3 < this.field9748; var3++) {
            if (this.field9706[var3] == arg0) {
                this.field9706[var3] = arg1;
            }
        }
        if (this.field9720 != null) {
            for (int var4 = 0; var4 < this.field9745; var4++) {
                class228 var5 = this.field9720[var4];
                class551 var6 = this.field9698[var4];
                var6.field7856 = var6.field7856 & 0xFF000000 | class324.field4632[this.field9706[var5.field3359] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method3986((byte) 121);
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "()Z", line = 4326)
    public final boolean method284() {
        field9724++;
        if (this.field9750 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field9750.length; var1++) {
            if (this.field9750[var1] != -1 && !this.field9715.field849.method1121(-30695, this.field9750[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIII)Z", line = 4357)
    private final boolean method3987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9756++;
        if (arg7 > arg4 && arg2 > arg4 && arg4 < arg8) {
            return false;
        } else if (arg7 < arg4 && arg2 < arg4 && arg8 < arg4) {
            return false;
        } else if (arg0 < arg6 && arg5 > arg0 && arg1 > arg0) {
            return false;
        } else if (arg3 == 10542) {
            return arg6 >= arg0 || arg5 >= arg0 || arg0 <= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILql;ZII)Z", line = 4382)
    public final boolean method283(int arg0, int arg1, class738 arg2, boolean arg3, int arg4, int arg5) {
        field9682++;
        return this.method3980(arg1, arg0, (byte) 109, arg2, arg3, arg5, arg4);
    }

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "(I)V", line = 4390)
    public final void method247(int arg0) {
        field9688++;
        int var2 = class373.field5548[arg0];
        int var3 = class373.field5549[arg0];
        for (int var4 = 0; var4 < this.field9668; var4++) {
            int var7 = this.field9686[var4] * var2 + (this.field9671[var4] * var3) >> 14;
            this.field9686[var4] = this.field9686[var4] * var3 - (this.field9671[var4] * var2) >> 14;
            this.field9671[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field9703; var5++) {
            int var6 = this.field9739[var5] * var2 + (this.field9691[var5] * var3) >> 14;
            this.field9739[var5] = (short) (this.field9739[var5] * var3 - (this.field9691[var5] * var2) >> 14);
            this.field9691[var5] = (short) var6;
        }
        this.method3988(-104926648);
        this.method3984(-9714);
        this.field9708 = false;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V", line = 4435)
    private final void method3988(int arg0) {
        if (this.field9742 != null) {
            this.field9742.field1747 = false;
        }
        if (arg0 != -104926648) {
            this.field9772 = null;
        }
        field9721++;
    }

    @OriginalMember(owner = "client!ic", name = "HA", descriptor = "()I", line = 4455)
    public final int method246() {
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        field9690++;
        return this.field9716;
    }

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "(I[IIIIZI[I)V", line = 4467)
    public final void method278(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field9755++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            class631.field8821 = 0;
            class264.field3781 = 0;
            class220.field3227 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field9776.length) {
                    int[] var16 = this.field9776[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field9723 == null || (arg6 & this.field9723[var18]) != 0) {
                            class631.field8821 += this.field9671[var18];
                            class264.field3781 += this.field9772[var18];
                            var13++;
                            class220.field3227 += this.field9686[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class631.field8821 = var10;
                class264.field3781 = var11;
                class220.field3227 = var12;
            } else {
                class118.field1618 = true;
                class264.field3781 = class264.field3781 / var13 + var11;
                class220.field3227 = class220.field3227 / var13 + var12;
                class631.field8821 = class631.field8821 / var13 + var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + (arg7[4] * arg3 + (arg7[5] * arg4)) + 8192 >> 14;
                int var21 = arg7[6] * arg2 + arg7[7] * arg3 + (arg7[8] * arg4) + 8192 >> 14;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field9776.length) {
                    int[] var27 = this.field9776[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field9723 == null || (arg6 & this.field9723[var29]) != 0) {
                            this.field9671[var29] += var23;
                            this.field9772[var29] += var24;
                            this.field9686[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field9776.length > var109) {
                        int[] var110 = this.field9776[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field9723 == null || (arg6 & this.field9723[var112]) != 0) {
                                this.field9671[var112] -= class631.field8821;
                                this.field9772[var112] -= class264.field3781;
                                this.field9686[var112] -= class220.field3227;
                                if (arg4 != 0) {
                                    int var113 = class373.field5548[arg4];
                                    int var114 = class373.field5549[arg4];
                                    int var115 = this.field9772[var112] * var113 + this.field9671[var112] * var114 + 16383 >> 14;
                                    this.field9772[var112] = this.field9772[var112] * var114 + 16383 - this.field9671[var112] * var113 >> 14;
                                    this.field9671[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class373.field5548[arg2];
                                    int var117 = class373.field5549[arg2];
                                    int var118 = this.field9772[var112] * var117 + 16383 - (this.field9686[var112] * var116) >> 14;
                                    this.field9686[var112] = this.field9772[var112] * var116 + this.field9686[var112] * var117 + 16383 >> 14;
                                    this.field9772[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class373.field5548[arg3];
                                    int var120 = class373.field5549[arg3];
                                    int var121 = this.field9686[var112] * var119 + this.field9671[var112] * var120 + 16383 >> 14;
                                    this.field9686[var112] = this.field9686[var112] * var120 + 16383 - (this.field9671[var112] * var119) >> 14;
                                    this.field9671[var112] = var121;
                                }
                                this.field9671[var112] += class631.field8821;
                                this.field9772[var112] += class264.field3781;
                                this.field9686[var112] += class220.field3227;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field9776.length) {
                            int[] var93 = this.field9776[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field9723 == null || (this.field9723[var95] & arg6) != 0) {
                                    int var96 = this.field9729[var95];
                                    int var97 = this.field9729[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field9664[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class373.field5548[arg4];
                                            int var101 = class373.field5549[arg4];
                                            int var102 = this.field9741[var99] * var100 + (this.field9691[var99] * var101) + 16383 >> 14;
                                            this.field9741[var99] = (short) (this.field9741[var99] * var101 + 16383 - (this.field9691[var99] * var100) >> 14);
                                            this.field9691[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class373.field5548[arg2];
                                            int var104 = class373.field5549[arg2];
                                            int var105 = this.field9741[var99] * var104 + 16383 - (this.field9739[var99] * var103) >> 14;
                                            this.field9739[var99] = (short) (this.field9739[var99] * var104 + this.field9741[var99] * var103 + 16383 >> 14);
                                            this.field9741[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class373.field5548[arg3];
                                            int var107 = class373.field5549[arg3];
                                            int var108 = this.field9739[var99] * var106 + this.field9691[var99] * var107 + 16383 >> 14;
                                            this.field9739[var99] = (short) (this.field9739[var99] * var107 + 16383 - (this.field9691[var99] * var106) >> 14);
                                            this.field9691[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method3984(-9714);
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class118.field1618) {
                    int var36 = arg7[0] * class631.field8821 + arg7[6] * class220.field3227 + arg7[3] * class264.field3781 + 8192 >> 14;
                    int var37 = arg7[7] * class220.field3227 + arg7[4] * class264.field3781 + arg7[1] * class631.field8821 + 8192 >> 14;
                    int var38 = arg7[8] * class220.field3227 + arg7[2] * class631.field8821 + (arg7[5] * class264.field3781) + 8192 >> 14;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    class631.field8821 = var39;
                    class264.field3781 = var40;
                    class220.field3227 = var41;
                    class118.field1618 = false;
                }
                int[] var42 = new int[9];
                int var43 = class373.field5549[arg2];
                int var44 = class373.field5548[arg2];
                int var45 = class373.field5549[arg3];
                int var46 = class373.field5548[arg3];
                int var47 = class373.field5549[arg4];
                int var48 = class373.field5548[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[7] = var46 * var48 + var45 * var49 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[0] = var46 * var50 + (var45 * var47 + 8192) >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                int var51 = var42[2] * -class220.field3227 + var42[1] * -class264.field3781 + (var42[0] * -class631.field8821 - -8192) >> 14;
                int var52 = var42[4] * -class264.field3781 + var42[3] * -class631.field8821 + (var42[5] * -class220.field3227 - -8192) >> 14;
                int var53 = var42[6] * -class631.field8821 + (var42[8] * -class220.field3227) + var42[7] * -class264.field3781 + 8192 >> 14;
                int var54 = class631.field8821 + var51;
                int var55 = class264.field3781 + var52;
                int var56 = var53 + class220.field3227;
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
                int var59 = var42[0] * var33 - (-(var42[1] * var34) - (var42[2] * var35 + 8192)) >> 14;
                int var60 = var42[3] * var33 + 8192 - (-(var42[4] * var34) - var42[5] * var35) >> 14;
                int var61 = var54 + var59;
                int var62 = var55 + var60;
                int var63 = var42[6] * var33 + var42[7] * var34 + (var42[8] * var35 - -8192) >> 14;
                int var64 = var56 + var63;
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
                int var67 = arg7[2] * var64 + arg7[0] * var61 + arg7[1] * var62 + 8192 >> 14;
                int var68 = arg7[4] * var62 + arg7[3] * var61 + arg7[5] * var64 + 8192 >> 14;
                int var69 = var31 + var68;
                int var70 = var30 + var67;
                int var71 = arg7[8] * var64 + arg7[6] * var61 + (arg7[7] * var62) + 8192 >> 14;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field9776.length) {
                        int[] var75 = this.field9776[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field9723 == null || (arg6 & this.field9723[var77]) != 0) {
                                int var78 = this.field9772[var77] * var65[1] + this.field9671[var77] * var65[0] + this.field9686[var77] * var65[2] + 8192 >> 14;
                                int var79 = this.field9772[var77] * var65[4] + this.field9671[var77] * var65[3] - (-(this.field9686[var77] * var65[5]) + -8192) >> 14;
                                int var80 = var70 + var78;
                                int var81 = this.field9671[var77] * var65[6] + (this.field9772[var77] * var65[7]) + this.field9686[var77] * var65[8] + 8192 >> 14;
                                int var82 = var69 + var79;
                                this.field9671[var77] = var80;
                                int var83 = var72 + var81;
                                this.field9772[var77] = var82;
                                this.field9686[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field9776.length > var173) {
                        int[] var174 = this.field9776[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field9723 == null || (arg6 & this.field9723[var176]) != 0) {
                                this.field9671[var176] -= class631.field8821;
                                this.field9772[var176] -= class264.field3781;
                                this.field9686[var176] -= class220.field3227;
                                this.field9671[var176] = this.field9671[var176] * arg2 >> 7;
                                this.field9772[var176] = this.field9772[var176] * arg3 >> 7;
                                this.field9686[var176] = this.field9686[var176] * arg4 >> 7;
                                this.field9671[var176] += class631.field8821;
                                this.field9772[var176] += class264.field3781;
                                this.field9686[var176] += class220.field3227;
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
                if (class118.field1618) {
                    int var128 = arg7[3] * class264.field3781 + arg7[6] * class220.field3227 + arg7[0] * class631.field8821 + 8192 >> 14;
                    int var129 = arg7[1] * class631.field8821 + arg7[7] * class220.field3227 + arg7[4] * class264.field3781 + 8192 >> 14;
                    int var130 = var126 + var129;
                    int var131 = var125 + var128;
                    int var132 = arg7[2] * class631.field8821 + arg7[8] * class220.field3227 + arg7[5] * class264.field3781 + 8192 >> 14;
                    class631.field8821 = var131;
                    int var133 = var127 + var132;
                    class264.field3781 = var130;
                    class220.field3227 = var133;
                    class118.field1618 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class631.field8821 * var134 + 8192 >> 14;
                int var138 = -class264.field3781 * var135 + 8192 >> 14;
                int var139 = -class220.field3227 * var136 + 8192 >> 14;
                int var140 = class631.field8821 + var137;
                int var141 = var138 + class264.field3781;
                int var142 = class220.field3227 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var127 * var136 + 8192 >> 14;
                int var147 = var141 + var145;
                int var148 = var140 + var144;
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
                int var152 = arg7[0] * var148 + arg7[2] * var149 + (arg7[1] * var147) + 8192 >> 14;
                int var153 = arg7[3] * var148 + arg7[4] * var147 + arg7[5] * var149 + 8192 >> 14;
                int var154 = var123 + var153;
                int var155 = arg7[7] * var147 + arg7[6] * var148 + arg7[8] * var149 + 8192 >> 14;
                int var156 = var122 + var152;
                int var157 = var124 + var155;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field9776.length > var159) {
                        int[] var160 = this.field9776[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field9723 == null || (arg6 & this.field9723[var162]) != 0) {
                                int var163 = this.field9772[var162] * var150[1] + this.field9671[var162] * var150[0] + (this.field9686[var162] * var150[2]) + 8192 >> 14;
                                int var164 = this.field9772[var162] * var150[4] + this.field9686[var162] * var150[5] + this.field9671[var162] * var150[3] + 8192 >> 14;
                                int var165 = var156 + var163;
                                int var166 = var154 + var164;
                                int var167 = this.field9772[var162] * var150[7] + this.field9671[var162] * var150[6] - (-(this.field9686[var162] * var150[8]) - 8192) >> 14;
                                int var168 = var157 + var167;
                                this.field9671[var162] = var165;
                                this.field9772[var162] = var166;
                                this.field9686[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field9768 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (this.field9768.length > var182) {
                        int[] var183 = this.field9768[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field9701 == null || (arg6 & this.field9701[var185]) != 0) {
                                int var186 = (this.field9727[var185] & 0xFF) + (arg2 * 8);
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field9727[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field9720 != null) {
                        for (int var179 = 0; var179 < this.field9745; var179++) {
                            class228 var180 = this.field9720[var179];
                            class551 var181 = this.field9698[var179];
                            var181.field7856 = var181.field7856 & 0xFFFFFF | 255 - (this.field9727[var180.field3359] & 0xFF) << 24;
                        }
                    }
                    this.method3986((byte) -119);
                }
            }
        } else if (arg0 == 7) {
            if (this.field9768 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (var192 < this.field9768.length) {
                        int[] var193 = this.field9768[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field9701 == null || (this.field9701[var195] & arg6) != 0) {
                                int var196 = this.field9706[var195] & 0xFFFF;
                                int var197 = (var196 & 0xFC10) >> 10;
                                int var198 = var196 >> 7 & 0x7;
                                int var199 = var197 + arg2 & 0x3F;
                                int var200 = arg3 / 4 + var198;
                                int var201 = var196 & 0x7F;
                                int var202 = arg4 + var201;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 7) {
                                    var200 = 7;
                                }
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field9706[var195] = (short) class625.method3600(class625.method3600(var200 << 7, var199 << 10), var202);
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field9720 != null) {
                        for (int var189 = 0; var189 < this.field9745; var189++) {
                            class228 var190 = this.field9720[var189];
                            class551 var191 = this.field9698[var189];
                            var191.field7856 = class324.field4632[this.field9706[var190.field3359] & 0xFFFF] & 0xFFFFFF | var191.field7856 & 0xFF000000;
                        }
                    }
                    this.method3986((byte) 104);
                }
            }
        } else if (arg0 == 8) {
            if (this.field9684 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (var204 < this.field9684.length) {
                        int[] var205 = this.field9684[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class551 var207 = this.field9698[var205[var206]];
                            var207.field7855 += arg2;
                            var207.field7861 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field9684 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (this.field9684.length > var209) {
                        int[] var210 = this.field9684[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class551 var212 = this.field9698[var210[var211]];
                            var212.field7858 = var212.field7858 * arg2 >> 7;
                            var212.field7854 = var212.field7854 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field9684 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (this.field9684.length > var214) {
                    int[] var215 = this.field9684[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class551 var217 = this.field9698[var215[var216]];
                        var217.field7860 = var217.field7860 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "()Z", line = 5447)
    public final boolean method262() {
        field9666++;
        return this.field9732;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()V", line = 5460)
    public final void method272() {
        field9707++;
        if (this.field9703 > 0 && this.field9659 > 0) {
            this.method3991(0);
            this.method3979(true);
            this.method3982((byte) -82);
        }
    }

    @OriginalMember(owner = "client!ic", name = "WA", descriptor = "()I", line = 5475)
    public final int method263() {
        field9680++;
        return this.field9709;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(FIJFIIIIIILdh;)S", line = 5485)
    private final short method3989(float arg0, int arg1, long arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class322 arg10) {
        field9660++;
        int var13 = this.field9729[arg4];
        int var14 = this.field9729[arg4 + 1];
        int var15 = 0;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field9664[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class297.field4214[var16] == arg2) {
                return (short) (var17 - 1);
            }
        }
        if (arg8 != -8834) {
            this.field9693 = false;
        }
        this.field9664[var15] = (short) (this.field9703 + 1);
        class297.field4214[var15] = arg2;
        this.field9749[this.field9703] = (short) arg7;
        this.field9746[this.field9703] = (short) arg4;
        this.field9691[this.field9703] = (short) arg9;
        this.field9741[this.field9703] = (short) arg1;
        this.field9739[this.field9703] = (short) arg5;
        this.field9710[this.field9703] = (byte) arg6;
        this.field9758[this.field9703] = arg0;
        this.field9781[this.field9703] = arg3;
        return (short) (this.field9703++);
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V", line = 5544)
    private final void method3990(int arg0) {
        field9734++;
        if (this.field9659 == 0) {
            return;
        }
        if (this.method3991(0) && this.method3979(true)) {
            this.field9715.method2389(0, (byte) -64, this.field9742.field1743);
            this.field9715.method2389(1, (byte) -64, this.field9753.field1743);
            this.field9715.method2389(2, (byte) -64, this.field9731.field1743);
            boolean var2;
            if ((this.field9752 & 0x37) == 0) {
                var2 = false;
                this.field9715.method2336(arg0 ^ 0xFFFFBEFC, false);
                this.field9715.method2368(this.field9715.field5666, (byte) 85);
            } else {
                var2 = true;
                this.field9715.method2336(0, true);
                this.field9715.method2389(3, (byte) -64, this.field9780.field1743);
                this.field9715.method2368(this.field9715.field5660, (byte) 127);
            }
            for (int var3 = 0; var3 < this.field9779.length; var3++) {
                int var4 = this.field9763[var3];
                int var5 = this.field9763[var3 + 1];
                int var6 = this.field9750[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field9715.method2398(false, true, var2, var6);
                this.field9715.method2325(var5 - var4, var4 * 3, this.field9670[var3], this.field9779[var3], this.field9717.field2325, -8, class506.field7196);
            }
        }
        if (arg0 != -16644) {
            this.field9716 = -103;
        }
        this.method3982((byte) -82);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lql;Leda;II)V", line = 5607)
    public final void method235(class738 arg0, class102 arg1, int arg2, int arg3) {
        field9697++;
        if (this.field9703 == 0) {
            return;
        }
        class441 var5 = this.field9715.field5542;
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        class441 var6 = (class441) arg0;
        class382.field5765 = var5.field6541 * var6.field6526 + var5.field6573 * var6.field6568 + var5.field6532 * var6.field6531 + var5.field6526;
        class458.field6751 = var5.field6541 * var6.field6532 + var5.field6573 * var6.field6530 + var5.field6532 * var6.field6538;
        float var7 = (float) this.field9677 * class458.field6751 + class382.field5765;
        float var8 = (float) this.field9728 * class458.field6751 + class382.field5765;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var9 = (float) (-this.field9719) + var8;
            var10 = (float) this.field9719 + var7;
        } else {
            var9 = (float) (-this.field9719) + var7;
            var10 = (float) this.field9719 + var8;
        }
        if ((this.field9715.field5560 <= var9) || (var10 <= (float) this.field9715.field5600)) {
            return;
        }
        class387.field5840 = var5.field6535 * var6.field6526 + var5.field6534 * var6.field6568 + var5.field6530 * var6.field6531 + var5.field6568;
        class28.field275 = var5.field6535 * var6.field6532 + var5.field6534 * var6.field6530 + var5.field6530 * var6.field6538;
        float var11 = (float) this.field9677 * class28.field275 + class387.field5840;
        float var12 = (float) this.field9728 * class28.field275 + class387.field5840;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) this.field9719 + var11) * (float) this.field9715.field5571;
            var14 = (var12 - (float) this.field9719) * (float) this.field9715.field5571;
        } else {
            var13 = ((float) this.field9719 + var12) * (float) this.field9715.field5571;
            var14 = ((float) (-this.field9719) + var11) * (float) this.field9715.field5571;
        }
        if ((this.field9715.field5618 <= var14 / (float) arg2) || (this.field9715.field5632 >= var13 / (float) arg2)) {
            return;
        }
        class430.field6437 = var5.field6565 * var6.field6526 + var5.field6540 * var6.field6568 + var5.field6538 * var6.field6531 + var5.field6531;
        class381.field5750 = var5.field6565 * var6.field6532 + var5.field6540 * var6.field6530 + var5.field6538 * var6.field6538;
        float var15 = (float) this.field9677 * class381.field5750 + class430.field6437;
        float var16 = (float) this.field9728 * class381.field5750 + class430.field6437;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = ((float) this.field9719 + var15) * (float) this.field9715.field5561;
            var17 = (var16 - (float) this.field9719) * (float) this.field9715.field5561;
        } else {
            var17 = ((float) (-this.field9719) + var15) * (float) this.field9715.field5561;
            var18 = ((float) this.field9719 + var16) * (float) this.field9715.field5561;
        }
        if ((var17 / (float) arg2 >= this.field9715.field5615) || (var18 / (float) arg2 <= this.field9715.field5563)) {
            return;
        }
        if (arg1 != null || this.field9720 != null) {
            class571.field8084 = var5.field6541 * var6.field6541 + var5.field6573 * var6.field6535 + var5.field6532 * var6.field6565;
            class391.field5888 = var5.field6565 * var6.field6541 + var5.field6540 * var6.field6535 + var5.field6538 * var6.field6565;
            class551.field7852 = var5.field6541 * var6.field6573 + var5.field6573 * var6.field6534 + var5.field6532 * var6.field6540;
            class71.field1006 = var5.field6535 * var6.field6573 + var5.field6534 * var6.field6534 + var5.field6530 * var6.field6540;
            class542.field7729 = var5.field6565 * var6.field6573 + var5.field6540 * var6.field6534 + var5.field6538 * var6.field6540;
            class98.field1378 = var5.field6535 * var6.field6541 + var5.field6534 * var6.field6535 + var5.field6530 * var6.field6565;
        }
        if (arg1 != null) {
            int var19 = this.field9759 + this.field9769 >> 1;
            int var20 = this.field9716 + this.field9699 >> 1;
            int var21 = (int) ((float) var20 * class98.field1378 + (float) this.field9677 * class28.field275 + (float) var19 * class71.field1006 + class387.field5840);
            int var22 = (int) ((float) var20 * class391.field5888 + (float) this.field9677 * class381.field5750 + (float) var19 * class542.field7729 + class430.field6437);
            int var23 = (int) ((float) var20 * class571.field8084 + (float) this.field9677 * class458.field6751 + (float) var19 * class551.field7852 + class382.field5765);
            int var24 = (int) ((float) var20 * class98.field1378 + (float) this.field9728 * class28.field275 + (float) var19 * class71.field1006 + class387.field5840);
            int var25 = (int) ((float) var20 * class391.field5888 + (float) this.field9728 * class381.field5750 + (float) var19 * class542.field7729 + class430.field6437);
            int var26 = (int) ((float) var20 * class571.field8084 + (float) this.field9728 * class458.field6751 + (float) var19 * class551.field7852 + class382.field5765);
            arg1.field1434 = this.field9715.field5561 * var25 / arg2 + this.field9715.field5588;
            arg1.field1432 = this.field9715.field5572 + (this.field9715.field5571 * var21 / arg2);
            arg1.field1433 = this.field9715.field5571 * var24 / arg2 + this.field9715.field5572;
            arg1.field1431 = this.field9715.field5588 + (this.field9715.field5561 * var22 / arg2);
            if (var23 >= this.field9715.field5600 || this.field9715.field5600 <= var26) {
                arg1.field1430 = true;
                arg1.field1429 = (this.field9719 + var21) * this.field9715.field5571 / arg2 + this.field9715.field5572 - arg1.field1432;
            }
        }
        this.field9715.method2293((float) arg2, 111);
        this.field9715.method2382(2);
        this.field9715.method2328((byte) 127, var6);
        this.method3990(-16644);
        this.method3981((byte) -106);
    }

    @OriginalMember(owner = "client!ic", name = "ma", descriptor = "()I", line = 5764)
    public final int method269() {
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        field9679++;
        return this.field9730;
    }

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "()V", line = 5778)
    public final void method240() {
        for (int var1 = 0; var1 < this.field9668; var1++) {
            this.field9686[var1] = -this.field9686[var1];
        }
        field9774++;
        for (int var2 = 0; var2 < this.field9703; var2++) {
            this.field9739[var2] = (short) (-this.field9739[var2]);
        }
        for (int var3 = 0; var3 < this.field9748; var3++) {
            short var4 = this.field9676[var3];
            this.field9676[var3] = this.field9726[var3];
            this.field9726[var3] = var4;
        }
        this.method3988(-104926648);
        this.method3984(-9714);
        this.method3983(-13666);
        this.field9708 = false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lql;Leda;I)V", line = 5820)
    public final void method265(class738 arg0, class102 arg1, int arg2) {
        field9718++;
        if (this.field9703 == 0) {
            return;
        }
        class441 var4 = this.field9715.field5542;
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        class441 var5 = (class441) arg0;
        class458.field6751 = var4.field6541 * var5.field6532 + var4.field6573 * var5.field6530 + var4.field6532 * var5.field6538;
        class382.field5765 = var4.field6541 * var5.field6526 + var4.field6573 * var5.field6568 + var4.field6532 * var5.field6531 + var4.field6526;
        float var6 = (float) this.field9677 * class458.field6751 + class382.field5765;
        float var7 = (float) this.field9728 * class458.field6751 + class382.field5765;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var8 = (float) this.field9719 + var6;
            var9 = (float) (-this.field9719) + var7;
        } else {
            var8 = (float) this.field9719 + var7;
            var9 = (float) (-this.field9719) + var6;
        }
        if ((var9 >= this.field9715.field5604) || (var8 <= (float) this.field9715.field5600)) {
            return;
        }
        class387.field5840 = var4.field6535 * var5.field6526 + var4.field6534 * var5.field6568 + var4.field6530 * var5.field6531 + var4.field6568;
        class28.field275 = var4.field6535 * var5.field6532 + var4.field6534 * var5.field6530 + var4.field6530 * var5.field6538;
        float var10 = (float) this.field9677 * class28.field275 + class387.field5840;
        float var11 = (float) this.field9728 * class28.field275 + class387.field5840;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) (-this.field9719) + var11) * (float) this.field9715.field5571;
            var13 = ((float) this.field9719 + var10) * (float) this.field9715.field5571;
        } else {
            var13 = ((float) this.field9719 + var11) * (float) this.field9715.field5571;
            var12 = (var10 - (float) this.field9719) * (float) this.field9715.field5571;
        }
        if ((this.field9715.field5618 <= var12 / var8) || (this.field9715.field5632 >= var13 / var8)) {
            return;
        }
        class381.field5750 = var4.field6565 * var5.field6532 + var4.field6540 * var5.field6530 + var4.field6538 * var5.field6538;
        class430.field6437 = var4.field6565 * var5.field6526 + var4.field6540 * var5.field6568 + var4.field6538 * var5.field6531 + var4.field6531;
        float var14 = (float) this.field9677 * class381.field5750 + class430.field6437;
        float var15 = (float) this.field9728 * class381.field5750 + class430.field6437;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field9719 + var14) * (float) this.field9715.field5561;
            var17 = (var15 - (float) this.field9719) * (float) this.field9715.field5561;
        } else {
            var17 = ((float) (-this.field9719) + var14) * (float) this.field9715.field5561;
            var16 = ((float) this.field9719 + var15) * (float) this.field9715.field5561;
        }
        if ((var17 / var8 >= this.field9715.field5615) || (this.field9715.field5563 >= var16 / var8)) {
            return;
        }
        if (arg1 != null || this.field9720 != null) {
            class71.field1006 = var4.field6535 * var5.field6573 + var4.field6534 * var5.field6534 + var4.field6530 * var5.field6540;
            class391.field5888 = var4.field6565 * var5.field6541 + var4.field6540 * var5.field6535 + var4.field6538 * var5.field6565;
            class98.field1378 = var4.field6535 * var5.field6541 + var4.field6534 * var5.field6535 + var4.field6530 * var5.field6565;
            class542.field7729 = var4.field6565 * var5.field6573 + var4.field6540 * var5.field6534 + var4.field6538 * var5.field6540;
            class571.field8084 = var4.field6541 * var5.field6541 + var4.field6573 * var5.field6535 + var4.field6532 * var5.field6565;
            class551.field7852 = var4.field6541 * var5.field6573 + var4.field6573 * var5.field6534 + var4.field6532 * var5.field6540;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field9759 + this.field9769 >> 1;
            int var21 = this.field9716 + this.field9699 >> 1;
            int var22 = (int) ((float) var21 * class98.field1378 + (float) this.field9677 * class28.field275 + (float) var20 * class71.field1006 + class387.field5840);
            int var23 = (int) ((float) var21 * class391.field5888 + (float) this.field9677 * class381.field5750 + (float) var20 * class542.field7729 + class430.field6437);
            int var24 = (int) ((float) var21 * class571.field8084 + (float) this.field9677 * class458.field6751 + (float) var20 * class551.field7852 + class382.field5765);
            if (var24 < this.field9715.field5600) {
                var18 = true;
            } else {
                arg1.field1432 = this.field9715.field5571 * var22 / var24 + this.field9715.field5572;
                arg1.field1431 = this.field9715.field5561 * var23 / var24 + this.field9715.field5588;
            }
            int var25 = (int) ((float) var21 * class98.field1378 + (float) this.field9728 * class28.field275 + (float) var20 * class71.field1006 + class387.field5840);
            int var26 = (int) ((float) var21 * class391.field5888 + (float) this.field9728 * class381.field5750 + (float) var20 * class542.field7729 + class430.field6437);
            int var27 = (int) ((float) var21 * class571.field8084 + (float) this.field9728 * class458.field6751 + (float) var20 * class551.field7852 + class382.field5765);
            if (var27 < this.field9715.field5600) {
                var18 = true;
            } else {
                arg1.field1433 = this.field9715.field5571 * var25 / var27 + this.field9715.field5572;
                arg1.field1434 = this.field9715.field5561 * var26 / var27 + this.field9715.field5588;
            }
            if (var18) {
                if (this.field9715.field5600 > var24 && var27 < this.field9715.field5600) {
                    var19 = false;
                } else if (this.field9715.field5600 > var24) {
                    int var28 = (var27 - this.field9715.field5600 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field1432 = this.field9715.field5572 + (this.field9715.field5571 * var29 / this.field9715.field5600);
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field1431 = this.field9715.field5561 * var30 / this.field9715.field5600 + this.field9715.field5588;
                } else if (this.field9715.field5600 > var27) {
                    int var31 = (var24 - this.field9715.field5600 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field1432 = this.field9715.field5572 + (this.field9715.field5571 * var32 / this.field9715.field5600);
                    arg1.field1431 = this.field9715.field5588 + (this.field9715.field5561 * var33 / this.field9715.field5600);
                }
            }
            if (var19) {
                if (var24 > var27) {
                    arg1.field1429 = this.field9715.field5572 + ((var22 + this.field9719) * this.field9715.field5571 / var24) - arg1.field1432;
                } else {
                    arg1.field1429 = (this.field9719 + var25) * this.field9715.field5571 / var27 + (this.field9715.field5572 - arg1.field1433);
                }
                arg1.field1430 = true;
            }
        }
        this.field9715.method2411(40);
        this.field9715.method2328((byte) 90, var5);
        this.method3990(-16644);
        this.method3981((byte) -47);
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)Z", line = 6019)
    private final boolean method3991(int arg0) {
        field9778++;
        if (arg0 != 0) {
            return true;
        }
        boolean var2 = !this.field9753.field1747;
        boolean var3 = (this.field9752 & 0x37) != 0 && !this.field9780.field1747;
        boolean var4 = !this.field9742.field1747;
        boolean var5 = !this.field9731.field1747;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = true;
        if (var4) {
            if (this.field9742.field1744 == null) {
                this.field9742.field1744 = this.field9715.method2384(this.field9683, 85);
            }
            class366 var7 = this.field9742.field1744;
            var7.method1290(-124, 12, this.field9703 * 12);
            Buffer var8 = var7.method1283((byte) 106, true);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field9715.field5354.copyPositions(this.field9671, this.field9772, this.field9686, this.field9746, 0, 12, this.field9703, var8.getAddress());
                if (var7.method1289((byte) 42)) {
                    this.field9742.field1743 = var7;
                    this.field9742.field1747 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field9753.field1744 == null) {
                this.field9753.field1744 = this.field9715.method2384(this.field9683, -106);
            }
            class366 var9 = this.field9753.field1744;
            var9.method1290(-123, 4, this.field9703 * 4);
            Buffer var10 = var9.method1283((byte) 49, true);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field9752 & 0x37) == 0) {
                    byte[] var11;
                    short[] var12;
                    short[] var13;
                    short[] var14;
                    if (this.field9672 == null) {
                        var11 = this.field9710;
                        var12 = this.field9691;
                        var13 = this.field9739;
                        var14 = this.field9741;
                    } else {
                        var14 = this.field9672.field10117;
                        var13 = this.field9672.field10119;
                        var12 = this.field9672.field10122;
                        var11 = this.field9672.field10115;
                    }
                    this.field9715.field5354.copyLighting(this.field9706, this.field9727, this.field9750, var12, var14, var13, var11, this.field9709, this.field9766, this.field9749, 0, 4, this.field9703, var10.getAddress());
                } else {
                    this.field9715.field5354.copyColours(this.field9706, this.field9727, this.field9750, this.field9709, this.field9749, 0, 4, this.field9703, var10.getAddress());
                }
                if (var9.method1289((byte) 17)) {
                    this.field9753.field1747 = true;
                    this.field9753.field1743 = var9;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field9780.field1744 == null) {
                this.field9780.field1744 = this.field9715.method2384(this.field9683, arg0 + 96);
            }
            class366 var15 = this.field9780.field1744;
            var15.method1290(-121, 12, this.field9703 * 12);
            Buffer var16 = var15.method1283((byte) 103, true);
            if (var16 == null) {
                var6 = false;
            } else {
                short[] var17;
                short[] var18;
                byte[] var19;
                short[] var20;
                if (this.field9672 == null) {
                    var17 = this.field9739;
                    var18 = this.field9741;
                    var19 = this.field9710;
                    var20 = this.field9691;
                } else {
                    var20 = this.field9672.field10122;
                    var18 = this.field9672.field10117;
                    var19 = this.field9672.field10115;
                    var17 = this.field9672.field10119;
                }
                this.field9715.field5354.copyNormals(var20, var18, var17, var19, 3.0F / (float) this.field9766, 3.0F / (float) (this.field9766 / 2 + this.field9766), 0, 12, this.field9703, var16.getAddress());
                if (var15.method1289((byte) 78)) {
                    this.field9780.field1743 = var15;
                    this.field9780.field1747 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field9731.field1744 == null) {
                this.field9731.field1744 = this.field9715.method2384(this.field9683, -121);
            }
            class366 var21 = this.field9731.field1744;
            var21.method1290(-128, 8, this.field9703 * 8);
            Buffer var22 = var21.method1283((byte) 22, true);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field9715.field5354.copyTexCoords(this.field9758, this.field9781, 0, 8, this.field9703, var22.getAddress());
                if (var21.method1289((byte) 96)) {
                    this.field9731.field1747 = true;
                    this.field9731.field1743 = var21;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)V", line = 6214)
    public final void method3992(int arg0) {
        if (this.field9742 != null) {
            this.field9742.method925(7);
        }
        field9689++;
        if (this.field9731 != null) {
            this.field9731.method925(arg0 + 2107760409);
        }
        if (arg0 != -2107760402) {
            this.method286(-29, -127, -14);
        }
        if (this.field9753 != null) {
            this.field9753.method925(7);
        }
        if (this.field9780 != null) {
            this.field9780.method925(7);
        }
        if (this.field9717 != null) {
            this.field9717.method1110(512);
        }
    }

    @OriginalMember(owner = "client!ic", name = "RA", descriptor = "()I", line = 6256)
    public final int method239() {
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        field9751++;
        return this.field9769;
    }

    @OriginalMember(owner = "client!ic", name = "na", descriptor = "()I", line = 6267)
    public final int method256() {
        field9700++;
        if (!this.field9708) {
            this.method3977(-645696473);
        }
        return this.field9719;
    }

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "()Z", line = 6278)
    public final boolean method275() {
        field9702++;
        return this.field9693;
    }
}
