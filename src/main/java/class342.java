import jaclib.memory.Stream;
import jaggl.OpenGL;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class342 extends class500 {

    @OriginalMember(owner = "client!nha", name = "B", descriptor = "I")
    private int field4936 = 0;

    @OriginalMember(owner = "client!nha", name = "cb", descriptor = "Z")
    private boolean field4963 = true;

    @OriginalMember(owner = "client!nha", name = "Wb", descriptor = "Z")
    private boolean field5009 = false;

    @OriginalMember(owner = "client!nha", name = "V", descriptor = "I")
    private int field4956 = 0;

    @OriginalMember(owner = "client!nha", name = "Qb", descriptor = "I")
    private int field5003 = 0;

    @OriginalMember(owner = "client!nha", name = "z", descriptor = "I")
    private int field4934 = 0;

    @OriginalMember(owner = "client!nha", name = "Ec", descriptor = "Z")
    private boolean field5043 = false;

    @OriginalMember(owner = "client!nha", name = "K", descriptor = "Z")
    private boolean field4945 = false;

    @OriginalMember(owner = "client!nha", name = "Kc", descriptor = "I")
    private int field5049 = 0;

    @OriginalMember(owner = "client!nha", name = "qc", descriptor = "Ldia;")
    private class246 field5029;

    @OriginalMember(owner = "client!nha", name = "Hb", descriptor = "Lwe;")
    private class430 field4994;

    @OriginalMember(owner = "client!nha", name = "W", descriptor = "Lwe;")
    private class430 field4957;

    @OriginalMember(owner = "client!nha", name = "zb", descriptor = "Lwe;")
    private class430 field4986;

    @OriginalMember(owner = "client!nha", name = "kc", descriptor = "Lwe;")
    private class430 field5023;

    @OriginalMember(owner = "client!nha", name = "Zb", descriptor = "Lhn;")
    private class752 field5012;

    @OriginalMember(owner = "client!nha", name = "N", descriptor = "I")
    private int field4948;

    @OriginalMember(owner = "client!nha", name = "pb", descriptor = "I")
    private int field4976;

    @OriginalMember(owner = "client!nha", name = "uc", descriptor = "[I")
    private int[] field5033;

    @OriginalMember(owner = "client!nha", name = "nc", descriptor = "[I")
    private int[] field5026;

    @OriginalMember(owner = "client!nha", name = "Ic", descriptor = "[I")
    private int[] field5047;

    @OriginalMember(owner = "client!nha", name = "J", descriptor = "[I")
    private int[] field4944;

    @OriginalMember(owner = "client!nha", name = "H", descriptor = "[S")
    private short[] field4942;

    @OriginalMember(owner = "client!nha", name = "Cc", descriptor = "[Lcba;")
    private class577[] field5041;

    @OriginalMember(owner = "client!nha", name = "Nb", descriptor = "[Lkw;")
    private class263[] field5000;

    @OriginalMember(owner = "client!nha", name = "Bb", descriptor = "I")
    private int field4988;

    @OriginalMember(owner = "client!nha", name = "Rb", descriptor = "[Lvda;")
    private class194[] field5004;

    @OriginalMember(owner = "client!nha", name = "y", descriptor = "[Lkea;")
    private class251[] field4933;

    @OriginalMember(owner = "client!nha", name = "oc", descriptor = "[F")
    private float[] field5027;

    @OriginalMember(owner = "client!nha", name = "sb", descriptor = "[S")
    private short[] field4979;

    @OriginalMember(owner = "client!nha", name = "U", descriptor = "[S")
    private short[] field4955;

    @OriginalMember(owner = "client!nha", name = "mb", descriptor = "[B")
    private byte[] field4973;

    @OriginalMember(owner = "client!nha", name = "Yb", descriptor = "[S")
    private short[] field5011;

    @OriginalMember(owner = "client!nha", name = "qb", descriptor = "S")
    private short field4977;

    @OriginalMember(owner = "client!nha", name = "P", descriptor = "[S")
    private short[] field4950;

    @OriginalMember(owner = "client!nha", name = "R", descriptor = "[S")
    private short[] field4952;

    @OriginalMember(owner = "client!nha", name = "ub", descriptor = "[F")
    private float[] field4981;

    @OriginalMember(owner = "client!nha", name = "Fb", descriptor = "[S")
    private short[] field4992;

    @OriginalMember(owner = "client!nha", name = "cc", descriptor = "[S")
    private short[] field5015;

    @OriginalMember(owner = "client!nha", name = "wc", descriptor = "S")
    private short field5035;

    @OriginalMember(owner = "client!nha", name = "S", descriptor = "[S")
    private short[] field4953;

    @OriginalMember(owner = "client!nha", name = "A", descriptor = "[S")
    private short[] field4935;

    @OriginalMember(owner = "client!nha", name = "Eb", descriptor = "[S")
    private short[] field4991;

    @OriginalMember(owner = "client!nha", name = "jc", descriptor = "[B")
    private byte[] field5022;

    @OriginalMember(owner = "client!nha", name = "Hc", descriptor = "[I")
    private int[] field5046;

    @OriginalMember(owner = "client!nha", name = "Pb", descriptor = "[[I")
    private int[][] field5002;

    @OriginalMember(owner = "client!nha", name = "gb", descriptor = "[[I")
    private int[][] field4967;

    @OriginalMember(owner = "client!nha", name = "ib", descriptor = "[[I")
    private int[][] field4969;

    @OriginalMember(owner = "client!nha", name = "w", descriptor = "[I")
    public static int[] field4931 = new int[256];

    @OriginalMember(owner = "client!nha", name = "yc", descriptor = "I")
    public static int field5037 = -1;

    @OriginalMember(owner = "client!nha", name = "ic", descriptor = "B")
    private byte field5021;

    @OriginalMember(owner = "client!nha", name = "u", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!nha", name = "x", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!nha", name = "C", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!nha", name = "D", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!nha", name = "F", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!nha", name = "G", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!nha", name = "I", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!nha", name = "L", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!nha", name = "M", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!nha", name = "O", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!nha", name = "Q", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!nha", name = "X", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!nha", name = "Y", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!nha", name = "Z", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!nha", name = "ab", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!nha", name = "bb", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!nha", name = "db", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!nha", name = "eb", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!nha", name = "fb", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!nha", name = "hb", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!nha", name = "kb", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!nha", name = "lb", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!nha", name = "nb", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!nha", name = "ob", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!nha", name = "rb", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!nha", name = "tb", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!nha", name = "vb", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!nha", name = "wb", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!nha", name = "xb", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!nha", name = "Ab", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!nha", name = "Cb", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!nha", name = "Db", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!nha", name = "Gb", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!nha", name = "Ib", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!nha", name = "Jb", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!nha", name = "Lb", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!nha", name = "Mb", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!nha", name = "Ob", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!nha", name = "Sb", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!nha", name = "Tb", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!nha", name = "Ub", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!nha", name = "Vb", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!nha", name = "Xb", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!nha", name = "ac", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!nha", name = "bc", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!nha", name = "dc", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!nha", name = "fc", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!nha", name = "gc", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!nha", name = "hc", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!nha", name = "lc", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!nha", name = "mc", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!nha", name = "pc", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!nha", name = "tc", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!nha", name = "vc", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!nha", name = "xc", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!nha", name = "zc", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!nha", name = "Ac", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!nha", name = "Bc", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!nha", name = "Dc", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!nha", name = "Gc", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!nha", name = "Jc", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!nha", name = "Mc", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!nha", name = "E", descriptor = "Lm;")
    private class204 field4939;

    @OriginalMember(owner = "client!nha", name = "rc", descriptor = "Lfha;")
    private class401 field5030;

    @OriginalMember(owner = "client!nha", name = "sc", descriptor = "Lsn;")
    private class658 field5031;

    @OriginalMember(owner = "client!nha", name = "v", descriptor = "S")
    private short field4930;

    @OriginalMember(owner = "client!nha", name = "T", descriptor = "S")
    private short field4954;

    @OriginalMember(owner = "client!nha", name = "jb", descriptor = "S")
    private short field4970;

    @OriginalMember(owner = "client!nha", name = "yb", descriptor = "S")
    private short field4985;

    @OriginalMember(owner = "client!nha", name = "Kb", descriptor = "S")
    private short field4997;

    @OriginalMember(owner = "client!nha", name = "ec", descriptor = "S")
    private short field5017;

    @OriginalMember(owner = "client!nha", name = "Fc", descriptor = "S")
    private short field5044;

    @OriginalMember(owner = "client!nha", name = "Lc", descriptor = "S")
    private short field5050;

    @OriginalMember(owner = "client!nha", name = "wa", descriptor = "()V")
    public final void method305() {
        field4946++;
        for (int var1 = 0; var1 < this.field4956; var1++) {
            this.field5026[var1] = this.field5026[var1] + 7 >> 4;
            this.field5047[var1] = this.field5047[var1] + 7 >> 4;
            this.field4944[var1] = this.field4944[var1] + 7 >> 4;
        }
        this.field5009 = false;
        if (this.field4994 != null) {
            this.field4994.field6116 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method312(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4958++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            class131.field1942 = 0;
            class598.field8139 = 0;
            class250.field3709 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field5002.length) {
                    int[] var15 = this.field5002[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class250.field3709 += this.field5026[var17];
                        class131.field1942 += this.field5047[var17];
                        class598.field8139 += this.field4944[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class250.field3709 = class250.field3709 / var12 + var11;
                class598.field8139 = class598.field8139 / var12 + var9;
                class131.field1942 = class131.field1942 / var12 + var10;
            } else {
                class131.field1942 = var10;
                class598.field8139 = var9;
                class250.field3709 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field5002.length > var22) {
                    int[] var23 = this.field5002[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5026[var25] += var18;
                        this.field5047[var25] += var19;
                        this.field4944[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field5002.length) {
                    int[] var46 = this.field5002[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5026[var59] -= class250.field3709;
                            this.field5047[var59] -= class131.field1942;
                            this.field4944[var59] -= class598.field8139;
                            if (arg4 != 0) {
                                int var60 = class749.field10324[arg4];
                                int var61 = class749.field10316[arg4];
                                int var62 = this.field5047[var59] * var60 + (this.field5026[var59] * var61 + 16383) >> 14;
                                this.field5047[var59] = this.field5047[var59] * var61 + 16383 - (this.field5026[var59] * var60) >> 14;
                                this.field5026[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class749.field10324[arg2];
                                int var64 = class749.field10316[arg2];
                                int var65 = this.field5047[var59] * var64 + 16383 - (this.field4944[var59] * var63) >> 14;
                                this.field4944[var59] = this.field4944[var59] * var64 + this.field5047[var59] * var63 + 16383 >> 14;
                                this.field5047[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class749.field10324[arg3];
                                int var67 = class749.field10316[arg3];
                                int var68 = this.field4944[var59] * var66 - (-(this.field5026[var59] * var67) - 16383) >> 14;
                                this.field4944[var59] = this.field4944[var59] * var67 + 16383 - (this.field5026[var59] * var66) >> 14;
                                this.field5026[var59] = var68;
                            }
                            this.field5026[var59] += class250.field3709;
                            this.field5047[var59] += class131.field1942;
                            this.field4944[var59] += class598.field8139;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5026[var48] -= class250.field3709;
                            this.field5047[var48] -= class131.field1942;
                            this.field4944[var48] -= class598.field8139;
                            if (arg2 != 0) {
                                int var49 = class749.field10324[arg2];
                                int var50 = class749.field10316[arg2];
                                int var51 = this.field5047[var48] * var50 + 16383 - this.field4944[var48] * var49 >> 14;
                                this.field4944[var48] = this.field5047[var48] * var49 + (this.field4944[var48] * var50) + 16383 >> 14;
                                this.field5047[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class749.field10324[arg4];
                                int var53 = class749.field10316[arg4];
                                int var54 = this.field5047[var48] * var52 + this.field5026[var48] * var53 + 16383 >> 14;
                                this.field5047[var48] = this.field5047[var48] * var53 + 16383 - (this.field5026[var48] * var52) >> 14;
                                this.field5026[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class749.field10324[arg3];
                                int var56 = class749.field10316[arg3];
                                int var57 = this.field5026[var48] * var56 + this.field4944[var48] * var55 + 16383 >> 14;
                                this.field4944[var48] = this.field4944[var48] * var56 + 16383 - (this.field5026[var48] * var55) >> 14;
                                this.field5026[var48] = var57;
                            }
                            this.field5026[var48] += class250.field3709;
                            this.field5047[var48] += class131.field1942;
                            this.field4944[var48] += class598.field8139;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field5002.length) {
                        int[] var29 = this.field5002[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5033[var31];
                            int var33 = this.field5033[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5011[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class749.field10324[arg4];
                                    int var37 = class749.field10316[arg4];
                                    int var38 = this.field4950[var35] * var36 + (this.field4979[var35] * var37) + 16383 >> 14;
                                    this.field4950[var35] = (short) (this.field4950[var35] * var37 + 16383 - (this.field4979[var35] * var36) >> 14);
                                    this.field4979[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class749.field10324[arg2];
                                    int var40 = class749.field10316[arg2];
                                    int var41 = this.field4950[var35] * var40 + 16383 - (this.field4992[var35] * var39) >> 14;
                                    this.field4992[var35] = (short) (this.field4950[var35] * var39 + this.field4992[var35] * var40 + 16383 >> 14);
                                    this.field4950[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class749.field10324[arg3];
                                    int var43 = class749.field10316[arg3];
                                    int var44 = this.field4992[var35] * var42 + this.field4979[var35] * var43 + 16383 >> 14;
                                    this.field4992[var35] = (short) (this.field4992[var35] * var43 + 16383 - (this.field4979[var35] * var42) >> 14);
                                    this.field4979[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field4986 == null && this.field5023 != null) {
                    this.field5023.field6116 = null;
                }
                if (this.field4986 != null) {
                    this.field4986.field6116 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field5002.length) {
                    int[] var71 = this.field5002[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5026[var73] -= class250.field3709;
                        this.field5047[var73] -= class131.field1942;
                        this.field4944[var73] -= class598.field8139;
                        this.field5026[var73] = this.field5026[var73] * arg2 >> 7;
                        this.field5047[var73] = this.field5047[var73] * arg3 >> 7;
                        this.field4944[var73] = this.field4944[var73] * arg4 >> 7;
                        this.field5026[var73] += class250.field3709;
                        this.field5047[var73] += class131.field1942;
                        this.field4944[var73] += class598.field8139;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4969 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field4969.length > var78) {
                        int[] var79 = this.field4969[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field4973[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field4973[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field5023 != null) {
                            this.field5023.field6116 = null;
                        }
                    }
                }
                if (this.field4933 != null) {
                    for (int var75 = 0; var75 < this.field4988; var75++) {
                        class251 var76 = this.field4933[var75];
                        class194 var77 = this.field5004[var75];
                        var77.field2596 = var77.field2596 & 0xFFFFFF | 255 - (this.field4973[var76.field3712] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4969 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field4969.length) {
                        int[] var88 = this.field4969[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field4935[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            int var97 = arg4 + var94;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field4935[var90] = (short) class213.method1409(var97, class213.method1409(var95 << 10, var96 << 7));
                        }
                        if (var88.length > 0 && this.field5023 != null) {
                            this.field5023.field6116 = null;
                        }
                    }
                }
                if (this.field4933 != null) {
                    for (int var84 = 0; var84 < this.field4988; var84++) {
                        class251 var85 = this.field4933[var84];
                        class194 var86 = this.field5004[var84];
                        var86.field2596 = var86.field2596 & 0xFF000000 | class145.field2069[this.field4935[var85.field3712] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4967 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field4967.length > var99) {
                        int[] var100 = this.field4967[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class194 var102 = this.field5004[var100[var101]];
                            var102.field2604 += arg3;
                            var102.field2599 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4967 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field4967.length) {
                        int[] var105 = this.field4967[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class194 var107 = this.field5004[var105[var106]];
                            var107.field2593 = var107.field2593 * arg2 >> 7;
                            var107.field2602 = var107.field2602 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4967 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field4967.length > var109) {
                    int[] var110 = this.field4967[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class194 var112 = this.field5004[var110[var111]];
                        var112.field2601 = var112.field2601 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IILuu;ZI)Z")
    public final boolean method291(int arg0, int arg1, class303 arg2, boolean arg3, int arg4) {
        field5016++;
        return this.method2165(arg3, arg1, -1, (byte) -114, arg0, arg4, arg2);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(BIZ)Lka;")
    public final class500 method298(byte arg0, int arg1, boolean arg2) {
        field4966++;
        class342 var4;
        class342 var5;
        if (arg0 == 1) {
            var4 = this.field5029.field3610;
            var5 = this.field5029.field3669;
        } else if (arg0 == 2) {
            var5 = this.field5029.field3655;
            var4 = this.field5029.field3607;
        } else if (arg0 == 3) {
            var5 = this.field5029.field3644;
            var4 = this.field5029.field3667;
        } else if (arg0 == 4) {
            var4 = this.field5029.field3640;
            var5 = this.field5029.field3592;
        } else if (arg0 == 5) {
            var5 = this.field5029.field3594;
            var4 = this.field5029.field3601;
        } else {
            var4 = var5 = new class342(this.field5029);
        }
        return this.method2173(var5, arg2, var4, arg0 != 0, 8, arg1);
    }

    @OriginalMember(owner = "client!nha", name = "r", descriptor = "()Z")
    public final boolean method317() {
        field4974++;
        return this.field5043;
    }

    @OriginalMember(owner = "client!nha", name = "v", descriptor = "()V")
    public final void method340() {
        for (int var1 = 0; var1 < this.field4934; var1++) {
            this.field4944[var1] = -this.field4944[var1];
        }
        field5007++;
        for (int var2 = 0; var2 < this.field5049; var2++) {
            this.field4992[var2] = (short) (-this.field4992[var2]);
        }
        for (int var3 = 0; var3 < this.field5003; var3++) {
            short var4 = this.field5015[var3];
            this.field5015[var3] = this.field4955[var3];
            this.field4955[var3] = var4;
        }
        if (this.field4986 == null && this.field5023 != null) {
            this.field5023.field6116 = null;
        }
        if (this.field4986 != null) {
            this.field4986.field6116 = null;
        }
        if (this.field5012 != null) {
            this.field5012.field10418 = null;
        }
        if (this.field4994 != null) {
            this.field4994.field6116 = null;
        }
        this.field5009 = false;
    }

    @OriginalMember(owner = "client!nha", name = "O", descriptor = "(III)V")
    public final void method318(int arg0, int arg1, int arg2) {
        field4980++;
        for (int var4 = 0; var4 < this.field4934; var4++) {
            if (arg0 != 128) {
                this.field5026[var4] = this.field5026[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5047[var4] = this.field5047[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field4944[var4] = this.field4944[var4] * arg2 >> 7;
            }
        }
        if (this.field4994 != null) {
            this.field4994.field6116 = null;
        }
        this.field5009 = false;
    }

    @OriginalMember(owner = "client!nha", name = "F", descriptor = "()Z")
    public final boolean method326() {
        field4971++;
        return this.field4945;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Luu;IZ)V")
    public final void method320(class303 arg0, int arg1, boolean arg2) {
        field4940++;
        if (this.field4942 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field4934; var5++) {
            if ((this.field4942[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method979(this.field5026[var5], this.field5047[var5], this.field4944[var5], var4);
                } else {
                    arg0.method975(this.field5026[var5], this.field5047[var5], this.field4944[var5], var4);
                }
                this.field5026[var5] = var4[0];
                this.field5047[var5] = var4[1];
                this.field4944[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "HA", descriptor = "()I")
    public final int method294() {
        field5014++;
        if (!this.field5009) {
            this.method2167(-100);
        }
        return this.field5050;
    }

    @OriginalMember(owner = "client!nha", name = "da", descriptor = "()I")
    public final int method304() {
        field4965++;
        return this.field4977;
    }

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "(I)V")
    public static void method2164(int arg0) {
        field4931 = null;
        if (arg0 != -25683) {
            method2175(-28);
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZIIBIILuu;)Z")
    private final boolean method2165(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class303 arg6) {
        field5001++;
        class118 var8 = (class118) arg6;
        class118 var9 = this.field5029.field3563;
        float var10 = var8.field1709 * var9.field1710 + var8.field1719 * var9.field1705 + var8.field1702 * var9.field1697 + var9.field1702;
        float var11 = var8.field1709 * var9.field1717 + var8.field1719 * var9.field1693 + var8.field1702 * var9.field1695 + var9.field1719;
        class447.field6267 = var8.field1708 * var9.field1710 + var8.field1717 * var9.field1705 + var8.field1710 * var9.field1697;
        class436.field6156 = var8.field1715 * var9.field1717 + var8.field1705 * var9.field1695 + var8.field1693 * var9.field1693;
        float var12 = var8.field1709 * var9.field1708 + var8.field1719 * var9.field1715 + var8.field1702 * var9.field1690 + var9.field1709;
        class525.field7189 = var8.field1690 * var9.field1710 + var8.field1697 * var9.field1697 + var8.field1695 * var9.field1705;
        class366.field5327 = var8.field1708 * var9.field1717 + var8.field1717 * var9.field1693 + var8.field1710 * var9.field1695;
        class723.field10068 = var8.field1715 * var9.field1708 + var8.field1705 * var9.field1690 + var8.field1693 * var9.field1715;
        class602.field8192 = var8.field1690 * var9.field1708 + var8.field1697 * var9.field1690 + var8.field1695 * var9.field1715;
        class733.field10167 = var8.field1715 * var9.field1710 + var8.field1705 * var9.field1697 + var8.field1693 * var9.field1705;
        class265.field3924 = var8.field1708 * var9.field1708 + var8.field1717 * var9.field1715 + var8.field1710 * var9.field1690;
        class709.field9936 = var8.field1690 * var9.field1717 + var8.field1697 * var9.field1695 + var8.field1695 * var9.field1693;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field5029.field3582;
        int var19 = this.field5029.field3638;
        if (!this.field5009) {
            this.method2167(-109);
        }
        int var20 = this.field4970 - this.field4997 >> 1;
        int var21 = this.field4954 - this.field4930 >> 1;
        int var22 = this.field4985 - this.field5050 >> 1;
        int var23 = this.field4997 + var20;
        int var24 = this.field4930 + var21;
        int var25 = this.field5050 + var22;
        int var26 = var23 - (var20 << arg5);
        int var27 = var24 - (var21 << arg5);
        if (arg3 != -114) {
            return false;
        }
        int var28 = var25 - (var22 << arg5);
        int var29 = var23 + (var20 << arg5);
        int var30 = (var21 << arg5) + var24;
        class782.field10739[0] = var26;
        int var31 = (var22 << arg5) + var25;
        class52.field753[0] = var27;
        class222.field3055[0] = var28;
        class782.field10739[1] = var29;
        class52.field753[1] = var27;
        class222.field3055[1] = var28;
        class782.field10739[2] = var26;
        class52.field753[2] = var30;
        class222.field3055[2] = var28;
        class782.field10739[3] = var29;
        class52.field753[3] = var30;
        class782.field10739[4] = var26;
        class222.field3055[3] = var28;
        class52.field753[4] = var27;
        class222.field3055[4] = var31;
        class782.field10739[5] = var29;
        class52.field753[5] = var27;
        class782.field10739[6] = var26;
        class222.field3055[5] = var31;
        class52.field753[6] = var30;
        class222.field3055[6] = var31;
        class782.field10739[7] = var29;
        class52.field753[7] = var30;
        class222.field3055[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class782.field10739[var32];
            float var54 = (float) class222.field3055[var32];
            float var55 = (float) class52.field753[var32];
            float var56 = class447.field6267 * var54 + class733.field10167 * var55 + class525.field7189 * var53 + var10;
            float var57 = class366.field5327 * var54 + class709.field9936 * var53 + class436.field6156 * var55 + var11;
            float var58 = class265.field3924 * var54 + class723.field10068 * var55 + class602.field8192 * var53 + var12;
            if ((float) this.field5029.field3602 <= var58) {
                if (arg2 > 0) {
                    var58 = arg2;
                }
                float var59 = (float) var18 * var56 / var58 + (float) this.field5029.field3675;
                if (var59 < var14) {
                    var14 = var59;
                }
                float var60 = (float) var19 * var57 / var58 + (float) this.field5029.field3654;
                if (var59 > var15) {
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
        if (var13 && var14 < (float) arg4 && (float) arg4 < var15 && var16 < (float) arg1 && var17 > (float) arg1) {
            if (arg0) {
                return true;
            }
            if (this.field5029.field3679.length < this.field5049) {
                this.field5029.field3679 = new int[this.field5049];
                this.field5029.field3681 = new int[this.field5049];
            }
            int[] var33 = this.field5029.field3679;
            int[] var34 = this.field5029.field3681;
            for (int var35 = 0; var35 < this.field4934; var35++) {
                float var37 = (float) this.field5047[var35];
                float var38 = (float) this.field5026[var35];
                float var39 = (float) this.field4944[var35];
                float var40 = class265.field3924 * var39 + class723.field10068 * var37 + class602.field8192 * var38 + var12;
                float var41 = class447.field6267 * var39 + class733.field10167 * var37 + class525.field7189 * var38 + var10;
                float var42 = class366.field5327 * var39 + class709.field9936 * var38 + class436.field6156 * var37 + var11;
                if (var40 >= (float) this.field5029.field3602) {
                    if (arg2 > 0) {
                        var40 = arg2;
                    }
                    int var43 = (int) ((float) var18 * var41 / var40 + (float) this.field5029.field3675);
                    int var44 = (int) ((float) var19 * var42 / var40 + (float) this.field5029.field3654);
                    int var45 = this.field5033[var35];
                    int var46 = this.field5033[var35 + 1];
                    for (int var47 = var45; var47 < var46; var47++) {
                        int var48 = this.field5011[var47] - 1;
                        if (var48 == -1) {
                            break;
                        }
                        var33[var48] = var43;
                        var34[var48] = var44;
                    }
                } else {
                    int var49 = this.field5033[var35];
                    int var50 = this.field5033[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field5011[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[this.field5011[var51] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field5003; var36++) {
                if (var33[this.field5015[var36]] != -999999 && var33[this.field4952[var36]] != -999999 && var33[this.field4955[var36]] != -999999 && this.method2176(arg4, (byte) -115, var34[this.field5015[var36]], var33[this.field4952[var36]], var33[this.field4955[var36]], var34[this.field4952[var36]], arg1, var33[this.field5015[var36]], var34[this.field4955[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nha", name = "FA", descriptor = "(I)V")
    public final void method331(int arg0) {
        field5042++;
        int var2 = class749.field10324[arg0];
        int var3 = class749.field10316[arg0];
        for (int var4 = 0; var4 < this.field4934; var4++) {
            int var5 = this.field5047[var4] * var3 - this.field4944[var4] * var2 >> 14;
            this.field4944[var4] = this.field5047[var4] * var2 + this.field4944[var4] * var3 >> 14;
            this.field5047[var4] = var5;
        }
        this.field5009 = false;
        if (this.field4994 != null) {
            this.field4994.field6116 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "na", descriptor = "()I")
    public final int method315() {
        if (!this.field5009) {
            this.method2167(-57);
        }
        field5018++;
        return this.field5044;
    }

    @OriginalMember(owner = "client!nha", name = "VA", descriptor = "(I)V")
    public final void method336(int arg0) {
        field4938++;
        int var2 = class749.field10324[arg0];
        int var3 = class749.field10316[arg0];
        for (int var4 = 0; var4 < this.field4934; var4++) {
            int var5 = this.field5047[var4] * var2 + this.field5026[var4] * var3 >> 14;
            this.field5047[var4] = this.field5047[var4] * var3 - this.field5026[var4] * var2 >> 14;
            this.field5026[var4] = var5;
        }
        this.field5009 = false;
        if (this.field4994 != null) {
            this.field4994.field6116 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "NA", descriptor = "()Z")
    public final boolean method332() {
        field4932++;
        if (this.field5002 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field4956; var1++) {
            this.field5026[var1] <<= 0x4;
            this.field5047[var1] <<= 0x4;
            this.field4944[var1] <<= 0x4;
        }
        class250.field3709 = 0;
        class598.field8139 = 0;
        class131.field1942 = 0;
        return true;
    }

    @OriginalMember(owner = "client!nha", name = "s", descriptor = "(I)V")
    public final void method295(int arg0) {
        field5036++;
        this.field4948 = arg0;
        if (this.field5031 != null && (this.field4948 & 0x10000) == 0) {
            this.field5022 = this.field5031.field9106;
            this.field4950 = this.field5031.field9109;
            this.field4979 = this.field5031.field9110;
            this.field4992 = this.field5031.field9108;
            this.field5031 = null;
        }
        this.field4963 = true;
        this.method2172(true);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IILuu;ZII)Z")
    public final boolean method311(int arg0, int arg1, class303 arg2, boolean arg3, int arg4, int arg5) {
        field4983++;
        return this.method2165(arg3, arg1, arg5, (byte) -114, arg0, arg4, arg2);
    }

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "()[Lkw;")
    public final class263[] method308() {
        field4990++;
        return this.field5000;
    }

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "(I)V")
    private final void method2166(int arg0) {
        field4984++;
        if (this.field4936 == 0) {
            return;
        }
        if (this.field5021 != 0) {
            this.method2174((byte) 49, true);
        }
        if (arg0 != 1559402986) {
            this.method2174((byte) 33, true);
        }
        this.method2174((byte) 124, false);
        if (this.field5012 != null) {
            if (this.field5012.field10418 == null) {
                this.method2169((this.field5021 & 0x10) != 0, (byte) 107);
            }
            if (this.field5012.field10418 != null) {
                this.field5029.method1617(this.field4986 != null, (byte) -118);
                this.field5029.method1600(this.field4986, this.field5023, this.field4994, (byte) 102, this.field4957);
                int var2 = this.field5046.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5046[var3];
                    int var5 = this.field5046[var3 + 1];
                    int var6 = this.field4991[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field5029.method1614(this.field4986 != null, var6, 1);
                    this.field5029.method1586(this.field5012.field10418, (var5 - var4) * 3, 4, true, var4 * 3);
                }
            }
        }
        this.method2172(true);
    }

    @OriginalMember(owner = "client!nha", name = "ua", descriptor = "()I")
    public final int method325() {
        field4929++;
        return this.field4948;
    }

    @OriginalMember(owner = "client!nha", name = "P", descriptor = "(IIII)V")
    public final void method334(int arg0, int arg1, int arg2, int arg3) {
        field5032++;
        if (arg0 == 0) {
            class250.field3709 = 0;
            int var5 = 0;
            class598.field8139 = 0;
            class131.field1942 = 0;
            for (int var6 = 0; var6 < this.field4934; var6++) {
                class250.field3709 += this.field5026[var6];
                class131.field1942 += this.field5047[var6];
                class598.field8139 += this.field4944[var6];
                var5++;
            }
            if (var5 <= 0) {
                class250.field3709 = arg1;
                class131.field1942 = arg2;
                class598.field8139 = arg3;
            } else {
                class250.field3709 = class250.field3709 / var5 + arg1;
                class131.field1942 = class131.field1942 / var5 + arg2;
                class598.field8139 = class598.field8139 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4934; var7++) {
                this.field5026[var7] += arg1;
                this.field5047[var7] += arg2;
                this.field4944[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4934; var8++) {
                this.field5026[var8] -= class250.field3709;
                this.field5047[var8] -= class131.field1942;
                this.field4944[var8] -= class598.field8139;
                if (arg3 != 0) {
                    int var9 = class749.field10324[arg3];
                    int var10 = class749.field10316[arg3];
                    int var11 = this.field5047[var8] * var9 + this.field5026[var8] * var10 + 16383 >> 14;
                    this.field5047[var8] = this.field5047[var8] * var10 + 16383 - (this.field5026[var8] * var9) >> 14;
                    this.field5026[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class749.field10324[arg1];
                    int var13 = class749.field10316[arg1];
                    int var14 = this.field5047[var8] * var13 + 16383 - (this.field4944[var8] * var12) >> 14;
                    this.field4944[var8] = this.field5047[var8] * var12 + this.field4944[var8] * var13 + 16383 >> 14;
                    this.field5047[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class749.field10324[arg2];
                    int var16 = class749.field10316[arg2];
                    int var17 = this.field5026[var8] * var16 + this.field4944[var8] * var15 + 16383 >> 14;
                    this.field4944[var8] = this.field4944[var8] * var16 + 16383 - (this.field5026[var8] * var15) >> 14;
                    this.field5026[var8] = var17;
                }
                this.field5026[var8] += class250.field3709;
                this.field5047[var8] += class131.field1942;
                this.field4944[var8] += class598.field8139;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4934; var18++) {
                this.field5026[var18] -= class250.field3709;
                this.field5047[var18] -= class131.field1942;
                this.field4944[var18] -= class598.field8139;
                this.field5026[var18] = this.field5026[var18] * arg1 / 128;
                this.field5047[var18] = this.field5047[var18] * arg2 / 128;
                this.field4944[var18] = this.field4944[var18] * arg3 / 128;
                this.field5026[var18] += class250.field3709;
                this.field5047[var18] += class131.field1942;
                this.field4944[var18] += class598.field8139;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5003; var19++) {
                int var23 = (this.field4973[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field4973[var19] = (byte) var23;
            }
            if (this.field5023 != null) {
                this.field5023.field6116 = null;
            }
            if (this.field4933 != null) {
                for (int var20 = 0; var20 < this.field4988; var20++) {
                    class251 var21 = this.field4933[var20];
                    class194 var22 = this.field5004[var20];
                    var22.field2596 = 255 - (this.field4973[var21.field3712] & 0xFF) << 24 | var22.field2596 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5003; var24++) {
                int var28 = this.field4935[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3F3) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg1 + var29 & 0x3F;
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
                this.field4935[var24] = (short) class213.method1409(var34, class213.method1409(var33 << 7, var32 << 10));
            }
            if (this.field5023 != null) {
                this.field5023.field6116 = null;
            }
            if (this.field4933 != null) {
                for (int var25 = 0; var25 < this.field4988; var25++) {
                    class251 var26 = this.field4933[var25];
                    class194 var27 = this.field5004[var25];
                    var27.field2596 = var27.field2596 & 0xFF000000 | class145.field2069[this.field4935[var26.field3712] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field4988; var35++) {
                class194 var36 = this.field5004[var35];
                var36.field2604 += arg2;
                var36.field2599 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field4988; var37++) {
                class194 var38 = this.field5004[var37];
                var38.field2602 = var38.field2602 * arg2 >> 7;
                var38.field2593 = var38.field2593 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field4988; var39++) {
                class194 var40 = this.field5004[var39];
                var40.field2601 = var40.field2601 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "()V")
    public final void method328() {
        field5010++;
    }

    @OriginalMember(owner = "client!nha", name = "ma", descriptor = "()I")
    public final int method339() {
        if (!this.field5009) {
            this.method2167(-107);
        }
        field4949++;
        return this.field5017;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "()[Lcba;")
    public final class577[] method341() {
        field5020++;
        return this.field5041;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIII)V")
    public final void method293(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field5003; var5++) {
            int var9 = this.field4935[var5] & 0xFFFF;
            int var10 = (var9 & 0xFC54) >> 10;
            int var11 = (var9 & 0x3AC) >> 7;
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field4935[var5] = (short) class213.method1409(var12, class213.method1409(var11 << 7, var10 << 10));
        }
        field4972++;
        if (this.field4933 != null) {
            for (int var6 = 0; var6 < this.field4988; var6++) {
                class251 var7 = this.field4933[var6];
                class194 var8 = this.field5004[var6];
                var8.field2596 = var8.field2596 & 0xFF000000 | class145.field2069[this.field4935[var7.field3712] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5023 != null) {
            this.field5023.field6116 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "()V")
    public final void method337() {
        field5048++;
        if (this.field5049 <= 0 || this.field4936 <= 0) {
            return;
        }
        this.method2174((byte) 119, false);
        if ((this.field5021 & 0x10) == 0 && this.field5012.field10418 == null) {
            this.method2169(false, (byte) 118);
        }
        this.method2172(true);
    }

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "(I)V")
    private final void method2167(int arg0) {
        field5024++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        if (arg0 > -26) {
            this.field4967 = null;
        }
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4934; var10++) {
            int var11 = this.field5026[var10];
            int var12 = this.field5047[var10];
            int var13 = this.field4944[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field4997 = (short) var2;
        this.field5050 = (short) var4;
        this.field4954 = (short) var6;
        this.field4930 = (short) var3;
        this.field4985 = (short) var7;
        this.field4970 = (short) var5;
        this.field5044 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field5017 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field5009 = true;
    }

    @OriginalMember(owner = "client!nha", name = "LA", descriptor = "(I)V")
    public final void method343(int arg0) {
        field4987++;
        if (this.field5023 != null) {
            this.field5023.field6116 = null;
        }
        this.field4977 = (short) arg0;
        if (this.field4986 != null) {
            this.field4986.field6116 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "H", descriptor = "(III)V")
    public final void method313(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4934; var4++) {
            if (arg0 != 0) {
                this.field5026[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5047[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field4944[var4] += arg2;
            }
        }
        field4941++;
        if (this.field4994 != null) {
            this.field4994.field6116 = null;
        }
        this.field5009 = false;
    }

    @OriginalMember(owner = "client!nha", name = "aa", descriptor = "(SS)V")
    public final void method299(short arg0, short arg1) {
        field4978++;
        class161 var3 = this.field5029.field912;
        for (int var4 = 0; var4 < this.field5003; var4++) {
            if (this.field4991[var4] == arg0) {
                this.field4991[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class662 var7 = var3.method1174(arg0 & 0xFFFF, true);
            var6 = var7.field9133;
            var5 = var7.field9146;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class662 var10 = var3.method1174(arg1 & 0xFFFF, true);
            if (var10.field9152 != 0 || var10.field9157 != 0) {
                this.field5043 = true;
            }
            var9 = var10.field9133;
            var8 = var10.field9146;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field4933 != null) {
            for (int var11 = 0; var11 < this.field4988; var11++) {
                class251 var12 = this.field4933[var11];
                class194 var13 = this.field5004[var11];
                var13.field2596 = var13.field2596 & 0xFF000000 | class145.field2069[this.field4935[var12.field3712] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5023 != null) {
            this.field5023.field6116 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method297(class500 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4996++;
        class342 var6 = (class342) arg0;
        if (this.field5003 == 0 || var6.field5003 == 0) {
            return;
        }
        int var7 = var6.field4934;
        int[] var8 = var6.field5026;
        int[] var9 = var6.field5047;
        int[] var10 = var6.field4944;
        short[] var11 = var6.field4979;
        short[] var12 = var6.field4950;
        short[] var13 = var6.field4992;
        byte[] var14 = var6.field5022;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field5031 == null) {
            var16 = null;
            var15 = null;
            var18 = null;
            var17 = null;
        } else {
            var15 = this.field5031.field9108;
            var16 = this.field5031.field9110;
            var17 = this.field5031.field9106;
            var18 = this.field5031.field9109;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field5031 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field5031.field9110;
            var21 = var6.field5031.field9108;
            var22 = var6.field5031.field9106;
            var20 = var6.field5031.field9109;
        }
        int[] var23 = var6.field5033;
        short[] var24 = var6.field5011;
        if (!var6.field5009) {
            var6.method2167(-75);
        }
        short var25 = var6.field4930;
        short var26 = var6.field4954;
        short var27 = var6.field4997;
        short var28 = var6.field4970;
        short var29 = var6.field5050;
        short var30 = var6.field4985;
        for (int var31 = 0; var31 < this.field4934; var31++) {
            int var32 = this.field5047[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field5026[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field4944[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5033[var31];
                        int var37 = this.field5033[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5011[var38] - 1;
                            if (var35 == -1 || this.field5022[var35] != 0) {
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
                                            this.field5031 = new class658();
                                            var16 = this.field5031.field9110 = class509.method2951(-29647, this.field4979);
                                            var18 = this.field5031.field9109 = class509.method2951(-29647, this.field4950);
                                            var15 = this.field5031.field9108 = class509.method2951(-29647, this.field4992);
                                            var17 = this.field5031.field9106 = class548.method3110(false, this.field5022);
                                        }
                                        if (var19 == null) {
                                            class658 var44 = var6.field5031 = new class658();
                                            var19 = var44.field9110 = class509.method2951(-29647, var11);
                                            var20 = var44.field9109 = class509.method2951(-29647, var12);
                                            var21 = var44.field9108 = class509.method2951(-29647, var13);
                                            var22 = var44.field9106 = class548.method3110(false, var14);
                                        }
                                        short var45 = this.field4979[var35];
                                        short var46 = this.field4950[var35];
                                        short var47 = this.field4992[var35];
                                        byte var48 = this.field5022[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var13[var42];
                                        short var54 = var12[var42];
                                        int var55 = this.field5033[var31 + 1];
                                        int var56 = this.field5033[var31];
                                        short var57 = var11[var42];
                                        byte var58 = var14[var42];
                                        for (int var59 = var56; var59 < var55; var59++) {
                                            int var60 = this.field5011[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var57;
                                                var18[var60] += var54;
                                                var15[var60] += var53;
                                                var17[var60] += var58;
                                            }
                                        }
                                        if (this.field4986 == null && this.field5023 != null) {
                                            this.field5023.field6116 = null;
                                        }
                                        if (this.field4986 != null) {
                                            this.field4986.field6116 = null;
                                        }
                                        if (var6.field4986 == null && var6.field5023 != null) {
                                            var6.field5023.field6116 = null;
                                        }
                                        if (var6.field4986 != null) {
                                            var6.field4986.field6116 = null;
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

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Luu;Ltaa;II)V")
    public final void method300(class303 arg0, class431 arg1, int arg2, int arg3) {
        field5025++;
        if (this.field5049 == 0) {
            return;
        }
        class118 var5 = this.field5029.field3563;
        class118 var6 = (class118) arg0;
        if (!this.field5009) {
            this.method2167(-99);
        }
        class723.field10068 = var5.field1708 * var6.field1715 + var5.field1715 * var6.field1693 + var5.field1690 * var6.field1705;
        class86.field1194 = var5.field1708 * var6.field1709 + var5.field1715 * var6.field1719 + var5.field1690 * var6.field1702 + var5.field1709;
        float var7 = (float) this.field4930 * class723.field10068 + class86.field1194;
        float var8 = (float) this.field4954 * class723.field10068 + class86.field1194;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = var8 - (float) this.field5044;
            var10 = (float) this.field5044 + var7;
        } else {
            var9 = var7 - (float) this.field5044;
            var10 = (float) this.field5044 + var8;
        }
        if ((this.field5029.field3673 <= var9) || ((float) this.field5029.field3602 >= var10)) {
            return;
        }
        class304.field4370 = var5.field1710 * var6.field1709 + var5.field1705 * var6.field1719 + var5.field1697 * var6.field1702 + var5.field1702;
        class733.field10167 = var5.field1710 * var6.field1715 + var5.field1705 * var6.field1693 + var5.field1697 * var6.field1705;
        float var11 = (float) this.field4930 * class733.field10167 + class304.field4370;
        float var12 = (float) this.field4954 * class733.field10167 + class304.field4370;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field5044 + var11) * (float) this.field5029.field3582;
            var14 = (var12 - (float) this.field5044) * (float) this.field5029.field3582;
        } else {
            var13 = ((float) this.field5044 + var12) * (float) this.field5029.field3582;
            var14 = (var11 - (float) this.field5044) * (float) this.field5029.field3582;
        }
        if ((var14 / (float) arg2 >= this.field5029.field3597) || (this.field5029.field3634 >= var13 / (float) arg2)) {
            return;
        }
        class436.field6156 = var5.field1717 * var6.field1715 + var5.field1695 * var6.field1705 + var5.field1693 * var6.field1693;
        class334.field4864 = var5.field1717 * var6.field1709 + var5.field1695 * var6.field1702 + var5.field1693 * var6.field1719 + var5.field1719;
        float var15 = (float) this.field4930 * class436.field6156 + class334.field4864;
        float var16 = (float) this.field4954 * class436.field6156 + class334.field4864;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = ((float) this.field5044 + var15) * (float) this.field5029.field3638;
            var17 = (var16 - (float) this.field5044) * (float) this.field5029.field3638;
        } else {
            var17 = (var15 - (float) this.field5044) * (float) this.field5029.field3638;
            var18 = ((float) this.field5044 + var16) * (float) this.field5029.field3638;
        }
        if ((var17 / (float) arg2 >= this.field5029.field3581) || (this.field5029.field3616 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field4933 != null) {
            class602.field8192 = var5.field1708 * var6.field1690 + var5.field1715 * var6.field1695 + var5.field1690 * var6.field1697;
            class265.field3924 = var5.field1708 * var6.field1708 + var5.field1715 * var6.field1717 + var5.field1690 * var6.field1710;
            class447.field6267 = var5.field1710 * var6.field1708 + var5.field1705 * var6.field1717 + var5.field1697 * var6.field1710;
            class709.field9936 = var5.field1717 * var6.field1690 + var5.field1695 * var6.field1697 + var5.field1693 * var6.field1695;
            class525.field7189 = var5.field1710 * var6.field1690 + var5.field1705 * var6.field1695 + var5.field1697 * var6.field1697;
            class366.field5327 = var5.field1717 * var6.field1708 + var5.field1695 * var6.field1710 + var5.field1693 * var6.field1717;
        }
        if (arg1 != null) {
            int var19 = this.field4997 + this.field4970 >> 1;
            int var20 = this.field5050 + this.field4985 >> 1;
            int var21 = (int) ((float) var20 * class447.field6267 + (float) this.field4930 * class733.field10167 + (float) var19 * class525.field7189 + class304.field4370);
            int var22 = (int) ((float) var20 * class366.field5327 + (float) this.field4930 * class436.field6156 + (float) var19 * class709.field9936 + class334.field4864);
            int var23 = (int) ((float) var20 * class265.field3924 + (float) this.field4930 * class723.field10068 + (float) var19 * class602.field8192 + class86.field1194);
            int var24 = (int) ((float) var20 * class447.field6267 + (float) this.field4954 * class733.field10167 + (float) var19 * class525.field7189 + class304.field4370);
            int var25 = (int) ((float) var20 * class366.field5327 + (float) this.field4954 * class436.field6156 + (float) var19 * class709.field9936 + class334.field4864);
            int var26 = (int) ((float) var20 * class265.field3924 + (float) this.field4954 * class723.field10068 + (float) var19 * class602.field8192 + class86.field1194);
            arg1.field6122 = this.field5029.field3638 * var25 / arg2 + this.field5029.field3654;
            arg1.field6124 = this.field5029.field3638 * var22 / arg2 + this.field5029.field3654;
            arg1.field6125 = this.field5029.field3582 * var24 / arg2 + this.field5029.field3675;
            arg1.field6123 = this.field5029.field3582 * var21 / arg2 + this.field5029.field3675;
            if (this.field5029.field3602 <= var23 || var26 >= this.field5029.field3602) {
                arg1.field6126 = true;
                arg1.field6121 = (var21 + this.field5044) * this.field5029.field3582 / arg2 + this.field5029.field3675 - arg1.field6123;
            }
        }
        this.field5029.method1613(20980, (float) arg2);
        this.field5029.method1650((byte) 16);
        this.field5029.method1643(-119, var6);
        this.method2166(1559402986);
        this.field5029.method1599(-97);
        this.method2170(38);
    }

    @OriginalMember(owner = "client!nha", name = "WA", descriptor = "()I")
    public final int method309() {
        field4989++;
        return this.field5035;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lgfa;JIFIIIFII)S")
    private final short method2168(class782 arg0, long arg1, int arg2, float arg3, int arg4, int arg5, int arg6, float arg7, int arg8, int arg9) {
        field4982++;
        int var12 = this.field5033[arg9];
        if (arg6 < 80) {
            return -36;
        }
        int var13 = this.field5033[arg9 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field5011[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class602.field8188[var15] == arg1) {
                return (short) (var16 - 1);
            }
        }
        this.field5011[var14] = (short) (this.field5049 + 1);
        class602.field8188[var14] = arg1;
        this.field4979[this.field5049] = (short) arg4;
        this.field4950[this.field5049] = (short) arg5;
        this.field4992[this.field5049] = (short) arg2;
        this.field5022[this.field5049] = (byte) arg8;
        this.field4981[this.field5049] = arg3;
        this.field5027[this.field5049] = arg7;
        return (short) (this.field5049++);
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
    public final void method329(int arg0) {
        field5045++;
        int var2 = class749.field10324[arg0];
        int var3 = class749.field10316[arg0];
        for (int var4 = 0; var4 < this.field4934; var4++) {
            int var5 = this.field5026[var4] * var3 + this.field4944[var4] * var2 >> 14;
            this.field4944[var4] = this.field4944[var4] * var3 - (this.field5026[var4] * var2) >> 14;
            this.field5026[var4] = var5;
        }
        if (this.field4994 != null) {
            this.field4994.field6116 = null;
        }
        this.field5009 = false;
    }

    @OriginalMember(owner = "client!nha", name = "G", descriptor = "()I")
    public final int method330() {
        if (!this.field5009) {
            this.method2167(-102);
        }
        field4964++;
        return this.field4985;
    }

    @OriginalMember(owner = "client!nha", name = "ba", descriptor = "(Lr;)Lr;")
    public final class195 method322(class195 arg0) {
        field5034++;
        if (this.field5049 == 0) {
            return null;
        }
        if (!this.field5009) {
            this.method2167(-124);
        }
        int var2;
        int var3;
        if (this.field5029.field3568 <= 0) {
            var2 = this.field4997 - (this.field5029.field3568 * this.field4930 >> 8) >> this.field5029.field3529;
            var3 = this.field4970 - (this.field5029.field3568 * this.field4954 >> 8) >> this.field5029.field3529;
        } else {
            var2 = this.field4997 - (this.field5029.field3568 * this.field4954 >> 8) >> this.field5029.field3529;
            var3 = this.field4970 - (this.field5029.field3568 * this.field4930 >> 8) >> this.field5029.field3529;
        }
        int var4;
        int var5;
        if (this.field5029.field3612 > 0) {
            var4 = this.field5050 - (this.field5029.field3612 * this.field4954 >> 8) >> this.field5029.field3529;
            var5 = this.field4985 - (this.field5029.field3612 * this.field4930 >> 8) >> this.field5029.field3529;
        } else {
            var4 = this.field5050 - (this.field5029.field3612 * this.field4930 >> 8) >> this.field5029.field3529;
            var5 = this.field4985 - (this.field5029.field3612 * this.field4954 >> 8) >> this.field5029.field3529;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 - (var4 - 1);
        class262 var8 = (class262) arg0;
        class262 var9;
        if (var8 != null && var8.method1729(-128, var7, var6)) {
            var9 = var8;
            var8.method1732(0);
        } else {
            var9 = new class262(this.field5029, var6, var7);
        }
        var9.method1733((byte) 57, var2, var3, var5, var4);
        this.method2171(84, var9);
        return var9;
    }

    @OriginalMember(owner = "client!nha", name = "RA", descriptor = "()I")
    public final int method316() {
        field5019++;
        if (!this.field5009) {
            this.method2167(-47);
        }
        return this.field4970;
    }

    @OriginalMember(owner = "client!nha", name = "ia", descriptor = "(SS)V")
    public final void method306(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5003; var3++) {
            if (this.field4935[var3] == arg0) {
                this.field4935[var3] = arg1;
            }
        }
        field4975++;
        if (this.field4933 != null) {
            for (int var4 = 0; var4 < this.field4988; var4++) {
                class251 var5 = this.field4933[var4];
                class194 var6 = this.field5004[var4];
                var6.field2596 = var6.field2596 & 0xFF000000 | class145.field2069[this.field4935[var5.field3712] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5023 != null) {
            this.field5023.field6116 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "C", descriptor = "(I)V")
    public final void method342(int arg0) {
        field5006++;
        this.field5035 = (short) arg0;
        if (this.field5023 != null) {
            this.field5023.field6116 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "()V")
    public final void method301() {
        field5051++;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Luu;)V")
    public final void method296(class303 arg0) {
        field4961++;
        class118 var2 = (class118) arg0;
        if (this.field5041 != null) {
            for (int var3 = 0; var3 < this.field5041.length; var3++) {
                class577 var4 = this.field5041[var3];
                class577 var5 = var4;
                if (var4.field7732 != null) {
                    var5 = var4.field7732;
                }
                var5.field7738 = (int) ((float) this.field4944[var4.field7745] * var2.field1710 + (float) this.field5047[var4.field7745] * var2.field1705 + (float) this.field5026[var4.field7745] * var2.field1697 + var2.field1702);
                var5.field7733 = (int) ((float) this.field4944[var4.field7745] * var2.field1717 + (float) this.field5047[var4.field7745] * var2.field1693 + (float) this.field5026[var4.field7745] * var2.field1695 + var2.field1719);
                var5.field7734 = (int) ((float) this.field4944[var4.field7745] * var2.field1708 + (float) this.field5047[var4.field7745] * var2.field1715 + (float) this.field5026[var4.field7745] * var2.field1690 + var2.field1709);
                var5.field7739 = (int) ((float) this.field4944[var4.field7741] * var2.field1710 + (float) this.field5047[var4.field7741] * var2.field1705 + (float) this.field5026[var4.field7741] * var2.field1697 + var2.field1702);
                var5.field7730 = (int) ((float) this.field4944[var4.field7741] * var2.field1717 + (float) this.field5047[var4.field7741] * var2.field1693 + (float) this.field5026[var4.field7741] * var2.field1695 + var2.field1719);
                var5.field7748 = (int) ((float) this.field4944[var4.field7741] * var2.field1708 + (float) this.field5047[var4.field7741] * var2.field1715 + (float) this.field5026[var4.field7741] * var2.field1690 + var2.field1709);
                var5.field7731 = (int) ((float) this.field4944[var4.field7737] * var2.field1710 + (float) this.field5047[var4.field7737] * var2.field1705 + (float) this.field5026[var4.field7737] * var2.field1697 + var2.field1702);
                var5.field7747 = (int) ((float) this.field4944[var4.field7737] * var2.field1717 + (float) this.field5047[var4.field7737] * var2.field1693 + (float) this.field5026[var4.field7737] * var2.field1695 + var2.field1719);
                var5.field7750 = (int) ((float) this.field4944[var4.field7737] * var2.field1708 + (float) this.field5047[var4.field7737] * var2.field1715 + (float) this.field5026[var4.field7737] * var2.field1690 + var2.field1709);
            }
        }
        if (this.field5000 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5000.length; var6++) {
            class263 var7 = this.field5000[var6];
            class263 var8 = var7;
            if (var7.field3906 != null) {
                var8 = var7.field3906;
            }
            if (var7.field3900 == null) {
                var7.field3900 = var2.method963();
            } else {
                var7.field3900.method986(var2);
            }
            var8.field3902 = (int) ((float) this.field4944[var7.field3908] * var2.field1710 + (float) this.field5047[var7.field3908] * var2.field1705 + (float) this.field5026[var7.field3908] * var2.field1697 + var2.field1702);
            var8.field3907 = (int) ((float) this.field4944[var7.field3908] * var2.field1717 + (float) this.field5047[var7.field3908] * var2.field1693 + (float) this.field5026[var7.field3908] * var2.field1695 + var2.field1719);
            var8.field3903 = (int) ((float) this.field4944[var7.field3908] * var2.field1708 + (float) this.field5047[var7.field3908] * var2.field1715 + (float) this.field5026[var7.field3908] * var2.field1690 + var2.field1709);
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZB)V")
    private final void method2169(boolean arg0, byte arg1) {
        field4943++;
        if (this.field4936 * 6 > this.field5029.field3639.field5518.length) {
            this.field5029.field3639 = new class406((this.field4936 + 100) * 6);
        } else {
            this.field5029.field3639.field5459 = 0;
        }
        class406 var3 = this.field5029.field3639;
        if (this.field5029.field3588) {
            for (int var4 = 0; var4 < this.field4936; var4++) {
                var3.method2415(false, this.field5015[var4]);
                var3.method2415(false, this.field4952[var4]);
                var3.method2415(false, this.field4955[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field4936; var5++) {
                var3.method2368(126, this.field5015[var5]);
                var3.method2368(127, this.field4952[var5]);
                var3.method2368(121, this.field4955[var5]);
            }
        }
        if (var3.field5459 == 0) {
            return;
        }
        if (arg0) {
            if (this.field4939 == null) {
                this.field4939 = this.field5029.method1597(var3.field5459, true, 5123, false, var3.field5518);
            } else {
                this.field4939.method1373(var3.field5459, true, 5123, var3.field5518);
            }
            this.field5012.field10418 = this.field4939;
        } else {
            this.field5012.field10418 = this.field5029.method1597(var3.field5459, false, 5123, false, var3.field5518);
        }
        if (!arg0) {
            this.field4963 = true;
        }
        int var6 = 36 / ((arg1 - 25) / 56);
    }

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "(I)V")
    private final void method2170(int arg0) {
        if (this.field4933 != null) {
            class118 var2 = this.field5029.field3528;
            this.field5029.method1611((byte) -123);
            this.field5029.method474(!this.field4945);
            this.field5029.method1617(false, (byte) 90);
            this.field5029.method1600(null, null, this.field5029.field3587, (byte) 77, this.field5029.field3579);
            for (int var3 = 0; var3 < this.field4988; var3++) {
                class251 var4 = this.field4933[var3];
                class194 var5 = this.field5004[var3];
                if (!var4.field3714 || !this.field5029.method461()) {
                    float var6 = (float) (this.field5026[var4.field3719] + this.field5026[var4.field3715] + this.field5026[var4.field3713]) * 0.3333333F;
                    float var7 = (float) (this.field5047[var4.field3719] + this.field5047[var4.field3715] + this.field5047[var4.field3713]) * 0.3333333F;
                    float var8 = (float) (this.field4944[var4.field3715] + this.field4944[var4.field3713] + this.field4944[var4.field3719]) * 0.3333333F;
                    float var9 = class447.field6267 * var8 + class733.field10167 * var7 + class525.field7189 * var6 + class304.field4370;
                    float var10 = class366.field5327 * var8 + class709.field9936 * var6 + class436.field6156 * var7 + class334.field4864;
                    float var11 = class265.field3924 * var8 + class723.field10068 * var7 + class602.field8192 * var6 + class86.field1194;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field3717;
                    var2.method965((byte) -124, var10 * var12 + (float) var5.field2604 - var10, var11 * var12 + -var11, (float) var5.field2599 + var9 - (var9 * var12), var4.field3724 * var5.field2593 >> 7, var4.field3718 * var5.field2602 >> 7, var5.field2601);
                    this.field5029.method1660(23111, var2);
                    int var13 = var5.field2596;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field5029.method1640(var4.field3722, -123);
                    this.field5029.method1648(0, var4.field3721);
                    this.field5029.method1627(7, 4, 0, 101);
                }
            }
            this.field5029.method474(true);
            this.field5029.method1599(-126);
        }
        if (arg0 > 28) {
            field4999++;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILqa;)V")
    private final void method2171(int arg0, class262 arg1) {
        field4951++;
        if (this.field5029.field3679.length < this.field5049) {
            this.field5029.field3681 = new int[this.field5049];
            this.field5029.field3679 = new int[this.field5049];
        }
        int[] var3 = this.field5029.field3679;
        int[] var4 = this.field5029.field3681;
        for (int var5 = 0; var5 < this.field4934; var5++) {
            int var16 = (this.field5026[var5] - (this.field5047[var5] * this.field5029.field3568 >> 8) >> this.field5029.field3529) - arg1.field3893;
            int var17 = (this.field4944[var5] - (this.field5047[var5] * this.field5029.field3612 >> 8) >> this.field5029.field3529) - arg1.field3895;
            int var18 = this.field5033[var5];
            int var19 = this.field5033[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field5011[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        if (arg0 < 58) {
            this.method305();
        }
        for (int var6 = 0; var6 < this.field4936; var6++) {
            if (this.field4973 == null || this.field4973[var6] <= 128) {
                short var7 = this.field5015[var6];
                short var8 = this.field4952[var6];
                short var9 = this.field4955[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - ((var14 - var13) * (var12 - var11))) > 0) {
                    arg1.method1730(false, var14, var11, var12, var15, var10, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method303(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5039++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = arg3 << 4;
            class131.field1942 = 0;
            class250.field3709 = 0;
            class598.field8139 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field5002.length > var15) {
                    int[] var16 = this.field5002[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field4942 == null || (this.field4942[var18] & arg6) != 0) {
                            class250.field3709 += this.field5026[var18];
                            class131.field1942 += this.field5047[var18];
                            class598.field8139 += this.field4944[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class250.field3709 = var10;
                class598.field8139 = var11;
                class131.field1942 = var12;
            } else {
                class131.field1942 = class131.field1942 / var13 + var12;
                class198.field2648 = true;
                class250.field3709 = class250.field3709 / var13 + var10;
                class598.field8139 = class598.field8139 / var13 + var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 - (-(arg7[4] * arg3) + -8192) >> 14;
                int var21 = arg7[6] * arg2 + (arg7[8] * arg4) + arg7[7] * arg3 + 8192 >> 14;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field5002.length > var26) {
                    int[] var27 = this.field5002[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field4942 == null || (this.field4942[var29] & arg6) != 0) {
                            this.field5026[var29] += var24;
                            this.field5047[var29] += var23;
                            this.field4944[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field5002.length) {
                        int[] var50 = this.field5002[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field4942 == null || (arg6 & this.field4942[var52]) != 0) {
                                this.field5026[var52] -= class250.field3709;
                                this.field5047[var52] -= class131.field1942;
                                this.field4944[var52] -= class598.field8139;
                                if (arg4 != 0) {
                                    int var53 = class749.field10324[arg4];
                                    int var54 = class749.field10316[arg4];
                                    int var55 = this.field5047[var52] * var53 + (this.field5026[var52] * var54) + 16383 >> 14;
                                    this.field5047[var52] = this.field5047[var52] * var54 + 16383 - this.field5026[var52] * var53 >> 14;
                                    this.field5026[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class749.field10324[arg2];
                                    int var57 = class749.field10316[arg2];
                                    int var58 = this.field5047[var52] * var57 + 16383 - (this.field4944[var52] * var56) >> 14;
                                    this.field4944[var52] = this.field5047[var52] * var56 + this.field4944[var52] * var57 + 16383 >> 14;
                                    this.field5047[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class749.field10324[arg3];
                                    int var60 = class749.field10316[arg3];
                                    int var61 = this.field5026[var52] * var60 + this.field4944[var52] * var59 + 16383 >> 14;
                                    this.field4944[var52] = this.field4944[var52] * var60 + 16383 - (this.field5026[var52] * var59) >> 14;
                                    this.field5026[var52] = var61;
                                }
                                this.field5026[var52] += class250.field3709;
                                this.field5047[var52] += class131.field1942;
                                this.field4944[var52] += class598.field8139;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field5002.length > var32) {
                            int[] var33 = this.field5002[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field4942 == null || (arg6 & this.field4942[var35]) != 0) {
                                    int var36 = this.field5033[var35];
                                    int var37 = this.field5033[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field5011[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class749.field10324[arg4];
                                            int var41 = class749.field10316[arg4];
                                            int var42 = this.field4979[var39] * var41 + this.field4950[var39] * var40 + 16383 >> 14;
                                            this.field4950[var39] = (short) (this.field4950[var39] * var41 + 16383 - (this.field4979[var39] * var40) >> 14);
                                            this.field4979[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class749.field10324[arg2];
                                            int var44 = class749.field10316[arg2];
                                            int var45 = this.field4950[var39] * var44 + (16383 - (this.field4992[var39] * var43)) >> 14;
                                            this.field4992[var39] = (short) (this.field4992[var39] * var44 + this.field4950[var39] * var43 + 16383 >> 14);
                                            this.field4950[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class749.field10324[arg3];
                                            int var47 = class749.field10316[arg3];
                                            int var48 = this.field4992[var39] * var46 + this.field4979[var39] * var47 + 16383 >> 14;
                                            this.field4992[var39] = (short) (this.field4992[var39] * var47 + (16383 - (this.field4979[var39] * var46)) >> 14);
                                            this.field4979[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field4986 == null && this.field5023 != null) {
                        this.field5023.field6116 = null;
                    }
                    if (this.field4986 != null) {
                        this.field4986.field6116 = null;
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
                if (class198.field2648) {
                    int var68 = arg7[3] * class131.field1942 + arg7[0] * class250.field3709 + arg7[6] * class598.field8139 + 8192 >> 14;
                    int var69 = arg7[4] * class131.field1942 + (arg7[1] * class250.field3709 - (-(arg7[7] * class598.field8139) - 8192)) >> 14;
                    int var70 = arg7[5] * class131.field1942 + arg7[2] * class250.field3709 - (-(arg7[8] * class598.field8139) - 8192) >> 14;
                    int var71 = var65 + var68;
                    int var72 = var66 + var69;
                    class131.field1942 = var72;
                    class250.field3709 = var71;
                    int var73 = var67 + var70;
                    class198.field2648 = false;
                    class598.field8139 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class749.field10316[arg2];
                int var76 = class749.field10324[arg2];
                int var77 = class749.field10316[arg3];
                int var78 = class749.field10324[arg3];
                int var79 = class749.field10316[arg4];
                int var80 = class749.field10324[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[7] = var78 * var80 + (var77 * var81) + 8192 >> 14;
                var74[5] = -var76;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                int var83 = var74[1] * -class131.field1942 + (var74[0] * -class250.field3709 + (var74[2] * -class598.field8139) + 8192) >> 14;
                int var84 = var74[4] * -class131.field1942 + var74[3] * -class250.field3709 + var74[5] * -class598.field8139 + 8192 >> 14;
                int var85 = var74[7] * -class131.field1942 + var74[6] * -class250.field3709 + (var74[8] * -class598.field8139) + 8192 >> 14;
                int var86 = class250.field3709 + var83;
                int var87 = class131.field1942 + var84;
                int var88 = class598.field8139 + var85;
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
                int var91 = var74[2] * var67 + var74[0] * var65 + var74[1] * var66 + 8192 >> 14;
                int var92 = var74[4] * var66 + var74[3] * var65 + var74[5] * var67 + 8192 >> 14;
                int var93 = var74[8] * var67 + var74[7] * var66 + var74[6] * var65 + 8192 >> 14;
                int var94 = var87 + var92;
                int var95 = var86 + var91;
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
                int var99 = arg7[2] * var96 + arg7[0] * var95 + arg7[1] * var94 + 8192 >> 14;
                int var100 = arg7[5] * var96 + arg7[3] * var95 + (arg7[4] * var94) + 8192 >> 14;
                int var101 = var63 + var100;
                int var102 = var62 + var99;
                int var103 = arg7[8] * var96 + arg7[6] * var95 + arg7[7] * var94 + 8192 >> 14;
                int var104 = var64 + var103;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field5002.length) {
                        int[] var107 = this.field5002[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field4942 == null || (arg6 & this.field4942[var109]) != 0) {
                                int var110 = this.field4944[var109] * var97[2] + this.field5047[var109] * var97[1] + this.field5026[var109] * var97[0] + 8192 >> 14;
                                int var111 = this.field4944[var109] * var97[5] + this.field5047[var109] * var97[4] + this.field5026[var109] * var97[3] + 8192 >> 14;
                                int var112 = var101 + var111;
                                int var113 = this.field4944[var109] * var97[8] + this.field5047[var109] * var97[7] + this.field5026[var109] * var97[6] + 8192 >> 14;
                                int var114 = var102 + var110;
                                this.field5026[var109] = var114;
                                int var115 = var104 + var113;
                                this.field5047[var109] = var112;
                                this.field4944[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field5002.length) {
                        int[] var174 = this.field5002[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field4942 == null || (arg6 & this.field4942[var176]) != 0) {
                                this.field5026[var176] -= class250.field3709;
                                this.field5047[var176] -= class131.field1942;
                                this.field4944[var176] -= class598.field8139;
                                this.field5026[var176] = this.field5026[var176] * arg2 >> 7;
                                this.field5047[var176] = this.field5047[var176] * arg3 >> 7;
                                this.field4944[var176] = this.field4944[var176] * arg4 >> 7;
                                this.field5026[var176] += class250.field3709;
                                this.field5047[var176] += class131.field1942;
                                this.field4944[var176] += class598.field8139;
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
                if (class198.field2648) {
                    int var128 = arg7[6] * class598.field8139 + arg7[0] * class250.field3709 - (-(arg7[3] * class131.field1942) - 8192) >> 14;
                    int var129 = arg7[7] * class598.field8139 + (arg7[1] * class250.field3709 + arg7[4] * class131.field1942 + 8192) >> 14;
                    int var130 = var126 + var129;
                    int var131 = arg7[2] * class250.field3709 + 8192 - (-(arg7[5] * class131.field1942) - arg7[8] * class598.field8139) >> 14;
                    int var132 = var125 + var128;
                    int var133 = var127 + var131;
                    class131.field1942 = var130;
                    class250.field3709 = var132;
                    class198.field2648 = false;
                    class598.field8139 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class250.field3709 * var134 + 8192 >> 14;
                int var138 = -class131.field1942 * var135 + 8192 >> 14;
                int var139 = -class598.field8139 * var136 + 8192 >> 14;
                int var140 = var137 + class250.field3709;
                int var141 = var138 + class131.field1942;
                int var142 = class598.field8139 + var139;
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
                int var152 = arg7[2] * var149 + arg7[0] * var146 + arg7[1] * var147 + 8192 >> 14;
                int var153 = arg7[3] * var146 - (-(arg7[4] * var147) - arg7[5] * var149 - 8192) >> 14;
                int var154 = var122 + var152;
                int var155 = var123 + var153;
                int var156 = arg7[8] * var149 + arg7[6] * var146 + arg7[7] * var147 + 8192 >> 14;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field5002.length) {
                        int[] var160 = this.field5002[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field4942 == null || (arg6 & this.field4942[var162]) != 0) {
                                int var163 = this.field5047[var162] * var150[1] + (this.field5026[var162] * var150[0] - (-(this.field4944[var162] * var150[2]) - 8192)) >> 14;
                                int var164 = this.field5026[var162] * var150[3] + this.field5047[var162] * var150[4] + this.field4944[var162] * var150[5] + 8192 >> 14;
                                int var165 = var155 + var164;
                                int var166 = this.field4944[var162] * var150[8] + this.field5047[var162] * var150[7] + this.field5026[var162] * var150[6] + 8192 >> 14;
                                int var167 = var154 + var163;
                                this.field5026[var162] = var167;
                                int var168 = var157 + var166;
                                this.field5047[var162] = var165;
                                this.field4944[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4969 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field4969.length) {
                        int[] var182 = this.field4969[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field4953 == null || (arg6 & this.field4953[var184]) != 0) {
                                int var185 = (this.field4973[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field4973[var184] = (byte) var185;
                                if (this.field5023 != null) {
                                    this.field5023.field6116 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4933 != null) {
                    for (int var178 = 0; var178 < this.field4988; var178++) {
                        class251 var179 = this.field4933[var178];
                        class194 var180 = this.field5004[var178];
                        var180.field2596 = 255 - (this.field4973[var179.field3712] & 0xFF) << 24 | var180.field2596 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4969 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field4969.length > var190) {
                        int[] var191 = this.field4969[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field4953 == null || (arg6 & this.field4953[var193]) != 0) {
                                int var194 = this.field4935[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD1F) >> 10;
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
                                this.field4935[var193] = (short) class213.method1409(class213.method1409(var197 << 7, var199 << 10), var200);
                                if (this.field5023 != null) {
                                    this.field5023.field6116 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4933 != null) {
                    for (int var187 = 0; var187 < this.field4988; var187++) {
                        class251 var188 = this.field4933[var187];
                        class194 var189 = this.field5004[var187];
                        var189.field2596 = class145.field2069[this.field4935[var188.field3712] & 0xFFFF] & 0xFFFFFF | var189.field2596 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4967 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field4967.length) {
                        int[] var203 = this.field4967[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class194 var205 = this.field5004[var203[var204]];
                            var205.field2599 += arg2;
                            var205.field2604 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4967 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field4967.length) {
                        int[] var208 = this.field4967[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class194 var210 = this.field5004[var208[var209]];
                            var210.field2602 = var210.field2602 * arg3 >> 7;
                            var210.field2593 = var210.field2593 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4967 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field4967.length > var212) {
                    int[] var213 = this.field4967[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class194 var215 = this.field5004[var213[var214]];
                        var215.field2601 = var215.field2601 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z)V")
    private final void method2172(boolean arg0) {
        field4962++;
        if (!this.field4963) {
            return;
        }
        this.field4963 = false;
        if (this.field5041 == null && this.field5000 == null && this.field4933 == null && !class561.method3150(this.field4976, -16730, this.field4948)) {
            boolean var2 = false;
            boolean var3 = false;
            if (this.field5026 != null && !class230.method1504((byte) -58, this.field4948, this.field4976)) {
                if (this.field4994 != null && this.field4994.field6116 == null) {
                    this.field4963 = true;
                } else {
                    var2 = true;
                    if (!this.field5009) {
                        this.method2167(-101);
                    }
                }
            }
            boolean var4 = false;
            if (this.field5047 != null && !class73.method656(this.field4948, -87, this.field4976)) {
                if (this.field4994 != null && this.field4994.field6116 == null) {
                    this.field4963 = true;
                } else {
                    var3 = true;
                    if (!this.field5009) {
                        this.method2167(-87);
                    }
                }
            }
            if (this.field4944 != null && !class487.method2829(this.field4976, this.field4948, false)) {
                if (this.field4994 != null && this.field4994.field6116 == null) {
                    this.field4963 = true;
                } else {
                    var4 = true;
                    if (!this.field5009) {
                        this.method2167(-101);
                    }
                }
            }
            if (var4) {
                this.field4944 = null;
            }
            if (var3) {
                this.field5047 = null;
            }
            if (var2) {
                this.field5026 = null;
            }
        }
        if (this.field5011 != null && this.field5026 == null && this.field5047 == null && this.field4944 == null) {
            this.field5011 = null;
            this.field5033 = null;
        }
        if (this.field5022 != null && !class785.method4343(this.field4948, this.field4976, (byte) 83)) {
            if (this.field4986 == null) {
                if (this.field5023 != null && this.field5023.field6116 == null) {
                    this.field4963 = true;
                } else {
                    this.field5022 = null;
                    this.field4979 = this.field4950 = this.field4992 = null;
                }
            } else if (this.field4986.field6116 == null) {
                this.field4963 = true;
            } else {
                this.field4979 = this.field4950 = this.field4992 = null;
                this.field5022 = null;
            }
        }
        if (this.field4935 != null && !class600.method3333(this.field4948, this.field4976, (byte) 126)) {
            if (this.field5023 != null && this.field5023.field6116 == null) {
                this.field4963 = true;
            } else {
                this.field4935 = null;
            }
        }
        if (this.field4973 != null && !class29.method216(this.field4948, 43, this.field4976)) {
            if (this.field5023 != null && this.field5023.field6116 == null) {
                this.field4963 = true;
            } else {
                this.field4973 = null;
            }
        }
        if (this.field4981 != null && !class310.method1947(0, this.field4976, this.field4948)) {
            if (this.field4957 != null && this.field4957.field6116 == null) {
                this.field4963 = true;
            } else {
                this.field4981 = this.field5027 = null;
            }
        }
        if (this.field4991 != null && !class741.method4104(this.field4948, 69, this.field4976)) {
            if (this.field5023 != null && this.field5023.field6116 == null) {
                this.field4963 = true;
            } else {
                this.field4991 = null;
            }
        }
        if (this.field5015 != null && !class737.method4083(this.field4976, (byte) 27, this.field4948)) {
            if ((this.field5012 == null || this.field5012.field10418 != null) && (this.field5023 == null || this.field5023.field6116 != null)) {
                this.field5015 = this.field4952 = this.field4955 = null;
            } else {
                this.field4963 = true;
            }
        }
        if (this.field4969 != null && !class417.method2572(this.field4948, this.field4976, -1)) {
            this.field4969 = null;
            this.field4953 = null;
        }
        if (this.field5002 != null && !class545.method3101(32, this.field4948, this.field4976)) {
            this.field4942 = null;
            this.field5002 = null;
        }
        if (this.field4967 != null && !class73.method653(this.field4976, (byte) -119, this.field4948)) {
            this.field4967 = null;
        }
        if (!arg0) {
            this.field5009 = true;
        }
        if (this.field5046 != null && (this.field4948 & 0x800) == 0 && (this.field4948 & 0x40000) == 0) {
            this.field5046 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Luu;Ltaa;I)V")
    public final void method292(class303 arg0, class431 arg1, int arg2) {
        field5008++;
        if (this.field5049 == 0) {
            return;
        }
        class118 var4 = this.field5029.field3563;
        if (!this.field5009) {
            this.method2167(-86);
        }
        class118 var5 = (class118) arg0;
        class86.field1194 = var4.field1708 * var5.field1709 + var4.field1715 * var5.field1719 + var4.field1690 * var5.field1702 + var4.field1709;
        class723.field10068 = var4.field1708 * var5.field1715 + var4.field1715 * var5.field1693 + var4.field1690 * var5.field1705;
        float var6 = (float) this.field4930 * class723.field10068 + class86.field1194;
        float var7 = (float) this.field4954 * class723.field10068 + class86.field1194;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var8 = var7 - (float) this.field5044;
            var9 = (float) this.field5044 + var6;
        } else {
            var8 = (float) (-this.field5044) + var6;
            var9 = (float) this.field5044 + var7;
        }
        if ((var8 >= this.field5029.field3646) || (var9 <= (float) this.field5029.field3602)) {
            return;
        }
        class733.field10167 = var4.field1710 * var5.field1715 + var4.field1705 * var5.field1693 + var4.field1697 * var5.field1705;
        class304.field4370 = var4.field1710 * var5.field1709 + var4.field1705 * var5.field1719 + var4.field1697 * var5.field1702 + var4.field1702;
        float var10 = (float) this.field4930 * class733.field10167 + class304.field4370;
        float var11 = (float) this.field4954 * class733.field10167 + class304.field4370;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var12 = (var11 - (float) this.field5044) * (float) this.field5029.field3582;
            var13 = ((float) this.field5044 + var10) * (float) this.field5029.field3582;
        } else {
            var12 = ((float) (-this.field5044) + var10) * (float) this.field5029.field3582;
            var13 = ((float) this.field5044 + var11) * (float) this.field5029.field3582;
        }
        if ((this.field5029.field3597 <= var12 / var9) || (var13 / var9 <= this.field5029.field3634)) {
            return;
        }
        class436.field6156 = var4.field1717 * var5.field1715 + var4.field1695 * var5.field1705 + var4.field1693 * var5.field1693;
        class334.field4864 = var4.field1717 * var5.field1709 + var4.field1695 * var5.field1702 + var4.field1693 * var5.field1719 + var4.field1719;
        float var14 = (float) this.field4930 * class436.field6156 + class334.field4864;
        float var15 = (float) this.field4954 * class436.field6156 + class334.field4864;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = ((float) this.field5044 + var14) * (float) this.field5029.field3638;
            var16 = (var15 - (float) this.field5044) * (float) this.field5029.field3638;
        } else {
            var16 = (var14 - (float) this.field5044) * (float) this.field5029.field3638;
            var17 = ((float) this.field5044 + var15) * (float) this.field5029.field3638;
        }
        if ((this.field5029.field3581 <= var16 / var9) || (this.field5029.field3616 >= var17 / var9)) {
            return;
        }
        if (arg1 != null || this.field4933 != null) {
            class602.field8192 = var4.field1708 * var5.field1690 + var4.field1715 * var5.field1695 + var4.field1690 * var5.field1697;
            class709.field9936 = var4.field1717 * var5.field1690 + var4.field1695 * var5.field1697 + var4.field1693 * var5.field1695;
            class525.field7189 = var4.field1710 * var5.field1690 + var4.field1705 * var5.field1695 + var4.field1697 * var5.field1697;
            class366.field5327 = var4.field1717 * var5.field1708 + var4.field1695 * var5.field1710 + var4.field1693 * var5.field1717;
            class447.field6267 = var4.field1710 * var5.field1708 + var4.field1705 * var5.field1717 + var4.field1697 * var5.field1710;
            class265.field3924 = var4.field1708 * var5.field1708 + var4.field1715 * var5.field1717 + var4.field1690 * var5.field1710;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field4997 + this.field4970 >> 1;
            int var21 = this.field5050 + this.field4985 >> 1;
            int var22 = (int) ((float) var21 * class447.field6267 + (float) this.field4930 * class733.field10167 + (float) var20 * class525.field7189 + class304.field4370);
            int var23 = (int) ((float) var21 * class366.field5327 + (float) this.field4930 * class436.field6156 + (float) var20 * class709.field9936 + class334.field4864);
            int var24 = (int) ((float) var21 * class265.field3924 + (float) this.field4930 * class723.field10068 + (float) var20 * class602.field8192 + class86.field1194);
            if (this.field5029.field3602 <= var24) {
                arg1.field6124 = this.field5029.field3638 * var23 / var24 + this.field5029.field3654;
                arg1.field6123 = this.field5029.field3582 * var22 / var24 + this.field5029.field3675;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class447.field6267 + (float) this.field4954 * class733.field10167 + (float) var20 * class525.field7189 + class304.field4370);
            int var26 = (int) ((float) var21 * class366.field5327 + (float) this.field4954 * class436.field6156 + (float) var20 * class709.field9936 + class334.field4864);
            int var27 = (int) ((float) var21 * class265.field3924 + (float) this.field4954 * class723.field10068 + (float) var20 * class602.field8192 + class86.field1194);
            if (var27 < this.field5029.field3602) {
                var18 = true;
            } else {
                arg1.field6125 = this.field5029.field3582 * var25 / var27 + this.field5029.field3675;
                arg1.field6122 = this.field5029.field3638 * var26 / var27 + this.field5029.field3654;
            }
            if (var18) {
                if (var24 < this.field5029.field3602 && var27 < this.field5029.field3602) {
                    var19 = false;
                } else if (this.field5029.field3602 > var24) {
                    int var28 = (var27 - this.field5029.field3602 << 16) / (var27 - var24);
                    int var29 = var25 + ((var25 - var22) * var28 >> 16);
                    arg1.field6123 = this.field5029.field3582 * var29 / this.field5029.field3602 + this.field5029.field3675;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field6124 = this.field5029.field3638 * var30 / this.field5029.field3602 + this.field5029.field3654;
                } else if (var27 < this.field5029.field3602) {
                    int var31 = (var24 - this.field5029.field3602 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field6123 = this.field5029.field3582 * var32 / this.field5029.field3602 + this.field5029.field3675;
                    arg1.field6124 = this.field5029.field3638 * var33 / this.field5029.field3602 + this.field5029.field3654;
                }
            }
            if (var19) {
                arg1.field6126 = true;
                if (var24 <= var27) {
                    arg1.field6121 = (this.field5044 + var25) * this.field5029.field3582 / var27 + this.field5029.field3675 - arg1.field6125;
                } else {
                    arg1.field6121 = (this.field5044 + var22) * this.field5029.field3582 / var24 + this.field5029.field3675 - arg1.field6123;
                }
            }
        }
        this.field5029.method1588((byte) 118);
        this.field5029.method1643(45, var5);
        this.method2166(1559402986);
        this.field5029.method1599(127);
        this.method2170(58);
    }

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "()Z")
    public final boolean method333() {
        field5005++;
        if (this.field4991 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field4991.length; var1++) {
            if (this.field4991[var1] != -1 && !this.field5029.field912.method1173(true, this.field4991[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lnha;ZLnha;ZII)Lka;")
    private final class500 method2173(class342 arg0, boolean arg1, class342 arg2, boolean arg3, int arg4, int arg5) {
        arg2.field5043 = this.field5043;
        arg2.field4956 = this.field4956;
        arg2.field4934 = this.field4934;
        arg2.field4976 = this.field4976;
        arg2.field4936 = this.field4936;
        arg2.field4948 = arg5;
        arg2.field5003 = this.field5003;
        arg2.field4988 = this.field4988;
        arg2.field5049 = this.field5049;
        if ((arg5 & 0x100) == 0) {
            arg2.field4945 = this.field4945;
        } else {
            arg2.field4945 = true;
        }
        field5038++;
        arg2.field5035 = this.field5035;
        arg2.field4977 = this.field4977;
        arg2.field5021 = 0;
        boolean var7 = class530.method3044(this.field4976, (byte) 113, arg5);
        boolean var8 = class746.method4128(arg5, true, this.field4976);
        boolean var9 = class524.method3022(arg5, this.field4976, arg4 - 13230);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg2.field5026 = this.field5026;
            } else if (arg0.field5026 == null || arg0.field5026.length < this.field4956) {
                arg2.field5026 = arg0.field5026 = new int[this.field4956];
            } else {
                arg2.field5026 = arg0.field5026;
            }
            if (!var8) {
                arg2.field5047 = this.field5047;
            } else if (arg0.field5047 == null || arg0.field5047.length < this.field4956) {
                arg2.field5047 = arg0.field5047 = new int[this.field4956];
            } else {
                arg2.field5047 = arg0.field5047;
            }
            if (!var9) {
                arg2.field4944 = this.field4944;
            } else if (arg0.field4944 == null || arg0.field4944.length < this.field4956) {
                arg2.field4944 = arg0.field4944 = new int[this.field4956];
            } else {
                arg2.field4944 = arg0.field4944;
            }
            for (int var11 = 0; var11 < this.field4956; var11++) {
                if (var7) {
                    arg2.field5026[var11] = this.field5026[var11];
                }
                if (var8) {
                    arg2.field5047[var11] = this.field5047[var11];
                }
                if (var9) {
                    arg2.field4944[var11] = this.field4944[var11];
                }
            }
        } else {
            arg2.field5026 = this.field5026;
            arg2.field4944 = this.field4944;
            arg2.field5047 = this.field5047;
        }
        if (class543.method3090(this.field4976, arg5, 0)) {
            arg2.field4994 = arg0.field4994;
            if (arg3) {
                arg2.field5021 = (byte) (arg2.field5021 | 0x1);
            }
            arg2.field4994.field6113 = this.field4994.field6113;
            arg2.field4994.field6116 = this.field4994.field6116;
        } else if (class293.method1853(35716, this.field4976, arg5)) {
            arg2.field4994 = this.field4994;
        } else {
            arg2.field4994 = null;
        }
        if (class162.method1181(this.field4976, arg5, true)) {
            if (arg0.field4935 == null || arg0.field4935.length < this.field5003) {
                arg2.field4935 = arg0.field4935 = new short[this.field5003];
            } else {
                arg2.field4935 = arg0.field4935;
            }
            for (int var12 = 0; var12 < this.field5003; var12++) {
                arg2.field4935[var12] = this.field4935[var12];
            }
        } else {
            arg2.field4935 = this.field4935;
        }
        if (class485.method2819(this.field4976, (byte) 22, arg5)) {
            if (arg0.field4973 == null || arg0.field4973.length < this.field5003) {
                arg2.field4973 = arg0.field4973 = new byte[this.field5003];
            } else {
                arg2.field4973 = arg0.field4973;
            }
            for (int var13 = 0; var13 < this.field5003; var13++) {
                arg2.field4973[var13] = this.field4973[var13];
            }
        } else {
            arg2.field4973 = this.field4973;
        }
        if (class291.method1844(this.field4976, 0, arg5)) {
            arg2.field5023 = arg0.field5023;
            if (arg3) {
                arg2.field5021 = (byte) (arg2.field5021 | 0x2);
            }
            arg2.field5023.field6116 = this.field5023.field6116;
            arg2.field5023.field6113 = this.field5023.field6113;
        } else if (class717.method4004(this.field4976, (byte) -1, arg5)) {
            arg2.field5023 = this.field5023;
        } else {
            arg2.field5023 = null;
        }
        if (class481.method2801(arg5, -545, this.field4976)) {
            if (arg0.field4979 == null || this.field5049 > arg0.field4979.length) {
                int var14 = this.field5049;
                arg2.field4979 = arg0.field4979 = new short[var14];
                arg2.field4950 = arg0.field4950 = new short[var14];
                arg2.field4992 = arg0.field4992 = new short[var14];
            } else {
                arg2.field4950 = arg0.field4950;
                arg2.field4992 = arg0.field4992;
                arg2.field4979 = arg0.field4979;
            }
            if (this.field5031 == null) {
                for (int var18 = 0; var18 < this.field5049; var18++) {
                    arg2.field4979[var18] = this.field4979[var18];
                    arg2.field4950[var18] = this.field4950[var18];
                    arg2.field4992[var18] = this.field4992[var18];
                }
            } else {
                if (arg0.field5031 == null) {
                    arg0.field5031 = new class658();
                }
                class658 var15 = arg2.field5031 = arg0.field5031;
                if (var15.field9110 == null || var15.field9110.length < this.field5049) {
                    int var16 = this.field5049;
                    var15.field9106 = new byte[var16];
                    var15.field9108 = new short[var16];
                    var15.field9109 = new short[var16];
                    var15.field9110 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field5049; var17++) {
                    arg2.field4979[var17] = this.field4979[var17];
                    arg2.field4950[var17] = this.field4950[var17];
                    arg2.field4992[var17] = this.field4992[var17];
                    var15.field9110[var17] = this.field5031.field9110[var17];
                    var15.field9109[var17] = this.field5031.field9109[var17];
                    var15.field9108[var17] = this.field5031.field9108[var17];
                    var15.field9106[var17] = this.field5031.field9106[var17];
                }
            }
            arg2.field5022 = this.field5022;
        } else {
            arg2.field5022 = this.field5022;
            arg2.field4992 = this.field4992;
            arg2.field5031 = this.field5031;
            arg2.field4979 = this.field4979;
            arg2.field4950 = this.field4950;
        }
        if (class270.method1755(arg5, this.field4976, 16385)) {
            if (arg3) {
                arg2.field5021 = (byte) (arg2.field5021 | 0x4);
            }
            arg2.field4986 = arg0.field4986;
            arg2.field4986.field6113 = this.field4986.field6113;
            arg2.field4986.field6116 = this.field4986.field6116;
        } else if (class135.method1061((byte) 127, arg5, this.field4976)) {
            arg2.field4986 = this.field4986;
        } else {
            arg2.field4986 = null;
        }
        if (class619.method3401(arg5, 9209, this.field4976)) {
            if (arg0.field4981 == null || this.field5003 > arg0.field4981.length) {
                int var19 = this.field5049;
                arg2.field4981 = arg0.field4981 = new float[var19];
                arg2.field5027 = arg0.field5027 = new float[var19];
            } else {
                arg2.field4981 = arg0.field4981;
                arg2.field5027 = arg0.field5027;
            }
            for (int var20 = 0; var20 < this.field5049; var20++) {
                arg2.field4981[var20] = this.field4981[var20];
                arg2.field5027[var20] = this.field5027[var20];
            }
        } else {
            arg2.field5027 = this.field5027;
            arg2.field4981 = this.field4981;
        }
        if (class271.method1759(arg5, this.field4976, arg4 + 99)) {
            arg2.field4957 = arg0.field4957;
            if (arg3) {
                arg2.field5021 = (byte) (arg2.field5021 | 0x8);
            }
            arg2.field4957.field6116 = this.field4957.field6116;
            arg2.field4957.field6113 = this.field4957.field6113;
        } else if (class743.method4117(arg5, this.field4976, arg4 + 2040)) {
            arg2.field4957 = this.field4957;
        } else {
            arg2.field4957 = null;
        }
        if (class682.method3785(arg5, (byte) -11, this.field4976)) {
            if (arg0.field5015 == null || arg0.field5015.length < this.field5003) {
                int var21 = this.field5003;
                arg2.field4955 = arg0.field4955 = new short[var21];
                arg2.field5015 = arg0.field5015 = new short[var21];
                arg2.field4952 = arg0.field4952 = new short[var21];
            } else {
                arg2.field5015 = arg0.field5015;
                arg2.field4952 = arg0.field4952;
                arg2.field4955 = arg0.field4955;
            }
            for (int var22 = 0; var22 < this.field5003; var22++) {
                arg2.field5015[var22] = this.field5015[var22];
                arg2.field4952[var22] = this.field4952[var22];
                arg2.field4955[var22] = this.field4955[var22];
            }
        } else {
            arg2.field5015 = this.field5015;
            arg2.field4952 = this.field4952;
            arg2.field4955 = this.field4955;
        }
        if (class733.method4069(arg5, arg4 - 5, this.field4976)) {
            if (arg3) {
                arg2.field5021 = (byte) (arg2.field5021 | 0x10);
            }
            arg2.field5012 = arg0.field5012;
            arg2.field5012.field10418 = this.field5012.field10418;
        } else if (class39.method272(0, arg5, this.field4976)) {
            arg2.field5012 = this.field5012;
        } else {
            arg2.field5012 = null;
        }
        if (arg4 != 8) {
            this.method334(29, -22, 69, -53);
        }
        if (class52.method383(this.field4976, arg5, arg4 + 75)) {
            if (arg0.field4991 == null || this.field5003 > arg0.field4991.length) {
                int var23 = this.field5003;
                arg2.field4991 = arg0.field4991 = new short[var23];
            } else {
                arg2.field4991 = arg0.field4991;
            }
            for (int var24 = 0; var24 < this.field5003; var24++) {
                arg2.field4991[var24] = this.field4991[var24];
            }
        } else {
            arg2.field4991 = this.field4991;
        }
        if (!class101.method788(this.field4976, -1, arg5)) {
            arg2.field5004 = this.field5004;
        } else if (arg0.field5004 == null || arg0.field5004.length < this.field4988) {
            int var26 = this.field4988;
            arg2.field5004 = arg0.field5004 = new class194[var26];
            for (int var27 = 0; var27 < this.field4988; var27++) {
                arg2.field5004[var27] = this.field5004[var27].method1337(false);
            }
        } else {
            arg2.field5004 = arg0.field5004;
            for (int var25 = 0; var25 < this.field4988; var25++) {
                arg2.field5004[var25].method1336(this.field5004[var25], (byte) -41);
            }
        }
        arg2.field4967 = this.field4967;
        arg2.field5041 = this.field5041;
        arg2.field5011 = this.field5011;
        arg2.field5033 = this.field5033;
        if (this.field5009) {
            arg2.field4997 = this.field4997;
            arg2.field5009 = true;
            arg2.field4930 = this.field4930;
            arg2.field5044 = this.field5044;
            arg2.field4954 = this.field4954;
            arg2.field5050 = this.field5050;
            arg2.field5017 = this.field5017;
            arg2.field4985 = this.field4985;
            arg2.field4970 = this.field4970;
        } else {
            arg2.field5009 = false;
        }
        arg2.field5000 = this.field5000;
        arg2.field4942 = this.field4942;
        arg2.field4969 = this.field4969;
        arg2.field4933 = this.field4933;
        arg2.field5002 = this.field5002;
        arg2.field5046 = this.field5046;
        arg2.field4953 = this.field4953;
        return arg2;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(BZ)V")
    private final void method2174(byte arg0, boolean arg1) {
        field4960++;
        boolean var3 = this.field5023 != null && this.field5023.field6116 == null;
        boolean var4 = this.field4986 != null && this.field4986.field6116 == null;
        boolean var5 = this.field4994 != null && this.field4994.field6116 == null;
        boolean var6 = this.field4957 != null && this.field4957.field6116 == null;
        if (arg1) {
            var3 &= (this.field5021 & 0x2) != 0;
            var5 &= (this.field5021 & 0x1) != 0;
            var4 &= (this.field5021 & 0x4) != 0;
            var6 &= (this.field5021 & 0x8) != 0;
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
        if (arg0 < 38) {
            this.field5049 = -30;
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
        if (this.field5029.field3639.field5518.length >= (this.field5049 * var7)) {
            this.field5029.field3639.field5459 = 0;
        } else {
            this.field5029.field3639 = new class406((this.field5049 + 100) * var7);
        }
        class406 var12 = this.field5029.field3639;
        if (var5) {
            if (this.field5029.field3588) {
                for (int var13 = 0; var13 < this.field4934; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field5026[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field5047[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field4944[var13]);
                    int var17 = this.field5033[var13];
                    int var18 = this.field5033[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field5011[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field5459 = var7 * var20;
                        var12.method2354(var14, (byte) 104);
                        var12.method2354(var15, (byte) 109);
                        var12.method2354(var16, (byte) 61);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field4934; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field5026[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field5047[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field4944[var21]);
                    int var25 = this.field5033[var21];
                    int var26 = this.field5033[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field5011[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field5459 = var7 * var28;
                        var12.method2406(var22, -86);
                        var12.method2406(var23, -110);
                        var12.method2406(var24, 55);
                    }
                }
            }
        }
        if (var3) {
            if (this.field4986 == null) {
                byte[] var31;
                short[] var32;
                short[] var33;
                short[] var34;
                if (this.field5031 == null) {
                    var31 = this.field5022;
                    var32 = this.field4992;
                    var33 = this.field4979;
                    var34 = this.field4950;
                } else {
                    var31 = this.field5031.field9106;
                    var32 = this.field5031.field9108;
                    var33 = this.field5031.field9110;
                    var34 = this.field5031.field9109;
                }
                float var35 = this.field5029.field3611[0];
                float var36 = this.field5029.field3611[1];
                float var37 = this.field5029.field3611[2];
                float var38 = this.field5029.field3657;
                float var39 = this.field5029.field3651 * 768.0F / (float) this.field4977;
                float var40 = this.field5029.field3586 * 768.0F / (float) this.field4977;
                for (int var41 = 0; var41 < this.field5003; var41++) {
                    int var42 = this.method2177(this.field4973[var41], -1, this.field5035, this.field4991[var41], this.field4935[var41]);
                    float var43 = (float) (var42 >>> 24) * this.field5029.field3626;
                    float var44 = (float) ((var42 & 0xFFF316) >> 16) * this.field5029.field3643;
                    float var45 = (float) ((var42 & 0xFF87) >> 8) * this.field5029.field3570;
                    short var46 = this.field5015[var41];
                    short var47 = (short) var31[var46];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var32[var46] * var37 + (float) var33[var46] * var35 + (float) var34[var46] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var32[var46] * var37 + (float) var33[var46] * var35 + (float) var34[var46] * var36) / (float) (var47 * 256);
                    }
                    float var49 = var48 * (var48 < 0.0F ? var40 : var39) + var38;
                    int var50 = (int) (var43 * var49);
                    int var51 = (int) (var44 * var49);
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
                    var12.field5459 = var7 * var46 + var9;
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method2380(65280, var50);
                    var12.method2380(65280, var51);
                    var12.method2380(65280, var52);
                    var12.method2380(65280, 255 - (this.field4973[var41] & 0xFF));
                    short var53 = this.field4952[var41];
                    short var54 = (short) var31[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var32[var53] * var37 + (float) var33[var53] * var35 + (float) var34[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var32[var53] * var37 + (float) var33[var53] * var35 + (float) var34[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = (var55 < 0.0F ? var40 : var39) * var55 + var38;
                    int var57 = (int) (var43 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var44 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var45 * var56);
                    var12.field5459 = var7 * var53 + var9;
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method2380(65280, var57);
                    var12.method2380(65280, var58);
                    var12.method2380(65280, var59);
                    var12.method2380(65280, 255 - (this.field4973[var41] & 0xFF));
                    short var60 = this.field4955[var41];
                    short var61 = (short) var31[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var32[var60] * var37 + (float) var33[var60] * var35 + (float) var34[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var32[var60] * var37 + (float) var33[var60] * var35 + (float) var34[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = (var62 < 0.0F ? var40 : var39) * var62 + var38;
                    int var64 = (int) (var43 * var63);
                    int var65 = (int) (var44 * var63);
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
                    var12.field5459 = var9 + (var7 * var60);
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method2380(65280, var64);
                    var12.method2380(65280, var65);
                    var12.method2380(65280, var66);
                    var12.method2380(65280, 255 - (this.field4973[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field5003; var29++) {
                    int var30 = this.method2177(this.field4973[var29], -1, this.field5035, this.field4991[var29], this.field4935[var29]);
                    var12.field5459 = var9 + (this.field5015[var29] * var7);
                    var12.method2354(var30, (byte) 90);
                    var12.field5459 = var9 + (this.field4952[var29] * var7);
                    var12.method2354(var30, (byte) 91);
                    var12.field5459 = this.field4955[var29] * var7 + var9;
                    var12.method2354(var30, (byte) 74);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            byte[] var69;
            short[] var70;
            if (this.field5031 == null) {
                var69 = this.field5022;
                var67 = this.field4950;
                var70 = this.field4992;
                var68 = this.field4979;
            } else {
                var67 = this.field5031.field9109;
                var68 = this.field5031.field9110;
                var69 = this.field5031.field9106;
                var70 = this.field5031.field9108;
            }
            float var71 = 3.0F / (float) this.field4977;
            var12.field5459 = var10;
            float var72 = 3.0F / (float) (this.field4977 / 2 + this.field4977);
            if (this.field5029.field3588) {
                for (int var73 = 0; var73 < this.field5049; var73++) {
                    int var74 = var69[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2523(-4231, (float) var68[var73] * var72);
                        var12.method2523(-4231, (float) var67[var73] * var72);
                        var12.method2523(-4231, (float) var70[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2523(-4231, (float) var68[var73] * var75);
                        var12.method2523(-4231, (float) var67[var73] * var75);
                        var12.method2523(-4231, (float) var70[var73] * var75);
                    }
                    var12.field5459 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field5049; var76++) {
                    int var77 = var69[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2524(123, (float) var68[var76] * var72);
                        var12.method2524(-94, (float) var67[var76] * var72);
                        var12.method2524(125, (float) var70[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2524(81, (float) var68[var76] * var78);
                        var12.method2524(82, (float) var67[var76] * var78);
                        var12.method2524(-128, (float) var70[var76] * var78);
                    }
                    var12.field5459 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field5459 = var11;
            if (this.field5029.field3588) {
                for (int var80 = 0; var80 < this.field5049; var80++) {
                    var12.method2523(-4231, this.field4981[var80]);
                    var12.method2523(-4231, this.field5027[var80]);
                    var12.field5459 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field5049; var79++) {
                    var12.method2524(-95, this.field4981[var79]);
                    var12.method2524(102, this.field5027[var79]);
                    var12.field5459 += var7 - 8;
                }
            }
        }
        var12.field5459 = this.field5049 * var7;
        class401 var81;
        if (arg1) {
            if (this.field5030 == null) {
                this.field5030 = this.field5029.method1596(0, var12.field5459, var12.field5518, true, var7);
            } else {
                this.field5030.method2501(var12.field5518, var7, 30463, var12.field5459);
            }
            this.field5021 = 0;
            var81 = this.field5030;
        } else {
            var81 = this.field5029.method1596(0, var12.field5459, var12.field5518, false, var7);
            this.field4963 = true;
        }
        if (var5) {
            this.field4994.field6113 = var8;
            this.field4994.field6116 = var81;
        }
        if (var6) {
            this.field4957.field6116 = var81;
            this.field4957.field6113 = var11;
        }
        if (var3) {
            this.field5023.field6113 = var9;
            this.field5023.field6116 = var81;
        }
        if (var4) {
            this.field4986.field6116 = var81;
            this.field4986.field6113 = var10;
        }
    }

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "(I)V")
    public static final void method2175(int arg0) {
        field4947++;
        if (arg0 != 7349) {
            return;
        }
        if (class379.field5542.method519()) {
            class379.field5542.method476(class706.field9894);
            class625.method3434(0);
            if (class130.field1934) {
                class705.method3946(class706.field9894, 103);
            } else {
                Dimension var1 = class706.field9894.getSize();
                class379.field5542.method480(class706.field9894, var1.width, var1.height);
            }
            class379.field5542.method460(class706.field9894);
        } else {
            class793.method4365((byte) -41, false, class712.field9959.field1270.method4293(26));
        }
        class229.method1502(0);
        class768.field10591 = true;
    }

    @OriginalMember(owner = "client!nha", name = "V", descriptor = "()I")
    public final int method327() {
        if (!this.field5009) {
            this.method2167(-114);
        }
        field4995++;
        return this.field4997;
    }

    @OriginalMember(owner = "client!nha", name = "fa", descriptor = "()I")
    public final int method335() {
        field5013++;
        if (!this.field5009) {
            this.method2167(-47);
        }
        return this.field4930;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IBIIIIIII)Z")
    private final boolean method2176(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4937++;
        if (arg1 > -76) {
            return true;
        } else if (arg2 > arg6 && arg5 > arg6 && arg6 < arg8) {
            return false;
        } else if (arg6 > arg2 && arg6 > arg5 && arg6 > arg8) {
            return false;
        } else if (arg7 > arg0 && arg3 > arg0 && arg0 < arg4) {
            return false;
        } else {
            return arg7 >= arg0 || arg0 <= arg3 || arg0 <= arg4;
        }
    }

    @OriginalMember(owner = "client!nha", name = "k", descriptor = "(I)V")
    public final void method307(int arg0) {
        field5040++;
        int var2 = class749.field10324[arg0];
        int var3 = class749.field10316[arg0];
        for (int var4 = 0; var4 < this.field4934; var4++) {
            int var7 = this.field5026[var4] * var3 + this.field4944[var4] * var2 >> 14;
            this.field4944[var4] = this.field4944[var4] * var3 - (this.field5026[var4] * var2) >> 14;
            this.field5026[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5049; var5++) {
            int var6 = this.field4992[var5] * var2 + this.field4979[var5] * var3 >> 14;
            this.field4992[var5] = (short) (this.field4992[var5] * var3 - (this.field4979[var5] * var2) >> 14);
            this.field4979[var5] = (short) var6;
        }
        if (this.field4986 == null && this.field5023 != null) {
            this.field5023.field6116 = null;
        }
        if (this.field4986 != null) {
            this.field4986.field6116 = null;
        }
        if (this.field4994 != null) {
            this.field4994.field6116 = null;
        }
        this.field5009 = false;
    }

    @OriginalMember(owner = "client!nha", name = "EA", descriptor = "()I")
    public final int method338() {
        if (!this.field5009) {
            this.method2167(-58);
        }
        field4998++;
        return this.field4954;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(BIISI)I")
    private final int method2177(byte arg0, int arg1, int arg2, short arg3, int arg4) {
        field5028++;
        int var6 = class145.field2069[class42.method287((byte) 13, arg2, arg4)];
        if (arg1 != arg3) {
            class662 var7 = this.field5029.field912.method1174(arg3 & 0xFFFF, true);
            int var8 = var7.field9146 & 0xFF;
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
                    var6 = ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field9133 & 0xFF;
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
                var6 = (var15 >> 8) + ((var13 & 0xEF00FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!nha", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method321(int arg0, int arg1, class296 arg2, class296 arg3, int arg4, int arg5, int arg6) {
        field4968++;
        if (!this.field5009) {
            this.method2167(-98);
        }
        int var8 = this.field4997 + arg4;
        int var9 = arg4 + this.field4970;
        int var10 = this.field5050 + arg6;
        int var11 = this.field4985 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field4295 + var9 >> arg2.field4297 >= arg2.field4301 || var10 < 0 || arg2.field4300 <= (arg2.field4295 + var11 >> arg2.field4297)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || var9 + arg3.field4295 >> arg3.field4297 >= arg3.field4301 || var10 < 0 || (arg3.field4295 + var11 >> arg3.field4297) >= arg3.field4300) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4297;
            int var13 = arg2.field4295 + var9 - 1 >> arg2.field4297;
            int var14 = var10 >> arg2.field4297;
            int var15 = arg2.field4295 + var11 - 1 >> arg2.field4297;
            if (arg2.method1880(var12, false, var14) == arg5 && arg5 == arg2.method1880(var13, false, var14) && arg5 == arg2.method1880(var12, false, var15) && arg2.method1880(var13, false, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field4934; var16++) {
                this.field5047[var16] = this.field5047[var16] + arg2.method1882(this.field4944[var16] + arg6, 0, this.field5026[var16] + arg4) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field4930;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field4934; var18++) {
                int var19 = (this.field5047[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field5047[var18] -= -((arg2.method1882(this.field4944[var18] + arg6, 0, this.field5026[var18] + arg4) - arg5) * (arg1 - var19) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = ((arg1 & 0xFFFF) >> 8) * 4;
            int var22 = (arg1 >> 16 & 0xFF) << 6;
            int var23 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var20 >> 1)) < 0 || arg2.field4301 << arg2.field4297 <= arg4 - (-(var20 >> 1) - arg2.field4295) || (arg6 - (var21 >> 1)) < 0 || (var21 >> 1) + arg6 + arg2.field4295 >= arg2.field4300 << arg2.field4297) {
                return;
            }
            this.method2885(arg5, arg2, -11, var22, var23, var20, var21, arg4, arg6);
        } else if (arg0 == 4) {
            int var31 = this.field4954 - this.field4930;
            for (int var32 = 0; var32 < this.field4934; var32++) {
                this.field5047[var32] = var31 + this.field5047[var32] + (arg3.method1882(this.field4944[var32] + arg6, 0, this.field5026[var32] + arg4) - arg5);
            }
        } else if (arg0 == 5) {
            int var24 = this.field4954 - this.field4930;
            for (int var25 = 0; var25 < this.field4934; var25++) {
                int var26 = this.field5026[var25] + arg4;
                int var27 = this.field4944[var25] + arg6;
                int var28 = arg2.method1882(var27, 0, var26);
                int var29 = arg3.method1882(var27, 0, var26);
                int var30 = var28 - arg1 - var29;
                this.field5047[var25] = var28 - (arg5 - ((this.field5047[var25] << 8) / var24 * var30 >> 8));
            }
        }
        this.field5009 = false;
        if (this.field4994 != null) {
            this.field4994.field6116 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Ldia;)V")
    public class342(class246 arg0) {
        this.field5029 = arg0;
        this.field4994 = new class430(null, 5126, 3, 0);
        this.field4957 = new class430(null, 5126, 2, 0);
        this.field4986 = new class430(null, 5126, 3, 0);
        this.field5023 = new class430(null, 5121, 4, 0);
        this.field5012 = new class752();
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Ldia;Lgfa;IIII)V")
    public class342(class246 arg0, class782 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5029 = arg0;
        this.field4948 = arg2;
        this.field4976 = arg5;
        if (class293.method1853(35716, arg5, arg2)) {
            this.field4994 = new class430(null, 5126, 3, 0);
        }
        if (class743.method4117(arg2, arg5, 2048)) {
            this.field4957 = new class430(null, 5126, 2, 0);
        }
        if (class135.method1061((byte) 94, arg2, arg5)) {
            this.field4986 = new class430(null, 5126, 3, 0);
        }
        if (class717.method4004(arg5, (byte) -1, arg2)) {
            this.field5023 = new class430(null, 5121, 4, 0);
        }
        if (class39.method272(0, arg2, arg5)) {
            this.field5012 = new class752();
        }
        class161 var7 = arg0.field912;
        this.field5033 = new int[arg1.field10756 + 1];
        int[] var8 = new int[arg1.field10752];
        for (int var9 = 0; var9 < arg1.field10752; var9++) {
            if (arg1.field10776 == null || arg1.field10776[var9] != 2) {
                if (arg1.field10778 != null && arg1.field10778[var9] != -1) {
                    class662 var173 = var7.method1174(arg1.field10778[var9] & 0xFFFF, true);
                    if (((this.field4976 & 0x40) == 0 || !var173.field9142) && var173.field9150) {
                        continue;
                    }
                }
                var8[this.field5003++] = var9;
                this.field5033[arg1.field10757[var9]]++;
                this.field5033[arg1.field10768[var9]]++;
                this.field5033[arg1.field10750[var9]]++;
            }
        }
        this.field4936 = this.field5003;
        long[] var10 = new long[this.field5003];
        boolean var11 = (this.field4948 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field5003; var12++) {
            int var156 = var8[var12];
            class662 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field10733 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field10733.length; var163++) {
                    class466 var164 = arg1.field10733[var163];
                    if (var164.field6464 == var156) {
                        class346 var165 = class344.method2183((byte) 113, var164.field6468);
                        if (var165.field5076) {
                            var162 = true;
                        }
                        if (var165.field5074 != -1) {
                            class662 var166 = var7.method1174(var165.field5074, true);
                            if (var166.field9135 == 2) {
                                this.field4945 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field4936--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field10778 != null) {
                var167 = arg1.field10778[var156];
                if (var167 != -1) {
                    var157 = var7.method1174(var167 & 0xFFFF, true);
                    if ((this.field4976 & 0x40) != 0 && var157.field9142) {
                        var157 = null;
                        var167 = -1;
                    } else {
                        if (var157.field9152 != 0 || var157.field9157 != 0) {
                            this.field5043 = true;
                        }
                        var160 = var157.field9140;
                        var161 = var157.field9149;
                    }
                }
            }
            boolean var168 = arg1.field10781 != null && arg1.field10781[var156] != 0 || var157 != null && var157.field9135 != 0;
            if ((var11 || var168) && arg1.field10742 != null) {
                var158 += arg1.field10742[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = ((var167 & 0xFFFF) << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + ((long) var172);
            this.field5043 |= var157 != null && (var157.field9152 != 0 || var157.field9157 != 0);
            this.field4945 |= var168;
        }
        class598.method3325(var8, (byte) -68, var10);
        this.field5026 = arg1.field10777;
        this.field4956 = arg1.field10746;
        this.field5047 = arg1.field10771;
        this.field4934 = arg1.field10756;
        this.field4944 = arg1.field10734;
        this.field4942 = arg1.field10740;
        this.field5041 = arg1.field10738;
        this.field5000 = arg1.field10783;
        class134[] var13 = new class134[this.field4934];
        if (arg1.field10733 != null) {
            this.field4988 = arg1.field10733.length;
            this.field5004 = new class194[this.field4988];
            this.field4933 = new class251[this.field4988];
            for (int var14 = 0; var14 < this.field4988; var14++) {
                class466 var15 = arg1.field10733[var14];
                class346 var16 = class344.method2183((byte) 113, var15.field6468);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5003; var18++) {
                    if (var8[var18] == var15.field6464) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class145.field2069[arg1.field10732[var15.field6464] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field10781 == null ? 0 : arg1.field10781[var15.field6464]) << 24;
                this.field4933[var14] = new class251(var17, arg1.field10757[var15.field6464], arg1.field10768[var15.field6464], arg1.field10750[var15.field6464], var16.field5080, var16.field5081, var16.field5074, var16.field5077, var16.field5075, var16.field5076, var16.field5073, var15.field6461);
                this.field5004[var14] = new class194(var20);
            }
        }
        int var21 = this.field5003 * 3;
        this.field5027 = new float[var21];
        this.field4979 = new short[var21];
        this.field4955 = new short[this.field5003];
        this.field4973 = new byte[this.field5003];
        this.field5011 = new short[var21];
        this.field4977 = (short) arg4;
        this.field4950 = new short[var21];
        this.field4952 = new short[this.field5003];
        this.field4981 = new float[var21];
        this.field4992 = new short[var21];
        this.field5015 = new short[this.field5003];
        this.field5035 = (short) arg3;
        if (arg1.field10751 != null) {
            this.field4953 = new short[this.field5003];
        }
        this.field4935 = new short[this.field5003];
        this.field4991 = new short[this.field5003];
        this.field5022 = new byte[var21];
        class602.field8188 = new long[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field10756; var23++) {
            int var155 = this.field5033[var23];
            this.field5033[var23] = var22;
            var22 += var155;
            var13[var23] = new class134();
        }
        this.field5033[arg1.field10756] = var22;
        class41 var24 = class7.method56(arg1, true, this.field5003, var8);
        class180[] var25 = new class180[arg1.field10752];
        for (int var26 = 0; var26 < arg1.field10752; var26++) {
            short var134 = arg1.field10757[var26];
            short var135 = arg1.field10768[var26];
            short var136 = arg1.field10750[var26];
            int var137 = this.field5026[var135] - this.field5026[var134];
            int var138 = this.field5047[var135] - this.field5047[var134];
            int var139 = this.field4944[var135] - this.field4944[var134];
            int var140 = this.field5026[var136] - this.field5026[var134];
            int var141 = this.field5047[var136] - this.field5047[var134];
            int var142 = this.field4944[var136] - this.field4944[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145 = var137 * var141 - (var138 * var140);
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var143 >>= 0x1;
                var145 >>= 0x1;
                var144 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var143 * var143 + var144 * var144 + var145 * var145));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var145 * 256 / var146;
            int var148 = var143 * 256 / var146;
            int var149 = var144 * 256 / var146;
            byte var150 = arg1.field10776 == null ? 0 : arg1.field10776[var26];
            if (var150 == 0) {
                class134 var151 = var13[var134];
                var151.field1968 += var149;
                var151.field1971++;
                var151.field1973 += var147;
                var151.field1972 += var148;
                class134 var152 = var13[var135];
                var152.field1968 += var149;
                var152.field1972 += var148;
                var152.field1973 += var147;
                var152.field1971++;
                class134 var153 = var13[var136];
                var153.field1968 += var149;
                var153.field1972 += var148;
                var153.field1973 += var147;
                var153.field1971++;
            } else if (var150 == 1) {
                class180 var154 = var25[var26] = new class180();
                var154.field2391 = var147;
                var154.field2387 = var148;
                var154.field2392 = var149;
            }
        }
        for (int var27 = 0; var27 < this.field5003; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field10732[var43] & 0xFFFF;
            int var45;
            if (arg1.field10785 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field10785[var43];
            }
            int var46;
            if (arg1.field10781 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field10781[var43] & 0xFF;
            }
            short var47 = arg1.field10778 == null ? -1 : arg1.field10778[var43];
            if (var47 != -1 && (this.field4976 & 0x40) != 0) {
                class662 var48 = var7.method1174(var47 & 0xFFFF, true);
                if (var48.field9142) {
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
                    var52 = 1.0F;
                    var54 = 0.0F;
                    var51 = 1.0F;
                    var49 = 0.0F;
                    var55 = 1;
                    var50 = 1.0F;
                    var56 = 2;
                    var53 = 0.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field10759[var45];
                    if (var58 == 0) {
                        short var59 = arg1.field10757[var43];
                        short var60 = arg1.field10768[var43];
                        short var61 = arg1.field10750[var43];
                        short var62 = arg1.field10788[var45];
                        short var63 = arg1.field10763[var45];
                        short var64 = arg1.field10758[var45];
                        float var65 = (float) arg1.field10777[var62];
                        float var66 = (float) arg1.field10771[var62];
                        float var67 = (float) arg1.field10734[var62];
                        float var68 = (float) arg1.field10777[var63] - var65;
                        float var69 = (float) arg1.field10771[var63] - var66;
                        float var70 = (float) arg1.field10734[var63] - var67;
                        float var71 = (float) arg1.field10777[var64] - var65;
                        float var72 = (float) arg1.field10771[var64] - var66;
                        float var73 = (float) arg1.field10734[var64] - var67;
                        float var74 = (float) arg1.field10777[var59] - var65;
                        float var75 = (float) arg1.field10771[var59] - var66;
                        float var76 = (float) arg1.field10734[var59] - var67;
                        float var77 = (float) arg1.field10777[var60] - var65;
                        float var78 = (float) arg1.field10771[var60] - var66;
                        float var79 = (float) arg1.field10734[var60] - var67;
                        float var80 = (float) arg1.field10777[var61] - var65;
                        float var81 = (float) arg1.field10771[var61] - var66;
                        float var82 = (float) arg1.field10734[var61] - var67;
                        float var83 = var69 * var73 - (var70 * var72);
                        float var84 = var70 * var71 - var68 * var73;
                        float var85 = var68 * var72 - (var69 * var71);
                        float var86 = var72 * var85 - (var73 * var84);
                        float var87 = var73 * var83 - (var71 * var85);
                        float var88 = var71 * var84 - (var72 * var83);
                        float var89 = 1.0F / (var70 * var88 + var68 * var86 + var69 * var87);
                        var53 = (var82 * var88 + var80 * var86 + var81 * var87) * var89;
                        var49 = (var76 * var88 + var74 * var86 + var75 * var87) * var89;
                        var51 = (var79 * var88 + var77 * var86 + var78 * var87) * var89;
                        float var90 = var69 * var85 - var70 * var84;
                        float var91 = var68 * var84 - (var69 * var83);
                        float var92 = var70 * var83 - (var68 * var85);
                        float var93 = 1.0F / (var73 * var91 + var71 * var90 + var72 * var92);
                        var54 = (var82 * var91 + var80 * var90 + var81 * var92) * var93;
                        var50 = (var76 * var91 + var74 * var90 + var75 * var92) * var93;
                        var52 = (var79 * var91 + var77 * var90 + var78 * var92) * var93;
                    } else {
                        short var94 = arg1.field10757[var43];
                        short var95 = arg1.field10768[var43];
                        short var96 = arg1.field10750[var43];
                        int var97 = var24.field645[var45];
                        int var98 = var24.field646[var45];
                        int var99 = var24.field640[var45];
                        float[] var100 = var24.field643[var45];
                        byte var101 = arg1.field10735[var45];
                        float var102 = (float) arg1.field10786[var45] / 256.0F;
                        if (var58 == 1) {
                            float var103 = (float) arg1.field10743[var45] / 1024.0F;
                            class624.method3416(var97, var100, var101, var102, var98, arg1.field10771[var94], var103, var99, arg1.field10734[var94], class695.field9735, arg1.field10777[var94], -111);
                            var50 = class695.field9735[1];
                            var49 = class695.field9735[0];
                            class624.method3416(var97, var100, var101, var102, var98, arg1.field10771[var95], var103, var99, arg1.field10734[var95], class695.field9735, arg1.field10777[var95], -118);
                            var51 = class695.field9735[0];
                            var52 = class695.field9735[1];
                            class624.method3416(var97, var100, var101, var102, var98, arg1.field10771[var96], var103, var99, arg1.field10734[var96], class695.field9735, arg1.field10777[var96], -105);
                            var54 = class695.field9735[1];
                            var53 = class695.field9735[0];
                            float var104 = var103 / 2.0F;
                            if ((var101 & 0x1) == 0) {
                                if (var53 - var49 > var104) {
                                    var56 = 1;
                                    var53 -= var103;
                                } else if (var104 < var49 - var53) {
                                    var53 += var103;
                                    var56 = 2;
                                }
                                if ((var104 < var51 - var49)) {
                                    var51 -= var103;
                                    var55 = 1;
                                } else if (var104 < var49 - var51) {
                                    var51 += var103;
                                    var55 = 2;
                                }
                            } else {
                                if ((var104 < var54 - var50)) {
                                    var54 -= var103;
                                    var56 = 1;
                                } else if (var50 - var54 > var104) {
                                    var56 = 2;
                                    var54 += var103;
                                }
                                if ((var104 < var52 - var50)) {
                                    var55 = 1;
                                    var52 -= var103;
                                } else if (var104 < var50 - var52) {
                                    var52 += var103;
                                    var55 = 2;
                                }
                            }
                        } else if (var58 == 2) {
                            float var105 = (float) arg1.field10766[var45] / 256.0F;
                            float var106 = (float) arg1.field10760[var45] / 256.0F;
                            int var107 = arg1.field10777[var95] - arg1.field10777[var94];
                            int var108 = arg1.field10771[var95] - arg1.field10771[var94];
                            int var109 = arg1.field10734[var95] - arg1.field10734[var94];
                            int var110 = arg1.field10777[var96] - arg1.field10777[var94];
                            int var111 = arg1.field10771[var96] - arg1.field10771[var94];
                            int var112 = arg1.field10734[var96] - arg1.field10734[var94];
                            int var113 = var108 * var112 - (var109 * var111);
                            int var114 = var109 * var110 - (var107 * var112);
                            int var115 = var107 * var111 - (var108 * var110);
                            float var116 = 64.0F / (float) arg1.field10765[var45];
                            float var117 = 64.0F / (float) arg1.field10772[var45];
                            float var118 = 64.0F / (float) arg1.field10743[var45];
                            float var119 = (var100[2] * (float) var115 + var100[0] * (float) var113 + var100[1] * (float) var114) / var116;
                            float var120 = (var100[5] * (float) var115 + var100[3] * (float) var113 + var100[4] * (float) var114) / var117;
                            float var121 = (var100[8] * (float) var115 + var100[6] * (float) var113 + var100[7] * (float) var114) / var118;
                            var57 = class5.method36(var119, var120, var121, -12855);
                            class214.method1414(var57, class695.field9735, var101, var98, var99, arg1.field10777[var94], var97, 0, var100, var106, arg1.field10734[var94], arg1.field10771[var94], var102, var105);
                            var50 = class695.field9735[1];
                            var49 = class695.field9735[0];
                            class214.method1414(var57, class695.field9735, var101, var98, var99, arg1.field10777[var95], var97, 0, var100, var106, arg1.field10734[var95], arg1.field10771[var95], var102, var105);
                            var52 = class695.field9735[1];
                            var51 = class695.field9735[0];
                            class214.method1414(var57, class695.field9735, var101, var98, var99, arg1.field10777[var96], var97, 0, var100, var106, arg1.field10734[var96], arg1.field10771[var96], var102, var105);
                            var53 = class695.field9735[0];
                            var54 = class695.field9735[1];
                        } else if (var58 == 3) {
                            class462.method2741(class695.field9735, var97, arg1.field10777[var94], var98, arg1.field10734[var94], arg1.field10771[var94], var100, var99, true, var101, var102);
                            var50 = class695.field9735[1];
                            var49 = class695.field9735[0];
                            class462.method2741(class695.field9735, var97, arg1.field10777[var95], var98, arg1.field10734[var95], arg1.field10771[var95], var100, var99, true, var101, var102);
                            var51 = class695.field9735[0];
                            var52 = class695.field9735[1];
                            class462.method2741(class695.field9735, var97, arg1.field10777[var96], var98, arg1.field10734[var96], arg1.field10771[var96], var100, var99, true, var101, var102);
                            var54 = class695.field9735[1];
                            var53 = class695.field9735[0];
                            if ((var101 & 0x1) == 0) {
                                if ((var51 - var49 > 0.5F)) {
                                    var55 = 1;
                                    var51--;
                                } else if (var49 - var51 > 0.5F) {
                                    var55 = 2;
                                    var51++;
                                }
                                if ((var53 - var49 > 0.5F)) {
                                    var56 = 1;
                                    var53--;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                            } else {
                                if (var54 - var50 > 0.5F) {
                                    var56 = 1;
                                    var54--;
                                } else if (var50 - var54 > 0.5F) {
                                    var54++;
                                    var56 = 2;
                                }
                                if (var52 - var50 > 0.5F) {
                                    var55 = 1;
                                    var52--;
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
            if (arg1.field10776 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field10776[var43];
            }
            if (var122 == 0) {
                long var126 = ((long) (var44 << 8) + (long) (var57 << 24) + ((long) var46) << 32) + (long) (var45 << 2);
                short var128 = arg1.field10757[var43];
                short var129 = arg1.field10768[var43];
                short var130 = arg1.field10750[var43];
                class134 var131 = var13[var128];
                this.field5015[var27] = this.method2168(arg1, var126, var131.field1973, var49, var131.field1972, var131.field1968, 112, var50, var131.field1971, var128);
                class134 var132 = var13[var129];
                this.field4952[var27] = this.method2168(arg1, (long) var55 + var126, var132.field1973, var51, var132.field1972, var132.field1968, 127, var52, var132.field1971, var129);
                class134 var133 = var13[var130];
                this.field4955[var27] = this.method2168(arg1, (long) var56 + var126, var133.field1973, var53, var133.field1972, var133.field1968, 112, var54, var133.field1971, var130);
            } else if (var122 == 1) {
                class180 var123 = var25[var43];
                long var124 = (long) ((var123.field2391 + 256 << 22) + ((var45 << 2) + (var123.field2387 > 0 ? 1024 : 2048)) + (var123.field2392 + 256 << 12)) + ((long) (var57 << 24) + (long) var46 + (long) (var44 << 8) << 32);
                this.field5015[var27] = this.method2168(arg1, var124, var123.field2391, var49, var123.field2387, var123.field2392, 118, var50, 0, arg1.field10757[var43]);
                this.field4952[var27] = this.method2168(arg1, (long) var55 + var124, var123.field2391, var51, var123.field2387, var123.field2392, 124, var52, 0, arg1.field10768[var43]);
                this.field4955[var27] = this.method2168(arg1, (long) var56 + var124, var123.field2391, var53, var123.field2387, var123.field2392, 98, var54, 0, arg1.field10750[var43]);
            }
            if (arg1.field10781 != null) {
                this.field4973[var27] = arg1.field10781[var43];
            }
            if (arg1.field10751 != null) {
                this.field4953[var27] = arg1.field10751[var43];
            }
            this.field4935[var27] = arg1.field10732[var43];
            this.field4991[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field4936; var30++) {
            short var42 = this.field4991[var30];
            if (var29 != var42) {
                var28++;
                var29 = var42;
            }
        }
        this.field5046 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field4936; var33++) {
            short var41 = this.field4991[var33];
            if (var32 != var41) {
                var32 = var41;
                this.field5046[var31++] = var33;
            }
        }
        this.field5046[var31] = this.field4936;
        class602.field8188 = null;
        this.field4979 = class463.method2748(0, this.field4979, this.field5049);
        this.field4950 = class463.method2748(0, this.field4950, this.field5049);
        this.field4992 = class463.method2748(0, this.field4992, this.field5049);
        this.field5022 = class569.method3190(this.field5049, this.field5022, true);
        this.field4981 = class52.method379(0, this.field4981, this.field5049);
        this.field5027 = class52.method379(0, this.field5027, this.field5049);
        if (arg1.field10755 != null && class545.method3101(32, arg2, this.field4976)) {
            this.field5002 = arg1.method4327(0, false);
        }
        if (arg1.field10733 != null && class73.method653(this.field4976, (byte) -81, arg2)) {
            this.field4967 = arg1.method4321(-127);
        }
        if (arg1.field10770 != null && class417.method2572(arg2, this.field4976, -1)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field5003; var36++) {
                int var40 = arg1.field10770[var8[var36]];
                if (var40 >= 0) {
                    if (var40 > var34) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field4969 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field4969[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field5003; var38++) {
                int var39 = arg1.field10770[var8[var38]];
                if (var39 >= 0) {
                    this.field4969[var39][var35[var39]++] = var38;
                }
            }
        }
    }
}
