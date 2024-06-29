import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class319 extends class121 {

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "Z")
    private boolean field4784 = false;

    @OriginalMember(owner = "client!vq", name = "Y", descriptor = "I")
    private int field4817 = 0;

    @OriginalMember(owner = "client!vq", name = "lb", descriptor = "I")
    private int field4830 = 0;

    @OriginalMember(owner = "client!vq", name = "Mb", descriptor = "I")
    private int field4857 = 0;

    @OriginalMember(owner = "client!vq", name = "H", descriptor = "I")
    private int field4800 = 0;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
    private int field4790 = 0;

    @OriginalMember(owner = "client!vq", name = "qc", descriptor = "Z")
    private boolean field4887 = true;

    @OriginalMember(owner = "client!vq", name = "zc", descriptor = "Lvj;")
    private class303 field4896;

    @OriginalMember(owner = "client!vq", name = "Nb", descriptor = "Lkd;")
    private class184 field4858;

    @OriginalMember(owner = "client!vq", name = "kc", descriptor = "Lkd;")
    private class184 field4881;

    @OriginalMember(owner = "client!vq", name = "jc", descriptor = "Lkd;")
    private class184 field4880;

    @OriginalMember(owner = "client!vq", name = "W", descriptor = "Lkd;")
    private class184 field4815;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "Ltt;")
    private class60 field4785;

    @OriginalMember(owner = "client!vq", name = "N", descriptor = "I")
    private int field4806;

    @OriginalMember(owner = "client!vq", name = "hb", descriptor = "I")
    private int field4826;

    @OriginalMember(owner = "client!vq", name = "cc", descriptor = "[I")
    private int[] field4873;

    @OriginalMember(owner = "client!vq", name = "Bb", descriptor = "[I")
    private int[] field4846;

    @OriginalMember(owner = "client!vq", name = "mb", descriptor = "[I")
    private int[] field4831;

    @OriginalMember(owner = "client!vq", name = "Eb", descriptor = "[I")
    private int[] field4849;

    @OriginalMember(owner = "client!vq", name = "lc", descriptor = "[S")
    private short[] field4882;

    @OriginalMember(owner = "client!vq", name = "db", descriptor = "[Lnk;")
    private class501[] field4822;

    @OriginalMember(owner = "client!vq", name = "sc", descriptor = "[Lwv;")
    private class26[] field4889;

    @OriginalMember(owner = "client!vq", name = "gb", descriptor = "I")
    private int field4825;

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "[Lqh;")
    private class48[] field4805;

    @OriginalMember(owner = "client!vq", name = "Gb", descriptor = "[Lep;")
    private class287[] field4851;

    @OriginalMember(owner = "client!vq", name = "bb", descriptor = "[S")
    private short[] field4820;

    @OriginalMember(owner = "client!vq", name = "Tb", descriptor = "[F")
    private float[] field4864;

    @OriginalMember(owner = "client!vq", name = "Yb", descriptor = "[S")
    private short[] field4869;

    @OriginalMember(owner = "client!vq", name = "ac", descriptor = "[F")
    private float[] field4871;

    @OriginalMember(owner = "client!vq", name = "tb", descriptor = "[S")
    private short[] field4838;

    @OriginalMember(owner = "client!vq", name = "Zb", descriptor = "S")
    private short field4870;

    @OriginalMember(owner = "client!vq", name = "fc", descriptor = "S")
    private short field4876;

    @OriginalMember(owner = "client!vq", name = "Pb", descriptor = "[S")
    private short[] field4860;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "[S")
    private short[] field4796;

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "[S")
    private short[] field4798;

    @OriginalMember(owner = "client!vq", name = "Fb", descriptor = "[S")
    private short[] field4850;

    @OriginalMember(owner = "client!vq", name = "Ib", descriptor = "[B")
    private byte[] field4853;

    @OriginalMember(owner = "client!vq", name = "Ub", descriptor = "[B")
    private byte[] field4865;

    @OriginalMember(owner = "client!vq", name = "rb", descriptor = "[S")
    private short[] field4836;

    @OriginalMember(owner = "client!vq", name = "ec", descriptor = "[S")
    private short[] field4875;

    @OriginalMember(owner = "client!vq", name = "Db", descriptor = "[S")
    private short[] field4848;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "[I")
    private int[] field4794;

    @OriginalMember(owner = "client!vq", name = "jb", descriptor = "[[I")
    private int[][] field4828;

    @OriginalMember(owner = "client!vq", name = "G", descriptor = "[[I")
    private int[][] field4799;

    @OriginalMember(owner = "client!vq", name = "Vb", descriptor = "[[I")
    private int[][] field4866;

    @OriginalMember(owner = "client!vq", name = "Z", descriptor = "I")
    public static int field4818 = 0;

    @OriginalMember(owner = "client!vq", name = "kb", descriptor = "Lht;")
    private static class409 field4829 = new class409(8192);

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "B")
    private byte field4795;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!vq", name = "I", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!vq", name = "J", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!vq", name = "P", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!vq", name = "R", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!vq", name = "S", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!vq", name = "T", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!vq", name = "U", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!vq", name = "V", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!vq", name = "X", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!vq", name = "ab", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!vq", name = "cb", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!vq", name = "eb", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!vq", name = "fb", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!vq", name = "ib", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!vq", name = "nb", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!vq", name = "pb", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!vq", name = "qb", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!vq", name = "sb", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!vq", name = "vb", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!vq", name = "wb", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!vq", name = "xb", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!vq", name = "yb", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!vq", name = "zb", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!vq", name = "Cb", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!vq", name = "Hb", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!vq", name = "Jb", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!vq", name = "Ob", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!vq", name = "Qb", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!vq", name = "Sb", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!vq", name = "Xb", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!vq", name = "bc", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!vq", name = "dc", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!vq", name = "gc", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!vq", name = "hc", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!vq", name = "ic", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!vq", name = "mc", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!vq", name = "nc", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!vq", name = "oc", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!vq", name = "rc", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!vq", name = "uc", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!vq", name = "vc", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!vq", name = "wc", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!vq", name = "xc", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!vq", name = "yc", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!vq", name = "Q", descriptor = "Lbc;")
    private class245 field4809;

    @OriginalMember(owner = "client!vq", name = "O", descriptor = "Lbs;")
    public static class482 field4807;

    @OriginalMember(owner = "client!vq", name = "Kb", descriptor = "Lnh;")
    private class525 field4855;

    @OriginalMember(owner = "client!vq", name = "ob", descriptor = "Lu;")
    private class52 field4833;

    @OriginalMember(owner = "client!vq", name = "ub", descriptor = "S")
    private short field4839;

    @OriginalMember(owner = "client!vq", name = "Ab", descriptor = "S")
    private short field4845;

    @OriginalMember(owner = "client!vq", name = "Lb", descriptor = "S")
    private short field4856;

    @OriginalMember(owner = "client!vq", name = "Rb", descriptor = "S")
    private short field4862;

    @OriginalMember(owner = "client!vq", name = "Wb", descriptor = "S")
    private short field4867;

    @OriginalMember(owner = "client!vq", name = "pc", descriptor = "S")
    private short field4886;

    @OriginalMember(owner = "client!vq", name = "tc", descriptor = "S")
    private short field4890;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "(I)V", line = 7)
    public final void method895(int arg0) {
        field4861++;
        int var2 = class528.field7783[arg0];
        int var3 = class528.field7786[arg0];
        for (int var4 = 0; var4 < this.field4800; var4++) {
            int var5 = this.field4846[var4] * var3 + this.field4831[var4] * var2 >> 15;
            this.field4831[var4] = this.field4831[var4] * var3 - this.field4846[var4] * var2 >> 15;
            this.field4846[var4] = var5;
        }
        this.field4784 = false;
        if (this.field4858 != null) {
            this.field4858.field2759 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BZ)V", line = 39)
    private final void method2071(byte arg0, boolean arg1) {
        if (field4829.field2270.length < this.field4817 * 6) {
            field4829 = new class409((this.field4817 + 100) * 6);
        } else {
            field4829.field2289 = 0;
        }
        field4810++;
        if (this.field4896.field4599) {
            for (int var3 = 0; var3 < this.field4817; var3++) {
                field4829.method1094(1618659784, this.field4869[var3]);
                field4829.method1094(1618659784, this.field4848[var3]);
                field4829.method1094(1618659784, this.field4798[var3]);
            }
        } else {
            for (int var4 = 0; var4 < this.field4817; var4++) {
                field4829.method1066(-2012325976, this.field4869[var4]);
                field4829.method1066(-2012325976, this.field4848[var4]);
                field4829.method1066(-2012325976, this.field4798[var4]);
            }
        }
        if (field4829.field2289 == 0) {
            return;
        }
        if (arg0 < 88) {
            this.field4833 = null;
        }
        if (arg1) {
            if (this.field4833 == null) {
                this.field4833 = this.field4896.method1920(field4829.field2289, field4829.field2270, true, 255, 5123);
            } else {
                this.field4833.method466(5123, 19971, field4829.field2270, field4829.field2289);
            }
            this.field4785.field1058 = this.field4833;
        } else {
            this.field4785.field1058 = this.field4896.method1920(field4829.field2289, field4829.field2270, false, 255, 5123);
        }
        if (!arg1) {
            this.field4887 = true;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lc;IIIZ)V", line = 114)
    public final void method928(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4813++;
        class319 var6 = (class319) arg0;
        if (this.field4857 == 0 || var6.field4857 == 0) {
            return;
        }
        int var7 = var6.field4800;
        int[] var8 = var6.field4846;
        int[] var9 = var6.field4831;
        int[] var10 = var6.field4849;
        short[] var11 = var6.field4796;
        short[] var12 = var6.field4875;
        short[] var13 = var6.field4850;
        byte[] var14 = var6.field4853;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field4809 == null) {
            var16 = null;
            var17 = null;
            var18 = null;
            var15 = null;
        } else {
            var15 = this.field4809.field3519;
            var16 = this.field4809.field3522;
            var17 = this.field4809.field3524;
            var18 = this.field4809.field3521;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field4809 == null) {
            var21 = null;
            var22 = null;
            var20 = null;
            var19 = null;
        } else {
            var19 = var6.field4809.field3519;
            var20 = var6.field4809.field3522;
            var21 = var6.field4809.field3521;
            var22 = var6.field4809.field3524;
        }
        int[] var23 = var6.field4873;
        short[] var24 = var6.field4838;
        if (!var6.field4784) {
            var6.method2073(false);
        }
        short var25 = var6.field4845;
        short var26 = var6.field4886;
        short var27 = var6.field4856;
        short var28 = var6.field4862;
        short var29 = var6.field4867;
        short var30 = var6.field4839;
        for (int var31 = 0; var31 < this.field4800; var31++) {
            int var32 = this.field4831[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field4846[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field4849[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field4873[var31];
                        int var37 = this.field4873[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4838[var38] - 1;
                            if (var35 == -1 || this.field4853[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = -1;
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var40; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var17 == null) {
                                            this.field4809 = new class245();
                                            var17 = this.field4809.field3524 = class460.method2740(30818, this.field4796);
                                            var18 = this.field4809.field3521 = class460.method2740(30818, this.field4875);
                                            var16 = this.field4809.field3522 = class460.method2740(30818, this.field4850);
                                            var15 = this.field4809.field3519 = class9.method51(false, this.field4853);
                                        }
                                        if (var22 == null) {
                                            class245 var44 = var6.field4809 = new class245();
                                            var22 = var44.field3524 = class460.method2740(30818, var11);
                                            var21 = var44.field3521 = class460.method2740(30818, var12);
                                            var20 = var44.field3522 = class460.method2740(30818, var13);
                                            var19 = var44.field3519 = class9.method51(false, var14);
                                        }
                                        short var45 = this.field4796[var35];
                                        short var46 = this.field4875[var35];
                                        short var47 = this.field4850[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field4853[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var22[var52] += var45;
                                                var21[var52] += var46;
                                                var20[var52] += var47;
                                                var19[var52] += var50;
                                            }
                                        }
                                        short var53 = var12[var41];
                                        byte var54 = var14[var41];
                                        int var55 = this.field4873[var31];
                                        int var56 = this.field4873[var31 + 1];
                                        short var57 = var11[var41];
                                        short var58 = var13[var41];
                                        for (int var59 = var55; var59 < var56; var59++) {
                                            int var60 = this.field4838[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var57;
                                                var18[var60] += var53;
                                                var16[var60] += var58;
                                                var15[var60] += var54;
                                            }
                                        }
                                        if (this.field4880 == null && this.field4815 != null) {
                                            this.field4815.field2759 = null;
                                        }
                                        if (this.field4880 != null) {
                                            this.field4880.field2759 = null;
                                        }
                                        if (var6.field4880 == null && var6.field4815 != null) {
                                            var6.field4815.field2759 = null;
                                        }
                                        if (var6.field4880 != null) {
                                            var6.field4880.field2759 = null;
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

    @OriginalMember(owner = "client!vq", name = "YA", descriptor = "(SS)V", line = 383)
    public final void method933(short arg0, short arg1) {
        field4812++;
        class126 var3 = this.field4896.field2501;
        for (int var4 = 0; var4 < this.field4857; var4++) {
            if (this.field4820[var4] == arg0) {
                this.field4820[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class83 var7 = var3.method956(-945, arg0 & 0xFFFF);
            var6 = var7.field1446;
            var5 = var7.field1449;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class83 var10 = var3.method956(-945, arg1 & 0xFFFF);
            var8 = var10.field1449;
            var9 = var10.field1446;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field4851 != null) {
            for (int var11 = 0; var11 < this.field4825; var11++) {
                class287 var12 = this.field4851[var11];
                class48 var13 = this.field4805[var11];
                var13.field886 = var13.field886 & 0xFF000000 | class441.field6587[this.field4860[var12.field4092] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field4815 != null) {
            this.field4815.field2759 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "(I)V", line = 456)
    public final void method906(int arg0) {
        field4863++;
        this.field4826 = arg0;
        if (this.field4809 != null && (this.field4826 & 0x10000) == 0) {
            this.field4796 = this.field4809.field3524;
            this.field4853 = this.field4809.field3519;
            this.field4850 = this.field4809.field3522;
            this.field4875 = this.field4809.field3521;
            this.field4809 = null;
        }
        this.field4887 = true;
        this.method2080((byte) 83);
    }

    @OriginalMember(owner = "client!vq", name = "ZA", descriptor = "(I)V", line = 479)
    public final void method902(int arg0) {
        if (this.field4815 != null) {
            this.field4815.field2759 = null;
        }
        field4793++;
        this.field4876 = (short) arg0;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIII)V", line = 492)
    public final void method939(int arg0, int arg1, int arg2, int arg3) {
        field4803++;
        for (int var5 = 0; var5 < this.field4857; var5++) {
            int var9 = this.field4860[var5] & 0xFFFF;
            int var10 = (var9 & 0xFD37) >> 10;
            int var11 = (var9 & 0x382) >> 7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field4860[var5] = (short) class121.method909(var12, class121.method909(var11 << 7, var10 << 10));
        }
        if (this.field4851 != null) {
            for (int var6 = 0; var6 < this.field4825; var6++) {
                class287 var7 = this.field4851[var6];
                class48 var8 = this.field4805[var6];
                var8.field886 = class441.field6587[this.field4860[var7.field4092] & 0xFFFF] & 0xFFFFFF | var8.field886 & 0xFF000000;
            }
        }
        if (this.field4815 != null) {
            this.field4815.field2759 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "(IIII)V", line = 550)
    public final void method929(int arg0, int arg1, int arg2, int arg3) {
        field4797++;
        if (arg0 == 0) {
            int var5 = 0;
            class122.field1990 = 0;
            class295.field4200 = 0;
            class489.field7251 = 0;
            for (int var6 = 0; var6 < this.field4800; var6++) {
                class489.field7251 += this.field4846[var6];
                class122.field1990 += this.field4831[var6];
                class295.field4200 += this.field4849[var6];
                var5++;
            }
            if (var5 > 0) {
                class295.field4200 = class295.field4200 / var5 + arg3;
                class122.field1990 = class122.field1990 / var5 + arg2;
                class489.field7251 = class489.field7251 / var5 + arg1;
            } else {
                class122.field1990 = arg2;
                class295.field4200 = arg3;
                class489.field7251 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4800; var7++) {
                this.field4846[var7] += arg1;
                this.field4831[var7] += arg2;
                this.field4849[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4800; var8++) {
                this.field4846[var8] -= class489.field7251;
                this.field4831[var8] -= class122.field1990;
                this.field4849[var8] -= class295.field4200;
                if (arg3 != 0) {
                    int var9 = class528.field7783[arg3];
                    int var10 = class528.field7786[arg3];
                    int var11 = this.field4846[var8] * var10 + this.field4831[var8] * var9 + 32767 >> 15;
                    this.field4831[var8] = this.field4831[var8] * var10 + 32767 - (this.field4846[var8] * var9) >> 15;
                    this.field4846[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class528.field7783[arg1];
                    int var13 = class528.field7786[arg1];
                    int var14 = this.field4831[var8] * var13 + 32767 - (this.field4849[var8] * var12) >> 15;
                    this.field4849[var8] = this.field4831[var8] * var12 - (-(this.field4849[var8] * var13) - 32767) >> 15;
                    this.field4831[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class528.field7783[arg2];
                    int var16 = class528.field7786[arg2];
                    int var17 = this.field4849[var8] * var15 + this.field4846[var8] * var16 + 32767 >> 15;
                    this.field4849[var8] = this.field4849[var8] * var16 + 32767 - (this.field4846[var8] * var15) >> 15;
                    this.field4846[var8] = var17;
                }
                this.field4846[var8] += class489.field7251;
                this.field4831[var8] += class122.field1990;
                this.field4849[var8] += class295.field4200;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4800; var18++) {
                this.field4846[var18] -= class489.field7251;
                this.field4831[var18] -= class122.field1990;
                this.field4849[var18] -= class295.field4200;
                this.field4846[var18] = this.field4846[var18] * arg1 / 128;
                this.field4831[var18] = this.field4831[var18] * arg2 / 128;
                this.field4849[var18] = this.field4849[var18] * arg3 / 128;
                this.field4846[var18] += class489.field7251;
                this.field4831[var18] += class122.field1990;
                this.field4849[var18] += class295.field4200;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field4857; var19++) {
                int var23 = (this.field4865[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field4865[var19] = (byte) var23;
            }
            if (this.field4815 != null) {
                this.field4815.field2759 = null;
            }
            if (this.field4851 != null) {
                for (int var20 = 0; var20 < this.field4825; var20++) {
                    class287 var21 = this.field4851[var20];
                    class48 var22 = this.field4805[var20];
                    var22.field886 = var22.field886 & 0xFFFFFF | 255 - (this.field4865[var21.field4092] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field4857; var24++) {
                int var28 = this.field4860[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x385) >> 7;
                int var31 = var29 + arg1 & 0x3F;
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
                this.field4860[var24] = (short) class121.method909(var34, class121.method909(var33 << 7, var31 << 10));
            }
            if (this.field4815 != null) {
                this.field4815.field2759 = null;
            }
            if (this.field4851 != null) {
                for (int var25 = 0; var25 < this.field4825; var25++) {
                    class287 var26 = this.field4851[var25];
                    class48 var27 = this.field4805[var25];
                    var27.field886 = class441.field6587[this.field4860[var26.field4092] & 0xFFFF] & 0xFFFFFF | var27.field886 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field4825; var35++) {
                class48 var36 = this.field4805[var35];
                var36.field879 += arg2;
                var36.field881 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field4825; var37++) {
                class48 var38 = this.field4805[var37];
                var38.field885 = var38.field885 * arg2 >> 7;
                var38.field884 = var38.field884 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field4825; var39++) {
                class48 var40 = this.field4805[var39];
                var40.field883 = var40.field883 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "()I", line = 858)
    public final int method921() {
        field4854++;
        if (!this.field4784) {
            this.method2073(false);
        }
        return this.field4839;
    }

    @OriginalMember(owner = "client!vq", name = "fa", descriptor = "()I", line = 871)
    public final int method905() {
        field4832++;
        return this.field4876;
    }

    @OriginalMember(owner = "client!vq", name = "ra", descriptor = "()I", line = 886)
    public final int method891() {
        field4868++;
        if (!this.field4784) {
            this.method2073(false);
        }
        return this.field4890;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(FILnd;IIIIJIF)S", line = 900)
    private final short method2072(float arg0, int arg1, class380 arg2, int arg3, int arg4, int arg5, int arg6, long arg7, int arg8, float arg9) {
        field4792++;
        int var12 = this.field4873[arg1];
        int var13 = this.field4873[arg1 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field4838[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class497.field7347[var15] == arg7) {
                return (short) (var16 - 1);
            }
        }
        this.field4838[var14] = (short) (this.field4790 + 1);
        if (arg8 < 92) {
            return 63;
        }
        class497.field7347[var14] = arg7;
        this.field4796[this.field4790] = (short) arg4;
        this.field4875[this.field4790] = (short) arg5;
        this.field4850[this.field4790] = (short) arg3;
        this.field4853[this.field4790] = (byte) arg6;
        this.field4864[this.field4790] = arg9;
        this.field4871[this.field4790] = arg0;
        return (short) (this.field4790++);
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lvj;)V", line = 5700)
    public class319(class303 arg0) {
        this.field4896 = arg0;
        this.field4858 = new class184(null, 5126, 3, 0);
        this.field4881 = new class184(null, 5126, 2, 0);
        this.field4880 = new class184(null, 5126, 3, 0);
        this.field4815 = new class184(null, 5121, 4, 0);
        this.field4785 = new class60();
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lvj;Lnd;IIII)V", line = 5712)
    public class319(class303 arg0, class380 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4896 = arg0;
        this.field4806 = arg5;
        this.field4826 = arg2;
        if (class447.method2676(arg5, arg2, -1)) {
            this.field4858 = new class184(null, 5126, 3, 0);
        }
        if (class337.method2161(-86, arg2, arg5)) {
            this.field4881 = new class184(null, 5126, 2, 0);
        }
        if (class19.method153(arg2, arg5, -1)) {
            this.field4880 = new class184(null, 5126, 3, 0);
        }
        if (class474.method2837(-87, arg5, arg2)) {
            this.field4815 = new class184(null, 5121, 4, 0);
        }
        if (class196.method1364(arg5, false, arg2)) {
            this.field4785 = new class60();
        }
        class126 var7 = arg0.field2501;
        this.field4873 = new int[arg1.field5740 + 1];
        int[] var8 = new int[arg1.field5728];
        for (int var9 = 0; var9 < arg1.field5728; var9++) {
            if ((arg1.field5772 == null || arg1.field5772[var9] != 2) && (arg1.field5764 == null || arg1.field5764[var9] == -1 || !var7.method956(-945, arg1.field5764[var9] & 0xFFFF).field1431)) {
                var8[this.field4857++] = var9;
                this.field4873[arg1.field5744[var9]]++;
                this.field4873[arg1.field5774[var9]]++;
                this.field4873[arg1.field5746[var9]]++;
            }
        }
        this.field4817 = this.field4857;
        long[] var10 = new long[this.field4857];
        boolean var11 = (this.field4826 & 0x100) != 0;
        label496: for (int var12 = 0; var12 < this.field4857; var12++) {
            int var180 = var8[var12];
            class83 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field5745 != null) {
                for (int var186 = 0; var186 < arg1.field5745.length; var186++) {
                    class428 var187 = arg1.field5745[var186];
                    if (var187.field6354 == var180) {
                        class104 var188 = class59.method523(var187.field6360, 85);
                        if (var188.field1738) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field4817--;
                            continue label496;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field5764 != null) {
                var189 = arg1.field5764[var180];
                if (var189 != -1) {
                    var181 = var7.method956(-945, var189 & 0xFFFF);
                    var185 = var181.field1428;
                    var184 = var181.field1451;
                }
            }
            boolean var190 = arg1.field5765 != null && arg1.field5765[var180] != 0 || var181 != null && !var181.field1441;
            if ((var11 || var190) && arg1.field5755 != null) {
                var182 += arg1.field5755[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var189 & 0xFFFF << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
        }
        class4.method32((byte) -72, var8, var10);
        this.field4830 = arg1.field5773;
        this.field4846 = arg1.field5738;
        this.field4831 = arg1.field5724;
        this.field4800 = arg1.field5740;
        this.field4849 = arg1.field5760;
        this.field4882 = arg1.field5759;
        class185[] var13 = new class185[this.field4800];
        this.field4822 = arg1.field5775;
        this.field4889 = arg1.field5757;
        if (arg1.field5745 != null) {
            this.field4825 = arg1.field5745.length;
            this.field4805 = new class48[this.field4825];
            this.field4851 = new class287[this.field4825];
            for (int var14 = 0; var14 < this.field4825; var14++) {
                class428 var15 = arg1.field5745[var14];
                class104 var16 = class59.method523(var15.field6360, -127);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field4857; var18++) {
                    if (var8[var18] == var15.field6354) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class441.field6587[arg1.field5750[var15.field6354] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field5765 == null ? 0 : arg1.field5765[var15.field6354]) << 24;
                this.field4851[var14] = new class287(var17, arg1.field5744[var15.field6354], arg1.field5774[var15.field6354], arg1.field5746[var15.field6354], var16.field1735, var16.field1737, var16.field1726, var16.field1740, var16.field1729, var16.field1738, var16.field1733, var15.field6359);
                this.field4805[var14] = new class48(var20);
            }
        }
        int var21 = this.field4857 * 3;
        this.field4820 = new short[this.field4857];
        this.field4864 = new float[var21];
        this.field4869 = new short[this.field4857];
        this.field4871 = new float[var21];
        this.field4838 = new short[var21];
        class497.field7347 = new long[var21];
        this.field4870 = (short) arg4;
        this.field4876 = (short) arg3;
        this.field4860 = new short[this.field4857];
        this.field4796 = new short[var21];
        this.field4798 = new short[this.field4857];
        this.field4850 = new short[var21];
        this.field4853 = new byte[var21];
        this.field4865 = new byte[this.field4857];
        if (arg1.field5725 != null) {
            this.field4836 = new short[this.field4857];
        }
        this.field4875 = new short[var21];
        this.field4848 = new short[this.field4857];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field5740; var23++) {
            int var179 = this.field4873[var23];
            this.field4873[var23] = var22;
            var13[var23] = new class185();
            var22 += var179;
        }
        this.field4873[arg1.field5740] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field5771 != null) {
            int var28 = arg1.field5733;
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
            for (int var36 = 0; var36 < this.field4857; var36++) {
                int var43 = var8[var36];
                if (arg1.field5771[var43] != -1) {
                    int var44 = arg1.field5771[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field5744[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field5774[var43];
                        } else {
                            var46 = arg1.field5746[var43];
                        }
                        int var47 = arg1.field5738[var46];
                        int var48 = arg1.field5724[var46];
                        int var49 = arg1.field5760[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var27 = new float[var28][];
            var24 = new int[var28];
            var26 = new int[var28];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field5743[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field5727[var37];
                        if (var39 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 <= 0) {
                            var40 = 1.0F;
                            var41 = (float) (-var39) / 1024.0F;
                        } else {
                            var41 = 1.0F;
                            var40 = (float) var39 / 1024.0F;
                        }
                        var42 = 64.0F / (float) arg1.field5748[var37];
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field5731[var37];
                        var42 = 64.0F / (float) arg1.field5748[var37];
                        var41 = 64.0F / (float) arg1.field5727[var37];
                    } else {
                        var42 = (float) arg1.field5748[var37] / 1024.0F;
                        var40 = (float) arg1.field5731[var37] / 1024.0F;
                        var41 = (float) arg1.field5727[var37] / 1024.0F;
                    }
                    var27[var37] = class430.method2577(arg1.field5749[var37], arg1.field5747[var37], 26549, class207.method1405(arg1.field5732[var37], 255), var40, var41, var42, arg1.field5763[var37]);
                }
            }
        }
        class50[] var50 = new class50[arg1.field5728];
        for (int var51 = 0; var51 < arg1.field5728; var51++) {
            short var158 = arg1.field5744[var51];
            short var159 = arg1.field5774[var51];
            short var160 = arg1.field5746[var51];
            int var161 = this.field4846[var159] - this.field4846[var158];
            int var162 = this.field4831[var159] - this.field4831[var158];
            int var163 = this.field4849[var159] - this.field4849[var158];
            int var164 = this.field4846[var160] - this.field4846[var158];
            int var165 = this.field4831[var160] - this.field4831[var158];
            int var166 = this.field4849[var160] - this.field4849[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var167 >>= 0x1;
                var169 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var168 * var168 + var167 * var167 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field5772 == null ? 0 : arg1.field5772[var51];
            if (var174 == 0) {
                class185 var176 = var13[var158];
                var176.field2761++;
                var176.field2769 += var173;
                var176.field2768 += var171;
                var176.field2765 += var172;
                class185 var177 = var13[var159];
                var177.field2761++;
                var177.field2765 += var172;
                var177.field2768 += var171;
                var177.field2769 += var173;
                class185 var178 = var13[var160];
                var178.field2769 += var173;
                var178.field2768 += var171;
                var178.field2761++;
                var178.field2765 += var172;
            } else if (var174 == 1) {
                class50 var175 = var50[var51] = new class50();
                var175.field903 = var171;
                var175.field904 = var173;
                var175.field905 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field4857; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field5750[var68] & 0xFFFF;
            short var70;
            if (arg1.field5764 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field5764[var68];
            }
            int var71;
            if (arg1.field5771 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field5771[var68];
            }
            int var72;
            if (arg1.field5765 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field5765[var68] & 0xFF;
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
                    var74 = 1.0F;
                    var77 = 0.0F;
                    var80 = 2;
                    var75 = 1.0F;
                    var76 = 1.0F;
                    var73 = 0.0F;
                    var78 = 0.0F;
                    var79 = 1;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field5743[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field5744[var68];
                        short var84 = arg1.field5774[var68];
                        short var85 = arg1.field5746[var68];
                        short var86 = arg1.field5749[var71];
                        short var87 = arg1.field5763[var71];
                        short var88 = arg1.field5747[var71];
                        float var89 = (float) arg1.field5738[var86];
                        float var90 = (float) arg1.field5724[var86];
                        float var91 = (float) arg1.field5760[var86];
                        float var92 = (float) arg1.field5738[var87] - var89;
                        float var93 = (float) arg1.field5724[var87] - var90;
                        float var94 = (float) arg1.field5760[var87] - var91;
                        float var95 = (float) arg1.field5738[var88] - var89;
                        float var96 = (float) arg1.field5724[var88] - var90;
                        float var97 = (float) arg1.field5760[var88] - var91;
                        float var98 = (float) arg1.field5738[var83] - var89;
                        float var99 = (float) arg1.field5724[var83] - var90;
                        float var100 = (float) arg1.field5760[var83] - var91;
                        float var101 = (float) arg1.field5738[var84] - var89;
                        float var102 = (float) arg1.field5724[var84] - var90;
                        float var103 = (float) arg1.field5760[var84] - var91;
                        float var104 = (float) arg1.field5738[var85] - var89;
                        float var105 = (float) arg1.field5724[var85] - var90;
                        float var106 = (float) arg1.field5760[var85] - var91;
                        float var107 = var93 * var97 - var94 * var96;
                        float var108 = var94 * var95 - var92 * var97;
                        float var109 = var92 * var96 - (var93 * var95);
                        float var110 = var96 * var109 - (var97 * var108);
                        float var111 = var97 * var107 - (var95 * var109);
                        float var112 = var95 * var108 - var96 * var107;
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        float var114 = var94 * var107 - (var92 * var109);
                        float var115 = var92 * var108 - (var93 * var107);
                        float var116 = var93 * var109 - var94 * var108;
                        float var117 = 1.0F / (var97 * var115 + var95 * var116 + var96 * var114);
                        var78 = (var106 * var115 + var104 * var116 + var105 * var114) * var117;
                        var76 = (var103 * var115 + var101 * var116 + var102 * var114) * var117;
                        var74 = (var100 * var115 + var98 * var116 + var99 * var114) * var117;
                    } else {
                        short var118 = arg1.field5744[var68];
                        short var119 = arg1.field5774[var68];
                        short var120 = arg1.field5746[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field5768[var71];
                        float var126 = (float) arg1.field5730[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field5731[var71] / 1024.0F;
                            class40.method406(var126, var122, 0, var124, arg1.field5738[var118], var121, var123, var127, var125, arg1.field5760[var118], arg1.field5724[var118]);
                            var73 = class134.field2152;
                            var74 = class457.field6855;
                            class40.method406(var126, var122, 0, var124, arg1.field5738[var119], var121, var123, var127, var125, arg1.field5760[var119], arg1.field5724[var119]);
                            var75 = class134.field2152;
                            var76 = class457.field6855;
                            class40.method406(var126, var122, 0, var124, arg1.field5738[var120], var121, var123, var127, var125, arg1.field5760[var120], arg1.field5724[var120]);
                            var78 = class457.field6855;
                            var77 = class134.field2152;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var77 - var73 > var128) {
                                    var77 -= var127;
                                    var80 = 1;
                                } else if (var73 - var77 > var128) {
                                    var77 += var127;
                                    var80 = 2;
                                }
                                if ((var75 - var73 > var128)) {
                                    var79 = 1;
                                    var75 -= var127;
                                } else if (var128 < var73 - var75) {
                                    var75 += var127;
                                    var79 = 2;
                                }
                            } else {
                                if ((var76 - var74 > var128)) {
                                    var76 -= var127;
                                    var79 = 1;
                                } else if (var74 - var76 > var128) {
                                    var76 += var127;
                                    var79 = 2;
                                }
                                if ((var128 < var78 - var74)) {
                                    var80 = 1;
                                    var78 -= var127;
                                } else if (var74 - var78 > var128) {
                                    var78 += var127;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field5762[var71] / 256.0F;
                            float var130 = (float) arg1.field5723[var71] / 256.0F;
                            int var131 = arg1.field5738[var119] - arg1.field5738[var118];
                            int var132 = arg1.field5724[var119] - arg1.field5724[var118];
                            int var133 = arg1.field5760[var119] - arg1.field5760[var118];
                            int var134 = arg1.field5738[var120] - arg1.field5738[var118];
                            int var135 = arg1.field5724[var120] - arg1.field5724[var118];
                            int var136 = arg1.field5760[var120] - arg1.field5760[var118];
                            int var137 = var132 * var136 - (var133 * var135);
                            int var138 = var133 * var134 - (var131 * var136);
                            int var139 = var131 * var135 - (var132 * var134);
                            float var140 = 64.0F / (float) arg1.field5727[var71];
                            float var141 = 64.0F / (float) arg1.field5748[var71];
                            float var142 = 64.0F / (float) arg1.field5731[var71];
                            float var143 = (var124[2] * (float) var139 + var124[1] * (float) var138 + var124[0] * (float) var137) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[3] * (float) var137 + var124[4] * (float) var138) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[6] * (float) var137 + var124[7] * (float) var138) / var142;
                            var81 = class97.method737(114, var144, var143, var145);
                            class413.method2505(arg1.field5738[var118], var126, var121, var124, var125, arg1.field5724[var118], 101, var123, var129, var81, var122, arg1.field5760[var118], var130);
                            var73 = class530.field7800;
                            var74 = class137.field2184;
                            class413.method2505(arg1.field5738[var119], var126, var121, var124, var125, arg1.field5724[var119], 92, var123, var129, var81, var122, arg1.field5760[var119], var130);
                            var76 = class137.field2184;
                            var75 = class530.field7800;
                            class413.method2505(arg1.field5738[var120], var126, var121, var124, var125, arg1.field5724[var120], 40, var123, var129, var81, var122, arg1.field5760[var120], var130);
                            var78 = class137.field2184;
                            var77 = class530.field7800;
                        } else if (var82 == 3) {
                            class240.method1573(var125, arg1.field5724[var118], var121, 86, arg1.field5738[var118], var123, arg1.field5760[var118], var124, var122, var126);
                            var74 = class221.field3172;
                            var73 = class259.field3770;
                            class240.method1573(var125, arg1.field5724[var119], var121, 98, arg1.field5738[var119], var123, arg1.field5760[var119], var124, var122, var126);
                            var75 = class259.field3770;
                            var76 = class221.field3172;
                            class240.method1573(var125, arg1.field5724[var120], var121, 92, arg1.field5738[var120], var123, arg1.field5760[var120], var124, var122, var126);
                            var78 = class221.field3172;
                            var77 = class259.field3770;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                                if (var77 - var73 > 0.5F) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                            } else {
                                if (var76 - var74 > 0.5F) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if (var78 - var74 > 0.5F) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field5772 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field5772[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var81 << 24) + (long) var72 + ((long) (var69 << 8)) << 32) + (long) (var71 << 2);
                short var149 = arg1.field5744[var68];
                short var150 = arg1.field5774[var68];
                short var151 = arg1.field5746[var68];
                class185 var152 = var13[var149];
                this.field4869[var52] = this.method2072(var74, var149, arg1, var152.field2765, var152.field2768, var152.field2769, var152.field2761, var147, 113, var73);
                class185 var153 = var13[var150];
                this.field4848[var52] = this.method2072(var76, var150, arg1, var153.field2765, var153.field2768, var153.field2769, var153.field2761, (long) var79 + var147, 99, var75);
                class185 var154 = var13[var151];
                this.field4798[var52] = this.method2072(var78, var151, arg1, var154.field2765, var154.field2768, var154.field2769, var154.field2761, (long) var80 + var147, 122, var77);
            } else if (var146 == 1) {
                class50 var155 = var50[var68];
                long var156 = ((long) (var81 << 24) - (-((long) (var69 << 8)) - ((long) var72)) << 32) + (long) ((var155.field904 + 256 << 12) + (var155.field903 > 0 ? 1024 : 2048) + (var71 << 2) + (var155.field905 - -256 << 22));
                this.field4869[var52] = this.method2072(var74, arg1.field5744[var68], arg1, var155.field905, var155.field903, var155.field904, 0, var156, 96, var73);
                this.field4848[var52] = this.method2072(var76, arg1.field5774[var68], arg1, var155.field905, var155.field903, var155.field904, 0, (long) var79 + var156, 101, var75);
                this.field4798[var52] = this.method2072(var78, arg1.field5746[var68], arg1, var155.field905, var155.field903, var155.field904, 0, (long) var80 + var156, 112, var77);
            }
            if (arg1.field5764 == null) {
                this.field4820[var52] = -1;
            } else {
                this.field4820[var52] = arg1.field5764[var68];
            }
            if (arg1.field5765 != null) {
                this.field4865[var52] = arg1.field5765[var68];
            }
            if (arg1.field5725 != null) {
                this.field4836[var52] = arg1.field5725[var68];
            }
            this.field4860[var52] = arg1.field5750[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field4817; var55++) {
            short var67 = this.field4820[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field4794 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field4817; var58++) {
            short var66 = this.field4820[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field4794[var56++] = var58;
            }
        }
        this.field4794[var56] = this.field4817;
        class497.field7347 = null;
        this.field4796 = class391.method2412(this.field4790, this.field4796, (byte) 99);
        this.field4875 = class391.method2412(this.field4790, this.field4875, (byte) 99);
        this.field4850 = class391.method2412(this.field4790, this.field4850, (byte) 99);
        this.field4853 = class168.method1231(this.field4853, this.field4790, true);
        this.field4864 = class69.method564((byte) 91, this.field4790, this.field4864);
        this.field4871 = class69.method564((byte) 72, this.field4790, this.field4871);
        if (arg1.field5734 != null && class251.method1620(this.field4806, arg2, 1794)) {
            this.field4828 = arg1.method2361(127);
        }
        if (arg1.field5745 != null && class64.method541(52, this.field4806, arg2)) {
            this.field4799 = arg1.method2362(0);
        }
        if (arg1.field5756 != null && class11.method81(arg2, this.field4806, (byte) -98)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field4857; var61++) {
                int var65 = arg1.field5756[var8[var61]];
                if (var65 >= 0) {
                    if (var59 < var65) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field4866 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field4866[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field4857; var63++) {
                int var64 = arg1.field5756[var8[var63]];
                if (var64 >= 0) {
                    this.field4866[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "Q", descriptor = "()I", line = 956)
    public final int method920() {
        field4811++;
        return this.field4870;
    }

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "()I", line = 964)
    public final int method935() {
        if (!this.field4784) {
            this.method2073(false);
        }
        field4879++;
        return this.field4886;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V", line = 975)
    private final void method2073(boolean arg0) {
        field4888++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4800; var10++) {
            int var11 = this.field4846[var10];
            int var12 = this.field4831[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field4849[var10];
            if (var12 > var6) {
                var6 = var12;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var13 * var13 + (var11 * var11 + (var12 * var12));
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field4856 = (short) var2;
        this.field4862 = (short) var5;
        this.field4845 = (short) var3;
        this.field4867 = (short) var4;
        this.field4886 = (short) var6;
        this.field4839 = (short) var7;
        this.field4890 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        if (arg0) {
            this.field4838 = null;
        }
        this.field4784 = true;
    }

    @OriginalMember(owner = "client!vq", name = "N", descriptor = "(SS)V", line = 1058)
    public final void method890(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4857; var3++) {
            if (this.field4860[var3] == arg0) {
                this.field4860[var3] = arg1;
            }
        }
        field4791++;
        if (this.field4851 != null) {
            for (int var4 = 0; var4 < this.field4825; var4++) {
                class287 var5 = this.field4851[var4];
                class48 var6 = this.field4805[var4];
                var6.field886 = class441.field6587[this.field4860[var5.field4092] & 0xFFFF] & 0xFFFFFF | var6.field886 & 0xFF000000;
            }
        }
        if (this.field4815 != null) {
            this.field4815.field2759 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIIII)Z", line = 1100)
    private final boolean method2074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4834++;
        if (arg6 != -1025671473) {
            return true;
        } else if (arg7 < arg5 && arg7 < arg2 && arg7 < arg1) {
            return false;
        } else if (arg7 > arg5 && arg2 < arg7 && arg7 > arg1) {
            return false;
        } else if (arg4 > arg0 && arg8 > arg0 && arg3 > arg0) {
            return false;
        } else {
            return arg0 <= arg4 || arg0 <= arg8 || arg0 <= arg3;
        }
    }

    @OriginalMember(owner = "client!vq", name = "xa", descriptor = "(I[IIIIIZ)V", line = 1131)
    public final void method917(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4788++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            class489.field7251 = 0;
            class295.field4200 = 0;
            class122.field1990 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field4828.length > var14) {
                    int[] var15 = this.field4828[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class489.field7251 += this.field4846[var17];
                        class122.field1990 += this.field4831[var17];
                        class295.field4200 += this.field4849[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class122.field1990 = class122.field1990 / var12 + var11;
                class295.field4200 = class295.field4200 / var12 + var9;
                class489.field7251 = class489.field7251 / var12 + var10;
            } else {
                class295.field4200 = var9;
                class122.field1990 = var11;
                class489.field7251 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field4828.length > var22) {
                    int[] var23 = this.field4828[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field4846[var25] += var18;
                        this.field4831[var25] += var19;
                        this.field4849[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field4828.length) {
                    int[] var46 = this.field4828[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field4846[var59] -= class489.field7251;
                            this.field4831[var59] -= class122.field1990;
                            this.field4849[var59] -= class295.field4200;
                            if (arg4 != 0) {
                                int var60 = class528.field7783[arg4];
                                int var61 = class528.field7786[arg4];
                                int var62 = this.field4831[var59] * var60 + (this.field4846[var59] * var61 + 32767) >> 15;
                                this.field4831[var59] = this.field4831[var59] * var61 + 32767 - (this.field4846[var59] * var60) >> 15;
                                this.field4846[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class528.field7783[arg2];
                                int var64 = class528.field7786[arg2];
                                int var65 = this.field4831[var59] * var64 + 32767 - (this.field4849[var59] * var63) >> 15;
                                this.field4849[var59] = this.field4831[var59] * var63 - (-(this.field4849[var59] * var64) - 32767) >> 15;
                                this.field4831[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class528.field7783[arg3];
                                int var67 = class528.field7786[arg3];
                                int var68 = this.field4849[var59] * var66 + this.field4846[var59] * var67 + 32767 >> 15;
                                this.field4849[var59] = this.field4849[var59] * var67 + 32767 - this.field4846[var59] * var66 >> 15;
                                this.field4846[var59] = var68;
                            }
                            this.field4846[var59] += class489.field7251;
                            this.field4831[var59] += class122.field1990;
                            this.field4849[var59] += class295.field4200;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field4846[var48] -= class489.field7251;
                            this.field4831[var48] -= class122.field1990;
                            this.field4849[var48] -= class295.field4200;
                            if (arg2 != 0) {
                                int var49 = class528.field7783[arg2];
                                int var50 = class528.field7786[arg2];
                                int var51 = this.field4831[var48] * var50 + 32767 - (this.field4849[var48] * var49) >> 15;
                                this.field4849[var48] = this.field4849[var48] * var50 + this.field4831[var48] * var49 + 32767 >> 15;
                                this.field4831[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class528.field7783[arg4];
                                int var53 = class528.field7786[arg4];
                                int var54 = this.field4831[var48] * var52 + (this.field4846[var48] * var53) + 32767 >> 15;
                                this.field4831[var48] = this.field4831[var48] * var53 + 32767 - (this.field4846[var48] * var52) >> 15;
                                this.field4846[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class528.field7783[arg3];
                                int var56 = class528.field7786[arg3];
                                int var57 = this.field4849[var48] * var55 + this.field4846[var48] * var56 + 32767 >> 15;
                                this.field4849[var48] = this.field4849[var48] * var56 + 32767 - this.field4846[var48] * var55 >> 15;
                                this.field4846[var48] = var57;
                            }
                            this.field4846[var48] += class489.field7251;
                            this.field4831[var48] += class122.field1990;
                            this.field4849[var48] += class295.field4200;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field4828.length) {
                        int[] var29 = this.field4828[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field4873[var31];
                            int var33 = this.field4873[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field4838[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class528.field7783[arg4];
                                    int var37 = class528.field7786[arg4];
                                    int var38 = this.field4875[var35] * var36 + this.field4796[var35] * var37 + 32767 >> 15;
                                    this.field4875[var35] = (short) (this.field4875[var35] * var37 + 32767 - (this.field4796[var35] * var36) >> 15);
                                    this.field4796[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class528.field7783[arg2];
                                    int var40 = class528.field7786[arg2];
                                    int var41 = this.field4875[var35] * var40 + 32767 - (this.field4850[var35] * var39) >> 15;
                                    this.field4850[var35] = (short) (this.field4875[var35] * var39 + this.field4850[var35] * var40 + 32767 >> 15);
                                    this.field4875[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class528.field7783[arg3];
                                    int var43 = class528.field7786[arg3];
                                    int var44 = this.field4850[var35] * var42 + this.field4796[var35] * var43 + 32767 >> 15;
                                    this.field4850[var35] = (short) (this.field4850[var35] * var43 + 32767 - (this.field4796[var35] * var42) >> 15);
                                    this.field4796[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field4880 == null && this.field4815 != null) {
                    this.field4815.field2759 = null;
                }
                if (this.field4880 != null) {
                    this.field4880.field2759 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field4828.length) {
                    int[] var71 = this.field4828[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field4846[var73] -= class489.field7251;
                        this.field4831[var73] -= class122.field1990;
                        this.field4849[var73] -= class295.field4200;
                        this.field4846[var73] = this.field4846[var73] * arg2 >> 7;
                        this.field4831[var73] = this.field4831[var73] * arg3 >> 7;
                        this.field4849[var73] = this.field4849[var73] * arg4 >> 7;
                        this.field4846[var73] += class489.field7251;
                        this.field4831[var73] += class122.field1990;
                        this.field4849[var73] += class295.field4200;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4866 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field4866.length > var78) {
                        int[] var79 = this.field4866[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field4865[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field4865[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field4815 != null) {
                            this.field4815.field2759 = null;
                        }
                    }
                }
                if (this.field4851 != null) {
                    for (int var75 = 0; var75 < this.field4825; var75++) {
                        class287 var76 = this.field4851[var75];
                        class48 var77 = this.field4805[var75];
                        var77.field886 = 255 - (this.field4865[var76.field4092] & 0xFF) << 24 | var77.field886 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4866 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field4866.length) {
                        int[] var88 = this.field4866[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field4860[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3C8) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var92 + arg2 & 0x3F;
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
                            this.field4860[var90] = (short) class121.method909(var97, class121.method909(var96 << 10, var95 << 7));
                        }
                        if (var88.length > 0 && this.field4815 != null) {
                            this.field4815.field2759 = null;
                        }
                    }
                }
                if (this.field4851 != null) {
                    for (int var84 = 0; var84 < this.field4825; var84++) {
                        class287 var85 = this.field4851[var84];
                        class48 var86 = this.field4805[var84];
                        var86.field886 = var86.field886 & 0xFF000000 | class441.field6587[this.field4860[var85.field4092] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4799 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field4799.length) {
                        int[] var100 = this.field4799[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class48 var102 = this.field4805[var100[var101]];
                            var102.field881 += arg2;
                            var102.field879 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4799 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field4799.length) {
                        int[] var105 = this.field4799[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class48 var107 = this.field4805[var105[var106]];
                            var107.field884 = var107.field884 * arg2 >> 7;
                            var107.field885 = var107.field885 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4799 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field4799.length) {
                    int[] var110 = this.field4799[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class48 var112 = this.field4805[var110[var111]];
                        var112.field883 = var112.field883 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZI)Lmq;", line = 1784)
    public static final class350 method2075(boolean arg0, int arg1) {
        field4883++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (!arg0) {
            method2078((byte) -36, true);
        }
        if (class22.field438[var2] == null || class22.field438[var2][var3] == null) {
            boolean var4 = class355.method2252(var2, -40);
            if (!var4) {
                return null;
            }
        }
        return class22.field438[var2][var3];
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "()V", line = 1813)
    public final void method898() {
        field4877++;
        if (this.field4790 <= 0 || this.field4817 <= 0) {
            return;
        }
        this.method2079(false, -8);
        if ((this.field4795 & 0x10) == 0 && this.field4785.field1058 == null) {
            this.method2071((byte) 111, false);
        }
        this.method2080((byte) 83);
    }

    @OriginalMember(owner = "client!vq", name = "W", descriptor = "()V", line = 1839)
    public final void method934() {
        for (int var1 = 0; var1 < this.field4830; var1++) {
            this.field4846[var1] = this.field4846[var1] + 7 >> 4;
            this.field4831[var1] = this.field4831[var1] + 7 >> 4;
            this.field4849[var1] = this.field4849[var1] + 7 >> 4;
        }
        field4823++;
        this.field4784 = false;
        if (this.field4858 != null) {
            this.field4858.field2759 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "X", descriptor = "()I", line = 1862)
    public final int method931() {
        if (!this.field4784) {
            this.method2073(false);
        }
        field4801++;
        return this.field4867;
    }

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "(I)V", line = 1874)
    public final void method912(int arg0) {
        field4884++;
        int var2 = class528.field7783[arg0];
        int var3 = class528.field7786[arg0];
        for (int var4 = 0; var4 < this.field4800; var4++) {
            int var5 = this.field4849[var4] * var2 + (this.field4846[var4] * var3) >> 15;
            this.field4849[var4] = this.field4849[var4] * var3 - (this.field4846[var4] * var2) >> 15;
            this.field4846[var4] = var5;
        }
        this.field4784 = false;
        if (this.field4858 != null) {
            this.field4858.field2759 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "()Z", line = 1904)
    public final boolean method915() {
        field4842++;
        if (this.field4820 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field4820.length; var1++) {
            if (this.field4820[var1] != -1 && !this.field4896.field2501.method959(this.field4820[var1], (byte) 94)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vq", name = "oa", descriptor = "(I)V", line = 1930)
    public final void method908(int arg0) {
        if (this.field4815 != null) {
            this.field4815.field2759 = null;
        }
        field4802++;
        this.field4870 = (short) arg0;
        if (this.field4880 != null) {
            this.field4880.field2759 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "sa", descriptor = "()V", line = 1947)
    public final void method897() {
        field4814++;
        for (int var1 = 0; var1 < this.field4800; var1++) {
            this.field4849[var1] = -this.field4849[var1];
        }
        for (int var2 = 0; var2 < this.field4790; var2++) {
            this.field4850[var2] = (short) (-this.field4850[var2]);
        }
        for (int var3 = 0; var3 < this.field4857; var3++) {
            short var4 = this.field4869[var3];
            this.field4869[var3] = this.field4798[var3];
            this.field4798[var3] = var4;
        }
        if (this.field4880 == null && this.field4815 != null) {
            this.field4815.field2759 = null;
        }
        if (this.field4880 != null) {
            this.field4880.field2759 = null;
        }
        if (this.field4858 != null) {
            this.field4858.field2759 = null;
        }
        this.field4784 = false;
        if (this.field4785 != null) {
            this.field4785.field1058 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V", line = 2012)
    private final void method2076(int arg0) {
        field4821++;
        if (this.field4817 == 0) {
            return;
        }
        int var2 = 20 % ((-arg0 - 32) / 63);
        if (this.field4795 != 0) {
            this.method2079(true, -8);
        }
        this.method2079(false, -8);
        if (this.field4785 != null) {
            if (this.field4785.field1058 == null) {
                this.method2071((byte) 125, (this.field4795 & 0x10) != 0);
            }
            if (this.field4785.field1058 != null) {
                this.field4896.method1941(this.field4880 != null, 21282);
                this.field4896.method1982(this.field4815, this.field4881, this.field4858, this.field4880, 101);
                int var3 = this.field4794.length - 1;
                for (int var4 = 0; var4 < var3; var4++) {
                    int var5 = this.field4794[var4];
                    int var6 = this.field4794[var4 + 1];
                    int var7 = this.field4820[var5] & 0xFFFF;
                    if (var7 == 65535) {
                        var7 = -1;
                    }
                    this.field4896.method1939(this.field4880 != null, var7, 0);
                    this.field4896.method1988((var6 - var5) * 3, this.field4785.field1058, var5 * 3, false, 4);
                }
            }
        }
        this.method2080((byte) 83);
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "()I", line = 2068)
    public final int method930() {
        field4872++;
        if (!this.field4784) {
            this.method2073(false);
        }
        return this.field4845;
    }

    @OriginalMember(owner = "client!vq", name = "FA", descriptor = "()Z", line = 2081)
    public final boolean method896() {
        field4844++;
        if (this.field4828 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field4830; var1++) {
            this.field4846[var1] <<= 0x4;
            this.field4831[var1] <<= 0x4;
            this.field4849[var1] <<= 0x4;
        }
        class122.field1990 = 0;
        class489.field7251 = 0;
        class295.field4200 = 0;
        return true;
    }

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "()[Lnk;", line = 2109)
    public final class501[] method903() {
        field4804++;
        return this.field4822;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLvq;ILvq;ZB)Lc;", line = 2130)
    private final class121 method2077(boolean arg0, class319 arg1, int arg2, class319 arg3, boolean arg4, byte arg5) {
        arg1.field4857 = this.field4857;
        arg1.field4800 = this.field4800;
        arg1.field4830 = this.field4830;
        arg1.field4806 = this.field4806;
        arg1.field4795 = 0;
        arg1.field4876 = this.field4876;
        arg1.field4826 = arg2;
        arg1.field4790 = this.field4790;
        arg1.field4817 = this.field4817;
        arg1.field4870 = this.field4870;
        arg1.field4825 = this.field4825;
        field4841++;
        boolean var7 = class315.method2052((byte) -43, arg2, this.field4806);
        boolean var8 = class53.method472(-1, arg2, this.field4806);
        boolean var9 = class21.method176(-89, arg2, this.field4806);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg1.field4846 = this.field4846;
            } else if (arg3.field4846 == null || this.field4830 > arg3.field4846.length) {
                arg1.field4846 = arg3.field4846 = new int[this.field4830];
            } else {
                arg1.field4846 = arg3.field4846;
            }
            if (!var8) {
                arg1.field4831 = this.field4831;
            } else if (arg3.field4831 == null || this.field4830 > arg3.field4831.length) {
                arg1.field4831 = arg3.field4831 = new int[this.field4830];
            } else {
                arg1.field4831 = arg3.field4831;
            }
            if (!var9) {
                arg1.field4849 = this.field4849;
            } else if (arg3.field4849 == null || this.field4830 > arg3.field4849.length) {
                arg1.field4849 = arg3.field4849 = new int[this.field4830];
            } else {
                arg1.field4849 = arg3.field4849;
            }
            for (int var11 = 0; var11 < this.field4830; var11++) {
                if (var7) {
                    arg1.field4846[var11] = this.field4846[var11];
                }
                if (var8) {
                    arg1.field4831[var11] = this.field4831[var11];
                }
                if (var9) {
                    arg1.field4849[var11] = this.field4849[var11];
                }
            }
        } else {
            arg1.field4831 = this.field4831;
            arg1.field4849 = this.field4849;
            arg1.field4846 = this.field4846;
        }
        if (class33.method350((byte) 68, this.field4806, arg2)) {
            arg1.field4858 = arg3.field4858;
            if (arg4) {
                arg1.field4795 = (byte) (arg1.field4795 | 0x1);
            }
            arg1.field4858.field2757 = this.field4858.field2757;
            arg1.field4858.field2759 = this.field4858.field2759;
        } else if (class447.method2676(this.field4806, arg2, -1)) {
            arg1.field4858 = this.field4858;
        } else {
            arg1.field4858 = null;
        }
        if (class445.method2659(this.field4806, arg2, -15177)) {
            if (arg3.field4860 == null || this.field4857 > arg3.field4860.length) {
                arg1.field4860 = arg3.field4860 = new short[this.field4857];
            } else {
                arg1.field4860 = arg3.field4860;
            }
            for (int var12 = 0; var12 < this.field4857; var12++) {
                arg1.field4860[var12] = this.field4860[var12];
            }
        } else {
            arg1.field4860 = this.field4860;
        }
        if (class20.method170(this.field4806, arg2, -3910)) {
            if (arg3.field4865 == null || this.field4857 > arg3.field4865.length) {
                arg1.field4865 = arg3.field4865 = new byte[this.field4857];
            } else {
                arg1.field4865 = arg3.field4865;
            }
            for (int var13 = 0; var13 < this.field4857; var13++) {
                arg1.field4865[var13] = this.field4865[var13];
            }
        } else {
            arg1.field4865 = this.field4865;
        }
        if (class281.method1797(arg2, this.field4806, -4542)) {
            arg1.field4815 = arg3.field4815;
            if (arg4) {
                arg1.field4795 = (byte) (arg1.field4795 | 0x2);
            }
            arg1.field4815.field2759 = this.field4815.field2759;
            arg1.field4815.field2757 = this.field4815.field2757;
        } else if (class474.method2837(-101, this.field4806, arg2)) {
            arg1.field4815 = this.field4815;
        } else {
            arg1.field4815 = null;
        }
        if (class105.method795((byte) -127, arg2, this.field4806)) {
            if (arg3.field4796 == null || this.field4790 > arg3.field4796.length) {
                int var14 = this.field4790;
                arg1.field4875 = arg3.field4875 = new short[var14];
                arg1.field4796 = arg3.field4796 = new short[var14];
                arg1.field4850 = arg3.field4850 = new short[var14];
            } else {
                arg1.field4875 = arg3.field4875;
                arg1.field4796 = arg3.field4796;
                arg1.field4850 = arg3.field4850;
            }
            if (this.field4809 == null) {
                for (int var15 = 0; var15 < this.field4790; var15++) {
                    arg1.field4796[var15] = this.field4796[var15];
                    arg1.field4875[var15] = this.field4875[var15];
                    arg1.field4850[var15] = this.field4850[var15];
                }
            } else {
                if (arg3.field4809 == null) {
                    arg3.field4809 = new class245();
                }
                class245 var16 = arg1.field4809 = arg3.field4809;
                if (var16.field3524 == null || var16.field3524.length < this.field4790) {
                    int var17 = this.field4790;
                    var16.field3524 = new short[var17];
                    var16.field3519 = new byte[var17];
                    var16.field3522 = new short[var17];
                    var16.field3521 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field4790; var18++) {
                    arg1.field4796[var18] = this.field4796[var18];
                    arg1.field4875[var18] = this.field4875[var18];
                    arg1.field4850[var18] = this.field4850[var18];
                    var16.field3524[var18] = this.field4809.field3524[var18];
                    var16.field3521[var18] = this.field4809.field3521[var18];
                    var16.field3522[var18] = this.field4809.field3522[var18];
                    var16.field3519[var18] = this.field4809.field3519[var18];
                }
            }
            arg1.field4853 = this.field4853;
        } else {
            arg1.field4809 = this.field4809;
            arg1.field4850 = this.field4850;
            arg1.field4796 = this.field4796;
            arg1.field4875 = this.field4875;
            arg1.field4853 = this.field4853;
        }
        if (class420.method2539(this.field4806, (byte) -119, arg2)) {
            if (arg4) {
                arg1.field4795 = (byte) (arg1.field4795 | 0x4);
            }
            arg1.field4880 = arg3.field4880;
            arg1.field4880.field2757 = this.field4880.field2757;
            arg1.field4880.field2759 = this.field4880.field2759;
        } else if (class19.method153(arg2, this.field4806, -1)) {
            arg1.field4880 = this.field4880;
        } else {
            arg1.field4880 = null;
        }
        if (method2082(arg2, this.field4806, true)) {
            if (arg3.field4864 == null || arg3.field4864.length < this.field4857) {
                int var19 = this.field4790;
                arg1.field4871 = arg3.field4871 = new float[var19];
                arg1.field4864 = arg3.field4864 = new float[var19];
            } else {
                arg1.field4864 = arg3.field4864;
                arg1.field4871 = arg3.field4871;
            }
            for (int var20 = 0; var20 < this.field4790; var20++) {
                arg1.field4864[var20] = this.field4864[var20];
                arg1.field4871[var20] = this.field4871[var20];
            }
        } else {
            arg1.field4864 = this.field4864;
            arg1.field4871 = this.field4871;
        }
        if (class457.method2723(this.field4806, -8, arg2)) {
            if (arg4) {
                arg1.field4795 = (byte) (arg1.field4795 | 0x8);
            }
            arg1.field4881 = arg3.field4881;
            arg1.field4881.field2759 = this.field4881.field2759;
            arg1.field4881.field2757 = this.field4881.field2757;
        } else if (class337.method2161(-59, arg2, this.field4806)) {
            arg1.field4881 = this.field4881;
        } else {
            arg1.field4881 = null;
        }
        if (class208.method1408(4, arg2, this.field4806)) {
            if (arg3.field4869 == null || this.field4857 > arg3.field4869.length) {
                int var21 = this.field4857;
                arg1.field4798 = arg3.field4798 = new short[var21];
                arg1.field4869 = arg3.field4869 = new short[var21];
                arg1.field4848 = arg3.field4848 = new short[var21];
            } else {
                arg1.field4869 = arg3.field4869;
                arg1.field4798 = arg3.field4798;
                arg1.field4848 = arg3.field4848;
            }
            for (int var22 = 0; var22 < this.field4857; var22++) {
                arg1.field4869[var22] = this.field4869[var22];
                arg1.field4848[var22] = this.field4848[var22];
                arg1.field4798[var22] = this.field4798[var22];
            }
        } else {
            arg1.field4869 = this.field4869;
            arg1.field4848 = this.field4848;
            arg1.field4798 = this.field4798;
        }
        if (arg5 > -97) {
            this.method2076(101);
        }
        if (class480.method2861(arg2, this.field4806, 11221)) {
            if (arg4) {
                arg1.field4795 = (byte) (arg1.field4795 | 0x10);
            }
            arg1.field4785 = arg3.field4785;
            arg1.field4785.field1058 = this.field4785.field1058;
        } else if (class196.method1364(this.field4806, false, arg2)) {
            arg1.field4785 = this.field4785;
        } else {
            arg1.field4785 = null;
        }
        if (class402.method2462((byte) -126, this.field4806, arg2)) {
            if (arg3.field4820 == null || this.field4857 > arg3.field4820.length) {
                int var23 = this.field4857;
                arg1.field4820 = arg3.field4820 = new short[var23];
            } else {
                arg1.field4820 = arg3.field4820;
            }
            for (int var24 = 0; var24 < this.field4857; var24++) {
                arg1.field4820[var24] = this.field4820[var24];
            }
        } else {
            arg1.field4820 = this.field4820;
        }
        if (!class260.method1684(9881, arg2, this.field4806)) {
            arg1.field4805 = this.field4805;
        } else if (arg3.field4805 == null || arg3.field4805.length < this.field4825) {
            int var26 = this.field4825;
            arg1.field4805 = arg3.field4805 = new class48[var26];
            for (int var27 = 0; var27 < this.field4825; var27++) {
                arg1.field4805[var27] = this.field4805[var27].method453(0);
            }
        } else {
            arg1.field4805 = arg3.field4805;
            for (int var25 = 0; var25 < this.field4825; var25++) {
                arg1.field4805[var25].method456(this.field4805[var25], true);
            }
        }
        arg1.field4851 = this.field4851;
        arg1.field4799 = this.field4799;
        arg1.field4822 = this.field4822;
        if (this.field4784) {
            arg1.field4856 = this.field4856;
            arg1.field4890 = this.field4890;
            arg1.field4784 = true;
            arg1.field4886 = this.field4886;
            arg1.field4862 = this.field4862;
            arg1.field4845 = this.field4845;
            arg1.field4867 = this.field4867;
            arg1.field4839 = this.field4839;
        } else {
            arg1.field4784 = false;
        }
        arg1.field4882 = this.field4882;
        arg1.field4866 = this.field4866;
        arg1.field4836 = this.field4836;
        arg1.field4873 = this.field4873;
        arg1.field4889 = this.field4889;
        arg1.field4838 = this.field4838;
        arg1.field4828 = this.field4828;
        arg1.field4794 = this.field4794;
        return arg1;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(BZ)V", line = 2596)
    public static final void method2078(byte arg0, boolean arg1) {
        field4894++;
        if (arg1) {
            if (class364.field5513 != -1) {
                class503.method3010((byte) -123, class364.field5513);
            }
            for (class352 var2 = (class352) class162.field2507.method160((byte) -20); var2 != null; var2 = (class352) class162.field2507.method163(124)) {
                if (!var2.method2091((byte) -120)) {
                    var2 = (class352) class162.field2507.method160((byte) -20);
                    if (var2 == null) {
                        break;
                    }
                }
                class123.method946(true, false, var2, (byte) 95);
            }
            class364.field5513 = -1;
            class162.field2507 = new class20(8);
            class122.method943(false);
            class364.field5513 = class99.field1635;
            class11.method76(0, false);
            class511.method3061(22843);
            class437.method2612(class364.field5513);
        }
        class260.method1686(true);
        class245.field3518 = -1;
        int var3 = -66 / ((arg0 + 17) / 55);
        class333.method2139(class97.field1621, (byte) -44);
        class139.field2224 = new class256();
        class139.field2224.field7692[0] = class33.field662 / 2;
        class139.field2224.field6233 = class121.field1966 * 128 / 2;
        class139.field2224.field6228 = class33.field662 * 128 / 2;
        class405.field6075 = 0;
        class40.field732 = 0;
        class139.field2224.field7694[0] = class121.field1966 / 2;
        if (class85.field1473 == 2) {
            class40.field732 = class236.field3422 << 7;
            class405.field6075 = class403.field6053 << 7;
        } else {
            class106.method797(false);
        }
        class418.method2527((byte) -102);
        if (class40.field732 == 0 || class405.field6075 == 0) {
            class244.method1590(10, (byte) 117);
        } else {
            class516.method3076(false);
            class244.method1590(28, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!vq", name = "VA", descriptor = "()I", line = 2662)
    public final int method911() {
        field4852++;
        if (!this.field4784) {
            this.method2073(false);
        }
        return this.field4862;
    }

    @OriginalMember(owner = "client!vq", name = "ea", descriptor = "(IILna;Lna;III)V", line = 2674)
    public final void method900(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6) {
        if (!this.field4784) {
            this.method2073(false);
        }
        field4859++;
        int var8 = this.field4856 + arg4;
        int var9 = this.field4862 + arg4;
        int var10 = this.field4867 + arg6;
        int var11 = this.field4839 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field673 <= arg2.field676 + var9 >> arg2.field679 || var10 < 0 || arg2.field678 <= (arg2.field676 + var11 >> arg2.field679)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field676 + var9 >> arg3.field679 >= arg3.field673 || var10 < 0 || arg3.field678 <= (arg3.field676 + var11 >> arg3.field679)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field679;
            int var13 = arg2.field676 + var9 - 1 >> arg2.field679;
            int var14 = var10 >> arg2.field679;
            int var15 = var11 + arg2.field676 - 1 >> arg2.field679;
            if (arg5 == arg2.method376(var12, var14) && arg2.method376(var13, var14) == arg5 && arg5 == arg2.method376(var12, var15) && arg5 == arg2.method376(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field4800; var16++) {
                this.field4831[var16] = this.field4831[var16] + arg2.method371(this.field4846[var16] + arg4, this.field4849[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field4845;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field4800; var31++) {
                int var32 = (this.field4831[var31] << 16) / var30;
                if (arg1 > var32) {
                    this.field4831[var31] += (arg2.method371(this.field4846[var31] + arg4, this.field4849[var31] + arg6) - arg5) * (arg1 - var32) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var17 = (arg1 & 0xFF) * 4;
            int var18 = (arg1 >> 8 & 0xFF) * 4;
            int var19 = (arg1 >> 16 & 0xFF) << 6;
            int var20 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var17 >> 1) < 0 || (var17 >> 1) + arg4 + arg2.field676 >= arg2.field673 << arg2.field679 || (arg6 - (var18 >> 1)) < 0 || arg2.field678 << arg2.field679 <= (var18 >> 1) + arg6 + arg2.field676) {
                return;
            }
            this.method894(arg6, var17, var18, (byte) -15, arg5, arg2, var20, arg4, var19);
        } else if (arg0 == 4) {
            int var28 = this.field4886 - this.field4845;
            for (int var29 = 0; var29 < this.field4800; var29++) {
                this.field4831[var29] += arg3.method371(this.field4846[var29] + arg4, this.field4849[var29] + arg6) + var28 - arg5;
            }
        } else if (arg0 == 5) {
            int var21 = this.field4886 - this.field4845;
            for (int var22 = 0; var22 < this.field4800; var22++) {
                int var23 = this.field4846[var22] + arg4;
                int var24 = this.field4849[var22] + arg6;
                int var25 = arg2.method371(var23, var24);
                int var26 = arg3.method371(var23, var24);
                int var27 = var25 - var26;
                this.field4831[var22] = ((this.field4831[var22] << 8) / var21 * var27 >> 8) + var25 - arg5;
            }
        }
        this.field4784 = false;
        if (this.field4858 != null) {
            this.field4858.field2759 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILia;Z)Z", line = 2831)
    public final boolean method924(int arg0, int arg1, class414 arg2, boolean arg3) {
        field4786++;
        class246 var5 = (class246) arg2;
        class246 var6 = this.field4896.field4604;
        float var7 = var5.field3529 * var6.field3530 + var5.field3557 * var6.field3551 + var5.field3554 * var6.field3555 + var6.field3554;
        float var8 = var5.field3529 * var6.field3544 + var5.field3557 * var6.field3536 + var5.field3554 * var6.field3533 + var6.field3557;
        class137.field2183 = var5.field3561 * var6.field3543 + var5.field3551 * var6.field3559 + var5.field3536 * var6.field3561;
        class219.field3157 = var5.field3543 * var6.field3544 + var5.field3544 * var6.field3536 + var5.field3530 * var6.field3533;
        class98.field1630 = var5.field3543 * var6.field3543 + var5.field3544 * var6.field3561 + var5.field3530 * var6.field3559;
        class23.field478 = var5.field3561 * var6.field3530 + var5.field3551 * var6.field3555 + var5.field3536 * var6.field3551;
        class66.field1128 = var5.field3559 * var6.field3544 + var5.field3555 * var6.field3533 + var5.field3533 * var6.field3536;
        float var9 = var5.field3529 * var6.field3543 + var5.field3557 * var6.field3561 + var5.field3554 * var6.field3559 + var6.field3529;
        class424.field6323 = var5.field3543 * var6.field3530 + var5.field3544 * var6.field3551 + var5.field3530 * var6.field3555;
        class206.field2978 = var5.field3559 * var6.field3543 + var5.field3555 * var6.field3559 + var5.field3533 * var6.field3561;
        class142.field2251 = var5.field3559 * var6.field3530 + var5.field3555 * var6.field3555 + var5.field3533 * var6.field3551;
        class496.field7320 = var5.field3561 * var6.field3544 + var5.field3551 * var6.field3533 + var5.field3536 * var6.field3536;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field4896.field4578;
        int var16 = this.field4896.field4611;
        if (!this.field4784) {
            this.method2073(false);
        }
        class267.field3842[0] = this.field4856;
        class409.field6137[0] = this.field4845;
        class267.field3842[1] = this.field4862;
        class129.field2057[0] = this.field4867;
        class409.field6137[1] = this.field4845;
        class267.field3842[2] = this.field4856;
        class129.field2057[1] = this.field4867;
        class409.field6137[2] = this.field4886;
        class129.field2057[2] = this.field4867;
        class267.field3842[3] = this.field4862;
        class409.field6137[3] = this.field4886;
        class129.field2057[3] = this.field4867;
        class267.field3842[4] = this.field4856;
        class409.field6137[4] = this.field4845;
        class129.field2057[4] = this.field4839;
        class267.field3842[5] = this.field4862;
        class409.field6137[5] = this.field4845;
        class129.field2057[5] = this.field4839;
        class267.field3842[6] = this.field4856;
        class409.field6137[6] = this.field4886;
        class267.field3842[7] = this.field4862;
        class129.field2057[6] = this.field4839;
        class409.field6137[7] = this.field4886;
        class129.field2057[7] = this.field4839;
        for (int var17 = 0; var17 < 8; var17++) {
            float var36 = (float) class267.field3842[var17];
            float var37 = (float) class129.field2057[var17];
            float var38 = (float) class409.field6137[var17];
            float var39 = class219.field3157 * var37 + class66.field1128 * var36 + class496.field7320 * var38 + var8;
            float var40 = class98.field1630 * var37 + class206.field2978 * var36 + class137.field2183 * var38 + var9;
            float var41 = class424.field6323 * var37 + class23.field478 * var38 + class142.field2251 * var36 + var7;
            if ((float) this.field4896.field4600 <= var40) {
                float var42 = (float) var15 * var41 / var40 + (float) this.field4896.field4605;
                if (var42 > var12) {
                    var12 = var42;
                }
                if (var11 > var42) {
                    var11 = var42;
                }
                float var43 = (float) var16 * var39 / var40 + (float) this.field4896.field4517;
                if (var13 > var43) {
                    var13 = var43;
                }
                var10 = true;
                if (var43 > var14) {
                    var14 = var43;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && var12 > (float) arg0 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (class109.field1808.length < this.field4790) {
                class531.field7805 = new int[this.field4790];
                class109.field1808 = new int[this.field4790];
            }
            for (int var18 = 0; var18 < this.field4800; var18++) {
                float var20 = (float) this.field4849[var18];
                float var21 = (float) this.field4831[var18];
                float var22 = (float) this.field4846[var18];
                float var23 = class219.field3157 * var20 + class66.field1128 * var22 + class496.field7320 * var21 + var8;
                float var24 = class424.field6323 * var20 + class23.field478 * var21 + class142.field2251 * var22 + var7;
                float var25 = class98.field1630 * var20 + class206.field2978 * var22 + class137.field2183 * var21 + var9;
                if ((var25 >= (float) this.field4896.field4600)) {
                    int var30 = (int) ((float) var15 * var24 / var25 + (float) this.field4896.field4605);
                    int var31 = (int) ((float) var16 * var23 / var25 + (float) this.field4896.field4517);
                    int var32 = this.field4873[var18];
                    int var33 = this.field4873[var18 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field4838[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        class109.field1808[var35] = var30;
                        class531.field7805[var35] = var31;
                    }
                } else {
                    int var26 = this.field4873[var18];
                    int var27 = this.field4873[var18 + 1];
                    for (int var28 = var26; var28 < var27; var28++) {
                        int var29 = this.field4838[var28] - 1;
                        if (var29 == -1) {
                            break;
                        }
                        class109.field1808[this.field4838[var28] - 1] = -999999;
                    }
                }
            }
            for (int var19 = 0; var19 < this.field4857; var19++) {
                if (class109.field1808[this.field4869[var19]] != -999999 && class109.field1808[this.field4848[var19]] != -999999 && class109.field1808[this.field4798[var19]] != -999999 && this.method2074(arg0, class531.field7805[this.field4798[var19]], class531.field7805[this.field4848[var19]], class109.field1808[this.field4798[var19]], class109.field1808[this.field4869[var19]], class531.field7805[this.field4869[var19]], -1025671473, arg1, class109.field1808[this.field4848[var19]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(ZI)V", line = 3039)
    private final void method2079(boolean arg0, int arg1) {
        field4895++;
        boolean var3 = this.field4815 != null && this.field4815.field2759 == null;
        boolean var4 = this.field4880 != null && this.field4880.field2759 == null;
        boolean var5 = this.field4858 != null && this.field4858.field2759 == null;
        boolean var6 = this.field4881 != null && this.field4881.field2759 == null;
        if (arg0) {
            var6 &= (this.field4795 & 0x8) != 0;
            var4 &= (this.field4795 & 0x4) != 0;
            var3 &= (this.field4795 & 0x2) != 0;
            var5 &= (this.field4795 & 0x1) != 0;
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
        if (field4829.field2270.length < (this.field4790 * var7)) {
            field4829 = new class409((this.field4790 + 100) * var7);
        } else {
            field4829.field2289 = 0;
        }
        if (var5) {
            if (this.field4896.field4599) {
                for (int var12 = 0; var12 < this.field4800; var12++) {
                    int var13 = NativeStream.floatToRawIntBits((float) this.field4846[var12]);
                    int var14 = NativeStream.floatToRawIntBits((float) this.field4831[var12]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field4849[var12]);
                    int var16 = this.field4873[var12];
                    int var17 = this.field4873[var12 + 1];
                    for (int var18 = var16; var18 < var17; var18++) {
                        int var19 = this.field4838[var18] - 1;
                        if (var19 == -1) {
                            break;
                        }
                        field4829.field2289 = var7 * var19;
                        field4829.method1117(var13, (byte) 12);
                        field4829.method1117(var14, (byte) 12);
                        field4829.method1117(var15, (byte) 12);
                    }
                }
            } else {
                for (int var20 = 0; var20 < this.field4800; var20++) {
                    int var21 = NativeStream.floatToRawIntBits((float) this.field4846[var20]);
                    int var22 = NativeStream.floatToRawIntBits((float) this.field4831[var20]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field4849[var20]);
                    int var24 = this.field4873[var20];
                    int var25 = this.field4873[var20 + 1];
                    for (int var26 = var24; var26 < var25; var26++) {
                        int var27 = this.field4838[var26] - 1;
                        if (var27 == -1) {
                            break;
                        }
                        field4829.field2289 = var7 * var27;
                        field4829.method1096(var21, (byte) 78);
                        field4829.method1096(var22, (byte) 96);
                        field4829.method1096(var23, (byte) 113);
                    }
                }
            }
        }
        if (var3) {
            if (this.field4880 == null) {
                short[] var28;
                short[] var29;
                byte[] var30;
                short[] var31;
                if (this.field4809 == null) {
                    var29 = this.field4796;
                    var28 = this.field4875;
                    var30 = this.field4853;
                    var31 = this.field4850;
                } else {
                    var28 = this.field4809.field3521;
                    var29 = this.field4809.field3524;
                    var30 = this.field4809.field3519;
                    var31 = this.field4809.field3522;
                }
                float var32 = this.field4896.field4527[0];
                float var33 = this.field4896.field4527[1];
                float var34 = this.field4896.field4527[2];
                float var35 = this.field4896.field4545;
                float var36 = this.field4896.field4547 * 768.0F / (float) this.field4870;
                float var37 = this.field4896.field4633 * 768.0F / (float) this.field4870;
                for (int var38 = 0; var38 < this.field4857; var38++) {
                    int var39 = this.method2084(this.field4865[var38], this.field4860[var38], this.field4876, this.field4820[var38], arg1 - 60);
                    float var40 = (float) ((var39 & 0xFFEC51) >> 16) * this.field4896.field4575;
                    float var41 = (float) ((var39 & 0xFF28) >> 8) * this.field4896.field4536;
                    short var42 = this.field4869[var38];
                    float var43 = (float) (var39 >>> 24) * this.field4896.field4573;
                    short var44 = (short) var30[var42];
                    float var45;
                    if (var44 == 0) {
                        var45 = ((float) var31[var42] * var34 + (float) var28[var42] * var33 + (float) var29[var42] * var32) * 0.0026041667F;
                    } else {
                        var45 = ((float) var31[var42] * var34 + (float) var28[var42] * var33 + (float) var29[var42] * var32) / (float) (var44 * 256);
                    }
                    float var46 = ((var45 < 0.0F) ? var37 : var36) * var45 + var35;
                    int var47 = (int) (var43 * var46);
                    if (var47 < 0) {
                        var47 = 0;
                    } else if (var47 > 255) {
                        var47 = 255;
                    }
                    int var48 = (int) (var40 * var46);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var41 * var46);
                    field4829.field2289 = var9 + (var7 * var42);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    field4829.method1109(false, var47);
                    field4829.method1109(false, var48);
                    field4829.method1109(false, var49);
                    field4829.method1109(false, 255 - (this.field4865[var38] & 0xFF));
                    short var50 = this.field4848[var38];
                    short var51 = (short) var30[var50];
                    float var52;
                    if (var51 == 0) {
                        var52 = ((float) var31[var50] * var34 + (float) var28[var50] * var33 + (float) var29[var50] * var32) * 0.0026041667F;
                    } else {
                        var52 = ((float) var31[var50] * var34 + (float) var28[var50] * var33 + (float) var29[var50] * var32) / (float) (var51 * 256);
                    }
                    float var53 = (var52 < 0.0F ? var37 : var36) * var52 + var35;
                    int var54 = (int) (var43 * var53);
                    if (var54 < 0) {
                        var54 = 0;
                    } else if (var54 > 255) {
                        var54 = 255;
                    }
                    int var55 = (int) (var40 * var53);
                    int var56 = (int) (var41 * var53);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    field4829.field2289 = var7 * var50 + var9;
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    field4829.method1109(false, var54);
                    field4829.method1109(false, var55);
                    field4829.method1109(false, var56);
                    field4829.method1109(false, 255 - (this.field4865[var38] & 0xFF));
                    short var57 = this.field4798[var38];
                    short var58 = (short) var30[var57];
                    float var59;
                    if (var58 == 0) {
                        var59 = ((float) var31[var57] * var34 + (float) var28[var57] * var33 + (float) var29[var57] * var32) * 0.0026041667F;
                    } else {
                        var59 = ((float) var31[var57] * var34 + (float) var28[var57] * var33 + (float) var29[var57] * var32) / (float) (var58 * 256);
                    }
                    float var60 = var35 + var59 * ((var59 < 0.0F) ? var37 : var36);
                    int var61 = (int) (var43 * var60);
                    if (var61 < 0) {
                        var61 = 0;
                    } else if (var61 > 255) {
                        var61 = 255;
                    }
                    int var62 = (int) (var40 * var60);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var41 * var60);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    field4829.field2289 = var9 + (var7 * var57);
                    field4829.method1109(false, var61);
                    field4829.method1109(false, var62);
                    field4829.method1109(false, var63);
                    field4829.method1109(false, 255 - (this.field4865[var38] & 0xFF));
                }
            } else {
                for (int var64 = 0; var64 < this.field4857; var64++) {
                    int var65 = this.method2084(this.field4865[var64], this.field4860[var64], this.field4876, this.field4820[var64], -79);
                    field4829.field2289 = this.field4869[var64] * var7 + var9;
                    field4829.method1117(var65, (byte) 12);
                    field4829.field2289 = this.field4848[var64] * var7 + var9;
                    field4829.method1117(var65, (byte) 12);
                    field4829.field2289 = var9 + (this.field4798[var64] * var7);
                    field4829.method1117(var65, (byte) 12);
                }
            }
        }
        if (var4) {
            byte[] var66;
            short[] var67;
            short[] var68;
            short[] var69;
            if (this.field4809 == null) {
                var68 = this.field4796;
                var66 = this.field4853;
                var67 = this.field4850;
                var69 = this.field4875;
            } else {
                var66 = this.field4809.field3519;
                var67 = this.field4809.field3522;
                var68 = this.field4809.field3524;
                var69 = this.field4809.field3521;
            }
            float var70 = 3.0F / (float) this.field4870;
            field4829.field2289 = var10;
            float var71 = 3.0F / (float) (this.field4870 / 2 + this.field4870);
            if (this.field4896.field4599) {
                for (int var75 = 0; var75 < this.field4790; var75++) {
                    int var76 = var66[var75] & 0xFF;
                    if (var76 == 0) {
                        field4829.method2489((float) var68[var75] * var71, arg1 ^ 0xFFFFA174);
                        field4829.method2489((float) var69[var75] * var71, 24204);
                        field4829.method2489((float) var67[var75] * var71, arg1 + 24212);
                    } else {
                        float var77 = var70 / (float) var76;
                        field4829.method2489((float) var68[var75] * var77, arg1 + 24212);
                        field4829.method2489((float) var69[var75] * var77, 24204);
                        field4829.method2489((float) var67[var75] * var77, arg1 ^ 0xFFFFA174);
                    }
                    field4829.field2289 += var7 - 12;
                }
            } else {
                for (int var72 = 0; var72 < this.field4790; var72++) {
                    int var73 = var66[var72] & 0xFF;
                    if (var73 == 0) {
                        field4829.method2487(986946216, (float) var68[var72] * var71);
                        field4829.method2487(986946216, (float) var69[var72] * var71);
                        field4829.method2487(986946216, (float) var67[var72] * var71);
                    } else {
                        float var74 = var70 / (float) var73;
                        field4829.method2487(986946216, (float) var68[var72] * var74);
                        field4829.method2487(986946216, (float) var69[var72] * var74);
                        field4829.method2487(986946216, (float) var67[var72] * var74);
                    }
                    field4829.field2289 += var7 - 12;
                }
            }
        }
        if (var6) {
            field4829.field2289 = var11;
            if (this.field4896.field4599) {
                for (int var79 = 0; var79 < this.field4790; var79++) {
                    field4829.method2489(this.field4864[var79], 24204);
                    field4829.method2489(this.field4871[var79], 24204);
                    field4829.field2289 += var7 - 8;
                }
            } else {
                for (int var78 = 0; var78 < this.field4790; var78++) {
                    field4829.method2487(arg1 + 986946224, this.field4864[var78]);
                    field4829.method2487(986946216, this.field4871[var78]);
                    field4829.field2289 += var7 - 8;
                }
            }
        }
        field4829.field2289 = this.field4790 * var7;
        class525 var80;
        if (arg0) {
            if (this.field4855 == null) {
                this.field4855 = this.field4896.method1946(true, field4829.field2289, field4829.field2270, var7, arg1 ^ 0xFFFFEE2C);
            } else {
                this.field4855.method603(field4829.field2270, field4829.field2289, 19049, var7);
            }
            var80 = this.field4855;
            this.field4795 = 0;
        } else {
            var80 = this.field4896.method1946(false, field4829.field2289, field4829.field2270, var7, 4564);
            this.field4887 = true;
        }
        if (var5) {
            this.field4858.field2759 = var80;
            this.field4858.field2757 = var8;
        }
        if (var6) {
            this.field4881.field2757 = var11;
            this.field4881.field2759 = var80;
        }
        if (arg1 != -8) {
            this.field4805 = null;
        }
        if (var3) {
            this.field4815.field2759 = var80;
            this.field4815.field2757 = var9;
        }
        if (var4) {
            this.field4880.field2757 = var10;
            this.field4880.field2759 = var80;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V", line = 3558)
    private final void method2080(byte arg0) {
        field4843++;
        if (!this.field4887) {
            return;
        }
        this.field4887 = false;
        if (this.field4889 == null && this.field4822 == null && this.field4851 == null) {
            if (this.field4846 != null && !class420.method2538(this.field4806, true, this.field4826)) {
                if (this.field4858 != null && this.field4858.field2759 == null) {
                    this.field4887 = true;
                } else {
                    if (!this.field4784) {
                        this.method2073(false);
                    }
                    this.field4846 = null;
                }
            }
            if (this.field4831 != null && !class22.method183(this.field4806, (byte) -126, this.field4826)) {
                if (this.field4858 != null && this.field4858.field2759 == null) {
                    this.field4887 = true;
                } else {
                    if (!this.field4784) {
                        this.method2073(false);
                    }
                    this.field4831 = null;
                }
            }
            if (this.field4849 != null && !class66.method554(this.field4806, this.field4826, -114)) {
                if (this.field4858 != null && this.field4858.field2759 == null) {
                    this.field4887 = true;
                } else {
                    if (!this.field4784) {
                        this.method2073(false);
                    }
                    this.field4849 = null;
                }
            }
        }
        if (this.field4838 != null && this.field4846 == null && this.field4831 == null && this.field4849 == null) {
            this.field4838 = null;
            this.field4873 = null;
        }
        if (this.field4853 != null && !class341.method2178(this.field4806, this.field4826, 47)) {
            if (this.field4880 == null) {
                if (this.field4815 != null && this.field4815.field2759 == null) {
                    this.field4887 = true;
                } else {
                    this.field4796 = this.field4875 = this.field4850 = null;
                    this.field4853 = null;
                }
            } else if (this.field4880.field2759 == null) {
                this.field4887 = true;
            } else {
                this.field4853 = null;
                this.field4796 = this.field4875 = this.field4850 = null;
            }
        }
        if (arg0 != 83) {
            return;
        }
        if (this.field4860 != null && !class295.method1877(this.field4806, 38, this.field4826)) {
            if (this.field4815 != null && this.field4815.field2759 == null) {
                this.field4887 = true;
            } else {
                this.field4860 = null;
            }
        }
        if (this.field4865 != null && !class328.method2106(126, this.field4806, this.field4826)) {
            if (this.field4815 != null && this.field4815.field2759 == null) {
                this.field4887 = true;
            } else {
                this.field4865 = null;
            }
        }
        if (this.field4864 != null && !class148.method1139(this.field4806, this.field4826, 21162)) {
            if (this.field4881 != null && this.field4881.field2759 == null) {
                this.field4887 = true;
            } else {
                this.field4864 = this.field4871 = null;
            }
        }
        if (this.field4820 != null && !class187.method1303((byte) 48, this.field4826, this.field4806)) {
            if (this.field4815 != null && this.field4815.field2759 == null) {
                this.field4887 = true;
            } else {
                this.field4820 = null;
            }
        }
        if (this.field4869 != null && !class460.method2738(this.field4826, this.field4806, 1890)) {
            if ((this.field4785 == null || this.field4785.field1058 != null) && (this.field4815 == null || this.field4815.field2759 != null)) {
                this.field4869 = this.field4848 = this.field4798 = null;
            } else {
                this.field4887 = true;
            }
        }
        if (this.field4866 != null && !class11.method81(this.field4826, this.field4806, (byte) -98)) {
            this.field4836 = null;
            this.field4866 = null;
        }
        if (this.field4828 != null && !class251.method1620(this.field4806, this.field4826, arg0 + 1711)) {
            this.field4828 = null;
            this.field4882 = null;
        }
        if (this.field4799 != null && !class64.method541(119, this.field4806, this.field4826)) {
            this.field4799 = null;
        }
        if (this.field4794 != null && (this.field4826 & 0x800) == 0 && (this.field4826 & 0x40000) == 0) {
            this.field4794 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "ua", descriptor = "(Lj;)Lj;", line = 3735)
    public final class377 method936(class377 arg0) {
        field4835++;
        if (this.field4790 == 0) {
            return null;
        }
        if (!this.field4784) {
            this.method2073(false);
        }
        int var2;
        int var3;
        if (this.field4896.field4567 > 0) {
            var2 = this.field4856 - (this.field4896.field4567 * this.field4886 >> 8) >> this.field4896.field4492;
            var3 = this.field4862 - (this.field4896.field4567 * this.field4845 >> 8) >> this.field4896.field4492;
        } else {
            var2 = this.field4856 - (this.field4896.field4567 * this.field4845 >> 8) >> this.field4896.field4492;
            var3 = this.field4862 - (this.field4896.field4567 * this.field4886 >> 8) >> this.field4896.field4492;
        }
        int var4;
        int var5;
        if (this.field4896.field4591 <= 0) {
            var4 = this.field4867 - (this.field4896.field4591 * this.field4845 >> 8) >> this.field4896.field4492;
            var5 = this.field4839 - (this.field4896.field4591 * this.field4886 >> 8) >> this.field4896.field4492;
        } else {
            var4 = this.field4867 - (this.field4896.field4591 * this.field4886 >> 8) >> this.field4896.field4492;
            var5 = this.field4839 - (this.field4896.field4591 * this.field4845 >> 8) >> this.field4896.field4492;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class76 var8 = (class76) arg0;
        class76 var9;
        if (var8 != null && var8.method606(var6, 0, var7)) {
            var9 = var8;
            var8.method608((byte) 81);
        } else {
            var9 = new class76(this.field4896, var6, var7);
        }
        var9.method605(var2, 0, var4, var3, var5);
        this.method2085((byte) -98, var9);
        return var9;
    }

    @OriginalMember(owner = "client!vq", name = "ia", descriptor = "(I)V", line = 3798)
    public final void method913(int arg0) {
        field4816++;
        int var2 = class528.field7783[arg0];
        int var3 = class528.field7786[arg0];
        for (int var4 = 0; var4 < this.field4800; var4++) {
            int var7 = this.field4849[var4] * var2 + this.field4846[var4] * var3 >> 15;
            this.field4849[var4] = this.field4849[var4] * var3 - (this.field4846[var4] * var2) >> 15;
            this.field4846[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field4790; var5++) {
            int var6 = this.field4850[var5] * var2 + this.field4796[var5] * var3 >> 15;
            this.field4850[var5] = (short) (this.field4850[var5] * var3 - (this.field4796[var5] * var2) >> 15);
            this.field4796[var5] = (short) var6;
        }
        if (this.field4880 == null && this.field4815 != null) {
            this.field4815.field2759 = null;
        }
        if (this.field4880 != null) {
            this.field4880.field2759 = null;
        }
        if (this.field4858 != null) {
            this.field4858.field2759 = null;
        }
        this.field4784 = false;
    }

    @OriginalMember(owner = "client!vq", name = "va", descriptor = "(I[IIIIZI[I)V", line = 3846)
    public final void method919(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field4824++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            class122.field1990 = 0;
            class489.field7251 = 0;
            int var13 = 0;
            class295.field4200 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field4828.length) {
                    int[] var16 = this.field4828[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field4882 == null || (arg6 & this.field4882[var18]) != 0) {
                            class489.field7251 += this.field4846[var18];
                            class122.field1990 += this.field4831[var18];
                            class295.field4200 += this.field4849[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class489.field7251 = var11;
                class295.field4200 = var10;
                class122.field1990 = var12;
            } else {
                class465.field6946 = true;
                class122.field1990 = class122.field1990 / var13 + var12;
                class295.field4200 = class295.field4200 / var13 + var10;
                class489.field7251 = class489.field7251 / var13 + var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 + arg7[2] * arg4 + 16384 >> 15;
                int var20 = arg7[3] * arg2 + 16384 - (-(arg7[4] * arg3) + -(arg7[5] * arg4)) >> 15;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 16384 >> 15;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field4828.length) {
                    int[] var27 = this.field4828[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field4882 == null || (arg6 & this.field4882[var29]) != 0) {
                            this.field4846[var29] += var23;
                            this.field4831[var29] += var22;
                            this.field4849[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field4828.length > var49) {
                        int[] var50 = this.field4828[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field4882 == null || (arg6 & this.field4882[var52]) != 0) {
                                this.field4846[var52] -= class489.field7251;
                                this.field4831[var52] -= class122.field1990;
                                this.field4849[var52] -= class295.field4200;
                                if (arg4 != 0) {
                                    int var53 = class528.field7783[arg4];
                                    int var54 = class528.field7786[arg4];
                                    int var55 = this.field4846[var52] * var54 + this.field4831[var52] * var53 + 32767 >> 15;
                                    this.field4831[var52] = this.field4831[var52] * var54 + 32767 - (this.field4846[var52] * var53) >> 15;
                                    this.field4846[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class528.field7783[arg2];
                                    int var57 = class528.field7786[arg2];
                                    int var58 = this.field4831[var52] * var57 + 32767 - (this.field4849[var52] * var56) >> 15;
                                    this.field4849[var52] = this.field4849[var52] * var57 + this.field4831[var52] * var56 + 32767 >> 15;
                                    this.field4831[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class528.field7783[arg3];
                                    int var60 = class528.field7786[arg3];
                                    int var61 = this.field4846[var52] * var60 + this.field4849[var52] * var59 + 32767 >> 15;
                                    this.field4849[var52] = this.field4849[var52] * var60 + 32767 - (this.field4846[var52] * var59) >> 15;
                                    this.field4846[var52] = var61;
                                }
                                this.field4846[var52] += class489.field7251;
                                this.field4831[var52] += class122.field1990;
                                this.field4849[var52] += class295.field4200;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field4828.length > var32) {
                            int[] var33 = this.field4828[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field4882 == null || (this.field4882[var35] & arg6) != 0) {
                                    int var36 = this.field4873[var35];
                                    int var37 = this.field4873[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field4838[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class528.field7783[arg4];
                                            int var41 = class528.field7786[arg4];
                                            int var42 = this.field4875[var39] * var40 + this.field4796[var39] * var41 + 32767 >> 15;
                                            this.field4875[var39] = (short) (this.field4875[var39] * var41 + 32767 - (this.field4796[var39] * var40) >> 15);
                                            this.field4796[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class528.field7783[arg2];
                                            int var44 = class528.field7786[arg2];
                                            int var45 = this.field4875[var39] * var44 + 32767 - this.field4850[var39] * var43 >> 15;
                                            this.field4850[var39] = (short) (this.field4850[var39] * var44 + this.field4875[var39] * var43 + 32767 >> 15);
                                            this.field4875[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class528.field7783[arg3];
                                            int var47 = class528.field7786[arg3];
                                            int var48 = this.field4850[var39] * var46 + this.field4796[var39] * var47 + 32767 >> 15;
                                            this.field4850[var39] = (short) (this.field4850[var39] * var47 + 32767 - (this.field4796[var39] * var46) >> 15);
                                            this.field4796[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field4880 == null && this.field4815 != null) {
                        this.field4815.field2759 = null;
                    }
                    if (this.field4880 != null) {
                        this.field4880.field2759 = null;
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
                if (class465.field6946) {
                    int var68 = arg7[6] * class295.field4200 + (arg7[0] * class489.field7251 - (-(arg7[3] * class122.field1990) - 16384)) >> 15;
                    int var69 = arg7[7] * class295.field4200 + arg7[4] * class122.field1990 + arg7[1] * class489.field7251 + 16384 >> 15;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[8] * class295.field4200 + arg7[2] * class489.field7251 + arg7[5] * class122.field1990 + 16384 >> 15;
                    class122.field1990 = var70;
                    int var73 = var67 + var72;
                    class489.field7251 = var71;
                    class295.field4200 = var73;
                    class465.field6946 = false;
                }
                int[] var74 = new int[9];
                int var75 = class528.field7786[arg2];
                int var76 = class528.field7783[arg2];
                int var77 = class528.field7786[arg3];
                int var78 = class528.field7783[arg3];
                int var79 = class528.field7786[arg4];
                int var80 = class528.field7783[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[1] = -var77 * var80 + var78 * var81 + 16384 >> 15;
                var74[0] = var77 * var79 + var78 * var82 + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[5] = -var76;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[6] = -var78 * var79 - (-(var77 * var82) - 16384) >> 15;
                var74[7] = var78 * var80 + var77 * var81 + 16384 >> 15;
                int var83 = var74[1] * -class122.field1990 + (var74[0] * -class489.field7251 - (-(var74[2] * -class295.field4200) - 16384)) >> 15;
                int var84 = var74[5] * -class295.field4200 + var74[3] * -class489.field7251 + var74[4] * -class122.field1990 + 16384 >> 15;
                int var85 = var74[8] * -class295.field4200 + var74[7] * -class122.field1990 + var74[6] * -class489.field7251 + 16384 >> 15;
                int var86 = class489.field7251 + var83;
                int var87 = class122.field1990 + var84;
                int var88 = class295.field4200 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 16384 >> 15;
                    }
                }
                int var91 = var74[0] * var65 + var74[1] * var66 + var74[2] * var67 + 16384 >> 15;
                int var92 = var74[5] * var67 + var74[3] * var65 + (var74[4] * var66 - -16384) >> 15;
                int var93 = var86 + var91;
                int var94 = var74[8] * var67 + (var74[6] * var65 + (var74[7] * var66)) + 16384 >> 15;
                int var95 = var87 + var92;
                int var96 = var88 + var94;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 16384 >> 15;
                    }
                }
                int var99 = arg7[1] * var95 + arg7[0] * var93 + arg7[2] * var96 + 16384 >> 15;
                int var100 = arg7[4] * var95 + (arg7[3] * var93 + (arg7[5] * var96)) + 16384 >> 15;
                int var101 = var63 + var100;
                int var102 = var62 + var99;
                int var103 = arg7[6] * var93 + arg7[8] * var96 + arg7[7] * var95 + 16384 >> 15;
                int var104 = var64 + var103;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field4828.length) {
                        int[] var107 = this.field4828[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field4882 == null || (this.field4882[var109] & arg6) != 0) {
                                int var110 = this.field4849[var109] * var97[2] + this.field4831[var109] * var97[1] + this.field4846[var109] * var97[0] + 16384 >> 15;
                                int var111 = this.field4831[var109] * var97[4] + (this.field4846[var109] * var97[3] + (this.field4849[var109] * var97[5])) + 16384 >> 15;
                                int var112 = var102 + var110;
                                int var113 = var101 + var111;
                                int var114 = this.field4846[var109] * var97[6] + this.field4831[var109] * var97[7] - (-(this.field4849[var109] * var97[8]) - 16384) >> 15;
                                this.field4846[var109] = var112;
                                int var115 = var104 + var114;
                                this.field4831[var109] = var113;
                                this.field4849[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field4828.length > var173) {
                        int[] var174 = this.field4828[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field4882 == null || (arg6 & this.field4882[var176]) != 0) {
                                this.field4846[var176] -= class489.field7251;
                                this.field4831[var176] -= class122.field1990;
                                this.field4849[var176] -= class295.field4200;
                                this.field4846[var176] = this.field4846[var176] * arg2 >> 7;
                                this.field4831[var176] = this.field4831[var176] * arg3 >> 7;
                                this.field4849[var176] = this.field4849[var176] * arg4 >> 7;
                                this.field4846[var176] += class489.field7251;
                                this.field4831[var176] += class122.field1990;
                                this.field4849[var176] += class295.field4200;
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
                if (class465.field6946) {
                    int var128 = arg7[0] * class489.field7251 + arg7[6] * class295.field4200 + arg7[3] * class122.field1990 + 16384 >> 15;
                    int var129 = arg7[1] * class489.field7251 + arg7[7] * class295.field4200 + arg7[4] * class122.field1990 + 16384 >> 15;
                    int var130 = var126 + var129;
                    int var131 = arg7[2] * class489.field7251 + arg7[8] * class295.field4200 + arg7[5] * class122.field1990 + 16384 >> 15;
                    int var132 = var125 + var128;
                    class122.field1990 = var130;
                    class489.field7251 = var132;
                    int var133 = var127 + var131;
                    class295.field4200 = var133;
                    class465.field6946 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class489.field7251 * var134 + 16384 >> 15;
                int var138 = -class122.field1990 * var135 + 16384 >> 15;
                int var139 = -class295.field4200 * var136 + 16384 >> 15;
                int var140 = var137 + class489.field7251;
                int var141 = var138 + class122.field1990;
                int var142 = var139 + class295.field4200;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var140 + var144;
                int var147 = var127 * var136 + 16384 >> 15;
                int var148 = var141 + var145;
                int var149 = var142 + var147;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 16384 >> 15;
                    }
                }
                int var152 = arg7[2] * var149 + arg7[0] * var146 + arg7[1] * var148 + 16384 >> 15;
                int var153 = arg7[5] * var149 + arg7[3] * var146 + (arg7[4] * var148) + 16384 >> 15;
                int var154 = var122 + var152;
                int var155 = var123 + var153;
                int var156 = arg7[8] * var149 + arg7[7] * var148 + arg7[6] * var146 + 16384 >> 15;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field4828.length > var159) {
                        int[] var160 = this.field4828[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field4882 == null || (arg6 & this.field4882[var162]) != 0) {
                                int var163 = this.field4849[var162] * var150[2] + this.field4846[var162] * var150[0] + this.field4831[var162] * var150[1] + 16384 >> 15;
                                int var164 = this.field4846[var162] * var150[3] + this.field4849[var162] * var150[5] + this.field4831[var162] * var150[4] + 16384 >> 15;
                                int var165 = var155 + var164;
                                int var166 = this.field4831[var162] * var150[7] + (this.field4846[var162] * var150[6] + (this.field4849[var162] * var150[8])) + 16384 >> 15;
                                int var167 = var154 + var163;
                                int var168 = var157 + var166;
                                this.field4846[var162] = var167;
                                this.field4831[var162] = var165;
                                this.field4849[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4866 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field4866.length) {
                        int[] var182 = this.field4866[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field4836 == null || (arg6 & this.field4836[var184]) != 0) {
                                int var185 = (this.field4865[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field4865[var184] = (byte) var185;
                                if (this.field4815 != null) {
                                    this.field4815.field2759 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4851 != null) {
                    for (int var178 = 0; var178 < this.field4825; var178++) {
                        class287 var179 = this.field4851[var178];
                        class48 var180 = this.field4805[var178];
                        var180.field886 = var180.field886 & 0xFFFFFF | 255 - (this.field4865[var179.field4092] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4866 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field4866.length > var190) {
                        int[] var191 = this.field4866[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field4836 == null || (arg6 & this.field4836[var193]) != 0) {
                                int var194 = this.field4860[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x3E6) >> 7;
                                int var197 = var194 & 0x7F;
                                int var198 = var195 + arg2 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                int var200 = arg4 + var197;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field4860[var193] = (short) class121.method909(var200, class121.method909(var198 << 10, var199 << 7));
                                if (this.field4815 != null) {
                                    this.field4815.field2759 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4851 != null) {
                    for (int var187 = 0; var187 < this.field4825; var187++) {
                        class287 var188 = this.field4851[var187];
                        class48 var189 = this.field4805[var187];
                        var189.field886 = class441.field6587[this.field4860[var188.field4092] & 0xFFFF] & 0xFFFFFF | var189.field886 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4799 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field4799.length) {
                        int[] var203 = this.field4799[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class48 var205 = this.field4805[var203[var204]];
                            var205.field881 += arg2;
                            var205.field879 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4799 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field4799.length > var207) {
                        int[] var208 = this.field4799[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class48 var210 = this.field4805[var208[var209]];
                            var210.field884 = var210.field884 * arg2 >> 7;
                            var210.field885 = var210.field885 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4799 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field4799.length > var212) {
                    int[] var213 = this.field4799[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class48 var215 = this.field4805[var213[var214]];
                        var215.field883 = var215.field883 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "WA", descriptor = "(I)V", line = 4828)
    public final void method922(int arg0) {
        field4847++;
        int var2 = class528.field7783[arg0];
        int var3 = class528.field7786[arg0];
        for (int var4 = 0; var4 < this.field4800; var4++) {
            int var5 = this.field4831[var4] * var3 - (this.field4849[var4] * var2) >> 15;
            this.field4849[var4] = this.field4831[var4] * var2 + (this.field4849[var4] * var3) >> 15;
            this.field4831[var4] = var5;
        }
        if (this.field4858 != null) {
            this.field4858.field2759 = null;
        }
        this.field4784 = false;
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V", line = 4858)
    private final void method2081(int arg0) {
        if (this.field4851 != null) {
            class246 var2 = this.field4896.field4489;
            float var3 = this.field4896.method276();
            float var4 = this.field4896.method221();
            this.field4896.method1915(arg0 - 2126673389);
            this.field4896.method220(false);
            this.field4896.method1941(false, arg0 ^ 0x7EC226AD);
            this.field4896.method1982(null, this.field4896.field4542, this.field4896.field4623, null, arg0 ^ 0x7EC275F5);
            for (int var5 = 0; var5 < this.field4825; var5++) {
                class287 var6 = this.field4851[var5];
                class48 var7 = this.field4805[var5];
                if (!var6.field4088 || !this.field4896.method264()) {
                    float var8 = (float) (this.field4846[var6.field4098] + this.field4846[var6.field4094] + this.field4846[var6.field4091]) * 0.3333333F;
                    float var9 = (float) (this.field4831[var6.field4094] - (-this.field4831[var6.field4098] - this.field4831[var6.field4091])) * 0.3333333F;
                    float var10 = (float) (this.field4849[var6.field4098] + this.field4849[var6.field4094] + this.field4849[var6.field4091]) * 0.3333333F;
                    float var11 = class424.field6323 * var10 + class23.field478 * var9 + class142.field2251 * var8 + class148.field2367;
                    float var12 = class219.field3157 * var10 + class66.field1128 * var8 + class496.field7320 * var9 + class65.field1125;
                    float var13 = class98.field1630 * var10 + class206.field2978 * var8 + class137.field2183 * var9 + class497.field7345;
                    var2.method1601(var6.field4090 * var7.field884 >> 7, 0, (float) var7.field881 + var11, var6.field4093 * var7.field885 >> 7, -var13, (float) var7.field879 - var12, var7.field883);
                    this.field4896.method1955(var2, (byte) -82);
                    this.field4896.method300(var4, var3 - (float) var6.field4089 * 1.5F);
                    int var14 = var7.field886;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field4896.method1970(arg0 - 2126673288, var6.field4100);
                    this.field4896.method1934(var6.field4097, true);
                    this.field4896.method1989(arg0 - 2126697440, var6.field4099);
                    this.field4896.method1976(7, 4, 0, 40);
                }
            }
            this.field4896.method300(var4, var3);
            this.field4896.method220(true);
            this.field4896.method1947(true);
        }
        field4840++;
        if (arg0 != 2126673295) {
            this.field4857 = -26;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "()[Lwv;", line = 4925)
    public final class26[] method893() {
        field4885++;
        return this.field4889;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIZ)Z", line = 4940)
    public static final boolean method2082(int arg0, int arg1, boolean arg2) {
        field4837++;
        if (!arg2) {
            field4807 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V", line = 4957)
    public static void method2083(byte arg0) {
        field4807 = null;
        int var1 = -115 / ((arg0 - 55) / 32);
        field4829 = null;
    }

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "()I", line = 4967)
    public final int method889() {
        field4789++;
        return this.field4826;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lia;Llc;I)V", line = 4984)
    public final void method927(class414 arg0, class456 arg1, int arg2) {
        field4893++;
        if (this.field4790 == 0) {
            return;
        }
        class246 var4 = this.field4896.field4604;
        class246 var5 = (class246) arg0;
        if (!this.field4784) {
            this.method2073(false);
        }
        this.method2086(var5, true);
        class137.field2183 = var4.field3543 * var5.field3561 + var4.field3561 * var5.field3536 + var4.field3559 * var5.field3551;
        class497.field7345 = var4.field3543 * var5.field3529 + var4.field3561 * var5.field3557 + var4.field3559 * var5.field3554 + var4.field3529;
        float var6 = (float) this.field4845 * class137.field2183 + class497.field7345;
        float var7 = (float) this.field4886 * class137.field2183 + class497.field7345;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) this.field4890 + var6;
            var9 = var7 - (float) this.field4890;
        } else {
            var8 = (float) this.field4890 + var7;
            var9 = var6 - (float) this.field4890;
        }
        if ((var9 >= this.field4896.field4564) || ((float) this.field4896.field4600 >= var8)) {
            return;
        }
        class23.field478 = var4.field3530 * var5.field3561 + var4.field3555 * var5.field3551 + var4.field3551 * var5.field3536;
        class148.field2367 = var4.field3530 * var5.field3529 + var4.field3555 * var5.field3554 + var4.field3551 * var5.field3557 + var4.field3554;
        float var10 = (float) this.field4845 * class23.field478 + class148.field2367;
        float var11 = (float) this.field4886 * class23.field478 + class148.field2367;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) (-this.field4890) + var11) * (float) this.field4896.field4578;
            var13 = ((float) this.field4890 + var10) * (float) this.field4896.field4578;
        } else {
            var13 = ((float) this.field4890 + var11) * (float) this.field4896.field4578;
            var12 = (var10 - (float) this.field4890) * (float) this.field4896.field4578;
        }
        if ((this.field4896.field4628 <= var12 / var8) || (this.field4896.field4569 >= var13 / var8)) {
            return;
        }
        class496.field7320 = var4.field3544 * var5.field3561 + var4.field3536 * var5.field3536 + var4.field3533 * var5.field3551;
        class65.field1125 = var4.field3544 * var5.field3529 + var4.field3536 * var5.field3557 + var4.field3533 * var5.field3554 + var4.field3557;
        float var14 = (float) this.field4845 * class496.field7320 + class65.field1125;
        float var15 = (float) this.field4886 * class496.field7320 + class65.field1125;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) (-this.field4890) + var15) * (float) this.field4896.field4611;
            var17 = ((float) this.field4890 + var14) * (float) this.field4896.field4611;
        } else {
            var17 = ((float) this.field4890 + var15) * (float) this.field4896.field4611;
            var16 = (var14 - (float) this.field4890) * (float) this.field4896.field4611;
        }
        if ((this.field4896.field4609 <= var16 / var8) || (this.field4896.field4563 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field4851 != null) {
            class66.field1128 = var4.field3544 * var5.field3559 + var4.field3536 * var5.field3533 + var4.field3533 * var5.field3555;
            class98.field1630 = var4.field3543 * var5.field3543 + var4.field3561 * var5.field3544 + var4.field3559 * var5.field3530;
            class206.field2978 = var4.field3543 * var5.field3559 + var4.field3561 * var5.field3533 + var4.field3559 * var5.field3555;
            class424.field6323 = var4.field3530 * var5.field3543 + var4.field3555 * var5.field3530 + var4.field3551 * var5.field3544;
            class142.field2251 = var4.field3530 * var5.field3559 + var4.field3555 * var5.field3555 + var4.field3551 * var5.field3533;
            class219.field3157 = var4.field3544 * var5.field3543 + var4.field3536 * var5.field3544 + var4.field3533 * var5.field3530;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field4862 + this.field4856 >> 1;
            int var21 = this.field4867 + this.field4839 >> 1;
            int var22 = (int) ((float) var21 * class424.field6323 + (float) this.field4845 * class23.field478 + (float) var20 * class142.field2251 + class148.field2367);
            int var23 = (int) ((float) var21 * class219.field3157 + (float) this.field4845 * class496.field7320 + (float) var20 * class66.field1128 + class65.field1125);
            int var24 = (int) ((float) var21 * class98.field1630 + (float) this.field4845 * class137.field2183 + (float) var20 * class206.field2978 + class497.field7345);
            if (var24 >= this.field4896.field4600) {
                arg1.field6813 = this.field4896.field4517 + (this.field4896.field4611 * var23 / var24);
                arg1.field6812 = this.field4896.field4578 * var22 / var24 + this.field4896.field4605;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class424.field6323 + (float) this.field4886 * class23.field478 + (float) var20 * class142.field2251 + class148.field2367);
            int var26 = (int) ((float) var21 * class219.field3157 + (float) this.field4886 * class496.field7320 + (float) var20 * class66.field1128 + class65.field1125);
            int var27 = (int) ((float) var21 * class98.field1630 + (float) this.field4886 * class137.field2183 + (float) var20 * class206.field2978 + class497.field7345);
            if (this.field4896.field4600 <= var27) {
                arg1.field6810 = this.field4896.field4578 * var25 / var27 + this.field4896.field4605;
                arg1.field6811 = this.field4896.field4611 * var26 / var27 + this.field4896.field4517;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field4896.field4600 && var27 < this.field4896.field4600) {
                    var19 = false;
                } else if (var24 < this.field4896.field4600) {
                    int var28 = (var27 - this.field4896.field4600 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field6812 = this.field4896.field4605 + (this.field4896.field4578 * var29 / this.field4896.field4600);
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field6813 = this.field4896.field4611 * var30 / this.field4896.field4600 + this.field4896.field4517;
                } else if (var27 < this.field4896.field4600) {
                    int var31 = (var24 - this.field4896.field4600 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field6812 = this.field4896.field4605 + (this.field4896.field4578 * var32 / this.field4896.field4600);
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field6813 = this.field4896.field4611 * var33 / this.field4896.field4600 + this.field4896.field4517;
                }
            }
            if (var19) {
                arg1.field6809 = true;
                if (var24 <= var27) {
                    arg1.field6814 = (this.field4890 + var25) * this.field4896.field4578 / var27 + this.field4896.field4605 - arg1.field6810;
                } else {
                    arg1.field6814 = (var22 + this.field4890) * this.field4896.field4578 / var24 + this.field4896.field4605 - arg1.field6812;
                }
            }
        }
        this.field4896.method1987(59);
        this.field4896.method1962(var5, 118);
        this.method2076(105);
        this.field4896.method1947(true);
        this.method2081(2126673295);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lia;Llc;II)V", line = 5188)
    public final void method899(class414 arg0, class456 arg1, int arg2, int arg3) {
        field4827++;
        if (this.field4790 == 0) {
            return;
        }
        class246 var5 = this.field4896.field4604;
        if (!this.field4784) {
            this.method2073(false);
        }
        class246 var6 = (class246) arg0;
        class497.field7345 = var5.field3543 * var6.field3529 + var5.field3561 * var6.field3557 + var5.field3559 * var6.field3554 + var5.field3529;
        class137.field2183 = var5.field3543 * var6.field3561 + var5.field3561 * var6.field3536 + var5.field3559 * var6.field3551;
        float var7 = (float) this.field4845 * class137.field2183 + class497.field7345;
        float var8 = (float) this.field4886 * class137.field2183 + class497.field7345;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var9 = (float) this.field4890 + var7;
            var10 = (float) (-this.field4890) + var8;
        } else {
            var9 = (float) this.field4890 + var8;
            var10 = (float) (-this.field4890) + var7;
        }
        if ((this.field4896.field4631 <= var10) || ((float) this.field4896.field4600 >= var9)) {
            return;
        }
        class23.field478 = var5.field3530 * var6.field3561 + var5.field3555 * var6.field3551 + var5.field3551 * var6.field3536;
        class148.field2367 = var5.field3530 * var6.field3529 + var5.field3555 * var6.field3554 + var5.field3551 * var6.field3557 + var5.field3554;
        float var11 = (float) this.field4845 * class23.field478 + class148.field2367;
        float var12 = (float) this.field4886 * class23.field478 + class148.field2367;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = ((float) (-this.field4890) + var12) * (float) this.field4896.field4578;
            var14 = ((float) this.field4890 + var11) * (float) this.field4896.field4578;
        } else {
            var13 = (var11 - (float) this.field4890) * (float) this.field4896.field4578;
            var14 = ((float) this.field4890 + var12) * (float) this.field4896.field4578;
        }
        if ((var13 / (float) arg2 >= this.field4896.field4628) || (this.field4896.field4569 >= var14 / (float) arg2)) {
            return;
        }
        class65.field1125 = var5.field3544 * var6.field3529 + var5.field3536 * var6.field3557 + var5.field3533 * var6.field3554 + var5.field3557;
        class496.field7320 = var5.field3544 * var6.field3561 + var5.field3536 * var6.field3536 + var5.field3533 * var6.field3551;
        float var15 = (float) this.field4845 * class496.field7320 + class65.field1125;
        float var16 = (float) this.field4886 * class496.field7320 + class65.field1125;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = ((float) this.field4890 + var15) * (float) this.field4896.field4611;
            var17 = ((float) (-this.field4890) + var16) * (float) this.field4896.field4611;
        } else {
            var17 = ((float) (-this.field4890) + var15) * (float) this.field4896.field4611;
            var18 = ((float) this.field4890 + var16) * (float) this.field4896.field4611;
        }
        if ((var17 / (float) arg2 >= this.field4896.field4609) || (this.field4896.field4563 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field4851 != null) {
            class66.field1128 = var5.field3544 * var6.field3559 + var5.field3536 * var6.field3533 + var5.field3533 * var6.field3555;
            class142.field2251 = var5.field3530 * var6.field3559 + var5.field3555 * var6.field3555 + var5.field3551 * var6.field3533;
            class219.field3157 = var5.field3544 * var6.field3543 + var5.field3536 * var6.field3544 + var5.field3533 * var6.field3530;
            class424.field6323 = var5.field3530 * var6.field3543 + var5.field3555 * var6.field3530 + var5.field3551 * var6.field3544;
            class206.field2978 = var5.field3543 * var6.field3559 + var5.field3561 * var6.field3533 + var5.field3559 * var6.field3555;
            class98.field1630 = var5.field3543 * var6.field3543 + var5.field3561 * var6.field3544 + var5.field3559 * var6.field3530;
        }
        if (arg1 != null) {
            int var19 = this.field4862 + this.field4856 >> 1;
            int var20 = this.field4867 + this.field4839 >> 1;
            int var21 = (int) ((float) var20 * class424.field6323 + (float) this.field4845 * class23.field478 + (float) var19 * class142.field2251 + class148.field2367);
            int var22 = (int) ((float) var20 * class219.field3157 + (float) this.field4845 * class496.field7320 + (float) var19 * class66.field1128 + class65.field1125);
            int var23 = (int) ((float) var20 * class98.field1630 + (float) this.field4845 * class137.field2183 + (float) var19 * class206.field2978 + class497.field7345);
            int var24 = (int) ((float) var20 * class424.field6323 + (float) this.field4886 * class23.field478 + (float) var19 * class142.field2251 + class148.field2367);
            int var25 = (int) ((float) var20 * class219.field3157 + (float) this.field4886 * class496.field7320 + (float) var19 * class66.field1128 + class65.field1125);
            arg1.field6813 = this.field4896.field4611 * var22 / arg2 + this.field4896.field4517;
            arg1.field6812 = this.field4896.field4605 + (this.field4896.field4578 * var21 / arg2);
            arg1.field6811 = this.field4896.field4611 * var25 / arg2 + this.field4896.field4517;
            int var26 = (int) ((float) var20 * class98.field1630 + (float) this.field4886 * class137.field2183 + (float) var19 * class206.field2978 + class497.field7345);
            arg1.field6810 = this.field4896.field4578 * var24 / arg2 + this.field4896.field4605;
            if (this.field4896.field4600 > var23 && var26 < this.field4896.field4600) {
                arg1.field6814 = (var21 + this.field4890) * this.field4896.field4578 / arg2 + this.field4896.field4605 - arg1.field6812;
                arg1.field6809 = true;
            }
        }
        this.field4896.method1940(91, (float) arg2);
        this.field4896.method1958(8960);
        this.field4896.method1962(var6, 113);
        this.method2076(-97);
        this.field4896.method1947(true);
        this.method2081(2126673295);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BIZ)Lc;", line = 5333)
    public final class121 method938(byte arg0, int arg1, boolean arg2) {
        field4892++;
        class319 var4;
        class319 var5;
        if (arg0 == 1) {
            var5 = this.field4896.field4587;
            var4 = this.field4896.field4620;
        } else if (arg0 == 2) {
            var4 = this.field4896.field4574;
            var5 = this.field4896.field4593;
        } else if (arg0 == 3) {
            var5 = this.field4896.field4544;
            var4 = this.field4896.field4596;
        } else if (arg0 == 4) {
            var5 = this.field4896.field4520;
            var4 = this.field4896.field4549;
        } else if (arg0 == 5) {
            var4 = this.field4896.field4579;
            var5 = this.field4896.field4603;
        } else {
            var4 = var5 = new class319(this.field4896);
        }
        return this.method2077(arg2, var4, arg1, var5, arg0 != 0, (byte) -127);
    }

    @OriginalMember(owner = "client!vq", name = "XA", descriptor = "(III)V", line = 5384)
    public final void method925(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4800; var4++) {
            if (arg0 != 128) {
                this.field4846[var4] = this.field4846[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field4831[var4] = this.field4831[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field4849[var4] = this.field4849[var4] * arg2 >> 7;
            }
        }
        field4808++;
        if (this.field4858 != null) {
            this.field4858.field2759 = null;
        }
        this.field4784 = false;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BIISI)I", line = 5420)
    private final int method2084(byte arg0, int arg1, int arg2, short arg3, int arg4) {
        if (arg4 > -56) {
            this.field4850 = null;
        }
        field4819++;
        int var6 = class441.field6587[class115.method853(arg1, 25, arg2)];
        if (arg3 != -1) {
            class83 var7 = this.field4896.field2501.method956(-945, arg3 & 0xFFFF);
            int var8 = var7.field1449 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 <= 127) {
                    var9 = arg2 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field1446 & 0xFF;
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
                var6 = (var13 << 8 & 0xFF00FF) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) - ((arg0 & 0xFF) - 255);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLco;)V", line = 5500)
    private final void method2085(byte arg0, class76 arg1) {
        field4874++;
        if (class109.field1808.length < this.field4790) {
            class109.field1808 = new int[this.field4790];
            class531.field7805 = new int[this.field4790];
        }
        for (int var3 = 0; var3 < this.field4800; var3++) {
            int var14 = (this.field4846[var3] - (this.field4831[var3] * this.field4896.field4567 >> 8) >> this.field4896.field4492) - arg1.field1266;
            int var15 = (this.field4849[var3] - (this.field4831[var3] * this.field4896.field4591 >> 8) >> this.field4896.field4492) - arg1.field1269;
            int var16 = this.field4873[var3];
            int var17 = this.field4873[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field4838[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class109.field1808[var19] = var14;
                class531.field7805[var19] = var15;
            }
        }
        if (arg0 >= -17) {
            this.method917(33, null, -29, -76, -23, -90, false);
        }
        for (int var4 = 0; var4 < this.field4817; var4++) {
            if (this.field4865 == null || this.field4865[var4] <= 128) {
                short var5 = this.field4869[var4];
                short var6 = this.field4848[var4];
                short var7 = this.field4798[var4];
                int var8 = class109.field1808[var5];
                int var9 = class109.field1808[var6];
                int var10 = class109.field1808[var7];
                int var11 = class531.field7805[var5];
                int var12 = class531.field7805[var6];
                int var13 = class531.field7805[var7];
                if ((var8 - var9) * (var12 - var13) - (var10 - var9) * (var12 - var11) > 0) {
                    arg1.method609(var13, var12, var10, var11, var9, (byte) 31, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "la", descriptor = "()I", line = 5585)
    public final int method907() {
        field4787++;
        if (!this.field4784) {
            this.method2073(false);
        }
        return this.field4856;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lmn;Z)V", line = 5596)
    private final void method2086(class246 arg0, boolean arg1) {
        if (!arg1) {
            this.method924(-52, 100, null, true);
        }
        field4878++;
        if (this.field4889 != null) {
            for (int var3 = 0; var3 < this.field4889.length; var3++) {
                class26 var4 = this.field4889[var3];
                class26 var5 = var4;
                if (var4.field574 != null) {
                    var5 = var4.field574;
                }
                var5.field568 = (int) ((float) this.field4849[var4.field571] * arg0.field3530 + (float) this.field4846[var4.field571] * arg0.field3555 + (float) this.field4831[var4.field571] * arg0.field3551 + arg0.field3554);
                var5.field558 = (int) ((float) this.field4849[var4.field571] * arg0.field3544 + (float) this.field4846[var4.field571] * arg0.field3533 + (float) this.field4831[var4.field571] * arg0.field3536 + arg0.field3557);
                var5.field570 = (int) ((float) this.field4849[var4.field571] * arg0.field3543 + (float) this.field4846[var4.field571] * arg0.field3559 + (float) this.field4831[var4.field571] * arg0.field3561 + arg0.field3529);
                var5.field573 = (int) ((float) this.field4849[var4.field566] * arg0.field3530 + (float) this.field4846[var4.field566] * arg0.field3555 + (float) this.field4831[var4.field566] * arg0.field3551 + arg0.field3554);
                var5.field562 = (int) ((float) this.field4849[var4.field566] * arg0.field3544 + (float) this.field4846[var4.field566] * arg0.field3533 + (float) this.field4831[var4.field566] * arg0.field3536 + arg0.field3557);
                var5.field556 = (int) ((float) this.field4849[var4.field566] * arg0.field3543 + (float) this.field4846[var4.field566] * arg0.field3559 + (float) this.field4831[var4.field566] * arg0.field3561 + arg0.field3529);
                var5.field559 = (int) ((float) this.field4849[var4.field565] * arg0.field3530 + (float) this.field4846[var4.field565] * arg0.field3555 + (float) this.field4831[var4.field565] * arg0.field3551 + arg0.field3554);
                var5.field564 = (int) ((float) this.field4849[var4.field565] * arg0.field3544 + (float) this.field4846[var4.field565] * arg0.field3533 + (float) this.field4831[var4.field565] * arg0.field3536 + arg0.field3557);
                var5.field557 = (int) ((float) this.field4849[var4.field565] * arg0.field3543 + (float) this.field4846[var4.field565] * arg0.field3559 + (float) this.field4831[var4.field565] * arg0.field3561 + arg0.field3529);
            }
        }
        if (this.field4822 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4822.length; var6++) {
            class501 var7 = this.field4822[var6];
            class501 var8 = var7;
            if (var7.field7385 != null) {
                var8 = var7.field7385;
            }
            if (var7.field7391 == null) {
                var7.field7391 = arg0.method871();
            } else {
                var7.field7391.method866(arg0);
            }
            var8.field7386 = (int) ((float) this.field4849[var7.field7393] * arg0.field3530 + (float) this.field4846[var7.field7393] * arg0.field3555 + (float) this.field4831[var7.field7393] * arg0.field3551 + arg0.field3554);
            var8.field7384 = (int) ((float) this.field4849[var7.field7393] * arg0.field3544 + (float) this.field4846[var7.field7393] * arg0.field3533 + (float) this.field4831[var7.field7393] * arg0.field3536 + arg0.field3557);
            var8.field7395 = (int) ((float) this.field4849[var7.field7393] * arg0.field3543 + (float) this.field4846[var7.field7393] * arg0.field3559 + (float) this.field4831[var7.field7393] * arg0.field3561 + arg0.field3529);
        }
    }

    @OriginalMember(owner = "client!vq", name = "ja", descriptor = "(III)V", line = 5666)
    public final void method923(int arg0, int arg1, int arg2) {
        field4891++;
        for (int var4 = 0; var4 < this.field4800; var4++) {
            if (arg0 != 0) {
                this.field4846[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field4831[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field4849[var4] += arg2;
            }
        }
        if (this.field4858 != null) {
            this.field4858.field2759 = null;
        }
        this.field4784 = false;
    }
}
