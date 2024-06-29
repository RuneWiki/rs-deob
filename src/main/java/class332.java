import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class332 extends class231 {

    @OriginalMember(owner = "client!pr", name = "W", descriptor = "I")
    private int field4674 = 0;

    @OriginalMember(owner = "client!pr", name = "wb", descriptor = "Z")
    private boolean field4700 = true;

    @OriginalMember(owner = "client!pr", name = "nb", descriptor = "I")
    private int field4691 = 0;

    @OriginalMember(owner = "client!pr", name = "Ib", descriptor = "I")
    private int field4712 = 0;

    @OriginalMember(owner = "client!pr", name = "J", descriptor = "I")
    private int field4661 = 0;

    @OriginalMember(owner = "client!pr", name = "gc", descriptor = "Z")
    private boolean field4736 = false;

    @OriginalMember(owner = "client!pr", name = "qb", descriptor = "Z")
    private boolean field4694 = false;

    @OriginalMember(owner = "client!pr", name = "Zb", descriptor = "I")
    private int field4729 = 0;

    @OriginalMember(owner = "client!pr", name = "zc", descriptor = "Z")
    private boolean field4755 = false;

    @OriginalMember(owner = "client!pr", name = "yc", descriptor = "Lpq;")
    private class194 field4754;

    @OriginalMember(owner = "client!pr", name = "Nb", descriptor = "Lls;")
    private class166 field4717;

    @OriginalMember(owner = "client!pr", name = "lc", descriptor = "Lls;")
    private class166 field4741;

    @OriginalMember(owner = "client!pr", name = "Bb", descriptor = "Lls;")
    private class166 field4705;

    @OriginalMember(owner = "client!pr", name = "Rb", descriptor = "Lls;")
    private class166 field4721;

    @OriginalMember(owner = "client!pr", name = "fc", descriptor = "Lmj;")
    private class112 field4735;

    @OriginalMember(owner = "client!pr", name = "xc", descriptor = "I")
    private int field4753;

    @OriginalMember(owner = "client!pr", name = "vc", descriptor = "I")
    private int field4751;

    @OriginalMember(owner = "client!pr", name = "dc", descriptor = "[I")
    private int[] field4733;

    @OriginalMember(owner = "client!pr", name = "Cb", descriptor = "[I")
    private int[] field4706;

    @OriginalMember(owner = "client!pr", name = "cc", descriptor = "[S")
    private short[] field4732;

    @OriginalMember(owner = "client!pr", name = "K", descriptor = "[I")
    private int[] field4662;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "[I")
    private int[] field4642;

    @OriginalMember(owner = "client!pr", name = "sb", descriptor = "[Lmb;")
    private class426[] field4696;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "[Lfba;")
    private class626[] field4643;

    @OriginalMember(owner = "client!pr", name = "Tb", descriptor = "I")
    private int field4723;

    @OriginalMember(owner = "client!pr", name = "Ec", descriptor = "[Leia;")
    private class785[] field4760;

    @OriginalMember(owner = "client!pr", name = "ub", descriptor = "[Lgn;")
    private class590[] field4698;

    @OriginalMember(owner = "client!pr", name = "P", descriptor = "[S")
    private short[] field4667;

    @OriginalMember(owner = "client!pr", name = "Mb", descriptor = "[S")
    private short[] field4716;

    @OriginalMember(owner = "client!pr", name = "Hb", descriptor = "[S")
    private short[] field4711;

    @OriginalMember(owner = "client!pr", name = "R", descriptor = "[S")
    private short[] field4669;

    @OriginalMember(owner = "client!pr", name = "qc", descriptor = "[S")
    private short[] field4746;

    @OriginalMember(owner = "client!pr", name = "tb", descriptor = "[S")
    private short[] field4697;

    @OriginalMember(owner = "client!pr", name = "mb", descriptor = "[S")
    private short[] field4690;

    @OriginalMember(owner = "client!pr", name = "cb", descriptor = "[F")
    private float[] field4680;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "[S")
    private short[] field4648;

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "[S")
    private short[] field4655;

    @OriginalMember(owner = "client!pr", name = "ob", descriptor = "[S")
    private short[] field4692;

    @OriginalMember(owner = "client!pr", name = "Bc", descriptor = "S")
    private short field4757;

    @OriginalMember(owner = "client!pr", name = "eb", descriptor = "[B")
    private byte[] field4682;

    @OriginalMember(owner = "client!pr", name = "ec", descriptor = "[F")
    private float[] field4734;

    @OriginalMember(owner = "client!pr", name = "kb", descriptor = "S")
    private short field4688;

    @OriginalMember(owner = "client!pr", name = "uc", descriptor = "[B")
    private byte[] field4750;

    @OriginalMember(owner = "client!pr", name = "lb", descriptor = "[I")
    private int[] field4689;

    @OriginalMember(owner = "client!pr", name = "M", descriptor = "[[I")
    private int[][] field4664;

    @OriginalMember(owner = "client!pr", name = "xb", descriptor = "[[I")
    private int[][] field4701;

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "[[I")
    private int[][] field4653;

    @OriginalMember(owner = "client!pr", name = "hc", descriptor = "B")
    private byte field4737;

    @OriginalMember(owner = "client!pr", name = "Z", descriptor = "F")
    private static float field4677;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!pr", name = "A", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!pr", name = "F", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!pr", name = "I", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!pr", name = "L", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!pr", name = "N", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!pr", name = "O", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!pr", name = "Q", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!pr", name = "S", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!pr", name = "T", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!pr", name = "U", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!pr", name = "V", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!pr", name = "X", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!pr", name = "Y", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!pr", name = "ab", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!pr", name = "bb", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!pr", name = "db", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!pr", name = "fb", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!pr", name = "gb", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!pr", name = "hb", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!pr", name = "ib", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!pr", name = "jb", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!pr", name = "pb", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!pr", name = "rb", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!pr", name = "vb", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!pr", name = "yb", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!pr", name = "zb", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!pr", name = "Ab", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!pr", name = "Db", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!pr", name = "Fb", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!pr", name = "Gb", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!pr", name = "Jb", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!pr", name = "Kb", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!pr", name = "Lb", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!pr", name = "Ob", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!pr", name = "Pb", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!pr", name = "Qb", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!pr", name = "Sb", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!pr", name = "Ub", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!pr", name = "Wb", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!pr", name = "Xb", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!pr", name = "Yb", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!pr", name = "ac", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!pr", name = "bc", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!pr", name = "ic", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!pr", name = "jc", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!pr", name = "kc", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!pr", name = "mc", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!pr", name = "nc", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!pr", name = "sc", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!pr", name = "tc", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!pr", name = "wc", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!pr", name = "Ac", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!pr", name = "Cc", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!pr", name = "Dc", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!pr", name = "Fc", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!pr", name = "E", descriptor = "Lvn;")
    private class211 field4656;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "Los;")
    private class275 field4651;

    @OriginalMember(owner = "client!pr", name = "rc", descriptor = "Ljda;")
    private class90 field4747;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "S")
    private short field4645;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "S")
    private short field4647;

    @OriginalMember(owner = "client!pr", name = "G", descriptor = "S")
    private short field4658;

    @OriginalMember(owner = "client!pr", name = "H", descriptor = "S")
    private short field4659;

    @OriginalMember(owner = "client!pr", name = "Eb", descriptor = "S")
    private short field4708;

    @OriginalMember(owner = "client!pr", name = "Vb", descriptor = "S")
    private short field4725;

    @OriginalMember(owner = "client!pr", name = "oc", descriptor = "S")
    private short field4744;

    @OriginalMember(owner = "client!pr", name = "pc", descriptor = "S")
    private short field4745;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public final void method1542(int arg0) {
        field4672++;
        int var2 = class448.field6265[arg0];
        int var3 = class448.field6270[arg0];
        for (int var4 = 0; var4 < this.field4674; var4++) {
            int var5 = this.field4706[var4] * var2 + this.field4662[var4] * var3 >> 14;
            this.field4706[var4] = this.field4706[var4] * var3 - (this.field4662[var4] * var2) >> 14;
            this.field4662[var4] = var5;
        }
        this.field4736 = false;
        if (this.field4717 != null) {
            this.field4717.field2125 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "wa", descriptor = "()V")
    public final void method1556() {
        field4738++;
        for (int var1 = 0; var1 < this.field4729; var1++) {
            this.field4662[var1] = this.field4662[var1] + 7 >> 4;
            this.field4642[var1] = this.field4642[var1] + 7 >> 4;
            this.field4706[var1] = this.field4706[var1] + 7 >> 4;
        }
        this.field4736 = false;
        if (this.field4717 != null) {
            this.field4717.field2125 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "()Z")
    public final boolean method1547() {
        field4699++;
        if (this.field4648 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field4648.length; var1++) {
            if (this.field4648[var1] != -1 && !this.field4754.field6556.method583(12101, this.field4648[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLgea;)V")
    private final void method2104(byte arg0, class65 arg1) {
        if (this.field4754.field2759.length < this.field4712) {
            this.field4754.field2759 = new int[this.field4712];
            this.field4754.field2762 = new int[this.field4712];
        }
        field4752++;
        int[] var3 = this.field4754.field2759;
        int[] var4 = this.field4754.field2762;
        for (int var5 = 0; var5 < this.field4674; var5++) {
            int var16 = (this.field4662[var5] - (this.field4642[var5] * this.field4754.field2669 >> 8) >> this.field4754.field2610) - arg1.field712;
            int var17 = (this.field4706[var5] - (this.field4642[var5] * this.field4754.field2746 >> 8) >> this.field4754.field2610) - arg1.field720;
            int var18 = this.field4733[var5];
            int var19 = this.field4733[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field4669[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        if (arg0 > -71) {
            this.field4694 = true;
        }
        for (int var6 = 0; var6 < this.field4691; var6++) {
            if (this.field4682 == null || this.field4682[var6] <= 128) {
                short var7 = this.field4655[var6];
                short var8 = this.field4746[var6];
                short var9 = this.field4711[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - (var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method505(var15, var11, var14, var10, var13, -75201936, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILoo;ZI)Z")
    public final boolean method1578(int arg0, int arg1, class12 arg2, boolean arg3, int arg4) {
        field4724++;
        return this.method2106(arg4, arg3, -1, arg0, arg2, arg1, 2115310305);
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
    private final void method2105(int arg0) {
        field4710++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4674; var10++) {
            int var11 = this.field4662[var10];
            int var12 = this.field4642[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            int var13 = this.field4706[var10];
            if (var7 < var13) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field4745 = (short) var6;
        this.field4708 = (short) var4;
        this.field4659 = (short) var5;
        this.field4645 = (short) var3;
        if (arg0 >= -120) {
            this.method1579();
        }
        this.field4658 = (short) var7;
        this.field4647 = (short) var2;
        this.field4744 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field4725 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field4736 = true;
    }

    @OriginalMember(owner = "client!pr", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method1560(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field4687++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class553.field7658 = 0;
            int var13 = 0;
            client.field1310 = 0;
            class281.field4036 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field4664.length) {
                    int[] var16 = this.field4664[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field4732 == null || (this.field4732[var18] & arg6) != 0) {
                            client.field1310 += this.field4662[var18];
                            class553.field7658 += this.field4642[var18];
                            class281.field4036 += this.field4706[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                client.field1310 = var10;
                class281.field4036 = var12;
                class553.field7658 = var11;
            } else {
                client.field1310 = client.field1310 / var13 + var10;
                class404.field5701 = true;
                class281.field4036 = class281.field4036 / var13 + var12;
                class553.field7658 = class553.field7658 / var13 + var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + (arg7[6] * arg2 + (arg7[7] * arg3)) + 8192 >> 14;
                arg4 = var21;
                arg2 = var19;
                arg3 = var20;
            }
            int var22 = arg3 << 4;
            int var23 = arg4 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field4664.length) {
                    int[] var27 = this.field4664[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field4732 == null || (this.field4732[var29] & arg6) != 0) {
                            this.field4662[var29] += var24;
                            this.field4642[var29] += var22;
                            this.field4706[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field4664.length) {
                        int[] var50 = this.field4664[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field4732 == null || (this.field4732[var52] & arg6) != 0) {
                                this.field4662[var52] -= client.field1310;
                                this.field4642[var52] -= class553.field7658;
                                this.field4706[var52] -= class281.field4036;
                                if (arg4 != 0) {
                                    int var53 = class448.field6265[arg4];
                                    int var54 = class448.field6270[arg4];
                                    int var55 = this.field4662[var52] * var54 + this.field4642[var52] * var53 + 16383 >> 14;
                                    this.field4642[var52] = this.field4642[var52] * var54 + 16383 - (this.field4662[var52] * var53) >> 14;
                                    this.field4662[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class448.field6265[arg2];
                                    int var57 = class448.field6270[arg2];
                                    int var58 = this.field4642[var52] * var57 + 16383 - this.field4706[var52] * var56 >> 14;
                                    this.field4706[var52] = this.field4642[var52] * var56 + (this.field4706[var52] * var57) + 16383 >> 14;
                                    this.field4642[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class448.field6265[arg3];
                                    int var60 = class448.field6270[arg3];
                                    int var61 = this.field4662[var52] * var60 + (this.field4706[var52] * var59 + 16383) >> 14;
                                    this.field4706[var52] = this.field4706[var52] * var60 + 16383 - (this.field4662[var52] * var59) >> 14;
                                    this.field4662[var52] = var61;
                                }
                                this.field4662[var52] += client.field1310;
                                this.field4642[var52] += class553.field7658;
                                this.field4706[var52] += class281.field4036;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field4664.length > var32) {
                            int[] var33 = this.field4664[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field4732 == null || (this.field4732[var35] & arg6) != 0) {
                                    int var36 = this.field4733[var35];
                                    int var37 = this.field4733[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field4669[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class448.field6265[arg4];
                                            int var41 = class448.field6270[arg4];
                                            int var42 = this.field4692[var39] * var41 + this.field4690[var39] * var40 + 16383 >> 14;
                                            this.field4690[var39] = (short) (this.field4690[var39] * var41 + 16383 - (this.field4692[var39] * var40) >> 14);
                                            this.field4692[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class448.field6265[arg2];
                                            int var44 = class448.field6270[arg2];
                                            int var45 = this.field4690[var39] * var44 + 16383 - (this.field4716[var39] * var43) >> 14;
                                            this.field4716[var39] = (short) (this.field4690[var39] * var43 + this.field4716[var39] * var44 + 16383 >> 14);
                                            this.field4690[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class448.field6265[arg3];
                                            int var47 = class448.field6270[arg3];
                                            int var48 = this.field4716[var39] * var46 + this.field4692[var39] * var47 + 16383 >> 14;
                                            this.field4716[var39] = (short) (this.field4716[var39] * var47 + 16383 - (this.field4692[var39] * var46) >> 14);
                                            this.field4692[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field4705 == null && this.field4721 != null) {
                        this.field4721.field2125 = null;
                    }
                    if (this.field4705 != null) {
                        this.field4705.field2125 = null;
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
                if (class404.field5701) {
                    int var68 = arg7[6] * class281.field4036 + arg7[0] * client.field1310 + arg7[3] * class553.field7658 + 8192 >> 14;
                    int var69 = arg7[4] * class553.field7658 + (arg7[7] * class281.field4036) + arg7[1] * client.field1310 + 8192 >> 14;
                    int var70 = arg7[8] * class281.field4036 + arg7[5] * class553.field7658 + arg7[2] * client.field1310 + 8192 >> 14;
                    int var71 = var66 + var69;
                    int var72 = var65 + var68;
                    int var73 = var67 + var70;
                    class553.field7658 = var71;
                    client.field1310 = var72;
                    class404.field5701 = false;
                    class281.field4036 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class448.field6270[arg2];
                int var76 = class448.field6265[arg2];
                int var77 = class448.field6270[arg3];
                int var78 = class448.field6265[arg3];
                int var79 = class448.field6270[arg4];
                int var80 = class448.field6265[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[6] = var77 * var82 + -var78 * var79 + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[5] = -var76;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[1] = -var77 * var80 + (var78 * var81) + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                int var83 = var74[1] * -class553.field7658 + var74[0] * -client.field1310 + (var74[2] * -class281.field4036 - -8192) >> 14;
                int var84 = var74[5] * -class281.field4036 + var74[3] * -client.field1310 + var74[4] * -class553.field7658 + 8192 >> 14;
                int var85 = var74[8] * -class281.field4036 + var74[7] * -class553.field7658 + var74[6] * -client.field1310 + 8192 >> 14;
                int var86 = client.field1310 + var83;
                int var87 = class553.field7658 + var84;
                int var88 = class281.field4036 + var85;
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
                int var91 = var74[0] * var65 + var74[1] * var66 + var74[2] * var67 + 8192 >> 14;
                int var92 = var74[5] * var67 + var74[3] * var65 - (-(var74[4] * var66) - 8192) >> 14;
                int var93 = var86 + var91;
                int var94 = var87 + var92;
                int var95 = var74[6] * var65 + var74[8] * var67 + var74[7] * var66 + 8192 >> 14;
                int var96 = var88 + var95;
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
                int var99 = arg7[2] * var96 + arg7[1] * var94 + arg7[0] * var93 + 8192 >> 14;
                int var100 = arg7[4] * var94 + arg7[3] * var93 + arg7[5] * var96 + 8192 >> 14;
                int var101 = arg7[8] * var96 + (arg7[6] * var93 + (arg7[7] * var94) + 8192) >> 14;
                int var102 = var62 + var99;
                int var103 = var63 + var100;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field4664.length) {
                        int[] var107 = this.field4664[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field4732 == null || (this.field4732[var109] & arg6) != 0) {
                                int var110 = this.field4662[var109] * var97[0] + this.field4642[var109] * var97[1] - (-(this.field4706[var109] * var97[2]) + -8192) >> 14;
                                int var111 = this.field4662[var109] * var97[3] + this.field4706[var109] * var97[5] + this.field4642[var109] * var97[4] + 8192 >> 14;
                                int var112 = var102 + var110;
                                int var113 = this.field4706[var109] * var97[8] + this.field4662[var109] * var97[6] + (this.field4642[var109] * var97[7]) + 8192 >> 14;
                                int var114 = var103 + var111;
                                int var115 = var104 + var113;
                                this.field4662[var109] = var112;
                                this.field4642[var109] = var114;
                                this.field4706[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field4664.length > var173) {
                        int[] var174 = this.field4664[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field4732 == null || (this.field4732[var176] & arg6) != 0) {
                                this.field4662[var176] -= client.field1310;
                                this.field4642[var176] -= class553.field7658;
                                this.field4706[var176] -= class281.field4036;
                                this.field4662[var176] = this.field4662[var176] * arg2 >> 7;
                                this.field4642[var176] = this.field4642[var176] * arg3 >> 7;
                                this.field4706[var176] = this.field4706[var176] * arg4 >> 7;
                                this.field4662[var176] += client.field1310;
                                this.field4642[var176] += class553.field7658;
                                this.field4706[var176] += class281.field4036;
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
                if (class404.field5701) {
                    int var128 = arg7[6] * class281.field4036 + arg7[3] * class553.field7658 + arg7[0] * client.field1310 + 8192 >> 14;
                    int var129 = arg7[1] * client.field1310 + (arg7[4] * class553.field7658) + (arg7[7] * class281.field4036 - -8192) >> 14;
                    int var130 = var126 + var129;
                    int var131 = var125 + var128;
                    int var132 = arg7[2] * client.field1310 + arg7[8] * class281.field4036 + arg7[5] * class553.field7658 + 8192 >> 14;
                    client.field1310 = var131;
                    int var133 = var127 + var132;
                    class553.field7658 = var130;
                    class281.field4036 = var133;
                    class404.field5701 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -client.field1310 * var134 + 8192 >> 14;
                int var138 = -class553.field7658 * var135 + 8192 >> 14;
                int var139 = -class281.field4036 * var136 + 8192 >> 14;
                int var140 = client.field1310 + var137;
                int var141 = class553.field7658 + var138;
                int var142 = class281.field4036 + var139;
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
                int var152 = arg7[0] * var148 + arg7[1] * var147 + arg7[2] * var149 + 8192 >> 14;
                int var153 = arg7[4] * var147 + (arg7[5] * var149) + arg7[3] * var148 + 8192 >> 14;
                int var154 = var122 + var152;
                int var155 = var123 + var153;
                int var156 = arg7[8] * var149 + arg7[7] * var147 + arg7[6] * var148 + 8192 >> 14;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field4664.length) {
                        int[] var160 = this.field4664[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field4732 == null || (arg6 & this.field4732[var162]) != 0) {
                                int var163 = this.field4662[var162] * var150[0] + this.field4642[var162] * var150[1] - (-(this.field4706[var162] * var150[2]) - 8192) >> 14;
                                int var164 = this.field4662[var162] * var150[3] + this.field4706[var162] * var150[5] + this.field4642[var162] * var150[4] + 8192 >> 14;
                                int var165 = var155 + var164;
                                int var166 = var154 + var163;
                                int var167 = this.field4706[var162] * var150[8] + this.field4662[var162] * var150[6] + this.field4642[var162] * var150[7] + 8192 >> 14;
                                int var168 = var157 + var167;
                                this.field4662[var162] = var166;
                                this.field4642[var162] = var165;
                                this.field4706[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4653 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field4653.length > var181) {
                        int[] var182 = this.field4653[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field4667 == null || (arg6 & this.field4667[var184]) != 0) {
                                int var185 = (this.field4682[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field4682[var184] = (byte) var185;
                                if (this.field4721 != null) {
                                    this.field4721.field2125 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4760 != null) {
                    for (int var178 = 0; var178 < this.field4723; var178++) {
                        class785 var179 = this.field4760[var178];
                        class590 var180 = this.field4698[var178];
                        var180.field8319 = var180.field8319 & 0xFFFFFF | 255 - (this.field4682[var179.field10768] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4653 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field4653.length > var190) {
                        int[] var191 = this.field4653[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field4667 == null || (arg6 & this.field4667[var193]) != 0) {
                                int var194 = this.field4697[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                int var200 = arg4 + var199;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field4697[var193] = (short) class613.method3544(var200, class613.method3544(var197 << 10, var198 << 7));
                                if (this.field4721 != null) {
                                    this.field4721.field2125 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4760 != null) {
                    for (int var187 = 0; var187 < this.field4723; var187++) {
                        class785 var188 = this.field4760[var187];
                        class590 var189 = this.field4698[var187];
                        var189.field8319 = class109.field1323[this.field4697[var188.field10768] & 0xFFFF] & 0xFFFFFF | var189.field8319 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4701 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field4701.length) {
                        int[] var203 = this.field4701[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class590 var205 = this.field4698[var203[var204]];
                            var205.field8321 += arg3;
                            var205.field8324 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4701 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field4701.length > var207) {
                        int[] var208 = this.field4701[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class590 var210 = this.field4698[var208[var209]];
                            var210.field8315 = var210.field8315 * arg2 >> 7;
                            var210.field8313 = var210.field8313 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4701 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field4701.length > var212) {
                    int[] var213 = this.field4701[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class590 var215 = this.field4698[var213[var214]];
                        var215.field8316 = var215.field8316 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method1562(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4695++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class281.field4036 = 0;
            client.field1310 = 0;
            class553.field7658 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field4664.length) {
                    int[] var15 = this.field4664[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        client.field1310 += this.field4662[var17];
                        class553.field7658 += this.field4642[var17];
                        var12++;
                        class281.field4036 += this.field4706[var17];
                    }
                }
            }
            if (var12 <= 0) {
                client.field1310 = var9;
                class553.field7658 = var11;
                class281.field4036 = var10;
            } else {
                class553.field7658 = class553.field7658 / var12 + var11;
                client.field1310 = client.field1310 / var12 + var9;
                class281.field4036 = class281.field4036 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg4 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field4664.length > var22) {
                    int[] var23 = this.field4664[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field4662[var25] += var18;
                        this.field4642[var25] += var20;
                        this.field4706[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field4664.length > var45) {
                    int[] var46 = this.field4664[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field4662[var48] -= client.field1310;
                            this.field4642[var48] -= class553.field7658;
                            this.field4706[var48] -= class281.field4036;
                            if (arg4 != 0) {
                                int var49 = class448.field6265[arg4];
                                int var50 = class448.field6270[arg4];
                                int var51 = this.field4662[var48] * var50 + this.field4642[var48] * var49 + 16383 >> 14;
                                this.field4642[var48] = this.field4642[var48] * var50 + 16383 - (this.field4662[var48] * var49) >> 14;
                                this.field4662[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class448.field6265[arg2];
                                int var53 = class448.field6270[arg2];
                                int var54 = this.field4642[var48] * var53 + 16383 - this.field4706[var48] * var52 >> 14;
                                this.field4706[var48] = this.field4706[var48] * var53 + this.field4642[var48] * var52 + 16383 >> 14;
                                this.field4642[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class448.field6265[arg3];
                                int var56 = class448.field6270[arg3];
                                int var57 = this.field4706[var48] * var55 + this.field4662[var48] * var56 + 16383 >> 14;
                                this.field4706[var48] = this.field4706[var48] * var56 + 16383 - (this.field4662[var48] * var55) >> 14;
                                this.field4662[var48] = var57;
                            }
                            this.field4662[var48] += client.field1310;
                            this.field4642[var48] += class553.field7658;
                            this.field4706[var48] += class281.field4036;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field4662[var59] -= client.field1310;
                            this.field4642[var59] -= class553.field7658;
                            this.field4706[var59] -= class281.field4036;
                            if (arg2 != 0) {
                                int var60 = class448.field6265[arg2];
                                int var61 = class448.field6270[arg2];
                                int var62 = this.field4642[var59] * var61 + 16383 - (this.field4706[var59] * var60) >> 14;
                                this.field4706[var59] = this.field4706[var59] * var61 + this.field4642[var59] * var60 + 16383 >> 14;
                                this.field4642[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class448.field6265[arg4];
                                int var64 = class448.field6270[arg4];
                                int var65 = this.field4642[var59] * var63 + this.field4662[var59] * var64 + 16383 >> 14;
                                this.field4642[var59] = this.field4642[var59] * var64 - (this.field4662[var59] * var63 - 16383) >> 14;
                                this.field4662[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class448.field6265[arg3];
                                int var67 = class448.field6270[arg3];
                                int var68 = this.field4706[var59] * var66 - (-(this.field4662[var59] * var67) - 16383) >> 14;
                                this.field4706[var59] = this.field4706[var59] * var67 + 16383 - (this.field4662[var59] * var66) >> 14;
                                this.field4662[var59] = var68;
                            }
                            this.field4662[var59] += client.field1310;
                            this.field4642[var59] += class553.field7658;
                            this.field4706[var59] += class281.field4036;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field4664.length > var28) {
                        int[] var29 = this.field4664[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field4733[var31];
                            int var33 = this.field4733[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field4669[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class448.field6265[arg4];
                                    int var37 = class448.field6270[arg4];
                                    int var38 = this.field4690[var35] * var36 + (this.field4692[var35] * var37) + 16383 >> 14;
                                    this.field4690[var35] = (short) (this.field4690[var35] * var37 + 16383 - (this.field4692[var35] * var36) >> 14);
                                    this.field4692[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class448.field6265[arg2];
                                    int var40 = class448.field6270[arg2];
                                    int var41 = this.field4690[var35] * var40 - (this.field4716[var35] * var39 - 16383) >> 14;
                                    this.field4716[var35] = (short) (this.field4716[var35] * var40 + this.field4690[var35] * var39 + 16383 >> 14);
                                    this.field4690[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class448.field6265[arg3];
                                    int var43 = class448.field6270[arg3];
                                    int var44 = this.field4716[var35] * var42 + this.field4692[var35] * var43 + 16383 >> 14;
                                    this.field4716[var35] = (short) (this.field4716[var35] * var43 + 16383 - (this.field4692[var35] * var42) >> 14);
                                    this.field4692[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field4705 == null && this.field4721 != null) {
                    this.field4721.field2125 = null;
                }
                if (this.field4705 != null) {
                    this.field4705.field2125 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field4664.length) {
                    int[] var71 = this.field4664[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field4662[var73] -= client.field1310;
                        this.field4642[var73] -= class553.field7658;
                        this.field4706[var73] -= class281.field4036;
                        this.field4662[var73] = this.field4662[var73] * arg2 >> 7;
                        this.field4642[var73] = this.field4642[var73] * arg3 >> 7;
                        this.field4706[var73] = this.field4706[var73] * arg4 >> 7;
                        this.field4662[var73] += client.field1310;
                        this.field4642[var73] += class553.field7658;
                        this.field4706[var73] += class281.field4036;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4653 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field4653.length) {
                        int[] var79 = this.field4653[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field4682[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field4682[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field4721 != null) {
                            this.field4721.field2125 = null;
                        }
                    }
                }
                if (this.field4760 != null) {
                    for (int var75 = 0; var75 < this.field4723; var75++) {
                        class785 var76 = this.field4760[var75];
                        class590 var77 = this.field4698[var75];
                        var77.field8319 = var77.field8319 & 0xFFFFFF | 255 - (this.field4682[var76.field10768] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4653 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field4653.length > var87) {
                        int[] var88 = this.field4653[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field4697[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFEC4) >> 10;
                            int var93 = (var91 & 0x3A7) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field4697[var90] = (short) class613.method3544(var97, class613.method3544(var94 << 7, var95 << 10));
                        }
                        if (var88.length > 0 && this.field4721 != null) {
                            this.field4721.field2125 = null;
                        }
                    }
                }
                if (this.field4760 != null) {
                    for (int var84 = 0; var84 < this.field4723; var84++) {
                        class785 var85 = this.field4760[var84];
                        class590 var86 = this.field4698[var84];
                        var86.field8319 = var86.field8319 & 0xFF000000 | class109.field1323[this.field4697[var85.field10768] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4701 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field4701.length) {
                        int[] var100 = this.field4701[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class590 var102 = this.field4698[var100[var101]];
                            var102.field8321 += arg3;
                            var102.field8324 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4701 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field4701.length) {
                        int[] var105 = this.field4701[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class590 var107 = this.field4698[var105[var106]];
                            var107.field8315 = var107.field8315 * arg2 >> 7;
                            var107.field8313 = var107.field8313 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4701 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field4701.length > var109) {
                    int[] var110 = this.field4701[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class590 var112 = this.field4698[var110[var111]];
                        var112.field8316 = var112.field8316 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "HA", descriptor = "()I")
    public final int method1566() {
        field4740++;
        if (!this.field4736) {
            this.method2105(-121);
        }
        return this.field4708;
    }

    @OriginalMember(owner = "client!pr", name = "LA", descriptor = "(I)V")
    public final void method1545(int arg0) {
        this.field4757 = (short) arg0;
        field4742++;
        if (this.field4721 != null) {
            this.field4721.field2125 = null;
        }
        if (this.field4705 != null) {
            this.field4705.field2125 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "P", descriptor = "(IIII)V")
    public final void method1535(int arg0, int arg1, int arg2, int arg3) {
        field4666++;
        if (arg0 == 0) {
            int var5 = 0;
            class553.field7658 = 0;
            client.field1310 = 0;
            class281.field4036 = 0;
            for (int var6 = 0; var6 < this.field4674; var6++) {
                client.field1310 += this.field4662[var6];
                class553.field7658 += this.field4642[var6];
                var5++;
                class281.field4036 += this.field4706[var6];
            }
            if (var5 > 0) {
                class281.field4036 = class281.field4036 / var5 + arg3;
                class553.field7658 = class553.field7658 / var5 + arg2;
                client.field1310 = client.field1310 / var5 + arg1;
            } else {
                class281.field4036 = arg3;
                client.field1310 = arg1;
                class553.field7658 = arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4674; var7++) {
                this.field4662[var7] += arg1;
                this.field4642[var7] += arg2;
                this.field4706[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4674; var8++) {
                this.field4662[var8] -= client.field1310;
                this.field4642[var8] -= class553.field7658;
                this.field4706[var8] -= class281.field4036;
                if (arg3 != 0) {
                    int var9 = class448.field6265[arg3];
                    int var10 = class448.field6270[arg3];
                    int var11 = this.field4662[var8] * var10 + this.field4642[var8] * var9 + 16383 >> 14;
                    this.field4642[var8] = this.field4642[var8] * var10 + 16383 - (this.field4662[var8] * var9) >> 14;
                    this.field4662[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class448.field6265[arg1];
                    int var13 = class448.field6270[arg1];
                    int var14 = this.field4642[var8] * var13 + 16383 - (this.field4706[var8] * var12) >> 14;
                    this.field4706[var8] = this.field4706[var8] * var13 + (this.field4642[var8] * var12 + 16383) >> 14;
                    this.field4642[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class448.field6265[arg2];
                    int var16 = class448.field6270[arg2];
                    int var17 = this.field4706[var8] * var15 + this.field4662[var8] * var16 + 16383 >> 14;
                    this.field4706[var8] = this.field4706[var8] * var16 - (this.field4662[var8] * var15 - 16383) >> 14;
                    this.field4662[var8] = var17;
                }
                this.field4662[var8] += client.field1310;
                this.field4642[var8] += class553.field7658;
                this.field4706[var8] += class281.field4036;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4674; var18++) {
                this.field4662[var18] -= client.field1310;
                this.field4642[var18] -= class553.field7658;
                this.field4706[var18] -= class281.field4036;
                this.field4662[var18] = this.field4662[var18] * arg1 / 128;
                this.field4642[var18] = this.field4642[var18] * arg2 / 128;
                this.field4706[var18] = this.field4706[var18] * arg3 / 128;
                this.field4662[var18] += client.field1310;
                this.field4642[var18] += class553.field7658;
                this.field4706[var18] += class281.field4036;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field4661; var19++) {
                int var23 = (this.field4682[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field4682[var19] = (byte) var23;
            }
            if (this.field4721 != null) {
                this.field4721.field2125 = null;
            }
            if (this.field4760 != null) {
                for (int var20 = 0; var20 < this.field4723; var20++) {
                    class785 var21 = this.field4760[var20];
                    class590 var22 = this.field4698[var20];
                    var22.field8319 = 255 - (this.field4682[var21.field10768] & 0xFF) << 24 | var22.field8319 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field4661; var24++) {
                int var28 = this.field4697[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x38D) >> 7;
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
                this.field4697[var24] = (short) class613.method3544(class613.method3544(var31 << 10, var33 << 7), var34);
            }
            if (this.field4721 != null) {
                this.field4721.field2125 = null;
            }
            if (this.field4760 != null) {
                for (int var25 = 0; var25 < this.field4723; var25++) {
                    class785 var26 = this.field4760[var25];
                    class590 var27 = this.field4698[var25];
                    var27.field8319 = class109.field1323[this.field4697[var26.field10768] & 0xFFFF] & 0xFFFFFF | var27.field8319 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field4723; var35++) {
                class590 var36 = this.field4698[var35];
                var36.field8324 += arg1;
                var36.field8321 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field4723; var37++) {
                class590 var38 = this.field4698[var37];
                var38.field8313 = var38.field8313 * arg2 >> 7;
                var38.field8315 = var38.field8315 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field4723; var39++) {
                class590 var40 = this.field4698[var39];
                var40.field8316 = var40.field8316 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "(I)V")
    public final void method1548(int arg0) {
        this.field4751 = arg0;
        field4715++;
        if (this.field4651 != null && (this.field4751 & 0x10000) == 0) {
            this.field4692 = this.field4651.field3968;
            this.field4716 = this.field4651.field3975;
            this.field4690 = this.field4651.field3977;
            this.field4750 = this.field4651.field3973;
            this.field4651 = null;
        }
        this.field4700 = true;
        this.method2116(2048);
    }

    @OriginalMember(owner = "client!pr", name = "ma", descriptor = "()I")
    public final int method1539() {
        field4641++;
        if (!this.field4736) {
            this.method2105(-125);
        }
        return this.field4725;
    }

    @OriginalMember(owner = "client!pr", name = "NA", descriptor = "()Z")
    public final boolean method1549() {
        field4675++;
        if (this.field4664 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field4729; var1++) {
            this.field4662[var1] <<= 0x4;
            this.field4642[var1] <<= 0x4;
            this.field4706[var1] <<= 0x4;
        }
        client.field1310 = 0;
        class553.field7658 = 0;
        class281.field4036 = 0;
        return true;
    }

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method1561(int arg0, int arg1, class418 arg2, class418 arg3, int arg4, int arg5, int arg6) {
        field4758++;
        if (!this.field4736) {
            this.method2105(-124);
        }
        int var8 = this.field4647 + arg4;
        int var9 = this.field4659 + arg4;
        int var10 = this.field4708 + arg6;
        int var11 = this.field4658 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || var9 + arg2.field5818 >> arg2.field5825 >= arg2.field5827 || var10 < 0 || arg2.field5818 + var11 >> arg2.field5825 >= arg2.field5826) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field5827 <= (var9 + arg3.field5818 >> arg3.field5825) || var10 < 0 || arg3.field5826 <= var11 + arg3.field5818 >> arg3.field5825) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field5825;
            int var13 = var9 + arg2.field5818 - 1 >> arg2.field5825;
            int var14 = var10 >> arg2.field5825;
            int var15 = -(-arg2.field5818 - var11) - 1 >> arg2.field5825;
            if (arg2.method2525(var12, var14, (byte) 114) == arg5 && arg2.method2525(var13, var14, (byte) 114) == arg5 && arg5 == arg2.method2525(var12, var15, (byte) 114) && arg2.method2525(var13, var15, (byte) 114) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field4674; var16++) {
                this.field4642[var16] = this.field4642[var16] + arg2.method2529(this.field4706[var16] - -arg6, this.field4662[var16] - -arg4, (byte) -128) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field4645;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field4674; var18++) {
                int var19 = (this.field4642[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field4642[var18] += (arg2.method2529(this.field4706[var18] + arg6, this.field4662[var18] - -arg4, (byte) -128) - arg5) * (arg1 - var19) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = ((arg1 & 0xFF30) >> 8) * 4;
            int var22 = arg1 >> 16 & 0xFF << 6;
            int var23 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var20 >> 1)) < 0 || (var20 >> 1) + arg4 + arg2.field5818 >= arg2.field5827 << arg2.field5825 || arg6 - (var21 >> 1) < 0 || ((var21 >> 1) + (arg6 + arg2.field5818)) >= (arg2.field5826 << arg2.field5825)) {
                return;
            }
            this.method1585(arg4, (byte) 17, arg5, arg2, var23, var22, arg6, var20, var21);
        } else if (arg0 == 4) {
            int var24 = this.field4745 - this.field4645;
            for (int var25 = 0; var25 < this.field4674; var25++) {
                this.field4642[var25] = this.field4642[var25] + var24 + arg3.method2529(this.field4706[var25] - -arg6, this.field4662[var25] + arg4, (byte) -128) - arg5;
            }
        } else if (arg0 == 5) {
            int var26 = this.field4745 - this.field4645;
            for (int var27 = 0; var27 < this.field4674; var27++) {
                int var28 = this.field4662[var27] + arg4;
                int var29 = this.field4706[var27] + arg6;
                int var30 = arg2.method2529(var29, var28, (byte) -128);
                int var31 = arg3.method2529(var29, var28, (byte) -128);
                int var32 = var30 - arg1 - var31;
                this.field4642[var27] = ((this.field4642[var27] << 8) / var26 * var32 >> 8) - (arg5 - var30);
            }
        }
        this.field4736 = false;
        if (this.field4717 != null) {
            this.field4717.field2125 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "ia", descriptor = "(SS)V")
    public final void method1552(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4661; var3++) {
            if (this.field4697[var3] == arg0) {
                this.field4697[var3] = arg1;
            }
        }
        field4704++;
        if (this.field4760 != null) {
            for (int var4 = 0; var4 < this.field4723; var4++) {
                class785 var5 = this.field4760[var4];
                class590 var6 = this.field4698[var4];
                var6.field8319 = var6.field8319 & 0xFF000000 | class109.field1323[this.field4697[var5.field10768] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field4721 != null) {
            this.field4721.field2125 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "aa", descriptor = "(SS)V")
    public final void method1557(short arg0, short arg1) {
        field4657++;
        class101 var3 = this.field4754.field6556;
        for (int var4 = 0; var4 < this.field4661; var4++) {
            if (this.field4648[var4] == arg0) {
                this.field4648[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class744 var7 = var3.method581(-21732, arg0 & 0xFFFF);
            var6 = var7.field10262;
            var5 = var7.field10269;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class744 var10 = var3.method581(-21732, arg1 & 0xFFFF);
            if (var10.field10259 != 0 || var10.field10268 != 0) {
                this.field4694 = true;
            }
            var8 = var10.field10269;
            var9 = var10.field10262;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field4760 != null) {
            for (int var11 = 0; var11 < this.field4723; var11++) {
                class785 var12 = this.field4760[var11];
                class590 var13 = this.field4698[var11];
                var13.field8319 = class109.field1323[this.field4697[var12.field10768] & 0xFFFF] & 0xFFFFFF | var13.field8319 & 0xFF000000;
            }
        }
        if (this.field4721 != null) {
            this.field4721.field2125 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "(I)V")
    public final void method1573(int arg0) {
        if (this.field4721 != null) {
            this.field4721.field2125 = null;
        }
        this.field4688 = (short) arg0;
        field4709++;
    }

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "()V")
    public final void method1591() {
        field4649++;
    }

    @OriginalMember(owner = "client!pr", name = "H", descriptor = "(III)V")
    public final void method1565(int arg0, int arg1, int arg2) {
        field4703++;
        for (int var4 = 0; var4 < this.field4674; var4++) {
            if (arg0 != 0) {
                this.field4662[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field4642[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field4706[var4] += arg2;
            }
        }
        if (this.field4717 != null) {
            this.field4717.field2125 = null;
        }
        this.field4736 = false;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZIILoo;II)Z")
    private final boolean method2106(int arg0, boolean arg1, int arg2, int arg3, class12 arg4, int arg5, int arg6) {
        field4748++;
        class35 var8 = (class35) arg4;
        class35 var9 = this.field4754.field2636;
        float var10 = var8.field366 * var9.field372 + var8.field357 * var9.field370 + var8.field351 * var9.field337 + var9.field351;
        float var11 = var8.field366 * var9.field356 + var8.field357 * var9.field373 + var8.field351 * var9.field347 + var9.field357;
        class84.field1024 = var8.field355 * var9.field372 + var8.field372 * var9.field337 + var8.field356 * var9.field370;
        class265.field3861 = var8.field365 * var9.field355 + var8.field373 * var9.field365 + var8.field370 * var9.field334;
        class455.field6368 = var8.field334 * var9.field356 + var8.field347 * var9.field373 + var8.field337 * var9.field347;
        class432.field6013 = var8.field355 * var9.field355 + var8.field372 * var9.field334 + var8.field356 * var9.field365;
        float var12 = var8.field366 * var9.field355 + var8.field357 * var9.field365 + var8.field351 * var9.field334 + var9.field366;
        class138.field1769 = var8.field365 * var9.field356 + var8.field373 * var9.field373 + var8.field370 * var9.field347;
        class170.field2158 = var8.field334 * var9.field372 + var8.field347 * var9.field370 + var8.field337 * var9.field337;
        class678.field9486 = var8.field334 * var9.field355 + var8.field347 * var9.field365 + var8.field337 * var9.field334;
        field4677 = var8.field355 * var9.field356 + var8.field372 * var9.field347 + var8.field356 * var9.field373;
        class109.field1318 = var8.field365 * var9.field372 + var8.field373 * var9.field370 + var8.field370 * var9.field337;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field4754.field2696;
        int var19 = this.field4754.field2676;
        if (!this.field4736) {
            this.method2105(arg6 ^ 0x81EAED60);
        }
        int var20 = this.field4659 - this.field4647 >> 1;
        int var21 = this.field4745 - this.field4645 >> 1;
        int var22 = this.field4658 - this.field4708 >> 1;
        int var23 = this.field4647 + var20;
        int var24 = this.field4645 + var21;
        int var25 = this.field4708 + var22;
        int var26 = var23 - (var20 << arg0);
        int var27 = var24 - (var21 << arg0);
        int var28 = var25 - (var22 << arg0);
        int var29 = (var20 << arg0) + var23;
        int var30 = (var21 << arg0) + var24;
        int var31 = var25 + (var22 << arg0);
        class516.field7085[0] = var26;
        class61.field697[0] = var27;
        class516.field7085[1] = var29;
        class204.field2848[0] = var28;
        class61.field697[1] = var27;
        class516.field7085[2] = var26;
        class204.field2848[1] = var28;
        class61.field697[2] = var30;
        class516.field7085[3] = var29;
        class204.field2848[2] = var28;
        class61.field697[3] = var30;
        class516.field7085[4] = var26;
        class204.field2848[3] = var28;
        class61.field697[4] = var27;
        class516.field7085[5] = var29;
        if (arg6 != 2115310305) {
            return true;
        }
        class204.field2848[4] = var31;
        class61.field697[5] = var27;
        class204.field2848[5] = var31;
        class516.field7085[6] = var26;
        class61.field697[6] = var30;
        class516.field7085[7] = var29;
        class204.field2848[6] = var31;
        class61.field697[7] = var30;
        class204.field2848[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class204.field2848[var32];
            float var54 = (float) class61.field697[var32];
            float var55 = (float) class516.field7085[var32];
            float var56 = class84.field1024 * var53 + class170.field2158 * var55 + class109.field1318 * var54 + var10;
            float var57 = class432.field6013 * var53 + class678.field9486 * var55 + class265.field3861 * var54 + var12;
            float var58 = field4677 * var53 + class455.field6368 * var55 + class138.field1769 * var54 + var11;
            if (var57 >= (float) this.field4754.field2731) {
                if (arg2 > 0) {
                    var57 = arg2;
                }
                float var59 = (float) var18 * var56 / var57 + (float) this.field4754.field2693;
                if (var14 > var59) {
                    var14 = var59;
                }
                float var60 = (float) var19 * var58 / var57 + (float) this.field4754.field2656;
                if (var15 < var59) {
                    var15 = var59;
                }
                var13 = true;
                if (var17 < var60) {
                    var17 = var60;
                }
                if (var16 > var60) {
                    var16 = var60;
                }
            }
        }
        if (var13 && var14 < (float) arg3 && var15 > (float) arg3 && var16 < (float) arg5 && (float) arg5 < var17) {
            if (arg1) {
                return true;
            }
            if (this.field4754.field2759.length < this.field4712) {
                this.field4754.field2759 = new int[this.field4712];
                this.field4754.field2762 = new int[this.field4712];
            }
            int[] var33 = this.field4754.field2759;
            int[] var34 = this.field4754.field2762;
            for (int var35 = 0; var35 < this.field4674; var35++) {
                float var37 = (float) this.field4662[var35];
                float var38 = (float) this.field4642[var35];
                float var39 = (float) this.field4706[var35];
                float var40 = class432.field6013 * var39 + class678.field9486 * var37 + class265.field3861 * var38 + var12;
                float var41 = class84.field1024 * var39 + class170.field2158 * var37 + class109.field1318 * var38 + var10;
                float var42 = field4677 * var39 + class455.field6368 * var37 + class138.field1769 * var38 + var11;
                if (((float) this.field4754.field2731 <= var40)) {
                    if (arg2 > 0) {
                        var40 = arg2;
                    }
                    int var47 = (int) ((float) var18 * var41 / var40 + (float) this.field4754.field2693);
                    int var48 = (int) ((float) var19 * var42 / var40 + (float) this.field4754.field2656);
                    int var49 = this.field4733[var35];
                    int var50 = this.field4733[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field4669[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[var52] = var47;
                        var34[var52] = var48;
                    }
                } else {
                    int var43 = this.field4733[var35];
                    int var44 = this.field4733[var35 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field4669[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        var33[this.field4669[var45] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field4661; var36++) {
                if (var33[this.field4655[var36]] != -999999 && var33[this.field4746[var36]] != -999999 && var33[this.field4711[var36]] != -999999 && this.method2113(var34[this.field4711[var36]], var34[this.field4655[var36]], var33[this.field4655[var36]], var33[this.field4746[var36]], (byte) -119, arg3, var33[this.field4711[var36]], var34[this.field4746[var36]], arg5)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "()[Lmb;")
    public final class426[] method1543() {
        field4714++;
        return this.field4696;
    }

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "(I)V")
    public final void method1588(int arg0) {
        field4671++;
        int var2 = class448.field6265[arg0];
        int var3 = class448.field6270[arg0];
        for (int var4 = 0; var4 < this.field4674; var4++) {
            int var7 = this.field4706[var4] * var2 + this.field4662[var4] * var3 >> 14;
            this.field4706[var4] = this.field4706[var4] * var3 - this.field4662[var4] * var2 >> 14;
            this.field4662[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field4712; var5++) {
            int var6 = this.field4716[var5] * var2 + this.field4692[var5] * var3 >> 14;
            this.field4716[var5] = (short) (this.field4716[var5] * var3 - (this.field4692[var5] * var2) >> 14);
            this.field4692[var5] = (short) var6;
        }
        if (this.field4705 == null && this.field4721 != null) {
            this.field4721.field2125 = null;
        }
        if (this.field4705 != null) {
            this.field4705.field2125 = null;
        }
        if (this.field4717 != null) {
            this.field4717.field2125 = null;
        }
        this.field4736 = false;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Loo;Lea;I)V")
    public final void method1586(class12 arg0, class21 arg1, int arg2) {
        field4681++;
        if (this.field4712 == 0) {
            return;
        }
        class35 var4 = this.field4754.field2636;
        class35 var5 = (class35) arg0;
        if (!this.field4736) {
            this.method2105(-126);
        }
        class265.field3861 = var4.field355 * var5.field365 + var4.field365 * var5.field373 + var4.field334 * var5.field370;
        class725.field10034 = var4.field355 * var5.field366 + var4.field365 * var5.field357 + var4.field334 * var5.field351 + var4.field366;
        float var6 = (float) this.field4645 * class265.field3861 + class725.field10034;
        float var7 = (float) this.field4745 * class265.field3861 + class725.field10034;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) (-this.field4744) + var7;
            var8 = (float) this.field4744 + var6;
        } else {
            var8 = (float) this.field4744 + var7;
            var9 = var6 - (float) this.field4744;
        }
        if ((var9 >= this.field4754.field2723) || ((float) this.field4754.field2731 >= var8)) {
            return;
        }
        class341.field4949 = var4.field372 * var5.field366 + var4.field370 * var5.field357 + var4.field337 * var5.field351 + var4.field351;
        class109.field1318 = var4.field372 * var5.field365 + var4.field370 * var5.field373 + var4.field337 * var5.field370;
        float var10 = (float) this.field4645 * class109.field1318 + class341.field4949;
        float var11 = (float) this.field4745 * class109.field1318 + class341.field4949;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) this.field4744 + var10) * (float) this.field4754.field2696;
            var13 = (var11 - (float) this.field4744) * (float) this.field4754.field2696;
        } else {
            var12 = ((float) this.field4744 + var11) * (float) this.field4754.field2696;
            var13 = (var10 - (float) this.field4744) * (float) this.field4754.field2696;
        }
        if ((var13 / var8 >= this.field4754.field2713) || (var12 / var8 <= this.field4754.field2647)) {
            return;
        }
        class248.field3696 = var4.field356 * var5.field366 + var4.field373 * var5.field357 + var4.field347 * var5.field351 + var4.field357;
        class138.field1769 = var4.field356 * var5.field365 + var4.field373 * var5.field373 + var4.field347 * var5.field370;
        float var14 = (float) this.field4645 * class138.field1769 + class248.field3696;
        float var15 = (float) this.field4745 * class138.field1769 + class248.field3696;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var16 = ((float) this.field4744 + var14) * (float) this.field4754.field2676;
            var17 = ((float) (-this.field4744) + var15) * (float) this.field4754.field2676;
        } else {
            var16 = ((float) this.field4744 + var15) * (float) this.field4754.field2676;
            var17 = (var14 - (float) this.field4744) * (float) this.field4754.field2676;
        }
        if ((this.field4754.field2702 <= var17 / var8) || (this.field4754.field2664 >= var16 / var8)) {
            return;
        }
        if (arg1 != null || this.field4760 != null) {
            class678.field9486 = var4.field355 * var5.field334 + var4.field365 * var5.field347 + var4.field334 * var5.field337;
            class170.field2158 = var4.field372 * var5.field334 + var4.field370 * var5.field347 + var4.field337 * var5.field337;
            class84.field1024 = var4.field372 * var5.field355 + var4.field370 * var5.field356 + var4.field337 * var5.field372;
            class455.field6368 = var4.field356 * var5.field334 + var4.field373 * var5.field347 + var4.field347 * var5.field337;
            class432.field6013 = var4.field355 * var5.field355 + var4.field365 * var5.field356 + var4.field334 * var5.field372;
            field4677 = var4.field356 * var5.field355 + var4.field373 * var5.field356 + var4.field347 * var5.field372;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field4659 + this.field4647 >> 1;
            int var21 = this.field4708 + this.field4658 >> 1;
            int var22 = (int) ((float) var21 * class84.field1024 + (float) this.field4645 * class109.field1318 + (float) var20 * class170.field2158 + class341.field4949);
            int var23 = (int) ((float) var21 * field4677 + (float) this.field4645 * class138.field1769 + (float) var20 * class455.field6368 + class248.field3696);
            int var24 = (int) ((float) var21 * class432.field6013 + (float) this.field4645 * class265.field3861 + (float) var20 * class678.field9486 + class725.field10034);
            if (var24 >= this.field4754.field2731) {
                arg1.field184 = this.field4754.field2656 + (this.field4754.field2676 * var23 / var24);
                arg1.field179 = this.field4754.field2696 * var22 / var24 + this.field4754.field2693;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class84.field1024 + (float) this.field4745 * class109.field1318 + (float) var20 * class170.field2158 + class341.field4949);
            int var26 = (int) ((float) var21 * field4677 + (float) this.field4745 * class138.field1769 + (float) var20 * class455.field6368 + class248.field3696);
            int var27 = (int) ((float) var21 * class432.field6013 + (float) this.field4745 * class265.field3861 + (float) var20 * class678.field9486 + class725.field10034);
            if (var27 >= this.field4754.field2731) {
                arg1.field181 = this.field4754.field2696 * var25 / var27 + this.field4754.field2693;
                arg1.field182 = this.field4754.field2676 * var26 / var27 + this.field4754.field2656;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field4754.field2731 > var24 && var27 < this.field4754.field2731) {
                    var19 = false;
                } else if (this.field4754.field2731 > var24) {
                    int var31 = (var27 - this.field4754.field2731 << 16) / (var27 - var24);
                    int var32 = var25 + ((var25 - var22) * var31 >> 16);
                    arg1.field179 = this.field4754.field2693 + (this.field4754.field2696 * var32 / this.field4754.field2731);
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field184 = this.field4754.field2656 + (this.field4754.field2676 * var33 / this.field4754.field2731);
                } else if (this.field4754.field2731 > var27) {
                    int var28 = (var24 - this.field4754.field2731 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field179 = this.field4754.field2696 * var29 / this.field4754.field2731 + this.field4754.field2693;
                    arg1.field184 = this.field4754.field2676 * var30 / this.field4754.field2731 + this.field4754.field2656;
                }
            }
            if (var19) {
                if (var24 > var27) {
                    arg1.field183 = (this.field4744 + var22) * this.field4754.field2696 / var24 + this.field4754.field2693 - arg1.field179;
                } else {
                    arg1.field183 = (this.field4744 + var25) * this.field4754.field2696 / var27 + this.field4754.field2693 - arg1.field181;
                }
                arg1.field180 = true;
            }
        }
        this.field4754.method1237(true);
        this.field4754.method1210(0, var5);
        this.method2114(false);
        this.field4754.method1246(37);
        this.method2115(0);
    }

    @OriginalMember(owner = "client!pr", name = "V", descriptor = "()I")
    public final int method1544() {
        if (!this.field4736) {
            this.method2105(-122);
        }
        field4673++;
        return this.field4647;
    }

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "()Z")
    public final boolean method1563() {
        field4685++;
        return this.field4694;
    }

    @OriginalMember(owner = "client!pr", name = "FA", descriptor = "(I)V")
    public final void method1569(int arg0) {
        field4739++;
        int var2 = class448.field6265[arg0];
        int var3 = class448.field6270[arg0];
        for (int var4 = 0; var4 < this.field4674; var4++) {
            int var5 = this.field4642[var4] * var3 - (this.field4706[var4] * var2) >> 14;
            this.field4706[var4] = this.field4706[var4] * var3 + this.field4642[var4] * var2 >> 14;
            this.field4642[var4] = var5;
        }
        if (this.field4717 != null) {
            this.field4717.field2125 = null;
        }
        this.field4736 = false;
    }

    @OriginalMember(owner = "client!pr", name = "RA", descriptor = "()I")
    public final int method1583() {
        field4646++;
        if (!this.field4736) {
            this.method2105(-121);
        }
        return this.field4659;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BIZ)Lka;")
    public final class231 method1584(byte arg0, int arg1, boolean arg2) {
        field4722++;
        class332 var4;
        class332 var5;
        if (arg0 == 1) {
            var4 = this.field4754.field2674;
            var5 = this.field4754.field2662;
        } else if (arg0 == 2) {
            var4 = this.field4754.field2714;
            var5 = this.field4754.field2684;
        } else if (arg0 == 3) {
            var4 = this.field4754.field2742;
            var5 = this.field4754.field2755;
        } else if (arg0 == 4) {
            var4 = this.field4754.field2700;
            var5 = this.field4754.field2724;
        } else if (arg0 == 5) {
            var5 = this.field4754.field2654;
            var4 = this.field4754.field2690;
        } else {
            var5 = var4 = new class332(this.field4754);
        }
        return this.method2109((byte) 17, arg0 != 0, arg1, arg2, var5, var4);
    }

    @OriginalMember(owner = "client!pr", name = "O", descriptor = "(III)V")
    public final void method1550(int arg0, int arg1, int arg2) {
        field4676++;
        for (int var4 = 0; var4 < this.field4674; var4++) {
            if (arg0 != 128) {
                this.field4662[var4] = this.field4662[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field4642[var4] = this.field4642[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field4706[var4] = this.field4706[var4] * arg2 >> 7;
            }
        }
        this.field4736 = false;
        if (this.field4717 != null) {
            this.field4717.field2125 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BJ)I")
    public static final int method2107(byte arg0, long arg1) {
        if (arg0 > -96) {
            return -7;
        } else {
            field4670++;
            return (int) (arg1 / 86400000L) - 11745;
        }
    }

    @OriginalMember(owner = "client!pr", name = "na", descriptor = "()I")
    public final int method1577() {
        field4640++;
        if (!this.field4736) {
            this.method2105(-122);
        }
        return this.field4744;
    }

    @OriginalMember(owner = "client!pr", name = "G", descriptor = "()I")
    public final int method1537() {
        field4668++;
        if (!this.field4736) {
            this.method2105(-125);
        }
        return this.field4658;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(SBZII)I")
    private final int method2108(short arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            return -117;
        }
        field4727++;
        int var6 = class109.field1323[class595.method3472(10, arg4, arg3)];
        if (arg0 != -1) {
            class744 var7 = this.field4754.field6556.method581(-21732, arg0 & 0xFFFF);
            int var8 = var7.field10269 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg4 < 0) {
                    var9 = 0;
                } else if (arg4 <= 127) {
                    var9 = arg4 * 131586;
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
            int var12 = var7.field10262 & 0xFF;
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
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF0052) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) - ((arg1 & 0xFF) - 255);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BZIZLpr;Lpr;)Lka;")
    private final class231 method2109(byte arg0, boolean arg1, int arg2, boolean arg3, class332 arg4, class332 arg5) {
        arg4.field4751 = arg2;
        arg4.field4737 = 0;
        field4660++;
        arg4.field4688 = this.field4688;
        arg4.field4729 = this.field4729;
        arg4.field4723 = this.field4723;
        arg4.field4753 = this.field4753;
        arg4.field4661 = this.field4661;
        if ((arg2 & 0x100) == 0) {
            arg4.field4755 = this.field4755;
        } else {
            arg4.field4755 = true;
        }
        arg4.field4694 = this.field4694;
        arg4.field4712 = this.field4712;
        arg4.field4757 = this.field4757;
        arg4.field4691 = this.field4691;
        arg4.field4674 = this.field4674;
        boolean var7 = class372.method2312(arg2, this.field4753, arg0 ^ 0x30);
        boolean var8 = class346.method2189(0, arg2, this.field4753);
        boolean var9 = class330.method2078(-66, arg2, this.field4753);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg4.field4662 = this.field4662;
            } else if (arg5.field4662 == null || arg5.field4662.length < this.field4729) {
                arg4.field4662 = arg5.field4662 = new int[this.field4729];
            } else {
                arg4.field4662 = arg5.field4662;
            }
            if (!var8) {
                arg4.field4642 = this.field4642;
            } else if (arg5.field4642 == null || this.field4729 > arg5.field4642.length) {
                arg4.field4642 = arg5.field4642 = new int[this.field4729];
            } else {
                arg4.field4642 = arg5.field4642;
            }
            if (!var9) {
                arg4.field4706 = this.field4706;
            } else if (arg5.field4706 == null || arg5.field4706.length < this.field4729) {
                arg4.field4706 = arg5.field4706 = new int[this.field4729];
            } else {
                arg4.field4706 = arg5.field4706;
            }
            for (int var11 = 0; var11 < this.field4729; var11++) {
                if (var7) {
                    arg4.field4662[var11] = this.field4662[var11];
                }
                if (var8) {
                    arg4.field4642[var11] = this.field4642[var11];
                }
                if (var9) {
                    arg4.field4706[var11] = this.field4706[var11];
                }
            }
        } else {
            arg4.field4662 = this.field4662;
            arg4.field4706 = this.field4706;
            arg4.field4642 = this.field4642;
        }
        if (class43.method345(this.field4753, arg2, 1024)) {
            if (arg1) {
                arg4.field4737 = (byte) (arg4.field4737 | 0x1);
            }
            arg4.field4717 = arg5.field4717;
            arg4.field4717.field2122 = this.field4717.field2122;
            arg4.field4717.field2125 = this.field4717.field2125;
        } else if (class458.method2756((byte) 53, arg2, this.field4753)) {
            arg4.field4717 = this.field4717;
        } else {
            arg4.field4717 = null;
        }
        if (class140.method930(arg2, this.field4753, -20667)) {
            if (arg5.field4697 == null || arg5.field4697.length < this.field4661) {
                arg4.field4697 = arg5.field4697 = new short[this.field4661];
            } else {
                arg4.field4697 = arg5.field4697;
            }
            for (int var12 = 0; var12 < this.field4661; var12++) {
                arg4.field4697[var12] = this.field4697[var12];
            }
        } else {
            arg4.field4697 = this.field4697;
        }
        if (class165.method1043((byte) -86, arg2, this.field4753)) {
            if (arg5.field4682 == null || arg5.field4682.length < this.field4661) {
                arg4.field4682 = arg5.field4682 = new byte[this.field4661];
            } else {
                arg4.field4682 = arg5.field4682;
            }
            for (int var13 = 0; var13 < this.field4661; var13++) {
                arg4.field4682[var13] = this.field4682[var13];
            }
        } else {
            arg4.field4682 = this.field4682;
        }
        if (class403.method2473(arg2, this.field4753, 0)) {
            if (arg1) {
                arg4.field4737 = (byte) (arg4.field4737 | 0x2);
            }
            arg4.field4721 = arg5.field4721;
            arg4.field4721.field2125 = this.field4721.field2125;
            arg4.field4721.field2122 = this.field4721.field2122;
        } else if (class705.method3977(arg2, this.field4753, 0)) {
            arg4.field4721 = this.field4721;
        } else {
            arg4.field4721 = null;
        }
        if (class455.method2739(false, arg2, this.field4753)) {
            if (arg5.field4692 == null || arg5.field4692.length < this.field4712) {
                int var14 = this.field4712;
                arg4.field4716 = arg5.field4716 = new short[var14];
                arg4.field4692 = arg5.field4692 = new short[var14];
                arg4.field4690 = arg5.field4690 = new short[var14];
            } else {
                arg4.field4716 = arg5.field4716;
                arg4.field4692 = arg5.field4692;
                arg4.field4690 = arg5.field4690;
            }
            if (this.field4651 == null) {
                for (int var18 = 0; var18 < this.field4712; var18++) {
                    arg4.field4692[var18] = this.field4692[var18];
                    arg4.field4690[var18] = this.field4690[var18];
                    arg4.field4716[var18] = this.field4716[var18];
                }
            } else {
                if (arg5.field4651 == null) {
                    arg5.field4651 = new class275();
                }
                class275 var15 = arg4.field4651 = arg5.field4651;
                if (var15.field3968 == null || var15.field3968.length < this.field4712) {
                    int var16 = this.field4712;
                    var15.field3975 = new short[var16];
                    var15.field3968 = new short[var16];
                    var15.field3973 = new byte[var16];
                    var15.field3977 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field4712; var17++) {
                    arg4.field4692[var17] = this.field4692[var17];
                    arg4.field4690[var17] = this.field4690[var17];
                    arg4.field4716[var17] = this.field4716[var17];
                    var15.field3968[var17] = this.field4651.field3968[var17];
                    var15.field3977[var17] = this.field4651.field3977[var17];
                    var15.field3975[var17] = this.field4651.field3975[var17];
                    var15.field3973[var17] = this.field4651.field3973[var17];
                }
            }
            arg4.field4750 = this.field4750;
        } else {
            arg4.field4716 = this.field4716;
            arg4.field4651 = this.field4651;
            arg4.field4750 = this.field4750;
            arg4.field4690 = this.field4690;
            arg4.field4692 = this.field4692;
        }
        if (class119.method852(arg0 ^ 0x7C, arg2, this.field4753)) {
            if (arg1) {
                arg4.field4737 = (byte) (arg4.field4737 | 0x4);
            }
            arg4.field4705 = arg5.field4705;
            arg4.field4705.field2125 = this.field4705.field2125;
            arg4.field4705.field2122 = this.field4705.field2122;
        } else if (class341.method2165(this.field4753, arg2, (byte) -21)) {
            arg4.field4705 = this.field4705;
        } else {
            arg4.field4705 = null;
        }
        if (class571.method3358(256, arg2, this.field4753)) {
            if (arg5.field4680 == null || this.field4661 > arg5.field4680.length) {
                int var19 = this.field4712;
                arg4.field4680 = arg5.field4680 = new float[var19];
                arg4.field4734 = arg5.field4734 = new float[var19];
            } else {
                arg4.field4734 = arg5.field4734;
                arg4.field4680 = arg5.field4680;
            }
            for (int var20 = 0; var20 < this.field4712; var20++) {
                arg4.field4680[var20] = this.field4680[var20];
                arg4.field4734[var20] = this.field4734[var20];
            }
        } else {
            arg4.field4680 = this.field4680;
            arg4.field4734 = this.field4734;
        }
        if (class590.method3454(arg2, -49, this.field4753)) {
            if (arg1) {
                arg4.field4737 = (byte) (arg4.field4737 | 0x8);
            }
            arg4.field4741 = arg5.field4741;
            arg4.field4741.field2125 = this.field4741.field2125;
            arg4.field4741.field2122 = this.field4741.field2122;
        } else if (class664.method3786(this.field4753, (byte) -6, arg2)) {
            arg4.field4741 = this.field4741;
        } else {
            arg4.field4741 = null;
        }
        if (class195.method1277(-24149, arg2, this.field4753)) {
            if (arg5.field4655 == null || this.field4661 > arg5.field4655.length) {
                int var21 = this.field4661;
                arg4.field4655 = arg5.field4655 = new short[var21];
                arg4.field4746 = arg5.field4746 = new short[var21];
                arg4.field4711 = arg5.field4711 = new short[var21];
            } else {
                arg4.field4655 = arg5.field4655;
                arg4.field4746 = arg5.field4746;
                arg4.field4711 = arg5.field4711;
            }
            for (int var22 = 0; var22 < this.field4661; var22++) {
                arg4.field4655[var22] = this.field4655[var22];
                arg4.field4746[var22] = this.field4746[var22];
                arg4.field4711[var22] = this.field4711[var22];
            }
        } else {
            arg4.field4746 = this.field4746;
            arg4.field4711 = this.field4711;
            arg4.field4655 = this.field4655;
        }
        if (class558.method3282(this.field4753, (byte) 9, arg2)) {
            if (arg1) {
                arg4.field4737 = (byte) (arg4.field4737 | 0x10);
            }
            arg4.field4735 = arg5.field4735;
            arg4.field4735.field1360 = this.field4735.field1360;
        } else if (class83.method634(arg2, this.field4753, -85)) {
            arg4.field4735 = this.field4735;
        } else {
            arg4.field4735 = null;
        }
        if (class135.method906(this.field4753, arg2, -106)) {
            if (arg5.field4648 == null || arg5.field4648.length < this.field4661) {
                int var23 = this.field4661;
                arg4.field4648 = arg5.field4648 = new short[var23];
            } else {
                arg4.field4648 = arg5.field4648;
            }
            for (int var24 = 0; var24 < this.field4661; var24++) {
                arg4.field4648[var24] = this.field4648[var24];
            }
        } else {
            arg4.field4648 = this.field4648;
        }
        if (!class544.method3222(arg2, this.field4753, -1)) {
            arg4.field4698 = this.field4698;
        } else if (arg5.field4698 == null || arg5.field4698.length < this.field4723) {
            int var26 = this.field4723;
            arg4.field4698 = arg5.field4698 = new class590[var26];
            for (int var27 = 0; var27 < this.field4723; var27++) {
                arg4.field4698[var27] = this.field4698[var27].method3453(true);
            }
        } else {
            arg4.field4698 = arg5.field4698;
            for (int var25 = 0; var25 < this.field4723; var25++) {
                arg4.field4698[var25].method3455(this.field4698[var25], 128);
            }
        }
        arg4.field4732 = this.field4732;
        arg4.field4664 = this.field4664;
        if (this.field4736) {
            arg4.field4725 = this.field4725;
            arg4.field4736 = true;
            arg4.field4647 = this.field4647;
            arg4.field4745 = this.field4745;
            arg4.field4744 = this.field4744;
            arg4.field4645 = this.field4645;
            arg4.field4708 = this.field4708;
            arg4.field4659 = this.field4659;
            arg4.field4658 = this.field4658;
        } else {
            arg4.field4736 = false;
        }
        arg4.field4667 = this.field4667;
        arg4.field4643 = this.field4643;
        arg4.field4760 = this.field4760;
        if (arg0 != 17) {
            return null;
        }
        arg4.field4669 = this.field4669;
        arg4.field4689 = this.field4689;
        arg4.field4733 = this.field4733;
        arg4.field4696 = this.field4696;
        arg4.field4701 = this.field4701;
        arg4.field4653 = this.field4653;
        return arg4;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZ)V")
    private final void method2110(int arg0, boolean arg1) {
        field4679++;
        boolean var3 = this.field4721 != null && this.field4721.field2125 == null;
        boolean var4 = this.field4705 != null && this.field4705.field2125 == null;
        boolean var5 = this.field4717 != null && this.field4717.field2125 == null;
        boolean var6 = this.field4741 != null && this.field4741.field2125 == null;
        if (arg1) {
            var3 &= (this.field4737 & 0x2) != 0;
            var4 &= (this.field4737 & 0x4) != 0;
            var6 &= (this.field4737 & 0x8) != 0;
            var5 &= (this.field4737 & 0x1) != 0;
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
        if (arg0 != 6576) {
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
        if ((this.field4712 * var7) <= this.field4754.field2686.field6979.length) {
            this.field4754.field2686.field6962 = 0;
        } else {
            this.field4754.field2686 = new class296((this.field4712 + 100) * var7);
        }
        class296 var12 = this.field4754.field2686;
        if (var5) {
            if (this.field4754.field2748) {
                for (int var21 = 0; var21 < this.field4674; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field4662[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field4642[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field4706[var21]);
                    int var25 = this.field4733[var21];
                    int var26 = this.field4733[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field4669[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field6962 = var7 * var28;
                        var12.method3003(var22, arg0 ^ 0xFFFFBC5B);
                        var12.method3003(var23, -23061);
                        var12.method3003(var24, arg0 - 29637);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field4674; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field4662[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field4642[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field4706[var13]);
                    int var17 = this.field4733[var13];
                    int var18 = this.field4733[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field4669[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field6962 = var7 * var20;
                        var12.method3012(arg0 - 6449, var14);
                        var12.method3012(127, var15);
                        var12.method3012(111, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field4705 == null) {
                short[] var29;
                short[] var30;
                byte[] var31;
                short[] var32;
                if (this.field4651 == null) {
                    var29 = this.field4690;
                    var30 = this.field4692;
                    var31 = this.field4750;
                    var32 = this.field4716;
                } else {
                    var31 = this.field4651.field3973;
                    var32 = this.field4651.field3975;
                    var29 = this.field4651.field3977;
                    var30 = this.field4651.field3968;
                }
                float var33 = this.field4754.field2745[0];
                float var34 = this.field4754.field2745[1];
                float var35 = this.field4754.field2745[2];
                float var36 = this.field4754.field2726;
                float var37 = this.field4754.field2689 * 768.0F / (float) this.field4757;
                float var38 = this.field4754.field2744 * 768.0F / (float) this.field4757;
                for (int var39 = 0; var39 < this.field4661; var39++) {
                    int var40 = this.method2108(this.field4648[var39], this.field4682[var39], true, this.field4697[var39], this.field4688);
                    float var41 = (float) (var40 >>> 24) * this.field4754.field2738;
                    float var42 = (float) ((var40 & 0xFFC1) >> 8) * this.field4754.field2683;
                    short var43 = this.field4655[var39];
                    float var44 = (float) ((var40 & 0xFFE3B6) >> 16) * this.field4754.field2750;
                    short var45 = (short) var31[var43];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var32[var43] * var35 + (float) var29[var43] * var34 + (float) var30[var43] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var32[var43] * var35 + (float) var29[var43] * var34 + (float) var30[var43] * var33) / (float) (var45 * 256);
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
                    int var50 = (int) (var42 * var47);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field6962 = var7 * var43 + var9;
                    var12.method3005(255, var48);
                    var12.method3005(255, var49);
                    var12.method3005(arg0 - 6321, var50);
                    var12.method3005(255, 255 - (this.field4682[var39] & 0xFF));
                    short var51 = this.field4746[var39];
                    short var52 = (short) var31[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var32[var51] * var35 + (float) var29[var51] * var34 + (float) var30[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var32[var51] * var35 + (float) var29[var51] * var34 + (float) var30[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var36 + var53 * ((var53 < 0.0F) ? var38 : var37);
                    int var55 = (int) (var41 * var54);
                    int var56 = (int) (var44 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var42 * var54);
                    var12.field6962 = var9 + (var7 * var51);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method3005(255, var55);
                    var12.method3005(255, var56);
                    var12.method3005(255, var57);
                    var12.method3005(255, 255 - (this.field4682[var39] & 0xFF));
                    short var58 = this.field4711[var39];
                    short var59 = (short) var31[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var32[var58] * var35 + (float) var29[var58] * var34 + (float) var30[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var32[var58] * var35 + (float) var29[var58] * var34 + (float) var30[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var36 + var60 * ((var60 < 0.0F) ? var38 : var37);
                    int var62 = (int) (var41 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var44 * var61);
                    int var64 = (int) (var42 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.field6962 = var7 * var58 + var9;
                    var12.method3005(arg0 ^ 0x194F, var62);
                    var12.method3005(255, var63);
                    var12.method3005(arg0 - 6321, var64);
                    var12.method3005(255, 255 - (this.field4682[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field4661; var65++) {
                    int var66 = this.method2108(this.field4648[var65], this.field4682[var65], true, this.field4697[var65], this.field4688);
                    var12.field6962 = this.field4655[var65] * var7 + var9;
                    var12.method3003(var66, -23061);
                    var12.field6962 = this.field4746[var65] * var7 + var9;
                    var12.method3003(var66, -23061);
                    var12.field6962 = this.field4711[var65] * var7 + var9;
                    var12.method3003(var66, arg0 - 29637);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field4651 == null) {
                var67 = this.field4750;
                var68 = this.field4716;
                var69 = this.field4690;
                var70 = this.field4692;
            } else {
                var68 = this.field4651.field3975;
                var70 = this.field4651.field3968;
                var67 = this.field4651.field3973;
                var69 = this.field4651.field3977;
            }
            float var71 = 3.0F / (float) this.field4757;
            float var72 = 3.0F / (float) (this.field4757 / 2 + this.field4757);
            var12.field6962 = var10;
            if (this.field4754.field2748) {
                for (int var73 = 0; var73 < this.field4712; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1943(arg0 - 27747, (float) var70[var73] * var72);
                        var12.method1943(-21171, (float) var69[var73] * var72);
                        var12.method1943(-21171, (float) var68[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1943(arg0 ^ 0xFFFFB4FD, (float) var70[var73] * var75);
                        var12.method1943(arg0 ^ 0xFFFFB4FD, (float) var69[var73] * var75);
                        var12.method1943(-21171, (float) var68[var73] * var75);
                    }
                    var12.field6962 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field4712; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1942((float) var70[var76] * var72, -31);
                        var12.method1942((float) var69[var76] * var72, -51);
                        var12.method1942((float) var68[var76] * var72, -20);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1942((float) var70[var76] * var78, -45);
                        var12.method1942((float) var69[var76] * var78, arg0 - 6638);
                        var12.method1942((float) var68[var76] * var78, arg0 ^ 0xFFFFE669);
                    }
                    var12.field6962 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field6962 = var11;
            if (this.field4754.field2748) {
                for (int var80 = 0; var80 < this.field4712; var80++) {
                    var12.method1943(-21171, this.field4680[var80]);
                    var12.method1943(-21171, this.field4734[var80]);
                    var12.field6962 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field4712; var79++) {
                    var12.method1942(this.field4680[var79], -76);
                    var12.method1942(this.field4734[var79], arg0 ^ 0xFFFFE625);
                    var12.field6962 += var7 - 8;
                }
            }
        }
        var12.field6962 = this.field4712 * var7;
        class211 var81;
        if (arg1) {
            if (this.field4656 == null) {
                this.field4656 = this.field4754.method1266(-3311, var7, var12.field6962, true, var12.field6979);
            } else {
                this.field4656.method864(var12.field6962, var7, var12.field6979, -26434);
            }
            this.field4737 = 0;
            var81 = this.field4656;
        } else {
            var81 = this.field4754.method1266(-3311, var7, var12.field6962, false, var12.field6979);
            this.field4700 = true;
        }
        if (var5) {
            this.field4717.field2122 = var8;
            this.field4717.field2125 = var81;
        }
        if (var6) {
            this.field4741.field2125 = var81;
            this.field4741.field2122 = var11;
        }
        if (var3) {
            this.field4721.field2125 = var81;
            this.field4721.field2122 = var9;
        }
        if (var4) {
            this.field4705.field2125 = var81;
            this.field4705.field2122 = var10;
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(IZ)V")
    private final void method2111(int arg0, boolean arg1) {
        if (this.field4691 * 6 <= this.field4754.field2686.field6979.length) {
            this.field4754.field2686.field6962 = 0;
        } else {
            this.field4754.field2686 = new class296(this.field4691 * 6 + 600);
        }
        field4665++;
        class296 var3 = this.field4754.field2686;
        if (this.field4754.field2748) {
            for (int var4 = 0; var4 < this.field4691; var4++) {
                var3.method2986(this.field4655[var4], -125);
                var3.method2986(this.field4746[var4], arg0 ^ 0x2F552D79);
                var3.method2986(this.field4711[var4], arg0 + 794111359);
            }
        } else {
            for (int var5 = 0; var5 < this.field4691; var5++) {
                var3.method2974(this.field4655[var5], (byte) 115);
                var3.method2974(this.field4746[var5], (byte) -106);
                var3.method2974(this.field4711[var5], (byte) 20);
            }
        }
        if (var3.field6962 == 0) {
            return;
        }
        if (arg1) {
            if (this.field4747 == null) {
                this.field4747 = this.field4754.method1205((byte) 11, 5123, var3.field6962, var3.field6979, true);
            } else {
                this.field4747.method663(5123, -51, var3.field6962, var3.field6979);
            }
            this.field4735.field1360 = this.field4747;
        } else {
            this.field4735.field1360 = this.field4754.method1205((byte) 11, 5123, var3.field6962, var3.field6979, false);
        }
        if (!arg1) {
            this.field4700 = true;
        }
        if (arg0 != -794111346) {
            this.field4760 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(FFJILao;IIBII)S")
    private final short method2112(float arg0, float arg1, long arg2, int arg3, class534 arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field4678++;
        int var12 = this.field4733[arg6];
        int var13 = this.field4733[arg6 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field4669[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class183.field2296[var15] == arg2) {
                return (short) (var16 - 1);
            }
        }
        this.field4669[var14] = (short) (this.field4712 + 1);
        class183.field2296[var14] = arg2;
        this.field4692[this.field4712] = (short) arg8;
        this.field4690[this.field4712] = (short) arg9;
        this.field4716[this.field4712] = (short) arg3;
        this.field4750[this.field4712] = (byte) arg5;
        if (arg7 >= -84) {
            this.method1570(17, 43, null, false, 117, 34);
        }
        this.field4680[this.field4712] = arg0;
        this.field4734[this.field4712] = arg1;
        return (short) (this.field4712++);
    }

    @OriginalMember(owner = "client!pr", name = "ba", descriptor = "(Lr;)Lr;")
    public final class113 method1574(class113 arg0) {
        field4663++;
        if (this.field4712 == 0) {
            return null;
        }
        if (!this.field4736) {
            this.method2105(-128);
        }
        int var2;
        int var3;
        if (this.field4754.field2669 <= 0) {
            var2 = this.field4647 - (this.field4754.field2669 * this.field4645 >> 8) >> this.field4754.field2610;
            var3 = this.field4659 - (this.field4754.field2669 * this.field4745 >> 8) >> this.field4754.field2610;
        } else {
            var2 = this.field4647 - (this.field4754.field2669 * this.field4745 >> 8) >> this.field4754.field2610;
            var3 = this.field4659 - (this.field4754.field2669 * this.field4645 >> 8) >> this.field4754.field2610;
        }
        int var4;
        int var5;
        if (this.field4754.field2746 <= 0) {
            var4 = this.field4708 - (this.field4754.field2746 * this.field4645 >> 8) >> this.field4754.field2610;
            var5 = this.field4658 - (this.field4754.field2746 * this.field4745 >> 8) >> this.field4754.field2610;
        } else {
            var4 = this.field4708 - (this.field4754.field2746 * this.field4745 >> 8) >> this.field4754.field2610;
            var5 = this.field4658 - (this.field4754.field2746 * this.field4645 >> 8) >> this.field4754.field2610;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class65 var8 = (class65) arg0;
        class65 var9;
        if (var8 != null && var8.method504((byte) 24, var7, var6)) {
            var9 = var8;
            var8.method503(-4667);
        } else {
            var9 = new class65(this.field4754, var6, var7);
        }
        var9.method507(var3, var4, var5, -42716912, var2);
        this.method2104((byte) -110, var9);
        return var9;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method1564(class231 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4749++;
        class332 var6 = (class332) arg0;
        if (this.field4661 == 0 || var6.field4661 == 0) {
            return;
        }
        int var7 = var6.field4674;
        int[] var8 = var6.field4662;
        int[] var9 = var6.field4642;
        int[] var10 = var6.field4706;
        short[] var11 = var6.field4692;
        short[] var12 = var6.field4690;
        short[] var13 = var6.field4716;
        byte[] var14 = var6.field4750;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field4651 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var17 = this.field4651.field3973;
            var15 = this.field4651.field3977;
            var18 = this.field4651.field3975;
            var16 = this.field4651.field3968;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field4651 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var20 = var6.field4651.field3968;
            var19 = var6.field4651.field3975;
            var22 = var6.field4651.field3977;
            var21 = var6.field4651.field3973;
        }
        int[] var23 = var6.field4733;
        short[] var24 = var6.field4669;
        if (!var6.field4736) {
            var6.method2105(-122);
        }
        short var25 = var6.field4645;
        short var26 = var6.field4745;
        short var27 = var6.field4647;
        short var28 = var6.field4659;
        short var29 = var6.field4708;
        short var30 = var6.field4658;
        for (int var31 = 0; var31 < this.field4674; var31++) {
            int var32 = this.field4642[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field4662[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field4706[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field4733[var31];
                        int var37 = this.field4733[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4669[var38] - 1;
                            if (var35 == -1 || this.field4750[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39 + 1];
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var41; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var16 == null) {
                                            this.field4651 = new class275();
                                            var16 = this.field4651.field3968 = class681.method3870(this.field4692, -117);
                                            var15 = this.field4651.field3977 = class681.method3870(this.field4690, -76);
                                            var18 = this.field4651.field3975 = class681.method3870(this.field4716, -70);
                                            var17 = this.field4651.field3973 = class753.method4160(this.field4750, (byte) 118);
                                        }
                                        if (var20 == null) {
                                            class275 var44 = var6.field4651 = new class275();
                                            var20 = var44.field3968 = class681.method3870(var11, -78);
                                            var22 = var44.field3977 = class681.method3870(var12, -76);
                                            var19 = var44.field3975 = class681.method3870(var13, -82);
                                            var21 = var44.field3973 = class753.method4160(var14, (byte) 122);
                                        }
                                        short var45 = this.field4692[var35];
                                        short var46 = this.field4690[var35];
                                        short var47 = this.field4716[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field4750[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var20[var52] += var45;
                                                var22[var52] += var46;
                                                var19[var52] += var47;
                                                var21[var52] += var49;
                                            }
                                        }
                                        int var53 = this.field4733[var31];
                                        byte var54 = var14[var40];
                                        short var55 = var12[var40];
                                        short var56 = var13[var40];
                                        int var57 = this.field4733[var31 + 1];
                                        short var58 = var11[var40];
                                        for (int var59 = var53; var59 < var57; var59++) {
                                            int var60 = this.field4669[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var58;
                                                var15[var60] += var55;
                                                var18[var60] += var56;
                                                var17[var60] += var54;
                                            }
                                        }
                                        if (this.field4705 == null && this.field4721 != null) {
                                            this.field4721.field2125 = null;
                                        }
                                        if (this.field4705 != null) {
                                            this.field4705.field2125 = null;
                                        }
                                        if (var6.field4705 == null && var6.field4721 != null) {
                                            var6.field4721.field2125 = null;
                                        }
                                        if (var6.field4705 != null) {
                                            var6.field4705.field2125 = null;
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

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Loo;Lea;II)V")
    public final void method1580(class12 arg0, class21 arg1, int arg2, int arg3) {
        field4730++;
        if (this.field4712 == 0) {
            return;
        }
        class35 var5 = this.field4754.field2636;
        class35 var6 = (class35) arg0;
        if (!this.field4736) {
            this.method2105(-122);
        }
        class725.field10034 = var5.field355 * var6.field366 + var5.field365 * var6.field357 + var5.field334 * var6.field351 + var5.field366;
        class265.field3861 = var5.field355 * var6.field365 + var5.field365 * var6.field373 + var5.field334 * var6.field370;
        float var7 = (float) this.field4645 * class265.field3861 + class725.field10034;
        float var8 = (float) this.field4745 * class265.field3861 + class725.field10034;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) (-this.field4744) + var8;
            var10 = (float) this.field4744 + var7;
        } else {
            var9 = (float) (-this.field4744) + var7;
            var10 = (float) this.field4744 + var8;
        }
        if ((var9 >= this.field4754.field2751) || ((float) this.field4754.field2731 >= var10)) {
            return;
        }
        class341.field4949 = var5.field372 * var6.field366 + var5.field370 * var6.field357 + var5.field337 * var6.field351 + var5.field351;
        class109.field1318 = var5.field372 * var6.field365 + var5.field370 * var6.field373 + var5.field337 * var6.field370;
        float var11 = (float) this.field4645 * class109.field1318 + class341.field4949;
        float var12 = (float) this.field4745 * class109.field1318 + class341.field4949;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = (var12 - (float) this.field4744) * (float) this.field4754.field2696;
            var14 = ((float) this.field4744 + var11) * (float) this.field4754.field2696;
        } else {
            var13 = (var11 - (float) this.field4744) * (float) this.field4754.field2696;
            var14 = ((float) this.field4744 + var12) * (float) this.field4754.field2696;
        }
        if ((this.field4754.field2713 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field4754.field2647)) {
            return;
        }
        class248.field3696 = var5.field356 * var6.field366 + var5.field373 * var6.field357 + var5.field347 * var6.field351 + var5.field357;
        class138.field1769 = var5.field356 * var6.field365 + var5.field373 * var6.field373 + var5.field347 * var6.field370;
        float var15 = (float) this.field4645 * class138.field1769 + class248.field3696;
        float var16 = (float) this.field4745 * class138.field1769 + class248.field3696;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = ((float) (-this.field4744) + var16) * (float) this.field4754.field2676;
            var17 = ((float) this.field4744 + var15) * (float) this.field4754.field2676;
        } else {
            var17 = ((float) this.field4744 + var16) * (float) this.field4754.field2676;
            var18 = (var15 - (float) this.field4744) * (float) this.field4754.field2676;
        }
        if ((var18 / (float) arg2 >= this.field4754.field2702) || (var17 / (float) arg2 <= this.field4754.field2664)) {
            return;
        }
        if (arg1 != null || this.field4760 != null) {
            class84.field1024 = var5.field372 * var6.field355 + var5.field370 * var6.field356 + var5.field337 * var6.field372;
            class432.field6013 = var5.field355 * var6.field355 + var5.field365 * var6.field356 + var5.field334 * var6.field372;
            class170.field2158 = var5.field372 * var6.field334 + var5.field370 * var6.field347 + var5.field337 * var6.field337;
            class455.field6368 = var5.field356 * var6.field334 + var5.field373 * var6.field347 + var5.field347 * var6.field337;
            class678.field9486 = var5.field355 * var6.field334 + var5.field365 * var6.field347 + var5.field334 * var6.field337;
            field4677 = var5.field356 * var6.field355 + var5.field373 * var6.field356 + var5.field347 * var6.field372;
        }
        if (arg1 != null) {
            int var19 = this.field4647 + this.field4659 >> 1;
            int var20 = this.field4708 + this.field4658 >> 1;
            int var21 = (int) ((float) var20 * class84.field1024 + (float) this.field4645 * class109.field1318 + (float) var19 * class170.field2158 + class341.field4949);
            int var22 = (int) ((float) var20 * field4677 + (float) this.field4645 * class138.field1769 + (float) var19 * class455.field6368 + class248.field3696);
            int var23 = (int) ((float) var20 * class432.field6013 + (float) this.field4645 * class265.field3861 + (float) var19 * class678.field9486 + class725.field10034);
            int var24 = (int) ((float) var20 * class84.field1024 + (float) this.field4745 * class109.field1318 + (float) var19 * class170.field2158 + class341.field4949);
            int var25 = (int) ((float) var20 * field4677 + (float) this.field4745 * class138.field1769 + (float) var19 * class455.field6368 + class248.field3696);
            int var26 = (int) ((float) var20 * class432.field6013 + (float) this.field4745 * class265.field3861 + (float) var19 * class678.field9486 + class725.field10034);
            arg1.field182 = this.field4754.field2676 * var25 / arg2 + this.field4754.field2656;
            arg1.field184 = this.field4754.field2676 * var22 / arg2 + this.field4754.field2656;
            arg1.field179 = this.field4754.field2693 + (this.field4754.field2696 * var21 / arg2);
            arg1.field181 = this.field4754.field2696 * var24 / arg2 + this.field4754.field2693;
            if (this.field4754.field2731 <= var23 || var26 >= this.field4754.field2731) {
                arg1.field183 = (this.field4744 + var21) * this.field4754.field2696 / arg2 + this.field4754.field2693 - arg1.field179;
                arg1.field180 = true;
            }
        }
        this.field4754.method1196((float) arg2, 3);
        this.field4754.method1209(-90);
        this.field4754.method1210(0, var6);
        this.method2114(false);
        this.field4754.method1246(86);
        this.method2115(0);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILoo;ZII)Z")
    public final boolean method1570(int arg0, int arg1, class12 arg2, boolean arg3, int arg4, int arg5) {
        field4718++;
        return this.method2106(arg4, arg3, arg5, arg0, arg2, arg1, 2115310305);
    }

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "()V")
    public final void method1589() {
        field4644++;
        if (this.field4712 <= 0 || this.field4691 <= 0) {
            return;
        }
        this.method2110(6576, false);
        if ((this.field4737 & 0x10) == 0 && this.field4735.field1360 == null) {
            this.method2111(-794111346, false);
        }
        this.method2116(2048);
    }

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "()V")
    public final void method1554() {
        for (int var1 = 0; var1 < this.field4674; var1++) {
            this.field4706[var1] = -this.field4706[var1];
        }
        field4683++;
        for (int var2 = 0; var2 < this.field4712; var2++) {
            this.field4716[var2] = (short) (-this.field4716[var2]);
        }
        for (int var3 = 0; var3 < this.field4661; var3++) {
            short var4 = this.field4655[var3];
            this.field4655[var3] = this.field4711[var3];
            this.field4711[var3] = var4;
        }
        if (this.field4705 == null && this.field4721 != null) {
            this.field4721.field2125 = null;
        }
        if (this.field4705 != null) {
            this.field4705.field2125 = null;
        }
        if (this.field4735 != null) {
            this.field4735.field1360 = null;
        }
        this.field4736 = false;
        if (this.field4717 != null) {
            this.field4717.field2125 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Loo;)V")
    public final void method1581(class12 arg0) {
        field4726++;
        class35 var2 = (class35) arg0;
        if (this.field4643 != null) {
            for (int var3 = 0; var3 < this.field4643.length; var3++) {
                class626 var4 = this.field4643[var3];
                class626 var5 = var4;
                if (var4.field8761 != null) {
                    var5 = var4.field8761;
                }
                var5.field8777 = (int) ((float) this.field4706[var4.field8771] * var2.field372 + (float) this.field4662[var4.field8771] * var2.field337 + (float) this.field4642[var4.field8771] * var2.field370 + var2.field351);
                var5.field8776 = (int) ((float) this.field4706[var4.field8771] * var2.field356 + (float) this.field4662[var4.field8771] * var2.field347 + (float) this.field4642[var4.field8771] * var2.field373 + var2.field357);
                var5.field8763 = (int) ((float) this.field4706[var4.field8771] * var2.field355 + (float) this.field4662[var4.field8771] * var2.field334 + (float) this.field4642[var4.field8771] * var2.field365 + var2.field366);
                var5.field8767 = (int) ((float) this.field4706[var4.field8775] * var2.field372 + (float) this.field4662[var4.field8775] * var2.field337 + (float) this.field4642[var4.field8775] * var2.field370 + var2.field351);
                var5.field8764 = (int) ((float) this.field4706[var4.field8775] * var2.field356 + (float) this.field4662[var4.field8775] * var2.field347 + (float) this.field4642[var4.field8775] * var2.field373 + var2.field357);
                var5.field8768 = (int) ((float) this.field4706[var4.field8775] * var2.field355 + (float) this.field4662[var4.field8775] * var2.field334 + (float) this.field4642[var4.field8775] * var2.field365 + var2.field366);
                var5.field8762 = (int) ((float) this.field4706[var4.field8760] * var2.field372 + (float) this.field4662[var4.field8760] * var2.field337 + (float) this.field4642[var4.field8760] * var2.field370 + var2.field351);
                var5.field8773 = (int) ((float) this.field4706[var4.field8760] * var2.field356 + (float) this.field4662[var4.field8760] * var2.field347 + (float) this.field4642[var4.field8760] * var2.field373 + var2.field357);
                var5.field8759 = (int) ((float) this.field4706[var4.field8760] * var2.field355 + (float) this.field4662[var4.field8760] * var2.field334 + (float) this.field4642[var4.field8760] * var2.field365 + var2.field366);
            }
        }
        if (this.field4696 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4696.length; var6++) {
            class426 var7 = this.field4696[var6];
            class426 var8 = var7;
            if (var7.field5948 != null) {
                var8 = var7.field5948;
            }
            if (var7.field5946 == null) {
                var7.field5946 = var2.method37();
            } else {
                var7.field5946.method49(var2);
            }
            var8.field5945 = (int) ((float) this.field4706[var7.field5944] * var2.field372 + (float) this.field4662[var7.field5944] * var2.field337 + (float) this.field4642[var7.field5944] * var2.field370 + var2.field351);
            var8.field5947 = (int) ((float) this.field4706[var7.field5944] * var2.field356 + (float) this.field4662[var7.field5944] * var2.field347 + (float) this.field4642[var7.field5944] * var2.field373 + var2.field357);
            var8.field5943 = (int) ((float) this.field4706[var7.field5944] * var2.field355 + (float) this.field4662[var7.field5944] * var2.field334 + (float) this.field4642[var7.field5944] * var2.field365 + var2.field366);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Loo;IZ)V")
    public final void method1541(class12 arg0, int arg1, boolean arg2) {
        field4713++;
        if (this.field4732 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field4674; var5++) {
            if ((arg1 & this.field4732[var5]) != 0) {
                if (arg2) {
                    arg0.method48(this.field4662[var5], this.field4642[var5], this.field4706[var5], var4);
                } else {
                    arg0.method33(this.field4662[var5], this.field4642[var5], this.field4706[var5], var4);
                }
                this.field4662[var5] = var4[0];
                this.field4642[var5] = var4[1];
                this.field4706[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "ua", descriptor = "()I")
    public final int method1587() {
        field4756++;
        return this.field4751;
    }

    @OriginalMember(owner = "client!pr", name = "F", descriptor = "()Z")
    public final boolean method1575() {
        field4731++;
        return this.field4755;
    }

    @OriginalMember(owner = "client!pr", name = "WA", descriptor = "()I")
    public final int method1540() {
        field4686++;
        return this.field4688;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIBIIII)Z")
    private final boolean method2113(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field4743++;
        if (arg8 < arg1 && arg7 > arg8 && arg8 < arg0) {
            return false;
        } else if (arg1 < arg8 && arg7 < arg8 && arg8 > arg0) {
            return false;
        } else if (arg4 > -92) {
            return true;
        } else if (arg5 < arg2 && arg3 > arg5 && arg6 > arg5) {
            return false;
        } else {
            return arg2 >= arg5 || arg3 >= arg5 || arg5 <= arg6;
        }
    }

    @OriginalMember(owner = "client!pr", name = "EA", descriptor = "()I")
    public final int method1567() {
        field4684++;
        if (!this.field4736) {
            this.method2105(-123);
        }
        return this.field4745;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    private final void method2114(boolean arg0) {
        field4761++;
        if (this.field4691 == 0) {
            return;
        }
        if (this.field4737 != 0) {
            this.method2110(6576, true);
        }
        this.method2110(6576, arg0);
        if (this.field4735 != null) {
            if (this.field4735.field1360 == null) {
                this.method2111(-794111346, ~(this.field4737 & 0x10) != -1);
            }
            if (this.field4735.field1360 != null) {
                this.field4754.method1202(-104, this.field4705 != null);
                this.field4754.method1248(this.field4717, this.field4741, this.field4721, (byte) 6, this.field4705);
                int var2 = this.field4689.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field4689[var3];
                    int var5 = this.field4689[var3 + 1];
                    int var6 = this.field4648[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field4754.method1260(this.field4705 != null, -108, var6);
                    this.field4754.method1211((byte) -5, (var5 - var4) * 3, this.field4735.field1360, 4, var4 * 3);
                }
            }
        }
        this.method2116(2048);
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "()V")
    public final void method1553() {
        field4707++;
    }

    @OriginalMember(owner = "client!pr", name = "da", descriptor = "()I")
    public final int method1582() {
        field4702++;
        return this.field4757;
    }

    @OriginalMember(owner = "client!pr", name = "VA", descriptor = "(I)V")
    public final void method1559(int arg0) {
        field4759++;
        int var2 = class448.field6265[arg0];
        int var3 = class448.field6270[arg0];
        for (int var4 = 0; var4 < this.field4674; var4++) {
            int var5 = this.field4642[var4] * var2 + (this.field4662[var4] * var3) >> 14;
            this.field4642[var4] = this.field4642[var4] * var3 - (this.field4662[var4] * var2) >> 14;
            this.field4662[var4] = var5;
        }
        this.field4736 = false;
        if (this.field4717 != null) {
            this.field4717.field2125 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIII)V")
    public final void method1571(int arg0, int arg1, int arg2, int arg3) {
        field4650++;
        for (int var5 = 0; var5 < this.field4661; var5++) {
            int var9 = this.field4697[var5] & 0xFFFF;
            int var10 = (var9 & 0xFEA4) >> 10;
            int var11 = (var9 & 0x3FC) >> 7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field4697[var5] = (short) class613.method3544(var12, class613.method3544(var10 << 10, var11 << 7));
        }
        if (this.field4760 != null) {
            for (int var6 = 0; var6 < this.field4723; var6++) {
                class785 var7 = this.field4760[var6];
                class590 var8 = this.field4698[var6];
                var8.field8319 = var8.field8319 & 0xFF000000 | class109.field1323[this.field4697[var7.field10768] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field4721 != null) {
            this.field4721.field2125 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
    private final void method2115(int arg0) {
        if (this.field4760 != null) {
            class35 var2 = this.field4754.field2608;
            this.field4754.method1269(arg0 ^ 0xFFFFFF8D);
            this.field4754.method211(!this.field4755);
            this.field4754.method1202(-106, false);
            this.field4754.method1248(this.field4754.field2652, this.field4754.field2653, null, (byte) 115, null);
            for (int var3 = 0; var3 < this.field4723; var3++) {
                class785 var4 = this.field4760[var3];
                class590 var5 = this.field4698[var3];
                if (!var4.field10766 || !this.field4754.method147()) {
                    float var6 = (float) (this.field4662[var4.field10765] + this.field4662[var4.field10760] + this.field4662[var4.field10767]) * 0.3333333F;
                    float var7 = (float) (this.field4642[var4.field10767] + this.field4642[var4.field10765] + this.field4642[var4.field10760]) * 0.3333333F;
                    float var8 = (float) (this.field4706[var4.field10767] + this.field4706[var4.field10765] + this.field4706[var4.field10760]) * 0.3333333F;
                    float var9 = class84.field1024 * var8 + class170.field2158 * var6 + class109.field1318 * var7 + class341.field4949;
                    float var10 = field4677 * var8 + class455.field6368 * var6 + class138.field1769 * var7 + class248.field3696;
                    float var11 = class432.field6013 * var8 + class678.field9486 * var6 + class265.field3861 * var7 + class725.field10034;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field10761;
                    var2.method292(var10 * var12 + ((float) var5.field8321 - var10), var4.field10762 * var5.field8313 >> 7, var4.field10764 * var5.field8315 >> 7, arg0, var5.field8316, (float) var5.field8324 + var9 - (var9 * var12), var11 * var12 + -var11);
                    this.field4754.method1253((byte) 3, var2);
                    int var13 = var5.field8319;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field4754.method1232(var4.field10770, arg0 ^ 0x1);
                    this.field4754.method1241(var4.field10769, (byte) 123);
                    this.field4754.method1240(7, 0, 0, 4);
                }
            }
            this.field4754.method211(true);
            this.field4754.method1246(arg0 + 63);
        }
        if (arg0 != 0) {
            this.method1571(11, -107, 23, 1);
        }
        field4652++;
    }

    @OriginalMember(owner = "client!pr", name = "fa", descriptor = "()I")
    public final int method1576() {
        field4693++;
        if (!this.field4736) {
            this.method2105(-121);
        }
        return this.field4645;
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "()[Lfba;")
    public final class626[] method1579() {
        field4719++;
        return this.field4643;
    }

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
    private final void method2116(int arg0) {
        field4728++;
        if (!this.field4700) {
            return;
        }
        this.field4700 = false;
        if (this.field4643 == null && this.field4696 == null && this.field4760 == null && !class1.method4(this.field4753, this.field4751, (byte) 123)) {
            boolean var2 = false;
            boolean var3 = false;
            boolean var4 = false;
            if (this.field4662 != null && !class521.method3111(0, this.field4753, this.field4751)) {
                if (this.field4717 != null && this.field4717.field2125 == null) {
                    this.field4700 = true;
                } else {
                    if (!this.field4736) {
                        this.method2105(-123);
                    }
                    var2 = true;
                }
            }
            if (this.field4642 != null && !class231.method1572(this.field4751, -121, this.field4753)) {
                if (this.field4717 != null && this.field4717.field2125 == null) {
                    this.field4700 = true;
                } else {
                    if (!this.field4736) {
                        this.method2105(-127);
                    }
                    var3 = true;
                }
            }
            if (this.field4706 != null && !class526.method3130((byte) -89, this.field4753, this.field4751)) {
                if (this.field4717 != null && this.field4717.field2125 == null) {
                    this.field4700 = true;
                } else {
                    var4 = true;
                    if (!this.field4736) {
                        this.method2105(arg0 - 2175);
                    }
                }
            }
            if (var2) {
                this.field4662 = null;
            }
            if (var3) {
                this.field4642 = null;
            }
            if (var4) {
                this.field4706 = null;
            }
        }
        if (this.field4669 != null && this.field4662 == null && this.field4642 == null && this.field4706 == null) {
            this.field4669 = null;
            this.field4733 = null;
        }
        if (this.field4750 != null && !class216.method1344(this.field4751, this.field4753, -99)) {
            if (this.field4705 == null) {
                if (this.field4721 != null && this.field4721.field2125 == null) {
                    this.field4700 = true;
                } else {
                    this.field4750 = null;
                    this.field4692 = this.field4690 = this.field4716 = null;
                }
            } else if (this.field4705.field2125 == null) {
                this.field4700 = true;
            } else {
                this.field4692 = this.field4690 = this.field4716 = null;
                this.field4750 = null;
            }
        }
        if (this.field4697 != null && !class405.method2483(this.field4751, -128, this.field4753)) {
            if (this.field4721 != null && this.field4721.field2125 == null) {
                this.field4700 = true;
            } else {
                this.field4697 = null;
            }
        }
        if (this.field4682 != null && !class729.method4050(123, this.field4753, this.field4751)) {
            if (this.field4721 != null && this.field4721.field2125 == null) {
                this.field4700 = true;
            } else {
                this.field4682 = null;
            }
        }
        if (this.field4680 != null && !class741.method4109(this.field4753, arg0 - 2032, this.field4751)) {
            if (this.field4741 != null && this.field4741.field2125 == null) {
                this.field4700 = true;
            } else {
                this.field4680 = this.field4734 = null;
            }
        }
        if (this.field4648 != null && !class705.method3980(this.field4751, this.field4753, 0)) {
            if (this.field4721 != null && this.field4721.field2125 == null) {
                this.field4700 = true;
            } else {
                this.field4648 = null;
            }
        }
        if (this.field4655 != null && !class633.method3628(this.field4751, this.field4753, 127)) {
            if ((this.field4735 == null || this.field4735.field1360 != null) && (this.field4721 == null || this.field4721.field2125 != null)) {
                this.field4655 = this.field4746 = this.field4711 = null;
            } else {
                this.field4700 = true;
            }
        }
        if (this.field4653 != null && !class275.method1793(this.field4753, true, this.field4751)) {
            this.field4653 = null;
            this.field4667 = null;
        }
        if (arg0 != 2048) {
            this.method2112(0.081381395F, -0.40288404F, 106L, 61, null, 24, -109, (byte) 103, -89, 67);
        }
        if (this.field4664 != null && !class500.method2933(this.field4753, 32, this.field4751)) {
            this.field4732 = null;
            this.field4664 = null;
        }
        if (this.field4701 != null && !class486.method2886(this.field4753, this.field4751, arg0 ^ 0xFFFFF7FF)) {
            this.field4701 = null;
        }
        if (this.field4689 != null && (this.field4751 & 0x800) == 0 && (this.field4751 & 0x40000) == 0) {
            this.field4689 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lpq;)V")
    public class332(class194 arg0) {
        this.field4754 = arg0;
        this.field4717 = new class166(null, 5126, 3, 0);
        this.field4741 = new class166(null, 5126, 2, 0);
        this.field4705 = new class166(null, 5126, 3, 0);
        this.field4721 = new class166(null, 5121, 4, 0);
        this.field4735 = new class112();
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lpq;Lao;IIII)V")
    public class332(class194 arg0, class534 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4754 = arg0;
        this.field4753 = arg5;
        this.field4751 = arg2;
        if (class458.method2756((byte) 53, arg2, arg5)) {
            this.field4717 = new class166(null, 5126, 3, 0);
        }
        if (class664.method3786(arg5, (byte) -6, arg2)) {
            this.field4741 = new class166(null, 5126, 2, 0);
        }
        if (class341.method2165(arg5, arg2, (byte) -37)) {
            this.field4705 = new class166(null, 5126, 3, 0);
        }
        if (class705.method3977(arg2, arg5, 0)) {
            this.field4721 = new class166(null, 5121, 4, 0);
        }
        if (class83.method634(arg2, arg5, -64)) {
            this.field4735 = new class112();
        }
        class101 var7 = arg0.field6556;
        int[] var8 = new int[arg1.field7359];
        this.field4733 = new int[arg1.field7354 + 1];
        for (int var9 = 0; var9 < arg1.field7359; var9++) {
            if (arg1.field7347 == null || arg1.field7347[var9] != 2) {
                if (arg1.field7342 != null && arg1.field7342[var9] != -1) {
                    class744 var173 = var7.method581(-21732, arg1.field7342[var9] & 0xFFFF);
                    if (((this.field4753 & 0x40) == 0 || !var173.field10264) && var173.field10249) {
                        continue;
                    }
                }
                var8[this.field4661++] = var9;
                this.field4733[arg1.field7344[var9]]++;
                this.field4733[arg1.field7371[var9]]++;
                this.field4733[arg1.field7385[var9]]++;
            }
        }
        this.field4691 = this.field4661;
        long[] var10 = new long[this.field4661];
        boolean var11 = (this.field4751 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field4661; var12++) {
            int var156 = var8[var12];
            class744 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field7381 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field7381.length; var163++) {
                    class444 var164 = arg1.field7381[var163];
                    if (var164.field6145 == var156) {
                        class743 var165 = class625.method3599(var164.field6153, true);
                        if (var165.field10247) {
                            var162 = true;
                        }
                        if (var165.field10235 != -1) {
                            class744 var166 = var7.method581(-21732, var165.field10235);
                            if (var166.field10258 == 2) {
                                this.field4755 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field4691--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field7342 != null) {
                var167 = arg1.field7342[var156];
                if (var167 != -1) {
                    var157 = var7.method581(-21732, var167 & 0xFFFF);
                    if ((this.field4753 & 0x40) != 0 && var157.field10264) {
                        var157 = null;
                        var167 = -1;
                    } else {
                        var161 = var157.field10257;
                        if (var157.field10259 != 0 || var157.field10268 != 0) {
                            this.field4694 = true;
                        }
                        var160 = var157.field10273;
                    }
                }
            }
            boolean var168 = arg1.field7361 != null && arg1.field7361[var156] != 0 || var157 != null && var157.field10258 != 0;
            if ((var11 || var168) && arg1.field7349 != null) {
                var158 += arg1.field7349[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var167 & 0xFFFF << 16) + var159;
            int var171 = (var161 & 0xFF) + var169;
            int var172 = (var12 & 0xFFFF) + var170;
            var10[var12] = ((long) var171 << 32) + (long) var172;
            this.field4694 |= var157 != null && (var157.field10259 != 0 || var157.field10268 != 0);
            this.field4755 |= var168;
        }
        class208.method1325(var10, var8, (byte) -5);
        this.field4729 = arg1.field7343;
        this.field4706 = arg1.field7395;
        this.field4732 = arg1.field7394;
        this.field4674 = arg1.field7354;
        this.field4662 = arg1.field7374;
        this.field4642 = arg1.field7375;
        class157[] var13 = new class157[this.field4674];
        this.field4696 = arg1.field7363;
        this.field4643 = arg1.field7350;
        if (arg1.field7381 != null) {
            this.field4723 = arg1.field7381.length;
            this.field4760 = new class785[this.field4723];
            this.field4698 = new class590[this.field4723];
            for (int var14 = 0; var14 < this.field4723; var14++) {
                class444 var15 = arg1.field7381[var14];
                class743 var16 = class625.method3599(var15.field6153, true);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field4661; var18++) {
                    if (var8[var18] == var15.field6145) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class109.field1323[arg1.field7351[var15.field6145] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7361 == null ? 0 : arg1.field7361[var15.field6145]) << 24;
                this.field4760[var14] = new class785(var17, arg1.field7344[var15.field6145], arg1.field7371[var15.field6145], arg1.field7385[var15.field6145], var16.field10234, var16.field10243, var16.field10235, var16.field10246, var16.field10236, var16.field10247, var16.field10248, var15.field6142);
                this.field4698[var14] = new class590(var20);
            }
        }
        int var21 = this.field4661 * 3;
        if (arg1.field7382 != null) {
            this.field4667 = new short[this.field4661];
        }
        this.field4716 = new short[var21];
        this.field4711 = new short[this.field4661];
        this.field4669 = new short[var21];
        this.field4746 = new short[this.field4661];
        this.field4697 = new short[this.field4661];
        class183.field2296 = new long[var21];
        this.field4690 = new short[var21];
        this.field4680 = new float[var21];
        this.field4648 = new short[this.field4661];
        this.field4655 = new short[this.field4661];
        this.field4692 = new short[var21];
        this.field4757 = (short) arg4;
        this.field4682 = new byte[this.field4661];
        this.field4734 = new float[var21];
        this.field4688 = (short) arg3;
        this.field4750 = new byte[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7354; var23++) {
            int var155 = this.field4733[var23];
            this.field4733[var23] = var22;
            var13[var23] = new class157();
            var22 += var155;
        }
        this.field4733[arg1.field7354] = var22;
        class594 var24 = class106.method753((byte) -35, var8, arg1, this.field4661);
        class597[] var25 = new class597[arg1.field7359];
        for (int var26 = 0; var26 < arg1.field7359; var26++) {
            short var134 = arg1.field7344[var26];
            short var135 = arg1.field7371[var26];
            short var136 = arg1.field7385[var26];
            int var137 = this.field4662[var135] - this.field4662[var134];
            int var138 = this.field4642[var135] - this.field4642[var134];
            int var139 = this.field4706[var135] - this.field4706[var134];
            int var140 = this.field4662[var136] - this.field4662[var134];
            int var141 = this.field4642[var136] - this.field4642[var134];
            int var142 = this.field4706[var136] - this.field4706[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - var137 * var142;
            int var145 = var137 * var141 - (var138 * var140);
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var145 >>= 0x1;
                var144 >>= 0x1;
                var143 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var145 * var145 + var143 * var143 + var144 * var144));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var144 * 256 / var146;
            int var148 = var143 * 256 / var146;
            int var149 = var145 * 256 / var146;
            byte var150 = arg1.field7347 == null ? 0 : arg1.field7347[var26];
            if (var150 == 0) {
                class157 var151 = var13[var134];
                var151.field2041 += var147;
                var151.field2040 += var148;
                var151.field2042++;
                var151.field2043 += var149;
                class157 var152 = var13[var135];
                var152.field2041 += var147;
                var152.field2040 += var148;
                var152.field2042++;
                var152.field2043 += var149;
                class157 var153 = var13[var136];
                var153.field2040 += var148;
                var153.field2043 += var149;
                var153.field2042++;
                var153.field2041 += var147;
            } else if (var150 == 1) {
                class597 var154 = var25[var26] = new class597();
                var154.field8364 = var148;
                var154.field8366 = var149;
                var154.field8371 = var147;
            }
        }
        for (int var27 = 0; var27 < this.field4661; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field7351[var43] & 0xFFFF;
            int var45;
            if (arg1.field7386 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field7386[var43];
            }
            int var46;
            if (arg1.field7361 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field7361[var43] & 0xFF;
            }
            short var47 = arg1.field7342 == null ? -1 : arg1.field7342[var43];
            if (var47 != -1 && (this.field4753 & 0x40) != 0) {
                class744 var48 = var7.method581(-21732, var47 & 0xFFFF);
                if (var48.field10264) {
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
                    var50 = 1.0F;
                    var53 = 0.0F;
                    var55 = 1;
                    var51 = 1.0F;
                    var49 = 0.0F;
                    var56 = 2;
                    var54 = 0.0F;
                    var52 = 1.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field7380[var45];
                    if (var58 == 0) {
                        short var59 = arg1.field7344[var43];
                        short var60 = arg1.field7371[var43];
                        short var61 = arg1.field7385[var43];
                        short var62 = arg1.field7341[var45];
                        short var63 = arg1.field7370[var45];
                        short var64 = arg1.field7356[var45];
                        float var65 = (float) arg1.field7374[var62];
                        float var66 = (float) arg1.field7375[var62];
                        float var67 = (float) arg1.field7395[var62];
                        float var68 = (float) arg1.field7374[var63] - var65;
                        float var69 = (float) arg1.field7375[var63] - var66;
                        float var70 = (float) arg1.field7395[var63] - var67;
                        float var71 = (float) arg1.field7374[var64] - var65;
                        float var72 = (float) arg1.field7375[var64] - var66;
                        float var73 = (float) arg1.field7395[var64] - var67;
                        float var74 = (float) arg1.field7374[var59] - var65;
                        float var75 = (float) arg1.field7375[var59] - var66;
                        float var76 = (float) arg1.field7395[var59] - var67;
                        float var77 = (float) arg1.field7374[var60] - var65;
                        float var78 = (float) arg1.field7375[var60] - var66;
                        float var79 = (float) arg1.field7395[var60] - var67;
                        float var80 = (float) arg1.field7374[var61] - var65;
                        float var81 = (float) arg1.field7375[var61] - var66;
                        float var82 = (float) arg1.field7395[var61] - var67;
                        float var83 = var69 * var73 - (var70 * var72);
                        float var84 = var70 * var71 - (var68 * var73);
                        float var85 = var68 * var72 - var69 * var71;
                        float var86 = var72 * var85 - var73 * var84;
                        float var87 = var73 * var83 - (var71 * var85);
                        float var88 = var71 * var84 - (var72 * var83);
                        float var89 = 1.0F / (var70 * var88 + var68 * var86 + var69 * var87);
                        var51 = (var79 * var88 + var77 * var86 + var78 * var87) * var89;
                        var49 = (var76 * var88 + var74 * var86 + var75 * var87) * var89;
                        var53 = (var82 * var88 + var80 * var86 + var81 * var87) * var89;
                        float var90 = var68 * var84 - var69 * var83;
                        float var91 = var70 * var83 - (var68 * var85);
                        float var92 = var69 * var85 - (var70 * var84);
                        float var93 = 1.0F / (var73 * var90 + var71 * var92 + var72 * var91);
                        var50 = (var76 * var90 + var74 * var92 + var75 * var91) * var93;
                        var52 = (var79 * var90 + var77 * var92 + var78 * var91) * var93;
                        var54 = (var82 * var90 + var80 * var92 + var81 * var91) * var93;
                    } else {
                        short var94 = arg1.field7344[var43];
                        short var95 = arg1.field7371[var43];
                        short var96 = arg1.field7385[var43];
                        int var97 = var24.field8352[var45];
                        int var98 = var24.field8351[var45];
                        int var99 = var24.field8354[var45];
                        float[] var100 = var24.field8353[var45];
                        byte var101 = arg1.field7391[var45];
                        float var102 = (float) arg1.field7367[var45] / 256.0F;
                        if (var58 == 1) {
                            float var103 = (float) arg1.field7355[var45] / 1024.0F;
                            class115.method838(class110.field1327, var103, var99, var102, var97, arg1.field7395[var94], var101, var98, arg1.field7375[var94], 0, arg1.field7374[var94], var100);
                            var49 = class110.field1327[0];
                            var50 = class110.field1327[1];
                            class115.method838(class110.field1327, var103, var99, var102, var97, arg1.field7395[var95], var101, var98, arg1.field7375[var95], 0, arg1.field7374[var95], var100);
                            var51 = class110.field1327[0];
                            var52 = class110.field1327[1];
                            class115.method838(class110.field1327, var103, var99, var102, var97, arg1.field7395[var96], var101, var98, arg1.field7375[var96], 0, arg1.field7374[var96], var100);
                            var54 = class110.field1327[1];
                            var53 = class110.field1327[0];
                            float var104 = var103 / 2.0F;
                            if ((var101 & 0x1) == 0) {
                                if (var104 < var51 - var49) {
                                    var55 = 1;
                                    var51 -= var103;
                                } else if (var49 - var51 > var104) {
                                    var55 = 2;
                                    var51 += var103;
                                }
                                if ((var104 < var53 - var49)) {
                                    var56 = 1;
                                    var53 -= var103;
                                } else if (var104 < var49 - var53) {
                                    var53 += var103;
                                    var56 = 2;
                                }
                            } else {
                                if (var104 < var52 - var50) {
                                    var52 -= var103;
                                    var55 = 1;
                                } else if (var104 < var50 - var52) {
                                    var52 += var103;
                                    var55 = 2;
                                }
                                if ((var104 < var54 - var50)) {
                                    var54 -= var103;
                                    var56 = 1;
                                } else if (var104 < var50 - var54) {
                                    var54 += var103;
                                    var56 = 2;
                                }
                            }
                        } else if (var58 == 2) {
                            float var105 = (float) arg1.field7384[var45] / 256.0F;
                            float var106 = (float) arg1.field7364[var45] / 256.0F;
                            int var107 = arg1.field7374[var95] - arg1.field7374[var94];
                            int var108 = arg1.field7375[var95] - arg1.field7375[var94];
                            int var109 = arg1.field7395[var95] - arg1.field7395[var94];
                            int var110 = arg1.field7374[var96] - arg1.field7374[var94];
                            int var111 = arg1.field7375[var96] - arg1.field7375[var94];
                            int var112 = arg1.field7395[var96] - arg1.field7395[var94];
                            int var113 = var108 * var112 - (var109 * var111);
                            int var114 = var109 * var110 - (var107 * var112);
                            int var115 = var107 * var111 - (var108 * var110);
                            float var116 = 64.0F / (float) arg1.field7346[var45];
                            float var117 = 64.0F / (float) arg1.field7377[var45];
                            float var118 = 64.0F / (float) arg1.field7355[var45];
                            float var119 = (var100[2] * (float) var115 + var100[0] * (float) var113 + var100[1] * (float) var114) / var116;
                            float var120 = (var100[5] * (float) var115 + var100[4] * (float) var114 + var100[3] * (float) var113) / var117;
                            float var121 = (var100[8] * (float) var115 + var100[6] * (float) var113 + var100[7] * (float) var114) / var118;
                            var57 = class121.method858(var121, var119, 3, var120);
                            class245.method1638(var105, class110.field1327, var106, arg1.field7395[var94], var97, var57, var98, var101, var99, arg1.field7374[var94], var102, var100, -35, arg1.field7375[var94]);
                            var50 = class110.field1327[1];
                            var49 = class110.field1327[0];
                            class245.method1638(var105, class110.field1327, var106, arg1.field7395[var95], var97, var57, var98, var101, var99, arg1.field7374[var95], var102, var100, -61, arg1.field7375[var95]);
                            var52 = class110.field1327[1];
                            var51 = class110.field1327[0];
                            class245.method1638(var105, class110.field1327, var106, arg1.field7395[var96], var97, var57, var98, var101, var99, arg1.field7374[var96], var102, var100, -55, arg1.field7375[var96]);
                            var54 = class110.field1327[1];
                            var53 = class110.field1327[0];
                        } else if (var58 == 3) {
                            class598.method3474(class110.field1327, var98, var99, arg1.field7395[var94], arg1.field7375[var94], var102, var100, var97, (byte) -79, arg1.field7374[var94], var101);
                            var50 = class110.field1327[1];
                            var49 = class110.field1327[0];
                            class598.method3474(class110.field1327, var98, var99, arg1.field7395[var95], arg1.field7375[var95], var102, var100, var97, (byte) -103, arg1.field7374[var95], var101);
                            var52 = class110.field1327[1];
                            var51 = class110.field1327[0];
                            class598.method3474(class110.field1327, var98, var99, arg1.field7395[var96], arg1.field7375[var96], var102, var100, var97, (byte) -92, arg1.field7374[var96], var101);
                            var53 = class110.field1327[0];
                            var54 = class110.field1327[1];
                            if ((var101 & 0x1) == 0) {
                                if ((var51 - var49 > 0.5F)) {
                                    var51--;
                                    var55 = 1;
                                } else if (var49 - var51 > 0.5F) {
                                    var51++;
                                    var55 = 2;
                                }
                                if (var53 - var49 > 0.5F) {
                                    var53--;
                                    var56 = 1;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                            } else {
                                if (var54 - var50 > 0.5F) {
                                    var54--;
                                    var56 = 1;
                                } else if (var50 - var54 > 0.5F) {
                                    var56 = 2;
                                    var54++;
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
            if (arg1.field7347 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field7347[var43];
            }
            if (var122 == 0) {
                long var126 = ((long) (var57 << 24) - (-((long) (var44 << 8)) - ((long) var46)) << 32) + (long) (var45 << 2);
                short var128 = arg1.field7344[var43];
                short var129 = arg1.field7371[var43];
                short var130 = arg1.field7385[var43];
                class157 var131 = var13[var128];
                this.field4655[var27] = this.method2112(var49, var50, var126, var131.field2043, arg1, var131.field2042, var128, (byte) -88, var131.field2040, var131.field2041);
                class157 var132 = var13[var129];
                this.field4746[var27] = this.method2112(var51, var52, (long) var55 + var126, var132.field2043, arg1, var132.field2042, var129, (byte) -85, var132.field2040, var132.field2041);
                class157 var133 = var13[var130];
                this.field4711[var27] = this.method2112(var53, var54, (long) var56 + var126, var133.field2043, arg1, var133.field2042, var130, (byte) -124, var133.field2040, var133.field2041);
            } else if (var122 == 1) {
                class597 var123 = var25[var43];
                long var124 = ((long) (var44 << 8) + (long) (var57 << 24) + ((long) var46) << 32) + (long) ((var123.field8371 + 256 << 12) + ((var123.field8364 > 0 ? 1024 : 2048) + (var45 << 2) + (var123.field8366 + 256 << 22)));
                this.field4655[var27] = this.method2112(var49, var50, var124, var123.field8366, arg1, 0, arg1.field7344[var43], (byte) -109, var123.field8364, var123.field8371);
                this.field4746[var27] = this.method2112(var51, var52, (long) var55 + var124, var123.field8366, arg1, 0, arg1.field7371[var43], (byte) -107, var123.field8364, var123.field8371);
                this.field4711[var27] = this.method2112(var53, var54, (long) var56 + var124, var123.field8366, arg1, 0, arg1.field7385[var43], (byte) -85, var123.field8364, var123.field8371);
            }
            if (arg1.field7361 != null) {
                this.field4682[var27] = arg1.field7361[var43];
            }
            if (arg1.field7382 != null) {
                this.field4667[var27] = arg1.field7382[var43];
            }
            this.field4697[var27] = arg1.field7351[var43];
            this.field4648[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field4691; var30++) {
            short var42 = this.field4648[var30];
            if (var29 != var42) {
                var28++;
                var29 = var42;
            }
        }
        this.field4689 = new int[var28 + 1];
        short var31 = -10000;
        int var32 = 0;
        for (int var33 = 0; var33 < this.field4691; var33++) {
            short var41 = this.field4648[var33];
            if (var31 != var41) {
                var31 = var41;
                this.field4689[var32++] = var33;
            }
        }
        this.field4689[var32] = this.field4691;
        class183.field2296 = null;
        this.field4692 = class405.method2482(2, this.field4692, this.field4712);
        this.field4690 = class405.method2482(2, this.field4690, this.field4712);
        this.field4716 = class405.method2482(2, this.field4716, this.field4712);
        this.field4750 = class83.method626(this.field4712, (byte) -69, this.field4750);
        this.field4680 = class177.method1131(-28, this.field4680, this.field4712);
        this.field4734 = class177.method1131(-69, this.field4734, this.field4712);
        if (arg1.field7365 != null && class500.method2933(this.field4753, 32, arg2)) {
            this.field4664 = arg1.method3169(false, -1);
        }
        if (arg1.field7381 != null && class486.method2886(this.field4753, arg2, -1)) {
            this.field4701 = arg1.method3173(0);
        }
        if (arg1.field7388 != null && class275.method1793(this.field4753, true, arg2)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field4661; var36++) {
                int var40 = arg1.field7388[var8[var36]];
                if (var40 >= 0) {
                    int var10002 = var35[var40]++;
                    if (var34 < var40) {
                        var34 = var40;
                    }
                }
            }
            this.field4653 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field4653[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field4661; var38++) {
                int var39 = arg1.field7388[var8[var38]];
                if (var39 >= 0) {
                    this.field4653[var39][var35[var39]++] = var38;
                }
            }
        }
    }
}
