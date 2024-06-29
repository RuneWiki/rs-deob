import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class407 extends class55 {

    @OriginalMember(owner = "client!os", name = "O", descriptor = "Z")
    private boolean field5711 = false;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    private int field5698 = 0;

    @OriginalMember(owner = "client!os", name = "Z", descriptor = "Z")
    private boolean field5722 = true;

    @OriginalMember(owner = "client!os", name = "Eb", descriptor = "I")
    private int field5753 = 0;

    @OriginalMember(owner = "client!os", name = "Vb", descriptor = "I")
    private int field5770 = 0;

    @OriginalMember(owner = "client!os", name = "ic", descriptor = "Z")
    private boolean field5783 = false;

    @OriginalMember(owner = "client!os", name = "Kb", descriptor = "I")
    private int field5759 = 0;

    @OriginalMember(owner = "client!os", name = "Y", descriptor = "I")
    private int field5721 = 0;

    @OriginalMember(owner = "client!os", name = "mc", descriptor = "Llj;")
    private class565 field5787;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "Lmq;")
    private class470 field5710;

    @OriginalMember(owner = "client!os", name = "Lb", descriptor = "Lmq;")
    private class470 field5760;

    @OriginalMember(owner = "client!os", name = "zc", descriptor = "Lmq;")
    private class470 field5800;

    @OriginalMember(owner = "client!os", name = "uc", descriptor = "Lmq;")
    private class470 field5795;

    @OriginalMember(owner = "client!os", name = "Fb", descriptor = "Lqe;")
    private class432 field5754;

    @OriginalMember(owner = "client!os", name = "wb", descriptor = "I")
    private int field5745;

    @OriginalMember(owner = "client!os", name = "Cb", descriptor = "I")
    private int field5751;

    @OriginalMember(owner = "client!os", name = "xb", descriptor = "[I")
    private int[] field5746;

    @OriginalMember(owner = "client!os", name = "yc", descriptor = "[I")
    private int[] field5799;

    @OriginalMember(owner = "client!os", name = "Jb", descriptor = "[I")
    private int[] field5758;

    @OriginalMember(owner = "client!os", name = "kb", descriptor = "[I")
    private int[] field5733;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "[S")
    private short[] field5693;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "[Llp;")
    private class357[] field5712;

    @OriginalMember(owner = "client!os", name = "X", descriptor = "[Lns;")
    private class369[] field5720;

    @OriginalMember(owner = "client!os", name = "pc", descriptor = "I")
    private int field5790;

    @OriginalMember(owner = "client!os", name = "Xb", descriptor = "[Lie;")
    private class6[] field5772;

    @OriginalMember(owner = "client!os", name = "S", descriptor = "[Lsca;")
    private class42[] field5715;

    @OriginalMember(owner = "client!os", name = "bc", descriptor = "[S")
    private short[] field5776;

    @OriginalMember(owner = "client!os", name = "R", descriptor = "[S")
    private short[] field5714;

    @OriginalMember(owner = "client!os", name = "kc", descriptor = "S")
    private short field5785;

    @OriginalMember(owner = "client!os", name = "nb", descriptor = "[B")
    private byte[] field5736;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "S")
    private short field5700;

    @OriginalMember(owner = "client!os", name = "bb", descriptor = "[S")
    private short[] field5724;

    @OriginalMember(owner = "client!os", name = "hb", descriptor = "[S")
    private short[] field5730;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "[S")
    private short[] field5704;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "[S")
    private short[] field5692;

    @OriginalMember(owner = "client!os", name = "fb", descriptor = "[F")
    private float[] field5728;

    @OriginalMember(owner = "client!os", name = "Q", descriptor = "[S")
    private short[] field5713;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "[B")
    private byte[] field5695;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "[S")
    private short[] field5691;

    @OriginalMember(owner = "client!os", name = "W", descriptor = "[S")
    private short[] field5719;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "[S")
    private short[] field5705;

    @OriginalMember(owner = "client!os", name = "rb", descriptor = "[F")
    private float[] field5740;

    @OriginalMember(owner = "client!os", name = "sb", descriptor = "[I")
    private int[] field5741;

    @OriginalMember(owner = "client!os", name = "cb", descriptor = "[[I")
    private int[][] field5725;

    @OriginalMember(owner = "client!os", name = "db", descriptor = "[[I")
    private int[][] field5726;

    @OriginalMember(owner = "client!os", name = "Ab", descriptor = "[[I")
    private int[][] field5749;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    public static int field5703 = 1;

    @OriginalMember(owner = "client!os", name = "pb", descriptor = "B")
    private byte field5738;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!os", name = "T", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!os", name = "U", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!os", name = "V", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!os", name = "ab", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!os", name = "eb", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!os", name = "gb", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!os", name = "ib", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!os", name = "jb", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!os", name = "lb", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!os", name = "mb", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!os", name = "ob", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!os", name = "qb", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!os", name = "tb", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!os", name = "ub", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!os", name = "vb", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!os", name = "yb", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!os", name = "Bb", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!os", name = "Db", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!os", name = "Gb", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!os", name = "Ib", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!os", name = "Mb", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!os", name = "Nb", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!os", name = "Ob", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!os", name = "Pb", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!os", name = "Qb", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!os", name = "Rb", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!os", name = "Ub", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!os", name = "Wb", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!os", name = "Yb", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!os", name = "Zb", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!os", name = "ac", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!os", name = "cc", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!os", name = "dc", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!os", name = "ec", descriptor = "I")
    public static int field5779;

    @OriginalMember(owner = "client!os", name = "fc", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!os", name = "gc", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!os", name = "hc", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!os", name = "lc", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!os", name = "nc", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!os", name = "oc", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!os", name = "rc", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!os", name = "sc", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!os", name = "tc", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!os", name = "vc", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!os", name = "xc", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!os", name = "Ac", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!os", name = "Sb", descriptor = "Leq;")
    private class194 field5767;

    @OriginalMember(owner = "client!os", name = "qc", descriptor = "Lii;")
    private class514 field5791;

    @OriginalMember(owner = "client!os", name = "wc", descriptor = "Lhn;")
    private class672 field5797;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "S")
    private short field5688;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "S")
    private short field5689;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "S")
    private short field5707;

    @OriginalMember(owner = "client!os", name = "zb", descriptor = "S")
    private short field5748;

    @OriginalMember(owner = "client!os", name = "Hb", descriptor = "S")
    private short field5756;

    @OriginalMember(owner = "client!os", name = "Tb", descriptor = "S")
    private short field5768;

    @OriginalMember(owner = "client!os", name = "jc", descriptor = "S")
    private short field5784;

    @OriginalMember(owner = "client!os", name = "Bc", descriptor = "S")
    private short field5802;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "()V")
    public final void method432() {
        field5779++;
        if (this.field5721 <= 0 || this.field5759 <= 0) {
            return;
        }
        this.method2371((byte) -100, false);
        if ((this.field5738 & 0x10) == 0 && this.field5754.field6028 == null) {
            this.method2372(false, 99);
        }
        this.method2369(true);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lq;)V")
    public final void method460(class392 arg0) {
        field5699++;
        class561 var2 = (class561) arg0;
        if (this.field5720 != null) {
            for (int var3 = 0; var3 < this.field5720.length; var3++) {
                class369 var4 = this.field5720[var3];
                class369 var5 = var4;
                if (var4.field4984 != null) {
                    var5 = var4.field4984;
                }
                var5.field4982 = (int) ((float) this.field5758[var4.field4973] * var2.field7563 + (float) this.field5799[var4.field4973] * var2.field7559 + (float) this.field5733[var4.field4973] * var2.field7552 + var2.field7585);
                var5.field4980 = (int) ((float) this.field5758[var4.field4973] * var2.field7550 + (float) this.field5799[var4.field4973] * var2.field7567 + (float) this.field5733[var4.field4973] * var2.field7578 + var2.field7582);
                var5.field4983 = (int) ((float) this.field5758[var4.field4973] * var2.field7558 + (float) this.field5799[var4.field4973] * var2.field7576 + (float) this.field5733[var4.field4973] * var2.field7556 + var2.field7560);
                var5.field4970 = (int) ((float) this.field5758[var4.field4978] * var2.field7563 + (float) this.field5799[var4.field4978] * var2.field7559 + (float) this.field5733[var4.field4978] * var2.field7552 + var2.field7585);
                var5.field4975 = (int) ((float) this.field5758[var4.field4978] * var2.field7550 + (float) this.field5799[var4.field4978] * var2.field7567 + (float) this.field5733[var4.field4978] * var2.field7578 + var2.field7582);
                var5.field4979 = (int) ((float) this.field5758[var4.field4978] * var2.field7558 + (float) this.field5799[var4.field4978] * var2.field7576 + (float) this.field5733[var4.field4978] * var2.field7556 + var2.field7560);
                var5.field4977 = (int) ((float) this.field5758[var4.field4976] * var2.field7563 + (float) this.field5799[var4.field4976] * var2.field7559 + (float) this.field5733[var4.field4976] * var2.field7552 + var2.field7585);
                var5.field4969 = (int) ((float) this.field5758[var4.field4976] * var2.field7550 + (float) this.field5799[var4.field4976] * var2.field7567 + (float) this.field5733[var4.field4976] * var2.field7578 + var2.field7582);
                var5.field4981 = (int) ((float) this.field5758[var4.field4976] * var2.field7558 + (float) this.field5799[var4.field4976] * var2.field7576 + (float) this.field5733[var4.field4976] * var2.field7556 + var2.field7560);
            }
        }
        if (this.field5712 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5712.length; var6++) {
            class357 var7 = this.field5712[var6];
            class357 var8 = var7;
            if (var7.field4733 != null) {
                var8 = var7.field4733;
            }
            if (var7.field4734 == null) {
                var7.field4734 = var2.method681();
            } else {
                var7.field4734.method675(var2);
            }
            var8.field4737 = (int) ((float) this.field5758[var7.field4744] * var2.field7563 + (float) this.field5799[var7.field4744] * var2.field7559 + (float) this.field5733[var7.field4744] * var2.field7552 + var2.field7585);
            var8.field4741 = (int) ((float) this.field5758[var7.field4744] * var2.field7550 + (float) this.field5799[var7.field4744] * var2.field7567 + (float) this.field5733[var7.field4744] * var2.field7578 + var2.field7582);
            var8.field4743 = (int) ((float) this.field5758[var7.field4744] * var2.field7558 + (float) this.field5799[var7.field4744] * var2.field7576 + (float) this.field5733[var7.field4744] * var2.field7556 + var2.field7560);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lq;Let;I)V")
    public final void method465(class392 arg0, class551 arg1, int arg2) {
        field5739++;
        if (this.field5721 == 0) {
            return;
        }
        class561 var4 = this.field5787.field7866;
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        class561 var5 = (class561) arg0;
        class62.field707 = var4.field7558 * var5.field7556 + var4.field7576 * var5.field7552 + var4.field7556 * var5.field7578;
        class95.field1334 = var4.field7558 * var5.field7560 + var4.field7576 * var5.field7585 + var4.field7556 * var5.field7582 + var4.field7560;
        float var6 = (float) this.field5756 * class62.field707 + class95.field1334;
        float var7 = (float) this.field5688 * class62.field707 + class95.field1334;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) (-this.field5689) + var7;
            var9 = (float) this.field5689 + var6;
        } else {
            var9 = (float) this.field5689 + var7;
            var8 = (float) (-this.field5689) + var6;
        }
        if ((this.field5787.field7888 <= var8) || ((float) this.field5787.field7874 >= var9)) {
            return;
        }
        class506.field6946 = var4.field7563 * var5.field7556 + var4.field7559 * var5.field7552 + var4.field7552 * var5.field7578;
        class93.field1330 = var4.field7563 * var5.field7560 + var4.field7559 * var5.field7585 + var4.field7552 * var5.field7582 + var4.field7585;
        float var10 = (float) this.field5756 * class506.field6946 + class93.field1330;
        float var11 = (float) this.field5688 * class506.field6946 + class93.field1330;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) this.field5689 + var10) * (float) this.field5787.field7956;
            var13 = (var11 - (float) this.field5689) * (float) this.field5787.field7956;
        } else {
            var12 = ((float) this.field5689 + var11) * (float) this.field5787.field7956;
            var13 = ((float) (-this.field5689) + var10) * (float) this.field5787.field7956;
        }
        if ((var13 / var9 >= this.field5787.field7978) || (this.field5787.field7972 >= var12 / var9)) {
            return;
        }
        class441.field6101 = var4.field7550 * var5.field7560 + var4.field7578 * var5.field7582 + var4.field7567 * var5.field7585 + var4.field7582;
        class698.field9913 = var4.field7550 * var5.field7556 + var4.field7578 * var5.field7578 + var4.field7567 * var5.field7552;
        float var14 = (float) this.field5756 * class698.field9913 + class441.field6101;
        float var15 = (float) this.field5688 * class698.field9913 + class441.field6101;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field5689 + var14) * (float) this.field5787.field7924;
            var17 = ((float) (-this.field5689) + var15) * (float) this.field5787.field7924;
        } else {
            var17 = (var14 - (float) this.field5689) * (float) this.field5787.field7924;
            var16 = ((float) this.field5689 + var15) * (float) this.field5787.field7924;
        }
        if ((this.field5787.field7925 <= var17 / var9) || (this.field5787.field7927 >= var16 / var9)) {
            return;
        }
        if (arg1 != null || this.field5715 != null) {
            class111.field1541 = var4.field7563 * var5.field7558 + var4.field7559 * var5.field7563 + var4.field7552 * var5.field7550;
            class416.field5871 = var4.field7550 * var5.field7576 + var4.field7578 * var5.field7567 + var4.field7567 * var5.field7559;
            class291.field3998 = var4.field7563 * var5.field7576 + var4.field7559 * var5.field7559 + var4.field7552 * var5.field7567;
            class21.field241 = var4.field7558 * var5.field7576 + var4.field7576 * var5.field7559 + var4.field7556 * var5.field7567;
            class593.field8296 = var4.field7558 * var5.field7558 + var4.field7576 * var5.field7563 + var4.field7556 * var5.field7550;
            class263.field3564 = var4.field7550 * var5.field7558 + var4.field7578 * var5.field7550 + var4.field7567 * var5.field7563;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5784 + this.field5768 >> 1;
            int var21 = this.field5707 + this.field5802 >> 1;
            int var22 = (int) ((float) var21 * class111.field1541 + (float) this.field5756 * class506.field6946 + (float) var20 * class291.field3998 + class93.field1330);
            int var23 = (int) ((float) var21 * class263.field3564 + (float) this.field5756 * class698.field9913 + (float) var20 * class416.field5871 + class441.field6101);
            int var24 = (int) ((float) var21 * class593.field8296 + (float) this.field5756 * class62.field707 + (float) var20 * class21.field241 + class95.field1334);
            if (this.field5787.field7874 > var24) {
                var18 = true;
            } else {
                arg1.field7442 = this.field5787.field7924 * var23 / var24 + this.field5787.field7964;
                arg1.field7445 = this.field5787.field7956 * var22 / var24 + this.field5787.field7950;
            }
            int var25 = (int) ((float) var21 * class111.field1541 + (float) this.field5688 * class506.field6946 + (float) var20 * class291.field3998 + class93.field1330);
            int var26 = (int) ((float) var21 * class263.field3564 + (float) this.field5688 * class698.field9913 + (float) var20 * class416.field5871 + class441.field6101);
            int var27 = (int) ((float) var21 * class593.field8296 + (float) this.field5688 * class62.field707 + (float) var20 * class21.field241 + class95.field1334);
            if (var27 < this.field5787.field7874) {
                var18 = true;
            } else {
                arg1.field7447 = this.field5787.field7950 + (this.field5787.field7956 * var25 / var27);
                arg1.field7446 = this.field5787.field7924 * var26 / var27 + this.field5787.field7964;
            }
            if (var18) {
                if (var24 < this.field5787.field7874 && this.field5787.field7874 > var27) {
                    var19 = false;
                } else if (this.field5787.field7874 > var24) {
                    int var28 = (var27 - this.field5787.field7874 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field7445 = this.field5787.field7956 * var29 / this.field5787.field7874 + this.field5787.field7950;
                    arg1.field7442 = this.field5787.field7924 * var30 / this.field5787.field7874 + this.field5787.field7964;
                } else if (this.field5787.field7874 > var27) {
                    int var31 = (var24 - this.field5787.field7874 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field7445 = this.field5787.field7956 * var32 / this.field5787.field7874 + this.field5787.field7950;
                    arg1.field7442 = this.field5787.field7924 * var33 / this.field5787.field7874 + this.field5787.field7964;
                }
            }
            if (var19) {
                arg1.field7444 = true;
                if (var27 >= var24) {
                    arg1.field7443 = (this.field5689 + var25) * this.field5787.field7956 / var27 + (this.field5787.field7950 - arg1.field7447);
                } else {
                    arg1.field7443 = (this.field5689 + var22) * this.field5787.field7956 / var24 + this.field5787.field7950 - arg1.field7445;
                }
            }
        }
        this.field5787.method3209((byte) 98);
        this.field5787.method3181(0, var5);
        this.method2376(0);
        this.field5787.method3174(0);
        this.method2366(-120);
    }

    @OriginalMember(owner = "client!os", name = "H", descriptor = "()I")
    public final int method464() {
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        field5697++;
        return this.field5688;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    private final void method2366(int arg0) {
        if (arg0 > -81) {
            this.method438();
        }
        field5742++;
        if (this.field5715 == null) {
            return;
        }
        class561 var2 = this.field5787.field7827;
        this.field5787.method3219(false);
        this.field5787.method202(!this.field5711);
        this.field5787.method3195((byte) 78, false);
        this.field5787.method3208(this.field5787.field7906, (byte) 16, null, this.field5787.field7875, null);
        for (int var3 = 0; var3 < this.field5790; var3++) {
            class42 var4 = this.field5715[var3];
            class6 var5 = this.field5772[var3];
            if (!var4.field485 || !this.field5787.method120()) {
                float var6 = (float) (this.field5799[var4.field496] + this.field5799[var4.field491] + this.field5799[var4.field488]) * 0.3333333F;
                float var7 = (float) (this.field5733[var4.field491] + this.field5733[var4.field496] + this.field5733[var4.field488]) * 0.3333333F;
                float var8 = (float) (this.field5758[var4.field496] + this.field5758[var4.field491] + this.field5758[var4.field488]) * 0.3333333F;
                float var9 = class111.field1541 * var8 + class506.field6946 * var7 + class291.field3998 * var6 + class93.field1330;
                float var10 = class263.field3564 * var8 + class698.field9913 * var7 + class416.field5871 * var6 + class441.field6101;
                float var11 = class593.field8296 * var8 + class62.field707 * var7 + class21.field241 * var6 + class95.field1334;
                var2.method3141((float) var5.field50 - var10, (byte) -100, var4.field487 * var5.field51 >> 7, (float) var5.field47 + var9, var4.field493 * var5.field49 >> 7, var5.field52, (float) var4.field492 - var11);
                this.field5787.method3240(true, var2);
                int var12 = var5.field45;
                OpenGL.glColor4ub((byte) (var12 >> 16), (byte) (var12 >> 8), (byte) var12, (byte) (var12 >> 24));
                this.field5787.method3238(-7056, var4.field495);
                this.field5787.method3237(16015, var4.field486);
                this.field5787.method3212(7, 0, 4, 18744);
            }
        }
        this.field5787.method202(true);
        this.field5787.method3174(0);
    }

    @OriginalMember(owner = "client!os", name = "R", descriptor = "(III)V")
    public final void method425(int arg0, int arg1, int arg2) {
        field5761++;
        for (int var4 = 0; var4 < this.field5698; var4++) {
            if (arg0 != 128) {
                this.field5799[var4] = this.field5799[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5733[var4] = this.field5733[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field5758[var4] = this.field5758[var4] * arg2 >> 7;
            }
        }
        if (this.field5710 != null) {
            this.field5710.field6485 = null;
        }
        this.field5783 = false;
    }

    @OriginalMember(owner = "client!os", name = "RA", descriptor = "()I")
    public final int method426() {
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        field5801++;
        return this.field5748;
    }

    @OriginalMember(owner = "client!os", name = "L", descriptor = "()V")
    public final void method437() {
        field5792++;
        for (int var1 = 0; var1 < this.field5753; var1++) {
            this.field5799[var1] = this.field5799[var1] + 7 >> 4;
            this.field5733[var1] = this.field5733[var1] + 7 >> 4;
            this.field5758[var1] = this.field5758[var1] + 7 >> 4;
        }
        this.field5783 = false;
        if (this.field5710 != null) {
            this.field5710.field6485 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "KA", descriptor = "()I")
    public final int method424() {
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        field5727++;
        return this.field5784;
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(SS)V")
    public final void method439(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5770; var3++) {
            if (this.field5776[var3] == arg0) {
                this.field5776[var3] = arg1;
            }
        }
        field5778++;
        if (this.field5715 != null) {
            for (int var4 = 0; var4 < this.field5790; var4++) {
                class42 var5 = this.field5715[var4];
                class6 var6 = this.field5772[var4];
                var6.field45 = class78.field1186[this.field5776[var5.field497] & 0xFFFF] & 0xFFFFFF | var6.field45 & 0xFF000000;
            }
        }
        if (this.field5795 != null) {
            this.field5795.field6485 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method448(int arg0, int arg1, class392 arg2, boolean arg3) {
        field5782++;
        return this.method2373(arg1, arg3, arg0, arg2, false, -1);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "()V")
    public final void method427() {
        field5789++;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method419(int arg0, int arg1, class392 arg2, boolean arg3, int arg4) {
        field5786++;
        return this.method2373(arg1, arg3, arg0, arg2, false, arg4);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BIZ)Lda;")
    public final class55 method462(byte arg0, int arg1, boolean arg2) {
        field5755++;
        class407 var4;
        class407 var5;
        if (arg0 == 1) {
            var4 = this.field5787.field7953;
            var5 = this.field5787.field7891;
        } else if (arg0 == 2) {
            var4 = this.field5787.field7892;
            var5 = this.field5787.field7929;
        } else if (arg0 == 3) {
            var5 = this.field5787.field7908;
            var4 = this.field5787.field7903;
        } else if (arg0 == 4) {
            var5 = this.field5787.field7910;
            var4 = this.field5787.field7895;
        } else if (arg0 == 5) {
            var5 = this.field5787.field7898;
            var4 = this.field5787.field7960;
        } else {
            var4 = var5 = new class407(this.field5787);
        }
        return this.method2377(var4, arg0 != 0, 0, arg2, var5, arg1);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BBSII)I")
    private final int method2367(byte arg0, byte arg1, short arg2, int arg3, int arg4) {
        field5694++;
        int var6 = class78.field1186[class381.method2193(arg4, arg3, false)];
        if (arg0 != 105) {
            this.method427();
        }
        if (arg2 != -1) {
            class686 var7 = this.field5787.field2418.method1365(-17951, arg2 & 0xFFFF);
            int var8 = var7.field9791 & 0xFF;
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
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field9783 & 0xFF;
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
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF00C8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!os", name = "SA", descriptor = "(I)V")
    public final void method452(int arg0) {
        this.field5745 = arg0;
        field5709++;
        if (this.field5797 != null && (this.field5745 & 0x10000) == 0) {
            this.field5736 = this.field5797.field9427;
            this.field5704 = this.field5797.field9425;
            this.field5730 = this.field5797.field9421;
            this.field5691 = this.field5797.field9420;
            this.field5797 = null;
        }
        this.field5722 = true;
        this.method2369(true);
    }

    @OriginalMember(owner = "client!os", name = "ga", descriptor = "(I)V")
    public final void method455(int arg0) {
        if (this.field5795 != null) {
            this.field5795.field6485 = null;
        }
        field5684++;
        this.field5785 = (short) arg0;
        if (this.field5800 != null) {
            this.field5800.field6485 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "()[Lns;")
    public final class369[] method451() {
        field5747++;
        return this.field5720;
    }

    @OriginalMember(owner = "client!os", name = "PA", descriptor = "()I")
    public final int method422() {
        field5690++;
        return this.field5745;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method467(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5701++;
        class407 var6 = (class407) arg0;
        if (this.field5770 == 0 || var6.field5770 == 0) {
            return;
        }
        int var7 = var6.field5698;
        int[] var8 = var6.field5799;
        int[] var9 = var6.field5733;
        int[] var10 = var6.field5758;
        short[] var11 = var6.field5730;
        short[] var12 = var6.field5704;
        short[] var13 = var6.field5691;
        byte[] var14 = var6.field5736;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field5797 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var16 = this.field5797.field9421;
            var18 = this.field5797.field9427;
            var15 = this.field5797.field9420;
            var17 = this.field5797.field9425;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5797 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var22 = var6.field5797.field9420;
            var21 = var6.field5797.field9425;
            var20 = var6.field5797.field9421;
            var19 = var6.field5797.field9427;
        }
        int[] var23 = var6.field5746;
        short[] var24 = var6.field5724;
        if (!var6.field5783) {
            var6.method2368((byte) -125);
        }
        short var25 = var6.field5756;
        short var26 = var6.field5688;
        short var27 = var6.field5784;
        short var28 = var6.field5768;
        short var29 = var6.field5707;
        short var30 = var6.field5802;
        for (int var31 = 0; var31 < this.field5698; var31++) {
            int var32 = this.field5733[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field5799[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field5758[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field5746[var31];
                        int var37 = this.field5746[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5724[var38] - 1;
                            if (var35 == -1 || this.field5736[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var16 == null) {
                                            this.field5797 = new class672();
                                            var16 = this.field5797.field9421 = class561.method3135((byte) 103, this.field5730);
                                            var17 = this.field5797.field9425 = class561.method3135((byte) -66, this.field5704);
                                            var15 = this.field5797.field9420 = class561.method3135((byte) -9, this.field5691);
                                            var18 = this.field5797.field9427 = class62.method512(this.field5736, (byte) 40);
                                        }
                                        if (var20 == null) {
                                            class672 var44 = var6.field5797 = new class672();
                                            var20 = var44.field9421 = class561.method3135((byte) -52, var11);
                                            var21 = var44.field9425 = class561.method3135((byte) 116, var12);
                                            var22 = var44.field9420 = class561.method3135((byte) -17, var13);
                                            var19 = var44.field9427 = class62.method512(var14, (byte) 40);
                                        }
                                        short var45 = this.field5730[var35];
                                        short var46 = this.field5704[var35];
                                        short var47 = this.field5691[var35];
                                        byte var48 = this.field5736[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var20[var52] += var45;
                                                var21[var52] += var46;
                                                var22[var52] += var47;
                                                var19[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field5746[var31];
                                        short var54 = var13[var40];
                                        int var55 = this.field5746[var31 + 1];
                                        byte var56 = var14[var40];
                                        short var57 = var11[var40];
                                        short var58 = var12[var40];
                                        for (int var59 = var53; var59 < var55; var59++) {
                                            int var60 = this.field5724[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var16[var60] += var57;
                                                var17[var60] += var58;
                                                var15[var60] += var54;
                                                var18[var60] += var56;
                                            }
                                        }
                                        if (this.field5800 == null && this.field5795 != null) {
                                            this.field5795.field6485 = null;
                                        }
                                        if (this.field5800 != null) {
                                            this.field5800.field6485 = null;
                                        }
                                        if (var6.field5800 == null && var6.field5795 != null) {
                                            var6.field5795.field6485 = null;
                                        }
                                        if (var6.field5800 != null) {
                                            var6.field5800.field6485 = null;
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

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
    private final void method2368(byte arg0) {
        field5735++;
        int var2 = 32767;
        if (arg0 != -125) {
            return;
        }
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5698; var10++) {
            int var11 = this.field5799[var10];
            int var12 = this.field5733[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = this.field5758[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var13 * var13 + var11 * var11 + var12 * var12;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field5768 = (short) var5;
        this.field5707 = (short) var4;
        this.field5784 = (short) var2;
        this.field5802 = (short) var7;
        this.field5756 = (short) var3;
        this.field5688 = (short) var6;
        this.field5689 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field5748 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field5783 = true;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(Z)V")
    private final void method2369(boolean arg0) {
        field5716++;
        if (!this.field5722) {
            return;
        }
        this.field5722 = false;
        if (this.field5720 == null && this.field5712 == null && this.field5715 == null) {
            if (this.field5799 != null && !class442.method2516(this.field5751, this.field5745, false)) {
                if (this.field5710 != null && this.field5710.field6485 == null) {
                    this.field5722 = true;
                } else {
                    if (!this.field5783) {
                        this.method2368((byte) -125);
                    }
                    this.field5799 = null;
                }
            }
            if (this.field5733 != null && !class533.method3027(this.field5745, this.field5751, (byte) -113)) {
                if (this.field5710 != null && this.field5710.field6485 == null) {
                    this.field5722 = true;
                } else {
                    if (!this.field5783) {
                        this.method2368((byte) -125);
                    }
                    this.field5733 = null;
                }
            }
            if (this.field5758 != null && !class683.method3870(255, this.field5751, this.field5745)) {
                if (this.field5710 != null && this.field5710.field6485 == null) {
                    this.field5722 = true;
                } else {
                    if (!this.field5783) {
                        this.method2368((byte) -125);
                    }
                    this.field5758 = null;
                }
            }
        }
        if (this.field5724 != null && this.field5799 == null && this.field5733 == null && this.field5758 == null) {
            this.field5746 = null;
            this.field5724 = null;
        }
        if (this.field5736 != null && !class604.method3398(this.field5751, -20448, this.field5745)) {
            if (this.field5800 == null) {
                if (this.field5795 != null && this.field5795.field6485 == null) {
                    this.field5722 = true;
                } else {
                    this.field5736 = null;
                    this.field5730 = this.field5704 = this.field5691 = null;
                }
            } else if (this.field5800.field6485 == null) {
                this.field5722 = true;
            } else {
                this.field5730 = this.field5704 = this.field5691 = null;
                this.field5736 = null;
            }
        }
        if (this.field5776 != null && !class487.method2768((byte) 127, this.field5745, this.field5751)) {
            if (this.field5795 != null && this.field5795.field6485 == null) {
                this.field5722 = true;
            } else {
                this.field5776 = null;
            }
        }
        if (this.field5695 != null && !class282.method1733(this.field5751, this.field5745, 262144)) {
            if (this.field5795 != null && this.field5795.field6485 == null) {
                this.field5722 = true;
            } else {
                this.field5695 = null;
            }
        }
        if (this.field5728 != null && !class519.method2954(this.field5745, -107, this.field5751)) {
            if (this.field5760 != null && this.field5760.field6485 == null) {
                this.field5722 = true;
            } else {
                this.field5728 = this.field5740 = null;
            }
        }
        if (!arg0) {
            this.method421(-24, null, -128, -60, -100, true, -20, null);
        }
        if (this.field5713 != null && !class356.method2043(this.field5745, (byte) 104, this.field5751)) {
            if (this.field5795 != null && this.field5795.field6485 == null) {
                this.field5722 = true;
            } else {
                this.field5713 = null;
            }
        }
        if (this.field5705 != null && !class96.method698(this.field5751, this.field5745, 256)) {
            if ((this.field5754 == null || this.field5754.field6028 != null) && (this.field5795 == null || this.field5795.field6485 != null)) {
                this.field5705 = this.field5714 = this.field5692 = null;
            } else {
                this.field5722 = true;
            }
        }
        if (this.field5749 != null && !class381.method2191(this.field5751, (byte) -97, this.field5745)) {
            this.field5719 = null;
            this.field5749 = null;
        }
        if (this.field5725 != null && !class425.method2453(this.field5751, 8, this.field5745)) {
            this.field5725 = null;
            this.field5693 = null;
        }
        if (this.field5726 != null && !class65.method557(this.field5745, 121, this.field5751)) {
            this.field5726 = null;
        }
        if (this.field5741 != null && (this.field5745 & 0x800) == 0 && (this.field5745 & 0x40000) == 0) {
            this.field5741 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLgd;)V")
    private final void method2370(byte arg0, class310 arg1) {
        if (this.field5721 > this.field5787.field7984.length) {
            this.field5787.field7984 = new int[this.field5721];
            this.field5787.field7981 = new int[this.field5721];
        }
        field5796++;
        int[] var3 = this.field5787.field7984;
        int[] var4 = this.field5787.field7981;
        for (int var5 = 0; var5 < this.field5698; var5++) {
            int var16 = (this.field5799[var5] - (this.field5733[var5] * this.field5787.field7977 >> 8) >> this.field5787.field7830) - arg1.field4289;
            int var17 = (this.field5758[var5] - (this.field5733[var5] * this.field5787.field7894 >> 8) >> this.field5787.field7830) - arg1.field4284;
            int var18 = this.field5746[var5];
            int var19 = this.field5746[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field5724[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field5759; var6++) {
            if (this.field5695 == null || this.field5695[var6] <= 128) {
                short var7 = this.field5705[var6];
                short var8 = this.field5714[var6];
                short var9 = this.field5692[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method1879(var14, var11, var13, (byte) -128, var15, var12, var10);
                }
            }
        }
        if (arg0 >= -2) {
            this.field5770 = 21;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lq;IZ)V")
    public final void method449(class392 arg0, int arg1, boolean arg2) {
        field5686++;
        if (this.field5693 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field5698; var5++) {
            if ((this.field5693[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method676(this.field5799[var5], this.field5733[var5], this.field5758[var5], var4);
                } else {
                    arg0.method682(this.field5799[var5], this.field5733[var5], this.field5758[var5], var4);
                }
                this.field5799[var5] = var4[0];
                this.field5733[var5] = var4[1];
                this.field5758[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "oa", descriptor = "(III)V")
    public final void method446(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5698; var4++) {
            if (arg0 != 0) {
                this.field5799[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5733[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field5758[var4] += arg2;
            }
        }
        field5775++;
        if (this.field5710 != null) {
            this.field5710.field6485 = null;
        }
        this.field5783 = false;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BZ)V")
    private final void method2371(byte arg0, boolean arg1) {
        field5734++;
        boolean var3 = this.field5795 != null && this.field5795.field6485 == null;
        boolean var4 = this.field5800 != null && this.field5800.field6485 == null;
        boolean var5 = this.field5710 != null && this.field5710.field6485 == null;
        boolean var6 = this.field5760 != null && this.field5760.field6485 == null;
        if (arg1) {
            var4 &= (this.field5738 & 0x4) != 0;
            var5 &= (this.field5738 & 0x1) != 0;
            var6 &= (this.field5738 & 0x8) != 0;
            var3 &= (this.field5738 & 0x2) != 0;
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
        if (this.field5787.field7899.field6855.length < this.field5721 * var7) {
            this.field5787.field7899 = new class340((this.field5721 + 100) * var7);
        } else {
            this.field5787.field7899.field6892 = 0;
        }
        class340 var12 = this.field5787.field7899;
        if (var5) {
            if (this.field5787.field7921) {
                for (int var21 = 0; var21 < this.field5698; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field5799[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field5733[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field5758[var21]);
                    int var25 = this.field5746[var21];
                    int var26 = this.field5746[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field5724[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field6892 = var7 * var28;
                        var12.method2836(var22, -22164);
                        var12.method2836(var23, -22164);
                        var12.method2836(var24, -22164);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field5698; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field5799[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field5733[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field5758[var13]);
                    int var17 = this.field5746[var13];
                    int var18 = this.field5746[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field5724[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field6892 = var7 * var20;
                        var12.method2826(false, var14);
                        var12.method2826(false, var15);
                        var12.method2826(false, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field5800 == null) {
                short[] var31;
                short[] var32;
                short[] var33;
                byte[] var34;
                if (this.field5797 == null) {
                    var31 = this.field5691;
                    var32 = this.field5730;
                    var33 = this.field5704;
                    var34 = this.field5736;
                } else {
                    var33 = this.field5797.field9425;
                    var34 = this.field5797.field9427;
                    var32 = this.field5797.field9421;
                    var31 = this.field5797.field9420;
                }
                float var35 = this.field5787.field7923[0];
                float var36 = this.field5787.field7923[1];
                float var37 = this.field5787.field7923[2];
                float var38 = this.field5787.field7943;
                float var39 = this.field5787.field7909 * 768.0F / (float) this.field5785;
                float var40 = this.field5787.field7916 * 768.0F / (float) this.field5785;
                for (int var41 = 0; var41 < this.field5770; var41++) {
                    int var42 = this.method2367((byte) 105, this.field5695[var41], this.field5713[var41], this.field5776[var41], this.field5700);
                    short var43 = this.field5705[var41];
                    float var44 = (float) (var42 >>> 24) * this.field5787.field7948;
                    float var45 = (float) ((var42 & 0xFFA3) >> 8) * this.field5787.field7975;
                    float var46 = (float) ((var42 & 0xFF56AD) >> 16) * this.field5787.field7963;
                    short var47 = (short) var34[var43];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var31[var43] * var37 + (float) var32[var43] * var35 + (float) var33[var43] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var31[var43] * var37 + (float) var32[var43] * var35 + (float) var33[var43] * var36) / (float) (var47 * 256);
                    }
                    float var49 = var38 + var48 * (var48 < 0.0F ? var40 : var39);
                    int var50 = (int) (var44 * var49);
                    int var51 = (int) (var46 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
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
                    var12.field6892 = var9 + (var7 * var43);
                    var12.method2817(var50, true);
                    var12.method2817(var51, true);
                    var12.method2817(var52, true);
                    var12.method2817(255 - (this.field5695[var41] & 0xFF), true);
                    short var53 = this.field5714[var41];
                    short var54 = (short) var34[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var35 + (float) var33[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var35 + (float) var33[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = (var55 < 0.0F ? var40 : var39) * var55 + var38;
                    int var57 = (int) (var44 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var46 * var56);
                    int var59 = (int) (var45 * var56);
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
                    var12.field6892 = var9 + (var7 * var53);
                    var12.method2817(var57, true);
                    var12.method2817(var58, true);
                    var12.method2817(var59, true);
                    var12.method2817(255 - (this.field5695[var41] & 0xFF), true);
                    short var60 = this.field5692[var41];
                    short var61 = (short) var34[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var35 + (float) var33[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var35 + (float) var33[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = (var62 < 0.0F ? var40 : var39) * var62 + var38;
                    int var64 = (int) (var44 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var46 * var63);
                    int var66 = (int) (var45 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    var12.field6892 = var7 * var60 + var9;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method2817(var64, true);
                    var12.method2817(var65, true);
                    var12.method2817(var66, true);
                    var12.method2817(255 - (this.field5695[var41] & 0xFF), true);
                }
            } else {
                for (int var29 = 0; var29 < this.field5770; var29++) {
                    int var30 = this.method2367((byte) 105, this.field5695[var29], this.field5713[var29], this.field5776[var29], this.field5700);
                    var12.field6892 = this.field5705[var29] * var7 + var9;
                    var12.method2836(var30, -22164);
                    var12.field6892 = this.field5714[var29] * var7 + var9;
                    var12.method2836(var30, -22164);
                    var12.field6892 = this.field5692[var29] * var7 + var9;
                    var12.method2836(var30, -22164);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field5797 == null) {
                var69 = this.field5704;
                var67 = this.field5730;
                var68 = this.field5691;
                var70 = this.field5736;
            } else {
                var67 = this.field5797.field9421;
                var68 = this.field5797.field9420;
                var69 = this.field5797.field9425;
                var70 = this.field5797.field9427;
            }
            float var71 = 3.0F / (float) this.field5785;
            var12.field6892 = var10;
            float var72 = 3.0F / (float) (this.field5785 + (this.field5785 / 2));
            if (this.field5787.field7921) {
                for (int var76 = 0; var76 < this.field5721; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1987((float) var67[var76] * var72, -368862280);
                        var12.method1987((float) var69[var76] * var72, -368862280);
                        var12.method1987((float) var68[var76] * var72, -368862280);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1987((float) var67[var76] * var78, -368862280);
                        var12.method1987((float) var69[var76] * var78, -368862280);
                        var12.method1987((float) var68[var76] * var78, -368862280);
                    }
                    var12.field6892 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field5721; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1992((float) var67[var73] * var72, 23507);
                        var12.method1992((float) var69[var73] * var72, 23507);
                        var12.method1992((float) var68[var73] * var72, 23507);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1992((float) var67[var73] * var75, 23507);
                        var12.method1992((float) var69[var73] * var75, 23507);
                        var12.method1992((float) var68[var73] * var75, 23507);
                    }
                    var12.field6892 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field6892 = var11;
            if (this.field5787.field7921) {
                for (int var79 = 0; var79 < this.field5721; var79++) {
                    var12.method1987(this.field5728[var79], -368862280);
                    var12.method1987(this.field5740[var79], -368862280);
                    var12.field6892 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field5721; var80++) {
                    var12.method1992(this.field5728[var80], 23507);
                    var12.method1992(this.field5740[var80], 23507);
                    var12.field6892 += var7 - 8;
                }
            }
        }
        var12.field6892 = this.field5721 * var7;
        if (arg0 >= -64) {
            this.field5715 = null;
        }
        class194 var81;
        if (arg1) {
            if (this.field5767 == null) {
                this.field5767 = this.field5787.method3221(-7946, var12.field6892, true, var12.field6855, var7);
            } else {
                this.field5767.method595(var7, var12.field6855, var12.field6892, -24007);
            }
            this.field5738 = 0;
            var81 = this.field5767;
        } else {
            var81 = this.field5787.method3221(-7946, var12.field6892, false, var12.field6855, var7);
            this.field5722 = true;
        }
        if (var5) {
            this.field5710.field6485 = var81;
            this.field5710.field6488 = var8;
        }
        if (var6) {
            this.field5760.field6485 = var81;
            this.field5760.field6488 = var11;
        }
        if (var3) {
            this.field5795.field6485 = var81;
            this.field5795.field6488 = var9;
        }
        if (var4) {
            this.field5800.field6485 = var81;
            this.field5800.field6488 = var10;
        }
    }

    @OriginalMember(owner = "client!os", name = "DA", descriptor = "(SS)V")
    public final void method443(short arg0, short arg1) {
        field5685++;
        class212 var3 = this.field5787.field2418;
        for (int var4 = 0; var4 < this.field5770; var4++) {
            if (this.field5713[var4] == arg0) {
                this.field5713[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class686 var7 = var3.method1365(-17951, arg0 & 0xFFFF);
            var6 = var7.field9783;
            var5 = var7.field9791;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class686 var10 = var3.method1365(-17951, arg1 & 0xFFFF);
            var9 = var10.field9783;
            var8 = var10.field9791;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field5715 != null) {
            for (int var11 = 0; var11 < this.field5790; var11++) {
                class42 var12 = this.field5715[var11];
                class6 var13 = this.field5772[var11];
                var13.field45 = var13.field45 & 0xFF000000 | class78.field1186[this.field5776[var12.field497] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5795 != null) {
            this.field5795.field6485 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!os", name = "F", descriptor = "()Z")
    public final boolean method434() {
        field5706++;
        if (this.field5725 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5753; var1++) {
            this.field5799[var1] <<= 0x4;
            this.field5733[var1] <<= 0x4;
            this.field5758[var1] <<= 0x4;
        }
        class706.field9981 = 0;
        class508.field6964 = 0;
        class182.field2630 = 0;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "T", descriptor = "(I)V")
    public final void method413(int arg0) {
        this.field5700 = (short) arg0;
        if (this.field5795 != null) {
            this.field5795.field6485 = null;
        }
        field5752++;
    }

    @OriginalMember(owner = "client!os", name = "LA", descriptor = "()Z")
    public final boolean method430() {
        field5744++;
        return this.field5711;
    }

    @OriginalMember(owner = "client!os", name = "MA", descriptor = "(I)V")
    public final void method416(int arg0) {
        field5766++;
        int var2 = class597.field8342[arg0];
        int var3 = class597.field8344[arg0];
        for (int var4 = 0; var4 < this.field5698; var4++) {
            int var5 = this.field5733[var4] * var3 - (this.field5758[var4] * var2) >> 14;
            this.field5758[var4] = this.field5758[var4] * var3 + this.field5733[var4] * var2 >> 14;
            this.field5733[var4] = var5;
        }
        this.field5783 = false;
        if (this.field5710 != null) {
            this.field5710.field6485 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)V")
    private final void method2372(boolean arg0, int arg1) {
        if (arg1 <= 39) {
            this.field5783 = true;
        }
        field5794++;
        if (this.field5787.field7899.field6855.length >= this.field5759 * 6) {
            this.field5787.field7899.field6892 = 0;
        } else {
            this.field5787.field7899 = new class340(this.field5759 * 6 + 600);
        }
        class340 var3 = this.field5787.field7899;
        if (this.field5787.field7921) {
            for (int var4 = 0; var4 < this.field5759; var4++) {
                var3.method2837(this.field5705[var4], -2);
                var3.method2837(this.field5714[var4], -2);
                var3.method2837(this.field5692[var4], -2);
            }
        } else {
            for (int var5 = 0; var5 < this.field5759; var5++) {
                var3.method2848((byte) -127, this.field5705[var5]);
                var3.method2848((byte) -119, this.field5714[var5]);
                var3.method2848((byte) -113, this.field5692[var5]);
            }
        }
        if (var3.field6892 == 0) {
            return;
        }
        if (arg0) {
            if (this.field5791 == null) {
                this.field5791 = this.field5787.method3179(var3.field6855, 5123, var3.field6892, 2, true);
            } else {
                this.field5791.method670(var3.field6892, -83, 5123, var3.field6855);
            }
            this.field5754.field6028 = this.field5791;
        } else {
            this.field5754.field6028 = this.field5787.method3179(var3.field6855, 5123, var3.field6892, 2, false);
        }
        if (!arg0) {
            this.field5722 = true;
        }
    }

    @OriginalMember(owner = "client!os", name = "TA", descriptor = "()I")
    public final int method442() {
        field5769++;
        return this.field5700;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method418(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5781++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = 0;
            class182.field2630 = 0;
            class706.field9981 = 0;
            class508.field6964 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field5725.length) {
                    int[] var15 = this.field5725[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class182.field2630 += this.field5799[var17];
                        class706.field9981 += this.field5733[var17];
                        class508.field6964 += this.field5758[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class508.field6964 = class508.field6964 / var12 + var9;
                class182.field2630 = class182.field2630 / var12 + var11;
                class706.field9981 = class706.field9981 / var12 + var10;
            } else {
                class706.field9981 = var10;
                class508.field6964 = var9;
                class182.field2630 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg3 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field5725.length > var22) {
                    int[] var23 = this.field5725[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5799[var25] += var20;
                        this.field5733[var25] += var19;
                        this.field5758[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field5725.length > var45) {
                    int[] var46 = this.field5725[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5799[var59] -= class182.field2630;
                            this.field5733[var59] -= class706.field9981;
                            this.field5758[var59] -= class508.field6964;
                            if (arg4 != 0) {
                                int var60 = class597.field8342[arg4];
                                int var61 = class597.field8344[arg4];
                                int var62 = this.field5799[var59] * var61 + this.field5733[var59] * var60 + 16383 >> 14;
                                this.field5733[var59] = this.field5733[var59] * var61 + 16383 - (this.field5799[var59] * var60) >> 14;
                                this.field5799[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class597.field8342[arg2];
                                int var64 = class597.field8344[arg2];
                                int var65 = this.field5733[var59] * var64 + 16383 - (this.field5758[var59] * var63) >> 14;
                                this.field5758[var59] = this.field5733[var59] * var63 + this.field5758[var59] * var64 + 16383 >> 14;
                                this.field5733[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class597.field8342[arg3];
                                int var67 = class597.field8344[arg3];
                                int var68 = this.field5758[var59] * var66 + this.field5799[var59] * var67 + 16383 >> 14;
                                this.field5758[var59] = this.field5758[var59] * var67 + 16383 - (this.field5799[var59] * var66) >> 14;
                                this.field5799[var59] = var68;
                            }
                            this.field5799[var59] += class182.field2630;
                            this.field5733[var59] += class706.field9981;
                            this.field5758[var59] += class508.field6964;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5799[var48] -= class182.field2630;
                            this.field5733[var48] -= class706.field9981;
                            this.field5758[var48] -= class508.field6964;
                            if (arg2 != 0) {
                                int var49 = class597.field8342[arg2];
                                int var50 = class597.field8344[arg2];
                                int var51 = this.field5733[var48] * var50 + 16383 - (this.field5758[var48] * var49) >> 14;
                                this.field5758[var48] = this.field5758[var48] * var50 + this.field5733[var48] * var49 + 16383 >> 14;
                                this.field5733[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class597.field8342[arg4];
                                int var53 = class597.field8344[arg4];
                                int var54 = this.field5799[var48] * var53 + this.field5733[var48] * var52 + 16383 >> 14;
                                this.field5733[var48] = this.field5733[var48] * var53 + (16383 - (this.field5799[var48] * var52)) >> 14;
                                this.field5799[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class597.field8342[arg3];
                                int var56 = class597.field8344[arg3];
                                int var57 = this.field5758[var48] * var55 + (this.field5799[var48] * var56) + 16383 >> 14;
                                this.field5758[var48] = this.field5758[var48] * var56 + 16383 - (this.field5799[var48] * var55) >> 14;
                                this.field5799[var48] = var57;
                            }
                            this.field5799[var48] += class182.field2630;
                            this.field5733[var48] += class706.field9981;
                            this.field5758[var48] += class508.field6964;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field5725.length) {
                        int[] var29 = this.field5725[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5746[var31];
                            int var33 = this.field5746[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5724[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class597.field8342[arg4];
                                    int var37 = class597.field8344[arg4];
                                    int var38 = this.field5730[var35] * var37 + this.field5704[var35] * var36 + 16383 >> 14;
                                    this.field5704[var35] = (short) (this.field5704[var35] * var37 + 16383 - (this.field5730[var35] * var36) >> 14);
                                    this.field5730[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class597.field8342[arg2];
                                    int var40 = class597.field8344[arg2];
                                    int var41 = this.field5704[var35] * var40 + 16383 - (this.field5691[var35] * var39) >> 14;
                                    this.field5691[var35] = (short) (this.field5704[var35] * var39 + this.field5691[var35] * var40 + 16383 >> 14);
                                    this.field5704[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class597.field8342[arg3];
                                    int var43 = class597.field8344[arg3];
                                    int var44 = this.field5691[var35] * var42 + (this.field5730[var35] * var43 + 16383) >> 14;
                                    this.field5691[var35] = (short) (this.field5691[var35] * var43 + 16383 - (this.field5730[var35] * var42) >> 14);
                                    this.field5730[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field5800 == null && this.field5795 != null) {
                    this.field5795.field6485 = null;
                }
                if (this.field5800 != null) {
                    this.field5800.field6485 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field5725.length > var70) {
                    int[] var71 = this.field5725[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5799[var73] -= class182.field2630;
                        this.field5733[var73] -= class706.field9981;
                        this.field5758[var73] -= class508.field6964;
                        this.field5799[var73] = this.field5799[var73] * arg2 >> 7;
                        this.field5733[var73] = this.field5733[var73] * arg3 >> 7;
                        this.field5758[var73] = this.field5758[var73] * arg4 >> 7;
                        this.field5799[var73] += class182.field2630;
                        this.field5733[var73] += class706.field9981;
                        this.field5758[var73] += class508.field6964;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5749 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field5749.length) {
                        int[] var79 = this.field5749[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field5695[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field5695[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field5795 != null) {
                            this.field5795.field6485 = null;
                        }
                    }
                }
                if (this.field5715 != null) {
                    for (int var75 = 0; var75 < this.field5790; var75++) {
                        class42 var76 = this.field5715[var75];
                        class6 var77 = this.field5772[var75];
                        var77.field45 = var77.field45 & 0xFFFFFF | 255 - (this.field5695[var76.field497] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5749 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field5749.length > var87) {
                        int[] var88 = this.field5749[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field5776[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3AD) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = arg2 + var92 & 0x3F;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            int var97 = arg4 + var94;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field5776[var90] = (short) class647.method3617(class647.method3617(var95 << 7, var96 << 10), var97);
                        }
                        if (var88.length > 0 && this.field5795 != null) {
                            this.field5795.field6485 = null;
                        }
                    }
                }
                if (this.field5715 != null) {
                    for (int var84 = 0; var84 < this.field5790; var84++) {
                        class42 var85 = this.field5715[var84];
                        class6 var86 = this.field5772[var84];
                        var86.field45 = var86.field45 & 0xFF000000 | class78.field1186[this.field5776[var85.field497] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5726 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field5726.length > var99) {
                        int[] var100 = this.field5726[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class6 var102 = this.field5772[var100[var101]];
                            var102.field47 += arg2;
                            var102.field50 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5726 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field5726.length > var104) {
                        int[] var105 = this.field5726[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class6 var107 = this.field5772[var105[var106]];
                            var107.field49 = var107.field49 * arg3 >> 7;
                            var107.field51 = var107.field51 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5726 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field5726.length > var109) {
                    int[] var110 = this.field5726[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class6 var112 = this.field5772[var110[var111]];
                        var112.field52 = var112.field52 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lq;Let;II)V")
    public final void method453(class392 arg0, class551 arg1, int arg2, int arg3) {
        field5771++;
        if (this.field5721 == 0) {
            return;
        }
        class561 var5 = this.field5787.field7866;
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        class561 var6 = (class561) arg0;
        class95.field1334 = var5.field7558 * var6.field7560 + var5.field7576 * var6.field7585 + var5.field7556 * var6.field7582 + var5.field7560;
        class62.field707 = var5.field7558 * var6.field7556 + var5.field7576 * var6.field7552 + var5.field7556 * var6.field7578;
        float var7 = (float) this.field5756 * class62.field707 + class95.field1334;
        float var8 = (float) this.field5688 * class62.field707 + class95.field1334;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) (-this.field5689) + var8;
            var10 = (float) this.field5689 + var7;
        } else {
            var10 = (float) this.field5689 + var8;
            var9 = (float) (-this.field5689) + var7;
        }
        if ((this.field5787.field7902 <= var9) || ((float) this.field5787.field7874 >= var10)) {
            return;
        }
        class93.field1330 = var5.field7563 * var6.field7560 + var5.field7559 * var6.field7585 + var5.field7552 * var6.field7582 + var5.field7585;
        class506.field6946 = var5.field7563 * var6.field7556 + var5.field7559 * var6.field7552 + var5.field7552 * var6.field7578;
        float var11 = (float) this.field5756 * class506.field6946 + class93.field1330;
        float var12 = (float) this.field5688 * class506.field6946 + class93.field1330;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) (-this.field5689) + var12) * (float) this.field5787.field7956;
            var14 = ((float) this.field5689 + var11) * (float) this.field5787.field7956;
        } else {
            var14 = ((float) this.field5689 + var12) * (float) this.field5787.field7956;
            var13 = ((float) (-this.field5689) + var11) * (float) this.field5787.field7956;
        }
        if ((this.field5787.field7978 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field5787.field7972)) {
            return;
        }
        class441.field6101 = var5.field7550 * var6.field7560 + var5.field7578 * var6.field7582 + var5.field7567 * var6.field7585 + var5.field7582;
        class698.field9913 = var5.field7550 * var6.field7556 + var5.field7578 * var6.field7578 + var5.field7567 * var6.field7552;
        float var15 = (float) this.field5756 * class698.field9913 + class441.field6101;
        float var16 = (float) this.field5688 * class698.field9913 + class441.field6101;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) (-this.field5689) + var16) * (float) this.field5787.field7924;
            var18 = ((float) this.field5689 + var15) * (float) this.field5787.field7924;
        } else {
            var17 = ((float) (-this.field5689) + var15) * (float) this.field5787.field7924;
            var18 = ((float) this.field5689 + var16) * (float) this.field5787.field7924;
        }
        if ((var17 / (float) arg2 >= this.field5787.field7925) || (this.field5787.field7927 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field5715 != null) {
            class291.field3998 = var5.field7563 * var6.field7576 + var5.field7559 * var6.field7559 + var5.field7552 * var6.field7567;
            class21.field241 = var5.field7558 * var6.field7576 + var5.field7576 * var6.field7559 + var5.field7556 * var6.field7567;
            class593.field8296 = var5.field7558 * var6.field7558 + var5.field7576 * var6.field7563 + var5.field7556 * var6.field7550;
            class111.field1541 = var5.field7563 * var6.field7558 + var5.field7559 * var6.field7563 + var5.field7552 * var6.field7550;
            class263.field3564 = var5.field7550 * var6.field7558 + var5.field7578 * var6.field7550 + var5.field7567 * var6.field7563;
            class416.field5871 = var5.field7550 * var6.field7576 + var5.field7578 * var6.field7567 + var5.field7567 * var6.field7559;
        }
        if (arg1 != null) {
            int var19 = this.field5784 + this.field5768 >> 1;
            int var20 = this.field5802 + this.field5707 >> 1;
            int var21 = (int) ((float) var20 * class111.field1541 + (float) this.field5756 * class506.field6946 + (float) var19 * class291.field3998 + class93.field1330);
            int var22 = (int) ((float) var20 * class263.field3564 + (float) this.field5756 * class698.field9913 + (float) var19 * class416.field5871 + class441.field6101);
            int var23 = (int) ((float) var20 * class593.field8296 + (float) this.field5756 * class62.field707 + (float) var19 * class21.field241 + class95.field1334);
            int var24 = (int) ((float) var20 * class111.field1541 + (float) this.field5688 * class506.field6946 + (float) var19 * class291.field3998 + class93.field1330);
            int var25 = (int) ((float) var20 * class263.field3564 + (float) this.field5688 * class698.field9913 + (float) var19 * class416.field5871 + class441.field6101);
            int var26 = (int) ((float) var20 * class593.field8296 + (float) this.field5688 * class62.field707 + (float) var19 * class21.field241 + class95.field1334);
            arg1.field7447 = this.field5787.field7956 * var24 / arg2 + this.field5787.field7950;
            arg1.field7445 = this.field5787.field7956 * var21 / arg2 + this.field5787.field7950;
            arg1.field7442 = this.field5787.field7924 * var22 / arg2 + this.field5787.field7964;
            arg1.field7446 = this.field5787.field7964 + (this.field5787.field7924 * var25 / arg2);
            if (var23 >= this.field5787.field7874 || this.field5787.field7874 <= var26) {
                arg1.field7443 = this.field5787.field7950 - (arg1.field7445 - ((var21 + this.field5689) * this.field5787.field7956 / arg2));
                arg1.field7444 = true;
            }
        }
        this.field5787.method3207((float) arg2, -4);
        this.field5787.method3169(false);
        this.field5787.method3181(0, var6);
        this.method2376(0);
        this.field5787.method3174(0);
        this.method2366(-123);
    }

    @OriginalMember(owner = "client!os", name = "ba", descriptor = "(IILi;Li;III)V")
    public final void method435(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6) {
        field5780++;
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        int var8 = this.field5784 + arg4;
        int var9 = arg4 + this.field5768;
        int var10 = this.field5707 + arg6;
        int var11 = arg6 + this.field5802;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (arg2.field441 + var9 >> arg2.field447) >= arg2.field446 || var10 < 0 || (arg2.field441 + var11 >> arg2.field447) >= arg2.field438) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (var9 + arg3.field441 >> arg3.field447) >= arg3.field446 || var10 < 0 || (arg3.field441 + var11 >> arg3.field447) >= arg3.field438) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field447;
            int var13 = arg2.field441 - (1 - var9) >> arg2.field447;
            int var14 = var10 >> arg2.field447;
            int var15 = arg2.field441 + var11 - 1 >> arg2.field447;
            if (arg2.method332(var14, 1, var12) == arg5 && arg5 == arg2.method332(var14, 1, var13) && arg5 == arg2.method332(var15, 1, var12) && arg5 == arg2.method332(var15, 1, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field5698; var16++) {
                this.field5733[var16] = (this.field5733[var16] + arg2.method331(this.field5758[var16] + arg6, (byte) 50, this.field5799[var16] + arg4)) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field5756;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field5698; var18++) {
                int var19 = (this.field5733[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field5733[var18] += (arg1 - var19) * (arg2.method331(this.field5758[var18] + arg6, (byte) 50, this.field5799[var18] + arg4) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = ((arg1 & 0xFFC9) >> 8) * 4;
            int var22 = (arg1 & 0xFFBA96) >> 16 << 6;
            int var23 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var20 >> 1)) < 0 || arg2.field446 << arg2.field447 <= (var20 >> 1) + arg4 + arg2.field441 || (arg6 - (var21 >> 1)) < 0 || arg2.field438 << arg2.field447 <= arg6 + (var21 >> 1) + arg2.field441) {
                return;
            }
            this.method441(arg4, var21, var22, arg6, arg5, var20, var23, (byte) -79, arg2);
        } else if (arg0 == 4) {
            int var31 = this.field5688 - this.field5756;
            for (int var32 = 0; var32 < this.field5698; var32++) {
                this.field5733[var32] = this.field5733[var32] + var31 + arg3.method331(this.field5758[var32] + arg6, (byte) 50, this.field5799[var32] + arg4) - arg5;
            }
        } else if (arg0 == 5) {
            int var24 = this.field5688 - this.field5756;
            for (int var25 = 0; var25 < this.field5698; var25++) {
                int var26 = this.field5799[var25] + arg4;
                int var27 = this.field5758[var25] + arg6;
                int var28 = arg2.method331(var27, (byte) 50, var26);
                int var29 = arg3.method331(var27, (byte) 50, var26);
                int var30 = var28 - var29 - arg1;
                this.field5733[var25] = ((this.field5733[var25] << 8) / var24 * var30 >> 8) + var28 - arg5;
            }
        }
        this.field5783 = false;
        if (this.field5710 != null) {
            this.field5710.field6485 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "S", descriptor = "(Lha;)Lha;")
    public final class54 method414(class54 arg0) {
        field5750++;
        if (this.field5721 == 0) {
            return null;
        }
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        int var2;
        int var3;
        if (this.field5787.field7977 > 0) {
            var2 = this.field5784 - (this.field5787.field7977 * this.field5688 >> 8) >> this.field5787.field7830;
            var3 = this.field5768 - (this.field5787.field7977 * this.field5756 >> 8) >> this.field5787.field7830;
        } else {
            var2 = this.field5784 - (this.field5787.field7977 * this.field5756 >> 8) >> this.field5787.field7830;
            var3 = this.field5768 - (this.field5787.field7977 * this.field5688 >> 8) >> this.field5787.field7830;
        }
        int var4;
        int var5;
        if (this.field5787.field7894 <= 0) {
            var4 = this.field5707 - (this.field5787.field7894 * this.field5756 >> 8) >> this.field5787.field7830;
            var5 = this.field5802 - (this.field5787.field7894 * this.field5688 >> 8) >> this.field5787.field7830;
        } else {
            var4 = this.field5707 - (this.field5787.field7894 * this.field5688 >> 8) >> this.field5787.field7830;
            var5 = this.field5802 - (this.field5787.field7894 * this.field5756 >> 8) >> this.field5787.field7830;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class310 var8 = (class310) arg0;
        class310 var9;
        if (var8 != null && var8.method1875(var6, -116, var7)) {
            var9 = var8;
            var8.method1878(-393275152);
        } else {
            var9 = new class310(this.field5787, var6, var7);
        }
        var9.method1877(var5, var2, var3, var4, 84);
        this.method2370((byte) -15, var9);
        return var9;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZILq;ZI)Z")
    private final boolean method2373(int arg0, boolean arg1, int arg2, class392 arg3, boolean arg4, int arg5) {
        field5732++;
        class561 var7 = (class561) arg3;
        class561 var8 = this.field5787.field7866;
        float var9 = var7.field7560 * var8.field7563 + var7.field7585 * var8.field7559 + var7.field7582 * var8.field7552 + var8.field7585;
        float var10 = var7.field7560 * var8.field7550 + var7.field7585 * var8.field7567 + var7.field7582 * var8.field7578 + var8.field7582;
        class291.field3998 = var7.field7576 * var8.field7563 + var7.field7567 * var8.field7552 + var7.field7559 * var8.field7559;
        class416.field5871 = var7.field7576 * var8.field7550 + var7.field7567 * var8.field7578 + var7.field7559 * var8.field7567;
        class111.field1541 = var7.field7558 * var8.field7563 + var7.field7563 * var8.field7559 + var7.field7550 * var8.field7552;
        class21.field241 = var7.field7576 * var8.field7558 + var7.field7567 * var8.field7556 + var7.field7559 * var8.field7576;
        float var11 = var7.field7560 * var8.field7558 + var7.field7585 * var8.field7576 + var7.field7582 * var8.field7556 + var8.field7560;
        class593.field8296 = var7.field7558 * var8.field7558 + var7.field7563 * var8.field7576 + var7.field7550 * var8.field7556;
        class698.field9913 = var7.field7556 * var8.field7550 + var7.field7578 * var8.field7578 + var7.field7552 * var8.field7567;
        class62.field707 = var7.field7556 * var8.field7558 + var7.field7578 * var8.field7556 + var7.field7552 * var8.field7576;
        class263.field3564 = var7.field7558 * var8.field7550 + var7.field7563 * var8.field7567 + var7.field7550 * var8.field7578;
        class506.field6946 = var7.field7556 * var8.field7563 + var7.field7578 * var8.field7552 + var7.field7552 * var8.field7559;
        boolean var12 = arg4;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field5787.field7956;
        int var18 = this.field5787.field7924;
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        class414.field5858[0] = this.field5784;
        class521.field7086[0] = this.field5756;
        class558.field7521[0] = this.field5707;
        class414.field5858[1] = this.field5768;
        class521.field7086[1] = this.field5756;
        class414.field5858[2] = this.field5784;
        class558.field7521[1] = this.field5707;
        class521.field7086[2] = this.field5688;
        class414.field5858[3] = this.field5768;
        class558.field7521[2] = this.field5707;
        class521.field7086[3] = this.field5688;
        class558.field7521[3] = this.field5707;
        class414.field5858[4] = this.field5784;
        class521.field7086[4] = this.field5756;
        class414.field5858[5] = this.field5768;
        class558.field7521[4] = this.field5802;
        class521.field7086[5] = this.field5756;
        class414.field5858[6] = this.field5784;
        class558.field7521[5] = this.field5802;
        class521.field7086[6] = this.field5688;
        class414.field5858[7] = this.field5768;
        class558.field7521[6] = this.field5802;
        class521.field7086[7] = this.field5688;
        class558.field7521[7] = this.field5802;
        for (int var19 = 0; var19 < 8; var19++) {
            float var40 = (float) class521.field7086[var19];
            float var41 = (float) class414.field5858[var19];
            float var42 = (float) class558.field7521[var19];
            float var43 = class593.field8296 * var42 + class62.field707 * var40 + class21.field241 * var41 + var11;
            float var44 = class263.field3564 * var42 + class698.field9913 * var40 + class416.field5871 * var41 + var10;
            float var45 = class111.field1541 * var42 + class506.field6946 * var40 + class291.field3998 * var41 + var9;
            if (var43 >= (float) this.field5787.field7874) {
                if (arg5 > 0) {
                    var43 = arg5;
                }
                float var46 = (float) var17 * var45 / var43 + (float) this.field5787.field7950;
                if (var46 > var14) {
                    var14 = var46;
                }
                float var47 = (float) var18 * var44 / var43 + (float) this.field5787.field7964;
                if (var46 < var13) {
                    var13 = var46;
                }
                if (var47 < var15) {
                    var15 = var47;
                }
                if (var47 > var16) {
                    var16 = var47;
                }
                var12 = true;
            }
        }
        if (var12 && var13 < (float) arg2 && var14 > (float) arg2 && var15 < (float) arg0 && (float) arg0 < var16) {
            if (arg1) {
                return true;
            }
            if (this.field5787.field7984.length < this.field5721) {
                this.field5787.field7981 = new int[this.field5721];
                this.field5787.field7984 = new int[this.field5721];
            }
            int[] var20 = this.field5787.field7984;
            int[] var21 = this.field5787.field7981;
            for (int var22 = 0; var22 < this.field5698; var22++) {
                float var24 = (float) this.field5758[var22];
                float var25 = (float) this.field5733[var22];
                float var26 = (float) this.field5799[var22];
                float var27 = class593.field8296 * var24 + class62.field707 * var25 + class21.field241 * var26 + var11;
                float var28 = class263.field3564 * var24 + class698.field9913 * var25 + class416.field5871 * var26 + var10;
                float var29 = class111.field1541 * var24 + class506.field6946 * var25 + class291.field3998 * var26 + var9;
                if ((var27 >= (float) this.field5787.field7874)) {
                    if (arg5 > 0) {
                        var27 = arg5;
                    }
                    int var34 = (int) ((float) var17 * var29 / var27 + (float) this.field5787.field7950);
                    int var35 = (int) ((float) var18 * var28 / var27 + (float) this.field5787.field7964);
                    int var36 = this.field5746[var22];
                    int var37 = this.field5746[var22 + 1];
                    for (int var38 = var36; var38 < var37; var38++) {
                        int var39 = this.field5724[var38] - 1;
                        if (var39 == -1) {
                            break;
                        }
                        var20[var39] = var34;
                        var21[var39] = var35;
                    }
                } else {
                    int var30 = this.field5746[var22];
                    int var31 = this.field5746[var22 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field5724[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var20[this.field5724[var32] - 1] = -999999;
                    }
                }
            }
            for (int var23 = 0; var23 < this.field5770; var23++) {
                if (var20[this.field5705[var23]] != -999999 && var20[this.field5714[var23]] != -999999 && var20[this.field5692[var23]] != -999999 && this.method2378(var21[this.field5705[var23]], var21[this.field5714[var23]], 255, var20[this.field5705[var23]], var21[this.field5692[var23]], arg0, arg2, var20[this.field5692[var23]], var20[this.field5714[var23]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIII)V")
    public final void method458(int arg0, int arg1, int arg2, int arg3) {
        field5731++;
        for (int var5 = 0; var5 < this.field5770; var5++) {
            int var9 = this.field5776[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field5776[var5] = (short) class647.method3617(class647.method3617(var11 << 7, var10 << 10), var12);
        }
        if (this.field5715 != null) {
            for (int var6 = 0; var6 < this.field5790; var6++) {
                class42 var7 = this.field5715[var6];
                class6 var8 = this.field5772[var6];
                var8.field45 = var8.field45 & 0xFF000000 | class78.field1186[this.field5776[var7.field497] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5795 != null) {
            this.field5795.field6485 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(II)V")
    public static final void method2374(int arg0, int arg1) {
        field5774++;
        if (arg1 >= -54) {
            field5703 = -100;
        }
        class485.field6664 = arg0;
        class623.field8642.method3749(7648);
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "()Z")
    public final boolean method459() {
        field5729++;
        if (this.field5713 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5713.length; var1++) {
            if (this.field5713[var1] != -1 && !this.field5787.field2418.method1367(this.field5713[var1], false)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILnba;FIIIFIIJ)S")
    private final short method2375(int arg0, class270 arg1, float arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8, long arg9) {
        field5718++;
        int var12 = this.field5746[arg4];
        int var13 = this.field5746[arg4 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field5724[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class152.field2220[var15] == arg9) {
                return (short) (var16 - 1);
            }
        }
        this.field5724[var14] = (short) (this.field5721 + 1);
        class152.field2220[var14] = arg9;
        this.field5730[this.field5721] = (short) arg7;
        this.field5704[this.field5721] = (short) arg3;
        this.field5691[this.field5721] = (short) arg5;
        this.field5736[this.field5721] = (byte) arg0;
        if (arg8 == -1685278802) {
            this.field5728[this.field5721] = arg6;
            this.field5740[this.field5721] = arg2;
            return (short) (this.field5721++);
        } else {
            return -13;
        }
    }

    @OriginalMember(owner = "client!os", name = "K", descriptor = "()I")
    public final int method450() {
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        field5717++;
        return this.field5689;
    }

    @OriginalMember(owner = "client!os", name = "WA", descriptor = "(IIII)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3) {
        field5763++;
        if (arg0 == 0) {
            int var5 = 0;
            class182.field2630 = 0;
            class706.field9981 = 0;
            class508.field6964 = 0;
            for (int var6 = 0; var6 < this.field5698; var6++) {
                class182.field2630 += this.field5799[var6];
                class706.field9981 += this.field5733[var6];
                var5++;
                class508.field6964 += this.field5758[var6];
            }
            if (var5 <= 0) {
                class706.field9981 = arg2;
                class508.field6964 = arg3;
                class182.field2630 = arg1;
            } else {
                class706.field9981 = class706.field9981 / var5 + arg2;
                class508.field6964 = class508.field6964 / var5 + arg3;
                class182.field2630 = class182.field2630 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5698; var7++) {
                this.field5799[var7] += arg1;
                this.field5733[var7] += arg2;
                this.field5758[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5698; var8++) {
                this.field5799[var8] -= class182.field2630;
                this.field5733[var8] -= class706.field9981;
                this.field5758[var8] -= class508.field6964;
                if (arg3 != 0) {
                    int var9 = class597.field8342[arg3];
                    int var10 = class597.field8344[arg3];
                    int var11 = this.field5733[var8] * var9 + (this.field5799[var8] * var10) + 16383 >> 14;
                    this.field5733[var8] = this.field5733[var8] * var10 + 16383 - (this.field5799[var8] * var9) >> 14;
                    this.field5799[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class597.field8342[arg1];
                    int var13 = class597.field8344[arg1];
                    int var14 = this.field5733[var8] * var13 + 16383 - this.field5758[var8] * var12 >> 14;
                    this.field5758[var8] = this.field5733[var8] * var12 + this.field5758[var8] * var13 + 16383 >> 14;
                    this.field5733[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class597.field8342[arg2];
                    int var16 = class597.field8344[arg2];
                    int var17 = this.field5799[var8] * var16 + this.field5758[var8] * var15 + 16383 >> 14;
                    this.field5758[var8] = this.field5758[var8] * var16 + 16383 - (this.field5799[var8] * var15) >> 14;
                    this.field5799[var8] = var17;
                }
                this.field5799[var8] += class182.field2630;
                this.field5733[var8] += class706.field9981;
                this.field5758[var8] += class508.field6964;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5698; var18++) {
                this.field5799[var18] -= class182.field2630;
                this.field5733[var18] -= class706.field9981;
                this.field5758[var18] -= class508.field6964;
                this.field5799[var18] = this.field5799[var18] * arg1 / 128;
                this.field5733[var18] = this.field5733[var18] * arg2 / 128;
                this.field5758[var18] = this.field5758[var18] * arg3 / 128;
                this.field5799[var18] += class182.field2630;
                this.field5733[var18] += class706.field9981;
                this.field5758[var18] += class508.field6964;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5770; var19++) {
                int var23 = (this.field5695[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5695[var19] = (byte) var23;
            }
            if (this.field5795 != null) {
                this.field5795.field6485 = null;
            }
            if (this.field5715 != null) {
                for (int var20 = 0; var20 < this.field5790; var20++) {
                    class42 var21 = this.field5715[var20];
                    class6 var22 = this.field5772[var20];
                    var22.field45 = var22.field45 & 0xFFFFFF | 255 - (this.field5695[var21.field497] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5770; var24++) {
                int var28 = this.field5776[var24] & 0xFFFF;
                int var29 = (var28 & 0xFFBF) >> 10;
                int var30 = (var28 & 0x3E3) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = arg1 + var29 & 0x3F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field5776[var24] = (short) class647.method3617(class647.method3617(var32 << 7, var33 << 10), var34);
            }
            if (this.field5795 != null) {
                this.field5795.field6485 = null;
            }
            if (this.field5715 != null) {
                for (int var25 = 0; var25 < this.field5790; var25++) {
                    class42 var26 = this.field5715[var25];
                    class6 var27 = this.field5772[var25];
                    var27.field45 = var27.field45 & 0xFF000000 | class78.field1186[this.field5776[var26.field497] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5790; var35++) {
                class6 var36 = this.field5772[var35];
                var36.field47 += arg1;
                var36.field50 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5790; var37++) {
                class6 var38 = this.field5772[var37];
                var38.field51 = var38.field51 * arg1 >> 7;
                var38.field49 = var38.field49 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5790; var39++) {
                class6 var40 = this.field5772[var39];
                var40.field52 = var40.field52 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "FA", descriptor = "()V")
    public final void method438() {
        field5743++;
        for (int var1 = 0; var1 < this.field5698; var1++) {
            this.field5758[var1] = -this.field5758[var1];
        }
        for (int var2 = 0; var2 < this.field5721; var2++) {
            this.field5691[var2] = (short) (-this.field5691[var2]);
        }
        for (int var3 = 0; var3 < this.field5770; var3++) {
            short var4 = this.field5705[var3];
            this.field5705[var3] = this.field5692[var3];
            this.field5692[var3] = var4;
        }
        if (this.field5800 == null && this.field5795 != null) {
            this.field5795.field6485 = null;
        }
        if (this.field5800 != null) {
            this.field5800.field6485 = null;
        }
        this.field5783 = false;
        if (this.field5754 != null) {
            this.field5754.field6028 = null;
        }
        if (this.field5710 != null) {
            this.field5710.field6485 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "W", descriptor = "(I)V")
    public final void method445(int arg0) {
        field5708++;
        int var2 = class597.field8342[arg0];
        int var3 = class597.field8344[arg0];
        for (int var4 = 0; var4 < this.field5698; var4++) {
            int var5 = this.field5799[var4] * var3 + this.field5733[var4] * var2 >> 14;
            this.field5733[var4] = this.field5733[var4] * var3 - (this.field5799[var4] * var2) >> 14;
            this.field5799[var4] = var5;
        }
        if (this.field5710 != null) {
            this.field5710.field6485 = null;
        }
        this.field5783 = false;
    }

    @OriginalMember(owner = "client!os", name = "fa", descriptor = "(I)V")
    public final void method423(int arg0) {
        field5687++;
        int var2 = class597.field8342[arg0];
        int var3 = class597.field8344[arg0];
        for (int var4 = 0; var4 < this.field5698; var4++) {
            int var7 = this.field5799[var4] * var3 + this.field5758[var4] * var2 >> 14;
            this.field5758[var4] = this.field5758[var4] * var3 - (this.field5799[var4] * var2) >> 14;
            this.field5799[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5721; var5++) {
            int var6 = this.field5730[var5] * var3 + this.field5691[var5] * var2 >> 14;
            this.field5691[var5] = (short) (this.field5691[var5] * var3 - (this.field5730[var5] * var2) >> 14);
            this.field5730[var5] = (short) var6;
        }
        if (this.field5800 == null && this.field5795 != null) {
            this.field5795.field6485 = null;
        }
        if (this.field5800 != null) {
            this.field5800.field6485 = null;
        }
        this.field5783 = false;
        if (this.field5710 != null) {
            this.field5710.field6485 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V")
    private final void method2376(int arg0) {
        field5798++;
        if (this.field5759 == 0) {
            return;
        }
        if (this.field5738 != 0) {
            this.method2371((byte) -117, true);
        }
        if (arg0 != 0) {
            return;
        }
        this.method2371((byte) -106, false);
        if (this.field5754 != null) {
            if (this.field5754.field6028 == null) {
                this.method2372((this.field5738 & 0x10) != 0, 60);
            }
            if (this.field5754.field6028 != null) {
                this.field5787.method3195((byte) 18, this.field5800 != null);
                this.field5787.method3208(this.field5760, (byte) 66, this.field5800, this.field5710, this.field5795);
                int var2 = this.field5741.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5741[var3];
                    int var5 = this.field5741[var3 + 1];
                    int var6 = this.field5713[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field5787.method3215(var6, this.field5800 != null, (byte) 105);
                    this.field5787.method3235((var5 - var4) * 3, var4 * 3, this.field5754.field6028, false, 4);
                }
            }
        }
        this.method2369(true);
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "()V")
    public final void method436() {
        field5702++;
    }

    @OriginalMember(owner = "client!os", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final void method421(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5788++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class508.field6964 = 0;
            class706.field9981 = 0;
            int var13 = 0;
            class182.field2630 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5725.length) {
                    int[] var16 = this.field5725[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5693 == null || (arg6 & this.field5693[var18]) != 0) {
                            class182.field2630 += this.field5799[var18];
                            class706.field9981 += this.field5733[var18];
                            class508.field6964 += this.field5758[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class701.field9941 = true;
                class706.field9981 = class706.field9981 / var13 + var10;
                class508.field6964 = class508.field6964 / var13 + var12;
                class182.field2630 = class182.field2630 / var13 + var11;
            } else {
                class706.field9981 = var10;
                class182.field2630 = var11;
                class508.field6964 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + (arg7[2] * arg4) + arg7[1] * arg3 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + (arg7[5] * arg4) + arg7[4] * arg3 + 8192 >> 14;
                int var21 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
                arg3 = var20;
                arg4 = var21;
                arg2 = var19;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5725.length) {
                    int[] var27 = this.field5725[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5693 == null || (arg6 & this.field5693[var29]) != 0) {
                            this.field5799[var29] += var22;
                            this.field5733[var29] += var23;
                            this.field5758[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field5725.length > var109) {
                        int[] var110 = this.field5725[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field5693 == null || (this.field5693[var112] & arg6) != 0) {
                                this.field5799[var112] -= class182.field2630;
                                this.field5733[var112] -= class706.field9981;
                                this.field5758[var112] -= class508.field6964;
                                if (arg4 != 0) {
                                    int var113 = class597.field8342[arg4];
                                    int var114 = class597.field8344[arg4];
                                    int var115 = this.field5733[var112] * var113 + this.field5799[var112] * var114 + 16383 >> 14;
                                    this.field5733[var112] = this.field5733[var112] * var114 + (16383 - (this.field5799[var112] * var113)) >> 14;
                                    this.field5799[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class597.field8342[arg2];
                                    int var117 = class597.field8344[arg2];
                                    int var118 = this.field5733[var112] * var117 + 16383 - (this.field5758[var112] * var116) >> 14;
                                    this.field5758[var112] = this.field5733[var112] * var116 - (-(this.field5758[var112] * var117) - 16383) >> 14;
                                    this.field5733[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class597.field8342[arg3];
                                    int var120 = class597.field8344[arg3];
                                    int var121 = this.field5758[var112] * var119 + this.field5799[var112] * var120 + 16383 >> 14;
                                    this.field5758[var112] = this.field5758[var112] * var120 + 16383 - (this.field5799[var112] * var119) >> 14;
                                    this.field5799[var112] = var121;
                                }
                                this.field5799[var112] += class182.field2630;
                                this.field5733[var112] += class706.field9981;
                                this.field5758[var112] += class508.field6964;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field5725.length) {
                            int[] var93 = this.field5725[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field5693 == null || (arg6 & this.field5693[var95]) != 0) {
                                    int var96 = this.field5746[var95];
                                    int var97 = this.field5746[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field5724[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class597.field8342[arg4];
                                            int var101 = class597.field8344[arg4];
                                            int var102 = this.field5704[var99] * var100 - (-(this.field5730[var99] * var101) - 16383) >> 14;
                                            this.field5704[var99] = (short) (this.field5704[var99] * var101 + 16383 - (this.field5730[var99] * var100) >> 14);
                                            this.field5730[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class597.field8342[arg2];
                                            int var104 = class597.field8344[arg2];
                                            int var105 = this.field5704[var99] * var104 + 16383 - (this.field5691[var99] * var103) >> 14;
                                            this.field5691[var99] = (short) (this.field5704[var99] * var103 + this.field5691[var99] * var104 + 16383 >> 14);
                                            this.field5704[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class597.field8342[arg3];
                                            int var107 = class597.field8344[arg3];
                                            int var108 = this.field5691[var99] * var106 - (-(this.field5730[var99] * var107) - 16383) >> 14;
                                            this.field5691[var99] = (short) (this.field5691[var99] * var107 + 16383 - (this.field5730[var99] * var106) >> 14);
                                            this.field5730[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5800 == null && this.field5795 != null) {
                        this.field5795.field6485 = null;
                    }
                    if (this.field5800 != null) {
                        this.field5800.field6485 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class701.field9941) {
                    int var36 = arg7[0] * class182.field2630 - (-(arg7[3] * class706.field9981) - (arg7[6] * class508.field6964) - 8192) >> 14;
                    int var37 = arg7[1] * class182.field2630 + arg7[7] * class508.field6964 + arg7[4] * class706.field9981 + 8192 >> 14;
                    int var38 = arg7[2] * class182.field2630 + (arg7[8] * class508.field6964) + arg7[5] * class706.field9981 + 8192 >> 14;
                    int var39 = var34 + var37;
                    int var40 = var33 + var36;
                    class182.field2630 = var40;
                    class706.field9981 = var39;
                    int var41 = var35 + var38;
                    class701.field9941 = false;
                    class508.field6964 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class597.field8344[arg2];
                int var44 = class597.field8342[arg2];
                int var45 = class597.field8344[arg3];
                int var46 = class597.field8342[arg3];
                int var47 = class597.field8344[arg4];
                int var48 = class597.field8342[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[5] = -var44;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[6] = -var46 * var47 + (var45 * var50) + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[7] = var46 * var48 + var45 * var49 + 8192 >> 14;
                var42[0] = var45 * var47 + (var46 * var50) + 8192 >> 14;
                var42[1] = -var45 * var48 + (var46 * var49 + 8192) >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                int var51 = var42[1] * -class706.field9981 + var42[0] * -class182.field2630 + (var42[2] * -class508.field6964) + 8192 >> 14;
                int var52 = var42[4] * -class706.field9981 + (var42[3] * -class182.field2630 + (var42[5] * -class508.field6964)) + 8192 >> 14;
                int var53 = var42[7] * -class706.field9981 + var42[6] * -class182.field2630 + var42[8] * -class508.field6964 + 8192 >> 14;
                int var54 = class182.field2630 + var51;
                int var55 = class706.field9981 + var52;
                int var56 = var53 + class508.field6964;
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
                int var60 = var42[4] * var34 + (var42[3] * var33 + (var42[5] * var35)) + 8192 >> 14;
                int var61 = var42[8] * var35 + (var42[6] * var33 + var42[7] * var34 + 8192) >> 14;
                int var62 = var54 + var59;
                int var63 = var55 + var60;
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
                int var67 = arg7[2] * var64 + arg7[1] * var63 + arg7[0] * var62 + 8192 >> 14;
                int var68 = arg7[4] * var63 + arg7[3] * var62 + arg7[5] * var64 + 8192 >> 14;
                int var69 = var31 + var68;
                int var70 = var30 + var67;
                int var71 = arg7[7] * var63 + arg7[6] * var62 + arg7[8] * var64 + 8192 >> 14;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field5725.length) {
                        int[] var75 = this.field5725[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field5693 == null || (this.field5693[var77] & arg6) != 0) {
                                int var78 = this.field5758[var77] * var65[2] + (this.field5799[var77] * var65[0] + (this.field5733[var77] * var65[1]) + 8192) >> 14;
                                int var79 = this.field5799[var77] * var65[3] + this.field5733[var77] * var65[4] + this.field5758[var77] * var65[5] + 8192 >> 14;
                                int var80 = var70 + var78;
                                int var81 = var69 + var79;
                                int var82 = this.field5733[var77] * var65[7] + this.field5799[var77] * var65[6] + this.field5758[var77] * var65[8] + 8192 >> 14;
                                int var83 = var72 + var82;
                                this.field5799[var77] = var80;
                                this.field5733[var77] = var81;
                                this.field5758[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field5725.length) {
                        int[] var124 = this.field5725[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field5693 == null || (arg6 & this.field5693[var126]) != 0) {
                                this.field5799[var126] -= class182.field2630;
                                this.field5733[var126] -= class706.field9981;
                                this.field5758[var126] -= class508.field6964;
                                this.field5799[var126] = this.field5799[var126] * arg2 >> 7;
                                this.field5733[var126] = this.field5733[var126] * arg3 >> 7;
                                this.field5758[var126] = this.field5758[var126] * arg4 >> 7;
                                this.field5799[var126] += class182.field2630;
                                this.field5733[var126] += class706.field9981;
                                this.field5758[var126] += class508.field6964;
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
                if (class701.field9941) {
                    int var133 = arg7[0] * class182.field2630 + (arg7[6] * class508.field6964) + arg7[3] * class706.field9981 + 8192 >> 14;
                    int var134 = arg7[4] * class706.field9981 + arg7[1] * class182.field2630 - (-(arg7[7] * class508.field6964) - 8192) >> 14;
                    int var135 = var130 + var133;
                    int var136 = arg7[2] * class182.field2630 + arg7[5] * class706.field9981 - (-(arg7[8] * class508.field6964) - 8192) >> 14;
                    int var137 = var131 + var134;
                    int var138 = var132 + var136;
                    class706.field9981 = var137;
                    class182.field2630 = var135;
                    class701.field9941 = false;
                    class508.field6964 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class182.field2630 * var139 + 8192 >> 14;
                int var143 = -class706.field9981 * var140 + 8192 >> 14;
                int var144 = -class508.field6964 * var141 + 8192 >> 14;
                int var145 = class182.field2630 + var142;
                int var146 = class706.field9981 + var143;
                int var147 = class508.field6964 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var146 + var150;
                int var152 = var132 * var141 + 8192 >> 14;
                int var153 = var145 + var149;
                int var154 = var147 + var152;
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
                int var157 = arg7[1] * var151 + arg7[2] * var154 + arg7[0] * var153 + 8192 >> 14;
                int var158 = arg7[3] * var153 + arg7[5] * var154 + arg7[4] * var151 + 8192 >> 14;
                int var159 = arg7[8] * var154 + (arg7[6] * var153 + arg7[7] * var151 + 8192) >> 14;
                int var160 = var128 + var158;
                int var161 = var127 + var157;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field5725.length > var164) {
                        int[] var165 = this.field5725[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field5693 == null || (arg6 & this.field5693[var167]) != 0) {
                                int var168 = this.field5758[var167] * var155[2] + this.field5799[var167] * var155[0] + this.field5733[var167] * var155[1] + 8192 >> 14;
                                int var169 = this.field5799[var167] * var155[3] + this.field5758[var167] * var155[5] - (-(this.field5733[var167] * var155[4]) - 8192) >> 14;
                                int var170 = var161 + var168;
                                int var171 = var160 + var169;
                                int var172 = this.field5799[var167] * var155[6] + (this.field5733[var167] * var155[7]) + this.field5758[var167] * var155[8] + 8192 >> 14;
                                this.field5799[var167] = var170;
                                int var173 = var162 + var172;
                                this.field5733[var167] = var171;
                                this.field5758[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5749 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field5749.length) {
                        int[] var182 = this.field5749[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field5719 == null || (this.field5719[var184] & arg6) != 0) {
                                int var185 = (this.field5695[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field5695[var184] = (byte) var185;
                                if (this.field5795 != null) {
                                    this.field5795.field6485 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5715 != null) {
                    for (int var178 = 0; var178 < this.field5790; var178++) {
                        class42 var179 = this.field5715[var178];
                        class6 var180 = this.field5772[var178];
                        var180.field45 = var180.field45 & 0xFFFFFF | 255 - (this.field5695[var179.field497] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5749 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field5749.length > var190) {
                        int[] var191 = this.field5749[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field5719 == null || (this.field5719[var193] & arg6) != 0) {
                                int var194 = this.field5776[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFF4F) >> 10;
                                int var196 = (var194 & 0x3DD) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = var194 & 0x7F;
                                int var200 = arg4 + var199;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field5776[var193] = (short) class647.method3617(var200, class647.method3617(var198 << 10, var197 << 7));
                                if (this.field5795 != null) {
                                    this.field5795.field6485 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5715 != null) {
                    for (int var187 = 0; var187 < this.field5790; var187++) {
                        class42 var188 = this.field5715[var187];
                        class6 var189 = this.field5772[var187];
                        var189.field45 = class78.field1186[this.field5776[var188.field497] & 0xFFFF] & 0xFFFFFF | var189.field45 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5726 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field5726.length > var202) {
                        int[] var203 = this.field5726[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class6 var205 = this.field5772[var203[var204]];
                            var205.field47 += arg2;
                            var205.field50 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5726 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field5726.length) {
                        int[] var208 = this.field5726[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class6 var210 = this.field5772[var208[var209]];
                            var210.field51 = var210.field51 * arg2 >> 7;
                            var210.field49 = var210.field49 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5726 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field5726.length > var212) {
                    int[] var213 = this.field5726[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class6 var215 = this.field5772[var213[var214]];
                        var215.field52 = var215.field52 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "za", descriptor = "()I")
    public final int method466() {
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        field5773++;
        return this.field5802;
    }

    @OriginalMember(owner = "client!os", name = "J", descriptor = "()I")
    public final int method463() {
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        field5764++;
        return this.field5756;
    }

    @OriginalMember(owner = "client!os", name = "OA", descriptor = "()I")
    public final int method420() {
        field5765++;
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        return this.field5707;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "()[Llp;")
    public final class357[] method429() {
        field5696++;
        return this.field5712;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Los;ZIZLos;I)Lda;")
    private final class55 method2377(class407 arg0, boolean arg1, int arg2, boolean arg3, class407 arg4, int arg5) {
        arg0.field5790 = this.field5790;
        field5737++;
        arg0.field5759 = this.field5759;
        arg0.field5745 = arg5;
        arg0.field5751 = this.field5751;
        arg0.field5700 = this.field5700;
        arg0.field5738 = 0;
        arg0.field5785 = this.field5785;
        arg0.field5770 = this.field5770;
        arg0.field5698 = this.field5698;
        if ((arg5 & 0x100) == 0) {
            arg0.field5711 = this.field5711;
        } else {
            arg0.field5711 = true;
        }
        arg0.field5753 = this.field5753;
        arg0.field5721 = this.field5721;
        boolean var7 = class630.method3525(this.field5751, true, arg5);
        boolean var8 = class577.method3293((byte) 126, arg5, this.field5751);
        boolean var9 = class141.method990(this.field5751, arg5, arg2 ^ 0xFFFF95E8);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg0.field5799 = this.field5799;
            } else if (arg4.field5799 == null || arg4.field5799.length < this.field5753) {
                arg0.field5799 = arg4.field5799 = new int[this.field5753];
            } else {
                arg0.field5799 = arg4.field5799;
            }
            if (!var8) {
                arg0.field5733 = this.field5733;
            } else if (arg4.field5733 == null || arg4.field5733.length < this.field5753) {
                arg0.field5733 = arg4.field5733 = new int[this.field5753];
            } else {
                arg0.field5733 = arg4.field5733;
            }
            if (!var9) {
                arg0.field5758 = this.field5758;
            } else if (arg4.field5758 == null || this.field5753 > arg4.field5758.length) {
                arg0.field5758 = arg4.field5758 = new int[this.field5753];
            } else {
                arg0.field5758 = arg4.field5758;
            }
            for (int var11 = 0; var11 < this.field5753; var11++) {
                if (var7) {
                    arg0.field5799[var11] = this.field5799[var11];
                }
                if (var8) {
                    arg0.field5733[var11] = this.field5733[var11];
                }
                if (var9) {
                    arg0.field5758[var11] = this.field5758[var11];
                }
            }
        } else {
            arg0.field5758 = this.field5758;
            arg0.field5733 = this.field5733;
            arg0.field5799 = this.field5799;
        }
        if (class607.method3415(this.field5751, 29965, arg5)) {
            arg0.field5710 = arg4.field5710;
            if (arg1) {
                arg0.field5738 = (byte) (arg0.field5738 | 0x1);
            }
            arg0.field5710.field6488 = this.field5710.field6488;
            arg0.field5710.field6485 = this.field5710.field6485;
        } else if (class308.method1868((byte) -127, this.field5751, arg5)) {
            arg0.field5710 = this.field5710;
        } else {
            arg0.field5710 = null;
        }
        if (class213.method1373(arg5, this.field5751, false)) {
            if (arg4.field5776 == null || this.field5770 > arg4.field5776.length) {
                arg0.field5776 = arg4.field5776 = new short[this.field5770];
            } else {
                arg0.field5776 = arg4.field5776;
            }
            for (int var12 = 0; var12 < this.field5770; var12++) {
                arg0.field5776[var12] = this.field5776[var12];
            }
        } else {
            arg0.field5776 = this.field5776;
        }
        if (class645.method3597(arg5, this.field5751, false)) {
            if (arg4.field5695 == null || this.field5770 > arg4.field5695.length) {
                arg0.field5695 = arg4.field5695 = new byte[this.field5770];
            } else {
                arg0.field5695 = arg4.field5695;
            }
            for (int var13 = 0; var13 < this.field5770; var13++) {
                arg0.field5695[var13] = this.field5695[var13];
            }
        } else {
            arg0.field5695 = this.field5695;
        }
        if (class66.method559(arg5, this.field5751, false)) {
            if (arg1) {
                arg0.field5738 = (byte) (arg0.field5738 | 0x2);
            }
            arg0.field5795 = arg4.field5795;
            arg0.field5795.field6488 = this.field5795.field6488;
            arg0.field5795.field6485 = this.field5795.field6485;
        } else if (class344.method2008((byte) -7, arg5, this.field5751)) {
            arg0.field5795 = this.field5795;
        } else {
            arg0.field5795 = null;
        }
        if (class91.method662(arg2 - 2, this.field5751, arg5)) {
            if (arg4.field5730 == null || arg4.field5730.length < this.field5721) {
                int var14 = this.field5721;
                arg0.field5704 = arg4.field5704 = new short[var14];
                arg0.field5691 = arg4.field5691 = new short[var14];
                arg0.field5730 = arg4.field5730 = new short[var14];
            } else {
                arg0.field5730 = arg4.field5730;
                arg0.field5691 = arg4.field5691;
                arg0.field5704 = arg4.field5704;
            }
            if (this.field5797 == null) {
                for (int var15 = 0; var15 < this.field5721; var15++) {
                    arg0.field5730[var15] = this.field5730[var15];
                    arg0.field5704[var15] = this.field5704[var15];
                    arg0.field5691[var15] = this.field5691[var15];
                }
            } else {
                if (arg4.field5797 == null) {
                    arg4.field5797 = new class672();
                }
                class672 var16 = arg0.field5797 = arg4.field5797;
                if (var16.field9421 == null || var16.field9421.length < this.field5721) {
                    int var17 = this.field5721;
                    var16.field9427 = new byte[var17];
                    var16.field9425 = new short[var17];
                    var16.field9421 = new short[var17];
                    var16.field9420 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field5721; var18++) {
                    arg0.field5730[var18] = this.field5730[var18];
                    arg0.field5704[var18] = this.field5704[var18];
                    arg0.field5691[var18] = this.field5691[var18];
                    var16.field9421[var18] = this.field5797.field9421[var18];
                    var16.field9425[var18] = this.field5797.field9425[var18];
                    var16.field9420[var18] = this.field5797.field9420[var18];
                    var16.field9427[var18] = this.field5797.field9427[var18];
                }
            }
            arg0.field5736 = this.field5736;
        } else {
            arg0.field5736 = this.field5736;
            arg0.field5797 = this.field5797;
            arg0.field5691 = this.field5691;
            arg0.field5730 = this.field5730;
            arg0.field5704 = this.field5704;
        }
        if (class306.method1857(this.field5751, arg5, arg2)) {
            if (arg1) {
                arg0.field5738 = (byte) (arg0.field5738 | 0x4);
            }
            arg0.field5800 = arg4.field5800;
            arg0.field5800.field6485 = this.field5800.field6485;
            arg0.field5800.field6488 = this.field5800.field6488;
        } else if (class14.method72((byte) -57, arg5, this.field5751)) {
            arg0.field5800 = this.field5800;
        } else {
            arg0.field5800 = null;
        }
        if (class649.method3659(this.field5751, arg5, (byte) -64)) {
            if (arg4.field5728 == null || this.field5770 > arg4.field5728.length) {
                int var19 = this.field5721;
                arg0.field5728 = arg4.field5728 = new float[var19];
                arg0.field5740 = arg4.field5740 = new float[var19];
            } else {
                arg0.field5740 = arg4.field5740;
                arg0.field5728 = arg4.field5728;
            }
            for (int var20 = 0; var20 < this.field5721; var20++) {
                arg0.field5728[var20] = this.field5728[var20];
                arg0.field5740[var20] = this.field5740[var20];
            }
        } else {
            arg0.field5728 = this.field5728;
            arg0.field5740 = this.field5740;
        }
        if (class628.method3513(arg2 + 134, this.field5751, arg5)) {
            if (arg1) {
                arg0.field5738 = (byte) (arg0.field5738 | 0x8);
            }
            arg0.field5760 = arg4.field5760;
            arg0.field5760.field6485 = this.field5760.field6485;
            arg0.field5760.field6488 = this.field5760.field6488;
        } else if (class167.method1176((byte) -118, this.field5751, arg5)) {
            arg0.field5760 = this.field5760;
        } else {
            arg0.field5760 = null;
        }
        if (class671.method3790(arg2 - 1, arg5, this.field5751)) {
            if (arg4.field5705 == null || arg4.field5705.length < this.field5770) {
                int var21 = this.field5770;
                arg0.field5705 = arg4.field5705 = new short[var21];
                arg0.field5692 = arg4.field5692 = new short[var21];
                arg0.field5714 = arg4.field5714 = new short[var21];
            } else {
                arg0.field5714 = arg4.field5714;
                arg0.field5692 = arg4.field5692;
                arg0.field5705 = arg4.field5705;
            }
            for (int var22 = 0; var22 < this.field5770; var22++) {
                arg0.field5705[var22] = this.field5705[var22];
                arg0.field5714[var22] = this.field5714[var22];
                arg0.field5692[var22] = this.field5692[var22];
            }
        } else {
            arg0.field5705 = this.field5705;
            arg0.field5692 = this.field5692;
            arg0.field5714 = this.field5714;
        }
        if (class14.method70(this.field5751, 28, arg5)) {
            arg0.field5754 = arg4.field5754;
            if (arg1) {
                arg0.field5738 = (byte) (arg0.field5738 | 0x10);
            }
            arg0.field5754.field6028 = this.field5754.field6028;
        } else if (class289.method1779(false, arg5, this.field5751)) {
            arg0.field5754 = this.field5754;
        } else {
            arg0.field5754 = null;
        }
        if (class483.method2714(arg5, this.field5751, 32768)) {
            if (arg4.field5713 == null || arg4.field5713.length < this.field5770) {
                int var23 = this.field5770;
                arg0.field5713 = arg4.field5713 = new short[var23];
            } else {
                arg0.field5713 = arg4.field5713;
            }
            for (int var24 = 0; var24 < this.field5770; var24++) {
                arg0.field5713[var24] = this.field5713[var24];
            }
        } else {
            arg0.field5713 = this.field5713;
        }
        if (!class344.method2004(~arg2, arg5, this.field5751)) {
            arg0.field5772 = this.field5772;
        } else if (arg4.field5772 == null || this.field5790 > arg4.field5772.length) {
            int var26 = this.field5790;
            arg0.field5772 = arg4.field5772 = new class6[var26];
            for (int var27 = 0; var27 < this.field5790; var27++) {
                arg0.field5772[var27] = this.field5772[var27].method16((byte) 126);
            }
        } else {
            arg0.field5772 = arg4.field5772;
            for (int var25 = 0; var25 < this.field5790; var25++) {
                arg0.field5772[var25].method21(this.field5772[var25], (byte) 92);
            }
        }
        arg0.field5693 = this.field5693;
        arg0.field5719 = this.field5719;
        arg0.field5749 = this.field5749;
        arg0.field5741 = this.field5741;
        arg0.field5726 = this.field5726;
        arg0.field5725 = this.field5725;
        arg0.field5724 = this.field5724;
        arg0.field5715 = this.field5715;
        arg0.field5712 = this.field5712;
        if (this.field5783) {
            arg0.field5756 = this.field5756;
            arg0.field5748 = this.field5748;
            arg0.field5707 = this.field5707;
            arg0.field5783 = true;
            arg0.field5689 = this.field5689;
            arg0.field5768 = this.field5768;
            arg0.field5802 = this.field5802;
            arg0.field5784 = this.field5784;
            arg0.field5688 = this.field5688;
        } else {
            arg0.field5783 = false;
        }
        arg0.field5746 = this.field5746;
        arg0.field5720 = this.field5720;
        return arg0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method2378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5757++;
        if (arg0 > arg5 && arg5 < arg1 && arg4 > arg5) {
            return false;
        }
        if (arg2 != 255) {
            this.method463();
        }
        if (arg0 < arg5 && arg1 < arg5 && arg5 > arg4) {
            return false;
        } else if (arg3 > arg6 && arg8 > arg6 && arg6 < arg7) {
            return false;
        } else {
            return arg3 >= arg6 || arg8 >= arg6 || arg6 <= arg7;
        }
    }

    @OriginalMember(owner = "client!os", name = "na", descriptor = "()I")
    public final int method454() {
        field5777++;
        return this.field5785;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2379(int arg0, String arg1, int arg2) {
        class23.field282++;
        field5723++;
        class352 var3 = class290.method1786(arg0 + 102, class199.field2836, class227.field3165);
        var3.field4686.method2817(class705.method3947((byte) -47, arg1) + 1, true);
        var3.field4686.method2820(-54, arg1);
        var3.field4686.method2833(false, arg2);
        class602.method3388(var3, (byte) 28);
        if (arg0 != -4) {
            method2374(95, 4);
        }
    }

    @OriginalMember(owner = "client!os", name = "l", descriptor = "()I")
    public final int method415() {
        field5762++;
        if (!this.field5783) {
            this.method2368((byte) -125);
        }
        return this.field5768;
    }

    @OriginalMember(owner = "client!os", name = "M", descriptor = "(I)V")
    public final void method444(int arg0) {
        field5793++;
        int var2 = class597.field8342[arg0];
        int var3 = class597.field8344[arg0];
        for (int var4 = 0; var4 < this.field5698; var4++) {
            int var5 = this.field5799[var4] * var3 + this.field5758[var4] * var2 >> 14;
            this.field5758[var4] = this.field5758[var4] * var3 - (this.field5799[var4] * var2) >> 14;
            this.field5799[var4] = var5;
        }
        if (this.field5710 != null) {
            this.field5710.field6485 = null;
        }
        this.field5783 = false;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Llj;)V")
    public class407(class565 arg0) {
        this.field5787 = arg0;
        this.field5710 = new class470(null, 5126, 3, 0);
        this.field5760 = new class470(null, 5126, 2, 0);
        this.field5800 = new class470(null, 5126, 3, 0);
        this.field5795 = new class470(null, 5121, 4, 0);
        this.field5754 = new class432();
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Llj;Lnba;IIII)V")
    public class407(class565 arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5745 = arg2;
        this.field5751 = arg5;
        this.field5787 = arg0;
        if (class308.method1868((byte) -108, arg5, arg2)) {
            this.field5710 = new class470(null, 5126, 3, 0);
        }
        if (class167.method1176((byte) -118, arg5, arg2)) {
            this.field5760 = new class470(null, 5126, 2, 0);
        }
        if (class14.method72((byte) -57, arg2, arg5)) {
            this.field5800 = new class470(null, 5126, 3, 0);
        }
        if (class344.method2008((byte) -7, arg2, arg5)) {
            this.field5795 = new class470(null, 5121, 4, 0);
        }
        if (class289.method1779(false, arg2, arg5)) {
            this.field5754 = new class432();
        }
        class212 var7 = arg0.field2418;
        this.field5746 = new int[arg1.field3670 + 1];
        int[] var8 = new int[arg1.field3693];
        for (int var9 = 0; var9 < arg1.field3693; var9++) {
            if ((arg1.field3682 == null || arg1.field3682[var9] != 2) && (arg1.field3648 == null || arg1.field3648[var9] == -1 || !var7.method1365(-17951, arg1.field3648[var9] & 0xFFFF).field9796)) {
                var8[this.field5770++] = var9;
                this.field5746[arg1.field3665[var9]]++;
                this.field5746[arg1.field3697[var9]]++;
                this.field5746[arg1.field3653[var9]]++;
            }
        }
        this.field5759 = this.field5770;
        long[] var10 = new long[this.field5770];
        boolean var11 = (this.field5745 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field5770; var12++) {
            int var180 = var8[var12];
            class686 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field3656 != null) {
                boolean var186 = false;
                for (int var187 = 0; var187 < arg1.field3656.length; var187++) {
                    class360 var188 = arg1.field3656[var187];
                    if (var188.field4754 == var180) {
                        class243 var189 = class1.method1(var188.field4753, (byte) -21);
                        if (var189.field3305) {
                            var186 = true;
                        }
                        if (var189.field3308 != -1) {
                            class686 var190 = var7.method1365(-17951, var189.field3308);
                            if (var190.field9784) {
                                this.field5711 = true;
                            }
                        }
                    }
                }
                if (var186) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field5759--;
                    continue;
                }
            }
            short var191 = -1;
            if (arg1.field3648 != null) {
                var191 = arg1.field3648[var180];
                if (var191 != -1) {
                    var181 = var7.method1365(-17951, var191 & 0xFFFF);
                    var185 = var181.field9788;
                    var184 = var181.field9797;
                }
            }
            boolean var192 = arg1.field3685 != null && arg1.field3685[var180] != 0 || var181 != null && var181.field9784 | !var181.field9779;
            if ((var11 || var192) && arg1.field3679 != null) {
                var182 += arg1.field3679[var180] << 17;
            }
            if (var192) {
                var182 += 65536;
            }
            int var193 = (var184 & 0xFF << 8) + var182;
            int var194 = (var191 & 0xFFFF << 16) + var183;
            int var195 = (var185 & 0xFF) + var193;
            int var196 = (var12 & 0xFFFF) + var194;
            var10[var12] = ((long) var195 << 32) + (long) var196;
            this.field5711 |= var192;
        }
        class630.method3524(var8, var10, 8);
        this.field5799 = arg1.field3674;
        this.field5758 = arg1.field3646;
        this.field5698 = arg1.field3670;
        this.field5753 = arg1.field3649;
        this.field5733 = arg1.field3690;
        this.field5693 = arg1.field3658;
        this.field5712 = arg1.field3654;
        this.field5720 = arg1.field3677;
        class387[] var13 = new class387[this.field5698];
        if (arg1.field3656 != null) {
            this.field5790 = arg1.field3656.length;
            this.field5772 = new class6[this.field5790];
            this.field5715 = new class42[this.field5790];
            for (int var14 = 0; var14 < this.field5790; var14++) {
                class360 var15 = arg1.field3656[var14];
                class243 var16 = class1.method1(var15.field4753, (byte) -21);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5770; var18++) {
                    if (var8[var18] == var15.field4754) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class78.field1186[arg1.field3695[var15.field4754] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field3685 == null ? 0 : arg1.field3685[var15.field4754]) << 24;
                this.field5715[var14] = new class42(var17, arg1.field3665[var15.field4754], arg1.field3697[var15.field4754], arg1.field3653[var15.field4754], var16.field3314, var16.field3315, var16.field3308, var16.field3312, var16.field3313, var16.field3305, var16.field3304, var15.field4756);
                this.field5772[var14] = new class6(var20);
            }
        }
        int var21 = this.field5770 * 3;
        this.field5776 = new short[this.field5770];
        this.field5714 = new short[this.field5770];
        this.field5785 = (short) arg4;
        this.field5736 = new byte[var21];
        this.field5700 = (short) arg3;
        this.field5724 = new short[var21];
        this.field5730 = new short[var21];
        this.field5704 = new short[var21];
        this.field5692 = new short[this.field5770];
        this.field5728 = new float[var21];
        this.field5713 = new short[this.field5770];
        this.field5695 = new byte[this.field5770];
        this.field5691 = new short[var21];
        class152.field2220 = new long[var21];
        if (arg1.field3678 != null) {
            this.field5719 = new short[this.field5770];
        }
        this.field5705 = new short[this.field5770];
        this.field5740 = new float[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field3670; var23++) {
            int var179 = this.field5746[var23];
            this.field5746[var23] = var22;
            var13[var23] = new class387();
            var22 += var179;
        }
        this.field5746[arg1.field3670] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field3687 != null) {
            int var28 = arg1.field3691;
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
            var27 = new float[var28][];
            var26 = new int[var28];
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field5770; var36++) {
                int var43 = var8[var36];
                if (arg1.field3687[var43] != -1) {
                    int var44 = arg1.field3687[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field3665[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field3697[var43];
                        } else {
                            var46 = arg1.field3653[var43];
                        }
                        int var47 = arg1.field3674[var46];
                        int var48 = arg1.field3690[var46];
                        int var49 = arg1.field3646[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
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
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field3660[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field3689[var37];
                        var40 = 64.0F / (float) arg1.field3664[var37];
                        if (var42 == 0) {
                            var41 = 1.0F;
                            var39 = 1.0F;
                        } else if (var42 <= 0) {
                            var41 = (float) (-var42) / 1024.0F;
                            var39 = 1.0F;
                        } else {
                            var41 = 1.0F;
                            var39 = (float) var42 / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field3675[var37];
                        var40 = 64.0F / (float) arg1.field3664[var37];
                        var41 = 64.0F / (float) arg1.field3689[var37];
                    } else {
                        var39 = (float) arg1.field3675[var37] / 1024.0F;
                        var41 = (float) arg1.field3689[var37] / 1024.0F;
                        var40 = (float) arg1.field3664[var37] / 1024.0F;
                    }
                    var27[var37] = class286.method1761(var41, var39, (byte) 87, arg1.field3680[var37], arg1.field3692[var37], arg1.field3659[var37], class136.method950(255, arg1.field3686[var37]), var40);
                }
            }
        }
        class413[] var50 = new class413[arg1.field3693];
        for (int var51 = 0; var51 < arg1.field3693; var51++) {
            short var158 = arg1.field3665[var51];
            short var159 = arg1.field3697[var51];
            short var160 = arg1.field3653[var51];
            int var161 = this.field5799[var159] - this.field5799[var158];
            int var162 = this.field5733[var159] - this.field5733[var158];
            int var163 = this.field5758[var159] - this.field5758[var158];
            int var164 = this.field5799[var160] - this.field5799[var158];
            int var165 = this.field5733[var160] - this.field5733[var158];
            int var166 = this.field5758[var160] - this.field5758[var158];
            int var167 = var162 * var166 - var163 * var165;
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - var162 * var164;
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var168 * var168 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field3682 == null ? 0 : arg1.field3682[var51];
            if (var174 == 0) {
                class387 var176 = var13[var158];
                var176.field5480++;
                var176.field5477 += var171;
                var176.field5476 += var172;
                var176.field5481 += var173;
                class387 var177 = var13[var159];
                var177.field5481 += var173;
                var177.field5480++;
                var177.field5476 += var172;
                var177.field5477 += var171;
                class387 var178 = var13[var160];
                var178.field5480++;
                var178.field5476 += var172;
                var178.field5481 += var173;
                var178.field5477 += var171;
            } else if (var174 == 1) {
                class413 var175 = var50[var51] = new class413();
                var175.field5850 = var173;
                var175.field5852 = var171;
                var175.field5855 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field5770; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field3695[var68] & 0xFFFF;
            short var70;
            if (arg1.field3648 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field3648[var68];
            }
            int var71;
            if (arg1.field3687 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field3687[var68];
            }
            int var72;
            if (arg1.field3685 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field3685[var68] & 0xFF;
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
                    var78 = 0.0F;
                    var79 = 1;
                    var73 = 0.0F;
                    var74 = 1.0F;
                    var76 = 1.0F;
                    var75 = 1.0F;
                    var77 = 0.0F;
                    var80 = 2;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field3660[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field3665[var68];
                        short var112 = arg1.field3697[var68];
                        short var113 = arg1.field3653[var68];
                        short var114 = arg1.field3680[var71];
                        short var115 = arg1.field3692[var71];
                        short var116 = arg1.field3659[var71];
                        float var117 = (float) arg1.field3674[var114];
                        float var118 = (float) arg1.field3690[var114];
                        float var119 = (float) arg1.field3646[var114];
                        float var120 = (float) arg1.field3674[var115] - var117;
                        float var121 = (float) arg1.field3690[var115] - var118;
                        float var122 = (float) arg1.field3646[var115] - var119;
                        float var123 = (float) arg1.field3674[var116] - var117;
                        float var124 = (float) arg1.field3690[var116] - var118;
                        float var125 = (float) arg1.field3646[var116] - var119;
                        float var126 = (float) arg1.field3674[var111] - var117;
                        float var127 = (float) arg1.field3690[var111] - var118;
                        float var128 = (float) arg1.field3646[var111] - var119;
                        float var129 = (float) arg1.field3674[var112] - var117;
                        float var130 = (float) arg1.field3690[var112] - var118;
                        float var131 = (float) arg1.field3646[var112] - var119;
                        float var132 = (float) arg1.field3674[var113] - var117;
                        float var133 = (float) arg1.field3690[var113] - var118;
                        float var134 = (float) arg1.field3646[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - var120 * var125;
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - (var125 * var136);
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var122 * var135 - var120 * var137;
                        float var143 = var120 * var136 - (var121 * var135);
                        float var144 = var121 * var137 - (var122 * var136);
                        float var145 = 1.0F / (var125 * var143 + var123 * var144 + var124 * var142);
                        var76 = (var131 * var143 + var129 * var144 + var130 * var142) * var145;
                        var78 = (var134 * var143 + var132 * var144 + var133 * var142) * var145;
                        var74 = (var128 * var143 + var126 * var144 + var127 * var142) * var145;
                    } else {
                        short var83 = arg1.field3665[var68];
                        short var84 = arg1.field3697[var68];
                        short var85 = arg1.field3653[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field3652[var71];
                        float var91 = (float) arg1.field3657[var71] / 256.0F;
                        if (var82 == 1) {
                            float var109 = (float) arg1.field3675[var71] / 1024.0F;
                            class451.method2564(var89, arg1.field3690[var83], -18692, var86, var109, var90, var87, arg1.field3674[var83], var91, var88, arg1.field3646[var83]);
                            var73 = class90.field1295;
                            var74 = class560.field7542;
                            class451.method2564(var89, arg1.field3690[var84], -18692, var86, var109, var90, var87, arg1.field3674[var84], var91, var88, arg1.field3646[var84]);
                            var76 = class560.field7542;
                            var75 = class90.field1295;
                            class451.method2564(var89, arg1.field3690[var85], -18692, var86, var109, var90, var87, arg1.field3674[var85], var91, var88, arg1.field3646[var85]);
                            var77 = class90.field1295;
                            var78 = class560.field7542;
                            float var110 = var109 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var110 < var77 - var73) {
                                    var80 = 1;
                                    var77 -= var109;
                                } else if (var110 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var109;
                                }
                                if ((var110 < var75 - var73)) {
                                    var79 = 1;
                                    var75 -= var109;
                                } else if (var110 < var73 - var75) {
                                    var75 += var109;
                                    var79 = 2;
                                }
                            } else {
                                if ((var76 - var74 > var110)) {
                                    var76 -= var109;
                                    var79 = 1;
                                } else if (var74 - var76 > var110) {
                                    var79 = 2;
                                    var76 += var109;
                                }
                                if (var78 - var74 > var110) {
                                    var78 -= var109;
                                    var80 = 1;
                                } else if (var74 - var78 > var110) {
                                    var78 += var109;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var92 = (float) arg1.field3645[var71] / 256.0F;
                            float var93 = (float) arg1.field3671[var71] / 256.0F;
                            int var94 = arg1.field3674[var84] - arg1.field3674[var83];
                            int var95 = arg1.field3690[var84] - arg1.field3690[var83];
                            int var96 = arg1.field3646[var84] - arg1.field3646[var83];
                            int var97 = arg1.field3674[var85] - arg1.field3674[var83];
                            int var98 = arg1.field3690[var85] - arg1.field3690[var83];
                            int var99 = arg1.field3646[var85] - arg1.field3646[var83];
                            int var100 = var95 * var99 - (var96 * var98);
                            int var101 = var96 * var97 - (var94 * var99);
                            int var102 = var94 * var98 - (var95 * var97);
                            float var103 = 64.0F / (float) arg1.field3689[var71];
                            float var104 = 64.0F / (float) arg1.field3664[var71];
                            float var105 = 64.0F / (float) arg1.field3675[var71];
                            float var106 = (var89[2] * (float) var102 + var89[0] * (float) var100 + var89[1] * (float) var101) / var103;
                            float var107 = (var89[5] * (float) var102 + var89[4] * (float) var101 + var89[3] * (float) var100) / var104;
                            float var108 = (var89[8] * (float) var102 + var89[7] * (float) var101 + var89[6] * (float) var100) / var105;
                            var81 = class236.method1482(var107, var108, -117, var106);
                            class199.method1319(arg1.field3646[var83], var87, var89, var86, var93, arg1.field3690[var83], var88, var90, (byte) 94, var81, var92, var91, arg1.field3674[var83]);
                            var74 = class491.field6712;
                            var73 = class378.field5058;
                            class199.method1319(arg1.field3646[var84], var87, var89, var86, var93, arg1.field3690[var84], var88, var90, (byte) 94, var81, var92, var91, arg1.field3674[var84]);
                            var75 = class378.field5058;
                            var76 = class491.field6712;
                            class199.method1319(arg1.field3646[var85], var87, var89, var86, var93, arg1.field3690[var85], var88, var90, (byte) 94, var81, var92, var91, arg1.field3674[var85]);
                            var78 = class491.field6712;
                            var77 = class378.field5058;
                        } else if (var82 == 3) {
                            class239.method1495(var87, (byte) -109, var90, var88, var89, var91, var86, arg1.field3674[var83], arg1.field3690[var83], arg1.field3646[var83]);
                            var74 = class369.field4972;
                            var73 = class265.field3584;
                            class239.method1495(var87, (byte) -117, var90, var88, var89, var91, var86, arg1.field3674[var84], arg1.field3690[var84], arg1.field3646[var84]);
                            var75 = class265.field3584;
                            var76 = class369.field4972;
                            class239.method1495(var87, (byte) -113, var90, var88, var89, var91, var86, arg1.field3674[var85], arg1.field3690[var85], arg1.field3646[var85]);
                            var77 = class265.field3584;
                            var78 = class369.field4972;
                            if ((var90 & 0x1) == 0) {
                                if (var77 - var73 > 0.5F) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                            } else {
                                if (var76 - var74 > 0.5F) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field3682 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field3682[var68];
            }
            if (var146 == 0) {
                long var147 = (long) (var71 << 2) + ((long) (var69 << 8) + (long) (var81 << 24) + ((long) var72) << 32);
                short var149 = arg1.field3665[var68];
                short var150 = arg1.field3697[var68];
                short var151 = arg1.field3653[var68];
                class387 var152 = var13[var149];
                this.field5705[var52] = this.method2375(var152.field5480, arg1, var74, var152.field5481, var149, var152.field5476, var73, var152.field5477, -1685278802, var147);
                class387 var153 = var13[var150];
                this.field5714[var52] = this.method2375(var153.field5480, arg1, var76, var153.field5481, var150, var153.field5476, var75, var153.field5477, -1685278802, (long) var79 + var147);
                class387 var154 = var13[var151];
                this.field5692[var52] = this.method2375(var154.field5480, arg1, var78, var154.field5481, var151, var154.field5476, var77, var154.field5477, -1685278802, (long) var80 + var147);
            } else if (var146 == 1) {
                class413 var155 = var50[var68];
                long var156 = ((long) (var81 << 24) - (-((long) (var69 << 8)) - (long) var72) << 32) + (long) ((var155.field5855 + 256 << 22) + ((var71 << 2) + (var155.field5852 <= 0 ? 2048 : 1024) + (var155.field5850 + 256 << 12)));
                this.field5705[var52] = this.method2375(0, arg1, var74, var155.field5850, arg1.field3665[var68], var155.field5855, var73, var155.field5852, -1685278802, var156);
                this.field5714[var52] = this.method2375(0, arg1, var76, var155.field5850, arg1.field3697[var68], var155.field5855, var75, var155.field5852, -1685278802, (long) var79 + var156);
                this.field5692[var52] = this.method2375(0, arg1, var78, var155.field5850, arg1.field3653[var68], var155.field5855, var77, var155.field5852, -1685278802, (long) var80 + var156);
            }
            if (arg1.field3648 == null) {
                this.field5713[var52] = -1;
            } else {
                this.field5713[var52] = arg1.field3648[var68];
            }
            if (arg1.field3685 != null) {
                this.field5695[var52] = arg1.field3685[var68];
            }
            if (arg1.field3678 != null) {
                this.field5719[var52] = arg1.field3678[var68];
            }
            this.field5776[var52] = arg1.field3695[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field5759; var55++) {
            short var67 = this.field5713[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field5741 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field5759; var58++) {
            short var66 = this.field5713[var58];
            if (var56 != var66) {
                var56 = var66;
                this.field5741[var57++] = var58;
            }
        }
        this.field5741[var57] = this.field5759;
        class152.field2220 = null;
        this.field5730 = class439.method2505(this.field5730, true, this.field5721);
        this.field5704 = class439.method2505(this.field5704, true, this.field5721);
        this.field5691 = class439.method2505(this.field5691, true, this.field5721);
        this.field5736 = class444.method2520(127, this.field5721, this.field5736);
        this.field5728 = class109.method790(this.field5721, (byte) 117, this.field5728);
        this.field5740 = class109.method790(this.field5721, (byte) 120, this.field5740);
        if (arg1.field3650 != null && class425.method2453(this.field5751, 8, arg2)) {
            this.field5725 = arg1.method1642(false, 0);
        }
        if (arg1.field3656 != null && class65.method557(arg2, 60, this.field5751)) {
            this.field5726 = arg1.method1648((byte) 126);
        }
        if (arg1.field3667 != null && class381.method2191(this.field5751, (byte) -97, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field5770; var61++) {
                int var65 = arg1.field3667[var8[var61]];
                if (var65 >= 0) {
                    if (var59 < var65) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field5749 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field5749[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field5770; var63++) {
                int var64 = arg1.field3667[var8[var63]];
                if (var64 >= 0) {
                    this.field5749[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
