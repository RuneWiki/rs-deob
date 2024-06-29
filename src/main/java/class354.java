import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class354 extends class499 {

    @OriginalMember(owner = "client!b", name = "G", descriptor = "Z")
    private boolean field4722 = false;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    private int field4710 = 0;

    @OriginalMember(owner = "client!b", name = "Sb", descriptor = "I")
    private int field4786 = 0;

    @OriginalMember(owner = "client!b", name = "Xb", descriptor = "Z")
    private boolean field4791 = false;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "Z")
    private boolean field4719 = true;

    @OriginalMember(owner = "client!b", name = "Pb", descriptor = "I")
    private int field4783 = 0;

    @OriginalMember(owner = "client!b", name = "pc", descriptor = "I")
    private int field4809 = 0;

    @OriginalMember(owner = "client!b", name = "Jb", descriptor = "I")
    private int field4777 = 0;

    @OriginalMember(owner = "client!b", name = "kc", descriptor = "Z")
    private boolean field4804 = false;

    @OriginalMember(owner = "client!b", name = "Zb", descriptor = "Lhk;")
    private class111 field4793;

    @OriginalMember(owner = "client!b", name = "hc", descriptor = "Lnba;")
    private class316 field4801;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "Lnba;")
    private class316 field4720;

    @OriginalMember(owner = "client!b", name = "Ob", descriptor = "Lnba;")
    private class316 field4782;

    @OriginalMember(owner = "client!b", name = "Ib", descriptor = "Lnba;")
    private class316 field4776;

    @OriginalMember(owner = "client!b", name = "sb", descriptor = "Ljc;")
    private class465 field4760;

    @OriginalMember(owner = "client!b", name = "Kb", descriptor = "I")
    private int field4778;

    @OriginalMember(owner = "client!b", name = "Ac", descriptor = "I")
    private int field4820;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "[I")
    private int[] field4746;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "[I")
    private int[] field4752;

    @OriginalMember(owner = "client!b", name = "U", descriptor = "[I")
    private int[] field4736;

    @OriginalMember(owner = "client!b", name = "Ub", descriptor = "[S")
    private short[] field4788;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "[I")
    private int[] field4755;

    @OriginalMember(owner = "client!b", name = "wc", descriptor = "[Lqr;")
    private class72[] field4816;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "[Loea;")
    private class624[] field4712;

    @OriginalMember(owner = "client!b", name = "vb", descriptor = "I")
    private int field4763;

    @OriginalMember(owner = "client!b", name = "rc", descriptor = "[Leha;")
    private class98[] field4811;

    @OriginalMember(owner = "client!b", name = "Nb", descriptor = "[Luq;")
    private class173[] field4781;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "[F")
    private float[] field4713;

    @OriginalMember(owner = "client!b", name = "Gc", descriptor = "[B")
    private byte[] field4826;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "[S")
    private short[] field4747;

    @OriginalMember(owner = "client!b", name = "xc", descriptor = "[S")
    private short[] field4817;

    @OriginalMember(owner = "client!b", name = "Lb", descriptor = "S")
    private short field4779;

    @OriginalMember(owner = "client!b", name = "ic", descriptor = "[S")
    private short[] field4802;

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "[S")
    private short[] field4756;

    @OriginalMember(owner = "client!b", name = "Dc", descriptor = "[S")
    private short[] field4823;

    @OriginalMember(owner = "client!b", name = "Rb", descriptor = "S")
    private short field4785;

    @OriginalMember(owner = "client!b", name = "zb", descriptor = "[S")
    private short[] field4767;

    @OriginalMember(owner = "client!b", name = "xb", descriptor = "[F")
    private float[] field4765;

    @OriginalMember(owner = "client!b", name = "cc", descriptor = "[S")
    private short[] field4796;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "[S")
    private short[] field4729;

    @OriginalMember(owner = "client!b", name = "qc", descriptor = "[S")
    private short[] field4810;

    @OriginalMember(owner = "client!b", name = "zc", descriptor = "[S")
    private short[] field4819;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "[B")
    private byte[] field4741;

    @OriginalMember(owner = "client!b", name = "nc", descriptor = "[I")
    private int[] field4807;

    @OriginalMember(owner = "client!b", name = "Vb", descriptor = "[[I")
    private int[][] field4789;

    @OriginalMember(owner = "client!b", name = "Fb", descriptor = "[[I")
    private int[][] field4773;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "[[I")
    private int[][] field4725;

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "[I")
    public static int[] field4759 = new int[32];

    @OriginalMember(owner = "client!b", name = "ub", descriptor = "B")
    private byte field4762;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!b", name = "T", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!b", name = "V", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!b", name = "wb", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!b", name = "yb", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!b", name = "Ab", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!b", name = "Bb", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!b", name = "Cb", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!b", name = "Eb", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!b", name = "Gb", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!b", name = "Hb", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!b", name = "Mb", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!b", name = "Qb", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!b", name = "Tb", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!b", name = "Yb", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!b", name = "ac", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!b", name = "bc", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!b", name = "dc", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!b", name = "ec", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!b", name = "jc", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!b", name = "mc", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!b", name = "oc", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!b", name = "sc", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!b", name = "tc", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!b", name = "uc", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!b", name = "vc", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!b", name = "yc", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!b", name = "Cc", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!b", name = "Ec", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!b", name = "Fc", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!b", name = "Hc", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!b", name = "Ic", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!b", name = "fc", descriptor = "Lwfa;")
    private class212 field4799;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "Lnc;")
    private class26 field4726;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "Lis;")
    private class530 field4743;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "Lod;")
    public static class534 field4748;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "S")
    private short field4707;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "S")
    private short field4724;

    @OriginalMember(owner = "client!b", name = "W", descriptor = "S")
    private short field4738;

    @OriginalMember(owner = "client!b", name = "tb", descriptor = "S")
    private short field4761;

    @OriginalMember(owner = "client!b", name = "Wb", descriptor = "S")
    private short field4790;

    @OriginalMember(owner = "client!b", name = "gc", descriptor = "S")
    private short field4800;

    @OriginalMember(owner = "client!b", name = "lc", descriptor = "S")
    private short field4805;

    @OriginalMember(owner = "client!b", name = "Bc", descriptor = "S")
    private short field4821;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "(I)V")
    public final void method303(int arg0) {
        field4731++;
        this.field4778 = arg0;
        this.field4719 = true;
        if (this.field4743 != null && (this.field4778 & 0x10000) == 0) {
            this.field4823 = this.field4743.field7182;
            this.field4819 = this.field4743.field7183;
            this.field4729 = this.field4743.field7175;
            this.field4741 = this.field4743.field7177;
            this.field4743 = null;
        }
        this.method2163((byte) 115);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lsk;Leea;I)V")
    public final void method301(class650 arg0, class144 arg1, int arg2) {
        field4715++;
        if (this.field4809 == 0) {
            return;
        }
        class711 var4 = this.field4793.field1963;
        class711 var5 = (class711) arg0;
        if (!this.field4722) {
            this.method2164(126);
        }
        class220.field3233 = var4.field9783 * var5.field9762 + var4.field9770 * var5.field9794 + var4.field9762 * var5.field9764;
        class251.field3529 = var4.field9783 * var5.field9765 + var4.field9770 * var5.field9771 + var4.field9762 * var5.field9768 + var4.field9765;
        float var6 = (float) this.field4707 * class220.field3233 + class251.field3529;
        float var7 = (float) this.field4800 * class220.field3233 + class251.field3529;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) this.field4805 + var6;
            var9 = (float) (-this.field4805) + var7;
        } else {
            var9 = (float) (-this.field4805) + var6;
            var8 = (float) this.field4805 + var7;
        }
        if ((this.field4793.field1984 <= var9) || ((float) this.field4793.field2023 >= var8)) {
            return;
        }
        class69.field1023 = var4.field9785 * var5.field9765 + var4.field9795 * var5.field9771 + var4.field9794 * var5.field9768 + var4.field9771;
        class335.field4521 = var4.field9785 * var5.field9762 + var4.field9795 * var5.field9794 + var4.field9794 * var5.field9764;
        float var10 = (float) this.field4707 * class335.field4521 + class69.field1023;
        float var11 = (float) this.field4800 * class335.field4521 + class69.field1023;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) this.field4805 + var10) * (float) this.field4793.field2046;
            var13 = (var11 - (float) this.field4805) * (float) this.field4793.field2046;
        } else {
            var13 = ((float) (-this.field4805) + var10) * (float) this.field4793.field2046;
            var12 = ((float) this.field4805 + var11) * (float) this.field4793.field2046;
        }
        if ((this.field4793.field2067 <= var13 / var8) || (var12 / var8 <= this.field4793.field2071)) {
            return;
        }
        class744.field10274 = var4.field9767 * var5.field9762 + var4.field9780 * var5.field9794 + var4.field9764 * var5.field9764;
        class235.field3373 = var4.field9767 * var5.field9765 + var4.field9780 * var5.field9771 + var4.field9764 * var5.field9768 + var4.field9768;
        float var14 = (float) this.field4707 * class744.field10274 + class235.field3373;
        float var15 = (float) this.field4800 * class744.field10274 + class235.field3373;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = ((float) this.field4805 + var14) * (float) this.field4793.field1981;
            var16 = ((float) (-this.field4805) + var15) * (float) this.field4793.field1981;
        } else {
            var16 = ((float) (-this.field4805) + var14) * (float) this.field4793.field1981;
            var17 = ((float) this.field4805 + var15) * (float) this.field4793.field1981;
        }
        if ((var16 / var8 >= this.field4793.field2020) || (this.field4793.field1980 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field4811 != null) {
            class423.field5793 = var4.field9783 * var5.field9770 + var4.field9770 * var5.field9795 + var4.field9762 * var5.field9780;
            class228.field3327 = var4.field9767 * var5.field9783 + var4.field9780 * var5.field9785 + var4.field9764 * var5.field9767;
            class72.field1049 = var4.field9785 * var5.field9770 + var4.field9795 * var5.field9795 + var4.field9794 * var5.field9780;
            class165.field2658 = var4.field9767 * var5.field9770 + var4.field9780 * var5.field9795 + var4.field9764 * var5.field9780;
            class168.field2703 = var4.field9783 * var5.field9783 + var4.field9770 * var5.field9785 + var4.field9762 * var5.field9767;
            class643.field8896 = var4.field9785 * var5.field9783 + var4.field9795 * var5.field9785 + var4.field9794 * var5.field9767;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field4738 + this.field4724 >> 1;
            int var21 = this.field4790 + this.field4761 >> 1;
            int var22 = (int) ((float) var21 * class643.field8896 + (float) this.field4707 * class335.field4521 + (float) var20 * class72.field1049 + class69.field1023);
            int var23 = (int) ((float) var21 * class228.field3327 + (float) this.field4707 * class744.field10274 + (float) var20 * class165.field2658 + class235.field3373);
            int var24 = (int) ((float) var21 * class168.field2703 + (float) this.field4707 * class220.field3233 + (float) var20 * class423.field5793 + class251.field3529);
            if (this.field4793.field2023 > var24) {
                var18 = true;
            } else {
                arg1.field2430 = this.field4793.field2025 + (this.field4793.field1981 * var23 / var24);
                arg1.field2433 = this.field4793.field2038 + (this.field4793.field2046 * var22 / var24);
            }
            int var25 = (int) ((float) var21 * class643.field8896 + (float) this.field4800 * class335.field4521 + (float) var20 * class72.field1049 + class69.field1023);
            int var26 = (int) ((float) var21 * class228.field3327 + (float) this.field4800 * class744.field10274 + (float) var20 * class165.field2658 + class235.field3373);
            int var27 = (int) ((float) var21 * class168.field2703 + (float) this.field4800 * class220.field3233 + (float) var20 * class423.field5793 + class251.field3529);
            if (this.field4793.field2023 <= var27) {
                arg1.field2431 = this.field4793.field1981 * var26 / var27 + this.field4793.field2025;
                arg1.field2429 = this.field4793.field2038 + (this.field4793.field2046 * var25 / var27);
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field4793.field2023 && var27 < this.field4793.field2023) {
                    var19 = false;
                } else if (this.field4793.field2023 > var24) {
                    int var28 = (var27 - this.field4793.field2023 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field2433 = this.field4793.field2046 * var29 / this.field4793.field2023 + this.field4793.field2038;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field2430 = this.field4793.field1981 * var30 / this.field4793.field2023 + this.field4793.field2025;
                } else if (var27 < this.field4793.field2023) {
                    int var31 = (var24 - this.field4793.field2023 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field2433 = this.field4793.field2046 * var32 / this.field4793.field2023 + this.field4793.field2038;
                    arg1.field2430 = this.field4793.field1981 * var33 / this.field4793.field2023 + this.field4793.field2025;
                }
            }
            if (var19) {
                if (var24 > var27) {
                    arg1.field2432 = (var22 + this.field4805) * this.field4793.field2046 / var24 + this.field4793.field2038 - arg1.field2433;
                } else {
                    arg1.field2432 = (this.field4805 + var25) * this.field4793.field2046 / var27 + this.field4793.field2038 - arg1.field2429;
                }
                arg1.field2428 = true;
            }
        }
        this.field4793.method1009(false);
        this.field4793.method1010(0, var5);
        this.method2176((byte) 118);
        this.field4793.method1005(-485363544);
        this.method2172(432935728);
    }

    @OriginalMember(owner = "client!b", name = "ba", descriptor = "(Lr;)Lr;")
    public final class196 method325(class196 arg0) {
        field4771++;
        if (this.field4809 == 0) {
            return null;
        }
        if (!this.field4722) {
            this.method2164(-82);
        }
        int var2;
        int var3;
        if (this.field4793.field1974 > 0) {
            var2 = this.field4724 - (this.field4793.field1974 * this.field4800 >> 8) >> this.field4793.field1936;
            var3 = this.field4738 - (this.field4793.field1974 * this.field4707 >> 8) >> this.field4793.field1936;
        } else {
            var2 = this.field4724 - (this.field4793.field1974 * this.field4707 >> 8) >> this.field4793.field1936;
            var3 = this.field4738 - (this.field4793.field1974 * this.field4800 >> 8) >> this.field4793.field1936;
        }
        int var4;
        int var5;
        if (this.field4793.field2055 <= 0) {
            var4 = this.field4790 - (this.field4793.field2055 * this.field4707 >> 8) >> this.field4793.field1936;
            var5 = this.field4761 - (this.field4793.field2055 * this.field4800 >> 8) >> this.field4793.field1936;
        } else {
            var4 = this.field4790 - (this.field4793.field2055 * this.field4800 >> 8) >> this.field4793.field1936;
            var5 = this.field4761 - (this.field4793.field2055 * this.field4707 >> 8) >> this.field4793.field1936;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class60 var8 = (class60) arg0;
        class60 var9;
        if (var8 != null && var8.method418(var6, var7, 20)) {
            var9 = var8;
            var8.method420(97);
        } else {
            var9 = new class60(this.field4793, var6, var7);
        }
        var9.method417(var4, var3, var5, var2, -1819929872);
        this.method2169(var9, -1059072280);
        return var9;
    }

    @OriginalMember(owner = "client!b", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method280(int arg0, int arg1, class296 arg2, class296 arg3, int arg4, int arg5, int arg6) {
        if (!this.field4722) {
            this.method2164(127);
        }
        field4751++;
        int var8 = this.field4724 + arg4;
        int var9 = arg4 + this.field4738;
        int var10 = this.field4790 + arg6;
        int var11 = this.field4761 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (var9 + arg2.field4035 >> arg2.field4036) >= arg2.field4037 || var10 < 0 || arg2.field4034 <= (var11 + arg2.field4035 >> arg2.field4036)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4037 <= (arg3.field4035 + var9 >> arg3.field4036) || var10 < 0 || arg3.field4035 + var11 >> arg3.field4036 >= arg3.field4034) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4036;
            int var13 = arg2.field4035 + var9 - 1 >> arg2.field4036;
            int var14 = var10 >> arg2.field4036;
            int var15 = var11 + arg2.field4035 - 1 >> arg2.field4036;
            if (arg5 == arg2.method1897((byte) -34, var14, var12) && arg5 == arg2.method1897((byte) -34, var14, var13) && arg5 == arg2.method1897((byte) -34, var15, var12) && arg2.method1897((byte) -34, var15, var13) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field4777; var32++) {
                this.field4755[var32] += arg2.method1907(this.field4752[var32] + arg4, (byte) 104, this.field4736[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field4707;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field4777; var30++) {
                int var31 = (this.field4755[var30] << 16) / var29;
                if (arg1 > var31) {
                    this.field4755[var30] += (arg1 - var31) * (arg2.method1907(this.field4752[var30] + arg4, (byte) -42, this.field4736[var30] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = ((arg1 & 0xFFB2) >> 8) * 4;
            int var18 = arg1 >> 16 & 0xFF << 6;
            int var19 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var16 >> 1) < 0 || (arg2.field4037 << arg2.field4036) <= ((var16 >> 1) + arg4 + arg2.field4035) || arg6 - (var17 >> 1) < 0 || ((var17 >> 1) + arg2.field4035 + arg6) >= (arg2.field4034 << arg2.field4036)) {
                return;
            }
            this.method2859(var18, 0, arg2, arg5, arg4, var17, var16, var19, arg6);
        } else if (arg0 == 4) {
            int var20 = this.field4800 - this.field4707;
            for (int var21 = 0; var21 < this.field4777; var21++) {
                this.field4755[var21] = this.field4755[var21] + var20 + arg3.method1907(this.field4752[var21] + arg4, (byte) -57, this.field4736[var21] + arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var22 = this.field4800 - this.field4707;
            for (int var23 = 0; var23 < this.field4777; var23++) {
                int var24 = this.field4752[var23] + arg4;
                int var25 = this.field4736[var23] + arg6;
                int var26 = arg2.method1907(var24, (byte) 109, var25);
                int var27 = arg3.method1907(var24, (byte) -127, var25);
                int var28 = var26 - var27 - arg1;
                this.field4755[var23] = ((this.field4755[var23] << 8) / var22 * var28 >> 8) + var26 - arg5;
            }
        }
        this.field4722 = false;
        if (this.field4801 != null) {
            this.field4801.field4319 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    private final void method2163(byte arg0) {
        field4709++;
        if (!this.field4719) {
            return;
        }
        if (arg0 <= 85) {
            this.method279(121);
        }
        this.field4719 = false;
        if (this.field4712 == null && this.field4816 == null && this.field4811 == null) {
            if (this.field4752 != null && !class609.method3455(this.field4778, this.field4820, true)) {
                if (this.field4801 != null && this.field4801.field4319 == null) {
                    this.field4719 = true;
                } else {
                    if (!this.field4722) {
                        this.method2164(125);
                    }
                    this.field4752 = null;
                }
            }
            if (this.field4755 != null && !class331.method2089(this.field4778, this.field4820, -128)) {
                if (this.field4801 != null && this.field4801.field4319 == null) {
                    this.field4719 = true;
                } else {
                    if (!this.field4722) {
                        this.method2164(-116);
                    }
                    this.field4755 = null;
                }
            }
            if (this.field4736 != null && !class375.method2276(this.field4778, 124, this.field4820)) {
                if (this.field4801 != null && this.field4801.field4319 == null) {
                    this.field4719 = true;
                } else {
                    if (!this.field4722) {
                        this.method2164(127);
                    }
                    this.field4736 = null;
                }
            }
        }
        if (this.field4747 != null && this.field4752 == null && this.field4755 == null && this.field4736 == null) {
            this.field4747 = null;
            this.field4746 = null;
        }
        if (this.field4741 != null && !class726.method4030(this.field4820, true, this.field4778)) {
            if (this.field4782 == null) {
                if (this.field4776 != null && this.field4776.field4319 == null) {
                    this.field4719 = true;
                } else {
                    this.field4819 = this.field4729 = this.field4823 = null;
                    this.field4741 = null;
                }
            } else if (this.field4782.field4319 == null) {
                this.field4719 = true;
            } else {
                this.field4741 = null;
                this.field4819 = this.field4729 = this.field4823 = null;
            }
        }
        if (this.field4802 != null && !class366.method2237(this.field4820, this.field4778, -51)) {
            if (this.field4776 != null && this.field4776.field4319 == null) {
                this.field4719 = true;
            } else {
                this.field4802 = null;
            }
        }
        if (this.field4826 != null && !class316.method1994(this.field4820, (byte) 82, this.field4778)) {
            if (this.field4776 != null && this.field4776.field4319 == null) {
                this.field4719 = true;
            } else {
                this.field4826 = null;
            }
        }
        if (this.field4713 != null && !class679.method3825(this.field4820, true, this.field4778)) {
            if (this.field4720 != null && this.field4720.field4319 == null) {
                this.field4719 = true;
            } else {
                this.field4713 = this.field4765 = null;
            }
        }
        if (this.field4767 != null && !class644.method3580(-98, this.field4778, this.field4820)) {
            if (this.field4776 != null && this.field4776.field4319 == null) {
                this.field4719 = true;
            } else {
                this.field4767 = null;
            }
        }
        if (this.field4817 != null && !class506.method2891(-20215, this.field4820, this.field4778)) {
            if ((this.field4760 == null || this.field4760.field6315 != null) && (this.field4776 == null || this.field4776.field4319 != null)) {
                this.field4817 = this.field4756 = this.field4810 = null;
            } else {
                this.field4719 = true;
            }
        }
        if (this.field4725 != null && !class433.method2537((byte) -100, this.field4778, this.field4820)) {
            this.field4796 = null;
            this.field4725 = null;
        }
        if (this.field4789 != null && !class754.method4182(this.field4820, this.field4778, -12026)) {
            this.field4788 = null;
            this.field4789 = null;
        }
        if (this.field4773 != null && !class448.method2603(this.field4820, 32, this.field4778)) {
            this.field4773 = null;
        }
        if (this.field4807 != null && (this.field4778 & 0x800) == 0 && (this.field4778 & 0x40000) == 0) {
            this.field4807 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method281(class499 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4742++;
        class354 var6 = (class354) arg0;
        if (this.field4786 == 0 || var6.field4786 == 0) {
            return;
        }
        int var7 = var6.field4777;
        int[] var8 = var6.field4752;
        int[] var9 = var6.field4755;
        int[] var10 = var6.field4736;
        short[] var11 = var6.field4819;
        short[] var12 = var6.field4729;
        short[] var13 = var6.field4823;
        byte[] var14 = var6.field4741;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field4743 == null) {
            var16 = null;
            var18 = null;
            var15 = null;
            var17 = null;
        } else {
            var15 = this.field4743.field7183;
            var16 = this.field4743.field7182;
            var17 = this.field4743.field7177;
            var18 = this.field4743.field7175;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field4743 == null) {
            var22 = null;
            var19 = null;
            var21 = null;
            var20 = null;
        } else {
            var19 = var6.field4743.field7177;
            var20 = var6.field4743.field7182;
            var21 = var6.field4743.field7183;
            var22 = var6.field4743.field7175;
        }
        int[] var23 = var6.field4746;
        short[] var24 = var6.field4747;
        if (!var6.field4722) {
            var6.method2164(12);
        }
        short var25 = var6.field4707;
        short var26 = var6.field4800;
        short var27 = var6.field4724;
        short var28 = var6.field4738;
        short var29 = var6.field4790;
        short var30 = var6.field4761;
        for (int var31 = 0; var31 < this.field4777; var31++) {
            int var32 = this.field4755[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field4752[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field4736[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field4746[var31];
                        int var37 = this.field4746[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4747[var38] - 1;
                            if (var35 == -1 || this.field4741[var35] != 0) {
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
                                            this.field4743 = new class530();
                                            var15 = this.field4743.field7183 = class148.method1183(-80, this.field4819);
                                            var18 = this.field4743.field7175 = class148.method1183(119, this.field4729);
                                            var16 = this.field4743.field7182 = class148.method1183(59, this.field4823);
                                            var17 = this.field4743.field7177 = class23.method157(108, this.field4741);
                                        }
                                        if (var21 == null) {
                                            class530 var44 = var6.field4743 = new class530();
                                            var21 = var44.field7183 = class148.method1183(55, var11);
                                            var22 = var44.field7175 = class148.method1183(73, var12);
                                            var20 = var44.field7182 = class148.method1183(-113, var13);
                                            var19 = var44.field7177 = class23.method157(123, var14);
                                        }
                                        short var45 = this.field4819[var35];
                                        short var46 = this.field4729[var35];
                                        short var47 = this.field4823[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field4741[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var21[var52] += var45;
                                                var22[var52] += var46;
                                                var20[var52] += var47;
                                                var19[var52] += var49;
                                            }
                                        }
                                        short var53 = var11[var42];
                                        short var54 = var13[var42];
                                        int var55 = this.field4746[var31];
                                        int var56 = this.field4746[var31 + 1];
                                        byte var57 = var14[var42];
                                        short var58 = var12[var42];
                                        for (int var59 = var55; var59 < var56; var59++) {
                                            int var60 = this.field4747[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var15[var60] += var53;
                                                var18[var60] += var58;
                                                var16[var60] += var54;
                                                var17[var60] += var57;
                                            }
                                        }
                                        if (this.field4782 == null && this.field4776 != null) {
                                            this.field4776.field4319 = null;
                                        }
                                        if (this.field4782 != null) {
                                            this.field4782.field4319 = null;
                                        }
                                        if (var6.field4782 == null && var6.field4776 != null) {
                                            var6.field4776.field4319 = null;
                                        }
                                        if (var6.field4782 != null) {
                                            var6.field4782.field4319 = null;
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

    @OriginalMember(owner = "client!b", name = "RA", descriptor = "()I")
    public final int method291() {
        field4754++;
        if (!this.field4722) {
            this.method2164(-127);
        }
        return this.field4738;
    }

    @OriginalMember(owner = "client!b", name = "da", descriptor = "()I")
    public final int method292() {
        field4828++;
        return this.field4779;
    }

    @OriginalMember(owner = "client!b", name = "F", descriptor = "()Z")
    public final boolean method327() {
        field4812++;
        return this.field4804;
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "()[Loea;")
    public final class624[] method311() {
        field4757++;
        return this.field4712;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BIZ)Lka;")
    public final class499 method324(byte arg0, int arg1, boolean arg2) {
        field4750++;
        class354 var4;
        class354 var5;
        if (arg0 == 1) {
            var4 = this.field4793.field2057;
            var5 = this.field4793.field2018;
        } else if (arg0 == 2) {
            var5 = this.field4793.field2037;
            var4 = this.field4793.field1983;
        } else if (arg0 == 3) {
            var4 = this.field4793.field2011;
            var5 = this.field4793.field1975;
        } else if (arg0 == 4) {
            var5 = this.field4793.field2080;
            var4 = this.field4793.field2040;
        } else if (arg0 == 5) {
            var5 = this.field4793.field2056;
            var4 = this.field4793.field2064;
        } else {
            var4 = var5 = new class354(this.field4793);
        }
        return this.method2167(arg0 != 0, arg2, var4, var5, arg1, (byte) 105);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    private final void method2164(int arg0) {
        field4735++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4777; var10++) {
            int var12 = this.field4752[var10];
            int var13 = this.field4755[var10];
            int var14 = this.field4736[var10];
            if (var12 > var5) {
                var5 = var12;
            }
            if (var13 > var6) {
                var6 = var13;
            }
            if (var13 < var3) {
                var3 = var13;
            }
            if (var12 < var2) {
                var2 = var12;
            }
            if (var4 > var14) {
                var4 = var14;
            }
            if (var14 > var7) {
                var7 = var14;
            }
            int var15 = var12 * var12 + var14 * var14;
            if (var8 < var15) {
                var8 = var15;
            }
            int var16 = var13 * var13 + var12 * var12 + var14 * var14;
            if (var9 < var16) {
                var9 = var16;
            }
        }
        this.field4707 = (short) var3;
        int var11 = -115 / ((74 - arg0) / 50);
        this.field4790 = (short) var4;
        this.field4800 = (short) var6;
        this.field4761 = (short) var7;
        this.field4724 = (short) var2;
        this.field4738 = (short) var5;
        this.field4805 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field4821 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field4722 = true;
    }

    @OriginalMember(owner = "client!b", name = "P", descriptor = "(IIII)V")
    public final void method317(int arg0, int arg1, int arg2, int arg3) {
        field4780++;
        if (arg0 == 0) {
            int var5 = 0;
            class367.field4984 = 0;
            class152.field2500 = 0;
            class381.field5186 = 0;
            for (int var6 = 0; var6 < this.field4777; var6++) {
                class367.field4984 += this.field4752[var6];
                class381.field5186 += this.field4755[var6];
                class152.field2500 += this.field4736[var6];
                var5++;
            }
            if (var5 > 0) {
                class367.field4984 = class367.field4984 / var5 + arg1;
                class381.field5186 = class381.field5186 / var5 + arg2;
                class152.field2500 = class152.field2500 / var5 + arg3;
            } else {
                class381.field5186 = arg2;
                class367.field4984 = arg1;
                class152.field2500 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4777; var7++) {
                this.field4752[var7] += arg1;
                this.field4755[var7] += arg2;
                this.field4736[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4777; var8++) {
                this.field4752[var8] -= class367.field4984;
                this.field4755[var8] -= class381.field5186;
                this.field4736[var8] -= class152.field2500;
                if (arg3 != 0) {
                    int var9 = class191.field2937[arg3];
                    int var10 = class191.field2936[arg3];
                    int var11 = this.field4755[var8] * var9 + this.field4752[var8] * var10 + 16383 >> 14;
                    this.field4755[var8] = this.field4755[var8] * var10 + 16383 - (this.field4752[var8] * var9) >> 14;
                    this.field4752[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class191.field2937[arg1];
                    int var13 = class191.field2936[arg1];
                    int var14 = this.field4755[var8] * var13 + 16383 - (this.field4736[var8] * var12) >> 14;
                    this.field4736[var8] = this.field4755[var8] * var12 + this.field4736[var8] * var13 + 16383 >> 14;
                    this.field4755[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class191.field2937[arg2];
                    int var16 = class191.field2936[arg2];
                    int var17 = this.field4752[var8] * var16 + (this.field4736[var8] * var15 + 16383) >> 14;
                    this.field4736[var8] = this.field4736[var8] * var16 + 16383 - (this.field4752[var8] * var15) >> 14;
                    this.field4752[var8] = var17;
                }
                this.field4752[var8] += class367.field4984;
                this.field4755[var8] += class381.field5186;
                this.field4736[var8] += class152.field2500;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4777; var18++) {
                this.field4752[var18] -= class367.field4984;
                this.field4755[var18] -= class381.field5186;
                this.field4736[var18] -= class152.field2500;
                this.field4752[var18] = this.field4752[var18] * arg1 / 128;
                this.field4755[var18] = this.field4755[var18] * arg2 / 128;
                this.field4736[var18] = this.field4736[var18] * arg3 / 128;
                this.field4752[var18] += class367.field4984;
                this.field4755[var18] += class381.field5186;
                this.field4736[var18] += class152.field2500;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field4786; var19++) {
                int var23 = (this.field4826[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field4826[var19] = (byte) var23;
            }
            if (this.field4776 != null) {
                this.field4776.field4319 = null;
            }
            if (this.field4811 != null) {
                for (int var20 = 0; var20 < this.field4763; var20++) {
                    class98 var21 = this.field4811[var20];
                    class173 var22 = this.field4781[var20];
                    var22.field2756 = var22.field2756 & 0xFFFFFF | 255 - (this.field4826[var21.field1608] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field4786; var24++) {
                int var28 = this.field4802[var24] & 0xFFFF;
                int var29 = (var28 & 0xFE28) >> 10;
                int var30 = (var28 & 0x3D8) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = arg1 + var29 & 0x3F;
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
                this.field4802[var24] = (short) class530.method3011(class530.method3011(var33 << 10, var32 << 7), var34);
            }
            if (this.field4776 != null) {
                this.field4776.field4319 = null;
            }
            if (this.field4811 != null) {
                for (int var25 = 0; var25 < this.field4763; var25++) {
                    class98 var26 = this.field4811[var25];
                    class173 var27 = this.field4781[var25];
                    var27.field2756 = class424.field5802[this.field4802[var26.field1608] & 0xFFFF] & 0xFFFFFF | var27.field2756 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field4763; var35++) {
                class173 var36 = this.field4781[var35];
                var36.field2755 += arg2;
                var36.field2763 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field4763; var37++) {
                class173 var38 = this.field4781[var37];
                var38.field2757 = var38.field2757 * arg2 >> 7;
                var38.field2764 = var38.field2764 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field4763; var39++) {
                class173 var40 = this.field4781[var39];
                var40.field2760 = var40.field2760 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "G", descriptor = "()I")
    public final int method304() {
        field4723++;
        if (!this.field4722) {
            this.method2164(125);
        }
        return this.field4761;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIILsk;IIZ)Z")
    private final boolean method2165(int arg0, int arg1, int arg2, class650 arg3, int arg4, int arg5, boolean arg6) {
        field4787++;
        class711 var8 = (class711) arg3;
        class711 var9 = this.field4793.field1963;
        float var10 = var8.field9765 * var9.field9785 + var8.field9771 * var9.field9795 + var8.field9768 * var9.field9794 + var9.field9771;
        float var11 = var8.field9765 * var9.field9767 + var8.field9771 * var9.field9780 + var8.field9768 * var9.field9764 + var9.field9768;
        class228.field3327 = var8.field9783 * var9.field9767 + var8.field9785 * var9.field9780 + var8.field9767 * var9.field9764;
        class220.field3233 = var8.field9762 * var9.field9783 + var8.field9794 * var9.field9770 + var8.field9764 * var9.field9762;
        class168.field2703 = var8.field9783 * var9.field9783 + var8.field9785 * var9.field9770 + var8.field9767 * var9.field9762;
        class72.field1049 = var8.field9770 * var9.field9785 + var8.field9795 * var9.field9795 + var8.field9780 * var9.field9794;
        class165.field2658 = var8.field9770 * var9.field9767 + var8.field9795 * var9.field9780 + var8.field9780 * var9.field9764;
        class643.field8896 = var8.field9783 * var9.field9785 + var8.field9785 * var9.field9795 + var8.field9767 * var9.field9794;
        class423.field5793 = var8.field9770 * var9.field9783 + var8.field9795 * var9.field9770 + var8.field9780 * var9.field9762;
        float var12 = var8.field9765 * var9.field9783 + var8.field9771 * var9.field9770 + var8.field9768 * var9.field9762 + var9.field9765;
        class744.field10274 = var8.field9762 * var9.field9767 + var8.field9794 * var9.field9780 + var8.field9764 * var9.field9764;
        if (arg4 < 1) {
            this.field4788 = null;
        }
        class335.field4521 = var8.field9762 * var9.field9785 + var8.field9794 * var9.field9795 + var8.field9764 * var9.field9794;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field4793.field2046;
        int var19 = this.field4793.field1981;
        if (!this.field4722) {
            this.method2164(125);
        }
        int var20 = this.field4738 - this.field4724 >> 1;
        int var21 = this.field4800 - this.field4707 >> 1;
        int var22 = this.field4761 - this.field4790 >> 1;
        int var23 = this.field4724 + var20;
        int var24 = this.field4707 + var21;
        int var25 = this.field4790 + var22;
        int var26 = var23 - (var20 << arg5);
        int var27 = var24 - (var21 << arg5);
        int var28 = var25 - (var22 << arg5);
        int var29 = (var20 << arg5) + var23;
        int var30 = (var21 << arg5) + var24;
        int var31 = (var22 << arg5) + var25;
        class109.field1704[0] = var26;
        class571.field8135[0] = var27;
        class339.field4579[0] = var28;
        class109.field1704[1] = var29;
        class571.field8135[1] = var27;
        class109.field1704[2] = var26;
        class339.field4579[1] = var28;
        class571.field8135[2] = var30;
        class109.field1704[3] = var29;
        class339.field4579[2] = var28;
        class571.field8135[3] = var30;
        class339.field4579[3] = var28;
        class109.field1704[4] = var26;
        class571.field8135[4] = var27;
        class339.field4579[4] = var31;
        class109.field1704[5] = var29;
        class571.field8135[5] = var27;
        class109.field1704[6] = var26;
        class339.field4579[5] = var31;
        class571.field8135[6] = var30;
        class109.field1704[7] = var29;
        class339.field4579[6] = var31;
        class571.field8135[7] = var30;
        class339.field4579[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class571.field8135[var32];
            float var54 = (float) class109.field1704[var32];
            float var55 = (float) class339.field4579[var32];
            float var56 = class643.field8896 * var55 + class72.field1049 * var54 + class335.field4521 * var53 + var10;
            float var57 = class228.field3327 * var55 + class744.field10274 * var53 + class165.field2658 * var54 + var11;
            float var58 = class168.field2703 * var55 + class423.field5793 * var54 + class220.field3233 * var53 + var12;
            if ((float) this.field4793.field2023 <= var58) {
                if (arg0 > 0) {
                    var58 = arg0;
                }
                float var59 = (float) var18 * var56 / var58 + (float) this.field4793.field2038;
                if (var59 < var14) {
                    var14 = var59;
                }
                float var60 = (float) var19 * var57 / var58 + (float) this.field4793.field2025;
                if (var15 < var59) {
                    var15 = var59;
                }
                if (var60 < var16) {
                    var16 = var60;
                }
                var13 = true;
                if (var17 < var60) {
                    var17 = var60;
                }
            }
        }
        if (var13 && var14 < (float) arg1 && var15 > (float) arg1 && (float) arg2 > var16 && (float) arg2 < var17) {
            if (arg6) {
                return true;
            }
            if (this.field4793.field2086.length < this.field4809) {
                this.field4793.field2086 = new int[this.field4809];
                this.field4793.field2084 = new int[this.field4809];
            }
            int[] var33 = this.field4793.field2086;
            int[] var34 = this.field4793.field2084;
            for (int var35 = 0; var35 < this.field4777; var35++) {
                float var37 = (float) this.field4752[var35];
                float var38 = (float) this.field4736[var35];
                float var39 = (float) this.field4755[var35];
                float var40 = class168.field2703 * var38 + class423.field5793 * var37 + class220.field3233 * var39 + var12;
                float var41 = class643.field8896 * var38 + class72.field1049 * var37 + class335.field4521 * var39 + var10;
                float var42 = class228.field3327 * var38 + class744.field10274 * var39 + class165.field2658 * var37 + var11;
                if (((float) this.field4793.field2023 <= var40)) {
                    if (arg0 > 0) {
                        var40 = arg0;
                    }
                    int var47 = (int) ((float) var18 * var41 / var40 + (float) this.field4793.field2038);
                    int var48 = (int) ((float) var19 * var42 / var40 + (float) this.field4793.field2025);
                    int var49 = this.field4746[var35];
                    int var50 = this.field4746[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field4747[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[var52] = var47;
                        var34[var52] = var48;
                    }
                } else {
                    int var43 = this.field4746[var35];
                    int var44 = this.field4746[var35 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field4747[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        var33[this.field4747[var45] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field4786; var36++) {
                if (var33[this.field4817[var36]] != -999999 && var33[this.field4756[var36]] != -999999 && var33[this.field4810[var36]] != -999999 && this.method2175(var33[this.field4810[var36]], var34[this.field4810[var36]], (byte) 107, arg1, var33[this.field4756[var36]], var34[this.field4756[var36]], var33[this.field4817[var36]], arg2, var34[this.field4817[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!b", name = "NA", descriptor = "()Z")
    public final boolean method277() {
        field4737++;
        if (this.field4789 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field4710; var1++) {
            this.field4752[var1] <<= 0x4;
            this.field4755[var1] <<= 0x4;
            this.field4736[var1] <<= 0x4;
        }
        class152.field2500 = 0;
        class381.field5186 = 0;
        class367.field4984 = 0;
        return true;
    }

    @OriginalMember(owner = "client!b", name = "aa", descriptor = "(SS)V")
    public final void method307(short arg0, short arg1) {
        field4766++;
        class162 var3 = this.field4793.field970;
        for (int var4 = 0; var4 < this.field4786; var4++) {
            if (this.field4767[var4] == arg0) {
                this.field4767[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class311 var7 = var3.method1270(arg0 & 0xFFFF, true);
            var6 = var7.field4236;
            var5 = var7.field4241;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class311 var10 = var3.method1270(arg1 & 0xFFFF, true);
            var8 = var10.field4241;
            var9 = var10.field4236;
            if (var10.field4251 != 0 || var10.field4243 != 0) {
                this.field4791 = true;
            }
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field4811 != null) {
            for (int var11 = 0; var11 < this.field4763; var11++) {
                class98 var12 = this.field4811[var11];
                class173 var13 = this.field4781[var11];
                var13.field2756 = class424.field5802[this.field4802[var12.field1608] & 0xFFFF] & 0xFFFFFF | var13.field2756 & 0xFF000000;
            }
        }
        if (this.field4776 != null) {
            this.field4776.field4319 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lsk;IZ)V")
    public final void method293(class650 arg0, int arg1, boolean arg2) {
        field4728++;
        if (this.field4788 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field4777; var5++) {
            if ((arg1 & this.field4788[var5]) != 0) {
                if (arg2) {
                    arg0.method1870(this.field4752[var5], this.field4755[var5], this.field4736[var5], var4);
                } else {
                    arg0.method1878(this.field4752[var5], this.field4755[var5], this.field4736[var5], var4);
                }
                this.field4752[var5] = var4[0];
                this.field4755[var5] = var4[1];
                this.field4736[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "LA", descriptor = "(I)V")
    public final void method279(int arg0) {
        field4740++;
        this.field4779 = (short) arg0;
        if (this.field4776 != null) {
            this.field4776.field4319 = null;
        }
        if (this.field4782 != null) {
            this.field4782.field4319 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "V", descriptor = "()I")
    public final int method315() {
        field4803++;
        if (!this.field4722) {
            this.method2164(-36);
        }
        return this.field4724;
    }

    @OriginalMember(owner = "client!b", name = "ia", descriptor = "(SS)V")
    public final void method308(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4786; var3++) {
            if (this.field4802[var3] == arg0) {
                this.field4802[var3] = arg1;
            }
        }
        field4734++;
        if (this.field4811 != null) {
            for (int var4 = 0; var4 < this.field4763; var4++) {
                class98 var5 = this.field4811[var4];
                class173 var6 = this.field4781[var4];
                var6.field2756 = var6.field2756 & 0xFF000000 | class424.field5802[this.field4802[var5.field1608] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field4776 != null) {
            this.field4776.field4319 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
    public static void method2166(int arg0) {
        field4748 = null;
        if (arg0 != -30196) {
            field4748 = null;
        }
        field4759 = null;
    }

    @OriginalMember(owner = "client!b", name = "VA", descriptor = "(I)V")
    public final void method302(int arg0) {
        field4824++;
        int var2 = class191.field2937[arg0];
        int var3 = class191.field2936[arg0];
        for (int var4 = 0; var4 < this.field4777; var4++) {
            int var5 = this.field4755[var4] * var2 + (this.field4752[var4] * var3) >> 14;
            this.field4755[var4] = this.field4755[var4] * var3 - this.field4752[var4] * var2 >> 14;
            this.field4752[var4] = var5;
        }
        this.field4722 = false;
        if (this.field4801 != null) {
            this.field4801.field4319 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZZLb;Lb;IB)Lka;")
    private final class499 method2167(boolean arg0, boolean arg1, class354 arg2, class354 arg3, int arg4, byte arg5) {
        arg2.field4779 = this.field4779;
        arg2.field4785 = this.field4785;
        arg2.field4791 = this.field4791;
        if ((arg4 & 0x100) == 0) {
            arg2.field4804 = this.field4804;
        } else {
            arg2.field4804 = true;
        }
        arg2.field4762 = 0;
        arg2.field4809 = this.field4809;
        arg2.field4820 = this.field4820;
        arg2.field4778 = arg4;
        arg2.field4763 = this.field4763;
        arg2.field4786 = this.field4786;
        arg2.field4777 = this.field4777;
        arg2.field4783 = this.field4783;
        field4769++;
        arg2.field4710 = this.field4710;
        boolean var7 = class715.method3982(this.field4820, (byte) -120, arg4);
        boolean var8 = class629.method3534(arg4, (byte) -122, this.field4820);
        boolean var9 = class402.method2405(arg4, this.field4820, 41);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg2.field4752 = this.field4752;
            } else if (arg3.field4752 == null || this.field4710 > arg3.field4752.length) {
                arg2.field4752 = arg3.field4752 = new int[this.field4710];
            } else {
                arg2.field4752 = arg3.field4752;
            }
            if (!var8) {
                arg2.field4755 = this.field4755;
            } else if (arg3.field4755 == null || this.field4710 > arg3.field4755.length) {
                arg2.field4755 = arg3.field4755 = new int[this.field4710];
            } else {
                arg2.field4755 = arg3.field4755;
            }
            if (!var9) {
                arg2.field4736 = this.field4736;
            } else if (arg3.field4736 == null || arg3.field4736.length < this.field4710) {
                arg2.field4736 = arg3.field4736 = new int[this.field4710];
            } else {
                arg2.field4736 = arg3.field4736;
            }
            for (int var11 = 0; var11 < this.field4710; var11++) {
                if (var7) {
                    arg2.field4752[var11] = this.field4752[var11];
                }
                if (var8) {
                    arg2.field4755[var11] = this.field4755[var11];
                }
                if (var9) {
                    arg2.field4736[var11] = this.field4736[var11];
                }
            }
        } else {
            arg2.field4752 = this.field4752;
            arg2.field4755 = this.field4755;
            arg2.field4736 = this.field4736;
        }
        if (class35.method206(0, arg4, this.field4820)) {
            if (arg0) {
                arg2.field4762 = (byte) (arg2.field4762 | 0x1);
            }
            arg2.field4801 = arg3.field4801;
            arg2.field4801.field4319 = this.field4801.field4319;
            arg2.field4801.field4318 = this.field4801.field4318;
        } else if (class301.method1933(this.field4820, (byte) 48, arg4)) {
            arg2.field4801 = this.field4801;
        } else {
            arg2.field4801 = null;
        }
        if (class528.method3002(-28825, arg4, this.field4820)) {
            if (arg3.field4802 == null || this.field4786 > arg3.field4802.length) {
                arg2.field4802 = arg3.field4802 = new short[this.field4786];
            } else {
                arg2.field4802 = arg3.field4802;
            }
            for (int var12 = 0; var12 < this.field4786; var12++) {
                arg2.field4802[var12] = this.field4802[var12];
            }
        } else {
            arg2.field4802 = this.field4802;
        }
        if (class164.method1281(arg4, -127, this.field4820)) {
            if (arg3.field4826 == null || this.field4786 > arg3.field4826.length) {
                arg2.field4826 = arg3.field4826 = new byte[this.field4786];
            } else {
                arg2.field4826 = arg3.field4826;
            }
            for (int var13 = 0; var13 < this.field4786; var13++) {
                arg2.field4826[var13] = this.field4826[var13];
            }
        } else {
            arg2.field4826 = this.field4826;
        }
        if (class4.method23(arg4, false, this.field4820)) {
            if (arg0) {
                arg2.field4762 = (byte) (arg2.field4762 | 0x2);
            }
            arg2.field4776 = arg3.field4776;
            arg2.field4776.field4319 = this.field4776.field4319;
            arg2.field4776.field4318 = this.field4776.field4318;
        } else if (class263.method1721(this.field4820, 9, arg4)) {
            arg2.field4776 = this.field4776;
        } else {
            arg2.field4776 = null;
        }
        if (class787.method4289(arg4, this.field4820, (byte) 85)) {
            if (arg3.field4819 == null || this.field4809 > arg3.field4819.length) {
                int var14 = this.field4809;
                arg2.field4729 = arg3.field4729 = new short[var14];
                arg2.field4823 = arg3.field4823 = new short[var14];
                arg2.field4819 = arg3.field4819 = new short[var14];
            } else {
                arg2.field4819 = arg3.field4819;
                arg2.field4823 = arg3.field4823;
                arg2.field4729 = arg3.field4729;
            }
            if (this.field4743 == null) {
                for (int var15 = 0; var15 < this.field4809; var15++) {
                    arg2.field4819[var15] = this.field4819[var15];
                    arg2.field4729[var15] = this.field4729[var15];
                    arg2.field4823[var15] = this.field4823[var15];
                }
            } else {
                if (arg3.field4743 == null) {
                    arg3.field4743 = new class530();
                }
                class530 var16 = arg2.field4743 = arg3.field4743;
                if (var16.field7183 == null || var16.field7183.length < this.field4809) {
                    int var17 = this.field4809;
                    var16.field7175 = new short[var17];
                    var16.field7177 = new byte[var17];
                    var16.field7182 = new short[var17];
                    var16.field7183 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field4809; var18++) {
                    arg2.field4819[var18] = this.field4819[var18];
                    arg2.field4729[var18] = this.field4729[var18];
                    arg2.field4823[var18] = this.field4823[var18];
                    var16.field7183[var18] = this.field4743.field7183[var18];
                    var16.field7175[var18] = this.field4743.field7175[var18];
                    var16.field7182[var18] = this.field4743.field7182[var18];
                    var16.field7177[var18] = this.field4743.field7177[var18];
                }
            }
            arg2.field4741 = this.field4741;
        } else {
            arg2.field4743 = this.field4743;
            arg2.field4729 = this.field4729;
            arg2.field4819 = this.field4819;
            arg2.field4741 = this.field4741;
            arg2.field4823 = this.field4823;
        }
        if (class137.method1133(arg4, this.field4820, 72)) {
            if (arg0) {
                arg2.field4762 = (byte) (arg2.field4762 | 0x4);
            }
            arg2.field4782 = arg3.field4782;
            arg2.field4782.field4319 = this.field4782.field4319;
            arg2.field4782.field4318 = this.field4782.field4318;
        } else if (class281.method1813(arg4, (byte) 77, this.field4820)) {
            arg2.field4782 = this.field4782;
        } else {
            arg2.field4782 = null;
        }
        if (class637.method3558(this.field4820, (byte) 78, arg4)) {
            if (arg3.field4713 == null || this.field4786 > arg3.field4713.length) {
                int var19 = this.field4809;
                arg2.field4765 = arg3.field4765 = new float[var19];
                arg2.field4713 = arg3.field4713 = new float[var19];
            } else {
                arg2.field4713 = arg3.field4713;
                arg2.field4765 = arg3.field4765;
            }
            for (int var20 = 0; var20 < this.field4809; var20++) {
                arg2.field4713[var20] = this.field4713[var20];
                arg2.field4765[var20] = this.field4765[var20];
            }
        } else {
            arg2.field4765 = this.field4765;
            arg2.field4713 = this.field4713;
        }
        if (class645.method3593((byte) 78, this.field4820, arg4)) {
            if (arg0) {
                arg2.field4762 = (byte) (arg2.field4762 | 0x8);
            }
            arg2.field4720 = arg3.field4720;
            arg2.field4720.field4318 = this.field4720.field4318;
            arg2.field4720.field4319 = this.field4720.field4319;
        } else if (class678.method3822(arg4, this.field4820, 2048)) {
            arg2.field4720 = this.field4720;
        } else {
            arg2.field4720 = null;
        }
        if (class192.method1401(arg4, 0, this.field4820)) {
            if (arg3.field4817 == null || this.field4786 > arg3.field4817.length) {
                int var21 = this.field4786;
                arg2.field4810 = arg3.field4810 = new short[var21];
                arg2.field4817 = arg3.field4817 = new short[var21];
                arg2.field4756 = arg3.field4756 = new short[var21];
            } else {
                arg2.field4756 = arg3.field4756;
                arg2.field4810 = arg3.field4810;
                arg2.field4817 = arg3.field4817;
            }
            for (int var22 = 0; var22 < this.field4786; var22++) {
                arg2.field4817[var22] = this.field4817[var22];
                arg2.field4756[var22] = this.field4756[var22];
                arg2.field4810[var22] = this.field4810[var22];
            }
        } else {
            arg2.field4817 = this.field4817;
            arg2.field4756 = this.field4756;
            arg2.field4810 = this.field4810;
        }
        if (class53.method389((byte) -119, this.field4820, arg4)) {
            if (arg0) {
                arg2.field4762 = (byte) (arg2.field4762 | 0x10);
            }
            arg2.field4760 = arg3.field4760;
            arg2.field4760.field6315 = this.field4760.field6315;
        } else if (class456.method2630(this.field4820, 0, arg4)) {
            arg2.field4760 = this.field4760;
        } else {
            arg2.field4760 = null;
        }
        if (class439.method2558(arg4, -1, this.field4820)) {
            if (arg3.field4767 == null || arg3.field4767.length < this.field4786) {
                int var23 = this.field4786;
                arg2.field4767 = arg3.field4767 = new short[var23];
            } else {
                arg2.field4767 = arg3.field4767;
            }
            for (int var24 = 0; var24 < this.field4786; var24++) {
                arg2.field4767[var24] = this.field4767[var24];
            }
        } else {
            arg2.field4767 = this.field4767;
        }
        if (!class396.method2394(arg4, this.field4820, -119)) {
            arg2.field4781 = this.field4781;
        } else if (arg3.field4781 == null || arg3.field4781.length < this.field4763) {
            int var26 = this.field4763;
            arg2.field4781 = arg3.field4781 = new class173[var26];
            for (int var27 = 0; var27 < this.field4763; var27++) {
                arg2.field4781[var27] = this.field4781[var27].method1316(true);
            }
        } else {
            arg2.field4781 = arg3.field4781;
            for (int var25 = 0; var25 < this.field4763; var25++) {
                arg2.field4781[var25].method1313(true, this.field4781[var25]);
            }
        }
        if (this.field4722) {
            arg2.field4738 = this.field4738;
            arg2.field4722 = true;
            arg2.field4800 = this.field4800;
            arg2.field4790 = this.field4790;
            arg2.field4805 = this.field4805;
            arg2.field4707 = this.field4707;
            arg2.field4761 = this.field4761;
            arg2.field4821 = this.field4821;
            arg2.field4724 = this.field4724;
        } else {
            arg2.field4722 = false;
        }
        arg2.field4773 = this.field4773;
        arg2.field4725 = this.field4725;
        arg2.field4811 = this.field4811;
        arg2.field4788 = this.field4788;
        arg2.field4746 = this.field4746;
        if (arg5 <= 13) {
            this.field4788 = null;
        }
        arg2.field4789 = this.field4789;
        arg2.field4796 = this.field4796;
        arg2.field4747 = this.field4747;
        arg2.field4712 = this.field4712;
        arg2.field4816 = this.field4816;
        arg2.field4807 = this.field4807;
        return arg2;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILsk;ZI)Z")
    public final boolean method290(int arg0, int arg1, class650 arg2, boolean arg3, int arg4) {
        field4727++;
        return this.method2165(-1, arg0, arg1, arg2, 68, arg4, arg3);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BZ)V")
    private final void method2168(byte arg0, boolean arg1) {
        field4775++;
        if (arg0 != -10) {
            this.field4820 = -107;
        }
        boolean var3 = this.field4776 != null && this.field4776.field4319 == null;
        boolean var4 = this.field4782 != null && this.field4782.field4319 == null;
        boolean var5 = this.field4801 != null && this.field4801.field4319 == null;
        boolean var6 = this.field4720 != null && this.field4720.field4319 == null;
        if (arg1) {
            var3 &= (this.field4762 & 0x2) != 0;
            var5 &= (this.field4762 & 0x1) != 0;
            var6 &= (this.field4762 & 0x8) != 0;
            var4 &= (this.field4762 & 0x4) != 0;
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
        if (var7 == 0) {
            return;
        }
        if (this.field4793.field2042.field1413.length < (this.field4809 * var7)) {
            this.field4793.field2042 = new class335((this.field4809 + 100) * var7);
        } else {
            this.field4793.field2042.field1442 = 0;
        }
        class335 var12 = this.field4793.field2042;
        if (var5) {
            if (this.field4793.field2000) {
                for (int var21 = 0; var21 < this.field4777; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field4752[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field4755[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field4736[var21]);
                    int var25 = this.field4746[var21];
                    int var26 = this.field4746[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field4747[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field1442 = var7 * var28;
                        var12.method759(var22, arg0 ^ 0xFFFFFF8B);
                        var12.method759(var23, -29);
                        var12.method759(var24, arg0 ^ 0x23);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field4777; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field4752[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field4755[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field4736[var13]);
                    int var17 = this.field4746[var13];
                    int var18 = this.field4746[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field4747[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field1442 = var7 * var20;
                        var12.method798(-128, var14);
                        var12.method798(-85, var15);
                        var12.method798(arg0 ^ 0xFFFFFFB9, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field4782 == null) {
                short[] var29;
                byte[] var30;
                short[] var31;
                short[] var32;
                if (this.field4743 == null) {
                    var29 = this.field4819;
                    var30 = this.field4741;
                    var31 = this.field4823;
                    var32 = this.field4729;
                } else {
                    var32 = this.field4743.field7175;
                    var31 = this.field4743.field7182;
                    var30 = this.field4743.field7177;
                    var29 = this.field4743.field7183;
                }
                float var33 = this.field4793.field2022[0];
                float var34 = this.field4793.field2022[1];
                float var35 = this.field4793.field2022[2];
                float var36 = this.field4793.field1971;
                float var37 = this.field4793.field2008 * 768.0F / (float) this.field4779;
                float var38 = this.field4793.field2052 * 768.0F / (float) this.field4779;
                for (int var39 = 0; var39 < this.field4786; var39++) {
                    int var40 = this.method2170(this.field4826[var39], this.field4785, this.field4767[var39], this.field4802[var39], 101);
                    float var41 = (float) ((var40 & 0xFF20FA) >> 16) * this.field4793.field1977;
                    short var42 = this.field4817[var39];
                    float var43 = (float) (var40 >> 8 & 0xFF) * this.field4793.field1990;
                    float var44 = (float) (var40 >>> 24) * this.field4793.field2014;
                    short var45 = (short) var30[var42];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var42] * var35 + (float) var29[var42] * var33 + (float) var32[var42] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var42] * var35 + (float) var29[var42] * var33 + (float) var32[var42] * var34) / (float) (var45 * 256);
                    }
                    float var47 = var36 + (var46 < 0.0F ? var38 : var37) * var46;
                    int var48 = (int) (var44 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var41 * var47);
                    int var50 = (int) (var43 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    var12.field1442 = var9 + (var7 * var42);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method754(var48, arg0 + 102);
                    var12.method754(var49, 36);
                    var12.method754(var50, 117);
                    var12.method754(255 - (this.field4826[var39] & 0xFF), 29);
                    short var51 = this.field4756[var39];
                    short var52 = (short) var30[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var33 + (float) var32[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var33 + (float) var32[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = ((var53 < 0.0F) ? var38 : var37) * var53 + var36;
                    int var55 = (int) (var44 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var41 * var54);
                    int var57 = (int) (var43 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    var12.field1442 = var7 * var51 + var9;
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method754(var55, 120);
                    var12.method754(var56, arg0 ^ 0xFFFFFFA0);
                    var12.method754(var57, 64);
                    var12.method754(255 - (this.field4826[var39] & 0xFF), 90);
                    short var58 = this.field4810[var39];
                    short var59 = (short) var30[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var33 + (float) var32[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var33 + (float) var32[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = var36 + (var60 < 0.0F ? var38 : var37) * var60;
                    int var62 = (int) (var44 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var41 * var61);
                    int var64 = (int) (var43 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field1442 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method754(var62, 120);
                    var12.method754(var63, 99);
                    var12.method754(var64, arg0 + 64);
                    var12.method754(255 - (this.field4826[var39] & 0xFF), 24);
                }
            } else {
                for (int var65 = 0; var65 < this.field4786; var65++) {
                    int var66 = this.method2170(this.field4826[var65], this.field4785, this.field4767[var65], this.field4802[var65], 110);
                    var12.field1442 = this.field4817[var65] * var7 + var9;
                    var12.method759(var66, arg0 ^ 0xFFFFFF8F);
                    var12.field1442 = this.field4756[var65] * var7 + var9;
                    var12.method759(var66, 121);
                    var12.field1442 = var9 + (this.field4810[var65] * var7);
                    var12.method759(var66, arg0 - 73);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field4743 == null) {
                var70 = this.field4823;
                var67 = this.field4729;
                var68 = this.field4741;
                var69 = this.field4819;
            } else {
                var67 = this.field4743.field7175;
                var68 = this.field4743.field7177;
                var69 = this.field4743.field7183;
                var70 = this.field4743.field7182;
            }
            float var71 = 3.0F / (float) this.field4779;
            float var72 = 3.0F / (float) (this.field4779 / 2 + this.field4779);
            var12.field1442 = var10;
            if (this.field4793.field2000) {
                for (int var73 = 0; var73 < this.field4809; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2098((float) var69[var73] * var72, true);
                        var12.method2098((float) var67[var73] * var72, true);
                        var12.method2098((float) var70[var73] * var72, true);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2098((float) var69[var73] * var75, true);
                        var12.method2098((float) var67[var73] * var75, true);
                        var12.method2098((float) var70[var73] * var75, true);
                    }
                    var12.field1442 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field4809; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2101(1836032144, (float) var69[var76] * var72);
                        var12.method2101(1836032144, (float) var67[var76] * var72);
                        var12.method2101(1836032144, (float) var70[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2101(arg0 ^ 0x92905F66, (float) var69[var76] * var78);
                        var12.method2101(1836032144, (float) var67[var76] * var78);
                        var12.method2101(1836032144, (float) var70[var76] * var78);
                    }
                    var12.field1442 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field1442 = var11;
            if (this.field4793.field2000) {
                for (int var80 = 0; var80 < this.field4809; var80++) {
                    var12.method2098(this.field4713[var80], true);
                    var12.method2098(this.field4765[var80], true);
                    var12.field1442 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field4809; var79++) {
                    var12.method2101(1836032144, this.field4713[var79]);
                    var12.method2101(1836032144, this.field4765[var79]);
                    var12.field1442 += var7 - 8;
                }
            }
        }
        var12.field1442 = this.field4809 * var7;
        class212 var81;
        if (arg1) {
            if (this.field4799 == null) {
                this.field4799 = this.field4793.method962(var7, true, var12.field1413, var12.field1442, 2834);
            } else {
                this.field4799.method1493(var12.field1413, var7, var12.field1442, -13172);
            }
            this.field4762 = 0;
            var81 = this.field4799;
        } else {
            var81 = this.field4793.method962(var7, false, var12.field1413, var12.field1442, 2834);
            this.field4719 = true;
        }
        if (var5) {
            this.field4801.field4319 = var81;
            this.field4801.field4318 = var8;
        }
        if (var6) {
            this.field4720.field4318 = var11;
            this.field4720.field4319 = var81;
        }
        if (var3) {
            this.field4776.field4318 = var9;
            this.field4776.field4319 = var81;
        }
        if (var4) {
            this.field4782.field4318 = var10;
            this.field4782.field4319 = var81;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lsk;Leea;II)V")
    public final void method310(class650 arg0, class144 arg1, int arg2, int arg3) {
        field4753++;
        if (this.field4809 == 0) {
            return;
        }
        class711 var5 = this.field4793.field1963;
        class711 var6 = (class711) arg0;
        if (!this.field4722) {
            this.method2164(-5);
        }
        class220.field3233 = var5.field9783 * var6.field9762 + var5.field9770 * var6.field9794 + var5.field9762 * var6.field9764;
        class251.field3529 = var5.field9783 * var6.field9765 + var5.field9770 * var6.field9771 + var5.field9762 * var6.field9768 + var5.field9765;
        float var7 = (float) this.field4707 * class220.field3233 + class251.field3529;
        float var8 = (float) this.field4800 * class220.field3233 + class251.field3529;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) this.field4805 + var7;
            var10 = (float) (-this.field4805) + var8;
        } else {
            var10 = var7 - (float) this.field4805;
            var9 = (float) this.field4805 + var8;
        }
        if ((this.field4793.field1976 <= var10) || ((float) this.field4793.field2023 >= var9)) {
            return;
        }
        class335.field4521 = var5.field9785 * var6.field9762 + var5.field9795 * var6.field9794 + var5.field9794 * var6.field9764;
        class69.field1023 = var5.field9785 * var6.field9765 + var5.field9795 * var6.field9771 + var5.field9794 * var6.field9768 + var5.field9771;
        float var11 = (float) this.field4707 * class335.field4521 + class69.field1023;
        float var12 = (float) this.field4800 * class335.field4521 + class69.field1023;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field4805 + var11) * (float) this.field4793.field2046;
            var14 = ((float) (-this.field4805) + var12) * (float) this.field4793.field2046;
        } else {
            var13 = ((float) this.field4805 + var12) * (float) this.field4793.field2046;
            var14 = ((float) (-this.field4805) + var11) * (float) this.field4793.field2046;
        }
        if ((this.field4793.field2067 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field4793.field2071)) {
            return;
        }
        class235.field3373 = var5.field9767 * var6.field9765 + var5.field9780 * var6.field9771 + var5.field9764 * var6.field9768 + var5.field9768;
        class744.field10274 = var5.field9767 * var6.field9762 + var5.field9780 * var6.field9794 + var5.field9764 * var6.field9764;
        float var15 = (float) this.field4707 * class744.field10274 + class235.field3373;
        float var16 = (float) this.field4800 * class744.field10274 + class235.field3373;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var17 = ((float) (-this.field4805) + var16) * (float) this.field4793.field1981;
            var18 = ((float) this.field4805 + var15) * (float) this.field4793.field1981;
        } else {
            var17 = (var15 - (float) this.field4805) * (float) this.field4793.field1981;
            var18 = ((float) this.field4805 + var16) * (float) this.field4793.field1981;
        }
        if ((var17 / (float) arg2 >= this.field4793.field2020) || (this.field4793.field1980 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field4811 != null) {
            class423.field5793 = var5.field9783 * var6.field9770 + var5.field9770 * var6.field9795 + var5.field9762 * var6.field9780;
            class643.field8896 = var5.field9785 * var6.field9783 + var5.field9795 * var6.field9785 + var5.field9794 * var6.field9767;
            class72.field1049 = var5.field9785 * var6.field9770 + var5.field9795 * var6.field9795 + var5.field9794 * var6.field9780;
            class165.field2658 = var5.field9767 * var6.field9770 + var5.field9780 * var6.field9795 + var5.field9764 * var6.field9780;
            class228.field3327 = var5.field9767 * var6.field9783 + var5.field9780 * var6.field9785 + var5.field9764 * var6.field9767;
            class168.field2703 = var5.field9783 * var6.field9783 + var5.field9770 * var6.field9785 + var5.field9762 * var6.field9767;
        }
        if (arg1 != null) {
            int var19 = this.field4724 + this.field4738 >> 1;
            int var20 = this.field4790 + this.field4761 >> 1;
            int var21 = (int) ((float) var20 * class643.field8896 + (float) this.field4707 * class335.field4521 + (float) var19 * class72.field1049 + class69.field1023);
            int var22 = (int) ((float) var20 * class228.field3327 + (float) this.field4707 * class744.field10274 + (float) var19 * class165.field2658 + class235.field3373);
            int var23 = (int) ((float) var20 * class168.field2703 + (float) this.field4707 * class220.field3233 + (float) var19 * class423.field5793 + class251.field3529);
            int var24 = (int) ((float) var20 * class643.field8896 + (float) this.field4800 * class335.field4521 + (float) var19 * class72.field1049 + class69.field1023);
            int var25 = (int) ((float) var20 * class228.field3327 + (float) this.field4800 * class744.field10274 + (float) var19 * class165.field2658 + class235.field3373);
            arg1.field2433 = this.field4793.field2046 * var21 / arg2 + this.field4793.field2038;
            arg1.field2430 = this.field4793.field1981 * var22 / arg2 + this.field4793.field2025;
            arg1.field2431 = this.field4793.field1981 * var25 / arg2 + this.field4793.field2025;
            int var26 = (int) ((float) var20 * class168.field2703 + (float) this.field4800 * class220.field3233 + (float) var19 * class423.field5793 + class251.field3529);
            arg1.field2429 = this.field4793.field2038 + (this.field4793.field2046 * var24 / arg2);
            if (var23 >= this.field4793.field2023 || var26 >= this.field4793.field2023) {
                arg1.field2432 = (var21 + this.field4805) * this.field4793.field2046 / arg2 + this.field4793.field2038 - arg1.field2433;
                arg1.field2428 = true;
            }
        }
        this.field4793.method1014(-90, (float) arg2);
        this.field4793.method985(-17);
        this.field4793.method1010(0, var6);
        this.method2176((byte) 119);
        this.field4793.method1005(-485363544);
        this.method2172(432935728);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lvg;I)V")
    private final void method2169(class60 arg0, int arg1) {
        if (arg1 != -1059072280) {
            return;
        }
        field4714++;
        if (this.field4793.field2086.length < this.field4809) {
            this.field4793.field2086 = new int[this.field4809];
            this.field4793.field2084 = new int[this.field4809];
        }
        int[] var3 = this.field4793.field2086;
        int[] var4 = this.field4793.field2084;
        for (int var5 = 0; var5 < this.field4777; var5++) {
            int var16 = (this.field4752[var5] - (this.field4755[var5] * this.field4793.field1974 >> 8) >> this.field4793.field1936) - arg0.field822;
            int var17 = (this.field4736[var5] - (this.field4755[var5] * this.field4793.field2055 >> 8) >> this.field4793.field1936) - arg0.field819;
            int var18 = this.field4746[var5];
            int var19 = this.field4746[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field4747[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field4783; var6++) {
            if (this.field4826 == null || this.field4826[var6] <= 128) {
                short var7 = this.field4817[var6];
                short var8 = this.field4756[var6];
                short var9 = this.field4810[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var14 - var15) * (var10 - var11) - ((var12 - var11) * (var14 - var13))) > 0) {
                    arg0.method421(var11, var12, (byte) -37, var13, var15, var14, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "k", descriptor = "(I)V")
    public final void method318(int arg0) {
        field4814++;
        int var2 = class191.field2937[arg0];
        int var3 = class191.field2936[arg0];
        for (int var4 = 0; var4 < this.field4777; var4++) {
            int var7 = this.field4752[var4] * var3 + this.field4736[var4] * var2 >> 14;
            this.field4736[var4] = this.field4736[var4] * var3 - (this.field4752[var4] * var2) >> 14;
            this.field4752[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field4809; var5++) {
            int var6 = this.field4823[var5] * var2 + this.field4819[var5] * var3 >> 14;
            this.field4823[var5] = (short) (this.field4823[var5] * var3 - (this.field4819[var5] * var2) >> 14);
            this.field4819[var5] = (short) var6;
        }
        if (this.field4782 == null && this.field4776 != null) {
            this.field4776.field4319 = null;
        }
        if (this.field4782 != null) {
            this.field4782.field4319 = null;
        }
        if (this.field4801 != null) {
            this.field4801.field4319 = null;
        }
        this.field4722 = false;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)V")
    public final void method306(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field4786; var5++) {
            int var9 = this.field4802[var5] & 0xFFFF;
            int var10 = (var9 & 0xFD69) >> 10;
            int var11 = (var9 & 0x3CE) >> 7;
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field4802[var5] = (short) class530.method3011(class530.method3011(var11 << 7, var10 << 10), var12);
        }
        field4772++;
        if (this.field4811 != null) {
            for (int var6 = 0; var6 < this.field4763; var6++) {
                class98 var7 = this.field4811[var6];
                class173 var8 = this.field4781[var6];
                var8.field2756 = class424.field5802[this.field4802[var7.field1608] & 0xFFFF] & 0xFFFFFF | var8.field2756 & 0xFF000000;
            }
        }
        if (this.field4776 != null) {
            this.field4776.field4319 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "fa", descriptor = "()I")
    public final int method276() {
        field4708++;
        if (!this.field4722) {
            this.method2164(125);
        }
        return this.field4707;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BISII)I")
    private final int method2170(byte arg0, int arg1, short arg2, int arg3, int arg4) {
        field4806++;
        if (arg4 <= 81) {
            this.field4786 = 91;
        }
        int var6 = class424.field5802[class132.method1108(arg3, arg1, 127)];
        if (arg2 != -1) {
            class311 var7 = this.field4793.field970.method1270(arg2 & 0xFFFF, true);
            int var8 = var7.field4241 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg1 < 0) {
                    var9 = 0;
                } else if (arg1 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg1 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field4236 & 0xFF;
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
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF00B8) + (var14 & 0xFF00);
            }
        }
        return 255 - ((arg0 & 0xFF) - (var6 << 8));
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIZI[[[Lni;)Z")
    public static final boolean method2171(int arg0, int arg1, int arg2, boolean arg3, int arg4, class549[][][] arg5) {
        field4813++;
        if (arg4 >= -83) {
            field4748 = null;
        }
        byte var6 = arg3 ? 1 : (byte) (class93.field1455 & 0xFF);
        if (class101.field1628[class282.field3917][arg0][arg2] == var6) {
            return false;
        } else if ((class554.field7832[class282.field3917][arg0][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class654.field9056[var7] = arg0;
            int var35 = var7 + 1;
            class764.field10548[var7] = arg2;
            class101.field1628[class282.field3917][arg0][arg2] = var6;
            while (var35 != var8) {
                int var9 = class654.field9056[var8] & 0xFFFF;
                int var10 = class654.field9056[var8] >> 16 & 0xFF;
                int var11 = class654.field9056[var8] >> 24 & 0xFF;
                int var12 = class764.field10548[var8] & 0xFFFF;
                int var13 = (class764.field10548[var8] & 0xFF310E) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class554.field7832[class282.field3917][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg5 != null) {
                    label244: for (int var16 = class282.field3917 + 1; var16 <= 3; var16++) {
                        if (arg5[var16] != null && (class554.field7832[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg5[var16][var9][var12] != null) {
                                if (arg5[var16][var9][var12].field7462 != null) {
                                    int var17 = class495.method2840(58, var10);
                                    if (arg5[var16][var9][var12].field7462.field5065 == var17 || arg5[var16][var9][var12].field7463 != null && arg5[var16][var9][var12].field7463.field5065 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class495.method2840(-113, var11);
                                        if (arg5[var16][var9][var12].field7462.field5065 == var18 || arg5[var16][var9][var12].field7463 != null && arg5[var16][var9][var12].field7463.field5065 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class495.method2840(52, var13);
                                        if (arg5[var16][var9][var12].field7462.field5065 == var19 || arg5[var16][var9][var12].field7463 != null && arg5[var16][var9][var12].field7463.field5065 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class549 var20 = arg5[var16][var9][var12];
                                if (var20.field7466 != null) {
                                    for (class58 var21 = var20.field7466; var21 != null; var21 = var21.field811) {
                                        class597 var22 = var21.field815;
                                        if (var22 instanceof class237) {
                                            class237 var23 = (class237) var22;
                                            int var24 = var23.method1034(-126);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var25 = var23.method1033(-24);
                                            int var26 = var24 | var25 << 6;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class549 var27 = arg5[var16][var9][var12];
                            if (var27 != null && var27.field7466 != null) {
                                for (class58 var28 = var27.field7466; var28 != null; var28 = var28.field811) {
                                    class597 var29 = var28.field815;
                                    if (var29.field8372 != var29.field8368 || var29.field8369 != var29.field8365) {
                                        for (int var30 = var29.field8368; var30 <= var29.field8372; var30++) {
                                            for (int var31 = var29.field8369; var31 <= var29.field8365; var31++) {
                                                class101.field1628[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            var15 = true;
                            class101.field1628[var16][var9][var12] = var6;
                        }
                    }
                }
                if (var15) {
                    int var32 = class745.field10286[class282.field3917 + 1].method1897((byte) -34, var12, var9);
                    if (class58.field812[arg1] < var32) {
                        class58.field812[arg1] = var32;
                    }
                    int var33 = var9 << 9;
                    if (class562.field7972[arg1] > var33) {
                        class562.field7972[arg1] = var33;
                    } else if (class79.field1112[arg1] < var33) {
                        class79.field1112[arg1] = var33;
                    }
                    int var34 = var12 << 9;
                    if (class379.field5164[arg1] > var34) {
                        class379.field5164[arg1] = var34;
                    } else if (var34 > class737.field10175[arg1]) {
                        class737.field10175[arg1] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class101.field1628[class282.field3917][var9 - 1][var12] != var6) {
                        class654.field9056[var35] = class530.method3011(-754974720, class530.method3011(1179648, var9 - 1));
                        class764.field10548[var35] = class530.method3011(1245184, var12);
                        class101.field1628[class282.field3917][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    int var10000 = ~class65.field926;
                    var12++;
                    if (var10000 < ~var12) {
                        if (var9 - 1 >= 0 && class101.field1628[class282.field3917][var9 - 1][var12] != var6 && (class554.field7832[class282.field3917][var9][var12] & 0x4) == 0 && (class554.field7832[class282.field3917][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class654.field9056[var35] = class530.method3011(1375731712, class530.method3011(1179648, var9 - 1));
                            class764.field10548[var35] = class530.method3011(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class101.field1628[class282.field3917][var9 - 1][var12] = var6;
                        }
                        if (class101.field1628[class282.field3917][var9][var12] != var6) {
                            class654.field9056[var35] = class530.method3011(318767104, class530.method3011(var9, 5373952));
                            class764.field10548[var35] = class530.method3011(5439488, var12);
                            class101.field1628[class282.field3917][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class483.field6515 && class101.field1628[class282.field3917][var9 + 1][var12] != var6 && (class554.field7832[class282.field3917][var9][var12] & 0x4) == 0 && (class554.field7832[class282.field3917][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class654.field9056[var35] = class530.method3011(class530.method3011(var9 + 1, 5373952), -1845493760);
                            class764.field10548[var35] = class530.method3011(var12, 5439488);
                            class101.field1628[class282.field3917][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < class483.field6515 && class101.field1628[class282.field3917][var9 + 1][var12] != var6) {
                        class654.field9056[var35] = class530.method3011(class530.method3011(9568256, var9 + 1), 1392508928);
                        class764.field10548[var35] = class530.method3011(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class101.field1628[class282.field3917][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class101.field1628[class282.field3917][var9 - 1][var12] != var6 && (class554.field7832[class282.field3917][var9][var12] & 0x4) == 0 && (class554.field7832[class282.field3917][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class654.field9056[var35] = class530.method3011(class530.method3011(var9 - 1, 13762560), 301989888);
                            class764.field10548[var35] = class530.method3011(13828096, var12);
                            class101.field1628[class282.field3917][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class101.field1628[class282.field3917][var9][var12] != var6) {
                            class654.field9056[var35] = class530.method3011(class530.method3011(var9, 13762560), -1828716544);
                            class764.field10548[var35] = class530.method3011(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class101.field1628[class282.field3917][var9][var12] = var6;
                        }
                        if (class483.field6515 > var9 + 1 && class101.field1628[class282.field3917][var9 + 1][var12] != var6 && (class554.field7832[class282.field3917][var9][var12] & 0x4) == 0 && (class554.field7832[class282.field3917][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class654.field9056[var35] = class530.method3011(-771751936, class530.method3011(var9 + 1, 9568256));
                            class764.field10548[var35] = class530.method3011(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class101.field1628[class282.field3917][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class58.field812[arg1] != -1000000) {
                class58.field812[arg1] += 40;
                class562.field7972[arg1] -= 512;
                class79.field1112[arg1] += 512;
                class737.field10175[arg1] += 512;
                class379.field5164[arg1] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "()[Lqr;")
    public final class72[] method322() {
        field4795++;
        return this.field4816;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "()V")
    public final void method314() {
        field4797++;
    }

    @OriginalMember(owner = "client!b", name = "ua", descriptor = "()I")
    public final int method300() {
        field4744++;
        return this.field4778;
    }

    @OriginalMember(owner = "client!b", name = "wa", descriptor = "()V")
    public final void method284() {
        for (int var1 = 0; var1 < this.field4710; var1++) {
            this.field4752[var1] = this.field4752[var1] + 7 >> 4;
            this.field4755[var1] = this.field4755[var1] + 7 >> 4;
            this.field4736[var1] = this.field4736[var1] + 7 >> 4;
        }
        field4758++;
        if (this.field4801 != null) {
            this.field4801.field4319 = null;
        }
        this.field4722 = false;
    }

    @OriginalMember(owner = "client!b", name = "O", descriptor = "(III)V")
    public final void method282(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4777; var4++) {
            if (arg0 != 128) {
                this.field4752[var4] = this.field4752[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field4755[var4] = this.field4755[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field4736[var4] = this.field4736[var4] * arg2 >> 7;
            }
        }
        field4815++;
        if (this.field4801 != null) {
            this.field4801.field4319 = null;
        }
        this.field4722 = false;
    }

    @OriginalMember(owner = "client!b", name = "EA", descriptor = "()I")
    public final int method297() {
        if (!this.field4722) {
            this.method2164(-43);
        }
        field4822++;
        return this.field4800;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()V")
    public final void method294() {
        field4721++;
        if (this.field4809 <= 0 || this.field4783 <= 0) {
            return;
        }
        this.method2168((byte) -10, false);
        if ((this.field4762 & 0x10) == 0 && this.field4760.field6315 == null) {
            this.method2173((byte) -75, false);
        }
        this.method2163((byte) 120);
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
    private final void method2172(int arg0) {
        if (arg0 != 432935728) {
            return;
        }
        if (this.field4811 != null) {
            class711 var2 = this.field4793.field1932;
            this.field4793.method975(1);
            this.field4793.method557(!this.field4804);
            this.field4793.method956(false, 107);
            this.field4793.method948(this.field4793.field1996, 8448, null, this.field4793.field2016, null);
            for (int var3 = 0; var3 < this.field4763; var3++) {
                class98 var4 = this.field4811[var3];
                class173 var5 = this.field4781[var3];
                if (!var4.field1606 || !this.field4793.method577()) {
                    float var6 = (float) (this.field4752[var4.field1610] + this.field4752[var4.field1605] + this.field4752[var4.field1611]) * 0.3333333F;
                    float var7 = (float) (this.field4755[var4.field1611] + this.field4755[var4.field1610] + this.field4755[var4.field1605]) * 0.3333333F;
                    float var8 = (float) (this.field4736[var4.field1611] + this.field4736[var4.field1610] + this.field4736[var4.field1605]) * 0.3333333F;
                    float var9 = class643.field8896 * var8 + class72.field1049 * var6 + class335.field4521 * var7 + class69.field1023;
                    float var10 = class228.field3327 * var8 + class744.field10274 * var7 + class165.field2658 * var6 + class235.field3373;
                    float var11 = class168.field2703 * var8 + class423.field5793 * var6 + class220.field3233 * var7 + class251.field3529;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field1604;
                    var2.method3959((float) var5.field2763 + var9 - var9 * var12, var4.field1602 * var5.field2764 >> 7, 28420, var11 * var12 - var11, var10 * var12 + (float) var5.field2755 + -var10, var5.field2760, var4.field1609 * var5.field2757 >> 7);
                    this.field4793.method953((byte) -99, var2);
                    int var13 = var5.field2756;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field4793.method1006(1, var4.field1603);
                    this.field4793.method973(1, var4.field1607);
                    this.field4793.method942(7, 4, 0, 127);
                }
            }
            this.field4793.method557(true);
            this.field4793.method1005(-485363544);
        }
        field4764++;
    }

    @OriginalMember(owner = "client!b", name = "FA", descriptor = "(I)V")
    public final void method316(int arg0) {
        field4711++;
        int var2 = class191.field2937[arg0];
        int var3 = class191.field2936[arg0];
        for (int var4 = 0; var4 < this.field4777; var4++) {
            int var5 = this.field4755[var4] * var3 - this.field4736[var4] * var2 >> 14;
            this.field4736[var4] = this.field4755[var4] * var2 + this.field4736[var4] * var3 >> 14;
            this.field4755[var4] = var5;
        }
        if (this.field4801 != null) {
            this.field4801.field4319 = null;
        }
        this.field4722 = false;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(BZ)V")
    private final void method2173(byte arg0, boolean arg1) {
        if (this.field4783 * 6 <= this.field4793.field2042.field1413.length) {
            this.field4793.field2042.field1442 = 0;
        } else {
            this.field4793.field2042 = new class335(this.field4783 * 6 + 600);
        }
        field4717++;
        class335 var3 = this.field4793.field2042;
        if (this.field4793.field2000) {
            for (int var4 = 0; var4 < this.field4783; var4++) {
                var3.method781(19, this.field4817[var4]);
                var3.method781(32, this.field4756[var4]);
                var3.method781(127, this.field4810[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field4783; var5++) {
                var3.method748(255, this.field4817[var5]);
                var3.method748(255, this.field4756[var5]);
                var3.method748(255, this.field4810[var5]);
            }
        }
        if (var3.field1442 == 0) {
            return;
        }
        if (arg1) {
            if (this.field4726 == null) {
                this.field4726 = this.field4793.method932((byte) 25, true, 5123, var3.field1442, var3.field1413);
            } else {
                this.field4726.method175(false, var3.field1413, var3.field1442, 5123);
            }
            this.field4760.field6315 = this.field4726;
        } else {
            this.field4760.field6315 = this.field4793.method932((byte) 25, false, 5123, var3.field1442, var3.field1413);
        }
        if (!arg1) {
            this.field4719 = true;
        }
        if (arg0 > -1) {
            this.method276();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method309(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4808++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            class367.field4984 = 0;
            int var12 = 0;
            class152.field2500 = 0;
            class381.field5186 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field4789.length) {
                    int[] var15 = this.field4789[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class367.field4984 += this.field4752[var17];
                        class381.field5186 += this.field4755[var17];
                        var12++;
                        class152.field2500 += this.field4736[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class381.field5186 = var9;
                class152.field2500 = var10;
                class367.field4984 = var11;
            } else {
                class381.field5186 = class381.field5186 / var12 + var9;
                class367.field4984 = class367.field4984 / var12 + var11;
                class152.field2500 = class152.field2500 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field4789.length > var22) {
                    int[] var23 = this.field4789[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field4752[var25] += var19;
                        this.field4755[var25] += var20;
                        this.field4736[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field4789.length > var45) {
                    int[] var46 = this.field4789[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field4752[var48] -= class367.field4984;
                            this.field4755[var48] -= class381.field5186;
                            this.field4736[var48] -= class152.field2500;
                            if (arg4 != 0) {
                                int var49 = class191.field2937[arg4];
                                int var50 = class191.field2936[arg4];
                                int var51 = this.field4752[var48] * var50 + this.field4755[var48] * var49 + 16383 >> 14;
                                this.field4755[var48] = this.field4755[var48] * var50 + (16383 - (this.field4752[var48] * var49)) >> 14;
                                this.field4752[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class191.field2937[arg2];
                                int var53 = class191.field2936[arg2];
                                int var54 = this.field4755[var48] * var53 + 16383 - (this.field4736[var48] * var52) >> 14;
                                this.field4736[var48] = this.field4755[var48] * var52 + this.field4736[var48] * var53 + 16383 >> 14;
                                this.field4755[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class191.field2937[arg3];
                                int var56 = class191.field2936[arg3];
                                int var57 = this.field4752[var48] * var56 + this.field4736[var48] * var55 + 16383 >> 14;
                                this.field4736[var48] = this.field4736[var48] * var56 + 16383 - (this.field4752[var48] * var55) >> 14;
                                this.field4752[var48] = var57;
                            }
                            this.field4752[var48] += class367.field4984;
                            this.field4755[var48] += class381.field5186;
                            this.field4736[var48] += class152.field2500;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field4752[var59] -= class367.field4984;
                            this.field4755[var59] -= class381.field5186;
                            this.field4736[var59] -= class152.field2500;
                            if (arg2 != 0) {
                                int var60 = class191.field2937[arg2];
                                int var61 = class191.field2936[arg2];
                                int var62 = this.field4755[var59] * var61 + 16383 - (this.field4736[var59] * var60) >> 14;
                                this.field4736[var59] = this.field4755[var59] * var60 + (this.field4736[var59] * var61) + 16383 >> 14;
                                this.field4755[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class191.field2937[arg4];
                                int var64 = class191.field2936[arg4];
                                int var65 = this.field4755[var59] * var63 + this.field4752[var59] * var64 + 16383 >> 14;
                                this.field4755[var59] = this.field4755[var59] * var64 + 16383 - (this.field4752[var59] * var63) >> 14;
                                this.field4752[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class191.field2937[arg3];
                                int var67 = class191.field2936[arg3];
                                int var68 = this.field4736[var59] * var66 + (this.field4752[var59] * var67) + 16383 >> 14;
                                this.field4736[var59] = this.field4736[var59] * var67 + 16383 - (this.field4752[var59] * var66) >> 14;
                                this.field4752[var59] = var68;
                            }
                            this.field4752[var59] += class367.field4984;
                            this.field4755[var59] += class381.field5186;
                            this.field4736[var59] += class152.field2500;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field4789.length > var28) {
                        int[] var29 = this.field4789[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field4746[var31];
                            int var33 = this.field4746[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field4747[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class191.field2937[arg4];
                                    int var37 = class191.field2936[arg4];
                                    int var38 = this.field4819[var35] * var37 + this.field4729[var35] * var36 + 16383 >> 14;
                                    this.field4729[var35] = (short) (this.field4729[var35] * var37 + 16383 - (this.field4819[var35] * var36) >> 14);
                                    this.field4819[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class191.field2937[arg2];
                                    int var40 = class191.field2936[arg2];
                                    int var41 = this.field4729[var35] * var40 + 16383 - (this.field4823[var35] * var39) >> 14;
                                    this.field4823[var35] = (short) (this.field4729[var35] * var39 + (this.field4823[var35] * var40 + 16383) >> 14);
                                    this.field4729[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class191.field2937[arg3];
                                    int var43 = class191.field2936[arg3];
                                    int var44 = this.field4823[var35] * var42 + (this.field4819[var35] * var43) + 16383 >> 14;
                                    this.field4823[var35] = (short) (this.field4823[var35] * var43 + (16383 - (this.field4819[var35] * var42)) >> 14);
                                    this.field4819[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field4782 == null && this.field4776 != null) {
                    this.field4776.field4319 = null;
                }
                if (this.field4782 != null) {
                    this.field4782.field4319 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field4789.length > var70) {
                    int[] var71 = this.field4789[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field4752[var73] -= class367.field4984;
                        this.field4755[var73] -= class381.field5186;
                        this.field4736[var73] -= class152.field2500;
                        this.field4752[var73] = this.field4752[var73] * arg2 >> 7;
                        this.field4755[var73] = this.field4755[var73] * arg3 >> 7;
                        this.field4736[var73] = this.field4736[var73] * arg4 >> 7;
                        this.field4752[var73] += class367.field4984;
                        this.field4755[var73] += class381.field5186;
                        this.field4736[var73] += class152.field2500;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4725 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field4725.length) {
                        int[] var79 = this.field4725[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field4826[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field4826[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field4776 != null) {
                            this.field4776.field4319 = null;
                        }
                    }
                }
                if (this.field4811 != null) {
                    for (int var75 = 0; var75 < this.field4763; var75++) {
                        class98 var76 = this.field4811[var75];
                        class173 var77 = this.field4781[var75];
                        var77.field2756 = var77.field2756 & 0xFFFFFF | 255 - (this.field4826[var76.field1608] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4725 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field4725.length > var87) {
                        int[] var88 = this.field4725[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field4802[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFC93) >> 10;
                            int var93 = (var91 & 0x3E2) >> 7;
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
                            this.field4802[var90] = (short) class530.method3011(class530.method3011(var95 << 7, var94 << 10), var97);
                        }
                        if (var88.length > 0 && this.field4776 != null) {
                            this.field4776.field4319 = null;
                        }
                    }
                }
                if (this.field4811 != null) {
                    for (int var84 = 0; var84 < this.field4763; var84++) {
                        class98 var85 = this.field4811[var84];
                        class173 var86 = this.field4781[var84];
                        var86.field2756 = class424.field5802[this.field4802[var85.field1608] & 0xFFFF] & 0xFFFFFF | var86.field2756 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4773 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field4773.length) {
                        int[] var100 = this.field4773[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class173 var102 = this.field4781[var100[var101]];
                            var102.field2763 += arg2;
                            var102.field2755 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4773 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field4773.length > var104) {
                        int[] var105 = this.field4773[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class173 var107 = this.field4781[var105[var106]];
                            var107.field2757 = var107.field2757 * arg3 >> 7;
                            var107.field2764 = var107.field2764 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4773 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field4773.length > var109) {
                    int[] var110 = this.field4773[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class173 var112 = this.field4781[var110[var111]];
                        var112.field2760 = var112.field2760 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(FIIIBIILdc;FJ)S")
    private final short method2174(float arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, class5 arg7, float arg8, long arg9) {
        field4827++;
        int var12 = this.field4746[arg6];
        int var13 = this.field4746[arg6 + 1];
        int var14 = 0;
        if (arg4 != -122) {
            this.method2170((byte) -58, -14, (short) -113, 72, -115);
        }
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field4747[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class522.field7076[var15] == arg9) {
                return (short) (var16 - 1);
            }
        }
        this.field4747[var14] = (short) (this.field4809 + 1);
        class522.field7076[var14] = arg9;
        this.field4819[this.field4809] = (short) arg2;
        this.field4729[this.field4809] = (short) arg3;
        this.field4823[this.field4809] = (short) arg5;
        this.field4741[this.field4809] = (byte) arg1;
        this.field4713[this.field4809] = arg0;
        this.field4765[this.field4809] = arg8;
        return (short) (this.field4809++);
    }

    @OriginalMember(owner = "client!b", name = "r", descriptor = "()Z")
    public final boolean method326() {
        field4794++;
        return this.field4791;
    }

    @OriginalMember(owner = "client!b", name = "ma", descriptor = "()I")
    public final int method298() {
        field4825++;
        if (!this.field4722) {
            this.method2164(126);
        }
        return this.field4821;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lsk;)V")
    public final void method312(class650 arg0) {
        field4718++;
        class711 var2 = (class711) arg0;
        if (this.field4712 != null) {
            for (int var3 = 0; var3 < this.field4712.length; var3++) {
                class624 var4 = this.field4712[var3];
                class624 var5 = var4;
                if (var4.field8696 != null) {
                    var5 = var4.field8696;
                }
                var5.field8689 = (int) ((float) this.field4736[var4.field8693] * var2.field9785 + (float) this.field4755[var4.field8693] * var2.field9794 + (float) this.field4752[var4.field8693] * var2.field9795 + var2.field9771);
                var5.field8702 = (int) ((float) this.field4736[var4.field8693] * var2.field9767 + (float) this.field4755[var4.field8693] * var2.field9764 + (float) this.field4752[var4.field8693] * var2.field9780 + var2.field9768);
                var5.field8704 = (int) ((float) this.field4736[var4.field8693] * var2.field9783 + (float) this.field4755[var4.field8693] * var2.field9762 + (float) this.field4752[var4.field8693] * var2.field9770 + var2.field9765);
                var5.field8688 = (int) ((float) this.field4736[var4.field8709] * var2.field9785 + (float) this.field4755[var4.field8709] * var2.field9794 + (float) this.field4752[var4.field8709] * var2.field9795 + var2.field9771);
                var5.field8695 = (int) ((float) this.field4736[var4.field8709] * var2.field9767 + (float) this.field4755[var4.field8709] * var2.field9764 + (float) this.field4752[var4.field8709] * var2.field9780 + var2.field9768);
                var5.field8703 = (int) ((float) this.field4736[var4.field8709] * var2.field9783 + (float) this.field4755[var4.field8709] * var2.field9762 + (float) this.field4752[var4.field8709] * var2.field9770 + var2.field9765);
                var5.field8701 = (int) ((float) this.field4736[var4.field8697] * var2.field9785 + (float) this.field4755[var4.field8697] * var2.field9794 + (float) this.field4752[var4.field8697] * var2.field9795 + var2.field9771);
                var5.field8699 = (int) ((float) this.field4736[var4.field8697] * var2.field9767 + (float) this.field4755[var4.field8697] * var2.field9764 + (float) this.field4752[var4.field8697] * var2.field9780 + var2.field9768);
                var5.field8710 = (int) ((float) this.field4736[var4.field8697] * var2.field9783 + (float) this.field4755[var4.field8697] * var2.field9762 + (float) this.field4752[var4.field8697] * var2.field9770 + var2.field9765);
            }
        }
        if (this.field4816 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4816.length; var6++) {
            class72 var7 = this.field4816[var6];
            class72 var8 = var7;
            if (var7.field1058 != null) {
                var8 = var7.field1058;
            }
            if (var7.field1052 == null) {
                var7.field1052 = var2.method1867();
            } else {
                var7.field1052.method1874(var2);
            }
            var8.field1054 = (int) ((float) this.field4736[var7.field1051] * var2.field9785 + (float) this.field4755[var7.field1051] * var2.field9794 + (float) this.field4752[var7.field1051] * var2.field9795 + var2.field9771);
            var8.field1061 = (int) ((float) this.field4736[var7.field1051] * var2.field9767 + (float) this.field4755[var7.field1051] * var2.field9764 + (float) this.field4752[var7.field1051] * var2.field9780 + var2.field9768);
            var8.field1062 = (int) ((float) this.field4736[var7.field1051] * var2.field9783 + (float) this.field4755[var7.field1051] * var2.field9762 + (float) this.field4752[var7.field1051] * var2.field9770 + var2.field9765);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILsk;ZII)Z")
    public final boolean method286(int arg0, int arg1, class650 arg2, boolean arg3, int arg4, int arg5) {
        field4798++;
        return this.method2165(arg5, arg0, arg1, arg2, 75, arg4, arg3);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "()Z")
    public final boolean method288() {
        field4733++;
        if (this.field4767 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field4767.length; var1++) {
            if (this.field4767[var1] != -1 && !this.field4793.field970.method1274(this.field4767[var1], 21532)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!b", name = "na", descriptor = "()I")
    public final int method296() {
        field4784++;
        if (!this.field4722) {
            this.method2164(127);
        }
        return this.field4805;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public final void method320(int arg0) {
        field4770++;
        int var2 = class191.field2937[arg0];
        int var3 = class191.field2936[arg0];
        for (int var4 = 0; var4 < this.field4777; var4++) {
            int var5 = this.field4752[var4] * var3 + this.field4736[var4] * var2 >> 14;
            this.field4736[var4] = this.field4736[var4] * var3 - (this.field4752[var4] * var2) >> 14;
            this.field4752[var4] = var5;
        }
        if (this.field4801 != null) {
            this.field4801.field4319 = null;
        }
        this.field4722 = false;
    }

    @OriginalMember(owner = "client!b", name = "H", descriptor = "(III)V")
    public final void method305(int arg0, int arg1, int arg2) {
        field4739++;
        for (int var4 = 0; var4 < this.field4777; var4++) {
            if (arg0 != 0) {
                this.field4752[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field4755[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field4736[var4] += arg2;
            }
        }
        this.field4722 = false;
        if (this.field4801 != null) {
            this.field4801.field4319 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "C", descriptor = "(I)V")
    public final void method285(int arg0) {
        field4768++;
        this.field4785 = (short) arg0;
        if (this.field4776 != null) {
            this.field4776.field4319 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "WA", descriptor = "()I")
    public final int method295() {
        field4792++;
        return this.field4785;
    }

    @OriginalMember(owner = "client!b", name = "v", descriptor = "()V")
    public final void method323() {
        for (int var1 = 0; var1 < this.field4777; var1++) {
            this.field4736[var1] = -this.field4736[var1];
        }
        field4818++;
        for (int var2 = 0; var2 < this.field4809; var2++) {
            this.field4823[var2] = (short) (-this.field4823[var2]);
        }
        for (int var3 = 0; var3 < this.field4786; var3++) {
            short var4 = this.field4817[var3];
            this.field4817[var3] = this.field4810[var3];
            this.field4810[var3] = var4;
        }
        if (this.field4782 == null && this.field4776 != null) {
            this.field4776.field4319 = null;
        }
        if (this.field4782 != null) {
            this.field4782.field4319 = null;
        }
        this.field4722 = false;
        if (this.field4760 != null) {
            this.field4760.field6315 = null;
        }
        if (this.field4801 != null) {
            this.field4801.field4319 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBIIIIII)Z")
    private final boolean method2175(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4745++;
        if (arg7 < arg8 && arg5 > arg7 && arg1 > arg7) {
            return false;
        }
        if (arg2 < 93) {
            this.method311();
        }
        if (arg7 > arg8 && arg7 > arg5 && arg1 < arg7) {
            return false;
        } else if (arg6 > arg3 && arg3 < arg4 && arg3 < arg0) {
            return false;
        } else {
            return arg3 <= arg6 || arg3 <= arg4 || arg0 >= arg3;
        }
    }

    @OriginalMember(owner = "client!b", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method289(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field4730++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class367.field4984 = 0;
            int var13 = 0;
            class381.field5186 = 0;
            class152.field2500 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field4789.length) {
                    int[] var16 = this.field4789[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field4788 == null || (this.field4788[var18] & arg6) != 0) {
                            class367.field4984 += this.field4752[var18];
                            class381.field5186 += this.field4755[var18];
                            var13++;
                            class152.field2500 += this.field4736[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class367.field4984 = var10;
                class381.field5186 = var11;
                class152.field2500 = var12;
            } else {
                class152.field2500 = class152.field2500 / var13 + var12;
                class497.field6807 = true;
                class381.field5186 = class381.field5186 / var13 + var11;
                class367.field4984 = class367.field4984 / var13 + var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
                arg4 = var21;
                arg2 = var19;
                arg3 = var20;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field4789.length > var26) {
                    int[] var27 = this.field4789[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field4788 == null || (arg6 & this.field4788[var29]) != 0) {
                            this.field4752[var29] += var23;
                            this.field4755[var29] += var24;
                            this.field4736[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field4789.length > var49) {
                        int[] var50 = this.field4789[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field4788 == null || (arg6 & this.field4788[var52]) != 0) {
                                this.field4752[var52] -= class367.field4984;
                                this.field4755[var52] -= class381.field5186;
                                this.field4736[var52] -= class152.field2500;
                                if (arg4 != 0) {
                                    int var53 = class191.field2937[arg4];
                                    int var54 = class191.field2936[arg4];
                                    int var55 = this.field4755[var52] * var53 + (this.field4752[var52] * var54) + 16383 >> 14;
                                    this.field4755[var52] = this.field4755[var52] * var54 + (16383 - (this.field4752[var52] * var53)) >> 14;
                                    this.field4752[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class191.field2937[arg2];
                                    int var57 = class191.field2936[arg2];
                                    int var58 = this.field4755[var52] * var57 + 16383 - (this.field4736[var52] * var56) >> 14;
                                    this.field4736[var52] = this.field4755[var52] * var56 + (this.field4736[var52] * var57) + 16383 >> 14;
                                    this.field4755[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class191.field2937[arg3];
                                    int var60 = class191.field2936[arg3];
                                    int var61 = this.field4752[var52] * var60 + this.field4736[var52] * var59 + 16383 >> 14;
                                    this.field4736[var52] = this.field4736[var52] * var60 + 16383 - (this.field4752[var52] * var59) >> 14;
                                    this.field4752[var52] = var61;
                                }
                                this.field4752[var52] += class367.field4984;
                                this.field4755[var52] += class381.field5186;
                                this.field4736[var52] += class152.field2500;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field4789.length > var32) {
                            int[] var33 = this.field4789[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field4788 == null || (this.field4788[var35] & arg6) != 0) {
                                    int var36 = this.field4746[var35];
                                    int var37 = this.field4746[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field4747[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class191.field2937[arg4];
                                            int var41 = class191.field2936[arg4];
                                            int var42 = this.field4819[var39] * var41 + this.field4729[var39] * var40 + 16383 >> 14;
                                            this.field4729[var39] = (short) (this.field4729[var39] * var41 + 16383 - (this.field4819[var39] * var40) >> 14);
                                            this.field4819[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class191.field2937[arg2];
                                            int var44 = class191.field2936[arg2];
                                            int var45 = this.field4729[var39] * var44 + 16383 - (this.field4823[var39] * var43) >> 14;
                                            this.field4823[var39] = (short) (this.field4823[var39] * var44 + this.field4729[var39] * var43 + 16383 >> 14);
                                            this.field4729[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class191.field2937[arg3];
                                            int var47 = class191.field2936[arg3];
                                            int var48 = this.field4819[var39] * var47 + this.field4823[var39] * var46 + 16383 >> 14;
                                            this.field4823[var39] = (short) (this.field4823[var39] * var47 + 16383 - (this.field4819[var39] * var46) >> 14);
                                            this.field4819[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field4782 == null && this.field4776 != null) {
                        this.field4776.field4319 = null;
                    }
                    if (this.field4782 != null) {
                        this.field4782.field4319 = null;
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
                if (class497.field6807) {
                    int var68 = arg7[0] * class367.field4984 + arg7[3] * class381.field5186 + arg7[6] * class152.field2500 + 8192 >> 14;
                    int var69 = arg7[7] * class152.field2500 + arg7[4] * class381.field5186 + arg7[1] * class367.field4984 + 8192 >> 14;
                    int var70 = var65 + var68;
                    int var71 = arg7[2] * class367.field4984 + arg7[8] * class152.field2500 + (arg7[5] * class381.field5186) + 8192 >> 14;
                    int var72 = var66 + var69;
                    class367.field4984 = var70;
                    class381.field5186 = var72;
                    int var73 = var67 + var71;
                    class152.field2500 = var73;
                    class497.field6807 = false;
                }
                int[] var74 = new int[9];
                int var75 = class191.field2936[arg2];
                int var76 = class191.field2937[arg2];
                int var77 = class191.field2936[arg3];
                int var78 = class191.field2937[arg3];
                int var79 = class191.field2936[arg4];
                int var80 = class191.field2937[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[1] = -var77 * var80 + (var78 * var81) + 8192 >> 14;
                var74[5] = -var76;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                int var83 = var74[0] * -class367.field4984 + var74[1] * -class381.field5186 + var74[2] * -class152.field2500 + 8192 >> 14;
                int var84 = var74[4] * -class381.field5186 + var74[3] * -class367.field4984 + (var74[5] * -class152.field2500) + 8192 >> 14;
                int var85 = var74[6] * -class367.field4984 + var74[8] * -class152.field2500 + var74[7] * -class381.field5186 + 8192 >> 14;
                int var86 = class367.field4984 + var83;
                int var87 = var84 + class381.field5186;
                int var88 = class152.field2500 + var85;
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
                int var91 = var74[2] * var67 + (var74[0] * var65 + var74[1] * var66 + 8192) >> 14;
                int var92 = var74[3] * var65 + (var74[4] * var66) + (var74[5] * var67) + 8192 >> 14;
                int var93 = var74[7] * var66 + var74[6] * var65 + (var74[8] * var67 - -8192) >> 14;
                int var94 = var86 + var91;
                int var95 = var87 + var92;
                int var96 = var88 + var93;
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
                int var99 = arg7[0] * var94 + arg7[2] * var96 + arg7[1] * var95 + 8192 >> 14;
                int var100 = arg7[5] * var96 + arg7[3] * var94 + arg7[4] * var95 + 8192 >> 14;
                int var101 = arg7[6] * var94 + arg7[7] * var95 + arg7[8] * var96 + 8192 >> 14;
                int var102 = var62 + var99;
                int var103 = var63 + var100;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field4789.length > var106) {
                        int[] var107 = this.field4789[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field4788 == null || (this.field4788[var109] & arg6) != 0) {
                                int var110 = this.field4752[var109] * var97[0] + this.field4736[var109] * var97[2] + (this.field4755[var109] * var97[1]) + 8192 >> 14;
                                int var111 = this.field4755[var109] * var97[4] + this.field4752[var109] * var97[3] + this.field4736[var109] * var97[5] + 8192 >> 14;
                                int var112 = this.field4755[var109] * var97[7] + this.field4752[var109] * var97[6] + this.field4736[var109] * var97[8] + 8192 >> 14;
                                int var113 = var103 + var111;
                                int var114 = var102 + var110;
                                int var115 = var104 + var112;
                                this.field4752[var109] = var114;
                                this.field4755[var109] = var113;
                                this.field4736[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field4789.length > var123) {
                        int[] var124 = this.field4789[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field4788 == null || (this.field4788[var126] & arg6) != 0) {
                                this.field4752[var126] -= class367.field4984;
                                this.field4755[var126] -= class381.field5186;
                                this.field4736[var126] -= class152.field2500;
                                this.field4752[var126] = this.field4752[var126] * arg2 >> 7;
                                this.field4755[var126] = this.field4755[var126] * arg3 >> 7;
                                this.field4736[var126] = this.field4736[var126] * arg4 >> 7;
                                this.field4752[var126] += class367.field4984;
                                this.field4755[var126] += class381.field5186;
                                this.field4736[var126] += class152.field2500;
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
                if (class497.field6807) {
                    int var133 = arg7[3] * class381.field5186 + (arg7[6] * class152.field2500) + arg7[0] * class367.field4984 + 8192 >> 14;
                    int var134 = arg7[1] * class367.field4984 + arg7[4] * class381.field5186 - (-(arg7[7] * class152.field2500) + -8192) >> 14;
                    int var135 = var131 + var134;
                    int var136 = var130 + var133;
                    int var137 = arg7[2] * class367.field4984 + arg7[8] * class152.field2500 + arg7[5] * class381.field5186 + 8192 >> 14;
                    class381.field5186 = var135;
                    class367.field4984 = var136;
                    int var138 = var132 + var137;
                    class497.field6807 = false;
                    class152.field2500 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class367.field4984 * var139 + 8192 >> 14;
                int var143 = -class381.field5186 * var140 + 8192 >> 14;
                int var144 = -class152.field2500 * var141 + 8192 >> 14;
                int var145 = class367.field4984 + var142;
                int var146 = class381.field5186 + var143;
                int var147 = class152.field2500 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
                int var152 = var146 + var150;
                int var153 = var145 + var149;
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
                int var157 = arg7[2] * var154 + arg7[1] * var152 + arg7[0] * var153 + 8192 >> 14;
                int var158 = arg7[3] * var153 - (-(arg7[4] * var152) - (arg7[5] * var154 + 8192)) >> 14;
                int var159 = arg7[6] * var153 + arg7[7] * var152 - (-(arg7[8] * var154) + -8192) >> 14;
                int var160 = var127 + var157;
                int var161 = var128 + var158;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field4789.length > var164) {
                        int[] var165 = this.field4789[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field4788 == null || (arg6 & this.field4788[var167]) != 0) {
                                int var168 = this.field4755[var167] * var155[1] + this.field4752[var167] * var155[0] - (-(this.field4736[var167] * var155[2]) - 8192) >> 14;
                                int var169 = this.field4755[var167] * var155[4] + this.field4752[var167] * var155[3] + this.field4736[var167] * var155[5] + 8192 >> 14;
                                int var170 = var161 + var169;
                                int var171 = var160 + var168;
                                int var172 = this.field4755[var167] * var155[7] + this.field4752[var167] * var155[6] + this.field4736[var167] * var155[8] + 8192 >> 14;
                                int var173 = var162 + var172;
                                this.field4752[var167] = var171;
                                this.field4755[var167] = var170;
                                this.field4736[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4725 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field4725.length) {
                        int[] var182 = this.field4725[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field4796 == null || (this.field4796[var184] & arg6) != 0) {
                                int var185 = (this.field4826[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field4826[var184] = (byte) var185;
                                if (this.field4776 != null) {
                                    this.field4776.field4319 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4811 != null) {
                    for (int var178 = 0; var178 < this.field4763; var178++) {
                        class98 var179 = this.field4811[var178];
                        class173 var180 = this.field4781[var178];
                        var180.field2756 = var180.field2756 & 0xFFFFFF | 255 - (this.field4826[var179.field1608] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4725 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field4725.length > var190) {
                        int[] var191 = this.field4725[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field4796 == null || (this.field4796[var193] & arg6) != 0) {
                                int var194 = this.field4802[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = var194 & 0x7F;
                                int var199 = arg2 + var195 & 0x3F;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                int var200 = arg4 + var198;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field4802[var193] = (short) class530.method3011(var200, class530.method3011(var199 << 10, var197 << 7));
                                if (this.field4776 != null) {
                                    this.field4776.field4319 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4811 != null) {
                    for (int var187 = 0; var187 < this.field4763; var187++) {
                        class98 var188 = this.field4811[var187];
                        class173 var189 = this.field4781[var187];
                        var189.field2756 = var189.field2756 & 0xFF000000 | class424.field5802[this.field4802[var188.field1608] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4773 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field4773.length > var202) {
                        int[] var203 = this.field4773[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class173 var205 = this.field4781[var203[var204]];
                            var205.field2763 += arg2;
                            var205.field2755 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4773 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field4773.length) {
                        int[] var208 = this.field4773[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class173 var210 = this.field4781[var208[var209]];
                            var210.field2757 = var210.field2757 * arg3 >> 7;
                            var210.field2764 = var210.field2764 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4773 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field4773.length > var212) {
                    int[] var213 = this.field4773[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class173 var215 = this.field4781[var213[var214]];
                        var215.field2760 = var215.field2760 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
    public final void method328() {
        field4774++;
    }

    @OriginalMember(owner = "client!b", name = "HA", descriptor = "()I")
    public final int method283() {
        if (!this.field4722) {
            this.method2164(-79);
        }
        field4749++;
        return this.field4790;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    private final void method2176(byte arg0) {
        field4732++;
        if (this.field4783 == 0) {
            return;
        }
        if (arg0 <= 94) {
            this.method284();
        }
        if (this.field4762 != 0) {
            this.method2168((byte) -10, true);
        }
        this.method2168((byte) -10, false);
        if (this.field4760 != null) {
            if (this.field4760.field6315 == null) {
                this.method2173((byte) -61, (this.field4762 & 0x10) != 0);
            }
            if (this.field4760.field6315 != null) {
                this.field4793.method956(this.field4782 != null, 100);
                this.field4793.method948(this.field4801, 8448, this.field4782, this.field4720, this.field4776);
                int var2 = this.field4807.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field4807[var3];
                    int var5 = this.field4807[var3 + 1];
                    int var6 = this.field4767[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field4793.method960(var6, this.field4782 != null, true);
                    this.field4793.method951(393, var4 * 3, this.field4760.field6315, (var5 - var4) * 3, 4);
                }
            }
        }
        this.method2163((byte) 103);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lhk;)V")
    public class354(class111 arg0) {
        this.field4793 = arg0;
        this.field4801 = new class316(null, 5126, 3, 0);
        this.field4720 = new class316(null, 5126, 2, 0);
        this.field4782 = new class316(null, 5126, 3, 0);
        this.field4776 = new class316(null, 5121, 4, 0);
        this.field4760 = new class465();
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lhk;Ldc;IIII)V")
    public class354(class111 arg0, class5 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4778 = arg2;
        this.field4793 = arg0;
        this.field4820 = arg5;
        if (class301.method1933(arg5, (byte) 84, arg2)) {
            this.field4801 = new class316(null, 5126, 3, 0);
        }
        if (class678.method3822(arg2, arg5, 2048)) {
            this.field4720 = new class316(null, 5126, 2, 0);
        }
        if (class281.method1813(arg2, (byte) 100, arg5)) {
            this.field4782 = new class316(null, 5126, 3, 0);
        }
        if (class263.method1721(arg5, 9, arg2)) {
            this.field4776 = new class316(null, 5121, 4, 0);
        }
        if (class456.method2630(arg5, 0, arg2)) {
            this.field4760 = new class465();
        }
        class162 var7 = arg0.field970;
        int[] var8 = new int[arg1.field82];
        this.field4746 = new int[arg1.field80 + 1];
        for (int var9 = 0; var9 < arg1.field82; var9++) {
            if (arg1.field65 == null || arg1.field65[var9] != 2) {
                if (arg1.field66 != null && arg1.field66[var9] != -1) {
                    class311 var173 = var7.method1270(arg1.field66[var9] & 0xFFFF, true);
                    if (((this.field4820 & 0x40) == 0 || !var173.field4244) && var173.field4233) {
                        continue;
                    }
                }
                var8[this.field4786++] = var9;
                this.field4746[arg1.field53[var9]]++;
                this.field4746[arg1.field92[var9]]++;
                this.field4746[arg1.field89[var9]]++;
            }
        }
        this.field4783 = this.field4786;
        long[] var10 = new long[this.field4786];
        boolean var11 = (this.field4778 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field4786; var12++) {
            int var156 = var8[var12];
            class311 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field95 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field95.length; var163++) {
                    class482 var164 = arg1.field95[var163];
                    if (var164.field6504 == var156) {
                        class709 var165 = class506.method2893(var164.field6507, 393216);
                        if (var165.field9742) {
                            var162 = true;
                        }
                        if (var165.field9755 != -1) {
                            class311 var166 = var7.method1270(var165.field9755, true);
                            if (var166.field4242 == 2) {
                                this.field4804 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field4783--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field66 != null) {
                var167 = arg1.field66[var156];
                if (var167 != -1) {
                    var157 = var7.method1270(var167 & 0xFFFF, true);
                    if ((this.field4820 & 0x40) != 0 && var157.field4244) {
                        var167 = -1;
                        var157 = null;
                    } else {
                        var161 = var157.field4249;
                        if (var157.field4251 != 0 || var157.field4243 != 0) {
                            this.field4791 = true;
                        }
                        var160 = var157.field4250;
                    }
                }
            }
            boolean var168 = arg1.field60 != null && arg1.field60[var156] != 0 || var157 != null && var157.field4242 != 0;
            if ((var11 || var168) && arg1.field73 != null) {
                var158 += arg1.field73[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = ((var167 & 0xFFFF) << 16) + var159;
            int var171 = (var161 & 0xFF) + var169;
            int var172 = (var12 & 0xFFFF) + var170;
            var10[var12] = ((long) var171 << 32) + ((long) var172);
            this.field4804 |= var168;
            this.field4791 |= var157 != null && (var157.field4251 != 0 || var157.field4243 != 0);
        }
        class87.method693(var8, 1, var10);
        this.field4777 = arg1.field80;
        this.field4752 = arg1.field64;
        this.field4736 = arg1.field61;
        this.field4710 = arg1.field96;
        this.field4788 = arg1.field70;
        this.field4755 = arg1.field83;
        this.field4816 = arg1.field79;
        class388[] var13 = new class388[this.field4777];
        this.field4712 = arg1.field105;
        if (arg1.field95 != null) {
            this.field4763 = arg1.field95.length;
            this.field4811 = new class98[this.field4763];
            this.field4781 = new class173[this.field4763];
            for (int var14 = 0; var14 < this.field4763; var14++) {
                class482 var15 = arg1.field95[var14];
                class709 var16 = class506.method2893(var15.field6507, 393216);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field4786; var18++) {
                    if (var8[var18] == var15.field6504) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class424.field5802[arg1.field90[var15.field6504] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field60 == null ? 0 : arg1.field60[var15.field6504]) << 24;
                this.field4811[var14] = new class98(var17, arg1.field53[var15.field6504], arg1.field92[var15.field6504], arg1.field89[var15.field6504], var16.field9754, var16.field9752, var16.field9755, var16.field9749, var16.field9753, var16.field9742, var16.field9748, var15.field6506);
                this.field4781[var14] = new class173(var20);
            }
        }
        int var21 = this.field4786 * 3;
        this.field4713 = new float[var21];
        this.field4826 = new byte[this.field4786];
        this.field4747 = new short[var21];
        this.field4817 = new short[this.field4786];
        this.field4779 = (short) arg4;
        this.field4802 = new short[this.field4786];
        this.field4756 = new short[this.field4786];
        this.field4823 = new short[var21];
        this.field4785 = (short) arg3;
        class522.field7076 = new long[var21];
        this.field4767 = new short[this.field4786];
        this.field4765 = new float[var21];
        if (arg1.field63 != null) {
            this.field4796 = new short[this.field4786];
        }
        this.field4729 = new short[var21];
        this.field4810 = new short[this.field4786];
        this.field4819 = new short[var21];
        this.field4741 = new byte[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field80; var23++) {
            int var155 = this.field4746[var23];
            this.field4746[var23] = var22;
            var13[var23] = new class388();
            var22 += var155;
        }
        this.field4746[arg1.field80] = var22;
        class128 var24 = class192.method1402(var8, this.field4786, (byte) 95, arg1);
        class254[] var25 = new class254[arg1.field82];
        for (int var26 = 0; var26 < arg1.field82; var26++) {
            short var134 = arg1.field53[var26];
            short var135 = arg1.field92[var26];
            short var136 = arg1.field89[var26];
            int var137 = this.field4752[var135] - this.field4752[var134];
            int var138 = this.field4755[var135] - this.field4755[var134];
            int var139 = this.field4736[var135] - this.field4736[var134];
            int var140 = this.field4752[var136] - this.field4752[var134];
            int var141 = this.field4755[var136] - this.field4755[var134];
            int var142 = this.field4736[var136] - this.field4736[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145;
            for (var145 = var137 * var141 - (var138 * var140); var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192; var145 >>= 0x1) {
                var144 >>= 0x1;
                var143 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var144 * var144 + var143 * var143 + var145 * var145));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var143 * 256 / var146;
            int var148 = var144 * 256 / var146;
            int var149 = var145 * 256 / var146;
            byte var150 = arg1.field65 == null ? 0 : arg1.field65[var26];
            if (var150 == 0) {
                class388 var151 = var13[var134];
                var151.field5330++;
                var151.field5331 += var147;
                var151.field5333 += var148;
                var151.field5329 += var149;
                class388 var152 = var13[var135];
                var152.field5333 += var148;
                var152.field5330++;
                var152.field5329 += var149;
                var152.field5331 += var147;
                class388 var153 = var13[var136];
                var153.field5331 += var147;
                var153.field5333 += var148;
                var153.field5329 += var149;
                var153.field5330++;
            } else if (var150 == 1) {
                class254 var154 = var25[var26] = new class254();
                var154.field3580 = var148;
                var154.field3574 = var149;
                var154.field3575 = var147;
            }
        }
        for (int var27 = 0; var27 < this.field4786; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field90[var43] & 0xFFFF;
            int var45;
            if (arg1.field68 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field68[var43];
            }
            int var46;
            if (arg1.field60 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field60[var43] & 0xFF;
            }
            short var47 = arg1.field66 == null ? -1 : arg1.field66[var43];
            if (var47 != -1 && (this.field4820 & 0x40) != 0) {
                class311 var48 = var7.method1270(var47 & 0xFFFF, true);
                if (var48.field4244) {
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
                    var50 = 1.0F;
                    var49 = 0.0F;
                    var51 = 1.0F;
                    var55 = 1;
                    var52 = 1.0F;
                    var53 = 0.0F;
                    var54 = 0.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field86[var45];
                    if (var58 == 0) {
                        short var87 = arg1.field53[var43];
                        short var88 = arg1.field92[var43];
                        short var89 = arg1.field89[var43];
                        short var90 = arg1.field94[var45];
                        short var91 = arg1.field78[var45];
                        short var92 = arg1.field75[var45];
                        float var93 = (float) arg1.field64[var90];
                        float var94 = (float) arg1.field83[var90];
                        float var95 = (float) arg1.field61[var90];
                        float var96 = (float) arg1.field64[var91] - var93;
                        float var97 = (float) arg1.field83[var91] - var94;
                        float var98 = (float) arg1.field61[var91] - var95;
                        float var99 = (float) arg1.field64[var92] - var93;
                        float var100 = (float) arg1.field83[var92] - var94;
                        float var101 = (float) arg1.field61[var92] - var95;
                        float var102 = (float) arg1.field64[var87] - var93;
                        float var103 = (float) arg1.field83[var87] - var94;
                        float var104 = (float) arg1.field61[var87] - var95;
                        float var105 = (float) arg1.field64[var88] - var93;
                        float var106 = (float) arg1.field83[var88] - var94;
                        float var107 = (float) arg1.field61[var88] - var95;
                        float var108 = (float) arg1.field64[var89] - var93;
                        float var109 = (float) arg1.field83[var89] - var94;
                        float var110 = (float) arg1.field61[var89] - var95;
                        float var111 = var97 * var101 - (var98 * var100);
                        float var112 = var98 * var99 - (var96 * var101);
                        float var113 = var96 * var100 - var97 * var99;
                        float var114 = var100 * var113 - var101 * var112;
                        float var115 = var101 * var111 - var99 * var113;
                        float var116 = var99 * var112 - (var100 * var111);
                        float var117 = 1.0F / (var98 * var116 + var96 * var114 + var97 * var115);
                        var51 = (var107 * var116 + var105 * var114 + var106 * var115) * var117;
                        var49 = (var104 * var116 + var102 * var114 + var103 * var115) * var117;
                        var53 = (var110 * var116 + var108 * var114 + var109 * var115) * var117;
                        float var118 = var96 * var112 - var97 * var111;
                        float var119 = var98 * var111 - var96 * var113;
                        float var120 = var97 * var113 - (var98 * var112);
                        float var121 = 1.0F / (var101 * var118 + var99 * var120 + var100 * var119);
                        var54 = (var110 * var118 + var108 * var120 + var109 * var119) * var121;
                        var52 = (var107 * var118 + var105 * var120 + var106 * var119) * var121;
                        var50 = (var104 * var118 + var102 * var120 + var103 * var119) * var121;
                    } else {
                        short var59 = arg1.field53[var43];
                        short var60 = arg1.field92[var43];
                        short var61 = arg1.field89[var43];
                        int var62 = var24.field2248[var45];
                        int var63 = var24.field2245[var45];
                        int var64 = var24.field2246[var45];
                        float[] var65 = var24.field2243[var45];
                        byte var66 = arg1.field106[var45];
                        float var67 = (float) arg1.field59[var45] / 256.0F;
                        if (var58 == 1) {
                            float var68 = (float) arg1.field85[var45] / 1024.0F;
                            class129.method1098(var64, var63, arg1.field61[var59], arg1.field64[var59], var68, var62, arg1.field83[var59], var67, -7677, class214.field3185, var66, var65);
                            var49 = class214.field3185[0];
                            var50 = class214.field3185[1];
                            class129.method1098(var64, var63, arg1.field61[var60], arg1.field64[var60], var68, var62, arg1.field83[var60], var67, -7677, class214.field3185, var66, var65);
                            var51 = class214.field3185[0];
                            var52 = class214.field3185[1];
                            class129.method1098(var64, var63, arg1.field61[var61], arg1.field64[var61], var68, var62, arg1.field83[var61], var67, -7677, class214.field3185, var66, var65);
                            var54 = class214.field3185[1];
                            var53 = class214.field3185[0];
                            float var69 = var68 / 2.0F;
                            if ((var66 & 0x1) == 0) {
                                if (var69 < var53 - var49) {
                                    var53 -= var68;
                                    var56 = 1;
                                } else if (var49 - var53 > var69) {
                                    var53 += var68;
                                    var56 = 2;
                                }
                                if ((var69 < var51 - var49)) {
                                    var51 -= var68;
                                    var55 = 1;
                                } else if (var69 < var49 - var51) {
                                    var51 += var68;
                                    var55 = 2;
                                }
                            } else {
                                if (var69 < var52 - var50) {
                                    var55 = 1;
                                    var52 -= var68;
                                } else if (var69 < var50 - var52) {
                                    var52 += var68;
                                    var55 = 2;
                                }
                                if ((var69 < var54 - var50)) {
                                    var54 -= var68;
                                    var56 = 1;
                                } else if (var50 - var54 > var69) {
                                    var54 += var68;
                                    var56 = 2;
                                }
                            }
                        } else if (var58 == 2) {
                            float var70 = (float) arg1.field62[var45] / 256.0F;
                            float var71 = (float) arg1.field56[var45] / 256.0F;
                            int var72 = arg1.field64[var60] - arg1.field64[var59];
                            int var73 = arg1.field83[var60] - arg1.field83[var59];
                            int var74 = arg1.field61[var60] - arg1.field61[var59];
                            int var75 = arg1.field64[var61] - arg1.field64[var59];
                            int var76 = arg1.field83[var61] - arg1.field83[var59];
                            int var77 = arg1.field61[var61] - arg1.field61[var59];
                            int var78 = var73 * var77 - (var74 * var76);
                            int var79 = var74 * var75 - var72 * var77;
                            int var80 = var72 * var76 - (var73 * var75);
                            float var81 = 64.0F / (float) arg1.field57[var45];
                            float var82 = 64.0F / (float) arg1.field74[var45];
                            float var83 = 64.0F / (float) arg1.field85[var45];
                            float var84 = (var65[2] * (float) var80 + var65[1] * (float) var79 + var65[0] * (float) var78) / var81;
                            float var85 = (var65[5] * (float) var80 + var65[4] * (float) var79 + var65[3] * (float) var78) / var82;
                            float var86 = (var65[8] * (float) var80 + var65[7] * (float) var79 + var65[6] * (float) var78) / var83;
                            var57 = class223.method1523((byte) -106, var84, var86, var85);
                            class485.method2773(arg1.field61[var59], arg1.field64[var59], var64, var66, arg1.field83[var59], var71, var62, (byte) 125, var67, class214.field3185, var65, var57, var63, var70);
                            var49 = class214.field3185[0];
                            var50 = class214.field3185[1];
                            class485.method2773(arg1.field61[var60], arg1.field64[var60], var64, var66, arg1.field83[var60], var71, var62, (byte) 122, var67, class214.field3185, var65, var57, var63, var70);
                            var52 = class214.field3185[1];
                            var51 = class214.field3185[0];
                            class485.method2773(arg1.field61[var61], arg1.field64[var61], var64, var66, arg1.field83[var61], var71, var62, (byte) 123, var67, class214.field3185, var65, var57, var63, var70);
                            var53 = class214.field3185[0];
                            var54 = class214.field3185[1];
                        } else if (var58 == 3) {
                            class580.method3336(var65, var67, var64, arg1.field64[var59], var62, var66, arg1.field83[var59], arg1.field61[var59], var63, class214.field3185, -24830);
                            var49 = class214.field3185[0];
                            var50 = class214.field3185[1];
                            class580.method3336(var65, var67, var64, arg1.field64[var60], var62, var66, arg1.field83[var60], arg1.field61[var60], var63, class214.field3185, -24830);
                            var51 = class214.field3185[0];
                            var52 = class214.field3185[1];
                            class580.method3336(var65, var67, var64, arg1.field64[var61], var62, var66, arg1.field83[var61], arg1.field61[var61], var63, class214.field3185, -24830);
                            var53 = class214.field3185[0];
                            var54 = class214.field3185[1];
                            if ((var66 & 0x1) == 0) {
                                if (var51 - var49 > 0.5F) {
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
                                    var56 = 2;
                                    var53++;
                                }
                            } else {
                                if (var52 - var50 > 0.5F) {
                                    var52--;
                                    var55 = 1;
                                } else if (var50 - var52 > 0.5F) {
                                    var52++;
                                    var55 = 2;
                                }
                                if ((var54 - var50 > 0.5F)) {
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
            if (arg1.field65 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field65[var43];
            }
            if (var122 == 0) {
                long var126 = ((long) (var57 << 24) + ((long) (var44 << 8)) + (long) var46 << 32) + (long) (var45 << 2);
                short var128 = arg1.field53[var43];
                short var129 = arg1.field92[var43];
                short var130 = arg1.field89[var43];
                class388 var131 = var13[var128];
                this.field4817[var27] = this.method2174(var49, var131.field5330, var131.field5331, var131.field5333, (byte) -122, var131.field5329, var128, arg1, var50, var126);
                class388 var132 = var13[var129];
                this.field4756[var27] = this.method2174(var51, var132.field5330, var132.field5331, var132.field5333, (byte) -122, var132.field5329, var129, arg1, var52, (long) var55 + var126);
                class388 var133 = var13[var130];
                this.field4810[var27] = this.method2174(var53, var133.field5330, var133.field5331, var133.field5333, (byte) -122, var133.field5329, var130, arg1, var54, (long) var56 + var126);
            } else if (var122 == 1) {
                class254 var123 = var25[var43];
                long var124 = ((long) (var57 << 24) + ((long) (var44 << 8)) + (long) var46 << 32) + (long) ((var123.field3575 <= 0 ? 2048 : 1024) + (var45 << 2) + (var123.field3580 + 256 << 12) + (var123.field3574 - -256 << 22));
                this.field4817[var27] = this.method2174(var49, 0, var123.field3575, var123.field3580, (byte) -122, var123.field3574, arg1.field53[var43], arg1, var50, var124);
                this.field4756[var27] = this.method2174(var51, 0, var123.field3575, var123.field3580, (byte) -122, var123.field3574, arg1.field92[var43], arg1, var52, (long) var55 + var124);
                this.field4810[var27] = this.method2174(var53, 0, var123.field3575, var123.field3580, (byte) -122, var123.field3574, arg1.field89[var43], arg1, var54, (long) var56 + var124);
            }
            if (arg1.field60 != null) {
                this.field4826[var27] = arg1.field60[var43];
            }
            if (arg1.field63 != null) {
                this.field4796[var27] = arg1.field63[var43];
            }
            this.field4802[var27] = arg1.field90[var43];
            this.field4767[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field4783; var30++) {
            short var42 = this.field4767[var30];
            if (var29 != var42) {
                var28++;
                var29 = var42;
            }
        }
        this.field4807 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field4783; var33++) {
            short var41 = this.field4767[var33];
            if (var32 != var41) {
                var32 = var41;
                this.field4807[var31++] = var33;
            }
        }
        this.field4807[var31] = this.field4783;
        class522.field7076 = null;
        this.field4819 = class133.method1110(this.field4809, -2624, this.field4819);
        this.field4729 = class133.method1110(this.field4809, -2624, this.field4729);
        this.field4823 = class133.method1110(this.field4809, -2624, this.field4823);
        this.field4741 = class732.method4067(this.field4741, -127, this.field4809);
        this.field4713 = class645.method3597(this.field4713, this.field4809, (byte) -126);
        this.field4765 = class645.method3597(this.field4765, this.field4809, (byte) -109);
        if (arg1.field100 != null && class754.method4182(this.field4820, arg2, -12026)) {
            this.field4789 = arg1.method32(false, 16502);
        }
        if (arg1.field95 != null && class448.method2603(this.field4820, 32, arg2)) {
            this.field4773 = arg1.method27((byte) 61);
        }
        if (arg1.field99 != null && class433.method2537((byte) -67, arg2, this.field4820)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field4786; var36++) {
                int var40 = arg1.field99[var8[var36]];
                if (var40 >= 0) {
                    if (var34 < var40) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field4725 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field4725[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field4786; var38++) {
                int var39 = arg1.field99[var8[var38]];
                if (var39 >= 0) {
                    this.field4725[var39][var35[var39]++] = var38;
                }
            }
        }
    }
}
