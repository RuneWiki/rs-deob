import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class453 extends class37 {

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "Lgca;")
    private class227 field6240 = new class227();

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "Llj;")
    public class565 field6245;

    @OriginalMember(owner = "client!hca", name = "M", descriptor = "I")
    private int field6267;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "[[[I")
    public int[][][] field6243;

    @OriginalMember(owner = "client!hca", name = "w", descriptor = "[[[I")
    public int[][][] field6251;

    @OriginalMember(owner = "client!hca", name = "cb", descriptor = "[[F")
    private float[][] field6283;

    @OriginalMember(owner = "client!hca", name = "v", descriptor = "[[S")
    public short[][] field6250;

    @OriginalMember(owner = "client!hca", name = "A", descriptor = "[[[I")
    public int[][][] field6255;

    @OriginalMember(owner = "client!hca", name = "D", descriptor = "[[B")
    private byte[][] field6258;

    @OriginalMember(owner = "client!hca", name = "G", descriptor = "[[[I")
    private int[][][] field6261;

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "I")
    public int field6248;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
    private int field6242;

    @OriginalMember(owner = "client!hca", name = "gb", descriptor = "[[B")
    private byte[][] field6287;

    @OriginalMember(owner = "client!hca", name = "Z", descriptor = "[[F")
    private float[][] field6280;

    @OriginalMember(owner = "client!hca", name = "y", descriptor = "[[[Lgn;")
    private class652[][][] field6253;

    @OriginalMember(owner = "client!hca", name = "ab", descriptor = "[[F")
    private float[][] field6281;

    @OriginalMember(owner = "client!hca", name = "Q", descriptor = "[[[I")
    private int[][][] field6271;

    @OriginalMember(owner = "client!hca", name = "bb", descriptor = "Lfaa;")
    private class139 field6282;

    @OriginalMember(owner = "client!hca", name = "J", descriptor = "Llg;")
    private class378 field6264;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
    private int field6247;

    @OriginalMember(owner = "client!hca", name = "u", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!hca", name = "x", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!hca", name = "B", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!hca", name = "C", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!hca", name = "E", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!hca", name = "H", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!hca", name = "I", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!hca", name = "K", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!hca", name = "L", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!hca", name = "N", descriptor = "I")
    private int field6268;

    @OriginalMember(owner = "client!hca", name = "O", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!hca", name = "P", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!hca", name = "R", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!hca", name = "S", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!hca", name = "T", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!hca", name = "eb", descriptor = "I")
    private int field6285;

    @OriginalMember(owner = "client!hca", name = "fb", descriptor = "I")
    private int field6286;

    @OriginalMember(owner = "client!hca", name = "V", descriptor = "Leq;")
    private class194 field6276;

    @OriginalMember(owner = "client!hca", name = "U", descriptor = "Lmq;")
    public class470 field6275;

    @OriginalMember(owner = "client!hca", name = "W", descriptor = "Lmq;")
    public class470 field6277;

    @OriginalMember(owner = "client!hca", name = "X", descriptor = "Lmq;")
    private class470 field6278;

    @OriginalMember(owner = "client!hca", name = "db", descriptor = "Lmq;")
    public class470 field6284;

    @OriginalMember(owner = "client!hca", name = "Y", descriptor = "[Lgn;")
    private class652[] field6279;

    @OriginalMember(owner = "client!hca", name = "F", descriptor = "[[[I")
    private int[][][] field6260;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I[[ZZIBII)V")
    private final void method2570(int arg0, boolean[][] arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field6239;
        if (arg4 <= -50) {
            if (this.field6279 != null) {
                int var8 = arg0 + arg0 + 1;
                int var9 = var8 * var8;
                if (~this.field6245.field7982.length > ~var9) {
                    this.field6245.field7982 = new int[var9];
                }
                if (~(this.field6247 * 2) < ~this.field6245.field7899.field6855.length) {
                    this.field6245.field7899 = new class340(this.field6247 * 2);
                }
                int var10 = -arg0 + arg6;
                int var11 = var10;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var12 = arg5 - arg0;
                int var13 = var12;
                if (~var12 > -1) {
                    var12 = 0;
                }
                int var14 = arg0 + arg6;
                if (var14 > super.field446 + -1) {
                    var14 = super.field446 + -1;
                }
                int var15 = arg0 + arg5;
                if (super.field438 + -1 < var15) {
                    var15 = super.field438 + -1;
                }
                int var16 = 0;
                int[] var17 = this.field6245.field7982;
                for (int var18 = var10; var14 >= var18; ++var18) {
                    boolean[] var24 = arg1[-var11 + var18];
                    for (int var25 = var12; var15 >= var25; ++var25) {
                        if (var24[-var13 + var25]) {
                            var17[var16++] = super.field446 * var25 + var18;
                        }
                    }
                }
                if (~arg3 == 0) {
                    this.field6245.method3209((byte) 43);
                } else {
                    this.field6245.method3207((float) arg3, -4);
                    this.field6245.method3169(false);
                }
                this.field6245.method3195((byte) 126, ~(7 & this.field6248) != -1);
                for (int var19 = 0; var19 < this.field6279.length; ++var19) {
                    this.field6279[var19].method3676(5123, var17, var16);
                }
                if (!this.field6240.method1435((byte) -98)) {
                    int var20 = this.field6245.field7966;
                    int var21 = this.field6245.field7904;
                    this.field6245.method131(0, var21, this.field6245.field7886);
                    this.field6245.method3195((byte) 73, false);
                    this.field6245.method3213(false, -83);
                    this.field6245.method3237(16015, 128);
                    this.field6245.method3238(-7056, -2);
                    this.field6245.method3206(this.field6245.field7893, (byte) 26);
                    this.field6245.method3210(8448, 48, 7681);
                    this.field6245.method3164(34166, 0, (byte) 93, 770);
                    this.field6245.method3198(0, 34167, true, 770);
                    for (class401 var22 = this.field6240.method1436(28964); var22 != null; var22 = this.field6240.method1443((byte) 6)) {
                        class615 var23 = (class615) var22;
                        var23.method3439(arg6, (byte) -14, arg0, arg5, arg1);
                    }
                    this.field6245.method3164(5890, 0, (byte) 112, 768);
                    this.field6245.method3198(0, 5890, true, 770);
                    this.field6245.method3206((class136) null, (byte) 26);
                    this.field6245.method131(var20, var21, this.field6245.field7886);
                }
                if (this.field6264 != null) {
                    OpenGL.glPushMatrix();
                    OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
                    this.field6245.method3208(this.field6277, (byte) -115, (class470) null, this.field6284, (class470) null);
                    this.field6264.method2165(arg6, arg5, arg2, arg0, (byte) 111, arg1);
                    OpenGL.glPopMatrix();
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILgd;I)V")
    private final void method2571(int arg0, int arg1, class310 arg2, int arg3) {
        ++field6257;
        int[] var5 = this.field6255[arg3][arg1];
        int[] var6 = this.field6251[arg3][arg1];
        int var7 = var5.length;
        if (~var7 < ~this.field6245.field7984.length) {
            this.field6245.field7984 = new int[var7];
            this.field6245.field7981 = new int[var7];
        }
        int[] var8 = this.field6245.field7984;
        int[] var9 = this.field6245.field7981;
        for (int var10 = 0; ~var10 > ~var7; ++var10) {
            var8[var10] = var5[var10] >> this.field6245.field7830;
            var9[var10] = var6[var10] >> this.field6245.field7830;
        }
        int var11 = 0;
        while (var11 < var7) {
            int var13 = var8[var11];
            int var14 = var9[var11++];
            int var15 = var8[var11];
            int var16 = var9[var11++];
            int var17 = var8[var11];
            int var18 = var9[var11++];
            if (~((var13 - var15) * (-var18 + var16) - (var16 - var14) * (var17 - var15)) < -1) {
                arg2.method1879(var16, var15, var14, (byte) -128, var18, var17, var13);
            }
        }
        int var12 = -101 / ((arg0 - -48) / 41);
    }

    @OriginalMember(owner = "client!hca", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method323(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field6241;
        if (arg5 != null && this.field6260 == null) {
            this.field6260 = new int[super.field446][super.field438][];
        }
        if (arg3 != null && this.field6271 == null) {
            this.field6271 = new int[super.field446][super.field438][];
        }
        this.field6255[arg0][arg1] = arg2;
        this.field6251[arg0][arg1] = arg4;
        this.field6243[arg0][arg1] = arg6;
        this.field6261[arg0][arg1] = arg7;
        if (this.field6260 != null) {
            this.field6260[arg0][arg1] = arg5;
        }
        if (this.field6271 != null) {
            this.field6271[arg0][arg1] = arg3;
        }
        class652[] var15 = this.field6253[arg0][arg1] = new class652[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14);
            class401 var19;
            for (var19 = this.field6282.method970((byte) 89, var17); var19 != null; var19 = this.field6282.method976((byte) -81)) {
                class652 var20 = (class652) var19;
                if (~arg8[var16] == ~var20.field9052 && (float) arg9[var16] == var20.field9068 && ~var20.field9064 == ~arg10 && ~var20.field9050 == ~arg11 && var20.field9073 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class652(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field6282.method968(var17, var15[var16], -1);
            } else {
                var15[var16] = (class652) var19;
            }
        }
        if (arg13) {
            this.field6258[arg0][arg1] = (byte) class647.method3617(this.field6258[arg0][arg1], 1);
        }
        if (this.field6286 < arg6.length) {
            this.field6286 = arg6.length;
        }
        this.field6285 += arg6.length;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)V")
    public final void method321(int arg0, int arg1) {
        ++field6265;
    }

    @OriginalMember(owner = "client!hca", name = "BA", descriptor = "()V")
    public final void method325() {
        if (this.field6285 <= 0) {
            this.field6264 = null;
        } else {
            byte[][] var1 = new byte[super.field446 - -1][super.field438 + 1];
            for (int var2 = 1; ~super.field446 < ~var2; ++var2) {
                for (int var103 = 1; ~super.field438 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field6287[var2 + 1][var103] >> 3) + (this.field6287[var2][var103 + 1] >> 3) + (this.field6287[var2][var103] >> 1) + (this.field6287[var2][var103 + -1] >> 2) + (this.field6287[var2 - 1][var103] >> 2));
                }
            }
            this.field6279 = new class652[this.field6282.method972(0)];
            this.field6282.method971(this.field6279, -30302);
            for (int var3 = 0; this.field6279.length > var3; ++var3) {
                this.field6279[var3].method3671(this.field6285, 119);
            }
            int var4 = 24;
            if (this.field6260 != null) {
                var4 += 4;
            }
            if ((this.field6248 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field6245.field7835.method3474(this.field6285 * var4, false);
            Stream var6 = new Stream(var5);
            class652[] var7 = new class652[this.field6285];
            int var8 = class180.method1240(this.field6285 / 4, -1);
            if (~var8 > -2) {
                var8 = 1;
            }
            class139 var9 = new class139(var8);
            class652[] var10 = new class652[this.field6286];
            for (int var11 = 0; super.field446 > var11; ++var11) {
                for (int var30 = 0; ~super.field438 < ~var30; ++var30) {
                    if (this.field6243[var11][var30] != null) {
                        class652[] var31 = this.field6253[var11][var30];
                        int[] var32 = this.field6255[var11][var30];
                        int[] var33 = this.field6251[var11][var30];
                        int[] var34 = this.field6261[var11][var30];
                        int[] var35 = this.field6243[var11][var30];
                        int[] var36 = this.field6271 == null ? null : this.field6271[var11][var30];
                        int[] var37 = this.field6260 != null ? this.field6260[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field6280[var11][var30];
                        float var39 = this.field6281[var11][var30];
                        float var40 = this.field6283[var11][var30];
                        float var41 = this.field6280[var11][var30 - -1];
                        float var42 = this.field6281[var11][var30 + 1];
                        float var43 = this.field6283[var11][var30 + 1];
                        float var44 = this.field6280[var11 - -1][var30 + 1];
                        float var45 = this.field6281[var11 + 1][var30 + 1];
                        float var46 = this.field6283[var11 - -1][var30 + 1];
                        float var47 = this.field6280[var11 + 1][var30];
                        float var48 = this.field6281[var11 - -1][var30];
                        float var49 = this.field6283[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 + 1] & 255;
                        int var52 = var1[var11 - -1][var30 + 1] & 255;
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label338: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class652 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field6250[super.field446 * var30 - -var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field447) - -var32[var57];
                            int var59 = (var30 << super.field447) - -var33[var57];
                            int var60 = var58 >> this.field6267;
                            int var61 = var59 >> this.field6267;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            int var71;
                            float var72;
                            float var73;
                            float var74;
                            if (var67 == 0 && ~var68 == -1) {
                                var71 = var69 - var50;
                                var72 = var40;
                                var73 = var38;
                                var74 = var39;
                            } else if (~var67 == -1 && super.field441 == var68) {
                                var73 = var41;
                                var72 = var43;
                                var71 = var69 - var51;
                                var74 = var42;
                            } else if (super.field441 == var67 && ~super.field441 == ~var68) {
                                var72 = var46;
                                var73 = var44;
                                var74 = var45;
                                var71 = var69 - var52;
                            } else if (super.field441 == var67 && ~var68 == -1) {
                                var71 = var69 - var53;
                                var72 = var49;
                                var73 = var47;
                                var74 = var48;
                            } else {
                                float var75 = (float) var67 / (float) super.field441;
                                float var76 = (float) var68 / (float) super.field441;
                                float var77 = (-var38 + var47) * var75 + var38;
                                float var78 = (-var39 + var48) * var75 + var39;
                                float var79 = (-var40 + var49) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                var73 = (-var77 + var80) * var76 + var77;
                                float var82 = (-var43 + var46) * var75 + var43;
                                var74 = (-var78 + var81) * var76 + var78;
                                var72 = (-var79 + var82) * var76 + var79;
                                int var83 = var50 - -((var53 - var50) * var67 >> super.field447);
                                int var84 = ((-var51 + var52) * var67 >> super.field447) + var51;
                                var71 = var69 - (((-var83 + var84) * var68 >> super.field447) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var71 >> 7;
                                if (~var86 <= -3) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class78.field1186[65408 & var62 | var86];
                                if ((7 & this.field6248) == 0) {
                                    float var87 = this.field6245.field7923[2] * var72 + this.field6245.field7923[0] * var73 + this.field6245.field7923[1] * var74;
                                    var85 = (!(var87 > 0.0F) ? this.field6245.field7916 : this.field6245.field7909) * var87 + this.field6245.field7943;
                                }
                            }
                            class401 var88 = null;
                            if (~(var58 & this.field6242 + -1) == -1 && ~(this.field6242 - 1 & var59) == -1) {
                                var88 = var9.method970((byte) 89, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class1) var88).field1;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && ~var7[var89].field5623 < ~var31[var57].field5623) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var91;
                                if (var62 != var63) {
                                    int var90 = (127 & var63) * var71 >> 7;
                                    if (var90 < 2) {
                                        var90 = 2;
                                    } else if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                    var91 = class78.field1186[65408 & var63 | var90];
                                    if (~(7 & this.field6248) == -1) {
                                        float var92 = this.field6245.field7923[2] * var72 + this.field6245.field7923[1] * var74 + this.field6245.field7923[0] * var73;
                                        float var93 = (!(var85 > 0.0F) ? this.field6245.field7916 : this.field6245.field7909) * var85 + this.field6245.field7943;
                                        int var94 = var91 >> 16 & 255;
                                        int var95 = (var91 & 65456) >> 8;
                                        int var96 = var91 & 255;
                                        int var97 = (int) ((float) var94 * var93);
                                        if (~var97 <= -1) {
                                            if (~var97 < -256) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        int var99 = (int) ((float) var96 * var93);
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        if (var99 < 0) {
                                            var99 = 0;
                                        } else if (~var99 < -256) {
                                            var99 = 255;
                                        }
                                        var91 = var97 << 16 | var98 << 8 | var99;
                                    }
                                } else {
                                    var91 = var70;
                                }
                                if (this.field6245.field7921) {
                                    var6.method3486((float) var58);
                                    var6.method3486((float) (var64 + this.method331(var59, (byte) 50, var58)));
                                    var6.method3486((float) var59);
                                    var6.method3481((byte) (var91 >> 16));
                                    var6.method3481((byte) (var91 >> 8));
                                    var6.method3481((byte) var91);
                                    var6.method3481(-1);
                                    var6.method3486((float) var58);
                                    var6.method3486((float) var59);
                                    if (this.field6260 != null) {
                                        var6.method3486((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field6248 & 7) != -1) {
                                        var6.method3486(var73);
                                        var6.method3486(var74);
                                        var6.method3486(var72);
                                    }
                                } else {
                                    var6.method3478((float) var58);
                                    var6.method3478((float) (var64 + this.method331(var59, (byte) 50, var58)));
                                    var6.method3478((float) var59);
                                    var6.method3481((byte) (var91 >> 16));
                                    var6.method3481((byte) (var91 >> 8));
                                    var6.method3481((byte) var91);
                                    var6.method3481(-1);
                                    var6.method3478((float) var58);
                                    var6.method3478((float) var59);
                                    if (this.field6260 != null) {
                                        var6.method3478((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if ((7 & this.field6248) != 0) {
                                        var6.method3478(var73);
                                        var6.method3478(var74);
                                        var6.method3478(var72);
                                    }
                                }
                                var89 = this.field6268++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method968(var65, new class1(var56[var57]), -1);
                            }
                            for (int var100 = 0; ~var54 < ~var100; ++var100) {
                                var10[var100].method3672(32, var71, var85, var89, var70);
                            }
                            ++this.field6247;
                        }
                    }
                }
            }
            for (int var12 = 0; this.field6268 > var12; ++var12) {
                class652 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3673(4, var12);
                }
            }
            for (int var13 = 0; ~super.field446 < ~var13; ++var13) {
                for (int var18 = 0; ~super.field438 < ~var18; ++var18) {
                    short[] var19 = this.field6250[super.field446 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = var19[var21++] & 65535;
                            int var24 = 65535 & var19[var21++];
                            class652 var25 = var7[var22];
                            class652 var26 = var7[var23];
                            class652 var27 = var7[var24];
                            class652 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method3679((byte) 46, var13, var20, var18);
                            }
                            if (var26 != null) {
                                var26.method3679((byte) 69, var13, var20, var18);
                                if (var28 == null || var26.field5623 < var28.field5623) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3679((byte) 106, var13, var20, var18);
                                if (var28 == null || ~var28.field5623 < ~var27.field5623) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3673(4, var22);
                                }
                                if (var26 != null) {
                                    var28.method3673(4, var23);
                                }
                                if (var27 != null) {
                                    var28.method3673(4, var24);
                                }
                                var28.method3679((byte) 104, var13, var20, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3477();
            this.field6276 = this.field6245.method3239(var4, var6.method3485(), false, true, var5);
            this.field6284 = new class470(this.field6276, 5126, 3, 0);
            this.field6278 = new class470(this.field6276, 5121, 4, 12);
            byte var14;
            if (this.field6260 == null) {
                this.field6277 = new class470(this.field6276, 5126, 2, 16);
                var14 = 24;
            } else {
                this.field6277 = new class470(this.field6276, 5126, 3, 16);
                var14 = 28;
            }
            if (~(this.field6248 & 7) != -1) {
                this.field6275 = new class470(this.field6276, 5126, 3, var14);
            }
            long[] var15 = new long[this.field6279.length];
            for (int var16 = 0; this.field6279.length > var16; ++var16) {
                class652 var17 = this.field6279[var16];
                var15[var16] = var17.field5623;
                var17.method3677(226, this.field6268);
            }
            class386.method2282(19107, this.field6279, var15);
            if (this.field6264 != null) {
                this.field6264.method2166(128);
            }
        }
        ++field6270;
        this.field6261 = null;
        this.field6271 = null;
        this.field6260 = null;
        this.field6255 = this.field6251 = null;
        this.field6282 = null;
        this.field6253 = null;
        this.field6280 = this.field6281 = this.field6283 = null;
        this.field6287 = null;
        this.field6243 = null;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method318(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field6263;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method323(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Z")
    public static final boolean method2572(int arg0) throws IOException {
        ++field6256;
        if (class589.field8272 == null) {
            return false;
        } else {
            if (class417.field5889 == null) {
                if (class436.field6055) {
                    if (!class589.field8272.method1940(-5544, 1)) {
                        return false;
                    }
                    class589.field8272.method1939(1, 0, class660.field9184.field6855, (byte) -93);
                    ++class206.field2876;
                    class219.field3066 = 0;
                    class436.field6055 = false;
                }
                class660.field9184.field6892 = 0;
                if (class660.field9184.method2587(true)) {
                    if (!class589.field8272.method1940(-5544, 1)) {
                        return false;
                    }
                    class589.field8272.method1939(1, 1, class660.field9184.field6855, (byte) -93);
                    ++class206.field2876;
                    class219.field3066 = 0;
                }
                class436.field6055 = true;
                class206[] var1 = class178.method1234((byte) -80);
                int var2 = class660.field9184.method2591(1);
                if (~var2 > -1 || var2 >= var1.length) {
                    throw new IOException("invo:" + var2 + " ip:" + class660.field9184.field6892);
                }
                class417.field5889 = var1[var2];
                class95.field1338 = class417.field5889.field2884;
            }
            if (class95.field1338 == -1) {
                if (!class589.field8272.method1940(-5544, 1)) {
                    return false;
                }
                class589.field8272.method1939(1, 0, class660.field9184.field6855, (byte) -93);
                class95.field1338 = 255 & class660.field9184.field6855[0];
                ++class206.field2876;
                class219.field3066 = 0;
            }
            if (~class95.field1338 == 1) {
                if (!class589.field8272.method1940(-5544, 2)) {
                    return false;
                }
                class589.field8272.method1939(2, 0, class660.field9184.field6855, (byte) -93);
                class660.field9184.field6892 = 0;
                class95.field1338 = class660.field9184.method2845(-1);
                class206.field2876 += 2;
                class219.field3066 = 0;
            }
            if (class95.field1338 > 0) {
                if (!class589.field8272.method1940(-5544, class95.field1338)) {
                    return false;
                }
                class660.field9184.field6892 = 0;
                class589.field8272.method1939(class95.field1338, 0, class660.field9184.field6855, (byte) -93);
                class206.field2876 += class95.field1338;
                class219.field3066 = 0;
            }
            class687.field9800 = class108.field1503;
            class108.field1503 = class131.field1890;
            class131.field1890 = class417.field5889;
            if (class450.field6184 == class417.field5889) {
                int var3 = class660.field9184.method2838((byte) -2);
                int var4 = class660.field9184.method2845(-1);
                boolean var5 = (1 & var3) == 1;
                class521.method2967(var5, true, var4);
                class385.field5461[class136.method950(31, class339.field4547++)] = var4;
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class347.field4638) {
                int var6 = class660.field9184.method2831(true);
                int var7 = class660.field9184.method2858((byte) -68);
                int var8 = class660.field9184.method2845(-1);
                int var9 = class660.field9184.method2846((byte) -69);
                int var10 = class660.field9184.method2846((byte) -69);
                boolean var11 = ~(128 & var6) != -1;
                if (var7 >> 30 == 0) {
                    if (var7 >> 29 != 0) {
                        int var12 = var7 & 65535;
                        class393 var13 = (class393) class299.field4071.method970((byte) 89, (long) var12);
                        if (var13 != null) {
                            if (~var9 == -65536) {
                                var9 = -1;
                            }
                            class61 var14 = var13.field5552;
                            boolean var15 = true;
                            int var16 = !var11 ? var14.field1724 : var14.field1753;
                            if (~var9 != 0 && ~var16 != 0) {
                                if (~var9 == ~var16) {
                                    class157 var17 = class430.field5994.method1993(var9, 64);
                                    if (var17.field2280 && ~var17.field2290 != 0) {
                                        class403 var18 = class192.field2727.method3090(-108, var17.field2290);
                                        int var19 = var18.field5660;
                                        if (var19 != 0 && ~var19 != -3) {
                                            if (~var19 == -2) {
                                                var15 = true;
                                            }
                                        } else {
                                            var15 = false;
                                        }
                                    }
                                } else {
                                    class157 var20 = class430.field5994.method1993(var9, 64);
                                    class157 var21 = class430.field5994.method1993(var16, 64);
                                    if (var20.field2290 != -1 && var21.field2290 != -1) {
                                        class403 var22 = class192.field2727.method3090(-117, var20.field2290);
                                        class403 var23 = class192.field2727.method3090(-124, var21.field2290);
                                        if (~var22.field5668 > ~var23.field5668) {
                                            var15 = false;
                                        }
                                    }
                                }
                            }
                            if (var15) {
                                if (!var11) {
                                    var14.field1758 = 0;
                                    var14.field1759 = 0;
                                    var14.field1776 = 7 & var6;
                                    var14.field1721 = 1;
                                    var14.field1742 = var8;
                                    var14.field1724 = var9;
                                    var14.field1749 = class186.field2697 - -var10;
                                    if (class186.field2697 < var14.field1749) {
                                        var14.field1759 = -1;
                                    }
                                    if (~var14.field1724 != 0 && class186.field2697 == var14.field1749) {
                                        int var24 = class430.field5994.method1993(var14.field1724, 64).field2290;
                                        if (var24 != -1) {
                                            class403 var25 = class192.field2727.method3090(-122, var24);
                                            if (var25 != null && var25.field5667 != null && !var14.field1764) {
                                                class234.method1476(var14, var25, 0, (byte) 118);
                                            }
                                        }
                                    }
                                } else {
                                    var14.field1753 = var9;
                                    var14.field1772 = class186.field2697 + var10;
                                    var14.field1730 = var8;
                                    var14.field1707 = 1;
                                    var14.field1790 = 0;
                                    var14.field1780 = 0;
                                    var14.field1710 = 7 & var6;
                                    if (class186.field2697 < var14.field1772) {
                                        var14.field1790 = -1;
                                    }
                                    if (var14.field1753 != -1 && ~class186.field2697 == ~var14.field1772) {
                                        int var26 = class430.field5994.method1993(var14.field1753, 64).field2290;
                                        if (~var26 != 0) {
                                            class403 var27 = class192.field2727.method3090(121, var26);
                                            if (var27 != null && var27.field5667 != null && !var14.field1764) {
                                                class234.method1476(var14, var27, 0, (byte) -21);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~(var7 >> 28) != -1) {
                        int var28 = 65535 & var7;
                        class677 var29;
                        if (~class409.field5813 != ~var28) {
                            var29 = class671.field9407[var28];
                        } else {
                            var29 = class143.field2063;
                        }
                        if (var29 != null) {
                            if (var9 == 65535) {
                                var9 = -1;
                            }
                            boolean var30 = true;
                            int var31 = var11 ? var29.field1753 : var29.field1724;
                            if (var9 != -1 && var31 != -1) {
                                if (~var9 == ~var31) {
                                    class157 var32 = class430.field5994.method1993(var9, 64);
                                    if (var32.field2280 && ~var32.field2290 != 0) {
                                        class403 var33 = class192.field2727.method3090(-87, var32.field2290);
                                        int var34 = var33.field5660;
                                        if (var34 != 0 && var34 != 2) {
                                            if (var34 == 1) {
                                                var30 = true;
                                            }
                                        } else {
                                            var30 = false;
                                        }
                                    }
                                } else {
                                    class157 var35 = class430.field5994.method1993(var9, 64);
                                    class157 var36 = class430.field5994.method1993(var31, 64);
                                    if (~var35.field2290 != 0 && ~var36.field2290 != 0) {
                                        class403 var37 = class192.field2727.method3090(-102, var35.field2290);
                                        class403 var38 = class192.field2727.method3090(31, var36.field2290);
                                        if (~var37.field5668 > ~var38.field5668) {
                                            var30 = false;
                                        }
                                    }
                                }
                            }
                            if (var30) {
                                if (var11) {
                                    var29.field1772 = class186.field2697 - -var10;
                                    var29.field1790 = 0;
                                    var29.field1710 = var6 & 7;
                                    var29.field1753 = var9;
                                    var29.field1730 = var8;
                                    var29.field1707 = 1;
                                    var29.field1780 = 0;
                                    if (var29.field1753 == 65535) {
                                        var29.field1753 = -1;
                                    }
                                    if (~var29.field1772 < ~class186.field2697) {
                                        var29.field1790 = -1;
                                    }
                                    if (~var29.field1753 != 0 && ~class186.field2697 == ~var29.field1772) {
                                        int var39 = class430.field5994.method1993(var29.field1753, 64).field2290;
                                        if (var39 != -1) {
                                            class403 var40 = class192.field2727.method3090(94, var39);
                                            if (var40 != null && var40.field5667 != null && !var29.field1764) {
                                                class234.method1476(var29, var40, 0, (byte) -33);
                                            }
                                        }
                                    }
                                } else {
                                    var29.field1724 = var9;
                                    var29.field1742 = var8;
                                    var29.field1759 = 0;
                                    var29.field1749 = class186.field2697 + var10;
                                    var29.field1721 = 1;
                                    var29.field1776 = 7 & var6;
                                    var29.field1758 = 0;
                                    if (var29.field1724 == 65535) {
                                        var29.field1724 = -1;
                                    }
                                    if (var29.field1749 > class186.field2697) {
                                        var29.field1759 = -1;
                                    }
                                    if (~var29.field1724 != 0 && ~class186.field2697 == ~var29.field1749) {
                                        int var41 = class430.field5994.method1993(var29.field1724, 64).field2290;
                                        if (~var41 != 0) {
                                            class403 var42 = class192.field2727.method3090(-89, var41);
                                            if (var42 != null && var42.field5667 != null && !var29.field1764) {
                                                class234.method1476(var29, var42, 0, (byte) 3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var43 = var7 >> 28 & 3;
                    int var44 = (16383 & var7 >> 14) + -class498.field6774;
                    int var45 = (16383 & var7) - class613.field8555;
                    if (~var44 <= -1 && var45 >= 0 && ~class401.field5620 < ~var44 && ~var45 > ~class257.field3508) {
                        int var46 = var44 * 512 + 256;
                        int var47 = var45 * 512 + 256;
                        int var48 = var43;
                        if (var43 < 3 && class467.method2640(var44, var45, (byte) 111)) {
                            var48 = var43 + 1;
                        }
                        class284 var49 = new class284(var9, 0, class186.field2697, var43, var48, var46, class249.method1533(var43, var47, var46, 5) + -var8, var47, var44, var44, var45, var45, 7 & var6);
                        class393.field5553.method1441(new class539(var49), 0);
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class244.field3319) {
                class2.field5 = class660.field9184.method2875(false);
                class700.field9934 = class436.field6066;
                class417.field5889 = null;
                return true;
            } else if (class481.field6622 == class417.field5889) {
                class594.field8313 = class95.field1338 <= 2 ? class65.field814.method555(class697.field9900, true) : class660.field9184.method2851((byte) -105);
                class203.field2864 = class95.field1338 <= 0 ? -1 : class660.field9184.method2845(-1);
                if (~class203.field2864 == -65536) {
                    class203.field2864 = -1;
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class12.field121) {
                int var50 = class660.field9184.method2845(-1);
                int var51 = class660.field9184.method2815(0);
                class578.field8156.method867(var50, var51, 43);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class250.field3407) {
                int var52 = class660.field9184.method2846((byte) -69);
                int var53 = class660.field9184.method2816(0);
                int var54 = class660.field9184.method2840(false);
                int var55 = class660.field9184.method2846((byte) -69);
                int var56 = class660.field9184.method2816(0);
                if (class125.method901(var52, (byte) -97)) {
                    class541.method3052(var53, var56, (byte) 70, var54, var55);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class255.field3487) {
                String var57 = class660.field9184.method2851((byte) -114);
                boolean var58 = ~class660.field9184.method2874((byte) -75) == -2;
                String var59;
                if (var58) {
                    var59 = class660.field9184.method2851((byte) -92);
                } else {
                    var59 = var57;
                }
                int var60 = class660.field9184.method2845(-1);
                byte var61 = class660.field9184.method2863(118);
                boolean var62 = false;
                if (var61 == -128) {
                    var62 = true;
                }
                if (var62) {
                    if (class56.field633 == 0) {
                        class417.field5889 = null;
                        return true;
                    }
                    boolean var63 = false;
                    int var64;
                    for (var64 = 0; var64 < class56.field633 && (!class174.field2525[var64].field3181.equals(var59) || ~class174.field2525[var64].field3184 != ~var60); ++var64) {
                    }
                    if (class56.field633 > var64) {
                        while (~var64 > ~(class56.field633 + -1)) {
                            class174.field2525[var64] = class174.field2525[var64 + 1];
                            ++var64;
                        }
                        --class56.field633;
                        class174.field2525[class56.field633] = null;
                    }
                } else {
                    String var65 = class660.field9184.method2851((byte) -110);
                    class230 var66 = new class230();
                    var66.field3180 = var57;
                    var66.field3181 = var59;
                    var66.field3188 = class430.method2473(15570, var66.field3181);
                    var66.field3182 = var65;
                    var66.field3185 = var61;
                    var66.field3184 = var60;
                    int var67;
                    for (var67 = class56.field633 + -1; ~var67 <= -1; --var67) {
                        int var68 = class174.field2525[var67].field3188.compareTo(var66.field3188);
                        if (var68 == 0) {
                            class174.field2525[var67].field3184 = var60;
                            class174.field2525[var67].field3185 = var61;
                            class174.field2525[var67].field3182 = var65;
                            if (var59.equals(class143.field2063.field9693)) {
                                class422.field5935 = var61;
                            }
                            class417.field5889 = null;
                            class260.field3542 = class436.field6066;
                            return true;
                        }
                        if (var68 < 0) {
                            break;
                        }
                    }
                    if (class174.field2525.length <= class56.field633) {
                        class417.field5889 = null;
                        return true;
                    }
                    for (int var69 = class56.field633 + -1; ~var69 < ~var67; --var69) {
                        class174.field2525[var69 - -1] = class174.field2525[var69];
                    }
                    if (~class56.field633 == -1) {
                        class174.field2525 = new class230[100];
                    }
                    class174.field2525[var67 + 1] = var66;
                    ++class56.field633;
                    if (var59.equals(class143.field2063.field9693)) {
                        class422.field5935 = var61;
                    }
                }
                class260.field3542 = class436.field6066;
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class108.field1498) {
                int var70 = class660.field9184.method2845(-1);
                String var71 = class660.field9184.method2851((byte) -91);
                Object[] var72 = new Object[var71.length() + 1];
                for (int var73 = var71.length() + -1; ~var73 <= -1; --var73) {
                    if (~var71.charAt(var73) == -116) {
                        var72[var73 + 1] = class660.field9184.method2851((byte) -120);
                    } else {
                        var72[var73 + 1] = new Integer(class660.field9184.method2840(false));
                    }
                }
                var72[0] = new Integer(class660.field9184.method2840(false));
                if (class125.method901(var70, (byte) -104)) {
                    class368 var74 = new class368();
                    var74.field4962 = var72;
                    class97.method708(var74);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class327.field4441) {
                class506.method2890((byte) -96, class660.field9184.method2851((byte) -97));
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class118.field1600) {
                int var75 = class660.field9184.method2816(0);
                int var76 = class660.field9184.method2858((byte) -117);
                if (class125.method901(var75, (byte) -95)) {
                    class322.method1930(4, 0, class409.field5813, var76, 5);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class202.field2855) {
                class71.method575(256, class356.field4724);
                class417.field5889 = null;
                return true;
            } else if (class527.field7145 == class417.field5889) {
                class71.method575(256, class425.field5959);
                class417.field5889 = null;
                return true;
            } else if (class614.field8577 == class417.field5889) {
                class71.method575(256, class281.field3847);
                class417.field5889 = null;
                return true;
            } else if (class650.field9020 == class417.field5889) {
                class332.field4478 = class660.field9184.method2874((byte) -75);
                class152.field2221 = class660.field9184.method2831(true);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class24.field301) {
                int var77 = class660.field9184.method2845(-1);
                if (class125.method901(var77, (byte) -126)) {
                    class377.method2159(false);
                }
                class417.field5889 = null;
                return true;
            } else if (class578.field8164 == class417.field5889) {
                class205.method1333(class95.field1338, class660.field9184, -119);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class17.field170) {
                int var78 = class660.field9184.method2816(0);
                if (var78 == 65535) {
                    var78 = -1;
                }
                int var79 = class660.field9184.method2874((byte) -75);
                int var80 = var79 >> 2;
                int var81 = 3 & var79;
                int var82 = class586.field8254[var80];
                int var83 = class660.field9184.method2840(false);
                int var84 = (932772927 & var83) >> 28;
                int var85 = 16383 & var83 >> 14;
                int var86 = var85 - class498.field6774;
                int var87 = var83 & 16383;
                int var88 = var87 - class613.field8555;
                class610.method3422(var88, var80, var82, -5, var81, var84, var78, var86);
                class417.field5889 = null;
                return true;
            } else if (class667.field9343 == class417.field5889) {
                boolean var89 = class660.field9184.method2874((byte) -75) == 1;
                String var90 = class660.field9184.method2851((byte) -121);
                String var91 = var90;
                if (var89) {
                    var91 = class660.field9184.method2851((byte) -70);
                }
                long var92 = class660.field9184.method2849(-2);
                long var94 = (long) class660.field9184.method2845(-1);
                long var96 = (long) class660.field9184.method2819((byte) 72);
                int var98 = class660.field9184.method2874((byte) -75);
                int var99 = class660.field9184.method2845(-1);
                long var100 = (var94 << 32) + var96;
                boolean var102 = false;
                int var103 = 0;
                while (true) {
                    if (~var103 <= -101) {
                        if (var98 <= 1 && class251.method1543(var91, 54)) {
                            var102 = true;
                        }
                        break;
                    }
                    if (~class60.field670[var103] == ~var100) {
                        var102 = true;
                        break;
                    }
                    ++var103;
                }
                if (!var102 && ~class541.field7315 == -1) {
                    class60.field670[class620.field8617] = var100;
                    class620.field8617 = (class620.field8617 + 1) % 100;
                    String var104 = class213.field2984.method3922(var99, false).method3278(class660.field9184, 125);
                    if (~var98 != -3) {
                        if (~var98 != -2) {
                            class398.method2332(var104, var91, 20, var90, false, var99, class171.method1210(-116, var92), var90, 0);
                        } else {
                            class398.method2332(var104, "<img=0>" + var91, 20, var90, false, var99, class171.method1210(-126, var92), "<img=0>" + var90, 0);
                        }
                    } else {
                        class398.method2332(var104, "<img=1>" + var91, 20, var90, false, var99, class171.method1210(-119, var92), "<img=1>" + var90, 0);
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class324.field4415) {
                int var105 = class660.field9184.method2816(0);
                int var106 = class660.field9184.method2815(0);
                int var107 = class660.field9184.method2846((byte) -69);
                if (class125.method901(var107, (byte) -119)) {
                    class622.method3459(var105, var106, 1);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class178.field2580) {
                int var108 = class660.field9184.method2838((byte) -2);
                int var109 = class660.field9184.method2846((byte) -69);
                int[] var110 = new int[4];
                for (int var111 = 0; var111 < 4; ++var111) {
                    var110[var111] = class660.field9184.method2846((byte) -69);
                }
                class393 var112 = (class393) class299.field4071.method970((byte) 89, (long) var109);
                if (var112 != null) {
                    class6.method19(var110, var112.field5552, var108, 3814);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class408.field5805) {
                int var113 = class660.field9184.method2840(false);
                int var114 = class660.field9184.method2838((byte) -2);
                int var115 = class660.field9184.method2838((byte) -2);
                class405.field5676[var115] = var113;
                class524.field7113[var115] = var114;
                class264.field3579[var115] = 1;
                int var116 = class618.field8610[var115] + -1;
                for (int var117 = 0; ~var116 < ~var117; ++var117) {
                    if (var113 >= class693.field9877[var117]) {
                        class264.field3579[var115] = var117 + 2;
                    }
                }
                class620.field8614[class136.method950(class31.field398++, 31)] = var115;
                class417.field5889 = null;
                return true;
            } else if (class422.field5946 == class417.field5889) {
                int var118 = class660.field9184.method2867(-2);
                byte var119 = class660.field9184.method2827(-1655);
                int var120 = class660.field9184.method2845(-1);
                if (class125.method901(var120, (byte) -120)) {
                    class622.method3459(var118, var119, 1);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class148.field2183) {
                class164.field2360 = class660.field9184.method2866(-8154);
                class173.field2517 = class660.field9184.method2874((byte) -75) == 1;
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class123.field1684) {
                int var121 = class660.field9184.method2846((byte) -69);
                int var122 = class660.field9184.method2828((byte) 36);
                int var123 = class660.field9184.method2867(-2);
                if (~var123 == -65536) {
                    var123 = -1;
                }
                int var124 = class660.field9184.method2840(false);
                if (class125.method901(var121, (byte) -109)) {
                    class470.method2658(-70, var122, var123, var124);
                    class661 var125 = class599.field8366.method3949(0, var123);
                    class541.method3052(var125.field9260, var125.field9192, (byte) 123, var124, var125.field9235);
                    class613.method3432(var124, -255, var125.field9263, var125.field9250, var125.field9226);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class234.field3237) {
                class71.method575(256, class77.field1007);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class317.field4358) {
                int var126 = class660.field9184.method2874((byte) -75);
                int var127 = var126 >> 5;
                int var128 = 31 & var126;
                if (~var128 == -1) {
                    class309.field4278[var127] = null;
                    class417.field5889 = null;
                    return true;
                } else {
                    class372 var129 = new class372();
                    var129.field5001 = var128;
                    var129.field5010 = class660.field9184.method2874((byte) -75);
                    if (var129.field5010 >= 0 && ~class671.field9409.length < ~var129.field5010) {
                        if (~var129.field5001 != -2 && var129.field5001 != 10) {
                            if (var129.field5001 >= 2 && var129.field5001 <= 6) {
                                if (~var129.field5001 == -3) {
                                    var129.field5005 = 256;
                                    var129.field5003 = 256;
                                }
                                if (var129.field5001 == 3) {
                                    var129.field5005 = 0;
                                    var129.field5003 = 256;
                                }
                                if (var129.field5001 == 4) {
                                    var129.field5003 = 256;
                                    var129.field5005 = 512;
                                }
                                if (var129.field5001 == 5) {
                                    var129.field5003 = 0;
                                    var129.field5005 = 256;
                                }
                                if (~var129.field5001 == -7) {
                                    var129.field5003 = 512;
                                    var129.field5005 = 256;
                                }
                                var129.field5001 = 2;
                                var129.field5011 = class660.field9184.method2874((byte) -75);
                                var129.field5005 += class660.field9184.method2845(-1) + -class498.field6774 << 9;
                                var129.field5003 += class660.field9184.method2845(-1) - class613.field8555 << 9;
                                var129.field5002 = class660.field9184.method2874((byte) -75) << 2;
                                var129.field5012 = class660.field9184.method2845(-1);
                            }
                        } else {
                            var129.field5009 = class660.field9184.method2845(-1);
                            class660.field9184.field6892 += 6;
                        }
                        var129.field5004 = class660.field9184.method2845(-1);
                        if (~var129.field5004 == -65536) {
                            var129.field5004 = -1;
                        }
                        class309.field4278[var127] = var129;
                    }
                    class417.field5889 = null;
                    return true;
                }
            } else if (class417.field5889 == class192.field2729) {
                int var130 = class660.field9184.method2845(-1);
                class677 var131;
                if (~class409.field5813 != ~var130) {
                    var131 = class671.field9407[var130];
                } else {
                    var131 = class143.field2063;
                }
                if (var131 == null) {
                    class417.field5889 = null;
                    return true;
                } else {
                    int var132 = class660.field9184.method2845(-1);
                    int var133 = class660.field9184.method2874((byte) -75);
                    boolean var134 = (32768 & var132) != 0;
                    if (var131.field9693 != null && var131.field9689 != null) {
                        boolean var135 = false;
                        if (var133 <= 1) {
                            if (var134 || (!class173.field2517 || class5.field37) && !class511.field7018) {
                                if (class251.method1543(var131.field9693, 65)) {
                                    var135 = true;
                                }
                            } else {
                                var135 = true;
                            }
                        }
                        if (!var135 && ~class541.field7315 == -1) {
                            int var136 = -1;
                            String var137;
                            if (!var134) {
                                var137 = class378.method2167(1, class488.method2773(class660.field9184, (byte) 111));
                            } else {
                                var132 &= 32767;
                                class611 var138 = class155.method1105(class660.field9184, 32);
                                var136 = var138.field8475;
                                var137 = var138.field8477.method3278(class660.field9184, 108);
                            }
                            var131.field1709 = var137.trim();
                            var131.field1723 = var132 & 255;
                            var131.field1757 = var132 >> 8;
                            var131.field1755 = 150;
                            int var139;
                            if (var133 != 1 && var133 != 2) {
                                var139 = var134 ? 17 : 2;
                            } else {
                                var139 = !var134 ? 1 : 17;
                            }
                            if (~var133 == -3) {
                                class398.method2332(var137, "<img=1>" + var131.method3849(false, (byte) -66), var139, var131.field9682, false, var136, (String) null, "<img=1>" + var131.method3846(true, (byte) -49), 0);
                            } else if (var133 == 1) {
                                class398.method2332(var137, "<img=0>" + var131.method3849(false, (byte) -66), var139, var131.field9682, false, var136, (String) null, "<img=0>" + var131.method3846(true, (byte) -99), 0);
                            } else {
                                class398.method2332(var137, var131.method3849(false, (byte) -66), var139, var131.field9682, false, var136, (String) null, var131.method3846(true, (byte) -50), 0);
                            }
                        }
                    }
                    class417.field5889 = null;
                    return true;
                }
            } else if (class417.field5889 == class325.field4422) {
                int var140 = class660.field9184.method2874((byte) -75);
                int var141 = class660.field9184.method2867(-2);
                int var142 = class660.field9184.method2816(0);
                if (class125.method901(var141, (byte) -118)) {
                    if (var140 == 2) {
                        class328.method1952(-23176);
                    }
                    class631.field8758 = var142;
                    class319.method1922(var142, -1);
                    class546.method3075(false, 0);
                    class97.method705(class631.field8758);
                    for (int var143 = 0; var143 < 100; ++var143) {
                        class130.field1872[var143] = true;
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class671.field9418 == class417.field5889) {
                int var144 = class660.field9184.method2845(-1);
                int var145 = class660.field9184.method2845(-1);
                int var146 = class660.field9184.method2845(-1);
                int var147 = class660.field9184.method2845(-1);
                if (class125.method901(var144, (byte) -102) && class167.field2439[var145] != null) {
                    for (int var148 = var146; ~var148 > ~var147; ++var148) {
                        int var149 = class660.field9184.method2819((byte) 72);
                        if (~class167.field2439[var145].length < ~var148 && class167.field2439[var145][var148] != null) {
                            class167.field2439[var145][var148].field1094 = var149;
                        }
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class76.field994 == class417.field5889) {
                class533.field7214 = class660.field9184.method2874((byte) -75);
                class417.field5889 = null;
                return true;
            } else if (class492.field6729 == class417.field5889) {
                class71.method575(256, class700.field9932);
                class417.field5889 = null;
                return true;
            } else if (class88.field1265 == class417.field5889) {
                int var150 = class660.field9184.method2846((byte) -69);
                int var151 = class660.field9184.method2840(false);
                String var152 = class660.field9184.method2851((byte) -73);
                if (class125.method901(var150, (byte) -98)) {
                    class65.method553(var151, var152, 17667);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class279.field3821) {
                class71.method575(256, class413.field5851);
                class417.field5889 = null;
                return true;
            } else if (class630.field8744 == class417.field5889) {
                class71.method575(256, class23.field281);
                class417.field5889 = null;
                return true;
            } else if (class463.field6374 == class417.field5889) {
                int var153 = class660.field9184.method2874((byte) -75);
                boolean var154 = (var153 & 1) == 1;
                String var155 = class660.field9184.method2851((byte) -101);
                String var156 = class660.field9184.method2851((byte) -92);
                if (var156.equals("")) {
                    var156 = var155;
                }
                String var157 = class660.field9184.method2851((byte) -96);
                String var158 = class660.field9184.method2851((byte) -93);
                if (var158.equals("")) {
                    var158 = var157;
                }
                if (!var154) {
                    class356.field4722[class165.field2390] = var155;
                    class59.field663[class165.field2390] = var156;
                    class238.field3258[class165.field2390] = var157;
                    class281.field3845[class165.field2390] = var158;
                    class355.field4707[class165.field2390] = class136.method950(2, var153) == 2;
                    ++class165.field2390;
                } else {
                    for (int var159 = 0; var159 < class165.field2390; ++var159) {
                        if (class59.field663[var159].equals(var158)) {
                            class356.field4722[var159] = var155;
                            class59.field663[var159] = var156;
                            class238.field3258[var159] = var157;
                            class281.field3845[var159] = var158;
                            break;
                        }
                    }
                }
                class417.field5889 = null;
                class433.field6034 = class436.field6066;
                return true;
            } else if (class44.field534 == class417.field5889) {
                class578.field8156.method866(0);
                class29.field365 += 32;
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class149.field2201) {
                class9.method35((byte) -125, false);
                class417.field5889 = null;
                return false;
            } else if (class417.field5889 == class357.field4740) {
                String var160 = class660.field9184.method2851((byte) -87);
                int var161 = class660.field9184.method2845(-1);
                String var162 = class213.field2984.method3922(var161, false).method3278(class660.field9184, 124);
                class398.method2332(var162, var160, 19, var160, false, var161, (String) null, var160, 0);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class129.field1849) {
                boolean var163 = ~class660.field9184.method2874((byte) -75) == -2;
                String var164 = class660.field9184.method2851((byte) -86);
                String var165 = var164;
                if (var163) {
                    var165 = class660.field9184.method2851((byte) -124);
                }
                long var166 = (long) class660.field9184.method2845(-1);
                long var168 = (long) class660.field9184.method2819((byte) 72);
                int var170 = class660.field9184.method2874((byte) -75);
                int var171 = class660.field9184.method2845(-1);
                long var172 = (var166 << 32) + var168;
                boolean var174 = false;
                int var175 = 0;
                while (true) {
                    if (var175 >= 100) {
                        if (~var170 >= -2 && class251.method1543(var165, -105)) {
                            var174 = true;
                        }
                        break;
                    }
                    if (~class60.field670[var175] == ~var172) {
                        var174 = true;
                        break;
                    }
                    ++var175;
                }
                if (!var174 && class541.field7315 == 0) {
                    class60.field670[class620.field8617] = var172;
                    class620.field8617 = (class620.field8617 + 1) % 100;
                    String var176 = class213.field2984.method3922(var171, false).method3278(class660.field9184, 111);
                    if (~var170 == -3) {
                        class398.method2332(var176, "<img=1>" + var165, 18, var164, false, var171, (String) null, "<img=1>" + var164, 0);
                    } else if (var170 == 1) {
                        class398.method2332(var176, "<img=0>" + var165, 18, var164, false, var171, (String) null, "<img=0>" + var164, 0);
                    } else {
                        class398.method2332(var176, var165, 18, var164, false, var171, (String) null, var164, 0);
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class3.field18) {
                boolean var177 = ~class660.field9184.method2874((byte) -75) == -2;
                String var178 = class660.field9184.method2851((byte) -84);
                String var179 = var178;
                if (var177) {
                    var179 = class660.field9184.method2851((byte) -126);
                }
                int var180 = class660.field9184.method2874((byte) -75);
                boolean var181 = false;
                if (~var180 >= -2) {
                    if ((!class173.field2517 || class5.field37) && !class511.field7018) {
                        if (var180 <= 1 && class251.method1543(var179, 72)) {
                            var181 = true;
                        }
                    } else {
                        var181 = true;
                    }
                }
                if (!var181 && class541.field7315 == 0) {
                    String var182 = class378.method2167(1, class488.method2773(class660.field9184, (byte) 111));
                    if (~var180 == -3) {
                        class398.method2332(var182, "<img=1>" + var179, 24, var178, false, -1, (String) null, "<img=1>" + var178, 0);
                    } else if (~var180 != -2) {
                        class398.method2332(var182, var179, 24, var178, false, -1, (String) null, var178, 0);
                    } else {
                        class398.method2332(var182, "<img=0>" + var179, 24, var178, false, -1, (String) null, "<img=0>" + var178, 0);
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class270.field3672) {
                class71.method575(256, class283.field3876);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class193.field2744) {
                int var183 = class660.field9184.method2845(-1);
                if (~var183 == -65536) {
                    var183 = -1;
                }
                int var184 = class660.field9184.method2874((byte) -75);
                int var185 = class660.field9184.method2845(-1);
                int var186 = class660.field9184.method2874((byte) -75);
                int var187 = class660.field9184.method2845(-1);
                class586.method3335(var187, var184, 0, false, var183, var186, var185);
                class417.field5889 = null;
                return true;
            } else if (class430.field6014 == class417.field5889) {
                int var188 = class660.field9184.method2867(-2);
                int var189 = class660.field9184.method2867(-2);
                int var190 = class660.field9184.method2846((byte) -69);
                int var191 = class660.field9184.method2840(false);
                int var192 = class660.field9184.method2846((byte) -69);
                if (class125.method901(var192, (byte) -127)) {
                    class322.method1930(4, var189, var190 | var188 << 16, var191, 7);
                }
                class417.field5889 = null;
                return true;
            } else if (class78.field1187 == class417.field5889) {
                class71.method575(256, class357.field4732);
                class417.field5889 = null;
                return true;
            } else if (class487.field6690 == class417.field5889) {
                int var193 = class660.field9184.method2874((byte) -75);
                int var194 = class660.field9184.method2874((byte) -75);
                if (~var193 == -256) {
                    var194 = -1;
                    var193 = -1;
                }
                class330.method1961(var193, 8, var194);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class319.field4371) {
                int var195 = class660.field9184.method2858((byte) -56);
                int var196 = class660.field9184.method2867(-2);
                int var197 = class660.field9184.method2838((byte) -2);
                if (class125.method901(var196, (byte) -126)) {
                    class416.method2407(var195, var197, (byte) -128);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class322.field4398) {
                int var198 = class660.field9184.method2845(-1);
                byte var199 = class660.field9184.method2863(109);
                class578.field8156.method867(var198, var199, -120);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class10.field97) {
                String var200 = class660.field9184.method2851((byte) -115);
                String var201 = class378.method2167(1, class488.method2773(class660.field9184, (byte) 111));
                class628.method3510(var200, -1, 0, 6, var200, var201, var200);
                class417.field5889 = null;
                return true;
            } else if (class616.field8605 == class417.field5889) {
                class71.method575(256, class285.field3912);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class129.field1837) {
                for (int var202 = 0; ~var202 > ~class671.field9407.length; ++var202) {
                    if (class671.field9407[var202] != null) {
                        class671.field9407[var202].field1735 = null;
                        class671.field9407[var202].field1779 = -1;
                    }
                }
                for (int var203 = 0; ~var203 > ~class254.field3465; ++var203) {
                    class31.field400[var203].field5552.field1735 = null;
                    class31.field400[var203].field5552.field1779 = -1;
                }
                class417.field5889 = null;
                return true;
            } else if (class613.field8516 == class417.field5889) {
                int var204 = class660.field9184.method2867(-2);
                int var205 = class660.field9184.method2828((byte) 36);
                if (class125.method901(var204, (byte) -108)) {
                    class322.method1930(4, -1, -1, var205, 3);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class302.field4201) {
                class112.method809(class95.field1338, class543.field7374, false, class660.field9184);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class291.field4001) {
                class270.method1647(-9497);
                class417.field5889 = null;
                return false;
            } else if (class417.field5889 == class167.field2431) {
                class71.method575(256, class594.field8308);
                class417.field5889 = null;
                return true;
            } else if (class90.field1291 == class417.field5889) {
                class71.method575(256, class31.field394);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class219.field3067) {
                boolean var206 = class660.field9184.method2874((byte) -75) == 1;
                String var207 = class660.field9184.method2851((byte) -91);
                String var208 = var207;
                if (var206) {
                    var208 = class660.field9184.method2851((byte) -127);
                }
                int var209 = class660.field9184.method2874((byte) -75);
                int var210 = class660.field9184.method2845(-1);
                boolean var211 = false;
                if (~var209 >= -2 && class251.method1543(var208, -108)) {
                    var211 = true;
                }
                if (!var211 && ~class541.field7315 == -1) {
                    String var212 = class213.field2984.method3922(var210, false).method3278(class660.field9184, 121);
                    if (var209 == 2) {
                        class398.method2332(var212, "<img=1>" + var208, 25, var207, false, var210, (String) null, "<img=1>" + var207, 0);
                    } else if (var209 == 1) {
                        class398.method2332(var212, "<img=0>" + var208, 25, var207, false, var210, (String) null, "<img=0>" + var207, 0);
                    } else {
                        class398.method2332(var212, var208, 25, var207, false, var210, (String) null, var207, 0);
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class393.field5555) {
                class71.method575(256, class89.field1280);
                class417.field5889 = null;
                return true;
            } else if (class418.field5911 == class417.field5889) {
                class9.method35((byte) -123, class75.field991);
                class417.field5889 = null;
                return false;
            } else if (class66.field859 == class417.field5889) {
                int var213 = class660.field9184.method2845(-1);
                int var214 = class660.field9184.method2874((byte) -75);
                int var215 = class660.field9184.method2874((byte) -75);
                int var216 = class660.field9184.method2845(-1) << 2;
                int var217 = class660.field9184.method2874((byte) -75);
                int var218 = class660.field9184.method2874((byte) -75);
                if (class125.method901(var213, (byte) -105)) {
                    class361.method2062(var215, false, var217, var218, var214, var216);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class380.field5076) {
                class25.field320 = class660.field9184.method2874((byte) -75);
                class417.field5889 = null;
                class700.field9934 = class436.field6066;
                return true;
            } else if (class653.field9086 == class417.field5889) {
                class165.field2390 = class660.field9184.method2874((byte) -75);
                for (int var219 = 0; ~class165.field2390 < ~var219; ++var219) {
                    class356.field4722[var219] = class660.field9184.method2851((byte) -76);
                    class59.field663[var219] = class660.field9184.method2851((byte) -123);
                    if (class59.field663[var219].equals("")) {
                        class59.field663[var219] = class356.field4722[var219];
                    }
                    class238.field3258[var219] = class660.field9184.method2851((byte) -102);
                    class281.field3845[var219] = class660.field9184.method2851((byte) -78);
                    if (class281.field3845[var219].equals("")) {
                        class281.field3845[var219] = class238.field3258[var219];
                    }
                    class355.field4707[var219] = false;
                }
                class433.field6034 = class436.field6066;
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class158.field2306) {
                class433.field6034 = class436.field6066;
                class417.field5889 = null;
                class533.field7204 = 1;
                return true;
            } else if (class58.field657 == class417.field5889) {
                int var220 = class660.field9184.method2845(-1);
                if (class125.method901(var220, (byte) -116)) {
                    class637.method3561(-1);
                }
                class417.field5889 = null;
                return true;
            } else if (class489.field6704 == class417.field5889) {
                int var221 = class660.field9184.method2845(-1);
                int var222 = class660.field9184.method2874((byte) -75);
                int var223 = class660.field9184.method2874((byte) -75);
                int var224 = class660.field9184.method2874((byte) -75);
                int var225 = class660.field9184.method2874((byte) -75);
                int var226 = class660.field9184.method2845(-1);
                if (class125.method901(var221, (byte) -128)) {
                    class524.field7115[var222] = true;
                    class44.field537[var222] = var223;
                    class100.field1406[var222] = var224;
                    class534.field7224[var222] = var225;
                    class81.field1215[var222] = var226;
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class392.field5546) {
                class586.field8253 = class574.method3277(class660.field9184.method2874((byte) -75), -2604);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class351.field4676) {
                int var227 = class660.field9184.method2843(7592);
                int var228 = class660.field9184.method2816(0);
                if (~var228 == -65536) {
                    var228 = -1;
                }
                int var229 = class660.field9184.method2831(true);
                class653.method3684(var228, (byte) 72, var229, var227);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class130.field1866) {
                int var230 = class660.field9184.method2868((byte) 125);
                int var231 = class660.field9184.method2867(-2);
                if (~var231 == -65536) {
                    var231 = -1;
                }
                int var232 = class660.field9184.method2831(true);
                class489.method2776(var232, var230, 0, var231);
                class417.field5889 = null;
                return true;
            } else if (class607.field8446 == class417.field5889) {
                int var233 = class660.field9184.method2867(-2);
                if (~var233 == -65536) {
                    var233 = -1;
                }
                int var234 = class660.field9184.method2867(-2);
                int var235 = class660.field9184.method2840(false);
                int var236 = class660.field9184.method2867(-2);
                int var237 = class660.field9184.method2816(0);
                if (~var237 == -65536) {
                    var237 = -1;
                }
                if (class125.method901(var236, (byte) -122)) {
                    for (int var238 = var237; var238 <= var233; ++var238) {
                        long var239 = ((long) var235 << 32) - -((long) var238);
                        class303 var241 = (class303) class322.field4400.method970((byte) 89, var239);
                        class303 var242;
                        if (var241 == null) {
                            if (~var238 == 0) {
                                var242 = new class303(class582.method3319((byte) -12, var235).field1090.field4217, var234);
                            } else {
                                var242 = new class303(0, var234);
                            }
                        } else {
                            var242 = new class303(var241.field4217, var234);
                            var241.method2340(-91);
                        }
                        class322.field4400.method968(var239, var242, -1);
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class182.field2629) {
                if (!class680.method3860(8, class285.field3921)) {
                    class37.field444 = 30 * class660.field9184.method2845(-1);
                } else {
                    class37.field444 = (int) ((float) class660.field9184.method2845(-1) * 2.5F);
                }
                class417.field5889 = null;
                class700.field9934 = class436.field6066;
                return true;
            } else if (class417.field5889 == class341.field4576) {
                boolean var243 = ~class660.field9184.method2874((byte) -75) == -2;
                String var244 = class660.field9184.method2851((byte) -70);
                String var245 = var244;
                if (var243) {
                    var245 = class660.field9184.method2851((byte) -124);
                }
                long var246 = class660.field9184.method2849(-2);
                long var248 = (long) class660.field9184.method2845(-1);
                long var250 = (long) class660.field9184.method2819((byte) 72);
                int var252 = class660.field9184.method2874((byte) -75);
                long var253 = (var248 << 32) - -var250;
                boolean var255 = false;
                int var256 = 0;
                while (true) {
                    if (var256 >= 100) {
                        if (~var252 >= -2) {
                            if ((!class173.field2517 || class5.field37) && !class511.field7018) {
                                if (class251.method1543(var245, -60)) {
                                    var255 = true;
                                }
                            } else {
                                var255 = true;
                            }
                        }
                        break;
                    }
                    if (class60.field670[var256] == var253) {
                        var255 = true;
                        break;
                    }
                    ++var256;
                }
                if (!var255 && class541.field7315 == 0) {
                    class60.field670[class620.field8617] = var253;
                    class620.field8617 = (class620.field8617 + 1) % 100;
                    String var257 = class378.method2167(1, class488.method2773(class660.field9184, (byte) 111));
                    if (~var252 != -3 && var252 != 3) {
                        if (var252 == 1) {
                            class398.method2332(var257, "<img=0>" + var245, 9, var244, false, -1, class171.method1210(-118, var246), "<img=0>" + var244, 0);
                        } else {
                            class398.method2332(var257, var245, 9, var244, false, -1, class171.method1210(-115, var246), var244, 0);
                        }
                    } else {
                        class398.method2332(var257, "<img=1>" + var245, 9, var244, false, -1, class171.method1210(-123, var246), "<img=1>" + var244, 0);
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class620.field8631 == class417.field5889) {
                int var258 = class660.field9184.method2858((byte) -128);
                int var259 = class660.field9184.method2816(0);
                int var260 = class660.field9184.method2816(0);
                if (class125.method901(var259, (byte) -85)) {
                    class595.method3364(var260, var258, 6);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class114.field1577) {
                int var261 = class660.field9184.method2846((byte) -69);
                String var262 = class660.field9184.method2851((byte) -75);
                int var263 = class660.field9184.method2867(-2);
                if (class125.method901(var263, (byte) -110)) {
                    class62.method514(var262, false, var261);
                }
                class417.field5889 = null;
                return true;
            } else if (class558.field7529 == class417.field5889) {
                int var264 = class660.field9184.method2840(false);
                int var265 = class660.field9184.method2816(0);
                if (var265 == 65535) {
                    var265 = -1;
                }
                int var266 = class660.field9184.method2846((byte) -69);
                if (class125.method901(var266, (byte) -111)) {
                    class322.method1930(4, -1, var265, var264, 1);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class391.field5541) {
                int var267 = class660.field9184.method2846((byte) -69);
                int var268 = class660.field9184.method2858((byte) -55);
                class578.field8156.method873(var267, -110, var268);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class192.field2726) {
                class457.method2609((byte) -27);
                class417.field5889 = null;
                return false;
            } else if (class417.field5889 == class274.field3798) {
                class190.field2723 = class660.field9184.method2876((byte) 70) << 3;
                class486.field6679 = class660.field9184.method2863(107) << 3;
                class190.field2724 = class660.field9184.method2838((byte) -2);
                for (class385 var269 = (class385) class687.field9801.method977(0); var269 != null; var269 = (class385) class687.field9801.method975(-1)) {
                    int var271 = (int) (3L & var269.field5623 >> 28);
                    int var272 = (int) (16383L & var269.field5623);
                    int var273 = -class498.field6774 + var272;
                    int var274 = (int) (16383L & var269.field5623 >> 14);
                    int var275 = var274 - class613.field8555;
                    if (class190.field2724 == var271 && var273 >= class190.field2723 && ~var273 > ~(class190.field2723 + 8) && class486.field6679 <= var275 && ~(class486.field6679 + 8) < ~var275) {
                        var269.method2340(103);
                        if (var273 >= 0 && var275 >= 0 && ~var273 > ~class401.field5620 && ~var275 > ~class257.field3508) {
                            class672.method3793((byte) 92, var275, class190.field2724, var273);
                        }
                    }
                }
                for (class81 var270 = (class81) class645.field8903.method1436(28964); var270 != null; var270 = (class81) class645.field8903.method1443((byte) 6)) {
                    if (var270.field1219 >= class190.field2723 && class190.field2723 + 8 > var270.field1219 && ~var270.field1220 <= ~class486.field6679 && ~var270.field1220 > ~(class486.field6679 - -8) && ~class190.field2724 == ~var270.field1227) {
                        var270.field1213 = 0;
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class492.field6726 == class417.field5889) {
                while (class95.field1338 > class660.field9184.field6892) {
                    boolean var286 = ~class660.field9184.method2874((byte) -75) == -2;
                    String var287 = class660.field9184.method2851((byte) -121);
                    String var288 = class660.field9184.method2851((byte) -127);
                    int var289 = class660.field9184.method2845(-1);
                    int var290 = class660.field9184.method2874((byte) -75);
                    String var291 = "";
                    boolean var292 = false;
                    if (~var289 < -1) {
                        var291 = class660.field9184.method2851((byte) -85);
                        var292 = ~class660.field9184.method2874((byte) -75) == -2;
                    }
                    for (int var293 = 0; var293 < class671.field9419; ++var293) {
                        if (!var286) {
                            if (var287.equals(class696.field9891[var293])) {
                                if (class531.field7187[var293] != var289) {
                                    boolean var294 = true;
                                    for (class559 var295 = (class559) class562.field7588.method3898((byte) -55); var295 != null; var295 = (class559) class562.field7588.method3902(true)) {
                                        if (var295.field7535.equals(var287)) {
                                            if (var289 != 0 && ~var295.field7537 == -1) {
                                                var295.method3074((byte) 48);
                                                var294 = false;
                                            } else if (var289 == 0 && ~var295.field7537 != -1) {
                                                var294 = false;
                                                var295.method3074((byte) 48);
                                            }
                                        }
                                    }
                                    if (var294) {
                                        class562.field7588.method3906(new class559(var287, var289), (byte) -19);
                                    }
                                    class531.field7187[var293] = var289;
                                }
                                class287.field3952[var293] = var288;
                                class423.field5950[var293] = var291;
                                class389.field5497[var293] = var290;
                                var287 = null;
                                class29.field366[var293] = var292;
                                break;
                            }
                        } else if (var288.equals(class696.field9891[var293])) {
                            class696.field9891[var293] = var287;
                            class287.field3952[var293] = var288;
                            var287 = null;
                            break;
                        }
                    }
                    if (var287 != null && class671.field9419 < 200) {
                        class696.field9891[class671.field9419] = var287;
                        class287.field3952[class671.field9419] = var288;
                        class531.field7187[class671.field9419] = var289;
                        class423.field5950[class671.field9419] = var291;
                        class389.field5497[class671.field9419] = var290;
                        class29.field366[class671.field9419] = var292;
                        ++class671.field9419;
                    }
                }
                class433.field6034 = class436.field6066;
                class533.field7204 = 2;
                boolean var276 = false;
                int var277 = class671.field9419;
                while (~var277 < -1) {
                    --var277;
                    boolean var278 = true;
                    for (int var279 = 0; var277 > var279; ++var279) {
                        if (~class531.field7187[var279] != ~class651.field9040.field2475 && class531.field7187[var279 + 1] == class651.field9040.field2475 || class531.field7187[var279] == 0 && class531.field7187[var279 + 1] != 0) {
                            int var280 = class531.field7187[var279];
                            class531.field7187[var279] = class531.field7187[var279 + 1];
                            class531.field7187[var279 + 1] = var280;
                            String var281 = class423.field5950[var279];
                            class423.field5950[var279] = class423.field5950[var279 + 1];
                            class423.field5950[var279 + 1] = var281;
                            String var282 = class696.field9891[var279];
                            class696.field9891[var279] = class696.field9891[var279 + 1];
                            class696.field9891[var279 + 1] = var282;
                            String var283 = class287.field3952[var279];
                            class287.field3952[var279] = class287.field3952[var279 + 1];
                            class287.field3952[var279 - -1] = var283;
                            int var284 = class389.field5497[var279];
                            class389.field5497[var279] = class389.field5497[var279 + 1];
                            class389.field5497[var279 + 1] = var284;
                            boolean var285 = class29.field366[var279];
                            class29.field366[var279] = class29.field366[var279 + 1];
                            var278 = false;
                            class29.field366[var279 + 1] = var285;
                        }
                    }
                    if (var278) {
                        break;
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class93.field1328 == class417.field5889) {
                if (class54.field613 != null) {
                    class75.method584(-1, false, class366.field4875.field9370, -1, (byte) 72);
                }
                byte[] var296 = new byte[class95.field1338];
                class660.field9184.method2597(class95.field1338, 0, var296, false);
                String var297 = class148.method1088(class95.field1338, (byte) 124, var296, 0);
                class556.method3116(true, var297, false, ~class503.field6917 == -2, class543.field7374);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class231.field3198) {
                int var298 = class660.field9184.method2846((byte) -69);
                if (var298 == 65535) {
                    var298 = -1;
                }
                int var299 = class660.field9184.method2840(false);
                int var300 = class660.field9184.method2846((byte) -69);
                if (class125.method901(var300, (byte) -111)) {
                    class209.method1356(var299, 1, var298);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class249.field3397) {
                class190.field2724 = class660.field9184.method2838((byte) -2);
                class190.field2723 = class660.field9184.method2876((byte) 37) << 3;
                class486.field6679 = class660.field9184.method2863(107) << 3;
                while (~class660.field9184.field6892 > ~class95.field1338) {
                    class596 var301 = class636.method3550(true)[class660.field9184.method2874((byte) -75)];
                    class71.method575(256, var301);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class362.field4771) {
                if (~class631.field8758 != 0) {
                    class295.method1799((byte) -68, class631.field8758, 0);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class10.field98) {
                int var302 = class660.field9184.method2845(-1);
                int var303 = class660.field9184.method2840(false);
                if (class125.method901(var302, (byte) -123)) {
                    class685 var304 = (class685) class4.field26.method970((byte) 89, (long) var303);
                    if (var304 != null) {
                        class17.method83(true, var304, -8501, false);
                    }
                    if (class578.field8165 != null) {
                        class26.method255(class578.field8165, -20229);
                        class578.field8165 = null;
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class321.field4385) {
                int var305 = class660.field9184.method2815(0);
                int var306 = class660.field9184.method2816(0);
                int var307 = class660.field9184.method2815(0);
                if (class125.method901(var306, (byte) -120)) {
                    class685 var308 = (class685) class4.field26.method970((byte) 89, (long) var307);
                    class685 var309 = (class685) class4.field26.method970((byte) 89, (long) var305);
                    if (var309 != null) {
                        class17.method83(var308 == null || var308.field9776 != var309.field9776, var309, -8501, false);
                    }
                    if (var308 != null) {
                        var308.method2340(-116);
                        class4.field26.method968((long) var305, var308, -1);
                    }
                    class78 var310 = class582.method3319((byte) -41, var307);
                    if (var310 != null) {
                        class26.method255(var310, -20229);
                    }
                    class78 var311 = class582.method3319((byte) -35, var305);
                    if (var311 != null) {
                        class26.method255(var311, -20229);
                        class543.method3063(var311, (byte) 103, true);
                    }
                    if (class631.field8758 != -1) {
                        class295.method1799((byte) -68, class631.field8758, 1);
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class222.field3094) {
                class606.method3409(86);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class224.field3123) {
                class417.field5889 = null;
                return false;
            } else if (class521.field7083 == class417.field5889) {
                int var312 = class660.field9184.method2831(true);
                int var313 = class660.field9184.method2831(true);
                int var314 = class660.field9184.method2845(-1);
                if (~var314 == -65536) {
                    var314 = -1;
                }
                String var315 = class660.field9184.method2851((byte) -108);
                if (~var313 <= -2 && ~var313 >= -9) {
                    if (var315.equalsIgnoreCase("null")) {
                        var315 = null;
                    }
                    class193.field2733[var313 + -1] = var315;
                    class418.field5904[var313 - 1] = var314;
                    class426.field5967[var313 + -1] = var312 == 0;
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class33.field409) {
                int var316 = class660.field9184.method2845(-1);
                int var317 = class660.field9184.method2874((byte) -75);
                int var318 = class660.field9184.method2874((byte) -75);
                int var319 = class660.field9184.method2845(-1) << 2;
                int var320 = class660.field9184.method2874((byte) -75);
                int var321 = class660.field9184.method2874((byte) -75);
                if (class125.method901(var316, (byte) -123)) {
                    class88.method644(100, var317, true, var321, var320, var319, var318);
                }
                class417.field5889 = null;
                return true;
            } else if (class561.field7580 == class417.field5889) {
                int var322 = class660.field9184.method2816(0);
                int var323 = class660.field9184.method2815(0);
                int var324 = class660.field9184.method2840(false);
                int var325 = class660.field9184.method2846((byte) -69);
                if (class125.method901(var322, (byte) -116)) {
                    class322.method1930(4, var323, var325, var324, 5);
                }
                class417.field5889 = null;
                return true;
            } else if (class444.field6146 == class417.field5889) {
                int var326 = class660.field9184.method2867(-2);
                int var327 = class660.field9184.method2846((byte) -69);
                int var328 = class660.field9184.method2828((byte) 36);
                if (class125.method901(var326, (byte) -110)) {
                    class36.method317(var328, var327, 14);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class329.field4449) {
                class190.field2724 = class660.field9184.method2831(true);
                class486.field6679 = class660.field9184.method2863(109) << 3;
                class190.field2723 = class660.field9184.method2863(98) << 3;
                class417.field5889 = null;
                return true;
            } else if (class657.field9129 == class417.field5889) {
                int var329 = class660.field9184.method2875(false);
                int var330 = class660.field9184.method2815(0);
                int var331 = class660.field9184.method2816(0);
                if (class125.method901(var331, (byte) -105)) {
                    class31.method299(var329, -28098, var330);
                }
                class417.field5889 = null;
                return true;
            } else if (class676.field9654 == class417.field5889) {
                String var332 = class660.field9184.method2851((byte) -110);
                int var333 = class660.field9184.method2846((byte) -69);
                int var334 = class660.field9184.method2845(-1);
                if (class125.method901(var333, (byte) -124)) {
                    class62.method514(var332, false, var334);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class228.field3166) {
                int var335 = class660.field9184.method2816(0);
                int var336 = class660.field9184.method2858((byte) -80);
                int var337 = class660.field9184.method2840(false);
                int var338 = class660.field9184.method2816(0);
                if (~var338 == -65536) {
                    var338 = -1;
                }
                int var339 = class660.field9184.method2845(-1);
                if (var339 == 65535) {
                    var339 = -1;
                }
                if (class125.method901(var335, (byte) -95)) {
                    for (int var340 = var338; ~var339 <= ~var340; ++var340) {
                        long var341 = ((long) var336 << 32) + (long) var340;
                        class303 var343 = (class303) class322.field4400.method970((byte) 89, var341);
                        class303 var344;
                        if (var343 != null) {
                            var344 = new class303(var337, var343.field4207);
                            var343.method2340(-119);
                        } else if (var340 == -1) {
                            var344 = new class303(var337, class582.method3319((byte) -28, var336).field1090.field4207);
                        } else {
                            var344 = new class303(var337, -1);
                        }
                        class322.field4400.method968(var341, var344, -1);
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class450.field6170 == class417.field5889) {
                int var345 = class660.field9184.method2845(-1);
                if (var345 == 65535) {
                    var345 = -1;
                }
                int var346 = class660.field9184.method2874((byte) -75);
                int var347 = class660.field9184.method2845(-1);
                int var348 = class660.field9184.method2874((byte) -75);
                class586.method3335(256, var346, 0, true, var345, var348, var347);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class274.field3799) {
                class475.method2680((byte) 76);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class31.field395) {
                int var349 = class660.field9184.method2828((byte) 36);
                int var350 = class660.field9184.method2867(-2);
                if (class125.method901(var350, (byte) -99)) {
                    if (var349 != -1) {
                        int var351 = (268428692 & var349) >> 14;
                        int var352 = 16383 & var349;
                        int var353 = var351 - class498.field6774;
                        if (~var353 <= -1) {
                            if (class401.field5620 <= var353) {
                                var353 = class401.field5620;
                            }
                        } else {
                            var353 = 0;
                        }
                        int var354 = var352 - class613.field8555;
                        class199.field2832 = (var353 << 9) - -256;
                        if (var354 >= 0) {
                            if (class257.field3508 <= var354) {
                                var354 = class257.field3508;
                            }
                        } else {
                            var354 = 0;
                        }
                        class560.field7547 = (var354 << 9) + 256;
                    } else {
                        class560.field7547 = -1;
                        class199.field2832 = -1;
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class544.field7392 == class417.field5889) {
                int var355 = class660.field9184.method2858((byte) -104);
                int var356 = class660.field9184.method2846((byte) -69);
                int var357 = class660.field9184.method2816(0);
                if (class125.method901(var356, (byte) -92)) {
                    class477.method2693(var357, false, var355);
                }
                class417.field5889 = null;
                return true;
            } else if (class483.field6638 == class417.field5889) {
                int var358 = class660.field9184.method2845(-1);
                int var359 = class660.field9184.method2874((byte) -75);
                boolean var360 = (1 & var359) == 1;
                class283.method1744(var360, var358, 34);
                int var361 = class660.field9184.method2845(-1);
                for (int var362 = 0; ~var361 < ~var362; ++var362) {
                    int var363 = class660.field9184.method2838((byte) -2);
                    if (var363 == 255) {
                        var363 = class660.field9184.method2815(0);
                    }
                    int var364 = class660.field9184.method2816(0);
                    class230.method1450(35, var358, var363, var362, var360, var364 + -1);
                }
                class385.field5461[class136.method950(31, class339.field4547++)] = var358;
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class324.field4420) {
                int var365 = class660.field9184.method2828((byte) 36);
                int var366 = class660.field9184.method2816(0);
                if (var366 == 65535) {
                    var366 = -1;
                }
                int var367 = class660.field9184.method2816(0);
                if (class125.method901(var367, (byte) -103)) {
                    class322.method1930(4, -1, var366, var365, 2);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class355.field4710) {
                int var368 = class660.field9184.method2846((byte) -69);
                int var369 = class660.field9184.method2838((byte) -2);
                class578.field8156.method873(var368, -109, var369);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class164.field2355) {
                int var370 = class660.field9184.method2816(0);
                int var371 = class660.field9184.method2838((byte) -2);
                if (class125.method901(var370, (byte) -122)) {
                    class100.field1389 = var371;
                }
                class417.field5889 = null;
                return true;
            } else if (class622.field8640 == class417.field5889) {
                boolean var372 = class660.field9184.method2874((byte) -75) == 1;
                String var373 = class660.field9184.method2851((byte) -78);
                String var374 = var373;
                if (var372) {
                    var374 = class660.field9184.method2851((byte) -106);
                }
                long var375 = (long) class660.field9184.method2845(-1);
                long var377 = (long) class660.field9184.method2819((byte) 72);
                int var379 = class660.field9184.method2874((byte) -75);
                long var380 = (var375 << 32) - -var377;
                boolean var382 = false;
                int var383 = 0;
                while (true) {
                    if (~var383 <= -101) {
                        if (var379 <= 1) {
                            if ((!class173.field2517 || class5.field37) && !class511.field7018) {
                                if (class251.method1543(var374, -78)) {
                                    var382 = true;
                                }
                            } else {
                                var382 = true;
                            }
                        }
                        break;
                    }
                    if (class60.field670[var383] == var380) {
                        var382 = true;
                        break;
                    }
                    ++var383;
                }
                if (!var382 && ~class541.field7315 == -1) {
                    class60.field670[class620.field8617] = var380;
                    class620.field8617 = (class620.field8617 + 1) % 100;
                    String var384 = class378.method2167(1, class488.method2773(class660.field9184, (byte) 111));
                    if (~var379 != -3) {
                        if (var379 != 1) {
                            class398.method2332(var384, var374, 3, var373, false, -1, (String) null, var373, 0);
                        } else {
                            class398.method2332(var384, "<img=0>" + var374, 7, var373, false, -1, (String) null, "<img=0>" + var373, 0);
                        }
                    } else {
                        class398.method2332(var384, "<img=1>" + var374, 7, var373, false, -1, (String) null, "<img=1>" + var373, 0);
                    }
                }
                class417.field5889 = null;
                return true;
            } else if (class652.field9049 == class417.field5889) {
                int var385 = class660.field9184.method2874((byte) -75);
                if (~class660.field9184.method2874((byte) -75) != -1) {
                    --class660.field9184.field6892;
                    class598.field8359[var385] = new class400(class660.field9184);
                } else {
                    class598.field8359[var385] = new class400();
                }
                class417.field5889 = null;
                class261.field3546 = class436.field6066;
                return true;
            } else if (class417.field5889 == class320.field4383) {
                class71.method575(256, class21.field240);
                class417.field5889 = null;
                return true;
            } else if (class622.field8635 == class417.field5889) {
                int var386 = class660.field9184.method2858((byte) -54);
                int var387 = class660.field9184.method2830(1005158663);
                int var388 = class660.field9184.method2842(8);
                int var389 = class660.field9184.method2846((byte) -69);
                if (class125.method901(var389, (byte) -116)) {
                    class197.method1307(var386, (byte) 90, var388, var387);
                }
                class417.field5889 = null;
                return true;
            } else if (class578.field8158 == class417.field5889) {
                int var390 = class660.field9184.method2845(-1);
                if (~var390 == -65536) {
                    var390 = -1;
                }
                int var391 = class660.field9184.method2874((byte) -75);
                int var392 = class660.field9184.method2845(-1);
                int var393 = class660.field9184.method2874((byte) -75);
                int var394 = class660.field9184.method2845(-1);
                class589.method3348(var392, var393, var391, true, var394, var390);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class336.field4513) {
                byte var395 = class660.field9184.method2827(-1655);
                int var396 = class660.field9184.method2843(7592);
                int var397 = class660.field9184.method2867(-2);
                if (class125.method901(var397, (byte) -125)) {
                    class317.method1916(var396, -16042, var395);
                }
                class417.field5889 = null;
                return true;
            } else if (class449.field6165 == class417.field5889) {
                boolean var398 = class660.field9184.method2874((byte) -75) == 1;
                byte[] var399 = new byte[class95.field1338 + -1];
                class660.field9184.method2857(var399, class95.field1338 + -1, (byte) 125, 0);
                class523.method2979(var399, 105, var398);
                class417.field5889 = null;
                return true;
            } else if (class613.field8534 == class417.field5889) {
                int var400 = class660.field9184.method2867(-2);
                int var401 = class660.field9184.method2845(-1);
                int var402 = class660.field9184.method2845(-1);
                int var403 = class660.field9184.method2858((byte) -79);
                if (class125.method901(var402, (byte) -85)) {
                    class554.method3107(10, var403, (var401 << 16) - -var400);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class14.field143) {
                class660.field9184.field6892 += 28;
                if (class660.field9184.method2854(false)) {
                    class209.method1357((byte) 92, class660.field9184, class660.field9184.field6892 + -28);
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class332.field4484) {
                int var404 = class660.field9184.method2874((byte) -75);
                int var405 = class660.field9184.method2845(-1);
                int var406 = class660.field9184.method2845(-1);
                int var407 = class660.field9184.method2840(false);
                if (class125.method901(var405, (byte) -108)) {
                    class685 var408 = (class685) class4.field26.method970((byte) 89, (long) var407);
                    if (var408 != null) {
                        class17.method83(~var408.field9776 != ~var406, var408, -8501, false);
                    }
                    class381.method2192(var407, var406, var404, 1, false);
                }
                class417.field5889 = null;
                return true;
            } else if (class79.field1200 == class417.field5889) {
                int var409 = class660.field9184.method2840(false);
                class166.field2421 = class543.field7374.method764(-117, var409);
                class417.field5889 = null;
                return true;
            } else if (class601.field8383 == class417.field5889) {
                int var410 = class660.field9184.method2871((byte) -87);
                int var411 = class660.field9184.method2840(false);
                int var412 = class660.field9184.method2874((byte) -75);
                String var413 = "";
                String var414 = var413;
                if ((1 & var412) != 0) {
                    var413 = class660.field9184.method2851((byte) -98);
                    if ((2 & var412) != 0) {
                        var414 = class660.field9184.method2851((byte) -75);
                    } else {
                        var414 = var413;
                    }
                }
                String var415 = class660.field9184.method2851((byte) -69);
                if (var410 == 99) {
                    class26.method251(var415, (byte) -66);
                } else {
                    if (!var414.equals("") && class251.method1543(var414, 109)) {
                        class417.field5889 = null;
                        return true;
                    }
                    class628.method3510(var414, -1, var411, var410, var413, var415, var413);
                }
                class417.field5889 = null;
                return true;
            } else if (class498.field6770 == class417.field5889) {
                int var416 = class660.field9184.method2845(-1);
                int var417 = class660.field9184.method2874((byte) -75);
                boolean var418 = ~(1 & var417) == -2;
                while (class95.field1338 > class660.field9184.field6892) {
                    int var419 = class660.field9184.method2871((byte) -87);
                    int var420 = class660.field9184.method2845(-1);
                    int var421 = 0;
                    if (~var420 != -1) {
                        var421 = class660.field9184.method2874((byte) -75);
                        if (~var421 == -256) {
                            var421 = class660.field9184.method2840(false);
                        }
                    }
                    class230.method1450(35, var416, var421, var419, var418, var420 + -1);
                }
                class385.field5461[class136.method950(31, class339.field4547++)] = var416;
                class417.field5889 = null;
                return true;
            } else if (class558.field7511 == class417.field5889) {
                int var422 = class660.field9184.method2867(-2);
                int var423 = class660.field9184.method2846((byte) -69);
                int var424 = class660.field9184.method2867(-2);
                if (class125.method901(var423, (byte) -125)) {
                    class615.method3438(var422, var424, (byte) 47, 0);
                }
                class417.field5889 = null;
                return true;
            } else if (arg0 >= -5) {
                return true;
            } else if (class570.field8095 == class417.field5889) {
                int var425 = class660.field9184.method2845(-1);
                boolean var426 = ~class660.field9184.method2838((byte) -2) == -2;
                if (class125.method901(var425, (byte) -122)) {
                    class501.field6866 = var426;
                }
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 == class289.field3982) {
                class71.method575(256, class206.field2883);
                class417.field5889 = null;
                return true;
            } else if (class417.field5889 != class119.field1604) {
                class413.method2400("T1 - " + (class417.field5889 != null ? class417.field5889.method1337(true) : -1) + "," + (class108.field1503 == null ? -1 : class108.field1503.method1337(true)) + "," + (class687.field9800 == null ? -1 : class687.field9800.method1337(true)) + " - " + class95.field1338, (Throwable) null, (byte) -20);
                class9.method35((byte) -128, false);
                return true;
            } else {
                class260.field3542 = class436.field6066;
                if (~class95.field1338 == -1) {
                    class174.field2525 = null;
                    class389.field5508 = null;
                    class56.field633 = 0;
                    class417.field5889 = null;
                    class347.field4641 = null;
                    return true;
                } else {
                    class389.field5508 = class660.field9184.method2851((byte) -96);
                    boolean var427 = class660.field9184.method2874((byte) -75) == 1;
                    if (var427) {
                        class660.field9184.method2851((byte) -102);
                    }
                    long var428 = class660.field9184.method2849(-2);
                    class347.field4641 = class155.method1107(var428, 0);
                    class538.field7272 = class660.field9184.method2863(90);
                    int var430 = class660.field9184.method2874((byte) -75);
                    if (~var430 == -256) {
                        class417.field5889 = null;
                        return true;
                    } else {
                        class56.field633 = var430;
                        class230[] var431 = new class230[100];
                        for (int var432 = 0; ~class56.field633 < ~var432; ++var432) {
                            var431[var432] = new class230();
                            var431[var432].field3180 = class660.field9184.method2851((byte) -108);
                            boolean var438 = ~class660.field9184.method2874((byte) -75) == -2;
                            if (!var438) {
                                var431[var432].field3181 = var431[var432].field3180;
                            } else {
                                var431[var432].field3181 = class660.field9184.method2851((byte) -84);
                            }
                            var431[var432].field3188 = class430.method2473(15570, var431[var432].field3181);
                            var431[var432].field3184 = class660.field9184.method2845(-1);
                            var431[var432].field3185 = class660.field9184.method2863(118);
                            var431[var432].field3182 = class660.field9184.method2851((byte) -99);
                            if (var431[var432].field3181.equals(class143.field2063.field9693)) {
                                class422.field5935 = var431[var432].field3185;
                            }
                        }
                        boolean var433 = false;
                        int var434 = class56.field633;
                        while (var434 > 0) {
                            boolean var435 = true;
                            --var434;
                            for (int var436 = 0; ~var436 > ~var434; ++var436) {
                                if (var431[var436].field3188.compareTo(var431[var436 - -1].field3188) > 0) {
                                    class230 var437 = var431[var436];
                                    var431[var436] = var431[var436 + 1];
                                    var435 = false;
                                    var431[var436 + 1] = var437;
                                }
                            }
                            if (var435) {
                                break;
                            }
                        }
                        class174.field2525 = var431;
                        class417.field5889 = null;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hca", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method329(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6274;
        if (this.field6264 != null && arg0 != null) {
            int var7 = -(this.field6245.field7977 * arg2 >> 8) + arg1 >> this.field6245.field7830;
            int var8 = arg3 - (this.field6245.field7894 * arg2 >> 8) >> this.field6245.field7830;
            this.field6264.method2170(127, var8, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III[[ZZ)V")
    public final void method327(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method2570(arg2, arg3, arg4, -1, (byte) -96, arg1, arg0);
        ++field6273;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ltw;[I)V")
    public final void method333(class186 arg0, int[] arg1) {
        this.field6240.method1441(new class615(this.field6245, this, arg0, arg1), 0);
        ++field6259;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6246;
        if (~this.field6285 < -1) {
            this.field6245.method3224(1);
            this.field6245.method3177(false, 71);
            this.field6245.method3195((byte) 33, false);
            this.field6245.method3218(false, (byte) -116);
            this.field6245.method3213(false, -118);
            this.field6245.method3237(16015, 0);
            this.field6245.method3238(-7056, -2);
            this.field6245.method3206((class136) null, (byte) 26);
            class295.field4043[11] = 0.0F;
            class295.field4043[3] = 0.0F;
            class295.field4043[7] = 0.0F;
            class295.field4043[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field6245.field7663;
            class295.field4043[15] = 1.0F;
            class295.field4043[0] = (float) arg2 / ((float) super.field441 * 128.0F * (float) this.field6245.field7663);
            class295.field4043[1] = 0.0F;
            class295.field4043[5] = (float) arg2 / ((float) super.field441 * 128.0F * (float) this.field6245.field7789);
            class295.field4043[8] = 0.0F;
            class295.field4043[14] = 0.0F;
            class295.field4043[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6245.field7789) + 1.0F;
            class295.field4043[2] = 0.0F;
            class295.field4043[4] = 0.0F;
            class295.field4043[6] = 0.0F;
            class295.field4043[9] = 0.0F;
            class295.field4043[10] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class295.field4043, 0);
            class295.field4043[10] = 0.0F;
            class295.field4043[6] = 1.0F;
            class295.field4043[5] = 0.0F;
            class295.field4043[7] = 0.0F;
            class295.field4043[12] = 0.0F;
            class295.field4043[0] = 1.0F;
            class295.field4043[2] = 0.0F;
            class295.field4043[3] = 0.0F;
            class295.field4043[15] = 1.0F;
            class295.field4043[9] = 1.0F;
            class295.field4043[4] = 0.0F;
            class295.field4043[14] = 0.0F;
            class295.field4043[1] = 0.0F;
            class295.field4043[8] = 0.0F;
            class295.field4043[11] = 0.0F;
            class295.field4043[13] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class295.field4043, 0);
            if (~(7 & this.field6248) == -1) {
                this.field6245.method3195((byte) 41, false);
            } else {
                this.field6245.method3195((byte) 30, true);
                this.field6245.method3188(false);
            }
            this.field6245.method3208(this.field6277, (byte) -123, this.field6275, this.field6284, this.field6278);
            if (~(this.field6247 * 2) < ~this.field6245.field7899.field6855.length) {
                this.field6245.field7899 = new class340(this.field6247 * 2);
            } else {
                this.field6245.field7899.field6892 = 0;
            }
            int var9 = 0;
            class340 var10 = this.field6245.field7899;
            if (!this.field6245.field7921) {
                for (int var11 = arg4; var11 < arg6; ++var11) {
                    int var12 = super.field446 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field6250[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var15 > ~var14.length; ++var15) {
                                    var10.method2848((byte) -123, 65535 & var14[var15]);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field446 * var16 + arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field6250[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    var10.method2837(var20[var21] & 65535, -2);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class92 var17 = new class92(this.field6245, 5123, var10.field6855, var10.field6892);
                this.field6245.method3235(var9, 0, var17, false, 4);
            }
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)V")
    public final void method319(int arg0, int arg1, int arg2) {
        if (~(this.field6287[arg0][arg1] & 255) > ~arg2) {
            this.field6287[arg0][arg1] = (byte) arg2;
        }
        ++field6269;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method320(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6266;
        if (this.field6264 != null && arg0 != null) {
            int var7 = -(this.field6245.field7977 * arg2 >> 8) + arg1 >> this.field6245.field7830;
            int var8 = -(this.field6245.field7894 * arg2 >> 8) + arg3 >> this.field6245.field7830;
            return this.field6264.method2169(arg0, var7, -87, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/lang/String;ZZZ)V")
    public static final void method2573(String arg0, boolean arg1, boolean arg2, boolean arg3) {
        ++field6272;
        try {
            if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
                class26.method251("commands - This command", (byte) -116);
                class26.method251("cls - Clear console", (byte) -54);
                class26.method251("displayfps - Toggle FPS and other information", (byte) -52);
                class26.method251("renderer - Print graphics renderer information", (byte) -123);
                class26.method251("heap - Print java memory information", (byte) -100);
                return;
            }
            if (arg0.equalsIgnoreCase("cls")) {
                class487.field6692 = 0;
                class286.field3942 = 0;
                return;
            }
            if (arg0.equalsIgnoreCase("displayfps")) {
                class109.field1514 = !class109.field1514;
                if (class109.field1514) {
                    class26.method251("FPS on", (byte) -99);
                    return;
                }
                class26.method251("FPS off", (byte) -55);
                return;
            }
            if (!arg3) {
                return;
            }
            if (arg0.equals("renderer")) {
                class134 var4 = class334.field4506.method151();
                class26.method251("Vendor: " + var4.field1906, (byte) -58);
                class26.method251("Name: " + var4.field1907, (byte) -124);
                class26.method251("Version: " + var4.field1904, (byte) -85);
                class26.method251("Device: " + var4.field1910, (byte) -54);
                class26.method251("Driver Version: " + var4.field1909, (byte) -96);
                return;
            }
            if (arg0.equals("heap")) {
                class26.method251("Heap: " + class651.field9037 + "MB", (byte) -44);
                return;
            }
        } catch (Exception var43) {
            class26.method251(class65.field790.method555(class697.field9900, true), (byte) -74);
            return;
        }
        if (class603.field8404 != class164.field2358 || ~class296.field4060 <= -3) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equals("nativememerror")) {
                throw new OutOfMemoryError("native(MPR");
            }
            try {
                if (arg0.equalsIgnoreCase("printfps")) {
                    class26.method251("FPS: " + class131.field1883, (byte) -77);
                    return;
                }
                if (arg0.equalsIgnoreCase("occlude")) {
                    class539.field7280 = !class539.field7280;
                    if (class539.field7280) {
                        class26.method251("Occlsion now on!", (byte) -108);
                        return;
                    }
                    class26.method251("Occlsion now off!", (byte) -113);
                    return;
                }
                if (arg0.equalsIgnoreCase("fpson")) {
                    class109.field1514 = true;
                    class26.method251("fps debug enabled", (byte) -85);
                    return;
                }
                if (arg0.equalsIgnoreCase("fpsoff")) {
                    class109.field1514 = false;
                    class26.method251("fps debug disabled", (byte) -88);
                    return;
                }
                if (arg0.equals("systemmem")) {
                    try {
                        class26.method251("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb", (byte) -54);
                        return;
                    } catch (Throwable var37) {
                        return;
                    }
                }
                if (arg0.equalsIgnoreCase("cleartext")) {
                    class43.field508.method3905((byte) -113);
                    class26.method251("Text coords cleared", (byte) -114);
                    return;
                }
                if (arg0.equalsIgnoreCase("gc")) {
                    class595.method3363(105);
                    for (int var5 = 0; var5 < 10; ++var5) {
                        System.gc();
                    }
                    Runtime var6 = Runtime.getRuntime();
                    int var7 = (int) ((var6.totalMemory() + -var6.freeMemory()) / 1024L);
                    class26.method251("mem=" + var7 + "k", (byte) -46);
                    return;
                }
                if (arg0.equalsIgnoreCase("compact")) {
                    class595.method3363(99);
                    for (int var8 = 0; ~var8 > -11; ++var8) {
                        System.gc();
                    }
                    Runtime var9 = Runtime.getRuntime();
                    int var10 = (int) ((var9.totalMemory() + -var9.freeMemory()) / 1024L);
                    class26.method251("Memory before cleanup=" + var10 + "k", (byte) -84);
                    class255.method1570(569692233);
                    class595.method3363(102);
                    for (int var11 = 0; var11 < 10; ++var11) {
                        System.gc();
                    }
                    int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                    class26.method251("Memory after cleanup=" + var12 + "k", (byte) -54);
                    return;
                }
                if (arg0.equalsIgnoreCase("unloadnatives")) {
                    class26.method251(class127.method907((byte) -107) ? "Libraries unloaded" : "Library unloading failed!", (byte) -122);
                    return;
                }
                if (arg0.equalsIgnoreCase("clientdrop")) {
                    class26.method251("Dropped client connection", (byte) -57);
                    if (~class285.field3921 == -11) {
                        class455.method2586(arg3);
                        return;
                    }
                    if (class285.field3921 == 11) {
                        class700.field9933 = true;
                    }
                    return;
                }
                if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
                    class651.field9040.method1209(37);
                    class26.method251("Rotated connection methods", (byte) -65);
                    return;
                }
                if (arg0.equalsIgnoreCase("clientjs5drop")) {
                    class654.field9099.method724(true);
                    class26.method251("Dropped client js5 net queue", (byte) -101);
                    return;
                }
                if (arg0.equalsIgnoreCase("serverjs5drop")) {
                    class654.field9099.method725(true);
                    class26.method251("Dropped server js5 net queue", (byte) -73);
                    return;
                }
                if (arg0.equalsIgnoreCase("breakcon")) {
                    class543.field7374.method771(124);
                    class589.field8272.method1934(123);
                    class654.field9099.method735(-53);
                    class26.method251("Breaking new connections for 5 seconds", (byte) -121);
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuild")) {
                    class115.method822(-48);
                    class273.method1694((byte) 108);
                    class26.method251("Rebuilding map", (byte) -127);
                    return;
                }
                if (arg0.equalsIgnoreCase("rebuildprofile")) {
                    class489.field6706 = class577.method3295((byte) 15);
                    class128.field1833 = true;
                    class115.method822(-112);
                    class273.method1694((byte) -102);
                    class26.method251("Rebuilding map (with profiling)", (byte) -115);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm1")) {
                    class75.method584(-1, false, 1, -1, (byte) -128);
                    if (~class317.method1913(1) != -2) {
                        class26.method251("wm1 failed", (byte) -47);
                        return;
                    }
                    class26.method251("wm1 succeeded", (byte) -49);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm2")) {
                    class75.method584(-1, false, 2, -1, (byte) -86);
                    if (~class317.method1913(1) != -3) {
                        class26.method251("wm2 failed", (byte) -128);
                        return;
                    }
                    class26.method251("wm2 succeeded", (byte) -73);
                    return;
                }
                if (arg0.equalsIgnoreCase("wm3")) {
                    class75.method584(768, false, 3, 1024, (byte) 95);
                    if (class317.method1913(1) == 3) {
                        class26.method251("wm3 succeeded", (byte) -87);
                        return;
                    }
                    class26.method251("wm3 failed", (byte) -123);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk0")) {
                    class203.method1327((byte) 63, 0);
                    if (class503.field6917 != 0) {
                        class26.method251("Failed to enter tk0", (byte) -127);
                        return;
                    }
                    class26.method251("Entered tk0", (byte) -75);
                    class366.field4875.field9372 = 0;
                    class366.field4875.method543(class543.field7374, (byte) 86);
                    class186.field2709 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk1")) {
                    class203.method1327((byte) 63, 1);
                    if (~class503.field6917 == -2) {
                        class26.method251("Entered tk1", (byte) -118);
                        class366.field4875.field9372 = 1;
                        class366.field4875.method543(class543.field7374, (byte) 66);
                        class186.field2709 = false;
                        return;
                    }
                    class26.method251("Failed to enter tk1", (byte) -116);
                    return;
                }
                if (arg0.equalsIgnoreCase("tk2")) {
                    class203.method1327((byte) 63, 2);
                    if (class503.field6917 != 2) {
                        class26.method251("Failed to enter tk2", (byte) -87);
                        return;
                    }
                    class26.method251("Entered tk2", (byte) -108);
                    class366.field4875.field9372 = 2;
                    class366.field4875.method543(class543.field7374, (byte) 110);
                    class186.field2709 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk3")) {
                    class203.method1327((byte) 63, 3);
                    if (class503.field6917 != 3) {
                        class26.method251("Failed to enter tk3", (byte) -73);
                        return;
                    }
                    class26.method251("Entered tk3", (byte) -54);
                    class366.field4875.field9372 = 3;
                    class366.field4875.method543(class543.field7374, (byte) 69);
                    class186.field2709 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("tk5")) {
                    class203.method1327((byte) 63, 5);
                    if (~class503.field6917 != -6) {
                        class26.method251("Failed to enter tk5", (byte) -58);
                        return;
                    }
                    class26.method251("Entered tk5", (byte) -74);
                    class366.field4875.field9372 = 5;
                    class366.field4875.method543(class543.field7374, (byte) 63);
                    class186.field2709 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("ot")) {
                    class366.field4875.field9366 = !class366.field4875.field9366;
                    class366.field4875.method543(class543.field7374, (byte) 97);
                    class186.field2709 = false;
                    class115.method822(-36);
                    class26.method251("ot=" + class366.field4875.field9366, (byte) -118);
                    return;
                }
                if (arg0.equalsIgnoreCase("gb")) {
                    class366.field4875.field9356 = !class366.field4875.field9356;
                    class366.field4875.method543(class543.field7374, (byte) 32);
                    class186.field2709 = false;
                    class115.method822(-39);
                    class26.method251("gb=" + class366.field4875.field9356, (byte) -82);
                    return;
                }
                if (arg0.startsWith("shadows")) {
                    if (arg0.length() < 8) {
                        class26.method251("Invalid shadows value", (byte) -126);
                        return;
                    }
                    String var13 = arg0.substring(8);
                    int var14 = !class568.method3250(var13, 10) ? -1 : class214.method1376(0, var13);
                    if (~var14 <= -1 && ~var14 >= -3) {
                        class366.field4875.method3769(var14, true, class503.field6917);
                        class366.field4875.method543(class543.field7374, (byte) 86);
                        class186.field2709 = false;
                        class115.method822(-128);
                        class26.method251("shadows=" + var14, (byte) -93);
                        return;
                    }
                    class26.method251("Invalid shadows value", (byte) -81);
                    return;
                }
                if (arg0.startsWith("textures")) {
                    class366.field4875.field9344 = !class366.field4875.field9344;
                    class366.field4875.method543(class543.field7374, (byte) 106);
                    class186.field2709 = false;
                    class628.method3511((byte) -108);
                    class115.method822(-38);
                    class26.method251("textures=" + class366.field4875.field9344, (byte) -76);
                    return;
                }
                if (arg0.startsWith("lighting")) {
                    class366.field4875.method3771(127, !class366.field4875.method3766(class503.field6917, (byte) -79), class503.field6917);
                    class366.field4875.method543(class543.field7374, (byte) 59);
                    class186.field2709 = false;
                    class127.method906(4096);
                    class628.method3511((byte) -108);
                    class115.method822(-103);
                    class26.method251("lighting=" + class366.field4875.method3766(class503.field6917, (byte) -86), (byte) -43);
                    return;
                }
                if (arg0.startsWith("setba")) {
                    if (arg0.length() < 6) {
                        class26.method251("Invalid buildarea value", (byte) -59);
                        return;
                    }
                    int var15 = class214.method1376(0, arg0.substring(6));
                    if (var15 >= 0 && ~var15 >= ~class27.method262(-97, class651.field9037)) {
                        class366.field4875.field9368 = var15;
                        class366.field4875.method543(class543.field7374, (byte) 63);
                        class186.field2709 = false;
                        class26.method251("maxbuildarea=" + class366.field4875.field9368, (byte) -54);
                        return;
                    }
                    class26.method251("Invalid buildarea value", (byte) -100);
                    return;
                }
                if (arg0.startsWith("rect_debug")) {
                    if (~arg0.length() > -11) {
                        class26.method251("Invalid rect_debug value", (byte) -121);
                        return;
                    }
                    class571.field8104 = class214.method1376(0, arg0.substring(10).trim());
                    class26.method251("rect_debug=" + class571.field8104, (byte) -47);
                    return;
                }
                if (arg0.equalsIgnoreCase("qa_op_test")) {
                    class314.field4339 = true;
                    class26.method251("qa_op_test=" + class314.field4339, (byte) -118);
                    return;
                }
                if (arg0.equalsIgnoreCase("clipcomponents")) {
                    class500.field6795 = !class500.field6795;
                    class26.method251("clipcomponents=" + class500.field6795, (byte) -72);
                    return;
                }
                if (arg0.startsWith("bloom")) {
                    boolean var16 = class334.field4506.method120();
                    if (!class631.method3537(!var16, 123)) {
                        class26.method251("Failed to enable bloom", (byte) -125);
                        return;
                    }
                    if (var16) {
                        class26.method251("Bloom disabled", (byte) -73);
                        return;
                    }
                    class26.method251("Bloom enabled", (byte) -42);
                    return;
                }
                if (arg0.equalsIgnoreCase("tween")) {
                    if (!class553.field7458) {
                        class553.field7458 = true;
                        class26.method251("Forced tweening ENABLED!", (byte) -108);
                        return;
                    }
                    class553.field7458 = false;
                    class26.method251("Forced tweening disabled.", (byte) -98);
                    return;
                }
                if (arg0.equalsIgnoreCase("shiftclick")) {
                    if (!class367.field4945) {
                        class26.method251("Shift-click ENABLED!", (byte) -45);
                        class367.field4945 = true;
                        return;
                    }
                    class26.method251("Shift-click disabled.", (byte) -123);
                    class367.field4945 = false;
                    return;
                }
                if (arg0.equalsIgnoreCase("getcgcoord")) {
                    class26.method251("x:" + (class143.field2063.field4042 >> 9) + " z:" + (class143.field2063.field4047 >> 9), (byte) -103);
                    return;
                }
                if (arg0.equalsIgnoreCase("getheight")) {
                    class26.method251("Height: " + class409.field5812[class143.field2063.field4053].method332(class143.field2063.field4047 >> 9, 1, class143.field2063.field4042 >> 9), (byte) -100);
                    return;
                }
                if (arg0.equalsIgnoreCase("resetminimap")) {
                    class508.field6961.method3646(true);
                    class508.field6961.method3628((byte) -14);
                    class643.field8871.method355(-113);
                    class123.field1685.method3704(-100);
                    class273.method1694((byte) 109);
                    class26.method251("Minimap reset", (byte) -80);
                    return;
                }
                if (arg0.startsWith("mc")) {
                    if (!class334.field4506.method178()) {
                        class26.method251("Current toolkit doesn't support multiple cores", (byte) -95);
                        return;
                    }
                    int var17 = Integer.parseInt(arg0.substring(3));
                    if (~var17 > -2) {
                        var17 = 1;
                    } else if (var17 > 4) {
                        var17 = 4;
                    }
                    class686.field9778 = var17;
                    class115.method822(-78);
                    class26.method251("Render cores now: " + class686.field9778, (byte) -95);
                    return;
                }
                if (arg0.startsWith("cachespace")) {
                    class26.method251("I(s): " + class293.field4024.method3745((byte) 126) + "/" + class293.field4024.method3750((byte) 122), (byte) -76);
                    class26.method251("I(m): " + class462.field6369.method3745((byte) 124) + "/" + class462.field6369.method3750((byte) 124), (byte) -87);
                    class26.method251("O(s): " + class599.field8366.field9991.method1899(true) + "/" + class599.field8366.field9991.method1892(121), (byte) -127);
                    return;
                }
                if (arg0.equalsIgnoreCase("getcamerapos")) {
                    class26.method251("Pos: " + class143.field2063.field4053 + "," + ((class666.field9335 >> 9) + class498.field6774 >> 6) + "," + ((class11.field114 >> 9) - -class613.field8555 >> 6) + "," + ((class666.field9335 >> 9) - -class498.field6774 & 63) + "," + ((class11.field114 >> 9) - -class613.field8555 & 63) + " Height: " + (class249.method1533(class143.field2063.field4053, class11.field114, class666.field9335, -125) + -class441.field6102), (byte) -110);
                    class26.method251("Look: " + class143.field2063.field4053 + "," + (class498.field6774 + class314.field4337 >> 6) + "," + (class613.field8555 + class280.field3834 >> 6) + "," + (63 & class498.field6774 + class314.field4337) + "," + (class613.field8555 + class280.field3834 & 63) + " Height: " + (class249.method1533(class143.field2063.field4053, class280.field3834, class314.field4337, 113) - class50.field591), (byte) -117);
                    return;
                }
                if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                    class108.field1499 = !class108.field1499;
                    class334.field4506.method157(class108.field1499);
                    class577.method3294(24815);
                    class26.method251("showprofiling=" + class108.field1499, (byte) -88);
                    return;
                }
                if (arg0.startsWith("performancetest")) {
                    int var18 = -1;
                    int var19 = 1000;
                    if (arg0.length() > 15) {
                        String[] var20 = class48.method383(arg0, 1, ' ');
                        try {
                            if (~var20.length < -2) {
                                var19 = Integer.parseInt(var20[1]);
                            }
                        } catch (Throwable var39) {
                        }
                        try {
                            if (var20.length > 2) {
                                var18 = Integer.parseInt(var20[2]);
                            }
                        } catch (Throwable var38) {
                        }
                    }
                    if (~var18 == 0) {
                        class26.method251("Java toolkit: " + class659.method3699(var19, 500, 0), (byte) -118);
                        class26.method251("SSE toolkit:  " + class659.method3699(var19, 500, 2), (byte) -52);
                        class26.method251("D3D toolkit:  " + class659.method3699(var19, 500, 3), (byte) -127);
                        class26.method251("GL toolkit:   " + class659.method3699(var19, 500, 1), (byte) -69);
                        class26.method251("GLX toolkit:  " + class659.method3699(var19, 500, 5), (byte) -124);
                        return;
                    }
                    class26.method251("Performance: " + class659.method3699(var19, 500, class503.field6917), (byte) -45);
                    return;
                }
                if (arg0.equals("nonpcs")) {
                    class362.field4773 = !class362.field4773;
                    class26.method251("nonpcs=" + class362.field4773, (byte) -127);
                    return;
                }
                if (arg0.equals("autoworld")) {
                    class64.method545((byte) 93);
                    class26.method251("auto world selected", (byte) -112);
                    return;
                }
                if (arg0.startsWith("switchworld")) {
                    int var21 = Integer.parseInt(arg0.substring(12));
                    class587.method3337(class250.method1540(24510, var21).field3167, 50000, var21);
                    class26.method251("switched", (byte) -50);
                    return;
                }
                if (arg0.equals("getworld")) {
                    class26.method251("w: " + class651.field9040.field2475, (byte) -72);
                    return;
                }
                if (arg0.startsWith("pc")) {
                    class352 var22 = class290.method1786(98, class199.field2836, class115.field1584);
                    var22.field4686.method2817(0, arg3);
                    int var23 = var22.field4686.field6892;
                    int var24 = arg0.indexOf(" ", 4);
                    var22.field4686.method2820(112, arg0.substring(3, var24));
                    class563.method3149(arg0.substring(var24), var22.field4686, (byte) -82);
                    var22.field4686.method2847(-8, -var23 + var22.field4686.field6892);
                    class602.method3388(var22, (byte) 28);
                    return;
                }
                if (arg0.equals("savevarcs")) {
                    class235.method1477(-28971);
                    class26.method251("perm varcs saved", (byte) -83);
                    return;
                }
                if (arg0.equals("scramblevarcs")) {
                    for (int var25 = 0; var25 < class324.field4421.length; ++var25) {
                        if (class588.field8266[var25]) {
                            class324.field4421[var25] = (int) (Math.random() * 99999.0D);
                            if (Math.random() > 0.5D) {
                                class324.field4421[var25] *= -1;
                            }
                        }
                    }
                    class235.method1477(-28971);
                    class26.method251("perm varcs scrambled", (byte) -43);
                    return;
                }
                if (arg0.equals("showcolmap")) {
                    class593.field8303 = true;
                    class273.method1694((byte) -35);
                    class26.method251("colmap is shown", (byte) -111);
                    return;
                }
                if (arg0.equals("hidecolmap")) {
                    class593.field8303 = false;
                    class273.method1694((byte) 119);
                    class26.method251("colmap is hidden", (byte) -76);
                    return;
                }
                if (arg0.equals("resetcache")) {
                    class63.method526(!arg3);
                    class26.method251("Caches reset", (byte) -63);
                    return;
                }
                if (arg0.equals("profilecpu")) {
                    class26.method251(class563.method3153(3439) + "ms", (byte) -42);
                    return;
                }
                if (arg0.startsWith("getclientvarpbit")) {
                    int var26 = Integer.parseInt(arg0.substring(17));
                    class26.method251("varpbit=" + class578.field8156.method870((byte) 116, var26), (byte) -71);
                    return;
                }
                if (arg0.startsWith("getclientvarp")) {
                    int var27 = Integer.parseInt(arg0.substring(14));
                    class26.method251("varp=" + class578.field8156.method869(var27, arg3), (byte) -106);
                    return;
                }
                if (arg0.startsWith("demologin")) {
                    class339.method1985(false, arg3, 0);
                    return;
                }
                if (arg0.startsWith("newdemologin")) {
                    class339.method1985(true, arg3, 0);
                    return;
                }
                if (arg0.startsWith("directlogin")) {
                    String[] var28 = class48.method383(arg0.substring(12), 1, ' ');
                    if (~var28.length <= -3) {
                        int var29 = ~var28.length < -3 ? Integer.parseInt(var28[2]) : 0;
                        class299.method1812(var28[0], var28[1], var29, true);
                        return;
                    }
                }
                if (arg0.startsWith("csprofileclear")) {
                    class97.method702();
                    return;
                }
                if (arg0.startsWith("csprofileoutputc")) {
                    class97.method704(100, false);
                    return;
                }
                if (arg0.startsWith("csprofileoutputt")) {
                    class97.method704(10, true);
                    return;
                }
                if (arg0.startsWith("texsize")) {
                    int var30 = Integer.parseInt(arg0.substring(8));
                    class334.field4506.method187(var30);
                    return;
                }
                if (arg0.equals("soundstreamcount")) {
                    class26.method251("Active streams: " + class61.field680.method1461(), (byte) -99);
                    return;
                }
                if (arg0.equals("autosetup")) {
                    class366.field4875.method533(-36);
                    class26.method251("Complete. Toolkit now: " + class503.field6917, (byte) -39);
                    return;
                }
                if (arg0.equals("errormessage")) {
                    class26.method251(class647.field8937.method1522(-90), (byte) -128);
                    return;
                }
                if (arg0.equals("heapdump")) {
                    if (!class105.field1466.startsWith("win")) {
                        class57.method473((byte) 1, new File("/tmp/heap.dump"), false);
                    } else {
                        class57.method473((byte) 1, new File("C:\\Temp\\heap.dump"), false);
                    }
                    class26.method251("Done", (byte) -76);
                    return;
                }
                if (arg0.equals("os")) {
                    class26.method251("Name: " + class105.field1466, (byte) -75);
                    class26.method251("Arch: " + class105.field1455, (byte) -46);
                    class26.method251("Ver: " + class105.field1478, (byte) -64);
                    return;
                }
                if (arg0.startsWith("w2debug")) {
                    int var31 = Integer.parseInt(arg0.substring(8, 9));
                    class597.field8341 = var31;
                    class115.method822(-91);
                    class26.method251("Toggled!", (byte) -111);
                    return;
                }
                if (arg0.startsWith("setoutput ")) {
                    File var32 = new File(arg0.substring(10));
                    if (var32.exists()) {
                        var32 = new File(arg0.substring(10) + "." + class577.method3295((byte) 15) + ".log");
                        if (var32.exists()) {
                            class26.method251("file already exists!", (byte) -112);
                            return;
                        }
                    }
                    if (class297.field4067 != null) {
                        class297.field4067.close();
                        class297.field4067 = null;
                    }
                    try {
                        class297.field4067 = new FileOutputStream(var32);
                        return;
                    } catch (FileNotFoundException var40) {
                        class26.method251("Could not create " + var32.getName(), (byte) -59);
                        return;
                    } catch (SecurityException var41) {
                        class26.method251("Cannot write to " + var32.getName(), (byte) -85);
                        return;
                    }
                }
                if (arg0.equals("closeoutput")) {
                    if (class297.field4067 != null) {
                        class297.field4067.close();
                    }
                    class297.field4067 = null;
                    return;
                }
                if (arg0.startsWith("runscript ")) {
                    File var33 = new File(arg0.substring(10));
                    if (!var33.exists()) {
                        class26.method251("No such file", (byte) -70);
                        return;
                    }
                    byte[] var34 = class324.method1943(26610, var33);
                    if (var34 == null) {
                        class26.method251("Failed to read file", (byte) -49);
                        return;
                    }
                    String[] var35 = class48.method383(class143.method1006("", class119.method858(var34, 255), '\r', 2), 1, '\n');
                    class57.method478((byte) 70, var35);
                    return;
                }
                if (class285.field3921 == 10) {
                    ++class614.field8579;
                    class352 var36 = class290.method1786(98, class199.field2836, class691.field9858);
                    var36.field4686.method2817(3 + arg0.length(), true);
                    var36.field4686.method2817(!arg2 ? 0 : 1, true);
                    var36.field4686.method2817(arg1 ? 1 : 0, arg3);
                    var36.field4686.method2820(98, arg0);
                    class602.method3388(var36, (byte) 28);
                }
                if (arg0.startsWith("fps ") && class603.field8404 != class164.field2358) {
                    class474.method2667(class214.method1376(0, arg0.substring(4)), (byte) -46);
                    return;
                }
            } catch (Exception var42) {
                class26.method251(class65.field790.method555(class697.field9900, true), (byte) -87);
                return;
            }
        }
        if (class285.field3921 != 10) {
            class26.method251(class65.field791.method555(class697.field9900, true) + arg0, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIIZIIII)V")
    public static final void method2574(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg4) {
            ++field6244;
            if (client.method1683(arg8, (byte) 103)) {
                if (class165.field2412[arg8] == null) {
                    class230.method1453(arg3, false, class167.field2439[arg8], arg7, -1, arg5, arg1, arg6, arg2, arg0);
                } else {
                    class230.method1453(arg3, false, class165.field2412[arg8], arg7, -1, arg5, arg1, arg6, arg2, arg0);
                }
            } else if (arg5 != -1) {
                class130.field1872[arg5] = true;
            } else {
                for (int var9 = 0; ~var9 > -101; ++var9) {
                    class130.field1872[var9] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Llj;IIII[[I[[II)V")
    public class453(class565 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6245 = arg0;
        this.field6267 = super.field447 + -2;
        this.field6243 = new int[arg3][arg4][];
        this.field6251 = new int[arg3][arg4][];
        this.field6283 = new float[super.field446 - -1][super.field438 - -1];
        this.field6250 = new short[arg3 * arg4][];
        this.field6255 = new int[arg3][arg4][];
        this.field6258 = new byte[arg3][arg4];
        this.field6261 = new int[arg3][arg4][];
        this.field6248 = arg2;
        this.field6242 = 1 << this.field6267;
        this.field6287 = new byte[arg3 + 1][arg4 + 1];
        this.field6280 = new float[super.field446 + 1][super.field438 - -1];
        this.field6253 = new class652[arg3][arg4][];
        this.field6281 = new float[super.field446 + 1][super.field438 + 1];
        this.field6271 = new int[arg3][arg4][];
        for (int var9 = 1; ~var9 > ~super.field438; ++var9) {
            for (int var10 = 1; ~var10 > ~super.field446; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + (var11 * var11 - -(var12 * var12)))));
                this.field6280[var10][var9] = (float) var11 * var13;
                this.field6281[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field6283[var10][var9] = (float) var12 * var13;
            }
        }
        this.field6282 = new class139(128);
        if (~(this.field6248 & 16) != -1) {
            this.field6264 = new class378(this.field6245, this);
        }
    }

    @OriginalMember(owner = "client!hca", name = "v", descriptor = "(IILha;)Lha;")
    public final class54 method324(int arg0, int arg1, class54 arg2) {
        ++field6249;
        if (~(this.field6258[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field441 >> this.field6245.field7830;
            class310 var5 = (class310) arg2;
            class310 var6;
            if (var5 != null && var5.method1875(var4, -110, var4)) {
                var6 = var5;
                var5.method1878(-393275152);
            } else {
                var6 = new class310(this.field6245, var4, var4);
            }
            var6.method1877(var4, 0, var4, 0, 71);
            this.method2571(-115, arg1, var6, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hca", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method330(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6262;
        if (this.field6264 != null && arg0 != null) {
            int var7 = -(this.field6245.field7977 * arg2 >> 8) + arg1 >> this.field6245.field7830;
            int var8 = -(this.field6245.field7894 * arg2 >> 8) + arg3 >> this.field6245.field7830;
            this.field6264.method2164(var8, arg0, (byte) 26, var7);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III[[ZZI)V")
    public final void method328(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        this.method2570(arg2, arg3, arg4, arg5, (byte) -119, arg1, arg0);
        ++field6254;
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(III)Z")
    public static final boolean method2575(int arg0, int arg1, int arg2) {
        ++field6252;
        return arg0 != 544 ? false : ~(24 & arg1) != -1 | (arg1 & 544) == 544;
    }
}
