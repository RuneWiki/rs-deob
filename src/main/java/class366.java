import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class366 extends class473 {

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    private int field4919 = 0;

    @OriginalMember(owner = "client!jg", name = "ob", descriptor = "I")
    private int field4969 = 0;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    private int field4927 = 0;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "Z")
    private boolean field4940 = true;

    @OriginalMember(owner = "client!jg", name = "gc", descriptor = "I")
    private int field5013 = 0;

    @OriginalMember(owner = "client!jg", name = "oc", descriptor = "I")
    private int field5021 = 0;

    @OriginalMember(owner = "client!jg", name = "Bb", descriptor = "Z")
    private boolean field4982 = false;

    @OriginalMember(owner = "client!jg", name = "xc", descriptor = "Z")
    private boolean field5030 = false;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Lvj;")
    private class422 field4949;

    @OriginalMember(owner = "client!jg", name = "kb", descriptor = "Lhea;")
    private class351 field4965;

    @OriginalMember(owner = "client!jg", name = "bc", descriptor = "Lhea;")
    private class351 field5008;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Lhea;")
    private class351 field4916;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "Lhea;")
    private class351 field4959;

    @OriginalMember(owner = "client!jg", name = "jb", descriptor = "Ldr;")
    private class395 field4964;

    @OriginalMember(owner = "client!jg", name = "Nb", descriptor = "I")
    private int field4994;

    @OriginalMember(owner = "client!jg", name = "Hb", descriptor = "I")
    private int field4988;

    @OriginalMember(owner = "client!jg", name = "wb", descriptor = "[I")
    private int[] field4977;

    @OriginalMember(owner = "client!jg", name = "Cb", descriptor = "[I")
    private int[] field4983;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "[I")
    private int[] field4918;

    @OriginalMember(owner = "client!jg", name = "sb", descriptor = "[I")
    private int[] field4973;

    @OriginalMember(owner = "client!jg", name = "ic", descriptor = "[S")
    private short[] field5015;

    @OriginalMember(owner = "client!jg", name = "Wb", descriptor = "[Lqr;")
    private class667[] field5003;

    @OriginalMember(owner = "client!jg", name = "pc", descriptor = "[Low;")
    private class93[] field5022;

    @OriginalMember(owner = "client!jg", name = "mb", descriptor = "I")
    private int field4967;

    @OriginalMember(owner = "client!jg", name = "Fb", descriptor = "[Ltg;")
    private class678[] field4986;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "[Lrf;")
    private class113[] field4922;

    @OriginalMember(owner = "client!jg", name = "nb", descriptor = "[S")
    private short[] field4968;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "[S")
    private short[] field4937;

    @OriginalMember(owner = "client!jg", name = "tb", descriptor = "[S")
    private short[] field4974;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "[F")
    private float[] field4914;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "[S")
    private short[] field4923;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "S")
    private short field4947;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "[F")
    private float[] field4936;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "[B")
    private byte[] field4920;

    @OriginalMember(owner = "client!jg", name = "rc", descriptor = "[S")
    private short[] field5024;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "[B")
    private byte[] field4932;

    @OriginalMember(owner = "client!jg", name = "Vb", descriptor = "[S")
    private short[] field5002;

    @OriginalMember(owner = "client!jg", name = "vc", descriptor = "S")
    private short field5028;

    @OriginalMember(owner = "client!jg", name = "Yb", descriptor = "[S")
    private short[] field5005;

    @OriginalMember(owner = "client!jg", name = "mc", descriptor = "[S")
    private short[] field5019;

    @OriginalMember(owner = "client!jg", name = "Qb", descriptor = "[S")
    private short[] field4997;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "[S")
    private short[] field4941;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "[I")
    private int[] field4955;

    @OriginalMember(owner = "client!jg", name = "zb", descriptor = "[[I")
    private int[][] field4980;

    @OriginalMember(owner = "client!jg", name = "Kb", descriptor = "[[I")
    private int[][] field4991;

    @OriginalMember(owner = "client!jg", name = "Pb", descriptor = "[[I")
    private int[][] field4996;

    @OriginalMember(owner = "client!jg", name = "lc", descriptor = "B")
    private byte field5018;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!jg", name = "gb", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!jg", name = "hb", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!jg", name = "ib", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!jg", name = "lb", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!jg", name = "pb", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!jg", name = "qb", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!jg", name = "ub", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!jg", name = "xb", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!jg", name = "yb", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!jg", name = "Eb", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!jg", name = "Gb", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!jg", name = "Ib", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!jg", name = "Jb", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!jg", name = "Lb", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!jg", name = "Ob", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!jg", name = "Rb", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!jg", name = "Sb", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!jg", name = "Tb", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!jg", name = "Ub", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!jg", name = "Zb", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!jg", name = "cc", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!jg", name = "dc", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!jg", name = "ec", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!jg", name = "fc", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!jg", name = "hc", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!jg", name = "jc", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!jg", name = "kc", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!jg", name = "qc", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!jg", name = "sc", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!jg", name = "tc", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!jg", name = "wc", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!jg", name = "vb", descriptor = "Lut;")
    private class199 field4976;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "Lcn;")
    private class21 field4945;

    @OriginalMember(owner = "client!jg", name = "ac", descriptor = "Lhw;")
    private class517 field5007;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "S")
    private short field4926;

    @OriginalMember(owner = "client!jg", name = "rb", descriptor = "S")
    private short field4972;

    @OriginalMember(owner = "client!jg", name = "Ab", descriptor = "S")
    private short field4981;

    @OriginalMember(owner = "client!jg", name = "Db", descriptor = "S")
    private short field4984;

    @OriginalMember(owner = "client!jg", name = "Mb", descriptor = "S")
    private short field4993;

    @OriginalMember(owner = "client!jg", name = "Xb", descriptor = "S")
    private short field5004;

    @OriginalMember(owner = "client!jg", name = "nc", descriptor = "S")
    private short field5020;

    @OriginalMember(owner = "client!jg", name = "uc", descriptor = "S")
    private short field5027;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(SS)V")
    public final void method1882(short arg0, short arg1) {
        field5011++;
        for (int var3 = 0; var3 < this.field5013; var3++) {
            if (this.field4937[var3] == arg0) {
                this.field4937[var3] = arg1;
            }
        }
        if (this.field4986 != null) {
            for (int var4 = 0; var4 < this.field4967; var4++) {
                class678 var5 = this.field4986[var4];
                class113 var6 = this.field4922[var4];
                var6.field1192 = class194.field2239[this.field4937[var5.field9527] & 0xFFFF] & 0xFFFFFF | var6.field1192 & 0xFF000000;
            }
        }
        if (this.field4959 != null) {
            this.field4959.field4738 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    private final void method2140(byte arg0) {
        field4961++;
        if (!this.field4940) {
            return;
        }
        if (arg0 <= 36) {
            this.field4986 = null;
        }
        this.field4940 = false;
        if (this.field5022 == null && this.field5003 == null && this.field4986 == null) {
            if (this.field4973 != null && !class144.method793(this.field4988, this.field4994, -1)) {
                if (this.field4965 != null && this.field4965.field4738 == null) {
                    this.field4940 = true;
                } else {
                    if (!this.field5030) {
                        this.method2143((byte) -42);
                    }
                    this.field4973 = null;
                }
            }
            if (this.field4983 != null && !class512.method2933(this.field4988, this.field4994, (byte) -83)) {
                if (this.field4965 != null && this.field4965.field4738 == null) {
                    this.field4940 = true;
                } else {
                    if (!this.field5030) {
                        this.method2143((byte) -87);
                    }
                    this.field4983 = null;
                }
            }
            if (this.field4918 != null && !class558.method3162((byte) -107, this.field4988, this.field4994)) {
                if (this.field4965 != null && this.field4965.field4738 == null) {
                    this.field4940 = true;
                } else {
                    if (!this.field5030) {
                        this.method2143((byte) -116);
                    }
                    this.field4918 = null;
                }
            }
        }
        if (this.field4941 != null && this.field4973 == null && this.field4983 == null && this.field4918 == null) {
            this.field4977 = null;
            this.field4941 = null;
        }
        if (this.field4932 != null && !class418.method2346(-102, this.field4994, this.field4988)) {
            if (this.field4916 == null) {
                if (this.field4959 != null && this.field4959.field4738 == null) {
                    this.field4940 = true;
                } else {
                    this.field5024 = this.field4997 = this.field5005 = null;
                    this.field4932 = null;
                }
            } else if (this.field4916.field4738 == null) {
                this.field4940 = true;
            } else {
                this.field4932 = null;
                this.field5024 = this.field4997 = this.field5005 = null;
            }
        }
        if (this.field4937 != null && !class107.method581(this.field4988, 116, this.field4994)) {
            if (this.field4959 != null && this.field4959.field4738 == null) {
                this.field4940 = true;
            } else {
                this.field4937 = null;
            }
        }
        if (this.field4920 != null && !class190.method1152(this.field4988, this.field4994, 262144)) {
            if (this.field4959 != null && this.field4959.field4738 == null) {
                this.field4940 = true;
            } else {
                this.field4920 = null;
            }
        }
        if (this.field4914 != null && !class662.method3679(this.field4988, (byte) 73, this.field4994)) {
            if (this.field5008 != null && this.field5008.field4738 == null) {
                this.field4940 = true;
            } else {
                this.field4914 = this.field4936 = null;
            }
        }
        if (this.field5002 != null && !class31.method161((byte) 91, this.field4988, this.field4994)) {
            if (this.field4959 != null && this.field4959.field4738 == null) {
                this.field4940 = true;
            } else {
                this.field5002 = null;
            }
        }
        if (this.field4968 != null && !class347.method2065(this.field4988, 393216, this.field4994)) {
            if ((this.field4964 == null || this.field4964.field5351 != null) && (this.field4959 == null || this.field4959.field4738 != null)) {
                this.field4968 = this.field5019 = this.field4923 = null;
            } else {
                this.field4940 = true;
            }
        }
        if (this.field4996 != null && !class34.method176(this.field4994, true, this.field4988)) {
            this.field4996 = null;
            this.field4974 = null;
        }
        if (this.field4980 != null && !class235.method1394((byte) -74, this.field4994, this.field4988)) {
            this.field5015 = null;
            this.field4980 = null;
        }
        if (this.field4991 != null && !class163.method885(this.field4988, this.field4994, (byte) -83)) {
            this.field4991 = null;
        }
        if (this.field4955 != null && (this.field4988 & 0x800) == 0 && (this.field4988 & 0x40000) == 0) {
            this.field4955 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final void method1876(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field4921++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            class659.field9247 = 0;
            class695.field9746 = 0;
            class679.field9569 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field4980.length > var15) {
                    int[] var16 = this.field4980[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5015 == null || (this.field5015[var18] & arg6) != 0) {
                            class679.field9569 += this.field4973[var18];
                            class659.field9247 += this.field4983[var18];
                            var13++;
                            class695.field9746 += this.field4918[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class659.field9247 = var10;
                class679.field9569 = var12;
                class695.field9746 = var11;
            } else {
                class659.field9247 = class659.field9247 / var13 + var10;
                class679.field9569 = class679.field9569 / var13 + var12;
                class695.field9746 = class695.field9746 / var13 + var11;
                class246.field3041 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + (arg7[0] * arg2 + (arg7[2] * arg4)) + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 8192 >> 14;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg4 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field4980.length > var26) {
                    int[] var27 = this.field4980[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5015 == null || (arg6 & this.field5015[var29]) != 0) {
                            this.field4973[var29] += var22;
                            this.field4983[var29] += var24;
                            this.field4918[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field4980.length) {
                        int[] var50 = this.field4980[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field5015 == null || (arg6 & this.field5015[var52]) != 0) {
                                this.field4973[var52] -= class679.field9569;
                                this.field4983[var52] -= class659.field9247;
                                this.field4918[var52] -= class695.field9746;
                                if (arg4 != 0) {
                                    int var53 = class435.field6134[arg4];
                                    int var54 = class435.field6135[arg4];
                                    int var55 = this.field4983[var52] * var53 + this.field4973[var52] * var54 + 16383 >> 14;
                                    this.field4983[var52] = this.field4983[var52] * var54 + 16383 - (this.field4973[var52] * var53) >> 14;
                                    this.field4973[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class435.field6134[arg2];
                                    int var57 = class435.field6135[arg2];
                                    int var58 = this.field4983[var52] * var57 + 16383 - (this.field4918[var52] * var56) >> 14;
                                    this.field4918[var52] = this.field4983[var52] * var56 + this.field4918[var52] * var57 + 16383 >> 14;
                                    this.field4983[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class435.field6134[arg3];
                                    int var60 = class435.field6135[arg3];
                                    int var61 = this.field4918[var52] * var59 + this.field4973[var52] * var60 + 16383 >> 14;
                                    this.field4918[var52] = this.field4918[var52] * var60 + 16383 - this.field4973[var52] * var59 >> 14;
                                    this.field4973[var52] = var61;
                                }
                                this.field4973[var52] += class679.field9569;
                                this.field4983[var52] += class659.field9247;
                                this.field4918[var52] += class695.field9746;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field4980.length) {
                            int[] var33 = this.field4980[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field5015 == null || (arg6 & this.field5015[var35]) != 0) {
                                    int var36 = this.field4977[var35];
                                    int var37 = this.field4977[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field4941[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class435.field6134[arg4];
                                            int var41 = class435.field6135[arg4];
                                            int var42 = this.field5024[var39] * var41 + this.field4997[var39] * var40 + 16383 >> 14;
                                            this.field4997[var39] = (short) (this.field4997[var39] * var41 + 16383 - (this.field5024[var39] * var40) >> 14);
                                            this.field5024[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class435.field6134[arg2];
                                            int var44 = class435.field6135[arg2];
                                            int var45 = this.field4997[var39] * var44 + 16383 - (this.field5005[var39] * var43) >> 14;
                                            this.field5005[var39] = (short) (this.field4997[var39] * var43 + (this.field5005[var39] * var44 + 16383) >> 14);
                                            this.field4997[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class435.field6134[arg3];
                                            int var47 = class435.field6135[arg3];
                                            int var48 = this.field5005[var39] * var46 + (this.field5024[var39] * var47 + 16383) >> 14;
                                            this.field5005[var39] = (short) (this.field5005[var39] * var47 + 16383 - (this.field5024[var39] * var46) >> 14);
                                            this.field5024[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field4916 == null && this.field4959 != null) {
                        this.field4959.field4738 = null;
                    }
                    if (this.field4916 != null) {
                        this.field4916.field4738 = null;
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
                if (class246.field3041) {
                    int var68 = arg7[0] * class679.field9569 + (arg7[3] * class659.field9247) + (arg7[6] * class695.field9746 - -8192) >> 14;
                    int var69 = arg7[7] * class695.field9746 + arg7[1] * class679.field9569 - (-(arg7[4] * class659.field9247) - 8192) >> 14;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[8] * class695.field9746 + arg7[2] * class679.field9569 + arg7[5] * class659.field9247 + 8192 >> 14;
                    int var73 = var67 + var72;
                    class659.field9247 = var70;
                    class679.field9569 = var71;
                    class246.field3041 = false;
                    class695.field9746 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class435.field6135[arg2];
                int var76 = class435.field6134[arg2];
                int var77 = class435.field6135[arg3];
                int var78 = class435.field6134[arg3];
                int var79 = class435.field6135[arg4];
                int var80 = class435.field6134[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[5] = -var76;
                var74[0] = var78 * var82 + var77 * var79 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[1] = var78 * var81 + (-var77 * var80 + 8192) >> 14;
                var74[6] = -var78 * var79 + (var77 * var82) + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                int var83 = var74[1] * -class659.field9247 + var74[2] * -class695.field9746 + var74[0] * -class679.field9569 + 8192 >> 14;
                int var84 = var74[4] * -class659.field9247 + (var74[3] * -class679.field9569 - (-(var74[5] * -class695.field9746) - 8192)) >> 14;
                int var85 = var74[8] * -class695.field9746 + var74[6] * -class679.field9569 + var74[7] * -class659.field9247 + 8192 >> 14;
                int var86 = class679.field9569 + var83;
                int var87 = var84 + class659.field9247;
                int var88 = class695.field9746 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += arg7[var119 * 3 + var121] * var74[var90 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[0] * var65 + var74[1] * var66 + var74[2] * var67 + 8192 >> 14;
                int var92 = var74[5] * var67 + var74[3] * var65 - (-(var74[4] * var66) + -8192) >> 14;
                int var93 = var86 + var91;
                int var94 = var87 + var92;
                int var95 = var74[6] * var65 + 8192 - (-(var74[7] * var66) - (var74[8] * var67)) >> 14;
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
                int var99 = arg7[2] * var96 + arg7[0] * var93 + arg7[1] * var94 + 8192 >> 14;
                int var100 = arg7[5] * var96 + arg7[3] * var93 + arg7[4] * var94 + 8192 >> 14;
                int var101 = arg7[7] * var94 + (arg7[6] * var93 + (arg7[8] * var96)) + 8192 >> 14;
                int var102 = var63 + var100;
                int var103 = var62 + var99;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field4980.length > var106) {
                        int[] var107 = this.field4980[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field5015 == null || (arg6 & this.field5015[var109]) != 0) {
                                int var110 = this.field4918[var109] * var97[2] + this.field4983[var109] * var97[1] + this.field4973[var109] * var97[0] + 8192 >> 14;
                                int var111 = this.field4973[var109] * var97[3] - (-(this.field4983[var109] * var97[4]) - (this.field4918[var109] * var97[5]) - 8192) >> 14;
                                int var112 = var102 + var111;
                                int var113 = this.field4983[var109] * var97[7] + this.field4973[var109] * var97[6] - (-(this.field4918[var109] * var97[8]) - 8192) >> 14;
                                int var114 = var103 + var110;
                                int var115 = var104 + var113;
                                this.field4973[var109] = var114;
                                this.field4983[var109] = var112;
                                this.field4918[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field4980.length) {
                        int[] var174 = this.field4980[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5015 == null || (arg6 & this.field5015[var176]) != 0) {
                                this.field4973[var176] -= class679.field9569;
                                this.field4983[var176] -= class659.field9247;
                                this.field4918[var176] -= class695.field9746;
                                this.field4973[var176] = this.field4973[var176] * arg2 >> 7;
                                this.field4983[var176] = this.field4983[var176] * arg3 >> 7;
                                this.field4918[var176] = this.field4918[var176] * arg4 >> 7;
                                this.field4973[var176] += class679.field9569;
                                this.field4983[var176] += class659.field9247;
                                this.field4918[var176] += class695.field9746;
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
                if (class246.field3041) {
                    int var128 = arg7[0] * class679.field9569 + arg7[6] * class695.field9746 + arg7[3] * class659.field9247 + 8192 >> 14;
                    int var129 = arg7[1] * class679.field9569 + (arg7[4] * class659.field9247) - (-(arg7[7] * class695.field9746) - 8192) >> 14;
                    int var130 = var125 + var128;
                    int var131 = arg7[8] * class695.field9746 + arg7[5] * class659.field9247 + arg7[2] * class679.field9569 + 8192 >> 14;
                    int var132 = var126 + var129;
                    class679.field9569 = var130;
                    int var133 = var127 + var131;
                    class659.field9247 = var132;
                    class246.field3041 = false;
                    class695.field9746 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class679.field9569 * var134 + 8192 >> 14;
                int var138 = -class659.field9247 * var135 + 8192 >> 14;
                int var139 = -class695.field9746 * var136 + 8192 >> 14;
                int var140 = class679.field9569 + var137;
                int var141 = class659.field9247 + var138;
                int var142 = class695.field9746 + var139;
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
                            var170 += var143[var169 + (var171 * 3)] * arg7[var151 * 3 + var171];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[2] * var149 + arg7[1] * var147 + arg7[0] * var148 + 8192 >> 14;
                int var153 = arg7[4] * var147 + arg7[3] * var148 + arg7[5] * var149 + 8192 >> 14;
                int var154 = arg7[8] * var149 + arg7[7] * var147 + arg7[6] * var148 + 8192 >> 14;
                int var155 = var123 + var153;
                int var156 = var122 + var152;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field4980.length > var159) {
                        int[] var160 = this.field4980[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field5015 == null || (this.field5015[var162] & arg6) != 0) {
                                int var163 = this.field4973[var162] * var150[0] + this.field4983[var162] * var150[1] + this.field4918[var162] * var150[2] + 8192 >> 14;
                                int var164 = this.field4973[var162] * var150[3] + (this.field4983[var162] * var150[4]) + this.field4918[var162] * var150[5] + 8192 >> 14;
                                int var165 = this.field4973[var162] * var150[6] + this.field4983[var162] * var150[7] + this.field4918[var162] * var150[8] + 8192 >> 14;
                                int var166 = var155 + var164;
                                int var167 = var156 + var163;
                                this.field4973[var162] = var167;
                                int var168 = var157 + var165;
                                this.field4983[var162] = var166;
                                this.field4918[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4996 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field4996.length > var181) {
                        int[] var182 = this.field4996[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field4974 == null || (this.field4974[var184] & arg6) != 0) {
                                int var185 = (this.field4920[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field4920[var184] = (byte) var185;
                                if (this.field4959 != null) {
                                    this.field4959.field4738 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4986 != null) {
                    for (int var178 = 0; var178 < this.field4967; var178++) {
                        class678 var179 = this.field4986[var178];
                        class113 var180 = this.field4922[var178];
                        var180.field1192 = var180.field1192 & 0xFFFFFF | 255 - (this.field4920[var179.field9527] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4996 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field4996.length) {
                        int[] var191 = this.field4996[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field4974 == null || (this.field4974[var193] & arg6) != 0) {
                                int var194 = this.field4937[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var195 + arg2 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                int var200 = arg4 + var199;
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
                                this.field4937[var193] = (short) class422.method2436(class422.method2436(var197 << 10, var198 << 7), var200);
                                if (this.field4959 != null) {
                                    this.field4959.field4738 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4986 != null) {
                    for (int var187 = 0; var187 < this.field4967; var187++) {
                        class678 var188 = this.field4986[var187];
                        class113 var189 = this.field4922[var187];
                        var189.field1192 = class194.field2239[this.field4937[var188.field9527] & 0xFFFF] & 0xFFFFFF | var189.field1192 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4991 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field4991.length) {
                        int[] var203 = this.field4991[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class113 var205 = this.field4922[var203[var204]];
                            var205.field1196 += arg3;
                            var205.field1189 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4991 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field4991.length > var207) {
                        int[] var208 = this.field4991[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class113 var210 = this.field4922[var208[var209]];
                            var210.field1190 = var210.field1190 * arg3 >> 7;
                            var210.field1197 = var210.field1197 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4991 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field4991.length) {
                    int[] var213 = this.field4991[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class113 var215 = this.field4922[var213[var214]];
                        var215.field1193 = var215.field1193 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "()[Lqr;")
    public final class667[] method1897() {
        field4960++;
        return this.field5003;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    private final void method2141(byte arg0) {
        field4963++;
        if (this.field4927 == 0) {
            return;
        }
        if (this.field5018 != 0) {
            this.method2153(true, (byte) -111);
        }
        this.method2153(false, (byte) -111);
        if (this.field4964 != null) {
            if (this.field4964.field5351 == null) {
                this.method2142((this.field5018 & 0x10) != 0, 29126);
            }
            if (this.field4964.field5351 != null) {
                this.field4949.method2410(this.field4916 != null, -118);
                this.field4949.method2419(this.field4965, 116, this.field4959, this.field5008, this.field4916);
                int var2 = this.field4955.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field4955[var3];
                    int var5 = this.field4955[var3 + 1];
                    int var6 = this.field5002[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field4949.method2400(this.field4916 != null, (byte) 23, var6);
                    this.field4949.method2403(this.field4964.field5351, var4 * 3, (var5 - var4) * 3, 4, 109);
                }
            }
        }
        if (arg0 <= 56) {
            method2146(24, null);
        }
        this.method2140((byte) 97);
    }

    @OriginalMember(owner = "client!jg", name = "OA", descriptor = "()I")
    public final int method1865() {
        field4975++;
        if (!this.field5030) {
            this.method2143((byte) 101);
        }
        return this.field4926;
    }

    @OriginalMember(owner = "client!jg", name = "WA", descriptor = "(IIII)V")
    public final void method1900(int arg0, int arg1, int arg2, int arg3) {
        field4954++;
        if (arg0 == 0) {
            class695.field9746 = 0;
            int var5 = 0;
            class659.field9247 = 0;
            class679.field9569 = 0;
            for (int var6 = 0; var6 < this.field4919; var6++) {
                class679.field9569 += this.field4973[var6];
                class659.field9247 += this.field4983[var6];
                var5++;
                class695.field9746 += this.field4918[var6];
            }
            if (var5 > 0) {
                class679.field9569 = class679.field9569 / var5 + arg1;
                class695.field9746 = class695.field9746 / var5 + arg3;
                class659.field9247 = class659.field9247 / var5 + arg2;
            } else {
                class679.field9569 = arg1;
                class659.field9247 = arg2;
                class695.field9746 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4919; var7++) {
                this.field4973[var7] += arg1;
                this.field4983[var7] += arg2;
                this.field4918[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4919; var8++) {
                this.field4973[var8] -= class679.field9569;
                this.field4983[var8] -= class659.field9247;
                this.field4918[var8] -= class695.field9746;
                if (arg3 != 0) {
                    int var9 = class435.field6134[arg3];
                    int var10 = class435.field6135[arg3];
                    int var11 = this.field4983[var8] * var9 + this.field4973[var8] * var10 + 16383 >> 14;
                    this.field4983[var8] = this.field4983[var8] * var10 + 16383 - (this.field4973[var8] * var9) >> 14;
                    this.field4973[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class435.field6134[arg1];
                    int var13 = class435.field6135[arg1];
                    int var14 = this.field4983[var8] * var13 + 16383 - this.field4918[var8] * var12 >> 14;
                    this.field4918[var8] = this.field4983[var8] * var12 + this.field4918[var8] * var13 + 16383 >> 14;
                    this.field4983[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class435.field6134[arg2];
                    int var16 = class435.field6135[arg2];
                    int var17 = this.field4973[var8] * var16 + this.field4918[var8] * var15 + 16383 >> 14;
                    this.field4918[var8] = this.field4918[var8] * var16 + 16383 - (this.field4973[var8] * var15) >> 14;
                    this.field4973[var8] = var17;
                }
                this.field4973[var8] += class679.field9569;
                this.field4983[var8] += class659.field9247;
                this.field4918[var8] += class695.field9746;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4919; var18++) {
                this.field4973[var18] -= class679.field9569;
                this.field4983[var18] -= class659.field9247;
                this.field4918[var18] -= class695.field9746;
                this.field4973[var18] = this.field4973[var18] * arg1 / 128;
                this.field4983[var18] = this.field4983[var18] * arg2 / 128;
                this.field4918[var18] = this.field4918[var18] * arg3 / 128;
                this.field4973[var18] += class679.field9569;
                this.field4983[var18] += class659.field9247;
                this.field4918[var18] += class695.field9746;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5013; var19++) {
                int var23 = (this.field4920[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field4920[var19] = (byte) var23;
            }
            if (this.field4959 != null) {
                this.field4959.field4738 = null;
            }
            if (this.field4986 != null) {
                for (int var20 = 0; var20 < this.field4967; var20++) {
                    class678 var21 = this.field4986[var20];
                    class113 var22 = this.field4922[var20];
                    var22.field1192 = var22.field1192 & 0xFFFFFF | 255 - (this.field4920[var21.field9527] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5013; var24++) {
                int var28 = this.field4937[var24] & 0xFFFF;
                int var29 = (var28 & 0xFDED) >> 10;
                int var30 = (var28 & 0x39F) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = arg2 / 4 + var30;
                int var34 = arg3 + var31;
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
                this.field4937[var24] = (short) class422.method2436(var34, class422.method2436(var33 << 7, var32 << 10));
            }
            if (this.field4959 != null) {
                this.field4959.field4738 = null;
            }
            if (this.field4986 != null) {
                for (int var25 = 0; var25 < this.field4967; var25++) {
                    class678 var26 = this.field4986[var25];
                    class113 var27 = this.field4922[var25];
                    var27.field1192 = class194.field2239[this.field4937[var26.field9527] & 0xFFFF] & 0xFFFFFF | var27.field1192 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field4967; var35++) {
                class113 var36 = this.field4922[var35];
                var36.field1196 += arg2;
                var36.field1189 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field4967; var37++) {
                class113 var38 = this.field4922[var37];
                var38.field1197 = var38.field1197 * arg1 >> 7;
                var38.field1190 = var38.field1190 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field4967; var39++) {
                class113 var40 = this.field4922[var39];
                var40.field1193 = var40.field1193 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "()V")
    public final void method1872() {
        field4931++;
        if (this.field4969 <= 0 || this.field4927 <= 0) {
            return;
        }
        this.method2153(false, (byte) -111);
        if ((this.field5018 & 0x10) == 0 && this.field4964.field5351 == null) {
            this.method2142(false, 29126);
        }
        this.method2140((byte) 52);
    }

    @OriginalMember(owner = "client!jg", name = "MA", descriptor = "(I)V")
    public final void method1884(int arg0) {
        field4938++;
        int var2 = class435.field6134[arg0];
        int var3 = class435.field6135[arg0];
        for (int var4 = 0; var4 < this.field4919; var4++) {
            int var5 = this.field4983[var4] * var3 - (this.field4918[var4] * var2) >> 14;
            this.field4918[var4] = this.field4983[var4] * var2 + (this.field4918[var4] * var3) >> 14;
            this.field4983[var4] = var5;
        }
        if (this.field4965 != null) {
            this.field4965.field4738 = null;
        }
        this.field5030 = false;
    }

    @OriginalMember(owner = "client!jg", name = "na", descriptor = "()I")
    public final int method1887() {
        field4933++;
        return this.field5028;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
    private final void method2142(boolean arg0, int arg1) {
        field5016++;
        if ((this.field4927 * 6) <= this.field4949.field5965.field1269.length) {
            this.field4949.field5965.field1218 = 0;
        } else {
            this.field4949.field5965 = new class209((this.field4927 + 100) * 6);
        }
        class209 var3 = this.field4949.field5965;
        if (this.field4949.field5874) {
            for (int var4 = 0; var4 < this.field4927; var4++) {
                var3.method645(-672168216, this.field4968[var4]);
                var3.method645(arg1 - 672197342, this.field5019[var4]);
                var3.method645(-672168216, this.field4923[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field4927; var5++) {
                var3.method667(13224, this.field4968[var5]);
                var3.method667(13224, this.field5019[var5]);
                var3.method667(13224, this.field4923[var5]);
            }
        }
        if (var3.field1218 == 0) {
            return;
        }
        if (arg0) {
            if (this.field4945 == null) {
                this.field4945 = this.field4949.method2398(var3.field1218, true, var3.field1269, 5123, true);
            } else {
                this.field4945.method97(var3.field1269, var3.field1218, 5123, arg1 - 29063);
            }
            this.field4964.field5351 = this.field4945;
        } else {
            this.field4964.field5351 = this.field4949.method2398(var3.field1218, false, var3.field1269, 5123, true);
        }
        if (!arg0) {
            this.field4940 = true;
        }
        if (arg1 != 29126) {
            this.method1868();
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V")
    private final void method2143(byte arg0) {
        field5014++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -45 % ((18 - arg0) / 60);
        int var8 = -32768;
        int var9 = 0;
        int var10 = 0;
        for (int var11 = 0; var11 < this.field4919; var11++) {
            int var12 = this.field4973[var11];
            int var13 = this.field4983[var11];
            if (var13 < var3) {
                var3 = var13;
            }
            if (var5 < var12) {
                var5 = var12;
            }
            if (var2 > var12) {
                var2 = var12;
            }
            if (var6 < var13) {
                var6 = var13;
            }
            int var14 = this.field4918[var11];
            if (var8 < var14) {
                var8 = var14;
            }
            if (var14 < var4) {
                var4 = var14;
            }
            int var15 = var12 * var12 + var14 * var14;
            if (var9 < var15) {
                var9 = var15;
            }
            int var16 = var13 * var13 + var12 * var12 + var14 * var14;
            if (var16 > var10) {
                var10 = var16;
            }
        }
        this.field5004 = (short) var8;
        this.field4926 = (short) var4;
        this.field4972 = (short) var2;
        this.field4993 = (short) var5;
        this.field5027 = (short) var3;
        this.field5020 = (short) var6;
        this.field4984 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field4981 = (short) ((int) (Math.sqrt((double) var10) + 0.99D));
        this.field5030 = true;
    }

    @OriginalMember(owner = "client!jg", name = "ba", descriptor = "(IILi;Li;III)V")
    public final void method1911(int arg0, int arg1, class274 arg2, class274 arg3, int arg4, int arg5, int arg6) {
        field4924++;
        if (!this.field5030) {
            this.method2143((byte) 99);
        }
        int var8 = this.field4972 + arg4;
        int var9 = arg4 + this.field4993;
        int var10 = arg6 + this.field4926;
        int var11 = this.field5004 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3428 <= (var9 + arg2.field3424 >> arg2.field3430) || var10 < 0 || (arg2.field3424 + var11 >> arg2.field3430) >= arg2.field3426) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3424 + var9 >> arg3.field3430 >= arg3.field3428 || var10 < 0 || (arg3.field3424 + var11 >> arg3.field3430) >= arg3.field3426) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3430;
            int var13 = arg2.field3424 + var9 - 1 >> arg2.field3430;
            int var14 = var10 >> arg2.field3430;
            int var15 = arg2.field3424 + var11 - 1 >> arg2.field3430;
            if (arg2.method1608(var14, 840, var12) == arg5 && arg5 == arg2.method1608(var14, 840, var13) && arg5 == arg2.method1608(var15, 840, var12) && arg5 == arg2.method1608(var15, 840, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field4919; var16++) {
                this.field4983[var16] = this.field4983[var16] + arg2.method1610(this.field4973[var16] + arg4, 99, this.field4918[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field5027;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field4919; var18++) {
                int var19 = (this.field4983[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field4983[var18] += (arg1 - var19) * (arg2.method1610(this.field4973[var18] + arg4, 111, this.field4918[var18] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var29 = (arg1 & 0xFF) * 4;
            int var30 = (arg1 >> 8 & 0xFF) * 4;
            int var31 = arg1 >> 16 & 0xFF << 6;
            int var32 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var29 >> 1)) < 0 || ((var29 >> 1) + arg2.field3424 + arg4) >= (arg2.field3428 << arg2.field3430) || arg6 - (var30 >> 1) < 0 || arg6 + (var30 >> 1) + arg2.field3424 >= arg2.field3426 << arg2.field3430) {
                return;
            }
            this.method2724(var31, var29, 77, arg4, var30, var32, arg5, arg2, arg6);
        } else if (arg0 == 4) {
            int var27 = this.field5020 - this.field5027;
            for (int var28 = 0; var28 < this.field4919; var28++) {
                this.field4983[var28] = var27 + this.field4983[var28] + arg3.method1610(this.field4973[var28] - -arg4, 125, this.field4918[var28] + arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var20 = this.field5020 - this.field5027;
            for (int var21 = 0; var21 < this.field4919; var21++) {
                int var22 = this.field4973[var21] + arg4;
                int var23 = this.field4918[var21] + arg6;
                int var24 = arg2.method1610(var22, 113, var23);
                int var25 = arg3.method1610(var22, 121, var23);
                int var26 = var24 - var25 - arg1;
                this.field4983[var21] = ((this.field4983[var21] << 8) / var20 * var26 >> 8) + var24 - arg5;
            }
        }
        if (this.field4965 != null) {
            this.field4965.field4738 = null;
        }
        this.field5030 = false;
    }

    @OriginalMember(owner = "client!jg", name = "za", descriptor = "()I")
    public final int method1899() {
        field4966++;
        if (!this.field5030) {
            this.method2143((byte) -64);
        }
        return this.field5004;
    }

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "(I)V")
    public final void method1879(int arg0) {
        field5001++;
        int var2 = class435.field6134[arg0];
        int var3 = class435.field6135[arg0];
        for (int var4 = 0; var4 < this.field4919; var4++) {
            int var5 = this.field4918[var4] * var2 + (this.field4973[var4] * var3) >> 14;
            this.field4918[var4] = this.field4918[var4] * var3 - (this.field4973[var4] * var2) >> 14;
            this.field4973[var4] = var5;
        }
        this.field5030 = false;
        if (this.field4965 != null) {
            this.field4965.field4738 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Log;I)V")
    private final void method2144(class102 arg0, int arg1) {
        if (this.field4949.field5970.length < this.field4969) {
            this.field4949.field5969 = new int[this.field4969];
            this.field4949.field5970 = new int[this.field4969];
        }
        field4985++;
        int[] var3 = this.field4949.field5970;
        int[] var4 = this.field4949.field5969;
        for (int var5 = 0; var5 < this.field4919; var5++) {
            int var16 = (this.field4973[var5] - (this.field4983[var5] * this.field4949.field5871 >> 8) >> this.field4949.field5818) - arg0.field1104;
            int var17 = (this.field4918[var5] - (this.field4983[var5] * this.field4949.field5880 >> 8) >> this.field4949.field5818) - arg0.field1097;
            int var18 = this.field4977[var5];
            int var19 = this.field4977[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field4941[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        if (arg1 < 8) {
            this.field4955 = null;
        }
        for (int var6 = 0; var6 < this.field4927; var6++) {
            if (this.field4920 == null || this.field4920[var6] <= 128) {
                short var7 = this.field4968[var6];
                short var8 = this.field5019[var6];
                short var9 = this.field4923[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var14 - var15) * (var10 - var11) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg0.method550(var13, var10, var12, var14, var15, var11, -79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "(I)V")
    public final void method1902(int arg0) {
        field4958++;
        int var2 = class435.field6134[arg0];
        int var3 = class435.field6135[arg0];
        for (int var4 = 0; var4 < this.field4919; var4++) {
            int var5 = this.field4983[var4] * var2 + this.field4973[var4] * var3 >> 14;
            this.field4983[var4] = this.field4983[var4] * var3 - (this.field4973[var4] * var2) >> 14;
            this.field4973[var4] = var5;
        }
        if (this.field4965 != null) {
            this.field4965.field4738 = null;
        }
        this.field5030 = false;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lq;)V")
    public final void method1891(class490 arg0) {
        field4917++;
        class185 var2 = (class185) arg0;
        if (this.field5022 != null) {
            for (int var3 = 0; var3 < this.field5022.length; var3++) {
                class93 var4 = this.field5022[var3];
                class93 var5 = var4;
                if (var4.field955 != null) {
                    var5 = var4.field955;
                }
                var5.field948 = (int) ((float) this.field4918[var4.field936] * var2.field2073 + (float) this.field4983[var4.field936] * var2.field2092 + (float) this.field4973[var4.field936] * var2.field2105 + var2.field2074);
                var5.field938 = (int) ((float) this.field4918[var4.field936] * var2.field2087 + (float) this.field4983[var4.field936] * var2.field2098 + (float) this.field4973[var4.field936] * var2.field2104 + var2.field2076);
                var5.field942 = (int) ((float) this.field4918[var4.field936] * var2.field2101 + (float) this.field4983[var4.field936] * var2.field2103 + (float) this.field4973[var4.field936] * var2.field2102 + var2.field2072);
                var5.field951 = (int) ((float) this.field4918[var4.field945] * var2.field2073 + (float) this.field4983[var4.field945] * var2.field2092 + (float) this.field4973[var4.field945] * var2.field2105 + var2.field2074);
                var5.field947 = (int) ((float) this.field4918[var4.field945] * var2.field2087 + (float) this.field4983[var4.field945] * var2.field2098 + (float) this.field4973[var4.field945] * var2.field2104 + var2.field2076);
                var5.field956 = (int) ((float) this.field4918[var4.field945] * var2.field2101 + (float) this.field4983[var4.field945] * var2.field2103 + (float) this.field4973[var4.field945] * var2.field2102 + var2.field2072);
                var5.field935 = (int) ((float) this.field4918[var4.field952] * var2.field2073 + (float) this.field4983[var4.field952] * var2.field2092 + (float) this.field4973[var4.field952] * var2.field2105 + var2.field2074);
                var5.field954 = (int) ((float) this.field4918[var4.field952] * var2.field2087 + (float) this.field4983[var4.field952] * var2.field2098 + (float) this.field4973[var4.field952] * var2.field2104 + var2.field2076);
                var5.field957 = (int) ((float) this.field4918[var4.field952] * var2.field2101 + (float) this.field4983[var4.field952] * var2.field2103 + (float) this.field4973[var4.field952] * var2.field2102 + var2.field2072);
            }
        }
        if (this.field5003 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5003.length; var6++) {
            class667 var7 = this.field5003[var6];
            class667 var8 = var7;
            if (var7.field9315 != null) {
                var8 = var7.field9315;
            }
            if (var7.field9313 == null) {
                var7.field9313 = var2.method27();
            } else {
                var7.field9313.method15(var2);
            }
            var8.field9316 = (int) ((float) this.field4918[var7.field9310] * var2.field2073 + (float) this.field4983[var7.field9310] * var2.field2092 + (float) this.field4973[var7.field9310] * var2.field2105 + var2.field2074);
            var8.field9307 = (int) ((float) this.field4918[var7.field9310] * var2.field2087 + (float) this.field4983[var7.field9310] * var2.field2098 + (float) this.field4973[var7.field9310] * var2.field2104 + var2.field2076);
            var8.field9308 = (int) ((float) this.field4918[var7.field9310] * var2.field2101 + (float) this.field4983[var7.field9310] * var2.field2103 + (float) this.field4973[var7.field9310] * var2.field2102 + var2.field2072);
        }
    }

    @OriginalMember(owner = "client!jg", name = "TA", descriptor = "()I")
    public final int method1857() {
        field4952++;
        return this.field4947;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    public final void method1904() {
        field4944++;
    }

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "(Lha;)Lha;")
    public final class120 method1874(class120 arg0) {
        field4971++;
        if (this.field4969 == 0) {
            return null;
        }
        if (!this.field5030) {
            this.method2143((byte) -70);
        }
        int var2;
        int var3;
        if (this.field4949.field5871 <= 0) {
            var2 = this.field4972 - (this.field4949.field5871 * this.field5027 >> 8) >> this.field4949.field5818;
            var3 = this.field4993 - (this.field4949.field5871 * this.field5020 >> 8) >> this.field4949.field5818;
        } else {
            var2 = this.field4972 - (this.field4949.field5871 * this.field5020 >> 8) >> this.field4949.field5818;
            var3 = this.field4993 - (this.field4949.field5871 * this.field5027 >> 8) >> this.field4949.field5818;
        }
        int var4;
        int var5;
        if (this.field4949.field5880 <= 0) {
            var4 = this.field4926 - (this.field4949.field5880 * this.field5027 >> 8) >> this.field4949.field5818;
            var5 = this.field5004 - (this.field4949.field5880 * this.field5020 >> 8) >> this.field4949.field5818;
        } else {
            var4 = this.field4926 - (this.field4949.field5880 * this.field5020 >> 8) >> this.field4949.field5818;
            var5 = this.field5004 - (this.field4949.field5880 * this.field5027 >> 8) >> this.field4949.field5818;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class102 var8 = (class102) arg0;
        class102 var9;
        if (var8 != null && var8.method551(var7, var6, -23345)) {
            var9 = var8;
            var8.method553((byte) -102);
        } else {
            var9 = new class102(this.field4949, var6, var7);
        }
        var9.method556(127, var3, var2, var5, var4);
        this.method2144(var9, 33);
        return var9;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method2145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4992++;
        if (arg5 < arg1 && arg5 < arg4 && arg6 > arg5) {
            return false;
        } else if (arg1 < arg5 && arg4 < arg5 && arg6 < arg5) {
            return false;
        } else if (arg0 > arg2 && arg7 > arg2 && arg8 > arg2) {
            return false;
        } else if (arg2 > arg0 && arg2 > arg7 && arg2 > arg8) {
            return false;
        } else {
            int var10 = -97 % ((arg3 - 42) / 61);
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "()[Low;")
    public final class93[] method1910() {
        field4990++;
        return this.field5022;
    }

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "()Z")
    public final boolean method1903() {
        field4946++;
        if (this.field4980 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5021; var1++) {
            this.field4973[var1] <<= 0x4;
            this.field4983[var1] <<= 0x4;
            this.field4918[var1] <<= 0x4;
        }
        class679.field9569 = 0;
        class695.field9746 = 0;
        class659.field9247 = 0;
        return true;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[[I)V")
    public static final void method2146(int arg0, int[][] arg1) {
        if (arg0 != 127) {
            method2146(78, null);
        }
        class557.field7954 = arg1;
        field4915++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method1916(class473 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4942++;
        class366 var6 = (class366) arg0;
        if (this.field5013 == 0 || var6.field5013 == 0) {
            return;
        }
        int var7 = var6.field4919;
        int[] var8 = var6.field4973;
        int[] var9 = var6.field4983;
        int[] var10 = var6.field4918;
        short[] var11 = var6.field5024;
        short[] var12 = var6.field4997;
        short[] var13 = var6.field5005;
        byte[] var14 = var6.field4932;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field5007 == null) {
            var16 = null;
            var18 = null;
            var17 = null;
            var15 = null;
        } else {
            var15 = this.field5007.field7363;
            var16 = this.field5007.field7361;
            var17 = this.field5007.field7369;
            var18 = this.field5007.field7364;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field5007 == null) {
            var21 = null;
            var19 = null;
            var22 = null;
            var20 = null;
        } else {
            var19 = var6.field5007.field7363;
            var20 = var6.field5007.field7369;
            var21 = var6.field5007.field7364;
            var22 = var6.field5007.field7361;
        }
        int[] var23 = var6.field4977;
        short[] var24 = var6.field4941;
        if (!var6.field5030) {
            var6.method2143((byte) 120);
        }
        short var25 = var6.field5027;
        short var26 = var6.field5020;
        short var27 = var6.field4972;
        short var28 = var6.field4993;
        short var29 = var6.field4926;
        short var30 = var6.field5004;
        for (int var31 = 0; var31 < this.field4919; var31++) {
            int var32 = this.field4983[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field4973[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field4918[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field4977[var31];
                        int var37 = this.field4977[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4941[var38] - 1;
                            if (var35 == -1 || this.field4932[var35] != 0) {
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
                                        if (var18 == null) {
                                            this.field5007 = new class517();
                                            var18 = this.field5007.field7364 = class510.method2915(this.field5024, 924);
                                            var15 = this.field5007.field7363 = class510.method2915(this.field4997, 924);
                                            var17 = this.field5007.field7369 = class510.method2915(this.field5005, 924);
                                            var16 = this.field5007.field7361 = class194.method1180((byte) -116, this.field4932);
                                        }
                                        if (var21 == null) {
                                            class517 var44 = var6.field5007 = new class517();
                                            var21 = var44.field7364 = class510.method2915(var11, 924);
                                            var19 = var44.field7363 = class510.method2915(var12, 924);
                                            var20 = var44.field7369 = class510.method2915(var13, 924);
                                            var22 = var44.field7361 = class194.method1180((byte) -126, var14);
                                        }
                                        short var45 = this.field5024[var35];
                                        short var46 = this.field4997[var35];
                                        short var47 = this.field5005[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field4932[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var21[var52] += var45;
                                                var19[var52] += var46;
                                                var20[var52] += var47;
                                                var22[var52] += var49;
                                            }
                                        }
                                        byte var53 = var14[var40];
                                        short var54 = var13[var40];
                                        int var55 = this.field4977[var31 + 1];
                                        short var56 = var12[var40];
                                        int var57 = this.field4977[var31];
                                        short var58 = var11[var40];
                                        for (int var59 = var57; var59 < var55; var59++) {
                                            int var60 = this.field4941[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var18[var60] += var58;
                                                var15[var60] += var56;
                                                var17[var60] += var54;
                                                var16[var60] += var53;
                                            }
                                        }
                                        if (this.field4916 == null && this.field4959 != null) {
                                            this.field4959.field4738 = null;
                                        }
                                        if (this.field4916 != null) {
                                            this.field4916.field4738 = null;
                                        }
                                        if (var6.field4916 == null && var6.field4959 != null) {
                                            var6.field4959.field4738 = null;
                                        }
                                        if (var6.field4916 != null) {
                                            var6.field4916.field4738 = null;
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

    @OriginalMember(owner = "client!jg", name = "LA", descriptor = "()Z")
    public final boolean method1913() {
        field4951++;
        return this.field4982;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BSIIZ)I")
    private final int method2147(byte arg0, short arg1, int arg2, int arg3, boolean arg4) {
        field4939++;
        if (arg4) {
            return -125;
        }
        int var6 = class194.field2239[class143.method785(arg2, (byte) 23, arg3)];
        if (arg1 != -1) {
            class295 var7 = this.field4949.field8050.method140(arg1 & 0xFFFF, 862);
            int var8 = var7.field3671 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 <= 127) {
                    var9 = arg3 * 131586;
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
            int var12 = var7.field3667 & 0xFF;
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
                var6 = (var15 >> 8) + ((var13 & 0xD400FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return 255 - ((arg0 & 0xFF) - (var6 << 8));
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lef;FIIIJFIII)S")
    private final short method2148(class581 arg0, float arg1, int arg2, int arg3, int arg4, long arg5, float arg6, int arg7, int arg8, int arg9) {
        field4934++;
        int var12 = this.field4977[arg8];
        int var13 = this.field4977[arg8 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field4941[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class190.field2178[var15] == arg5) {
                return (short) (var16 - 1);
            }
        }
        this.field4941[var14] = (short) (this.field4969 + 1);
        class190.field2178[var14] = arg5;
        this.field5024[this.field4969] = (short) arg2;
        this.field4997[this.field4969] = (short) arg7;
        this.field5005[this.field4969] = (short) arg4;
        if (arg3 > -62) {
            return -121;
        } else {
            this.field4932[this.field4969] = (byte) arg9;
            this.field4914[this.field4969] = arg1;
            this.field4936[this.field4969] = arg6;
            return (short) (this.field4969++);
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)V")
    private final void method2149(byte arg0) {
        if (arg0 != -88) {
            this.method1877((byte) -16, -12, true);
        }
        field4989++;
        if (this.field4986 == null) {
            return;
        }
        class185 var2 = this.field4949.field5816;
        this.field4949.method2411(false);
        this.field4949.method955(false);
        this.field4949.method2410(false, -103);
        this.field4949.method2419(this.field4949.field5906, 80, null, this.field4949.field5910, null);
        for (int var3 = 0; var3 < this.field4967; var3++) {
            class678 var4 = this.field4986[var3];
            class113 var5 = this.field4922[var3];
            if (!var4.field9530 || !this.field4949.method1044()) {
                float var6 = (float) (this.field4973[var4.field9528] + this.field4973[var4.field9524] + this.field4973[var4.field9533]) * 0.3333333F;
                float var7 = (float) (this.field4983[var4.field9533] + this.field4983[var4.field9528] + this.field4983[var4.field9524]) * 0.3333333F;
                float var8 = (float) (this.field4918[var4.field9533] + this.field4918[var4.field9528] + this.field4918[var4.field9524]) * 0.3333333F;
                float var9 = class191.field2206 * var8 + class459.field6517 * var7 + class386.field5199 * var6 + class44.field436;
                float var10 = class370.field5062 * var8 + class469.field6712 * var7 + class22.field167 * var6 + class181.field2032;
                float var11 = class423.field5974 * var8 + class692.field9721 * var7 + class243.field3007 * var6 + class312.field3870;
                var2.method1126((float) var5.field1196 - var10, (byte) 71, var5.field1193, (float) var5.field1189 + var9, (float) var4.field9526 + -var11, var4.field9532 * var5.field1190 >> 7, var4.field9529 * var5.field1197 >> 7);
                this.field4949.method2395(var2, 2);
                int var12 = var5.field1192;
                OpenGL.glColor4ub((byte) (var12 >> 16), (byte) (var12 >> 8), (byte) var12, (byte) (var12 >> 24));
                this.field4949.method2426(108, var4.field9531);
                this.field4949.method2386(127, var4.field9525);
                this.field4949.method2378(7, 0, 4, 0);
            }
        }
        this.field4949.method955(true);
        this.field4949.method2370(16);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lq;Lufa;I)V")
    public final void method1914(class490 arg0, class374 arg1, int arg2) {
        field5012++;
        if (this.field4969 == 0) {
            return;
        }
        class185 var4 = this.field4949.field5854;
        class185 var5 = (class185) arg0;
        if (!this.field5030) {
            this.method2143((byte) 109);
        }
        class692.field9721 = var4.field2101 * var5.field2103 + var4.field2103 * var5.field2098 + var4.field2102 * var5.field2092;
        class312.field3870 = var4.field2101 * var5.field2072 + var4.field2103 * var5.field2076 + var4.field2102 * var5.field2074 + var4.field2072;
        float var6 = (float) this.field5027 * class692.field9721 + class312.field3870;
        float var7 = (float) this.field5020 * class692.field9721 + class312.field3870;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) (-this.field4984) + var7;
            var8 = (float) this.field4984 + var6;
        } else {
            var8 = (float) this.field4984 + var7;
            var9 = (float) (-this.field4984) + var6;
        }
        if ((var9 >= this.field4949.field5868) || ((float) this.field4949.field5941 >= var8)) {
            return;
        }
        class459.field6517 = var4.field2073 * var5.field2103 + var4.field2105 * var5.field2092 + var4.field2092 * var5.field2098;
        class44.field436 = var4.field2073 * var5.field2072 + var4.field2105 * var5.field2074 + var4.field2092 * var5.field2076 + var4.field2074;
        float var10 = (float) this.field5027 * class459.field6517 + class44.field436;
        float var11 = (float) this.field5020 * class459.field6517 + class44.field436;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) (-this.field4984) + var11) * (float) this.field4949.field5901;
            var13 = ((float) this.field4984 + var10) * (float) this.field4949.field5901;
        } else {
            var12 = (var10 - (float) this.field4984) * (float) this.field4949.field5901;
            var13 = ((float) this.field4984 + var11) * (float) this.field4949.field5901;
        }
        if ((var12 / var8 >= this.field4949.field5878) || (this.field4949.field5962 >= var13 / var8)) {
            return;
        }
        class469.field6712 = var4.field2087 * var5.field2103 + var4.field2104 * var5.field2092 + var4.field2098 * var5.field2098;
        class181.field2032 = var4.field2087 * var5.field2072 + var4.field2104 * var5.field2074 + var4.field2098 * var5.field2076 + var4.field2076;
        float var14 = (float) this.field5027 * class469.field6712 + class181.field2032;
        float var15 = (float) this.field5020 * class469.field6712 + class181.field2032;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) (-this.field4984) + var15) * (float) this.field4949.field5961;
            var17 = ((float) this.field4984 + var14) * (float) this.field4949.field5961;
        } else {
            var17 = ((float) this.field4984 + var15) * (float) this.field4949.field5961;
            var16 = ((float) (-this.field4984) + var14) * (float) this.field4949.field5961;
        }
        if ((var16 / var8 >= this.field4949.field5931) || (var17 / var8 <= this.field4949.field5951)) {
            return;
        }
        if (arg1 != null || this.field4986 != null) {
            class191.field2206 = var4.field2073 * var5.field2101 + var4.field2105 * var5.field2073 + var4.field2092 * var5.field2087;
            class243.field3007 = var4.field2101 * var5.field2102 + var4.field2103 * var5.field2104 + var4.field2102 * var5.field2105;
            class386.field5199 = var4.field2073 * var5.field2102 + var4.field2105 * var5.field2105 + var4.field2092 * var5.field2104;
            class423.field5974 = var4.field2101 * var5.field2101 + var4.field2103 * var5.field2087 + var4.field2102 * var5.field2073;
            class22.field167 = var4.field2087 * var5.field2102 + var4.field2104 * var5.field2105 + var4.field2098 * var5.field2104;
            class370.field5062 = var4.field2087 * var5.field2101 + var4.field2104 * var5.field2073 + var4.field2098 * var5.field2087;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field4993 + this.field4972 >> 1;
            int var21 = this.field5004 + this.field4926 >> 1;
            int var22 = (int) ((float) var21 * class191.field2206 + (float) this.field5027 * class459.field6517 + (float) var20 * class386.field5199 + class44.field436);
            int var23 = (int) ((float) var21 * class370.field5062 + (float) this.field5027 * class469.field6712 + (float) var20 * class22.field167 + class181.field2032);
            int var24 = (int) ((float) var21 * class423.field5974 + (float) this.field5027 * class692.field9721 + (float) var20 * class243.field3007 + class312.field3870);
            if (this.field4949.field5941 <= var24) {
                arg1.field5092 = this.field4949.field5944 + (this.field4949.field5961 * var23 / var24);
                arg1.field5089 = this.field4949.field5901 * var22 / var24 + this.field4949.field5915;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class191.field2206 + (float) this.field5020 * class459.field6517 + (float) var20 * class386.field5199 + class44.field436);
            int var26 = (int) ((float) var21 * class370.field5062 + (float) this.field5020 * class469.field6712 + (float) var20 * class22.field167 + class181.field2032);
            int var27 = (int) ((float) var21 * class423.field5974 + (float) this.field5020 * class692.field9721 + (float) var20 * class243.field3007 + class312.field3870);
            if (this.field4949.field5941 <= var27) {
                arg1.field5088 = this.field4949.field5901 * var25 / var27 + this.field4949.field5915;
                arg1.field5090 = this.field4949.field5961 * var26 / var27 + this.field4949.field5944;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field4949.field5941 > var24 && this.field4949.field5941 > var27) {
                    var19 = false;
                } else if (this.field4949.field5941 > var24) {
                    int var31 = (var27 - this.field4949.field5941 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field5089 = this.field4949.field5915 + (this.field4949.field5901 * var32 / this.field4949.field5941);
                    arg1.field5092 = this.field4949.field5944 + (this.field4949.field5961 * var33 / this.field4949.field5941);
                } else if (var27 < this.field4949.field5941) {
                    int var28 = (var24 - this.field4949.field5941 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field5089 = this.field4949.field5901 * var29 / this.field4949.field5941 + this.field4949.field5915;
                    arg1.field5092 = this.field4949.field5944 + (this.field4949.field5961 * var30 / this.field4949.field5941);
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field5091 = (var22 + this.field4984) * this.field4949.field5901 / var24 + this.field4949.field5915 - arg1.field5089;
                } else {
                    arg1.field5091 = (this.field4984 + var25) * this.field4949.field5901 / var27 + this.field4949.field5915 - arg1.field5088;
                }
                arg1.field5087 = true;
            }
        }
        this.field4949.method2414(-128);
        this.field4949.method2393(var5, true);
        this.method2141((byte) 89);
        this.field4949.method2370(16);
        this.method2149((byte) -88);
    }

    @OriginalMember(owner = "client!jg", name = "KA", descriptor = "()I")
    public final int method1912() {
        if (!this.field5030) {
            this.method2143((byte) 84);
        }
        field4957++;
        return this.field4972;
    }

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "()I")
    public final int method1886() {
        if (!this.field5030) {
            this.method2143((byte) 94);
        }
        field4935++;
        return this.field4984;
    }

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "()I")
    public final int method1869() {
        if (!this.field5030) {
            this.method2143((byte) 89);
        }
        field5010++;
        return this.field5027;
    }

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "(I)V")
    public final void method1854(int arg0) {
        this.field4947 = (short) arg0;
        field4925++;
        if (this.field4959 != null) {
            this.field4959.field4738 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lq;IZIII)Z")
    private final boolean method2150(class490 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4953++;
        class185 var7 = (class185) arg0;
        class185 var8 = this.field4949.field5854;
        float var9 = var7.field2072 * var8.field2073 + var7.field2076 * var8.field2092 + var7.field2074 * var8.field2105 + var8.field2074;
        float var10 = var7.field2072 * var8.field2087 + var7.field2076 * var8.field2098 + var7.field2074 * var8.field2104 + var8.field2076;
        class469.field6712 = var7.field2103 * var8.field2087 + var7.field2098 * var8.field2098 + var7.field2092 * var8.field2104;
        class243.field3007 = var7.field2102 * var8.field2101 + var7.field2105 * var8.field2102 + var7.field2104 * var8.field2103;
        class692.field9721 = var7.field2103 * var8.field2101 + var7.field2098 * var8.field2103 + var7.field2092 * var8.field2102;
        class191.field2206 = var7.field2101 * var8.field2073 + var7.field2087 * var8.field2092 + var7.field2073 * var8.field2105;
        class423.field5974 = var7.field2101 * var8.field2101 + var7.field2087 * var8.field2103 + var7.field2073 * var8.field2102;
        class386.field5199 = var7.field2102 * var8.field2073 + var7.field2105 * var8.field2105 + var7.field2104 * var8.field2092;
        class370.field5062 = var7.field2101 * var8.field2087 + var7.field2087 * var8.field2098 + var7.field2073 * var8.field2104;
        float var11 = var7.field2072 * var8.field2101 + var7.field2076 * var8.field2103 + var7.field2074 * var8.field2102 + var8.field2072;
        class22.field167 = var7.field2102 * var8.field2087 + var7.field2105 * var8.field2104 + var7.field2104 * var8.field2098;
        class459.field6517 = var7.field2103 * var8.field2073 + var7.field2098 * var8.field2092 + var7.field2092 * var8.field2105;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field4949.field5901;
        int var18 = this.field4949.field5961;
        if (!this.field5030) {
            this.method2143((byte) 94);
        }
        class46.field480[0] = this.field4972;
        class327.field4007[0] = this.field5027;
        class147.field1623[0] = this.field4926;
        class46.field480[1] = this.field4993;
        class327.field4007[1] = this.field5027;
        class147.field1623[1] = this.field4926;
        class46.field480[2] = this.field4972;
        class327.field4007[2] = this.field5020;
        class147.field1623[2] = this.field4926;
        class46.field480[3] = this.field4993;
        class327.field4007[3] = this.field5020;
        class46.field480[4] = this.field4972;
        class147.field1623[3] = this.field4926;
        class327.field4007[4] = this.field5027;
        class147.field1623[4] = this.field5004;
        class46.field480[5] = this.field4993;
        class327.field4007[5] = this.field5027;
        class46.field480[6] = this.field4972;
        class147.field1623[5] = this.field5004;
        class327.field4007[6] = this.field5020;
        class46.field480[7] = this.field4993;
        class147.field1623[6] = this.field5004;
        class327.field4007[7] = this.field5020;
        int var19 = 121 / ((arg1 + 7) / 42);
        class147.field1623[7] = this.field5004;
        for (int var20 = 0; var20 < 8; var20++) {
            float var41 = (float) class46.field480[var20];
            float var42 = (float) class147.field1623[var20];
            float var43 = (float) class327.field4007[var20];
            float var44 = class423.field5974 * var42 + class692.field9721 * var43 + class243.field3007 * var41 + var11;
            float var45 = class191.field2206 * var42 + class459.field6517 * var43 + class386.field5199 * var41 + var9;
            float var46 = class370.field5062 * var42 + class469.field6712 * var43 + class22.field167 * var41 + var10;
            if (var44 >= (float) this.field4949.field5941) {
                if (arg4 > 0) {
                    var44 = arg4;
                }
                float var47 = (float) var17 * var45 / var44 + (float) this.field4949.field5915;
                if (var47 > var14) {
                    var14 = var47;
                }
                float var48 = (float) var18 * var46 / var44 + (float) this.field4949.field5944;
                if (var47 < var13) {
                    var13 = var47;
                }
                var12 = true;
                if (var16 < var48) {
                    var16 = var48;
                }
                if (var48 < var15) {
                    var15 = var48;
                }
            }
        }
        if (var12 && var13 < (float) arg3 && var14 > (float) arg3 && (float) arg5 > var15 && var16 > (float) arg5) {
            if (arg2) {
                return true;
            }
            if (this.field4949.field5970.length < this.field4969) {
                this.field4949.field5969 = new int[this.field4969];
                this.field4949.field5970 = new int[this.field4969];
            }
            int[] var21 = this.field4949.field5970;
            int[] var22 = this.field4949.field5969;
            for (int var23 = 0; var23 < this.field4919; var23++) {
                float var25 = (float) this.field4983[var23];
                float var26 = (float) this.field4973[var23];
                float var27 = (float) this.field4918[var23];
                float var28 = class191.field2206 * var27 + class459.field6517 * var25 + class386.field5199 * var26 + var9;
                float var29 = class423.field5974 * var27 + class692.field9721 * var25 + class243.field3007 * var26 + var11;
                float var30 = class370.field5062 * var27 + class469.field6712 * var25 + class22.field167 * var26 + var10;
                if ((var29 >= (float) this.field4949.field5941)) {
                    if (arg4 > 0) {
                        var29 = arg4;
                    }
                    int var35 = (int) ((float) var17 * var28 / var29 + (float) this.field4949.field5915);
                    int var36 = (int) ((float) var18 * var30 / var29 + (float) this.field4949.field5944);
                    int var37 = this.field4977[var23];
                    int var38 = this.field4977[var23 + 1];
                    for (int var39 = var37; var39 < var38; var39++) {
                        int var40 = this.field4941[var39] - 1;
                        if (var40 == -1) {
                            break;
                        }
                        var21[var40] = var35;
                        var22[var40] = var36;
                    }
                } else {
                    int var31 = this.field4977[var23];
                    int var32 = this.field4977[var23 + 1];
                    for (int var33 = var31; var33 < var32; var33++) {
                        int var34 = this.field4941[var33] - 1;
                        if (var34 == -1) {
                            break;
                        }
                        var21[this.field4941[var33] - 1] = -999999;
                    }
                }
            }
            for (int var24 = 0; var24 < this.field5013; var24++) {
                if (var21[this.field4968[var24]] != -999999 && var21[this.field5019[var24]] != -999999 && var21[this.field4923[var24]] != -999999 && this.method2145(var21[this.field4968[var24]], var22[this.field4968[var24]], arg3, -106, var22[this.field5019[var24]], arg5, var22[this.field4923[var24]], var21[this.field5019[var24]], var21[this.field4923[var24]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jg", name = "FA", descriptor = "()V")
    public final void method1888() {
        field4979++;
        for (int var1 = 0; var1 < this.field4919; var1++) {
            this.field4918[var1] = -this.field4918[var1];
        }
        for (int var2 = 0; var2 < this.field4969; var2++) {
            this.field5005[var2] = (short) (-this.field5005[var2]);
        }
        for (int var3 = 0; var3 < this.field5013; var3++) {
            short var4 = this.field4968[var3];
            this.field4968[var3] = this.field4923[var3];
            this.field4923[var3] = var4;
        }
        if (this.field4916 == null && this.field4959 != null) {
            this.field4959.field4738 = null;
        }
        if (this.field4916 != null) {
            this.field4916.field4738 = null;
        }
        if (this.field4964 != null) {
            this.field4964.field5351 = null;
        }
        this.field5030 = false;
        if (this.field4965 != null) {
            this.field4965.field4738 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method1880(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4998++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class659.field9247 = 0;
            class679.field9569 = 0;
            int var12 = 0;
            class695.field9746 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field4980.length) {
                    int[] var15 = this.field4980[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class679.field9569 += this.field4973[var17];
                        class659.field9247 += this.field4983[var17];
                        class695.field9746 += this.field4918[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class695.field9746 = var10;
                class679.field9569 = var9;
                class659.field9247 = var11;
            } else {
                class695.field9746 = class695.field9746 / var12 + var10;
                class679.field9569 = class679.field9569 / var12 + var9;
                class659.field9247 = class659.field9247 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg3 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field4980.length) {
                    int[] var23 = this.field4980[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field4973[var25] += var20;
                        this.field4983[var25] += var19;
                        this.field4918[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field4980.length > var45) {
                    int[] var46 = this.field4980[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field4973[var59] -= class679.field9569;
                            this.field4983[var59] -= class659.field9247;
                            this.field4918[var59] -= class695.field9746;
                            if (arg4 != 0) {
                                int var60 = class435.field6134[arg4];
                                int var61 = class435.field6135[arg4];
                                int var62 = this.field4983[var59] * var60 + this.field4973[var59] * var61 + 16383 >> 14;
                                this.field4983[var59] = this.field4983[var59] * var61 + 16383 - this.field4973[var59] * var60 >> 14;
                                this.field4973[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class435.field6134[arg2];
                                int var64 = class435.field6135[arg2];
                                int var65 = this.field4983[var59] * var64 + 16383 - (this.field4918[var59] * var63) >> 14;
                                this.field4918[var59] = this.field4918[var59] * var64 + this.field4983[var59] * var63 + 16383 >> 14;
                                this.field4983[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class435.field6134[arg3];
                                int var67 = class435.field6135[arg3];
                                int var68 = this.field4918[var59] * var66 - (-(this.field4973[var59] * var67) - 16383) >> 14;
                                this.field4918[var59] = this.field4918[var59] * var67 + 16383 - this.field4973[var59] * var66 >> 14;
                                this.field4973[var59] = var68;
                            }
                            this.field4973[var59] += class679.field9569;
                            this.field4983[var59] += class659.field9247;
                            this.field4918[var59] += class695.field9746;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field4973[var48] -= class679.field9569;
                            this.field4983[var48] -= class659.field9247;
                            this.field4918[var48] -= class695.field9746;
                            if (arg2 != 0) {
                                int var49 = class435.field6134[arg2];
                                int var50 = class435.field6135[arg2];
                                int var51 = this.field4983[var48] * var50 + 16383 - (this.field4918[var48] * var49) >> 14;
                                this.field4918[var48] = this.field4918[var48] * var50 + this.field4983[var48] * var49 + 16383 >> 14;
                                this.field4983[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class435.field6134[arg4];
                                int var53 = class435.field6135[arg4];
                                int var54 = this.field4983[var48] * var52 + this.field4973[var48] * var53 + 16383 >> 14;
                                this.field4983[var48] = this.field4983[var48] * var53 + 16383 - (this.field4973[var48] * var52) >> 14;
                                this.field4973[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class435.field6134[arg3];
                                int var56 = class435.field6135[arg3];
                                int var57 = this.field4973[var48] * var56 + (this.field4918[var48] * var55 + 16383) >> 14;
                                this.field4918[var48] = this.field4918[var48] * var56 + 16383 - (this.field4973[var48] * var55) >> 14;
                                this.field4973[var48] = var57;
                            }
                            this.field4973[var48] += class679.field9569;
                            this.field4983[var48] += class659.field9247;
                            this.field4918[var48] += class695.field9746;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field4980.length > var28) {
                        int[] var29 = this.field4980[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field4977[var31];
                            int var33 = this.field4977[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field4941[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class435.field6134[arg4];
                                    int var37 = class435.field6135[arg4];
                                    int var38 = this.field4997[var35] * var36 + this.field5024[var35] * var37 + 16383 >> 14;
                                    this.field4997[var35] = (short) (this.field4997[var35] * var37 + 16383 - (this.field5024[var35] * var36) >> 14);
                                    this.field5024[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class435.field6134[arg2];
                                    int var40 = class435.field6135[arg2];
                                    int var41 = this.field4997[var35] * var40 + 16383 - this.field5005[var35] * var39 >> 14;
                                    this.field5005[var35] = (short) (this.field5005[var35] * var40 + this.field4997[var35] * var39 + 16383 >> 14);
                                    this.field4997[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class435.field6134[arg3];
                                    int var43 = class435.field6135[arg3];
                                    int var44 = this.field5005[var35] * var42 + this.field5024[var35] * var43 + 16383 >> 14;
                                    this.field5005[var35] = (short) (this.field5005[var35] * var43 + 16383 - (this.field5024[var35] * var42) >> 14);
                                    this.field5024[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field4916 == null && this.field4959 != null) {
                    this.field4959.field4738 = null;
                }
                if (this.field4916 != null) {
                    this.field4916.field4738 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field4980.length > var70) {
                    int[] var71 = this.field4980[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field4973[var73] -= class679.field9569;
                        this.field4983[var73] -= class659.field9247;
                        this.field4918[var73] -= class695.field9746;
                        this.field4973[var73] = this.field4973[var73] * arg2 >> 7;
                        this.field4983[var73] = this.field4983[var73] * arg3 >> 7;
                        this.field4918[var73] = this.field4918[var73] * arg4 >> 7;
                        this.field4973[var73] += class679.field9569;
                        this.field4983[var73] += class659.field9247;
                        this.field4918[var73] += class695.field9746;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4996 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field4996.length > var78) {
                        int[] var79 = this.field4996[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field4920[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field4920[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field4959 != null) {
                            this.field4959.field4738 = null;
                        }
                    }
                }
                if (this.field4986 != null) {
                    for (int var75 = 0; var75 < this.field4967; var75++) {
                        class678 var76 = this.field4986[var75];
                        class113 var77 = this.field4922[var75];
                        var77.field1192 = var77.field1192 & 0xFFFFFF | 255 - (this.field4920[var76.field9527] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4996 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field4996.length) {
                        int[] var88 = this.field4996[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field4937[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFEA4) >> 10;
                            int var93 = (var91 & 0x38B) >> 7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = var91 & 0x7F;
                            int var96 = arg3 / 4 + var93;
                            int var97 = arg4 + var95;
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
                            this.field4937[var90] = (short) class422.method2436(class422.method2436(var96 << 7, var94 << 10), var97);
                        }
                        if (var88.length > 0 && this.field4959 != null) {
                            this.field4959.field4738 = null;
                        }
                    }
                }
                if (this.field4986 != null) {
                    for (int var84 = 0; var84 < this.field4967; var84++) {
                        class678 var85 = this.field4986[var84];
                        class113 var86 = this.field4922[var84];
                        var86.field1192 = var86.field1192 & 0xFF000000 | class194.field2239[this.field4937[var85.field9527] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4991 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field4991.length > var99) {
                        int[] var100 = this.field4991[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class113 var102 = this.field4922[var100[var101]];
                            var102.field1189 += arg2;
                            var102.field1196 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4991 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field4991.length > var104) {
                        int[] var105 = this.field4991[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class113 var107 = this.field4922[var105[var106]];
                            var107.field1190 = var107.field1190 * arg3 >> 7;
                            var107.field1197 = var107.field1197 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4991 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field4991.length > var109) {
                    int[] var110 = this.field4991[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class113 var112 = this.field4922[var110[var111]];
                        var112.field1193 = var112.field1193 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "()I")
    public final int method1853() {
        field4999++;
        if (!this.field5030) {
            this.method2143((byte) -107);
        }
        return this.field5020;
    }

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "()V")
    public final void method1898() {
        field5006++;
        for (int var1 = 0; var1 < this.field5021; var1++) {
            this.field4973[var1] = this.field4973[var1] + 7 >> 4;
            this.field4983[var1] = this.field4983[var1] + 7 >> 4;
            this.field4918[var1] = this.field4918[var1] + 7 >> 4;
        }
        this.field5030 = false;
        if (this.field4965 != null) {
            this.field4965.field4738 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lq;Lufa;II)V")
    public final void method1875(class490 arg0, class374 arg1, int arg2, int arg3) {
        field5009++;
        if (this.field4969 == 0) {
            return;
        }
        class185 var5 = this.field4949.field5854;
        class185 var6 = (class185) arg0;
        if (!this.field5030) {
            this.method2143((byte) 83);
        }
        class312.field3870 = var5.field2101 * var6.field2072 + var5.field2103 * var6.field2076 + var5.field2102 * var6.field2074 + var5.field2072;
        class692.field9721 = var5.field2101 * var6.field2103 + var5.field2103 * var6.field2098 + var5.field2102 * var6.field2092;
        float var7 = (float) this.field5027 * class692.field9721 + class312.field3870;
        float var8 = (float) this.field5020 * class692.field9721 + class312.field3870;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var10 = var8 - (float) this.field4984;
            var9 = (float) this.field4984 + var7;
        } else {
            var9 = (float) this.field4984 + var8;
            var10 = (float) (-this.field4984) + var7;
        }
        if ((var10 >= this.field4949.field5917) || ((float) this.field4949.field5941 >= var9)) {
            return;
        }
        class44.field436 = var5.field2073 * var6.field2072 + var5.field2105 * var6.field2074 + var5.field2092 * var6.field2076 + var5.field2074;
        class459.field6517 = var5.field2073 * var6.field2103 + var5.field2105 * var6.field2092 + var5.field2092 * var6.field2098;
        float var11 = (float) this.field5027 * class459.field6517 + class44.field436;
        float var12 = (float) this.field5020 * class459.field6517 + class44.field436;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field4984 + var11) * (float) this.field4949.field5901;
            var14 = ((float) (-this.field4984) + var12) * (float) this.field4949.field5901;
        } else {
            var13 = ((float) this.field4984 + var12) * (float) this.field4949.field5901;
            var14 = ((float) (-this.field4984) + var11) * (float) this.field4949.field5901;
        }
        if ((var14 / (float) arg2 >= this.field4949.field5878) || (this.field4949.field5962 >= var13 / (float) arg2)) {
            return;
        }
        class181.field2032 = var5.field2087 * var6.field2072 + var5.field2104 * var6.field2074 + var5.field2098 * var6.field2076 + var5.field2076;
        class469.field6712 = var5.field2087 * var6.field2103 + var5.field2104 * var6.field2092 + var5.field2098 * var6.field2098;
        float var15 = (float) this.field5027 * class469.field6712 + class181.field2032;
        float var16 = (float) this.field5020 * class469.field6712 + class181.field2032;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var17 = (var16 - (float) this.field4984) * (float) this.field4949.field5961;
            var18 = ((float) this.field4984 + var15) * (float) this.field4949.field5961;
        } else {
            var17 = (var15 - (float) this.field4984) * (float) this.field4949.field5961;
            var18 = ((float) this.field4984 + var16) * (float) this.field4949.field5961;
        }
        if ((var17 / (float) arg2 >= this.field4949.field5931) || (this.field4949.field5951 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field4986 != null) {
            class191.field2206 = var5.field2073 * var6.field2101 + var5.field2105 * var6.field2073 + var5.field2092 * var6.field2087;
            class243.field3007 = var5.field2101 * var6.field2102 + var5.field2103 * var6.field2104 + var5.field2102 * var6.field2105;
            class423.field5974 = var5.field2101 * var6.field2101 + var5.field2103 * var6.field2087 + var5.field2102 * var6.field2073;
            class386.field5199 = var5.field2073 * var6.field2102 + var5.field2105 * var6.field2105 + var5.field2092 * var6.field2104;
            class22.field167 = var5.field2087 * var6.field2102 + var5.field2104 * var6.field2105 + var5.field2098 * var6.field2104;
            class370.field5062 = var5.field2087 * var6.field2101 + var5.field2104 * var6.field2073 + var5.field2098 * var6.field2087;
        }
        if (arg1 != null) {
            int var19 = this.field4993 + this.field4972 >> 1;
            int var20 = this.field5004 + this.field4926 >> 1;
            int var21 = (int) ((float) var20 * class191.field2206 + (float) this.field5027 * class459.field6517 + (float) var19 * class386.field5199 + class44.field436);
            int var22 = (int) ((float) var20 * class370.field5062 + (float) this.field5027 * class469.field6712 + (float) var19 * class22.field167 + class181.field2032);
            int var23 = (int) ((float) var20 * class423.field5974 + (float) this.field5027 * class692.field9721 + (float) var19 * class243.field3007 + class312.field3870);
            int var24 = (int) ((float) var20 * class191.field2206 + (float) this.field5020 * class459.field6517 + (float) var19 * class386.field5199 + class44.field436);
            int var25 = (int) ((float) var20 * class370.field5062 + (float) this.field5020 * class469.field6712 + (float) var19 * class22.field167 + class181.field2032);
            int var26 = (int) ((float) var20 * class423.field5974 + (float) this.field5020 * class692.field9721 + (float) var19 * class243.field3007 + class312.field3870);
            arg1.field5088 = this.field4949.field5901 * var24 / arg2 + this.field4949.field5915;
            arg1.field5092 = this.field4949.field5944 + (this.field4949.field5961 * var22 / arg2);
            arg1.field5090 = this.field4949.field5961 * var25 / arg2 + this.field4949.field5944;
            arg1.field5089 = this.field4949.field5915 + (this.field4949.field5901 * var21 / arg2);
            if (var23 >= this.field4949.field5941 || var26 >= this.field4949.field5941) {
                arg1.field5087 = true;
                arg1.field5091 = (var21 + this.field4984) * this.field4949.field5901 / arg2 + this.field4949.field5915 - arg1.field5089;
            }
        }
        this.field4949.method2376((byte) -17, (float) arg2);
        this.field4949.method2432(16);
        this.field4949.method2393(var6, true);
        this.method2141((byte) 90);
        this.field4949.method2370(16);
        this.method2149((byte) -88);
    }

    @OriginalMember(owner = "client!jg", name = "oa", descriptor = "(III)V")
    public final void method1915(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4919; var4++) {
            if (arg0 != 0) {
                this.field4973[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field4983[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field4918[var4] += arg2;
            }
        }
        field4978++;
        this.field5030 = false;
        if (this.field4965 != null) {
            this.field4965.field4738 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "()Z")
    public final boolean method1856() {
        field5025++;
        if (this.field5002 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5002.length; var1++) {
            if (this.field5002[var1] != -1 && !this.field4949.field8050.method144(8649, this.field5002[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLjg;ZIZLjg;)Lda;")
    private final class473 method2151(byte arg0, class366 arg1, boolean arg2, int arg3, boolean arg4, class366 arg5) {
        arg5.field4919 = this.field4919;
        arg5.field4967 = this.field4967;
        arg5.field5018 = 0;
        arg5.field4927 = this.field4927;
        arg5.field4947 = this.field4947;
        field5000++;
        if ((arg3 & 0x100) == 0) {
            arg5.field4982 = this.field4982;
        } else {
            arg5.field4982 = true;
        }
        arg5.field4994 = this.field4994;
        arg5.field5013 = this.field5013;
        arg5.field5028 = this.field5028;
        arg5.field4988 = arg3;
        arg5.field4969 = this.field4969;
        arg5.field5021 = this.field5021;
        boolean var7 = class227.method1365(this.field4994, (byte) -120, arg3);
        boolean var8 = class231.method1386(this.field4994, -49, arg3);
        if (arg0 <= 95) {
            this.field4959 = null;
        }
        boolean var9 = class647.method3622(this.field4994, 0, arg3);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg5.field4973 = this.field4973;
            } else if (arg1.field4973 == null || arg1.field4973.length < this.field5021) {
                arg5.field4973 = arg1.field4973 = new int[this.field5021];
            } else {
                arg5.field4973 = arg1.field4973;
            }
            if (!var8) {
                arg5.field4983 = this.field4983;
            } else if (arg1.field4983 == null || this.field5021 > arg1.field4983.length) {
                arg5.field4983 = arg1.field4983 = new int[this.field5021];
            } else {
                arg5.field4983 = arg1.field4983;
            }
            if (!var9) {
                arg5.field4918 = this.field4918;
            } else if (arg1.field4918 == null || this.field5021 > arg1.field4918.length) {
                arg5.field4918 = arg1.field4918 = new int[this.field5021];
            } else {
                arg5.field4918 = arg1.field4918;
            }
            for (int var11 = 0; var11 < this.field5021; var11++) {
                if (var7) {
                    arg5.field4973[var11] = this.field4973[var11];
                }
                if (var8) {
                    arg5.field4983[var11] = this.field4983[var11];
                }
                if (var9) {
                    arg5.field4918[var11] = this.field4918[var11];
                }
            }
        } else {
            arg5.field4918 = this.field4918;
            arg5.field4973 = this.field4973;
            arg5.field4983 = this.field4983;
        }
        if (class662.method3678(this.field4994, arg3, 8)) {
            if (arg2) {
                arg5.field5018 = (byte) (arg5.field5018 | 0x1);
            }
            arg5.field4965 = arg1.field4965;
            arg5.field4965.field4738 = this.field4965.field4738;
            arg5.field4965.field4736 = this.field4965.field4736;
        } else if (class143.method787((byte) 48, arg3, this.field4994)) {
            arg5.field4965 = this.field4965;
        } else {
            arg5.field4965 = null;
        }
        if (class427.method2468(-1, this.field4994, arg3)) {
            if (arg1.field4937 == null || arg1.field4937.length < this.field5013) {
                arg5.field4937 = arg1.field4937 = new short[this.field5013];
            } else {
                arg5.field4937 = arg1.field4937;
            }
            for (int var12 = 0; var12 < this.field5013; var12++) {
                arg5.field4937[var12] = this.field4937[var12];
            }
        } else {
            arg5.field4937 = this.field4937;
        }
        if (class480.method2764(this.field4994, (byte) -1, arg3)) {
            if (arg1.field4920 == null || this.field5013 > arg1.field4920.length) {
                arg5.field4920 = arg1.field4920 = new byte[this.field5013];
            } else {
                arg5.field4920 = arg1.field4920;
            }
            for (int var13 = 0; var13 < this.field5013; var13++) {
                arg5.field4920[var13] = this.field4920[var13];
            }
        } else {
            arg5.field4920 = this.field4920;
        }
        if (class102.method555(-106, this.field4994, arg3)) {
            if (arg2) {
                arg5.field5018 = (byte) (arg5.field5018 | 0x2);
            }
            arg5.field4959 = arg1.field4959;
            arg5.field4959.field4738 = this.field4959.field4738;
            arg5.field4959.field4736 = this.field4959.field4736;
        } else if (class674.method3722(arg3, this.field4994, (byte) -34)) {
            arg5.field4959 = this.field4959;
        } else {
            arg5.field4959 = null;
        }
        if (class600.method3366(this.field4994, arg3, -1)) {
            if (arg1.field5024 == null || this.field4969 > arg1.field5024.length) {
                int var14 = this.field4969;
                arg5.field4997 = arg1.field4997 = new short[var14];
                arg5.field5005 = arg1.field5005 = new short[var14];
                arg5.field5024 = arg1.field5024 = new short[var14];
            } else {
                arg5.field5024 = arg1.field5024;
                arg5.field4997 = arg1.field4997;
                arg5.field5005 = arg1.field5005;
            }
            if (this.field5007 == null) {
                for (int var15 = 0; var15 < this.field4969; var15++) {
                    arg5.field5024[var15] = this.field5024[var15];
                    arg5.field4997[var15] = this.field4997[var15];
                    arg5.field5005[var15] = this.field5005[var15];
                }
            } else {
                if (arg1.field5007 == null) {
                    arg1.field5007 = new class517();
                }
                class517 var16 = arg5.field5007 = arg1.field5007;
                if (var16.field7364 == null || var16.field7364.length < this.field4969) {
                    int var17 = this.field4969;
                    var16.field7361 = new byte[var17];
                    var16.field7369 = new short[var17];
                    var16.field7364 = new short[var17];
                    var16.field7363 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field4969; var18++) {
                    arg5.field5024[var18] = this.field5024[var18];
                    arg5.field4997[var18] = this.field4997[var18];
                    arg5.field5005[var18] = this.field5005[var18];
                    var16.field7364[var18] = this.field5007.field7364[var18];
                    var16.field7363[var18] = this.field5007.field7363[var18];
                    var16.field7369[var18] = this.field5007.field7369[var18];
                    var16.field7361[var18] = this.field5007.field7361[var18];
                }
            }
            arg5.field4932 = this.field4932;
        } else {
            arg5.field4932 = this.field4932;
            arg5.field5024 = this.field5024;
            arg5.field5007 = this.field5007;
            arg5.field4997 = this.field4997;
            arg5.field5005 = this.field5005;
        }
        if (class496.method2866(-115, arg3, this.field4994)) {
            if (arg2) {
                arg5.field5018 = (byte) (arg5.field5018 | 0x4);
            }
            arg5.field4916 = arg1.field4916;
            arg5.field4916.field4738 = this.field4916.field4738;
            arg5.field4916.field4736 = this.field4916.field4736;
        } else if (class494.method2858((byte) 30, this.field4994, arg3)) {
            arg5.field4916 = this.field4916;
        } else {
            arg5.field4916 = null;
        }
        if (class620.method3459(90, arg3, this.field4994)) {
            if (arg1.field4914 == null || arg1.field4914.length < this.field5013) {
                int var19 = this.field4969;
                arg5.field4936 = arg1.field4936 = new float[var19];
                arg5.field4914 = arg1.field4914 = new float[var19];
            } else {
                arg5.field4914 = arg1.field4914;
                arg5.field4936 = arg1.field4936;
            }
            for (int var20 = 0; var20 < this.field4969; var20++) {
                arg5.field4914[var20] = this.field4914[var20];
                arg5.field4936[var20] = this.field4936[var20];
            }
        } else {
            arg5.field4936 = this.field4936;
            arg5.field4914 = this.field4914;
        }
        if (class145.method795((byte) -97, arg3, this.field4994)) {
            arg5.field5008 = arg1.field5008;
            if (arg2) {
                arg5.field5018 = (byte) (arg5.field5018 | 0x8);
            }
            arg5.field5008.field4736 = this.field5008.field4736;
            arg5.field5008.field4738 = this.field5008.field4738;
        } else if (class508.method2904(this.field4994, arg3, 0)) {
            arg5.field5008 = this.field5008;
        } else {
            arg5.field5008 = null;
        }
        if (class5.method42(arg3, 1, this.field4994)) {
            if (arg1.field4968 == null || arg1.field4968.length < this.field5013) {
                int var21 = this.field5013;
                arg5.field5019 = arg1.field5019 = new short[var21];
                arg5.field4968 = arg1.field4968 = new short[var21];
                arg5.field4923 = arg1.field4923 = new short[var21];
            } else {
                arg5.field4968 = arg1.field4968;
                arg5.field4923 = arg1.field4923;
                arg5.field5019 = arg1.field5019;
            }
            for (int var22 = 0; var22 < this.field5013; var22++) {
                arg5.field4968[var22] = this.field4968[var22];
                arg5.field5019[var22] = this.field5019[var22];
                arg5.field4923[var22] = this.field4923[var22];
            }
        } else {
            arg5.field4923 = this.field4923;
            arg5.field4968 = this.field4968;
            arg5.field5019 = this.field5019;
        }
        if (class106.method579(arg3, (byte) 84, this.field4994)) {
            if (arg2) {
                arg5.field5018 = (byte) (arg5.field5018 | 0x10);
            }
            arg5.field4964 = arg1.field4964;
            arg5.field4964.field5351 = this.field4964.field5351;
        } else if (class542.method3050(4541, arg3, this.field4994)) {
            arg5.field4964 = this.field4964;
        } else {
            arg5.field4964 = null;
        }
        if (class579.method3273(-11296, arg3, this.field4994)) {
            if (arg1.field5002 == null || arg1.field5002.length < this.field5013) {
                int var23 = this.field5013;
                arg5.field5002 = arg1.field5002 = new short[var23];
            } else {
                arg5.field5002 = arg1.field5002;
            }
            for (int var24 = 0; var24 < this.field5013; var24++) {
                arg5.field5002[var24] = this.field5002[var24];
            }
        } else {
            arg5.field5002 = this.field5002;
        }
        if (!class74.method402(-122, this.field4994, arg3)) {
            arg5.field4922 = this.field4922;
        } else if (arg1.field4922 == null || this.field4967 > arg1.field4922.length) {
            int var26 = this.field4967;
            arg5.field4922 = arg1.field4922 = new class113[var26];
            for (int var27 = 0; var27 < this.field4967; var27++) {
                arg5.field4922[var27] = this.field4922[var27].method598(-1);
            }
        } else {
            arg5.field4922 = arg1.field4922;
            for (int var25 = 0; var25 < this.field4967; var25++) {
                arg5.field4922[var25].method600(false, this.field4922[var25]);
            }
        }
        arg5.field4974 = this.field4974;
        arg5.field4941 = this.field4941;
        arg5.field5003 = this.field5003;
        arg5.field5015 = this.field5015;
        arg5.field4980 = this.field4980;
        arg5.field4996 = this.field4996;
        arg5.field4977 = this.field4977;
        arg5.field4991 = this.field4991;
        arg5.field5022 = this.field5022;
        arg5.field4986 = this.field4986;
        if (this.field5030) {
            arg5.field5030 = true;
            arg5.field4926 = this.field4926;
            arg5.field4972 = this.field4972;
            arg5.field5027 = this.field5027;
            arg5.field5004 = this.field5004;
            arg5.field4981 = this.field4981;
            arg5.field4984 = this.field4984;
            arg5.field4993 = this.field4993;
            arg5.field5020 = this.field5020;
        } else {
            arg5.field5030 = false;
        }
        arg5.field4955 = this.field4955;
        return arg5;
    }

    @OriginalMember(owner = "client!jg", name = "PA", descriptor = "()I")
    public final int method1861() {
        field4956++;
        return this.field4988;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    public static final void method2152(int arg0, int arg1) {
        if (arg1 == 1) {
            field4995++;
            class403.field5401.method83((byte) -2, arg0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZB)V")
    private final void method2153(boolean arg0, byte arg1) {
        field4987++;
        boolean var3 = this.field4959 != null && this.field4959.field4738 == null;
        boolean var4 = this.field4916 != null && this.field4916.field4738 == null;
        if (arg1 != -111) {
            method2146(97, null);
        }
        boolean var5 = this.field4965 != null && this.field4965.field4738 == null;
        boolean var6 = this.field5008 != null && this.field5008.field4738 == null;
        if (arg0) {
            var5 &= (this.field5018 & 0x1) != 0;
            var3 &= (this.field5018 & 0x2) != 0;
            var4 &= (this.field5018 & 0x4) != 0;
            var6 &= (this.field5018 & 0x8) != 0;
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
        if (this.field4949.field5965.field1269.length < this.field4969 * var7) {
            this.field4949.field5965 = new class209((this.field4969 + 100) * var7);
        } else {
            this.field4949.field5965.field1218 = 0;
        }
        class209 var12 = this.field4949.field5965;
        if (var5) {
            if (this.field4949.field5874) {
                for (int var21 = 0; var21 < this.field4919; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field4973[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field4983[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field4918[var21]);
                    int var25 = this.field4977[var21];
                    int var26 = this.field4977[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field4941[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field1218 = var7 * var28;
                        var12.method660((byte) 54, var22);
                        var12.method660((byte) 84, var23);
                        var12.method660((byte) 120, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field4919; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field4973[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field4983[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field4918[var13]);
                    int var17 = this.field4977[var13];
                    int var18 = this.field4977[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field4941[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field1218 = var7 * var20;
                        var12.method636(-19674, var14);
                        var12.method636(-19674, var15);
                        var12.method636(-19674, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field4916 == null) {
                short[] var29;
                short[] var30;
                short[] var31;
                byte[] var32;
                if (this.field5007 == null) {
                    var29 = this.field5024;
                    var30 = this.field4997;
                    var31 = this.field5005;
                    var32 = this.field4932;
                } else {
                    var30 = this.field5007.field7363;
                    var31 = this.field5007.field7369;
                    var32 = this.field5007.field7361;
                    var29 = this.field5007.field7364;
                }
                float var33 = this.field4949.field5899[0];
                float var34 = this.field4949.field5899[1];
                float var35 = this.field4949.field5899[2];
                float var36 = this.field4949.field5949;
                float var37 = this.field4949.field5945 * 768.0F / (float) this.field5028;
                float var38 = this.field4949.field5866 * 768.0F / (float) this.field5028;
                for (int var39 = 0; var39 < this.field5013; var39++) {
                    int var40 = this.method2147(this.field4920[var39], this.field5002[var39], this.field4937[var39], this.field4947, false);
                    float var41 = (float) (var40 >>> 24) * this.field4949.field5947;
                    float var42 = (float) (var40 >> 8 & 0xFF) * this.field4949.field5881;
                    short var43 = this.field4968[var39];
                    float var44 = (float) ((var40 & 0xFF268A) >> 16) * this.field4949.field5890;
                    short var45 = (short) var32[var43];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var43] * var35 + (float) var29[var43] * var33 + (float) var30[var43] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var43] * var35 + (float) var29[var43] * var33 + (float) var30[var43] * var34) / (float) (var45 * 256);
                    }
                    float var47 = var36 + var46 * ((var46 < 0.0F) ? var38 : var37);
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
                    var12.field1218 = var7 * var43 + var9;
                    var12.method658(var48, (byte) 72);
                    var12.method658(var49, (byte) 50);
                    var12.method658(var50, (byte) 80);
                    var12.method658(255 - (this.field4920[var39] & 0xFF), (byte) 78);
                    short var51 = this.field5019[var39];
                    short var52 = (short) var32[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var33 + (float) var30[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var33 + (float) var30[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = var36 + ((var53 < 0.0F) ? var38 : var37) * var53;
                    int var55 = (int) (var41 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var44 * var54);
                    int var57 = (int) (var42 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    var12.field1218 = var7 * var51 + var9;
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method658(var55, (byte) 76);
                    var12.method658(var56, (byte) 107);
                    var12.method658(var57, (byte) 125);
                    var12.method658(255 - (this.field4920[var39] & 0xFF), (byte) 105);
                    short var58 = this.field4923[var39];
                    short var59 = (short) var32[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var33 + (float) var30[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var33 + (float) var30[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = ((var60 < 0.0F) ? var38 : var37) * var60 + var36;
                    int var62 = (int) (var41 * var61);
                    int var63 = (int) (var44 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var42 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field1218 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method658(var62, (byte) 120);
                    var12.method658(var63, (byte) 95);
                    var12.method658(var64, (byte) 88);
                    var12.method658(255 - (this.field4920[var39] & 0xFF), (byte) 73);
                }
            } else {
                for (int var65 = 0; var65 < this.field5013; var65++) {
                    int var66 = this.method2147(this.field4920[var65], this.field5002[var65], this.field4937[var65], this.field4947, false);
                    var12.field1218 = this.field4968[var65] * var7 + var9;
                    var12.method660((byte) 51, var66);
                    var12.field1218 = this.field5019[var65] * var7 + var9;
                    var12.method660((byte) 118, var66);
                    var12.field1218 = var9 + (this.field4923[var65] * var7);
                    var12.method660((byte) 125, var66);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field5007 == null) {
                var68 = this.field4997;
                var70 = this.field5005;
                var69 = this.field5024;
                var67 = this.field4932;
            } else {
                var67 = this.field5007.field7361;
                var68 = this.field5007.field7363;
                var69 = this.field5007.field7364;
                var70 = this.field5007.field7369;
            }
            float var71 = 3.0F / (float) this.field5028;
            float var72 = 3.0F / (float) (this.field5028 / 2 + this.field5028);
            var12.field1218 = var10;
            if (this.field4949.field5874) {
                for (int var73 = 0; var73 < this.field4969; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1242(arg1 ^ 0x32D2, (float) var69[var73] * var72);
                        var12.method1242(-12989, (float) var68[var73] * var72);
                        var12.method1242(-12989, (float) var70[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1242(arg1 ^ 0x32D2, (float) var69[var73] * var75);
                        var12.method1242(-12989, (float) var68[var73] * var75);
                        var12.method1242(-12989, (float) var70[var73] * var75);
                    }
                    var12.field1218 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field4969; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1243(127, (float) var69[var76] * var72);
                        var12.method1243(119, (float) var68[var76] * var72);
                        var12.method1243(68, (float) var70[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1243(arg1 ^ 0xFFFFFFFD, (float) var69[var76] * var78);
                        var12.method1243(123, (float) var68[var76] * var78);
                        var12.method1243(118, (float) var70[var76] * var78);
                    }
                    var12.field1218 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field1218 = var11;
            if (this.field4949.field5874) {
                for (int var80 = 0; var80 < this.field4969; var80++) {
                    var12.method1242(-12989, this.field4914[var80]);
                    var12.method1242(-12989, this.field4936[var80]);
                    var12.field1218 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field4969; var79++) {
                    var12.method1243(84, this.field4914[var79]);
                    var12.method1243(94, this.field4936[var79]);
                    var12.field1218 += var7 - 8;
                }
            }
        }
        var12.field1218 = this.field4969 * var7;
        class199 var81;
        if (arg0) {
            if (this.field4976 == null) {
                this.field4976 = this.field4949.method2438(var12.field1269, var7, (byte) -75, true, var12.field1218);
            } else {
                this.field4976.method610(13506, var12.field1218, var12.field1269, var7);
            }
            var81 = this.field4976;
            this.field5018 = 0;
        } else {
            var81 = this.field4949.method2438(var12.field1269, var7, (byte) -75, false, var12.field1218);
            this.field4940 = true;
        }
        if (var5) {
            this.field4965.field4736 = var8;
            this.field4965.field4738 = var81;
        }
        if (var6) {
            this.field5008.field4738 = var81;
            this.field5008.field4736 = var11;
        }
        if (var3) {
            this.field4959.field4736 = var9;
            this.field4959.field4738 = var81;
        }
        if (var4) {
            this.field4916.field4736 = var10;
            this.field4916.field4738 = var81;
        }
    }

    @OriginalMember(owner = "client!jg", name = "RA", descriptor = "()I")
    public final int method1868() {
        if (!this.field5030) {
            this.method2143((byte) 120);
        }
        field4928++;
        return this.field4981;
    }

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "()I")
    public final int method1870() {
        if (!this.field5030) {
            this.method2143((byte) -63);
        }
        field4948++;
        return this.field4993;
    }

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "(III)V")
    public final void method1885(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4919; var4++) {
            if (arg0 != 128) {
                this.field4973[var4] = this.field4973[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field4983[var4] = this.field4983[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field4918[var4] = this.field4918[var4] * arg2 >> 7;
            }
        }
        field4943++;
        if (this.field4965 != null) {
            this.field4965.field4738 = null;
        }
        this.field5030 = false;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V")
    public final void method1858(int arg0, int arg1, int arg2, int arg3) {
        field5017++;
        for (int var5 = 0; var5 < this.field5013; var5++) {
            int var9 = this.field4937[var5] & 0xFFFF;
            int var10 = (var9 & 0xFF5E) >> 10;
            int var11 = (var9 & 0x3D2) >> 7;
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field4937[var5] = (short) class422.method2436(class422.method2436(var11 << 7, var10 << 10), var12);
        }
        if (this.field4986 != null) {
            for (int var6 = 0; var6 < this.field4967; var6++) {
                class678 var7 = this.field4986[var6];
                class113 var8 = this.field4922[var6];
                var8.field1192 = class194.field2239[this.field4937[var7.field9527] & 0xFFFF] & 0xFFFFFF | var8.field1192 & 0xFF000000;
            }
        }
        if (this.field4959 != null) {
            this.field4959.field4738 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "DA", descriptor = "(SS)V")
    public final void method1906(short arg0, short arg1) {
        field4930++;
        class524 var3 = this.field4949.field8050;
        for (int var4 = 0; var4 < this.field5013; var4++) {
            if (this.field5002[var4] == arg0) {
                this.field5002[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class295 var7 = var3.method140(arg0 & 0xFFFF, 862);
            var6 = var7.field3667;
            var5 = var7.field3671;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class295 var10 = var3.method140(arg1 & 0xFFFF, 862);
            var8 = var10.field3671;
            var9 = var10.field3667;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field4986 != null) {
            for (int var11 = 0; var11 < this.field4967; var11++) {
                class678 var12 = this.field4986[var11];
                class113 var13 = this.field4922[var11];
                var13.field1192 = class194.field2239[this.field4937[var12.field9527] & 0xFFFF] & 0xFFFFFF | var13.field1192 & 0xFF000000;
            }
        }
        if (this.field4959 != null) {
            this.field4959.field4738 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!jg", name = "ga", descriptor = "(I)V")
    public final void method1883(int arg0) {
        field4962++;
        if (this.field4959 != null) {
            this.field4959.field4738 = null;
        }
        this.field5028 = (short) arg0;
        if (this.field4916 != null) {
            this.field4916.field4738 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIZ)Lda;")
    public final class473 method1877(byte arg0, int arg1, boolean arg2) {
        field4929++;
        class366 var4;
        class366 var5;
        if (arg0 == 1) {
            var5 = this.field4949.field5862;
            var4 = this.field4949.field5924;
        } else if (arg0 == 2) {
            var4 = this.field4949.field5934;
            var5 = this.field4949.field5932;
        } else if (arg0 == 3) {
            var5 = this.field4949.field5858;
            var4 = this.field4949.field5956;
        } else if (arg0 == 4) {
            var4 = this.field4949.field5927;
            var5 = this.field4949.field5897;
        } else if (arg0 == 5) {
            var4 = this.field4949.field5912;
            var5 = this.field4949.field5955;
        } else {
            var5 = var4 = new class366(this.field4949);
        }
        return this.method2151((byte) 116, var4, arg0 != 0, arg1, arg2, var5);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method1896(int arg0, int arg1, class490 arg2, boolean arg3, int arg4) {
        field4970++;
        return this.method2150(arg2, -74, arg3, arg0, arg4, arg1);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method1867(int arg0, int arg1, class490 arg2, boolean arg3) {
        field5026++;
        return this.method2150(arg2, -52, arg3, arg0, -1, arg1);
    }

    @OriginalMember(owner = "client!jg", name = "SA", descriptor = "(I)V")
    public final void method1907(int arg0) {
        field5029++;
        this.field4988 = arg0;
        if (this.field5007 != null && (this.field4988 & 0x10000) == 0) {
            this.field5024 = this.field5007.field7364;
            this.field4932 = this.field5007.field7361;
            this.field5005 = this.field5007.field7369;
            this.field4997 = this.field5007.field7363;
            this.field5007 = null;
        }
        this.field4940 = true;
        this.method2140((byte) 50);
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "()V")
    public final void method1855() {
        field4950++;
    }

    @OriginalMember(owner = "client!jg", name = "fa", descriptor = "(I)V")
    public final void method1866(int arg0) {
        field5023++;
        int var2 = class435.field6134[arg0];
        int var3 = class435.field6135[arg0];
        for (int var4 = 0; var4 < this.field4919; var4++) {
            int var7 = this.field4973[var4] * var3 + this.field4918[var4] * var2 >> 14;
            this.field4918[var4] = this.field4918[var4] * var3 - (this.field4973[var4] * var2) >> 14;
            this.field4973[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field4969; var5++) {
            int var6 = this.field5024[var5] * var3 + this.field5005[var5] * var2 >> 14;
            this.field5005[var5] = (short) (this.field5005[var5] * var3 - (this.field5024[var5] * var2) >> 14);
            this.field5024[var5] = (short) var6;
        }
        if (this.field4916 == null && this.field4959 != null) {
            this.field4959.field4738 = null;
        }
        if (this.field4916 != null) {
            this.field4916.field4738 = null;
        }
        if (this.field4965 != null) {
            this.field4965.field4738 = null;
        }
        this.field5030 = false;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lvj;)V")
    public class366(class422 arg0) {
        this.field4949 = arg0;
        this.field4965 = new class351(null, 5126, 3, 0);
        this.field5008 = new class351(null, 5126, 2, 0);
        this.field4916 = new class351(null, 5126, 3, 0);
        this.field4959 = new class351(null, 5121, 4, 0);
        this.field4964 = new class395();
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lvj;Lef;IIII)V")
    public class366(class422 arg0, class581 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4994 = arg5;
        this.field4949 = arg0;
        this.field4988 = arg2;
        if (class143.method787((byte) 48, arg2, arg5)) {
            this.field4965 = new class351(null, 5126, 3, 0);
        }
        if (class508.method2904(arg5, arg2, 0)) {
            this.field5008 = new class351(null, 5126, 2, 0);
        }
        if (class494.method2858((byte) 90, arg5, arg2)) {
            this.field4916 = new class351(null, 5126, 3, 0);
        }
        if (class674.method3722(arg2, arg5, (byte) -34)) {
            this.field4959 = new class351(null, 5121, 4, 0);
        }
        if (class542.method3050(4541, arg2, arg5)) {
            this.field4964 = new class395();
        }
        class524 var7 = arg0.field8050;
        int[] var8 = new int[arg1.field8251];
        this.field4977 = new int[arg1.field8250 + 1];
        for (int var9 = 0; var9 < arg1.field8251; var9++) {
            if ((arg1.field8217 == null || arg1.field8217[var9] != 2) && (arg1.field8221 == null || arg1.field8221[var9] == -1 || !var7.method140(arg1.field8221[var9] & 0xFFFF, 862).field3670)) {
                var8[this.field5013++] = var9;
                this.field4977[arg1.field8224[var9]]++;
                this.field4977[arg1.field8225[var9]]++;
                this.field4977[arg1.field8259[var9]]++;
            }
        }
        this.field4927 = this.field5013;
        long[] var10 = new long[this.field5013];
        boolean var11 = (this.field4988 & 0x100) != 0;
        label501: for (int var12 = 0; var12 < this.field5013; var12++) {
            int var180 = var8[var12];
            class295 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field8223 != null) {
                for (int var186 = 0; var186 < arg1.field8223.length; var186++) {
                    class636 var187 = arg1.field8223[var186];
                    if (var187.field8951 == var180) {
                        class247 var188 = class260.method1539(var187.field8954, (byte) 69);
                        if (var188.field3055) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field4927--;
                            continue label501;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field8221 != null) {
                var189 = arg1.field8221[var180];
                if (var189 != -1) {
                    var181 = var7.method140(var189 & 0xFFFF, 862);
                    var185 = var181.field3676;
                    var184 = var181.field3669;
                }
            }
            boolean var190 = arg1.field8244 != null && arg1.field8244[var180] != 0 || var181 != null && var181.field3666 | !var181.field3665;
            if ((var11 || var190) && arg1.field8228 != null) {
                var182 += arg1.field8228[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = ((var189 & 0xFFFF) << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
            this.field4982 |= var190;
        }
        class201.method1204(false, var10, var8);
        this.field4983 = arg1.field8237;
        this.field5021 = arg1.field8268;
        this.field4919 = arg1.field8250;
        this.field4918 = arg1.field8253;
        this.field4973 = arg1.field8219;
        this.field5015 = arg1.field8248;
        class683[] var13 = new class683[this.field4919];
        this.field5003 = arg1.field8255;
        this.field5022 = arg1.field8252;
        if (arg1.field8223 != null) {
            this.field4967 = arg1.field8223.length;
            this.field4986 = new class678[this.field4967];
            this.field4922 = new class113[this.field4967];
            for (int var14 = 0; var14 < this.field4967; var14++) {
                class636 var15 = arg1.field8223[var14];
                class247 var16 = class260.method1539(var15.field8954, (byte) 75);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5013; var18++) {
                    if (var8[var18] == var15.field8951) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class194.field2239[arg1.field8231[var15.field8951] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field8244 == null ? 0 : arg1.field8244[var15.field8951]) << 24;
                this.field4986[var14] = new class678(var17, arg1.field8224[var15.field8951], arg1.field8225[var15.field8951], arg1.field8259[var15.field8951], var16.field3063, var16.field3056, var16.field3064, var16.field3048, var16.field3050, var16.field3055, var16.field3057, var15.field8957);
                this.field4922[var14] = new class113(var20);
            }
        }
        int var21 = this.field5013 * 3;
        this.field4968 = new short[this.field5013];
        this.field4937 = new short[this.field5013];
        if (arg1.field8238 != null) {
            this.field4974 = new short[this.field5013];
        }
        this.field4914 = new float[var21];
        this.field4923 = new short[this.field5013];
        this.field4947 = (short) arg3;
        class190.field2178 = new long[var21];
        this.field4936 = new float[var21];
        this.field4920 = new byte[this.field5013];
        this.field5024 = new short[var21];
        this.field4932 = new byte[var21];
        this.field5002 = new short[this.field5013];
        this.field5028 = (short) arg4;
        this.field5005 = new short[var21];
        this.field5019 = new short[this.field5013];
        this.field4997 = new short[var21];
        this.field4941 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field8250; var23++) {
            int var179 = this.field4977[var23];
            this.field4977[var23] = var22;
            var22 += var179;
            var13[var23] = new class683();
        }
        this.field4977[arg1.field8250] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field8235 != null) {
            int var28 = arg1.field8245;
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
            var26 = new int[var28];
            for (int var36 = 0; var36 < this.field5013; var36++) {
                int var43 = var8[var36];
                if (arg1.field8235[var43] != -1) {
                    int var44 = arg1.field8235[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field8224[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field8225[var43];
                        } else {
                            var46 = arg1.field8259[var43];
                        }
                        int var47 = arg1.field8219[var46];
                        int var48 = arg1.field8237[var46];
                        int var49 = arg1.field8253[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
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
            var24 = new int[var28];
            var27 = new float[var28][];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field8269[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field8262[var37];
                        if (var42 == 0) {
                            var39 = 1.0F;
                            var40 = 1.0F;
                        } else if (var42 <= 0) {
                            var40 = 1.0F;
                            var39 = (float) (-var42) / 1024.0F;
                        } else {
                            var39 = 1.0F;
                            var40 = (float) var42 / 1024.0F;
                        }
                        var41 = 64.0F / (float) arg1.field8256[var37];
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field8254[var37];
                        var39 = 64.0F / (float) arg1.field8262[var37];
                        var41 = 64.0F / (float) arg1.field8256[var37];
                    } else {
                        var39 = (float) arg1.field8262[var37] / 1024.0F;
                        var40 = (float) arg1.field8254[var37] / 1024.0F;
                        var41 = (float) arg1.field8256[var37] / 1024.0F;
                    }
                    var27[var37] = class242.method1437(arg1.field8267[var37], 1369, arg1.field8229[var37], class105.method572(arg1.field8243[var37], 255), var40, arg1.field8270[var37], var41, var39);
                }
            }
        }
        class405[] var50 = new class405[arg1.field8251];
        for (int var51 = 0; var51 < arg1.field8251; var51++) {
            short var158 = arg1.field8224[var51];
            short var159 = arg1.field8225[var51];
            short var160 = arg1.field8259[var51];
            int var161 = this.field4973[var159] - this.field4973[var158];
            int var162 = this.field4983[var159] - this.field4983[var158];
            int var163 = this.field4918[var159] - this.field4918[var158];
            int var164 = this.field4973[var160] - this.field4973[var158];
            int var165 = this.field4983[var160] - this.field4983[var158];
            int var166 = this.field4918[var160] - this.field4918[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var168 >>= 0x1;
                var169 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field8217 == null ? 0 : arg1.field8217[var51];
            if (var174 == 0) {
                class683 var176 = var13[var158];
                var176.field9626 += var172;
                var176.field9628++;
                var176.field9624 += var171;
                var176.field9627 += var173;
                class683 var177 = var13[var159];
                var177.field9624 += var171;
                var177.field9626 += var172;
                var177.field9627 += var173;
                var177.field9628++;
                class683 var178 = var13[var160];
                var178.field9626 += var172;
                var178.field9624 += var171;
                var178.field9627 += var173;
                var178.field9628++;
            } else if (var174 == 1) {
                class405 var175 = var50[var51] = new class405();
                var175.field5417 = var171;
                var175.field5419 = var173;
                var175.field5421 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field5013; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field8231[var68] & 0xFFFF;
            short var70;
            if (arg1.field8221 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field8221[var68];
            }
            int var71;
            if (arg1.field8235 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field8235[var68];
            }
            int var72;
            if (arg1.field8244 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field8244[var68] & 0xFF;
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
                    var79 = 1;
                    var75 = 1.0F;
                    var76 = 1.0F;
                    var80 = 2;
                    var78 = 0.0F;
                    var74 = 1.0F;
                    var73 = 0.0F;
                    var77 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field8269[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field8224[var68];
                        short var84 = arg1.field8225[var68];
                        short var85 = arg1.field8259[var68];
                        short var86 = arg1.field8270[var71];
                        short var87 = arg1.field8229[var71];
                        short var88 = arg1.field8267[var71];
                        float var89 = (float) arg1.field8219[var86];
                        float var90 = (float) arg1.field8237[var86];
                        float var91 = (float) arg1.field8253[var86];
                        float var92 = (float) arg1.field8219[var87] - var89;
                        float var93 = (float) arg1.field8237[var87] - var90;
                        float var94 = (float) arg1.field8253[var87] - var91;
                        float var95 = (float) arg1.field8219[var88] - var89;
                        float var96 = (float) arg1.field8237[var88] - var90;
                        float var97 = (float) arg1.field8253[var88] - var91;
                        float var98 = (float) arg1.field8219[var83] - var89;
                        float var99 = (float) arg1.field8237[var83] - var90;
                        float var100 = (float) arg1.field8253[var83] - var91;
                        float var101 = (float) arg1.field8219[var84] - var89;
                        float var102 = (float) arg1.field8237[var84] - var90;
                        float var103 = (float) arg1.field8253[var84] - var91;
                        float var104 = (float) arg1.field8219[var85] - var89;
                        float var105 = (float) arg1.field8237[var85] - var90;
                        float var106 = (float) arg1.field8253[var85] - var91;
                        float var107 = var93 * var97 - var94 * var96;
                        float var108 = var94 * var95 - (var92 * var97);
                        float var109 = var92 * var96 - (var93 * var95);
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - var95 * var109;
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        float var114 = var92 * var108 - (var93 * var107);
                        float var115 = var93 * var109 - (var94 * var108);
                        float var116 = var94 * var107 - (var92 * var109);
                        float var117 = 1.0F / (var97 * var114 + var95 * var115 + var96 * var116);
                        var74 = (var100 * var114 + var98 * var115 + var99 * var116) * var117;
                        var78 = (var106 * var114 + var104 * var115 + var105 * var116) * var117;
                        var76 = (var103 * var114 + var101 * var115 + var102 * var116) * var117;
                    } else {
                        short var118 = arg1.field8224[var68];
                        short var119 = arg1.field8225[var68];
                        short var120 = arg1.field8259[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field8246[var71];
                        float var126 = (float) arg1.field8258[var71] / 256.0F;
                        if (var82 == 1) {
                            float var144 = (float) arg1.field8254[var71] / 1024.0F;
                            class684.method3788((byte) -91, arg1.field8253[var118], arg1.field8237[var118], var124, var144, var125, arg1.field8219[var118], var122, var123, var121, var126);
                            var73 = class353.field4755;
                            var74 = class465.field6644;
                            class684.method3788((byte) -91, arg1.field8253[var119], arg1.field8237[var119], var124, var144, var125, arg1.field8219[var119], var122, var123, var121, var126);
                            var76 = class465.field6644;
                            var75 = class353.field4755;
                            class684.method3788((byte) -91, arg1.field8253[var120], arg1.field8237[var120], var124, var144, var125, arg1.field8219[var120], var122, var123, var121, var126);
                            var77 = class353.field4755;
                            var78 = class465.field6644;
                            float var145 = var144 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var145 < var77 - var73) {
                                    var77 -= var144;
                                    var80 = 1;
                                } else if (var73 - var77 > var145) {
                                    var77 += var144;
                                    var80 = 2;
                                }
                                if (var75 - var73 > var145) {
                                    var79 = 1;
                                    var75 -= var144;
                                } else if (var145 < var73 - var75) {
                                    var75 += var144;
                                    var79 = 2;
                                }
                            } else {
                                if (var76 - var74 > var145) {
                                    var79 = 1;
                                    var76 -= var144;
                                } else if (var145 < var74 - var76) {
                                    var76 += var144;
                                    var79 = 2;
                                }
                                if (var145 < var78 - var74) {
                                    var78 -= var144;
                                    var80 = 1;
                                } else if (var74 - var78 > var145) {
                                    var80 = 2;
                                    var78 += var144;
                                }
                            }
                        } else if (var82 == 2) {
                            float var127 = (float) arg1.field8227[var71] / 256.0F;
                            float var128 = (float) arg1.field8242[var71] / 256.0F;
                            int var129 = arg1.field8219[var119] - arg1.field8219[var118];
                            int var130 = arg1.field8237[var119] - arg1.field8237[var118];
                            int var131 = arg1.field8253[var119] - arg1.field8253[var118];
                            int var132 = arg1.field8219[var120] - arg1.field8219[var118];
                            int var133 = arg1.field8237[var120] - arg1.field8237[var118];
                            int var134 = arg1.field8253[var120] - arg1.field8253[var118];
                            int var135 = var130 * var134 - (var131 * var133);
                            int var136 = var131 * var132 - var129 * var134;
                            int var137 = var129 * var133 - var130 * var132;
                            float var138 = 64.0F / (float) arg1.field8262[var71];
                            float var139 = 64.0F / (float) arg1.field8256[var71];
                            float var140 = 64.0F / (float) arg1.field8254[var71];
                            float var141 = (var124[2] * (float) var137 + var124[1] * (float) var136 + var124[0] * (float) var135) / var138;
                            float var142 = (var124[5] * (float) var137 + var124[4] * (float) var136 + var124[3] * (float) var135) / var139;
                            float var143 = (var124[8] * (float) var137 + var124[7] * (float) var136 + var124[6] * (float) var135) / var140;
                            var81 = class359.method2111(var142, var141, var143, (byte) -112);
                            class87.method450(var124, var123, var127, arg1.field8219[var118], var121, var122, arg1.field8253[var118], var81, 4, var125, var128, var126, arg1.field8237[var118]);
                            var73 = class149.field1650;
                            var74 = class564.field8059;
                            class87.method450(var124, var123, var127, arg1.field8219[var119], var121, var122, arg1.field8253[var119], var81, 4, var125, var128, var126, arg1.field8237[var119]);
                            var76 = class564.field8059;
                            var75 = class149.field1650;
                            class87.method450(var124, var123, var127, arg1.field8219[var120], var121, var122, arg1.field8253[var120], var81, 4, var125, var128, var126, arg1.field8237[var120]);
                            var77 = class149.field1650;
                            var78 = class564.field8059;
                        } else if (var82 == 3) {
                            class472.method2721(var121, 1, var123, arg1.field8237[var118], arg1.field8253[var118], var122, arg1.field8219[var118], var126, var125, var124);
                            var74 = class34.field335;
                            var73 = class382.field5164;
                            class472.method2721(var121, 1, var123, arg1.field8237[var119], arg1.field8253[var119], var122, arg1.field8219[var119], var126, var125, var124);
                            var75 = class382.field5164;
                            var76 = class34.field335;
                            class472.method2721(var121, 1, var123, arg1.field8237[var120], arg1.field8253[var120], var122, arg1.field8219[var120], var126, var125, var124);
                            var77 = class382.field5164;
                            var78 = class34.field335;
                            if ((var125 & 0x1) == 0) {
                                if ((var75 - var73 > 0.5F)) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if (var77 - var73 > 0.5F) {
                                    var80 = 1;
                                    var77--;
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
                                    var80 = 1;
                                    var78--;
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
            if (arg1.field8217 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field8217[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var81 << 24) + (long) var72 + (long) (var69 << 8) << 32) + (long) (var71 << 2);
                short var152 = arg1.field8224[var68];
                short var153 = arg1.field8225[var68];
                short var154 = arg1.field8259[var68];
                class683 var155 = var13[var152];
                this.field4968[var52] = this.method2148(arg1, var73, var155.field9627, -117, var155.field9626, var150, var74, var155.field9624, var152, var155.field9628);
                class683 var156 = var13[var153];
                this.field5019[var52] = this.method2148(arg1, var75, var156.field9627, -68, var156.field9626, (long) var79 + var150, var76, var156.field9624, var153, var156.field9628);
                class683 var157 = var13[var154];
                this.field4923[var52] = this.method2148(arg1, var77, var157.field9627, -63, var157.field9626, (long) var80 + var150, var78, var157.field9624, var154, var157.field9628);
            } else if (var146 == 1) {
                class405 var147 = var50[var68];
                long var148 = (long) ((var147.field5421 + 256 << 22) + (var147.field5417 + 256 << 12) + (var147.field5419 <= 0 ? 2048 : 1024) + (var71 << 2)) + ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32);
                this.field4968[var52] = this.method2148(arg1, var73, var147.field5419, -81, var147.field5421, var148, var74, var147.field5417, arg1.field8224[var68], 0);
                this.field5019[var52] = this.method2148(arg1, var75, var147.field5419, -116, var147.field5421, (long) var79 + var148, var76, var147.field5417, arg1.field8225[var68], 0);
                this.field4923[var52] = this.method2148(arg1, var77, var147.field5419, -114, var147.field5421, (long) var80 + var148, var78, var147.field5417, arg1.field8259[var68], 0);
            }
            if (arg1.field8221 == null) {
                this.field5002[var52] = -1;
            } else {
                this.field5002[var52] = arg1.field8221[var68];
            }
            if (arg1.field8244 != null) {
                this.field4920[var52] = arg1.field8244[var68];
            }
            if (arg1.field8238 != null) {
                this.field4974[var52] = arg1.field8238[var68];
            }
            this.field4937[var52] = arg1.field8231[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field4927; var55++) {
            short var67 = this.field5002[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field4955 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field4927; var58++) {
            short var66 = this.field5002[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field4955[var56++] = var58;
            }
        }
        this.field4955[var56] = this.field4927;
        class190.field2178 = null;
        this.field5024 = class127.method723(10790, this.field4969, this.field5024);
        this.field4997 = class127.method723(10790, this.field4969, this.field4997);
        this.field5005 = class127.method723(10790, this.field4969, this.field5005);
        this.field4932 = class99.method536(this.field4932, this.field4969, (byte) 114);
        this.field4914 = class414.method2329(this.field4914, this.field4969, 0);
        this.field4936 = class414.method2329(this.field4936, this.field4969, 0);
        if (arg1.field8216 != null && class235.method1394((byte) -74, this.field4994, arg2)) {
            this.field4980 = arg1.method3300((byte) -119, false);
        }
        if (arg1.field8223 != null && class163.method885(arg2, this.field4994, (byte) 83)) {
            this.field4991 = arg1.method3293(94);
        }
        if (arg1.field8218 != null && class34.method176(this.field4994, true, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field5013; var61++) {
                int var65 = arg1.field8218[var8[var61]];
                if (var65 >= 0) {
                    if (var65 > var59) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field4996 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field4996[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field5013; var63++) {
                int var64 = arg1.field8218[var8[var63]];
                if (var64 >= 0) {
                    this.field4996[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
