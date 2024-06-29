import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class641 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    private int field9004;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[[I")
    private int[][] field9006;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    private int field9017;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[J")
    public static long[] field9007 = new long[11];

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[[J")
    public static long[][] field9010 = new long[8][256];

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "[[F")
    public static float[][] field9013 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "[I")
    public static int[] field9014;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)I")
    public final int method3680(int arg0, byte arg1) {
        field9015++;
        if (this.field9006 != null) {
            arg0 = (int) ((long) this.field9004 * (long) arg0 / (long) this.field9017);
        }
        if (arg1 != -128) {
            this.field9006 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method3681(byte arg0) {
        field9014 = null;
        field9010 = null;
        field9007 = null;
        if (arg0 == -65) {
            field9013 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[B)[B")
    public final byte[] method3682(int arg0, byte[] arg1) {
        field9009++;
        if (this.field9006 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field9004 / (long) this.field9017) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field9006[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field9004 + var6;
                int var14 = var13 / this.field9017;
                var5 += var14;
                var6 = var13 - this.field9017 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg0 == 0 ? arg1 : null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    public final int method3683(int arg0, int arg1) {
        if (arg0 > -89) {
            method3686((byte) -77, null);
        }
        field9011++;
        if (this.field9006 != null) {
            arg1 = (int) ((long) this.field9004 * (long) arg1 / (long) this.field9017) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public static final void method3684(byte arg0) {
        field9012++;
        if (arg0 >= -14) {
            field9007 = null;
        }
        for (class574 var1 = (class574) class189.field2356.method1041(1048832); var1 != null; var1 = (class574) class189.field2356.method1033(-1)) {
            if (var1.field8071) {
                var1.method527(-11229);
            } else {
                var1.field8076 = true;
                if (var1.field8080 >= 0 && var1.field8081 >= 0 && class741.field10208 > var1.field8080 && var1.field8081 < class525.field7224) {
                    class475.method2829(var1, false);
                }
            }
        }
        for (class574 var2 = (class574) class747.field10318.method1041(1048832); var2 != null; var2 = (class574) class747.field10318.method1033(-1)) {
            if (var2.field8071) {
                var2.method527(-11229);
            } else {
                var2.field8076 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method3685(int arg0, int arg1, int arg2) {
        field9016++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (arg0 != 31339) {
            return null;
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLns;)V")
    public static final void method3686(byte arg0, class654 arg1) {
        field9005++;
        if (arg1.field9198 != -1) {
            class73 var2 = class571.field8029.method3695(arg1.field9198, (byte) -122);
            if (var2 == null || var2.field816 == null) {
                arg1.field9207 = false;
                arg1.field9198 = -1;
            } else {
                label283: {
                    arg1.field9142++;
                    if (arg1.field9138 < var2.field816.length && var2.field817[arg1.field9138] < arg1.field9142) {
                        arg1.field9142 = 1;
                        arg1.field9148++;
                        arg1.field9138++;
                        if (!arg1.field9136) {
                            class538.method3196(arg1, arg1.field9138, true, var2);
                        }
                    }
                    if (arg1.field9138 >= var2.field816.length) {
                        arg1.field9138 = 0;
                        arg1.field9142 = 0;
                        if (arg1.field9207) {
                            arg1.field9198 = arg1.method3736((byte) 100).method982(arg0 ^ 0x2E);
                            if (arg1.field9198 == -1) {
                                arg1.field9207 = false;
                                break label283;
                            }
                            var2 = class571.field8029.method3695(arg1.field9198, (byte) -121);
                        }
                        if (!arg1.field9136) {
                            class538.method3196(arg1, arg1.field9138, true, var2);
                        }
                    }
                    arg1.field9148 = arg1.field9138 + 1;
                    if (var2.field816 == null) {
                        arg1.field9207 = false;
                        arg1.field9198 = -1;
                    } else if (var2.field816.length <= arg1.field9148) {
                        arg1.field9148 = 0;
                    }
                }
            }
        }
        for (int var3 = 0; var3 < arg1.field9154.length; var3++) {
            if (arg1.field9154[var3].field111 != -1 && class533.field7336 >= arg1.field9154[var3].field114) {
                class346 var9 = class576.field8094.method4137((byte) -117, arg1.field9154[var3].field111);
                int var10 = var9.field5023;
                if (var10 == -1) {
                    arg1.field9154[var3].field111 = -1;
                } else {
                    class73 var11 = class571.field8029.method3695(var10, (byte) -107);
                    if (var9.field5022) {
                        if (var11.field809 == 3) {
                            if (arg1.field9216 > 0 && class533.field7336 >= arg1.field9183 && arg1.field9206 < class533.field7336) {
                                arg1.field9154[var3].field111 = -1;
                                continue;
                            }
                        } else if (var11.field809 == 1 && arg1.field9216 > 0 && arg1.field9183 <= class533.field7336 && class533.field7336 > arg1.field9206) {
                            arg1.field9154[var3].field114 = class533.field7336 + 1;
                            continue;
                        }
                    }
                    if (var11 == null || var11.field816 == null) {
                        arg1.field9154[var3].field111 = -1;
                    } else {
                        if (arg1.field9154[var3].field122 < 0) {
                            arg1.field9154[var3].field122 = 0;
                            if (!arg1.field9136) {
                                class538.method3196(arg1, 0, true, var11);
                            }
                        }
                        arg1.field9154[var3].field113++;
                        if (arg1.field9154[var3].field122 < var11.field816.length && var11.field817[arg1.field9154[var3].field122] < arg1.field9154[var3].field113) {
                            arg1.field9154[var3].field113 = 1;
                            arg1.field9154[var3].field122++;
                            if (!arg1.field9136) {
                                class538.method3196(arg1, arg1.field9154[var3].field122, true, var11);
                            }
                        }
                        if (var11.field816.length <= arg1.field9154[var3].field122) {
                            if (var9.field5022) {
                                arg1.field9154[var3].field122 -= var11.field805;
                                arg1.field9154[var3].field118++;
                                if (arg1.field9154[var3].field118 >= var11.field823) {
                                    arg1.field9154[var3].field111 = -1;
                                } else if (arg1.field9154[var3].field122 < 0 || var11.field816.length <= arg1.field9154[var3].field122) {
                                    arg1.field9154[var3].field111 = -1;
                                } else if (!arg1.field9136) {
                                    class538.method3196(arg1, arg1.field9154[var3].field122, true, var11);
                                }
                            } else {
                                arg1.field9154[var3].field111 = -1;
                            }
                        }
                        arg1.field9154[var3].field117 = arg1.field9154[var3].field122 + 1;
                        if (var11.field816.length <= arg1.field9154[var3].field117) {
                            if (var9.field5022) {
                                arg1.field9154[var3].field117 -= var11.field805;
                                if (arg1.field9154[var3].field118 + 1 >= var11.field823) {
                                    arg1.field9154[var3].field117 = -1;
                                } else if (arg1.field9154[var3].field117 < 0 || var11.field816.length <= arg1.field9154[var3].field117) {
                                    arg1.field9154[var3].field117 = -1;
                                }
                            } else {
                                arg1.field9154[var3].field117 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -101) {
            return;
        }
        if (arg1.field9150 != -1 && arg1.field9135 <= 1) {
            class73 var4 = class571.field8029.method3695(arg1.field9150, (byte) -123);
            if (var4.field809 == 3) {
                if (arg1.field9216 > 0 && arg1.field9183 <= class533.field7336 && class533.field7336 > arg1.field9206) {
                    arg1.field9150 = -1;
                    arg1.field9173 = null;
                }
            } else if (var4.field809 == 1 && arg1.field9216 > 0 && arg1.field9183 <= class533.field7336 && arg1.field9206 < class533.field7336) {
                arg1.field9135 = 2;
            }
        }
        if (arg1.field9150 != -1 && arg1.field9135 == 0) {
            class73 var5 = class571.field8029.method3695(arg1.field9150, (byte) -113);
            if (var5 == null || var5.field816 == null) {
                arg1.field9173 = null;
                arg1.field9150 = -1;
            } else {
                arg1.field9123++;
                if (arg1.field9203 < var5.field816.length && var5.field817[arg1.field9203] < arg1.field9123) {
                    arg1.field9203++;
                    arg1.field9123 = 1;
                    if (!arg1.field9136) {
                        class538.method3196(arg1, arg1.field9203, true, var5);
                    }
                }
                if (var5.field816.length <= arg1.field9203) {
                    arg1.field9168++;
                    arg1.field9203 -= var5.field805;
                    if (var5.field823 <= arg1.field9168) {
                        arg1.field9150 = -1;
                        arg1.field9173 = null;
                    } else if (arg1.field9203 < 0 || arg1.field9203 >= var5.field816.length) {
                        arg1.field9150 = -1;
                        arg1.field9173 = null;
                    } else if (!arg1.field9136) {
                        class538.method3196(arg1, arg1.field9203, true, var5);
                    }
                }
                arg1.field9117 = arg1.field9203 + 1;
                if (arg1.field9117 >= var5.field816.length) {
                    arg1.field9117 -= var5.field805;
                    if (var5.field823 <= (arg1.field9168 + 1)) {
                        arg1.field9117 = -1;
                    } else if (arg1.field9117 < 0 || var5.field816.length <= arg1.field9117) {
                        arg1.field9117 = -1;
                    }
                }
            }
        }
        if (arg1.field9135 > 0) {
            arg1.field9135--;
        }
        for (int var6 = 0; var6 < arg1.field9164.length; var6++) {
            class695 var7 = arg1.field9164[var6];
            if (var7 != null) {
                if (var7.field9694 > 0) {
                    var7.field9694--;
                } else {
                    class73 var8 = class571.field8029.method3695(var7.field9692, (byte) -119);
                    if (var8 == null || var8.field816 == null) {
                        arg1.field9164[var6] = null;
                    } else {
                        var7.field9690++;
                        if (var7.field9689 < var8.field816.length && var7.field9690 > var8.field817[var7.field9689]) {
                            var7.field9689++;
                            var7.field9690 = 1;
                            if (!arg1.field9136) {
                                class538.method3196(arg1, var7.field9689, true, var8);
                            }
                        }
                        if (var7.field9689 >= var8.field816.length) {
                            var7.field9689 -= var8.field805;
                            var7.field9700++;
                            if (var8.field823 <= var7.field9700) {
                                arg1.field9164[var6] = null;
                            } else if (var7.field9689 < 0 || var7.field9689 >= var8.field816.length) {
                                arg1.field9164[var6] = null;
                            } else if (!arg1.field9136) {
                                class538.method3196(arg1, var7.field9689, true, var8);
                            }
                        }
                        var7.field9697 = var7.field9689 + 1;
                        if (var8.field816.length <= var7.field9697) {
                            var7.field9697 -= var8.field805;
                            if ((var7.field9700 + 1) >= var8.field823) {
                                var7.field9697 = -1;
                            } else if (var7.field9697 < 0 || var8.field816.length <= var7.field9697) {
                                var7.field9697 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[S)[S")
    public final short[] method3687(int arg0, short[] arg1) {
        if (this.field9006 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field9004 / (long) this.field9017) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field9006[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field9004 + var6;
                int var14 = var13 / this.field9017;
                var6 = var13 - this.field9017 * var14;
                var5 += var14;
            }
            arg1 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg1[var8] = -32768;
                } else if (var9 > 32767) {
                    arg1[var8] = 32767;
                } else {
                    arg1[var8] = (short) var9;
                }
            }
        }
        field9008++;
        if (arg0 != 14) {
            field9010 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
    public class641(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class504.method2944(arg0, 0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field9004 = var4;
            this.field9006 = new int[var5][14];
            this.field9017 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field9006[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((var0 & 0x1) == 0 ? var3 >>> 8 : var3 & 0xFF);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 0x11DL;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 0x11DL;
            }
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var12 ^ var4;
            field9010[0][var0] = class92.method669(class92.method669(var6 << 8, class92.method669(class92.method669(var12 << 24, class92.method669(class92.method669(var8 << 40, class92.method669(var4 << 48, var4 << 56)), var4 << 32)), var10 << 16)), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field9010[var16][var0] = class92.method669(field9010[var16 - 1][var0] >>> 8, field9010[var16 - 1][var0] << 56);
            }
        }
        field9007[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field9007[var1] = class778.method4284(class154.method1008(255L, field9010[7][var2 + 7]), class778.method4284(class154.method1008(65280L, field9010[6][var2 + 6]), class778.method4284(class154.method1008(16711680L, field9010[5][var2 + 5]), class778.method4284(class778.method4284(class154.method1008(1095216660480L, field9010[3][var2 + 3]), class778.method4284(class154.method1008(field9010[2][var2 + 2], 280375465082880L), class778.method4284(class154.method1008(field9010[0][var2], -72057594037927936L), class154.method1008(71776119061217280L, field9010[1][var2 + 1])))), class154.method1008(4278190080L, field9010[4][var2 + 4])))));
        }
    }
}
