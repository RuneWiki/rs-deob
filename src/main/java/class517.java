import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class517 extends class176 {

    @OriginalMember(owner = "client!le", name = "T", descriptor = "Lrh;")
    private class59 field7121 = new class59();

    @OriginalMember(owner = "client!le", name = "s", descriptor = "Lpea;")
    public class641 field7095;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "[[I")
    private int[][] field7099;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    private int field7088;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "[[B")
    private byte[][] field7107;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "[[[I")
    private int[][][] field7106;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "[[F")
    private float[][] field7125;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "[[[Ltw;")
    private class226[][][] field7103;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "[[S")
    public short[][] field7101;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "[[B")
    private byte[][] field7129;

    @OriginalMember(owner = "client!le", name = "gb", descriptor = "[[F")
    private float[][] field7134;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    private int field7097;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "[[[I")
    public int[][][] field7118;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[[[I")
    private int[][][] field7090;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[[[I")
    public int[][][] field7083;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public int field7110;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "[[[I")
    public int[][][] field7096;

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "[[F")
    private float[][] field7132;

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "Lnj;")
    private class436 field7130;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "Lat;")
    private class600 field7115;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "Z")
    public static boolean field7122 = true;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Lcv;")
    public static class264 field7094 = new class264();

    @OriginalMember(owner = "client!le", name = "ib", descriptor = "[I")
    public static int[] field7136 = new int[50];

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    private int field7104;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    private int field7112;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    private int field7126;

    @OriginalMember(owner = "client!le", name = "db", descriptor = "I")
    private int field7131;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "Lcm;")
    public class158 field7123;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "Lcm;")
    public class158 field7127;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "Lcm;")
    private class158 field7128;

    @OriginalMember(owner = "client!le", name = "hb", descriptor = "Lcm;")
    public class158 field7135;

    @OriginalMember(owner = "client!le", name = "fb", descriptor = "Lav;")
    private class437 field7133;

    // $FF: synthetic field
    @OriginalMember(owner = "client!le", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field7137;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "[Ltw;")
    private class226[] field7124;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "[[[I")
    private int[][][] field7108;

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lpea;IIII[[I[[II)V")
    public class517(class641 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field7095 = arg0;
        this.field7099 = arg5;
        this.field7088 = super.field2212 - 2;
        this.field7107 = new byte[arg3][arg4];
        this.field7106 = new int[arg3][arg4][];
        this.field7125 = new float[super.field2214 + 1][super.field2215 + 1];
        this.field7103 = new class226[arg3][arg4][];
        this.field7101 = new short[arg3 * arg4][];
        this.field7129 = new byte[arg3 - -1][arg4 + 1];
        this.field7134 = new float[super.field2214 - -1][super.field2215 + 1];
        this.field7097 = 1 << this.field7088;
        this.field7118 = new int[arg3][arg4][];
        this.field7090 = new int[arg3][arg4][];
        this.field7083 = new int[arg3][arg4][];
        this.field7110 = arg2;
        this.field7096 = new int[arg3][arg4][];
        this.field7132 = new float[super.field2214 + 1][super.field2215 + 1];
        for (int var9 = 1; ~super.field2215 < ~var9; ++var9) {
            for (int var10 = 1; ~super.field2214 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + arg7 * 4 * arg7 + var12 * var12)));
                this.field7134[var10][var9] = (float) var11 * var13;
                this.field7125[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field7132[var10][var9] = (float) var12 * var13;
            }
        }
        this.field7130 = new class436(128);
        if (~(this.field7110 & 16) != -1) {
            this.field7115 = new class600(this.field7095, this);
        }
    }

    @OriginalMember(owner = "client!le", name = "EA", descriptor = "(III)V")
    public final void method154(int arg0, int arg1, int arg2) {
        ++field7087;
        if (~(255 & this.field7129[arg0][arg1]) > ~arg2) {
            this.field7129[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!le", name = "ba", descriptor = "()V")
    public final void method148() {
        if (this.field7131 > 0) {
            byte[][] var1 = new byte[super.field2214 + 1][super.field2215 + 1];
            for (int var2 = 1; ~var2 > ~super.field2214; ++var2) {
                for (int var103 = 1; ~super.field2215 < ~var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field7129[var2][var103] >> 1) + (this.field7129[var2][var103 - -1] >> 3) + (this.field7129[var2 - 1][var103] >> 2) + (this.field7129[var2][var103 + -1] >> 2) + (this.field7129[var2 + 1][var103] >> 3));
                }
            }
            this.field7124 = new class226[this.field7130.method2505(-5643)];
            this.field7130.method2500(23557, this.field7124);
            for (int var3 = 0; var3 < this.field7124.length; ++var3) {
                this.field7124[var3].method1381(75, this.field7131);
            }
            int var4 = 24;
            if (this.field7108 != null) {
                var4 += 4;
            }
            if ((this.field7110 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field7095.field8944.method1534(this.field7131 * var4, false);
            Stream var6 = new Stream(var5);
            class226[] var7 = new class226[this.field7131];
            int var8 = class20.method114(this.field7131 / 4, (byte) 109);
            if (~var8 > -2) {
                var8 = 1;
            }
            class436 var9 = new class436(var8);
            class226[] var10 = new class226[this.field7126];
            for (int var11 = 0; ~super.field2214 < ~var11; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field2215; ++var30) {
                    if (this.field7118[var11][var30] != null) {
                        class226[] var31 = this.field7103[var11][var30];
                        int[] var32 = this.field7096[var11][var30];
                        int[] var33 = this.field7083[var11][var30];
                        int[] var34 = this.field7090[var11][var30];
                        int[] var35 = this.field7118[var11][var30];
                        int[] var36 = this.field7106 == null ? null : this.field7106[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field7108 != null ? this.field7108[var11][var30] : null;
                        float var38 = this.field7134[var11][var30];
                        float var39 = this.field7125[var11][var30];
                        float var40 = this.field7132[var11][var30];
                        float var41 = this.field7134[var11][var30 + 1];
                        float var42 = this.field7125[var11][var30 + 1];
                        float var43 = this.field7132[var11][var30 - -1];
                        float var44 = this.field7134[var11 + 1][var30 - -1];
                        float var45 = this.field7125[var11 + 1][var30 + 1];
                        float var46 = this.field7132[var11 + 1][var30 - -1];
                        float var47 = this.field7134[var11 + 1][var30];
                        float var48 = this.field7125[var11 + 1][var30];
                        float var49 = this.field7132[var11 + 1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 - -1];
                        int var52 = var1[var11 - -1][var30 + 1] & 255;
                        int var53 = var1[var11 - -1][var30] & 255;
                        int var54 = 0;
                        label337: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class226 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label337;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field7101[super.field2214 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field2212) - -var32[var57];
                            int var59 = (var30 << super.field2212) - -var33[var57];
                            int var60 = var58 >> this.field7088;
                            int var61 = var59 >> this.field7088;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            int var72;
                            float var73;
                            float var74;
                            float var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var69 - var50;
                                var73 = var39;
                                var74 = var40;
                                var75 = var38;
                            } else if (var67 == 0 && super.field2210 == var68) {
                                var72 = var69 - var51;
                                var75 = var41;
                                var74 = var43;
                                var73 = var42;
                            } else if (~super.field2210 == ~var67 && ~super.field2210 == ~var68) {
                                var72 = var69 - var52;
                                var74 = var46;
                                var73 = var45;
                                var75 = var44;
                            } else if (super.field2210 == var67 && ~var68 == -1) {
                                var72 = var69 - var53;
                                var73 = var48;
                                var74 = var49;
                                var75 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field2210;
                                float var77 = (float) var68 / (float) super.field2210;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (-var42 + var45) * var76 + var42;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var73 = (-var79 + var82) * var77 + var79;
                                var75 = (-var78 + var81) * var77 + var78;
                                var74 = (var83 - var80) * var77 + var80;
                                int var84 = var50 - -((-var50 + var53) * var67 >> super.field2212);
                                int var85 = ((var52 - var51) * var67 >> super.field2212) + var51;
                                var72 = var69 - (var84 - -((-var84 + var85) * var68 >> super.field2212));
                            }
                            if (~var62 != 0) {
                                int var86 = (127 & var62) * var72 >> 7;
                                if (var86 >= 2) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class91.field1112[65408 & var62 | var86];
                                if (~(7 & this.field7110) == -1) {
                                    float var87 = this.field7095.field8989[2] * var74 + this.field7095.field8989[0] * var75 + this.field7095.field8989[1] * var73;
                                    var71 = this.field7095.field9004 + var87 * (var87 > 0.0F ? this.field7095.field9000 : this.field7095.field9048);
                                }
                            }
                            class28 var88 = null;
                            if ((this.field7097 + -1 & var58) == 0 && (var59 & this.field7097 + -1) == 0) {
                                var88 = var9.method2506(13, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (var63 & 127) * var72 >> 7;
                                    if (~var90 <= -3) {
                                        if (~var90 < -127) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var89 = class91.field1112[var90 | 65408 & var63];
                                    if ((7 & this.field7110) == 0) {
                                        float var91 = this.field7095.field8989[2] * var74 + this.field7095.field8989[1] * var73 + this.field7095.field8989[0] * var75;
                                        float var92 = this.field7095.field9004 + (var71 > 0.0F ? this.field7095.field9000 : this.field7095.field9048) * var71;
                                        int var93 = (var89 & 16730508) >> 16;
                                        int var94 = var89 >> 8 & 255;
                                        int var95 = var89 & 255;
                                        int var96 = (int) ((float) var93 * var92);
                                        if (var96 >= 0) {
                                            if (~var96 < -256) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        int var98 = (int) ((float) var95 * var92);
                                        if (~var97 <= -1) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (~var98 < -256) {
                                            var98 = 255;
                                        }
                                        var89 = var97 << 8 | var96 << 16 | var98;
                                    }
                                }
                                if (!this.field7095.field8968) {
                                    var6.method1520((float) var58);
                                    var6.method1520((float) (this.method159(var58, var59) - -var64));
                                    var6.method1520((float) var59);
                                    var6.method1526((byte) (var89 >> 16));
                                    var6.method1526((byte) (var89 >> 8));
                                    var6.method1526((byte) var89);
                                    var6.method1526(-1);
                                    var6.method1520((float) var58);
                                    var6.method1520((float) var59);
                                    if (this.field7108 != null) {
                                        var6.method1520((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(7 & this.field7110) != -1) {
                                        var6.method1520(var75);
                                        var6.method1520(var73);
                                        var6.method1520(var74);
                                    }
                                } else {
                                    var6.method1530((float) var58);
                                    var6.method1530((float) (var64 + this.method159(var58, var59)));
                                    var6.method1530((float) var59);
                                    var6.method1526((byte) (var89 >> 16));
                                    var6.method1526((byte) (var89 >> 8));
                                    var6.method1526((byte) var89);
                                    var6.method1526(-1);
                                    var6.method1530((float) var58);
                                    var6.method1530((float) var59);
                                    if (this.field7108 != null) {
                                        var6.method1530((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((this.field7110 & 7) != 0) {
                                        var6.method1530(var75);
                                        var6.method1530(var73);
                                        var6.method1530(var74);
                                    }
                                }
                                var99 = this.field7104++;
                                var56[var57] = (short) var99;
                                if (var62 != -1) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2504(var65, -103, new class396(var56[var57]));
                            } else {
                                var56[var57] = ((class396) var88).field5661;
                                var99 = var56[var57] & 65535;
                                if (~var62 != 0 && var31[var57].field272 < var7[var99].field272) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method1386(var99, var70, var71, 255, var72);
                            }
                            ++this.field7112;
                        }
                    }
                }
            }
            for (int var12 = 0; ~this.field7104 < ~var12; ++var12) {
                class226 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1383(var12, (byte) 125);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field2214; ++var13) {
                for (int var18 = 0; var18 < super.field2215; ++var18) {
                    short[] var19 = this.field7101[super.field2214 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class226 var25 = var7[var22];
                            class226 var26 = var7[var23];
                            class226 var27 = var7[var24];
                            class226 var28 = null;
                            if (var25 != null) {
                                var25.method1388(var18, 65280, var13, var20);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method1388(var18, 65280, var13, var20);
                                if (var28 == null || var28.field272 > var26.field272) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1388(var18, 65280, var13, var20);
                                if (var28 == null || var27.field272 < var28.field272) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1383(var22, (byte) 127);
                                }
                                if (var26 != null) {
                                    var28.method1383(var23, (byte) 127);
                                }
                                if (var27 != null) {
                                    var28.method1383(var24, (byte) 127);
                                }
                                var28.method1388(var18, 65280, var13, var20);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method1523();
            this.field7133 = this.field7095.method3545(var5, var6.method1522(), false, false, var4);
            this.field7127 = new class158(this.field7133, 5126, 3, 0);
            this.field7128 = new class158(this.field7133, 5121, 4, 12);
            byte var14;
            if (this.field7108 == null) {
                var14 = 24;
                this.field7135 = new class158(this.field7133, 5126, 2, 16);
            } else {
                var14 = 28;
                this.field7135 = new class158(this.field7133, 5126, 3, 16);
            }
            if ((7 & this.field7110) != 0) {
                this.field7123 = new class158(this.field7133, 5126, 3, var14);
            }
            long[] var15 = new long[this.field7124.length];
            for (int var16 = 0; var16 < this.field7124.length; ++var16) {
                class226 var17 = this.field7124[var16];
                var15[var16] = var17.field272;
                var17.method1382((byte) 121, this.field7104);
            }
            class624.method3409(var15, -119, this.field7124);
            if (this.field7115 != null) {
                this.field7115.method3324(68);
            }
        } else {
            this.field7115 = null;
        }
        ++field7098;
        this.field7129 = null;
        this.field7096 = this.field7083 = null;
        this.field7108 = null;
        this.field7118 = null;
        this.field7130 = null;
        this.field7090 = null;
        this.field7106 = null;
        this.field7134 = this.field7125 = this.field7132 = null;
        this.field7103 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
    public final void method155(int arg0, int arg1) {
        ++field7120;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZ[[ZII)V")
    private final void method2937(int arg0, int arg1, int arg2, boolean arg3, boolean[][] arg4, int arg5, int arg6) {
        if (this.field7124 != null) {
            int var8 = arg0 + 1 + arg0;
            int var9 = var8 * var8;
            if (this.field7095.field9086.length < var9) {
                this.field7095.field9086 = new int[var9];
            }
            if (~this.field7095.field9078.field1712.length > ~(this.field7112 * 2)) {
                this.field7095.field9078 = new class457(this.field7112 * 2);
            }
            int var10 = -arg0 + arg5;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = arg1 - arg0;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg5 - -arg0;
            if (~(super.field2214 + -1) > ~var14) {
                var14 = super.field2214 + -1;
            }
            int var15 = arg0 + arg1;
            if (~var15 < ~(super.field2215 - 1)) {
                var15 = super.field2215 + -1;
            }
            int var16 = 0;
            int[] var17 = this.field7095.field9086;
            for (int var18 = var10; var14 >= var18; ++var18) {
                boolean[] var24 = arg4[-var11 + var18];
                for (int var25 = var12; var15 >= var25; ++var25) {
                    if (var24[-var13 + var25]) {
                        var17[var16++] = super.field2214 * var25 + var18;
                    }
                }
            }
            if (~arg2 != 0) {
                this.field7095.method3496((float) arg2, arg6 + 31890);
                this.field7095.method3527(false);
            } else {
                this.field7095.method3533((byte) 80);
            }
            this.field7095.method3520((byte) -116, (7 & this.field7110) != 0);
            for (int var19 = 0; var19 < this.field7124.length; ++var19) {
                this.field7124[var19].method1385(var16, var17, true);
            }
            if (!this.field7121.method379(arg6 ^ 31803)) {
                int var20 = this.field7095.field8994;
                int var21 = this.field7095.field8991;
                this.field7095.method2001(0, var21, this.field7095.field8974);
                this.field7095.method3520((byte) -126, false);
                this.field7095.method3505(arg6 + 31021, false);
                this.field7095.method3547(128, true);
                this.field7095.method3530(-2, arg6 + 31678);
                this.field7095.method3553((byte) -111, this.field7095.field9034);
                this.field7095.method3499(7681, 34161, 8448);
                this.field7095.method3525(770, 34166, 0, true);
                this.field7095.method3557(8960, 770, 0, 34167);
                for (class28 var22 = this.field7121.method374((byte) 93); var22 != null; var22 = this.field7121.method372(-20740)) {
                    class285 var23 = (class285) var22;
                    var23.method1713(arg5, (byte) 121, arg1, arg0, arg4);
                }
                this.field7095.method3525(768, 5890, 0, true);
                this.field7095.method3557(8960, 770, 0, 5890);
                this.field7095.method3553((byte) 92, (class254) null);
                this.field7095.method2001(var20, var21, this.field7095.field8974);
            }
            if (this.field7115 != null) {
                this.field7095.method3567((class158) null, 0, this.field7135, this.field7127, (class158) null);
                this.field7115.method3327(arg0, arg4, arg5, arg3, arg1, (byte) 127);
            }
        }
        if (arg6 != -31804) {
            this.method160((class329) null, (int[]) null);
        }
        ++field7119;
    }

    @OriginalMember(owner = "client!le", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method158(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7117;
        if (this.field7115 != null && arg0 != null) {
            int var7 = -(this.field7095.field9016 * arg2 >> 8) + arg1 >> this.field7095.field8939;
            int var8 = -(this.field7095.field8971 * arg2 >> 8) + arg3 >> this.field7095.field8939;
            this.field7115.method3326(var7, arg0, (byte) 117, var8);
        }
    }

    @OriginalMember(owner = "client!le", name = "JA", descriptor = "(II)I")
    public final int method150(int arg0, int arg1) {
        ++field7109;
        return this.field7099[arg0][arg1];
    }

    @OriginalMember(owner = "client!le", name = "sa", descriptor = "(II)I")
    public final int method159(int arg0, int arg1) {
        ++field7084;
        int var3 = arg0 >> super.field2212;
        int var4 = arg1 >> super.field2212;
        if (var3 >= 0 && ~var4 <= -1 && var3 <= super.field2214 + -1 && var4 <= super.field2215 + -1) {
            int var5 = arg0 & super.field2210 + -1;
            int var6 = super.field2210 + -1 & arg1;
            int var7 = (-var5 + super.field2210) * this.field7099[var3][var4] - -(this.field7099[var3 + 1][var4] * var5) >> super.field2212;
            int var8 = (-var5 + super.field2210) * this.field7099[var3][var4 + 1] + this.field7099[var3 + 1][var4 + 1] * var5 >> super.field2212;
            return (super.field2210 - var6) * var7 - -(var6 * var8) >> super.field2212;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method162(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7093;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method153(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method2938(byte arg0) {
        field7136 = null;
        field7094 = null;
        if (arg0 <= 17) {
            field7094 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method153(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field7108 == null) {
            this.field7108 = new int[super.field2214][super.field2215][];
        }
        if (arg3 != null && this.field7106 == null) {
            this.field7106 = new int[super.field2214][super.field2215][];
        }
        ++field7114;
        this.field7096[arg0][arg1] = arg2;
        this.field7083[arg0][arg1] = arg4;
        this.field7118[arg0][arg1] = arg6;
        this.field7090[arg0][arg1] = arg7;
        if (this.field7108 != null) {
            this.field7108[arg0][arg1] = arg5;
        }
        if (this.field7106 != null) {
            this.field7106[arg0][arg1] = arg3;
        }
        class226[] var15 = this.field7103[arg0][arg1] = new class226[arg6.length];
        for (int var16 = 0; ~arg6.length < ~var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
            class28 var19;
            for (var19 = this.field7130.method2506(76, var17); var19 != null; var19 = this.field7130.method2507(-1)) {
                class226 var20 = (class226) var19;
                if (arg8[var16] == var20.field2945 && (float) arg9[var16] == var20.field2955 && ~var20.field2948 == ~arg10 && ~var20.field2954 == ~arg11 && var20.field2936 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class226) var19;
            } else {
                var15[var16] = new class226(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field7130.method2504(var17, -89, var15[var16]);
            }
        }
        if (arg13) {
            this.field7107[arg0][arg1] = (byte) class288.method1722(this.field7107[arg0][arg1], 1);
        }
        if (arg6.length > this.field7126) {
            this.field7126 = arg6.length;
        }
        this.field7131 += arg6.length;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLoa;IB)Lta;")
    public static final class301 method2939(boolean arg0, class689 arg1, int arg2, byte arg3) {
        ++field7092;
        class427 var4 = class570.method3222((byte) -116, arg1, arg2, arg0);
        if (arg3 != 40) {
            return null;
        } else {
            return var4 == null ? null : var4.field5934;
        }
    }

    @OriginalMember(owner = "client!le", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method152(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7113;
        if (this.field7115 != null && arg0 != null) {
            int var7 = -(this.field7095.field9016 * arg2 >> 8) + arg1 >> this.field7095.field8939;
            int var8 = -(this.field7095.field8971 * arg2 >> 8) + arg3 >> this.field7095.field8939;
            this.field7115.method3328(arg0, var8, var7, -123);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7102;
        if (this.field7131 > 0) {
            this.field7095.method3566((byte) -122);
            this.field7095.method3569(false, -32);
            this.field7095.method3520((byte) 122, false);
            this.field7095.method3485((byte) 103, false);
            this.field7095.method3505(-783, false);
            this.field7095.method3547(0, true);
            this.field7095.method3530(-2, -100);
            this.field7095.method3553((byte) -97, (class254) null);
            class442.field6100[11] = 0.0F;
            class442.field6100[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field7095.field8888;
            class442.field6100[5] = (float) arg2 / ((float) super.field2210 * 128.0F * (float) this.field7095.field8920);
            class442.field6100[2] = 0.0F;
            class442.field6100[4] = 0.0F;
            class442.field6100[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7095.field8920;
            class442.field6100[14] = 0.0F;
            class442.field6100[8] = 0.0F;
            class442.field6100[1] = 0.0F;
            class442.field6100[6] = 0.0F;
            class442.field6100[7] = 0.0F;
            class442.field6100[10] = 0.0F;
            class442.field6100[0] = (float) arg2 / ((float) super.field2210 * 128.0F * (float) this.field7095.field8888);
            class442.field6100[15] = 1.0F;
            class442.field6100[9] = 0.0F;
            class442.field6100[3] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class442.field6100, 0);
            class442.field6100[11] = 0.0F;
            class442.field6100[9] = 1.0F;
            class442.field6100[15] = 1.0F;
            class442.field6100[10] = 0.0F;
            class442.field6100[1] = 0.0F;
            class442.field6100[7] = 0.0F;
            class442.field6100[4] = 0.0F;
            class442.field6100[8] = 0.0F;
            class442.field6100[3] = 0.0F;
            class442.field6100[0] = 1.0F;
            class442.field6100[12] = 0.0F;
            class442.field6100[13] = 0.0F;
            class442.field6100[6] = 1.0F;
            class442.field6100[5] = 0.0F;
            class442.field6100[2] = 0.0F;
            class442.field6100[14] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class442.field6100, 0);
            if (~(this.field7110 & 7) != -1) {
                this.field7095.method3520((byte) 83, true);
                this.field7095.method3544(-20051);
            } else {
                this.field7095.method3520((byte) -119, false);
            }
            this.field7095.method3567(this.field7123, 0, this.field7135, this.field7127, this.field7128);
            if (~this.field7095.field9078.field1712.length > ~(this.field7112 * 2)) {
                this.field7095.field9078 = new class457(this.field7112 * 2);
            } else {
                this.field7095.field9078.field1745 = 0;
            }
            int var9 = 0;
            class457 var10 = this.field7095.field9078;
            if (!this.field7095.field8968) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field2214 * var11 - -arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field7101[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    var10.method954(var14[var15] & 65535, -65);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field2214 * var16 - -arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field7101[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    ++var9;
                                    var10.method915(65535 & var20[var21], 1502242504);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class167 var17 = new class167(this.field7095, 5123, var10.field1712, var10.field1745);
                this.field7095.method3497(73, var9, 4, 0, var17);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lhj;[I)V")
    public final void method160(class329 arg0, int[] arg1) {
        this.field7121.method378(new class285(this.field7095, this, arg0, arg1), 31316);
        ++field7086;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III[[ZZ)V")
    public final void method149(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method2937(arg2, arg1, -1, arg4, arg3, arg0, -31804);
        ++field7085;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method156(class451 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7105;
        if (this.field7115 != null && arg0 != null) {
            int var7 = -(this.field7095.field9016 * arg2 >> 8) + arg1 >> this.field7095.field8939;
            int var8 = arg3 - (this.field7095.field8971 * arg2 >> 8) >> this.field7095.field8939;
            return this.field7115.method3329((byte) -124, arg0, var8, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILuh;)V")
    private final void method2940(int arg0, int arg1, int arg2, class441 arg3) {
        ++field7089;
        int[] var5 = this.field7096[arg0][arg2];
        int[] var6 = this.field7083[arg0][arg2];
        int var7 = var5.length;
        if (~var7 < ~this.field7095.field9088.length) {
            this.field7095.field9087 = new int[var7];
            this.field7095.field9088 = new int[var7];
        }
        int[] var8 = this.field7095.field9088;
        int[] var9 = this.field7095.field9087;
        for (int var10 = 0; ~var10 > ~var7; ++var10) {
            var8[var10] = var5[var10] >> this.field7095.field8939;
            var9[var10] = var6[var10] >> this.field7095.field8939;
        }
        int var11 = arg1;
        while (var11 < var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) - (-var13 + var15) * (-var14 + var16) > 0) {
                arg3.method2530(var12, var16, var13, -18765, var17, var14, var15);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V")
    public static final void method2941(int arg0, int arg1, int arg2, int arg3) {
        class651 var4 = class145.field1841[arg0][arg1][arg2];
        if (var4 != null) {
            class249 var5 = var4.field9238;
            class249 var6 = var4.field9234;
            if (var5 != null) {
                var5.field3346 = var5.field3346 * arg3 / (16 << class428.field5949 - 7);
                var5.field3359 = var5.field3359 * arg3 / (16 << class428.field5949 - 7);
            }
            if (var6 != null) {
                var6.field3346 = var6.field3346 * arg3 / (16 << class428.field5949 - 7);
                var6.field3359 = var6.field3359 * arg3 / (16 << class428.field5949 - 7);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)V")
    public static final void method2942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7111;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg3 * arg3;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 - 1) * var11) + var9;
        int var15 = var8 << 2;
        if (arg2 > -127) {
            field7094 = null;
        }
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) - -3) * var10;
        int var18 = ((arg5 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 + -1) * var15;
        if (class609.field8313 <= arg1 && class19.field169 >= arg1) {
            int var21 = class191.method1226(arg3 + arg4, class398.field5676, class298.field3995, 16);
            int var22 = class191.method1226(-arg3 + arg4, class398.field5676, class298.field3995, 16);
            class653.method3620(var21, var22, false, arg0, class319.field4673[arg1]);
        }
        while (~var7 < -1) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var13 += var17;
                    var14 += var19;
                    ++var6;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                ++var6;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var20 -= var15;
            --var7;
            int var23 = -var7 + arg1;
            int var24 = arg1 + var7;
            if (var24 >= class609.field8313 && ~var23 >= ~class19.field169) {
                int var25 = class191.method1226(arg4 + var6, class398.field5676, class298.field3995, 16);
                int var26 = class191.method1226(-var6 + arg4, class398.field5676, class298.field3995, 16);
                if (~var23 <= ~class609.field8313) {
                    class653.method3620(var25, var26, false, arg0, class319.field4673[var23]);
                }
                if (~class19.field169 <= ~var24) {
                    class653.method3620(var25, var26, false, arg0, class319.field4673[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILoa;B)Z")
    public static final boolean method2943(int arg0, class689 arg1, byte arg2) {
        ++field7100;
        int var3 = (class588.field8082 + -104) / 2;
        int var4 = (class12.field113 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var3 + 104 > var6; ++var6) {
            for (int var57 = var4; var4 - -104 > var57; ++var57) {
                for (int var58 = arg0; ~var58 >= -4; ++var58) {
                    if (class548.method3081(var58, var6, var57, arg0, -16623)) {
                        int var59 = var58;
                        if (class313.method2026(var57, 3550, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class1.method1(var59, var57, var6, 7913);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
                var7[var8] = -16777216;
            }
            class419.field5833 = arg1.method1894(var7, 0, 512, 512, 512);
            class290.method1724(true);
            int var9 = -16777216 | (int) (20.0D * Math.random()) - -238 + -10 + (228 - -((int) (20.0D * Math.random())) << 8) + (238 + (int) (20.0D * Math.random()) - 10 << 16);
            int var10 = (-10 + 238 + (int) (20.0D * Math.random()) | -1796079872) << 16;
            int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (8.0D * Math.random()) << 8 | (int) (8.0D * Math.random());
            if (arg2 != 21) {
                field7136 = null;
            }
            boolean[][] var12 = new boolean[class689.field9736 + 1][class689.field9736 - -1];
            for (int var13 = var3; ~var13 > ~(var3 + 104); var13 += class689.field9736) {
                for (int var36 = var4; var4 + 104 > var36; var36 += class689.field9736) {
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = var13;
                    if (~var13 < -1) {
                        var39 = var13 - 1;
                        var37 += 4;
                    }
                    int var40 = var36;
                    if (~var36 < -1) {
                        var40 = var36 - 1;
                    }
                    int var41 = class689.field9736 + var13;
                    if (~var41 > -105) {
                        ++var41;
                    }
                    int var42 = var36 - -class689.field9736;
                    if (var42 < 104) {
                        var38 += 4;
                        ++var42;
                    }
                    arg1.method1908(0, 0, var37 - -(class689.field9736 * 4), class689.field9736 * 4 + var38);
                    arg1.method806(-16777216);
                    for (int var43 = arg0; ~var43 >= -4; ++var43) {
                        for (int var50 = 0; ~class689.field9736 <= ~var50; ++var50) {
                            for (int var56 = 0; class689.field9736 >= var56; ++var56) {
                                var12[var50][var56] = class548.method3081(var43, var39 - -var50, var40 - -var56, arg0, class599.method3320(arg2, -16636));
                            }
                        }
                        class249.field3345[var43].method157(0, 0, 1024, var39, var40, var41, var42, var12);
                        if (!class560.field7635) {
                            for (int var51 = -4; ~class689.field9736 < ~var51; ++var51) {
                                for (int var52 = -4; ~class689.field9736 < ~var52; ++var52) {
                                    int var53 = var13 - -var51;
                                    int var54 = var36 - -var52;
                                    if (var53 >= var3 && var4 <= var54 && class548.method3081(var43, var53, var54, arg0, arg2 + -16644)) {
                                        int var55 = var43;
                                        if (class313.method2026(var54, 3550, var53)) {
                                            var55 = var43 - 1;
                                        }
                                        if (~var55 <= -1) {
                                            class266.method1641(var55, var51 * 4 + var37, var9, (byte) -52, var54, (-var52 + class689.field9736) * 4 + var38 + -4, arg1, var53, var10);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class560.field7635) {
                        class245 var44 = class624.field8489[arg0];
                        for (int var45 = 0; class689.field9736 > var45; ++var45) {
                            for (int var46 = 0; var46 < class689.field9736; ++var46) {
                                int var47 = var13 - -var45;
                                int var48 = var36 - -var46;
                                int var49 = var44.field3300[-var44.field3312 + var47][-var44.field3308 + var48];
                                if ((var49 & 1076101120) != 0) {
                                    arg1.method3811((-var46 + class689.field9736) * 4 + var38 + -4, 4, 4, var45 * 4 + var37, -1713569622, arg2 + 22);
                                } else if (~(8388608 & var49) == -1) {
                                    if (~(var49 & 33554432) == -1) {
                                        if ((var49 & 134217728) == 0) {
                                            if (~(536870912 & var49) != -1) {
                                                arg1.method3815(var45 * 4 + var37, arg2 + -82, (class689.field9736 - var46) * 4 + var38 + -4, -1713569622, 4);
                                            }
                                        } else {
                                            arg1.method3814(1, 4, (-var46 + class689.field9736) * 4 - 4 + var38 + 3, -1713569622, var45 * 4 + var37);
                                        }
                                    } else {
                                        arg1.method3815(var37 - (-(var45 * 4) - 3), arg2 ^ -91, (-var46 + class689.field9736) * 4 + var38 + -4, -1713569622, 4);
                                    }
                                } else {
                                    arg1.method3814(1, 4, var38 - -((-var46 + class689.field9736) * 4) + -4, -1713569622, var45 * 4 + var37);
                                }
                            }
                        }
                    }
                    arg1.method1926(var37, var38, class689.field9736 * 4, class689.field9736 * 4, var11, 2);
                    class419.field5833.method68((-var3 + var13) * 4 + 48, 464 - ((-var4 + var36) * 4 + class689.field9736 * 4), class689.field9736 * 4, class689.field9736 * 4, var37, var38);
                }
            }
            arg1.method1984();
            arg1.method806(-16777215);
            class578.method3251((byte) 98);
            class689.field9737 = 0;
            class55.field780.method365(-1);
            if (!class560.field7635) {
                for (int var14 = var3; var14 < var3 + 104; ++var14) {
                    for (int var20 = var4; ~(var4 + 104) < ~var20; ++var20) {
                        for (int var21 = arg0; arg0 + 1 >= var21 && var21 <= 3; ++var21) {
                            if (class548.method3081(var21, var14, var20, arg0, -16623)) {
                                class289 var22 = (class289) class618.method3391(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class289) class609.method3354(var21, var14, var20, field7137 != null ? field7137 : (field7137 = method2945("dda")));
                                }
                                if (var22 == null) {
                                    var22 = (class289) class147.method997(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class289) class7.method44(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class252 var23 = class578.field7980.method1746(var22.method130(-5582), (byte) 127);
                                    if (!var23.field3433 || class624.field8492) {
                                        int var24 = var23.field3411;
                                        if (var23.field3391 != null) {
                                            for (int var25 = 0; ~var23.field3391.length < ~var25; ++var25) {
                                                if (var23.field3391[var25] != -1) {
                                                    class252 var26 = class578.field7980.method1746(var23.field3391[var25], (byte) 99);
                                                    if (var26.field3411 >= 0) {
                                                        var24 = var26.field3411;
                                                    }
                                                }
                                            }
                                        }
                                        if (~var24 <= -1) {
                                            boolean var27 = false;
                                            if (~var24 <= -1) {
                                                class679 var28 = class665.field9460.method218(var24, (byte) 13);
                                                if (var28 != null && var28.field9615) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class624.field8489[var21].field3300;
                                                int var32 = class624.field8489[var21].field3312;
                                                int var33 = class624.field8489[var21].field3308;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (Math.random() * 4.0D);
                                                    if (var35 == 0 && ~var3 > ~var29 && ~(var14 + -3) > ~var29 && (var31[var29 + -1 + -var32][var30 - var33] & 2883848) == 0) {
                                                        --var29;
                                                    }
                                                    if (~var35 == -2 && ~var29 > ~(var3 + 104 + -1) && ~var29 > ~(var14 + 3) && (var31[var29 - (-1 - -var32)][-var33 + var30] & 2883968) == 0) {
                                                        ++var29;
                                                    }
                                                    if (~var35 == -3 && ~var4 > ~var30 && var30 > var20 - 3 && ~(2883842 & var31[-var32 + var29][-1 - var33 + var30]) == -1) {
                                                        --var30;
                                                    }
                                                    if (var35 == 3 && ~var30 > ~(var4 + 104 - 1) && ~(var20 + 3) < ~var30 && ~(var31[var29 - var32][var30 + 1 - var33] & 2883872) == -1) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class109.field1315[class689.field9737] = var23.field3456;
                                            class99.field1211[class689.field9737] = var29;
                                            class189.field2469[class689.field9737] = var30;
                                            ++class689.field9737;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class204.field2673 != null) {
                    class119.field1528.field1989 = 1;
                    class665.field9460.method219(1024, (byte) -127, 64);
                    for (int var15 = 0; var15 < class204.field2673.field8319; ++var15) {
                        int var16 = class204.field2673.field8318[var15];
                        if (var16 >> 28 == class596.field8164.field3925) {
                            int var17 = ((var16 & 268430812) >> 14) - class253.field3490;
                            int var18 = (var16 & 16383) - class186.field2280;
                            if (~var17 <= -1 && ~class588.field8082 < ~var17 && var18 >= 0 && ~var18 > ~class12.field113) {
                                class55.field780.method378(new class360(var15), 31316);
                            } else {
                                class679 var19 = class665.field9460.method218(class204.field2673.field8320[var15], (byte) 13);
                                if (var19.field9641 != null && var19.field9635 + var17 >= 0 && ~class588.field8082 < ~(var19.field9647 + var17) && ~(var19.field9640 + var18) <= -1 && ~class12.field113 < ~(var19.field9646 + var18)) {
                                    class55.field780.method378(new class360(var15), 31316);
                                }
                            }
                        }
                    }
                    class665.field9460.method219(128, (byte) -127, 64);
                    class119.field1528.field1989 = 2;
                    class119.field1528.method1060(arg2 + -134);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(IILw;)Lw;")
    public final class451 method147(int arg0, int arg1, class451 arg2) {
        ++field7116;
        if (~(this.field7107[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field2210 >> this.field7095.field8939;
            class441 var5 = (class441) arg2;
            class441 var6;
            if (var5 != null && var5.method2532(var4, 113, var4)) {
                var6 = var5;
                var5.method2531(-830803984);
            } else {
                var6 = new class441(this.field7095, var4, var4);
            }
            var6.method2527(0, var4, 100, 0, var4);
            this.method2940(arg0, 0, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
    public static final void method2944(byte arg0) {
        if (arg0 != 25) {
            field7122 = true;
        }
        ++field7091;
        if (~class335.field4936 != -1) {
            try {
                if (~(++class598.field8179) < -2001) {
                    if (class80.field1014 != null) {
                        class80.field1014.method971(3289650);
                        class80.field1014 = null;
                    }
                    if (~class80.field1018 <= -3) {
                        class335.field4936 = 0;
                        class235.field3071 = -5;
                        return;
                    }
                    class225.field2934.method3726(arg0 + -88);
                    ++class80.field1018;
                    class598.field8179 = 0;
                    class335.field4936 = 1;
                }
                if (~class335.field4936 == -2) {
                    class78.field975 = class225.field2934.method3729(arg0 + -117, class495.field6687);
                    class335.field4936 = 2;
                }
                if (~class335.field4936 == -3) {
                    if (~class78.field975.field3773 == -3) {
                        throw new IOException();
                    }
                    if (~class78.field975.field3773 != -2) {
                        return;
                    }
                    class80.field1014 = class313.method2028((Socket) class78.field975.field3772, arg0 + -2618, 5000);
                    class78.field975 = null;
                    class80.field1014.method969(class253.field3491.field1712, 0, -11679, class253.field3491.field1745);
                    class335.field4936 = 4;
                }
                if (~class335.field4936 == -5) {
                    if (!class80.field1014.method965((byte) 110, 1)) {
                        return;
                    }
                    class80.field1014.method964(class164.field2068.field1712, 1, 65, 0);
                    int var1 = class164.field2068.field1712[0] & 255;
                    if (var1 != 21) {
                        class335.field4936 = 0;
                        class235.field3071 = var1;
                        class80.field1014.method971(3289650);
                        class80.field1014 = null;
                        return;
                    }
                    class335.field4936 = 5;
                }
                if (class335.field4936 == 5) {
                    if (!class80.field1014.method965((byte) -11, 1)) {
                        return;
                    }
                    class80.field1014.method964(class164.field2068.field1712, 1, arg0 + 50, 0);
                    class335.field4936 = 6;
                    class168.field2102 = new String[class164.field2068.field1712[0] & 255];
                }
                if (~class335.field4936 == -7) {
                    if (class80.field1014.method965((byte) -15, class168.field2102.length * 8)) {
                        class164.field2068.field1745 = 0;
                        class80.field1014.method964(class164.field2068.field1712, class168.field2102.length * 8, 93, 0);
                        for (int var2 = 0; ~class168.field2102.length < ~var2; ++var2) {
                            class168.field2102[var2] = class98.method538(class164.field2068.method949(120), 64);
                        }
                        class335.field4936 = 0;
                        class235.field3071 = 21;
                        class80.field1014.method971(3289650);
                        class80.field1014 = null;
                    }
                }
            } catch (IOException var3) {
                if (class80.field1014 != null) {
                    class80.field1014.method971(3289650);
                    class80.field1014 = null;
                }
                if (class80.field1018 < 2) {
                    class225.field2934.method3726(-95);
                    ++class80.field1018;
                    class598.field8179 = 0;
                    class335.field4936 = 1;
                } else {
                    class335.field4936 = 0;
                    class235.field3071 = -4;
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2945(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
