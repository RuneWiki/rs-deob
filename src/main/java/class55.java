import jaclib.memory.Stream;
import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class55 extends class282 {

    @OriginalMember(owner = "client!am", name = "db", descriptor = "I")
    private int field881 = 0;

    @OriginalMember(owner = "client!am", name = "cb", descriptor = "I")
    private int field880 = 0;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "Z")
    private boolean field841 = false;

    @OriginalMember(owner = "client!am", name = "fb", descriptor = "I")
    private int field883 = 0;

    @OriginalMember(owner = "client!am", name = "Ub", descriptor = "I")
    private int field924 = 0;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "Z")
    private boolean field855 = false;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    private int field845 = 0;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "Z")
    private boolean field864 = false;

    @OriginalMember(owner = "client!am", name = "dc", descriptor = "Z")
    private boolean field933 = true;

    @OriginalMember(owner = "client!am", name = "rc", descriptor = "Lkw;")
    private class346 field947;

    @OriginalMember(owner = "client!am", name = "Ac", descriptor = "Ljaa;")
    private class745 field956;

    @OriginalMember(owner = "client!am", name = "X", descriptor = "Ljaa;")
    private class745 field875;

    @OriginalMember(owner = "client!am", name = "Sb", descriptor = "Ljaa;")
    private class745 field922;

    @OriginalMember(owner = "client!am", name = "gc", descriptor = "Ljaa;")
    private class745 field936;

    @OriginalMember(owner = "client!am", name = "zc", descriptor = "Laaa;")
    private class25 field955;

    @OriginalMember(owner = "client!am", name = "Vb", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    private int field858;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "[I")
    private int[] field848;

    @OriginalMember(owner = "client!am", name = "tb", descriptor = "[I")
    private int[] field897;

    @OriginalMember(owner = "client!am", name = "Wb", descriptor = "[S")
    private short[] field926;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "[I")
    private int[] field849;

    @OriginalMember(owner = "client!am", name = "Zb", descriptor = "[I")
    private int[] field929;

    @OriginalMember(owner = "client!am", name = "Ob", descriptor = "[Lvea;")
    private class647[] field918;

    @OriginalMember(owner = "client!am", name = "Qb", descriptor = "[Lqv;")
    private class108[] field920;

    @OriginalMember(owner = "client!am", name = "Bc", descriptor = "I")
    private int field957;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "[Lfs;")
    private class556[] field861;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "[Lhg;")
    private class582[] field854;

    @OriginalMember(owner = "client!am", name = "Mb", descriptor = "[F")
    private float[] field916;

    @OriginalMember(owner = "client!am", name = "Fb", descriptor = "[B")
    private byte[] field909;

    @OriginalMember(owner = "client!am", name = "ac", descriptor = "[S")
    private short[] field930;

    @OriginalMember(owner = "client!am", name = "Pb", descriptor = "[S")
    private short[] field919;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "[S")
    private short[] field860;

    @OriginalMember(owner = "client!am", name = "pb", descriptor = "[S")
    private short[] field893;

    @OriginalMember(owner = "client!am", name = "qc", descriptor = "[S")
    private short[] field946;

    @OriginalMember(owner = "client!am", name = "S", descriptor = "S")
    private short field870;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "[S")
    private short[] field850;

    @OriginalMember(owner = "client!am", name = "mc", descriptor = "S")
    private short field942;

    @OriginalMember(owner = "client!am", name = "gb", descriptor = "[S")
    private short[] field884;

    @OriginalMember(owner = "client!am", name = "nb", descriptor = "[S")
    private short[] field891;

    @OriginalMember(owner = "client!am", name = "lb", descriptor = "[S")
    private short[] field889;

    @OriginalMember(owner = "client!am", name = "Rb", descriptor = "[S")
    private short[] field921;

    @OriginalMember(owner = "client!am", name = "Nb", descriptor = "[B")
    private byte[] field917;

    @OriginalMember(owner = "client!am", name = "R", descriptor = "[F")
    private float[] field869;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "[I")
    private int[] field842;

    @OriginalMember(owner = "client!am", name = "Gb", descriptor = "[[I")
    private int[][] field910;

    @OriginalMember(owner = "client!am", name = "kc", descriptor = "[[I")
    private int[][] field940;

    @OriginalMember(owner = "client!am", name = "lc", descriptor = "[[I")
    private int[][] field941;

    @OriginalMember(owner = "client!am", name = "cc", descriptor = "B")
    private byte field932;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!am", name = "P", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!am", name = "T", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!am", name = "U", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!am", name = "V", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!am", name = "W", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!am", name = "Y", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!am", name = "Z", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!am", name = "ab", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!am", name = "bb", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!am", name = "eb", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!am", name = "hb", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!am", name = "ib", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!am", name = "jb", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!am", name = "kb", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!am", name = "mb", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!am", name = "ob", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!am", name = "rb", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!am", name = "sb", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!am", name = "ub", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!am", name = "wb", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!am", name = "xb", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!am", name = "yb", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!am", name = "zb", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!am", name = "Bb", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!am", name = "Cb", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!am", name = "Db", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!am", name = "Eb", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!am", name = "Hb", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!am", name = "Ib", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!am", name = "Kb", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!am", name = "Lb", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!am", name = "Xb", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!am", name = "Yb", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!am", name = "bc", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!am", name = "hc", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!am", name = "ic", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!am", name = "jc", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!am", name = "nc", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!am", name = "oc", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!am", name = "pc", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!am", name = "tc", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!am", name = "uc", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!am", name = "vc", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!am", name = "wc", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!am", name = "xc", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!am", name = "yc", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!am", name = "vb", descriptor = "Lju;")
    private class100 field899;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "Llo;")
    private class116 field844;

    @OriginalMember(owner = "client!am", name = "Tb", descriptor = "Llca;")
    private class52 field923;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "S")
    private short field856;

    @OriginalMember(owner = "client!am", name = "O", descriptor = "S")
    private short field866;

    @OriginalMember(owner = "client!am", name = "qb", descriptor = "S")
    private short field894;

    @OriginalMember(owner = "client!am", name = "Ab", descriptor = "S")
    private short field904;

    @OriginalMember(owner = "client!am", name = "Jb", descriptor = "S")
    private short field913;

    @OriginalMember(owner = "client!am", name = "ec", descriptor = "S")
    private short field934;

    @OriginalMember(owner = "client!am", name = "fc", descriptor = "S")
    private short field935;

    @OriginalMember(owner = "client!am", name = "sc", descriptor = "S")
    private short field948;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "()V")
    public final void method483() {
        field928++;
    }

    @OriginalMember(owner = "client!am", name = "C", descriptor = "(I)V")
    public final void method484(int arg0) {
        if (this.field936 != null) {
            this.field936.field10413 = null;
        }
        field847++;
        this.field870 = (short) arg0;
    }

    @OriginalMember(owner = "client!am", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method485(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field950++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            class160.field2293 = 0;
            int var13 = 0;
            class525.field7629 = 0;
            class412.field5877 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field910.length > var15) {
                    int[] var16 = this.field910[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field926 == null || (arg6 & this.field926[var18]) != 0) {
                            class412.field5877 += this.field897[var18];
                            class160.field2293 += this.field849[var18];
                            class525.field7629 += this.field929[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class160.field2293 = var12;
                class412.field5877 = var11;
                class525.field7629 = var10;
            } else {
                class729.field10232 = true;
                class160.field2293 = class160.field2293 / var13 + var12;
                class412.field5877 = class412.field5877 / var13 + var11;
                class525.field7629 = class525.field7629 / var13 + var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[5] * arg4 + arg7[4] * arg3 + 8192 >> 14;
                int var21 = arg7[6] * arg2 + arg7[8] * arg4 + arg7[7] * arg3 + 8192 >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field910.length > var26) {
                    int[] var27 = this.field910[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field926 == null || (arg6 & this.field926[var29]) != 0) {
                            this.field897[var29] += var24;
                            this.field849[var29] += var23;
                            this.field929[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field910.length) {
                        int[] var110 = this.field910[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field926 == null || (this.field926[var112] & arg6) != 0) {
                                this.field897[var112] -= class412.field5877;
                                this.field849[var112] -= class160.field2293;
                                this.field929[var112] -= class525.field7629;
                                if (arg4 != 0) {
                                    int var113 = class125.field1736[arg4];
                                    int var114 = class125.field1729[arg4];
                                    int var115 = this.field897[var112] * var114 + this.field849[var112] * var113 + 16383 >> 14;
                                    this.field849[var112] = this.field849[var112] * var114 + 16383 - (this.field897[var112] * var113) >> 14;
                                    this.field897[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class125.field1736[arg2];
                                    int var117 = class125.field1729[arg2];
                                    int var118 = this.field849[var112] * var117 + 16383 - (this.field929[var112] * var116) >> 14;
                                    this.field929[var112] = this.field849[var112] * var116 + (this.field929[var112] * var117) + 16383 >> 14;
                                    this.field849[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class125.field1736[arg3];
                                    int var120 = class125.field1729[arg3];
                                    int var121 = this.field897[var112] * var120 + (this.field929[var112] * var119 + 16383) >> 14;
                                    this.field929[var112] = this.field929[var112] * var120 + 16383 - (this.field897[var112] * var119) >> 14;
                                    this.field897[var112] = var121;
                                }
                                this.field897[var112] += class412.field5877;
                                this.field849[var112] += class160.field2293;
                                this.field929[var112] += class525.field7629;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field910.length > var92) {
                            int[] var93 = this.field910[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field926 == null || (this.field926[var95] & arg6) != 0) {
                                    int var96 = this.field848[var95];
                                    int var97 = this.field848[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field919[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class125.field1736[arg4];
                                            int var101 = class125.field1729[arg4];
                                            int var102 = this.field893[var99] * var100 + this.field889[var99] * var101 + 16383 >> 14;
                                            this.field893[var99] = (short) (this.field893[var99] * var101 + 16383 - (this.field889[var99] * var100) >> 14);
                                            this.field889[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class125.field1736[arg2];
                                            int var104 = class125.field1729[arg2];
                                            int var105 = this.field893[var99] * var104 + 16383 - (this.field891[var99] * var103) >> 14;
                                            this.field891[var99] = (short) (this.field893[var99] * var103 + this.field891[var99] * var104 + 16383 >> 14);
                                            this.field893[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class125.field1736[arg3];
                                            int var107 = class125.field1729[arg3];
                                            int var108 = this.field891[var99] * var106 + (this.field889[var99] * var107) + 16383 >> 14;
                                            this.field891[var99] = (short) (this.field891[var99] * var107 + 16383 - (this.field889[var99] * var106) >> 14);
                                            this.field889[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field922 == null && this.field936 != null) {
                        this.field936.field10413 = null;
                    }
                    if (this.field922 != null) {
                        this.field922.field10413 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class729.field10232) {
                    int var36 = arg7[6] * class525.field7629 + arg7[0] * class412.field5877 + arg7[3] * class160.field2293 + 8192 >> 14;
                    int var37 = arg7[4] * class160.field2293 + arg7[7] * class525.field7629 + arg7[1] * class412.field5877 + 8192 >> 14;
                    int var38 = var33 + var36;
                    int var39 = arg7[8] * class525.field7629 + (arg7[2] * class412.field5877 + (arg7[5] * class160.field2293)) + 8192 >> 14;
                    int var40 = var34 + var37;
                    int var41 = var35 + var39;
                    class160.field2293 = var40;
                    class412.field5877 = var38;
                    class729.field10232 = false;
                    class525.field7629 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class125.field1729[arg2];
                int var44 = class125.field1736[arg2];
                int var45 = class125.field1729[arg3];
                int var46 = class125.field1736[arg3];
                int var47 = class125.field1729[arg4];
                int var48 = class125.field1736[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[7] = var46 * var48 + var45 * var49 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[5] = -var44;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[1] = -var45 * var48 + (var46 * var49) + 8192 >> 14;
                int var51 = var42[1] * -class160.field2293 + (var42[2] * -class525.field7629) + var42[0] * -class412.field5877 + 8192 >> 14;
                int var52 = var42[5] * -class525.field7629 + var42[4] * -class160.field2293 + var42[3] * -class412.field5877 + 8192 >> 14;
                int var53 = var42[8] * -class525.field7629 + var42[7] * -class160.field2293 + var42[6] * -class412.field5877 + 8192 >> 14;
                int var54 = class412.field5877 + var51;
                int var55 = class160.field2293 + var52;
                int var56 = class525.field7629 + var53;
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
                int var60 = var42[5] * var35 + var42[4] * var34 + var42[3] * var33 + 8192 >> 14;
                int var61 = var54 + var59;
                int var62 = var42[8] * var35 + var42[6] * var33 + (var42[7] * var34) + 8192 >> 14;
                int var63 = var55 + var60;
                int var64 = var56 + var62;
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
                int var67 = arg7[2] * var64 + arg7[0] * var61 + arg7[1] * var63 + 8192 >> 14;
                int var68 = arg7[5] * var64 + (arg7[3] * var61 + (arg7[4] * var63)) + 8192 >> 14;
                int var69 = arg7[8] * var64 + (arg7[6] * var61 + (arg7[7] * var63)) + 8192 >> 14;
                int var70 = var31 + var68;
                int var71 = var30 + var67;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field910.length > var74) {
                        int[] var75 = this.field910[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field926 == null || (this.field926[var77] & arg6) != 0) {
                                int var78 = this.field929[var77] * var65[2] + this.field897[var77] * var65[0] + this.field849[var77] * var65[1] + 8192 >> 14;
                                int var79 = this.field849[var77] * var65[4] + this.field929[var77] * var65[5] + this.field897[var77] * var65[3] + 8192 >> 14;
                                int var80 = this.field897[var77] * var65[6] + 8192 - (-(this.field929[var77] * var65[8]) + -(this.field849[var77] * var65[7])) >> 14;
                                int var81 = var71 + var78;
                                int var82 = var70 + var79;
                                this.field897[var77] = var81;
                                int var83 = var72 + var80;
                                this.field849[var77] = var82;
                                this.field929[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field910.length > var173) {
                        int[] var174 = this.field910[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field926 == null || (arg6 & this.field926[var176]) != 0) {
                                this.field897[var176] -= class412.field5877;
                                this.field849[var176] -= class160.field2293;
                                this.field929[var176] -= class525.field7629;
                                this.field897[var176] = this.field897[var176] * arg2 >> 7;
                                this.field849[var176] = this.field849[var176] * arg3 >> 7;
                                this.field929[var176] = this.field929[var176] * arg4 >> 7;
                                this.field897[var176] += class412.field5877;
                                this.field849[var176] += class160.field2293;
                                this.field929[var176] += class525.field7629;
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
                if (class729.field10232) {
                    int var128 = arg7[6] * class525.field7629 + arg7[3] * class160.field2293 + arg7[0] * class412.field5877 + 8192 >> 14;
                    int var129 = arg7[7] * class525.field7629 + arg7[1] * class412.field5877 + (arg7[4] * class160.field2293) + 8192 >> 14;
                    int var130 = var126 + var129;
                    int var131 = arg7[5] * class160.field2293 + arg7[2] * class412.field5877 - (-(arg7[8] * class525.field7629) + -8192) >> 14;
                    int var132 = var125 + var128;
                    class160.field2293 = var130;
                    class412.field5877 = var132;
                    int var133 = var127 + var131;
                    class729.field10232 = false;
                    class525.field7629 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class412.field5877 * var134 + 8192 >> 14;
                int var138 = -class160.field2293 * var135 + 8192 >> 14;
                int var139 = -class525.field7629 * var136 + 8192 >> 14;
                int var140 = class412.field5877 + var137;
                int var141 = class160.field2293 + var138;
                int var142 = class525.field7629 + var139;
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
                int var152 = arg7[2] * var149 + arg7[0] * var148 + (arg7[1] * var147) + 8192 >> 14;
                int var153 = arg7[4] * var147 + (arg7[3] * var148 + (arg7[5] * var149) + 8192) >> 14;
                int var154 = arg7[8] * var149 + arg7[7] * var147 + arg7[6] * var148 + 8192 >> 14;
                int var155 = var122 + var152;
                int var156 = var123 + var153;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field910.length > var159) {
                        int[] var160 = this.field910[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field926 == null || (this.field926[var162] & arg6) != 0) {
                                int var163 = this.field897[var162] * var150[0] + this.field929[var162] * var150[2] + this.field849[var162] * var150[1] + 8192 >> 14;
                                int var164 = this.field929[var162] * var150[5] + (this.field897[var162] * var150[3] + (this.field849[var162] * var150[4])) + 8192 >> 14;
                                int var165 = this.field929[var162] * var150[8] + this.field897[var162] * var150[6] - (-(this.field849[var162] * var150[7]) + -8192) >> 14;
                                int var166 = var156 + var164;
                                int var167 = var155 + var163;
                                int var168 = var157 + var165;
                                this.field897[var162] = var167;
                                this.field849[var162] = var166;
                                this.field929[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field941 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field941.length) {
                        int[] var182 = this.field941[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field946 == null || (this.field946[var184] & arg6) != 0) {
                                int var185 = (this.field917[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field917[var184] = (byte) var185;
                                if (this.field936 != null) {
                                    this.field936.field10413 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field854 != null) {
                    for (int var178 = 0; var178 < this.field957; var178++) {
                        class582 var179 = this.field854[var178];
                        class556 var180 = this.field861[var178];
                        var180.field8070 = var180.field8070 & 0xFFFFFF | 255 - (this.field917[var179.field8303] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field941 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field941.length > var190) {
                        int[] var191 = this.field941[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field946 == null || (arg6 & this.field946[var193]) != 0) {
                                int var194 = this.field930[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFC2E) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field930[var193] = (short) class430.method2658(var200, class430.method2658(var199 << 7, var198 << 10));
                                if (this.field936 != null) {
                                    this.field936.field10413 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field854 != null) {
                    for (int var187 = 0; var187 < this.field957; var187++) {
                        class582 var188 = this.field854[var187];
                        class556 var189 = this.field861[var187];
                        var189.field8070 = class519.field7479[this.field930[var188.field8303] & 0xFFFF] & 0xFFFFFF | var189.field8070 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field940 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field940.length > var202) {
                        int[] var203 = this.field940[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class556 var205 = this.field861[var203[var204]];
                            var205.field8077 += arg3;
                            var205.field8074 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field940 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field940.length > var207) {
                        int[] var208 = this.field940[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class556 var210 = this.field861[var208[var209]];
                            var210.field8072 = var210.field8072 * arg2 >> 7;
                            var210.field8083 = var210.field8083 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field940 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field940.length > var212) {
                    int[] var213 = this.field940[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class556 var215 = this.field861[var213[var214]];
                        var215.field8076 = var215.field8076 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "ia", descriptor = "(SS)V")
    public final void method486(short arg0, short arg1) {
        field890++;
        for (int var3 = 0; var3 < this.field883; var3++) {
            if (this.field930[var3] == arg0) {
                this.field930[var3] = arg1;
            }
        }
        if (this.field854 != null) {
            for (int var4 = 0; var4 < this.field957; var4++) {
                class582 var5 = this.field854[var4];
                class556 var6 = this.field861[var4];
                var6.field8070 = var6.field8070 & 0xFF000000 | class519.field7479[this.field930[var5.field8303] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field936 != null) {
            this.field936.field10413 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "s", descriptor = "(I)V")
    public final void method487(int arg0) {
        this.field925 = arg0;
        field937++;
        this.field933 = true;
        if (this.field899 != null && (this.field925 & 0x10000) == 0) {
            this.field909 = this.field899.field1444;
            this.field891 = this.field899.field1439;
            this.field889 = this.field899.field1446;
            this.field893 = this.field899.field1442;
            this.field899 = null;
        }
        this.method505(true);
    }

    @OriginalMember(owner = "client!am", name = "VA", descriptor = "(I)V")
    public final void method488(int arg0) {
        field867++;
        int var2 = class125.field1736[arg0];
        int var3 = class125.field1729[arg0];
        for (int var4 = 0; var4 < this.field880; var4++) {
            int var5 = this.field849[var4] * var2 + (this.field897[var4] * var3) >> 14;
            this.field849[var4] = this.field849[var4] * var3 - (this.field897[var4] * var2) >> 14;
            this.field897[var4] = var5;
        }
        this.field841 = false;
        if (this.field956 != null) {
            this.field956.field10413 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "()V")
    public final void method489() {
        field892++;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
    private final void method490(byte arg0) {
        field871++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        if (arg0 < 79) {
            return;
        }
        for (int var10 = 0; var10 < this.field880; var10++) {
            int var11 = this.field897[var10];
            int var12 = this.field849[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field929[var10];
            if (var12 > var6) {
                var6 = var12;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field866 = (short) var6;
        this.field934 = (short) var4;
        this.field948 = (short) var3;
        this.field904 = (short) var2;
        this.field913 = (short) var7;
        this.field856 = (short) var5;
        this.field935 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field894 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field841 = true;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lsk;)V")
    public final void method491(class121 arg0) {
        field886++;
        class378 var2 = (class378) arg0;
        if (this.field920 != null) {
            for (int var3 = 0; var3 < this.field920.length; var3++) {
                class108 var4 = this.field920[var3];
                class108 var5 = var4;
                if (var4.field1553 != null) {
                    var5 = var4.field1553;
                }
                var5.field1556 = (int) ((float) this.field929[var4.field1558] * var2.field5487 + (float) this.field897[var4.field1558] * var2.field5464 + (float) this.field849[var4.field1558] * var2.field5465 + var2.field5494);
                var5.field1552 = (int) ((float) this.field929[var4.field1558] * var2.field5468 + (float) this.field897[var4.field1558] * var2.field5466 + (float) this.field849[var4.field1558] * var2.field5503 + var2.field5504);
                var5.field1546 = (int) ((float) this.field929[var4.field1558] * var2.field5499 + (float) this.field897[var4.field1558] * var2.field5476 + (float) this.field849[var4.field1558] * var2.field5475 + var2.field5490);
                var5.field1543 = (int) ((float) this.field929[var4.field1550] * var2.field5487 + (float) this.field897[var4.field1550] * var2.field5464 + (float) this.field849[var4.field1550] * var2.field5465 + var2.field5494);
                var5.field1540 = (int) ((float) this.field929[var4.field1550] * var2.field5468 + (float) this.field897[var4.field1550] * var2.field5466 + (float) this.field849[var4.field1550] * var2.field5503 + var2.field5504);
                var5.field1537 = (int) ((float) this.field929[var4.field1550] * var2.field5499 + (float) this.field897[var4.field1550] * var2.field5476 + (float) this.field849[var4.field1550] * var2.field5475 + var2.field5490);
                var5.field1554 = (int) ((float) this.field929[var4.field1547] * var2.field5487 + (float) this.field897[var4.field1547] * var2.field5464 + (float) this.field849[var4.field1547] * var2.field5465 + var2.field5494);
                var5.field1549 = (int) ((float) this.field929[var4.field1547] * var2.field5468 + (float) this.field897[var4.field1547] * var2.field5466 + (float) this.field849[var4.field1547] * var2.field5503 + var2.field5504);
                var5.field1548 = (int) ((float) this.field929[var4.field1547] * var2.field5499 + (float) this.field897[var4.field1547] * var2.field5476 + (float) this.field849[var4.field1547] * var2.field5475 + var2.field5490);
            }
        }
        if (this.field918 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field918.length; var6++) {
            class647 var7 = this.field918[var6];
            class647 var8 = var7;
            if (var7.field9326 != null) {
                var8 = var7.field9326;
            }
            if (var7.field9325 == null) {
                var7.field9325 = var2.method853();
            } else {
                var7.field9325.method841(var2);
            }
            var8.field9315 = (int) ((float) this.field929[var7.field9323] * var2.field5487 + (float) this.field897[var7.field9323] * var2.field5464 + (float) this.field849[var7.field9323] * var2.field5465 + var2.field5494);
            var8.field9318 = (int) ((float) this.field929[var7.field9323] * var2.field5468 + (float) this.field897[var7.field9323] * var2.field5466 + (float) this.field849[var7.field9323] * var2.field5503 + var2.field5504);
            var8.field9313 = (int) ((float) this.field929[var7.field9323] * var2.field5499 + (float) this.field897[var7.field9323] * var2.field5476 + (float) this.field849[var7.field9323] * var2.field5475 + var2.field5490);
        }
    }

    @OriginalMember(owner = "client!am", name = "aa", descriptor = "(SS)V")
    public final void method492(short arg0, short arg1) {
        field953++;
        class267 var3 = this.field947.field7881;
        for (int var4 = 0; var4 < this.field883; var4++) {
            if (this.field860[var4] == arg0) {
                this.field860[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class679 var7 = var3.method962(arg0 & 0xFFFF, 2904);
            var5 = var7.field9637;
            var6 = var7.field9651;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class679 var10 = var3.method962(arg1 & 0xFFFF, 2904);
            if (var10.field9638 != 0 || var10.field9640 != 0) {
                this.field855 = true;
            }
            var8 = var10.field9637;
            var9 = var10.field9651;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field854 != null) {
            for (int var11 = 0; var11 < this.field957; var11++) {
                class582 var12 = this.field854[var11];
                class556 var13 = this.field861[var11];
                var13.field8070 = class519.field7479[this.field930[var12.field8303] & 0xFFFF] & 0xFFFFFF | var13.field8070 & 0xFF000000;
            }
        }
        if (this.field936 != null) {
            this.field936.field10413 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field907++;
        if (arg0 < arg3 && arg0 < arg8 && arg0 < arg7) {
            return false;
        } else if (arg1 != 3) {
            return true;
        } else if (arg0 > arg3 && arg0 > arg8 && arg0 > arg7) {
            return false;
        } else if (arg5 > arg6 && arg6 < arg2 && arg4 > arg6) {
            return false;
        } else {
            return arg5 >= arg6 || arg2 >= arg6 || arg6 <= arg4;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IBI)V")
    public static final void method494(int arg0, byte arg1, int arg2) {
        field908++;
        if (arg1 == -49) {
            class503 var3 = class512.method3112(16, arg2, arg1 ^ 0xFFFFFFCF);
            var3.method3075((byte) 71);
            var3.field7310 = arg0;
        }
    }

    @OriginalMember(owner = "client!am", name = "da", descriptor = "()I")
    public final int method495() {
        field943++;
        return this.field942;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILsk;ZI)Z")
    public final boolean method496(int arg0, int arg1, class121 arg2, boolean arg3, int arg4) {
        field853++;
        return this.method513(-1, -28304, arg3, arg1, arg0, arg2, arg4);
    }

    @OriginalMember(owner = "client!am", name = "F", descriptor = "()Z")
    public final boolean method497() {
        field879++;
        return this.field864;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IFIIIJBFLfu;I)S")
    private final short method498(int arg0, float arg1, int arg2, int arg3, int arg4, long arg5, byte arg6, float arg7, class637 arg8, int arg9) {
        field839++;
        int var12 = this.field848[arg9];
        int var13 = this.field848[arg9 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field919[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class67.field1035[var15] == arg5) {
                return (short) (var16 - 1);
            }
        }
        this.field919[var14] = (short) (this.field881 + 1);
        int var17 = 43 / ((arg6 + 32) / 44);
        class67.field1035[var14] = arg5;
        this.field889[this.field881] = (short) arg4;
        this.field893[this.field881] = (short) arg2;
        this.field891[this.field881] = (short) arg0;
        this.field909[this.field881] = (byte) arg3;
        this.field916[this.field881] = arg1;
        this.field869[this.field881] = arg7;
        return (short) (this.field881++);
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "()V")
    public final void method499() {
        field927++;
        if (this.field881 <= 0 || this.field845 <= 0) {
            return;
        }
        this.method527(false, (byte) 91);
        if ((this.field932 & 0x10) == 0 && this.field955.field220 == null) {
            this.method515(false, (byte) -63);
        }
        this.method505(true);
    }

    @OriginalMember(owner = "client!am", name = "FA", descriptor = "(I)V")
    public final void method500(int arg0) {
        field888++;
        int var2 = class125.field1736[arg0];
        int var3 = class125.field1729[arg0];
        for (int var4 = 0; var4 < this.field880; var4++) {
            int var5 = this.field849[var4] * var3 - (this.field929[var4] * var2) >> 14;
            this.field929[var4] = this.field849[var4] * var2 + (this.field929[var4] * var3) >> 14;
            this.field849[var4] = var5;
        }
        this.field841 = false;
        if (this.field956 != null) {
            this.field956.field10413 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    private final void method501(int arg0) {
        if (this.field854 != null) {
            class378 var2 = this.field947.field4967;
            this.field947.method2128((byte) 107);
            this.field947.method235(!this.field864);
            this.field947.method2142(false, (byte) -120);
            this.field947.method2134(this.field947.field5099, null, this.field947.field5020, null, 32888);
            for (int var3 = 0; var3 < this.field957; var3++) {
                class582 var4 = this.field854[var3];
                class556 var5 = this.field861[var3];
                if (!var4.field8302 || !this.field947.method1242()) {
                    float var6 = (float) (this.field897[var4.field8306] + this.field897[var4.field8299] + this.field897[var4.field8300]) * 0.3333333F;
                    float var7 = (float) (this.field849[var4.field8306] + this.field849[var4.field8299] + this.field849[var4.field8300]) * 0.3333333F;
                    float var8 = (float) (this.field929[var4.field8306] + this.field929[var4.field8300] + this.field929[var4.field8299]) * 0.3333333F;
                    float var9 = class198.field2964 * var8 + class699.field9868 * var7 + class418.field5975 * var6 + class638.field9039;
                    float var10 = class633.field8936 * var8 + class38.field509 * var7 + class206.field3108 * var6 + class699.field9866;
                    float var11 = class656.field9405 * var8 + class495.field7122 * var7 + class105.field1471 * var6 + class661.field9447;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field8307;
                    var2.method2348(var4.field8311 * var5.field8072 >> 7, var5.field8076, (float) var5.field8074 + var9 - (var9 * var12), (byte) 96, var11 * var12 - var11, var10 * var12 + ((float) var5.field8077 - var10), var4.field8305 * var5.field8083 >> 7);
                    this.field947.method2197(var2, false);
                    int var13 = var5.field8070;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field947.method2176(var4.field8308, 76);
                    this.field947.method2138(27032, var4.field8304);
                    this.field947.method2162(119, 0, 7, 4);
                }
            }
            this.field947.method235(true);
            this.field947.method2130((byte) 110);
        }
        if (arg0 <= -62) {
            field843++;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()[Lvea;")
    public final class647[] method502() {
        field954++;
        return this.field918;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lsk;Lnl;II)V")
    public final void method503(class121 arg0, class373 arg1, int arg2, int arg3) {
        field900++;
        if (this.field881 == 0) {
            return;
        }
        class378 var5 = this.field947.field4998;
        if (!this.field841) {
            this.method490((byte) 122);
        }
        class378 var6 = (class378) arg0;
        class661.field9447 = var5.field5499 * var6.field5490 + var5.field5476 * var6.field5494 + var5.field5475 * var6.field5504 + var5.field5490;
        class495.field7122 = var5.field5499 * var6.field5475 + var5.field5476 * var6.field5465 + var5.field5475 * var6.field5503;
        float var7 = (float) this.field948 * class495.field7122 + class661.field9447;
        float var8 = (float) this.field866 * class495.field7122 + class661.field9447;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) this.field935 + var7;
            var10 = var8 - (float) this.field935;
        } else {
            var9 = (float) this.field935 + var8;
            var10 = (float) (-this.field935) + var7;
        }
        if ((var10 >= this.field947.field5053) || (var9 <= (float) this.field947.field5043)) {
            return;
        }
        class638.field9039 = var5.field5487 * var6.field5490 + var5.field5465 * var6.field5504 + var5.field5464 * var6.field5494 + var5.field5494;
        class699.field9868 = var5.field5487 * var6.field5475 + var5.field5465 * var6.field5503 + var5.field5464 * var6.field5465;
        float var11 = (float) this.field948 * class699.field9868 + class638.field9039;
        float var12 = (float) this.field866 * class699.field9868 + class638.field9039;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field935 + var11) * (float) this.field947.field5067;
            var14 = ((float) (-this.field935) + var12) * (float) this.field947.field5067;
        } else {
            var14 = ((float) (-this.field935) + var11) * (float) this.field947.field5067;
            var13 = ((float) this.field935 + var12) * (float) this.field947.field5067;
        }
        if ((this.field947.field5115 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field947.field5106)) {
            return;
        }
        class38.field509 = var5.field5468 * var6.field5475 + var5.field5503 * var6.field5503 + var5.field5466 * var6.field5465;
        class699.field9866 = var5.field5468 * var6.field5490 + var5.field5503 * var6.field5504 + var5.field5466 * var6.field5494 + var5.field5504;
        float var15 = (float) this.field948 * class38.field509 + class699.field9866;
        float var16 = (float) this.field866 * class38.field509 + class699.field9866;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = ((float) this.field935 + var15) * (float) this.field947.field5042;
            var17 = ((float) (-this.field935) + var16) * (float) this.field947.field5042;
        } else {
            var17 = (var15 - (float) this.field935) * (float) this.field947.field5042;
            var18 = ((float) this.field935 + var16) * (float) this.field947.field5042;
        }
        if ((var17 / (float) arg2 >= this.field947.field5037) || (var18 / (float) arg2 <= this.field947.field5045)) {
            return;
        }
        if (arg1 != null || this.field854 != null) {
            class656.field9405 = var5.field5499 * var6.field5499 + var5.field5476 * var6.field5487 + var5.field5475 * var6.field5468;
            class105.field1471 = var5.field5499 * var6.field5476 + var5.field5476 * var6.field5464 + var5.field5475 * var6.field5466;
            class206.field3108 = var5.field5468 * var6.field5476 + var5.field5503 * var6.field5466 + var5.field5466 * var6.field5464;
            class633.field8936 = var5.field5468 * var6.field5499 + var5.field5503 * var6.field5468 + var5.field5466 * var6.field5487;
            class198.field2964 = var5.field5487 * var6.field5499 + var5.field5465 * var6.field5468 + var5.field5464 * var6.field5487;
            class418.field5975 = var5.field5487 * var6.field5476 + var5.field5465 * var6.field5466 + var5.field5464 * var6.field5464;
        }
        if (arg1 != null) {
            int var19 = this.field904 + this.field856 >> 1;
            int var20 = this.field934 + this.field913 >> 1;
            int var21 = (int) ((float) var20 * class198.field2964 + (float) this.field948 * class699.field9868 + (float) var19 * class418.field5975 + class638.field9039);
            int var22 = (int) ((float) var20 * class633.field8936 + (float) this.field948 * class38.field509 + (float) var19 * class206.field3108 + class699.field9866);
            int var23 = (int) ((float) var20 * class656.field9405 + (float) this.field948 * class495.field7122 + (float) var19 * class105.field1471 + class661.field9447);
            int var24 = (int) ((float) var20 * class198.field2964 + (float) this.field866 * class699.field9868 + (float) var19 * class418.field5975 + class638.field9039);
            int var25 = (int) ((float) var20 * class633.field8936 + (float) this.field866 * class38.field509 + (float) var19 * class206.field3108 + class699.field9866);
            arg1.field5408 = this.field947.field5067 * var24 / arg2 + this.field947.field5017;
            arg1.field5410 = this.field947.field5110 + (this.field947.field5042 * var22 / arg2);
            arg1.field5407 = this.field947.field5017 + (this.field947.field5067 * var21 / arg2);
            int var26 = (int) ((float) var20 * class656.field9405 + (float) this.field866 * class495.field7122 + (float) var19 * class105.field1471 + class661.field9447);
            arg1.field5411 = this.field947.field5042 * var25 / arg2 + this.field947.field5110;
            if (this.field947.field5043 <= var23 || this.field947.field5043 <= var26) {
                arg1.field5412 = (var21 + this.field935) * this.field947.field5067 / arg2 + this.field947.field5017 - arg1.field5407;
                arg1.field5409 = true;
            }
        }
        this.field947.method2189(1365, (float) arg2);
        this.field947.method2187((byte) -18);
        this.field947.method2119(var6, (byte) -128);
        this.method510(3);
        this.field947.method2130((byte) 110);
        this.method501(-79);
    }

    @OriginalMember(owner = "client!am", name = "r", descriptor = "()Z")
    public final boolean method504() {
        field938++;
        return this.field855;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    private final void method505(boolean arg0) {
        field939++;
        if (!this.field933) {
            return;
        }
        this.field933 = false;
        if (this.field920 == null && this.field918 == null && this.field854 == null) {
            if (this.field897 != null && !class119.method834(this.field925, this.field858, 28175)) {
                if (this.field956 != null && this.field956.field10413 == null) {
                    this.field933 = true;
                } else {
                    if (!this.field841) {
                        this.method490((byte) 108);
                    }
                    this.field897 = null;
                }
            }
            if (this.field849 != null && !class718.method4034(this.field925, this.field858, -125)) {
                if (this.field956 != null && this.field956.field10413 == null) {
                    this.field933 = true;
                } else {
                    if (!this.field841) {
                        this.method490((byte) 120);
                    }
                    this.field849 = null;
                }
            }
            if (this.field929 != null && !class524.method3187(458752, this.field858, this.field925)) {
                if (this.field956 != null && this.field956.field10413 == null) {
                    this.field933 = true;
                } else {
                    if (!this.field841) {
                        this.method490((byte) 108);
                    }
                    this.field929 = null;
                }
            }
        }
        if (this.field919 != null && this.field897 == null && this.field849 == null && this.field929 == null) {
            this.field848 = null;
            this.field919 = null;
        }
        if (this.field909 != null && !class99.method742(this.field858, (byte) -54, this.field925)) {
            if (this.field922 == null) {
                if (this.field936 != null && this.field936.field10413 == null) {
                    this.field933 = true;
                } else {
                    this.field889 = this.field893 = this.field891 = null;
                    this.field909 = null;
                }
            } else if (this.field922.field10413 == null) {
                this.field933 = true;
            } else {
                this.field909 = null;
                this.field889 = this.field893 = this.field891 = null;
            }
        }
        if (this.field930 != null && !class99.method741(this.field858, 91, this.field925)) {
            if (this.field936 != null && this.field936.field10413 == null) {
                this.field933 = true;
            } else {
                this.field930 = null;
            }
        }
        if (this.field917 != null && !class154.method1110(this.field925, this.field858, -1)) {
            if (this.field936 != null && this.field936.field10413 == null) {
                this.field933 = true;
            } else {
                this.field917 = null;
            }
        }
        if (this.field916 != null && !class468.method2823(this.field925, this.field858, 976261473)) {
            if (this.field875 != null && this.field875.field10413 == null) {
                this.field933 = true;
            } else {
                this.field916 = this.field869 = null;
            }
        }
        if (this.field860 != null && !class552.method3321(this.field925, this.field858, 28889)) {
            if (this.field936 != null && this.field936.field10413 == null) {
                this.field933 = true;
            } else {
                this.field860 = null;
            }
        }
        if (this.field884 != null && !class755.method4194(arg0, this.field925, this.field858)) {
            if (this.field955 != null && this.field955.field220 == null || this.field936 != null && this.field936.field10413 == null) {
                this.field933 = true;
            } else {
                this.field884 = this.field921 = this.field850 = null;
            }
        }
        if (this.field941 != null && !class631.method3624(this.field925, this.field858, -1)) {
            this.field946 = null;
            this.field941 = null;
        }
        if (!arg0) {
            this.field923 = null;
        }
        if (this.field910 != null && !class120.method839(this.field925, this.field858, (byte) 120)) {
            this.field910 = null;
            this.field926 = null;
        }
        if (this.field940 != null && !class36.method186(this.field858, (byte) 39, this.field925)) {
            this.field940 = null;
        }
        if (this.field842 != null && (this.field925 & 0x800) == 0 && (this.field925 & 0x40000) == 0) {
            this.field842 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "v", descriptor = "()V")
    public final void method506() {
        for (int var1 = 0; var1 < this.field880; var1++) {
            this.field929[var1] = -this.field929[var1];
        }
        field905++;
        for (int var2 = 0; var2 < this.field881; var2++) {
            this.field891[var2] = (short) (-this.field891[var2]);
        }
        for (int var3 = 0; var3 < this.field883; var3++) {
            short var4 = this.field884[var3];
            this.field884[var3] = this.field850[var3];
            this.field850[var3] = var4;
        }
        if (this.field922 == null && this.field936 != null) {
            this.field936.field10413 = null;
        }
        if (this.field922 != null) {
            this.field922.field10413 = null;
        }
        if (this.field955 != null) {
            this.field955.field220 = null;
        }
        this.field841 = false;
        if (this.field956 != null) {
            this.field956.field10413 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "ma", descriptor = "()I")
    public final int method507() {
        field949++;
        if (!this.field841) {
            this.method490((byte) 127);
        }
        return this.field894;
    }

    @OriginalMember(owner = "client!am", name = "P", descriptor = "(IIII)V")
    public final void method508(int arg0, int arg1, int arg2, int arg3) {
        field914++;
        if (arg0 == 0) {
            class160.field2293 = 0;
            int var5 = 0;
            class525.field7629 = 0;
            class412.field5877 = 0;
            for (int var6 = 0; var6 < this.field880; var6++) {
                class412.field5877 += this.field897[var6];
                class160.field2293 += this.field849[var6];
                var5++;
                class525.field7629 += this.field929[var6];
            }
            if (var5 > 0) {
                class412.field5877 = class412.field5877 / var5 + arg1;
                class160.field2293 = class160.field2293 / var5 + arg2;
                class525.field7629 = class525.field7629 / var5 + arg3;
            } else {
                class160.field2293 = arg2;
                class525.field7629 = arg3;
                class412.field5877 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field880; var7++) {
                this.field897[var7] += arg1;
                this.field849[var7] += arg2;
                this.field929[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field880; var8++) {
                this.field897[var8] -= class412.field5877;
                this.field849[var8] -= class160.field2293;
                this.field929[var8] -= class525.field7629;
                if (arg3 != 0) {
                    int var9 = class125.field1736[arg3];
                    int var10 = class125.field1729[arg3];
                    int var11 = this.field849[var8] * var9 + (this.field897[var8] * var10) + 16383 >> 14;
                    this.field849[var8] = this.field849[var8] * var10 + 16383 - (this.field897[var8] * var9) >> 14;
                    this.field897[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class125.field1736[arg1];
                    int var13 = class125.field1729[arg1];
                    int var14 = this.field849[var8] * var13 + 16383 - (this.field929[var8] * var12) >> 14;
                    this.field929[var8] = this.field929[var8] * var13 + this.field849[var8] * var12 + 16383 >> 14;
                    this.field849[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class125.field1736[arg2];
                    int var16 = class125.field1729[arg2];
                    int var17 = this.field897[var8] * var16 + this.field929[var8] * var15 + 16383 >> 14;
                    this.field929[var8] = this.field929[var8] * var16 + 16383 - (this.field897[var8] * var15) >> 14;
                    this.field897[var8] = var17;
                }
                this.field897[var8] += class412.field5877;
                this.field849[var8] += class160.field2293;
                this.field929[var8] += class525.field7629;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field880; var18++) {
                this.field897[var18] -= class412.field5877;
                this.field849[var18] -= class160.field2293;
                this.field929[var18] -= class525.field7629;
                this.field897[var18] = this.field897[var18] * arg1 / 128;
                this.field849[var18] = this.field849[var18] * arg2 / 128;
                this.field929[var18] = this.field929[var18] * arg3 / 128;
                this.field897[var18] += class412.field5877;
                this.field849[var18] += class160.field2293;
                this.field929[var18] += class525.field7629;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field883; var19++) {
                int var23 = (this.field917[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field917[var19] = (byte) var23;
            }
            if (this.field936 != null) {
                this.field936.field10413 = null;
            }
            if (this.field854 != null) {
                for (int var20 = 0; var20 < this.field957; var20++) {
                    class582 var21 = this.field854[var20];
                    class556 var22 = this.field861[var20];
                    var22.field8070 = 255 - (this.field917[var21.field8303] & 0xFF) << 24 | var22.field8070 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field883; var24++) {
                int var28 = this.field930[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3A9) >> 7;
                int var31 = arg2 / 4 + var30;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = var28 & 0x7F;
                int var34 = arg3 + var33;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field930[var24] = (short) class430.method2658(var34, class430.method2658(var31 << 7, var32 << 10));
            }
            if (this.field936 != null) {
                this.field936.field10413 = null;
            }
            if (this.field854 != null) {
                for (int var25 = 0; var25 < this.field957; var25++) {
                    class582 var26 = this.field854[var25];
                    class556 var27 = this.field861[var25];
                    var27.field8070 = class519.field7479[this.field930[var26.field8303] & 0xFFFF] & 0xFFFFFF | var27.field8070 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field957; var35++) {
                class556 var36 = this.field861[var35];
                var36.field8074 += arg1;
                var36.field8077 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field957; var37++) {
                class556 var38 = this.field861[var37];
                var38.field8072 = var38.field8072 * arg1 >> 7;
                var38.field8083 = var38.field8083 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field957; var39++) {
                class556 var40 = this.field861[var39];
                var40.field8076 = var40.field8076 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BIZ)Lka;")
    public final class282 method509(byte arg0, int arg1, boolean arg2) {
        field877++;
        class55 var4;
        class55 var5;
        if (arg0 == 1) {
            var4 = this.field947.field5090;
            var5 = this.field947.field5011;
        } else if (arg0 == 2) {
            var5 = this.field947.field5038;
            var4 = this.field947.field5108;
        } else if (arg0 == 3) {
            var5 = this.field947.field5086;
            var4 = this.field947.field5039;
        } else if (arg0 == 4) {
            var5 = this.field947.field5056;
            var4 = this.field947.field5103;
        } else if (arg0 == 5) {
            var5 = this.field947.field5066;
            var4 = this.field947.field5022;
        } else {
            var5 = var4 = new class55(this.field947);
        }
        return this.method535(var4, var5, false, arg2, arg0 != 0, arg1);
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    private final void method510(int arg0) {
        field945++;
        if (this.field845 == 0) {
            return;
        }
        if (this.field932 != 0) {
            this.method527(true, (byte) 91);
        }
        this.method527(false, (byte) 91);
        if (arg0 != 3) {
            this.field918 = null;
        }
        if (this.field955 != null) {
            if (this.field955.field220 == null) {
                this.method515((this.field932 & 0x10) != 0, (byte) -63);
            }
            if (this.field955.field220 != null) {
                this.field947.method2142(this.field922 != null, (byte) -117);
                this.field947.method2134(this.field956, this.field936, this.field875, this.field922, 32888);
                int var2 = this.field842.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field842[var3];
                    int var5 = this.field842[var3 + 1];
                    int var6 = this.field860[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field947.method2157((byte) 113, this.field922 != null, var6);
                    this.field947.method2135(4, this.field955.field220, var4 * 3, (var5 - var4) * 3, -42);
                }
            }
        }
        this.method505(true);
    }

    @OriginalMember(owner = "client!am", name = "fa", descriptor = "()I")
    public final int method511() {
        if (!this.field841) {
            this.method490((byte) 83);
        }
        field915++;
        return this.field948;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method512(class282 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field902++;
        class55 var6 = (class55) arg0;
        if (this.field883 == 0 || var6.field883 == 0) {
            return;
        }
        int var7 = var6.field880;
        int[] var8 = var6.field897;
        int[] var9 = var6.field849;
        int[] var10 = var6.field929;
        short[] var11 = var6.field889;
        short[] var12 = var6.field893;
        short[] var13 = var6.field891;
        byte[] var14 = var6.field909;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field899 == null) {
            var15 = null;
            var17 = null;
            var16 = null;
            var18 = null;
        } else {
            var15 = this.field899.field1446;
            var16 = this.field899.field1444;
            var17 = this.field899.field1442;
            var18 = this.field899.field1439;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field899 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field899.field1444;
            var19 = var6.field899.field1446;
            var22 = var6.field899.field1439;
            var20 = var6.field899.field1442;
        }
        int[] var23 = var6.field848;
        short[] var24 = var6.field919;
        if (!var6.field841) {
            var6.method490((byte) 82);
        }
        short var25 = var6.field948;
        short var26 = var6.field866;
        short var27 = var6.field904;
        short var28 = var6.field856;
        short var29 = var6.field934;
        short var30 = var6.field913;
        for (int var31 = 0; var31 < this.field880; var31++) {
            int var32 = this.field849[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field897[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field929[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field848[var31];
                        int var37 = this.field848[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field919[var38] - 1;
                            if (var35 == -1 || this.field909[var35] != 0) {
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
                                        if (var15 == null) {
                                            this.field899 = new class100();
                                            var15 = this.field899.field1446 = class559.method3354(57, this.field889);
                                            var17 = this.field899.field1442 = class559.method3354(64, this.field893);
                                            var18 = this.field899.field1439 = class559.method3354(121, this.field891);
                                            var16 = this.field899.field1444 = class202.method1435((byte) 24, this.field909);
                                        }
                                        if (var19 == null) {
                                            class100 var44 = var6.field899 = new class100();
                                            var19 = var44.field1446 = class559.method3354(116, var11);
                                            var20 = var44.field1442 = class559.method3354(123, var12);
                                            var22 = var44.field1439 = class559.method3354(115, var13);
                                            var21 = var44.field1444 = class202.method1435((byte) 24, var14);
                                        }
                                        short var45 = this.field889[var35];
                                        short var46 = this.field893[var35];
                                        short var47 = this.field891[var35];
                                        byte var48 = this.field909[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var22[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        short var53 = var12[var41];
                                        int var54 = this.field848[var31 + 1];
                                        byte var55 = var14[var41];
                                        short var56 = var13[var41];
                                        short var57 = var11[var41];
                                        int var58 = this.field848[var31];
                                        for (int var59 = var58; var59 < var54; var59++) {
                                            int var60 = this.field919[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var15[var60] += var57;
                                                var17[var60] += var53;
                                                var18[var60] += var56;
                                                var16[var60] += var55;
                                            }
                                        }
                                        if (this.field922 == null && this.field936 != null) {
                                            this.field936.field10413 = null;
                                        }
                                        if (this.field922 != null) {
                                            this.field922.field10413 = null;
                                        }
                                        if (var6.field922 == null && var6.field936 != null) {
                                            var6.field936.field10413 = null;
                                        }
                                        if (var6.field922 != null) {
                                            var6.field922.field10413 = null;
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

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZIILsk;I)Z")
    private final boolean method513(int arg0, int arg1, boolean arg2, int arg3, int arg4, class121 arg5, int arg6) {
        field896++;
        class378 var8 = (class378) arg5;
        if (arg1 != -28304) {
            this.field854 = null;
        }
        class378 var9 = this.field947.field4998;
        float var10 = var8.field5490 * var9.field5487 + var8.field5504 * var9.field5465 + var8.field5494 * var9.field5464 + var9.field5494;
        float var11 = var8.field5490 * var9.field5468 + var8.field5504 * var9.field5503 + var8.field5494 * var9.field5466 + var9.field5504;
        class198.field2964 = var8.field5499 * var9.field5487 + var8.field5487 * var9.field5464 + var8.field5468 * var9.field5465;
        class656.field9405 = var8.field5499 * var9.field5499 + var8.field5487 * var9.field5476 + var8.field5468 * var9.field5475;
        class105.field1471 = var8.field5476 * var9.field5499 + var8.field5466 * var9.field5475 + var8.field5464 * var9.field5476;
        class418.field5975 = var8.field5476 * var9.field5487 + var8.field5466 * var9.field5465 + var8.field5464 * var9.field5464;
        class699.field9868 = var8.field5475 * var9.field5487 + var8.field5503 * var9.field5465 + var8.field5465 * var9.field5464;
        float var12 = var8.field5490 * var9.field5499 + var8.field5504 * var9.field5475 + var8.field5494 * var9.field5476 + var9.field5490;
        class38.field509 = var8.field5475 * var9.field5468 + var8.field5503 * var9.field5503 + var8.field5465 * var9.field5466;
        class206.field3108 = var8.field5476 * var9.field5468 + var8.field5466 * var9.field5503 + var8.field5464 * var9.field5466;
        class633.field8936 = var8.field5499 * var9.field5468 + var8.field5487 * var9.field5466 + var8.field5468 * var9.field5503;
        class495.field7122 = var8.field5475 * var9.field5499 + var8.field5503 * var9.field5475 + var8.field5465 * var9.field5476;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field947.field5067;
        int var19 = this.field947.field5042;
        if (!this.field841) {
            this.method490((byte) 120);
        }
        int var20 = this.field856 - this.field904 >> 1;
        int var21 = this.field866 - this.field948 >> 1;
        int var22 = this.field913 - this.field934 >> 1;
        int var23 = this.field904 + var20;
        int var24 = this.field948 + var21;
        int var25 = this.field934 + var22;
        int var26 = var23 - (var20 << arg6);
        int var27 = var24 - (var21 << arg6);
        int var28 = var25 - (var22 << arg6);
        int var29 = (var20 << arg6) + var23;
        int var30 = (var21 << arg6) + var24;
        int var31 = (var22 << arg6) + var25;
        class98.field1399[0] = var26;
        class729.field10237[0] = var27;
        class299.field4084[0] = var28;
        class98.field1399[1] = var29;
        class729.field10237[1] = var27;
        class299.field4084[1] = var28;
        class98.field1399[2] = var26;
        class729.field10237[2] = var30;
        class98.field1399[3] = var29;
        class299.field4084[2] = var28;
        class729.field10237[3] = var30;
        class98.field1399[4] = var26;
        class299.field4084[3] = var28;
        class729.field10237[4] = var27;
        class98.field1399[5] = var29;
        class299.field4084[4] = var31;
        class729.field10237[5] = var27;
        class299.field4084[5] = var31;
        class98.field1399[6] = var26;
        class729.field10237[6] = var30;
        class299.field4084[6] = var31;
        class98.field1399[7] = var29;
        class729.field10237[7] = var30;
        class299.field4084[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class98.field1399[var32];
            float var54 = (float) class299.field4084[var32];
            float var55 = (float) class729.field10237[var32];
            float var56 = class656.field9405 * var54 + class495.field7122 * var55 + class105.field1471 * var53 + var12;
            float var57 = class633.field8936 * var54 + class38.field509 * var55 + class206.field3108 * var53 + var11;
            float var58 = class198.field2964 * var54 + class699.field9868 * var55 + class418.field5975 * var53 + var10;
            if ((float) this.field947.field5043 <= var56) {
                if (arg0 > 0) {
                    var56 = arg0;
                }
                float var59 = (float) var18 * var58 / var56 + (float) this.field947.field5017;
                if (var59 > var15) {
                    var15 = var59;
                }
                if (var59 < var14) {
                    var14 = var59;
                }
                float var60 = (float) var19 * var57 / var56 + (float) this.field947.field5110;
                var13 = true;
                if (var16 > var60) {
                    var16 = var60;
                }
                if (var60 > var17) {
                    var17 = var60;
                }
            }
        }
        if (var13 && (float) arg4 > var14 && (float) arg4 < var15 && var16 < (float) arg3 && var17 > (float) arg3) {
            if (arg2) {
                return true;
            }
            if (this.field947.field5118.length < this.field881) {
                this.field947.field5121 = new int[this.field881];
                this.field947.field5118 = new int[this.field881];
            }
            int[] var33 = this.field947.field5118;
            int[] var34 = this.field947.field5121;
            for (int var35 = 0; var35 < this.field880; var35++) {
                float var37 = (float) this.field929[var35];
                float var38 = (float) this.field897[var35];
                float var39 = (float) this.field849[var35];
                float var40 = class656.field9405 * var37 + class495.field7122 * var39 + class105.field1471 * var38 + var12;
                float var41 = class198.field2964 * var37 + class699.field9868 * var39 + class418.field5975 * var38 + var10;
                float var42 = class633.field8936 * var37 + class38.field509 * var39 + class206.field3108 * var38 + var11;
                if ((float) this.field947.field5043 <= var40) {
                    if (arg0 > 0) {
                        var40 = arg0;
                    }
                    int var43 = (int) ((float) var18 * var41 / var40 + (float) this.field947.field5017);
                    int var44 = (int) ((float) var19 * var42 / var40 + (float) this.field947.field5110);
                    int var45 = this.field848[var35];
                    int var46 = this.field848[var35 + 1];
                    for (int var47 = var45; var47 < var46; var47++) {
                        int var48 = this.field919[var47] - 1;
                        if (var48 == -1) {
                            break;
                        }
                        var33[var48] = var43;
                        var34[var48] = var44;
                    }
                } else {
                    int var49 = this.field848[var35];
                    int var50 = this.field848[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field919[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[this.field919[var51] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field883; var36++) {
                if (var33[this.field884[var36]] != -999999 && var33[this.field921[var36]] != -999999 && var33[this.field850[var36]] != -999999 && this.method493(arg3, 3, var33[this.field921[var36]], var34[this.field884[var36]], var33[this.field850[var36]], var33[this.field884[var36]], arg4, var34[this.field850[var36]], var34[this.field921[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!am", name = "na", descriptor = "()I")
    public final int method514() {
        field882++;
        if (!this.field841) {
            this.method490((byte) 110);
        }
        return this.field935;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZB)V")
    private final void method515(boolean arg0, byte arg1) {
        if ((this.field845 * 6) > this.field947.field5093.field6800.length) {
            this.field947.field5093 = new class212((this.field845 + 100) * 6);
        } else {
            this.field947.field5093.field6864 = 0;
        }
        if (arg1 != -63) {
            return;
        }
        field952++;
        class212 var3 = this.field947.field5093;
        if (this.field947.field5047) {
            for (int var5 = 0; var5 < this.field845; var5++) {
                var3.method2862(this.field884[var5], arg1 - 1166933593);
                var3.method2862(this.field921[var5], arg1 ^ 0x458DFEA9);
                var3.method2862(this.field850[var5], arg1 ^ 0x458DFEA9);
            }
        } else {
            for (int var4 = 0; var4 < this.field845; var4++) {
                var3.method2918(this.field884[var4], (byte) 90);
                var3.method2918(this.field921[var4], (byte) 105);
                var3.method2918(this.field850[var4], (byte) 88);
            }
        }
        if (var3.field6864 == 0) {
            return;
        }
        if (arg0) {
            if (this.field844 == null) {
                this.field844 = this.field947.method2139(true, 5123, var3.field6864, true, var3.field6800);
            } else {
                this.field844.method821(var3.field6864, 5123, var3.field6800, (byte) -64);
            }
            this.field955.field220 = this.field844;
        } else {
            this.field955.field220 = this.field947.method2139(true, 5123, var3.field6864, false, var3.field6800);
        }
        if (!arg0) {
            this.field933 = true;
        }
    }

    @OriginalMember(owner = "client!am", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method516(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6) {
        field911++;
        if (!this.field841) {
            this.method490((byte) 85);
        }
        int var8 = this.field904 + arg4;
        int var9 = this.field856 + arg4;
        int var10 = this.field934 + arg6;
        int var11 = this.field913 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (arg2.field4675 + var9 >> arg2.field4674) >= arg2.field4679 || var10 < 0 || arg2.field4675 + var11 >> arg2.field4674 >= arg2.field4672) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4679 <= arg3.field4675 + var9 >> arg3.field4674 || var10 < 0 || (var11 + arg3.field4675 >> arg3.field4674) >= arg3.field4672) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4674;
            int var13 = var9 + arg2.field4675 - 1 >> arg2.field4674;
            int var14 = var10 >> arg2.field4674;
            int var15 = -(-arg2.field4675 - var11) - 1 >> arg2.field4674;
            if (arg5 == arg2.method2087(73, var12, var14) && arg2.method2087(111, var13, var14) == arg5 && arg5 == arg2.method2087(80, var12, var15) && arg5 == arg2.method2087(91, var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field880; var16++) {
                this.field849[var16] = this.field849[var16] + arg2.method2089(26448, this.field897[var16] + arg4, this.field929[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field948;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field880; var18++) {
                int var19 = (this.field849[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field849[var18] += (arg2.method2089(26448, this.field897[var18] + arg4, this.field929[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var29 = (arg1 & 0xFF) * 4;
            int var30 = ((arg1 & 0xFFC7) >> 8) * 4;
            int var31 = arg1 >> 16 & 0xFF << 6;
            int var32 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var29 >> 1) < 0 || ((var29 >> 1) + arg2.field4675 + arg4) >= (arg2.field4679 << arg2.field4674) || (arg6 - (var30 >> 1)) < 0 || (arg2.field4672 << arg2.field4674) <= ((var30 >> 1) + arg2.field4675 + arg6)) {
                return;
            }
            this.method1803((byte) -33, arg6, arg5, arg2, arg4, var32, var30, var31, var29);
        } else if (arg0 == 4) {
            int var27 = this.field866 - this.field948;
            for (int var28 = 0; var28 < this.field880; var28++) {
                this.field849[var28] = var27 + (this.field849[var28] + arg3.method2089(26448, this.field897[var28] + arg4, this.field929[var28] - -arg6)) - arg5;
            }
        } else if (arg0 == 5) {
            int var20 = this.field866 - this.field948;
            for (int var21 = 0; var21 < this.field880; var21++) {
                int var22 = this.field897[var21] + arg4;
                int var23 = this.field929[var21] + arg6;
                int var24 = arg2.method2089(26448, var22, var23);
                int var25 = arg3.method2089(26448, var22, var23);
                int var26 = var24 - arg1 - var25;
                this.field849[var21] = ((this.field849[var21] << 8) / var20 * var26 >> 8) + var24 - arg5;
            }
        }
        if (this.field956 != null) {
            this.field956.field10413 = null;
        }
        this.field841 = false;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "()[Lqv;")
    public final class108[] method517() {
        field872++;
        return this.field920;
    }

    @OriginalMember(owner = "client!am", name = "O", descriptor = "(III)V")
    public final void method518(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field880; var4++) {
            if (arg0 != 128) {
                this.field897[var4] = this.field897[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field849[var4] = this.field849[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field929[var4] = this.field929[var4] * arg2 >> 7;
            }
        }
        field852++;
        this.field841 = false;
        if (this.field956 != null) {
            this.field956.field10413 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "G", descriptor = "()I")
    public final int method519() {
        field878++;
        if (!this.field841) {
            this.method490((byte) 112);
        }
        return this.field913;
    }

    @OriginalMember(owner = "client!am", name = "k", descriptor = "(I)V")
    public final void method520(int arg0) {
        field873++;
        int var2 = class125.field1736[arg0];
        int var3 = class125.field1729[arg0];
        for (int var4 = 0; var4 < this.field880; var4++) {
            int var7 = this.field929[var4] * var2 + (this.field897[var4] * var3) >> 14;
            this.field929[var4] = this.field929[var4] * var3 - (this.field897[var4] * var2) >> 14;
            this.field897[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field881; var5++) {
            int var6 = this.field891[var5] * var2 + (this.field889[var5] * var3) >> 14;
            this.field891[var5] = (short) (this.field891[var5] * var3 - (this.field889[var5] * var2) >> 14);
            this.field889[var5] = (short) var6;
        }
        if (this.field922 == null && this.field936 != null) {
            this.field936.field10413 = null;
        }
        if (this.field922 != null) {
            this.field922.field10413 = null;
        }
        this.field841 = false;
        if (this.field956 != null) {
            this.field956.field10413 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "WA", descriptor = "()I")
    public final int method521() {
        field862++;
        return this.field870;
    }

    @OriginalMember(owner = "client!am", name = "RA", descriptor = "()I")
    public final int method522() {
        if (!this.field841) {
            this.method490((byte) 120);
        }
        field868++;
        return this.field856;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lsk;IZ)V")
    public final void method523(class121 arg0, int arg1, boolean arg2) {
        field840++;
        if (this.field926 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field880; var5++) {
            if ((this.field926[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method855(this.field897[var5], this.field849[var5], this.field929[var5], var4);
                } else {
                    arg0.method859(this.field897[var5], this.field849[var5], this.field929[var5], var4);
                }
                this.field897[var5] = var4[0];
                this.field849[var5] = var4[1];
                this.field929[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)V")
    public final void method524(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field883; var5++) {
            int var9 = this.field930[var5] & 0xFFFF;
            int var10 = (var9 & 0xFE53) >> 10;
            int var11 = (var9 & 0x3CE) >> 7;
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
            this.field930[var5] = (short) class430.method2658(var12, class430.method2658(var11 << 7, var10 << 10));
        }
        field874++;
        if (this.field854 != null) {
            for (int var6 = 0; var6 < this.field957; var6++) {
                class582 var7 = this.field854[var6];
                class556 var8 = this.field861[var6];
                var8.field8070 = var8.field8070 & 0xFF000000 | class519.field7479[this.field930[var7.field8303] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field936 != null) {
            this.field936.field10413 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "LA", descriptor = "(I)V")
    public final void method525(int arg0) {
        this.field942 = (short) arg0;
        if (this.field936 != null) {
            this.field936.field10413 = null;
        }
        field898++;
        if (this.field922 != null) {
            this.field922.field10413 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lsl;B)V")
    public static final void method526(class479 arg0, byte arg1) {
        if (arg1 != -49) {
            method526(null, (byte) 43);
        }
        field944++;
        byte[] var2 = new byte[24];
        if (class299.field4083 != null) {
            try {
                class299.field4083.method1290(arg1 ^ 0xFFFFFFB0, 0L);
                class299.field4083.method1288(var2, 0);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2898(0, var2, (byte) -82, 24);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(ZB)V")
    private final void method527(boolean arg0, byte arg1) {
        field846++;
        boolean var3 = this.field936 != null && this.field936.field10413 == null;
        boolean var4 = this.field922 != null && this.field922.field10413 == null;
        boolean var5 = this.field956 != null && this.field956.field10413 == null;
        if (arg1 != 91) {
            this.method488(-64);
        }
        boolean var6 = this.field875 != null && this.field875.field10413 == null;
        if (arg0) {
            var4 &= (this.field932 & 0x4) != 0;
            var3 &= (this.field932 & 0x2) != 0;
            var6 &= (this.field932 & 0x8) != 0;
            var5 &= (this.field932 & 0x1) != 0;
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
        if (this.field881 * var7 > this.field947.field5093.field6800.length) {
            this.field947.field5093 = new class212((this.field881 + 100) * var7);
        } else {
            this.field947.field5093.field6864 = 0;
        }
        class212 var12 = this.field947.field5093;
        if (var5) {
            if (this.field947.field5047) {
                for (int var21 = 0; var21 < this.field880; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field897[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field849[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field929[var21]);
                    int var25 = this.field848[var21];
                    int var26 = this.field848[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field919[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field6864 = var7 * var28;
                        var12.method2926((byte) -125, var22);
                        var12.method2926((byte) -127, var23);
                        var12.method2926((byte) -118, var24);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field880; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field897[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field849[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field929[var13]);
                    int var17 = this.field848[var13];
                    int var18 = this.field848[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field919[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field6864 = var7 * var20;
                        var12.method2922(var14, false);
                        var12.method2922(var15, false);
                        var12.method2922(var16, false);
                    }
                }
            }
        }
        if (var3) {
            if (this.field922 == null) {
                byte[] var31;
                short[] var32;
                short[] var33;
                short[] var34;
                if (this.field899 == null) {
                    var31 = this.field909;
                    var32 = this.field891;
                    var33 = this.field889;
                    var34 = this.field893;
                } else {
                    var33 = this.field899.field1446;
                    var32 = this.field899.field1439;
                    var31 = this.field899.field1444;
                    var34 = this.field899.field1442;
                }
                float var35 = this.field947.field5111[0];
                float var36 = this.field947.field5111[1];
                float var37 = this.field947.field5111[2];
                float var38 = this.field947.field5063;
                float var39 = this.field947.field5109 * 768.0F / (float) this.field942;
                float var40 = this.field947.field5019 * 768.0F / (float) this.field942;
                for (int var41 = 0; var41 < this.field883; var41++) {
                    int var42 = this.method532(this.field930[var41], this.field870, this.field860[var41], false, this.field917[var41]);
                    float var43 = (float) (var42 >> 8 & 0xFF) * this.field947.field5077;
                    short var44 = this.field884[var41];
                    float var45 = (float) (var42 >>> 24) * this.field947.field5092;
                    float var46 = (float) (var42 >> 16 & 0xFF) * this.field947.field5029;
                    short var47 = (short) var31[var44];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var32[var44] * var37 + (float) var33[var44] * var35 + (float) var34[var44] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var32[var44] * var37 + (float) var33[var44] * var35 + (float) var34[var44] * var36) / (float) (var47 * 256);
                    }
                    float var49 = var38 + var48 * ((var48 < 0.0F) ? var40 : var39);
                    int var50 = (int) (var45 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var51 = (int) (var46 * var49);
                    int var52 = (int) (var43 * var49);
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
                    var12.field6864 = var7 * var44 + var9;
                    var12.method2881(var50, (byte) 116);
                    var12.method2881(var51, (byte) 113);
                    var12.method2881(var52, (byte) 119);
                    var12.method2881(255 - (this.field917[var41] & 0xFF), (byte) 112);
                    short var53 = this.field921[var41];
                    short var54 = (short) var31[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var32[var53] * var37 + (float) var33[var53] * var35 + (float) var34[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var32[var53] * var37 + (float) var33[var53] * var35 + (float) var34[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = (var55 < 0.0F ? var40 : var39) * var55 + var38;
                    int var57 = (int) (var45 * var56);
                    int var58 = (int) (var46 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var59 = (int) (var43 * var56);
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
                    var12.field6864 = var7 * var53 + var9;
                    var12.method2881(var57, (byte) 114);
                    var12.method2881(var58, (byte) 117);
                    var12.method2881(var59, (byte) 111);
                    var12.method2881(255 - (this.field917[var41] & 0xFF), (byte) 118);
                    short var60 = this.field850[var41];
                    short var61 = (short) var31[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var32[var60] * var37 + (float) var33[var60] * var35 + (float) var34[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var32[var60] * var37 + (float) var33[var60] * var35 + (float) var34[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = var62 * (var62 < 0.0F ? var40 : var39) + var38;
                    int var64 = (int) (var45 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var46 * var63);
                    int var66 = (int) (var43 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.field6864 = var9 + (var7 * var60);
                    var12.method2881(var64, (byte) 112);
                    var12.method2881(var65, (byte) 110);
                    var12.method2881(var66, (byte) 124);
                    var12.method2881(255 - (this.field917[var41] & 0xFF), (byte) 116);
                }
            } else {
                for (int var29 = 0; var29 < this.field883; var29++) {
                    int var30 = this.method532(this.field930[var29], this.field870, this.field860[var29], false, this.field917[var29]);
                    var12.field6864 = this.field884[var29] * var7 + var9;
                    var12.method2926((byte) -117, var30);
                    var12.field6864 = this.field921[var29] * var7 + var9;
                    var12.method2926((byte) -125, var30);
                    var12.field6864 = this.field850[var29] * var7 + var9;
                    var12.method2926((byte) -125, var30);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field899 == null) {
                var67 = this.field909;
                var68 = this.field893;
                var69 = this.field889;
                var70 = this.field891;
            } else {
                var68 = this.field899.field1442;
                var70 = this.field899.field1439;
                var69 = this.field899.field1446;
                var67 = this.field899.field1444;
            }
            float var71 = 3.0F / (float) this.field942;
            float var72 = 3.0F / (float) (this.field942 / 2 + this.field942);
            var12.field6864 = var10;
            if (this.field947.field5047) {
                for (int var76 = 0; var76 < this.field881; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1502((float) var69[var76] * var72, (byte) 94);
                        var12.method1502((float) var68[var76] * var72, (byte) 90);
                        var12.method1502((float) var70[var76] * var72, (byte) 73);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1502((float) var69[var76] * var78, (byte) 107);
                        var12.method1502((float) var68[var76] * var78, (byte) 88);
                        var12.method1502((float) var70[var76] * var78, (byte) 86);
                    }
                    var12.field6864 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field881; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1501((float) var69[var73] * var72, (byte) -44);
                        var12.method1501((float) var68[var73] * var72, (byte) -44);
                        var12.method1501((float) var70[var73] * var72, (byte) -82);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1501((float) var69[var73] * var75, (byte) -108);
                        var12.method1501((float) var68[var73] * var75, (byte) -106);
                        var12.method1501((float) var70[var73] * var75, (byte) -78);
                    }
                    var12.field6864 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field6864 = var11;
            if (this.field947.field5047) {
                for (int var80 = 0; var80 < this.field881; var80++) {
                    var12.method1502(this.field916[var80], (byte) 99);
                    var12.method1502(this.field869[var80], (byte) 76);
                    var12.field6864 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field881; var79++) {
                    var12.method1501(this.field916[var79], (byte) -64);
                    var12.method1501(this.field869[var79], (byte) -90);
                    var12.field6864 += var7 - 8;
                }
            }
        }
        var12.field6864 = this.field881 * var7;
        class52 var81;
        if (arg0) {
            if (this.field923 == null) {
                this.field923 = this.field947.method2178(true, var12.field6864, var12.field6800, var7, true);
            } else {
                this.field923.method474(true, var7, var12.field6864, var12.field6800);
            }
            var81 = this.field923;
            this.field932 = 0;
        } else {
            var81 = this.field947.method2178(false, var12.field6864, var12.field6800, var7, true);
            this.field933 = true;
        }
        if (var5) {
            this.field956.field10410 = var8;
            this.field956.field10413 = var81;
        }
        if (var6) {
            this.field875.field10410 = var11;
            this.field875.field10413 = var81;
        }
        if (var3) {
            this.field936.field10413 = var81;
            this.field936.field10410 = var9;
        }
        if (var4) {
            this.field922.field10413 = var81;
            this.field922.field10410 = var10;
        }
    }

    @OriginalMember(owner = "client!am", name = "ua", descriptor = "()I")
    public final int method528() {
        field906++;
        return this.field925;
    }

    @OriginalMember(owner = "client!am", name = "H", descriptor = "(III)V")
    public final void method529(int arg0, int arg1, int arg2) {
        field851++;
        for (int var4 = 0; var4 < this.field880; var4++) {
            if (arg0 != 0) {
                this.field897[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field849[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field929[var4] += arg2;
            }
        }
        this.field841 = false;
        if (this.field956 != null) {
            this.field956.field10413 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILeh;)V")
    private final void method530(int arg0, class256 arg1) {
        field885++;
        if (this.field881 > this.field947.field5118.length) {
            this.field947.field5121 = new int[this.field881];
            this.field947.field5118 = new int[this.field881];
        }
        int[] var3 = this.field947.field5118;
        int[] var4 = this.field947.field5121;
        for (int var5 = 0; var5 < this.field880; var5++) {
            int var16 = (this.field897[var5] - (this.field849[var5] * this.field947.field5065 >> 8) >> this.field947.field4970) - arg1.field3676;
            int var17 = (this.field929[var5] - (this.field849[var5] * this.field947.field5102 >> 8) >> this.field947.field4970) - arg1.field3677;
            int var18 = this.field848[var5];
            int var19 = this.field848[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field919[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = arg0; var6 < this.field845; var6++) {
            if (this.field917 == null || this.field917[var6] <= 128) {
                short var7 = this.field884[var6];
                short var8 = this.field921[var6];
                short var9 = this.field850[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13))) > 0) {
                    arg1.method1705(var11, var12, var14, var15, var13, var10, arg0 ^ 0xFFFFF91E);
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method531(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field951++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = 0;
            class525.field7629 = 0;
            class412.field5877 = 0;
            class160.field2293 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field910.length) {
                    int[] var15 = this.field910[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class412.field5877 += this.field897[var17];
                        class160.field2293 += this.field849[var17];
                        class525.field7629 += this.field929[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class525.field7629 = class525.field7629 / var12 + var10;
                class160.field2293 = class160.field2293 / var12 + var9;
                class412.field5877 = class412.field5877 / var12 + var11;
            } else {
                class525.field7629 = var10;
                class412.field5877 = var11;
                class160.field2293 = var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field910.length) {
                    int[] var23 = this.field910[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field897[var25] += var18;
                        this.field849[var25] += var19;
                        this.field929[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field910.length) {
                    int[] var46 = this.field910[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field897[var48] -= class412.field5877;
                            this.field849[var48] -= class160.field2293;
                            this.field929[var48] -= class525.field7629;
                            if (arg4 != 0) {
                                int var49 = class125.field1736[arg4];
                                int var50 = class125.field1729[arg4];
                                int var51 = this.field897[var48] * var50 + this.field849[var48] * var49 + 16383 >> 14;
                                this.field849[var48] = this.field849[var48] * var50 + 16383 - (this.field897[var48] * var49) >> 14;
                                this.field897[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class125.field1736[arg2];
                                int var53 = class125.field1729[arg2];
                                int var54 = this.field849[var48] * var53 + 16383 - this.field929[var48] * var52 >> 14;
                                this.field929[var48] = this.field929[var48] * var53 + (this.field849[var48] * var52 + 16383) >> 14;
                                this.field849[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class125.field1736[arg3];
                                int var56 = class125.field1729[arg3];
                                int var57 = this.field929[var48] * var55 + (this.field897[var48] * var56) + 16383 >> 14;
                                this.field929[var48] = this.field929[var48] * var56 + 16383 - (this.field897[var48] * var55) >> 14;
                                this.field897[var48] = var57;
                            }
                            this.field897[var48] += class412.field5877;
                            this.field849[var48] += class160.field2293;
                            this.field929[var48] += class525.field7629;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field897[var59] -= class412.field5877;
                            this.field849[var59] -= class160.field2293;
                            this.field929[var59] -= class525.field7629;
                            if (arg2 != 0) {
                                int var60 = class125.field1736[arg2];
                                int var61 = class125.field1729[arg2];
                                int var62 = this.field849[var59] * var61 + 16383 - (this.field929[var59] * var60) >> 14;
                                this.field929[var59] = this.field849[var59] * var60 + (this.field929[var59] * var61) + 16383 >> 14;
                                this.field849[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class125.field1736[arg4];
                                int var64 = class125.field1729[arg4];
                                int var65 = this.field849[var59] * var63 + (this.field897[var59] * var64) + 16383 >> 14;
                                this.field849[var59] = this.field849[var59] * var64 + 16383 - (this.field897[var59] * var63) >> 14;
                                this.field897[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class125.field1736[arg3];
                                int var67 = class125.field1729[arg3];
                                int var68 = this.field929[var59] * var66 + (this.field897[var59] * var67) + 16383 >> 14;
                                this.field929[var59] = this.field929[var59] * var67 + 16383 - this.field897[var59] * var66 >> 14;
                                this.field897[var59] = var68;
                            }
                            this.field897[var59] += class412.field5877;
                            this.field849[var59] += class160.field2293;
                            this.field929[var59] += class525.field7629;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field910.length > var28) {
                        int[] var29 = this.field910[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field848[var31];
                            int var33 = this.field848[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field919[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class125.field1736[arg4];
                                    int var37 = class125.field1729[arg4];
                                    int var38 = this.field893[var35] * var36 + this.field889[var35] * var37 + 16383 >> 14;
                                    this.field893[var35] = (short) (this.field893[var35] * var37 + 16383 - (this.field889[var35] * var36) >> 14);
                                    this.field889[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class125.field1736[arg2];
                                    int var40 = class125.field1729[arg2];
                                    int var41 = this.field893[var35] * var40 + 16383 - (this.field891[var35] * var39) >> 14;
                                    this.field891[var35] = (short) (this.field893[var35] * var39 + (this.field891[var35] * var40 + 16383) >> 14);
                                    this.field893[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class125.field1736[arg3];
                                    int var43 = class125.field1729[arg3];
                                    int var44 = this.field889[var35] * var43 + this.field891[var35] * var42 + 16383 >> 14;
                                    this.field891[var35] = (short) (this.field891[var35] * var43 + 16383 - (this.field889[var35] * var42) >> 14);
                                    this.field889[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field922 == null && this.field936 != null) {
                    this.field936.field10413 = null;
                }
                if (this.field922 != null) {
                    this.field922.field10413 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field910.length > var70) {
                    int[] var71 = this.field910[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field897[var73] -= class412.field5877;
                        this.field849[var73] -= class160.field2293;
                        this.field929[var73] -= class525.field7629;
                        this.field897[var73] = this.field897[var73] * arg2 >> 7;
                        this.field849[var73] = this.field849[var73] * arg3 >> 7;
                        this.field929[var73] = this.field929[var73] * arg4 >> 7;
                        this.field897[var73] += class412.field5877;
                        this.field849[var73] += class160.field2293;
                        this.field929[var73] += class525.field7629;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field941 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field941.length) {
                        int[] var79 = this.field941[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field917[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field917[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field936 != null) {
                            this.field936.field10413 = null;
                        }
                    }
                }
                if (this.field854 != null) {
                    for (int var75 = 0; var75 < this.field957; var75++) {
                        class582 var76 = this.field854[var75];
                        class556 var77 = this.field861[var75];
                        var77.field8070 = var77.field8070 & 0xFFFFFF | 255 - (this.field917[var76.field8303] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field941 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field941.length) {
                        int[] var88 = this.field941[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field930[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
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
                            this.field930[var90] = (short) class430.method2658(var97, class430.method2658(var95 << 7, var96 << 10));
                        }
                        if (var88.length > 0 && this.field936 != null) {
                            this.field936.field10413 = null;
                        }
                    }
                }
                if (this.field854 != null) {
                    for (int var84 = 0; var84 < this.field957; var84++) {
                        class582 var85 = this.field854[var84];
                        class556 var86 = this.field861[var84];
                        var86.field8070 = var86.field8070 & 0xFF000000 | class519.field7479[this.field930[var85.field8303] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field940 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field940.length) {
                        int[] var100 = this.field940[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class556 var102 = this.field861[var100[var101]];
                            var102.field8074 += arg2;
                            var102.field8077 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field940 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field940.length) {
                        int[] var105 = this.field940[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class556 var107 = this.field861[var105[var106]];
                            var107.field8083 = var107.field8083 * arg3 >> 7;
                            var107.field8072 = var107.field8072 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field940 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field940.length > var109) {
                    int[] var110 = this.field940[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class556 var112 = this.field861[var110[var111]];
                        var112.field8076 = var112.field8076 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IISZB)I")
    private final int method532(int arg0, int arg1, short arg2, boolean arg3, byte arg4) {
        if (arg3) {
            this.field919 = null;
        }
        field903++;
        int var6 = class519.field7479[class144.method1009(arg1, arg0, 2)];
        if (arg2 != -1) {
            class679 var7 = this.field947.field7881.method962(arg2 & 0xFFFF, 2904);
            int var8 = var7.field9637 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg1 < 0) {
                    var9 = 0;
                } else if (arg1 <= 127) {
                    var9 = arg1 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field9651 & 0xFF;
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
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF008F) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg4 & 0xFF);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lsk;Lnl;I)V")
    public final void method533(class121 arg0, class373 arg1, int arg2) {
        field865++;
        if (this.field881 == 0) {
            return;
        }
        class378 var4 = this.field947.field4998;
        class378 var5 = (class378) arg0;
        if (!this.field841) {
            this.method490((byte) 99);
        }
        class495.field7122 = var4.field5499 * var5.field5475 + var4.field5476 * var5.field5465 + var4.field5475 * var5.field5503;
        class661.field9447 = var4.field5499 * var5.field5490 + var4.field5476 * var5.field5494 + var4.field5475 * var5.field5504 + var4.field5490;
        float var6 = (float) this.field948 * class495.field7122 + class661.field9447;
        float var7 = (float) this.field866 * class495.field7122 + class661.field9447;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var9 = (float) this.field935 + var6;
            var8 = var7 - (float) this.field935;
        } else {
            var8 = var6 - (float) this.field935;
            var9 = (float) this.field935 + var7;
        }
        if ((var8 >= this.field947.field5087) || (var9 <= (float) this.field947.field5043)) {
            return;
        }
        class638.field9039 = var4.field5487 * var5.field5490 + var4.field5465 * var5.field5504 + var4.field5464 * var5.field5494 + var4.field5494;
        class699.field9868 = var4.field5487 * var5.field5475 + var4.field5465 * var5.field5503 + var4.field5464 * var5.field5465;
        float var10 = (float) this.field948 * class699.field9868 + class638.field9039;
        float var11 = (float) this.field866 * class699.field9868 + class638.field9039;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) this.field935 + var10) * (float) this.field947.field5067;
            var13 = ((float) (-this.field935) + var11) * (float) this.field947.field5067;
        } else {
            var12 = ((float) this.field935 + var11) * (float) this.field947.field5067;
            var13 = ((float) (-this.field935) + var10) * (float) this.field947.field5067;
        }
        if ((var13 / var9 >= this.field947.field5115) || (var12 / var9 <= this.field947.field5106)) {
            return;
        }
        class699.field9866 = var4.field5468 * var5.field5490 + var4.field5503 * var5.field5504 + var4.field5466 * var5.field5494 + var4.field5504;
        class38.field509 = var4.field5468 * var5.field5475 + var4.field5503 * var5.field5503 + var4.field5466 * var5.field5465;
        float var14 = (float) this.field948 * class38.field509 + class699.field9866;
        float var15 = (float) this.field866 * class38.field509 + class699.field9866;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var17 = ((float) (-this.field935) + var15) * (float) this.field947.field5042;
            var16 = ((float) this.field935 + var14) * (float) this.field947.field5042;
        } else {
            var16 = ((float) this.field935 + var15) * (float) this.field947.field5042;
            var17 = ((float) (-this.field935) + var14) * (float) this.field947.field5042;
        }
        if ((var17 / var9 >= this.field947.field5037) || (this.field947.field5045 >= var16 / var9)) {
            return;
        }
        if (arg1 != null || this.field854 != null) {
            class105.field1471 = var4.field5499 * var5.field5476 + var4.field5476 * var5.field5464 + var4.field5475 * var5.field5466;
            class418.field5975 = var4.field5487 * var5.field5476 + var4.field5465 * var5.field5466 + var4.field5464 * var5.field5464;
            class206.field3108 = var4.field5468 * var5.field5476 + var4.field5503 * var5.field5466 + var4.field5466 * var5.field5464;
            class198.field2964 = var4.field5487 * var5.field5499 + var4.field5465 * var5.field5468 + var4.field5464 * var5.field5487;
            class656.field9405 = var4.field5499 * var5.field5499 + var4.field5476 * var5.field5487 + var4.field5475 * var5.field5468;
            class633.field8936 = var4.field5468 * var5.field5499 + var4.field5503 * var5.field5468 + var4.field5466 * var5.field5487;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field904 + this.field856 >> 1;
            int var21 = this.field934 + this.field913 >> 1;
            int var22 = (int) ((float) var21 * class198.field2964 + (float) this.field948 * class699.field9868 + (float) var20 * class418.field5975 + class638.field9039);
            int var23 = (int) ((float) var21 * class633.field8936 + (float) this.field948 * class38.field509 + (float) var20 * class206.field3108 + class699.field9866);
            int var24 = (int) ((float) var21 * class656.field9405 + (float) this.field948 * class495.field7122 + (float) var20 * class105.field1471 + class661.field9447);
            if (var24 >= this.field947.field5043) {
                arg1.field5407 = this.field947.field5067 * var22 / var24 + this.field947.field5017;
                arg1.field5410 = this.field947.field5042 * var23 / var24 + this.field947.field5110;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class198.field2964 + (float) this.field866 * class699.field9868 + (float) var20 * class418.field5975 + class638.field9039);
            int var26 = (int) ((float) var21 * class633.field8936 + (float) this.field866 * class38.field509 + (float) var20 * class206.field3108 + class699.field9866);
            int var27 = (int) ((float) var21 * class656.field9405 + (float) this.field866 * class495.field7122 + (float) var20 * class105.field1471 + class661.field9447);
            if (var27 < this.field947.field5043) {
                var18 = true;
            } else {
                arg1.field5411 = this.field947.field5110 + (this.field947.field5042 * var26 / var27);
                arg1.field5408 = this.field947.field5067 * var25 / var27 + this.field947.field5017;
            }
            if (var18) {
                if (this.field947.field5043 > var24 && this.field947.field5043 > var27) {
                    var19 = false;
                } else if (var24 < this.field947.field5043) {
                    int var31 = (var27 - this.field947.field5043 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field5407 = this.field947.field5067 * var32 / this.field947.field5043 + this.field947.field5017;
                    arg1.field5410 = this.field947.field5042 * var33 / this.field947.field5043 + this.field947.field5110;
                } else if (this.field947.field5043 > var27) {
                    int var28 = (var24 - this.field947.field5043 << 16) / (var24 - var27);
                    int var29 = var22 + ((var22 - var25) * var28 >> 16);
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field5407 = this.field947.field5067 * var29 / this.field947.field5043 + this.field947.field5017;
                    arg1.field5410 = this.field947.field5042 * var30 / this.field947.field5043 + this.field947.field5110;
                }
            }
            if (var19) {
                arg1.field5409 = true;
                if (var24 <= var27) {
                    arg1.field5412 = (this.field935 + var25) * this.field947.field5067 / var27 + this.field947.field5017 - arg1.field5408;
                } else {
                    arg1.field5412 = (this.field935 + var22) * this.field947.field5067 / var24 + this.field947.field5017 - arg1.field5407;
                }
            }
        }
        this.field947.method2179(1);
        this.field947.method2119(var5, (byte) -128);
        this.method510(3);
        this.field947.method2130((byte) 110);
        this.method501(-73);
    }

    @OriginalMember(owner = "client!am", name = "HA", descriptor = "()I")
    public final int method534() {
        field901++;
        if (!this.field841) {
            this.method490((byte) 97);
        }
        return this.field934;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lam;Lam;ZZZI)Lka;")
    private final class282 method535(class55 arg0, class55 arg1, boolean arg2, boolean arg3, boolean arg4, int arg5) {
        arg1.field957 = this.field957;
        arg1.field942 = this.field942;
        arg1.field932 = 0;
        arg1.field858 = this.field858;
        field838++;
        arg1.field845 = this.field845;
        arg1.field925 = arg5;
        if ((arg5 & 0x100) == 0) {
            arg1.field864 = this.field864;
        } else {
            arg1.field864 = true;
        }
        arg1.field855 = this.field855;
        arg1.field881 = this.field881;
        arg1.field924 = this.field924;
        arg1.field870 = this.field870;
        arg1.field883 = this.field883;
        arg1.field880 = this.field880;
        boolean var7 = class150.method1089(0, this.field858, arg5);
        boolean var8 = class163.method1149(this.field858, (byte) -123, arg5);
        boolean var9 = class520.method3159(52, this.field858, arg5);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg1.field897 = this.field897;
            } else if (arg0.field897 == null || arg0.field897.length < this.field924) {
                arg1.field897 = arg0.field897 = new int[this.field924];
            } else {
                arg1.field897 = arg0.field897;
            }
            if (!var8) {
                arg1.field849 = this.field849;
            } else if (arg0.field849 == null || arg0.field849.length < this.field924) {
                arg1.field849 = arg0.field849 = new int[this.field924];
            } else {
                arg1.field849 = arg0.field849;
            }
            if (!var9) {
                arg1.field929 = this.field929;
            } else if (arg0.field929 == null || this.field924 > arg0.field929.length) {
                arg1.field929 = arg0.field929 = new int[this.field924];
            } else {
                arg1.field929 = arg0.field929;
            }
            for (int var11 = 0; var11 < this.field924; var11++) {
                if (var7) {
                    arg1.field897[var11] = this.field897[var11];
                }
                if (var8) {
                    arg1.field849[var11] = this.field849[var11];
                }
                if (var9) {
                    arg1.field929[var11] = this.field929[var11];
                }
            }
        } else {
            arg1.field897 = this.field897;
            arg1.field929 = this.field929;
            arg1.field849 = this.field849;
        }
        if (class670.method3822(-1, this.field858, arg5)) {
            arg1.field956 = arg0.field956;
            if (arg4) {
                arg1.field932 = (byte) (arg1.field932 | 0x1);
            }
            arg1.field956.field10413 = this.field956.field10413;
            arg1.field956.field10410 = this.field956.field10410;
        } else if (class277.method1785(-1, arg5, this.field858)) {
            arg1.field956 = this.field956;
        } else {
            arg1.field956 = null;
        }
        if (class87.method688(arg5, this.field858, (byte) 34)) {
            if (arg0.field930 == null || arg0.field930.length < this.field883) {
                arg1.field930 = arg0.field930 = new short[this.field883];
            } else {
                arg1.field930 = arg0.field930;
            }
            for (int var12 = 0; var12 < this.field883; var12++) {
                arg1.field930[var12] = this.field930[var12];
            }
        } else {
            arg1.field930 = this.field930;
        }
        if (class634.method3631(10, this.field858, arg5)) {
            if (arg0.field917 == null || this.field883 > arg0.field917.length) {
                arg1.field917 = arg0.field917 = new byte[this.field883];
            } else {
                arg1.field917 = arg0.field917;
            }
            for (int var13 = 0; var13 < this.field883; var13++) {
                arg1.field917[var13] = this.field917[var13];
            }
        } else {
            arg1.field917 = this.field917;
        }
        if (class584.method3437(this.field858, arg5, -64)) {
            if (arg4) {
                arg1.field932 = (byte) (arg1.field932 | 0x2);
            }
            arg1.field936 = arg0.field936;
            arg1.field936.field10413 = this.field936.field10413;
            arg1.field936.field10410 = this.field936.field10410;
        } else if (class591.method3472(this.field858, arg5, true)) {
            arg1.field936 = this.field936;
        } else {
            arg1.field936 = null;
        }
        if (class369.method2318((byte) -108, this.field858, arg5)) {
            if (arg0.field889 == null || arg0.field889.length < this.field881) {
                int var14 = this.field881;
                arg1.field893 = arg0.field893 = new short[var14];
                arg1.field891 = arg0.field891 = new short[var14];
                arg1.field889 = arg0.field889 = new short[var14];
            } else {
                arg1.field889 = arg0.field889;
                arg1.field891 = arg0.field891;
                arg1.field893 = arg0.field893;
            }
            if (this.field899 == null) {
                for (int var18 = 0; var18 < this.field881; var18++) {
                    arg1.field889[var18] = this.field889[var18];
                    arg1.field893[var18] = this.field893[var18];
                    arg1.field891[var18] = this.field891[var18];
                }
            } else {
                if (arg0.field899 == null) {
                    arg0.field899 = new class100();
                }
                class100 var15 = arg1.field899 = arg0.field899;
                if (var15.field1446 == null || this.field881 > var15.field1446.length) {
                    int var16 = this.field881;
                    var15.field1439 = new short[var16];
                    var15.field1442 = new short[var16];
                    var15.field1446 = new short[var16];
                    var15.field1444 = new byte[var16];
                }
                for (int var17 = 0; var17 < this.field881; var17++) {
                    arg1.field889[var17] = this.field889[var17];
                    arg1.field893[var17] = this.field893[var17];
                    arg1.field891[var17] = this.field891[var17];
                    var15.field1446[var17] = this.field899.field1446[var17];
                    var15.field1442[var17] = this.field899.field1442[var17];
                    var15.field1439[var17] = this.field899.field1439[var17];
                    var15.field1444[var17] = this.field899.field1444[var17];
                }
            }
            arg1.field909 = this.field909;
        } else {
            arg1.field891 = this.field891;
            arg1.field889 = this.field889;
            arg1.field909 = this.field909;
            arg1.field899 = this.field899;
            arg1.field893 = this.field893;
        }
        if (class750.method4181(arg5, arg2, this.field858)) {
            if (arg4) {
                arg1.field932 = (byte) (arg1.field932 | 0x4);
            }
            arg1.field922 = arg0.field922;
            arg1.field922.field10413 = this.field922.field10413;
            arg1.field922.field10410 = this.field922.field10410;
        } else if (class299.method1862(this.field858, arg5, (byte) 21)) {
            arg1.field922 = this.field922;
        } else {
            arg1.field922 = null;
        }
        if (class125.method879(arg5, this.field858, 7)) {
            if (arg0.field916 == null || this.field883 > arg0.field916.length) {
                int var19 = this.field881;
                arg1.field916 = arg0.field916 = new float[var19];
                arg1.field869 = arg0.field869 = new float[var19];
            } else {
                arg1.field869 = arg0.field869;
                arg1.field916 = arg0.field916;
            }
            for (int var20 = 0; var20 < this.field881; var20++) {
                arg1.field916[var20] = this.field916[var20];
                arg1.field869[var20] = this.field869[var20];
            }
        } else {
            arg1.field916 = this.field916;
            arg1.field869 = this.field869;
        }
        if (class487.method2968(arg5, this.field858, 1)) {
            arg1.field875 = arg0.field875;
            if (arg4) {
                arg1.field932 = (byte) (arg1.field932 | 0x8);
            }
            arg1.field875.field10413 = this.field875.field10413;
            arg1.field875.field10410 = this.field875.field10410;
        } else if (class530.method3214(arg5, this.field858, (byte) 124)) {
            arg1.field875 = this.field875;
        } else {
            arg1.field875 = null;
        }
        if (class211.method1495(this.field858, arg5, -124)) {
            if (arg0.field884 == null || this.field883 > arg0.field884.length) {
                int var21 = this.field883;
                arg1.field884 = arg0.field884 = new short[var21];
                arg1.field850 = arg0.field850 = new short[var21];
                arg1.field921 = arg0.field921 = new short[var21];
            } else {
                arg1.field884 = arg0.field884;
                arg1.field921 = arg0.field921;
                arg1.field850 = arg0.field850;
            }
            for (int var22 = 0; var22 < this.field883; var22++) {
                arg1.field884[var22] = this.field884[var22];
                arg1.field921[var22] = this.field921[var22];
                arg1.field850[var22] = this.field850[var22];
            }
        } else {
            arg1.field850 = this.field850;
            arg1.field921 = this.field921;
            arg1.field884 = this.field884;
        }
        if (class573.method3405(this.field858, arg5, (byte) 7)) {
            arg1.field955 = arg0.field955;
            if (arg4) {
                arg1.field932 = (byte) (arg1.field932 | 0x10);
            }
            arg1.field955.field220 = this.field955.field220;
        } else if (class268.method1759(-77, arg5, this.field858)) {
            arg1.field955 = this.field955;
        } else {
            arg1.field955 = null;
        }
        if (class378.method2346(this.field858, 109, arg5)) {
            if (arg0.field860 == null || arg0.field860.length < this.field883) {
                int var23 = this.field883;
                arg1.field860 = arg0.field860 = new short[var23];
            } else {
                arg1.field860 = arg0.field860;
            }
            for (int var24 = 0; var24 < this.field883; var24++) {
                arg1.field860[var24] = this.field860[var24];
            }
        } else {
            arg1.field860 = this.field860;
        }
        if (!class172.method1218(this.field858, arg5, -1)) {
            arg1.field861 = this.field861;
        } else if (arg0.field861 == null || arg0.field861.length < this.field957) {
            int var26 = this.field957;
            arg1.field861 = arg0.field861 = new class556[var26];
            for (int var27 = 0; var27 < this.field957; var27++) {
                arg1.field861[var27] = this.field861[var27].method3336(14049);
            }
        } else {
            arg1.field861 = arg0.field861;
            for (int var25 = 0; var25 < this.field957; var25++) {
                arg1.field861[var25].method3337(this.field861[var25], 128);
            }
        }
        arg1.field940 = this.field940;
        arg1.field918 = this.field918;
        arg1.field926 = this.field926;
        arg1.field854 = this.field854;
        arg1.field941 = this.field941;
        arg1.field920 = this.field920;
        arg1.field848 = this.field848;
        if (this.field841) {
            arg1.field948 = this.field948;
            arg1.field904 = this.field904;
            arg1.field935 = this.field935;
            arg1.field913 = this.field913;
            arg1.field841 = true;
            arg1.field934 = this.field934;
            arg1.field894 = this.field894;
            arg1.field866 = this.field866;
            arg1.field856 = this.field856;
        } else {
            arg1.field841 = false;
        }
        arg1.field842 = this.field842;
        arg1.field910 = this.field910;
        arg1.field919 = this.field919;
        arg1.field946 = this.field946;
        return arg1;
    }

    @OriginalMember(owner = "client!am", name = "NA", descriptor = "()Z")
    public final boolean method536() {
        field887++;
        if (this.field910 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field924; var1++) {
            this.field897[var1] <<= 0x4;
            this.field849[var1] <<= 0x4;
            this.field929[var1] <<= 0x4;
        }
        class412.field5877 = 0;
        class160.field2293 = 0;
        class525.field7629 = 0;
        return true;
    }

    @OriginalMember(owner = "client!am", name = "wa", descriptor = "()V")
    public final void method537() {
        field859++;
        for (int var1 = 0; var1 < this.field924; var1++) {
            this.field897[var1] = this.field897[var1] + 7 >> 4;
            this.field849[var1] = this.field849[var1] + 7 >> 4;
            this.field929[var1] = this.field929[var1] + 7 >> 4;
        }
        if (this.field956 != null) {
            this.field956.field10413 = null;
        }
        this.field841 = false;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILsk;ZII)Z")
    public final boolean method538(int arg0, int arg1, class121 arg2, boolean arg3, int arg4, int arg5) {
        field876++;
        return this.method513(arg5, -28304, arg3, arg1, arg0, arg2, arg4);
    }

    @OriginalMember(owner = "client!am", name = "V", descriptor = "()I")
    public final int method539() {
        field863++;
        if (!this.field841) {
            this.method490((byte) 110);
        }
        return this.field904;
    }

    @OriginalMember(owner = "client!am", name = "ba", descriptor = "(Lr;)Lr;")
    public final class704 method540(class704 arg0) {
        field895++;
        if (this.field881 == 0) {
            return null;
        }
        if (!this.field841) {
            this.method490((byte) 91);
        }
        int var2;
        int var3;
        if (this.field947.field5065 > 0) {
            var2 = this.field904 - (this.field947.field5065 * this.field866 >> 8) >> this.field947.field4970;
            var3 = this.field856 - (this.field947.field5065 * this.field948 >> 8) >> this.field947.field4970;
        } else {
            var2 = this.field904 - (this.field947.field5065 * this.field948 >> 8) >> this.field947.field4970;
            var3 = this.field856 - (this.field947.field5065 * this.field866 >> 8) >> this.field947.field4970;
        }
        int var4;
        int var5;
        if (this.field947.field5102 <= 0) {
            var4 = this.field934 - (this.field947.field5102 * this.field948 >> 8) >> this.field947.field4970;
            var5 = this.field913 - (this.field947.field5102 * this.field866 >> 8) >> this.field947.field4970;
        } else {
            var4 = this.field934 - (this.field947.field5102 * this.field866 >> 8) >> this.field947.field4970;
            var5 = this.field913 - (this.field947.field5102 * this.field948 >> 8) >> this.field947.field4970;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class256 var8 = (class256) arg0;
        class256 var9;
        if (var8 != null && var8.method1703(104, var6, var7)) {
            var9 = var8;
            var8.method1704(false);
        } else {
            var9 = new class256(this.field947, var6, var7);
        }
        var9.method1708((byte) -125, var5, var4, var2, var3);
        this.method530(0, var9);
        return var9;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public final void method541(int arg0) {
        field931++;
        int var2 = class125.field1736[arg0];
        int var3 = class125.field1729[arg0];
        for (int var4 = 0; var4 < this.field880; var4++) {
            int var5 = this.field929[var4] * var2 + this.field897[var4] * var3 >> 14;
            this.field929[var4] = this.field929[var4] * var3 - (this.field897[var4] * var2) >> 14;
            this.field897[var4] = var5;
        }
        if (this.field956 != null) {
            this.field956.field10413 = null;
        }
        this.field841 = false;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lkw;)V")
    public class55(class346 arg0) {
        this.field947 = arg0;
        this.field956 = new class745(null, 5126, 3, 0);
        this.field875 = new class745(null, 5126, 2, 0);
        this.field922 = new class745(null, 5126, 3, 0);
        this.field936 = new class745(null, 5121, 4, 0);
        this.field955 = new class25();
    }

    @OriginalMember(owner = "client!am", name = "EA", descriptor = "()I")
    public final int method542() {
        if (!this.field841) {
            this.method490((byte) 113);
        }
        field912++;
        return this.field866;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "()Z")
    public final boolean method543() {
        field857++;
        if (this.field860 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field860.length; var1++) {
            if (this.field860[var1] != -1 && !this.field947.field7881.method963((byte) 41, this.field860[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lkw;Lfu;IIII)V")
    public class55(class346 arg0, class637 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field947 = arg0;
        this.field925 = arg2;
        this.field858 = arg5;
        if (class277.method1785(-1, arg2, arg5)) {
            this.field956 = new class745(null, 5126, 3, 0);
        }
        if (class530.method3214(arg2, arg5, (byte) 124)) {
            this.field875 = new class745(null, 5126, 2, 0);
        }
        if (class299.method1862(arg5, arg2, (byte) 21)) {
            this.field922 = new class745(null, 5126, 3, 0);
        }
        if (class591.method3472(arg5, arg2, true)) {
            this.field936 = new class745(null, 5121, 4, 0);
        }
        if (class268.method1759(-103, arg2, arg5)) {
            this.field955 = new class25();
        }
        class267 var7 = arg0.field7881;
        int[] var8 = new int[arg1.field8998];
        this.field848 = new int[arg1.field8993 + 1];
        for (int var9 = 0; var9 < arg1.field8998; var9++) {
            if (arg1.field8987 == null || arg1.field8987[var9] != 2) {
                if (arg1.field9017 != null && arg1.field9017[var9] != -1) {
                    class679 var173 = var7.method962(arg1.field9017[var9] & 0xFFFF, 2904);
                    if (((this.field858 & 0x40) == 0 || !var173.field9639) && var173.field9652) {
                        continue;
                    }
                }
                var8[this.field883++] = var9;
                this.field848[arg1.field9015[var9]]++;
                this.field848[arg1.field9016[var9]]++;
                this.field848[arg1.field9022[var9]]++;
            }
        }
        this.field845 = this.field883;
        long[] var10 = new long[this.field883];
        boolean var11 = (this.field925 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field883; var12++) {
            int var156 = var8[var12];
            class679 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field9011 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field9011.length; var163++) {
                    class144 var164 = arg1.field9011[var163];
                    if (var164.field1955 == var156) {
                        class624 var165 = class183.method1299((byte) 91, var164.field1961);
                        if (var165.field8877) {
                            var162 = true;
                        }
                        if (var165.field8868 != -1) {
                            class679 var166 = var7.method962(var165.field8868, 2904);
                            if (var166.field9632 == 2) {
                                this.field864 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field845--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field9017 != null) {
                var167 = arg1.field9017[var156];
                if (var167 != -1) {
                    var157 = var7.method962(var167 & 0xFFFF, 2904);
                    if ((this.field858 & 0x40) != 0 && var157.field9639) {
                        var167 = -1;
                        var157 = null;
                    } else {
                        if (var157.field9638 != 0 || var157.field9640 != 0) {
                            this.field855 = true;
                        }
                        var160 = var157.field9648;
                        var161 = var157.field9646;
                    }
                }
            }
            boolean var168 = arg1.field9003 != null && arg1.field9003[var156] != 0 || var157 != null && var157.field9632 != 0;
            if ((var11 || var168) && arg1.field9001 != null) {
                var158 += arg1.field9001[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = ((var160 & 0xFF) << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = ((var167 & 0xFFFF) << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + ((long) var172);
            this.field864 |= var168;
            this.field855 |= var157 != null && (var157.field9638 != 0 || var157.field9640 != 0);
        }
        class634.method3634(var8, -107, var10);
        this.field897 = arg1.field8985;
        this.field924 = arg1.field9008;
        this.field926 = arg1.field8984;
        this.field849 = arg1.field8995;
        this.field929 = arg1.field8994;
        this.field880 = arg1.field8993;
        class559[] var13 = new class559[this.field880];
        this.field918 = arg1.field9026;
        this.field920 = arg1.field9004;
        if (arg1.field9011 != null) {
            this.field957 = arg1.field9011.length;
            this.field861 = new class556[this.field957];
            this.field854 = new class582[this.field957];
            for (int var14 = 0; var14 < this.field957; var14++) {
                class144 var15 = arg1.field9011[var14];
                class624 var16 = class183.method1299((byte) 122, var15.field1961);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field883; var18++) {
                    if (var8[var18] == var15.field1955) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class519.field7479[arg1.field8996[var15.field1955] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field9003 == null ? 0 : arg1.field9003[var15.field1955]) << 24;
                this.field854[var14] = new class582(var17, arg1.field9015[var15.field1955], arg1.field9016[var15.field1955], arg1.field9022[var15.field1955], var16.field8873, var16.field8870, var16.field8868, var16.field8869, var16.field8871, var16.field8877, var16.field8875, var15.field1956);
                this.field861[var14] = new class556(var20);
            }
        }
        int var21 = this.field883 * 3;
        this.field916 = new float[var21];
        this.field909 = new byte[var21];
        this.field930 = new short[this.field883];
        this.field919 = new short[var21];
        this.field860 = new short[this.field883];
        this.field893 = new short[var21];
        if (arg1.field9006 != null) {
            this.field946 = new short[this.field883];
        }
        this.field870 = (short) arg3;
        class67.field1035 = new long[var21];
        this.field850 = new short[this.field883];
        this.field942 = (short) arg4;
        this.field884 = new short[this.field883];
        this.field891 = new short[var21];
        this.field889 = new short[var21];
        this.field921 = new short[this.field883];
        this.field917 = new byte[this.field883];
        this.field869 = new float[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field8993; var23++) {
            int var155 = this.field848[var23];
            this.field848[var23] = var22;
            var22 += var155;
            var13[var23] = new class559();
        }
        this.field848[arg1.field8993] = var22;
        class363 var24 = class283.method1813(this.field883, arg1, var8, false);
        class333[] var25 = new class333[arg1.field8998];
        for (int var26 = 0; var26 < arg1.field8998; var26++) {
            short var134 = arg1.field9015[var26];
            short var135 = arg1.field9016[var26];
            short var136 = arg1.field9022[var26];
            int var137 = this.field897[var135] - this.field897[var134];
            int var138 = this.field849[var135] - this.field849[var134];
            int var139 = this.field929[var135] - this.field929[var134];
            int var140 = this.field897[var136] - this.field897[var134];
            int var141 = this.field849[var136] - this.field849[var134];
            int var142 = this.field929[var136] - this.field929[var134];
            int var143 = var138 * var142 - var139 * var141;
            int var144 = var139 * var140 - (var137 * var142);
            int var145 = var137 * var141 - (var138 * var140);
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var144 >>= 0x1;
                var145 >>= 0x1;
                var143 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var143 * var143 + var144 * var144 + var145 * var145));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var143 * 256 / var146;
            int var148 = var144 * 256 / var146;
            int var149 = var145 * 256 / var146;
            byte var150 = arg1.field8987 == null ? 0 : arg1.field8987[var26];
            if (var150 == 0) {
                class559 var152 = var13[var134];
                var152.field8123++;
                var152.field8120 += var147;
                var152.field8118 += var149;
                var152.field8121 += var148;
                class559 var153 = var13[var135];
                var153.field8123++;
                var153.field8121 += var148;
                var153.field8120 += var147;
                var153.field8118 += var149;
                class559 var154 = var13[var136];
                var154.field8123++;
                var154.field8121 += var148;
                var154.field8120 += var147;
                var154.field8118 += var149;
            } else if (var150 == 1) {
                class333 var151 = var25[var26] = new class333();
                var151.field4517 = var148;
                var151.field4520 = var149;
                var151.field4518 = var147;
            }
        }
        for (int var27 = 0; var27 < this.field883; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field8996[var43] & 0xFFFF;
            int var45;
            if (arg1.field9025 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field9025[var43];
            }
            int var46;
            if (arg1.field9003 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field9003[var43] & 0xFF;
            }
            short var47 = arg1.field9017 == null ? -1 : arg1.field9017[var43];
            if (var47 != -1 && (this.field858 & 0x40) != 0) {
                class679 var48 = var7.method962(var47 & 0xFFFF, 2904);
                if (var48.field9639) {
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
                    var55 = 1;
                    var51 = 1.0F;
                    var53 = 0.0F;
                    var54 = 0.0F;
                    var52 = 1.0F;
                    var56 = 2;
                    var50 = 1.0F;
                    var49 = 0.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field9027[var45];
                    if (var58 == 0) {
                        short var87 = arg1.field9015[var43];
                        short var88 = arg1.field9016[var43];
                        short var89 = arg1.field9022[var43];
                        short var90 = arg1.field9030[var45];
                        short var91 = arg1.field9012[var45];
                        short var92 = arg1.field8983[var45];
                        float var93 = (float) arg1.field8985[var90];
                        float var94 = (float) arg1.field8995[var90];
                        float var95 = (float) arg1.field8994[var90];
                        float var96 = (float) arg1.field8985[var91] - var93;
                        float var97 = (float) arg1.field8995[var91] - var94;
                        float var98 = (float) arg1.field8994[var91] - var95;
                        float var99 = (float) arg1.field8985[var92] - var93;
                        float var100 = (float) arg1.field8995[var92] - var94;
                        float var101 = (float) arg1.field8994[var92] - var95;
                        float var102 = (float) arg1.field8985[var87] - var93;
                        float var103 = (float) arg1.field8995[var87] - var94;
                        float var104 = (float) arg1.field8994[var87] - var95;
                        float var105 = (float) arg1.field8985[var88] - var93;
                        float var106 = (float) arg1.field8995[var88] - var94;
                        float var107 = (float) arg1.field8994[var88] - var95;
                        float var108 = (float) arg1.field8985[var89] - var93;
                        float var109 = (float) arg1.field8995[var89] - var94;
                        float var110 = (float) arg1.field8994[var89] - var95;
                        float var111 = var97 * var101 - var98 * var100;
                        float var112 = var98 * var99 - (var96 * var101);
                        float var113 = var96 * var100 - var97 * var99;
                        float var114 = var100 * var113 - (var101 * var112);
                        float var115 = var101 * var111 - var99 * var113;
                        float var116 = var99 * var112 - (var100 * var111);
                        float var117 = 1.0F / (var98 * var116 + var96 * var114 + var97 * var115);
                        var53 = (var110 * var116 + var108 * var114 + var109 * var115) * var117;
                        var49 = (var104 * var116 + var102 * var114 + var103 * var115) * var117;
                        var51 = (var107 * var116 + var105 * var114 + var106 * var115) * var117;
                        float var118 = var98 * var111 - var96 * var113;
                        float var119 = var97 * var113 - var98 * var112;
                        float var120 = var96 * var112 - (var97 * var111);
                        float var121 = 1.0F / (var101 * var120 + var99 * var119 + var100 * var118);
                        var54 = (var110 * var120 + var108 * var119 + var109 * var118) * var121;
                        var50 = (var104 * var120 + var102 * var119 + var103 * var118) * var121;
                        var52 = (var107 * var120 + var105 * var119 + var106 * var118) * var121;
                    } else {
                        short var59 = arg1.field9015[var43];
                        short var60 = arg1.field9016[var43];
                        short var61 = arg1.field9022[var43];
                        int var62 = var24.field5312[var45];
                        int var63 = var24.field5311[var45];
                        int var64 = var24.field5305[var45];
                        float[] var65 = var24.field5306[var45];
                        byte var66 = arg1.field8990[var45];
                        float var67 = (float) arg1.field9009[var45] / 256.0F;
                        if (var58 == 1) {
                            float var85 = (float) arg1.field9029[var45] / 1024.0F;
                            class179.method1272(arg1.field8995[var59], class582.field8313, var64, var66, 32476, var62, var67, var85, arg1.field8994[var59], arg1.field8985[var59], var65, var63);
                            var49 = class582.field8313[0];
                            var50 = class582.field8313[1];
                            class179.method1272(arg1.field8995[var60], class582.field8313, var64, var66, 32476, var62, var67, var85, arg1.field8994[var60], arg1.field8985[var60], var65, var63);
                            var52 = class582.field8313[1];
                            var51 = class582.field8313[0];
                            class179.method1272(arg1.field8995[var61], class582.field8313, var64, var66, 32476, var62, var67, var85, arg1.field8994[var61], arg1.field8985[var61], var65, var63);
                            var53 = class582.field8313[0];
                            var54 = class582.field8313[1];
                            float var86 = var85 / 2.0F;
                            if ((var66 & 0x1) == 0) {
                                if ((var53 - var49 > var86)) {
                                    var53 -= var85;
                                    var56 = 1;
                                } else if (var49 - var53 > var86) {
                                    var53 += var85;
                                    var56 = 2;
                                }
                                if (var51 - var49 > var86) {
                                    var55 = 1;
                                    var51 -= var85;
                                } else if (var49 - var51 > var86) {
                                    var51 += var85;
                                    var55 = 2;
                                }
                            } else {
                                if (var52 - var50 > var86) {
                                    var52 -= var85;
                                    var55 = 1;
                                } else if (var50 - var52 > var86) {
                                    var55 = 2;
                                    var52 += var85;
                                }
                                if ((var86 < var54 - var50)) {
                                    var56 = 1;
                                    var54 -= var85;
                                } else if (var50 - var54 > var86) {
                                    var56 = 2;
                                    var54 += var85;
                                }
                            }
                        } else if (var58 == 2) {
                            float var68 = (float) arg1.field9010[var45] / 256.0F;
                            float var69 = (float) arg1.field8986[var45] / 256.0F;
                            int var70 = arg1.field8985[var60] - arg1.field8985[var59];
                            int var71 = arg1.field8995[var60] - arg1.field8995[var59];
                            int var72 = arg1.field8994[var60] - arg1.field8994[var59];
                            int var73 = arg1.field8985[var61] - arg1.field8985[var59];
                            int var74 = arg1.field8995[var61] - arg1.field8995[var59];
                            int var75 = arg1.field8994[var61] - arg1.field8994[var59];
                            int var76 = var71 * var75 - (var72 * var74);
                            int var77 = var72 * var73 - (var70 * var75);
                            int var78 = var70 * var74 - var71 * var73;
                            float var79 = 64.0F / (float) arg1.field9014[var45];
                            float var80 = 64.0F / (float) arg1.field8997[var45];
                            float var81 = 64.0F / (float) arg1.field9029[var45];
                            float var82 = (var65[2] * (float) var78 + var65[0] * (float) var76 + var65[1] * (float) var77) / var79;
                            float var83 = (var65[5] * (float) var78 + var65[3] * (float) var76 + var65[4] * (float) var77) / var80;
                            float var84 = (var65[8] * (float) var78 + var65[7] * (float) var77 + var65[6] * (float) var76) / var81;
                            var57 = class127.method901(var84, var82, var83, (byte) 100);
                            class125.method877(arg1.field8985[var59], class582.field8313, var68, var65, var62, var64, var57, arg1.field8995[var59], false, var66, arg1.field8994[var59], var63, var69, var67);
                            var50 = class582.field8313[1];
                            var49 = class582.field8313[0];
                            class125.method877(arg1.field8985[var60], class582.field8313, var68, var65, var62, var64, var57, arg1.field8995[var60], false, var66, arg1.field8994[var60], var63, var69, var67);
                            var52 = class582.field8313[1];
                            var51 = class582.field8313[0];
                            class125.method877(arg1.field8985[var61], class582.field8313, var68, var65, var62, var64, var57, arg1.field8995[var61], false, var66, arg1.field8994[var61], var63, var69, var67);
                            var53 = class582.field8313[0];
                            var54 = class582.field8313[1];
                        } else if (var58 == 3) {
                            class187.method1323(var67, var63, class582.field8313, arg1.field8994[var59], var62, 2048, arg1.field8995[var59], var64, var66, arg1.field8985[var59], var65);
                            var50 = class582.field8313[1];
                            var49 = class582.field8313[0];
                            class187.method1323(var67, var63, class582.field8313, arg1.field8994[var60], var62, 2048, arg1.field8995[var60], var64, var66, arg1.field8985[var60], var65);
                            var51 = class582.field8313[0];
                            var52 = class582.field8313[1];
                            class187.method1323(var67, var63, class582.field8313, arg1.field8994[var61], var62, 2048, arg1.field8995[var61], var64, var66, arg1.field8985[var61], var65);
                            var53 = class582.field8313[0];
                            var54 = class582.field8313[1];
                            if ((var66 & 0x1) == 0) {
                                if ((var51 - var49 > 0.5F)) {
                                    var51--;
                                    var55 = 1;
                                } else if (var49 - var51 > 0.5F) {
                                    var51++;
                                    var55 = 2;
                                }
                                if ((var53 - var49 > 0.5F)) {
                                    var53--;
                                    var56 = 1;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                            } else {
                                if ((var54 - var50 > 0.5F)) {
                                    var54--;
                                    var56 = 1;
                                } else if (var50 - var54 > 0.5F) {
                                    var56 = 2;
                                    var54++;
                                }
                                if ((var52 - var50 > 0.5F)) {
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
            if (arg1.field8987 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field8987[var43];
            }
            if (var122 == 0) {
                long var123 = ((long) (var57 << 24) + (long) var46 + ((long) (var44 << 8)) << 32) + (long) (var45 << 2);
                short var125 = arg1.field9015[var43];
                short var126 = arg1.field9016[var43];
                short var127 = arg1.field9022[var43];
                class559 var128 = var13[var125];
                this.field884[var27] = this.method498(var128.field8118, var49, var128.field8121, var128.field8123, var128.field8120, var123, (byte) -116, var50, arg1, var125);
                class559 var129 = var13[var126];
                this.field921[var27] = this.method498(var129.field8118, var51, var129.field8121, var129.field8123, var129.field8120, (long) var55 + var123, (byte) -83, var52, arg1, var126);
                class559 var130 = var13[var127];
                this.field850[var27] = this.method498(var130.field8118, var53, var130.field8121, var130.field8123, var130.field8120, (long) var56 + var123, (byte) 21, var54, arg1, var127);
            } else if (var122 == 1) {
                class333 var131 = var25[var43];
                long var132 = ((long) (var57 << 24) + (long) var46 + (long) (var44 << 8) << 32) + (long) ((var131.field4518 > 0 ? 1024 : 2048) + (var45 << 2) + (var131.field4517 - -256 << 12) + (var131.field4520 - -256 << 22));
                this.field884[var27] = this.method498(var131.field4520, var49, var131.field4517, 0, var131.field4518, var132, (byte) -128, var50, arg1, arg1.field9015[var43]);
                this.field921[var27] = this.method498(var131.field4520, var51, var131.field4517, 0, var131.field4518, (long) var55 + var132, (byte) -126, var52, arg1, arg1.field9016[var43]);
                this.field850[var27] = this.method498(var131.field4520, var53, var131.field4517, 0, var131.field4518, (long) var56 + var132, (byte) 123, var54, arg1, arg1.field9022[var43]);
            }
            if (arg1.field9003 != null) {
                this.field917[var27] = arg1.field9003[var43];
            }
            if (arg1.field9006 != null) {
                this.field946[var27] = arg1.field9006[var43];
            }
            this.field930[var27] = arg1.field8996[var43];
            this.field860[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field845; var30++) {
            short var42 = this.field860[var30];
            if (var29 != var42) {
                var29 = var42;
                var28++;
            }
        }
        this.field842 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field845; var33++) {
            short var41 = this.field860[var33];
            if (var32 != var41) {
                var32 = var41;
                this.field842[var31++] = var33;
            }
        }
        this.field842[var31] = this.field845;
        class67.field1035 = null;
        this.field889 = class127.method902(this.field889, this.field881, true);
        this.field893 = class127.method902(this.field893, this.field881, true);
        this.field891 = class127.method902(this.field891, this.field881, true);
        this.field909 = class337.method2076(this.field909, this.field881, 116);
        this.field916 = class504.method3082(0, this.field916, this.field881);
        this.field869 = class504.method3082(0, this.field869, this.field881);
        if (arg1.field8980 != null && class120.method839(arg2, this.field858, (byte) -102)) {
            this.field910 = arg1.method3665(false, -1);
        }
        if (arg1.field9011 != null && class36.method186(this.field858, (byte) 39, arg2)) {
            this.field940 = arg1.method3675(15);
        }
        if (arg1.field8982 != null && class631.method3624(arg2, this.field858, -1)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field883; var36++) {
                int var40 = arg1.field8982[var8[var36]];
                if (var40 >= 0) {
                    int var10002 = var35[var40]++;
                    if (var40 > var34) {
                        var34 = var40;
                    }
                }
            }
            this.field941 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field941[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field883; var38++) {
                int var39 = arg1.field8982[var8[var38]];
                if (var39 >= 0) {
                    this.field941[var39][var35[var39]++] = var38;
                }
            }
        }
    }
}
